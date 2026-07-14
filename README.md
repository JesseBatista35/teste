<img width="1863" height="916" alt="image" src="https://github.com/user-attachments/assets/1756623d-3fff-457d-9d40-0d807eea884b" />





2026-07-10T17:14:12.3490564Z ##[section]Starting: Exportando Variáveis de Ambiente "_ENV."
2026-07-10T17:14:12.3495056Z ==============================================================================
2026-07-10T17:14:12.3495181Z Task         : Bash
2026-07-10T17:14:12.3495256Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-10T17:14:12.3495383Z Version      : 3.227.0
2026-07-10T17:14:12.3495429Z Author       : Microsoft Corporation
2026-07-10T17:14:12.3495485Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-10T17:14:12.3495614Z ==============================================================================
2026-07-10T17:14:12.5127270Z Generating script.
2026-07-10T17:14:12.5140304Z ========================== Starting Command Output ===========================
2026-07-10T17:14:12.5148164Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/41a4f317-cfc2-4eb0-9e2e-55a2ae4cd4e1.sh
2026-07-10T17:14:12.5271325Z JAVA_OPTIONS_APPEND="-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
2026-07-10T17:14:12.5272723Z JAVA_OPTS_MONITORING="-javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sispi -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.apps.produtos4.caixa -Delastic.apm.global_labels=deployment=sispi-dict-api-med"
2026-07-10T17:14:12.5273422Z PIX_FRAMEWORK_TOKEN_CLIENT_ID=cli-ser-spi
2026-07-10T17:14:12.5273852Z PIX_FRAMEWORK_TOKEN_SECRET_ID='${sispi_secret_intranet}'
2026-07-10T17:14:12.5274142Z PIX_FRAMEWORK_TOKEN_URL=https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
2026-07-10T17:14:12.5274370Z PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_EMISSOR="https://login.des.caixa/auth/realms/intranet"
2026-07-10T17:14:12.5274829Z PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_URL="https://sispi-api-proxy-sso-des.apps.pixnprd4.caixa/auth/realms/intranet;https://login.des.caixa/auth/realms/intranet"
2026-07-10T17:14:12.5275090Z PIX_FRAMEWORK_VALIDACAO_TOKEN_VALIDACAO_GLOBAL=true
2026-07-10T17:14:12.5275447Z QUARKUS_DATASOURCE_JDBC_URL="jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/CDBD08NGPDB017"
2026-07-10T17:14:12.5275814Z QUARKUS_DATASOURCE_PASSWORD='${sspibd03_oracle}'
2026-07-10T17:14:12.5276021Z QUARKUS_DATASOURCE_USERNAME=SSPIBD03
2026-07-10T17:14:12.5276254Z SISPI_API_KEY='${sispi_api_key}'
2026-07-10T17:14:12.5276374Z SISPI_ISPB_CAIXA=00360305
2026-07-10T17:14:12.5276598Z SISPI_LOGIN_CAIXA_INTRANET_SECRET='${sispi_secret_intranet}'
2026-07-10T17:14:12.5276800Z SISPI_LOGIN_CAIXA_INTRANET_URL="https://login.des.caixa/auth/realms/intranet"
2026-07-10T17:14:12.5277074Z SISPI_MPI_DICT_URL="https://simpi-container-dict-des.apps.pixnprd4.caixa"
2026-07-10T17:14:12.5347378Z ##[section]Finishing: Exportando Variáveis de Ambiente "_ENV."





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
SISPI-dict-api-med
/
SISPI-dict-api-med-20260710.1407-1.0.0-SNAPSHOT(1)
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
SISPI-dict-api-med

SISPI-dict-api-med-20260710.1407-1.0.0-SNAPSHOT(1)
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
OCP-NPRD (8)
Credenciais para o Cluster OCP de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SISPI-DICT-API-MED-DES (18)
Grupo de variáveis de SISPI-DICT-API-MED-DES
Scopes: EC DES
PASSWORD_DB
********
VAULT_LOCATION
********
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.PIX_FRAMEWORK_TOKEN_CLIENT_ID
cli-ser-spi
_ENV.PIX_FRAMEWORK_TOKEN_SECRET_ID
'${sispi_secret_intranet}'
_ENV.PIX_FRAMEWORK_TOKEN_URL
https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
_ENV.PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_EMISSOR
"https://login.des.caixa/auth/realms/intranet"
_ENV.PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_URL
"https://sispi-api-proxy-sso-des.apps.pixnprd4.caixa/auth/realms/intranet;https://login.des.caixa/auth/realms/intranet"
_ENV.PIX_FRAMEWORK_VALIDACAO_TOKEN_VALIDACAO_GLOBAL
true
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/CDBD08NGPDB017"
_ENV.QUARKUS_DATASOURCE_PASSWORD
'${sspibd03_oracle}'
_ENV.QUARKUS_DATASOURCE_USERNAME
SSPIBD03
_ENV.SISPI_API_KEY
'${sispi_api_key}'
_ENV.SISPI_ISPB_CAIXA
00360305
_ENV.SISPI_LOGIN_CAIXA_INTRANET_SECRET
'${sispi_secret_intranet}'
_ENV.SISPI_LOGIN_CAIXA_INTRANET_URL
"https://login.des.caixa/auth/realms/intranet"
_ENV.SISPI_MPI_DICT_URL
"https://simpi-container-dict-des.apps.pixnprd4.caixa"
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
SISPI-DICT-API-MED-BT-VAULT-DES (1)
SISPI-DICT-API-MED-BT-VAULT-DES
Scopes: EC DES
SISPI-BT-VAULT-SECRET-DES (2)
Scopes: EC DES
SISPI-DICT-API-MED-TQS (1)
Grupo de variáveis de SISPI-DICT-API-MED-TQS
Scopes: EC TQS
SISPI-DICT-API-MED-HMP (1)
Grupo de variáveis de SISPI-DICT-API-MED-HMP
Scopes: EC HMP
OCP-PRD (16)
Credenciais para o Cluster OCP de PRD
Scopes: OCP4 EC PRD CANAIS
SISPI-DICT-API-MED-PRD (14)
Grupo de variáveis de SISPI-DICT-API-MED-PRD
Scopes: OCP4 EC PRD CANAIS
SISPI-DICT-API-MED-BT-VAULT-PRD (1)
SISPI-DICT-API-MED-BT-VAULT-PRD
Scopes: OCP4 EC PRD CANAIS
SISPI-BT-VAULT-SECRET-PRD (2)
Scopes: OCP4 EC PRD CANAIS
Cannot edit in read-only editor
Select a release pipeline to view its releases

1 pipelines found

Showing 7 deployments

Expanded

Collapsed

Collapsed

Expanded

Collapsed

Task disabled

EC DESDeploy release

477 pipelines found

Select a release pipeline to view its releases

140 pipelines found

Select a release pipeline to view its releases

26 pipelines found

Row 3

Row 2

Expanded

Collapsed

Showing filters 1 through 2





eles falram que criaram o simpi-med baseado no sispi-dicit-api-med e esse ta fncionadno
