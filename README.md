2026-11-16T19:35:03.6173271Z ##[section]Starting: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
2026-11-16T19:35:03.6176784Z ==============================================================================
2026-11-16T19:35:03.6177338Z Task         : Bash
2026-11-16T19:35:03.6177407Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-16T19:35:03.6177476Z Version      : 3.227.0
2026-11-16T19:35:03.6177551Z Author       : Microsoft Corporation
2026-11-16T19:35:03.6177729Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-16T19:35:03.6177822Z ==============================================================================
2026-11-16T19:35:03.7602975Z Generating script.
2026-11-16T19:35:03.7614099Z ========================== Starting Command Output ===========================
2026-11-16T19:35:03.7621401Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/d6799bbb-ae44-4c61-a645-f7cfc764a628.sh
2026-11-16T19:35:03.7689299Z + echo ocp_nprd
2026-11-16T19:35:03.7691328Z + egrep -q '^(okd4|ocp|openshift)'
2026-11-16T19:35:03.7727456Z ++ check_status_code https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads//manifests/20261116.1231-1.0.0-SNAPSHOT
2026-11-16T19:35:03.7728022Z ++ local url=https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads//manifests/20261116.1231-1.0.0-SNAPSHOT
2026-11-16T19:35:03.7731271Z ++ curl --location --request GET https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads//manifests/20261116.1231-1.0.0-SNAPSHOT --header 'Authorization: Bearer ***' --header 'Content-Type: text/plain' -s -k -o /dev/null -w '%{http_code}'
2026-11-16T19:35:03.8215038Z + status_code=400
2026-11-16T19:35:03.8215518Z + [[ 400 -ne 200 ]]
2026-11-16T19:35:03.8215629Z + [[ des != \p\r\d ]]
2026-11-16T19:35:03.8215851Z + handle_image_not_found 20261116.1231-1.0.0-SNAPSHOT build-images-ads ''
2026-11-16T19:35:03.8216070Z + local build_number=20261116.1231-1.0.0-SNAPSHOT
2026-11-16T19:35:03.8216378Z + local project_build=build-images-ads
2026-11-16T19:35:03.8216568Z + local build_name=
2026-11-16T19:35:03.8216679Z + echo ''
2026-11-16T19:35:03.8217001Z + echo 'A tag 20261116.1231-1.0.0-SNAPSHOT não foi encontrada no ImageStream de Build: https://console-openshift-console.apps.produtos4.caixa/k8s/ns/build-images-ads/imagestreams/'
2026-11-16T19:35:03.8217318Z + echo 'Verifique se a tag 20261116.1231-1.0.0-SNAPSHOT foi gerada corretamente durante a Build'
2026-11-16T19:35:03.8217486Z + exit 1
2026-11-16T19:35:03.8217544Z 
2026-11-16T19:35:03.8217840Z A tag 20261116.1231-1.0.0-SNAPSHOT não foi encontrada no ImageStream de Build: https://console-openshift-console.apps.produtos4.caixa/k8s/ns/build-images-ads/imagestreams/
2026-11-16T19:35:03.8218254Z Verifique se a tag 20261116.1231-1.0.0-SNAPSHOT foi gerada corretamente durante a Build
2026-11-16T19:35:03.8235826Z ##[error]Bash exited with code '1'.
2026-11-16T19:35:03.8268970Z ##[section]Finishing: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP

2026-11-16T19:35:03.8420509Z ##[section]Starting: Logs da Aplicação
2026-11-16T19:35:03.8424115Z ==============================================================================
2026-11-16T19:35:03.8424204Z Task         : Bash
2026-11-16T19:35:03.8424252Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-16T19:35:03.8424332Z Version      : 3.227.0
2026-11-16T19:35:03.8424383Z Author       : Microsoft Corporation
2026-11-16T19:35:03.8424449Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-16T19:35:03.8424536Z ==============================================================================
2026-11-16T19:35:03.9729079Z Generating script.
2026-11-16T19:35:03.9739854Z ========================== Starting Command Output ===========================
2026-11-16T19:35:03.9747162Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/2412ddf7-a74e-443c-9e83-4b1b0db6f8bd.sh
2026-11-16T19:35:03.9816690Z + shopt -s expand_aliases
2026-11-16T19:35:03.9817006Z + [[ -n ocp_nprd ]]
2026-11-16T19:35:03.9817275Z + [[ ocp_nprd =~ ocp ]]
2026-11-16T19:35:03.9817572Z + app=sispi-dict-reivindicacoes-des
2026-11-16T19:35:03.9817904Z + arquivo=/usr/local/bin/oc-v4.13
2026-11-16T19:35:03.9818205Z + '[' -e /usr/local/bin/oc-v4.13 ']'
2026-11-16T19:35:03.9818418Z + oc version
2026-11-16T19:35:04.0402178Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-11-16T19:35:04.0402398Z Server Version: 4.15.59
2026-11-16T19:35:04.0402529Z Kubernetes Version: v1.28.15+d227d65
2026-11-16T19:35:04.0433314Z ++ oc get pod -l name=sispi-dict-reivindicacoes-des -n sispi-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-11-16T19:35:04.0433563Z ++ tac
2026-11-16T19:35:04.0434839Z ++ grep -v '^$'
2026-11-16T19:35:04.0434982Z ++ head -n1
2026-11-16T19:35:04.1425040Z + last_pod=sispi-dict-reivindicacoes-des-2-xsw4b
2026-11-16T19:35:04.1425344Z + echo 'Logs do POD: sispi-dict-reivindicacoes-des-2-xsw4b'
2026-11-16T19:35:04.1425602Z + oc logs sispi-dict-reivindicacoes-des-2-xsw4b -c sispi-dict-reivindicacoes-des -n sispi-des
2026-11-16T19:35:04.1425851Z Logs do POD: sispi-dict-reivindicacoes-des-2-xsw4b
2026-11-16T19:35:04.2381238Z Error from server (BadRequest): container "sispi-dict-reivindicacoes-des" in pod "sispi-dict-reivindicacoes-des-2-xsw4b" is waiting to start: trying and failing to pull image
2026-11-16T19:35:04.2435293Z ##[error]Bash exited with code '1'.
2026-11-16T19:35:04.2468560Z ##[section]Finishing: Logs da Aplicação


