2026-11-16T23:32:51.2210294Z ##[section]Starting: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
2026-11-16T23:32:51.2213685Z ==============================================================================
2026-11-16T23:32:51.2213780Z Task         : Bash
2026-11-16T23:32:51.2213838Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-16T23:32:51.2213904Z Version      : 3.227.0
2026-11-16T23:32:51.2213948Z Author       : Microsoft Corporation
2026-11-16T23:32:51.2214010Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-16T23:32:51.2214088Z ==============================================================================
2026-11-16T23:32:51.3594352Z Generating script.
2026-11-16T23:32:51.3605655Z ========================== Starting Command Output ===========================
2026-11-16T23:32:51.3613150Z [command]/bin/bash /opt/ads-agent/_work/_temp/1acfbe54-627c-48c9-8fc6-5570235bf50e.sh
2026-11-16T23:32:51.3677935Z + echo ocp_nprd
2026-11-16T23:32:51.3678311Z + egrep -q '^(okd4|ocp|openshift)'
2026-11-16T23:32:51.3710946Z ++ check_status_code https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads//manifests/20261116.1231-1.0.0-SNAPSHOT
2026-11-16T23:32:51.3711340Z ++ local url=https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads//manifests/20261116.1231-1.0.0-SNAPSHOT
2026-11-16T23:32:51.3713468Z ++ curl --location --request GET https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads//manifests/20261116.1231-1.0.0-SNAPSHOT --header 'Authorization: Bearer ***' --header 'Content-Type: text/plain' -s -k -o /dev/null -w '%{http_code}'
2026-11-16T23:32:51.5391578Z + status_code=400
2026-11-16T23:32:51.5392066Z + [[ 400 -ne 200 ]]
2026-11-16T23:32:51.5392223Z + [[ des != \p\r\d ]]
2026-11-16T23:32:51.5392524Z + handle_image_not_found 20261116.1231-1.0.0-SNAPSHOT build-images-ads ''
2026-11-16T23:32:51.5392891Z + local build_number=20261116.1231-1.0.0-SNAPSHOT
2026-11-16T23:32:51.5393338Z + local project_build=build-images-ads
2026-11-16T23:32:51.5393605Z + local build_name=
2026-11-16T23:32:51.5393958Z + echo ''
2026-11-16T23:32:51.5394707Z + echo 'A tag 20261116.1231-1.0.0-SNAPSHOT não foi encontrada no ImageStream de Build: https://console-openshift-console.apps.produtos4.caixa/k8s/ns/build-images-ads/imagestreams/'
2026-11-16T23:32:51.5395590Z + echo 'Verifique se a tag 20261116.1231-1.0.0-SNAPSHOT foi gerada corretamente durante a Build'
2026-11-16T23:32:51.5395920Z + exit 1
2026-11-16T23:32:51.5399510Z 
2026-11-16T23:32:51.5400398Z A tag 20261116.1231-1.0.0-SNAPSHOT não foi encontrada no ImageStream de Build: https://console-openshift-console.apps.produtos4.caixa/k8s/ns/build-images-ads/imagestreams/
2026-11-16T23:32:51.5400868Z Verifique se a tag 20261116.1231-1.0.0-SNAPSHOT foi gerada corretamente durante a Build
2026-11-16T23:32:51.5415074Z ##[error]Bash exited with code '1'.
2026-11-16T23:32:51.5446064Z ##[section]Finishing: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
