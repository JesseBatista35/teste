2026-11-16T23:20:16.4532426Z ##[section]Starting: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
2026-11-16T23:20:16.4536599Z ==============================================================================
2026-11-16T23:20:16.4536764Z Task         : Bash
2026-11-16T23:20:16.4536816Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-16T23:20:16.4536896Z Version      : 3.227.0
2026-11-16T23:20:16.4536949Z Author       : Microsoft Corporation
2026-11-16T23:20:16.4537017Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-16T23:20:16.4537098Z ==============================================================================
2026-11-16T23:20:17.7474120Z Generating script.
2026-11-16T23:20:17.7485582Z ========================== Starting Command Output ===========================
2026-11-16T23:20:17.7492930Z [command]/bin/bash /opt/ads-agent/_work/_temp/b4059853-032e-4a06-b1c8-742232b6075e.sh
2026-11-16T23:20:17.7555647Z + echo ocp_nprd
2026-11-16T23:20:17.7555882Z + egrep -q '^(okd4|ocp|openshift)'
2026-11-16T23:20:17.7591221Z ++ check_status_code https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads//manifests/20261116.1231-1.0.0-SNAPSHOT
2026-11-16T23:20:17.7591641Z ++ local url=https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads//manifests/20261116.1231-1.0.0-SNAPSHOT
2026-11-16T23:20:17.7594584Z ++ curl --location --request GET https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads//manifests/20261116.1231-1.0.0-SNAPSHOT --header 'Authorization: Bearer ***' --header 'Content-Type: text/plain' -s -k -o /dev/null -w '%{http_code}'
2026-11-16T23:20:17.9284092Z + status_code=400
2026-11-16T23:20:17.9284574Z + [[ 400 -ne 200 ]]
2026-11-16T23:20:17.9284704Z + [[ des != \p\r\d ]]
2026-11-16T23:20:17.9284915Z + handle_image_not_found 20261116.1231-1.0.0-SNAPSHOT build-images-ads ''
2026-11-16T23:20:17.9285131Z + local build_number=20261116.1231-1.0.0-SNAPSHOT
2026-11-16T23:20:17.9285334Z + local project_build=build-images-ads
2026-11-16T23:20:17.9285477Z + local build_name=
2026-11-16T23:20:17.9285586Z + echo ''
2026-11-16T23:20:17.9285916Z + echo 'A tag 20261116.1231-1.0.0-SNAPSHOT não foi encontrada no ImageStream de Build: https://console-openshift-console.apps.produtos4.caixa/k8s/ns/build-images-ads/imagestreams/'
2026-11-16T23:20:17.9286212Z + echo 'Verifique se a tag 20261116.1231-1.0.0-SNAPSHOT foi gerada corretamente durante a Build'
2026-11-16T23:20:17.9286358Z + exit 1
2026-11-16T23:20:17.9286509Z 
2026-11-16T23:20:17.9286831Z A tag 20261116.1231-1.0.0-SNAPSHOT não foi encontrada no ImageStream de Build: https://console-openshift-console.apps.produtos4.caixa/k8s/ns/build-images-ads/imagestreams/
2026-11-16T23:20:17.9287116Z Verifique se a tag 20261116.1231-1.0.0-SNAPSHOT foi gerada corretamente durante a Build
2026-11-16T23:20:17.9307000Z ##[error]Bash exited with code '1'.
2026-11-16T23:20:17.9339721Z ##[section]Finishing: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
