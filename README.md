2026-07-31T14:15:34.2541301Z ##[debug]Evaluating condition for step: 'Verificando Status do Deployment'
2026-07-31T14:15:34.2541767Z ##[debug]Evaluating: succeeded()
2026-07-31T14:15:34.2541918Z ##[debug]Evaluating succeeded:
2026-07-31T14:15:34.2542169Z ##[debug]=> True
2026-07-31T14:15:34.2542323Z ##[debug]Result: True
2026-07-31T14:15:34.2542494Z ##[section]Starting: Verificando Status do Deployment
2026-07-31T14:15:34.2546253Z ==============================================================================
2026-07-31T14:15:34.2546339Z Task         : Bash
2026-07-31T14:15:34.2546379Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-31T14:15:34.2546440Z Version      : 3.227.0
2026-07-31T14:15:34.2546520Z Author       : Microsoft Corporation
2026-07-31T14:15:34.2546594Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-31T14:15:34.2546693Z ==============================================================================
2026-07-31T14:15:34.3088370Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-07-31T14:15:34.3806809Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-07-31T14:15:34.3815101Z ##[debug]loading inputs and endpoints
2026-07-31T14:15:34.3822078Z ##[debug]loading INPUT_TARGETTYPE
2026-07-31T14:15:34.3829621Z ##[debug]loading INPUT_FILEPATH
2026-07-31T14:15:34.3830396Z ##[debug]loading INPUT_SCRIPT
2026-07-31T14:15:34.3831185Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-07-31T14:15:34.3831765Z ##[debug]loading INPUT_FAILONSTDERR
2026-07-31T14:15:34.3832527Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-07-31T14:15:34.3833326Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-07-31T14:15:34.3835267Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-07-31T14:15:34.3840365Z ##[debug]loading SECRET_AZPAT
2026-07-31T14:15:34.3841641Z ##[debug]loading SECRET_TOKEN_CRQ
2026-07-31T14:15:34.3843505Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-07-31T14:15:34.3845425Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-07-31T14:15:34.3846914Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-07-31T14:15:34.3848414Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-07-31T14:15:34.3848999Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-07-31T14:15:34.3849630Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-07-31T14:15:34.3850260Z ##[debug]loading SECRET_FORTIFY_PASS
2026-07-31T14:15:34.3850775Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-07-31T14:15:34.3851299Z ##[debug]loading SECRET_PASSWORD_CGC
2026-07-31T14:15:34.3851835Z ##[debug]loaded 19
2026-07-31T14:15:34.3857143Z ##[debug]Agent.ProxyUrl=undefined
2026-07-31T14:15:34.3857531Z ##[debug]Agent.CAInfo=undefined
2026-07-31T14:15:34.3858386Z ##[debug]Agent.ClientCert=undefined
2026-07-31T14:15:34.3858619Z ##[debug]Agent.SkipCertValidation=True
2026-07-31T14:15:34.3871981Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-07-31T14:15:34.3874139Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-07-31T14:15:34.3874409Z ##[debug]system.culture=en-US
2026-07-31T14:15:34.3881867Z ##[debug]failOnStderr=false
2026-07-31T14:15:34.3882937Z ##[debug]workingDirectory=/opt/ads-agent/_work/r366/a
2026-07-31T14:15:34.3883180Z ##[debug]check path : /opt/ads-agent/_work/r366/a
2026-07-31T14:15:34.3883831Z ##[debug]targetType=inline
2026-07-31T14:15:34.3884104Z ##[debug]bashEnvValue=undefined
2026-07-31T14:15:34.3885447Z ##[debug]script=if [[ -n "$SITE" && "$SITE" =~ (okd4|ocp|openshift) ]];
then
  app="sisam-backend-internet-des"
else
  app="sisam-backend-internet-des-esteiras"
fi

oc rollout status deploymentconfig/"$app"  --request-timeout=600 -n sisam-des
if [ "$?" -ne "0" ]; then
  echo "A aplicação não foi iniciada com sucesso!"
  echo "Os logs da aplicação estão disponíveis na próxima task: Logs da Aplicação"
  exit 1
fi
2026-07-31T14:15:34.3893516Z Generating script.
2026-07-31T14:15:34.3895349Z ##[debug]which 'bash'
2026-07-31T14:15:34.3901087Z ##[debug]found: '/usr/bin/bash'
2026-07-31T14:15:34.3901704Z ##[debug]Agent.Version=3.236.1
2026-07-31T14:15:34.3901947Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-07-31T14:15:34.3902189Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-07-31T14:15:34.3904423Z ========================== Starting Command Output ===========================
2026-07-31T14:15:34.3905482Z ##[debug]which '/usr/bin/bash'
2026-07-31T14:15:34.3906379Z ##[debug]found: '/usr/bin/bash'
2026-07-31T14:15:34.3907013Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/db991a97-59ae-4b1e-a04b-6cb85ccb6dfa.sh
2026-07-31T14:15:34.3909303Z ##[debug]exec tool: /usr/bin/bash
2026-07-31T14:15:34.3909512Z ##[debug]arguments:
2026-07-31T14:15:34.3909748Z ##[debug]   /opt/ads-agent/_work/_temp/db991a97-59ae-4b1e-a04b-6cb85ccb6dfa.sh
2026-07-31T14:15:34.3911511Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/db991a97-59ae-4b1e-a04b-6cb85ccb6dfa.sh
2026-07-31T14:15:34.4746797Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-07-31T14:15:36.0676502Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-07-31T14:15:36.1276760Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-07-31T14:15:39.2456625Z ##[debug]Agent environment resources - Disk: / Available 54914.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 19.49%
2026-07-31T14:15:44.2473158Z ##[debug]Agent environment resources - Disk: / Available 54914.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 17.61%
2026-07-31T14:15:49.2472016Z ##[debug]Agent environment resources - Disk: / Available 54914.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 16.05%
2026-07-31T14:15:54.2481222Z ##[debug]Agent environment resources - Disk: / Available 54906.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 14.76%
2026-07-31T14:15:59.2484977Z ##[debug]Agent environment resources - Disk: / Available 54906.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 13.66%
2026-07-31T14:16:04.2496947Z ##[debug]Agent environment resources - Disk: / Available 54906.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 12.71%
2026-07-31T14:16:09.2509478Z ##[debug]Agent environment resources - Disk: / Available 54908.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 11.91%
2026-07-31T14:16:14.2521668Z ##[debug]Agent environment resources - Disk: / Available 54908.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 11.18%
2026-07-31T14:16:19.2529391Z ##[debug]Agent environment resources - Disk: / Available 54908.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 10.56%
2026-07-31T14:16:24.2530789Z ##[debug]Agent environment resources - Disk: / Available 54908.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 9.99%
2026-07-31T14:16:29.2547301Z ##[debug]Agent environment resources - Disk: / Available 54908.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 9.49%
2026-07-31T14:16:34.2558438Z ##[debug]Agent environment resources - Disk: / Available 54908.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 9.03%
2026-07-31T14:16:39.2569698Z ##[debug]Agent environment resources - Disk: / Available 54876.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 8.62%
2026-07-31T14:16:44.2578143Z ##[debug]Agent environment resources - Disk: / Available 54876.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 8.25%
2026-07-31T14:16:49.2587650Z ##[debug]Agent environment resources - Disk: / Available 54988.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.91%
2026-07-31T14:16:54.2595608Z ##[debug]Agent environment resources - Disk: / Available 54980.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.60%
2026-07-31T14:16:59.2602059Z ##[debug]Agent environment resources - Disk: / Available 54980.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.30%
2026-07-31T14:17:04.2609864Z ##[debug]Agent environment resources - Disk: / Available 54972.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.03%
2026-07-31T14:17:09.2619064Z ##[debug]Agent environment resources - Disk: / Available 54972.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.79%
2026-07-31T14:17:14.2630575Z ##[debug]Agent environment resources - Disk: / Available 54973.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.55%
2026-07-31T14:17:19.2637222Z ##[debug]Agent environment resources - Disk: / Available 54957.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.34%
2026-07-31T14:17:24.2646046Z ##[debug]Agent environment resources - Disk: / Available 54949.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.15%
2026-07-31T14:17:29.2647690Z ##[debug]Agent environment resources - Disk: / Available 54949.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.95%
2026-07-31T14:17:34.2651494Z ##[debug]Agent environment resources - Disk: / Available 54949.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.77%
2026-07-31T14:17:39.2669885Z ##[debug]Agent environment resources - Disk: / Available 54949.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.61%
2026-07-31T14:17:44.2671259Z ##[debug]Agent environment resources - Disk: / Available 54949.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.45%
2026-07-31T14:17:49.2674480Z ##[debug]Agent environment resources - Disk: / Available 54941.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.30%
2026-07-31T14:17:54.2683482Z ##[debug]Agent environment resources - Disk: / Available 54933.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.16%
2026-07-31T14:17:59.2691529Z ##[debug]Agent environment resources - Disk: / Available 54933.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.03%
2026-07-31T14:18:04.2699582Z ##[debug]Agent environment resources - Disk: / Available 54933.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.90%
2026-07-31T14:18:09.2715234Z ##[debug]Agent environment resources - Disk: / Available 54933.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.78%
2026-07-31T14:18:14.2727098Z ##[debug]Agent environment resources - Disk: / Available 54933.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.67%
2026-07-31T14:18:19.2732163Z ##[debug]Agent environment resources - Disk: / Available 54925.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.56%
2026-07-31T14:18:24.2743784Z ##[debug]Agent environment resources - Disk: / Available 54885.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.46%
2026-07-31T14:18:29.2757201Z ##[debug]Agent environment resources - Disk: / Available 54885.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.35%
2026-07-31T14:18:34.2767575Z ##[debug]Agent environment resources - Disk: / Available 54885.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.26%
2026-07-31T14:18:39.2773163Z ##[debug]Agent environment resources - Disk: / Available 54885.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.17%
2026-07-31T14:18:44.2785802Z ##[debug]Agent environment resources - Disk: / Available 54885.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.08%
2026-07-31T14:18:49.2792139Z ##[debug]Agent environment resources - Disk: / Available 54877.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.00%
2026-07-31T14:18:54.2799462Z ##[debug]Agent environment resources - Disk: / Available 54877.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.92%
2026-07-31T14:18:59.2803631Z ##[debug]Agent environment resources - Disk: / Available 54877.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.85%
2026-07-31T14:19:04.2818253Z ##[debug]Agent environment resources - Disk: / Available 54877.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.78%
2026-07-31T14:19:09.2820767Z ##[debug]Agent environment resources - Disk: / Available 54877.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.71%
2026-07-31T14:19:14.2822229Z ##[debug]Agent environment resources - Disk: / Available 54876.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.64%
2026-07-31T14:19:19.2825461Z ##[debug]Agent environment resources - Disk: / Available 54996.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.58%
2026-07-31T14:19:24.2832392Z ##[debug]Agent environment resources - Disk: / Available 54986.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.51%
2026-07-31T14:19:29.2848698Z ##[debug]Agent environment resources - Disk: / Available 54978.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.46%
2026-07-31T14:19:34.2867749Z ##[debug]Agent environment resources - Disk: / Available 54978.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.40%
2026-07-31T14:19:39.2875722Z ##[debug]Agent environment resources - Disk: / Available 54978.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.34%
2026-07-31T14:19:44.2889704Z ##[debug]Agent environment resources - Disk: / Available 54978.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.29%
2026-07-31T14:19:49.2909386Z ##[debug]Agent environment resources - Disk: / Available 54970.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.24%
2026-07-31T14:19:54.2912844Z ##[debug]Agent environment resources - Disk: / Available 54954.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.19%
2026-07-31T14:19:59.2923759Z ##[debug]Agent environment resources - Disk: / Available 54954.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.14%
2026-07-31T14:20:04.2936944Z ##[debug]Agent environment resources - Disk: / Available 54954.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.09%
2026-07-31T14:20:09.2943145Z ##[debug]Agent environment resources - Disk: / Available 54946.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.04%
2026-07-31T14:20:14.2958673Z ##[debug]Agent environment resources - Disk: / Available 54946.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.00%
2026-07-31T14:20:19.2966399Z ##[debug]Agent environment resources - Disk: / Available 54938.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.96%
2026-07-31T14:20:24.2979296Z ##[debug]Agent environment resources - Disk: / Available 54938.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.92%
2026-07-31T14:20:29.2984437Z ##[debug]Agent environment resources - Disk: / Available 54930.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.88%
2026-07-31T14:20:34.2993475Z ##[debug]Agent environment resources - Disk: / Available 54930.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.83%
2026-07-31T14:20:39.3006866Z ##[debug]Agent environment resources - Disk: / Available 54930.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.80%
2026-07-31T14:20:44.3010744Z ##[debug]Agent environment resources - Disk: / Available 54930.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.76%
2026-07-31T14:20:49.3001999Z ##[debug]Agent environment resources - Disk: / Available 54922.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.73%
2026-07-31T14:20:54.3000826Z ##[debug]Agent environment resources - Disk: / Available 54922.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.69%
2026-07-31T14:20:59.3009214Z ##[debug]Agent environment resources - Disk: / Available 54890.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.66%
2026-07-31T14:21:04.3014140Z ##[debug]Agent environment resources - Disk: / Available 54890.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.62%
2026-07-31T14:21:09.3028933Z ##[debug]Agent environment resources - Disk: / Available 54890.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.59%
2026-07-31T14:21:14.3035341Z ##[debug]Agent environment resources - Disk: / Available 54890.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.56%
2026-07-31T14:21:19.3049515Z ##[debug]Agent environment resources - Disk: / Available 54882.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.53%
2026-07-31T14:21:24.3051183Z ##[debug]Agent environment resources - Disk: / Available 54882.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.50%
2026-07-31T14:21:29.3064319Z ##[debug]Agent environment resources - Disk: / Available 54882.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.47%
2026-07-31T14:21:34.2585576Z ##[debug]Started cancellation of executing script
2026-07-31T14:21:34.2600719Z ##[debug]Exit code null received from tool '/usr/bin/bash'
2026-07-31T14:21:41.7643970Z ##[error]The task has timed out.
2026-07-31T14:21:41.7644858Z ##[section]Finishing: Verificando Status do Deployment


2026-07-31T14:21:41.7671083Z ##[debug]Evaluating condition for step: 'Logs da Aplicação'
2026-07-31T14:21:41.7671898Z ##[debug]Evaluating: always()
2026-07-31T14:21:41.7672049Z ##[debug]Evaluating always:
2026-07-31T14:21:41.7673201Z ##[debug]=> True
2026-07-31T14:21:41.7673425Z ##[debug]Result: True
2026-07-31T14:21:41.7673586Z ##[section]Starting: Logs da Aplicação
2026-07-31T14:21:41.7676744Z ==============================================================================
2026-07-31T14:21:41.7676827Z Task         : Bash
2026-07-31T14:21:41.7676867Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-31T14:21:41.7676929Z Version      : 3.227.0
2026-07-31T14:21:41.7676980Z Author       : Microsoft Corporation
2026-07-31T14:21:41.7677033Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-31T14:21:41.7677143Z ==============================================================================
2026-07-31T14:21:41.8292620Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-07-31T14:21:41.8994448Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-07-31T14:21:41.9001368Z ##[debug]loading inputs and endpoints
2026-07-31T14:21:41.9008744Z ##[debug]loading INPUT_TARGETTYPE
2026-07-31T14:21:41.9016667Z ##[debug]loading INPUT_FILEPATH
2026-07-31T14:21:41.9017674Z ##[debug]loading INPUT_SCRIPT
2026-07-31T14:21:41.9018498Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-07-31T14:21:41.9019022Z ##[debug]loading INPUT_FAILONSTDERR
2026-07-31T14:21:41.9019842Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-07-31T14:21:41.9020679Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-07-31T14:21:41.9022955Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-07-31T14:21:41.9027941Z ##[debug]loading SECRET_AZPAT
2026-07-31T14:21:41.9029639Z ##[debug]loading SECRET_TOKEN_CRQ
2026-07-31T14:21:41.9031050Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-07-31T14:21:41.9033073Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-07-31T14:21:41.9034480Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-07-31T14:21:41.9035863Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-07-31T14:21:41.9036455Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-07-31T14:21:41.9037199Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-07-31T14:21:41.9037645Z ##[debug]loading SECRET_FORTIFY_PASS
2026-07-31T14:21:41.9038330Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-07-31T14:21:41.9038919Z ##[debug]loading SECRET_PASSWORD_CGC
2026-07-31T14:21:41.9039839Z ##[debug]loaded 19
2026-07-31T14:21:41.9044872Z ##[debug]Agent.ProxyUrl=undefined
2026-07-31T14:21:41.9045126Z ##[debug]Agent.CAInfo=undefined
2026-07-31T14:21:41.9046087Z ##[debug]Agent.ClientCert=undefined
2026-07-31T14:21:41.9046333Z ##[debug]Agent.SkipCertValidation=True
2026-07-31T14:21:41.9060436Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-07-31T14:21:41.9062441Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-07-31T14:21:41.9062827Z ##[debug]system.culture=en-US
2026-07-31T14:21:41.9070640Z ##[debug]failOnStderr=false
2026-07-31T14:21:41.9071338Z ##[debug]workingDirectory=/opt/ads-agent/_work/r366/a
2026-07-31T14:21:41.9071595Z ##[debug]check path : /opt/ads-agent/_work/r366/a
2026-07-31T14:21:41.9072137Z ##[debug]targetType=inline
2026-07-31T14:21:41.9072364Z ##[debug]bashEnvValue=undefined
2026-07-31T14:21:41.9074107Z ##[debug]script=#!/bin/bash
set -o errexit
set -o pipefail
set -x

shopt -s expand_aliases

if [[ -n "$SITE" && "okd4_nprd" =~ "ocp" ]]
then
  app="sisam-backend-internet-des"

  arquivo="/usr/local/bin/oc-v4.13"
  if [ -e "$arquivo" ]; then 
    alias oc="$arquivo"
  fi
elif [[ -n "$SITE" && "$SITE" =~ (okd4|openshift) ]];
then
app="sisam-backend-internet-des"
else
  app="sisam-backend-internet-des-esteiras"
fi

oc version

last_pod=$(oc get pod -l name="$app" -n sisam-des -o jsonpath='{range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp  | tac | grep -v '^$' | head -n1)

echo "Logs do POD: $last_pod"
oc logs $last_pod -c "$app" -n sisam-des
2026-07-31T14:21:41.9082516Z Generating script.
2026-07-31T14:21:41.9086254Z ##[debug]which 'bash'
2026-07-31T14:21:41.9093010Z ##[debug]found: '/usr/bin/bash'
2026-07-31T14:21:41.9093407Z ##[debug]Agent.Version=3.236.1
2026-07-31T14:21:41.9093804Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-07-31T14:21:41.9094197Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-07-31T14:21:41.9096233Z ========================== Starting Command Output ===========================
2026-07-31T14:21:41.9097437Z ##[debug]which '/usr/bin/bash'
2026-07-31T14:21:41.9098283Z ##[debug]found: '/usr/bin/bash'
2026-07-31T14:21:41.9099033Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/39d239d2-004e-4f01-ad25-3a63faed1290.sh
2026-07-31T14:21:41.9101500Z ##[debug]exec tool: /usr/bin/bash
2026-07-31T14:21:41.9101879Z ##[debug]arguments:
2026-07-31T14:21:41.9102277Z ##[debug]   /opt/ads-agent/_work/_temp/39d239d2-004e-4f01-ad25-3a63faed1290.sh
2026-07-31T14:21:41.9104152Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/39d239d2-004e-4f01-ad25-3a63faed1290.sh
2026-07-31T14:21:41.9177902Z + shopt -s expand_aliases
2026-07-31T14:21:41.9178155Z + [[ -n okd4_nprd ]]
2026-07-31T14:21:41.9178265Z + [[ okd4_nprd =~ ocp ]]
2026-07-31T14:21:41.9178402Z + [[ -n okd4_nprd ]]
2026-07-31T14:21:41.9178510Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-07-31T14:21:41.9178674Z + app=sisam-backend-internet-des
2026-07-31T14:21:41.9178783Z + oc version
2026-07-31T14:21:41.9881838Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-07-31T14:21:41.9882092Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-07-31T14:21:41.9882287Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-07-31T14:21:41.9910607Z ++ oc get pod -l name=sisam-backend-internet-des -n sisam-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-07-31T14:21:41.9911024Z ++ tac
2026-07-31T14:21:41.9912902Z ++ grep -v '^$'
2026-07-31T14:21:41.9913069Z ++ head -n1
2026-07-31T14:21:42.0704837Z + last_pod=sisam-backend-internet-des-60-fcmcr
2026-07-31T14:21:42.0705169Z + echo 'Logs do POD: sisam-backend-internet-des-60-fcmcr'
2026-07-31T14:21:42.0705781Z + oc logs sisam-backend-internet-des-60-fcmcr -c sisam-backend-internet-des -n sisam-des
2026-07-31T14:21:42.0706073Z Logs do POD: sisam-backend-internet-des-60-fcmcr
2026-07-31T14:21:42.1537992Z Error from server (BadRequest): container "sisam-backend-internet-des" in pod "sisam-backend-internet-des-60-fcmcr" is waiting to start: PodInitializing
2026-07-31T14:21:42.1581869Z ##[debug]Exit code 1 received from tool '/usr/bin/bash'
2026-07-31T14:21:42.1586135Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-07-31T14:21:42.1594584Z ##[error]Bash exited with code '1'.
2026-07-31T14:21:42.1595064Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '1'.
2026-07-31T14:21:42.1596946Z ##[debug]task result: Failed
2026-07-31T14:21:42.1598301Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-07-31T14:21:42.1630248Z ##[section]Finishing: Logs da Aplicação


