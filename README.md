exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.4.13.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|10.0.0.0/8 -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-18 15:34:13.969-03:00 INFO c.m.applicationinsights.agent - Application Insights Java Agent 3.4.13 started successfully (PID 8, JVM running for 9.491 s)
2026-09-18 15:34:13.973-03:00 INFO c.m.applicationinsights.agent - Java version: 11.0.11, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-11-openjdk-11.0.11.0.9-2.el8_4.x86_64
2026-09-18 15:34:23.680-03:00 WARN c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service: Received response code 400 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (future warnings will be aggregated and logged once every 5 minutes)
__ ____ __ _____ ___ __ ____ ______
--/ __ \/ / / / _ | / _ \/ //_/ / / / __/
-/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-09-18 15:34:24,973 INFO [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (main)
[issuers declarados na aplicacao]
https://login2tqs.caixa.gov.br/auth/realms/internet
https://logintqs.caixa.gov.br/auth/realms/internet
https://login.tqs.caixa/auth/realms/intranet
2026-09-18 15:34:27,482 INFO [io.qua.sma.ope.run.OpenApiRecorder] (main) CORS filtering is disabled and cross-origin resource sharing is allowed without restriction, which is not recommended in production. Please configure the CORS filter through 'quarkus.http.cors.*' properties. For more information, see Quarkus HTTP CORS documentation
2026-09-18 15:34:29,276 INFO [io.quarkus] (main) sid01-lancamentos-financeiros 1.5.0.2 on JVM (powered by Quarkus 2.13.8.Final) started in 15.188s. Listening on: http://0.0.0.0:8080
2026-09-18 15:34:29,276 INFO [io.quarkus] (main) Profile prod activated.
2026-09-18 15:34:29,277 INFO [io.quarkus] (main) Installed features: [cdi, hibernate-validator, logging-gelf, resteasy, resteasy-jsonb, smallrye-context-propagation, smallrye-health, smallrye-metrics, smallrye-openapi, swagger-ui, vertx]
2026-09-18 15:35:12.856-03:00 ERROR c.azure.core.http.policy.RetryPolicy - {"az.sdk.message":"Retry attempts have been exhausted.","exception":"http, none, proxydes.caixa/10.252.32.65:80 => /169.254.169.254:80, status: 502 Proxy Error ( The specified Secure Sockets Layer (SSL) port is not allowed. Forefront TMG is not configured to allow SSL requests from this port. Most Web browsers use port 443 for SSL requests. )","tryCount":3}
2026-09-18 15:39:23.682-03:00 WARN c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 2 times (out of 19): Sending telemetry to the ingestion service:
* Received response code 400 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (2 times)


NESSE CASO ELES TERIAM QUE RODAR ANA APLICAÇAO PARA PODERMOS PEGAR O ERRO AQUI NO LOG CERTO?
