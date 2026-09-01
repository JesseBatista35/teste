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
SISPI-med-orquestrador
/
SISPI-med-orquestrador-20260831.1402-1.0.0-SNAPSHOT(10)
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
SISPI-med-orquestrador

SISPI-med-orquestrador-20260831.1402-1.0.0-SNAPSHOT(10)
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
SISPI-med-orquestrador-BT-VAULT-DES (1)
WO0000081333977 WO0000081388597 - Alteração da variável
Scopes: EC DES
BT_SECRETS_LIST
SISPI_DES/SISPI_KAFKA,SISPI_DES/SISPI_KAFKA_TRUSTSTORE,SISPI_DES/SISPI_USER_KEYSTORE
SISPI-BT-VAULT-SECRET-DES (2)
Scopes: EC DES
BT_CLIENT_ID
275c2d45-5b73-446b-a336-6fcf0103ecd4
BT_CLIENT_SECRET
********
SISPI-MED-ORQUESTRADOR-DES - TESTE (50)
Grupo de variáveis de SISPI-MED-ORQUESTRADOR-DES
Scopes: EC DES
VAULT_LOCATION
/usr/src/app/secrets_files/SISPI_DES/,/usr/src/app/secrets_files/SISPI_DES/SIMPI
_ENV.AZURE_SERVICEBUS_QUEUE_ENDPOINT
sb://servicebus-eds-nprd.servicebus.windows.net/
_ENV.AZURE_SERVICEBUS_QUEUE_NAME
"sigcn-med-atualizacaorelatosinfracao-status"
_ENV.AZURE_SERVICEBUS_QUEUE_SHAREDACCESSKEY
apagueiaqui
_ENV.AZURE_SERVICEBUS_QUEUE_SHAREDACCESSKEYNAME
RootManageSharedAccessKey
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.KAFKA_BOOTSTRAP_PORT
443
_ENV.KAFKA_BOOTSTRAP_SERVER
"development-kafka-bootstrap-cp4i.apps.pixnprd4.caixa"
_ENV.KAFKA_PASS
'${SISPI_KAFKA}'
_ENV.KAFKA_USER
dev
_ENV.KEY_STORE_KAFKA_CLIENT_LOCATION
/deployments/sispi_user_keystore_kafka_des.p12
_ENV.KEY_STORE_KAFKA_CLIENT_PASSWORD
'${SISPI_USER_KEYSTORE}'
_ENV.MQ.ANTIFRAUDE.CHANNEL
SISPI.SVRCONN
_ENV.MQ.ANTIFRAUDE.FILA_NOTIFICACAO_INFRACAO
SIAAF.REQ.SISPI.PIX_NOTIFICACAO_INFRACAO
_ENV.MQ.ANTIFRAUDE.MAXIMO_CONEXOES
1
_ENV.MQ.ANTIFRAUDE.MAXIMO_SESSOES
300
_ENV.MQ.ANTIFRAUDE.PASSWORD
jh73wpqb
_ENV.MQ.ANTIFRAUDE.PORT
1414
_ENV.MQ.ANTIFRAUDE.QUEUE.MANAGER
XMQD1
_ENV.MQ.ANTIFRAUDE.TIMEOUT
1000
_ENV.MQ.ANTIFRAUDE.USERID
SSPIBD01
_ENV.MQ.CONTROLE_TEMPO.CHANNEL
SISPI.SVRCONN
_ENV.MQ.CONTROLE_TEMPO.FILA_REGISTRO_ANS
SISPI.REQ.REGISTRO_ANS
_ENV.MQ.CONTROLE_TEMPO.HOSTNAME
10.116.95.99
_ENV.MQ.CONTROLE_TEMPO.MAXIMO_CONEXOES
1
_ENV.MQ.CONTROLE_TEMPO.MAXIMO_SESSOES
300
_ENV.MQ.CONTROLE_TEMPO.PASSWORD
jh73wpqb
_ENV.MQ.CONTROLE_TEMPO.PORT
1414
_ENV.MQ.CONTROLE_TEMPO.QUEUE.MANAGER
XMQD1
_ENV.MQ.CONTROLE_TEMPO.TIMEOUT
1000
_ENV.MQ.CONTROLE_TEMPO.USERID
SSPIBD01
_ENV.MQ_ANTIFRAUDE_HOSTNAME
10.116.95.99
_ENV.PIX_FRAMEWORK_TOKEN_CLIENT_ID
cli-ser-spi
_ENV.PIX_FRAMEWORK_TOKEN_SECRET_ID
1938b188-42c7-4889-bf3a-7d95e4432fe9
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
sspibd0303
_ENV.QUARKUS_DATASOURCE_USERNAME
SSPIBD03
_ENV.SIMPI.MED.URL
https://simpi-med-des.apps.pixnprd4.caixa
_ENV.SISPI_API.KEY
l76138e827bd9d4f87aea4ff7f54a5607c
_ENV.SISPI_API_MANAGER
https://api.des.caixa:8443
_ENV.SISPI_ISPB_CAIXA
00360305
_ENV.SISPI_LOGIN_CAIXA_INTRANET_URL
"https://login.des.caixa/auth/realms/intranet"
_ENV.TOPICO_MED_POLLING
PIX.MED.POLLING.EVENTO
_ENV.TRUST_STORE_KAFKA_LOCATION
/deployments/keystore_event_streams.p12
_ENV.TRUST_STORE_KAFKA_PASSWORD
'${SISPI_KAFKA_TRUSTSTORE}'
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
SISPI-MED-ORQUESTRADOR-TQS (1)
Grupo de variáveis de SISPI-MED-ORQUESTRADOR-TQS
Scopes: EC TQS
INIT
Criado via api
SISPI-MED-ORQUESTRADOR-HMP (1)
Grupo de variáveis de SISPI-MED-ORQUESTRADOR-HMP
Scopes: EC HMP
INIT
Criado via api
SISPI-med-orquestrador-BT-VAULT-HMP (1)
WO0000081333977
Scopes: EC HMP
BT_SECRETS_LIST
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
SISPI-MED-ORQUESTRADOR-PRD (1)
Grupo de variáveis de SISPI-MED-ORQUESTRADOR-PRD
Scopes: EC PRD
INIT
Criado via api
SISPI-med-orquestrador-BT-VAULT-PRD (1)
WO0000081333977
Scopes: EC PRD
BT_SECRETS_LIST
Showing filters 1 through 2

Expanded

Collapsed

Showing filters 1 through 2

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
SISPI-med-orquestrador
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
SISPI-med-orquestrador
Predefined variables
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
ocp_nprd
SITE
ocp_prd
TemplateRelease_OKD
openshift/quarkus-caixa-release
Showing filters 1 through 2

Expanded

Collapsed

Showing filters 1 through 2

Row 2

Showing filters 1 through 2

Showing filters 1 through 2

Showing filters 1 through 2


