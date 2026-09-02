<img width="1904" height="1000" alt="image" src="https://github.com/user-attachments/assets/e5d01c8a-b41b-414a-a490-e5e3bf0e8f25" />


exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/simil-precificacao-internet-api-0.0.0.1.jar
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
	at org.springframework.boot.logging.logback.LogbackLoggingSystem.isJulUsingASingleConsoleHandlerAtMost(LogbackLoggingSystem.java:160)
	at org.springframework.boot.logging.logback.LogbackLoggingSystem.isBridgeJulIntoSlf4j(LogbackLoggingSystem.java:152)
	at org.springframework.boot.logging.logback.LogbackLoggingSystem.configureJdkLoggingBridgeHandler(LogbackLoggingSystem.java:141)
	at org.springframework.boot.logging.logback.LogbackLoggingSystem.beforeInitialize(LogbackLoggingSystem.java:135)
	at org.springframework.boot.context.logging.LoggingApplicationListener.onApplicationStartingEvent(LoggingApplicationListener.java:240)
	at org.springframework.boot.context.logging.LoggingApplicationListener.onApplicationEvent(LoggingApplicationListener.java:222)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.doInvokeListener(SimpleApplicationEventMulticaster.java:180)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.invokeListener(SimpleApplicationEventMulticaster.java:173)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:151)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:133)
	at org.springframework.boot.context.event.EventPublishingRunListener.multicastInitialEvent(EventPublishingRunListener.java:137)
	at org.springframework.boot.context.event.EventPublishingRunListener.starting(EventPublishingRunListener.java:76)
	at org.springframework.boot.SpringApplicationRunListeners.lambda$starting$0(SpringApplicationRunListeners.java:56)
	at java.base/java.lang.Iterable.forEach(Iterable.java:75)
	at org.springframework.boot.SpringApplicationRunListeners.doWithListeners(SpringApplicationRunListeners.java:123)
	at org.springframework.boot.SpringApplicationRunListeners.starting(SpringApplicationRunListeners.java:56)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:313)
	at br.gov.caixa.simil.precificacao.internet.api.SimilPrecificacaoInternetApiApplication.main(SimilPrecificacaoInternetApiApplication.java:14)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:106)
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64)
	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40)

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v4.0.2)

2026-09-02T10:44:55.519-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] .SimilPrecificacaoInternetApiApplication : Starting SimilPrecificacaoInternetApiApplication v0.0.0.1 using Java 17.0.7 with PID 8 (/deployments/simil-precificacao-internet-api-0.0.0.1.jar started by 1001 in /deployments)
2026-09-02T10:44:55.522-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] .SimilPrecificacaoInternetApiApplication : No active profile set, falling back to 1 default profile: "default"
2026-09-02T10:44:57.983-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Multiple Spring Data modules found, entering strict repository configuration mode
2026-09-02T10:44:57.985-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JDBC repositories in DEFAULT mode.
2026-09-02T10:44:58.020-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] .RepositoryConfigurationExtensionSupport : Spring Data JDBC - Could not safely identify store assignment for repository candidate interface br.gov.caixa.simil.precificacao.internet.api.repository.HabilitacaoEmpresaPrecificadoraRepository; If you want this repository to be a JDBC repository, consider annotating your entities with one of these annotations: org.springframework.data.relational.core.mapping.Table.
2026-09-02T10:44:58.021-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] .RepositoryConfigurationExtensionSupport : Spring Data JDBC - Could not safely identify store assignment for repository candidate interface br.gov.caixa.simil.precificacao.internet.api.repository.MunicipioPrecificavelRepository; If you want this repository to be a JDBC repository, consider annotating your entities with one of these annotations: org.springframework.data.relational.core.mapping.Table.
2026-09-02T10:44:58.080-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 30 ms. Found 0 JDBC repository interfaces.
2026-09-02T10:44:58.090-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Multiple Spring Data modules found, entering strict repository configuration mode
2026-09-02T10:44:58.091-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-09-02T10:44:58.112-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 17 ms. Found 2 JPA repository interfaces.
2026-09-02T10:44:59.593-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat initialized with port 8080 (http)
2026-09-02T10:44:59.604-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-09-02T10:44:59.604-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/11.0.15]
2026-09-02T10:44:59.792-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] b.w.c.s.WebApplicationContextInitializer : Root WebApplicationContext: initialization completed in 4174 ms
2026-09-02T10:45:00.886-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-09-02T10:45:01.084-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection org.postgresql.jdbc.PgConnection@727956bb
2026-09-02T10:45:01.085-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2026-09-02T10:45:01.208-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] org.hibernate.orm.jpa                    : HHH008540: Processing PersistenceUnitInfo [name: default]
2026-09-02T10:45:01.311-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] org.hibernate.orm.core                   : HHH000001: Hibernate ORM core version 7.2.1.Final
2026-09-02T10:45:02.225-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-09-02T10:45:02.332-03:00  WARN 8 --- [simil-precificacao-internet-api] [           main] org.hibernate.orm.core                   : HHH000511: The 9.1.14 version for [org.hibernate.dialect.PostgreSQLDialect] is no longer supported, hence certain features may not work properly.The minimum supported version is 13.0.0. Check the community dialects project for available legacy versions.
2026-09-02T10:45:02.387-03:00  WARN 8 --- [simil-precificacao-internet-api] [           main] org.hibernate.orm.deprecation            : HHH90000025: PostgreSQLDialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-09-02T10:45:02.407-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
	Database JDBC URL [jdbc:postgresql://SCTDEDADLX0004.DF.CAIXA:5432/DESENVOLVIMENTO?sslmode=disable]
	Database driver: PostgreSQL JDBC Driver
	Database dialect: PostgreSQLDialect
	Database version: 9.1.14
	Default catalog/schema: DESENVOLVIMENTO/public
	Autocommit mode: undefined/unknown
	Isolation level: READ_COMMITTED [default READ_COMMITTED]
	JDBC fetch size: none
	Pool: DataSourceConnectionProvider
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown
2026-09-02T10:45:04.394-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-09-02T10:45:04.603-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-09-02T10:45:05.788-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-09-02T10:45:06.422-03:00  WARN 8 --- [simil-precificacao-internet-api] [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-09-02T10:45:09.908-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 1 endpoint beneath base path '/actuator'
2026-09-02T10:45:10.089-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat started on port 8080 (http) with context path '/habitacao/precificacao'
2026-09-02T10:45:10.100-03:00  INFO 8 --- [simil-precificacao-internet-api] [           main] .SimilPrecificacaoInternetApiApplication : Started SimilPrecificacaoInternetApiApplication in 15.49 seconds (process running for 16.673)
2026-09-02T10:45:10.190-03:00  WARN 8 --- [simil-precificacao-internet-api] [           main] o.s.core.events.SpringDocAppInitializer  : SpringDoc /v3/api-docs endpoint is enabled by default. To disable it in production, set the property 'springdoc.api-docs.enabled=false'
2026-09-02T10:45:10.190-03:00  WARN 8 --- [simil-precificacao-internet-api] [           main] o.s.core.events.SpringDocAppInitializer  : SpringDoc /swagger-ui.html endpoint is enabled by default. To disable it in production, set the property 'springdoc.swagger-ui.enabled=false'
2026-09-02T11:00:52.700-03:00  INFO 8 --- [simil-precificacao-internet-api] [nio-8080-exec-9] o.a.c.c.C.[.[.[/habitacao/precificacao]  : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-09-02T11:00:52.701-03:00  INFO 8 --- [simil-precificacao-internet-api] [nio-8080-exec-9] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2026-09-02T11:00:52.703-03:00  INFO 8 --- [simil-precificacao-internet-api] [nio-8080-exec-9] o.s.web.servlet.DispatcherServlet        : Completed initialization in 2 ms
2026-09-02T11:01:04.611-03:00  INFO 8 --- [simil-precificacao-internet-api] [nio-8080-exec-8] o.springdoc.api.AbstractOpenApiResource  : Init duration for springdoc-openapi is: 844 ms
