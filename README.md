
Operators
Workloads
Networking
Storage
Builds
Observe
Compute
User Management
Administration

Project: sicmo-des
DeploymentConfigs
DeploymentConfig details
DeploymentConfig
DC
sicmo-internet-des

Actions
Details
YAML
ReplicationControllers
Pods
Environment
Events

Filter

Name
Search by name...
/

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
sicmo-internet-des-98-5dg4m
Running
1/1	0	
ReplicationController
RC
sicmo-internet-des-98
115,0 MiB	-	
6 de out. de 2026, 14:24




exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sicmo-internet -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sicmo-internet -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/sicmo-backend.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.
    
    
     ____    ___    ____   __  __    ___  
    / ___|  |_ _|  / ___| |  \/  |  / _ \ 
    \___ \   | |  | |     | |\/| | | | | |
     ___) |  | |  | |___  | |  | | | |_| |
    |____/  |___|  \____| |_|  |_|  \___/ 
    
    
                                       
2026-10-06 14:24:54.902  INFO 8 --- [           main] br.com.caixa.sicmo.Application           : Starting Application v2.0.0 using Java 17.0.7 on sicmo-internet-des-98-5dg4m with PID 8 (/deployments/sicmo-backend.jar started by 1001 in /deployments)
2026-10-06 14:24:54.908 DEBUG 8 --- [           main] br.com.caixa.sicmo.Application           : Running with Spring Boot v2.6.1, Spring v5.3.13
2026-10-06 14:24:54.909  INFO 8 --- [           main] br.com.caixa.sicmo.Application           : No active profile set, falling back to default profiles: default
2026-10-06 14:24:57.267  INFO 8 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-10-06 14:24:57.871  INFO 8 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 594 ms. Found 55 JPA repository interfaces.
2026-10-06 14:25:01.079  INFO 8 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2026-10-06 14:25:01.089  INFO 8 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-10-06 14:25:01.089  INFO 8 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.55]
2026-10-06 14:25:01.189  INFO 8 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-10-06 14:25:01.189  INFO 8 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 6112 ms
2026-10-06 14:25:02.068  WARN 8 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-10-06 14:25:02.578  INFO 8 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2026-10-06 14:25:02.701  INFO 8 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.6.1.Final
2026-10-06 14:25:03.109  INFO 8 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2026-10-06 14:25:03.405  INFO 8 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-10-06 14:25:04.091  INFO 8 --- [           main] com.zaxxer.hikari.pool.PoolBase          : HikariPool-1 - Driver does not support get/set network timeout for connections. (Receiver class com.microsoft.sqlserver.jdbc.SQLServerConnection does not define or inherit an implementation of the resolved method 'abstract int getNetworkTimeout()' of interface java.sql.Connection.)
2026-10-06 14:25:04.202  INFO 8 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2026-10-06 14:25:04.285  INFO 8 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.SQLServer2012Dialect
2026-10-06 14:25:08.676  INFO 8 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2026-10-06 14:25:08.688  INFO 8 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-10-06 14:25:10.403  INFO 8 --- [           main] o.s.boot.web.servlet.RegistrationBean    : Filter errorPageFilter was not registered (disabled)
2026-10-06 14:25:10.476 DEBUG 8 --- [           main] b.c.c.s.u.i.log.SpringLoggingFilter      : Filter 'loggingFilter' configured for use
2026-10-06 14:25:17.490  INFO 8 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will secure any request with [org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter@40032b7b, org.springframework.security.web.context.SecurityContextPersistenceFilter@3129792a, org.springframework.security.web.header.HeaderWriterFilter@67857a20, org.keycloak.adapters.springsecurity.filter.KeycloakPreAuthActionsFilter@25762f04, org.keycloak.adapters.springsecurity.filter.KeycloakAuthenticationProcessingFilter@350d9d23, org.springframework.security.web.authentication.logout.LogoutFilter@68e8bbab, org.springframework.security.web.savedrequest.RequestCacheAwareFilter@373c367, org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter@294aaa6, org.keycloak.adapters.springsecurity.filter.KeycloakSecurityContextRequestFilter@2932721e, org.keycloak.adapters.springsecurity.filter.KeycloakAuthenticatedActionsFilter@5a6d4dee, org.springframework.security.web.authentication.AnonymousAuthenticationFilter@5317a7ef, org.springframework.security.web.session.SessionManagementFilter@45cce4c2, org.springframework.security.web.access.ExceptionTranslationFilter@273c4b3, org.springframework.security.web.access.intercept.FilterSecurityInterceptor@753cfae3]
2026-10-06 14:25:20.701  INFO 8 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 1 endpoint(s) beneath base path '/api'
2026-10-06 14:25:20.885  INFO 8 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2026-10-06 14:25:20.903  INFO 8 --- [           main] br.com.caixa.sicmo.Application           : Started Application in 27.127 seconds (JVM running for 30.122)
2026-10-06 14:25:22,903 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-10-06 14:25:37,801 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-10-06 14:25:37,802 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out

