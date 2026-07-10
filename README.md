deu certo

agora due esse erro no pod


/opt/jboss/bin/standalone.conf: line 43: =org.jboss.byteman: command not found
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/lib/jvm/jre-17-openjdk-17.0.7.0.7-3.el8.x86_64/bin/java

  JAVA_OPTS:  -Xlog:gc*:file="/opt/jboss/standalone/log/gc.log":time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter="maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000" -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=2048m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs= -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -Xbootclasspath/a:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar:/opt/jboss/modules/system/layers/base/org/jboss/log4j/logmanager/main/log4j-jboss-logmanager-1.2.0.Final-redhat-00001.jar:/opt/jboss/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dsun.util.logging.disableCallerCheck=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sisam -Delastic.apm.environment=TQS -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=https://apm-server-devops.apps.produtos4.caixa/ -Delastic.apm.global_labels=deployment=sisam-backend-internet-tqs -Djava.net.useSystemProxies=false -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=localhost\|127.0.0.1\|*.caixa  --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED

=========================================================================

Jul 10, 2026 3:13:37 PM java.lang.System$LoggerFinder lambda$accessProvider$0
WARNING: Failed to instantiate LoggerFinder provider; Using default.
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-10 15:13:38.308 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
[0m15:13:39,201 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.2.Final-redhat-00001
[0m[0m15:13:39,607 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.12.Final-redhat-00001
[0m[0m15:13:39,615 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
[0m[0m15:13:39,824 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 7.4.0.GA (WildFly Core 15.0.2.Final-redhat-00001) starting
[0m[0m15:13:39,981 INFO  [org.jboss.vfs] (MSC service thread 1-2) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
[0m[0m15:13:41,411 INFO  [org.wildfly.security] (ServerService Thread Pool -- 29) ELY00001: WildFly Elytron version 1.15.3.Final-redhat-00001
[0m[0m15:13:43,205 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 18) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/fb/62f492ef5e47aa9eaefd43bfe8c4c4902dca5e/content
[0m[0m15:13:43,504 INFO  [org.jboss.security] (Controller Boot Thread) PBOX00361: Default Security Vault Implementation Initialized and Ready
[0m[31m15:13:43,504 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("add") failed - address: ([("core-service" => "vault")]) - failure description: "WFLYCTL0211: Cannot resolve expression '${VAULT::SISAM-BACKEND-INTERNET-DES::KEYCLOAK_CREDENTIALS_SIECM_SECRET::1}'"
[0m[31m15:13:43,508 FATAL [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0056: Server boot has failed in an unrecoverable manner; exiting. See previous messages for details.
[0m[0m15:13:43,584 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0050: JBoss EAP 7.4.0.GA (WildFly Core 15.0.2.Final-redhat-00001) stopped in 73ms
[0m
