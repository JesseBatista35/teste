Skip to main content
projetos
/
Caixa
/
Pipelines
/
Library
Search









Library

SIFAP-CENTRALIZADORA-BACKEND-INTRANET-DES

Variable group
Properties
Variable group name
SIFAP-CENTRALIZADORA-BACKEND-INTRANET-DES
Description
Grupo de variáveis de SIFAP-CENTRALIZADORA-BACKEND-INTRANET-DES


Variables
_ENV.API_MANAGER_AZURE_SIMTR_URL
https://simtr-gestao-documento-des.apps.nprd.caixa
_ENV.API_MANAGER_HOST
https://sifap-centralizadora-frontend-intranet-des.apps.nprd.caixa
_ENV.API_MANAGER_SIFAP_MINISTERIO_URL
https://sifap-ministerio-backend-des.apps.nprd.caixa
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
_ENV.MINISTERIO_FARMACIA_AWAIT_TIMEOUT_SEGUNDOS
35
_ENV.MINISTERIO_FARMACIA_CONNECT_TIMEOUT_MS
5000
_ENV.MINISTERIO_FARMACIA_READ_TIMEOUT_MS
30000
_ENV.MINISTERIO_FARMACIA_USE_TOKEN_SERVICE_FALLBACK
false
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
_ENVI.MINISTERIO_FARMACIA_API_KEY_HEADER
x-api-key
_SECRET.API_kEY
#{SECRET_API_KEY}#
_SECRET.API_OIDC_TOKEN_CLIENT_SECRET
#{SECRET_API_OIDC_TOKEN_CLIENT_SECRET}#
_SECRET.MINISTERIO_FARMACIA_API_KEY
#{SECRET_MINISTERIO_FARMACIA_API_KEY}#
_SECRET.QUARKUS_DATASOURCE_PASSWORD
#{SECRET_SENHA_MSSQL}#
SECRET_API_KEY
********
SECRET_API_OIDC_TOKEN_CLIENT_SECRET
********
SECRET_MINISTERIO_FARMACIA_API_KEY
********
SECRET_SENHA_MSSQL
********


FICARAM ASSIM VOU ROIDANR UMA NOVA RELASE
