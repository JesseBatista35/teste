OKD


Jesse Mouta Pereira Batista

Administrator
Home
Operators
Workloads
Networking
Storage
Builds
Observe
Compute
User Management
Administration

Project: simtx-des
Pods

Filter

Name
transacoes-lote-des2
/
Name
transacoes-lote-des2

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
simtx-transacoes-lote-des2-2-94qsb
Running
1/1	0	
ReplicationController
RC
simtx-transacoes-lote-des2-2
548,0 MiB	0,003 cores	
19 de jun. de 2026, 12:15

Pod
P
simtx-transacoes-lote-des2-2-deploy
Completed
0/1	0	
ReplicationController
RC
simtx-transacoes-lote-des2-2
-	-	
19 de jun. de 2026, 12:15

Pod
P
simtx-transacoes-lote-des-802-deploy
Completed
0/1	0	
ReplicationController
RC
simtx-transacoes-lote-des-802
-	-	
19 de jun. de 2026, 12:21

então   o deploymente que configuramos deu ceto deu um start rolaut ene ele criou mais aidna a relase quando rodamos estaq criando em des..


olha esses steps:



2026-06-19T15:47:49.9945839Z ##[section]Starting: Criando novo Projeto
2026-06-19T15:47:49.9950475Z ==============================================================================
2026-06-19T15:47:49.9950614Z Task         : Bash
2026-06-19T15:47:49.9950696Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-19T15:47:49.9950820Z Version      : 3.227.0
2026-06-19T15:47:49.9950904Z Author       : Microsoft Corporation
2026-06-19T15:47:49.9951015Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-19T15:47:49.9951152Z ==============================================================================
2026-06-19T15:47:50.1521092Z Generating script.
2026-06-19T15:47:50.1536024Z ========================== Starting Command Output ===========================
2026-06-19T15:47:50.1544543Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/6ea68409-ff8d-4315-8813-fcae6c708eaf.sh
2026-06-19T15:47:50.2505566Z NAME        DISPLAY NAME   STATUS
2026-06-19T15:47:50.2506239Z simtx-des                  Active
2026-06-19T15:47:50.3475681Z namespace/simtx-des not labeled
2026-06-19T15:47:50.4247308Z namespace/simtx-des not labeled
2026-06-19T15:47:50.5085791Z namespace/simtx-des not labeled
2026-06-19T15:47:50.6255136Z netnamespace.network.openshift.io/simtx-des not labeled
2026-06-19T15:47:50.6335124Z ##[section]Finishing: Criando novo Projeto


2026-06-19T15:47:50.6437236Z ##[section]Starting: Criando nova APP
2026-06-19T15:47:50.6440693Z ==============================================================================
2026-06-19T15:47:50.6440779Z Task         : Bash
2026-06-19T15:47:50.6440826Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-19T15:47:50.6440905Z Version      : 3.227.0
2026-06-19T15:47:50.6440952Z Author       : Microsoft Corporation
2026-06-19T15:47:50.6441008Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-19T15:47:50.6441103Z ==============================================================================
2026-06-19T15:47:50.7879894Z Generating script.
2026-06-19T15:47:50.7896165Z ========================== Starting Command Output ===========================
2026-06-19T15:47:50.7903553Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/0396019c-04a9-482e-bc59-82a61bf7c6ec.sh
2026-06-19T15:47:50.8099966Z OKD4 NPRD - des, tqs ou hmp
2026-06-19T15:47:50.8774341Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-06-19T15:47:50.8774914Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-06-19T15:47:50.8775211Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-06-19T15:47:51.0081222Z Essa aplicação já está criada.
2026-06-19T15:47:51.0914559Z deploymentconfig.apps.openshift.io/simtx-transacoes-lote-des patched (no change)
2026-06-19T15:47:51.1827629Z clusterrole.rbac.authorization.k8s.io/system:openshift:scc:anyuid added: "system:serviceaccounts:simtx-des"
2026-06-19T15:47:51.1912415Z ##[section]Finishing: Criando nova APP


2026-06-19T15:48:13.7907011Z ##[section]Starting: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
2026-06-19T15:48:13.7910696Z ==============================================================================
2026-06-19T15:48:13.7910854Z Task         : Bash
2026-06-19T15:48:13.7910903Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-19T15:48:13.7911007Z Version      : 3.227.0
2026-06-19T15:48:13.7911064Z Author       : Microsoft Corporation
2026-06-19T15:48:13.7911123Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-19T15:48:13.7911239Z ==============================================================================
2026-06-19T15:48:13.9600977Z Generating script.
2026-06-19T15:48:13.9614334Z ========================== Starting Command Output ===========================
2026-06-19T15:48:13.9621698Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/257a25eb-dd45-4d29-b3e2-6016d0fd0d26.sh
2026-06-19T15:48:13.9687667Z + echo okd4_nprd
2026-06-19T15:48:13.9689194Z + egrep -q '^(okd4|ocp)'
2026-06-19T15:48:13.9730587Z ++ check_status_code https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/simtx-transacoes-lote/manifests/20260618.1741-1.0.0.1-SNAPSHOT
2026-06-19T15:48:13.9731012Z ++ local url=https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/simtx-transacoes-lote/manifests/20260618.1741-1.0.0.1-SNAPSHOT
2026-06-19T15:48:13.9732848Z ++ curl --location --request GET https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/simtx-transacoes-lote/manifests/20260618.1741-1.0.0.1-SNAPSHOT --header 'Authorization: Bearer ***' --header 'Content-Type: text/plain' -s -k -o /dev/null -w '%{http_code}'
2026-06-19T15:48:14.0537495Z + status_code=200
2026-06-19T15:48:14.0538250Z + [[ 200 -ne 200 ]]
2026-06-19T15:48:14.0538490Z + [[ des == \p\r\d ]]
2026-06-19T15:48:14.0538800Z + build=simtx-transacoes-lote
2026-06-19T15:48:14.0539356Z + app=simtx-transacoes-lote-des
2026-06-19T15:48:14.0539622Z + [[ des == \p\r\d ]]
2026-06-19T15:48:14.0540297Z + oc set image deploymentconfig/simtx-transacoes-lote-des simtx-transacoes-lote-des=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/simtx-transacoes-lote:20260618.1741-1.0.0.1-SNAPSHOT -n simtx-des
2026-06-19T15:48:14.1375348Z + echo openshift/quarkus-caixa-release
2026-06-19T15:48:14.1376213Z + egrep -q openshift/angular-caixa-release
2026-06-19T15:48:14.1417844Z + echo openshift/quarkus-caixa-release
2026-06-19T15:48:14.1418233Z + egrep -q openshift/php-caixa-release
2026-06-19T15:48:14.1461716Z + echo 'Template não é angular nem php e não precisa deste replace'
2026-06-19T15:48:14.1462260Z + oc patch --type merge dc/simtx-transacoes-lote-des -p '{"spec":{"template":{"spec":{"imagePullSecrets":[{"name":"registry-secret"}]}}}}' -n simtx-des
2026-06-19T15:48:14.1463493Z Template não é angular nem php e não precisa deste replace
2026-06-19T15:48:14.2299384Z deploymentconfig.apps.openshift.io/simtx-transacoes-lote-des patched (no change)
2026-06-19T15:48:14.2329322Z + oc get secret registry-secret -n simtx-des
2026-06-19T15:48:14.3019135Z NAME              TYPE                             DATA   AGE
2026-06-19T15:48:14.3045969Z registry-secret   kubernetes.io/dockerconfigjson   1      2y204d
2026-06-19T15:48:14.3046203Z + [[ deploymentconfig == deployment ]]
2026-06-19T15:48:14.4092264Z + oc rollout cancel deploymentconfig/simtx-transacoes-lote-des -n simtx-des
2026-06-19T15:48:14.4092604Z No rollout is in progress (latest rollout #802 complete 27 minutes ago)
2026-06-19T15:48:14.4123800Z + sleep 20
2026-06-19T15:48:34.4155678Z + oc rollout latest deploymentconfig/simtx-transacoes-lote-des -n simtx-des
2026-06-19T15:48:34.5221760Z deploymentconfig.apps.openshift.io/simtx-transacoes-lote-des rolled out
2026-06-19T15:48:34.5318094Z ##[section]Finishing: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP




