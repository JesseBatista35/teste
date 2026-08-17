Por favor verificar problema na expansao das variaveis do vault do seguinte pipeline de release:

https://devops.caixa/projetos/Caixa/_releaseDefinition?definitionId=6519&_a=environments-editor-preview

 o erro apresentado no openshift é o seguinte:

exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Xms1280m -Xmx1280m -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
Aug 11, 2026 4:35:20 PM org.hibernate.validator.internal.util.Version
INFO: HV000001: Hibernate Validator 8.0.2.Final-redhat-00001
Configuration validation failed:
java.util.NoSuchElementException: SRCFG00011: Could not expand value SMPISD01_HSM in property HSM_PASSWORD
java.util.NoSuchElementException: SRCFG00011: Could not expand value SIMPI_ALIAS_CERT in property HSM_PRIVATE_KEY_NAME
java.util.NoSuchElementException: SRCFG00011: Could not expand value SIMPI_SN_CERT in property CERT_ASSINATURA_SERIAL_NUMBER
java.util.NoSuchElementException: SRCFG00011: Could not expand value SIMPI_ISSUER_CERT in property CERT_ASSINATURA_ISSUER_NAME
 

 
grato


Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIMPI-dict-api
Search








All pipelines

SIMPI

SIMPI-dict-api
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
SIMPI-DICT-API-DES (25)
Grupo de variáveis de SIMPI-DICT-API-DES

Scopes: EC DES
INIT
Criado via api
VAULT_LOCATION
********
_ENV.BACEN_MAX_CONNECTIONS
50
_ENV.BACEN_V2_HOST
dict-h.pi.rsfn.net.br
_ENV.BACEN_V2_URL
https://dict-h.pi.rsfn.net.br:16522/api/v2
_ENV.CERT_ASSINATURA_ISSUER_NAME
'${SIMPI_ISSUER_CERT}'
_ENV.CERT_ASSINATURA_SERIAL_NUMBER
'${SIMPI_SN_CERT}'
_ENV.HSM_HOSTNAME
"hsmdes.extra.caixa.gov.br"
_ENV.HSM_PASSWORD
'${SMPISD01_HSM}'
_ENV.HSM_PRIVATE_KEY_NAME
'${SIMPI_ALIAS_CERT}'
_ENV.HSM_USER_ID
SMPISD01
_ENV.ISPB_CAIXA
00360305
_ENV.JAVA_OPTIONS_APPEND
"-Xms1280m -Xmx1280m -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.KEYSTORE_PASSWORD
'${SIMPI_KSPIX_01}'
_ENV.KEYSTORE_PATH
/deployments/simpi-des-keystore-092025.jks
_ENV.PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_EMISSOR
"https://login.des.caixa/auth/realms/intranet"
_ENV.PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_URL
"https://sispi-api-proxy-sso-des.apps.pixnprd4.caixa/auth/realms/intranet;https://login.des.caixa/auth/realms/intranet"
_ENV.PIX_FRAMEWORK_VALIDACAO_TOKEN_VALIDACAO_GLOBAL
true
_ENV.SISPI_LOGIN_CAIXA_INTERNET_URL
https://logindes.caixa.gov.br/auth/realms/internet
_ENV.SISPI_LOGIN_CAIXA_INTRANET_URL
https://login.des.caixa/auth/realms/intranet
_ENV.SISPI_LOGIN_PROXY_INTERNET_URL
https://sispi-api-proxy-sso-des.apps.pixnprd4.caixa/auth/realms/intranet
_ENV.SISPI_LOGIN_PROXY_INTRANET_URL
https://sispi-api-proxy-sso-des-esteiras.nprd2.caixa/auth/realms/intranet
_ENV.TRUSTSTORE_PASSWORD
123456
_ENV.TRUSTSTORE_PATH
/deployments/simpi-des-truststore-202602.jks
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
SIMPI-BT-VAULT-SECRET-DES (2)
Scopes: EC DES
BT_CLIENT_ID
78a260d0-9018-42ac-a5da-7f49a6b43092
BT_CLIENT_SECRET
********
SIMPI-dict-api-BT-VAULT-DES (1)
WO0000081320849

Scopes: EC DES
BT_SECRETS_LIST
SIMPI_DES/SMPISD01_HSM,SIMPI_DES/SIMPI_ALIAS_CERT,SIMPI_DES/SIMPI_SN_CERT,SIMPI_DES/SIMPI_ISSUER_CERT,SIMPI_DES/SIMPI_KSPIX_01
SIMPI-DICT-API-TQS (1)
Grupo de variáveis de SIMPI-DICT-API-TQS
Scopes: EC TQS
SIMPI-dict-api-BT-VAULT-TQS (1)
WO0000081320776
Scopes: EC TQS
SIMPI-DICT-API-HMP (1)
Grupo de variáveis de SIMPI-DICT-API-HMP
Scopes: EC HMP
SIMPI-BT-VAULT-SECRET-HMP (2)
WO0000080995187
Scopes: EC HMP
SIMPI-dict-api-BT-VAULT-HMP (1)
WO0000081320776
Scopes: EC HMP
OCP-PRD (16)
Credenciais para o Cluster OCP de PRD
Scopes: EC PRD
SIMPI-DICT-API-PRD (1)
Grupo de variáveis de SIMPI-DICT-API-PRD
Scopes: EC PRD
simpi-BT-VAULT-SECRET-PRD (2)
Scopes: EC PRD
SIMPI-dict-api-BT-VAULT-PRD (1)
WO0000081320776
Scopes: EC PRD
|Manage variable groups
Expanded

Collapsed

2 pipelines found

Row 2

Row 3

Row 2

Row 3

1 pipelines found

Row 2

Showing filters 1 through 2



2026-08-17T13:07:24.1578090Z ##[section]Starting: Verificando Status do Deployment
2026-08-17T13:07:24.1581927Z ==============================================================================
2026-08-17T13:07:24.1582008Z Task         : Bash
2026-08-17T13:07:24.1582050Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-17T13:07:24.1582123Z Version      : 3.227.0
2026-08-17T13:07:24.1582164Z Author       : Microsoft Corporation
2026-08-17T13:07:24.1582214Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-17T13:07:24.1582294Z ==============================================================================
2026-08-17T13:07:24.3071393Z Generating script.
2026-08-17T13:07:24.3082154Z ========================== Starting Command Output ===========================
2026-08-17T13:07:24.3091799Z [command]/bin/bash /opt/ads-agent/_work/_temp/a6f64fc3-4a41-4d5d-a95d-6eb1a08fd947.sh
2026-08-17T13:07:24.5630417Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-08-17T13:07:24.5776848Z Waiting for rollout to finish: 0 of 1 updated replicas are available...
2026-08-17T13:12:24.5638998Z E0817 10:12:24.562722    5915 streamwatcher.go:109] Unable to decode an event from the watch stream: net/http: request canceled (Client.Timeout exceeded while reading body)
2026-08-17T13:12:24.5641533Z error: watch closed before Until timeout
2026-08-17T13:12:24.5675390Z A aplicação não foi iniciada com sucesso!
2026-08-17T13:12:24.5676307Z Os logs da aplicação estão disponíveis na próxima task: Logs da Aplicação
2026-08-17T13:12:24.5702794Z ##[error]Bash exited with code '1'.
2026-08-17T13:12:24.5735151Z ##[section]Finishing: Verificando Status do Deployment

2026-08-17T13:12:24.5757740Z ##[section]Starting: Logs da Aplicação
2026-08-17T13:12:24.5763060Z ==============================================================================
2026-08-17T13:12:24.5763343Z Task         : Bash
2026-08-17T13:12:24.5763408Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-17T13:12:24.5763548Z Version      : 3.227.0
2026-08-17T13:12:24.5763619Z Author       : Microsoft Corporation
2026-08-17T13:12:24.5763710Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-17T13:12:24.5763848Z ==============================================================================
2026-08-17T13:12:24.7095390Z Generating script.
2026-08-17T13:12:24.7110917Z ========================== Starting Command Output ===========================
2026-08-17T13:12:24.7126045Z [command]/bin/bash /opt/ads-agent/_work/_temp/ac113fe2-b92f-48a1-bc22-3aa92ccf307b.sh
2026-08-17T13:12:24.7166539Z + shopt -s expand_aliases
2026-08-17T13:12:24.7168625Z + [[ -n ocp_nprd ]]
2026-08-17T13:12:24.7170644Z + [[ ocp_nprd =~ ocp ]]
2026-08-17T13:12:24.7172732Z + app=simpi-dict-api-des
2026-08-17T13:12:24.7175132Z + arquivo=/usr/local/bin/oc-v4.13
2026-08-17T13:12:24.7177203Z + '[' -e /usr/local/bin/oc-v4.13 ']'
2026-08-17T13:12:24.7179193Z + alias oc=/usr/local/bin/oc-v4.13
2026-08-17T13:12:24.7181392Z + /usr/local/bin/oc-v4.13 version
2026-08-17T13:12:24.8269000Z Client Version: 4.13.0-202307282024.p0.ge251b5e.assembly.stream-e251b5e
2026-08-17T13:12:24.8269466Z Kustomize Version: v4.5.7
2026-08-17T13:12:24.8270038Z Server Version: 4.15.59
2026-08-17T13:12:24.8270197Z Kubernetes Version: v1.28.15+d227d65
2026-08-17T13:12:24.8302809Z ++ /usr/local/bin/oc-v4.13 get pod -l name=simpi-dict-api-des -n simpi-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-08-17T13:12:24.8303165Z ++ tac
2026-08-17T13:12:24.8303464Z ++ grep -v '^$'
2026-08-17T13:12:24.8303570Z ++ head -n1
2026-08-17T13:12:24.9514117Z + last_pod=simpi-dict-api-des-10-drrbj
2026-08-17T13:12:24.9514746Z + echo 'Logs do POD: simpi-dict-api-des-10-drrbj'
2026-08-17T13:12:24.9515609Z + /usr/local/bin/oc-v4.13 logs simpi-dict-api-des-10-drrbj -c simpi-dict-api-des -n simpi-des
2026-08-17T13:12:24.9515882Z Logs do POD: simpi-dict-api-des-10-drrbj
2026-08-17T13:12:25.0684785Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Xms1280m -Xmx1280m -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-08-17T13:12:25.0685254Z Aug 17, 2026 10:10:51 AM org.hibernate.validator.internal.util.Version
2026-08-17T13:12:25.0685472Z INFO: HV000001: Hibernate Validator 8.0.2.Final-redhat-00001
2026-08-17T13:12:25.0686275Z Configuration validation failed:
2026-08-17T13:12:25.0686516Z 	java.util.NoSuchElementException: SRCFG00011: Could not expand value SMPISD01_HSM in property HSM_PASSWORD
2026-08-17T13:12:25.0686717Z 	java.util.NoSuchElementException: SRCFG00011: Could not expand value SIMPI_ALIAS_CERT in property HSM_PRIVATE_KEY_NAME
2026-08-17T13:12:25.0688493Z 	java.util.NoSuchElementException: SRCFG00011: Could not expand value SIMPI_SN_CERT in property CERT_ASSINATURA_SERIAL_NUMBER
2026-08-17T13:12:25.0688765Z 	java.util.NoSuchElementException: SRCFG00011: Could not expand value simpi_issuer_cert in property CERT_ASSINATURA_ISSUER_NAME
2026-08-17T13:12:25.0758428Z ##[section]Finishing: Logs da Aplicação







exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Xms1280m -Xmx1280m -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
Aug 17, 2026 11:58:27 AM org.hibernate.validator.internal.util.Version
INFO: HV000001: Hibernate Validator 8.0.2.Final-redhat-00001
Configuration validation failed:
java.util.NoSuchElementException: SRCFG00011: Could not expand value SMPISD01_HSM in property HSM_PASSWORD
java.util.NoSuchElementException: SRCFG00011: Could not expand value SIMPI_ALIAS_CERT in property HSM_PRIVATE_KEY_NAME
java.util.NoSuchElementException: SRCFG00011: Could not expand value SIMPI_SN_CERT in property CERT_ASSINATURA_SERIAL_NUMBER
java.util.NoSuchElementException: SRCFG00011: Could not expand value simpi_issuer_cert in property CERT_ASSINATURA_ISSUER_NAME


Red Hat OpenShift



p585600@corp.caixa.gov.br

Administrator
Home
Overview
Projects
Search
API Explorer
Events
Operators
Workloads
Pods
Deployments
DeploymentConfigs
StatefulSets
Secrets
ConfigMaps
CronJobs
Jobs
DaemonSets
ReplicaSets
ReplicationControllers
HorizontalPodAutoscalers
PodDisruptionBudgets
Networking
Storage
Builds
Observe
Compute
User Management
Administration
Service Mesh

Project: simpi-des
Pods
Pod details
Pod
P
simpi-dict-api-des-11-5xsgs
CrashLoopBackOff

Actions
Details
Metrics
YAML
Environment
Logs
Events
Terminal
Aggregated Logs
Service Mesh
Info alert:Environment variables set from parent
View environment for resource ReplicationController
RC
simpi-dict-api-des-11
Container:

Container
C
simpi-dict-api-des
Single values (env)
NameValue
TZ
America/Sao_Paulo
BACEN_MAX_CONNECTIONS
50
BACEN_V2_HOST
dict-h.pi.rsfn.net.br
BACEN_V2_URL
https://dict-h.pi.rsfn.net.br:16522/api/v2
CERT_ASSINATURA_ISSUER_NAME
${simpi_issuer_cert}
CERT_ASSINATURA_SERIAL_NUMBER
${SIMPI_SN_CERT}
HSM_HOSTNAME
hsmdes.extra.caixa.gov.br
HSM_PASSWORD
${SMPISD01_HSM}
HSM_PRIVATE_KEY_NAME
${SIMPI_ALIAS_CERT}
HSM_USER_ID
SMPISD01
ISPB_CAIXA
00360305
JAVA_OPTIONS_APPEND
-Xms1280m -Xmx1280m -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks
KEYSTORE_PASSWORD
${SIMPI_KSPIX_01}
KEYSTORE_PATH
/deployments/simpi-des-keystore-092025.jks
PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_EMISSOR
https://login.des.caixa/auth/realms/intranet
PIX_FRAMEWORK_VALIDACAO_TOKEN_SSO_URL
https://sispi-api-proxy-sso-des.apps.pixnprd4.caixa/auth/realms/intranet;https://login.des.caixa/auth/realms/intranet
PIX_FRAMEWORK_VALIDACAO_TOKEN_VALIDACAO_GLOBAL
true
SISPI_LOGIN_CAIXA_INTERNET_URL
https://logindes.caixa.gov.br/auth/realms/internet
SISPI_LOGIN_CAIXA_INTRANET_URL
https://login.des.caixa/auth/realms/intranet
SISPI_LOGIN_PROXY_INTERNET_URL
https://sispi-api-proxy-sso-des.apps.pixnprd4.caixa/auth/realms/intranet
SISPI_LOGIN_PROXY_INTRANET_URL
https://sispi-api-proxy-sso-des-esteiras.nprd2.caixa/auth/realms/intranet
TRUSTSTORE_PASSWORD
123456
TRUSTSTORE_PATH
/deployments/simpi-des-truststore-202602.jks
SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS
simpi-dict-api-des - Secret
SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS
All values from existing ConfigMaps or Secrets (envFrom)
ConfigMap/SecretPrefix (optional)
ConfigMap/Secret
