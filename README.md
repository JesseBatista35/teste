enJDK 64-Bit Server VM Temurin-21.0.11+10 (build 21.0.11+10-LTS, mixed mode, sharing)
[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]# alternatives --install /usr/bin/java java /usr/java/jdk-21.0.11+10/bin/java 210011
[root@caddeapllx1567 p585600]# alternatives --install /usr/bin/javac javac /usr/java/jdk-21.0.11+10/bin/javac 210011
[root@caddeapllx1567 p585600]# alternatives --install /usr/bin/keytool keytool /usr/java/jdk-21.0.11+10/bin/keytool 210011
[root@caddeapllx1567 p585600]# java -version
openjdk version "21.0.11" 2026-04-21 LTS
OpenJDK Runtime Environment Temurin-21.0.11+10 (build 21.0.11+10-LTS)
OpenJDK 64-Bit Server VM Temurin-21.0.11+10 (build 21.0.11+10-LTS, mixed mode, sharing)
[root@caddeapllx1567 p585600]# cd /opt/batch/deploy
[root@caddeapllx1567 deploy]# java -jar sirsa-batch.jar --spring.profiles.active=des

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::               (v3.4.13)

2026-07-23T15:19:03.735-03:00  INFO 59459 --- [           main] b.g.c.s.s.SpringBatchApplication         : Starting SpringBatchApplication v01.17.00.05 using Java 21.0.11 with PID 59459 (/opt/batch/deploy/sirsa-batch.jar started by root in /opt/batch/deploy)
2026-07-23T15:19:03.737-03:00  INFO 59459 --- [           main] b.g.c.s.s.SpringBatchApplication         : The following 1 profile is active: "des"
2026-07-23T15:19:04.403-03:00  INFO 59459 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-07-23T15:19:04.530-03:00  INFO 59459 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 96 ms. Found 33 JPA repository interfaces.
2026-07-23T15:19:05.349-03:00  INFO 59459 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-07-23T15:19:05.364-03:00  INFO 59459 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-07-23T15:19:05.365-03:00  INFO 59459 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.50]
2026-07-23T15:19:05.390-03:00  INFO 59459 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-07-23T15:19:05.391-03:00  INFO 59459 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1597 ms
2026-07-23T15:19:05.639-03:00  INFO 59459 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-07-23T15:19:06.994-03:00  WARN 59459 --- [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaConfiguration.class]: Failed to initialize dependency 'batchDataSourceInitializer' of LoadTimeWeaverAware bean 'entityManagerFactory': Error creating bean with name 'batchDataSourceInitializer' defined in class path resource [org/springframework/boot/autoconfigure/batch/BatchAutoConfiguration$DataSourceInitializerConfiguration.class]: Failed to instantiate [org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer]: Factory method 'batchDataSourceInitializer' threw exception with message: Failed to determine DatabaseDriver
2026-07-23T15:19:06.997-03:00  INFO 59459 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2026-07-23T15:19:07.008-03:00  INFO 59459 --- [           main] .s.b.a.l.ConditionEvaluationReportLogger :

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2026-07-23T15:19:07.020-03:00 ERROR 59459 --- [           main] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaConfiguration.class]: Failed to initialize dependency 'batchDataSourceInitializer' of LoadTimeWeaverAware bean 'entityManagerFactory': Error creating bean with name 'batchDataSourceInitializer' defined in class path resource [org/springframework/boot/autoconfigure/batch/BatchAutoConfiguration$DataSourceInitializerConfiguration.class]: Failed to instantiate [org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer]: Factory method 'batchDataSourceInitializer' threw exception with message: Failed to determine DatabaseDriver
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:328) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:207) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:973) ~[spring-context-6.2.15.jar!/:6.2.15]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:627) ~[spring-context-6.2.15.jar!/:6.2.15]
        at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.4.13.jar!/:3.4.13]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:752) ~[spring-boot-3.4.13.jar!/:3.4.13]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:439) ~[spring-boot-3.4.13.jar!/:3.4.13]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:318) ~[spring-boot-3.4.13.jar!/:3.4.13]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1361) ~[spring-boot-3.4.13.jar!/:3.4.13]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1350) ~[spring-boot-3.4.13.jar!/:3.4.13]
        at br.gov.caixa.sirsa.springbatch.SpringBatchApplication.main(SpringBatchApplication.java:14) ~[!/:01.17.00.05]
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
        at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
        at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:102) ~[sirsa-batch.jar:01.17.00.05]
        at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64) ~[sirsa-batch.jar:01.17.00.05]
        at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40) ~[sirsa-batch.jar:01.17.00.05]
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'batchDataSourceInitializer' defined in class path resource [org/springframework/boot/autoconfigure/batch/BatchAutoConfiguration$DataSourceInitializerConfiguration.class]: Failed to instantiate [org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer]: Factory method 'batchDataSourceInitializer' threw exception with message: Failed to determine DatabaseDriver
        at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:657) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:645) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1375) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1205) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:569) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:529) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:339) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:373) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:337) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:315) ~[spring-beans-6.2.15.jar!/:6.2.15]
        ... 15 common frames omitted
Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer]: Factory method 'batchDataSourceInitializer' threw exception with message: Failed to determine DatabaseDriver
        at org.springframework.beans.factory.support.SimpleInstantiationStrategy.lambda$instantiate$0(SimpleInstantiationStrategy.java:200) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiateWithFactoryMethod(SimpleInstantiationStrategy.java:89) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:169) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:653) ~[spring-beans-6.2.15.jar!/:6.2.15]
        ... 25 common frames omitted
Caused by: java.lang.IllegalStateException: Failed to determine DatabaseDriver
        at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.getDatabaseDriver(PlatformPlaceholderDatabaseDriverResolver.java:144) ~[spring-boot-3.4.13.jar!/:3.4.13]
        at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.determinePlatform(PlatformPlaceholderDatabaseDriverResolver.java:132) ~[spring-boot-3.4.13.jar!/:3.4.13]
        at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.lambda$resolveAll$0(PlatformPlaceholderDatabaseDriverResolver.java:97) ~[spring-boot-3.4.13.jar!/:3.4.13]
        at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.resolveAll(PlatformPlaceholderDatabaseDriverResolver.java:122) ~[spring-boot-3.4.13.jar!/:3.4.13]
        at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.resolveAll(PlatformPlaceholderDatabaseDriverResolver.java:97) ~[spring-boot-3.4.13.jar!/:3.4.13]
        at org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer.resolveSchemaLocations(BatchDataSourceScriptDatabaseInitializer.java:83) ~[spring-boot-autoconfigure-3.4.13.jar!/:3.4.13]
        at org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer.getSettings(BatchDataSourceScriptDatabaseInitializer.java:72) ~[spring-boot-autoconfigure-3.4.13.jar!/:3.4.13]
        at org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer.<init>(BatchDataSourceScriptDatabaseInitializer.java:47) ~[spring-boot-autoconfigure-3.4.13.jar!/:3.4.13]
        at org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration$DataSourceInitializerConfiguration.batchDataSourceInitializer(BatchAutoConfiguration.java:180) ~[spring-boot-autoconfigure-3.4.13.jar!/:3.4.13]
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
        at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
        at org.springframework.beans.factory.support.SimpleInstantiationStrategy.lambda$instantiate$0(SimpleInstantiationStrategy.java:172) ~[spring-beans-6.2.15.jar!/:6.2.15]
        ... 28 common frames omitted
Caused by: org.springframework.jdbc.support.MetaDataAccessException: Could not get Connection for extracting meta-data
        at org.springframework.jdbc.support.JdbcUtils.extractDatabaseMetaData(JdbcUtils.java:357) ~[spring-jdbc-6.2.15.jar!/:6.2.15]
        at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.getDatabaseDriver(PlatformPlaceholderDatabaseDriverResolver.java:140) ~[spring-boot-3.4.13.jar!/:3.4.13]
        ... 39 common frames omitted
Caused by: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection
        at org.springframework.jdbc.datasource.DataSourceUtils.getConnection(DataSourceUtils.java:84) ~[spring-jdbc-6.2.15.jar!/:6.2.15]
        at org.springframework.jdbc.support.JdbcUtils.extractDatabaseMetaData(JdbcUtils.java:331) ~[spring-jdbc-6.2.15.jar!/:6.2.15]
        ... 40 common frames omitted
Caused by: java.sql.SQLRecoverableException: ORA-01033: ORACLE initialization or shutdown in progress

https://docs.oracle.com/error-help/db/ora-01033/
        at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:709) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:604) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:599) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.jdbc.driver.T4CTTIfun.processError(T4CTTIfun.java:1809) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.jdbc.driver.T4CTTIoauthenticate.processError(T4CTTIoauthenticate.java:903) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:1100) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:408) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:530) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTHWithoutPassword(T4CTTIoauthenticate.java:2164) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTHWithoutUser(T4CTTIoauthenticate.java:2139) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1476) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1399) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.jdbc.driver.T4CConnection.authenticateWithPassword(T4CConnection.java:2050) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.jdbc.driver.T4CConnection.authenticateUserForLogon(T4CConnection.java:1989) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:1090) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1206) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:105) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:886) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:693) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:120) ~[HikariCP-5.1.0.jar!/:na]
        at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:360) ~[HikariCP-5.1.0.jar!/:na]
        at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:202) ~[HikariCP-5.1.0.jar!/:na]
        at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:461) ~[HikariCP-5.1.0.jar!/:na]
        at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:550) ~[HikariCP-5.1.0.jar!/:na]
        at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:98) ~[HikariCP-5.1.0.jar!/:na]
        at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:111) ~[HikariCP-5.1.0.jar!/:na]
        at org.springframework.jdbc.datasource.DataSourceUtils.fetchConnection(DataSourceUtils.java:160) ~[spring-jdbc-6.2.15.jar!/:6.2.15]
        at org.springframework.jdbc.datasource.DataSourceUtils.doGetConnection(DataSourceUtils.java:118) ~[spring-jdbc-6.2.15.jar!/:6.2.15]
        at org.springframework.jdbc.datasource.DataSourceUtils.getConnection(DataSourceUtils.java:81) ~[spring-jdbc-6.2.15.jar!/:6.2.15]
        ... 41 common frames omitted

[root@caddeapllx1567 deploy]#
