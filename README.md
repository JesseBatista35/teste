-sh-4.2$ oc logs sifug-siofg-api-des-273-p696z -n sifug-des --previous --tail=60
 at [Source: (String)"{"sampling":{"overrides":[{"telemetryType":"request","attributes":[{"key":"url.path","value":"^(\/q)?\/health\/.*","matchType":"regexp"}],"percentage":0}]}}"; line: 1, column: 27] (through reference chain: com.microsoft.applicationinsights.agent.internal.configuration.Configuration["sampling"]->com.microsoft.applicationinsights.agent.internal.configuration.Configuration$Sampling["overrides"])
2026-06-02 10:12:29.278-03:00 INFO  c.m.applicationinsights.agent - ApplicationInsights Java Agent 3.3.1 started successfully (PID 8)
2026-06-02 10:12:29.279-03:00 INFO  c.m.applicationinsights.agent - Java version: 11.0.11, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-11-openjdk-11.0.11.0.9-2.el8_4.x86_64
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
        java.util.NoSuchElementException: SRCFG00011: Could not expand value SIFUG_XMQD1 in property quarkus.siofg.ibm.mq.password
        at io.smallrye.config.SmallRyeConfigBuilder.build(SmallRyeConfigBuilder.java:406)
        at io.quarkus.runtime.generated.Config.<clinit>(Config.zig:486)
        ... 16 more
Caused by: io.smallrye.config.ConfigValidationException: Configuration validation failed:
        java.util.NoSuchElementException: SRCFG00011: Could not expand value SIFUG_XMQD1 in property quarkus.siofg.ibm.mq.password
        at io.smallrye.config.ConfigMappingProvider.mapConfiguration(ConfigMappingProvider.java:838)
        at io.smallrye.config.ConfigMappingProvider.mapConfiguration(ConfigMappingProvider.java:794)
        at io.smallrye.config.SmallRyeConfigBuilder.build(SmallRyeConfigBuilder.java:403)
        ... 17 more
-sh-4.2$

