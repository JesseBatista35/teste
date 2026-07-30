=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/java/latest/bin/java

  JAVA_OPTS:  -verbose:gc -Xloggc:"/opt/jboss/standalone/log/gc.log" -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.0.7.Final-redhat-1.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dnetworkaddress.cache.ttl=720 -XX:+AggressiveOpts -Dhttp.maxConnections=128 -Dsun.net.http.errorstream.enableBuffering=true -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sispl -Delastic.apm.environment=HMP -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sispl-canal-processamento-pix-hmp-esteiras

=========================================================================

[0m15:54:25,441 INFO  [org.jboss.modules] (main) JBoss Modules version 1.6.0.Final-redhat-1
[0m[33m15:54:25,759 WARN  [org.jboss.as.server] (main) WFLYSRV0266: Server home is set to '/opt/jboss/standalone', but server real home is '/opt/jboss-eap-7.1/standalone' - unpredictable results may occur.
[0m[0m15:54:25,772 INFO  [org.jboss.msc] (main) JBoss MSC version 1.2.7.SP1-redhat-1
[0m[0m15:54:26,022 INFO  [org.jboss.as] (MSC service thread 1-8) WFLYSRV0049: JBoss EAP 7.1.0.GA (WildFly Core 3.0.10.Final-redhat-1) starting
[0m[0m15:54:26,112 INFO  [org.jboss.vfs] (MSC service thread 1-7) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
[0m[31m15:54:27,820 ERROR [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0230: Vault is not initialized; resolution of vault expressions is not possible
[0m[0m15:54:27,827 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m15:54:27,842 INFO  [org.wildfly.security] (ServerService Thread Pool -- 2) ELY00001: WildFly Elytron version 1.1.7.Final-redhat-1
[0m[0m15:54:27,845 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 16) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m15:54:28,125 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 5) WFLYDR0001: Content added at location /opt/jboss-eap-7.1/standalone/data/content/64/b20c4bce85e7334853496c13a8bb38592ebc54/content
[0m[0m15:54:28,165 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 5) WFLYDR0001: Content added at location /opt/jboss-eap-7.1/standalone/data/content/73/f3f95d33993f968113d1ff268860bbbc737daa/content
[0m[0m15:54:28,314 INFO  [org.jboss.security] (Controller Boot Thread) PBOX00361: Default Security Vault Implementation Initialized and Ready
[0m[0m15:54:28,328 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
[0m[0m15:54:28,342 INFO  [org.xnio] (MSC service thread 1-3) XNIO version 3.5.4.Final-redhat-1
[0m[0m15:54:28,347 INFO  [org.xnio.nio] (MSC service thread 1-3) XNIO NIO Implementation Version 3.5.4.Final-redhat-1
[0m2026-07-30 15:54:28,420 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 44) WFLYCLINF0001: Activating Infinispan subsystem.
2026-07-30 15:54:28,425 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 50) WFLYJSF0007: Activated the following JSF Implementations: [main]
2026-07-30 15:54:28,501 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 61) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
2026-07-30 15:54:28,509 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 52) WFLYNAM0001: Activating Naming Subsystem
2026-07-30 15:54:28,523 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 60) WFLYSEC0002: Activating Security Subsystem
2026-07-30 15:54:28,524 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 45) WFLYRS0016: RESTEasy version 3.0.24.Final-redhat-1
2026-07-30 15:54:28,532 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 63) WFLYWS0002: Activating WebServices Extension
2026-07-30 15:54:28,608 INFO  [org.jboss.as.security] (MSC service thread 1-2) WFLYSEC0001: Current PicketBox version=5.0.2.Final-redhat-1
2026-07-30 15:54:28,611 INFO  [org.jboss.as.connector] (MSC service thread 1-6) WFLYJCA0009: Starting JCA Subsystem (WildFly/IronJacamar 1.4.6.Final-redhat-1)
2026-07-30 15:54:28,741 INFO  [org.jboss.as.naming] (MSC service thread 1-6) WFLYNAM0003: Starting Naming Service
2026-07-30 15:54:28,727 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-8) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
2026-07-30 15:54:28,808 INFO  [org.jboss.remoting] (MSC service thread 1-1) JBoss Remoting version 5.0.5.Final-redhat-1
2026-07-30 15:54:28,812 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 38) WFLYJCA0004: Deploying JDBC-compliant driver class com.ibm.db2.jcc.DB2Driver (version 4.16)
2026-07-30 15:54:28,814 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Started Driver service with driver-name = db2
2026-07-30 15:54:28,820 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-7) WFLYUT0003: Undertow 1.4.18.Final-redhat-2 starting
2026-07-30 15:54:29,519 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0012: Started server default-server.
2026-07-30 15:54:29,521 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0018: Host default-host starting
2026-07-30 15:54:29,621 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-3) WFLYJCA0098: Bound non-transactional data source: java:/sisplDS
2026-07-30 15:54:29,705 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-7) WFLYUT0006: Undertow AJP listener ajp listening on 0.0.0.0:8009
2026-07-30 15:54:29,705 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: Undertow HTTP listener default listening on 0.0.0.0:8080
2026-07-30 15:54:29,719 INFO  [org.jboss.as.ejb3] (MSC service thread 1-4) WFLYEJB0493: EJB subsystem suspension complete
2026-07-30 15:54:30,019 INFO  [org.jboss.as.patching] (MSC service thread 1-7) WFLYPAT0050: JBoss EAP cumulative patch ID is: base, one-off patches include: none
2026-07-30 15:54:30,104 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-1) WFLYMSGAMQ0075: AIO wasn't located on this platform, it will fall back to using pure Java NIO. Your platform is Linux, install LibAIO to enable the AIO journal and achieve optimal performance.
2026-07-30 15:54:30,112 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-7) WFLYDM0111: Keystore /opt/jboss-eap-7.1/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self signed certificate for host localhost
2026-07-30 15:54:30,123 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-8) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/jboss-eap-7.1/standalone/deployments
2026-07-30 15:54:30,208 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0027: Starting deployment of "sispl-canal-processamento-pix.war" (runtime-name: "sispl-canal-processamento-pix.war")
2026-07-30 15:54:30,209 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0027: Starting deployment of "wmq.jmsra.rar" (runtime-name: "wmq.jmsra.rar")
2026-07-30 15:54:30,299 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) WFLYUT0006: Undertow HTTPS listener https listening on 0.0.0.0:8443
2026-07-30 15:54:30,409 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 66) AMQ221000: live Message Broker is starting with configuration Broker Configuration (clustered=false,journalDirectory=/opt/jboss-eap-7.1/standalone/data/activemq/journal,bindingsDirectory=/opt/jboss-eap-7.1/standalone/data/activemq/bindings,largeMessagesDirectory=/opt/jboss-eap-7.1/standalone/data/activemq/largemessages,pagingDirectory=/opt/jboss-eap-7.1/standalone/data/activemq/paging)
2026-07-30 15:54:30,518 INFO  [org.jboss.ws.common.management] (MSC service thread 1-4) JBWS022052: Starting JBossWS 5.1.9.Final-redhat-1 (Apache CXF 3.1.12.redhat-1) 
2026-07-30 15:54:30,518 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 66) AMQ221013: Using NIO Journal
2026-07-30 15:54:30,629 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 66) AMQ221043: Protocol module found: [artemis-server]. Adding protocol support for: CORE
2026-07-30 15:54:30,630 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 66) AMQ221043: Protocol module found: [artemis-hornetq-protocol]. Adding protocol support for: HORNETQ
2026-07-30 15:54:30,900 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-1) WFLYMSGAMQ0016: Registered HTTP upgrade for activemq-remoting protocol handled by http-acceptor-throughput acceptor
2026-07-30 15:54:30,901 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-3) WFLYMSGAMQ0016: Registered HTTP upgrade for activemq-remoting protocol handled by http-acceptor acceptor
2026-07-30 15:54:30,900 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-6) WFLYMSGAMQ0016: Registered HTTP upgrade for activemq-remoting protocol handled by http-acceptor-throughput acceptor
2026-07-30 15:54:30,901 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-4) WFLYMSGAMQ0016: Registered HTTP upgrade for activemq-remoting protocol handled by http-acceptor acceptor
2026-07-30 15:54:31,701 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 66) AMQ221007: Server is now live
2026-07-30 15:54:31,701 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 66) AMQ221001: Apache ActiveMQ Artemis Message Broker version 1.5.5.008-redhat-1 [default, nodeID=1896682a-8c48-11f1-9951-0a5819830075] 
2026-07-30 15:54:31,705 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 66) AMQ221003: Deploying queue jms.queue.ExpiryQueue
2026-07-30 15:54:32,110 INFO  [org.wildfly.extension.messaging-activemq] (ServerService Thread Pool -- 68) WFLYMSGAMQ0002: Bound messaging object to jndi name java:/ConnectionFactory
2026-07-30 15:54:32,112 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) WFLYJCA0007: Registered connection factory java:/JmsXA
2026-07-30 15:54:32,112 WARN  [org.apache.activemq.artemis.jms.server] (ServerService Thread Pool -- 69) AMQ122005: Invalid "host" value "0.0.0.0" detected for "http-connector" connector. Switching to "sispl-canal-processamento-pix-hmp-6cf5c667dd-lvggt". If this new address is incorrect please manually configure the connector to use the proper one.
2026-07-30 15:54:32,112 INFO  [org.wildfly.extension.messaging-activemq] (ServerService Thread Pool -- 69) WFLYMSGAMQ0002: Bound messaging object to jndi name java:jboss/exported/jms/RemoteConnectionFactory
2026-07-30 15:54:32,113 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 67) AMQ221003: Deploying queue jms.queue.DLQ
2026-07-30 15:54:32,310 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry connector.jar in /content/wmq.jmsra.rar/com.ibm.mq.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:32,317 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jta.jar in /content/wmq.jmsra.rar/com.ibm.mq.jmqi.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:32,318 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry ldap.jar in /content/wmq.jmsra.rar/com.ibm.mqjms.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:32,318 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jndi.jar in /content/wmq.jmsra.rar/com.ibm.mqjms.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:32,318 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry fscontext.jar in /content/wmq.jmsra.rar/com.ibm.mqjms.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:32,318 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry providerutil.jar in /content/wmq.jmsra.rar/com.ibm.mqjms.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:32,400 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jms.jar in /content/wmq.jmsra.rar/com.ibm.msg.client.jms.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:32,401 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry rmm.jar in /content/wmq.jmsra.rar/com.ibm.msg.client.wmq.v6.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:32,401 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry CL3Export.jar in /content/wmq.jmsra.rar/com.ibm.msg.client.wmq.v6.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:32,401 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry CL3Nonexport.jar in /content/wmq.jmsra.rar/com.ibm.msg.client.wmq.v6.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:32,603 INFO  [org.apache.activemq.artemis.ra] (MSC service thread 1-3) Resource adaptor started
2026-07-30 15:54:32,605 INFO  [org.jboss.as.connector.services.resourceadapters.ResourceAdapterActivatorService$ResourceAdapterActivator] (MSC service thread 1-3) IJ020002: Deployed: file://RaActivatoractivemq-ra
2026-07-30 15:54:32,607 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-8) WFLYMSGAMQ0002: Bound messaging object to jndi name java:jboss/DefaultJMSConnectionFactory
2026-07-30 15:54:32,606 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-4) WFLYJCA0002: Bound JCA ConnectionFactory [java:/JmsXA]
2026-07-30 15:54:33,512 INFO  [org.jboss.as.connector.deployers.RADeployer] (MSC service thread 1-2) IJ020001: Required license terms for file:/opt/jboss-eap-7.1/standalone/tmp/vfs/temp/temp508ef4415500f5c4/content-2abd9de8d56408f3/contents/
2026-07-30 15:54:34,100 INFO  [org.infinispan.factories.GlobalComponentRegistry] (MSC service thread 1-6) ISPN000128: Infinispan version: Infinispan 'Chakra' 8.2.8.Final-redhat-1
2026-07-30 15:54:34,113 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.mq.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.headers-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.mq.headers.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,198 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.mq.pcf.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,198 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.mq.jmqi.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,198 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry connector.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,198 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.mq.commonservices.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,199 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry jms.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.jms-detail-1.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,200 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.msg.client.jms.internal.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.jms-detail-1.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,200 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.msg.client.commonservices.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.jms-detail-1.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,200 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.msg.client.provider.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.jms-detail-1.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,201 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry jms.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.jms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,201 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.msg.client.jms.internal.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.jms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,201 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.msg.client.commonservices.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.jms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,201 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.msg.client.provider.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.jms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,202 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.msg.client.jms.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.matchspace-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,203 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry rmm.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.wmq.v6-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,203 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry CL3Export.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.wmq.v6-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,203 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry CL3Nonexport.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.wmq.v6-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,203 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry dhbcore.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.wmq.v6-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,204 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.mq.headers.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.commonservices-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,204 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.mq.pcf.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.commonservices-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,204 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.mq.jmqi.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.commonservices-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,204 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry connector.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.commonservices-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,204 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.mq.commonservices.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.commonservices-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,204 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry dhbcore.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.dhbcore-DH610-GOLD.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,205 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry pdq.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/db2jcc4-4.33.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,207 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.mq.jmqi.local.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.jmqi-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,207 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.mq.jmqi.remote.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.jmqi-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,207 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.mq.jmqi.system.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.jmqi-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,207 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry jta.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.jmqi-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,208 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.mqjms.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.jms.admin-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,210 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.msg.client.jms.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.jms.internal-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,211 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.msg.client.provider.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.jms.internal-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,212 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.mq.jmqi.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.wmq-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,213 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.mq.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.pcf-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,214 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.mq.headers.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.pcf-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,215 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.msg.client.jms.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mqjms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,215 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.msg.client.commonservices.j2se.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mqjms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,215 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.msg.client.wmq.common.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mqjms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,215 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.msg.client.wmq.factories.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mqjms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,215 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.msg.client.wmq.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mqjms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,215 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.msg.client.wmq.v6.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mqjms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,215 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.mq.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mqjms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,215 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry ldap.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mqjms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,215 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry jndi.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mqjms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,215 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry fscontext.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mqjms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,215 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry providerutil.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mqjms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,215 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.mq.jms.admin.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mqjms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,300 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry com.ibm.mq.jmqi.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.wmq.factories-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:54:34,712 WARN  [org.jboss.as.connector.deployers.RADeployer] (MSC service thread 1-2) IJ020017: Invalid archive: file:/opt/jboss-eap-7.1/standalone/tmp/vfs/temp/temp508ef4415500f5c4/content-2abd9de8d56408f3/contents/
2026-07-30 15:54:34,715 INFO  [org.jboss.as.connector.deployers.RaXmlDeployer] (MSC service thread 1-2) IJ020001: Required license terms for file:/opt/jboss-eap-7.1/standalone/tmp/vfs/temp/temp508ef4415500f5c4/content-2abd9de8d56408f3/contents/
2026-07-30 15:54:34,810 INFO  [org.jboss.as.jpa] (MSC service thread 1-8) WFLYJPA0002: Read persistence.xml for sispl-pix-PU
2026-07-30 15:54:34,810 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-2) WFLYJCA0007: Registered connection factory java:/conn/MQ-ALTA-BR-SISPL
2026-07-30 15:54:34,810 WARN  [org.jboss.as.connector.deployers.RaXmlDeployer] (MSC service thread 1-2) IJ020016: Missing <recovery> element. XA recovery disabled for: java:/conn/MQ-ALTA-BR-SISPL
2026-07-30 15:54:35,002 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-2) WFLYJCA0006: Registered admin object at java:/jms/queueRspPix
2026-07-30 15:54:35,004 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-2) WFLYJCA0006: Registered admin object at java:/jms/queueRspPixDead
2026-07-30 15:54:35,005 WARN  [org.jboss.as.connector.deployers.RaXmlDeployer] (MSC service thread 1-2) IJ020017: Invalid archive: file:/opt/jboss-eap-7.1/standalone/tmp/vfs/temp/temp508ef4415500f5c4/content-2abd9de8d56408f3/contents/
2026-07-30 15:54:35,007 INFO  [org.jboss.as.connector.deployers.RaXmlDeployer] (MSC service thread 1-2) IJ020002: Deployed: file:/opt/jboss-eap-7.1/standalone/tmp/vfs/temp/temp508ef4415500f5c4/content-2abd9de8d56408f3/contents/
2026-07-30 15:54:35,008 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-6) WFLYJCA0002: Bound JCA ConnectionFactory [java:/conn/MQ-ALTA-BR-SISPL]
2026-07-30 15:54:35,008 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-1) WFLYJCA0002: Bound JCA AdminObject [java:/jms/queueRspPix]
2026-07-30 15:54:35,008 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-7) WFLYJCA0002: Bound JCA AdminObject [java:/jms/queueRspPixDead]
2026-07-30 15:54:35,100 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 69) WFLYJPA0010: Starting Persistence Unit (phase 1 of 2) Service 'sispl-canal-processamento-pix.war#sispl-pix-PU'
2026-07-30 15:54:35,118 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 69) HHH000204: Processing PersistenceUnitInfo [
	name: sispl-pix-PU
	...]
2026-07-30 15:54:35,314 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 67) WFLYCLINF0002: Started client-mappings cache from ejb container
2026-07-30 15:54:35,417 INFO  [org.jboss.weld.deployer] (MSC service thread 1-4) WFLYWELD0003: Processing weld deployment sispl-canal-processamento-pix.war
2026-07-30 15:54:35,425 INFO  [org.hibernate.Version] (ServerService Thread Pool -- 69) HHH000412: Hibernate Core {5.1.10.Final-redhat-1}
2026-07-30 15:54:35,427 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 69) HHH000206: hibernate.properties not found
2026-07-30 15:54:35,428 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 69) HHH000021: Bytecode provider name : javassist
2026-07-30 15:54:35,520 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-4) HV000001: Hibernate Validator 5.3.5.Final-redhat-2
2026-07-30 15:54:35,526 INFO  [org.hibernate.annotations.common.Version] (ServerService Thread Pool -- 69) HCANN000001: Hibernate Commons Annotations {5.0.1.Final-redhat-2}
2026-07-30 15:54:35,807 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'PersistenciaRejeicaoPix' in deployment unit 'deployment "sispl-canal-processamento-pix.war"' are as follows:

	java:global/sispl-canal-loterico-pix-processamento/PersistenciaRejeicaoPix!br.gov.caixa.sispl.pix.dao.impl.PersistenciaRejeicaoPix
	java:app/sispl-canal-loterico-pix-processamento/PersistenciaRejeicaoPix!br.gov.caixa.sispl.pix.dao.impl.PersistenciaRejeicaoPix
	java:module/PersistenciaRejeicaoPix!br.gov.caixa.sispl.pix.dao.impl.PersistenciaRejeicaoPix
	java:global/sispl-canal-loterico-pix-processamento/PersistenciaRejeicaoPix
	java:app/sispl-canal-loterico-pix-processamento/PersistenciaRejeicaoPix
	java:module/PersistenciaRejeicaoPix

2026-07-30 15:54:35,807 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'AuditorRspPixBean' in deployment unit 'deployment "sispl-canal-processamento-pix.war"' are as follows:

	java:global/sispl-canal-loterico-pix-processamento/AuditorRspPixBean!br.gov.caixa.sispl.pix.processamento.AuditorRspPixLocal
	java:app/sispl-canal-loterico-pix-processamento/AuditorRspPixBean!br.gov.caixa.sispl.pix.processamento.AuditorRspPixLocal
	java:module/AuditorRspPixBean!br.gov.caixa.sispl.pix.processamento.AuditorRspPixLocal
	java:global/sispl-canal-loterico-pix-processamento/AuditorRspPixBean
	java:app/sispl-canal-loterico-pix-processamento/AuditorRspPixBean
	java:module/AuditorRspPixBean

2026-07-30 15:54:35,807 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'NegocioProcessamentoPix' in deployment unit 'deployment "sispl-canal-processamento-pix.war"' are as follows:

	java:global/sispl-canal-loterico-pix-processamento/NegocioProcessamentoPix!br.gov.caixa.sispl.pix.processamento.negocio.NegocioProcessamentoPix
	java:app/sispl-canal-loterico-pix-processamento/NegocioProcessamentoPix!br.gov.caixa.sispl.pix.processamento.negocio.NegocioProcessamentoPix
	java:module/NegocioProcessamentoPix!br.gov.caixa.sispl.pix.processamento.negocio.NegocioProcessamentoPix
	java:global/sispl-canal-loterico-pix-processamento/NegocioProcessamentoPix
	java:app/sispl-canal-loterico-pix-processamento/NegocioProcessamentoPix
	java:module/NegocioProcessamentoPix

2026-07-30 15:54:35,807 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'PersistenciaDevolucaoPix' in deployment unit 'deployment "sispl-canal-processamento-pix.war"' are as follows:

	java:global/sispl-canal-loterico-pix-processamento/PersistenciaDevolucaoPix!br.gov.caixa.sispl.pix.dao.impl.PersistenciaDevolucaoPix
	java:app/sispl-canal-loterico-pix-processamento/PersistenciaDevolucaoPix!br.gov.caixa.sispl.pix.dao.impl.PersistenciaDevolucaoPix
	java:module/PersistenciaDevolucaoPix!br.gov.caixa.sispl.pix.dao.impl.PersistenciaDevolucaoPix
	java:global/sispl-canal-loterico-pix-processamento/PersistenciaDevolucaoPix
	java:app/sispl-canal-loterico-pix-processamento/PersistenciaDevolucaoPix
	java:module/PersistenciaDevolucaoPix

2026-07-30 15:54:35,807 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'PersistenciaPix' in deployment unit 'deployment "sispl-canal-processamento-pix.war"' are as follows:

	java:global/sispl-canal-loterico-pix-processamento/PersistenciaPix!br.gov.caixa.sispl.pix.dao.impl.PersistenciaPix
	java:app/sispl-canal-loterico-pix-processamento/PersistenciaPix!br.gov.caixa.sispl.pix.dao.impl.PersistenciaPix
	java:module/PersistenciaPix!br.gov.caixa.sispl.pix.dao.impl.PersistenciaPix
	java:global/sispl-canal-loterico-pix-processamento/PersistenciaPix
	java:app/sispl-canal-loterico-pix-processamento/PersistenciaPix
	java:module/PersistenciaPix

2026-07-30 15:54:36,602 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-4) WFLYJCA0004: Deploying JDBC-compliant driver class com.ibm.db2.jcc.DB2Driver (version 4.33)
2026-07-30 15:54:36,620 INFO  [org.jboss.weld.Version] (MSC service thread 1-4) WELD-000900: 2.4.3 (redhat)
2026-07-30 15:54:36,714 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-6) WFLYJCA0018: Started Driver service with driver-name = sispl-canal-processamento-pix.war_com.ibm.db2.jcc.DB2Driver_4_33
2026-07-30 15:54:36,824 INFO  [org.jboss.as.ejb3] (MSC service thread 1-7) WFLYEJB0042: Started message driven bean 'AuditorRspPix' with 'wmq.jmsra.rar' resource adapter
2026-07-30 15:54:36,951 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 69) WFLYJPA0010: Starting Persistence Unit (phase 2 of 2) Service 'sispl-canal-processamento-pix.war#sispl-pix-PU'
2026-07-30 15:54:38,023 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 69) HHH000400: Using dialect: br.gov.caixa.sispl.pix.dominio.hibernate.DB2CorrectedHibernateDialect
2026-07-30 15:54:38,207 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 69) Envers integration enabled? : true
2026-07-30 15:54:39,496 INFO  [javax.enterprise.resource.webcontainer.jsf.config] (ServerService Thread Pool -- 76) Initializing Mojarra 2.2.13.SP4  for context '/sispl-canal-loterico-pix-processamento'
2026-07-30 15:54:40,827 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 76) WFLYUT0021: Registered web context: '/sispl-canal-loterico-pix-processamento' for server 'default-server'
2026-07-30 15:54:40,835 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 39) WFLYSRV0010: Deployed "wmq.jmsra.rar" (runtime-name : "wmq.jmsra.rar")
2026-07-30 15:54:40,835 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 39) WFLYSRV0010: Deployed "sispl-canal-processamento-pix.war" (runtime-name : "sispl-canal-processamento-pix.war")
2026-07-30 15:54:40,909 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server



