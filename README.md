Olá, preciso de uma ajuda pra entender o motivo de não está gerando release para o projeto:

https://devops.caixa/projetos/Caixa/_releaseProgress?releaseId=522857&environmentId=2428076&_a=release-environment-logs

Atualizando Variáveis de Ambiente: porém não fica claro qual variável


2026-09-01T13:44:12.0320561Z ##[section]Starting: Atualizando Variáveis de Ambiente
2026-09-01T13:44:12.0324009Z ==============================================================================
2026-09-01T13:44:12.0324090Z Task         : Bash
2026-09-01T13:44:12.0324135Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-01T13:44:12.0324210Z Version      : 3.227.0
2026-09-01T13:44:12.0324255Z Author       : Microsoft Corporation
2026-09-01T13:44:12.0324316Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-01T13:44:12.0324408Z ==============================================================================
2026-09-01T13:44:12.1696283Z Generating script.
2026-09-01T13:44:12.1707069Z ========================== Starting Command Output ===========================
2026-09-01T13:44:12.1717597Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/b4c97e7e-5b27-458f-a78f-2f29a7987c92.sh
2026-09-01T13:44:12.1802111Z Nova APP: false
2026-09-01T13:44:12.2522949Z Warning: apps.openshift.io/v1 DeploymentConfig is deprecated in v4.14+, unavailable in v4.10000+
2026-09-01T13:44:12.3390920Z Warning: apps.openshift.io/v1 DeploymentConfig is deprecated in v4.14+, unavailable in v4.10000+
2026-09-01T13:44:12.4490228Z error: the server doesn't have a resource type "dev"
2026-09-01T13:44:12.4553927Z ##[error]Bash exited with code '1'.
2026-09-01T13:44:12.4590045Z ##[section]Finishing: Atualizando Variáveis de Ambiente


2026-09-01T13:44:12.5069685Z ##[section]Starting: Logs da Aplicação
2026-09-01T13:44:12.5072943Z ==============================================================================
2026-09-01T13:44:12.5073038Z Task         : Bash
2026-09-01T13:44:12.5073083Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-01T13:44:12.5073150Z Version      : 3.227.0
2026-09-01T13:44:12.5073206Z Author       : Microsoft Corporation
2026-09-01T13:44:12.5073263Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-01T13:44:12.5073360Z ==============================================================================
2026-09-01T13:44:12.6401255Z Generating script.
2026-09-01T13:44:12.6412245Z ========================== Starting Command Output ===========================
2026-09-01T13:44:12.6419272Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/8461ebd5-5739-4cd4-90fe-6b9e4b14de9e.sh
2026-09-01T13:44:12.6476071Z + shopt -s expand_aliases
2026-09-01T13:44:12.6476275Z + [[ -n ocp_nprd ]]
2026-09-01T13:44:12.6476427Z + [[ ocp_nprd =~ ocp ]]
2026-09-01T13:44:12.6476591Z + app=sispi-med-orquestrador-des
2026-09-01T13:44:12.6476766Z + arquivo=/usr/local/bin/oc-v4.13
2026-09-01T13:44:12.6476935Z + '[' -e /usr/local/bin/oc-v4.13 ']'
2026-09-01T13:44:12.6477047Z + oc version
2026-09-01T13:44:12.7179042Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-09-01T13:44:12.7179223Z Server Version: 4.15.59
2026-09-01T13:44:12.7179357Z Kubernetes Version: v1.28.15+d227d65
2026-09-01T13:44:12.7217349Z ++ oc get pod -l name=sispi-med-orquestrador-des -n sispi-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-01T13:44:12.7218765Z ++ tac
2026-09-01T13:44:12.7218915Z ++ grep -v '^$'
2026-09-01T13:44:12.7219024Z ++ head -n1
2026-09-01T13:44:12.8239966Z + last_pod=sispi-med-orquestrador-des-2-8k67g
2026-09-01T13:44:12.8240249Z + echo 'Logs do POD: sispi-med-orquestrador-des-2-8k67g'
2026-09-01T13:44:12.8240490Z + oc logs sispi-med-orquestrador-des-2-8k67g -c sispi-med-orquestrador-des -n sispi-des
2026-09-01T13:44:12.8241208Z Logs do POD: sispi-med-orquestrador-des-2-8k67g
2026-09-01T13:44:12.9157131Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-09-01T13:44:12.9157679Z __  ____  __  _____   ___  __ ____  ______ 
2026-09-01T13:44:12.9158605Z  --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
2026-09-01T13:44:12.9158843Z  -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
2026-09-01T13:44:12.9159089Z --\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-09-01T13:44:12.9159799Z 2026-07-31 14:15:09,096 INFO   [CORRELATION-ID - ] [br.go.ca.si.in.si.ServiceBusSenderClientManager] (main) [SISPI][MED] Initializing Azure Service Bus sender client
2026-09-01T13:44:12.9160323Z 2026-07-31 14:15:09,308 INFO   [CORRELATION-ID - ] [co.az.me.se.ServiceBusClientBuilder] (main) [SISPI][MED] # of open clients using shared connection cache: 1
2026-09-01T13:44:12.9160709Z 2026-07-31 14:15:09,349 INFO   [CORRELATION-ID - ] [br.go.ca.si.in.si.ServiceBusSenderClientManager] (main) [SISPI][MED] Azure Service Bus sender client initialized successfully
2026-09-01T13:44:12.9161150Z 2026-07-31 14:15:09,495 INFO   [CORRELATION-ID - ] [io.quarkus] (main) [SISPI][MED] sispi-med-orquestrador 1.0.0-SNAPSHOT on JVM (powered by Quarkus 3.15.5.redhat-00002) started in 5.565s. Listening on: http://0.0.0.0:8080
2026-09-01T13:44:12.9161483Z 2026-07-31 14:15:09,495 INFO   [CORRELATION-ID - ] [io.quarkus] (main) [SISPI][MED] Profile prod activated. 
2026-09-01T13:44:12.9162108Z 2026-07-31 14:15:09,496 INFO   [CORRELATION-ID - ] [io.quarkus] (main) [SISPI][MED] Installed features: [agroal, cache, cdi, correlation-id, hibernate-orm, hibernate-validator, jdbc-oracle, log-request, narayana-jta, pipe-formatter, problem-details, rest, rest-client, rest-client-jackson, rest-jackson, scheduler, servlet, smallrye-context-propagation, smallrye-fault-tolerance, smallrye-health, smallrye-metrics, smallrye-openapi, swagger-ui, token-service, validacao-token, vertx]
2026-09-01T13:44:12.9254742Z ##[section]Finishing: Logs da Aplicação





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
SISPI-MED-ORQUESTRADOR-DES (50)
Grupo de variáveis de SISPI-MED-ORQUESTRADOR-DES

Scopes: EC DES
VAULT_LOCATION
********
_ENV.AZURE_SERVICEBUS_QUEUE_ENDPOINT
sb://servicebus-eds-nprd.servicebus.windows.net/
_ENV.AZURE_SERVICEBUS_QUEUE_NAME
"sigcn-med-atualizacaorelatosinfracao-status"
_ENV.AZURE_SERVICEBUS_QUEUE_SHAREDACCESSKEY
apagueiosecret tava esposto aqui=
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
SISPI-MED-ORQUESTRADOR-HMP (1)
Grupo de variáveis de SISPI-MED-ORQUESTRADOR-HMP
Scopes: EC HMP
SISPI-med-orquestrador-BT-VAULT-HMP (1)
WO0000081333977
Scopes: EC HMP
OCP-PRD (16)
Credenciais para o Cluster OCP de PRD
Scopes: EC PRD
SISPI-MED-ORQUESTRADOR-PRD (1)
Grupo de variáveis de SISPI-MED-ORQUESTRADOR-PRD
Scopes: EC PRD
SISPI-med-orquestrador-BT-VAULT-PRD (1)
WO0000081333977
Scopes: EC PRD
|Manage variable groups
Showing filters 1 through 2
