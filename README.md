Prezados!

Solicito apoio para resolver o problema que estamos tendo ao rodar a release do SIHDG-JBOSS8-TQS.

Foi feito o refactory da aplicação do SIHDG, em TQS, (para jboss 8, angular 19 e java 21), estamos tentando implantar a primeira release e não estamos conseguindo. 

*** Foi criada regra de firewall na CRQ000001499711.

*** Foi dado permissões ao usuario de serviço SHDGTB01 na REQ000146465331.

https://console-openshift-console.apps.nprd.caixa/k8s/ns/sihdg-tqs/pods/sihdg-jboss8-tqs-31-5q4xb/logs 

https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=537625&environmentId=2498030

Segue detalhes do erro:

15:48:28,442 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("deploy") failed - address: ([("deployment" => "sihdg-3.18.0.1.ear")]) - failure description: {"WFLYCTL0080: Failed services" => {
"jboss.deployment.subunit.\"sihdg-3.18.0.1.ear\".\"sihdg-api.war\".component.CacheConfig.START" => "java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
Caused by: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
Caused by: jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: The TCP/IP connection to the host 10.116.29.201, port 31153 has failed. Error: \"Connect timed out. Verify the connection properties. Make sure that an instance of SQL Server is running on the host and accepting TCP/IP connections at the port. Make sure that TCP connections to the port are not blocked by a firewall.\".",
"jboss.deployment.subunit.\"sihdg-3.18.0.1.ear\".\"sihdg-api.war\".component.SecurityConfig.START" => "java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
Caused by: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
Caused by: jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: The TCP/IP connection to the host 10.116.29.201, port 31153 has failed. Error: \"Connect timed out. Verify the connection properties. Make sure that an instance of SQL Server is running on the host and accepting TCP/IP connections at the port. Make sure that TCP connections to the port are not blocked by a firewall.\"."


Atenciosamente,
Sandra




2026-10-08T11:52:29.5295865Z ##[debug]Evaluating condition for step: 'Verificando Status do Deployment'
2026-10-08T11:52:29.5296594Z ##[debug]Evaluating: succeeded()
2026-10-08T11:52:29.5296889Z ##[debug]Evaluating succeeded:
2026-10-08T11:52:29.5297325Z ##[debug]=> True
2026-10-08T11:52:29.5297626Z ##[debug]Result: True
2026-10-08T11:52:29.5297935Z ##[section]Starting: Verificando Status do Deployment
2026-10-08T11:52:29.5301488Z ==============================================================================
2026-10-08T11:52:29.5301564Z Task         : Bash
2026-10-08T11:52:29.5301609Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-08T11:52:29.5301706Z Version      : 3.227.0
2026-10-08T11:52:29.5301752Z Author       : Microsoft Corporation
2026-10-08T11:52:29.5301804Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-08T11:52:29.5301912Z ==============================================================================
2026-10-08T11:52:29.5983979Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-10-08T11:52:29.6690387Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-10-08T11:52:29.6697469Z ##[debug]loading inputs and endpoints
2026-10-08T11:52:29.6705432Z ##[debug]loading INPUT_TARGETTYPE
2026-10-08T11:52:29.6718019Z ##[debug]loading INPUT_FILEPATH
2026-10-08T11:52:29.6718599Z ##[debug]loading INPUT_SCRIPT
2026-10-08T11:52:29.6719359Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-10-08T11:52:29.6720375Z ##[debug]loading INPUT_FAILONSTDERR
2026-10-08T11:52:29.6720662Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-10-08T11:52:29.6721005Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-10-08T11:52:29.6721339Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-10-08T11:52:29.6725646Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-10-08T11:52:29.6726117Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-10-08T11:52:29.6726387Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-10-08T11:52:29.6728294Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-10-08T11:52:29.6729701Z ##[debug]loading SECRET_DATASOURCE_PASSWORD
2026-10-08T11:52:29.6730911Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-10-08T11:52:29.6731571Z ##[debug]loading SECRET_AZPAT
2026-10-08T11:52:29.6732152Z ##[debug]loading SECRET_PW_ALOCAIP
2026-10-08T11:52:29.6732806Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-10-08T11:52:29.6733449Z ##[debug]loading SECRET_PW_ISILON
2026-10-08T11:52:29.6734058Z ##[debug]loading SECRET_FORTIFY_PASS
2026-10-08T11:52:29.6734515Z ##[debug]loading SECRET_TOKEN_CRQ
2026-10-08T11:52:29.6735855Z ##[debug]loading SECRET_PASSWORD_CGC
2026-10-08T11:52:29.6736330Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-10-08T11:52:29.6736856Z ##[debug]loaded 22
2026-10-08T11:52:29.6741521Z ##[debug]Agent.ProxyUrl=undefined
2026-10-08T11:52:29.6741878Z ##[debug]Agent.CAInfo=undefined
2026-10-08T11:52:29.6742175Z ##[debug]Agent.ClientCert=undefined
2026-10-08T11:52:29.6742465Z ##[debug]Agent.SkipCertValidation=True
2026-10-08T11:52:29.6757533Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-08T11:52:29.6759006Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-08T11:52:29.6759501Z ##[debug]system.culture=en-US
2026-10-08T11:52:29.6767242Z ##[debug]failOnStderr=false
2026-10-08T11:52:29.6768825Z ##[debug]workingDirectory=/opt/ads-agent/_work/r668/a
2026-10-08T11:52:29.6769109Z ##[debug]check path : /opt/ads-agent/_work/r668/a
2026-10-08T11:52:29.6769678Z ##[debug]targetType=inline
2026-10-08T11:52:29.6769973Z ##[debug]bashEnvValue=undefined
2026-10-08T11:52:29.6770594Z ##[debug]script=if [[ -n "$SITE" && "$SITE" =~ (okd4|ocp|openshift) ]];
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
2026-10-08T11:52:29.6779319Z Generating script.
2026-10-08T11:52:29.6780981Z ##[debug]which 'bash'
2026-10-08T11:52:29.6786548Z ##[debug]found: '/usr/bin/bash'
2026-10-08T11:52:29.6787013Z ##[debug]Agent.Version=3.236.1
2026-10-08T11:52:29.6787307Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-10-08T11:52:29.6787625Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-10-08T11:52:29.6790133Z ========================== Starting Command Output ===========================
2026-10-08T11:52:29.6791261Z ##[debug]which '/usr/bin/bash'
2026-10-08T11:52:29.6792236Z ##[debug]found: '/usr/bin/bash'
2026-10-08T11:52:29.6792894Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/1002d809-70e2-4fb1-907f-46bd03892fd4.sh
2026-10-08T11:52:29.6795295Z ##[debug]exec tool: /usr/bin/bash
2026-10-08T11:52:29.6795608Z ##[debug]arguments:
2026-10-08T11:52:29.6795921Z ##[debug]   /opt/ads-agent/_work/_temp/1002d809-70e2-4fb1-907f-46bd03892fd4.sh
2026-10-08T11:52:29.6797570Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/1002d809-70e2-4fb1-907f-46bd03892fd4.sh
2026-10-08T11:52:29.7696484Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-10-08T11:52:31.9107044Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-10-08T11:52:31.9628201Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-10-08T11:52:34.5206134Z ##[debug]Agent environment resources - Disk: / Available 67350.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 18.42%
2026-10-08T11:52:39.5222044Z ##[debug]Agent environment resources - Disk: / Available 67348.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 16.67%
2026-10-08T11:52:44.5230403Z ##[debug]Agent environment resources - Disk: / Available 67342.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 15.19%
2026-10-08T11:52:49.5234771Z ##[debug]Agent environment resources - Disk: / Available 67344.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 13.98%
2026-10-08T11:52:54.5247961Z ##[debug]Agent environment resources - Disk: / Available 67338.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 12.93%
2026-10-08T11:52:59.5256959Z ##[debug]Agent environment resources - Disk: / Available 67338.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 12.04%
2026-10-08T11:53:04.5261281Z ##[debug]Agent environment resources - Disk: / Available 67336.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 11.25%
2026-10-08T11:53:09.5265905Z ##[debug]Agent environment resources - Disk: / Available 67337.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 10.59%
2026-10-08T11:53:14.5281485Z ##[debug]Agent environment resources - Disk: / Available 67337.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 9.99%
2026-10-08T11:53:19.5287711Z ##[debug]Agent environment resources - Disk: / Available 67337.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 9.46%
2026-10-08T11:53:24.5299593Z ##[debug]Agent environment resources - Disk: / Available 67337.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 9.01%
2026-10-08T11:53:29.5305103Z ##[debug]Agent environment resources - Disk: / Available 67337.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 8.57%
2026-10-08T11:53:34.5311928Z ##[debug]Agent environment resources - Disk: / Available 67329.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 8.17%
2026-10-08T11:53:39.5314472Z ##[debug]Agent environment resources - Disk: / Available 67329.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.82%
2026-10-08T11:53:44.5330146Z ##[debug]Agent environment resources - Disk: / Available 67326.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.50%
2026-10-08T11:53:49.5339891Z ##[debug]Agent environment resources - Disk: / Available 67328.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.20%
2026-10-08T11:53:54.5344640Z ##[debug]Agent environment resources - Disk: / Available 67328.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.91%
2026-10-08T11:53:59.5360248Z ##[debug]Agent environment resources - Disk: / Available 67329.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.67%
2026-10-08T11:54:04.5364731Z ##[debug]Agent environment resources - Disk: / Available 67329.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.43%
2026-10-08T11:54:09.5392887Z ##[debug]Agent environment resources - Disk: / Available 67297.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.21%
2026-10-08T11:54:14.5417949Z ##[debug]Agent environment resources - Disk: / Available 67305.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.00%
2026-10-08T11:54:19.5444451Z ##[debug]Agent environment resources - Disk: / Available 67305.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.81%
2026-10-08T11:54:24.5455711Z ##[debug]Agent environment resources - Disk: / Available 67297.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.63%
2026-10-08T11:54:29.5463381Z ##[debug]Agent environment resources - Disk: / Available 67297.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.47%
2026-10-08T11:54:34.5481479Z ##[debug]Agent environment resources - Disk: / Available 67297.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.31%
2026-10-08T11:54:39.5480743Z ##[debug]Agent environment resources - Disk: / Available 67297.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.16%
2026-10-08T11:54:44.5489898Z ##[debug]Agent environment resources - Disk: / Available 67299.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.02%
2026-10-08T11:54:49.5496424Z ##[debug]Agent environment resources - Disk: / Available 67287.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.89%
2026-10-08T11:54:54.5508112Z ##[debug]Agent environment resources - Disk: / Available 67280.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.76%
2026-10-08T11:54:59.5521114Z ##[debug]Agent environment resources - Disk: / Available 67281.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.65%
2026-10-08T11:55:04.5529176Z ##[debug]Agent environment resources - Disk: / Available 67280.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.53%
2026-10-08T11:55:09.5546149Z ##[debug]Agent environment resources - Disk: / Available 67280.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.42%
2026-10-08T11:55:14.5552281Z ##[debug]Agent environment resources - Disk: / Available 67281.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.32%
2026-10-08T11:55:19.5560942Z ##[debug]Agent environment resources - Disk: / Available 67285.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.22%
2026-10-08T11:55:24.5564298Z ##[debug]Agent environment resources - Disk: / Available 67285.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.13%
2026-10-08T11:55:29.5580054Z ##[debug]Agent environment resources - Disk: / Available 67277.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.04%
2026-10-08T11:55:34.5597067Z ##[debug]Agent environment resources - Disk: / Available 67275.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.95%
2026-10-08T11:55:39.5597759Z ##[debug]Agent environment resources - Disk: / Available 67275.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.87%
2026-10-08T11:55:44.5607045Z ##[debug]Agent environment resources - Disk: / Available 67275.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.79%
2026-10-08T11:55:49.5613165Z ##[debug]Agent environment resources - Disk: / Available 67274.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.72%
2026-10-08T11:55:54.5625617Z ##[debug]Agent environment resources - Disk: / Available 67274.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.65%
2026-10-08T11:55:59.5639766Z ##[debug]Agent environment resources - Disk: / Available 67272.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.58%
2026-10-08T11:56:04.5648003Z ##[debug]Agent environment resources - Disk: / Available 67270.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.51%
2026-10-08T11:56:09.5656897Z ##[debug]Agent environment resources - Disk: / Available 67271.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.45%
2026-10-08T11:56:14.5667358Z ##[debug]Agent environment resources - Disk: / Available 67393.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.39%
2026-10-08T11:56:19.5681699Z ##[debug]Agent environment resources - Disk: / Available 67409.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.33%
2026-10-08T11:56:24.5687755Z ##[debug]Agent environment resources - Disk: / Available 67410.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.27%
2026-10-08T11:56:29.5700025Z ##[debug]Agent environment resources - Disk: / Available 67402.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.22%
2026-10-08T11:56:34.5703790Z ##[debug]Agent environment resources - Disk: / Available 67402.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.17%
2026-10-08T11:56:39.5714478Z ##[debug]Agent environment resources - Disk: / Available 67400.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.11%
2026-10-08T11:56:44.5721217Z ##[debug]Agent environment resources - Disk: / Available 67402.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.07%
2026-10-08T11:56:49.5733438Z ##[debug]Agent environment resources - Disk: / Available 67400.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.02%
2026-10-08T11:56:54.5750213Z ##[debug]Agent environment resources - Disk: / Available 67402.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.97%
2026-10-08T11:56:59.5754005Z ##[debug]Agent environment resources - Disk: / Available 67394.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.93%
2026-10-08T11:57:04.5788126Z ##[debug]Agent environment resources - Disk: / Available 67391.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.88%
2026-10-08T11:57:09.5793779Z ##[debug]Agent environment resources - Disk: / Available 67391.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.84%
2026-10-08T11:57:14.5804128Z ##[debug]Agent environment resources - Disk: / Available 67391.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.80%
2026-10-08T11:57:19.5819171Z ##[debug]Agent environment resources - Disk: / Available 67388.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.76%
2026-10-08T11:57:24.5827676Z ##[debug]Agent environment resources - Disk: / Available 67390.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.72%
2026-10-08T11:57:29.5835910Z ##[debug]Agent environment resources - Disk: / Available 67390.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.69%
2026-10-08T11:57:34.5850377Z ##[debug]Agent environment resources - Disk: / Available 67391.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.65%
2026-10-08T11:57:39.5858794Z ##[debug]Agent environment resources - Disk: / Available 67383.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.62%
2026-10-08T11:57:44.5874527Z ##[debug]Agent environment resources - Disk: / Available 67382.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.58%
2026-10-08T11:57:49.5884986Z ##[debug]Agent environment resources - Disk: / Available 67380.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.55%
2026-10-08T11:57:54.5891679Z ##[debug]Agent environment resources - Disk: / Available 67378.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.52%
2026-10-08T11:57:59.5901033Z ##[debug]Agent environment resources - Disk: / Available 67386.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.49%
2026-10-08T11:58:04.5910336Z ##[debug]Agent environment resources - Disk: / Available 67382.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.46%
2026-10-08T11:58:09.5914245Z ##[debug]Agent environment resources - Disk: / Available 67375.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.43%
2026-10-08T11:58:14.5936687Z ##[debug]Agent environment resources - Disk: / Available 67370.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.40%
2026-10-08T11:58:19.5939414Z ##[debug]Agent environment resources - Disk: / Available 67375.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.37%
2026-10-08T11:58:24.5946530Z ##[debug]Agent environment resources - Disk: / Available 67375.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.34%
2026-10-08T11:58:29.5350447Z ##[debug]Started cancellation of executing script
2026-10-08T11:58:29.5359706Z ##[debug]Exit code null received from tool '/usr/bin/bash'
2026-10-08T11:58:37.0437743Z ##[error]The task has timed out.
2026-10-08T11:58:37.0439666Z ##[section]Finishing: Verificando Status do Deployment



2026-10-08T11:58:37.0466404Z ##[debug]Evaluating condition for step: 'Logs da Aplicação'
2026-10-08T11:58:37.0467634Z ##[debug]Evaluating: always()
2026-10-08T11:58:37.0467838Z ##[debug]Evaluating always:
2026-10-08T11:58:37.0468965Z ##[debug]=> True
2026-10-08T11:58:37.0469300Z ##[debug]Result: True
2026-10-08T11:58:37.0469510Z ##[section]Starting: Logs da Aplicação
2026-10-08T11:58:37.0474296Z ==============================================================================
2026-10-08T11:58:37.0474384Z Task         : Bash
2026-10-08T11:58:37.0474429Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-08T11:58:37.0474528Z Version      : 3.227.0
2026-10-08T11:58:37.0474573Z Author       : Microsoft Corporation
2026-10-08T11:58:37.0474626Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-08T11:58:37.0474737Z ==============================================================================
2026-10-08T11:58:37.1265765Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-10-08T11:58:37.2000481Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-10-08T11:58:37.2008872Z ##[debug]loading inputs and endpoints
2026-10-08T11:58:37.2016888Z ##[debug]loading INPUT_TARGETTYPE
2026-10-08T11:58:37.2025319Z ##[debug]loading INPUT_FILEPATH
2026-10-08T11:58:37.2026087Z ##[debug]loading INPUT_SCRIPT
2026-10-08T11:58:37.2027622Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-10-08T11:58:37.2028336Z ##[debug]loading INPUT_FAILONSTDERR
2026-10-08T11:58:37.2029442Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-10-08T11:58:37.2030476Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-10-08T11:58:37.2033340Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-10-08T11:58:37.2039322Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-10-08T11:58:37.2041538Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-10-08T11:58:37.2043636Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-10-08T11:58:37.2046605Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-10-08T11:58:37.2047981Z ##[debug]loading SECRET_DATASOURCE_PASSWORD
2026-10-08T11:58:37.2049916Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-10-08T11:58:37.2050671Z ##[debug]loading SECRET_AZPAT
2026-10-08T11:58:37.2051774Z ##[debug]loading SECRET_PW_ALOCAIP
2026-10-08T11:58:37.2052550Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-10-08T11:58:37.2053580Z ##[debug]loading SECRET_PW_ISILON
2026-10-08T11:58:37.2054448Z ##[debug]loading SECRET_FORTIFY_PASS
2026-10-08T11:58:37.2055202Z ##[debug]loading SECRET_TOKEN_CRQ
2026-10-08T11:58:37.2057350Z ##[debug]loading SECRET_PASSWORD_CGC
2026-10-08T11:58:37.2057864Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-10-08T11:58:37.2058701Z ##[debug]loaded 22
2026-10-08T11:58:37.2064703Z ##[debug]Agent.ProxyUrl=undefined
2026-10-08T11:58:37.2067112Z ##[debug]Agent.CAInfo=undefined
2026-10-08T11:58:37.2067545Z ##[debug]Agent.ClientCert=undefined
2026-10-08T11:58:37.2067994Z ##[debug]Agent.SkipCertValidation=True
2026-10-08T11:58:37.2083247Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-08T11:58:37.2086379Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-08T11:58:37.2086744Z ##[debug]system.culture=en-US
2026-10-08T11:58:37.2096493Z ##[debug]failOnStderr=false
2026-10-08T11:58:37.2097991Z ##[debug]workingDirectory=/opt/ads-agent/_work/r668/a
2026-10-08T11:58:37.2098312Z ##[debug]check path : /opt/ads-agent/_work/r668/a
2026-10-08T11:58:37.2099081Z ##[debug]targetType=inline
2026-10-08T11:58:37.2099340Z ##[debug]bashEnvValue=undefined
2026-10-08T11:58:37.2100328Z ##[debug]script=#!/bin/bash
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
2026-10-08T11:58:37.2111175Z Generating script.
2026-10-08T11:58:37.2114911Z ##[debug]which 'bash'
2026-10-08T11:58:37.2123357Z ##[debug]found: '/usr/bin/bash'
2026-10-08T11:58:37.2124917Z ##[debug]Agent.Version=3.236.1
2026-10-08T11:58:37.2125232Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-10-08T11:58:37.2125551Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-10-08T11:58:37.2128969Z ========================== Starting Command Output ===========================
2026-10-08T11:58:37.2130395Z ##[debug]which '/usr/bin/bash'
2026-10-08T11:58:37.2131628Z ##[debug]found: '/usr/bin/bash'
2026-10-08T11:58:37.2133023Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/aad1a2b2-891c-4ad8-879b-4cba3dea9fd0.sh
2026-10-08T11:58:37.2136405Z ##[debug]exec tool: /usr/bin/bash
2026-10-08T11:58:37.2136705Z ##[debug]arguments:
2026-10-08T11:58:37.2137017Z ##[debug]   /opt/ads-agent/_work/_temp/aad1a2b2-891c-4ad8-879b-4cba3dea9fd0.sh
2026-10-08T11:58:37.2138956Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/aad1a2b2-891c-4ad8-879b-4cba3dea9fd0.sh
2026-10-08T11:58:37.2217037Z + shopt -s expand_aliases
2026-10-08T11:58:37.2217300Z + [[ -n okd4_nprd ]]
2026-10-08T11:58:37.2217407Z + [[ okd4_nprd =~ ocp ]]
2026-10-08T11:58:37.2217578Z + [[ -n okd4_nprd ]]
2026-10-08T11:58:37.2217718Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-10-08T11:58:37.2217983Z + app=sihdg-jboss8-tqs
2026-10-08T11:58:37.2218184Z + oc version
2026-10-08T11:58:37.2924834Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-10-08T11:58:37.2925159Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-10-08T11:58:37.2925353Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-10-08T11:58:37.2959730Z ++ oc get pod -l name=sihdg-jboss8-tqs -n sihdg-tqs -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-10-08T11:58:37.2960411Z ++ tac
2026-10-08T11:58:37.2962929Z ++ grep -v '^$'
2026-10-08T11:58:37.2963090Z ++ head -n1
2026-10-08T11:58:37.3819642Z + last_pod=sihdg-jboss8-tqs-32-8cq9f
2026-10-08T11:58:37.3820422Z + echo 'Logs do POD: sihdg-jboss8-tqs-32-8cq9f'
2026-10-08T11:58:37.3820947Z + oc logs sihdg-jboss8-tqs-32-8cq9f -c sihdg-jboss8-tqs -n sihdg-tqs
2026-10-08T11:58:37.3821950Z Logs do POD: sihdg-jboss8-tqs-32-8cq9f
2026-10-08T11:58:37.4614251Z Using openshift launcher.
2026-10-08T11:58:37.4614963Z 2026-10-08 11:58:33 Launching WildFly Server
2026-10-08T11:58:37.4615178Z INFO Access log is disabled, ignoring configuration.
2026-10-08T11:58:37.4615451Z INFO Clustering feature is not enabled, no jgroups subsystem present in server configuration.
2026-10-08T11:58:37.4617028Z INFO Server started in admin mode, CLI script executed during server boot.
2026-10-08T11:58:37.4617441Z INFO Running jboss-eap-8/eap8-openjdk21-builder-openshift-rhel9 image, version 1.0.1.GA
2026-10-08T11:58:37.4618673Z JAVA_OPTS already set in environment; overriding default settings with values:  -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider -Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djava.security.properties=/opt/server/bin/java.security.override -Djava.security.disableSystemPropertiesFile=true
2026-10-08T11:58:37.4619472Z =========================================================================
2026-10-08T11:58:37.4619624Z 
2026-10-08T11:58:37.4619840Z   JBoss Bootstrap Environment
2026-10-08T11:58:37.4619936Z 
2026-10-08T11:58:37.4620117Z   JBOSS_HOME: /opt/server
2026-10-08T11:58:37.4620186Z 
2026-10-08T11:58:37.4620444Z   JAVA: /usr/lib/jvm/java-21/bin/java
2026-10-08T11:58:37.4620884Z 
2026-10-08T11:58:37.4623475Z   JAVA_OPTS:  -Xlog:gc*:file="/opt/server/standalone/log/gc.log":time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter="maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000"  -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider -Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djava.security.properties=/opt/server/bin/java.security.override -Djava.security.disableSystemPropertiesFile=true  --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-exports=jdk.naming.dns/com.sun.jndi.dns=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED
2026-10-08T11:58:37.4625069Z 
2026-10-08T11:58:37.4625323Z =========================================================================
2026-10-08T11:58:37.4625444Z 
2026-10-08T11:58:37.4625840Z [0m08:58:34,393 INFO  [org.jboss.modules] (main) JBoss Modules version 2.1.6.Final-redhat-00001
2026-10-08T11:58:37.4626302Z [0m[0m08:58:35,200 INFO  [org.jboss.msc] (main) JBoss MSC version 1.5.5.Final-redhat-00001
2026-10-08T11:58:37.4626753Z [0m[0m08:58:35,259 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
2026-10-08T11:58:37.4627289Z [0m[0m08:58:35,381 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) starting
2026-10-08T11:58:37.4627626Z [0m[32m08:58:35,383 DEBUG [org.jboss.as.config] (MSC service thread 1-2) Configured system properties:
2026-10-08T11:58:37.4627772Z 	[Standalone] = 
2026-10-08T11:58:37.4627912Z 	file.encoding = UTF-8
2026-10-08T11:58:37.4628054Z 	file.separator = /
2026-10-08T11:58:37.4628253Z 	java.class.path = /opt/server/jboss-modules.jar
2026-10-08T11:58:37.4628413Z 	java.class.version = 65.0
2026-10-08T11:58:37.4628639Z 	java.home = /usr/lib/jvm/java-21-openjdk-21.0.10.0.7-1.el9.x86_64
2026-10-08T11:58:37.4628765Z 	java.io.tmpdir = /tmp
2026-10-08T11:58:37.4628928Z 	java.library.path = /usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib
2026-10-08T11:58:37.4629095Z 	java.net.preferIPv4Stack = true
2026-10-08T11:58:37.4629255Z 	java.runtime.name = OpenJDK Runtime Environment
2026-10-08T11:58:37.4629415Z 	java.runtime.version = 21.0.10+7-LTS
2026-10-08T11:58:37.4629576Z 	java.security.disableSystemPropertiesFile = true
2026-10-08T11:58:37.4629732Z 	java.security.egd = file:/dev/./urandom
2026-10-08T11:58:37.4629865Z 	java.security.properties = /opt/server/bin/java.security.override
2026-10-08T11:58:37.4630041Z 	java.specification.name = Java Platform API Specification
2026-10-08T11:58:37.4630207Z 	java.specification.vendor = Oracle Corporation
2026-10-08T11:58:37.4630360Z 	java.specification.version = 21
2026-10-08T11:58:37.4630523Z 	java.util.logging.manager = org.jboss.logmanager.LogManager
2026-10-08T11:58:37.4630732Z 	java.vendor = Red Hat, Inc.
2026-10-08T11:58:37.4630883Z 	java.vendor.url = https://www.redhat.com/
2026-10-08T11:58:37.4631048Z 	java.vendor.url.bug = https://access.redhat.com/support/cases/
2026-10-08T11:58:37.4631271Z 	java.vendor.version = (Red_Hat-21.0.10.0.7-1)
2026-10-08T11:58:37.4631385Z 	java.version = 21.0.10
2026-10-08T11:58:37.4631656Z 	java.version.date = 2026-01-20
2026-10-08T11:58:37.4631808Z 	java.vm.compressedOopsMode = 32-bit
2026-10-08T11:58:37.4631997Z 	java.vm.info = mixed mode, sharing
2026-10-08T11:58:37.4632196Z 	java.vm.name = OpenJDK 64-Bit Server VM
2026-10-08T11:58:37.4632363Z 	java.vm.specification.name = Java Virtual Machine Specification
2026-10-08T11:58:37.4632533Z 	java.vm.specification.vendor = Oracle Corporation
2026-10-08T11:58:37.4632793Z 	java.vm.specification.version = 21
2026-10-08T11:58:37.4633021Z 	java.vm.vendor = Red Hat, Inc.
2026-10-08T11:58:37.4633237Z 	java.vm.version = 21.0.10+7-LTS
2026-10-08T11:58:37.4633519Z 	javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
2026-10-08T11:58:37.4633822Z 	javax.net.ssl.trustStore = /opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks
2026-10-08T11:58:37.4634007Z 	jboss.bind.address = 25.2.8.208
2026-10-08T11:58:37.4634155Z 	jboss.bind.address.management = 0.0.0.0
2026-10-08T11:58:37.4634282Z 	jboss.bind.address.private = 25.2.8.208
2026-10-08T11:58:37.4634428Z 	jboss.home.dir = /opt/server
2026-10-08T11:58:37.4634625Z 	jboss.host.name = sihdg-jboss8-tqs-32-8cq9f
2026-10-08T11:58:37.4634793Z 	jboss.messaging.cluster.password = <redacted>
2026-10-08T11:58:37.4634946Z 	jboss.messaging.host = 25.2.8.208
2026-10-08T11:58:37.4635208Z 	jboss.modules.system.pkgs = jdk.nashorn.api,com.sun.crypto.provider
2026-10-08T11:58:37.4635441Z 	jboss.node.name = sihdg-jboss8-tqs-32-8cq9f
2026-10-08T11:58:37.4635630Z 	jboss.qualified.host.name = sihdg-jboss8-tqs-32-8cq9f
2026-10-08T11:58:37.4635797Z 	jboss.server.base.dir = /opt/server/standalone
2026-10-08T11:58:37.4635964Z 	jboss.server.config.dir = /opt/server/standalone/configuration
2026-10-08T11:58:37.4636133Z 	jboss.server.data.dir = /opt/server/standalone/data
2026-10-08T11:58:37.4636300Z 	jboss.server.log.dir = /opt/server/standalone/log
2026-10-08T11:58:37.4636506Z 	jboss.server.name = sihdg-jboss8-tqs-32-8cq9f
2026-10-08T11:58:37.4636662Z 	jboss.server.persist.config = true
2026-10-08T11:58:37.4636786Z 	jboss.server.temp.dir = /opt/server/standalone/tmp
2026-10-08T11:58:37.4636994Z 	jboss.tx.node.id = hdg-jboss8-tqs-32-8cq9f
2026-10-08T11:58:37.4637140Z 	jdk.debug = release
2026-10-08T11:58:37.4637308Z 	jdk.serialFilter = maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
2026-10-08T11:58:37.4637477Z 	line.separator = 
2026-10-08T11:58:37.4637521Z 
2026-10-08T11:58:37.4637680Z 	logging.configuration = file:/opt/server/standalone/configuration/logging.properties
2026-10-08T11:58:37.4637852Z 	module.path = /opt/server/modules
2026-10-08T11:58:37.4638017Z 	native.encoding = ANSI_X3.4-1968
2026-10-08T11:58:37.4638334Z 	org.jboss.boot.log.file = /opt/server/standalone/log/server.log
2026-10-08T11:58:37.4638504Z 	org.jboss.resolver.warning = true
2026-10-08T11:58:37.4638884Z 	org.wildfly.internal.cli.boot.hook.marker.dir = /tmp/cli-boot-reload-marker-1791460713
2026-10-08T11:58:37.4639151Z 	org.wildfly.internal.cli.boot.hook.script = /tmp/cli-script-1791460713.cli
2026-10-08T11:58:37.4639424Z 	org.wildfly.internal.cli.boot.hook.script.error.file = /tmp/cli-script-error-1791460713.cli
2026-10-08T11:58:37.4639700Z 	org.wildfly.internal.cli.boot.hook.script.output.file = /tmp/cli-script-output-1791460713.cli
2026-10-08T11:58:37.4639972Z 	org.wildfly.internal.cli.boot.hook.script.properties = /tmp/cli-script-property-1791460713.cli
2026-10-08T11:58:37.4640237Z 	org.wildfly.internal.cli.boot.hook.script.warn.file = /tmp/cli-warning-1791460713.log
2026-10-08T11:58:37.4640399Z 	os.arch = amd64
2026-10-08T11:58:37.4640498Z 	os.name = Linux
2026-10-08T11:58:37.4640685Z 	os.version = 6.1.18-200.fc37.x86_64
2026-10-08T11:58:37.4640825Z 	path.separator = :
2026-10-08T11:58:37.4640989Z 	stderr.encoding = ANSI_X3.4-1968
2026-10-08T11:58:37.4641153Z 	stdout.encoding = ANSI_X3.4-1968
2026-10-08T11:58:37.4641294Z 	sun.arch.data.model = 64
2026-10-08T11:58:37.4641501Z 	sun.boot.library.path = /usr/lib/jvm/java-21-openjdk-21.0.10.0.7-1.el9.x86_64/lib
2026-10-08T11:58:37.4641802Z 	sun.cpu.endian = little
2026-10-08T11:58:37.4641950Z 	sun.io.unicode.encoding = UnicodeLittle
2026-10-08T11:58:37.4643218Z 	sun.java.command = /opt/server/jboss-modules.jar -mp /opt/server/modules org.jboss.as.standalone -Djboss.home.dir=/opt/server -Djboss.server.base.dir=/opt/server/standalone -c standalone.xml -Djboss.messaging.host=25.2.8.208 -Djboss.messaging.cluster.password=<redacted> --start-mode=admin-only -Dorg.wildfly.internal.cli.boot.hook.script=/tmp/cli-script-1791460713.cli -Dorg.wildfly.internal.cli.boot.hook.marker.dir=/tmp/cli-boot-reload-marker-1791460713 -Dorg.wildfly.internal.cli.boot.hook.script.properties=/tmp/cli-script-property-1791460713.cli -Dorg.wildfly.internal.cli.boot.hook.script.error.file=/tmp/cli-script-error-1791460713.cli -Dorg.wildfly.internal.cli.boot.hook.script.warn.file=/tmp/cli-warning-1791460713.log -Dorg.wildfly.internal.cli.boot.hook.script.output.file=/tmp/cli-script-output-1791460713.cli -Djboss.node.name=sihdg-jboss8-tqs-32-8cq9f -Djboss.tx.node.id=hdg-jboss8-tqs-32-8cq9f -bprivate 25.2.8.208 -b 25.2.8.208 -bmanagement 0.0.0.0 -Dwildfly.statistics-enabled=true
2026-10-08T11:58:37.4644052Z 	sun.java.launcher = SUN_STANDARD
2026-10-08T11:58:37.4644201Z 	sun.jnu.encoding = ANSI_X3.4-1968
2026-10-08T11:58:37.4644414Z 	sun.management.compiler = HotSpot 64-Bit Tiered Compilers
2026-10-08T11:58:37.4644572Z 	user.country = US
2026-10-08T11:58:37.4644708Z 	user.dir = /home/jboss
2026-10-08T11:58:37.4644847Z 	user.home = /home/jboss
2026-10-08T11:58:37.4644981Z 	user.language = en
2026-10-08T11:58:37.4645113Z 	user.name = jboss
2026-10-08T11:58:37.4645220Z 	user.timezone = America/Sao_Paulo
2026-10-08T11:58:37.4645407Z 	wildfly.statistics-enabled = true
2026-10-08T11:58:37.4647245Z [0m[32m08:58:35,384 DEBUG [org.jboss.as.config] (MSC service thread 1-2) VM Arguments: -D[Standalone] -Xlog:gc*:file=/opt/server/standalone/log/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider -Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djava.security.properties=/opt/server/bin/java.security.override -Djava.security.disableSystemPropertiesFile=true --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-exports=jdk.naming.dns/com.sun.jndi.dns=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/opt/server/standalone/log/server.log -Dlogging.configuration=file:/opt/server/standalone/configuration/logging.properties 
2026-10-08T11:58:37.4648509Z [0m[0m08:58:36,674 INFO  [org.wildfly.security] (ServerService Thread Pool -- 16) ELY00001: WildFly Elytron version 2.2.14.Final-redhat-00001
2026-10-08T11:58:37.4673185Z ##[debug]Exit code 0 received from tool '/usr/bin/bash'
2026-10-08T11:58:37.4676375Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-10-08T11:58:37.4682859Z ##[debug]task result: Succeeded
2026-10-08T11:58:37.4684276Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-10-08T11:58:37.4718556Z ##[section]Finishing: Logs da Aplicação



-sh-4.2$
-sh-4.2$ oc get pods
NAME                            READY     STATUS      RESTARTS      AGE
sihdg-angular18-tqs-22-deploy   0/1       Completed   0             8d
sihdg-angular18-tqs-23-deploy   0/1       Completed   0             6d21h
sihdg-angular18-tqs-23-k2hwq    2/2       Running     0             6d21h
sihdg-backend-tqs-142-deploy    0/1       Completed   0             79d
sihdg-backend-tqs-143-deploy    0/1       Completed   0             33d
sihdg-backend-tqs-143-wltb8     1/1       Running     0             33d
sihdg-frontend-tqs-78-deploy    0/1       Completed   0             226d
sihdg-frontend-tqs-79-deploy    0/1       Completed   0             142d
sihdg-frontend-tqs-79-lb6fz     2/2       Running     0             142d
sihdg-jboss8-tqs-27-deploy      0/1       Completed   0             6d21h
sihdg-jboss8-tqs-28-deploy      0/1       Completed   0             6d19h
sihdg-jboss8-tqs-28-q6ngx       1/1       Running     0             6d19h
sihdg-jboss8-tqs-29-deploy      0/1       Error       0             5d15h
sihdg-jboss8-tqs-30-deploy      0/1       Error       0             3d
sihdg-jboss8-tqs-31-deploy      0/1       Error       0             18h
sihdg-jboss8-tqs-32-deploy      0/1       Error       0             87m
sihdg-jboss8-tqs-33-deploy      1/1       Running     0             9m5s
sihdg-jboss8-tqs-33-xb8lm       0/1       Running     4 (71s ago)   9m2s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$

