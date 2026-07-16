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

2026-07-16T13:56:57.554-03:00  INFO 8 --- [           main] b.c.c.s.SidceContaDestinoApplication     : Starting SidceContaDestinoApplication v1.131.0.0 using Java 17.0.7 with PID 8 (/deployments/sidce-conta-destino-1.131.0.0.jar started by 1001 in /deployments)
2026-07-16T13:56:57.557-03:00  INFO 8 --- [           main] b.c.c.s.SidceContaDestinoApplication     : The following 1 profile is active: "TQS"
2026-07-16T13:56:59.270-03:00  INFO 8 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Overriding bean definition for bean 'customRequestInterceptor' with a different definition: replacing [Generic bean: class=br.com.caixa.sidcecontadestino.core.client.config.CustomRequestInterceptor; scope=singleton; abstract=false; lazyInit=null; autowireMode=0; dependencyCheck=0; autowireCandidate=true; primary=false; fallback=false; factoryBeanName=null; factoryMethodName=null; initMethodNames=null; destroyMethodNames=null; defined in URL [jar:nested:/deployments/sidce-conta-destino-1.131.0.0.jar/!BOOT-INF/classes/!/br/com/caixa/sidcecontadestino/core/client/config/CustomRequestInterceptor.class]] with [Root bean: class=null; scope=; abstract=false; lazyInit=null; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; fallback=false; factoryBeanName=feignGlobalConfig; factoryMethodName=customRequestInterceptor; initMethodNames=null; destroyMethodNames=[(inferred)]; defined in class path resource [br/com/caixa/sidcecontadestino/core/client/config/FeignGlobalConfig.class]]
2026-07-16T13:57:00.267-03:00  INFO 8 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-07-16T13:57:00.406-03:00  INFO 8 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 131 ms. Found 2 JPA repository interfaces.
2026-07-16T13:57:00.856-03:00  INFO 8 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=e086834a-c2c6-3c66-b41d-28a258201d4f
2026-07-16T13:57:01.965-03:00  INFO 8 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-07-16T13:57:01.975-03:00  INFO 8 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-07-16T13:57:01.975-03:00  INFO 8 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.42]
2026-07-16T13:57:02.171-03:00  INFO 8 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/v1]     : Initializing Spring embedded WebApplicationContext
2026-07-16T13:57:02.172-03:00  INFO 8 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 4510 ms
2026-07-16T13:57:03.350-03:00  INFO 8 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-07-16T13:57:04.688-03:00  INFO 8 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2026-07-16T13:57:04.774-03:00  INFO 8 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.6.18.Final
2026-07-16T13:57:04.867-03:00  INFO 8 --- [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2026-07-16T13:57:04.983-03:00  INFO 8 --- [           main] o.h.e.boot.internal.EnversServiceImpl    : Envers integration enabled? : true
2026-07-16T13:57:05.453-03:00  INFO 8 --- [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-07-16T13:57:05.480-03:00  INFO 8 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-07-16T13:57:06.498-03:00  WARN 8 --- [           main] o.h.engine.jdbc.spi.SqlExceptionHelper   : SQL Error: 18456, SQLState: S0001
2026-07-16T13:57:06.499-03:00 ERROR 8 --- [           main] o.h.engine.jdbc.spi.SqlExceptionHelper   : Login failed for user 'SDCETB01'. ClientConnectionId:fcfe890b-7288-41cf-b0e3-69e512e7e486
2026-07-16T13:57:06.499-03:00  WARN 8 --- [           main] o.h.e.j.e.i.JdbcEnvironmentInitiator     : HHH000342: Could not obtain connection to query metadata

org.hibernate.exception.SQLGrammarException: unable to obtain isolated JDBC connection [Login failed for user 'SDCETB01'. ClientConnectionId:fcfe890b-7288-41cf-b0e3-69e512e7e486] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:91) ~[hibernate-core-6.6.18.Final.jar!/:6.6.18.Final]
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:58) ~[hibernate-core-6.6.18.Final.jar!/:6.6.18.Final]
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108) ~[hibernate-core-6.6.18.Final.jar!/:6.6.18.Final]
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94) ~[hibernate-core-6.6.18.Final.jar!/:6.6.18.Final]
	at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcIsolationDelegate.delegateWork(JdbcIsolationDelegate.java:116) ~[hibernate-core-6.6.18.Final.jar!/:6.6.18.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentUsingJdbcMetadata(JdbcEnvironmentInitiator.java:336) ~[hibernate-core-6.6.18.Final.jar!/:6.6.18.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:129) ~[hibernate-core-6.6.18.Final.jar!/:6.6.18.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:81) ~[hibernate-core-6.6.18.Final.jar!/:6.6.18.Final]
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:130) ~[hibernate-core-6.6.18.Final.jar!/:6.6.18.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:263) ~[hibernate-core-6.6.18.Final.jar!/:6.6.18.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:238) ~[hibernate-core-6.6.18.Final.jar!/:6.6.18.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:215) ~[hibernate-core-6.6.18.Final.jar!/:6.6.18.Final]
	at org.hibernate.boot.model.relational.Database.<init>(Database.java:45) ~[hibernate-core-6.6.18.Final.jar!/:6.6.18.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.getDatabase(InFlightMetadataCollectorImpl.java:226) ~[hibernate-core-6.6.18.Final.jar!/:6.6.18.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:194) ~[hibernate-core-6.6.18.Final.jar!/:6.6.18.Final]
	at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:171) ~[hibernate-core-6.6.18.Final.jar!/:6.6.18.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1442) ~[hibernate-core-6.6.18.Final.jar!/:6.6.18.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1513) ~[hibernate-core-6.6.18.Final.jar!/:6.6.18.Final]
	at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:66) ~[spring-orm-6.2.8.jar!/:6.2.8]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:390) ~[spring-orm-6.2.8.jar!/:6.2.8]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:419) ~[spring-orm-6.2.8.jar!/:6.2.8]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:400) ~[spring-orm-6.2.8.jar!/:6.2.8]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:366) ~[spring-orm-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1873) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1822) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:607) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:529) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:339) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:373) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:337) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:207) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:970) ~[spring-context-6.2.8.jar!/:6.2.8]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:627) ~[spring-context-6.2.8.jar!/:6.2.8]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.5.3.jar!/:3.5.3]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:752) ~[spring-boot-3.5.3.jar!/:3.5.3]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:439) ~[spring-boot-3.5.3.jar!/:3.5.3]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:318) ~[spring-boot-3.5.3.jar!/:3.5.3]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1361) ~[spring-boot-3.5.3.jar!/:3.5.3]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1350) ~[spring-boot-3.5.3.jar!/:3.5.3]
	at br.com.caixa.sidcecontadestino.SidceContaDestinoApplication.main(SidceContaDestinoApplication.java:18) ~[!/:1.131.0.0]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:102) ~[sidce-conta-destino-1.131.0.0.jar:1.131.0.0]
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64) ~[sidce-conta-destino-1.131.0.0.jar:1.131.0.0]
	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40) ~[sidce-conta-destino-1.131.0.0.jar:1.131.0.0]
Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: Login failed for user 'SDCETB01'. ClientConnectionId:fcfe890b-7288-41cf-b0e3-69e512e7e486
	at com.microsoft.sqlserver.jdbc.SQLServerException.makeFromDatabaseError(SQLServerException.java:276) ~[mssql-jdbc-12.10.0.jre11.jar!/:na]
	at com.microsoft.sqlserver.jdbc.TDSTokenHandler.onEOF(tdsparser.java:329) ~[mssql-jdbc-12.10.0.jre11.jar!/:na]
	at com.microsoft.sqlserver.jdbc.TDSParser.parse(tdsparser.java:137) ~[mssql-jdbc-12.10.0.jre11.jar!/:na]
	at com.microsoft.sqlserver.jdbc.TDSParser.parse(tdsparser.java:42) ~[mssql-jdbc-12.10.0.jre11.jar!/:na]
	at com.microsoft.sqlserver.jdbc.SQLServerConnection.sendLogon(SQLServerConnection.java:7199) ~[mssql-jdbc-12.10.0.jre11.jar!/:na]
	at com.microsoft.sqlserver.jdbc.SQLServerConnection.logon(SQLServerConnection.java:5743) ~[mssql-jdbc-12.10.0.jre11.jar!/:na]
	at com.microsoft.sqlserver.jdbc.SQLServerConnection$LogonCommand.doExecute(SQLServerConnection.java:5675) ~[mssql-jdbc-12.10.0.jre11.jar!/:na]
	at com.microsoft.sqlserver.jdbc.TDSCommand.execute(IOBuffer.java:7745) ~[mssql-jdbc-12.10.0.jre11.jar!/:na]
	at com.microsoft.sqlserver.jdbc.SQLServerConnection.executeCommand(SQLServerConnection.java:4700) ~[mssql-jdbc-12.10.0.jre11.jar!/:na]
	at com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:4133) ~[mssql-jdbc-12.10.0.jre11.jar!/:na]
	at com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:3690) ~[mssql-jdbc-12.10.0.jre11.jar!/:na]
	at com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:3499) ~[mssql-jdbc-12.10.0.jre11.jar!/:na]
	at com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:2207) ~[mssql-jdbc-12.10.0.jre11.jar!/:na]
	at com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:1320) ~[mssql-jdbc-12.10.0.jre11.jar!/:na]
	at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:139) ~[HikariCP-6.3.0.jar!/:na]
	at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:368) ~[HikariCP-6.3.0.jar!/:na]
	at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:205) ~[HikariCP-6.3.0.jar!/:na]
	at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:483) ~[HikariCP-6.3.0.jar!/:na]
	at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:571) ~[HikariCP-6.3.0.jar!/:na]
	at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:101) ~[HikariCP-6.3.0.jar!/:na]
	at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:111) ~[HikariCP-6.3.0.jar!/:na]
	at org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:126) ~[hibernate-core-6.6.18.Final.jar!/:6.6.18.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess.obtainConnection(JdbcEnvironmentInitiator.java:483) ~[hibernate-core-6.6.18.Final.jar!/:6.6.18.Final]
	at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcIsolationDelegate.delegateWork(JdbcIsolationDelegate.java:61) ~[hibernate-core-6.6.18.Final.jar!/:6.6.18.Final]
	... 42 common frames omitted

2026-07-16T13:57:06.514-03:00  WARN 8 --- [           main] org.hibernate.orm.deprecation            : HHH90000025: SQLServerDialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-07-16T13:57:06.525-03:00  INFO 8 --- [           main] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
	Database JDBC URL [Connecting through datasource 'HikariDataSource (null)']
	Database driver: undefined/unknown
	Database version: 11.0
	Autocommit mode: undefined/unknown
	Isolation level: undefined/unknown
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown
2026-07-16T13:57:06.961-03:00  INFO 8 --- [           main] o.h.e.c.i.m.AuditMetadataGenerator       : Adding properties for entity: br.com.caixa.sidcecontadestino.domain.model.entity.ContaEleitoral
2026-07-16T13:57:06.963-03:00  INFO 8 --- [           main] o.h.e.c.i.m.AuditMetadataGenerator       : Adding properties for entity: br.com.caixa.sidcecontadestino.domain.model.entity.ContaEleitoralDestino
2026-07-16T13:57:08.782-03:00  INFO 8 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-07-16T13:57:08.790-03:00  INFO 8 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-07-16T13:57:08.856-03:00  WARN 8 --- [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'customRequestInterceptor' defined in class path resource [br/com/caixa/sidcecontadestino/core/client/config/FeignGlobalConfig.class]: Unsatisfied dependency expressed through method 'customRequestInterceptor' parameter 0: Error creating bean with name 'SSOService': Injection of autowired dependencies failed
2026-07-16T13:57:08.856-03:00  INFO 8 --- [           main] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2026-07-16T13:57:08.860-03:00  INFO 8 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2026-07-16T13:57:08.879-03:00  INFO 8 --- [           main] .s.b.a.l.ConditionEvaluationReportLogger : 

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2026-07-16T13:57:08.894-03:00 ERROR 8 --- [           main] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'customRequestInterceptor' defined in class path resource [br/com/caixa/sidcecontadestino/core/client/config/FeignGlobalConfig.class]: Unsatisfied dependency expressed through method 'customRequestInterceptor' parameter 0: Error creating bean with name 'SSOService': Injection of autowired dependencies failed
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:804) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:546) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1375) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1205) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:569) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:529) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:339) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:373) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:337) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.instantiateSingleton(DefaultListableBeanFactory.java:1222) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingleton(DefaultListableBeanFactory.java:1188) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:1123) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:987) ~[spring-context-6.2.8.jar!/:6.2.8]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:627) ~[spring-context-6.2.8.jar!/:6.2.8]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.5.3.jar!/:3.5.3]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:752) ~[spring-boot-3.5.3.jar!/:3.5.3]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:439) ~[spring-boot-3.5.3.jar!/:3.5.3]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:318) ~[spring-boot-3.5.3.jar!/:3.5.3]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1361) ~[spring-boot-3.5.3.jar!/:3.5.3]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1350) ~[spring-boot-3.5.3.jar!/:3.5.3]
	at br.com.caixa.sidcecontadestino.SidceContaDestinoApplication.main(SidceContaDestinoApplication.java:18) ~[!/:1.131.0.0]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:102) ~[sidce-conta-destino-1.131.0.0.jar:1.131.0.0]
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64) ~[sidce-conta-destino-1.131.0.0.jar:1.131.0.0]
	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40) ~[sidce-conta-destino-1.131.0.0.jar:1.131.0.0]
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'SSOService': Injection of autowired dependencies failed
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessProperties(AutowiredAnnotationBeanPostProcessor.java:515) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1459) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:606) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:529) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:339) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:373) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:337) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1745) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1628) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:913) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791) ~[spring-beans-6.2.8.jar!/:6.2.8]
	... 28 common frames omitted
Caused by: org.springframework.util.PlaceholderResolutionException: Could not resolve placeholder 'SSO_CLIENT_SECRET' in value "${SSO_CLIENT_SECRET}" <-- "${keycloak.credentials.secret}"
	at org.springframework.util.PlaceholderResolutionException.withValue(PlaceholderResolutionException.java:81) ~[spring-core-6.2.8.jar!/:6.2.8]
	at org.springframework.util.PlaceholderParser$ParsedValue.resolve(PlaceholderParser.java:423) ~[spring-core-6.2.8.jar!/:6.2.8]
	at org.springframework.util.PlaceholderParser.replacePlaceholders(PlaceholderParser.java:128) ~[spring-core-6.2.8.jar!/:6.2.8]
	at org.springframework.util.PropertyPlaceholderHelper.parseStringValue(PropertyPlaceholderHelper.java:118) ~[spring-core-6.2.8.jar!/:6.2.8]
	at org.springframework.util.PropertyPlaceholderHelper.replacePlaceholders(PropertyPlaceholderHelper.java:114) ~[spring-core-6.2.8.jar!/:6.2.8]
	at org.springframework.core.env.AbstractPropertyResolver.doResolvePlaceholders(AbstractPropertyResolver.java:293) ~[spring-core-6.2.8.jar!/:6.2.8]
	at org.springframework.core.env.AbstractPropertyResolver.resolveRequiredPlaceholders(AbstractPropertyResolver.java:264) ~[spring-core-6.2.8.jar!/:6.2.8]
	at org.springframework.context.support.PropertySourcesPlaceholderConfigurer.lambda$processProperties$0(PropertySourcesPlaceholderConfigurer.java:186) ~[spring-context-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.AbstractBeanFactory.resolveEmbeddedValue(AbstractBeanFactory.java:971) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1650) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1628) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.resolveFieldValue(AutowiredAnnotationBeanPostProcessor.java:785) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:768) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:146) ~[spring-beans-6.2.8.jar!/:6.2.8]
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessProperties(AutowiredAnnotationBeanPostProcessor.java:509) ~[spring-beans-6.2.8.jar!/:6.2.8]
	... 40 common frames omitted

