2026-08-28T12:40:36.9542758Z ##[section]Starting: Resumo da Release
2026-08-28T12:40:36.9546446Z ==============================================================================
2026-08-28T12:40:36.9546535Z Task         : Bash
2026-08-28T12:40:36.9546579Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-28T12:40:36.9546638Z Version      : 3.227.0
2026-08-28T12:40:36.9546689Z Author       : Microsoft Corporation
2026-08-28T12:40:36.9546736Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-28T12:40:36.9546804Z ==============================================================================
2026-08-28T12:40:37.7772287Z Generating script.
2026-08-28T12:40:37.7783231Z ========================== Starting Command Output ===========================
2026-08-28T12:40:37.7790488Z [command]/bin/bash /opt/ads-agent/_work/_temp/3bd9089c-17d0-4f5b-b95c-b27c60a4ec1b.sh
2026-08-28T12:40:37.7840971Z URL do Projeto no OKD: api.nprd.caixa:6443/console/project/simil-des/overview
2026-08-28T12:40:37.7845163Z /opt/ads-agent/_work/_temp/3bd9089c-17d0-4f5b-b95c-b27c60a4ec1b.sh: line 82: ISTIO_INJECTION: comando não encontrado
2026-08-28T12:40:37.7850320Z /opt/ads-agent/_work/_temp/3bd9089c-17d0-4f5b-b95c-b27c60a4ec1b.sh: line 92: CONTEXTO_JBOSS: comando não encontrado
2026-08-28T12:40:38.0264129Z APP Publicada na URL: https://simil-precificacao-intranet-api-des.apps.nprd.caixa
2026-08-28T12:40:38.0363457Z ##[section]Finishing: Resumo da Release



mais tem que corrgir porque o resumo da relaise tem que apontar para o link correto

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
SIMIL-precificacao-intranet-api
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
SIMIL-precificacao-intranet-api
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
SIMIL-PRECIFICACAO-INTRANET-API-DES (49)
Grupo de variáveis de SIMIL-PRECIFICACAO-INTRANET-API-DES

Scopes: EC DES
INIT
Criado via api
URL_APM_SERVER
simil
_ENV.API_BASE_URL
https://simil-precificacao-intranet-api-des.apps.nprd.caixa
_ENV.API_LOCALIDADES_BASE_URL
https://api.des.caixa:8443/informacoes-corporativas-publicas/v2
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
_ENV.CAIXA_API_AUTH_URL
https://login.des.caixa/auth/realms/intranet
_ENV.CAIXA_API_BASE_URL
https://api.des.caixa:8443/informacoes-corporativas-publicas
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.JWT_OAUTH2_SET_URI
false
_ENV.JWT_SET_URI
https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/certs
_ENV.SERVER_COMPREESION_ENABLE
true
_ENV.SIICO_API_KEY
l7206c7a21f6334eca8e9f08e50e4efa7f
_ENV.SIICO_API_URL
https://api.des.caixa:8443/informacoes-corporativas-publicas/v2/localidades/municipios/
_ENV.SIICO_CLIENT_ID
cli-web-mil
_ENV.SIICO_CLIENT_SECRET
350fdfc0-1596-4355-ac1b-30b346c2113c
_ENV.SIICO_TOKEN_URL
https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
_ENV.SPRING_APPLICATION_NAME
simil-precificacao-intranet-api
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
jdbc:postgresql://SCTDEDADLX0004.DF.CAIXA:5432/DESENVOLVIMENTO?sslmode=disable\&preferQueryMode=simple
_ENV.SPRING_DATASOURCE_USERNAME
mil_prd_001
_ENV.SPRING_DEFAULT_SCHEMA
milsm001
_ENV.SPRING_HIBERNATE_DDL_AUTO
validate
_ENV.SPRING_HIBERNATE_FORMAT_SQL
true
_ENV.SPRING_HIBERNATE_JDBC_BATCH_SIZE
20
_ENV.SPRING_HIBERNATE_ORDER_INSERTS
true
_ENV.SPRING_HIBERNATE_ORDER_UPDATES
true
_ENV.SPRING_OAUTH2_CLIENT_ID
cli-ser-mil
_ENV.SPRING_OAUTH2_CLIENT_SECRET
https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
_ENV.SPRING_OAUTH2_GRANT_TYPE
client_credentials
_ENV.SPRING_OAUTH2_SET_URI
https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/certs
_ENV.SPRING_SHOW_SQL
false
_ENV.SPRING_USE_SQL_COMMENTS
true
_ENV.SPRING_WEB_RESOURCES_ADD_MAPPINGS
false
_ENV.SWAGGER_GENERIC_RESPONSE
false
_ENV.SWAGGER_PACKAGES_SCAN
br.gov.caixa.simil.precificacao.intranet.api.presentation.controller
_ENV.SWAGGER_PATHS_MATCH
/**
_ENV.SWAGGER_SHOW_ACTUATOR
false
_ENV.SWAGGER_TAG_SORTER
alpha
_ENV.SWAGGER_TRY_IT_OUT_ENABLED
true
_ENV.SWAGGER_UI_OPERATIONS_SORTER
method
_ENV.SWAGGER_UI_PATH
/swagger-ui.html
_ENV.SWAGGER_USE_ROOT_PATH
false
_SECRET.SPRING_DATASOURCE_PASSWORD
********
SIMIL-PRECIFICACAO-INTRANET-API-TQS (49)
Grupo de variáveis de SIMIL-PRECIFICACAO-INTRANET-API-TQS
Scopes: EC TQS
SIMIL-PRECIFICACAO-INTRANET-API-HMP (1)
Grupo de variáveis de SIMIL-PRECIFICACAO-INTRANET-API-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SIMIL-PRECIFICACAO-INTRANET-API-PRD (1)
Grupo de variáveis de SIMIL-PRECIFICACAO-INTRANET-API-PRD
Scopes: EC PRD
|Manage variable groups
Expanded

Collapsed

Row 16. Clickable

2 pipelines found

Row 3

Row 3

290 pipelines found

Select a release pipeline to view its releases

12 pipelines found

Select a release pipeline to view its releases

8 pipelines found

Select a release pipeline to view its releases

8 pipelines found

Row 7

Showing filters 1 through 2

Row 2

Showing filters 1 through 2

