PodPsilce-consulta-apostas-api-des-8687f4b888-cvlzfNamespaceNSsilce-des
29 de jul. de 2026, 09:35
Generated from kubelet on nctvmrh001-scgft-worker-0-txtg5
13 times in the last 20 hours
Readiness probe failed: Get "http://25.128.6.108:8080/q/health/ready": context deadline exceeded (Client.Timeout exceeded while awaiting headers)
PodPsilce-consulta-apostas-api-des-8687f4b888-cvlzfNamespaceNSsilce-des
29 de jul. de 2026, 08:23
Generated from kubelet on nctvmrh001-scgft-worker-0-txtg5
19 times in the last 22 hours
Container image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/silce-consulta-apostas-api:1.0.13.1" already present on machine
PodPsilce-consulta-apostas-api-des-8687f4b888-cvlzfNamespaceNSsilce-des
29 de jul. de 2026, 08:23
Generated from kubelet on nctvmrh001-scgft-worker-0-txtg5
19 times in the last 22 hours
Created container: silce-consulta-apostas-api-des
PodPsilce-consulta-apostas-api-des-8687f4b888-cvlzfNamespaceNSsilce-des
29 de jul. de 2026, 08:23
Generated from kubelet on nctvmrh001-scgft-worker-0-txtg5
19 times in the last 22 hours
Started container silce-consulta-apostas-api-des



exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.5.1.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-29 08:23:34.424-03:00 WARN  c.a.c.h.netty.implementation.Utility - The following Netty dependencies have versions that do not match the versions specified in the azure-core-http-netty pom.xml file. This may result in unexpected behavior. If your application runs without issue this message can be ignored, otherwise please update the Netty dependencies to match the versions specified in the pom.xml file. Versions found in runtime: 'io.netty:netty-common' version not found (expected: 4.1.101.Final),'io.netty:netty-handler' version not found (expected: 4.1.101.Final),'io.netty:netty-handler-proxy' version not found (expected: 4.1.101.Final),'io.netty:netty-buffer' version not found (expected: 4.1.101.Final),'io.netty:netty-codec' version not found (expected: 4.1.101.Final),'io.netty:netty-codec-http' version not found (expected: 4.1.101.Final),'io.netty:netty-codec-http2' version not found (expected: 4.1.101.Final)
2026-07-29 08:23:40.609-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.5.1 started successfully (PID 3, JVM running for 8.265 s)
2026-07-29 08:23:40.611-03:00 INFO  c.m.applicationinsights.agent - Java version: 11.0.11, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-11-openjdk-11.0.11.0.9-2.el8_4.x86_64
2026-07-29 08:23:46.808-03:00 WARN  c.m.a.a.i.p.PerformanceMonitoringService - INITIALISING JFR PROFILING SUBSYSTEM THIS FEATURE IS IN BETA
__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-07-29 08:23:44,212 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.jacoco.excludes" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-07-29 08:23:53,947 WARN  [io.qua.agr.run.AgroalConnectionConfigurer] (main) Agroal does not support detecting if a connection is still usable after an exception for database kind: db2
2026-07-29 08:23:54,219 WARN  [io.qua.run.con.ConfigRecorder] (main) Build time property cannot be changed at runtime:
 - quarkus.ssl.native is set to 'false' but it is build time fixed to 'null'. Did you change the property quarkus.ssl.native after building the application?
2026-07-29 08:23:55,913 INFO  [io.quarkus] (main) silce-consulta-apostas-api 1.0.13.1 on JVM (powered by Quarkus 2.7.6.Final) started in 15.004s. Listening on: http://0.0.0.0:8080
2026-07-29 08:23:55,913 INFO  [io.quarkus] (main) Profile prod activated.
2026-07-29 08:23:55,914 INFO  [io.quarkus] (main) Installed features: [agroal, cache, cdi, narayana-jta, oidc, rest-client, rest-client-jackson, resteasy, resteasy-jackson, security, smallrye-context-propagation, smallrye-health, smallrye-metrics, smallrye-openapi, swagger-ui, vertx]
