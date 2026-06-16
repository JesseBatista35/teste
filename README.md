2026-06-16T17:13:01.2290095Z ##[section]Starting: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
2026-06-16T17:13:01.2293744Z ==============================================================================
2026-06-16T17:13:01.2293853Z Task         : Bash
2026-06-16T17:13:01.2293911Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-16T17:13:01.2293971Z Version      : 3.227.0
2026-06-16T17:13:01.2294036Z Author       : Microsoft Corporation
2026-06-16T17:13:01.2294096Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-16T17:13:01.2294164Z ==============================================================================
2026-06-16T17:13:02.0724881Z Generating script.
2026-06-16T17:13:02.0736246Z ========================== Starting Command Output ===========================
2026-06-16T17:13:02.0743966Z [command]/bin/bash /opt/ads-agent/_work/_temp/32dbb459-c260-4b44-8d5d-922d153eb92c.sh
2026-06-16T17:13:02.0798466Z + echo okd4_nprd
2026-06-16T17:13:02.0799618Z + egrep -q '^(okd4|ocp)'
2026-06-16T17:13:02.0825911Z ++ check_status_code https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sipgc-api-informacoes/manifests/1.1.0.14
2026-06-16T17:13:02.0826651Z ++ local url=https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sipgc-api-informacoes/manifests/1.1.0.14
2026-06-16T17:13:02.0828711Z ++ curl --location --request GET https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sipgc-api-informacoes/manifests/1.1.0.14 --header 'Authorization: Bearer ***' --header 'Content-Type: text/plain' -s -k -o /dev/null -w '%{http_code}'
2026-06-16T17:13:02.2011065Z + status_code=200
2026-06-16T17:13:02.2011420Z + [[ 200 -ne 200 ]]
2026-06-16T17:13:02.2011543Z + [[ tqs == \p\r\d ]]
2026-06-16T17:13:02.2011695Z + build=sipgc-api-informacoes
2026-06-16T17:13:02.2013031Z + app=sipgc-api-informacoes-tqs
2026-06-16T17:13:02.2013236Z + [[ tqs == \p\r\d ]]
2026-06-16T17:13:02.2013584Z + oc set image dc/sipgc-api-informacoes-tqs sipgc-api-informacoes-tqs=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sipgc-api-informacoes:1.1.0.14 -n sipgc-tqs
2026-06-16T17:13:02.4211707Z deploymentconfig.apps.openshift.io/sipgc-api-informacoes-tqs image updated
2026-06-16T17:13:02.4249997Z + echo openshift/dotnetcore-caixa-release
2026-06-16T17:13:02.4251025Z + egrep -q openshift/angular-caixa-release
2026-06-16T17:13:02.4283956Z + echo openshift/dotnetcore-caixa-release
2026-06-16T17:13:02.4284234Z + egrep -q openshift/php-caixa-release
2026-06-16T17:13:02.4308441Z + echo 'Template não é angular nem php e não precisa deste replace'
2026-06-16T17:13:02.4309021Z Template não é angular nem php e não precisa deste replace
2026-06-16T17:13:02.4309441Z + oc patch --type merge dc/sipgc-api-informacoes-tqs -p '{"spec":{"template":{"spec":{"imagePullSecrets":[{"name":"registry-secret"}]}}}}' -n sipgc-tqs
2026-06-16T17:13:02.6604122Z deploymentconfig.apps.openshift.io/sipgc-api-informacoes-tqs not patched
2026-06-16T17:13:02.6635925Z + oc get secret registry-secret -n sipgc-tqs
2026-06-16T17:13:02.8714777Z NAME              TYPE                             DATA      AGE
2026-06-16T17:13:02.8715156Z registry-secret   kubernetes.io/dockerconfigjson   1         518d
2026-06-16T17:13:02.8748444Z + [[ dc == deployment ]]
2026-06-16T17:13:02.8748938Z + oc rollout cancel dc/sipgc-api-informacoes-tqs -n sipgc-tqs
2026-06-16T17:13:03.1348427Z No rollout is in progress (latest rollout #49 pending (cancelling) 4 seconds ago)
2026-06-16T17:13:03.1381191Z + sleep 20
2026-06-16T17:13:23.1396427Z + oc rollout latest dc/sipgc-api-informacoes-tqs -n sipgc-tqs
2026-06-16T17:13:23.4215919Z error: #50 is already in progress (Running).
2026-06-16T17:13:23.4302746Z ##[error]Bash exited with code '1'.
2026-06-16T17:13:23.4309789Z ##[section]Finishing: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
