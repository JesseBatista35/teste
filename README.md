2026-08-11T13:26:51.4501552Z ##[section]Starting: Criando novo Projeto
2026-08-11T13:26:51.4504980Z ==============================================================================
2026-08-11T13:26:51.4505058Z Task         : Bash
2026-08-11T13:26:51.4505165Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-11T13:26:51.4505227Z Version      : 3.227.0
2026-08-11T13:26:51.4505269Z Author       : Microsoft Corporation
2026-08-11T13:26:51.4505347Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-11T13:26:51.4505419Z ==============================================================================
2026-08-11T13:26:51.8795760Z Generating script.
2026-08-11T13:26:51.8807623Z ========================== Starting Command Output ===========================
2026-08-11T13:26:51.8816084Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/0a58c53c-3294-4e3d-a94e-bed20a960a3f.sh
2026-08-11T13:26:51.9582684Z NAME        DISPLAY NAME   STATUS
2026-08-11T13:26:51.9584589Z siavl-des                  Active
2026-08-11T13:26:52.0508498Z namespace/siavl-des not labeled
2026-08-11T13:26:52.1308155Z namespace/siavl-des not labeled
2026-08-11T13:26:52.2042167Z namespace/siavl-des not labeled
2026-08-11T13:26:52.2748176Z netnamespace.network.openshift.io/siavl-des not labeled
2026-08-11T13:26:52.2834054Z ##[section]Finishing: Criando novo Projeto



2026-08-11T13:26:52.2896497Z ##[section]Starting: Criando nova APP
2026-08-11T13:26:52.2899313Z ==============================================================================
2026-08-11T13:26:52.2899405Z Task         : Bash
2026-08-11T13:26:52.2899447Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-11T13:26:52.2899508Z Version      : 3.227.0
2026-08-11T13:26:52.2899558Z Author       : Microsoft Corporation
2026-08-11T13:26:52.2899609Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-11T13:26:52.2899679Z ==============================================================================
2026-08-11T13:26:52.4169718Z Generating script.
2026-08-11T13:26:52.4180654Z ========================== Starting Command Output ===========================
2026-08-11T13:26:52.4187550Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/89a1d212-7f40-47d9-b67f-8a2dae959968.sh
2026-08-11T13:26:52.4236372Z OKD4 NPRD - des, tqs ou hmp
2026-08-11T13:26:52.4865399Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-08-11T13:26:52.4865777Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-08-11T13:26:52.4865954Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-08-11T13:26:52.6021255Z Iniciando criação da APP
2026-08-11T13:26:52.6984171Z error: error processing template "openshift/angular-caixa-release": the namespace of the provided object does not match the namespace sent on the request
2026-08-11T13:26:52.7032638Z ##[error]Bash exited with code '1'.
2026-08-11T13:26:52.7067790Z ##[section]Finishing: Criando nova APP



2026-08-11T13:26:52.7279221Z ##[section]Starting: Logs da Aplicação
2026-08-11T13:26:52.7282045Z ==============================================================================
2026-08-11T13:26:52.7282126Z Task         : Bash
2026-08-11T13:26:52.7282168Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-11T13:26:52.7282229Z Version      : 3.227.0
2026-08-11T13:26:52.7282277Z Author       : Microsoft Corporation
2026-08-11T13:26:52.7282326Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-11T13:26:52.7282395Z ==============================================================================
2026-08-11T13:26:52.8528579Z Generating script.
2026-08-11T13:26:52.8540747Z ========================== Starting Command Output ===========================
2026-08-11T13:26:52.8547925Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/0112fc14-7287-47aa-997d-2733ce15222f.sh
2026-08-11T13:26:52.8595822Z + shopt -s expand_aliases
2026-08-11T13:26:52.8596003Z + [[ -n okd4_nprd ]]
2026-08-11T13:26:52.8596184Z + [[ okd4_nprd =~ ocp ]]
2026-08-11T13:26:52.8597211Z + [[ -n okd4_nprd ]]
2026-08-11T13:26:52.8597322Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-08-11T13:26:52.8597479Z + app=siavl-gerencial-frontend-des
2026-08-11T13:26:52.8597586Z + oc version
2026-08-11T13:26:52.9334428Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-08-11T13:26:52.9334656Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-08-11T13:26:52.9334932Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-08-11T13:26:52.9364835Z ++ oc get pod -l name=siavl-gerencial-frontend-des -n siavl-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-08-11T13:26:52.9366037Z ++ tac
2026-08-11T13:26:52.9366974Z ++ grep -v '^$'
2026-08-11T13:26:52.9367071Z ++ head -n1
2026-08-11T13:26:53.0080952Z + last_pod=siavl-gerencial-frontend-des-13-pld57
2026-08-11T13:26:53.0081257Z + echo 'Logs do POD: siavl-gerencial-frontend-des-13-pld57'
2026-08-11T13:26:53.0081492Z + oc logs siavl-gerencial-frontend-des-13-pld57 -c siavl-gerencial-frontend-des -n siavl-des
2026-08-11T13:26:53.0081697Z Logs do POD: siavl-gerencial-frontend-des-13-pld57
2026-08-11T13:26:53.0910163Z ##[section]Finishing: Logs da Aplicação
