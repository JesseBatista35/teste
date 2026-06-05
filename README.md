me ajuda a resolver esspe problema

2026-06-05T18:37:04.8468768Z ##[section]Starting: Verificando Status do Deployment
2026-06-05T18:37:04.8472092Z ==============================================================================
2026-06-05T18:37:04.8472174Z Task         : Bash
2026-06-05T18:37:04.8472221Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-05T18:37:04.8472316Z Version      : 3.227.0
2026-06-05T18:37:04.8472364Z Author       : Microsoft Corporation
2026-06-05T18:37:04.8472420Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-05T18:37:04.8472529Z ==============================================================================
2026-06-05T18:37:04.9966721Z Generating script.
2026-06-05T18:37:04.9977232Z ========================== Starting Command Output ===========================
2026-06-05T18:37:04.9983813Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/8be3c401-ab4b-43e9-ab51-68e28062bcd4.sh
2026-06-05T18:37:05.0860658Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-06-05T18:37:06.2311568Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-06-05T18:37:06.3983498Z Waiting for rollout to finish: 0 of 1 updated replicas are available...
2026-06-05T18:43:12.3565479Z ##[error]The task has timed out.
2026-06-05T18:43:12.3567086Z ##[section]Finishing: Verificando Status do Deployment



erro no pod:
sicbc-backend-des-12-9fcb9
CrashLoopBackOff






exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar


OKD


Jesse Mouta Pereira Batista

Administrator
Home
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

Project: sicbc-des
Pods
Pod details
Pod
P
sicbc-backend-des-12-9fcb9
CrashLoopBackOff

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
PodPsicbc-backend-des-12-9fcb9
NamespaceNSsicbc-des
5 de jun. de 2026, 16:55
Generated from kubelet on ceadecldlx057.nprd.caixa
9 times in the last 1 minute
Back-off restarting failed container
PodPsicbc-backend-des-12-9fcb9
NamespaceNSsicbc-des
5 de jun. de 2026, 16:55
Generated from kubelet on ceadecldlx057.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicbc-backend:00.00.01.03" in 52.529667ms (52.536753ms including waiting)
PodPsicbc-backend-des-12-9fcb9
NamespaceNSsicbc-des
5 de jun. de 2026, 16:55
Generated from kubelet on ceadecldlx057.nprd.caixa
4 times in the last 1 minute
Created container sicbc-backend-des
PodPsicbc-backend-des-12-9fcb9
NamespaceNSsicbc-des
5 de jun. de 2026, 16:55
Generated from kubelet on ceadecldlx057.nprd.caixa
4 times in the last 1 minute
Started container sicbc-backend-des
PodPsicbc-backend-des-12-9fcb9
NamespaceNSsicbc-des
5 de jun. de 2026, 16:55
Generated from kubelet on ceadecldlx057.nprd.caixa
4 times in the last 1 minute
Pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicbc-backend:00.00.01.03"
PodPsicbc-backend-des-12-9fcb9
NamespaceNSsicbc-des
5 de jun. de 2026, 16:54
Generated from kubelet on ceadecldlx057.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicbc-backend:00.00.01.03" in 58.857969ms (58.864685ms including waiting)
PodPsicbc-backend-des-12-9fcb9
NamespaceNSsicbc-des
5 de jun. de 2026, 16:54
Generated from kubelet on ceadecldlx057.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicbc-backend:00.00.01.03" in 39.015728ms (39.026061ms including waiting)
PodPsicbc-backend-des-12-9fcb9
NamespaceNSsicbc-des
5 de jun. de 2026, 16:54
Generated from multus
Add eth0 [25.3.26.69/23] from openshift-sdn
PodPsicbc-backend-des-12-9fcb9
NamespaceNSsicbc-des
5 de jun. de 2026, 16:54
Generated from kubelet on ceadecldlx057.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicbc-backend:00.00.01.03" in 50.594688ms (50.60261ms including waiting)
PodPsicbc-backend-des-12-9fcb9
NamespaceNSsicbc-des
5 de jun. de 2026, 16:54
Generated from default-scheduler
Successfully assigned sicbc-des/sicbc-backend-des-12-9fcb9 to ceadecldlx057.nprd.caixa
