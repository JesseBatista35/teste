2026-07-16T15:25:38.8429839Z ##[section]Starting: Verificando Status do Deployment
2026-07-16T15:25:38.8432768Z ==============================================================================
2026-07-16T15:25:38.8432848Z Task         : Bash
2026-07-16T15:25:38.8432891Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-16T15:25:38.8432965Z Version      : 3.227.0
2026-07-16T15:25:38.8433010Z Author       : Microsoft Corporation
2026-07-16T15:25:38.8433061Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-16T15:25:38.8433140Z ==============================================================================
2026-07-16T15:25:39.7796266Z Generating script.
2026-07-16T15:25:39.7806650Z ========================== Starting Command Output ===========================
2026-07-16T15:25:39.7813559Z [command]/bin/bash /opt/ads-agent/_work/_temp/048d6875-586e-4b74-8047-4df7b8bae181.sh
2026-07-16T15:25:40.0037167Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-07-16T15:27:52.6542385Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-07-16T15:27:52.6652992Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-07-16T15:31:46.3508420Z ##[error]The task has timed out.
2026-07-16T15:31:46.3509593Z ##[section]Finishing: Verificando Status do Deployment


log do pod

exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/sidce-conta-destino-1.131.0.0.jar
Could not load Logmanager "org.jboss.logmanager.LogManager"
java.lang.ClassNotFoundException: org.jboss.logmanager.LogManager
	at java.base/java.net.URLClassLoader.findClass(URLClassLoader.java:445)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:587)
	at org.springframework.boot.loader.net.protocol.jar.JarUrlClassLoader.loadClass(JarUrlClassLoader.java:107)
	at org.springframework.boot.loader.launch.LaunchedClassLoader.loadClass(LaunchedClassLoader.java:91)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
	at java.logging/java.util.logging.LogManager$1.run(LogManager.java:239)
	at java.logging/java.util.logging.LogManager$1.run(LogManager.java:223)
	at java.base/java.security.AccessController.doPrivileged(AccessController.java:318)
	at java.logging/java.util.logging.LogManager.<clinit>(LogManager.java:222)
	at org.springframework.boot.logging.logback.LogbackLoggingSystem.isJulUsingASingleConsoleHandlerAtMost(LogbackLoggingSystem.java:159)
	at org.springframework.boot.logging.logback.LogbackLoggingSystem.isBridgeJulIntoSlf4j(LogbackLoggingSystem.java:151)
	at org.springframework.boot.logging.logback.LogbackLoggingSystem.configureJdkLoggingBridgeHandler(LogbackLoggingSystem.java:140)
	at org.springframework.boot.logging.logback.LogbackLoggingSystem.beforeInitialize(LogbackLoggingSystem.java:134)
	at org.springframework.boot.context.logging.LoggingApplicationListener.onApplicationStartingEvent(LoggingApplicationListener.java:238)
	at org.springframework.boot.context.logging.LoggingApplicationListener.onApplicationEvent(LoggingApplicationListener.java:220)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.doInvokeListener(SimpleApplicationEventMulticaster.java:185)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.invokeListener(SimpleApplicationEventMulticaster.java:178)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:156)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:138)
	at org.springframework.boot.context.event.EventPublishingRunListener.multicastInitialEvent(EventPublishingRunListener.java:136)
	at org.springframework.boot.context.event.EventPublishingRunListener.starting(EventPublishingRunListener.java:75)
	at org.springframework.boot.SpringApplicationRunListeners.lambda$starting$0(SpringApplicationRunListeners.java:54)
	at java.base/java.lang.Iterable.forEach(Iterable.java:75)
	at org.springframework.boot.SpringApplicationRunListeners.doWithListeners(SpringApplicationRunListeners.java:118)
	at org.springframework.boot.SpringApplicationRunListeners.starting(SpringApplicationRunListeners.java:54)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:310)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1361)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1350)
	at br.com.caixa.sidcecontadestino.SidceContaDestinoApplication.main(SidceContaDestinoApplication.java:18)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:102)
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64)
	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40)

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.5.3)

2026-07-16T12:43:12.489-03:00  INFO 8 --- [           main] b.c.c.s.SidceContaDestinoApplication     : Starting SidceContaDestinoApplication v1.131.0.0 using Java 17.0.7 with PID 8 (/deployments/sidce-conta-destino-1.131.0.0.jar started by 1001 in /deployments)
2026-07-16T12:43:12.492-03:00  INFO 8 --- [           main] b.c.c.s.SidceContaDestinoApplication     : The following 1 profile is active: "DES"
