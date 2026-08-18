2026-08-18T15:04:04.9955863Z ##[section]Starting: Logs da Aplicação
2026-08-18T15:04:04.9959415Z ==============================================================================
2026-08-18T15:04:04.9959532Z Task         : Bash
2026-08-18T15:04:04.9959578Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-18T15:04:04.9959677Z Version      : 3.227.0
2026-08-18T15:04:04.9959724Z Author       : Microsoft Corporation
2026-08-18T15:04:04.9959780Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-18T15:04:04.9959857Z ==============================================================================
2026-08-18T15:04:05.1363658Z Generating script.
2026-08-18T15:04:05.1373776Z ========================== Starting Command Output ===========================
2026-08-18T15:04:05.1380523Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/3d3bbc3f-674d-4f3e-89d1-0afc2e2c504e.sh
2026-08-18T15:04:05.1434134Z + shopt -s expand_aliases
2026-08-18T15:04:05.1434328Z + [[ -n okd4_nprd ]]
2026-08-18T15:04:05.1434533Z + [[ okd4_nprd =~ ocp ]]
2026-08-18T15:04:05.1434656Z + [[ -n okd4_nprd ]]
2026-08-18T15:04:05.1434788Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-08-18T15:04:05.1434963Z + app=sigfa-api-extratos-des
2026-08-18T15:04:05.1435093Z + oc version
2026-08-18T15:04:05.2069942Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-08-18T15:04:05.2070180Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-08-18T15:04:05.2070398Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-08-18T15:04:05.2093956Z ++ oc get pod -l name=sigfa-api-extratos-des -n sigfa-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-08-18T15:04:05.2094834Z ++ tac
2026-08-18T15:04:05.2096170Z ++ grep -v '^$'
2026-08-18T15:04:05.2097064Z ++ head -n1
2026-08-18T15:04:05.2816891Z + last_pod=sigfa-api-extratos-des-13-vbwx8
2026-08-18T15:04:05.2817197Z + echo 'Logs do POD: sigfa-api-extratos-des-13-vbwx8'
2026-08-18T15:04:05.2817448Z + oc logs sigfa-api-extratos-des-13-vbwx8 -c sigfa-api-extratos-des -n sigfa-des
2026-08-18T15:04:05.2817696Z Logs do POD: sigfa-api-extratos-des-13-vbwx8
2026-08-18T15:04:05.3592239Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.6.2.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-08-18T15:04:05.3592797Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-08-18T15:04:05.3593450Z 2026-08-18 12:01:44.529-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.6.2 started successfully (PID 8, JVM running for 5.305 s)
2026-08-18T15:04:05.3593769Z 2026-08-18 12:01:44.532-03:00 INFO  c.m.applicationinsights.agent - Java version: 21.0.1, vendor: Oracle Corporation, home: /usr/java/jdk-21.0.1
2026-08-18T15:04:05.3594016Z 12:01:45,519 ERROR [io.qua.run.Quarkus] Error running Quarkus: java.lang.ExceptionInInitializerError
2026-08-18T15:04:05.3594210Z 	at io.quarkus.runner.ApplicationImpl.<clinit>(Unknown Source)
2026-08-18T15:04:05.3594391Z 	at java.base/jdk.internal.misc.Unsafe.allocateInstance(Native Method)
2026-08-18T15:04:05.3594603Z 	at java.base/java.lang.invoke.DirectMethodHandle.allocateInstance(DirectMethodHandle.java:501)
2026-08-18T15:04:05.3594802Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:78)
2026-08-18T15:04:05.3594944Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:50)
2026-08-18T15:04:05.3595116Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:143)
2026-08-18T15:04:05.3595288Z 	at io.quarkus.runner.GeneratedMain.main(Unknown Source)
2026-08-18T15:04:05.3595477Z 	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.doRun(QuarkusEntryPoint.java:86)
2026-08-18T15:04:05.3595686Z 	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.main(QuarkusEntryPoint.java:37)
2026-08-18T15:04:05.3595966Z Caused by: java.lang.NullPointerException: Cannot read the array length because "array" is null
2026-08-18T15:04:05.3596155Z 	at java.base/java.util.Arrays.stream(Arrays.java:5528)
2026-08-18T15:04:05.3596331Z 	at java.base/java.util.stream.Stream.of(Stream.java:1426)
2026-08-18T15:04:05.3596554Z 	at io.smallrye.config.source.file.FileSystemConfigSourceFactory.getConfigSources(FileSystemConfigSourceFactory.java:28)
2026-08-18T15:04:05.3596795Z 	at io.smallrye.config.ConfigurableConfigSource.getConfigSources(ConfigurableConfigSource.java:50)
2026-08-18T15:04:05.3596996Z 	at io.smallrye.config.SmallRyeConfig$ConfigSources.mapLateSources(SmallRyeConfig.java:993)
2026-08-18T15:04:05.3597211Z 	at io.smallrye.config.SmallRyeConfig$ConfigSources.<init>(SmallRyeConfig.java:853)
2026-08-18T15:04:05.3597412Z 	at io.smallrye.config.SmallRyeConfig.<init>(SmallRyeConfig.java:123)
2026-08-18T15:04:05.3597614Z 	at io.smallrye.config.SmallRyeConfigBuilder.build(SmallRyeConfigBuilder.java:785)
2026-08-18T15:04:05.3597808Z 	at io.quarkus.runtime.generated.Config.<clinit>(Unknown Source)
2026-08-18T15:04:05.3597916Z 	... 9 more
2026-08-18T15:04:05.3597989Z 
2026-08-18T15:04:05.3598484Z 2026-08-18 12:01:46.889-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service: Received response code 400 (109: Field 'message' on type 'ExceptionDetails' is required but missing or empty. Expected: string) (future warnings will be aggregated and logged once every 5 minutes)
2026-08-18T15:04:05.3665218Z ##[section]Finishing: Logs da Aplicação
