2026-09-02T13:47:03.7481915Z ##[section]Starting: Resumo da Release
2026-09-02T13:47:03.7484937Z ==============================================================================
2026-09-02T13:47:03.7485015Z Task         : Bash
2026-09-02T13:47:03.7485059Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-02T13:47:03.7485133Z Version      : 3.227.0
2026-09-02T13:47:03.7485178Z Author       : Microsoft Corporation
2026-09-02T13:47:03.7485228Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-02T13:47:03.7485392Z ==============================================================================
2026-09-02T13:47:04.8234032Z Generating script.
2026-09-02T13:47:04.8251190Z ========================== Starting Command Output ===========================
2026-09-02T13:47:04.8265947Z [command]/bin/bash /opt/ads-agent/_work/_temp/80cc1a6d-0104-40fe-932c-f38b043cfb9e.sh
2026-09-02T13:47:04.8305267Z URL do Projeto no OKD: api.nprd.caixa:6443/console/project/simil-des/overview
2026-09-02T13:47:04.8310423Z /opt/ads-agent/_work/_temp/80cc1a6d-0104-40fe-932c-f38b043cfb9e.sh: line 82: ISTIO_INJECTION: comando não encontrado
2026-09-02T13:47:04.8319671Z /opt/ads-agent/_work/_temp/80cc1a6d-0104-40fe-932c-f38b043cfb9e.sh: line 92: CONTEXTO_JBOSS: comando não encontrado
2026-09-02T13:47:05.0651461Z APP Publicada na URL: https://simil-precificacao-internet-api-des.apps.nprd.caixa
2026-09-02T13:47:05.0736526Z ##[section]Finishing: Resumo da Release



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
SIMIL-precificacao-internet-api
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
SIMIL

SIMIL-precificacao-internet-api
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
SIMIL-PRECIFICACAO-INTERNET-API-DES (45)
Grupo de variáveis de SIMIL-PRECIFICACAO-INTERNET-API-DES

Scopes: EC DES
SIICO_API_KEY
********
SPRING_DATASOURCE_PASSWORD
********
SPRING_OAUTH2_INTERNET_CLIENT_SECRET
********
SPRING_OAUTH2_INTRANET_CLIENT_SECRET
********
_ENV.API_BASE_URL
https://simil-precificacao-internet-api-des.apps.nprd.caixa/habitacao/precificacao
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
_ENV.CORS_ALLOWED_ORIGINS
https://simil-precificacao-internet-frontend-des.apps.nprd.caixa/
_ENV.OAUTH2_RESOURCE_SERVER_ISSUER_URI
https://logindes.caixa.gov.br/auth/realms/internet
_ENV.SERVER_COMPRESSION_ENABLE
true
_ENV.SERVER_SERVLET_CONTEXT_PATH
/habitacao/precificacao
_ENV.SPRING_APPLICATION_NAME
simil-precificacao-internet-api
_ENV.SPRING_DATABASE_PLATFORM
org.hibernate.dialect.PostgreSQLDialect
_ENV.SPRING_DATASOURCE_DRIVER
org.postgresql.Driver
_ENV.SPRING_DATASOURCE_HIKARI_CONNECTION_TIMEOUT
20000
_ENV.SPRING_DATASOURCE_HIKARI_IDLE_TIMEOUT
300000
_ENV.SPRING_DATASOURCE_HIKARI_MAXIMUM_POOL_SIZE
50
_ENV.SPRING_DATASOURCE_HIKARI_MAX_LIFETIME
1200000
_ENV.SPRING_DATASOURCE_HIKARI_MINIMUM_IDLE
5
_ENV.SPRING_DATASOURCE_URL
jdbc:postgresql://SCTDEDADLX0004.DF.CAIXA:5432/DESENVOLVIMENTO?sslmode=disable
_ENV.SPRING_DATASOURCE_USERNAME
mil_prd_001
_ENV.SPRING_DEFAULT_SCHEMA
milsm001
_ENV.SPRING_HIBERNATE_DDL_AUTO
validate
_ENV.SPRING_HIBERNATE_FORMAT_SQL
true
_ENV.SPRING_HIBERNATE_JDBC_BATCH_SIZE
50
_ENV.SPRING_HIBERNATE_ORDER_INSERTS
true
_ENV.SPRING_HIBERNATE_ORDER_UPDATES
true
_ENV.SPRING_OAUTH2_CLIENT_ID
cli-ser-mil-prc
_ENV.SPRING_OAUTH2_GRANT_TYPE
client_credentials
_ENV.SPRING_SHOW_SQL
false
_ENV.SPRING_USE_SQL_COMMENTS
true
_ENV.SPRING_WEB_RESOURCES_ADD_MAPPINGS
false
_ENV.SWAGGER_GENERIC_RESPONSE
false
_ENV.SWAGGER_PACKAGES_SCAN
br.gov.caixa.simil.precificacao.internet.api.controller
_ENV.SWAGGER_PATHS_MATCH
/**
_ENV.SWAGGER_SHOW_ACTUATOR
true
_ENV.SWAGGER_TAG_SORTER
alpha
_ENV.SWAGGER_TRY_IT_OUT_ENABLED
true
_ENV.SWAGGER_UI_OPERATIONS_SORTER
method
_ENV.SWAGGER_UI_PATH
/swagger-ui.html
_ENV.SWAGGER_USE_ROOT_PATH
true
_ENV_JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_SECRET.SIICO_API_KEY
#{SIICO_API_KEY}#
_SECRET.SPRING_DATASOURCE_PASSWORD
#{SPRING_DATASOURCE_PASSWORD}#
_SECRET.SPRING_OAUTH2_INTERNET_CLIENT_SECRET
#{SPRING_OAUTH2_INTERNET_CLIENT_SECRET}#
_SECRET.SPRING_OAUTH2_INTRANET_CLIENT_SECRET
#{SPRING_OAUTH2_INTRANET_CLIENT_SECRET}#
SIMIL-PRECIFICACAO-INTERNET-API-TQS (40)
Grupo de variáveis de SIMIL-PRECIFICACAO-INTERNET-API-TQS
Scopes: EC TQS
SIMIL-PRECIFICACAO-INTERNET-API-HMP (1)
Grupo de variáveis de SIMIL-PRECIFICACAO-INTERNET-API-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SIMIL-PRECIFICACAO-INTERNET-API-PRD (1)
Grupo de variáveis de SIMIL-PRECIFICACAO-INTERNET-API-PRD
Scopes: EC PRD
|Manage variable groups
Row 2

Showing filters 1 through 2

1 pipelines found

Select a release pipeline to view its releases

1 pipelines found

Select a release pipeline to view its releases

3 pipelines found

Row 2

Row 2

Showing filters 1 through 2




TINHA TE PASSADO ERRADO O DO INTRANET O QUE ESTAOS MECHENDO É INTERNET
