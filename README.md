2026-07-09T18:40:45.1435944Z ##[debug]Evaluating condition for step: 'Logs da Aplicação'
2026-07-09T18:40:45.1436867Z ##[debug]Evaluating: always()
2026-07-09T18:40:45.1437145Z ##[debug]Evaluating always:
2026-07-09T18:40:45.1441654Z ##[debug]=> True
2026-07-09T18:40:45.1441992Z ##[debug]Result: True
2026-07-09T18:40:45.1442220Z ##[section]Starting: Logs da Aplicação
2026-07-09T18:40:45.1446087Z ==============================================================================
2026-07-09T18:40:45.1446221Z Task         : Bash
2026-07-09T18:40:45.1446268Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-09T18:40:45.1446330Z Version      : 3.227.0
2026-07-09T18:40:45.1446409Z Author       : Microsoft Corporation
2026-07-09T18:40:45.1446462Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-09T18:40:45.1446536Z ==============================================================================
2026-07-09T18:40:45.5607412Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-07-09T18:40:45.6288203Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-07-09T18:40:45.6296107Z ##[debug]loading inputs and endpoints
2026-07-09T18:40:45.6303527Z ##[debug]loading INPUT_TARGETTYPE
2026-07-09T18:40:45.6310828Z ##[debug]loading INPUT_FILEPATH
2026-07-09T18:40:45.6311917Z ##[debug]loading INPUT_SCRIPT
2026-07-09T18:40:45.6312620Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-07-09T18:40:45.6313250Z ##[debug]loading INPUT_FAILONSTDERR
2026-07-09T18:40:45.6314111Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-07-09T18:40:45.6314713Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-07-09T18:40:45.6316652Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-07-09T18:40:45.6322708Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-07-09T18:40:45.6323324Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-07-09T18:40:45.6325016Z ##[debug]loading SECRET_PW_ISILON
2026-07-09T18:40:45.6326954Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-07-09T18:40:45.6328449Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-07-09T18:40:45.6329675Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-07-09T18:40:45.6330258Z ##[debug]loading SECRET_PASSWORD_CGC
2026-07-09T18:40:45.6330887Z ##[debug]loading SECRET_FORTIFY_PASS
2026-07-09T18:40:45.6331491Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-07-09T18:40:45.6332104Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-07-09T18:40:45.6332638Z ##[debug]loading SECRET_PW_ALOCAIP
2026-07-09T18:40:45.6333163Z ##[debug]loading SECRET_TOKEN_CRQ
2026-07-09T18:40:45.6334693Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-07-09T18:40:45.6335188Z ##[debug]loading SECRET_AZPAT
2026-07-09T18:40:45.6335761Z ##[debug]loaded 22
2026-07-09T18:40:45.6340545Z ##[debug]Agent.ProxyUrl=undefined
2026-07-09T18:40:45.6341226Z ##[debug]Agent.CAInfo=undefined
2026-07-09T18:40:45.6341506Z ##[debug]Agent.ClientCert=undefined
2026-07-09T18:40:45.6341744Z ##[debug]Agent.SkipCertValidation=True
2026-07-09T18:40:45.6355640Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-07-09T18:40:45.6357523Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-07-09T18:40:45.6357807Z ##[debug]system.culture=en-US
2026-07-09T18:40:45.6365596Z ##[debug]failOnStderr=false
2026-07-09T18:40:45.6367050Z ##[debug]workingDirectory=/opt/ads-agent/_work/r172/a
2026-07-09T18:40:45.6367318Z ##[debug]check path : /opt/ads-agent/_work/r172/a
2026-07-09T18:40:45.6367739Z ##[debug]targetType=inline
2026-07-09T18:40:45.6367966Z ##[debug]bashEnvValue=undefined
2026-07-09T18:40:45.6368816Z ##[debug]script=#!/bin/bash
set -o errexit
set -o pipefail
set -x

shopt -s expand_aliases

if [[ -n "$SITE" && "okd4_nprd" =~ "ocp" ]]
then
  app="siabm-autenticacao-api-sandbox-des"

  arquivo="/usr/local/bin/oc-v4.13"
  if [ -e "$arquivo" ]; then 
    alias oc="$arquivo"
  fi
 
elif [[ -n "$SITE" && "okd4_nprd" =~ "okd4" ]]
then
app="siabm-autenticacao-api-sandbox-des"
else
  app="siabm-autenticacao-api-sandbox-des-esteiras"
fi

oc version

last_pod=$(oc get pod -l name="$app" -n siabm-des -o jsonpath='{range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp  | tac | grep -v '^$' | head -n1)

echo "Logs do POD: $last_pod"
oc logs $last_pod -c "$app" -n siabm-des
2026-07-09T18:40:45.6376884Z Generating script.
2026-07-09T18:40:45.6379229Z ##[debug]which 'bash'
2026-07-09T18:40:45.6384220Z ##[debug]found: '/usr/bin/bash'
2026-07-09T18:40:45.6384575Z ##[debug]Agent.Version=3.236.1
2026-07-09T18:40:45.6384839Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-07-09T18:40:45.6385100Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-07-09T18:40:45.6387542Z ========================== Starting Command Output ===========================
2026-07-09T18:40:45.6388624Z ##[debug]which '/usr/bin/bash'
2026-07-09T18:40:45.6389432Z ##[debug]found: '/usr/bin/bash'
2026-07-09T18:40:45.6390028Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/981061dd-c833-498d-9153-dfe6976862a4.sh
2026-07-09T18:40:45.6392219Z ##[debug]exec tool: /usr/bin/bash
2026-07-09T18:40:45.6392450Z ##[debug]arguments:
2026-07-09T18:40:45.6392698Z ##[debug]   /opt/ads-agent/_work/_temp/981061dd-c833-498d-9153-dfe6976862a4.sh
2026-07-09T18:40:45.6394553Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/981061dd-c833-498d-9153-dfe6976862a4.sh
2026-07-09T18:40:45.6462601Z + shopt -s expand_aliases
2026-07-09T18:40:45.6462795Z + [[ -n okd4_nprd ]]
2026-07-09T18:40:45.6462899Z + [[ okd4_nprd =~ ocp ]]
2026-07-09T18:40:45.6463038Z + [[ -n okd4_nprd ]]
2026-07-09T18:40:45.6463147Z + [[ okd4_nprd =~ okd4 ]]
2026-07-09T18:40:45.6463317Z + app=siabm-autenticacao-api-sandbox-des
2026-07-09T18:40:45.6463439Z + oc version
2026-07-09T18:40:45.7085559Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-07-09T18:40:45.7085825Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-07-09T18:40:45.7086024Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-07-09T18:40:45.7135564Z ++ oc get pod -l name=siabm-autenticacao-api-sandbox-des -n siabm-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-07-09T18:40:45.7135994Z ++ tac
2026-07-09T18:40:45.7136203Z ++ grep -v '^$'
2026-07-09T18:40:45.7136357Z ++ head -n1
2026-07-09T18:40:45.7998232Z + last_pod=siabm-autenticacao-api-sandbox-des-13-rg72f
2026-07-09T18:40:45.7998554Z + echo 'Logs do POD: siabm-autenticacao-api-sandbox-des-13-rg72f'
2026-07-09T18:40:45.7998814Z + oc logs siabm-autenticacao-api-sandbox-des-13-rg72f -c siabm-autenticacao-api-sandbox-des -n siabm-des
2026-07-09T18:40:45.7999045Z Logs do POD: siabm-autenticacao-api-sandbox-des-13-rg72f
2026-07-09T18:40:45.8746666Z Criando diretorio '/opt/jboss/standalone/configuration/.secrets'...
2026-07-09T18:40:45.8747037Z Configuracao do vault realizada
2026-07-09T18:40:45.8747286Z Arquivo secrets.properties encontrado, carregando propriedades...
2026-07-09T18:40:45.8747573Z /opt/jboss/bin/standalone.conf: line 37: =org.jboss.byteman: command not found
2026-07-09T18:40:45.8747879Z =========================================================================
2026-07-09T18:40:45.8748018Z 
2026-07-09T18:40:45.8748206Z   JBoss Bootstrap Environment
2026-07-09T18:40:45.8748292Z 
2026-07-09T18:40:45.8748469Z   JBOSS_HOME: /opt/jboss
2026-07-09T18:40:45.8748549Z 
2026-07-09T18:40:45.8748736Z   JAVA: /usr/java/latest/bin/java
2026-07-09T18:40:45.8748842Z 
2026-07-09T18:40:45.8751840Z   JAVA_OPTS:  -verbose:gc -Xloggc:"/opt/jboss/standalone/log/gc.log" -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms96m -Xmx900m -XX:MetaspaceSize=256M -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs= -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=siabm-autenticacao-api -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=siabm-autenticacao-api-des -Djava.security.provider.6=br.com.trueaccess.provider.netdfence.ND -Djava.net.useSystemProxies=false 
2026-07-09T18:40:45.8753940Z 
2026-07-09T18:40:45.8754176Z =========================================================================
2026-07-09T18:40:45.8754302Z 
2026-07-09T18:40:45.8754792Z 2026-07-09 15:37:53.385 [main] INFO co.elastic.apm.agent.util.JmxUtils - Found JVM-specific OperatingSystemMXBean interface: com.sun.management.OperatingSystemMXBean
2026-07-09T18:40:45.8755492Z 2026-07-09 15:37:53.463 [main] INFO co.elastic.apm.agent.configuration.StartupInfo - Starting Elastic APM 1.15.0 as siabm-autenticacao-api on Java 1.8.0_301 (Oracle Corporation) Linux 6.1.18-200.fc37.x86_64
2026-07-09T18:40:45.8756163Z 2026-07-09 15:37:53.468 [main] INFO co.elastic.apm.agent.impl.ElasticApmTracer - Tracer switched to RUNNING state
2026-07-09T18:40:45.8756646Z [0m15:37:55,623 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.0.Final-redhat-00001
2026-07-09T18:40:45.8757099Z [0m[0m15:37:56,332 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.12.Final-redhat-00001
2026-07-09T18:40:45.8757528Z [0m[0m15:37:56,705 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
2026-07-09T18:40:45.8758066Z [0m[0m15:37:57,017 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) starting
2026-07-09T18:40:45.8758699Z [0m[0m15:37:57,207 INFO  [org.jboss.vfs] (MSC service thread 1-3) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
2026-07-09T18:40:45.8759539Z [0m[0m15:37:58,607 INFO  [stdout] (elastic-apm-server-healthcheck) 2026-07-09 15:37:58.607 [elastic-apm-server-healthcheck] WARN co.elastic.apm.agent.report.ApmServerHealthChecker - Elastic APM server http://apm-server-devops.produtos.caixa/ is not available (connect timed out)
2026-07-09T18:40:45.8760239Z [0m[0m15:38:00,107 INFO  [org.wildfly.security] (ServerService Thread Pool -- 30) ELY00001: WildFly Elytron version 1.15.16.Final-redhat-00001
2026-07-09T18:40:45.8760859Z [0m[0m15:38:00,905 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 20) WFLYCTL0033: Extension 'security' is deprecated and may not be supported in future versions
2026-07-09T18:40:45.8761930Z [0m[0m15:38:02,428 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
2026-07-09T18:40:45.8763138Z [0m[0m15:38:02,815 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 25) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
2026-07-09T18:40:45.8764458Z [0m[0m15:38:02,821 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 37) WFLYCTL0028: Attribute 'location' in the resource at address '/subsystem=elytron/credential-store=DSKeystore' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
2026-07-09T18:40:45.8765387Z [0m[0m15:38:03,614 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-07-09 15:38:03.614 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - connect timed out
2026-07-09T18:40:45.8766136Z [0m[0m15:38:03,741 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 11) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/b5/eb9637f2b0a07d72376b56109600e0055fa792/content
2026-07-09T18:40:45.8766767Z [0m[0m15:38:03,760 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
2026-07-09T18:40:45.8767264Z [0m[0m15:38:03,771 INFO  [org.xnio] (MSC service thread 1-5) XNIO version 3.8.9.Final-redhat-00001
2026-07-09T18:40:45.8767741Z [0m[0m15:38:03,804 INFO  [org.xnio.nio] (MSC service thread 1-5) XNIO NIO Implementation Version 3.8.9.Final-redhat-00001
2026-07-09T18:40:45.8768350Z [0m[0m15:38:04,116 INFO  [org.jboss.as.clustering.jgroups] (ServerService Thread Pool -- 59) WFLYCLJG0001: Activating JGroups subsystem. JGroups version 4.2.11
2026-07-09T18:40:45.8768914Z [0m[0m15:38:04,117 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 54) WFLYCLINF0001: Activating Infinispan subsystem.
2026-07-09T18:40:45.8769693Z [0m[33m15:38:04,112 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 74) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
2026-07-09T18:40:45.8770477Z [0m[0m15:38:04,204 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 55) WFLYIO001: Worker 'default' has auto-configured to 64 IO threads with 512 max task threads based on your 32 available processors
2026-07-09T18:40:45.8771112Z [0m[0m15:38:04,205 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 66) WFLYNAM0001: Activating Naming Subsystem
2026-07-09T18:40:45.8771629Z [0m[0m15:38:04,206 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 72) WFLYSEC0002: Activating Security Subsystem
2026-07-09T18:40:45.8772164Z [0m[0m15:38:04,209 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 52) WFLYHEALTH0001: Activating Base Health Subsystem
2026-07-09T18:40:45.8772714Z [0m[0m15:38:04,215 INFO  [org.jboss.as.security] (MSC service thread 1-2) WFLYSEC0001: Current PicketBox version=5.0.3.Final-redhat-00009
2026-07-09T18:40:45.8773256Z [0m[0m15:38:04,217 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 56) WFLYRS0016: RESTEasy version 3.15.7.Final-redhat-00001
2026-07-09T18:40:45.8773787Z [0m[0m15:38:04,309 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 76) WFLYWS0002: Activating WebServices Extension
2026-07-09T18:40:45.8774379Z [0m[0m15:38:04,310 INFO  [org.wildfly.iiop.openjdk] (ServerService Thread Pool -- 53) WFLYIIOP0001: Activating IIOP Subsystem
2026-07-09T18:40:45.8774918Z [0m[0m15:38:04,313 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 65) WFLYMETRICS0001: Activating Base Metrics Subsystem
2026-07-09T18:40:45.8775497Z [0m[0m15:38:04,409 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 62) WFLYJSF0007: Activated the following Jakarta Server Faces Implementations: [main]
2026-07-09T18:40:45.8776050Z [0m[0m15:38:04,413 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-8) WFLYUT0003: Undertow 2.2.24.SP1-redhat-00001 starting
2026-07-09T18:40:45.8776541Z [0m[0m15:38:04,512 INFO  [org.jboss.as.naming] (MSC service thread 1-6) WFLYNAM0003: Starting Naming Service
2026-07-09T18:40:45.8777179Z [0m[0m15:38:04,517 INFO  [org.jboss.as.connector] (MSC service thread 1-6) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 1.5.11.Final-redhat-00001)
2026-07-09T18:40:45.8777767Z [0m[0m15:38:04,518 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-5) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
2026-07-09T18:40:45.8778296Z [0m[0m15:38:05,128 INFO  [org.jboss.remoting] (MSC service thread 1-7) JBoss Remoting version 5.0.27.Final-redhat-00001
2026-07-09T18:40:45.8779046Z [0m[0m15:38:05,324 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 44) WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.OracleDriver (version 11.1)
2026-07-09T18:40:45.8779658Z [0m[0m15:38:05,519 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0018: Started Driver service with driver-name = oracle
2026-07-09T18:40:45.8780434Z [0m[0m15:38:05,628 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 75) WFLYUT0014: Creating file handler for path '/opt/jboss/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
2026-07-09T18:40:45.8781180Z [0m[33m15:38:06,004 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-3) WFLYELY00023: KeyStore file '/opt/jboss/standalone/configuration/application.keystore' does not exist. Used blank.
2026-07-09T18:40:45.8781809Z [0m[0m15:38:06,013 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-8) WFLYUT0012: Started server default-server.
2026-07-09T18:40:45.8782450Z [0m[0m15:38:06,115 INFO  [org.jboss.as.ejb3] (MSC service thread 1-7) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 512 (per class), which is derived from thread worker pool sizing.
2026-07-09T18:40:45.8783239Z [0m[33m15:38:06,115 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-7) WFLYELY01084: KeyStore /opt/jboss/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self-signed certificate for host localhost
2026-07-09T18:40:45.8784060Z [0m[0m15:38:06,119 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 128 (per class), which is derived from the number of CPUs on this host.
2026-07-09T18:40:45.8784623Z [0m[0m15:38:06,120 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) Queuing requests.
2026-07-09T18:40:45.8785112Z [0m[0m15:38:06,120 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0018: Host default-host starting
2026-07-09T18:40:45.8785670Z [0m[0m15:38:06,423 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: Undertow AJP listener ajp listening on 0.0.0.0:8009
2026-07-09T18:40:45.8786270Z [0m[0m15:38:06,512 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-7) WFLYUT0006: Undertow HTTP listener default listening on 0.0.0.0:8080
2026-07-09T18:40:45.8786873Z [0m[0m15:38:06,804 INFO  [org.jboss.as.patching] (MSC service thread 1-3) WFLYPAT0050: JBoss EAP cumulative patch ID is: base, one-off patches include: none
2026-07-09T18:40:45.8787624Z [0m[33m15:38:07,006 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-2) WFLYDM0111: Keystore /opt/jboss/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self signed certificate for host localhost
2026-07-09T18:40:45.8788267Z [0m[0m15:38:07,010 INFO  [org.jboss.as.ejb3] (MSC service thread 1-7) WFLYEJB0493: Jakarta Enterprise Beans subsystem suspension complete
2026-07-09T18:40:45.8788883Z [0m[0m15:38:07,105 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-3) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/jboss/standalone/deployments
2026-07-09T18:40:45.8789550Z [0m[0m15:38:07,407 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0027: Starting deployment of "siabm-autenticacao-api.war" (runtime-name: "siabm-autenticacao-api.war")
2026-07-09T18:40:45.8790228Z [0m[0m15:38:07,410 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) WFLYUT0006: Undertow HTTPS listener https listening on 0.0.0.0:8443
2026-07-09T18:40:45.8790745Z [0m[0m15:38:07,515 INFO  [org.wildfly.iiop.openjdk] (MSC service thread 1-6) WFLYIIOP0009: CORBA ORB Service started
2026-07-09T18:40:45.8791312Z [0m[0m15:38:07,811 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0001: Bound data source [java:jboss/jdbc/SIABM04]
2026-07-09T18:40:45.8791937Z [0m[0m15:38:08,008 INFO  [org.jboss.ws.common.management] (MSC service thread 1-5) JBWS022052: Starting JBossWS 5.4.8.Final-redhat-00001 (Apache CXF 3.4.10.redhat-00001) 
2026-07-09T18:40:45.8792760Z [0m[33m15:38:17,631 WARN  [org.jboss.weld.deployer] (MSC service thread 1-3) WFLYWELD0012: Warning while parsing vfs:/content/siabm-autenticacao-api.war/WEB-INF/classes/META-INF/beans.xml:4 cvc-complex-type.3.2.2: Attribute 'bean-discovery-mode' is not allowed to appear in element 'beans'.
2026-07-09T18:40:45.8793661Z [0m[33m15:38:17,632 WARN  [org.jboss.weld.deployer] (MSC service thread 1-3) WFLYWELD0012: Warning while parsing vfs:/content/siabm-autenticacao-api.war/WEB-INF/classes/META-INF/beans.xml:4 cvc-complex-type.3.2.2: Attribute 'version' is not allowed to appear in element 'beans'.
2026-07-09T18:40:45.8794419Z [0m[0m15:38:17,708 INFO  [org.jboss.as.jpa] (MSC service thread 1-3) WFLYJPA0002: Read persistence.xml for SIABM04_DESENV
2026-07-09T18:40:45.8794978Z [0m[0m15:38:18,119 INFO  [org.jipijapa] (MSC service thread 1-4) JIPIORMV53020253: Second level cache enabled for siabm-autenticacao-api.war#SIABM04_DESENV
2026-07-09T18:40:45.8795643Z [0m[33m15:38:18,906 WARN  [org.jgroups.protocols.UDP] (ServerService Thread Pool -- 79) JGRP000015: the send buffer of socket ManagedMulticastSocketBinding was set to 1.00MB, but the OS only allocated 212.99KB
2026-07-09T18:40:45.8796363Z [0m[33m15:38:18,907 WARN  [org.jgroups.protocols.UDP] (ServerService Thread Pool -- 79) JGRP000015: the receive buffer of socket ManagedMulticastSocketBinding was set to 20.00MB, but the OS only allocated 212.99KB
2026-07-09T18:40:45.8797059Z [0m[33m15:38:18,907 WARN  [org.jgroups.protocols.UDP] (ServerService Thread Pool -- 79) JGRP000015: the send buffer of socket ManagedMulticastSocketBinding was set to 1.00MB, but the OS only allocated 212.99KB
2026-07-09T18:40:45.8797786Z [0m[33m15:38:18,907 WARN  [org.jgroups.protocols.UDP] (ServerService Thread Pool -- 79) JGRP000015: the receive buffer of socket ManagedMulticastSocketBinding was set to 25.00MB, but the OS only allocated 212.99KB
2026-07-09T18:40:45.8798386Z [0m[0m15:38:19,032 INFO  [org.jboss.weld.deployer] (MSC service thread 1-2) WFLYWELD0003: Processing weld deployment siabm-autenticacao-api.war
2026-07-09T18:40:45.8798963Z [0m[0m15:38:19,317 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-2) HV000001: Hibernate Validator 6.0.23.Final-redhat-00001
2026-07-09T18:40:45.8799675Z [0m[0m15:38:19,509 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'SituacaoCpfServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8799940Z 
2026-07-09T18:40:45.8800343Z 	java:global/siabm-autenticacao-api/SituacaoCpfServiceImpl!br.gov.caixa.autenticacao.mtx.services.SituacaoCpfService
2026-07-09T18:40:45.8800921Z 	java:app/siabm-autenticacao-api/SituacaoCpfServiceImpl!br.gov.caixa.autenticacao.mtx.services.SituacaoCpfService
2026-07-09T18:40:45.8801288Z 	java:module/SituacaoCpfServiceImpl!br.gov.caixa.autenticacao.mtx.services.SituacaoCpfService
2026-07-09T18:40:45.8801682Z 	java:global/siabm-autenticacao-api/SituacaoCpfServiceImpl
2026-07-09T18:40:45.8802040Z 	java:app/siabm-autenticacao-api/SituacaoCpfServiceImpl
2026-07-09T18:40:45.8802290Z 	java:module/SituacaoCpfServiceImpl
2026-07-09T18:40:45.8802387Z 
2026-07-09T18:40:45.8803002Z [0m[0m15:38:19,510 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TokenHelper' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8803248Z 
2026-07-09T18:40:45.8803610Z 	java:global/siabm-autenticacao-api/TokenHelper!br.gov.caixa.autenticacao.mtx.helpers.TokenHelper
2026-07-09T18:40:45.8804136Z 	java:app/siabm-autenticacao-api/TokenHelper!br.gov.caixa.autenticacao.mtx.helpers.TokenHelper
2026-07-09T18:40:45.8804474Z 	java:module/TokenHelper!br.gov.caixa.autenticacao.mtx.helpers.TokenHelper
2026-07-09T18:40:45.8804830Z 	java:global/siabm-autenticacao-api/TokenHelper
2026-07-09T18:40:45.8805156Z 	java:app/siabm-autenticacao-api/TokenHelper
2026-07-09T18:40:45.8805386Z 	java:module/TokenHelper
2026-07-09T18:40:45.8805475Z 
2026-07-09T18:40:45.8806023Z [0m[0m15:38:19,510 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'SIICOClient' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8806277Z 
2026-07-09T18:40:45.8806632Z 	java:global/siabm-autenticacao-api/SIICOClient!br.gov.caixa.autenticacao.siico.client.SIICOClient
2026-07-09T18:40:45.8807085Z 	java:app/siabm-autenticacao-api/SIICOClient!br.gov.caixa.autenticacao.siico.client.SIICOClient
2026-07-09T18:40:45.8807443Z 	java:module/SIICOClient!br.gov.caixa.autenticacao.siico.client.SIICOClient
2026-07-09T18:40:45.8807845Z 	java:global/siabm-autenticacao-api/SIICOClient
2026-07-09T18:40:45.8808167Z 	java:app/siabm-autenticacao-api/SIICOClient
2026-07-09T18:40:45.8808390Z 	java:module/SIICOClient
2026-07-09T18:40:45.8808476Z 
2026-07-09T18:40:45.8809199Z [0m[0m15:38:19,511 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TokenManagerSSO' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8809457Z 
2026-07-09T18:40:45.8809818Z 	java:global/siabm-autenticacao-api/TokenManagerSSO!br.gov.caixa.common.token.TokenManagerSSO
2026-07-09T18:40:45.8810265Z 	java:app/siabm-autenticacao-api/TokenManagerSSO!br.gov.caixa.common.token.TokenManagerSSO
2026-07-09T18:40:45.8810578Z 	java:module/TokenManagerSSO!br.gov.caixa.common.token.TokenManagerSSO
2026-07-09T18:40:45.8810926Z 	java:global/siabm-autenticacao-api/TokenManagerSSO
2026-07-09T18:40:45.8811260Z 	java:app/siabm-autenticacao-api/TokenManagerSSO
2026-07-09T18:40:45.8811496Z 	java:module/TokenManagerSSO
2026-07-09T18:40:45.8811596Z 
2026-07-09T18:40:45.8812178Z [0m[0m15:38:19,511 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PessoaBiometriaDedoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8812434Z 
2026-07-09T18:40:45.8812855Z 	java:global/siabm-autenticacao-api/PessoaBiometriaDedoServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaBiometriaDedoService
2026-07-09T18:40:45.8813391Z 	java:app/siabm-autenticacao-api/PessoaBiometriaDedoServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaBiometriaDedoService
2026-07-09T18:40:45.8813775Z 	java:module/PessoaBiometriaDedoServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaBiometriaDedoService
2026-07-09T18:40:45.8814272Z 	java:global/siabm-autenticacao-api/PessoaBiometriaDedoServiceImpl
2026-07-09T18:40:45.8814648Z 	java:app/siabm-autenticacao-api/PessoaBiometriaDedoServiceImpl
2026-07-09T18:40:45.8814911Z 	java:module/PessoaBiometriaDedoServiceImpl
2026-07-09T18:40:45.8815010Z 
2026-07-09T18:40:45.8815579Z [0m[0m15:38:19,511 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'CanalOrigemServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8815838Z 
2026-07-09T18:40:45.8816231Z 	java:global/siabm-autenticacao-api/CanalOrigemServiceImpl!br.gov.caixa.autenticacao.mtx.services.CanalOrigemService
2026-07-09T18:40:45.8816794Z 	java:app/siabm-autenticacao-api/CanalOrigemServiceImpl!br.gov.caixa.autenticacao.mtx.services.CanalOrigemService
2026-07-09T18:40:45.8817142Z 	java:module/CanalOrigemServiceImpl!br.gov.caixa.autenticacao.mtx.services.CanalOrigemService
2026-07-09T18:40:45.8817518Z 	java:global/siabm-autenticacao-api/CanalOrigemServiceImpl
2026-07-09T18:40:45.8817872Z 	java:app/siabm-autenticacao-api/CanalOrigemServiceImpl
2026-07-09T18:40:45.8818119Z 	java:module/CanalOrigemServiceImpl
2026-07-09T18:40:45.8818216Z 
2026-07-09T18:40:45.8818781Z [0m[0m15:38:19,511 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'AutenticacaoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8819043Z 
2026-07-09T18:40:45.8819433Z 	java:global/siabm-autenticacao-api/AutenticacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoService
2026-07-09T18:40:45.8819933Z 	java:app/siabm-autenticacao-api/AutenticacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoService
2026-07-09T18:40:45.8820284Z 	java:module/AutenticacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoService
2026-07-09T18:40:45.8820654Z 	java:global/siabm-autenticacao-api/AutenticacaoServiceImpl
2026-07-09T18:40:45.8821056Z 	java:app/siabm-autenticacao-api/AutenticacaoServiceImpl
2026-07-09T18:40:45.8821311Z 	java:module/AutenticacaoServiceImpl
2026-07-09T18:40:45.8821408Z 
2026-07-09T18:40:45.8821989Z [0m[0m15:38:19,511 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ConsultaAutenticacaoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8822262Z 
2026-07-09T18:40:45.8822689Z 	java:global/siabm-autenticacao-api/ConsultaAutenticacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ConsultaAutenticacaoService
2026-07-09T18:40:45.8823235Z 	java:app/siabm-autenticacao-api/ConsultaAutenticacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ConsultaAutenticacaoService
2026-07-09T18:40:45.8823619Z 	java:module/ConsultaAutenticacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ConsultaAutenticacaoService
2026-07-09T18:40:45.8824112Z 	java:global/siabm-autenticacao-api/ConsultaAutenticacaoServiceImpl
2026-07-09T18:40:45.8824483Z 	java:app/siabm-autenticacao-api/ConsultaAutenticacaoServiceImpl
2026-07-09T18:40:45.8824751Z 	java:module/ConsultaAutenticacaoServiceImpl
2026-07-09T18:40:45.8824861Z 
2026-07-09T18:40:45.8825439Z [0m[0m15:38:19,511 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PessoaBiometriaServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8825694Z 
2026-07-09T18:40:45.8826096Z 	java:global/siabm-autenticacao-api/PessoaBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaBiometriaService
2026-07-09T18:40:45.8826617Z 	java:app/siabm-autenticacao-api/PessoaBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaBiometriaService
2026-07-09T18:40:45.8826986Z 	java:module/PessoaBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaBiometriaService
2026-07-09T18:40:45.8827381Z 	java:global/siabm-autenticacao-api/PessoaBiometriaServiceImpl
2026-07-09T18:40:45.8827743Z 	java:app/siabm-autenticacao-api/PessoaBiometriaServiceImpl
2026-07-09T18:40:45.8827998Z 	java:module/PessoaBiometriaServiceImpl
2026-07-09T18:40:45.8828096Z 
2026-07-09T18:40:45.8828680Z [0m[0m15:38:19,511 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'RegistroTransacaoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8828941Z 
2026-07-09T18:40:45.8829356Z 	java:global/siabm-autenticacao-api/RegistroTransacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.RegistroTransacaoService
2026-07-09T18:40:45.8829944Z 	java:app/siabm-autenticacao-api/RegistroTransacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.RegistroTransacaoService
2026-07-09T18:40:45.8830334Z 	java:module/RegistroTransacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.RegistroTransacaoService
2026-07-09T18:40:45.8830809Z 	java:global/siabm-autenticacao-api/RegistroTransacaoServiceImpl
2026-07-09T18:40:45.8831184Z 	java:app/siabm-autenticacao-api/RegistroTransacaoServiceImpl
2026-07-09T18:40:45.8831439Z 	java:module/RegistroTransacaoServiceImpl
2026-07-09T18:40:45.8831540Z 
2026-07-09T18:40:45.8832110Z [0m[0m15:38:19,511 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'AutenticacaoFacialNuvemImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8832377Z 
2026-07-09T18:40:45.8832799Z 	java:global/siabm-autenticacao-api/AutenticacaoFacialNuvemImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoFacialNuvemService
2026-07-09T18:40:45.8833339Z 	java:app/siabm-autenticacao-api/AutenticacaoFacialNuvemImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoFacialNuvemService
2026-07-09T18:40:45.8833724Z 	java:module/AutenticacaoFacialNuvemImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoFacialNuvemService
2026-07-09T18:40:45.8834209Z 	java:global/siabm-autenticacao-api/AutenticacaoFacialNuvemImpl
2026-07-09T18:40:45.8834655Z 	java:app/siabm-autenticacao-api/AutenticacaoFacialNuvemImpl
2026-07-09T18:40:45.8834908Z 	java:module/AutenticacaoFacialNuvemImpl
2026-07-09T18:40:45.8835018Z 
2026-07-09T18:40:45.8835619Z [0m[0m15:38:19,512 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PreAutorizacaoAutenticacaoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8835881Z 
2026-07-09T18:40:45.8836347Z 	java:global/siabm-autenticacao-api/PreAutorizacaoAutenticacaoServiceImpl!br.gov.caixa.autenticacao.preautorizacao.services.PreAutorizacaoAutenticacaoService
2026-07-09T18:40:45.8836952Z 	java:app/siabm-autenticacao-api/PreAutorizacaoAutenticacaoServiceImpl!br.gov.caixa.autenticacao.preautorizacao.services.PreAutorizacaoAutenticacaoService
2026-07-09T18:40:45.8837381Z 	java:module/PreAutorizacaoAutenticacaoServiceImpl!br.gov.caixa.autenticacao.preautorizacao.services.PreAutorizacaoAutenticacaoService
2026-07-09T18:40:45.8837824Z 	java:global/siabm-autenticacao-api/PreAutorizacaoAutenticacaoServiceImpl
2026-07-09T18:40:45.8838219Z 	java:app/siabm-autenticacao-api/PreAutorizacaoAutenticacaoServiceImpl
2026-07-09T18:40:45.8838491Z 	java:module/PreAutorizacaoAutenticacaoServiceImpl
2026-07-09T18:40:45.8838599Z 
2026-07-09T18:40:45.8839145Z [0m[0m15:38:19,512 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'HsmServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8839390Z 
2026-07-09T18:40:45.8839754Z 	java:global/siabm-autenticacao-api/HsmServiceImpl!br.gov.caixa.autenticacao.mtx.services.HsmService
2026-07-09T18:40:45.8840214Z 	java:app/siabm-autenticacao-api/HsmServiceImpl!br.gov.caixa.autenticacao.mtx.services.HsmService
2026-07-09T18:40:45.8840537Z 	java:module/HsmServiceImpl!br.gov.caixa.autenticacao.mtx.services.HsmService
2026-07-09T18:40:45.8840896Z 	java:global/siabm-autenticacao-api/HsmServiceImpl
2026-07-09T18:40:45.8841227Z 	java:app/siabm-autenticacao-api/HsmServiceImpl
2026-07-09T18:40:45.8841461Z 	java:module/HsmServiceImpl
2026-07-09T18:40:45.8841550Z 
2026-07-09T18:40:45.8842112Z [0m[0m15:38:19,512 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'JcaCryptoService' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8842361Z 
2026-07-09T18:40:45.8842729Z 	java:global/siabm-autenticacao-api/JcaCryptoService!br.gov.caixa.autenticacao.mtx.services.CryptoService
2026-07-09T18:40:45.8845495Z 	java:app/siabm-autenticacao-api/JcaCryptoService!br.gov.caixa.autenticacao.mtx.services.CryptoService
2026-07-09T18:40:45.8845836Z 	java:module/JcaCryptoService!br.gov.caixa.autenticacao.mtx.services.CryptoService
2026-07-09T18:40:45.8846208Z 	java:global/siabm-autenticacao-api/JcaCryptoService
2026-07-09T18:40:45.8846546Z 	java:app/siabm-autenticacao-api/JcaCryptoService
2026-07-09T18:40:45.8846784Z 	java:module/JcaCryptoService
2026-07-09T18:40:45.8846877Z 
2026-07-09T18:40:45.8847437Z [0m[0m15:38:19,512 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'CanalOrdemDedoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8847689Z 
2026-07-09T18:40:45.8848097Z 	java:global/siabm-autenticacao-api/CanalOrdemDedoServiceImpl!br.gov.caixa.autenticacao.mtx.services.CanalOrdemDedoService
2026-07-09T18:40:45.8848611Z 	java:app/siabm-autenticacao-api/CanalOrdemDedoServiceImpl!br.gov.caixa.autenticacao.mtx.services.CanalOrdemDedoService
2026-07-09T18:40:45.8848978Z 	java:module/CanalOrdemDedoServiceImpl!br.gov.caixa.autenticacao.mtx.services.CanalOrdemDedoService
2026-07-09T18:40:45.8849373Z 	java:global/siabm-autenticacao-api/CanalOrdemDedoServiceImpl
2026-07-09T18:40:45.8849728Z 	java:app/siabm-autenticacao-api/CanalOrdemDedoServiceImpl
2026-07-09T18:40:45.8850065Z 	java:module/CanalOrdemDedoServiceImpl
2026-07-09T18:40:45.8850175Z 
2026-07-09T18:40:45.8850712Z [0m[0m15:38:19,512 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TimerTokenSSO' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8850960Z 
2026-07-09T18:40:45.8851312Z 	java:global/siabm-autenticacao-api/TimerTokenSSO!br.gov.caixa.common.token.TimerTokenSSO
2026-07-09T18:40:45.8851741Z 	java:app/siabm-autenticacao-api/TimerTokenSSO!br.gov.caixa.common.token.TimerTokenSSO
2026-07-09T18:40:45.8852044Z 	java:module/TimerTokenSSO!br.gov.caixa.common.token.TimerTokenSSO
2026-07-09T18:40:45.8852391Z 	java:global/siabm-autenticacao-api/TimerTokenSSO
2026-07-09T18:40:45.8852719Z 	java:app/siabm-autenticacao-api/TimerTokenSSO
2026-07-09T18:40:45.8852947Z 	java:module/TimerTokenSSO
2026-07-09T18:40:45.8853033Z 
2026-07-09T18:40:45.8853615Z [0m[0m15:38:19,512 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'HistoricoOrdemTemplateServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8854023Z 
2026-07-09T18:40:45.8854479Z 	java:global/siabm-autenticacao-api/HistoricoOrdemTemplateServiceImpl!br.gov.caixa.autenticacao.mtx.services.HistoricoOrdemTemplateService
2026-07-09T18:40:45.8855030Z 	java:app/siabm-autenticacao-api/HistoricoOrdemTemplateServiceImpl!br.gov.caixa.autenticacao.mtx.services.HistoricoOrdemTemplateService
2026-07-09T18:40:45.8855417Z 	java:module/HistoricoOrdemTemplateServiceImpl!br.gov.caixa.autenticacao.mtx.services.HistoricoOrdemTemplateService
2026-07-09T18:40:45.8855841Z 	java:global/siabm-autenticacao-api/HistoricoOrdemTemplateServiceImpl
2026-07-09T18:40:45.8856219Z 	java:app/siabm-autenticacao-api/HistoricoOrdemTemplateServiceImpl
2026-07-09T18:40:45.8856488Z 	java:module/HistoricoOrdemTemplateServiceImpl
2026-07-09T18:40:45.8856595Z 
2026-07-09T18:40:45.8857165Z [0m[0m15:38:19,512 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'InstituicaoExternaRepository' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8857428Z 
2026-07-09T18:40:45.8857848Z 	java:global/siabm-autenticacao-api/InstituicaoExternaRepository!br.gov.caixa.autenticacao.mtx.repositories.InstituicaoExternaRepository
2026-07-09T18:40:45.8859808Z 	java:app/siabm-autenticacao-api/InstituicaoExternaRepository!br.gov.caixa.autenticacao.mtx.repositories.InstituicaoExternaRepository
2026-07-09T18:40:45.8860218Z 	java:module/InstituicaoExternaRepository!br.gov.caixa.autenticacao.mtx.repositories.InstituicaoExternaRepository
2026-07-09T18:40:45.8860743Z 	java:global/siabm-autenticacao-api/InstituicaoExternaRepository
2026-07-09T18:40:45.8861107Z 	java:app/siabm-autenticacao-api/InstituicaoExternaRepository
2026-07-09T18:40:45.8861365Z 	java:module/InstituicaoExternaRepository
2026-07-09T18:40:45.8861729Z 
2026-07-09T18:40:45.8862318Z [0m[0m15:38:19,512 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'MensagemSistemaServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8862582Z 
2026-07-09T18:40:45.8862988Z 	java:global/siabm-autenticacao-api/MensagemSistemaServiceImpl!br.gov.caixa.autenticacao.mtx.services.MensagemSistemaService
2026-07-09T18:40:45.8864374Z 	java:app/siabm-autenticacao-api/MensagemSistemaServiceImpl!br.gov.caixa.autenticacao.mtx.services.MensagemSistemaService
2026-07-09T18:40:45.8864755Z 	java:module/MensagemSistemaServiceImpl!br.gov.caixa.autenticacao.mtx.services.MensagemSistemaService
2026-07-09T18:40:45.8865162Z 	java:global/siabm-autenticacao-api/MensagemSistemaServiceImpl
2026-07-09T18:40:45.8865522Z 	java:app/siabm-autenticacao-api/MensagemSistemaServiceImpl
2026-07-09T18:40:45.8865770Z 	java:module/MensagemSistemaServiceImpl
2026-07-09T18:40:45.8865950Z 
2026-07-09T18:40:45.8866542Z [0m[0m15:38:19,513 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PessoaTipoBiometriaServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8866803Z 
2026-07-09T18:40:45.8867223Z 	java:global/siabm-autenticacao-api/PessoaTipoBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaTipoBiometriaService
2026-07-09T18:40:45.8867747Z 	java:app/siabm-autenticacao-api/PessoaTipoBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaTipoBiometriaService
2026-07-09T18:40:45.8868134Z 	java:module/PessoaTipoBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaTipoBiometriaService
2026-07-09T18:40:45.8868553Z 	java:global/siabm-autenticacao-api/PessoaTipoBiometriaServiceImpl
2026-07-09T18:40:45.8868922Z 	java:app/siabm-autenticacao-api/PessoaTipoBiometriaServiceImpl
2026-07-09T18:40:45.8869186Z 	java:module/PessoaTipoBiometriaServiceImpl
2026-07-09T18:40:45.8869293Z 
2026-07-09T18:40:45.8869869Z [0m[0m15:38:19,513 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'LogServicoCanalServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8870132Z 
2026-07-09T18:40:45.8870539Z 	java:global/siabm-autenticacao-api/LogServicoCanalServiceImpl!br.gov.caixa.autenticacao.mtx.services.LogServicoCanalService
2026-07-09T18:40:45.8871061Z 	java:app/siabm-autenticacao-api/LogServicoCanalServiceImpl!br.gov.caixa.autenticacao.mtx.services.LogServicoCanalService
2026-07-09T18:40:45.8871429Z 	java:module/LogServicoCanalServiceImpl!br.gov.caixa.autenticacao.mtx.services.LogServicoCanalService
2026-07-09T18:40:45.8871830Z 	java:global/siabm-autenticacao-api/LogServicoCanalServiceImpl
2026-07-09T18:40:45.8872192Z 	java:app/siabm-autenticacao-api/LogServicoCanalServiceImpl
2026-07-09T18:40:45.8872446Z 	java:module/LogServicoCanalServiceImpl
2026-07-09T18:40:45.8872547Z 
2026-07-09T18:40:45.8873134Z [0m[0m15:38:19,513 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ParametroFuncionalCanalServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8873397Z 
2026-07-09T18:40:45.8873951Z 	java:global/siabm-autenticacao-api/ParametroFuncionalCanalServiceImpl!br.gov.caixa.autenticacao.mtx.services.ParametroFuncionalCanalService
2026-07-09T18:40:45.8874524Z 	java:app/siabm-autenticacao-api/ParametroFuncionalCanalServiceImpl!br.gov.caixa.autenticacao.mtx.services.ParametroFuncionalCanalService
2026-07-09T18:40:45.8874979Z 	java:module/ParametroFuncionalCanalServiceImpl!br.gov.caixa.autenticacao.mtx.services.ParametroFuncionalCanalService
2026-07-09T18:40:45.8875405Z 	java:global/siabm-autenticacao-api/ParametroFuncionalCanalServiceImpl
2026-07-09T18:40:45.8875787Z 	java:app/siabm-autenticacao-api/ParametroFuncionalCanalServiceImpl
2026-07-09T18:40:45.8876061Z 	java:module/ParametroFuncionalCanalServiceImpl
2026-07-09T18:40:45.8876175Z 
2026-07-09T18:40:45.8876792Z [0m[0m15:38:19,513 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'OrdemScoreServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8877047Z 
2026-07-09T18:40:45.8877434Z 	java:global/siabm-autenticacao-api/OrdemScoreServiceImpl!br.gov.caixa.autenticacao.mtx.services.OrdemScoreService
2026-07-09T18:40:45.8877926Z 	java:app/siabm-autenticacao-api/OrdemScoreServiceImpl!br.gov.caixa.autenticacao.mtx.services.OrdemScoreService
2026-07-09T18:40:45.8878269Z 	java:module/OrdemScoreServiceImpl!br.gov.caixa.autenticacao.mtx.services.OrdemScoreService
2026-07-09T18:40:45.8878682Z 	java:global/siabm-autenticacao-api/OrdemScoreServiceImpl
2026-07-09T18:40:45.8879030Z 	java:app/siabm-autenticacao-api/OrdemScoreServiceImpl
2026-07-09T18:40:45.8879277Z 	java:module/OrdemScoreServiceImpl
2026-07-09T18:40:45.8879424Z 
2026-07-09T18:40:45.8879977Z [0m[0m15:38:19,513 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ABISClient' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8880219Z 
2026-07-09T18:40:45.8880573Z 	java:global/siabm-autenticacao-api/ABISClient!br.gov.caixa.autenticacao.abis.client.ABISClient
2026-07-09T18:40:45.8881000Z 	java:app/siabm-autenticacao-api/ABISClient!br.gov.caixa.autenticacao.abis.client.ABISClient
2026-07-09T18:40:45.8881312Z 	java:module/ABISClient!br.gov.caixa.autenticacao.abis.client.ABISClient
2026-07-09T18:40:45.8881661Z 	java:global/siabm-autenticacao-api/ABISClient
2026-07-09T18:40:45.8881982Z 	java:app/siabm-autenticacao-api/ABISClient
2026-07-09T18:40:45.8882208Z 	java:module/ABISClient
2026-07-09T18:40:45.8882294Z 
2026-07-09T18:40:45.8882887Z [0m[0m15:38:19,513 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ValidacaoNumeroClassificacaoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8883161Z 
2026-07-09T18:40:45.8883612Z 	java:global/siabm-autenticacao-api/ValidacaoNumeroClassificacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ValidacaoNumeroClassificacaoService
2026-07-09T18:40:45.8884273Z 	java:app/siabm-autenticacao-api/ValidacaoNumeroClassificacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ValidacaoNumeroClassificacaoService
2026-07-09T18:40:45.8884685Z 	java:module/ValidacaoNumeroClassificacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ValidacaoNumeroClassificacaoService
2026-07-09T18:40:45.8885131Z 	java:global/siabm-autenticacao-api/ValidacaoNumeroClassificacaoServiceImpl
2026-07-09T18:40:45.8885524Z 	java:app/siabm-autenticacao-api/ValidacaoNumeroClassificacaoServiceImpl
2026-07-09T18:40:45.8885802Z 	java:module/ValidacaoNumeroClassificacaoServiceImpl
2026-07-09T18:40:45.8885918Z 
2026-07-09T18:40:45.8886484Z [0m[0m15:38:19,513 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'BiometriaFaceServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8886741Z 
2026-07-09T18:40:45.8887136Z 	java:global/siabm-autenticacao-api/BiometriaFaceServiceImpl!br.gov.caixa.autenticacao.mtx.services.BiometriaFaceService
2026-07-09T18:40:45.8887633Z 	java:app/siabm-autenticacao-api/BiometriaFaceServiceImpl!br.gov.caixa.autenticacao.mtx.services.BiometriaFaceService
2026-07-09T18:40:45.8887990Z 	java:module/BiometriaFaceServiceImpl!br.gov.caixa.autenticacao.mtx.services.BiometriaFaceService
2026-07-09T18:40:45.8888438Z 	java:global/siabm-autenticacao-api/BiometriaFaceServiceImpl
2026-07-09T18:40:45.8888789Z 	java:app/siabm-autenticacao-api/BiometriaFaceServiceImpl
2026-07-09T18:40:45.8889038Z 	java:module/BiometriaFaceServiceImpl
2026-07-09T18:40:45.8889144Z 
2026-07-09T18:40:45.8889722Z [0m[0m15:38:19,513 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ControleTentativasServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8889985Z 
2026-07-09T18:40:45.8890402Z 	java:global/siabm-autenticacao-api/ControleTentativasServiceImpl!br.gov.caixa.autenticacao.mtx.services.ControleTentativasService
2026-07-09T18:40:45.8890941Z 	java:app/siabm-autenticacao-api/ControleTentativasServiceImpl!br.gov.caixa.autenticacao.mtx.services.ControleTentativasService
2026-07-09T18:40:45.8891328Z 	java:module/ControleTentativasServiceImpl!br.gov.caixa.autenticacao.mtx.services.ControleTentativasService
2026-07-09T18:40:45.8891748Z 	java:global/siabm-autenticacao-api/ControleTentativasServiceImpl
2026-07-09T18:40:45.8892115Z 	java:app/siabm-autenticacao-api/ControleTentativasServiceImpl
2026-07-09T18:40:45.8892372Z 	java:module/ControleTentativasServiceImpl
2026-07-09T18:40:45.8892523Z 
2026-07-09T18:40:45.8893114Z [0m[0m15:38:19,513 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'InstituicaoExternaServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8893372Z 
2026-07-09T18:40:45.8893785Z 	java:global/siabm-autenticacao-api/InstituicaoExternaServiceImpl!br.gov.caixa.autenticacao.mtx.services.InstituicaoExternaService
2026-07-09T18:40:45.8894392Z 	java:app/siabm-autenticacao-api/InstituicaoExternaServiceImpl!br.gov.caixa.autenticacao.mtx.services.InstituicaoExternaService
2026-07-09T18:40:45.8894826Z 	java:module/InstituicaoExternaServiceImpl!br.gov.caixa.autenticacao.mtx.services.InstituicaoExternaService
2026-07-09T18:40:45.8895235Z 	java:global/siabm-autenticacao-api/InstituicaoExternaServiceImpl
2026-07-09T18:40:45.8895605Z 	java:app/siabm-autenticacao-api/InstituicaoExternaServiceImpl
2026-07-09T18:40:45.8895863Z 	java:module/InstituicaoExternaServiceImpl
2026-07-09T18:40:45.8895967Z 
2026-07-09T18:40:45.8896535Z [0m[0m15:38:19,514 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'AutenticacaoFacialImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8896788Z 
2026-07-09T18:40:45.8897193Z 	java:global/siabm-autenticacao-api/AutenticacaoFacialImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoFacialService
2026-07-09T18:40:45.8897697Z 	java:app/siabm-autenticacao-api/AutenticacaoFacialImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoFacialService
2026-07-09T18:40:45.8898059Z 	java:module/AutenticacaoFacialImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoFacialService
2026-07-09T18:40:45.8898460Z 	java:global/siabm-autenticacao-api/AutenticacaoFacialImpl
2026-07-09T18:40:45.8898809Z 	java:app/siabm-autenticacao-api/AutenticacaoFacialImpl
2026-07-09T18:40:45.8899057Z 	java:module/AutenticacaoFacialImpl
2026-07-09T18:40:45.8899166Z 
2026-07-09T18:40:45.8899717Z [0m[0m15:38:19,514 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TimerTokenT4SSO' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8899977Z 
2026-07-09T18:40:45.8900357Z 	java:global/siabm-autenticacao-api/TimerTokenT4SSO!br.gov.caixa.autenticacao.abis.token.TimerTokenT4SSO
2026-07-09T18:40:45.8900887Z 	java:app/siabm-autenticacao-api/TimerTokenT4SSO!br.gov.caixa.autenticacao.abis.token.TimerTokenT4SSO
2026-07-09T18:40:45.8901226Z 	java:module/TimerTokenT4SSO!br.gov.caixa.autenticacao.abis.token.TimerTokenT4SSO
2026-07-09T18:40:45.8901650Z 	java:global/siabm-autenticacao-api/TimerTokenT4SSO
2026-07-09T18:40:45.8901986Z 	java:app/siabm-autenticacao-api/TimerTokenT4SSO
2026-07-09T18:40:45.8902209Z 	java:module/TimerTokenT4SSO
2026-07-09T18:40:45.8902304Z 
2026-07-09T18:40:45.8902895Z [0m[0m15:38:19,514 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'RequisicaoTransacaoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8903153Z 
2026-07-09T18:40:45.8903570Z 	java:global/siabm-autenticacao-api/RequisicaoTransacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.RequisicaoTransacaoService
2026-07-09T18:40:45.8904173Z 	java:app/siabm-autenticacao-api/RequisicaoTransacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.RequisicaoTransacaoService
2026-07-09T18:40:45.8904562Z 	java:module/RequisicaoTransacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.RequisicaoTransacaoService
2026-07-09T18:40:45.8904984Z 	java:global/siabm-autenticacao-api/RequisicaoTransacaoServiceImpl
2026-07-09T18:40:45.8905362Z 	java:app/siabm-autenticacao-api/RequisicaoTransacaoServiceImpl
2026-07-09T18:40:45.8905621Z 	java:module/RequisicaoTransacaoServiceImpl
2026-07-09T18:40:45.8905725Z 
2026-07-09T18:40:45.8906282Z [0m[0m15:38:19,514 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PermissaoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8906580Z 
2026-07-09T18:40:45.8906967Z 	java:global/siabm-autenticacao-api/PermissaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.AutorizacaoService
2026-07-09T18:40:45.8907449Z 	java:app/siabm-autenticacao-api/PermissaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.AutorizacaoService
2026-07-09T18:40:45.8907793Z 	java:module/PermissaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.AutorizacaoService
2026-07-09T18:40:45.8908175Z 	java:global/siabm-autenticacao-api/PermissaoServiceImpl
2026-07-09T18:40:45.8908521Z 	java:app/siabm-autenticacao-api/PermissaoServiceImpl
2026-07-09T18:40:45.8908761Z 	java:module/PermissaoServiceImpl
2026-07-09T18:40:45.8908853Z 
2026-07-09T18:40:45.8909441Z [0m[0m15:38:19,514 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TokenManagerT4SSO' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8909727Z 
2026-07-09T18:40:45.8910118Z 	java:global/siabm-autenticacao-api/TokenManagerT4SSO!br.gov.caixa.autenticacao.abis.token.TokenManagerT4SSO
2026-07-09T18:40:45.8910598Z 	java:app/siabm-autenticacao-api/TokenManagerT4SSO!br.gov.caixa.autenticacao.abis.token.TokenManagerT4SSO
2026-07-09T18:40:45.8910933Z 	java:module/TokenManagerT4SSO!br.gov.caixa.autenticacao.abis.token.TokenManagerT4SSO
2026-07-09T18:40:45.8911307Z 	java:global/siabm-autenticacao-api/TokenManagerT4SSO
2026-07-09T18:40:45.8911641Z 	java:app/siabm-autenticacao-api/TokenManagerT4SSO
2026-07-09T18:40:45.8911881Z 	java:module/TokenManagerT4SSO
2026-07-09T18:40:45.8911978Z 
2026-07-09T18:40:45.8912555Z [0m[0m15:38:19,514 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ParametroCanalBiometriaServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8912835Z 
2026-07-09T18:40:45.8913270Z 	java:global/siabm-autenticacao-api/ParametroCanalBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.ParametroCanalBiometriaService
2026-07-09T18:40:45.8913895Z 	java:app/siabm-autenticacao-api/ParametroCanalBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.ParametroCanalBiometriaService
2026-07-09T18:40:45.8914306Z 	java:module/ParametroCanalBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.ParametroCanalBiometriaService
2026-07-09T18:40:45.8914742Z 	java:global/siabm-autenticacao-api/ParametroCanalBiometriaServiceImpl
2026-07-09T18:40:45.8915134Z 	java:app/siabm-autenticacao-api/ParametroCanalBiometriaServiceImpl
2026-07-09T18:40:45.8915467Z 	java:module/ParametroCanalBiometriaServiceImpl
2026-07-09T18:40:45.8915577Z 
2026-07-09T18:40:45.8916170Z [0m[0m15:38:19,514 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ValidacaoOperacaoSemCartaoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:
2026-07-09T18:40:45.8916441Z 
2026-07-09T18:40:45.8916888Z 	java:global/siabm-autenticacao-api/ValidacaoOperacaoSemCartaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ValidacaoOperacaoSemCartaoService
2026-07-09T18:40:45.8917459Z 	java:app/siabm-autenticacao-api/ValidacaoOperacaoSemCartaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ValidacaoOperacaoSemCartaoService
2026-07-09T18:40:45.8917861Z 	java:module/ValidacaoOperacaoSemCartaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ValidacaoOperacaoSemCartaoService
2026-07-09T18:40:45.8918306Z 	java:global/siabm-autenticacao-api/ValidacaoOperacaoSemCartaoServiceImpl
2026-07-09T18:40:45.8918703Z 	java:app/siabm-autenticacao-api/ValidacaoOperacaoSemCartaoServiceImpl
2026-07-09T18:40:45.8918980Z 	java:module/ValidacaoOperacaoSemCartaoServiceImpl
2026-07-09T18:40:45.8919090Z 
2026-07-09T18:40:45.8919703Z [0m[33m15:38:20,105 WARN  [org.jboss.as.ejb3] (MSC service thread 1-3) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.autenticacao.preautorizacao.services.impl.PreAutorizacaoAutenticacaoServiceImpl should not have a final or static method (toEntity)
2026-07-09T18:40:45.8920454Z [0m[0m15:38:20,515 INFO  [org.jipijapa] (MSC service thread 1-3) JIPIORMV53020253: Second level cache enabled for siabm-autenticacao-api.war#SIABM04_DESENV
2026-07-09T18:40:45.8921366Z [0m[33m15:38:20,713 WARN  [org.jboss.as.jaxrs] (MSC service thread 1-3) WFLYRS0018: Explicit usage of Jackson annotation in a Jakarta RESTful Web Services deployment; the system will disable Jakarta JSON Binding processing for the current deployment. Consider setting the 'resteasy.preferJacksonOverJsonB' property to 'false' to restore Jakarta JSON Binding.
2026-07-09T18:40:45.8922166Z [0m[0m15:38:20,815 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.OracleDriver (version 11.1)
2026-07-09T18:40:45.8922695Z [0m[0m15:38:21,011 INFO  [org.jboss.weld.Version] (MSC service thread 1-3) WELD-000900: 3.1.6 (redhat)
2026-07-09T18:40:45.8923317Z [0m[0m15:38:21,306 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0018: Started Driver service with driver-name = siabm-autenticacao-api.war_oracle.jdbc.OracleDriver_11_1
2026-07-09T18:40:45.8924164Z [0m[0m15:38:21,918 INFO  [org.jgroups.protocols.pbcast.GMS] (ServerService Thread Pool -- 79) siabm-autenticacao-api-sandbox-des-13-rg72f: no members discovered after 3005 ms: creating cluster as coordinator
2026-07-09T18:40:45.8924831Z [0m[0m15:38:23,425 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 81) ISPN000128: Infinispan version: Infinispan 'Corona Extra' 11.0.17.Final-redhat-00001
2026-07-09T18:40:45.8925554Z [0m[0m15:38:23,616 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 81) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
2026-07-09T18:40:45.8926281Z [0m[0m15:38:23,636 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 79) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
2026-07-09T18:40:45.8926969Z [0m[0m15:38:23,636 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 82) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.marshalling.jboss.JBossMarshaller'
2026-07-09T18:40:45.8927682Z [0m[0m15:38:23,636 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 80) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
2026-07-09T18:40:45.8928311Z [0m[0m15:38:23,929 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 80) ISPN000078: Starting JGroups channel ejb
2026-07-09T18:40:45.8928814Z [0m[0m15:38:23,929 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 82) ISPN000078: Starting JGroups channel ejb
2026-07-09T18:40:45.8929322Z [0m[0m15:38:23,929 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 79) ISPN000078: Starting JGroups channel ejb
2026-07-09T18:40:45.8929827Z [0m[0m15:38:23,929 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 81) ISPN000078: Starting JGroups channel ejb
2026-07-09T18:40:45.8930504Z [0m[0m15:38:23,933 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 82) ISPN000094: Received new cluster view for channel ejb: [siabm-autenticacao-api-sandbox-des-13-rg72f|0] (1) [siabm-autenticacao-api-sandbox-des-13-rg72f]
2026-07-09T18:40:45.8931260Z [0m[0m15:38:23,933 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 79) ISPN000094: Received new cluster view for channel ejb: [siabm-autenticacao-api-sandbox-des-13-rg72f|0] (1) [siabm-autenticacao-api-sandbox-des-13-rg72f]
2026-07-09T18:40:45.8932025Z [0m[0m15:38:23,933 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 80) ISPN000094: Received new cluster view for channel ejb: [siabm-autenticacao-api-sandbox-des-13-rg72f|0] (1) [siabm-autenticacao-api-sandbox-des-13-rg72f]
2026-07-09T18:40:45.8932833Z [0m[0m15:38:23,933 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 81) ISPN000094: Received new cluster view for channel ejb: [siabm-autenticacao-api-sandbox-des-13-rg72f|0] (1) [siabm-autenticacao-api-sandbox-des-13-rg72f]
2026-07-09T18:40:45.8933595Z [0m[0m15:38:24,009 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 79) ISPN000079: Channel ejb local address is siabm-autenticacao-api-sandbox-des-13-rg72f, physical addresses are [127.0.0.1:55200]
2026-07-09T18:40:45.8934438Z [0m[0m15:38:24,009 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 80) ISPN000079: Channel ejb local address is siabm-autenticacao-api-sandbox-des-13-rg72f, physical addresses are [127.0.0.1:55200]
2026-07-09T18:40:45.8935205Z [0m[0m15:38:24,009 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 82) ISPN000079: Channel ejb local address is siabm-autenticacao-api-sandbox-des-13-rg72f, physical addresses are [127.0.0.1:55200]
2026-07-09T18:40:45.8935990Z [0m[0m15:38:24,009 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 81) ISPN000079: Channel ejb local address is siabm-autenticacao-api-sandbox-des-13-rg72f, physical addresses are [127.0.0.1:55200]
2026-07-09T18:40:45.8936711Z [0m[0m15:38:24,107 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 81) WFLYJPA0010: Starting Persistence Unit (phase 1 of 2) Service 'siabm-autenticacao-api.war#SIABM04_DESENV'
2026-07-09T18:40:45.8937315Z [0m[0m15:38:24,115 INFO  [org.infinispan.CONFIG] (MSC service thread 1-6) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
2026-07-09T18:40:45.8937896Z [0m[0m15:38:24,116 INFO  [org.infinispan.CONFIG] (MSC service thread 1-6) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
2026-07-09T18:40:45.8938246Z [0m[0m15:38:24,130 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 81) HHH000204: Processing PersistenceUnitInfo [
2026-07-09T18:40:45.8938413Z 	name: SIABM04_DESENV
2026-07-09T18:40:45.8938513Z 	...]
2026-07-09T18:40:45.8938758Z [0m[0m15:38:24,415 INFO  [org.hibernate.Version] (ServerService Thread Pool -- 81) HHH000412: Hibernate Core {5.3.29.Final-redhat-00001}
2026-07-09T18:40:45.8939057Z [0m[0m15:38:24,416 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 81) HHH000206: hibernate.properties not found
2026-07-09T18:40:45.8939421Z [0m[0m15:38:24,815 INFO  [org.hibernate.annotations.common.Version] (ServerService Thread Pool -- 81) HCANN000001: Hibernate Commons Annotations {5.0.5.Final-redhat-00002}
2026-07-09T18:40:45.8939874Z [0m[0m15:38:24,937 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 82) WFLYCLINF0002: Started http-remoting-connector cache from ejb container
2026-07-09T18:40:45.8940233Z [0m[0m15:38:25,427 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 81) WFLYJPA0010: Starting Persistence Unit (phase 2 of 2) Service 'siabm-autenticacao-api.war#SIABM04_DESENV'
2026-07-09T18:40:45.8940575Z [0m[0m15:38:27,218 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 81) HHH000400: Using dialect: org.hibernate.dialect.Oracle10gDialect
2026-07-09T18:40:45.8940899Z [0m[0m15:38:27,737 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 81) Envers integration enabled? : true
2026-07-09T18:40:45.8941329Z [0m[0m15:38:28,421 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-09 15:38:28.421 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
2026-07-09T18:40:45.8941792Z [0m[0m15:38:28,421 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-09 15:38:28.421 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 0 seconds (+/-10%)
2026-07-09T18:40:45.8942245Z [0m[0m15:38:30,462 INFO  [org.hibernate.hql.internal.QueryTranslatorFactoryInitiator] (ServerService Thread Pool -- 81) HHH000397: Using ASTQueryTranslatorFactory
2026-07-09T18:40:45.8942850Z [0m[33m15:38:33,846 WARN  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 81) RESTEASY002150: resteasy.scan is no longer supported.  Use a servlet 3.0 container and the ResteasyServletInitializer
2026-07-09T18:40:45.8943431Z [0m[0m15:38:34,916 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 81) WFLYUT0021: Registered web context: '/siabm-autenticacao-api' for server 'default-server'
2026-07-09T18:40:45.8944099Z [0m[0m15:38:35,211 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 45) WFLYSRV0010: Deployed "siabm-autenticacao-api.war" (runtime-name : "siabm-autenticacao-api.war")
2026-07-09T18:40:45.8944556Z [0m[0m15:38:35,508 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
2026-07-09T18:40:45.8945314Z [0m[0m15:38:35,605 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) started in 40799ms - Started 1096 of 1317 services (454 services are lazy, passive or on-demand)
2026-07-09T18:40:45.8945995Z [0m[0m15:38:35,611 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://127.0.0.1:9990/management
2026-07-09T18:40:45.8946552Z [0m[0m15:38:35,611 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: Admin console listening on http://127.0.0.1:9990
2026-07-09T18:40:45.8947141Z [0m[0m15:38:36,841 INFO  [br.gov.caixa.siabm.autenticacao.mtx] (EJB default - 3) [requestNewTokenT4] Nova data de expira??o do token: 2026-07-09T15:43:06.838
2026-07-09T18:40:45.8947951Z [0m[0m15:38:36,842 INFO  [br.gov.caixa.common] (EJB default - 4) [requestNewToken] Nova data de expira??o do token: 2026-07-09T15:43:06.842
2026-07-09T18:40:45.8948716Z [0m[0m15:38:58,390 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-09 15:38:58.390 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
2026-07-09T18:40:45.8949215Z [0m[0m15:38:58,390 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-09 15:38:58.390 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 1 seconds (+/-10%)
2026-07-09T18:40:45.8949687Z [0m[0m15:39:28,393 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-09 15:39:28.393 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
2026-07-09T18:40:45.8950372Z [0m[0m15:39:28,393 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-09 15:39:28.393 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 4 seconds (+/-10%)
2026-07-09T18:40:45.8950876Z [0m[0m15:39:58,397 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-09 15:39:58.396 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
2026-07-09T18:40:45.8951344Z [0m[0m15:39:58,397 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-09 15:39:58.397 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 9 seconds (+/-10%)
2026-07-09T18:40:45.8951821Z [0m[0m15:40:28,387 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-09 15:40:28.387 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
2026-07-09T18:40:45.8952291Z [0m[0m15:40:28,387 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-09 15:40:28.387 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 16 seconds (+/-10%)
2026-07-09T18:40:45.8953066Z ##[debug]Exit code 0 received from tool '/usr/bin/bash'
2026-07-09T18:40:45.8953354Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-07-09T18:40:45.8953612Z ##[debug]task result: Succeeded
2026-07-09T18:40:45.8954512Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-07-09T18:40:45.8955364Z ##[section]Finishing: Logs da Aplicação
