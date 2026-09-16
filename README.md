2026-09-09T19:30:33.4425391Z ##[section]Starting: Logs da Aplicação
2026-09-09T19:30:33.4428640Z ==============================================================================
2026-09-09T19:30:33.4428718Z Task         : Bash
2026-09-09T19:30:33.4428793Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-09T19:30:33.4428857Z Version      : 3.227.0
2026-09-09T19:30:33.4428900Z Author       : Microsoft Corporation
2026-09-09T19:30:33.4428980Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-09T19:30:33.4429053Z ==============================================================================
2026-09-09T19:30:33.5914439Z Generating script.
2026-09-09T19:30:33.5925199Z ========================== Starting Command Output ===========================
2026-09-09T19:30:33.5932413Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/b683db7b-d5b8-4d7f-99cf-61950910836f.sh
2026-09-09T19:30:33.5984809Z + shopt -s expand_aliases
2026-09-09T19:30:33.5986225Z + [[ -n okd4_nprd ]]
2026-09-09T19:30:33.5986446Z + [[ okd4_nprd =~ ocp ]]
2026-09-09T19:30:33.5986574Z + [[ -n okd4_nprd ]]
2026-09-09T19:30:33.5986707Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-09-09T19:30:33.5986887Z + app=sicfd-monitoramento-des
2026-09-09T19:30:33.5987017Z + oc version
2026-09-09T19:30:33.6708084Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-09-09T19:30:33.6708349Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-09-09T19:30:33.6708563Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-09-09T19:30:33.6735548Z ++ oc get pod -l name=sicfd-monitoramento-des -n sicfd-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-09T19:30:33.6737019Z ++ tac
2026-09-09T19:30:33.6737548Z ++ grep -v '^$'
2026-09-09T19:30:33.6737745Z ++ head -n1
2026-09-09T19:30:33.7811658Z + last_pod=sicfd-monitoramento-des-90-w79z8
2026-09-09T19:30:33.7811966Z + echo 'Logs do POD: sicfd-monitoramento-des-90-w79z8'
2026-09-09T19:30:33.7812186Z + oc logs sicfd-monitoramento-des-90-w79z8 -c sicfd-monitoramento-des -n sicfd-des
2026-09-09T19:30:33.7812430Z Logs do POD: sicfd-monitoramento-des-90-w79z8
2026-09-09T19:30:33.8655377Z exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Doracle.jdbc.javaNetNio=false -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/monitora-0.0.1-SNAPSHOT.jar
2026-09-09T19:30:33.8655561Z 
2026-09-09T19:30:33.8655710Z   .   ____          _            __ _ _
2026-09-09T19:30:33.8655902Z  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
2026-09-09T19:30:33.8656084Z ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
2026-09-09T19:30:33.8656222Z  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
2026-09-09T19:30:33.8656370Z   '  |____| .__|_| |_|_| |_\__, | / / / /
2026-09-09T19:30:33.8656511Z  =========|_|==============|___/=/_/_/_/
2026-09-09T19:30:33.8656674Z  :: Spring Boot ::               (v2.7.13)
2026-09-09T19:30:33.8656723Z 
2026-09-09T19:30:33.8657251Z 2026-09-09 16:28:58.172  INFO 8 --- [           main] b.g.caixa.monitora.MonitoraApplication   : Starting MonitoraApplication v0.0.1-SNAPSHOT using Java 11.0.14 on sicfd-monitoramento-des-90-w79z8 with PID 8 (/deployments/monitora-0.0.1-SNAPSHOT.jar started by 1001 in /deployments)
2026-09-09T19:30:33.8657693Z 2026-09-09 16:28:58.262  INFO 8 --- [           main] b.g.caixa.monitora.MonitoraApplication   : No active profile set, falling back to 1 default profile: "default"
2026-09-09T19:30:33.8658028Z 2026-09-09 16:29:03.273  INFO 8 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2026-09-09T19:30:33.8658334Z 2026-09-09 16:29:03.282  INFO 8 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-09-09T19:30:33.8658659Z 2026-09-09 16:29:03.282  INFO 8 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.76]
2026-09-09T19:30:33.8658981Z 2026-09-09 16:29:03.472  INFO 8 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-09-09T19:30:33.8659704Z 2026-09-09 16:29:03.472  INFO 8 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 4905 ms
2026-09-09T19:30:33.8660024Z 2026-09-09 16:29:04.577  INFO 8 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-09-09T19:30:33.8660306Z 2026-09-09 16:29:07.994 ERROR 8 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Exception during pool initialization.
2026-09-09T19:30:33.8660502Z 
2026-09-09T19:30:33.8660725Z java.sql.SQLException: ORA-01017: invalid username/password; logon denied
2026-09-09T19:30:33.8660794Z 
2026-09-09T19:30:33.8661051Z 	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:630) ~[ojdbc8-21.5.0.0.jar!/:21.5.0.0.0]
2026-09-09T19:30:33.8661369Z 	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:559) ~[ojdbc8-21.5.0.0.jar!/:21.5.0.0.0]
2026-09-09T19:30:33.8661643Z 	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:554) ~[ojdbc8-21.5.0.0.jar!/:21.5.0.0.0]
2026-09-09T19:30:33.8661959Z 	at oracle.jdbc.driver.T4CTTIfun.processError(T4CTTIfun.java:1376) ~[ojdbc8-21.5.0.0.jar!/:21.5.0.0.0]
2026-09-09T19:30:33.8662285Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.processError(T4CTTIoauthenticate.java:782) ~[ojdbc8-21.5.0.0.jar!/:21.5.0.0.0]
2026-09-09T19:30:33.8662599Z 	at oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:771) ~[ojdbc8-21.5.0.0.jar!/:21.5.0.0.0]
2026-09-09T19:30:33.8662890Z 	at oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:299) ~[ojdbc8-21.5.0.0.jar!/:21.5.0.0.0]
2026-09-09T19:30:33.8663250Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:450) ~[ojdbc8-21.5.0.0.jar!/:21.5.0.0.0]
2026-09-09T19:30:33.8663672Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTHWithO5Logon(T4CTTIoauthenticate.java:1553) ~[ojdbc8-21.5.0.0.jar!/:21.5.0.0.0]
2026-09-09T19:30:33.8663977Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1302) ~[ojdbc8-21.5.0.0.jar!/:21.5.0.0.0]
2026-09-09T19:30:33.8664402Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1256) ~[ojdbc8-21.5.0.0.jar!/:21.5.0.0.0]
2026-09-09T19:30:33.8664831Z 	at oracle.jdbc.driver.T4CConnection.authenticateWithPassword(T4CConnection.java:1435) ~[ojdbc8-21.5.0.0.jar!/:21.5.0.0.0]
2026-09-09T19:30:33.8665168Z 	at oracle.jdbc.driver.T4CConnection.authenticateUserForLogon(T4CConnection.java:1384) ~[ojdbc8-21.5.0.0.jar!/:21.5.0.0.0]
2026-09-09T19:30:33.8665481Z 	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:667) ~[ojdbc8-21.5.0.0.jar!/:21.5.0.0.0]
2026-09-09T19:30:33.8665826Z 	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1042) ~[ojdbc8-21.5.0.0.jar!/:21.5.0.0.0]
2026-09-09T19:30:33.8666207Z 	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:90) ~[ojdbc8-21.5.0.0.jar!/:21.5.0.0.0]
2026-09-09T19:30:33.8666490Z 	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:733) ~[ojdbc8-21.5.0.0.jar!/:21.5.0.0.0]
2026-09-09T19:30:33.8666793Z 	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:649) ~[ojdbc8-21.5.0.0.jar!/:21.5.0.0.0]
2026-09-09T19:30:33.8667098Z 	at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:138) ~[HikariCP-4.0.3.jar!/:na]
2026-09-09T19:30:33.8667395Z 	at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:364) ~[HikariCP-4.0.3.jar!/:na]
2026-09-09T19:30:33.8667676Z 	at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:206) ~[HikariCP-4.0.3.jar!/:na]
2026-09-09T19:30:33.8668002Z 	at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:476) ~[HikariCP-4.0.3.jar!/:na]
2026-09-09T19:30:33.8668308Z 	at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:561) ~[HikariCP-4.0.3.jar!/:na]
2026-09-09T19:30:33.8668604Z 	at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:115) ~[HikariCP-4.0.3.jar!/:na]
2026-09-09T19:30:33.8668901Z 	at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:112) ~[HikariCP-4.0.3.jar!/:na]
2026-09-09T19:30:33.8669361Z 	at org.springframework.jdbc.datasource.DataSourceUtils.fetchConnection(DataSourceUtils.java:160) ~[spring-jdbc-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8669708Z 	at org.springframework.jdbc.datasource.DataSourceUtils.doGetConnection(DataSourceUtils.java:118) ~[spring-jdbc-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8670047Z 	at org.springframework.jdbc.datasource.DataSourceUtils.getConnection(DataSourceUtils.java:81) ~[spring-jdbc-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8670382Z 	at org.springframework.jdbc.support.JdbcUtils.extractDatabaseMetaData(JdbcUtils.java:337) ~[spring-jdbc-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8670828Z 	at org.springframework.boot.jdbc.DatabaseDriver.fromDataSource(DatabaseDriver.java:335) ~[spring-boot-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8671208Z 	at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.getDatabaseDriver(PlatformPlaceholderDatabaseDriverResolver.java:137) ~[spring-boot-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8671650Z 	at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.determinePlatform(PlatformPlaceholderDatabaseDriverResolver.java:131) ~[spring-boot-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8672085Z 	at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.lambda$resolveAll$0(PlatformPlaceholderDatabaseDriverResolver.java:96) ~[spring-boot-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8672520Z 	at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.resolveAll(PlatformPlaceholderDatabaseDriverResolver.java:121) ~[spring-boot-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8672937Z 	at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.resolveAll(PlatformPlaceholderDatabaseDriverResolver.java:96) ~[spring-boot-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8673501Z 	at org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer.resolveSchemaLocations(BatchDataSourceScriptDatabaseInitializer.java:86) ~[spring-boot-autoconfigure-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8673978Z 	at org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer.getSettings(BatchDataSourceScriptDatabaseInitializer.java:73) ~[spring-boot-autoconfigure-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8674431Z 	at org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer.<init>(BatchDataSourceScriptDatabaseInitializer.java:48) ~[spring-boot-autoconfigure-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8674897Z 	at org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration$DataSourceInitializerConfiguration.batchDataSourceInitializer(BatchAutoConfiguration.java:116) ~[spring-boot-autoconfigure-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8675186Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
2026-09-09T19:30:33.8675389Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:na]
2026-09-09T19:30:33.8675638Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
2026-09-09T19:30:33.8675856Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566) ~[na:na]
2026-09-09T19:30:33.8676211Z 	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:154) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8676589Z 	at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:653) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8676967Z 	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:638) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8677467Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1352) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8679359Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1195) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8679809Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8680395Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8681146Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8681871Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8682311Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8682675Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8683037Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:322) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8683429Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8683877Z 	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8684274Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1391) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8684684Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8685073Z 	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:887) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8685453Z 	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8685802Z 	at org.springframework.beans.factory.support.ConstructorResolver.autowireConstructor(ConstructorResolver.java:229) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8686217Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.autowireConstructor(AbstractAutowireCapableBeanFactory.java:1372) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8686651Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1222) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8687142Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8687565Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8687955Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8688337Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8688708Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8689263Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8689610Z 	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8690005Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1391) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8690404Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8691017Z 	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.resolveFieldValue(AutowiredAnnotationBeanPostProcessor.java:657) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8691630Z 	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:640) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8692277Z 	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:119) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8692885Z 	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessProperties(AutowiredAnnotationBeanPostProcessor.java:399) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8693567Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1431) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8694217Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:619) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8694806Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8695177Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8695625Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8696005Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8696363Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8696737Z 	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8697235Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1391) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8697867Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8698378Z 	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:887) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8698763Z 	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8699121Z 	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:541) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8699703Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1352) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8700146Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1195) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8700742Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8701258Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8701723Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8702290Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8702778Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8703331Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8703930Z 	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8704546Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1391) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8705201Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8705743Z 	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:887) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8706274Z 	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8706822Z 	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:541) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8707411Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1352) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8708078Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1195) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8708632Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8709048Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8709437Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8709792Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8710168Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8710726Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8711169Z 	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8711669Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1391) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8712071Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8712455Z 	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:887) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8712831Z 	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8713215Z 	at org.springframework.beans.factory.support.ConstructorResolver.autowireConstructor(ConstructorResolver.java:229) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8713670Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.autowireConstructor(AbstractAutowireCapableBeanFactory.java:1372) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8714184Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1222) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8714795Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8715223Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8715626Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8716095Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8716476Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8716991Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8717439Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:955) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8717857Z 	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:920) ~[spring-context-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8718255Z 	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583) ~[spring-context-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8718693Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:147) ~[spring-boot-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8719045Z 	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:731) ~[spring-boot-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8719383Z 	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:408) ~[spring-boot-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8719710Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:307) ~[spring-boot-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8720028Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1303) ~[spring-boot-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8720522Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1292) ~[spring-boot-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8720904Z 	at br.gov.caixa.monitora.MonitoraApplication.main(MonitoraApplication.java:13) ~[classes!/:0.0.1-SNAPSHOT]
2026-09-09T19:30:33.8721141Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
2026-09-09T19:30:33.8721441Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:na]
2026-09-09T19:30:33.8721843Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
2026-09-09T19:30:33.8722082Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566) ~[na:na]
2026-09-09T19:30:33.8722410Z 	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:49) ~[monitora-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
2026-09-09T19:30:33.8722751Z 	at org.springframework.boot.loader.Launcher.launch(Launcher.java:108) ~[monitora-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
2026-09-09T19:30:33.8723157Z 	at org.springframework.boot.loader.Launcher.launch(Launcher.java:58) ~[monitora-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
2026-09-09T19:30:33.8723488Z 	at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65) ~[monitora-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
2026-09-09T19:30:33.8723623Z 
2026-09-09T19:30:33.8725910Z 2026-09-09 16:29:07.997  WARN 8 --- [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'schedulerConfig' defined in URL [jar:file:/deployments/monitora-0.0.1-SNAPSHOT.jar!/BOOT-INF/classes!/br/gov/caixa/monitora/scheduler/SchedulerConfig.class]: Unsatisfied dependency expressed through constructor parameter 1; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'deleteJob' defined in class path resource [br/gov/caixa/monitora/config/BatchConfig.class]: Unsatisfied dependency expressed through method 'deleteJob' parameter 1; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'deleteStep' defined in class path resource [br/gov/caixa/monitora/config/BatchConfig.class]: Unsatisfied dependency expressed through method 'deleteStep' parameter 1; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'exclusaoCodErroService': Unsatisfied dependency expressed through field 'repository'; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'erroRepository' defined in URL [jar:file:/deployments/monitora-0.0.1-SNAPSHOT.jar!/BOOT-INF/classes!/br/gov/caixa/monitora/repository/ErroRepository.class]: Unsatisfied dependency expressed through constructor parameter 0; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'batchDataSourceInitializer' defined in class path resource [org/springframework/boot/autoconfigure/batch/BatchAutoConfiguration$DataSourceInitializerConfiguration.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer]: Factory method 'batchDataSourceInitializer' threw exception; nested exception is java.lang.IllegalStateException: Unable to detect database type
2026-09-09T19:30:33.8727417Z 2026-09-09 16:29:08.000  INFO 8 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2026-09-09T19:30:33.8727693Z 2026-09-09 16:29:08.009  INFO 8 --- [           main] ConditionEvaluationReportLoggingListener : 
2026-09-09T19:30:33.8727819Z 
2026-09-09T19:30:33.8728098Z Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2026-09-09T19:30:33.8728387Z 2026-09-09 16:29:08.022 ERROR 8 --- [           main] o.s.boot.SpringApplication               : Application run failed
2026-09-09T19:30:33.8728467Z 
2026-09-09T19:30:33.8730682Z org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'schedulerConfig' defined in URL [jar:file:/deployments/monitora-0.0.1-SNAPSHOT.jar!/BOOT-INF/classes!/br/gov/caixa/monitora/scheduler/SchedulerConfig.class]: Unsatisfied dependency expressed through constructor parameter 1; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'deleteJob' defined in class path resource [br/gov/caixa/monitora/config/BatchConfig.class]: Unsatisfied dependency expressed through method 'deleteJob' parameter 1; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'deleteStep' defined in class path resource [br/gov/caixa/monitora/config/BatchConfig.class]: Unsatisfied dependency expressed through method 'deleteStep' parameter 1; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'exclusaoCodErroService': Unsatisfied dependency expressed through field 'repository'; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'erroRepository' defined in URL [jar:file:/deployments/monitora-0.0.1-SNAPSHOT.jar!/BOOT-INF/classes!/br/gov/caixa/monitora/repository/ErroRepository.class]: Unsatisfied dependency expressed through constructor parameter 0; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'batchDataSourceInitializer' defined in class path resource [org/springframework/boot/autoconfigure/batch/BatchAutoConfiguration$DataSourceInitializerConfiguration.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer]: Factory method 'batchDataSourceInitializer' threw exception; nested exception is java.lang.IllegalStateException: Unable to detect database type
2026-09-09T19:30:33.8732881Z 	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:800) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8733521Z 	at org.springframework.beans.factory.support.ConstructorResolver.autowireConstructor(ConstructorResolver.java:229) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8734220Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.autowireConstructor(AbstractAutowireCapableBeanFactory.java:1372) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8734686Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1222) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8735129Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8735554Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8735917Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8736312Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8736688Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8737177Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8737568Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:955) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8737986Z 	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:920) ~[spring-context-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8738375Z 	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583) ~[spring-context-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8738768Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:147) ~[spring-boot-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8739128Z 	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:731) ~[spring-boot-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8739430Z 	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:408) ~[spring-boot-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8739752Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:307) ~[spring-boot-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8740069Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1303) ~[spring-boot-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8740686Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1292) ~[spring-boot-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8741346Z 	at br.gov.caixa.monitora.MonitoraApplication.main(MonitoraApplication.java:13) ~[classes!/:0.0.1-SNAPSHOT]
2026-09-09T19:30:33.8741598Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
2026-09-09T19:30:33.8741834Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:na]
2026-09-09T19:30:33.8742055Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
2026-09-09T19:30:33.8742278Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566) ~[na:na]
2026-09-09T19:30:33.8742605Z 	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:49) ~[monitora-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
2026-09-09T19:30:33.8742942Z 	at org.springframework.boot.loader.Launcher.launch(Launcher.java:108) ~[monitora-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
2026-09-09T19:30:33.8743272Z 	at org.springframework.boot.loader.Launcher.launch(Launcher.java:58) ~[monitora-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
2026-09-09T19:30:33.8743599Z 	at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65) ~[monitora-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT]
2026-09-09T19:30:33.8745475Z Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'deleteJob' defined in class path resource [br/gov/caixa/monitora/config/BatchConfig.class]: Unsatisfied dependency expressed through method 'deleteJob' parameter 1; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'deleteStep' defined in class path resource [br/gov/caixa/monitora/config/BatchConfig.class]: Unsatisfied dependency expressed through method 'deleteStep' parameter 1; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'exclusaoCodErroService': Unsatisfied dependency expressed through field 'repository'; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'erroRepository' defined in URL [jar:file:/deployments/monitora-0.0.1-SNAPSHOT.jar!/BOOT-INF/classes!/br/gov/caixa/monitora/repository/ErroRepository.class]: Unsatisfied dependency expressed through constructor parameter 0; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'batchDataSourceInitializer' defined in class path resource [org/springframework/boot/autoconfigure/batch/BatchAutoConfiguration$DataSourceInitializerConfiguration.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer]: Factory method 'batchDataSourceInitializer' threw exception; nested exception is java.lang.IllegalStateException: Unable to detect database type
2026-09-09T19:30:33.8746879Z 	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:800) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8747270Z 	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:541) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8747680Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1352) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8748221Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1195) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8748752Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8749268Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8749666Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8750134Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8750701Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8751231Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8751749Z 	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8752141Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1391) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8752617Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8753058Z 	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:887) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8753450Z 	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8753662Z 	... 27 common frames omitted
2026-09-09T19:30:33.8755190Z Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'deleteStep' defined in class path resource [br/gov/caixa/monitora/config/BatchConfig.class]: Unsatisfied dependency expressed through method 'deleteStep' parameter 1; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'exclusaoCodErroService': Unsatisfied dependency expressed through field 'repository'; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'erroRepository' defined in URL [jar:file:/deployments/monitora-0.0.1-SNAPSHOT.jar!/BOOT-INF/classes!/br/gov/caixa/monitora/repository/ErroRepository.class]: Unsatisfied dependency expressed through constructor parameter 0; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'batchDataSourceInitializer' defined in class path resource [org/springframework/boot/autoconfigure/batch/BatchAutoConfiguration$DataSourceInitializerConfiguration.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer]: Factory method 'batchDataSourceInitializer' threw exception; nested exception is java.lang.IllegalStateException: Unable to detect database type
2026-09-09T19:30:33.8756344Z 	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:800) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8756739Z 	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:541) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8757234Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1352) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8757737Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1195) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8758171Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8758644Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8759037Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8759426Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8759801Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8760161Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8760637Z 	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8761054Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1391) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8761429Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8761825Z 	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:887) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8762207Z 	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8762416Z 	... 41 common frames omitted
2026-09-09T19:30:33.8763708Z Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'exclusaoCodErroService': Unsatisfied dependency expressed through field 'repository'; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'erroRepository' defined in URL [jar:file:/deployments/monitora-0.0.1-SNAPSHOT.jar!/BOOT-INF/classes!/br/gov/caixa/monitora/repository/ErroRepository.class]: Unsatisfied dependency expressed through constructor parameter 0; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'batchDataSourceInitializer' defined in class path resource [org/springframework/boot/autoconfigure/batch/BatchAutoConfiguration$DataSourceInitializerConfiguration.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer]: Factory method 'batchDataSourceInitializer' threw exception; nested exception is java.lang.IllegalStateException: Unable to detect database type
2026-09-09T19:30:33.8764764Z 	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.resolveFieldValue(AutowiredAnnotationBeanPostProcessor.java:660) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8765194Z 	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:640) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8765592Z 	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:119) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8766012Z 	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessProperties(AutowiredAnnotationBeanPostProcessor.java:399) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8766441Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1431) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8766957Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:619) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8767373Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8767761Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8768146Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8768609Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8769156Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8769696Z 	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8770171Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1391) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8770769Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8771173Z 	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:887) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8771552Z 	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8771844Z 	... 55 common frames omitted
2026-09-09T19:30:33.8772901Z Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'erroRepository' defined in URL [jar:file:/deployments/monitora-0.0.1-SNAPSHOT.jar!/BOOT-INF/classes!/br/gov/caixa/monitora/repository/ErroRepository.class]: Unsatisfied dependency expressed through constructor parameter 0; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'batchDataSourceInitializer' defined in class path resource [org/springframework/boot/autoconfigure/batch/BatchAutoConfiguration$DataSourceInitializerConfiguration.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer]: Factory method 'batchDataSourceInitializer' threw exception; nested exception is java.lang.IllegalStateException: Unable to detect database type
2026-09-09T19:30:33.8773642Z 	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:800) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8774022Z 	at org.springframework.beans.factory.support.ConstructorResolver.autowireConstructor(ConstructorResolver.java:229) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8774438Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.autowireConstructor(AbstractAutowireCapableBeanFactory.java:1372) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8774873Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1222) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8775297Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8775720Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8776112Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8776471Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8776846Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8777201Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8777567Z 	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8777956Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1391) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8778352Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8778797Z 	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.resolveFieldValue(AutowiredAnnotationBeanPostProcessor.java:657) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8779032Z 	... 70 common frames omitted
2026-09-09T19:30:33.8779764Z Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'batchDataSourceInitializer' defined in class path resource [org/springframework/boot/autoconfigure/batch/BatchAutoConfiguration$DataSourceInitializerConfiguration.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer]: Factory method 'batchDataSourceInitializer' threw exception; nested exception is java.lang.IllegalStateException: Unable to detect database type
2026-09-09T19:30:33.8780489Z 	at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:658) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8780889Z 	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:638) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8781318Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1352) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8781726Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1195) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8782211Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8782628Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8783012Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8783399Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8783771Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8784129Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8784484Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:322) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8784844Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8785173Z 	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8785651Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1391) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8786060Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8786451Z 	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:887) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8786830Z 	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8787036Z 	... 83 common frames omitted
2026-09-09T19:30:33.8787491Z Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer]: Factory method 'batchDataSourceInitializer' threw exception; nested exception is java.lang.IllegalStateException: Unable to detect database type
2026-09-09T19:30:33.8788057Z 	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:185) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8788453Z 	at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:653) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8788627Z 	... 99 common frames omitted
2026-09-09T19:30:33.8788787Z Caused by: java.lang.IllegalStateException: Unable to detect database type
2026-09-09T19:30:33.8789065Z 	at org.springframework.util.Assert.state(Assert.java:76) ~[spring-core-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8789449Z 	at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.determinePlatform(PlatformPlaceholderDatabaseDriverResolver.java:132) ~[spring-boot-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8789886Z 	at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.lambda$resolveAll$0(PlatformPlaceholderDatabaseDriverResolver.java:96) ~[spring-boot-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8790321Z 	at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.resolveAll(PlatformPlaceholderDatabaseDriverResolver.java:121) ~[spring-boot-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8790824Z 	at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.resolveAll(PlatformPlaceholderDatabaseDriverResolver.java:96) ~[spring-boot-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8791280Z 	at org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer.resolveSchemaLocations(BatchDataSourceScriptDatabaseInitializer.java:86) ~[spring-boot-autoconfigure-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8791722Z 	at org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer.getSettings(BatchDataSourceScriptDatabaseInitializer.java:73) ~[spring-boot-autoconfigure-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8792280Z 	at org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer.<init>(BatchDataSourceScriptDatabaseInitializer.java:48) ~[spring-boot-autoconfigure-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8792773Z 	at org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration$DataSourceInitializerConfiguration.batchDataSourceInitializer(BatchAutoConfiguration.java:116) ~[spring-boot-autoconfigure-2.7.13.jar!/:2.7.13]
2026-09-09T19:30:33.8793061Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
2026-09-09T19:30:33.8793265Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:na]
2026-09-09T19:30:33.8793518Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
2026-09-09T19:30:33.8793745Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566) ~[na:na]
2026-09-09T19:30:33.8794091Z 	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:154) ~[spring-beans-5.3.28.jar!/:5.3.28]
2026-09-09T19:30:33.8794311Z 	... 100 common frames omitted
2026-09-09T19:30:33.8794360Z 
2026-09-09T19:30:33.8796573Z ##[section]Finishing: Logs da Aplicação
