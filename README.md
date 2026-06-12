0s
Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/argocd-get-destination@main
  with:
    argocd_server: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io
    app_name: sisph-mfe-jnd-central-servicos
    environment: TQS
  env:
    APIM_VERSIONAPI: 
    APIM_displaynameAPI: 
    APIM_PATH: 
    APIM_SWAGGERPATH: 
    APIM_TAGSAPI: 
    APIM_POLICIESALLOPERATIONSPATH: 
    environment: tqs
    repository_suffix: infranprd
    REPO: sisph-mfe-jnd-central-servicos
    JOB_ID: 106192
    ARGOCD_AUTH_TOKEN: ***
Run set -euo pipefail
  set -euo pipefail
  
  # Converte environment para lowercase
  ENVIRONMENT_LOWER=$(echo "${ENVIRONMENT}" | tr '[:upper:]' '[:lower:]')
  
  echo "ENVIRONMENT_LOWER=${ENVIRONMENT_LOWER}"
  
  APP_NAME_LOWER=$(echo "${APP_NAME}" | tr '[:upper:]' '[:lower:]')
  
  echo "APP_NAME_LOWER=${APP_NAME_LOWER}"
  
  # Concatena app_name com ambiente
  FULL_APP_NAME="${APP_NAME_LOWER}-${ENVIRONMENT_LOWER}"
  
  # Monta a URL
  URL="${ARGOCD_SERVER}/api/v1/applications/${FULL_APP_NAME}"
  
  # Consulta a API
  RESP="$(curl -sS -H "Authorization: ***" -H "Content-Type: application/json" "$URL")"
  
  # Valida resposta básica
  if [ -z "$RESP" ] || echo "$RESP" | jq -e '.code, .status, .error' >/dev/null 2>&1; then
    echo "Falha ao obter Application ou erro retornado:"
    echo "$RESP"
    exit 1
  fi
  
  echo "::group::Resposta bruta da API"
  echo "$RESP" | jq .
  echo "::endgroup::"
  
  # Exporta JSON para o próximo step
  echo "$RESP" > app.json
  shell: /usr/bin/bash --noprofile --norc -e -o pipefail {0}
  env:
    APIM_VERSIONAPI: 
    APIM_displaynameAPI: 
    APIM_PATH: 
    APIM_SWAGGERPATH: 
    APIM_TAGSAPI: 
    APIM_POLICIESALLOPERATIONSPATH: 
    environment: tqs
    repository_suffix: infranprd
    REPO: sisph-mfe-jnd-central-servicos
    JOB_ID: 106192
    ARGOCD_AUTH_TOKEN: ***
    ARGOCD_SERVER: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io
    APP_NAME: sisph-mfe-jnd-central-servicos
    ENVIRONMENT: TQS
    TOKEN: 
ENVIRONMENT_LOWER=tqs
APP_NAME_LOWER=sisph-mfe-jnd-central-servicos
Falha ao obter Application ou erro retornado:
{"error":"permission denied","code":7,"message":"permission denied"}
Error: Process completed with exit code 1.
