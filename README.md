exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sifgd-backend -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=https://apm-server-devops.apps.produtos4.caixa/ -Delastic.apm.global_labels=deployment=sifgd-backend -Delastic.apm.verify_server_cert=false -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/sifgd-backend-0.0.1-SNAPSHOT.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::arrayBaseOffset has been called by co.elastic.apm.agent.shaded.lmax.disruptor.RingBufferFields
WARNING: Please consider reporting this to the maintainers of class co.elastic.apm.agent.shaded.lmax.disruptor.RingBufferFields
WARNING: sun.misc.Unsafe::arrayBaseOffset will be removed in a future release
Failed to start agent
java.lang.reflect.InvocationTargetException
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:119)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at co.elastic.apm.agent.premain.AgentMain.loadAndInitializeAgent(AgentMain.java:155)
	at co.elastic.apm.agent.premain.AgentMain.init(AgentMain.java:100)
	at co.elastic.apm.agent.premain.AgentMain.premain(AgentMain.java:56)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at java.instrument/sun.instrument.InstrumentationImpl.loadClassAndStartAgent(InstrumentationImpl.java:544)
	at java.instrument/sun.instrument.InstrumentationImpl.loadClassAndCallPremain(InstrumentationImpl.java:556)
Caused by: java.lang.RuntimeException: java.lang.UnsupportedOperationException: Could not access Unsafe class: sun.misc.Unsafe.defineClass(java.lang.String,[B,int,int,java.lang.ClassLoader,java.security.ProtectionDomain)
	at co.elastic.apm.agent.bci.IndyBootstrap.getIndyBootstrapMethod(IndyBootstrap.java:221)
	at co.elastic.apm.agent.bci.ElasticApmAgent.getTransformer(ElasticApmAgent.java:436)
	at co.elastic.apm.agent.bci.ElasticApmAgent.applyAdvice(ElasticApmAgent.java:398)
	at co.elastic.apm.agent.bci.ElasticApmAgent.initAgentBuilder(ElasticApmAgent.java:321)
	at co.elastic.apm.agent.bci.ElasticApmAgent.initInstrumentation(ElasticApmAgent.java:267)
	at co.elastic.apm.agent.bci.ElasticApmAgent.initInstrumentation(ElasticApmAgent.java:171)
	at co.elastic.apm.agent.bci.ElasticApmAgent.initialize(ElasticApmAgent.java:157)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	... 8 more
Caused by: java.lang.UnsupportedOperationException: Could not access Unsafe class: sun.misc.Unsafe.defineClass(java.lang.String,[B,int,int,java.lang.ClassLoader,java.security.ProtectionDomain)
	at co.elastic.apm.agent.shaded.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Unavailable.initialize(ClassInjector.java:2133)
	at co.elastic.apm.agent.shaded.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe.injectRaw(ClassInjector.java:1865)
	at co.elastic.apm.agent.bci.IndyBootstrap.initIndyBootstrap(IndyBootstrap.java:234)
	at co.elastic.apm.agent.bci.IndyBootstrap.getIndyBootstrapMethod(IndyBootstrap.java:215)
	... 15 more

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v4.0.5)

2026-10-09T12:33:09.205-03:00  INFO 8 --- [sifgd-backend] [           main] b.g.caixa.sifgd.SifgdBackendApplication  : Starting SifgdBackendApplication v0.0.1-SNAPSHOT using Java 25.0.3 with PID 8 (/deployments/sifgd-backend-0.0.1-SNAPSHOT.jar started by root in /deployments)
2026-10-09T12:33:09.208-03:00  INFO 8 --- [sifgd-backend] [           main] b.g.caixa.sifgd.SifgdBackendApplication  : No active profile set, falling back to 1 default profile: "default"
2026-10-09T12:33:10.790-03:00  INFO 8 --- [sifgd-backend] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-10-09T12:33:10.807-03:00  INFO 8 --- [sifgd-backend] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 9 ms. Found 0 JPA repository interfaces.
2026-10-09T12:33:11.728-03:00  INFO 8 --- [sifgd-backend] [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat initialized with port 8080 (http)
2026-10-09T12:33:11.787-03:00  INFO 8 --- [sifgd-backend] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-10-09T12:33:11.788-03:00  INFO 8 --- [sifgd-backend] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/11.0.20]
2026-10-09T12:33:11.891-03:00  INFO 8 --- [sifgd-backend] [           main] b.w.c.s.WebApplicationContextInitializer : Root WebApplicationContext: initialization completed in 2587 ms
2026-10-09T12:33:12.722-03:00  INFO 8 --- [sifgd-backend] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-10-09T12:33:14.024-03:00  INFO 8 --- [sifgd-backend] [           main] org.hibernate.orm.jpa                    : HHH008540: Processing PersistenceUnitInfo [name: default]
2026-10-09T12:33:14.123-03:00  INFO 8 --- [sifgd-backend] [           main] org.hibernate.orm.core                   : HHH000001: Hibernate ORM core version 7.2.7.Final
2026-10-09T12:33:15.027-03:00  INFO 8 --- [sifgd-backend] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-10-09T12:33:15.109-03:00  INFO 8 --- [sifgd-backend] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-10-09T12:33:16.112-03:00  WARN 8 --- [sifgd-backend] [           main] org.hibernate.orm.jdbc.error             : HHH000247: ErrorCode: -4461, SQLState: 42815
2026-10-09T12:33:16.112-03:00  WARN 8 --- [sifgd-backend] [           main] org.hibernate.orm.jdbc.error             : [jcc][10165][10051][4.37.4] Invalid database URL syntax: currentSchema. ERRORCODE=-4461, SQLSTATE=42815
2026-10-09T12:33:16.112-03:00  WARN 8 --- [sifgd-backend] [           main] org.hibernate.orm.jdbc                   : HHH100046: Could not obtain connection to query JDBC database metadata

org.hibernate.exception.SQLGrammarException: Unable to obtain isolated JDBC connection [[jcc][10165][10051][4.37.4] Invalid database URL syntax: currentSchema. ERRORCODE=-4461, SQLSTATE=42815] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:63) ~[hibernate-core-7.2.7.Final.jar!/:7.2.7.Final]
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:34) ~[hibernate-core-7.2.7.Final.jar!/:7.2.7.Final]
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:115) ~[hibernate-core-7.2.7.Final.jar!/:7.2.7.Final]
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:101) ~[hibernate-core-7.2.7.Final.jar!/:7.2.7.Final]
	at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcIsolationDelegate.delegateWork(JdbcIsolationDelegate.java:51) ~[hibernate-core-7.2.7.Final.jar!/:7.2.7.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentUsingJdbcMetadata(JdbcEnvironmentInitiator.java:366) ~[hibernate-core-7.2.7.Final.jar!/:7.2.7.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironment(JdbcEnvironmentInitiator.java:143) ~[hibernate-core-7.2.7.Final.jar!/:7.2.7.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:120) ~[hibernate-core-7.2.7.Final.jar!/:7.2.7.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:80) ~[hibernate-core-7.2.7.Final.jar!/:7.2.7.Final]
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:133) ~[hibernate-core-7.2.7.Final.jar!/:7.2.7.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:260) ~[hibernate-core-7.2.7.Final.jar!/:7.2.7.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:235) ~[hibernate-core-7.2.7.Final.jar!/:7.2.7.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:212) ~[hibernate-core-7.2.7.Final.jar!/:7.2.7.Final]
	at org.hibernate.boot.model.relational.Database.<init>(Database.java:44) ~[hibernate-core-7.2.7.Final.jar!/:7.2.7.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.getDatabase(InFlightMetadataCollectorImpl.java:251) ~[hibernate-core-7.2.7.Final.jar!/:7.2.7.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:203) ~[hibernate-core-7.2.7.Final.jar!/:7.2.7.Final]
	at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:172) ~[hibernate-core-7.2.7.Final.jar!/:7.2.7.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1392) ~[hibernate-core-7.2.7.Final.jar!/:7.2.7.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.populateSessionFactoryBuilder(EntityManagerFactoryBuilderImpl.java:1472) ~[hibernate-core-7.2.7.Final.jar!/:7.2.7.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1454) ~[hibernate-core-7.2.7.Final.jar!/:7.2.7.Final]
	at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:93) ~[spring-orm-7.0.6.jar!/:7.0.6]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:443) ~[spring-orm-7.0.6.jar!/:7.0.6]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:436) ~[spring-orm-7.0.6.jar!/:7.0.6]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:411) ~[spring-orm-7.0.6.jar!/:7.0.6]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:419) ~[spring-orm-7.0.6.jar!/:7.0.6]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1864) ~[spring-beans-7.0.6.jar!/:7.0.6]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1813) ~[spring-beans-7.0.6.jar!/:7.0.6]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:603) ~[spring-beans-7.0.6.jar!/:7.0.6]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:525) ~[spring-beans-7.0.6.jar!/:7.0.6]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:333) ~[spring-beans-7.0.6.jar!/:7.0.6]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:371) ~[spring-beans-7.0.6.jar!/:7.0.6]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:331) ~[spring-beans-7.0.6.jar!/:7.0.6]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:201) ~[spring-beans-7.0.6.jar!/:7.0.6]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:977) ~[spring-context-7.0.6.jar!/:7.0.6]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:621) ~[spring-context-7.0.6.jar!/:7.0.6]
	at org.springframework.boot.web.server.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:143) ~[spring-boot-web-server-4.0.5.jar!/:4.0.5]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:756) ~[spring-boot-4.0.5.jar!/:4.0.5]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:445) ~[spring-boot-4.0.5.jar!/:4.0.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:321) ~[spring-boot-4.0.5.jar!/:4.0.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1365) ~[spring-boot-4.0.5.jar!/:4.0.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1354) ~[spring-boot-4.0.5.jar!/:4.0.5]
	at br.gov.caixa.sifgd.SifgdBackendApplication.main(SifgdBackendApplication.java:10) ~[!/:0.0.1-SNAPSHOT]
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:565) ~[na:na]
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:106) ~[sifgd-backend-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64) ~[sifgd-backend-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40) ~[sifgd-backend-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
Caused by: com.ibm.db2.jcc.am.SqlSyntaxErrorException: [jcc][10165][10051][4.37.4] Invalid database URL syntax: currentSchema. ERRORCODE=-4461, SQLSTATE=42815
	at com.ibm.db2.jcc.am.b5.a(b5.java:810) ~[jcc-12.1.4.0.jar!/:na]
	at com.ibm.db2.jcc.am.b5.a(b5.java:66) ~[jcc-12.1.4.0.jar!/:na]
	at com.ibm.db2.jcc.am.b5.a(b5.java:98) ~[jcc-12.1.4.0.jar!/:na]
	at com.ibm.db2.jcc.DB2Driver.tokenizeURLProperties(DB2Driver.java:974) ~[jcc-12.1.4.0.jar!/:na]
	at com.ibm.db2.jcc.DB2Driver.connect(DB2Driver.java:428) ~[jcc-12.1.4.0.jar!/:na]
	at com.ibm.db2.jcc.DB2Driver.connect(DB2Driver.java:117) ~[jcc-12.1.4.0.jar!/:na]
	at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:144) ~[HikariCP-7.0.2.jar!/:na]
	at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:373) ~[HikariCP-7.0.2.jar!/:na]
	at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:210) ~[HikariCP-7.0.2.jar!/:na]
	at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:488) ~[HikariCP-7.0.2.jar!/:na]
	at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:576) ~[HikariCP-7.0.2.jar!/:na]
	at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:97) ~[HikariCP-7.0.2.jar!/:na]
	at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:111) ~[HikariCP-7.0.2.jar!/:na]
	at org.hibernate.engine.jdbc.connections.internal.DataSourceConnectionProvider.getConnection(DataSourceConnectionProvider.java:137) ~[hibernate-core-7.2.7.Final.jar!/:7.2.7.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess.obtainConnection(JdbcEnvironmentInitiator.java:508) ~[hibernate-core-7.2.7.Final.jar!/:7.2.7.Final]
	at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcIsolationDelegate.delegateWork(JdbcIsolationDelegate.java:48) ~[hibernate-core-7.2.7.Final.jar!/:7.2.7.Final]
	... 42 common frames omitted
Caused by: java.util.NoSuchElementException
	at java.base/java.util.StringTokenizer.nextToken(StringTokenizer.java:349) ~[na:na]
	at java.base/java.util.StringTokenizer.nextToken(StringTokenizer.java:377) ~[na:na]
	at com.ibm.db2.jcc.DB2Driver.tokenizeURLProperties(DB2Driver.java:962) ~[jcc-12.1.4.0.jar!/:na]
	... 54 common frames omitted

2026-10-09T12:33:16.134-03:00  WARN 8 --- [sifgd-backend] [           main] org.hibernate.orm.deprecation            : HHH90000025: DB2Dialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-10-09T12:33:16.147-03:00  INFO 8 --- [sifgd-backend] [           main] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
	Database JDBC URL [undefined/unknown]
	Database driver: undefined/unknown
	Database dialect: DB2Dialect
	Database version: 11.1
	Default catalog/schema: unknown/unknown
	Autocommit mode: undefined/unknown
	Isolation level: NONE [default NONE]
	JDBC fetch size: undefined/unknown
	Pool: DataSourceConnectionProvider
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown
2026-10-09T12:33:17.005-03:00  INFO 8 --- [sifgd-backend] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-10-09T12:33:17.012-03:00  INFO 8 --- [sifgd-backend] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-10-09T12:33:17.303-03:00  WARN 8 --- [sifgd-backend] [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-10-09T12:33:18.086-03:00  INFO 8 --- [sifgd-backend] [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat started on port 8080 (http) with context path '/'
2026-10-09T12:33:18.093-03:00  INFO 8 --- [sifgd-backend] [           main] b.g.caixa.sifgd.SifgdBackendApplication  : Started SifgdBackendApplication in 9.694 seconds (process running for 11.662)
2026-10-09T12:33:18.095-03:00  WARN 8 --- [sifgd-backend] [           main] o.s.core.events.SpringDocAppInitializer  : SpringDoc /v3/api-docs endpoint is enabled by default. To disable it in production, set the property 'springdoc.api-docs.enabled=false'
2026-10-09T12:33:18.096-03:00  WARN 8 --- [sifgd-backend] [           main] o.s.core.events.SpringDocAppInitializer  : SpringDoc /swagger-ui.html endpoint is enabled by default. To disable it in production, set the property 'springdoc.swagger-ui.enabled=false'
2026-10-09T12:34:14.161-03:00  INFO 8 --- [sifgd-backend] [0.0-8080-exec-2] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-10-09T12:34:14.162-03:00  INFO 8 --- [sifgd-backend] [0.0-8080-exec-2] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2026-10-09T12:34:14.163-03:00  INFO 8 --- [sifgd-backend] [0.0-8080-exec-2] o.s.web.servlet.DispatcherServlet        : Completed initialization in 1 ms
