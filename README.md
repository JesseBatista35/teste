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

Project: sid01-tqs
Pods
Pod details
Pod
P
sid01-lancamentos-financeiros-okd4-tqs-49-85nqz
OOMKilled

Actions
Details
Metrics
YAML
Environment
Logs
Events
Terminal
Log stream ended.

Container
C
sid01-lancamentos-financeiros-okd4-tqs

Current log
Search
Debug container

Wrap lines
|
Raw
|
Download
|
22 lines
exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.4.13.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|10.0.0.0/8 -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-18 10:24:59.288-03:00 INFO c.m.applicationinsights.agent - Application Insights Java Agent 3.4.13 started successfully (PID 8, JVM running for 9.355 s)
2026-09-18 10:24:59.293-03:00 INFO c.m.applicationinsights.agent - Java version: 11.0.11, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-11-openjdk-11.0.11.0.9-2.el8_4.x86_64
2026-09-18 10:25:08.085-03:00 WARN c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service: Received response code 400 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (future warnings will be aggregated and logged once every 5 minutes)
__ ____ __ _____ ___ __ ____ ______
--/ __ \/ / / / _ | / _ \/ //_/ / / / __/
-/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-09-18 10:25:07,801 INFO [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (main)
[issuers declarados na aplicacao]
https://login2tqs.caixa.gov.br/auth/realms/internet
https://logintqs.caixa.gov.br/auth/realms/internet
https://login.tqs.caixa/auth/realms/intranet
2026-09-18 10:25:10,498 INFO [io.qua.sma.ope.run.OpenApiRecorder] (main) CORS filtering is disabled and cross-origin resource sharing is allowed without restriction, which is not recommended in production. Please configure the CORS filter through 'quarkus.http.cors.*' properties. For more information, see Quarkus HTTP CORS documentation
2026-09-18 10:25:12,295 INFO [io.quarkus] (main) sid01-lancamentos-financeiros 1.5.0.2 on JVM (powered by Quarkus 2.13.8.Final) started in 12.804s. Listening on: http://0.0.0.0:8080
2026-09-18 10:25:12,295 INFO [io.quarkus] (main) Profile prod activated.
2026-09-18 10:25:12,295 INFO [io.quarkus] (main) Installed features: [cdi, hibernate-validator, logging-gelf, resteasy, resteasy-jsonb, smallrye-context-propagation, smallrye-health, smallrye-metrics, smallrye-openapi, swagger-ui, vertx]
2026-09-18 10:25:58.321-03:00 ERROR c.azure.core.http.policy.RetryPolicy - {"az.sdk.message":"Retry attempts have been exhausted.","exception":"http, none, proxydes.caixa/10.252.32.65:80 => /169.254.169.254:80, status: 502 Proxy Error ( The specified Secure Sockets Layer (SSL) port is not allowed. Forefront TMG is not configured to allow SSL requests from this port. Most Web browsers use port 443 for SSL requests. )","tryCount":3}
2026-09-18 10:27:02,493 INFO [org.apa.cxf.wsd.ser.fac.ReflectionServiceFactoryBean] (executor-thread-1) Creating Service {http://caixa.gov.br/sid01/lancamentoV4}D01POSOLService from WSDL: jar:file:/deployments/app/sid01-lancamentos-financeiros-1.5.0.2.jar!/wsdl/D01POSOL_N1W1.wsdl
/usr/local/s2i/run: line 6: 8 Killed /deployments/run-java.sh


<img width="1885" height="864" alt="image" src="https://github.com/user-attachments/assets/8a89ba03-354a-429c-963e-99c22cb94f45" />


<img width="1177" height="816" alt="image" src="https://github.com/user-attachments/assets/1bfefb69-2db2-4a58-bc62-72abf5893c40" />


<img width="1390" height="661" alt="image" src="https://github.com/user-attachments/assets/2311992d-2c6c-4fa3-8bb0-5920d9cd0226" />


