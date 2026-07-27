Ao fazer um deploy, a esteira sempre aponta erro de "TIME OUT" na validação de "Verificando Status de Deployment".


2026-07-27T12:56:17.8736855Z ##[section]Starting: Verificando Status do Deployment
2026-07-27T12:56:17.8740209Z ==============================================================================
2026-07-27T12:56:17.8740291Z Task         : Bash
2026-07-27T12:56:17.8740335Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-27T12:56:17.8740411Z Version      : 3.227.0
2026-07-27T12:56:17.8740457Z Author       : Microsoft Corporation
2026-07-27T12:56:17.8740511Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-27T12:56:17.8740594Z ==============================================================================
2026-07-27T12:56:18.9064290Z Generating script.
2026-07-27T12:56:18.9075494Z ========================== Starting Command Output ===========================
2026-07-27T12:56:18.9083134Z [command]/bin/bash /opt/ads-agent/_work/_temp/49100200-4ce9-4c23-8526-91750618d103.sh
2026-07-27T12:56:19.0164786Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-07-27T13:02:25.3832006Z ##[error]The task has timed out.
2026-07-27T13:02:25.3833018Z ##[section]Finishing: Verificando Status do Deployment



2026-07-27T13:02:25.3856151Z ##[section]Starting: Logs da Aplicação
2026-07-27T13:02:25.3859777Z ==============================================================================
2026-07-27T13:02:25.3859892Z Task         : Bash
2026-07-27T13:02:25.3859956Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-27T13:02:25.3860052Z Version      : 3.227.0
2026-07-27T13:02:25.3860181Z Author       : Microsoft Corporation
2026-07-27T13:02:25.3860238Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-27T13:02:25.3860311Z ==============================================================================
2026-07-27T13:02:26.3371292Z Generating script.
2026-07-27T13:02:26.3385782Z ========================== Starting Command Output ===========================
2026-07-27T13:02:26.3399951Z [command]/bin/bash /opt/ads-agent/_work/_temp/77da5730-caa0-4c09-978d-67f15b86b8e7.sh
2026-07-27T13:02:26.3443751Z + shopt -s expand_aliases
2026-07-27T13:02:26.3445365Z + [[ -n okd4_nprd ]]
2026-07-27T13:02:26.3445796Z + [[ okd4_nprd =~ ocp ]]
2026-07-27T13:02:26.3446145Z + [[ -n okd4_nprd ]]
2026-07-27T13:02:26.3446597Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-07-27T13:02:26.3446844Z + app=sigfa-api-openfinance-des
2026-07-27T13:02:26.3446968Z + oc version
2026-07-27T13:02:26.4221343Z Client Version: v4.2.0-alpha.0-1650-g31aa3e8
2026-07-27T13:02:26.4221547Z Kustomize Version: v4.5.7
2026-07-27T13:02:26.4221724Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-07-27T13:02:26.4225839Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-07-27T13:02:26.4246055Z ++ oc get pod -l name=sigfa-api-openfinance-des -n sigfa-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-07-27T13:02:26.4281134Z ++ tac
2026-07-27T13:02:26.4281508Z ++ grep -v '^$'
2026-07-27T13:02:26.4281649Z ++ head -n1
2026-07-27T13:02:26.5218625Z + last_pod=sigfa-api-openfinance-des-136-7xtvw
2026-07-27T13:02:26.5219569Z + echo 'Logs do POD: sigfa-api-openfinance-des-136-7xtvw'
2026-07-27T13:02:26.5220544Z + oc logs sigfa-api-openfinance-des-136-7xtvw -c sigfa-api-openfinance-des -n sigfa-des
2026-07-27T13:02:26.5220851Z Logs do POD: sigfa-api-openfinance-des-136-7xtvw
2026-07-27T13:02:26.6138881Z Error from server (BadRequest): container "sigfa-api-openfinance-des" in pod "sigfa-api-openfinance-des-136-7xtvw" is waiting to start: PodInitializing
2026-07-27T13:02:26.6189044Z ##[error]Bash exited with code '1'.
2026-07-27T13:02:26.6212182Z ##[section]Finishing: Logs da Aplicação
