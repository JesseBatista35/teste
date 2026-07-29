oc set resources deployment silce-consulta-apostas-api-des -n silce-des --limits=cpu=1,memory=2Gi --requests=cpu=1,memory=2Gi


oc rollout status deployment silce-consulta-apostas-api-des -n silce-des

oc adm top pod -n silce-des | grep silce-consulta-apostas-api

oc get events -n silce-des --field-selector involvedObject.name=$(oc get pods -n silce-des | grep silce-consulta-apostas-api | awk '{print $1}') --sort-by='.lastTimestamp'




    Topology
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

    Pods

    Pod details

PodP silce-consulta-apostas-api-des-8dc946dbd-v4z9l
Running

    Details
    Metrics
    YAML
    Environment
    Logs
    Events
    Terminal

Streaming events...
Showing 6 events
Older events are not stored.
PodPsilce-consulta-apostas-api-des-8dc946dbd-v4z9lNamespaceNSsilce-des
Just now
Generated from kubelet on nctvmrh001-scgft-worker-0-txtg5
Liveness probe failed: Get "http://25.128.6.109:8080/q/health/live": dial tcp 25.128.6.109:8080: connect: connection refused
PodPsilce-consulta-apostas-api-des-8dc946dbd-v4z9lNamespaceNSsilce-des
há 1 minuto
Generated from multus
Add eth0 [25.128.6.109/23] from ovn-kubernetes
PodPsilce-consulta-apostas-api-des-8dc946dbd-v4z9lNamespaceNSsilce-des
há 1 minuto
Generated from kubelet on nctvmrh001-scgft-worker-0-txtg5
Container image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/silce-consulta-apostas-api:1.0.13.1" already present on machine
PodPsilce-consulta-apostas-api-des-8dc946dbd-v4z9lNamespaceNSsilce-des
há 1 minuto
Generated from kubelet on nctvmrh001-scgft-worker-0-txtg5
Created container: silce-consulta-apostas-api-des
PodPsilce-consulta-apostas-api-des-8dc946dbd-v4z9lNamespaceNSsilce-des
há 1 minuto
Generated from kubelet on nctvmrh001-scgft-worker-0-txtg5
Started container silce-consulta-apostas-api-des
PodPsilce-consulta-apostas-api-des-8dc946dbd-v4z9lNamespaceNSsilce-des
há 1 minuto
Generated from default-scheduler
Successfully assigned silce-des/silce-consulta-apostas-api-des-8dc946dbd-v4z9l to nctvmrh001-scgft-worker-0-txtg5





exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.5.1.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-29 10:40:04.172-03:00 WARN  c.a.c.h.netty.implementation.Utility - The following Netty dependencies have versions that do not match the versions specified in the azure-core-http-netty pom.xml file. This may result in unexpected behavior. If your application runs without issue this message can be ignored, otherwise please update the Netty dependencies to match the versions specified in the pom.xml file. Versions found in runtime: 'io.netty:netty-common' version not found (expected: 4.1.101.Final),'io.netty:netty-handler' version not found (expected: 4.1.101.Final),'io.netty:netty-handler-proxy' version not found (expected: 4.1.101.Final),'io.netty:netty-buffer' version not found (expected: 4.1.101.Final),'io.netty:netty-codec' version not found (expected: 4.1.101.Final),'io.netty:netty-codec-http' version not found (expected: 4.1.101.Final),'io.netty:netty-codec-http2' version not found (expected: 4.1.101.Final)
2026-07-29 10:40:10.112-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.5.1 started successfully (PID 3, JVM running for 8.076 s)
2026-07-29 10:40:10.114-03:00 INFO  c.m.applicationinsights.agent - Java version: 11.0.11, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-11-openjdk-11.0.11.0.9-2.el8_4.x86_64
2026-07-29 10:40:16.007-03:00 WARN  c.m.a.a.i.p.PerformanceMonitoringService - INITIALISING JFR PROFILING SUBSYSTEM THIS FEATURE IS IN BETA
__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-07-29 10:40:13,607 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.jacoco.excludes" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-07-29 10:40:22,621 WARN  [io.qua.agr.run.AgroalConnectionConfigurer] (main) Agroal does not support detecting if a connection is still usable after an exception for database kind: db2
2026-07-29 10:40:23,020 WARN  [io.qua.run.con.ConfigRecorder] (main) Build time property cannot be changed at runtime:
 - quarkus.ssl.native is set to 'false' but it is build time fixed to 'null'. Did you change the property quarkus.ssl.native after building the application?
2026-07-29 10:40:24,927 INFO  [io.quarkus] (main) silce-consulta-apostas-api 1.0.13.1 on JVM (powered by Quarkus 2.7.6.Final) started in 14.613s. Listening on: http://0.0.0.0:8080
2026-07-29 10:40:24,928 INFO  [io.quarkus] (main) Profile prod activated.
2026-07-29 10:40:24,928 INFO  [io.quarkus] (main) Installed features: [agroal, cache, cdi, narayana-jta, oidc, rest-client, rest-client-jackson, resteasy, resteasy-jackson, security, smallrye-context-propagation, smallrye-health, smallrye-metrics, smallrye-openapi, swagger-ui, vertx]
