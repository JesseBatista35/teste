	Favor verificar a esteira de release do projeto SIPNC-transfcontas-microfront, a mesma apresentando erro!

Task com problema: Criando o ConfigMap nginx-conf.d


Link: https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=508767&environmentId=2362347


2026-08-03T12:10:55.8061704Z ##[section]Starting: Criando o ConfigMap nginx-conf.d
2026-08-03T12:10:55.8067482Z ==============================================================================
2026-08-03T12:10:55.8067654Z Task         : Bash
2026-08-03T12:10:55.8067744Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-03T12:10:55.8067850Z Version      : 3.227.0
2026-08-03T12:10:55.8067966Z Author       : Microsoft Corporation
2026-08-03T12:10:55.8068067Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-03T12:10:55.8068191Z ==============================================================================
2026-08-03T12:10:55.9553151Z Generating script.
2026-08-03T12:10:55.9561101Z Script contents:
2026-08-03T12:10:55.9561964Z oc create configmap nginx-conf-d-sipnc-transfcontas-microfront  --from-file="/opt/ads-agent/_work/r752/a/_SIPNC-transfcontas-microfront-config/sipnc-nginx.conf" -n sipnc-des
2026-08-03T12:10:55.9565264Z ========================== Starting Command Output ===========================
2026-08-03T12:10:55.9571858Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/df6a17e3-6a11-4735-a97c-f5a81279218c.sh
2026-08-03T12:10:56.0224842Z error: error reading /opt/ads-agent/_work/r752/a/_SIPNC-transfcontas-microfront-config/sipnc-nginx.conf: no such file or directory
2026-08-03T12:10:56.0288443Z ##[error]Bash exited with code '1'.
2026-08-03T12:10:56.0323375Z ##[section]Finishing: Criando o ConfigMap nginx-conf.d



2026-08-03T12:10:56.0619209Z ##[section]Starting: Logs da Aplicação
2026-08-03T12:10:56.0624380Z ==============================================================================
2026-08-03T12:10:56.0624590Z Task         : Bash
2026-08-03T12:10:56.0624683Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-03T12:10:56.0624799Z Version      : 3.227.0
2026-08-03T12:10:56.0624892Z Author       : Microsoft Corporation
2026-08-03T12:10:56.0624981Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-03T12:10:56.0625116Z ==============================================================================
2026-08-03T12:10:56.2301381Z Generating script.
2026-08-03T12:10:56.2316640Z ========================== Starting Command Output ===========================
2026-08-03T12:10:56.2326746Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/8fa9048b-db32-42e9-8951-de0cd59fda59.sh
2026-08-03T12:10:56.2397667Z + shopt -s expand_aliases
2026-08-03T12:10:56.2398220Z + [[ -n okd4_nprd ]]
2026-08-03T12:10:56.2398662Z + [[ okd4_nprd =~ ocp ]]
2026-08-03T12:10:56.2398797Z + [[ -n okd4_nprd ]]
2026-08-03T12:10:56.2398969Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-08-03T12:10:56.2399201Z + app=sipnc-transfcontas-microfront-des
2026-08-03T12:10:56.2399313Z + oc version
2026-08-03T12:10:56.3130517Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-08-03T12:10:56.3131023Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-08-03T12:10:56.3131299Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-08-03T12:10:56.3185209Z ++ oc get pod -l name=sipnc-transfcontas-microfront-des -n sipnc-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-08-03T12:10:56.3186591Z ++ tac
2026-08-03T12:10:56.3186997Z ++ grep -v '^$'
2026-08-03T12:10:56.3187175Z ++ head -n1
2026-08-03T12:10:56.4345418Z + last_pod=
2026-08-03T12:10:56.4367272Z ##[error]Bash exited with code '1'.
2026-08-03T12:10:56.4409286Z ##[section]Finishing: Logs da Aplicação



<img width="1221" height="630" alt="image" src="https://github.com/user-attachments/assets/96a4203e-2dd5-48bf-8e0c-0f1d11fe80ba" />


