Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIFAP-centralizadora-backend-intranet
Search








All pipelines

SIFAP

SIFAP-centralizadora-backend-intranet
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
EGRESS_IP_OKD (81)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
CI_NAME
7366CLU-OKD4-NPRD
KIND_DEPLOY
deploymentconfig
OKD_4_API
api.nprd.caixa:6443
OKD_4_REGISTRY
default-route-openshift-image-registry.apps.nprd.caixa
OKD_4_TOKEN
********
OKD_4_URL_SUFFIX
apps.nprd.caixa
OKD_4_USER_SERVICE
ads-sa
OKD_URL_SUFFIX
apps.nprd.caixa
OKD_USER_SERVICE
ads-sa
TIMEOUT_DEPLOY
600
TOKEN_CRQ
********
URL_CRQ
https://infradevops-novoportal-backend-prd.apps.produtos4.caixa/api.php?acao=devopsCaixacriarMudancaPadrao
SIFAP-CENTRALIZADORA-BACKEND-INTRANET-DES (35)
Grupo de variáveis de SIFAP-CENTRALIZADORA-BACKEND-INTRANET-DES
Scopes: EC DES
API_MANAGER_SIFAP_MINISTERIO_URL
https://sifap-ministerio-backend-des.apps.nprd.caixa
MINISTERIO_FARMACIA_API_KEY
l79721b771df984cd49f161f881fd65734
MINISTERIO_FARMACIA_API_KEY_HEADER
x-api-key
MINISTERIO_FARMACIA_AWAIT_TIMEOUT_SEGUNDOS
35
MINISTERIO_FARMACIA_CONNECT_TIMEOUT_MS
5000
MINISTERIO_FARMACIA_READ_TIMEOUT_MS
30000
MINISTERIO_FARMACIA_USE_TOKEN_SERVICE_FALLBACK
false
SECRET_API_KEY
********
SECRET_API_OIDC_TOKEN_CLIENT_SECRET
********
SECRET_SENHA_MSSQL
********
_ENV.API_MANAGER_AZURE_SIMTR_URL
https://simtr-gestao-documento-des.apps.nprd.caixa
_ENV.API_MANAGER_HOST
https://sifap-centralizadora-frontend-intranet-des.apps.nprd.caixa
_ENV.API_MANAGER_SIICO_INFO_PRIVADAS
https://api.des.caixa:8443/informacoes-corporativas-privadas
_ENV.API_MANAGER_SIICO_URL
https://api.des.caixa:8443/informacoes-corporativas-publicas
_ENV.API_MANAGER_SIMTR_URL
https://api.des.caixa:8443/simtr
_ENV.API_OIDC_CLIENT
cli-ser-fap
_ENV.API_OIDC_REALM
intranet
_ENV.API_OIDC_URL_HOST
https://login.des.caixa/auth
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=99ee6c02-0bc8-4c2e-8109-b744a54e07ae;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_PROXY
http://proxydes.caixa:80
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SIFAP-CENTRALIZADORA-BACKEND-INTRANET-DES
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
10
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djavax.net.ssl.trustStoreType=JKS -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.6.2.jar"
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:sqlserver://10.116.92.87:1433;databaseName=FAPDB001;encrypt=false;trustServerCertificate=true"
_ENV.QUARKUS_DATASOURCE_USERNAME
SFAPDR01
_ENV.QUARKUS_LOG_LEVEL
DEBUG
_ENV.QUARKUS_ORIGINS
https://sifap-centralizadora-frontend-intranet-des.apps.nprd.caixa
_ENV.QUARKUS_PORT
8080
_ENV.SIISO_URL
https://api.des.caixa:8443/cadastro-receita
_ENV.TRUST_ALL
false
_SECRET.API_OIDC_TOKEN_CLIENT_SECRET
#{SECRET_API_OIDC_TOKEN_CLIENT_SECRET}#
_SECRET.API_kEY
#{SECRET_API_KEY}#
_SECRET.QUARKUS_DATASOURCE_PASSWORD
#{SECRET_SENHA_MSSQL}#
SIFAP-CENTRALIZADORA-BACKEND-INTRANET-BT-VAULT-DES (2)
Grupo de variáveis de SIFAP-CENTRALIZADORA-BACKEND-INTRANET-BT-VAULT-DES
Scopes: EC DES
BT_CLIENT_ID
INIT
Criado via api
SIFAP-BT-VAULT-SECRET-DES (2)
Scopes: EC DES
BT_CLIENT_ID
142428a6-68a1-49b4-9b34-bd4c1a1f345f
BT_CLIENT_SECRET
********
SIFAP-CENTRALIZADORA-BACKEND-INTRANET-TQS (29)
Grupo de variáveis de SIFAP-CENTRALIZADORA-BACKEND-INTRANET-TQS

Scopes: EC TQS
INIT
Criado via api
SECRET_API_KEY
********
SECRET_API_OIDC_TOKEN_CLIENT_SECRET
********
SECRET_SENHA_MSSQL
********
_ENV.API_MANAGER_AZURE_SIMTR_URL
https://simtr-gestao-documento-des.apps.nprd.caixa
_ENV.API_MANAGER_HOST
https://sifap-centralizadora-frontend-intranet-tqs.apps.nprd.caixa
_ENV.API_MANAGER_SIICO_INFO_PRIVADAS
https://api.des.caixa:8443/informacoes-corporativas-privadas
_ENV.API_MANAGER_SIICO_URL
https://api.des.caixa:8443/informacoes-corporativas-publicas
_ENV.API_MANAGER_SIMTR_URL
https://api.des.caixa:8443/simtr
_ENV.API_OIDC_CLIENT
cli-ser-fap
_ENV.API_OIDC_REALM
intranet
_ENV.API_OIDC_URL_HOST
https://login.des.caixa/auth
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=99ee6c02-0bc8-4c2e-8109-b744a54e07ae;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SIFAP-CENTRALIZADORA-BACKEND-INTRANET-TQS
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djavax.net.ssl.trustStoreType=JKS -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.6.2.jar"
_ENV.JAVA_OPTIONS_DISABLED
"-Djavax.net.debug=ssl,handshake"
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:sqlserver://10.116.28.45:1433;databaseName=FAPDB001;encrypt=false;trustServerCertificate=true"
_ENV.QUARKUS_DATASOURCE_USERNAME
SFAPTR02
_ENV.QUARKUS_LOG_LEVEL
DEBUG
_ENV.QUARKUS_ORIGINS
https://sifap-centralizadora-frontend-intranet-tqs.apps.nprd.caixa
_ENV.QUARKUS_PORT
8080
_ENV.SIISO_URL
https://api.des.caixa:8443/cadastro-receita
_ENV.TRUST_ALL
false
_SECRET.API_OIDC_TOKEN_CLIENT_SECRET
#{SECRET_API_OIDC_TOKEN_CLIENT_SECRET}#
_SECRET.API_kEY
#{SECRET_API_KEY}#
_SECRET.QUARKUS_DATASOURCE_PASSWORD
#{SECRET_SENHA_MSSQL}#
SIFAP-CENTRALIZADORA-BACKEND-INTRANET-HMP (29)
Grupo de variáveis de SIFAP-CENTRALIZADORA-BACKEND-INTRANET-HMP TAS000048313297
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SIFAP-CENTRALIZADORA-BACKEND-INTRANET-PRD (29)
Grupo de variáveis de SIFAP-CENTRALIZADORA-BACKEND-INTRANET-PRD
Scopes: EC PRD
|Manage variable groups
Row 2

Showing filters 1 through 2

