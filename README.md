2026-07-23T15:50:55.1774438Z ##[section]Starting: Atualizando Variáveis de Ambiente
2026-07-23T15:50:55.1777592Z ==============================================================================
2026-07-23T15:50:55.1777681Z Task         : Bash
2026-07-23T15:50:55.1777724Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-23T15:50:55.1777787Z Version      : 3.227.0
2026-07-23T15:50:55.1777838Z Author       : Microsoft Corporation
2026-07-23T15:50:55.1777888Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-23T15:50:55.1777957Z ==============================================================================
2026-07-23T15:50:55.3234247Z Generating script.
2026-07-23T15:50:55.3247067Z ========================== Starting Command Output ===========================
2026-07-23T15:50:55.3255622Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/46f21e6d-7b4b-4da9-a6b5-c5a8a3c7c44f.sh
2026-07-23T15:50:55.3312631Z OKD4 NPRD - des, tqs ou hmp
2026-07-23T15:50:55.3312834Z Nova APP: false
2026-07-23T15:50:55.5564432Z error: there is no need to specify a resource type as a separate argument when passing arguments in resource/name form (e.g. 'oc get resource/<resource_name>' instead of 'oc get resource resource/<resource_name>'
2026-07-23T15:50:55.5640653Z ##[error]Bash exited with code '1'.
2026-07-23T15:50:55.5655089Z ##[section]Finishing: Atualizando Variáveis de Ambiente


2026-07-23T15:50:54.6344976Z ##[section]Starting: Criando nova APP
2026-07-23T15:50:54.6348892Z ==============================================================================
2026-07-23T15:50:54.6348980Z Task         : Bash
2026-07-23T15:50:54.6349041Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-23T15:50:54.6349103Z Version      : 3.227.0
2026-07-23T15:50:54.6349146Z Author       : Microsoft Corporation
2026-07-23T15:50:54.6349214Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-23T15:50:54.6349285Z ==============================================================================
2026-07-23T15:50:54.7684483Z Generating script.
2026-07-23T15:50:54.7696921Z ========================== Starting Command Output ===========================
2026-07-23T15:50:54.7704131Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/6ba6ac03-46ef-4689-9431-4cd62b76d6c3.sh
2026-07-23T15:50:54.7755825Z OKD4 NPRD - des, tqs ou hmp
2026-07-23T15:50:54.8416923Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-07-23T15:50:54.8417516Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-07-23T15:50:54.8418260Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-07-23T15:50:54.9714771Z Essa aplicação já está criada.
2026-07-23T15:50:55.0520646Z deploymentconfig.apps.openshift.io/sircl-frontend-tqs patched (no change)
2026-07-23T15:50:55.1646643Z deploymentconfig.apps.openshift.io/sircl-frontend-tqs labeled
2026-07-23T15:50:55.1755599Z ##[section]Finishing: Criando nova APP


2026-07-23T15:50:54.0441999Z ##[section]Starting: Criando novo Projeto
2026-07-23T15:50:54.0446467Z ==============================================================================
2026-07-23T15:50:54.0446617Z Task         : Bash
2026-07-23T15:50:54.0446692Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-23T15:50:54.0446801Z Version      : 3.227.0
2026-07-23T15:50:54.0446895Z Author       : Microsoft Corporation
2026-07-23T15:50:54.0446984Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-23T15:50:54.0447107Z ==============================================================================
2026-07-23T15:50:54.1979832Z Generating script.
2026-07-23T15:50:54.1991529Z ========================== Starting Command Output ===========================
2026-07-23T15:50:54.1999206Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/f3442ee6-5c00-4724-8548-9f7d7b02873d.sh
2026-07-23T15:50:54.2973160Z NAME        DISPLAY NAME   STATUS
2026-07-23T15:50:54.2973653Z sircl-tqs                  Active
2026-07-23T15:50:54.3745529Z namespace/sircl-tqs not labeled
2026-07-23T15:50:54.4571171Z namespace/sircl-tqs not labeled
2026-07-23T15:50:54.5361369Z namespace/sircl-tqs not labeled
2026-07-23T15:50:54.6174965Z netnamespace.network.openshift.io/sircl-tqs not labeled
2026-07-23T15:50:54.6262383Z ##[section]Finishing: Criando novo Projeto



Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIRCL-frontend
/
SIRCL-frontend-1.0.0.1(6)
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings
SIRCL-frontend

SIRCL-frontend-1.0.0.1(6)


EC TQS

Failed


Pipeline

Tasks

Variables

Logs

Tests
Predefined variables
Usuario-Azure-DevOps (12)
Scopes: Release
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
EGRESS_IP_OKD (74)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: Release
OKD-4-APL (12)
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
SIRCL-FRONTEND-DES (7)
Grupo de variáveis de SIRCL-FRONTEND-DES
Scopes: EC DES
HTTP_SERVICE_API
https://sircl-backend-des.apps.nprd.caixa/sircl-backend
INIT
Criado via api
_ENV.NEXT_PUBLIC_API_BASE_URL
https://sircl-backend-des.apps.nprd.caixa/sircl-backend
_ENV.NEXT_PUBLIC_KEYCLOAK_CLIENT_ID
cli-web-rcl
_ENV.NEXT_PUBLIC_KEYCLOAK_ENABLED
true
_ENV.NEXT_PUBLIC_KEYCLOAK_REALM
intranet
_ENV.NEXT_PUBLIC_KEYCLOAK_URL
https://login.des.caixa/auth
SIRCL-FRONTEND-TQS (7)
Grupo de variáveis de SIRCL-FRONTEND-TQS
Scopes: EC TQS
HTTP_SERVICE_API
https://sircl-backend-tqs.apps.nprd.caixa/sircl-backend
INIT
Criado via api
_ENV.NEXT_PUBLIC_API_BASE_URL
https://sircl-backend-tqs.apps.nprd.caixa/sircl-backend
_ENV.NEXT_PUBLIC_KEYCLOAK_CLIENT_ID
cli-web-rcl
_ENV.NEXT_PUBLIC_KEYCLOAK_ENABLED
true
_ENV.NEXT_PUBLIC_KEYCLOAK_REALM
intranet
_ENV.NEXT_PUBLIC_KEYCLOAK_URL
https://login.tqs.caixa/auth
SIRCL-FRONTEND-HMP (1)
Grupo de variáveis de SIRCL-FRONTEND-HMP
Scopes: EC HMP
SIRCL-FRONTEND-PRD (1)
Grupo de variáveis de SIRCL-FRONTEND-PRD
Scopes: EC PRD
Expanded

Expanded

Collapsed

Collapsed

8 pipelines found

Select a release pipeline to view its releases

1 pipelines found

Select a release pipeline to view its releases

1 pipelines found

Row 2

Row 2

Showing filters 1 through 2

