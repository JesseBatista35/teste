name: "Distribuição iOS via TestFlight"
description: >
  Avalia capacidade de distribuição, obtém credenciais da App Store Connect
  (Key Vault, secrets individuais, JSON secret ou Apple ID) e executa o
  upload para TestFlight via fastlane pilot. Fail-closed se nenhuma
  credencial estiver disponível.

inputs:
  project-root:
    description: "Diretório do projeto relativo à raiz do repositório."
    required: false
    default: "."
  app-name:
    description: "Nome da aplicação."
    required: true
  keyvault-name:
    description: "Nome do Azure Key Vault para buscar API Key ASC."
    required: false
    default: "ios-signing"
  version:
    description: "Versão de marketing do app."
    required: true
  build-number:
    description: "Build number."
    required: true
  ipa-path:
    description: "Caminho do IPA para upload."
    required: true
  bundle-identifier:
    description: "Bundle ID do app (opcional; repassado como --app_identifier ao pilot upload)."
    required: false
    default: ""
  skip-waiting-for-build-processing:
    description: "Pular espera pelo processamento do build."
    required: false
    default: "true"
  groups:
    description: "Lista CSV opcional de grupos TestFlight para distribuição."
    required: false
    default: ""
  changelog:
    description: "Texto opcional What to Test / changelog do build no TestFlight."
    required: false
    default: ""
  upload-method:
    description: >
      Método de upload para TestFlight.
      - auto: detecta automaticamente a partir das credenciais disponíveis (padrão)
      - api-key: força uso de App Store Connect API Key (requer ASC_KEY_ID/ASC_ISSUER_ID/ASC_KEY_CONTENT ou ASC_API_KEY_JSON)
      - apple-id: força uso de Apple ID/senha (requer APPLE_ID/APPLE_PASSWORD)
      - altool: força uso de xcrun altool com Apple ID no fluxo manual
    required: false
    default: "auto"
  resolve-only:
    description: >
      Quando "true", resolve o método de upload e confere a presença das
      credenciais correspondentes, mas não executa nenhuma operação externa
      (sem login Azure, sem Key Vault, sem upload). O fail-closed continua
      valendo: método sem credencial resolve para mode=failed e falha.
      Usado pelo caminho de dry-run das solutions.
    required: false
    default: "false"

outputs:
  mode:
    description: "Modo de distribuição utilizado: api-key, apple-id, altool ou failed."
    value: ${{ steps.capability.outputs.mode }}
  source:
    description: "Origem da credencial resolvida: keyvault, secret ou vazio."
    value: ${{ steps.capability.outputs.source }}

runs:
  using: composite
  steps:
    - name: Avaliar capacidade de distribuição
      id: capability
      shell: bash
      working-directory: ${{ inputs.project-root }}
      env:
        UPLOAD_METHOD: ${{ inputs.upload-method }}
      run: |
        set -euo pipefail
        HAS_FASTLANE="false"
        command -v fastlane >/dev/null 2>&1 && HAS_FASTLANE="true"

        HAS_GEMFILE="false"
        [[ -f Gemfile && -f Gemfile.lock ]] && HAS_GEMFILE="true"

        OIDC_OK="true"
        [[ -z "${AZURE_CLIENT_ID:-}" ]] && OIDC_OK="false"
        [[ -z "${AZURE_TENANT_ID:-}" ]] && OIDC_OK="false"
        [[ -z "${AZURE_SUBSCRIPTION_ID:-}" ]] && OIDC_OK="false"

        HAS_ASC_INDIVIDUAL="false"
        [[ -n "${ASC_KEY_ID:-}" && -n "${ASC_ISSUER_ID:-}" && -n "${ASC_KEY_CONTENT:-}" ]] && HAS_ASC_INDIVIDUAL="true"

        HAS_ASC_SECRET="false"
        [[ -n "${ASC_API_KEY_JSON:-}" ]] && HAS_ASC_SECRET="true"

        # --- Resolução do modo de upload ---
        case "${UPLOAD_METHOD}" in
          api-key)
            if [[ "${HAS_ASC_INDIVIDUAL}" == "true" || "${HAS_ASC_SECRET}" == "true" ]]; then
              echo "mode=api-key" >> "$GITHUB_OUTPUT"
              echo "source=secret" >> "$GITHUB_OUTPUT"
            elif [[ "${OIDC_OK}" == "true" ]]; then
              echo "mode=api-key" >> "$GITHUB_OUTPUT"
              echo "source=keyvault" >> "$GITHUB_OUTPUT"
            else
              echo "::error::upload-method=api-key mas nenhuma credencial ASC encontrada (ASC_KEY_ID/ASC_ISSUER_ID/ASC_KEY_CONTENT, ASC_API_KEY_JSON ou OIDC Azure)."
              echo "mode=failed" >> "$GITHUB_OUTPUT"
              echo "source=" >> "$GITHUB_OUTPUT"
            fi
            ;;
          apple-id)
            if [[ -n "${APPLE_ID:-}" && -n "${APPLE_PASSWORD:-}" ]]; then
              echo "mode=apple-id" >> "$GITHUB_OUTPUT"
              echo "source=" >> "$GITHUB_OUTPUT"
            else
              echo "::error::upload-method=apple-id mas APPLE_ID/APPLE_PASSWORD não definidos."
              echo "mode=failed" >> "$GITHUB_OUTPUT"
              echo "source=" >> "$GITHUB_OUTPUT"
            fi
            ;;
          altool)
            if [[ -n "${APPLE_ID:-}" && -n "${APPLE_PASSWORD:-}" ]]; then
              echo "mode=altool" >> "$GITHUB_OUTPUT"
              echo "source=" >> "$GITHUB_OUTPUT"
            else
              echo "::error::upload-method=altool mas APPLE_ID/APPLE_PASSWORD não definidos."
              echo "mode=failed" >> "$GITHUB_OUTPUT"
              echo "source=" >> "$GITHUB_OUTPUT"
            fi
            ;;
          auto|"")
            # Auto-detecção (comportamento original)
            if [[ "${HAS_FASTLANE}" == "true" && ( "${HAS_ASC_INDIVIDUAL}" == "true" || "${HAS_ASC_SECRET}" == "true" ) ]]; then
              echo "mode=api-key" >> "$GITHUB_OUTPUT"
              echo "source=secret" >> "$GITHUB_OUTPUT"
            elif [[ "${HAS_FASTLANE}" == "true" && "${OIDC_OK}" == "true" ]]; then
              echo "mode=api-key" >> "$GITHUB_OUTPUT"
              echo "source=keyvault" >> "$GITHUB_OUTPUT"
            elif [[ "${HAS_FASTLANE}" == "true" && -n "${APPLE_ID:-}" && -n "${APPLE_PASSWORD:-}" ]]; then
              echo "mode=apple-id" >> "$GITHUB_OUTPUT"
              echo "source=" >> "$GITHUB_OUTPUT"
            elif [[ -n "${APPLE_ID:-}" && -n "${APPLE_PASSWORD:-}" ]]; then
              echo "mode=apple-id" >> "$GITHUB_OUTPUT"
              echo "source=" >> "$GITHUB_OUTPUT"
            else
              echo "mode=failed" >> "$GITHUB_OUTPUT"
              echo "source=" >> "$GITHUB_OUTPUT"
            fi
            ;;
          *)
            echo "::error::upload-method '${UPLOAD_METHOD}' inválido. Valores aceitos: auto, api-key, apple-id, altool."
            echo "mode=failed" >> "$GITHUB_OUTPUT"
            echo "source=" >> "$GITHUB_OUTPUT"
            ;;
        esac

        if [[ "${HAS_GEMFILE}" == "true" ]]; then
          echo "execution_mode=bundle" >> "$GITHUB_OUTPUT"
        else
          echo "execution_mode=standalone" >> "$GITHUB_OUTPUT"
        fi

    - name: Cache de gems do Bundler
      if: inputs.resolve-only != 'true' && steps.capability.outputs.execution_mode == 'bundle'
      uses: actions/cache@v4
      with:
        path: ${{ inputs.project-root }}/vendor/bundle
        key: bundler-${{ runner.os }}-${{ hashFiles(format('{0}/Gemfile.lock', inputs.project-root)) }}
        restore-keys: |
          bundler-${{ runner.os }}-

    - name: Instalar dependências (Bundler)
      if: inputs.resolve-only != 'true' && steps.capability.outputs.execution_mode == 'bundle'
      shell: bash
      working-directory: ${{ inputs.project-root }}
      run: |
        bundle config set path vendor/bundle
        bundle install --jobs 4 --retry 3

    # ----- API Key: Azure Key Vault -----
    - name: Login Azure (OIDC) para API Key
      if: inputs.resolve-only != 'true' && steps.capability.outputs.mode == 'api-key' && steps.capability.outputs.source == 'keyvault'
      uses: azure/login@v2
      with:
        client-id: ${{ env.AZURE_CLIENT_ID }}
        tenant-id: ${{ env.AZURE_TENANT_ID }}
        subscription-id: ${{ env.AZURE_SUBSCRIPTION_ID }}

    - name: Buscar API Key da App Store Connect (Key Vault)
      if: inputs.resolve-only != 'true' && steps.capability.outputs.mode == 'api-key' && steps.capability.outputs.source == 'keyvault'
      shell: bash
      working-directory: ${{ inputs.project-root }}
      run: |
        set -euo pipefail
        APP_SLUG="$(echo "${{ inputs.app-name }}" | tr '[:upper:]' '[:lower:]')"
        az keyvault secret show --vault-name "${{ inputs.keyvault-name }}" \
          --name "ios-${APP_SLUG}-asc-api-key" \
          --query value -o tsv > ./asc-api-key.json

    # ----- API Key: GitHub Secrets -----
    - name: Montar asc-api-key.json a partir de secrets
      if: steps.capability.outputs.mode == 'api-key' && steps.capability.outputs.source == 'secret'
      shell: bash
      working-directory: ${{ inputs.project-root }}
      run: |
        set -euo pipefail
        if [[ -n "${ASC_KEY_ID:-}" && -n "${ASC_ISSUER_ID:-}" && -n "${ASC_KEY_CONTENT:-}" ]]; then
          CLEAN_CONTENT=$(echo "${ASC_KEY_CONTENT}" | tr -d '[:space:]')
          if [[ "${CLEAN_CONTENT}" =~ ^[A-Za-z0-9+/=]+$ ]]; then
            FINAL_KEY=$(echo "${CLEAN_CONTENT}" | base64 -d)
          else
            FINAL_KEY="${ASC_KEY_CONTENT}"
          fi
          jq -n \
            --arg kid "${ASC_KEY_ID}" \
            --arg iid "${ASC_ISSUER_ID}" \
            --arg k "${FINAL_KEY}" \
            '{key_id: $kid, issuer_id: $iid, key: $k, duration: 1200, in_house: false}' \
            > ./asc-api-key.json
          echo "asc-api-key.json montado via segredos individuais."
        elif [[ -n "${ASC_API_KEY_JSON:-}" ]]; then
          printf '%s\n' "${ASC_API_KEY_JSON}" > ./asc-api-key.json
          echo "asc-api-key.json montado a partir de ASC_API_KEY_JSON."
        else
          echo "::error::source=secret mas nenhum segredo ASC definido."
          exit 1
        fi

    # ----- Upload: API Key -----
    # Apenas upload. Distribuição a testadores é feita manualmente no
    # App Store Connect (testadores internos recebem o build automaticamente).
    - name: Upload para TestFlight (API Key)
      if: inputs.resolve-only != 'true' && steps.capability.outputs.mode == 'api-key'
      shell: bash
      working-directory: ${{ inputs.project-root }}
      run: |
        set -euo pipefail
        jq empty ./asc-api-key.json

        PILOT_ARGS=(
          --api_key_path ./asc-api-key.json
          --ipa "${{ inputs.ipa-path }}"
          --app_platform "ios"
          --app_version "${{ inputs.version }}"
          --build_number "${{ inputs.build-number }}"
          --skip_waiting_for_build_processing "${{ inputs.skip-waiting-for-build-processing }}"
        )

        # Adicionar bundle identifier se disponível
        if [[ -n "${{ inputs.bundle-identifier }}" ]]; then
          PILOT_ARGS+=(--app_identifier "${{ inputs.bundle-identifier }}")
        fi
        if [[ -n "${{ inputs.groups }}" ]]; then
          PILOT_ARGS+=(--groups "${{ inputs.groups }}")
        fi
        if [[ -n "${{ inputs.changelog }}" ]]; then
          PILOT_ARGS+=(--changelog "${{ inputs.changelog }}")
        fi

        if [[ "${{ steps.capability.outputs.execution_mode }}" == "bundle" ]]; then
          bundle exec fastlane pilot upload "${PILOT_ARGS[@]}"
        else
          fastlane pilot upload "${PILOT_ARGS[@]}"
        fi

    # ----- Upload: Apple ID (fallback legado) -----
    - name: Upload para TestFlight (Apple ID — fallback legado)
      if: inputs.resolve-only != 'true' && steps.capability.outputs.mode == 'apple-id'
      shell: bash
      working-directory: ${{ inputs.project-root }}
      run: |
        echo "::warning::Usando APPLE_ID/APPLE_PASSWORD. Migrar para API Key via Key Vault."

        export FASTLANE_APPLE_APPLICATION_SPECIFIC_PASSWORD="${APPLE_PASSWORD}"

        PILOT_ARGS=(
          --username "${APPLE_ID}"
          --ipa "${{ inputs.ipa-path }}"
          --app_platform "ios"
          --app_version "${{ inputs.version }}"
          --build_number "${{ inputs.build-number }}"
        )

        # Adicionar bundle identifier se disponível
        if [[ -n "${{ inputs.bundle-identifier }}" ]]; then
          PILOT_ARGS+=(--app_identifier "${{ inputs.bundle-identifier }}")
        fi
        if [[ -n "${{ inputs.groups }}" ]]; then
          PILOT_ARGS+=(--groups "${{ inputs.groups }}")
        fi
        if [[ -n "${{ inputs.changelog }}" ]]; then
          PILOT_ARGS+=(--changelog "${{ inputs.changelog }}")
        fi

        PILOT_ARGS+=(--skip_waiting_for_build_processing "${{ inputs.skip-waiting-for-build-processing }}")

        if [[ "${{ steps.capability.outputs.execution_mode }}" == "bundle" ]]; then
          bundle exec fastlane pilot upload "${PILOT_ARGS[@]}"
        else
          if command -v fastlane >/dev/null 2>&1; then
            fastlane pilot upload "${PILOT_ARGS[@]}"
          else
            xcrun altool --upload-package \
              -f "${{ inputs.ipa-path }}" \
              -u "${APPLE_ID}" \
              -p "${APPLE_PASSWORD}" \
              --type ios
          fi
        fi

    # ----- Upload: altool (fluxo manual PLT/PRD) -----
    - name: Upload para TestFlight (xcrun altool)
      if: inputs.resolve-only != 'true' && steps.capability.outputs.mode == 'altool'
      shell: bash
      working-directory: ${{ inputs.project-root }}
      env:
        APPLE_ID_VAL: ${{ env.APPLE_ID }}
        APPLE_PASSWORD_VAL: ${{ env.APPLE_PASSWORD }}
        IPA_PATH: ${{ inputs.ipa-path }}
      run: |
        set -euo pipefail
        echo "::notice::Upload manual PLT/PRD via xcrun altool."
        if ! xcrun altool --upload-app \
          --file "${IPA_PATH}" \
          --type ios \
          --username "${APPLE_ID_VAL}" \
          --password "${APPLE_PASSWORD_VAL}"; then
          echo "::error::altool falhou; não há retry automático para evitar colisão de build."
          echo "::error::Faça a reconciliação manual no TestFlight antes de repetir o mesmo IPA."
          exit 1
        fi

    # ----- Resolve-only: publica o que seria usado, sem executar -----
    - name: Resumo da resolução de credenciais
      if: inputs.resolve-only == 'true' && steps.capability.outputs.mode != 'failed'
      shell: bash
      env:
        REQUESTED_METHOD: ${{ inputs.upload-method }}
        RESOLVED_MODE: ${{ steps.capability.outputs.mode }}
        RESOLVED_SOURCE: ${{ steps.capability.outputs.source }}
        EXECUTION_MODE: ${{ steps.capability.outputs.execution_mode }}
        IPA_PATH: ${{ inputs.ipa-path }}
      run: |
        set -euo pipefail
        {
          echo "## Distribuição — resolução de credenciais (dry-run)"
          echo ""
          echo "| Item | Valor |"
          echo "|---|---|"
          echo "| Método solicitado | \`${REQUESTED_METHOD:-auto}\` |"
          echo "| Método resolvido | \`${RESOLVED_MODE}\` |"
          echo "| Origem da credencial | \`${RESOLVED_SOURCE:-n/a}\` |"
          echo "| Execução fastlane | \`${EXECUTION_MODE}\` |"
          echo "| IPA que seria enviado | \`${IPA_PATH}\` |"
          echo ""
          echo "> Nenhum upload foi executado (\`resolve-only=true\`)."
        } >> "$GITHUB_STEP_SUMMARY"

    # ----- Fail-closed -----
    - name: Verificar distribuição (obrigatória)
      if: steps.capability.outputs.mode == 'failed'
      shell: bash
      working-directory: ${{ inputs.project-root }}
      run: |
        echo "::error::Distribuição TestFlight é OBRIGATÓRIA."
        echo "::error::Nenhuma credencial de distribuição encontrada para o método selecionado."
        echo "::error::Método selecionado: ${UPLOAD_METHOD:-auto}"
        echo "::error::Opções (configurar via input upload-method):"
        echo "::error::  1. api-key (Preferencial) — ASC_KEY_ID/ASC_ISSUER_ID/ASC_KEY_CONTENT ou ASC_API_KEY_JSON, ou OIDC Azure + Key Vault"
        echo "::error::  2. apple-id — APPLE_ID + APPLE_PASSWORD via fastlane pilot"
        echo "::error::  3. altool (Legado, depreciado) — APPLE_ID + APPLE_PASSWORD via xcrun altool"
        echo "::error::  4. auto — detecta automaticamente (padrão)"
        exit 1
