Prezados,

Segue erro do módulo sipgc-api-seguranca 

log: 2026-08-25T13:48:32.2087369Z Error from server (BadRequest): container "sipgc-api-seguranca-tqs" in pod "sipgc-api-seguranca-tqs-15-4wxps" is waiting to start: PodInitializing

Notamos que apresentou uma inconsistência na task "CREAT APP MOUNT VOLUME" LINHA 16 2026-08-25T13:41:52.9857093Z The DeploymentConfig "sipgc-api-seguranca-tqs" is invalid: spec.template.spec.containers[0].volumeMounts[1].mountPath: Invalid value: "***": must be unique

At.te

Comunidade Estruturantes de TI


2026-08-25T13:42:23.6450328Z ##[section]Starting: Verificando Status do Deployment
2026-08-25T13:42:23.6453853Z ==============================================================================
2026-08-25T13:42:23.6453965Z Task         : Bash
2026-08-25T13:42:23.6454017Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-25T13:42:23.6454082Z Version      : 3.227.0
2026-08-25T13:42:23.6454131Z Author       : Microsoft Corporation
2026-08-25T13:42:23.6454223Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-25T13:42:23.6454324Z ==============================================================================
2026-08-25T13:42:24.4304755Z Generating script.
2026-08-25T13:42:24.4315393Z ========================== Starting Command Output ===========================
2026-08-25T13:42:24.4322930Z [command]/bin/bash /opt/ads-agent/_work/_temp/dac2db15-9426-4833-809e-c57601659c47.sh
2026-08-25T13:42:24.5592718Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-08-25T13:48:31.1551663Z ##[error]The task has timed out.
2026-08-25T13:48:31.1553036Z ##[section]Finishing: Verificando Status do Deployment


2026-08-25T13:48:31.1573882Z ##[section]Starting: Logs da Aplicação
2026-08-25T13:48:31.1578389Z ==============================================================================
2026-08-25T13:48:31.1578494Z Task         : Bash
2026-08-25T13:48:31.1578538Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-25T13:48:31.1578613Z Version      : 3.227.0
2026-08-25T13:48:31.1578666Z Author       : Microsoft Corporation
2026-08-25T13:48:31.1578720Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-25T13:48:31.1578789Z ==============================================================================
2026-08-25T13:48:31.8880948Z Generating script.
2026-08-25T13:48:31.8893013Z ========================== Starting Command Output ===========================
2026-08-25T13:48:31.8900867Z [command]/bin/bash /opt/ads-agent/_work/_temp/c5d14a12-8b64-4438-acbe-1424ec113391.sh
2026-08-25T13:48:31.8949476Z + shopt -s expand_aliases
2026-08-25T13:48:31.8949979Z + [[ -n okd4_nprd ]]
2026-08-25T13:48:31.8950166Z + [[ okd4_nprd =~ ocp ]]
2026-08-25T13:48:31.8953046Z + [[ -n okd4_nprd ]]
2026-08-25T13:48:31.8953406Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-08-25T13:48:31.8953705Z + app=sipgc-api-seguranca-tqs
2026-08-25T13:48:31.8953973Z + oc version
2026-08-25T13:48:31.9919753Z Client Version: 4.20.0-202605260442.p2.g02b0b2d.assembly.stream.el9-02b0b2d
2026-08-25T13:48:31.9920012Z Kustomize Version: v5.6.0
2026-08-25T13:48:31.9920195Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-08-25T13:48:31.9920382Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-08-25T13:48:31.9954079Z ++ oc get pod -l name=sipgc-api-seguranca-tqs -n sipgc-tqs -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-08-25T13:48:31.9954497Z ++ tac
2026-08-25T13:48:31.9954789Z ++ grep -v '^$'
2026-08-25T13:48:31.9963979Z ++ head -n1
2026-08-25T13:48:32.1033597Z + last_pod=sipgc-api-seguranca-tqs-15-4wxps
2026-08-25T13:48:32.1035123Z + echo 'Logs do POD: sipgc-api-seguranca-tqs-15-4wxps'
2026-08-25T13:48:32.1035545Z + oc logs sipgc-api-seguranca-tqs-15-4wxps -c sipgc-api-seguranca-tqs -n sipgc-tqs
2026-08-25T13:48:32.1036285Z Logs do POD: sipgc-api-seguranca-tqs-15-4wxps
2026-08-25T13:48:32.2087369Z Error from server (BadRequest): container "sipgc-api-seguranca-tqs" in pod "sipgc-api-seguranca-tqs-15-4wxps" is waiting to start: PodInitializing
2026-08-25T13:48:32.2151931Z ##[error]Bash exited with code '1'.
2026-08-25T13:48:32.2163864Z ##[section]Finishing: Logs da Aplicação

secrets-agent-sidecar

2026-08-25 14:10:29,868 INFO Getting secrets just once, POLLING_WAIT_BETWEEN_REQUESTS_MINUTES was not configured
2026-08-25 14:10:29,868 INFO (ba6ccbe0-a08e-11f1-8b9c-0a5819001ea9) APP VERSION: 2.1.0
2026-08-25 14:10:29,868 INFO (ba6ccbe0-a08e-11f1-8b9c-0a5819001ea9) Starting Execution...ba6ccbe0-a08e-11f1-8b9c-0a5819001ea9
2026-08-25 14:10:29,869 INFO (ba6ccbe0-a08e-11f1-8b9c-0a5819001ea9) You are using: <,> as List delimiter
2026-08-25 14:10:29,869 WARNING (ba6ccbe0-a08e-11f1-8b9c-0a5819001ea9) InsecureRequestWarning: Unverified HTTPS request is being made to host https://sicsn.caixa/BeyondTrust/api/public/v3'. Adding certificate verification isstrongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
2026-08-25 14:10:29,869 INFO (ba6ccbe0-a08e-11f1-8b9c-0a5819001ea9) Certificate was not configured
2026-08-25 14:10:29,872 DEBUG (ba6ccbe0-a08e-11f1-8b9c-0a5819001ea9) How long to wait for the server to connect and send data before giving up: connection timeout: 30 seconds, request timeout 30 seconds
2026-08-25 14:10:29,872 WARNING (ba6ccbe0-a08e-11f1-8b9c-0a5819001ea9) verify_ca=false is insecure, it instructs the caller to not verify the certificate authority when making API calls.
2026-08-25 14:10:29,942 INFO (ba6ccbe0-a08e-11f1-8b9c-0a5819001ea9) Calling sign_app_in endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3
2026-08-25 14:10:29,980 ERROR (ba6ccbe0-a08e-11f1-8b9c-0a5819001ea9) Please check credentials (API key/client credentials), error "Failed to authenticate due to one or more authentication rules."



secrets-check

ERRO: Nao foram encontrados arquivos com segredos no diretorio '/usr/src/app/secrets_files'.




compra as variaesm de  DES que esta funcionadno


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
SIPGC-api-seguranca
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
All pipelines

sipgc

SIPGC-api-seguranca
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
EGRESS_IP_OKD (81)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: Release
SIPGC-API-DES (16)
Grupo de variáveis de SIPGC-API-SEGURANCA-DES WO0000081444985 - Alteração do nome da library

Scopes: EC DES
AzureAd__Audience
api://ef9bda30-3695-462e-911b-5252dcf3b2de
AzureAd__ClientId
ef9bda30-3695-462e-911b-5252dcf3b2de
AzureAd__Instance
https://login.microsoftonline.com/
AzureAd__TenantId
23bc12fb-512d-4bc8-9d29-a2da7eb6d281
COMPlus_EnableDiagnostics
0
DB_SCHEMA
PGC
INIT
Criado via api
KEY_SQLSERVER
********
_ENV.ASPNETCORE_ENVIRONMENT
des
_ENV.BD_SERVER
10.116.92.247,1433
_ENV.BEYONDTRUST_LOGGING_ENABLED
true
_ENV.DB_DATABASE
PGCDB001
_ENV.DB_PASSWORD_001
'${spgcdr01_sqlserver}'
_ENV.DB_USER_001
SPGCDR01
_ENV.VAULT_LOCATION
/usr/src/app/secrets_files/SIPGC_DES/
_SECRET.DB_PASSWORD_0010
#{KEY_SQLSERVER}#
SIPGC-API-BT-VAULT-DES (1)
WO0000081000538 - Criação da library WO0000081208166 - Alteração do nome da Library
Scopes: EC DES
BT_SECRETS_LIST
SIPGC_DES/SIPGC_BT_APIKEY,SIPGC_DES/CLISERPGC_SSO_INTRA,SIPGC_DES/SPGCDR01_SQLSERVER
SIPGC-BT-VAULT-SECRET-DES (2)
WO0000081000538 - Criação de library
Scopes: EC DES
BT_CLIENT_ID
75b6b5ad-2036-493e-8183-953f3d9ecf2b
BT_CLIENT_SECRET
********
SIPGC-API-SEGURANCA-TQS (11)
Grupo de variáveis de SIPGC-API-SEGURANCA-TQS
Scopes: EC TQS
DB_SCHEMA
PGC
INIT
Criado via api
KEY_SQLSERVER
********
_ENV.ASPNETCORE_ENVIRONMENT
tqs
_ENV.BD_SERVER
10.116.29.228,1433
_ENV.BEYONDTRUST_LOGGING_ENABLED
true
_ENV.DB_DATABASE
PGCDB001
_ENV.DB_USER_001
SPGCTR01
_ENV.VAULT_LOCATION
/usr/src/app/secrets_files/SIPGC_TQS/
_SECRET.DB_PASSWORD_001
'${spgctr01_sqlserver}'
_SECRET.DB_PASSWORD_0010
#{KEY_SQLSERVER}#
SIPGC-API-BT-VAULT-TQS (1)
conforme WO0000081318659
Scopes: EC TQS
BT_SECRETS_LIST
SIPGC_TQS/SIPGC_BT_APIKEY,SIPGC_TQS/SPGCTR01_SQLSERVER,SIPGC_TQS/CLISERPGC_SSO_INTRA
SIPGC-BT-VAULT-SECRET-TQS (2)
WO0000081000538 - Criação de library
Scopes: EC TQS
BT_CLIENT_ID
97f8f98c-9ce6-4a2f-bdf0-be70af3218ee
BT_CLIENT_SECRET
********
SIPGC-API-SEGURANCA-HMP (1)
Grupo de variáveis de SIPGC-API-SEGURANCA-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
ADAPTER_VARIABLES (9)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: EC PRD
SIPGC-API-SEGURANCA-PRD (6)
Grupo de variáveis de SIPGC-API-SEGURANCA-PRD
Scopes: EC PRD
|Manage variable groups
Expanded

Collapsed

Expanded

Collapsed

No pipelines match your search

Select a release pipeline to view its releases

1 pipelines found

Row 2

Row 2

Row 2

Showing filters 1 through 2


