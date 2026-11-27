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
EGRESS_IP_OKD (88)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SIFAP-CENTRALIZADORA-BACKEND-INTRANET-DES (35)
Grupo de variáveis de SIFAP-CENTRALIZADORA-BACKEND-INTRANET-DES
Scopes: EC DES
SECRET_API_KEY
********
SECRET_API_OIDC_TOKEN_CLIENT_SECRET
********
SECRET_MINISTERIO_FARMACIA_API_KEY
********
SECRET_SENHA_MSSQL
********
_ENV.API_MANAGER_AZURE_SIMTR_URL
https://simtr-gestao-documento-des.apps.nprd.caixa
_ENV.API_MANAGER_HOST
https://sifap-centralizadora-frontend-intranet-des.apps.nprd.caixa
_ENV.API_MANAGER_SIFAP_MINISTERIO_URL
https://sifap-ministerio-backend-intranet-des.apps.nprd.caixa
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
_ENV.MINISTERIO_FARMACIA_API_KEY_HEADER
x-api-key
_ENV.MINISTERIO_FARMACIA_AWAIT_TIMEOUT_SEGUNDOS
35
_ENV.MINISTERIO_FARMACIA_CONNECT_TIMEOUT_MS
5000
_ENV.MINISTERIO_FARMACIA_READ_TIMEOUT_MS
30000
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
_SECRET.MINISTERIO_FARMACIA_API_KEY
#{SECRET_MINISTERIO_FARMACIA_API_KEY}#
_SECRET.QUARKUS_DATASOURCE_PASSWORD
#{SECRET_SENHA_MSSQL}#
SIFAP-CENTRALIZADORA-BACKEND-INTRANET-BT-VAULT-DES (2)
Grupo de variáveis de SIFAP-CENTRALIZADORA-BACKEND-INTRANET-BT-VAULT-DES
Scopes: EC DES
SIFAP-BT-VAULT-SECRET-DES (2)
Scopes: EC DES
SIFAP-CENTRALIZADORA-BACKEND-INTRANET-TQS (35)
Grupo de variáveis de SIFAP-CENTRALIZADORA-BACKEND-INTRANET-TQS
Scopes: EC TQS
INIT
Criado via api
SECRET_API_KEY
********
SECRET_API_OIDC_TOKEN_CLIENT_SECRET
********
SECRET_MINISTERIO_FARMACIA_API_KEY
********
SECRET_SENHA_MSSQL
********
_ENV.API_MANAGER_AZURE_SIMTR_URL
https://simtr-gestao-documento-des.apps.nprd.caixa
_ENV.API_MANAGER_HOST
https://sifap-centralizadora-frontend-intranet-tqs.apps.nprd.caixa
_ENV.API_MANAGER_SIFAP_MINISTERIO_URL
https://sifap-ministerio-backend-intranet-tqs.apps.nprd.caixa
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
_ENV.MINISTERIO_FARMACIA_API_KEY_HEADER
x-api-key
_ENV.MINISTERIO_FARMACIA_AWAIT_TIMEOUT_SEGUNDOS
35
_ENV.MINISTERIO_FARMACIA_READ_TIMEOUT_MS
30000
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
_SECRET.MINISTERIO_FARMACIA_API_KEY
#{SECRET_MINISTERIO_FARMACIA_API_KEY}#
_SECRET.QUARKUS_DATASOURCE_PASSWORD
#{SECRET_SENHA_MSSQL}#
SIFAP-CENTRALIZADORA-BACKEND-INTRANET-HMP (36)
Grupo de variáveis de SIFAP-CENTRALIZADORA-BACKEND-INTRANET-HMP TAS000048313297

Scopes: EC HMP
SECRET_API_KEY
********
SECRET_API_OIDC_TOKEN_CLIENT_SECRET
********
SECRET_MINISTERIO_FARMACIA_API_KEY
********
SECRET_SENHA_MSSQL
********
_ENV.API_MANAGER_AZURE_SIMTR_URL
https://simtr-gestao-documento-des.apps.nprd.caixa
_ENV.API_MANAGER_HOST
https://sifap-centralizadora-frontend-intranet-hmp.apps.nprd.caixa
_ENV.API_MANAGER_SIFAP_MINISTERIO_URL
https://sifap-centralizadora-backend-intranet-hmp.apps.nprd.caixa
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
_ENV.API_OIDC_TOKEN_CLIENT_SECRET
https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
_ENV.API_OIDC_URL_HOST
https://login.des.caixa/auth
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=99ee6c02-0bc8-4c2e-8109-b744a54e07ae;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SIFAP-CENTRALIZADORA-BACKEND-INTRANET-HMP
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
10
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djavax.net.ssl.trustStoreType=JKS -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.6.2.jar"
_ENV.JAVA_OPTIONS_DISABLED
"-Djavax.net.debug=ssl,handshake"
_ENV.MINISTERIO_FARMACIA_API_KEY_HEADER
x-api-key
_ENV.MINISTERIO_FARMACIA_AWAIT_TIMEOUT_SEGUNDOS
35
_ENV.MINISTERIO_FARMACIA_CONNECT_TIMEOUT_MS
5000
_ENV.MINISTERIO_FARMACIA_READ_TIMEOUT_MS
30000
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:sqlserver://10.116.124.91:1433;databaseName=FAPDB001;encrypt=false;trustServerCertificate=true"
_ENV.QUARKUS_DATASOURCE_USERNAME
SFAPHR01
_ENV.QUARKUS_LOG_LEVEL
INFO
_ENV.QUARKUS_ORIGINS
https://sifap-centralizadora-frontend-intranet-hmp.apps.nprd.caixa
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
_SECRET.MINISTERIO_FARMACIA_API_KEY
#{SECRET_MINISTERIO_FARMACIA_API_KEY}#
_SECRET.QUARKUS_DATASOURCE_PASSWORD
#{SECRET_SENHA_MSSQL}#
OKD-4-APL (12)
Scopes: EC PRD
SIFAP-CENTRALIZADORA-BACKEND-INTRANET-PRD (29)
Grupo de variáveis de SIFAP-CENTRALIZADORA-BACKEND-INTRANET-PRD
Scopes: EC PRD
|Manage variable groups
Collapsed

Row 2

Row 3

Row 4

Row 4

Row 2

Row 2

No pipelines match your search

Select a release pipeline to view its releases

No pipelines match your search

Select a release pipeline to view its releases

20 pipelines found

Select a release pipeline to view its releases

5 pipelines found

Select a release pipeline to view its releases

3 pipelines found

Row 3

Row 2

Row 3

Showing filters 1 through 2

