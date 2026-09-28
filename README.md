Se o erro persistir, peço ao time de Mainframe a verificação de: CEMT I URIMAP(D01UMTQS) (USAGE, PIPELINE, WEBSERVICE, PROGRAM, TRANSACTION); CEMT I WEBS(lancamentoV4) (URIMAP associado e STATE); a definição da N1W1 (DFHPIDSH como primeiro programa nos AORs, routable/dynamic no TOR); e se o D01POSOL está instalado somente nos AORs, já que o ASRA foi registrado no CICQTWB3, que é TOR.

eu nao mandie essa parte aqui acima 


-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout latest dc/sid01-lancamentos-financeiros-okd4-tqs -n sid01-tqs
deploymentconfig.apps.openshift.io/sid01-lancamentos-financeiros-okd4-tqs rolled out
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sid01-tqs
NAME                                                   READY     STATUS              RESTARTS        AGE
sid01-api-lnf-tqs-4-sd5kr                              1/1       Running             401 (22m ago)   25d
sid01-lancamentos-financeiros-okd4-tqs-50-deploy       0/1       Completed           0               9d
sid01-lancamentos-financeiros-okd4-tqs-51-deploy       0/1       Completed           0               9d
sid01-lancamentos-financeiros-okd4-tqs-51-xm7sw        1/1       Running             8 (11h ago)     6d20h
sid01-lancamentos-financeiros-okd4-tqs-52-deploy       1/1       Running             0               6s
sid01-lancamentos-financeiros-okd4-tqs-52-vrzhq        0/1       ContainerCreating   0               2s
sid01-simulador-tqs-201-deploy                         0/1       Completed           0               109d
sid01-simulador-tqs-202-deploy                         0/1       Completed           0               103d
sid01-simulador-tqs-202-kc4pr                          1/1       Running             0               103d
sid01-situacao-lancamentos-financeiros-tqs-17-2z2vp    1/1       Running             0               23d
sid01-situacao-lancamentos-financeiros-tqs-17-deploy   0/1       Completed           0               23d
sid01-zosconnproxy-tqs-1-752dk                         2/2       Running             0               122d
sid01-zosconnproxy-tqs-1-deploy                        0/1       Completed           0               122d
sid01-zosconnproxy-tqs-1-mxwh9                         2/2       Running             0               30d
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sid01-tqs
NAME                                                   READY     STATUS      RESTARTS        AGE
sid01-api-lnf-tqs-4-sd5kr                              1/1       Running     401 (22m ago)   25d
sid01-lancamentos-financeiros-okd4-tqs-50-deploy       0/1       Completed   0               9d
sid01-lancamentos-financeiros-okd4-tqs-51-deploy       0/1       Completed   0               9d
sid01-lancamentos-financeiros-okd4-tqs-51-xm7sw        1/1       Running     8 (11h ago)     6d20h
sid01-lancamentos-financeiros-okd4-tqs-52-deploy       1/1       Running     0               13s
sid01-lancamentos-financeiros-okd4-tqs-52-vrzhq        0/1       Running     0               9s
sid01-simulador-tqs-201-deploy                         0/1       Completed   0               109d
sid01-simulador-tqs-202-deploy                         0/1       Completed   0               103d
sid01-simulador-tqs-202-kc4pr                          1/1       Running     0               103d
sid01-situacao-lancamentos-financeiros-tqs-17-2z2vp    1/1       Running     0               23d
sid01-situacao-lancamentos-financeiros-tqs-17-deploy   0/1       Completed   0               23d
sid01-zosconnproxy-tqs-1-752dk                         2/2       Running     0               122d
sid01-zosconnproxy-tqs-1-deploy                        0/1       Completed   0               122d
sid01-zosconnproxy-tqs-1-mxwh9                         2/2       Running     0               30d
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env dc/sid01-lancamentos-financeiros-okd4-tqs --list -n sid01-tqs | grep CICSWEB
CICSWEB_ROOT_ENDPOINT_HTTP=https://cicsweb.tqs.caixa:2584
CICSWEB_ROOT_ENDPOINT_HTTPS=https://cicsweb.tqs.caixa:32587
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs -f sid01-lancamentos-financeiros-okd4-tqs-52-vrzhq  -n sid01-tqs
exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.4.13.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|10.0.0.0/8 -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-28 11:01:30.497-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.4.13 started successfully (PID 8, JVM running for 7.865 s)
2026-09-28 11:01:30.500-03:00 INFO  c.m.applicationinsights.agent - Java version: 11.0.11, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-11-openjdk-11.0.11.0.9-2.el8_4.x86_64
__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-09-28 11:01:38,504 INFO  [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (main)
[issuers declarados na aplicacao]
https://login2tqs.caixa.gov.br/auth/realms/internet
https://logintqs.caixa.gov.br/auth/realms/internet
https://login.tqs.caixa/auth/realms/intranet

2026-09-28 11:01:40,690 INFO  [io.qua.sma.ope.run.OpenApiRecorder] (main) CORS filtering is disabled and cross-origin resource sharing is allowed without restriction, which is not recommended in production. Please configure the CORS filter through 'quarkus.http.cors.*' properties. For more information, see Quarkus HTTP CORS documentation
2026-09-28 11:01:40.701-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service: Received response code 400 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (future warnings will be aggregated and logged once every 5 minutes)
2026-09-28 11:01:41,910 INFO  [io.quarkus] (main) sid01-lancamentos-financeiros 1.5.0.2 on JVM (powered by Quarkus 2.13.8.Final) started in 11.211s. Listening on: http://0.0.0.0:8080
2026-09-28 11:01:41,910 INFO  [io.quarkus] (main) Profile prod activated.
2026-09-28 11:01:41,910 INFO  [io.quarkus] (main) Installed features: [cdi, hibernate-validator, logging-gelf, resteasy, resteasy-jsonb, smallrye-context-propagation, smallrye-health, smallrye-metrics, smallrye-openapi, swagger-ui, vertx]

