exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sinaf-acoes-em-lote-mensageria -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sinaf-acoes-em-lote-mensageria -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/demo-1.1.16.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.
Failed to start agent
java.lang.reflect.InvocationTargetException
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:118)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at co.elastic.apm.agent.premain.AgentMain.loadAndInitializeAgent(AgentMain.java:155)
	at co.elastic.apm.agent.premain.AgentMain.init(AgentMain.java:100)
	at co.elastic.apm.agent.premain.AgentMain.premain(AgentMain.java:56)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at java.instrument/sun.instrument.InstrumentationImpl.loadClassAndStartAgent(InstrumentationImpl.java:560)
	at java.instrument/sun.instrument.InstrumentationImpl.loadClassAndCallPremain(InstrumentationImpl.java:572)
Caused by: java.lang.RuntimeException: java.lang.UnsupportedOperationException: Could not access Unsafe class: sun.misc.Unsafe.defineClass(java.lang.String,[B,int,int,java.lang.ClassLoader,java.security.ProtectionDomain)
	at co.elastic.apm.agent.bci.IndyBootstrap.getIndyBootstrapMethod(IndyBootstrap.java:221)
	at co.elastic.apm.agent.bci.ElasticApmAgent.getTransformer(ElasticApmAgent.java:436)
	at co.elastic.apm.agent.bci.ElasticApmAgent.applyAdvice(ElasticApmAgent.java:398)
	at co.elastic.apm.agent.bci.ElasticApmAgent.initAgentBuilder(ElasticApmAgent.java:321)
	at co.elastic.apm.agent.bci.ElasticApmAgent.initInstrumentation(ElasticApmAgent.java:267)
	at co.elastic.apm.agent.bci.ElasticApmAgent.initInstrumentation(ElasticApmAgent.java:171)
	at co.elastic.apm.agent.bci.ElasticApmAgent.initialize(ElasticApmAgent.java:157)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
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

 :: Spring Boot ::                (v3.4.5)

2026-08-13T15:50:30.490-03:00  INFO 8 --- [acoes-em-lote-mensageria] [           main] g.c.b.s.AcoesEmLoteMensageriaApplication : Starting AcoesEmLoteMensageriaApplication v1.1.16 using Java 21.0.1 with PID 8 (/deployments/demo-1.1.16.jar started by 185 in /deployments)
2026-08-13T15:50:30.492-03:00  INFO 8 --- [acoes-em-lote-mensageria] [           main] g.c.b.s.AcoesEmLoteMensageriaApplication : No active profile set, falling back to 1 default profile: "default"
2026-08-13T15:50:32.614-03:00  INFO 8 --- [acoes-em-lote-mensageria] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-08-13T15:50:32.692-03:00  INFO 8 --- [acoes-em-lote-mensageria] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 70 ms. Found 0 JPA repository interfaces.
2026-08-13T15:50:34.107-03:00  INFO 8 --- [acoes-em-lote-mensageria] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-08-13T15:50:34.118-03:00  INFO 8 --- [acoes-em-lote-mensageria] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-08-13T15:50:34.118-03:00  INFO 8 --- [acoes-em-lote-mensageria] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.40]
2026-08-13T15:50:34.282-03:00  INFO 8 --- [acoes-em-lote-mensageria] [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-08-13T15:50:34.283-03:00  INFO 8 --- [acoes-em-lote-mensageria] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 3762 ms
2026-08-13T15:50:35.118-03:00  INFO 8 --- [acoes-em-lote-mensageria] [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2026-08-13T15:50:35.213-03:00  INFO 8 --- [acoes-em-lote-mensageria] [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.6.13.Final
2026-08-13T15:50:35.287-03:00  INFO 8 --- [acoes-em-lote-mensageria] [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2026-08-13T15:50:37.108-03:00  INFO 8 --- [acoes-em-lote-mensageria] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-08-13T15:50:37.184-03:00  INFO 8 --- [acoes-em-lote-mensageria] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-08-13T15:50:38.595-03:00  WARN 8 --- [acoes-em-lote-mensageria] [           main] o.h.engine.jdbc.spi.SqlExceptionHelper   : SQL Error: -4214, SQLState: 28000
2026-08-13T15:50:38.595-03:00 ERROR 8 --- [acoes-em-lote-mensageria] [           main] o.h.engine.jdbc.spi.SqlExceptionHelper   : [jcc][t4][2016][11252][4.32.28] Connection authorization failure occurred.  Reason: User ID invalid. ERRORCODE=-4214, SQLSTATE=28000
2026-08-13T15:50:38.595-03:00  WARN 8 --- [acoes-em-lote-mensageria] [           main] o.h.e.j.e.i.JdbcEnvironmentInitiator     : HHH000342: Could not obtain connection to query metadata

org.hibernate.exception.GenericJDBCException: unable to obtain isolated JDBC connection [[jcc][t4][2016][11252][4.32.28] Connection authorization failure occurred.  Reason: User ID invalid. ERRORCODE=-4214, SQLSTATE=28000] [n/a]
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:63) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcIsolationDelegate.delegateWork(JdbcIsolationDelegate.java:116) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentUsingJdbcMetadata(JdbcEnvironmentInitiator.java:320) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:129) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:81) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:130) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:263) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:238) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:215) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.boot.model.relational.Database.<init>(Database.java:45) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.getDatabase(InFlightMetadataCollectorImpl.java:226) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:194) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:171) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1442) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1513) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:66) ~[spring-orm-6.2.6.jar!/:6.2.6]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:390) ~[spring-orm-6.2.6.jar!/:6.2.6]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:419) ~[spring-orm-6.2.6.jar!/:6.2.6]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:400) ~[spring-orm-6.2.6.jar!/:6.2.6]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:366) ~[spring-orm-6.2.6.jar!/:6.2.6]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1865) ~[spring-beans-6.2.6.jar!/:6.2.6]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1814) ~[spring-beans-6.2.6.jar!/:6.2.6]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:607) ~[spring-beans-6.2.6.jar!/:6.2.6]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:529) ~[spring-beans-6.2.6.jar!/:6.2.6]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:339) ~[spring-beans-6.2.6.jar!/:6.2.6]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:371) ~[spring-beans-6.2.6.jar!/:6.2.6]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:337) ~[spring-beans-6.2.6.jar!/:6.2.6]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:207) ~[spring-beans-6.2.6.jar!/:6.2.6]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:970) ~[spring-context-6.2.6.jar!/:6.2.6]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:627) ~[spring-context-6.2.6.jar!/:6.2.6]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.4.5.jar!/:3.4.5]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:753) ~[spring-boot-3.4.5.jar!/:3.4.5]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:439) ~[spring-boot-3.4.5.jar!/:3.4.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:318) ~[spring-boot-3.4.5.jar!/:3.4.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1362) ~[spring-boot-3.4.5.jar!/:3.4.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1351) ~[spring-boot-3.4.5.jar!/:3.4.5]
	at br.gov.caixa.bsb.sinaf.AcoesEmLoteMensageriaApplication.main(AcoesEmLoteMensageriaApplication.java:10) ~[!/:1.1.16]
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:102) ~[demo-1.1.16.jar:1.1.16]
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64) ~[demo-1.1.16.jar:1.1.16]
	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40) ~[demo-1.1.16.jar:1.1.16]
Caused by: com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2016][11252][4.32.28] Connection authorization failure occurred.  Reason: User ID invalid. ERRORCODE=-4214, SQLSTATE=28000
	at com.ibm.db2.jcc.am.b7.a(b7.java:808) ~[jcc-11.5.8.0.jar!/:na]
	at com.ibm.db2.jcc.am.b7.a(b7.java:66) ~[jcc-11.5.8.0.jar!/:na]
	at com.ibm.db2.jcc.am.b7.a(b7.java:133) ~[jcc-11.5.8.0.jar!/:na]
	at com.ibm.db2.jcc.t4.b.f(b.java:2692) ~[jcc-11.5.8.0.jar!/:na]
	at com.ibm.db2.jcc.t4.b.b(b.java:2011) ~[jcc-11.5.8.0.jar!/:na]
	at com.ibm.db2.jcc.t4.z.r(z.java:961) ~[jcc-11.5.8.0.jar!/:na]
	at com.ibm.db2.jcc.t4.z.k(z.java:494) ~[jcc-11.5.8.0.jar!/:na]
	at com.ibm.db2.jcc.t4.z.c(z.java:144) ~[jcc-11.5.8.0.jar!/:na]
	at com.ibm.db2.jcc.t4.b.k(b.java:1520) ~[jcc-11.5.8.0.jar!/:na]
	at com.ibm.db2.jcc.t4.b.b(b.java:1433) ~[jcc-11.5.8.0.jar!/:na]
	at com.ibm.db2.jcc.t4.b.a(b.java:6862) ~[jcc-11.5.8.0.jar!/:na]
	at com.ibm.db2.jcc.t4.b.b(b.java:949) ~[jcc-11.5.8.0.jar!/:na]
	at com.ibm.db2.jcc.t4.b.a(b.java:862) ~[jcc-11.5.8.0.jar!/:na]
	at com.ibm.db2.jcc.t4.b.a(b.java:457) ~[jcc-11.5.8.0.jar!/:na]
	at com.ibm.db2.jcc.t4.b.a(b.java:430) ~[jcc-11.5.8.0.jar!/:na]
	at com.ibm.db2.jcc.t4.b.<init>(b.java:368) ~[jcc-11.5.8.0.jar!/:na]
	at com.ibm.db2.jcc.DB2SimpleDataSource.getConnection(DB2SimpleDataSource.java:243) ~[jcc-11.5.8.0.jar!/:na]
	at com.ibm.db2.jcc.DB2SimpleDataSource.getConnection(DB2SimpleDataSource.java:200) ~[jcc-11.5.8.0.jar!/:na]
	at com.ibm.db2.jcc.DB2Driver.connect(DB2Driver.java:491) ~[jcc-11.5.8.0.jar!/:na]
	at com.ibm.db2.jcc.DB2Driver.connect(DB2Driver.java:117) ~[jcc-11.5.8.0.jar!/:na]
	at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:137) ~[HikariCP-5.1.0.jar!/:na]
	at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:360) ~[HikariCP-5.1.0.jar!/:na]
	at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:202) ~[HikariCP-5.1.0.jar!/:na]
	at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:461) ~[HikariCP-5.1.0.jar!/:na]
	at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:550) ~[HikariCP-5.1.0.jar!/:na]
	at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:98) ~[HikariCP-5.1.0.jar!/:na]
	at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:111) ~[HikariCP-5.1.0.jar!/:na]
	at org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:126) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess.obtainConnection(JdbcEnvironmentInitiator.java:467) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcIsolationDelegate.delegateWork(JdbcIsolationDelegate.java:61) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	... 40 common frames omitted

2026-08-13T15:50:38.599-03:00 ERROR 8 --- [acoes-em-lote-mensageria] [           main] j.LocalContainerEntityManagerFactoryBean : Failed to initialize JPA EntityManagerFactory: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment] due to: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
2026-08-13T15:50:38.600-03:00  WARN 8 --- [acoes-em-lote-mensageria] [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [br/gov/caixa/bsb/sinaf/config/JpaConfig.class]: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment] due to: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
2026-08-13T15:50:38.603-03:00  INFO 8 --- [acoes-em-lote-mensageria] [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2026-08-13T15:50:38.617-03:00  INFO 8 --- [acoes-em-lote-mensageria] [           main] .s.b.a.l.ConditionEvaluationReportLogger : 

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2026-08-13T15:50:38.631-03:00 ERROR 8 --- [acoes-em-lote-mensageria] [           main] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [br/gov/caixa/bsb/sinaf/config/JpaConfig.class]: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment] due to: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1818) ~[spring-beans-6.2.6.jar!/:6.2.6]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:607) ~[spring-beans-6.2.6.jar!/:6.2.6]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:529) ~[spring-beans-6.2.6.jar!/:6.2.6]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:339) ~[spring-beans-6.2.6.jar!/:6.2.6]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:371) ~[spring-beans-6.2.6.jar!/:6.2.6]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:337) ~[spring-beans-6.2.6.jar!/:6.2.6]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:207) ~[spring-beans-6.2.6.jar!/:6.2.6]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:970) ~[spring-context-6.2.6.jar!/:6.2.6]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:627) ~[spring-context-6.2.6.jar!/:6.2.6]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.4.5.jar!/:3.4.5]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:753) ~[spring-boot-3.4.5.jar!/:3.4.5]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:439) ~[spring-boot-3.4.5.jar!/:3.4.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:318) ~[spring-boot-3.4.5.jar!/:3.4.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1362) ~[spring-boot-3.4.5.jar!/:3.4.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1351) ~[spring-boot-3.4.5.jar!/:3.4.5]
	at br.gov.caixa.bsb.sinaf.AcoesEmLoteMensageriaApplication.main(AcoesEmLoteMensageriaApplication.java:10) ~[!/:1.1.16]
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:102) ~[demo-1.1.16.jar:1.1.16]
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64) ~[demo-1.1.16.jar:1.1.16]
	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40) ~[demo-1.1.16.jar:1.1.16]
Caused by: org.hibernate.service.spi.ServiceException: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment] due to: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:276) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:238) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:215) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.boot.model.relational.Database.<init>(Database.java:45) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.getDatabase(InFlightMetadataCollectorImpl.java:226) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:194) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:171) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1442) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1513) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:66) ~[spring-orm-6.2.6.jar!/:6.2.6]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:390) ~[spring-orm-6.2.6.jar!/:6.2.6]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:419) ~[spring-orm-6.2.6.jar!/:6.2.6]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:400) ~[spring-orm-6.2.6.jar!/:6.2.6]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:366) ~[spring-orm-6.2.6.jar!/:6.2.6]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1865) ~[spring-beans-6.2.6.jar!/:6.2.6]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1814) ~[spring-beans-6.2.6.jar!/:6.2.6]
	... 20 common frames omitted
Caused by: org.hibernate.HibernateException: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
	at org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl.determineDialect(DialectFactoryImpl.java:191) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl.buildDialect(DialectFactoryImpl.java:87) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentWithDefaults(JdbcEnvironmentInitiator.java:181) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentUsingJdbcMetadata(JdbcEnvironmentInitiator.java:392) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:129) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:81) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:130) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:263) ~[hibernate-core-6.6.13.Final.jar!/:6.6.13.Final]
	... 35 common frames omitted





    estao questinoa dizendo que nao tem erro no banco de dados e que ja avaliaram o codigo e nao tem erro erotmab verifiaa esse loig e me ajuda a responder 
