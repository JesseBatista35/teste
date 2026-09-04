2026-09-04T17:22:42.6682065Z ##[section]Starting: Verificando Status do Deployment
2026-09-04T17:22:42.6685240Z ==============================================================================
2026-09-04T17:22:42.6685342Z Task         : Bash
2026-09-04T17:22:42.6685382Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-04T17:22:42.6685441Z Version      : 3.227.0
2026-09-04T17:22:42.6685486Z Author       : Microsoft Corporation
2026-09-04T17:22:42.6685542Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-04T17:22:42.6685740Z ==============================================================================
2026-09-04T17:22:43.4979076Z Generating script.
2026-09-04T17:22:43.4993836Z ========================== Starting Command Output ===========================
2026-09-04T17:22:43.5001301Z [command]/bin/bash /opt/ads-agent/_work/_temp/d0c36b20-a2b5-4f0e-84d8-d9778a8fce59.sh
2026-09-04T17:22:43.7319157Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-09-04T17:28:50.1759835Z ##[error]The task has timed out.
2026-09-04T17:28:50.1760791Z ##[section]Finishing: Verificando Status do Deployment



2026-09-04T17:28:50.1847650Z ##[section]Starting: Logs da Aplicação
2026-09-04T17:28:50.1851113Z ==============================================================================
2026-09-04T17:28:50.1851191Z Task         : Bash
2026-09-04T17:28:50.1851241Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-04T17:28:50.1851300Z Version      : 3.227.0
2026-09-04T17:28:50.1851396Z Author       : Microsoft Corporation
2026-09-04T17:28:50.1851445Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-04T17:28:50.1851521Z ==============================================================================
2026-09-04T17:28:51.2691233Z Generating script.
2026-09-04T17:28:51.2702234Z ========================== Starting Command Output ===========================
2026-09-04T17:28:51.2710858Z [command]/bin/bash /opt/ads-agent/_work/_temp/1ca14c95-1a7e-475a-9d9d-7f966207c00f.sh
2026-09-04T17:28:51.2761725Z + shopt -s expand_aliases
2026-09-04T17:28:51.2761886Z + [[ -n okd4_nprd ]]
2026-09-04T17:28:51.2762071Z + [[ okd4_nprd =~ ocp ]]
2026-09-04T17:28:51.2764221Z + [[ -n okd4_nprd ]]
2026-09-04T17:28:51.2764348Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-09-04T17:28:51.2764499Z + app=simpf-frontend-des
2026-09-04T17:28:51.2764601Z + oc version
2026-09-04T17:28:51.4360351Z oc v3.11.0+0cbc58b
2026-09-04T17:28:51.4360556Z kubernetes v1.11.0+d4cacc0
2026-09-04T17:28:51.4360859Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-09-04T17:28:51.4449284Z 
2026-09-04T17:28:51.4451694Z Server https://api.nprd.caixa:6443
2026-09-04T17:28:51.4453874Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-09-04T17:28:51.4490251Z ++ oc get pod -l name=simpf-frontend-des -n simpf-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-04T17:28:51.4495357Z ++ tac
2026-09-04T17:28:51.4497436Z ++ grep -v '^$'
2026-09-04T17:28:51.4499654Z ++ head -n1
2026-09-04T17:28:51.6885143Z + last_pod=simpf-frontend-des-299-2snvj
2026-09-04T17:28:51.6885744Z + echo 'Logs do POD: simpf-frontend-des-299-2snvj'
2026-09-04T17:28:51.6886402Z + oc logs simpf-frontend-des-299-2snvj -c simpf-frontend-des -n simpf-des
2026-09-04T17:28:51.6886755Z Logs do POD: simpf-frontend-des-299-2snvj
2026-09-04T17:28:51.9800341Z 2026/09/04 14:28:22 [error] 22#0: *1 directory index of "/opt/app-root/src/" is forbidden, client: 25.0.44.1, server: _, request: "GET / HTTP/1.1", host: "25.0.45.175:8080"
2026-09-04T17:28:51.9801374Z [04/Sep/2026:14:28:22 -0300] 25.0.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1788542902.166 request_time 0.000 403 153 - kube-probe/1.25 -
2026-09-04T17:28:51.9801800Z 2026/09/04 14:28:32 [error] 22#0: *3 directory index of "/opt/app-root/src/" is forbidden, client: 25.0.44.1, server: _, request: "GET / HTTP/1.1", host: "25.0.45.175:8080"
2026-09-04T17:28:51.9802141Z [04/Sep/2026:14:28:32 -0300] 25.0.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1788542912.165 request_time 0.000 403 153 - kube-probe/1.25 -
2026-09-04T17:28:51.9802475Z 2026/09/04 14:28:32 [error] 22#0: *2 directory index of "/opt/app-root/src/" is forbidden, client: 25.0.44.1, server: _, request: "GET / HTTP/1.1", host: "25.0.45.175:8080"
2026-09-04T17:28:51.9803544Z [04/Sep/2026:14:28:32 -0300] 25.0.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1788542912.166 request_time 0.000 403 153 - kube-probe/1.25 -
2026-09-04T17:28:51.9804389Z 2026/09/04 14:28:42 [error] 22#0: *5 directory index of "/opt/app-root/src/" is forbidden, client: 25.0.44.1, server: _, request: "GET / HTTP/1.1", host: "25.0.45.175:8080"
2026-09-04T17:28:51.9805019Z [04/Sep/2026:14:28:42 -0300] 25.0.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1788542922.165 request_time 0.000 403 153 - kube-probe/1.25 -
2026-09-04T17:28:51.9805737Z 2026/09/04 14:28:42 [error] 22#0: *4 directory index of "/opt/app-root/src/" is forbidden, client: 25.0.44.1, server: _, request: "GET / HTTP/1.1", host: "25.0.45.175:8080"
2026-09-04T17:28:51.9806135Z [04/Sep/2026:14:28:42 -0300] 25.0.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1788542922.165 request_time 0.000 403 153 - kube-probe/1.25 -
2026-09-04T17:28:51.9806733Z 2026/09/04 14:28:42 [error] 22#0: *6 directory index of "/opt/app-root/src/" is forbidden, client: 25.0.44.1, server: _, request: "GET / HTTP/1.1", host: "25.0.45.175:8080"
2026-09-04T17:28:51.9807068Z [04/Sep/2026:14:28:42 -0300] 25.0.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1788542922.166 request_time 0.000 403 153 - kube-probe/1.25 -
2026-09-04T17:28:51.9897742Z ##[section]Finishing: Logs da Aplicação




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

Project: simpf-des
Pods
Pod details
Pod
P
simpf-frontend-des-300-h68jc
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
PodPsimpf-frontend-des-300-h68jc
NamespaceNSsimpf-des
4 de set. de 2026, 14:56
Generated from kubelet on ceadecldlx084.nprd.caixa
Readiness probe failed: HTTP probe failed with statuscode: 403
PodPsimpf-frontend-des-300-h68jc
NamespaceNSsimpf-des
4 de set. de 2026, 14:56
Generated from kubelet on ceadecldlx084.nprd.caixa
2 times in the last 0 minutes
Liveness probe failed: HTTP probe failed with statuscode: 403
PodPsimpf-frontend-des-300-h68jc
NamespaceNSsimpf-des
4 de set. de 2026, 14:56
Generated from kubelet on ceadecldlx084.nprd.caixa
Created container simpf-frontend-des-exporter
PodPsimpf-frontend-des-300-h68jc
NamespaceNSsimpf-des
4 de set. de 2026, 14:56
Generated from kubelet on ceadecldlx084.nprd.caixa
Started container simpf-frontend-des-exporter
PodPsimpf-frontend-des-300-h68jc
NamespaceNSsimpf-des
4 de set. de 2026, 14:56
Generated from kubelet on ceadecldlx084.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/simpf-frontend:3.12.0.9" in 1.084033775s (1.084050217s including waiting)
PodPsimpf-frontend-des-300-h68jc
NamespaceNSsimpf-des
4 de set. de 2026, 14:56
Generated from kubelet on ceadecldlx084.nprd.caixa
Created container simpf-frontend-des
PodPsimpf-frontend-des-300-h68jc
NamespaceNSsimpf-des
4 de set. de 2026, 14:56
Generated from kubelet on ceadecldlx084.nprd.caixa
Started container simpf-frontend-des
PodPsimpf-frontend-des-300-h68jc
NamespaceNSsimpf-des
4 de set. de 2026, 14:56
Generated from kubelet on ceadecldlx084.nprd.caixa
Pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/openshift/nginx-prometheus-exporter"
PodPsimpf-frontend-des-300-h68jc
NamespaceNSsimpf-des
4 de set. de 2026, 14:56
Generated from kubelet on ceadecldlx084.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/openshift/nginx-prometheus-exporter" in 50.04382ms (50.0501ms including waiting)
PodPsimpf-frontend-des-300-h68jc
NamespaceNSsimpf-des
4 de set. de 2026, 14:56
Generated from multus
Add eth0 [25.3.41.252/23] from openshift-sdn
PodPsimpf-frontend-des-300-h68jc
NamespaceNSsimpf-des
4 de set. de 2026, 14:56
Generated from kubelet on ceadecldlx084.nprd.caixa
Pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/simpf-frontend:3.12.0.9"
PodPsimpf-frontend-des-300-h68jc
NamespaceNSsimpf-des
4 de set. de 2026, 14:56
Generated from default-scheduler
Successfully assigned simpf-des/simpf-frontend-des-300-h68jc to ceadecldlx084.nprd.caixa




log:


[04/Sep/2026:14:56:21 -0300] 127.0.0.1 - - - _ to: -: GET /stub_status HTTP/1.1 upstream_response_time - msec 1788544581.069 request_time 0.000 200 97 - NGINX-Prometheus-Exporter/v -
2026/09/04 14:56:37 [error] 22#0: *2 directory index of "/opt/app-root/src/" is forbidden, client: 25.3.40.1, server: _, request: "GET / HTTP/1.1", host: "25.3.41.252:8080"
[04/Sep/2026:14:56:37 -0300] 25.3.40.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1788544597.214 request_time 0.000 403 153 - kube-probe/1.25 -
2026/09/04 14:56:47 [error] 22#0: *3 directory index of "/opt/app-root/src/" is forbidden, client: 25.3.40.1, server: _, request: "GET / HTTP/1.1", host: "25.3.41.252:8080"
[04/Sep/2026:14:56:47 -0300] 25.3.40.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1788544607.213 request_time 0.000 403 153 - kube-probe/1.25 -
2026/09/04 14:56:47 [error] 22#0: *4 directory index of "/opt/app-root/src/" is forbidden, client: 25.3.40.1, server: _, request: "GET / HTTP/1.1", host: "25.3.41.252:8080"
[04/Sep/2026:14:56:47 -0300] 25.3.40.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1788544607.213 request_time 0.000 403 153 - kube-probe/1.25 -
2026/09/04 14:56:57 [error] 22#0: *5 directory index of "/opt/app-root/src/" is forbidden, client: 25.3.40.1, server: _, request: "GET / HTTP/1.1", host: "25.3.41.252:8080"
2026/09/04 14:56:57 [error] 23#0: *6 directory index of "/opt/app-root/src/" is forbidden, client: 25.3.40.1, server: _, request: "GET / HTTP/1.1", host: "25.3.41.252:8080"
[04/Sep/2026:14:56:57 -0300] 25.3.40.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1788544617.214 request_time 0.000 403 153 - kube-probe/1.25 -
[04/Sep/2026:14:56:57 -0300] 25.3.40.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1788544617.214 request_time 0.000 403 153 - kube-probe/1.25 -
2026/09/04 14:56:57 [error] 22#0: *7 directory index of "/opt/app-root/src/" is forbidden, client: 25.3.40.1, server: _, request: "GET / HTTP/1.1", host: "25.3.41.252:8080"
[04/Sep/2026:14:56:57 -0300] 25.3.40.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1788544617.215 request_time 0.000 403 153 - kube-probe/1.25 -




fiz um start rolout.

parece que nao deu mais o mesmo erro de antes




