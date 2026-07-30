=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/java/latest/bin/java

  JAVA_OPTS:  -verbose:gc -Xloggc:"/opt/jboss/standalone/log/gc.log" -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.0.7.Final-redhat-1.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dnetworkaddress.cache.ttl=720 -XX:+AggressiveOpts -Dhttp.maxConnections=128 -Dsun.net.http.errorstream.enableBuffering=true -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sispl -Delastic.apm.environment=HMP -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sispl-canal-processamento-pix-hmp-esteiras

=========================================================================

[0m15:29:52,691 INFO  [org.jboss.modules] (main) JBoss Modules version 1.6.0.Final-redhat-1
[0m[33m15:29:52,974 WARN  [org.jboss.as.server] (main) WFLYSRV0266: Server home is set to '/opt/jboss/standalone', but server real home is '/opt/jboss-eap-7.1/standalone' - unpredictable results may occur.
[0m[0m15:29:53,003 INFO  [org.jboss.msc] (main) JBoss MSC version 1.2.7.SP1-redhat-1
[0m[0m15:29:53,226 INFO  [org.jboss.as] (MSC service thread 1-8) WFLYSRV0049: JBoss EAP 7.1.0.GA (WildFly Core 3.0.10.Final-redhat-1) starting
[0m[0m15:29:53,321 INFO  [org.jboss.vfs] (MSC service thread 1-4) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
[0m[31m15:29:55,296 ERROR [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0230: Vault is not initialized; resolution of vault expressions is not possible
[0m[0m15:29:55,309 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m15:29:55,330 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 27) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m15:29:55,330 INFO  [org.wildfly.security] (ServerService Thread Pool -- 19) ELY00001: WildFly Elytron version 1.1.7.Final-redhat-1
[0m[0m15:29:55,613 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 14) WFLYDR0001: Content added at location /opt/jboss-eap-7.1/standalone/data/content/64/b20c4bce85e7334853496c13a8bb38592ebc54/content
[0m[0m15:29:55,657 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 14) WFLYDR0001: Content added at location /opt/jboss-eap-7.1/standalone/data/content/73/f3f95d33993f968113d1ff268860bbbc737daa/content
[0m[0m15:29:55,794 INFO  [org.jboss.security] (Controller Boot Thread) PBOX00361: Default Security Vault Implementation Initialized and Ready
[0m[0m15:29:55,810 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
[0m[0m15:29:55,826 INFO  [org.xnio] (MSC service thread 1-1) XNIO version 3.5.4.Final-redhat-1
[0m[0m15:29:55,832 INFO  [org.xnio.nio] (MSC service thread 1-1) XNIO NIO Implementation Version 3.5.4.Final-redhat-1
[0m2026-07-30 15:29:55,999 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 61) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
2026-07-30 15:29:56,007 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 50) WFLYJSF0007: Activated the following JSF Implementations: [main]
2026-07-30 15:29:56,011 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 44) WFLYCLINF0001: Activating Infinispan subsystem.
2026-07-30 15:29:56,015 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 52) WFLYNAM0001: Activating Naming Subsystem
2026-07-30 15:29:56,023 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 45) WFLYRS0016: RESTEasy version 3.0.24.Final-redhat-1
2026-07-30 15:29:56,027 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 63) WFLYWS0002: Activating WebServices Extension
2026-07-30 15:29:56,100 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 60) WFLYSEC0002: Activating Security Subsystem
2026-07-30 15:29:56,112 INFO  [org.jboss.as.connector] (MSC service thread 1-5) WFLYJCA0009: Starting JCA Subsystem (WildFly/IronJacamar 1.4.6.Final-redhat-1)
2026-07-30 15:29:56,119 INFO  [org.jboss.as.security] (MSC service thread 1-8) WFLYSEC0001: Current PicketBox version=5.0.2.Final-redhat-1
2026-07-30 15:29:56,292 INFO  [org.jboss.remoting] (MSC service thread 1-1) JBoss Remoting version 5.0.5.Final-redhat-1
2026-07-30 15:29:56,292 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-6) WFLYUT0003: Undertow 1.4.18.Final-redhat-2 starting
2026-07-30 15:29:56,294 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 38) WFLYJCA0004: Deploying JDBC-compliant driver class com.ibm.db2.jcc.DB2Driver (version 4.16)
2026-07-30 15:29:56,399 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-8) WFLYJCA0018: Started Driver service with driver-name = db2
2026-07-30 15:29:56,424 INFO  [org.jboss.as.naming] (MSC service thread 1-5) WFLYNAM0003: Starting Naming Service
2026-07-30 15:29:56,499 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-7) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
2026-07-30 15:29:57,100 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0012: Started server default-server.
2026-07-30 15:29:57,106 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0018: Host default-host starting
2026-07-30 15:29:57,118 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-8) WFLYJCA0098: Bound non-transactional data source: java:/sisplDS
2026-07-30 15:29:57,293 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0006: Undertow HTTP listener default listening on 0.0.0.0:8080
2026-07-30 15:29:57,293 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) WFLYUT0006: Undertow AJP listener ajp listening on 0.0.0.0:8009
2026-07-30 15:29:57,402 INFO  [org.jboss.as.ejb3] (MSC service thread 1-3) WFLYEJB0493: EJB subsystem suspension complete
2026-07-30 15:29:57,602 INFO  [org.jboss.as.patching] (MSC service thread 1-1) WFLYPAT0050: JBoss EAP cumulative patch ID is: base, one-off patches include: none
2026-07-30 15:29:57,608 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-2) WFLYMSGAMQ0075: AIO wasn't located on this platform, it will fall back to using pure Java NIO. Your platform is Linux, install LibAIO to enable the AIO journal and achieve optimal performance.
2026-07-30 15:29:57,612 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-8) WFLYDM0111: Keystore /opt/jboss-eap-7.1/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self signed certificate for host localhost
2026-07-30 15:29:57,617 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-1) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/jboss-eap-7.1/standalone/deployments
2026-07-30 15:29:57,694 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0027: Starting deployment of "wmq.jmsra.rar" (runtime-name: "wmq.jmsra.rar")
2026-07-30 15:29:57,695 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0027: Starting deployment of "sispl-canal-processamento-pix.war" (runtime-name: "sispl-canal-processamento-pix.war")
2026-07-30 15:29:57,794 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-6) WFLYUT0006: Undertow HTTPS listener https listening on 0.0.0.0:8443
2026-07-30 15:29:57,899 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 66) AMQ221000: live Message Broker is starting with configuration Broker Configuration (clustered=false,journalDirectory=/opt/jboss-eap-7.1/standalone/data/activemq/journal,bindingsDirectory=/opt/jboss-eap-7.1/standalone/data/activemq/bindings,largeMessagesDirectory=/opt/jboss-eap-7.1/standalone/data/activemq/largemessages,pagingDirectory=/opt/jboss-eap-7.1/standalone/data/activemq/paging)
2026-07-30 15:29:58,099 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 66) AMQ221013: Using NIO Journal
2026-07-30 15:29:58,102 INFO  [org.jboss.ws.common.management] (MSC service thread 1-5) JBWS022052: Starting JBossWS 5.1.9.Final-redhat-1 (Apache CXF 3.1.12.redhat-1) 
2026-07-30 15:29:58,300 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 66) AMQ221043: Protocol module found: [artemis-server]. Adding protocol support for: CORE
2026-07-30 15:29:58,302 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 66) AMQ221043: Protocol module found: [artemis-hornetq-protocol]. Adding protocol support for: HORNETQ
2026-07-30 15:29:58,699 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-1) WFLYMSGAMQ0016: Registered HTTP upgrade for activemq-remoting protocol handled by http-acceptor-throughput acceptor
2026-07-30 15:29:58,700 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-5) WFLYMSGAMQ0016: Registered HTTP upgrade for activemq-remoting protocol handled by http-acceptor-throughput acceptor
2026-07-30 15:29:58,699 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-3) WFLYMSGAMQ0016: Registered HTTP upgrade for activemq-remoting protocol handled by http-acceptor acceptor
2026-07-30 15:29:58,699 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-2) WFLYMSGAMQ0016: Registered HTTP upgrade for activemq-remoting protocol handled by http-acceptor acceptor
2026-07-30 15:29:59,503 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 66) AMQ221007: Server is now live
2026-07-30 15:29:59,504 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 66) AMQ221001: Apache ActiveMQ Artemis Message Broker version 1.5.5.008-redhat-1 [default, nodeID=aae8209f-8c44-11f1-b440-0a58198207df] 
2026-07-30 15:29:59,506 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 66) AMQ221003: Deploying queue jms.queue.DLQ
2026-07-30 15:29:59,803 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry connector.jar in /content/wmq.jmsra.rar/com.ibm.mq.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:29:59,892 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry jta.jar in /content/wmq.jmsra.rar/com.ibm.mq.jmqi.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:29:59,893 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry ldap.jar in /content/wmq.jmsra.rar/com.ibm.mqjms.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:29:59,894 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry jndi.jar in /content/wmq.jmsra.rar/com.ibm.mqjms.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:29:59,894 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry fscontext.jar in /content/wmq.jmsra.rar/com.ibm.mqjms.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:29:59,894 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry providerutil.jar in /content/wmq.jmsra.rar/com.ibm.mqjms.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:29:59,897 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry jms.jar in /content/wmq.jmsra.rar/com.ibm.msg.client.jms.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:29:59,897 WARN  [org.apache.activemq.artemis.jms.server] (ServerService Thread Pool -- 68) AMQ122005: Invalid "host" value "0.0.0.0" detected for "http-connector" connector. Switching to "sispl-canal-processamento-pix-hmp-8674c8dc6d-gfzrj". If this new address is incorrect please manually configure the connector to use the proper one.
2026-07-30 15:29:59,899 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry rmm.jar in /content/wmq.jmsra.rar/com.ibm.msg.client.wmq.v6.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:29:59,899 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry CL3Export.jar in /content/wmq.jmsra.rar/com.ibm.msg.client.wmq.v6.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:29:59,899 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry CL3Nonexport.jar in /content/wmq.jmsra.rar/com.ibm.msg.client.wmq.v6.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:29:59,904 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-2) WFLYJCA0007: Registered connection factory java:/JmsXA
2026-07-30 15:30:00,007 INFO  [org.wildfly.extension.messaging-activemq] (ServerService Thread Pool -- 68) WFLYMSGAMQ0002: Bound messaging object to jndi name java:jboss/exported/jms/RemoteConnectionFactory
2026-07-30 15:30:00,009 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 67) AMQ221003: Deploying queue jms.queue.ExpiryQueue
2026-07-30 15:30:00,095 INFO  [org.wildfly.extension.messaging-activemq] (ServerService Thread Pool -- 69) WFLYMSGAMQ0002: Bound messaging object to jndi name java:/ConnectionFactory
2026-07-30 15:30:00,508 INFO  [org.apache.activemq.artemis.ra] (MSC service thread 1-2) Resource adaptor started
2026-07-30 15:30:00,591 INFO  [org.jboss.as.connector.services.resourceadapters.ResourceAdapterActivatorService$ResourceAdapterActivator] (MSC service thread 1-2) IJ020002: Deployed: file://RaActivatoractivemq-ra
2026-07-30 15:30:00,594 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-6) WFLYJCA0002: Bound JCA ConnectionFactory [java:/JmsXA]
2026-07-30 15:30:00,594 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-3) WFLYMSGAMQ0002: Bound messaging object to jndi name java:jboss/DefaultJMSConnectionFactory
2026-07-30 15:30:01,309 INFO  [org.jboss.as.connector.deployers.RADeployer] (MSC service thread 1-6) IJ020001: Required license terms for file:/opt/jboss-eap-7.1/standalone/tmp/vfs/temp/tempfff3155ae8f927e7/content-a851cc942b2bbc0/contents/
2026-07-30 15:30:01,892 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.mq.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.headers-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,893 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.mq.headers.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,894 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.mq.pcf.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,894 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.mq.jmqi.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,894 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry connector.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,894 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.mq.commonservices.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,895 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jms.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.jms-detail-1.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,895 INFO  [org.infinispan.factories.GlobalComponentRegistry] (MSC service thread 1-5) ISPN000128: Infinispan version: Infinispan 'Chakra' 8.2.8.Final-redhat-1
2026-07-30 15:30:01,895 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.msg.client.jms.internal.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.jms-detail-1.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,895 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.msg.client.commonservices.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.jms-detail-1.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,895 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.msg.client.provider.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.jms-detail-1.0.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,897 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jms.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.jms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,897 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.msg.client.jms.internal.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.jms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,897 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.msg.client.commonservices.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.jms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,897 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.msg.client.provider.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.jms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,898 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.msg.client.jms.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.matchspace-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,899 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry rmm.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.wmq.v6-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,899 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry CL3Export.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.wmq.v6-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,899 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry CL3Nonexport.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.wmq.v6-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,899 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry dhbcore.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.wmq.v6-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,900 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.mq.headers.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.commonservices-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,900 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.mq.pcf.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.commonservices-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,900 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.mq.jmqi.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.commonservices-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,900 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry connector.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.commonservices-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,900 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.mq.commonservices.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.commonservices-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,901 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry dhbcore.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.dhbcore-DH610-GOLD.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,902 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry pdq.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/db2jcc4-4.33.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,903 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.mq.jmqi.local.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.jmqi-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,903 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.mq.jmqi.remote.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.jmqi-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,903 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.mq.jmqi.system.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.jmqi-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,904 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jta.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.jmqi-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,906 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.mqjms.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.jms.admin-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,908 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.msg.client.jms.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.jms.internal-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,908 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.msg.client.provider.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.jms.internal-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,909 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.mq.jmqi.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.wmq-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,910 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.mq.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.pcf-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,910 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.mq.headers.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mq.pcf-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,991 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.msg.client.jms.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mqjms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,991 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.msg.client.commonservices.j2se.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mqjms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,991 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.msg.client.wmq.common.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mqjms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,991 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.msg.client.wmq.factories.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mqjms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,991 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.msg.client.wmq.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mqjms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,991 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.msg.client.wmq.v6.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mqjms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,991 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.mq.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mqjms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,991 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry ldap.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mqjms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,991 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jndi.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mqjms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,992 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry fscontext.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mqjms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,992 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry providerutil.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mqjms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,992 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.mq.jms.admin.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.mqjms-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:01,998 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry com.ibm.mq.jmqi.jar in /content/sispl-canal-processamento-pix.war/WEB-INF/lib/com.ibm.msg.client.wmq.factories-7.0.1.3.jar  does not point to a valid jar for a Class-Path reference.
2026-07-30 15:30:02,705 WARN  [org.jboss.as.connector.deployers.RADeployer] (MSC service thread 1-6) IJ020017: Invalid archive: file:/opt/jboss-eap-7.1/standalone/tmp/vfs/temp/tempfff3155ae8f927e7/content-a851cc942b2bbc0/contents/
2026-07-30 15:30:02,709 INFO  [org.jboss.as.connector.deployers.RaXmlDeployer] (MSC service thread 1-5) IJ020001: Required license terms for file:/opt/jboss-eap-7.1/standalone/tmp/vfs/temp/tempfff3155ae8f927e7/content-a851cc942b2bbc0/contents/
2026-07-30 15:30:02,792 INFO  [org.jboss.as.jpa] (MSC service thread 1-3) WFLYJPA0002: Read persistence.xml for sispl-pix-PU
2026-07-30 15:30:02,806 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-5) WFLYJCA0007: Registered connection factory java:/conn/MQ-ALTA-BR-SISPL
2026-07-30 15:30:02,807 WARN  [org.jboss.as.connector.deployers.RaXmlDeployer] (MSC service thread 1-5) IJ020016: Missing <recovery> element. XA recovery disabled for: java:/conn/MQ-ALTA-BR-SISPL
2026-07-30 15:30:03,101 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 67) WFLYJPA0010: Starting Persistence Unit (phase 1 of 2) Service 'sispl-canal-processamento-pix.war#sispl-pix-PU'
2026-07-30 15:30:03,192 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-5) WFLYJCA0006: Registered admin object at java:/jms/queueRspPix
2026-07-30 15:30:03,195 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-5) WFLYJCA0006: Registered admin object at java:/jms/queueRspPixDead
2026-07-30 15:30:03,198 WARN  [org.jboss.as.connector.deployers.RaXmlDeployer] (MSC service thread 1-5) IJ020017: Invalid archive: file:/opt/jboss-eap-7.1/standalone/tmp/vfs/temp/tempfff3155ae8f927e7/content-a851cc942b2bbc0/contents/
2026-07-30 15:30:03,201 INFO  [org.jboss.as.connector.deployers.RaXmlDeployer] (MSC service thread 1-5) IJ020002: Deployed: file:/opt/jboss-eap-7.1/standalone/tmp/vfs/temp/tempfff3155ae8f927e7/content-a851cc942b2bbc0/contents/
2026-07-30 15:30:03,202 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-7) WFLYJCA0002: Bound JCA AdminObject [java:/jms/queueRspPix]
2026-07-30 15:30:03,202 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-1) WFLYJCA0002: Bound JCA ConnectionFactory [java:/conn/MQ-ALTA-BR-SISPL]
2026-07-30 15:30:03,203 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-1) WFLYJCA0002: Bound JCA AdminObject [java:/jms/queueRspPixDead]
2026-07-30 15:30:03,208 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 67) HHH000204: Processing PersistenceUnitInfo [
	name: sispl-pix-PU
	...]
2026-07-30 15:30:03,499 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 69) WFLYCLINF0002: Started client-mappings cache from ejb container
2026-07-30 15:30:03,503 INFO  [org.jboss.weld.deployer] (MSC service thread 1-4) WFLYWELD0003: Processing weld deployment sispl-canal-processamento-pix.war
2026-07-30 15:30:03,611 INFO  [org.hibernate.Version] (ServerService Thread Pool -- 67) HHH000412: Hibernate Core {5.1.10.Final-redhat-1}
2026-07-30 15:30:03,612 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 67) HHH000206: hibernate.properties not found
2026-07-30 15:30:03,613 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 67) HHH000021: Bytecode provider name : javassist
2026-07-30 15:30:03,702 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-4) HV000001: Hibernate Validator 5.3.5.Final-redhat-2
2026-07-30 15:30:03,728 INFO  [org.hibernate.annotations.common.Version] (ServerService Thread Pool -- 67) HCANN000001: Hibernate Commons Annotations {5.0.1.Final-redhat-2}
2026-07-30 15:30:03,998 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'PersistenciaRejeicaoPix' in deployment unit 'deployment "sispl-canal-processamento-pix.war"' are as follows:

	java:global/sispl-canal-loterico-pix-processamento/PersistenciaRejeicaoPix!br.gov.caixa.sispl.pix.dao.impl.PersistenciaRejeicaoPix
	java:app/sispl-canal-loterico-pix-processamento/PersistenciaRejeicaoPix!br.gov.caixa.sispl.pix.dao.impl.PersistenciaRejeicaoPix
	java:module/PersistenciaRejeicaoPix!br.gov.caixa.sispl.pix.dao.impl.PersistenciaRejeicaoPix
	java:global/sispl-canal-loterico-pix-processamento/PersistenciaRejeicaoPix
	java:app/sispl-canal-loterico-pix-processamento/PersistenciaRejeicaoPix
	java:module/PersistenciaRejeicaoPix

2026-07-30 15:30:03,998 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'AuditorRspPixBean' in deployment unit 'deployment "sispl-canal-processamento-pix.war"' are as follows:

	java:global/sispl-canal-loterico-pix-processamento/AuditorRspPixBean!br.gov.caixa.sispl.pix.processamento.AuditorRspPixLocal
	java:app/sispl-canal-loterico-pix-processamento/AuditorRspPixBean!br.gov.caixa.sispl.pix.processamento.AuditorRspPixLocal
	java:module/AuditorRspPixBean!br.gov.caixa.sispl.pix.processamento.AuditorRspPixLocal
	java:global/sispl-canal-loterico-pix-processamento/AuditorRspPixBean
	java:app/sispl-canal-loterico-pix-processamento/AuditorRspPixBean
	java:module/AuditorRspPixBean

2026-07-30 15:30:03,998 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'NegocioProcessamentoPix' in deployment unit 'deployment "sispl-canal-processamento-pix.war"' are as follows:

	java:global/sispl-canal-loterico-pix-processamento/NegocioProcessamentoPix!br.gov.caixa.sispl.pix.processamento.negocio.NegocioProcessamentoPix
	java:app/sispl-canal-loterico-pix-processamento/NegocioProcessamentoPix!br.gov.caixa.sispl.pix.processamento.negocio.NegocioProcessamentoPix
	java:module/NegocioProcessamentoPix!br.gov.caixa.sispl.pix.processamento.negocio.NegocioProcessamentoPix
	java:global/sispl-canal-loterico-pix-processamento/NegocioProcessamentoPix
	java:app/sispl-canal-loterico-pix-processamento/NegocioProcessamentoPix
	java:module/NegocioProcessamentoPix

2026-07-30 15:30:03,998 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'PersistenciaDevolucaoPix' in deployment unit 'deployment "sispl-canal-processamento-pix.war"' are as follows:

	java:global/sispl-canal-loterico-pix-processamento/PersistenciaDevolucaoPix!br.gov.caixa.sispl.pix.dao.impl.PersistenciaDevolucaoPix
	java:app/sispl-canal-loterico-pix-processamento/PersistenciaDevolucaoPix!br.gov.caixa.sispl.pix.dao.impl.PersistenciaDevolucaoPix
	java:module/PersistenciaDevolucaoPix!br.gov.caixa.sispl.pix.dao.impl.PersistenciaDevolucaoPix
	java:global/sispl-canal-loterico-pix-processamento/PersistenciaDevolucaoPix
	java:app/sispl-canal-loterico-pix-processamento/PersistenciaDevolucaoPix
	java:module/PersistenciaDevolucaoPix

2026-07-30 15:30:03,998 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: JNDI bindings for session bean named 'PersistenciaPix' in deployment unit 'deployment "sispl-canal-processamento-pix.war"' are as follows:

	java:global/sispl-canal-loterico-pix-processamento/PersistenciaPix!br.gov.caixa.sispl.pix.dao.impl.PersistenciaPix
	java:app/sispl-canal-loterico-pix-processamento/PersistenciaPix!br.gov.caixa.sispl.pix.dao.impl.PersistenciaPix
	java:module/PersistenciaPix!br.gov.caixa.sispl.pix.dao.impl.PersistenciaPix
	java:global/sispl-canal-loterico-pix-processamento/PersistenciaPix
	java:app/sispl-canal-loterico-pix-processamento/PersistenciaPix
	java:module/PersistenciaPix

2026-07-30 15:30:04,895 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-6) WFLYJCA0004: Deploying JDBC-compliant driver class com.ibm.db2.jcc.DB2Driver (version 4.33)
2026-07-30 15:30:04,916 INFO  [org.jboss.weld.Version] (MSC service thread 1-6) WELD-000900: 2.4.3 (redhat)
2026-07-30 15:30:05,007 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-8) WFLYJCA0018: Started Driver service with driver-name = sispl-canal-processamento-pix.war_com.ibm.db2.jcc.DB2Driver_4_33
2026-07-30 15:30:05,106 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0042: Started message driven bean 'AuditorRspPix' with 'wmq.jmsra.rar' resource adapter
2026-07-30 15:30:05,234 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 67) WFLYJPA0010: Starting Persistence Unit (phase 2 of 2) Service 'sispl-canal-processamento-pix.war#sispl-pix-PU'
2026-07-30 15:30:06,418 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 67) HHH000400: Using dialect: br.gov.caixa.sispl.pix.dominio.hibernate.DB2CorrectedHibernateDialect
2026-07-30 15:30:06,541 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 67) Envers integration enabled? : true
2026-07-30 15:30:08,239 INFO  [javax.enterprise.resource.webcontainer.jsf.config] (ServerService Thread Pool -- 69) Initializing Mojarra 2.2.13.SP4  for context '/sispl-canal-loterico-pix-processamento'
2026-07-30 15:30:09,841 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 69) WFLYUT0021: Registered web context: '/sispl-canal-loterico-pix-processamento' for server 'default-server'
2026-07-30 15:30:09,851 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 39) WFLYSRV0010: Deployed "wmq.jmsra.rar" (runtime-name : "wmq.jmsra.rar")
2026-07-30 15:30:09,852 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 39) WFLYSRV0010: Deployed "sispl-canal-processamento-pix.war" (runtime-name : "sispl-canal-processamento-pix.war")
2026-07-30 15:30:09,992 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
2026-07-30 15:32:19,091 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://127.0.0.1:9990/management
2026-07-30 15:32:19,091 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: Admin console listening on http://127.0.0.1:9990
2026-07-30 15:32:19,091 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.1.0.GA (WildFly Core 3.0.10.Final-redhat-1) started in 146791ms - Started 619 of 845 services (371 services are lazy, passive or on-demand)
