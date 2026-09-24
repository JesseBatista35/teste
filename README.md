2026-09-24T16:34:29.7941659Z ##[debug]Evaluating condition for step: 'Verificando Status do Deployment'
2026-09-24T16:34:29.7942214Z ##[debug]Evaluating: succeeded()
2026-09-24T16:34:29.7942438Z ##[debug]Evaluating succeeded:
2026-09-24T16:34:29.7942805Z ##[debug]=> True
2026-09-24T16:34:29.7943042Z ##[debug]Result: True
2026-09-24T16:34:29.7943295Z ##[section]Starting: Verificando Status do Deployment
2026-09-24T16:34:29.7946945Z ==============================================================================
2026-09-24T16:34:29.7947031Z Task         : Bash
2026-09-24T16:34:29.7947073Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-24T16:34:29.7947141Z Version      : 3.227.0
2026-09-24T16:34:29.7947185Z Author       : Microsoft Corporation
2026-09-24T16:34:29.7947234Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-24T16:34:29.7947509Z ==============================================================================
2026-09-24T16:34:29.8496388Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-24T16:34:29.9203735Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-24T16:34:29.9211164Z ##[debug]loading inputs and endpoints
2026-09-24T16:34:29.9219092Z ##[debug]loading INPUT_TARGETTYPE
2026-09-24T16:34:29.9227632Z ##[debug]loading INPUT_FILEPATH
2026-09-24T16:34:29.9228040Z ##[debug]loading INPUT_SCRIPT
2026-09-24T16:34:29.9228929Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-24T16:34:29.9229479Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-24T16:34:29.9230460Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-24T16:34:29.9230943Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-24T16:34:29.9233076Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-24T16:34:29.9238993Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-24T16:34:29.9241078Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-24T16:34:29.9242029Z ##[debug]loading SECRET_PW_ISILON
2026-09-24T16:34:29.9243941Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-24T16:34:29.9245565Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-24T16:34:29.9246984Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-24T16:34:29.9249903Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-24T16:34:29.9259430Z ##[debug]loading SECRET_AZPAT
2026-09-24T16:34:29.9260924Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-24T16:34:29.9261299Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-09-24T16:34:29.9261620Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-24T16:34:29.9261867Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-24T16:34:29.9262107Z ##[debug]loading SECRET_PW_ALOCAIP
2026-09-24T16:34:29.9262329Z ##[debug]loaded 21
2026-09-24T16:34:29.9262540Z ##[debug]Agent.ProxyUrl=undefined
2026-09-24T16:34:29.9262761Z ##[debug]Agent.CAInfo=undefined
2026-09-24T16:34:29.9262971Z ##[debug]Agent.ClientCert=undefined
2026-09-24T16:34:29.9263196Z ##[debug]Agent.SkipCertValidation=True
2026-09-24T16:34:29.9274178Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-24T16:34:29.9275887Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-24T16:34:29.9276168Z ##[debug]system.culture=en-US
2026-09-24T16:34:29.9284787Z ##[debug]failOnStderr=false
2026-09-24T16:34:29.9285871Z ##[debug]workingDirectory=/opt/ads-agent/_work/r882/a
2026-09-24T16:34:29.9286119Z ##[debug]check path : /opt/ads-agent/_work/r882/a
2026-09-24T16:34:29.9287506Z ##[debug]targetType=inline
2026-09-24T16:34:29.9287734Z ##[debug]bashEnvValue=undefined
2026-09-24T16:34:29.9288649Z ##[debug]script=if [[ -n "$SITE" && "$SITE" =~ (okd4|ocp|openshift) ]];
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
2026-09-24T16:34:29.9297107Z Generating script.
2026-09-24T16:34:29.9299296Z ##[debug]which 'bash'
2026-09-24T16:34:29.9305155Z ##[debug]found: '/usr/bin/bash'
2026-09-24T16:34:29.9305588Z ##[debug]Agent.Version=3.236.1
2026-09-24T16:34:29.9305823Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-24T16:34:29.9306049Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-24T16:34:29.9310402Z ========================== Starting Command Output ===========================
2026-09-24T16:34:29.9311891Z ##[debug]which '/usr/bin/bash'
2026-09-24T16:34:29.9313316Z ##[debug]found: '/usr/bin/bash'
2026-09-24T16:34:29.9313967Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/00b25732-75d6-4bf8-b871-0dc6d1438ae3.sh
2026-09-24T16:34:29.9316547Z ##[debug]exec tool: /usr/bin/bash
2026-09-24T16:34:29.9316753Z ##[debug]arguments:
2026-09-24T16:34:29.9316984Z ##[debug]   /opt/ads-agent/_work/_temp/00b25732-75d6-4bf8-b871-0dc6d1438ae3.sh
2026-09-24T16:34:29.9319213Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/00b25732-75d6-4bf8-b871-0dc6d1438ae3.sh
2026-09-24T16:34:30.0287201Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-09-24T16:34:31.3221933Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-09-24T16:34:31.3865054Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-09-24T16:34:34.7814242Z ##[debug]Agent environment resources - Disk: / Available 54438.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 18.90%
2026-09-24T16:34:39.7813617Z ##[debug]Agent environment resources - Disk: / Available 54438.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 17.10%
2026-09-24T16:34:44.7820635Z ##[debug]Agent environment resources - Disk: / Available 54438.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 15.58%
2026-09-24T16:34:49.7834993Z ##[debug]Agent environment resources - Disk: / Available 54438.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 14.32%
2026-09-24T16:34:54.7835653Z ##[debug]Agent environment resources - Disk: / Available 54437.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 13.26%
2026-09-24T16:34:59.7839857Z ##[debug]Agent environment resources - Disk: / Available 54437.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 12.34%
2026-09-24T16:35:04.7850215Z ##[debug]Agent environment resources - Disk: / Available 54438.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 11.56%
2026-09-24T16:35:09.7867486Z ##[debug]Agent environment resources - Disk: / Available 54438.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 10.86%
2026-09-24T16:35:14.7881408Z ##[debug]Agent environment resources - Disk: / Available 54438.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 10.25%
2026-09-24T16:35:19.7890341Z ##[debug]Agent environment resources - Disk: / Available 54438.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 9.70%
2026-09-24T16:35:24.7900764Z ##[debug]Agent environment resources - Disk: / Available 54437.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 9.23%
2026-09-24T16:35:29.7913350Z ##[debug]Agent environment resources - Disk: / Available 54438.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 8.80%
2026-09-24T16:35:34.7910495Z ##[debug]Agent environment resources - Disk: / Available 54454.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 8.39%
2026-09-24T16:35:39.7924183Z ##[debug]Agent environment resources - Disk: / Available 54454.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 8.03%
2026-09-24T16:35:44.7931887Z ##[debug]Agent environment resources - Disk: / Available 54454.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.70%
2026-09-24T16:35:49.7940279Z ##[debug]Agent environment resources - Disk: / Available 54450.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.40%
2026-09-24T16:35:54.7947504Z ##[debug]Agent environment resources - Disk: / Available 54442.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.10%
2026-09-24T16:35:59.7973789Z ##[debug]Agent environment resources - Disk: / Available 54442.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.84%
2026-09-24T16:36:04.7983733Z ##[debug]Agent environment resources - Disk: / Available 54442.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.60%
2026-09-24T16:36:09.7990600Z ##[debug]Agent environment resources - Disk: / Available 54442.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.38%
2026-09-24T16:36:14.8004362Z ##[debug]Agent environment resources - Disk: / Available 54442.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.16%
2026-09-24T16:36:19.8013249Z ##[debug]Agent environment resources - Disk: / Available 54442.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.97%
2026-09-24T16:36:24.8030865Z ##[debug]Agent environment resources - Disk: / Available 54442.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.79%
2026-09-24T16:36:29.8039018Z ##[debug]Agent environment resources - Disk: / Available 54443.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.63%
2026-09-24T16:36:34.8047518Z ##[debug]Agent environment resources - Disk: / Available 54444.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.46%
2026-09-24T16:36:39.8056997Z ##[debug]Agent environment resources - Disk: / Available 54440.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.31%
2026-09-24T16:36:44.8072483Z ##[debug]Agent environment resources - Disk: / Available 54440.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.16%
2026-09-24T16:36:49.8083320Z ##[debug]Agent environment resources - Disk: / Available 54439.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.03%
2026-09-24T16:36:54.8091555Z ##[debug]Agent environment resources - Disk: / Available 54407.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.90%
2026-09-24T16:36:59.8086987Z ##[debug]Agent environment resources - Disk: / Available 54407.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.77%
2026-09-24T16:37:04.8101347Z ##[debug]Agent environment resources - Disk: / Available 54409.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.66%
2026-09-24T16:37:09.8112540Z ##[debug]Agent environment resources - Disk: / Available 54409.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.55%
2026-09-24T16:37:14.8119802Z ##[debug]Agent environment resources - Disk: / Available 54409.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.44%
2026-09-24T16:37:19.8143472Z ##[debug]Agent environment resources - Disk: / Available 54409.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.34%
2026-09-24T16:37:24.8147145Z ##[debug]Agent environment resources - Disk: / Available 54409.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.25%
2026-09-24T16:37:29.8162971Z ##[debug]Agent environment resources - Disk: / Available 54409.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.16%
2026-09-24T16:37:34.8173336Z ##[debug]Agent environment resources - Disk: / Available 54409.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.07%
2026-09-24T16:37:39.8182296Z ##[debug]Agent environment resources - Disk: / Available 54410.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.98%
2026-09-24T16:37:44.8188812Z ##[debug]Agent environment resources - Disk: / Available 54409.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.90%
2026-09-24T16:37:49.8197691Z ##[debug]Agent environment resources - Disk: / Available 54409.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.83%
2026-09-24T16:37:54.8214592Z ##[debug]Agent environment resources - Disk: / Available 54401.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.75%
2026-09-24T16:37:59.8219108Z ##[debug]Agent environment resources - Disk: / Available 54401.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.68%
2026-09-24T16:38:04.8225127Z ##[debug]Agent environment resources - Disk: / Available 54402.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.62%
2026-09-24T16:38:09.8228250Z ##[debug]Agent environment resources - Disk: / Available 54399.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.55%
2026-09-24T16:38:14.8244626Z ##[debug]Agent environment resources - Disk: / Available 54399.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.49%
2026-09-24T16:38:19.8238932Z ##[debug]Agent environment resources - Disk: / Available 54399.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.43%
2026-09-24T16:38:24.8242762Z ##[debug]Agent environment resources - Disk: / Available 54399.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.37%
2026-09-24T16:38:29.8252226Z ##[debug]Agent environment resources - Disk: / Available 54399.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.31%
2026-09-24T16:38:34.8262921Z ##[debug]Agent environment resources - Disk: / Available 54399.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.26%
2026-09-24T16:38:39.8265154Z ##[debug]Agent environment resources - Disk: / Available 54399.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.20%
2026-09-24T16:38:44.8284078Z ##[debug]Agent environment resources - Disk: / Available 54399.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.15%
2026-09-24T16:38:49.8292395Z ##[debug]Agent environment resources - Disk: / Available 54399.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.11%
2026-09-24T16:38:54.8296760Z ##[debug]Agent environment resources - Disk: / Available 54399.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.06%
2026-09-24T16:38:59.8296029Z ##[debug]Agent environment resources - Disk: / Available 54399.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.01%
2026-09-24T16:39:04.8302743Z ##[debug]Agent environment resources - Disk: / Available 54399.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.97%
2026-09-24T16:39:09.8313292Z ##[debug]Agent environment resources - Disk: / Available 54399.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.93%
2026-09-24T16:39:14.8320124Z ##[debug]Agent environment resources - Disk: / Available 54391.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.89%
2026-09-24T16:39:19.8331401Z ##[debug]Agent environment resources - Disk: / Available 54388.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.85%
2026-09-24T16:39:24.8340903Z ##[debug]Agent environment resources - Disk: / Available 54388.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.81%
2026-09-24T16:39:29.8355479Z ##[debug]Agent environment resources - Disk: / Available 54380.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.77%
2026-09-24T16:39:34.8358082Z ##[debug]Agent environment resources - Disk: / Available 54380.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.74%
2026-09-24T16:39:39.8365005Z ##[debug]Agent environment resources - Disk: / Available 54380.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.70%
2026-09-24T16:39:44.8361927Z ##[debug]Agent environment resources - Disk: / Available 54380.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.66%
2026-09-24T16:39:49.8368164Z ##[debug]Agent environment resources - Disk: / Available 54379.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.63%
2026-09-24T16:39:54.8380014Z ##[debug]Agent environment resources - Disk: / Available 54379.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.59%
2026-09-24T16:39:59.8392636Z ##[debug]Agent environment resources - Disk: / Available 54379.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.56%
2026-09-24T16:40:04.8401821Z ##[debug]Agent environment resources - Disk: / Available 54380.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.53%
2026-09-24T16:40:09.8419170Z ##[debug]Agent environment resources - Disk: / Available 54380.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.50%
2026-09-24T16:40:14.8429524Z ##[debug]Agent environment resources - Disk: / Available 54380.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.47%
2026-09-24T16:40:19.8439381Z ##[debug]Agent environment resources - Disk: / Available 54379.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.44%
2026-09-24T16:40:24.8455843Z ##[debug]Agent environment resources - Disk: / Available 54380.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.41%
2026-09-24T16:40:29.8009246Z ##[debug]Started cancellation of executing script
2026-09-24T16:40:29.8016805Z ##[debug]Exit code null received from tool '/usr/bin/bash'
2026-09-24T16:40:37.3058995Z ##[error]The task has timed out.
2026-09-24T16:40:37.3060572Z ##[section]Finishing: Verificando Status do Deployment



2026-09-24T16:40:37.3080367Z ##[debug]Evaluating condition for step: 'Logs da Aplicação'
2026-09-24T16:40:37.3081740Z ##[debug]Evaluating: always()
2026-09-24T16:40:37.3081879Z ##[debug]Evaluating always:
2026-09-24T16:40:37.3082937Z ##[debug]=> True
2026-09-24T16:40:37.3083253Z ##[debug]Result: True
2026-09-24T16:40:37.3083484Z ##[section]Starting: Logs da Aplicação
2026-09-24T16:40:37.3088099Z ==============================================================================
2026-09-24T16:40:37.3088233Z Task         : Bash
2026-09-24T16:40:37.3088294Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-24T16:40:37.3088396Z Version      : 3.227.0
2026-09-24T16:40:37.3088463Z Author       : Microsoft Corporation
2026-09-24T16:40:37.3088537Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-24T16:40:37.3088643Z ==============================================================================
2026-09-24T16:40:37.3677619Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-24T16:40:37.4425711Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-24T16:40:37.4432583Z ##[debug]loading inputs and endpoints
2026-09-24T16:40:37.4441016Z ##[debug]loading INPUT_TARGETTYPE
2026-09-24T16:40:37.4449265Z ##[debug]loading INPUT_FILEPATH
2026-09-24T16:40:37.4449924Z ##[debug]loading INPUT_SCRIPT
2026-09-24T16:40:37.4451151Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-24T16:40:37.4451503Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-24T16:40:37.4452162Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-24T16:40:37.4452796Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-24T16:40:37.4454900Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-24T16:40:37.4460250Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-24T16:40:37.4461462Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-24T16:40:37.4463048Z ##[debug]loading SECRET_PW_ISILON
2026-09-24T16:40:37.4465027Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-24T16:40:37.4466405Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-24T16:40:37.4468688Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-24T16:40:37.4468980Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-24T16:40:37.4469214Z ##[debug]loading SECRET_AZPAT
2026-09-24T16:40:37.4469468Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-24T16:40:37.4470086Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-09-24T16:40:37.4470704Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-24T16:40:37.4471272Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-24T16:40:37.4472708Z ##[debug]loading SECRET_PW_ALOCAIP
2026-09-24T16:40:37.4473265Z ##[debug]loaded 21
2026-09-24T16:40:37.4478943Z ##[debug]Agent.ProxyUrl=undefined
2026-09-24T16:40:37.4479223Z ##[debug]Agent.CAInfo=undefined
2026-09-24T16:40:37.4479439Z ##[debug]Agent.ClientCert=undefined
2026-09-24T16:40:37.4479661Z ##[debug]Agent.SkipCertValidation=True
2026-09-24T16:40:37.4494487Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-24T16:40:37.4496432Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-24T16:40:37.4496703Z ##[debug]system.culture=en-US
2026-09-24T16:40:37.4504932Z ##[debug]failOnStderr=false
2026-09-24T16:40:37.4505752Z ##[debug]workingDirectory=/opt/ads-agent/_work/r882/a
2026-09-24T16:40:37.4506002Z ##[debug]check path : /opt/ads-agent/_work/r882/a
2026-09-24T16:40:37.4507240Z ##[debug]targetType=inline
2026-09-24T16:40:37.4507543Z ##[debug]bashEnvValue=undefined
2026-09-24T16:40:37.4508423Z ##[debug]script=#!/bin/bash
set -o errexit
set -o pipefail
set -x

shopt -s expand_aliases

if [[ -n "$SITE" && "okd4_nprd" =~ "ocp" ]]
then
  app="sihdg-jboss8-des"

  arquivo="/usr/local/bin/oc-v4.13"
  if [ -e "$arquivo" ]; then 
    alias oc="$arquivo"
  fi
elif [[ -n "$SITE" && "$SITE" =~ (okd4|openshift) ]];
then
app="sihdg-jboss8-des"
else
  app="sihdg-jboss8-des-esteiras"
fi

oc version

last_pod=$(oc get pod -l name="$app" -n sihdg-des -o jsonpath='{range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp  | tac | grep -v '^$' | head -n1)

echo "Logs do POD: $last_pod"
oc logs $last_pod -c "$app" -n sihdg-des
2026-09-24T16:40:37.4516604Z Generating script.
2026-09-24T16:40:37.4520636Z ##[debug]which 'bash'
2026-09-24T16:40:37.4527210Z ##[debug]found: '/usr/bin/bash'
2026-09-24T16:40:37.4527901Z ##[debug]Agent.Version=3.236.1
2026-09-24T16:40:37.4528127Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-24T16:40:37.4528370Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-24T16:40:37.4531200Z ========================== Starting Command Output ===========================
2026-09-24T16:40:37.4532381Z ##[debug]which '/usr/bin/bash'
2026-09-24T16:40:37.4533254Z ##[debug]found: '/usr/bin/bash'
2026-09-24T16:40:37.4533944Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/5db33889-0861-405b-92f7-dd95613f4db3.sh
2026-09-24T16:40:37.4536316Z ##[debug]exec tool: /usr/bin/bash
2026-09-24T16:40:37.4536534Z ##[debug]arguments:
2026-09-24T16:40:37.4536776Z ##[debug]   /opt/ads-agent/_work/_temp/5db33889-0861-405b-92f7-dd95613f4db3.sh
2026-09-24T16:40:37.4539117Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/5db33889-0861-405b-92f7-dd95613f4db3.sh
2026-09-24T16:40:37.4606117Z + shopt -s expand_aliases
2026-09-24T16:40:37.4606311Z + [[ -n okd4_nprd ]]
2026-09-24T16:40:37.4606422Z + [[ okd4_nprd =~ ocp ]]
2026-09-24T16:40:37.4606554Z + [[ -n okd4_nprd ]]
2026-09-24T16:40:37.4606663Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-09-24T16:40:37.4606806Z + app=sihdg-jboss8-des
2026-09-24T16:40:37.4606901Z + oc version
2026-09-24T16:40:37.5366195Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-09-24T16:40:37.5366528Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-09-24T16:40:37.5366721Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-09-24T16:40:37.5407798Z ++ oc get pod -l name=sihdg-jboss8-des -n sihdg-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-24T16:40:37.5408417Z ++ tac
2026-09-24T16:40:37.5409581Z ++ grep -v '^$'
2026-09-24T16:40:37.5409864Z ++ head -n1
2026-09-24T16:40:37.6379036Z + last_pod=sihdg-jboss8-des-98-b7bw7
2026-09-24T16:40:37.6379551Z + echo 'Logs do POD: sihdg-jboss8-des-98-b7bw7'
2026-09-24T16:40:37.6380735Z + oc logs sihdg-jboss8-des-98-b7bw7 -c sihdg-jboss8-des -n sihdg-des
2026-09-24T16:40:37.6381271Z Logs do POD: sihdg-jboss8-des-98-b7bw7
2026-09-24T16:40:37.7361643Z Using openshift launcher.
2026-09-24T16:40:37.7362144Z 2026-09-24 16:39:32 Launching WildFly Server
2026-09-24T16:40:37.7362289Z INFO Access log is disabled, ignoring configuration.
2026-09-24T16:40:37.7362448Z INFO Clustering feature is not enabled, no jgroups subsystem present in server configuration.
2026-09-24T16:40:37.7362718Z INFO Server started in admin mode, CLI script executed during server boot.
2026-09-24T16:40:37.7362966Z INFO Running jboss-eap-8/eap8-openjdk21-builder-openshift-rhel9 image, version 1.0.1.GA
2026-09-24T16:40:37.7363710Z JAVA_OPTS already set in environment; overriding default settings with values:  -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider -Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks  -Djava.security.properties=/opt/server/bin/java.security.override
2026-09-24T16:40:37.7364149Z =========================================================================
2026-09-24T16:40:37.7364221Z 
2026-09-24T16:40:37.7364316Z   JBoss Bootstrap Environment
2026-09-24T16:40:37.7364370Z 
2026-09-24T16:40:37.7364461Z   JBOSS_HOME: /opt/server
2026-09-24T16:40:37.7364504Z 
2026-09-24T16:40:37.7364652Z   JAVA: /usr/lib/jvm/java-21/bin/java
2026-09-24T16:40:37.7364703Z 
2026-09-24T16:40:37.7366336Z   JAVA_OPTS:  -Xlog:gc*:file="/opt/server/standalone/log/gc.log":time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter="maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000"  -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider -Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks  -Djava.security.properties=/opt/server/bin/java.security.override  --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-exports=jdk.naming.dns/com.sun.jndi.dns=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED
2026-09-24T16:40:37.7367661Z 
2026-09-24T16:40:37.7367796Z =========================================================================
2026-09-24T16:40:37.7367863Z 
2026-09-24T16:40:37.7368130Z [0m13:39:33,671 INFO  [org.jboss.modules] (main) JBoss Modules version 2.1.6.Final-redhat-00001
2026-09-24T16:40:37.7368374Z [0m[0m13:39:34,389 INFO  [org.jboss.msc] (main) JBoss MSC version 1.5.5.Final-redhat-00001
2026-09-24T16:40:37.7368613Z [0m[0m13:39:34,449 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
2026-09-24T16:40:37.7368915Z [0m[0m13:39:34,569 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) starting
2026-09-24T16:40:37.7369195Z [0m[32m13:39:34,571 DEBUG [org.jboss.as.config] (MSC service thread 1-2) Configured system properties:
2026-09-24T16:40:37.7369337Z 	[Standalone] = 
2026-09-24T16:40:37.7369440Z 	file.encoding = UTF-8
2026-09-24T16:40:37.7369543Z 	file.separator = /
2026-09-24T16:40:37.7369713Z 	java.class.path = /opt/server/jboss-modules.jar
2026-09-24T16:40:37.7369836Z 	java.class.version = 65.0
2026-09-24T16:40:37.7370026Z 	java.home = /usr/lib/jvm/java-21-openjdk-21.0.10.0.7-1.el9.x86_64
2026-09-24T16:40:37.7370154Z 	java.io.tmpdir = /tmp
2026-09-24T16:40:37.7370279Z 	java.library.path = /usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib
2026-09-24T16:40:37.7370417Z 	java.net.preferIPv4Stack = true
2026-09-24T16:40:37.7370541Z 	java.runtime.name = OpenJDK Runtime Environment
2026-09-24T16:40:37.7370665Z 	java.runtime.version = 21.0.10+7-LTS
2026-09-24T16:40:37.7370782Z 	java.security.egd = file:/dev/./urandom
2026-09-24T16:40:37.7370910Z 	java.security.properties = /opt/server/bin/java.security.override
2026-09-24T16:40:37.7371051Z 	java.specification.name = Java Platform API Specification
2026-09-24T16:40:37.7371184Z 	java.specification.vendor = Oracle Corporation
2026-09-24T16:40:37.7371303Z 	java.specification.version = 21
2026-09-24T16:40:37.7371424Z 	java.util.logging.manager = org.jboss.logmanager.LogManager
2026-09-24T16:40:37.7371547Z 	java.vendor = Red Hat, Inc.
2026-09-24T16:40:37.7371659Z 	java.vendor.url = https://www.redhat.com/
2026-09-24T16:40:37.7371788Z 	java.vendor.url.bug = https://access.redhat.com/support/cases/
2026-09-24T16:40:37.7372005Z 	java.vendor.version = (Red_Hat-21.0.10.0.7-1)
2026-09-24T16:40:37.7372126Z 	java.version = 21.0.10
2026-09-24T16:40:37.7372268Z 	java.version.date = 2026-01-20
2026-09-24T16:40:37.7372385Z 	java.vm.compressedOopsMode = 32-bit
2026-09-24T16:40:37.7372503Z 	java.vm.info = mixed mode, sharing
2026-09-24T16:40:37.7372663Z 	java.vm.name = OpenJDK 64-Bit Server VM
2026-09-24T16:40:37.7372855Z 	java.vm.specification.name = Java Virtual Machine Specification
2026-09-24T16:40:37.7373022Z 	java.vm.specification.vendor = Oracle Corporation
2026-09-24T16:40:37.7373147Z 	java.vm.specification.version = 21
2026-09-24T16:40:37.7373260Z 	java.vm.vendor = Red Hat, Inc.
2026-09-24T16:40:37.7373371Z 	java.vm.version = 21.0.10+7-LTS
2026-09-24T16:40:37.7373499Z 	javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
2026-09-24T16:40:37.7373744Z 	javax.net.ssl.trustStore = /opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks
2026-09-24T16:40:37.7373893Z 	jboss.bind.address = 25.1.44.134
2026-09-24T16:40:37.7374010Z 	jboss.bind.address.management = 0.0.0.0
2026-09-24T16:40:37.7374131Z 	jboss.bind.address.private = 25.1.44.134
2026-09-24T16:40:37.7374240Z 	jboss.home.dir = /opt/server
2026-09-24T16:40:37.7374401Z 	jboss.host.name = sihdg-jboss8-des-98-b7bw7
2026-09-24T16:40:37.7374530Z 	jboss.messaging.cluster.password = <redacted>
2026-09-24T16:40:37.7374655Z 	jboss.messaging.host = 25.1.44.134
2026-09-24T16:40:37.7374787Z 	jboss.modules.system.pkgs = jdk.nashorn.api,com.sun.crypto.provider
2026-09-24T16:40:37.7374960Z 	jboss.node.name = sihdg-jboss8-des-98-b7bw7
2026-09-24T16:40:37.7375157Z 	jboss.qualified.host.name = sihdg-jboss8-des-98-b7bw7
2026-09-24T16:40:37.7375294Z 	jboss.server.base.dir = /opt/server/standalone
2026-09-24T16:40:37.7375425Z 	jboss.server.config.dir = /opt/server/standalone/configuration
2026-09-24T16:40:37.7375558Z 	jboss.server.data.dir = /opt/server/standalone/data
2026-09-24T16:40:37.7375682Z 	jboss.server.log.dir = /opt/server/standalone/log
2026-09-24T16:40:37.7375850Z 	jboss.server.name = sihdg-jboss8-des-98-b7bw7
2026-09-24T16:40:37.7375970Z 	jboss.server.persist.config = true
2026-09-24T16:40:37.7376090Z 	jboss.server.temp.dir = /opt/server/standalone/tmp
2026-09-24T16:40:37.7376251Z 	jboss.tx.node.id = hdg-jboss8-des-98-b7bw7
2026-09-24T16:40:37.7376361Z 	jdk.debug = release
2026-09-24T16:40:37.7376498Z 	jdk.serialFilter = maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
2026-09-24T16:40:37.7376628Z 	line.separator = 
2026-09-24T16:40:37.7376669Z 
2026-09-24T16:40:37.7376794Z 	logging.configuration = file:/opt/server/standalone/configuration/logging.properties
2026-09-24T16:40:37.7376932Z 	module.path = /opt/server/modules
2026-09-24T16:40:37.7377058Z 	native.encoding = ANSI_X3.4-1968
2026-09-24T16:40:37.7377185Z 	org.jboss.boot.log.file = /opt/server/standalone/log/server.log
2026-09-24T16:40:37.7377379Z 	org.jboss.resolver.warning = true
2026-09-24T16:40:37.7377594Z 	org.wildfly.internal.cli.boot.hook.marker.dir = /tmp/cli-boot-reload-marker-1790267972
2026-09-24T16:40:37.7377816Z 	org.wildfly.internal.cli.boot.hook.script = /tmp/cli-script-1790267972.cli
2026-09-24T16:40:37.7378038Z 	org.wildfly.internal.cli.boot.hook.script.error.file = /tmp/cli-script-error-1790267972.cli
2026-09-24T16:40:37.7378274Z 	org.wildfly.internal.cli.boot.hook.script.output.file = /tmp/cli-script-output-1790267972.cli
2026-09-24T16:40:37.7378511Z 	org.wildfly.internal.cli.boot.hook.script.properties = /tmp/cli-script-property-1790267972.cli
2026-09-24T16:40:37.7378743Z 	org.wildfly.internal.cli.boot.hook.script.warn.file = /tmp/cli-warning-1790267972.log
2026-09-24T16:40:37.7378874Z 	os.arch = amd64
2026-09-24T16:40:37.7378963Z 	os.name = Linux
2026-09-24T16:40:37.7379112Z 	os.version = 6.1.18-200.fc37.x86_64
2026-09-24T16:40:37.7379222Z 	path.separator = :
2026-09-24T16:40:37.7379350Z 	stderr.encoding = ANSI_X3.4-1968
2026-09-24T16:40:37.7379482Z 	stdout.encoding = ANSI_X3.4-1968
2026-09-24T16:40:37.7379584Z 	sun.arch.data.model = 64
2026-09-24T16:40:37.7379847Z 	sun.boot.library.path = /usr/lib/jvm/java-21-openjdk-21.0.10.0.7-1.el9.x86_64/lib
2026-09-24T16:40:37.7379987Z 	sun.cpu.endian = little
2026-09-24T16:40:37.7380097Z 	sun.io.unicode.encoding = UnicodeLittle
2026-09-24T16:40:37.7381154Z 	sun.java.command = /opt/server/jboss-modules.jar -mp /opt/server/modules org.jboss.as.standalone -Djboss.home.dir=/opt/server -Djboss.server.base.dir=/opt/server/standalone -c standalone.xml -Djboss.messaging.host=25.1.44.134 -Djboss.messaging.cluster.password=<redacted> --start-mode=admin-only -Dorg.wildfly.internal.cli.boot.hook.script=/tmp/cli-script-1790267972.cli -Dorg.wildfly.internal.cli.boot.hook.marker.dir=/tmp/cli-boot-reload-marker-1790267972 -Dorg.wildfly.internal.cli.boot.hook.script.properties=/tmp/cli-script-property-1790267972.cli -Dorg.wildfly.internal.cli.boot.hook.script.error.file=/tmp/cli-script-error-1790267972.cli -Dorg.wildfly.internal.cli.boot.hook.script.warn.file=/tmp/cli-warning-1790267972.log -Dorg.wildfly.internal.cli.boot.hook.script.output.file=/tmp/cli-script-output-1790267972.cli -Djboss.node.name=sihdg-jboss8-des-98-b7bw7 -Djboss.tx.node.id=hdg-jboss8-des-98-b7bw7 -bprivate 25.1.44.134 -b 25.1.44.134 -bmanagement 0.0.0.0 -Dwildfly.statistics-enabled=true
2026-09-24T16:40:37.7381786Z 	sun.java.launcher = SUN_STANDARD
2026-09-24T16:40:37.7381917Z 	sun.jnu.encoding = ANSI_X3.4-1968
2026-09-24T16:40:37.7382098Z 	sun.management.compiler = HotSpot 64-Bit Tiered Compilers
2026-09-24T16:40:37.7382212Z 	user.country = US
2026-09-24T16:40:37.7382312Z 	user.dir = /home/jboss
2026-09-24T16:40:37.7382412Z 	user.home = /home/jboss
2026-09-24T16:40:37.7382510Z 	user.language = en
2026-09-24T16:40:37.7382601Z 	user.name = jboss
2026-09-24T16:40:37.7382706Z 	user.timezone = America/Sao_Paulo
2026-09-24T16:40:37.7382858Z 	wildfly.statistics-enabled = true
2026-09-24T16:40:37.7384635Z [0m[32m13:39:34,571 DEBUG [org.jboss.as.config] (MSC service thread 1-2) VM Arguments: -D[Standalone] -Xlog:gc*:file=/opt/server/standalone/log/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider -Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djava.security.properties=/opt/server/bin/java.security.override --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-exports=jdk.naming.dns/com.sun.jndi.dns=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/opt/server/standalone/log/server.log -Dlogging.configuration=file:/opt/server/standalone/configuration/logging.properties 
2026-09-24T16:40:37.7385791Z [0m[0m13:39:35,762 INFO  [org.wildfly.security] (ServerService Thread Pool -- 16) ELY00001: WildFly Elytron version 2.2.14.Final-redhat-00001
2026-09-24T16:40:37.7386112Z [0m[0m13:39:36,862 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
2026-09-24T16:40:37.7386387Z [0m[0m13:39:36,869 INFO  [org.xnio] (MSC service thread 1-2) XNIO version 3.8.16.Final-redhat-00001
2026-09-24T16:40:37.7386658Z [0m[0m13:39:36,872 INFO  [org.xnio.nio] (MSC service thread 1-2) XNIO NIO Implementation Version 3.8.16.Final-redhat-00001
2026-09-24T16:40:37.7387074Z [0m[33m13:39:36,960 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY00023: KeyStore file '/opt/server/standalone/configuration/application.keystore' does not exist. Used blank.
2026-09-24T16:40:37.7387871Z [0m[0m13:39:36,961 INFO  [org.jboss.remoting] (MSC service thread 1-2) JBoss Remoting version 5.0.31.Final-redhat-00001
2026-09-24T16:40:37.7388323Z [0m[33m13:39:36,964 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY01084: KeyStore /opt/server/standalone/configuration/application.keystore not found, it will be auto-generated on first use with a self-signed certificate for host localhost
2026-09-24T16:40:37.7388710Z [0m[0m13:39:37,267 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
2026-09-24T16:40:37.7389032Z [0m[0m13:39:37,269 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://0.0.0.0:9990/management
2026-09-24T16:40:37.7389318Z [0m[0m13:39:37,270 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0054: Admin console is not enabled
2026-09-24T16:40:37.7389736Z [0m[0m13:39:37,270 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) started in 4009ms - Started 72 of 84 services (26 services are lazy, passive or on-demand) - Server configuration file in use: standalone.xml
2026-09-24T16:40:37.7390200Z [0m[0m13:39:37,270 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0472: Checking for presence of marker file indicating that the server has been restarted following execution of the additional commands from the CLI script
2026-09-24T16:40:37.7390620Z [0m[0m13:39:37,270 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0474: No marker file found indicating that the server has been restarted following execution of the additional commands from the CLI script
2026-09-24T16:40:37.7391161Z [0m[0m13:39:37,270 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0466: Initialised the additional boot CLI script functionality. The CLI commands will be read from /tmp/cli-script-1790267972.cli. The server will be rebooted to normal mode after these have been executed
2026-09-24T16:40:37.7391592Z [0m[0m13:39:37,276 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0467: Running the additional commands from the CLI script /tmp/cli-script-1790267972.cli against the server which is running in admin-only mode
2026-09-24T16:40:37.7391987Z [0m[0m13:39:37,277 INFO  [org.jboss.as.cli] (Controller Boot Thread) WFLYCLI0001: Processing CLI script /tmp/cli-script-1790267972.cli
2026-09-24T16:40:37.7392289Z [0m[0m13:39:37,749 INFO  [org.jboss.as.cli] (Controller Boot Thread) WFLYCLI0005: Done processing CLI script /tmp/cli-script-1790267972.cli
2026-09-24T16:40:37.7392592Z [0m[0m13:39:37,750 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0468: Completed running the commands from the CLI script
2026-09-24T16:40:37.7393194Z [0m[0m13:39:37,750 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0470: Reloading the server to normal mode after execution of the additional commands from the CLI script. This will clear the properties triggering the additional boot cli script functionality if they were set (org.wildfly.internal.cli.boot.hook.script, org.wildfly.internal.cli.boot.hook.reload.skip, org.wildfly.internal.cli.boot.hook.marker.dir), and delete the marker file indicating the server was restarted
2026-09-24T16:40:37.7393688Z [0m[0m13:39:37,767 INFO  [org.jboss.as] (MSC service thread 1-1) WFLYSRV0050: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) stopped in 15ms
2026-09-24T16:40:37.7394007Z [0m[0m13:39:37,768 INFO  [org.jboss.as] (MSC service thread 1-1) WFLYSRV0049: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) starting
2026-09-24T16:40:37.7394276Z [0m[32m13:39:37,768 DEBUG [org.jboss.as.config] (MSC service thread 1-1) Configured system properties:
2026-09-24T16:40:37.7394420Z 	[Standalone] = 
2026-09-24T16:40:37.7394596Z 	br.gov.caixa.sisgr.auth.url = https://webservice.acessoseguro.des.corerj.caixa/sisgrauth-web/
2026-09-24T16:40:37.7394735Z 	file.encoding = UTF-8
2026-09-24T16:40:37.7394877Z 	file.separator = /
2026-09-24T16:40:37.7395037Z 	java.class.path = /opt/server/jboss-modules.jar
2026-09-24T16:40:37.7395248Z 	java.class.version = 65.0
2026-09-24T16:40:37.7395448Z 	java.home = /usr/lib/jvm/java-21-openjdk-21.0.10.0.7-1.el9.x86_64
2026-09-24T16:40:37.7395574Z 	java.io.tmpdir = /tmp
2026-09-24T16:40:37.7395698Z 	java.library.path = /usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib
2026-09-24T16:40:37.7395838Z 	java.net.preferIPv4Stack = true
2026-09-24T16:40:37.7395961Z 	java.runtime.name = OpenJDK Runtime Environment
2026-09-24T16:40:37.7396083Z 	java.runtime.version = 21.0.10+7-LTS
2026-09-24T16:40:37.7396206Z 	java.security.egd = file:/dev/./urandom
2026-09-24T16:40:37.7396333Z 	java.security.properties = /opt/server/bin/java.security.override
2026-09-24T16:40:37.7396477Z 	java.specification.name = Java Platform API Specification
2026-09-24T16:40:37.7396611Z 	java.specification.vendor = Oracle Corporation
2026-09-24T16:40:37.7396728Z 	java.specification.version = 21
2026-09-24T16:40:37.7396853Z 	java.util.logging.manager = org.jboss.logmanager.LogManager
2026-09-24T16:40:37.7396981Z 	java.vendor = Red Hat, Inc.
2026-09-24T16:40:37.7397094Z 	java.vendor.url = https://www.redhat.com/
2026-09-24T16:40:37.7397225Z 	java.vendor.url.bug = https://access.redhat.com/support/cases/
2026-09-24T16:40:37.7397473Z 	java.vendor.version = (Red_Hat-21.0.10.0.7-1)
2026-09-24T16:40:37.7397585Z 	java.version = 21.0.10
2026-09-24T16:40:37.7397734Z 	java.version.date = 2026-01-20
2026-09-24T16:40:37.7397852Z 	java.vm.compressedOopsMode = 32-bit
2026-09-24T16:40:37.7397969Z 	java.vm.info = mixed mode, sharing
2026-09-24T16:40:37.7398121Z 	java.vm.name = OpenJDK 64-Bit Server VM
2026-09-24T16:40:37.7398258Z 	java.vm.specification.name = Java Virtual Machine Specification
2026-09-24T16:40:37.7398398Z 	java.vm.specification.vendor = Oracle Corporation
2026-09-24T16:40:37.7398525Z 	java.vm.specification.version = 21
2026-09-24T16:40:37.7398639Z 	java.vm.vendor = Red Hat, Inc.
2026-09-24T16:40:37.7398746Z 	java.vm.version = 21.0.10+7-LTS
2026-09-24T16:40:37.7398886Z 	javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
2026-09-24T16:40:37.7399127Z 	javax.net.ssl.trustStore = /opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks
2026-09-24T16:40:37.7399276Z 	jboss.bind.address = 25.1.44.134
2026-09-24T16:40:37.7399402Z 	jboss.bind.address.management = 0.0.0.0
2026-09-24T16:40:37.7399517Z 	jboss.bind.address.private = 25.1.44.134
2026-09-24T16:40:37.7399634Z 	jboss.home.dir = /opt/server
2026-09-24T16:40:37.7399798Z 	jboss.host.name = sihdg-jboss8-des-98-b7bw7
2026-09-24T16:40:37.7399928Z 	jboss.messaging.cluster.password = <redacted>
2026-09-24T16:40:37.7400039Z 	jboss.messaging.host = 25.1.44.134
2026-09-24T16:40:37.7400170Z 	jboss.modules.system.pkgs = jdk.nashorn.api,com.sun.crypto.provider
2026-09-24T16:40:37.7400347Z 	jboss.node.name = sihdg-jboss8-des-98-b7bw7
2026-09-24T16:40:37.7400526Z 	jboss.qualified.host.name = sihdg-jboss8-des-98-b7bw7
2026-09-24T16:40:37.7400660Z 	jboss.server.base.dir = /opt/server/standalone
2026-09-24T16:40:37.7400786Z 	jboss.server.config.dir = /opt/server/standalone/configuration
2026-09-24T16:40:37.7400922Z 	jboss.server.data.dir = /opt/server/standalone/data
2026-09-24T16:40:37.7401049Z 	jboss.server.log.dir = /opt/server/standalone/log
2026-09-24T16:40:37.7401219Z 	jboss.server.name = sihdg-jboss8-des-98-b7bw7
2026-09-24T16:40:37.7401340Z 	jboss.server.persist.config = true
2026-09-24T16:40:37.7401455Z 	jboss.server.temp.dir = /opt/server/standalone/tmp
2026-09-24T16:40:37.7401620Z 	jboss.tx.node.id = hdg-jboss8-des-98-b7bw7
2026-09-24T16:40:37.7401733Z 	jdk.debug = release
2026-09-24T16:40:37.7401865Z 	jdk.serialFilter = maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
2026-09-24T16:40:37.7401993Z 	line.separator = 
2026-09-24T16:40:37.7402034Z 
2026-09-24T16:40:37.7402158Z 	logging.configuration = file:/opt/server/standalone/configuration/logging.properties
2026-09-24T16:40:37.7402288Z 	module.path = /opt/server/modules
2026-09-24T16:40:37.7402469Z 	native.encoding = ANSI_X3.4-1968
2026-09-24T16:40:37.7402629Z 	org.jboss.boot.log.file = /opt/server/standalone/log/server.log
2026-09-24T16:40:37.7402757Z 	org.jboss.resolver.warning = true
2026-09-24T16:40:37.7402962Z 	org.wildfly.internal.cli.boot.hook.script.error.file = /tmp/cli-script-error-1790267972.cli
2026-09-24T16:40:37.7403197Z 	org.wildfly.internal.cli.boot.hook.script.output.file = /tmp/cli-script-output-1790267972.cli
2026-09-24T16:40:37.7403439Z 	org.wildfly.internal.cli.boot.hook.script.properties = /tmp/cli-script-property-1790267972.cli
2026-09-24T16:40:37.7403671Z 	org.wildfly.internal.cli.boot.hook.script.warn.file = /tmp/cli-warning-1790267972.log
2026-09-24T16:40:37.7403801Z 	os.arch = amd64
2026-09-24T16:40:37.7403894Z 	os.name = Linux
2026-09-24T16:40:37.7404039Z 	os.version = 6.1.18-200.fc37.x86_64
2026-09-24T16:40:37.7404148Z 	path.separator = :
2026-09-24T16:40:37.7404282Z 	siaud.INT_URL_API_MANAGER = http://des.web.corerj.caixa:8642/
2026-09-24T16:40:37.7404434Z 	siaud.int.siico.api.key = l75b3690bee55a4994a4efb88fe248b4d9
2026-09-24T16:40:37.7404579Z 	siaud.int.url.api.manager = http://api.des.caixa:8080/
2026-09-24T16:40:37.7404735Z 	siaud.int.url.legado = https://des.web.corerj.caixa:8605/siaud/
2026-09-24T16:40:37.7404888Z 	stderr.encoding = ANSI_X3.4-1968
2026-09-24T16:40:37.7405019Z 	stdout.encoding = ANSI_X3.4-1968
2026-09-24T16:40:37.7405127Z 	sun.arch.data.model = 64
2026-09-24T16:40:37.7405322Z 	sun.boot.library.path = /usr/lib/jvm/java-21-openjdk-21.0.10.0.7-1.el9.x86_64/lib
2026-09-24T16:40:37.7405517Z 	sun.cpu.endian = little
2026-09-24T16:40:37.7405629Z 	sun.io.unicode.encoding = UnicodeLittle
2026-09-24T16:40:37.7406700Z 	sun.java.command = /opt/server/jboss-modules.jar -mp /opt/server/modules org.jboss.as.standalone -Djboss.home.dir=/opt/server -Djboss.server.base.dir=/opt/server/standalone -c standalone.xml -Djboss.messaging.host=25.1.44.134 -Djboss.messaging.cluster.password=<redacted> --start-mode=admin-only -Dorg.wildfly.internal.cli.boot.hook.script=/tmp/cli-script-1790267972.cli -Dorg.wildfly.internal.cli.boot.hook.marker.dir=/tmp/cli-boot-reload-marker-1790267972 -Dorg.wildfly.internal.cli.boot.hook.script.properties=/tmp/cli-script-property-1790267972.cli -Dorg.wildfly.internal.cli.boot.hook.script.error.file=/tmp/cli-script-error-1790267972.cli -Dorg.wildfly.internal.cli.boot.hook.script.warn.file=/tmp/cli-warning-1790267972.log -Dorg.wildfly.internal.cli.boot.hook.script.output.file=/tmp/cli-script-output-1790267972.cli -Djboss.node.name=sihdg-jboss8-des-98-b7bw7 -Djboss.tx.node.id=hdg-jboss8-des-98-b7bw7 -bprivate 25.1.44.134 -b 25.1.44.134 -bmanagement 0.0.0.0 -Dwildfly.statistics-enabled=true
2026-09-24T16:40:37.7407360Z 	sun.java.launcher = SUN_STANDARD
2026-09-24T16:40:37.7407517Z 	sun.jnu.encoding = ANSI_X3.4-1968
2026-09-24T16:40:37.7407691Z 	sun.management.compiler = HotSpot 64-Bit Tiered Compilers
2026-09-24T16:40:37.7407814Z 	sun.nio.ch.bugLevel = 
2026-09-24T16:40:37.7407922Z 	url_key_cloack = https://login.des.caixa/auth
2026-09-24T16:40:37.7408045Z 	url_key_cloack_realm = intranet
2026-09-24T16:40:37.7408263Z 	url_siaud_acompanhamento = http://localhost:8888/siaud/siaud-acompanhamento-service
2026-09-24T16:40:37.7408443Z 	url_siaud_acompanhamentoweb = http://localhost:8888/siaud/acompanhamento
2026-09-24T16:40:37.7408594Z 	url_siaud_execucao = http://localhost:8898/siaud
2026-09-24T16:40:37.7408737Z 	url_siaud_planejamento = http://localhost:8898/siaud
2026-09-24T16:40:37.7408890Z 	url_siico = http://des.web.corerj.caixa:8642/siicorjapi/v1/
2026-09-24T16:40:37.7409119Z 	url_sisgr = https://webservice.acessoseguro.sso.des.intra.corerj.caixa/sisgrauth-web/v1/
2026-09-24T16:40:37.7409254Z 	user.country = US
2026-09-24T16:40:37.7409351Z 	user.dir = /home/jboss
2026-09-24T16:40:37.7409458Z 	user.home = /home/jboss
2026-09-24T16:40:37.7409563Z 	user.language = en
2026-09-24T16:40:37.7409662Z 	user.name = jboss
2026-09-24T16:40:37.7409765Z 	user.timezone = America/Sao_Paulo
2026-09-24T16:40:37.7409912Z 	wildfly.statistics-enabled = true
2026-09-24T16:40:37.7411726Z [0m[32m13:39:37,769 DEBUG [org.jboss.as.config] (MSC service thread 1-1) VM Arguments: -D[Standalone] -Xlog:gc*:file=/opt/server/standalone/log/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider -Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djava.security.properties=/opt/server/bin/java.security.override --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-exports=jdk.naming.dns/com.sun.jndi.dns=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/opt/server/standalone/log/server.log -Dlogging.configuration=file:/opt/server/standalone/configuration/logging.properties 
2026-09-24T16:40:37.7413004Z [0m[0m13:39:38,284 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 5) WFLYDR0001: Content added at location /opt/server/standalone/data/content/2e/aa176794bec53da8fe3bf7dc333cea867e7ef0/content
2026-09-24T16:40:37.7413353Z [0m[0m13:39:38,297 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
2026-09-24T16:40:37.7413741Z [0m[0m13:39:38,348 INFO  [org.wildfly.extension.elytron.oidc._private] (ServerService Thread Pool -- 32) WFLYOIDC0001: Activating WildFly Elytron OIDC Subsystem
2026-09-24T16:40:37.7414059Z [0m[0m13:39:38,358 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 33) WFLYHEALTH0001: Activating Base Health Subsystem
2026-09-24T16:40:37.7414368Z [0m[0m13:39:38,358 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 34) WFLYCLINF0001: Activating Infinispan subsystem.
2026-09-24T16:40:37.7414664Z [0m[0m13:39:38,358 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 36) WFLYRS0016: RESTEasy version 6.2.15.Final-redhat-00002
2026-09-24T16:40:37.7414951Z [0m[0m13:39:38,359 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 40) WFLYNAM0001: Activating Naming Subsystem
2026-09-24T16:40:37.7415307Z [0m[0m13:39:38,360 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 35) WFLYIO001: Worker 'default' has auto-configured to 2 IO threads with 16 max task threads based on your 1 available processors
2026-09-24T16:40:37.7415744Z [0m[0m13:39:38,461 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Starting deployment of "sihdg-3.15.0.0.ear" (runtime-name: "sihdg-3.15.0.0.ear")
2026-09-24T16:40:37.7416098Z [0m[0m13:39:38,549 INFO  [org.jboss.as.connector] (MSC service thread 1-1) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 3.0.14.Final-redhat-00001)
2026-09-24T16:40:37.7416627Z [0m[0m13:39:38,550 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 44) WFLYUT0112: The value 'require-host-http11' attribute in the '/subsystem=undertow/server=default-server/http-listener=default' resource is 'false', which will be ignored. The server now always enforces the RFC 9112 requirement that HTTP/1.1 request messages include a Host header.
2026-09-24T16:40:37.7417089Z [0m[0m13:39:38,552 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0003: Undertow 2.3.23.SP3-redhat-00001 starting
2026-09-24T16:40:37.7417528Z [0m[0m13:39:38,556 INFO  [org.jboss.as.naming] (MSC service thread 1-1) WFLYNAM0003: Starting Naming Service
2026-09-24T16:40:37.7417878Z [0m[33m13:39:38,750 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY00023: KeyStore file '/opt/server/standalone/configuration/application.keystore' does not exist. Used blank.
2026-09-24T16:40:37.7418315Z [0m[33m13:39:38,754 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY01084: KeyStore /opt/server/standalone/configuration/application.keystore not found, it will be auto-generated on first use with a self-signed certificate for host localhost
2026-09-24T16:40:37.7418670Z [0m[0m13:39:38,848 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0012: Started server default-server.
2026-09-24T16:40:37.7418987Z [0m[0m13:39:38,853 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: Undertow HTTP listener default listening on 0.0.0.0:8080
2026-09-24T16:40:37.7419267Z [0m[0m13:39:38,853 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) Queuing requests.
2026-09-24T16:40:37.7419537Z [0m[0m13:39:38,853 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0018: Host default-host starting
2026-09-24T16:40:37.7419951Z [0m[0m13:39:38,853 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 16 (per class), which is derived from thread worker pool sizing.
2026-09-24T16:40:37.7420350Z [0m[0m13:39:38,863 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 27) WFLYJCA0004: Deploying JDBC-compliant driver class com.microsoft.sqlserver.jdbc.SQLServerDriver (version 12.6)
2026-09-24T16:40:37.7420693Z [0m[0m13:39:39,056 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Started Driver service with driver-name = sqlserver
2026-09-24T16:40:37.7421083Z [0m[0m13:39:39,062 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-2) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/server/standalone/deployments
2026-09-24T16:40:37.7421401Z [0m[0m13:39:39,168 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0493: Jakarta Enterprise Beans subsystem suspension complete
2026-09-24T16:40:37.7421719Z [0m[0m13:39:39,268 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0001: Bound data source [java:jboss/jdbc/sihdgDS]
2026-09-24T16:40:37.7422039Z [0m[0m13:39:39,819 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0207: Starting subdeployment (runtime-name: "sihdg-api.war")
2026-09-24T16:40:37.7422461Z [0m[33m13:39:45,273 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0001: /content/sihdg-3.15.0.0.ear/sihdg-api.war/WEB-INF/jboss-deployment-structure.xml in subdeployment ignored. jboss-deployment-structure.xml is only parsed for top level deployments.
2026-09-24T16:40:37.7422873Z [0m[0m13:39:45,975 INFO  [org.jboss.as.jpa] (MSC service thread 1-1) WFLYJPA0002: Read persistence.xml for sihdgDS
2026-09-24T16:40:37.7423204Z [0m[0m13:39:45,977 INFO  [org.wildfly.extension.elytron.oidc._private] (MSC service thread 1-1) WFLYOIDC0002: Elytron OIDC Client subsystem override for deployment 'sihdg-api.war'
2026-09-24T16:40:37.7423536Z [0m[0m13:39:46,375 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV6020260: Second level cache enabled for sihdg-3.15.0.0.ear/sihdg-api.war#sihdgDS
2026-09-24T16:40:37.7423831Z [0m[0m13:39:46,474 INFO  [org.jboss.weld.deployer] (MSC service thread 1-2) WFLYWELD0003: Processing weld deployment sihdg-3.15.0.0.ear
2026-09-24T16:40:37.7424144Z [0m[0m13:39:46,756 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-2) HV000001: Hibernate Validator 8.0.2.Final-redhat-00001
2026-09-24T16:40:37.7424534Z [0m[0m13:39:47,354 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 46) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.marshalling.jboss.JBossMarshaller'
2026-09-24T16:40:37.7424882Z [0m[0m13:39:47,355 INFO  [org.jboss.weld.deployer] (MSC service thread 1-2) WFLYWELD0003: Processing weld deployment sihdg-api.war
2026-09-24T16:40:37.7425297Z [0m[0m13:39:47,449 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'GestaoCargaFcAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7425446Z 
2026-09-24T16:40:37.7425660Z 	java:global/sihdg-3.15.0.0/sihdg-api/GestaoCargaFcAS!br.gov.caixa.bsb.sihdg.core.service.GestaoCargaFcAS
2026-09-24T16:40:37.7425909Z 	java:app/sihdg-api/GestaoCargaFcAS!br.gov.caixa.bsb.sihdg.core.service.GestaoCargaFcAS
2026-09-24T16:40:37.7426086Z 	java:module/GestaoCargaFcAS!br.gov.caixa.bsb.sihdg.core.service.GestaoCargaFcAS
2026-09-24T16:40:37.7426289Z 	java:global/sihdg-3.15.0.0/sihdg-api/GestaoCargaFcAS
2026-09-24T16:40:37.7426453Z 	java:app/sihdg-api/GestaoCargaFcAS
2026-09-24T16:40:37.7426572Z 	java:module/GestaoCargaFcAS
2026-09-24T16:40:37.7426618Z 
2026-09-24T16:40:37.7426972Z [0m[0m13:39:47,449 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoItemDerivativoFcAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7427130Z 
2026-09-24T16:40:37.7427412Z 	java:global/sihdg-3.15.0.0/sihdg-api/MovimentacaoItemDerivativoFcAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoItemDerivativoFcAS
2026-09-24T16:40:37.7427711Z 	java:app/sihdg-api/MovimentacaoItemDerivativoFcAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoItemDerivativoFcAS
2026-09-24T16:40:37.7427909Z 	java:module/MovimentacaoItemDerivativoFcAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoItemDerivativoFcAS
2026-09-24T16:40:37.7428140Z 	java:global/sihdg-3.15.0.0/sihdg-api/MovimentacaoItemDerivativoFcAS
2026-09-24T16:40:37.7428330Z 	java:app/sihdg-api/MovimentacaoItemDerivativoFcAS
2026-09-24T16:40:37.7428466Z 	java:module/MovimentacaoItemDerivativoFcAS
2026-09-24T16:40:37.7428522Z 
2026-09-24T16:40:37.7429004Z [0m[0m13:39:47,449 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'CtcfAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7429141Z 
2026-09-24T16:40:37.7429332Z 	java:global/sihdg-3.15.0.0/sihdg-api/CtcfAS!br.gov.caixa.bsb.sihdg.core.service.CtcfAS
2026-09-24T16:40:37.7429552Z 	java:app/sihdg-api/CtcfAS!br.gov.caixa.bsb.sihdg.core.service.CtcfAS
2026-09-24T16:40:37.7429697Z 	java:module/CtcfAS!br.gov.caixa.bsb.sihdg.core.service.CtcfAS
2026-09-24T16:40:37.7429880Z 	java:global/sihdg-3.15.0.0/sihdg-api/CtcfAS
2026-09-24T16:40:37.7430038Z 	java:app/sihdg-api/CtcfAS
2026-09-24T16:40:37.7430151Z 	java:module/CtcfAS
2026-09-24T16:40:37.7430196Z 
2026-09-24T16:40:37.7430523Z [0m[0m13:39:47,449 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'RelatorioAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7430661Z 
2026-09-24T16:40:37.7430860Z 	java:global/sihdg-3.15.0.0/sihdg-api/RelatorioAS!br.gov.caixa.bsb.sihdg.core.service.RelatorioAS
2026-09-24T16:40:37.7431091Z 	java:app/sihdg-api/RelatorioAS!br.gov.caixa.bsb.sihdg.core.service.RelatorioAS
2026-09-24T16:40:37.7431251Z 	java:module/RelatorioAS!br.gov.caixa.bsb.sihdg.core.service.RelatorioAS
2026-09-24T16:40:37.7431440Z 	java:global/sihdg-3.15.0.0/sihdg-api/RelatorioAS
2026-09-24T16:40:37.7431597Z 	java:app/sihdg-api/RelatorioAS
2026-09-24T16:40:37.7431710Z 	java:module/RelatorioAS
2026-09-24T16:40:37.7431755Z 
2026-09-24T16:40:37.7432090Z [0m[0m13:39:47,450 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoTransacaoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7432311Z 
2026-09-24T16:40:37.7432526Z 	java:global/sihdg-3.15.0.0/sihdg-api/MovimentacaoTransacaoAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoTransacaoAS
2026-09-24T16:40:37.7432793Z 	java:app/sihdg-api/MovimentacaoTransacaoAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoTransacaoAS
2026-09-24T16:40:37.7432979Z 	java:module/MovimentacaoTransacaoAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoTransacaoAS
2026-09-24T16:40:37.7433194Z 	java:global/sihdg-3.15.0.0/sihdg-api/MovimentacaoTransacaoAS
2026-09-24T16:40:37.7433373Z 	java:app/sihdg-api/MovimentacaoTransacaoAS
2026-09-24T16:40:37.7433491Z 	java:module/MovimentacaoTransacaoAS
2026-09-24T16:40:37.7433548Z 
2026-09-24T16:40:37.7433873Z [0m[0m13:39:47,450 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'SafraFcAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7434012Z 
2026-09-24T16:40:37.7434206Z 	java:global/sihdg-3.15.0.0/sihdg-api/SafraFcAS!br.gov.caixa.bsb.sihdg.core.service.SafraFcAS
2026-09-24T16:40:37.7434432Z 	java:app/sihdg-api/SafraFcAS!br.gov.caixa.bsb.sihdg.core.service.SafraFcAS
2026-09-24T16:40:37.7434582Z 	java:module/SafraFcAS!br.gov.caixa.bsb.sihdg.core.service.SafraFcAS
2026-09-24T16:40:37.7434769Z 	java:global/sihdg-3.15.0.0/sihdg-api/SafraFcAS
2026-09-24T16:40:37.7434927Z 	java:app/sihdg-api/SafraFcAS
2026-09-24T16:40:37.7435039Z 	java:module/SafraFcAS
2026-09-24T16:40:37.7435083Z 
2026-09-24T16:40:37.7435403Z [0m[0m13:39:47,450 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'DerivativoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7435544Z 
2026-09-24T16:40:37.7435744Z 	java:global/sihdg-3.15.0.0/sihdg-api/DerivativoAS!br.gov.caixa.bsb.sihdg.core.service.DerivativoAS
2026-09-24T16:40:37.7435977Z 	java:app/sihdg-api/DerivativoAS!br.gov.caixa.bsb.sihdg.core.service.DerivativoAS
2026-09-24T16:40:37.7436137Z 	java:module/DerivativoAS!br.gov.caixa.bsb.sihdg.core.service.DerivativoAS
2026-09-24T16:40:37.7436326Z 	java:global/sihdg-3.15.0.0/sihdg-api/DerivativoAS
2026-09-24T16:40:37.7436572Z 	java:app/sihdg-api/DerivativoAS
2026-09-24T16:40:37.7436691Z 	java:module/DerivativoAS
2026-09-24T16:40:37.7436738Z 
2026-09-24T16:40:37.7437080Z [0m[0m13:39:47,450 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoTransacaoFcAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7437237Z 
2026-09-24T16:40:37.7437516Z 	java:global/sihdg-3.15.0.0/sihdg-api/MovimentacaoTransacaoFcAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoTransacaoFcAS
2026-09-24T16:40:37.7437797Z 	java:app/sihdg-api/MovimentacaoTransacaoFcAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoTransacaoFcAS
2026-09-24T16:40:37.7437986Z 	java:module/MovimentacaoTransacaoFcAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoTransacaoFcAS
2026-09-24T16:40:37.7438205Z 	java:global/sihdg-3.15.0.0/sihdg-api/MovimentacaoTransacaoFcAS
2026-09-24T16:40:37.7438387Z 	java:app/sihdg-api/MovimentacaoTransacaoFcAS
2026-09-24T16:40:37.7438511Z 	java:module/MovimentacaoTransacaoFcAS
2026-09-24T16:40:37.7438571Z 
2026-09-24T16:40:37.7438897Z [0m[0m13:39:47,450 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'LogImportacaoSiapcAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7439047Z 
2026-09-24T16:40:37.7439260Z 	java:global/sihdg-3.15.0.0/sihdg-api/LogImportacaoSiapcAS!br.gov.caixa.bsb.sihdg.core.service.LogImportacaoSiapcAS
2026-09-24T16:40:37.7439549Z 	java:app/sihdg-api/LogImportacaoSiapcAS!br.gov.caixa.bsb.sihdg.core.service.LogImportacaoSiapcAS
2026-09-24T16:40:37.7439845Z 	java:module/LogImportacaoSiapcAS!br.gov.caixa.bsb.sihdg.core.service.LogImportacaoSiapcAS
2026-09-24T16:40:37.7440056Z 	java:global/sihdg-3.15.0.0/sihdg-api/LogImportacaoSiapcAS
2026-09-24T16:40:37.7440238Z 	java:app/sihdg-api/LogImportacaoSiapcAS
2026-09-24T16:40:37.7440363Z 	java:module/LogImportacaoSiapcAS
2026-09-24T16:40:37.7440413Z 
2026-09-24T16:40:37.7440730Z [0m[0m13:39:47,450 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PerfilAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7440865Z 
2026-09-24T16:40:37.7441067Z 	java:global/sihdg-3.15.0.0/sihdg-api/PerfilAS!br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS
2026-09-24T16:40:37.7441305Z 	java:app/sihdg-api/PerfilAS!br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS
2026-09-24T16:40:37.7441479Z 	java:module/PerfilAS!br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS
2026-09-24T16:40:37.7441664Z 	java:global/sihdg-3.15.0.0/sihdg-api/PerfilAS
2026-09-24T16:40:37.7441825Z 	java:app/sihdg-api/PerfilAS
2026-09-24T16:40:37.7441938Z 	java:module/PerfilAS
2026-09-24T16:40:37.7441982Z 
2026-09-24T16:40:37.7442313Z [0m[0m13:39:47,450 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ItemDerivativoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7442459Z 
2026-09-24T16:40:37.7442659Z 	java:global/sihdg-3.15.0.0/sihdg-api/ItemDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoAS
2026-09-24T16:40:37.7442904Z 	java:app/sihdg-api/ItemDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoAS
2026-09-24T16:40:37.7443076Z 	java:module/ItemDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoAS
2026-09-24T16:40:37.7443281Z 	java:global/sihdg-3.15.0.0/sihdg-api/ItemDerivativoAS
2026-09-24T16:40:37.7443452Z 	java:app/sihdg-api/ItemDerivativoAS
2026-09-24T16:40:37.7443565Z 	java:module/ItemDerivativoAS
2026-09-24T16:40:37.7443617Z 
2026-09-24T16:40:37.7443935Z [0m[0m13:39:47,450 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TabelasAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7444082Z 
2026-09-24T16:40:37.7444273Z 	java:global/sihdg-3.15.0.0/sihdg-api/TabelasAS!br.gov.caixa.bsb.sihdg.core.service.TabelasAS
2026-09-24T16:40:37.7444490Z 	java:app/sihdg-api/TabelasAS!br.gov.caixa.bsb.sihdg.core.service.TabelasAS
2026-09-24T16:40:37.7444651Z 	java:module/TabelasAS!br.gov.caixa.bsb.sihdg.core.service.TabelasAS
2026-09-24T16:40:37.7444837Z 	java:global/sihdg-3.15.0.0/sihdg-api/TabelasAS
2026-09-24T16:40:37.7444994Z 	java:app/sihdg-api/TabelasAS
2026-09-24T16:40:37.7445107Z 	java:module/TabelasAS
2026-09-24T16:40:37.7445154Z 
2026-09-24T16:40:37.7445471Z [0m[0m13:39:47,450 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'SafraAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7445605Z 
2026-09-24T16:40:37.7445793Z 	java:global/sihdg-3.15.0.0/sihdg-api/SafraAS!br.gov.caixa.bsb.sihdg.core.service.SafraAS
2026-09-24T16:40:37.7446011Z 	java:app/sihdg-api/SafraAS!br.gov.caixa.bsb.sihdg.core.service.SafraAS
2026-09-24T16:40:37.7446168Z 	java:module/SafraAS!br.gov.caixa.bsb.sihdg.core.service.SafraAS
2026-09-24T16:40:37.7446345Z 	java:global/sihdg-3.15.0.0/sihdg-api/SafraAS
2026-09-24T16:40:37.7446565Z 	java:app/sihdg-api/SafraAS
2026-09-24T16:40:37.7446679Z 	java:module/SafraAS
2026-09-24T16:40:37.7446723Z 
2026-09-24T16:40:37.7447064Z [0m[0m13:39:47,450 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ContratoDesignadoPrograma1AS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7447349Z 
2026-09-24T16:40:37.7447599Z 	java:global/sihdg-3.15.0.0/sihdg-api/ContratoDesignadoPrograma1AS!br.gov.caixa.bsb.sihdg.core.service.ContratoDesignadoPrograma1AS
2026-09-24T16:40:37.7447882Z 	java:app/sihdg-api/ContratoDesignadoPrograma1AS!br.gov.caixa.bsb.sihdg.core.service.ContratoDesignadoPrograma1AS
2026-09-24T16:40:37.7448081Z 	java:module/ContratoDesignadoPrograma1AS!br.gov.caixa.bsb.sihdg.core.service.ContratoDesignadoPrograma1AS
2026-09-24T16:40:37.7448306Z 	java:global/sihdg-3.15.0.0/sihdg-api/ContratoDesignadoPrograma1AS
2026-09-24T16:40:37.7448484Z 	java:app/sihdg-api/ContratoDesignadoPrograma1AS
2026-09-24T16:40:37.7448619Z 	java:module/ContratoDesignadoPrograma1AS
2026-09-24T16:40:37.7448679Z 
2026-09-24T16:40:37.7449007Z [0m[0m13:39:47,450 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ParametroEventoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7449163Z 
2026-09-24T16:40:37.7449370Z 	java:global/sihdg-3.15.0.0/sihdg-api/ParametroEventoAS!br.gov.caixa.bsb.sihdg.core.service.ParametroEventoAS
2026-09-24T16:40:37.7449611Z 	java:app/sihdg-api/ParametroEventoAS!br.gov.caixa.bsb.sihdg.core.service.ParametroEventoAS
2026-09-24T16:40:37.7449790Z 	java:module/ParametroEventoAS!br.gov.caixa.bsb.sihdg.core.service.ParametroEventoAS
2026-09-24T16:40:37.7449996Z 	java:global/sihdg-3.15.0.0/sihdg-api/ParametroEventoAS
2026-09-24T16:40:37.7450165Z 	java:app/sihdg-api/ParametroEventoAS
2026-09-24T16:40:37.7450288Z 	java:module/ParametroEventoAS
2026-09-24T16:40:37.7450336Z 
2026-09-24T16:40:37.7450665Z [0m[0m13:39:47,450 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'HistoricoCargaAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7450810Z 
2026-09-24T16:40:37.7451016Z 	java:global/sihdg-3.15.0.0/sihdg-api/HistoricoCargaAS!br.gov.caixa.bsb.sihdg.core.service.HistoricoCargaAS
2026-09-24T16:40:37.7451262Z 	java:app/sihdg-api/HistoricoCargaAS!br.gov.caixa.bsb.sihdg.core.service.HistoricoCargaAS
2026-09-24T16:40:37.7451425Z 	java:module/HistoricoCargaAS!br.gov.caixa.bsb.sihdg.core.service.HistoricoCargaAS
2026-09-24T16:40:37.7451626Z 	java:global/sihdg-3.15.0.0/sihdg-api/HistoricoCargaAS
2026-09-24T16:40:37.7451794Z 	java:app/sihdg-api/HistoricoCargaAS
2026-09-24T16:40:37.7451914Z 	java:module/HistoricoCargaAS
2026-09-24T16:40:37.7451960Z 
2026-09-24T16:40:37.7452283Z [0m[0m13:39:47,450 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ProgramaAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7452426Z 
2026-09-24T16:40:37.7452619Z 	java:global/sihdg-3.15.0.0/sihdg-api/ProgramaAS!br.gov.caixa.bsb.sihdg.core.service.ProgramaAS
2026-09-24T16:40:37.7452850Z 	java:app/sihdg-api/ProgramaAS!br.gov.caixa.bsb.sihdg.core.service.ProgramaAS
2026-09-24T16:40:37.7453009Z 	java:module/ProgramaAS!br.gov.caixa.bsb.sihdg.core.service.ProgramaAS
2026-09-24T16:40:37.7453198Z 	java:global/sihdg-3.15.0.0/sihdg-api/ProgramaAS
2026-09-24T16:40:37.7453353Z 	java:app/sihdg-api/ProgramaAS
2026-09-24T16:40:37.7453465Z 	java:module/ProgramaAS
2026-09-24T16:40:37.7453510Z 
2026-09-24T16:40:37.7453838Z [0m[0m13:39:47,451 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'CtcfHabitacaoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7454063Z 
2026-09-24T16:40:37.7454306Z 	java:global/sihdg-3.15.0.0/sihdg-api/CtcfHabitacaoAS!br.gov.caixa.bsb.sihdg.core.service.CtcfHabitacaoAS
2026-09-24T16:40:37.7454595Z 	java:app/sihdg-api/CtcfHabitacaoAS!br.gov.caixa.bsb.sihdg.core.service.CtcfHabitacaoAS
2026-09-24T16:40:37.7454793Z 	java:module/CtcfHabitacaoAS!br.gov.caixa.bsb.sihdg.core.service.CtcfHabitacaoAS
2026-09-24T16:40:37.7454994Z 	java:global/sihdg-3.15.0.0/sihdg-api/CtcfHabitacaoAS
2026-09-24T16:40:37.7455166Z 	java:app/sihdg-api/CtcfHabitacaoAS
2026-09-24T16:40:37.7455281Z 	java:module/CtcfHabitacaoAS
2026-09-24T16:40:37.7455338Z 
2026-09-24T16:40:37.7455672Z [0m[0m13:39:47,451 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'VencimentoItemDerivativoTask' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7455822Z 
2026-09-24T16:40:37.7456057Z 	java:global/sihdg-3.15.0.0/sihdg-api/VencimentoItemDerivativoTask!br.gov.caixa.bsb.sihdg.core.service.jobs.VencimentoItemDerivativoTask
2026-09-24T16:40:37.7456338Z 	java:app/sihdg-api/VencimentoItemDerivativoTask!br.gov.caixa.bsb.sihdg.core.service.jobs.VencimentoItemDerivativoTask
2026-09-24T16:40:37.7456536Z 	java:module/VencimentoItemDerivativoTask!br.gov.caixa.bsb.sihdg.core.service.jobs.VencimentoItemDerivativoTask
2026-09-24T16:40:37.7456762Z 	java:global/sihdg-3.15.0.0/sihdg-api/VencimentoItemDerivativoTask
2026-09-24T16:40:37.7456947Z 	java:app/sihdg-api/VencimentoItemDerivativoTask
2026-09-24T16:40:37.7457078Z 	java:module/VencimentoItemDerivativoTask
2026-09-24T16:40:37.7457130Z 
2026-09-24T16:40:37.7457539Z [0m[0m13:39:47,451 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ProcessarStatusDerivativoTask' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7457689Z 
2026-09-24T16:40:37.7457928Z 	java:global/sihdg-3.15.0.0/sihdg-api/ProcessarStatusDerivativoTask!br.gov.caixa.bsb.sihdg.core.service.jobs.ProcessarStatusDerivativoTask
2026-09-24T16:40:37.7458218Z 	java:app/sihdg-api/ProcessarStatusDerivativoTask!br.gov.caixa.bsb.sihdg.core.service.jobs.ProcessarStatusDerivativoTask
2026-09-24T16:40:37.7458426Z 	java:module/ProcessarStatusDerivativoTask!br.gov.caixa.bsb.sihdg.core.service.jobs.ProcessarStatusDerivativoTask
2026-09-24T16:40:37.7458653Z 	java:global/sihdg-3.15.0.0/sihdg-api/ProcessarStatusDerivativoTask
2026-09-24T16:40:37.7458835Z 	java:app/sihdg-api/ProcessarStatusDerivativoTask
2026-09-24T16:40:37.7458966Z 	java:module/ProcessarStatusDerivativoTask
2026-09-24T16:40:37.7459076Z 
2026-09-24T16:40:37.7459426Z [0m[0m13:39:47,451 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'RegistroEfetividadeAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7459582Z 
2026-09-24T16:40:37.7459795Z 	java:global/sihdg-3.15.0.0/sihdg-api/RegistroEfetividadeAS!br.gov.caixa.bsb.sihdg.core.service.RegistroEfetividadeAS
2026-09-24T16:40:37.7460048Z 	java:app/sihdg-api/RegistroEfetividadeAS!br.gov.caixa.bsb.sihdg.core.service.RegistroEfetividadeAS
2026-09-24T16:40:37.7460229Z 	java:module/RegistroEfetividadeAS!br.gov.caixa.bsb.sihdg.core.service.RegistroEfetividadeAS
2026-09-24T16:40:37.7460438Z 	java:global/sihdg-3.15.0.0/sihdg-api/RegistroEfetividadeAS
2026-09-24T16:40:37.7460616Z 	java:app/sihdg-api/RegistroEfetividadeAS
2026-09-24T16:40:37.7460741Z 	java:module/RegistroEfetividadeAS
2026-09-24T16:40:37.7460792Z 
2026-09-24T16:40:37.7461125Z [0m[0m13:39:47,451 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'RegistroContabilidadeAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7461269Z 
2026-09-24T16:40:37.7461486Z 	java:global/sihdg-3.15.0.0/sihdg-api/RegistroContabilidadeAS!br.gov.caixa.bsb.sihdg.core.service.RegistroContabilidadeAS
2026-09-24T16:40:37.7461749Z 	java:app/sihdg-api/RegistroContabilidadeAS!br.gov.caixa.bsb.sihdg.core.service.RegistroContabilidadeAS
2026-09-24T16:40:37.7462008Z 	java:module/RegistroContabilidadeAS!br.gov.caixa.bsb.sihdg.core.service.RegistroContabilidadeAS
2026-09-24T16:40:37.7462217Z 	java:global/sihdg-3.15.0.0/sihdg-api/RegistroContabilidadeAS
2026-09-24T16:40:37.7462400Z 	java:app/sihdg-api/RegistroContabilidadeAS
2026-09-24T16:40:37.7462530Z 	java:module/RegistroContabilidadeAS
2026-09-24T16:40:37.7462581Z 
2026-09-24T16:40:37.7462922Z [0m[0m13:39:47,451 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'HistoricoContratoPrograma1AS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7463072Z 
2026-09-24T16:40:37.7463291Z 	java:global/sihdg-3.15.0.0/sihdg-api/HistoricoContratoPrograma1AS!br.gov.caixa.bsb.sihdg.core.service.HistoricoContratoPrograma1AS
2026-09-24T16:40:37.7463571Z 	java:app/sihdg-api/HistoricoContratoPrograma1AS!br.gov.caixa.bsb.sihdg.core.service.HistoricoContratoPrograma1AS
2026-09-24T16:40:37.7463770Z 	java:module/HistoricoContratoPrograma1AS!br.gov.caixa.bsb.sihdg.core.service.HistoricoContratoPrograma1AS
2026-09-24T16:40:37.7463991Z 	java:global/sihdg-3.15.0.0/sihdg-api/HistoricoContratoPrograma1AS
2026-09-24T16:40:37.7464180Z 	java:app/sihdg-api/HistoricoContratoPrograma1AS
2026-09-24T16:40:37.7464305Z 	java:module/HistoricoContratoPrograma1AS
2026-09-24T16:40:37.7464364Z 
2026-09-24T16:40:37.7464690Z [0m[0m13:39:47,451 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'HistoricoCargaFcAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7464843Z 
2026-09-24T16:40:37.7465054Z 	java:global/sihdg-3.15.0.0/sihdg-api/HistoricoCargaFcAS!br.gov.caixa.bsb.sihdg.core.service.HistoricoCargaFcAS
2026-09-24T16:40:37.7465299Z 	java:app/sihdg-api/HistoricoCargaFcAS!br.gov.caixa.bsb.sihdg.core.service.HistoricoCargaFcAS
2026-09-24T16:40:37.7465469Z 	java:module/HistoricoCargaFcAS!br.gov.caixa.bsb.sihdg.core.service.HistoricoCargaFcAS
2026-09-24T16:40:37.7465680Z 	java:global/sihdg-3.15.0.0/sihdg-api/HistoricoCargaFcAS
2026-09-24T16:40:37.7465852Z 	java:app/sihdg-api/HistoricoCargaFcAS
2026-09-24T16:40:37.7465974Z 	java:module/HistoricoCargaFcAS
2026-09-24T16:40:37.7466023Z 
2026-09-24T16:40:37.7466352Z [0m[0m13:39:47,451 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'AtualizacaoCurvaAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7466497Z 
2026-09-24T16:40:37.7466708Z 	java:global/sihdg-3.15.0.0/sihdg-api/AtualizacaoCurvaAS!br.gov.caixa.bsb.sihdg.core.service.AtualizacaoCurvaAS
2026-09-24T16:40:37.7466960Z 	java:app/sihdg-api/AtualizacaoCurvaAS!br.gov.caixa.bsb.sihdg.core.service.AtualizacaoCurvaAS
2026-09-24T16:40:37.7467137Z 	java:module/AtualizacaoCurvaAS!br.gov.caixa.bsb.sihdg.core.service.AtualizacaoCurvaAS
2026-09-24T16:40:37.7467404Z 	java:global/sihdg-3.15.0.0/sihdg-api/AtualizacaoCurvaAS
2026-09-24T16:40:37.7467578Z 	java:app/sihdg-api/AtualizacaoCurvaAS
2026-09-24T16:40:37.7467753Z 	java:module/AtualizacaoCurvaAS
2026-09-24T16:40:37.7467801Z 
2026-09-24T16:40:37.7468137Z [0m[0m13:39:47,451 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PerfilRecursoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7468278Z 
2026-09-24T16:40:37.7468488Z 	java:global/sihdg-3.15.0.0/sihdg-api/PerfilRecursoAS!br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS
2026-09-24T16:40:37.7468747Z 	java:app/sihdg-api/PerfilRecursoAS!br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS
2026-09-24T16:40:37.7468926Z 	java:module/PerfilRecursoAS!br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS
2026-09-24T16:40:37.7469173Z 	java:global/sihdg-3.15.0.0/sihdg-api/PerfilRecursoAS
2026-09-24T16:40:37.7469374Z 	java:app/sihdg-api/PerfilRecursoAS
2026-09-24T16:40:37.7469486Z 	java:module/PerfilRecursoAS
2026-09-24T16:40:37.7469540Z 
2026-09-24T16:40:37.7469865Z [0m[0m13:39:47,451 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ParametroChoqueAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7470014Z 
2026-09-24T16:40:37.7470220Z 	java:global/sihdg-3.15.0.0/sihdg-api/ParametroChoqueAS!br.gov.caixa.bsb.sihdg.core.service.ParametroChoqueAS
2026-09-24T16:40:37.7470466Z 	java:app/sihdg-api/ParametroChoqueAS!br.gov.caixa.bsb.sihdg.core.service.ParametroChoqueAS
2026-09-24T16:40:37.7470634Z 	java:module/ParametroChoqueAS!br.gov.caixa.bsb.sihdg.core.service.ParametroChoqueAS
2026-09-24T16:40:37.7470892Z 	java:global/sihdg-3.15.0.0/sihdg-api/ParametroChoqueAS
2026-09-24T16:40:37.7471065Z 	java:app/sihdg-api/ParametroChoqueAS
2026-09-24T16:40:37.7471189Z 	java:module/ParametroChoqueAS
2026-09-24T16:40:37.7471238Z 
2026-09-24T16:40:37.7471589Z [0m[0m13:39:47,451 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'SolicitacaoHabilitacaoDerivativoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7471740Z 
2026-09-24T16:40:37.7472022Z 	java:global/sihdg-3.15.0.0/sihdg-api/SolicitacaoHabilitacaoDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.SolicitacaoHabilitacaoDerivativoAS
2026-09-24T16:40:37.7472320Z 	java:app/sihdg-api/SolicitacaoHabilitacaoDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.SolicitacaoHabilitacaoDerivativoAS
2026-09-24T16:40:37.7472528Z 	java:module/SolicitacaoHabilitacaoDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.SolicitacaoHabilitacaoDerivativoAS
2026-09-24T16:40:37.7472759Z 	java:global/sihdg-3.15.0.0/sihdg-api/SolicitacaoHabilitacaoDerivativoAS
2026-09-24T16:40:37.7472949Z 	java:app/sihdg-api/SolicitacaoHabilitacaoDerivativoAS
2026-09-24T16:40:37.7473088Z 	java:module/SolicitacaoHabilitacaoDerivativoAS
2026-09-24T16:40:37.7473144Z 
2026-09-24T16:40:37.7473472Z [0m[0m13:39:47,451 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'AtualizadorCacheAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7473618Z 
2026-09-24T16:40:37.7473826Z 	java:global/sihdg-3.15.0.0/sihdg-api/AtualizadorCacheAS!br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS
2026-09-24T16:40:37.7474085Z 	java:app/sihdg-api/AtualizadorCacheAS!br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS
2026-09-24T16:40:37.7474271Z 	java:module/AtualizadorCacheAS!br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS
2026-09-24T16:40:37.7474482Z 	java:global/sihdg-3.15.0.0/sihdg-api/AtualizadorCacheAS
2026-09-24T16:40:37.7474656Z 	java:app/sihdg-api/AtualizadorCacheAS
2026-09-24T16:40:37.7474773Z 	java:module/AtualizadorCacheAS
2026-09-24T16:40:37.7474831Z 
2026-09-24T16:40:37.7475169Z [0m[0m13:39:47,451 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ExecucaoAtualizacaoDaCurvaAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7475316Z 
2026-09-24T16:40:37.7475542Z 	java:global/sihdg-3.15.0.0/sihdg-api/ExecucaoAtualizacaoDaCurvaAS!br.gov.caixa.bsb.sihdg.core.service.ExecucaoAtualizacaoDaCurvaAS
2026-09-24T16:40:37.7475820Z 	java:app/sihdg-api/ExecucaoAtualizacaoDaCurvaAS!br.gov.caixa.bsb.sihdg.core.service.ExecucaoAtualizacaoDaCurvaAS
2026-09-24T16:40:37.7476005Z 	java:module/ExecucaoAtualizacaoDaCurvaAS!br.gov.caixa.bsb.sihdg.core.service.ExecucaoAtualizacaoDaCurvaAS
2026-09-24T16:40:37.7476230Z 	java:global/sihdg-3.15.0.0/sihdg-api/ExecucaoAtualizacaoDaCurvaAS
2026-09-24T16:40:37.7476414Z 	java:app/sihdg-api/ExecucaoAtualizacaoDaCurvaAS
2026-09-24T16:40:37.7476633Z 	java:module/ExecucaoAtualizacaoDaCurvaAS
2026-09-24T16:40:37.7476686Z 
2026-09-24T16:40:37.7477010Z [0m[0m13:39:47,451 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ArquivoSinafAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7477149Z 
2026-09-24T16:40:37.7477418Z 	java:global/sihdg-3.15.0.0/sihdg-api/ArquivoSinafAS!br.gov.caixa.bsb.sihdg.core.service.ArquivoSinafAS
2026-09-24T16:40:37.7477663Z 	java:app/sihdg-api/ArquivoSinafAS!br.gov.caixa.bsb.sihdg.core.service.ArquivoSinafAS
2026-09-24T16:40:37.7477829Z 	java:module/ArquivoSinafAS!br.gov.caixa.bsb.sihdg.core.service.ArquivoSinafAS
2026-09-24T16:40:37.7478027Z 	java:global/sihdg-3.15.0.0/sihdg-api/ArquivoSinafAS
2026-09-24T16:40:37.7478189Z 	java:app/sihdg-api/ArquivoSinafAS
2026-09-24T16:40:37.7478309Z 	java:module/ArquivoSinafAS
2026-09-24T16:40:37.7478357Z 
2026-09-24T16:40:37.7478684Z [0m[0m13:39:47,452 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TaxaCdiAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7478833Z 
2026-09-24T16:40:37.7479022Z 	java:global/sihdg-3.15.0.0/sihdg-api/TaxaCdiAS!br.gov.caixa.bsb.sihdg.core.service.TaxaCdiAS
2026-09-24T16:40:37.7479250Z 	java:app/sihdg-api/TaxaCdiAS!br.gov.caixa.bsb.sihdg.core.service.TaxaCdiAS
2026-09-24T16:40:37.7479476Z 	java:module/TaxaCdiAS!br.gov.caixa.bsb.sihdg.core.service.TaxaCdiAS
2026-09-24T16:40:37.7479671Z 	java:global/sihdg-3.15.0.0/sihdg-api/TaxaCdiAS
2026-09-24T16:40:37.7479834Z 	java:app/sihdg-api/TaxaCdiAS
2026-09-24T16:40:37.7479938Z 	java:module/TaxaCdiAS
2026-09-24T16:40:37.7479991Z 
2026-09-24T16:40:37.7480305Z [0m[0m13:39:47,452 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'SecurityConfig' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7480458Z 
2026-09-24T16:40:37.7480683Z 	java:global/sihdg-3.15.0.0/sihdg-api/SecurityConfig!br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig
2026-09-24T16:40:37.7480956Z 	java:app/sihdg-api/SecurityConfig!br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig
2026-09-24T16:40:37.7481138Z 	java:module/SecurityConfig!br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig
2026-09-24T16:40:37.7481353Z 	java:global/sihdg-3.15.0.0/sihdg-api/SecurityConfig
2026-09-24T16:40:37.7481521Z 	java:app/sihdg-api/SecurityConfig
2026-09-24T16:40:37.7481639Z 	java:module/SecurityConfig
2026-09-24T16:40:37.7481686Z 
2026-09-24T16:40:37.7482013Z [0m[0m13:39:47,452 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TrilhaAuditoriaAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7482162Z 
2026-09-24T16:40:37.7482369Z 	java:global/sihdg-3.15.0.0/sihdg-api/TrilhaAuditoriaAS!br.gov.caixa.bsb.sihdg.core.service.TrilhaAuditoriaAS
2026-09-24T16:40:37.7482623Z 	java:app/sihdg-api/TrilhaAuditoriaAS!br.gov.caixa.bsb.sihdg.core.service.TrilhaAuditoriaAS
2026-09-24T16:40:37.7482799Z 	java:module/TrilhaAuditoriaAS!br.gov.caixa.bsb.sihdg.core.service.TrilhaAuditoriaAS
2026-09-24T16:40:37.7483004Z 	java:global/sihdg-3.15.0.0/sihdg-api/TrilhaAuditoriaAS
2026-09-24T16:40:37.7483170Z 	java:app/sihdg-api/TrilhaAuditoriaAS
2026-09-24T16:40:37.7483293Z 	java:module/TrilhaAuditoriaAS
2026-09-24T16:40:37.7483339Z 
2026-09-24T16:40:37.7483675Z [0m[0m13:39:47,452 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ProspectivaSolicitacaoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7483860Z 
2026-09-24T16:40:37.7484072Z 	java:global/sihdg-3.15.0.0/sihdg-api/ProspectivaSolicitacaoAS!br.gov.caixa.bsb.sihdg.core.service.ProspectivaSolicitacaoAS
2026-09-24T16:40:37.7484368Z 	java:app/sihdg-api/ProspectivaSolicitacaoAS!br.gov.caixa.bsb.sihdg.core.service.ProspectivaSolicitacaoAS
2026-09-24T16:40:37.7484554Z 	java:module/ProspectivaSolicitacaoAS!br.gov.caixa.bsb.sihdg.core.service.ProspectivaSolicitacaoAS
2026-09-24T16:40:37.7484768Z 	java:global/sihdg-3.15.0.0/sihdg-api/ProspectivaSolicitacaoAS
2026-09-24T16:40:37.7484953Z 	java:app/sihdg-api/ProspectivaSolicitacaoAS
2026-09-24T16:40:37.7485076Z 	java:module/ProspectivaSolicitacaoAS
2026-09-24T16:40:37.7485131Z 
2026-09-24T16:40:37.7485463Z [0m[0m13:39:47,452 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'AtualizacaoCurvaTask' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7485606Z 
2026-09-24T16:40:37.7485824Z 	java:global/sihdg-3.15.0.0/sihdg-api/AtualizacaoCurvaTask!br.gov.caixa.bsb.sihdg.core.service.jobs.AtualizacaoCurvaTask
2026-09-24T16:40:37.7486091Z 	java:app/sihdg-api/AtualizacaoCurvaTask!br.gov.caixa.bsb.sihdg.core.service.jobs.AtualizacaoCurvaTask
2026-09-24T16:40:37.7486269Z 	java:module/AtualizacaoCurvaTask!br.gov.caixa.bsb.sihdg.core.service.jobs.AtualizacaoCurvaTask
2026-09-24T16:40:37.7486483Z 	java:global/sihdg-3.15.0.0/sihdg-api/AtualizacaoCurvaTask
2026-09-24T16:40:37.7486660Z 	java:app/sihdg-api/AtualizacaoCurvaTask
2026-09-24T16:40:37.7486781Z 	java:module/AtualizacaoCurvaTask
2026-09-24T16:40:37.7486830Z 
2026-09-24T16:40:37.7487147Z [0m[0m13:39:47,452 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'CurvaAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7487395Z 
2026-09-24T16:40:37.7487602Z 	java:global/sihdg-3.15.0.0/sihdg-api/CurvaAS!br.gov.caixa.bsb.sihdg.core.service.CurvaAS
2026-09-24T16:40:37.7487828Z 	java:app/sihdg-api/CurvaAS!br.gov.caixa.bsb.sihdg.core.service.CurvaAS
2026-09-24T16:40:37.7487985Z 	java:module/CurvaAS!br.gov.caixa.bsb.sihdg.core.service.CurvaAS
2026-09-24T16:40:37.7488169Z 	java:global/sihdg-3.15.0.0/sihdg-api/CurvaAS
2026-09-24T16:40:37.7488319Z 	java:app/sihdg-api/CurvaAS
2026-09-24T16:40:37.7488431Z 	java:module/CurvaAS
2026-09-24T16:40:37.7488474Z 
2026-09-24T16:40:37.7488795Z [0m[0m13:39:47,452 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'CacheConfig' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7488941Z 
2026-09-24T16:40:37.7489152Z 	java:global/sihdg-3.15.0.0/sihdg-api/CacheConfig!br.gov.caixa.arquitetura.javaee.core.comum.config.cache.CacheConfig
2026-09-24T16:40:37.7489415Z 	java:app/sihdg-api/CacheConfig!br.gov.caixa.arquitetura.javaee.core.comum.config.cache.CacheConfig
2026-09-24T16:40:37.7489603Z 	java:module/CacheConfig!br.gov.caixa.arquitetura.javaee.core.comum.config.cache.CacheConfig
2026-09-24T16:40:37.7489808Z 	java:global/sihdg-3.15.0.0/sihdg-api/CacheConfig
2026-09-24T16:40:37.7489973Z 	java:app/sihdg-api/CacheConfig
2026-09-24T16:40:37.7490081Z 	java:module/CacheConfig
2026-09-24T16:40:37.7490135Z 
2026-09-24T16:40:37.7490452Z [0m[0m13:39:47,452 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'FluxoAlmSafraAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7490597Z 
2026-09-24T16:40:37.7490800Z 	java:global/sihdg-3.15.0.0/sihdg-api/FluxoAlmSafraAS!br.gov.caixa.bsb.sihdg.core.service.FluxoAlmSafraAS
2026-09-24T16:40:37.7491033Z 	java:app/sihdg-api/FluxoAlmSafraAS!br.gov.caixa.bsb.sihdg.core.service.FluxoAlmSafraAS
2026-09-24T16:40:37.7491201Z 	java:module/FluxoAlmSafraAS!br.gov.caixa.bsb.sihdg.core.service.FluxoAlmSafraAS
2026-09-24T16:40:37.7491436Z 	java:global/sihdg-3.15.0.0/sihdg-api/FluxoAlmSafraAS
2026-09-24T16:40:37.7491640Z 	java:app/sihdg-api/FluxoAlmSafraAS
2026-09-24T16:40:37.7491757Z 	java:module/FluxoAlmSafraAS
2026-09-24T16:40:37.7491804Z 
2026-09-24T16:40:37.7492128Z [0m[0m13:39:47,452 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ContratoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7492518Z 
2026-09-24T16:40:37.7492716Z 	java:global/sihdg-3.15.0.0/sihdg-api/ContratoAS!br.gov.caixa.bsb.sihdg.core.service.ContratoAS
2026-09-24T16:40:37.7492947Z 	java:app/sihdg-api/ContratoAS!br.gov.caixa.bsb.sihdg.core.service.ContratoAS
2026-09-24T16:40:37.7493110Z 	java:module/ContratoAS!br.gov.caixa.bsb.sihdg.core.service.ContratoAS
2026-09-24T16:40:37.7493293Z 	java:global/sihdg-3.15.0.0/sihdg-api/ContratoAS
2026-09-24T16:40:37.7493459Z 	java:app/sihdg-api/ContratoAS
2026-09-24T16:40:37.7493576Z 	java:module/ContratoAS
2026-09-24T16:40:37.7493624Z 
2026-09-24T16:40:37.7493968Z [0m[0m13:39:47,452 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoItemDerivativoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7494121Z 
2026-09-24T16:40:37.7494345Z 	java:global/sihdg-3.15.0.0/sihdg-api/MovimentacaoItemDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoItemDerivativoAS
2026-09-24T16:40:37.7494623Z 	java:app/sihdg-api/MovimentacaoItemDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoItemDerivativoAS
2026-09-24T16:40:37.7494814Z 	java:module/MovimentacaoItemDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoItemDerivativoAS
2026-09-24T16:40:37.7495038Z 	java:global/sihdg-3.15.0.0/sihdg-api/MovimentacaoItemDerivativoAS
2026-09-24T16:40:37.7495226Z 	java:app/sihdg-api/MovimentacaoItemDerivativoAS
2026-09-24T16:40:37.7495353Z 	java:module/MovimentacaoItemDerivativoAS
2026-09-24T16:40:37.7495417Z 
2026-09-24T16:40:37.7495737Z [0m[0m13:39:47,452 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'OrdemCompraAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7495879Z 
2026-09-24T16:40:37.7496076Z 	java:global/sihdg-3.15.0.0/sihdg-api/OrdemCompraAS!br.gov.caixa.bsb.sihdg.core.service.OrdemCompraAS
2026-09-24T16:40:37.7496312Z 	java:app/sihdg-api/OrdemCompraAS!br.gov.caixa.bsb.sihdg.core.service.OrdemCompraAS
2026-09-24T16:40:37.7496470Z 	java:module/OrdemCompraAS!br.gov.caixa.bsb.sihdg.core.service.OrdemCompraAS
2026-09-24T16:40:37.7496666Z 	java:global/sihdg-3.15.0.0/sihdg-api/OrdemCompraAS
2026-09-24T16:40:37.7496831Z 	java:app/sihdg-api/OrdemCompraAS
2026-09-24T16:40:37.7496947Z 	java:module/OrdemCompraAS
2026-09-24T16:40:37.7496994Z 
2026-09-24T16:40:37.7497376Z [0m[0m13:39:47,452 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ProgramaFluxoCaixaAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7497526Z 
2026-09-24T16:40:37.7497754Z 	java:global/sihdg-3.15.0.0/sihdg-api/ProgramaFluxoCaixaAS!br.gov.caixa.bsb.sihdg.core.service.ProgramaFluxoCaixaAS
2026-09-24T16:40:37.7498011Z 	java:app/sihdg-api/ProgramaFluxoCaixaAS!br.gov.caixa.bsb.sihdg.core.service.ProgramaFluxoCaixaAS
2026-09-24T16:40:37.7498191Z 	java:module/ProgramaFluxoCaixaAS!br.gov.caixa.bsb.sihdg.core.service.ProgramaFluxoCaixaAS
2026-09-24T16:40:37.7498394Z 	java:global/sihdg-3.15.0.0/sihdg-api/ProgramaFluxoCaixaAS
2026-09-24T16:40:37.7498570Z 	java:app/sihdg-api/ProgramaFluxoCaixaAS
2026-09-24T16:40:37.7498694Z 	java:module/ProgramaFluxoCaixaAS
2026-09-24T16:40:37.7498743Z 
2026-09-24T16:40:37.7499081Z [0m[0m13:39:47,452 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ItemDerivativoGerencialAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7499302Z 
2026-09-24T16:40:37.7499521Z 	java:global/sihdg-3.15.0.0/sihdg-api/ItemDerivativoGerencialAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoGerencialAS
2026-09-24T16:40:37.7499793Z 	java:app/sihdg-api/ItemDerivativoGerencialAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoGerencialAS
2026-09-24T16:40:37.7499982Z 	java:module/ItemDerivativoGerencialAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoGerencialAS
2026-09-24T16:40:37.7500198Z 	java:global/sihdg-3.15.0.0/sihdg-api/ItemDerivativoGerencialAS
2026-09-24T16:40:37.7500380Z 	java:app/sihdg-api/ItemDerivativoGerencialAS
2026-09-24T16:40:37.7500502Z 	java:module/ItemDerivativoGerencialAS
2026-09-24T16:40:37.7500561Z 
2026-09-24T16:40:37.7500883Z [0m[0m13:39:47,452 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'GestaoCargaAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7501032Z 
2026-09-24T16:40:37.7501231Z 	java:global/sihdg-3.15.0.0/sihdg-api/GestaoCargaAS!br.gov.caixa.bsb.sihdg.core.service.GestaoCargaAS
2026-09-24T16:40:37.7501464Z 	java:app/sihdg-api/GestaoCargaAS!br.gov.caixa.bsb.sihdg.core.service.GestaoCargaAS
2026-09-24T16:40:37.7501624Z 	java:module/GestaoCargaAS!br.gov.caixa.bsb.sihdg.core.service.GestaoCargaAS
2026-09-24T16:40:37.7501820Z 	java:global/sihdg-3.15.0.0/sihdg-api/GestaoCargaAS
2026-09-24T16:40:37.7501984Z 	java:app/sihdg-api/GestaoCargaAS
2026-09-24T16:40:37.7502100Z 	java:module/GestaoCargaAS
2026-09-24T16:40:37.7502147Z 
2026-09-24T16:40:37.7502473Z [0m[0m13:39:47,452 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ProdutoEventoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7502610Z 
2026-09-24T16:40:37.7502813Z 	java:global/sihdg-3.15.0.0/sihdg-api/ProdutoEventoAS!br.gov.caixa.bsb.sihdg.core.service.ProdutoEventoAS
2026-09-24T16:40:37.7503053Z 	java:app/sihdg-api/ProdutoEventoAS!br.gov.caixa.bsb.sihdg.core.service.ProdutoEventoAS
2026-09-24T16:40:37.7503221Z 	java:module/ProdutoEventoAS!br.gov.caixa.bsb.sihdg.core.service.ProdutoEventoAS
2026-09-24T16:40:37.7503409Z 	java:global/sihdg-3.15.0.0/sihdg-api/ProdutoEventoAS
2026-09-24T16:40:37.7503578Z 	java:app/sihdg-api/ProdutoEventoAS
2026-09-24T16:40:37.7503698Z 	java:module/ProdutoEventoAS
2026-09-24T16:40:37.7503744Z 
2026-09-24T16:40:37.7504082Z [0m[0m13:39:47,452 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ItemDerivativoGerencialFcAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7504232Z 
2026-09-24T16:40:37.7504449Z 	java:global/sihdg-3.15.0.0/sihdg-api/ItemDerivativoGerencialFcAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoGerencialFcAS
2026-09-24T16:40:37.7504727Z 	java:app/sihdg-api/ItemDerivativoGerencialFcAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoGerencialFcAS
2026-09-24T16:40:37.7504923Z 	java:module/ItemDerivativoGerencialFcAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoGerencialFcAS
2026-09-24T16:40:37.7505139Z 	java:global/sihdg-3.15.0.0/sihdg-api/ItemDerivativoGerencialFcAS
2026-09-24T16:40:37.7505327Z 	java:app/sihdg-api/ItemDerivativoGerencialFcAS
2026-09-24T16:40:37.7505448Z 	java:module/ItemDerivativoGerencialFcAS
2026-09-24T16:40:37.7505506Z 
2026-09-24T16:40:37.7505818Z [0m[0m13:39:47,452 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'RecursoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7505963Z 
2026-09-24T16:40:37.7506165Z 	java:global/sihdg-3.15.0.0/sihdg-api/RecursoAS!br.gov.caixa.arquitetura.javaee.core.seguranca.RecursoAS
2026-09-24T16:40:37.7506451Z 	java:app/sihdg-api/RecursoAS!br.gov.caixa.arquitetura.javaee.core.seguranca.RecursoAS
2026-09-24T16:40:37.7506623Z 	java:module/RecursoAS!br.gov.caixa.arquitetura.javaee.core.seguranca.RecursoAS
2026-09-24T16:40:37.7506816Z 	java:global/sihdg-3.15.0.0/sihdg-api/RecursoAS
2026-09-24T16:40:37.7506975Z 	java:app/sihdg-api/RecursoAS
2026-09-24T16:40:37.7507088Z 	java:module/RecursoAS
2026-09-24T16:40:37.7507132Z 
2026-09-24T16:40:37.7507523Z [0m[0m13:39:47,453 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ContratoTemporarioAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7507675Z 
2026-09-24T16:40:37.7507897Z 	java:global/sihdg-3.15.0.0/sihdg-api/ContratoTemporarioAS!br.gov.caixa.bsb.sihdg.core.service.ContratoTemporarioAS
2026-09-24T16:40:37.7508156Z 	java:app/sihdg-api/ContratoTemporarioAS!br.gov.caixa.bsb.sihdg.core.service.ContratoTemporarioAS
2026-09-24T16:40:37.7508347Z 	java:module/ContratoTemporarioAS!br.gov.caixa.bsb.sihdg.core.service.ContratoTemporarioAS
2026-09-24T16:40:37.7508552Z 	java:global/sihdg-3.15.0.0/sihdg-api/ContratoTemporarioAS
2026-09-24T16:40:37.7508732Z 	java:app/sihdg-api/ContratoTemporarioAS
2026-09-24T16:40:37.7508857Z 	java:module/ContratoTemporarioAS
2026-09-24T16:40:37.7508906Z 
2026-09-24T16:40:37.7509245Z [0m[0m13:39:47,453 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'AtualizacaoCurvaFcAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7509394Z 
2026-09-24T16:40:37.7509663Z 	java:global/sihdg-3.15.0.0/sihdg-api/AtualizacaoCurvaFcAS!br.gov.caixa.bsb.sihdg.core.service.AtualizacaoCurvaFcAS
2026-09-24T16:40:37.7509934Z 	java:app/sihdg-api/AtualizacaoCurvaFcAS!br.gov.caixa.bsb.sihdg.core.service.AtualizacaoCurvaFcAS
2026-09-24T16:40:37.7510117Z 	java:module/AtualizacaoCurvaFcAS!br.gov.caixa.bsb.sihdg.core.service.AtualizacaoCurvaFcAS
2026-09-24T16:40:37.7510325Z 	java:global/sihdg-3.15.0.0/sihdg-api/AtualizacaoCurvaFcAS
2026-09-24T16:40:37.7510501Z 	java:app/sihdg-api/AtualizacaoCurvaFcAS
2026-09-24T16:40:37.7510614Z 	java:module/AtualizacaoCurvaFcAS
2026-09-24T16:40:37.7510668Z 
2026-09-24T16:40:37.7510997Z [0m[0m13:39:47,453 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'GestaoEfetividadeAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7511149Z 
2026-09-24T16:40:37.7511362Z 	java:global/sihdg-3.15.0.0/sihdg-api/GestaoEfetividadeAS!br.gov.caixa.bsb.sihdg.core.service.GestaoEfetividadeAS
2026-09-24T16:40:37.7511606Z 	java:app/sihdg-api/GestaoEfetividadeAS!br.gov.caixa.bsb.sihdg.core.service.GestaoEfetividadeAS
2026-09-24T16:40:37.7511786Z 	java:module/GestaoEfetividadeAS!br.gov.caixa.bsb.sihdg.core.service.GestaoEfetividadeAS
2026-09-24T16:40:37.7511996Z 	java:global/sihdg-3.15.0.0/sihdg-api/GestaoEfetividadeAS
2026-09-24T16:40:37.7512171Z 	java:app/sihdg-api/GestaoEfetividadeAS
2026-09-24T16:40:37.7512291Z 	java:module/GestaoEfetividadeAS
2026-09-24T16:40:37.7512342Z 
2026-09-24T16:40:37.7512675Z [0m[0m13:39:47,453 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ControleCacheTask' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7512818Z 
2026-09-24T16:40:37.7513042Z 	java:global/sihdg-3.15.0.0/sihdg-api/ControleCacheTask!br.gov.caixa.arquitetura.javaee.core.comum.servico.ControleCacheTask
2026-09-24T16:40:37.7513317Z 	java:app/sihdg-api/ControleCacheTask!br.gov.caixa.arquitetura.javaee.core.comum.servico.ControleCacheTask
2026-09-24T16:40:37.7513510Z 	java:module/ControleCacheTask!br.gov.caixa.arquitetura.javaee.core.comum.servico.ControleCacheTask
2026-09-24T16:40:37.7513748Z 	java:global/sihdg-3.15.0.0/sihdg-api/ControleCacheTask
2026-09-24T16:40:37.7513953Z 	java:app/sihdg-api/ControleCacheTask
2026-09-24T16:40:37.7514077Z 	java:module/ControleCacheTask
2026-09-24T16:40:37.7514123Z 
2026-09-24T16:40:37.7514458Z [0m[0m13:39:47,453 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ControleCacheAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.15.0.0.ear"' are as follows:
2026-09-24T16:40:37.7514608Z 
2026-09-24T16:40:37.7514810Z 	java:global/sihdg-3.15.0.0/sihdg-api/ControleCacheAS!br.gov.caixa.arquitetura.javaee.core.util.ControleCacheAS
2026-09-24T16:40:37.7515064Z 	java:app/sihdg-api/ControleCacheAS!br.gov.caixa.arquitetura.javaee.core.util.ControleCacheAS
2026-09-24T16:40:37.7515242Z 	java:module/ControleCacheAS!br.gov.caixa.arquitetura.javaee.core.util.ControleCacheAS
2026-09-24T16:40:37.7515444Z 	java:global/sihdg-3.15.0.0/sihdg-api/ControleCacheAS
2026-09-24T16:40:37.7515618Z 	java:app/sihdg-api/ControleCacheAS
2026-09-24T16:40:37.7515733Z 	java:module/ControleCacheAS
2026-09-24T16:40:37.7515786Z 
2026-09-24T16:40:37.7515986Z [0m[0m13:39:47,749 INFO  [org.jboss.weld.Version] (MSC service thread 1-1) WELD-000900: 5.1.6 (redhat)
2026-09-24T16:40:37.7516347Z [0m[33m13:39:48,363 WARN  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.bsb.sihdg.core.service.RegistroContabilidadeAS should not have a final or static method (toSingleton)
2026-09-24T16:40:37.7516723Z [0m[0m13:39:48,365 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 46) WFLYJPA0010: Starting Persistence Unit (phase 1 of 2) Service 'sihdg-3.15.0.0.ear/sihdg-api.war#sihdgDS'
2026-09-24T16:40:37.7517088Z [0m[0m13:39:48,377 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 46) HHH000204: Processing PersistenceUnitInfo [name: sihdgDS]
2026-09-24T16:40:37.7517471Z [0m[0m13:39:48,562 INFO  [org.hibernate.Version] (ServerService Thread Pool -- 46) HHH000412: Hibernate ORM core version 6.2.49.Final-redhat-00001
2026-09-24T16:40:37.7517846Z [0m[0m13:39:48,569 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 46) HHH000406: Using bytecode reflection optimizer
2026-09-24T16:40:37.7518258Z [0m[33m13:39:48,687 WARN  [org.hibernate.orm.deprecation] (ServerService Thread Pool -- 46) HHH90000025: SQLServer2012Dialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-09-24T16:40:37.7518678Z [0m[33m13:39:48,687 WARN  [org.hibernate.orm.deprecation] (ServerService Thread Pool -- 46) HHH90000026: SQLServer2012Dialect has been deprecated; use org.hibernate.dialect.SQLServerDialect instead
2026-09-24T16:40:37.7519015Z [0m[0m13:39:48,757 INFO  [org.jipijapa] (MSC service thread 1-1) JIPIORMV6020260: Second level cache enabled for sihdg-3.15.0.0.ear/sihdg-api.war#sihdgDS
2026-09-24T16:40:37.7519518Z [0m[33m13:39:48,871 WARN  [org.jboss.as.jaxrs] (MSC service thread 1-1) WFLYRS0018: Explicit usage of Jackson annotation in a Jakarta RESTful Web Services deployment; the system will disable Jakarta JSON Binding processing for the current deployment. Consider setting the 'resteasy.preferJacksonOverJsonB' property to 'false' to restore Jakarta JSON Binding.
2026-09-24T16:40:37.7519931Z [0m[0m13:39:48,955 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 46) Envers integration enabled? : true
2026-09-24T16:40:37.7520338Z [0m[0m13:39:49,352 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 46) WFLYJPA0010: Starting Persistence Unit (phase 2 of 2) Service 'sihdg-3.15.0.0.ear/sihdg-api.war#sihdgDS'
2026-09-24T16:40:37.7520756Z [0m[0m13:39:51,256 INFO  [org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator] (ServerService Thread Pool -- 46) HHH000490: Using JTA platform [org.hibernate.engine.transaction.jta.platform.internal.JBossAppServerJtaPlatform]
2026-09-24T16:40:37.7521171Z [0m[0m13:39:58,365 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.cache.CacheConfig] (ServerService Thread Pool -- 52) Atualizando o cache inicial ...
2026-09-24T16:40:37.7521606Z [0m[0m13:39:58,553 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.seguranca.ContextoSegurancaHelper] (ServerService Thread Pool -- 66) SEGURANCA - Operacao durante inicializacao permitida sem contexto. Operacao: Perfil.createQuery
2026-09-24T16:40:37.7522193Z [0m[33m13:39:58,571 WARNING [com.hazelcast.instance.HazelcastInstanceFactory] (ServerService Thread Pool -- 52) Hazelcast is starting in a Java modular environment (Java 9 and newer) but without proper access to required Java packages. Use additional Java arguments to provide Hazelcast access to Java internal API. The internal API access is used to get the best performance results. Arguments to be used:
2026-09-24T16:40:37.7522798Z  --add-modules java.se --add-exports java.base/jdk.internal.ref=ALL-UNNAMED --add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.base/java.nio=ALL-UNNAMED --add-opens java.base/sun.nio.ch=ALL-UNNAMED --add-opens java.management/sun.management=ALL-UNNAMED --add-opens jdk.management/com.sun.management.internal=ALL-UNNAMED
2026-09-24T16:40:37.7523453Z [0m[0m13:39:58,657 INFO  [com.hazelcast.instance.AddressPicker] (ServerService Thread Pool -- 52) [LOCAL] [dev] [3.12.12] Prefer IPv4 stack is true, prefer IPv6 addresses is false
2026-09-24T16:40:37.7523915Z [0m[0m13:39:58,659 INFO  [com.hazelcast.instance.AddressPicker] (ServerService Thread Pool -- 52) [LOCAL] [dev] [3.12.12] Picked [25.1.44.134]:5701, using socket ServerSocket[addr=/0.0.0.0,localport=5701], bind any local is true
2026-09-24T16:40:37.7524339Z [0m[0m13:39:58,668 INFO  [com.hazelcast.system] (ServerService Thread Pool -- 52) [25.1.44.134]:5701 [dev] [3.12.12] Hazelcast 3.12.12 (20210209 - 35096ec) starting at [25.1.44.134]:5701
2026-09-24T16:40:37.7524730Z [0m[0m13:39:58,668 INFO  [com.hazelcast.system] (ServerService Thread Pool -- 52) [25.1.44.134]:5701 [dev] [3.12.12] Copyright (c) 2008-2020, Hazelcast, Inc. All Rights Reserved.
2026-09-24T16:40:37.7525115Z [0m[0m13:39:58,964 INFO  [com.hazelcast.spi.impl.operationservice.impl.BackpressureRegulator] (ServerService Thread Pool -- 52) [25.1.44.134]:5701 [dev] [3.12.12] Backpressure is disabled
2026-09-24T16:40:37.7525401Z [0m[0m13:39:59,252 INFO  [stdout] (ServerService Thread Pool -- 66) Hibernate: 
2026-09-24T16:40:37.7525630Z [0m[0m13:39:59,252 INFO  [stdout] (ServerService Thread Pool -- 66)     select
2026-09-24T16:40:37.7525941Z [0m[0m13:39:59,252 INFO  [stdout] (ServerService Thread Pool -- 66)         p1_0.CO_PERFIL_ID,
2026-09-24T16:40:37.7526182Z [0m[0m13:39:59,252 INFO  [stdout] (ServerService Thread Pool -- 66)         p1_0.TS_ATLZO_PERFIL,
2026-09-24T16:40:37.7526417Z [0m[0m13:39:59,252 INFO  [stdout] (ServerService Thread Pool -- 66)         p1_0.DE_PERFIL_ACESSO,
2026-09-24T16:40:37.7526758Z [0m[0m13:39:59,253 INFO  [stdout] (ServerService Thread Pool -- 66)         p1_0.NO_PERFIL_ACESSO,
2026-09-24T16:40:37.7527140Z [0m[0m13:39:59,253 INFO  [stdout] (ServerService Thread Pool -- 66)         p1_0.CO_TRMNL_ATLZO_PERFIL,
2026-09-24T16:40:37.7527631Z [0m[0m13:39:59,253 INFO  [stdout] (ServerService Thread Pool -- 66)         p1_0.CO_USUARIO_ATLZO_PERFIL 
2026-09-24T16:40:37.7527984Z [0m[0m13:39:59,253 INFO  [stdout] (ServerService Thread Pool -- 66)     from
2026-09-24T16:40:37.7528403Z [0m[0m13:39:59,253 INFO  [stdout] (ServerService Thread Pool -- 66)         dbo.HDGTB011_PERFIL_ACESSO p1_0 
2026-09-24T16:40:37.7528812Z [0m[0m13:39:59,253 INFO  [stdout] (ServerService Thread Pool -- 66)     where
2026-09-24T16:40:37.7529147Z [0m[0m13:39:59,253 INFO  [stdout] (ServerService Thread Pool -- 66)         p1_0.NO_PERFIL_ACESSO=?
2026-09-24T16:40:37.7529784Z [0m[33m13:39:59,754 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (ServerService Thread Pool -- 66) IJ000604: Throwable while attempting to get a new connection: null: jakarta.resource.ResourceException: IJ031084: Unable to create connection
2026-09-24T16:40:37.7530825Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
2026-09-24T16:40:37.7531521Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
2026-09-24T16:40:37.7532194Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
2026-09-24T16:40:37.7532964Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1381)
2026-09-24T16:40:37.7533755Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:534)
2026-09-24T16:40:37.7534407Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getTransactionNewConnection(AbstractPool.java:770)
2026-09-24T16:40:37.7534970Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:666)
2026-09-24T16:40:37.7535587Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
2026-09-24T16:40:37.7536231Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
2026-09-24T16:40:37.7536850Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
2026-09-24T16:40:37.7537568Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
2026-09-24T16:40:37.7538149Z 	at org.jboss.as.connector@8.0.13.GA-redhat-00002//org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
2026-09-24T16:40:37.7538766Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
2026-09-24T16:40:37.7539361Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.internal.NonContextualJdbcConnectionAccess.obtainConnection(NonContextualJdbcConnectionAccess.java:38)
2026-09-24T16:40:37.7539954Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:113)
2026-09-24T16:40:37.7540702Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
2026-09-24T16:40:37.7541255Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
2026-09-24T16:40:37.7541801Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
2026-09-24T16:40:37.7542387Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
2026-09-24T16:40:37.7542954Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
2026-09-24T16:40:37.7543720Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
2026-09-24T16:40:37.7544273Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:227)
2026-09-24T16:40:37.7544813Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:164)
2026-09-24T16:40:37.7545363Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
2026-09-24T16:40:37.7545913Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
2026-09-24T16:40:37.7546457Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
2026-09-24T16:40:37.7546990Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
2026-09-24T16:40:37.7547618Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
2026-09-24T16:40:37.7548114Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
2026-09-24T16:40:37.7548635Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
2026-09-24T16:40:37.7549199Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
2026-09-24T16:40:37.7549837Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
2026-09-24T16:40:37.7550345Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
2026-09-24T16:40:37.7550865Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:107)
2026-09-24T16:40:37.7551452Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:300)
2026-09-24T16:40:37.7552033Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:241)
2026-09-24T16:40:37.7552516Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
2026-09-24T16:40:37.7552999Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
2026-09-24T16:40:37.7553526Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.getSingleResult(AbstractSelectionQuery.java:473)
2026-09-24T16:40:37.7554106Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRepository.consultarPorNome(PerfilRepository.java:31)
2026-09-24T16:40:37.7554745Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRepository$Proxy$_$$_WeldClientProxy.consultarPorNome(Unknown Source)
2026-09-24T16:40:37.7555297Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS.gravar(PerfilAS.java:132)
2026-09-24T16:40:37.7555803Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.7556166Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.7556663Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
2026-09-24T16:40:37.7557475Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7557958Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7558317Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-24T16:40:37.7558676Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
2026-09-24T16:40:37.7559041Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
2026-09-24T16:40:37.7559377Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
2026-09-24T16:40:37.7559692Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7560032Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
2026-09-24T16:40:37.7560350Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7560668Z 	at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
2026-09-24T16:40:37.7560980Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7561309Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-24T16:40:37.7561612Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7561911Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
2026-09-24T16:40:37.7562212Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7562514Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7562862Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
2026-09-24T16:40:37.7563176Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7563501Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
2026-09-24T16:40:37.7563803Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7564130Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
2026-09-24T16:40:37.7564508Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7564847Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
2026-09-24T16:40:37.7565215Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:392)
2026-09-24T16:40:37.7565522Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:160)
2026-09-24T16:40:37.7565817Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7566113Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7566479Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
2026-09-24T16:40:37.7566860Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-24T16:40:37.7567169Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7567594Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-24T16:40:37.7567918Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7568243Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
2026-09-24T16:40:37.7568548Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7568866Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
2026-09-24T16:40:37.7569170Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7569483Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
2026-09-24T16:40:37.7569785Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7570108Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
2026-09-24T16:40:37.7570415Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7570738Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
2026-09-24T16:40:37.7571053Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7571364Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
2026-09-24T16:40:37.7571665Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7571981Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-24T16:40:37.7572321Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7572676Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-24T16:40:37.7572985Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7573270Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
2026-09-24T16:40:37.7573595Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
2026-09-24T16:40:37.7573932Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
2026-09-24T16:40:37.7574238Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7574540Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7574831Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
2026-09-24T16:40:37.7575121Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
2026-09-24T16:40:37.7575413Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7575725Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
2026-09-24T16:40:37.7576063Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
2026-09-24T16:40:37.7576386Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
2026-09-24T16:40:37.7576698Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
2026-09-24T16:40:37.7577001Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
2026-09-24T16:40:37.7577419Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7577743Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7578050Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
2026-09-24T16:40:37.7578361Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS$$$view10.gravar(Unknown Source)
2026-09-24T16:40:37.7578576Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.7578766Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.7579036Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
2026-09-24T16:40:37.7579368Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
2026-09-24T16:40:37.7579710Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
2026-09-24T16:40:37.7580130Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
2026-09-24T16:40:37.7580499Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
2026-09-24T16:40:37.7580822Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS$Proxy$_$$_Weld$EnterpriseProxy$.gravar(Unknown Source)
2026-09-24T16:40:37.7581153Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig.onStartup(SecurityConfig.java:71)
2026-09-24T16:40:37.7581383Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.7581567Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.7581894Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
2026-09-24T16:40:37.7582227Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7582532Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7582868Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-24T16:40:37.7583212Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:126)
2026-09-24T16:40:37.7583566Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:112)
2026-09-24T16:40:37.7583882Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7584184Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7584543Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:87)
2026-09-24T16:40:37.7584921Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-24T16:40:37.7585240Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7585554Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
2026-09-24T16:40:37.7585858Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7586191Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
2026-09-24T16:40:37.7586506Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7586842Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
2026-09-24T16:40:37.7587160Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7587590Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:111)
2026-09-24T16:40:37.7587972Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7588285Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-24T16:40:37.7588599Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7588891Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254)
2026-09-24T16:40:37.7589188Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:416)
2026-09-24T16:40:37.7589508Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:68)
2026-09-24T16:40:37.7589818Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7590142Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
2026-09-24T16:40:37.7590453Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7590803Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-24T16:40:37.7591123Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7591445Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-24T16:40:37.7591755Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7592232Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-24T16:40:37.7592727Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7593272Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.StartupCountDownInterceptor.processInvocation(StartupCountDownInterceptor.java:25)
2026-09-24T16:40:37.7593773Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7594198Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7594522Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:168)
2026-09-24T16:40:37.7594842Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:141)
2026-09-24T16:40:37.7595144Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
2026-09-24T16:40:37.7595535Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:127)
2026-09-24T16:40:37.7595856Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:141)
2026-09-24T16:40:37.7596225Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
2026-09-24T16:40:37.7596475Z 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
2026-09-24T16:40:37.7596668Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
2026-09-24T16:40:37.7596965Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
2026-09-24T16:40:37.7597342Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
2026-09-24T16:40:37.7597673Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
2026-09-24T16:40:37.7597999Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1348)
2026-09-24T16:40:37.7598194Z 	at java.base/java.lang.Thread.run(Thread.java:1583)
2026-09-24T16:40:37.7598455Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)
2026-09-24T16:40:37.7599035Z Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: "encrypt" property is set to "true" and "trustServerCertificate" property is set to "true" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (unsupported_certificate) Certificates do not conform to algorithm constraints. ClientConnectionId:4a1f60f0-b155-4d55-8dd3-0b7731a36b99
2026-09-24T16:40:37.7599403Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.terminate(SQLServerConnection.java:4290)
2026-09-24T16:40:37.7599670Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1965)
2026-09-24T16:40:37.7599876Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:3816)
2026-09-24T16:40:37.7600098Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:3372)
2026-09-24T16:40:37.7600319Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:3197)
2026-09-24T16:40:37.7600545Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:1971)
2026-09-24T16:40:37.7600755Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:1263)
2026-09-24T16:40:37.7601133Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
2026-09-24T16:40:37.7601338Z 	... 170 more
2026-09-24T16:40:37.7601485Z Caused by: javax.net.ssl.SSLHandshakeException: (unsupported_certificate) Certificates do not conform to algorithm constraints
2026-09-24T16:40:37.7601673Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130)
2026-09-24T16:40:37.7601853Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:383)
2026-09-24T16:40:37.7602040Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:326)
2026-09-24T16:40:37.7602217Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-09-24T16:40:37.7602419Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647)
2026-09-24T16:40:37.7602658Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467)
2026-09-24T16:40:37.7602883Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363)
2026-09-24T16:40:37.7603079Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393)
2026-09-24T16:40:37.7603319Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:477)
2026-09-24T16:40:37.7603522Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:448)
2026-09-24T16:40:37.7603701Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:206)
2026-09-24T16:40:37.7603876Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:172)
2026-09-24T16:40:37.7604048Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1506)
2026-09-24T16:40:37.7604228Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1421)
2026-09-24T16:40:37.7604414Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:455)
2026-09-24T16:40:37.7604586Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:426)
2026-09-24T16:40:37.7604776Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1854)
2026-09-24T16:40:37.7604925Z 	... 176 more
2026-09-24T16:40:37.7605071Z Caused by: java.security.cert.CertificateException: Certificates do not conform to algorithm constraints
2026-09-24T16:40:37.7605272Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1557)
2026-09-24T16:40:37.7605479Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAdditionalTrust(SSLContextImpl.java:1484)
2026-09-24T16:40:37.7605688Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkServerTrusted(SSLContextImpl.java:1431)
2026-09-24T16:40:37.7605906Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:631)
2026-09-24T16:40:37.7606063Z 	... 188 more
2026-09-24T16:40:37.7606214Z Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA
2026-09-24T16:40:37.7606413Z 	at java.base/sun.security.provider.certpath.AlgorithmChecker.check(AlgorithmChecker.java:231)
2026-09-24T16:40:37.7606615Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1553)
2026-09-24T16:40:37.7606763Z 	... 191 more
2026-09-24T16:40:37.7606798Z 
2026-09-24T16:40:37.7607045Z [0m[33m13:39:59,756 WARN  [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (ServerService Thread Pool -- 66) SQL Error: 0, SQLState: null
2026-09-24T16:40:37.7607514Z [0m[31m13:39:59,757 ERROR [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (ServerService Thread Pool -- 66) jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-24T16:40:37.7608301Z [0m[31m13:39:59,763 ERROR [org.jboss.as.ejb3.invocation] (ServerService Thread Pool -- 66) WFLYEJB0034: Jakarta Enterprise Beans Invocation failed on component PerfilAS for method public void br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS.gravar(br.gov.caixa.arquitetura.javaee.core.comum.dto.PerfilDTO): jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-24T16:40:37.7608802Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:219)
2026-09-24T16:40:37.7609106Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:392)
2026-09-24T16:40:37.7609412Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:160)
2026-09-24T16:40:37.7609771Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7610105Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7610505Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
2026-09-24T16:40:37.7611062Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-24T16:40:37.7611555Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7612038Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-24T16:40:37.7612370Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7612769Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
2026-09-24T16:40:37.7613096Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7613585Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
2026-09-24T16:40:37.7614074Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7614596Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
2026-09-24T16:40:37.7615107Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7615642Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
2026-09-24T16:40:37.7616159Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7616699Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
2026-09-24T16:40:37.7617412Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7617838Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
2026-09-24T16:40:37.7618241Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7618662Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-24T16:40:37.7619045Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7619500Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-24T16:40:37.7620017Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7620455Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
2026-09-24T16:40:37.7620967Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
2026-09-24T16:40:37.7621510Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
2026-09-24T16:40:37.7622070Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7622381Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7622687Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
2026-09-24T16:40:37.7622983Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
2026-09-24T16:40:37.7623282Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7623601Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
2026-09-24T16:40:37.7623944Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
2026-09-24T16:40:37.7624271Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
2026-09-24T16:40:37.7624588Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
2026-09-24T16:40:37.7624903Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
2026-09-24T16:40:37.7625202Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7625509Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7625820Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
2026-09-24T16:40:37.7626134Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS$$$view10.gravar(Unknown Source)
2026-09-24T16:40:37.7626349Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.7626536Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.7626804Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
2026-09-24T16:40:37.7627134Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
2026-09-24T16:40:37.7627629Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
2026-09-24T16:40:37.7628026Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
2026-09-24T16:40:37.7628371Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
2026-09-24T16:40:37.7628699Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS$Proxy$_$$_Weld$EnterpriseProxy$.gravar(Unknown Source)
2026-09-24T16:40:37.7629034Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig.onStartup(SecurityConfig.java:71)
2026-09-24T16:40:37.7629263Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.7629443Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.7629847Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
2026-09-24T16:40:37.7630178Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7630499Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7630837Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-24T16:40:37.7631278Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:126)
2026-09-24T16:40:37.7631636Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:112)
2026-09-24T16:40:37.7631951Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7632258Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7632615Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:87)
2026-09-24T16:40:37.7632990Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-24T16:40:37.7633307Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7633632Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
2026-09-24T16:40:37.7633944Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7634269Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
2026-09-24T16:40:37.7634583Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7634914Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
2026-09-24T16:40:37.7635233Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7635569Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:111)
2026-09-24T16:40:37.7635886Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7636228Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-24T16:40:37.7636527Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7636823Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254)
2026-09-24T16:40:37.7637118Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:416)
2026-09-24T16:40:37.7637670Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:68)
2026-09-24T16:40:37.7638025Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7638352Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
2026-09-24T16:40:37.7638700Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7639064Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-24T16:40:37.7639391Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7639715Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-24T16:40:37.7640029Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7640354Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-24T16:40:37.7640669Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7640998Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.StartupCountDownInterceptor.processInvocation(StartupCountDownInterceptor.java:25)
2026-09-24T16:40:37.7641303Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7641613Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7641924Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:168)
2026-09-24T16:40:37.7642330Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:141)
2026-09-24T16:40:37.7642634Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
2026-09-24T16:40:37.7642953Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:127)
2026-09-24T16:40:37.7643279Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:141)
2026-09-24T16:40:37.7643577Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
2026-09-24T16:40:37.7643783Z 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
2026-09-24T16:40:37.7643964Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
2026-09-24T16:40:37.7644257Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
2026-09-24T16:40:37.7644573Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
2026-09-24T16:40:37.7644888Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
2026-09-24T16:40:37.7645200Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1348)
2026-09-24T16:40:37.7645466Z 	at java.base/java.lang.Thread.run(Thread.java:1583)
2026-09-24T16:40:37.7645718Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)
2026-09-24T16:40:37.7645963Z Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-24T16:40:37.7646325Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:61)
2026-09-24T16:40:37.7646648Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
2026-09-24T16:40:37.7646942Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
2026-09-24T16:40:37.7647375Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
2026-09-24T16:40:37.7647783Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
2026-09-24T16:40:37.7648126Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
2026-09-24T16:40:37.7648453Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
2026-09-24T16:40:37.7648815Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
2026-09-24T16:40:37.7649173Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
2026-09-24T16:40:37.7649528Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
2026-09-24T16:40:37.7649860Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:227)
2026-09-24T16:40:37.7650198Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:164)
2026-09-24T16:40:37.7650535Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
2026-09-24T16:40:37.7650869Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
2026-09-24T16:40:37.7651193Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
2026-09-24T16:40:37.7651597Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
2026-09-24T16:40:37.7651921Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
2026-09-24T16:40:37.7652218Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
2026-09-24T16:40:37.7652551Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
2026-09-24T16:40:37.7652898Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
2026-09-24T16:40:37.7653415Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
2026-09-24T16:40:37.7653828Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
2026-09-24T16:40:37.7654248Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:107)
2026-09-24T16:40:37.7654615Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:300)
2026-09-24T16:40:37.7654955Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:241)
2026-09-24T16:40:37.7655255Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
2026-09-24T16:40:37.7655556Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
2026-09-24T16:40:37.7655911Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.getSingleResult(AbstractSelectionQuery.java:473)
2026-09-24T16:40:37.7656290Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRepository.consultarPorNome(PerfilRepository.java:31)
2026-09-24T16:40:37.7656737Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRepository$Proxy$_$$_WeldClientProxy.consultarPorNome(Unknown Source)
2026-09-24T16:40:37.7657074Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS.gravar(PerfilAS.java:132)
2026-09-24T16:40:37.7657389Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.7657597Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.7657921Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
2026-09-24T16:40:37.7658247Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7658561Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7658906Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-24T16:40:37.7659289Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
2026-09-24T16:40:37.7659640Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
2026-09-24T16:40:37.7659990Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
2026-09-24T16:40:37.7660310Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7660649Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
2026-09-24T16:40:37.7660974Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7661347Z 	at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
2026-09-24T16:40:37.7661707Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7662021Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-24T16:40:37.7662328Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7662626Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
2026-09-24T16:40:37.7662928Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7663231Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7663580Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
2026-09-24T16:40:37.7663896Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7664212Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
2026-09-24T16:40:37.7664527Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7664859Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
2026-09-24T16:40:37.7665173Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7665471Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
2026-09-24T16:40:37.7665633Z 	... 103 more
2026-09-24T16:40:37.7665791Z Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-24T16:40:37.7666129Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:160)
2026-09-24T16:40:37.7666474Z 	at org.jboss.as.connector@8.0.13.GA-redhat-00002//org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
2026-09-24T16:40:37.7666914Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
2026-09-24T16:40:37.7667397Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.internal.NonContextualJdbcConnectionAccess.obtainConnection(NonContextualJdbcConnectionAccess.java:38)
2026-09-24T16:40:37.7667795Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:113)
2026-09-24T16:40:37.7667981Z 	... 156 more
2026-09-24T16:40:37.7668129Z Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-24T16:40:37.7668479Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:690)
2026-09-24T16:40:37.7668852Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
2026-09-24T16:40:37.7669314Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
2026-09-24T16:40:37.7669673Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
2026-09-24T16:40:37.7669848Z 	... 160 more
2026-09-24T16:40:37.7670045Z Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
2026-09-24T16:40:37.7670408Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
2026-09-24T16:40:37.7670811Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
2026-09-24T16:40:37.7671215Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
2026-09-24T16:40:37.7671736Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1381)
2026-09-24T16:40:37.7672224Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:534)
2026-09-24T16:40:37.7672612Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getTransactionNewConnection(AbstractPool.java:770)
2026-09-24T16:40:37.7672954Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:666)
2026-09-24T16:40:37.7673313Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
2026-09-24T16:40:37.7673491Z 	... 163 more
2026-09-24T16:40:37.7674004Z Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: "encrypt" property is set to "true" and "trustServerCertificate" property is set to "true" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (unsupported_certificate) Certificates do not conform to algorithm constraints. ClientConnectionId:4a1f60f0-b155-4d55-8dd3-0b7731a36b99
2026-09-24T16:40:37.7674355Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.terminate(SQLServerConnection.java:4290)
2026-09-24T16:40:37.7674567Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1965)
2026-09-24T16:40:37.7674779Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:3816)
2026-09-24T16:40:37.7674995Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:3372)
2026-09-24T16:40:37.7675211Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:3197)
2026-09-24T16:40:37.7675434Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:1971)
2026-09-24T16:40:37.7675632Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:1263)
2026-09-24T16:40:37.7675999Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
2026-09-24T16:40:37.7676356Z 	... 170 more
2026-09-24T16:40:37.7677063Z Caused by: javax.net.ssl.SSLHandshakeException: (unsupported_certificate) Certificates do not conform to algorithm constraints
2026-09-24T16:40:37.7677331Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130)
2026-09-24T16:40:37.7677633Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:383)
2026-09-24T16:40:37.7677889Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:326)
2026-09-24T16:40:37.7678070Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-09-24T16:40:37.7678281Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647)
2026-09-24T16:40:37.7678511Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467)
2026-09-24T16:40:37.7678736Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363)
2026-09-24T16:40:37.7678933Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393)
2026-09-24T16:40:37.7679104Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:477)
2026-09-24T16:40:37.7679352Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:448)
2026-09-24T16:40:37.7679535Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:206)
2026-09-24T16:40:37.7679711Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:172)
2026-09-24T16:40:37.7679881Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1506)
2026-09-24T16:40:37.7680056Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1421)
2026-09-24T16:40:37.7680246Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:455)
2026-09-24T16:40:37.7680483Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:426)
2026-09-24T16:40:37.7680677Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1854)
2026-09-24T16:40:37.7680823Z 	... 176 more
2026-09-24T16:40:37.7680954Z Caused by: java.security.cert.CertificateException: Certificates do not conform to algorithm constraints
2026-09-24T16:40:37.7681157Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1557)
2026-09-24T16:40:37.7681371Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAdditionalTrust(SSLContextImpl.java:1484)
2026-09-24T16:40:37.7681579Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkServerTrusted(SSLContextImpl.java:1431)
2026-09-24T16:40:37.7681799Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:631)
2026-09-24T16:40:37.7681956Z 	... 188 more
2026-09-24T16:40:37.7682102Z Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA
2026-09-24T16:40:37.7682305Z 	at java.base/sun.security.provider.certpath.AlgorithmChecker.check(AlgorithmChecker.java:231)
2026-09-24T16:40:37.7682509Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1553)
2026-09-24T16:40:37.7682657Z 	... 191 more
2026-09-24T16:40:37.7682693Z 
2026-09-24T16:40:37.7683228Z [0m[31m13:39:59,765 ERROR [org.jboss.msc.service.fail] (ServerService Thread Pool -- 66) MSC000001: Failed to start service jboss.deployment.subunit."sihdg-3.15.0.0.ear"."sihdg-api.war".component.SecurityConfig.START: org.jboss.msc.service.StartException in service jboss.deployment.subunit."sihdg-3.15.0.0.ear"."sihdg-api.war".component.SecurityConfig.START: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
2026-09-24T16:40:37.7683670Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:57)
2026-09-24T16:40:37.7683995Z 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
2026-09-24T16:40:37.7684177Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
2026-09-24T16:40:37.7684467Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
2026-09-24T16:40:37.7684787Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
2026-09-24T16:40:37.7685109Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
2026-09-24T16:40:37.7685430Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1348)
2026-09-24T16:40:37.7685623Z 	at java.base/java.lang.Thread.run(Thread.java:1583)
2026-09-24T16:40:37.7685873Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)
2026-09-24T16:40:37.7686061Z Caused by: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
2026-09-24T16:40:37.7686341Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:170)
2026-09-24T16:40:37.7686659Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:141)
2026-09-24T16:40:37.7686962Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
2026-09-24T16:40:37.7687379Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:127)
2026-09-24T16:40:37.7687767Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:141)
2026-09-24T16:40:37.7688076Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
2026-09-24T16:40:37.7688224Z 	... 8 more
2026-09-24T16:40:37.7688478Z Caused by: jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-24T16:40:37.7688842Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:219)
2026-09-24T16:40:37.7689147Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:392)
2026-09-24T16:40:37.7689451Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:160)
2026-09-24T16:40:37.7689764Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7690147Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7690515Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
2026-09-24T16:40:37.7690894Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-24T16:40:37.7691279Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7691640Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-24T16:40:37.7692193Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7692743Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
2026-09-24T16:40:37.7693250Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7693750Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
2026-09-24T16:40:37.7694242Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7694757Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
2026-09-24T16:40:37.7695260Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7695781Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
2026-09-24T16:40:37.7696192Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7696537Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
2026-09-24T16:40:37.7696849Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7697171Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
2026-09-24T16:40:37.7697659Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7698084Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-24T16:40:37.7698408Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7698736Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-24T16:40:37.7699050Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7699335Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
2026-09-24T16:40:37.7699671Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
2026-09-24T16:40:37.7700020Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
2026-09-24T16:40:37.7700330Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7700632Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7700932Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
2026-09-24T16:40:37.7701222Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
2026-09-24T16:40:37.7701635Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7702003Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
2026-09-24T16:40:37.7702344Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
2026-09-24T16:40:37.7702665Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
2026-09-24T16:40:37.7702982Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
2026-09-24T16:40:37.7703297Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
2026-09-24T16:40:37.7703593Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7703899Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7704208Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
2026-09-24T16:40:37.7704511Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS$$$view10.gravar(Unknown Source)
2026-09-24T16:40:37.7704730Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.7704915Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.7705182Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
2026-09-24T16:40:37.7705516Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
2026-09-24T16:40:37.7705853Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
2026-09-24T16:40:37.7706232Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
2026-09-24T16:40:37.7706572Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
2026-09-24T16:40:37.7706894Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS$Proxy$_$$_Weld$EnterpriseProxy$.gravar(Unknown Source)
2026-09-24T16:40:37.7707226Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig.onStartup(SecurityConfig.java:71)
2026-09-24T16:40:37.7707668Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.7707860Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.7708194Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
2026-09-24T16:40:37.7708533Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7708839Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7709178Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-24T16:40:37.7709619Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:126)
2026-09-24T16:40:37.7709962Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:112)
2026-09-24T16:40:37.7710278Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7710586Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7710947Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:87)
2026-09-24T16:40:37.7711323Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-24T16:40:37.7711645Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7711961Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
2026-09-24T16:40:37.7712266Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7712592Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
2026-09-24T16:40:37.7712910Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7713338Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
2026-09-24T16:40:37.7713661Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7714001Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:111)
2026-09-24T16:40:37.7714518Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7714917Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-24T16:40:37.7715218Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7715521Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254)
2026-09-24T16:40:37.7715827Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:416)
2026-09-24T16:40:37.7716143Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:68)
2026-09-24T16:40:37.7716526Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7716892Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
2026-09-24T16:40:37.7717495Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7717937Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-24T16:40:37.7718305Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7718630Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-24T16:40:37.7718940Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7719264Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-24T16:40:37.7719575Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7719903Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.StartupCountDownInterceptor.processInvocation(StartupCountDownInterceptor.java:25)
2026-09-24T16:40:37.7720218Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7720589Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7720928Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:168)
2026-09-24T16:40:37.7721178Z 	... 13 more
2026-09-24T16:40:37.7721407Z Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-24T16:40:37.7721811Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:61)
2026-09-24T16:40:37.7722236Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
2026-09-24T16:40:37.7722682Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
2026-09-24T16:40:37.7723123Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
2026-09-24T16:40:37.7723506Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
2026-09-24T16:40:37.7723848Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
2026-09-24T16:40:37.7724177Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
2026-09-24T16:40:37.7724542Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
2026-09-24T16:40:37.7724887Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
2026-09-24T16:40:37.7725238Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
2026-09-24T16:40:37.7725591Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:227)
2026-09-24T16:40:37.7726048Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:164)
2026-09-24T16:40:37.7726475Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
2026-09-24T16:40:37.7726808Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
2026-09-24T16:40:37.7727125Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
2026-09-24T16:40:37.7727567Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
2026-09-24T16:40:37.7727885Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
2026-09-24T16:40:37.7728191Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
2026-09-24T16:40:37.7728527Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
2026-09-24T16:40:37.7728875Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
2026-09-24T16:40:37.7729209Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
2026-09-24T16:40:37.7729511Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
2026-09-24T16:40:37.7729833Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:107)
2026-09-24T16:40:37.7730185Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:300)
2026-09-24T16:40:37.7730535Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:241)
2026-09-24T16:40:37.7730838Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
2026-09-24T16:40:37.7731131Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
2026-09-24T16:40:37.7731438Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.getSingleResult(AbstractSelectionQuery.java:473)
2026-09-24T16:40:37.7731794Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRepository.consultarPorNome(PerfilRepository.java:31)
2026-09-24T16:40:37.7732184Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRepository$Proxy$_$$_WeldClientProxy.consultarPorNome(Unknown Source)
2026-09-24T16:40:37.7732506Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS.gravar(PerfilAS.java:132)
2026-09-24T16:40:37.7732728Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.7732914Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.7733220Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
2026-09-24T16:40:37.7733541Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7733909Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7734286Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-24T16:40:37.7734630Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
2026-09-24T16:40:37.7735056Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
2026-09-24T16:40:37.7735405Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
2026-09-24T16:40:37.7735721Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7736061Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
2026-09-24T16:40:37.7736382Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7736705Z 	at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
2026-09-24T16:40:37.7737010Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7737473Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-24T16:40:37.7737850Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7738162Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
2026-09-24T16:40:37.7738466Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7738769Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7739112Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
2026-09-24T16:40:37.7739426Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7739753Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
2026-09-24T16:40:37.7740066Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7740394Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
2026-09-24T16:40:37.7740714Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7741011Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
2026-09-24T16:40:37.7741173Z 	... 103 more
2026-09-24T16:40:37.7741333Z Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-24T16:40:37.7741666Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:160)
2026-09-24T16:40:37.7742225Z 	at org.jboss.as.connector@8.0.13.GA-redhat-00002//org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
2026-09-24T16:40:37.7742594Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
2026-09-24T16:40:37.7743151Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.internal.NonContextualJdbcConnectionAccess.obtainConnection(NonContextualJdbcConnectionAccess.java:38)
2026-09-24T16:40:37.7743705Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:113)
2026-09-24T16:40:37.7744015Z 	... 156 more
2026-09-24T16:40:37.7744257Z Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-24T16:40:37.7744826Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:690)
2026-09-24T16:40:37.7745459Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
2026-09-24T16:40:37.7745948Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
2026-09-24T16:40:37.7746306Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
2026-09-24T16:40:37.7746486Z 	... 160 more
2026-09-24T16:40:37.7746612Z Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
2026-09-24T16:40:37.7746967Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
2026-09-24T16:40:37.7747443Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
2026-09-24T16:40:37.7747864Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
2026-09-24T16:40:37.7748373Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1381)
2026-09-24T16:40:37.7748903Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:534)
2026-09-24T16:40:37.7749295Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getTransactionNewConnection(AbstractPool.java:770)
2026-09-24T16:40:37.7749699Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:666)
2026-09-24T16:40:37.7750076Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
2026-09-24T16:40:37.7750257Z 	... 163 more
2026-09-24T16:40:37.7750775Z Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: "encrypt" property is set to "true" and "trustServerCertificate" property is set to "true" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (unsupported_certificate) Certificates do not conform to algorithm constraints. ClientConnectionId:4a1f60f0-b155-4d55-8dd3-0b7731a36b99
2026-09-24T16:40:37.7751249Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.terminate(SQLServerConnection.java:4290)
2026-09-24T16:40:37.7751463Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1965)
2026-09-24T16:40:37.7751672Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:3816)
2026-09-24T16:40:37.7751886Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:3372)
2026-09-24T16:40:37.7752102Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:3197)
2026-09-24T16:40:37.7752397Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:1971)
2026-09-24T16:40:37.7752739Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:1263)
2026-09-24T16:40:37.7753184Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
2026-09-24T16:40:37.7753492Z 	... 170 more
2026-09-24T16:40:37.7753684Z Caused by: javax.net.ssl.SSLHandshakeException: (unsupported_certificate) Certificates do not conform to algorithm constraints
2026-09-24T16:40:37.7753872Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130)
2026-09-24T16:40:37.7754128Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:383)
2026-09-24T16:40:37.7754453Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:326)
2026-09-24T16:40:37.7754718Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-09-24T16:40:37.7755012Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647)
2026-09-24T16:40:37.7755352Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467)
2026-09-24T16:40:37.7755699Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363)
2026-09-24T16:40:37.7755953Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393)
2026-09-24T16:40:37.7756136Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:477)
2026-09-24T16:40:37.7756318Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:448)
2026-09-24T16:40:37.7756495Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:206)
2026-09-24T16:40:37.7756667Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:172)
2026-09-24T16:40:37.7756833Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1506)
2026-09-24T16:40:37.7757018Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1421)
2026-09-24T16:40:37.7757203Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:455)
2026-09-24T16:40:37.7757544Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:426)
2026-09-24T16:40:37.7757738Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1854)
2026-09-24T16:40:37.7757878Z 	... 176 more
2026-09-24T16:40:37.7758018Z Caused by: java.security.cert.CertificateException: Certificates do not conform to algorithm constraints
2026-09-24T16:40:37.7758221Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1557)
2026-09-24T16:40:37.7758480Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAdditionalTrust(SSLContextImpl.java:1484)
2026-09-24T16:40:37.7758851Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkServerTrusted(SSLContextImpl.java:1431)
2026-09-24T16:40:37.7759060Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:631)
2026-09-24T16:40:37.7759222Z 	... 188 more
2026-09-24T16:40:37.7759374Z Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA
2026-09-24T16:40:37.7759579Z 	at java.base/sun.security.provider.certpath.AlgorithmChecker.check(AlgorithmChecker.java:231)
2026-09-24T16:40:37.7759786Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1553)
2026-09-24T16:40:37.7759936Z 	... 191 more
2026-09-24T16:40:37.7759977Z 
2026-09-24T16:40:37.7760354Z [0m[0m13:39:59,848 INFO  [com.hazelcast.spi.impl.operationexecutor.impl.OperationExecutorImpl] (ServerService Thread Pool -- 52) [25.1.44.134]:5701 [dev] [3.12.12] Starting 2 partition threads and 3 generic threads (1 dedicated for priority tasks)
2026-09-24T16:40:37.7760845Z [0m[0m13:39:59,850 INFO  [com.hazelcast.internal.diagnostics.Diagnostics] (ServerService Thread Pool -- 52) [25.1.44.134]:5701 [dev] [3.12.12] Diagnostics disabled. To enable add -Dhazelcast.diagnostics.enabled=true to the JVM arguments.
2026-09-24T16:40:37.7761236Z [0m[0m13:39:59,852 INFO  [com.hazelcast.core.LifecycleService] (ServerService Thread Pool -- 52) [25.1.44.134]:5701 [dev] [3.12.12] [25.1.44.134]:5701 is STARTING
2026-09-24T16:40:37.7761608Z [0m[33m13:39:59,858 WARNING [com.hazelcast.instance.Node] (ServerService Thread Pool -- 52) [25.1.44.134]:5701 [dev] [3.12.12] No join method is enabled! Starting standalone.
2026-09-24T16:40:37.7761972Z [0m[0m13:39:59,870 INFO  [com.hazelcast.core.LifecycleService] (ServerService Thread Pool -- 52) [25.1.44.134]:5701 [dev] [3.12.12] [25.1.44.134]:5701 is STARTED
2026-09-24T16:40:37.7762320Z [0m[0m13:39:59,871 INFO  [br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS] (ServerService Thread Pool -- 52) Atualizando o cache de 'PERFIL_RECURSO'
2026-09-24T16:40:37.7762730Z [0m[0m13:39:59,875 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.seguranca.ContextoSegurancaHelper] (ServerService Thread Pool -- 52) SEGURANCA - Operacao durante inicializacao permitida sem contexto. Operacao: PerfilRecurso.createQuery
2026-09-24T16:40:37.7763029Z [0m[0m13:39:59,949 INFO  [stdout] (ServerService Thread Pool -- 52) Hibernate: 
2026-09-24T16:40:37.7763246Z [0m[0m13:39:59,950 INFO  [stdout] (ServerService Thread Pool -- 52)     select
2026-09-24T16:40:37.7763490Z [0m[0m13:39:59,950 INFO  [stdout] (ServerService Thread Pool -- 52)         distinct p2_0.NO_PERFIL_ACESSO 
2026-09-24T16:40:37.7763706Z [0m[0m13:39:59,950 INFO  [stdout] (ServerService Thread Pool -- 52)     from
2026-09-24T16:40:37.7763954Z [0m[0m13:39:59,950 INFO  [stdout] (ServerService Thread Pool -- 52)         dbo.HDGTB013_PERMISSAO_PERFIL p1_0 
2026-09-24T16:40:37.7764179Z [0m[0m13:39:59,950 INFO  [stdout] (ServerService Thread Pool -- 52)     join
2026-09-24T16:40:37.7764419Z [0m[0m13:39:59,950 INFO  [stdout] (ServerService Thread Pool -- 52)         dbo.HDGTB011_PERFIL_ACESSO p2_0 
2026-09-24T16:40:37.7764677Z [0m[0m13:39:59,950 INFO  [stdout] (ServerService Thread Pool -- 52)             on p2_0.CO_PERFIL_ID=p1_0.CO_PERFIL_ID
2026-09-24T16:40:37.7766106Z [0m[0m13:39:59,951 INFO  [com.hazelcast.internal.diagnostics.HealthMonitor] (hz._hzInstance_1_dev.HealthMonitor) [25.1.44.134]:5701 [dev] [3.12.12] processors=1, physical.memory.total=2.0G, physical.memory.free=1.3G, swap.space.total=0, swap.space.free=0, heap.memory.used=218.0M, heap.memory.free=4.0M, heap.memory.total=222.0M, heap.memory.max=1.4G, heap.memory.used/total=98.18%, heap.memory.used/max=14.95%, minor.gc.count=0, minor.gc.time=0ms, major.gc.count=0, major.gc.time=0ms, load.process=0.00%, load.system=0.00%, load.systemAverage=7.25, thread.count=136, thread.peakCount=136, cluster.timeDiff=0, event.q.size=0, executor.q.async.size=0, executor.q.client.size=0, executor.q.client.query.size=0, executor.q.client.blocking.size=0, executor.q.query.size=0, executor.q.scheduled.size=0, executor.q.io.size=0, executor.q.system.size=0, executor.q.operations.size=0, executor.q.priorityOperation.size=0, operations.completed.count=1, executor.q.mapLoad.size=0, executor.q.mapLoadAllKeys.size=0, executor.q.cluster.size=0, executor.q.response.size=0, operations.running.count=0, operations.pending.invocations.percentage=0.00%, operations.pending.invocations.count=0, proxy.count=0, clientEndpoint.count=0, connection.active.count=0, client.connection.count=0, connection.count=0
2026-09-24T16:40:37.7767137Z [0m[33m13:39:59,960 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (ServerService Thread Pool -- 52) IJ000604: Throwable while attempting to get a new connection: null: jakarta.resource.ResourceException: IJ031084: Unable to create connection
2026-09-24T16:40:37.7767728Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
2026-09-24T16:40:37.7768150Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
2026-09-24T16:40:37.7768552Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
2026-09-24T16:40:37.7768994Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1381)
2026-09-24T16:40:37.7769467Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:534)
2026-09-24T16:40:37.7769858Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getTransactionNewConnection(AbstractPool.java:770)
2026-09-24T16:40:37.7770199Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:666)
2026-09-24T16:40:37.7770552Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
2026-09-24T16:40:37.7770925Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
2026-09-24T16:40:37.7771290Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
2026-09-24T16:40:37.7771644Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
2026-09-24T16:40:37.7771985Z 	at org.jboss.as.connector@8.0.13.GA-redhat-00002//org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
2026-09-24T16:40:37.7772359Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
2026-09-24T16:40:37.7772724Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.internal.NonContextualJdbcConnectionAccess.obtainConnection(NonContextualJdbcConnectionAccess.java:38)
2026-09-24T16:40:37.7773148Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:113)
2026-09-24T16:40:37.7773616Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
2026-09-24T16:40:37.7773959Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
2026-09-24T16:40:37.7774281Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
2026-09-24T16:40:37.7774640Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
2026-09-24T16:40:37.7774998Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
2026-09-24T16:40:37.7775343Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
2026-09-24T16:40:37.7775685Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:227)
2026-09-24T16:40:37.7776014Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:164)
2026-09-24T16:40:37.7776348Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
2026-09-24T16:40:37.7776692Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
2026-09-24T16:40:37.7777015Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
2026-09-24T16:40:37.7777476Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
2026-09-24T16:40:37.7777984Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
2026-09-24T16:40:37.7778490Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
2026-09-24T16:40:37.7779029Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
2026-09-24T16:40:37.7779653Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
2026-09-24T16:40:37.7780243Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
2026-09-24T16:40:37.7780759Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
2026-09-24T16:40:37.7781294Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:107)
2026-09-24T16:40:37.7781865Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:300)
2026-09-24T16:40:37.7782434Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:241)
2026-09-24T16:40:37.7782941Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
2026-09-24T16:40:37.7783530Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
2026-09-24T16:40:37.7784038Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.Query.getResultList(Query.java:119)
2026-09-24T16:40:37.7784639Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRecursoRepository.consultarTodosPerfisRelacionados(PerfilRecursoRepository.java:35)
2026-09-24T16:40:37.7785320Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRecursoRepository$Proxy$_$$_WeldClientProxy.consultarTodosPerfisRelacionados(Unknown Source)
2026-09-24T16:40:37.7785938Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS.consultarTodosPerfisRelacionados(PerfilRecursoAS.java:132)
2026-09-24T16:40:37.7786347Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.7786673Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.7787186Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
2026-09-24T16:40:37.7787744Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7788075Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7788421Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-24T16:40:37.7788775Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
2026-09-24T16:40:37.7789133Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
2026-09-24T16:40:37.7789477Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
2026-09-24T16:40:37.7789785Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7790131Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
2026-09-24T16:40:37.7790448Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7790771Z 	at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
2026-09-24T16:40:37.7791079Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7791408Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-24T16:40:37.7791715Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7792011Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
2026-09-24T16:40:37.7792307Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7792606Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7793056Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
2026-09-24T16:40:37.7793375Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7793700Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
2026-09-24T16:40:37.7794145Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7794591Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
2026-09-24T16:40:37.7794907Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7795216Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
2026-09-24T16:40:37.7795514Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.supports(CMTTxInterceptor.java:448)
2026-09-24T16:40:37.7795922Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:164)
2026-09-24T16:40:37.7796226Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7796522Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7796884Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
2026-09-24T16:40:37.7797436Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-24T16:40:37.7797786Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7798148Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-24T16:40:37.7798478Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7798810Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
2026-09-24T16:40:37.7799118Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7799442Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
2026-09-24T16:40:37.7799755Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7800072Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
2026-09-24T16:40:37.7800442Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7800773Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
2026-09-24T16:40:37.7801134Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7801496Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
2026-09-24T16:40:37.7801809Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7802123Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
2026-09-24T16:40:37.7802432Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7802785Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-24T16:40:37.7803211Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7803541Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-24T16:40:37.7803843Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7804130Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
2026-09-24T16:40:37.7804661Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
2026-09-24T16:40:37.7805006Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
2026-09-24T16:40:37.7805315Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7805622Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7805918Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
2026-09-24T16:40:37.7806210Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
2026-09-24T16:40:37.7806507Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7806829Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
2026-09-24T16:40:37.7807169Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
2026-09-24T16:40:37.7807675Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
2026-09-24T16:40:37.7808046Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
2026-09-24T16:40:37.7808444Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
2026-09-24T16:40:37.7808788Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7809151Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7809492Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
2026-09-24T16:40:37.7810113Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS$$$view26.consultarTodosPerfisRelacionados(Unknown Source)
2026-09-24T16:40:37.7810379Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.7810567Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.7810839Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
2026-09-24T16:40:37.7811177Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
2026-09-24T16:40:37.7811521Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
2026-09-24T16:40:37.7811916Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
2026-09-24T16:40:37.7812266Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
2026-09-24T16:40:37.7812625Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS$Proxy$_$$_Weld$EnterpriseProxy$.consultarTodosPerfisRelacionados(Unknown Source)
2026-09-24T16:40:37.7813001Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarPerfilRecursoCache(AtualizadorCacheAS.java:128)
2026-09-24T16:40:37.7813418Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarCache(AtualizadorCacheAS.java:80)
2026-09-24T16:40:37.7813668Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.7813856Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.7814171Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
2026-09-24T16:40:37.7814492Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7814802Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7815153Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-24T16:40:37.7815495Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
2026-09-24T16:40:37.7815848Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
2026-09-24T16:40:37.7816190Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
2026-09-24T16:40:37.7816565Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7816906Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
2026-09-24T16:40:37.7817510Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7818013Z 	at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
2026-09-24T16:40:37.7818471Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7818880Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-24T16:40:37.7819193Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7819498Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
2026-09-24T16:40:37.7819798Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7820099Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7820444Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
2026-09-24T16:40:37.7820758Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7821080Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
2026-09-24T16:40:37.7821389Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7821719Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
2026-09-24T16:40:37.7822056Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7822437Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
2026-09-24T16:40:37.7822745Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.supports(CMTTxInterceptor.java:448)
2026-09-24T16:40:37.7823125Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:164)
2026-09-24T16:40:37.7823425Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7823726Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7824087Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
2026-09-24T16:40:37.7824460Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-24T16:40:37.7824772Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7825122Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-24T16:40:37.7825439Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7825762Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
2026-09-24T16:40:37.7826113Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7826461Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
2026-09-24T16:40:37.7826765Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7827079Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
2026-09-24T16:40:37.7827555Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7827931Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
2026-09-24T16:40:37.7828251Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7828582Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
2026-09-24T16:40:37.7828897Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7829212Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
2026-09-24T16:40:37.7829516Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7829835Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-24T16:40:37.7830133Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7830464Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-24T16:40:37.7830777Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7831068Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
2026-09-24T16:40:37.7831392Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
2026-09-24T16:40:37.7831731Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
2026-09-24T16:40:37.7832039Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7832371Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7832812Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
2026-09-24T16:40:37.7833259Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
2026-09-24T16:40:37.7833696Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7834207Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
2026-09-24T16:40:37.7834800Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
2026-09-24T16:40:37.7835183Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
2026-09-24T16:40:37.7835488Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
2026-09-24T16:40:37.7835809Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
2026-09-24T16:40:37.7836114Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7836418Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7836726Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
2026-09-24T16:40:37.7837058Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS$$$view29.verificarEAtualizarCache(Unknown Source)
2026-09-24T16:40:37.7837404Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.7837701Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.7837991Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
2026-09-24T16:40:37.7838326Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
2026-09-24T16:40:37.7838659Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
2026-09-24T16:40:37.7839055Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
2026-09-24T16:40:37.7839394Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
2026-09-24T16:40:37.7839803Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS$Proxy$_$$_Weld$EnterpriseProxy$.verificarEAtualizarCache(Unknown Source)
2026-09-24T16:40:37.7840154Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.comum.config.cache.CacheConfig.onStartup(CacheConfig.java:37)
2026-09-24T16:40:37.7840382Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.7840570Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.7840896Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
2026-09-24T16:40:37.7841228Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7841537Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7841871Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-24T16:40:37.7842342Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:126)
2026-09-24T16:40:37.7842697Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:112)
2026-09-24T16:40:37.7843195Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7843502Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7843860Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:87)
2026-09-24T16:40:37.7844234Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-24T16:40:37.7844545Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7844867Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
2026-09-24T16:40:37.7845171Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7845505Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
2026-09-24T16:40:37.7845826Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7846162Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
2026-09-24T16:40:37.7846476Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7846803Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:111)
2026-09-24T16:40:37.7847122Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7847609Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-24T16:40:37.7847929Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7848222Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254)
2026-09-24T16:40:37.7848523Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:416)
2026-09-24T16:40:37.7848842Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:68)
2026-09-24T16:40:37.7849136Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7849462Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
2026-09-24T16:40:37.7850060Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7850612Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-24T16:40:37.7850941Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7851388Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-24T16:40:37.7851697Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7852011Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-24T16:40:37.7852392Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7852724Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.StartupCountDownInterceptor.processInvocation(StartupCountDownInterceptor.java:25)
2026-09-24T16:40:37.7853033Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7853338Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7853654Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:168)
2026-09-24T16:40:37.7853968Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:141)
2026-09-24T16:40:37.7854267Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
2026-09-24T16:40:37.7854809Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:127)
2026-09-24T16:40:37.7855130Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:141)
2026-09-24T16:40:37.7855441Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
2026-09-24T16:40:37.7855652Z 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
2026-09-24T16:40:37.7855834Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
2026-09-24T16:40:37.7856121Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
2026-09-24T16:40:37.7856442Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
2026-09-24T16:40:37.7856760Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
2026-09-24T16:40:37.7857079Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
2026-09-24T16:40:37.7857382Z 	at java.base/java.lang.Thread.run(Thread.java:1583)
2026-09-24T16:40:37.7857710Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)
2026-09-24T16:40:37.7858276Z Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: "encrypt" property is set to "true" and "trustServerCertificate" property is set to "true" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (unsupported_certificate) Certificates do not conform to algorithm constraints. ClientConnectionId:28674597-cd4d-44eb-8fd8-05c6b90f5d23
2026-09-24T16:40:37.7858640Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.terminate(SQLServerConnection.java:4290)
2026-09-24T16:40:37.7858853Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1965)
2026-09-24T16:40:37.7859065Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:3816)
2026-09-24T16:40:37.7859432Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:3372)
2026-09-24T16:40:37.7859720Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:3197)
2026-09-24T16:40:37.7859943Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:1971)
2026-09-24T16:40:37.7860157Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:1263)
2026-09-24T16:40:37.7860581Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
2026-09-24T16:40:37.7860789Z 	... 248 more
2026-09-24T16:40:37.7860943Z Caused by: javax.net.ssl.SSLHandshakeException: (unsupported_certificate) Certificates do not conform to algorithm constraints
2026-09-24T16:40:37.7861208Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130)
2026-09-24T16:40:37.7861482Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:383)
2026-09-24T16:40:37.7861732Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:326)
2026-09-24T16:40:37.7861950Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-09-24T16:40:37.7862212Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647)
2026-09-24T16:40:37.7862523Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467)
2026-09-24T16:40:37.7862811Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363)
2026-09-24T16:40:37.7863014Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393)
2026-09-24T16:40:37.7863189Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:477)
2026-09-24T16:40:37.7863387Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:448)
2026-09-24T16:40:37.7863629Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:206)
2026-09-24T16:40:37.7863804Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:172)
2026-09-24T16:40:37.7863973Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1506)
2026-09-24T16:40:37.7864145Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1421)
2026-09-24T16:40:37.7864406Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:455)
2026-09-24T16:40:37.7864587Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:426)
2026-09-24T16:40:37.7864777Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1854)
2026-09-24T16:40:37.7864925Z 	... 254 more
2026-09-24T16:40:37.7865058Z Caused by: java.security.cert.CertificateException: Certificates do not conform to algorithm constraints
2026-09-24T16:40:37.7865258Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1557)
2026-09-24T16:40:37.7865464Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAdditionalTrust(SSLContextImpl.java:1484)
2026-09-24T16:40:37.7865676Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkServerTrusted(SSLContextImpl.java:1431)
2026-09-24T16:40:37.7865896Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:631)
2026-09-24T16:40:37.7866051Z 	... 266 more
2026-09-24T16:40:37.7866195Z Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA
2026-09-24T16:40:37.7866440Z 	at java.base/sun.security.provider.certpath.AlgorithmChecker.check(AlgorithmChecker.java:231)
2026-09-24T16:40:37.7866681Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1553)
2026-09-24T16:40:37.7866903Z 	... 269 more
2026-09-24T16:40:37.7866943Z 
2026-09-24T16:40:37.7867205Z [0m[33m13:39:59,961 WARN  [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (ServerService Thread Pool -- 52) SQL Error: 0, SQLState: null
2026-09-24T16:40:37.7867843Z [0m[31m13:39:59,961 ERROR [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (ServerService Thread Pool -- 52) jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-24T16:40:37.7868591Z [0m[31m13:39:59,962 ERROR [org.jboss.as.ejb3.invocation] (ServerService Thread Pool -- 52) WFLYEJB0034: Jakarta Enterprise Beans Invocation failed on component PerfilRecursoAS for method public java.util.List br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS.consultarTodosPerfisRelacionados(): jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-24T16:40:37.7869094Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:219)
2026-09-24T16:40:37.7869396Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.supports(CMTTxInterceptor.java:448)
2026-09-24T16:40:37.7869704Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:164)
2026-09-24T16:40:37.7869998Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7870308Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7870676Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
2026-09-24T16:40:37.7871058Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-24T16:40:37.7871385Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7871740Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-24T16:40:37.7872069Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7872389Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
2026-09-24T16:40:37.7872709Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7873034Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
2026-09-24T16:40:37.7873347Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7873671Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
2026-09-24T16:40:37.7873978Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7874299Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
2026-09-24T16:40:37.7874704Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7875041Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
2026-09-24T16:40:37.7875355Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7875672Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
2026-09-24T16:40:37.7875970Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7876297Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-24T16:40:37.7876609Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7876924Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-24T16:40:37.7877231Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7877714Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
2026-09-24T16:40:37.7878047Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
2026-09-24T16:40:37.7878391Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
2026-09-24T16:40:37.7878700Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7878993Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7879286Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
2026-09-24T16:40:37.7879582Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
2026-09-24T16:40:37.7879875Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7880261Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
2026-09-24T16:40:37.7880675Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
2026-09-24T16:40:37.7881001Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
2026-09-24T16:40:37.7881304Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
2026-09-24T16:40:37.7881617Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
2026-09-24T16:40:37.7882004Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7882308Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7882847Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
2026-09-24T16:40:37.7883184Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS$$$view26.consultarTodosPerfisRelacionados(Unknown Source)
2026-09-24T16:40:37.7883415Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.7883592Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.7883869Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
2026-09-24T16:40:37.7884197Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
2026-09-24T16:40:37.7884535Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
2026-09-24T16:40:37.7885053Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
2026-09-24T16:40:37.7885592Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
2026-09-24T16:40:37.7886154Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS$Proxy$_$$_Weld$EnterpriseProxy$.consultarTodosPerfisRelacionados(Unknown Source)
2026-09-24T16:40:37.7886531Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarPerfilRecursoCache(AtualizadorCacheAS.java:128)
2026-09-24T16:40:37.7886901Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarCache(AtualizadorCacheAS.java:80)
2026-09-24T16:40:37.7887139Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.7887477Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.7887863Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
2026-09-24T16:40:37.7888191Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7888496Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7888842Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-24T16:40:37.7889204Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
2026-09-24T16:40:37.7889606Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
2026-09-24T16:40:37.7890049Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
2026-09-24T16:40:37.7890443Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7890786Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
2026-09-24T16:40:37.7891187Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7891533Z 	at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
2026-09-24T16:40:37.7891847Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7892173Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-24T16:40:37.7892482Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7892901Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
2026-09-24T16:40:37.7893197Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7893492Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7893831Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
2026-09-24T16:40:37.7894201Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7894527Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
2026-09-24T16:40:37.7894838Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7895172Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
2026-09-24T16:40:37.7895490Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7895778Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
2026-09-24T16:40:37.7896074Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.supports(CMTTxInterceptor.java:448)
2026-09-24T16:40:37.7896376Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:164)
2026-09-24T16:40:37.7896672Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7896974Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7897476Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
2026-09-24T16:40:37.7897941Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-24T16:40:37.7898253Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7898604Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-24T16:40:37.7899104Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7899560Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
2026-09-24T16:40:37.7899969Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7900294Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
2026-09-24T16:40:37.7900596Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7900903Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
2026-09-24T16:40:37.7901202Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7901529Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
2026-09-24T16:40:37.7901922Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7903466Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
2026-09-24T16:40:37.7904119Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7904527Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
2026-09-24T16:40:37.7904844Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7905182Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-24T16:40:37.7905502Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7905839Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-24T16:40:37.7906154Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7906453Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
2026-09-24T16:40:37.7906788Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
2026-09-24T16:40:37.7907451Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
2026-09-24T16:40:37.7907962Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7908430Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7908843Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
2026-09-24T16:40:37.7909151Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
2026-09-24T16:40:37.7909524Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7909865Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
2026-09-24T16:40:37.7910622Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
2026-09-24T16:40:37.7911139Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
2026-09-24T16:40:37.7911630Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
2026-09-24T16:40:37.7912121Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
2026-09-24T16:40:37.7912617Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7913088Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7913410Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
2026-09-24T16:40:37.7913736Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS$$$view29.verificarEAtualizarCache(Unknown Source)
2026-09-24T16:40:37.7913970Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.7914215Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.7914569Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
2026-09-24T16:40:37.7915022Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
2026-09-24T16:40:37.7915428Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
2026-09-24T16:40:37.7915815Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
2026-09-24T16:40:37.7916239Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
2026-09-24T16:40:37.7916656Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS$Proxy$_$$_Weld$EnterpriseProxy$.verificarEAtualizarCache(Unknown Source)
2026-09-24T16:40:37.7917739Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.comum.config.cache.CacheConfig.onStartup(CacheConfig.java:37)
2026-09-24T16:40:37.7918158Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.7918419Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.7918792Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
2026-09-24T16:40:37.7919124Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7919440Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7919781Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-24T16:40:37.7920145Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:126)
2026-09-24T16:40:37.7920629Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:112)
2026-09-24T16:40:37.7920951Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7921264Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7921621Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:87)
2026-09-24T16:40:37.7922003Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-24T16:40:37.7922334Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7922661Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
2026-09-24T16:40:37.7923074Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7923422Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
2026-09-24T16:40:37.7923746Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7924078Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
2026-09-24T16:40:37.7924402Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7924751Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:111)
2026-09-24T16:40:37.7925076Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7925395Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-24T16:40:37.7925711Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7926011Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254)
2026-09-24T16:40:37.7926311Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:416)
2026-09-24T16:40:37.7926635Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:68)
2026-09-24T16:40:37.7926949Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7927411Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
2026-09-24T16:40:37.7927765Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7928132Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-24T16:40:37.7928514Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7928871Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-24T16:40:37.7929188Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7929521Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-24T16:40:37.7929836Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7930173Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.StartupCountDownInterceptor.processInvocation(StartupCountDownInterceptor.java:25)
2026-09-24T16:40:37.7930496Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7930809Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7931122Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:168)
2026-09-24T16:40:37.7931448Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:141)
2026-09-24T16:40:37.7931749Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
2026-09-24T16:40:37.7932075Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:127)
2026-09-24T16:40:37.7932404Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:141)
2026-09-24T16:40:37.7932714Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
2026-09-24T16:40:37.7932920Z 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
2026-09-24T16:40:37.7933097Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
2026-09-24T16:40:37.7933401Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
2026-09-24T16:40:37.7933858Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
2026-09-24T16:40:37.7934306Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
2026-09-24T16:40:37.7934758Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
2026-09-24T16:40:37.7935034Z 	at java.base/java.lang.Thread.run(Thread.java:1583)
2026-09-24T16:40:37.7935398Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)
2026-09-24T16:40:37.7935790Z Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-24T16:40:37.7936388Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:61)
2026-09-24T16:40:37.7936849Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
2026-09-24T16:40:37.7937531Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
2026-09-24T16:40:37.7938158Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
2026-09-24T16:40:37.7938731Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
2026-09-24T16:40:37.7939215Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
2026-09-24T16:40:37.7939555Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
2026-09-24T16:40:37.7939922Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
2026-09-24T16:40:37.7940312Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
2026-09-24T16:40:37.7940734Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
2026-09-24T16:40:37.7941086Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:227)
2026-09-24T16:40:37.7941432Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:164)
2026-09-24T16:40:37.7941773Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
2026-09-24T16:40:37.7942119Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
2026-09-24T16:40:37.7942578Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
2026-09-24T16:40:37.7942927Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
2026-09-24T16:40:37.7943254Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
2026-09-24T16:40:37.7943568Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
2026-09-24T16:40:37.7943913Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
2026-09-24T16:40:37.7944265Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
2026-09-24T16:40:37.7944611Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
2026-09-24T16:40:37.7944922Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
2026-09-24T16:40:37.7945248Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:107)
2026-09-24T16:40:37.7945612Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:300)
2026-09-24T16:40:37.7945968Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:241)
2026-09-24T16:40:37.7946402Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
2026-09-24T16:40:37.7946701Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
2026-09-24T16:40:37.7947101Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.Query.getResultList(Query.java:119)
2026-09-24T16:40:37.7947681Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRecursoRepository.consultarTodosPerfisRelacionados(PerfilRecursoRepository.java:35)
2026-09-24T16:40:37.7948128Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRecursoRepository$Proxy$_$$_WeldClientProxy.consultarTodosPerfisRelacionados(Unknown Source)
2026-09-24T16:40:37.7948725Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS.consultarTodosPerfisRelacionados(PerfilRecursoAS.java:132)
2026-09-24T16:40:37.7948985Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.7949175Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.7949486Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
2026-09-24T16:40:37.7949820Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7950142Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7950487Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-24T16:40:37.7950856Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
2026-09-24T16:40:37.7951310Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
2026-09-24T16:40:37.7952279Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
2026-09-24T16:40:37.7952600Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7952937Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
2026-09-24T16:40:37.7953269Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7953601Z 	at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
2026-09-24T16:40:37.7953923Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7954258Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-24T16:40:37.7954579Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7954884Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
2026-09-24T16:40:37.7955254Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7955602Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7955963Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
2026-09-24T16:40:37.7956291Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7956619Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
2026-09-24T16:40:37.7956928Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7957367Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
2026-09-24T16:40:37.7957738Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7958046Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
2026-09-24T16:40:37.7958208Z 	... 181 more
2026-09-24T16:40:37.7958378Z Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-24T16:40:37.7958715Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:160)
2026-09-24T16:40:37.7959065Z 	at org.jboss.as.connector@8.0.13.GA-redhat-00002//org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
2026-09-24T16:40:37.7959435Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
2026-09-24T16:40:37.7959804Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.internal.NonContextualJdbcConnectionAccess.obtainConnection(NonContextualJdbcConnectionAccess.java:38)
2026-09-24T16:40:37.7960173Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:113)
2026-09-24T16:40:37.7960360Z 	... 234 more
2026-09-24T16:40:37.7960513Z Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-24T16:40:37.7960862Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:690)
2026-09-24T16:40:37.7961250Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
2026-09-24T16:40:37.7961737Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
2026-09-24T16:40:37.7962103Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
2026-09-24T16:40:37.7962277Z 	... 238 more
2026-09-24T16:40:37.7962410Z Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
2026-09-24T16:40:37.7962763Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
2026-09-24T16:40:37.7963233Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
2026-09-24T16:40:37.7963671Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
2026-09-24T16:40:37.7964171Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1381)
2026-09-24T16:40:37.7964677Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:534)
2026-09-24T16:40:37.7965064Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getTransactionNewConnection(AbstractPool.java:770)
2026-09-24T16:40:37.7965482Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:666)
2026-09-24T16:40:37.7965842Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
2026-09-24T16:40:37.7966023Z 	... 241 more
2026-09-24T16:40:37.7966544Z Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: "encrypt" property is set to "true" and "trustServerCertificate" property is set to "true" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (unsupported_certificate) Certificates do not conform to algorithm constraints. ClientConnectionId:28674597-cd4d-44eb-8fd8-05c6b90f5d23
2026-09-24T16:40:37.7966903Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.terminate(SQLServerConnection.java:4290)
2026-09-24T16:40:37.7967118Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1965)
2026-09-24T16:40:37.7967451Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:3816)
2026-09-24T16:40:37.7967693Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:3372)
2026-09-24T16:40:37.7967916Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:3197)
2026-09-24T16:40:37.7968133Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:1971)
2026-09-24T16:40:37.7968344Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:1263)
2026-09-24T16:40:37.7968719Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
2026-09-24T16:40:37.7968913Z 	... 248 more
2026-09-24T16:40:37.7969065Z Caused by: javax.net.ssl.SSLHandshakeException: (unsupported_certificate) Certificates do not conform to algorithm constraints
2026-09-24T16:40:37.7969249Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130)
2026-09-24T16:40:37.7969431Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:383)
2026-09-24T16:40:37.7969676Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:326)
2026-09-24T16:40:37.7969854Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-09-24T16:40:37.7970055Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647)
2026-09-24T16:40:37.7970360Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467)
2026-09-24T16:40:37.7970626Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363)
2026-09-24T16:40:37.7970825Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393)
2026-09-24T16:40:37.7971008Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:477)
2026-09-24T16:40:37.7971188Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:448)
2026-09-24T16:40:37.7971373Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:206)
2026-09-24T16:40:37.7971552Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:172)
2026-09-24T16:40:37.7971804Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1506)
2026-09-24T16:40:37.7971996Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1421)
2026-09-24T16:40:37.7972184Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:455)
2026-09-24T16:40:37.7972362Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:426)
2026-09-24T16:40:37.7972552Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1854)
2026-09-24T16:40:37.7972701Z 	... 254 more
2026-09-24T16:40:37.7972842Z Caused by: java.security.cert.CertificateException: Certificates do not conform to algorithm constraints
2026-09-24T16:40:37.7973048Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1557)
2026-09-24T16:40:37.7973259Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAdditionalTrust(SSLContextImpl.java:1484)
2026-09-24T16:40:37.7973472Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkServerTrusted(SSLContextImpl.java:1431)
2026-09-24T16:40:37.7973689Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:631)
2026-09-24T16:40:37.7973853Z 	... 266 more
2026-09-24T16:40:37.7974053Z Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA
2026-09-24T16:40:37.7974261Z 	at java.base/sun.security.provider.certpath.AlgorithmChecker.check(AlgorithmChecker.java:231)
2026-09-24T16:40:37.7974469Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1553)
2026-09-24T16:40:37.7974620Z 	... 269 more
2026-09-24T16:40:37.7974661Z 
2026-09-24T16:40:37.7975260Z [0m[31m13:39:59,963 ERROR [org.jboss.as.ejb3.invocation] (ServerService Thread Pool -- 52) WFLYEJB0034: Jakarta Enterprise Beans Invocation failed on component AtualizadorCacheAS for method public void br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarCache(boolean): jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-24T16:40:37.7975745Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:219)
2026-09-24T16:40:37.7976044Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.supports(CMTTxInterceptor.java:448)
2026-09-24T16:40:37.7976412Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:164)
2026-09-24T16:40:37.7976715Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7977029Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7977589Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
2026-09-24T16:40:37.7978093Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-24T16:40:37.7978422Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7978779Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-24T16:40:37.7979113Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7979446Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
2026-09-24T16:40:37.7979765Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7980090Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
2026-09-24T16:40:37.7980390Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7980710Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
2026-09-24T16:40:37.7981016Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7981351Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
2026-09-24T16:40:37.7981663Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7982002Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
2026-09-24T16:40:37.7982316Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7982627Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
2026-09-24T16:40:37.7982928Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7983247Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-24T16:40:37.7983560Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7983887Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-24T16:40:37.7984197Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7984488Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
2026-09-24T16:40:37.7984809Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
2026-09-24T16:40:37.7985144Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
2026-09-24T16:40:37.7985568Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7985924Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7986335Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
2026-09-24T16:40:37.7986715Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
2026-09-24T16:40:37.7987071Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7987669Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
2026-09-24T16:40:37.7988083Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
2026-09-24T16:40:37.7988417Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
2026-09-24T16:40:37.7988736Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
2026-09-24T16:40:37.7989056Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
2026-09-24T16:40:37.7989361Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7989659Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.7989971Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
2026-09-24T16:40:37.7990312Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS$$$view26.consultarTodosPerfisRelacionados(Unknown Source)
2026-09-24T16:40:37.7990549Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.7990736Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.7991013Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
2026-09-24T16:40:37.7991348Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
2026-09-24T16:40:37.7991685Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
2026-09-24T16:40:37.7992076Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
2026-09-24T16:40:37.7992427Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
2026-09-24T16:40:37.7992778Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS$Proxy$_$$_Weld$EnterpriseProxy$.consultarTodosPerfisRelacionados(Unknown Source)
2026-09-24T16:40:37.7993153Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarPerfilRecursoCache(AtualizadorCacheAS.java:128)
2026-09-24T16:40:37.7993517Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarCache(AtualizadorCacheAS.java:80)
2026-09-24T16:40:37.7993833Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.7994047Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.7994359Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
2026-09-24T16:40:37.7994679Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7994985Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.7995326Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-24T16:40:37.7995677Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
2026-09-24T16:40:37.7996028Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
2026-09-24T16:40:37.7996366Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
2026-09-24T16:40:37.7996682Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7997017Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
2026-09-24T16:40:37.7997477Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7997815Z 	at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
2026-09-24T16:40:37.7998130Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7998459Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-24T16:40:37.7998957Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7999269Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
2026-09-24T16:40:37.7999641Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.7999955Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.8000310Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
2026-09-24T16:40:37.8000631Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8000956Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
2026-09-24T16:40:37.8001261Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8001594Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
2026-09-24T16:40:37.8002032Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8002450Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
2026-09-24T16:40:37.8002787Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.supports(CMTTxInterceptor.java:448)
2026-09-24T16:40:37.8003126Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:164)
2026-09-24T16:40:37.8003423Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8003730Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.8004100Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
2026-09-24T16:40:37.8004481Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-24T16:40:37.8004807Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8005156Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-24T16:40:37.8005484Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8005808Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
2026-09-24T16:40:37.8006111Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8006439Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
2026-09-24T16:40:37.8006744Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8007059Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
2026-09-24T16:40:37.8007483Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8007825Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
2026-09-24T16:40:37.8008139Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8008467Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
2026-09-24T16:40:37.8008781Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8009097Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
2026-09-24T16:40:37.8009457Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8009782Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-24T16:40:37.8010177Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8010498Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-24T16:40:37.8010799Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8011085Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
2026-09-24T16:40:37.8011441Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
2026-09-24T16:40:37.8011852Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
2026-09-24T16:40:37.8012181Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8012547Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.8012874Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
2026-09-24T16:40:37.8013207Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
2026-09-24T16:40:37.8013567Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8013887Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
2026-09-24T16:40:37.8014225Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
2026-09-24T16:40:37.8014553Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
2026-09-24T16:40:37.8014865Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
2026-09-24T16:40:37.8015173Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
2026-09-24T16:40:37.8015554Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8015859Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.8016169Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
2026-09-24T16:40:37.8016495Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS$$$view29.verificarEAtualizarCache(Unknown Source)
2026-09-24T16:40:37.8016725Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.8016908Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.8017320Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
2026-09-24T16:40:37.8017823Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
2026-09-24T16:40:37.8018166Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
2026-09-24T16:40:37.8018636Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
2026-09-24T16:40:37.8018978Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
2026-09-24T16:40:37.8019328Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS$Proxy$_$$_Weld$EnterpriseProxy$.verificarEAtualizarCache(Unknown Source)
2026-09-24T16:40:37.8019664Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.comum.config.cache.CacheConfig.onStartup(CacheConfig.java:37)
2026-09-24T16:40:37.8019886Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.8020072Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.8020402Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
2026-09-24T16:40:37.8020734Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8021042Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.8021388Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-24T16:40:37.8021735Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:126)
2026-09-24T16:40:37.8022087Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:112)
2026-09-24T16:40:37.8022401Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8022777Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.8023137Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:87)
2026-09-24T16:40:37.8023507Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-24T16:40:37.8023934Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8024329Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
2026-09-24T16:40:37.8024738Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8025108Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
2026-09-24T16:40:37.8025431Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8025833Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
2026-09-24T16:40:37.8026205Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8026690Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:111)
2026-09-24T16:40:37.8027182Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8027706Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-24T16:40:37.8028031Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8028338Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254)
2026-09-24T16:40:37.8028643Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:416)
2026-09-24T16:40:37.8028967Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:68)
2026-09-24T16:40:37.8029280Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8029598Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
2026-09-24T16:40:37.8029912Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8030270Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-24T16:40:37.8030593Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8030920Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-24T16:40:37.8031232Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8031562Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-24T16:40:37.8031873Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8032203Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.StartupCountDownInterceptor.processInvocation(StartupCountDownInterceptor.java:25)
2026-09-24T16:40:37.8032517Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8032825Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.8033142Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:168)
2026-09-24T16:40:37.8033455Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:141)
2026-09-24T16:40:37.8033762Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
2026-09-24T16:40:37.8034074Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:127)
2026-09-24T16:40:37.8034401Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:141)
2026-09-24T16:40:37.8034803Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
2026-09-24T16:40:37.8035009Z 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
2026-09-24T16:40:37.8035191Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
2026-09-24T16:40:37.8035488Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
2026-09-24T16:40:37.8035797Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
2026-09-24T16:40:37.8036113Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
2026-09-24T16:40:37.8036434Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
2026-09-24T16:40:37.8036626Z 	at java.base/java.lang.Thread.run(Thread.java:1583)
2026-09-24T16:40:37.8036872Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)
2026-09-24T16:40:37.8037121Z Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-24T16:40:37.8037616Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:61)
2026-09-24T16:40:37.8038005Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
2026-09-24T16:40:37.8038314Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
2026-09-24T16:40:37.8038660Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
2026-09-24T16:40:37.8039089Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
2026-09-24T16:40:37.8039428Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
2026-09-24T16:40:37.8039744Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
2026-09-24T16:40:37.8040108Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
2026-09-24T16:40:37.8040462Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
2026-09-24T16:40:37.8040810Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
2026-09-24T16:40:37.8041153Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:227)
2026-09-24T16:40:37.8041482Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:164)
2026-09-24T16:40:37.8041822Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
2026-09-24T16:40:37.8042153Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
2026-09-24T16:40:37.8042523Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
2026-09-24T16:40:37.8042886Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
2026-09-24T16:40:37.8043195Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
2026-09-24T16:40:37.8043497Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
2026-09-24T16:40:37.8043827Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
2026-09-24T16:40:37.8044167Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
2026-09-24T16:40:37.8044502Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
2026-09-24T16:40:37.8044804Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
2026-09-24T16:40:37.8045122Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:107)
2026-09-24T16:40:37.8045472Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:300)
2026-09-24T16:40:37.8045821Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:241)
2026-09-24T16:40:37.8046120Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
2026-09-24T16:40:37.8046417Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
2026-09-24T16:40:37.8046691Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.Query.getResultList(Query.java:119)
2026-09-24T16:40:37.8047064Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRecursoRepository.consultarTodosPerfisRelacionados(PerfilRecursoRepository.java:35)
2026-09-24T16:40:37.8047595Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRecursoRepository$Proxy$_$$_WeldClientProxy.consultarTodosPerfisRelacionados(Unknown Source)
2026-09-24T16:40:37.8047986Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS.consultarTodosPerfisRelacionados(PerfilRecursoAS.java:132)
2026-09-24T16:40:37.8048234Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.8048423Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.8048733Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
2026-09-24T16:40:37.8049053Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8049369Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.8049773Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-24T16:40:37.8050119Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
2026-09-24T16:40:37.8050550Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
2026-09-24T16:40:37.8050921Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
2026-09-24T16:40:37.8051425Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8051951Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
2026-09-24T16:40:37.8052462Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8052874Z 	at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
2026-09-24T16:40:37.8053258Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8053671Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-24T16:40:37.8054172Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8054676Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
2026-09-24T16:40:37.8055148Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8055617Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.8055978Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
2026-09-24T16:40:37.8056295Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8056620Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
2026-09-24T16:40:37.8056927Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8057428Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
2026-09-24T16:40:37.8057790Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8058093Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
2026-09-24T16:40:37.8058253Z 	... 181 more
2026-09-24T16:40:37.8058413Z Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-24T16:40:37.8058751Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:160)
2026-09-24T16:40:37.8059099Z 	at org.jboss.as.connector@8.0.13.GA-redhat-00002//org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
2026-09-24T16:40:37.8059469Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
2026-09-24T16:40:37.8059995Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.internal.NonContextualJdbcConnectionAccess.obtainConnection(NonContextualJdbcConnectionAccess.java:38)
2026-09-24T16:40:37.8060364Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:113)
2026-09-24T16:40:37.8060539Z 	... 234 more
2026-09-24T16:40:37.8060692Z Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-24T16:40:37.8061040Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:690)
2026-09-24T16:40:37.8061418Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
2026-09-24T16:40:37.8061797Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
2026-09-24T16:40:37.8062150Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
2026-09-24T16:40:37.8062323Z 	... 238 more
2026-09-24T16:40:37.8062448Z Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
2026-09-24T16:40:37.8062796Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
2026-09-24T16:40:37.8063202Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
2026-09-24T16:40:37.8063604Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
2026-09-24T16:40:37.8064059Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1381)
2026-09-24T16:40:37.8064683Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:534)
2026-09-24T16:40:37.8065186Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getTransactionNewConnection(AbstractPool.java:770)
2026-09-24T16:40:37.8065638Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:666)
2026-09-24T16:40:37.8066175Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
2026-09-24T16:40:37.8066476Z 	... 241 more
2026-09-24T16:40:37.8067379Z Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: "encrypt" property is set to "true" and "trustServerCertificate" property is set to "true" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (unsupported_certificate) Certificates do not conform to algorithm constraints. ClientConnectionId:28674597-cd4d-44eb-8fd8-05c6b90f5d23
2026-09-24T16:40:37.8067882Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.terminate(SQLServerConnection.java:4290)
2026-09-24T16:40:37.8068178Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1965)
2026-09-24T16:40:37.8068435Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:3816)
2026-09-24T16:40:37.8068650Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:3372)
2026-09-24T16:40:37.8068857Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:3197)
2026-09-24T16:40:37.8069074Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:1971)
2026-09-24T16:40:37.8069278Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:1263)
2026-09-24T16:40:37.8069660Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
2026-09-24T16:40:37.8069857Z 	... 248 more
2026-09-24T16:40:37.8070009Z Caused by: javax.net.ssl.SSLHandshakeException: (unsupported_certificate) Certificates do not conform to algorithm constraints
2026-09-24T16:40:37.8070194Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130)
2026-09-24T16:40:37.8070365Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:383)
2026-09-24T16:40:37.8070543Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:326)
2026-09-24T16:40:37.8070717Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-09-24T16:40:37.8070928Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647)
2026-09-24T16:40:37.8071156Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467)
2026-09-24T16:40:37.8071373Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363)
2026-09-24T16:40:37.8071574Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393)
2026-09-24T16:40:37.8071754Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:477)
2026-09-24T16:40:37.8071934Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:448)
2026-09-24T16:40:37.8072111Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:206)
2026-09-24T16:40:37.8072277Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:172)
2026-09-24T16:40:37.8072446Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1506)
2026-09-24T16:40:37.8072630Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1421)
2026-09-24T16:40:37.8072810Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:455)
2026-09-24T16:40:37.8072992Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:426)
2026-09-24T16:40:37.8073179Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1854)
2026-09-24T16:40:37.8073317Z 	... 254 more
2026-09-24T16:40:37.8073455Z Caused by: java.security.cert.CertificateException: Certificates do not conform to algorithm constraints
2026-09-24T16:40:37.8073656Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1557)
2026-09-24T16:40:37.8073869Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAdditionalTrust(SSLContextImpl.java:1484)
2026-09-24T16:40:37.8074074Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkServerTrusted(SSLContextImpl.java:1431)
2026-09-24T16:40:37.8074285Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:631)
2026-09-24T16:40:37.8074442Z 	... 266 more
2026-09-24T16:40:37.8074624Z Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA
2026-09-24T16:40:37.8074851Z 	at java.base/sun.security.provider.certpath.AlgorithmChecker.check(AlgorithmChecker.java:231)
2026-09-24T16:40:37.8075055Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1553)
2026-09-24T16:40:37.8075204Z 	... 269 more
2026-09-24T16:40:37.8075244Z 
2026-09-24T16:40:37.8075772Z [0m[31m13:39:59,964 ERROR [org.jboss.msc.service.fail] (ServerService Thread Pool -- 52) MSC000001: Failed to start service jboss.deployment.subunit."sihdg-3.15.0.0.ear"."sihdg-api.war".component.CacheConfig.START: org.jboss.msc.service.StartException in service jboss.deployment.subunit."sihdg-3.15.0.0.ear"."sihdg-api.war".component.CacheConfig.START: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
2026-09-24T16:40:37.8076207Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:57)
2026-09-24T16:40:37.8076414Z 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
2026-09-24T16:40:37.8076594Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
2026-09-24T16:40:37.8076891Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
2026-09-24T16:40:37.8077207Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
2026-09-24T16:40:37.8077761Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
2026-09-24T16:40:37.8078468Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
2026-09-24T16:40:37.8078793Z 	at java.base/java.lang.Thread.run(Thread.java:1583)
2026-09-24T16:40:37.8079180Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)
2026-09-24T16:40:37.8079439Z Caused by: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
2026-09-24T16:40:37.8079878Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:170)
2026-09-24T16:40:37.8080202Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:141)
2026-09-24T16:40:37.8080576Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
2026-09-24T16:40:37.8080898Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:127)
2026-09-24T16:40:37.8081220Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:141)
2026-09-24T16:40:37.8081538Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
2026-09-24T16:40:37.8081700Z 	... 8 more
2026-09-24T16:40:37.8081899Z Caused by: jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-24T16:40:37.8082243Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:219)
2026-09-24T16:40:37.8082539Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.supports(CMTTxInterceptor.java:448)
2026-09-24T16:40:37.8082836Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:164)
2026-09-24T16:40:37.8083221Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8083571Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.8083938Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
2026-09-24T16:40:37.8084309Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-24T16:40:37.8084637Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8084990Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-24T16:40:37.8085314Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8085646Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
2026-09-24T16:40:37.8085950Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8086272Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
2026-09-24T16:40:37.8086576Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8086898Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
2026-09-24T16:40:37.8087203Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8087662Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
2026-09-24T16:40:37.8087973Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8088309Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
2026-09-24T16:40:37.8088627Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8088948Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
2026-09-24T16:40:37.8089258Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8089577Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-24T16:40:37.8089878Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8090203Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-24T16:40:37.8090512Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8090803Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
2026-09-24T16:40:37.8091371Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
2026-09-24T16:40:37.8091756Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
2026-09-24T16:40:37.8092061Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8092355Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.8092651Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
2026-09-24T16:40:37.8092945Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
2026-09-24T16:40:37.8093247Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8093575Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
2026-09-24T16:40:37.8093913Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
2026-09-24T16:40:37.8094228Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
2026-09-24T16:40:37.8094541Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
2026-09-24T16:40:37.8094855Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
2026-09-24T16:40:37.8095155Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8095460Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.8095770Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
2026-09-24T16:40:37.8096103Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS$$$view26.consultarTodosPerfisRelacionados(Unknown Source)
2026-09-24T16:40:37.8096323Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.8096512Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.8096785Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
2026-09-24T16:40:37.8097117Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
2026-09-24T16:40:37.8097610Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
2026-09-24T16:40:37.8098003Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
2026-09-24T16:40:37.8098352Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
2026-09-24T16:40:37.8098699Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS$Proxy$_$$_Weld$EnterpriseProxy$.consultarTodosPerfisRelacionados(Unknown Source)
2026-09-24T16:40:37.8099126Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarPerfilRecursoCache(AtualizadorCacheAS.java:128)
2026-09-24T16:40:37.8099530Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarCache(AtualizadorCacheAS.java:80)
2026-09-24T16:40:37.8099773Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.8099953Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.8100259Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
2026-09-24T16:40:37.8100578Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8100880Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.8101223Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-24T16:40:37.8101575Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
2026-09-24T16:40:37.8101920Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
2026-09-24T16:40:37.8102361Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
2026-09-24T16:40:37.8102731Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8103068Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
2026-09-24T16:40:37.8103379Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8103697Z 	at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
2026-09-24T16:40:37.8104003Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8104326Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-24T16:40:37.8104635Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8104944Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
2026-09-24T16:40:37.8105239Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8105531Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.8105876Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
2026-09-24T16:40:37.8106194Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8106514Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
2026-09-24T16:40:37.8106873Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8107202Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
2026-09-24T16:40:37.8107651Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8107948Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
2026-09-24T16:40:37.8108252Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.supports(CMTTxInterceptor.java:448)
2026-09-24T16:40:37.8108560Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:164)
2026-09-24T16:40:37.8108863Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8109169Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.8109587Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
2026-09-24T16:40:37.8110073Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-24T16:40:37.8110394Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8110791Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-24T16:40:37.8111194Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8111665Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
2026-09-24T16:40:37.8112121Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8112492Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
2026-09-24T16:40:37.8112854Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8113249Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
2026-09-24T16:40:37.8113565Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8113892Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
2026-09-24T16:40:37.8114206Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8114536Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
2026-09-24T16:40:37.8114854Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8115170Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
2026-09-24T16:40:37.8115592Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8115911Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-24T16:40:37.8116214Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8116538Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-24T16:40:37.8116842Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8117406Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
2026-09-24T16:40:37.8117757Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
2026-09-24T16:40:37.8118096Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
2026-09-24T16:40:37.8118410Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8118711Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.8119008Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
2026-09-24T16:40:37.8119307Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
2026-09-24T16:40:37.8119617Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8119922Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
2026-09-24T16:40:37.8120264Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
2026-09-24T16:40:37.8120588Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
2026-09-24T16:40:37.8120904Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
2026-09-24T16:40:37.8121219Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
2026-09-24T16:40:37.8121527Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8121876Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.8122183Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
2026-09-24T16:40:37.8122507Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS$$$view29.verificarEAtualizarCache(Unknown Source)
2026-09-24T16:40:37.8122729Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.8122917Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.8123185Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
2026-09-24T16:40:37.8123608Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
2026-09-24T16:40:37.8124078Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
2026-09-24T16:40:37.8124466Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
2026-09-24T16:40:37.8124865Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
2026-09-24T16:40:37.8125292Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS$Proxy$_$$_Weld$EnterpriseProxy$.verificarEAtualizarCache(Unknown Source)
2026-09-24T16:40:37.8125773Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.comum.config.cache.CacheConfig.onStartup(CacheConfig.java:37)
2026-09-24T16:40:37.8126047Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.8126291Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.8126752Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
2026-09-24T16:40:37.8127375Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8127891Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.8128431Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-24T16:40:37.8128876Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:126)
2026-09-24T16:40:37.8129232Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:112)
2026-09-24T16:40:37.8129597Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8129900Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.8130302Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:87)
2026-09-24T16:40:37.8130749Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-24T16:40:37.8131068Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8131390Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
2026-09-24T16:40:37.8131697Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8132033Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
2026-09-24T16:40:37.8132344Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8132794Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
2026-09-24T16:40:37.8133113Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8133449Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:111)
2026-09-24T16:40:37.8133765Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8134082Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-24T16:40:37.8134393Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8134689Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254)
2026-09-24T16:40:37.8134978Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:416)
2026-09-24T16:40:37.8135297Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:68)
2026-09-24T16:40:37.8135606Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8135937Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
2026-09-24T16:40:37.8136250Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8136603Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-24T16:40:37.8136927Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8137236Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-24T16:40:37.8137827Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8138160Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-24T16:40:37.8138472Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8138810Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.StartupCountDownInterceptor.processInvocation(StartupCountDownInterceptor.java:25)
2026-09-24T16:40:37.8139128Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8139419Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.8139809Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:168)
2026-09-24T16:40:37.8139976Z 	... 13 more
2026-09-24T16:40:37.8140175Z Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-24T16:40:37.8140616Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:61)
2026-09-24T16:40:37.8140943Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
2026-09-24T16:40:37.8141240Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
2026-09-24T16:40:37.8141577Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
2026-09-24T16:40:37.8141958Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
2026-09-24T16:40:37.8142296Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
2026-09-24T16:40:37.8142619Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
2026-09-24T16:40:37.8142980Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
2026-09-24T16:40:37.8143342Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
2026-09-24T16:40:37.8143693Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
2026-09-24T16:40:37.8144029Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:227)
2026-09-24T16:40:37.8144355Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:164)
2026-09-24T16:40:37.8144692Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
2026-09-24T16:40:37.8145024Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
2026-09-24T16:40:37.8145341Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
2026-09-24T16:40:37.8145753Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
2026-09-24T16:40:37.8146076Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
2026-09-24T16:40:37.8146383Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
2026-09-24T16:40:37.8146709Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
2026-09-24T16:40:37.8147053Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
2026-09-24T16:40:37.8147501Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
2026-09-24T16:40:37.8147816Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
2026-09-24T16:40:37.8148138Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:107)
2026-09-24T16:40:37.8148739Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:300)
2026-09-24T16:40:37.8149093Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:241)
2026-09-24T16:40:37.8149388Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
2026-09-24T16:40:37.8149687Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
2026-09-24T16:40:37.8149961Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.Query.getResultList(Query.java:119)
2026-09-24T16:40:37.8150333Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRecursoRepository.consultarTodosPerfisRelacionados(PerfilRecursoRepository.java:35)
2026-09-24T16:40:37.8150757Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRecursoRepository$Proxy$_$$_WeldClientProxy.consultarTodosPerfisRelacionados(Unknown Source)
2026-09-24T16:40:37.8151142Z 	at deployment.sihdg-3.15.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS.consultarTodosPerfisRelacionados(PerfilRecursoAS.java:132)
2026-09-24T16:40:37.8151385Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-24T16:40:37.8151563Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-24T16:40:37.8151873Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
2026-09-24T16:40:37.8152200Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8152517Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-24T16:40:37.8152857Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-24T16:40:37.8153208Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
2026-09-24T16:40:37.8153559Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
2026-09-24T16:40:37.8153895Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
2026-09-24T16:40:37.8154215Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8154556Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
2026-09-24T16:40:37.8154877Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8155193Z 	at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
2026-09-24T16:40:37.8155500Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8155821Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-24T16:40:37.8156184Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8156483Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
2026-09-24T16:40:37.8156783Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8157082Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-24T16:40:37.8157587Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
2026-09-24T16:40:37.8157921Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8158253Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
2026-09-24T16:40:37.8158555Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8158894Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
2026-09-24T16:40:37.8159216Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-24T16:40:37.8159591Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
2026-09-24T16:40:37.8159749Z 	... 181 more
2026-09-24T16:40:37.8159915Z Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-24T16:40:37.8160248Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:160)
2026-09-24T16:40:37.8160589Z 	at org.jboss.as.connector@8.0.13.GA-redhat-00002//org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
2026-09-24T16:40:37.8160957Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
2026-09-24T16:40:37.8161320Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.internal.NonContextualJdbcConnectionAccess.obtainConnection(NonContextualJdbcConnectionAccess.java:38)
2026-09-24T16:40:37.8161676Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:113)
2026-09-24T16:40:37.8161864Z 	... 234 more
2026-09-24T16:40:37.8162015Z Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-24T16:40:37.8162359Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:690)
2026-09-24T16:40:37.8162816Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
2026-09-24T16:40:37.8163192Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
2026-09-24T16:40:37.8163539Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
2026-09-24T16:40:37.8163854Z 	... 238 more
2026-09-24T16:40:37.8163987Z Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
2026-09-24T16:40:37.8164329Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
2026-09-24T16:40:37.8164732Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
2026-09-24T16:40:37.8165137Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
2026-09-24T16:40:37.8165654Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1381)
2026-09-24T16:40:37.8166137Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:534)
2026-09-24T16:40:37.8166524Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getTransactionNewConnection(AbstractPool.java:770)
2026-09-24T16:40:37.8166861Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:666)
2026-09-24T16:40:37.8167221Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
2026-09-24T16:40:37.8167547Z 	... 241 more
2026-09-24T16:40:37.8168068Z Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: "encrypt" property is set to "true" and "trustServerCertificate" property is set to "true" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (unsupported_certificate) Certificates do not conform to algorithm constraints. ClientConnectionId:28674597-cd4d-44eb-8fd8-05c6b90f5d23
2026-09-24T16:40:37.8168426Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.terminate(SQLServerConnection.java:4290)
2026-09-24T16:40:37.8168636Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1965)
2026-09-24T16:40:37.8168850Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:3816)
2026-09-24T16:40:37.8169064Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:3372)
2026-09-24T16:40:37.8169283Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:3197)
2026-09-24T16:40:37.8169500Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:1971)
2026-09-24T16:40:37.8169699Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:1263)
2026-09-24T16:40:37.8170139Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
2026-09-24T16:40:37.8170426Z 	... 248 more
2026-09-24T16:40:37.8170661Z Caused by: javax.net.ssl.SSLHandshakeException: (unsupported_certificate) Certificates do not conform to algorithm constraints
2026-09-24T16:40:37.8170953Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130)
2026-09-24T16:40:37.8171241Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:383)
2026-09-24T16:40:37.8171625Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:326)
2026-09-24T16:40:37.8171901Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-09-24T16:40:37.8172229Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647)
2026-09-24T16:40:37.8172562Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467)
2026-09-24T16:40:37.8172795Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363)
2026-09-24T16:40:37.8172988Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393)
2026-09-24T16:40:37.8173159Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:477)
2026-09-24T16:40:37.8173342Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:448)
2026-09-24T16:40:37.8173523Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:206)
2026-09-24T16:40:37.8173696Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:172)
2026-09-24T16:40:37.8173861Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1506)
2026-09-24T16:40:37.8174032Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1421)
2026-09-24T16:40:37.8174218Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:455)
2026-09-24T16:40:37.8174395Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:426)
2026-09-24T16:40:37.8174582Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1854)
2026-09-24T16:40:37.8174727Z 	... 254 more
2026-09-24T16:40:37.8174859Z Caused by: java.security.cert.CertificateException: Certificates do not conform to algorithm constraints
2026-09-24T16:40:37.8175060Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1557)
2026-09-24T16:40:37.8175279Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAdditionalTrust(SSLContextImpl.java:1484)
2026-09-24T16:40:37.8175486Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkServerTrusted(SSLContextImpl.java:1431)
2026-09-24T16:40:37.8175703Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:631)
2026-09-24T16:40:37.8175860Z 	... 266 more
2026-09-24T16:40:37.8176005Z Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA
2026-09-24T16:40:37.8176207Z 	at java.base/sun.security.provider.certpath.AlgorithmChecker.check(AlgorithmChecker.java:231)
2026-09-24T16:40:37.8176411Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1553)
2026-09-24T16:40:37.8176565Z 	... 269 more
2026-09-24T16:40:37.8176601Z 
2026-09-24T16:40:37.8176981Z [0m[31m13:39:59,967 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("deploy") failed - address: ([("deployment" => "sihdg-3.15.0.0.ear")]) - failure description: {"WFLYCTL0080: Failed services" => {
2026-09-24T16:40:37.8177528Z     "jboss.deployment.subunit.\"sihdg-3.15.0.0.ear\".\"sihdg-api.war\".component.SecurityConfig.START" => "java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
2026-09-24T16:40:37.8177760Z     Caused by: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
2026-09-24T16:40:37.8177996Z     Caused by: jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-24T16:40:37.8178282Z     Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-24T16:40:37.8178634Z     Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-24T16:40:37.8178856Z     Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-24T16:40:37.8179041Z     Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
2026-09-24T16:40:37.8179610Z     Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: \"encrypt\" property is set to \"true\" and \"trustServerCertificate\" property is set to \"true\" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (unsupported_certificate) Certificates do not conform to algorithm constraints. ClientConnectionId:4a1f60f0-b155-4d55-8dd3-0b7731a36b99
2026-09-24T16:40:37.8179958Z     Caused by: javax.net.ssl.SSLHandshakeException: (unsupported_certificate) Certificates do not conform to algorithm constraints
2026-09-24T16:40:37.8180150Z     Caused by: java.security.cert.CertificateException: Certificates do not conform to algorithm constraints
2026-09-24T16:40:37.8180346Z     Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA",
2026-09-24T16:40:37.8180675Z     "jboss.deployment.subunit.\"sihdg-3.15.0.0.ear\".\"sihdg-api.war\".component.CacheConfig.START" => "java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
2026-09-24T16:40:37.8180892Z     Caused by: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
2026-09-24T16:40:37.8181123Z     Caused by: jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-24T16:40:37.8181404Z     Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-24T16:40:37.8181658Z     Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-24T16:40:37.8181867Z     Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-24T16:40:37.8182047Z     Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
2026-09-24T16:40:37.8182585Z     Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: \"encrypt\" property is set to \"true\" and \"trustServerCertificate\" property is set to \"true\" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (unsupported_certificate) Certificates do not conform to algorithm constraints. ClientConnectionId:28674597-cd4d-44eb-8fd8-05c6b90f5d23
2026-09-24T16:40:37.8182935Z     Caused by: javax.net.ssl.SSLHandshakeException: (unsupported_certificate) Certificates do not conform to algorithm constraints
2026-09-24T16:40:37.8183117Z     Caused by: java.security.cert.CertificateException: Certificates do not conform to algorithm constraints
2026-09-24T16:40:37.8183316Z     Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA"
2026-09-24T16:40:37.8183453Z }}
2026-09-24T16:40:37.8183715Z [0m[0m13:39:59,985 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 28) WFLYSRV0010: Deployed "sihdg-3.15.0.0.ear" (runtime-name : "sihdg-3.15.0.0.ear")
2026-09-24T16:40:37.8184002Z [0m[0m13:40:00,049 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0183: Service status report
2026-09-24T16:40:37.8184375Z WFLYCTL0186:   Services which failed to start:      service jboss.deployment.subunit."sihdg-3.15.0.0.ear"."sihdg-api.war".component.CacheConfig.START: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
2026-09-24T16:40:37.8184828Z       service jboss.deployment.subunit."sihdg-3.15.0.0.ear"."sihdg-api.war".component.SecurityConfig.START: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
2026-09-24T16:40:37.8185033Z WFLYCTL0448: 2 additional services are down due to their dependencies being missing or failed
2026-09-24T16:40:37.8185273Z [0m[0m13:40:00,063 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
2026-09-24T16:40:37.8185580Z [0m[0m13:40:00,065 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://0.0.0.0:9990/management
2026-09-24T16:40:37.8185942Z [0m[0m13:40:00,065 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0054: Admin console is not enabled
2026-09-24T16:40:37.8186431Z [0m[31m13:40:00,065 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) started (with errors) in 22295ms - Started 1176 of 1265 services (7 services failed or missing dependencies, 162 services are lazy, passive or on-demand) - Server configuration file in use: standalone.xml
2026-09-24T16:40:37.8187457Z ##[debug]Exit code 0 received from tool '/usr/bin/bash'
2026-09-24T16:40:37.8187764Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-09-24T16:40:37.8187994Z ##[debug]task result: Succeeded
2026-09-24T16:40:37.8189000Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-09-24T16:40:37.8190019Z ##[section]Finishing: Logs da Aplicação
