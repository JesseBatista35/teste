2026-07-15T13:35:14.8051528Z ##[debug]Evaluating condition for step: 'Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP'
2026-07-15T13:35:14.8052070Z ##[debug]Evaluating: succeeded()
2026-07-15T13:35:14.8052223Z ##[debug]Evaluating succeeded:
2026-07-15T13:35:14.8052602Z ##[debug]=> True
2026-07-15T13:35:14.8052809Z ##[debug]Result: True
2026-07-15T13:35:14.8053057Z ##[section]Starting: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
2026-07-15T13:35:14.8057302Z ==============================================================================
2026-07-15T13:35:14.8057438Z Task         : Bash
2026-07-15T13:35:14.8057512Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-15T13:35:14.8057633Z Version      : 3.227.0
2026-07-15T13:35:14.8057701Z Author       : Microsoft Corporation
2026-07-15T13:35:14.8057776Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-15T13:35:14.8057897Z ==============================================================================
2026-07-15T13:35:14.8664839Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-07-15T13:35:14.9366222Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-07-15T13:35:14.9375922Z ##[debug]loading inputs and endpoints
2026-07-15T13:35:14.9384232Z ##[debug]loading INPUT_TARGETTYPE
2026-07-15T13:35:14.9392486Z ##[debug]loading INPUT_FILEPATH
2026-07-15T13:35:14.9393738Z ##[debug]loading INPUT_SCRIPT
2026-07-15T13:35:14.9394590Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-07-15T13:35:14.9395221Z ##[debug]loading INPUT_FAILONSTDERR
2026-07-15T13:35:14.9396070Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-07-15T13:35:14.9396672Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-07-15T13:35:14.9398605Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-07-15T13:35:14.9404099Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-07-15T13:35:14.9405497Z ##[debug]loading SECRET_PW_ISILON
2026-07-15T13:35:14.9406989Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-07-15T13:35:14.9408980Z ##[debug]loading SECRET_TOKEN_CRQ
2026-07-15T13:35:14.9410371Z ##[debug]loading SECRET_PASSWORD_CGC
2026-07-15T13:35:14.9411477Z ##[debug]loading SECRET_PW_ALOCAIP
2026-07-15T13:35:14.9412118Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-07-15T13:35:14.9413175Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-07-15T13:35:14.9414027Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-07-15T13:35:14.9414559Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-07-15T13:35:14.9415130Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-07-15T13:35:14.9415669Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-07-15T13:35:14.9417132Z ##[debug]loading SECRET_FORTIFY_PASS
2026-07-15T13:35:14.9417766Z ##[debug]loading SECRET_AZPAT
2026-07-15T13:35:14.9418442Z ##[debug]loaded 22
2026-07-15T13:35:14.9423767Z ##[debug]Agent.ProxyUrl=undefined
2026-07-15T13:35:14.9424156Z ##[debug]Agent.CAInfo=undefined
2026-07-15T13:35:14.9424987Z ##[debug]Agent.ClientCert=undefined
2026-07-15T13:35:14.9425273Z ##[debug]Agent.SkipCertValidation=True
2026-07-15T13:35:14.9443752Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-07-15T13:35:14.9445671Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-07-15T13:35:14.9445964Z ##[debug]system.culture=en-US
2026-07-15T13:35:14.9454579Z ##[debug]failOnStderr=false
2026-07-15T13:35:14.9456259Z ##[debug]workingDirectory=/opt/ads-agent/_work/r60/a
2026-07-15T13:35:14.9456513Z ##[debug]check path : /opt/ads-agent/_work/r60/a
2026-07-15T13:35:14.9457113Z ##[debug]targetType=inline
2026-07-15T13:35:14.9457384Z ##[debug]bashEnvValue=undefined
2026-07-15T13:35:14.9463390Z ##[debug]script=#!/bin/bash
set -x

check_status_code() {
  local url=$1
  curl --location --request GET "$url" \
    --header "Authorization: Bearer ***" \
    --header "Content-Type: text/plain" \
    -s -k -o /dev/null -w "%{http_code}"
}

handle_image_not_found() {
  local build_number=$1
  local project_build=$2
  local build_name=$3
  echo ""
  echo "A tag $build_number não foi encontrada no ImageStream de Build: https://console-openshift-console.apps.produtos4.caixa/k8s/ns/$project_build/imagestreams/$build_name"
  echo "Verifique se a tag $build_number foi gerada corretamente durante a Build"
  exit 1
}

if echo "okd4_nprd" | egrep -q "^(okd4|ocp|openshift)"; then
  status_code=`check_status_code "https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/siabm-autenticacao-api/manifests/7.1.2.0-SNAPSHOT"`

  if [[ $status_code -ne 200 && "des" != "prd" ]]; then
    handle_image_not_found "7.1.2.0-SNAPSHOT" "build-images-ads" "siabm-autenticacao-api"
  else
    if [[ "des" == "prd" ]]; then
      status_code_prd=`check_status_code "https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/images-prd/siabm-autenticacao-api/manifests/7.1.2.0-SNAPSHOT"`
      if [[ $status_code -ne 200 && $status_code_prd -ne 200 ]]; then
        handle_image_not_found "7.1.2.0-SNAPSHOT" "images-prd" "siabm-autenticacao-api"
      fi
      if [[ $status_code == 200 ]]; then
        CURRENT_CONTEXT=`oc config current-context`
        oc login --token=*** --server=api.produtos4.caixa:6443
        oc tag build-images-ads/siabm-autenticacao-api:7.1.2.0-SNAPSHOT images-prd/siabm-autenticacao-api:7.1.2.0-SNAPSHOT
        oc config use-context $CURRENT_CONTEXT
      fi
    fi
  fi

  build="siabm-autenticacao-api"
  app="siabm-autenticacao-api-des"
  if [[ "des" == "prd" ]]; then
    oc set image deploymentconfig/$app $app=default-route-openshift-image-registry.apps.produtos4.caixa/images-prd/siabm-autenticacao-api:7.1.2.0-SNAPSHOT -n siabm-des
  else
    oc set image deploymentconfig/$app $app=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siabm-autenticacao-api:7.1.2.0-SNAPSHOT -n siabm-des
  fi

  if echo "openshift/jboss-caixa-release" | egrep -q "openshift/angular-caixa-release"; then
    echo "Realizando replace exporter angular"
    oc set image deploymentconfig/$app $app-exporter=default-route-openshift-image-registry.apps.produtos4.caixa/openshift/nginx-prometheus-exporter -n siabm-des
  elif echo "openshift/jboss-caixa-release" | egrep -q "openshift/php-caixa-release"; then
    echo "Realizando replace exporter php"
    oc set image deploymentconfig/$app $app-exporter=default-route-openshift-image-registry.apps.produtos4.caixa/openshift/apache-exporter -n siabm-des
  else
    echo "Template não é angular nem php e não precisa deste replace"
  fi

  oc patch --type merge deploymentconfig/$app -p '{"spec":{"template":{"spec":{"imagePullSecrets":[{"name":"registry-secret"}]}}}}' -n siabm-des
  if ! oc get secret registry-secret -n siabm-des; then
    oc project siabm-des
    oc create secret docker-registry registry-secret --docker-server=default-route-openshift-image-registry.apps.produtos4.caixa --docker-username=ads-sa --docker-password=*** --docker-email=ads-sa@corp.caixa.gov.br
  fi
else
  build="siabm-autenticacao-api-esteiras"
  app="siabm-autenticacao-api-des-esteiras"
  oc tag build-images-ads/"$build":7.1.2.0-SNAPSHOT siabm-des/$app:7.1.2.0-SNAPSHOT
  if [[ $? -ne 0 ]]; then
    echo ""
    echo "A imagem não foi encontrada no ImageStream de Build: build-images-ads/$build:7.1.2.0-SNAPSHOT"
    echo "Verifique se a imagem foi gerada corretamente durante a Build"
    exit 1
  fi
  oc set image deploymentconfig/$app $app=siabm-des/$app:7.1.2.0-SNAPSHOT --source=imagestreamtag -n siabm-des
fi

if [[ deploymentconfig == deployment ]]; then
  oc rollout pause deploymentconfig/$app -n siabm-des
  sleep 20
  oc rollout resume deploymentconfig/$app -n siabm-des
else
  oc rollout cancel deploymentconfig/$app -n siabm-des
  sleep 20
  oc rollout latest deploymentconfig/$app -n siabm-des
fi
2026-07-15T13:35:14.9467322Z Generating script.
2026-07-15T13:35:14.9469723Z ##[debug]which 'bash'
2026-07-15T13:35:14.9475160Z ##[debug]found: '/usr/bin/bash'
2026-07-15T13:35:14.9475640Z ##[debug]Agent.Version=3.236.1
2026-07-15T13:35:14.9476165Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-07-15T13:35:14.9476631Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-07-15T13:35:14.9478870Z ========================== Starting Command Output ===========================
2026-07-15T13:35:14.9479878Z ##[debug]which '/usr/bin/bash'
2026-07-15T13:35:14.9480766Z ##[debug]found: '/usr/bin/bash'
2026-07-15T13:35:14.9481344Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/b574c32a-549d-41fb-8d8d-d7fadaea5cad.sh
2026-07-15T13:35:14.9483836Z ##[debug]exec tool: /usr/bin/bash
2026-07-15T13:35:14.9484065Z ##[debug]arguments:
2026-07-15T13:35:14.9484303Z ##[debug]   /opt/ads-agent/_work/_temp/b574c32a-549d-41fb-8d8d-d7fadaea5cad.sh
2026-07-15T13:35:14.9486064Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/b574c32a-549d-41fb-8d8d-d7fadaea5cad.sh
2026-07-15T13:35:14.9553728Z + echo okd4_nprd
2026-07-15T13:35:14.9555760Z + egrep -q '^(okd4|ocp|openshift)'
2026-07-15T13:35:14.9591315Z ++ check_status_code https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/siabm-autenticacao-api/manifests/7.1.2.0-SNAPSHOT
2026-07-15T13:35:14.9592632Z ++ local url=https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/siabm-autenticacao-api/manifests/7.1.2.0-SNAPSHOT
2026-07-15T13:35:14.9594395Z ++ curl --location --request GET https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/siabm-autenticacao-api/manifests/7.1.2.0-SNAPSHOT --header 'Authorization: Bearer ***' --header 'Content-Type: text/plain' -s -k -o /dev/null -w '%{http_code}'
2026-07-15T13:35:15.0448129Z + status_code=200
2026-07-15T13:35:15.0448603Z + [[ 200 -ne 200 ]]
2026-07-15T13:35:15.0448733Z + [[ des == \p\r\d ]]
2026-07-15T13:35:15.0448888Z + build=siabm-autenticacao-api
2026-07-15T13:35:15.0449052Z + app=siabm-autenticacao-api-des
2026-07-15T13:35:15.0449169Z + [[ des == \p\r\d ]]
2026-07-15T13:35:15.0449513Z + oc set image deploymentconfig/siabm-autenticacao-api-des siabm-autenticacao-api-des=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siabm-autenticacao-api:7.1.2.0-SNAPSHOT -n siabm-des
2026-07-15T13:35:15.1233033Z + echo openshift/jboss-caixa-release
2026-07-15T13:35:15.1233353Z + egrep -q openshift/angular-caixa-release
2026-07-15T13:35:15.1275340Z + echo openshift/jboss-caixa-release
2026-07-15T13:35:15.1275533Z + egrep -q openshift/php-caixa-release
2026-07-15T13:35:15.1312623Z + echo 'Template não é angular nem php e não precisa deste replace'
2026-07-15T13:35:15.1314805Z Template não é angular nem php e não precisa deste replace
2026-07-15T13:35:15.1315575Z + oc patch --type merge deploymentconfig/siabm-autenticacao-api-des -p '{"spec":{"template":{"spec":{"imagePullSecrets":[{"name":"registry-secret"}]}}}}' -n siabm-des
2026-07-15T13:35:15.2114578Z deploymentconfig.apps.openshift.io/siabm-autenticacao-api-des patched (no change)
2026-07-15T13:35:15.2147476Z + oc get secret registry-secret -n siabm-des
2026-07-15T13:35:15.2914946Z NAME              TYPE                             DATA   AGE
2026-07-15T13:35:15.2915723Z registry-secret   kubernetes.io/dockerconfigjson   1      2y247d
2026-07-15T13:35:15.2954633Z + [[ deploymentconfig == deployment ]]
2026-07-15T13:35:15.2955678Z + oc rollout cancel deploymentconfig/siabm-autenticacao-api-des -n siabm-des
2026-07-15T13:35:15.4063164Z No rollout is in progress (latest rollout #195 failed 17 minutes ago)
2026-07-15T13:35:15.4064050Z error: unable to cancel paused deployment siabm-des/siabm-autenticacao-api-des
2026-07-15T13:35:15.4099734Z + sleep 20
2026-07-15T13:35:15.9249909Z ##[debug]Agent environment resources - Disk: / Available 27008.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 32.92%
2026-07-15T13:35:20.9261571Z ##[debug]Agent environment resources - Disk: / Available 27010.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 27.60%
2026-07-15T13:35:25.9266202Z ##[debug]Agent environment resources - Disk: / Available 27012.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 23.78%
2026-07-15T13:35:30.9276258Z ##[debug]Agent environment resources - Disk: / Available 27012.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 20.91%
2026-07-15T13:35:35.4121819Z + oc rollout latest deploymentconfig/siabm-autenticacao-api-des -n siabm-des
2026-07-15T13:35:35.7005120Z error: cannot deploy a paused deployment config
2026-07-15T13:35:35.7058173Z ##[debug]Exit code 1 received from tool '/usr/bin/bash'
2026-07-15T13:35:35.7058820Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-07-15T13:35:35.7060341Z ##[error]Bash exited with code '1'.
2026-07-15T13:35:35.7060772Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '1'.
2026-07-15T13:35:35.7061066Z ##[debug]task result: Failed
2026-07-15T13:35:35.7062172Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-07-15T13:35:35.7090741Z ##[section]Finishing: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
