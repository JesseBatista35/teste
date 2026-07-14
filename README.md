2026-07-14T14:48:27.5765685Z ##[section]Starting: Atualizando Variáveis de Ambiente
2026-07-14T14:48:27.5769023Z ==============================================================================
2026-07-14T14:48:27.5769102Z Task         : Bash
2026-07-14T14:48:27.5769149Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-14T14:48:27.5769238Z Version      : 3.227.0
2026-07-14T14:48:27.5769284Z Author       : Microsoft Corporation
2026-07-14T14:48:27.5769489Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-14T14:48:27.5769589Z ==============================================================================
2026-07-14T14:48:27.7261038Z Generating script.
2026-07-14T14:48:27.7271803Z ========================== Starting Command Output ===========================
2026-07-14T14:48:27.7278973Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/93b4d806-71d9-450b-956f-6f7570fdbdd8.sh
2026-07-14T14:48:27.7328969Z Nova APP: false
2026-07-14T14:48:27.8043190Z Warning: apps.openshift.io/v1 DeploymentConfig is deprecated in v4.14+, unavailable in v4.10000+
2026-07-14T14:48:27.8961734Z Warning: apps.openshift.io/v1 DeploymentConfig is deprecated in v4.14+, unavailable in v4.10000+
2026-07-14T14:48:27.9392760Z error: one or more resources must be specified as <resource> <name> or <resource>/<name>
2026-07-14T14:48:27.9393285Z See 'oc set env -h' for help and examples
2026-07-14T14:48:27.9438251Z ##[error]Bash exited with code '1'.
2026-07-14T14:48:27.9482117Z ##[section]Finishing: Atualizando Variáveis de Ambiente



2026-07-14T14:48:27.9893231Z ##[section]Starting: Logs da Aplicação
2026-07-14T14:48:27.9896593Z ==============================================================================
2026-07-14T14:48:27.9896675Z Task         : Bash
2026-07-14T14:48:27.9896720Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-14T14:48:27.9896882Z Version      : 3.227.0
2026-07-14T14:48:27.9896929Z Author       : Microsoft Corporation
2026-07-14T14:48:27.9896985Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-14T14:48:27.9897063Z ==============================================================================
2026-07-14T14:48:28.1299670Z Generating script.
2026-07-14T14:48:28.1311630Z ========================== Starting Command Output ===========================
2026-07-14T14:48:28.1320066Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/9bb36040-a2da-49e1-9b6a-a9814c88f46f.sh
2026-07-14T14:48:28.1375523Z + shopt -s expand_aliases
2026-07-14T14:48:28.1377056Z + [[ -n ocp_nprd ]]
2026-07-14T14:48:28.1377243Z + [[ ocp_nprd =~ ocp ]]
2026-07-14T14:48:28.1377402Z + app=simpi-med-des
2026-07-14T14:48:28.1377560Z + arquivo=/usr/local/bin/oc-v4.13
2026-07-14T14:48:28.1377728Z + '[' -e /usr/local/bin/oc-v4.13 ']'
2026-07-14T14:48:28.1377840Z + oc version
2026-07-14T14:48:28.2021203Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-07-14T14:48:28.2021428Z Server Version: 4.15.59
2026-07-14T14:48:28.2021653Z Kubernetes Version: v1.28.15+d227d65
2026-07-14T14:48:28.2055042Z ++ oc get pod -l name=simpi-med-des -n simpi-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-07-14T14:48:28.2055309Z ++ tac
2026-07-14T14:48:28.2056309Z ++ grep -v '^$'
2026-07-14T14:48:28.2056473Z ++ head -n1
2026-07-14T14:48:28.2945664Z + last_pod=
2026-07-14T14:48:28.2972176Z ##[error]Bash exited with code '1'.
2026-07-14T14:48:28.3011201Z ##[section]Finishing: Logs da Aplicação

