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
SISPX-notificacao-webhook
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
sispx

SISPX-notificacao-webhook
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (10)
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
SISPX-NOTIFICACAO-WEBHOOK-DES (49)
Grupo de variáveis de SISPX-NOTIFICACAO-WEBHOOK-DES

Scopes: EC DES
DB_PASSWORD
********
DB_SISPI_PASSWORD
********
KAFKA_PASSWORD
********
MQ_PASSWORD
SOURCE_FILE_LOCATION
/usr/src/app/secrets_files/SISPX_DES/,/usr/src/app/secrets_files/SISPX_DES/SISPI/
TRUST_STORE_KAFKA_PASS
********
_ENV.DATASOURCE_DATAGUARD_PASSWORD
'${SSPXBD01_Oracle_DG}'
_ENV.DATASOURCE_DATAGUARD_URL
"jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/prim_SPXSRV"
_ENV.DATASOURCE_DATAGUARD_USERNAME
sspxbd01
_ENV.DATASOURCE_PASSWORD
'${SSPXBD01_Oracle}'
_ENV.DATASOURCE_SISPI_PASSWORD
'${sspibd03_oracle}'
_ENV.DATASOURCE_SISPI_URL
"jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=off)(ADDRESS=(PROTOCOL=TCP)(HOST=10.116.101.16)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=CDBD08NGPDB017)(SERVER=DEDICATED)))"
_ENV.DATASOURCE_SISPI_USERNAME
SSPIBD03
_ENV.DATASOURCE_URL
"jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/CDBD08NGPDB017"
_ENV.DATASOURCE_USERNAME
sspxbd01
_ENV.JAVA_OPTIONS_APPEND
"-Xms1280m -Xmx1280m -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.keyStore=/deployments/caixa-keystore-mpi-mq-plexd-nprd-2.jks"
_ENV.KAFKA_BOOTSTRAP_PORT
443
_ENV.KAFKA_BOOTSTRAP_SERVER
development-kafka-tlsext-bootstrap-cp4i.apps.pixnprd4.caixa
_ENV.KAFKA_PASS
'${sispx_kafka_password}'
_ENV.KAFKA_USER
dev
_ENV.KEY_STORE_KAFKA_CLIENT_LOCATION
/deployments/sispx_user_keystore_kafka_des.p12
_ENV.KEY_STORE_KAFKA_CLIENT_PASSWORD
'${SISPI_USER_KEYSTORE}'
_ENV.MQ_CHANNEL
SISPI.SVRCONN
_ENV.MQ_HOSTNAME
10.116.95.99
_ENV.MQ_HOSTPORT
1414
_ENV.MQ_MAX_CONNECTIONS
1
_ENV.MQ_MAX_SESSIONS
300
_ENV.MQ_PASSWORD
_ENV.MQ_QUEUE
SISPX.REQ.NOTIFICACAO.WEBHOOK
_ENV.MQ_QUEUE_MANAGER
XMQD1
_ENV.MQ_RECONNECT_TIMEOUT
60
_ENV.MQ_USERID
SSPXDA01
_ENV.PIX.QUANTIDADE.THREADS.PROCESSAMENTO
20
_ENV.QUARKUS_DATASOURCE_JDBC_MAX_SIZE
25
_ENV.QUARKUS_DATASOURCE_JDBC_MIN_SIZE
5
_ENV.SPX_TOPICO_CADASTRAR_COBR_RECEBEDOR_CAIXA
PIX.AUT.CADASTRAR.COBR.RECEBEDOR.CAIXA
_ENV.SPX_TOPICO_CANCELAR_COBR
PIX.AUT.CANCELAR.COBR
_ENV.SPX_TOPICO_COBR_ATUALIZADO_RECEBEDOR_CAIXA
PIX.AUT.ATUALIZACAO.AGENDAMENTO
_ENV.SPX_TOPICO_CONFIRMAR_RECORRENCIA_JORNADA_4
PIX.AUT.ATUALIZACAO.AUTORIZACAO
_ENV.SPX_TOPICO_GROUP_CADASTRAR_COBR_RECEBEDOR_CAIXA
PIX.AUT.CADASTRAR.COBR.RECEBEDOR.CAIXA.GROUP
_ENV.SPX_TOPICO_GROUP_CANCELAR_COBR
PIX.AUT.CANCELAR.COBR.GROUP
_ENV.SPX_TOPICO_GROUP_CONFIRMAR_RECORRENCIA_JORNADA_4
PIX.AUT.ATUALIZACAO.AUTORIZACAO.GROUP
_ENV.TOPICOS_KAFKA_GROUP_WEBHOOK_COBR
GRUPO.WEBHOOK.COBR
_ENV.TOPICOS_KAFKA_WEBHOOK_COBR
PIX.AUT.WEBHOOK.COBR
_ENV.TOPICOS_KAFKA_WEBHOOK_REC
PIX.AUT.WEBHOOK.REC
_ENV.TOPICOS_KAFKA_WEBHOOK_REC_GROUP
GRUPO.WEBHOOK.REC
_ENV.TRUST_STORE_KAFKA_LOCATION
/deployments/keystore_event_streams.p12
_ENV.TRUST_STORE_KAFKA_PASSWORD
'${SISPX_KAFKA_TRUSTSTORE}'
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{SOURCE_FILE_LOCATION}#
SISPX-notificacao-webhook-BT-VAULT-DES (2)
Grupo de variáveis de SISPX-notificacao-webhook-BT-VAULT-DES
Scopes: EC DES
BT_SECRETS_LIST
SISPX_DES/SSPXBD01_Oracle,SISPX_DES/SSPXBD01_Oracle_DG,SISPX_DES/SISPI/sspibd03_oracle,SISPX_DES/SISPX_KAFKA_TRUSTSTORE,SISPX_DES/sispx_kafka_password
INIT
Criado via api
SISPX-BT-VAULT-SECRET-DES (2)
Scopes: EC DES
BT_CLIENT_ID
700800ce-0869-4e6d-9108-16f3593f0bad
BT_CLIENT_SECRET
********
SISPX-NOTIFICACAO-WEBHOOK-TQS (1)
Grupo de variáveis de SISPX-NOTIFICACAO-WEBHOOK-TQS
Scopes: EC TQS
SISPX-NOTIFICACAO-WEBHOOK-HMP (1)
Grupo de variáveis de SISPX-NOTIFICACAO-WEBHOOK-HMP
Scopes: EC HMP
OCP-PRD (16)
Credenciais para o Cluster OCP de PRD
Scopes: OCP4 EC PRD CANAIS
SISPX-NOTIFICACAO-WEBHOOK-PRD (49)
Grupo de variáveis de SISPX-NOTIFICACAO-WEBHOOK-PRD
Scopes: OCP4 EC PRD CANAIS
SISPX-notificacao-webhook-BT-VAULT-PRD (1)
Grupo de variáveis de SISPX-notificacao-webhook-BT-VAULT-PRD
Scopes: OCP4 EC PRD CANAIS
sispx-BT-VAULT-SECRET-PRD (2)
Scopes: OCP4 EC PRD CANAIS
|Manage variable groups
Showing 71 items.

Showing 1 filtered items.

Showing 1 filtered items.

Collapsed

Row 2. Clickable

Row 2. Clickable

Showing 50 filtered items.

Showing 25 filtered items.

Row 2. Clickable

Expanded

Collapsed

480 pipelines found

Select a release pipeline to view its releases

55 pipelines found

Select a release pipeline to view its releases

55 pipelines found

Select a release pipeline to view its releases

2 pipelines found

Row 3

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
SISPX-notificacao-webhook
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
sispx

SISPX-notificacao-webhook
Download secure file
Task version
1.*
Display name
Download secure file
Secure File
keystore_event_streams.p12
Retry Count
8
Socket Timeout
Control Options
Output Variables
Showing 71 items.

Showing 1 filtered items.

Showing 1 filtered items.

Collapsed

Row 2. Clickable

Row 2. Clickable

Showing 50 filtered items.

Showing 25 filtered items.

Row 2. Clickable

Expanded

Collapsed

480 pipelines found

Select a release pipeline to view its releases

55 pipelines found

Select a release pipeline to view its releases

55 pipelines found

Select a release pipeline to view its releases

2 pipelines found

Row 3

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
SISPX-notificacao-webhook
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
sispx

SISPX-notificacao-webhook
Download secure file
Task version
1.*
Display name
Download secure file
Secure File
sispx_user_keystore_kafka_des.p12
Retry Count
8
Socket Timeout
Control Options
Output Variables
Showing 71 items.

Showing 1 filtered items.

Showing 1 filtered items.

Collapsed

Row 2. Clickable

Row 2. Clickable

Showing 50 filtered items.

Showing 25 filtered items.

Row 2. Clickable

Expanded

Collapsed

480 pipelines found

Select a release pipeline to view its releases

55 pipelines found

Select a release pipeline to view its releases

55 pipelines found

Select a release pipeline to view its releases

2 pipelines found

Row 3

Showing filters 1 through 2

