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
SISPI-qrcode-api-validador
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
SISPI-QRCODE

SISPI-qrcode-api-validador
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
7261
NEWMAN_PATH_COLLECTION
/Collections-Automatizadas/QRCode/Pacotes_Azure/PACOTE_SISPI_QRCODE_API_VALIDADOR_DES.postman_collection.json
NEWMAN_PATH_COLLECTION_ENVIRONMENT
/Collections-Automatizadas/QRCode/Pacotes_Azure/SISPI_AUTO_DES.postman_environment.json
NEWMAN_SOURCE_ALIAS
_SISPI-teste-certificacao
PASSWORD_TRUSTSTORE
changeit
SISTEMAAMBIENTE
des
SISTEMANOME
sispi-qrcode-api-validador
SITE
ocp_nprd
SITE
ocp_nprd
SITE
ocp_nprd
SITE
ocp_nprd
SITE
ocp_prd
TemplateRelease_OKD
openshift/quarkus-caixa-release
UNIDADE
SP
URL_APM_SERVER
http://apm-server-devops.apps.produtos4.caixa
URL_APM_SERVER
http://apm-server-devops.apps.produtos4.caixa
URL_CUSTOMIZADA
sispi-qrcode-api-validador.pix.caixa
Row 2

Row 2

16 pipelines found

Select a release pipeline to view its releases

10 pipelines found

Select a release pipeline to view its releases

10 pipelines found

Select a release pipeline to view its releases

1 pipelines found

Select a release pipeline to view its releases

1 pipelines found

Expanded

Collapsed

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
SISPI-qrcode-api-validador
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
SISPI-QRCODE

SISPI-qrcode-api-validador
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
SISPI-QRCODE-API-VALIDADOR-DES (39)
add novas variaveis para o ocp4

Scopes: OCP4 EC DES
VAULT_LOCATION
********
_ENV.CACHE_CERTIFICADOS_REFRESH_TIME_SEG
1200s
_ENV.CACHE_CHAVESASSINATURA_REFRESH_TIME_SEG
1200s
_ENV.DATASOURCE_SPX_PASSWORD
'${SSPXBD01_ORACLE_DG}'
_ENV.DATASOURCE_SPX_URL
"jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/CDBD08NGPDB017"
_ENV.DATASOURCE_SPX_USERNAME
SSPXBD01
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-cedesbr_azurepush_atualizado.jks"
_ENV.JAVA_TOOL_OPTIONS
"-Dfile.encoding=UTF8"
_ENV.PIX_DICT_URL
https://sispi-container-dict-des.apps.pixnprd4.caixa/
_ENV.PIX_SUPORTE_PROXY_BYPASS_FOR
".caixa;.sispl-des;.sispl-tqs;.svc;sispi-qrcode-api-externo;sispx-pix-automatico-externo-api"
_ENV.PIX_SUPORTE_PROXY_HOST
proxydes.caixa
_ENV.PIX_SUPORTE_PROXY_PORTA
80
_ENV.PIX_SUPORTE_PROXY_SENHA
'${SISPI_PROXY}'
_ENV.PIX_SUPORTE_PROXY_USUARIO
s739019
_ENV.QUARKUS_DATASOURCE_DATAGUARD_JDBC_URL
"jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=off)(ADDRESS=(PROTOCOL=TCP)(HOST=10.116.101.16)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=CDBD08NGPDB017)(SERVER=DEDICATED)))"
_ENV.QUARKUS_DATASOURCE_DATAGUARD_PASSWORD
'${SSPIBD04_ORACLE}'
_ENV.QUARKUS_DATASOURCE_DATAGUARD_USERNAME
SSPIBD04
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=off)(ADDRESS=(PROTOCOL=TCP)(HOST=10.116.101.16)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=CDBD08NGPDB017)(SERVER=DEDICATED)))"
_ENV.QUARKUS_DATASOURCE_PASSWORD
'${SSPIBD03_ORACLE}'
_ENV.QUARKUS_DATASOURCE_USERNAME
SSPIBD03
_ENV.SISPI.QRCODE.DICT.CACHE.MAX.SIZE
10000
_ENV.SISPI.QRCODE.DICT.CACHE.TTL.SECONDS
300
_ENV.SISPI_CERTIFICADOS_CACHE_RESET
"0 */10 * ? * * *"
_ENV.SISPI_CLIENT_ID_SPI
cli-ser-spi
_ENV.SISPI_LOGIN_CAIXA_INTRANET_SECRET
'${SISPI_SECRET_INTRANET}'
_ENV.SISPI_PIX_URL_QRCODE
pix-qrcode-h.caixa.gov.br
_ENV.SISPI_QRCODE_CACHE_RELOAD
"0 0/1 * ? * * *"
_ENV.SISPI_QRCODE_CERTIFICADOS_CACHE_EVERY
10m
_ENV.SISPI_QRCODE_CERTIFICADOS_CACHE_MAX_SIZE
10000
_ENV.SISPI_QRCODE_JKU_CACHE_EVERY
5m
_ENV.SISPI_QRCODE_JKU_CACHE_MAX_SIZE
10000
_ENV.SISPI_QRCODE_JKU_CACHE_TTL_MINUTES
5
_ENV.SISPI_QRCODE_QDT_RETRY
3
_ENV.SISPI_QRCODE_TEMPO_DELAY
5
_ENV.SISPI_QRCODE_URL_EXTERNA
pix-qrcode-h.caixa.gov.br
_ENV.SISPI_QRCODE_URL_INTERNA
sispi-qrcode-api-externo-des:8080
_ENV.SISPI_QRCODE_VALIDACAO_TIMEOUT
5000
_ENV.SISPX_QRCODE_URL_INTERNA
sispx-pix-automatico-externo-api-des.sispx-des:8080
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
OCP-NPRD (8)
Credenciais para o Cluster OCP de NPRD (DES/TQS/HMP)
Scopes: OCP4 EC DES,OCP4 QA-DES,OCP4 EC TQS,OCP4 EC HMP
ISTIO_INJECTION
enabled
KIND_DEPLOY
deploymentconfig
OCP_API
api.pixnprd4.caixa:6443
OCP_REGISTRY
default-route-openshift-image-registry.apps.pixnprd4.caixa
OCP_TOKEN
********
OCP_URL_SUFFIX
apps.pixnprd4.caixa
OCP_USER_SERVICE
ads
TIMEOUT_DEPLOY
300
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: OCP4 EC DES,OCP4 QA-DES,OCP4 EC TQS,OCP4 EC HMP,OCP4 EC PRD CANAIS
KIND_DEPLOY
deploymentconfig
OKD_API_REGISTRY
api.produtos4.caixa:6443
OKD_REGISTRY
default-route-openshift-image-registry.apps.produtos4.caixa
OKD_TOKEN_REGISTRY
********
OKD_USER_SERVICE_REGISTRY
ads-sa
ProjetoBuild
build-images-ads
TIMEOUT_DEPLOY
300
SISPI-QRCODE-API-VALIDADOR-BT-VAULT-DES (1)
add novas variaveis para o ocp4
Scopes: OCP4 EC DES
BT_SECRETS_LIST
SISPI_DES/SSPIBD04_ORACLE,SISPI_DES/SSPIBD03_ORACLE,SISPI_DES/SISPI_PROXY,SISPI_DES/SISPX/SSPXBD01_ORACLE_DG,SISPI_DES/SISPI_SECRET_INTRANET
SISPI-BT-VAULT-SECRET-DES (2)
Scopes: OCP4 EC DES
BT_CLIENT_ID
275c2d45-5b73-446b-a336-6fcf0103ecd4
BT_CLIENT_SECRET
********
NEWMAN-SISPI-qrcode-api-validador (3)
VG de configuração de libraries do Newman para testes funcionais
Scopes: OCP4 QA-DES
NEWMAN_PATH_COLLECTION
/Collections-Automatizadas/QRCode/Pacotes_Azure/PACOTE_SISPI_QRCODE_API_VALIDADOR_DES.postman_collection.json
NEWMAN_PATH_COLLECTION_ENVIRONMENT
/Collections-Automatizadas/QRCode/Pacotes_Azure/SISPI_AUTO_DES.postman_environment.json
NEWMAN_SOURCE_ALIAS
_SISPI-teste-certificacao
BUILD_VARIABLES (60)
Variáveis disponíveis para todas as builds.
Scopes: OCP4 QA-DES
ANSIBLE_INVENTORY
$(HOME_ADS_AGENT)/$(DIR_ANSIBLE)/hosts
ANSIBLE_VAULT
********
AZPAT
********
AZUSER
s736639
DIR_ANSIBLE
esteira-qa
DOTNET_TESTARGS
--configuration Release --collect "code coverage"
FORTIFY_API
https://novocodigoseguro.caixa/ssc/api/v1
FORTIFY_APITOKEN
********
FORTIFY_BUILD_FILE
.
FORTIFY_CI_TOKEN
********
FORTIFY_CLIENT_AUTH_TOKEN
********
FORTIFY_PASS
********
FORTIFY_POOL_COMPLEX_NOVO
55e6b358-710a-4c3d-ad15-4a3ec96c3dca
FORTIFY_POOL_DIAMOND_NOVO
9fa96d5a-3b13-4ecb-8639-e2ec97d1b4e9
FORTIFY_POOL_GOLD_NOVO
1a3e11fe-719a-475a-905b-e61b743e550d
FORTIFY_POOL_MONOLITO_NOVO
7c2e05fb-2f1d-4045-ac12-69c806df50be
FORTIFY_POOL_SILVER_NOVO
794601f7-da27-467b-a734-06f92c4d63aa
FORTIFY_REGEX
'(?:\*\/)?(\d{1,3}\.\d{1,3}\.\d{1,3})'
FORTIFY_REGISTRY_PASSWORD
********
FORTIFY_REGISTRY_USERNAME
ads-sa
FORTIFY_SENSOR_VERSION
24.4
FORTIFY_TOKEN
********
FORTIFY_UPTOKEN
********
FORTIFY_URL
https://sast.caixa/ssc
FORTIFY_URL_CONTROLLER
http://sast.caixa/scancentral-ctrl
FORTIFY_USER
admin
GITHUB_PAT
********
HOME_ADS_AGENT
/opt/ads-agent
KEYSTORE_PWD
********
KEYSTORE_SECUREFILEPATH
/etc/pki/ca-trust/source/anchors/keystore-ssc24.jks
NEXUS_REPOSITORY_ID
NEXUS_INTERNO
NEXUS_URL_ANGULAR_RELEASE
http://binario.caixa:8081/repository/caixa-raw-releases/angular
NEXUS_URL_ANGULAR_SNAPSHOT
http://binario.caixa:8081/repository/caixa-raw-snapshots/angular
NEXUS_URL_ASP_RELEASE
http://binario.caixa:8081/repository/caixa-raw-releases/asp
NEXUS_URL_ASP_SNAPHOT
http://binario.caixa:8081/repository/caixa-raw-snapshots/asp
NEXUS_URL_CAIXA_GROUP
http://binario.caixa:8081/repository/caixa-group-br/
NEXUS_URL_DOTNET_RELEASE
http://binario.caixa:8081/repository/caixa-raw-releases/dotnet
NEXUS_URL_DOTNET_SNAPSHOT
http://binario.caixa:8081/repository/caixa-raw-snapshots/dotnet
NEXUS_URL_MAVEN_RELEASE
http://binario.caixa:8081/repository/releases
NEXUS_URL_MAVEN_SNAPSHOT
http://binario.caixa:8081/repository/snapshots
NEXUS_URL_NODE_INTERNAL_RELEASE
http://binario.caixa:8081/repository/npm-internal
NEXUS_URL_NODE_RELEASE
http://binario.caixa:8081/repository/caixa-raw-releases/node
NEXUS_URL_NODE_SNAPSHOT
http://binario.caixa:8081/repository/caixa-raw-snapshots/node
NEXUS_URL_NPM_RELEASE
http://binario.caixa:8081/repository/caixa-npm-releases/
NEXUS_URL_NPM_SNAPSHOT
http://binario.caixa:8081/repository/caixa-npm-snapshots/
NEXUS_URL_PHP_RELEASE
http://binario.caixa:8081/repository/caixa-php-releases
NEXUS_URL_PHP_SNAPSHOT
http://binario.caixa:8081/repository/caixa-php-snapshots
NEXUS_URL_RAW_RELEASE
http://binario.caixa:8081/repository/caixa-raw-releases
NEXUS_URL_RAW_SNAPSHOT
http://binario.caixa:8081/repository/caixa-raw-snapshots
NEXUS_URL_ZCONBT_RELEASE
http://binario.caixa:8081/repository/caixa-raw-releases/zconbt
NEXUS_URL_ZCONBT_SNAPSHOT
http://binario.caixa:8081/repository/caixa-raw-snapshots/zconbt
NODE_EXTRA_CA_CERTS
/etc/pki/ca-trust/source/anchors/AC-V4.cer
SCANCENTRAL_URL
http://scancentral.apps.produtos4.caixa/scancentral-ctrl
SSC_URL
https://novocodigoseguro.caixa/ssc
ScanCentral.ClientToken
********
ScanCentral.SscCiToken
********
fortify_disable
false
nexus_interno_pass
********
nexus_interno_user
pipeline-agil
sonar_disable
false
QA-GEQTI (8)
Scopes: OCP4 QA-DES
NEWMAN_DIRETORIO_EVIDENCIAS
Reports
NEWMAN_PACKAGE_JSON_PATH
.
NEWMAN_TIMEOUT_EXECUTION
1000
SONAR_JAVA_BINARIES
./**/target/classes
SONAR_JAVA_COVERAGEPLUGIN
jacoco
SONAR_LANGUAGE
java
project.key
$(Build.DefinitionId)
project.name
$(Build.DefinitionId)
SISPI-QRCODE-API-VALIDADOR-TQS (10)
Scopes: OCP4 EC TQS
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-cedesbr_azurepush_atualizado.jks"
_ENV.PIX_SUPORTE_PROXY_BYPASS_FOR
".caixa;.sispl-des;.sispl-tqs;.svc"
_ENV.SISPI_CERTIFICADOS_CACHE_RESET
"0 0 0 ? * * *"
_ENV.SISPI_PIX_URL_QRCODE
pix-qrcode-h.caixa.gov.br
_ENV.SISPI_QRCODE_CACHE_RELOAD
"0 0 0 ? * * *"
_ENV.SISPI_QRCODE_MIRROR_CAIXA
pix-qrcode-h.caixa.gov.br:sispi-qrcode-api-externo-tqs-esteiras.sispi-tqs.svc
_ENV.SISPI_QRCODE_MIRROR_CAIXA_DISABLED
pix-qrcode-h.caixa.gov.br:redlink.com.br
_ENV.SISPI_QRCODE_PROXY_HOST
proxydes.caixa
_ENV.SISPI_QRCODE_PROXY_PORTA
80
_ENV.SISPI_QRCODE_PROXY_USUARIO
s739019
ADAPTER_VARIABLES (9)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: OCP4 EC TQS
AdapterGroupId
GitName
GitToken
GitUrl
GitUser
LockBranch
true
SonarProjectKey
SonarProjectName
system.debug
true
ADAPTER_VARIABLES - SIACM Cartões (7)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: OCP4 EC TQS
AdapterGroupId
br.gov.caixa.cartoescaixa
GitName
devops.caixa/projetos/Caixa/_git/SIACM-Adapters
GitUrl
https://devops.caixa/projetos/98fe0311-ffd2-418a-9d0d-507043380abd/_apis/git/repositories/011d3bd8-96ad-48ff-af7e-e42cfe933e3d
GitUser
f617016
SonarProjectKey
SIACM:ADAPTERS
SonarProjectName
SIACM:ADAPTERS
system.debug
true
PIX-API-SUPORTE-TQS (31)
Scopes: OCP4 EC TQS
PASSWORD_DB
********
PASSWORD_DB_DG
********
PASSWORD_PROXY
********
PIX_API_KEY
********
_ENV.DATASOURCE.ABUSEWARNING
false
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-cedesbr_azurepush_atualizado.jks"
_ENV.JAVA_TOOL_OPTIONS
"-Dfile.encoding=UTF8"
_ENV.PIX_API_MANAGER
https://api.des.caixa:8443
_ENV.PIX_ENVIRONMENT
TQS
_ENV.PIX_ISPB_CAIXA
00360305
_ENV.PIX_LOGIN_CAIXA_INTERNET_URL
https://logintqs.caixa.gov.br/auth/realms/internet
_ENV.PIX_LOGIN_CAIXA_INTRANET_URL
https://login.tqs.caixa/auth/realms/intranet
_ENV.PIX_LOGIN_CAIXA_LOGIN2_URL
https://logintqs.caixa.gov.br/auth/realms/internet
_ENV.PIX_SUPORTE_DATABASE_CHECKCONNECTION_SCHEDUDLE
"0 * * ? * * *"
_ENV.PIX_SUPORTE_DEPENDENCY_MONITOR_SSO_NAME
"SSO Caixa"
_ENV.PIX_SUPORTE_DEPENDENCY_SCHEDULE
"0 * * ? * * *"
_ENV.PIX_SUPORTE_LOG_LEVEL
br.gov.caixa:INFO
_ENV.PIX_SUPORTE_PROXY_HOST
proxydes.caixa
_ENV.PIX_SUPORTE_PROXY_PORTA
80
_ENV.PIX_SUPORTE_PROXY_USUARIO
s739019
_ENV.PIX_SUPORTE_REQUEST_TIMEOUT
5000
_ENV.PIX_SUPORTE_SERVICE.RELOAD
"0/59 * * * * ?"
_ENV.PIX_TENTANT_IDENTIFIER
.caixa.gov.br
_ENV.QUARKUS_DATASOURCE_DATAGUARD_JDBC_URL
"jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=10.116.33.16)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=ORAT09NG)))"
_ENV.QUARKUS_DATASOURCE_DATAGUARD_USERNAME
SSPIBT01
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=10.116.33.16)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=ORAT09NG)))"
_ENV.QUARKUS_DATASOURCE_USERNAME
SSPIBT01
_SECRET.PIX_API_KEY
#{PIX_API_KEY}#
_SECRET.PIX_SUPORTE_PROXY_SENHA
#{PASSWORD_PROXY}#
_SECRET.QUARKUS_DATASOURCE_DATAGUARD_PASSWORD
#{PASSWORD_DB_DG}#
_SECRET.QUARKUS_DATASOURCE_PASSWORD
#{PASSWORD_DB}#
SISPI-QRCODE-API-VALIDADOR-HMP (22)
Scopes: OCP4 EC HMP
PASSWORD_DB
###PREENCHER###
PASSWORD_DB_DG
###PREENCHER###
PASSWORD_PROXY
###PREENCHER###
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-cedesbr_azurepush_atualizado.jks"
_ENV.JAVA_TOOL_OPTIONS
"-Dfile.encoding=UTF8"
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=10.223.4.116)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=ORADES98)))"
_ENV.QUARKUS_DATASOURCE_ORACLESISPIDATAGUARDDS_JDBC_URL
"jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=10.223.4.116)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=ORADED98)))"
_ENV.QUARKUS_DATASOURCE_ORACLESISPIDATAGUARDDS_USERNAME
SSPIBD01
_ENV.QUARKUS_DATASOURCE_USERNAME
SSPIBD01
_ENV.SISPI_CERTIFICADOS_CACHE_RESET
"0 0 0 ? * * *"
_ENV.SISPI_ENVIRONMENT
DES
_ENV.SISPI_LOGIN_CAIXA_INTERNET_URL
https://logindes.caixa.gov.br/auth/realms/internet
_ENV.SISPI_LOGIN_CAIXA_INTRANET_URL
https://login.des.caixa/auth/realms/intranet
_ENV.SISPI_PIX_URL_QRCODE
pix-qrcode-h.caixa.gov.br
_ENV.SISPI_QRCODE_CACHE_RELOAD
"0 0 0 ? * * *"
_ENV.SISPI_QRCODE_MIRROR_CAIXA
pix-qrcode-h.caixa.gov.br:redlink.com.br
_ENV.SISPI_QRCODE_PROXY_HOST
proxydes.caixa
_ENV.SISPI_QRCODE_PROXY_PORTA
80
_ENV.SISPI_QRCODE_PROXY_USUARIO
s739019
_SECRET.QUARKUS_DATASOURCE_ORACLESISPIDATAGUARDDS_PASSWORD
#{PASSWORD_DB_DG}#
_SECRET.QUARKUS_DATASOURCE_PASSWORD
#{PASSWORD_DB}#
_SECRET.SISPI_QRCODE_PROXY_SENHA
#{PASSWORD_PROXY}#
PIX-API-SUPORTE-HMP (28)
Scopes: OCP4 EC HMP
PASSWORD_DB
********
PASSWORD_DB_DG
********
PASSWORD_PROXY
********
PIX_API_KEY
********
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-cedesbr_azurepush_atualizado.jks"
_ENV.JAVA_TOOL_OPTIONS
"-Dfile.encoding=UTF8"
_ENV.PIX_API_MANAGER
https://api.des.caixa:8443
_ENV.PIX_ENVIRONMENT
TQS
_ENV.PIX_ISPB_CAIXA
00360305
_ENV.PIX_LOGIN_CAIXA_INTERNET_URL
https://logindes.caixa.gov.br/auth/realms/internet
_ENV.PIX_LOGIN_CAIXA_INTRANET_URL
https://login.des.caixa/auth/realms/intranet
_ENV.PIX_SUPORTE_DATABASE_CHECKCONNECTION_SCHEDUDLE
"0 * * ? * * *"
_ENV.PIX_SUPORTE_DEPENDENCY_MONITOR_SSO_NAME
"SSO Caixa"
_ENV.PIX_SUPORTE_DEPENDENCY_SCHEDULE
"0 * * ? * * *"
_ENV.PIX_SUPORTE_LOG_LEVEL
br.gov.caixa:INFO
_ENV.PIX_SUPORTE_PROXY_HOST
proxydes.caixa
_ENV.PIX_SUPORTE_PROXY_PORTA
80
_ENV.PIX_SUPORTE_PROXY_USUARIO
s739019
_ENV.PIX_SUPORTE_SERVICE.RELOAD
"0/59 * * * * ?"
_ENV.PIX_TENTANT_IDENTIFIER
.caixa.gov.br
_ENV.QUARKUS_DATASOURCE_DATAGUARD_JDBC_URL
"jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=10.223.4.116)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=ORATQS98)))"
_ENV.QUARKUS_DATASOURCE_DATAGUARD_USERNAME
SSPIBT01
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=10.223.4.116)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=ORATQS98)))"
_ENV.QUARKUS_DATASOURCE_USERNAME
SSPIBT01
_SECRET.PIX_API_KEY
#{PIX_API_KEY}#
_SECRET.PIX_SUPORTE_PROXY_SENHA
#{PASSWORD_PROXY}#
_SECRET.QUARKUS_DATASOURCE_DATAGUARD_PASSWORD
#{PASSWORD_DB_DG}#
_SECRET.QUARKUS_DATASOURCE_PASSWORD
#{PASSWORD_DB}#
OCP-PRD (16)
Credenciais para o Cluster OCP de PRD
Scopes: OCP4 EC PRD CANAIS
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
SISPI-QRCODE-API-VALIDADOR-OCP4-PRD (27)
08/02/2024 - atualização jks de caixa-truststore-cedesbr_azurepush_atualizado.jks para caixa-truststore-azurepush_012024.jks
Scopes: OCP4 EC PRD CANAIS
PIX-API-SUPORTE-OCP4-PRD (38)
27/12 - Preenchida APIKEY - Daniela Perng 08/02/2024 - atualização jks de caixa-truststore-cedesbr_azurepush_atualizado.jks para caixa-truststore-azurepush_012024.jks
Scopes: OCP4 EC PRD CANAIS
|Manage variable groups
Row 2

Row 2

16 pipelines found

Select a release pipeline to view its releases

10 pipelines found

Select a release pipeline to view its releases

10 pipelines found

Select a release pipeline to view its releases

1 pipelines found

Select a release pipeline to view its releases

1 pipelines found

Expanded

Collapsed

Row 2

Showing filters 1 through 2


