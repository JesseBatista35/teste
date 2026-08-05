2026-08-05T15:38:03.9437861Z ##[section]Starting: Logs da Aplicação
2026-08-05T15:38:03.9441437Z ==============================================================================
2026-08-05T15:38:03.9441522Z Task         : Bash
2026-08-05T15:38:03.9441566Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-05T15:38:03.9441638Z Version      : 3.227.0
2026-08-05T15:38:03.9441695Z Author       : Microsoft Corporation
2026-08-05T15:38:03.9441746Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-05T15:38:03.9441825Z ==============================================================================
2026-08-05T15:38:04.0792587Z Generating script.
2026-08-05T15:38:04.0803720Z ========================== Starting Command Output ===========================
2026-08-05T15:38:04.0811135Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/d1257457-020e-4463-849f-f710b93f5926.sh
2026-08-05T15:38:04.0876786Z + shopt -s expand_aliases
2026-08-05T15:38:04.0877758Z + [[ -n okd4_nprd ]]
2026-08-05T15:38:04.0877943Z + [[ okd4_nprd =~ ocp ]]
2026-08-05T15:38:04.0878576Z + [[ -n okd4_nprd ]]
2026-08-05T15:38:04.0878747Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-08-05T15:38:04.0878907Z + app=sigsj-super-app-des
2026-08-05T15:38:04.0879011Z + oc version
2026-08-05T15:38:04.1518098Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-08-05T15:38:04.1518404Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-08-05T15:38:04.1518626Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-08-05T15:38:04.1570575Z ++ oc get pod -l name=sigsj-super-app-des -n sigsj-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-08-05T15:38:04.1571336Z ++ tac
2026-08-05T15:38:04.1571573Z ++ grep -v '^$'
2026-08-05T15:38:04.1571737Z ++ head -n1
2026-08-05T15:38:04.2430490Z + last_pod=sigsj-super-app-des-7-6x4qr
2026-08-05T15:38:04.2430767Z + echo 'Logs do POD: sigsj-super-app-des-7-6x4qr'
2026-08-05T15:38:04.2430972Z + oc logs sigsj-super-app-des-7-6x4qr -c sigsj-super-app-des -n sigsj-des
2026-08-05T15:38:04.2432785Z Logs do POD: sigsj-super-app-des-7-6x4qr
2026-08-05T15:38:04.3249121Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.1.jar -Dotel.exporter.otlp.endpoint=https://otel-collector-nprd.cemot.cloud.caixa -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|apim-parceiros-sandbox.azure-api.net -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-08-05T15:38:04.3249930Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-08-05T15:38:04.3250520Z 2026-08-05 12:37:26.815-03:00 INFO  c.m.a.a.i.c.ConfigurationBuilder - Some telemetry may be sampled out because a default sampling configuration was added in version 3.4.0 to reduce the default billing cost. You can set the sampling configuration explicitly: https://learn.microsoft.com/azure/azure-monitor/app/java-standalone-config#sampling
2026-08-05T15:38:04.3250960Z 2026-08-05 12:37:27.804-03:00 ERROR c.m.applicationinsights.agent - 
2026-08-05T15:38:04.3251112Z *************************
2026-08-05T15:38:04.3251551Z Application Insights Java Agent 3.7.1 startup failed (PID 8)
2026-08-05T15:38:04.3251679Z *************************
2026-08-05T15:38:04.3251749Z 
2026-08-05T15:38:04.3251906Z Description:
2026-08-05T15:38:04.3252043Z No connection string provided
2026-08-05T15:38:04.3252088Z 
2026-08-05T15:38:04.3252173Z Action:
2026-08-05T15:38:04.3252295Z Please provide connection string: https://go.microsoft.com/fwlink/?linkid=2153358
2026-08-05T15:38:04.3252371Z 
2026-08-05T15:38:04.3252474Z __  ____  __  _____   ___  __ ____  ______ 
2026-08-05T15:38:04.3252628Z  --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
2026-08-05T15:38:04.3252776Z  -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
2026-08-05T15:38:04.3253553Z --\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-08-05T15:38:04.3253993Z 2026-08-05 12:37:32,332 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.log.api.return.stacktrace" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-05T15:38:04.3254542Z 2026-08-05 12:37:32,332 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.hibernate-orm.show-sql" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-05T15:38:04.3255322Z 2026-08-05 12:37:32,922 WARN  [io.qua.run.log.LoggingSetupRecorder] (main) Log level TRACE for category 'org.hibernate.type.descriptor.sql.BasicBinder' set below minimum logging level DEBUG, promoting it to DEBUG. Set the build time configuration property 'quarkus.log.category."org.hibernate.type.descriptor.sql.BasicBinder".min-level' to 'TRACE' to avoid this warning
2026-08-05T15:38:04.3255781Z 2026-08-05 12:37:36,213 INFO  [io.quarkus] (main) SIGSJ-backend-superapp 1.1.0.0 on JVM (powered by Quarkus 3.27.4) started in 8.401s. Listening on: http://0.0.0.0:8080
2026-08-05T15:38:04.3256047Z 2026-08-05 12:37:36,213 INFO  [io.quarkus] (main) Profile prod activated. 
2026-08-05T15:38:04.3256524Z 2026-08-05 12:37:36,213 INFO  [io.quarkus] (main) Installed features: [agroal, cache, cdi, cxf, hibernate-orm, hibernate-orm-panache, hibernate-validator, jdbc-db2, micrometer, narayana-jta, oidc-client, rest, rest-client, rest-client-jackson, rest-jackson, security, smallrye-context-propagation, smallrye-health, smallrye-jwt, smallrye-openapi, swagger-ui, vertx]
2026-08-05T15:38:04.3256975Z 2026-08-05 12:37:49,207 INFO  [io.qua.htt.access-log] (vert.x-eventloop-thread-1) 25.2.12.1 - - [05/Aug/2026:12:37:49 -0300] "GET /q/health/live HTTP/1.1" 200 45
2026-08-05T15:38:04.3257313Z 2026-08-05 12:37:59,067 INFO  [io.qua.htt.access-log] (vert.x-eventloop-thread-0) 25.2.12.1 - - [05/Aug/2026:12:37:59 -0300] "GET /q/health/live HTTP/1.1" 200 45
2026-08-05T15:38:04.3257656Z 2026-08-05 12:37:59,074 INFO  [io.qua.htt.access-log] (vert.x-eventloop-thread-1) 25.2.12.1 - - [05/Aug/2026:12:37:59 -0300] "GET /q/health/ready HTTP/1.1" 200 220
2026-08-05T15:38:04.3357232Z ##[section]Finishing: Logs da Aplicação
