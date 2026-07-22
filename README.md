Bom dia, gostaria de solicitar que fosse ajustada a integração com o apm-server, pois aparentemente essa integração está gerando a quebra da release da aplicação no ambiente:

Link da release com erro:

https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=503973&environmentId=2341103


2026-07-22T14:26:17.7356139Z ##[section]Starting: Verificando Status do Deployment
2026-07-22T14:26:17.7358936Z ==============================================================================
2026-07-22T14:26:17.7359019Z Task         : Bash
2026-07-22T14:26:17.7359061Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-22T14:26:17.7359123Z Version      : 3.227.0
2026-07-22T14:26:17.7359175Z Author       : Microsoft Corporation
2026-07-22T14:26:17.7359333Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-22T14:26:17.7359402Z ==============================================================================
2026-07-22T14:26:18.6107234Z Generating script.
2026-07-22T14:26:18.6110902Z ========================== Starting Command Output ===========================
2026-07-22T14:26:18.6112555Z [command]/bin/bash /opt/ads-agent/_work/_temp/2afb5107-bcb8-4bbf-a1fd-ad45a47bad50.sh
2026-07-22T14:26:18.8281393Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-07-22T14:32:25.2467389Z ##[error]The task has timed out.
2026-07-22T14:32:25.2468919Z ##[section]Finishing: Verificando Status do Deployment


2026-07-22T14:32:25.2491922Z ##[section]Starting: Logs da Aplicação
2026-07-22T14:32:25.2496519Z ==============================================================================
2026-07-22T14:32:25.2496634Z Task         : Bash
2026-07-22T14:32:25.2496679Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-22T14:32:25.2496756Z Version      : 3.227.0
2026-07-22T14:32:25.2496809Z Author       : Microsoft Corporation
2026-07-22T14:32:25.2496859Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-22T14:32:25.2496926Z ==============================================================================
2026-07-22T14:32:26.2449746Z Generating script.
2026-07-22T14:32:26.2476776Z ========================== Starting Command Output ===========================
2026-07-22T14:32:26.2478645Z [command]/bin/bash /opt/ads-agent/_work/_temp/1b007faf-7109-490d-8de4-de54179cf663.sh
2026-07-22T14:32:26.2518217Z + shopt -s expand_aliases
2026-07-22T14:32:26.2518595Z + [[ -n okd4_nprd ]]
2026-07-22T14:32:26.2518800Z + [[ okd4_nprd =~ ocp ]]
2026-07-22T14:32:26.2518920Z + [[ -n okd4_nprd ]]
2026-07-22T14:32:26.2519027Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-07-22T14:32:26.2519285Z + app=simil-api-des
2026-07-22T14:32:26.2519417Z + oc version
2026-07-22T14:32:26.3968566Z oc v3.11.0+0cbc58b
2026-07-22T14:32:26.3968795Z kubernetes v1.11.0+d4cacc0
2026-07-22T14:32:26.3969202Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-07-22T14:32:26.4059992Z 
2026-07-22T14:32:26.4060712Z Server https://api.nprd.caixa:6443
2026-07-22T14:32:26.4061282Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-07-22T14:32:26.4092613Z ++ oc get pod -l name=simil-api-des -n simil-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-07-22T14:32:26.4094234Z ++ grep -v '^$'
2026-07-22T14:32:26.4094577Z ++ tac
2026-07-22T14:32:26.4095542Z ++ head -n1
2026-07-22T14:32:26.6240482Z + last_pod=simil-api-des-4-f6k6t
2026-07-22T14:32:26.6240719Z + echo 'Logs do POD: simil-api-des-4-f6k6t'
2026-07-22T14:32:26.6240962Z + oc logs simil-api-des-4-f6k6t -c simil-api-des -n simil-des
2026-07-22T14:32:26.6241224Z Logs do POD: simil-api-des-4-f6k6t
2026-07-22T14:32:26.9304599Z exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=simil-api -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=simil-api -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/simil-api-0.0.0.jar
2026-07-22T14:32:26.9305756Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-22T14:32:26.9306032Z WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.
2026-07-22T14:32:26.9306148Z 
2026-07-22T14:32:26.9306292Z   .   ____          _            __ _ _
2026-07-22T14:32:26.9306550Z  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
2026-07-22T14:32:26.9306861Z ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
2026-07-22T14:32:26.9307016Z  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
2026-07-22T14:32:26.9307218Z   '  |____| .__|_| |_|_| |_\__, | / / / /
2026-07-22T14:32:26.9308916Z  =========|_|==============|___/=/_/_/_/
2026-07-22T14:32:26.9309017Z 
2026-07-22T14:32:26.9309130Z  :: Spring Boot ::                (v3.3.2)
2026-07-22T14:32:26.9309192Z 
2026-07-22T14:32:26.9309641Z 2026-07-22T09:00:35.813-03:00  INFO 8 --- [simil-api] [           main] b.g.caixa.simil.api.SimilApiApplication  : Starting SimilApiApplication v0.0.0 using Java 17.0.7 with PID 8 (/deployments/simil-api-0.0.0.jar started by 1001 in /deployments)
2026-07-22T14:32:26.9310044Z 2026-07-22T09:00:35.871-03:00  INFO 8 --- [simil-api] [           main] b.g.caixa.simil.api.SimilApiApplication  : No active profile set, falling back to 1 default profile: "default"
2026-07-22T14:32:26.9310375Z java.lang.NoSuchMethodError: 'javax.servlet.ServletContext org.springframework.web.context.WebApplicationContext.getServletContext()'
2026-07-22T14:32:26.9310817Z 	at co.elastic.apm.agent.springwebmvc.SpringServiceNameInstrumentation$SpringServiceNameAdvice.afterInitPropertySources(SpringServiceNameInstrumentation.java:82)
2026-07-22T14:32:26.9311145Z 	at org.springframework.web.context.support.GenericWebApplicationContext.initPropertySources(GenericWebApplicationContext.java:214)
2026-07-22T14:32:26.9311385Z 	at org.springframework.context.support.AbstractApplicationContext.prepareRefresh(AbstractApplicationContext.java:677)
2026-07-22T14:32:26.9311649Z 	at org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext.prepareRefresh(AnnotationConfigServletWebServerApplicationContext.java:195)
2026-07-22T14:32:26.9311887Z 	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:593)
2026-07-22T14:32:26.9312122Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146)
2026-07-22T14:32:26.9312339Z 	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:754)
2026-07-22T14:32:26.9312527Z 	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:456)
2026-07-22T14:32:26.9312715Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:335)
2026-07-22T14:32:26.9312969Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1363)
2026-07-22T14:32:26.9313456Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1352)
2026-07-22T14:32:26.9313817Z 	at br.gov.caixa.simil.api.SimilApiApplication.main(SimilApiApplication.java:12)
2026-07-22T14:32:26.9313988Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-22T14:32:26.9314171Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-07-22T14:32:26.9314371Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-22T14:32:26.9314616Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-07-22T14:32:26.9314792Z 	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:91)
2026-07-22T14:32:26.9314970Z 	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:53)
2026-07-22T14:32:26.9315145Z 	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:58)
2026-07-22T14:32:26.9315468Z 2026-07-22T09:00:38.482-03:00  INFO 8 --- [simil-api] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-07-22T14:32:26.9315851Z 2026-07-22T09:00:38.502-03:00  INFO 8 --- [simil-api] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 12 ms. Found 0 JPA repository interfaces.
2026-07-22T14:32:26.9316210Z 2026-07-22T09:00:40.097-03:00  INFO 8 --- [simil-api] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-07-22T14:32:26.9316532Z 2026-07-22T09:00:40.107-03:00  INFO 8 --- [simil-api] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-07-22T14:32:26.9316915Z 2026-07-22T09:00:40.108-03:00  INFO 8 --- [simil-api] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.26]
2026-07-22T14:32:26.9317246Z 2026-07-22T09:00:40.278-03:00  INFO 8 --- [simil-api] [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-07-22T14:32:26.9317825Z 2026-07-22T09:00:40.278-03:00  INFO 8 --- [simil-api] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 4304 ms
2026-07-22T14:32:26.9318973Z java.lang.NoSuchMethodError: 'javax.servlet.ServletContext org.springframework.web.context.WebApplicationContext.getServletContext()'
2026-07-22T14:32:26.9319504Z 	at co.elastic.apm.agent.springwebmvc.SpringServiceNameInstrumentation$SpringServiceNameAdvice.afterInitPropertySources(SpringServiceNameInstrumentation.java:82)
2026-07-22T14:32:26.9319773Z 	at org.springframework.web.context.support.GenericWebApplicationContext.initPropertySources(GenericWebApplicationContext.java:214)
2026-07-22T14:32:26.9320023Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.createWebServer(ServletWebServerApplicationContext.java:203)
2026-07-22T14:32:26.9320273Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.onRefresh(ServletWebServerApplicationContext.java:162)
2026-07-22T14:32:26.9320508Z 	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:619)
2026-07-22T14:32:26.9320726Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146)
2026-07-22T14:32:26.9320938Z 	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:754)
2026-07-22T14:32:26.9321185Z 	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:456)
2026-07-22T14:32:26.9321373Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:335)
2026-07-22T14:32:26.9321552Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1363)
2026-07-22T14:32:26.9321718Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1352)
2026-07-22T14:32:26.9321901Z 	at br.gov.caixa.simil.api.SimilApiApplication.main(SimilApiApplication.java:12)
2026-07-22T14:32:26.9322072Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-22T14:32:26.9322256Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-07-22T14:32:26.9322469Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-22T14:32:26.9322645Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-07-22T14:32:26.9322812Z 	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:91)
2026-07-22T14:32:26.9322985Z 	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:53)
2026-07-22T14:32:26.9323162Z 	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:58)
2026-07-22T14:32:26.9323460Z 2026-07-22T09:00:41.093-03:00  INFO 8 --- [simil-api] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-07-22T14:32:26.9323939Z 2026-07-22T09:00:41.413-03:00  INFO 8 --- [simil-api] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection org.postgresql.jdbc.PgConnection@74cff17c
2026-07-22T14:32:26.9324273Z 2026-07-22T09:00:41.470-03:00  INFO 8 --- [simil-api] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2026-07-22T14:32:26.9325163Z 2026-07-22T09:00:41.705-03:00  INFO 8 --- [simil-api] [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2026-07-22T14:32:26.9325569Z 2026-07-22T09:00:41.877-03:00  INFO 8 --- [simil-api] [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.5.2.Final
2026-07-22T14:32:26.9325943Z 2026-07-22T09:00:41.908-03:00  INFO 8 --- [simil-api] [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2026-07-22T14:32:26.9326280Z 2026-07-22T09:00:42.511-03:00  INFO 8 --- [simil-api] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-07-22T14:32:26.9326808Z 2026-07-22T09:00:42.669-03:00  WARN 8 --- [simil-api] [           main] org.hibernate.dialect.Dialect            : HHH000511: The 9.1.14 version for [org.hibernate.dialect.PostgreSQLDialect] is no longer supported, hence certain features may not work properly. The minimum supported version is 12.0.0. Check the community dialects project for available legacy versions.
2026-07-22T14:32:26.9327382Z 2026-07-22T09:00:42.676-03:00  WARN 8 --- [simil-api] [           main] org.hibernate.orm.deprecation            : HHH90000025: PostgreSQLDialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-07-22T14:32:26.9328102Z 2026-07-22T09:00:43.369-03:00  INFO 8 --- [simil-api] [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-07-22T14:32:26.9328826Z 2026-07-22T09:00:43.375-03:00  INFO 8 --- [simil-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-07-22T14:32:26.9329352Z 2026-07-22T09:00:43.873-03:00  WARN 8 --- [simil-api] [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-07-22T14:32:26.9329764Z 2026-07-22T09:00:45.503-03:00  INFO 8 --- [simil-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 1 endpoint beneath base path '/actuator'
2026-07-22T14:32:26.9330110Z 2026-07-22T09:00:45.703-03:00  INFO 8 --- [simil-api] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
2026-07-22T14:32:26.9330474Z 2026-07-22T09:00:45.774-03:00  INFO 8 --- [simil-api] [           main] b.g.caixa.simil.api.SimilApiApplication  : Started SimilApiApplication in 11.086 seconds (process running for 13.964)
2026-07-22T14:32:26.9330866Z 2026-07-22 09:01:03,719 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9331374Z 2026-07-22 09:01:18,690 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9331936Z 2026-07-22 09:01:18,691 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9332735Z 2026-07-22 09:01:33,706 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9333246Z 2026-07-22 09:01:33,706 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9333672Z 2026-07-22T09:01:37.174-03:00  INFO 8 --- [simil-api] [0.0-8080-exec-2] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-07-22T14:32:26.9334095Z 2026-07-22T09:01:37.174-03:00  INFO 8 --- [simil-api] [0.0-8080-exec-2] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2026-07-22T14:32:26.9334423Z 2026-07-22T09:01:37.175-03:00  INFO 8 --- [simil-api] [0.0-8080-exec-2] o.s.web.servlet.DispatcherServlet        : Completed initialization in 1 ms
2026-07-22T14:32:26.9336483Z 2026-07-22 09:01:49,752 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9337342Z 2026-07-22 09:01:49,752 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9337911Z 2026-07-22 09:02:08,737 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9338827Z 2026-07-22 09:02:08,737 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9339326Z 2026-07-22 09:02:33,558 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9339815Z 2026-07-22 09:02:33,558 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9340328Z 2026-07-22 09:03:04,063 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9340759Z 2026-07-22 09:03:04,063 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9341257Z 2026-07-22 09:03:43,834 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9341926Z 2026-07-22 09:03:43,834 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9342675Z 2026-07-22 09:04:37,040 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9343205Z 2026-07-22 09:04:37,040 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9343774Z 2026-07-22 09:05:25,317 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9344276Z 2026-07-22 09:05:25,317 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9344776Z 2026-07-22 09:06:19,072 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9345201Z 2026-07-22 09:06:19,072 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9345619Z 2026-07-22 09:06:33,738 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9346091Z 2026-07-22 09:07:09,712 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9346519Z 2026-07-22 09:07:09,712 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9347320Z 2026-07-22 09:07:57,290 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9347769Z 2026-07-22 09:07:57,290 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9348253Z 2026-07-22 09:08:51,811 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9348673Z 2026-07-22 09:08:51,811 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9349164Z 2026-07-22 09:09:42,649 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9349648Z 2026-07-22 09:09:42,649 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9350138Z 2026-07-22 09:10:34,479 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9350563Z 2026-07-22 09:10:34,480 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9351056Z 2026-07-22 09:11:25,686 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9351526Z 2026-07-22 09:11:25,686 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9351941Z 2026-07-22 09:12:03,756 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9352410Z 2026-07-22 09:12:19,007 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9353456Z 2026-07-22 09:12:19,007 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9354038Z 2026-07-22 09:13:12,153 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9354468Z 2026-07-22 09:13:12,153 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9354968Z 2026-07-22 09:14:06,131 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9355395Z 2026-07-22 09:14:06,132 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9355893Z 2026-07-22 09:14:56,946 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9356321Z 2026-07-22 09:14:56,946 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9356812Z 2026-07-22 09:15:45,591 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9357231Z 2026-07-22 09:15:45,591 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9357716Z 2026-07-22 09:16:36,148 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9358144Z 2026-07-22 09:16:36,148 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9358692Z 2026-07-22 09:17:27,139 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9359118Z 2026-07-22 09:17:27,139 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9359552Z 2026-07-22 09:17:33,787 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9360076Z 2026-07-22 09:18:16,002 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9360498Z 2026-07-22 09:18:16,002 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9360982Z 2026-07-22 09:19:06,073 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9361471Z 2026-07-22 09:19:06,073 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9362021Z 2026-07-22 09:19:56,965 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9362447Z 2026-07-22 09:19:56,965 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9362935Z 2026-07-22 09:20:45,103 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9363357Z 2026-07-22 09:20:45,103 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9363920Z 2026-07-22 09:21:38,229 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9364352Z 2026-07-22 09:21:38,229 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9364843Z 2026-07-22 09:22:26,151 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9365265Z 2026-07-22 09:22:26,152 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9365692Z 2026-07-22 09:23:03,815 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9366180Z 2026-07-22 09:23:16,346 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9366606Z 2026-07-22 09:23:16,346 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9367142Z 2026-07-22 09:24:08,855 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9367563Z 2026-07-22 09:24:08,856 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9368040Z 2026-07-22 09:25:03,075 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9368460Z 2026-07-22 09:25:03,075 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9369013Z 2026-07-22 09:25:50,497 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9369437Z 2026-07-22 09:25:50,497 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9369923Z 2026-07-22 09:26:39,883 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9370346Z 2026-07-22 09:26:39,883 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9370876Z 2026-07-22 09:27:30,710 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9371314Z 2026-07-22 09:27:30,711 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9371796Z 2026-07-22 09:28:21,555 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9372260Z 2026-07-22 09:28:21,555 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9372592Z 2026-07-22 09:28:33,846 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9373064Z 2026-07-22 09:29:09,493 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9373577Z 2026-07-22 09:29:09,493 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9374084Z 2026-07-22 09:29:58,075 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9374515Z 2026-07-22 09:29:58,076 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9375001Z 2026-07-22 09:30:49,230 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9375428Z 2026-07-22 09:30:49,230 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9375923Z 2026-07-22 09:31:43,426 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9376348Z 2026-07-22 09:31:43,426 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9376826Z 2026-07-22 09:32:35,671 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9377259Z 2026-07-22 09:32:35,672 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9377744Z 2026-07-22 09:33:29,081 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9378171Z 2026-07-22 09:33:29,081 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9378510Z 2026-07-22 09:34:03,871 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9378987Z 2026-07-22 09:34:22,176 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9379451Z 2026-07-22 09:34:22,176 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9379938Z 2026-07-22 09:35:10,682 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9380395Z 2026-07-22 09:35:10,682 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9380888Z 2026-07-22 09:36:03,451 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9381322Z 2026-07-22 09:36:03,451 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9381804Z 2026-07-22 09:36:56,949 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9382230Z 2026-07-22 09:36:56,949 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9382712Z 2026-07-22 09:37:49,655 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9383210Z 2026-07-22 09:37:49,655 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9384037Z 2026-07-22 09:38:44,102 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9384527Z 2026-07-22 09:38:44,102 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9384907Z 2026-07-22 09:39:33,883 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9385400Z 2026-07-22 09:39:36,710 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9385833Z 2026-07-22 09:39:36,711 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9386427Z 2026-07-22 09:40:28,870 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9386843Z 2026-07-22 09:40:28,871 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9387352Z 2026-07-22 09:41:23,078 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9387812Z 2026-07-22 09:41:23,079 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9388296Z 2026-07-22 09:42:13,731 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9388707Z 2026-07-22 09:42:13,731 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9389192Z 2026-07-22 09:43:01,332 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9389612Z 2026-07-22 09:43:01,332 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9390100Z 2026-07-22 09:43:55,884 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9392461Z 2026-07-22 09:43:55,884 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9393242Z 2026-07-22 09:44:44,544 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9393821Z 2026-07-22 09:44:44,544 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9394163Z 2026-07-22 09:45:03,913 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9394717Z 2026-07-22 09:45:39,131 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9395142Z 2026-07-22 09:45:39,131 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9395694Z 2026-07-22 09:46:26,669 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9396124Z 2026-07-22 09:46:26,669 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9396648Z 2026-07-22 09:47:15,890 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9397069Z 2026-07-22 09:47:15,890 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9397592Z 2026-07-22 09:48:06,624 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9398076Z 2026-07-22 09:48:06,625 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9398564Z 2026-07-22 09:48:58,356 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9398991Z 2026-07-22 09:48:58,356 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9399477Z 2026-07-22 09:49:52,101 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9399900Z 2026-07-22 09:49:52,101 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9400233Z 2026-07-22 09:50:33,945 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9400706Z 2026-07-22 09:50:42,128 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9401126Z 2026-07-22 09:50:42,128 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9401611Z 2026-07-22 09:51:30,645 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9402083Z 2026-07-22 09:51:30,645 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9402791Z 2026-07-22 09:52:24,648 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9403273Z 2026-07-22 09:52:24,649 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9403942Z 2026-07-22 09:53:17,642 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9404372Z 2026-07-22 09:53:17,642 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9404854Z 2026-07-22 09:54:08,041 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9405353Z 2026-07-22 09:54:08,041 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9405850Z 2026-07-22 09:54:59,997 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9406272Z 2026-07-22 09:54:59,997 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9406754Z 2026-07-22 09:55:51,061 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9407171Z 2026-07-22 09:55:51,061 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9407510Z 2026-07-22 09:56:03,977 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9407974Z 2026-07-22 09:56:39,330 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9408441Z 2026-07-22 09:56:39,330 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9408940Z 2026-07-22 09:57:28,330 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9409418Z 2026-07-22 09:57:28,330 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9409901Z 2026-07-22 09:58:20,080 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9410360Z 2026-07-22 09:58:20,080 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9410904Z 2026-07-22 09:59:14,694 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9411318Z 2026-07-22 09:59:14,694 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9411798Z 2026-07-22 10:00:05,233 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9412213Z 2026-07-22 10:00:05,233 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9412913Z 2026-07-22 10:00:55,519 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9413374Z 2026-07-22 10:00:55,519 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9413777Z 2026-07-22 10:01:34,009 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9414244Z 2026-07-22 10:01:46,753 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9414672Z 2026-07-22 10:01:46,753 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9415158Z 2026-07-22 10:02:36,838 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9415647Z 2026-07-22 10:02:36,838 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9416143Z 2026-07-22 10:03:28,093 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9416628Z 2026-07-22 10:03:28,094 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9417122Z 2026-07-22 10:04:19,414 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9417629Z 2026-07-22 10:04:19,414 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9418127Z 2026-07-22 10:05:11,348 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9418546Z 2026-07-22 10:05:11,348 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9419202Z 2026-07-22 10:06:02,524 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9419639Z 2026-07-22 10:06:02,524 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9420108Z 2026-07-22 10:06:52,339 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9420667Z 2026-07-22 10:06:52,339 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9421004Z 2026-07-22 10:07:04,041 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9421469Z 2026-07-22 10:07:45,713 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9421890Z 2026-07-22 10:07:45,713 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9422371Z 2026-07-22 10:08:36,315 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9423002Z 2026-07-22 10:08:36,315 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9423652Z 2026-07-22 10:09:24,356 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9424083Z 2026-07-22 10:09:24,356 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9424571Z 2026-07-22 10:10:15,798 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9425030Z 2026-07-22 10:10:15,798 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9425519Z 2026-07-22 10:11:08,488 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9425939Z 2026-07-22 10:11:08,489 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9426422Z 2026-07-22 10:12:00,838 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9426845Z 2026-07-22 10:12:00,838 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9427172Z 2026-07-22 10:12:34,072 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9427638Z 2026-07-22 10:12:52,168 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9428044Z 2026-07-22 10:12:52,168 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9428530Z 2026-07-22 10:13:39,932 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9428943Z 2026-07-22 10:13:39,932 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9429425Z 2026-07-22 10:14:31,907 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9429845Z 2026-07-22 10:14:31,907 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9430367Z 2026-07-22 10:15:21,926 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9430874Z 2026-07-22 10:15:21,926 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9431420Z 2026-07-22 10:16:16,270 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9431843Z 2026-07-22 10:16:16,270 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9432333Z 2026-07-22 10:17:04,384 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9432998Z 2026-07-22 10:17:04,384 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9433700Z 2026-07-22 10:17:56,378 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9434221Z 2026-07-22 10:17:56,378 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9434552Z 2026-07-22 10:18:04,094 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9435022Z 2026-07-22 10:18:48,821 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9435436Z 2026-07-22 10:18:48,821 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9435924Z 2026-07-22 10:19:36,276 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9436338Z 2026-07-22 10:19:36,277 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9436824Z 2026-07-22 10:20:27,994 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9437321Z 2026-07-22 10:20:27,994 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9437804Z 2026-07-22 10:21:18,612 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9438227Z 2026-07-22 10:21:18,612 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9438748Z 2026-07-22 10:22:10,509 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9439153Z 2026-07-22 10:22:10,509 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9439627Z 2026-07-22 10:23:01,574 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9440042Z 2026-07-22 10:23:01,574 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9440374Z 2026-07-22 10:23:34,122 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9440844Z 2026-07-22 10:23:50,511 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9441258Z 2026-07-22 10:23:50,512 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9441733Z 2026-07-22 10:24:44,956 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9442792Z 2026-07-22 10:24:44,956 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9443356Z 2026-07-22 10:25:37,692 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9443858Z 2026-07-22 10:25:37,693 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9444354Z 2026-07-22 10:26:28,490 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9444816Z 2026-07-22 10:26:28,490 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9445295Z 2026-07-22 10:27:22,695 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9445744Z 2026-07-22 10:27:22,695 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9446230Z 2026-07-22 10:28:11,159 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9446647Z 2026-07-22 10:28:11,159 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9447037Z 2026-07-22 10:29:04,153 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9447512Z 2026-07-22 10:29:04,765 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9447939Z 2026-07-22 10:29:04,765 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9448423Z 2026-07-22 10:29:54,520 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9448842Z 2026-07-22 10:29:54,520 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9449324Z 2026-07-22 10:30:48,026 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9449744Z 2026-07-22 10:30:48,026 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9450222Z 2026-07-22 10:31:39,216 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9450640Z 2026-07-22 10:31:39,216 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9451124Z 2026-07-22 10:32:27,675 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9451644Z 2026-07-22 10:32:27,675 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9452136Z 2026-07-22 10:33:16,741 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9452653Z 2026-07-22 10:33:16,741 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9453251Z 2026-07-22 10:34:07,437 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9453772Z 2026-07-22 10:34:07,437 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9454175Z 2026-07-22 10:34:34,176 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9454727Z 2026-07-22 10:34:58,810 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9455198Z 2026-07-22 10:34:58,810 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9455674Z 2026-07-22 10:35:52,023 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9456144Z 2026-07-22 10:35:52,023 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9456680Z 2026-07-22 10:36:42,178 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9457157Z 2026-07-22 10:36:42,178 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9457652Z 2026-07-22 10:37:35,142 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9458085Z 2026-07-22 10:37:35,142 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9458733Z 2026-07-22 10:38:26,772 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9459184Z 2026-07-22 10:38:26,772 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9459691Z 2026-07-22 10:39:15,443 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9460163Z 2026-07-22 10:39:15,443 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9460550Z 2026-07-22 10:40:04,208 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9461065Z 2026-07-22 10:40:07,310 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9461495Z 2026-07-22 10:40:07,311 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9462002Z 2026-07-22 10:40:56,598 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9462473Z 2026-07-22 10:40:56,598 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9463056Z 2026-07-22 10:41:46,952 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9463562Z 2026-07-22 10:41:46,952 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9464082Z 2026-07-22 10:42:38,963 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9464507Z 2026-07-22 10:42:38,963 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9464984Z 2026-07-22 10:43:27,388 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9465431Z 2026-07-22 10:43:27,388 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9466088Z 2026-07-22 10:44:17,583 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9466555Z 2026-07-22 10:44:17,583 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9467078Z 2026-07-22 10:45:09,583 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9467545Z 2026-07-22 10:45:09,583 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9467879Z 2026-07-22 10:45:34,237 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9468345Z 2026-07-22 10:46:01,066 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9468831Z 2026-07-22 10:46:01,066 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9469318Z 2026-07-22 10:46:53,359 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9469736Z 2026-07-22 10:46:53,359 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9470217Z 2026-07-22 10:47:45,596 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9470627Z 2026-07-22 10:47:45,597 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9471114Z 2026-07-22 10:48:34,456 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9471623Z 2026-07-22 10:48:34,456 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9472225Z 2026-07-22 10:49:28,435 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9472692Z 2026-07-22 10:49:28,435 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9473293Z 2026-07-22 10:50:18,650 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9473816Z 2026-07-22 10:50:18,650 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9474185Z 2026-07-22 10:51:04,268 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9474672Z 2026-07-22 10:51:06,867 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9475131Z 2026-07-22 10:51:06,867 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9475670Z 2026-07-22 10:51:55,733 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9476134Z 2026-07-22 10:51:55,733 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9476631Z 2026-07-22 10:52:47,592 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9477105Z 2026-07-22 10:52:47,592 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9477646Z 2026-07-22 10:53:39,404 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9478109Z 2026-07-22 10:53:39,405 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9478600Z 2026-07-22 10:54:27,419 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9479033Z 2026-07-22 10:54:27,419 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9479516Z 2026-07-22 10:55:17,863 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9479991Z 2026-07-22 10:55:17,863 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9480521Z 2026-07-22 10:56:07,126 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9480968Z 2026-07-22 10:56:07,126 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9481337Z 2026-07-22 10:56:34,292 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9481838Z 2026-07-22 10:56:59,682 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9482262Z 2026-07-22 10:56:59,682 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9482801Z 2026-07-22 10:57:50,629 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9483272Z 2026-07-22 10:57:50,629 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9483836Z 2026-07-22 10:58:40,086 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9484356Z 2026-07-22 10:58:40,086 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9484837Z 2026-07-22 10:59:32,210 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9485277Z 2026-07-22 10:59:32,210 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9485805Z 2026-07-22 11:00:24,134 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9486242Z 2026-07-22 11:00:24,134 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9486772Z 2026-07-22 11:01:12,116 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9487287Z 2026-07-22 11:01:12,116 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9487764Z 2026-07-22 11:02:01,772 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9488251Z 2026-07-22 11:02:01,772 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9488585Z 2026-07-22 11:02:04,318 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9489107Z 2026-07-22 11:02:51,871 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9489563Z 2026-07-22 11:02:51,871 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9490072Z 2026-07-22 11:03:45,991 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9490507Z 2026-07-22 11:03:45,991 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9491005Z 2026-07-22 11:04:35,130 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9491448Z 2026-07-22 11:04:35,130 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9491962Z 2026-07-22 11:05:29,431 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9492506Z 2026-07-22 11:05:29,431 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9493068Z 2026-07-22 11:06:23,900 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9493590Z 2026-07-22 11:06:23,900 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9494144Z 2026-07-22 11:07:11,924 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9494623Z 2026-07-22 11:07:11,924 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9494998Z 2026-07-22 11:07:34,347 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9495503Z 2026-07-22 11:08:03,530 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9495978Z 2026-07-22 11:08:03,530 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9496476Z 2026-07-22 11:08:52,798 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9497001Z 2026-07-22 11:08:52,798 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9497501Z 2026-07-22 11:09:40,580 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9497969Z 2026-07-22 11:09:40,580 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9498472Z 2026-07-22 11:10:35,141 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9498929Z 2026-07-22 11:10:35,141 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9499430Z 2026-07-22 11:11:28,565 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9500072Z 2026-07-22 11:11:28,565 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9500618Z 2026-07-22 11:12:22,613 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9501059Z 2026-07-22 11:12:22,613 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9501433Z 2026-07-22 11:13:04,378 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9501971Z 2026-07-22 11:13:15,037 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9502442Z 2026-07-22 11:13:15,037 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9502987Z 2026-07-22 11:14:03,113 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9503423Z 2026-07-22 11:14:03,113 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9504018Z 2026-07-22 11:14:52,832 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9504495Z 2026-07-22 11:14:52,832 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9504988Z 2026-07-22 11:15:42,331 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9505450Z 2026-07-22 11:15:42,331 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9505955Z 2026-07-22 11:16:31,092 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9506428Z 2026-07-22 11:16:31,092 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9506921Z 2026-07-22 11:17:19,349 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9507375Z 2026-07-22 11:17:19,349 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9507872Z 2026-07-22 11:18:09,823 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9508406Z 2026-07-22 11:18:09,823 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9508766Z 2026-07-22 11:18:34,404 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9509264Z 2026-07-22 11:18:58,226 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9509750Z 2026-07-22 11:18:58,227 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9510242Z 2026-07-22 11:19:52,781 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9510695Z 2026-07-22 11:19:52,781 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9511200Z 2026-07-22 11:20:46,915 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9511666Z 2026-07-22 11:20:46,915 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9512144Z 2026-07-22 11:21:41,139 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9512607Z 2026-07-22 11:21:41,139 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9513180Z 2026-07-22 11:22:31,536 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9513705Z 2026-07-22 11:22:31,536 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9514230Z 2026-07-22 11:23:19,356 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9514699Z 2026-07-22 11:23:19,357 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9515038Z 2026-07-22 11:24:04,416 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9515617Z 2026-07-22 11:24:08,084 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9516094Z 2026-07-22 11:24:08,085 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9516592Z 2026-07-22 11:24:56,394 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9517051Z 2026-07-22 11:24:56,394 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9517534Z 2026-07-22 11:25:49,842 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9517970Z 2026-07-22 11:25:49,842 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9518491Z 2026-07-22 11:26:42,740 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9518932Z 2026-07-22 11:26:42,740 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9519465Z 2026-07-22 11:27:37,268 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9519905Z 2026-07-22 11:27:37,268 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9520424Z 2026-07-22 11:28:28,801 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9520981Z 2026-07-22 11:28:28,801 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9521494Z 2026-07-22 11:29:21,385 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9521954Z 2026-07-22 11:29:21,385 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9522361Z 2026-07-22 11:29:34,441 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-07-22T14:32:26.9522896Z 2026-07-22 11:30:11,059 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9523321Z 2026-07-22 11:30:11,059 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9523879Z 2026-07-22 11:31:03,103 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9524352Z 2026-07-22 11:31:03,103 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9524835Z 2026-07-22 11:31:57,465 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-07-22T14:32:26.9525284Z 2026-07-22 11:31:57,465 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-07-22T14:32:26.9527973Z ##[section]Finishing: Logs da Aplicação



acabei de rodar uma nova release e ele so cria o de deploy ta falndo o da aplicação




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

Project: simil-des
Pods

Filter

Name
api-des
/
Name
api-des

Name

Status

Ready

Restarts

Owner

Memory

CPU

Created
Pod
P
simil-api-des-4-deploy
Completed
0/1	0	
ReplicationController
RC
simil-api-des-4
-	-	
22 de jul. de 2026, 09:00

Pod
P
simil-api-des-4-f6k6t
Running
1/1	0	
ReplicationController
RC
simil-api-des-4
281,4 MiB	0,001 cores	
22 de jul. de 2026, 09:00

Pod
P
simil-api-des-9-deploy
Running
1/1	0	
ReplicationController
RC
simil-api-des-9
18,4 MiB	-	
22 de jul. de 2026, 14:23

Pod
P
simil-precificacao-api-des-114-deploy
Completed
0/1	0	
ReplicationController
RC
simil-precificacao-api-des-114
-	-	
27 de fev. de 2026, 21:42

Pod
P
simil-precificacao-api-des-115-deploy
Completed
0/1	0	
ReplicationController
RC
simil-precificacao-api-des-115
-	-	
27 de fev. de 2026, 21:48

Pod
P
simil-precificacao-api-des-115-mqlr9
Running
1/1	1	
ReplicationController
RC
simil-precificacao-api-des-115
336,4 MiB	0,002 cores	
27 de fev. de 2026, 21:48

Pod
P
simil-precificacao-internet-api-des-30-deploy
Completed
0/1	0	
ReplicationController
RC
simil-precificacao-internet-api-des-30
-	-	
30 de jun. de 2026, 12:26

Pod
P
simil-precificacao-internet-api-des-31-49wl4
Running
1/1	0	
ReplicationController
RC
simil-precificacao-internet-api-des-31
318,0 MiB	0,001 cores	
18 de jul. de 2026, 09:20

Pod
P
simil-precificacao-internet-api-des-31-deploy
Completed
0/1	0	
ReplicationController
RC
simil-precificacao-internet-api-des-31
-	-	
18 de jul. de 2026, 09:20

Pod
P
simil-precificacao-intranet-api-des-48-deploy
Completed
0/1	0	
ReplicationController
RC
simil-precificacao-intranet-api-des-48
-	-	
20 de jul. de 2026, 10:08

Pod
P
simil-precificacao-intranet-api-des-49-deploy
Completed
0/1	0	
ReplicationController
RC
simil-precificacao-intranet-api-des-49
-	-	
21 de jul. de 2026, 16:44

Pod
P
simil-precificacao-intranet-api-des-49-fp5jm
Running
1/1	0	
ReplicationController
RC
simil-precificacao-intranet-api-des-49
451,3 MiB	0,001 cores	
21 de jul. de 2026, 16:44

