2026-09-14T17:40:38.8363392Z ##[debug]Evaluating condition for step: 'Vinculando Secrets'
2026-09-14T17:40:38.8364056Z ##[debug]Evaluating: succeeded()
2026-09-14T17:40:38.8364223Z ##[debug]Evaluating succeeded:
2026-09-14T17:40:38.8364509Z ##[debug]=> True
2026-09-14T17:40:38.8364722Z ##[debug]Result: True
2026-09-14T17:40:38.8364939Z ##[section]Starting: Vinculando Secrets
2026-09-14T17:40:38.8368074Z ==============================================================================
2026-09-14T17:40:38.8368156Z Task         : Bash
2026-09-14T17:40:38.8368209Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-14T17:40:38.8368272Z Version      : 3.227.0
2026-09-14T17:40:38.8368318Z Author       : Microsoft Corporation
2026-09-14T17:40:38.8368377Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-14T17:40:38.8368449Z ==============================================================================
2026-09-14T17:40:39.5173547Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-14T17:40:39.5909544Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-14T17:40:39.5917056Z ##[debug]loading inputs and endpoints
2026-09-14T17:40:39.5922293Z ##[debug]loading INPUT_TARGETTYPE
2026-09-14T17:40:39.5929940Z ##[debug]loading INPUT_FILEPATH
2026-09-14T17:40:39.5931011Z ##[debug]loading INPUT_SCRIPT
2026-09-14T17:40:39.5932167Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-14T17:40:39.5932532Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-14T17:40:39.5934105Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-14T17:40:39.5934785Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-14T17:40:39.5936809Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-14T17:40:39.5943127Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-14T17:40:39.5944949Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-14T17:40:39.5946539Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-14T17:40:39.5948059Z ##[debug]loading SECRET_PW_ISILON
2026-09-14T17:40:39.5949662Z ##[debug]loading SECRET__ENV_AZURE_EVENT_HUB_CONNECTION_STRING
2026-09-14T17:40:39.5951161Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-14T17:40:39.5951887Z ##[debug]loading SECRET__ENV_PCM_EVENT_HUB_CONNECTION_STRING
2026-09-14T17:40:39.5952551Z ##[debug]loading SECRET_AZPAT
2026-09-14T17:40:39.5953143Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-14T17:40:39.5953706Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-14T17:40:39.5954352Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-14T17:40:39.5955518Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-14T17:40:39.5956109Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-09-14T17:40:39.5956729Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-14T17:40:39.5958031Z ##[debug]loading SECRET_PW_ALOCAIP
2026-09-14T17:40:39.5958480Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-14T17:40:39.5959046Z ##[debug]loaded 24
2026-09-14T17:40:39.5964998Z ##[debug]Agent.ProxyUrl=undefined
2026-09-14T17:40:39.5965433Z ##[debug]Agent.CAInfo=undefined
2026-09-14T17:40:39.5965807Z ##[debug]Agent.ClientCert=undefined
2026-09-14T17:40:39.5966122Z ##[debug]Agent.SkipCertValidation=True
2026-09-14T17:40:39.5980495Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-14T17:40:39.5982393Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-14T17:40:39.5982725Z ##[debug]system.culture=en-US
2026-09-14T17:40:39.5990831Z ##[debug]failOnStderr=false
2026-09-14T17:40:39.5991571Z ##[debug]workingDirectory=/opt/ads-agent/_work/r15318/a
2026-09-14T17:40:39.5991875Z ##[debug]check path : /opt/ads-agent/_work/r15318/a
2026-09-14T17:40:39.5992388Z ##[debug]targetType=inline
2026-09-14T17:40:39.5992665Z ##[debug]bashEnvValue=undefined
2026-09-14T17:40:39.5994129Z ##[debug]script=# Verifica se é OKD 4
if [[ -n "okd4_nprd" && ("okd4_nprd" =~ "okd4" || "okd4_nprd" =~ "ocp" || "okd4_nprd" =~ "openshift") ]]
then
  app="siinp-nucleo-des"
else
   # É OKD 3
  app="siinp-nucleo-des-esteiras"
fi

# Verifica se existe necessidade de vinculação de secret
if [ "true" = false ]
then
echo "Nenhuma variável Secret vinculada neste stage..."
else
echo oc set env deploymentconfig/"$app" --from=secret/"$app" -n siinp-des
oc set env deploymentconfig/"$app" --from=secret/"$app" -n siinp-des
fi
2026-09-14T17:40:39.6002429Z Generating script.
2026-09-14T17:40:39.6004433Z ##[debug]which 'bash'
2026-09-14T17:40:39.6009407Z ##[debug]found: '/bin/bash'
2026-09-14T17:40:39.6009988Z ##[debug]Agent.Version=3.225.2
2026-09-14T17:40:39.6010306Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-14T17:40:39.6010572Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-14T17:40:39.6014292Z ========================== Starting Command Output ===========================
2026-09-14T17:40:39.6016494Z ##[debug]which '/bin/bash'
2026-09-14T17:40:39.6019083Z ##[debug]found: '/bin/bash'
2026-09-14T17:40:39.6021316Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/99809266-d595-411b-bb64-566bd509c5d9.sh
2026-09-14T17:40:39.6023463Z ##[debug]exec tool: /bin/bash
2026-09-14T17:40:39.6025555Z ##[debug]arguments:
2026-09-14T17:40:39.6027669Z ##[debug]   /opt/ads-agent/_work/_temp/99809266-d595-411b-bb64-566bd509c5d9.sh
2026-09-14T17:40:39.6030025Z [command]/bin/bash /opt/ads-agent/_work/_temp/99809266-d595-411b-bb64-566bd509c5d9.sh
2026-09-14T17:40:39.6094918Z oc set env deploymentconfig/siinp-nucleo-des --from=secret/siinp-nucleo-des -n siinp-des
2026-09-14T17:40:39.9265301Z deploymentconfig.apps.openshift.io/siinp-nucleo-des updated
2026-09-14T17:40:39.9306401Z ##[debug]Exit code 0 received from tool '/bin/bash'
2026-09-14T17:40:39.9313351Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-09-14T17:40:39.9318905Z ##[debug]task result: Succeeded
2026-09-14T17:40:39.9320763Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-09-14T17:40:39.9348565Z ##[section]Finishing: Vinculando Secrets




2026-09-14T17:40:39.9372935Z ##[debug]Evaluating condition for step: 'Adicionando Multiplas Secrets'
2026-09-14T17:40:39.9373411Z ##[debug]Evaluating: succeeded()
2026-09-14T17:40:39.9373612Z ##[debug]Evaluating succeeded:
2026-09-14T17:40:39.9373885Z ##[debug]=> True
2026-09-14T17:40:39.9374102Z ##[debug]Result: True
2026-09-14T17:40:39.9374492Z ##[section]Starting: Adicionando Multiplas Secrets
2026-09-14T17:40:39.9377866Z ==============================================================================
2026-09-14T17:40:39.9377946Z Task         : Bash
2026-09-14T17:40:39.9378002Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-14T17:40:39.9378065Z Version      : 3.227.0
2026-09-14T17:40:39.9378112Z Author       : Microsoft Corporation
2026-09-14T17:40:39.9378176Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-14T17:40:39.9378249Z ==============================================================================
2026-09-14T17:40:40.8922109Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-14T17:40:40.9604439Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-14T17:40:40.9612203Z ##[debug]loading inputs and endpoints
2026-09-14T17:40:40.9620384Z ##[debug]loading INPUT_TARGETTYPE
2026-09-14T17:40:40.9624826Z ##[debug]loading INPUT_FILEPATH
2026-09-14T17:40:40.9625906Z ##[debug]loading INPUT_SCRIPT
2026-09-14T17:40:40.9626640Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-14T17:40:40.9627165Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-14T17:40:40.9629071Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-14T17:40:40.9630034Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-14T17:40:40.9631539Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-14T17:40:40.9637742Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-14T17:40:40.9639564Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-14T17:40:40.9641902Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-14T17:40:40.9644002Z ##[debug]loading SECRET_PW_ISILON
2026-09-14T17:40:40.9646295Z ##[debug]loading SECRET__ENV_AZURE_EVENT_HUB_CONNECTION_STRING
2026-09-14T17:40:40.9648412Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-14T17:40:40.9650569Z ##[debug]loading SECRET__ENV_PCM_EVENT_HUB_CONNECTION_STRING
2026-09-14T17:40:40.9652663Z ##[debug]loading SECRET_AZPAT
2026-09-14T17:40:40.9654740Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-14T17:40:40.9656813Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-14T17:40:40.9658894Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-14T17:40:40.9661209Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-14T17:40:40.9663688Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-09-14T17:40:40.9666143Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-14T17:40:40.9668376Z ##[debug]loading SECRET_PW_ALOCAIP
2026-09-14T17:40:40.9670519Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-14T17:40:40.9672671Z ##[debug]loaded 24
2026-09-14T17:40:40.9674747Z ##[debug]Agent.ProxyUrl=undefined
2026-09-14T17:40:40.9676959Z ##[debug]Agent.CAInfo=undefined
2026-09-14T17:40:40.9679029Z ##[debug]Agent.ClientCert=undefined
2026-09-14T17:40:40.9681204Z ##[debug]Agent.SkipCertValidation=True
2026-09-14T17:40:40.9683345Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-14T17:40:40.9685513Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-14T17:40:40.9687632Z ##[debug]system.culture=en-US
2026-09-14T17:40:40.9689829Z ##[debug]failOnStderr=false
2026-09-14T17:40:40.9691910Z ##[debug]workingDirectory=/opt/ads-agent/_work/r15318/a
2026-09-14T17:40:40.9694000Z ##[debug]check path : /opt/ads-agent/_work/r15318/a
2026-09-14T17:40:40.9696353Z ##[debug]targetType=inline
2026-09-14T17:40:40.9698602Z ##[debug]bashEnvValue=undefined
2026-09-14T17:40:40.9701576Z ##[debug]script=IS_SECURE=`env | grep _SECUREFILEPATH`

if [ -z "$IS_SECURE" ]
  then 
      echo "Sem SECURE FILES para configurar"
else
for certificado in `env | grep _SECUREFILEPATH`; do
     echo "Variavel de ambiente com o certificado = $certificado"
     JKS_FILE=` basename $certificado`
     FILE_PATH=${certificado#*=}
     echo "Encontrado certificado = $JKS_FILE com o PATH $FILE_PATH"

     filename=${JKS_FILE%%.*}
     echo "nome do arquivo final = $filename"

     secretName=`echo "$filename" | sed -r 's/_/-/g'`
     echo "nome da Secret Name = $secretName"

     echo "LOCALIZANDO SECRET OKD"

     oc get secret $secretName -n siinp-des
     if [ "$?" -ne "1" ]; then
          echo "EXCLUINDO SECRET OKD"
          oc delete secret $secretName -n siinp-des
     fi

     echo "CRIANDO SECRET OKD"
     oc create secret generic $secretName --from-file="$FILE_PATH" -n siinp-des
     echo "oc create secret generic $secretName --from-file="$JKS_FILE" -n siinp-des"

    if [[ -n "okd4_nprd" && ("okd4_nprd" =~ "okd4" || "okd4_nprd" =~ "ocp" || "okd4_nprd" =~ "openshift") ]]
    then
      app="siinp-nucleo-des"
    else
      app="siinp-nucleo-des-esteiras"
    fi
	 
     echo "SET VOLUME COM NOVA SECRET"
     oc set volume deploymentconfig "$app" --add --name=$secretName --secret-name=$secretName --mount-path=/deployments/$JKS_FILE --sub-path=$JKS_FILE --overwrite -n siinp-des

done 
fi
2026-09-14T17:40:40.9704359Z Generating script.
2026-09-14T17:40:40.9706415Z ##[debug]which 'bash'
2026-09-14T17:40:40.9709383Z ##[debug]found: '/bin/bash'
2026-09-14T17:40:40.9711506Z ##[debug]Agent.Version=3.225.2
2026-09-14T17:40:40.9713873Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-14T17:40:40.9716002Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-14T17:40:40.9718084Z ========================== Starting Command Output ===========================
2026-09-14T17:40:40.9720542Z ##[debug]which '/bin/bash'
2026-09-14T17:40:40.9722743Z ##[debug]found: '/bin/bash'
2026-09-14T17:40:40.9724988Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/bd48231b-e998-442a-a4f9-1c2a779a224f.sh
2026-09-14T17:40:40.9727103Z ##[debug]exec tool: /bin/bash
2026-09-14T17:40:40.9729232Z ##[debug]arguments:
2026-09-14T17:40:40.9731553Z ##[debug]   /opt/ads-agent/_work/_temp/bd48231b-e998-442a-a4f9-1c2a779a224f.sh
2026-09-14T17:40:40.9733784Z [command]/bin/bash /opt/ads-agent/_work/_temp/bd48231b-e998-442a-a4f9-1c2a779a224f.sh
2026-09-14T17:40:40.9820399Z Variavel de ambiente com o certificado = DOWNLOADSECUREFILE2_SECUREFILEPATH=/opt/ads-agent/_work/_temp/siinp_mtls_sandbox_of_072026.p12
2026-09-14T17:40:40.9830112Z Encontrado certificado = siinp_mtls_sandbox_of_072026.p12 com o PATH /opt/ads-agent/_work/_temp/siinp_mtls_sandbox_of_072026.p12
2026-09-14T17:40:40.9830573Z nome do arquivo final = siinp_mtls_sandbox_of_072026
2026-09-14T17:40:40.9852614Z nome da Secret Name = siinp-mtls-sandbox-of-072026
2026-09-14T17:40:40.9852826Z LOCALIZANDO SECRET OKD
2026-09-14T17:40:41.1860017Z NAME                           TYPE      DATA      AGE
2026-09-14T17:40:41.1860406Z siinp-mtls-sandbox-of-072026   Opaque    1         3h34m
2026-09-14T17:40:41.1888149Z EXCLUINDO SECRET OKD
2026-09-14T17:40:41.4350726Z secret "siinp-mtls-sandbox-of-072026" deleted
2026-09-14T17:40:41.4426487Z CRIANDO SECRET OKD
2026-09-14T17:40:41.6268124Z secret/siinp-mtls-sandbox-of-072026 created
2026-09-14T17:40:41.6294944Z oc create secret generic siinp-mtls-sandbox-of-072026 --from-file=siinp_mtls_sandbox_of_072026.p12 -n siinp-des
2026-09-14T17:40:41.6295880Z SET VOLUME COM NOVA SECRET
2026-09-14T17:40:41.9060815Z deploymentconfig.apps.openshift.io/siinp-nucleo-des volume updated
2026-09-14T17:40:41.9088931Z Variavel de ambiente com o certificado = DOWNLOADSECUREFILE1_SECUREFILEPATH=/opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-09-14T17:40:41.9105711Z Encontrado certificado = caixa-truststore-acteste-nprd.jks com o PATH /opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-09-14T17:40:41.9106076Z nome do arquivo final = caixa-truststore-acteste-nprd
2026-09-14T17:40:41.9126933Z nome da Secret Name = caixa-truststore-acteste-nprd
2026-09-14T17:40:41.9127305Z LOCALIZANDO SECRET OKD
2026-09-14T17:40:42.1094223Z NAME                            TYPE      DATA      AGE
2026-09-14T17:40:42.1095005Z caixa-truststore-acteste-nprd   Opaque    1         3h34m
2026-09-14T17:40:42.1121060Z EXCLUINDO SECRET OKD
2026-09-14T17:40:42.3535364Z secret "caixa-truststore-acteste-nprd" deleted
2026-09-14T17:40:42.3598330Z CRIANDO SECRET OKD
2026-09-14T17:40:42.5497998Z secret/caixa-truststore-acteste-nprd created
2026-09-14T17:40:42.5528442Z oc create secret generic caixa-truststore-acteste-nprd --from-file=caixa-truststore-acteste-nprd.jks -n siinp-des
2026-09-14T17:40:42.5529037Z SET VOLUME COM NOVA SECRET
2026-09-14T17:40:42.8191114Z deploymentconfig.apps.openshift.io/siinp-nucleo-des volume updated
2026-09-14T17:40:42.8221890Z Variavel de ambiente com o certificado = CACERTIFICATE_SECUREFILEPATH=/opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-09-14T17:40:42.8234392Z Encontrado certificado = caixa-truststore-acteste-nprd.jks com o PATH /opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-09-14T17:40:42.8234987Z nome do arquivo final = caixa-truststore-acteste-nprd
2026-09-14T17:40:42.8257820Z nome da Secret Name = caixa-truststore-acteste-nprd
2026-09-14T17:40:42.8260365Z LOCALIZANDO SECRET OKD
2026-09-14T17:40:43.0268266Z NAME                            TYPE      DATA      AGE
2026-09-14T17:40:43.0269271Z caixa-truststore-acteste-nprd   Opaque    1         1s
2026-09-14T17:40:43.0297590Z EXCLUINDO SECRET OKD
2026-09-14T17:40:43.2675968Z secret "caixa-truststore-acteste-nprd" deleted
2026-09-14T17:40:43.2787069Z CRIANDO SECRET OKD
2026-09-14T17:40:43.4718262Z secret/caixa-truststore-acteste-nprd created
2026-09-14T17:40:43.4747157Z oc create secret generic caixa-truststore-acteste-nprd --from-file=caixa-truststore-acteste-nprd.jks -n siinp-des
2026-09-14T17:40:43.4747340Z SET VOLUME COM NOVA SECRET
2026-09-14T17:40:43.7254498Z ##[debug]Exit code 0 received from tool '/bin/bash'
2026-09-14T17:40:43.7260172Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-09-14T17:40:43.7265886Z ##[debug]task result: Succeeded
2026-09-14T17:40:43.7280380Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-09-14T17:40:43.7294001Z ##[section]Finishing: Adicionando Multiplas Secrets

