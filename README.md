exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=siavl-gerencial-backend -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos4.caixa -Delastic.apm.global_labels=deployment=siavl-gerencial-backend -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/SIAVL-gerencial-backend.jar
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
WARNING: A Java agent has been loaded dynamically (/tmp/otel-agent5145638516077460507/agent.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-21 12:50:38.865-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.7.9 started successfully (PID 8, JVM running for 5.811 s)
2026-07-21 12:50:38.890-03:00 INFO  c.m.applicationinsights.agent - Java version: 21.0.1, vendor: Oracle Corporation, home: /usr/java/jdk-21.0.1

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::               (v3.5.16)

2026-07-21T12:50:41.349-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] b.g.c.siavl.gerencial.RunApplication     : Starting RunApplication using Java 21.0.1 with PID 8 (/deployments/SIAVL-gerencial-backend.jar started by 185 in /deployments)
2026-07-21T12:50:41.438-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] b.g.c.siavl.gerencial.RunApplication     : No active profile set, falling back to 1 default profile: "default"
2026-07-21T12:50:43.659-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-07-21T12:50:43.734-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 66 ms. Found 0 JPA repository interfaces.
2026-07-21 12:50:44.141-03:00 WARN  c.m.a.a.i.p.PerformanceMonitoringService - INITIALISING JFR PROFILING SUBSYSTEM THIS FEATURE IS IN BETA
2026-07-21T12:50:44.346-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=4c70f38e-23e6-3bf8-ab92-84398f587a42
2026-07-21T12:50:45.374-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-07-21T12:50:45.453-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-07-21T12:50:45.453-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.55]
2026-07-21T12:50:45.557-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-07-21T12:50:45.558-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 3925 ms
2026-07-21T12:50:46.854-03:00  WARN 8 --- [SIAVL-gerencial-backend] [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-07-21T12:50:47.353-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2026-07-21T12:50:47.473-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.6.53.Final
2026-07-21T12:50:47.559-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2026-07-21T12:50:48.077-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-07-21T12:50:48.161-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-07-21T12:50:51.365-03:00  WARN 8 --- [SIAVL-gerencial-backend] [           main] o.h.engine.jdbc.spi.SqlExceptionHelper   : SQL Error: 1017, SQLState: 72000
2026-07-21T12:50:51.366-03:00 ERROR 8 --- [SIAVL-gerencial-backend] [           main] o.h.engine.jdbc.spi.SqlExceptionHelper   : ORA-01017: invalid username/password; logon denied

https://docs.oracle.com/error-help/db/ora-01017/
2026-07-21T12:50:51.367-03:00  WARN 8 --- [SIAVL-gerencial-backend] [           main] o.h.e.j.e.i.JdbcEnvironmentInitiator     : HHH000342: Could not obtain connection to query metadata

org.hibernate.exception.GenericJDBCException: unable to obtain isolated JDBC connection [ORA-01017: invalid username/password; logon denied

https://docs.oracle.com/error-help/db/ora-01017/] [n/a]
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:63) ~[hibernate-core-6.6.53.Final.jar!/:6.6.53.Final]
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108) ~[hibernate-core-6.6.53.Final.jar!/:6.6.53.Final]
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94) ~[hibernate-core-6.6.53.Final.jar!/:6.6.53.Final]
	at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcIsolationDelegate.delegateWork(JdbcIsolationDelegate.java:116) ~[hibernate-core-6.6.53.Final.jar!/:6.6.53.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentUsingJdbcMetadata(JdbcEnvironmentInitiator.java:334) ~[hibernate-core-6.6.53.Final.jar!/:6.6.53.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:129) ~[hibernate-core-6.6.53.Final.jar!/:6.6.53.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:81) ~[hibernate-core-6.6.53.Final.jar!/:6.6.53.Final]
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:130) ~[hibernate-core-6.6.53.Final.jar!/:6.6.53.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:263) ~[hibernate-core-6.6.53.Final.jar!/:6.6.53.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:238) ~[hibernate-core-6.6.53.Final.jar!/:6.6.53.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:215) ~[hibernate-core-6.6.53.Final.jar!/:6.6.53.Final]
	at org.hibernate.boot.model.relational.Database.<init>(Database.java:45) ~[hibernate-core-6.6.53.Final.jar!/:6.6.53.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.getDatabase(InFlightMetadataCollectorImpl.java:226) ~[hibernate-core-6.6.53.Final.jar!/:6.6.53.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:194) ~[hibernate-core-6.6.53.Final.jar!/:6.6.53.Final]
	at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:171) ~[hibernate-core-6.6.53.Final.jar!/:6.6.53.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1442) ~[hibernate-core-6.6.53.Final.jar!/:6.6.53.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1513) ~[hibernate-core-6.6.53.Final.jar!/:6.6.53.Final]
	at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:66) ~[spring-orm-6.2.19.jar!/:6.2.19]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:388) ~[spring-orm-6.2.19.jar!/:6.2.19]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:419) ~[spring-orm-6.2.19.jar!/:6.2.19]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:400) ~[spring-orm-6.2.19.jar!/:6.2.19]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:364) ~[spring-orm-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1871) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1820) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:607) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:529) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:339) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:373) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:337) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:227) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveNamedBean(DefaultListableBeanFactory.java:1630) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveNamedBean(DefaultListableBeanFactory.java:1588) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveBean(DefaultListableBeanFactory.java:564) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:393) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:386) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.orm.jpa.EntityManagerFactoryUtils.findEntityManagerFactory(EntityManagerFactoryUtils.java:120) ~[spring-orm-6.2.19.jar!/:6.2.19]
	at org.springframework.orm.jpa.EntityManagerFactoryAccessor.setBeanFactory(EntityManagerFactoryAccessor.java:153) ~[spring-orm-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeAwareMethods(AbstractAutowireCapableBeanFactory.java:1845) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1812) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:607) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:529) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:339) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:373) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:337) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1777) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1660) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:913) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:546) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1373) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1203) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:569) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:529) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:339) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:373) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:337) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.addCandidateEntry(DefaultListableBeanFactory.java:2029) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.findAutowireCandidates(DefaultListableBeanFactory.java:1992) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveMultipleBeanCollection(DefaultListableBeanFactory.java:1882) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveMultipleBeans(DefaultListableBeanFactory.java:1850) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1726) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1660) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredMethodElement.resolveMethodArguments(AutowiredAnnotationBeanPostProcessor.java:887) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredMethodElement.inject(AutowiredAnnotationBeanPostProcessor.java:848) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:146) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessProperties(AutowiredAnnotationBeanPostProcessor.java:509) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1457) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:606) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:529) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:339) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:373) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:337) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:413) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1373) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1203) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:569) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:529) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:339) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:373) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:337) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:207) ~[spring-beans-6.2.19.jar!/:6.2.19]
	at org.springframework.context.event.AbstractApplicationEventMulticaster.retrieveApplicationListeners(AbstractApplicationEventMulticaster.java:267) ~[spring-context-6.2.19.jar!/:6.2.19]
	at org.springframework.context.event.AbstractApplicationEventMulticaster.getApplicationListeners(AbstractApplicationEventMulticaster.java:223) ~[spring-context-6.2.19.jar!/:6.2.19]
	at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:145) ~[spring-context-6.2.19.jar!/:6.2.19]
	at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:138) ~[spring-context-6.2.19.jar!/:6.2.19]
	at org.springframework.context.support.AbstractApplicationContext.registerListeners(AbstractApplicationContext.java:929) ~[spring-context-6.2.19.jar!/:6.2.19]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:625) ~[spring-context-6.2.19.jar!/:6.2.19]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.5.16.jar!/:3.5.16]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:752) ~[spring-boot-3.5.16.jar!/:3.5.16]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:439) ~[spring-boot-3.5.16.jar!/:3.5.16]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:318) ~[spring-boot-3.5.16.jar!/:3.5.16]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1361) ~[spring-boot-3.5.16.jar!/:3.5.16]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1350) ~[spring-boot-3.5.16.jar!/:3.5.16]
	at br.gov.caixa.siavl.gerencial.RunApplication.main(RunApplication.java:14) ~[!/:na]
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:106) ~[SIAVL-gerencial-backend.jar:na]
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64) ~[SIAVL-gerencial-backend.jar:na]
	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40) ~[SIAVL-gerencial-backend.jar:na]
Caused by: java.sql.SQLException: ORA-01017: invalid username/password; logon denied

https://docs.oracle.com/error-help/db/ora-01017/
	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:715) ~[ojdbc11-23.7.0.25.01.jar!/:23.7.0.25.01]
	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:610) ~[ojdbc11-23.7.0.25.01.jar!/:23.7.0.25.01]
	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:605) ~[ojdbc11-23.7.0.25.01.jar!/:23.7.0.25.01]
	at oracle.jdbc.driver.T4CTTIfun.processError(T4CTTIfun.java:1701) ~[ojdbc11-23.7.0.25.01.jar!/:23.7.0.25.01]
	at oracle.jdbc.driver.T4CTTIoauthenticate.processError(T4CTTIoauthenticate.java:936) ~[ojdbc11-23.7.0.25.01.jar!/:23.7.0.25.01]
	at oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:969) ~[ojdbc11-23.7.0.25.01.jar!/:23.7.0.25.01]
	at oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:237) ~[ojdbc11-23.7.0.25.01.jar!/:23.7.0.25.01]
	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:547) ~[ojdbc11-23.7.0.25.01.jar!/:23.7.0.25.01]
	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTHWithO5Logon(T4CTTIoauthenticate.java:1746) ~[ojdbc11-23.7.0.25.01.jar!/:23.7.0.25.01]
	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1493) ~[ojdbc11-23.7.0.25.01.jar!/:23.7.0.25.01]
	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1433) ~[ojdbc11-23.7.0.25.01.jar!/:23.7.0.25.01]
	at oracle.jdbc.driver.T4CConnection.authenticateWithPassword(T4CConnection.java:2294) ~[ojdbc11-23.7.0.25.01.jar!/:23.7.0.25.01]
	at oracle.jdbc.driver.T4CConnection.authenticateUserForLogon(T4CConnection.java:2231) ~[ojdbc11-23.7.0.25.01.jar!/:23.7.0.25.01]
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:1155) ~[ojdbc11-23.7.0.25.01.jar!/:23.7.0.25.01]
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1189) ~[ojdbc11-23.7.0.25.01.jar!/:23.7.0.25.01]
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:106) ~[ojdbc11-23.7.0.25.01.jar!/:23.7.0.25.01]
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:887) ~[ojdbc11-23.7.0.25.01.jar!/:23.7.0.25.01]
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:694) ~[ojdbc11-23.7.0.25.01.jar!/:23.7.0.25.01]
	at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:144) ~[HikariCP-6.3.3.jar!/:na]
	at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:370) ~[HikariCP-6.3.3.jar!/:na]
	at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:207) ~[HikariCP-6.3.3.jar!/:na]
	at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:488) ~[HikariCP-6.3.3.jar!/:na]
	at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:576) ~[HikariCP-6.3.3.jar!/:na]
	at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:97) ~[HikariCP-6.3.3.jar!/:na]
	at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:111) ~[HikariCP-6.3.3.jar!/:na]
	at org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:126) ~[hibernate-core-6.6.53.Final.jar!/:6.6.53.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess.obtainConnection(JdbcEnvironmentInitiator.java:485) ~[hibernate-core-6.6.53.Final.jar!/:6.6.53.Final]
	at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcIsolationDelegate.delegateWork(JdbcIsolationDelegate.java:61) ~[hibernate-core-6.6.53.Final.jar!/:6.6.53.Final]
	... 100 common frames omitted

2026-07-21T12:50:51.390-03:00  WARN 8 --- [SIAVL-gerencial-backend] [           main] org.hibernate.orm.deprecation            : HHH90000025: OracleDialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-07-21T12:50:51.400-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
	Database JDBC URL [Connecting through datasource 'HikariDataSource (null)']
	Database driver: undefined/unknown
	Database version: 19.0
	Autocommit mode: undefined/unknown
	Isolation level: undefined/unknown
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown
2026-07-21T12:50:52.045-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-07-21T12:50:52.050-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-07-21T12:50:53.659-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
2026-07-21T12:50:53.668-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] b.g.c.siavl.gerencial.RunApplication     : Started RunApplication in 14.024 seconds (process running for 20.614)
