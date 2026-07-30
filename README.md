exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-sispl-v2.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-07-30 16:22:25,525 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.hibernate-orm.idaa.active" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
quarkus.datasource.idaa.jdbc.url has not been defined



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

    Services
    Routes
    Ingresses
    NetworkPolicies
    UserDefinedNetworks

    Pods

    Pod details

PodP sispl-api-mkp-hmp-74c7c78bcd-9ht22
CrashLoopBackOff

    Details
    Metrics
    YAML
    Environment
    Logs
    Events
    Terminal

Streaming events...
Showing 9 events
Older events are not stored.
PodPsispl-api-mkp-hmp-74c7c78bcd-9ht22NamespaceNSsispl-hmp
há 2 minutos
Generated from kubelet on nctvmrh001-scgft-worker-0-7lwkw
26 times in the last 1 hour
Container image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-api-mkp:3.32.0.0" already present on machine
PodPsispl-api-mkp-hmp-74c7c78bcd-9ht22NamespaceNSsispl-hmp
há 3 minutos
Generated from kubelet on nctvmrh001-scgft-worker-0-7lwkw
310 times in the last 1 hour
Back-off restarting failed container sispl-api-mkp-hmp in pod sispl-api-mkp-hmp-74c7c78bcd-9ht22_sispl-hmp(3379c474-1dbb-4ef7-9319-6811bc9e5051)
PodPsispl-api-mkp-hmp-74c7c78bcd-9ht22NamespaceNSsispl-hmp
30 de jul. de 2026, 16:10
Generated from kubelet on nctvmrh001-scgft-worker-0-7lwkw
24 times in the last 1 hour
Liveness probe failed: Get "http://25.129.7.31:8080/q/health/live": dial tcp 25.129.7.31:8080: connect: connection refused
PodPsispl-api-mkp-hmp-74c7c78bcd-9ht22NamespaceNSsispl-hmp
30 de jul. de 2026, 16:10
Generated from kubelet on nctvmrh001-scgft-worker-0-7lwkw
22 times in the last 1 hour
Created container: sispl-api-mkp-hmp
PodPsispl-api-mkp-hmp-74c7c78bcd-9ht22NamespaceNSsispl-hmp
30 de jul. de 2026, 15:30
Generated from kubelet on nctvmrh001-scgft-worker-0-7lwkw
4 times in the last 1 hour
Container sispl-api-mkp-hmp failed liveness probe, will be restarted
PodPsispl-api-mkp-hmp-74c7c78bcd-9ht22NamespaceNSsispl-hmp
30 de jul. de 2026, 15:18
Generated from kubelet on nctvmrh001-scgft-worker-0-7lwkw
8 times in the last 1 hour
Started container sispl-api-mkp-hmp
PodPsispl-api-mkp-hmp-74c7c78bcd-9ht22NamespaceNSsispl-hmp
30 de jul. de 2026, 15:06
Generated from kubelet on nctvmrh001-scgft-worker-0-7lwkw
Readiness probe failed: Get "http://25.129.7.31:8080/q/health/ready": dial tcp 25.129.7.31:8080: connect: connection refused
PodPsispl-api-mkp-hmp-74c7c78bcd-9ht22NamespaceNSsispl-hmp
30 de jul. de 2026, 15:05
Generated from multus
Add eth0 [25.129.7.31/23] from ovn-kubernetes
PodPsispl-api-mkp-hmp-74c7c78bcd-9ht22NamespaceNSsispl-hmp
30 de jul. de 2026, 15:05
Generated from default-scheduler
Successfully assigned sispl-hmp/sispl-api-mkp-hmp-74c7c78bcd-9ht22 to nctvmrh001-scgft-worker-0-7lwkw
