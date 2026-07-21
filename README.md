[root@caddeapllx1369 p585600]# chown -R root:root /usr/lib/jvm/jdk-21.0.11+10
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]# alternatives --install /usr/bin/java java /usr/lib/jvm/jdk-21.0.11+10/bin/java 3
[root@caddeapllx1369 p585600]# alternatives --install /usr/bin/javac javac /usr/lib/jvm/jdk-21.0.11+10/bin/javac 3
[root@caddeapllx1369 p585600]# alternatives --install /usr/bin/keytool keytool /usr/lib/jvm/jdk-21.0.11+10/bin/keytool 3
falha ao ler a ligação /usr/bin/keytool: Arquivo ou diretório não encontrado
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]# java -version
openjdk version "21.0.11" 2026-04-21 LTS
OpenJDK Runtime Environment Temurin-21.0.11+10 (build 21.0.11+10-LTS)
OpenJDK 64-Bit Server VM Temurin-21.0.11+10 (build 21.0.11+10-LTS, mixed mode, sharing)
[root@caddeapllx1369 p585600]# cd /opt/batch/deploy
[root@caddeapllx1369 deploy]# java -jar sirsa-batch.jar --spring.profiles.active=des

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::               (v3.4.13)

2026-07-21T16:49:51.762-03:00  INFO 31507 --- [           main] b.g.c.s.s.SpringBatchApplication         : Starting SpringBatchApplication v01.17.00.05 using Java 21.0.11 with PID 31507 (/opt/b                     atch/deploy/sirsa-batch.jar started by root in /opt/batch/deploy)
2026-07-21T16:49:51.771-03:00  INFO 31507 --- [           main] b.g.c.s.s.SpringBatchApplication         : The following 1 profile is active: "des"
2026-07-21T16:49:52.364-03:00  INFO 31507 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-07-21T16:49:52.494-03:00  INFO 31507 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 87 ms. Found 33 JPA repository interfaces.
2026-07-21T16:49:53.299-03:00  INFO 31507 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-07-21T16:49:53.320-03:00  INFO 31507 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-07-21T16:49:53.320-03:00  INFO 31507 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.50]
2026-07-21T16:49:53.346-03:00  INFO 31507 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-07-21T16:49:53.346-03:00  INFO 31507 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1493 ms
2026-07-21T16:49:53.598-03:00  INFO 31507 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-07-21T16:49:53.839-03:00  INFO 31507 --- [           main] oracle.jdbc                              : entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@437ed416)
2026-07-21T16:49:53.841-03:00  INFO 31507 --- [           main] oracle.jdbc                              : traceId=374C40BA.
2026-07-21T16:49:53.843-03:00  INFO 31507 --- [           main] oracle.jdbc                              : Session Attributes:
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01clu04.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 17=0, 18=true, 2=30000, 20=true, 38=TLS, 23=40, 24=50, 40=false, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=f                     alse, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
TTIINIT enabled=false, TTC cookie enabled=false

2026-07-21T16:49:53.843-03:00  INFO 31507 --- [           main] oracle.jdbc                              : traceId=374C40BA, anoEnabled=true.
2026-07-21T16:49:53.843-03:00  INFO 31507 --- [           main] oracle.jdbc                              : Got Refused, SessionTraceId = 374C40BA
2026-07-21T16:49:53.843-03:00  INFO 31507 --- [           main] oracle.jdbc                              : Outbound interrupt timer cancelled null
2026-07-21T16:49:53.843-03:00  INFO 31507 --- [           main] oracle.jdbc                              : throwing

java.sql.SQLRecoverableException: ORA-12514: Não é possível estabelecer conexão com o banco de dados. O serviço orad01ng não está registrado no listener em host cnpexdadvm01clu04.extra.caixa.go                     v.br port 1521. (CONNECTION_ID=fJQN0jRYTYix8BbpKQyn2g==)
https://docs.oracle.com/error-help/db/ora-12514/
        at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1617) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:1139) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
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
        at org.springframework.jdbc.support.JdbcUtils.extractDatabaseMetaData(JdbcUtils.java:331) ~[spring-jdbc-6.2.15.jar!/:6.2.15]
        at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.getDatabaseDriver(PlatformPlaceholderDatabaseDriverResolver.java:140) ~[spring-boot-3.4.13.jar!/:3.4.13]
        at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.determinePlatform(PlatformPlaceholderDatabaseDriverResolver.java:132) ~[spring-boot-3.4.13.jar!/:3.4.13]
        at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.lambda$resolveAll$0(PlatformPlaceholderDatabaseDriverResolver.java:97) ~[spring-boot-3.4.13.jar!/:3.4.13]
        at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.resolveAll(PlatformPlaceholderDatabaseDriverResolver.java:122) ~[spring-boot-3.4.13.jar!/:3.4.13]
        at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.resolveAll(PlatformPlaceholderDatabaseDriverResolver.java:97) ~[spring-boot-3.4.13.jar!/:3.4.13]
        at org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer.resolveSchemaLocations(BatchDataSourceScriptDatabaseInitializer.java:83) ~[spring-boot-autoconfi                     gure-3.4.13.jar!/:3.4.13]
        at org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer.getSettings(BatchDataSourceScriptDatabaseInitializer.java:72) ~[spring-boot-autoconfigure-3.4.13                     .jar!/:3.4.13]
        at org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer.<init>(BatchDataSourceScriptDatabaseInitializer.java:47) ~[spring-boot-autoconfigure-3.4.13.jar!                     /:3.4.13]
        at org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration$DataSourceInitializerConfiguration.batchDataSourceInitializer(BatchAutoConfiguration.java:180) ~[spring-boot-autoc                     onfigure-3.4.13.jar!/:3.4.13]
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
        at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
        at org.springframework.beans.factory.support.SimpleInstantiationStrategy.lambda$instantiate$0(SimpleInstantiationStrategy.java:172) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiateWithFactoryMethod(SimpleInstantiationStrategy.java:89) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:169) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:653) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:645) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1375) ~[spring-beans-6.2.15.jar!/:6                     .2.15]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1205) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:569) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:529) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:339) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:373) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:337) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:315) ~[spring-beans-6.2.15.jar!/:6.2.15]
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
Caused by: oracle.net.ns.NetException: ORA-12514: Não é possível estabelecer conexão com o banco de dados. O serviço orad01ng não está registrado no listener em host cnpexdadvm01clu04.extra.cai                     xa.gov.br port 1521. (CONNECTION_ID=fJQN0jRYTYix8BbpKQyn2g==)
https://docs.oracle.com/error-help/db/ora-12514/
        at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:915) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:461) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:269) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.net.ns.NSProtocol.connect(NSProtocol.java:352) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3419) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:1018) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        ... 55 common frames omitted

2026-07-21T16:49:53.849-03:00  INFO 31507 --- [           main] oracle.jdbc                              : properties={LOCALE=pt_BR, DriverVersion=23.5.0.24.07, java.library.path: =/usr/java/pa                     ckages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =sirsa-batch.jar, java.version: =21.0.11}.
2026-07-21T16:49:54.851-03:00  WARN 31507 --- [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.                     springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/Hibernat                     eJpaConfiguration.class]: Failed to initialize dependency 'batchDataSourceInitializer' of LoadTimeWeaverAware bean 'entityManagerFactory': Error creating bean with name 'batchDataSourceInitiali                     zer' defined in class path resource [org/springframework/boot/autoconfigure/batch/BatchAutoConfiguration$DataSourceInitializerConfiguration.class]: Failed to instantiate [org.springframework.bo                     ot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer]: Factory method 'batchDataSourceInitializer' threw exception with message: Failed to determine DatabaseDriver
2026-07-21T16:49:54.854-03:00  INFO 31507 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2026-07-21T16:49:54.866-03:00  INFO 31507 --- [           main] .s.b.a.l.ConditionEvaluationReportLogger :

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2026-07-21T16:49:54.879-03:00 ERROR 31507 --- [           main] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/Hibe                     rnateJpaConfiguration.class]: Failed to initialize dependency 'batchDataSourceInitializer' of LoadTimeWeaverAware bean 'entityManagerFactory': Error creating bean with name 'batchDataSourceInit                     ializer' defined in class path resource [org/springframework/boot/autoconfigure/batch/BatchAutoConfiguration$DataSourceInitializerConfiguration.class]: Failed to instantiate [org.springframewor                     k.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer]: Factory method 'batchDataSourceInitializer' threw exception with message: Failed to determine DatabaseDriver
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
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'batchDataSourceInitializer' defined in class path resource [org/springframework/boot/autoconfi                     gure/batch/BatchAutoConfiguration$DataSourceInitializerConfiguration.class]: Failed to instantiate [org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer]: Facto                     ry method 'batchDataSourceInitializer' threw exception with message: Failed to determine DatabaseDriver
        at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:657) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:645) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1375) ~[spring-beans-6.2.15.jar!/:6                     .2.15]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1205) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:569) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:529) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:339) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:373) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:337) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-6.2.15.jar!/:6.2.15]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:315) ~[spring-beans-6.2.15.jar!/:6.2.15]
        ... 15 common frames omitted
Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer]: Factory method 'b                     atchDataSourceInitializer' threw exception with message: Failed to determine DatabaseDriver
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
        at org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer.resolveSchemaLocations(BatchDataSourceScriptDatabaseInitializer.java:83) ~[spring-boot-autoconfi                     gure-3.4.13.jar!/:3.4.13]
        at org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer.getSettings(BatchDataSourceScriptDatabaseInitializer.java:72) ~[spring-boot-autoconfigure-3.4.13                     .jar!/:3.4.13]
        at org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer.<init>(BatchDataSourceScriptDatabaseInitializer.java:47) ~[spring-boot-autoconfigure-3.4.13.jar!                     /:3.4.13]
        at org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration$DataSourceInitializerConfiguration.batchDataSourceInitializer(BatchAutoConfiguration.java:180) ~[spring-boot-autoc                     onfigure-3.4.13.jar!/:3.4.13]
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
Caused by: java.sql.SQLRecoverableException: ORA-12514: Não é possível estabelecer conexão com o banco de dados. O serviço orad01ng não está registrado no listener em host cnpexdadvm01clu04.ext                     ra.caixa.gov.br port 1521. (CONNECTION_ID=fJQN0jRYTYix8BbpKQyn2g==)
https://docs.oracle.com/error-help/db/ora-12514/
        at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1617) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:1139) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
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
Caused by: oracle.net.ns.NetException: ORA-12514: Não é possível estabelecer conexão com o banco de dados. O serviço orad01ng não está registrado no listener em host cnpexdadvm01clu04.extra.cai                     xa.gov.br port 1521. (CONNECTION_ID=fJQN0jRYTYix8BbpKQyn2g==)
https://docs.oracle.com/error-help/db/ora-12514/
        at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:915) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:461) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:269) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.net.ns.NSProtocol.connect(NSProtocol.java:352) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3419) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:1018) ~[ojdbc11-23.5.0.24.07.jar!/:23.5.0.24.07]
        ... 55 common frames omitted

[root@caddeapllx1369 deploy]#
