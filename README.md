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
SICBP-menudinamico-backend
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
sicbp

SICBP-menudinamico-backend
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
Scopes: EC DES,EC TQS,EC HMP
SICBP-MENUDINAMICO-BACKEND-DES (7)
Grupo de variáveis de SICBP-MENUDINAMICO-BACKEND-DES

Scopes: EC DES
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SICBP-MENUDINAMICO-BACKEND-DES
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.LOG_LEVEL
ERROR
_ENV.NOME_ROTA
caixa-sicbp-menudinamico-des
_ENV.SITAE_COD_SERVICO
363343
_ENV.SSO_ISSUER
https://logindes.caixa.gov.br/auth/realms/internet,https://login.des.caixa/auth/realms/intranet
_ENV.UN_CRUD_ROTAS
0002
SICBP-COMMON-BACKEND-DES (45)
SICBP-COMMON-BACKEND-DES
Scopes: EC DES
CLIENT_SECRET
********
CLIENT_SECRET_INTRANET
********
CLIENT_SECRET_SERVICO
********
ORACLE_PASS
********
SICBP-COMMON
SICBP_API_KEY
********
_ENV.AMBIENTE
NACIONAL
_ENV.API_IDENTIFICACAO_POSITIVA_BASE_PATH
https://sicbp-correspondentes-api-des.apps.nprd.caixa
_ENV.API_IDENTIFICACAO_POSITIVA_DISABLED
true
_ENV.API_IDENTIFICACAO_POSITIVA_IGNORE_PATHS
_ENV.API_MANAGER_URL
https://api.des.caixa:8443
_ENV.API_TRILHA_BASEPATH
https://sicbp-trilha-api-des.apps.nprd.caixa
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=b0142390-50c9-495e-85b4-7b2ade8fc1cf;IngestionEndpoint=https://brazilsoutheast-0.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsoutheast.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_PROXY
http://proxydes.caixa:80
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.BLOCK_OBJECT_TYPE
TRUE
_ENV.CLIENT_ID
cli-ser-cbp
_ENV.CLIENT_ID_INTRANET
cli-ser-cbp
_ENV.DATASOURCE_JDBC_URL
jdbc:oracle:thin:@cnpexdadvm01-scan8.extra.caixa.gov.br:1521/orad01bc
_ENV.ENABLE_SWAGGER
FALSE
_ENV.FLAG_CERTIFICADO_DIGITAL
false
_ENV.MESSAGE_ERRORS_COMPLETE
FALSE
_ENV.ORACLE_CONNECTIONTIMEOUT
30000
_ENV.ORACLE_IDLETIMEOUT
900000
_ENV.ORACLE_KEEPALIVETIME
0
_ENV.ORACLE_MAXIMUMPOOLSIZE
60
_ENV.ORACLE_MAXLIFETIME
1800000
_ENV.ORACLE_MINIMUMIDLE
3
_ENV.ORACLE_SHOW_SQL
false
_ENV.ORACLE_USER
SCBPDS01
_ENV.SITAE_OFFLINE
TRUE
_ENV.SPRING_PROFILES_ACTIVE
development
_ENV.SSL_VERIFICATION_DISABLED
true
_ENV.SSO_ISSUER_INTERNET
https://logindes.caixa.gov.br/auth/realms/internet
_ENV.SSO_ISSUER_INTRANET
https://login.des.caixa/auth/realms/intranet
_ENV.SSO_URL
https://logindes.caixa.gov.br
_ENV.SSO_URL_INTRANET
https://login.des.caixa
_ENV.SSO_URL_LOGIN2
https://login2des.caixa.gov.br
_SECRET.CLIENT_SECRET
#{CLIENT_SECRET}#
_SECRET.CLIENT_SECRET_INTRANET
#{CLIENT_SECRET_INTRANET}#
_SECRET.CLIENT_SECRET_SERVICO
#{CLIENT_SECRET_SERVICO}#
_SECRET.ORACLE_PASS
#{ORACLE_PASS}#
_SECRET.SICBP_API_KEY
#{SICBP_API_KEY}#
SICBP-MENUDINAMICO-BACKEND-TQS (7)
Grupo de variáveis de SICBP-MENUDINAMICO-BACKEND-TQS
Scopes: EC TQS
SICBP-COMMON-BACKEND-TQS (45)
SICBP-COMMON-BACKEND-TQS
Scopes: EC TQS
SICBP-MENUDINAMICO-BACKEND-HMP (1)
Grupo de variáveis de SICBP-MENUDINAMICO-BACKEND-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD,EC PRD2
SICBP-MENUDINAMICO-BACKEND-PRD (36)
Grupo de variáveis de SICBP-MENUDINAMICO-BACKEND-PRD
Scopes: EC PRD
SICBP-MENUDINAMICO-BACKEND-PRD2 (36)
Grupo de variáveis de SICBP-MENUDINAMICO-BACKEND-PRD2
Scopes: EC PRD2
|Manage variable groups
Showing filters 1 through 2
