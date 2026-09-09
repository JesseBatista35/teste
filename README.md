exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__ ____ __ _____ ___ __ ____ ______
--/ __ \/ / / / _ | / _ \/ //_/ / / / __/
-/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-09-09 15:31:04,661 WARN [io.qua.config] (main) Unrecognized configuration key "quarkus.swagger-ui.enabled" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-09-09 15:31:07,299 INFO [io.quarkus] (main) sigda-api-quarkus 1.0.0-SNAPSHOT on JVM (powered by Quarkus 3.20.3) started in 5.210s. Listening on: http://0.0.0.0:8080
2026-09-09 15:31:07,300 INFO [io.quarkus] (main) Profile prod activated.
2026-09-09 15:31:07,300 INFO [io.quarkus] (main) Installed features: [agroal, cdi, hibernate-orm, hibernate-orm-panache, hibernate-validator, jdbc-oracle, narayana-jta, oidc, rest, rest-jackson, security, smallrye-context-propagation, smallrye-health, smallrye-openapi, swagger-ui, vertx]


OKD


Jesse Mouta Pereira Batista

Administrator
Home
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

Project: sigda-des
Pods
Pod details
Pod
P
sigda-api-quarkus-des-11-8f6kd
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
Showing 12 events
Older events are not stored.
PodPsigda-api-quarkus-des-11-8f6kd
NamespaceNSsigda-des
9 de set. de 2026, 15:31
Generated from kubelet on ceadecldlx079.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sigda-api-quarkus:1.0.1.0" in 2.499278613s (2.499288536s including waiting)
PodPsigda-api-quarkus-des-11-8f6kd
NamespaceNSsigda-des
9 de set. de 2026, 15:31
Generated from kubelet on ceadecldlx079.nprd.caixa
Created container sigda-api-quarkus-des
PodPsigda-api-quarkus-des-11-8f6kd
NamespaceNSsigda-des
9 de set. de 2026, 15:31
Generated from kubelet on ceadecldlx079.nprd.caixa
Started container sigda-api-quarkus-des
PodPsigda-api-quarkus-des-11-8f6kd
NamespaceNSsigda-des
9 de set. de 2026, 15:30
Generated from kubelet on ceadecldlx079.nprd.caixa
Pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sigda-api-quarkus:1.0.1.0"
PodPsigda-api-quarkus-des-11-8f6kd
NamespaceNSsigda-des
9 de set. de 2026, 15:30
Generated from kubelet on ceadecldlx079.nprd.caixa
Container image "default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552" already present on machine
PodPsigda-api-quarkus-des-11-8f6kd
NamespaceNSsigda-des
9 de set. de 2026, 15:30
Generated from kubelet on ceadecldlx079.nprd.caixa
Created container secrets-check
PodPsigda-api-quarkus-des-11-8f6kd
NamespaceNSsigda-des
9 de set. de 2026, 15:30
Generated from kubelet on ceadecldlx079.nprd.caixa
Started container secrets-check
PodPsigda-api-quarkus-des-11-8f6kd
NamespaceNSsigda-des
9 de set. de 2026, 15:30
Generated from multus
Add eth0 [25.3.37.121/23] from openshift-sdn
PodPsigda-api-quarkus-des-11-8f6kd
NamespaceNSsigda-des
9 de set. de 2026, 15:30
Generated from kubelet on ceadecldlx079.nprd.caixa
Container image "default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.2" already present on machine
PodPsigda-api-quarkus-des-11-8f6kd
NamespaceNSsigda-des
9 de set. de 2026, 15:30
Generated from kubelet on ceadecldlx079.nprd.caixa
Created container secrets-agent-sidecar
PodPsigda-api-quarkus-des-11-8f6kd
NamespaceNSsigda-des
9 de set. de 2026, 15:30
Generated from kubelet on ceadecldlx079.nprd.caixa
Started container secrets-agent-sidecar
PodPsigda-api-quarkus-des-11-8f6kd
NamespaceNSsigda-des
9 de set. de 2026, 15:30
Generated from default-scheduler
Successfully assigned sigda-des/sigda-api-quarkus-des-11-8f6kd to ceadecldlx079.nprd.caixa
