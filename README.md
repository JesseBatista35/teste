exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-09 17:32:15.294-03:00 WARN c.m.a.a.i.c.ConfigurationBuilder - Unrecognized field "overrides" (class com.microsoft.applicationinsights.agent.internal.configuration.Configuration$Sampling), not marked as ignorable (one known property: "percentage"])
at [Source: (String)"{"sampling":{"overrides":[{"telemetryType":"request","attributes":[{"key":"url.path","value":"^(\/q)?\/health\/.*","matchType":"regexp"}],"percentage":0}]}}"; line: 1, column: 27] (through reference chain: com.microsoft.applicationinsights.agent.internal.configuration.Configuration["sampling"]->com.microsoft.applicationinsights.agent.internal.configuration.Configuration$Sampling["overrides"])
2026-09-09 17:32:18.678-03:00 INFO c.m.applicationinsights.agent - ApplicationInsights Java Agent 3.3.1 started successfully (PID 8)
2026-09-09 17:32:18.678-03:00 INFO c.m.applicationinsights.agent - Java version: 17.0.7, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-17-openjdk-17.0.7.0.7-3.el8.x86_64
__ ____ __ _____ ___ __ ____ ______
--/ __ \/ / / / _ | / _ \/ //_/ / / / __/
-/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-09-09 17:32:26,717 INFO [io.micrometer.core.instrument.push.PushMeterRegistry] (main) Publishing metrics for AzureMonitorMeterRegistry every 1m




2026-09-09T20:31:58.1358969Z ##[section]Starting: Verificando Status do Deployment
2026-09-09T20:31:58.1362567Z ==============================================================================
2026-09-09T20:31:58.1362645Z Task         : Bash
2026-09-09T20:31:58.1362737Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-09T20:31:58.1362800Z Version      : 3.227.0
2026-09-09T20:31:58.1362844Z Author       : Microsoft Corporation
2026-09-09T20:31:58.1362918Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-09T20:31:58.1362995Z ==============================================================================
2026-09-09T20:31:58.2901347Z Generating script.
2026-09-09T20:31:58.2912195Z ========================== Starting Command Output ===========================
2026-09-09T20:31:58.2919134Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/e22ae17e-8338-4636-b445-5a9cf55e6e69.sh
2026-09-09T20:31:58.3841033Z Waiting for rollout to finish: 0 out of 3 new replicas have been updated...
2026-09-09T20:32:01.3595388Z Waiting for rollout to finish: 0 out of 3 new replicas have been updated...
2026-09-09T20:32:01.4344199Z Waiting for rollout to finish: 1 out of 3 new replicas have been updated...
2026-09-09T20:35:21.7816517Z Waiting for rollout to finish: 1 out of 3 new replicas have been updated...
2026-09-09T20:35:22.2907891Z Waiting for rollout to finish: 1 out of 3 new replicas have been updated...
2026-09-09T20:35:23.2710167Z Waiting for rollout to finish: 1 out of 3 new replicas have been updated...
2026-09-09T20:36:04.4799643Z Waiting for rollout to finish: 2 out of 3 new replicas have been updated...
2026-09-09T20:38:05.6463054Z ##[error]The task has timed out.
2026-09-09T20:38:05.6464673Z ##[section]Finishing: Verificando Status do Deployment


2026-09-09T20:38:05.6493173Z ##[section]Starting: Logs da Aplicação
2026-09-09T20:38:05.6498453Z ==============================================================================
2026-09-09T20:38:05.6498598Z Task         : Bash
2026-09-09T20:38:05.6498667Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-09T20:38:05.6498814Z Version      : 3.227.0
2026-09-09T20:38:05.6498885Z Author       : Microsoft Corporation
2026-09-09T20:38:05.6498975Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-09T20:38:05.6499166Z ==============================================================================
2026-09-09T20:38:05.8089458Z Generating script.
2026-09-09T20:38:05.8101025Z ========================== Starting Command Output ===========================
2026-09-09T20:38:05.8108473Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/22482e7f-d5a7-45db-b706-0e79d667e974.sh
2026-09-09T20:38:05.8165529Z + shopt -s expand_aliases
2026-09-09T20:38:05.8165805Z + [[ -n okd4_nprd ]]
2026-09-09T20:38:05.8166150Z + [[ okd4_nprd =~ ocp ]]
2026-09-09T20:38:05.8166458Z + [[ -n okd4_nprd ]]
2026-09-09T20:38:05.8166602Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-09-09T20:38:05.8166783Z + app=sisgf-backend-des
2026-09-09T20:38:05.8168294Z + oc version
2026-09-09T20:38:05.8893789Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-09-09T20:38:05.8894221Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-09-09T20:38:05.8894449Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-09-09T20:38:05.8919484Z ++ oc get pod -l name=sisgf-backend-des -n sisgf-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-09T20:38:05.8921614Z ++ tac
2026-09-09T20:38:05.8922014Z ++ grep -v '^$'
2026-09-09T20:38:05.8923698Z ++ head -n1
2026-09-09T20:38:06.0179196Z + last_pod=sisgf-backend-des-376-h5vw6
2026-09-09T20:38:06.0179722Z + echo 'Logs do POD: sisgf-backend-des-376-h5vw6'
2026-09-09T20:38:06.0180121Z + oc logs sisgf-backend-des-376-h5vw6 -c sisgf-backend-des -n sisgf-des
2026-09-09T20:38:06.0180615Z Logs do POD: sisgf-backend-des-376-h5vw6
2026-09-09T20:38:06.1055486Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-09-09T20:38:06.1056128Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-09T20:38:06.1056798Z 2026-09-09 17:36:15.890-03:00 WARN  c.m.a.a.i.c.ConfigurationBuilder - Unrecognized field "overrides" (class com.microsoft.applicationinsights.agent.internal.configuration.Configuration$Sampling), not marked as ignorable (one known property: "percentage"])
2026-09-09T20:38:06.1057486Z  at [Source: (String)"{"sampling":{"overrides":[{"telemetryType":"request","attributes":[{"key":"url.path","value":"^(\/q)?\/health\/.*","matchType":"regexp"}],"percentage":0}]}}"; line: 1, column: 27] (through reference chain: com.microsoft.applicationinsights.agent.internal.configuration.Configuration["sampling"]->com.microsoft.applicationinsights.agent.internal.configuration.Configuration$Sampling["overrides"])
2026-09-09T20:38:06.1057956Z 2026-09-09 17:36:18.790-03:00 INFO  c.m.applicationinsights.agent - ApplicationInsights Java Agent 3.3.1 started successfully (PID 8)
2026-09-09T20:38:06.1058333Z 2026-09-09 17:36:18.791-03:00 INFO  c.m.applicationinsights.agent - Java version: 17.0.7, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-17-openjdk-17.0.7.0.7-3.el8.x86_64
2026-09-09T20:38:06.1058549Z __  ____  __  _____   ___  __ ____  ______ 
2026-09-09T20:38:06.1058746Z  --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
2026-09-09T20:38:06.1058887Z  -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
2026-09-09T20:38:06.1059476Z --\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-09-09T20:38:06.1059773Z 2026-09-09 17:36:25,309 INFO  [io.micrometer.core.instrument.push.PushMeterRegistry] (main) Publishing metrics for AzureMonitorMeterRegistry every 1m
2026-09-09T20:38:06.1140851Z ##[section]Finishing: Logs da Aplicação



o pod esta rodando mais a release quebrou
