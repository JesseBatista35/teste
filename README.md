dei um start roulout aqui so para perganmos o iniico sda subida do pod. segue log

=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/lib/jvm/java-11-openjdk-11.0.19.0.7-1.el7_9.x86_64/bin/java

  JAVA_OPTS:  -Xlog:gc*:file="/opt/jboss/standalone/log/gc.log":time,uptimemillis:filecount=5,filesize=3M -Xms512m -Xmx1024m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar:/opt/jboss/modules/system/layers/base/org/jboss/log4j/logmanager/main/log4j-jboss-logmanager-1.2.0.Final-redhat-00001.jar:/opt/jboss/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dsun.util.logging.disableCallerCheck=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=siali -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=siali-des  --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED

=========================================================================

Sep 09, 2026 9:25:27 AM java.lang.System$LoggerFinder lambda$accessProvider$0
WARNING: Failed to instantiate LoggerFinder provider; Using default.
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-09 09:25:27.669 [main] INFO co.elastic.apm.agent.util.JmxUtils - Found JVM-specific OperatingSystemMXBean interface: com.sun.management.OperatingSystemMXBean
2026-09-09 09:25:27.705 [main] INFO co.elastic.apm.agent.configuration.StartupInfo - Starting Elastic APM 1.15.0 as siali on Java 11.0.19 (Red Hat, Inc.) Linux 6.1.18-200.fc37.x86_64
2026-09-09 09:25:27.711 [main] INFO co.elastic.apm.agent.impl.ElasticApmTracer - Tracer switched to RUNNING state
[0m09:25:28,578 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.0.Final-redhat-00001
[0m[0m09:25:29,126 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.12.Final-redhat-00001
[0m[0m09:25:29,164 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
[0m[0m09:25:29,332 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) starting
[0m[0m09:25:29,479 INFO  [org.jboss.vfs] (MSC service thread 1-3) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
[0mWARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.wildfly.extension.elytron.SSLDefinitions (jar:file:/opt/jboss/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.11.CP/org/wildfly/extension/elytron/main/wildfly-elytron-integration-15.0.26.Final-redhat-00001.jar!/) to method com.sun.net.ssl.internal.ssl.Provider.isFIPS()
WARNING: Please consider reporting this to the maintainers of org.wildfly.extension.elytron.SSLDefinitions
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
[0m09:25:31,328 INFO  [org.wildfly.security] (ServerService Thread Pool -- 29) ELY00001: WildFly Elytron version 1.15.16.Final-redhat-00001
[0m[0m09:25:31,903 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 18) WFLYCTL0033: Extension 'security' is deprecated and may not be supported in future versions
[0m[0m09:25:32,238 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m09:25:32,292 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 29) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m09:25:32,553 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 12) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/a9/c40659fd15a3941f5f53b88ab02fa75ea39ec4/content
[0m[0m09:25:32,603 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
[0m[33m09:25:32,638 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 70) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
[0m[0m09:25:32,640 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 50) WFLYHEALTH0001: Activating Base Health Subsystem
[0m[0m09:25:32,643 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 51) WFLYCLINF0001: Activating Infinispan subsystem.
[0m[0m09:25:32,644 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 62) WFLYNAM0001: Activating Naming Subsystem
[0m[31m09:25:32,644 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-3) MSC000001: Failed to start service org.wildfly.security.http-server-mechanism-factory."siali.war": org.jboss.msc.service.StartException in service org.wildfly.security.http-server-mechanism-factory."siali.war": Failed to start service
	at org.jboss.msc@1.4.12.Final-redhat-00001//org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1731)
	at org.jboss.msc@1.4.12.Final-redhat-00001//org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1559)
	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1363)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.util.ConcurrentModificationException
	at java.base/java.util.LinkedHashMap$LinkedHashIterator.nextNode(LinkedHashMap.java:719)
	at java.base/java.util.LinkedHashMap$LinkedEntryIterator.next(LinkedHashMap.java:751)
	at java.base/java.util.LinkedHashMap$LinkedEntryIterator.next(LinkedHashMap.java:749)
	at org.jboss.dmr@1.5.1.Final-redhat-00001//org.jboss.dmr.ObjectModelValue.asPropertyList(ObjectModelValue.java:161)
	at org.jboss.dmr@1.5.1.Final-redhat-00001//org.jboss.dmr.ModelNode.asPropertyList(ModelNode.java:529)
	at org.keycloak.keycloak-wildfly-subsystem@9.0.3.redhat-00002//org.keycloak.subsystem.adapter.extension.KeycloakAdapterConfigService.setJSONValues(KeycloakAdapterConfigService.java:280)
	at org.keycloak.keycloak-wildfly-subsystem@9.0.3.redhat-00002//org.keycloak.subsystem.adapter.extension.KeycloakAdapterConfigService.getJSON(KeycloakAdapterConfigService.java:274)
	at org.keycloak.keycloak-wildfly-subsystem@9.0.3.redhat-00002//org.keycloak.subsystem.adapter.extension.KeycloakHttpAuthenticationFactoryService.start(KeycloakHttpAuthenticationFactoryService.java:50)
	at org.jboss.msc@1.4.12.Final-redhat-00001//org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1739)
	at org.jboss.msc@1.4.12.Final-redhat-00001//org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1701)
	... 6 more

[0m[0m09:25:32,690 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 68) WFLYSEC0002: Activating Security Subsystem
[0m[0m09:25:32,692 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 72) WFLYWS0002: Activating WebServices Extension
[0m[0m09:25:32,694 INFO  [stdout] (elastic-apm-server-healthcheck) 2026-09-09 09:25:32.691 [elastic-apm-server-healthcheck] WARN co.elastic.apm.agent.report.ApmServerHealthChecker - Elastic APM server http://apm-server-devops.produtos.caixa/ is not available (connect timed out)
[0m[0m09:25:32,697 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 61) WFLYMETRICS0001: Activating Base Metrics Subsystem
[0m[0m09:25:32,697 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 58) WFLYJSF0007: Activated the following Jakarta Server Faces Implementations: [main]
[0m[0m09:25:32,698 INFO  [org.jboss.as.security] (MSC service thread 1-4) WFLYSEC0001: Current PicketBox version=5.0.3.Final-redhat-00009
[0m[0m09:25:32,707 INFO  [org.xnio] (MSC service thread 1-2) XNIO version 3.8.9.Final-redhat-00001
[0m[0m09:25:32,803 INFO  [org.xnio.nio] (MSC service thread 1-2) XNIO NIO Implementation Version 3.8.9.Final-redhat-00001
[0m[0m09:25:32,809 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 52) WFLYIO001: Worker 'default' has auto-configured to 4 IO threads with 32 max task threads based on your 2 available processors
[0m[0m09:25:32,884 INFO  [org.jboss.as.connector] (MSC service thread 1-1) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 1.5.11.Final-redhat-00001)
[0m[0m09:25:32,893 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 42) WFLYJCA0004: Deploying JDBC-compliant driver class org.h2.Driver (version 1.4)
[0m[0m09:25:32,989 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 53) WFLYRS0016: RESTEasy version 3.15.7.Final-redhat-00001
[0m[0m09:25:32,997 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0003: Undertow 2.2.24.SP1-redhat-00001 starting
[0m[0m09:25:33,003 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-4) WFLYJCA0018: Started Driver service with driver-name = h2
[0m[0m09:25:33,004 INFO  [org.jboss.as.naming] (MSC service thread 1-4) WFLYNAM0003: Starting Naming Service
[0m[0m09:25:33,010 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-1) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
[0m[0m09:25:33,020 INFO  [org.jboss.remoting] (MSC service thread 1-2) JBoss Remoting version 5.0.27.Final-redhat-00001
[0m[0m09:25:33,091 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 32 (per class), which is derived from thread worker pool sizing.
[0m[0m09:25:33,091 INFO  [org.jboss.as.ejb3] (MSC service thread 1-3) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 8 (per class), which is derived from the number of CPUs on this host.
[0m[0m09:25:33,096 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 42) WFLYJCA0005: Deploying non-JDBC-compliant driver class org.postgresql.Driver (version 42.2)
[0m[0m09:25:33,201 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 71) WFLYUT0014: Creating file handler for path '/opt/jboss/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
[0m[33m09:25:33,208 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-3) WFLYELY00023: KeyStore file '/opt/jboss/standalone/configuration/application.keystore' does not exist. Used blank.
[0m[0m09:25:33,218 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0018: Started Driver service with driver-name = postgresql
[0m[33m09:25:33,223 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-4) WFLYELY01084: KeyStore /opt/jboss/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self-signed certificate for host localhost
[0m[0m09:25:33,334 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0012: Started server default-server.
[0m[0m09:25:33,389 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-4) WFLYJCA0098: Bound non-transactional data source: java:jboss/datasources/siali-ds
[0m[0m09:25:33,389 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0098: Bound non-transactional data source: java:jboss/datasources/siico-ds
[0m[0m09:25:33,389 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) Queuing requests.
[0m[0m09:25:33,390 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0018: Host default-host starting
[0m[0m09:25:33,426 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0006: Undertow HTTP listener default listening on 0.0.0.0:8080
[0m[0m09:25:33,426 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: Undertow AJP listener ajp listening on 0.0.0.0:8009
[0m[0m09:25:33,458 INFO  [org.jboss.as.ejb3] (MSC service thread 1-3) WFLYEJB0493: Jakarta Enterprise Beans subsystem suspension complete
[0m[0m09:25:33,497 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-4) WFLYJCA0001: Bound data source [java:jboss/datasources/ExampleDS]
[0m[0m09:25:33,498 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-3) WFLYJCA0001: Bound data source [java:jboss/datasources/siali-jpa-ds]
[0m[0m09:25:33,800 INFO  [org.jboss.as.patching] (MSC service thread 1-1) WFLYPAT0050: JBoss EAP cumulative patch ID is: base, one-off patches include: none
[0m[33m09:25:33,827 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-2) WFLYDM0111: Keystore /opt/jboss/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self signed certificate for host localhost
[0m[0m09:25:33,829 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-2) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/jboss/standalone/deployments
[0m[0m09:25:33,836 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0027: Starting deployment of "siali.war" (runtime-name: "siali.war")
[0m[0m09:25:33,849 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0006: Undertow HTTPS listener https listening on 0.0.0.0:8443
[0m[0m09:25:34,050 INFO  [org.jboss.ws.common.management] (MSC service thread 1-1) JBWS022052: Starting JBossWS 5.4.8.Final-redhat-00001 (Apache CXF 3.4.10.redhat-00001) 
[0m[0m09:25:37,715 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-09-09 09:25:37.714 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - connect timed out
[0m[33m09:25:38,054 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry jms.jar in /content/siali.war/WEB-INF/lib/com.ibm.mq.allclient-9.3.3.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m09:25:38,055 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry fscontext.jar in /content/siali.war/WEB-INF/lib/com.ibm.mq.allclient-9.3.3.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m09:25:38,055 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry providerutil.jar in /content/siali.war/WEB-INF/lib/com.ibm.mq.allclient-9.3.3.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m09:25:38,055 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry bcpkix-jdk15to18.jar in /content/siali.war/WEB-INF/lib/com.ibm.mq.allclient-9.3.3.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m09:25:38,055 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry bcprov-jdk15to18.jar in /content/siali.war/WEB-INF/lib/com.ibm.mq.allclient-9.3.3.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m09:25:38,055 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry bcutil-jdk15to18.jar in /content/siali.war/WEB-INF/lib/com.ibm.mq.allclient-9.3.3.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m09:25:38,056 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry org.json.jar in /content/siali.war/WEB-INF/lib/com.ibm.mq.allclient-9.3.3.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m09:25:38,056 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry jackson-annotations.jar in /content/siali.war/WEB-INF/lib/com.ibm.mq.allclient-9.3.3.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m09:25:38,056 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry jackson-core.jar in /content/siali.war/WEB-INF/lib/com.ibm.mq.allclient-9.3.3.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m09:25:38,056 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry jackson-databind.jar in /content/siali.war/WEB-INF/lib/com.ibm.mq.allclient-9.3.3.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m09:25:38,183 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry lib/gson-2.2.4.jar in /content/siali.war/WEB-INF/lib/loginx-4.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m09:25:38,184 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry lib/jldap-4.3.jar in /content/siali.war/WEB-INF/lib/loginx-4.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m09:25:38,184 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry lib/xstream-1.4.4.jar in /content/siali.war/WEB-INF/lib/loginx-4.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m09:25:38,184 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry lib/xmlpull-1.1.3.1.jar in /content/siali.war/WEB-INF/lib/loginx-4.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m09:25:38,184 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry lib/jopt-simple-4.5.jar in /content/siali.war/WEB-INF/lib/loginx-4.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m09:25:38,184 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0059: Class Path entry lib/log4j-1.2.17.jar in /content/siali.war/WEB-INF/lib/loginx-4.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m09:25:38,303 WARN  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0119: [Enterprise Beans 3.1 spec, section 4.9.2] Session bean implementation class MUST be public, not abstract and not final - br.gov.caixa.siali.model.service.ValidacaoService won't be considered as a session bean, since it doesn't meet that requirement
[0m[0m09:25:38,502 INFO  [org.jboss.as.jpa] (MSC service thread 1-4) WFLYJPA0002: Read persistence.xml for SialiPU
[0m[0m09:25:38,953 INFO  [org.jipijapa] (MSC service thread 1-4) JIPIORMV53020253: Second level cache enabled for siali.war#SialiPU
[0m[0m09:25:39,330 INFO  [org.jboss.keycloak] (MSC service thread 1-3) Keycloak subsystem override for deployment siali.war
[0m[0m09:25:39,331 INFO  [org.jboss.weld.deployer] (MSC service thread 1-3) WFLYWELD0003: Processing weld deployment siali.war
[0m[0m09:25:39,439 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 74) ISPN000128: Infinispan version: Infinispan 'Corona Extra' 11.0.17.Final-redhat-00001
[0m[0m09:25:39,505 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 74) WFLYJPA0010: Starting Persistence Unit (phase 1 of 2) Service 'siali.war#SialiPU'
[0m[0m09:25:39,506 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-3) HV000001: Hibernate Validator 6.0.23.Final-redhat-00001
[0m[0m09:25:39,602 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 74) HHH000204: Processing PersistenceUnitInfo [
	name: SialiPU
	...]
[0m[0m09:25:39,705 INFO  [org.hibernate.Version] (ServerService Thread Pool -- 74) HHH000412: Hibernate Core {5.3.29.Final-redhat-00001}
[0m[0m09:25:39,706 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 74) HHH000206: hibernate.properties not found
[0m[0m09:25:39,802 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ScheduleSiacc' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ScheduleSiacc!br.gov.caixa.siali.model.scheduler.ScheduleSiacc
	java:app/siali/ScheduleSiacc!br.gov.caixa.siali.model.scheduler.ScheduleSiacc
	java:module/ScheduleSiacc!br.gov.caixa.siali.model.scheduler.ScheduleSiacc
	java:global/siali/ScheduleSiacc
	java:app/siali/ScheduleSiacc
	java:module/ScheduleSiacc

[0m[0m09:25:39,803 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ImportacaoRetornoFinanceiroProcess' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ImportacaoRetornoFinanceiroProcess!br.gov.caixa.siali.model.scheduler.ImportacaoRetornoFinanceiroService
	java:app/siali/ImportacaoRetornoFinanceiroProcess!br.gov.caixa.siali.model.scheduler.ImportacaoRetornoFinanceiroService
	java:module/ImportacaoRetornoFinanceiroProcess!br.gov.caixa.siali.model.scheduler.ImportacaoRetornoFinanceiroService
	java:global/siali/ImportacaoRetornoFinanceiroProcess
	java:app/siali/ImportacaoRetornoFinanceiroProcess
	java:module/ImportacaoRetornoFinanceiroProcess

[0m[0m09:25:39,803 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'AdministradoraServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AdministradoraServiceImpl!br.gov.caixa.siali.model.service.AdministradoraService
	java:app/siali/AdministradoraServiceImpl!br.gov.caixa.siali.model.service.AdministradoraService
	java:module/AdministradoraServiceImpl!br.gov.caixa.siali.model.service.AdministradoraService
	java:global/siali/AdministradoraServiceImpl
	java:app/siali/AdministradoraServiceImpl
	java:module/AdministradoraServiceImpl

[0m[0m09:25:39,803 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'TarifaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/TarifaServiceImpl!br.gov.caixa.siali.model.service.TarifaService
	java:app/siali/TarifaServiceImpl!br.gov.caixa.siali.model.service.TarifaService
	java:module/TarifaServiceImpl!br.gov.caixa.siali.model.service.TarifaService
	java:global/siali/TarifaServiceImpl
	java:app/siali/TarifaServiceImpl
	java:module/TarifaServiceImpl

[0m[0m09:25:39,803 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'TarefaAgendadaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/TarefaAgendadaServiceImpl!br.gov.caixa.siali.model.service.TarefaAgendadaService
	java:app/siali/TarefaAgendadaServiceImpl!br.gov.caixa.siali.model.service.TarefaAgendadaService
	java:module/TarefaAgendadaServiceImpl!br.gov.caixa.siali.model.service.TarefaAgendadaService
	java:global/siali/TarefaAgendadaServiceImpl
	java:app/siali/TarefaAgendadaServiceImpl
	java:module/TarefaAgendadaServiceImpl

[0m[0m09:25:39,803 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'PropostaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/PropostaServiceImpl!br.gov.caixa.siali.model.service.PropostaService
	java:app/siali/PropostaServiceImpl!br.gov.caixa.siali.model.service.PropostaService
	java:module/PropostaServiceImpl!br.gov.caixa.siali.model.service.PropostaService
	java:global/siali/PropostaServiceImpl
	java:app/siali/PropostaServiceImpl
	java:module/PropostaServiceImpl

[0m[0m09:25:39,803 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'GestorPerfilServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/GestorPerfilServiceImpl!br.gov.caixa.gestorperfis.model.service.GestorPerfilService
	java:app/siali/GestorPerfilServiceImpl!br.gov.caixa.gestorperfis.model.service.GestorPerfilService
	java:module/GestorPerfilServiceImpl!br.gov.caixa.gestorperfis.model.service.GestorPerfilService
	java:global/siali/GestorPerfilServiceImpl
	java:app/siali/GestorPerfilServiceImpl
	java:module/GestorPerfilServiceImpl

[0m[0m09:25:39,803 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'EventoAuditoriaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/EventoAuditoriaServiceImpl!br.gov.caixa.siali.auditoria.model.service.EventoAuditoriaService
	java:app/siali/EventoAuditoriaServiceImpl!br.gov.caixa.siali.auditoria.model.service.EventoAuditoriaService
	java:module/EventoAuditoriaServiceImpl!br.gov.caixa.siali.auditoria.model.service.EventoAuditoriaService
	java:global/siali/EventoAuditoriaServiceImpl
	java:app/siali/EventoAuditoriaServiceImpl
	java:module/EventoAuditoriaServiceImpl

[0m[0m09:25:39,803 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'AuditoriaProcessamentoMPASServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AuditoriaProcessamentoMPASServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaProcessamentoMPASService
	java:app/siali/AuditoriaProcessamentoMPASServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaProcessamentoMPASService
	java:module/AuditoriaProcessamentoMPASServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaProcessamentoMPASService
	java:global/siali/AuditoriaProcessamentoMPASServiceImpl
	java:app/siali/AuditoriaProcessamentoMPASServiceImpl
	java:module/AuditoriaProcessamentoMPASServiceImpl

[0m[0m09:25:39,803 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ContratoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ContratoServiceImpl!br.gov.caixa.siali.model.service.ContratoService
	java:app/siali/ContratoServiceImpl!br.gov.caixa.siali.model.service.ContratoService
	java:module/ContratoServiceImpl!br.gov.caixa.siali.model.service.ContratoService
	java:global/siali/ContratoServiceImpl
	java:app/siali/ContratoServiceImpl
	java:module/ContratoServiceImpl

[0m[0m09:25:39,803 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'TrilhaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/TrilhaServiceImpl!br.gov.caixa.siali.model.service.TrilhaService
	java:app/siali/TrilhaServiceImpl!br.gov.caixa.siali.model.service.TrilhaService
	java:module/TrilhaServiceImpl!br.gov.caixa.siali.model.service.TrilhaService
	java:global/siali/TrilhaServiceImpl
	java:app/siali/TrilhaServiceImpl
	java:module/TrilhaServiceImpl

[0m[0m09:25:39,803 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ExportacaoGECRMProcess' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ExportacaoGECRMProcess!br.gov.caixa.siali.ExportacaoGECRMProcess
	java:app/siali/ExportacaoGECRMProcess!br.gov.caixa.siali.ExportacaoGECRMProcess
	java:module/ExportacaoGECRMProcess!br.gov.caixa.siali.ExportacaoGECRMProcess
	java:global/siali/ExportacaoGECRMProcess
	java:app/siali/ExportacaoGECRMProcess
	java:module/ExportacaoGECRMProcess

[0m[0m09:25:39,804 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'AuditoriaServiceFactory' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AuditoriaServiceFactory!br.gov.caixa.siali.auditoria.model.factory.AuditoriaServiceFactory
	java:app/siali/AuditoriaServiceFactory!br.gov.caixa.siali.auditoria.model.factory.AuditoriaServiceFactory
	java:module/AuditoriaServiceFactory!br.gov.caixa.siali.auditoria.model.factory.AuditoriaServiceFactory
	java:global/siali/AuditoriaServiceFactory
	java:app/siali/AuditoriaServiceFactory
	java:module/AuditoriaServiceFactory

[0m[0m09:25:39,804 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'AuditoriaPoliticaRemuneracaoFaixaFaturamentoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AuditoriaPoliticaRemuneracaoFaixaFaturamentoServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaPoliticaRemuneracaoFaixaFaturamentoService
	java:app/siali/AuditoriaPoliticaRemuneracaoFaixaFaturamentoServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaPoliticaRemuneracaoFaixaFaturamentoService
	java:module/AuditoriaPoliticaRemuneracaoFaixaFaturamentoServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaPoliticaRemuneracaoFaixaFaturamentoService
	java:global/siali/AuditoriaPoliticaRemuneracaoFaixaFaturamentoServiceImpl
	java:app/siali/AuditoriaPoliticaRemuneracaoFaixaFaturamentoServiceImpl
	java:module/AuditoriaPoliticaRemuneracaoFaixaFaturamentoServiceImpl

[0m[0m09:25:39,804 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ExpurgoLgpdProcess' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ExpurgoLgpdProcess!br.gov.caixa.siali.model.scheduler.ExpurgoLgpdService
	java:app/siali/ExpurgoLgpdProcess!br.gov.caixa.siali.model.scheduler.ExpurgoLgpdService
	java:module/ExpurgoLgpdProcess!br.gov.caixa.siali.model.scheduler.ExpurgoLgpdService
	java:global/siali/ExpurgoLgpdProcess
	java:app/siali/ExpurgoLgpdProcess
	java:module/ExpurgoLgpdProcess

[0m[0m09:25:39,804 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'TipoEmpresaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/TipoEmpresaServiceImpl!br.gov.caixa.siali.model.service.TipoEmpresaService
	java:app/siali/TipoEmpresaServiceImpl!br.gov.caixa.siali.model.service.TipoEmpresaService
	java:module/TipoEmpresaServiceImpl!br.gov.caixa.siali.model.service.TipoEmpresaService
	java:global/siali/TipoEmpresaServiceImpl
	java:app/siali/TipoEmpresaServiceImpl
	java:module/TipoEmpresaServiceImpl

[0m[0m09:25:39,804 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ScheduleExpurgoLGPD' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ScheduleExpurgoLGPD!br.gov.caixa.siali.model.scheduler.ScheduleExpurgoLGPD
	java:app/siali/ScheduleExpurgoLGPD!br.gov.caixa.siali.model.scheduler.ScheduleExpurgoLGPD
	java:module/ScheduleExpurgoLGPD!br.gov.caixa.siali.model.scheduler.ScheduleExpurgoLGPD
	java:global/siali/ScheduleExpurgoLGPD
	java:app/siali/ScheduleExpurgoLGPD
	java:module/ScheduleExpurgoLGPD

[0m[0m09:25:39,804 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ExportacaoGecalVendasProcess' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ExportacaoGecalVendasProcess!br.gov.caixa.siali.ExportacaoGecalVendasProcess
	java:app/siali/ExportacaoGecalVendasProcess!br.gov.caixa.siali.ExportacaoGecalVendasProcess
	java:module/ExportacaoGecalVendasProcess!br.gov.caixa.siali.ExportacaoGecalVendasProcess
	java:global/siali/ExportacaoGecalVendasProcess
	java:app/siali/ExportacaoGecalVendasProcess
	java:module/ExportacaoGecalVendasProcess

[0m[0m09:25:39,804 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'AtualizaTabelaErrosProcess' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AtualizaTabelaErrosProcess!br.gov.caixa.siali.model.scheduler.AtualizaTabelaErrosService
	java:app/siali/AtualizaTabelaErrosProcess!br.gov.caixa.siali.model.scheduler.AtualizaTabelaErrosService
	java:module/AtualizaTabelaErrosProcess!br.gov.caixa.siali.model.scheduler.AtualizaTabelaErrosService
	java:global/siali/AtualizaTabelaErrosProcess
	java:app/siali/AtualizaTabelaErrosProcess
	java:module/AtualizaTabelaErrosProcess

[0m[0m09:25:39,804 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'AtesteFinanceiroServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AtesteFinanceiroServiceImpl!br.gov.caixa.siali.model.service.AtesteFinanceiroService
	java:app/siali/AtesteFinanceiroServiceImpl!br.gov.caixa.siali.model.service.AtesteFinanceiroService
	java:module/AtesteFinanceiroServiceImpl!br.gov.caixa.siali.model.service.AtesteFinanceiroService
	java:global/siali/AtesteFinanceiroServiceImpl
	java:app/siali/AtesteFinanceiroServiceImpl
	java:module/AtesteFinanceiroServiceImpl

[0m[0m09:25:39,804 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'AuditoriaGerarSidemServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AuditoriaGerarSidemServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaGerarSidemService
	java:app/siali/AuditoriaGerarSidemServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaGerarSidemService
	java:module/AuditoriaGerarSidemServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaGerarSidemService
	java:global/siali/AuditoriaGerarSidemServiceImpl
	java:app/siali/AuditoriaGerarSidemServiceImpl
	java:module/AuditoriaGerarSidemServiceImpl

[0m[0m09:25:39,805 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'FuncaoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/FuncaoServiceImpl!br.gov.caixa.siico.model.service.FuncaoService
	java:app/siali/FuncaoServiceImpl!br.gov.caixa.siico.model.service.FuncaoService
	java:module/FuncaoServiceImpl!br.gov.caixa.siico.model.service.FuncaoService
	java:global/siali/FuncaoServiceImpl
	java:app/siali/FuncaoServiceImpl
	java:module/FuncaoServiceImpl

[0m[0m09:25:39,805 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ExportacaoSidemProcess' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ExportacaoSidemProcess!br.gov.caixa.siali.ExportacaoSidemProcess
	java:app/siali/ExportacaoSidemProcess!br.gov.caixa.siali.ExportacaoSidemProcess
	java:module/ExportacaoSidemProcess!br.gov.caixa.siali.ExportacaoSidemProcess
	java:global/siali/ExportacaoSidemProcess
	java:app/siali/ExportacaoSidemProcess
	java:module/ExportacaoSidemProcess

[0m[0m09:25:39,805 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ScheduleMVR' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ScheduleMVR!br.gov.caixa.siali.model.scheduler.ScheduleMVR
	java:app/siali/ScheduleMVR!br.gov.caixa.siali.model.scheduler.ScheduleMVR
	java:module/ScheduleMVR!br.gov.caixa.siali.model.scheduler.ScheduleMVR
	java:global/siali/ScheduleMVR
	java:app/siali/ScheduleMVR
	java:module/ScheduleMVR

[0m[0m09:25:39,805 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ScheduleATVR' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ScheduleATVR!br.gov.caixa.siali.model.scheduler.ScheduleATVR
	java:app/siali/ScheduleATVR!br.gov.caixa.siali.model.scheduler.ScheduleATVR
	java:module/ScheduleATVR!br.gov.caixa.siali.model.scheduler.ScheduleATVR
	java:global/siali/ScheduleATVR
	java:app/siali/ScheduleATVR
	java:module/ScheduleATVR

[0m[0m09:25:39,805 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'GestaoMatrizAcessoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/GestaoMatrizAcessoServiceImpl!br.gov.caixa.siali.model.service.GestaoMatrizAcessoService
	java:app/siali/GestaoMatrizAcessoServiceImpl!br.gov.caixa.siali.model.service.GestaoMatrizAcessoService
	java:module/GestaoMatrizAcessoServiceImpl!br.gov.caixa.siali.model.service.GestaoMatrizAcessoService
	java:global/siali/GestaoMatrizAcessoServiceImpl
	java:app/siali/GestaoMatrizAcessoServiceImpl
	java:module/GestaoMatrizAcessoServiceImpl

[0m[0m09:25:39,805 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ScheduleMmf' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ScheduleMmf!br.gov.caixa.siali.model.scheduler.ScheduleMmf
	java:app/siali/ScheduleMmf!br.gov.caixa.siali.model.scheduler.ScheduleMmf
	java:module/ScheduleMmf!br.gov.caixa.siali.model.scheduler.ScheduleMmf
	java:global/siali/ScheduleMmf
	java:app/siali/ScheduleMmf
	java:module/ScheduleMmf

[0m[0m09:25:39,805 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'SinafAgendamentoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/SinafAgendamentoServiceImpl!br.gov.caixa.siali.model.scheduler.SinafAgendamentoService
	java:app/siali/SinafAgendamentoServiceImpl!br.gov.caixa.siali.model.scheduler.SinafAgendamentoService
	java:module/SinafAgendamentoServiceImpl!br.gov.caixa.siali.model.scheduler.SinafAgendamentoService
	java:global/siali/SinafAgendamentoServiceImpl
	java:app/siali/SinafAgendamentoServiceImpl
	java:module/SinafAgendamentoServiceImpl

[0m[0m09:25:39,805 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'AuditoriaPropostaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AuditoriaPropostaServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaPropostaService
	java:app/siali/AuditoriaPropostaServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaPropostaService
	java:module/AuditoriaPropostaServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaPropostaService
	java:global/siali/AuditoriaPropostaServiceImpl
	java:app/siali/AuditoriaPropostaServiceImpl
	java:module/AuditoriaPropostaServiceImpl

[0m[0m09:25:39,805 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'FeriadoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/FeriadoServiceImpl!br.gov.caixa.siico.model.service.FeriadoService
	java:app/siali/FeriadoServiceImpl!br.gov.caixa.siico.model.service.FeriadoService
	java:module/FeriadoServiceImpl!br.gov.caixa.siico.model.service.FeriadoService
	java:global/siali/FeriadoServiceImpl
	java:app/siali/FeriadoServiceImpl
	java:module/FeriadoServiceImpl

[0m[0m09:25:39,805 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'DocumentoAjudaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/DocumentoAjudaServiceImpl!br.gov.caixa.siali.model.service.DocumentoAjudaService
	java:app/siali/DocumentoAjudaServiceImpl!br.gov.caixa.siali.model.service.DocumentoAjudaService
	java:module/DocumentoAjudaServiceImpl!br.gov.caixa.siali.model.service.DocumentoAjudaService
	java:global/siali/DocumentoAjudaServiceImpl
	java:app/siali/DocumentoAjudaServiceImpl
	java:module/DocumentoAjudaServiceImpl

[0m[0m09:25:39,805 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ResumoDebitoMesCaixaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ResumoDebitoMesCaixaServiceImpl!br.gov.caixa.siali.model.service.ResumoDebitoMesCaixaService
	java:app/siali/ResumoDebitoMesCaixaServiceImpl!br.gov.caixa.siali.model.service.ResumoDebitoMesCaixaService
	java:module/ResumoDebitoMesCaixaServiceImpl!br.gov.caixa.siali.model.service.ResumoDebitoMesCaixaService
	java:global/siali/ResumoDebitoMesCaixaServiceImpl
	java:app/siali/ResumoDebitoMesCaixaServiceImpl
	java:module/ResumoDebitoMesCaixaServiceImpl

[0m[0m09:25:39,805 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ScheduleSinaf' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ScheduleSinaf!br.gov.caixa.siali.model.scheduler.ScheduleSinaf
	java:app/siali/ScheduleSinaf!br.gov.caixa.siali.model.scheduler.ScheduleSinaf
	java:module/ScheduleSinaf!br.gov.caixa.siali.model.scheduler.ScheduleSinaf
	java:global/siali/ScheduleSinaf
	java:app/siali/ScheduleSinaf
	java:module/ScheduleSinaf

[0m[0m09:25:39,805 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ClausulaContratoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ClausulaContratoServiceImpl!br.gov.caixa.siali.model.service.ClausulaContratoService
	java:app/siali/ClausulaContratoServiceImpl!br.gov.caixa.siali.model.service.ClausulaContratoService
	java:module/ClausulaContratoServiceImpl!br.gov.caixa.siali.model.service.ClausulaContratoService
	java:global/siali/ClausulaContratoServiceImpl
	java:app/siali/ClausulaContratoServiceImpl
	java:module/ClausulaContratoServiceImpl

[0m[0m09:25:39,805 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'AuditoriaTarifaBalcaoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AuditoriaTarifaBalcaoServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaTarifaBalcaoService
	java:app/siali/AuditoriaTarifaBalcaoServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaTarifaBalcaoService
	java:module/AuditoriaTarifaBalcaoServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaTarifaBalcaoService
	java:global/siali/AuditoriaTarifaBalcaoServiceImpl
	java:app/siali/AuditoriaTarifaBalcaoServiceImpl
	java:module/AuditoriaTarifaBalcaoServiceImpl

[0m[0m09:25:39,806 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'MatrizAcessoProcess' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/MatrizAcessoProcess!br.gov.caixa.siali.model.scheduler.ProcessamentoMatrizAcessoService
	java:app/siali/MatrizAcessoProcess!br.gov.caixa.siali.model.scheduler.ProcessamentoMatrizAcessoService
	java:module/MatrizAcessoProcess!br.gov.caixa.siali.model.scheduler.ProcessamentoMatrizAcessoService
	java:global/siali/MatrizAcessoProcess
	java:app/siali/MatrizAcessoProcess
	java:module/MatrizAcessoProcess

[0m[0m09:25:39,806 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ImportacaoRetornoCartaoProcess' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ImportacaoRetornoCartaoProcess!br.gov.caixa.siali.model.scheduler.ImportacaoCartoesAtivadosService
	java:app/siali/ImportacaoRetornoCartaoProcess!br.gov.caixa.siali.model.scheduler.ImportacaoCartoesAtivadosService
	java:module/ImportacaoRetornoCartaoProcess!br.gov.caixa.siali.model.scheduler.ImportacaoCartoesAtivadosService
	java:global/siali/ImportacaoRetornoCartaoProcess
	java:app/siali/ImportacaoRetornoCartaoProcess
	java:module/ImportacaoRetornoCartaoProcess

[0m[0m09:25:39,806 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'DebitoAgendamentoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/DebitoAgendamentoServiceImpl!br.gov.caixa.siali.model.scheduler.DebitoAgendamentoService
	java:app/siali/DebitoAgendamentoServiceImpl!br.gov.caixa.siali.model.scheduler.DebitoAgendamentoService
	java:module/DebitoAgendamentoServiceImpl!br.gov.caixa.siali.model.scheduler.DebitoAgendamentoService
	java:global/siali/DebitoAgendamentoServiceImpl
	java:app/siali/DebitoAgendamentoServiceImpl
	java:module/DebitoAgendamentoServiceImpl

[0m[0m09:25:39,806 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ScheduleAtualizaTabelaErros' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ScheduleAtualizaTabelaErros!br.gov.caixa.siali.model.scheduler.ScheduleAtualizaTabelaErros
	java:app/siali/ScheduleAtualizaTabelaErros!br.gov.caixa.siali.model.scheduler.ScheduleAtualizaTabelaErros
	java:module/ScheduleAtualizaTabelaErros!br.gov.caixa.siali.model.scheduler.ScheduleAtualizaTabelaErros
	java:global/siali/ScheduleAtualizaTabelaErros
	java:app/siali/ScheduleAtualizaTabelaErros
	java:module/ScheduleAtualizaTabelaErros

[0m[0m09:25:39,806 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ErroAdministradoraServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ErroAdministradoraServiceImpl!br.gov.caixa.siali.model.service.ErroAdministradoraService
	java:app/siali/ErroAdministradoraServiceImpl!br.gov.caixa.siali.model.service.ErroAdministradoraService
	java:module/ErroAdministradoraServiceImpl!br.gov.caixa.siali.model.service.ErroAdministradoraService
	java:global/siali/ErroAdministradoraServiceImpl
	java:app/siali/ErroAdministradoraServiceImpl
	java:module/ErroAdministradoraServiceImpl

[0m[0m09:25:39,806 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ScheduleSigcb' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ScheduleSigcb!br.gov.caixa.siali.model.scheduler.ScheduleSigcb
	java:app/siali/ScheduleSigcb!br.gov.caixa.siali.model.scheduler.ScheduleSigcb
	java:module/ScheduleSigcb!br.gov.caixa.siali.model.scheduler.ScheduleSigcb
	java:global/siali/ScheduleSigcb
	java:app/siali/ScheduleSigcb
	java:module/ScheduleSigcb

[0m[0m09:25:39,806 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'GestaoPropostaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/GestaoPropostaServiceImpl!br.gov.caixa.siali.model.service.GestaoPropostaService
	java:app/siali/GestaoPropostaServiceImpl!br.gov.caixa.siali.model.service.GestaoPropostaService
	java:module/GestaoPropostaServiceImpl!br.gov.caixa.siali.model.service.GestaoPropostaService
	java:global/siali/GestaoPropostaServiceImpl
	java:app/siali/GestaoPropostaServiceImpl
	java:module/GestaoPropostaServiceImpl

[0m[0m09:25:39,806 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'RetornoFinanceiroAdministradoraServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/RetornoFinanceiroAdministradoraServiceImpl!br.gov.caixa.siali.model.service.RetornoFinanceiroAdministradoraService
	java:app/siali/RetornoFinanceiroAdministradoraServiceImpl!br.gov.caixa.siali.model.service.RetornoFinanceiroAdministradoraService
	java:module/RetornoFinanceiroAdministradoraServiceImpl!br.gov.caixa.siali.model.service.RetornoFinanceiroAdministradoraService
	java:global/siali/RetornoFinanceiroAdministradoraServiceImpl
	java:app/siali/RetornoFinanceiroAdministradoraServiceImpl
	java:module/RetornoFinanceiroAdministradoraServiceImpl

[0m[0m09:25:39,806 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ScheduleSidem' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ScheduleSidem!br.gov.caixa.siali.model.scheduler.ScheduleSidem
	java:app/siali/ScheduleSidem!br.gov.caixa.siali.model.scheduler.ScheduleSidem
	java:module/ScheduleSidem!br.gov.caixa.siali.model.scheduler.ScheduleSidem
	java:global/siali/ScheduleSidem
	java:app/siali/ScheduleSidem
	java:module/ScheduleSidem

[0m[0m09:25:39,806 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'TaxaServicoCaixaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/TaxaServicoCaixaServiceImpl!br.gov.caixa.siali.model.service.TaxaServicoCaixaService
	java:app/siali/TaxaServicoCaixaServiceImpl!br.gov.caixa.siali.model.service.TaxaServicoCaixaService
	java:module/TaxaServicoCaixaServiceImpl!br.gov.caixa.siali.model.service.TaxaServicoCaixaService
	java:global/siali/TaxaServicoCaixaServiceImpl
	java:app/siali/TaxaServicoCaixaServiceImpl
	java:module/TaxaServicoCaixaServiceImpl

[0m[0m09:25:39,806 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'TarifaBalcaoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/TarifaBalcaoServiceImpl!br.gov.caixa.siali.model.service.TarifaBalcaoService
	java:app/siali/TarifaBalcaoServiceImpl!br.gov.caixa.siali.model.service.TarifaBalcaoService
	java:module/TarifaBalcaoServiceImpl!br.gov.caixa.siali.model.service.TarifaBalcaoService
	java:global/siali/TarifaBalcaoServiceImpl
	java:app/siali/TarifaBalcaoServiceImpl
	java:module/TarifaBalcaoServiceImpl

[0m[0m09:25:39,806 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'MovimentoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/MovimentoServiceImpl!br.gov.caixa.siali.model.service.MovimentoService
	java:app/siali/MovimentoServiceImpl!br.gov.caixa.siali.model.service.MovimentoService
	java:module/MovimentoServiceImpl!br.gov.caixa.siali.model.service.MovimentoService
	java:global/siali/MovimentoServiceImpl
	java:app/siali/MovimentoServiceImpl
	java:module/MovimentoServiceImpl

[0m[0m09:25:39,806 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'PropostaProdutoTarifaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/PropostaProdutoTarifaServiceImpl!br.gov.caixa.siali.model.service.PropostaProdutoTarifaService
	java:app/siali/PropostaProdutoTarifaServiceImpl!br.gov.caixa.siali.model.service.PropostaProdutoTarifaService
	java:module/PropostaProdutoTarifaServiceImpl!br.gov.caixa.siali.model.service.PropostaProdutoTarifaService
	java:global/siali/PropostaProdutoTarifaServiceImpl
	java:app/siali/PropostaProdutoTarifaServiceImpl
	java:module/PropostaProdutoTarifaServiceImpl

[0m[0m09:25:39,806 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'EnviaEmailServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/EnviaEmailServiceImpl!br.gov.caixa.siali.model.service.EnviaEmailService
	java:app/siali/EnviaEmailServiceImpl!br.gov.caixa.siali.model.service.EnviaEmailService
	java:module/EnviaEmailServiceImpl!br.gov.caixa.siali.model.service.EnviaEmailService
	java:global/siali/EnviaEmailServiceImpl
	java:app/siali/EnviaEmailServiceImpl
	java:module/EnviaEmailServiceImpl

[0m[0m09:25:39,807 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'AgendamentosNotifierFactory' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AgendamentosNotifierFactory!br.gov.caixa.siali.model.service.AgendamentosNotifierFactory
	java:app/siali/AgendamentosNotifierFactory!br.gov.caixa.siali.model.service.AgendamentosNotifierFactory
	java:module/AgendamentosNotifierFactory!br.gov.caixa.siali.model.service.AgendamentosNotifierFactory
	java:global/siali/AgendamentosNotifierFactory
	java:app/siali/AgendamentosNotifierFactory
	java:module/AgendamentosNotifierFactory

[0m[0m09:25:39,807 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'SSOController' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/SSOController!br.gov.caixa.arquitetura.sso.SSOController
	java:app/siali/SSOController!br.gov.caixa.arquitetura.sso.SSOController
	java:module/SSOController!br.gov.caixa.arquitetura.sso.SSOController
	java:global/siali/SSOController
	java:app/siali/SSOController
	java:module/SSOController

[0m[0m09:25:39,807 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'RemuneracaoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/RemuneracaoServiceImpl!br.gov.caixa.siali.model.service.RemuneracaoService
	java:app/siali/RemuneracaoServiceImpl!br.gov.caixa.siali.model.service.RemuneracaoService
	java:module/RemuneracaoServiceImpl!br.gov.caixa.siali.model.service.RemuneracaoService
	java:global/siali/RemuneracaoServiceImpl
	java:app/siali/RemuneracaoServiceImpl
	java:module/RemuneracaoServiceImpl

[0m[0m09:25:39,807 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ExportacaoProcess' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ExportacaoProcess!br.gov.caixa.siali.model.scheduler.ExportacaoProcessService
	java:app/siali/ExportacaoProcess!br.gov.caixa.siali.model.scheduler.ExportacaoProcessService
	java:module/ExportacaoProcess!br.gov.caixa.siali.model.scheduler.ExportacaoProcessService
	java:global/siali/ExportacaoProcess
	java:app/siali/ExportacaoProcess
	java:module/ExportacaoProcess

[0m[0m09:25:39,807 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'InterlocutorServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/InterlocutorServiceImpl!br.gov.caixa.siali.model.service.InterlocutorService
	java:app/siali/InterlocutorServiceImpl!br.gov.caixa.siali.model.service.InterlocutorService
	java:module/InterlocutorServiceImpl!br.gov.caixa.siali.model.service.InterlocutorService
	java:global/siali/InterlocutorServiceImpl
	java:app/siali/InterlocutorServiceImpl
	java:module/InterlocutorServiceImpl

[0m[0m09:25:39,807 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'AuditoriaHorarioProcessamentoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AuditoriaHorarioProcessamentoServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaHorarioProcessamentoService
	java:app/siali/AuditoriaHorarioProcessamentoServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaHorarioProcessamentoService
	java:module/AuditoriaHorarioProcessamentoServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaHorarioProcessamentoService
	java:global/siali/AuditoriaHorarioProcessamentoServiceImpl
	java:app/siali/AuditoriaHorarioProcessamentoServiceImpl
	java:module/AuditoriaHorarioProcessamentoServiceImpl

[0m[0m09:25:39,807 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'AuditoriaTarifaCaixaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AuditoriaTarifaCaixaServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaTarifaCaixaService
	java:app/siali/AuditoriaTarifaCaixaServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaTarifaCaixaService
	java:module/AuditoriaTarifaCaixaServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaTarifaCaixaService
	java:global/siali/AuditoriaTarifaCaixaServiceImpl
	java:app/siali/AuditoriaTarifaCaixaServiceImpl
	java:module/AuditoriaTarifaCaixaServiceImpl

[0m[0m09:25:39,807 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ProdutosVrServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ProdutosVrServiceImpl!br.gov.caixa.siali.model.service.ProdutosVrService
	java:app/siali/ProdutosVrServiceImpl!br.gov.caixa.siali.model.service.ProdutosVrService
	java:module/ProdutosVrServiceImpl!br.gov.caixa.siali.model.service.ProdutosVrService
	java:global/siali/ProdutosVrServiceImpl
	java:app/siali/ProdutosVrServiceImpl
	java:module/ProdutosVrServiceImpl

[0m[0m09:25:39,807 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'AuditoriaDocumentoAjudaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AuditoriaDocumentoAjudaServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaDocumentoAjudaService
	java:app/siali/AuditoriaDocumentoAjudaServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaDocumentoAjudaService
	java:module/AuditoriaDocumentoAjudaServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaDocumentoAjudaService
	java:global/siali/AuditoriaDocumentoAjudaServiceImpl
	java:app/siali/AuditoriaDocumentoAjudaServiceImpl
	java:module/AuditoriaDocumentoAjudaServiceImpl

[0m[0m09:25:39,807 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ProdutoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ProdutoServiceImpl!br.gov.caixa.siali.model.service.ProdutoService
	java:app/siali/ProdutoServiceImpl!br.gov.caixa.siali.model.service.ProdutoService
	java:module/ProdutoServiceImpl!br.gov.caixa.siali.model.service.ProdutoService
	java:global/siali/ProdutoServiceImpl
	java:app/siali/ProdutoServiceImpl
	java:module/ProdutoServiceImpl

[0m[0m09:25:39,807 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'UnidadeServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/UnidadeServiceImpl!br.gov.caixa.siico.model.service.UnidadeService
	java:app/siali/UnidadeServiceImpl!br.gov.caixa.siico.model.service.UnidadeService
	java:module/UnidadeServiceImpl!br.gov.caixa.siico.model.service.UnidadeService
	java:global/siali/UnidadeServiceImpl
	java:app/siali/UnidadeServiceImpl
	java:module/UnidadeServiceImpl

[0m[0m09:25:39,807 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'AuthorizationServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AuthorizationServiceImpl!br.gov.caixa.arquitetura.model.service.AuthorizationService
	java:app/siali/AuthorizationServiceImpl!br.gov.caixa.arquitetura.model.service.AuthorizationService
	java:module/AuthorizationServiceImpl!br.gov.caixa.arquitetura.model.service.AuthorizationService
	java:global/siali/AuthorizationServiceImpl
	java:app/siali/AuthorizationServiceImpl
	java:module/AuthorizationServiceImpl

[0m[0m09:25:39,807 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ControleLogs' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ControleLogs!br.gov.caixa.siali.util.ControleLogs
	java:app/siali/ControleLogs!br.gov.caixa.siali.util.ControleLogs
	java:module/ControleLogs!br.gov.caixa.siali.util.ControleLogs
	java:global/siali/ControleLogs
	java:app/siali/ControleLogs
	java:module/ControleLogs

[0m[0m09:25:39,808 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'MovimentoRetornoFinanceiroServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/MovimentoRetornoFinanceiroServiceImpl!br.gov.caixa.siali.model.service.MovimentoRetornoFinanceiroService
	java:app/siali/MovimentoRetornoFinanceiroServiceImpl!br.gov.caixa.siali.model.service.MovimentoRetornoFinanceiroService
	java:module/MovimentoRetornoFinanceiroServiceImpl!br.gov.caixa.siali.model.service.MovimentoRetornoFinanceiroService
	java:global/siali/MovimentoRetornoFinanceiroServiceImpl
	java:app/siali/MovimentoRetornoFinanceiroServiceImpl
	java:module/MovimentoRetornoFinanceiroServiceImpl

[0m[0m09:25:39,808 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ScheduleGecalVendas' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ScheduleGecalVendas!br.gov.caixa.siali.model.scheduler.ScheduleGecalVendas
	java:app/siali/ScheduleGecalVendas!br.gov.caixa.siali.model.scheduler.ScheduleGecalVendas
	java:module/ScheduleGecalVendas!br.gov.caixa.siali.model.scheduler.ScheduleGecalVendas
	java:global/siali/ScheduleGecalVendas
	java:app/siali/ScheduleGecalVendas
	java:module/ScheduleGecalVendas

[0m[0m09:25:39,808 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'AuditoriaPoliticaRemuneracaoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AuditoriaPoliticaRemuneracaoServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaPoliticaRemuneracaoService
	java:app/siali/AuditoriaPoliticaRemuneracaoServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaPoliticaRemuneracaoService
	java:module/AuditoriaPoliticaRemuneracaoServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaPoliticaRemuneracaoService
	java:global/siali/AuditoriaPoliticaRemuneracaoServiceImpl
	java:app/siali/AuditoriaPoliticaRemuneracaoServiceImpl
	java:module/AuditoriaPoliticaRemuneracaoServiceImpl

[0m[0m09:25:39,808 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'AuditoriaClausulaContratoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AuditoriaClausulaContratoServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaClausulaContratoService
	java:app/siali/AuditoriaClausulaContratoServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaClausulaContratoService
	java:module/AuditoriaClausulaContratoServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaClausulaContratoService
	java:global/siali/AuditoriaClausulaContratoServiceImpl
	java:app/siali/AuditoriaClausulaContratoServiceImpl
	java:module/AuditoriaClausulaContratoServiceImpl

[0m[0m09:25:39,808 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ImportacaoAgendamentoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ImportacaoAgendamentoServiceImpl!br.gov.caixa.siali.model.scheduler.ImportacaoAgendamentoService
	java:app/siali/ImportacaoAgendamentoServiceImpl!br.gov.caixa.siali.model.scheduler.ImportacaoAgendamentoService
	java:module/ImportacaoAgendamentoServiceImpl!br.gov.caixa.siali.model.scheduler.ImportacaoAgendamentoService
	java:global/siali/ImportacaoAgendamentoServiceImpl
	java:app/siali/ImportacaoAgendamentoServiceImpl
	java:module/ImportacaoAgendamentoServiceImpl

[0m[0m09:25:39,808 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ScheduleMrt' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ScheduleMrt!br.gov.caixa.siali.model.scheduler.ScheduleMrt
	java:app/siali/ScheduleMrt!br.gov.caixa.siali.model.scheduler.ScheduleMrt
	java:module/ScheduleMrt!br.gov.caixa.siali.model.scheduler.ScheduleMrt
	java:global/siali/ScheduleMrt
	java:app/siali/ScheduleMrt
	java:module/ScheduleMrt

[0m[0m09:25:39,808 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'PropostaAdministradoraServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/PropostaAdministradoraServiceImpl!br.gov.caixa.siali.model.service.PropostaAdministradoraService
	java:app/siali/PropostaAdministradoraServiceImpl!br.gov.caixa.siali.model.service.PropostaAdministradoraService
	java:module/PropostaAdministradoraServiceImpl!br.gov.caixa.siali.model.service.PropostaAdministradoraService
	java:global/siali/PropostaAdministradoraServiceImpl
	java:app/siali/PropostaAdministradoraServiceImpl
	java:module/PropostaAdministradoraServiceImpl

[0m[0m09:25:39,808 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'DebitoMesSiaccServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/DebitoMesSiaccServiceImpl!br.gov.caixa.siali.model.service.DebitoMesSiaccService
	java:app/siali/DebitoMesSiaccServiceImpl!br.gov.caixa.siali.model.service.DebitoMesSiaccService
	java:module/DebitoMesSiaccServiceImpl!br.gov.caixa.siali.model.service.DebitoMesSiaccService
	java:global/siali/DebitoMesSiaccServiceImpl
	java:app/siali/DebitoMesSiaccServiceImpl
	java:module/DebitoMesSiaccServiceImpl

[0m[0m09:25:39,808 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ParametroServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ParametroServiceImpl!br.gov.caixa.siali.model.service.ParametroService
	java:app/siali/ParametroServiceImpl!br.gov.caixa.siali.model.service.ParametroService
	java:module/ParametroServiceImpl!br.gov.caixa.siali.model.service.ParametroService
	java:global/siali/ParametroServiceImpl
	java:app/siali/ParametroServiceImpl
	java:module/ParametroServiceImpl

[0m[0m09:25:39,808 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ProcessamentoAuditoriaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ProcessamentoAuditoriaServiceImpl!br.gov.caixa.siali.auditoria.model.service.ProcessamentoAuditoriaService
	java:app/siali/ProcessamentoAuditoriaServiceImpl!br.gov.caixa.siali.auditoria.model.service.ProcessamentoAuditoriaService
	java:module/ProcessamentoAuditoriaServiceImpl!br.gov.caixa.siali.auditoria.model.service.ProcessamentoAuditoriaService
	java:global/siali/ProcessamentoAuditoriaServiceImpl
	java:app/siali/ProcessamentoAuditoriaServiceImpl
	java:module/ProcessamentoAuditoriaServiceImpl

[0m[0m09:25:39,808 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ImportacaoBoletoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ImportacaoBoletoServiceImpl!br.gov.caixa.siali.model.scheduler.MovimentacaoFinanceiraBoletoService
	java:app/siali/ImportacaoBoletoServiceImpl!br.gov.caixa.siali.model.scheduler.MovimentacaoFinanceiraBoletoService
	java:module/ImportacaoBoletoServiceImpl!br.gov.caixa.siali.model.scheduler.MovimentacaoFinanceiraBoletoService
	java:global/siali/ImportacaoBoletoServiceImpl
	java:app/siali/ImportacaoBoletoServiceImpl
	java:module/ImportacaoBoletoServiceImpl

[0m[0m09:25:39,808 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'AgendamentoHorarioServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AgendamentoHorarioServiceImpl!br.gov.caixa.siali.model.service.AgendamentoHorarioService
	java:app/siali/AgendamentoHorarioServiceImpl!br.gov.caixa.siali.model.service.AgendamentoHorarioService
	java:module/AgendamentoHorarioServiceImpl!br.gov.caixa.siali.model.service.AgendamentoHorarioService
	java:global/siali/AgendamentoHorarioServiceImpl
	java:app/siali/AgendamentoHorarioServiceImpl
	java:module/AgendamentoHorarioServiceImpl

[0m[0m09:25:39,809 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ErroServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ErroServiceImpl!br.gov.caixa.siali.model.service.ErroService
	java:app/siali/ErroServiceImpl!br.gov.caixa.siali.model.service.ErroService
	java:module/ErroServiceImpl!br.gov.caixa.siali.model.service.ErroService
	java:global/siali/ErroServiceImpl
	java:app/siali/ErroServiceImpl
	java:module/ErroServiceImpl

[0m[0m09:25:39,809 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ScheduleGECRM' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ScheduleGECRM!br.gov.caixa.siali.model.scheduler.ScheduleGECRM
	java:app/siali/ScheduleGECRM!br.gov.caixa.siali.model.scheduler.ScheduleGECRM
	java:module/ScheduleGECRM!br.gov.caixa.siali.model.scheduler.ScheduleGECRM
	java:global/siali/ScheduleGECRM
	java:app/siali/ScheduleGECRM
	java:module/ScheduleGECRM

[0m[0m09:25:39,809 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'PropostaProdutoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/PropostaProdutoServiceImpl!br.gov.caixa.siali.model.service.PropostaProdutoService
	java:app/siali/PropostaProdutoServiceImpl!br.gov.caixa.siali.model.service.PropostaProdutoService
	java:module/PropostaProdutoServiceImpl!br.gov.caixa.siali.model.service.PropostaProdutoService
	java:global/siali/PropostaProdutoServiceImpl
	java:app/siali/PropostaProdutoServiceImpl
	java:module/PropostaProdutoServiceImpl

[0m[0m09:25:39,809 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'AuditoriaPoliticaComercialServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AuditoriaPoliticaComercialServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaPoliticaComercialService
	java:app/siali/AuditoriaPoliticaComercialServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaPoliticaComercialService
	java:module/AuditoriaPoliticaComercialServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaPoliticaComercialService
	java:global/siali/AuditoriaPoliticaComercialServiceImpl
	java:app/siali/AuditoriaPoliticaComercialServiceImpl
	java:module/AuditoriaPoliticaComercialServiceImpl

[0m[0m09:25:39,809 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'TarifaCaixaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/TarifaCaixaServiceImpl!br.gov.caixa.siali.model.service.TarifaCaixaService
	java:app/siali/TarifaCaixaServiceImpl!br.gov.caixa.siali.model.service.TarifaCaixaService
	java:module/TarifaCaixaServiceImpl!br.gov.caixa.siali.model.service.TarifaCaixaService
	java:global/siali/TarifaCaixaServiceImpl
	java:app/siali/TarifaCaixaServiceImpl
	java:module/TarifaCaixaServiceImpl

[0m[0m09:25:39,809 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: JNDI bindings for session bean named 'ScheduleProcessamentoMatrizAcesso' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ScheduleProcessamentoMatrizAcesso!br.gov.caixa.siali.model.scheduler.ScheduleProcessamentoMatrizAcesso
	java:app/siali/ScheduleProcessamentoMatrizAcesso!br.gov.caixa.siali.model.scheduler.ScheduleProcessamentoMatrizAcesso
	java:module/ScheduleProcessamentoMatrizAcesso!br.gov.caixa.siali.model.scheduler.ScheduleProcessamentoMatrizAcesso
	java:global/siali/ScheduleProcessamentoMatrizAcesso
	java:app/siali/ScheduleProcessamentoMatrizAcesso
	java:module/ScheduleProcessamentoMatrizAcesso

[0m[0m09:25:40,017 INFO  [org.infinispan.CONFIG] (MSC service thread 1-1) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
[0m[0m09:25:40,019 INFO  [org.infinispan.CONFIG] (MSC service thread 1-1) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
[0m[0m09:25:40,210 INFO  [org.hibernate.annotations.common.Version] (ServerService Thread Pool -- 74) HCANN000001: Hibernate Commons Annotations {5.0.5.Final-redhat-00002}
[0m[0m09:25:40,223 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 75) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
[0m[31m09:25:40,320 ERROR [stderr] (MSC service thread 1-1) log4j:WARN No appenders could be found for logger (br.gov.caixa.siali.configuration.Configuration).
[0m[31m09:25:40,320 ERROR [stderr] (MSC service thread 1-1) log4j:WARN Please initialize the log4j system properly.
[0m[31m09:25:40,320 ERROR [stderr] (MSC service thread 1-1) log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
[0m[0m09:25:40,602 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 75) WFLYCLINF0002: Started http-remoting-connector cache from ejb container
[0m[33m09:25:40,622 WARN  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.siali.model.service.impl.DebitoMesSiaccServiceImpl should not have a final or static method (isBigDecimalEmpty)
[0m[0m09:25:40,711 INFO  [org.jipijapa] (MSC service thread 1-1) JIPIORMV53020253: Second level cache enabled for siali.war#SialiPU
[0m[33m09:25:41,108 WARN  [org.jboss.as.jaxrs] (MSC service thread 1-1) WFLYRS0018: Explicit usage of Jackson annotation in a Jakarta RESTful Web Services deployment; the system will disable Jakarta JSON Binding processing for the current deployment. Consider setting the 'resteasy.preferJacksonOverJsonB' property to 'false' to restore Jakarta JSON Binding.
[0m[0m09:25:41,114 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-1) WFLYJCA0004: Deploying JDBC-compliant driver class org.h2.Driver (version 2.1)
[0m[0m09:25:41,117 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-1) WFLYJCA0005: Deploying non-JDBC-compliant driver class org.postgresql.Driver (version 42.6)
[0m[0m09:25:41,140 INFO  [org.jboss.weld.Version] (MSC service thread 1-1) WELD-000900: 3.1.6 (redhat)
[0m[0m09:25:41,229 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Started Driver service with driver-name = siali.war
[0m[0m09:25:41,230 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-4) WFLYJCA0018: Started Driver service with driver-name = siali.war_org.h2.Driver_2_1
[0m[33m09:25:41,230 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0274: Excluded dependency org.jboss.log4j.logmanager via jboss-deployment-structure.xml does not exist.
[0m[0m09:25:41,230 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-4) WFLYJCA0018: Started Driver service with driver-name = siali.war_org.postgresql.Driver_42_6
[0m[0m09:25:41,449 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 74) WFLYJPA0010: Starting Persistence Unit (phase 2 of 2) Service 'siali.war#SialiPU'
[0m[0m09:25:41,500 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 74) HHH000400: Using dialect: org.hibernate.dialect.PostgreSQLDialect
[0m[0m09:25:41,510 INFO  [org.hibernate.engine.jdbc.env.internal.LobCreatorBuilderImpl] (ServerService Thread Pool -- 74) HHH000422: Disabling contextual LOB creation as connection was null
[0m[0m09:25:41,547 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 74) HHH000270: Type registration [java.util.UUID] overrides previous : org.hibernate.type.UUIDBinaryType@620319c4
[0m[0m09:25:41,551 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 74) Envers integration enabled? : true
[0m[33m09:25:42,548 WARN  [org.jboss.weld.Bootstrap] (MSC service thread 1-4) WELD-000146: BeforeBeanDiscovery.addAnnotatedType(AnnotatedType<?>) used for class com.sun.faces.flow.FlowDiscoveryCDIHelper is deprecated from CDI 1.1!
[0m[0m09:25:43,003 INFO  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 2) WELD-001125: Illegal bean type br.gov.caixa.arquitetura.controller.AbstractBean<br.gov.caixa.arquitetura.model.entities.AbstractEntity<?>> ignored on [EnhancedAnnotatedTypeImpl] public @ViewScoped @Named class br.gov.caixa.siali.controller.ConsultarMatrizAcessoBean
[0m[0m09:25:43,090 INFO  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 3) WELD-001125: Illegal bean type br.gov.caixa.arquitetura.controller.AbstractBean<br.gov.caixa.arquitetura.model.entities.AbstractEntity<?>> ignored on [EnhancedAnnotatedTypeImpl] public @SessionScoped @Named class br.gov.caixa.siali.controller.MenuBean
[0m[0m09:25:43,102 INFO  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 2) WELD-001125: Illegal bean type br.gov.caixa.arquitetura.controller.AbstractBean<br.gov.caixa.arquitetura.model.entities.AbstractEntity<?>> ignored on [EnhancedAnnotatedTypeImpl] public @ViewScoped @Named class br.gov.caixa.siali.controller.ManterMatrizAcessoBean
[0m[0m09:25:43,109 INFO  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 2) WELD-001125: Illegal bean type br.gov.caixa.arquitetura.controller.AbstractBean<br.gov.caixa.arquitetura.model.entities.AbstractEntity<?>> ignored on [EnhancedAnnotatedTypeImpl] public @ViewScoped @Named class br.gov.caixa.siali.controller.ListarAjudaBean
[0m[0m09:25:43,125 INFO  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 2) WELD-001125: Illegal bean type br.gov.caixa.arquitetura.controller.AbstractBean<br.gov.caixa.arquitetura.model.entities.AbstractEntity<?>> ignored on [EnhancedAnnotatedTypeImpl] public @ViewScoped @Named class br.gov.caixa.siali.controller.ManterDocumentoAjudaBean
[0m[33m09:25:43,541 WARN  [org.jboss.weld.Validator] (MSC service thread 1-4) WELD-001471: Interceptor method initialize defined on class br.gov.caixa.siali.controller.ManterTaxaRhBean is not defined according to the specification. It should not throw java.lang.Exception, which is a checked exception.
	at br.gov.caixa.siali.controller.ManterTaxaRhBean.initialize(ManterTaxaRhBean.java:0)
  StackTrace
[0m[33m09:25:43,546 WARN  [org.jboss.weld.Validator] (MSC service thread 1-4) WELD-001471: Interceptor method finish defined on class br.gov.caixa.arquitetura.model.datasource.Transaction is not defined according to the specification. It should not throw java.sql.SQLException, which is a checked exception.
	at br.gov.caixa.arquitetura.model.datasource.Transaction.finish(Transaction.java:0)
  StackTrace
[0m[33m09:25:43,554 WARN  [org.jboss.weld.Validator] (MSC service thread 1-4) WELD-001471: Interceptor method initialize defined on class br.gov.caixa.siali.controller.ManterRemuneracaoBean is not defined according to the specification. It should not throw java.lang.Exception, which is a checked exception.
	at br.gov.caixa.siali.controller.ManterRemuneracaoBean.initialize(ManterRemuneracaoBean.java:0)
  StackTrace
[0m[31m09:25:44,363 ERROR [stderr] (ServerService Thread Pool -- 79) log4j:ERROR Could not find value for key log4j.appender.DEBUG
[0m[31m09:25:44,363 ERROR [stderr] (ServerService Thread Pool -- 79) log4j:ERROR Could not instantiate appender named "DEBUG".
[0m[31m09:25:44,363 ERROR [stderr] (ServerService Thread Pool -- 79) log4j:ERROR Could not find value for key log4j.appender.WARN
[0m[31m09:25:44,363 ERROR [stderr] (ServerService Thread Pool -- 79) log4j:ERROR Could not instantiate appender named "WARN".
[0m[0m09:25:44,666 INFO  [stdout] (ServerService Thread Pool -- 79) 09/09/26 09:25:44:666  INFO : SIALI - Agendado para executar 05:35:00A
[0m[0m09:25:44,673 INFO  [stdout] (ServerService Thread Pool -- 79) 09/09/26 09:25:44:673  INFO : SIALI - Agendado para executar 14:42:00A
[0m[0m09:25:44,676 INFO  [stdout] (ServerService Thread Pool -- 79) 09/09/26 09:25:44:676  INFO : SIALI - Agendado para executar 05:15:00A
[0m[0m09:25:44,691 INFO  [stdout] (ServerService Thread Pool -- 79) 09/09/26 09:25:44:691  INFO : SIALI - Agendado para executar 00:02:00A
[0m[0m09:25:44,694 INFO  [stdout] (ServerService Thread Pool -- 79) 09/09/26 09:25:44:694  INFO : SIALI - Agendado para executar 12:43:00S
[0m[0m09:25:44,698 INFO  [stdout] (ServerService Thread Pool -- 79) 09/09/26 09:25:44:698  INFO : SIALI - Agendado para executar 05:45:00A
[0m[0m09:25:44,701 INFO  [stdout] (ServerService Thread Pool -- 79) 09/09/26 09:25:44:701  INFO : SIALI - Agendado para executar 23:59:00S
[0m[0m09:25:44,704 INFO  [stdout] (ServerService Thread Pool -- 79) 09/09/26 09:25:44:704  INFO : SIALI - Agendado para executar 11:40:00A
[0m[0m09:25:44,707 INFO  [stdout] (ServerService Thread Pool -- 79) 09/09/26 09:25:44:707  INFO : SIALI - Agendado para executar 23:59:00S
[0m[0m09:25:44,710 INFO  [stdout] (ServerService Thread Pool -- 79) 09/09/26 09:25:44:710  INFO : SIALI - Agendado para executar 16:00:00A
[0m[0m09:25:44,713 INFO  [stdout] (ServerService Thread Pool -- 79) 09/09/26 09:25:44:713  INFO : SIALI - Agendado para executar 01:00:00A
[0m[0m09:25:44,716 INFO  [stdout] (ServerService Thread Pool -- 79) 09/09/26 09:25:44:716  INFO : SIALI - Agendado para executar 05:00:00A
[0m[0m09:25:44,718 INFO  [stdout] (ServerService Thread Pool -- 79) 09/09/26 09:25:44:718  INFO : SIALI - Agendado para executar 00:01:00S
[0m[0m09:25:44,749 INFO  [javax.enterprise.resource.webcontainer.jsf.config] (ServerService Thread Pool -- 79) Initializing Mojarra 2.3.14.SP06 for context ''
[0m[0m09:25:45,996 INFO  [org.primefaces.webapp.PostConstructApplicationEventListener] (ServerService Thread Pool -- 79) Running on PrimeFaces 7.0
[0m[0m09:25:45,997 INFO  [org.primefaces.extensions.application.PostConstructApplicationEventListener] (ServerService Thread Pool -- 79) Running on PrimeFaces Extensions 7.0.2
[0m[0m09:25:46,026 INFO  [stdout] (ServerService Thread Pool -- 79) 2026-09-09 09:25:46.026 [ServerService Thread Pool -- 79] INFO co.elastic.apm.agent.servlet.ServletVersionInstrumentation - Servlet container info = JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) - 2.2.24.SP1-redhat-00001
[0m[0m09:25:46,398 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 79) RESTEASY002225: Deploying javax.ws.rs.core.Application: class br.gov.caixa.siali.rest.JaxRsActivator$Proxy$_$$_WeldClientProxy
[0m[0m09:25:46,429 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 79) WFLYUT0021: Registered web context: '/' for server 'default-server'
[0m[31m09:25:46,474 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("add") failed - address: ([
    ("subsystem" => "keycloak"),
    ("secure-deployment" => "siali.war")
]) - failure description: {"WFLYCTL0080: Failed services" => {"org.wildfly.security.http-server-mechanism-factory.\"siali.war\"" => "Failed to start service
    Caused by: java.util.ConcurrentModificationException"}}
[0m[0m09:25:46,512 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0010: Deployed "siali.war" (runtime-name : "siali.war")
[0m[0m09:25:46,513 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0183: Service status report
WFLYCTL0186:   Services which failed to start:      service org.wildfly.security.http-server-mechanism-factory."siali.war": Failed to start service

[0m[0m09:25:46,602 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
[0m[31m09:25:46,604 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) started (with errors) in 18437ms - Started 1847 of 2031 services (1 services failed or missing dependencies, 361 services are lazy, passive or on-demand)
[0m[0m09:25:46,606 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://0.0.0.0:9990/management
[0m[0m09:25:46,606 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: Admin console listening on http://0.0.0.0:9990
[0m
