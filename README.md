2026-08-03T19:28:39.3824506Z ##[section]Starting: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
2026-08-03T19:28:39.3827491Z ==============================================================================
2026-08-03T19:28:39.3827562Z Task         : Bash
2026-08-03T19:28:39.3827611Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-03T19:28:39.3827670Z Version      : 3.227.0
2026-08-03T19:28:39.3827715Z Author       : Microsoft Corporation
2026-08-03T19:28:39.3827773Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-03T19:28:39.3827838Z ==============================================================================
2026-08-03T19:28:40.1050804Z Generating script.
2026-08-03T19:28:40.1061240Z ========================== Starting Command Output ===========================
2026-08-03T19:28:40.1069124Z [command]/bin/bash /opt/ads-agent/_work/_temp/a5c94959-ee75-46e3-b680-d72e66424d48.sh
2026-08-03T19:28:40.1144833Z + echo openshift_nprd_loterias
2026-08-03T19:28:40.1145178Z + egrep -q '^(okd4|ocp|openshift)'
2026-08-03T19:28:40.1164382Z ++ check_status_code https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sispl-captacao-mkp/manifests/2.5.0.3
2026-08-03T19:28:40.1167297Z ++ local url=https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sispl-captacao-mkp/manifests/2.5.0.3
2026-08-03T19:28:40.1169818Z ++ curl --location --request GET https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sispl-captacao-mkp/manifests/2.5.0.3 --header 'Authorization: Bearer ***' --header 'Content-Type: text/plain' -s -k -o /dev/null -w '%{http_code}'
2026-08-03T19:28:40.3088821Z + status_code=200
2026-08-03T19:28:40.3089947Z + [[ 200 -ne 200 ]]
2026-08-03T19:28:40.3090506Z + [[ tqs == \p\r\d ]]
2026-08-03T19:28:40.3090829Z + build=sispl-captacao-mkp
2026-08-03T19:28:40.3090981Z + app=sispl-captacao-mkp-tqs
2026-08-03T19:28:40.3091092Z + [[ tqs == \p\r\d ]]
2026-08-03T19:28:40.3091846Z + oc set image deployment/sispl-captacao-mkp-tqs sispl-captacao-mkp-tqs=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-captacao-mkp:2.5.0.3 -n sispl-tqs
2026-08-03T19:28:40.5031430Z + echo openshift/quarkus-caixa-release
2026-08-03T19:28:40.5031684Z + egrep -q openshift/angular-caixa-release
2026-08-03T19:28:40.5066960Z + echo openshift/quarkus-caixa-release
2026-08-03T19:28:40.5068488Z + egrep -q openshift/php-caixa-release
2026-08-03T19:28:40.5097666Z + echo 'Template não é angular nem php e não precisa deste replace'
2026-08-03T19:28:40.5100782Z + oc patch --type merge deployment/sispl-captacao-mkp-tqs -p '{"spec":{"template":{"spec":{"imagePullSecrets":[{"name":"registry-secret"}]}}}}' -n sispl-tqs
2026-08-03T19:28:40.5101029Z Template não é angular nem php e não precisa deste replace
2026-08-03T19:28:40.7327103Z deployment.apps/sispl-captacao-mkp-tqs not patched
2026-08-03T19:28:40.7362141Z + oc get secret registry-secret -n sispl-tqs
2026-08-03T19:28:40.9482452Z NAME              TYPE                             DATA      AGE
2026-08-03T19:28:40.9483202Z registry-secret   kubernetes.io/dockerconfigjson   1         30d
2026-08-03T19:28:40.9516019Z + [[ deployment == deployment ]]
2026-08-03T19:28:40.9516722Z + oc rollout pause deployment/sispl-captacao-mkp-tqs -n sispl-tqs
2026-08-03T19:28:41.1473785Z error: deployments.apps "sispl-captacao-mkp-tqs" is already paused
2026-08-03T19:28:41.1500563Z + sleep 20
2026-08-03T19:29:01.1518593Z + oc rollout resume deployment/sispl-captacao-mkp-tqs -n sispl-tqs
2026-08-03T19:29:01.3670526Z deployment.apps/sispl-captacao-mkp-tqs resumed
2026-08-03T19:29:01.3703906Z + oc rollout restart deployment/sispl-captacao-mkp-tqs -n sispl-tqs
2026-08-03T19:29:01.4708507Z error: unknown command "restart deployment/sispl-captacao-mkp-tqs"
2026-08-03T19:29:01.4708769Z See 'oc rollout -h' for help and examples.
2026-08-03T19:29:01.4774240Z ##[error]Bash exited with code '1'.
2026-08-03T19:29:01.4776839Z ##[section]Finishing: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP


2026-08-03T19:29:01.4949173Z ##[section]Starting: Logs da Aplicação
2026-08-03T19:29:01.4952357Z ==============================================================================
2026-08-03T19:29:01.4952438Z Task         : Bash
2026-08-03T19:29:01.4952478Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-03T19:29:01.4952536Z Version      : 3.227.0
2026-08-03T19:29:01.4952583Z Author       : Microsoft Corporation
2026-08-03T19:29:01.4952628Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-03T19:29:01.4952693Z ==============================================================================
2026-08-03T19:29:02.4207702Z Generating script.
2026-08-03T19:29:02.4219197Z ========================== Starting Command Output ===========================
2026-08-03T19:29:02.4227716Z [command]/bin/bash /opt/ads-agent/_work/_temp/232c8da7-f7d2-4745-bfa4-72da4a67ee86.sh
2026-08-03T19:29:02.4277884Z + shopt -s expand_aliases
2026-08-03T19:29:02.4278458Z + [[ -n openshift_nprd_loterias ]]
2026-08-03T19:29:02.4278868Z + [[ openshift_nprd_loterias =~ ocp ]]
2026-08-03T19:29:02.4279478Z + [[ -n openshift_nprd_loterias ]]
2026-08-03T19:29:02.4279637Z + [[ openshift_nprd_loterias =~ (okd4|openshift) ]]
2026-08-03T19:29:02.4279796Z + app=sispl-captacao-mkp-tqs
2026-08-03T19:29:02.4279900Z + oc version
2026-08-03T19:29:02.5769930Z oc v3.11.0+0cbc58b
2026-08-03T19:29:02.5770108Z kubernetes v1.11.0+d4cacc0
2026-08-03T19:29:02.5771714Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-08-03T19:29:02.5959156Z 
2026-08-03T19:29:02.5959671Z Server https://api.nctvmrh001.nuvem.caixa:6443
2026-08-03T19:29:02.5959801Z kubernetes v1.33.12
2026-08-03T19:29:02.5993052Z ++ oc get pod -l name=sispl-captacao-mkp-tqs -n sispl-tqs -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-08-03T19:29:02.5993264Z ++ tac
2026-08-03T19:29:02.6005820Z ++ grep -v '^$'
2026-08-03T19:29:02.6011330Z ++ head -n1
2026-08-03T19:29:02.8393647Z + last_pod=sispl-captacao-mkp-tqs-66f9484c76-9jz4b
2026-08-03T19:29:02.8395312Z + echo 'Logs do POD: sispl-captacao-mkp-tqs-66f9484c76-9jz4b'
2026-08-03T19:29:02.8395810Z + oc logs sispl-captacao-mkp-tqs-66f9484c76-9jz4b -c sispl-captacao-mkp-tqs -n sispl-tqs
2026-08-03T19:29:02.8397906Z Logs do POD: sispl-captacao-mkp-tqs-66f9484c76-9jz4b
2026-08-03T19:29:03.1830347Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|*.corecaixa -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-08-03T19:29:03.1831168Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-08-03T19:29:03.1832010Z 2026-08-03 16:21:02.893-03:00 INFO  c.m.applicationinsights.agent - ApplicationInsights Java Agent 3.3.1 started successfully (PID 3)
2026-08-03T19:29:03.1832470Z 2026-08-03 16:21:02.895-03:00 INFO  c.m.applicationinsights.agent - Java version: 11.0.11, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-11-openjdk-11.0.11.0.9-2.el8_4.x86_64
2026-08-03T19:29:03.1832654Z __  ____  __  _____   ___  __ ____  ______ 
2026-08-03T19:29:03.1832813Z  --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
2026-08-03T19:29:03.1832955Z  -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
2026-08-03T19:29:03.1834424Z --\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-08-03T19:29:03.1834666Z 2026-08-03 16:21:11,053 INFO  [br.gov.cai.lot.sis.MQConsumer] (main) INICIALIZANDO MQ...
2026-08-03T19:29:03.1834898Z 2026-08-03 16:21:11,511 INFO  [br.gov.cai.lot.sis.MQConsumer] (main) START MQ
2026-08-03T19:29:03.1835253Z 2026-08-03 16:21:12,399 INFO  [io.quarkus] (main) sispl-captacao-mkp 2.5.0.1 on JVM (powered by Quarkus 2.16.4.Final) started in 9.404s. Listening on: http://0.0.0.0:8080
2026-08-03T19:29:03.1859852Z 2026-08-03 16:21:12,399 INFO  [io.quarkus] (main) Profile prod activated. 
2026-08-03T19:29:03.1860418Z 2026-08-03 16:21:12,400 INFO  [io.quarkus] (main) Installed features: [agroal, cdi, hibernate-orm, hibernate-orm-panache, hibernate-orm-rest-data-panache, hibernate-validator, jdbc-db2, loterias-api-commons, loterias-api-exceptions, narayana-jta, qpid-jms, rest-client, resteasy, resteasy-jackson, smallrye-context-propagation, smallrye-health, smallrye-openapi, vertx]
2026-08-03T19:29:03.1860826Z 2026-08-03 16:21:12,529 INFO  [br.gov.cai.lot.sis.MQConsumer] (pool-14-thread-1) LQ.LOG.SISPL.MARKETPLACE
2026-08-03T19:29:03.1861092Z 2026-08-03 16:21:12,530 INFO  [br.gov.cai.lot.sis.MQConsumer] (pool-14-thread-1) LQ.LOG.SISPL.MARKETPLACE.BACKOUT
2026-08-03T19:29:03.1862386Z 2026-08-03 16:21:12,530 INFO  [br.gov.cai.lot.sis.MQConsumer] (pool-14-thread-1) MQ CONECTADO COM SUCESSO.
2026-08-03T19:29:03.1917932Z ##[section]Finishing: Logs da Aplicação

