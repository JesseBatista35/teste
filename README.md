
-sh-4.2$
-sh-4.2$ oc set env dc/sigfa-api-extratos-des -n sigfa-des --list | grep -i smallrye
# SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS from secret sigfa-api-extratos-des, key SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sigfa-des | grep sigfa-api-extratos-des | grep -v deploy
sigfa-api-extratos-des-14-mhz5g             0/1       CrashLoopBackOff   3 (18s ago)   113s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs -n sigfa-des $(oc get pods -n sigfa-des | grep sigfa-api-extratos-des | grep -v deploy | awk '{print $1}') -c sigfa-api-extratos-des --tail=50
exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.6.2.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-08-18 15:36:07.203-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.6.2 started successfully (PID 8, JVM running for 5.495 s)
2026-08-18 15:36:07.206-03:00 INFO  c.m.applicationinsights.agent - Java version: 21.0.1, vendor: Oracle Corporation, home: /usr/java/jdk-21.0.1
15:36:08,191 ERROR [io.qua.run.Quarkus] Error running Quarkus: java.lang.ExceptionInInitializerError
        at io.quarkus.runner.ApplicationImpl.<clinit>(Unknown Source)
        at java.base/jdk.internal.misc.Unsafe.allocateInstance(Native Method)
        at java.base/java.lang.invoke.DirectMethodHandle.allocateInstance(DirectMethodHandle.java:501)
        at io.quarkus.runtime.Quarkus.run(Quarkus.java:78)
        at io.quarkus.runtime.Quarkus.run(Quarkus.java:50)
        at io.quarkus.runtime.Quarkus.run(Quarkus.java:143)
        at io.quarkus.runner.GeneratedMain.main(Unknown Source)
        at io.quarkus.bootstrap.runner.QuarkusEntryPoint.doRun(QuarkusEntryPoint.java:86)
        at io.quarkus.bootstrap.runner.QuarkusEntryPoint.main(QuarkusEntryPoint.java:37)
Caused by: java.lang.NullPointerException: Cannot read the array length because "array" is null
        at java.base/java.util.Arrays.stream(Arrays.java:5528)
        at java.base/java.util.stream.Stream.of(Stream.java:1426)
        at io.smallrye.config.source.file.FileSystemConfigSourceFactory.getConfigSources(FileSystemConfigSourceFactory.java:28)
        at io.smallrye.config.ConfigurableConfigSource.getConfigSources(ConfigurableConfigSource.java:50)
        at io.smallrye.config.SmallRyeConfig$ConfigSources.mapLateSources(SmallRyeConfig.java:993)
        at io.smallrye.config.SmallRyeConfig$ConfigSources.<init>(SmallRyeConfig.java:853)
        at io.smallrye.config.SmallRyeConfig.<init>(SmallRyeConfig.java:123)
        at io.smallrye.config.SmallRyeConfigBuilder.build(SmallRyeConfigBuilder.java:785)
        at io.quarkus.runtime.generated.Config.<clinit>(Unknown Source)
        ... 9 more

2026-08-18 15:36:09.663-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service: Received response code 400 (109: Field 'message' on type 'ExceptionDetails' is required but missing or empty. Expected: string) (future warnings will be aggregated and logged once every 5 minutes)
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -n sigfa-des <POD> -c sigfa-api-extratos-des -- sh -c 'echo "$SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS"'
-sh: POD: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$ oc exec -n sigfa-des sigfa-api-extratos-des-14-mhz5g -c sigfa-api-extratos-des -- sh -c 'echo "$SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS"'
error: unable to upgrade connection: container not found ("sigfa-api-extratos-des")
-sh-4.2$
