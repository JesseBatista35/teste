
sifpp-micro-tqs-8-bcp59
Running


OKD


Jesse Mouta Pereira Batista

Administrator
Home
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

Project: sifpp-tqs
Pods
Pod details
Pod
P
sifpp-micro-tqs-8-bcp59
Running

Actions
Details
Metrics
YAML
Environment
Logs
Events
Terminal
Info alert:Environment variables set from parent
View environment for resource ReplicationController
RC
sifpp-micro-tqs-8
Container:

Container
C
sifpp-micro-tqs
Single values (env)
NameValue
TZ
America/Sao_Paulo
APPLICATIONINSIGHTS_CONNECTION_STRING
InstrumentationKey=f6b9b060-c8fc-4702-a924-a3632ca25bb1;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/
APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
APPLICATIONINSIGHTS_ROLE_NAME
SIFPP-TQS
HEALTH_URL
https://sifpp-micro-tqs.apps.nprd.caixa
HTTPS_PROXY
http://proxydes.caixa:80
HTTP_PROXY
http://proxydes.caixa:80
JAVA_OPTIONS_APPEND
-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks
NO_PROXY
.caixa,.caixa.gov.br,10.116.82.66
QUARKUS_LOG_LEVEL
INFO
SSO_CLI_SER_FPP
cli-ser-fpp
URL_BOLETO
https://api.des.caixa:8443
URL_BOLETO_ENDPOINT
/cobranca/boletos/v1/incluiBoleto
SSO_PASS_CLI_SER_FPP
sifpp-micro-tqs - Secret
SSO_PASS_CLI_SER_FPP
All values from existing ConfigMaps or Secrets (envFrom)
ConfigMap/SecretPrefix (optional)
ConfigMap/Secret



exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|10.116.82.66 -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
[38;5;145m2026-08-28 16:17:39,232[39m[38;5;188m [39m[38;5;137mWARN [39m[38;5;188m [[39m[38;5;69mio.qua.config[39m[38;5;188m] ([39m[38;5;71mmain[39m[38;5;188m) [39m[38;5;151m[39mUnrecognized configuration key "[38;5;188mquarkus.rest-client.logging.level[39m" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-28 16:17:39,232[39m[38;5;188m [39m[38;5;137mWARN [39m[38;5;188m [[39m[38;5;69mio.qua.config[39m[38;5;188m] ([39m[38;5;71mmain[39m[38;5;188m) [39m[38;5;151m[39mUnrecognized configuration key "[38;5;188mquarkus.rest-client."sso.keycloak".insecure[39m" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-28 16:17:40,806[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mio.quarkus[39m[38;5;188m] ([39m[38;5;71mmain[39m[38;5;188m) [39m[38;5;151m[39m[38;5;188msifpp-ms 0.0.0.1[39m [38;5;188mon JVM[39m (powered by Quarkus [38;5;188m3.15.3.redhat-00002[39m) started in [38;5;188m2.175[39ms. [38;5;188mListening on: http://0.0.0.0:8080[39m[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-28 16:17:40,806[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mio.quarkus[39m[38;5;188m] ([39m[38;5;71mmain[39m[38;5;188m) [39m[38;5;151m[39mProfile[38;5;188m[39m [38;5;188mprod[39m activated. [38;5;188m[39m[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-28 16:17:40,806[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mio.quarkus[39m[38;5;188m] ([39m[38;5;71mmain[39m[38;5;188m) [39m[38;5;151m[39mInstalled features: [[38;5;188magroal, cache, cdi, hibernate-orm, hibernate-validator, jdbc-mssql, narayana-jta, oidc, oidc-client, rest, rest-client, rest-client-jackson, rest-client-oidc-filter, rest-jackson, security, smallrye-context-propagation, smallrye-fault-tolerance, smallrye-health, smallrye-metrics, smallrye-openapi, swagger-ui, vertx[39m][39m[38;5;203m[39m[38;5;227m
[39m


vou pedir pra ele fazer um teste la


