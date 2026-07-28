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

PodP sispl-api-mkp-des-b45f5f9f-mk2rg
Running

    Details
    Metrics
    YAML
    Environment
    Logs
    Events
    Terminal

Streaming events...
Showing 8 events
Older events are not stored.
PodPsispl-api-mkp-des-b45f5f9f-mk2rgNamespaceNSsispl-des
Just now
Generated from kubelet on nctvmrh001-scgft-worker-0-cs2xc
16 times in the last 4 minutes
Readiness probe failed: Get "http://25.129.3.104:8080/q/health/ready": dial tcp 25.129.3.104:8080: connect: connection refused
PodPsispl-api-mkp-des-b45f5f9f-mk2rgNamespaceNSsispl-des
Just now
Generated from kubelet on nctvmrh001-scgft-worker-0-cs2xc
4 times in the last 5 minutes
Container image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-api-mkp:3.32.0.3" already present on machine
PodPsispl-api-mkp-des-b45f5f9f-mk2rgNamespaceNSsispl-des
Just now
Generated from kubelet on nctvmrh001-scgft-worker-0-cs2xc
4 times in the last 5 minutes
Created container: sispl-api-mkp-des
PodPsispl-api-mkp-des-b45f5f9f-mk2rgNamespaceNSsispl-des
Just now
Generated from kubelet on nctvmrh001-scgft-worker-0-cs2xc
4 times in the last 5 minutes
Started container sispl-api-mkp-des
PodPsispl-api-mkp-des-b45f5f9f-mk2rgNamespaceNSsispl-des
Just now
Generated from kubelet on nctvmrh001-scgft-worker-0-cs2xc
3 times in the last 3 minutes
Container sispl-api-mkp-des failed liveness probe, will be restarted
PodPsispl-api-mkp-des-b45f5f9f-mk2rgNamespaceNSsispl-des
Just now
Generated from kubelet on nctvmrh001-scgft-worker-0-cs2xc
9 times in the last 4 minutes
Liveness probe failed: Get "http://25.129.3.104:8080/q/health/live": dial tcp 25.129.3.104:8080: connect: connection refused
PodPsispl-api-mkp-des-b45f5f9f-mk2rgNamespaceNSsispl-des
há 5 minutos
Generated from multus
Add eth0 [25.129.3.104/23] from ovn-kubernetes
PodPsispl-api-mkp-des-b45f5f9f-mk2rgNamespaceNSsispl-des
há 5 minutos
Generated from default-scheduler
Successfully assigned sispl-des/sispl-api-mkp-des-b45f5f9f-mk2rg to nctvmrh001-scgft-worker-0-cs2xc
readinessProbe:, 2 of 2 found for 'readi', at 436:7




-sh-4.2$ oc get pods -n sispl-des -l name=sispl-api-mkp-des -w
NAME                                 READY     STATUS    RESTARTS   AGE
sispl-api-mkp-des-5894bbc97b-7bqs6   0/1       Running   2          4m
sispl-api-mkp-des-b45f5f9f-mk2rg     0/1       Running   2          4m
sispl-api-mkp-des-5894bbc97b-7bqs6   0/1       Running   3         5m
sispl-api-mkp-des-b45f5f9f-mk2rg   0/1       Running   3         5m

