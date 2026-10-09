# =============================================================================
# Deploy DES (FGTS)
# =============================================================================
# Trigger: Execução manual (Actions → Deploy DES)
#
# O ambiente é implícito: este workflow só publica em DES. PLT e PRD pertencem
# à jornada de release em release-pipeline.yaml.
#
# `dry-run` começa marcado: a esteira compila, assina, exporta e inspeciona o
# IPA, mas nenhuma action autentica no Appdome ou no App Store Connect.
#
# Numeração: o operador informa o próximo sequencial e a plataforma deriva N.1
# sem consultar o App Store Connect.
#
# Substitui deploy-testflight.yaml. O ios.yaml legado permanece disponível
# como contingência até o cutover aprovado.
#
# Docs: GUIA-DEV.md → "TestFlight manual"
# =============================================================================
name: "Deploy DES"
run-name: "Deploy DES — ${{ inputs.marketingVersion }}${{ inputs.dryRun && ' (dry-run)' || '' }}"

on:
  workflow_dispatch:
    inputs:
      ref:
        description: "Branch, tag ou SHA desejado"
        required: true
        type: string
        default: develop
      marketingVersion:
        description: "Próxima versão DESEJADA no IPA (X.Y.Z). Não é a versão já publicada."
        required: true
        type: string
      buildBase:
        description: "Novo sequencial DESEJADO (inteiro positivo, ex: 453). DES publica <base>.1."
        required: true
        type: string
      dryRun:
        description: "Executar sem nenhum efeito externo (sem Appdome, sem TestFlight)"
        required: true
        type: boolean
        default: true
      habilitarCocoaDebug:
        description: "Habilitar CocoaDebug?"
        type: choice
        options: ['Nao', 'Sim']
        default: 'Nao'
      habilitarHardening:
        description: "Habilitar Appdome hardening em DES? (ignorado em dry-run)"
        type: choice
        options: ['Nao', 'Sim']
        default: 'Sim'

permissions:
  contents: read
  pull-requests: read
  id-token: write
  attestations: write
  actions: read
  security-events: write

jobs:
  deploy:
    uses: CAIXAPLATFORM/github-solutions/.github/workflows/ios--deploy.yaml@main
    with:
      ref: ${{ inputs.ref }}
      ref-policy: any-branch
      version: ${{ inputs.marketingVersion }}
      build-base: ${{ inputs.buildBase }}
      build-number-strategy: manual
      dry-run: ${{ inputs.dryRun }}
      # Ambiente e scheme fixos: este caller é exclusivo de DES.
      environment: DES
      xcode-scheme: ${{ vars.IOS_BUILD_SCHEME_DES }}
      xcode-version: ${{ vars.IOS_XCODE_VERSION }}
      build-number-format: ${{ vars.IOS_BUILD_NUMBER_FORMAT }}
      project-root: ${{ vars.IOS_PROJECT_ROOT }}
      xcode-workspace: ${{ vars.IOS_XCODE_WORKSPACE }}
      test-scheme: ${{ vars.IOS_TEST_SCHEME }}
      enable-cocoa-debug: ${{ inputs.habilitarCocoaDebug == 'Sim' }}
      enable-hardening: ${{ inputs.habilitarHardening == 'Sim' }}
      changelog: ''
      resign-mode: manual
      # O iOS Verify aprovado é o pré-requisito de testes do deploy.
      skip-tests: true
      use-legacy-signing-secrets: true
      signing-profile-app-uuid: ${{ vars.UUID_MOBILE_PROVISION }}
      # altool reproduz o comando exato do ios.yaml legado
      # (xcrun altool --upload-app com APPLE_ID/APPLE_PASSWORD). Mantém o
      # upload como variável controlada no cutover; migrar para api-key
      # depois do primeiro deploy real validado.
      upload-method: altool
      pre-build-script: .github/scripts/pre-build.sh
      private-pods: true
    secrets: inherit
