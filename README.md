Nâo foi possível gerar a Release do SIBEM - SIBEM-bens-preciosos-internet-backend
Estamos configurando a monitoração do AppInsights no ambiente

Foi feito o ajuste na aplicação e agora esta apresentando o erro no okd4:
Error opening zip file or JAR manifest missing : /deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.1.jar

Solicitamos que seja adicionado ou informado onde esta esse arquivo "com.microsoft.azure.applicationinsights-agent-3.7.1.jar"

Essa caminho é definido na library "SIBEM-BENS-PRECIOSOS-INTERNET-BACKEND-DES" variável "_ENV.JAVA_OPTIONS_APPEND"


Link release: https://devops.caixa/projetos/Caixa/_releaseProgress?releaseId=489789&_a=release-pipeline-progress


2026-06-22T20:05:38.2532256Z ##[section]Starting: Logs da Aplicação
2026-06-22T20:05:38.2535370Z ==============================================================================
2026-06-22T20:05:38.2535461Z Task         : Bash
2026-06-22T20:05:38.2535505Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-22T20:05:38.2535577Z Version      : 3.227.0
2026-06-22T20:05:38.2535632Z Author       : Microsoft Corporation
2026-06-22T20:05:38.2535683Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-22T20:05:38.2535765Z ==============================================================================
2026-06-22T20:05:39.2502527Z Generating script.
2026-06-22T20:05:39.2512040Z ========================== Starting Command Output ===========================
2026-06-22T20:05:39.2519340Z [command]/bin/bash /opt/ads-agent/_work/_temp/e0dbf6e7-8e7a-4e78-9ff3-99d9eeac378e.sh
2026-06-22T20:05:39.2577906Z + shopt -s expand_aliases
2026-06-22T20:05:39.2579594Z + [[ -n okd4_nprd ]]
2026-06-22T20:05:39.2579857Z + [[ okd4_nprd =~ ocp ]]
2026-06-22T20:05:39.2580000Z + [[ -n okd4_nprd ]]
2026-06-22T20:05:39.2580096Z + [[ okd4_nprd =~ okd4 ]]
2026-06-22T20:05:39.2580343Z + app=sibem-bens-preciosos-internet-backend-des
2026-06-22T20:05:39.2581999Z + oc version
2026-06-22T20:05:39.4117746Z oc v3.11.0+0cbc58b
2026-06-22T20:05:39.4118222Z kubernetes v1.11.0+d4cacc0
2026-06-22T20:05:39.4118754Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-06-22T20:05:39.4208334Z 
2026-06-22T20:05:39.4209047Z Server https://api.nprd.caixa:6443
2026-06-22T20:05:39.4209352Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-06-22T20:05:39.4245104Z ++ oc get pod -l name=sibem-bens-preciosos-internet-backend-des -n sibem-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-06-22T20:05:39.4252288Z ++ tac
2026-06-22T20:05:39.4252484Z ++ grep -v '^$'
2026-06-22T20:05:39.4252798Z ++ head -n1
2026-06-22T20:05:39.7123767Z + last_pod=sibem-bens-preciosos-internet-backend-des-76-xg2f2
2026-06-22T20:05:39.7124134Z + echo 'Logs do POD: sibem-bens-preciosos-internet-backend-des-76-xg2f2'
2026-06-22T20:05:39.7124403Z + oc logs sibem-bens-preciosos-internet-backend-des-76-xg2f2 -c sibem-bens-preciosos-internet-backend-des -n sibem-des
2026-06-22T20:05:39.7124683Z Logs do POD: sibem-bens-preciosos-internet-backend-des-76-xg2f2
2026-06-22T20:05:40.0911195Z exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/com.microsoft.azure.applicationinsights-agent-3.7.1.jar -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sibem-bens-preciosos-internet-backend -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=https://apm-server-devops.apps.produtos4.caixa/ -Delastic.apm.global_labels=deployment=sibem-bens-preciosos-internet-backend -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/backend.jar
2026-06-22T20:05:40.0911807Z Error occurred during initialization of VM
2026-06-22T20:05:40.0911960Z agent library failed to init: instrument
2026-06-22T20:05:40.0912249Z Error opening zip file or JAR manifest missing : /deployments/lib/com.microsoft.azure.applicationinsights-agent-3.7.1.jar
2026-06-22T20:05:40.0990594Z ##[section]Finishing: Logs da Aplicação



de onde vem esse arqivo?

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
SIBEM-bens-preciosos-internet-backend
/
SIBEM-bens-preciosos-internet-backend-20260622.1648-1.8.2.0-SNAPSHOT(2)
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
SIBEM-bens-preciosos-internet-backend

SIBEM-bens-preciosos-internet-backend-20260622.1648-1.8.2.0-SNAPSHOT(2)


EC DES

Failed


Pipeline

Tasks

Variables

Logs

Tests
Predefined variables
Filter by keywords
Release (+1)


_ENV.JAVA_OPTIONS
"-Dserver.address=0.0.0.0 -Dserver.port=8080"
_ENV.JAVA_OPTS_MONITORING
"-javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=$(REPOSITORIO) -Delastic.apm.environment=$(AMBIENTE) -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=$(URL_APM_SERVER) -Delastic.apm.global_labels=deployment=$(REPOSITORIO)"
AMBIENTE
des
AMBIENTE_BUILD
build-images-ads
CGC_UNIDADE_DES
7390
CGC_UNIDADE_OPS
7259
PASSWORD_TRUSTSTORE
changeit
SISTEMAAMBIENTE
des
SISTEMANOME
SITE
okd4_nprd
TemplateRelease_OKD
openshift/springboot-caixa-release
UNIDADE
URL_APM_SERVER
https://apm-server-devops.apps.produtos4.caixa/
Showing 25 filtered items.

Showing 42 filtered items.

38 pipelines found

Select a release pipeline to view its releases

7 pipelines found

Select a release pipeline to view its releases

3 pipelines found

Select a release pipeline to view its releases

2 pipelines found

Row 2

Row 2

Row 2

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
SIBEM-bens-preciosos-internet-backend
/
SIBEM-bens-preciosos-internet-backend-20260622.1648-1.8.2.0-SNAPSHOT(2)
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
SIBEM-bens-preciosos-internet-backend

SIBEM-bens-preciosos-internet-backend-20260622.1648-1.8.2.0-SNAPSHOT(2)


EC DES

Failed

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
Usuario-Azure-DevOps (10)
Scopes: Release
EGRESS_IP_OKD (67)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OKD-4-NPRD (13)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SIBEM-BENS-PRECIOSOS-INTERNET-BACKEND-DES (37)
Grupo de variáveis de SIBEM-BENS-PRECIOSOS-INTERNET-BACKEND-DES
Scopes: EC DES
_ENV.AMBIENTE
des
_ENV.APIKEY
********
_ENV.APPLICATIONINSIGHTS_CONFIGURATION_CONTENT
'{"sampling":{"overrides":[{"telemetryType":"request","attributes":[{"key":"url.path","value":"^(\/q)?\/health\/.*","matchType":"regexp"}],"percentage":0}]}}'
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=131b0c5f-9604-4106-af25-3f4c6a024f83;IngestionEndpoint=https://southcentralus-3.in.applicationinsights.azure.com/;LiveEndpoint=https://southcentralus.livediagnostics.monitor.azure.com/;ApplicationId=556bd368-9a4f-4d8c-ba62-debe0d653ced"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_PROXY
http://proxydes.caixa:80
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SIBEM-BENS-PRECIOSOS-INTERNET-BACKEND-DES
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.APPLICATION_SERVER_IP
10.116.221.182
_ENV.AZURE_STORAGE_MSHEADER
BlockBlob
_ENV.AZURE_STORAGE_MSTAGS
documento-vinculado=false
_ENV.AZURE_STORAGE_URL
https://dossiedigitaldes.blob.core.windows.net
_ENV.DATASOURCE_HOST
cnpexdadvm01-scan4.extra.caixa.gov.br
_ENV.DATASOURCE_PASS
********
_ENV.DATASOURCE_PORT
1521
_ENV.DATASOURCE_SCHEMA_NAME
bem
_ENV.DATASOURCE_SN
PDBD001NG
_ENV.DATASOURCE_USER
SBEMBD01
_ENV.FRONTEND_URL
https://sibem-bens-preciosos-internet-frontend-des.apps.nprd.caixa
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/com.microsoft.azure.applicationinsights-agent-3.7.1.jar"
_ENV.KEYCLOAK_CLIENT_ID
cli-ser-bem
_ENV.KEYCLOAK_CLIENT_SECRET
********
_ENV.KEYCLOAK_ISSUER_URI
https://login.des.caixa/auth/realms/intranet
_ENV.KEYCLOAK_ISSUER_URI_INTERNET
https://logindes.caixa.gov.br/auth/realms/internet
_ENV.KEYCLOAK_TOKEN_URI
https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
_ENV.LEILOES_URL
https://api.des.caixa:8443/leilao-penhor/v2
_ENV.RECEITA_FEDERAL_URL
https://api.des.caixa:8443/cadastro-receita/v4
_ENV.SIECM_URL
https://siecm.des.caixa/siecm-web/ECM/v1
_ENV.SIPEN_LICITACAO_URL
https://api.des.caixa:8443/licitacao/penhor/joias/v1/
_JVM_HEAP_MAX
2048m
_JVM_HEAP_MIN
1024m
_JVM_METASPACE_MAX
512m
_JVM_METASPACE_MIN
256m
_SECRET.APIKEY
#{_ENV.APIKEY}#
_SECRET.DATASOURCE_PASS
#{_ENV.DATASOURCE_PASS}#
_SECRET.KEYCLOAK_CLIENT_SECRET
#{_ENV.KEYCLOAK_CLIENT_SECRET}#
SIBEM-BENS-PRECIOSOS-INTERNET-BACKEND-TQS (37)
Grupo de variáveis de SIBEM-BENS-PRECIOSOS-INTERNET-BACKEND-TQS
Scopes: EC TQS
SIBEM-BENS-PRECIOSOS-INTERNET-BACKEND-HMP (1)
Grupo de variáveis de SIBEM-BENS-PRECIOSOS-INTERNET-BACKEND-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SIBEM-BENS-PRECIOSOS-INTERNET-BACKEND-PRD (34)
Grupo de variáveis de SIBEM-BENS-PRECIOSOS-INTERNET-BACKEND-PRD
Scopes: EC PRD
Showing 25 filtered items.

Showing 42 filtered items.

38 pipelines found

Select a release pipeline to view its releases

7 pipelines found

Select a release pipeline to view its releases

3 pipelines found

Select a release pipeline to view its releases

2 pipelines found

Row 2

Row 2

Row 2

Showing filters 1 through 2

