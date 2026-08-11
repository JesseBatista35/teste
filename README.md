2026-08-11T13:35:24.6245295Z ##[section]Starting: Criando nova APP
2026-08-11T13:35:24.6250666Z ==============================================================================
2026-08-11T13:35:24.6250798Z Task         : Bash
2026-08-11T13:35:24.6250874Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-11T13:35:24.6250970Z Version      : 3.227.0
2026-08-11T13:35:24.6251039Z Author       : Microsoft Corporation
2026-08-11T13:35:24.6251124Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-11T13:35:24.6251265Z ==============================================================================
2026-08-11T13:35:24.7910946Z Generating script.
2026-08-11T13:35:24.7919105Z ========================== Starting Command Output ===========================
2026-08-11T13:35:24.7927851Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/1e5becdf-79bb-49de-956e-42e1e12f93b0.sh
2026-08-11T13:35:24.7993996Z OKD4 NPRD - des, tqs ou hmp
2026-08-11T13:35:24.8795538Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-08-11T13:35:24.8797983Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-08-11T13:35:24.8798335Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-08-11T13:35:25.0181328Z Iniciando criação da APP
2026-08-11T13:35:25.1293684Z error: error processing template "openshift/angular-caixa-release": the namespace of the provided object does not match the namespace sent on the request
2026-08-11T13:35:25.1359378Z ##[error]Bash exited with code '1'.
2026-08-11T13:35:25.1405104Z ##[section]Finishing: Criando nova APP



2026-08-11T13:35:25.1641386Z ##[section]Starting: Logs da Aplicação
2026-08-11T13:35:25.1644952Z ==============================================================================
2026-08-11T13:35:25.1645045Z Task         : Bash
2026-08-11T13:35:25.1645213Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-11T13:35:25.1645275Z Version      : 3.227.0
2026-08-11T13:35:25.1645325Z Author       : Microsoft Corporation
2026-08-11T13:35:25.1645374Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-11T13:35:25.1645443Z ==============================================================================
2026-08-11T13:35:25.3200249Z Generating script.
2026-08-11T13:35:25.3211821Z ========================== Starting Command Output ===========================
2026-08-11T13:35:25.3219213Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/fabd9be2-6d89-41c5-b0fa-ff686f227627.sh
2026-08-11T13:35:25.3274970Z + shopt -s expand_aliases
2026-08-11T13:35:25.3275192Z + [[ -n okd4_nprd ]]
2026-08-11T13:35:25.3275393Z + [[ okd4_nprd =~ ocp ]]
2026-08-11T13:35:25.3275516Z + [[ -n okd4_nprd ]]
2026-08-11T13:35:25.3275622Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-08-11T13:35:25.3275786Z + app=siavl-gerencial-frontend-des
2026-08-11T13:35:25.3275891Z + oc version
2026-08-11T13:35:25.3942219Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-08-11T13:35:25.3943113Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-08-11T13:35:25.3943886Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-08-11T13:35:25.3983670Z ++ oc get pod -l name=siavl-gerencial-frontend-des -n siavl-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-08-11T13:35:25.3986304Z ++ tac
2026-08-11T13:35:25.3986455Z ++ grep -v '^$'
2026-08-11T13:35:25.3986559Z ++ head -n1
2026-08-11T13:35:25.4830809Z + last_pod=siavl-gerencial-frontend-des-13-pld57
2026-08-11T13:35:25.4831823Z + echo 'Logs do POD: siavl-gerencial-frontend-des-13-pld57'
2026-08-11T13:35:25.4832860Z + oc logs siavl-gerencial-frontend-des-13-pld57 -c siavl-gerencial-frontend-des -n siavl-des
2026-08-11T13:35:25.4833143Z Logs do POD: siavl-gerencial-frontend-des-13-pld57
2026-08-11T13:35:25.5754542Z ##[section]Finishing: Logs da Aplicação



2026-08-11T13:35:25.5828906Z ##[section]Starting: Realizando Logout OKD
2026-08-11T13:35:25.5832402Z ==============================================================================
2026-08-11T13:35:25.5832490Z Task         : Bash
2026-08-11T13:35:25.5832535Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-11T13:35:25.5832595Z Version      : 3.227.0
2026-08-11T13:35:25.5832638Z Author       : Microsoft Corporation
2026-08-11T13:35:25.5832699Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-11T13:35:25.5832771Z ==============================================================================
2026-08-11T13:35:25.7311011Z Generating script.
2026-08-11T13:35:25.7319637Z Script contents:
2026-08-11T13:35:25.7319918Z oc logout
2026-08-11T13:35:25.7323600Z ========================== Starting Command Output ===========================
2026-08-11T13:35:25.7331141Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/5bd56a32-172f-4f60-a9c3-5a64a35e4c9b.sh
2026-08-11T13:35:25.8222090Z Logged "system:serviceaccount:default:ads-sa" out on "https://api.nprd.caixa:6443"
2026-08-11T13:35:25.8342783Z ##[section]Finishing: Realizando Logout OKD
