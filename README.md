OKD


Jesse Mouta Pereira Batista

Administrator
Home
Operators
Workloads
Networking
Storage
Builds
Observe
Compute
User Management
Administration

Project: siavl-des
Pods
Pod details
Pod
P
siavl-gestaomodelonota-des-2-856xb
Running

Actions
Details
Metrics
YAML
Environment
Logs
Events
Terminal
Streaming events...
Showing 8 events
Older events are not stored.
PodPsiavl-gestaomodelonota-des-2-856xb
NamespaceNSsiavl-des
29 de out. de 2026, 17:25
Generated from kubelet on ceadecldlx036.nprd.caixa
2 times in the last 0 minutes
Liveness probe failed: HTTP probe failed with statuscode: 401
PodPsiavl-gestaomodelonota-des-2-856xb
NamespaceNSsiavl-des
29 de out. de 2026, 17:25
Generated from kubelet on ceadecldlx036.nprd.caixa
2 times in the last 0 minutes
Readiness probe failed: HTTP probe failed with statuscode: 401
PodPsiavl-gestaomodelonota-des-2-856xb
NamespaceNSsiavl-des
29 de out. de 2026, 17:23
Generated from kubelet on ceadecldlx036.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siavl-gestaomodelonota-backend:0.0.0.7" in 3.545983186s (3.545991401s including waiting)
PodPsiavl-gestaomodelonota-des-2-856xb
NamespaceNSsiavl-des
29 de out. de 2026, 17:23
Generated from kubelet on ceadecldlx036.nprd.caixa
Created container siavl-gestaomodelonota-des
PodPsiavl-gestaomodelonota-des-2-856xb
NamespaceNSsiavl-des
29 de out. de 2026, 17:23
Generated from kubelet on ceadecldlx036.nprd.caixa
Started container siavl-gestaomodelonota-des
PodPsiavl-gestaomodelonota-des-2-856xb
NamespaceNSsiavl-des
29 de out. de 2026, 17:23
Generated from multus
Add eth0 [25.0.16.175/23] from openshift-sdn
PodPsiavl-gestaomodelonota-des-2-856xb
NamespaceNSsiavl-des
29 de out. de 2026, 17:23
Generated from kubelet on ceadecldlx036.nprd.caixa
Pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siavl-gestaomodelonota-backend:0.0.0.7"
PodPsiavl-gestaomodelonota-des-2-856xb
NamespaceNSsiavl-des
29 de out. de 2026, 17:23
Generated from default-scheduler
Successfully assigned siavl-des/siavl-gestaomodelonota-des-2-856xb to ceadecldlx036.nprd.caixa



exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/SIAVL-gestaomodelonota-backend.jar
WARNING: A Java agent has been loaded dynamically (/tmp/otel-agent3225214328465301285/agent.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-10-29 17:24:03.979-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.7.9 started successfully (PID 8, JVM running for 5.499 s)
2026-10-29 17:24:03.990-03:00 INFO  c.m.applicationinsights.agent - Java version: 21.0.1, vendor: Oracle Corporation, home: /usr/java/jdk-21.0.1
Standard Commons Logging discovery in action with spring-jcl: please remove commons-logging.jar from classpath in order to avoid potential conflicts

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::               (v3.5.16)

2026-10-29T17:24:07.769-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] b.g.c.s.gestaomodelonota.RunApplication  : Starting RunApplication using Java 21.0.1 with PID 8 (/deployments/SIAVL-gestaomodelonota-backend.jar started by 185 in /deployments)
2026-10-29T17:24:07.791-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] b.g.c.s.gestaomodelonota.RunApplication  : No active profile set, falling back to 1 default profile: "default"
2026-10-29 17:24:09.197-03:00 WARN  c.m.a.a.i.p.PerformanceMonitoringService - INITIALISING JFR PROFILING SUBSYSTEM THIS FEATURE IS IN BETA
2026-10-29T17:24:11.411-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-10-29T17:24:11.672-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 193 ms. Found 15 JPA repository interfaces.
2026-10-29T17:24:12.211-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=8d84986f-f55e-309d-8e2d-d769bc48fb29
2026-10-29T17:24:13.313-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-10-29T17:24:13.404-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-10-29T17:24:13.404-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.55]
2026-10-29T17:24:13.501-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-10-29T17:24:13.502-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 5595 ms
Standard Commons Logging discovery in action with spring-jcl: please remove commons-logging.jar from classpath in order to avoid potential conflicts
2026-10-29T17:24:13.699-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] i.m.c.instrument.push.PushMeterRegistry  : publishing metrics for AzureMonitorMeterRegistry every 1m
2026-10-29T17:24:15.080-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2026-10-29T17:24:15.184-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.6.53.Final
2026-10-29T17:24:15.277-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2026-10-29T17:24:15.805-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-10-29T17:24:15.888-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-10-29T17:24:17.281-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection oracle.jdbc.driver.T4CConnection@373c367
2026-10-29T17:24:17.284-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2026-10-29T17:24:17.909-03:00  WARN [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] org.hibernate.orm.deprecation            : HHH90000025: OracleDialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-10-29T17:24:18.192-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
	Database JDBC URL [Connecting through datasource 'HikariDataSource (HikariPool-1)']
	Database driver: undefined/unknown
	Database version: 19.33
	Autocommit mode: undefined/unknown
	Isolation level: undefined/unknown
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown
2026-10-29T17:24:21.100-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-10-29T17:24:21.104-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-10-29T17:24:21.871-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] o.s.d.j.r.query.QueryEnhancerFactory     : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-10-29T17:24:23.811-03:00  WARN [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-10-29T17:24:25.788-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 3 endpoints beneath base path '/actuator'
2026-10-29T17:24:26.182-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
2026-10-29T17:24:26.197-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [           main] b.g.c.s.gestaomodelonota.RunApplication  : Started RunApplication in 20.715 seconds (process running for 27.718)
2026-10-29T17:25:02.676-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [0.0-8080-exec-2] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-10-29T17:25:02.676-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [0.0-8080-exec-2] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2026-10-29T17:25:02.678-03:00  INFO [correlationId=] 8 --- [SIAVL-gestaomodelonota-backend] [0.0-8080-exec-2] o.s.web.servlet.DispatcherServlet        : Completed initialization in 1 ms
