P
sidce-conta-destino-des-42-b7lnp
Running


exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sidce-conta-destino -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sidce-conta-destino -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/sidce-conta-destino-1.131.0.0.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.
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

2026-07-03T13:06:43.884-03:00  INFO 8 --- [           main] b.c.c.s.SidceContaDestinoApplication     : Starting SidceContaDestinoApplication v1.131.0.0 using Java 17.0.7 with PID 8 (/deployments/sidce-conta-destino-1.131.0.0.jar started by 1001 in /deployments)
2026-07-03T13:06:43.889-03:00  INFO 8 --- [           main] b.c.c.s.SidceContaDestinoApplication     : The following 1 profile is active: "DES"
java.lang.NoSuchMethodError: 'javax.servlet.ServletContext org.springframework.web.context.WebApplicationContext.getServletContext()'
	at co.elastic.apm.agent.springwebmvc.SpringServiceNameInstrumentation$SpringServiceNameAdvice.afterInitPropertySources(SpringServiceNameInstrumentation.java:82)
	at org.springframework.web.context.support.GenericWebApplicationContext.initPropertySources(GenericWebApplicationContext.java:213)
	at org.springframework.context.support.AbstractApplicationContext.prepareRefresh(AbstractApplicationContext.java:679)
	at org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext.prepareRefresh(AnnotationConfigServletWebServerApplicationContext.java:195)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:595)
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146)
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:752)
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:439)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:318)
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
2026-07-03T13:06:45.982-03:00  INFO 8 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Overriding bean definition for bean 'customRequestInterceptor' with a different definition: replacing [Generic bean: class=br.com.caixa.sidcecontadestino.core.client.config.CustomRequestInterceptor; scope=singleton; abstract=false; lazyInit=null; autowireMode=0; dependencyCheck=0; autowireCandidate=true; primary=false; fallback=false; factoryBeanName=null; factoryMethodName=null; initMethodNames=null; destroyMethodNames=null; defined in URL [jar:nested:/deployments/sidce-conta-destino-1.131.0.0.jar/!BOOT-INF/classes/!/br/com/caixa/sidcecontadestino/core/client/config/CustomRequestInterceptor.class]] with [Root bean: class=null; scope=; abstract=false; lazyInit=null; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; fallback=false; factoryBeanName=feignGlobalConfig; factoryMethodName=customRequestInterceptor; initMethodNames=null; destroyMethodNames=[(inferred)]; defined in class path resource [br/com/caixa/sidcecontadestino/core/client/config/FeignGlobalConfig.class]]
2026-07-03T13:06:47.283-03:00  INFO 8 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-07-03T13:06:47.384-03:00  INFO 8 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 92 ms. Found 2 JPA repository interfaces.
2026-07-03T13:06:47.887-03:00  INFO 8 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=e086834a-c2c6-3c66-b41d-28a258201d4f
2026-07-03T13:06:49.279-03:00  INFO 8 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-07-03T13:06:49.291-03:00  INFO 8 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-07-03T13:06:49.292-03:00  INFO 8 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.42]
2026-07-03T13:06:49.408-03:00  INFO 8 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/v1]     : Initializing Spring embedded WebApplicationContext
2026-07-03T13:06:49.409-03:00  INFO 8 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 5414 ms
java.lang.NoSuchMethodError: 'javax.servlet.ServletContext org.springframework.web.context.WebApplicationContext.getServletContext()'
	at co.elastic.apm.agent.springwebmvc.SpringServiceNameInstrumentation$SpringServiceNameAdvice.afterInitPropertySources(SpringServiceNameInstrumentation.java:82)
	at org.springframework.web.context.support.GenericWebApplicationContext.initPropertySources(GenericWebApplicationContext.java:213)
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.createWebServer(ServletWebServerApplicationContext.java:208)
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.onRefresh(ServletWebServerApplicationContext.java:167)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:621)
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146)
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:752)
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:439)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:318)
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
2026-07-03T13:06:50.779-03:00  INFO 8 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-07-03T13:06:51.499-03:00  INFO 8 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection ConnectionID:1 ClientConnectionId: 7ce46b59-3c7d-4008-a55f-271c12c1b0cb
2026-07-03T13:06:51.500-03:00  INFO 8 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2026-07-03T13:06:51.670-03:00  INFO 8 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2026-07-03T13:06:51.803-03:00  INFO 8 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.6.18.Final
2026-07-03T13:06:51.901-03:00  INFO 8 --- [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2026-07-03T13:06:52.184-03:00  INFO 8 --- [           main] o.h.e.boot.internal.EnversServiceImpl    : Envers integration enabled? : true
2026-07-03T13:06:52.706-03:00  INFO 8 --- [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-07-03T13:06:52.972-03:00  WARN 8 --- [           main] org.hibernate.orm.deprecation            : HHH90000025: SQLServerDialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-07-03T13:06:52.990-03:00  INFO 8 --- [           main] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
	Database JDBC URL [Connecting through datasource 'HikariDataSource (HikariPool-1)']
	Database driver: undefined/unknown
	Database version: 13.0
	Autocommit mode: undefined/unknown
	Isolation level: undefined/unknown
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown
2026-07-03T13:06:53.510-03:00  INFO 8 --- [           main] o.h.e.c.i.m.AuditMetadataGenerator       : Adding properties for entity: br.com.caixa.sidcecontadestino.domain.model.entity.ContaEleitoral
2026-07-03T13:06:53.565-03:00  INFO 8 --- [           main] o.h.e.c.i.m.AuditMetadataGenerator       : Adding properties for entity: br.com.caixa.sidcecontadestino.domain.model.entity.ContaEleitoralDestino
2026-07-03T13:06:55.696-03:00  INFO 8 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-07-03T13:06:55.699-03:00  INFO 8 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-07-03T13:06:56.312-03:00  INFO 8 --- [           main] o.s.d.j.r.query.QueryEnhancerFactory     : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-07-03T13:06:57.593-03:00  WARN 8 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-07-03T13:07:01.509-03:00  INFO 8 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 16 endpoints beneath base path '/actuator'
2026-07-03T13:07:03.680-03:00  INFO 8 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/v1'
2026-07-03T13:07:03.696-03:00  INFO 8 --- [           main] b.c.c.s.SidceContaDestinoApplication     : Started SidceContaDestinoApplication in 21.1 seconds (process running for 24.414)
2026-07-03 13:07:11,289 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-03 13:07:26,205 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:07:26,205 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:07:41,222 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:07:41,222 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:07:57,219 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:07:57,219 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:08:16,355 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:08:16,355 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:08:40,524 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:08:40,524 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03T13:09:06.546-03:00  INFO 8 --- [io-8080-exec-10] o.a.c.c.C.[Tomcat].[localhost].[/v1]     : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-07-03T13:09:06.546-03:00  INFO 8 --- [io-8080-exec-10] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2026-07-03T13:09:06.548-03:00  INFO 8 --- [io-8080-exec-10] o.s.web.servlet.DispatcherServlet        : Completed initialization in 2 ms
2026-07-03T13:09:08.674-03:00  WARN 8 --- [      Finalizer] org.jboss.resteasy.client.jaxrs.i18n     : RESTEASY004687: Closing a class org.jboss.resteasy.client.jaxrs.engines.ApacheHttpClient43Engine instance for you. Please close clients yourself.
2026-07-03 13:09:10,247 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:09:10,247 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:09:47,918 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:09:47,918 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:10:38,392 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:10:38,393 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:11:31,625 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:11:31,625 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:12:25,395 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:12:25,395 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:12:41,308 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-03 13:13:18,628 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:13:18,628 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:14:12,126 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:14:12,126 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:15:06,326 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:15:06,326 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:15:58,826 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:15:58,826 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:16:49,604 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:16:49,604 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:17:37,746 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:17:37,746 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:18:11,339 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-03 13:18:28,841 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:18:28,841 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:19:16,856 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:19:16,856 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:20:08,636 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:20:08,636 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:21:00,672 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:21:00,672 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:21:51,475 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:21:51,475 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:22:42,281 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:22:42,281 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:23:30,735 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:23:30,735 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:23:41,363 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-03 13:24:24,828 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:24:24,828 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:25:16,780 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:25:16,780 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:26:04,289 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:26:04,289 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:26:55,254 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:26:55,255 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:27:46,722 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:27:46,722 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:28:37,973 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:28:37,973 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:29:11,383 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-03 13:29:27,123 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:29:27,124 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:30:14,700 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:30:14,700 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:31:07,685 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:31:07,685 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:31:56,521 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:31:56,521 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:32:44,388 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:32:44,389 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:33:38,325 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:33:38,325 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:34:29,116 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:34:29,116 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:34:41,414 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-03 13:35:18,929 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-03 13:35:18,929 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-03 13:36:12,778 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.

