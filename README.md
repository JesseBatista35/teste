a demanda original é essa 

Avaliar Os módulos DES sigfa-api-saldo-consolidado-des e TQS sigfa-api-saldo-consolidado-tqs estão configurados no appinsights com suas variáveis de ambiente para o LDAI-Cambio-Investimentos-Merc-Capitais e InstrumentationKey=f572e239-b089-4d0c-82a5-4c33b3325748.

Contudo, não aparecem no AppInsights na consulta de amostras quando de sua execução.

Solicito averiguar e corrigir as vinculações.

LDAI:
https://portal.azure.com/#@caixa.onmicrosoft.com/resource/subscriptions/323f3ed7-7b41-42f2-b116-0a8b58d3e597/resourceGroups/LOGDIGITAL-TROUBLESHOOT-DES/providers/microsoft.insights/components/LDAI-Cambio-Investimentos-Merc-Capitais/overview



eu troquei:  

_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING :  de isso:  "InstrumentationKey=f572e239-b089-4d0c-82a5-4c33b3325748;IngestionEndpoint=https://southcentralus-3.in.applicationinsights.azure.com/;LiveEndpoint=https://southcentralus.livediagnostics.monitor.azure.com/"


para isso: InstrumentationKey=f572e239-b089-4d0c-82a5-4c33b3325748;IngestionEndpoint=https://southcentralus-3.in.applicationinsights.azure.com/;LiveEndpoint=https://southcentralus.livediagnostics.monitor.azure.com/;ApplicationId=61c6dfc8-5716-480a-9f90-ff399e465819


depois fui rodar um teste e comoeçlou dar esses problemas..

que nao tem anda a ver com a configuraçao do app insghts

Filter by keywords
Scope


AMBIENTE
des
AMBIENTE
tqs
AMBIENTE
hmp
AMBIENTE
prd
AMBIENTE_BUILD
build-images-ads
CGC_UNIDADE_DES
7390
CGC_UNIDADE_OPS
7259
fortify_disable
false
PASSWORD_TRUSTSTORE
changeit
SITE
okd4_nprd
SITE
okd4_prd
TemplateRelease_OKD
openshift/quarkus-caixa-release
UNIDADE
BR

============


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
SIGFA-api-saldo-consolidado
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
SIGFA

SIGFA-api-saldo-consolidado
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
EGRESS_IP_OKD (74)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SIGFA-API-SALDO-CONSOLIDADO-DES (26)
Grupo de variáveis de SIGFA-API-SALDO-CONSOLIDADO-DES

Scopes: EC DES
VAULT_LOCATION
/usr/src/app/secrets_files/SIGFA_DES/
_ENV.AMBIENTE
des
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
InstrumentationKey=f572e239-b089-4d0c-82a5-4c33b3325748;IngestionEndpoint=https://southcentralus-3.in.applicationinsights.azure.com/;LiveEndpoint=https://southcentralus.livediagnostics.monitor.azure.com/;ApplicationId=61c6dfc8-5716-480a-9f90-ff399e465819
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_PROXY
http://proxydes.caixa:80
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SIGFA-api-saldo-consolidado-DES
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.CAIXA_SIGFA_AUTORIZACAO_CANAIS_LIBERADOS
cli-ser-gfa,cli-web-gfa
_ENV.CAIXA_SIGFA_LOG_TRANSACAO_CANAIS_IGNORADOS
cli-ser-gfa,cli-web-gfa
_ENV.DESLIGAR_REGISTRO_TRANSACAO
false
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.6.2.jar"
_ENV.LOGS_LEVEL_REST_CLIENT
INFO
_ENV.NO_PROXY
"*.caixa,*.caixa.gov.br"
_ENV.QUARKUS_DATASOURCE_JDBC_MAX_SIZE
30
_ENV.QUARKUS_DATASOURCE_JDBC_MIN_SIZE
10
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:oracle:thin:@cnpexdadvm01-scan8.extra.caixa.gov.br:1521/ORAD05BC"
_ENV.QUARKUS_DATASOURCE_PASSWORD
'${SGFADS01_ORACLE}'
_ENV.QUARKUS_DATASOURCE_USERNAME
SGFADS01
_ENV.QUARKUS_LOG_LEVEL
TRACE
_ENV.QUARKUS_LOG_MIN_LEVEL
TRACE
_ENV.QUARKUS_OIDC_AUTH_SERVER_URL
https://login.des.caixa/auth/realms/intranet
_ENV.QUARKUS_OIDC_INTERNET_AUTH_SERVER_URL
https://logindes.caixa.gov.br/auth/realms/internet
_ENV.QUARKUS_SWAGGER_UI_ALWAYS_INCLUDE
false
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
SIGFA-BT-VAULT-SECRET-DES (2)
Scopes: EC DES
SIGFA-API-SALDO-CONSOLIDADO-BT-VAULT-DES (1)
Scopes: EC DES
SIGFA-API-SALDO-CONSOLIDADO-TQS (26)
Grupo de variáveis de SIGFA-API-SALDO-CONSOLIDADO-TQS
Scopes: EC TQS
SIGFA-API-SALDO-CONSOLIDADO-BT-VAULT-TQS (1)
Scopes: EC TQS
SIGFA-BT-VAULT-SECRET-TQS (2)
Scopes: EC TQS
SIGFA-API-SALDO-CONSOLIDADO-HMP (1)
Grupo de variáveis de SIGFA-API-SALDO-CONSOLIDADO-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SIGFA-API-SALDO-CONSOLIDADO-PRD (1)
Grupo de variáveis de SIGFA-API-SALDO-CONSOLIDADO-PRD
Scopes: EC PRD
SIGFA-BT-VAULT-SECRET-PRD (2)
Scopes: EC PRD
SIGFA-API-SALDO-CONSOLIDADO-BT-VAULT-PRD (1)
Scopes: EC PRD
|Manage variable groups
Showing 25 filtered items.

Showing 25 filtered items.

Get started and run this pipeline for the first time!

Showing 46 filtered items.

Showing 25 filtered items.

1 pipelines found

Showing 26 deployments

Expanded

Row 4

Collapsed

Row 2

Expanded

Collapsed

Row 2

Showing 26 deployments

Row 2

Expanded

Collapsed

Showing filters 1 through 2

Showing filters 1 through 2



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
SIGFA-api-saldo-consolidado
/
SIGFA-api-saldo-consolidado-20260714.1613-1.0.0.0-SNAPSHOT(1)
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
SIGFA-api-saldo-consolidado

SIGFA-api-saldo-consolidado-20260714.1613-1.0.0.0-SNAPSHOT(1)


EC DES

Succeeded


Pipeline

Tasks

Variables

Logs

Tests
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
EGRESS_IP_OKD (74)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SIGFA-API-SALDO-CONSOLIDADO-DES (26)
Grupo de variáveis de SIGFA-API-SALDO-CONSOLIDADO-DES
Scopes: EC DES
VAULT_LOCATION
/usr/src/app/secrets_files/SIGFA_DES/
_ENV.AMBIENTE
des
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=f572e239-b089-4d0c-82a5-4c33b3325748;IngestionEndpoint=https://southcentralus-3.in.applicationinsights.azure.com/;LiveEndpoint=https://southcentralus.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_PROXY
http://proxydes.caixa:80
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SIGFA-api-saldo-consolidado-DES
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.CAIXA_SIGFA_AUTORIZACAO_CANAIS_LIBERADOS
cli-ser-gfa,cli-web-gfa
_ENV.CAIXA_SIGFA_LOG_TRANSACAO_CANAIS_IGNORADOS
cli-ser-gfa,cli-web-gfa
_ENV.DESLIGAR_REGISTRO_TRANSACAO
false
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.6.2.jar"
_ENV.LOGS_LEVEL_REST_CLIENT
INFO
_ENV.NO_PROXY
"*.caixa,*.caixa.gov.br"
_ENV.QUARKUS_DATASOURCE_JDBC_MAX_SIZE
30
_ENV.QUARKUS_DATASOURCE_JDBC_MIN_SIZE
10
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:oracle:thin:@cnpexdadvm01-scan8.extra.caixa.gov.br:1521/ORAD05BC"
_ENV.QUARKUS_DATASOURCE_PASSWORD
'${SGFADS01_ORACLE}'
_ENV.QUARKUS_DATASOURCE_USERNAME
SGFADS01
_ENV.QUARKUS_LOG_LEVEL
TRACE
_ENV.QUARKUS_LOG_MIN_LEVEL
TRACE
_ENV.QUARKUS_OIDC_AUTH_SERVER_URL
https://login.des.caixa/auth/realms/intranet
_ENV.QUARKUS_OIDC_INTERNET_AUTH_SERVER_URL
https://logindes.caixa.gov.br/auth/realms/internet
_ENV.QUARKUS_SWAGGER_UI_ALWAYS_INCLUDE
false
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
SIGFA-BT-VAULT-SECRET-DES (2)
Scopes: EC DES
SIGFA-API-SALDO-CONSOLIDADO-BT-VAULT-DES (1)
Scopes: EC DES
SIGFA-API-SALDO-CONSOLIDADO-TQS (26)
Grupo de variáveis de SIGFA-API-SALDO-CONSOLIDADO-TQS
Scopes: EC TQS
SIGFA-API-SALDO-CONSOLIDADO-BT-VAULT-TQS (1)
Scopes: EC TQS
SIGFA-BT-VAULT-SECRET-TQS (2)
Scopes: EC TQS
SIGFA-API-SALDO-CONSOLIDADO-HMP (1)
Grupo de variáveis de SIGFA-API-SALDO-CONSOLIDADO-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SIGFA-API-SALDO-CONSOLIDADO-PRD (1)
Grupo de variáveis de SIGFA-API-SALDO-CONSOLIDADO-PRD
Scopes: EC PRD
SIGFA-BT-VAULT-SECRET-PRD (2)
Scopes: EC PRD
SIGFA-API-SALDO-CONSOLIDADO-BT-VAULT-PRD (1)
Scopes: EC PRD
Showing 25 filtered items.

Get started and run this pipeline for the first time!

Showing 46 filtered items.

Showing 25 filtered items.

1 pipelines found

Showing 26 deployments

Row 4

Collapsed

Row 2

Expanded

Collapsed

Row 2

Showing 26 deployments

Row 2

Expanded

Collapsed

Showing filters 1 through 2

Showing filters 1 through 2

Row 7

Showing filters 1 through 2



