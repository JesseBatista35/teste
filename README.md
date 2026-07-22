2026-07-22T18:45:02.9197739Z ##[section]Starting: Verificando Status do Deployment
2026-07-22T18:45:02.9203203Z ==============================================================================
2026-07-22T18:45:02.9203378Z Task         : Bash
2026-07-22T18:45:02.9203457Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-22T18:45:02.9203565Z Version      : 3.227.0
2026-07-22T18:45:02.9203664Z Author       : Microsoft Corporation
2026-07-22T18:45:02.9203753Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-22T18:45:02.9203876Z ==============================================================================
2026-07-22T18:45:03.4518818Z Generating script.
2026-07-22T18:45:03.4531829Z ========================== Starting Command Output ===========================
2026-07-22T18:45:03.4541943Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/b9a6d461-9cd9-45a2-b06d-327045a96558.sh
2026-07-22T18:45:03.5550567Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-07-22T18:45:05.0207521Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-07-22T18:51:10.4298558Z ##[error]The task has timed out.
2026-07-22T18:51:10.4300026Z ##[section]Finishing: Verificando Status do Deployment



2026-07-22T18:51:10.4328095Z ##[section]Starting: Logs da Aplicação
2026-07-22T18:51:10.4333097Z ==============================================================================
2026-07-22T18:51:10.4333249Z Task         : Bash
2026-07-22T18:51:10.4333322Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-22T18:51:10.4333430Z Version      : 3.227.0
2026-07-22T18:51:10.4333505Z Author       : Microsoft Corporation
2026-07-22T18:51:10.4333582Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-22T18:51:10.4333690Z ==============================================================================
2026-07-22T18:51:10.5946093Z Generating script.
2026-07-22T18:51:10.5958053Z ========================== Starting Command Output ===========================
2026-07-22T18:51:10.5965494Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/fa54d8b2-6360-4544-aff5-059b838295f5.sh
2026-07-22T18:51:10.6023243Z + shopt -s expand_aliases
2026-07-22T18:51:10.6023487Z + [[ -n okd4_nprd ]]
2026-07-22T18:51:10.6023754Z + [[ okd4_nprd =~ ocp ]]
2026-07-22T18:51:10.6023898Z + [[ -n okd4_nprd ]]
2026-07-22T18:51:10.6024006Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-07-22T18:51:10.6024167Z + app=simil-precificacao-frontend-des
2026-07-22T18:51:10.6024265Z + oc version
2026-07-22T18:51:10.6753047Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-07-22T18:51:10.6753402Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-07-22T18:51:10.6753587Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-07-22T18:51:10.6781628Z ++ oc get pod -l name=simil-precificacao-frontend-des -n simil-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-07-22T18:51:10.6782262Z ++ tac
2026-07-22T18:51:10.6782398Z ++ grep -v '^$'
2026-07-22T18:51:10.6783570Z ++ head -n1
2026-07-22T18:51:10.7809478Z + last_pod=simil-precificacao-frontend-des-65-2wnq2
2026-07-22T18:51:10.7809968Z + echo 'Logs do POD: simil-precificacao-frontend-des-65-2wnq2'
2026-07-22T18:51:10.7812288Z + oc logs simil-precificacao-frontend-des-65-2wnq2 -c simil-precificacao-frontend-des -n simil-des
2026-07-22T18:51:10.7812574Z Logs do POD: simil-precificacao-frontend-des-65-2wnq2
2026-07-22T18:51:10.8833945Z [21/Jul/2026:15:23:54 -0300] 127.0.0.1 - - - _ to: -: GET /stub_status HTTP/1.1 upstream_response_time - msec 1784658234.415 request_time 0.000 200 97 - NGINX-Prometheus-Exporter/v -
2026-07-22T18:51:10.8834454Z [21/Jul/2026:15:24:11 -0300] 25.0.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1784658251.962 request_time 0.000 200 81118 - kube-probe/1.25 -
2026-07-22T18:51:10.8834910Z [21/Jul/2026:15:24:21 -0300] 25.0.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1784658261.962 request_time 0.000 200 81118 - kube-probe/1.25 -
2026-07-22T18:51:10.8835365Z [21/Jul/2026:15:24:21 -0300] 25.0.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1784658261.962 request_time 0.000 200 81118 - kube-probe/1.25 -
2026-07-22T18:51:10.8835707Z [21/Jul/2026:15:24:31 -0300] 25.0.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1784658271.963 request_time 0.000 200 81118 - kube-probe/1.25 -
2026-07-22T18:51:10.8836325Z [21/Jul/2026:15:24:31 -0300] 25.0.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1784658271.963 request_time 0.000 200 81118 - kube-probe/1.25 -
2026-07-22T18:51:10.8836852Z [21/Jul/2026:15:24:41 -0300] 25.0.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1784658281.962 request_time 0.000 200 81118 - kube-probe/1.25 -
2026-07-22T18:51:10.8837313Z [21/Jul/2026:15:24:41 -0300] 25.0.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1784658281.962 request_time 0.000 200 81118 - kube-probe/1.25 -
2026-07-22T18:51:10.8837703Z [21/Jul/2026:15:24:51 -0300] 25.0.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1784658291.962 request_time 0.000 200 81118 - kube-probe/1.25 -
2026-07-22T18:51:10.8838029Z [21/Jul/2026:15:24:51 -0300] 25.0.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1784658291.963 request_time 0.000 200 81118 - kube-probe/1.25 -
2026-07-22T18:51:10.8839100Z [21/Jul/2026:15:25:01 -0300] 25.0.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1784658301.962 request_time 0.000 200 81118 - kube-probe/1.25 -
2026-07-22T18:51:10.8839584Z [21/Jul/2026:15:25:01 -0300] 25.0.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1784658301.962 request_time 0.000 200 81118 - kube-probe/1.25 -
2026-07-22T18:51:10.8839907Z [21/Jul/2026:15:25:11 -0300] 25.0.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1784658311.962 request_time 0.000 200 81118 - kube-probe/1.25 -
2026-07-22T18:51:10.8840338Z [21/Jul/2026:15:25:11 -0300] 25.0.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1784658311.962 request_time 0.000 200 81118 - kube-probe/1.25 -
2026-07-22T18:51:10.8840864Z [21/Jul/2026:15:25:21 -0300] 25.0.44.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1784658321.962 request_time 0.000 200 81118 - kube-probe/1.25 -
