2026-09-14T16:48:43.0611611Z ##[debug]Evaluating condition for step: 'Atualizando Variáveis de Ambiente'
2026-09-14T16:48:43.0612124Z ##[debug]Evaluating: succeeded()
2026-09-14T16:48:43.0612318Z ##[debug]Evaluating succeeded:
2026-09-14T16:48:43.0612626Z ##[debug]=> True
2026-09-14T16:48:43.0612829Z ##[debug]Result: True
2026-09-14T16:48:43.0613044Z ##[section]Starting: Atualizando Variáveis de Ambiente
2026-09-14T16:48:43.0616084Z ==============================================================================
2026-09-14T16:48:43.0616161Z Task         : Bash
2026-09-14T16:48:43.0616203Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-14T16:48:43.0616345Z Version      : 3.227.0
2026-09-14T16:48:43.0616389Z Author       : Microsoft Corporation
2026-09-14T16:48:43.0616440Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-14T16:48:43.0616516Z ==============================================================================
2026-09-14T16:48:43.9395554Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-14T16:48:44.0078828Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-14T16:48:44.0086903Z ##[debug]loading inputs and endpoints
2026-09-14T16:48:44.0091433Z ##[debug]loading INPUT_TARGETTYPE
2026-09-14T16:48:44.0098671Z ##[debug]loading INPUT_FILEPATH
2026-09-14T16:48:44.0100405Z ##[debug]loading INPUT_SCRIPT
2026-09-14T16:48:44.0101520Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-14T16:48:44.0102406Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-14T16:48:44.0103871Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-14T16:48:44.0104615Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-14T16:48:44.0106123Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-14T16:48:44.0112462Z ##[debug]loading SECRET_AZPAT
2026-09-14T16:48:44.0114181Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-14T16:48:44.0115678Z ##[debug]loading SECRET_PW_ISILON
2026-09-14T16:48:44.0120295Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-14T16:48:44.0120551Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-14T16:48:44.0120796Z ##[debug]loading SECRET_PW_ALOCAIP
2026-09-14T16:48:44.0121050Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-14T16:48:44.0121702Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-14T16:48:44.0122247Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-14T16:48:44.0122775Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-14T16:48:44.0123278Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-14T16:48:44.0124507Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-14T16:48:44.0125075Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-09-14T16:48:44.0125661Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-14T16:48:44.0126924Z ##[debug]loaded 22
2026-09-14T16:48:44.0132875Z ##[debug]Agent.ProxyUrl=undefined
2026-09-14T16:48:44.0133236Z ##[debug]Agent.CAInfo=undefined
2026-09-14T16:48:44.0133472Z ##[debug]Agent.ClientCert=undefined
2026-09-14T16:48:44.0133688Z ##[debug]Agent.SkipCertValidation=True
2026-09-14T16:48:44.0147448Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-14T16:48:44.0149575Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-14T16:48:44.0150085Z ##[debug]system.culture=en-US
2026-09-14T16:48:44.0158451Z ##[debug]failOnStderr=false
2026-09-14T16:48:44.0159402Z ##[debug]workingDirectory=/opt/ads-agent/_work/r15318/a
2026-09-14T16:48:44.0159762Z ##[debug]check path : /opt/ads-agent/_work/r15318/a
2026-09-14T16:48:44.0160211Z ##[debug]targetType=inline
2026-09-14T16:48:44.0160891Z ##[debug]bashEnvValue=undefined
2026-09-14T16:48:44.0173850Z ##[debug]script=#!/bin/bash
set -o errexit
set -o pipefail

shopt -s extglob
echo "Nova APP: false"

CONTAINER_PRINCIPAL=siinp-nucleo-des  # nome do container principal da aplicação

for UNSET_VAR in $(oc set env deploymentconfig "siinp-nucleo-des" -n siinp-des --list -c "$CONTAINER_PRINCIPAL" | egrep -wv '^#|TZ|INSTANCE_IP' | cut -f1 -d"=")
do 
oc set env deploymentconfig "siinp-nucleo-des" -n siinp-des -c "$CONTAINER_PRINCIPAL" $UNSET_VAR- 
done

for UNSET_SECRET in $(oc set env deploymentconfig "siinp-nucleo-des" -n siinp-des --list -c "$CONTAINER_PRINCIPAL" | grep 'from secret' | awk '{print $2}')
do
  if [ -n $UNSET_SECRET ]
  then
    oc set env deploymentconfig "siinp-nucleo-des" -n siinp-des -c "$CONTAINER_PRINCIPAL" $UNSET_SECRET- 
  fi
done

fi
2026-09-14T16:48:44.0185031Z Generating script.
2026-09-14T16:48:44.0185239Z ##[debug]which 'bash'
2026-09-14T16:48:44.0185455Z ##[debug]found: '/bin/bash'
2026-09-14T16:48:44.0185686Z ##[debug]Agent.Version=3.225.2
2026-09-14T16:48:44.0185923Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-14T16:48:44.0186171Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-14T16:48:44.0186381Z ========================== Starting Command Output ===========================
2026-09-14T16:48:44.0186605Z ##[debug]which '/bin/bash'
2026-09-14T16:48:44.0186824Z ##[debug]found: '/bin/bash'
2026-09-14T16:48:44.0187064Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/4b770d09-317c-4f35-a5ee-f9ce1a34c2c9.sh
2026-09-14T16:48:44.0201189Z ##[debug]exec tool: /bin/bash
2026-09-14T16:48:44.0201707Z ##[debug]arguments:
2026-09-14T16:48:44.0202157Z ##[debug]   /opt/ads-agent/_work/_temp/4b770d09-317c-4f35-a5ee-f9ce1a34c2c9.sh
2026-09-14T16:48:44.0202582Z [command]/bin/bash /opt/ads-agent/_work/_temp/4b770d09-317c-4f35-a5ee-f9ce1a34c2c9.sh
2026-09-14T16:48:44.0275080Z Nova APP: false
2026-09-14T16:48:44.6276722Z error: one or more resources must be specified as <resource> <name> or <resource>/<name>
2026-09-14T16:48:44.6277652Z See 'oc set env -h' for help and examples.
2026-09-14T16:48:44.6308615Z ##[debug]Exit code 1 received from tool '/bin/bash'
2026-09-14T16:48:44.6311823Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-09-14T16:48:44.6322247Z ##[error]Bash exited with code '1'.
2026-09-14T16:48:44.6322805Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '1'.
2026-09-14T16:48:44.6323071Z ##[debug]task result: Failed
2026-09-14T16:48:44.6324059Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-09-14T16:48:44.6351399Z ##[section]Finishing: Atualizando Variáveis de Ambiente
