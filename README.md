2026-07-24T16:52:52.5958611Z ##[section]Starting: Verificando Status do Deployment
2026-07-24T16:52:52.5962036Z ==============================================================================
2026-07-24T16:52:52.5962113Z Task         : Bash
2026-07-24T16:52:52.5962163Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-24T16:52:52.5962224Z Version      : 3.227.0
2026-07-24T16:52:52.5962265Z Author       : Microsoft Corporation
2026-07-24T16:52:52.5962322Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-24T16:52:52.5962392Z ==============================================================================
2026-07-24T16:52:52.7371824Z Generating script.
2026-07-24T16:52:52.7384459Z ========================== Starting Command Output ===========================
2026-07-24T16:52:52.7393446Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/f9816a38-d725-4f94-9b5f-926303f25ba3.sh
2026-07-24T16:52:52.8330736Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-07-24T16:52:53.2737874Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-07-24T16:52:53.3720758Z Waiting for rollout to finish: 0 of 1 updated replicas are available...
2026-07-24T16:59:00.1075669Z ##[error]The task has timed out.
2026-07-24T16:59:00.1076700Z ##[section]Finishing: Verificando Status do Deployment



2026-07-24T16:59:00.1101667Z ##[section]Starting: Logs da Aplicação
2026-07-24T16:59:00.1107040Z ==============================================================================
2026-07-24T16:59:00.1107190Z Task         : Bash
2026-07-24T16:59:00.1107260Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-24T16:59:00.1107367Z Version      : 3.227.0
2026-07-24T16:59:00.1107448Z Author       : Microsoft Corporation
2026-07-24T16:59:00.1107533Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-24T16:59:00.1107655Z ==============================================================================
2026-07-24T16:59:00.2432754Z Generating script.
2026-07-24T16:59:00.2444209Z ========================== Starting Command Output ===========================
2026-07-24T16:59:00.2453514Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/aa3262ad-5704-404c-9d8b-006dcc36ca89.sh
2026-07-24T16:59:00.2511098Z + shopt -s expand_aliases
2026-07-24T16:59:00.2511261Z + [[ -n okd4_nprd ]]
2026-07-24T16:59:00.2511446Z + [[ okd4_nprd =~ ocp ]]
2026-07-24T16:59:00.2511566Z + [[ -n okd4_nprd ]]
2026-07-24T16:59:00.2511668Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-07-24T16:59:00.2511831Z + app=siavl-enviomsgativa-microfront-des
2026-07-24T16:59:00.2511930Z + oc version
2026-07-24T16:59:00.3335273Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-07-24T16:59:00.3335582Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-07-24T16:59:00.3335772Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-07-24T16:59:00.3368137Z ++ oc get pod -l name=siavl-enviomsgativa-microfront-des -n siavl-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-07-24T16:59:00.3369151Z ++ tac
2026-07-24T16:59:00.3369389Z ++ grep -v '^$'
2026-07-24T16:59:00.3371959Z ++ head -n1
2026-07-24T16:59:00.4164709Z + last_pod=siavl-enviomsgativa-microfront-des-3-xjh66
2026-07-24T16:59:00.4164979Z + echo 'Logs do POD: siavl-enviomsgativa-microfront-des-3-xjh66'
2026-07-24T16:59:00.4165369Z + oc logs siavl-enviomsgativa-microfront-des-3-xjh66 -c siavl-enviomsgativa-microfront-des -n siavl-des
2026-07-24T16:59:00.4165828Z Logs do POD: siavl-enviomsgativa-microfront-des-3-xjh66
2026-07-24T16:59:00.5033889Z /tmp/scripts/run: line 25: unexpected EOF while looking for matching `"'
2026-07-24T16:59:00.5122294Z ##[section]Finishing: Logs da Aplicação



2026/07/24 16:58:57 Starting NGINX Prometheus Exporter Version= GitCommit=
2026/07/24 16:58:57 Could not create Nginx Client: failed to get http://127.0.0.1:8080/stub_status: Get http://127.0.0.1:8080/stub_status: dial tcp 127.0.0.1:8080: connect: connection refused
 
/tmp/scripts/run: line 25: unexpected EOF while looking for matching `"'
 
