2026-10-30T18:46:50.5034552Z ##[debug]Evaluating condition for step: 'Exportando as variáveis do arquivo Trust Store'
2026-10-30T18:46:50.5035538Z ##[debug]Evaluating: succeeded()
2026-10-30T18:46:50.5035788Z ##[debug]Evaluating succeeded:
2026-10-30T18:46:50.5036315Z ##[debug]=> True
2026-10-30T18:46:50.5036598Z ##[debug]Result: True
2026-10-30T18:46:50.5036845Z ##[section]Starting: Exportando as variáveis do arquivo Trust Store
2026-10-30T18:46:50.5042134Z ==============================================================================
2026-10-30T18:46:50.5042285Z Task         : Bash
2026-10-30T18:46:50.5042344Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-30T18:46:50.5042509Z Version      : 3.227.0
2026-10-30T18:46:50.5042569Z Author       : Microsoft Corporation
2026-10-30T18:46:50.5042637Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-30T18:46:50.5042769Z ==============================================================================
2026-10-30T18:46:50.6268278Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-10-30T18:46:50.6963643Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-10-30T18:46:50.6982464Z ##[debug]loading inputs and endpoints
2026-10-30T18:46:50.6989391Z ##[debug]loading INPUT_TARGETTYPE
2026-10-30T18:46:50.6997799Z ##[debug]loading INPUT_FILEPATH
2026-10-30T18:46:50.6998785Z ##[debug]loading INPUT_SCRIPT
2026-10-30T18:46:50.6999339Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-10-30T18:46:50.7000141Z ##[debug]loading INPUT_FAILONSTDERR
2026-10-30T18:46:50.7001129Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-10-30T18:46:50.7001536Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-10-30T18:46:50.7003641Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-10-30T18:46:50.7008502Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-10-30T18:46:50.7010111Z ##[debug]loading SECRET_AZPAT
2026-10-30T18:46:50.7011728Z ##[debug]loading SECRET_DATASOURCE_PASSWORD
2026-10-30T18:46:50.7013585Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-10-30T18:46:50.7015067Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-10-30T18:46:50.7016312Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-10-30T18:46:50.7016963Z ##[debug]loading SECRET_PW_ALOCAIP
2026-10-30T18:46:50.7017740Z ##[debug]loading SECRET_PW_ISILON
2026-10-30T18:46:50.7018300Z ##[debug]loading SECRET_TOKEN_CRQ
2026-10-30T18:46:50.7018959Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-10-30T18:46:50.7019580Z ##[debug]loading SECRET_FORTIFY_PASS
2026-10-30T18:46:50.7020878Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-10-30T18:46:50.7022286Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-10-30T18:46:50.7022864Z ##[debug]loading SECRET_PASSWORD_CGC
2026-10-30T18:46:50.7023474Z ##[debug]loaded 22
2026-10-30T18:46:50.7027637Z ##[debug]Agent.ProxyUrl=undefined
2026-10-30T18:46:50.7028065Z ##[debug]Agent.CAInfo=undefined
2026-10-30T18:46:50.7028384Z ##[debug]Agent.ClientCert=undefined
2026-10-30T18:46:50.7028737Z ##[debug]Agent.SkipCertValidation=True
2026-10-30T18:46:50.7042674Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-30T18:46:50.7044653Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-30T18:46:50.7045280Z ##[debug]system.culture=en-US
2026-10-30T18:46:50.7053000Z ##[debug]failOnStderr=false
2026-10-30T18:46:50.7054377Z ##[debug]workingDirectory=/opt/ads-agent/_work/r408/a
2026-10-30T18:46:50.7055176Z ##[debug]check path : /opt/ads-agent/_work/r408/a
2026-10-30T18:46:50.7055556Z ##[debug]targetType=inline
2026-10-30T18:46:50.7055865Z ##[debug]bashEnvValue=undefined
2026-10-30T18:46:50.7056654Z ##[debug]script=if [ -z "$DOWNLOADSECUREFILE_SECUREFILEPATH" ]; then
  download_path="$DOWNLOADSECUREFILE1_SECUREFILEPATH"
else
  download_path="$DOWNLOADSECUREFILE_SECUREFILEPATH"
fi

if [ -z "$download_path" ] || [ ! -f "$download_path" ]; then
  echo "##vso[task.logissue type=error]Secure file não encontrado. Verifique a task Download Secure File deste stage (reference name padrão DownloadSecureFile/DownloadSecureFile1, task habilitada e arquivo autorizado)."
  echo "Variáveis SECUREFILEPATH disponíveis:"
  env | grep -i securefilepath
  exit 1
fi

JKS_FILE=$(basename "$download_path")
JKS_FILE_PATH="$download_path"
echo "Secure file encontrado: $JKS_FILE_PATH"

echo "##vso[task.setvariable variable=JKS_FILE]$JKS_FILE"
echo "##vso[task.setvariable variable=JKS_FILE_PATH]$JKS_FILE_PATH"
echo "##vso[task.setvariable variable=caCertificate.secureFilePath]$JKS_FILE_PATH"
2026-10-30T18:46:50.7064914Z Generating script.
2026-10-30T18:46:50.7066963Z ##[debug]which 'bash'
2026-10-30T18:46:50.7072134Z ##[debug]found: '/usr/bin/bash'
2026-10-30T18:46:50.7072618Z ##[debug]Agent.Version=3.236.1
2026-10-30T18:46:50.7072913Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-10-30T18:46:50.7073262Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-10-30T18:46:50.7075843Z ========================== Starting Command Output ===========================
2026-10-30T18:46:50.7076891Z ##[debug]which '/usr/bin/bash'
2026-10-30T18:46:50.7077596Z ##[debug]found: '/usr/bin/bash'
2026-10-30T18:46:50.7078293Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/ffe811a9-e89d-4e3d-9080-c767090ccd19.sh
2026-10-30T18:46:50.7080773Z ##[debug]exec tool: /usr/bin/bash
2026-10-30T18:46:50.7081047Z ##[debug]arguments:
2026-10-30T18:46:50.7081395Z ##[debug]   /opt/ads-agent/_work/_temp/ffe811a9-e89d-4e3d-9080-c767090ccd19.sh
2026-10-30T18:46:50.7169925Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/ffe811a9-e89d-4e3d-9080-c767090ccd19.sh
2026-10-30T18:46:50.7189409Z ##[error]Secure file não encontrado. Verifique a task Download Secure File deste stage (reference name padrão DownloadSecureFile/DownloadSecureFile1, task habilitada e arquivo autorizado).
2026-10-30T18:46:50.7190578Z ##[debug]Processed: ##vso[task.logissue type=error]Secure file não encontrado. Verifique a task Download Secure File deste stage (reference name padrão DownloadSecureFile/DownloadSecureFile1, task habilitada e arquivo autorizado).
2026-10-30T18:46:50.7191314Z Variáveis SECUREFILEPATH disponíveis:
2026-10-30T18:46:50.7191638Z CACERTIFICATE_SECUREFILEPATH=/opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-10-30T18:46:50.7192133Z ##[debug]Exit code 1 received from tool '/usr/bin/bash'
2026-10-30T18:46:50.7192500Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-10-30T18:46:50.7192918Z ##[error]Bash exited with code '1'.
2026-10-30T18:46:50.7193231Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '1'.
2026-10-30T18:46:50.7193528Z ##[debug]task result: Failed
2026-10-30T18:46:50.7199075Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-10-30T18:46:50.7212418Z ##[section]Finishing: Exportando as variáveis do arquivo Trust Store
