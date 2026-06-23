Estamos tentando deploy no referido repositório, entretanto na etapa de CI_DES -> ArgoCD_Deploy (DES) ocorre o seguinte erro (log):

Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/argocd-get-destination@main
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
    environment: des
    repository_suffix: infranprd
    REPO: siacx-chatcaixa-mcp-server
    JOB_ID: 110455
    ARGOCD_AUTH_TOKEN: ***
    ARGOCD_SERVER: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io
    APP_NAME: siacx-chatcaixa-mcp-server
    ENVIRONMENT: DES
    TOKEN: 
ENVIRONMENT_LOWER=des
APP_NAME_LOWER=siacx-chatcaixa-mcp-server
Falha ao obter Application ou erro retornado:
{"error":"permission denied","code":7,"message":"permission denied"}
Error: Process completed with exit code 1.


Em caso de dúvidas, favor contactar C159756 no Teams.

Att,


Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
siacx-chatcaixa-mcp-server
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Models
Wiki
Security and quality
2
 (2)
Insights
Settings
Actions: caixagithub/siacx-chatcaixa-mcp-server
Actions
Management
All workflows
Filter workflow runs
Showing runs from all workflows
23 workflow runs
caixagithub/siacx-chatcaixa-mcp-server_dev_27973734275.4
CI/CD Workflow Generic #4: Manually run by c159756_caixa
dev	
Jun 22, 15:07 GMT-3
 4m 35s
caixagithub/siacx-chatcaixa-mcp-server_develop_27970800939.3
CI/CD Workflow Generic #3: Commit 32d7232 pushed by c159756_caixa
develop	
Jun 22, 14:17 GMT-3
 5m 3s
Seguranca-caixagithub/siacx-chatcaixa-mcp-server_develop_27970800654.14
Call CodeQL workflow Seguranca #14: Commit 32d7232 pushed by c159756_caixa
develop	
Jun 22, 14:17 GMT-3
 1m 45s
Seguranca-caixagithub/siacx-chatcaixa-mcp-server_4/merge_27969884754.13
Call CodeQL workflow Seguranca #13: Pull request #4 opened by c159756_caixa
dev	
Jun 22, 14:01 GMT-3
 2m 10s
QUALIDADE-caixagithub/siacx-chatcaixa-mcp-server_4/merge_27969884717.4
QA - Análise Estática de Código #4: Pull request #4 opened by c159756_caixa
dev	
Jun 22, 14:01 GMT-3
 54s
QUALIDADE-caixagithub/siacx-chatcaixa-mcp-server_3/merge_27969744259.3
QA - Análise Estática de Código #3: Pull request #3 opened by c159756_caixa
feat/100618_ajustes_variaveis	
Jun 22, 13:59 GMT-3
 53s
caixagithub/siacx-chatcaixa-mcp-server_develop_27962281673.2
CI/CD Workflow Generic #2: Commit a41f5fb pushed by c141132_caixa
develop	
Jun 22, 12:00 GMT-3
 26s
Seguranca-caixagithub/siacx-chatcaixa-mcp-server_develop_27962276927.12
Call CodeQL workflow Seguranca #12: Commit a41f5fb pushed by c141132_caixa
develop	
Jun 22, 12:00 GMT-3
 1m 59s
Seguranca-caixagithub/siacx-chatcaixa-mcp-server_2/merge_27959840658.11
Call CodeQL workflow Seguranca #11: Pull request #2 synchronize by c141132_caixa
dev	
Jun 22, 11:23 GMT-3
 2m 12s
QUALIDADE-caixagithub/siacx-chatcaixa-mcp-server_2/merge_27959840152.2
QA - Análise Estática de Código #2: Pull request #2 synchronize by c141132_caixa
dev	
Jun 22, 11:23 GMT-3
 1m 5s
Seguranca-caixagithub/siacx-chatcaixa-mcp-server_2/merge_27959421681.10
Call CodeQL workflow Seguranca #10: Pull request #2 synchronize by c141132_caixa
dev	
Jun 22, 11:17 GMT-3
 1m 50s
QUALIDADE-caixagithub/siacx-chatcaixa-mcp-server_2/merge_27959421482.1
QA - Análise Estática de Código #1: Pull request #2 synchronize by c141132_caixa
dev	
Jun 22, 11:17 GMT-3
 53s
Code Quality: CodeQL Setup
CodeQL #1: by p548031_caixa
main	
Jun 22, 11:13 GMT-3
 1m 44s
Seguranca-__.
Call CodeQL workflow Seguranca #9: Scheduled
main	
Jun 21, 22:53 GMT-3
 1m 12s
Seguranca-__.
Call CodeQL workflow Seguranca #8: Scheduled
main	
Jun 14, 22:53 GMT-3
 4m 9s
Seguranca-__.
Call CodeQL workflow Seguranca #7: Scheduled
main	
Jun 7, 22:49 GMT-3
 13m 56s
Seguranca-__.
Call CodeQL workflow Seguranca #6: Scheduled
main	
May 31, 22:49 GMT-3
 5m 10s
Seguranca-__.
Call CodeQL workflow Seguranca #5: Scheduled
main	
May 24, 22:45 GMT-3
 5m 3s
Seguranca-__.
Call CodeQL workflow Seguranca #4: Scheduled
main	
May 17, 22:43 GMT-3
 2m 57s
Seguranca-__.
Call CodeQL workflow Seguranca #3: Scheduled
main	
May 10, 22:38 GMT-3
 3m 25s
Seguranca-__.
Call CodeQL workflow Seguranca #2: Scheduled
main	
May 3, 22:37 GMT-3
 10m 28s
__.
CI/CD Workflow Generic #1: Commit 3f45665 pushed by devhub-connect-emu Bot
main	
Apr 28, 10:57 GMT-3
 1m 54s
Seguranca-__.
Call CodeQL workflow Seguranca #1: Commit 3f45665 pushed by devhub-connect-emu Bot
main	
Apr 28, 10:57 GMT-3
 3m 15s
Footer
© 2026 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Community
Docs
Contact
Manage cookies
Do not share my personal information



 Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
siacx-chatcaixa-mcp-server
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Models
Wiki
Security and quality
2
 (2)
Insights
Settings
CI/CD Workflow Generic
caixagithub/siacx-chatcaixa-mcp-server_dev_27973734275.4 #4
All jobs
Run details
Annotations
1 error and 1 warning
CI_DES / ArgoCD_Deploy / ArgoCD_Deploy (DES)
failed 19 hours ago in 1m 23s
Search logs
9s
1s
0s
0s
0s
0s
0s
0s
0s
0s
0s
0s
30s
0s
5s
0s
4s
0s
1s
0s
21s
5s
0s
Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/argocd-get-destination@main
  with:
    argocd_server: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io
    app_name: siacx-chatcaixa-mcp-server
    environment: DES
  env:
    APIM_VERSIONAPI: 
    APIM_displaynameAPI: 
    APIM_PATH: 
    APIM_SWAGGERPATH: 
    APIM_TAGSAPI: 
    APIM_POLICIESALLOPERATIONSPATH: 
    environment: des
    repository_suffix: infranprd
    REPO: siacx-chatcaixa-mcp-server
    JOB_ID: 110455
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
  
0s
0s
0s
0s
0s
0s
0s
0s
0s
0s
0s
1s
0s

