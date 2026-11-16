<img width="1464" height="817" alt="image" src="https://github.com/user-attachments/assets/19788235-62cd-48d9-9f1d-94baa31f9257" />



no qrcode nao tem esse bosta de verica--integriade_sem_sonar

eu desebilitei passou do setep

2026-11-16T23:42:22.4117477Z ##[section]Starting: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
2026-11-16T23:42:22.4120922Z ==============================================================================
2026-11-16T23:42:22.4121018Z Task         : Bash
2026-11-16T23:42:22.4121065Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-16T23:42:22.4121137Z Version      : 3.227.0
2026-11-16T23:42:22.4121194Z Author       : Microsoft Corporation
2026-11-16T23:42:22.4121251Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-16T23:42:22.4121347Z ==============================================================================
2026-11-16T23:42:22.5378869Z Generating script.
2026-11-16T23:42:22.5389386Z ========================== Starting Command Output ===========================
2026-11-16T23:42:22.5399196Z [command]/bin/bash /opt/ads-agent/_work/_temp/e5cd23fe-e721-4873-b5ed-2c635f725dbb.sh
2026-11-16T23:42:22.5459252Z + echo ocp_nprd
2026-11-16T23:42:22.5459550Z + egrep -q '^(okd4|ocp|openshift)'
2026-11-16T23:42:22.5494687Z ++ check_status_code https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sispi-dict-reivindicacoes/manifests/20261116.1231-1.0.0-SNAPSHOT
2026-11-16T23:42:22.5495155Z ++ local url=https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sispi-dict-reivindicacoes/manifests/20261116.1231-1.0.0-SNAPSHOT
2026-11-16T23:42:22.5498637Z ++ curl --location --request GET https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sispi-dict-reivindicacoes/manifests/20261116.1231-1.0.0-SNAPSHOT --header 'Authorization: Bearer ***' --header 'Content-Type: text/plain' -s -k -o /dev/null -w '%{http_code}'
2026-11-16T23:42:22.7602453Z + status_code=200
2026-11-16T23:42:22.7602847Z + [[ 200 -ne 200 ]]
2026-11-16T23:42:22.7602963Z + [[ des == \p\r\d ]]
2026-11-16T23:42:22.7603129Z + build=sispi-dict-reivindicacoes
2026-11-16T23:42:22.7603306Z + app=sispi-dict-reivindicacoes-des
2026-11-16T23:42:22.7603448Z + [[ des == \p\r\d ]]
2026-11-16T23:42:22.7603857Z + oc set image deploymentconfig/sispi-dict-reivindicacoes-des sispi-dict-reivindicacoes-des=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispi-dict-reivindicacoes:20261116.1231-1.0.0-SNAPSHOT -n sispi-des
2026-11-16T23:42:22.9980541Z deploymentconfig.apps.openshift.io/sispi-dict-reivindicacoes-des image updated
2026-11-16T23:42:23.0017931Z + echo openshift/quarkus-caixa-release
2026-11-16T23:42:23.0018127Z + egrep -q openshift/angular-caixa-release
2026-11-16T23:42:23.0057580Z + echo openshift/quarkus-caixa-release
2026-11-16T23:42:23.0058323Z + egrep -q openshift/php-caixa-release
2026-11-16T23:42:23.0092198Z + echo 'Template não é angular nem php e não precisa deste replace'
2026-11-16T23:42:23.0092567Z + oc patch --type merge deploymentconfig/sispi-dict-reivindicacoes-des -p '{"spec":{"template":{"spec":{"imagePullSecrets":[{"name":"registry-secret"}]}}}}' -n sispi-des
2026-11-16T23:42:23.0094017Z Template não é angular nem php e não precisa deste replace
2026-11-16T23:42:23.2754103Z deploymentconfig.apps.openshift.io/sispi-dict-reivindicacoes-des not patched
2026-11-16T23:42:23.2802920Z + oc get secret registry-secret -n sispi-des
2026-11-16T23:42:23.5244301Z NAME              TYPE                             DATA      AGE
2026-11-16T23:42:23.5244733Z registry-secret   kubernetes.io/dockerconfigjson   1         3y7d
2026-11-16T23:42:23.5282467Z + [[ deploymentconfig == deployment ]]
2026-11-16T23:42:23.5282728Z + oc rollout cancel deploymentconfig/sispi-dict-reivindicacoes-des -n sispi-des
2026-11-16T23:42:23.8329726Z No rollout is in progress (latest rollout #3 failed 32 minutes ago)
2026-11-16T23:42:23.8365811Z + sleep 20
2026-11-16T23:42:43.8383130Z + oc rollout latest deploymentconfig/sispi-dict-reivindicacoes-des -n sispi-des
2026-11-16T23:42:44.1486503Z deploymentconfig.apps.openshift.io/sispi-dict-reivindicacoes-des rolled out
2026-11-16T23:42:44.1572677Z ##[section]Finishing: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
