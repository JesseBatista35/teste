Prezad@s, boa tarde.

Estamos tendo dificuldades para efetuar deploy no ambiente de TQS. Podem nos ajudar nisso por favor ?

Link release: https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-pipeline-progress&releaseId=534515

2026-09-30T15:35:25.7651764Z ##[section]Starting: Verificando Status do Deployment
2026-09-30T15:35:25.7762206Z ==============================================================================
2026-09-30T15:35:25.7762321Z Task         : Bash
2026-09-30T15:35:25.7762366Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-30T15:35:25.7762434Z Version      : 3.227.0
2026-09-30T15:35:25.7762486Z Author       : Microsoft Corporation
2026-09-30T15:35:25.7762537Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-30T15:35:25.7762608Z ==============================================================================
2026-09-30T15:35:25.8914597Z Generating script.
2026-09-30T15:35:25.8915404Z ========================== Starting Command Output ===========================
2026-09-30T15:35:25.8916548Z [command]/bin/bash /opt/ads-agent/_work/_temp/45786975-676f-4270-a26e-7fd2ed76cd4f.sh
2026-09-30T15:35:27.1382466Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-09-30T15:35:27.2128221Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-09-30T15:35:28.1984223Z Waiting for rollout to finish: 0 of 1 updated replicas are available...
2026-09-30T15:41:33.2728565Z ##[error]The task has timed out.
2026-09-30T15:41:33.2729647Z ##[section]Finishing: Verificando Status do Deployment


2026-09-30T15:41:33.2749497Z ##[section]Starting: Logs da Aplicação
2026-09-30T15:41:33.2752907Z ==============================================================================
2026-09-30T15:41:33.2752992Z Task         : Bash
2026-09-30T15:41:33.2753036Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-30T15:41:33.2753097Z Version      : 3.227.0
2026-09-30T15:41:33.2753148Z Author       : Microsoft Corporation
2026-09-30T15:41:33.2753196Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-30T15:41:33.2753276Z ==============================================================================
2026-09-30T15:41:33.3909166Z Generating script.
2026-09-30T15:41:33.3919742Z ========================== Starting Command Output ===========================
2026-09-30T15:41:33.3927011Z [command]/bin/bash /opt/ads-agent/_work/_temp/13f8766d-c544-46a5-8682-1a7ed9dd310a.sh
2026-09-30T15:41:33.3973066Z + shopt -s expand_aliases
2026-09-30T15:41:33.3973208Z + [[ -n okd4_nprd ]]
2026-09-30T15:41:33.3973367Z + [[ okd4_nprd =~ ocp ]]
2026-09-30T15:41:33.4006478Z + [[ -n okd4_nprd ]]
2026-09-30T15:41:33.4006590Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-09-30T15:41:33.4006943Z + app=siavl-atddigital-backend-tqs
2026-09-30T15:41:33.4007083Z + oc version
2026-09-30T15:41:33.5511128Z oc v3.11.0+0cbc58b
2026-09-30T15:41:33.5511292Z kubernetes v1.11.0+d4cacc0
2026-09-30T15:41:33.5511560Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-09-30T15:41:33.5602551Z 
2026-09-30T15:41:33.5602864Z Server https://api.nprd.caixa:6443
2026-09-30T15:41:33.5603398Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-09-30T15:41:33.5636388Z ++ oc get pod -l name=siavl-atddigital-backend-tqs -n siavl-tqs -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-30T15:41:33.5636580Z ++ tac
2026-09-30T15:41:33.5637170Z ++ grep -v '^$'
2026-09-30T15:41:33.5668765Z ++ head -n1
2026-09-30T15:41:33.8075105Z + last_pod=siavl-atddigital-backend-tqs-3-frvg9
2026-09-30T15:41:33.8075377Z + echo 'Logs do POD: siavl-atddigital-backend-tqs-3-frvg9'
2026-09-30T15:41:33.8075617Z + oc logs siavl-atddigital-backend-tqs-3-frvg9 -c siavl-atddigital-backend-tqs -n siavl-tqs
2026-09-30T15:41:33.8075827Z Logs do POD: siavl-atddigital-backend-tqs-3-frvg9
2026-09-30T15:41:34.1795142Z exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=siavl-atddigital-backend -Delastic.apm.environment=tqs -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls= -Delastic.apm.global_labels=deployment=siavl-atddigital-backend -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/SIAVL-atddigital-backend.jar
2026-09-30T15:41:34.1795823Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-30T15:41:34.1796028Z WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.
2026-09-30T15:41:34.1796364Z 2026-09-30 12:39:39,646 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connection refused
2026-09-30T15:41:34.1796689Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-30T15:41:34.1797020Z 2026-09-30 12:39:45.030-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.4.13 started successfully (PID 8, JVM running for 7.402 s)
2026-09-30T15:41:34.1797383Z 2026-09-30 12:39:45.034-03:00 INFO  c.m.applicationinsights.agent - Java version: 17.0.7, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-17-openjdk-17.0.7.0.7-3.el8.x86_64
2026-09-30T15:41:34.1797510Z 
2026-09-30T15:41:34.1797605Z   .   ____          _            __ _ _
2026-09-30T15:41:34.1799118Z  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
2026-09-30T15:41:34.1799334Z ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
2026-09-30T15:41:34.1799760Z  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
2026-09-30T15:41:34.1800118Z   '  |____| .__|_| |_|_| |_\__, | / / / /
2026-09-30T15:41:34.1800248Z  =========|_|==============|___/=/_/_/_/
2026-09-30T15:41:34.1801069Z  :: Spring Boot ::                (v2.7.7)
2026-09-30T15:41:34.1801149Z 
2026-09-30T15:41:34.1801468Z 2026-09-30 12:39:47.846-03:00 WARN  c.m.a.a.i.p.PerformanceMonitoringService - INITIALISING JFR PROFILING SUBSYSTEM THIS FEATURE IS IN BETA
2026-09-30T15:41:34.1801922Z 2026-09-30 12:39:48.041  INFO 8 --- [           main] b.g.c.siavl.atddigital.RunApplication    : Starting RunApplication using Java 17.0.7 on siavl-atddigital-backend-tqs-3-frvg9 with PID 8 (/deployments/SIAVL-atddigital-backend.jar started by 1001 in /deployments)
2026-09-30T15:41:34.1802392Z 2026-09-30 12:39:48.128  INFO 8 --- [           main] b.g.c.siavl.atddigital.RunApplication    : No active profile set, falling back to 1 default profile: "default"
2026-09-30T15:41:34.1802736Z 2026-09-30 12:39:51.944  INFO 8 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Multiple Spring Data modules found, entering strict repository configuration mode
2026-09-30T15:41:34.1803075Z 2026-09-30 12:39:51.946  INFO 8 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JDBC repositories in DEFAULT mode.
2026-09-30T15:41:34.1803673Z 2026-09-30 12:39:52.044  INFO 8 --- [           main] .RepositoryConfigurationExtensionSupport : Spring Data JDBC - Could not safely identify store assignment for repository candidate interface br.gov.caixa.siavl.atddigital.repository.IAtendimentoNotaRepository; If you want this repository to be a JDBC repository, consider annotating your entities with one of these annotations: org.springframework.data.relational.core.mapping.Table.
2026-09-30T15:41:34.1804618Z 2026-09-30 12:39:52.046  INFO 8 --- [           main] .RepositoryConfigurationExtensionSupport : Spring Data JDBC - Could not safely identify store assignment for repository candidate interface br.gov.caixa.siavl.atddigital.repository.IPendenciaAtendimentoNotaRepository; If you want this repository to be a JDBC repository, consider annotating your entities with one of these annotations: org.springframework.data.relational.core.mapping.Table.
2026-09-30T15:41:34.1805336Z 2026-09-30 12:39:52.049  INFO 8 --- [           main] .RepositoryConfigurationExtensionSupport : Spring Data JDBC - Could not safely identify store assignment for repository candidate interface br.gov.caixa.siavl.atddigital.repository.IAtendimentoClienteRepository; If you want this repository to be a JDBC repository, consider annotating your entities with one of these annotations: org.springframework.data.relational.core.mapping.Table.
2026-09-30T15:41:34.1806039Z 2026-09-30 12:39:52.050  INFO 8 --- [           main] .RepositoryConfigurationExtensionSupport : Spring Data JDBC - Could not safely identify store assignment for repository candidate interface br.gov.caixa.siavl.atddigital.repository.IModeloNotaNegocioRepository; If you want this repository to be a JDBC repository, consider annotating your entities with one of these annotations: org.springframework.data.relational.core.mapping.Table.
2026-09-30T15:41:34.1806744Z 2026-09-30 12:39:52.052  INFO 8 --- [           main] .RepositoryConfigurationExtensionSupport : Spring Data JDBC - Could not safely identify store assignment for repository candidate interface br.gov.caixa.siavl.atddigital.repository.IDocumentoClienteRepository; If you want this repository to be a JDBC repository, consider annotating your entities with one of these annotations: org.springframework.data.relational.core.mapping.Table.
2026-09-30T15:41:34.1807421Z 2026-09-30 12:39:52.054  INFO 8 --- [           main] .RepositoryConfigurationExtensionSupport : Spring Data JDBC - Could not safely identify store assignment for repository candidate interface br.gov.caixa.siavl.atddigital.repository.IAssinaturaNotaRepository; If you want this repository to be a JDBC repository, consider annotating your entities with one of these annotations: org.springframework.data.relational.core.mapping.Table.
2026-09-30T15:41:34.1808289Z 2026-09-30 12:39:52.055  INFO 8 --- [           main] .RepositoryConfigurationExtensionSupport : Spring Data JDBC - Could not safely identify store assignment for repository candidate interface br.gov.caixa.siavl.atddigital.repository.IDocumentoNotaNegociacaoRepository; If you want this repository to be a JDBC repository, consider annotating your entities with one of these annotations: org.springframework.data.relational.core.mapping.Table.
2026-09-30T15:41:34.1809003Z 2026-09-30 12:39:52.133  INFO 8 --- [           main] .RepositoryConfigurationExtensionSupport : Spring Data JDBC - Could not safely identify store assignment for repository candidate interface br.gov.caixa.siavl.atddigital.repository.INotaNegociacaoRepository; If you want this repository to be a JDBC repository, consider annotating your entities with one of these annotations: org.springframework.data.relational.core.mapping.Table.
2026-09-30T15:41:34.1809465Z 2026-09-30 12:39:52.134  INFO 8 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 182 ms. Found 0 JDBC repository interfaces.
2026-09-30T15:41:34.1809815Z 2026-09-30 12:39:52.143  INFO 8 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Multiple Spring Data modules found, entering strict repository configuration mode
2026-09-30T15:41:34.1810141Z 2026-09-30 12:39:52.155  INFO 8 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-09-30T15:41:34.1810532Z 2026-09-30 12:39:52.967  INFO 8 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 806 ms. Found 8 JPA repository interfaces.
2026-09-30T15:41:34.1810845Z 2026-09-30 12:39:55.946  INFO 8 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2026-09-30T15:41:34.1811127Z 2026-09-30 12:39:55.967  INFO 8 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-09-30T15:41:34.1811422Z 2026-09-30 12:39:55.967  INFO 8 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.70]
2026-09-30T15:41:34.1811719Z 2026-09-30 12:39:56.163  INFO 8 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-09-30T15:41:34.1812028Z 2026-09-30 12:39:56.163  INFO 8 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 7918 ms
2026-09-30T15:41:34.1812344Z 2026-09-30 12:39:56.641  INFO 8 --- [           main] i.m.c.instrument.push.PushMeterRegistry  : publishing metrics for AzureMonitorMeterRegistry every 1m
2026-09-30T15:41:34.1812769Z 2026-09-30 12:39:58.942  WARN 8 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-09-30T15:41:34.1813179Z 2026-09-30 12:39:59.630  INFO 8 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2026-09-30T15:41:34.1813476Z 2026-09-30 12:39:59.854  INFO 8 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.6.14.Final
2026-09-30T15:41:34.1813778Z 2026-09-30 12:40:00.528  INFO 8 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2026-09-30T15:41:34.1814055Z 2026-09-30 12:40:00.966  INFO 8 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-09-30T15:41:34.1814498Z 2026-09-30 12:40:02.325-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service: Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (future warnings will be aggregated and logged once every 5 minutes)
2026-09-30T15:41:34.1814940Z 2026-09-30 12:40:02.350  INFO 8 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2026-09-30T15:41:34.1815238Z 2026-09-30 12:40:02.448  INFO 8 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.Oracle10gDialect
2026-09-30T15:41:34.1815594Z 2026-09-30 12:40:07.259  INFO 8 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2026-09-30T15:41:34.1815943Z 2026-09-30 12:40:07.327  INFO 8 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-09-30T15:41:34.1816564Z 2026-09-30 12:40:08.560  WARN 8 --- [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'issuerProperties': Injection of autowired dependencies failed; nested exception is java.lang.IllegalArgumentException: Could not resolve placeholder 'SSO_INTER_SIPER_URL' in value "${SSO_INTER_SIPER_URL}"
2026-09-30T15:41:34.1817026Z 2026-09-30 12:40:08.561  INFO 8 --- [           main] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2026-09-30T15:41:34.1817370Z 2026-09-30 12:40:08.629  INFO 8 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2026-09-30T15:41:34.1817648Z 2026-09-30 12:40:08.656  INFO 8 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
2026-09-30T15:41:34.1817921Z 2026-09-30 12:40:08.662  INFO 8 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2026-09-30T15:41:34.1818479Z 2026-09-30 12:40:08.732  WARN 8 --- [           main] o.a.c.loader.WebappClassLoaderBase       : The web application [ROOT] appears to have started a thread named [oracle.jdbc.driver.BlockSource.ThreadedCachingBlockSource.BlockReleaser] but has failed to stop it. This is very likely to create a memory leak. Stack trace of thread:
2026-09-30T15:41:34.1818751Z  java.base@17.0.7/java.lang.Object.wait(Native Method)
2026-09-30T15:41:34.1818933Z  oracle.jdbc.driver.BlockSource$ThreadedCachingBlockSource$BlockReleaser.run(BlockSource.java:331)
2026-09-30T15:41:34.1819368Z 2026-09-30 12:40:08.733  WARN 8 --- [           main] o.a.c.loader.WebappClassLoaderBase       : The web application [ROOT] appears to have started a thread named [InterruptTimer] but has failed to stop it. This is very likely to create a memory leak. Stack trace of thread:
2026-09-30T15:41:34.1819609Z  java.base@17.0.7/java.lang.Object.wait(Native Method)
2026-09-30T15:41:34.1819762Z  java.base@17.0.7/java.util.TimerThread.mainLoop(Timer.java:563)
2026-09-30T15:41:34.1819921Z  java.base@17.0.7/java.util.TimerThread.run(Timer.java:516)
2026-09-30T15:41:34.1820201Z 2026-09-30 12:40:08.746  INFO 8 --- [           main] ConditionEvaluationReportLoggingListener : 
2026-09-30T15:41:34.1820278Z 
2026-09-30T15:41:34.1820499Z Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2026-09-30T15:41:34.1820754Z 2026-09-30 12:40:09.134 ERROR 8 --- [           main] o.s.boot.SpringApplication               : Application run failed
2026-09-30T15:41:34.1820840Z 
2026-09-30T15:41:34.1821246Z org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'issuerProperties': Injection of autowired dependencies failed; nested exception is java.lang.IllegalArgumentException: Could not resolve placeholder 'SSO_INTER_SIPER_URL' in value "${SSO_INTER_SIPER_URL}"
2026-09-30T15:41:34.1821724Z 	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessProperties(AutowiredAnnotationBeanPostProcessor.java:405) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1822192Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1431) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1822591Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:619) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1822987Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1823357Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1823725Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1824079Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1824414Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1824842Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:955) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1825242Z 	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:918) ~[spring-context-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1825610Z 	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583) ~[spring-context-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1825980Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:147) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-30T15:41:34.1826366Z 	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:731) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-30T15:41:34.1826675Z 	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:408) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-30T15:41:34.1826967Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:307) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-30T15:41:34.1827247Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1303) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-30T15:41:34.1827520Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1292) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-30T15:41:34.1827720Z 	at br.gov.caixa.siavl.atddigital.RunApplication.main(RunApplication.java:12) ~[classes!/:na]
2026-09-30T15:41:34.1827916Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
2026-09-30T15:41:34.1828181Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
2026-09-30T15:41:34.1828387Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
2026-09-30T15:41:34.1828576Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
2026-09-30T15:41:34.1828865Z 	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:49) ~[SIAVL-atddigital-backend.jar:na]
2026-09-30T15:41:34.1829155Z 	at org.springframework.boot.loader.Launcher.launch(Launcher.java:108) ~[SIAVL-atddigital-backend.jar:na]
2026-09-30T15:41:34.1829438Z 	at org.springframework.boot.loader.Launcher.launch(Launcher.java:58) ~[SIAVL-atddigital-backend.jar:na]
2026-09-30T15:41:34.1829717Z 	at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65) ~[SIAVL-atddigital-backend.jar:na]
2026-09-30T15:41:34.1830075Z Caused by: java.lang.IllegalArgumentException: Could not resolve placeholder 'SSO_INTER_SIPER_URL' in value "${SSO_INTER_SIPER_URL}"
2026-09-30T15:41:34.1830413Z 	at org.springframework.util.PropertyPlaceholderHelper.parseStringValue(PropertyPlaceholderHelper.java:180) ~[spring-core-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1830766Z 	at org.springframework.util.PropertyPlaceholderHelper.replacePlaceholders(PropertyPlaceholderHelper.java:126) ~[spring-core-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1831127Z 	at org.springframework.core.env.AbstractPropertyResolver.doResolvePlaceholders(AbstractPropertyResolver.java:239) ~[spring-core-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1831487Z 	at org.springframework.core.env.AbstractPropertyResolver.resolveRequiredPlaceholders(AbstractPropertyResolver.java:210) ~[spring-core-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1831872Z 	at org.springframework.core.env.AbstractPropertyResolver.resolveNestedPlaceholders(AbstractPropertyResolver.java:230) ~[spring-core-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1832306Z 	at org.springframework.boot.context.properties.source.ConfigurationPropertySourcesPropertyResolver.getProperty(ConfigurationPropertySourcesPropertyResolver.java:79) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-30T15:41:34.1832758Z 	at org.springframework.boot.context.properties.source.ConfigurationPropertySourcesPropertyResolver.getProperty(ConfigurationPropertySourcesPropertyResolver.java:60) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-30T15:41:34.1833165Z 	at org.springframework.core.env.AbstractEnvironment.getProperty(AbstractEnvironment.java:594) ~[spring-core-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1833534Z 	at org.springframework.context.support.PropertySourcesPlaceholderConfigurer$1.getProperty(PropertySourcesPlaceholderConfigurer.java:153) ~[spring-context-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1833919Z 	at org.springframework.context.support.PropertySourcesPlaceholderConfigurer$1.getProperty(PropertySourcesPlaceholderConfigurer.java:149) ~[spring-context-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1834288Z 	at org.springframework.core.env.PropertySourcesPropertyResolver.getProperty(PropertySourcesPropertyResolver.java:85) ~[spring-core-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1834658Z 	at org.springframework.core.env.PropertySourcesPropertyResolver.getPropertyAsRawString(PropertySourcesPropertyResolver.java:74) ~[spring-core-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1835012Z 	at org.springframework.util.PropertyPlaceholderHelper.parseStringValue(PropertyPlaceholderHelper.java:153) ~[spring-core-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1835352Z 	at org.springframework.util.PropertyPlaceholderHelper.replacePlaceholders(PropertyPlaceholderHelper.java:126) ~[spring-core-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1835699Z 	at org.springframework.core.env.AbstractPropertyResolver.doResolvePlaceholders(AbstractPropertyResolver.java:239) ~[spring-core-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1836046Z 	at org.springframework.core.env.AbstractPropertyResolver.resolveRequiredPlaceholders(AbstractPropertyResolver.java:210) ~[spring-core-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1836441Z 	at org.springframework.context.support.PropertySourcesPlaceholderConfigurer.lambda$processProperties$0(PropertySourcesPlaceholderConfigurer.java:191) ~[spring-context-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1836817Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.resolveEmbeddedValue(AbstractBeanFactory.java:936) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1837198Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1332) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1837576Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1838005Z 	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.resolveFieldValue(AutowiredAnnotationBeanPostProcessor.java:657) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1838534Z 	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:640) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1838898Z 	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:119) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1839288Z 	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessProperties(AutowiredAnnotationBeanPostProcessor.java:399) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-30T15:41:34.1839484Z 	... 25 common frames omitted
2026-09-30T15:41:34.1839529Z 
2026-09-30T15:41:34.1922570Z ##[section]Finishing: Logs da Aplicação


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIAVL-atddigital-backend
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings
All pipelines

SIAVL

SIAVL-atddigital-backend
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
EGRESS_IP_OKD (81)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)

Scopes: EC DES,EC TQS,EC HMP
CI_NAME
7366CLU-OKD4-NPRD
KIND_DEPLOY
deploymentconfig
OKD_4_API
api.nprd.caixa:6443
OKD_4_REGISTRY
default-route-openshift-image-registry.apps.nprd.caixa
OKD_4_TOKEN
********
OKD_4_URL_SUFFIX
apps.nprd.caixa
OKD_4_USER_SERVICE
ads-sa
OKD_URL_SUFFIX
apps.nprd.caixa
OKD_USER_SERVICE
ads-sa
TIMEOUT_DEPLOY
600
TOKEN_CRQ
********
URL_CRQ
https://infradevops-novoportal-backend-prd.apps.produtos4.caixa/api.php?acao=devopsCaixacriarMudancaPadrao
SIAVL-ATDDIGITAL-BACKEND-DES (34)
Grupo de variáveis de SIAVL-ATDDIGITAL-BACKEND-DES
Scopes: EC DES
SIAVL-ATDDIGITAL-BT-VAULT-DES (1)
WO0000081167000 - Criação de library
Scopes: EC DES
BT_SECRETS_LIST
SIAVL_DES/CLISERAVL_SSO_INTRA,SIAVL_DES/SAVLSD01_ORACLE,SIAVL_DES/SIAVL_BT_APIKEY
SIAVL-BT-VAULT-SECRET-DES (2)
WO0000081317011
Scopes: EC DES
BT_CLIENT_ID
0df21669-5cc8-48c4-852d-4bac699fe692
BT_CLIENT_SECRET
********
SIAVL-ATDDIGITAL-BACKEND-TQS (33)
Grupo de variáveis de SIAVL-ATDDIGITAL-BACKEND-TQS
Scopes: EC TQS
SIAVL_SIECM_SSO_CLIENT_SECRET
04908642-8015-422f-af4c-bc9269464913
SPRING_DATASOURCE_PASSWORD
********
_ENV.AMBIENTE
tqs
_ENV.APIMANAGER_KEY
l7xx2b6f4c64f3774870b0b9b399a77586f5
_ENV.APIMANAGER_URL
https://api.des.caixa:8443
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=b0142390-50c9-495e-85b4-7b2ade8fc1cf;IngestionEndpoint=https://brazilsoutheast-0.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsoutheast.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_PROXY
http://proxydes.caixa:80
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SIAVL-ATDDIGITAL-TQS
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.CERT_REQUIRED
false
_ENV.ISSUERS_REALMS_INTRANET
https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.PERIODO_REQUEST
60s
_ENV.QTD_REQUESTS_SMS
5
_ENV.SIAVL_BACKEND_ATDDIGITAL
https://siavl-atddigital-backend-tqs.apps.nprd.caixa
_ENV.SIAVL_CODIGO_CANAL
9746
_ENV.SIAVL_SIECM_SSO_CLIENT_ID
cli-ser-avl
_ENV.SIAVL_SIECM_SSO_CLIENT_SECRET
04908642-8015-422f-af4c-bc9269464913
_ENV.SIAVL_TRANSACAO_ATIVACAO
999990993
_ENV.SPRING_DATASOURCE_URL
"jdbc:oracle:thin:@cnpexdadvm01-scan11.extra.caixa.gov.br:1521/orat04bc"
_ENV.SPRING_DATASOURCE_USERNAME
SAVLST02
_ENV.SPRING_OIDC_AUTH-SERVER-URL
https://login.des.caixa/auth/realms/intranet
_ENV.SSO_INTERNET_URL
https://logindes.caixa.gov.br/auth/realms/internet
_ENV.TIMEDOUT_REQUEST
0
_ENV.URL_GED_API
https://siecm.des.caixa/siecm-web/ECM/v1
_ENV.URL_GED_API_ECM
https://siecm.des.caixa/siecm-web/ECM
_ENV.URL_INTRANET_SSO
https://login.des.caixa/
_ENV.URL_SIGMS_TELEFONE
"sms/adesao/v4/adesoes/servico-documento?servico=ALERTA_FINANCEIRO&icCpfCnpj=CPF&cpfCnpj="
_ENV.URL_SIPNC_LOG
plataforma-unificada/trilha/v1/registros
_ENV.URL_SISET_ENVIAR_TOKEN
"login-caixa/intranet/codigos/v5/codigos/sms"
_ENV.URL_SISET_VALIDAR_TOKEN
login-caixa/intranet/codigos/codigos/%s/validar
_SECRET.SPRING_DATASOURCE_PASSWORD
#{SPRING_DATASOURCE_PASSWORD}#
SIAVL-ATDDIGITAL-BACKEND-HMP (1)
Grupo de variáveis de SIAVL-ATDDIGITAL-BACKEND-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SIAVL-ATDDIGITAL-BACKEND-PRD (35)
Grupo de variáveis de SIAVL-ATDDIGITAL-BACKEND-PRD
Scopes: EC PRD
|Manage variable groups
Row 2

Showing filters 1 through 2


