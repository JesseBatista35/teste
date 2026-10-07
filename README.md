Ao tentar gerar uma release na esteira Devops no SISPL-parametros-ocp4-plus. Está apresentando o seguinte erro para o projeto Sispl-parametros:
 
https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=536761&environmentId=2493891&jobTimelineRecordIdToSelect=e015f713-46fd-5c6a-7803-0e43ad167ccd&selectTaskWithIndex=23#

2026-10-06T18:16:17.3711889Z Server https://api.nctvmrh001.nuvem.caixa:6443
2026-10-06T18:16:17.3712447Z kubernetes v1.33.12
2026-10-06T18:16:17.3746934Z ++ oc get pod -l name=sispl-parametros-tqs -n sispl-tqs -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-10-06T18:16:17.3747141Z ++ tac
2026-10-06T18:16:17.3747272Z ++ grep -v '^$'
2026-10-06T18:16:17.3747929Z ++ head -n1
2026-10-06T18:16:17.8956120Z + last_pod=sispl-parametros-tqs-79485b48ff-2jbw9
2026-10-06T18:16:17.8956466Z + echo 'Logs do POD: sispl-parametros-tqs-79485b48ff-2jbw9'
2026-10-06T18:16:17.8956798Z + oc logs sispl-parametros-tqs-79485b48ff-2jbw9 -c sispl-parametros-tqs -n sispl-tqs
2026-10-06T18:16:17.8959341Z Logs do POD: sispl-parametros-tqs-79485b48ff-2jbw9
2026-10-06T18:16:18.2005815Z Error from server (BadRequest): container "sispl-parametros-tqs" in pod "sispl-parametros-tqs-79485b48ff-2jbw9" is waiting to start: ContainerCreating
2026-10-06T18:16:18.2068897Z ##[error]Bash exited with code '1'.
2026-10-06T18:16:18.2097034Z ##[section]Finishing: Logs da Aplicação

2026-10-06T15:40:44.5417557Z ##[section]Starting: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
2026-10-06T15:40:44.5420329Z ==============================================================================
2026-10-06T15:40:44.5420415Z Task         : Bash
2026-10-06T15:40:44.5420455Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-06T15:40:44.5420513Z Version      : 3.227.0
2026-10-06T15:40:44.5420565Z Author       : Microsoft Corporation
2026-10-06T15:40:44.5420613Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-06T15:40:44.5420678Z ==============================================================================
2026-10-06T15:40:45.4690803Z Generating script.
2026-10-06T15:40:45.4700745Z ========================== Starting Command Output ===========================
2026-10-06T15:40:45.4707519Z [command]/bin/bash /opt/ads-agent/_work/_temp/d14698a8-cdc5-4845-b2d6-0fe6341dc53e.sh
2026-10-06T15:40:45.4762942Z + echo openshift_nprd_loterias
2026-10-06T15:40:45.4763261Z + egrep -q '^(okd4|ocp|openshift)'
2026-10-06T15:40:45.4792025Z ++ check_status_code https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sispl-parametros/manifests/1.13.21.8
2026-10-06T15:40:45.4792371Z ++ local url=https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sispl-parametros/manifests/1.13.21.8
2026-10-06T15:40:45.4794190Z ++ curl --location --request GET https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sispl-parametros/manifests/1.13.21.8 --header 'Authorization: Bearer ***' --header 'Content-Type: text/plain' -s -k -o /dev/null -w '%{http_code}'
2026-10-06T15:40:45.6129148Z + status_code=200
2026-10-06T15:40:45.6130727Z + [[ 200 -ne 200 ]]
2026-10-06T15:40:45.6131182Z + [[ des == \p\r\d ]]
2026-10-06T15:40:45.6131683Z + build=sispl-parametros
2026-10-06T15:40:45.6132241Z + app=sispl-parametros-des
2026-10-06T15:40:45.6132475Z + [[ des == \p\r\d ]]
2026-10-06T15:40:45.6133042Z + oc set image deployment/sispl-parametros-des sispl-parametros-des=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-parametros:1.13.21.8 -n sispl-des
2026-10-06T15:40:45.7919580Z + echo openshift/quarkus-caixa-release
2026-10-06T15:40:45.7920197Z + egrep -q openshift/angular-caixa-release
2026-10-06T15:40:45.7944123Z + echo openshift/quarkus-caixa-release
2026-10-06T15:40:45.7945639Z + egrep -q openshift/php-caixa-release
2026-10-06T15:40:45.7967358Z + echo 'Template não é angular nem php e não precisa deste replace'
2026-10-06T15:40:45.7969056Z + oc patch --type merge deployment/sispl-parametros-des -p '{"spec":{"template":{"spec":{"imagePullSecrets":[{"name":"registry-secret"}]}}}}' -n sispl-des
2026-10-06T15:40:45.7970345Z Template não é angular nem php e não precisa deste replace
2026-10-06T15:40:45.9988035Z deployment.apps/sispl-parametros-des not patched
2026-10-06T15:40:46.0016560Z + oc get secret registry-secret -n sispl-des
2026-10-06T15:40:46.1982716Z NAME              TYPE                             DATA      AGE
2026-10-06T15:40:46.1983240Z registry-secret   kubernetes.io/dockerconfigjson   1         94d
2026-10-06T15:40:46.2012794Z + [[ deployment == deployment ]]
2026-10-06T15:40:46.2013268Z + oc rollout pause deployment/sispl-parametros-des -n sispl-des
2026-10-06T15:40:46.3805823Z error: deployments.apps "sispl-parametros-des" is already paused
2026-10-06T15:40:46.3835102Z + sleep 20
2026-10-06T15:41:06.3850297Z + oc rollout resume deployment/sispl-parametros-des -n sispl-des
2026-10-06T15:41:06.5736876Z deployment.apps/sispl-parametros-des resumed
2026-10-06T15:41:06.5767002Z + oc rollout restart deployment/sispl-parametros-des -n sispl-des
2026-10-06T15:41:06.6837404Z error: unknown command "restart deployment/sispl-parametros-des"
2026-10-06T15:41:06.6837712Z See 'oc rollout -h' for help and examples.
2026-10-06T15:41:06.6922744Z ##[error]Bash exited with code '1'.
2026-10-06T15:41:06.6925161Z ##[section]Finishing: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP


<img width="1608" height="909" alt="image" src="https://github.com/user-attachments/assets/f2197f09-0ce2-4374-9fc5-77975edae149" />

realizado a troca do agent job de Release-Linux para Release-Linux-OKD4


DEPLOY EXECULTADO COM SUCESSO EM DES E TQS


<img width="1599" height="882" alt="image" src="https://github.com/user-attachments/assets/0d96126a-5370-49db-8331-169d1012093c" />
