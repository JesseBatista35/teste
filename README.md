# =============================================================================
# Workflow-job: Distribuir para TestFlight (single-job)
# =============================================================================
# Superconjunto dos jobs distribute (ios--release.yaml) e distribuir
# (ios--deploy.yaml). Faz upload do IPA para o TestFlight via action
# ios/distribute-testflight. Parte da camada 2 (workflow-jobs); orquestrado
# pela camada 3 (solutions).
#
# RESTRIÇÃO CRÍTICA: todos os quatro métodos de upload DEVEM ser mantidos
# (api-key via Key Vault, api-key via secrets, apple-id, altool). Nunca
# remover caminhos "depreciados" — correspondem às credenciais reais do time.
#
# Responsabilidades:
#   - Baixar artefato IPA pelo nome passado em ipa-artifact
#   - Distribuir para TestFlight usando o método escolhido (upload-method)
#   - Emitir resumo do deploy no step summary
#
# Fonte: superset de release/distribute e deploy/distribuir
#
# Divergências reconciliadas entre os monolitos:
#   - Timeout: release=20min, deploy=90min → superset usa 90min (mais conservador)
#   - IPA filename: release usa <app-name>-sealed.ipa; deploy usa <app-name>.ipa
#     → input ipa-filename (default: "") permite override; quando vazio, o job
#     usa <app-name>.ipa (padrão deploy). Para release, passar "<app-name>-sealed.ipa".
#   - skip-waiting-for-build-processing: release="true", deploy=ausente
#     → input com default "true" (paridade com release; deploy não usa; inócuo).
#   - groups/changelog voltaram como opcionais para paridade CaixaTem.
#     Quando vazios, o job faz apenas upload sem atribuição de grupos.
#
# Inputs obrigatórios: app-name, ipa-artifact, version, build-number
# =============================================================================

name: "Distribuir para TestFlight"

on:
  workflow_call:
    inputs:
      project-root:
        description: "Diretório do projeto relativo à raiz do repositório."
        required: false
        type: string
        default: "."
      # ── Identificação ──────────────────────────────────────────────────────
      app-name:
        description: "Nome do aplicativo (resolvido pelo caller via resolve-identity)."
        required: true
        type: string
      environment:
        description: "Ambiente alvo (DES, PLT, PRD)."
        required: false
        type: string
        default: "DES"

      # ── Versionamento ──────────────────────────────────────────────────────
      version:
        description: "Versão de marketing da aplicação (ex: 1.92.0)."
        required: true
        type: string
      build-number:
        description: "Número sequencial de build."
        required: true
        type: string

      # ── Artefato de entrada ────────────────────────────────────────────────
      ipa-artifact:
        description: >
          Nome do artefato que contém o IPA a ser distribuído. Pode ser o
          artefato hardenizado (hardened-<app-name>-<run_id>) ou o artefato
          de build direto (ipa-<app-name>-<run_id>).
        required: true
        type: string
      ipa-filename:
        description: >
          Nome do arquivo IPA dentro do artefato. Quando vazio, usa
          <app-name>.ipa (padrão deploy). Para release com hardening, passar
          <app-name>-sealed.ipa.
        required: false
        type: string
        default: ""

      # ── Assinatura — Key Vault ─────────────────────────────────────────────
      # Requer secrets AZURE_CLIENT_ID, AZURE_TENANT_ID, AZURE_SUBSCRIPTION_ID.
      keyvault-name:
        description: "Nome do Azure Key Vault."
        required: false
        type: string
        default: "ios-signing"

      # ── Distribuição ──────────────────────────────────────────────────────
      bundle-identifier:
        description: "Bundle ID da aplicação. Se vazio, detecta via vars.BUNDLE_IDENTIFIER."
        required: false
        type: string
        default: ""
      upload-method:
        description: >
          Método de upload para TestFlight: auto (detecta automaticamente),
          api-key (App Store Connect API Key via Key Vault ou secrets diretos),
          apple-id (Apple ID/senha), altool (xcrun altool, legado/depreciado).
          Todos os quatro modos são suportados — não remover nenhum.
        required: false
        type: string
        default: "auto"
      skip-waiting-for-build-processing:
        description: >
          Pular espera pelo processamento do build no App Store Connect.
          Default true (paridade com release).
        required: false
        type: string
        default: "true"
      groups:
        description: "Grupos TestFlight CSV. Vazio faz apenas upload sem atribuição de grupos."
        required: false
        type: string
        default: ""
      changelog:
        description: "Texto What to Test / changelog do build no TestFlight."
        required: false
        type: string
        default: ""
      restrict-distribution:
        description: "Quando true, exige grupo restrito e usa restricted-group como destino."
        required: false
        type: boolean
        default: false
      restricted-group:
        description: "Grupo TestFlight único usado para distribuição restrita."
        required: false
        type: string
        default: ""

      # ── Dry-run ───────────────────────────────────────────────────────────
      resolve-only:
        description: >
          Quando true, o job baixa o artefato, resolve caminho do IPA, grupos
          e credenciais de upload — e para aí. Nenhum upload para o TestFlight
          e nenhuma notificação. O fail-closed da action continua valendo: se
          o método escolhido não tiver credencial, o job falha.
          Usado pelo caminho de dry-run das solutions.
        required: false
        type: boolean
        default: false

    outputs:
      resolved-mode:
        description: "Método de upload resolvido: api-key, apple-id, altool ou failed."
        value: ${{ jobs.distribute.outputs.resolved-mode }}
      resolved-source:
        description: "Origem da credencial resolvida: keyvault, secret ou vazio."
        value: ${{ jobs.distribute.outputs.resolved-source }}

    secrets:
      # ── Key Vault (OIDC) — método api-key via Key Vault ───────────────────
      AZURE_CLIENT_ID:
        required: false
      AZURE_TENANT_ID:
        required: false
      AZURE_SUBSCRIPTION_ID:
        required: false
      # ── App Store Connect API Key direta — método api-key via secrets ──────
      ASC_KEY_ID:
        required: false
      ASC_ISSUER_ID:
        required: false
      ASC_KEY_CONTENT:
        required: false
      ASC_API_KEY_JSON:
        required: false
      # ── Apple ID/senha — método apple-id ──────────────────────────────────
      APPLE_ID:
        required: false
      APPLE_PASSWORD:
        required: false
      # ── Notificação Teams (opcional, não bloqueante) ──────────────────────
      TEAMS_WEBHOOK_URL:
        required: false

permissions:
  contents: read

jobs:
  # ---------------------------------------------------------------------------
  # Distribuição para TestFlight
  # ---------------------------------------------------------------------------
  distribute:
    name: "Distribuir para TestFlight"
    runs-on: ${{ vars.IOS_MACOS_RUNNER || 'macos-15' }}
    defaults:
      run:
        working-directory: ${{ inputs.project-root }}
    timeout-minutes: 90
    permissions:
      contents: read
      id-token: write
    environment:
      name: ${{ inputs.environment }}
    outputs:
      resolved-mode: ${{ steps.distribute.outputs.mode }}
      resolved-source: ${{ steps.distribute.outputs.source }}
    steps:
      - name: Checkout
        uses: actions/checkout@v4

      - name: Validar contexto do projeto iOS
        uses: CAIXAPLATFORM/github-actions/actions/ios/validate-project-context@main
        with:
          project-root: ${{ inputs.project-root }}

      - name: Baixar artefato de build
        uses: actions/download-artifact@v4
        with:
          name: ${{ inputs.ipa-artifact }}
          path: ${{ inputs.project-root }}/build

      - name: Resolver caminho do IPA
        id: resolve-ipa
        env:
          APP_NAME: ${{ inputs.app-name }}
          IPA_FILENAME: ${{ inputs.ipa-filename }}
          PROJECT_ROOT: ${{ inputs.project-root }}
        run: |
          set -euo pipefail
          if [[ -n "${IPA_FILENAME}" ]]; then
            echo "ipa-path=${GITHUB_WORKSPACE}/${PROJECT_ROOT}/build/${IPA_FILENAME}" >> "$GITHUB_OUTPUT"
          else
            echo "ipa-path=${GITHUB_WORKSPACE}/${PROJECT_ROOT}/build/${APP_NAME}.ipa" >> "$GITHUB_OUTPUT"
          fi

      - name: Resolver grupos TestFlight
        id: testflight-groups
        env:
          GROUPS: ${{ inputs.groups }}
          RESTRICT: ${{ inputs.restrict-distribution }}
          RESTRICTED_GROUP: ${{ inputs.restricted-group }}
        run: |
          set -euo pipefail
          EFFECTIVE_GROUPS="${GROUPS}"
          if [[ "${RESTRICT}" == "true" ]]; then
            if [[ -z "${RESTRICTED_GROUP}" ]]; then
              echo "::error::Distribuição restrita solicitada, mas restricted-group/IOS_TESTFLIGHT_RESTRICT_GROUP está vazio."
              exit 1
            fi
            EFFECTIVE_GROUPS="${RESTRICTED_GROUP}"
          fi
          echo "groups=${EFFECTIVE_GROUPS}" >> "$GITHUB_OUTPUT"

      - name: ${{ inputs.resolve-only && 'Resolver credenciais de distribuição' || 'Distribuir para TestFlight' }}
        id: distribute
        uses: CAIXAPLATFORM/github-actions/actions/ios/distribute-testflight@main
        with:
          resolve-only: ${{ inputs.resolve-only }}
          project-root: ${{ inputs.project-root }}
          app-name: ${{ inputs.app-name }}
          keyvault-name: ${{ inputs.keyvault-name }}
          version: ${{ inputs.version }}
          build-number: ${{ inputs.build-number }}
          bundle-identifier: ${{ inputs.bundle-identifier || vars.BUNDLE_IDENTIFIER }}
          ipa-path: ${{ steps.resolve-ipa.outputs.ipa-path }}
          skip-waiting-for-build-processing: ${{ inputs.skip-waiting-for-build-processing }}
          groups: ${{ steps.testflight-groups.outputs.groups }}
          changelog: ${{ inputs.changelog }}
          upload-method: ${{ inputs.upload-method }}
        env:
          AZURE_CLIENT_ID: ${{ secrets.AZURE_CLIENT_ID }}
          AZURE_TENANT_ID: ${{ secrets.AZURE_TENANT_ID }}
          AZURE_SUBSCRIPTION_ID: ${{ secrets.AZURE_SUBSCRIPTION_ID }}
          ASC_KEY_ID: ${{ secrets.ASC_KEY_ID || secrets.KEY_ID_APP_CONNECT }}
          ASC_ISSUER_ID: ${{ secrets.ASC_ISSUER_ID || secrets.ISSUER_ID_APP_CONNECT }}
          ASC_KEY_CONTENT: ${{ secrets.ASC_KEY_CONTENT || secrets.APP_STORE_CONNECT_API_KEY_CONTENT || secrets.CERTIFICATE_APP_STORE_CONNECT }}
          ASC_API_KEY_JSON: ${{ secrets.ASC_API_KEY_JSON }}
          APPLE_ID: ${{ secrets.APPLE_ID }}
          APPLE_PASSWORD: ${{ secrets.APPLE_PASSWORD }}

      - name: Notificar Teams (opcional, não bloqueante)
        if: success() && inputs.resolve-only != true
        continue-on-error: true
        uses: CAIXAPLATFORM/github-actions/actions/ios/notify-teams@main
        with:
          title: ${{ inputs.app-name }}
          environment: ${{ inputs.environment }}
          version: ${{ inputs.version }}
          build-number: ${{ inputs.build-number }}
          branch: ${{ github.ref_name }}
          changelog: ${{ inputs.changelog }}
          pipeline-url: ${{ github.server_url }}/${{ github.repository }}/actions/runs/${{ github.run_id }}
        env:
          TEAMS_WEBHOOK_URL: ${{ secrets.TEAMS_WEBHOOK_URL || secrets.SICTM_IOS_TEAMS_WEBHOOK_URL }}

      - name: Resumo do pipeline
        if: inputs.resolve-only != true
        env:
          APP_NAME: ${{ inputs.app-name }}
          ENVIRONMENT: ${{ inputs.environment }}
          VERSION: ${{ inputs.version }}
          BUILD_NUMBER: ${{ inputs.build-number }}
        run: |
          echo "========================================="
          echo " DISTRIBUIÇÃO TESTFLIGHT CONCLUÍDA"
          echo "========================================="
          echo "App:          ${APP_NAME}"
          echo "Ambiente:     ${ENVIRONMENT}"
          echo "Versão:       ${VERSION}"
          echo "Build Number: ${BUILD_NUMBER}"
          echo "Status: SUCESSO"
          echo "========================================="
