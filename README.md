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
SIDCE-conta-destino
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
SIDCE

SIDCE-conta-destino
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
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
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
SIDCE-CONTA-DESTINO-DES (23)
Grupo de variáveis de SIDCE-CONTA-DESTINO-DES
Scopes: EC DES
API_KEY
********
API_KEY_BT
'${SIDCE_BT_APIKEY}'
DATABASE_PASSWD_BT
'${SDCEDB02_MSSQL}'
SSO_CLIENT
********
SSO_CLIENT_BT
'${CLISERDCE_SSO_INTRA}'
_ENV.DATABASE_URL
"jdbc:sqlserver://10.116.93.93:1433;databaseName=DCEDB001;encrypt=false"
_ENV.DATABASE_USERNAME
SDCEDB02
_ENV.ENVIRONMENT
DES
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.NO_PROXY
"*.caixa,*.caixa.gov.br"
_ENV.ROLE_NAME_GET
DCE_CONTA_DESTINO_CONSULTA
_ENV.ROLE_NAME_POST
DCE_CONTA_DESTINO_CADASTRO
_ENV.SID09_SEGMENTO
3054
_ENV.SSERVER_PORT
1433
_ENV.SSO_CLIENT_ID
cli-ser-dce
_ENV.SSO_URL
https://login.des.caixa/auth
_ENV.URL_API_CAIXA
https://api.des.caixa:8443
_ENV.USER_BASIC_AUTH
SDCESD01
_ENV.VAULT_LOCATION
/usr/src/app/secrets_files/SIDCE_DES/
_SECRET.API_KEY
#{API_KEY_BT}#
_SECRET.DATABASE_PASSWORD
#{DATABASE_PASSWD_BT}#
_SECRET.SSO_CLIENT_SECRET
#{SSO_CLIENT_BT}#
SIDCE-CONTA-DESTINO-BT-VAULT-DES (3)
Scopes: EC DES
SIDCE-CONTA-DESTINO-TQS (21)
Grupo de variáveis de SIDCE-CONTA-DESTINO-TQS

Scopes: EC TQS
API_KEY_BT
'${SIDCE_BT_APIKEY}'
DATABASE_PASSWD
********
DATABASE_PASSWD_BT
'${SDCETB01_MSSQL}'
SSO_CLIENT
2dd4a956-f045-44cb-a872-ef4c63fc45f2
SSO_CLIENT_BT
'${CLISERDCE_SSO_INTRA}'
_ENV.DATABASE_URL
"jdbc:sqlserver://10.116.93.93:1433;databaseName=DCEDB001;encrypt=false"
_ENV.DATABASE_USERNAME
SDCETB01
_ENV.ENVIRONMENT
DES
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.NO_PROXY
"*.caixa,*.caixa.gov.br"
_ENV.ROLE_NAME_GET
DCE_CONTA_DESTINO_CONSULTA
_ENV.ROLE_NAME_POST
DCE_CONTA_DESTINO_CADASTRO
_ENV.SSERVER_PORT
1433
_ENV.SSO_CLIENT_ID
cli-ser-dce
_ENV.SSO_URL
https://login.des.caixa/auth
_ENV.USER_BASIC_AUTH
SDCESD01
_ENV.VAULT_LOCATION
/usr/src/app/secrets_files/SIDCE_TQS/
_SECRET.API_KEY
#{API_KEY_BT}#
_SECRET.DATABASE_PASSWORD
#{DATABASE_PASSWD_BT}#
_SECRET.SSO_CLIENT_SECRET
#{SSO_CLIENT_BT}#
SIDCE-CONTA-DESTINO-BT-VAULT-TQS (3)
WO0000080473436
Scopes: EC TQS
NEXUS_VARIABLES (19)
Variáveis disponíveis para todas as builds.
Scopes: QA-APITEST
SIDCE-conta-destino-QA-AUTOAPI (7)
Variaveis para execução da automação de testes de API nas releases da Aplicação
Scopes: QA-APITEST
SIDCE-CONTA-DESTINO-HMP (1)
Grupo de variáveis de SIDCE-CONTA-DESTINO-HMP
Scopes: EC HMP
SIDCE-CONTA-DESTINO-PRD (18)
Grupo de variáveis de SIDCE-CONTA-DESTINO-PRD
Scopes: EC PRD
OKD-4-APL (12)
Scopes: EC PRD
|Manage variable groups
Showing filters 1 through 2

Showing filters 1 through 2

Expanded

Collapsed

Showing 26 deployments

Row 2

EC TQSDeploy release

Row 2

Row 4

Row 3

Row 2

Row 2

Row 5

Row 4

Showing filters 1 through 2

