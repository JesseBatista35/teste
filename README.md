2026-11-16T20:32:03.7647407Z ##[section]Starting: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
2026-11-16T20:32:03.7650808Z ==============================================================================
2026-11-16T20:32:03.7650896Z Task         : Bash
2026-11-16T20:32:03.7650956Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-16T20:32:03.7651024Z Version      : 3.227.0
2026-11-16T20:32:03.7651074Z Author       : Microsoft Corporation
2026-11-16T20:32:03.7651139Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-16T20:32:03.7651294Z ==============================================================================
2026-11-16T20:32:04.8073554Z Generating script.
2026-11-16T20:32:04.8084080Z ========================== Starting Command Output ===========================
2026-11-16T20:32:04.8090897Z [command]/bin/bash /opt/ads-agent/_work/_temp/a53f7943-c448-491e-b6d4-cc3a9e414e6c.sh
2026-11-16T20:32:04.8145131Z + echo ocp_nprd
2026-11-16T20:32:04.8145731Z + egrep -q '^(okd4|ocp|openshift)'
2026-11-16T20:32:04.8170692Z ++ check_status_code https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads//manifests/20261116.1231-1.0.0-SNAPSHOT
2026-11-16T20:32:04.8171080Z ++ local url=https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads//manifests/20261116.1231-1.0.0-SNAPSHOT
2026-11-16T20:32:04.8173999Z ++ curl --location --request GET https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads//manifests/20261116.1231-1.0.0-SNAPSHOT --header 'Authorization: Bearer ***' --header 'Content-Type: text/plain' -s -k -o /dev/null -w '%{http_code}'
2026-11-16T20:32:04.9749127Z + status_code=400
2026-11-16T20:32:04.9749491Z + [[ 400 -ne 200 ]]
2026-11-16T20:32:04.9749607Z + [[ des != \p\r\d ]]
2026-11-16T20:32:04.9749832Z + handle_image_not_found 20261116.1231-1.0.0-SNAPSHOT build-images-ads ''
2026-11-16T20:32:04.9750044Z + local build_number=20261116.1231-1.0.0-SNAPSHOT
2026-11-16T20:32:04.9750333Z + local project_build=build-images-ads
2026-11-16T20:32:04.9750461Z + local build_name=
2026-11-16T20:32:04.9750564Z + echo ''
2026-11-16T20:32:04.9750885Z + echo 'A tag 20261116.1231-1.0.0-SNAPSHOT não foi encontrada no ImageStream de Build: https://console-openshift-console.apps.produtos4.caixa/k8s/ns/build-images-ads/imagestreams/'
2026-11-16T20:32:04.9751188Z + echo 'Verifique se a tag 20261116.1231-1.0.0-SNAPSHOT foi gerada corretamente durante a Build'
2026-11-16T20:32:04.9751337Z + exit 1
2026-11-16T20:32:04.9751407Z 
2026-11-16T20:32:04.9751695Z A tag 20261116.1231-1.0.0-SNAPSHOT não foi encontrada no ImageStream de Build: https://console-openshift-console.apps.produtos4.caixa/k8s/ns/build-images-ads/imagestreams/
2026-11-16T20:32:04.9751986Z Verifique se a tag 20261116.1231-1.0.0-SNAPSHOT foi gerada corretamente durante a Build
2026-11-16T20:32:04.9769262Z ##[error]Bash exited with code '1'.
2026-11-16T20:32:04.9797491Z ##[section]Finishing: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP


2026-11-16T20:32:04.9947284Z ##[section]Starting: Logs da Aplicação
2026-11-16T20:32:04.9951153Z ==============================================================================
2026-11-16T20:32:04.9951302Z Task         : Bash
2026-11-16T20:32:04.9951378Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-16T20:32:04.9951505Z Version      : 3.227.0
2026-11-16T20:32:04.9951585Z Author       : Microsoft Corporation
2026-11-16T20:32:04.9951676Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-16T20:32:04.9951817Z ==============================================================================
2026-11-16T20:32:05.9637148Z Generating script.
2026-11-16T20:32:05.9647338Z ========================== Starting Command Output ===========================
2026-11-16T20:32:05.9654193Z [command]/bin/bash /opt/ads-agent/_work/_temp/bb4ef95c-9ed6-4ee9-addd-18940ef89c91.sh
2026-11-16T20:32:05.9698916Z + shopt -s expand_aliases
2026-11-16T20:32:05.9699100Z + [[ -n ocp_nprd ]]
2026-11-16T20:32:05.9699278Z + [[ ocp_nprd =~ ocp ]]
2026-11-16T20:32:05.9699445Z + app=sispi-dict-reivindicacoes-des
2026-11-16T20:32:05.9699621Z + arquivo=/usr/local/bin/oc-v4.13
2026-11-16T20:32:05.9699788Z + '[' -e /usr/local/bin/oc-v4.13 ']'
2026-11-16T20:32:05.9699955Z + alias oc=/usr/local/bin/oc-v4.13
2026-11-16T20:32:05.9700573Z + /usr/local/bin/oc-v4.13 version
2026-11-16T20:32:06.0547236Z Client Version: 4.13.0-202307282024.p0.ge251b5e.assembly.stream-e251b5e
2026-11-16T20:32:06.0547490Z Kustomize Version: v4.5.7
2026-11-16T20:32:06.0547612Z Server Version: 4.15.59
2026-11-16T20:32:06.0547746Z Kubernetes Version: v1.28.15+d227d65
2026-11-16T20:32:06.0574855Z ++ /usr/local/bin/oc-v4.13 get pod -l name=sispi-dict-reivindicacoes-des -n sispi-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-11-16T20:32:06.0577594Z ++ tac
2026-11-16T20:32:06.0578001Z ++ grep -v '^$'
2026-11-16T20:32:06.0578559Z ++ head -n1
2026-11-16T20:32:06.1759094Z + last_pod=sispi-dict-reivindicacoes-des-2-xsw4b
2026-11-16T20:32:06.1759459Z + echo 'Logs do POD: sispi-dict-reivindicacoes-des-2-xsw4b'
2026-11-16T20:32:06.1759739Z + /usr/local/bin/oc-v4.13 logs sispi-dict-reivindicacoes-des-2-xsw4b -c sispi-dict-reivindicacoes-des -n sispi-des
2026-11-16T20:32:06.1759972Z Logs do POD: sispi-dict-reivindicacoes-des-2-xsw4b
2026-11-16T20:32:06.2721061Z Error from server (BadRequest): container "sispi-dict-reivindicacoes-des" in pod "sispi-dict-reivindicacoes-des-2-xsw4b" is waiting to start: trying and failing to pull image
2026-11-16T20:32:06.2767466Z ##[error]Bash exited with code '1'.
2026-11-16T20:32:06.2796294Z ##[section]Finishing: Logs da Aplicação
