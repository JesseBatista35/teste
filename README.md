achei o SIABM-autenticacao-api - stage ec des-sandbox


2026-07-03T13:00:20.8352449Z ##[debug]Evaluating condition for step: 'Logs da Aplicação'
2026-07-03T13:00:20.8353222Z ##[debug]Evaluating: always()
2026-07-03T13:00:20.8353434Z ##[debug]Evaluating always:
2026-07-03T13:00:20.8354244Z ##[debug]=> True
2026-07-03T13:00:20.8354470Z ##[debug]Result: True
2026-07-03T13:00:20.8354645Z ##[section]Starting: Logs da Aplicação
2026-07-03T13:00:20.8358329Z ==============================================================================
2026-07-03T13:00:20.8358507Z Task         : Bash
2026-07-03T13:00:20.8358553Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-03T13:00:20.8358624Z Version      : 3.227.0
2026-07-03T13:00:20.8358667Z Author       : Microsoft Corporation
2026-07-03T13:00:20.8358717Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-03T13:00:20.8358798Z ==============================================================================
2026-07-03T13:00:20.8902514Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-07-03T13:00:20.9578992Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-07-03T13:00:20.9586989Z ##[debug]loading inputs and endpoints
2026-07-03T13:00:20.9594450Z ##[debug]loading INPUT_TARGETTYPE
2026-07-03T13:00:20.9601743Z ##[debug]loading INPUT_FILEPATH
2026-07-03T13:00:20.9602783Z ##[debug]loading INPUT_SCRIPT
2026-07-03T13:00:20.9603539Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-07-03T13:00:20.9604108Z ##[debug]loading INPUT_FAILONSTDERR
2026-07-03T13:00:20.9604883Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-07-03T13:00:20.9605485Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-07-03T13:00:20.9607458Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-07-03T13:00:20.9612966Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-07-03T13:00:20.9614546Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-07-03T13:00:20.9616212Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-07-03T13:00:20.9618094Z ##[debug]loading SECRET_TOKEN_CRQ
2026-07-03T13:00:20.9619725Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-07-03T13:00:20.9620968Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-07-03T13:00:20.9621597Z ##[debug]loading SECRET_PW_ALOCAIP
2026-07-03T13:00:20.9622358Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-07-03T13:00:20.9622764Z ##[debug]loading SECRET_PW_ISILON
2026-07-03T13:00:20.9623438Z ##[debug]loading SECRET_FORTIFY_PASS
2026-07-03T13:00:20.9623941Z ##[debug]loading SECRET_AZPAT
2026-07-03T13:00:20.9624494Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-07-03T13:00:20.9626511Z ##[debug]loading SECRET_PASSWORD_CGC
2026-07-03T13:00:20.9626801Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-07-03T13:00:20.9627036Z ##[debug]loaded 22
2026-07-03T13:00:20.9631928Z ##[debug]Agent.ProxyUrl=undefined
2026-07-03T13:00:20.9632503Z ##[debug]Agent.CAInfo=undefined
2026-07-03T13:00:20.9632792Z ##[debug]Agent.ClientCert=undefined
2026-07-03T13:00:20.9633035Z ##[debug]Agent.SkipCertValidation=True
2026-07-03T13:00:20.9646922Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-07-03T13:00:20.9649063Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-07-03T13:00:20.9649343Z ##[debug]system.culture=en-US
2026-07-03T13:00:20.9656619Z ##[debug]failOnStderr=false
2026-07-03T13:00:20.9658246Z ##[debug]workingDirectory=/opt/ads-agent/_work/r139/a
2026-07-03T13:00:20.9658582Z ##[debug]check path : /opt/ads-agent/_work/r139/a
2026-07-03T13:00:20.9659181Z ##[debug]targetType=inline
2026-07-03T13:00:20.9659411Z ##[debug]bashEnvValue=undefined
2026-07-03T13:00:20.9660261Z ##[debug]script=#!/bin/bash
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
2026-07-03T13:00:20.9668380Z Generating script.
2026-07-03T13:00:20.9670495Z ##[debug]which 'bash'
2026-07-03T13:00:20.9675293Z ##[debug]found: '/usr/bin/bash'
2026-07-03T13:00:20.9675844Z ##[debug]Agent.Version=3.236.1
2026-07-03T13:00:20.9676088Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-07-03T13:00:20.9676332Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-07-03T13:00:20.9679561Z ========================== Starting Command Output ===========================
2026-07-03T13:00:20.9680276Z ##[debug]which '/usr/bin/bash'
2026-07-03T13:00:20.9680966Z ##[debug]found: '/usr/bin/bash'
2026-07-03T13:00:20.9681782Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/2371acd9-0ec4-4020-80a0-70b2bc9520f6.sh
2026-07-03T13:00:20.9683901Z ##[debug]exec tool: /usr/bin/bash
2026-07-03T13:00:20.9684138Z ##[debug]arguments:
2026-07-03T13:00:20.9684381Z ##[debug]   /opt/ads-agent/_work/_temp/2371acd9-0ec4-4020-80a0-70b2bc9520f6.sh
2026-07-03T13:00:20.9686521Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/2371acd9-0ec4-4020-80a0-70b2bc9520f6.sh
2026-07-03T13:00:20.9752517Z + shopt -s expand_aliases
2026-07-03T13:00:20.9752704Z + [[ -n okd4_nprd ]]
2026-07-03T13:00:20.9752807Z + [[ okd4_nprd =~ ocp ]]
2026-07-03T13:00:20.9752941Z + [[ -n okd4_nprd ]]
2026-07-03T13:00:20.9753045Z + [[ okd4_nprd =~ okd4 ]]
2026-07-03T13:00:20.9753246Z + app=siabm-autenticacao-api-sandbox-des
2026-07-03T13:00:20.9753360Z + oc version
2026-07-03T13:00:21.0437664Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-07-03T13:00:21.0437908Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-07-03T13:00:21.0438101Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-07-03T13:00:21.0464408Z ++ oc get pod -l name=siabm-autenticacao-api-sandbox-des -n siabm-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-07-03T13:00:21.0465342Z ++ tac
2026-07-03T13:00:21.0466644Z ++ grep -v '^$'
2026-07-03T13:00:21.0467621Z ++ head -n1
2026-07-03T13:00:21.1239245Z + last_pod=siabm-autenticacao-api-sandbox-des-11-kz4pr
2026-07-03T13:00:21.1239718Z + echo 'Logs do POD: siabm-autenticacao-api-sandbox-des-11-kz4pr'
2026-07-03T13:00:21.1240291Z + oc logs siabm-autenticacao-api-sandbox-des-11-kz4pr -c siabm-autenticacao-api-sandbox-des -n siabm-des
2026-07-03T13:00:21.1240520Z Logs do POD: siabm-autenticacao-api-sandbox-des-11-kz4pr
2026-07-03T13:00:21.1970348Z Criando diretorio '/opt/jboss/standalone/configuration/.secrets'...
2026-07-03T13:00:21.1970606Z Configuracao do vault realizada
2026-07-03T13:00:21.1970753Z Arquivo secrets.properties encontrado, carregando propriedades...
2026-07-03T13:00:21.1970919Z /opt/jboss/bin/standalone.conf: line 37: =org.jboss.byteman: command not found
2026-07-03T13:00:21.1971107Z =========================================================================
2026-07-03T13:00:21.1971468Z 
2026-07-03T13:00:21.1971582Z   JBoss Bootstrap Environment
2026-07-03T13:00:21.1971632Z 
2026-07-03T13:00:21.1971735Z   JBOSS_HOME: /opt/jboss
2026-07-03T13:00:21.1971780Z 
2026-07-03T13:00:21.1971886Z   JAVA: /usr/java/latest/bin/java
2026-07-03T13:00:21.1971942Z 
2026-07-03T13:00:21.1973750Z   JAVA_OPTS:  -verbose:gc -Xloggc:"/opt/jboss/standalone/log/gc.log" -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms96m -Xmx900m -XX:MetaspaceSize=256M -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs= -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=siabm-autenticacao-api -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=siabm-autenticacao-api-des -Djava.security.provider.6=br.com.trueaccess.provider.netdfence.ND -Djava.net.useSystemProxies=false 
2026-07-03T13:00:21.1974796Z 
2026-07-03T13:00:21.1974927Z =========================================================================
2026-07-03T13:00:21.1975001Z 
2026-07-03T13:00:21.1975279Z 2026-07-03 09:58:53.403 [main] INFO co.elastic.apm.agent.util.JmxUtils - Found JVM-specific OperatingSystemMXBean interface: com.sun.management.OperatingSystemMXBean
2026-07-03T13:00:21.1975683Z 2026-07-03 09:58:53.482 [main] INFO co.elastic.apm.agent.configuration.StartupInfo - Starting Elastic APM 1.15.0 as siabm-autenticacao-api on Java 1.8.0_301 (Oracle Corporation) Linux 6.1.18-200.fc37.x86_64
2026-07-03T13:00:21.1976011Z 2026-07-03 09:58:53.488 [main] INFO co.elastic.apm.agent.impl.ElasticApmTracer - Tracer switched to RUNNING state
2026-07-03T13:00:21.1976294Z [0m09:58:55,798 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.0.Final-redhat-00001
2026-07-03T13:00:21.1976545Z [0m[0m09:58:56,623 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.12.Final-redhat-00001
2026-07-03T13:00:21.1976800Z [0m[0m09:58:56,839 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
2026-07-03T13:00:21.1977107Z [0m[0m09:58:57,431 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) starting
2026-07-03T13:00:21.1977696Z [0m[0m09:58:57,632 INFO  [org.jboss.vfs] (MSC service thread 1-3) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
2026-07-03T13:00:21.1978548Z [0m[0m09:58:58,522 INFO  [stdout] (elastic-apm-server-healthcheck) 2026-07-03 09:58:58.521 [elastic-apm-server-healthcheck] WARN co.elastic.apm.agent.report.ApmServerHealthChecker - Elastic APM server http://apm-server-devops.produtos.caixa/ is not available (connect timed out)
2026-07-03T13:00:21.1979058Z [0m[0m09:59:00,618 INFO  [org.wildfly.security] (ServerService Thread Pool -- 30) ELY00001: WildFly Elytron version 1.15.16.Final-redhat-00001
2026-07-03T13:00:21.1979427Z [0m[0m09:59:01,521 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 25) WFLYCTL0033: Extension 'security' is deprecated and may not be supported in future versions
2026-07-03T13:00:21.1980063Z [0m[0m09:59:02,947 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
2026-07-03T13:00:21.1980827Z [0m[0m09:59:03,022 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 23) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
2026-07-03T13:00:21.1981544Z [0m[0m09:59:03,026 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 28) WFLYCTL0028: Attribute 'location' in the resource at address '/subsystem=elytron/credential-store=DSKeystore' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
2026-07-03T13:00:21.1982080Z [0m[0m09:59:03,616 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-07-03 09:59:03.616 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - connect timed out
2026-07-03T13:00:21.1982503Z [0m[0m09:59:04,175 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 27) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/e0/e5021d0edbc610ee51bfd873a073fe2b027f6a/content
2026-07-03T13:00:21.1982905Z [0m[0m09:59:04,240 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
2026-07-03T13:00:21.1983192Z [0m[0m09:59:04,322 INFO  [org.xnio] (MSC service thread 1-8) XNIO version 3.8.9.Final-redhat-00001
2026-07-03T13:00:21.1983464Z [0m[0m09:59:04,328 INFO  [org.xnio.nio] (MSC service thread 1-8) XNIO NIO Implementation Version 3.8.9.Final-redhat-00001
2026-07-03T13:00:21.1983779Z [0m[0m09:59:04,526 INFO  [org.jboss.as.clustering.jgroups] (ServerService Thread Pool -- 59) WFLYCLJG0001: Activating JGroups subsystem. JGroups version 4.2.11
2026-07-03T13:00:21.1984153Z [0m[0m09:59:04,526 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 55) WFLYIO001: Worker 'default' has auto-configured to 64 IO threads with 512 max task threads based on your 32 available processors
2026-07-03T13:00:21.1984493Z [0m[0m09:59:04,527 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 52) WFLYHEALTH0001: Activating Base Health Subsystem
2026-07-03T13:00:21.1984802Z [0m[0m09:59:04,527 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 54) WFLYCLINF0001: Activating Infinispan subsystem.
2026-07-03T13:00:21.1985104Z [0m[0m09:59:04,529 INFO  [org.wildfly.iiop.openjdk] (ServerService Thread Pool -- 53) WFLYIIOP0001: Activating IIOP Subsystem
2026-07-03T13:00:21.1985531Z [0m[33m09:59:04,619 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 74) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
2026-07-03T13:00:21.1985903Z [0m[0m09:59:04,621 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 56) WFLYRS0016: RESTEasy version 3.15.7.Final-redhat-00001
2026-07-03T13:00:21.1986220Z [0m[0m09:59:04,624 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 62) WFLYJSF0007: Activated the following Jakarta Server Faces Implementations: [main]
2026-07-03T13:00:21.1986530Z [0m[0m09:59:04,631 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 65) WFLYMETRICS0001: Activating Base Metrics Subsystem
2026-07-03T13:00:21.1986863Z [0m[0m09:59:04,728 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 76) WFLYWS0002: Activating WebServices Extension
2026-07-03T13:00:21.1987147Z [0m[0m09:59:04,729 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 72) WFLYSEC0002: Activating Security Subsystem
2026-07-03T13:00:21.1987476Z [0m[0m09:59:04,824 INFO  [org.jboss.as.connector] (MSC service thread 1-2) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 1.5.11.Final-redhat-00001)
2026-07-03T13:00:21.1987780Z [0m[0m09:59:04,737 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 66) WFLYNAM0001: Activating Naming Subsystem
2026-07-03T13:00:21.1988075Z [0m[0m09:59:04,829 INFO  [org.jboss.as.security] (MSC service thread 1-1) WFLYSEC0001: Current PicketBox version=5.0.3.Final-redhat-00009
2026-07-03T13:00:21.1988492Z [0m[0m09:59:05,521 INFO  [org.jboss.remoting] (MSC service thread 1-8) JBoss Remoting version 5.0.27.Final-redhat-00001
2026-07-03T13:00:21.1988907Z [0m[0m09:59:06,024 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-6) WFLYUT0003: Undertow 2.2.24.SP1-redhat-00001 starting
2026-07-03T13:00:21.1989292Z [0m[0m09:59:06,247 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 128 (per class), which is derived from the number of CPUs on this host.
2026-07-03T13:00:21.1989694Z [0m[0m09:59:06,248 INFO  [org.jboss.as.ejb3] (MSC service thread 1-4) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 512 (per class), which is derived from thread worker pool sizing.
2026-07-03T13:00:21.1990078Z [0m[0m09:59:06,335 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 44) WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.OracleDriver (version 11.1)
2026-07-03T13:00:21.1990453Z [0m[33m09:59:06,336 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-8) WFLYELY00023: KeyStore file '/opt/jboss/standalone/configuration/application.keystore' does not exist. Used blank.
2026-07-03T13:00:21.1990762Z [0m[0m09:59:06,338 INFO  [org.jboss.as.naming] (MSC service thread 1-2) WFLYNAM0003: Starting Naming Service
2026-07-03T13:00:21.1991046Z [0m[0m09:59:06,520 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-8) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
2026-07-03T13:00:21.1991365Z [0m[0m09:59:06,521 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-8) WFLYJCA0018: Started Driver service with driver-name = oracle
2026-07-03T13:00:21.1991782Z [0m[33m09:59:06,728 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY01084: KeyStore /opt/jboss/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self-signed certificate for host localhost
2026-07-03T13:00:21.1992271Z [0m[0m09:59:07,234 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 75) WFLYUT0014: Creating file handler for path '/opt/jboss/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
2026-07-03T13:00:21.1992630Z [0m[0m09:59:07,441 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0012: Started server default-server.
2026-07-03T13:00:21.1992897Z [0m[0m09:59:07,444 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) Queuing requests.
2026-07-03T13:00:21.1993166Z [0m[0m09:59:07,445 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) WFLYUT0018: Host default-host starting
2026-07-03T13:00:21.1993477Z [0m[0m09:59:07,634 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0006: Undertow AJP listener ajp listening on 0.0.0.0:8009
2026-07-03T13:00:21.1993807Z [0m[0m09:59:07,716 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-8) WFLYUT0006: Undertow HTTP listener default listening on 0.0.0.0:8080
2026-07-03T13:00:21.1994124Z [0m[0m09:59:07,821 INFO  [org.jboss.as.ejb3] (MSC service thread 1-5) WFLYEJB0493: Jakarta Enterprise Beans subsystem suspension complete
2026-07-03T13:00:21.1994570Z [0m[0m09:59:08,125 INFO  [org.jboss.as.patching] (MSC service thread 1-1) WFLYPAT0050: JBoss EAP cumulative patch ID is: base, one-off patches include: none
2026-07-03T13:00:21.1995001Z [0m[33m09:59:08,343 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-6) WFLYDM0111: Keystore /opt/jboss/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self signed certificate for host localhost
2026-07-03T13:00:21.1995428Z [0m[0m09:59:08,449 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-2) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/jboss/standalone/deployments
2026-07-03T13:00:21.1995805Z [0m[0m09:59:08,452 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0027: Starting deployment of "siabm-autenticacao-api.war" (runtime-name: "siabm-autenticacao-api.war")
2026-07-03T13:00:21.1999134Z [0m[0m09:59:08,617 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-4) WFLYJCA0001: Bound data source [java:jboss/jdbc/SIABM04]
2026-07-03T13:00:21.1999434Z [0m[0m09:59:08,716 INFO  [org.wildfly.iiop.openjdk] (MSC service thread 1-7) WFLYIIOP0009: CORBA ORB Service started
2026-07-03T13:00:21.1999749Z [0m[0m09:59:08,724 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-6) WFLYUT0006: Undertow HTTPS listener https listening on 0.0.0.0:8443
2026-07-03T13:00:21.2000099Z [0m[0m09:59:09,133 INFO  [org.jboss.ws.common.management] (MSC service thread 1-5) JBWS022052: Starting JBossWS 5.4.8.Final-redhat-00001 (Apache CXF 3.4.10.redhat-00001) 
2026-07-03T13:00:21.2000556Z [0m[33m09:59:17,432 WARN  [org.jboss.weld.deployer] (MSC service thread 1-3) WFLYWELD0012: Warning while parsing vfs:/content/siabm-autenticacao-api.war/WEB-INF/classes/META-INF/beans.xml:4 cvc-complex-type.3.2.2: Attribute 'bean-discovery-mode' is not allowed to appear in element 'beans'.
2026-07-03T13:00:21.2001058Z [0m[33m09:59:17,432 WARN  [org.jboss.weld.deployer] (MSC service thread 1-3) WFLYWELD0012: Warning while parsing vfs:/content/siabm-autenticacao-api.war/WEB-INF/classes/META-INF/beans.xml:4 cvc-complex-type.3.2.2: Attribute 'version' is not allowed to appear in element 'beans'.
2026-07-03T13:00:21.2001410Z [0m[0m09:59:17,454 INFO  [org.jboss.as.jpa] (MSC service thread 1-3) WFLYJPA0002: Read persistence.xml for SIABM04_DESENV
2026-07-03T13:00:21.2002293Z [0m[31m09:59:17,918 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-6) MSC000001: Failed to start service jboss.module.service."deployment.siabm-autenticacao-api.war".main: org.jboss.msc.service.StartException in service jboss.module.service."deployment.siabm-autenticacao-api.war".main: WFLYSRV0179: Failed to load module: deployment.siabm-autenticacao-api.war
2026-07-03T13:00:21.2002683Z 	at org.jboss.as.server.moduleservice.ModuleLoadService.start(ModuleLoadService.java:116)
2026-07-03T13:00:21.2002902Z 	at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1739)
2026-07-03T13:00:21.2003165Z 	at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1701)
2026-07-03T13:00:21.2003565Z 	at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1559)
2026-07-03T13:00:21.2003937Z 	at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
2026-07-03T13:00:21.2004271Z 	at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
2026-07-03T13:00:21.2004596Z 	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
2026-07-03T13:00:21.2004919Z 	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
2026-07-03T13:00:21.2005121Z 	at java.lang.Thread.run(Thread.java:748)
2026-07-03T13:00:21.2005276Z Caused by: org.jboss.modules.ModuleNotFoundException: com.dinamonetworks
2026-07-03T13:00:21.2005572Z 	at org.jboss.modules.Module.addPaths(Module.java:1288)
2026-07-03T13:00:21.2005726Z 	at org.jboss.modules.Module.link(Module.java:1644)
2026-07-03T13:00:21.2005883Z 	at org.jboss.modules.Module.relinkIfNecessary(Module.java:1672)
2026-07-03T13:00:21.2006054Z 	at org.jboss.modules.ModuleLoader.loadModule(ModuleLoader.java:303)
2026-07-03T13:00:21.2006226Z 	at org.jboss.modules.ModuleLoader.loadModule(ModuleLoader.java:287)
2026-07-03T13:00:21.2006403Z 	at org.jboss.as.server.moduleservice.ModuleLoadService.start(ModuleLoadService.java:93)
2026-07-03T13:00:21.2006549Z 	... 8 more
2026-07-03T13:00:21.2006589Z 
2026-07-03T13:00:21.2007101Z [0m[31m09:59:18,121 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("deploy") failed - address: ([("deployment" => "siabm-autenticacao-api.war")]) - failure description: {"WFLYCTL0080: Failed services" => {"jboss.module.service.\"deployment.siabm-autenticacao-api.war\".main" => "WFLYSRV0179: Failed to load module: deployment.siabm-autenticacao-api.war
2026-07-03T13:00:21.2007489Z     Caused by: org.jboss.modules.ModuleNotFoundException: com.dinamonetworks"}}
2026-07-03T13:00:21.2007797Z [0m[0m09:59:18,217 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 45) WFLYSRV0010: Deployed "siabm-autenticacao-api.war" (runtime-name : "siabm-autenticacao-api.war")
2026-07-03T13:00:21.2008100Z [0m[0m09:59:18,219 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0183: Service status report
2026-07-03T13:00:21.2008525Z WFLYCTL0186:   Services which failed to start:      service jboss.module.service."deployment.siabm-autenticacao-api.war".main: WFLYSRV0179: Failed to load module: deployment.siabm-autenticacao-api.war
2026-07-03T13:00:21.2008651Z 
2026-07-03T13:00:21.2008938Z [0m[0m09:59:18,518 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
2026-07-03T13:00:21.2009376Z [0m[31m09:59:18,521 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) started (with errors) in 23601ms - Started 358 of 696 services (2 services failed or missing dependencies, 451 services are lazy, passive or on-demand)
2026-07-03T13:00:21.2009792Z [0m[0m09:59:18,522 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://127.0.0.1:9990/management
2026-07-03T13:00:21.2010114Z [0m[0m09:59:18,522 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: Admin console listening on http://127.0.0.1:9990
2026-07-03T13:00:21.2010539Z [0m[0m09:59:28,414 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-03 09:59:28.414 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
2026-07-03T13:00:21.2010991Z [0m[0m09:59:28,414 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-03 09:59:28.414 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 0 seconds (+/-10%)
2026-07-03T13:00:21.2011449Z [0m[0m09:59:58,413 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-03 09:59:58.413 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
2026-07-03T13:00:21.2011897Z [0m[0m09:59:58,413 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-03 09:59:58.413 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 1 seconds (+/-10%)
2026-07-03T13:00:21.2019858Z ##[debug]Exit code 0 received from tool '/usr/bin/bash'
2026-07-03T13:00:21.2022694Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-07-03T13:00:21.2027723Z ##[debug]task result: Succeeded
2026-07-03T13:00:21.2029017Z ##[debug]Processed: ##vso[task.complete result=Succeeded;done=true;]
2026-07-03T13:00:21.2062626Z ##[section]Finishing: Logs da Aplicação


P
siabm-autenticacao-api-sandbox-des-13-rg72f



Criando diretorio '/opt/jboss/standalone/configuration/.secrets'...
Configuracao do vault realizada
Arquivo secrets.properties encontrado, carregando propriedades...
/opt/jboss/bin/standalone.conf: line 37: =org.jboss.byteman: command not found
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/java/latest/bin/java

  JAVA_OPTS:  -verbose:gc -Xloggc:"/opt/jboss/standalone/log/gc.log" -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms96m -Xmx900m -XX:MetaspaceSize=256M -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs= -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=siabm-autenticacao-api -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=siabm-autenticacao-api-des -Djava.security.provider.6=br.com.trueaccess.provider.netdfence.ND -Djava.net.useSystemProxies=false 

=========================================================================

2026-07-09 15:37:53.385 [main] INFO co.elastic.apm.agent.util.JmxUtils - Found JVM-specific OperatingSystemMXBean interface: com.sun.management.OperatingSystemMXBean
2026-07-09 15:37:53.463 [main] INFO co.elastic.apm.agent.configuration.StartupInfo - Starting Elastic APM 1.15.0 as siabm-autenticacao-api on Java 1.8.0_301 (Oracle Corporation) Linux 6.1.18-200.fc37.x86_64
2026-07-09 15:37:53.468 [main] INFO co.elastic.apm.agent.impl.ElasticApmTracer - Tracer switched to RUNNING state
[0m15:37:55,623 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.0.Final-redhat-00001
[0m[0m15:37:56,332 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.12.Final-redhat-00001
[0m[0m15:37:56,705 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
[0m[0m15:37:57,017 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) starting
[0m[0m15:37:57,207 INFO  [org.jboss.vfs] (MSC service thread 1-3) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
[0m[0m15:37:58,607 INFO  [stdout] (elastic-apm-server-healthcheck) 2026-07-09 15:37:58.607 [elastic-apm-server-healthcheck] WARN co.elastic.apm.agent.report.ApmServerHealthChecker - Elastic APM server http://apm-server-devops.produtos.caixa/ is not available (connect timed out)
[0m[0m15:38:00,107 INFO  [org.wildfly.security] (ServerService Thread Pool -- 30) ELY00001: WildFly Elytron version 1.15.16.Final-redhat-00001
[0m[0m15:38:00,905 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 20) WFLYCTL0033: Extension 'security' is deprecated and may not be supported in future versions
[0m[0m15:38:02,428 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m15:38:02,815 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 25) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m15:38:02,821 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 37) WFLYCTL0028: Attribute 'location' in the resource at address '/subsystem=elytron/credential-store=DSKeystore' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m15:38:03,614 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-07-09 15:38:03.614 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - connect timed out
[0m[0m15:38:03,741 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 11) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/b5/eb9637f2b0a07d72376b56109600e0055fa792/content
[0m[0m15:38:03,760 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
[0m[0m15:38:03,771 INFO  [org.xnio] (MSC service thread 1-5) XNIO version 3.8.9.Final-redhat-00001
[0m[0m15:38:03,804 INFO  [org.xnio.nio] (MSC service thread 1-5) XNIO NIO Implementation Version 3.8.9.Final-redhat-00001
[0m[0m15:38:04,116 INFO  [org.jboss.as.clustering.jgroups] (ServerService Thread Pool -- 59) WFLYCLJG0001: Activating JGroups subsystem. JGroups version 4.2.11
[0m[0m15:38:04,117 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 54) WFLYCLINF0001: Activating Infinispan subsystem.
[0m[33m15:38:04,112 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 74) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
[0m[0m15:38:04,204 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 55) WFLYIO001: Worker 'default' has auto-configured to 64 IO threads with 512 max task threads based on your 32 available processors
[0m[0m15:38:04,205 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 66) WFLYNAM0001: Activating Naming Subsystem
[0m[0m15:38:04,206 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 72) WFLYSEC0002: Activating Security Subsystem
[0m[0m15:38:04,209 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 52) WFLYHEALTH0001: Activating Base Health Subsystem
[0m[0m15:38:04,215 INFO  [org.jboss.as.security] (MSC service thread 1-2) WFLYSEC0001: Current PicketBox version=5.0.3.Final-redhat-00009
[0m[0m15:38:04,217 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 56) WFLYRS0016: RESTEasy version 3.15.7.Final-redhat-00001
[0m[0m15:38:04,309 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 76) WFLYWS0002: Activating WebServices Extension
[0m[0m15:38:04,310 INFO  [org.wildfly.iiop.openjdk] (ServerService Thread Pool -- 53) WFLYIIOP0001: Activating IIOP Subsystem
[0m[0m15:38:04,313 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 65) WFLYMETRICS0001: Activating Base Metrics Subsystem
[0m[0m15:38:04,409 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 62) WFLYJSF0007: Activated the following Jakarta Server Faces Implementations: [main]
[0m[0m15:38:04,413 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-8) WFLYUT0003: Undertow 2.2.24.SP1-redhat-00001 starting
[0m[0m15:38:04,512 INFO  [org.jboss.as.naming] (MSC service thread 1-6) WFLYNAM0003: Starting Naming Service
[0m[0m15:38:04,517 INFO  [org.jboss.as.connector] (MSC service thread 1-6) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 1.5.11.Final-redhat-00001)
[0m[0m15:38:04,518 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-5) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
[0m[0m15:38:05,128 INFO  [org.jboss.remoting] (MSC service thread 1-7) JBoss Remoting version 5.0.27.Final-redhat-00001
[0m[0m15:38:05,324 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 44) WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.OracleDriver (version 11.1)
[0m[0m15:38:05,519 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0018: Started Driver service with driver-name = oracle
[0m[0m15:38:05,628 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 75) WFLYUT0014: Creating file handler for path '/opt/jboss/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
[0m[33m15:38:06,004 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-3) WFLYELY00023: KeyStore file '/opt/jboss/standalone/configuration/application.keystore' does not exist. Used blank.
[0m[0m15:38:06,013 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-8) WFLYUT0012: Started server default-server.
[0m[0m15:38:06,115 INFO  [org.jboss.as.ejb3] (MSC service thread 1-7) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 512 (per class), which is derived from thread worker pool sizing.
[0m[33m15:38:06,115 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-7) WFLYELY01084: KeyStore /opt/jboss/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self-signed certificate for host localhost
[0m[0m15:38:06,119 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 128 (per class), which is derived from the number of CPUs on this host.
[0m[0m15:38:06,120 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) Queuing requests.
[0m[0m15:38:06,120 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0018: Host default-host starting
[0m[0m15:38:06,423 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: Undertow AJP listener ajp listening on 0.0.0.0:8009
[0m[0m15:38:06,512 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-7) WFLYUT0006: Undertow HTTP listener default listening on 0.0.0.0:8080
[0m[0m15:38:06,804 INFO  [org.jboss.as.patching] (MSC service thread 1-3) WFLYPAT0050: JBoss EAP cumulative patch ID is: base, one-off patches include: none
[0m[33m15:38:07,006 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-2) WFLYDM0111: Keystore /opt/jboss/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self signed certificate for host localhost
[0m[0m15:38:07,010 INFO  [org.jboss.as.ejb3] (MSC service thread 1-7) WFLYEJB0493: Jakarta Enterprise Beans subsystem suspension complete
[0m[0m15:38:07,105 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-3) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/jboss/standalone/deployments
[0m[0m15:38:07,407 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0027: Starting deployment of "siabm-autenticacao-api.war" (runtime-name: "siabm-autenticacao-api.war")
[0m[0m15:38:07,410 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) WFLYUT0006: Undertow HTTPS listener https listening on 0.0.0.0:8443
[0m[0m15:38:07,515 INFO  [org.wildfly.iiop.openjdk] (MSC service thread 1-6) WFLYIIOP0009: CORBA ORB Service started
[0m[0m15:38:07,811 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0001: Bound data source [java:jboss/jdbc/SIABM04]
[0m[0m15:38:08,008 INFO  [org.jboss.ws.common.management] (MSC service thread 1-5) JBWS022052: Starting JBossWS 5.4.8.Final-redhat-00001 (Apache CXF 3.4.10.redhat-00001) 
[0m[33m15:38:17,631 WARN  [org.jboss.weld.deployer] (MSC service thread 1-3) WFLYWELD0012: Warning while parsing vfs:/content/siabm-autenticacao-api.war/WEB-INF/classes/META-INF/beans.xml:4 cvc-complex-type.3.2.2: Attribute 'bean-discovery-mode' is not allowed to appear in element 'beans'.
[0m[33m15:38:17,632 WARN  [org.jboss.weld.deployer] (MSC service thread 1-3) WFLYWELD0012: Warning while parsing vfs:/content/siabm-autenticacao-api.war/WEB-INF/classes/META-INF/beans.xml:4 cvc-complex-type.3.2.2: Attribute 'version' is not allowed to appear in element 'beans'.
[0m[0m15:38:17,708 INFO  [org.jboss.as.jpa] (MSC service thread 1-3) WFLYJPA0002: Read persistence.xml for SIABM04_DESENV
[0m[0m15:38:18,119 INFO  [org.jipijapa] (MSC service thread 1-4) JIPIORMV53020253: Second level cache enabled for siabm-autenticacao-api.war#SIABM04_DESENV
[0m[33m15:38:18,906 WARN  [org.jgroups.protocols.UDP] (ServerService Thread Pool -- 79) JGRP000015: the send buffer of socket ManagedMulticastSocketBinding was set to 1.00MB, but the OS only allocated 212.99KB
[0m[33m15:38:18,907 WARN  [org.jgroups.protocols.UDP] (ServerService Thread Pool -- 79) JGRP000015: the receive buffer of socket ManagedMulticastSocketBinding was set to 20.00MB, but the OS only allocated 212.99KB
[0m[33m15:38:18,907 WARN  [org.jgroups.protocols.UDP] (ServerService Thread Pool -- 79) JGRP000015: the send buffer of socket ManagedMulticastSocketBinding was set to 1.00MB, but the OS only allocated 212.99KB
[0m[33m15:38:18,907 WARN  [org.jgroups.protocols.UDP] (ServerService Thread Pool -- 79) JGRP000015: the receive buffer of socket ManagedMulticastSocketBinding was set to 25.00MB, but the OS only allocated 212.99KB
[0m[0m15:38:19,032 INFO  [org.jboss.weld.deployer] (MSC service thread 1-2) WFLYWELD0003: Processing weld deployment siabm-autenticacao-api.war
[0m[0m15:38:19,317 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-2) HV000001: Hibernate Validator 6.0.23.Final-redhat-00001
[0m[0m15:38:19,509 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'SituacaoCpfServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/SituacaoCpfServiceImpl!br.gov.caixa.autenticacao.mtx.services.SituacaoCpfService
	java:app/siabm-autenticacao-api/SituacaoCpfServiceImpl!br.gov.caixa.autenticacao.mtx.services.SituacaoCpfService
	java:module/SituacaoCpfServiceImpl!br.gov.caixa.autenticacao.mtx.services.SituacaoCpfService
	java:global/siabm-autenticacao-api/SituacaoCpfServiceImpl
	java:app/siabm-autenticacao-api/SituacaoCpfServiceImpl
	java:module/SituacaoCpfServiceImpl

[0m[0m15:38:19,510 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TokenHelper' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/TokenHelper!br.gov.caixa.autenticacao.mtx.helpers.TokenHelper
	java:app/siabm-autenticacao-api/TokenHelper!br.gov.caixa.autenticacao.mtx.helpers.TokenHelper
	java:module/TokenHelper!br.gov.caixa.autenticacao.mtx.helpers.TokenHelper
	java:global/siabm-autenticacao-api/TokenHelper
	java:app/siabm-autenticacao-api/TokenHelper
	java:module/TokenHelper

[0m[0m15:38:19,510 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'SIICOClient' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/SIICOClient!br.gov.caixa.autenticacao.siico.client.SIICOClient
	java:app/siabm-autenticacao-api/SIICOClient!br.gov.caixa.autenticacao.siico.client.SIICOClient
	java:module/SIICOClient!br.gov.caixa.autenticacao.siico.client.SIICOClient
	java:global/siabm-autenticacao-api/SIICOClient
	java:app/siabm-autenticacao-api/SIICOClient
	java:module/SIICOClient

[0m[0m15:38:19,511 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TokenManagerSSO' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/TokenManagerSSO!br.gov.caixa.common.token.TokenManagerSSO
	java:app/siabm-autenticacao-api/TokenManagerSSO!br.gov.caixa.common.token.TokenManagerSSO
	java:module/TokenManagerSSO!br.gov.caixa.common.token.TokenManagerSSO
	java:global/siabm-autenticacao-api/TokenManagerSSO
	java:app/siabm-autenticacao-api/TokenManagerSSO
	java:module/TokenManagerSSO

[0m[0m15:38:19,511 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PessoaBiometriaDedoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/PessoaBiometriaDedoServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaBiometriaDedoService
	java:app/siabm-autenticacao-api/PessoaBiometriaDedoServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaBiometriaDedoService
	java:module/PessoaBiometriaDedoServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaBiometriaDedoService
	java:global/siabm-autenticacao-api/PessoaBiometriaDedoServiceImpl
	java:app/siabm-autenticacao-api/PessoaBiometriaDedoServiceImpl
	java:module/PessoaBiometriaDedoServiceImpl

[0m[0m15:38:19,511 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'CanalOrigemServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/CanalOrigemServiceImpl!br.gov.caixa.autenticacao.mtx.services.CanalOrigemService
	java:app/siabm-autenticacao-api/CanalOrigemServiceImpl!br.gov.caixa.autenticacao.mtx.services.CanalOrigemService
	java:module/CanalOrigemServiceImpl!br.gov.caixa.autenticacao.mtx.services.CanalOrigemService
	java:global/siabm-autenticacao-api/CanalOrigemServiceImpl
	java:app/siabm-autenticacao-api/CanalOrigemServiceImpl
	java:module/CanalOrigemServiceImpl

[0m[0m15:38:19,511 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'AutenticacaoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/AutenticacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoService
	java:app/siabm-autenticacao-api/AutenticacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoService
	java:module/AutenticacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoService
	java:global/siabm-autenticacao-api/AutenticacaoServiceImpl
	java:app/siabm-autenticacao-api/AutenticacaoServiceImpl
	java:module/AutenticacaoServiceImpl

[0m[0m15:38:19,511 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ConsultaAutenticacaoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/ConsultaAutenticacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ConsultaAutenticacaoService
	java:app/siabm-autenticacao-api/ConsultaAutenticacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ConsultaAutenticacaoService
	java:module/ConsultaAutenticacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ConsultaAutenticacaoService
	java:global/siabm-autenticacao-api/ConsultaAutenticacaoServiceImpl
	java:app/siabm-autenticacao-api/ConsultaAutenticacaoServiceImpl
	java:module/ConsultaAutenticacaoServiceImpl

[0m[0m15:38:19,511 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PessoaBiometriaServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/PessoaBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaBiometriaService
	java:app/siabm-autenticacao-api/PessoaBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaBiometriaService
	java:module/PessoaBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaBiometriaService
	java:global/siabm-autenticacao-api/PessoaBiometriaServiceImpl
	java:app/siabm-autenticacao-api/PessoaBiometriaServiceImpl
	java:module/PessoaBiometriaServiceImpl

[0m[0m15:38:19,511 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'RegistroTransacaoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/RegistroTransacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.RegistroTransacaoService
	java:app/siabm-autenticacao-api/RegistroTransacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.RegistroTransacaoService
	java:module/RegistroTransacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.RegistroTransacaoService
	java:global/siabm-autenticacao-api/RegistroTransacaoServiceImpl
	java:app/siabm-autenticacao-api/RegistroTransacaoServiceImpl
	java:module/RegistroTransacaoServiceImpl

[0m[0m15:38:19,511 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'AutenticacaoFacialNuvemImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/AutenticacaoFacialNuvemImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoFacialNuvemService
	java:app/siabm-autenticacao-api/AutenticacaoFacialNuvemImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoFacialNuvemService
	java:module/AutenticacaoFacialNuvemImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoFacialNuvemService
	java:global/siabm-autenticacao-api/AutenticacaoFacialNuvemImpl
	java:app/siabm-autenticacao-api/AutenticacaoFacialNuvemImpl
	java:module/AutenticacaoFacialNuvemImpl

[0m[0m15:38:19,512 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PreAutorizacaoAutenticacaoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/PreAutorizacaoAutenticacaoServiceImpl!br.gov.caixa.autenticacao.preautorizacao.services.PreAutorizacaoAutenticacaoService
	java:app/siabm-autenticacao-api/PreAutorizacaoAutenticacaoServiceImpl!br.gov.caixa.autenticacao.preautorizacao.services.PreAutorizacaoAutenticacaoService
	java:module/PreAutorizacaoAutenticacaoServiceImpl!br.gov.caixa.autenticacao.preautorizacao.services.PreAutorizacaoAutenticacaoService
	java:global/siabm-autenticacao-api/PreAutorizacaoAutenticacaoServiceImpl
	java:app/siabm-autenticacao-api/PreAutorizacaoAutenticacaoServiceImpl
	java:module/PreAutorizacaoAutenticacaoServiceImpl

[0m[0m15:38:19,512 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'HsmServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/HsmServiceImpl!br.gov.caixa.autenticacao.mtx.services.HsmService
	java:app/siabm-autenticacao-api/HsmServiceImpl!br.gov.caixa.autenticacao.mtx.services.HsmService
	java:module/HsmServiceImpl!br.gov.caixa.autenticacao.mtx.services.HsmService
	java:global/siabm-autenticacao-api/HsmServiceImpl
	java:app/siabm-autenticacao-api/HsmServiceImpl
	java:module/HsmServiceImpl

[0m[0m15:38:19,512 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'JcaCryptoService' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/JcaCryptoService!br.gov.caixa.autenticacao.mtx.services.CryptoService
	java:app/siabm-autenticacao-api/JcaCryptoService!br.gov.caixa.autenticacao.mtx.services.CryptoService
	java:module/JcaCryptoService!br.gov.caixa.autenticacao.mtx.services.CryptoService
	java:global/siabm-autenticacao-api/JcaCryptoService
	java:app/siabm-autenticacao-api/JcaCryptoService
	java:module/JcaCryptoService

[0m[0m15:38:19,512 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'CanalOrdemDedoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/CanalOrdemDedoServiceImpl!br.gov.caixa.autenticacao.mtx.services.CanalOrdemDedoService
	java:app/siabm-autenticacao-api/CanalOrdemDedoServiceImpl!br.gov.caixa.autenticacao.mtx.services.CanalOrdemDedoService
	java:module/CanalOrdemDedoServiceImpl!br.gov.caixa.autenticacao.mtx.services.CanalOrdemDedoService
	java:global/siabm-autenticacao-api/CanalOrdemDedoServiceImpl
	java:app/siabm-autenticacao-api/CanalOrdemDedoServiceImpl
	java:module/CanalOrdemDedoServiceImpl

[0m[0m15:38:19,512 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TimerTokenSSO' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/TimerTokenSSO!br.gov.caixa.common.token.TimerTokenSSO
	java:app/siabm-autenticacao-api/TimerTokenSSO!br.gov.caixa.common.token.TimerTokenSSO
	java:module/TimerTokenSSO!br.gov.caixa.common.token.TimerTokenSSO
	java:global/siabm-autenticacao-api/TimerTokenSSO
	java:app/siabm-autenticacao-api/TimerTokenSSO
	java:module/TimerTokenSSO

[0m[0m15:38:19,512 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'HistoricoOrdemTemplateServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/HistoricoOrdemTemplateServiceImpl!br.gov.caixa.autenticacao.mtx.services.HistoricoOrdemTemplateService
	java:app/siabm-autenticacao-api/HistoricoOrdemTemplateServiceImpl!br.gov.caixa.autenticacao.mtx.services.HistoricoOrdemTemplateService
	java:module/HistoricoOrdemTemplateServiceImpl!br.gov.caixa.autenticacao.mtx.services.HistoricoOrdemTemplateService
	java:global/siabm-autenticacao-api/HistoricoOrdemTemplateServiceImpl
	java:app/siabm-autenticacao-api/HistoricoOrdemTemplateServiceImpl
	java:module/HistoricoOrdemTemplateServiceImpl

[0m[0m15:38:19,512 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'InstituicaoExternaRepository' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/InstituicaoExternaRepository!br.gov.caixa.autenticacao.mtx.repositories.InstituicaoExternaRepository
	java:app/siabm-autenticacao-api/InstituicaoExternaRepository!br.gov.caixa.autenticacao.mtx.repositories.InstituicaoExternaRepository
	java:module/InstituicaoExternaRepository!br.gov.caixa.autenticacao.mtx.repositories.InstituicaoExternaRepository
	java:global/siabm-autenticacao-api/InstituicaoExternaRepository
	java:app/siabm-autenticacao-api/InstituicaoExternaRepository
	java:module/InstituicaoExternaRepository

[0m[0m15:38:19,512 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'MensagemSistemaServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/MensagemSistemaServiceImpl!br.gov.caixa.autenticacao.mtx.services.MensagemSistemaService
	java:app/siabm-autenticacao-api/MensagemSistemaServiceImpl!br.gov.caixa.autenticacao.mtx.services.MensagemSistemaService
	java:module/MensagemSistemaServiceImpl!br.gov.caixa.autenticacao.mtx.services.MensagemSistemaService
	java:global/siabm-autenticacao-api/MensagemSistemaServiceImpl
	java:app/siabm-autenticacao-api/MensagemSistemaServiceImpl
	java:module/MensagemSistemaServiceImpl

[0m[0m15:38:19,513 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PessoaTipoBiometriaServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/PessoaTipoBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaTipoBiometriaService
	java:app/siabm-autenticacao-api/PessoaTipoBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaTipoBiometriaService
	java:module/PessoaTipoBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.PessoaTipoBiometriaService
	java:global/siabm-autenticacao-api/PessoaTipoBiometriaServiceImpl
	java:app/siabm-autenticacao-api/PessoaTipoBiometriaServiceImpl
	java:module/PessoaTipoBiometriaServiceImpl

[0m[0m15:38:19,513 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'LogServicoCanalServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/LogServicoCanalServiceImpl!br.gov.caixa.autenticacao.mtx.services.LogServicoCanalService
	java:app/siabm-autenticacao-api/LogServicoCanalServiceImpl!br.gov.caixa.autenticacao.mtx.services.LogServicoCanalService
	java:module/LogServicoCanalServiceImpl!br.gov.caixa.autenticacao.mtx.services.LogServicoCanalService
	java:global/siabm-autenticacao-api/LogServicoCanalServiceImpl
	java:app/siabm-autenticacao-api/LogServicoCanalServiceImpl
	java:module/LogServicoCanalServiceImpl

[0m[0m15:38:19,513 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ParametroFuncionalCanalServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/ParametroFuncionalCanalServiceImpl!br.gov.caixa.autenticacao.mtx.services.ParametroFuncionalCanalService
	java:app/siabm-autenticacao-api/ParametroFuncionalCanalServiceImpl!br.gov.caixa.autenticacao.mtx.services.ParametroFuncionalCanalService
	java:module/ParametroFuncionalCanalServiceImpl!br.gov.caixa.autenticacao.mtx.services.ParametroFuncionalCanalService
	java:global/siabm-autenticacao-api/ParametroFuncionalCanalServiceImpl
	java:app/siabm-autenticacao-api/ParametroFuncionalCanalServiceImpl
	java:module/ParametroFuncionalCanalServiceImpl

[0m[0m15:38:19,513 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'OrdemScoreServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/OrdemScoreServiceImpl!br.gov.caixa.autenticacao.mtx.services.OrdemScoreService
	java:app/siabm-autenticacao-api/OrdemScoreServiceImpl!br.gov.caixa.autenticacao.mtx.services.OrdemScoreService
	java:module/OrdemScoreServiceImpl!br.gov.caixa.autenticacao.mtx.services.OrdemScoreService
	java:global/siabm-autenticacao-api/OrdemScoreServiceImpl
	java:app/siabm-autenticacao-api/OrdemScoreServiceImpl
	java:module/OrdemScoreServiceImpl

[0m[0m15:38:19,513 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ABISClient' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/ABISClient!br.gov.caixa.autenticacao.abis.client.ABISClient
	java:app/siabm-autenticacao-api/ABISClient!br.gov.caixa.autenticacao.abis.client.ABISClient
	java:module/ABISClient!br.gov.caixa.autenticacao.abis.client.ABISClient
	java:global/siabm-autenticacao-api/ABISClient
	java:app/siabm-autenticacao-api/ABISClient
	java:module/ABISClient

[0m[0m15:38:19,513 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ValidacaoNumeroClassificacaoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/ValidacaoNumeroClassificacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ValidacaoNumeroClassificacaoService
	java:app/siabm-autenticacao-api/ValidacaoNumeroClassificacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ValidacaoNumeroClassificacaoService
	java:module/ValidacaoNumeroClassificacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ValidacaoNumeroClassificacaoService
	java:global/siabm-autenticacao-api/ValidacaoNumeroClassificacaoServiceImpl
	java:app/siabm-autenticacao-api/ValidacaoNumeroClassificacaoServiceImpl
	java:module/ValidacaoNumeroClassificacaoServiceImpl

[0m[0m15:38:19,513 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'BiometriaFaceServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/BiometriaFaceServiceImpl!br.gov.caixa.autenticacao.mtx.services.BiometriaFaceService
	java:app/siabm-autenticacao-api/BiometriaFaceServiceImpl!br.gov.caixa.autenticacao.mtx.services.BiometriaFaceService
	java:module/BiometriaFaceServiceImpl!br.gov.caixa.autenticacao.mtx.services.BiometriaFaceService
	java:global/siabm-autenticacao-api/BiometriaFaceServiceImpl
	java:app/siabm-autenticacao-api/BiometriaFaceServiceImpl
	java:module/BiometriaFaceServiceImpl

[0m[0m15:38:19,513 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ControleTentativasServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/ControleTentativasServiceImpl!br.gov.caixa.autenticacao.mtx.services.ControleTentativasService
	java:app/siabm-autenticacao-api/ControleTentativasServiceImpl!br.gov.caixa.autenticacao.mtx.services.ControleTentativasService
	java:module/ControleTentativasServiceImpl!br.gov.caixa.autenticacao.mtx.services.ControleTentativasService
	java:global/siabm-autenticacao-api/ControleTentativasServiceImpl
	java:app/siabm-autenticacao-api/ControleTentativasServiceImpl
	java:module/ControleTentativasServiceImpl

[0m[0m15:38:19,513 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'InstituicaoExternaServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/InstituicaoExternaServiceImpl!br.gov.caixa.autenticacao.mtx.services.InstituicaoExternaService
	java:app/siabm-autenticacao-api/InstituicaoExternaServiceImpl!br.gov.caixa.autenticacao.mtx.services.InstituicaoExternaService
	java:module/InstituicaoExternaServiceImpl!br.gov.caixa.autenticacao.mtx.services.InstituicaoExternaService
	java:global/siabm-autenticacao-api/InstituicaoExternaServiceImpl
	java:app/siabm-autenticacao-api/InstituicaoExternaServiceImpl
	java:module/InstituicaoExternaServiceImpl

[0m[0m15:38:19,514 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'AutenticacaoFacialImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/AutenticacaoFacialImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoFacialService
	java:app/siabm-autenticacao-api/AutenticacaoFacialImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoFacialService
	java:module/AutenticacaoFacialImpl!br.gov.caixa.autenticacao.mtx.services.AutenticacaoFacialService
	java:global/siabm-autenticacao-api/AutenticacaoFacialImpl
	java:app/siabm-autenticacao-api/AutenticacaoFacialImpl
	java:module/AutenticacaoFacialImpl

[0m[0m15:38:19,514 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TimerTokenT4SSO' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/TimerTokenT4SSO!br.gov.caixa.autenticacao.abis.token.TimerTokenT4SSO
	java:app/siabm-autenticacao-api/TimerTokenT4SSO!br.gov.caixa.autenticacao.abis.token.TimerTokenT4SSO
	java:module/TimerTokenT4SSO!br.gov.caixa.autenticacao.abis.token.TimerTokenT4SSO
	java:global/siabm-autenticacao-api/TimerTokenT4SSO
	java:app/siabm-autenticacao-api/TimerTokenT4SSO
	java:module/TimerTokenT4SSO

[0m[0m15:38:19,514 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'RequisicaoTransacaoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/RequisicaoTransacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.RequisicaoTransacaoService
	java:app/siabm-autenticacao-api/RequisicaoTransacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.RequisicaoTransacaoService
	java:module/RequisicaoTransacaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.RequisicaoTransacaoService
	java:global/siabm-autenticacao-api/RequisicaoTransacaoServiceImpl
	java:app/siabm-autenticacao-api/RequisicaoTransacaoServiceImpl
	java:module/RequisicaoTransacaoServiceImpl

[0m[0m15:38:19,514 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PermissaoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/PermissaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.AutorizacaoService
	java:app/siabm-autenticacao-api/PermissaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.AutorizacaoService
	java:module/PermissaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.AutorizacaoService
	java:global/siabm-autenticacao-api/PermissaoServiceImpl
	java:app/siabm-autenticacao-api/PermissaoServiceImpl
	java:module/PermissaoServiceImpl

[0m[0m15:38:19,514 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TokenManagerT4SSO' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/TokenManagerT4SSO!br.gov.caixa.autenticacao.abis.token.TokenManagerT4SSO
	java:app/siabm-autenticacao-api/TokenManagerT4SSO!br.gov.caixa.autenticacao.abis.token.TokenManagerT4SSO
	java:module/TokenManagerT4SSO!br.gov.caixa.autenticacao.abis.token.TokenManagerT4SSO
	java:global/siabm-autenticacao-api/TokenManagerT4SSO
	java:app/siabm-autenticacao-api/TokenManagerT4SSO
	java:module/TokenManagerT4SSO

[0m[0m15:38:19,514 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ParametroCanalBiometriaServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/ParametroCanalBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.ParametroCanalBiometriaService
	java:app/siabm-autenticacao-api/ParametroCanalBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.ParametroCanalBiometriaService
	java:module/ParametroCanalBiometriaServiceImpl!br.gov.caixa.autenticacao.mtx.services.ParametroCanalBiometriaService
	java:global/siabm-autenticacao-api/ParametroCanalBiometriaServiceImpl
	java:app/siabm-autenticacao-api/ParametroCanalBiometriaServiceImpl
	java:module/ParametroCanalBiometriaServiceImpl

[0m[0m15:38:19,514 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ValidacaoOperacaoSemCartaoServiceImpl' in deployment unit 'deployment "siabm-autenticacao-api.war"' are as follows:

	java:global/siabm-autenticacao-api/ValidacaoOperacaoSemCartaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ValidacaoOperacaoSemCartaoService
	java:app/siabm-autenticacao-api/ValidacaoOperacaoSemCartaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ValidacaoOperacaoSemCartaoService
	java:module/ValidacaoOperacaoSemCartaoServiceImpl!br.gov.caixa.autenticacao.mtx.services.ValidacaoOperacaoSemCartaoService
	java:global/siabm-autenticacao-api/ValidacaoOperacaoSemCartaoServiceImpl
	java:app/siabm-autenticacao-api/ValidacaoOperacaoSemCartaoServiceImpl
	java:module/ValidacaoOperacaoSemCartaoServiceImpl

[0m[33m15:38:20,105 WARN  [org.jboss.as.ejb3] (MSC service thread 1-3) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.autenticacao.preautorizacao.services.impl.PreAutorizacaoAutenticacaoServiceImpl should not have a final or static method (toEntity)
[0m[0m15:38:20,515 INFO  [org.jipijapa] (MSC service thread 1-3) JIPIORMV53020253: Second level cache enabled for siabm-autenticacao-api.war#SIABM04_DESENV
[0m[33m15:38:20,713 WARN  [org.jboss.as.jaxrs] (MSC service thread 1-3) WFLYRS0018: Explicit usage of Jackson annotation in a Jakarta RESTful Web Services deployment; the system will disable Jakarta JSON Binding processing for the current deployment. Consider setting the 'resteasy.preferJacksonOverJsonB' property to 'false' to restore Jakarta JSON Binding.
[0m[0m15:38:20,815 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.OracleDriver (version 11.1)
[0m[0m15:38:21,011 INFO  [org.jboss.weld.Version] (MSC service thread 1-3) WELD-000900: 3.1.6 (redhat)
[0m[0m15:38:21,306 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0018: Started Driver service with driver-name = siabm-autenticacao-api.war_oracle.jdbc.OracleDriver_11_1
[0m[0m15:38:21,918 INFO  [org.jgroups.protocols.pbcast.GMS] (ServerService Thread Pool -- 79) siabm-autenticacao-api-sandbox-des-13-rg72f: no members discovered after 3005 ms: creating cluster as coordinator
[0m[0m15:38:23,425 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 81) ISPN000128: Infinispan version: Infinispan 'Corona Extra' 11.0.17.Final-redhat-00001
[0m[0m15:38:23,616 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 81) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
[0m[0m15:38:23,636 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 79) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
[0m[0m15:38:23,636 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 82) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.marshalling.jboss.JBossMarshaller'
[0m[0m15:38:23,636 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 80) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
[0m[0m15:38:23,929 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 80) ISPN000078: Starting JGroups channel ejb
[0m[0m15:38:23,929 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 82) ISPN000078: Starting JGroups channel ejb
[0m[0m15:38:23,929 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 79) ISPN000078: Starting JGroups channel ejb
[0m[0m15:38:23,929 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 81) ISPN000078: Starting JGroups channel ejb
[0m[0m15:38:23,933 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 82) ISPN000094: Received new cluster view for channel ejb: [siabm-autenticacao-api-sandbox-des-13-rg72f|0] (1) [siabm-autenticacao-api-sandbox-des-13-rg72f]
[0m[0m15:38:23,933 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 79) ISPN000094: Received new cluster view for channel ejb: [siabm-autenticacao-api-sandbox-des-13-rg72f|0] (1) [siabm-autenticacao-api-sandbox-des-13-rg72f]
[0m[0m15:38:23,933 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 80) ISPN000094: Received new cluster view for channel ejb: [siabm-autenticacao-api-sandbox-des-13-rg72f|0] (1) [siabm-autenticacao-api-sandbox-des-13-rg72f]
[0m[0m15:38:23,933 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 81) ISPN000094: Received new cluster view for channel ejb: [siabm-autenticacao-api-sandbox-des-13-rg72f|0] (1) [siabm-autenticacao-api-sandbox-des-13-rg72f]
[0m[0m15:38:24,009 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 79) ISPN000079: Channel ejb local address is siabm-autenticacao-api-sandbox-des-13-rg72f, physical addresses are [127.0.0.1:55200]
[0m[0m15:38:24,009 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 80) ISPN000079: Channel ejb local address is siabm-autenticacao-api-sandbox-des-13-rg72f, physical addresses are [127.0.0.1:55200]
[0m[0m15:38:24,009 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 82) ISPN000079: Channel ejb local address is siabm-autenticacao-api-sandbox-des-13-rg72f, physical addresses are [127.0.0.1:55200]
[0m[0m15:38:24,009 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 81) ISPN000079: Channel ejb local address is siabm-autenticacao-api-sandbox-des-13-rg72f, physical addresses are [127.0.0.1:55200]
[0m[0m15:38:24,107 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 81) WFLYJPA0010: Starting Persistence Unit (phase 1 of 2) Service 'siabm-autenticacao-api.war#SIABM04_DESENV'
[0m[0m15:38:24,115 INFO  [org.infinispan.CONFIG] (MSC service thread 1-6) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
[0m[0m15:38:24,116 INFO  [org.infinispan.CONFIG] (MSC service thread 1-6) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
[0m[0m15:38:24,130 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 81) HHH000204: Processing PersistenceUnitInfo [
	name: SIABM04_DESENV
	...]
[0m[0m15:38:24,415 INFO  [org.hibernate.Version] (ServerService Thread Pool -- 81) HHH000412: Hibernate Core {5.3.29.Final-redhat-00001}
[0m[0m15:38:24,416 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 81) HHH000206: hibernate.properties not found
[0m[0m15:38:24,815 INFO  [org.hibernate.annotations.common.Version] (ServerService Thread Pool -- 81) HCANN000001: Hibernate Commons Annotations {5.0.5.Final-redhat-00002}
[0m[0m15:38:24,937 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 82) WFLYCLINF0002: Started http-remoting-connector cache from ejb container
[0m[0m15:38:25,427 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 81) WFLYJPA0010: Starting Persistence Unit (phase 2 of 2) Service 'siabm-autenticacao-api.war#SIABM04_DESENV'
[0m[0m15:38:27,218 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 81) HHH000400: Using dialect: org.hibernate.dialect.Oracle10gDialect
[0m[0m15:38:27,737 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 81) Envers integration enabled? : true
[0m[0m15:38:28,421 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-09 15:38:28.421 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
[0m[0m15:38:28,421 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-09 15:38:28.421 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 0 seconds (+/-10%)
[0m[0m15:38:30,462 INFO  [org.hibernate.hql.internal.QueryTranslatorFactoryInitiator] (ServerService Thread Pool -- 81) HHH000397: Using ASTQueryTranslatorFactory
[0m[33m15:38:33,846 WARN  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 81) RESTEASY002150: resteasy.scan is no longer supported.  Use a servlet 3.0 container and the ResteasyServletInitializer
[0m[0m15:38:34,916 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 81) WFLYUT0021: Registered web context: '/siabm-autenticacao-api' for server 'default-server'
[0m[0m15:38:35,211 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 45) WFLYSRV0010: Deployed "siabm-autenticacao-api.war" (runtime-name : "siabm-autenticacao-api.war")
[0m[0m15:38:35,508 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
[0m[0m15:38:35,605 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) started in 40799ms - Started 1096 of 1317 services (454 services are lazy, passive or on-demand)
[0m[0m15:38:35,611 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://127.0.0.1:9990/management
[0m[0m15:38:35,611 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: Admin console listening on http://127.0.0.1:9990
[0m[0m15:38:36,841 INFO  [br.gov.caixa.siabm.autenticacao.mtx] (EJB default - 3) [requestNewTokenT4] Nova data de expira??o do token: 2026-07-09T15:43:06.838
[0m[0m15:38:36,842 INFO  [br.gov.caixa.common] (EJB default - 4) [requestNewToken] Nova data de expira??o do token: 2026-07-09T15:43:06.842
[0m[0m15:38:58,390 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-09 15:38:58.390 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
[0m[0m15:38:58,390 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-09 15:38:58.390 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 1 seconds (+/-10%)
[0m[0m15:39:28,393 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-09 15:39:28.393 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
[0m[0m15:39:28,393 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-09 15:39:28.393 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 4 seconds (+/-10%)
[0m[0m15:39:58,397 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-09 15:39:58.396 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
[0m[0m15:39:58,397 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-09 15:39:58.397 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 9 seconds (+/-10%)
[0m[0m15:40:28,387 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-09 15:40:28.387 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
[0m[0m15:40:28,387 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-09 15:40:28.387 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 16 seconds (+/-10%)
[0m[0m15:40:58,393 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-09 15:40:58.393 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
[0m[0m15:40:58,393 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-09 15:40:58.393 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 25 seconds (+/-10%)
[0m[0m15:41:28,392 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-09 15:41:28.392 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
[0m[0m15:41:28,393 INFO  [stdout] (elastic-apm-server-reporter) 2026-07-09 15:41:28.393 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 36 seconds (+/-10%)
[0m







