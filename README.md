ESSE É O SISP-med-auditoria que ta funcionamndo nroamemnteo

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
SISPI-med-auditoria
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
SISPI

SISPI-med-auditoria
Cria_APP_OKD_ATUALIZA_VARIAVEIS
Task version
13.*
Display name
Cria_APP_OKD
AMBIENTE
$(AMBIENTE)
CGC_UNIDADE_DES
$(CGC_UNIDADE_DES)
CGC_UNIDADE_OPS
$(CGC_UNIDADE_OPS)
Enviroment
$(Enviroment)
is_new_app
$(is_new_app)
ISTIO_INJECTION
$(ISTIO_INJECTION)
KIND_DEPLOY
$(KIND_DEPLOY)
OCP_LOTERIAS_URL_SUFFIX_PRD
$(OCP_LOTERIAS_URL_SUFFIX_PRD)
OCP_URL_SUFFIX
$(OCP_URL_SUFFIX)
OCP_URL_SUFFIX_PRD
$(OCP_URL_SUFFIX_PRD)
OKD_REGISTRY
$(OKD_REGISTRY)
OKD_TOKEN_REGISTRY
$(OKD_TOKEN_REGISTRY)
OKD_URL_SUFFIX
$(OKD_URL_SUFFIX)
OKD_URL_SUFFIX_APL
$(OKD_URL_SUFFIX_APL)
OKD_USER_SERVICE_REGISTRY
$(OKD_USER_SERVICE_REGISTRY)
OPENSHIFT_LOTERIAS_URL_SUFFIX_NPRD
$(OPENSHIFT_LOTERIAS_URL_SUFFIX_NPRD)
OPENSHIFT_LOTERIAS_URL_SUFFIX_PRD
$(OPENSHIFT_LOTERIAS_URL_SUFFIX_PRD)
PASSWORD_CGC
$(PASSWORD_CGC)
PORTALIF
$(PORTALIF)
PROJETO
$(PROJETO)
REPOSITORIO
$(REPOSITORIO)
resource_app
$(resource_app)
SITE
$(SITE)
TemplateRelease_OKD
$(TemplateRelease_OKD)
URL_CUSTOMIZADA
$(URL_CUSTOMIZADA)
USER_CGC
$(USER_CGC)
Control Options
Output Variables
Expanded

Collapsed

Row 2

Row 2

Row 3

Row 2

Row 2

492 pipelines found

263 pipelines found

Select a release pipeline to view its releases

149 pipelines found

Select a release pipeline to view its releases

147 pipelines found

Select a release pipeline to view its releases

3 pipelines found

Row 2

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
SISPI-med-auditoria
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
SISPI

SISPI-med-auditoria
Predefined variables
Filter by keywords
Scope


_ENV.JAVA_OPTS_MONITORING
"-javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sispi -Delastic.apm.environment=$(AMBIENTE) -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=$(URL_APM_SERVER) -Delastic.apm.global_labels=deployment=$(REPOSITORIO)"
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
sispi-med-auditoria
SITE
ocp_nprd
SITE
ocp_prd
TemplateRelease_OKD
openshift/quarkus-caixa-release
UNIDADE
BR
URL_APM_SERVER
http://apm-server-devops.apps.produtos4.caixa
Expanded

Collapsed

Row 2

Row 2

Row 3

Row 2

Row 2

492 pipelines found

263 pipelines found

Select a release pipeline to view its releases

149 pipelines found

Select a release pipeline to view its releases

147 pipelines found

Select a release pipeline to view its releases

3 pipelines found

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
SISPI-med-auditoria
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
SISPI

SISPI-med-auditoria
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
OCP-NPRD (8)
Credenciais para o Cluster OCP de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SISPI-MED-AUDITORIA-DES (21)
Grupo de variáveis de SISPI-MED-AUDITORIA-DES
Scopes: EC DES
INIT
Criado via api
VAULT_LOCATION
/usr/src/app/secrets_files/SISPI_DES/,/usr/src/app/secrets_files/SISPI_DES/SIMPI
_ENV.JAVA_OPTIONS_APPEND
"-Xms1536m -Xmx1536m -Dquarkus.log.category.\"br.gov.caixa.med\".level=DEBUG -Dquarkus.log.category.\"br.gov.caixa.med\".min-level=DEBUG"
_ENV.JAVA_TOOL_OPTIONS
"-Dfile.encoding=UTF8"
_ENV.KAFKA_BOOTSTRAP_PORT
443
_ENV.KAFKA_BOOTSTRAP_SERVER
"development-kafka-tlsext-bootstrap-cp4i.apps.pixnprd4.caixa"
_ENV.KAFKA_USER
dev
_ENV.KEY_STORE_KAFKA_CLIENT_LOCATION
/deployments/sispi_user_keystore_kafka_des.p12
_ENV.KEY_STORE_KAFKA_CLIENT_PASSWORD
'${SISPI_USER_KEYSTORE}'
_ENV.QUANTIDADE_THREADS_PROCESSAMENTO_KAFKA
50
_ENV.QUARKUS.DATASOURCE_JDBC_URL
"jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=off)(ADDRESS=(PROTOCOL=TCP)(HOST=10.116.101.16)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=CDBD08NGPDB017)(SERVER=DEDICATED)))"
_ENV.QUARKUS.DATASOURCE_PASSWORD
'${SMPIBD01_ORACLE}'
_ENV.QUARKUS.DATASOURCE_USERNAME
SMPIBD01
_ENV.QUARKUS_DATASOURCE_JDBC_INITIAL-SIZE
5
_ENV.QUARKUS_DATASOURCE_JDBC_MAX-SIZE
50
_ENV.QUARKUS_DATASOURCE_JDBC_MIN-SIZE
5
_ENV.SISPI_MED_TOPICO_LOG_AUDITORIA_RECEBIMENTO_MENSAGENS
PIX.MED.AUDITORIA.EVENTO.REQUISICAO
_ENV.SISPI_MED_TOPICO_LOG_AUDITORIA_RECEBIMENTO_MENSAGENS_DLQ
PIX.MED.AUDITORIA.EVENTO.REQUISICAO.DLQ
_ENV.TRUST_STORE_KAFKA_CLIENT_LOCATION
/deployments/keystore_event_streams.p12
_ENV.TRUST_STORE_KAFKA_CLIENT_PASSWORD
'${SISPI_KAFKA_TRUSTSTORE}'
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
SISPI-med-auditoria-BT-VAULT-DES (1)
WO0000080988066 - Criação de library
Scopes: EC DES
BT_SECRETS_LIST
SISPI_DES/SIMPI/SMPIBD01_ORACLE,SISPI_DES/SISPI_KAFKA,SISPI_DES/SISPI_KAFKA_TRUSTSTORE,SISPI_DES/SISPI_USER_KEYSTORE
SISPI-BT-VAULT-SECRET-DES (2)
Scopes: EC DES
BT_CLIENT_ID
275c2d45-5b73-446b-a336-6fcf0103ecd4
BT_CLIENT_SECRET
********
SISPI-MED-AUDITORIA-TQS (1)
Grupo de variáveis de SISPI-MED-AUDITORIA-TQS
Scopes: EC TQS
INIT
Criado via api
SISPI-MED-AUDITORIA-HMP (1)
Grupo de variáveis de SISPI-MED-AUDITORIA-HMP
Scopes: EC HMP
INIT
Criado via api
OCP-PRD (16)
Credenciais para o Cluster OCP de PRD
Scopes: EC PRD
ISTIO_INJECTION
enabled
KIND_DEPLOY
deploymentconfig
OCP_API_PRD
api.pix4.caixa:6443
OCP_LOTERIAS_API_PRD
api.ocp-loterias.caixa:6443
OCP_LOTERIAS_TOKEN_PRD
********
OCP_LOTERIAS_URL_SUFFIX_PRD
apps.ocp-loterias.caixa
OCP_REGISTRY_PRD
default-route-openshift-image-registry.apps.produtos4.caixa
OCP_TOKEN_PRD
********
OCP_URL_SUFFIX_PRD
apps.pix4.caixa
OCP_USER_SERVICE_PRD
ads
SISPI_BACKEND_TEMPO_MAXIMO_TRANSACAO_INTERNA_SEGUNDOS
40
TIMEOUT_DEPLOY
600
_ENV.QUARKUS_DATASOURCE_JDBC-PROPERTIES_CLIENTHOSTNAME
SISPL_CONSULTA_APOSTAS_X
_ENV.QUARKUS_DATASOURCE_JDBC-PROPERTIES_CLIENTPROGRAMNAME
SISPL_CONSULTA_APOSTAS_OCP
_ENV.QUARKUS_DATASOURCE_JDBC_IDLE-REMOVAL-INTERVAL
90
_ENV.QUARKUS_DATASOURCE_JDBC_MAX-LIFETIME
300
SISPI-MED-AUDITORIA-PRD (1)
Grupo de variáveis de SISPI-MED-AUDITORIA-PRD

Scopes: EC PRD
INIT
Criado via api
|Manage variable groups
Expanded

Collapsed

Row 2

Row 2

Row 3

Row 2

Row 2

263 pipelines found

Select a release pipeline to view its releases

149 pipelines found

Select a release pipeline to view its releases

147 pipelines found

Select a release pipeline to view its releases

3 pipelines found

Row 2

Showing filters 1 through 2

Showing filters 1 through 2

Showing filters 1 through 2



Showing filters 1 through 2

