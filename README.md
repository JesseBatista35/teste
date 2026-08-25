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
SIPGC-API-SEGURANCA-TQS (10)
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
Showing filters 1 through 2

Showing filters 1 through 2

Row 2

Showing filters 1 through 2

