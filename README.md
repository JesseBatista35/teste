na verdade aqui ta subidop o pod da aplicação:

sicia-backend-tqs-19-r7vqt
Running

exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sicia-backend -Delastic.apm.environment=tqs -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sicia-backend -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/SICIA-backend-1.0.0.3.jar
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

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v4.0.6)

2026-06-12T10:54:04.786-03:00  INFO 8 --- [SICIA-backend] [           main] br.gov.caixa.sicia.SiciaApplication      : Starting SiciaApplication v1.0.0.3 using Java 21.0.1 with PID 8 (/deployments/SICIA-backend-1.0.0.3.jar started by 185 in /deployments)
2026-06-12T10:54:04.789-03:00  INFO 8 --- [SICIA-backend] [           main] br.gov.caixa.sicia.SiciaApplication      : No active profile set, falling back to 1 default profile: "default"
2026-06-12T10:54:06.657-03:00  INFO 8 --- [SICIA-backend] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-06-12T10:54:06.700-03:00  INFO 8 --- [SICIA-backend] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 34 ms. Found 2 JPA repository interfaces.
2026-06-12T10:54:08.077-03:00  INFO 8 --- [SICIA-backend] [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat initialized with port 8080 (http)
2026-06-12T10:54:08.087-03:00  INFO 8 --- [SICIA-backend] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-06-12T10:54:08.087-03:00  INFO 8 --- [SICIA-backend] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/11.0.21]
2026-06-12T10:54:08.192-03:00  INFO 8 --- [SICIA-backend] [           main] b.w.c.s.WebApplicationContextInitializer : Root WebApplicationContext: initialization completed in 3314 ms
2026-06-12T10:54:09.087-03:00  INFO 8 --- [SICIA-backend] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-06-12T10:54:09.409-03:00  INFO 8 --- [SICIA-backend] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection conn0: url=jdbc:h2:mem:sicia user=SA
2026-06-12T10:54:09.411-03:00  INFO 8 --- [SICIA-backend] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2026-06-12T10:54:09.597-03:00  INFO 8 --- [SICIA-backend] [           main] org.hibernate.orm.jpa                    : HHH008540: Processing PersistenceUnitInfo [name: default]
2026-06-12T10:54:09.787-03:00  INFO 8 --- [SICIA-backend] [           main] org.hibernate.orm.core                   : HHH000001: Hibernate ORM core version 7.2.12.Final
2026-06-12T10:54:10.600-03:00  INFO 8 --- [SICIA-backend] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-06-12T10:54:10.698-03:00  WARN 8 --- [SICIA-backend] [           main] org.hibernate.orm.deprecation            : HHH90000025: H2Dialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-06-12T10:54:10.763-03:00  INFO 8 --- [SICIA-backend] [           main] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
	Database JDBC URL [jdbc:h2:mem:sicia]
	Database driver: H2 JDBC Driver
	Database dialect: H2Dialect
	Database version: 2.4.240
	Default catalog/schema: SICIA/PUBLIC
	Autocommit mode: undefined/unknown
	Isolation level: READ_COMMITTED [default READ_COMMITTED]
	JDBC fetch size: 100
	Pool: DataSourceConnectionProvider
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown
2026-06-12T10:54:12.373-03:00  INFO 8 --- [SICIA-backend] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-06-12T10:54:12.380-03:00  INFO 8 --- [SICIA-backend] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-06-12T10:54:12.496-03:00  INFO 8 --- [SICIA-backend] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-06-12T10:54:13.698-03:00  INFO 8 --- [SICIA-backend] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 1 endpoint beneath base path '/actuator'
2026-06-12T10:54:15.181-03:00  INFO 8 --- [SICIA-backend] [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat started on port 8080 (http) with context path '/'
2026-06-12T10:54:15.189-03:00  INFO 8 --- [SICIA-backend] [           main] br.gov.caixa.sicia.SiciaApplication      : Started SiciaApplication in 11.194 seconds (process running for 13.086)
2026-06-12T10:54:15.369-03:00  WARN 8 --- [SICIA-backend] [           main] o.s.core.events.SpringDocAppInitializer  : SpringDoc /v3/api-docs endpoint is enabled by default. To disable it in production, set the property 'springdoc.api-docs.enabled=false'
2026-06-12T10:54:15.370-03:00  WARN 8 --- [SICIA-backend] [           main] o.s.core.events.SpringDocAppInitializer  : SpringDoc /swagger-ui.html endpoint is enabled by default. To disable it in production, set the property 'springdoc.swagger-ui.enabled=false'



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

Project: sicia-tqs
Pods

Filter

Name
back
/
Name
back

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
sicia-apinode-backend-tqs-4-l66bz
Running
1/1	0	
ReplicationController
RC
sicia-apinode-backend-tqs-4
80,5 MiB	0,000 cores	
9 de dez. de 2025, 10:57

Pod
P
sicia-backend-tqs-1-prz46
Running
1/1	0	
ReplicationController
RC
sicia-backend-tqs-1
401,7 MiB	0,001 cores	
3 de jun. de 2026, 15:14

Pod
P
sicia-backend-tqs-19-deploy
Running
1/1	0	
ReplicationController
RC
sicia-backend-tqs-19
24,5 MiB	0,001 cores	
12 de jun. de 2026, 10:53

Pod
P
sicia-backend-tqs-19-nx5ph
Running
0/1	0	
ReplicationController
RC
sicia-backend-tqs-19
-	-	
12 de jun. de 2026, 10:55

Pod
P
sicia-backend-tqs-19-r7vqt
Running
1/1	0	
ReplicationController
RC
sicia-backend-tqs-19
273,4 MiB	0,000 cores	
12 de jun. de 2026, 10:53



ta subindoi ate 2 de uma vez só

escalei só para 1 agora tava com 2 escalados.



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

Project: sicia-tqs
Pods

Filter

Name
back
/
Name
back

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
sicia-apinode-backend-tqs-4-l66bz
Running
1/1	0	
ReplicationController
RC
sicia-apinode-backend-tqs-4
80,5 MiB	0,000 cores	
9 de dez. de 2025, 10:57

Pod
P
sicia-backend-tqs-19-deploy
Completed
0/1	0	
ReplicationController
RC
sicia-backend-tqs-19
-	0,001 cores	
12 de jun. de 2026, 10:53

Pod
P
sicia-backend-tqs-20-deploy
Completed
0/1	0	
ReplicationController
RC
sicia-backend-tqs-20
-	0,000 cores	
12 de jun. de 2026, 10:56

Pod
P
sicia-backend-tqs-20-wfxxk
Running
1/1	0	
ReplicationController
RC
sicia-backend-tqs-20
268,4 MiB	0,000 cores	
12 de jun. de 2026, 10:56



vou rodar uma nova release:


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

Project: sicia-tqs
Pods

Filter

Name
back
/
Name
back

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
sicia-apinode-backend-tqs-4-l66bz
Running
1/1	0	
ReplicationController
RC
sicia-apinode-backend-tqs-4
80,5 MiB	0,000 cores	
9 de dez. de 2025, 10:57

Pod
P
sicia-backend-tqs-20-deploy
Completed
0/1	0	
ReplicationController
RC
sicia-backend-tqs-20
-	-	
12 de jun. de 2026, 10:56

Pod
P
sicia-backend-tqs-21-deploy
Completed
0/1	0	
ReplicationController
RC
sicia-backend-tqs-21
-	0,000 cores	
12 de jun. de 2026, 10:59

Pod
P
sicia-backend-tqs-21-nmlb4
Running
1/1	0	
ReplicationController
RC
sicia-backend-tqs-21
287,8 MiB	0,031 cores	
12 de jun. de 2026, 10:59



deu bom era só esse o problemas dauas replicas.




