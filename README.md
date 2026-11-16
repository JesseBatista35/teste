2026-11-16T23:16:21.6414982Z ##[section]Starting: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
2026-11-16T23:16:21.6420007Z ==============================================================================
2026-11-16T23:16:21.6420172Z Task         : Bash
2026-11-16T23:16:21.6420251Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-16T23:16:21.6420364Z Version      : 3.227.0
2026-11-16T23:16:21.6420453Z Author       : Microsoft Corporation
2026-11-16T23:16:21.6420545Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-16T23:16:21.6420683Z ==============================================================================
2026-11-16T23:16:21.7705985Z Generating script.
2026-11-16T23:16:21.7717445Z ========================== Starting Command Output ===========================
2026-11-16T23:16:21.7724440Z [command]/bin/bash /opt/ads-agent/_work/_temp/ca97a632-a6b9-4dcd-938e-060836183448.sh
2026-11-16T23:16:21.7790431Z + echo ocp_nprd
2026-11-16T23:16:21.7790740Z + egrep -q '^(okd4|ocp|openshift)'
2026-11-16T23:16:21.7823505Z ++ check_status_code https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads//manifests/20261116.1231-1.0.0-SNAPSHOT
2026-11-16T23:16:21.7823950Z ++ local url=https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads//manifests/20261116.1231-1.0.0-SNAPSHOT
2026-11-16T23:16:21.7825821Z ++ curl --location --request GET https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads//manifests/20261116.1231-1.0.0-SNAPSHOT --header 'Authorization: Bearer ***' --header 'Content-Type: text/plain' -s -k -o /dev/null -w '%{http_code}'
2026-11-16T23:16:21.9523166Z + status_code=400
2026-11-16T23:16:21.9523678Z + [[ 400 -ne 200 ]]
2026-11-16T23:16:21.9523826Z + [[ des != \p\r\d ]]
2026-11-16T23:16:21.9524031Z + handle_image_not_found 20261116.1231-1.0.0-SNAPSHOT build-images-ads ''
2026-11-16T23:16:21.9524245Z + local build_number=20261116.1231-1.0.0-SNAPSHOT
2026-11-16T23:16:21.9524449Z + local project_build=build-images-ads
2026-11-16T23:16:21.9524575Z + local build_name=
2026-11-16T23:16:21.9524681Z + echo ''
2026-11-16T23:16:21.9550823Z + echo 'A tag 20261116.1231-1.0.0-SNAPSHOT não foi encontrada no ImageStream de Build: https://console-openshift-console.apps.produtos4.caixa/k8s/ns/build-images-ads/imagestreams/'
2026-11-16T23:16:21.9551432Z + echo 'Verifique se a tag 20261116.1231-1.0.0-SNAPSHOT foi gerada corretamente durante a Build'
2026-11-16T23:16:21.9551591Z + exit 1
2026-11-16T23:16:21.9551666Z 
2026-11-16T23:16:21.9551972Z A tag 20261116.1231-1.0.0-SNAPSHOT não foi encontrada no ImageStream de Build: https://console-openshift-console.apps.produtos4.caixa/k8s/ns/build-images-ads/imagestreams/
2026-11-16T23:16:21.9552270Z Verifique se a tag 20261116.1231-1.0.0-SNAPSHOT foi gerada corretamente durante a Build
2026-11-16T23:16:21.9553609Z ##[error]Bash exited with code '1'.
2026-11-16T23:16:21.9576826Z ##[section]Finishing: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP



2026-11-16T23:16:21.9738712Z ##[section]Starting: Logs da Aplicação
2026-11-16T23:16:21.9742372Z ==============================================================================
2026-11-16T23:16:21.9742464Z Task         : Bash
2026-11-16T23:16:21.9742519Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-16T23:16:21.9742600Z Version      : 3.227.0
2026-11-16T23:16:21.9742652Z Author       : Microsoft Corporation
2026-11-16T23:16:21.9742720Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-16T23:16:21.9742812Z ==============================================================================
2026-11-16T23:16:22.1200113Z Generating script.
2026-11-16T23:16:22.1211128Z ========================== Starting Command Output ===========================
2026-11-16T23:16:22.1218601Z [command]/bin/bash /opt/ads-agent/_work/_temp/b8599770-2ce3-48a2-8206-d44f52973542.sh
2026-11-16T23:16:22.1271875Z + shopt -s expand_aliases
2026-11-16T23:16:22.1273190Z + [[ -n ocp_nprd ]]
2026-11-16T23:16:22.1273383Z + [[ ocp_nprd =~ ocp ]]
2026-11-16T23:16:22.1273555Z + app=sispi-dict-reivindicacoes-des
2026-11-16T23:16:22.1285921Z + arquivo=/usr/local/bin/oc-v4.13
2026-11-16T23:16:22.1286555Z + '[' -e /usr/local/bin/oc-v4.13 ']'
2026-11-16T23:16:22.1286949Z + alias oc=/usr/local/bin/oc-v4.13
2026-11-16T23:16:22.1287129Z + /usr/local/bin/oc-v4.13 version
2026-11-16T23:16:22.2252509Z Client Version: 4.13.0-202307282024.p0.ge251b5e.assembly.stream-e251b5e
2026-11-16T23:16:22.2252746Z Kustomize Version: v4.5.7
2026-11-16T23:16:22.2252905Z Server Version: 4.15.59
2026-11-16T23:16:22.2253037Z Kubernetes Version: v1.28.15+d227d65
2026-11-16T23:16:22.2291721Z ++ /usr/local/bin/oc-v4.13 get pod -l name=sispi-dict-reivindicacoes-des -n sispi-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-11-16T23:16:22.2292452Z ++ tac
2026-11-16T23:16:22.2292742Z ++ grep -v '^$'
2026-11-16T23:16:22.2293252Z ++ head -n1
2026-11-16T23:16:22.3740451Z + last_pod=sispi-dict-reivindicacoes-des-3-fc2hj
2026-11-16T23:16:22.3740987Z + echo 'Logs do POD: sispi-dict-reivindicacoes-des-3-fc2hj'
2026-11-16T23:16:22.3741829Z + /usr/local/bin/oc-v4.13 logs sispi-dict-reivindicacoes-des-3-fc2hj -c sispi-dict-reivindicacoes-des -n sispi-des
2026-11-16T23:16:22.3742124Z Logs do POD: sispi-dict-reivindicacoes-des-3-fc2hj
2026-11-16T23:16:22.5034622Z Error from server (BadRequest): container "sispi-dict-reivindicacoes-des" in pod "sispi-dict-reivindicacoes-des-3-fc2hj" is waiting to start: trying and failing to pull image
2026-11-16T23:16:22.5088420Z ##[error]Bash exited with code '1'.
2026-11-16T23:16:22.5124107Z ##[section]Finishing: Logs da Aplicação
