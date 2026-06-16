2026-06-16T19:44:29.0299209Z ##[section]Starting: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
2026-06-16T19:44:29.0302144Z ==============================================================================
2026-06-16T19:44:29.0302276Z Task         : Bash
2026-06-16T19:44:29.0302337Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-16T19:44:29.0302442Z Version      : 3.227.0
2026-06-16T19:44:29.0302511Z Author       : Microsoft Corporation
2026-06-16T19:44:29.0302564Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-16T19:44:29.0302641Z ==============================================================================
2026-06-16T19:44:29.8814599Z Generating script.
2026-06-16T19:44:29.8824491Z ========================== Starting Command Output ===========================
2026-06-16T19:44:29.8831499Z [command]/bin/bash /opt/ads-agent/_work/_temp/4fb6523b-87f7-4acb-8170-f6134c9ad686.sh
2026-06-16T19:44:29.8879651Z + echo okd4_nprd
2026-06-16T19:44:29.8881296Z + egrep -q '^(okd4|ocp)'
2026-06-16T19:44:29.8911692Z ++ check_status_code https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sipgc-api-informacoes/manifests/1.1.0.14
2026-06-16T19:44:29.8913278Z ++ local url=https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sipgc-api-informacoes/manifests/1.1.0.14
2026-06-16T19:44:29.8915394Z ++ curl --location --request GET https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sipgc-api-informacoes/manifests/1.1.0.14 --header 'Authorization: Bearer ***' --header 'Content-Type: text/plain' -s -k -o /dev/null -w '%{http_code}'
2026-06-16T19:44:30.0366719Z + status_code=200
2026-06-16T19:44:30.0367735Z + [[ 200 -ne 200 ]]
2026-06-16T19:44:30.0367859Z + [[ tqs == \p\r\d ]]
2026-06-16T19:44:30.0368196Z + build=sipgc-api-informacoes
2026-06-16T19:44:30.0368359Z + app=sipgc-api-informacoes-tqs
2026-06-16T19:44:30.0368467Z + [[ tqs == \p\r\d ]]
2026-06-16T19:44:30.0368812Z + oc set image dc/sipgc-api-informacoes-tqs sipgc-api-informacoes-tqs=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sipgc-api-informacoes:1.1.0.14 -n sipgc-tqs
2026-06-16T19:44:30.2366823Z deploymentconfig.apps.openshift.io/sipgc-api-informacoes-tqs image updated
2026-06-16T19:44:30.2395036Z + echo openshift/dotnetcore-caixa-release
2026-06-16T19:44:30.2397076Z + egrep -q openshift/angular-caixa-release
2026-06-16T19:44:30.2426543Z + echo openshift/dotnetcore-caixa-release
2026-06-16T19:44:30.2426990Z + egrep -q openshift/php-caixa-release
2026-06-16T19:44:30.2451990Z + echo 'Template não é angular nem php e não precisa deste replace'
2026-06-16T19:44:30.2452310Z + oc patch --type merge dc/sipgc-api-informacoes-tqs -p '{"spec":{"template":{"spec":{"imagePullSecrets":[{"name":"registry-secret"}]}}}}' -n sipgc-tqs
2026-06-16T19:44:30.2452559Z Template não é angular nem php e não precisa deste replace
2026-06-16T19:44:30.4574716Z deploymentconfig.apps.openshift.io/sipgc-api-informacoes-tqs not patched
2026-06-16T19:44:30.4605127Z + oc get secret registry-secret -n sipgc-tqs
2026-06-16T19:44:30.6642526Z NAME              TYPE                             DATA      AGE
2026-06-16T19:44:30.6643521Z registry-secret   kubernetes.io/dockerconfigjson   1         519d
2026-06-16T19:44:30.6674028Z + [[ dc == deployment ]]
2026-06-16T19:44:30.6674376Z + oc rollout cancel dc/sipgc-api-informacoes-tqs -n sipgc-tqs
2026-06-16T19:44:30.9074500Z No rollout is in progress (latest rollout #82 running (cancelling) 3 seconds ago)
2026-06-16T19:44:30.9104840Z + sleep 20
2026-06-16T19:44:50.9118709Z + oc rollout latest dc/sipgc-api-informacoes-tqs -n sipgc-tqs
2026-06-16T19:44:51.1592425Z error: #83 is already in progress (Running).
2026-06-16T19:44:51.1661920Z ##[error]Bash exited with code '1'.
2026-06-16T19:44:51.1666013Z ##[section]Finishing: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP




ta uma bagunça isso aquio:


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

Project: sipgc-tqs
Pods

Filter

Name
api-informa
/
Name
api-informa

Name

Status

Ready

Restarts

Owner

Memory

CPU

Created
Pod
P
sipgc-api-informacoes-tqs-79-deploy
Completed
0/1	0	
ReplicationController
RC
sipgc-api-informacoes-tqs-79
-	0,000 cores	
16 de jun. de 2026, 16:40

Pod
P
sipgc-api-informacoes-tqs-81-deploy
Completed
0/1	0	
ReplicationController
RC
sipgc-api-informacoes-tqs-81
-	0,000 cores	
16 de jun. de 2026, 16:43

Pod
P
sipgc-api-informacoes-tqs-81-vqwsf
Running
1/1	0	
ReplicationController
RC
sipgc-api-informacoes-tqs-81
33,1 MiB	0,001 cores	
16 de jun. de 2026, 16:43

Pod
P
sipgc-api-informacoes-tqs-83-deploy
Running
1/1	0	
ReplicationController
RC
sipgc-api-informacoes-tqs-83
19,9 MiB	-	
16 de jun. de 2026, 16:44

Pod
P
sipgc-api-informacoes-tqs-83-shf87
Running
0/1	0	
ReplicationController
RC
sipgc-api-informacoes-tqs-83
24,7 MiB	-	
16 de jun. de 2026, 16:44


