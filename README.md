Solicito suporte na esteira DevOps no SICCP-back, minha implementação que visa fazer acesso ao db2, depende da leitura das variáveis da library SICCP-BACK-DES. nomes das variáveis DB_USER e PASS_BD não estão sendo reconhecidas. creio que por ser um POD, tenha que criar um repositório do tipo config para que seja feita a leitura no deploy.


2026-09-10T13:53:05.0267392Z ##[section]Starting: Resumo da Release
2026-09-10T13:53:05.0270263Z ==============================================================================
2026-09-10T13:53:05.0270358Z Task         : Bash
2026-09-10T13:53:05.0270401Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-10T13:53:05.0270462Z Version      : 3.227.0
2026-09-10T13:53:05.0270515Z Author       : Microsoft Corporation
2026-09-10T13:53:05.0270564Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-10T13:53:05.0270641Z ==============================================================================
2026-09-10T13:53:05.8743023Z Generating script.
2026-09-10T13:53:05.8755640Z ========================== Starting Command Output ===========================
2026-09-10T13:53:05.8758823Z [command]/bin/bash /opt/ads-agent/_work/_temp/ae2b53a8-8588-4051-b0e5-753a83efe777.sh
2026-09-10T13:53:05.8803336Z URL do Projeto no OKD: api.nprd.caixa:6443/console/project/siccp-des/overview
2026-09-10T13:53:05.8806068Z /opt/ads-agent/_work/_temp/ae2b53a8-8588-4051-b0e5-753a83efe777.sh: line 82: ISTIO_INJECTION: comando não encontrado
2026-09-10T13:53:05.8812585Z /opt/ads-agent/_work/_temp/ae2b53a8-8588-4051-b0e5-753a83efe777.sh: line 92: CONTEXTO_JBOSS: comando não encontrado
2026-09-10T13:53:05.9735804Z APP Publicada na URL: https://siccp-back-des.apps.nprd.caixa
2026-09-10T13:53:05.9802651Z ##[section]Finishing: Resumo da Release


2026-09-10T13:53:05.0267392Z ##[section]Starting: Resumo da Release
2026-09-10T13:53:05.0270263Z ==============================================================================
2026-09-10T13:53:05.0270358Z Task         : Bash
2026-09-10T13:53:05.0270401Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-10T13:53:05.0270462Z Version      : 3.227.0
2026-09-10T13:53:05.0270515Z Author       : Microsoft Corporation
2026-09-10T13:53:05.0270564Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-10T13:53:05.0270641Z ==============================================================================
2026-09-10T13:53:05.8743023Z Generating script.
2026-09-10T13:53:05.8755640Z ========================== Starting Command Output ===========================
2026-09-10T13:53:05.8758823Z [command]/bin/bash /opt/ads-agent/_work/_temp/ae2b53a8-8588-4051-b0e5-753a83efe777.sh
2026-09-10T13:53:05.8803336Z URL do Projeto no OKD: api.nprd.caixa:6443/console/project/siccp-des/overview
2026-09-10T13:53:05.8806068Z /opt/ads-agent/_work/_temp/ae2b53a8-8588-4051-b0e5-753a83efe777.sh: line 82: ISTIO_INJECTION: comando não encontrado
2026-09-10T13:53:05.8812585Z /opt/ads-agent/_work/_temp/ae2b53a8-8588-4051-b0e5-753a83efe777.sh: line 92: CONTEXTO_JBOSS: comando não encontrado
2026-09-10T13:53:05.9735804Z APP Publicada na URL: https://siccp-back-des.apps.nprd.caixa
2026-09-10T13:53:05.9802651Z ##[section]Finishing: Resumo da Release


exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=siccp-back -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=siccp-back -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/siccp-0.0.1-SNAPSHOT.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.1.5)

2026-09-10T10:51:58.531-03:00  INFO 8 --- [           main] br.gov.caixa.siccp.SiccpApplication      : Starting SiccpApplication v0.0.1-SNAPSHOT using Java 17.0.7 with PID 8 (/deployments/siccp-0.0.1-SNAPSHOT.jar started by 1001 in /deployments)
2026-09-10T10:51:58.590-03:00  INFO 8 --- [           main] br.gov.caixa.siccp.SiccpApplication      : The following 1 profile is active: "des"
java.lang.NoSuchMethodError: 'javax.servlet.ServletContext org.springframework.web.context.WebApplicationContext.getServletContext()'
	at co.elastic.apm.agent.springwebmvc.SpringServiceNameInstrumentation$SpringServiceNameAdvice.afterInitPropertySources(SpringServiceNameInstrumentation.java:82)
	at org.springframework.web.context.support.GenericWebApplicationContext.initPropertySources(GenericWebApplicationContext.java:214)
	at org.springframework.context.support.AbstractApplicationContext.prepareRefresh(AbstractApplicationContext.java:667)
	at org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext.prepareRefresh(AnnotationConfigServletWebServerApplicationContext.java:195)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583)
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146)
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:738)
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:440)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:316)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295)
	at br.gov.caixa.siccp.SiccpApplication.main(SiccpApplication.java:10)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:49)
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:95)
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:58)
	at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65)
2026-09-10T10:52:00.501-03:00  INFO 8 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-09-10T10:52:00.525-03:00  INFO 8 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 14 ms. Found 0 JPA repository interfaces.
2026-09-10T10:52:02.127-03:00  INFO 8 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2026-09-10T10:52:02.191-03:00  INFO 8 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-09-10T10:52:02.192-03:00  INFO 8 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.15]
2026-09-10T10:52:02.332-03:00  INFO 8 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-09-10T10:52:02.333-03:00  INFO 8 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 3634 ms
java.lang.NoSuchMethodError: 'javax.servlet.ServletContext org.springframework.web.context.WebApplicationContext.getServletContext()'
	at co.elastic.apm.agent.springwebmvc.SpringServiceNameInstrumentation$SpringServiceNameAdvice.afterInitPropertySources(SpringServiceNameInstrumentation.java:82)
	at org.springframework.web.context.support.GenericWebApplicationContext.initPropertySources(GenericWebApplicationContext.java:214)
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.createWebServer(ServletWebServerApplicationContext.java:198)
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.onRefresh(ServletWebServerApplicationContext.java:161)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:610)
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146)
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:738)
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:440)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:316)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295)
	at br.gov.caixa.siccp.SiccpApplication.main(SiccpApplication.java:10)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:49)
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:95)
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:58)
	at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65)
2026-09-10T10:52:03.532-03:00  INFO 8 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2026-09-10T10:52:03.711-03:00  INFO 8 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.2.13.Final
2026-09-10T10:52:03.714-03:00  INFO 8 --- [           main] org.hibernate.cfg.Environment            : HHH000406: Using bytecode reflection optimizer
2026-09-10T10:52:04.404-03:00  INFO 8 --- [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-09-10T10:52:04.436-03:00  INFO 8 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-09-10T10:52:06.816-03:00 ERROR 8 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Exception during pool initialization.

com.ibm.db2.jcc.am.SqlInvalidAuthorizationSpecException: [jcc][t4][2016][11252][4.32.28] Connection authorization failure occurred.  Reason: User ID invalid. ERRORCODE=-4214, SQLSTATE=28000
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
	at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:138) ~[HikariCP-5.0.1.jar!/:na]
	at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:359) ~[HikariCP-5.0.1.jar!/:na]
	at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:201) ~[HikariCP-5.0.1.jar!/:na]
	at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:470) ~[HikariCP-5.0.1.jar!/:na]
	at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:561) ~[HikariCP-5.0.1.jar!/:na]
	at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:100) ~[HikariCP-5.0.1.jar!/:na]
	at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:112) ~[HikariCP-5.0.1.jar!/:na]
	at org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess.obtainConnection(JdbcEnvironmentInitiator.java:437) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcIsolationDelegate.delegateWork(JdbcIsolationDelegate.java:61) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentUsingJdbcMetadata(JdbcEnvironmentInitiator.java:279) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:193) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:69) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:119) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:264) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:239) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:216) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.boot.model.relational.Database.<init>(Database.java:45) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.getDatabase(InFlightMetadataCollectorImpl.java:231) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:199) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:169) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1383) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1454) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:75) ~[spring-orm-6.0.13.jar!/:6.0.13]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:376) ~[spring-orm-6.0.13.jar!/:6.0.13]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:409) ~[spring-orm-6.0.13.jar!/:6.0.13]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:396) ~[spring-orm-6.0.13.jar!/:6.0.13]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:352) ~[spring-orm-6.0.13.jar!/:6.0.13]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1817) ~[spring-beans-6.0.13.jar!/:6.0.13]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1766) ~[spring-beans-6.0.13.jar!/:6.0.13]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:598) ~[spring-beans-6.0.13.jar!/:6.0.13]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[spring-beans-6.0.13.jar!/:6.0.13]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:325) ~[spring-beans-6.0.13.jar!/:6.0.13]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.0.13.jar!/:6.0.13]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:323) ~[spring-beans-6.0.13.jar!/:6.0.13]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) ~[spring-beans-6.0.13.jar!/:6.0.13]
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1166) ~[spring-context-6.0.13.jar!/:6.0.13]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:940) ~[spring-context-6.0.13.jar!/:6.0.13]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:616) ~[spring-context-6.0.13.jar!/:6.0.13]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.1.5.jar!/:3.1.5]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:738) ~[spring-boot-3.1.5.jar!/:3.1.5]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:440) ~[spring-boot-3.1.5.jar!/:3.1.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:316) ~[spring-boot-3.1.5.jar!/:3.1.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306) ~[spring-boot-3.1.5.jar!/:3.1.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295) ~[spring-boot-3.1.5.jar!/:3.1.5]
	at br.gov.caixa.siccp.SiccpApplication.main(SiccpApplication.java:10) ~[classes!/:0.0.1-SNAPSHOT]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:49) ~[siccp-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:95) ~[siccp-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:58) ~[siccp-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
	at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65) ~[siccp-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]

2026-09-10T10:52:06.822-03:00  WARN 8 --- [           main] o.h.e.j.e.i.JdbcEnvironmentInitiator     : HHH000342: Could not obtain connection to query metadata

java.lang.NullPointerException: Cannot invoke "org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(java.sql.SQLException, String)" because the return value of "org.hibernate.resource.transaction.backend.jdbc.internal.JdbcIsolationDelegate.sqlExceptionHelper()" is null
	at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcIsolationDelegate.delegateWork(JdbcIsolationDelegate.java:116) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentUsingJdbcMetadata(JdbcEnvironmentInitiator.java:279) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:193) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:69) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:119) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:264) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:239) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:216) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.boot.model.relational.Database.<init>(Database.java:45) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.getDatabase(InFlightMetadataCollectorImpl.java:231) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:199) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:169) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1383) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1454) ~[hibernate-core-6.2.13.Final.jar!/:6.2.13.Final]
	at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:75) ~[spring-orm-6.0.13.jar!/:6.0.13]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:376) ~[spring-orm-6.0.13.jar!/:6.0.13]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:409) ~[spring-orm-6.0.13.jar!/:6.0.13]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:396) ~[spring-orm-6.0.13.jar!/:6.0.13]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:352) ~[spring-orm-6.0.13.jar!/:6.0.13]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1817) ~[spring-beans-6.0.13.jar!/:6.0.13]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1766) ~[spring-beans-6.0.13.jar!/:6.0.13]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:598) ~[spring-beans-6.0.13.jar!/:6.0.13]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[spring-beans-6.0.13.jar!/:6.0.13]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:325) ~[spring-beans-6.0.13.jar!/:6.0.13]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.0.13.jar!/:6.0.13]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:323) ~[spring-beans-6.0.13.jar!/:6.0.13]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) ~[spring-beans-6.0.13.jar!/:6.0.13]
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1166) ~[spring-context-6.0.13.jar!/:6.0.13]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:940) ~[spring-context-6.0.13.jar!/:6.0.13]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:616) ~[spring-context-6.0.13.jar!/:6.0.13]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.1.5.jar!/:3.1.5]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:738) ~[spring-boot-3.1.5.jar!/:3.1.5]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:440) ~[spring-boot-3.1.5.jar!/:3.1.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:316) ~[spring-boot-3.1.5.jar!/:3.1.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306) ~[spring-boot-3.1.5.jar!/:3.1.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295) ~[spring-boot-3.1.5.jar!/:3.1.5]
	at br.gov.caixa.siccp.SiccpApplication.main(SiccpApplication.java:10) ~[classes!/:0.0.1-SNAPSHOT]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:49) ~[siccp-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:95) ~[siccp-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:58) ~[siccp-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
	at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65) ~[siccp-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]

2026-09-10T10:52:06.841-03:00  WARN 8 --- [           main] org.hibernate.orm.deprecation            : HHH90000025: DB2Dialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-09-10T10:52:07.437-03:00  INFO 8 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-09-10T10:52:07.491-03:00  INFO 8 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
DB_USER env: nullnull
PASS_DB env: null
2026-09-10T10:52:08.600-03:00  INFO 8 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will secure any request with [org.springframework.security.web.session.DisableEncodeUrlFilter@28cb86b2, org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter@22ae905f, org.springframework.security.web.context.SecurityContextHolderFilter@629b780f, org.springframework.security.web.header.HeaderWriterFilter@7404ddca, org.springframework.web.filter.CorsFilter@748904e8, org.springframework.security.web.authentication.logout.LogoutFilter@7fc7152e, org.springframework.security.oauth2.server.resource.web.authentication.BearerTokenAuthenticationFilter@19b9f903, org.springframework.security.web.savedrequest.RequestCacheAwareFilter@609b041c, org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter@7e2c6702, org.springframework.security.web.authentication.AnonymousAuthenticationFilter@4fbaa7f5, org.springframework.security.web.session.SessionManagementFilter@91a2543, org.springframework.security.web.access.ExceptionTranslationFilter@4ebd6fd6, org.springframework.security.web.access.intercept.AuthorizationFilter@1a717d79]
2026-09-10T10:52:09.291-03:00  INFO 8 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2026-09-10T10:52:09.301-03:00  INFO 8 --- [           main] br.gov.caixa.siccp.SiccpApplication      : Started SiccpApplication in 12.002 seconds (process running for 15.164)
2026-09-10 10:52:26,419 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 10:52:41,320 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 10:52:41,320 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 10:52:56,338 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 10:52:56,338 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 10:53:12,438 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 10:53:12,439 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 10:53:31,320 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 10:53:31,320 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 10:53:56,203 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 10:53:56,204 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 10:54:26,898 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 10:54:26,899 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 10:55:07,314 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 10:55:07,315 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 10:55:58,009 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 10:55:58,009 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 10:56:46,589 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 10:56:46,590 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 10:57:36,473 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 10:57:36,474 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 10:57:56,438 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 10:58:30,020 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 10:58:30,021 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 10:59:19,779 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 10:59:19,779 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:00:08,389 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:00:08,389 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:00:58,413 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:00:58,413 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:01:46,761 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:01:46,762 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:02:34,994 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:02:34,994 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:03:25,085 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:03:25,086 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:03:26,469 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 11:04:19,488 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:04:19,488 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:05:07,533 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:05:07,533 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:06:00,080 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:06:00,080 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:06:53,138 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:06:53,139 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:07:41,910 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:07:41,910 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:08:32,949 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:08:32,949 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:08:56,490 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 11:09:21,338 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:09:21,339 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:10:13,998 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:10:13,998 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:11:07,568 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:11:07,568 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:11:57,802 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:11:57,802 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:12:48,574 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:12:48,575 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:13:37,250 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:13:37,250 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:14:26,521 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 11:14:30,688 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:14:30,689 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:15:22,305 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:15:22,306 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:16:09,818 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:16:09,818 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:17:02,426 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:17:02,427 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:17:56,006 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:17:56,006 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:18:45,682 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:18:45,683 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:19:33,548 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:19:33,549 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:19:56,540 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 11:20:25,725 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:20:25,726 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:21:15,942 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:21:15,942 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:22:03,659 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:22:03,659 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:22:57,081 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:22:57,082 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:23:48,976 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:23:48,976 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:24:43,061 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:24:43,061 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:25:26,570 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 11:25:33,354 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:25:33,354 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:26:26,474 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:26:26,474 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:27:20,866 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:27:20,866 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:28:12,188 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:28:12,188 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:29:00,899 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:29:00,900 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:29:51,860 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:29:51,860 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:30:43,289 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:30:43,290 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:30:56,601 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 11:31:32,323 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:31:32,324 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:32:21,787 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:32:21,788 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:33:12,826 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:33:12,827 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:34:03,212 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:34:03,213 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:34:57,612 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:34:57,613 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:35:50,903 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:35:50,903 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:36:26,626 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 11:36:43,829 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:36:43,830 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:37:35,990 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:37:35,991 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:38:30,404 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:38:30,404 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:39:23,914 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:39:23,915 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:40:18,294 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:40:18,295 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:41:07,707 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:41:07,708 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:41:56,643 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 11:41:59,003 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:41:59,004 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:42:46,567 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:42:46,567 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:43:34,499 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:43:34,499 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:44:24,524 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:44:24,525 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:45:16,168 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:45:16,168 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:46:09,000 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:46:09,000 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:46:58,400 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:46:58,401 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:47:26,672 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 11:47:46,672 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:47:46,673 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:48:38,413 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:48:38,414 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:49:30,794 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:49:30,794 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:50:24,885 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:50:24,886 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:51:13,747 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:51:13,748 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:52:01,307 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:52:01,307 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:52:49,675 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:52:49,676 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:52:56,699 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 11:53:43,969 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:53:43,970 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:54:38,172 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:54:38,173 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:55:31,931 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:55:31,932 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:56:21,068 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:56:21,069 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:57:11,687 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:57:11,687 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:58:03,844 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:58:03,845 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:58:26,729 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 11:58:53,925 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:58:53,925 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 11:59:42,679 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 11:59:42,679 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:00:35,335 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:00:35,335 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:01:26,029 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:01:26,029 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:02:18,331 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:02:18,331 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:03:12,514 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:03:12,515 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:03:56,759 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 12:04:02,795 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:04:02,795 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:04:56,995 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:04:56,995 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:05:45,586 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:05:45,587 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:06:39,643 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:06:39,644 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:07:27,625 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:07:27,626 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:08:21,122 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:08:21,123 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:09:11,205 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:09:11,206 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:09:26,778 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 12:10:03,357 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:10:03,357 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:10:55,574 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:10:55,574 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:11:48,059 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:11:48,059 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:12:41,947 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:12:41,947 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:13:32,363 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:13:32,363 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:14:20,305 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:14:20,305 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:14:56,796 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 12:15:13,642 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:15:13,642 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:16:04,365 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:16:04,366 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:16:51,951 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:16:51,952 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:17:39,935 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:17:39,936 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:18:28,233 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:18:28,234 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:19:20,830 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:19:20,830 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:20:09,728 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:20:09,729 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:20:26,826 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 12:20:57,801 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:20:57,801 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:21:51,315 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:21:51,315 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:22:43,524 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:22:43,524 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:23:33,103 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:23:33,103 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:24:20,647 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:24:20,648 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:25:14,122 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:25:14,123 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:25:56,846 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 12:26:04,028 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:26:04,029 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:26:56,870 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:26:56,871 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:27:47,213 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:27:47,213 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:28:40,135 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:28:40,135 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:29:33,047 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:29:33,048 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:30:23,834 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:30:23,835 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:31:13,224 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:31:13,224 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:31:26,863 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 12:32:05,435 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:32:05,436 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:32:57,127 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:32:57,127 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:33:45,254 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:33:45,254 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:34:38,288 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:34:38,289 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:35:27,958 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:35:27,958 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:36:16,882 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:36:16,883 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:36:56,895 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 12:37:06,314 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:37:06,314 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:38:00,847 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:38:00,847 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:38:48,617 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:38:48,617 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:39:37,028 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:39:37,028 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:40:25,137 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:40:25,137 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:41:16,213 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:41:16,213 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:42:05,010 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:42:05,010 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:42:26,923 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 12:42:57,788 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:42:57,789 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:43:47,801 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:43:47,802 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:44:40,358 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:44:40,358 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:45:33,107 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:45:33,108 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:46:23,044 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:46:23,045 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:47:16,890 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:47:16,890 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:47:56,954 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 12:48:08,489 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:48:08,489 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:49:00,706 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:49:00,706 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:49:51,689 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:49:51,689 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:50:42,910 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:50:42,910 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:51:36,941 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:51:36,941 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:52:25,406 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:52:25,406 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:53:15,153 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:53:15,153 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:53:26,983 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 12:54:06,418 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:54:06,419 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:55:00,358 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:55:00,359 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:55:54,287 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:55:54,288 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:56:43,727 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:56:43,728 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:57:38,117 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:57:38,118 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:58:28,749 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:58:28,750 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 12:58:56,989 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 12:59:17,983 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 12:59:17,983 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:00:08,922 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:00:08,922 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:01:02,334 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:01:02,334 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:01:54,950 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:01:54,951 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:02:45,987 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:02:45,987 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:03:34,557 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:03:34,557 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:04:27,010 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 13:04:28,554 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:04:28,554 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:05:21,589 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:05:21,589 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:06:10,353 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:06:10,353 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:07:00,489 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:07:00,489 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:07:54,584 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:07:54,584 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:08:47,080 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:08:47,081 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:09:41,098 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:09:41,099 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:09:57,039 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 13:10:31,431 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:10:31,432 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:11:25,787 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:11:25,787 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:12:14,088 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:12:14,089 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:13:06,961 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:13:06,962 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:13:57,538 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:13:57,538 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:14:45,925 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:14:45,925 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:15:27,070 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 13:15:35,959 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:15:35,959 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:16:28,765 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:16:28,765 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:17:19,203 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:17:19,203 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:18:08,104 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:18:08,105 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:18:59,882 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:18:59,883 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:19:51,109 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:19:51,110 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:20:45,711 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:20:45,712 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:20:57,098 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 13:21:33,168 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:21:33,168 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:22:25,614 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:22:25,615 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:23:13,648 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:23:13,649 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:24:03,544 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:24:03,544 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:24:56,397 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:24:56,398 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:25:45,199 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:25:45,199 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:26:27,128 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 13:26:34,814 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:26:34,814 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:27:27,580 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:27:27,580 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:28:20,392 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:28:20,392 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:29:09,880 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:29:09,881 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:30:00,019 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:30:00,020 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:30:49,721 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:30:49,721 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:31:40,035 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:31:40,035 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:31:57,156 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 13:32:27,833 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:32:27,833 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:33:15,720 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:33:15,721 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:34:05,478 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:34:05,479 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:34:55,750 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:34:55,751 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:35:44,819 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:35:44,819 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:36:36,040 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:36:36,040 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:37:27,188 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 13:37:28,042 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:37:28,042 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:38:18,688 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:38:18,689 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:39:09,546 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:39:09,547 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:40:02,028 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:40:02,028 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:40:56,363 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:40:56,363 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:41:46,265 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:41:46,265 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:42:37,969 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:42:37,969 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:42:57,203 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 13:43:26,642 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:43:26,643 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:44:16,406 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:44:16,406 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:45:10,612 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:45:10,613 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:46:02,551 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:46:02,551 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:46:51,052 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:46:51,052 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:47:39,435 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:47:39,436 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:48:27,224 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 13:48:28,348 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:48:28,348 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:49:18,289 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:49:18,289 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:50:08,297 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:50:08,297 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:51:01,621 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:51:01,621 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:51:55,558 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:51:55,559 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:52:47,717 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:52:47,718 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:53:40,248 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:53:40,249 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:53:57,253 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 13:54:33,243 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:54:33,243 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:55:21,112 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:55:21,112 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:56:15,051 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:56:15,052 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:57:02,829 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:57:02,829 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:57:55,798 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:57:55,799 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:58:44,977 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:58:44,977 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 13:59:27,276 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-10 13:59:32,705 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 13:59:32,705 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 14:00:25,084 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 14:00:25,085 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 14:01:16,074 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 14:01:16,074 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-10 14:02:07,498 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-10 14:02:07,499 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out

OKD


Jesse Mouta Pereira Batista

Administrator
Home
Overview
Projects
Search
API Explorer
Events
Operators
OperatorHub
Installed Operators
Workloads
Pods
Deployments
DeploymentConfigs
StatefulSets
Secrets
ConfigMaps
CronJobs
Jobs
DaemonSets
ReplicaSets
ReplicationControllers
HorizontalPodAutoscalers
PodDisruptionBudgets
Networking
Storage
Builds
Observe
Compute
User Management
Administration

Project: siccp-des
Pods
Pod details
Pod
P
siccp-back-des-60-qbfjm
Running

Actions
Details
Metrics
YAML
Environment
Logs
Events
Terminal
Info alert:Environment variables set from parent
View environment for resource ReplicationController
RC
siccp-back-des-60
Container:

Container
C
siccp-back-des
Single values (env)
NameValue
TZ
America/Sao_Paulo
INSTANCE_IP
FieldRef
status.podIP
JAVA_OPTIONS_APPEND
-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks
JAVA_OPTIONS
-Dserver.address=0.0.0.0 -Dserver.port=8080
JAVA_OPTS_MONITORING
-javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=siccp-back -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=siccp-back
USER
SCCPDS02
All values from existing ConfigMaps or Secrets (envFrom)
ConfigMap/SecretPrefix (optional)
ConfigMap/Secret

