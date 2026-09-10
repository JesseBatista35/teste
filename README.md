Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
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

siccp

SICCP-back

Tasks

Variables

Triggers

Options

History
Predefined variables
BUILD_VARIABLES (57)
Variáveis disponíveis para todas as builds.
ANSIBLE_INVENTORY
$(HOME_ADS_AGENT)/$(DIR_ANSIBLE)/hosts
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
Usuario-Azure-DevOps (12)
AZPAT
********
AZUSER
s736639
BT_API_URL
https://sicsn.caixa/BeyondTrust/api/public/v3
BT_SECRETS_PATH
********
FORTIFY_API
https://novocodigoseguro.caixa/ssc/api/v1
FORTIFY_APITOKEN
********
FORTIFY_PASS
********
FORTIFY_USER
admin
OKD_KAFKA
api.kafka-nprd.caixa:6443
OKD_TOKEN_KAFKA
********
TOKEN_CRQ
********
URL_CRQ
https://infradevops-novoportal-backend-prd.apps.produtos4.caixa/api.php?acao=devopsCaixacriarMudancaPadrao
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
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
SONAR_VARIABLES - ESTEIRA (8)
Variáveis do SONAR disponíveis para todas as builds.
SONAR_JAVA_BINARIES
.
SONAR_JAVA_COVERAGEPLUGIN
jacoco
SONAR_JAVA_LIBRARIES
.
SONAR_LOGIN
ads-sa
SONAR_PASSWORD
********
SONAR_PROPERTIES
-Dproject.settings=NONE -Dsonar.branch.name=$(sonar_branch) -Dsonar.java.binaries=$(SONAR_JAVA_BINARIES) -Dsonar.java.coveragePlugin=$(SONAR_JAVA_COVERAGEPLUGIN) -Dsonar.java.libraries=$(SONAR_JAVA_LIBRARIES) -Dsonar.coverage.jacoco.xmlReportPaths=`find . -path '*jacoco.xml' | sed 's/.*/&/' | tr '\n' ','` -Dsonar.junit.reportPaths=`find . -type d -name 'surefire-reports' | sed 's/.*/&/' | tr '\n' ','` -X
SONAR_URL
http://sonar-esteira.apps.produtos4.caixa
_SECRET.SONAR_PASSWORD
SONAR_PASSWORD
SAST_FORTIFY_COMUNIDADE_COBRANCA (4)
WO0000076688772
FORTIFY_COMUNIDADE
OPERAÇÕES BANCÁRIAS
FORTIFY_FILTERSET_GUARDRAIL
32142c2d-3f7f-4863-a1bf-9b1e2f34d2ed
FORTIFY_LDAP_GROUP
SAST_Op_Banc,SAST_Op_Banc_Fabrica
FORTIFY_SENSOR_POOL
a4993bd3-4bb1-4460-810a-965981db9cae
|Manage variable groups
Showing 24 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Row 2. Clickable

Row 2. Clickable

Row 2. Clickable

Expanded

Collapsed

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
SICCP-back
/
SICCP-back-20260909.1524-0.0.1-SNAPSHOT(1)
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
SICCP-back

SICCP-back-20260909.1524-0.0.1-SNAPSHOT(1)
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
SONAR_URL
http://sonar.produtos.caixa
Usuario-Azure-DevOps (12)
Scopes: Release
AZPAT
********
AZUSER
s736639
BT_API_URL
https://sicsn.caixa/BeyondTrust/api/public/v3
BT_SECRETS_PATH
********
FORTIFY_API
https://novocodigoseguro.caixa/ssc/api/v1
FORTIFY_APITOKEN
********
FORTIFY_PASS
********
FORTIFY_USER
admin
OKD_KAFKA
api.kafka-nprd.caixa:6443
OKD_TOKEN_KAFKA
********
TOKEN_CRQ
********
URL_CRQ
https://infradevops-novoportal-backend-prd.apps.produtos4.caixa/api.php?acao=devopsCaixacriarMudancaPadrao
EGRESS_IP_OKD (81)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
ALOCAIP_AMBIENTE
Aplicacao
ALOCAIP_AMBIENTE_OCP
Aplicacao
ALOCAIP_AMBIENTE_OCP_LOTERIAS_PRD
Cloud
ALOCAIP_AMBIENTE_OCP_PRD
Cloud
ALOCAIP_AMBIENTE_OKD4
Aplicacao
ALOCAIP_AMBIENTE_OKD4_PRD_CTC
Cloud
ALOCAIP_AMBIENTE_OPENSHIFT_LOTERIAS_NPRD
Desenvolvimento
ALOCAIP_AMBIENTE_OPENSHIFT_LOTERIAS_PRD
Cloud
ALOCAIP_AMBIENTE_PRD_CANAIS
Cloud
ALOCAIP_AMBIENTE_PRD_DTC
Cloud
ALOCAIP_CATEGORIA
Linux
ALOCAIP_CATEGORIA_OKD4_PRD_CTC
Linux
ALOCAIP_FIM_RANGE_OCP
10.116.223.250
ALOCAIP_FIM_RANGE_OCP_LOTERIAS_PRD
10.190.64.200
ALOCAIP_FIM_RANGE_OCP_PRD
10.118.121.250
ALOCAIP_FIM_RANGE_OKD4
10.116.215.250
ALOCAIP_FIM_RANGE_OKD4_PRD_CTC
10.121.103.250
ALOCAIP_FIM_RANGE_OPENSHIFT_LOTERIAS_NPRD
10.190.160.254
ALOCAIP_FIM_RANGE_OPENSHIFT_LOTERIAS_PRD
10.190.255.253
ALOCAIP_FIM_RANGE_PRD_CANAIS_CTC
10.118.97.255
ALOCAIP_FIM_RANGE_PRD_CANAIS_CTC_OB
10.118.97.254
ALOCAIP_FIM_RANGE_PRD_CANAIS_DTC
10.220.225.255
ALOCAIP_FIM_RANGE_PRD_DTC
10.221.101.250
ALOCAIP_ID
"C&t@d02"
ALOCAIP_INICIO_RANGE_OCP
10.116.223.1
ALOCAIP_INICIO_RANGE_OCP_LOTERIAS_PRD
10.190.64.161
ALOCAIP_INICIO_RANGE_OCP_PRD
10.118.121.1
ALOCAIP_INICIO_RANGE_OKD4
10.116.209.0
ALOCAIP_INICIO_RANGE_OKD4_PRD_CTC
10.121.101.1
ALOCAIP_INICIO_RANGE_OPENSHIFT_LOTERIAS_NPRD
10.190.160.201
ALOCAIP_INICIO_RANGE_OPENSHIFT_LOTERIAS_PRD
10.190.255.245
ALOCAIP_INICIO_RANGE_PRD_CANAIS_CTC
10.118.96.100
ALOCAIP_INICIO_RANGE_PRD_CANAIS_CTC_OB
10.118.97.100
ALOCAIP_INICIO_RANGE_PRD_CANAIS_DTC
10.220.224.100
ALOCAIP_INICIO_RANGE_PRD_DTC
10.221.100.100
ALOCAIP_RED_NUM
3022
ALOCAIP_RED_NUM_OCP
4995
ALOCAIP_RED_NUM_OCP_LOTERIAS_PRD
13616
ALOCAIP_RED_NUM_OCP_PRD
6053
ALOCAIP_RED_NUM_OKD4
4995
ALOCAIP_RED_NUM_OKD4_PRD_CTC
4996
ALOCAIP_RED_NUM_OPENSHIFT_LOTERIAS_NPRD
14583
ALOCAIP_RED_NUM_OPENSHIFT_LOTERIAS_PRD
14582
ALOCAIP_RED_NUM_PRD
4104
ALOCAIP_RED_NUM_PRD_CANAIS_CTC
6053
ALOCAIP_RED_NUM_PRD_CANAIS_DTC
6055
ALOCAIP_RED_NUM_PRD_DTC
5199
ALOCAIP_SENHA
********
ALOCAIP_SITE
CTC
ALOCAIP_SITE_DTC
DTC
ALOCAIP_SITE_OCP
CTC
ALOCAIP_SITE_OCP_LOTERIAS_PRD
CTC
ALOCAIP_SITE_OCP_PRD
CTC
ALOCAIP_SITE_OKD4
CTC
ALOCAIP_SITE_OKD4_PRD_CTC
CTC
ALOCAIP_SITE_OPENSHIFT_LOTERIAS_NPRD
CTC
ALOCAIP_SITE_OPENSHIFT_LOTERIAS_PRD
CTC
ALOCAIP_UNIDADE
CEPTIBR
ALOCAIP_UNIDADE_OCP
CEPTI
ALOCAIP_UNIDADE_OCP_LOTERIAS_PRD
CETAD
ALOCAIP_UNIDADE_OCP_PRD
CETAD
ALOCAIP_UNIDADE_OKD4
CEPTI
ALOCAIP_UNIDADE_OKD4_PRD_CTC
CETAD
ALOCAIP_UNIDADE_OPENSHIFT_LOTERIAS_NPRD
CETAD
ALOCAIP_UNIDADE_OPENSHIFT_LOTERIAS_PRD
CETAD
ALOCAIP_UNIDADE_PRD_CANAIS
CETAD
ALOCAIP_UNIDADE_PRD_DTC
CETAD
ALOCAIP_VERTICAL
Desenvolvimento
ALOCAIP_VERTICAL_OCP
Desenvolvimento
ALOCAIP_VERTICAL_OCP_LOTERIAS_PRD
Cloud
ALOCAIP_VERTICAL_OCP_PRD
IBC
ALOCAIP_VERTICAL_OKD4
Desenvolvimento
ALOCAIP_VERTICAL_OKD4_PRD_CTC
Vertical_Nao_PCN
ALOCAIP_VERTICAL_OPENSHIFT_LOTERIAS_NPRD
Cloud
ALOCAIP_VERTICAL_OPENSHIFT_LOTERIAS_PRD
Cloud
ALOCAIP_VERTICAL_PRD_CANAIS
IBC
ALOCAIP_VERTICAL_PRD_DTC
Vertical Nao PCN
APIALOCAIP
https://api.alocaip.telecom.caixa
PASSWORD_CGC
********
PORTALIF
https://infradevops-novoportal-backend-prd.apps.produtos4.caixa
USER_CGC
USR_CETADPOR1
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
DIR_LOGS
/opt/ads-agent/esteira-logs
GRAYLOG_PASSWORD
********
GRAYLOG_USERNAME
API_CLIENT
REPOSITORY_LOGS
https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
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
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
CI_NAME
7366CLU-OKD4-NPRD
KIND_DEPLOY
deploymentconfig
OKD_4_API
api.nprd.caixa:6443
OKD_4_REGISTRY
default-route-openshift-image-registry.apps.nprd.caixa
OKD_4_TOKEN
********
OKD_4_URL_SUFFIX
apps.nprd.caixa
OKD_4_USER_SERVICE
ads-sa
OKD_URL_SUFFIX
apps.nprd.caixa
OKD_USER_SERVICE
ads-sa
TIMEOUT_DEPLOY
600
TOKEN_CRQ
********
URL_CRQ
https://infradevops-novoportal-backend-prd.apps.produtos4.caixa/api.php?acao=devopsCaixacriarMudancaPadrao
SICCP-BACK-DES (11)
Grupo de variáveis de SICCP-BACK-DES
Scopes: EC DES
DB_URL
jdbc:db2://10.192.225.76:2905/DBD0
DB_USER
SCCPDS02
INIT
Criado via api
PASS_DB
********
SONAR_HOST_UR
https://sonar-esteira.apps.produtos4.caixa/dashboard?id=SICCP-back
SONAR_PROJECT_KEY
SICCP-back
SONAR_PROJECT_NAME
SICCP-back
SONAR_TOKEN
********
SPRING_PROFILES_ACTIVE
des
_ENV.JAVA_OPTIONS_APPEND
-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks
_ENV.USER
SCCPDS02
SICCP-BACK-TQS (10)
Grupo de variáveis de SICCP-BACK-TQS
Scopes: EC TQS
SICCP-BACK-HMP (1)
Grupo de variáveis de SICCP-BACK-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SICCP-BACK-PRD (1)
Grupo de variáveis de SICCP-BACK-PRD
Scopes: EC PRD
Expanded

Collapsed

Row 3

Row 2

Select a release pipeline to view its releases

No pipelines match your search

Select a release pipeline to view its releases

No pipelines match your search

Select a release pipeline to view its releases

1 pipelines found

Select a release pipeline to view its releases

4 pipelines found

Row 2

Row 2

Showing filters 1 through 2

Row 3

Showing filters 1 through 2


