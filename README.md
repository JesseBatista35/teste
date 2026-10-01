2026-10-01T13:18:46.3562470Z ##[debug]Evaluating condition for step: 'Verificando Status do Deployment'
2026-10-01T13:18:46.3562993Z ##[debug]Evaluating: succeeded()
2026-10-01T13:18:46.3563146Z ##[debug]Evaluating succeeded:
2026-10-01T13:18:46.3563420Z ##[debug]=> True
2026-10-01T13:18:46.3563581Z ##[debug]Result: True
2026-10-01T13:18:46.3563773Z ##[section]Starting: Verificando Status do Deployment
2026-10-01T13:18:46.3567108Z ==============================================================================
2026-10-01T13:18:46.3567228Z Task         : Bash
2026-10-01T13:18:46.3567273Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-01T13:18:46.3567349Z Version      : 3.227.0
2026-10-01T13:18:46.3567392Z Author       : Microsoft Corporation
2026-10-01T13:18:46.3567444Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-01T13:18:46.3567533Z ==============================================================================
2026-10-01T13:18:46.4167340Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-10-01T13:18:46.4855652Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-10-01T13:18:46.4862724Z ##[debug]loading inputs and endpoints
2026-10-01T13:18:46.4869975Z ##[debug]loading INPUT_TARGETTYPE
2026-10-01T13:18:46.4877160Z ##[debug]loading INPUT_FILEPATH
2026-10-01T13:18:46.4878414Z ##[debug]loading INPUT_SCRIPT
2026-10-01T13:18:46.4879109Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-10-01T13:18:46.4879736Z ##[debug]loading INPUT_FAILONSTDERR
2026-10-01T13:18:46.4880416Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-10-01T13:18:46.4881093Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-10-01T13:18:46.4883303Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-10-01T13:18:46.4888318Z ##[debug]loading SECRET_FORTIFY_PASS
2026-10-01T13:18:46.4889984Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-10-01T13:18:46.4891596Z ##[debug]loading SECRET_PASSWORD_CGC
2026-10-01T13:18:46.4893509Z ##[debug]loading SECRET_PW_ISILON
2026-10-01T13:18:46.4895182Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-10-01T13:18:46.4896434Z ##[debug]loading SECRET_AZPAT
2026-10-01T13:18:46.4897463Z ##[debug]loading SECRET_TOKEN_CRQ
2026-10-01T13:18:46.4898078Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-10-01T13:18:46.4898676Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-10-01T13:18:46.4899402Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-10-01T13:18:46.4900022Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-10-01T13:18:46.4900565Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-10-01T13:18:46.4901967Z ##[debug]loading SECRET_PW_ALOCAIP
2026-10-01T13:18:46.4902462Z ##[debug]loading SECRET_DATASOURCE_PASSWORD
2026-10-01T13:18:46.4903030Z ##[debug]loaded 22
2026-10-01T13:18:46.4908466Z ##[debug]Agent.ProxyUrl=undefined
2026-10-01T13:18:46.4908970Z ##[debug]Agent.CAInfo=undefined
2026-10-01T13:18:46.4909233Z ##[debug]Agent.ClientCert=undefined
2026-10-01T13:18:46.4909528Z ##[debug]Agent.SkipCertValidation=True
2026-10-01T13:18:46.4923590Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-01T13:18:46.4925751Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-01T13:18:46.4926082Z ##[debug]system.culture=en-US
2026-10-01T13:18:46.4933606Z ##[debug]failOnStderr=false
2026-10-01T13:18:46.4935455Z ##[debug]workingDirectory=/opt/ads-agent/_work/r57/a
2026-10-01T13:18:46.4935736Z ##[debug]check path : /opt/ads-agent/_work/r57/a
2026-10-01T13:18:46.4936337Z ##[debug]targetType=inline
2026-10-01T13:18:46.4936630Z ##[debug]bashEnvValue=undefined
2026-10-01T13:18:46.4937375Z ##[debug]script=if [[ -n "$SITE" && "$SITE" =~ (okd4|ocp|openshift) ]];
then
  app="sihdg-jboss8-tqs"
else
  app="sihdg-jboss8-tqs-esteiras"
fi

oc rollout status deploymentconfig/"$app"  --request-timeout=600 -n sihdg-tqs
if [ "$?" -ne "0" ]; then
  echo "A aplicação não foi iniciada com sucesso!"
  echo "Os logs da aplicação estão disponíveis na próxima task: Logs da Aplicação"
  exit 1
fi
2026-10-01T13:18:46.4945725Z Generating script.
2026-10-01T13:18:46.4947521Z ##[debug]which 'bash'
2026-10-01T13:18:46.4953429Z ##[debug]found: '/usr/bin/bash'
2026-10-01T13:18:46.4953931Z ##[debug]Agent.Version=3.236.1
2026-10-01T13:18:46.4954600Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-10-01T13:18:46.4954856Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-10-01T13:18:46.4957179Z ========================== Starting Command Output ===========================
2026-10-01T13:18:46.4958303Z ##[debug]which '/usr/bin/bash'
2026-10-01T13:18:46.4959277Z ##[debug]found: '/usr/bin/bash'
2026-10-01T13:18:46.4959882Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/d49c2a18-bbc4-4152-a7df-9744e1240c8d.sh
2026-10-01T13:18:46.4962173Z ##[debug]exec tool: /usr/bin/bash
2026-10-01T13:18:46.4962506Z ##[debug]arguments:
2026-10-01T13:18:46.4963086Z ##[debug]   /opt/ads-agent/_work/_temp/d49c2a18-bbc4-4152-a7df-9744e1240c8d.sh
2026-10-01T13:18:46.4964396Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/d49c2a18-bbc4-4152-a7df-9744e1240c8d.sh
2026-10-01T13:18:46.5997192Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-10-01T13:18:48.8312468Z ##[debug]Agent environment resources - Disk: / Available 71879.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 17.10%
2026-10-01T13:18:49.8164765Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-10-01T13:18:50.0371935Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-10-01T13:18:53.8313533Z ##[debug]Agent environment resources - Disk: / Available 71879.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 15.48%
2026-10-01T13:18:58.8317488Z ##[debug]Agent environment resources - Disk: / Available 71879.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 14.11%
2026-10-01T13:19:03.8323713Z ##[debug]Agent environment resources - Disk: / Available 71879.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 12.96%
2026-10-01T13:19:08.8330749Z ##[debug]Agent environment resources - Disk: / Available 71879.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 12.02%
2026-10-01T13:19:13.8341010Z ##[debug]Agent environment resources - Disk: / Available 71879.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 11.18%
2026-10-01T13:19:18.8350163Z ##[debug]Agent environment resources - Disk: / Available 71879.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 10.46%
2026-10-01T13:19:23.8355525Z ##[debug]Agent environment resources - Disk: / Available 71879.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 9.84%
2026-10-01T13:19:28.8380446Z ##[debug]Agent environment resources - Disk: / Available 71871.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 9.28%
2026-10-01T13:19:33.8390159Z ##[debug]Agent environment resources - Disk: / Available 71871.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 8.79%
2026-10-01T13:19:38.8394103Z ##[debug]Agent environment resources - Disk: / Available 71871.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 8.37%
2026-10-01T13:19:43.8411400Z ##[debug]Agent environment resources - Disk: / Available 71871.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.96%
2026-10-01T13:19:48.8413351Z ##[debug]Agent environment resources - Disk: / Available 71871.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.59%
2026-10-01T13:19:53.8420593Z ##[debug]Agent environment resources - Disk: / Available 71871.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.27%
2026-10-01T13:19:58.8423918Z ##[debug]Agent environment resources - Disk: / Available 71871.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.96%
2026-10-01T13:20:03.8427561Z ##[debug]Agent environment resources - Disk: / Available 71991.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.68%
2026-10-01T13:20:08.8440037Z ##[debug]Agent environment resources - Disk: / Available 71991.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.43%
2026-10-01T13:20:13.8435010Z ##[debug]Agent environment resources - Disk: / Available 71983.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.19%
2026-10-01T13:20:18.8450610Z ##[debug]Agent environment resources - Disk: / Available 71983.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.97%
2026-10-01T13:20:23.8454525Z ##[debug]Agent environment resources - Disk: / Available 71983.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.77%
2026-10-01T13:20:28.8470207Z ##[debug]Agent environment resources - Disk: / Available 71983.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.58%
2026-10-01T13:20:33.8474965Z ##[debug]Agent environment resources - Disk: / Available 71975.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.40%
2026-10-01T13:20:38.8493695Z ##[debug]Agent environment resources - Disk: / Available 71975.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.24%
2026-10-01T13:20:43.8510587Z ##[debug]Agent environment resources - Disk: / Available 71975.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.08%
2026-10-01T13:20:48.8513380Z ##[debug]Agent environment resources - Disk: / Available 71975.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.94%
2026-10-01T13:20:53.8521158Z ##[debug]Agent environment resources - Disk: / Available 71975.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.80%
2026-10-01T13:20:58.8525538Z ##[debug]Agent environment resources - Disk: / Available 71975.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.66%
2026-10-01T13:21:03.8540419Z ##[debug]Agent environment resources - Disk: / Available 71975.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.55%
2026-10-01T13:21:08.8548693Z ##[debug]Agent environment resources - Disk: / Available 71975.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.43%
2026-10-01T13:21:13.8555611Z ##[debug]Agent environment resources - Disk: / Available 71967.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.31%
2026-10-01T13:21:18.8570620Z ##[debug]Agent environment resources - Disk: / Available 71965.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.21%
2026-10-01T13:21:23.8572889Z ##[debug]Agent environment resources - Disk: / Available 71965.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.11%
2026-10-01T13:21:28.8579570Z ##[debug]Agent environment resources - Disk: / Available 71965.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.02%
2026-10-01T13:21:33.8583378Z ##[debug]Agent environment resources - Disk: / Available 71959.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.92%
2026-10-01T13:21:38.8588065Z ##[debug]Agent environment resources - Disk: / Available 71955.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.84%
2026-10-01T13:21:43.8584732Z ##[debug]Agent environment resources - Disk: / Available 71947.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.76%
2026-10-01T13:21:48.8591544Z ##[debug]Agent environment resources - Disk: / Available 71947.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.68%
2026-10-01T13:21:53.8594102Z ##[debug]Agent environment resources - Disk: / Available 71947.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.60%
2026-10-01T13:21:58.8602752Z ##[debug]Agent environment resources - Disk: / Available 71947.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.53%
2026-10-01T13:22:03.8603445Z ##[debug]Agent environment resources - Disk: / Available 71947.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.46%
2026-10-01T13:22:08.8607568Z ##[debug]Agent environment resources - Disk: / Available 71946.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.39%
2026-10-01T13:22:13.8617376Z ##[debug]Agent environment resources - Disk: / Available 71938.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.33%
2026-10-01T13:22:18.8624835Z ##[debug]Agent environment resources - Disk: / Available 71938.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.27%
2026-10-01T13:22:23.8642436Z ##[debug]Agent environment resources - Disk: / Available 71938.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.21%
2026-10-01T13:22:28.8647486Z ##[debug]Agent environment resources - Disk: / Available 71938.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.16%
2026-10-01T13:22:33.8653569Z ##[debug]Agent environment resources - Disk: / Available 71938.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.10%
2026-10-01T13:22:38.8660883Z ##[debug]Agent environment resources - Disk: / Available 71943.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.05%
2026-10-01T13:22:43.8662931Z ##[debug]Agent environment resources - Disk: / Available 71935.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.99%
2026-10-01T13:22:48.8668082Z ##[debug]Agent environment resources - Disk: / Available 71935.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.95%
2026-10-01T13:22:53.8677739Z ##[debug]Agent environment resources - Disk: / Available 71935.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.90%
2026-10-01T13:22:58.8686950Z ##[debug]Agent environment resources - Disk: / Available 71935.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.85%
2026-10-01T13:23:03.8699740Z ##[debug]Agent environment resources - Disk: / Available 71935.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.81%
2026-10-01T13:23:08.8694827Z ##[debug]Agent environment resources - Disk: / Available 71935.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.77%
2026-10-01T13:23:13.8711886Z ##[debug]Agent environment resources - Disk: / Available 71935.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.73%
2026-10-01T13:23:18.8716630Z ##[debug]Agent environment resources - Disk: / Available 71935.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.69%
2026-10-01T13:23:23.8728898Z ##[debug]Agent environment resources - Disk: / Available 71927.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.65%
2026-10-01T13:23:28.8735367Z ##[debug]Agent environment resources - Disk: / Available 71927.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.61%
2026-10-01T13:23:33.8744967Z ##[debug]Agent environment resources - Disk: / Available 71927.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.57%
2026-10-01T13:23:38.8760450Z ##[debug]Agent environment resources - Disk: / Available 71927.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.54%
2026-10-01T13:23:43.8766943Z ##[debug]Agent environment resources - Disk: / Available 71927.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.50%
2026-10-01T13:23:48.8782744Z ##[debug]Agent environment resources - Disk: / Available 71926.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.47%
2026-10-01T13:23:53.8792773Z ##[debug]Agent environment resources - Disk: / Available 71926.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.44%
2026-10-01T13:23:58.8791947Z ##[debug]Agent environment resources - Disk: / Available 71926.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.40%
2026-10-01T13:24:03.8801632Z ##[debug]Agent environment resources - Disk: / Available 71918.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.38%
2026-10-01T13:24:08.8804405Z ##[debug]Agent environment resources - Disk: / Available 71918.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.35%
2026-10-01T13:24:13.8816250Z ##[debug]Agent environment resources - Disk: / Available 71918.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.32%
2026-10-01T13:24:18.8824085Z ##[debug]Agent environment resources - Disk: / Available 71918.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.29%
2026-10-01T13:24:23.8834953Z ##[debug]Agent environment resources - Disk: / Available 71918.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.26%
2026-10-01T13:24:28.8846729Z ##[debug]Agent environment resources - Disk: / Available 71918.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.23%
2026-10-01T13:24:33.8859504Z ##[debug]Agent environment resources - Disk: / Available 71886.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.21%
2026-10-01T13:24:38.8858826Z ##[debug]Agent environment resources - Disk: / Available 71886.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.18%
2026-10-01T13:24:43.8861704Z ##[debug]Agent environment resources - Disk: / Available 71886.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.15%
2026-10-01T13:24:46.3600974Z ##[debug]Started cancellation of executing script
2026-10-01T13:24:46.3609246Z ##[debug]Exit code null received from tool '/usr/bin/bash'
2026-10-01T13:24:53.8669416Z ##[error]The task has timed out.
2026-10-01T13:24:53.8670529Z ##[section]Finishing: Verificando Status do Deployment



2026-10-01T13:24:53.8691987Z ##[debug]Evaluating condition for step: 'Logs da Aplicação'
2026-10-01T13:24:53.8692549Z ##[debug]Evaluating: always()
2026-10-01T13:24:53.8692689Z ##[debug]Evaluating always:
2026-10-01T13:24:53.8693448Z ##[debug]=> True
2026-10-01T13:24:53.8693660Z ##[debug]Result: True
2026-10-01T13:24:53.8693852Z ##[section]Starting: Logs da Aplicação
2026-10-01T13:24:53.8697130Z ==============================================================================
2026-10-01T13:24:53.8697221Z Task         : Bash
2026-10-01T13:24:53.8697264Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-01T13:24:53.8697335Z Version      : 3.227.0
2026-10-01T13:24:53.8697380Z Author       : Microsoft Corporation
2026-10-01T13:24:53.8697432Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-01T13:24:53.8697528Z ==============================================================================
2026-10-01T13:24:53.9429457Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-10-01T13:24:54.0122948Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-10-01T13:24:54.0131788Z ##[debug]loading inputs and endpoints
2026-10-01T13:24:54.0139233Z ##[debug]loading INPUT_TARGETTYPE
2026-10-01T13:24:54.0147202Z ##[debug]loading INPUT_FILEPATH
2026-10-01T13:24:54.0148843Z ##[debug]loading INPUT_SCRIPT
2026-10-01T13:24:54.0149183Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-10-01T13:24:54.0149880Z ##[debug]loading INPUT_FAILONSTDERR
2026-10-01T13:24:54.0150730Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-10-01T13:24:54.0151327Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-10-01T13:24:54.0153333Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-10-01T13:24:54.0158585Z ##[debug]loading SECRET_FORTIFY_PASS
2026-10-01T13:24:54.0160003Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-10-01T13:24:54.0161508Z ##[debug]loading SECRET_PASSWORD_CGC
2026-10-01T13:24:54.0163409Z ##[debug]loading SECRET_PW_ISILON
2026-10-01T13:24:54.0165007Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-10-01T13:24:54.0166226Z ##[debug]loading SECRET_AZPAT
2026-10-01T13:24:54.0166869Z ##[debug]loading SECRET_TOKEN_CRQ
2026-10-01T13:24:54.0167539Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-10-01T13:24:54.0168121Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-10-01T13:24:54.0168747Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-10-01T13:24:54.0169327Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-10-01T13:24:54.0169877Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-10-01T13:24:54.0171208Z ##[debug]loading SECRET_PW_ALOCAIP
2026-10-01T13:24:54.0171756Z ##[debug]loading SECRET_DATASOURCE_PASSWORD
2026-10-01T13:24:54.0172305Z ##[debug]loaded 22
2026-10-01T13:24:54.0177181Z ##[debug]Agent.ProxyUrl=undefined
2026-10-01T13:24:54.0177532Z ##[debug]Agent.CAInfo=undefined
2026-10-01T13:24:54.0177781Z ##[debug]Agent.ClientCert=undefined
2026-10-01T13:24:54.0192710Z ##[debug]Agent.SkipCertValidation=True
2026-10-01T13:24:54.0192988Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-01T13:24:54.0195581Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-01T13:24:54.0196513Z ##[debug]system.culture=en-US
2026-10-01T13:24:54.0203186Z ##[debug]failOnStderr=false
2026-10-01T13:24:54.0204898Z ##[debug]workingDirectory=/opt/ads-agent/_work/r57/a
2026-10-01T13:24:54.0205184Z ##[debug]check path : /opt/ads-agent/_work/r57/a
2026-10-01T13:24:54.0209067Z ##[debug]targetType=inline
2026-10-01T13:24:54.0209475Z ##[debug]bashEnvValue=undefined
2026-10-01T13:24:54.0210079Z ##[debug]script=#!/bin/bash
set -o errexit
set -o pipefail
set -x

shopt -s expand_aliases

if [[ -n "$SITE" && "okd4_nprd" =~ "ocp" ]]
then
  app="sihdg-jboss8-tqs"

  arquivo="/usr/local/bin/oc-v4.13"
  if [ -e "$arquivo" ]; then 
    alias oc="$arquivo"
  fi
elif [[ -n "$SITE" && "$SITE" =~ (okd4|openshift) ]];
then
app="sihdg-jboss8-tqs"
else
  app="sihdg-jboss8-tqs-esteiras"
fi

oc version

last_pod=$(oc get pod -l name="$app" -n sihdg-tqs -o jsonpath='{range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp  | tac | grep -v '^$' | head -n1)

echo "Logs do POD: $last_pod"
oc logs $last_pod -c "$app" -n sihdg-tqs
2026-10-01T13:24:54.0216898Z Generating script.
2026-10-01T13:24:54.0219932Z ##[debug]which 'bash'
2026-10-01T13:24:54.0228349Z ##[debug]found: '/usr/bin/bash'
2026-10-01T13:24:54.0229252Z ##[debug]Agent.Version=3.236.1
2026-10-01T13:24:54.0229503Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-10-01T13:24:54.0229777Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-10-01T13:24:54.0233591Z ========================== Starting Command Output ===========================
2026-10-01T13:24:54.0235514Z ##[debug]which '/usr/bin/bash'
2026-10-01T13:24:54.0236808Z ##[debug]found: '/usr/bin/bash'
2026-10-01T13:24:54.0237986Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/f70298ad-75ef-48ef-8e16-cc94009bbb89.sh
2026-10-01T13:24:54.0241702Z ##[debug]exec tool: /usr/bin/bash
2026-10-01T13:24:54.0241962Z ##[debug]arguments:
2026-10-01T13:24:54.0242240Z ##[debug]   /opt/ads-agent/_work/_temp/f70298ad-75ef-48ef-8e16-cc94009bbb89.sh
2026-10-01T13:24:54.0245766Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/f70298ad-75ef-48ef-8e16-cc94009bbb89.sh
2026-10-01T13:24:54.0323343Z + shopt -s expand_aliases
2026-10-01T13:24:54.0323554Z + [[ -n okd4_nprd ]]
2026-10-01T13:24:54.0323691Z + [[ okd4_nprd =~ ocp ]]
2026-10-01T13:24:54.0323855Z + [[ -n okd4_nprd ]]
2026-10-01T13:24:54.0323963Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-10-01T13:24:54.0324119Z + app=sihdg-jboss8-tqs
2026-10-01T13:24:54.0324320Z + oc version
2026-10-01T13:24:54.0952033Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-10-01T13:24:54.0952376Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-10-01T13:24:54.0952630Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-10-01T13:24:54.0984642Z ++ oc get pod -l name=sihdg-jboss8-tqs -n sihdg-tqs -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-10-01T13:24:54.0986519Z ++ tac
2026-10-01T13:24:54.0986669Z ++ grep -v '^$'
2026-10-01T13:24:54.0986788Z ++ head -n1
2026-10-01T13:24:54.2264943Z + last_pod=sihdg-jboss8-tqs-23-lwc7w
2026-10-01T13:24:54.2265307Z + echo 'Logs do POD: sihdg-jboss8-tqs-23-lwc7w'
2026-10-01T13:24:54.2265519Z + oc logs sihdg-jboss8-tqs-23-lwc7w -c sihdg-jboss8-tqs -n sihdg-tqs
2026-10-01T13:24:54.2265724Z Logs do POD: sihdg-jboss8-tqs-23-lwc7w
2026-10-01T13:24:54.3184717Z Using openshift launcher.
2026-10-01T13:24:54.3185271Z 2026-10-01 13:24:51 Launching WildFly Server
2026-10-01T13:24:54.3185420Z INFO Access log is disabled, ignoring configuration.
2026-10-01T13:24:54.3185587Z INFO Clustering feature is not enabled, no jgroups subsystem present in server configuration.
2026-10-01T13:24:54.3186540Z INFO Server started in admin mode, CLI script executed during server boot.
2026-10-01T13:24:54.3187376Z INFO Running jboss-eap-8/eap8-openjdk21-builder-openshift-rhel9 image, version 1.0.1.GA
2026-10-01T13:24:54.3188398Z JAVA_OPTS already set in environment; overriding default settings with values:  -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider -Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks  -Djava.security.properties=/opt/server/bin/java.security.override
2026-10-01T13:24:54.3189200Z =========================================================================
2026-10-01T13:24:54.3189274Z 
2026-10-01T13:24:54.3189583Z   JBoss Bootstrap Environment
2026-10-01T13:24:54.3189657Z 
2026-10-01T13:24:54.3189786Z   JBOSS_HOME: /opt/server
2026-10-01T13:24:54.3189830Z 
2026-10-01T13:24:54.3190017Z   JAVA: /usr/lib/jvm/java-21/bin/java
2026-10-01T13:24:54.3190196Z 
2026-10-01T13:24:54.3192015Z   JAVA_OPTS:  -Xlog:gc*:file="/opt/server/standalone/log/gc.log":time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter="maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000"  -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider -Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks  -Djava.security.properties=/opt/server/bin/java.security.override  --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-exports=jdk.naming.dns/com.sun.jndi.dns=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED
2026-10-01T13:24:54.3193159Z 
2026-10-01T13:24:54.3193298Z =========================================================================
2026-10-01T13:24:54.3193367Z 
2026-10-01T13:24:54.3193634Z [0m10:24:52,325 INFO  [org.jboss.modules] (main) JBoss Modules version 2.1.6.Final-redhat-00001
2026-10-01T13:24:54.3193954Z [0m[0m10:24:53,036 INFO  [org.jboss.msc] (main) JBoss MSC version 1.5.5.Final-redhat-00001
2026-10-01T13:24:54.3194342Z [0m[0m10:24:53,041 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
2026-10-01T13:24:54.3194769Z [0m[0m10:24:53,223 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) starting
2026-10-01T13:24:54.3195060Z [0m[32m10:24:53,224 DEBUG [org.jboss.as.config] (MSC service thread 1-2) Configured system properties:
2026-10-01T13:24:54.3195290Z 	[Standalone] = 
2026-10-01T13:24:54.3195418Z 	file.encoding = UTF-8
2026-10-01T13:24:54.3195530Z 	file.separator = /
2026-10-01T13:24:54.3195743Z 	java.class.path = /opt/server/jboss-modules.jar
2026-10-01T13:24:54.3195927Z 	java.class.version = 65.0
2026-10-01T13:24:54.3196195Z 	java.home = /usr/lib/jvm/java-21-openjdk-21.0.10.0.7-1.el9.x86_64
2026-10-01T13:24:54.3196368Z 	java.io.tmpdir = /tmp
2026-10-01T13:24:54.3196511Z 	java.library.path = /usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib
2026-10-01T13:24:54.3196669Z 	java.net.preferIPv4Stack = true
2026-10-01T13:24:54.3196812Z 	java.runtime.name = OpenJDK Runtime Environment
2026-10-01T13:24:54.3196981Z 	java.runtime.version = 21.0.10+7-LTS
2026-10-01T13:24:54.3197164Z 	java.security.egd = file:/dev/./urandom
2026-10-01T13:24:54.3197348Z 	java.security.properties = /opt/server/bin/java.security.override
2026-10-01T13:24:54.3197544Z 	java.specification.name = Java Platform API Specification
2026-10-01T13:24:54.3197726Z 	java.specification.vendor = Oracle Corporation
2026-10-01T13:24:54.3197855Z 	java.specification.version = 21
2026-10-01T13:24:54.3198001Z 	java.util.logging.manager = org.jboss.logmanager.LogManager
2026-10-01T13:24:54.3198269Z 	java.vendor = Red Hat, Inc.
2026-10-01T13:24:54.3198468Z 	java.vendor.url = https://www.redhat.com/
2026-10-01T13:24:54.3198677Z 	java.vendor.url.bug = https://access.redhat.com/support/cases/
2026-10-01T13:24:54.3198939Z 	java.vendor.version = (Red_Hat-21.0.10.0.7-1)
2026-10-01T13:24:54.3199083Z 	java.version = 21.0.10
2026-10-01T13:24:54.3199242Z 	java.version.date = 2026-01-20
2026-10-01T13:24:54.3199382Z 	java.vm.compressedOopsMode = 32-bit
2026-10-01T13:24:54.3199564Z 	java.vm.info = mixed mode, sharing
2026-10-01T13:24:54.3199800Z 	java.vm.name = OpenJDK 64-Bit Server VM
2026-10-01T13:24:54.3199942Z 	java.vm.specification.name = Java Virtual Machine Specification
2026-10-01T13:24:54.3200092Z 	java.vm.specification.vendor = Oracle Corporation
2026-10-01T13:24:54.3200294Z 	java.vm.specification.version = 21
2026-10-01T13:24:54.3200475Z 	java.vm.vendor = Red Hat, Inc.
2026-10-01T13:24:54.3200636Z 	java.vm.version = 21.0.10+7-LTS
2026-10-01T13:24:54.3200859Z 	javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
2026-10-01T13:24:54.3201219Z 	javax.net.ssl.trustStore = /opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks
2026-10-01T13:24:54.3201432Z 	jboss.bind.address = 25.3.24.96
2026-10-01T13:24:54.3201593Z 	jboss.bind.address.management = 0.0.0.0
2026-10-01T13:24:54.3201768Z 	jboss.bind.address.private = 25.3.24.96
2026-10-01T13:24:54.3201949Z 	jboss.home.dir = /opt/server
2026-10-01T13:24:54.3202200Z 	jboss.host.name = sihdg-jboss8-tqs-23-lwc7w
2026-10-01T13:24:54.3202388Z 	jboss.messaging.cluster.password = <redacted>
2026-10-01T13:24:54.3202580Z 	jboss.messaging.host = 25.3.24.96
2026-10-01T13:24:54.3202819Z 	jboss.modules.system.pkgs = jdk.nashorn.api,com.sun.crypto.provider
2026-10-01T13:24:54.3203079Z 	jboss.node.name = sihdg-jboss8-tqs-23-lwc7w
2026-10-01T13:24:54.3203324Z 	jboss.qualified.host.name = sihdg-jboss8-tqs-23-lwc7w
2026-10-01T13:24:54.3203521Z 	jboss.server.base.dir = /opt/server/standalone
2026-10-01T13:24:54.3203713Z 	jboss.server.config.dir = /opt/server/standalone/configuration
2026-10-01T13:24:54.3203924Z 	jboss.server.data.dir = /opt/server/standalone/data
2026-10-01T13:24:54.3204111Z 	jboss.server.log.dir = /opt/server/standalone/log
2026-10-01T13:24:54.3204465Z 	jboss.server.name = sihdg-jboss8-tqs-23-lwc7w
2026-10-01T13:24:54.3204654Z 	jboss.server.persist.config = true
2026-10-01T13:24:54.3204820Z 	jboss.server.temp.dir = /opt/server/standalone/tmp
2026-10-01T13:24:54.3205058Z 	jboss.tx.node.id = hdg-jboss8-tqs-23-lwc7w
2026-10-01T13:24:54.3205234Z 	jdk.debug = release
2026-10-01T13:24:54.3205436Z 	jdk.serialFilter = maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
2026-10-01T13:24:54.3205632Z 	line.separator = 
2026-10-01T13:24:54.3205690Z 
2026-10-01T13:24:54.3205872Z 	logging.configuration = file:/opt/server/standalone/configuration/logging.properties
2026-10-01T13:24:54.3206088Z 	module.path = /opt/server/modules
2026-10-01T13:24:54.3206294Z 	native.encoding = ANSI_X3.4-1968
2026-10-01T13:24:54.3206483Z 	org.jboss.boot.log.file = /opt/server/standalone/log/server.log
2026-10-01T13:24:54.3206662Z 	org.jboss.resolver.warning = true
2026-10-01T13:24:54.3206975Z 	org.wildfly.internal.cli.boot.hook.marker.dir = /tmp/cli-boot-reload-marker-1790861091
2026-10-01T13:24:54.3207308Z 	org.wildfly.internal.cli.boot.hook.script = /tmp/cli-script-1790861091.cli
2026-10-01T13:24:54.3207634Z 	org.wildfly.internal.cli.boot.hook.script.error.file = /tmp/cli-script-error-1790861091.cli
2026-10-01T13:24:54.3207978Z 	org.wildfly.internal.cli.boot.hook.script.output.file = /tmp/cli-script-output-1790861091.cli
2026-10-01T13:24:54.3208394Z 	org.wildfly.internal.cli.boot.hook.script.properties = /tmp/cli-script-property-1790861091.cli
2026-10-01T13:24:54.3208748Z 	org.wildfly.internal.cli.boot.hook.script.warn.file = /tmp/cli-warning-1790861091.log
2026-10-01T13:24:54.3208934Z 	os.arch = amd64
2026-10-01T13:24:54.3209062Z 	os.name = Linux
2026-10-01T13:24:54.3209292Z 	os.version = 6.1.18-200.fc37.x86_64
2026-10-01T13:24:54.3209515Z 	path.separator = :
2026-10-01T13:24:54.3209692Z 	stderr.encoding = ANSI_X3.4-1968
2026-10-01T13:24:54.3209875Z 	stdout.encoding = ANSI_X3.4-1968
2026-10-01T13:24:54.3210039Z 	sun.arch.data.model = 64
2026-10-01T13:24:54.3210315Z 	sun.boot.library.path = /usr/lib/jvm/java-21-openjdk-21.0.10.0.7-1.el9.x86_64/lib
2026-10-01T13:24:54.3210526Z 	sun.cpu.endian = little
2026-10-01T13:24:54.3210827Z 	sun.io.unicode.encoding = UnicodeLittle
2026-10-01T13:24:54.3212410Z 	sun.java.command = /opt/server/jboss-modules.jar -mp /opt/server/modules org.jboss.as.standalone -Djboss.home.dir=/opt/server -Djboss.server.base.dir=/opt/server/standalone -c standalone.xml -Djboss.messaging.host=25.3.24.96 -Djboss.messaging.cluster.password=<redacted> --start-mode=admin-only -Dorg.wildfly.internal.cli.boot.hook.script=/tmp/cli-script-1790861091.cli -Dorg.wildfly.internal.cli.boot.hook.marker.dir=/tmp/cli-boot-reload-marker-1790861091 -Dorg.wildfly.internal.cli.boot.hook.script.properties=/tmp/cli-script-property-1790861091.cli -Dorg.wildfly.internal.cli.boot.hook.script.error.file=/tmp/cli-script-error-1790861091.cli -Dorg.wildfly.internal.cli.boot.hook.script.warn.file=/tmp/cli-warning-1790861091.log -Dorg.wildfly.internal.cli.boot.hook.script.output.file=/tmp/cli-script-output-1790861091.cli -Djboss.node.name=sihdg-jboss8-tqs-23-lwc7w -Djboss.tx.node.id=hdg-jboss8-tqs-23-lwc7w -bprivate 25.3.24.96 -b 25.3.24.96 -bmanagement 0.0.0.0 -Dwildfly.statistics-enabled=true
2026-10-01T13:24:54.3213300Z 	sun.java.launcher = SUN_STANDARD
2026-10-01T13:24:54.3213488Z 	sun.jnu.encoding = ANSI_X3.4-1968
2026-10-01T13:24:54.3213754Z 	sun.management.compiler = HotSpot 64-Bit Tiered Compilers
2026-10-01T13:24:54.3213930Z 	user.country = US
2026-10-01T13:24:54.3214078Z 	user.dir = /home/jboss
2026-10-01T13:24:54.3214387Z 	user.home = /home/jboss
2026-10-01T13:24:54.3214553Z 	user.language = en
2026-10-01T13:24:54.3214683Z 	user.name = jboss
2026-10-01T13:24:54.3214853Z 	user.timezone = America/Sao_Paulo
2026-10-01T13:24:54.3215080Z 	wildfly.statistics-enabled = true
2026-10-01T13:24:54.3217614Z [0m[32m10:24:53,225 DEBUG [org.jboss.as.config] (MSC service thread 1-2) VM Arguments: -D[Standalone] -Xlog:gc*:file=/opt/server/standalone/log/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider -Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djava.security.properties=/opt/server/bin/java.security.override --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-exports=jdk.naming.dns/com.sun.jndi.dns=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/opt/server/standalone/log/server.log -Dlogging.configuration=file:/opt/server/standalone/configuration/logging.properties 
2026-10-01T13:24:54.3233174Z ##[debug]Exit code 0 received from tool '/usr/bin/bash'
2026-10-01T13:24:54.3236431Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-10-01T13:24:54.3242722Z ##[debug]task result: Succeeded
2026-10-01T13:24:54.3244031Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-10-01T13:24:54.3282241Z ##[section]Finishing: Logs da Aplicação


ID = 97802 🡪 CRQ000001499711
Necessidade de comunicação entre a aplicação TQS e o banco de dados corporativo do SIHDG
Origem: SIHDG-JBOSS8-TQS  - 10.116.221.46
Destino: CBRDEDADNT002.extra.caixa.gov.br, 10.116.29.201, Porta 31153


pessola pediu a regra ja mais querem saber porque nao funcionou... esse pod ja morreu termias que rodas outro me ajuda averificar isso

