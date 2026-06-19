esse é do  simtx-pix

2026-05-20T18:22:30.2622267Z ##[section]Starting: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
2026-05-20T18:22:30.2625709Z ==============================================================================
2026-05-20T18:22:30.2625791Z Task         : Bash
2026-05-20T18:22:30.2625852Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-05-20T18:22:30.2625920Z Version      : 3.227.0
2026-05-20T18:22:30.2625969Z Author       : Microsoft Corporation
2026-05-20T18:22:30.2626034Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-05-20T18:22:30.2626109Z ==============================================================================
2026-05-20T18:22:31.0591473Z Generating script.
2026-05-20T18:22:31.0602076Z ========================== Starting Command Output ===========================
2026-05-20T18:22:31.0609005Z [command]/bin/bash /opt/ads-agent/_work/_temp/52687cfd-e45a-4e76-9f71-6a02d150b363.sh
2026-05-20T18:22:31.0686338Z + echo okd4_nprd
2026-05-20T18:22:31.0687038Z + egrep -q '^(okd4|ocp)'
2026-05-20T18:22:31.0724700Z ++ check_status_code https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/simtx-pix/manifests/20260520.1516-1.4.0.0-SNAPSHOT
2026-05-20T18:22:31.0725114Z ++ local url=https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/simtx-pix/manifests/20260520.1516-1.4.0.0-SNAPSHOT
2026-05-20T18:22:31.0730364Z ++ curl --location --request GET https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/simtx-pix/manifests/20260520.1516-1.4.0.0-SNAPSHOT --header 'Authorization: Bearer ***' --header 'Content-Type: text/plain' -s -k -o /dev/null -w '%{http_code}'
2026-05-20T18:22:31.3723718Z + status_code=200
2026-05-20T18:22:31.3724725Z + [[ 200 -ne 200 ]]
2026-05-20T18:22:31.3725398Z + [[ des == \p\r\d ]]
2026-05-20T18:22:31.3725612Z + build=simtx-pix
2026-05-20T18:22:31.3725883Z + app=simtx-pix-des2-des
2026-05-20T18:22:31.3726014Z + [[ des == \p\r\d ]]
2026-05-20T18:22:31.3726426Z + oc set image deploymentconfig/simtx-pix-des2-des simtx-pix-des2-des=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/simtx-pix:20260520.1516-1.4.0.0-SNAPSHOT -n simtx-des
2026-05-20T18:22:31.4898005Z deploymentconfig.apps.openshift.io/simtx-pix-des2-des image updated
2026-05-20T18:22:31.4924961Z + egrep -q openshift/angular-caixa-release
2026-05-20T18:22:31.4928730Z + echo openshift/quarkus-caixa-release
2026-05-20T18:22:31.4967710Z + echo openshift/quarkus-caixa-release
2026-05-20T18:22:31.4969905Z + egrep -q openshift/php-caixa-release
2026-05-20T18:22:31.5004431Z + echo 'Template não é angular nem php e não precisa deste replace'
2026-05-20T18:22:31.5005286Z + oc patch --type merge dc/simtx-pix-des2-des -p '{"spec":{"template":{"spec":{"imagePullSecrets":[{"name":"registry-secret"}]}}}}' -n simtx-des
2026-05-20T18:22:31.5006117Z Template não é angular nem php e não precisa deste replace
2026-05-20T18:22:31.5988085Z deploymentconfig.apps.openshift.io/simtx-pix-des2-des patched (no change)
2026-05-20T18:22:31.6009632Z + oc get secret registry-secret -n simtx-des
2026-05-20T18:22:31.6856055Z NAME              TYPE                             DATA   AGE
2026-05-20T18:22:31.6857130Z registry-secret   kubernetes.io/dockerconfigjson   1      2y174d
2026-05-20T18:22:31.6878753Z + [[ deploymentconfig == deployment ]]
2026-05-20T18:22:31.6879082Z + oc rollout cancel deploymentconfig/simtx-pix-des2-des -n simtx-des
2026-05-20T18:22:31.8071892Z No rollout is in progress (latest rollout #29 complete 2 days ago)
2026-05-20T18:22:31.8091922Z + sleep 20
2026-05-20T18:22:51.8110738Z + oc rollout latest deploymentconfig/simtx-pix-des2-des -n simtx-des
2026-05-20T18:22:51.9371356Z deploymentconfig.apps.openshift.io/simtx-pix-des2-des rolled out
2026-05-20T18:22:51.9441598Z ##[section]Finishing: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP




esse é do simtx-trasacoes:

2026-06-19T17:30:46.9873154Z ##[section]Starting: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
2026-06-19T17:30:46.9876726Z ==============================================================================
2026-06-19T17:30:46.9876811Z Task         : Bash
2026-06-19T17:30:46.9876861Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-19T17:30:46.9876939Z Version      : 3.227.0
2026-06-19T17:30:46.9876988Z Author       : Microsoft Corporation
2026-06-19T17:30:46.9877056Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-19T17:30:46.9877132Z ==============================================================================
2026-06-19T17:30:47.1040609Z Generating script.
2026-06-19T17:30:47.1041558Z ========================== Starting Command Output ===========================
2026-06-19T17:30:47.1042855Z [command]/bin/bash /opt/ads-agent/_work/_temp/0d485f18-e213-42ef-8037-44a282fdc93f.sh
2026-06-19T17:30:47.1068391Z + echo okd4_nprd
2026-06-19T17:30:47.1068604Z + egrep -q '^(okd4|ocp)'
2026-06-19T17:30:47.1092765Z ++ check_status_code https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/simtx-transacoes-lote/manifests/20260618.1741-1.0.0.1-SNAPSHOT
2026-06-19T17:30:47.1093691Z ++ local url=https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/simtx-transacoes-lote/manifests/20260618.1741-1.0.0.1-SNAPSHOT
2026-06-19T17:30:47.1095651Z ++ curl --location --request GET https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/simtx-transacoes-lote/manifests/20260618.1741-1.0.0.1-SNAPSHOT --header 'Authorization: Bearer ***' --header 'Content-Type: text/plain' -s -k -o /dev/null -w '%{http_code}'
2026-06-19T17:30:47.2623296Z + status_code=200
2026-06-19T17:30:47.2623902Z + [[ 200 -ne 200 ]]
2026-06-19T17:30:47.2624262Z + [[ des == \p\r\d ]]
2026-06-19T17:30:47.2624502Z + build=simtx-transacoes-lote
2026-06-19T17:30:47.2625194Z + app=simtx-transacoes-lote-des
2026-06-19T17:30:47.2625390Z + [[ des == \p\r\d ]]
2026-06-19T17:30:47.2625786Z + oc set image deploymentconfig/simtx-transacoes-lote-des simtx-transacoes-lote-des=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/simtx-transacoes-lote:20260618.1741-1.0.0.1-SNAPSHOT -n simtx-des
2026-06-19T17:30:47.4108930Z + echo openshift/quarkus-caixa-release
2026-06-19T17:30:47.4109783Z + egrep -q openshift/angular-caixa-release
2026-06-19T17:30:47.4140220Z + echo openshift/quarkus-caixa-release
2026-06-19T17:30:47.4140458Z + egrep -q openshift/php-caixa-release
2026-06-19T17:30:47.4178307Z + echo 'Template não é angular nem php e não precisa deste replace'
2026-06-19T17:30:47.4179385Z + oc patch --type merge dc/simtx-transacoes-lote-des -p '{"spec":{"template":{"spec":{"imagePullSecrets":[{"name":"registry-secret"}]}}}}' -n simtx-des
2026-06-19T17:30:47.4180260Z Template não é angular nem php e não precisa deste replace
2026-06-19T17:30:47.5713260Z deploymentconfig.apps.openshift.io/simtx-transacoes-lote-des not patched
2026-06-19T17:30:47.5746688Z + oc get secret registry-secret -n simtx-des
2026-06-19T17:30:47.7060562Z NAME              TYPE                             DATA      AGE
2026-06-19T17:30:47.7061048Z registry-secret   kubernetes.io/dockerconfigjson   1         2y204d
2026-06-19T17:30:47.7087723Z + [[ deploymentconfig == deployment ]]
2026-06-19T17:30:47.7088033Z + oc rollout cancel deploymentconfig/simtx-transacoes-lote-des -n simtx-des
2026-06-19T17:30:47.8830325Z No rollout is in progress (latest rollout #804 complete 8 minutes ago)
2026-06-19T17:30:47.8859526Z + sleep 20
2026-06-19T17:31:07.8877191Z + oc rollout latest deploymentconfig/simtx-transacoes-lote-des -n simtx-des
2026-06-19T17:31:08.0692531Z deploymentconfig.apps.openshift.io/simtx-transacoes-lote-des rolled out
2026-06-19T17:31:08.0792894Z ##[section]Finishing: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP


P
simtx-transacoes-lote-des-805-deploy
Completed
0/1	0	
ReplicationController
RC
simtx-transacoes-lote-des-805
-	-	
19 de jun. de 2026, 14:31

Pod
P
simtx-transacoes-lote-des-805-wm6vb
Running
1/1	0	
ReplicationController
RC
simtx-transacoes-lote-des-805
517,5 MiB	0,106 cores	
19 de jun. de 2026, 14:31

ele continua cirando em des


se agente apagar tudo que fioxzermos e deixar ele rodar sozinho pra ver???
