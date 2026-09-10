2026-09-10T00:52:09.6623451Z ##[debug]Evaluating condition for step: 'Verificando Status do Deployment'
2026-09-10T00:52:09.6623877Z ##[debug]Evaluating: succeeded()
2026-09-10T00:52:09.6624035Z ##[debug]Evaluating succeeded:
2026-09-10T00:52:09.6624290Z ##[debug]=> True
2026-09-10T00:52:09.6624450Z ##[debug]Result: True
2026-09-10T00:52:09.6624608Z ##[section]Starting: Verificando Status do Deployment
2026-09-10T00:52:09.6627442Z ==============================================================================
2026-09-10T00:52:09.6627516Z Task         : Bash
2026-09-10T00:52:09.6627565Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-10T00:52:09.6627623Z Version      : 3.227.0
2026-09-10T00:52:09.6627664Z Author       : Microsoft Corporation
2026-09-10T00:52:09.6627734Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-10T00:52:09.6627898Z ==============================================================================
2026-09-10T00:52:09.7183002Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-10T00:52:09.7942500Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-10T00:52:09.7953986Z ##[debug]loading inputs and endpoints
2026-09-10T00:52:09.7965802Z ##[debug]loading INPUT_TARGETTYPE
2026-09-10T00:52:09.7977396Z ##[debug]loading INPUT_FILEPATH
2026-09-10T00:52:09.7979531Z ##[debug]loading INPUT_SCRIPT
2026-09-10T00:52:09.7981146Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-10T00:52:09.7982073Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-10T00:52:09.7983271Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-10T00:52:09.7984784Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-10T00:52:09.7989163Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-10T00:52:09.8003466Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-10T00:52:09.8006959Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-10T00:52:09.8010021Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-10T00:52:09.8012822Z ##[debug]loading SECRET_PW_ALOCAIP
2026-09-10T00:52:09.8015107Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-10T00:52:09.8016828Z ##[debug]loading SECRET_AZPAT
2026-09-10T00:52:09.8017840Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-10T00:52:09.8018817Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-10T00:52:09.8019555Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-10T00:52:09.8020311Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-09-10T00:52:09.8021064Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-10T00:52:09.8021737Z ##[debug]loading SECRET_PW_ISILON
2026-09-10T00:52:09.8028303Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-10T00:52:09.8028926Z ##[debug]loaded 21
2026-09-10T00:52:09.8032095Z ##[debug]Agent.ProxyUrl=undefined
2026-09-10T00:52:09.8032694Z ##[debug]Agent.CAInfo=undefined
2026-09-10T00:52:09.8033270Z ##[debug]Agent.ClientCert=undefined
2026-09-10T00:52:09.8033831Z ##[debug]Agent.SkipCertValidation=True
2026-09-10T00:52:09.8057636Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-10T00:52:09.8060739Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-10T00:52:09.8061178Z ##[debug]system.culture=en-US
2026-09-10T00:52:09.8073368Z ##[debug]failOnStderr=false
2026-09-10T00:52:09.8074247Z ##[debug]workingDirectory=/opt/ads-agent/_work/r882/a
2026-09-10T00:52:09.8074652Z ##[debug]check path : /opt/ads-agent/_work/r882/a
2026-09-10T00:52:09.8076703Z ##[debug]targetType=inline
2026-09-10T00:52:09.8077085Z ##[debug]bashEnvValue=undefined
2026-09-10T00:52:09.8077985Z ##[debug]script=if [[ -n "$SITE" && "$SITE" =~ (okd4|ocp|openshift) ]];
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
2026-09-10T00:52:09.8090471Z Generating script.
2026-09-10T00:52:09.8092302Z ##[debug]which 'bash'
2026-09-10T00:52:09.8108840Z ##[debug]found: '/usr/bin/bash'
2026-09-10T00:52:09.8109132Z ##[debug]Agent.Version=3.236.1
2026-09-10T00:52:09.8109399Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-10T00:52:09.8109649Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-10T00:52:09.8109825Z ========================== Starting Command Output ===========================
2026-09-10T00:52:09.8110149Z ##[debug]which '/usr/bin/bash'
2026-09-10T00:52:09.8110382Z ##[debug]found: '/usr/bin/bash'
2026-09-10T00:52:09.8111691Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/ede2356b-0d6a-4a49-aeaf-faa401328951.sh
2026-09-10T00:52:09.8112570Z ##[debug]exec tool: /usr/bin/bash
2026-09-10T00:52:09.8113013Z ##[debug]arguments:
2026-09-10T00:52:09.8113275Z ##[debug]   /opt/ads-agent/_work/_temp/ede2356b-0d6a-4a49-aeaf-faa401328951.sh
2026-09-10T00:52:09.8113781Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/ede2356b-0d6a-4a49-aeaf-faa401328951.sh
2026-09-10T00:52:09.9013362Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-09-10T00:52:11.4109475Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-09-10T00:52:11.4940774Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-09-10T00:52:14.2234588Z ##[debug]Agent environment resources - Disk: / Available 54657.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 16.55%
2026-09-10T00:52:19.2246191Z ##[debug]Agent environment resources - Disk: / Available 54657.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 14.98%
2026-09-10T00:52:24.2246172Z ##[debug]Agent environment resources - Disk: / Available 54657.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 13.66%
2026-09-10T00:52:29.2252345Z ##[debug]Agent environment resources - Disk: / Available 54657.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 12.57%
2026-09-10T00:52:34.2258518Z ##[debug]Agent environment resources - Disk: / Available 54649.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 11.63%
2026-09-10T00:52:39.2265042Z ##[debug]Agent environment resources - Disk: / Available 54648.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 10.80%
2026-09-10T00:52:44.2265859Z ##[debug]Agent environment resources - Disk: / Available 54649.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 10.12%
2026-09-10T00:52:49.2270432Z ##[debug]Agent environment resources - Disk: / Available 54649.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 9.50%
2026-09-10T00:52:54.2274879Z ##[debug]Agent environment resources - Disk: / Available 54649.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 8.96%
2026-09-10T00:52:59.2285300Z ##[debug]Agent environment resources - Disk: / Available 54648.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 8.49%
2026-09-10T00:53:04.2285702Z ##[debug]Agent environment resources - Disk: / Available 54640.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 8.09%
2026-09-10T00:53:09.2289272Z ##[debug]Agent environment resources - Disk: / Available 54640.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.69%
2026-09-10T00:53:14.2296486Z ##[debug]Agent environment resources - Disk: / Available 54641.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.33%
2026-09-10T00:53:19.2291473Z ##[debug]Agent environment resources - Disk: / Available 54641.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.02%
2026-09-10T00:53:24.2301765Z ##[debug]Agent environment resources - Disk: / Available 54641.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.73%
2026-09-10T00:53:29.2314142Z ##[debug]Agent environment resources - Disk: / Available 54641.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.46%
2026-09-10T00:53:34.2327236Z ##[debug]Agent environment resources - Disk: / Available 54641.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.22%
2026-09-10T00:53:39.2341674Z ##[debug]Agent environment resources - Disk: / Available 54641.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.99%
2026-09-10T00:53:44.2364999Z ##[debug]Agent environment resources - Disk: / Available 54641.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.77%
2026-09-10T00:53:49.2377671Z ##[debug]Agent environment resources - Disk: / Available 54641.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.57%
2026-09-10T00:53:54.2391906Z ##[debug]Agent environment resources - Disk: / Available 54641.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.39%
2026-09-10T00:53:59.2406258Z ##[debug]Agent environment resources - Disk: / Available 54641.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.22%
2026-09-10T00:54:04.2410982Z ##[debug]Agent environment resources - Disk: / Available 54641.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.06%
2026-09-10T00:54:09.2415634Z ##[debug]Agent environment resources - Disk: / Available 54641.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.91%
2026-09-10T00:54:14.2415672Z ##[debug]Agent environment resources - Disk: / Available 54632.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.77%
2026-09-10T00:54:19.2420198Z ##[debug]Agent environment resources - Disk: / Available 54633.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.63%
2026-09-10T00:54:24.2430859Z ##[debug]Agent environment resources - Disk: / Available 54633.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.50%
2026-09-10T00:54:29.2436362Z ##[debug]Agent environment resources - Disk: / Available 54633.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.39%
2026-09-10T00:54:34.2437486Z ##[debug]Agent environment resources - Disk: / Available 54633.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.27%
2026-09-10T00:54:39.2445696Z ##[debug]Agent environment resources - Disk: / Available 54633.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.17%
2026-09-10T00:54:44.2444745Z ##[debug]Agent environment resources - Disk: / Available 54633.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.06%
2026-09-10T00:54:49.2452491Z ##[debug]Agent environment resources - Disk: / Available 54633.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.97%
2026-09-10T00:54:54.2461922Z ##[debug]Agent environment resources - Disk: / Available 54633.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.88%
2026-09-10T00:54:59.2473382Z ##[debug]Agent environment resources - Disk: / Available 54636.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.79%
2026-09-10T00:55:04.2482908Z ##[debug]Agent environment resources - Disk: / Available 54628.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.71%
2026-09-10T00:55:09.2497415Z ##[debug]Agent environment resources - Disk: / Available 54628.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.63%
2026-09-10T00:55:14.2511166Z ##[debug]Agent environment resources - Disk: / Available 54629.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.55%
2026-09-10T00:55:19.2523461Z ##[debug]Agent environment resources - Disk: / Available 54628.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.48%
2026-09-10T00:55:24.2527966Z ##[debug]Agent environment resources - Disk: / Available 54628.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.41%
2026-09-10T00:55:29.2537948Z ##[debug]Agent environment resources - Disk: / Available 54628.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.34%
2026-09-10T00:55:34.2555449Z ##[debug]Agent environment resources - Disk: / Available 54620.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.28%
2026-09-10T00:55:39.2555669Z ##[debug]Agent environment resources - Disk: / Available 54619.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.22%
2026-09-10T00:55:44.2559148Z ##[debug]Agent environment resources - Disk: / Available 54618.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.16%
2026-09-10T00:55:49.2572359Z ##[debug]Agent environment resources - Disk: / Available 54618.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.10%
2026-09-10T00:55:54.2588185Z ##[debug]Agent environment resources - Disk: / Available 54619.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.05%
2026-09-10T00:55:59.2596689Z ##[debug]Agent environment resources - Disk: / Available 54619.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.00%
2026-09-10T00:56:04.2603348Z ##[debug]Agent environment resources - Disk: / Available 54619.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.94%
2026-09-10T00:56:09.2601586Z ##[debug]Agent environment resources - Disk: / Available 54618.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.89%
2026-09-10T00:56:14.2609571Z ##[debug]Agent environment resources - Disk: / Available 54618.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.85%
2026-09-10T00:56:19.2626806Z ##[debug]Agent environment resources - Disk: / Available 54619.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.80%
2026-09-10T00:56:24.2631209Z ##[debug]Agent environment resources - Disk: / Available 54619.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.76%
2026-09-10T00:56:29.2643489Z ##[debug]Agent environment resources - Disk: / Available 54620.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.72%
2026-09-10T00:56:34.2658468Z ##[debug]Agent environment resources - Disk: / Available 54619.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.67%
2026-09-10T00:56:39.2672283Z ##[debug]Agent environment resources - Disk: / Available 54619.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.63%
2026-09-10T00:56:44.2680918Z ##[debug]Agent environment resources - Disk: / Available 54620.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.59%
2026-09-10T00:56:49.2691392Z ##[debug]Agent environment resources - Disk: / Available 54620.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.56%
2026-09-10T00:56:54.2697152Z ##[debug]Agent environment resources - Disk: / Available 54611.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.52%
2026-09-10T00:56:59.2707713Z ##[debug]Agent environment resources - Disk: / Available 54612.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.48%
2026-09-10T00:57:04.2716960Z ##[debug]Agent environment resources - Disk: / Available 54612.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.45%
2026-09-10T00:57:09.2732321Z ##[debug]Agent environment resources - Disk: / Available 54611.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.42%
2026-09-10T00:57:14.2743322Z ##[debug]Agent environment resources - Disk: / Available 54612.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.39%
2026-09-10T00:57:19.2751500Z ##[debug]Agent environment resources - Disk: / Available 54612.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.35%
2026-09-10T00:57:24.2757408Z ##[debug]Agent environment resources - Disk: / Available 54612.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.32%
2026-09-10T00:57:29.2768554Z ##[debug]Agent environment resources - Disk: / Available 54612.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.30%
2026-09-10T00:57:34.2769581Z ##[debug]Agent environment resources - Disk: / Available 54612.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.27%
2026-09-10T00:57:39.2775423Z ##[debug]Agent environment resources - Disk: / Available 54612.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.24%
2026-09-10T00:57:44.2779313Z ##[debug]Agent environment resources - Disk: / Available 54612.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.21%
2026-09-10T00:57:49.2794410Z ##[debug]Agent environment resources - Disk: / Available 54612.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.18%
2026-09-10T00:57:54.2798651Z ##[debug]Agent environment resources - Disk: / Available 54612.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.16%
2026-09-10T00:57:59.2824616Z ##[debug]Agent environment resources - Disk: / Available 54612.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.13%
2026-09-10T00:58:04.2833854Z ##[debug]Agent environment resources - Disk: / Available 54612.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.11%
2026-09-10T00:58:09.2842397Z ##[debug]Agent environment resources - Disk: / Available 54612.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.09%
2026-09-10T00:58:09.6676061Z ##[debug]Started cancellation of executing script
2026-09-10T00:58:09.6683681Z ##[debug]Exit code null received from tool '/usr/bin/bash'
2026-09-10T00:58:17.1739768Z ##[error]The task has timed out.
2026-09-10T00:58:17.1741358Z ##[section]Finishing: Verificando Status do Deployment


2026-09-10T00:58:17.1761080Z ##[debug]Evaluating condition for step: 'Logs da Aplicação'
2026-09-10T00:58:17.1761849Z ##[debug]Evaluating: always()
2026-09-10T00:58:17.1762010Z ##[debug]Evaluating always:
2026-09-10T00:58:17.1762831Z ##[debug]=> True
2026-09-10T00:58:17.1763040Z ##[debug]Result: True
2026-09-10T00:58:17.1763217Z ##[section]Starting: Logs da Aplicação
2026-09-10T00:58:17.1766536Z ==============================================================================
2026-09-10T00:58:17.1766629Z Task         : Bash
2026-09-10T00:58:17.1766672Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-10T00:58:17.1766732Z Version      : 3.227.0
2026-09-10T00:58:17.1766798Z Author       : Microsoft Corporation
2026-09-10T00:58:17.1766846Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-10T00:58:17.1766918Z ==============================================================================
2026-09-10T00:58:17.2340581Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-10T00:58:17.3011862Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-10T00:58:17.3019335Z ##[debug]loading inputs and endpoints
2026-09-10T00:58:17.3026740Z ##[debug]loading INPUT_TARGETTYPE
2026-09-10T00:58:17.3033450Z ##[debug]loading INPUT_FILEPATH
2026-09-10T00:58:17.3034220Z ##[debug]loading INPUT_SCRIPT
2026-09-10T00:58:17.3035014Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-10T00:58:17.3035685Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-10T00:58:17.3036921Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-10T00:58:17.3037523Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-10T00:58:17.3039784Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-10T00:58:17.3044515Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-10T00:58:17.3045906Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-10T00:58:17.3047470Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-10T00:58:17.3049818Z ##[debug]loading SECRET_PW_ALOCAIP
2026-09-10T00:58:17.3050706Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-10T00:58:17.3052175Z ##[debug]loading SECRET_AZPAT
2026-09-10T00:58:17.3052652Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-10T00:58:17.3053325Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-10T00:58:17.3053863Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-10T00:58:17.3054445Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-09-10T00:58:17.3055033Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-10T00:58:17.3055574Z ##[debug]loading SECRET_PW_ISILON
2026-09-10T00:58:17.3057058Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-10T00:58:17.3057540Z ##[debug]loaded 21
2026-09-10T00:58:17.3062249Z ##[debug]Agent.ProxyUrl=undefined
2026-09-10T00:58:17.3062641Z ##[debug]Agent.CAInfo=undefined
2026-09-10T00:58:17.3063000Z ##[debug]Agent.ClientCert=undefined
2026-09-10T00:58:17.3063378Z ##[debug]Agent.SkipCertValidation=True
2026-09-10T00:58:17.3077471Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-10T00:58:17.3079166Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-10T00:58:17.3079482Z ##[debug]system.culture=en-US
2026-09-10T00:58:17.3086722Z ##[debug]failOnStderr=false
2026-09-10T00:58:17.3087685Z ##[debug]workingDirectory=/opt/ads-agent/_work/r882/a
2026-09-10T00:58:17.3087929Z ##[debug]check path : /opt/ads-agent/_work/r882/a
2026-09-10T00:58:17.3089581Z ##[debug]targetType=inline
2026-09-10T00:58:17.3089902Z ##[debug]bashEnvValue=undefined
2026-09-10T00:58:17.3090458Z ##[debug]script=#!/bin/bash
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
2026-09-10T00:58:17.3098787Z Generating script.
2026-09-10T00:58:17.3100532Z ##[debug]which 'bash'
2026-09-10T00:58:17.3105647Z ##[debug]found: '/usr/bin/bash'
2026-09-10T00:58:17.3106032Z ##[debug]Agent.Version=3.236.1
2026-09-10T00:58:17.3106421Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-10T00:58:17.3106815Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-10T00:58:17.3109062Z ========================== Starting Command Output ===========================
2026-09-10T00:58:17.3110004Z ##[debug]which '/usr/bin/bash'
2026-09-10T00:58:17.3110882Z ##[debug]found: '/usr/bin/bash'
2026-09-10T00:58:17.3111592Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/4a455778-523a-4cd0-a6bf-c0e581b65430.sh
2026-09-10T00:58:17.3113879Z ##[debug]exec tool: /usr/bin/bash
2026-09-10T00:58:17.3114239Z ##[debug]arguments:
2026-09-10T00:58:17.3114614Z ##[debug]   /opt/ads-agent/_work/_temp/4a455778-523a-4cd0-a6bf-c0e581b65430.sh
2026-09-10T00:58:17.3115778Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/4a455778-523a-4cd0-a6bf-c0e581b65430.sh
2026-09-10T00:58:17.3178552Z + shopt -s expand_aliases
2026-09-10T00:58:17.3178740Z + [[ -n okd4_nprd ]]
2026-09-10T00:58:17.3179910Z + [[ okd4_nprd =~ ocp ]]
2026-09-10T00:58:17.3181587Z + [[ -n okd4_nprd ]]
2026-09-10T00:58:17.3182990Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-09-10T00:58:17.3184412Z + app=sihdg-jboss8-des
2026-09-10T00:58:17.3185802Z + oc version
2026-09-10T00:58:17.3899296Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-09-10T00:58:17.3899603Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-09-10T00:58:17.3899834Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-09-10T00:58:17.3927556Z ++ oc get pod -l name=sihdg-jboss8-des -n sihdg-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-10T00:58:17.3928747Z ++ tac
2026-09-10T00:58:17.3928927Z ++ grep -v '^$'
2026-09-10T00:58:17.3930574Z ++ head -n1
2026-09-10T00:58:17.4868171Z + last_pod=sihdg-jboss8-des-92-qgbjt
2026-09-10T00:58:17.4868437Z + echo 'Logs do POD: sihdg-jboss8-des-92-qgbjt'
2026-09-10T00:58:17.4868693Z + oc logs sihdg-jboss8-des-92-qgbjt -c sihdg-jboss8-des -n sihdg-des
2026-09-10T00:58:17.4868893Z Logs do POD: sihdg-jboss8-des-92-qgbjt
2026-09-10T00:58:17.5730186Z Using openshift launcher.
2026-09-10T00:58:17.5730657Z 2026-09-10 00:57:02 Launching WildFly Server
2026-09-10T00:58:17.5730843Z INFO Access log is disabled, ignoring configuration.
2026-09-10T00:58:17.5731103Z INFO Clustering feature is not enabled, no jgroups subsystem present in server configuration.
2026-09-10T00:58:17.5731275Z INFO Server started in admin mode, CLI script executed during server boot.
2026-09-10T00:58:17.5731523Z INFO Running jboss-eap-8/eap8-openjdk21-builder-openshift-rhel9 image, version 1.0.1.GA
2026-09-10T00:58:17.5732260Z JAVA_OPTS already set in environment; overriding default settings with values:  -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider -Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks  -Djava.security.properties=/opt/server/bin/java.security.override
2026-09-10T00:58:17.5733031Z =========================================================================
2026-09-10T00:58:17.5733206Z 
2026-09-10T00:58:17.5733315Z   JBoss Bootstrap Environment
2026-09-10T00:58:17.5733361Z 
2026-09-10T00:58:17.5733453Z   JBOSS_HOME: /opt/server
2026-09-10T00:58:17.5733496Z 
2026-09-10T00:58:17.5733663Z   JAVA: /usr/lib/jvm/java-21/bin/java
2026-09-10T00:58:17.5733715Z 
2026-09-10T00:58:17.5735286Z   JAVA_OPTS:  -Xlog:gc*:file="/opt/server/standalone/log/gc.log":time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter="maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000"  -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider -Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks  -Djava.security.properties=/opt/server/bin/java.security.override  --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-exports=jdk.naming.dns/com.sun.jndi.dns=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED
2026-09-10T00:58:17.5736282Z 
2026-09-10T00:58:17.5736412Z =========================================================================
2026-09-10T00:58:17.5736478Z 
2026-09-10T00:58:17.5736693Z [0m21:57:03,793 INFO  [org.jboss.modules] (main) JBoss Modules version 2.1.6.Final-redhat-00001
2026-09-10T00:58:17.5736933Z [0m[0m21:57:04,516 INFO  [org.jboss.msc] (main) JBoss MSC version 1.5.5.Final-redhat-00001
2026-09-10T00:58:17.5737174Z [0m[0m21:57:04,521 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
2026-09-10T00:58:17.5737594Z [0m[0m21:57:04,692 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) starting
2026-09-10T00:58:17.5737886Z [0m[32m21:57:04,693 DEBUG [org.jboss.as.config] (MSC service thread 1-2) Configured system properties:
2026-09-10T00:58:17.5738041Z 	[Standalone] = 
2026-09-10T00:58:17.5738159Z 	file.encoding = UTF-8
2026-09-10T00:58:17.5738255Z 	file.separator = /
2026-09-10T00:58:17.5738682Z 	java.class.path = /opt/server/jboss-modules.jar
2026-09-10T00:58:17.5738846Z 	java.class.version = 65.0
2026-09-10T00:58:17.5739035Z 	java.home = /usr/lib/jvm/java-21-openjdk-21.0.10.0.7-1.el9.x86_64
2026-09-10T00:58:17.5739155Z 	java.io.tmpdir = /tmp
2026-09-10T00:58:17.5739287Z 	java.library.path = /usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib
2026-09-10T00:58:17.5739417Z 	java.net.preferIPv4Stack = true
2026-09-10T00:58:17.5739550Z 	java.runtime.name = OpenJDK Runtime Environment
2026-09-10T00:58:17.5739666Z 	java.runtime.version = 21.0.10+7-LTS
2026-09-10T00:58:17.5739799Z 	java.security.egd = file:/dev/./urandom
2026-09-10T00:58:17.5739935Z 	java.security.properties = /opt/server/bin/java.security.override
2026-09-10T00:58:17.5740088Z 	java.specification.name = Java Platform API Specification
2026-09-10T00:58:17.5740214Z 	java.specification.vendor = Oracle Corporation
2026-09-10T00:58:17.5740332Z 	java.specification.version = 21
2026-09-10T00:58:17.5740458Z 	java.util.logging.manager = org.jboss.logmanager.LogManager
2026-09-10T00:58:17.5740655Z 	java.vendor = Red Hat, Inc.
2026-09-10T00:58:17.5740782Z 	java.vendor.url = https://www.redhat.com/
2026-09-10T00:58:17.5740907Z 	java.vendor.url.bug = https://access.redhat.com/support/cases/
2026-09-10T00:58:17.5741126Z 	java.vendor.version = (Red_Hat-21.0.10.0.7-1)
2026-09-10T00:58:17.5741241Z 	java.version = 21.0.10
2026-09-10T00:58:17.5741390Z 	java.version.date = 2026-01-20
2026-09-10T00:58:17.5741520Z 	java.vm.compressedOopsMode = 32-bit
2026-09-10T00:58:17.5741630Z 	java.vm.info = mixed mode, sharing
2026-09-10T00:58:17.5741790Z 	java.vm.name = OpenJDK 64-Bit Server VM
2026-09-10T00:58:17.5741974Z 	java.vm.specification.name = Java Virtual Machine Specification
2026-09-10T00:58:17.5742126Z 	java.vm.specification.vendor = Oracle Corporation
2026-09-10T00:58:17.5742244Z 	java.vm.specification.version = 21
2026-09-10T00:58:17.5742355Z 	java.vm.vendor = Red Hat, Inc.
2026-09-10T00:58:17.5742485Z 	java.vm.version = 21.0.10+7-LTS
2026-09-10T00:58:17.5742623Z 	javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
2026-09-10T00:58:17.5742860Z 	javax.net.ssl.trustStore = /opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks
2026-09-10T00:58:17.5743004Z 	jboss.bind.address = 25.2.32.33
2026-09-10T00:58:17.5743119Z 	jboss.bind.address.management = 0.0.0.0
2026-09-10T00:58:17.5743254Z 	jboss.bind.address.private = 25.2.32.33
2026-09-10T00:58:17.5743378Z 	jboss.home.dir = /opt/server
2026-09-10T00:58:17.5743532Z 	jboss.host.name = sihdg-jboss8-des-92-qgbjt
2026-09-10T00:58:17.5743657Z 	jboss.messaging.cluster.password = <redacted>
2026-09-10T00:58:17.5743792Z 	jboss.messaging.host = 25.2.32.33
2026-09-10T00:58:17.5743932Z 	jboss.modules.system.pkgs = jdk.nashorn.api,com.sun.crypto.provider
2026-09-10T00:58:17.5744107Z 	jboss.node.name = sihdg-jboss8-des-92-qgbjt
2026-09-10T00:58:17.5744285Z 	jboss.qualified.host.name = sihdg-jboss8-des-92-qgbjt
2026-09-10T00:58:17.5744416Z 	jboss.server.base.dir = /opt/server/standalone
2026-09-10T00:58:17.5744562Z 	jboss.server.config.dir = /opt/server/standalone/configuration
2026-09-10T00:58:17.5744690Z 	jboss.server.data.dir = /opt/server/standalone/data
2026-09-10T00:58:17.5744834Z 	jboss.server.log.dir = /opt/server/standalone/log
2026-09-10T00:58:17.5745004Z 	jboss.server.name = sihdg-jboss8-des-92-qgbjt
2026-09-10T00:58:17.5745137Z 	jboss.server.persist.config = true
2026-09-10T00:58:17.5745250Z 	jboss.server.temp.dir = /opt/server/standalone/tmp
2026-09-10T00:58:17.5745430Z 	jboss.tx.node.id = hdg-jboss8-des-92-qgbjt
2026-09-10T00:58:17.5745539Z 	jdk.debug = release
2026-09-10T00:58:17.5745671Z 	jdk.serialFilter = maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
2026-09-10T00:58:17.5745793Z 	line.separator = 
2026-09-10T00:58:17.5745839Z 
2026-09-10T00:58:17.5745976Z 	logging.configuration = file:/opt/server/standalone/configuration/logging.properties
2026-09-10T00:58:17.5746106Z 	module.path = /opt/server/modules
2026-09-10T00:58:17.5746312Z 	native.encoding = ANSI_X3.4-1968
2026-09-10T00:58:17.5746455Z 	org.jboss.boot.log.file = /opt/server/standalone/log/server.log
2026-09-10T00:58:17.5746593Z 	org.jboss.resolver.warning = true
2026-09-10T00:58:17.5746789Z 	org.wildfly.internal.cli.boot.hook.marker.dir = /tmp/cli-boot-reload-marker-1789001822
2026-09-10T00:58:17.5747009Z 	org.wildfly.internal.cli.boot.hook.script = /tmp/cli-script-1789001822.cli
2026-09-10T00:58:17.5747308Z 	org.wildfly.internal.cli.boot.hook.script.error.file = /tmp/cli-script-error-1789001822.cli
2026-09-10T00:58:17.5747562Z 	org.wildfly.internal.cli.boot.hook.script.output.file = /tmp/cli-script-output-1789001822.cli
2026-09-10T00:58:17.5747801Z 	org.wildfly.internal.cli.boot.hook.script.properties = /tmp/cli-script-property-1789001822.cli
2026-09-10T00:58:17.5748024Z 	org.wildfly.internal.cli.boot.hook.script.warn.file = /tmp/cli-warning-1789001822.log
2026-09-10T00:58:17.5748167Z 	os.arch = amd64
2026-09-10T00:58:17.5748278Z 	os.name = Linux
2026-09-10T00:58:17.5748429Z 	os.version = 6.1.18-200.fc37.x86_64
2026-09-10T00:58:17.5748573Z 	path.separator = :
2026-09-10T00:58:17.5748712Z 	stderr.encoding = ANSI_X3.4-1968
2026-09-10T00:58:17.5748843Z 	stdout.encoding = ANSI_X3.4-1968
2026-09-10T00:58:17.5748952Z 	sun.arch.data.model = 64
2026-09-10T00:58:17.5749163Z 	sun.boot.library.path = /usr/lib/jvm/java-21-openjdk-21.0.10.0.7-1.el9.x86_64/lib
2026-09-10T00:58:17.5749297Z 	sun.cpu.endian = little
2026-09-10T00:58:17.5749424Z 	sun.io.unicode.encoding = UnicodeLittle
2026-09-10T00:58:17.5750491Z 	sun.java.command = /opt/server/jboss-modules.jar -mp /opt/server/modules org.jboss.as.standalone -Djboss.home.dir=/opt/server -Djboss.server.base.dir=/opt/server/standalone -c standalone.xml -Djboss.messaging.host=25.2.32.33 -Djboss.messaging.cluster.password=<redacted> --start-mode=admin-only -Dorg.wildfly.internal.cli.boot.hook.script=/tmp/cli-script-1789001822.cli -Dorg.wildfly.internal.cli.boot.hook.marker.dir=/tmp/cli-boot-reload-marker-1789001822 -Dorg.wildfly.internal.cli.boot.hook.script.properties=/tmp/cli-script-property-1789001822.cli -Dorg.wildfly.internal.cli.boot.hook.script.error.file=/tmp/cli-script-error-1789001822.cli -Dorg.wildfly.internal.cli.boot.hook.script.warn.file=/tmp/cli-warning-1789001822.log -Dorg.wildfly.internal.cli.boot.hook.script.output.file=/tmp/cli-script-output-1789001822.cli -Djboss.node.name=sihdg-jboss8-des-92-qgbjt -Djboss.tx.node.id=hdg-jboss8-des-92-qgbjt -bprivate 25.2.32.33 -b 25.2.32.33 -bmanagement 0.0.0.0 -Dwildfly.statistics-enabled=true
2026-09-10T00:58:17.5751069Z 	sun.java.launcher = SUN_STANDARD
2026-09-10T00:58:17.5751214Z 	sun.jnu.encoding = ANSI_X3.4-1968
2026-09-10T00:58:17.5751404Z 	sun.management.compiler = HotSpot 64-Bit Tiered Compilers
2026-09-10T00:58:17.5751516Z 	user.country = US
2026-09-10T00:58:17.5751613Z 	user.dir = /home/jboss
2026-09-10T00:58:17.5751712Z 	user.home = /home/jboss
2026-09-10T00:58:17.5751821Z 	user.language = en
2026-09-10T00:58:17.5751910Z 	user.name = jboss
2026-09-10T00:58:17.5752026Z 	user.timezone = America/Sao_Paulo
2026-09-10T00:58:17.5752179Z 	wildfly.statistics-enabled = true
2026-09-10T00:58:17.5753922Z [0m[32m21:57:04,694 DEBUG [org.jboss.as.config] (MSC service thread 1-2) VM Arguments: -D[Standalone] -Xlog:gc*:file=/opt/server/standalone/log/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider -Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djava.security.properties=/opt/server/bin/java.security.override --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-exports=jdk.naming.dns/com.sun.jndi.dns=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/opt/server/standalone/log/server.log -Dlogging.configuration=file:/opt/server/standalone/configuration/logging.properties 
2026-09-10T00:58:17.5755057Z [0m[0m21:57:05,818 INFO  [org.wildfly.security] (ServerService Thread Pool -- 16) ELY00001: WildFly Elytron version 2.2.14.Final-redhat-00001
2026-09-10T00:58:17.5755372Z [0m[0m21:57:06,922 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
2026-09-10T00:58:17.5755688Z [0m[0m21:57:06,988 INFO  [org.xnio] (MSC service thread 1-2) XNIO version 3.8.16.Final-redhat-00001
2026-09-10T00:58:17.5755958Z [0m[0m21:57:06,992 INFO  [org.xnio.nio] (MSC service thread 1-2) XNIO NIO Implementation Version 3.8.16.Final-redhat-00001
2026-09-10T00:58:17.5756245Z [0m[0m21:57:07,095 INFO  [org.jboss.remoting] (MSC service thread 1-1) JBoss Remoting version 5.0.31.Final-redhat-00001
2026-09-10T00:58:17.5756598Z [0m[33m21:57:07,095 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY00023: KeyStore file '/opt/server/standalone/configuration/application.keystore' does not exist. Used blank.
2026-09-10T00:58:17.5757061Z [0m[33m21:57:07,101 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY01084: KeyStore /opt/server/standalone/configuration/application.keystore not found, it will be auto-generated on first use with a self-signed certificate for host localhost
2026-09-10T00:58:17.5757476Z [0m[0m21:57:07,415 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
2026-09-10T00:58:17.5757813Z [0m[0m21:57:07,417 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://0.0.0.0:9990/management
2026-09-10T00:58:17.5758095Z [0m[0m21:57:07,417 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0054: Admin console is not enabled
2026-09-10T00:58:17.5758514Z [0m[0m21:57:07,417 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) started in 4104ms - Started 72 of 84 services (26 services are lazy, passive or on-demand) - Server configuration file in use: standalone.xml
2026-09-10T00:58:17.5758967Z [0m[0m21:57:07,418 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0472: Checking for presence of marker file indicating that the server has been restarted following execution of the additional commands from the CLI script
2026-09-10T00:58:17.5759398Z [0m[0m21:57:07,418 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0474: No marker file found indicating that the server has been restarted following execution of the additional commands from the CLI script
2026-09-10T00:58:17.5759943Z [0m[0m21:57:07,418 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0466: Initialised the additional boot CLI script functionality. The CLI commands will be read from /tmp/cli-script-1789001822.cli. The server will be rebooted to normal mode after these have been executed
2026-09-10T00:58:17.5760391Z [0m[0m21:57:07,429 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0467: Running the additional commands from the CLI script /tmp/cli-script-1789001822.cli against the server which is running in admin-only mode
2026-09-10T00:58:17.5760737Z [0m[0m21:57:07,430 INFO  [org.jboss.as.cli] (Controller Boot Thread) WFLYCLI0001: Processing CLI script /tmp/cli-script-1789001822.cli
2026-09-10T00:58:17.5761050Z [0m[0m21:57:07,885 INFO  [org.jboss.as.cli] (Controller Boot Thread) WFLYCLI0005: Done processing CLI script /tmp/cli-script-1789001822.cli
2026-09-10T00:58:17.5761359Z [0m[0m21:57:07,885 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0468: Completed running the commands from the CLI script
2026-09-10T00:58:17.5761959Z [0m[0m21:57:07,885 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0470: Reloading the server to normal mode after execution of the additional commands from the CLI script. This will clear the properties triggering the additional boot cli script functionality if they were set (org.wildfly.internal.cli.boot.hook.script, org.wildfly.internal.cli.boot.hook.reload.skip, org.wildfly.internal.cli.boot.hook.marker.dir), and delete the marker file indicating the server was restarted
2026-09-10T00:58:17.5762453Z [0m[0m21:57:07,898 INFO  [org.jboss.as] (MSC service thread 1-1) WFLYSRV0050: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) stopped in 10ms
2026-09-10T00:58:17.5762806Z [0m[0m21:57:07,899 INFO  [org.jboss.as] (MSC service thread 1-1) WFLYSRV0049: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) starting
2026-09-10T00:58:17.5763092Z [0m[32m21:57:07,899 DEBUG [org.jboss.as.config] (MSC service thread 1-1) Configured system properties:
2026-09-10T00:58:17.5763230Z 	[Standalone] = 
2026-09-10T00:58:17.5763402Z 	br.gov.caixa.sisgr.auth.url = https://webservice.acessoseguro.des.corerj.caixa/sisgrauth-web/
2026-09-10T00:58:17.5763540Z 	file.encoding = UTF-8
2026-09-10T00:58:17.5763666Z 	file.separator = /
2026-09-10T00:58:17.5763843Z 	java.class.path = /opt/server/jboss-modules.jar
2026-09-10T00:58:17.5763964Z 	java.class.version = 65.0
2026-09-10T00:58:17.5764162Z 	java.home = /usr/lib/jvm/java-21-openjdk-21.0.10.0.7-1.el9.x86_64
2026-09-10T00:58:17.5764282Z 	java.io.tmpdir = /tmp
2026-09-10T00:58:17.5764426Z 	java.library.path = /usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib
2026-09-10T00:58:17.5764563Z 	java.net.preferIPv4Stack = true
2026-09-10T00:58:17.5764697Z 	java.runtime.name = OpenJDK Runtime Environment
2026-09-10T00:58:17.5764812Z 	java.runtime.version = 21.0.10+7-LTS
2026-09-10T00:58:17.5764931Z 	java.security.egd = file:/dev/./urandom
2026-09-10T00:58:17.5765188Z 	java.security.properties = /opt/server/bin/java.security.override
2026-09-10T00:58:17.5765342Z 	java.specification.name = Java Platform API Specification
2026-09-10T00:58:17.5765468Z 	java.specification.vendor = Oracle Corporation
2026-09-10T00:58:17.5765602Z 	java.specification.version = 21
2026-09-10T00:58:17.5765746Z 	java.util.logging.manager = org.jboss.logmanager.LogManager
2026-09-10T00:58:17.5765872Z 	java.vendor = Red Hat, Inc.
2026-09-10T00:58:17.5766000Z 	java.vendor.url = https://www.redhat.com/
2026-09-10T00:58:17.5766121Z 	java.vendor.url.bug = https://access.redhat.com/support/cases/
2026-09-10T00:58:17.5766330Z 	java.vendor.version = (Red_Hat-21.0.10.0.7-1)
2026-09-10T00:58:17.5766448Z 	java.version = 21.0.10
2026-09-10T00:58:17.5766599Z 	java.version.date = 2026-01-20
2026-09-10T00:58:17.5766707Z 	java.vm.compressedOopsMode = 32-bit
2026-09-10T00:58:17.5766836Z 	java.vm.info = mixed mode, sharing
2026-09-10T00:58:17.5767007Z 	java.vm.name = OpenJDK 64-Bit Server VM
2026-09-10T00:58:17.5767139Z 	java.vm.specification.name = Java Virtual Machine Specification
2026-09-10T00:58:17.5767390Z 	java.vm.specification.vendor = Oracle Corporation
2026-09-10T00:58:17.5767543Z 	java.vm.specification.version = 21
2026-09-10T00:58:17.5767659Z 	java.vm.vendor = Red Hat, Inc.
2026-09-10T00:58:17.5767770Z 	java.vm.version = 21.0.10+7-LTS
2026-09-10T00:58:17.5767901Z 	javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
2026-09-10T00:58:17.5768163Z 	javax.net.ssl.trustStore = /opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks
2026-09-10T00:58:17.5768309Z 	jboss.bind.address = 25.2.32.33
2026-09-10T00:58:17.5768442Z 	jboss.bind.address.management = 0.0.0.0
2026-09-10T00:58:17.5768571Z 	jboss.bind.address.private = 25.2.32.33
2026-09-10T00:58:17.5768705Z 	jboss.home.dir = /opt/server
2026-09-10T00:58:17.5768868Z 	jboss.host.name = sihdg-jboss8-des-92-qgbjt
2026-09-10T00:58:17.5768998Z 	jboss.messaging.cluster.password = <redacted>
2026-09-10T00:58:17.5769112Z 	jboss.messaging.host = 25.2.32.33
2026-09-10T00:58:17.5769239Z 	jboss.modules.system.pkgs = jdk.nashorn.api,com.sun.crypto.provider
2026-09-10T00:58:17.5769433Z 	jboss.node.name = sihdg-jboss8-des-92-qgbjt
2026-09-10T00:58:17.5769627Z 	jboss.qualified.host.name = sihdg-jboss8-des-92-qgbjt
2026-09-10T00:58:17.5769762Z 	jboss.server.base.dir = /opt/server/standalone
2026-09-10T00:58:17.5769883Z 	jboss.server.config.dir = /opt/server/standalone/configuration
2026-09-10T00:58:17.5770031Z 	jboss.server.data.dir = /opt/server/standalone/data
2026-09-10T00:58:17.5770173Z 	jboss.server.log.dir = /opt/server/standalone/log
2026-09-10T00:58:17.5770345Z 	jboss.server.name = sihdg-jboss8-des-92-qgbjt
2026-09-10T00:58:17.5770504Z 	jboss.server.persist.config = true
2026-09-10T00:58:17.5770622Z 	jboss.server.temp.dir = /opt/server/standalone/tmp
2026-09-10T00:58:17.5770790Z 	jboss.tx.node.id = hdg-jboss8-des-92-qgbjt
2026-09-10T00:58:17.5770914Z 	jdk.debug = release
2026-09-10T00:58:17.5771040Z 	jdk.serialFilter = maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
2026-09-10T00:58:17.5771169Z 	line.separator = 
2026-09-10T00:58:17.5771209Z 
2026-09-10T00:58:17.5771346Z 	logging.configuration = file:/opt/server/standalone/configuration/logging.properties
2026-09-10T00:58:17.5771497Z 	module.path = /opt/server/modules
2026-09-10T00:58:17.5771669Z 	native.encoding = ANSI_X3.4-1968
2026-09-10T00:58:17.5771809Z 	org.jboss.boot.log.file = /opt/server/standalone/log/server.log
2026-09-10T00:58:17.5771928Z 	org.jboss.resolver.warning = true
2026-09-10T00:58:17.5772132Z 	org.wildfly.internal.cli.boot.hook.script.error.file = /tmp/cli-script-error-1789001822.cli
2026-09-10T00:58:17.5772380Z 	org.wildfly.internal.cli.boot.hook.script.output.file = /tmp/cli-script-output-1789001822.cli
2026-09-10T00:58:17.5772618Z 	org.wildfly.internal.cli.boot.hook.script.properties = /tmp/cli-script-property-1789001822.cli
2026-09-10T00:58:17.5772842Z 	org.wildfly.internal.cli.boot.hook.script.warn.file = /tmp/cli-warning-1789001822.log
2026-09-10T00:58:17.5772987Z 	os.arch = amd64
2026-09-10T00:58:17.5773096Z 	os.name = Linux
2026-09-10T00:58:17.5773246Z 	os.version = 6.1.18-200.fc37.x86_64
2026-09-10T00:58:17.5773348Z 	path.separator = :
2026-09-10T00:58:17.5773494Z 	siaud.INT_URL_API_MANAGER = http://des.web.corerj.caixa:8642/
2026-09-10T00:58:17.5773645Z 	siaud.int.siico.api.key = l75b3690bee55a4994a4efb88fe248b4d9
2026-09-10T00:58:17.5773791Z 	siaud.int.url.api.manager = http://api.des.caixa:8080/
2026-09-10T00:58:17.5773935Z 	siaud.int.url.legado = https://des.web.corerj.caixa:8605/siaud/
2026-09-10T00:58:17.5774085Z 	stderr.encoding = ANSI_X3.4-1968
2026-09-10T00:58:17.5774229Z 	stdout.encoding = ANSI_X3.4-1968
2026-09-10T00:58:17.5774352Z 	sun.arch.data.model = 64
2026-09-10T00:58:17.5774553Z 	sun.boot.library.path = /usr/lib/jvm/java-21-openjdk-21.0.10.0.7-1.el9.x86_64/lib
2026-09-10T00:58:17.5774679Z 	sun.cpu.endian = little
2026-09-10T00:58:17.5774801Z 	sun.io.unicode.encoding = UnicodeLittle
2026-09-10T00:58:17.5775854Z 	sun.java.command = /opt/server/jboss-modules.jar -mp /opt/server/modules org.jboss.as.standalone -Djboss.home.dir=/opt/server -Djboss.server.base.dir=/opt/server/standalone -c standalone.xml -Djboss.messaging.host=25.2.32.33 -Djboss.messaging.cluster.password=<redacted> --start-mode=admin-only -Dorg.wildfly.internal.cli.boot.hook.script=/tmp/cli-script-1789001822.cli -Dorg.wildfly.internal.cli.boot.hook.marker.dir=/tmp/cli-boot-reload-marker-1789001822 -Dorg.wildfly.internal.cli.boot.hook.script.properties=/tmp/cli-script-property-1789001822.cli -Dorg.wildfly.internal.cli.boot.hook.script.error.file=/tmp/cli-script-error-1789001822.cli -Dorg.wildfly.internal.cli.boot.hook.script.warn.file=/tmp/cli-warning-1789001822.log -Dorg.wildfly.internal.cli.boot.hook.script.output.file=/tmp/cli-script-output-1789001822.cli -Djboss.node.name=sihdg-jboss8-des-92-qgbjt -Djboss.tx.node.id=hdg-jboss8-des-92-qgbjt -bprivate 25.2.32.33 -b 25.2.32.33 -bmanagement 0.0.0.0 -Dwildfly.statistics-enabled=true
2026-09-10T00:58:17.5776411Z 	sun.java.launcher = SUN_STANDARD
2026-09-10T00:58:17.5776548Z 	sun.jnu.encoding = ANSI_X3.4-1968
2026-09-10T00:58:17.5776735Z 	sun.management.compiler = HotSpot 64-Bit Tiered Compilers
2026-09-10T00:58:17.5776853Z 	sun.nio.ch.bugLevel = 
2026-09-10T00:58:17.5776959Z 	url_key_cloack = https://login.des.caixa/auth
2026-09-10T00:58:17.5777093Z 	url_key_cloack_realm = intranet
2026-09-10T00:58:17.5777614Z 	url_siaud_acompanhamento = http://localhost:8888/siaud/siaud-acompanhamento-service
2026-09-10T00:58:17.5777858Z 	url_siaud_acompanhamentoweb = http://localhost:8888/siaud/acompanhamento
2026-09-10T00:58:17.5778024Z 	url_siaud_execucao = http://localhost:8898/siaud
2026-09-10T00:58:17.5778186Z 	url_siaud_planejamento = http://localhost:8898/siaud
2026-09-10T00:58:17.5778380Z 	url_siico = http://des.web.corerj.caixa:8642/siicorjapi/v1/
2026-09-10T00:58:17.5778674Z 	url_sisgr = https://webservice.acessoseguro.sso.des.intra.corerj.caixa/sisgrauth-web/v1/
2026-09-10T00:58:17.5778813Z 	user.country = US
2026-09-10T00:58:17.5778914Z 	user.dir = /home/jboss
2026-09-10T00:58:17.5779031Z 	user.home = /home/jboss
2026-09-10T00:58:17.5779145Z 	user.language = en
2026-09-10T00:58:17.5779237Z 	user.name = jboss
2026-09-10T00:58:17.5779340Z 	user.timezone = America/Sao_Paulo
2026-09-10T00:58:17.5779512Z 	wildfly.statistics-enabled = true
2026-09-10T00:58:17.5781305Z [0m[32m21:57:07,900 DEBUG [org.jboss.as.config] (MSC service thread 1-1) VM Arguments: -D[Standalone] -Xlog:gc*:file=/opt/server/standalone/log/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider -Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djava.security.properties=/opt/server/bin/java.security.override --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-exports=jdk.naming.dns/com.sun.jndi.dns=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/opt/server/standalone/log/server.log -Dlogging.configuration=file:/opt/server/standalone/configuration/logging.properties 
2026-09-10T00:58:17.5782541Z [0m[0m21:57:08,489 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 12) WFLYDR0001: Content added at location /opt/server/standalone/data/content/c8/b554a65c45f878c06c43148ab58dcef4977f29/content
2026-09-10T00:58:17.5782899Z [0m[0m21:57:08,502 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
2026-09-10T00:58:17.5783224Z [0m[0m21:57:08,513 INFO  [org.wildfly.extension.elytron.oidc._private] (ServerService Thread Pool -- 32) WFLYOIDC0001: Activating WildFly Elytron OIDC Subsystem
2026-09-10T00:58:17.5783539Z [0m[0m21:57:08,513 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 34) WFLYCLINF0001: Activating Infinispan subsystem.
2026-09-10T00:58:17.5783830Z [0m[0m21:57:08,595 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 40) WFLYNAM0001: Activating Naming Subsystem
2026-09-10T00:58:17.5784137Z [0m[0m21:57:08,595 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 36) WFLYRS0016: RESTEasy version 6.2.15.Final-redhat-00002
2026-09-10T00:58:17.5784450Z [0m[0m21:57:08,595 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 33) WFLYHEALTH0001: Activating Base Health Subsystem
2026-09-10T00:58:17.5784811Z [0m[0m21:57:08,595 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 35) WFLYIO001: Worker 'default' has auto-configured to 2 IO threads with 16 max task threads based on your 1 available processors
2026-09-10T00:58:17.5785186Z [0m[0m21:57:08,709 INFO  [org.jboss.as.connector] (MSC service thread 1-2) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 3.0.14.Final-redhat-00001)
2026-09-10T00:58:17.5785755Z [0m[0m21:57:08,710 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 44) WFLYUT0112: The value 'require-host-http11' attribute in the '/subsystem=undertow/server=default-server/http-listener=default' resource is 'false', which will be ignored. The server now always enforces the RFC 9112 requirement that HTTP/1.1 request messages include a Host header.
2026-09-10T00:58:17.5786166Z [0m[0m21:57:08,786 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0003: Undertow 2.3.23.SP3-redhat-00001 starting
2026-09-10T00:58:17.5786502Z [0m[0m21:57:08,818 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Starting deployment of "sihdg-3.13.0.4.ear" (runtime-name: "sihdg-3.13.0.4.ear")
2026-09-10T00:58:17.5786898Z [0m[33m21:57:08,986 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY00023: KeyStore file '/opt/server/standalone/configuration/application.keystore' does not exist. Used blank.
2026-09-10T00:58:17.5787217Z [0m[0m21:57:08,995 INFO  [org.jboss.as.naming] (MSC service thread 1-2) WFLYNAM0003: Starting Naming Service
2026-09-10T00:58:17.5787646Z [0m[0m21:57:09,086 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 16 (per class), which is derived from thread worker pool sizing.
2026-09-10T00:58:17.5788107Z [0m[33m21:57:09,089 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY01084: KeyStore /opt/server/standalone/configuration/application.keystore not found, it will be auto-generated on first use with a self-signed certificate for host localhost
2026-09-10T00:58:17.5788485Z [0m[0m21:57:09,091 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0012: Started server default-server.
2026-09-10T00:58:17.5788741Z [0m[0m21:57:09,093 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) Queuing requests.
2026-09-10T00:58:17.5789008Z [0m[0m21:57:09,093 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0018: Host default-host starting
2026-09-10T00:58:17.5789323Z [0m[0m21:57:09,101 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0006: Undertow HTTP listener default listening on 0.0.0.0:8080
2026-09-10T00:58:17.5789724Z [0m[0m21:57:09,189 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 27) WFLYJCA0004: Deploying JDBC-compliant driver class com.microsoft.sqlserver.jdbc.SQLServerDriver (version 12.6)
2026-09-10T00:58:17.5790069Z [0m[0m21:57:09,296 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Started Driver service with driver-name = sqlserver
2026-09-10T00:58:17.5790417Z [0m[0m21:57:09,306 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-1) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/server/standalone/deployments
2026-09-10T00:58:17.5790748Z [0m[0m21:57:09,407 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0493: Jakarta Enterprise Beans subsystem suspension complete
2026-09-10T00:58:17.5791085Z [0m[0m21:57:09,507 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) WFLYJCA0001: Bound data source [java:jboss/jdbc/sihdgDS]
2026-09-10T00:58:17.5791406Z [0m[0m21:57:10,003 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0207: Starting subdeployment (runtime-name: "sihdg-api.war")
2026-09-10T00:58:17.5791846Z [0m[33m21:57:15,723 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0001: /content/sihdg-3.13.0.4.ear/sihdg-api.war/WEB-INF/jboss-deployment-structure.xml in subdeployment ignored. jboss-deployment-structure.xml is only parsed for top level deployments.
2026-09-10T00:58:17.5792187Z [0m[0m21:57:16,395 INFO  [org.jboss.as.jpa] (MSC service thread 1-2) WFLYJPA0002: Read persistence.xml for sihdgDS
2026-09-10T00:58:17.5792520Z [0m[0m21:57:16,398 INFO  [org.wildfly.extension.elytron.oidc._private] (MSC service thread 1-2) WFLYOIDC0002: Elytron OIDC Client subsystem override for deployment 'sihdg-api.war'
2026-09-10T00:58:17.5792905Z [0m[0m21:57:16,800 INFO  [org.jipijapa] (MSC service thread 1-1) JIPIORMV6020260: Second level cache enabled for sihdg-3.13.0.4.ear/sihdg-api.war#sihdgDS
2026-09-10T00:58:17.5793205Z [0m[0m21:57:16,899 INFO  [org.jboss.weld.deployer] (MSC service thread 1-2) WFLYWELD0003: Processing weld deployment sihdg-3.13.0.4.ear
2026-09-10T00:58:17.5793531Z [0m[0m21:57:17,219 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-2) HV000001: Hibernate Validator 8.0.2.Final-redhat-00001
2026-09-10T00:58:17.5793903Z [0m[0m21:57:17,687 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 46) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.marshalling.jboss.JBossMarshaller'
2026-09-10T00:58:17.5794250Z [0m[0m21:57:17,811 INFO  [org.jboss.weld.deployer] (MSC service thread 1-2) WFLYWELD0003: Processing weld deployment sihdg-api.war
2026-09-10T00:58:17.5794650Z [0m[0m21:57:17,985 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'GestaoCargaFcAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5794797Z 
2026-09-10T00:58:17.5795011Z 	java:global/sihdg-3.13.0.4/sihdg-api/GestaoCargaFcAS!br.gov.caixa.bsb.sihdg.core.service.GestaoCargaFcAS
2026-09-10T00:58:17.5795271Z 	java:app/sihdg-api/GestaoCargaFcAS!br.gov.caixa.bsb.sihdg.core.service.GestaoCargaFcAS
2026-09-10T00:58:17.5795436Z 	java:module/GestaoCargaFcAS!br.gov.caixa.bsb.sihdg.core.service.GestaoCargaFcAS
2026-09-10T00:58:17.5795638Z 	java:global/sihdg-3.13.0.4/sihdg-api/GestaoCargaFcAS
2026-09-10T00:58:17.5795824Z 	java:app/sihdg-api/GestaoCargaFcAS
2026-09-10T00:58:17.5795957Z 	java:module/GestaoCargaFcAS
2026-09-10T00:58:17.5796004Z 
2026-09-10T00:58:17.5796371Z [0m[0m21:57:17,985 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoItemDerivativoFcAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5796525Z 
2026-09-10T00:58:17.5796772Z 	java:global/sihdg-3.13.0.4/sihdg-api/MovimentacaoItemDerivativoFcAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoItemDerivativoFcAS
2026-09-10T00:58:17.5797056Z 	java:app/sihdg-api/MovimentacaoItemDerivativoFcAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoItemDerivativoFcAS
2026-09-10T00:58:17.5797309Z 	java:module/MovimentacaoItemDerivativoFcAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoItemDerivativoFcAS
2026-09-10T00:58:17.5797551Z 	java:global/sihdg-3.13.0.4/sihdg-api/MovimentacaoItemDerivativoFcAS
2026-09-10T00:58:17.5797757Z 	java:app/sihdg-api/MovimentacaoItemDerivativoFcAS
2026-09-10T00:58:17.5797895Z 	java:module/MovimentacaoItemDerivativoFcAS
2026-09-10T00:58:17.5797948Z 
2026-09-10T00:58:17.5798284Z [0m[0m21:57:17,985 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'CtcfAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5798425Z 
2026-09-10T00:58:17.5798772Z 	java:global/sihdg-3.13.0.4/sihdg-api/CtcfAS!br.gov.caixa.bsb.sihdg.core.service.CtcfAS
2026-09-10T00:58:17.5798989Z 	java:app/sihdg-api/CtcfAS!br.gov.caixa.bsb.sihdg.core.service.CtcfAS
2026-09-10T00:58:17.5799157Z 	java:module/CtcfAS!br.gov.caixa.bsb.sihdg.core.service.CtcfAS
2026-09-10T00:58:17.5799352Z 	java:global/sihdg-3.13.0.4/sihdg-api/CtcfAS
2026-09-10T00:58:17.5799502Z 	java:app/sihdg-api/CtcfAS
2026-09-10T00:58:17.5799611Z 	java:module/CtcfAS
2026-09-10T00:58:17.5799654Z 
2026-09-10T00:58:17.5799992Z [0m[0m21:57:17,985 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'RelatorioAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5800150Z 
2026-09-10T00:58:17.5800376Z 	java:global/sihdg-3.13.0.4/sihdg-api/RelatorioAS!br.gov.caixa.bsb.sihdg.core.service.RelatorioAS
2026-09-10T00:58:17.5800609Z 	java:app/sihdg-api/RelatorioAS!br.gov.caixa.bsb.sihdg.core.service.RelatorioAS
2026-09-10T00:58:17.5800837Z 	java:module/RelatorioAS!br.gov.caixa.bsb.sihdg.core.service.RelatorioAS
2026-09-10T00:58:17.5801054Z 	java:global/sihdg-3.13.0.4/sihdg-api/RelatorioAS
2026-09-10T00:58:17.5801213Z 	java:app/sihdg-api/RelatorioAS
2026-09-10T00:58:17.5801340Z 	java:module/RelatorioAS
2026-09-10T00:58:17.5801392Z 
2026-09-10T00:58:17.5801728Z [0m[0m21:57:17,986 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoTransacaoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5801934Z 
2026-09-10T00:58:17.5802152Z 	java:global/sihdg-3.13.0.4/sihdg-api/MovimentacaoTransacaoAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoTransacaoAS
2026-09-10T00:58:17.5802424Z 	java:app/sihdg-api/MovimentacaoTransacaoAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoTransacaoAS
2026-09-10T00:58:17.5802624Z 	java:module/MovimentacaoTransacaoAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoTransacaoAS
2026-09-10T00:58:17.5802841Z 	java:global/sihdg-3.13.0.4/sihdg-api/MovimentacaoTransacaoAS
2026-09-10T00:58:17.5803038Z 	java:app/sihdg-api/MovimentacaoTransacaoAS
2026-09-10T00:58:17.5803157Z 	java:module/MovimentacaoTransacaoAS
2026-09-10T00:58:17.5803217Z 
2026-09-10T00:58:17.5803534Z [0m[0m21:57:17,986 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'SafraFcAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5803697Z 
2026-09-10T00:58:17.5803907Z 	java:global/sihdg-3.13.0.4/sihdg-api/SafraFcAS!br.gov.caixa.bsb.sihdg.core.service.SafraFcAS
2026-09-10T00:58:17.5804127Z 	java:app/sihdg-api/SafraFcAS!br.gov.caixa.bsb.sihdg.core.service.SafraFcAS
2026-09-10T00:58:17.5804289Z 	java:module/SafraFcAS!br.gov.caixa.bsb.sihdg.core.service.SafraFcAS
2026-09-10T00:58:17.5804492Z 	java:global/sihdg-3.13.0.4/sihdg-api/SafraFcAS
2026-09-10T00:58:17.5804662Z 	java:app/sihdg-api/SafraFcAS
2026-09-10T00:58:17.5804765Z 	java:module/SafraFcAS
2026-09-10T00:58:17.5804830Z 
2026-09-10T00:58:17.5805150Z [0m[0m21:57:17,986 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'DerivativoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5805295Z 
2026-09-10T00:58:17.5805507Z 	java:global/sihdg-3.13.0.4/sihdg-api/DerivativoAS!br.gov.caixa.bsb.sihdg.core.service.DerivativoAS
2026-09-10T00:58:17.5805736Z 	java:app/sihdg-api/DerivativoAS!br.gov.caixa.bsb.sihdg.core.service.DerivativoAS
2026-09-10T00:58:17.5805912Z 	java:module/DerivativoAS!br.gov.caixa.bsb.sihdg.core.service.DerivativoAS
2026-09-10T00:58:17.5806105Z 	java:global/sihdg-3.13.0.4/sihdg-api/DerivativoAS
2026-09-10T00:58:17.5806285Z 	java:app/sihdg-api/DerivativoAS
2026-09-10T00:58:17.5806400Z 	java:module/DerivativoAS
2026-09-10T00:58:17.5806446Z 
2026-09-10T00:58:17.5806798Z [0m[0m21:57:17,986 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoTransacaoFcAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5806948Z 
2026-09-10T00:58:17.5807171Z 	java:global/sihdg-3.13.0.4/sihdg-api/MovimentacaoTransacaoFcAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoTransacaoFcAS
2026-09-10T00:58:17.5807560Z 	java:app/sihdg-api/MovimentacaoTransacaoFcAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoTransacaoFcAS
2026-09-10T00:58:17.5807750Z 	java:module/MovimentacaoTransacaoFcAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoTransacaoFcAS
2026-09-10T00:58:17.5807988Z 	java:global/sihdg-3.13.0.4/sihdg-api/MovimentacaoTransacaoFcAS
2026-09-10T00:58:17.5808207Z 	java:app/sihdg-api/MovimentacaoTransacaoFcAS
2026-09-10T00:58:17.5808338Z 	java:module/MovimentacaoTransacaoFcAS
2026-09-10T00:58:17.5808390Z 
2026-09-10T00:58:17.5808737Z [0m[0m21:57:17,986 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'LogImportacaoSiapcAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5808883Z 
2026-09-10T00:58:17.5809167Z 	java:global/sihdg-3.13.0.4/sihdg-api/LogImportacaoSiapcAS!br.gov.caixa.bsb.sihdg.core.service.LogImportacaoSiapcAS
2026-09-10T00:58:17.5809465Z 	java:app/sihdg-api/LogImportacaoSiapcAS!br.gov.caixa.bsb.sihdg.core.service.LogImportacaoSiapcAS
2026-09-10T00:58:17.5809655Z 	java:module/LogImportacaoSiapcAS!br.gov.caixa.bsb.sihdg.core.service.LogImportacaoSiapcAS
2026-09-10T00:58:17.5809857Z 	java:global/sihdg-3.13.0.4/sihdg-api/LogImportacaoSiapcAS
2026-09-10T00:58:17.5810048Z 	java:app/sihdg-api/LogImportacaoSiapcAS
2026-09-10T00:58:17.5810169Z 	java:module/LogImportacaoSiapcAS
2026-09-10T00:58:17.5810218Z 
2026-09-10T00:58:17.5810541Z [0m[0m21:57:17,986 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PerfilAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5810680Z 
2026-09-10T00:58:17.5810894Z 	java:global/sihdg-3.13.0.4/sihdg-api/PerfilAS!br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS
2026-09-10T00:58:17.5811146Z 	java:app/sihdg-api/PerfilAS!br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS
2026-09-10T00:58:17.5811312Z 	java:module/PerfilAS!br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS
2026-09-10T00:58:17.5811516Z 	java:global/sihdg-3.13.0.4/sihdg-api/PerfilAS
2026-09-10T00:58:17.5811667Z 	java:app/sihdg-api/PerfilAS
2026-09-10T00:58:17.5811775Z 	java:module/PerfilAS
2026-09-10T00:58:17.5811818Z 
2026-09-10T00:58:17.5812145Z [0m[0m21:57:17,986 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ItemDerivativoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5812311Z 
2026-09-10T00:58:17.5812510Z 	java:global/sihdg-3.13.0.4/sihdg-api/ItemDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoAS
2026-09-10T00:58:17.5812754Z 	java:app/sihdg-api/ItemDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoAS
2026-09-10T00:58:17.5812935Z 	java:module/ItemDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoAS
2026-09-10T00:58:17.5813135Z 	java:global/sihdg-3.13.0.4/sihdg-api/ItemDerivativoAS
2026-09-10T00:58:17.5813298Z 	java:app/sihdg-api/ItemDerivativoAS
2026-09-10T00:58:17.5813429Z 	java:module/ItemDerivativoAS
2026-09-10T00:58:17.5813475Z 
2026-09-10T00:58:17.5813797Z [0m[0m21:57:17,986 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TabelasAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5813959Z 
2026-09-10T00:58:17.5814145Z 	java:global/sihdg-3.13.0.4/sihdg-api/TabelasAS!br.gov.caixa.bsb.sihdg.core.service.TabelasAS
2026-09-10T00:58:17.5814386Z 	java:app/sihdg-api/TabelasAS!br.gov.caixa.bsb.sihdg.core.service.TabelasAS
2026-09-10T00:58:17.5814544Z 	java:module/TabelasAS!br.gov.caixa.bsb.sihdg.core.service.TabelasAS
2026-09-10T00:58:17.5814732Z 	java:global/sihdg-3.13.0.4/sihdg-api/TabelasAS
2026-09-10T00:58:17.5814883Z 	java:app/sihdg-api/TabelasAS
2026-09-10T00:58:17.5814993Z 	java:module/TabelasAS
2026-09-10T00:58:17.5815056Z 
2026-09-10T00:58:17.5815367Z [0m[0m21:57:17,986 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'SafraAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5815508Z 
2026-09-10T00:58:17.5815719Z 	java:global/sihdg-3.13.0.4/sihdg-api/SafraAS!br.gov.caixa.bsb.sihdg.core.service.SafraAS
2026-09-10T00:58:17.5815944Z 	java:app/sihdg-api/SafraAS!br.gov.caixa.bsb.sihdg.core.service.SafraAS
2026-09-10T00:58:17.5816109Z 	java:module/SafraAS!br.gov.caixa.bsb.sihdg.core.service.SafraAS
2026-09-10T00:58:17.5816292Z 	java:global/sihdg-3.13.0.4/sihdg-api/SafraAS
2026-09-10T00:58:17.5816445Z 	java:app/sihdg-api/SafraAS
2026-09-10T00:58:17.5816547Z 	java:module/SafraAS
2026-09-10T00:58:17.5816597Z 
2026-09-10T00:58:17.5816926Z [0m[0m21:57:17,986 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ContratoDesignadoPrograma1AS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5817156Z 
2026-09-10T00:58:17.5817468Z 	java:global/sihdg-3.13.0.4/sihdg-api/ContratoDesignadoPrograma1AS!br.gov.caixa.bsb.sihdg.core.service.ContratoDesignadoPrograma1AS
2026-09-10T00:58:17.5817752Z 	java:app/sihdg-api/ContratoDesignadoPrograma1AS!br.gov.caixa.bsb.sihdg.core.service.ContratoDesignadoPrograma1AS
2026-09-10T00:58:17.5817949Z 	java:module/ContratoDesignadoPrograma1AS!br.gov.caixa.bsb.sihdg.core.service.ContratoDesignadoPrograma1AS
2026-09-10T00:58:17.5818174Z 	java:global/sihdg-3.13.0.4/sihdg-api/ContratoDesignadoPrograma1AS
2026-09-10T00:58:17.5818359Z 	java:app/sihdg-api/ContratoDesignadoPrograma1AS
2026-09-10T00:58:17.5818501Z 	java:module/ContratoDesignadoPrograma1AS
2026-09-10T00:58:17.5818556Z 
2026-09-10T00:58:17.5818882Z [0m[0m21:57:17,986 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ParametroEventoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5819026Z 
2026-09-10T00:58:17.5819298Z 	java:global/sihdg-3.13.0.4/sihdg-api/ParametroEventoAS!br.gov.caixa.bsb.sihdg.core.service.ParametroEventoAS
2026-09-10T00:58:17.5819567Z 	java:app/sihdg-api/ParametroEventoAS!br.gov.caixa.bsb.sihdg.core.service.ParametroEventoAS
2026-09-10T00:58:17.5819731Z 	java:module/ParametroEventoAS!br.gov.caixa.bsb.sihdg.core.service.ParametroEventoAS
2026-09-10T00:58:17.5819931Z 	java:global/sihdg-3.13.0.4/sihdg-api/ParametroEventoAS
2026-09-10T00:58:17.5820113Z 	java:app/sihdg-api/ParametroEventoAS
2026-09-10T00:58:17.5820233Z 	java:module/ParametroEventoAS
2026-09-10T00:58:17.5820280Z 
2026-09-10T00:58:17.5820607Z [0m[0m21:57:17,986 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'HistoricoCargaAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5820746Z 
2026-09-10T00:58:17.5820951Z 	java:global/sihdg-3.13.0.4/sihdg-api/HistoricoCargaAS!br.gov.caixa.bsb.sihdg.core.service.HistoricoCargaAS
2026-09-10T00:58:17.5821209Z 	java:app/sihdg-api/HistoricoCargaAS!br.gov.caixa.bsb.sihdg.core.service.HistoricoCargaAS
2026-09-10T00:58:17.5821373Z 	java:module/HistoricoCargaAS!br.gov.caixa.bsb.sihdg.core.service.HistoricoCargaAS
2026-09-10T00:58:17.5821588Z 	java:global/sihdg-3.13.0.4/sihdg-api/HistoricoCargaAS
2026-09-10T00:58:17.5821757Z 	java:app/sihdg-api/HistoricoCargaAS
2026-09-10T00:58:17.5821890Z 	java:module/HistoricoCargaAS
2026-09-10T00:58:17.5821937Z 
2026-09-10T00:58:17.5822253Z [0m[0m21:57:17,986 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ProgramaAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5822392Z 
2026-09-10T00:58:17.5822600Z 	java:global/sihdg-3.13.0.4/sihdg-api/ProgramaAS!br.gov.caixa.bsb.sihdg.core.service.ProgramaAS
2026-09-10T00:58:17.5822825Z 	java:app/sihdg-api/ProgramaAS!br.gov.caixa.bsb.sihdg.core.service.ProgramaAS
2026-09-10T00:58:17.5822997Z 	java:module/ProgramaAS!br.gov.caixa.bsb.sihdg.core.service.ProgramaAS
2026-09-10T00:58:17.5823178Z 	java:global/sihdg-3.13.0.4/sihdg-api/ProgramaAS
2026-09-10T00:58:17.5823377Z 	java:app/sihdg-api/ProgramaAS
2026-09-10T00:58:17.5823490Z 	java:module/ProgramaAS
2026-09-10T00:58:17.5823535Z 
2026-09-10T00:58:17.5823879Z [0m[0m21:57:17,986 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'CtcfHabitacaoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5824019Z 
2026-09-10T00:58:17.5824225Z 	java:global/sihdg-3.13.0.4/sihdg-api/CtcfHabitacaoAS!br.gov.caixa.bsb.sihdg.core.service.CtcfHabitacaoAS
2026-09-10T00:58:17.5824511Z 	java:app/sihdg-api/CtcfHabitacaoAS!br.gov.caixa.bsb.sihdg.core.service.CtcfHabitacaoAS
2026-09-10T00:58:17.5824694Z 	java:module/CtcfHabitacaoAS!br.gov.caixa.bsb.sihdg.core.service.CtcfHabitacaoAS
2026-09-10T00:58:17.5824885Z 	java:global/sihdg-3.13.0.4/sihdg-api/CtcfHabitacaoAS
2026-09-10T00:58:17.5825068Z 	java:app/sihdg-api/CtcfHabitacaoAS
2026-09-10T00:58:17.5825187Z 	java:module/CtcfHabitacaoAS
2026-09-10T00:58:17.5825234Z 
2026-09-10T00:58:17.5825589Z [0m[0m21:57:17,987 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'VencimentoItemDerivativoTask' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5825734Z 
2026-09-10T00:58:17.5825970Z 	java:global/sihdg-3.13.0.4/sihdg-api/VencimentoItemDerivativoTask!br.gov.caixa.bsb.sihdg.core.service.jobs.VencimentoItemDerivativoTask
2026-09-10T00:58:17.5826254Z 	java:app/sihdg-api/VencimentoItemDerivativoTask!br.gov.caixa.bsb.sihdg.core.service.jobs.VencimentoItemDerivativoTask
2026-09-10T00:58:17.5826455Z 	java:module/VencimentoItemDerivativoTask!br.gov.caixa.bsb.sihdg.core.service.jobs.VencimentoItemDerivativoTask
2026-09-10T00:58:17.5826692Z 	java:global/sihdg-3.13.0.4/sihdg-api/VencimentoItemDerivativoTask
2026-09-10T00:58:17.5826873Z 	java:app/sihdg-api/VencimentoItemDerivativoTask
2026-09-10T00:58:17.5827006Z 	java:module/VencimentoItemDerivativoTask
2026-09-10T00:58:17.5827078Z 
2026-09-10T00:58:17.5827466Z [0m[0m21:57:17,987 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ProcessarStatusDerivativoTask' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5827635Z 
2026-09-10T00:58:17.5827871Z 	java:global/sihdg-3.13.0.4/sihdg-api/ProcessarStatusDerivativoTask!br.gov.caixa.bsb.sihdg.core.service.jobs.ProcessarStatusDerivativoTask
2026-09-10T00:58:17.5828162Z 	java:app/sihdg-api/ProcessarStatusDerivativoTask!br.gov.caixa.bsb.sihdg.core.service.jobs.ProcessarStatusDerivativoTask
2026-09-10T00:58:17.5828366Z 	java:module/ProcessarStatusDerivativoTask!br.gov.caixa.bsb.sihdg.core.service.jobs.ProcessarStatusDerivativoTask
2026-09-10T00:58:17.5828601Z 	java:global/sihdg-3.13.0.4/sihdg-api/ProcessarStatusDerivativoTask
2026-09-10T00:58:17.5828803Z 	java:app/sihdg-api/ProcessarStatusDerivativoTask
2026-09-10T00:58:17.5828930Z 	java:module/ProcessarStatusDerivativoTask
2026-09-10T00:58:17.5828990Z 
2026-09-10T00:58:17.5829317Z [0m[0m21:57:17,987 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'RegistroEfetividadeAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5829481Z 
2026-09-10T00:58:17.5829704Z 	java:global/sihdg-3.13.0.4/sihdg-api/RegistroEfetividadeAS!br.gov.caixa.bsb.sihdg.core.service.RegistroEfetividadeAS
2026-09-10T00:58:17.5829955Z 	java:app/sihdg-api/RegistroEfetividadeAS!br.gov.caixa.bsb.sihdg.core.service.RegistroEfetividadeAS
2026-09-10T00:58:17.5830135Z 	java:module/RegistroEfetividadeAS!br.gov.caixa.bsb.sihdg.core.service.RegistroEfetividadeAS
2026-09-10T00:58:17.5830358Z 	java:global/sihdg-3.13.0.4/sihdg-api/RegistroEfetividadeAS
2026-09-10T00:58:17.5830533Z 	java:app/sihdg-api/RegistroEfetividadeAS
2026-09-10T00:58:17.5830708Z 	java:module/RegistroEfetividadeAS
2026-09-10T00:58:17.5830758Z 
2026-09-10T00:58:17.5831091Z [0m[0m21:57:17,987 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'RegistroContabilidadeAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5831228Z 
2026-09-10T00:58:17.5831458Z 	java:global/sihdg-3.13.0.4/sihdg-api/RegistroContabilidadeAS!br.gov.caixa.bsb.sihdg.core.service.RegistroContabilidadeAS
2026-09-10T00:58:17.5831770Z 	java:app/sihdg-api/RegistroContabilidadeAS!br.gov.caixa.bsb.sihdg.core.service.RegistroContabilidadeAS
2026-09-10T00:58:17.5832002Z 	java:module/RegistroContabilidadeAS!br.gov.caixa.bsb.sihdg.core.service.RegistroContabilidadeAS
2026-09-10T00:58:17.5832221Z 	java:global/sihdg-3.13.0.4/sihdg-api/RegistroContabilidadeAS
2026-09-10T00:58:17.5832404Z 	java:app/sihdg-api/RegistroContabilidadeAS
2026-09-10T00:58:17.5832530Z 	java:module/RegistroContabilidadeAS
2026-09-10T00:58:17.5832583Z 
2026-09-10T00:58:17.5832941Z [0m[0m21:57:17,987 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'HistoricoContratoPrograma1AS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5833092Z 
2026-09-10T00:58:17.5833321Z 	java:global/sihdg-3.13.0.4/sihdg-api/HistoricoContratoPrograma1AS!br.gov.caixa.bsb.sihdg.core.service.HistoricoContratoPrograma1AS
2026-09-10T00:58:17.5833609Z 	java:app/sihdg-api/HistoricoContratoPrograma1AS!br.gov.caixa.bsb.sihdg.core.service.HistoricoContratoPrograma1AS
2026-09-10T00:58:17.5833818Z 	java:module/HistoricoContratoPrograma1AS!br.gov.caixa.bsb.sihdg.core.service.HistoricoContratoPrograma1AS
2026-09-10T00:58:17.5834035Z 	java:global/sihdg-3.13.0.4/sihdg-api/HistoricoContratoPrograma1AS
2026-09-10T00:58:17.5834222Z 	java:app/sihdg-api/HistoricoContratoPrograma1AS
2026-09-10T00:58:17.5834351Z 	java:module/HistoricoContratoPrograma1AS
2026-09-10T00:58:17.5834405Z 
2026-09-10T00:58:17.5834738Z [0m[0m21:57:17,987 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'HistoricoCargaFcAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5834897Z 
2026-09-10T00:58:17.5835101Z 	java:global/sihdg-3.13.0.4/sihdg-api/HistoricoCargaFcAS!br.gov.caixa.bsb.sihdg.core.service.HistoricoCargaFcAS
2026-09-10T00:58:17.5835355Z 	java:app/sihdg-api/HistoricoCargaFcAS!br.gov.caixa.bsb.sihdg.core.service.HistoricoCargaFcAS
2026-09-10T00:58:17.5835551Z 	java:module/HistoricoCargaFcAS!br.gov.caixa.bsb.sihdg.core.service.HistoricoCargaFcAS
2026-09-10T00:58:17.5835771Z 	java:global/sihdg-3.13.0.4/sihdg-api/HistoricoCargaFcAS
2026-09-10T00:58:17.5835939Z 	java:app/sihdg-api/HistoricoCargaFcAS
2026-09-10T00:58:17.5836063Z 	java:module/HistoricoCargaFcAS
2026-09-10T00:58:17.5836111Z 
2026-09-10T00:58:17.5836458Z [0m[0m21:57:17,987 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'AtualizacaoCurvaAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5836610Z 
2026-09-10T00:58:17.5836814Z 	java:global/sihdg-3.13.0.4/sihdg-api/AtualizacaoCurvaAS!br.gov.caixa.bsb.sihdg.core.service.AtualizacaoCurvaAS
2026-09-10T00:58:17.5837083Z 	java:app/sihdg-api/AtualizacaoCurvaAS!br.gov.caixa.bsb.sihdg.core.service.AtualizacaoCurvaAS
2026-09-10T00:58:17.5837404Z 	java:module/AtualizacaoCurvaAS!br.gov.caixa.bsb.sihdg.core.service.AtualizacaoCurvaAS
2026-09-10T00:58:17.5837650Z 	java:global/sihdg-3.13.0.4/sihdg-api/AtualizacaoCurvaAS
2026-09-10T00:58:17.5837837Z 	java:app/sihdg-api/AtualizacaoCurvaAS
2026-09-10T00:58:17.5837952Z 	java:module/AtualizacaoCurvaAS
2026-09-10T00:58:17.5838008Z 
2026-09-10T00:58:17.5838341Z [0m[0m21:57:17,987 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PerfilRecursoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5838541Z 
2026-09-10T00:58:17.5838778Z 	java:global/sihdg-3.13.0.4/sihdg-api/PerfilRecursoAS!br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS
2026-09-10T00:58:17.5839028Z 	java:app/sihdg-api/PerfilRecursoAS!br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS
2026-09-10T00:58:17.5839224Z 	java:module/PerfilRecursoAS!br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS
2026-09-10T00:58:17.5839426Z 	java:global/sihdg-3.13.0.4/sihdg-api/PerfilRecursoAS
2026-09-10T00:58:17.5839646Z 	java:app/sihdg-api/PerfilRecursoAS
2026-09-10T00:58:17.5839757Z 	java:module/PerfilRecursoAS
2026-09-10T00:58:17.5839825Z 
2026-09-10T00:58:17.5840150Z [0m[0m21:57:17,987 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ParametroChoqueAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5840303Z 
2026-09-10T00:58:17.5840508Z 	java:global/sihdg-3.13.0.4/sihdg-api/ParametroChoqueAS!br.gov.caixa.bsb.sihdg.core.service.ParametroChoqueAS
2026-09-10T00:58:17.5840751Z 	java:app/sihdg-api/ParametroChoqueAS!br.gov.caixa.bsb.sihdg.core.service.ParametroChoqueAS
2026-09-10T00:58:17.5840920Z 	java:module/ParametroChoqueAS!br.gov.caixa.bsb.sihdg.core.service.ParametroChoqueAS
2026-09-10T00:58:17.5841135Z 	java:global/sihdg-3.13.0.4/sihdg-api/ParametroChoqueAS
2026-09-10T00:58:17.5841304Z 	java:app/sihdg-api/ParametroChoqueAS
2026-09-10T00:58:17.5841439Z 	java:module/ParametroChoqueAS
2026-09-10T00:58:17.5841488Z 
2026-09-10T00:58:17.5841867Z [0m[0m21:57:17,987 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'SolicitacaoHabilitacaoDerivativoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5842021Z 
2026-09-10T00:58:17.5842263Z 	java:global/sihdg-3.13.0.4/sihdg-api/SolicitacaoHabilitacaoDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.SolicitacaoHabilitacaoDerivativoAS
2026-09-10T00:58:17.5842557Z 	java:app/sihdg-api/SolicitacaoHabilitacaoDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.SolicitacaoHabilitacaoDerivativoAS
2026-09-10T00:58:17.5842757Z 	java:module/SolicitacaoHabilitacaoDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.SolicitacaoHabilitacaoDerivativoAS
2026-09-10T00:58:17.5843062Z 	java:global/sihdg-3.13.0.4/sihdg-api/SolicitacaoHabilitacaoDerivativoAS
2026-09-10T00:58:17.5843328Z 	java:app/sihdg-api/SolicitacaoHabilitacaoDerivativoAS
2026-09-10T00:58:17.5843471Z 	java:module/SolicitacaoHabilitacaoDerivativoAS
2026-09-10T00:58:17.5843528Z 
2026-09-10T00:58:17.5843872Z [0m[0m21:57:17,987 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'AtualizadorCacheAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5844017Z 
2026-09-10T00:58:17.5844251Z 	java:global/sihdg-3.13.0.4/sihdg-api/AtualizadorCacheAS!br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS
2026-09-10T00:58:17.5844511Z 	java:app/sihdg-api/AtualizadorCacheAS!br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS
2026-09-10T00:58:17.5844694Z 	java:module/AtualizadorCacheAS!br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS
2026-09-10T00:58:17.5844892Z 	java:global/sihdg-3.13.0.4/sihdg-api/AtualizadorCacheAS
2026-09-10T00:58:17.5845217Z 	java:app/sihdg-api/AtualizadorCacheAS
2026-09-10T00:58:17.5845372Z 	java:module/AtualizadorCacheAS
2026-09-10T00:58:17.5845439Z 
2026-09-10T00:58:17.5845850Z [0m[0m21:57:17,987 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ExecucaoAtualizacaoDaCurvaAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5846061Z 
2026-09-10T00:58:17.5846289Z 	java:global/sihdg-3.13.0.4/sihdg-api/ExecucaoAtualizacaoDaCurvaAS!br.gov.caixa.bsb.sihdg.core.service.ExecucaoAtualizacaoDaCurvaAS
2026-09-10T00:58:17.5846586Z 	java:app/sihdg-api/ExecucaoAtualizacaoDaCurvaAS!br.gov.caixa.bsb.sihdg.core.service.ExecucaoAtualizacaoDaCurvaAS
2026-09-10T00:58:17.5846854Z 	java:module/ExecucaoAtualizacaoDaCurvaAS!br.gov.caixa.bsb.sihdg.core.service.ExecucaoAtualizacaoDaCurvaAS
2026-09-10T00:58:17.5847220Z 	java:global/sihdg-3.13.0.4/sihdg-api/ExecucaoAtualizacaoDaCurvaAS
2026-09-10T00:58:17.5847513Z 	java:app/sihdg-api/ExecucaoAtualizacaoDaCurvaAS
2026-09-10T00:58:17.5849875Z 	java:module/ExecucaoAtualizacaoDaCurvaAS
2026-09-10T00:58:17.5849938Z 
2026-09-10T00:58:17.5850277Z [0m[0m21:57:17,988 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ArquivoSinafAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5850455Z 
2026-09-10T00:58:17.5850655Z 	java:global/sihdg-3.13.0.4/sihdg-api/ArquivoSinafAS!br.gov.caixa.bsb.sihdg.core.service.ArquivoSinafAS
2026-09-10T00:58:17.5850915Z 	java:app/sihdg-api/ArquivoSinafAS!br.gov.caixa.bsb.sihdg.core.service.ArquivoSinafAS
2026-09-10T00:58:17.5851081Z 	java:module/ArquivoSinafAS!br.gov.caixa.bsb.sihdg.core.service.ArquivoSinafAS
2026-09-10T00:58:17.5851290Z 	java:global/sihdg-3.13.0.4/sihdg-api/ArquivoSinafAS
2026-09-10T00:58:17.5851462Z 	java:app/sihdg-api/ArquivoSinafAS
2026-09-10T00:58:17.5851571Z 	java:module/ArquivoSinafAS
2026-09-10T00:58:17.5851626Z 
2026-09-10T00:58:17.5851942Z [0m[0m21:57:17,988 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TaxaCdiAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5852177Z 
2026-09-10T00:58:17.5852413Z 	java:global/sihdg-3.13.0.4/sihdg-api/TaxaCdiAS!br.gov.caixa.bsb.sihdg.core.service.TaxaCdiAS
2026-09-10T00:58:17.5852635Z 	java:app/sihdg-api/TaxaCdiAS!br.gov.caixa.bsb.sihdg.core.service.TaxaCdiAS
2026-09-10T00:58:17.5852814Z 	java:module/TaxaCdiAS!br.gov.caixa.bsb.sihdg.core.service.TaxaCdiAS
2026-09-10T00:58:17.5853000Z 	java:global/sihdg-3.13.0.4/sihdg-api/TaxaCdiAS
2026-09-10T00:58:17.5853215Z 	java:app/sihdg-api/TaxaCdiAS
2026-09-10T00:58:17.5853323Z 	java:module/TaxaCdiAS
2026-09-10T00:58:17.5853389Z 
2026-09-10T00:58:17.5853714Z [0m[0m21:57:17,988 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'SecurityConfig' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5853855Z 
2026-09-10T00:58:17.5854085Z 	java:global/sihdg-3.13.0.4/sihdg-api/SecurityConfig!br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig
2026-09-10T00:58:17.5854359Z 	java:app/sihdg-api/SecurityConfig!br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig
2026-09-10T00:58:17.5854545Z 	java:module/SecurityConfig!br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig
2026-09-10T00:58:17.5854767Z 	java:global/sihdg-3.13.0.4/sihdg-api/SecurityConfig
2026-09-10T00:58:17.5854931Z 	java:app/sihdg-api/SecurityConfig
2026-09-10T00:58:17.5855061Z 	java:module/SecurityConfig
2026-09-10T00:58:17.5855106Z 
2026-09-10T00:58:17.5855445Z [0m[0m21:57:17,988 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TrilhaAuditoriaAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5855587Z 
2026-09-10T00:58:17.5855796Z 	java:global/sihdg-3.13.0.4/sihdg-api/TrilhaAuditoriaAS!br.gov.caixa.bsb.sihdg.core.service.TrilhaAuditoriaAS
2026-09-10T00:58:17.5856042Z 	java:app/sihdg-api/TrilhaAuditoriaAS!br.gov.caixa.bsb.sihdg.core.service.TrilhaAuditoriaAS
2026-09-10T00:58:17.5856209Z 	java:module/TrilhaAuditoriaAS!br.gov.caixa.bsb.sihdg.core.service.TrilhaAuditoriaAS
2026-09-10T00:58:17.5856498Z 	java:global/sihdg-3.13.0.4/sihdg-api/TrilhaAuditoriaAS
2026-09-10T00:58:17.5856684Z 	java:app/sihdg-api/TrilhaAuditoriaAS
2026-09-10T00:58:17.5856809Z 	java:module/TrilhaAuditoriaAS
2026-09-10T00:58:17.5856857Z 
2026-09-10T00:58:17.5857206Z [0m[0m21:57:17,988 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ProspectivaSolicitacaoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5857449Z 
2026-09-10T00:58:17.5857695Z 	java:global/sihdg-3.13.0.4/sihdg-api/ProspectivaSolicitacaoAS!br.gov.caixa.bsb.sihdg.core.service.ProspectivaSolicitacaoAS
2026-09-10T00:58:17.5857963Z 	java:app/sihdg-api/ProspectivaSolicitacaoAS!br.gov.caixa.bsb.sihdg.core.service.ProspectivaSolicitacaoAS
2026-09-10T00:58:17.5858150Z 	java:module/ProspectivaSolicitacaoAS!br.gov.caixa.bsb.sihdg.core.service.ProspectivaSolicitacaoAS
2026-09-10T00:58:17.5858357Z 	java:global/sihdg-3.13.0.4/sihdg-api/ProspectivaSolicitacaoAS
2026-09-10T00:58:17.5858556Z 	java:app/sihdg-api/ProspectivaSolicitacaoAS
2026-09-10T00:58:17.5858730Z 	java:module/ProspectivaSolicitacaoAS
2026-09-10T00:58:17.5858783Z 
2026-09-10T00:58:17.5859258Z [0m[0m21:57:17,988 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'AtualizacaoCurvaTask' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5859401Z 
2026-09-10T00:58:17.5859642Z 	java:global/sihdg-3.13.0.4/sihdg-api/AtualizacaoCurvaTask!br.gov.caixa.bsb.sihdg.core.service.jobs.AtualizacaoCurvaTask
2026-09-10T00:58:17.5859909Z 	java:app/sihdg-api/AtualizacaoCurvaTask!br.gov.caixa.bsb.sihdg.core.service.jobs.AtualizacaoCurvaTask
2026-09-10T00:58:17.5860161Z 	java:module/AtualizacaoCurvaTask!br.gov.caixa.bsb.sihdg.core.service.jobs.AtualizacaoCurvaTask
2026-09-10T00:58:17.5860477Z 	java:global/sihdg-3.13.0.4/sihdg-api/AtualizacaoCurvaTask
2026-09-10T00:58:17.5860730Z 	java:app/sihdg-api/AtualizacaoCurvaTask
2026-09-10T00:58:17.5860880Z 	java:module/AtualizacaoCurvaTask
2026-09-10T00:58:17.5860931Z 
2026-09-10T00:58:17.5861256Z [0m[0m21:57:17,988 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'CurvaAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5861411Z 
2026-09-10T00:58:17.5861595Z 	java:global/sihdg-3.13.0.4/sihdg-api/CurvaAS!br.gov.caixa.bsb.sihdg.core.service.CurvaAS
2026-09-10T00:58:17.5861817Z 	java:app/sihdg-api/CurvaAS!br.gov.caixa.bsb.sihdg.core.service.CurvaAS
2026-09-10T00:58:17.5861973Z 	java:module/CurvaAS!br.gov.caixa.bsb.sihdg.core.service.CurvaAS
2026-09-10T00:58:17.5862155Z 	java:global/sihdg-3.13.0.4/sihdg-api/CurvaAS
2026-09-10T00:58:17.5862306Z 	java:app/sihdg-api/CurvaAS
2026-09-10T00:58:17.5862423Z 	java:module/CurvaAS
2026-09-10T00:58:17.5862488Z 
2026-09-10T00:58:17.5862806Z [0m[0m21:57:17,988 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'CacheConfig' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5862949Z 
2026-09-10T00:58:17.5863161Z 	java:global/sihdg-3.13.0.4/sihdg-api/CacheConfig!br.gov.caixa.arquitetura.javaee.core.comum.config.cache.CacheConfig
2026-09-10T00:58:17.5863433Z 	java:app/sihdg-api/CacheConfig!br.gov.caixa.arquitetura.javaee.core.comum.config.cache.CacheConfig
2026-09-10T00:58:17.5863634Z 	java:module/CacheConfig!br.gov.caixa.arquitetura.javaee.core.comum.config.cache.CacheConfig
2026-09-10T00:58:17.5863834Z 	java:global/sihdg-3.13.0.4/sihdg-api/CacheConfig
2026-09-10T00:58:17.5863997Z 	java:app/sihdg-api/CacheConfig
2026-09-10T00:58:17.5864104Z 	java:module/CacheConfig
2026-09-10T00:58:17.5864156Z 
2026-09-10T00:58:17.5864474Z [0m[0m21:57:17,988 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'FluxoAlmSafraAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5864685Z 
2026-09-10T00:58:17.5864891Z 	java:global/sihdg-3.13.0.4/sihdg-api/FluxoAlmSafraAS!br.gov.caixa.bsb.sihdg.core.service.FluxoAlmSafraAS
2026-09-10T00:58:17.5865125Z 	java:app/sihdg-api/FluxoAlmSafraAS!br.gov.caixa.bsb.sihdg.core.service.FluxoAlmSafraAS
2026-09-10T00:58:17.5865308Z 	java:module/FluxoAlmSafraAS!br.gov.caixa.bsb.sihdg.core.service.FluxoAlmSafraAS
2026-09-10T00:58:17.5865557Z 	java:global/sihdg-3.13.0.4/sihdg-api/FluxoAlmSafraAS
2026-09-10T00:58:17.5865725Z 	java:app/sihdg-api/FluxoAlmSafraAS
2026-09-10T00:58:17.5865835Z 	java:module/FluxoAlmSafraAS
2026-09-10T00:58:17.5865901Z 
2026-09-10T00:58:17.5866222Z [0m[0m21:57:17,988 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ContratoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5866373Z 
2026-09-10T00:58:17.5866582Z 	java:global/sihdg-3.13.0.4/sihdg-api/ContratoAS!br.gov.caixa.bsb.sihdg.core.service.ContratoAS
2026-09-10T00:58:17.5866802Z 	java:app/sihdg-api/ContratoAS!br.gov.caixa.bsb.sihdg.core.service.ContratoAS
2026-09-10T00:58:17.5866965Z 	java:module/ContratoAS!br.gov.caixa.bsb.sihdg.core.service.ContratoAS
2026-09-10T00:58:17.5867170Z 	java:global/sihdg-3.13.0.4/sihdg-api/ContratoAS
2026-09-10T00:58:17.5867422Z 	java:app/sihdg-api/ContratoAS
2026-09-10T00:58:17.5867540Z 	java:module/ContratoAS
2026-09-10T00:58:17.5867586Z 
2026-09-10T00:58:17.5867929Z [0m[0m21:57:17,988 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoItemDerivativoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5868079Z 
2026-09-10T00:58:17.5868324Z 	java:global/sihdg-3.13.0.4/sihdg-api/MovimentacaoItemDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoItemDerivativoAS
2026-09-10T00:58:17.5868614Z 	java:app/sihdg-api/MovimentacaoItemDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoItemDerivativoAS
2026-09-10T00:58:17.5868797Z 	java:module/MovimentacaoItemDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoItemDerivativoAS
2026-09-10T00:58:17.5869022Z 	java:global/sihdg-3.13.0.4/sihdg-api/MovimentacaoItemDerivativoAS
2026-09-10T00:58:17.5869221Z 	java:app/sihdg-api/MovimentacaoItemDerivativoAS
2026-09-10T00:58:17.5869366Z 	java:module/MovimentacaoItemDerivativoAS
2026-09-10T00:58:17.5869419Z 
2026-09-10T00:58:17.5869743Z [0m[0m21:57:17,988 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'OrdemCompraAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5869881Z 
2026-09-10T00:58:17.5870081Z 	java:global/sihdg-3.13.0.4/sihdg-api/OrdemCompraAS!br.gov.caixa.bsb.sihdg.core.service.OrdemCompraAS
2026-09-10T00:58:17.5870315Z 	java:app/sihdg-api/OrdemCompraAS!br.gov.caixa.bsb.sihdg.core.service.OrdemCompraAS
2026-09-10T00:58:17.5870493Z 	java:module/OrdemCompraAS!br.gov.caixa.bsb.sihdg.core.service.OrdemCompraAS
2026-09-10T00:58:17.5870681Z 	java:global/sihdg-3.13.0.4/sihdg-api/OrdemCompraAS
2026-09-10T00:58:17.5870933Z 	java:app/sihdg-api/OrdemCompraAS
2026-09-10T00:58:17.5871102Z 	java:module/OrdemCompraAS
2026-09-10T00:58:17.5871151Z 
2026-09-10T00:58:17.5871506Z [0m[0m21:57:17,989 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ProgramaFluxoCaixaAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5871651Z 
2026-09-10T00:58:17.5871867Z 	java:global/sihdg-3.13.0.4/sihdg-api/ProgramaFluxoCaixaAS!br.gov.caixa.bsb.sihdg.core.service.ProgramaFluxoCaixaAS
2026-09-10T00:58:17.5872169Z 	java:app/sihdg-api/ProgramaFluxoCaixaAS!br.gov.caixa.bsb.sihdg.core.service.ProgramaFluxoCaixaAS
2026-09-10T00:58:17.5872347Z 	java:module/ProgramaFluxoCaixaAS!br.gov.caixa.bsb.sihdg.core.service.ProgramaFluxoCaixaAS
2026-09-10T00:58:17.5872570Z 	java:global/sihdg-3.13.0.4/sihdg-api/ProgramaFluxoCaixaAS
2026-09-10T00:58:17.5872741Z 	java:app/sihdg-api/ProgramaFluxoCaixaAS
2026-09-10T00:58:17.5872879Z 	java:module/ProgramaFluxoCaixaAS
2026-09-10T00:58:17.5872928Z 
2026-09-10T00:58:17.5873270Z [0m[0m21:57:17,989 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ItemDerivativoGerencialAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5873467Z 
2026-09-10T00:58:17.5873683Z 	java:global/sihdg-3.13.0.4/sihdg-api/ItemDerivativoGerencialAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoGerencialAS
2026-09-10T00:58:17.5874055Z 	java:app/sihdg-api/ItemDerivativoGerencialAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoGerencialAS
2026-09-10T00:58:17.5874264Z 	java:module/ItemDerivativoGerencialAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoGerencialAS
2026-09-10T00:58:17.5874481Z 	java:global/sihdg-3.13.0.4/sihdg-api/ItemDerivativoGerencialAS
2026-09-10T00:58:17.5874697Z 	java:app/sihdg-api/ItemDerivativoGerencialAS
2026-09-10T00:58:17.5874858Z 	java:module/ItemDerivativoGerencialAS
2026-09-10T00:58:17.5874932Z 
2026-09-10T00:58:17.5875285Z [0m[0m21:57:17,989 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'GestaoCargaAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5875443Z 
2026-09-10T00:58:17.5876005Z 	java:global/sihdg-3.13.0.4/sihdg-api/GestaoCargaAS!br.gov.caixa.bsb.sihdg.core.service.GestaoCargaAS
2026-09-10T00:58:17.5876239Z 	java:app/sihdg-api/GestaoCargaAS!br.gov.caixa.bsb.sihdg.core.service.GestaoCargaAS
2026-09-10T00:58:17.5876406Z 	java:module/GestaoCargaAS!br.gov.caixa.bsb.sihdg.core.service.GestaoCargaAS
2026-09-10T00:58:17.5876602Z 	java:global/sihdg-3.13.0.4/sihdg-api/GestaoCargaAS
2026-09-10T00:58:17.5876780Z 	java:app/sihdg-api/GestaoCargaAS
2026-09-10T00:58:17.5876888Z 	java:module/GestaoCargaAS
2026-09-10T00:58:17.5876941Z 
2026-09-10T00:58:17.5877318Z [0m[0m21:57:17,989 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ProdutoEventoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5877483Z 
2026-09-10T00:58:17.5877700Z 	java:global/sihdg-3.13.0.4/sihdg-api/ProdutoEventoAS!br.gov.caixa.bsb.sihdg.core.service.ProdutoEventoAS
2026-09-10T00:58:17.5877931Z 	java:app/sihdg-api/ProdutoEventoAS!br.gov.caixa.bsb.sihdg.core.service.ProdutoEventoAS
2026-09-10T00:58:17.5878101Z 	java:module/ProdutoEventoAS!br.gov.caixa.bsb.sihdg.core.service.ProdutoEventoAS
2026-09-10T00:58:17.5878298Z 	java:global/sihdg-3.13.0.4/sihdg-api/ProdutoEventoAS
2026-09-10T00:58:17.5878480Z 	java:app/sihdg-api/ProdutoEventoAS
2026-09-10T00:58:17.5878611Z 	java:module/ProdutoEventoAS
2026-09-10T00:58:17.5878658Z 
2026-09-10T00:58:17.5878996Z [0m[0m21:57:17,989 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ItemDerivativoGerencialFcAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5879141Z 
2026-09-10T00:58:17.5879380Z 	java:global/sihdg-3.13.0.4/sihdg-api/ItemDerivativoGerencialFcAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoGerencialFcAS
2026-09-10T00:58:17.5879657Z 	java:app/sihdg-api/ItemDerivativoGerencialFcAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoGerencialFcAS
2026-09-10T00:58:17.5879835Z 	java:module/ItemDerivativoGerencialFcAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoGerencialFcAS
2026-09-10T00:58:17.5880115Z 	java:global/sihdg-3.13.0.4/sihdg-api/ItemDerivativoGerencialFcAS
2026-09-10T00:58:17.5880319Z 	java:app/sihdg-api/ItemDerivativoGerencialFcAS
2026-09-10T00:58:17.5880450Z 	java:module/ItemDerivativoGerencialFcAS
2026-09-10T00:58:17.5880501Z 
2026-09-10T00:58:17.5880835Z [0m[0m21:57:17,989 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'RecursoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5880971Z 
2026-09-10T00:58:17.5881175Z 	java:global/sihdg-3.13.0.4/sihdg-api/RecursoAS!br.gov.caixa.arquitetura.javaee.core.seguranca.RecursoAS
2026-09-10T00:58:17.5881446Z 	java:app/sihdg-api/RecursoAS!br.gov.caixa.arquitetura.javaee.core.seguranca.RecursoAS
2026-09-10T00:58:17.5881629Z 	java:module/RecursoAS!br.gov.caixa.arquitetura.javaee.core.seguranca.RecursoAS
2026-09-10T00:58:17.5881816Z 	java:global/sihdg-3.13.0.4/sihdg-api/RecursoAS
2026-09-10T00:58:17.5881994Z 	java:app/sihdg-api/RecursoAS
2026-09-10T00:58:17.5882120Z 	java:module/RecursoAS
2026-09-10T00:58:17.5882164Z 
2026-09-10T00:58:17.5882496Z [0m[0m21:57:17,989 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ContratoTemporarioAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5882639Z 
2026-09-10T00:58:17.5882853Z 	java:global/sihdg-3.13.0.4/sihdg-api/ContratoTemporarioAS!br.gov.caixa.bsb.sihdg.core.service.ContratoTemporarioAS
2026-09-10T00:58:17.5883113Z 	java:app/sihdg-api/ContratoTemporarioAS!br.gov.caixa.bsb.sihdg.core.service.ContratoTemporarioAS
2026-09-10T00:58:17.5883312Z 	java:module/ContratoTemporarioAS!br.gov.caixa.bsb.sihdg.core.service.ContratoTemporarioAS
2026-09-10T00:58:17.5883515Z 	java:global/sihdg-3.13.0.4/sihdg-api/ContratoTemporarioAS
2026-09-10T00:58:17.5883691Z 	java:app/sihdg-api/ContratoTemporarioAS
2026-09-10T00:58:17.5883825Z 	java:module/ContratoTemporarioAS
2026-09-10T00:58:17.5883876Z 
2026-09-10T00:58:17.5884226Z [0m[0m21:57:17,989 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'AtualizacaoCurvaFcAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5884376Z 
2026-09-10T00:58:17.5884584Z 	java:global/sihdg-3.13.0.4/sihdg-api/AtualizacaoCurvaFcAS!br.gov.caixa.bsb.sihdg.core.service.AtualizacaoCurvaFcAS
2026-09-10T00:58:17.5884853Z 	java:app/sihdg-api/AtualizacaoCurvaFcAS!br.gov.caixa.bsb.sihdg.core.service.AtualizacaoCurvaFcAS
2026-09-10T00:58:17.5885032Z 	java:module/AtualizacaoCurvaFcAS!br.gov.caixa.bsb.sihdg.core.service.AtualizacaoCurvaFcAS
2026-09-10T00:58:17.5885255Z 	java:global/sihdg-3.13.0.4/sihdg-api/AtualizacaoCurvaFcAS
2026-09-10T00:58:17.5885426Z 	java:app/sihdg-api/AtualizacaoCurvaFcAS
2026-09-10T00:58:17.5885549Z 	java:module/AtualizacaoCurvaFcAS
2026-09-10T00:58:17.5885598Z 
2026-09-10T00:58:17.5885942Z [0m[0m21:57:17,989 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'GestaoEfetividadeAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5886100Z 
2026-09-10T00:58:17.5886307Z 	java:global/sihdg-3.13.0.4/sihdg-api/GestaoEfetividadeAS!br.gov.caixa.bsb.sihdg.core.service.GestaoEfetividadeAS
2026-09-10T00:58:17.5886563Z 	java:app/sihdg-api/GestaoEfetividadeAS!br.gov.caixa.bsb.sihdg.core.service.GestaoEfetividadeAS
2026-09-10T00:58:17.5886753Z 	java:module/GestaoEfetividadeAS!br.gov.caixa.bsb.sihdg.core.service.GestaoEfetividadeAS
2026-09-10T00:58:17.5886960Z 	java:global/sihdg-3.13.0.4/sihdg-api/GestaoEfetividadeAS
2026-09-10T00:58:17.5887136Z 	java:app/sihdg-api/GestaoEfetividadeAS
2026-09-10T00:58:17.5887351Z 	java:module/GestaoEfetividadeAS
2026-09-10T00:58:17.5887417Z 
2026-09-10T00:58:17.5887758Z [0m[0m21:57:17,989 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ControleCacheTask' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5887956Z 
2026-09-10T00:58:17.5888196Z 	java:global/sihdg-3.13.0.4/sihdg-api/ControleCacheTask!br.gov.caixa.arquitetura.javaee.core.comum.servico.ControleCacheTask
2026-09-10T00:58:17.5888461Z 	java:app/sihdg-api/ControleCacheTask!br.gov.caixa.arquitetura.javaee.core.comum.servico.ControleCacheTask
2026-09-10T00:58:17.5888656Z 	java:module/ControleCacheTask!br.gov.caixa.arquitetura.javaee.core.comum.servico.ControleCacheTask
2026-09-10T00:58:17.5889015Z 	java:global/sihdg-3.13.0.4/sihdg-api/ControleCacheTask
2026-09-10T00:58:17.5889205Z 	java:app/sihdg-api/ControleCacheTask
2026-09-10T00:58:17.5889318Z 	java:module/ControleCacheTask
2026-09-10T00:58:17.5889375Z 
2026-09-10T00:58:17.5889703Z [0m[0m21:57:17,989 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ControleCacheAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.13.0.4.ear"' are as follows:
2026-09-10T00:58:17.5889845Z 
2026-09-10T00:58:17.5890070Z 	java:global/sihdg-3.13.0.4/sihdg-api/ControleCacheAS!br.gov.caixa.arquitetura.javaee.core.util.ControleCacheAS
2026-09-10T00:58:17.5890338Z 	java:app/sihdg-api/ControleCacheAS!br.gov.caixa.arquitetura.javaee.core.util.ControleCacheAS
2026-09-10T00:58:17.5890504Z 	java:module/ControleCacheAS!br.gov.caixa.arquitetura.javaee.core.util.ControleCacheAS
2026-09-10T00:58:17.5890705Z 	java:global/sihdg-3.13.0.4/sihdg-api/ControleCacheAS
2026-09-10T00:58:17.5890887Z 	java:app/sihdg-api/ControleCacheAS
2026-09-10T00:58:17.5891017Z 	java:module/ControleCacheAS
2026-09-10T00:58:17.5891064Z 
2026-09-10T00:58:17.5891266Z [0m[0m21:57:18,286 INFO  [org.jboss.weld.Version] (MSC service thread 1-2) WELD-000900: 5.1.6 (redhat)
2026-09-10T00:58:17.5891589Z [0m[0m21:57:18,704 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 46) WFLYJPA0010: Starting Persistence Unit (phase 1 of 2) Service 'sihdg-3.13.0.4.ear/sihdg-api.war#sihdgDS'
2026-09-10T00:58:17.5891938Z [0m[0m21:57:18,792 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 46) HHH000204: Processing PersistenceUnitInfo [name: sihdgDS]
2026-09-10T00:58:17.5892341Z [0m[33m21:57:18,907 WARN  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.bsb.sihdg.core.service.RegistroContabilidadeAS should not have a final or static method (toSingleton)
2026-09-10T00:58:17.5892697Z [0m[0m21:57:18,912 INFO  [org.hibernate.Version] (ServerService Thread Pool -- 46) HHH000412: Hibernate ORM core version 6.2.49.Final-redhat-00001
2026-09-10T00:58:17.5893015Z [0m[0m21:57:18,913 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 46) HHH000406: Using bytecode reflection optimizer
2026-09-10T00:58:17.5893416Z [0m[33m21:57:19,094 WARN  [org.hibernate.orm.deprecation] (ServerService Thread Pool -- 46) HHH90000025: SQLServer2012Dialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-09-10T00:58:17.5893833Z [0m[33m21:57:19,095 WARN  [org.hibernate.orm.deprecation] (ServerService Thread Pool -- 46) HHH90000026: SQLServer2012Dialect has been deprecated; use org.hibernate.dialect.SQLServerDialect instead
2026-09-10T00:58:17.5894164Z [0m[0m21:57:19,300 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 46) Envers integration enabled? : true
2026-09-10T00:58:17.5894474Z [0m[0m21:57:19,304 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV6020260: Second level cache enabled for sihdg-3.13.0.4.ear/sihdg-api.war#sihdgDS
2026-09-10T00:58:17.5894981Z [0m[33m21:57:19,496 WARN  [org.jboss.as.jaxrs] (MSC service thread 1-2) WFLYRS0018: Explicit usage of Jackson annotation in a Jakarta RESTful Web Services deployment; the system will disable Jakarta JSON Binding processing for the current deployment. Consider setting the 'resteasy.preferJacksonOverJsonB' property to 'false' to restore Jakarta JSON Binding.
2026-09-10T00:58:17.5895465Z [0m[0m21:57:19,808 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 46) WFLYJPA0010: Starting Persistence Unit (phase 2 of 2) Service 'sihdg-3.13.0.4.ear/sihdg-api.war#sihdgDS'
2026-09-10T00:58:17.5895889Z [0m[0m21:57:21,715 INFO  [org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator] (ServerService Thread Pool -- 46) HHH000490: Using JTA platform [org.hibernate.engine.transaction.jta.platform.internal.JBossAppServerJtaPlatform]
2026-09-10T00:58:17.5896284Z [0m[0m21:57:28,601 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.cache.CacheConfig] (ServerService Thread Pool -- 53) Atualizando o cache inicial ...
2026-09-10T00:58:17.5896691Z [0m[0m21:57:28,809 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.seguranca.ContextoSegurancaHelper] (ServerService Thread Pool -- 54) SEGURANCA - Operacao durante inicializacao permitida sem contexto. Operacao: Perfil.createQuery
2026-09-10T00:58:17.5897348Z [0m[33m21:57:28,895 WARNING [com.hazelcast.instance.HazelcastInstanceFactory] (ServerService Thread Pool -- 53) Hazelcast is starting in a Java modular environment (Java 9 and newer) but without proper access to required Java packages. Use additional Java arguments to provide Hazelcast access to Java internal API. The internal API access is used to get the best performance results. Arguments to be used:
2026-09-10T00:58:17.5897997Z  --add-modules java.se --add-exports java.base/jdk.internal.ref=ALL-UNNAMED --add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.base/java.nio=ALL-UNNAMED --add-opens java.base/sun.nio.ch=ALL-UNNAMED --add-opens java.management/sun.management=ALL-UNNAMED --add-opens jdk.management/com.sun.management.internal=ALL-UNNAMED
2026-09-10T00:58:17.5898432Z [0m[0m21:57:28,913 INFO  [com.hazelcast.instance.AddressPicker] (ServerService Thread Pool -- 53) [LOCAL] [dev] [3.12.12] Prefer IPv4 stack is true, prefer IPv6 addresses is false
2026-09-10T00:58:17.5898852Z [0m[0m21:57:28,915 INFO  [com.hazelcast.instance.AddressPicker] (ServerService Thread Pool -- 53) [LOCAL] [dev] [3.12.12] Picked [25.2.32.33]:5701, using socket ServerSocket[addr=/0.0.0.0,localport=5701], bind any local is true
2026-09-10T00:58:17.5899276Z [0m[0m21:57:28,994 INFO  [com.hazelcast.system] (ServerService Thread Pool -- 53) [25.2.32.33]:5701 [dev] [3.12.12] Hazelcast 3.12.12 (20210209 - 35096ec) starting at [25.2.32.33]:5701
2026-09-10T00:58:17.5899652Z [0m[0m21:57:28,994 INFO  [com.hazelcast.system] (ServerService Thread Pool -- 53) [25.2.32.33]:5701 [dev] [3.12.12] Copyright (c) 2008-2020, Hazelcast, Inc. All Rights Reserved.
2026-09-10T00:58:17.5900052Z [0m[0m21:57:29,214 INFO  [com.hazelcast.spi.impl.operationservice.impl.BackpressureRegulator] (ServerService Thread Pool -- 53) [25.2.32.33]:5701 [dev] [3.12.12] Backpressure is disabled
2026-09-10T00:58:17.5900332Z [0m[0m21:57:29,592 INFO  [stdout] (ServerService Thread Pool -- 54) Hibernate: 
2026-09-10T00:58:17.5900561Z [0m[0m21:57:29,592 INFO  [stdout] (ServerService Thread Pool -- 54)     select
2026-09-10T00:58:17.5900793Z [0m[0m21:57:29,592 INFO  [stdout] (ServerService Thread Pool -- 54)         p1_0.CO_PERFIL_ID,
2026-09-10T00:58:17.5901021Z [0m[0m21:57:29,592 INFO  [stdout] (ServerService Thread Pool -- 54)         p1_0.TS_ATLZO_PERFIL,
2026-09-10T00:58:17.5901271Z [0m[0m21:57:29,592 INFO  [stdout] (ServerService Thread Pool -- 54)         p1_0.DE_PERFIL_ACESSO,
2026-09-10T00:58:17.5901513Z [0m[0m21:57:29,592 INFO  [stdout] (ServerService Thread Pool -- 54)         p1_0.NO_PERFIL_ACESSO,
2026-09-10T00:58:17.5901760Z [0m[0m21:57:29,592 INFO  [stdout] (ServerService Thread Pool -- 54)         p1_0.CO_TRMNL_ATLZO_PERFIL,
2026-09-10T00:58:17.5902015Z [0m[0m21:57:29,593 INFO  [stdout] (ServerService Thread Pool -- 54)         p1_0.CO_USUARIO_ATLZO_PERFIL 
2026-09-10T00:58:17.5902230Z [0m[0m21:57:29,593 INFO  [stdout] (ServerService Thread Pool -- 54)     from
2026-09-10T00:58:17.5902520Z [0m[0m21:57:29,593 INFO  [stdout] (ServerService Thread Pool -- 54)         dbo.HDGTB011_PERFIL_ACESSO p1_0 
2026-09-10T00:58:17.5902739Z [0m[0m21:57:29,593 INFO  [stdout] (ServerService Thread Pool -- 54)     where
2026-09-10T00:58:17.5902976Z [0m[0m21:57:29,593 INFO  [stdout] (ServerService Thread Pool -- 54)         p1_0.NO_PERFIL_ACESSO=?
2026-09-10T00:58:17.5903367Z [0m[33m21:57:30,090 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (ServerService Thread Pool -- 54) IJ000604: Throwable while attempting to get a new connection: null: jakarta.resource.ResourceException: IJ031084: Unable to create connection
2026-09-10T00:58:17.5903854Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
2026-09-10T00:58:17.5904265Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
2026-09-10T00:58:17.5904677Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
2026-09-10T00:58:17.5905154Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1381)
2026-09-10T00:58:17.5905633Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:534)
2026-09-10T00:58:17.5906025Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getTransactionNewConnection(AbstractPool.java:770)
2026-09-10T00:58:17.5906378Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:666)
2026-09-10T00:58:17.5906751Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
2026-09-10T00:58:17.5907123Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
2026-09-10T00:58:17.5907550Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
2026-09-10T00:58:17.5907917Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
2026-09-10T00:58:17.5908331Z 	at org.jboss.as.connector@8.0.13.GA-redhat-00002//org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
2026-09-10T00:58:17.5908762Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
2026-09-10T00:58:17.5909190Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.internal.NonContextualJdbcConnectionAccess.obtainConnection(NonContextualJdbcConnectionAccess.java:38)
2026-09-10T00:58:17.5909565Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:113)
2026-09-10T00:58:17.5909943Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
2026-09-10T00:58:17.5910329Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
2026-09-10T00:58:17.5910659Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
2026-09-10T00:58:17.5911036Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
2026-09-10T00:58:17.5911407Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
2026-09-10T00:58:17.5911791Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
2026-09-10T00:58:17.5912152Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:227)
2026-09-10T00:58:17.5912485Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:164)
2026-09-10T00:58:17.5912839Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
2026-09-10T00:58:17.5913195Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
2026-09-10T00:58:17.5913512Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
2026-09-10T00:58:17.5913850Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
2026-09-10T00:58:17.5914176Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
2026-09-10T00:58:17.5914470Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
2026-09-10T00:58:17.5914800Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
2026-09-10T00:58:17.5915142Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
2026-09-10T00:58:17.5915479Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
2026-09-10T00:58:17.5915795Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
2026-09-10T00:58:17.5916121Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:107)
2026-09-10T00:58:17.5916468Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:300)
2026-09-10T00:58:17.5916831Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:241)
2026-09-10T00:58:17.5917153Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
2026-09-10T00:58:17.5917561Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
2026-09-10T00:58:17.5917887Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.getSingleResult(AbstractSelectionQuery.java:473)
2026-09-10T00:58:17.5918279Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRepository.consultarPorNome(PerfilRepository.java:31)
2026-09-10T00:58:17.5918658Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRepository$Proxy$_$$_WeldClientProxy.consultarPorNome(Unknown Source)
2026-09-10T00:58:17.5918990Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS.gravar(PerfilAS.java:132)
2026-09-10T00:58:17.5919208Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.5919510Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.5919834Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
2026-09-10T00:58:17.5920199Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5920526Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.5920887Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-10T00:58:17.5921257Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
2026-09-10T00:58:17.5921609Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
2026-09-10T00:58:17.5921953Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
2026-09-10T00:58:17.5922283Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5922614Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
2026-09-10T00:58:17.5922933Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5923310Z 	at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
2026-09-10T00:58:17.5923644Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5923968Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-10T00:58:17.5924292Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5924588Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
2026-09-10T00:58:17.5924902Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5925201Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.5925559Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
2026-09-10T00:58:17.5925881Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5926234Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
2026-09-10T00:58:17.5926537Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5926870Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
2026-09-10T00:58:17.5927191Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5927587Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
2026-09-10T00:58:17.5927893Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:392)
2026-09-10T00:58:17.5928242Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:160)
2026-09-10T00:58:17.5928549Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5928866Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.5929246Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
2026-09-10T00:58:17.5929621Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-10T00:58:17.5929950Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5930311Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-10T00:58:17.5930628Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5930951Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
2026-09-10T00:58:17.5931270Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5931588Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
2026-09-10T00:58:17.5931904Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5932221Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
2026-09-10T00:58:17.5932512Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5932851Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
2026-09-10T00:58:17.5933175Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5933507Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
2026-09-10T00:58:17.5933832Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5934189Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
2026-09-10T00:58:17.5934481Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5934799Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-10T00:58:17.5935132Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5935513Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-10T00:58:17.5935838Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5936125Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
2026-09-10T00:58:17.5936444Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
2026-09-10T00:58:17.5936797Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
2026-09-10T00:58:17.5937108Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5937471Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.5937784Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
2026-09-10T00:58:17.5938100Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
2026-09-10T00:58:17.5938458Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5938895Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
2026-09-10T00:58:17.5939340Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
2026-09-10T00:58:17.5939755Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
2026-09-10T00:58:17.5940160Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
2026-09-10T00:58:17.5940589Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
2026-09-10T00:58:17.5940880Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5941179Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.5941503Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
2026-09-10T00:58:17.5941816Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS$$$view10.gravar(Unknown Source)
2026-09-10T00:58:17.5942033Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.5942259Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.5942527Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
2026-09-10T00:58:17.5942860Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
2026-09-10T00:58:17.5943278Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
2026-09-10T00:58:17.5943700Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
2026-09-10T00:58:17.5944033Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
2026-09-10T00:58:17.5944358Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS$Proxy$_$$_Weld$EnterpriseProxy$.gravar(Unknown Source)
2026-09-10T00:58:17.5944681Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig.onStartup(SecurityConfig.java:71)
2026-09-10T00:58:17.5944927Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.5945111Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.5945451Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
2026-09-10T00:58:17.5945796Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5946092Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.5946433Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-10T00:58:17.5946798Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:126)
2026-09-10T00:58:17.5947168Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:112)
2026-09-10T00:58:17.5947560Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5947877Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.5948251Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:87)
2026-09-10T00:58:17.5948709Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-10T00:58:17.5949046Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5949364Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
2026-09-10T00:58:17.5949686Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5950032Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
2026-09-10T00:58:17.5950418Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5950743Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
2026-09-10T00:58:17.5951076Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5951453Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:111)
2026-09-10T00:58:17.5951770Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5952088Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-10T00:58:17.5952406Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5952692Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254)
2026-09-10T00:58:17.5953009Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:416)
2026-09-10T00:58:17.5953342Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:68)
2026-09-10T00:58:17.5953651Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5953991Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
2026-09-10T00:58:17.5954310Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5954650Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-10T00:58:17.5954994Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5955333Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-10T00:58:17.5955645Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5955982Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-10T00:58:17.5956287Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5956610Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.StartupCountDownInterceptor.processInvocation(StartupCountDownInterceptor.java:25)
2026-09-10T00:58:17.5956925Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5957229Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.5957665Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:168)
2026-09-10T00:58:17.5957993Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:141)
2026-09-10T00:58:17.5958332Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
2026-09-10T00:58:17.5958732Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:127)
2026-09-10T00:58:17.5959058Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:141)
2026-09-10T00:58:17.5959406Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
2026-09-10T00:58:17.5959608Z 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
2026-09-10T00:58:17.5959795Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
2026-09-10T00:58:17.5960086Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
2026-09-10T00:58:17.5960415Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
2026-09-10T00:58:17.5960727Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
2026-09-10T00:58:17.5961050Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
2026-09-10T00:58:17.5961260Z 	at java.base/java.lang.Thread.run(Thread.java:1583)
2026-09-10T00:58:17.5961506Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)
2026-09-10T00:58:17.5962063Z Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: "encrypt" property is set to "true" and "trustServerCertificate" property is set to "true" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (unsupported_certificate) Certificates do not conform to algorithm constraints. ClientConnectionId:7bd656fd-4c21-46d4-ad06-1ec1dcceea94
2026-09-10T00:58:17.5962428Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.terminate(SQLServerConnection.java:4290)
2026-09-10T00:58:17.5962650Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1965)
2026-09-10T00:58:17.5962854Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:3816)
2026-09-10T00:58:17.5963078Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:3372)
2026-09-10T00:58:17.5963296Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:3197)
2026-09-10T00:58:17.5963502Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:1971)
2026-09-10T00:58:17.5963723Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:1263)
2026-09-10T00:58:17.5964090Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
2026-09-10T00:58:17.5964304Z 	... 170 more
2026-09-10T00:58:17.5964465Z Caused by: javax.net.ssl.SSLHandshakeException: (unsupported_certificate) Certificates do not conform to algorithm constraints
2026-09-10T00:58:17.5964643Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130)
2026-09-10T00:58:17.5964818Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:383)
2026-09-10T00:58:17.5964994Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:326)
2026-09-10T00:58:17.5965203Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-09-10T00:58:17.5965421Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647)
2026-09-10T00:58:17.5965644Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467)
2026-09-10T00:58:17.5965865Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363)
2026-09-10T00:58:17.5966066Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393)
2026-09-10T00:58:17.5966298Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:477)
2026-09-10T00:58:17.5966492Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:448)
2026-09-10T00:58:17.5966668Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:206)
2026-09-10T00:58:17.5966841Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:172)
2026-09-10T00:58:17.5967017Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1506)
2026-09-10T00:58:17.5967207Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1421)
2026-09-10T00:58:17.5967451Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:455)
2026-09-10T00:58:17.5967620Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:426)
2026-09-10T00:58:17.5967819Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1854)
2026-09-10T00:58:17.5967966Z 	... 176 more
2026-09-10T00:58:17.5968106Z Caused by: java.security.cert.CertificateException: Certificates do not conform to algorithm constraints
2026-09-10T00:58:17.5968317Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1557)
2026-09-10T00:58:17.5968519Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAdditionalTrust(SSLContextImpl.java:1484)
2026-09-10T00:58:17.5968738Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkServerTrusted(SSLContextImpl.java:1431)
2026-09-10T00:58:17.5968953Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:631)
2026-09-10T00:58:17.5969120Z 	... 188 more
2026-09-10T00:58:17.5969262Z Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA
2026-09-10T00:58:17.5969474Z 	at java.base/sun.security.provider.certpath.AlgorithmChecker.check(AlgorithmChecker.java:231)
2026-09-10T00:58:17.5969676Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1553)
2026-09-10T00:58:17.5969836Z 	... 191 more
2026-09-10T00:58:17.5969870Z 
2026-09-10T00:58:17.5970119Z [0m[33m21:57:30,092 WARN  [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (ServerService Thread Pool -- 54) SQL Error: 0, SQLState: null
2026-09-10T00:58:17.5970519Z [0m[31m21:57:30,092 ERROR [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (ServerService Thread Pool -- 54) jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-10T00:58:17.5971217Z [0m[31m21:57:30,098 ERROR [org.jboss.as.ejb3.invocation] (ServerService Thread Pool -- 54) WFLYEJB0034: Jakarta Enterprise Beans Invocation failed on component PerfilAS for method public void br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS.gravar(br.gov.caixa.arquitetura.javaee.core.comum.dto.PerfilDTO): jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-10T00:58:17.5971723Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:219)
2026-09-10T00:58:17.5972033Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:392)
2026-09-10T00:58:17.5972369Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:160)
2026-09-10T00:58:17.5972675Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5972983Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.5973432Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
2026-09-10T00:58:17.5973868Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-10T00:58:17.5974187Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5974536Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-10T00:58:17.5974869Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5975209Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
2026-09-10T00:58:17.5975533Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5975857Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
2026-09-10T00:58:17.5976170Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5976482Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
2026-09-10T00:58:17.5976800Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5977122Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
2026-09-10T00:58:17.5977513Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5977861Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
2026-09-10T00:58:17.5978192Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5978497Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
2026-09-10T00:58:17.5978799Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5979131Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-10T00:58:17.5979451Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5979770Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-10T00:58:17.5980126Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5980407Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
2026-09-10T00:58:17.5980736Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
2026-09-10T00:58:17.5981071Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
2026-09-10T00:58:17.5981411Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5981722Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.5982027Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
2026-09-10T00:58:17.5982316Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
2026-09-10T00:58:17.5982612Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5982937Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
2026-09-10T00:58:17.5983288Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
2026-09-10T00:58:17.5983608Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
2026-09-10T00:58:17.5983941Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
2026-09-10T00:58:17.5984247Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
2026-09-10T00:58:17.5984551Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5984875Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.5985184Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
2026-09-10T00:58:17.5985499Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS$$$view10.gravar(Unknown Source)
2026-09-10T00:58:17.5985704Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.5985903Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.5986174Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
2026-09-10T00:58:17.5986512Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
2026-09-10T00:58:17.5986910Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
2026-09-10T00:58:17.5987473Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
2026-09-10T00:58:17.5987819Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
2026-09-10T00:58:17.5988187Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS$Proxy$_$$_Weld$EnterpriseProxy$.gravar(Unknown Source)
2026-09-10T00:58:17.5988530Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig.onStartup(SecurityConfig.java:71)
2026-09-10T00:58:17.5988774Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.5988957Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.5989329Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
2026-09-10T00:58:17.5989705Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5990033Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.5990376Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-10T00:58:17.5990732Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:126)
2026-09-10T00:58:17.5991096Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:112)
2026-09-10T00:58:17.5991423Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5991719Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.5992077Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:87)
2026-09-10T00:58:17.5992462Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-10T00:58:17.5992800Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5993119Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
2026-09-10T00:58:17.5993428Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5993753Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
2026-09-10T00:58:17.5994186Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5994572Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
2026-09-10T00:58:17.5994891Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5995239Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:111)
2026-09-10T00:58:17.5995565Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5995912Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-10T00:58:17.5996223Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5996528Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254)
2026-09-10T00:58:17.5996827Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:416)
2026-09-10T00:58:17.5997174Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:68)
2026-09-10T00:58:17.5997580Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5997900Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
2026-09-10T00:58:17.5998231Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5998601Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-10T00:58:17.5998926Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5999262Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-10T00:58:17.5999588Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.5999903Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-10T00:58:17.6000219Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6000549Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.StartupCountDownInterceptor.processInvocation(StartupCountDownInterceptor.java:25)
2026-09-10T00:58:17.6000873Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6001191Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6001609Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:168)
2026-09-10T00:58:17.6002083Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:141)
2026-09-10T00:58:17.6002449Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
2026-09-10T00:58:17.6002787Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:127)
2026-09-10T00:58:17.6003110Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:141)
2026-09-10T00:58:17.6003418Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
2026-09-10T00:58:17.6003623Z 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
2026-09-10T00:58:17.6003791Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
2026-09-10T00:58:17.6004217Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
2026-09-10T00:58:17.6004535Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
2026-09-10T00:58:17.6004864Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
2026-09-10T00:58:17.6005202Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
2026-09-10T00:58:17.6005418Z 	at java.base/java.lang.Thread.run(Thread.java:1583)
2026-09-10T00:58:17.6005668Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)
2026-09-10T00:58:17.6005928Z Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-10T00:58:17.6006289Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:61)
2026-09-10T00:58:17.6006612Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
2026-09-10T00:58:17.6006915Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
2026-09-10T00:58:17.6007342Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
2026-09-10T00:58:17.6007744Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
2026-09-10T00:58:17.6008099Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
2026-09-10T00:58:17.6008420Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
2026-09-10T00:58:17.6008789Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
2026-09-10T00:58:17.6009167Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
2026-09-10T00:58:17.6009509Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
2026-09-10T00:58:17.6009852Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:227)
2026-09-10T00:58:17.6010189Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:164)
2026-09-10T00:58:17.6010537Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
2026-09-10T00:58:17.6010888Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
2026-09-10T00:58:17.6011208Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
2026-09-10T00:58:17.6011526Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
2026-09-10T00:58:17.6011854Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
2026-09-10T00:58:17.6012202Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
2026-09-10T00:58:17.6012528Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
2026-09-10T00:58:17.6012870Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
2026-09-10T00:58:17.6013234Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
2026-09-10T00:58:17.6013531Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
2026-09-10T00:58:17.6013868Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:107)
2026-09-10T00:58:17.6014223Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:300)
2026-09-10T00:58:17.6014584Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:241)
2026-09-10T00:58:17.6014897Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
2026-09-10T00:58:17.6015196Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
2026-09-10T00:58:17.6015495Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.getSingleResult(AbstractSelectionQuery.java:473)
2026-09-10T00:58:17.6015887Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRepository.consultarPorNome(PerfilRepository.java:31)
2026-09-10T00:58:17.6016442Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRepository$Proxy$_$$_WeldClientProxy.consultarPorNome(Unknown Source)
2026-09-10T00:58:17.6016794Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS.gravar(PerfilAS.java:132)
2026-09-10T00:58:17.6017016Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.6017210Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.6017573Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
2026-09-10T00:58:17.6017915Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6018294Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6018651Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-10T00:58:17.6019009Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
2026-09-10T00:58:17.6019362Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
2026-09-10T00:58:17.6019699Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
2026-09-10T00:58:17.6020059Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6020408Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
2026-09-10T00:58:17.6020740Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6021053Z 	at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
2026-09-10T00:58:17.6021402Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6021721Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-10T00:58:17.6022054Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6022358Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
2026-09-10T00:58:17.6022662Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6022963Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6023320Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
2026-09-10T00:58:17.6023628Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6023956Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
2026-09-10T00:58:17.6024281Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6024629Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
2026-09-10T00:58:17.6024945Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6025249Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
2026-09-10T00:58:17.6025398Z 	... 103 more
2026-09-10T00:58:17.6025560Z Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-10T00:58:17.6025898Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:160)
2026-09-10T00:58:17.6026245Z 	at org.jboss.as.connector@8.0.13.GA-redhat-00002//org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
2026-09-10T00:58:17.6026620Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
2026-09-10T00:58:17.6026995Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.internal.NonContextualJdbcConnectionAccess.obtainConnection(NonContextualJdbcConnectionAccess.java:38)
2026-09-10T00:58:17.6027421Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:113)
2026-09-10T00:58:17.6027666Z 	... 156 more
2026-09-10T00:58:17.6027831Z Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-10T00:58:17.6028193Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:690)
2026-09-10T00:58:17.6028568Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
2026-09-10T00:58:17.6028964Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
2026-09-10T00:58:17.6029308Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
2026-09-10T00:58:17.6029488Z 	... 160 more
2026-09-10T00:58:17.6029633Z Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
2026-09-10T00:58:17.6029975Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
2026-09-10T00:58:17.6030385Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
2026-09-10T00:58:17.6030780Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
2026-09-10T00:58:17.6031241Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1381)
2026-09-10T00:58:17.6031726Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:534)
2026-09-10T00:58:17.6032112Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getTransactionNewConnection(AbstractPool.java:770)
2026-09-10T00:58:17.6032448Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:666)
2026-09-10T00:58:17.6032821Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
2026-09-10T00:58:17.6032998Z 	... 163 more
2026-09-10T00:58:17.6033506Z Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: "encrypt" property is set to "true" and "trustServerCertificate" property is set to "true" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (unsupported_certificate) Certificates do not conform to algorithm constraints. ClientConnectionId:7bd656fd-4c21-46d4-ad06-1ec1dcceea94
2026-09-10T00:58:17.6033872Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.terminate(SQLServerConnection.java:4290)
2026-09-10T00:58:17.6034090Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1965)
2026-09-10T00:58:17.6034301Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:3816)
2026-09-10T00:58:17.6034526Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:3372)
2026-09-10T00:58:17.6034768Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:3197)
2026-09-10T00:58:17.6034985Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:1971)
2026-09-10T00:58:17.6035180Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:1263)
2026-09-10T00:58:17.6035542Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
2026-09-10T00:58:17.6035774Z 	... 170 more
2026-09-10T00:58:17.6035939Z Caused by: javax.net.ssl.SSLHandshakeException: (unsupported_certificate) Certificates do not conform to algorithm constraints
2026-09-10T00:58:17.6036122Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130)
2026-09-10T00:58:17.6036294Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:383)
2026-09-10T00:58:17.6036547Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:326)
2026-09-10T00:58:17.6036738Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-09-10T00:58:17.6036942Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647)
2026-09-10T00:58:17.6037172Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467)
2026-09-10T00:58:17.6037455Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363)
2026-09-10T00:58:17.6037665Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393)
2026-09-10T00:58:17.6037860Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:477)
2026-09-10T00:58:17.6038041Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:448)
2026-09-10T00:58:17.6038228Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:206)
2026-09-10T00:58:17.6038558Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:172)
2026-09-10T00:58:17.6038798Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1506)
2026-09-10T00:58:17.6039031Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1421)
2026-09-10T00:58:17.6039276Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:455)
2026-09-10T00:58:17.6039510Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:426)
2026-09-10T00:58:17.6039773Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1854)
2026-09-10T00:58:17.6039974Z 	... 176 more
2026-09-10T00:58:17.6040113Z Caused by: java.security.cert.CertificateException: Certificates do not conform to algorithm constraints
2026-09-10T00:58:17.6040321Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1557)
2026-09-10T00:58:17.6040528Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAdditionalTrust(SSLContextImpl.java:1484)
2026-09-10T00:58:17.6040750Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkServerTrusted(SSLContextImpl.java:1431)
2026-09-10T00:58:17.6040960Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:631)
2026-09-10T00:58:17.6041126Z 	... 188 more
2026-09-10T00:58:17.6041276Z Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA
2026-09-10T00:58:17.6041468Z 	at java.base/sun.security.provider.certpath.AlgorithmChecker.check(AlgorithmChecker.java:231)
2026-09-10T00:58:17.6041673Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1553)
2026-09-10T00:58:17.6041816Z 	... 191 more
2026-09-10T00:58:17.6041891Z 
2026-09-10T00:58:17.6042437Z [0m[31m21:57:30,100 ERROR [org.jboss.msc.service.fail] (ServerService Thread Pool -- 54) MSC000001: Failed to start service jboss.deployment.subunit."sihdg-3.13.0.4.ear"."sihdg-api.war".component.SecurityConfig.START: org.jboss.msc.service.StartException in service jboss.deployment.subunit."sihdg-3.13.0.4.ear"."sihdg-api.war".component.SecurityConfig.START: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
2026-09-10T00:58:17.6042895Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:57)
2026-09-10T00:58:17.6043132Z 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
2026-09-10T00:58:17.6043318Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
2026-09-10T00:58:17.6043609Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
2026-09-10T00:58:17.6043940Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
2026-09-10T00:58:17.6044257Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
2026-09-10T00:58:17.6044577Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
2026-09-10T00:58:17.6044767Z 	at java.base/java.lang.Thread.run(Thread.java:1583)
2026-09-10T00:58:17.6045028Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)
2026-09-10T00:58:17.6045207Z Caused by: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
2026-09-10T00:58:17.6045496Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:170)
2026-09-10T00:58:17.6045837Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:141)
2026-09-10T00:58:17.6046150Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
2026-09-10T00:58:17.6046482Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:127)
2026-09-10T00:58:17.6046797Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:141)
2026-09-10T00:58:17.6047116Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
2026-09-10T00:58:17.6047343Z 	... 8 more
2026-09-10T00:58:17.6047569Z Caused by: jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-10T00:58:17.6047931Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:219)
2026-09-10T00:58:17.6048240Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:392)
2026-09-10T00:58:17.6048534Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:160)
2026-09-10T00:58:17.6048833Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6049156Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6049521Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
2026-09-10T00:58:17.6049943Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-10T00:58:17.6050278Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6050622Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-10T00:58:17.6050981Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6051325Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
2026-09-10T00:58:17.6051635Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6051959Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
2026-09-10T00:58:17.6052264Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6052574Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
2026-09-10T00:58:17.6052889Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6053230Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
2026-09-10T00:58:17.6053540Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6053889Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
2026-09-10T00:58:17.6054222Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6054528Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
2026-09-10T00:58:17.6054835Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6055157Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-10T00:58:17.6055463Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6055801Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-10T00:58:17.6056111Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6056393Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
2026-09-10T00:58:17.6056734Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
2026-09-10T00:58:17.6057083Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
2026-09-10T00:58:17.6057458Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6057803Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6058134Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
2026-09-10T00:58:17.6058448Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
2026-09-10T00:58:17.6058797Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6059136Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
2026-09-10T00:58:17.6059511Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
2026-09-10T00:58:17.6059841Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
2026-09-10T00:58:17.6060182Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
2026-09-10T00:58:17.6060487Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
2026-09-10T00:58:17.6060797Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6061115Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6061433Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
2026-09-10T00:58:17.6061736Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS$$$view10.gravar(Unknown Source)
2026-09-10T00:58:17.6061941Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.6062124Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.6062398Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
2026-09-10T00:58:17.6062743Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
2026-09-10T00:58:17.6063082Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
2026-09-10T00:58:17.6063468Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
2026-09-10T00:58:17.6063804Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
2026-09-10T00:58:17.6064144Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS$Proxy$_$$_Weld$EnterpriseProxy$.gravar(Unknown Source)
2026-09-10T00:58:17.6064480Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig.onStartup(SecurityConfig.java:71)
2026-09-10T00:58:17.6064728Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.6064911Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.6065240Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
2026-09-10T00:58:17.6065583Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6065890Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6066241Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-10T00:58:17.6066636Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:126)
2026-09-10T00:58:17.6066989Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:112)
2026-09-10T00:58:17.6067370Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6067684Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6068056Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:87)
2026-09-10T00:58:17.6068425Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-10T00:58:17.6068745Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6069071Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
2026-09-10T00:58:17.6069389Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6069711Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
2026-09-10T00:58:17.6070023Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6070370Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
2026-09-10T00:58:17.6070700Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6071028Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:111)
2026-09-10T00:58:17.6071344Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6071652Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-10T00:58:17.6071959Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6072268Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254)
2026-09-10T00:58:17.6072561Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:416)
2026-09-10T00:58:17.6072889Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:68)
2026-09-10T00:58:17.6073241Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6073560Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
2026-09-10T00:58:17.6073878Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6074241Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-10T00:58:17.6074603Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6074928Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-10T00:58:17.6075246Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6075560Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-10T00:58:17.6075889Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6076237Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.StartupCountDownInterceptor.processInvocation(StartupCountDownInterceptor.java:25)
2026-09-10T00:58:17.6076549Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6076860Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6077186Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:168)
2026-09-10T00:58:17.6077402Z 	... 13 more
2026-09-10T00:58:17.6077604Z Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-10T00:58:17.6077975Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:61)
2026-09-10T00:58:17.6078299Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
2026-09-10T00:58:17.6078615Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
2026-09-10T00:58:17.6078953Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
2026-09-10T00:58:17.6079321Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
2026-09-10T00:58:17.6079674Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
2026-09-10T00:58:17.6080016Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
2026-09-10T00:58:17.6080373Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
2026-09-10T00:58:17.6080777Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
2026-09-10T00:58:17.6081124Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
2026-09-10T00:58:17.6081457Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:227)
2026-09-10T00:58:17.6081807Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:164)
2026-09-10T00:58:17.6082191Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
2026-09-10T00:58:17.6082605Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
2026-09-10T00:58:17.6082944Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
2026-09-10T00:58:17.6083268Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
2026-09-10T00:58:17.6083573Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
2026-09-10T00:58:17.6083887Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
2026-09-10T00:58:17.6084218Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
2026-09-10T00:58:17.6084565Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
2026-09-10T00:58:17.6084899Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
2026-09-10T00:58:17.6085214Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
2026-09-10T00:58:17.6085531Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:107)
2026-09-10T00:58:17.6085908Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:300)
2026-09-10T00:58:17.6086254Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:241)
2026-09-10T00:58:17.6086568Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
2026-09-10T00:58:17.6086878Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
2026-09-10T00:58:17.6087184Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.getSingleResult(AbstractSelectionQuery.java:473)
2026-09-10T00:58:17.6087602Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRepository.consultarPorNome(PerfilRepository.java:31)
2026-09-10T00:58:17.6087993Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRepository$Proxy$_$$_WeldClientProxy.consultarPorNome(Unknown Source)
2026-09-10T00:58:17.6088325Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS.gravar(PerfilAS.java:132)
2026-09-10T00:58:17.6088595Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.6088774Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.6089096Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
2026-09-10T00:58:17.6089412Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6089762Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6090099Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-10T00:58:17.6090464Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
2026-09-10T00:58:17.6090813Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
2026-09-10T00:58:17.6091172Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
2026-09-10T00:58:17.6091474Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6091812Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
2026-09-10T00:58:17.6092140Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6092471Z 	at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
2026-09-10T00:58:17.6092781Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6093111Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-10T00:58:17.6093415Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6093718Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
2026-09-10T00:58:17.6094017Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6094320Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6094669Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
2026-09-10T00:58:17.6095001Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6095314Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
2026-09-10T00:58:17.6095625Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6095968Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
2026-09-10T00:58:17.6096319Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6096616Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
2026-09-10T00:58:17.6096769Z 	... 103 more
2026-09-10T00:58:17.6096927Z Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-10T00:58:17.6097317Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:160)
2026-09-10T00:58:17.6097746Z 	at org.jboss.as.connector@8.0.13.GA-redhat-00002//org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
2026-09-10T00:58:17.6098131Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
2026-09-10T00:58:17.6098507Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.internal.NonContextualJdbcConnectionAccess.obtainConnection(NonContextualJdbcConnectionAccess.java:38)
2026-09-10T00:58:17.6098893Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:113)
2026-09-10T00:58:17.6099061Z 	... 156 more
2026-09-10T00:58:17.6099214Z Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-10T00:58:17.6099562Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:690)
2026-09-10T00:58:17.6100002Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
2026-09-10T00:58:17.6100400Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
2026-09-10T00:58:17.6100751Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
2026-09-10T00:58:17.6100916Z 	... 160 more
2026-09-10T00:58:17.6101060Z Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
2026-09-10T00:58:17.6101426Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
2026-09-10T00:58:17.6102695Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
2026-09-10T00:58:17.6103105Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
2026-09-10T00:58:17.6103568Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1381)
2026-09-10T00:58:17.6104038Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:534)
2026-09-10T00:58:17.6104439Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getTransactionNewConnection(AbstractPool.java:770)
2026-09-10T00:58:17.6104825Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:666)
2026-09-10T00:58:17.6105194Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
2026-09-10T00:58:17.6105374Z 	... 163 more
2026-09-10T00:58:17.6105901Z Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: "encrypt" property is set to "true" and "trustServerCertificate" property is set to "true" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (unsupported_certificate) Certificates do not conform to algorithm constraints. ClientConnectionId:7bd656fd-4c21-46d4-ad06-1ec1dcceea94
2026-09-10T00:58:17.6106275Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.terminate(SQLServerConnection.java:4290)
2026-09-10T00:58:17.6106509Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1965)
2026-09-10T00:58:17.6106710Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:3816)
2026-09-10T00:58:17.6106920Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:3372)
2026-09-10T00:58:17.6107149Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:3197)
2026-09-10T00:58:17.6107428Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:1971)
2026-09-10T00:58:17.6107653Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:1263)
2026-09-10T00:58:17.6108012Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
2026-09-10T00:58:17.6108207Z 	... 170 more
2026-09-10T00:58:17.6108353Z Caused by: javax.net.ssl.SSLHandshakeException: (unsupported_certificate) Certificates do not conform to algorithm constraints
2026-09-10T00:58:17.6108537Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130)
2026-09-10T00:58:17.6108726Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:383)
2026-09-10T00:58:17.6108893Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:326)
2026-09-10T00:58:17.6109081Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-09-10T00:58:17.6109287Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647)
2026-09-10T00:58:17.6109523Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467)
2026-09-10T00:58:17.6109755Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363)
2026-09-10T00:58:17.6109941Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393)
2026-09-10T00:58:17.6110116Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:477)
2026-09-10T00:58:17.6110293Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:448)
2026-09-10T00:58:17.6110483Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:206)
2026-09-10T00:58:17.6110666Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:172)
2026-09-10T00:58:17.6110835Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1506)
2026-09-10T00:58:17.6111019Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1421)
2026-09-10T00:58:17.6111217Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:455)
2026-09-10T00:58:17.6111447Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:426)
2026-09-10T00:58:17.6111626Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1854)
2026-09-10T00:58:17.6111778Z 	... 176 more
2026-09-10T00:58:17.6111966Z Caused by: java.security.cert.CertificateException: Certificates do not conform to algorithm constraints
2026-09-10T00:58:17.6112169Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1557)
2026-09-10T00:58:17.6112377Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAdditionalTrust(SSLContextImpl.java:1484)
2026-09-10T00:58:17.6112618Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkServerTrusted(SSLContextImpl.java:1431)
2026-09-10T00:58:17.6112844Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:631)
2026-09-10T00:58:17.6112997Z 	... 188 more
2026-09-10T00:58:17.6113161Z Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA
2026-09-10T00:58:17.6113368Z 	at java.base/sun.security.provider.certpath.AlgorithmChecker.check(AlgorithmChecker.java:231)
2026-09-10T00:58:17.6113565Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1553)
2026-09-10T00:58:17.6113714Z 	... 191 more
2026-09-10T00:58:17.6113780Z 
2026-09-10T00:58:17.6114136Z [0m[0m21:57:30,110 INFO  [com.hazelcast.spi.impl.operationexecutor.impl.OperationExecutorImpl] (ServerService Thread Pool -- 53) [25.2.32.33]:5701 [dev] [3.12.12] Starting 2 partition threads and 3 generic threads (1 dedicated for priority tasks)
2026-09-10T00:58:17.6114679Z [0m[0m21:57:30,111 INFO  [com.hazelcast.internal.diagnostics.Diagnostics] (ServerService Thread Pool -- 53) [25.2.32.33]:5701 [dev] [3.12.12] Diagnostics disabled. To enable add -Dhazelcast.diagnostics.enabled=true to the JVM arguments.
2026-09-10T00:58:17.6115090Z [0m[0m21:57:30,113 INFO  [com.hazelcast.core.LifecycleService] (ServerService Thread Pool -- 53) [25.2.32.33]:5701 [dev] [3.12.12] [25.2.32.33]:5701 is STARTING
2026-09-10T00:58:17.6115472Z [0m[33m21:57:30,187 WARNING [com.hazelcast.instance.Node] (ServerService Thread Pool -- 53) [25.2.32.33]:5701 [dev] [3.12.12] No join method is enabled! Starting standalone.
2026-09-10T00:58:17.6115834Z [0m[0m21:57:30,199 INFO  [com.hazelcast.core.LifecycleService] (ServerService Thread Pool -- 53) [25.2.32.33]:5701 [dev] [3.12.12] [25.2.32.33]:5701 is STARTED
2026-09-10T00:58:17.6116191Z [0m[0m21:57:30,200 INFO  [br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS] (ServerService Thread Pool -- 53) Atualizando o cache de 'PERFIL_RECURSO'
2026-09-10T00:58:17.6117633Z [0m[0m21:57:30,203 INFO  [com.hazelcast.internal.diagnostics.HealthMonitor] (hz._hzInstance_1_dev.HealthMonitor) [25.2.32.33]:5701 [dev] [3.12.12] processors=1, physical.memory.total=2.0G, physical.memory.free=1.3G, swap.space.total=0, swap.space.free=0, heap.memory.used=210.7M, heap.memory.free=1.8M, heap.memory.total=212.5M, heap.memory.max=1.4G, heap.memory.used/total=99.09%, heap.memory.used/max=14.44%, minor.gc.count=0, minor.gc.time=0ms, major.gc.count=0, major.gc.time=0ms, load.process=0.00%, load.system=0.00%, load.systemAverage=6.00, thread.count=126, thread.peakCount=126, cluster.timeDiff=0, event.q.size=0, executor.q.async.size=0, executor.q.client.size=0, executor.q.client.query.size=0, executor.q.client.blocking.size=0, executor.q.query.size=0, executor.q.scheduled.size=0, executor.q.io.size=0, executor.q.system.size=0, executor.q.operations.size=0, executor.q.priorityOperation.size=0, operations.completed.count=1, executor.q.mapLoad.size=0, executor.q.mapLoadAllKeys.size=0, executor.q.cluster.size=0, executor.q.response.size=0, operations.running.count=0, operations.pending.invocations.percentage=0.00%, operations.pending.invocations.count=0, proxy.count=0, clientEndpoint.count=0, connection.active.count=0, client.connection.count=0, connection.count=0
2026-09-10T00:58:17.6118690Z [0m[0m21:57:30,212 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.seguranca.ContextoSegurancaHelper] (ServerService Thread Pool -- 53) SEGURANCA - Operacao durante inicializacao permitida sem contexto. Operacao: PerfilRecurso.createQuery
2026-09-10T00:58:17.6118992Z [0m[0m21:57:30,225 INFO  [stdout] (ServerService Thread Pool -- 53) Hibernate: 
2026-09-10T00:58:17.6119222Z [0m[0m21:57:30,225 INFO  [stdout] (ServerService Thread Pool -- 53)     select
2026-09-10T00:58:17.6119464Z [0m[0m21:57:30,225 INFO  [stdout] (ServerService Thread Pool -- 53)         distinct p2_0.NO_PERFIL_ACESSO 
2026-09-10T00:58:17.6119716Z [0m[0m21:57:30,225 INFO  [stdout] (ServerService Thread Pool -- 53)     from
2026-09-10T00:58:17.6119962Z [0m[0m21:57:30,225 INFO  [stdout] (ServerService Thread Pool -- 53)         dbo.HDGTB013_PERMISSAO_PERFIL p1_0 
2026-09-10T00:58:17.6120188Z [0m[0m21:57:30,225 INFO  [stdout] (ServerService Thread Pool -- 53)     join
2026-09-10T00:58:17.6120445Z [0m[0m21:57:30,225 INFO  [stdout] (ServerService Thread Pool -- 53)         dbo.HDGTB011_PERFIL_ACESSO p2_0 
2026-09-10T00:58:17.6120718Z [0m[0m21:57:30,225 INFO  [stdout] (ServerService Thread Pool -- 53)             on p2_0.CO_PERFIL_ID=p1_0.CO_PERFIL_ID
2026-09-10T00:58:17.6121112Z [0m[33m21:57:30,291 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (ServerService Thread Pool -- 53) IJ000604: Throwable while attempting to get a new connection: null: jakarta.resource.ResourceException: IJ031084: Unable to create connection
2026-09-10T00:58:17.6121552Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
2026-09-10T00:58:17.6121982Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
2026-09-10T00:58:17.6122394Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
2026-09-10T00:58:17.6122842Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1381)
2026-09-10T00:58:17.6123311Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:534)
2026-09-10T00:58:17.6123695Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getTransactionNewConnection(AbstractPool.java:770)
2026-09-10T00:58:17.6124044Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:666)
2026-09-10T00:58:17.6124398Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
2026-09-10T00:58:17.6124770Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
2026-09-10T00:58:17.6125143Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
2026-09-10T00:58:17.6125507Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
2026-09-10T00:58:17.6125859Z 	at org.jboss.as.connector@8.0.13.GA-redhat-00002//org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
2026-09-10T00:58:17.6126250Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
2026-09-10T00:58:17.6126625Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.internal.NonContextualJdbcConnectionAccess.obtainConnection(NonContextualJdbcConnectionAccess.java:38)
2026-09-10T00:58:17.6126981Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:113)
2026-09-10T00:58:17.6127443Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
2026-09-10T00:58:17.6127795Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
2026-09-10T00:58:17.6128124Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
2026-09-10T00:58:17.6128505Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
2026-09-10T00:58:17.6128868Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
2026-09-10T00:58:17.6129209Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
2026-09-10T00:58:17.6129551Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:227)
2026-09-10T00:58:17.6129907Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:164)
2026-09-10T00:58:17.6130250Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
2026-09-10T00:58:17.6130587Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
2026-09-10T00:58:17.6130905Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
2026-09-10T00:58:17.6131249Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
2026-09-10T00:58:17.6131561Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
2026-09-10T00:58:17.6131882Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
2026-09-10T00:58:17.6132214Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
2026-09-10T00:58:17.6132572Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
2026-09-10T00:58:17.6132914Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
2026-09-10T00:58:17.6133220Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
2026-09-10T00:58:17.6133538Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:107)
2026-09-10T00:58:17.6133934Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:300)
2026-09-10T00:58:17.6134282Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:241)
2026-09-10T00:58:17.6134597Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
2026-09-10T00:58:17.6134930Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
2026-09-10T00:58:17.6135216Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.Query.getResultList(Query.java:119)
2026-09-10T00:58:17.6135579Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRecursoRepository.consultarTodosPerfisRelacionados(PerfilRecursoRepository.java:35)
2026-09-10T00:58:17.6136022Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRecursoRepository$Proxy$_$$_WeldClientProxy.consultarTodosPerfisRelacionados(Unknown Source)
2026-09-10T00:58:17.6136407Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS.consultarTodosPerfisRelacionados(PerfilRecursoAS.java:132)
2026-09-10T00:58:17.6136663Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.6136849Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.6137165Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
2026-09-10T00:58:17.6137549Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6137867Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6138289Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-10T00:58:17.6138670Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
2026-09-10T00:58:17.6139021Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
2026-09-10T00:58:17.6139383Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
2026-09-10T00:58:17.6139696Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6140045Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
2026-09-10T00:58:17.6140364Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6140685Z 	at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
2026-09-10T00:58:17.6141010Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6141347Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-10T00:58:17.6141704Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6142010Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
2026-09-10T00:58:17.6142321Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6142635Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6143009Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
2026-09-10T00:58:17.6143331Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6143649Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
2026-09-10T00:58:17.6143959Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6144301Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
2026-09-10T00:58:17.6144619Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6144935Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
2026-09-10T00:58:17.6145243Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.supports(CMTTxInterceptor.java:448)
2026-09-10T00:58:17.6145540Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:164)
2026-09-10T00:58:17.6145839Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6146156Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6146517Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
2026-09-10T00:58:17.6146889Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-10T00:58:17.6147206Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6147622Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-10T00:58:17.6147972Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6148305Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
2026-09-10T00:58:17.6148613Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6148947Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
2026-09-10T00:58:17.6149263Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6149617Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
2026-09-10T00:58:17.6149917Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6150237Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
2026-09-10T00:58:17.6150559Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6150930Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
2026-09-10T00:58:17.6151244Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6151553Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
2026-09-10T00:58:17.6151872Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6152208Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-10T00:58:17.6152515Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6152844Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-10T00:58:17.6153150Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6153435Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
2026-09-10T00:58:17.6153772Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
2026-09-10T00:58:17.6154110Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
2026-09-10T00:58:17.6154430Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6154739Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6155024Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
2026-09-10T00:58:17.6155324Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
2026-09-10T00:58:17.6155633Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6155946Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
2026-09-10T00:58:17.6156282Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
2026-09-10T00:58:17.6156605Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
2026-09-10T00:58:17.6156906Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
2026-09-10T00:58:17.6157309Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
2026-09-10T00:58:17.6157636Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6157940Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6158258Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
2026-09-10T00:58:17.6158638Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS$$$view26.consultarTodosPerfisRelacionados(Unknown Source)
2026-09-10T00:58:17.6158870Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.6159058Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.6159337Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
2026-09-10T00:58:17.6159673Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
2026-09-10T00:58:17.6160024Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
2026-09-10T00:58:17.6160407Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
2026-09-10T00:58:17.6160744Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
2026-09-10T00:58:17.6161116Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS$Proxy$_$$_Weld$EnterpriseProxy$.consultarTodosPerfisRelacionados(Unknown Source)
2026-09-10T00:58:17.6161504Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarPerfilRecursoCache(AtualizadorCacheAS.java:128)
2026-09-10T00:58:17.6161864Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarCache(AtualizadorCacheAS.java:80)
2026-09-10T00:58:17.6162114Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.6162297Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.6162595Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
2026-09-10T00:58:17.6162935Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6163241Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6163593Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-10T00:58:17.6163955Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
2026-09-10T00:58:17.6164305Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
2026-09-10T00:58:17.6164640Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
2026-09-10T00:58:17.6165050Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6165380Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
2026-09-10T00:58:17.6165697Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6166010Z 	at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
2026-09-10T00:58:17.6166355Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6166677Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-10T00:58:17.6167007Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6167369Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
2026-09-10T00:58:17.6167697Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6168008Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6168413Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
2026-09-10T00:58:17.6168729Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6169056Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
2026-09-10T00:58:17.6169364Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6169703Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
2026-09-10T00:58:17.6170019Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6170329Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
2026-09-10T00:58:17.6170619Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.supports(CMTTxInterceptor.java:448)
2026-09-10T00:58:17.6170934Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:164)
2026-09-10T00:58:17.6171227Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6171537Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6171892Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
2026-09-10T00:58:17.6172275Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-10T00:58:17.6172622Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6173144Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-10T00:58:17.6173494Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6173825Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
2026-09-10T00:58:17.6174176Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6174491Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
2026-09-10T00:58:17.6174787Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6175104Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
2026-09-10T00:58:17.6175417Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6175741Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
2026-09-10T00:58:17.6176067Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6176408Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
2026-09-10T00:58:17.6176718Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6177037Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
2026-09-10T00:58:17.6177396Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6177743Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-10T00:58:17.6178053Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6178374Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-10T00:58:17.6178839Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6179135Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
2026-09-10T00:58:17.6179467Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
2026-09-10T00:58:17.6179815Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
2026-09-10T00:58:17.6180122Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6180422Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6180705Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
2026-09-10T00:58:17.6181039Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
2026-09-10T00:58:17.6181332Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6181643Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
2026-09-10T00:58:17.6181981Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
2026-09-10T00:58:17.6182326Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
2026-09-10T00:58:17.6182638Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
2026-09-10T00:58:17.6182952Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
2026-09-10T00:58:17.6183253Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6183555Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6183855Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
2026-09-10T00:58:17.6184172Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS$$$view29.verificarEAtualizarCache(Unknown Source)
2026-09-10T00:58:17.6184393Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.6184574Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.6184848Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
2026-09-10T00:58:17.6185175Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
2026-09-10T00:58:17.6185511Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
2026-09-10T00:58:17.6185892Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
2026-09-10T00:58:17.6186234Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
2026-09-10T00:58:17.6186578Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS$Proxy$_$$_Weld$EnterpriseProxy$.verificarEAtualizarCache(Unknown Source)
2026-09-10T00:58:17.6186931Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.comum.config.cache.CacheConfig.onStartup(CacheConfig.java:37)
2026-09-10T00:58:17.6187185Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.6187452Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.6187778Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
2026-09-10T00:58:17.6188117Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6188458Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6188811Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-10T00:58:17.6189189Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:126)
2026-09-10T00:58:17.6189540Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:112)
2026-09-10T00:58:17.6189870Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6190177Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6190536Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:87)
2026-09-10T00:58:17.6190908Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-10T00:58:17.6191247Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6191584Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
2026-09-10T00:58:17.6191884Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6192244Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
2026-09-10T00:58:17.6192582Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6192943Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
2026-09-10T00:58:17.6193273Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6193620Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:111)
2026-09-10T00:58:17.6193928Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6194260Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-10T00:58:17.6194569Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6194882Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254)
2026-09-10T00:58:17.6195274Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:416)
2026-09-10T00:58:17.6195625Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:68)
2026-09-10T00:58:17.6195926Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6196281Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
2026-09-10T00:58:17.6196662Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6197023Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-10T00:58:17.6197461Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6197856Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-10T00:58:17.6198160Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6198484Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-10T00:58:17.6198800Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6199134Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.StartupCountDownInterceptor.processInvocation(StartupCountDownInterceptor.java:25)
2026-09-10T00:58:17.6199447Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6199773Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6200079Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:168)
2026-09-10T00:58:17.6200411Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:141)
2026-09-10T00:58:17.6200738Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
2026-09-10T00:58:17.6201072Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:127)
2026-09-10T00:58:17.6201415Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:141)
2026-09-10T00:58:17.6201735Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
2026-09-10T00:58:17.6201932Z 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
2026-09-10T00:58:17.6202112Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
2026-09-10T00:58:17.6202429Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
2026-09-10T00:58:17.6202756Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
2026-09-10T00:58:17.6203070Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
2026-09-10T00:58:17.6203383Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
2026-09-10T00:58:17.6203580Z 	at java.base/java.lang.Thread.run(Thread.java:1583)
2026-09-10T00:58:17.6203839Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)
2026-09-10T00:58:17.6204411Z Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: "encrypt" property is set to "true" and "trustServerCertificate" property is set to "true" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (unsupported_certificate) Certificates do not conform to algorithm constraints. ClientConnectionId:8fbee5c9-a1bd-4a80-8dcf-56d1f4118071
2026-09-10T00:58:17.6204860Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.terminate(SQLServerConnection.java:4290)
2026-09-10T00:58:17.6205086Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1965)
2026-09-10T00:58:17.6205285Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:3816)
2026-09-10T00:58:17.6205549Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:3372)
2026-09-10T00:58:17.6205789Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:3197)
2026-09-10T00:58:17.6206003Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:1971)
2026-09-10T00:58:17.6206219Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:1263)
2026-09-10T00:58:17.6206610Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
2026-09-10T00:58:17.6206803Z 	... 248 more
2026-09-10T00:58:17.6206967Z Caused by: javax.net.ssl.SSLHandshakeException: (unsupported_certificate) Certificates do not conform to algorithm constraints
2026-09-10T00:58:17.6207149Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130)
2026-09-10T00:58:17.6207397Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:383)
2026-09-10T00:58:17.6207606Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:326)
2026-09-10T00:58:17.6207776Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-09-10T00:58:17.6208005Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647)
2026-09-10T00:58:17.6208250Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467)
2026-09-10T00:58:17.6208485Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363)
2026-09-10T00:58:17.6208700Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393)
2026-09-10T00:58:17.6208872Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:477)
2026-09-10T00:58:17.6209066Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:448)
2026-09-10T00:58:17.6209262Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:206)
2026-09-10T00:58:17.6209459Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:172)
2026-09-10T00:58:17.6209621Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1506)
2026-09-10T00:58:17.6209824Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1421)
2026-09-10T00:58:17.6210030Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:455)
2026-09-10T00:58:17.6210232Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:426)
2026-09-10T00:58:17.6210439Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1854)
2026-09-10T00:58:17.6210580Z 	... 254 more
2026-09-10T00:58:17.6210733Z Caused by: java.security.cert.CertificateException: Certificates do not conform to algorithm constraints
2026-09-10T00:58:17.6210930Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1557)
2026-09-10T00:58:17.6211162Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAdditionalTrust(SSLContextImpl.java:1484)
2026-09-10T00:58:17.6211430Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkServerTrusted(SSLContextImpl.java:1431)
2026-09-10T00:58:17.6211642Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:631)
2026-09-10T00:58:17.6211820Z 	... 266 more
2026-09-10T00:58:17.6211991Z Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA
2026-09-10T00:58:17.6212200Z 	at java.base/sun.security.provider.certpath.AlgorithmChecker.check(AlgorithmChecker.java:231)
2026-09-10T00:58:17.6212433Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1553)
2026-09-10T00:58:17.6212574Z 	... 269 more
2026-09-10T00:58:17.6212616Z 
2026-09-10T00:58:17.6212859Z [0m[33m21:57:30,292 WARN  [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (ServerService Thread Pool -- 53) SQL Error: 0, SQLState: null
2026-09-10T00:58:17.6213275Z [0m[31m21:57:30,292 ERROR [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (ServerService Thread Pool -- 53) jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-10T00:58:17.6213980Z [0m[31m21:57:30,292 ERROR [org.jboss.as.ejb3.invocation] (ServerService Thread Pool -- 53) WFLYEJB0034: Jakarta Enterprise Beans Invocation failed on component PerfilRecursoAS for method public java.util.List br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS.consultarTodosPerfisRelacionados(): jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-10T00:58:17.6214470Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:219)
2026-09-10T00:58:17.6214783Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.supports(CMTTxInterceptor.java:448)
2026-09-10T00:58:17.6215111Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:164)
2026-09-10T00:58:17.6215420Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6215719Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6216095Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
2026-09-10T00:58:17.6216497Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-10T00:58:17.6216845Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6217220Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-10T00:58:17.6217646Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6218004Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
2026-09-10T00:58:17.6218307Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6218647Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
2026-09-10T00:58:17.6219020Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6219360Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
2026-09-10T00:58:17.6219682Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6220028Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
2026-09-10T00:58:17.6220375Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6220733Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
2026-09-10T00:58:17.6221074Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6221415Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
2026-09-10T00:58:17.6221740Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6222080Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-10T00:58:17.6222384Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6222732Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-10T00:58:17.6223076Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6223387Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
2026-09-10T00:58:17.6223731Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
2026-09-10T00:58:17.6224061Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
2026-09-10T00:58:17.6224386Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6224712Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6225035Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
2026-09-10T00:58:17.6225355Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
2026-09-10T00:58:17.6225672Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6225976Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
2026-09-10T00:58:17.6226341Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
2026-09-10T00:58:17.6226790Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
2026-09-10T00:58:17.6227157Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
2026-09-10T00:58:17.6227569Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
2026-09-10T00:58:17.6227892Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6228187Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6228557Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
2026-09-10T00:58:17.6228913Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS$$$view26.consultarTodosPerfisRelacionados(Unknown Source)
2026-09-10T00:58:17.6229170Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.6229376Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.6229644Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
2026-09-10T00:58:17.6229996Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
2026-09-10T00:58:17.6230359Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
2026-09-10T00:58:17.6230759Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
2026-09-10T00:58:17.6231127Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
2026-09-10T00:58:17.6231506Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS$Proxy$_$$_Weld$EnterpriseProxy$.consultarTodosPerfisRelacionados(Unknown Source)
2026-09-10T00:58:17.6231896Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarPerfilRecursoCache(AtualizadorCacheAS.java:128)
2026-09-10T00:58:17.6232256Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarCache(AtualizadorCacheAS.java:80)
2026-09-10T00:58:17.6232517Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.6232722Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.6233050Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
2026-09-10T00:58:17.6233393Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6233721Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6234055Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-10T00:58:17.6234433Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
2026-09-10T00:58:17.6234805Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
2026-09-10T00:58:17.6235201Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
2026-09-10T00:58:17.6235532Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6235886Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
2026-09-10T00:58:17.6236198Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6236614Z 	at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
2026-09-10T00:58:17.6236949Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6237360Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-10T00:58:17.6237710Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6238038Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
2026-09-10T00:58:17.6238373Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6238868Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6239332Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
2026-09-10T00:58:17.6239781Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6240202Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
2026-09-10T00:58:17.6240601Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6240922Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
2026-09-10T00:58:17.6241264Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6241583Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
2026-09-10T00:58:17.6241909Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.supports(CMTTxInterceptor.java:448)
2026-09-10T00:58:17.6242273Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:164)
2026-09-10T00:58:17.6242584Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6242919Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6243309Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
2026-09-10T00:58:17.6243700Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-10T00:58:17.6244137Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6244519Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-10T00:58:17.6244865Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6245182Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
2026-09-10T00:58:17.6245551Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6245887Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
2026-09-10T00:58:17.6246219Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6246556Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
2026-09-10T00:58:17.6246887Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6247205Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
2026-09-10T00:58:17.6247630Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6247984Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
2026-09-10T00:58:17.6248327Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6248663Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
2026-09-10T00:58:17.6248975Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6249287Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-10T00:58:17.6249611Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6249956Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-10T00:58:17.6250274Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6250583Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
2026-09-10T00:58:17.6250902Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
2026-09-10T00:58:17.6251265Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
2026-09-10T00:58:17.6251601Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6251925Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6252277Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
2026-09-10T00:58:17.6252597Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
2026-09-10T00:58:17.6252885Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6253222Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
2026-09-10T00:58:17.6253612Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
2026-09-10T00:58:17.6253959Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
2026-09-10T00:58:17.6254302Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
2026-09-10T00:58:17.6254636Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
2026-09-10T00:58:17.6254926Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6255274Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6255603Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
2026-09-10T00:58:17.6255953Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS$$$view29.verificarEAtualizarCache(Unknown Source)
2026-09-10T00:58:17.6256200Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.6256404Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.6256664Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
2026-09-10T00:58:17.6257018Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
2026-09-10T00:58:17.6257432Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
2026-09-10T00:58:17.6257841Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
2026-09-10T00:58:17.6258211Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
2026-09-10T00:58:17.6258578Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS$Proxy$_$$_Weld$EnterpriseProxy$.verificarEAtualizarCache(Unknown Source)
2026-09-10T00:58:17.6258917Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.comum.config.cache.CacheConfig.onStartup(CacheConfig.java:37)
2026-09-10T00:58:17.6259171Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.6259378Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.6259727Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
2026-09-10T00:58:17.6260076Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6260433Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6260795Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-10T00:58:17.6261176Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:126)
2026-09-10T00:58:17.6261584Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:112)
2026-09-10T00:58:17.6261923Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6262252Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6262670Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:87)
2026-09-10T00:58:17.6263057Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-10T00:58:17.6263403Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6263799Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
2026-09-10T00:58:17.6264134Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6264488Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
2026-09-10T00:58:17.6264826Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6265151Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
2026-09-10T00:58:17.6265496Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6265854Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:111)
2026-09-10T00:58:17.6266191Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6266534Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-10T00:58:17.6266869Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6267152Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254)
2026-09-10T00:58:17.6267596Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:416)
2026-09-10T00:58:17.6267938Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:68)
2026-09-10T00:58:17.6268267Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6268657Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
2026-09-10T00:58:17.6268993Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6269336Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-10T00:58:17.6269713Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6270059Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-10T00:58:17.6270395Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6270742Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-10T00:58:17.6271074Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6271399Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.StartupCountDownInterceptor.processInvocation(StartupCountDownInterceptor.java:25)
2026-09-10T00:58:17.6271739Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6272063Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6272455Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:168)
2026-09-10T00:58:17.6272797Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:141)
2026-09-10T00:58:17.6273122Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
2026-09-10T00:58:17.6273439Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:127)
2026-09-10T00:58:17.6273789Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:141)
2026-09-10T00:58:17.6274121Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
2026-09-10T00:58:17.6274347Z 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
2026-09-10T00:58:17.6274549Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
2026-09-10T00:58:17.6274837Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
2026-09-10T00:58:17.6275178Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
2026-09-10T00:58:17.6275521Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
2026-09-10T00:58:17.6275864Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
2026-09-10T00:58:17.6276073Z 	at java.base/java.lang.Thread.run(Thread.java:1583)
2026-09-10T00:58:17.6276311Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)
2026-09-10T00:58:17.6276608Z Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-10T00:58:17.6276994Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:61)
2026-09-10T00:58:17.6277392Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
2026-09-10T00:58:17.6277730Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
2026-09-10T00:58:17.6278132Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
2026-09-10T00:58:17.6278492Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
2026-09-10T00:58:17.6278860Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
2026-09-10T00:58:17.6279213Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
2026-09-10T00:58:17.6279595Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
2026-09-10T00:58:17.6279980Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
2026-09-10T00:58:17.6280353Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
2026-09-10T00:58:17.6280724Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:227)
2026-09-10T00:58:17.6281051Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:164)
2026-09-10T00:58:17.6281405Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
2026-09-10T00:58:17.6281763Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
2026-09-10T00:58:17.6282159Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
2026-09-10T00:58:17.6282514Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
2026-09-10T00:58:17.6282849Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
2026-09-10T00:58:17.6283146Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
2026-09-10T00:58:17.6283500Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
2026-09-10T00:58:17.6283872Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
2026-09-10T00:58:17.6284229Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
2026-09-10T00:58:17.6284552Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
2026-09-10T00:58:17.6284934Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:107)
2026-09-10T00:58:17.6285279Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:300)
2026-09-10T00:58:17.6285647Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:241)
2026-09-10T00:58:17.6285996Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
2026-09-10T00:58:17.6286316Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
2026-09-10T00:58:17.6286614Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.Query.getResultList(Query.java:119)
2026-09-10T00:58:17.6287003Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRecursoRepository.consultarTodosPerfisRelacionados(PerfilRecursoRepository.java:35)
2026-09-10T00:58:17.6287475Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRecursoRepository$Proxy$_$$_WeldClientProxy.consultarTodosPerfisRelacionados(Unknown Source)
2026-09-10T00:58:17.6287881Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS.consultarTodosPerfisRelacionados(PerfilRecursoAS.java:132)
2026-09-10T00:58:17.6288147Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.6288352Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.6288686Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
2026-09-10T00:58:17.6289027Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6289334Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6289699Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-10T00:58:17.6290073Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
2026-09-10T00:58:17.6290443Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
2026-09-10T00:58:17.6290808Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
2026-09-10T00:58:17.6291149Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6291478Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
2026-09-10T00:58:17.6291825Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6292172Z 	at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
2026-09-10T00:58:17.6292518Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6292904Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-10T00:58:17.6293234Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6293526Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
2026-09-10T00:58:17.6293849Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6294200Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6294572Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
2026-09-10T00:58:17.6294914Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6295301Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
2026-09-10T00:58:17.6295622Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6295978Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
2026-09-10T00:58:17.6296317Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6296637Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
2026-09-10T00:58:17.6296810Z 	... 181 more
2026-09-10T00:58:17.6296998Z Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-10T00:58:17.6297377Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:160)
2026-09-10T00:58:17.6297758Z 	at org.jboss.as.connector@8.0.13.GA-redhat-00002//org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
2026-09-10T00:58:17.6298147Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
2026-09-10T00:58:17.6298530Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.internal.NonContextualJdbcConnectionAccess.obtainConnection(NonContextualJdbcConnectionAccess.java:38)
2026-09-10T00:58:17.6298923Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:113)
2026-09-10T00:58:17.6299120Z 	... 234 more
2026-09-10T00:58:17.6299263Z Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-10T00:58:17.6299633Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:690)
2026-09-10T00:58:17.6300034Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
2026-09-10T00:58:17.6300479Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
2026-09-10T00:58:17.6300896Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
2026-09-10T00:58:17.6301086Z 	... 238 more
2026-09-10T00:58:17.6301210Z Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
2026-09-10T00:58:17.6301580Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
2026-09-10T00:58:17.6302015Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
2026-09-10T00:58:17.6302473Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
2026-09-10T00:58:17.6302949Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1381)
2026-09-10T00:58:17.6303449Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:534)
2026-09-10T00:58:17.6303839Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getTransactionNewConnection(AbstractPool.java:770)
2026-09-10T00:58:17.6304206Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:666)
2026-09-10T00:58:17.6304587Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
2026-09-10T00:58:17.6304790Z 	... 241 more
2026-09-10T00:58:17.6305324Z Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: "encrypt" property is set to "true" and "trustServerCertificate" property is set to "true" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (unsupported_certificate) Certificates do not conform to algorithm constraints. ClientConnectionId:8fbee5c9-a1bd-4a80-8dcf-56d1f4118071
2026-09-10T00:58:17.6305697Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.terminate(SQLServerConnection.java:4290)
2026-09-10T00:58:17.6305929Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1965)
2026-09-10T00:58:17.6306132Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:3816)
2026-09-10T00:58:17.6306370Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:3372)
2026-09-10T00:58:17.6306608Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:3197)
2026-09-10T00:58:17.6306849Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:1971)
2026-09-10T00:58:17.6307082Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:1263)
2026-09-10T00:58:17.6307530Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
2026-09-10T00:58:17.6307727Z 	... 248 more
2026-09-10T00:58:17.6307899Z Caused by: javax.net.ssl.SSLHandshakeException: (unsupported_certificate) Certificates do not conform to algorithm constraints
2026-09-10T00:58:17.6308146Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130)
2026-09-10T00:58:17.6308346Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:383)
2026-09-10T00:58:17.6308547Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:326)
2026-09-10T00:58:17.6308719Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-09-10T00:58:17.6308950Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647)
2026-09-10T00:58:17.6309198Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467)
2026-09-10T00:58:17.6309479Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363)
2026-09-10T00:58:17.6309691Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393)
2026-09-10T00:58:17.6309862Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:477)
2026-09-10T00:58:17.6310067Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:448)
2026-09-10T00:58:17.6310270Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:206)
2026-09-10T00:58:17.6310464Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:172)
2026-09-10T00:58:17.6310626Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1506)
2026-09-10T00:58:17.6310834Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1421)
2026-09-10T00:58:17.6311042Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:455)
2026-09-10T00:58:17.6311246Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:426)
2026-09-10T00:58:17.6311452Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1854)
2026-09-10T00:58:17.6311590Z 	... 254 more
2026-09-10T00:58:17.6311754Z Caused by: java.security.cert.CertificateException: Certificates do not conform to algorithm constraints
2026-09-10T00:58:17.6311981Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1557)
2026-09-10T00:58:17.6312219Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAdditionalTrust(SSLContextImpl.java:1484)
2026-09-10T00:58:17.6312449Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkServerTrusted(SSLContextImpl.java:1431)
2026-09-10T00:58:17.6312655Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:631)
2026-09-10T00:58:17.6312833Z 	... 266 more
2026-09-10T00:58:17.6313006Z Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA
2026-09-10T00:58:17.6313227Z 	at java.base/sun.security.provider.certpath.AlgorithmChecker.check(AlgorithmChecker.java:231)
2026-09-10T00:58:17.6313455Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1553)
2026-09-10T00:58:17.6313597Z 	... 269 more
2026-09-10T00:58:17.6313661Z 
2026-09-10T00:58:17.6314231Z [0m[31m21:57:30,293 ERROR [org.jboss.as.ejb3.invocation] (ServerService Thread Pool -- 53) WFLYEJB0034: Jakarta Enterprise Beans Invocation failed on component AtualizadorCacheAS for method public void br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarCache(boolean): jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-10T00:58:17.6314740Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:219)
2026-09-10T00:58:17.6315064Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.supports(CMTTxInterceptor.java:448)
2026-09-10T00:58:17.6315417Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:164)
2026-09-10T00:58:17.6315741Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6316073Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6316457Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
2026-09-10T00:58:17.6316867Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-10T00:58:17.6317216Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6317646Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-10T00:58:17.6318003Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6318354Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
2026-09-10T00:58:17.6318692Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6319000Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
2026-09-10T00:58:17.6319331Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6319673Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
2026-09-10T00:58:17.6320001Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6320346Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
2026-09-10T00:58:17.6320677Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6321006Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
2026-09-10T00:58:17.6321340Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6321680Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
2026-09-10T00:58:17.6322014Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6322470Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-10T00:58:17.6322834Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6323150Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-10T00:58:17.6323488Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6323848Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
2026-09-10T00:58:17.6324200Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
2026-09-10T00:58:17.6324567Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
2026-09-10T00:58:17.6324930Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6325229Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6325551Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
2026-09-10T00:58:17.6325878Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
2026-09-10T00:58:17.6326195Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6326533Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
2026-09-10T00:58:17.6326897Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
2026-09-10T00:58:17.6327221Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
2026-09-10T00:58:17.6327626Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
2026-09-10T00:58:17.6328028Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
2026-09-10T00:58:17.6328475Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6328809Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6329117Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
2026-09-10T00:58:17.6329703Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS$$$view26.consultarTodosPerfisRelacionados(Unknown Source)
2026-09-10T00:58:17.6329960Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.6330169Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.6330467Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
2026-09-10T00:58:17.6330824Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
2026-09-10T00:58:17.6331158Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
2026-09-10T00:58:17.6331567Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
2026-09-10T00:58:17.6331935Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
2026-09-10T00:58:17.6332375Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS$Proxy$_$$_Weld$EnterpriseProxy$.consultarTodosPerfisRelacionados(Unknown Source)
2026-09-10T00:58:17.6332771Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarPerfilRecursoCache(AtualizadorCacheAS.java:128)
2026-09-10T00:58:17.6333157Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarCache(AtualizadorCacheAS.java:80)
2026-09-10T00:58:17.6333445Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.6333618Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.6333947Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
2026-09-10T00:58:17.6334293Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6334624Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6334988Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-10T00:58:17.6335333Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
2026-09-10T00:58:17.6335711Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
2026-09-10T00:58:17.6336081Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
2026-09-10T00:58:17.6336419Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6336774Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
2026-09-10T00:58:17.6337113Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6337481Z 	at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
2026-09-10T00:58:17.6337822Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6338170Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-10T00:58:17.6338706Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6339118Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
2026-09-10T00:58:17.6339535Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6339924Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6340300Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
2026-09-10T00:58:17.6340641Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6341027Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
2026-09-10T00:58:17.6341358Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6341707Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
2026-09-10T00:58:17.6342045Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6342364Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
2026-09-10T00:58:17.6342688Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.supports(CMTTxInterceptor.java:448)
2026-09-10T00:58:17.6343015Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:164)
2026-09-10T00:58:17.6343336Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6343661Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6344015Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
2026-09-10T00:58:17.6344413Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-10T00:58:17.6344755Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6345130Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-10T00:58:17.6345481Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6345824Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
2026-09-10T00:58:17.6346128Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6346466Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
2026-09-10T00:58:17.6346791Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6347130Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
2026-09-10T00:58:17.6347563Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6347918Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
2026-09-10T00:58:17.6348223Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6348578Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
2026-09-10T00:58:17.6348960Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6349298Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
2026-09-10T00:58:17.6349621Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6349962Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-10T00:58:17.6350289Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6350642Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-10T00:58:17.6350982Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6351293Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
2026-09-10T00:58:17.6351644Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
2026-09-10T00:58:17.6351999Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
2026-09-10T00:58:17.6352302Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6352627Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6352944Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
2026-09-10T00:58:17.6353245Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
2026-09-10T00:58:17.6353561Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6353895Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
2026-09-10T00:58:17.6354230Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
2026-09-10T00:58:17.6354581Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
2026-09-10T00:58:17.6354915Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
2026-09-10T00:58:17.6355255Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
2026-09-10T00:58:17.6355572Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6355895Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6356195Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
2026-09-10T00:58:17.6356546Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS$$$view29.verificarEAtualizarCache(Unknown Source)
2026-09-10T00:58:17.6356797Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.6357032Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.6357429Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
2026-09-10T00:58:17.6357765Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
2026-09-10T00:58:17.6358124Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
2026-09-10T00:58:17.6358564Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
2026-09-10T00:58:17.6358923Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
2026-09-10T00:58:17.6359297Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS$Proxy$_$$_Weld$EnterpriseProxy$.verificarEAtualizarCache(Unknown Source)
2026-09-10T00:58:17.6359659Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.comum.config.cache.CacheConfig.onStartup(CacheConfig.java:37)
2026-09-10T00:58:17.6359883Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.6360086Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.6360439Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
2026-09-10T00:58:17.6360795Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6361130Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6361495Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-10T00:58:17.6361847Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:126)
2026-09-10T00:58:17.6362228Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:112)
2026-09-10T00:58:17.6362568Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6362900Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6363281Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:87)
2026-09-10T00:58:17.6363670Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-10T00:58:17.6363980Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6364323Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
2026-09-10T00:58:17.6364657Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6365012Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
2026-09-10T00:58:17.6365385Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6365743Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
2026-09-10T00:58:17.6366087Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6366441Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:111)
2026-09-10T00:58:17.6366778Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6367126Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-10T00:58:17.6367557Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6367883Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254)
2026-09-10T00:58:17.6368175Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:416)
2026-09-10T00:58:17.6368517Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:68)
2026-09-10T00:58:17.6368843Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6369198Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
2026-09-10T00:58:17.6369537Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6369912Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-10T00:58:17.6370230Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6370574Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-10T00:58:17.6370913Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6371260Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-10T00:58:17.6371593Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6371945Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.StartupCountDownInterceptor.processInvocation(StartupCountDownInterceptor.java:25)
2026-09-10T00:58:17.6372252Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6372575Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6372922Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:168)
2026-09-10T00:58:17.6373300Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:141)
2026-09-10T00:58:17.6373623Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
2026-09-10T00:58:17.6373971Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:127)
2026-09-10T00:58:17.6374286Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:141)
2026-09-10T00:58:17.6374648Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
2026-09-10T00:58:17.6374874Z 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
2026-09-10T00:58:17.6375073Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
2026-09-10T00:58:17.6375397Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
2026-09-10T00:58:17.6375711Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
2026-09-10T00:58:17.6376122Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
2026-09-10T00:58:17.6376471Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
2026-09-10T00:58:17.6376684Z 	at java.base/java.lang.Thread.run(Thread.java:1583)
2026-09-10T00:58:17.6376961Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)
2026-09-10T00:58:17.6377232Z Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-10T00:58:17.6377706Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:61)
2026-09-10T00:58:17.6378059Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
2026-09-10T00:58:17.6378388Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
2026-09-10T00:58:17.6378760Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
2026-09-10T00:58:17.6379158Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
2026-09-10T00:58:17.6379523Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
2026-09-10T00:58:17.6379844Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
2026-09-10T00:58:17.6380236Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
2026-09-10T00:58:17.6380619Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
2026-09-10T00:58:17.6380994Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
2026-09-10T00:58:17.6381354Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:227)
2026-09-10T00:58:17.6381772Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:164)
2026-09-10T00:58:17.6382134Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
2026-09-10T00:58:17.6382471Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
2026-09-10T00:58:17.6382843Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
2026-09-10T00:58:17.6383196Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
2026-09-10T00:58:17.6383533Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
2026-09-10T00:58:17.6383856Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
2026-09-10T00:58:17.6384178Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
2026-09-10T00:58:17.6384553Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
2026-09-10T00:58:17.6384921Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
2026-09-10T00:58:17.6385249Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
2026-09-10T00:58:17.6385596Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:107)
2026-09-10T00:58:17.6385973Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:300)
2026-09-10T00:58:17.6386344Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:241)
2026-09-10T00:58:17.6386637Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
2026-09-10T00:58:17.6386963Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
2026-09-10T00:58:17.6387350Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.Query.getResultList(Query.java:119)
2026-09-10T00:58:17.6387760Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRecursoRepository.consultarTodosPerfisRelacionados(PerfilRecursoRepository.java:35)
2026-09-10T00:58:17.6388212Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRecursoRepository$Proxy$_$$_WeldClientProxy.consultarTodosPerfisRelacionados(Unknown Source)
2026-09-10T00:58:17.6388623Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS.consultarTodosPerfisRelacionados(PerfilRecursoAS.java:132)
2026-09-10T00:58:17.6388859Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.6389070Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.6389404Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
2026-09-10T00:58:17.6389851Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6390188Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6390561Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-10T00:58:17.6390912Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
2026-09-10T00:58:17.6391330Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
2026-09-10T00:58:17.6391698Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
2026-09-10T00:58:17.6392042Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6392399Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
2026-09-10T00:58:17.6392738Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6393046Z 	at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
2026-09-10T00:58:17.6393375Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6393724Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-10T00:58:17.6394062Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6394391Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
2026-09-10T00:58:17.6394714Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6395008Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6395375Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
2026-09-10T00:58:17.6395718Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6396064Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
2026-09-10T00:58:17.6396395Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6396747Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
2026-09-10T00:58:17.6397059Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6397474Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
2026-09-10T00:58:17.6397668Z 	... 181 more
2026-09-10T00:58:17.6397898Z Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-10T00:58:17.6398251Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:160)
2026-09-10T00:58:17.6398586Z 	at org.jboss.as.connector@8.0.13.GA-redhat-00002//org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
2026-09-10T00:58:17.6398975Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
2026-09-10T00:58:17.6399392Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.internal.NonContextualJdbcConnectionAccess.obtainConnection(NonContextualJdbcConnectionAccess.java:38)
2026-09-10T00:58:17.6399784Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:113)
2026-09-10T00:58:17.6399993Z 	... 234 more
2026-09-10T00:58:17.6400169Z Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-10T00:58:17.6400505Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:690)
2026-09-10T00:58:17.6400907Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
2026-09-10T00:58:17.6401303Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
2026-09-10T00:58:17.6401680Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
2026-09-10T00:58:17.6401873Z 	... 238 more
2026-09-10T00:58:17.6402023Z Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
2026-09-10T00:58:17.6402364Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
2026-09-10T00:58:17.6402794Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
2026-09-10T00:58:17.6403213Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
2026-09-10T00:58:17.6403686Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1381)
2026-09-10T00:58:17.6404176Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:534)
2026-09-10T00:58:17.6404588Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getTransactionNewConnection(AbstractPool.java:770)
2026-09-10T00:58:17.6404948Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:666)
2026-09-10T00:58:17.6405298Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
2026-09-10T00:58:17.6405501Z 	... 241 more
2026-09-10T00:58:17.6406074Z Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: "encrypt" property is set to "true" and "trustServerCertificate" property is set to "true" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (unsupported_certificate) Certificates do not conform to algorithm constraints. ClientConnectionId:8fbee5c9-a1bd-4a80-8dcf-56d1f4118071
2026-09-10T00:58:17.6406452Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.terminate(SQLServerConnection.java:4290)
2026-09-10T00:58:17.6406714Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1965)
2026-09-10T00:58:17.6406948Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:3816)
2026-09-10T00:58:17.6407153Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:3372)
2026-09-10T00:58:17.6407449Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:3197)
2026-09-10T00:58:17.6407692Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:1971)
2026-09-10T00:58:17.6407922Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:1263)
2026-09-10T00:58:17.6408312Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
2026-09-10T00:58:17.6408528Z 	... 248 more
2026-09-10T00:58:17.6408671Z Caused by: javax.net.ssl.SSLHandshakeException: (unsupported_certificate) Certificates do not conform to algorithm constraints
2026-09-10T00:58:17.6408875Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130)
2026-09-10T00:58:17.6409074Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:383)
2026-09-10T00:58:17.6409275Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:326)
2026-09-10T00:58:17.6409470Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-09-10T00:58:17.6409670Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647)
2026-09-10T00:58:17.6409921Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467)
2026-09-10T00:58:17.6410163Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363)
2026-09-10T00:58:17.6410379Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393)
2026-09-10T00:58:17.6410578Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:477)
2026-09-10T00:58:17.6410751Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:448)
2026-09-10T00:58:17.6410957Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:206)
2026-09-10T00:58:17.6411155Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:172)
2026-09-10T00:58:17.6411348Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1506)
2026-09-10T00:58:17.6411521Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1421)
2026-09-10T00:58:17.6411731Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:455)
2026-09-10T00:58:17.6411931Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:426)
2026-09-10T00:58:17.6412137Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1854)
2026-09-10T00:58:17.6412320Z 	... 254 more
2026-09-10T00:58:17.6412452Z Caused by: java.security.cert.CertificateException: Certificates do not conform to algorithm constraints
2026-09-10T00:58:17.6412734Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1557)
2026-09-10T00:58:17.6412976Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAdditionalTrust(SSLContextImpl.java:1484)
2026-09-10T00:58:17.6413210Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkServerTrusted(SSLContextImpl.java:1431)
2026-09-10T00:58:17.6413454Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:631)
2026-09-10T00:58:17.6413607Z 	... 266 more
2026-09-10T00:58:17.6413858Z Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA
2026-09-10T00:58:17.6414083Z 	at java.base/sun.security.provider.certpath.AlgorithmChecker.check(AlgorithmChecker.java:231)
2026-09-10T00:58:17.6414313Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1553)
2026-09-10T00:58:17.6414490Z 	... 269 more
2026-09-10T00:58:17.6414530Z 
2026-09-10T00:58:17.6415070Z [0m[31m21:57:30,294 ERROR [org.jboss.msc.service.fail] (ServerService Thread Pool -- 53) MSC000001: Failed to start service jboss.deployment.subunit."sihdg-3.13.0.4.ear"."sihdg-api.war".component.CacheConfig.START: org.jboss.msc.service.StartException in service jboss.deployment.subunit."sihdg-3.13.0.4.ear"."sihdg-api.war".component.CacheConfig.START: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
2026-09-10T00:58:17.6415541Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:57)
2026-09-10T00:58:17.6415740Z 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
2026-09-10T00:58:17.6415939Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
2026-09-10T00:58:17.6416257Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
2026-09-10T00:58:17.6416603Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
2026-09-10T00:58:17.6416939Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
2026-09-10T00:58:17.6417328Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
2026-09-10T00:58:17.6417522Z 	at java.base/java.lang.Thread.run(Thread.java:1583)
2026-09-10T00:58:17.6417796Z 	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)
2026-09-10T00:58:17.6418005Z Caused by: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
2026-09-10T00:58:17.6418381Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:170)
2026-09-10T00:58:17.6418720Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:141)
2026-09-10T00:58:17.6419022Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
2026-09-10T00:58:17.6419375Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:127)
2026-09-10T00:58:17.6419723Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:141)
2026-09-10T00:58:17.6420058Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
2026-09-10T00:58:17.6420233Z 	... 8 more
2026-09-10T00:58:17.6420422Z Caused by: jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-10T00:58:17.6420827Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:219)
2026-09-10T00:58:17.6421149Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.supports(CMTTxInterceptor.java:448)
2026-09-10T00:58:17.6421480Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:164)
2026-09-10T00:58:17.6421810Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6422173Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6422532Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
2026-09-10T00:58:17.6422925Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-10T00:58:17.6423261Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6423692Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-10T00:58:17.6424107Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6424462Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
2026-09-10T00:58:17.6424768Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6425163Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
2026-09-10T00:58:17.6425493Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6425831Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
2026-09-10T00:58:17.6426149Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6426492Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
2026-09-10T00:58:17.6426796Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6427163Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
2026-09-10T00:58:17.6427563Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6427901Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
2026-09-10T00:58:17.6428237Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6428577Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-10T00:58:17.6428910Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6429256Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-10T00:58:17.6429593Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6429904Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
2026-09-10T00:58:17.6430279Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
2026-09-10T00:58:17.6430640Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
2026-09-10T00:58:17.6430947Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6431277Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6431595Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
2026-09-10T00:58:17.6431915Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
2026-09-10T00:58:17.6432235Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6432569Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
2026-09-10T00:58:17.6432900Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
2026-09-10T00:58:17.6433249Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
2026-09-10T00:58:17.6433591Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
2026-09-10T00:58:17.6433969Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
2026-09-10T00:58:17.6434298Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6434625Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6434928Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
2026-09-10T00:58:17.6435286Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS$$$view26.consultarTodosPerfisRelacionados(Unknown Source)
2026-09-10T00:58:17.6435544Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.6435749Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.6436044Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
2026-09-10T00:58:17.6436372Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
2026-09-10T00:58:17.6436733Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
2026-09-10T00:58:17.6437160Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
2026-09-10T00:58:17.6437574Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
2026-09-10T00:58:17.6437951Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS$Proxy$_$$_Weld$EnterpriseProxy$.consultarTodosPerfisRelacionados(Unknown Source)
2026-09-10T00:58:17.6438413Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarPerfilRecursoCache(AtualizadorCacheAS.java:128)
2026-09-10T00:58:17.6438808Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarCache(AtualizadorCacheAS.java:80)
2026-09-10T00:58:17.6439033Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.6439237Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.6439564Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
2026-09-10T00:58:17.6439904Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6440229Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6440566Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-10T00:58:17.6440946Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
2026-09-10T00:58:17.6441319Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
2026-09-10T00:58:17.6441681Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
2026-09-10T00:58:17.6442013Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6442369Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
2026-09-10T00:58:17.6442686Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6442994Z 	at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
2026-09-10T00:58:17.6443314Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6443659Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-10T00:58:17.6444055Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6444386Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
2026-09-10T00:58:17.6444680Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6445038Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6445422Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
2026-09-10T00:58:17.6445764Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6446098Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
2026-09-10T00:58:17.6446453Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6446777Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
2026-09-10T00:58:17.6447117Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6447496Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
2026-09-10T00:58:17.6447823Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.supports(CMTTxInterceptor.java:448)
2026-09-10T00:58:17.6448146Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:164)
2026-09-10T00:58:17.6448464Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6448754Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6449137Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
2026-09-10T00:58:17.6449535Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-10T00:58:17.6449873Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6450243Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-10T00:58:17.6450577Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6450891Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
2026-09-10T00:58:17.6451215Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6451552Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
2026-09-10T00:58:17.6451865Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6452195Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
2026-09-10T00:58:17.6452524Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6452838Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
2026-09-10T00:58:17.6453220Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6453578Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
2026-09-10T00:58:17.6453916Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6454229Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
2026-09-10T00:58:17.6454570Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6454882Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-10T00:58:17.6455202Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6455550Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-10T00:58:17.6455877Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6456177Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
2026-09-10T00:58:17.6456503Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
2026-09-10T00:58:17.6456829Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
2026-09-10T00:58:17.6457136Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6457498Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6457800Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
2026-09-10T00:58:17.6458104Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
2026-09-10T00:58:17.6458404Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6458708Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
2026-09-10T00:58:17.6459054Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
2026-09-10T00:58:17.6459378Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
2026-09-10T00:58:17.6459687Z 	at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
2026-09-10T00:58:17.6460002Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
2026-09-10T00:58:17.6460301Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6460595Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6460949Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
2026-09-10T00:58:17.6461276Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS$$$view29.verificarEAtualizarCache(Unknown Source)
2026-09-10T00:58:17.6461500Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.6461683Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.6461948Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
2026-09-10T00:58:17.6462308Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
2026-09-10T00:58:17.6462644Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
2026-09-10T00:58:17.6463024Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
2026-09-10T00:58:17.6463362Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
2026-09-10T00:58:17.6463710Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS$Proxy$_$$_Weld$EnterpriseProxy$.verificarEAtualizarCache(Unknown Source)
2026-09-10T00:58:17.6464058Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.comum.config.cache.CacheConfig.onStartup(CacheConfig.java:37)
2026-09-10T00:58:17.6464279Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.6464458Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.6464783Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
2026-09-10T00:58:17.6465103Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6465405Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6465738Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-10T00:58:17.6466095Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:126)
2026-09-10T00:58:17.6466451Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:112)
2026-09-10T00:58:17.6466766Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6467075Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6467483Z 	at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:87)
2026-09-10T00:58:17.6467855Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
2026-09-10T00:58:17.6468220Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6468597Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
2026-09-10T00:58:17.6468902Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6469238Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
2026-09-10T00:58:17.6469555Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6469929Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
2026-09-10T00:58:17.6470242Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6470584Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:111)
2026-09-10T00:58:17.6470904Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6471227Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
2026-09-10T00:58:17.6471533Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6471824Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254)
2026-09-10T00:58:17.6472115Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:416)
2026-09-10T00:58:17.6472436Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:68)
2026-09-10T00:58:17.6472745Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6473076Z 	at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
2026-09-10T00:58:17.6473388Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6473732Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
2026-09-10T00:58:17.6474057Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6474382Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-10T00:58:17.6474695Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6475015Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
2026-09-10T00:58:17.6475321Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6475647Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.StartupCountDownInterceptor.processInvocation(StartupCountDownInterceptor.java:25)
2026-09-10T00:58:17.6475958Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6476289Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6476601Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:168)
2026-09-10T00:58:17.6476756Z 	... 13 more
2026-09-10T00:58:17.6476950Z Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-10T00:58:17.6477367Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:61)
2026-09-10T00:58:17.6477703Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
2026-09-10T00:58:17.6478007Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
2026-09-10T00:58:17.6478351Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
2026-09-10T00:58:17.6478716Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
2026-09-10T00:58:17.6479054Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
2026-09-10T00:58:17.6479374Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
2026-09-10T00:58:17.6479739Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
2026-09-10T00:58:17.6480099Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
2026-09-10T00:58:17.6480445Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
2026-09-10T00:58:17.6480785Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:227)
2026-09-10T00:58:17.6481118Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:164)
2026-09-10T00:58:17.6481458Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
2026-09-10T00:58:17.6481794Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
2026-09-10T00:58:17.6482111Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
2026-09-10T00:58:17.6482443Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
2026-09-10T00:58:17.6482759Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
2026-09-10T00:58:17.6483061Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
2026-09-10T00:58:17.6483432Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
2026-09-10T00:58:17.6483837Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
2026-09-10T00:58:17.6484266Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
2026-09-10T00:58:17.6484681Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
2026-09-10T00:58:17.6485017Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:107)
2026-09-10T00:58:17.6485421Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:300)
2026-09-10T00:58:17.6485769Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:241)
2026-09-10T00:58:17.6486066Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
2026-09-10T00:58:17.6486363Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
2026-09-10T00:58:17.6486643Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.Query.getResultList(Query.java:119)
2026-09-10T00:58:17.6487010Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRecursoRepository.consultarTodosPerfisRelacionados(PerfilRecursoRepository.java:35)
2026-09-10T00:58:17.6487492Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRecursoRepository$Proxy$_$$_WeldClientProxy.consultarTodosPerfisRelacionados(Unknown Source)
2026-09-10T00:58:17.6487885Z 	at deployment.sihdg-3.13.0.4.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS.consultarTodosPerfisRelacionados(PerfilRecursoAS.java:132)
2026-09-10T00:58:17.6488118Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-10T00:58:17.6488304Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-10T00:58:17.6488612Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
2026-09-10T00:58:17.6488939Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6489250Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
2026-09-10T00:58:17.6489592Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
2026-09-10T00:58:17.6489939Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
2026-09-10T00:58:17.6490294Z 	at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
2026-09-10T00:58:17.6490698Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
2026-09-10T00:58:17.6491016Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6491352Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
2026-09-10T00:58:17.6491710Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6492017Z 	at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
2026-09-10T00:58:17.6492330Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6492653Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
2026-09-10T00:58:17.6492998Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6493300Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
2026-09-10T00:58:17.6493600Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6493893Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
2026-09-10T00:58:17.6494241Z 	at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
2026-09-10T00:58:17.6494563Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6494977Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
2026-09-10T00:58:17.6495302Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6495635Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
2026-09-10T00:58:17.6495951Z 	at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
2026-09-10T00:58:17.6496253Z 	at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
2026-09-10T00:58:17.6496414Z 	... 181 more
2026-09-10T00:58:17.6496581Z Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-10T00:58:17.6496920Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:160)
2026-09-10T00:58:17.6497296Z 	at org.jboss.as.connector@8.0.13.GA-redhat-00002//org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
2026-09-10T00:58:17.6497679Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
2026-09-10T00:58:17.6498049Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.internal.NonContextualJdbcConnectionAccess.obtainConnection(NonContextualJdbcConnectionAccess.java:38)
2026-09-10T00:58:17.6498418Z 	at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:113)
2026-09-10T00:58:17.6498599Z 	... 234 more
2026-09-10T00:58:17.6498756Z Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-10T00:58:17.6499175Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:690)
2026-09-10T00:58:17.6499724Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
2026-09-10T00:58:17.6500097Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
2026-09-10T00:58:17.6500552Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
2026-09-10T00:58:17.6500775Z 	... 238 more
2026-09-10T00:58:17.6500955Z Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
2026-09-10T00:58:17.6501449Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
2026-09-10T00:58:17.6502045Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
2026-09-10T00:58:17.6502648Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
2026-09-10T00:58:17.6503254Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1381)
2026-09-10T00:58:17.6503761Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:534)
2026-09-10T00:58:17.6504150Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getTransactionNewConnection(AbstractPool.java:770)
2026-09-10T00:58:17.6504491Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:666)
2026-09-10T00:58:17.6504845Z 	at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
2026-09-10T00:58:17.6505029Z 	... 241 more
2026-09-10T00:58:17.6505552Z Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: "encrypt" property is set to "true" and "trustServerCertificate" property is set to "true" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (unsupported_certificate) Certificates do not conform to algorithm constraints. ClientConnectionId:8fbee5c9-a1bd-4a80-8dcf-56d1f4118071
2026-09-10T00:58:17.6505906Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.terminate(SQLServerConnection.java:4290)
2026-09-10T00:58:17.6506117Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1965)
2026-09-10T00:58:17.6506329Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:3816)
2026-09-10T00:58:17.6506541Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:3372)
2026-09-10T00:58:17.6506753Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:3197)
2026-09-10T00:58:17.6506970Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:1971)
2026-09-10T00:58:17.6507176Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:1263)
2026-09-10T00:58:17.6507687Z 	at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
2026-09-10T00:58:17.6507879Z 	... 248 more
2026-09-10T00:58:17.6508024Z Caused by: javax.net.ssl.SSLHandshakeException: (unsupported_certificate) Certificates do not conform to algorithm constraints
2026-09-10T00:58:17.6508208Z 	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130)
2026-09-10T00:58:17.6508383Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:383)
2026-09-10T00:58:17.6508620Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:326)
2026-09-10T00:58:17.6508796Z 	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
2026-09-10T00:58:17.6508995Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647)
2026-09-10T00:58:17.6509229Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467)
2026-09-10T00:58:17.6509448Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363)
2026-09-10T00:58:17.6509640Z 	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393)
2026-09-10T00:58:17.6509820Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:477)
2026-09-10T00:58:17.6509993Z 	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:448)
2026-09-10T00:58:17.6510174Z 	at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:206)
2026-09-10T00:58:17.6510346Z 	at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:172)
2026-09-10T00:58:17.6510513Z 	at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1506)
2026-09-10T00:58:17.6510684Z 	at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1421)
2026-09-10T00:58:17.6510868Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:455)
2026-09-10T00:58:17.6511039Z 	at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:426)
2026-09-10T00:58:17.6511224Z 	at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1854)
2026-09-10T00:58:17.6511370Z 	... 254 more
2026-09-10T00:58:17.6511501Z Caused by: java.security.cert.CertificateException: Certificates do not conform to algorithm constraints
2026-09-10T00:58:17.6511699Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1557)
2026-09-10T00:58:17.6511916Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAdditionalTrust(SSLContextImpl.java:1484)
2026-09-10T00:58:17.6512123Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkServerTrusted(SSLContextImpl.java:1431)
2026-09-10T00:58:17.6512335Z 	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:631)
2026-09-10T00:58:17.6512484Z 	... 266 more
2026-09-10T00:58:17.6512635Z Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA
2026-09-10T00:58:17.6512837Z 	at java.base/sun.security.provider.certpath.AlgorithmChecker.check(AlgorithmChecker.java:231)
2026-09-10T00:58:17.6513042Z 	at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1553)
2026-09-10T00:58:17.6513194Z 	... 269 more
2026-09-10T00:58:17.6513234Z 
2026-09-10T00:58:17.6513579Z [0m[31m21:57:30,297 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("deploy") failed - address: ([("deployment" => "sihdg-3.13.0.4.ear")]) - failure description: {"WFLYCTL0080: Failed services" => {
2026-09-10T00:58:17.6513975Z     "jboss.deployment.subunit.\"sihdg-3.13.0.4.ear\".\"sihdg-api.war\".component.CacheConfig.START" => "java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
2026-09-10T00:58:17.6514292Z     Caused by: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
2026-09-10T00:58:17.6514526Z     Caused by: jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-10T00:58:17.6514815Z     Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-10T00:58:17.6515092Z     Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-10T00:58:17.6515308Z     Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-10T00:58:17.6515544Z     Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
2026-09-10T00:58:17.6516113Z     Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: \"encrypt\" property is set to \"true\" and \"trustServerCertificate\" property is set to \"true\" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (unsupported_certificate) Certificates do not conform to algorithm constraints. ClientConnectionId:8fbee5c9-a1bd-4a80-8dcf-56d1f4118071
2026-09-10T00:58:17.6516460Z     Caused by: javax.net.ssl.SSLHandshakeException: (unsupported_certificate) Certificates do not conform to algorithm constraints
2026-09-10T00:58:17.6516651Z     Caused by: java.security.cert.CertificateException: Certificates do not conform to algorithm constraints
2026-09-10T00:58:17.6516845Z     Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA",
2026-09-10T00:58:17.6517188Z     "jboss.deployment.subunit.\"sihdg-3.13.0.4.ear\".\"sihdg-api.war\".component.SecurityConfig.START" => "java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
2026-09-10T00:58:17.6517477Z     Caused by: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
2026-09-10T00:58:17.6517710Z     Caused by: jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-10T00:58:17.6517991Z     Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
2026-09-10T00:58:17.6518297Z     Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-10T00:58:17.6518517Z     Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
2026-09-10T00:58:17.6518703Z     Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
2026-09-10T00:58:17.6519267Z     Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: \"encrypt\" property is set to \"true\" and \"trustServerCertificate\" property is set to \"true\" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (unsupported_certificate) Certificates do not conform to algorithm constraints. ClientConnectionId:7bd656fd-4c21-46d4-ad06-1ec1dcceea94
2026-09-10T00:58:17.6519610Z     Caused by: javax.net.ssl.SSLHandshakeException: (unsupported_certificate) Certificates do not conform to algorithm constraints
2026-09-10T00:58:17.6519799Z     Caused by: java.security.cert.CertificateException: Certificates do not conform to algorithm constraints
2026-09-10T00:58:17.6520026Z     Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA"
2026-09-10T00:58:17.6520162Z }}
2026-09-10T00:58:17.6520427Z [0m[0m21:57:30,301 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 28) WFLYSRV0010: Deployed "sihdg-3.13.0.4.ear" (runtime-name : "sihdg-3.13.0.4.ear")
2026-09-10T00:58:17.6520717Z [0m[0m21:57:30,302 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0183: Service status report
2026-09-10T00:58:17.6521089Z WFLYCTL0186:   Services which failed to start:      service jboss.deployment.subunit."sihdg-3.13.0.4.ear"."sihdg-api.war".component.CacheConfig.START: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
2026-09-10T00:58:17.6521508Z       service jboss.deployment.subunit."sihdg-3.13.0.4.ear"."sihdg-api.war".component.SecurityConfig.START: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
2026-09-10T00:58:17.6521714Z WFLYCTL0448: 2 additional services are down due to their dependencies being missing or failed
2026-09-10T00:58:17.6521959Z [0m[0m21:57:30,312 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
2026-09-10T00:58:17.6522264Z [0m[0m21:57:30,314 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://0.0.0.0:9990/management
2026-09-10T00:58:17.6522540Z [0m[0m21:57:30,314 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0054: Admin console is not enabled
2026-09-10T00:58:17.6523016Z [0m[31m21:57:30,314 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) started (with errors) in 22413ms - Started 1176 of 1265 services (7 services failed or missing dependencies, 162 services are lazy, passive or on-demand) - Server configuration file in use: standalone.xml
2026-09-10T00:58:17.6523751Z ##[debug]Exit code 0 received from tool '/usr/bin/bash'
2026-09-10T00:58:17.6524016Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-09-10T00:58:17.6524241Z ##[debug]task result: Succeeded
2026-09-10T00:58:17.6525102Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-09-10T00:58:17.6525974Z ##[section]Finishing: Logs da Aplicação

