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

Project: sicbc-des
Pods
Pod details
Pod
P
sicbc-backend-des-32-rljgv
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
Showing 10 events
Older events are not stored.
PodPsicbc-backend-des-32-rljgv
NamespaceNSsicbc-des
8 de jun. de 2026, 11:28
Generated from kubelet on ceadecldlx050.nprd.caixa
Container sicbc-backend-des failed liveness probe, will be restarted
PodPsicbc-backend-des-32-rljgv
NamespaceNSsicbc-des
8 de jun. de 2026, 11:28
Generated from kubelet on ceadecldlx050.nprd.caixa
3 times in the last 0 minutes
Liveness probe failed: HTTP probe failed with statuscode: 404
PodPsicbc-backend-des-32-rljgv
NamespaceNSsicbc-des
8 de jun. de 2026, 11:28
Generated from kubelet on ceadecldlx050.nprd.caixa
5 times in the last 0 minutes
Readiness probe failed: HTTP probe failed with statuscode: 404
PodPsicbc-backend-des-32-rljgv
NamespaceNSsicbc-des
8 de jun. de 2026, 11:28
Generated from kubelet on ceadecldlx050.nprd.caixa
2 times in the last 0 minutes
Readiness probe failed: Get "http://25.2.23.58:8080/q/health/ready": dial tcp 25.2.23.58:8080: connect: connection refused
PodPsicbc-backend-des-32-rljgv
NamespaceNSsicbc-des
8 de jun. de 2026, 11:28
Generated from kubelet on ceadecldlx050.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicbc-backend:00.00.01.06" in 1.394821927s (1.394829593s including waiting)
PodPsicbc-backend-des-32-rljgv
NamespaceNSsicbc-des
8 de jun. de 2026, 11:28
Generated from kubelet on ceadecldlx050.nprd.caixa
Created container sicbc-backend-des
PodPsicbc-backend-des-32-rljgv
NamespaceNSsicbc-des
8 de jun. de 2026, 11:28
Generated from kubelet on ceadecldlx050.nprd.caixa
Started container sicbc-backend-des
PodPsicbc-backend-des-32-rljgv
NamespaceNSsicbc-des
8 de jun. de 2026, 11:28
Generated from multus
Add eth0 [25.2.23.58/23] from openshift-sdn
PodPsicbc-backend-des-32-rljgv
NamespaceNSsicbc-des
8 de jun. de 2026, 11:28
Generated from kubelet on ceadecldlx050.nprd.caixa
Pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicbc-backend:00.00.01.06"
PodPsicbc-backend-des-32-rljgv
NamespaceNSsicbc-des
8 de jun. de 2026, 11:28
Generated from default-scheduler
Successfully assigned sicbc-des/sicbc-backend-des-32-rljgv to ceadecldlx050.nprd.caixa


log do pod:


exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
Picked up JAVA_TOOL_OPTIONS: -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit
__ ____ __ _____ ___ __ ____ ______
--/ __ \/ / / / _ | / _ \/ //_/ / / / __/
-/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-06-08 11:28:23,952 INFO [io.quarkus] (main) SICBC-backend 00.00.01.06 on JVM (powered by Quarkus 3.20.2) started in 1.429s. Listening on: http://0.0.0.0:8080
2026-06-08 11:28:23,955 INFO [io.quarkus] (main) Profile prod activated.
2026-06-08 11:28:23,955 INFO [io.quarkus] (main) Installed features: [cdi, config-yaml, oidc, rest, rest-client, rest-jackson, security, smallrye-context-propagation, smallrye-jwt, vertx]


