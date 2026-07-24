2026-07-23T23:59:52.4489545Z ##[section]Starting: Verificando Status do Deployment
2026-07-23T23:59:52.4493016Z ==============================================================================
2026-07-23T23:59:52.4493091Z Task         : Bash
2026-07-23T23:59:52.4493167Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-23T23:59:52.4493229Z Version      : 3.227.0
2026-07-23T23:59:52.4493270Z Author       : Microsoft Corporation
2026-07-23T23:59:52.4493354Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-23T23:59:52.4493426Z ==============================================================================
2026-07-23T23:59:52.5916581Z Generating script.
2026-07-23T23:59:52.5930649Z ========================== Starting Command Output ===========================
2026-07-23T23:59:52.5939487Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/44ecd001-d578-40e5-9ef9-c432337fd0a6.sh
2026-07-23T23:59:52.6856409Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-07-23T23:59:54.5176237Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-07-23T23:59:54.5672366Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-07-24T00:05:43.9872579Z Waiting for latest deployment config spec to be observed by the controller loop...
2026-07-24T00:05:59.9605828Z ##[error]The task has timed out.
2026-07-24T00:05:59.9607082Z ##[section]Finishing: Verificando Status do Deployment



2026-07-24T00:05:59.9632159Z ##[section]Starting: Logs da Aplicação
2026-07-24T00:05:59.9636471Z ==============================================================================
2026-07-24T00:05:59.9636622Z Task         : Bash
2026-07-24T00:05:59.9636664Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-24T00:05:59.9636735Z Version      : 3.227.0
2026-07-24T00:05:59.9636843Z Author       : Microsoft Corporation
2026-07-24T00:05:59.9636892Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-24T00:05:59.9636962Z ==============================================================================
2026-07-24T00:06:00.3476568Z Generating script.
2026-07-24T00:06:00.3477613Z ========================== Starting Command Output ===========================
2026-07-24T00:06:00.3478977Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/501a3140-c54a-4011-b558-0c3e2e70b074.sh
2026-07-24T00:06:00.3479156Z + shopt -s expand_aliases
2026-07-24T00:06:00.3479296Z + [[ -n okd4_nprd ]]
2026-07-24T00:06:00.3479445Z + [[ okd4_nprd =~ ocp ]]
2026-07-24T00:06:00.3479565Z + [[ -n okd4_nprd ]]
2026-07-24T00:06:00.3479770Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-07-24T00:06:00.3479961Z + app=sipcs-digital-pay-provisionamento-visa-des
2026-07-24T00:06:00.3480074Z + oc version
2026-07-24T00:06:00.3480309Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-07-24T00:06:00.3480490Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-07-24T00:06:00.3480670Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-07-24T00:06:00.3480963Z ++ oc get pod -l name=sipcs-digital-pay-provisionamento-visa-des -n sipcs-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-07-24T00:06:00.3481122Z ++ tac
2026-07-24T00:06:00.3481244Z ++ grep -v '^$'
2026-07-24T00:06:00.3481338Z ++ head -n1
2026-07-24T00:06:00.3481502Z + last_pod=sipcs-digital-pay-provisionamento-visa-des-14-sx9jc
2026-07-24T00:06:00.3481750Z + echo 'Logs do POD: sipcs-digital-pay-provisionamento-visa-des-14-sx9jc'
2026-07-24T00:06:00.3482017Z + oc logs sipcs-digital-pay-provisionamento-visa-des-14-sx9jc -c sipcs-digital-pay-provisionamento-visa-des -n sipcs-des
2026-07-24T00:06:00.3482242Z Logs do POD: sipcs-digital-pay-provisionamento-visa-des-14-sx9jc
2026-07-24T00:06:00.4321715Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.5.1.jar -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-07-24T00:06:00.4322184Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-24T00:06:00.4323267Z 2026-07-23 21:05:57.262-03:00 WARN  c.a.c.h.netty.implementation.Utility - The following Netty dependencies have versions that do not match the versions specified in the azure-core-http-netty pom.xml file. This may result in unexpected behavior. If your application runs without issue this message can be ignored, otherwise please update the Netty dependencies to match the versions specified in the pom.xml file. Versions found in runtime: 'io.netty:netty-common' version not found (expected: 4.1.101.Final),'io.netty:netty-handler' version not found (expected: 4.1.101.Final),'io.netty:netty-handler-proxy' version not found (expected: 4.1.101.Final),'io.netty:netty-buffer' version not found (expected: 4.1.101.Final),'io.netty:netty-codec' version not found (expected: 4.1.101.Final),'io.netty:netty-codec-http' version not found (expected: 4.1.101.Final),'io.netty:netty-codec-http2' version not found (expected: 4.1.101.Final)
2026-07-24T00:06:00.4324134Z 2026-07-23 21:06:00.411-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.5.1 started successfully (PID 8, JVM running for 4.892 s)
2026-07-24T00:06:00.4324472Z 2026-07-23 21:06:00.412-03:00 INFO  c.m.applicationinsights.agent - Java version: 21.0.1, vendor: Oracle Corporation, home: /usr/java/jdk-21.0.1
2026-07-24T00:06:00.4426172Z ##[section]Finishing: Logs da Aplicação



log do pod:



exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.5.1.jar -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
Error occurred during initialization of VM
agent library failed to init: instrument
Error opening zip file or JAR manifest missing : /deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.5.1.jar
