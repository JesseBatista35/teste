P
sisgf-backend-des-374-vh2sn
Running


exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-09 17:07:03.956-03:00 WARN  c.m.a.a.i.c.ConfigurationBuilder - Unrecognized field "overrides" (class com.microsoft.applicationinsights.agent.internal.configuration.Configuration$Sampling), not marked as ignorable (one known property: "percentage"])
 at [Source: (String)"{"sampling":{"overrides":[{"telemetryType":"request","attributes":[{"key":"url.path","value":"^(\/q)?\/health\/.*","matchType":"regexp"}],"percentage":0}]}}"; line: 1, column: 27] (through reference chain: com.microsoft.applicationinsights.agent.internal.configuration.Configuration["sampling"]->com.microsoft.applicationinsights.agent.internal.configuration.Configuration$Sampling["overrides"])
2026-09-09 17:07:07.225-03:00 INFO  c.m.applicationinsights.agent - ApplicationInsights Java Agent 3.3.1 started successfully (PID 8)
2026-09-09 17:07:07.225-03:00 INFO  c.m.applicationinsights.agent - Java version: 17.0.7, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-17-openjdk-17.0.7.0.7-3.el8.x86_64
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-09-09 17:07:15,147 INFO  [io.micrometer.core.instrument.push.PushMeterRegistry] (main) Publishing metrics for AzureMonitorMeterRegistry every 1m
