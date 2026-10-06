Esta ocorrendo um erro na release do backend-internet.
em intranet está ok com o exato mesmo codigo.
https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-pipeline-progress&releaseId=536407
mas em internet está com erro.
https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-pipeline-progress&releaseId=536642
Na variável altero a versão do node pra 22 em ambo


2026-10-06T13:03:25.9074754Z ##[section]Starting: Verificando Status do Deployment
2026-10-06T13:03:25.9077573Z ==============================================================================
2026-10-06T13:03:25.9077653Z Task         : Bash
2026-10-06T13:03:25.9077696Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-06T13:03:25.9077771Z Version      : 3.227.0
2026-10-06T13:03:25.9077814Z Author       : Microsoft Corporation
2026-10-06T13:03:25.9077865Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-06T13:03:25.9077946Z ==============================================================================
2026-10-06T13:03:26.8654961Z Generating script.
2026-10-06T13:03:26.8665540Z ========================== Starting Command Output ===========================
2026-10-06T13:03:26.8673913Z [command]/bin/bash /opt/ads-agent/_work/_temp/3608ab93-84ea-41a9-972c-70a5035f47ed.sh
2026-10-06T13:03:27.0495729Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-10-06T13:09:33.4168307Z ##[error]The task has timed out.
2026-10-06T13:09:33.4169253Z ##[section]Finishing: Verificando Status do Deployment
2026-10-06T13:09:33.4191239Z ##[section]Starting: Logs da Aplicação
2026-10-06T13:09:33.4194401Z ==============================================================================
2026-10-06T13:09:33.4194481Z Task         : Bash
2026-10-06T13:09:33.4194525Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-06T13:09:33.4194597Z Version      : 3.227.0
2026-10-06T13:09:33.4194640Z Author       : Microsoft Corporation
2026-10-06T13:09:33.4194690Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-06T13:09:33.4194770Z ==============================================================================
2026-10-06T13:09:34.2116249Z Generating script.
2026-10-06T13:09:34.2121742Z ========================== Starting Command Output ===========================
2026-10-06T13:09:34.2123636Z [command]/bin/bash /opt/ads-agent/_work/_temp/5ae780c2-792a-4c42-a9d2-b02f30ffcd35.sh
2026-10-06T13:09:34.2123865Z + shopt -s expand_aliases
2026-10-06T13:09:34.2124009Z + [[ -n okd4_nprd ]]
2026-10-06T13:09:34.2124172Z + [[ okd4_nprd =~ ocp ]]
2026-10-06T13:09:34.2124312Z + [[ -n okd4_nprd ]]
2026-10-06T13:09:34.2124418Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-10-06T13:09:34.2124576Z + app=sicmo-internet-des
2026-10-06T13:09:34.2124739Z + oc version
2026-10-06T13:09:34.3265415Z oc v3.11.0+0cbc58b
2026-10-06T13:09:34.3265635Z kubernetes v1.11.0+d4cacc0
2026-10-06T13:09:34.3265934Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-10-06T13:09:34.3365189Z 
2026-10-06T13:09:34.3365443Z Server https://api.nprd.caixa:6443
2026-10-06T13:09:34.3365700Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-10-06T13:09:34.3405283Z ++ oc get pod -l name=sicmo-internet-des -n sicmo-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-10-06T13:09:34.3406054Z ++ tac
2026-10-06T13:09:34.3406571Z ++ grep -v '^$'
2026-10-06T13:09:34.3406736Z ++ head -n1
2026-10-06T13:09:34.5482453Z + last_pod=sicmo-internet-des-97-jhcrl
2026-10-06T13:09:34.5483220Z + echo 'Logs do POD: sicmo-internet-des-97-jhcrl'
2026-10-06T13:09:34.5483962Z + oc logs sicmo-internet-des-97-jhcrl -c sicmo-internet-des -n sicmo-des
2026-10-06T13:09:34.5484238Z Logs do POD: sicmo-internet-des-97-jhcrl
2026-10-06T13:09:34.8048946Z Error from server (BadRequest): container "sicmo-internet-des" in pod "sicmo-internet-des-97-jhcrl" is waiting to start: PodInitializing
2026-10-06T13:09:34.8121746Z ##[error]Bash exited with code '1'.
2026-10-06T13:09:34.8129179Z ##[section]Finishing: Logs da Aplicação
