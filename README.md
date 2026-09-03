2026-09-03T19:13:42.2008634Z ##[section]Starting: Logs da Aplicação
2026-09-03T19:13:42.2013686Z ==============================================================================
2026-09-03T19:13:42.2013782Z Task         : Bash
2026-09-03T19:13:42.2013822Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-03T19:13:42.2013884Z Version      : 3.227.0
2026-09-03T19:13:42.2013937Z Author       : Microsoft Corporation
2026-09-03T19:13:42.2013984Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-03T19:13:42.2014050Z ==============================================================================
2026-09-03T19:13:43.2762969Z Generating script.
2026-09-03T19:13:43.2774453Z ========================== Starting Command Output ===========================
2026-09-03T19:13:43.2782689Z [command]/bin/bash /opt/ads-agent/_work/_temp/823a08e2-e20c-4b50-aee0-bca8e19b90e6.sh
2026-09-03T19:13:43.2831854Z + shopt -s expand_aliases
2026-09-03T19:13:43.2833754Z + [[ -n okd4_nprd ]]
2026-09-03T19:13:43.2834197Z + [[ okd4_nprd =~ ocp ]]
2026-09-03T19:13:43.2834467Z + [[ -n okd4_nprd ]]
2026-09-03T19:13:43.2834578Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-09-03T19:13:43.2834716Z + app=simpf-frontend-des
2026-09-03T19:13:43.2834924Z + oc version
2026-09-03T19:13:43.4108810Z oc v3.11.0+0cbc58b
2026-09-03T19:13:43.4108981Z kubernetes v1.11.0+d4cacc0
2026-09-03T19:13:43.4109299Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-09-03T19:13:43.4206661Z 
2026-09-03T19:13:43.4207091Z Server https://api.nprd.caixa:6443
2026-09-03T19:13:43.4207401Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-09-03T19:13:43.4238273Z ++ oc get pod -l name=simpf-frontend-des -n simpf-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-03T19:13:43.4238471Z ++ tac
2026-09-03T19:13:43.4238597Z ++ grep -v '^$'
2026-09-03T19:13:43.4238688Z ++ head -n1
2026-09-03T19:13:43.6460016Z + last_pod=simpf-frontend-des-296-ls6d8
2026-09-03T19:13:43.6460361Z + echo 'Logs do POD: simpf-frontend-des-296-ls6d8'
2026-09-03T19:13:43.6462622Z + oc logs simpf-frontend-des-296-ls6d8 -c simpf-frontend-des -n simpf-des
2026-09-03T19:13:43.6463007Z Logs do POD: simpf-frontend-des-296-ls6d8
2026-09-03T19:13:43.9039299Z sed: can't read /opt/app-root/src/main*.js: No such file or directory
2026-09-03T19:13:43.9119739Z ##[section]Finishing: Logs da Aplicação


log do pod?:




sed: can't read /opt/app-root/src/main*.js: No such file or directory


2026/09/03 20:04:35 Starting NGINX Prometheus Exporter Version= GitCommit=
2026/09/03 20:04:35 Could not create Nginx Client: failed to get http://127.0.0.1:8080/stub_status: Get http://127.0.0.1:8080/stub_status: dial tcp 127.0.0.1:8080: connect: connection refused





