2026-11-09T13:46:40.7836080Z ##[section]Starting: Atualizando Variáveis de Ambiente
2026-11-09T13:46:40.7839411Z ==============================================================================
2026-11-09T13:46:40.7839577Z Task         : Bash
2026-11-09T13:46:40.7839625Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-09T13:46:40.7839698Z Version      : 3.227.0
2026-11-09T13:46:40.7839744Z Author       : Microsoft Corporation
2026-11-09T13:46:40.7839798Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-09T13:46:40.7840004Z ==============================================================================
2026-11-09T13:46:40.9179039Z Generating script.
2026-11-09T13:46:40.9191336Z ========================== Starting Command Output ===========================
2026-11-09T13:46:40.9198843Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/b101c29f-5db6-43e6-a4ac-f56118aab517.sh
2026-11-09T13:46:40.9253027Z Nova APP: false
2026-11-09T13:46:41.1188822Z error: one or more resources must be specified as <resource> <name> or <resource>/<name>
2026-11-09T13:46:41.1189407Z See 'oc set env -h' for help and examples
2026-11-09T13:46:41.1252676Z ##[error]Bash exited with code '1'.
2026-11-09T13:46:41.1266826Z ##[section]Finishing: Atualizando Variáveis de Ambiente



Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SISMN-gecci-okd4
Search








All pipelines

SISMN

SISMN-gecci-okd4
Predefined variables
Filter by keywords
Scope


_ENV.JAVA_OPTS_MONITORING
"-javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=$(REPOSITORIO) -Delastic.apm.environment=$(AMBIENTE) -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=$(URL_APM_SERVER) -Delastic.apm.global_labels=deployment=$(REPOSITORIO) -Delastic.apm.verify_server_cert=false"
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
SISTEMAAMBIENTE
des
SISTEMAAMBIENTE
tqs
SISTEMAAMBIENTE
hmp
SISTEMAAMBIENTE
prd
SISTEMANOME
sismn-gecci
SITE
okd4_nprd
SITE
okd4_prd
TemplateRelease_OKD
openshift/quarkus-caixa-release
UNIDADE
BR
URL_APM_SERVER
https://apm-server-devops.apps.produtos4.caixa/
Splitter expanded

Expanded

Showing 2 items.

Showing 6757 items.

Showing 1 items.

Collapsed

Expanded

Collapsed

1 pipelines found

Row 2

Row 2

Showing filters 1 through 2

Cannot edit in read-only editor


Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SISMN-gecci-okd4
Search








All pipelines

SISMN

SISMN-gecci-okd4
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
SISMN-GECCI-DES (38)
Grupo de variáveis de SISMN-GECCI-DES WO0000072503730 - Configuração NFS ISILON path-pdf: ${APL_NORMAS_PATH_PDF:/opt/normas/Publicado/Pdf} path-doc: ${APL_NORMAS_PATH_DOC:/opt/normas/Publicado/Doc} path-modelo: ${APL_NORMAS_PATH_MODELO:/opt/normas/Publicado/Modelo}
Scopes: EC DES
SISMN-gecct-BT-VAULT-DES (3)
SISMN-gecct-BT-VAULT-DES
Scopes: EC DES
SISMN-GECCI-TQS (36)
Grupo de variáveis de SISMN-GECCI-TQS

Scopes: EC TQS
CLI_SER_SMN_SECRET
********
SMN_APIKEY
********
SYSBASEDB01_DBPASS
********
_ENV.APL_AGENDAMENTO_LOCKFILE_IDLE
2400
_ENV.APL_AUTH_SERVICO_CLIENT_ID
cli-ser-smn
_ENV.APL_EMAIL_CONFIG_LINK
https://sismn-web-tqs.apps.nprd.caixa/
_ENV.APL_EMAIL_CONFIG_SMTP_HOST
smtptest.correiolivre.caixa
_ENV.APL_EMAIL_CONFIG_SMTP_PASSWORD
HyTe5827
_ENV.APL_EMAIL_CONFIG_SMTP_PORT
25
_ENV.APL_EMAIL_CONFIG_SMTP_SENDER
sismn@corp.caixa.gov.br
_ENV.APL_EMAIL_CONFIG_SMTP_USER
s739047
_ENV.APL_EMAIL_DATA_SEARCH_ENABLED
true
_ENV.APL_INTEGRACAO_APIM_HOST
https://api.des.caixa:8443
_ENV.APL_LOG_DIAS
7
_ENV.APL_MANUTENCAO_GRUPOS
","
_ENV.APL_NORMAS_FILE_PERMISSION
704
_ENV.APL_NORMAS_PATH_INDEX
/opt/normas/indexacao
_ENV.APL_NORMAS_PATH_RAW
/opt/normas/Compart/Pdf
_ENV.APL_NORMAS_PATH_ROOT
/opt/normas/Compart/
_ENV.APL_NORMAS_PUBLICADO_DOC
/opt/normas/Compart/Publicado
_ENV.APL_NORMAS_PUBLICADO_MODELO
/opt/normas/Compart/Publicado
_ENV.APL_NORMAS_PUBLICADO_PDF
/opt/normas/Compart/Publicado
_ENV.APL_NORMAS_REVOGADO_DOC
/opt/normas/Compart/Doc/Revogado
_ENV.APL_NORMAS_REVOGADO_PDF
/opt/normas/Compart/Pdf/Revogado
_ENV.APL_NORMAS_VIGENTE_DOC
/opt/normas/Compart/Doc/Vigente
_ENV.APL_NORMAS_VIGENTE_MODELO
/opt/normas/Compart/Modelos
_ENV.APL_NORMAS_VIGENTE_PDF
/opt/normas/Compart/Pdf/Vigente
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.QUARKUS_DATASOURCE_JDBC_URL
jdbc:sqlserver://AGSQLDES100.extra.caixa.gov.br:22100;databaseName=master;integratedSecurity=true;authenticationScheme=ntlm;encrypt=true;trustServerCertificate=true;sendTimeAsDateTime=false;
_ENV.QUARKUS_DATASOURCE_USERNAME
f710695
_ENV.QUARKUS_HTTP_CORS_ORIGINS
*
_ENV.QUARKUS_LOG_LEVEL
DEBUG
_ENV.QUARKUS_OIDC_AUTH_SERVER_URL
https://login.des.caixa/auth/realms/intranet
_SECRET.APL_AUTH_SERVICO_CLIENT_SECRET
#{CLI_SER_SMN_SECRET}#
_SECRET.APL_INTEGRACAO_SIICO_APIKEY
#{SMN_APIKEY}#
_SECRET.QUARKUS_DATASOURCE_PASSWORD
#{SYSBASEDB01_DBPASS}#
SISMN-GECCI-HMP (1)
Grupo de variáveis de SISMN-GECCI-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SISMN-GECCI-PRD (43)
Grupo de variáveis de SISMN-GECCI-PRD
Scopes: EC PRD
|Manage variable groups
Splitter expanded

Expanded

Showing 2 items.

Showing 6757 items.

Showing 1 items.

Collapsed

Expanded

Collapsed

1 pipelines found

Row 2

Row 2

Showing filters 1 through 2

Cannot edit in read-only editor

