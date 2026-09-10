Projeto: SISAG-notificacao-api

Link: https://devops.caixa/projetos/Caixa/_releaseDefinition?definitionId=4218

Erro na task Verificando Status do Deployment

2026-09-10T16:50:43.1207554Z ##[debug]Evaluating condition for step: 'Verificando Status do Deployment'
2026-09-10T16:50:43.1207946Z ##[debug]Evaluating: succeeded()
2026-09-10T16:50:43.1208103Z ##[debug]Evaluating succeeded:
2026-09-10T16:50:43.1208414Z ##[debug]=> True
2026-09-10T16:50:43.1208584Z ##[debug]Result: True
2026-09-10T16:50:43.1208769Z ##[section]Starting: Verificando Status do Deployment
2026-09-10T16:50:43.1212287Z ==============================================================================
2026-09-10T16:50:43.1212388Z Task         : Bash
2026-09-10T16:50:43.1212440Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-10T16:50:43.1212503Z Version      : 3.227.0
2026-09-10T16:50:43.1212571Z Author       : Microsoft Corporation
2026-09-10T16:50:43.1212624Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-10T16:50:43.1212694Z ==============================================================================
2026-09-10T16:50:43.8872584Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-10T16:50:43.9562256Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-10T16:50:43.9569964Z ##[debug]loading inputs and endpoints
2026-09-10T16:50:43.9574191Z ##[debug]loading INPUT_TARGETTYPE
2026-09-10T16:50:43.9582098Z ##[debug]loading INPUT_FILEPATH
2026-09-10T16:50:43.9583328Z ##[debug]loading INPUT_SCRIPT
2026-09-10T16:50:43.9584269Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-10T16:50:43.9584717Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-10T16:50:43.9586627Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-10T16:50:43.9587673Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-10T16:50:43.9589041Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-10T16:50:43.9594436Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-10T16:50:43.9596203Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-10T16:50:43.9597938Z ##[debug]loading SECRET_AZPAT
2026-09-10T16:50:43.9599463Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-10T16:50:43.9600921Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-10T16:50:43.9602359Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-10T16:50:43.9603163Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-09-10T16:50:43.9603772Z ##[debug]loading SECRET_CHAVE_SISTEMA
2026-09-10T16:50:43.9604353Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-10T16:50:43.9604846Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-10T16:50:43.9605591Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-10T16:50:43.9606733Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-10T16:50:43.9607231Z ##[debug]loading SECRET_VAULT_LOCATION
2026-09-10T16:50:43.9608136Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-10T16:50:43.9609300Z ##[debug]loaded 22
2026-09-10T16:50:43.9614141Z ##[debug]Agent.ProxyUrl=undefined
2026-09-10T16:50:43.9615196Z ##[debug]Agent.CAInfo=undefined
2026-09-10T16:50:43.9615488Z ##[debug]Agent.ClientCert=undefined
2026-09-10T16:50:43.9615712Z ##[debug]Agent.SkipCertValidation=True
2026-09-10T16:50:43.9629159Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-10T16:50:43.9631354Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-10T16:50:43.9631621Z ##[debug]system.culture=en-US
2026-09-10T16:50:43.9640648Z ##[debug]failOnStderr=false
2026-09-10T16:50:43.9641500Z ##[debug]workingDirectory=/opt/ads-agent/_work/r17504/a
2026-09-10T16:50:43.9641754Z ##[debug]check path : /opt/ads-agent/_work/r17504/a
2026-09-10T16:50:43.9642123Z ##[debug]targetType=inline
2026-09-10T16:50:43.9642894Z ##[debug]bashEnvValue=undefined
2026-09-10T16:50:43.9643834Z ##[debug]script=if [[ -n "$SITE" && "$SITE" =~ (okd4|ocp|openshift) ]];
then
  app="sisag-notificacao-api-des"
else
  app="sisag-notificacao-api-des-esteiras"
fi

oc rollout status deploymentconfig/"$app"  --request-timeout=600 -n sisag-des
if [ "$?" -ne "0" ]; then
  echo "A aplicação não foi iniciada com sucesso!"
  echo "Os logs da aplicação estão disponíveis na próxima task: Logs da Aplicação"
  exit 1
fi
2026-09-10T16:50:43.9652156Z Generating script.
2026-09-10T16:50:43.9654078Z ##[debug]which 'bash'
2026-09-10T16:50:43.9659337Z ##[debug]found: '/bin/bash'
2026-09-10T16:50:43.9659854Z ##[debug]Agent.Version=3.225.2
2026-09-10T16:50:43.9660082Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-10T16:50:43.9660323Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-10T16:50:43.9662418Z ========================== Starting Command Output ===========================
2026-09-10T16:50:43.9663615Z ##[debug]which '/bin/bash'
2026-09-10T16:50:43.9664272Z ##[debug]found: '/bin/bash'
2026-09-10T16:50:43.9665065Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/4d273c69-da09-47cf-8860-42418d4b2da7.sh
2026-09-10T16:50:43.9667374Z ##[debug]exec tool: /bin/bash
2026-09-10T16:50:43.9667592Z ##[debug]arguments:
2026-09-10T16:50:43.9667824Z ##[debug]   /opt/ads-agent/_work/_temp/4d273c69-da09-47cf-8860-42418d4b2da7.sh
2026-09-10T16:50:43.9669634Z [command]/bin/bash /opt/ads-agent/_work/_temp/4d273c69-da09-47cf-8860-42418d4b2da7.sh
2026-09-10T16:50:44.1938891Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-09-10T16:56:43.1270095Z ##[debug]Started cancellation of executing script
2026-09-10T16:56:43.1276480Z ##[debug]Exit code null received from tool '/bin/bash'
2026-09-10T16:56:50.6319928Z ##[error]The task has timed out.
2026-09-10T16:56:50.6320825Z ##[section]Finishing: Verificando Status do Deployment


Obs.: O mesmo problema ocorre no projeto SISAG-poupanca-integrada-backend no chamado REQ000145902046



2026-09-10T18:01:50.0600307Z ##[debug]Evaluating condition for step: 'Verificando Status do Deployment'
2026-09-10T18:01:50.0600708Z ##[debug]Evaluating: succeeded()
2026-09-10T18:01:50.0600853Z ##[debug]Evaluating succeeded:
2026-09-10T18:01:50.0601117Z ##[debug]=> True
2026-09-10T18:01:50.0601279Z ##[debug]Result: True
2026-09-10T18:01:50.0601530Z ##[section]Starting: Verificando Status do Deployment
2026-09-10T18:01:50.0604979Z ==============================================================================
2026-09-10T18:01:50.0605061Z Task         : Bash
2026-09-10T18:01:50.0605105Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-10T18:01:50.0605181Z Version      : 3.227.0
2026-09-10T18:01:50.0605228Z Author       : Microsoft Corporation
2026-09-10T18:01:50.0605284Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-10T18:01:50.0605363Z ==============================================================================
2026-09-10T18:01:50.9146128Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-10T18:01:50.9775033Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-10T18:01:50.9783957Z ##[debug]loading inputs and endpoints
2026-09-10T18:01:50.9786676Z ##[debug]loading INPUT_TARGETTYPE
2026-09-10T18:01:50.9794181Z ##[debug]loading INPUT_FILEPATH
2026-09-10T18:01:50.9795216Z ##[debug]loading INPUT_SCRIPT
2026-09-10T18:01:50.9796027Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-10T18:01:50.9796599Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-10T18:01:50.9798120Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-10T18:01:50.9798962Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-10T18:01:50.9800214Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-10T18:01:50.9805454Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-10T18:01:50.9807012Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-10T18:01:50.9808752Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-10T18:01:50.9809902Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-10T18:01:50.9811222Z ##[debug]loading SECRET_VAULT_LOCATION
2026-09-10T18:01:50.9812525Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-10T18:01:50.9813157Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-10T18:01:50.9814030Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-10T18:01:50.9814781Z ##[debug]loading SECRET_AZPAT
2026-09-10T18:01:50.9815166Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-10T18:01:50.9815392Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-10T18:01:50.9823907Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-09-10T18:01:50.9824202Z ##[debug]loading SECRET_CHAVE_SISTEMA
2026-09-10T18:01:50.9824439Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-10T18:01:50.9824656Z ##[debug]loaded 22
2026-09-10T18:01:50.9824880Z ##[debug]Agent.ProxyUrl=undefined
2026-09-10T18:01:50.9825100Z ##[debug]Agent.CAInfo=undefined
2026-09-10T18:01:50.9825307Z ##[debug]Agent.ClientCert=undefined
2026-09-10T18:01:50.9827737Z ##[debug]Agent.SkipCertValidation=True
2026-09-10T18:01:50.9836594Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-10T18:01:50.9838730Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-10T18:01:50.9839010Z ##[debug]system.culture=en-US
2026-09-10T18:01:50.9847395Z ##[debug]failOnStderr=false
2026-09-10T18:01:50.9848273Z ##[debug]workingDirectory=/opt/ads-agent/_work/r4017/a
2026-09-10T18:01:50.9848522Z ##[debug]check path : /opt/ads-agent/_work/r4017/a
2026-09-10T18:01:50.9848887Z ##[debug]targetType=inline
2026-09-10T18:01:50.9849703Z ##[debug]bashEnvValue=undefined
2026-09-10T18:01:50.9850434Z ##[debug]script=if [[ -n "$SITE" && "$SITE" =~ (okd4|ocp|openshift) ]];
then
  app="sisag-notificacao-api-des"
else
  app="sisag-notificacao-api-des-esteiras"
fi

oc rollout status deploymentconfig/"$app"  --request-timeout=600 -n sisag-des
if [ "$?" -ne "0" ]; then
  echo "A aplicação não foi iniciada com sucesso!"
  echo "Os logs da aplicação estão disponíveis na próxima task: Logs da Aplicação"
  exit 1
fi
2026-09-10T18:01:50.9858387Z Generating script.
2026-09-10T18:01:50.9860290Z ##[debug]which 'bash'
2026-09-10T18:01:50.9865359Z ##[debug]found: '/bin/bash'
2026-09-10T18:01:50.9865851Z ##[debug]Agent.Version=3.225.2
2026-09-10T18:01:50.9866162Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-10T18:01:50.9866390Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-10T18:01:50.9868513Z ========================== Starting Command Output ===========================
2026-09-10T18:01:50.9869421Z ##[debug]which '/bin/bash'
2026-09-10T18:01:50.9870071Z ##[debug]found: '/bin/bash'
2026-09-10T18:01:50.9870835Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/4b5baa6f-e2b0-4d4b-a835-52cccfc6e4d6.sh
2026-09-10T18:01:50.9886635Z ##[debug]exec tool: /bin/bash
2026-09-10T18:01:50.9887050Z ##[debug]arguments:
2026-09-10T18:01:50.9887491Z ##[debug]   /opt/ads-agent/_work/_temp/4b5baa6f-e2b0-4d4b-a835-52cccfc6e4d6.sh
2026-09-10T18:01:50.9887911Z [command]/bin/bash /opt/ads-agent/_work/_temp/4b5baa6f-e2b0-4d4b-a835-52cccfc6e4d6.sh
2026-09-10T18:01:51.1768195Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-09-10T18:07:50.0637902Z ##[debug]Started cancellation of executing script
2026-09-10T18:07:50.0645591Z ##[debug]Exit code null received from tool '/bin/bash'
2026-09-10T18:07:57.5670730Z ##[error]The task has timed out.
2026-09-10T18:07:57.5671763Z ##[section]Finishing: Verificando Status do Deployment




2026-09-10T18:07:57.5692036Z ##[debug]Evaluating condition for step: 'Logs da Aplicação'
2026-09-10T18:07:57.5693294Z ##[debug]Evaluating: always()
2026-09-10T18:07:57.5693438Z ##[debug]Evaluating always:
2026-09-10T18:07:57.5694450Z ##[debug]=> True
2026-09-10T18:07:57.5694701Z ##[debug]Result: True
2026-09-10T18:07:57.5694906Z ##[section]Starting: Logs da Aplicação
2026-09-10T18:07:57.5698599Z ==============================================================================
2026-09-10T18:07:57.5698682Z Task         : Bash
2026-09-10T18:07:57.5698726Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-10T18:07:57.5698800Z Version      : 3.227.0
2026-09-10T18:07:57.5698847Z Author       : Microsoft Corporation
2026-09-10T18:07:57.5698900Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-10T18:07:57.5698993Z ==============================================================================
2026-09-10T18:07:58.3519149Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-10T18:07:58.4194808Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-10T18:07:58.4196660Z ##[debug]loading inputs and endpoints
2026-09-10T18:07:58.4200476Z ##[debug]loading INPUT_TARGETTYPE
2026-09-10T18:07:58.4207791Z ##[debug]loading INPUT_FILEPATH
2026-09-10T18:07:58.4208725Z ##[debug]loading INPUT_SCRIPT
2026-09-10T18:07:58.4209465Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-10T18:07:58.4210049Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-10T18:07:58.4212065Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-10T18:07:58.4212813Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-10T18:07:58.4215225Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-10T18:07:58.4223004Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-10T18:07:58.4225230Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-10T18:07:58.4226788Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-10T18:07:58.4228175Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-10T18:07:58.4229533Z ##[debug]loading SECRET_VAULT_LOCATION
2026-09-10T18:07:58.4230863Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-10T18:07:58.4231559Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-10T18:07:58.4232139Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-10T18:07:58.4232666Z ##[debug]loading SECRET_AZPAT
2026-09-10T18:07:58.4233232Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-10T18:07:58.4233751Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-10T18:07:58.4234784Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-09-10T18:07:58.4235447Z ##[debug]loading SECRET_CHAVE_SISTEMA
2026-09-10T18:07:58.4235964Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-10T18:07:58.4237025Z ##[debug]loaded 22
2026-09-10T18:07:58.4241347Z ##[debug]Agent.ProxyUrl=undefined
2026-09-10T18:07:58.4241999Z ##[debug]Agent.CAInfo=undefined
2026-09-10T18:07:58.4242802Z ##[debug]Agent.ClientCert=undefined
2026-09-10T18:07:58.4243161Z ##[debug]Agent.SkipCertValidation=True
2026-09-10T18:07:58.4255462Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-10T18:07:58.4257791Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-10T18:07:58.4258062Z ##[debug]system.culture=en-US
2026-09-10T18:07:58.4266522Z ##[debug]failOnStderr=false
2026-09-10T18:07:58.4267281Z ##[debug]workingDirectory=/opt/ads-agent/_work/r4017/a
2026-09-10T18:07:58.4267600Z ##[debug]check path : /opt/ads-agent/_work/r4017/a
2026-09-10T18:07:58.4267957Z ##[debug]targetType=inline
2026-09-10T18:07:58.4268575Z ##[debug]bashEnvValue=undefined
2026-09-10T18:07:58.4269663Z ##[debug]script=#!/bin/bash
set -o errexit
set -o pipefail
set -x

shopt -s expand_aliases

if [[ -n "$SITE" && "okd4_nprd" =~ "ocp" ]]
then
  app="sisag-notificacao-api-des"

  arquivo="/usr/local/bin/oc-v4.13"
  if [ -e "$arquivo" ]; then 
    alias oc="$arquivo"
  fi
elif [[ -n "$SITE" && "$SITE" =~ (okd4|openshift) ]];
then
app="sisag-notificacao-api-des"
else
  app="sisag-notificacao-api-des-esteiras"
fi

oc version

last_pod=$(oc get pod -l name="$app" -n sisag-des -o jsonpath='{range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp  | tac | grep -v '^$' | head -n1)

echo "Logs do POD: $last_pod"
oc logs $last_pod -c "$app" -n sisag-des
2026-09-10T18:07:58.4277502Z Generating script.
2026-09-10T18:07:58.4279433Z ##[debug]which 'bash'
2026-09-10T18:07:58.4284566Z ##[debug]found: '/bin/bash'
2026-09-10T18:07:58.4285032Z ##[debug]Agent.Version=3.225.2
2026-09-10T18:07:58.4285394Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-10T18:07:58.4287629Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-10T18:07:58.4287853Z ========================== Starting Command Output ===========================
2026-09-10T18:07:58.4288365Z ##[debug]which '/bin/bash'
2026-09-10T18:07:58.4293748Z ##[debug]found: '/bin/bash'
2026-09-10T18:07:58.4294036Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/302c7002-4706-4520-b8c7-a86200dedab5.sh
2026-09-10T18:07:58.4294297Z ##[debug]exec tool: /bin/bash
2026-09-10T18:07:58.4294514Z ##[debug]arguments:
2026-09-10T18:07:58.4294757Z ##[debug]   /opt/ads-agent/_work/_temp/302c7002-4706-4520-b8c7-a86200dedab5.sh
2026-09-10T18:07:58.4296897Z [command]/bin/bash /opt/ads-agent/_work/_temp/302c7002-4706-4520-b8c7-a86200dedab5.sh
2026-09-10T18:07:58.4345952Z + shopt -s expand_aliases
2026-09-10T18:07:58.4346259Z + [[ -n okd4_nprd ]]
2026-09-10T18:07:58.4346479Z + [[ okd4_nprd =~ ocp ]]
2026-09-10T18:07:58.4347059Z + [[ -n okd4_nprd ]]
2026-09-10T18:07:58.4347226Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-09-10T18:07:58.4347392Z + app=sisag-notificacao-api-des
2026-09-10T18:07:58.4347503Z + oc version
2026-09-10T18:07:58.5622951Z oc v3.11.0+0cbc58b
2026-09-10T18:07:58.5623206Z kubernetes v1.11.0+d4cacc0
2026-09-10T18:07:58.5623519Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-09-10T18:07:58.5751395Z 
2026-09-10T18:07:58.5751912Z Server https://api.nprd.caixa:6443
2026-09-10T18:07:58.5752588Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-09-10T18:07:58.5781405Z ++ oc get pod -l name=sisag-notificacao-api-des -n sisag-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-10T18:07:58.5781727Z ++ tac
2026-09-10T18:07:58.5787184Z ++ grep -v '^$'
2026-09-10T18:07:58.5787580Z ++ head -n1
2026-09-10T18:07:58.7994665Z + last_pod=sisag-notificacao-api-des-94-xjhhv
2026-09-10T18:07:58.7994935Z + echo 'Logs do POD: sisag-notificacao-api-des-94-xjhhv'
2026-09-10T18:07:58.7996179Z + oc logs sisag-notificacao-api-des-94-xjhhv -c sisag-notificacao-api-des -n sisag-des
2026-09-10T18:07:58.7997650Z Logs do POD: sisag-notificacao-api-des-94-xjhhv
2026-09-10T18:07:59.0629366Z Error from server (BadRequest): container "sisag-notificacao-api-des" in pod "sisag-notificacao-api-des-94-xjhhv" is waiting to start: PodInitializing
2026-09-10T18:07:59.0669640Z ##[debug]Exit code 1 received from tool '/bin/bash'
2026-09-10T18:07:59.0672722Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-09-10T18:07:59.0697910Z ##[error]Bash exited with code '1'.
2026-09-10T18:07:59.0698302Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '1'.
2026-09-10T18:07:59.0698700Z ##[debug]task result: Failed
2026-09-10T18:07:59.0699803Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-09-10T18:07:59.0707267Z ##[section]Finishing: Logs da Aplicação


