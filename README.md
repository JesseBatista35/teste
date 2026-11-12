OKD


Jesse Mouta Pereira Batista

Administrator
Home
Overview
Projects
Search
API Explorer
Events
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

Project: siepr-des
Pods
Pod details
Pod
P
siepr-curso-bec3-frontend-des-19-cqf7z
ImagePullBackOff

Actions
Details
Metrics
YAML
Environment
Logs
Events
Terminal
Streaming events...
Showing 14 events
Older events are not stored.
PodPsiepr-curso-bec3-frontend-des-19-cqf7z
NamespaceNSsiepr-des
12 de nov. de 2026, 11:15
Generated from kubelet on ceadecldlx083.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/openshift/nginx-prometheus-exporter" in 44.355711ms (44.365213ms including waiting)
PodPsiepr-curso-bec3-frontend-des-19-cqf7z
NamespaceNSsiepr-des
12 de nov. de 2026, 11:15
Generated from kubelet on ceadecldlx083.nprd.caixa
2 times in the last 2 minutes
Failed to pull image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siepr-curso-bec3-frontend:1.0.0.4": rpc error: code = Unknown desc = reading signatures: downloading signatures for sha256:4d0ecd0fdc6847de77be80503b1d60d2e7c7441ab7788c5e32b4e8650f10dcb5 in default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siepr-curso-bec3-frontend: received unexpected HTTP status: 504 Gateway Time-out
PodPsiepr-curso-bec3-frontend-des-19-cqf7z
NamespaceNSsiepr-des
12 de nov. de 2026, 11:15
Generated from kubelet on ceadecldlx083.nprd.caixa
2 times in the last 2 minutes
Error: ErrImagePull
PodPsiepr-curso-bec3-frontend-des-19-cqf7z
NamespaceNSsiepr-des
12 de nov. de 2026, 11:15
Generated from kubelet on ceadecldlx083.nprd.caixa
3 times in the last 2 minutes
Pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/openshift/nginx-prometheus-exporter"
PodPsiepr-curso-bec3-frontend-des-19-cqf7z
NamespaceNSsiepr-des
12 de nov. de 2026, 11:15
Generated from kubelet on ceadecldlx083.nprd.caixa
3 times in the last 2 minutes
Created container siepr-curso-bec3-frontend-des-exporter
PodPsiepr-curso-bec3-frontend-des-19-cqf7z
NamespaceNSsiepr-des
12 de nov. de 2026, 11:15
Generated from kubelet on ceadecldlx083.nprd.caixa
2 times in the last 3 minutes
Pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siepr-curso-bec3-frontend:1.0.0.4"
PodPsiepr-curso-bec3-frontend-des-19-cqf7z
NamespaceNSsiepr-des
12 de nov. de 2026, 11:14
Generated from kubelet on ceadecldlx083.nprd.caixa
2 times in the last 2 minutes
Back-off restarting failed container
PodPsiepr-curso-bec3-frontend-des-19-cqf7z
NamespaceNSsiepr-des
12 de nov. de 2026, 11:14
Generated from kubelet on ceadecldlx083.nprd.caixa
3 times in the last 2 minutes
Back-off pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siepr-curso-bec3-frontend:1.0.0.4"
PodPsiepr-curso-bec3-frontend-des-19-cqf7z
NamespaceNSsiepr-des
12 de nov. de 2026, 11:14
Generated from kubelet on ceadecldlx083.nprd.caixa
3 times in the last 2 minutes
Error: ImagePullBackOff
PodPsiepr-curso-bec3-frontend-des-19-cqf7z
NamespaceNSsiepr-des
12 de nov. de 2026, 11:14
Generated from kubelet on ceadecldlx083.nprd.caixa
2 times in the last 2 minutes
Started container siepr-curso-bec3-frontend-des-exporter
PodPsiepr-curso-bec3-frontend-des-19-cqf7z
NamespaceNSsiepr-des
12 de nov. de 2026, 11:14
Generated from kubelet on ceadecldlx083.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/openshift/nginx-prometheus-exporter" in 51.523785ms (51.533548ms including waiting)
PodPsiepr-curso-bec3-frontend-des-19-cqf7z
NamespaceNSsiepr-des
12 de nov. de 2026, 11:14
Generated from kubelet on ceadecldlx083.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/openshift/nginx-prometheus-exporter" in 57.6432ms (57.655918ms including waiting)
PodPsiepr-curso-bec3-frontend-des-19-cqf7z
NamespaceNSsiepr-des
12 de nov. de 2026, 11:14
Generated from multus
Add eth0 [25.1.40.245/23] from openshift-sdn
PodPsiepr-curso-bec3-frontend-des-19-cqf7z
NamespaceNSsiepr-des
12 de nov. de 2026, 11:14
Generated from default-scheduler
Successfully assigned siepr-des/siepr-curso-bec3-frontend-des-19-cqf7z to ceadecldlx083.nprd.caixa



2026/11/12 14:17:50 Starting NGINX Prometheus Exporter Version= GitCommit=
2026/11/12 14:17:50 Could not create Nginx Client: failed to get http://127.0.0.1:8080/stub_status: Get http://127.0.0.1:8080/stub_status: dial tcp 127.0.0.1:8080: connect: connection refused



2026-11-12T14:14:14.2743371Z ##[section]Starting: Verificando Status do Deployment
2026-11-12T14:14:14.2747122Z ==============================================================================
2026-11-12T14:14:14.2747209Z Task         : Bash
2026-11-12T14:14:14.2747252Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-12T14:14:14.2747311Z Version      : 3.227.0
2026-11-12T14:14:14.2747363Z Author       : Microsoft Corporation
2026-11-12T14:14:14.2747413Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-12T14:14:14.2747485Z ==============================================================================
2026-11-12T14:14:14.4043210Z Generating script.
2026-11-12T14:14:14.4053907Z ========================== Starting Command Output ===========================
2026-11-12T14:14:14.4062806Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/e293c620-e018-4983-a357-48f79822a427.sh
2026-11-12T14:14:14.4952059Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-11-12T14:14:16.8901204Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-11-12T14:14:17.0119169Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-11-12T14:20:21.7831131Z ##[error]The task has timed out.
2026-11-12T14:20:21.7832359Z ##[section]Finishing: Verificando Status do Deployment


2026-11-12T14:20:21.7852185Z ##[section]Starting: Logs da Aplicação
2026-11-12T14:20:21.7855505Z ==============================================================================
2026-11-12T14:20:21.7855586Z Task         : Bash
2026-11-12T14:20:21.7855637Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-12T14:20:21.7855711Z Version      : 3.227.0
2026-11-12T14:20:21.7855768Z Author       : Microsoft Corporation
2026-11-12T14:20:21.7855846Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-12T14:20:21.7855958Z ==============================================================================
2026-11-12T14:20:22.2469184Z Generating script.
2026-11-12T14:20:22.2479958Z ========================== Starting Command Output ===========================
2026-11-12T14:20:22.2487241Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/158f7bfb-e0d5-458a-81ad-c3fcd72ae05c.sh
2026-11-12T14:20:22.2546749Z + shopt -s expand_aliases
2026-11-12T14:20:22.2546904Z + [[ -n okd4_nprd ]]
2026-11-12T14:20:22.2547070Z + [[ okd4_nprd =~ ocp ]]
2026-11-12T14:20:22.2547200Z + [[ -n okd4_nprd ]]
2026-11-12T14:20:22.2547307Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-11-12T14:20:22.2547459Z + app=siepr-curso-bec3-frontend-des
2026-11-12T14:20:22.2547575Z + oc version
2026-11-12T14:20:22.3211018Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-11-12T14:20:22.3211277Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-11-12T14:20:22.3211454Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-11-12T14:20:22.3245659Z ++ oc get pod -l name=siepr-curso-bec3-frontend-des -n siepr-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-11-12T14:20:22.3245874Z ++ tac
2026-11-12T14:20:22.3247060Z ++ grep -v '^$'
2026-11-12T14:20:22.3247303Z ++ head -n1
2026-11-12T14:20:22.4040988Z + last_pod=siepr-curso-bec3-frontend-des-19-cqf7z
2026-11-12T14:20:22.4041292Z + echo 'Logs do POD: siepr-curso-bec3-frontend-des-19-cqf7z'
2026-11-12T14:20:22.4041649Z + oc logs siepr-curso-bec3-frontend-des-19-cqf7z -c siepr-curso-bec3-frontend-des -n siepr-des
2026-11-12T14:20:22.4041875Z Logs do POD: siepr-curso-bec3-frontend-des-19-cqf7z
2026-11-12T14:20:22.4859619Z Error from server (BadRequest): container "siepr-curso-bec3-frontend-des" in pod "siepr-curso-bec3-frontend-des-19-cqf7z" is waiting to start: trying and failing to pull image
2026-11-12T14:20:22.4938914Z ##[error]Bash exited with code '1'.
2026-11-12T14:20:22.4957457Z ##[section]Finishing: Logs da Aplicação



LASCOU

