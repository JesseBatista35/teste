Solicitamos Equalzação do ambiente de desenvolvimento do Projeto SISOU-vivavoz-okd com o SISOU-sac-okd

Solicitamos 3 ambientes para o Projeto SISOU, são eles:
- SISOU-ouvidoria-okd
- SISOU-sac-okd
- SISOU-vivavoz-okd

Estamos realizando build e release em todos os ambientes a partir do mesmo código, mas o único que está apresentando ERRO é o ambiente SISOU-vivavoz-okd 

Por isso, pedimos a verificação desse ambiente para que esteja compatível com os outros dois citados, visto que no momento precisamos que estejam com as mesmas configurações de JAVA, etc.

Segue em anexo ltimo LOG com relação ao ambiente SISOU-vivavoz-okd que está com problemas a gerar a RELEASE

Pedimos que comparem aos outros dois ambientes a fim de encontrar quais diferenças estão impedido o uso funcional desse ambiente



log da release:


2026-06-01T17:30:54.7939437Z ##[debug]Evaluating condition for step: 'Verificando Status do Deployment'
2026-06-01T17:30:54.7939853Z ##[debug]Evaluating: succeeded()
2026-06-01T17:30:54.7939996Z ##[debug]Evaluating succeeded:
2026-06-01T17:30:54.7940239Z ##[debug]=> True
2026-06-01T17:30:54.7940389Z ##[debug]Result: True
2026-06-01T17:30:54.7940551Z ##[section]Starting: Verificando Status do Deployment
2026-06-01T17:30:54.7943404Z ==============================================================================
2026-06-01T17:30:54.7943477Z Task         : Bash
2026-06-01T17:30:54.7943528Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-01T17:30:54.7943593Z Version      : 3.227.0
2026-06-01T17:30:54.7943635Z Author       : Microsoft Corporation
2026-06-01T17:30:54.7943691Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-01T17:30:54.7943762Z ==============================================================================
2026-06-01T17:30:54.8443940Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-06-01T17:30:54.9109041Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-06-01T17:30:54.9116726Z ##[debug]loading inputs and endpoints
2026-06-01T17:30:54.9123422Z ##[debug]loading INPUT_TARGETTYPE
2026-06-01T17:30:54.9130734Z ##[debug]loading INPUT_FILEPATH
2026-06-01T17:30:54.9131840Z ##[debug]loading INPUT_SCRIPT
2026-06-01T17:30:54.9132509Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-06-01T17:30:54.9133123Z ##[debug]loading INPUT_FAILONSTDERR
2026-06-01T17:30:54.9133784Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-06-01T17:30:54.9134462Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-06-01T17:30:54.9136407Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-06-01T17:30:54.9140859Z ##[debug]loading SECRET_AZPAT
2026-06-01T17:30:54.9142282Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-06-01T17:30:54.9143741Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-06-01T17:30:54.9145572Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-06-01T17:30:54.9147003Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-06-01T17:30:54.9148228Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-06-01T17:30:54.9148955Z ##[debug]loading SECRET_FORTIFY_PASS
2026-06-01T17:30:54.9149579Z ##[debug]loading SECRET_PASSWORD_CGC
2026-06-01T17:30:54.9150157Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-06-01T17:30:54.9150687Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-06-01T17:30:54.9151290Z ##[debug]loading SECRET_DATASOURCE_PASSWORD
2026-06-01T17:30:54.9151844Z ##[debug]loading SECRET_TOKEN_CRQ
2026-06-01T17:30:54.9153136Z ##[debug]loaded 20
2026-06-01T17:30:54.9156784Z ##[debug]Agent.ProxyUrl=undefined
2026-06-01T17:30:54.9157233Z ##[debug]Agent.CAInfo=undefined
2026-06-01T17:30:54.9157463Z ##[debug]Agent.ClientCert=undefined
2026-06-01T17:30:54.9157677Z ##[debug]Agent.SkipCertValidation=True
2026-06-01T17:30:54.9172058Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-06-01T17:30:54.9173422Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-06-01T17:30:54.9173692Z ##[debug]system.culture=en-US
2026-06-01T17:30:54.9181082Z ##[debug]failOnStderr=false
2026-06-01T17:30:54.9181974Z ##[debug]workingDirectory=/opt/ads-agent/_work/r200/a
2026-06-01T17:30:54.9182214Z ##[debug]check path : /opt/ads-agent/_work/r200/a
2026-06-01T17:30:54.9182624Z ##[debug]targetType=inline
2026-06-01T17:30:54.9182840Z ##[debug]bashEnvValue=undefined
2026-06-01T17:30:54.9184325Z ##[debug]script=if [[ -n "okd4_nprd" && ("okd4_nprd" =~ "okd4" || "okd4_nprd" =~ "ocp") ]]
then
  app="sisou-vivavoz-okd-des"
else
  app="sisou-vivavoz-okd-des-esteiras"
fi

oc rollout status dc/"$app"  --request-timeout=600 -n sisou-des
if [ "$?" -ne "0" ]; then
  echo "A aplicação não foi iniciada com sucesso!"
  echo "Os logs da aplicação estão disponíveis na próxima task: Logs da Aplicação"
  exit 1
fi
2026-06-01T17:30:54.9193430Z Generating script.
2026-06-01T17:30:54.9195234Z ##[debug]which 'bash'
2026-06-01T17:30:54.9200593Z ##[debug]found: '/usr/bin/bash'
2026-06-01T17:30:54.9201172Z ##[debug]Agent.Version=3.236.1
2026-06-01T17:30:54.9201404Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-06-01T17:30:54.9201651Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-06-01T17:30:54.9204302Z ========================== Starting Command Output ===========================
2026-06-01T17:30:54.9205416Z ##[debug]which '/usr/bin/bash'
2026-06-01T17:30:54.9206344Z ##[debug]found: '/usr/bin/bash'
2026-06-01T17:30:54.9206954Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/b6abea7c-408f-4b4f-a7a1-fc82ad1a32a3.sh
2026-06-01T17:30:54.9209411Z ##[debug]exec tool: /usr/bin/bash
2026-06-01T17:30:54.9209643Z ##[debug]arguments:
2026-06-01T17:30:54.9209874Z ##[debug]   /opt/ads-agent/_work/_temp/b6abea7c-408f-4b4f-a7a1-fc82ad1a32a3.sh
2026-06-01T17:30:54.9211522Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/b6abea7c-408f-4b4f-a7a1-fc82ad1a32a3.sh
2026-06-01T17:30:55.0049334Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-06-01T17:30:56.2730584Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-06-01T17:30:56.3554120Z Waiting for rollout to finish: 0 of 1 updated replicas are available...
2026-06-01T17:30:56.9146370Z ##[debug]Agent environment resources - Disk: / Available 77829.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 16.74%
2026-06-01T17:31:01.9154126Z ##[debug]Agent environment resources - Disk: / Available 77830.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 14.93%
2026-06-01T17:31:06.9157881Z ##[debug]Agent environment resources - Disk: / Available 77830.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 13.48%
2026-06-01T17:31:11.9164931Z ##[debug]Agent environment resources - Disk: / Available 77830.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 12.29%
2026-06-01T17:31:16.9169959Z ##[debug]Agent environment resources - Disk: / Available 77830.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 11.29%
2026-06-01T17:31:21.9179882Z ##[debug]Agent environment resources - Disk: / Available 77830.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 10.46%
2026-06-01T17:31:26.9187863Z ##[debug]Agent environment resources - Disk: / Available 77830.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 9.74%
2026-06-01T17:31:31.9195140Z ##[debug]Agent environment resources - Disk: / Available 77822.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 9.11%
2026-06-01T17:31:36.9200425Z ##[debug]Agent environment resources - Disk: / Available 77822.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 8.57%
2026-06-01T17:31:41.9209396Z ##[debug]Agent environment resources - Disk: / Available 77822.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 8.08%
2026-06-01T17:31:46.9216739Z ##[debug]Agent environment resources - Disk: / Available 77822.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.65%
2026-06-01T17:31:51.9206385Z ##[debug]Agent environment resources - Disk: / Available 77822.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.27%
2026-06-01T17:31:56.9212675Z ##[debug]Agent environment resources - Disk: / Available 77822.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.93%
2026-06-01T17:32:01.9220686Z ##[debug]Agent environment resources - Disk: / Available 77814.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.60%
2026-06-01T17:32:02.5444460Z Waiting for latest deployment config spec to be observed by the controller loop...
2026-06-01T17:32:06.9230168Z ##[debug]Agent environment resources - Disk: / Available 77805.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.31%
2026-06-01T17:32:11.9243038Z ##[debug]Agent environment resources - Disk: / Available 77806.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.06%
2026-06-01T17:32:16.9246832Z ##[debug]Agent environment resources - Disk: / Available 77805.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.81%
2026-06-01T17:32:21.9245809Z ##[debug]Agent environment resources - Disk: / Available 77805.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.59%
2026-06-01T17:32:26.9246975Z ##[debug]Agent environment resources - Disk: / Available 77805.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.38%
2026-06-01T17:32:31.9264875Z ##[debug]Agent environment resources - Disk: / Available 77805.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.19%
2026-06-01T17:32:36.9272705Z ##[debug]Agent environment resources - Disk: / Available 77805.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.02%
2026-06-01T17:32:41.9277684Z ##[debug]Agent environment resources - Disk: / Available 77805.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.84%
2026-06-01T17:32:46.9285016Z ##[debug]Agent environment resources - Disk: / Available 77805.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.70%
2026-06-01T17:32:51.9293655Z ##[debug]Agent environment resources - Disk: / Available 77805.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.55%
2026-06-01T17:32:56.9301507Z ##[debug]Agent environment resources - Disk: / Available 77805.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.42%
2026-06-01T17:33:01.9306071Z ##[debug]Agent environment resources - Disk: / Available 77805.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.29%
2026-06-01T17:33:06.9309521Z ##[debug]Agent environment resources - Disk: / Available 77805.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.17%
2026-06-01T17:33:11.9314792Z ##[debug]Agent environment resources - Disk: / Available 77805.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.05%
2026-06-01T17:33:16.9321191Z ##[debug]Agent environment resources - Disk: / Available 77805.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.94%
2026-06-01T17:33:21.9325443Z ##[debug]Agent environment resources - Disk: / Available 77805.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.84%
2026-06-01T17:33:26.9326592Z ##[debug]Agent environment resources - Disk: / Available 77805.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.75%
2026-06-01T17:33:31.9327967Z ##[debug]Agent environment resources - Disk: / Available 77805.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.66%
2026-06-01T17:33:36.9326701Z ##[debug]Agent environment resources - Disk: / Available 77805.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.57%
2026-06-01T17:33:41.9332211Z ##[debug]Agent environment resources - Disk: / Available 77797.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.48%
2026-06-01T17:33:46.9336080Z ##[debug]Agent environment resources - Disk: / Available 77797.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.41%
2026-06-01T17:33:51.9338731Z ##[debug]Agent environment resources - Disk: / Available 77797.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.33%
2026-06-01T17:33:56.9352142Z ##[debug]Agent environment resources - Disk: / Available 77797.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.26%
2026-06-01T17:34:01.9359425Z ##[debug]Agent environment resources - Disk: / Available 77797.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.19%
2026-06-01T17:34:06.9373133Z ##[debug]Agent environment resources - Disk: / Available 77797.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.12%
2026-06-01T17:34:11.9374148Z ##[debug]Agent environment resources - Disk: / Available 77797.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.06%
2026-06-01T17:34:16.9386921Z ##[debug]Agent environment resources - Disk: / Available 77797.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.00%
2026-06-01T17:34:21.9390877Z ##[debug]Agent environment resources - Disk: / Available 77797.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.95%
2026-06-01T17:34:26.9399682Z ##[debug]Agent environment resources - Disk: / Available 77797.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.89%
2026-06-01T17:34:31.9411869Z ##[debug]Agent environment resources - Disk: / Available 77797.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.83%
2026-06-01T17:34:36.9415750Z ##[debug]Agent environment resources - Disk: / Available 77797.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.78%
2026-06-01T17:34:41.9413696Z ##[debug]Agent environment resources - Disk: / Available 77797.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.74%
2026-06-01T17:34:46.9420558Z ##[debug]Agent environment resources - Disk: / Available 77797.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.68%
2026-06-01T17:34:51.9427960Z ##[debug]Agent environment resources - Disk: / Available 77797.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.64%
2026-06-01T17:34:56.9425554Z ##[debug]Agent environment resources - Disk: / Available 77797.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.60%
2026-06-01T17:35:01.9433780Z ##[debug]Agent environment resources - Disk: / Available 77797.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.55%
2026-06-01T17:35:06.9444203Z ##[debug]Agent environment resources - Disk: / Available 77797.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.51%
2026-06-01T17:35:11.9454034Z ##[debug]Agent environment resources - Disk: / Available 77797.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.47%
2026-06-01T17:35:16.9448778Z ##[debug]Agent environment resources - Disk: / Available 77797.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.43%
2026-06-01T17:35:21.9463551Z ##[debug]Agent environment resources - Disk: / Available 77789.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.40%
2026-06-01T17:35:26.9470529Z ##[debug]Agent environment resources - Disk: / Available 77789.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.36%
2026-06-01T17:35:31.9474793Z ##[debug]Agent environment resources - Disk: / Available 77789.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.33%
2026-06-01T17:35:36.9476959Z ##[debug]Agent environment resources - Disk: / Available 77789.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.29%
2026-06-01T17:35:41.9475077Z ##[debug]Agent environment resources - Disk: / Available 77789.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.26%
2026-06-01T17:35:46.9478869Z ##[debug]Agent environment resources - Disk: / Available 77789.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.23%
2026-06-01T17:35:51.9492790Z ##[debug]Agent environment resources - Disk: / Available 77789.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.20%
2026-06-01T17:35:56.9500379Z ##[debug]Agent environment resources - Disk: / Available 77789.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.17%
2026-06-01T17:36:01.9516376Z ##[debug]Agent environment resources - Disk: / Available 77789.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.14%
2026-06-01T17:36:06.9521431Z ##[debug]Agent environment resources - Disk: / Available 77789.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.11%
2026-06-01T17:36:11.9525253Z ##[debug]Agent environment resources - Disk: / Available 77789.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.08%
2026-06-01T17:36:16.9525650Z ##[debug]Agent environment resources - Disk: / Available 77789.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.05%
2026-06-01T17:36:21.9527776Z ##[debug]Agent environment resources - Disk: / Available 77789.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.03%
2026-06-01T17:36:26.9530160Z ##[debug]Agent environment resources - Disk: / Available 77789.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.01%
2026-06-01T17:36:31.9538930Z ##[debug]Agent environment resources - Disk: / Available 77789.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 1.98%
2026-06-01T17:36:36.9547183Z ##[debug]Agent environment resources - Disk: / Available 77789.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 1.96%
2026-06-01T17:36:41.9550573Z ##[debug]Agent environment resources - Disk: / Available 77789.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 1.93%
2026-06-01T17:36:46.9554783Z ##[debug]Agent environment resources - Disk: / Available 77789.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 1.91%
2026-06-01T17:36:51.9554324Z ##[debug]Agent environment resources - Disk: / Available 77789.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 1.89%
2026-06-01T17:36:54.7988057Z ##[debug]Started cancellation of executing script
2026-06-01T17:36:54.7994897Z ##[debug]Exit code null received from tool '/usr/bin/bash'
2026-06-01T17:37:02.3038937Z ##[error]The task has timed out.
2026-06-01T17:37:02.3039835Z ##[section]Finishing: Verificando Status do Deployment


log do okd: 

/opt/jboss/bin/standalone.conf: line 37: =org.jboss.byteman: command not found
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/lib/jvm/java-17-openjdk-17.0.7.0.7-3.el8.x86_64/bin/java

  JAVA_OPTS:  -Xlog:gc*:file="/opt/jboss/standalone/log/gc.log":time,uptimemillis:filecount=5,filesize=3M -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs= -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar:/opt/jboss/modules/system/layers/base/org/jboss/log4j/logmanager/main/log4j-jboss-logmanager-1.2.0.Final-redhat-00001.jar:/opt/jboss/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dsun.util.logging.disableCallerCheck=true -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sisou -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=https://apm-server-devops.apps.produtos4.caixa/ -Delastic.apm.global_labels=deployment=sisou-vivavoz-okd-des -Djava.net.useSystemProxies=false -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=localhost\|127.0.0.1\|*.caixa  --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED

=========================================================================

Jun 02, 2026 3:00:28 PM java.lang.System$LoggerFinder lambda$accessProvider$0
WARNING: Failed to instantiate LoggerFinder provider; Using default.
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-06-02 15:00:28.904 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
[0m15:00:29,807 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.0.Final-redhat-00001
[0m[0m15:00:30,224 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.12.Final-redhat-00001
[0m[0m15:00:30,233 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
[0m[0m15:00:30,448 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 7.4.12.GA (WildFly Core 15.0.29.Final-redhat-00001) starting
[0m[0m15:00:32,345 INFO  [org.wildfly.security] (ServerService Thread Pool -- 29) ELY00001: WildFly Elytron version 1.15.17.Final-redhat-00001
[0m[0m15:00:33,003 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 25) WFLYCTL0033: Extension 'security' is deprecated and may not be supported in future versions
[0m[0m15:00:33,736 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m15:00:33,811 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 21) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m15:00:34,432 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 36) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/f9/d2546463dba0f9012c2630374cd3a870f373d5/content
[0m[31m15:00:34,505 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("add") failed - address: ([
    ("core-service" => "management"),
    ("security-realm" => "ManagementRealm")
]) - failure description: "WFLYDM0145: The resource 'security-realm' is unsupported since Java 14"
[0m[31m15:00:34,506 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("add") failed - address: ([
    ("core-service" => "management"),
    ("security-realm" => "ApplicationRealm")
]) - failure description: "WFLYDM0145: The resource 'security-realm' is unsupported since Java 14"
[0m[0m15:00:34,511 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
[0m[0m15:00:34,519 INFO  [org.xnio] (MSC service thread 1-1) XNIO version 3.8.4.Final-redhat-00001
[0m[0m15:00:34,523 INFO  [org.xnio.nio] (MSC service thread 1-1) XNIO NIO Implementation Version 3.8.4.Final-redhat-00001
[0m[33m15:00:34,606 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 74) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
[0m[0m15:00:34,607 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 54) WFLYCLINF0001: Activating Infinispan subsystem.
[0m[0m15:00:34,608 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 55) WFLYIO001: Worker 'default' has auto-configured to 2 IO threads with 16 max task threads based on your 1 available processors
[0m[0m15:00:34,609 INFO  [org.jboss.as.clustering.jgroups] (ServerService Thread Pool -- 59) WFLYCLJG0001: Activating JGroups subsystem. JGroups version 4.2.11
[0m[31m15:00:34,703 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 72) WFLYCTL0013: Operation ("add") failed - address: ([("subsystem" => "security")]) - failure description: "WFLYSEC0106: The resource 'security' is unsupported since Java 14"
[0m[0m15:00:34,704 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 52) WFLYHEALTH0001: Activating Base Health Subsystem
[0m[0m15:00:34,705 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 66) WFLYNAM0001: Activating Naming Subsystem
[0m[0m15:00:34,705 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 56) WFLYRS0016: RESTEasy version 3.15.1.Final-redhat-00001
[0m[0m15:00:34,707 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 76) WFLYWS0002: Activating WebServices Extension
[0m[0m15:00:34,707 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 65) WFLYMETRICS0001: Activating Base Metrics Subsystem
[0m[0m15:00:34,802 INFO  [org.wildfly.iiop.openjdk] (ServerService Thread Pool -- 53) WFLYIIOP0001: Activating IIOP Subsystem
[0m[0m15:00:34,802 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 62) WFLYJSF0007: Activated the following Jakarta Server Faces Implementations: [main]
[0m[0m15:00:34,904 INFO  [org.jboss.remoting] (MSC service thread 1-1) JBoss Remoting version 5.0.20.SP1-redhat-00001
[0m[0m15:00:35,203 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0003: Undertow 2.2.25.SP3-redhat-00001 starting
[0m[0m15:00:35,204 INFO  [org.jboss.as.connector] (MSC service thread 1-1) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 1.4.30.Final-redhat-00001)
[0m[0m15:00:35,309 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 75) WFLYUT0014: Creating file handler for path '/opt/jboss/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
[0m[0m15:00:35,411 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 4 (per class), which is derived from the number of CPUs on this host.
[0m[0m15:00:35,411 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 16 (per class), which is derived from thread worker pool sizing.
[0m[0m15:00:35,412 INFO  [org.jboss.as.naming] (MSC service thread 1-1) WFLYNAM0003: Starting Naming Service
[0m[0m15:00:35,610 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-2) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
[0m[33m15:00:35,709 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY00023: KeyStore file '/opt/jboss/standalone/configuration/application.keystore' does not exist. Used blank.
[0m


