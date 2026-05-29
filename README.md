exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|*.applicationinsights.azure.com|*.livediagnostics.monitor.azure.com -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-05-29 18:36:19.746-03:00 WARN  c.m.a.a.i.c.ConfigurationBuilder - Unrecognized field "overrides" (class com.microsoft.applicationinsights.agent.internal.configuration.Configuration$Sampling), not marked as ignorable (one known property: "percentage"])
 at [Source: (String)"{"sampling":{"overrides":[{"telemetryType":"request","attributes":[{"key":"url.path","value":"^(\/q)?\/health\/.*","matchType":"regexp"}],"percentage":0}]}}"; line: 1, column: 27] (through reference chain: com.microsoft.applicationinsights.agent.internal.configuration.Configuration["sampling"]->com.microsoft.applicationinsights.agent.internal.configuration.Configuration$Sampling["overrides"])
2026-05-29 18:36:21.432-03:00 INFO  c.m.applicationinsights.agent - ApplicationInsights Java Agent 3.3.1 started successfully (PID 8)
2026-05-29 18:36:21.433-03:00 INFO  c.m.applicationinsights.agent - Java version: 11.0.11, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-11-openjdk-11.0.11.0.9-2.el8_4.x86_64
Running main method
Exception in thread "main" java.lang.reflect.InvocationTargetException
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.doRun(QuarkusEntryPoint.java:48)
	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.main(QuarkusEntryPoint.java:25)
Caused by: java.lang.ExceptionInInitializerError
	at io.quarkus.runner.ApplicationImpl.<clinit>(ApplicationImpl.zig:65)
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
	at java.base/java.lang.Class.newInstance(Class.java:584)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:65)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:42)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:119)
	at br.gov.caixa.siofg.suporte.Main.main(Main.java:16)
	... 6 more
Caused by: java.lang.IllegalStateException: io.smallrye.config.ConfigValidationException: Configuration validation failed:
	java.util.NoSuchElementException: SRCFG00011: Could not expand value SIFUG_DATASOURCE_15 in property quarkus.siofg.ibm.mq.password
	at io.smallrye.config.SmallRyeConfigBuilder.build(SmallRyeConfigBuilder.java:406)
	at io.quarkus.runtime.generated.Config.<clinit>(Config.zig:486)
	... 16 more
Caused by: io.smallrye.config.ConfigValidationException: Configuration validation failed:
	java.util.NoSuchElementException: SRCFG00011: Could not expand value SIFUG_DATASOURCE_15 in property quarkus.siofg.ibm.mq.password
	at io.smallrye.config.ConfigMappingProvider.mapConfiguration(ConfigMappingProvider.java:838)
	at io.smallrye.config.ConfigMappingProvider.mapConfiguration(ConfigMappingProvider.java:794)
	at io.smallrye.config.SmallRyeConfigBuilder.build(SmallRyeConfigBuilder.java:403)
	... 17 more
