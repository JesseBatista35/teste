Verificar roblemas na hora do deploy no nosso projeto, de acordo com o log de erro o OKD4 não está conseguindo derrubar o pod anterior, poderiam nos ajudar ?

erro: 2026-08-07T13:56:49.9144689Z Error from server (BadRequest): container "siavl-atddigital-backend-des" in pod "siavl-atddigital-backend-des-118-vl7dc" is waiting to start: PodInitializing

Link release: https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=511416&environmentId=2374312



2026-08-07T13:50:14.2576517Z ##[section]Starting: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
2026-08-07T13:50:14.2579632Z ==============================================================================
2026-08-07T13:50:14.2579726Z Task         : Bash
2026-08-07T13:50:14.2579769Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-07T13:50:14.2579830Z Version      : 3.227.0
2026-08-07T13:50:14.2579881Z Author       : Microsoft Corporation
2026-08-07T13:50:14.2579930Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-07T13:50:14.2579998Z ==============================================================================
2026-08-07T13:50:14.8811326Z Generating script.
2026-08-07T13:50:14.8821468Z ========================== Starting Command Output ===========================
2026-08-07T13:50:14.8828509Z [command]/bin/bash /opt/ads-agent/_work/_temp/3813f146-7fb2-4b94-b526-3b8fb8f906f3.sh
2026-08-07T13:50:14.8878082Z + echo okd4_nprd
2026-08-07T13:50:14.8879642Z + egrep -q '^(okd4|ocp|openshift)'
2026-08-07T13:50:14.8904640Z ++ check_status_code https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/siavl-atddigital-backend/manifests/0.2.1.0
2026-08-07T13:50:14.8906583Z ++ local url=https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/siavl-atddigital-backend/manifests/0.2.1.0
2026-08-07T13:50:14.8908344Z ++ curl --location --request GET https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/siavl-atddigital-backend/manifests/0.2.1.0 --header 'Authorization: Bearer ***' --header 'Content-Type: text/plain' -s -k -o /dev/null -w '%{http_code}'
2026-08-07T13:50:15.0350251Z + status_code=200
2026-08-07T13:50:15.0350898Z + [[ 200 -ne 200 ]]
2026-08-07T13:50:15.0351432Z + [[ des == \p\r\d ]]
2026-08-07T13:50:15.0351753Z + build=siavl-atddigital-backend
2026-08-07T13:50:15.0351920Z + app=siavl-atddigital-backend-des
2026-08-07T13:50:15.0352039Z + [[ des == \p\r\d ]]
2026-08-07T13:50:15.0353291Z + oc set image deploymentconfig/siavl-atddigital-backend-des siavl-atddigital-backend-des=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siavl-atddigital-backend:0.2.1.0 -n siavl-des
2026-08-07T13:50:15.2182554Z + echo openshift/springboot-caixa-release
2026-08-07T13:50:15.2182844Z + egrep -q openshift/angular-caixa-release
2026-08-07T13:50:15.2209548Z + echo openshift/springboot-caixa-release
2026-08-07T13:50:15.2210172Z + egrep -q openshift/php-caixa-release
2026-08-07T13:50:15.2233229Z + echo 'Template não é angular nem php e não precisa deste replace'
2026-08-07T13:50:15.2233995Z + oc patch --type merge deploymentconfig/siavl-atddigital-backend-des -p '{"spec":{"template":{"spec":{"imagePullSecrets":[{"name":"registry-secret"}]}}}}' -n siavl-des
2026-08-07T13:50:15.2235012Z Template não é angular nem php e não precisa deste replace
2026-08-07T13:50:15.4320335Z deploymentconfig.apps.openshift.io/siavl-atddigital-backend-des not patched
2026-08-07T13:50:15.4361386Z + oc get secret registry-secret -n siavl-des
2026-08-07T13:50:15.6357406Z NAME              TYPE                             DATA      AGE
2026-08-07T13:50:15.6357839Z registry-secret   kubernetes.io/dockerconfigjson   1         2y272d
2026-08-07T13:50:15.6388545Z + [[ deploymentconfig == deployment ]]
2026-08-07T13:50:15.6388903Z + oc rollout cancel deploymentconfig/siavl-atddigital-backend-des -n siavl-des
2026-08-07T13:50:15.8822547Z No rollout is in progress (latest rollout #117 failed 43 minutes ago)
2026-08-07T13:50:15.8851704Z + sleep 20
2026-08-07T13:50:35.8865376Z + oc rollout latest deploymentconfig/siavl-atddigital-backend-des -n siavl-des
2026-08-07T13:50:36.1512070Z deploymentconfig.apps.openshift.io/siavl-atddigital-backend-des rolled out
2026-08-07T13:50:36.1584645Z ##[section]Finishing: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP


2026-08-07T13:50:41.0005339Z ##[section]Starting: Verificando Status do Deployment
2026-08-07T13:50:41.0008201Z ==============================================================================
2026-08-07T13:50:41.0008290Z Task         : Bash
2026-08-07T13:50:41.0008351Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-07T13:50:41.0008411Z Version      : 3.227.0
2026-08-07T13:50:41.0008466Z Author       : Microsoft Corporation
2026-08-07T13:50:41.0008520Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-07T13:50:41.0008588Z ==============================================================================
2026-08-07T13:50:41.9888954Z Generating script.
2026-08-07T13:50:41.9899268Z ========================== Starting Command Output ===========================
2026-08-07T13:50:41.9906241Z [command]/bin/bash /opt/ads-agent/_work/_temp/8c89a882-423a-46a3-b2f7-a911a91c6ee5.sh
2026-08-07T13:50:42.3472094Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-08-07T13:56:48.5098578Z ##[error]The task has timed out.
2026-08-07T13:56:48.5099912Z ##[section]Finishing: Verificando Status do Deployment


2026-08-07T13:56:48.5132808Z ##[section]Starting: Logs da Aplicação
2026-08-07T13:56:48.5137223Z ==============================================================================
2026-08-07T13:56:48.5137367Z Task         : Bash
2026-08-07T13:56:48.5137440Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-07T13:56:48.5137559Z Version      : 3.227.0
2026-08-07T13:56:48.5137629Z Author       : Microsoft Corporation
2026-08-07T13:56:48.5137708Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-07T13:56:48.5137819Z ==============================================================================
2026-08-07T13:56:49.2133303Z Generating script.
2026-08-07T13:56:49.2150163Z ========================== Starting Command Output ===========================
2026-08-07T13:56:49.2158232Z [command]/bin/bash /opt/ads-agent/_work/_temp/1dbe1a35-8b88-4cdf-a57c-1e9b871ad5d1.sh
2026-08-07T13:56:49.2207936Z + shopt -s expand_aliases
2026-08-07T13:56:49.2208185Z + [[ -n okd4_nprd ]]
2026-08-07T13:56:49.2208418Z + [[ okd4_nprd =~ ocp ]]
2026-08-07T13:56:49.2208829Z + [[ -n okd4_nprd ]]
2026-08-07T13:56:49.2209534Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-08-07T13:56:49.2209720Z + app=siavl-atddigital-backend-des
2026-08-07T13:56:49.2209834Z + oc version
2026-08-07T13:56:49.3556071Z oc v3.11.0+0cbc58b
2026-08-07T13:56:49.3556297Z kubernetes v1.11.0+d4cacc0
2026-08-07T13:56:49.3556600Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-08-07T13:56:49.3634872Z 
2026-08-07T13:56:49.3635224Z Server https://api.nprd.caixa:6443
2026-08-07T13:56:49.3635548Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-08-07T13:56:49.3671902Z ++ oc get pod -l name=siavl-atddigital-backend-des -n siavl-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-08-07T13:56:49.3682697Z ++ tac
2026-08-07T13:56:49.3682942Z ++ grep -v '^$'
2026-08-07T13:56:49.3683042Z ++ head -n1
2026-08-07T13:56:49.6110090Z + last_pod=siavl-atddigital-backend-des-118-vl7dc
2026-08-07T13:56:49.6110669Z + echo 'Logs do POD: siavl-atddigital-backend-des-118-vl7dc'
2026-08-07T13:56:49.6111099Z + oc logs siavl-atddigital-backend-des-118-vl7dc -c siavl-atddigital-backend-des -n siavl-des
2026-08-07T13:56:49.6111457Z Logs do POD: siavl-atddigital-backend-des-118-vl7dc
2026-08-07T13:56:49.9144689Z Error from server (BadRequest): container "siavl-atddigital-backend-des" in pod "siavl-atddigital-backend-des-118-vl7dc" is waiting to start: PodInitializing
2026-08-07T13:56:49.9226286Z ##[error]Bash exited with code '1'.
2026-08-07T13:56:49.9237193Z ##[section]Finishing: Logs da Aplicação


