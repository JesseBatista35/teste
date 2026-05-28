2026-05-28T14:15:41.6766013Z ##[section]Starting: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
2026-05-28T14:15:41.6769654Z ==============================================================================
2026-05-28T14:15:41.6769779Z Task         : Bash
2026-05-28T14:15:41.6769823Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-05-28T14:15:41.6769925Z Version      : 3.227.0
2026-05-28T14:15:41.6769995Z Author       : Microsoft Corporation
2026-05-28T14:15:41.6770076Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-05-28T14:15:41.6770189Z ==============================================================================
2026-05-28T14:15:41.8418039Z Generating script.
2026-05-28T14:15:41.8429334Z ========================== Starting Command Output ===========================
2026-05-28T14:15:41.8436316Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/31e4bcd4-b3fe-43bb-ac18-a136953f256b.sh
2026-05-28T14:15:41.8497245Z + echo okd4_nprd
2026-05-28T14:15:41.8499188Z + egrep -q '^(okd4|ocp)'
2026-05-28T14:15:41.8534605Z ++ check_status_code https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sisgf-backend/manifests/20260528.1112-11.01.01.01-SNAPSHOT
2026-05-28T14:15:41.8535166Z ++ local url=https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sisgf-backend/manifests/20260528.1112-11.01.01.01-SNAPSHOT
2026-05-28T14:15:41.8537803Z ++ curl --location --request GET https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sisgf-backend/manifests/20260528.1112-11.01.01.01-SNAPSHOT --header 'Authorization: Bearer ***' --header 'Content-Type: text/plain' -s -k -o /dev/null -w '%{http_code}'
2026-05-28T14:15:41.9072891Z + status_code=200
2026-05-28T14:15:41.9073482Z + [[ 200 -ne 200 ]]
2026-05-28T14:15:41.9073695Z + [[ des == \p\r\d ]]
2026-05-28T14:15:41.9074087Z + build=sisgf-backend
2026-05-28T14:15:41.9074321Z + app=sisgf-backend-des
2026-05-28T14:15:41.9074421Z + [[ des == \p\r\d ]]
2026-05-28T14:15:41.9074979Z + oc set image deploymentconfig/sisgf-backend-des sisgf-backend-des=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisgf-backend:20260528.1112-11.01.01.01-SNAPSHOT -n sisgf-des
2026-05-28T14:15:42.0014928Z deploymentconfig.apps.openshift.io/sisgf-backend-des image updated
2026-05-28T14:15:42.0047124Z + echo openshift/quarkus-caixa-release
2026-05-28T14:15:42.0047316Z + egrep -q openshift/angular-caixa-release
2026-05-28T14:15:42.0097200Z + echo openshift/quarkus-caixa-release
2026-05-28T14:15:42.0098913Z + egrep -q openshift/php-caixa-release
2026-05-28T14:15:42.0130838Z + echo 'Template não é angular nem php e não precisa deste replace'
2026-05-28T14:15:42.0131595Z + oc patch --type merge dc/sisgf-backend-des -p '{"spec":{"template":{"spec":{"imagePullSecrets":[{"name":"registry-secret"}]}}}}' -n sisgf-des
2026-05-28T14:15:42.0132492Z Template não é angular nem php e não precisa deste replace
2026-05-28T14:15:42.0925676Z deploymentconfig.apps.openshift.io/sisgf-backend-des patched (no change)
2026-05-28T14:15:42.0971652Z + oc get secret registry-secret -n sisgf-des
2026-05-28T14:15:42.1635407Z NAME              TYPE                             DATA   AGE
2026-05-28T14:15:42.1635928Z registry-secret   kubernetes.io/dockerconfigjson   1      2y165d
2026-05-28T14:15:42.1725298Z + [[ deploymentconfig == deployment ]]
2026-05-28T14:15:42.1725755Z + oc rollout cancel deploymentconfig/sisgf-backend-des -n sisgf-des
2026-05-28T14:15:42.2682936Z No rollout is in progress (latest rollout #231 failed 13 minutes ago)
2026-05-28T14:15:42.2714275Z + sleep 20
2026-05-28T14:16:02.2736988Z + oc rollout latest deploymentconfig/sisgf-backend-des -n sisgf-des
2026-05-28T14:16:02.3684035Z deploymentconfig.apps.openshift.io/sisgf-backend-des rolled out
2026-05-28T14:16:02.3764807Z ##[section]Finishing: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
