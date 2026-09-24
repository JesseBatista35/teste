2026-09-24T14:13:10.7584957Z ##[debug]Evaluating condition for step: 'Recupera Versão no POM'
2026-09-24T14:13:10.7586997Z ##[debug]Evaluating: succeeded()
2026-09-24T14:13:10.7587234Z ##[debug]Evaluating succeeded:
2026-09-24T14:13:10.7587871Z ##[debug]=> True
2026-09-24T14:13:10.7588167Z ##[debug]Result: True
2026-09-24T14:13:10.7588384Z ##[section]Starting: Recupera Versão no POM
2026-09-24T14:13:10.7595803Z ==============================================================================
2026-09-24T14:13:10.7595901Z Task         : Bash
2026-09-24T14:13:10.7595993Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-24T14:13:10.7596059Z Version      : 3.227.0
2026-09-24T14:13:10.7596120Z Author       : Microsoft Corporation
2026-09-24T14:13:10.7596211Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-24T14:13:10.7596287Z ==============================================================================
2026-09-24T14:13:10.8361648Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-24T14:13:10.9059753Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-24T14:13:10.9065623Z ##[debug]loading inputs and endpoints
2026-09-24T14:13:10.9071277Z ##[debug]loading INPUT_TARGETTYPE
2026-09-24T14:13:10.9078834Z ##[debug]loading INPUT_FILEPATH
2026-09-24T14:13:10.9079703Z ##[debug]loading INPUT_SCRIPT
2026-09-24T14:13:10.9080464Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-24T14:13:10.9081009Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-24T14:13:10.9081729Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-24T14:13:10.9082464Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-24T14:13:10.9084993Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-24T14:13:10.9087693Z ##[debug]loading SECRET_FORTIFY_CLIENT_AUTH_TOKEN
2026-09-24T14:13:10.9088626Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-24T14:13:10.9090113Z ##[debug]loading SECRET_FORTIFY_REGISTRY_PASSWORD
2026-09-24T14:13:10.9092000Z ##[debug]loading SECRET_NEXUS_INTERNO_PASS
2026-09-24T14:13:10.9093343Z ##[debug]loading SECRET_FORTIFY_CI_TOKEN
2026-09-24T14:13:10.9094761Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-24T14:13:10.9095460Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-24T14:13:10.9096037Z ##[debug]loading SECRET_FORTIFY_UPTOKEN
2026-09-24T14:13:10.9096497Z ##[debug]loading SECRET_FORTIFY_TOKEN
2026-09-24T14:13:10.9097046Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-24T14:13:10.9097655Z ##[debug]loading SECRET_KEYSTORE_PWD
2026-09-24T14:13:10.9098134Z ##[debug]loading SECRET_AZPAT
2026-09-24T14:13:10.9099576Z ##[debug]loading SECRET_SCANCENTRAL_SSCCITOKEN
2026-09-24T14:13:10.9100091Z ##[debug]loading SECRET_SONAR_PASSWORD
2026-09-24T14:13:10.9100575Z ##[debug]loading SECRET_SCANCENTRAL_CLIENTTOKEN
2026-09-24T14:13:10.9101083Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-24T14:13:10.9102338Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-24T14:13:10.9103411Z ##[debug]loaded 25
2026-09-24T14:13:10.9105786Z ##[debug]Agent.ProxyUrl=undefined
2026-09-24T14:13:10.9106313Z ##[debug]Agent.CAInfo=undefined
2026-09-24T14:13:10.9106844Z ##[debug]Agent.ClientCert=undefined
2026-09-24T14:13:10.9107340Z ##[debug]Agent.SkipCertValidation=True
2026-09-24T14:13:10.9120471Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-24T14:13:10.9122116Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-24T14:13:10.9122533Z ##[debug]system.culture=en-US
2026-09-24T14:13:10.9130789Z ##[debug]failOnStderr=false
2026-09-24T14:13:10.9131674Z ##[debug]workingDirectory=/opt/ads-agent/_work/4/s
2026-09-24T14:13:10.9132171Z ##[debug]check path : /opt/ads-agent/_work/4/s
2026-09-24T14:13:10.9132659Z ##[debug]targetType=inline
2026-09-24T14:13:10.9133104Z ##[debug]bashEnvValue=undefined
2026-09-24T14:13:10.9133955Z ##[debug]script=PROJECT_POM_PROPERTIES_FILE=`find . -name pom.properties`

p_version=`egrep version ${PROJECT_POM_PROPERTIES_FILE} | awk -F = {'print $2'}`	

echo "##vso[task.setvariable variable=POM_VERSION;]$p_version"

echo "##vso[task.setvariable variable=POM_PATH;]pom.xml"
2026-09-24T14:13:10.9141618Z Generating script.
2026-09-24T14:13:10.9143514Z ##[debug]which 'bash'
2026-09-24T14:13:10.9153277Z ##[debug]found: '/usr/bin/bash'
2026-09-24T14:13:10.9153887Z ##[debug]Agent.Version=3.236.1
2026-09-24T14:13:10.9154397Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-24T14:13:10.9154887Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-24T14:13:10.9156613Z ========================== Starting Command Output ===========================
2026-09-24T14:13:10.9157843Z ##[debug]which '/usr/bin/bash'
2026-09-24T14:13:10.9159246Z ##[debug]found: '/usr/bin/bash'
2026-09-24T14:13:10.9160002Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/371fe93d-f843-4d13-817e-60edeebc2c90.sh
2026-09-24T14:13:10.9162144Z ##[debug]exec tool: /usr/bin/bash
2026-09-24T14:13:10.9162439Z ##[debug]arguments:
2026-09-24T14:13:10.9162980Z ##[debug]   /opt/ads-agent/_work/_temp/371fe93d-f843-4d13-817e-60edeebc2c90.sh
2026-09-24T14:13:10.9164459Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/371fe93d-f843-4d13-817e-60edeebc2c90.sh
2026-09-24T14:13:15.6784865Z ##[debug]Agent environment resources - Disk: / Available 46309.00 MB out of 122356.00 MB, Memory: Used 12617.00 MB out of 64399.00 MB, CPU: Usage 15.46%
2026-09-24T14:13:20.6820564Z ##[debug]Agent environment resources - Disk: / Available 46305.00 MB out of 122356.00 MB, Memory: Used 12604.00 MB out of 64399.00 MB, CPU: Usage 13.79%
2026-09-24T14:13:25.6840982Z ##[debug]Agent environment resources - Disk: / Available 46305.00 MB out of 122356.00 MB, Memory: Used 12583.00 MB out of 64399.00 MB, CPU: Usage 12.46%
2026-09-24T14:13:30.6861911Z ##[debug]Agent environment resources - Disk: / Available 46314.00 MB out of 122356.00 MB, Memory: Used 12642.00 MB out of 64399.00 MB, CPU: Usage 11.36%
2026-09-24T14:13:35.6884700Z ##[debug]Agent environment resources - Disk: / Available 46283.00 MB out of 122356.00 MB, Memory: Used 12657.00 MB out of 64399.00 MB, CPU: Usage 10.44%
2026-09-24T14:13:40.6913948Z ##[debug]Agent environment resources - Disk: / Available 46298.00 MB out of 122356.00 MB, Memory: Used 12673.00 MB out of 64399.00 MB, CPU: Usage 9.68%
2026-09-24T14:13:45.6949477Z ##[debug]Agent environment resources - Disk: / Available 46296.00 MB out of 122356.00 MB, Memory: Used 12677.00 MB out of 64399.00 MB, CPU: Usage 9.01%
2026-09-24T14:13:50.6961465Z ##[debug]Agent environment resources - Disk: / Available 46292.00 MB out of 122356.00 MB, Memory: Used 12674.00 MB out of 64399.00 MB, CPU: Usage 8.43%
2026-09-24T14:13:55.6990062Z ##[debug]Agent environment resources - Disk: / Available 46292.00 MB out of 122356.00 MB, Memory: Used 12662.00 MB out of 64399.00 MB, CPU: Usage 7.95%
2026-09-24T14:14:00.7008271Z ##[debug]Agent environment resources - Disk: / Available 46276.00 MB out of 122356.00 MB, Memory: Used 12627.00 MB out of 64399.00 MB, CPU: Usage 7.51%
2026-09-24T14:14:05.7025699Z ##[debug]Agent environment resources - Disk: / Available 46275.00 MB out of 122356.00 MB, Memory: Used 12629.00 MB out of 64399.00 MB, CPU: Usage 7.11%
2026-09-24T14:14:10.7047959Z ##[debug]Agent environment resources - Disk: / Available 46273.00 MB out of 122356.00 MB, Memory: Used 12632.00 MB out of 64399.00 MB, CPU: Usage 6.76%
2026-09-24T14:14:15.7071219Z ##[debug]Agent environment resources - Disk: / Available 46269.00 MB out of 122356.00 MB, Memory: Used 12636.00 MB out of 64399.00 MB, CPU: Usage 6.44%
2026-09-24T14:14:20.7094083Z ##[debug]Agent environment resources - Disk: / Available 46260.00 MB out of 122356.00 MB, Memory: Used 12642.00 MB out of 64399.00 MB, CPU: Usage 6.15%
2026-09-24T14:14:25.7121706Z ##[debug]Agent environment resources - Disk: / Available 46268.00 MB out of 122356.00 MB, Memory: Used 12622.00 MB out of 64399.00 MB, CPU: Usage 5.88%
2026-09-24T14:14:30.7142404Z ##[debug]Agent environment resources - Disk: / Available 46252.00 MB out of 122356.00 MB, Memory: Used 12592.00 MB out of 64399.00 MB, CPU: Usage 5.64%
2026-09-24T14:14:35.7163446Z ##[debug]Agent environment resources - Disk: / Available 46220.00 MB out of 122356.00 MB, Memory: Used 12610.00 MB out of 64399.00 MB, CPU: Usage 5.41%
2026-09-24T14:14:40.7176593Z ##[debug]Agent environment resources - Disk: / Available 46233.00 MB out of 122356.00 MB, Memory: Used 12629.00 MB out of 64399.00 MB, CPU: Usage 5.21%
2026-09-24T14:14:45.7207944Z ##[debug]Agent environment resources - Disk: / Available 46228.00 MB out of 122356.00 MB, Memory: Used 12623.00 MB out of 64399.00 MB, CPU: Usage 5.01%
2026-09-24T14:14:50.7228784Z ##[debug]Agent environment resources - Disk: / Available 46229.00 MB out of 122356.00 MB, Memory: Used 12620.00 MB out of 64399.00 MB, CPU: Usage 4.84%
2026-09-24T14:14:55.7249135Z ##[debug]Agent environment resources - Disk: / Available 46229.00 MB out of 122356.00 MB, Memory: Used 12634.00 MB out of 64399.00 MB, CPU: Usage 4.67%
2026-09-24T14:15:00.7286268Z ##[debug]Agent environment resources - Disk: / Available 46213.00 MB out of 122356.00 MB, Memory: Used 12740.00 MB out of 64399.00 MB, CPU: Usage 4.52%
2026-09-24T14:15:05.7333779Z ##[debug]Agent environment resources - Disk: / Available 46227.00 MB out of 122356.00 MB, Memory: Used 12772.00 MB out of 64399.00 MB, CPU: Usage 4.38%
2026-09-24T14:15:10.7357733Z ##[debug]Agent environment resources - Disk: / Available 46227.00 MB out of 122356.00 MB, Memory: Used 12762.00 MB out of 64399.00 MB, CPU: Usage 4.25%
2026-09-24T14:15:15.7385124Z ##[debug]Agent environment resources - Disk: / Available 46225.00 MB out of 122356.00 MB, Memory: Used 12766.00 MB out of 64399.00 MB, CPU: Usage 4.11%
2026-09-24T14:15:20.7410037Z ##[debug]Agent environment resources - Disk: / Available 46221.00 MB out of 122356.00 MB, Memory: Used 12764.00 MB out of 64399.00 MB, CPU: Usage 4.00%
2026-09-24T14:15:25.7429147Z ##[debug]Agent environment resources - Disk: / Available 46213.00 MB out of 122356.00 MB, Memory: Used 12758.00 MB out of 64399.00 MB, CPU: Usage 3.89%
2026-09-24T14:15:30.7444527Z ##[debug]Agent environment resources - Disk: / Available 46219.00 MB out of 122356.00 MB, Memory: Used 12710.00 MB out of 64399.00 MB, CPU: Usage 3.78%
2026-09-24T14:15:35.7472630Z ##[debug]Agent environment resources - Disk: / Available 46217.00 MB out of 122356.00 MB, Memory: Used 12708.00 MB out of 64399.00 MB, CPU: Usage 3.68%
2026-09-24T14:15:40.7492502Z ##[debug]Agent environment resources - Disk: / Available 46213.00 MB out of 122356.00 MB, Memory: Used 12712.00 MB out of 64399.00 MB, CPU: Usage 3.59%
2026-09-24T14:15:45.7516963Z ##[debug]Agent environment resources - Disk: / Available 46213.00 MB out of 122356.00 MB, Memory: Used 12713.00 MB out of 64399.00 MB, CPU: Usage 3.49%
2026-09-24T14:15:50.7545258Z ##[debug]Agent environment resources - Disk: / Available 46219.00 MB out of 122356.00 MB, Memory: Used 12731.00 MB out of 64399.00 MB, CPU: Usage 3.42%
2026-09-24T14:15:55.7572843Z ##[debug]Agent environment resources - Disk: / Available 46216.00 MB out of 122356.00 MB, Memory: Used 12719.00 MB out of 64399.00 MB, CPU: Usage 3.33%
2026-09-24T14:16:00.7588678Z ##[debug]Agent environment resources - Disk: / Available 46323.00 MB out of 122356.00 MB, Memory: Used 12775.00 MB out of 64399.00 MB, CPU: Usage 3.25%
2026-09-24T14:16:05.7604983Z ##[debug]Agent environment resources - Disk: / Available 46305.00 MB out of 122356.00 MB, Memory: Used 12836.00 MB out of 64399.00 MB, CPU: Usage 3.18%
2026-09-24T14:16:10.7634428Z ##[debug]Agent environment resources - Disk: / Available 46306.00 MB out of 122356.00 MB, Memory: Used 12822.00 MB out of 64399.00 MB, CPU: Usage 3.11%
2026-09-24T14:16:15.7657365Z ##[debug]Agent environment resources - Disk: / Available 46306.00 MB out of 122356.00 MB, Memory: Used 12804.00 MB out of 64399.00 MB, CPU: Usage 3.05%
2026-09-24T14:16:20.7683324Z ##[debug]Agent environment resources - Disk: / Available 46306.00 MB out of 122356.00 MB, Memory: Used 12786.00 MB out of 64399.00 MB, CPU: Usage 2.98%
2026-09-24T14:16:25.7702194Z ##[debug]Agent environment resources - Disk: / Available 46306.00 MB out of 122356.00 MB, Memory: Used 12765.00 MB out of 64399.00 MB, CPU: Usage 2.92%
2026-09-24T14:16:30.7722017Z ##[debug]Agent environment resources - Disk: / Available 46298.00 MB out of 122356.00 MB, Memory: Used 12742.00 MB out of 64399.00 MB, CPU: Usage 2.86%
2026-09-24T14:16:35.7735817Z ##[debug]Agent environment resources - Disk: / Available 46274.00 MB out of 122356.00 MB, Memory: Used 12722.00 MB out of 64399.00 MB, CPU: Usage 2.81%
2026-09-24T14:16:40.7768682Z ##[debug]Agent environment resources - Disk: / Available 46274.00 MB out of 122356.00 MB, Memory: Used 12731.00 MB out of 64399.00 MB, CPU: Usage 2.75%
2026-09-24T14:16:45.7785863Z ##[debug]Agent environment resources - Disk: / Available 46274.00 MB out of 122356.00 MB, Memory: Used 12726.00 MB out of 64399.00 MB, CPU: Usage 2.70%
2026-09-24T14:16:50.7814903Z ##[debug]Agent environment resources - Disk: / Available 46274.00 MB out of 122356.00 MB, Memory: Used 12730.00 MB out of 64399.00 MB, CPU: Usage 2.65%
2026-09-24T14:16:55.7841552Z ##[debug]Agent environment resources - Disk: / Available 46273.00 MB out of 122356.00 MB, Memory: Used 12698.00 MB out of 64399.00 MB, CPU: Usage 2.60%
2026-09-24T14:17:00.7857259Z ##[debug]Agent environment resources - Disk: / Available 46274.00 MB out of 122356.00 MB, Memory: Used 12657.00 MB out of 64399.00 MB, CPU: Usage 2.56%
2026-09-24T14:17:05.7877622Z ##[debug]Agent environment resources - Disk: / Available 46266.00 MB out of 122356.00 MB, Memory: Used 12639.00 MB out of 64399.00 MB, CPU: Usage 2.51%
2026-09-24T14:17:10.7888240Z ##[debug]Agent environment resources - Disk: / Available 46266.00 MB out of 122356.00 MB, Memory: Used 12665.00 MB out of 64399.00 MB, CPU: Usage 2.47%
2026-09-24T14:17:15.7907813Z ##[debug]Agent environment resources - Disk: / Available 46266.00 MB out of 122356.00 MB, Memory: Used 12640.00 MB out of 64399.00 MB, CPU: Usage 2.43%
2026-09-24T14:17:20.7935757Z ##[debug]Agent environment resources - Disk: / Available 46266.00 MB out of 122356.00 MB, Memory: Used 12635.00 MB out of 64399.00 MB, CPU: Usage 2.39%
2026-09-24T14:17:25.7958764Z ##[debug]Agent environment resources - Disk: / Available 46266.00 MB out of 122356.00 MB, Memory: Used 12635.00 MB out of 64399.00 MB, CPU: Usage 2.35%
2026-09-24T14:17:30.7981401Z ##[debug]Agent environment resources - Disk: / Available 46258.00 MB out of 122356.00 MB, Memory: Used 12660.00 MB out of 64399.00 MB, CPU: Usage 2.31%
2026-09-24T14:17:35.7996585Z ##[debug]Agent environment resources - Disk: / Available 46218.00 MB out of 122356.00 MB, Memory: Used 12809.00 MB out of 64399.00 MB, CPU: Usage 2.28%
2026-09-24T14:17:40.8023700Z ##[debug]Agent environment resources - Disk: / Available 46218.00 MB out of 122356.00 MB, Memory: Used 12829.00 MB out of 64399.00 MB, CPU: Usage 2.24%
2026-09-24T14:17:45.8055537Z ##[debug]Agent environment resources - Disk: / Available 46217.00 MB out of 122356.00 MB, Memory: Used 12798.00 MB out of 64399.00 MB, CPU: Usage 2.21%
2026-09-24T14:17:50.8088554Z ##[debug]Agent environment resources - Disk: / Available 46226.00 MB out of 122356.00 MB, Memory: Used 12812.00 MB out of 64399.00 MB, CPU: Usage 2.18%
2026-09-24T14:17:55.8109985Z ##[debug]Agent environment resources - Disk: / Available 46232.00 MB out of 122356.00 MB, Memory: Used 12802.00 MB out of 64399.00 MB, CPU: Usage 2.15%
2026-09-24T14:18:00.8125980Z ##[debug]Agent environment resources - Disk: / Available 46210.00 MB out of 122356.00 MB, Memory: Used 12769.00 MB out of 64399.00 MB, CPU: Usage 2.12%
2026-09-24T14:18:05.8147191Z ##[debug]Agent environment resources - Disk: / Available 46211.00 MB out of 122356.00 MB, Memory: Used 12761.00 MB out of 64399.00 MB, CPU: Usage 2.09%
2026-09-24T14:18:10.8173677Z ##[debug]Agent environment resources - Disk: / Available 46208.00 MB out of 122356.00 MB, Memory: Used 12761.00 MB out of 64399.00 MB, CPU: Usage 2.06%
2026-09-24T14:18:15.8198866Z ##[debug]Agent environment resources - Disk: / Available 46208.00 MB out of 122356.00 MB, Memory: Used 12791.00 MB out of 64399.00 MB, CPU: Usage 2.03%
2026-09-24T14:18:20.8229908Z ##[debug]Agent environment resources - Disk: / Available 46216.00 MB out of 122356.00 MB, Memory: Used 12804.00 MB out of 64399.00 MB, CPU: Usage 2.01%
2026-09-24T14:18:25.8268822Z ##[debug]Agent environment resources - Disk: / Available 46216.00 MB out of 122356.00 MB, Memory: Used 12822.00 MB out of 64399.00 MB, CPU: Usage 1.98%
2026-09-24T14:18:30.8286342Z ##[debug]Agent environment resources - Disk: / Available 46199.00 MB out of 122356.00 MB, Memory: Used 12819.00 MB out of 64399.00 MB, CPU: Usage 1.96%
2026-09-24T14:18:35.8312100Z ##[debug]Agent environment resources - Disk: / Available 46199.00 MB out of 122356.00 MB, Memory: Used 12794.00 MB out of 64399.00 MB, CPU: Usage 1.93%
2026-09-24T14:18:40.8324700Z ##[debug]Agent environment resources - Disk: / Available 46199.00 MB out of 122356.00 MB, Memory: Used 12808.00 MB out of 64399.00 MB, CPU: Usage 1.90%
2026-09-24T14:18:45.8353376Z ##[debug]Agent environment resources - Disk: / Available 46199.00 MB out of 122356.00 MB, Memory: Used 12775.00 MB out of 64399.00 MB, CPU: Usage 1.88%
2026-09-24T14:18:50.8358515Z ##[debug]Agent environment resources - Disk: / Available 46199.00 MB out of 122356.00 MB, Memory: Used 12745.00 MB out of 64399.00 MB, CPU: Usage 1.86%
2026-09-24T14:18:55.8413943Z ##[debug]Agent environment resources - Disk: / Available 46199.00 MB out of 122356.00 MB, Memory: Used 12746.00 MB out of 64399.00 MB, CPU: Usage 1.84%
2026-09-24T14:19:00.8434444Z ##[debug]Agent environment resources - Disk: / Available 46319.00 MB out of 122356.00 MB, Memory: Used 12753.00 MB out of 64399.00 MB, CPU: Usage 1.81%
2026-09-24T14:19:05.8459005Z ##[debug]Agent environment resources - Disk: / Available 46303.00 MB out of 122356.00 MB, Memory: Used 12735.00 MB out of 64399.00 MB, CPU: Usage 1.80%
2026-09-24T14:19:10.8478492Z ##[debug]Agent environment resources - Disk: / Available 46304.00 MB out of 122356.00 MB, Memory: Used 12754.00 MB out of 64399.00 MB, CPU: Usage 1.78%
2026-09-24T14:19:15.8500470Z ##[debug]Agent environment resources - Disk: / Available 46312.00 MB out of 122356.00 MB, Memory: Used 12730.00 MB out of 64399.00 MB, CPU: Usage 1.75%
2026-09-24T14:19:20.8518790Z ##[debug]Agent environment resources - Disk: / Available 46312.00 MB out of 122356.00 MB, Memory: Used 12701.00 MB out of 64399.00 MB, CPU: Usage 1.73%
2026-09-24T14:19:25.8539472Z ##[debug]Agent environment resources - Disk: / Available 46303.00 MB out of 122356.00 MB, Memory: Used 12728.00 MB out of 64399.00 MB, CPU: Usage 1.72%
2026-09-24T14:19:30.8563378Z ##[debug]Agent environment resources - Disk: / Available 46296.00 MB out of 122356.00 MB, Memory: Used 12770.00 MB out of 64399.00 MB, CPU: Usage 1.70%
2026-09-24T14:19:35.8583508Z ##[debug]Agent environment resources - Disk: / Available 46280.00 MB out of 122356.00 MB, Memory: Used 12752.00 MB out of 64399.00 MB, CPU: Usage 1.68%
2026-09-24T14:19:40.8604486Z ##[debug]Agent environment resources - Disk: / Available 46280.00 MB out of 122356.00 MB, Memory: Used 12742.00 MB out of 64399.00 MB, CPU: Usage 1.66%
2026-09-24T14:19:45.8630122Z ##[debug]Agent environment resources - Disk: / Available 46270.00 MB out of 122356.00 MB, Memory: Used 12727.00 MB out of 64399.00 MB, CPU: Usage 1.64%
2026-09-24T14:19:50.8651333Z ##[debug]Agent environment resources - Disk: / Available 46271.00 MB out of 122356.00 MB, Memory: Used 12752.00 MB out of 64399.00 MB, CPU: Usage 1.63%
2026-09-24T14:19:55.8670961Z ##[debug]Agent environment resources - Disk: / Available 46271.00 MB out of 122356.00 MB, Memory: Used 12738.00 MB out of 64399.00 MB, CPU: Usage 1.61%
2026-09-24T14:20:00.8697706Z ##[debug]Agent environment resources - Disk: / Available 46271.00 MB out of 122356.00 MB, Memory: Used 12760.00 MB out of 64399.00 MB, CPU: Usage 1.59%
2026-09-24T14:20:05.8723249Z ##[debug]Agent environment resources - Disk: / Available 46256.00 MB out of 122356.00 MB, Memory: Used 12766.00 MB out of 64399.00 MB, CPU: Usage 1.58%
2026-09-24T14:20:10.8738939Z ##[debug]Agent environment resources - Disk: / Available 46256.00 MB out of 122356.00 MB, Memory: Used 12789.00 MB out of 64399.00 MB, CPU: Usage 1.56%
2026-09-24T14:20:15.8768415Z ##[debug]Agent environment resources - Disk: / Available 46256.00 MB out of 122356.00 MB, Memory: Used 12786.00 MB out of 64399.00 MB, CPU: Usage 1.55%
2026-09-24T14:20:20.8791886Z ##[debug]Agent environment resources - Disk: / Available 46256.00 MB out of 122356.00 MB, Memory: Used 12767.00 MB out of 64399.00 MB, CPU: Usage 1.53%
2026-09-24T14:20:25.8809981Z ##[debug]Agent environment resources - Disk: / Available 46256.00 MB out of 122356.00 MB, Memory: Used 12756.00 MB out of 64399.00 MB, CPU: Usage 1.52%
2026-09-24T14:20:30.8980035Z ##[debug]Agent environment resources - Disk: / Available 46256.00 MB out of 122356.00 MB, Memory: Used 12746.00 MB out of 64399.00 MB, CPU: Usage 1.50%
2026-09-24T14:20:35.9005701Z ##[debug]Agent environment resources - Disk: / Available 46228.00 MB out of 122356.00 MB, Memory: Used 12712.00 MB out of 64399.00 MB, CPU: Usage 1.49%
2026-09-24T14:20:40.9033778Z ##[debug]Agent environment resources - Disk: / Available 46224.00 MB out of 122356.00 MB, Memory: Used 12709.00 MB out of 64399.00 MB, CPU: Usage 1.48%
2026-09-24T14:20:45.9066690Z ##[debug]Agent environment resources - Disk: / Available 46224.00 MB out of 122356.00 MB, Memory: Used 12719.00 MB out of 64399.00 MB, CPU: Usage 1.46%
2026-09-24T14:20:50.9097566Z ##[debug]Agent environment resources - Disk: / Available 46224.00 MB out of 122356.00 MB, Memory: Used 12726.00 MB out of 64399.00 MB, CPU: Usage 1.45%
2026-09-24T14:20:55.9116474Z ##[debug]Agent environment resources - Disk: / Available 46216.00 MB out of 122356.00 MB, Memory: Used 12719.00 MB out of 64399.00 MB, CPU: Usage 1.44%
2026-09-24T14:21:00.9141388Z ##[debug]Agent environment resources - Disk: / Available 46216.00 MB out of 122356.00 MB, Memory: Used 12712.00 MB out of 64399.00 MB, CPU: Usage 1.42%
2026-09-24T14:21:05.9159141Z ##[debug]Agent environment resources - Disk: / Available 46216.00 MB out of 122356.00 MB, Memory: Used 12760.00 MB out of 64399.00 MB, CPU: Usage 1.41%
2026-09-24T14:21:10.9184274Z ##[debug]Agent environment resources - Disk: / Available 46216.00 MB out of 122356.00 MB, Memory: Used 12770.00 MB out of 64399.00 MB, CPU: Usage 1.40%
2026-09-24T14:21:15.9212788Z ##[debug]Agent environment resources - Disk: / Available 46216.00 MB out of 122356.00 MB, Memory: Used 12788.00 MB out of 64399.00 MB, CPU: Usage 1.39%
2026-09-24T14:21:20.9230530Z ##[debug]Agent environment resources - Disk: / Available 46216.00 MB out of 122356.00 MB, Memory: Used 12794.00 MB out of 64399.00 MB, CPU: Usage 1.38%
2026-09-24T14:21:25.9250459Z ##[debug]Agent environment resources - Disk: / Available 46216.00 MB out of 122356.00 MB, Memory: Used 12809.00 MB out of 64399.00 MB, CPU: Usage 1.37%
2026-09-24T14:21:30.9268179Z ##[debug]Agent environment resources - Disk: / Available 46208.00 MB out of 122356.00 MB, Memory: Used 12769.00 MB out of 64399.00 MB, CPU: Usage 1.35%
2026-09-24T14:21:35.9287425Z ##[debug]Agent environment resources - Disk: / Available 46208.00 MB out of 122356.00 MB, Memory: Used 12765.00 MB out of 64399.00 MB, CPU: Usage 1.35%
2026-09-24T14:21:40.9326289Z ##[debug]Agent environment resources - Disk: / Available 46208.00 MB out of 122356.00 MB, Memory: Used 12770.00 MB out of 64399.00 MB, CPU: Usage 1.33%
2026-09-24T14:21:45.9349428Z ##[debug]Agent environment resources - Disk: / Available 46208.00 MB out of 122356.00 MB, Memory: Used 12780.00 MB out of 64399.00 MB, CPU: Usage 1.32%
2026-09-24T14:21:50.9367864Z ##[debug]Agent environment resources - Disk: / Available 46200.00 MB out of 122356.00 MB, Memory: Used 12773.00 MB out of 64399.00 MB, CPU: Usage 1.31%
2026-09-24T14:21:55.9391313Z ##[debug]Agent environment resources - Disk: / Available 46200.00 MB out of 122356.00 MB, Memory: Used 12789.00 MB out of 64399.00 MB, CPU: Usage 1.30%
2026-09-24T14:22:00.9406949Z ##[debug]Agent environment resources - Disk: / Available 46328.00 MB out of 122356.00 MB, Memory: Used 12747.00 MB out of 64399.00 MB, CPU: Usage 1.29%
2026-09-24T14:22:05.9432544Z ##[debug]Agent environment resources - Disk: / Available 46312.00 MB out of 122356.00 MB, Memory: Used 12717.00 MB out of 64399.00 MB, CPU: Usage 1.28%
2026-09-24T14:22:10.9435859Z ##[debug]Agent environment resources - Disk: / Available 46312.00 MB out of 122356.00 MB, Memory: Used 12737.00 MB out of 64399.00 MB, CPU: Usage 1.27%
2026-09-24T14:22:15.9458104Z ##[debug]Agent environment resources - Disk: / Available 46312.00 MB out of 122356.00 MB, Memory: Used 12724.00 MB out of 64399.00 MB, CPU: Usage 1.26%
2026-09-24T14:22:20.9597703Z ##[debug]Agent environment resources - Disk: / Available 46304.00 MB out of 122356.00 MB, Memory: Used 12719.00 MB out of 64399.00 MB, CPU: Usage 1.25%
2026-09-24T14:22:25.9684625Z ##[debug]Agent environment resources - Disk: / Available 46318.00 MB out of 122356.00 MB, Memory: Used 12724.00 MB out of 64399.00 MB, CPU: Usage 1.25%
2026-09-24T14:22:30.9706179Z ##[debug]Agent environment resources - Disk: / Available 46300.00 MB out of 122356.00 MB, Memory: Used 12784.00 MB out of 64399.00 MB, CPU: Usage 1.24%
2026-09-24T14:22:35.9727823Z ##[debug]Agent environment resources - Disk: / Available 46280.00 MB out of 122356.00 MB, Memory: Used 12779.00 MB out of 64399.00 MB, CPU: Usage 1.23%
2026-09-24T14:22:40.9751076Z ##[debug]Agent environment resources - Disk: / Available 46280.00 MB out of 122356.00 MB, Memory: Used 12790.00 MB out of 64399.00 MB, CPU: Usage 1.22%
2026-09-24T14:22:45.9769790Z ##[debug]Agent environment resources - Disk: / Available 46272.00 MB out of 122356.00 MB, Memory: Used 12784.00 MB out of 64399.00 MB, CPU: Usage 1.21%
2026-09-24T14:22:50.9791426Z ##[debug]Agent environment resources - Disk: / Available 46288.00 MB out of 122356.00 MB, Memory: Used 12783.00 MB out of 64399.00 MB, CPU: Usage 1.20%
2026-09-24T14:22:55.9808683Z ##[debug]Agent environment resources - Disk: / Available 46286.00 MB out of 122356.00 MB, Memory: Used 12775.00 MB out of 64399.00 MB, CPU: Usage 1.19%
2026-09-24T14:23:00.9831550Z ##[debug]Agent environment resources - Disk: / Available 46272.00 MB out of 122356.00 MB, Memory: Used 12800.00 MB out of 64399.00 MB, CPU: Usage 1.19%
2026-09-24T14:23:05.9846841Z ##[debug]Agent environment resources - Disk: / Available 46264.00 MB out of 122356.00 MB, Memory: Used 12810.00 MB out of 64399.00 MB, CPU: Usage 1.18%
2026-09-24T14:23:10.9869030Z ##[debug]Agent environment resources - Disk: / Available 46256.00 MB out of 122356.00 MB, Memory: Used 12804.00 MB out of 64399.00 MB, CPU: Usage 1.17%
2026-09-24T14:23:15.9897469Z ##[debug]Agent environment resources - Disk: / Available 46268.00 MB out of 122356.00 MB, Memory: Used 12796.00 MB out of 64399.00 MB, CPU: Usage 1.16%
2026-09-24T14:23:20.9926595Z ##[debug]Agent environment resources - Disk: / Available 46264.00 MB out of 122356.00 MB, Memory: Used 12786.00 MB out of 64399.00 MB, CPU: Usage 1.15%
2026-09-24T14:23:25.9956018Z ##[debug]Agent environment resources - Disk: / Available 46260.00 MB out of 122356.00 MB, Memory: Used 12799.00 MB out of 64399.00 MB, CPU: Usage 1.15%
2026-09-24T14:23:30.9980208Z ##[debug]Agent environment resources - Disk: / Available 46272.00 MB out of 122356.00 MB, Memory: Used 12767.00 MB out of 64399.00 MB, CPU: Usage 1.14%
2026-09-24T14:23:36.0004439Z ##[debug]Agent environment resources - Disk: / Available 46228.00 MB out of 122356.00 MB, Memory: Used 12753.00 MB out of 64399.00 MB, CPU: Usage 1.13%
2026-09-24T14:23:41.0032359Z ##[debug]Agent environment resources - Disk: / Available 46228.00 MB out of 122356.00 MB, Memory: Used 12757.00 MB out of 64399.00 MB, CPU: Usage 1.12%
2026-09-24T14:23:46.0056080Z ##[debug]Agent environment resources - Disk: / Available 46228.00 MB out of 122356.00 MB, Memory: Used 12754.00 MB out of 64399.00 MB, CPU: Usage 1.12%
2026-09-24T14:23:51.0074841Z ##[debug]Agent environment resources - Disk: / Available 46220.00 MB out of 122356.00 MB, Memory: Used 12751.00 MB out of 64399.00 MB, CPU: Usage 1.11%
2026-09-24T14:23:56.0102042Z ##[debug]Agent environment resources - Disk: / Available 46227.00 MB out of 122356.00 MB, Memory: Used 12747.00 MB out of 64399.00 MB, CPU: Usage 1.10%
2026-09-24T14:24:01.0123007Z ##[debug]Agent environment resources - Disk: / Available 46239.00 MB out of 122356.00 MB, Memory: Used 12738.00 MB out of 64399.00 MB, CPU: Usage 1.10%
2026-09-24T14:24:06.0144184Z ##[debug]Agent environment resources - Disk: / Available 46233.00 MB out of 122356.00 MB, Memory: Used 12846.00 MB out of 64399.00 MB, CPU: Usage 1.09%
2026-09-24T14:24:11.0173407Z ##[debug]Agent environment resources - Disk: / Available 46225.00 MB out of 122356.00 MB, Memory: Used 12834.00 MB out of 64399.00 MB, CPU: Usage 1.08%
2026-09-24T14:24:16.0190004Z ##[debug]Agent environment resources - Disk: / Available 46225.00 MB out of 122356.00 MB, Memory: Used 12846.00 MB out of 64399.00 MB, CPU: Usage 1.08%
2026-09-24T14:24:21.0215725Z ##[debug]Agent environment resources - Disk: / Available 46225.00 MB out of 122356.00 MB, Memory: Used 12839.00 MB out of 64399.00 MB, CPU: Usage 1.07%
2026-09-24T14:24:26.0245160Z ##[debug]Agent environment resources - Disk: / Available 46232.00 MB out of 122356.00 MB, Memory: Used 12813.00 MB out of 64399.00 MB, CPU: Usage 1.06%
2026-09-24T14:24:31.0265454Z ##[debug]Agent environment resources - Disk: / Available 46229.00 MB out of 122356.00 MB, Memory: Used 12792.00 MB out of 64399.00 MB, CPU: Usage 1.06%
2026-09-24T14:24:36.0290335Z ##[debug]Agent environment resources - Disk: / Available 46225.00 MB out of 122356.00 MB, Memory: Used 12771.00 MB out of 64399.00 MB, CPU: Usage 1.05%
2026-09-24T14:24:41.0311326Z ##[debug]Agent environment resources - Disk: / Available 46225.00 MB out of 122356.00 MB, Memory: Used 12772.00 MB out of 64399.00 MB, CPU: Usage 1.05%
2026-09-24T14:24:46.0328815Z ##[debug]Agent environment resources - Disk: / Available 46217.00 MB out of 122356.00 MB, Memory: Used 12771.00 MB out of 64399.00 MB, CPU: Usage 1.04%
2026-09-24T14:24:51.0354507Z ##[debug]Agent environment resources - Disk: / Available 46217.00 MB out of 122356.00 MB, Memory: Used 12774.00 MB out of 64399.00 MB, CPU: Usage 1.03%
2026-09-24T14:24:56.0380899Z ##[debug]Agent environment resources - Disk: / Available 46217.00 MB out of 122356.00 MB, Memory: Used 12768.00 MB out of 64399.00 MB, CPU: Usage 1.03%
2026-09-24T14:25:01.0407777Z ##[debug]Agent environment resources - Disk: / Available 46349.00 MB out of 122356.00 MB, Memory: Used 12760.00 MB out of 64399.00 MB, CPU: Usage 1.02%
2026-09-24T14:25:06.0428517Z ##[debug]Agent environment resources - Disk: / Available 46329.00 MB out of 122356.00 MB, Memory: Used 12884.00 MB out of 64399.00 MB, CPU: Usage 1.02%
2026-09-24T14:25:11.0450706Z ##[debug]Agent environment resources - Disk: / Available 46329.00 MB out of 122356.00 MB, Memory: Used 12881.00 MB out of 64399.00 MB, CPU: Usage 1.01%
2026-09-24T14:25:16.0474306Z ##[debug]Agent environment resources - Disk: / Available 46321.00 MB out of 122356.00 MB, Memory: Used 12890.00 MB out of 64399.00 MB, CPU: Usage 1.01%
2026-09-24T14:25:21.0496733Z ##[debug]Agent environment resources - Disk: / Available 46335.00 MB out of 122356.00 MB, Memory: Used 12872.00 MB out of 64399.00 MB, CPU: Usage 1.00%
2026-09-24T14:25:26.0519134Z ##[debug]Agent environment resources - Disk: / Available 46333.00 MB out of 122356.00 MB, Memory: Used 12880.00 MB out of 64399.00 MB, CPU: Usage 0.99%
2026-09-24T14:25:31.0525811Z ##[debug]Agent environment resources - Disk: / Available 46313.00 MB out of 122356.00 MB, Memory: Used 12876.00 MB out of 64399.00 MB, CPU: Usage 0.99%
2026-09-24T14:25:36.0548378Z ##[debug]Agent environment resources - Disk: / Available 46289.00 MB out of 122356.00 MB, Memory: Used 12865.00 MB out of 64399.00 MB, CPU: Usage 0.98%
2026-09-24T14:25:41.0582179Z ##[debug]Agent environment resources - Disk: / Available 46303.00 MB out of 122356.00 MB, Memory: Used 12842.00 MB out of 64399.00 MB, CPU: Usage 0.98%
2026-09-24T14:25:46.0599884Z ##[debug]Agent environment resources - Disk: / Available 46297.00 MB out of 122356.00 MB, Memory: Used 12819.00 MB out of 64399.00 MB, CPU: Usage 0.97%
2026-09-24T14:25:51.0622987Z ##[debug]Agent environment resources - Disk: / Available 46288.00 MB out of 122356.00 MB, Memory: Used 12818.00 MB out of 64399.00 MB, CPU: Usage 0.97%
2026-09-24T14:25:56.0645621Z ##[debug]Agent environment resources - Disk: / Available 46517.00 MB out of 122356.00 MB, Memory: Used 12813.00 MB out of 64399.00 MB, CPU: Usage 0.96%
2026-09-24T14:26:01.0671584Z ##[debug]Agent environment resources - Disk: / Available 46509.00 MB out of 122356.00 MB, Memory: Used 12796.00 MB out of 64399.00 MB, CPU: Usage 0.96%
2026-09-24T14:26:06.0693103Z ##[debug]Agent environment resources - Disk: / Available 46501.00 MB out of 122356.00 MB, Memory: Used 12771.00 MB out of 64399.00 MB, CPU: Usage 0.95%
2026-09-24T14:26:11.0712967Z ##[debug]Agent environment resources - Disk: / Available 46501.00 MB out of 122356.00 MB, Memory: Used 12760.00 MB out of 64399.00 MB, CPU: Usage 0.95%
2026-09-24T14:26:16.0726830Z ##[debug]Agent environment resources - Disk: / Available 46501.00 MB out of 122356.00 MB, Memory: Used 12770.00 MB out of 64399.00 MB, CPU: Usage 0.94%
2026-09-24T14:26:21.0746651Z ##[debug]Agent environment resources - Disk: / Available 46492.00 MB out of 122356.00 MB, Memory: Used 12761.00 MB out of 64399.00 MB, CPU: Usage 0.94%
2026-09-24T14:26:26.0769246Z ##[debug]Agent environment resources - Disk: / Available 46505.00 MB out of 122356.00 MB, Memory: Used 12750.00 MB out of 64399.00 MB, CPU: Usage 0.94%
2026-09-24T14:26:31.0796123Z ##[debug]Agent environment resources - Disk: / Available 46492.00 MB out of 122356.00 MB, Memory: Used 12700.00 MB out of 64399.00 MB, CPU: Usage 0.93%
2026-09-24T14:26:36.0846125Z ##[debug]Agent environment resources - Disk: / Available 46465.00 MB out of 122356.00 MB, Memory: Used 12686.00 MB out of 64399.00 MB, CPU: Usage 0.93%
2026-09-24T14:26:41.0887171Z ##[debug]Agent environment resources - Disk: / Available 46452.00 MB out of 122356.00 MB, Memory: Used 12716.00 MB out of 64399.00 MB, CPU: Usage 0.92%
2026-09-24T14:26:46.0910490Z ##[debug]Agent environment resources - Disk: / Available 46453.00 MB out of 122356.00 MB, Memory: Used 12719.00 MB out of 64399.00 MB, CPU: Usage 0.92%
2026-09-24T14:26:51.0933050Z ##[debug]Agent environment resources - Disk: / Available 46452.00 MB out of 122356.00 MB, Memory: Used 12710.00 MB out of 64399.00 MB, CPU: Usage 0.91%
2026-09-24T14:26:56.0951987Z ##[debug]Agent environment resources - Disk: / Available 46453.00 MB out of 122356.00 MB, Memory: Used 12725.00 MB out of 64399.00 MB, CPU: Usage 0.91%
2026-09-24T14:27:01.0974723Z ##[debug]Agent environment resources - Disk: / Available 46444.00 MB out of 122356.00 MB, Memory: Used 12719.00 MB out of 64399.00 MB, CPU: Usage 0.91%
2026-09-24T14:27:06.0998721Z ##[debug]Agent environment resources - Disk: / Available 46444.00 MB out of 122356.00 MB, Memory: Used 12854.00 MB out of 64399.00 MB, CPU: Usage 0.90%
2026-09-24T14:27:11.1019367Z ##[debug]Agent environment resources - Disk: / Available 46457.00 MB out of 122356.00 MB, Memory: Used 12836.00 MB out of 64399.00 MB, CPU: Usage 0.90%
2026-09-24T14:27:16.1039021Z ##[debug]Agent environment resources - Disk: / Available 46444.00 MB out of 122356.00 MB, Memory: Used 12840.00 MB out of 64399.00 MB, CPU: Usage 0.89%
2026-09-24T14:27:21.1056767Z ##[debug]Agent environment resources - Disk: / Available 46457.00 MB out of 122356.00 MB, Memory: Used 12843.00 MB out of 64399.00 MB, CPU: Usage 0.89%
2026-09-24T14:27:26.1075426Z ##[debug]Agent environment resources - Disk: / Available 46436.00 MB out of 122356.00 MB, Memory: Used 12836.00 MB out of 64399.00 MB, CPU: Usage 0.88%
2026-09-24T14:27:31.1100136Z ##[debug]Agent environment resources - Disk: / Available 46436.00 MB out of 122356.00 MB, Memory: Used 12825.00 MB out of 64399.00 MB, CPU: Usage 0.88%
2026-09-24T14:27:36.1128542Z ##[debug]Agent environment resources - Disk: / Available 46437.00 MB out of 122356.00 MB, Memory: Used 12798.00 MB out of 64399.00 MB, CPU: Usage 0.88%
2026-09-24T14:27:41.1151488Z ##[debug]Agent environment resources - Disk: / Available 46437.00 MB out of 122356.00 MB, Memory: Used 12805.00 MB out of 64399.00 MB, CPU: Usage 0.87%
2026-09-24T14:27:46.1169471Z ##[debug]Agent environment resources - Disk: / Available 46438.00 MB out of 122356.00 MB, Memory: Used 12810.00 MB out of 64399.00 MB, CPU: Usage 0.87%
2026-09-24T14:27:51.1192140Z ##[debug]Agent environment resources - Disk: / Available 46438.00 MB out of 122356.00 MB, Memory: Used 12801.00 MB out of 64399.00 MB, CPU: Usage 0.87%
2026-09-24T14:27:56.1209476Z ##[debug]Agent environment resources - Disk: / Available 46444.00 MB out of 122356.00 MB, Memory: Used 12825.00 MB out of 64399.00 MB, CPU: Usage 0.86%
2026-09-24T14:28:01.1229314Z ##[debug]Agent environment resources - Disk: / Available 46555.00 MB out of 122356.00 MB, Memory: Used 12819.00 MB out of 64399.00 MB, CPU: Usage 0.86%
2026-09-24T14:28:06.1246359Z ##[debug]Agent environment resources - Disk: / Available 46540.00 MB out of 122356.00 MB, Memory: Used 12814.00 MB out of 64399.00 MB, CPU: Usage 0.85%
2026-09-24T14:28:11.1282943Z ##[debug]Agent environment resources - Disk: / Available 46548.00 MB out of 122356.00 MB, Memory: Used 12801.00 MB out of 64399.00 MB, CPU: Usage 0.85%
2026-09-24T14:28:16.1301310Z ##[debug]Agent environment resources - Disk: / Available 46548.00 MB out of 122356.00 MB, Memory: Used 12801.00 MB out of 64399.00 MB, CPU: Usage 0.85%
2026-09-24T14:28:21.1325574Z ##[debug]Agent environment resources - Disk: / Available 46548.00 MB out of 122356.00 MB, Memory: Used 12834.00 MB out of 64399.00 MB, CPU: Usage 0.84%
2026-09-24T14:28:26.1352976Z ##[debug]Agent environment resources - Disk: / Available 46548.00 MB out of 122356.00 MB, Memory: Used 12808.00 MB out of 64399.00 MB, CPU: Usage 0.84%
2026-09-24T14:28:31.1371646Z ##[debug]Agent environment resources - Disk: / Available 46532.00 MB out of 122356.00 MB, Memory: Used 12798.00 MB out of 64399.00 MB, CPU: Usage 0.84%
2026-09-24T14:28:36.1393141Z ##[debug]Agent environment resources - Disk: / Available 46516.00 MB out of 122356.00 MB, Memory: Used 12770.00 MB out of 64399.00 MB, CPU: Usage 0.83%
2026-09-24T14:28:41.1415693Z ##[debug]Agent environment resources - Disk: / Available 46516.00 MB out of 122356.00 MB, Memory: Used 12785.00 MB out of 64399.00 MB, CPU: Usage 0.83%
2026-09-24T14:28:46.1438932Z ##[debug]Agent environment resources - Disk: / Available 46520.00 MB out of 122356.00 MB, Memory: Used 12798.00 MB out of 64399.00 MB, CPU: Usage 0.83%
2026-09-24T14:28:51.1459686Z ##[debug]Agent environment resources - Disk: / Available 46516.00 MB out of 122356.00 MB, Memory: Used 12780.00 MB out of 64399.00 MB, CPU: Usage 0.82%
2026-09-24T14:28:56.1480430Z ##[debug]Agent environment resources - Disk: / Available 46516.00 MB out of 122356.00 MB, Memory: Used 12762.00 MB out of 64399.00 MB, CPU: Usage 0.82%
2026-09-24T14:29:01.1513280Z ##[debug]Agent environment resources - Disk: / Available 46500.00 MB out of 122356.00 MB, Memory: Used 12709.00 MB out of 64399.00 MB, CPU: Usage 0.82%
2026-09-24T14:29:06.1543122Z ##[debug]Agent environment resources - Disk: / Available 46500.00 MB out of 122356.00 MB, Memory: Used 12733.00 MB out of 64399.00 MB, CPU: Usage 0.81%
2026-09-24T14:29:11.1559334Z ##[debug]Agent environment resources - Disk: / Available 46500.00 MB out of 122356.00 MB, Memory: Used 12741.00 MB out of 64399.00 MB, CPU: Usage 0.81%
2026-09-24T14:29:16.1583701Z ##[debug]Agent environment resources - Disk: / Available 46491.00 MB out of 122356.00 MB, Memory: Used 12738.00 MB out of 64399.00 MB, CPU: Usage 0.80%
2026-09-24T14:29:21.1614988Z ##[debug]Agent environment resources - Disk: / Available 46492.00 MB out of 122356.00 MB, Memory: Used 12724.00 MB out of 64399.00 MB, CPU: Usage 0.80%
2026-09-24T14:29:26.1675681Z ##[debug]Agent environment resources - Disk: / Available 46491.00 MB out of 122356.00 MB, Memory: Used 12700.00 MB out of 64399.00 MB, CPU: Usage 0.80%
2026-09-24T14:29:31.1703767Z ##[debug]Agent environment resources - Disk: / Available 46492.00 MB out of 122356.00 MB, Memory: Used 12691.00 MB out of 64399.00 MB, CPU: Usage 0.80%
2026-09-24T14:29:36.1740467Z ##[debug]Agent environment resources - Disk: / Available 46466.00 MB out of 122356.00 MB, Memory: Used 12707.00 MB out of 64399.00 MB, CPU: Usage 0.79%
2026-09-24T14:29:41.1763532Z ##[debug]Agent environment resources - Disk: / Available 46451.00 MB out of 122356.00 MB, Memory: Used 12690.00 MB out of 64399.00 MB, CPU: Usage 0.79%
2026-09-24T14:29:46.1792222Z ##[debug]Agent environment resources - Disk: / Available 46451.00 MB out of 122356.00 MB, Memory: Used 12759.00 MB out of 64399.00 MB, CPU: Usage 0.79%
2026-09-24T14:29:51.1806192Z ##[debug]Agent environment resources - Disk: / Available 46451.00 MB out of 122356.00 MB, Memory: Used 12763.00 MB out of 64399.00 MB, CPU: Usage 0.78%
2026-09-24T14:29:56.1830181Z ##[debug]Agent environment resources - Disk: / Available 46452.00 MB out of 122356.00 MB, Memory: Used 12761.00 MB out of 64399.00 MB, CPU: Usage 0.78%
2026-09-24T14:30:01.1861126Z ##[debug]Agent environment resources - Disk: / Available 46452.00 MB out of 122356.00 MB, Memory: Used 12728.00 MB out of 64399.00 MB, CPU: Usage 0.78%
2026-09-24T14:30:06.1881424Z ##[debug]Agent environment resources - Disk: / Available 46436.00 MB out of 122356.00 MB, Memory: Used 12724.00 MB out of 64399.00 MB, CPU: Usage 0.78%
2026-09-24T14:30:11.1900464Z ##[debug]Agent environment resources - Disk: / Available 46444.00 MB out of 122356.00 MB, Memory: Used 12738.00 MB out of 64399.00 MB, CPU: Usage 0.77%
2026-09-24T14:30:16.1923077Z ##[debug]Agent environment resources - Disk: / Available 46435.00 MB out of 122356.00 MB, Memory: Used 12726.00 MB out of 64399.00 MB, CPU: Usage 0.77%
2026-09-24T14:30:21.1939961Z ##[debug]Agent environment resources - Disk: / Available 46444.00 MB out of 122356.00 MB, Memory: Used 12716.00 MB out of 64399.00 MB, CPU: Usage 0.77%
2026-09-24T14:30:26.1966243Z ##[debug]Agent environment resources - Disk: / Available 46436.00 MB out of 122356.00 MB, Memory: Used 12701.00 MB out of 64399.00 MB, CPU: Usage 0.76%
2026-09-24T14:30:31.1994969Z ##[debug]Agent environment resources - Disk: / Available 46448.00 MB out of 122356.00 MB, Memory: Used 12679.00 MB out of 64399.00 MB, CPU: Usage 0.76%
2026-09-24T14:30:36.2024103Z ##[debug]Agent environment resources - Disk: / Available 46448.00 MB out of 122356.00 MB, Memory: Used 12667.00 MB out of 64399.00 MB, CPU: Usage 0.76%
2026-09-24T14:30:41.2051366Z ##[debug]Agent environment resources - Disk: / Available 46435.00 MB out of 122356.00 MB, Memory: Used 12654.00 MB out of 64399.00 MB, CPU: Usage 0.75%
2026-09-24T14:30:46.2075114Z ##[debug]Agent environment resources - Disk: / Available 46436.00 MB out of 122356.00 MB, Memory: Used 12762.00 MB out of 64399.00 MB, CPU: Usage 0.75%
2026-09-24T14:30:51.2101003Z ##[debug]Agent environment resources - Disk: / Available 46436.00 MB out of 122356.00 MB, Memory: Used 12786.00 MB out of 64399.00 MB, CPU: Usage 0.75%
2026-09-24T14:30:56.2123975Z ##[debug]Agent environment resources - Disk: / Available 46548.00 MB out of 122356.00 MB, Memory: Used 12769.00 MB out of 64399.00 MB, CPU: Usage 0.75%
2026-09-24T14:31:01.2152574Z ##[debug]Agent environment resources - Disk: / Available 46548.00 MB out of 122356.00 MB, Memory: Used 12745.00 MB out of 64399.00 MB, CPU: Usage 0.74%
2026-09-24T14:31:06.2173095Z ##[debug]Agent environment resources - Disk: / Available 46532.00 MB out of 122356.00 MB, Memory: Used 12739.00 MB out of 64399.00 MB, CPU: Usage 0.74%
2026-09-24T14:31:11.2191599Z ##[debug]Agent environment resources - Disk: / Available 46540.00 MB out of 122356.00 MB, Memory: Used 12741.00 MB out of 64399.00 MB, CPU: Usage 0.74%
2026-09-24T14:31:16.2211834Z ##[debug]Agent environment resources - Disk: / Available 46540.00 MB out of 122356.00 MB, Memory: Used 12751.00 MB out of 64399.00 MB, CPU: Usage 0.74%
2026-09-24T14:31:21.2234858Z ##[debug]Agent environment resources - Disk: / Available 46540.00 MB out of 122356.00 MB, Memory: Used 12749.00 MB out of 64399.00 MB, CPU: Usage 0.74%
2026-09-24T14:31:26.2268515Z ##[debug]Agent environment resources - Disk: / Available 46540.00 MB out of 122356.00 MB, Memory: Used 12735.00 MB out of 64399.00 MB, CPU: Usage 0.73%
2026-09-24T14:31:31.2293917Z ##[debug]Agent environment resources - Disk: / Available 46524.00 MB out of 122356.00 MB, Memory: Used 12702.00 MB out of 64399.00 MB, CPU: Usage 0.73%
2026-09-24T14:31:36.2321796Z ##[debug]Agent environment resources - Disk: / Available 46517.00 MB out of 122356.00 MB, Memory: Used 12718.00 MB out of 64399.00 MB, CPU: Usage 0.73%
2026-09-24T14:31:41.2349311Z ##[debug]Agent environment resources - Disk: / Available 46521.00 MB out of 122356.00 MB, Memory: Used 12698.00 MB out of 64399.00 MB, CPU: Usage 0.72%
2026-09-24T14:31:46.2384193Z ##[debug]Agent environment resources - Disk: / Available 46521.00 MB out of 122356.00 MB, Memory: Used 12746.00 MB out of 64399.00 MB, CPU: Usage 0.72%
2026-09-24T14:31:51.2408675Z ##[debug]Agent environment resources - Disk: / Available 46508.00 MB out of 122356.00 MB, Memory: Used 12756.00 MB out of 64399.00 MB, CPU: Usage 0.72%
2026-09-24T14:31:56.2430386Z ##[debug]Agent environment resources - Disk: / Available 46516.00 MB out of 122356.00 MB, Memory: Used 12744.00 MB out of 64399.00 MB, CPU: Usage 0.72%
2026-09-24T14:32:01.2451704Z ##[debug]Agent environment resources - Disk: / Available 46508.00 MB out of 122356.00 MB, Memory: Used 12721.00 MB out of 64399.00 MB, CPU: Usage 0.72%
2026-09-24T14:32:06.2458944Z ##[debug]Agent environment resources - Disk: / Available 46506.00 MB out of 122356.00 MB, Memory: Used 12731.00 MB out of 64399.00 MB, CPU: Usage 0.71%
2026-09-24T14:32:11.2478802Z ##[debug]Agent environment resources - Disk: / Available 46500.00 MB out of 122356.00 MB, Memory: Used 12751.00 MB out of 64399.00 MB, CPU: Usage 0.71%
2026-09-24T14:32:16.2506552Z ##[debug]Agent environment resources - Disk: / Available 46504.00 MB out of 122356.00 MB, Memory: Used 12768.00 MB out of 64399.00 MB, CPU: Usage 0.71%
2026-09-24T14:32:21.2534456Z ##[debug]Agent environment resources - Disk: / Available 46504.00 MB out of 122356.00 MB, Memory: Used 12749.00 MB out of 64399.00 MB, CPU: Usage 0.71%
2026-09-24T14:32:26.2561275Z ##[debug]Agent environment resources - Disk: / Available 46500.00 MB out of 122356.00 MB, Memory: Used 12708.00 MB out of 64399.00 MB, CPU: Usage 0.70%
2026-09-24T14:32:31.2581156Z ##[debug]Agent environment resources - Disk: / Available 46484.00 MB out of 122356.00 MB, Memory: Used 12691.00 MB out of 64399.00 MB, CPU: Usage 0.70%
2026-09-24T14:32:36.2600052Z ##[debug]Agent environment resources - Disk: / Available 46443.00 MB out of 122356.00 MB, Memory: Used 12698.00 MB out of 64399.00 MB, CPU: Usage 0.70%
2026-09-24T14:32:41.2616849Z ##[debug]Agent environment resources - Disk: / Available 46452.00 MB out of 122356.00 MB, Memory: Used 12711.00 MB out of 64399.00 MB, CPU: Usage 0.70%
2026-09-24T14:32:46.2649370Z ##[debug]Agent environment resources - Disk: / Available 46452.00 MB out of 122356.00 MB, Memory: Used 12757.00 MB out of 64399.00 MB, CPU: Usage 0.70%
2026-09-24T14:32:51.2668796Z ##[debug]Agent environment resources - Disk: / Available 46452.00 MB out of 122356.00 MB, Memory: Used 12756.00 MB out of 64399.00 MB, CPU: Usage 0.69%
2026-09-24T14:32:56.2690153Z ##[debug]Agent environment resources - Disk: / Available 46452.00 MB out of 122356.00 MB, Memory: Used 12729.00 MB out of 64399.00 MB, CPU: Usage 0.69%
2026-09-24T14:33:01.2710516Z ##[debug]Agent environment resources - Disk: / Available 46443.00 MB out of 122356.00 MB, Memory: Used 12707.00 MB out of 64399.00 MB, CPU: Usage 0.69%
2026-09-24T14:33:06.2734197Z ##[debug]Agent environment resources - Disk: / Available 46450.00 MB out of 122356.00 MB, Memory: Used 12717.00 MB out of 64399.00 MB, CPU: Usage 0.69%
2026-09-24T14:33:11.2759087Z ##[debug]Agent environment resources - Disk: / Available 46450.00 MB out of 122356.00 MB, Memory: Used 12729.00 MB out of 64399.00 MB, CPU: Usage 0.69%
2026-09-24T14:33:16.2788532Z ##[debug]Agent environment resources - Disk: / Available 46452.00 MB out of 122356.00 MB, Memory: Used 12720.00 MB out of 64399.00 MB, CPU: Usage 0.68%
2026-09-24T14:33:21.2822960Z ##[debug]Agent environment resources - Disk: / Available 46448.00 MB out of 122356.00 MB, Memory: Used 12722.00 MB out of 64399.00 MB, CPU: Usage 0.68%
2026-09-24T14:33:26.2845134Z ##[debug]Agent environment resources - Disk: / Available 46447.00 MB out of 122356.00 MB, Memory: Used 12712.00 MB out of 64399.00 MB, CPU: Usage 0.68%
2026-09-24T14:33:31.2871369Z ##[debug]Agent environment resources - Disk: / Available 46439.00 MB out of 122356.00 MB, Memory: Used 12699.00 MB out of 64399.00 MB, CPU: Usage 0.68%
2026-09-24T14:33:36.2896639Z ##[debug]Agent environment resources - Disk: / Available 46557.00 MB out of 122356.00 MB, Memory: Used 12671.00 MB out of 64399.00 MB, CPU: Usage 0.67%
2026-09-24T14:33:41.2924662Z ##[debug]Agent environment resources - Disk: / Available 46555.00 MB out of 122356.00 MB, Memory: Used 12665.00 MB out of 64399.00 MB, CPU: Usage 0.67%
2026-09-24T14:33:46.2941462Z ##[debug]Agent environment resources - Disk: / Available 46555.00 MB out of 122356.00 MB, Memory: Used 12682.00 MB out of 64399.00 MB, CPU: Usage 0.67%
2026-09-24T14:33:51.2959664Z ##[debug]Agent environment resources - Disk: / Available 46549.00 MB out of 122356.00 MB, Memory: Used 12684.00 MB out of 64399.00 MB, CPU: Usage 0.67%
2026-09-24T14:33:55.8188759Z ##[debug]Re-evaluate condition on job cancellation for step: 'Recupera Versão no POM'.
2026-09-24T14:33:55.8200159Z ##[error]The Operation will be canceled. The next steps may not contain expected logs.
2026-09-24T14:33:55.8248047Z ##[debug]Started cancellation of executing script
2026-09-24T14:33:55.8258994Z ##[debug]Exit code null received from tool '/usr/bin/bash'
2026-09-24T14:33:55.8267550Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-09-24T14:33:55.8298291Z ##[error]Bash exited with code 'null'.
2026-09-24T14:33:55.8298751Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code 'null'.
2026-09-24T14:33:55.8299230Z ##[debug]task result: Failed
2026-09-24T14:33:55.8300698Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-09-24T14:33:55.8431034Z ##[error]The operation was canceled.
2026-09-24T14:33:55.8434837Z ##[debug]System.OperationCanceledException: The operation was canceled.
   at System.Threading.CancellationToken.ThrowOperationCanceledException()
   at Microsoft.VisualStudio.Services.Agent.Util.ProcessInvoker.ExecuteAsync(String workingDirectory, String fileName, String arguments, IDictionary`2 environment, Boolean requireExitCodeZero, Encoding outputEncoding, Boolean killProcessOnCancel, InputQueue`1 redirectStandardIn, Boolean inheritConsoleHandler, Boolean keepStandardInOpen, Boolean highPriorityProcess, Boolean continueAfterCancelProcessTreeKillAttempt, CancellationToken cancellationToken) in /mnt/vss/_work/1/s/src/Agent.Sdk/ProcessInvoker.cs:line 376
   at Microsoft.VisualStudio.Services.Agent.ProcessInvokerWrapper.ExecuteAsync(String workingDirectory, String fileName, String arguments, IDictionary`2 environment, Boolean requireExitCodeZero, Encoding outputEncoding, Boolean killProcessOnCancel, InputQueue`1 redirectStandardIn, Boolean inheritConsoleHandler, Boolean keepStandardInOpen, Boolean highPriorityProcess, Boolean continueAfterCancelProcessTreeKillAttempt, CancellationToken cancellationToken) in /mnt/vss/_work/1/s/src/Microsoft.VisualStudio.Services.Agent/ProcessInvoker.cs:line 308
   at Microsoft.VisualStudio.Services.Agent.Worker.Handlers.DefaultStepHost.ExecuteAsync(String workingDirectory, String fileName, String arguments, IDictionary`2 environment, Boolean requireExitCodeZero, Encoding outputEncoding, Boolean killProcessOnCancel, Boolean inheritConsoleHandler, Boolean continueAfterCancelProcessTreeKillAttempt, CancellationToken cancellationToken) in /mnt/vss/_work/1/s/src/Agent.Worker/Handlers/StepHost.cs:line 76
   at Microsoft.VisualStudio.Services.Agent.Worker.Handlers.NodeHandler.RunAsync() in /mnt/vss/_work/1/s/src/Agent.Worker/Handlers/NodeHandler.cs:line 245
   at Microsoft.VisualStudio.Services.Agent.Worker.TaskRunner.RunAsyncInternal() in /mnt/vss/_work/1/s/src/Agent.Worker/TaskRunner.cs:line 446
   at Microsoft.VisualStudio.Services.Agent.Worker.TaskRunner.RunAsync() in /mnt/vss/_work/1/s/src/Agent.Worker/TaskRunner.cs:line 76
   at Microsoft.VisualStudio.Services.Agent.Worker.StepsRunner.RunStepAsync(IStep step, CancellationToken jobCancellationToken) in /mnt/vss/_work/1/s/src/Agent.Worker/StepsRunner.cs:line 264
2026-09-24T14:33:55.8437092Z ##[section]Finishing: Recupera Versão no POM
