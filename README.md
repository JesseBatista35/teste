2026-10-30T18:37:07.5746020Z ##[debug]Evaluating condition for step: 'Adicionando Multiplas Secrets'
2026-10-30T18:37:07.5746423Z ##[debug]Evaluating: succeeded()
2026-10-30T18:37:07.5746567Z ##[debug]Evaluating succeeded:
2026-10-30T18:37:07.5746838Z ##[debug]=> True
2026-10-30T18:37:07.5746994Z ##[debug]Result: True
2026-10-30T18:37:07.5747162Z ##[section]Starting: Adicionando Multiplas Secrets
2026-10-30T18:37:07.5750023Z ==============================================================================
2026-10-30T18:37:07.5750109Z Task         : Bash
2026-10-30T18:37:07.5750153Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-30T18:37:07.5750216Z Version      : 3.227.0
2026-10-30T18:37:07.5750268Z Author       : Microsoft Corporation
2026-10-30T18:37:07.5750320Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-30T18:37:07.5750391Z ==============================================================================
2026-10-30T18:37:07.6264149Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-10-30T18:37:07.6947649Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-10-30T18:37:07.6955620Z ##[debug]loading inputs and endpoints
2026-10-30T18:37:07.6962984Z ##[debug]loading INPUT_TARGETTYPE
2026-10-30T18:37:07.6971780Z ##[debug]loading INPUT_FILEPATH
2026-10-30T18:37:07.6972100Z ##[debug]loading INPUT_SCRIPT
2026-10-30T18:37:07.6972950Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-10-30T18:37:07.6973552Z ##[debug]loading INPUT_FAILONSTDERR
2026-10-30T18:37:07.6974275Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-10-30T18:37:07.6974938Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-10-30T18:37:07.6977018Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-10-30T18:37:07.6982285Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-10-30T18:37:07.6983238Z ##[debug]loading SECRET_PASSWORD_CGC
2026-10-30T18:37:07.6984955Z ##[debug]loading SECRET_PW_ALOCAIP
2026-10-30T18:37:07.6986634Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-10-30T18:37:07.6988006Z ##[debug]loading SECRET_PW_ISILON
2026-10-30T18:37:07.6989193Z ##[debug]loading SECRET_DATASOURCE_PASSWORD
2026-10-30T18:37:07.6989740Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-10-30T18:37:07.6990386Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-10-30T18:37:07.6990991Z ##[debug]loading SECRET_AZPAT
2026-10-30T18:37:07.6991567Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-10-30T18:37:07.6992103Z ##[debug]loading SECRET_FORTIFY_PASS
2026-10-30T18:37:07.6993150Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-10-30T18:37:07.6994123Z ##[debug]loading SECRET_TOKEN_CRQ
2026-10-30T18:37:07.6994629Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-10-30T18:37:07.6995210Z ##[debug]loaded 22
2026-10-30T18:37:07.6999729Z ##[debug]Agent.ProxyUrl=undefined
2026-10-30T18:37:07.6999955Z ##[debug]Agent.CAInfo=undefined
2026-10-30T18:37:07.7000181Z ##[debug]Agent.ClientCert=undefined
2026-10-30T18:37:07.7000408Z ##[debug]Agent.SkipCertValidation=True
2026-10-30T18:37:07.7014867Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-30T18:37:07.7016838Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-30T18:37:07.7017110Z ##[debug]system.culture=en-US
2026-10-30T18:37:07.7025347Z ##[debug]failOnStderr=false
2026-10-30T18:37:07.7026884Z ##[debug]workingDirectory=/opt/ads-agent/_work/r668/a
2026-10-30T18:37:07.7027133Z ##[debug]check path : /opt/ads-agent/_work/r668/a
2026-10-30T18:37:07.7027686Z ##[debug]targetType=inline
2026-10-30T18:37:07.7027910Z ##[debug]bashEnvValue=undefined
2026-10-30T18:37:07.7029172Z ##[debug]script=IS_SECURE=`env | grep _SECUREFILEPATH`

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

     oc get secret $secretName -n sihdg-hmp
     if [ "$?" -ne "1" ]; then
          echo "EXCLUINDO SECRET OKD"
          oc delete secret $secretName -n sihdg-hmp
     fi

     echo "CRIANDO SECRET OKD"
     oc create secret generic $secretName --from-file="$FILE_PATH" -n sihdg-hmp
     echo "oc create secret generic $secretName --from-file="$JKS_FILE" -n sihdg-hmp"

    if [[ -n "okd4_nprd" && ("okd4_nprd" =~ "okd4" || "okd4_nprd" =~ "ocp" || "okd4_nprd" =~ "openshift") ]]
    then
      app="sihdg-jboss8-hmp"
    else
      app="sihdg-jboss8-hmp-esteiras"
    fi
	 
     echo "SET VOLUME COM NOVA SECRET"
     oc set volume deploymentconfig "$app" --add --name=$secretName --secret-name=$secretName --mount-path=/opt/server/standalone/configuration/$JKS_FILE --sub-path=$JKS_FILE --overwrite -n sihdg-hmp

done 
fi
2026-10-30T18:37:07.7036889Z Generating script.
2026-10-30T18:37:07.7039139Z ##[debug]which 'bash'
2026-10-30T18:37:07.7046018Z ##[debug]found: '/usr/bin/bash'
2026-10-30T18:37:07.7046819Z ##[debug]Agent.Version=3.236.1
2026-10-30T18:37:07.7047417Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-10-30T18:37:07.7047673Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-10-30T18:37:07.7051575Z ========================== Starting Command Output ===========================
2026-10-30T18:37:07.7053540Z ##[debug]which '/usr/bin/bash'
2026-10-30T18:37:07.7054961Z ##[debug]found: '/usr/bin/bash'
2026-10-30T18:37:07.7055930Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/a4ff12a0-7960-4c5c-b61a-9a30b1d19a14.sh
2026-10-30T18:37:07.7058478Z ##[debug]exec tool: /usr/bin/bash
2026-10-30T18:37:07.7058701Z ##[debug]arguments:
2026-10-30T18:37:07.7058947Z ##[debug]   /opt/ads-agent/_work/_temp/a4ff12a0-7960-4c5c-b61a-9a30b1d19a14.sh
2026-10-30T18:37:07.7060382Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/a4ff12a0-7960-4c5c-b61a-9a30b1d19a14.sh
2026-10-30T18:37:07.7183430Z Variavel de ambiente com o certificado = CACERTIFICATE_SECUREFILEPATH=
2026-10-30T18:37:07.7199504Z Encontrado certificado = CACERTIFICATE_SECUREFILEPATH= com o PATH 
2026-10-30T18:37:07.7199671Z nome do arquivo final = CACERTIFICATE_SECUREFILEPATH=
2026-10-30T18:37:07.7229015Z nome da Secret Name = CACERTIFICATE-SECUREFILEPATH=
2026-10-30T18:37:07.7229145Z LOCALIZANDO SECRET OKD
2026-10-30T18:37:07.8026188Z Error from server (NotFound): secrets "CACERTIFICATE-SECUREFILEPATH=" not found
2026-10-30T18:37:07.8069063Z CRIANDO SECRET OKD
2026-10-30T18:37:07.8661661Z error: failed to create secret Secret "CACERTIFICATE-SECUREFILEPATH=" is invalid: metadata.name: Invalid value: "CACERTIFICATE-SECUREFILEPATH=": a lowercase RFC 1123 subdomain must consist of lower case alphanumeric characters, '-' or '.', and must start and end with an alphanumeric character (e.g. 'example.com', regex used for validation is '[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*')
2026-10-30T18:37:07.8691130Z oc create secret generic CACERTIFICATE-SECUREFILEPATH= --from-file=CACERTIFICATE_SECUREFILEPATH= -n sihdg-hmp
2026-10-30T18:37:07.8691307Z SET VOLUME COM NOVA SECRET
2026-10-30T18:37:07.9592822Z warning: volume "CACERTIFICATE-SECUREFILEPATH=" did not previously exist and was not overwritten. A new volume with this name has been created instead.error: failed to patch volume update to pod template: DeploymentConfig.apps.openshift.io "sihdg-jboss8-hmp" is invalid: [spec.template.spec.volumes[0].name: Invalid value: "CACERTIFICATE-SECUREFILEPATH=": a lowercase RFC 1123 label must consist of lower case alphanumeric characters or '-', and must start and end with an alphanumeric character (e.g. 'my-name',  or '123-abc', regex used for validation is '[a-z0-9]([-a-z0-9]*[a-z0-9])?'), spec.template.spec.containers[0].volumeMounts[0].name: Not found: "CACERTIFICATE-SECUREFILEPATH="]
2026-10-30T18:37:07.9638524Z ##[debug]Exit code 1 received from tool '/usr/bin/bash'
2026-10-30T18:37:07.9641745Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-10-30T18:37:07.9669157Z ##[error]Bash exited with code '1'.
2026-10-30T18:37:07.9669821Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '1'.
2026-10-30T18:37:07.9670312Z ##[debug]task result: Failed
2026-10-30T18:37:07.9671193Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-10-30T18:37:07.9683837Z ##[section]Finishing: Adicionando Multiplas Secrets
