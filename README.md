2026-11-11T13:22:40.5791987Z ##[debug]Evaluating condition for step: 'Verificando Status do Deployment'
2026-11-11T13:22:40.5792705Z ##[debug]Evaluating: succeeded()
2026-11-11T13:22:40.5792864Z ##[debug]Evaluating succeeded:
2026-11-11T13:22:40.5793155Z ##[debug]=> True
2026-11-11T13:22:40.5793317Z ##[debug]Result: True
2026-11-11T13:22:40.5793515Z ##[section]Starting: Verificando Status do Deployment
2026-11-11T13:22:40.5797473Z ==============================================================================
2026-11-11T13:22:40.5797572Z Task         : Bash
2026-11-11T13:22:40.5797620Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-11T13:22:40.5797692Z Version      : 3.227.0
2026-11-11T13:22:40.5797738Z Author       : Microsoft Corporation
2026-11-11T13:22:40.5797793Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-11T13:22:40.5797875Z ==============================================================================
2026-11-11T13:22:40.6367729Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-11-11T13:22:40.7094147Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-11-11T13:22:40.7101553Z ##[debug]loading inputs and endpoints
2026-11-11T13:22:40.7109388Z ##[debug]loading INPUT_TARGETTYPE
2026-11-11T13:22:40.7118195Z ##[debug]loading INPUT_FILEPATH
2026-11-11T13:22:40.7119348Z ##[debug]loading INPUT_SCRIPT
2026-11-11T13:22:40.7120368Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-11-11T13:22:40.7120911Z ##[debug]loading INPUT_FAILONSTDERR
2026-11-11T13:22:40.7121664Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-11-11T13:22:40.7123008Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-11-11T13:22:40.7125015Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-11-11T13:22:40.7130559Z ##[debug]loading SECRET_DATASOURCE_PASSWORD
2026-11-11T13:22:40.7132062Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-11-11T13:22:40.7133952Z ##[debug]loading SECRET_FORTIFY_PASS
2026-11-11T13:22:40.7136061Z ##[debug]loading SECRET_PW_ISILON
2026-11-11T13:22:40.7138089Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-11-11T13:22:40.7139915Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-11-11T13:22:40.7141092Z ##[debug]loading SECRET_OKD_4_TOKEN_APL
2026-11-11T13:22:40.7141989Z ##[debug]loading SECRET_TOKEN_CRQ
2026-11-11T13:22:40.7142729Z ##[debug]loading SECRET_AZPAT
2026-11-11T13:22:40.7143585Z ##[debug]loading SECRET_PASSWORD_CGC
2026-11-11T13:22:40.7144207Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-11-11T13:22:40.7145068Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-11-11T13:22:40.7147026Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-11-11T13:22:40.7147826Z ##[debug]loading SECRET_PASSWORD_TRUSTSTORE
2026-11-11T13:22:40.7148751Z ##[debug]loading SECRET_PW_ALOCAIP
2026-11-11T13:22:40.7149424Z ##[debug]loaded 23
2026-11-11T13:22:40.7156542Z ##[debug]Agent.ProxyUrl=undefined
2026-11-11T13:22:40.7157113Z ##[debug]Agent.CAInfo=undefined
2026-11-11T13:22:40.7157350Z ##[debug]Agent.ClientCert=undefined
2026-11-11T13:22:40.7157586Z ##[debug]Agent.SkipCertValidation=True
2026-11-11T13:22:40.7176746Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-11-11T13:22:40.7179408Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-11-11T13:22:40.7179762Z ##[debug]system.culture=en-US
2026-11-11T13:22:40.7191917Z ##[debug]failOnStderr=false
2026-11-11T13:22:40.7193756Z ##[debug]workingDirectory=/opt/ads-agent/_work/r46/a
2026-11-11T13:22:40.7194010Z ##[debug]check path : /opt/ads-agent/_work/r46/a
2026-11-11T13:22:40.7194635Z ##[debug]targetType=inline
2026-11-11T13:22:40.7194896Z ##[debug]bashEnvValue=undefined
2026-11-11T13:22:40.7196035Z ##[debug]script=if [[ -n "$SITE" && "$SITE" =~ (okd4|ocp|openshift) ]];
then
  app="sihdg-jboss8-prd"
else
  app="sihdg-jboss8-prd-esteiras"
fi

oc rollout status deploymentconfig/"$app"  --request-timeout=900 -n sihdg-prd
if [ "$?" -ne "0" ]; then
  echo "A aplicação não foi iniciada com sucesso!"
  echo "Os logs da aplicação estão disponíveis na próxima task: Logs da Aplicação"
  exit 1
fi
2026-11-11T13:22:40.7206265Z Generating script.
2026-11-11T13:22:40.7208156Z ##[debug]which 'bash'
2026-11-11T13:22:40.7213877Z ##[debug]found: '/usr/bin/bash'
2026-11-11T13:22:40.7214283Z ##[debug]Agent.Version=3.236.1
2026-11-11T13:22:40.7214696Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-11-11T13:22:40.7214955Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-11-11T13:22:40.7217794Z ========================== Starting Command Output ===========================
2026-11-11T13:22:40.7218806Z ##[debug]which '/usr/bin/bash'
2026-11-11T13:22:40.7219898Z ##[debug]found: '/usr/bin/bash'
2026-11-11T13:22:40.7220532Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/2efec255-3919-4fc3-b093-f70db7c2a8ab.sh
2026-11-11T13:22:40.7223081Z ##[debug]exec tool: /usr/bin/bash
2026-11-11T13:22:40.7223310Z ##[debug]arguments:
2026-11-11T13:22:40.7223553Z ##[debug]   /opt/ads-agent/_work/_temp/2efec255-3919-4fc3-b093-f70db7c2a8ab.sh
2026-11-11T13:22:40.7225523Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/2efec255-3919-4fc3-b093-f70db7c2a8ab.sh
2026-11-11T13:22:40.8362476Z Waiting for latest deployment config spec to be observed by the controller loop...
2026-11-11T13:22:42.2793199Z ##[debug]Agent environment resources - Disk: / Available 63503.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 19.15%
2026-11-11T13:22:47.2800163Z ##[debug]Agent environment resources - Disk: / Available 63503.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 17.11%
2026-11-11T13:22:52.2813906Z ##[debug]Agent environment resources - Disk: / Available 63503.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 15.44%
2026-11-11T13:22:57.2824957Z ##[debug]Agent environment resources - Disk: / Available 63503.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 14.11%
2026-11-11T13:23:02.2834306Z ##[debug]Agent environment resources - Disk: / Available 63503.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 12.97%
2026-11-11T13:23:07.2843509Z ##[debug]Agent environment resources - Disk: / Available 63495.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 12.01%
2026-11-11T13:23:12.2848862Z ##[debug]Agent environment resources - Disk: / Available 63495.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 11.18%
2026-11-11T13:23:17.2857250Z ##[debug]Agent environment resources - Disk: / Available 63495.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 10.47%
2026-11-11T13:23:22.2869246Z ##[debug]Agent environment resources - Disk: / Available 63495.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 9.83%
2026-11-11T13:23:27.2874307Z ##[debug]Agent environment resources - Disk: / Available 63495.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 9.30%
2026-11-11T13:23:32.2880698Z ##[debug]Agent environment resources - Disk: / Available 63495.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 8.83%
2026-11-11T13:23:37.2896130Z ##[debug]Agent environment resources - Disk: / Available 63495.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 8.39%
2026-11-11T13:23:42.2906175Z ##[debug]Agent environment resources - Disk: / Available 63495.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.99%
2026-11-11T13:23:47.2919812Z ##[debug]Agent environment resources - Disk: / Available 63495.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.63%
2026-11-11T13:23:52.2934151Z ##[debug]Agent environment resources - Disk: / Available 63495.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.30%
2026-11-11T13:23:57.2944155Z ##[debug]Agent environment resources - Disk: / Available 63463.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.02%
2026-11-11T13:24:02.2952991Z ##[debug]Agent environment resources - Disk: / Available 63463.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.73%
2026-11-11T13:24:07.2970403Z ##[debug]Agent environment resources - Disk: / Available 63463.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.48%
2026-11-11T13:24:12.2984374Z ##[debug]Agent environment resources - Disk: / Available 63463.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.25%
2026-11-11T13:24:17.2995378Z ##[debug]Agent environment resources - Disk: / Available 63463.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.02%
2026-11-11T13:24:22.3000969Z ##[debug]Agent environment resources - Disk: / Available 63463.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.81%
2026-11-11T13:24:27.3017132Z ##[debug]Agent environment resources - Disk: / Available 63463.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.63%
2026-11-11T13:24:32.3022331Z ##[debug]Agent environment resources - Disk: / Available 63463.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.46%
2026-11-11T13:24:37.3017720Z ##[debug]Agent environment resources - Disk: / Available 63463.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.29%
2026-11-11T13:24:42.3020541Z ##[debug]Agent environment resources - Disk: / Available 63455.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.13%
2026-11-11T13:24:47.3031285Z ##[debug]Agent environment resources - Disk: / Available 63455.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.99%
2026-11-11T13:24:52.3038303Z ##[debug]Agent environment resources - Disk: / Available 63455.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.85%
2026-11-11T13:24:57.3051583Z ##[debug]Agent environment resources - Disk: / Available 63465.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.71%
2026-11-11T13:25:02.3063941Z ##[debug]Agent environment resources - Disk: / Available 63464.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.59%
2026-11-11T13:25:07.3068372Z ##[debug]Agent environment resources - Disk: / Available 63464.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.47%
2026-11-11T13:25:12.3074570Z ##[debug]Agent environment resources - Disk: / Available 63464.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.36%
2026-11-11T13:25:17.3086047Z ##[debug]Agent environment resources - Disk: / Available 63464.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.26%
2026-11-11T13:25:22.3096312Z ##[debug]Agent environment resources - Disk: / Available 63464.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.16%
2026-11-11T13:25:27.3103082Z ##[debug]Agent environment resources - Disk: / Available 63464.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.07%
2026-11-11T13:25:32.3110873Z ##[debug]Agent environment resources - Disk: / Available 63464.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.97%
2026-11-11T13:25:37.3118527Z ##[debug]Agent environment resources - Disk: / Available 63464.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.89%
2026-11-11T13:25:42.3122217Z ##[debug]Agent environment resources - Disk: / Available 63456.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.80%
2026-11-11T13:25:47.3120640Z ##[debug]Agent environment resources - Disk: / Available 63455.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.72%
2026-11-11T13:25:52.3132194Z ##[debug]Agent environment resources - Disk: / Available 63455.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.65%
2026-11-11T13:25:57.3140809Z ##[debug]Agent environment resources - Disk: / Available 63455.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.57%
2026-11-11T13:26:02.3152951Z ##[debug]Agent environment resources - Disk: / Available 63455.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.50%
2026-11-11T13:26:07.3175357Z ##[debug]Agent environment resources - Disk: / Available 63455.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.44%
2026-11-11T13:26:12.3181908Z ##[debug]Agent environment resources - Disk: / Available 63455.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.37%
2026-11-11T13:26:17.3197488Z ##[debug]Agent environment resources - Disk: / Available 63455.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.31%
2026-11-11T13:26:22.3206148Z ##[debug]Agent environment resources - Disk: / Available 63455.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.25%
2026-11-11T13:26:27.3213955Z ##[debug]Agent environment resources - Disk: / Available 63451.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.19%
2026-11-11T13:26:32.3224397Z ##[debug]Agent environment resources - Disk: / Available 63451.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.14%
2026-11-11T13:26:37.3230589Z ##[debug]Agent environment resources - Disk: / Available 63451.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.09%
2026-11-11T13:26:42.3240812Z ##[debug]Agent environment resources - Disk: / Available 63450.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.04%
2026-11-11T13:26:47.3249288Z ##[debug]Agent environment resources - Disk: / Available 63450.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.99%
2026-11-11T13:26:52.3264968Z ##[debug]Agent environment resources - Disk: / Available 63570.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.94%
2026-11-11T13:26:57.3265554Z ##[debug]Agent environment resources - Disk: / Available 63570.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.89%
2026-11-11T13:27:02.3269351Z ##[debug]Agent environment resources - Disk: / Available 63570.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.85%
2026-11-11T13:27:07.3278345Z ##[debug]Agent environment resources - Disk: / Available 63570.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.81%
2026-11-11T13:27:12.3282910Z ##[debug]Agent environment resources - Disk: / Available 63562.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.76%
2026-11-11T13:27:17.3305601Z ##[debug]Agent environment resources - Disk: / Available 63562.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.72%
2026-11-11T13:27:22.3311758Z ##[debug]Agent environment resources - Disk: / Available 63562.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.68%
2026-11-11T13:27:27.3318735Z ##[debug]Agent environment resources - Disk: / Available 63562.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.65%
2026-11-11T13:27:32.3319935Z ##[debug]Agent environment resources - Disk: / Available 63562.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.61%
2026-11-11T13:27:37.3333419Z ##[debug]Agent environment resources - Disk: / Available 63563.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.57%
2026-11-11T13:27:42.3341329Z ##[debug]Agent environment resources - Disk: / Available 63563.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.53%
2026-11-11T13:27:47.3352636Z ##[debug]Agent environment resources - Disk: / Available 63563.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.50%
2026-11-11T13:27:52.3359987Z ##[debug]Agent environment resources - Disk: / Available 63563.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.47%
2026-11-11T13:27:57.3369964Z ##[debug]Agent environment resources - Disk: / Available 63563.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.44%
2026-11-11T13:28:02.3382996Z ##[debug]Agent environment resources - Disk: / Available 63555.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.41%
2026-11-11T13:28:07.3376974Z ##[debug]Agent environment resources - Disk: / Available 63555.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.38%
2026-11-11T13:28:12.3380717Z ##[debug]Agent environment resources - Disk: / Available 63555.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.35%
2026-11-11T13:28:17.3397649Z ##[debug]Agent environment resources - Disk: / Available 63555.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.32%
2026-11-11T13:28:22.3399681Z ##[debug]Agent environment resources - Disk: / Available 63555.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.29%
2026-11-11T13:28:27.3423040Z ##[debug]Agent environment resources - Disk: / Available 63555.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.27%
2026-11-11T13:28:32.3430469Z ##[debug]Agent environment resources - Disk: / Available 63555.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.24%
2026-11-11T13:28:37.3442805Z ##[debug]Agent environment resources - Disk: / Available 63555.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.22%
2026-11-11T13:28:40.5835667Z ##[debug]Started cancellation of executing script
2026-11-11T13:28:40.5843516Z ##[debug]Exit code null received from tool '/usr/bin/bash'
2026-11-11T13:28:48.0913797Z ##[error]The task has timed out.
2026-11-11T13:28:48.0915382Z ##[section]Finishing: Verificando Status do Deployment



2026-11-11T13:28:48.0936220Z ##[debug]Evaluating condition for step: 'Logs da Aplicação'
2026-11-11T13:28:48.0937372Z ##[debug]Evaluating: always()
2026-11-11T13:28:48.0937522Z ##[debug]Evaluating always:
2026-11-11T13:28:48.0938653Z ##[debug]=> True
2026-11-11T13:28:48.0938880Z ##[debug]Result: True
2026-11-11T13:28:48.0939055Z ##[section]Starting: Logs da Aplicação
2026-11-11T13:28:48.0943398Z ==============================================================================
2026-11-11T13:28:48.0943530Z Task         : Bash
2026-11-11T13:28:48.0943604Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-11T13:28:48.0943727Z Version      : 3.227.0
2026-11-11T13:28:48.0943800Z Author       : Microsoft Corporation
2026-11-11T13:28:48.0943895Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-11T13:28:48.0944047Z ==============================================================================
2026-11-11T13:28:48.1632622Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-11-11T13:28:48.2365834Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-11-11T13:28:48.2374569Z ##[debug]loading inputs and endpoints
2026-11-11T13:28:48.2382728Z ##[debug]loading INPUT_TARGETTYPE
2026-11-11T13:28:48.2391140Z ##[debug]loading INPUT_FILEPATH
2026-11-11T13:28:48.2392276Z ##[debug]loading INPUT_SCRIPT
2026-11-11T13:28:48.2393579Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-11-11T13:28:48.2394288Z ##[debug]loading INPUT_FAILONSTDERR
2026-11-11T13:28:48.2395123Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-11-11T13:28:48.2395798Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-11-11T13:28:48.2398147Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-11-11T13:28:48.2403691Z ##[debug]loading SECRET_DATASOURCE_PASSWORD
2026-11-11T13:28:48.2404941Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-11-11T13:28:48.2406624Z ##[debug]loading SECRET_FORTIFY_PASS
2026-11-11T13:28:48.2408603Z ##[debug]loading SECRET_PW_ISILON
2026-11-11T13:28:48.2410240Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-11-11T13:28:48.2411931Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-11-11T13:28:48.2412533Z ##[debug]loading SECRET_OKD_4_TOKEN_APL
2026-11-11T13:28:48.2413220Z ##[debug]loading SECRET_TOKEN_CRQ
2026-11-11T13:28:48.2413782Z ##[debug]loading SECRET_AZPAT
2026-11-11T13:28:48.2414477Z ##[debug]loading SECRET_PASSWORD_CGC
2026-11-11T13:28:48.2416434Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-11-11T13:28:48.2416783Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-11-11T13:28:48.2417691Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-11-11T13:28:48.2418114Z ##[debug]loading SECRET_PASSWORD_TRUSTSTORE
2026-11-11T13:28:48.2418531Z ##[debug]loading SECRET_PW_ALOCAIP
2026-11-11T13:28:48.2419094Z ##[debug]loaded 23
2026-11-11T13:28:48.2425815Z ##[debug]Agent.ProxyUrl=undefined
2026-11-11T13:28:48.2426113Z ##[debug]Agent.CAInfo=undefined
2026-11-11T13:28:48.2426357Z ##[debug]Agent.ClientCert=undefined
2026-11-11T13:28:48.2426579Z ##[debug]Agent.SkipCertValidation=True
2026-11-11T13:28:48.2442690Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-11-11T13:28:48.2444159Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-11-11T13:28:48.2444528Z ##[debug]system.culture=en-US
2026-11-11T13:28:48.2455487Z ##[debug]failOnStderr=false
2026-11-11T13:28:48.2457029Z ##[debug]workingDirectory=/opt/ads-agent/_work/r46/a
2026-11-11T13:28:48.2457505Z ##[debug]check path : /opt/ads-agent/_work/r46/a
2026-11-11T13:28:48.2457902Z ##[debug]targetType=inline
2026-11-11T13:28:48.2458284Z ##[debug]bashEnvValue=undefined
2026-11-11T13:28:48.2459181Z ##[debug]script=#!/bin/bash
set -o errexit
set -o pipefail
set -x

shopt -s expand_aliases

if [[ -n "$SITE" && "okd4_prd" =~ "ocp" ]]
then
  app="sihdg-jboss8-prd"

  arquivo="/usr/local/bin/oc-v4.13"
  if [ -e "$arquivo" ]; then 
    alias oc="$arquivo"
  fi
elif [[ -n "$SITE" && "$SITE" =~ (okd4|openshift) ]];
then
app="sihdg-jboss8-prd"
else
  app="sihdg-jboss8-prd-esteiras"
fi

oc version

last_pod=$(oc get pod -l name="$app" -n sihdg-prd -o jsonpath='{range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp  | tac | grep -v '^$' | head -n1)

echo "Logs do POD: $last_pod"
oc logs $last_pod -c "$app" -n sihdg-prd
2026-11-11T13:28:48.2468869Z Generating script.
2026-11-11T13:28:48.2472063Z ##[debug]which 'bash'
2026-11-11T13:28:48.2476595Z ##[debug]found: '/usr/bin/bash'
2026-11-11T13:28:48.2477321Z ##[debug]Agent.Version=3.236.1
2026-11-11T13:28:48.2477585Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-11-11T13:28:48.2477833Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-11-11T13:28:48.2481061Z ========================== Starting Command Output ===========================
2026-11-11T13:28:48.2482361Z ##[debug]which '/usr/bin/bash'
2026-11-11T13:28:48.2483169Z ##[debug]found: '/usr/bin/bash'
2026-11-11T13:28:48.2483880Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/d0663a63-684b-47fe-9b32-6c50983bbc31.sh
2026-11-11T13:28:48.2486387Z ##[debug]exec tool: /usr/bin/bash
2026-11-11T13:28:48.2486625Z ##[debug]arguments:
2026-11-11T13:28:48.2486873Z ##[debug]   /opt/ads-agent/_work/_temp/d0663a63-684b-47fe-9b32-6c50983bbc31.sh
2026-11-11T13:28:48.2488657Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/d0663a63-684b-47fe-9b32-6c50983bbc31.sh
2026-11-11T13:28:48.2558549Z + shopt -s expand_aliases
2026-11-11T13:28:48.2558819Z + [[ -n okd4_prd ]]
2026-11-11T13:28:48.2558946Z + [[ okd4_prd =~ ocp ]]
2026-11-11T13:28:48.2559078Z + [[ -n okd4_prd ]]
2026-11-11T13:28:48.2559180Z + [[ okd4_prd =~ (okd4|openshift) ]]
2026-11-11T13:28:48.2559329Z + app=sihdg-jboss8-prd
2026-11-11T13:28:48.2559521Z + oc version
2026-11-11T13:28:48.3410104Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-11-11T13:28:48.3410690Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-11-11T13:28:48.3411019Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-11-11T13:28:48.3451208Z ++ oc get pod -l name=sihdg-jboss8-prd -n sihdg-prd -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-11-11T13:28:48.3451823Z ++ tac
2026-11-11T13:28:48.3452032Z ++ grep -v '^$'
2026-11-11T13:28:48.3452195Z ++ head -n1
2026-11-11T13:28:48.4560703Z + last_pod=sihdg-jboss8-prd-4-wpkgq
2026-11-11T13:28:48.4560957Z + echo 'Logs do POD: sihdg-jboss8-prd-4-wpkgq'
2026-11-11T13:28:48.4561174Z + oc logs sihdg-jboss8-prd-4-wpkgq -c sihdg-jboss8-prd -n sihdg-prd
2026-11-11T13:28:48.4561361Z Logs do POD: sihdg-jboss8-prd-4-wpkgq
2026-11-11T13:28:48.5498165Z Using openshift launcher.
2026-11-11T13:28:48.5498708Z 2026-11-11 13:28:41 Launching WildFly Server
2026-11-11T13:28:48.5498863Z INFO Access log is disabled, ignoring configuration.
2026-11-11T13:28:48.5499021Z INFO Clustering feature is not enabled, no jgroups subsystem present in server configuration.
2026-11-11T13:28:48.5499192Z INFO Server started in admin mode, CLI script executed during server boot.
2026-11-11T13:28:48.5499584Z INFO Running jboss-eap-8/eap8-openjdk21-builder-openshift-rhel9 image, version 1.0.1.GA
2026-11-11T13:28:48.5500388Z JAVA_OPTS already set in environment; overriding default settings with values:  -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider -Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore_v8.jks -Djava.security.properties=/opt/server/bin/java.security.override -Djava.security.disableSystemPropertiesFile=true
2026-11-11T13:28:48.5500876Z =========================================================================
2026-11-11T13:28:48.5500953Z 
2026-11-11T13:28:48.5501054Z   JBoss Bootstrap Environment
2026-11-11T13:28:48.5501108Z 
2026-11-11T13:28:48.5501199Z   JBOSS_HOME: /opt/server
2026-11-11T13:28:48.5501590Z 
2026-11-11T13:28:48.5501736Z   JAVA: /usr/lib/jvm/java-21/bin/java
2026-11-11T13:28:48.5501800Z 
2026-11-11T13:28:48.5503484Z   JAVA_OPTS:  -Xlog:gc*:file="/opt/server/standalone/log/gc.log":time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter="maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000"  -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider -Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore_v8.jks -Djava.security.properties=/opt/server/bin/java.security.override -Djava.security.disableSystemPropertiesFile=true  --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-exports=jdk.naming.dns/com.sun.jndi.dns=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED
2026-11-11T13:28:48.5504434Z 
2026-11-11T13:28:48.5504561Z =========================================================================
2026-11-11T13:28:48.5504627Z 
2026-11-11T13:28:48.5504847Z [0m10:28:43,209 INFO  [org.jboss.modules] (main) JBoss Modules version 2.1.6.Final-redhat-00001
2026-11-11T13:28:48.5505131Z [0m[0m10:28:44,011 INFO  [org.jboss.msc] (main) JBoss MSC version 1.5.5.Final-redhat-00001
2026-11-11T13:28:48.5505445Z [0m[0m10:28:44,017 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
2026-11-11T13:28:48.5505753Z [0m[0m10:28:44,191 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) starting
2026-11-11T13:28:48.5506044Z [0m[32m10:28:44,193 DEBUG [org.jboss.as.config] (MSC service thread 1-2) Configured system properties:
2026-11-11T13:28:48.5506190Z 	[Standalone] = 
2026-11-11T13:28:48.5506297Z 	file.encoding = UTF-8
2026-11-11T13:28:48.5506402Z 	file.separator = /
2026-11-11T13:28:48.5506570Z 	java.class.path = /opt/server/jboss-modules.jar
2026-11-11T13:28:48.5506690Z 	java.class.version = 65.0
2026-11-11T13:28:48.5506883Z 	java.home = /usr/lib/jvm/java-21-openjdk-21.0.10.0.7-1.el9.x86_64
2026-11-11T13:28:48.5507017Z 	java.io.tmpdir = /tmp
2026-11-11T13:28:48.5507152Z 	java.library.path = /usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib
2026-11-11T13:28:48.5507291Z 	java.net.preferIPv4Stack = true
2026-11-11T13:28:48.5507409Z 	java.runtime.name = OpenJDK Runtime Environment
2026-11-11T13:28:48.5507532Z 	java.runtime.version = 21.0.10+7-LTS
2026-11-11T13:28:48.5507661Z 	java.security.disableSystemPropertiesFile = true
2026-11-11T13:28:48.5507787Z 	java.security.egd = file:/dev/./urandom
2026-11-11T13:28:48.5507926Z 	java.security.properties = /opt/server/bin/java.security.override
2026-11-11T13:28:48.5508064Z 	java.specification.name = Java Platform API Specification
2026-11-11T13:28:48.5508202Z 	java.specification.vendor = Oracle Corporation
2026-11-11T13:28:48.5508324Z 	java.specification.version = 21
2026-11-11T13:28:48.5508458Z 	java.util.logging.manager = org.jboss.logmanager.LogManager
2026-11-11T13:28:48.5508625Z 	java.vendor = Red Hat, Inc.
2026-11-11T13:28:48.5508745Z 	java.vendor.url = https://www.redhat.com/
2026-11-11T13:28:48.5508881Z 	java.vendor.url.bug = https://access.redhat.com/support/cases/
2026-11-11T13:28:48.5509060Z 	java.vendor.version = (Red_Hat-21.0.10.0.7-1)
2026-11-11T13:28:48.5509227Z 	java.version = 21.0.10
2026-11-11T13:28:48.5509385Z 	java.version.date = 2026-01-20
2026-11-11T13:28:48.5509667Z 	java.vm.compressedOopsMode = 32-bit
2026-11-11T13:28:48.5509789Z 	java.vm.info = mixed mode, sharing
2026-11-11T13:28:48.5509949Z 	java.vm.name = OpenJDK 64-Bit Server VM
2026-11-11T13:28:48.5510087Z 	java.vm.specification.name = Java Virtual Machine Specification
2026-11-11T13:28:48.5510233Z 	java.vm.specification.vendor = Oracle Corporation
2026-11-11T13:28:48.5510357Z 	java.vm.specification.version = 21
2026-11-11T13:28:48.5510473Z 	java.vm.vendor = Red Hat, Inc.
2026-11-11T13:28:48.5510578Z 	java.vm.version = 21.0.10+7-LTS
2026-11-11T13:28:48.5510717Z 	javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
2026-11-11T13:28:48.5511023Z 	javax.net.ssl.trustStore = /opt/server/standalone/configuration/caixa-truststore_v8.jks
2026-11-11T13:28:48.5511168Z 	jboss.bind.address = 25.3.32.49
2026-11-11T13:28:48.5511336Z 	jboss.bind.address.management = 0.0.0.0
2026-11-11T13:28:48.5511455Z 	jboss.bind.address.private = 25.3.32.49
2026-11-11T13:28:48.5511570Z 	jboss.home.dir = /opt/server
2026-11-11T13:28:48.5511736Z 	jboss.host.name = sihdg-jboss8-prd-4-wpkgq
2026-11-11T13:28:48.5511873Z 	jboss.messaging.cluster.password = <redacted>
2026-11-11T13:28:48.5511999Z 	jboss.messaging.host = 25.3.32.49
2026-11-11T13:28:48.5512132Z 	jboss.modules.system.pkgs = jdk.nashorn.api,com.sun.crypto.provider
2026-11-11T13:28:48.5512308Z 	jboss.node.name = sihdg-jboss8-prd-4-wpkgq
2026-11-11T13:28:48.5512487Z 	jboss.qualified.host.name = sihdg-jboss8-prd-4-wpkgq
2026-11-11T13:28:48.5512621Z 	jboss.server.base.dir = /opt/server/standalone
2026-11-11T13:28:48.5512758Z 	jboss.server.config.dir = /opt/server/standalone/configuration
2026-11-11T13:28:48.5512896Z 	jboss.server.data.dir = /opt/server/standalone/data
2026-11-11T13:28:48.5513021Z 	jboss.server.log.dir = /opt/server/standalone/log
2026-11-11T13:28:48.5513195Z 	jboss.server.name = sihdg-jboss8-prd-4-wpkgq
2026-11-11T13:28:48.5513320Z 	jboss.server.persist.config = true
2026-11-11T13:28:48.5513442Z 	jboss.server.temp.dir = /opt/server/standalone/tmp
2026-11-11T13:28:48.5513613Z 	jboss.tx.node.id = ihdg-jboss8-prd-4-wpkgq
2026-11-11T13:28:48.5513719Z 	jdk.debug = release
2026-11-11T13:28:48.5513855Z 	jdk.serialFilter = maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
2026-11-11T13:28:48.5513985Z 	line.separator = 
2026-11-11T13:28:48.5514027Z 
2026-11-11T13:28:48.5514157Z 	logging.configuration = file:/opt/server/standalone/configuration/logging.properties
2026-11-11T13:28:48.5514299Z 	module.path = /opt/server/modules
2026-11-11T13:28:48.5514433Z 	native.encoding = ANSI_X3.4-1968
2026-11-11T13:28:48.5514613Z 	org.jboss.boot.log.file = /opt/server/standalone/log/server.log
2026-11-11T13:28:48.5514741Z 	org.jboss.resolver.warning = true
2026-11-11T13:28:48.5515119Z 	org.wildfly.internal.cli.boot.hook.marker.dir = /tmp/cli-boot-reload-marker-1794403722
2026-11-11T13:28:48.5515399Z 	org.wildfly.internal.cli.boot.hook.script = /tmp/cli-script-1794403721.cli
2026-11-11T13:28:48.5515638Z 	org.wildfly.internal.cli.boot.hook.script.error.file = /tmp/cli-script-error-1794403721.cli
2026-11-11T13:28:48.5515886Z 	org.wildfly.internal.cli.boot.hook.script.output.file = /tmp/cli-script-output-1794403721.cli
2026-11-11T13:28:48.5516129Z 	org.wildfly.internal.cli.boot.hook.script.properties = /tmp/cli-script-property-1794403721.cli
2026-11-11T13:28:48.5516359Z 	org.wildfly.internal.cli.boot.hook.script.warn.file = /tmp/cli-warning-1794403721.log
2026-11-11T13:28:48.5516496Z 	os.arch = amd64
2026-11-11T13:28:48.5516596Z 	os.name = Linux
2026-11-11T13:28:48.5516817Z 	os.version = 6.1.18-200.fc37.x86_64
2026-11-11T13:28:48.5516936Z 	path.separator = :
2026-11-11T13:28:48.5517058Z 	stderr.encoding = ANSI_X3.4-1968
2026-11-11T13:28:48.5517242Z 	stdout.encoding = ANSI_X3.4-1968
2026-11-11T13:28:48.5517357Z 	sun.arch.data.model = 64
2026-11-11T13:28:48.5517563Z 	sun.boot.library.path = /usr/lib/jvm/java-21-openjdk-21.0.10.0.7-1.el9.x86_64/lib
2026-11-11T13:28:48.5517762Z 	sun.cpu.endian = little
2026-11-11T13:28:48.5517872Z 	sun.io.unicode.encoding = UnicodeLittle
2026-11-11T13:28:48.5518971Z 	sun.java.command = /opt/server/jboss-modules.jar -mp /opt/server/modules org.jboss.as.standalone -Djboss.home.dir=/opt/server -Djboss.server.base.dir=/opt/server/standalone -c standalone.xml -Djboss.messaging.host=25.3.32.49 -Djboss.messaging.cluster.password=<redacted> --start-mode=admin-only -Dorg.wildfly.internal.cli.boot.hook.script=/tmp/cli-script-1794403721.cli -Dorg.wildfly.internal.cli.boot.hook.marker.dir=/tmp/cli-boot-reload-marker-1794403722 -Dorg.wildfly.internal.cli.boot.hook.script.properties=/tmp/cli-script-property-1794403721.cli -Dorg.wildfly.internal.cli.boot.hook.script.error.file=/tmp/cli-script-error-1794403721.cli -Dorg.wildfly.internal.cli.boot.hook.script.warn.file=/tmp/cli-warning-1794403721.log -Dorg.wildfly.internal.cli.boot.hook.script.output.file=/tmp/cli-script-output-1794403721.cli -Djboss.node.name=sihdg-jboss8-prd-4-wpkgq -Djboss.tx.node.id=ihdg-jboss8-prd-4-wpkgq -bprivate 25.3.32.49 -b 25.3.32.49 -bmanagement 0.0.0.0 -Dwildfly.statistics-enabled=true
2026-11-11T13:28:48.5519646Z 	sun.java.launcher = SUN_STANDARD
2026-11-11T13:28:48.5519789Z 	sun.jnu.encoding = ANSI_X3.4-1968
2026-11-11T13:28:48.5519963Z 	sun.management.compiler = HotSpot 64-Bit Tiered Compilers
2026-11-11T13:28:48.5520084Z 	user.country = US
2026-11-11T13:28:48.5520239Z 	user.dir = /home/jboss
2026-11-11T13:28:48.5520346Z 	user.home = /home/jboss
2026-11-11T13:28:48.5520450Z 	user.language = en
2026-11-11T13:28:48.5520544Z 	user.name = jboss
2026-11-11T13:28:48.5520651Z 	user.timezone = America/Sao_Paulo
2026-11-11T13:28:48.5520809Z 	wildfly.statistics-enabled = true
2026-11-11T13:28:48.5522823Z [0m[32m10:28:44,194 DEBUG [org.jboss.as.config] (MSC service thread 1-2) VM Arguments: -D[Standalone] -Xlog:gc*:file=/opt/server/standalone/log/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider -Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore_v8.jks -Djava.security.properties=/opt/server/bin/java.security.override -Djava.security.disableSystemPropertiesFile=true --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-exports=jdk.naming.dns/com.sun.jndi.dns=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/opt/server/standalone/log/server.log -Dlogging.configuration=file:/opt/server/standalone/configuration/logging.properties 
2026-11-11T13:28:48.5524080Z [0m[0m10:28:45,501 INFO  [org.wildfly.security] (ServerService Thread Pool -- 16) ELY00001: WildFly Elytron version 2.2.14.Final-redhat-00001
2026-11-11T13:28:48.5524404Z [0m[0m10:28:46,704 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
2026-11-11T13:28:48.5524688Z [0m[0m10:28:46,776 INFO  [org.xnio] (MSC service thread 1-2) XNIO version 3.8.16.Final-redhat-00001
2026-11-11T13:28:48.5524960Z [0m[0m10:28:46,781 INFO  [org.xnio.nio] (MSC service thread 1-2) XNIO NIO Implementation Version 3.8.16.Final-redhat-00001
2026-11-11T13:28:48.5525487Z [0m[33m10:28:46,880 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY00023: KeyStore file '/opt/server/standalone/configuration/application.keystore' does not exist. Used blank.
2026-11-11T13:28:48.5525854Z [0m[0m10:28:46,883 INFO  [org.jboss.remoting] (MSC service thread 1-1) JBoss Remoting version 5.0.31.Final-redhat-00001
2026-11-11T13:28:48.5526267Z [0m[33m10:28:46,891 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY01084: KeyStore /opt/server/standalone/configuration/application.keystore not found, it will be auto-generated on first use with a self-signed certificate for host localhost
2026-11-11T13:28:48.5526657Z [0m[0m10:28:47,211 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
2026-11-11T13:28:48.5526982Z [0m[0m10:28:47,214 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://0.0.0.0:9990/management
2026-11-11T13:28:48.5527273Z [0m[0m10:28:47,214 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0054: Admin console is not enabled
2026-11-11T13:28:48.5527704Z [0m[0m10:28:47,214 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) started in 4436ms - Started 72 of 84 services (26 services are lazy, passive or on-demand) - Server configuration file in use: standalone.xml
2026-11-11T13:28:48.5528166Z [0m[0m10:28:47,215 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0472: Checking for presence of marker file indicating that the server has been restarted following execution of the additional commands from the CLI script
2026-11-11T13:28:48.5528587Z [0m[0m10:28:47,215 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0474: No marker file found indicating that the server has been restarted following execution of the additional commands from the CLI script
2026-11-11T13:28:48.5529120Z [0m[0m10:28:47,215 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0466: Initialised the additional boot CLI script functionality. The CLI commands will be read from /tmp/cli-script-1794403721.cli. The server will be rebooted to normal mode after these have been executed
2026-11-11T13:28:48.5529696Z [0m[0m10:28:47,281 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0467: Running the additional commands from the CLI script /tmp/cli-script-1794403721.cli against the server which is running in admin-only mode
2026-11-11T13:28:48.5530056Z [0m[0m10:28:47,282 INFO  [org.jboss.as.cli] (Controller Boot Thread) WFLYCLI0001: Processing CLI script /tmp/cli-script-1794403721.cli
2026-11-11T13:28:48.5530405Z [0m[0m10:28:47,775 INFO  [org.jboss.as.cli] (Controller Boot Thread) WFLYCLI0005: Done processing CLI script /tmp/cli-script-1794403721.cli
2026-11-11T13:28:48.5530705Z [0m[0m10:28:47,775 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0468: Completed running the commands from the CLI script
2026-11-11T13:28:48.5531363Z [0m[0m10:28:47,775 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0470: Reloading the server to normal mode after execution of the additional commands from the CLI script. This will clear the properties triggering the additional boot cli script functionality if they were set (org.wildfly.internal.cli.boot.hook.script, org.wildfly.internal.cli.boot.hook.reload.skip, org.wildfly.internal.cli.boot.hook.marker.dir), and delete the marker file indicating the server was restarted
2026-11-11T13:28:48.5531964Z [0m[0m10:28:47,789 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0050: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) stopped in 11ms
2026-11-11T13:28:48.5532296Z [0m[0m10:28:47,790 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) starting
2026-11-11T13:28:48.5532575Z [0m[32m10:28:47,790 DEBUG [org.jboss.as.config] (MSC service thread 1-2) Configured system properties:
2026-11-11T13:28:48.5532809Z 	SIHDG-DB_INTERNO = true
2026-11-11T13:28:48.5533006Z 	SIHDG-MAIL_ENDERECO = gegap@caixa.gov.br
2026-11-11T13:28:48.5533224Z 	SIHDG-MAIL_ORDEM_ALTERACAO = GETES@CAIXA.GOV.BR,GETES03@CAIXA.GOV.BR,GEGAP@CAIXA.GOV.BR
2026-11-11T13:28:48.5533460Z 	SIHDG-MAIL_ORDEM_CANCELAMENTO = GETES@CAIXA.GOV.BR,GETES03@CAIXA.GOV.BR,GEGAP@CAIXA.GOV.BR
2026-11-11T13:28:48.5533688Z 	SIHDG-MAIL_ORDEM_EXECUCAO = GEGAP@CAIXA.GOV.BR,GETES03@CAIXA.GOV.BR,GEGAP05@CAIXA.GOV.BR
2026-11-11T13:28:48.5533923Z 	SIHDG-MAIL_ORDEM_INSERCAO = GETES@CAIXA.GOV.BR,GETES03@CAIXA.GOV.BR,GEGAP@CAIXA.GOV.BR
2026-11-11T13:28:48.5534156Z 	SIHDG-MAIL_ORDEM_INVALIDACAO = GETES@CAIXA.GOV.BR,GETES03@CAIXA.GOV.BR,GEGAP@CAIXA.GOV.BR
2026-11-11T13:28:48.5534390Z 	SIHDG-MAIL_REGISTRO_EFETIVIDADE = GEMOR@CAIXA.GOV.BR,GERIM@CAIXA.GOV.BR,GEGAP@CAIXA.GOV.BR
2026-11-11T13:28:48.5534571Z 	SIHDG-SEC_TEMPO_VIDA_TOKEN = 5
2026-11-11T13:28:48.5534810Z 	SIHDG-classificacao.informacao = #INTERNO.CONFIDENCIAL
2026-11-11T13:28:48.5535080Z 	SIHDG-derivativo.avaliacao.remetente = GEGAP
2026-11-11T13:28:48.5535368Z 	SIHDG-mail.avaliacao.derivativo = GETES@CAIXA.GOV.BR,GETES03@CAIXA.GOV.BR,GEGAP@CAIXA.GOV.BR
2026-11-11T13:28:48.5535569Z 	SIHDG-mail.endereco = gegap@caixa.gov.br
2026-11-11T13:28:48.5535789Z 	SIHDG-mail.ordem.alteracao = GETES@CAIXA.GOV.BR,GETES03@CAIXA.GOV.BR,GEGAP@CAIXA.GOV.BR
2026-11-11T13:28:48.5536028Z 	SIHDG-mail.ordem.cancelamento = GETES@CAIXA.GOV.BR,GETES03@CAIXA.GOV.BR,GEGAP@CAIXA.GOV.BR
2026-11-11T13:28:48.5536270Z 	SIHDG-mail.ordem.execucao = GEGAP@CAIXA.GOV.BR,GETES03@CAIXA.GOV.BR,GEGAP05@CAIXA.GOV.BR
2026-11-11T13:28:48.5536493Z 	SIHDG-mail.ordem.insercao = GETES@CAIXA.GOV.BR,GETES03@CAIXA.GOV.BR,GEGAP@CAIXA.GOV.BR
2026-11-11T13:28:48.5536725Z 	SIHDG-mail.ordem.invalidacao = GETES@CAIXA.GOV.BR,GETES03@CAIXA.GOV.BR,GEGAP@CAIXA.GOV.BR
2026-11-11T13:28:48.5536960Z 	SIHDG-mail.registro.efetividade = GEMOR@CAIXA.GOV.BR,GERIM@CAIXA.GOV.BR,GEGAP@CAIXA.GOV.BR
2026-11-11T13:28:48.5537162Z 	SIHDG-mail.smtp.host = sistemas.correiolivre.caixa
2026-11-11T13:28:48.5537323Z 	SIHDG-mail.smtp.port = 25
2026-11-11T13:28:48.5537480Z 	SIHDG-ordem.alteracao.remetente = GEGAP
2026-11-11T13:28:48.5537649Z 	SIHDG-ordem.cancelamento.remetente = GEGAP
2026-11-11T13:28:48.5537816Z 	SIHDG-ordem.execucao.remetente = GETES
2026-11-11T13:28:48.5537980Z 	SIHDG-ordem.insercao.remetente = GEGAP
2026-11-11T13:28:48.5538148Z 	SIHDG-ordem.invalidacao.remetente = GESEN
2026-11-11T13:28:48.5538302Z 	SIHDG-path.arquivo.sinaf = /sihdg/
2026-11-11T13:28:48.5538414Z 	[Standalone] = 
2026-11-11T13:28:48.5538518Z 	file.encoding = UTF-8
2026-11-11T13:28:48.5538623Z 	file.separator = /
2026-11-11T13:28:48.5538784Z 	java.class.path = /opt/server/jboss-modules.jar
2026-11-11T13:28:48.5538901Z 	java.class.version = 65.0
2026-11-11T13:28:48.5539093Z 	java.home = /usr/lib/jvm/java-21-openjdk-21.0.10.0.7-1.el9.x86_64
2026-11-11T13:28:48.5539225Z 	java.io.tmpdir = /tmp
2026-11-11T13:28:48.5539356Z 	java.library.path = /usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib
2026-11-11T13:28:48.5539601Z 	java.net.preferIPv4Stack = true
2026-11-11T13:28:48.5539729Z 	java.runtime.name = OpenJDK Runtime Environment
2026-11-11T13:28:48.5539847Z 	java.runtime.version = 21.0.10+7-LTS
2026-11-11T13:28:48.5539974Z 	java.security.disableSystemPropertiesFile = true
2026-11-11T13:28:48.5540100Z 	java.security.egd = file:/dev/./urandom
2026-11-11T13:28:48.5540236Z 	java.security.properties = /opt/server/bin/java.security.override
2026-11-11T13:28:48.5540381Z 	java.specification.name = Java Platform API Specification
2026-11-11T13:28:48.5540512Z 	java.specification.vendor = Oracle Corporation
2026-11-11T13:28:48.5540637Z 	java.specification.version = 21
2026-11-11T13:28:48.5540770Z 	java.util.logging.manager = org.jboss.logmanager.LogManager
2026-11-11T13:28:48.5540902Z 	java.vendor = Red Hat, Inc.
2026-11-11T13:28:48.5541019Z 	java.vendor.url = https://www.redhat.com/
2026-11-11T13:28:48.5541145Z 	java.vendor.url.bug = https://access.redhat.com/support/cases/
2026-11-11T13:28:48.5541398Z 	java.vendor.version = (Red_Hat-21.0.10.0.7-1)
2026-11-11T13:28:48.5541520Z 	java.version = 21.0.10
2026-11-11T13:28:48.5541710Z 	java.version.date = 2026-01-20
2026-11-11T13:28:48.5541829Z 	java.vm.compressedOopsMode = 32-bit
2026-11-11T13:28:48.5541944Z 	java.vm.info = mixed mode, sharing
2026-11-11T13:28:48.5542104Z 	java.vm.name = OpenJDK 64-Bit Server VM
2026-11-11T13:28:48.5542239Z 	java.vm.specification.name = Java Virtual Machine Specification
2026-11-11T13:28:48.5542378Z 	java.vm.specification.vendor = Oracle Corporation
2026-11-11T13:28:48.5542505Z 	java.vm.specification.version = 21
2026-11-11T13:28:48.5542612Z 	java.vm.vendor = Red Hat, Inc.
2026-11-11T13:28:48.5542724Z 	java.vm.version = 21.0.10+7-LTS
2026-11-11T13:28:48.5542862Z 	javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
2026-11-11T13:28:48.5543096Z 	javax.net.ssl.trustStore = /opt/server/standalone/configuration/caixa-truststore_v8.jks
2026-11-11T13:28:48.5543245Z 	jboss.bind.address = 25.3.32.49
2026-11-11T13:28:48.5543364Z 	jboss.bind.address.management = 0.0.0.0
2026-11-11T13:28:48.5543482Z 	jboss.bind.address.private = 25.3.32.49
2026-11-11T13:28:48.5543596Z 	jboss.home.dir = /opt/server
2026-11-11T13:28:48.5543759Z 	jboss.host.name = sihdg-jboss8-prd-4-wpkgq
2026-11-11T13:28:48.5543892Z 	jboss.messaging.cluster.password = <redacted>
2026-11-11T13:28:48.5544013Z 	jboss.messaging.host = 25.3.32.49
2026-11-11T13:28:48.5544139Z 	jboss.modules.system.pkgs = jdk.nashorn.api,com.sun.crypto.provider
2026-11-11T13:28:48.5544319Z 	jboss.node.name = sihdg-jboss8-prd-4-wpkgq
2026-11-11T13:28:48.5544499Z 	jboss.qualified.host.name = sihdg-jboss8-prd-4-wpkgq
2026-11-11T13:28:48.5544631Z 	jboss.server.base.dir = /opt/server/standalone
2026-11-11T13:28:48.5544763Z 	jboss.server.config.dir = /opt/server/standalone/configuration
2026-11-11T13:28:48.5544894Z 	jboss.server.data.dir = /opt/server/standalone/data
2026-11-11T13:28:48.5545025Z 	jboss.server.log.dir = /opt/server/standalone/log
2026-11-11T13:28:48.5545278Z 	jboss.server.name = sihdg-jboss8-prd-4-wpkgq
2026-11-11T13:28:48.5545441Z 	jboss.server.persist.config = true
2026-11-11T13:28:48.5545614Z 	jboss.server.temp.dir = /opt/server/standalone/tmp
2026-11-11T13:28:48.5545806Z 	jboss.tx.node.id = ihdg-jboss8-prd-4-wpkgq
2026-11-11T13:28:48.5546036Z 	jdk.debug = release
2026-11-11T13:28:48.5546176Z 	jdk.serialFilter = maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
2026-11-11T13:28:48.5546311Z 	line.separator = 
2026-11-11T13:28:48.5546354Z 
2026-11-11T13:28:48.5546484Z 	logging.configuration = file:/opt/server/standalone/configuration/logging.properties
2026-11-11T13:28:48.5546625Z 	module.path = /opt/server/modules
2026-11-11T13:28:48.5546764Z 	native.encoding = ANSI_X3.4-1968
2026-11-11T13:28:48.5546887Z 	org.apache.catalina.connector.URI_ENCODING = UTF-8
2026-11-11T13:28:48.5547060Z 	org.jboss.as.web.default-encoding = UTF-8
2026-11-11T13:28:48.5547199Z 	org.jboss.boot.log.file = /opt/server/standalone/log/server.log
2026-11-11T13:28:48.5547333Z 	org.jboss.resolver.warning = true
2026-11-11T13:28:48.5547616Z 	org.wildfly.internal.cli.boot.hook.script.error.file = /tmp/cli-script-error-1794403721.cli
2026-11-11T13:28:48.5547879Z 	org.wildfly.internal.cli.boot.hook.script.output.file = /tmp/cli-script-output-1794403721.cli
2026-11-11T13:28:48.5548125Z 	org.wildfly.internal.cli.boot.hook.script.properties = /tmp/cli-script-property-1794403721.cli
2026-11-11T13:28:48.5548364Z 	org.wildfly.internal.cli.boot.hook.script.warn.file = /tmp/cli-warning-1794403721.log
2026-11-11T13:28:48.5548501Z 	os.arch = amd64
2026-11-11T13:28:48.5548598Z 	os.name = Linux
2026-11-11T13:28:48.5548755Z 	os.version = 6.1.18-200.fc37.x86_64
2026-11-11T13:28:48.5548861Z 	path.separator = :
2026-11-11T13:28:48.5548992Z 	stderr.encoding = ANSI_X3.4-1968
2026-11-11T13:28:48.5549127Z 	stdout.encoding = ANSI_X3.4-1968
2026-11-11T13:28:48.5549239Z 	sun.arch.data.model = 64
2026-11-11T13:28:48.5549703Z 	sun.boot.library.path = /usr/lib/jvm/java-21-openjdk-21.0.10.0.7-1.el9.x86_64/lib
2026-11-11T13:28:48.5549904Z 	sun.cpu.endian = little
2026-11-11T13:28:48.5550020Z 	sun.io.unicode.encoding = UnicodeLittle
2026-11-11T13:28:48.5551443Z 	sun.java.command = /opt/server/jboss-modules.jar -mp /opt/server/modules org.jboss.as.standalone -Djboss.home.dir=/opt/server -Djboss.server.base.dir=/opt/server/standalone -c standalone.xml -Djboss.messaging.host=25.3.32.49 -Djboss.messaging.cluster.password=<redacted> --start-mode=admin-only -Dorg.wildfly.internal.cli.boot.hook.script=/tmp/cli-script-1794403721.cli -Dorg.wildfly.internal.cli.boot.hook.marker.dir=/tmp/cli-boot-reload-marker-1794403722 -Dorg.wildfly.internal.cli.boot.hook.script.properties=/tmp/cli-script-property-1794403721.cli -Dorg.wildfly.internal.cli.boot.hook.script.error.file=/tmp/cli-script-error-1794403721.cli -Dorg.wildfly.internal.cli.boot.hook.script.warn.file=/tmp/cli-warning-1794403721.log -Dorg.wildfly.internal.cli.boot.hook.script.output.file=/tmp/cli-script-output-1794403721.cli -Djboss.node.name=sihdg-jboss8-prd-4-wpkgq -Djboss.tx.node.id=ihdg-jboss8-prd-4-wpkgq -bprivate 25.3.32.49 -b 25.3.32.49 -bmanagement 0.0.0.0 -Dwildfly.statistics-enabled=true
2026-11-11T13:28:48.5552303Z 	sun.java.launcher = SUN_STANDARD
2026-11-11T13:28:48.5552513Z 	sun.jnu.encoding = ANSI_X3.4-1968
2026-11-11T13:28:48.5552782Z 	sun.management.compiler = HotSpot 64-Bit Tiered Compilers
2026-11-11T13:28:48.5552978Z 	sun.nio.ch.bugLevel = 
2026-11-11T13:28:48.5553087Z 	user.country = US
2026-11-11T13:28:48.5553227Z 	user.dir = /home/jboss
2026-11-11T13:28:48.5553323Z 	user.home = /home/jboss
2026-11-11T13:28:48.5553427Z 	user.language = en
2026-11-11T13:28:48.5553525Z 	user.name = jboss
2026-11-11T13:28:48.5553631Z 	user.timezone = America/Sao_Paulo
2026-11-11T13:28:48.5553792Z 	wildfly.statistics-enabled = true
2026-11-11T13:28:48.5555727Z [0m[32m10:28:47,796 DEBUG [org.jboss.as.config] (MSC service thread 1-2) VM Arguments: -D[Standalone] -Xlog:gc*:file=/opt/server/standalone/log/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider -Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore_v8.jks -Djava.security.properties=/opt/server/bin/java.security.override -Djava.security.disableSystemPropertiesFile=true --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-exports=jdk.naming.dns/com.sun.jndi.dns=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/opt/server/standalone/log/server.log -Dlogging.configuration=file:/opt/server/standalone/configuration/logging.properties 
2026-11-11T13:28:48.5557259Z [0m[0m10:28:48,327 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 22) WFLYDR0001: Content added at location /opt/server/standalone/data/content/57/0d786de94b943f458ca1742df47fb17dda3b24/content
2026-11-11T13:28:48.5557792Z [0m[0m10:28:48,375 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
2026-11-11T13:28:48.5558267Z [0m[0m10:28:48,397 INFO  [org.wildfly.extension.elytron.oidc._private] (ServerService Thread Pool -- 32) WFLYOIDC0001: Activating WildFly Elytron OIDC Subsystem
2026-11-11T13:28:48.5558872Z [0m[0m10:28:48,398 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 36) WFLYRS0016: RESTEasy version 6.2.15.Final-redhat-00002
2026-11-11T13:28:48.5559341Z [0m[0m10:28:48,398 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 33) WFLYHEALTH0001: Activating Base Health Subsystem
2026-11-11T13:28:48.5559875Z [0m[0m10:28:48,398 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 34) WFLYCLINF0001: Activating Infinispan subsystem.
2026-11-11T13:28:48.5560181Z [0m[0m10:28:48,399 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 40) WFLYNAM0001: Activating Naming Subsystem
2026-11-11T13:28:48.5560542Z [0m[0m10:28:48,475 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 35) WFLYIO001: Worker 'default' has auto-configured to 2 IO threads with 16 max task threads based on your 1 available processors
2026-11-11T13:28:48.5561106Z [0m[33m10:28:48,476 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY00023: KeyStore file '/opt/server/standalone/configuration/application.keystore' does not exist. Used blank.
2026-11-11T13:28:48.5587264Z ##[debug]Exit code 0 received from tool '/usr/bin/bash'
2026-11-11T13:28:48.5589654Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-11-11T13:28:48.5595584Z ##[debug]task result: Succeeded
2026-11-11T13:28:48.5597315Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-11-11T13:28:48.5633425Z ##[section]Finishing: Logs da Aplicação

