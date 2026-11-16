2026-11-12T16:02:12.0686517Z ##[section]Starting: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
2026-11-12T16:02:12.0689893Z ==============================================================================
2026-11-12T16:02:12.0689982Z Task         : Bash
2026-11-12T16:02:12.0690030Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-12T16:02:12.0690104Z Version      : 3.227.0
2026-11-12T16:02:12.0690152Z Author       : Microsoft Corporation
2026-11-12T16:02:12.0690212Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-12T16:02:12.0690288Z ==============================================================================
2026-11-12T16:02:12.1861982Z Generating script.
2026-11-12T16:02:12.1873077Z ========================== Starting Command Output ===========================
2026-11-12T16:02:12.1881210Z [command]/bin/bash /opt/ads-agent/_work/_temp/90a658e0-c100-42e4-9ce2-114fd11411b1.sh
2026-11-12T16:02:12.1943035Z + echo ocp_nprd
2026-11-12T16:02:12.1946275Z + egrep -q '^(okd4|ocp|openshift)'
2026-11-12T16:02:12.1977473Z ++ check_status_code https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sispi-qrcode-api-validador/manifests/20261112.1244-0.0.1-SNAPSHOT
2026-11-12T16:02:12.1979767Z ++ local url=https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sispi-qrcode-api-validador/manifests/20261112.1244-0.0.1-SNAPSHOT
2026-11-12T16:02:12.1981670Z ++ curl --location --request GET https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sispi-qrcode-api-validador/manifests/20261112.1244-0.0.1-SNAPSHOT --header 'Authorization: Bearer ***' --header 'Content-Type: text/plain' -s -k -o /dev/null -w '%{http_code}'
2026-11-12T16:02:12.3960394Z + status_code=200
2026-11-12T16:02:12.3960767Z + [[ 200 -ne 200 ]]
2026-11-12T16:02:12.3960901Z + [[ des == \p\r\d ]]
2026-11-12T16:02:12.3961061Z + build=sispi-qrcode-api-validador
2026-11-12T16:02:12.3963366Z + app=sispi-qrcode-api-validador-des
2026-11-12T16:02:12.3963564Z + [[ des == \p\r\d ]]
2026-11-12T16:02:12.3964009Z + oc set image deploymentconfig/sispi-qrcode-api-validador-des sispi-qrcode-api-validador-des=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispi-qrcode-api-validador:20261112.1244-0.0.1-SNAPSHOT -n sispi-des
2026-11-12T16:02:12.6323667Z deploymentconfig.apps.openshift.io/sispi-qrcode-api-validador-des image updated
2026-11-12T16:02:12.6361260Z + echo openshift/quarkus-caixa-release
2026-11-12T16:02:12.6361924Z + egrep -q openshift/angular-caixa-release
2026-11-12T16:02:12.6397692Z + echo openshift/quarkus-caixa-release
2026-11-12T16:02:12.6398181Z + egrep -q openshift/php-caixa-release
2026-11-12T16:02:12.6428645Z + echo 'Template não é angular nem php e não precisa deste replace'
2026-11-12T16:02:12.6429196Z + oc patch --type merge deploymentconfig/sispi-qrcode-api-validador-des -p '{"spec":{"template":{"spec":{"imagePullSecrets":[{"name":"registry-secret"}]}}}}' -n sispi-des
2026-11-12T16:02:12.6430925Z Template não é angular nem php e não precisa deste replace
2026-11-12T16:02:12.8830174Z deploymentconfig.apps.openshift.io/sispi-qrcode-api-validador-des not patched
2026-11-12T16:02:12.8867838Z + oc get secret registry-secret -n sispi-des
2026-11-12T16:02:13.1160754Z NAME              TYPE                             DATA      AGE
2026-11-12T16:02:13.1161145Z registry-secret   kubernetes.io/dockerconfigjson   1         3y3d
2026-11-12T16:02:13.1195660Z + [[ deploymentconfig == deployment ]]
2026-11-12T16:02:13.1196043Z + oc rollout cancel deploymentconfig/sispi-qrcode-api-validador-des -n sispi-des
2026-11-12T16:02:13.4278863Z No rollout is in progress (latest rollout #320 complete 25 hours ago)
2026-11-12T16:02:13.4317108Z + sleep 20
2026-11-12T16:02:33.4336235Z + oc rollout latest deploymentconfig/sispi-qrcode-api-validador-des -n sispi-des
2026-11-12T16:02:33.7366300Z deploymentconfig.apps.openshift.io/sispi-qrcode-api-validador-des rolled out
2026-11-12T16:02:33.7447760Z ##[section]Finishing: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP






esse é do que fucninoa do qr-ocrde
