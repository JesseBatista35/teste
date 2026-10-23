=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.372.b07-1.el7_9.x86_64/jre/bin/java

  JAVA_OPTS:  -verbose:gc -Xloggc:"/opt/jboss/standalone/log/gc.log" -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx1024m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration//opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sicow.jks -Djavax.net.ssl.trustStorePassword=changeit -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/jboss/standalone/deployments/applicationinsights-agent-3.7.1.jar -Djava.net.useSystemProxies=false -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=localhost\|127.0.0.1\|*.caixa 

=========================================================================

OpenJDK 64-Bit Server VM warning: If the number of processors is expected to increase from one, then you should configure the number of parallel GC threads appropriately using -XX:ParallelGCThreads=N
2026-10-22 17:37:14.575-03:00 WARN  i.o.s.a.ResourceConfiguration - Found reference to io.opentelemetry.sdk.autoconfigure.internal.EnvironmentResourceProvider in otel.java.enabled.resource.providers. Please update to io.opentelemetry.sdk.autoconfigure.EnvironmentResourceProvider. Support for the old provider name will be removed after 1.49.0.
2026-10-22 17:37:32.539-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.7.1 started successfully (PID 171, JVM running for 32.658 s)
2026-10-22 17:37:32.541-03:00 INFO  c.m.applicationinsights.agent - Java version: 1.8.0_372, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.372.b07-1.el7_9.x86_64/jre
[0m17:37:33,914 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.0.Final-redhat-00001
[0m[0m17:37:35,209 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.12.Final-redhat-00001
[0m[0m17:37:35,327 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
[0m[0m17:37:35,906 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) starting
[0m[0m17:37:36,121 INFO  [org.jboss.vfs] (MSC service thread 1-2) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
[0m[0m17:37:39,909 INFO  [org.wildfly.security] (ServerService Thread Pool -- 31) ELY00001: WildFly Elytron version 1.15.16.Final-redhat-00001
[0m[0m17:37:40,805 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 33) WFLYCTL0033: Extension 'security' is deprecated and may not be supported in future versions
[0m[0m17:37:42,343 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=native-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m17:37:42,345 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m17:37:42,427 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 9) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m17:37:43,241 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 38) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/43/10e3eda419b2f2c7d4fb432f9cf7908f535920/content
[0m[0m17:37:43,741 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 38) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/e1/adf087cf9c9f7bb41452a1008f77e2b2b8e435/content
[0m[0m17:37:44,225 INFO  [org.jboss.security] (Controller Boot Thread) PBOX00361: Default Security Vault Implementation Initialized and Ready
[0m[0m17:37:44,244 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
[0m[0m17:37:44,307 INFO  [org.xnio] (MSC service thread 1-1) XNIO version 3.8.9.Final-redhat-00001
[0m[0m17:37:44,317 INFO  [org.xnio.nio] (MSC service thread 1-1) XNIO NIO Implementation Version 3.8.9.Final-redhat-00001
[0m[33m17:37:44,425 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 60) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
[0m[0m17:37:44,606 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 42) WFLYCLINF0001: Activating Infinispan subsystem.
[0m[0m17:37:44,606 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 43) WFLYIO001: Worker 'default' has auto-configured to 2 IO threads with 16 max task threads based on your 1 available processors
[0m[0m17:37:44,610 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 58) WFLYSEC0002: Activating Security Subsystem
[0m[0m17:37:44,612 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 52) WFLYNAM0001: Activating Naming Subsystem
[0m[0m17:37:44,613 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 62) WFLYWS0002: Activating WebServices Extension
[0m[0m17:37:44,614 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 44) WFLYRS0016: RESTEasy version 3.15.7.Final-redhat-00001
[0m[0m17:37:44,708 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 49) WFLYJSF0007: Activated the following Jakarta Server Faces Implementations: [main]
[0m[0m17:37:44,910 INFO  [org.jboss.as.security] (MSC service thread 1-2) WFLYSEC0001: Current PicketBox version=5.0.3.Final-redhat-00009
[0m[0m17:37:45,005 INFO  [org.jboss.as.connector] (MSC service thread 1-1) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 1.5.11.Final-redhat-00001)
[0m[33m17:37:45,411 WARN  [org.wildfly.clustering.web.undertow] (ServerService Thread Pool -- 61) WFLYCLWEBUT0007: No routing provider found for default-server; using legacy provider based on static configuration
[0m[0m17:37:45,413 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 17) WFLYJCA0005: Deploying non-JDBC-compliant driver class org.postgresql.Driver (version 42.2)
[0m[0m17:37:45,811 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0003: Undertow 2.2.24.SP1-redhat-00001 starting
[0m[0m17:37:46,010 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 17) WFLYJCA0004: Deploying JDBC-compliant driver class org.h2.Driver (version 1.4)
[0m[0m17:37:46,611 INFO  [org.jboss.remoting] (MSC service thread 1-1) JBoss Remoting version 5.0.27.Final-redhat-00001
[0m[0m17:37:46,804 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 61) WFLYUT0014: Creating file handler for path '/opt/jboss/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
[0m[0m17:37:46,810 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-1) WFLYJCA0018: Started Driver service with driver-name = postgresql
[0m[0m17:37:46,917 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 16 (per class), which is derived from thread worker pool sizing.
[0m[0m17:37:46,917 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 4 (per class), which is derived from the number of CPUs on this host.
[0m[0m17:37:46,919 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-1) WFLYJCA0018: Started Driver service with driver-name = h2
[0m[0m17:37:47,018 INFO  [org.jboss.as.naming] (MSC service thread 1-1) WFLYNAM0003: Starting Naming Service
[0m[0m17:37:47,303 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-2) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
[0m[0m17:37:47,304 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-2) WFLYMAIL0001: Bound mail session [java:jboss/mail/expresso]
[0m[0m17:37:47,619 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0012: Started server default-server.
[0m[0m17:37:47,809 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) Queuing requests.
[0m[0m17:37:47,810 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0018: Host default-host starting
[0m[0m17:37:48,007 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0006: Undertow AJP listener ajp listening on 0.0.0.0:8009
[0m[0m17:37:48,007 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: Undertow HTTP listener http listening on 0.0.0.0:8080
[0m[0m17:37:48,105 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0493: Jakarta Enterprise Beans subsystem suspension complete
[0m2026-10-22 17:37:48,920 INFO  [org.jboss.as.patching] (MSC service thread 1-2) WFLYPAT0050: JBoss EAP cumulative patch ID is: base, one-off patches include: none
2026-10-22 17:37:49,008 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-2) WFLYDM0111: Keystore /opt/jboss/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self signed certificate for host localhost
2026-10-22 17:37:49,011 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-2) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/jboss/standalone/deployments
2026-10-22 17:37:49,021 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Starting deployment of "sicow-penhor-okd.war" (runtime-name: "sicow-penhor-okd.war")
2026-10-22 17:37:49,023 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Starting deployment of "applicationinsights-agent-3.7.1.jar" (runtime-name: "applicationinsights-agent-3.7.1.jar")
2026-10-22 17:37:49,111 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0001: Bound data source [java:jboss/datasources/ExampleDS]
2026-10-22 17:37:49,211 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-2) WFLYMSGAMQ0075: AIO wasn't located on this platform, it will fall back to using pure Java NIO. Your platform is Linux, install LibAIO to enable the AIO journal and achieve optimal performance.
2026-10-22 17:37:49,209 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (JCA PoolFiller) IJ000610: Unable to fill pool: java:/jboss/datasources/sicow-ds: javax.resource.ResourceException: IJ031084: Unable to create connection
	at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
	at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
	at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
	at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1328)
	at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.fillTo(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1148)
	at org.jboss.jca.core.connectionmanager.pool.mcp.PoolFiller.run(PoolFiller.java:97)
	at java.lang.Thread.run(Thread.java:750)
Caused by: org.postgresql.util.PSQLException: FATAL: password authentication failed for user "scowdb01"
	at org.postgresql.core.v3.ConnectionFactoryImpl.doAuthentication(ConnectionFactoryImpl.java:525)
	at org.postgresql.core.v3.ConnectionFactoryImpl.tryConnect(ConnectionFactoryImpl.java:146)
	at org.postgresql.core.v3.ConnectionFactoryImpl.openConnectionImpl(ConnectionFactoryImpl.java:197)
	at org.postgresql.core.ConnectionFactory.openConnection(ConnectionFactory.java:49)
	at org.postgresql.jdbc.PgConnection.<init>(PgConnection.java:217)
	at org.postgresql.Driver.makeConnection(Driver.java:458)
	at org.postgresql.Driver.connect(Driver.java:260)
	at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
	... 6 more

2026-10-22 17:37:56,309 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) WFLYJCA0001: Bound data source [java:/jboss/datasources/sicow-ds]
2026-10-22 17:37:56,312 INFO  [org.jboss.as.remoting] (MSC service thread 1-1) WFLYRMT0001: Listening on 0.0.0.0:9999
2026-10-22 17:37:56,629 INFO  [org.jboss.as.remoting] (MSC service thread 1-1) WFLYRMT0001: Listening on 0.0.0.0:4447
2026-10-22 17:37:56,717 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0006: Undertow HTTPS listener https listening on 0.0.0.0:8443
2026-10-22 17:37:56,828 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 65) AMQ221000: live Message Broker is starting with configuration Broker Configuration (clustered=false,journalDirectory=/opt/jboss/standalone/data/activemq/journal,bindingsDirectory=/opt/jboss/standalone/data/activemq/bindings,largeMessagesDirectory=/opt/jboss/standalone/data/activemq/largemessages,pagingDirectory=/opt/jboss/standalone/data/activemq/paging)
2026-10-22 17:37:56,906 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 65) AMQ221006: Waiting to obtain live lock
2026-10-22 17:37:56,921 INFO  [org.jboss.ws.common.management] (MSC service thread 1-1) JBWS022052: Starting JBossWS 5.4.8.Final-redhat-00001 (Apache CXF 3.4.10.redhat-00001) 
2026-10-22 17:37:57,217 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 65) AMQ221043: Protocol module found: [artemis-server]. Adding protocol support for: CORE
2026-10-22 17:37:57,218 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 65) AMQ221043: Protocol module found: [artemis-hornetq-protocol]. Adding protocol support for: HORNETQ
2026-10-22 17:37:57,421 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 65) AMQ221003: Deploying ANYCAST queue jms.queue.ExpiryQueue on address jms.queue.ExpiryQueue
2026-10-22 17:37:57,920 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 65) AMQ221003: Deploying ANYCAST queue jms.queue.DLQ on address jms.queue.DLQ
2026-10-22 17:37:57,921 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 65) AMQ221003: Deploying ANYCAST queue jms.queue.sipnlReq on address jms.queue.sipnlReq
2026-10-22 17:37:57,922 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 65) AMQ221003: Deploying ANYCAST queue jms.queue.sipnlRet on address jms.queue.sipnlRet
2026-10-22 17:37:57,922 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 65) AMQ221003: Deploying ANYCAST queue jms.queue.totemReq on address jms.queue.totemReq
2026-10-22 17:37:57,923 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 65) AMQ221003: Deploying ANYCAST queue jms.queue.totemRet on address jms.queue.totemRet
2026-10-22 17:37:57,923 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 65) AMQ221003: Deploying ANYCAST queue jms.queue.painelReq on address jms.queue.painelReq
2026-10-22 17:37:57,924 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 65) AMQ221003: Deploying ANYCAST queue jms.queue.painelRet on address jms.queue.painelRet
2026-10-22 17:37:57,924 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 65) AMQ221003: Deploying ANYCAST queue jms.queue.siicoReq on address jms.queue.siicoReq
2026-10-22 17:37:57,924 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 65) AMQ221003: Deploying ANYCAST queue jms.queue.siicoRet on address jms.queue.siicoRet
2026-10-22 17:37:57,925 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 65) AMQ221003: Deploying ANYCAST queue jms.queue.painelWebReq on address jms.queue.painelWebReq
2026-10-22 17:37:57,925 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 65) AMQ221003: Deploying ANYCAST queue jms.queue.painelWebRet on address jms.queue.painelWebRet
2026-10-22 17:37:59,821 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 65) AMQ221020: Started NIO Acceptor at 0.0.0.0:5455 for protocols [CORE,HORNETQ]
2026-10-22 17:37:59,906 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 65) AMQ221020: Started NIO Acceptor at 0.0.0.0:5445 for protocols [CORE,HORNETQ]
2026-10-22 17:37:59,906 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 65) AMQ221007: Server is now live
2026-10-22 17:37:59,907 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 65) AMQ221001: Apache ActiveMQ Artemis Message Broker version 2.16.0.redhat-00047 [default, nodeID=76a514aa-ce58-11f1-bd76-0a58190214ad] 
2026-10-22 17:38:00,506 WARN  [org.apache.activemq.artemis.jms.server] (ServerService Thread Pool -- 72) AMQ122005: Invalid "host" value "0.0.0.0" detected for "netty" connector. Switching to "sicow-penhor-okd-des-58-kbvxz". If this new address is incorrect please manually configure the connector to use the proper one.
2026-10-22 17:38:00,518 INFO  [org.wildfly.extension.messaging-activemq] (ServerService Thread Pool -- 72) WFLYMSGAMQ0002: Bound messaging object to jndi name RemoteConnectionFactory
2026-10-22 17:38:00,519 INFO  [org.wildfly.extension.messaging-activemq] (ServerService Thread Pool -- 72) WFLYMSGAMQ0002: Bound messaging object to jndi name java:jboss/exported/jms/RemoteConnectionFactory
2026-10-22 17:38:00,519 INFO  [org.wildfly.extension.messaging-activemq] (ServerService Thread Pool -- 78) WFLYMSGAMQ0002: Bound messaging object to jndi name java:/ConnectionFactory
2026-10-22 17:38:00,718 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-1) WFLYJCA0007: Registered connection factory java:/JmsXA
2026-10-22 17:38:00,933 INFO  [org.apache.activemq.artemis.ra] (MSC service thread 1-1) AMQ151007: Resource adaptor started
2026-10-22 17:38:00,933 INFO  [org.jboss.as.connector.services.resourceadapters.ResourceAdapterActivatorService$ResourceAdapterActivator] (MSC service thread 1-1) IJ020002: Deployed: file://RaActivatorhornetq-ra
2026-10-22 17:38:01,212 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-1) MSC000001: Failed to start service jboss.module.service."deployment.applicationinsights-agent-3.7.1.jar".main: org.jboss.msc.service.StartException in service jboss.module.service."deployment.applicationinsights-agent-3.7.1.jar".main: WFLYSRV0179: Failed to load module: deployment.applicationinsights-agent-3.7.1.jar
	at org.jboss.as.server.moduleservice.ModuleLoadService.start(ModuleLoadService.java:116)
	at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1739)
	at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1701)
	at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1559)
	at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
	at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1363)
	at java.lang.Thread.run(Thread.java:750)
Caused by: org.jboss.modules.ModuleNotFoundException: br.gov.caixa.siusr
	at org.jboss.modules.Module.addPaths(Module.java:1288)
	at org.jboss.modules.Module.link(Module.java:1644)
	at org.jboss.modules.Module.relinkIfNecessary(Module.java:1672)
	at org.jboss.modules.ModuleLoader.loadModule(ModuleLoader.java:303)
	at org.jboss.modules.ModuleLoader.loadModule(ModuleLoader.java:287)
	at org.jboss.as.server.moduleservice.ModuleLoadService.start(ModuleLoadService.java:93)
	... 8 more

2026-10-22 17:38:01,217 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-1) WFLYJCA0002: Bound Jakarta Connectors ConnectionFactory [java:/JmsXA]
2026-10-22 17:38:02,029 INFO  [org.jboss.as.jpa] (MSC service thread 1-1) WFLYJPA0002: Read persistence.xml for SicowPenhorPersistUnit
2026-10-22 17:38:02,836 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-1) MSC000001: Failed to start service jboss.module.service."deployment.sicow-penhor-okd.war".main: org.jboss.msc.service.StartException in service jboss.module.service."deployment.sicow-penhor-okd.war".main: WFLYSRV0179: Failed to load module: deployment.sicow-penhor-okd.war
	at org.jboss.as.server.moduleservice.ModuleLoadService.start(ModuleLoadService.java:116)
	at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1739)
	at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1701)
	at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1559)
	at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
	at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
	at java.lang.Thread.run(Thread.java:750)
Caused by: org.jboss.modules.ModuleNotFoundException: br.gov.caixa.siusr
	at org.jboss.modules.Module.addPaths(Module.java:1288)
	at org.jboss.modules.Module.link(Module.java:1644)
	at org.jboss.modules.Module.relinkIfNecessary(Module.java:1672)
	at org.jboss.modules.ModuleLoader.loadModule(ModuleLoader.java:303)
	at org.jboss.modules.ModuleLoader.loadModule(ModuleLoader.java:287)
	at org.jboss.as.server.moduleservice.ModuleLoadService.start(ModuleLoadService.java:93)
	... 8 more

2026-10-22 17:38:02,838 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("deploy") failed - address: ([("deployment" => "applicationinsights-agent-3.7.1.jar")]) - failure description: {"WFLYCTL0080: Failed services" => {"jboss.module.service.\"deployment.applicationinsights-agent-3.7.1.jar\".main" => "WFLYSRV0179: Failed to load module: deployment.applicationinsights-agent-3.7.1.jar
    Caused by: org.jboss.modules.ModuleNotFoundException: br.gov.caixa.siusr"}}
2026-10-22 17:38:02,839 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("deploy") failed - address: ([("deployment" => "sicow-penhor-okd.war")]) - failure description: {"WFLYCTL0080: Failed services" => {"jboss.module.service.\"deployment.sicow-penhor-okd.war\".main" => "WFLYSRV0179: Failed to load module: deployment.sicow-penhor-okd.war
    Caused by: org.jboss.modules.ModuleNotFoundException: br.gov.caixa.siusr"}}
2026-10-22 17:38:02,904 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 36) WFLYSRV0010: Deployed "sicow-penhor-okd.war" (runtime-name : "sicow-penhor-okd.war")
2026-10-22 17:38:02,904 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 36) WFLYSRV0010: Deployed "applicationinsights-agent-3.7.1.jar" (runtime-name : "applicationinsights-agent-3.7.1.jar")
2026-10-22 17:38:02,912 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0183: Service status report
WFLYCTL0186:   Services which failed to start:      service jboss.module.service."deployment.sicow-penhor-okd.war".main: WFLYSRV0179: Failed to load module: deployment.sicow-penhor-okd.war
      service jboss.module.service."deployment.applicationinsights-agent-3.7.1.jar".main: WFLYSRV0179: Failed to load module: deployment.applicationinsights-agent-3.7.1.jar

2026-10-22 17:38:03,017 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
2026-10-22 17:38:03,019 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) started (with errors) in 30113ms - Started 412 of 627 services (4 services failed or missing dependencies, 365 services are lazy, passive or on-demand)
2026-10-22 17:38:03,021 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://0.0.0.0:9990/management
2026-10-22 17:38:03,021 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: Admin console listening on http://0.0.0.0:9990


<img width="1906" height="964" alt="image" src="https://github.com/user-attachments/assets/c4dad4e5-25e6-47b2-81cf-6e5ad0e806a8" />



o pod subiu mais a pagina não acessa
