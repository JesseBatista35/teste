2026-07-21T19:39:01.9501955Z ##[section]Starting: Verificando Status do Deployment
2026-07-21T19:39:01.9504859Z ==============================================================================
2026-07-21T19:39:01.9504949Z Task         : Bash
2026-07-21T19:39:01.9504990Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-21T19:39:01.9505047Z Version      : 3.227.0
2026-07-21T19:39:01.9505098Z Author       : Microsoft Corporation
2026-07-21T19:39:01.9505147Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-21T19:39:01.9505225Z ==============================================================================
2026-07-21T19:39:02.8020698Z Generating script.
2026-07-21T19:39:02.8030977Z ========================== Starting Command Output ===========================
2026-07-21T19:39:02.8037936Z [command]/bin/bash /opt/ads-agent/_work/_temp/a6188194-777e-4c9e-b4e3-8a1ea146d7cd.sh
2026-07-21T19:39:03.0034514Z Waiting for rollout to finish: 0 of 1 updated replicas are available...
2026-07-21T19:45:09.4607166Z ##[error]The task has timed out.
2026-07-21T19:45:09.4609278Z ##[section]Finishing: Verificando Status do Deployment



2026-07-21T19:45:09.4638454Z ##[section]Starting: Logs da Aplicação
2026-07-21T19:45:09.4642876Z ==============================================================================
2026-07-21T19:45:09.4642998Z Task         : Bash
2026-07-21T19:45:09.4643071Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-21T19:45:09.4643784Z Version      : 3.227.0
2026-07-21T19:45:09.4643847Z Author       : Microsoft Corporation
2026-07-21T19:45:09.4643934Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-21T19:45:09.4644036Z ==============================================================================
2026-07-21T19:45:10.3396438Z Generating script.
2026-07-21T19:45:10.3407173Z ========================== Starting Command Output ===========================
2026-07-21T19:45:10.3414311Z [command]/bin/bash /opt/ads-agent/_work/_temp/51a42aff-e18f-4fcf-82f1-1b0687975095.sh
2026-07-21T19:45:10.3459977Z + shopt -s expand_aliases
2026-07-21T19:45:10.3461772Z + [[ -n okd4_nprd ]]
2026-07-21T19:45:10.3469221Z + [[ okd4_nprd =~ ocp ]]
2026-07-21T19:45:10.3469378Z + [[ -n okd4_nprd ]]
2026-07-21T19:45:10.3472591Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-07-21T19:45:10.3473105Z + app=siavl-gerencial-backend-des
2026-07-21T19:45:10.3474302Z + oc version
2026-07-21T19:45:10.4726333Z oc v3.11.0+0cbc58b
2026-07-21T19:45:10.4726928Z kubernetes v1.11.0+d4cacc0
2026-07-21T19:45:10.4727773Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-07-21T19:45:10.4808104Z 
2026-07-21T19:45:10.4808601Z Server https://api.nprd.caixa:6443
2026-07-21T19:45:10.4808898Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-07-21T19:45:10.4839035Z ++ oc get pod -l name=siavl-gerencial-backend-des -n siavl-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-07-21T19:45:10.4840278Z ++ tac
2026-07-21T19:45:10.4841476Z ++ grep -v '^$'
2026-07-21T19:45:10.4841769Z ++ head -n1
2026-07-21T19:45:10.6912313Z + last_pod=siavl-gerencial-backend-des-17-dpbp9
2026-07-21T19:45:10.6912729Z + echo 'Logs do POD: siavl-gerencial-backend-des-17-dpbp9'
2026-07-21T19:45:10.6913071Z + oc logs siavl-gerencial-backend-des-17-dpbp9 -c siavl-gerencial-backend-des -n siavl-des
2026-07-21T19:45:10.6913375Z Logs do POD: siavl-gerencial-backend-des-17-dpbp9
2026-07-21T19:45:10.9677253Z exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=siavl-gerencial-backend -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos4.caixa -Delastic.apm.global_labels=deployment=siavl-gerencial-backend -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/SIAVL-gerencial-backend.jar
2026-07-21T19:45:10.9677982Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-21T19:45:10.9678183Z WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.
2026-07-21T19:45:10.9678313Z Failed to start agent
2026-07-21T19:45:10.9678541Z java.lang.reflect.InvocationTargetException
2026-07-21T19:45:10.9678720Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:118)
2026-07-21T19:45:10.9680758Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-07-21T19:45:10.9681055Z 	at co.elastic.apm.agent.premain.AgentMain.loadAndInitializeAgent(AgentMain.java:155)
2026-07-21T19:45:10.9681255Z 	at co.elastic.apm.agent.premain.AgentMain.init(AgentMain.java:100)
2026-07-21T19:45:10.9681438Z 	at co.elastic.apm.agent.premain.AgentMain.premain(AgentMain.java:56)
2026-07-21T19:45:10.9681626Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-07-21T19:45:10.9681818Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-07-21T19:45:10.9682354Z 	at java.instrument/sun.instrument.InstrumentationImpl.loadClassAndStartAgent(InstrumentationImpl.java:560)
2026-07-21T19:45:10.9692309Z 	at java.instrument/sun.instrument.InstrumentationImpl.loadClassAndCallPremain(InstrumentationImpl.java:572)
2026-07-21T19:45:10.9693159Z Caused by: java.lang.RuntimeException: java.lang.UnsupportedOperationException: Could not access Unsafe class: sun.misc.Unsafe.defineClass(java.lang.String,[B,int,int,java.lang.ClassLoader,java.security.ProtectionDomain)
2026-07-21T19:45:10.9693880Z 	at co.elastic.apm.agent.bci.IndyBootstrap.getIndyBootstrapMethod(IndyBootstrap.java:221)
2026-07-21T19:45:10.9694117Z 	at co.elastic.apm.agent.bci.ElasticApmAgent.getTransformer(ElasticApmAgent.java:436)
2026-07-21T19:45:10.9694312Z 	at co.elastic.apm.agent.bci.ElasticApmAgent.applyAdvice(ElasticApmAgent.java:398)
2026-07-21T19:45:10.9694494Z 	at co.elastic.apm.agent.bci.ElasticApmAgent.initAgentBuilder(ElasticApmAgent.java:321)
2026-07-21T19:45:10.9694688Z 	at co.elastic.apm.agent.bci.ElasticApmAgent.initInstrumentation(ElasticApmAgent.java:267)
2026-07-21T19:45:10.9694889Z 	at co.elastic.apm.agent.bci.ElasticApmAgent.initInstrumentation(ElasticApmAgent.java:171)
2026-07-21T19:45:10.9695146Z 	at co.elastic.apm.agent.bci.ElasticApmAgent.initialize(ElasticApmAgent.java:157)
2026-07-21T19:45:10.9695354Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-07-21T19:45:10.9696842Z 	... 8 more
2026-07-21T19:45:10.9697057Z Caused by: java.lang.UnsupportedOperationException: Could not access Unsafe class: sun.misc.Unsafe.defineClass(java.lang.String,[B,int,int,java.lang.ClassLoader,java.security.ProtectionDomain)
2026-07-21T19:45:10.9697632Z 	at co.elastic.apm.agent.shaded.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Unavailable.initialize(ClassInjector.java:2133)
2026-07-21T19:45:10.9697939Z 	at co.elastic.apm.agent.shaded.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe.injectRaw(ClassInjector.java:1865)
2026-07-21T19:45:10.9698159Z 	at co.elastic.apm.agent.bci.IndyBootstrap.initIndyBootstrap(IndyBootstrap.java:234)
2026-07-21T19:45:10.9698352Z 	at co.elastic.apm.agent.bci.IndyBootstrap.getIndyBootstrapMethod(IndyBootstrap.java:215)
2026-07-21T19:45:10.9698496Z 	... 15 more
2026-07-21T19:45:10.9698745Z WARNING: A Java agent has been loaded dynamically (/tmp/otel-agent13376954740200213798/agent.jar)
2026-07-21T19:45:10.9699013Z WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
2026-07-21T19:45:10.9699288Z WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
2026-07-21T19:45:10.9699457Z WARNING: Dynamic loading of agents will be disallowed by default in a future release
2026-07-21T19:45:10.9699723Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-21T19:45:10.9700051Z 2026-07-21 16:44:46.766-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.7.9 started successfully (PID 8, JVM running for 5.816 s)
2026-07-21T19:45:10.9700363Z 2026-07-21 16:44:46.769-03:00 INFO  c.m.applicationinsights.agent - Java version: 21.0.1, vendor: Oracle Corporation, home: /usr/java/jdk-21.0.1
2026-07-21T19:45:10.9700479Z 
2026-07-21T19:45:10.9700578Z   .   ____          _            __ _ _
2026-07-21T19:45:10.9700718Z  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
2026-07-21T19:45:10.9700868Z ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
2026-07-21T19:45:10.9700975Z  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
2026-07-21T19:45:10.9701120Z   '  |____| .__|_| |_|_| |_\__, | / / / /
2026-07-21T19:45:10.9701224Z  =========|_|==============|___/=/_/_/_/
2026-07-21T19:45:10.9701282Z 
2026-07-21T19:45:10.9701374Z  :: Spring Boot ::               (v3.5.16)
2026-07-21T19:45:10.9701431Z 
2026-07-21T19:45:10.9701776Z 2026-07-21T16:44:49.366-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] b.g.c.siavl.gerencial.RunApplication     : Starting RunApplication using Java 21.0.1 with PID 8 (/deployments/SIAVL-gerencial-backend.jar started by 185 in /deployments)
2026-07-21T19:45:10.9702426Z 2026-07-21T16:44:49.454-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] b.g.c.siavl.gerencial.RunApplication     : No active profile set, falling back to 1 default profile: "default"
2026-07-21T19:45:10.9702865Z 2026-07-21T16:44:51.562-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-07-21T19:45:10.9703265Z 2026-07-21T16:44:51.585-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 13 ms. Found 0 JPA repository interfaces.
2026-07-21T19:45:10.9707843Z 2026-07-21 16:44:52.067-03:00 WARN  c.m.a.a.i.p.PerformanceMonitoringService - INITIALISING JFR PROFILING SUBSYSTEM THIS FEATURE IS IN BETA
2026-07-21T19:45:10.9708684Z 2026-07-21T16:44:52.267-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=4c70f38e-23e6-3bf8-ab92-84398f587a42
2026-07-21T19:45:10.9709190Z 2026-07-21T16:44:53.359-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-07-21T19:45:10.9709537Z 2026-07-21T16:44:53.384-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-07-21T19:45:10.9709986Z 2026-07-21T16:44:53.385-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.55]
2026-07-21T19:45:10.9710376Z 2026-07-21T16:44:53.489-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-07-21T19:45:10.9710749Z 2026-07-21T16:44:53.490-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 3922 ms
2026-07-21T19:45:10.9711242Z 2026-07-21T16:44:54.684-03:00  WARN 8 --- [SIAVL-gerencial-backend] [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-07-21T19:45:10.9711796Z 2026-07-21T16:44:55.265-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2026-07-21T19:45:10.9712234Z 2026-07-21T16:44:55.384-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.6.53.Final
2026-07-21T19:45:10.9712556Z 2026-07-21T16:44:55.483-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2026-07-21T19:45:10.9712900Z 2026-07-21T16:44:56.068-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-07-21T19:45:10.9713229Z 2026-07-21T16:44:56.098-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-07-21T19:45:10.9713590Z 2026-07-21T16:44:57.379-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection oracle.jdbc.driver.T4CConnection@7cd6b76a
2026-07-21T19:45:10.9713928Z 2026-07-21T16:44:57.383-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2026-07-21T19:45:10.9714355Z 2026-07-21T16:44:58.055-03:00  WARN 8 --- [SIAVL-gerencial-backend] [           main] org.hibernate.orm.deprecation            : HHH90000025: OracleDialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-07-21T19:45:10.9714879Z 2026-07-21T16:44:58.287-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
2026-07-21T19:45:10.9715181Z 	Database JDBC URL [Connecting through datasource 'HikariDataSource (HikariPool-1)']
2026-07-21T19:45:10.9715321Z 	Database driver: undefined/unknown
2026-07-21T19:45:10.9715425Z 	Database version: 19.22
2026-07-21T19:45:10.9715536Z 	Autocommit mode: undefined/unknown
2026-07-21T19:45:10.9715649Z 	Isolation level: undefined/unknown
2026-07-21T19:45:10.9715760Z 	Minimum pool size: undefined/unknown
2026-07-21T19:45:10.9715866Z 	Maximum pool size: undefined/unknown
2026-07-21T19:45:10.9716227Z 2026-07-21T16:44:59.072-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-07-21T19:45:10.9716751Z 2026-07-21T16:44:59.085-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-07-21T19:45:10.9717201Z 2026-07-21T16:45:00.978-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
2026-07-21T19:45:10.9717587Z 2026-07-21T16:45:00.987-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] b.g.c.siavl.gerencial.RunApplication     : Started RunApplication in 13.421 seconds (process running for 20.038)
2026-07-21T19:45:10.9772603Z ##[section]Finishing: Logs da Aplicação



OKD


Jesse Mouta Pereira Batista

Administrator
Home
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
Services
Routes
Ingresses
NetworkPolicies
Storage
PersistentVolumes
PersistentVolumeClaims
StorageClasses
VolumeSnapshots
VolumeSnapshotClasses
VolumeSnapshotContents
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
siavl-gerencial-backend-des-18-dbdcl
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
PodPsiavl-gerencial-backend-des-18-dbdcl
NamespaceNSsiavl-des
21 de jul. de 2026, 16:55
Generated from kubelet on ceadecldlx058.nprd.caixa
2 times in the last 0 minutes
Readiness probe failed: HTTP probe failed with statuscode: 401
PodPsiavl-gerencial-backend-des-18-dbdcl
NamespaceNSsiavl-des
21 de jul. de 2026, 16:55
Generated from kubelet on ceadecldlx058.nprd.caixa
Liveness probe failed: HTTP probe failed with statuscode: 401
PodPsiavl-gerencial-backend-des-18-dbdcl
NamespaceNSsiavl-des
21 de jul. de 2026, 16:54
Generated from kubelet on ceadecldlx058.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siavl-gerencial-backend:20260721.1618--SNAPSHOT" in 3.734013426s (3.734023794s including waiting)
PodPsiavl-gerencial-backend-des-18-dbdcl
NamespaceNSsiavl-des
21 de jul. de 2026, 16:54
Generated from kubelet on ceadecldlx058.nprd.caixa
Created container siavl-gerencial-backend-des
PodPsiavl-gerencial-backend-des-18-dbdcl
NamespaceNSsiavl-des
21 de jul. de 2026, 16:54
Generated from kubelet on ceadecldlx058.nprd.caixa
Started container siavl-gerencial-backend-des
PodPsiavl-gerencial-backend-des-18-dbdcl
NamespaceNSsiavl-des
21 de jul. de 2026, 16:53
Generated from multus
Add eth0 [25.0.44.241/23] from openshift-sdn
PodPsiavl-gerencial-backend-des-18-dbdcl
NamespaceNSsiavl-des
21 de jul. de 2026, 16:53
Generated from kubelet on ceadecldlx058.nprd.caixa
Pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siavl-gerencial-backend:20260721.1618--SNAPSHOT"
PodPsiavl-gerencial-backend-des-18-dbdcl
NamespaceNSsiavl-des
21 de jul. de 2026, 16:53
Generated from default-scheduler
Successfully assigned siavl-des/siavl-gerencial-backend-des-18-dbdcl to ceadecldlx058.nprd.caixa


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
WARNING: A Java agent has been loaded dynamically (/tmp/otel-agent9972428254249659157/agent.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-21 16:54:08.699-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.7.9 started successfully (PID 8, JVM running for 6.016 s)
2026-07-21 16:54:08.702-03:00 INFO  c.m.applicationinsights.agent - Java version: 21.0.1, vendor: Oracle Corporation, home: /usr/java/jdk-21.0.1

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::               (v3.5.16)

2026-07-21T16:54:11.483-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] b.g.c.siavl.gerencial.RunApplication     : Starting RunApplication using Java 21.0.1 with PID 8 (/deployments/SIAVL-gerencial-backend.jar started by 185 in /deployments)
2026-07-21T16:54:11.504-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] b.g.c.siavl.gerencial.RunApplication     : No active profile set, falling back to 1 default profile: "default"
2026-07-21T16:54:13.697-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-07-21T16:54:13.721-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 13 ms. Found 0 JPA repository interfaces.
2026-07-21 16:54:13.891-03:00 WARN  c.m.a.a.i.p.PerformanceMonitoringService - INITIALISING JFR PROFILING SUBSYSTEM THIS FEATURE IS IN BETA
2026-07-21T16:54:14.536-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=4c70f38e-23e6-3bf8-ab92-84398f587a42
2026-07-21T16:54:15.479-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-07-21T16:54:15.506-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-07-21T16:54:15.507-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.55]
2026-07-21T16:54:15.681-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-07-21T16:54:15.682-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 4074 ms
2026-07-21T16:54:17.092-03:00  WARN 8 --- [SIAVL-gerencial-backend] [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-07-21T16:54:17.604-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2026-07-21T16:54:17.780-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.6.53.Final
2026-07-21T16:54:17.817-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2026-07-21T16:54:18.400-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-07-21T16:54:18.485-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-07-21T16:54:19.807-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection oracle.jdbc.driver.T4CConnection@272de8ab
2026-07-21T16:54:19.811-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2026-07-21T16:54:20.508-03:00  WARN 8 --- [SIAVL-gerencial-backend] [           main] org.hibernate.orm.deprecation            : HHH90000025: OracleDialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-07-21T16:54:20.804-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
	Database JDBC URL [Connecting through datasource 'HikariDataSource (HikariPool-1)']
	Database driver: undefined/unknown
	Database version: 19.22
	Autocommit mode: undefined/unknown
	Isolation level: undefined/unknown
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown
2026-07-21T16:54:21.613-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-07-21T16:54:21.675-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-07-21T16:54:23.605-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
2026-07-21T16:54:23.613-03:00  INFO 8 --- [SIAVL-gerencial-backend] [           main] b.g.c.siavl.gerencial.RunApplication     : Started RunApplication in 14.031 seconds (process running for 20.932)
2026-07-21T16:55:07.297-03:00  INFO 8 --- [SIAVL-gerencial-backend] [0.0-8080-exec-2] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-07-21T16:55:07.297-03:00  INFO 8 --- [SIAVL-gerencial-backend] [0.0-8080-exec-2] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2026-07-21T16:55:07.298-03:00  INFO 8 --- [SIAVL-gerencial-backend] [0.0-8080-exec-2] o.s.web.servlet.DispatcherServlet        : Completed initialization in 1 ms


