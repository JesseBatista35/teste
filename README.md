2026-10-30T18:49:55.1454518Z ##[debug]Evaluating condition for step: 'Criando o ConfigMap jboss-config'
2026-10-30T18:49:55.1455235Z ##[debug]Evaluating: succeeded()
2026-10-30T18:49:55.1455401Z ##[debug]Evaluating succeeded:
2026-10-30T18:49:55.1455702Z ##[debug]=> True
2026-10-30T18:49:55.1455876Z ##[debug]Result: True
2026-10-30T18:49:55.1456113Z ##[section]Starting: Criando o ConfigMap jboss-config
2026-10-30T18:49:55.1459366Z ==============================================================================
2026-10-30T18:49:55.1459446Z Task         : Bash
2026-10-30T18:49:55.1459491Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-30T18:49:55.1459563Z Version      : 3.227.0
2026-10-30T18:49:55.1459606Z Author       : Microsoft Corporation
2026-10-30T18:49:55.1459657Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-30T18:49:55.1459739Z ==============================================================================
2026-10-30T18:49:55.2020255Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-10-30T18:49:55.2739043Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-10-30T18:49:55.2748141Z ##[debug]loading inputs and endpoints
2026-10-30T18:49:55.2755757Z ##[debug]loading INPUT_TARGETTYPE
2026-10-30T18:49:55.2763256Z ##[debug]loading INPUT_FILEPATH
2026-10-30T18:49:55.2764444Z ##[debug]loading INPUT_SCRIPT
2026-10-30T18:49:55.2765397Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-10-30T18:49:55.2766045Z ##[debug]loading INPUT_FAILONSTDERR
2026-10-30T18:49:55.2767109Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-10-30T18:49:55.2767754Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-10-30T18:49:55.2769967Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-10-30T18:49:55.2775868Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-10-30T18:49:55.2777091Z ##[debug]loading SECRET_AZPAT
2026-10-30T18:49:55.2778691Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-10-30T18:49:55.2780602Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-10-30T18:49:55.2782185Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-10-30T18:49:55.2783487Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-10-30T18:49:55.2784163Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-10-30T18:49:55.2784920Z ##[debug]loading SECRET_PW_ALOCAIP
2026-10-30T18:49:55.2785518Z ##[debug]loading SECRET_TOKEN_CRQ
2026-10-30T18:49:55.2786108Z ##[debug]loading SECRET_PW_ISILON
2026-10-30T18:49:55.2786690Z ##[debug]loading SECRET_PASSWORD_CGC
2026-10-30T18:49:55.2787253Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-10-30T18:49:55.2788787Z ##[debug]loading SECRET_FORTIFY_PASS
2026-10-30T18:49:55.2789641Z ##[debug]loading SECRET_DATASOURCE_PASSWORD
2026-10-30T18:49:55.2790271Z ##[debug]loaded 22
2026-10-30T18:49:55.2795502Z ##[debug]Agent.ProxyUrl=undefined
2026-10-30T18:49:55.2796389Z ##[debug]Agent.CAInfo=undefined
2026-10-30T18:49:55.2796679Z ##[debug]Agent.ClientCert=undefined
2026-10-30T18:49:55.2796910Z ##[debug]Agent.SkipCertValidation=True
2026-10-30T18:49:55.2811775Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-30T18:49:55.2813562Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-30T18:49:55.2813844Z ##[debug]system.culture=en-US
2026-10-30T18:49:55.2822164Z ##[debug]failOnStderr=false
2026-10-30T18:49:55.2823512Z ##[debug]workingDirectory=/opt/ads-agent/_work/r57/a
2026-10-30T18:49:55.2823767Z ##[debug]check path : /opt/ads-agent/_work/r57/a
2026-10-30T18:49:55.2824280Z ##[debug]targetType=inline
2026-10-30T18:49:55.2824619Z ##[debug]bashEnvValue=undefined
2026-10-30T18:49:55.2825454Z ##[debug]script=oc create configmap jboss-config-sihdg-jboss8  --from-file="/opt/ads-agent/_work/r57/a/_SIHDG-jboss8-config/standalone-okd.xml" -n sihdg-hmp
2026-10-30T18:49:55.2834405Z Generating script.
2026-10-30T18:49:55.2836489Z ##[debug]which 'bash'
2026-10-30T18:49:55.2842546Z ##[debug]found: '/usr/bin/bash'
2026-10-30T18:49:55.2842697Z Script contents:
2026-10-30T18:49:55.2843610Z oc create configmap jboss-config-sihdg-jboss8  --from-file="/opt/ads-agent/_work/r57/a/_SIHDG-jboss8-config/standalone-okd.xml" -n sihdg-hmp
2026-10-30T18:49:55.2843930Z ##[debug]Agent.Version=3.236.1
2026-10-30T18:49:55.2847118Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-10-30T18:49:55.2847532Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-10-30T18:49:55.2850386Z ========================== Starting Command Output ===========================
2026-10-30T18:49:55.2851949Z ##[debug]which '/usr/bin/bash'
2026-10-30T18:49:55.2852908Z ##[debug]found: '/usr/bin/bash'
2026-10-30T18:49:55.2853628Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/df844904-53a9-486e-8dbd-fb0abfc8af96.sh
2026-10-30T18:49:55.2856611Z ##[debug]exec tool: /usr/bin/bash
2026-10-30T18:49:55.2856832Z ##[debug]arguments:
2026-10-30T18:49:55.2857086Z ##[debug]   /opt/ads-agent/_work/_temp/df844904-53a9-486e-8dbd-fb0abfc8af96.sh
2026-10-30T18:49:55.2859526Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/df844904-53a9-486e-8dbd-fb0abfc8af96.sh
2026-10-30T18:49:55.3381676Z error: error reading /opt/ads-agent/_work/r57/a/_SIHDG-jboss8-config/standalone-okd.xml: no such file or directory
2026-10-30T18:49:55.3416128Z ##[debug]Exit code 1 received from tool '/usr/bin/bash'
2026-10-30T18:49:55.3418832Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-10-30T18:49:55.3446761Z ##[error]Bash exited with code '1'.
2026-10-30T18:49:55.3447495Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '1'.
2026-10-30T18:49:55.3447950Z ##[debug]task result: Failed
2026-10-30T18:49:55.3448931Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-10-30T18:49:55.3460651Z ##[section]Finishing: Criando o ConfigMap jboss-config
