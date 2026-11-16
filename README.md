2026-11-16T23:47:46.6467971Z ##[section]Starting: Logs da Aplicação
2026-11-16T23:47:46.6471445Z ==============================================================================
2026-11-16T23:47:46.6471530Z Task         : Bash
2026-11-16T23:47:46.6471585Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-16T23:47:46.6471668Z Version      : 3.227.0
2026-11-16T23:47:46.6471715Z Author       : Microsoft Corporation
2026-11-16T23:47:46.6471776Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-16T23:47:46.6471855Z ==============================================================================
2026-11-16T23:47:46.7774873Z Generating script.
2026-11-16T23:47:46.7788131Z ========================== Starting Command Output ===========================
2026-11-16T23:47:46.7795421Z [command]/bin/bash /opt/ads-agent/_work/_temp/a0e571f4-0718-4800-b45d-fd024d1ff19a.sh
2026-11-16T23:47:46.7864442Z + shopt -s expand_aliases
2026-11-16T23:47:46.7865616Z + [[ -n ocp_nprd ]]
2026-11-16T23:47:46.7865896Z + [[ ocp_nprd =~ ocp ]]
2026-11-16T23:47:46.7867355Z + app=sispi-dict-reivindicacoes-des
2026-11-16T23:47:46.7867598Z + arquivo=/usr/local/bin/oc-v4.13
2026-11-16T23:47:46.7867774Z + '[' -e /usr/local/bin/oc-v4.13 ']'
2026-11-16T23:47:46.7867945Z + alias oc=/usr/local/bin/oc-v4.13
2026-11-16T23:47:46.7868126Z + /usr/local/bin/oc-v4.13 version
2026-11-16T23:47:46.9049332Z Client Version: 4.13.0-202307282024.p0.ge251b5e.assembly.stream-e251b5e
2026-11-16T23:47:46.9049595Z Kustomize Version: v4.5.7
2026-11-16T23:47:46.9049718Z Server Version: 4.15.59
2026-11-16T23:47:46.9051469Z Kubernetes Version: v1.28.15+d227d65
2026-11-16T23:47:46.9086852Z ++ /usr/local/bin/oc-v4.13 get pod -l name=sispi-dict-reivindicacoes-des -n sispi-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-11-16T23:47:46.9087078Z ++ tac
2026-11-16T23:47:46.9090392Z ++ grep -v '^$'
2026-11-16T23:47:46.9090560Z ++ head -n1
2026-11-16T23:47:47.0941967Z + last_pod=sispi-dict-reivindicacoes-des-4-whqsv
2026-11-16T23:47:47.0942361Z + echo 'Logs do POD: sispi-dict-reivindicacoes-des-4-whqsv'
2026-11-16T23:47:47.0942736Z + /usr/local/bin/oc-v4.13 logs sispi-dict-reivindicacoes-des-4-whqsv -c sispi-dict-reivindicacoes-des -n sispi-des
2026-11-16T23:47:47.0943023Z Logs do POD: sispi-dict-reivindicacoes-des-4-whqsv
2026-11-16T23:47:47.2178282Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Xms1280m -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Djavaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.5.1.jar -Djavax.net.ssl.keyStore=/deployments/caixa-keystore-mpi-mq-plexd-nprd.jks -XX:+UseParallelGC -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MinHeapFreeRatio=20 -XX:MaxHeapFreeRatio=40 -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-11-16T23:47:47.2179331Z Picked up JAVA_TOOL_OPTIONS: -Dfile.encoding=UTF8
2026-11-16T23:47:47.2179618Z Error: LinkageError occurred while loading main class io.quarkus.bootstrap.runner.QuarkusEntryPoint
2026-11-16T23:47:47.2180096Z 	java.lang.UnsupportedClassVersionError: io/quarkus/bootstrap/runner/QuarkusEntryPoint has been compiled by a more recent version of the Java Runtime (class file version 61.0), this version of the Java Runtime only recognizes class file versions up to 55.0
2026-11-16T23:47:47.2262141Z ##[section]Finishing: Logs da Aplicação




