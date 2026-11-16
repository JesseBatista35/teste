2026-11-16T19:53:40.2958939Z ##[section]Starting: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
2026-11-16T19:53:40.2962400Z ==============================================================================
2026-11-16T19:53:40.2962491Z Task         : Bash
2026-11-16T19:53:40.2962548Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-16T19:53:40.2962627Z Version      : 3.227.0
2026-11-16T19:53:40.2962677Z Author       : Microsoft Corporation
2026-11-16T19:53:40.2962743Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-16T19:53:40.2962819Z ==============================================================================
2026-11-16T19:53:41.2637125Z Generating script.
2026-11-16T19:53:41.2647697Z ========================== Starting Command Output ===========================
2026-11-16T19:53:41.2654738Z [command]/bin/bash /opt/ads-agent/_work/_temp/4ab0fce0-0fdb-4189-89a8-f02125d13fad.sh
2026-11-16T19:53:41.2704394Z + echo ocp_nprd
2026-11-16T19:53:41.2705856Z + egrep -q '^(okd4|ocp|openshift)'
2026-11-16T19:53:41.2735851Z +++ OKD_REGISTRY
2026-11-16T19:53:41.2740532Z /opt/ads-agent/_work/_temp/4ab0fce0-0fdb-4189-89a8-f02125d13fad.sh: line 23: OKD_REGISTRY: comando não encontrado
2026-11-16T19:53:41.2744655Z +++ ProjetoBuild
2026-11-16T19:53:41.2748212Z /opt/ads-agent/_work/_temp/4ab0fce0-0fdb-4189-89a8-f02125d13fad.sh: line 23: ProjetoBuild: comando não encontrado
2026-11-16T19:53:41.2750559Z ++ check_status_code https:///v2///manifests/20261116.1231-1.0.0-SNAPSHOT
2026-11-16T19:53:41.2751244Z ++ local url=https:///v2///manifests/20261116.1231-1.0.0-SNAPSHOT
2026-11-16T19:53:41.2753113Z +++ OKD_TOKEN_REGISTRY
2026-11-16T19:53:41.2756709Z /opt/ads-agent/_work/_temp/4ab0fce0-0fdb-4189-89a8-f02125d13fad.sh: line 6: OKD_TOKEN_REGISTRY: comando não encontrado
2026-11-16T19:53:41.2758818Z ++ curl --location --request GET https:///v2///manifests/20261116.1231-1.0.0-SNAPSHOT --header 'Authorization: Bearer ' --header 'Content-Type: text/plain' -s -k -o /dev/null -w '%{http_code}'
2026-11-16T19:53:46.7944188Z + status_code=000
2026-11-16T19:53:46.7944750Z + [[ 000 -ne 200 ]]
2026-11-16T19:53:46.7945285Z + [[ des != \p\r\d ]]
2026-11-16T19:53:46.7946580Z ++ ProjetoBuild
2026-11-16T19:53:46.7948788Z /opt/ads-agent/_work/_temp/4ab0fce0-0fdb-4189-89a8-f02125d13fad.sh: line 26: ProjetoBuild: comando não encontrado
2026-11-16T19:53:46.7951872Z + handle_image_not_found 20261116.1231-1.0.0-SNAPSHOT '' ''
2026-11-16T19:53:46.7952336Z + local build_number=20261116.1231-1.0.0-SNAPSHOT
2026-11-16T19:53:46.7952504Z + local project_build=
2026-11-16T19:53:46.7952674Z + local build_name=
2026-11-16T19:53:46.7952826Z + echo ''
2026-11-16T19:53:46.7953069Z 
2026-11-16T19:53:46.7953594Z A tag 20261116.1231-1.0.0-SNAPSHOT não foi encontrada no ImageStream de Build: https://console-openshift-console.apps.produtos4.caixa/k8s/ns//imagestreams/
2026-11-16T19:53:46.7954062Z Verifique se a tag 20261116.1231-1.0.0-SNAPSHOT foi gerada corretamente durante a Build
2026-11-16T19:53:46.7954445Z + echo 'A tag 20261116.1231-1.0.0-SNAPSHOT não foi encontrada no ImageStream de Build: https://console-openshift-console.apps.produtos4.caixa/k8s/ns//imagestreams/'
2026-11-16T19:53:46.7954798Z + echo 'Verifique se a tag 20261116.1231-1.0.0-SNAPSHOT foi gerada corretamente durante a Build'
2026-11-16T19:53:46.7954945Z + exit 1
2026-11-16T19:53:46.7972812Z ##[error]Bash exited with code '1'.
2026-11-16T19:53:46.8002567Z ##[section]Finishing: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP



2026-11-16T19:53:46.8153021Z ##[section]Starting: Logs da Aplicação
2026-11-16T19:53:46.8155999Z ==============================================================================
2026-11-16T19:53:46.8156085Z Task         : Bash
2026-11-16T19:53:46.8156143Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-16T19:53:46.8156212Z Version      : 3.227.0
2026-11-16T19:53:46.8156264Z Author       : Microsoft Corporation
2026-11-16T19:53:46.8156334Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-16T19:53:46.8156417Z ==============================================================================
2026-11-16T19:53:47.7754970Z Generating script.
2026-11-16T19:53:47.7762735Z ========================== Starting Command Output ===========================
2026-11-16T19:53:47.7764438Z [command]/bin/bash /opt/ads-agent/_work/_temp/95f32225-b150-4daa-9ab9-8ae23028d8d0.sh
2026-11-16T19:53:47.7806742Z + shopt -s expand_aliases
2026-11-16T19:53:47.7807006Z + [[ -n ocp_nprd ]]
2026-11-16T19:53:47.7807235Z + [[ ocp_nprd =~ ocp ]]
2026-11-16T19:53:47.7807472Z + app=sispi-dict-reivindicacoes-des
2026-11-16T19:53:47.7807730Z + arquivo=/usr/local/bin/oc-v4.13
2026-11-16T19:53:47.7807984Z + '[' -e /usr/local/bin/oc-v4.13 ']'
2026-11-16T19:53:47.7808224Z + alias oc=/usr/local/bin/oc-v4.13
2026-11-16T19:53:47.7808465Z + /usr/local/bin/oc-v4.13 version
2026-11-16T19:53:47.8690438Z Client Version: 4.13.0-202307282024.p0.ge251b5e.assembly.stream-e251b5e
2026-11-16T19:53:47.8690976Z Kustomize Version: v4.5.7
2026-11-16T19:53:47.8691561Z Server Version: 4.15.59
2026-11-16T19:53:47.8691740Z Kubernetes Version: v1.28.15+d227d65
2026-11-16T19:53:47.8724169Z ++ /usr/local/bin/oc-v4.13 get pod -l name=sispi-dict-reivindicacoes-des -n sispi-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-11-16T19:53:47.8724425Z ++ tac
2026-11-16T19:53:47.8724571Z ++ grep -v '^$'
2026-11-16T19:53:47.8724681Z ++ head -n1
2026-11-16T19:53:47.9972691Z + last_pod=sispi-dict-reivindicacoes-des-2-xsw4b
2026-11-16T19:53:47.9973524Z + echo 'Logs do POD: sispi-dict-reivindicacoes-des-2-xsw4b'
2026-11-16T19:53:47.9973843Z + /usr/local/bin/oc-v4.13 logs sispi-dict-reivindicacoes-des-2-xsw4b -c sispi-dict-reivindicacoes-des -n sispi-des
2026-11-16T19:53:47.9974082Z Logs do POD: sispi-dict-reivindicacoes-des-2-xsw4b
2026-11-16T19:53:48.1064023Z Error from server (BadRequest): container "sispi-dict-reivindicacoes-des" in pod "sispi-dict-reivindicacoes-des-2-xsw4b" is waiting to start: trying and failing to pull image
2026-11-16T19:53:48.1136672Z ##[error]Bash exited with code '1'.
2026-11-16T19:53:48.1174873Z ##[section]Finishing: Logs da Aplicação
