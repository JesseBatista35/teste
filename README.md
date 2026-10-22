2026-10-21T13:34:50.5999730Z ##[debug]Evaluating condition for step: 'Logs da Aplicação'
2026-10-21T13:34:50.6000252Z ##[debug]Evaluating: always()
2026-10-21T13:34:50.6000390Z ##[debug]Evaluating always:
2026-10-21T13:34:50.6001418Z ##[debug]=> True
2026-10-21T13:34:50.6001628Z ##[debug]Result: True
2026-10-21T13:34:50.6001792Z ##[section]Starting: Logs da Aplicação
2026-10-21T13:34:50.6004712Z ==============================================================================
2026-10-21T13:34:50.6004830Z Task         : Bash
2026-10-21T13:34:50.6004874Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-21T13:34:50.6004943Z Version      : 3.227.0
2026-10-21T13:34:50.6004985Z Author       : Microsoft Corporation
2026-10-21T13:34:50.6005036Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-21T13:34:50.6005113Z ==============================================================================
2026-10-21T13:34:50.6524814Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-10-21T13:34:50.7214248Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-10-21T13:34:50.7221347Z ##[debug]loading inputs and endpoints
2026-10-21T13:34:50.7228857Z ##[debug]loading INPUT_TARGETTYPE
2026-10-21T13:34:50.7236042Z ##[debug]loading INPUT_FILEPATH
2026-10-21T13:34:50.7237178Z ##[debug]loading INPUT_SCRIPT
2026-10-21T13:34:50.7237849Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-10-21T13:34:50.7238449Z ##[debug]loading INPUT_FAILONSTDERR
2026-10-21T13:34:50.7239137Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-10-21T13:34:50.7239848Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-10-21T13:34:50.7241938Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-10-21T13:34:50.7246613Z ##[debug]loading SECRET_FORTIFY_PASS
2026-10-21T13:34:50.7248036Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-10-21T13:34:50.7249460Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-10-21T13:34:50.7251432Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-10-21T13:34:50.7252947Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-10-21T13:34:50.7254151Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-10-21T13:34:50.7254801Z ##[debug]loading SECRET_AZPAT
2026-10-21T13:34:50.7255354Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-10-21T13:34:50.7255927Z ##[debug]loading SECRET_PASSWORD_CGC
2026-10-21T13:34:50.7256528Z ##[debug]loading SECRET_PW_ISILON
2026-10-21T13:34:50.7257002Z ##[debug]loading SECRET_PW_ALOCAIP
2026-10-21T13:34:50.7257547Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-10-21T13:34:50.7258932Z ##[debug]loading SECRET_TOKEN_CRQ
2026-10-21T13:34:50.7259349Z ##[debug]loaded 21
2026-10-21T13:34:50.7263851Z ##[debug]Agent.ProxyUrl=undefined
2026-10-21T13:34:50.7264152Z ##[debug]Agent.CAInfo=undefined
2026-10-21T13:34:50.7265028Z ##[debug]Agent.ClientCert=undefined
2026-10-21T13:34:50.7265319Z ##[debug]Agent.SkipCertValidation=True
2026-10-21T13:34:50.7278494Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-21T13:34:50.7280462Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-21T13:34:50.7280747Z ##[debug]system.culture=en-US
2026-10-21T13:34:50.7288009Z ##[debug]failOnStderr=false
2026-10-21T13:34:50.7288928Z ##[debug]workingDirectory=/opt/ads-agent/_work/r687/a
2026-10-21T13:34:50.7289174Z ##[debug]check path : /opt/ads-agent/_work/r687/a
2026-10-21T13:34:50.7290511Z ##[debug]targetType=inline
2026-10-21T13:34:50.7290739Z ##[debug]bashEnvValue=undefined
2026-10-21T13:34:50.7291569Z ##[debug]script=#!/bin/bash
set -o errexit
set -o pipefail
set -x

shopt -s expand_aliases

if [[ -n "$SITE" && "okd4_nprd" =~ "ocp" ]]
then
  app="sicow-penhor-okd-des"

  arquivo="/usr/local/bin/oc-v4.13"
  if [ -e "$arquivo" ]; then 
    alias oc="$arquivo"
  fi
elif [[ -n "$SITE" && "$SITE" =~ (okd4|openshift) ]];
then
app="sicow-penhor-okd-des"
else
  app="sicow-penhor-okd-des-esteiras"
fi

oc version

last_pod=$(oc get pod -l name="$app" -n sicow-des -o jsonpath='{range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp  | tac | grep -v '^$' | head -n1)

echo "Logs do POD: $last_pod"
oc logs $last_pod -c "$app" -n sicow-des
2026-10-21T13:34:50.7299741Z Generating script.
2026-10-21T13:34:50.7301718Z ##[debug]which 'bash'
2026-10-21T13:34:50.7306770Z ##[debug]found: '/usr/bin/bash'
2026-10-21T13:34:50.7307150Z ##[debug]Agent.Version=3.236.1
2026-10-21T13:34:50.7307465Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-10-21T13:34:50.7307707Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-10-21T13:34:50.7310175Z ========================== Starting Command Output ===========================
2026-10-21T13:34:50.7311205Z ##[debug]which '/usr/bin/bash'
2026-10-21T13:34:50.7312079Z ##[debug]found: '/usr/bin/bash'
2026-10-21T13:34:50.7312666Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/532af952-b70c-49eb-81ba-804af90fabd1.sh
2026-10-21T13:34:50.7314806Z ##[debug]exec tool: /usr/bin/bash
2026-10-21T13:34:50.7315240Z ##[debug]arguments:
2026-10-21T13:34:50.7315650Z ##[debug]   /opt/ads-agent/_work/_temp/532af952-b70c-49eb-81ba-804af90fabd1.sh
2026-10-21T13:34:50.7317023Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/532af952-b70c-49eb-81ba-804af90fabd1.sh
2026-10-21T13:34:50.7381573Z + shopt -s expand_aliases
2026-10-21T13:34:50.7382310Z + [[ -n okd4_nprd ]]
2026-10-21T13:34:50.7382458Z + [[ okd4_nprd =~ ocp ]]
2026-10-21T13:34:50.7382592Z + [[ -n okd4_nprd ]]
2026-10-21T13:34:50.7384994Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-10-21T13:34:50.7385608Z + app=sicow-penhor-okd-des
2026-10-21T13:34:50.7385766Z + oc version
2026-10-21T13:34:50.8029652Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-10-21T13:34:50.8029915Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-10-21T13:34:50.8030105Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-10-21T13:34:50.8059240Z ++ oc get pod -l name=sicow-penhor-okd-des -n sicow-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-10-21T13:34:50.8060467Z ++ tac
2026-10-21T13:34:50.8060608Z ++ grep -v '^$'
2026-10-21T13:34:50.8062344Z ++ head -n1
2026-10-21T13:34:50.8860846Z + last_pod=sicow-penhor-okd-des-55-x2pb5
2026-10-21T13:34:50.8861112Z + echo 'Logs do POD: sicow-penhor-okd-des-55-x2pb5'
2026-10-21T13:34:50.8861348Z + oc logs sicow-penhor-okd-des-55-x2pb5 -c sicow-penhor-okd-des -n sicow-des
2026-10-21T13:34:50.8861539Z Logs do POD: sicow-penhor-okd-des-55-x2pb5
2026-10-21T13:34:50.9649976Z =========================================================================
2026-10-21T13:34:50.9650118Z 
2026-10-21T13:34:50.9650280Z   JBoss Bootstrap Environment
2026-10-21T13:34:50.9650327Z 
2026-10-21T13:34:50.9650427Z   JBOSS_HOME: /opt/jboss
2026-10-21T13:34:50.9650477Z 
2026-10-21T13:34:50.9650906Z   JAVA: /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.372.b07-1.el7_9.x86_64/jre/bin/java
2026-10-21T13:34:50.9650988Z 
2026-10-21T13:34:50.9652658Z   JAVA_OPTS:  -verbose:gc -Xloggc:"/opt/jboss/standalone/log/gc.log" -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx1024m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration//opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sicow.jks -Djavax.net.ssl.trustStorePassword=changeit -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/jboss/standalone/deployments/applicationinsights-agent-3.7.1.jar -Djava.net.useSystemProxies=false -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=localhost\|127.0.0.1\|*.caixa 
2026-10-21T13:34:50.9653878Z 
2026-10-21T13:34:50.9654007Z =========================================================================
2026-10-21T13:34:50.9654075Z 
2026-10-21T13:34:50.9654394Z OpenJDK 64-Bit Server VM warning: If the number of processors is expected to increase from one, then you should configure the number of parallel GC threads appropriately using -XX:ParallelGCThreads=N
2026-10-21T13:34:50.9655013Z 2026-10-21 10:33:57.052-03:00 WARN  i.o.s.a.ResourceConfiguration - Found reference to io.opentelemetry.sdk.autoconfigure.internal.EnvironmentResourceProvider in otel.java.enabled.resource.providers. Please update to io.opentelemetry.sdk.autoconfigure.EnvironmentResourceProvider. Support for the old provider name will be removed after 1.49.0.
2026-10-21T13:34:50.9655646Z 2026-10-21 10:34:14.855-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.7.1 started successfully (PID 171, JVM running for 32.289 s)
2026-10-21T13:34:50.9656015Z 2026-10-21 10:34:14.857-03:00 INFO  c.m.applicationinsights.agent - Java version: 1.8.0_372, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.372.b07-1.el7_9.x86_64/jre
2026-10-21T13:34:50.9656312Z [0m10:34:16,237 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.0.Final-redhat-00001
2026-10-21T13:34:50.9656555Z [0m[0m10:34:17,545 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.12.Final-redhat-00001
2026-10-21T13:34:50.9656799Z [0m[0m10:34:17,664 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
2026-10-21T13:34:50.9657097Z [0m[0m10:34:18,258 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) starting
2026-10-21T13:34:50.9657443Z [0m[0m10:34:18,549 INFO  [org.jboss.vfs] (MSC service thread 1-2) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
2026-10-21T13:34:50.9657774Z [0m[0m10:34:21,860 INFO  [org.wildfly.security] (ServerService Thread Pool -- 30) ELY00001: WildFly Elytron version 1.15.16.Final-redhat-00001
2026-10-21T13:34:50.9658016Z [0m[31m10:34:23,051 ERROR [org.jboss.as.controller] (Controller Boot Thread) 
2026-10-21T13:34:50.9658094Z 
2026-10-21T13:34:50.9658274Z OPVDX001: Validation error in standalone-okd.xml -------------------------------
2026-10-21T13:34:50.9658395Z |
2026-10-21T13:34:50.9658492Z |  461:         </subsystem>
2026-10-21T13:34:50.9658586Z |  462: 
2026-10-21T13:34:50.9658785Z |  463:         <subsystem xmlns="urn:jboss:domain:messaging-activemq:13.0">
2026-10-21T13:34:50.9658925Z |               ^^^^ Unexpected element
2026-10-21T13:34:50.9659114Z |                      '{urn:jboss:domain:messaging-activemq:13.0}subsystem'
2026-10-21T13:34:50.9659238Z |
2026-10-21T13:34:50.9659407Z |  464:             <server name="default" persistence-enabled="false">
2026-10-21T13:34:50.9659673Z |  465:                 <security enabled="false"/>
2026-10-21T13:34:50.9659857Z |  466:                 <journal file-size="102400"/>
2026-10-21T13:34:50.9659958Z |
2026-10-21T13:34:50.9660057Z | The primary underlying error message was:
2026-10-21T13:34:50.9660183Z | > ParseError at [row,col]:[463,9]
2026-10-21T13:34:50.9660297Z | > Message: Unexpected element
2026-10-21T13:34:50.9660480Z | >   '{urn:jboss:domain:messaging-activemq:13.0}subsystem'
2026-10-21T13:34:50.9660597Z |
2026-10-21T13:34:50.9660780Z |-------------------------------------------------------------------------------
2026-10-21T13:34:50.9660851Z 
2026-10-21T13:34:50.9661173Z [0m[31m10:34:23,053 ERROR [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0055: Caught exception during boot: org.jboss.as.controller.persistence.ConfigurationPersistenceException: WFLYCTL0085: Failed to parse configuration
2026-10-21T13:34:50.9661490Z 	at org.jboss.as.controller.persistence.XmlConfigurationPersister.load(XmlConfigurationPersister.java:143)
2026-10-21T13:34:50.9661685Z 	at org.jboss.as.server.ServerService.boot(ServerService.java:408)
2026-10-21T13:34:50.9661863Z 	at org.jboss.as.controller.AbstractControllerService$1.run(AbstractControllerService.java:447)
2026-10-21T13:34:50.9662032Z 	at java.lang.Thread.run(Thread.java:750)
2026-10-21T13:34:50.9662097Z 
2026-10-21T13:34:50.9662365Z [0m[31m10:34:23,056 FATAL [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0056: Server boot has failed in an unrecoverable manner; exiting. See previous messages for details.
2026-10-21T13:34:50.9662709Z [0m[0m10:34:23,240 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0050: JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) stopped in 169ms
2026-10-21T13:34:50.9690398Z ##[debug]Exit code 0 received from tool '/usr/bin/bash'
2026-10-21T13:34:50.9693416Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-10-21T13:34:50.9698472Z ##[debug]task result: Succeeded
2026-10-21T13:34:50.9700865Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-10-21T13:34:50.9734699Z ##[section]Finishing: Logs da Aplicação






