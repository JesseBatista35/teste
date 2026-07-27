2026-07-27T18:44:19.0166021Z ##[section]Starting: Verificando Status do Deployment
2026-07-27T18:44:19.0174921Z ==============================================================================
2026-07-27T18:44:19.0175126Z Task         : Bash
2026-07-27T18:44:19.0175169Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-27T18:44:19.0175234Z Version      : 3.227.0
2026-07-27T18:44:19.0175345Z Author       : Microsoft Corporation
2026-07-27T18:44:19.0175399Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-27T18:44:19.0175469Z ==============================================================================
2026-07-27T18:44:19.1839369Z Generating script.
2026-07-27T18:44:19.1852755Z ========================== Starting Command Output ===========================
2026-07-27T18:44:19.1863506Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/cdfa7581-383b-4b51-bf51-2dd682e49480.sh
2026-07-27T18:44:19.2744179Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-07-27T18:44:19.9314023Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-07-27T18:44:20.0211154Z Waiting for rollout to finish: 0 of 1 updated replicas are available...
2026-07-27T18:50:26.5307531Z ##[error]The task has timed out.
2026-07-27T18:50:26.5309046Z ##[section]Finishing: Verificando Status do Deployment



2026-07-27T18:50:26.5330033Z ##[section]Starting: Logs da Aplicação
2026-07-27T18:50:26.5333419Z ==============================================================================
2026-07-27T18:50:26.5333497Z Task         : Bash
2026-07-27T18:50:26.5333577Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-27T18:50:26.5333639Z Version      : 3.227.0
2026-07-27T18:50:26.5333681Z Author       : Microsoft Corporation
2026-07-27T18:50:26.5333763Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-27T18:50:26.5333845Z ==============================================================================
2026-07-27T18:50:26.9817306Z Generating script.
2026-07-27T18:50:26.9831503Z ========================== Starting Command Output ===========================
2026-07-27T18:50:26.9839592Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/a6149138-7fe0-4959-852c-9133e58b65db.sh
2026-07-27T18:50:26.9898744Z + shopt -s expand_aliases
2026-07-27T18:50:26.9898915Z + [[ -n okd4_nprd ]]
2026-07-27T18:50:26.9899132Z + [[ okd4_nprd =~ ocp ]]
2026-07-27T18:50:26.9899251Z + [[ -n okd4_nprd ]]
2026-07-27T18:50:26.9899354Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-07-27T18:50:26.9899494Z + app=sifpp-frontend-tqs
2026-07-27T18:50:26.9899582Z + oc version
2026-07-27T18:50:27.0729680Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-07-27T18:50:27.0730034Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-07-27T18:50:27.0730219Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-07-27T18:50:27.0760550Z ++ oc get pod -l name=sifpp-frontend-tqs -n sifpp-tqs -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-07-27T18:50:27.0761943Z ++ tac
2026-07-27T18:50:27.0763263Z ++ grep -v '^$'
2026-07-27T18:50:27.0763366Z ++ head -n1
2026-07-27T18:50:27.1786744Z + last_pod=sifpp-frontend-tqs-10-lwl96
2026-07-27T18:50:27.1786985Z + echo 'Logs do POD: sifpp-frontend-tqs-10-lwl96'
2026-07-27T18:50:27.1787193Z + oc logs sifpp-frontend-tqs-10-lwl96 -c sifpp-frontend-tqs -n sifpp-tqs
2026-07-27T18:50:27.1787395Z Logs do POD: sifpp-frontend-tqs-10-lwl96
2026-07-27T18:50:27.2733331Z nginx: [emerg] host not found in upstream "sifpp-container-backend-des-esteiras" in /opt/app-root/etc/nginx.default.d/sifpp-nginx.conf:6
2026-07-27T18:50:27.2839843Z ##[section]Finishing: Logs da Aplicação



LOG DO POD:

sifpp-frontend-tqs-11-m5mlm
CrashLoopBackOff



2026/07/27 18:54:49 Starting NGINX Prometheus Exporter Version= GitCommit=
2026/07/27 18:54:49 Could not create Nginx Client: failed to get http://127.0.0.1:8080/stub_status: Get http://127.0.0.1:8080/stub_status: dial tcp 127.0.0.1:8080: connect: connection refused


EVENTS:
2026/07/27 18:54:49 Starting NGINX Prometheus Exporter Version= GitCommit=
2026/07/27 18:54:49 Could not create Nginx Client: failed to get http://127.0.0.1:8080/stub_status: Get http://127.0.0.1:8080/stub_status: dial tcp 127.0.0.1:8080: connect: connection refused



