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

PodP sispl-api-mkp-des-75d9d6f594-hmfjv
Running

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
PodPsispl-api-mkp-des-75d9d6f594-hmfjvNamespaceNSsispl-des
Just now
Generated from kubelet on nctvmrh001-scgft-worker-0-5k79t
7 times in the last 2 minutes
Liveness probe failed: Get "http://25.131.1.178:8080/q/health/live": dial tcp 25.131.1.178:8080: connect: connection refused
PodPsispl-api-mkp-des-75d9d6f594-hmfjvNamespaceNSsispl-des
Just now
Generated from kubelet on nctvmrh001-scgft-worker-0-5k79t
2 times in the last 1 minute
Container image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-api-mkp:3.32.0.3" already present on machine
PodPsispl-api-mkp-des-75d9d6f594-hmfjvNamespaceNSsispl-des
Just now
Generated from kubelet on nctvmrh001-scgft-worker-0-5k79t
10 times in the last 2 minutes
Readiness probe failed: Get "http://25.131.1.178:8080/q/health/ready": dial tcp 25.131.1.178:8080: connect: connection refused
PodPsispl-api-mkp-des-75d9d6f594-hmfjvNamespaceNSsispl-des
Just now
Generated from kubelet on nctvmrh001-scgft-worker-0-5k79t
3 times in the last 2 minutes
Created container: sispl-api-mkp-des
PodPsispl-api-mkp-des-75d9d6f594-hmfjvNamespaceNSsispl-des
Just now
Generated from kubelet on nctvmrh001-scgft-worker-0-5k79t
3 times in the last 2 minutes
Started container sispl-api-mkp-des
PodPsispl-api-mkp-des-75d9d6f594-hmfjvNamespaceNSsispl-des
Just now
Generated from kubelet on nctvmrh001-scgft-worker-0-5k79t
2 times in the last 2 minutes
Container sispl-api-mkp-des failed liveness probe, will be restarted
PodPsispl-api-mkp-des-75d9d6f594-hmfjvNamespaceNSsispl-des
há 2 minutos
Generated from kubelet on nctvmrh001-scgft-worker-0-5k79t
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-api-mkp:3.32.0.3" in 3.038s (3.038s including waiting). Image size: 957861776 bytes.
PodPsispl-api-mkp-des-75d9d6f594-hmfjvNamespaceNSsispl-des
há 2 minutos
Generated from multus
Add eth0 [25.131.1.178/23] from ovn-kubernetes
PodPsispl-api-mkp-des-75d9d6f594-hmfjvNamespaceNSsispl-des
há 2 minutos
Generated from kubelet on nctvmrh001-scgft-worker-0-5k79t
Pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-api-mkp:3.32.0.3"
PodPsispl-api-mkp-des-75d9d6f594-hmfjvNamespaceNSsispl-des
há 2 minutos
Generated from default-scheduler
Successfully assigned sispl-des/sispl-api-mkp-des-75d9d6f594-hmfjv to nctvmrh001-scgft-worker-0-5k79t




Log stream ended.
exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-07-28 17:08:24,431 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.hibernate-orm.idaa.active" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo

