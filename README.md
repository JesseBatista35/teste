# =============================================================================
# Solution: iOS Deploy — TestFlight manual
# =============================================================================
# Orquestra os workflow-jobs single-job:
#   resolve-identity → resolve-binaries ∥ check-gate
#     → sast ∥ sonar (apenas se o gate ainda não passou no commit)
#     → build → test → hardening (opt DES / obrig PLT+PRD) → distribute
#
# Uso:
#   uses: CAIXAPLATFORM/github-solutions/.github/workflows/ios--deploy.yaml@main
#   with:
#     ref: develop
#     version: "1.92.0"
#   secrets: inherit
# =============================================================================

name: "iOS Deploy"

concurrency:
  group: "ios-${{ inputs.environment }}-${{ github.repository }}-${{ inputs.version }}"
  cancel-in-progress: false

on:
  workflow_call:
    inputs:
      project-root:
        description: "Diretório do projeto relativo à raiz do repositório."
        required: false
        type: string
        default: "."
      ref:
        description: "Branch de origem do deploy."
        required: true
        type: string
      ref-policy:
        description: "Política de ref: branch-allowlist, fgts-des-work-branch ou any-branch."
        required: false
        type: string
        default: "branch-allowlist"
      allowed-deploy-branches:
        description: "Branches permitidas para deploy, separadas por vírgula."
        required: false
        type: string
        default: "develop,main"
      version:
        description: "Versão de marketing (ex: 1.92.0)."
        required: true
        type: string
      build-number:
        description: "Número sequencial de build. Vazio para calcular automaticamente."
        required: false
        type: string
        default: ""
      build-base:
        description: >
          Novo sequencial desejado do release (inteiro positivo, ex: 453). Quando
          informado, tem precedência sobre build-number: a plataforma deriva uma
          única vez o número final do ambiente (N.1 em DES, N.2 em PLT, N.3 em
          PRD) e o usa como fonte única.
        required: false
        type: string
        default: ""
      build-number-format:
        description: >
          Formato do build number: seq-env (N.ambiente) ou env-seq (ambiente.N).
          Vazio usa vars.IOS_BUILD_NUMBER_FORMAT.
        required: false
        type: string
        default: ""
      dry-run:
        description: >
          Quando true, a solution executa build, validações e inspeção do IPA,
          mas NÃO chama os workflow-jobs de hardening e distribuição. Nenhuma
          action autentica no Appdome ou no App Store Connect.
        required: false
        type: boolean
        default: false
      build-number-strategy:
        description: >
          Estratégia de build number: manual (número explícito) ou testflight-query (consulta ASC).
          Vazio usa vars.IOS_BUILD_NUMBER_STRATEGY ou o default testflight-query.
        required: false
        type: string
        default: ""
      environment:
        description: "Ambiente de destino (DES, PLT, PRD)."
        required: false
        type: string
        default: "DES"
      xcode-version:
        description: "Versão major.minor do Xcode."
        required: false
        type: string
        default: ""
      xcode-workspace:
        description: "Caminho do workspace (*.xcworkspace)."
        required: false
        type: string
        default: ""
      xcode-scheme:
        description: "Scheme do Xcode."
        required: false
        type: string
        default: ""
      test-scheme:
        description: "Scheme de testes. Vazio mantém fallback para xcode-scheme em callers antigos."
        required: false
        type: string
        default: ""
      pre-build-script:
        description: "Caminho relativo para script de pré-build."
        required: false
        type: string
        default: ""
      extra-xcargs:
        description: "Build settings adicionais para xcodebuild (ex: UNICO_API_KEY=xxx)."
        required: false
        type: string
        default: ""
      private-pods:
        description: "Habilita acesso a repositórios privados CocoaPods."
        required: false
        type: boolean
        default: false
      enable-cocoa-debug:
        description: "Habilitar CocoaDebug no ambiente de Piloto."
        required: false
        type: boolean
        default: false
      # --- Hardening (Appdome) ---
      enable-hardening:
        description: >
          Habilita hardening Appdome. Obrigatório em PLT/PRD (forçado pelo pipeline),
          opcional em DES (default false).
        required: false
        type: boolean
        default: false
      resign-mode:
        description: "Modo de re-assinatura pós-Appdome: auto (fastlane sigh) ou manual."
        required: false
        type: string
        default: "auto"
      # --- Testes ---
      skip-tests:
        description: "Pula a etapa de compilação e teste unitário."
        required: false
        type: boolean
        default: false
      # --- Distribuição ---
      upload-method:
        description: >
          Método de upload para TestFlight: auto, api-key, apple-id, altool.
        required: false
        type: string
        default: "auto"
      testflight-groups:
        description: "Grupos TestFlight CSV. Vazio usa vars.IOS_TESTFLIGHT_GROUPS do environment."
        required: false
        type: string
        default: ""
      testflight-restricted-group:
        description: "Grupo TestFlight restrito. Vazio usa vars.IOS_TESTFLIGHT_RESTRICT_GROUP do environment."
        required: false
        type: string
        default: ""
      restrict-distribution:
        description: "Forçar distribuição para o grupo restrito."
        required: false
        type: boolean
        default: false
      changelog:
        description: "Texto What to Test / changelog do build no TestFlight."
        required: false
        type: string
        default: ""
      skip-waiting-for-build-processing:
        description: "Pular espera de processamento do build no App Store Connect."
        required: false
        type: string
        default: "true"
      # --- Signing (transitório — será removido após migração para AKV+OIDC) ---
      use-legacy-signing-secrets:
        description: "Usar secrets base64 em vez do Key Vault."
        required: false
        type: boolean
        default: false
      signing-config-script:
        description: "Caminho do script de assinatura no repo do app."
        required: false
        type: string
        default: ""
      signing-team-id:
        description: "DEVELOPMENT_TEAM Apple."
        required: false
        type: string
        default: ""
      signing-profile-app:
        description: "Nome do perfil de provisionamento do app."
        required: false
        type: string
        default: ""
      signing-profile-app-uuid:
        description: "UUID do perfil de provisionamento do app."
        required: false
        type: string
        default: ""
      signing-profile-widget:
        description: "Nome do perfil de provisionamento do widget."
        required: false
        type: string
        default: ""
      signing-code-sign-identity:
        description: "Identidade de assinatura (ex: iPhone Distribution)."
        required: false
        type: string
        default: ""
      bundle-identifier:
        description: "Bundle ID do app (ex: br.gov.caixa.tem)."
        required: false
        type: string
        default: ""
      sonar-project-key:
        description: "Chave do projeto no SonarQube."
        required: false
        type: string
        default: ""

    secrets:
      SD_KEY_BIOMETRIA:
        description: "Chave opcional de biometria encaminhada somente ao build."
        required: false

permissions:
  contents: read
  pull-requests: read
  id-token: write
  attestations: write
  actions: read
  security-events: write

jobs:
  resolve-identity:
    name: "Identidade"
    uses: CAIXAPLATFORM/github-workflow-jobs/.github/workflows/shared--resolve-identity.yaml@main
    with:
      environment: ${{ inputs.environment }}
    secrets: inherit

  resolve-binaries:
    name: "Binários do Podfile"
    needs: [resolve-identity]
    uses: CAIXAPLATFORM/github-workflow-jobs/.github/workflows/ios--resolve-binaries.yaml@main
    with:
      project-root: ${{ inputs.project-root }}
      app-name: ${{ needs.resolve-identity.outputs.app-name }}
      ref: ${{ inputs.ref }}
    secrets: inherit

  derive-build-number:
    name: "Derivar Build Number"
    needs: [resolve-identity]
    if: inputs.build-base != ''
    uses: CAIXAPLATFORM/github-workflow-jobs/.github/workflows/ios--derive-build-number.yaml@main
    with:
      build-base: ${{ inputs.build-base }}
      environment: ${{ inputs.environment }}
      build-number-format: ${{ inputs.build-number-format }}
    secrets: inherit

  check-gate:
    name: "Gate já aprovado?"
    needs: [resolve-identity]
    uses: CAIXAPLATFORM/github-workflow-jobs/.github/workflows/quality--check-gate.yaml@main
    with:
      ref: ${{ inputs.ref }}
      ref-policy: ${{ inputs.ref-policy }}
      allowed-branches: ${{ inputs.allowed-deploy-branches }}
      build-number: ${{ inputs.build-number }}
    secrets: inherit

  sast:
    name: "CodeQL (SAST)"
    needs: [resolve-identity, check-gate]
    if: needs.check-gate.outputs.quality-passed != 'true'
    uses: CAIXAPLATFORM/github-workflow-jobs/.github/workflows/security--sast.yaml@main
    with:
      project-root: ${{ inputs.project-root }}
      app-name: ${{ needs.resolve-identity.outputs.app-name }}
      ref: ${{ needs.check-gate.outputs.commit-sha }}
      environment: ${{ inputs.environment }}
      xcode-workspace: ${{ inputs.xcode-workspace }}
      xcode-scheme: ${{ inputs.xcode-scheme }}
      xcode-version: ${{ inputs.xcode-version }}
      pre-build-script: ${{ inputs.pre-build-script }}
      private-pods: ${{ inputs.private-pods }}
      build-identifier: "${{ inputs.version }}.${{ needs.check-gate.outputs.commit-sha }}"
    secrets: inherit

  sonar:
    name: "SonarQube (Qualidade)"
    needs: [resolve-identity, check-gate]
    if: needs.check-gate.outputs.quality-passed != 'true'
    uses: CAIXAPLATFORM/github-workflow-jobs/.github/workflows/security--sonar.yaml@main
    with:
      app-name: ${{ needs.resolve-identity.outputs.app-name }}
      ref: ${{ needs.check-gate.outputs.commit-sha }}
      build-identifier: "${{ inputs.version }}.${{ needs.check-gate.outputs.commit-sha }}"
    secrets: inherit

  build:
    name: "Build Assinado"
    needs: [resolve-identity, resolve-binaries, derive-build-number, check-gate, sast, sonar]
    if: always() && !failure() && !cancelled()
    uses: CAIXAPLATFORM/github-workflow-jobs/.github/workflows/ios--build.yaml@main
    with:
      project-root: ${{ inputs.project-root }}
      app-name: ${{ needs.resolve-identity.outputs.app-name }}
      ref: ${{ inputs.ref }}
      environment: ${{ inputs.environment }}
      version: ${{ inputs.version }}
      build-number: ${{ needs.derive-build-number.outputs.build-number || inputs.build-number }}
      # Com build-base informado, o número derivado é a fonte única e segue
      # pelo resolver em modo manual, sem consulta ASC.
      build-number-strategy: ${{ inputs.build-base != '' && 'manual' || (inputs.build-number-strategy || vars.IOS_BUILD_NUMBER_STRATEGY || 'testflight-query') }}
      # Paridade com o legado: fora de PRD o build fica restrito a
      # testadores internos do TestFlight (testFlightInternalTestingOnly).
      testflight-internal-only: ${{ inputs.environment != 'PRD' }}
      xcode-version: ${{ inputs.xcode-version }}
      xcode-workspace: ${{ inputs.xcode-workspace }}
      xcode-scheme: ${{ inputs.xcode-scheme }}
      bundle-identifier: ${{ inputs.bundle-identifier }}
      pre-build-script: ${{ inputs.pre-build-script }}
      extra-xcargs: ${{ inputs.extra-xcargs }}
      binaries-artifact: ${{ needs.resolve-binaries.outputs.has-binaries == 'true' && needs.resolve-binaries.outputs.artifact-name || '' }}
      use-legacy-signing-secrets: ${{ inputs.use-legacy-signing-secrets }}
      signing-config-script: ${{ inputs.signing-config-script }}
      signing-team-id: ${{ inputs.signing-team-id }}
      signing-profile-app: ${{ inputs.signing-profile-app }}
      signing-profile-app-uuid: ${{ inputs.signing-profile-app-uuid }}
      signing-profile-widget: ${{ inputs.signing-profile-widget }}
      signing-code-sign-identity: ${{ inputs.signing-code-sign-identity }}
      private-pods: ${{ inputs.private-pods }}
      enable-cocoa-debug: ${{ inputs.enable-cocoa-debug }}
      clean-install: true
    secrets: inherit

  test:
    name: "Compilação e Teste"
    needs: [resolve-identity, build]
    if: always() && !failure() && !cancelled() && inputs.skip-tests != true
    uses: CAIXAPLATFORM/github-workflow-jobs/.github/workflows/ios--build-and-test.yaml@main
    with:
      project-root: ${{ inputs.project-root }}
      app-name: ${{ needs.resolve-identity.outputs.app-name }}
      ref: ${{ inputs.ref }}
      environment: ${{ inputs.environment }}
      xcode-workspace: ${{ inputs.xcode-workspace }}
      xcode-scheme: ${{ inputs.xcode-scheme }}
      test-scheme: ${{ inputs.test-scheme }}
      xcode-version: ${{ inputs.xcode-version }}
      pre-build-script: ${{ inputs.pre-build-script }}
      private-pods: ${{ inputs.private-pods }}
    secrets: inherit

  inspect:
    name: "Inspecionar IPA"
    needs: [resolve-identity, derive-build-number, check-gate, build, test]
    if: always() && !failure() && !cancelled() && inputs.dry-run == true
    uses: CAIXAPLATFORM/github-workflow-jobs/.github/workflows/ios--ipa-inspect.yaml@main
    with:
      project-root: ${{ inputs.project-root }}
      app-name: ${{ needs.resolve-identity.outputs.app-name }}
      ipa-artifact: ${{ needs.build.outputs.ipa-artifact }}
      expected-build-number: ${{ needs.derive-build-number.outputs.build-number }}
      expected-marketing-version: ${{ inputs.version }}
    secrets: inherit

  # Em dry-run a solution NÃO chama hardening nem distribute em modo real: o
  # bloqueio dos efeitos externos é estrutural, não uma flag de simulação nas
  # actions.
  #
  # Os dois jobs abaixo chamam os MESMOS workflow-jobs em resolve-only, que
  # executa só as etapas sem efeito externo — integridade do IPA, keychain de
  # assinatura, credenciais do Appdome, caminho do IPA, grupos e método de
  # upload. É a mesma lógica do deploy real, não uma cópia que pode divergir.
  hardening-check:
    name: "Checagem de hardening (dry-run)"
    needs: [resolve-identity, build, test]
    if: >-
      always() && !failure() && !cancelled() && inputs.dry-run == true &&
      (inputs.enable-hardening == true || inputs.environment != 'DES')
    uses: CAIXAPLATFORM/github-workflow-jobs/.github/workflows/ios--hardening.yaml@main
    with:
      resolve-only: true
      project-root: ${{ inputs.project-root }}
      app-name: ${{ needs.resolve-identity.outputs.app-name }}
      environment: ${{ inputs.environment }}
      ipa-artifact: ${{ needs.build.outputs.ipa-artifact }}
      ipa-sha256: ${{ needs.build.outputs.ipa-sha256 }}
      resign-mode: ${{ inputs.resign-mode }}
      use-legacy-signing-secrets: ${{ inputs.use-legacy-signing-secrets }}
      signing-team-id: ${{ inputs.signing-team-id }}
      signing-profile-app: ${{ inputs.signing-profile-app }}
      signing-profile-widget: ${{ inputs.signing-profile-widget }}
      signing-code-sign-identity: ${{ inputs.signing-code-sign-identity }}
    secrets: inherit

  distribute-check:
    name: "Checagem de distribuição (dry-run)"
    needs: [resolve-identity, derive-build-number, check-gate, build, test]
    if: always() && !failure() && !cancelled() && inputs.dry-run == true
    uses: CAIXAPLATFORM/github-workflow-jobs/.github/workflows/ios--distribute.yaml@main
    with:
      resolve-only: true
      project-root: ${{ inputs.project-root }}
      app-name: ${{ needs.resolve-identity.outputs.app-name }}
      environment: ${{ inputs.environment }}
      version: ${{ inputs.version }}
      build-number: ${{ needs.derive-build-number.outputs.build-number || inputs.build-number }}
      # Em dry-run não existe artefato hardenizado: a checagem roda sobre o IPA
      # do build, que é o mesmo insumo do deploy real quando o seal está off.
      ipa-artifact: ${{ needs.build.outputs.ipa-artifact }}
      bundle-identifier: ${{ inputs.bundle-identifier }}
      upload-method: ${{ inputs.upload-method }}
      groups: ${{ inputs.testflight-groups || vars.IOS_TESTFLIGHT_GROUPS }}
      restricted-group: ${{ inputs.testflight-restricted-group || vars.IOS_TESTFLIGHT_RESTRICT_GROUP }}
      restrict-distribution: ${{ inputs.restrict-distribution || (inputs.enable-cocoa-debug && inputs.environment == 'PLT') }}
      changelog: ${{ inputs.changelog }}
      skip-waiting-for-build-processing: ${{ inputs.skip-waiting-for-build-processing }}
    secrets: inherit

  dry-run-plan:
    name: "Plano de Dry-run"
    needs: [derive-build-number, check-gate, build, inspect, hardening-check, distribute-check]
    if: always() && !failure() && !cancelled() && inputs.dry-run == true
    uses: CAIXAPLATFORM/github-workflow-jobs/.github/workflows/ios--dry-run-plan.yaml@main
    with:
      environment: ${{ inputs.environment }}
      marketing-version: ${{ inputs.version }}
      build-number: ${{ needs.derive-build-number.outputs.build-number || inputs.build-number }}
      bundle-identifier: ${{ inputs.bundle-identifier }}
      ipa-sha256: ${{ needs.build.outputs.ipa-sha256 }}
      # Método resolvido pela checagem — não o input cru, que só declara intenção.
      upload-method: ${{ needs.distribute-check.outputs.resolved-mode || inputs.upload-method }}
      hardening-would-run: ${{ inputs.enable-hardening == true || inputs.environment != 'DES' }}
      what-to-test: ${{ inputs.changelog }}
    secrets: inherit

  hardening:
    name: "Hardening (Appdome)"
    needs: [resolve-identity, build, test]
    if: >-
      always() && !failure() && !cancelled() && inputs.dry-run != true &&
      (inputs.enable-hardening == true || inputs.environment != 'DES')
    uses: CAIXAPLATFORM/github-workflow-jobs/.github/workflows/ios--hardening.yaml@main
    with:
      project-root: ${{ inputs.project-root }}
      app-name: ${{ needs.resolve-identity.outputs.app-name }}
      environment: ${{ inputs.environment }}
      ipa-artifact: ${{ needs.build.outputs.ipa-artifact }}
      ipa-sha256: ${{ needs.build.outputs.ipa-sha256 }}
      resign-mode: ${{ inputs.resign-mode }}
      # O hardening roda em runner próprio: precisa da mesma configuração de
      # assinatura do build para selar (-pr) e reassinar após o Appdome.
      use-legacy-signing-secrets: ${{ inputs.use-legacy-signing-secrets }}
      signing-team-id: ${{ inputs.signing-team-id }}
      signing-profile-app: ${{ inputs.signing-profile-app }}
      signing-profile-app-uuid: ${{ inputs.signing-profile-app-uuid }}
      signing-profile-widget: ${{ inputs.signing-profile-widget }}
      signing-code-sign-identity: ${{ inputs.signing-code-sign-identity }}
    secrets: inherit

  distribute:
    name: "Distribuir TestFlight"
    needs: [resolve-identity, derive-build-number, check-gate, build, test, hardening]
    if: always() && !failure() && !cancelled() && inputs.dry-run != true
    uses: CAIXAPLATFORM/github-workflow-jobs/.github/workflows/ios--distribute.yaml@main
    with:
      project-root: ${{ inputs.project-root }}
      app-name: ${{ needs.resolve-identity.outputs.app-name }}
      environment: ${{ inputs.environment }}
      version: ${{ inputs.version }}
      build-number: ${{ needs.derive-build-number.outputs.build-number || inputs.build-number }}
      ipa-artifact: ${{ needs.hardening.outputs.sealed-ipa-artifact || needs.build.outputs.ipa-artifact }}
      # O artefato hardenizado carrega o IPA selado E o original; sem nomear o
      # selado, o distribute cai no default <app-name>.ipa e sobe o IPA sem as
      # proteções do Appdome.
      ipa-filename: ${{ needs.hardening.outputs.sealed-ipa-artifact && format('{0}-sealed.ipa', needs.resolve-identity.outputs.app-name) || '' }}
      bundle-identifier: ${{ inputs.bundle-identifier }}
      upload-method: ${{ inputs.upload-method }}
      groups: ${{ inputs.testflight-groups || vars.IOS_TESTFLIGHT_GROUPS }}
      restricted-group: ${{ inputs.testflight-restricted-group || vars.IOS_TESTFLIGHT_RESTRICT_GROUP }}
      restrict-distribution: ${{ inputs.restrict-distribution || (inputs.enable-cocoa-debug && inputs.environment == 'PLT') }}
      changelog: ${{ inputs.changelog }}
      skip-waiting-for-build-processing: ${{ inputs.skip-waiting-for-build-processing }}
    secrets: inherit
