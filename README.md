2026-11-16T20:21:53.5380643Z ##[section]Starting: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
2026-11-16T20:21:53.5384098Z ==============================================================================
2026-11-16T20:21:53.5384183Z Task         : Bash
2026-11-16T20:21:53.5384228Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-16T20:21:53.5384305Z Version      : 3.227.0
2026-11-16T20:21:53.5384350Z Author       : Microsoft Corporation
2026-11-16T20:21:53.5384403Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-16T20:21:53.5384486Z ==============================================================================
2026-11-16T20:21:53.6611498Z Generating script.
2026-11-16T20:21:53.6622254Z ========================== Starting Command Output ===========================
2026-11-16T20:21:53.6629797Z [command]/bin/bash /opt/ads-agent/_work/_temp/a053fa16-a377-4ceb-b020-68ba479a056a.sh
2026-11-16T20:21:53.6687781Z + echo ocp_nprd
2026-11-16T20:21:53.6689811Z + egrep -q '^(okd4|ocp|openshift)'
2026-11-16T20:21:53.6727200Z +++ OKD_REGISTRY
2026-11-16T20:21:53.6733091Z /opt/ads-agent/_work/_temp/a053fa16-a377-4ceb-b020-68ba479a056a.sh: line 23: OKD_REGISTRY: comando não encontrado
2026-11-16T20:21:53.6739554Z +++ ProjetoBuild
2026-11-16T20:21:53.6744547Z /opt/ads-agent/_work/_temp/a053fa16-a377-4ceb-b020-68ba479a056a.sh: line 23: ProjetoBuild: comando não encontrado
2026-11-16T20:21:53.6747763Z ++ check_status_code https:///v2///manifests/20261116.1231-1.0.0-SNAPSHOT
2026-11-16T20:21:53.6748176Z ++ local url=https:///v2///manifests/20261116.1231-1.0.0-SNAPSHOT
2026-11-16T20:21:53.6751542Z +++ OKD_TOKEN_REGISTRY
2026-11-16T20:21:53.6756502Z /opt/ads-agent/_work/_temp/a053fa16-a377-4ceb-b020-68ba479a056a.sh: line 6: OKD_TOKEN_REGISTRY: comando não encontrado
2026-11-16T20:21:53.6759386Z ++ curl --location --request GET https:///v2///manifests/20261116.1231-1.0.0-SNAPSHOT --header 'Authorization: Bearer ' --header 'Content-Type: text/plain' -s -k -o /dev/null -w '%{http_code}'
2026-11-16T20:21:59.1962085Z + status_code=000
2026-11-16T20:21:59.1964490Z + [[ 000 -ne 200 ]]
2026-11-16T20:21:59.1965089Z + [[ des != \p\r\d ]]
2026-11-16T20:21:59.1965446Z ++ ProjetoBuild
2026-11-16T20:21:59.1969425Z /opt/ads-agent/_work/_temp/a053fa16-a377-4ceb-b020-68ba479a056a.sh: line 26: ProjetoBuild: comando não encontrado
2026-11-16T20:21:59.1970827Z + handle_image_not_found 20261116.1231-1.0.0-SNAPSHOT '' ''
2026-11-16T20:21:59.1971135Z + local build_number=20261116.1231-1.0.0-SNAPSHOT
2026-11-16T20:21:59.1971352Z + local project_build=
2026-11-16T20:21:59.1971542Z + local build_name=
2026-11-16T20:21:59.1971647Z + echo ''
2026-11-16T20:21:59.1971938Z + echo 'A tag 20261116.1231-1.0.0-SNAPSHOT não foi encontrada no ImageStream de Build: https://console-openshift-console.apps.produtos4.caixa/k8s/ns//imagestreams/'
2026-11-16T20:21:59.1972261Z + echo 'Verifique se a tag 20261116.1231-1.0.0-SNAPSHOT foi gerada corretamente durante a Build'
2026-11-16T20:21:59.1972441Z + exit 1
2026-11-16T20:21:59.1972524Z 
2026-11-16T20:21:59.1972848Z A tag 20261116.1231-1.0.0-SNAPSHOT não foi encontrada no ImageStream de Build: https://console-openshift-console.apps.produtos4.caixa/k8s/ns//imagestreams/
2026-11-16T20:21:59.1973138Z Verifique se a tag 20261116.1231-1.0.0-SNAPSHOT foi gerada corretamente durante a Build
2026-11-16T20:21:59.1992199Z ##[error]Bash exited with code '1'.
2026-11-16T20:21:59.2027804Z ##[section]Finishing: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP





2026-11-16T20:21:59.2181576Z ##[section]Starting: Logs da Aplicação
2026-11-16T20:21:59.2184953Z ==============================================================================
2026-11-16T20:21:59.2185038Z Task         : Bash
2026-11-16T20:21:59.2185082Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-16T20:21:59.2185159Z Version      : 3.227.0
2026-11-16T20:21:59.2185317Z Author       : Microsoft Corporation
2026-11-16T20:21:59.2185421Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-16T20:21:59.2185500Z ==============================================================================
2026-11-16T20:21:59.3356209Z Generating script.
2026-11-16T20:21:59.3368369Z ========================== Starting Command Output ===========================
2026-11-16T20:21:59.3376267Z [command]/bin/bash /opt/ads-agent/_work/_temp/36140dea-5899-40cd-9b72-2237ebb598d0.sh
2026-11-16T20:21:59.3431266Z + shopt -s expand_aliases
2026-11-16T20:21:59.3433057Z + [[ -n ocp_nprd ]]
2026-11-16T20:21:59.3433448Z + [[ ocp_nprd =~ ocp ]]
2026-11-16T20:21:59.3433677Z + app=sispi-dict-reivindicacoes-des
2026-11-16T20:21:59.3433884Z + arquivo=/usr/local/bin/oc-v4.13
2026-11-16T20:21:59.3434121Z + '[' -e /usr/local/bin/oc-v4.13 ']'
2026-11-16T20:21:59.3434343Z + alias oc=/usr/local/bin/oc-v4.13
2026-11-16T20:21:59.3434591Z + /usr/local/bin/oc-v4.13 version
2026-11-16T20:21:59.4387808Z Client Version: 4.13.0-202307282024.p0.ge251b5e.assembly.stream-e251b5e
2026-11-16T20:21:59.4388013Z Kustomize Version: v4.5.7
2026-11-16T20:21:59.4388141Z Server Version: 4.15.59
2026-11-16T20:21:59.4388264Z Kubernetes Version: v1.28.15+d227d65
2026-11-16T20:21:59.4422583Z ++ /usr/local/bin/oc-v4.13 get pod -l name=sispi-dict-reivindicacoes-des -n sispi-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-11-16T20:21:59.4429011Z ++ tac
2026-11-16T20:21:59.4429588Z ++ grep -v '^$'
2026-11-16T20:21:59.4429756Z ++ head -n1
2026-11-16T20:21:59.6058493Z + last_pod=sispi-dict-reivindicacoes-des-2-xsw4b
2026-11-16T20:21:59.6058785Z + echo 'Logs do POD: sispi-dict-reivindicacoes-des-2-xsw4b'
2026-11-16T20:21:59.6060821Z + /usr/local/bin/oc-v4.13 logs sispi-dict-reivindicacoes-des-2-xsw4b -c sispi-dict-reivindicacoes-des -n sispi-des
2026-11-16T20:21:59.6061064Z Logs do POD: sispi-dict-reivindicacoes-des-2-xsw4b
2026-11-16T20:21:59.7291740Z Error from server (BadRequest): container "sispi-dict-reivindicacoes-des" in pod "sispi-dict-reivindicacoes-des-2-xsw4b" is waiting to start: trying and failing to pull image
2026-11-16T20:21:59.7345064Z ##[error]Bash exited with code '1'.
2026-11-16T20:21:59.7378707Z ##[section]Finishing: Logs da Aplicação
