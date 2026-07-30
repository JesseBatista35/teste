exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-sispl-v2.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-07-30 16:22:25,525 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.hibernate-orm.idaa.active" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
quarkus.datasource.idaa.jdbc.url has not been defined



    Topology
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

    Services
    Routes
    Ingresses
    NetworkPolicies
    UserDefinedNetworks

    Pods

    Pod details

PodP sispl-api-mkp-hmp-74c7c78bcd-9ht22
CrashLoopBackOff

    Details
    Metrics
    YAML
    Environment
    Logs
    Events
    Terminal

Streaming events...
Showing 9 events
Older events are not stored.
PodPsispl-api-mkp-hmp-74c7c78bcd-9ht22NamespaceNSsispl-hmp
há 2 minutos
Generated from kubelet on nctvmrh001-scgft-worker-0-7lwkw
26 times in the last 1 hour
Container image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-api-mkp:3.32.0.0" already present on machine
PodPsispl-api-mkp-hmp-74c7c78bcd-9ht22NamespaceNSsispl-hmp
há 3 minutos
Generated from kubelet on nctvmrh001-scgft-worker-0-7lwkw
310 times in the last 1 hour
Back-off restarting failed container sispl-api-mkp-hmp in pod sispl-api-mkp-hmp-74c7c78bcd-9ht22_sispl-hmp(3379c474-1dbb-4ef7-9319-6811bc9e5051)
PodPsispl-api-mkp-hmp-74c7c78bcd-9ht22NamespaceNSsispl-hmp
30 de jul. de 2026, 16:10
Generated from kubelet on nctvmrh001-scgft-worker-0-7lwkw
24 times in the last 1 hour
Liveness probe failed: Get "http://25.129.7.31:8080/q/health/live": dial tcp 25.129.7.31:8080: connect: connection refused
PodPsispl-api-mkp-hmp-74c7c78bcd-9ht22NamespaceNSsispl-hmp
30 de jul. de 2026, 16:10
Generated from kubelet on nctvmrh001-scgft-worker-0-7lwkw
22 times in the last 1 hour
Created container: sispl-api-mkp-hmp
PodPsispl-api-mkp-hmp-74c7c78bcd-9ht22NamespaceNSsispl-hmp
30 de jul. de 2026, 15:30
Generated from kubelet on nctvmrh001-scgft-worker-0-7lwkw
4 times in the last 1 hour
Container sispl-api-mkp-hmp failed liveness probe, will be restarted
PodPsispl-api-mkp-hmp-74c7c78bcd-9ht22NamespaceNSsispl-hmp
30 de jul. de 2026, 15:18
Generated from kubelet on nctvmrh001-scgft-worker-0-7lwkw
8 times in the last 1 hour
Started container sispl-api-mkp-hmp
PodPsispl-api-mkp-hmp-74c7c78bcd-9ht22NamespaceNSsispl-hmp
30 de jul. de 2026, 15:06
Generated from kubelet on nctvmrh001-scgft-worker-0-7lwkw
Readiness probe failed: Get "http://25.129.7.31:8080/q/health/ready": dial tcp 25.129.7.31:8080: connect: connection refused
PodPsispl-api-mkp-hmp-74c7c78bcd-9ht22NamespaceNSsispl-hmp
30 de jul. de 2026, 15:05
Generated from multus
Add eth0 [25.129.7.31/23] from ovn-kubernetes
PodPsispl-api-mkp-hmp-74c7c78bcd-9ht22NamespaceNSsispl-hmp
30 de jul. de 2026, 15:05
Generated from default-scheduler
Successfully assigned sispl-hmp/sispl-api-mkp-hmp-74c7c78bcd-9ht22 to nctvmrh001-scgft-worker-0-7lwkw
















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
SISPL-api-mkp-ocp4-plus
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
    SISPL
    

Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
EGRESS_IP_OKD (74)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OPENSHIFT-NPRD-LOTERIAS (8)
Credenciais para o Cluster OPENSHIFT de NPRD LOTERIAS
Scopes: EC DES,EC TQS,EC HMP
SISPL-API-MKP-OCP4-DES (46)
Scopes: EC DES
SISPL-API-MKP-OCP4-TQS (42)
Scopes: EC TQS
ENV.CAIXA_TEST_TOKEN
teste
ENV.QUARKUS_DATASOURCE_JDBC_NEW-CONNECTION-SQL
SELECT 1 FROM SYSIBM.SYSDUMMY1 WITH UR
ENV.QUARKUS_DATASOURCE_METRICS_ENABLED
true
ENV.QUARKUS_OIDC_ROLES_ROLE-CLAIM-PATH
realm_access/roles
ENV.SISPL_AMBIENTE
TQS
PASS_DB
S493467
PASS_DB_IDAA
SSPLTI01
_ENV.CAIXA_SECURITY_CLIENTS-AUTHORIZED
cli-ser-spl+cli-ser-lce+cli-ser-spl_jboss
_ENV.QUARKUS_DATASOURCE_DB-KIND
db2
_ENV.QUARKUS_DATASOURCE_JDBC_ACQUISITION-TIMEOUT
5
_ENV.QUARKUS_DATASOURCE_JDBC_BACKGROUND_VALIDATION_INTERVAL
0
_ENV.QUARKUS_DATASOURCE_JDBC_DRIVER
com.ibm.db2.jcc.DB2Driver
_ENV.QUARKUS_DATASOURCE_JDBC_IDLE_REMOVAL_INTERVAL
0
_ENV.QUARKUS_DATASOURCE_JDBC_INITIAL-SIZE
15
_ENV.QUARKUS_DATASOURCE_JDBC_MAX-SIZE
60
_ENV.QUARKUS_DATASOURCE_JDBC_MAX_LIFETIME
0
_ENV.QUARKUS_DATASOURCE_JDBC_MIN-SIZE
5
_ENV.QUARKUS_DATASOURCE_JDBC_URL
jdbc:db2://10.192.224.102:5031/CSD4
_ENV.QUARKUS_DATASOURCE_USERNAME
SSPLTB01
_ENV.QUARKUS_DATASOURCE__IDAA__JDBC_URL
jdbc:db2://10.192.224.76:5051/CSDA
_ENV.QUARKUS_DATASOURCE__IDAA__USERNAME
SSPLTI01
_ENV.QUARKUS_HIBERNATE_ORM__IDAA__ACTIVE
true
_ENV.QUARKUS_HTTP_CORS
true
_ENV.QUARKUS_HTTP_PORT
8080
_ENV.QUARKUS_HTTP_TEST-PORT
8083
_ENV.QUARKUS_LOG_LEVEL
INFO
_ENV.QUARKUS_OIDC_APPLICATION-TYPE
service
_ENV.QUARKUS_OIDC_AUTH-SERVER-URL
https://login.hmp.corp.caixa.gov.br/auth/realms/internet
_ENV.QUARKUS_OIDC_CLISERLCE_AUTH_SERVER_URL
https://logindes.caixa.gov.br/auth/realms/internet
_ENV.QUARKUS_OIDC_CLISERLCE_PUBLIC_KEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxz8PNmiUW5J1669pWY0APB4flqqDnghAv/QV5DIHyXE39fj9u1DPXbgfDUhUfK0i/B0CHJukbI44Rgo/vuhCMImTnLjS49XuTH6GI4lU/CtdzE/qACMO/GUky73m0Uszo2Bh1wNV+fvw/mMQVAGKj6/qXjSB9npRZKydoXnwGPIepcrqF6KkMJIFtZ+0w35J9SYwgLNezUbAJgs9dq3yMj4ussSfxMFcUC9UKziJJSg0UQfl0fOQGMsrsnUbS2GgXeDqdskbZq9/wfL0ikU2pWf0hKjX+PXtqZI0SVWurVyydc0efbTE7qIlrwF8lWZ8NZ8zcV2oVk7TjoIktZ4zBwIDAQAB
_ENV.QUARKUS_OIDC_PUBLIC-KEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAit1thbeiAunuUBSUYaecT66xS5c0ab/zXCek+IUn73CnGMTtRFFM9DP0bQ4c2oOu+856bK5S9O334JOsu68mMy0YsZfiiK3pR9oUw118XR73yNnyuDUYAboCfyOhX+YOuLVnhNeh5UwLwJ+vpLcuLrp7wih6rqCF1oO5tZHOjtKv0QHYhw3dArkFAL+q5gbod6LpAyNq49jhJ2dD+YQfKHH9xJpXgbJ7U9roGH2S73aG3Fxv1ZD6r6c7nRxbEDeazsr+PZnv+FKa7GYGqhQkvxsXPonwiiVgEvlhm+l5Xxq9oRkiNj4Aq4ARgiMBTnQnnHTgVe5B3ZTd7HPR9HmjxQIDAQAB
_ENV.QUARKUS_REST_CLIENT_CSWCRIPTO_CONNECTION_POOL_SIZE
40
_ENV.QUARKUS_REST_CLIENT_CSWCRIPTO_CONNECT_TIMEOUT
10000
_ENV.QUARKUS_REST_CLIENT_CSWCRIPTO_READ_TIMEOUT
30000
_ENV.QUARKUS_REST_CLIENT_CSWCRIPTO_SCOPE
javax.enterprise.context.ApplicationScoped
_ENV.QUARKUS_REST_CLIENT_CSWCRIPTO_URL
http://d2df.coredf.caixa:1081
_ENV.QUARKUS_SWAGGER_UI_ALWAYS_INCLUDE
true
_ENV_JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.5.1.jar"
_SECRET.QUARKUS_DATASOURCE_PASSWORD
S493467
_SECRET.QUARKUS_DATASOURCE__IDAA__PASSWORD
#{PASS_DB_IDAA}#
_SECRET.mock2
#{mock2}#
mock2
changeit
SISPL-API-MKP-OCP4-HMP (49)
Scopes: EC HMP
ENV.CAIXA_TEST_TOKEN
teste
ENV.QUARKUS_DATASOURCE_JDBC_NEW-CONNECTION-SQL
SELECT 1 FROM SYSIBM.SYSDUMMY1 WITH UR
ENV.QUARKUS_DATASOURCE_METRICS_ENABLED
true
ENV.QUARKUS_OIDC_ROLES_ROLE_CLAIM_PATH
realm_access/roles
ENV.SISPL_AMBIENTE
HMP
PASS_DB
PP3KD5BR
_ENV.CAIXA_SECURITY_CLIENTS_AUTHORIZED
cli-ser-spl+cli-ser-lce+cli-ser-spl_jboss
_ENV.QUARKUS_DATASOURCE_DB_KIND
db2
_ENV.QUARKUS_DATASOURCE_JDBC_ACQUISITION_TIMEOUT
5
_ENV.QUARKUS_DATASOURCE_JDBC_BACKGROUND_VALIDATION_INTERVAL
1M
_ENV.QUARKUS_DATASOURCE_JDBC_DRIVER
com.ibm.db2.jcc.DB2Driver
_ENV.QUARKUS_DATASOURCE_JDBC_INITIAL_SIZE
15
_ENV.QUARKUS_DATASOURCE_JDBC_MAX_SIZE
60
_ENV.QUARKUS_DATASOURCE_JDBC_MIN_SIZE
5
_ENV.QUARKUS_DATASOURCE_JDBC_URL
jdbc:db2://10.192.232.92:5021/CSH1
_ENV.QUARKUS_DATASOURCE_USERNAME
SPLJDBC
_ENV.QUARKUS_HTTP_CORS
true
_ENV.QUARKUS_HTTP_PORT
8080
_ENV.QUARKUS_HTTP_TEST_PORT
8083
_ENV.QUARKUS_LOG_LEVEL
INFO
_ENV.QUARKUS_OIDC_APPLICATION_TYPE
service
_ENV.QUARKUS_OIDC_AUTH_SERVER_URL
https://login.hmp.corp.caixa.gov.br/auth/realms/internet
_ENV.QUARKUS_OIDC_CLIENT_ID
cli-ser-spl
_ENV.QUARKUS_OIDC_CLISERLCE_AUTH_SERVER_URL
https://login.hmp.corp.caixa.gov.br/auth/realms/internet
_ENV.QUARKUS_OIDC_CLISERLCE_CLIENT_ID
cli-ser-lce
_ENV.QUARKUS_OIDC_CLISERLCE_PUBLIC_KEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAit1thbeiAunuUBSUYaecT66xS5c0ab/zXCek+IUn73CnGMTtRFFM9DP0bQ4c2oOu+856bK5S9O334JOsu68mMy0YsZfiiK3pR9oUw118XR73yNnyuDUYAboCfyOhX+YOuLVnhNeh5UwLwJ+vpLcuLrp7wih6rqCF1oO5tZHOjtKv0QHYhw3dArkFAL+q5gbod6LpAyNq49jhJ2dD+YQfKHH9xJpXgbJ7U9roGH2S73aG3Fxv1ZD6r6c7nRxbEDeazsr+PZnv+FKa7GYGqhQkvxsXPonwiiVgEvlhm+l5Xxq9oRkiNj4Aq4ARgiMBTnQnnHTgVe5B3ZTd7HPR9HmjxQIDAQAB
_ENV.QUARKUS_OIDC_INTRANET_AUTH_SERVER_URL
https://login.hmp.caixa/auth/realms/intranet
_ENV.QUARKUS_OIDC_INTRANET_GESTAO_AUTH_SERVER_URL
https://login.hmp.caixa/auth/realms/intranet
_ENV.QUARKUS_OIDC_PUBLIC_KEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAit1thbeiAunuUBSUYaecT66xS5c0ab/zXCek+IUn73CnGMTtRFFM9DP0bQ4c2oOu+856bK5S9O334JOsu68mMy0YsZfiiK3pR9oUw118XR73yNnyuDUYAboCfyOhX+YOuLVnhNeh5UwLwJ+vpLcuLrp7wih6rqCF1oO5tZHOjtKv0QHYhw3dArkFAL+q5gbod6LpAyNq49jhJ2dD+YQfKHH9xJpXgbJ7U9roGH2S73aG3Fxv1ZD6r6c7nRxbEDeazsr+PZnv+FKa7GYGqhQkvxsXPonwiiVgEvlhm+l5Xxq9oRkiNj4Aq4ARgiMBTnQnnHTgVe5B3ZTd7HPR9HmjxQIDAQAB
_ENV.QUARKUS_REST_CLIENT_CSWCRIPTOLOTE_URL
http://10.192.232.92:8083
_ENV.QUARKUS_REST_CLIENT_CSWCRIPTO_CONNECTION_POOL_SIZE
40
_ENV.QUARKUS_REST_CLIENT_CSWCRIPTO_CONNECT_TIMEOUT
10000
_ENV.QUARKUS_REST_CLIENT_CSWCRIPTO_READ_TIMEOUT
30000
_ENV.QUARKUS_REST_CLIENT_CSWCRIPTO_SCOPE
javax.enterprise.context.ApplicationScoped
_ENV.QUARKUS_REST_CLIENT_CSWCRIPTO_URL
http://10.192.232.92:1081
_ENV.QUARKUS_REST_CLIENT_TOKENSSO_URL
https://login.hmp.corp.caixa.gov.br/auth/realms/internet/protocol/openid-connect/token
_ENV.QUARKUS_SWAGGER_UI_ALWAYS_INCLUDE
true
_ENV.SISPL_MKP_CLIENTID
cli-ser-spl
_ENV.SISPL_MKP_CLIENTSECRET
0fb22b14-5a3f-493c-aba6-2c95ae26815b
_ENV.SISPL_MQ_CHANNEL
SYSTEM.DEF.SVRCONN
_ENV.SISPL_MQ_HOSTNAME
10.192.232.92
_ENV.SISPL_MQ_MANAGER
BRH1
_ENV.SISPL_MQ_PORT
1414
_ENV.SISPL_MQ_QUEUE_CAPTACAO_BACKOUT
LQ.LOG.SISPL.MARKETPLACE.BACKOUT
_ENV.SISPL_MQ_USERNAME
SSPLBH03
_ENV_JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-sispl-v2.jks"
_SECRET.QUARKUS_DATASOURCE_PASSWORD
#{PASS_DB}#
_SECRET.mock2
#{mock2}#
mock2
changeit
|Manage variable groups

Get started and run this pipeline for the first time!

1 pipelines found

Showing filters 1 through 2

Showing 16 deployments

EC HMPDeploy release

Showing filters 1 through 2

Showing filters 1 through 2

Expanded

Row 4

Collapsed

Expanded

Row 3

Collapsed

Row 2

4 pipelines found

Row 4

Row 4

4 pipelines found

Row 4

Showing filters 1 through 2

