2026-08-05T14:38:14.4631109Z ##[section]Starting: Verificando Status do Deployment
2026-08-05T14:38:14.4634743Z ==============================================================================
2026-08-05T14:38:14.4634822Z Task         : Bash
2026-08-05T14:38:14.4634865Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-05T14:38:14.4634962Z Version      : 3.227.0
2026-08-05T14:38:14.4635007Z Author       : Microsoft Corporation
2026-08-05T14:38:14.4635058Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-05T14:38:14.4635159Z ==============================================================================
2026-08-05T14:38:14.6028622Z Generating script.
2026-08-05T14:38:14.6039115Z ========================== Starting Command Output ===========================
2026-08-05T14:38:14.6045979Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/99a64308-1499-4434-903e-b06059aee6d0.sh
2026-08-05T14:38:14.6880447Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-08-05T14:38:15.8770129Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-08-05T14:38:15.9608737Z Waiting for rollout to finish: 0 of 1 updated replicas are available...
2026-08-05T14:44:21.9744606Z ##[error]The task has timed out.
2026-08-05T14:44:21.9745899Z ##[section]Finishing: Verificando Status do Deployment




2026-08-05T14:44:21.9772089Z ##[section]Starting: Logs da Aplicação
2026-08-05T14:44:21.9776443Z ==============================================================================
2026-08-05T14:44:21.9776551Z Task         : Bash
2026-08-05T14:44:21.9776596Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-05T14:44:21.9776691Z Version      : 3.227.0
2026-08-05T14:44:21.9776762Z Author       : Microsoft Corporation
2026-08-05T14:44:21.9776836Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-05T14:44:21.9776940Z ==============================================================================
2026-08-05T14:44:22.1244922Z Generating script.
2026-08-05T14:44:22.1255985Z ========================== Starting Command Output ===========================
2026-08-05T14:44:22.1263605Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/06b8102e-de5a-4a83-b9be-2e0e4257cf9b.sh
2026-08-05T14:44:22.1318577Z + shopt -s expand_aliases
2026-08-05T14:44:22.1318770Z + [[ -n okd4_nprd ]]
2026-08-05T14:44:22.1318934Z + [[ okd4_nprd =~ ocp ]]
2026-08-05T14:44:22.1319064Z + [[ -n okd4_nprd ]]
2026-08-05T14:44:22.1319181Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-08-05T14:44:22.1319769Z + app=sigsj-super-app-des
2026-08-05T14:44:22.1319888Z + oc version
2026-08-05T14:44:22.1914060Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-08-05T14:44:22.1914330Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-08-05T14:44:22.1914536Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-08-05T14:44:22.1945746Z ++ oc get pod -l name=sigsj-super-app-des -n sigsj-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-08-05T14:44:22.1947361Z ++ tac
2026-08-05T14:44:22.1947520Z ++ grep -v '^$'
2026-08-05T14:44:22.1948468Z ++ head -n1
2026-08-05T14:44:22.2721680Z + last_pod=sigsj-super-app-des-4-5vwtt
2026-08-05T14:44:22.2722071Z + echo 'Logs do POD: sigsj-super-app-des-4-5vwtt'
2026-08-05T14:44:22.2722298Z + oc logs sigsj-super-app-des-4-5vwtt -c sigsj-super-app-des -n sigsj-des
2026-08-05T14:44:22.2722702Z Logs do POD: sigsj-super-app-des-4-5vwtt
2026-08-05T14:44:22.3526274Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.1.jar -Dotel.exporter.otlp.endpoint=https://otel-collector-nprd.cemot.cloud.caixa -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|apim-parceiros-sandbox.azure-api.net -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-08-05T14:44:22.3526816Z Error occurred during initialization of VM
2026-08-05T14:44:22.3526959Z agent library failed Agent_OnLoad: instrument
2026-08-05T14:44:22.3527225Z Error opening zip file or JAR manifest missing : /deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.1.jar
2026-08-05T14:44:22.3609636Z ##[section]Finishing: Logs da Aplicação
