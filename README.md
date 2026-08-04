exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.1.1.jar -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-08-04 15:14:38.198-03 ERROR c.m.applicationinsights.agent -
*************************
ApplicationInsights Java Agent 3.1.1 failed to start
*************************
Description:
No connection string or instrumentation key provided
Action:
Please provide connection string or instrumentation key.
__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-08-04 15:14:40,311 WARN  [io.qua.agr.run.AgroalConnectionConfigurer] (main) Agroal does not support detecting if a connection is still usable after an exception for database kind: db2
2026-08-04 15:14:42,417 INFO  [io.quarkus] (main) sispl-api-apostas 1.2.19.0 on JVM (powered by Quarkus 2.7.6.Final) started in 4.216s. Listening on: http://0.0.0.0:8080
2026-08-04 15:14:42,418 INFO  [io.quarkus] (main) Profile prod activated.
2026-08-04 15:14:42,418 INFO  [io.quarkus] (main) Installed features: [agroal, cache, cdi, hibernate-validator, loterias-api-commons, loterias-api-exceptions, loterias-api-security, narayana-jta, oidc, rest-client, rest-client-jackson, resteasy, resteasy-jackson, security, smallrye-context-propagation, smallrye-health, smallrye-metrics, smallrye-openapi, vertx]


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
SISPL-api-apostas-ocp4-plus
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
SISPL

SISPL-api-apostas-ocp4-plus
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
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OPENSHIFT-NPRD-LOTERIAS (8)
Credenciais para o Cluster OPENSHIFT de NPRD LOTERIAS
Scopes: EC DES,EC TQS,EC HMP
SISPL-API-APOSTAS-DES (27)
Scopes: EC DES
PASS_DB
********
PASS_DB_SISPL
********
URL_CUSTOMIZADA
apiloteriasonline.caixa
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=123909f2-cf26-409f-9b2b-d7d3087d43cd;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SISPL-api-apostas-DES
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
30
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.CAIXA_SECURITY_CLIENTS_AUTHORIZED
cli-web-lce+cli-mob-nbm+cli-mob-lce+cli-ser-ceq-1
_ENV.HTTPS_PROXY
http://proxydes.caixa:80/
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.1.1.jar"
_ENV.NO_PROXY
*.caixa,*.caixa.gov.br
_ENV.QUARKUS_DATASOURCE_JDBC_MAX_SIZE
60
_ENV.QUARKUS_DATASOURCE_JDBC_MIN_SIZE
15
_ENV.QUARKUS_DATASOURCE_JDBC_URL
jdbc:db2://10.192.224.102:5031/CSD4
_ENV.QUARKUS_DATASOURCE_USERNAME
SSPLBT03
_ENV.QUARKUS_HTTP_CORS
true
_ENV.QUARKUS_HTTP_CORS_ORIGINS
https://silce-web.tqs.caixa,https://localhost:8443,https://silce-web2.tqs.caixa
_ENV.QUARKUS_LOG_LEVEL
DEBUG
_ENV.QUARKUS_OIDC_AUTH_SERVER_URL
https://logindes.caixa.gov.br/auth/realms/internet
_ENV.QUARKUS_OIDC_INTRANET_AUTH_SERVER_URL
https://login.des.caixa/auth/realms/intranet
_ENV.SISPL_AMBIENTE
DES
_ENV.SISPL_MOCK_ATIVADO
false
_SECRET.QUARKUS_DATASOURCE_PASSWORD
#{PASS_DB}#
_SECRET.QUARKUS_DATASOURCE_SISPL_PASSWORD
#{PASS_DB_SISPL}#
_SECRET.mock2
#{mock2}#
mock2
changeit
SISPL-API-APOSTAS-TQS (1)
OCP4-PLUS

Scopes: EC TQS
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.1.1.jar"
SISPL-API-APOSTAS-OCP4-HMP (35)
Scopes: EC HMP
|Manage variable groups
Row 2

8 pipelines found

Select a release pipeline to view its releases

4 pipelines found

Select a release pipeline to view its releases

4 pipelines found

Row 4

Showing filters 1 through 2

List item selected

Row 2

EC TQSDeploy release

Showing filters 1 through 2

List item deselected

List item selected

Row 2

EC TQSDeploy release

Expanded

Row 3

Collapsed

Showing filters 1 through 2

