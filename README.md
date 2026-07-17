2026-07-17T14:30:46.4054902Z ##[debug]Evaluating condition for step: 'Verificando Status do Deployment'
2026-07-17T14:30:46.4055339Z ##[debug]Evaluating: succeeded()
2026-07-17T14:30:46.4055474Z ##[debug]Evaluating succeeded:
2026-07-17T14:30:46.4055739Z ##[debug]=> True
2026-07-17T14:30:46.4055887Z ##[debug]Result: True
2026-07-17T14:30:46.4056044Z ##[section]Starting: Verificando Status do Deployment
2026-07-17T14:30:46.4058903Z ==============================================================================
2026-07-17T14:30:46.4058981Z Task         : Bash
2026-07-17T14:30:46.4059021Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-17T14:30:46.4059081Z Version      : 3.227.0
2026-07-17T14:30:46.4059130Z Author       : Microsoft Corporation
2026-07-17T14:30:46.4059179Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-17T14:30:46.4059255Z ==============================================================================
2026-07-17T14:30:46.4590522Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-07-17T14:30:46.5289868Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-07-17T14:30:46.5297171Z ##[debug]loading inputs and endpoints
2026-07-17T14:30:46.5303954Z ##[debug]loading INPUT_TARGETTYPE
2026-07-17T14:30:46.5311092Z ##[debug]loading INPUT_FILEPATH
2026-07-17T14:30:46.5312219Z ##[debug]loading INPUT_SCRIPT
2026-07-17T14:30:46.5312897Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-07-17T14:30:46.5313497Z ##[debug]loading INPUT_FAILONSTDERR
2026-07-17T14:30:46.5314220Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-07-17T14:30:46.5314967Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-07-17T14:30:46.5317041Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-07-17T14:30:46.5321785Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-07-17T14:30:46.5323211Z ##[debug]loading SECRET_PASSWORD_CGC
2026-07-17T14:30:46.5324617Z ##[debug]loading SECRET_FORTIFY_PASS
2026-07-17T14:30:46.5326555Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-07-17T14:30:46.5327997Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-07-17T14:30:46.5329187Z ##[debug]loading SECRET_AZPAT
2026-07-17T14:30:46.5329767Z ##[debug]loading SECRET_TOKEN_CRQ
2026-07-17T14:30:46.5330422Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-07-17T14:30:46.5331046Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-07-17T14:30:46.5331630Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-07-17T14:30:46.5332194Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-07-17T14:30:46.5332708Z ##[debug]loaded 19
2026-07-17T14:30:46.5338008Z ##[debug]Agent.ProxyUrl=undefined
2026-07-17T14:30:46.5338350Z ##[debug]Agent.CAInfo=undefined
2026-07-17T14:30:46.5339201Z ##[debug]Agent.ClientCert=undefined
2026-07-17T14:30:46.5339551Z ##[debug]Agent.SkipCertValidation=True
2026-07-17T14:30:46.5352933Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-07-17T14:30:46.5354569Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-07-17T14:30:46.5355064Z ##[debug]system.culture=en-US
2026-07-17T14:30:46.5362461Z ##[debug]failOnStderr=false
2026-07-17T14:30:46.5363249Z ##[debug]workingDirectory=/opt/ads-agent/_work/r882/a
2026-07-17T14:30:46.5363606Z ##[debug]check path : /opt/ads-agent/_work/r882/a
2026-07-17T14:30:46.5364092Z ##[debug]targetType=inline
2026-07-17T14:30:46.5364428Z ##[debug]bashEnvValue=undefined
2026-07-17T14:30:46.5365906Z ##[debug]script=if [[ -n "$SITE" && "$SITE" =~ (okd4|ocp|openshift) ]];
then
  app="sihdg-jboss8-des"
else
  app="sihdg-jboss8-des-esteiras"
fi

oc rollout status deploymentconfig/"$app"  --request-timeout=600 -n sihdg-des
if [ "$?" -ne "0" ]; then
  echo "A aplicação não foi iniciada com sucesso!"
  echo "Os logs da aplicação estão disponíveis na próxima task: Logs da Aplicação"
  exit 1
fi
2026-07-17T14:30:46.5373740Z Generating script.
2026-07-17T14:30:46.5375843Z ##[debug]which 'bash'
2026-07-17T14:30:46.5381518Z ##[debug]found: '/usr/bin/bash'
2026-07-17T14:30:46.5382057Z ##[debug]Agent.Version=3.236.1
2026-07-17T14:30:46.5382418Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-07-17T14:30:46.5382769Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-07-17T14:30:46.5384484Z ========================== Starting Command Output ===========================
2026-07-17T14:30:46.5385673Z ##[debug]which '/usr/bin/bash'
2026-07-17T14:30:46.5386479Z ##[debug]found: '/usr/bin/bash'
2026-07-17T14:30:46.5387187Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/e34354ef-af21-4b96-9214-a14a7a33e13e.sh
2026-07-17T14:30:46.5389456Z ##[debug]exec tool: /usr/bin/bash
2026-07-17T14:30:46.5389774Z ##[debug]arguments:
2026-07-17T14:30:46.5390107Z ##[debug]   /opt/ads-agent/_work/_temp/e34354ef-af21-4b96-9214-a14a7a33e13e.sh
2026-07-17T14:30:46.5391615Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/e34354ef-af21-4b96-9214-a14a7a33e13e.sh
2026-07-17T14:30:46.6352332Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-07-17T14:30:48.3728992Z ##[debug]Agent environment resources - Disk: / Available 61806.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 16.59%
2026-07-17T14:30:48.8942390Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-07-17T14:30:49.0016026Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-07-17T14:30:53.3741529Z ##[debug]Agent environment resources - Disk: / Available 61806.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 14.98%
2026-07-17T14:30:58.3746249Z ##[debug]Agent environment resources - Disk: / Available 61806.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 13.67%
2026-07-17T14:31:03.3745426Z ##[debug]Agent environment resources - Disk: / Available 61806.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 12.58%
2026-07-17T14:31:08.3763297Z ##[debug]Agent environment resources - Disk: / Available 61805.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 11.62%
2026-07-17T14:31:13.3767292Z ##[debug]Agent environment resources - Disk: / Available 61807.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 10.84%
2026-07-17T14:31:18.3784149Z ##[debug]Agent environment resources - Disk: / Available 61806.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 10.14%
2026-07-17T14:31:23.3797849Z ##[debug]Agent environment resources - Disk: / Available 61806.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 9.53%
2026-07-17T14:31:28.3806235Z ##[debug]Agent environment resources - Disk: / Available 61806.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 9.00%
2026-07-17T14:31:33.3821353Z ##[debug]Agent environment resources - Disk: / Available 61806.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 8.52%
2026-07-17T14:31:38.3830033Z ##[debug]Agent environment resources - Disk: / Available 61805.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 8.10%
2026-07-17T14:31:43.3843080Z ##[debug]Agent environment resources - Disk: / Available 61807.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.71%
2026-07-17T14:31:48.3847287Z ##[debug]Agent environment resources - Disk: / Available 61806.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.36%
2026-07-17T14:31:53.3868348Z ##[debug]Agent environment resources - Disk: / Available 61807.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.04%
2026-07-17T14:31:58.3884897Z ##[debug]Agent environment resources - Disk: / Available 61807.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.74%
2026-07-17T14:32:03.3895939Z ##[debug]Agent environment resources - Disk: / Available 61807.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.49%
2026-07-17T14:32:08.3904855Z ##[debug]Agent environment resources - Disk: / Available 61807.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.25%
2026-07-17T14:32:13.3919287Z ##[debug]Agent environment resources - Disk: / Available 61807.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.02%
2026-07-17T14:32:18.3920180Z ##[debug]Agent environment resources - Disk: / Available 61806.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.81%
2026-07-17T14:32:23.3932310Z ##[debug]Agent environment resources - Disk: / Available 61806.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.61%
2026-07-17T14:32:28.3936250Z ##[debug]Agent environment resources - Disk: / Available 61798.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.42%
2026-07-17T14:32:33.3950349Z ##[debug]Agent environment resources - Disk: / Available 61794.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.26%
2026-07-17T14:32:38.3968879Z ##[debug]Agent environment resources - Disk: / Available 61793.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.09%
2026-07-17T14:32:43.3977295Z ##[debug]Agent environment resources - Disk: / Available 61795.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.94%
2026-07-17T14:32:48.3984544Z ##[debug]Agent environment resources - Disk: / Available 61795.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.80%
2026-07-17T14:32:53.4001957Z ##[debug]Agent environment resources - Disk: / Available 61795.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.67%
2026-07-17T14:32:58.4012527Z ##[debug]Agent environment resources - Disk: / Available 61795.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.53%
2026-07-17T14:33:03.4021342Z ##[debug]Agent environment resources - Disk: / Available 61794.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.42%
2026-07-17T14:33:08.4022688Z ##[debug]Agent environment resources - Disk: / Available 61794.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.30%
2026-07-17T14:33:13.4030282Z ##[debug]Agent environment resources - Disk: / Available 61795.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.20%
2026-07-17T14:33:18.4040075Z ##[debug]Agent environment resources - Disk: / Available 61795.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.10%
2026-07-17T14:33:23.4046846Z ##[debug]Agent environment resources - Disk: / Available 61795.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.00%
2026-07-17T14:33:28.4052974Z ##[debug]Agent environment resources - Disk: / Available 61795.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.91%
2026-07-17T14:33:33.4047885Z ##[debug]Agent environment resources - Disk: / Available 61795.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.82%
2026-07-17T14:33:38.4060963Z ##[debug]Agent environment resources - Disk: / Available 61795.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.73%
2026-07-17T14:33:43.4064015Z ##[debug]Agent environment resources - Disk: / Available 61795.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.65%
2026-07-17T14:33:48.4071342Z ##[debug]Agent environment resources - Disk: / Available 61763.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.58%
2026-07-17T14:33:53.4088960Z ##[debug]Agent environment resources - Disk: / Available 61763.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.50%
2026-07-17T14:33:58.4092963Z ##[debug]Agent environment resources - Disk: / Available 61763.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.43%
2026-07-17T14:34:03.4099510Z ##[debug]Agent environment resources - Disk: / Available 61763.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.37%
2026-07-17T14:34:08.4104173Z ##[debug]Agent environment resources - Disk: / Available 61763.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.30%
2026-07-17T14:34:13.4107230Z ##[debug]Agent environment resources - Disk: / Available 61763.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.24%
2026-07-17T14:34:18.4119280Z ##[debug]Agent environment resources - Disk: / Available 61763.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.19%
2026-07-17T14:34:23.4124593Z ##[debug]Agent environment resources - Disk: / Available 61763.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.13%
2026-07-17T14:34:28.4134021Z ##[debug]Agent environment resources - Disk: / Available 61763.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.07%
2026-07-17T14:34:33.4149339Z ##[debug]Agent environment resources - Disk: / Available 61763.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.02%
2026-07-17T14:34:38.4152610Z ##[debug]Agent environment resources - Disk: / Available 61763.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.97%
2026-07-17T14:34:43.4158334Z ##[debug]Agent environment resources - Disk: / Available 61763.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.92%
2026-07-17T14:34:48.4159677Z ##[debug]Agent environment resources - Disk: / Available 61763.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.87%
2026-07-17T14:34:53.4165254Z ##[debug]Agent environment resources - Disk: / Available 61763.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.83%
2026-07-17T14:34:58.4180534Z ##[debug]Agent environment resources - Disk: / Available 61763.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.78%
2026-07-17T14:35:03.4182497Z ##[debug]Agent environment resources - Disk: / Available 61763.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.74%
2026-07-17T14:35:08.4198578Z ##[debug]Agent environment resources - Disk: / Available 61763.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.70%
2026-07-17T14:35:13.4204282Z ##[debug]Agent environment resources - Disk: / Available 61755.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.66%
2026-07-17T14:35:18.4210929Z ##[debug]Agent environment resources - Disk: / Available 61754.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.62%
2026-07-17T14:35:23.4218476Z ##[debug]Agent environment resources - Disk: / Available 61756.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.58%
2026-07-17T14:35:28.4227701Z ##[debug]Agent environment resources - Disk: / Available 61756.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.55%
2026-07-17T14:35:33.4241124Z ##[debug]Agent environment resources - Disk: / Available 61756.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.51%
2026-07-17T14:35:38.4249780Z ##[debug]Agent environment resources - Disk: / Available 61756.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.47%
2026-07-17T14:35:43.4260530Z ##[debug]Agent environment resources - Disk: / Available 61756.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.44%
2026-07-17T14:35:48.4263196Z ##[debug]Agent environment resources - Disk: / Available 61755.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.41%
2026-07-17T14:35:53.4269048Z ##[debug]Agent environment resources - Disk: / Available 61756.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.38%
2026-07-17T14:35:58.4280400Z ##[debug]Agent environment resources - Disk: / Available 61756.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.35%
2026-07-17T14:36:03.4280799Z ##[debug]Agent environment resources - Disk: / Available 61756.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.32%
2026-07-17T14:36:08.4283605Z ##[debug]Agent environment resources - Disk: / Available 61755.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.29%
2026-07-17T14:36:13.4292109Z ##[debug]Agent environment resources - Disk: / Available 61756.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.26%
2026-07-17T14:36:18.4291808Z ##[debug]Agent environment resources - Disk: / Available 61756.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.23%
2026-07-17T14:36:23.4310614Z ##[debug]Agent environment resources - Disk: / Available 61755.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.21%
2026-07-17T14:36:28.4313980Z ##[debug]Agent environment resources - Disk: / Available 61755.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.18%
2026-07-17T14:36:33.4319968Z ##[debug]Agent environment resources - Disk: / Available 61755.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.15%
2026-07-17T14:36:38.4330667Z ##[debug]Agent environment resources - Disk: / Available 61755.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.13%
2026-07-17T14:36:43.4334248Z ##[debug]Agent environment resources - Disk: / Available 61755.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.11%
2026-07-17T14:36:46.4103610Z ##[debug]Started cancellation of executing script
2026-07-17T14:36:46.4112755Z ##[debug]Exit code null received from tool '/usr/bin/bash'
2026-07-17T14:36:53.9180754Z ##[error]The task has timed out.
2026-07-17T14:36:53.9182090Z ##[section]Finishing: Verificando Status do Deployment


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIHDG-jboss8
/
SIHDG-jboss8-3.12.0.7(1)
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings
SIHDG-jboss8

SIHDG-jboss8-3.12.0.7(1)


EC DES

Failed


Pipeline

Tasks

Variables

Logs

Tests
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
EGRESS_IP_OKD (74)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
MUDANCA_GSC (3)
WO0000079495945
Scopes: Release
ADAPTER_VARIABLES (9)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SIHDG-JBOSS8-DES (40)
Grupo de variáveis de SIHDG-JBOSS8-DES
Scopes: EC DES
DATASOURCE_CONNECTION_URL
jdbc:sqlserver://10.116.93.91:1433;DatabaseName=HDGDB001
DATASOURCE_PASSWORD
sihdguser
DATASOURCE_USER_NAME
sihdguser
JKS_FILE
caixa-truststore-acteste-nprd.jks
JVM_HEAP_MAX
2048m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
512m
JVM_METASPACE_MIN
256m
NFS_PATH
/fs_sihdg_des
NFS_SERVER
hypernprd12.ad.caixa
NFS_STORAGE_SIZE_VOLUME
10Gi
PASSWORD_TRUSTSTORE
changeit
PATH_DESTINO
/sihdg_des
PATH_NFS
/fs_sihdg_des
SERVER_NFS
hypernprd12.ad.caixa
SIHDG-DB_INTERNO
true
SIHDG-SEC_TEMPO_VIDA_TOKEN
5
SIHDG-classificacao.informacao
#INTERNO.CONFIDENCIAL
SIHDG-derivativo.avaliacao.remetente
GEGAP
SIHDG-mail.avaliacao.derivativo
GEOMI@MAIL.CAIXA
SIHDG-mail.endereco
gitecbr05@caixa.gov.br
SIHDG-mail.ordem.alteracao
GEOMI@MAIL.CAIXA
SIHDG-mail.ordem.cancelamento
GEOMI@MAIL.CAIXA
SIHDG-mail.ordem.execucao
GEOMI@MAIL.CAIXA
SIHDG-mail.ordem.insercao
GEOMI@MAIL.CAIXA
SIHDG-mail.ordem.invalidacao
GEOMI@MAIL.CAIXA
SIHDG-mail.registro.efetividade
GEANF@MAIL.CAIXA,GEMOC@MAIL.CAIXA
SIHDG-mail.smtp.host
smtptest.correiolivre.caixa
SIHDG-mail.smtp.port
25
SIHDG-ordem.alteracao.remetente
GEGAP
SIHDG-ordem.cancelamento.remetente
GEGAP
SIHDG-ordem.execucao.remetente
GETES
SIHDG-ordem.insercao.remetente
GEGAP
SIHDG-ordem.invalidacao.remetente
GESEN
SIHDG-path.arquivo.sinaf
/sihdg_des/
SIZE_VOLUME
10Gi
SSO_REALM
intranet
SSO_REQUIRED
none
SSO_RESOURCE
cli-web-hdg
SSO_URL
https://login.des.caixa/auth
SIHDG-JBOSS8-TQS (1)
Grupo de variáveis de SIHDG-JBOSS8-TQS
Scopes: EC TQS
SIHDG-JBOSS8-HMP (1)
Grupo de variáveis de SIHDG-JBOSS8-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SIHDG-JBOSS8-PRD (1)
Grupo de variáveis de SIHDG-JBOSS8-PRD
Scopes: EC PRD
14 pipelines found

Select a release pipeline to view its releases

4 pipelines found

Row 5

Row 2

Showing filters 1 through 2

Showing filters 1 through 2

Row 2

Row 3

Showing filters 1 through 2



Error from server (NotFound): namespaces "sihdh-des" not found
-sh-4.2$ oc get project sihdg-des
NAME        DISPLAY NAME   STATUS
sihdg-des                  Active
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$

[p981778@cadsvaprlx067 ~]$ oc logs -f sihdg-jboss8-des-30-r9cbg
Using openshift launcher.
2026-07-17 16:52:58 Launching WildFly Server
INFO Access log is disabled, ignoring configuration.
INFO Clustering feature is not enabled, no jgroups subsystem present in server configuration.
INFO Server started in admin mode, CLI script executed during server boot.
INFO Running jboss-eap-8/eap81-openjdk21-builder-openshift-rhel9 image, version 1.0.0.GA
JAVA_OPTS already set in environment; overriding default settings with values:  -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider
=========================================================================
 
  JBoss Bootstrap Environment
 
  JBOSS_HOME: /opt/server
 
  JAVA: /usr/lib/jvm/java-21/bin/java
 
  JAVA_OPTS:  -Xlog:gc*:file="/opt/server/standalone/log/gc.log":time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter="maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000"  -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider   --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-exports=jdk.naming.dns/com.sun.jndi.dns=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED
 
=========================================================================
 
13:52:59,949 INFO  [org.jboss.modules] (main) JBoss Modules version 2.1.6.Final-redhat-00001
13:53:00,643 INFO  [org.jboss.msc] (main) JBoss MSC version 1.5.5.Final-redhat-00001
13:53:00,650 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
13:53:00,767 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) starting
13:53:00,769 DEBUG [org.jboss.as.config] (MSC service thread 1-2) Configured system properties:
        [Standalone] =
        file.encoding = UTF-8
        file.separator = /
        java.class.path = /opt/server/jboss-modules.jar
        java.class.version = 65.0
        java.home = /usr/lib/jvm/java-21-openjdk-21.0.11.0.10-2.el9.x86_64
        java.io.tmpdir = /tmp
        java.library.path = /usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib
        java.net.preferIPv4Stack = true
        java.runtime.name = OpenJDK Runtime Environment
        java.runtime.version = 21.0.11+10-LTS
        java.security.egd = file:/dev/./urandom
        java.specification.name = Java Platform API Specification
        java.specification.vendor = Oracle Corporation
        java.specification.version = 21
        java.util.logging.manager = org.jboss.logmanager.LogManager
        java.vendor = Red Hat, Inc.
        java.vendor.url = https://www.redhat.com/
        java.vendor.url.bug = https://access.redhat.com/support/cases/
        java.vendor.version = (Red_Hat-21.0.11.0.10-1)
        java.version = 21.0.11
        java.version.date = 2026-04-21
        java.vm.compressedOopsMode = 32-bit
        java.vm.info = mixed mode, sharing
        java.vm.name = OpenJDK 64-Bit Server VM
        java.vm.specification.name = Java Virtual Machine Specification
        java.vm.specification.vendor = Oracle Corporation
        java.vm.specification.version = 21
        java.vm.vendor = Red Hat, Inc.
        java.vm.version = 21.0.11+10-LTS
        javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
        jboss.bind.address = 25.1.19.87
        jboss.bind.address.management = 0.0.0.0
        jboss.bind.address.private = 25.1.19.87
        jboss.home.dir = /opt/server
        jboss.host.name = sihdg-jboss8-des-30-r9cbg
        jboss.messaging.cluster.password = <redacted>
        jboss.messaging.host = 25.1.19.87
        jboss.modules.system.pkgs = jdk.nashorn.api,com.sun.crypto.provider
        jboss.node.name = sihdg-jboss8-des-30-r9cbg
        jboss.qualified.host.name = sihdg-jboss8-des-30-r9cbg
        jboss.server.base.dir = /opt/server/standalone
        jboss.server.config.dir = /opt/server/standalone/configuration
        jboss.server.data.dir = /opt/server/standalone/data
        jboss.server.log.dir = /opt/server/standalone/log
        jboss.server.name = sihdg-jboss8-des-30-r9cbg
        jboss.server.persist.config = true
        jboss.server.temp.dir = /opt/server/standalone/tmp
        jboss.tx.node.id = hdg-jboss8-des-30-r9cbg
        jdk.debug = release
        jdk.serialFilter = maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
        line.separator =
 
        logging.configuration = file:/opt/server/standalone/configuration/logging.properties
        module.path = /opt/server/modules
        native.encoding = ANSI_X3.4-1968
        org.jboss.boot.log.file = /opt/server/standalone/log/server.log
        org.jboss.resolver.warning = true
        org.wildfly.internal.cli.boot.hook.marker.dir = /tmp/cli-boot-reload-marker-1784307179
        org.wildfly.internal.cli.boot.hook.script = /tmp/cli-script-1784307178.cli
        org.wildfly.internal.cli.boot.hook.script.error.file = /tmp/cli-script-error-1784307178.cli
        org.wildfly.internal.cli.boot.hook.script.output.file = /tmp/cli-script-output-1784307178.cli
        org.wildfly.internal.cli.boot.hook.script.properties = /tmp/cli-script-property-1784307178.cli
        org.wildfly.internal.cli.boot.hook.script.warn.file = /tmp/cli-warning-1784307178.log
        os.arch = amd64
        os.name = Linux
        os.version = 6.1.18-200.fc37.x86_64
        path.separator = :
        stderr.encoding = ANSI_X3.4-1968
        stdout.encoding = ANSI_X3.4-1968
        sun.arch.data.model = 64
        sun.boot.library.path = /usr/lib/jvm/java-21-openjdk-21.0.11.0.10-2.el9.x86_64/lib
        sun.cpu.endian = little
        sun.io.unicode.encoding = UnicodeLittle
        sun.java.command = /opt/server/jboss-modules.jar -mp /opt/server/modules org.jboss.as.standalone -Djboss.home.dir=/opt/server -Djboss.server.base.dir=/opt/server/standalone -c standalone.xml -Djboss.messaging.host=25.1.19.87 -Djboss.messaging.cluster.password=<redacted> --start-mode=admin-only -Dorg.wildfly.internal.cli.boot.hook.script=/tmp/cli-script-1784307178.cli -Dorg.wildfly.internal.cli.boot.hook.marker.dir=/tmp/cli-boot-reload-marker-1784307179 -Dorg.wildfly.internal.cli.boot.hook.script.properties=/tmp/cli-script-property-1784307178.cli -Dorg.wildfly.internal.cli.boot.hook.script.error.file=/tmp/cli-script-error-1784307178.cli -Dorg.wildfly.internal.cli.boot.hook.script.warn.file=/tmp/cli-warning-1784307178.log -Dorg.wildfly.internal.cli.boot.hook.script.output.file=/tmp/cli-script-output-1784307178.cli -Djboss.node.name=sihdg-jboss8-des-30-r9cbg -Djboss.tx.node.id=hdg-jboss8-des-30-r9cbg -bprivate 25.1.19.87 -b 25.1.19.87 -bmanagement 0.0.0.0 -Dwildfly.statistics-enabled=true
        sun.java.launcher = SUN_STANDARD
        sun.jnu.encoding = ANSI_X3.4-1968
        sun.management.compiler = HotSpot 64-Bit Tiered Compilers
        user.country = US
        user.dir = /home/jboss
        user.home = /home/jboss
        user.language = en
        user.name = jboss
        user.timezone = America/Sao_Paulo
        wildfly.statistics-enabled = true
13:53:00,825 DEBUG [org.jboss.as.config] (MSC service thread 1-2) VM Arguments: -D[Standalone] -Xlog:gc*:file=/opt/server/standalone/log/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-exports=jdk.naming.dns/com.sun.jndi.dns=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/opt/server/standalone/log/server.log -Dlogging.configuration=file:/opt/server/standalone/configuration/logging.properties
13:53:01,942 INFO  [org.wildfly.security] (ServerService Thread Pool -- 15) ELY00001: WildFly Elytron version 2.2.14.Final-redhat-00001
13:53:02,929 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
13:53:02,937 INFO  [org.xnio] (MSC service thread 1-2) XNIO version 3.8.16.Final-redhat-00001
13:53:02,941 INFO  [org.xnio.nio] (MSC service thread 1-2) XNIO NIO Implementation Version 3.8.16.Final-redhat-00001
13:53:03,032 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY00023: KeyStore file '/opt/server/standalone/configuration/application.keystore' does not exist. Used blank.
13:53:03,034 INFO  [org.jboss.remoting] (MSC service thread 1-2) JBoss Remoting version 5.0.31.Final-redhat-00001
13:53:03,046 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY01084: KeyStore /opt/server/standalone/configuration/application.keystore not found, it will be auto-generated on first use with a self-signed certificate for host localhost
13:53:03,360 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
13:53:03,362 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://0.0.0.0:9990/management
13:53:03,362 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0054: Admin console is not enabled
13:53:03,363 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) started in 3826ms - Started 72 of 84 services (26 services are lazy, passive or on-demand) - Server configuration file in use: standalone.xml
13:53:03,363 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0472: Checking for presence of marker file indicating that the server has been restarted following execution of the additional commands from the CLI script
13:53:03,363 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0474: No marker file found indicating that the server has been restarted following execution of the additional commands from the CLI script
13:53:03,363 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0466: Initialised the additional boot CLI script functionality. The CLI commands will be read from /tmp/cli-script-1784307178.cli. The server will be rebooted to normal mode after these have been executed
13:53:03,429 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0467: Running the additional commands from the CLI script /tmp/cli-script-1784307178.cli against the server which is running in admin-only mode
13:53:03,430 INFO  [org.jboss.as.cli] (Controller Boot Thread) WFLYCLI0001: Processing CLI script /tmp/cli-script-1784307178.cli
13:53:03,773 INFO  [org.jboss.as.cli] (Controller Boot Thread) WFLYCLI0005: Done processing CLI script /tmp/cli-script-1784307178.cli
13:53:03,773 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0468: Completed running the commands from the CLI script
13:53:03,773 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0470: Reloading the server to normal mode after execution of the additional commands from the CLI script. This will clear the properties triggering the additional boot cli script functionality if they were set (org.wildfly.internal.cli.boot.hook.script, org.wildfly.internal.cli.boot.hook.reload.skip, org.wildfly.internal.cli.boot.hook.marker.dir), and delete the marker file indicating the server was restarted
13:53:03,836 INFO  [org.jboss.as] (MSC service thread 1-1) WFLYSRV0050: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) stopped in 10ms
13:53:03,837 INFO  [org.jboss.as] (MSC service thread 1-1) WFLYSRV0049: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) starting
13:53:03,837 DEBUG [org.jboss.as.config] (MSC service thread 1-1) Configured system properties:
        [Standalone] =
        file.encoding = UTF-8
        file.separator = /
        java.class.path = /opt/server/jboss-modules.jar
        java.class.version = 65.0
        java.home = /usr/lib/jvm/java-21-openjdk-21.0.11.0.10-2.el9.x86_64
        java.io.tmpdir = /tmp
        java.library.path = /usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib
        java.net.preferIPv4Stack = true
        java.runtime.name = OpenJDK Runtime Environment
        java.runtime.version = 21.0.11+10-LTS
        java.security.egd = file:/dev/./urandom
        java.specification.name = Java Platform API Specification
        java.specification.vendor = Oracle Corporation
        java.specification.version = 21
        java.util.logging.manager = org.jboss.logmanager.LogManager
        java.vendor = Red Hat, Inc.
        java.vendor.url = https://www.redhat.com/
        java.vendor.url.bug = https://access.redhat.com/support/cases/
        java.vendor.version = (Red_Hat-21.0.11.0.10-1)
        java.version = 21.0.11
        java.version.date = 2026-04-21
        java.vm.compressedOopsMode = 32-bit
        java.vm.info = mixed mode, sharing
        java.vm.name = OpenJDK 64-Bit Server VM
        java.vm.specification.name = Java Virtual Machine Specification
        java.vm.specification.vendor = Oracle Corporation
        java.vm.specification.version = 21
        java.vm.vendor = Red Hat, Inc.
        java.vm.version = 21.0.11+10-LTS
        javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
        jboss.bind.address = 25.1.19.87
        jboss.bind.address.management = 0.0.0.0
        jboss.bind.address.private = 25.1.19.87
        jboss.home.dir = /opt/server
        jboss.host.name = sihdg-jboss8-des-30-r9cbg
        jboss.messaging.cluster.password = <redacted>
        jboss.messaging.host = 25.1.19.87
        jboss.modules.system.pkgs = jdk.nashorn.api,com.sun.crypto.provider
        jboss.node.name = sihdg-jboss8-des-30-r9cbg
        jboss.qualified.host.name = sihdg-jboss8-des-30-r9cbg
        jboss.server.base.dir = /opt/server/standalone
        jboss.server.config.dir = /opt/server/standalone/configuration
        jboss.server.data.dir = /opt/server/standalone/data
        jboss.server.log.dir = /opt/server/standalone/log
        jboss.server.name = sihdg-jboss8-des-30-r9cbg
        jboss.server.persist.config = true
        jboss.server.temp.dir = /opt/server/standalone/tmp
        jboss.tx.node.id = hdg-jboss8-des-30-r9cbg
        jdk.debug = release
        jdk.serialFilter = maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
        line.separator =
 
        logging.configuration = file:/opt/server/standalone/configuration/logging.properties
        module.path = /opt/server/modules
        native.encoding = ANSI_X3.4-1968
        org.jboss.boot.log.file = /opt/server/standalone/log/server.log
        org.jboss.resolver.warning = true
        org.wildfly.internal.cli.boot.hook.script.error.file = /tmp/cli-script-error-1784307178.cli
        org.wildfly.internal.cli.boot.hook.script.output.file = /tmp/cli-script-output-1784307178.cli
        org.wildfly.internal.cli.boot.hook.script.properties = /tmp/cli-script-property-1784307178.cli
        org.wildfly.internal.cli.boot.hook.script.warn.file = /tmp/cli-warning-1784307178.log
        os.arch = amd64
        os.name = Linux
        os.version = 6.1.18-200.fc37.x86_64
        path.separator = :
        stderr.encoding = ANSI_X3.4-1968
        stdout.encoding = ANSI_X3.4-1968
        sun.arch.data.model = 64
        sun.boot.library.path = /usr/lib/jvm/java-21-openjdk-21.0.11.0.10-2.el9.x86_64/lib
        sun.cpu.endian = little
        sun.io.unicode.encoding = UnicodeLittle
        sun.java.command = /opt/server/jboss-modules.jar -mp /opt/server/modules org.jboss.as.standalone -Djboss.home.dir=/opt/server -Djboss.server.base.dir=/opt/server/standalone -c standalone.xml -Djboss.messaging.host=25.1.19.87 -Djboss.messaging.cluster.password=<redacted> --start-mode=admin-only -Dorg.wildfly.internal.cli.boot.hook.script=/tmp/cli-script-1784307178.cli -Dorg.wildfly.internal.cli.boot.hook.marker.dir=/tmp/cli-boot-reload-marker-1784307179 -Dorg.wildfly.internal.cli.boot.hook.script.properties=/tmp/cli-script-property-1784307178.cli -Dorg.wildfly.internal.cli.boot.hook.script.error.file=/tmp/cli-script-error-1784307178.cli -Dorg.wildfly.internal.cli.boot.hook.script.warn.file=/tmp/cli-warning-1784307178.log -Dorg.wildfly.internal.cli.boot.hook.script.output.file=/tmp/cli-script-output-1784307178.cli -Djboss.node.name=sihdg-jboss8-des-30-r9cbg -Djboss.tx.node.id=hdg-jboss8-des-30-r9cbg -bprivate 25.1.19.87 -b 25.1.19.87 -bmanagement 0.0.0.0 -Dwildfly.statistics-enabled=true
        sun.java.launcher = SUN_STANDARD
        sun.jnu.encoding = ANSI_X3.4-1968
        sun.management.compiler = HotSpot 64-Bit Tiered Compilers
        sun.nio.ch.bugLevel =
        user.country = US
        user.dir = /home/jboss
        user.home = /home/jboss
        user.language = en
        user.name = jboss
        user.timezone = America/Sao_Paulo
        wildfly.statistics-enabled = true
13:53:03,837 DEBUG [org.jboss.as.config] (MSC service thread 1-1) VM Arguments: -D[Standalone] -Xlog:gc*:file=/opt/server/standalone/log/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-exports=jdk.naming.dns/com.sun.jndi.dns=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/opt/server/standalone/log/server.log -Dlogging.configuration=file:/opt/server/standalone/configuration/logging.properties
13:53:04,336 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 10) WFLYDR0001: Content added at location /opt/server/standalone/data/content/2c/b67efd63225616bb5cdbdc1e04cfe2cf35d8b7/content
13:53:04,356 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
13:53:04,435 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 30) WFLYCLINF0001: Activating Infinispan subsystem.
13:53:04,436 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 32) WFLYRS0016: RESTEasy version 6.2.15.Final-redhat-00002
13:53:04,437 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 29) WFLYHEALTH0001: Activating Base Health Subsystem
13:53:04,438 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 36) WFLYNAM0001: Activating Naming Subsystem
13:53:04,438 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 31) WFLYIO001: Worker 'default' has auto-configured to 2 IO threads with 16 max task threads based on your 1 available processors
13:53:04,532 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Starting deployment of "sihdg-3.13.0.4.ear" (runtime-name: "sihdg-3.13.0.4.ear")
13:53:04,534 INFO  [org.jboss.as.connector] (MSC service thread 1-2) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 3.0.14.Final-redhat-00001)
13:53:04,536 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 40) WFLYUT0112: The value 'require-host-http11' attribute in the '/subsystem=undertow/server=default-server/http-listener=default' resource is 'false', which will be ignored. The server now always enforces the RFC 9112 requirement that HTTP/1.1 request messages include a Host header.
13:53:04,630 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0003: Undertow 2.3.23.SP3-redhat-00001 starting
13:53:04,725 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY00023: KeyStore file '/opt/server/standalone/configuration/application.keystore' does not exist. Used blank.
13:53:04,725 INFO  [org.jboss.as.naming] (MSC service thread 1-2) WFLYNAM0003: Starting Naming Service
13:53:04,728 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY01084: KeyStore /opt/server/standalone/configuration/application.keystore not found, it will be auto-generated on first use with a self-signed certificate for host localhost
13:53:04,729 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0012: Started server default-server.
13:53:04,732 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0006: Undertow HTTP listener default listening on 0.0.0.0:8080
13:53:04,732 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) Queuing requests.
13:53:04,732 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0018: Host default-host starting
13:53:04,847 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-1) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/server/standalone/deployments
13:53:05,436 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0207: Starting subdeployment (runtime-name: "sihdg-api.war")
13:53:10,554 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0001: /content/sihdg-3.13.0.4.ear/sihdg-api.war/WEB-INF/jboss-deployment-structure.xml in subdeployment ignored. jboss-deployment-structure.xml is only parsed for top level deployments.
13:53:11,132 INFO  [org.jboss.as.jpa] (MSC service thread 1-2) WFLYJPA0002: Read persistence.xml for sihdgDS
13:53:11,445 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV6020260: Second level cache enabled for sihdg-3.13.0.4.ear/sihdg-api.war#sihdgDS
13:53:11,553 INFO  [org.jboss.weld.deployer] (MSC service thread 1-2) WFLYWELD0003: Processing weld deployment sihdg-3.13.0.4.ear
13:53:11,930 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-2) HV000001: Hibernate Validator 8.0.2.Final-redhat-00001
13:53:12,231 INFO  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0003: Processing weld deployment sihdg-api.war
13:53:12,344 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 42) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.marshalling.jboss.JBossMarshaller'
13:53:12,544 INFO  [org.jboss.weld.Version] (MSC service thread 1-1) WELD-000900: 5.1.6 (redhat)
13:53:12,727 INFO  [org.jipijapa] (MSC service thread 1-1) JIPIORMV6020260: Second level cache enabled for sihdg-3.13.0.4.ear/sihdg-api.war#sihdgDS
13:53:12,741 WARN  [org.jboss.as.jaxrs] (MSC service thread 1-1) WFLYRS0018: Explicit usage of Jackson annotation in a Jakarta RESTful Web Services deployment; the system will disable Jakarta JSON Binding processing for the current deployment. Consider setting the 'resteasy.preferJacksonOverJsonB' property to 'false' to restore Jakarta JSON Binding.
13:53:13,126 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("deploy") failed - address: ([("deployment" => "sihdg-3.13.0.4.ear")]) - failure description: {
    "WFLYCTL0412: Required services that are not installed:" => [
        "jboss.naming.context.java.module.\"sihdg-3.13.0.4\".sihdg-api.TimerService",
        "jboss.naming.context.java.jboss.jdbc.sihdgDS"
    ],
    "WFLYCTL0180: Services with missing/unavailable dependencies" => [
        "jboss.naming.context.java.module.\"sihdg-3.13.0.4\".sihdg-api.env.\"br.gov.caixa.arquitetura.javaee.core.comum.servico.ControleCacheTask\".timerService is missing [jboss.naming.context.java.module.\"sihdg-3.13.0.4\".sihdg-api.TimerService]",
        "jboss.persistenceunit.\"sihdg-3.13.0.4.ear/sihdg-api.war#sihdgDS\" is missing [jboss.naming.context.java.jboss.jdbc.sihdgDS]",
        "jboss.persistenceunit.\"sihdg-3.13.0.4.ear/sihdg-api.war#sihdgDS\".__FIRST_PHASE__ is missing [jboss.naming.context.java.jboss.jdbc.sihdgDS]"
    ]
}
13:53:13,131 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 26) WFLYSRV0010: Deployed "sihdg-3.13.0.4.ear" (runtime-name : "sihdg-3.13.0.4.ear")
13:53:13,133 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0183: Service status report
WFLYCTL0184:    New missing/unsatisfied dependencies:
      service jboss.naming.context.java.jboss.jdbc.sihdgDS (missing) dependents: [service jboss.persistenceunit."sihdg-3.13.0.4.ear/sihdg-api.war#sihdgDS", service jboss.persistenceunit."sihdg-3.13.0.4.ear/sihdg-api.war#sihdgDS".__FIRST_PHASE__]
      service jboss.naming.context.java.module."sihdg-3.13.0.4".sihdg-api.TimerService (missing) dependents: [service jboss.naming.context.java.module."sihdg-3.13.0.4".sihdg-api.env."br.gov.caixa.arquitetura.javaee.core.comum.servico.ControleCacheTask".timerService]
WFLYCTL0448: 30 additional services are down due to their dependencies being missing or failed
13:53:13,152 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
13:53:13,153 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://0.0.0.0:9990/management
13:53:13,153 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0054: Admin console is not enabled
13:53:13,154 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) started (with errors) in 9315ms - Started 303 of 416 services (35 services failed or missing dependencies, 149 services are lazy, passive or on-demand) - Server configuration file in use: standalone.xml
ERROR *** WildFly wrapper process (1) received TERM signal ***
13:54:29,443 INFO  [org.jboss.as.server] (management-handler-thread - 1) WFLYSRV0211: Suspending server with 60000 ms timeout.
13:54:29,445 INFO  [org.jboss.as.server] (Management Triggered Shutdown) WFLYSRV0241: Shutting down in response to management operation 'shutdown'
13:54:29,451 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0019: Host default-host stopping
13:54:29,451 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0008: Undertow HTTP listener default suspending
13:54:29,452 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0007: Undertow HTTP listener default stopped, was bound to 0.0.0.0:8080
13:54:29,526 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0004: Undertow 2.3.23.SP3-redhat-00001 stopping
13:54:29,543 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0208: Stopped subdeployment (runtime-name: sihdg-api.war) in 95ms
13:54:29,547 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0028: Stopped deployment sihdg-3.13.0.4.ear (runtime-name: sihdg-3.13.0.4.ear) in 100ms
13:54:29,548 INFO  [org.jboss.as] (MSC service thread 1-1) WFLYSRV0050: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) stopped in 101ms
[p981778@cadsvaprlx067 ~]$ oc rsh sihdg-jboss8-des-30-r9cbg
Error from server (Forbidden): pods "sihdg-jboss8-des-30-r9cbg" is forbidden: User "p981778@corp.caixa.gov.br" cannot create resource "pods/exec" in API group "" in the namespace "sihdg-des"
[p981778@cadsvaprlx067 ~]$



