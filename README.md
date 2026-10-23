<img width="1828" height="950" alt="image" src="https://github.com/user-attachments/assets/9f8ba05d-0e5f-42b4-ace2-94095647a391" />

sicow-penhor-okd-des-61-ml9pq
Running


=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.372.b07-1.el7_9.x86_64/jre/bin/java

  JAVA_OPTS:  -verbose:gc -Xloggc:"/opt/jboss/standalone/log/gc.log" -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx1024m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration//opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sicow.jks -Djavax.net.ssl.trustStorePassword=changeit -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/jboss/standalone/deployments/applicationinsights-agent-3.7.1.jar -Djava.net.useSystemProxies=false -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=localhost\|127.0.0.1\|*.caixa 

=========================================================================

OpenJDK 64-Bit Server VM warning: If the number of processors is expected to increase from one, then you should configure the number of parallel GC threads appropriately using -XX:ParallelGCThreads=N
2026-10-23 10:17:05.040-03:00 WARN  i.o.s.a.ResourceConfiguration - Found reference to io.opentelemetry.sdk.autoconfigure.internal.EnvironmentResourceProvider in otel.java.enabled.resource.providers. Please update to io.opentelemetry.sdk.autoconfigure.EnvironmentResourceProvider. Support for the old provider name will be removed after 1.49.0.
2026-10-23 10:17:22.891-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.7.1 started successfully (PID 171, JVM running for 32.545 s)
2026-10-23 10:17:22.892-03:00 INFO  c.m.applicationinsights.agent - Java version: 1.8.0_372, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.372.b07-1.el7_9.x86_64/jre
[0m10:17:24,433 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.0.Final-redhat-00001
[0m[0m10:17:25,815 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.12.Final-redhat-00001
[0m[0m10:17:25,935 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
[0m[0m10:17:26,535 INFO  [org.jboss.as] (MSC service thread 1-1) WFLYSRV0049: JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) starting
[0m[0m10:17:26,829 INFO  [org.jboss.vfs] (MSC service thread 1-2) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
[0m[0m10:17:30,221 INFO  [org.wildfly.security] (ServerService Thread Pool -- 31) ELY00001: WildFly Elytron version 1.15.16.Final-redhat-00001
[0m[0m10:17:31,309 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 7) WFLYCTL0033: Extension 'security' is deprecated and may not be supported in future versions
[0m[0m10:17:32,833 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=native-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m10:17:32,834 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m10:17:32,919 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 35) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m10:17:33,709 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 8) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/43/10e3eda419b2f2c7d4fb432f9cf7908f535920/content
[0m[0m10:17:34,154 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 8) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/a9/241193927d9eb7c1cd65d2a98a1be5e6bca199/content
[0m[0m10:17:34,649 INFO  [org.jboss.security] (Controller Boot Thread) PBOX00361: Default Security Vault Implementation Initialized and Ready
[0m[0m10:17:34,722 INFO  [org.xnio] (MSC service thread 1-1) XNIO version 3.8.9.Final-redhat-00001
[0m[0m10:17:34,725 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
[0m[0m10:17:34,735 INFO  [org.xnio.nio] (MSC service thread 1-1) XNIO NIO Implementation Version 3.8.9.Final-redhat-00001
[0m[33m10:17:34,915 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 60) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
[0m[0m10:17:34,917 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 42) WFLYCLINF0001: Activating Infinispan subsystem.
[0m[0m10:17:35,009 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 43) WFLYIO001: Worker 'default' has auto-configured to 2 IO threads with 16 max task threads based on your 1 available processors
[0m[0m10:17:35,012 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 44) WFLYRS0016: RESTEasy version 3.15.7.Final-redhat-00001
[0m[0m10:17:35,013 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 52) WFLYNAM0001: Activating Naming Subsystem
[0m[0m10:17:35,015 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 58) WFLYSEC0002: Activating Security Subsystem
[0m[0m10:17:35,016 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 62) WFLYWS0002: Activating WebServices Extension
[0m[0m10:17:35,216 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 49) WFLYJSF0007: Activated the following Jakarta Server Faces Implementations: [main]
[0m[0m10:17:35,311 INFO  [org.jboss.as.connector] (MSC service thread 1-2) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 1.5.11.Final-redhat-00001)
[0m[33m10:17:35,521 WARN  [org.wildfly.clustering.web.undertow] (ServerService Thread Pool -- 61) WFLYCLWEBUT0007: No routing provider found for default-server; using legacy provider based on static configuration
[0m[0m10:17:35,617 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 30) WFLYJCA0005: Deploying non-JDBC-compliant driver class org.postgresql.Driver (version 42.2)
[0m[0m10:17:35,619 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0003: Undertow 2.2.24.SP1-redhat-00001 starting
[0m[0m10:17:35,913 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 30) WFLYJCA0004: Deploying JDBC-compliant driver class org.h2.Driver (version 1.4)
[0m[0m10:17:35,917 INFO  [org.jboss.remoting] (MSC service thread 1-1) JBoss Remoting version 5.0.27.Final-redhat-00001
[0m[0m10:17:36,021 INFO  [org.jboss.as.security] (MSC service thread 1-2) WFLYSEC0001: Current PicketBox version=5.0.3.Final-redhat-00009
[0m[0m10:17:36,414 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-1) WFLYJCA0018: Started Driver service with driver-name = postgresql
[0m[0m10:17:36,418 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-1) WFLYJCA0018: Started Driver service with driver-name = h2
[0m[0m10:17:36,507 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 16 (per class), which is derived from thread worker pool sizing.
[0m[0m10:17:36,508 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 4 (per class), which is derived from the number of CPUs on this host.
[0m[0m10:17:36,611 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 61) WFLYUT0014: Creating file handler for path '/opt/jboss/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
[0m[0m10:17:36,713 INFO  [org.jboss.as.naming] (MSC service thread 1-1) WFLYNAM0003: Starting Naming Service
[0m[0m10:17:37,010 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-2) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
[0m[0m10:17:37,011 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-2) WFLYMAIL0001: Bound mail session [java:jboss/mail/expresso]
[0m[0m10:17:37,427 INFO  [org.jboss.as.patching] (MSC service thread 1-2) WFLYPAT0050: JBoss EAP cumulative patch ID is: base, one-off patches include: none
[0m[0m10:17:37,514 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0012: Started server default-server.
[0m2026-10-23 10:17:37,925 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: Undertow AJP listener ajp listening on 0.0.0.0:8009
2026-10-23 10:17:37,927 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) Queuing requests.
2026-10-23 10:17:37,928 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0018: Host default-host starting
2026-10-23 10:17:38,028 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: Undertow HTTP listener http listening on 0.0.0.0:8080
2026-10-23 10:17:38,208 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0493: Jakarta Enterprise Beans subsystem suspension complete
2026-10-23 10:17:38,221 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-2) WFLYMSGAMQ0075: AIO wasn't located on this platform, it will fall back to using pure Java NIO. Your platform is Linux, install LibAIO to enable the AIO journal and achieve optimal performance.
2026-10-23 10:17:38,308 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-1) WFLYDM0111: Keystore /opt/jboss/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self signed certificate for host localhost
2026-10-23 10:17:38,316 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0027: Starting deployment of "applicationinsights-agent-3.7.1.jar" (runtime-name: "applicationinsights-agent-3.7.1.jar")
2026-10-23 10:17:38,320 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-1) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/jboss/standalone/deployments
2026-10-23 10:17:38,320 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0027: Starting deployment of "sicow-penhor-okd.war" (runtime-name: "sicow-penhor-okd.war")
2026-10-23 10:17:43,736 INFO  [org.jboss.as.remoting] (MSC service thread 1-2) WFLYRMT0001: Listening on 0.0.0.0:9999
2026-10-23 10:17:44,314 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 64) AMQ221000: live Message Broker is starting with configuration Broker Configuration (clustered=false,journalDirectory=/opt/jboss/standalone/data/activemq/journal,bindingsDirectory=/opt/jboss/standalone/data/activemq/bindings,largeMessagesDirectory=/opt/jboss/standalone/data/activemq/largemessages,pagingDirectory=/opt/jboss/standalone/data/activemq/paging)
2026-10-23 10:17:44,317 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 64) AMQ221006: Waiting to obtain live lock
2026-10-23 10:17:44,423 INFO  [org.jboss.as.remoting] (MSC service thread 1-2) WFLYRMT0001: Listening on 0.0.0.0:4447
2026-10-23 10:17:44,512 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: Undertow HTTPS listener https listening on 0.0.0.0:8443
2026-10-23 10:17:44,620 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 64) AMQ221043: Protocol module found: [artemis-server]. Adding protocol support for: CORE
2026-10-23 10:17:44,620 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 64) AMQ221043: Protocol module found: [artemis-hornetq-protocol]. Adding protocol support for: HORNETQ
2026-10-23 10:17:44,620 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (JCA PoolFiller) IJ000610: Unable to fill pool: java:/jboss/datasources/sicow-ds: javax.resource.ResourceException: IJ031084: Unable to create connection
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

2026-10-23 10:17:44,825 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 64) AMQ221003: Deploying ANYCAST queue jms.queue.ExpiryQueue on address jms.queue.ExpiryQueue
2026-10-23 10:17:44,914 INFO  [org.jboss.ws.common.management] (MSC service thread 1-2) JBWS022052: Starting JBossWS 5.4.8.Final-redhat-00001 (Apache CXF 3.4.10.redhat-00001) 
2026-10-23 10:17:44,917 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0001: Bound data source [java:jboss/datasources/ExampleDS]
2026-10-23 10:17:44,917 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0001: Bound data source [java:/jboss/datasources/sicow-ds]
2026-10-23 10:17:45,121 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 64) AMQ221003: Deploying ANYCAST queue jms.queue.DLQ on address jms.queue.DLQ
2026-10-23 10:17:45,122 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 64) AMQ221003: Deploying ANYCAST queue jms.queue.sipnlReq on address jms.queue.sipnlReq
2026-10-23 10:17:45,122 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 64) AMQ221003: Deploying ANYCAST queue jms.queue.sipnlRet on address jms.queue.sipnlRet
2026-10-23 10:17:45,122 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 64) AMQ221003: Deploying ANYCAST queue jms.queue.totemReq on address jms.queue.totemReq
2026-10-23 10:17:45,123 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 64) AMQ221003: Deploying ANYCAST queue jms.queue.totemRet on address jms.queue.totemRet
2026-10-23 10:17:45,123 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 64) AMQ221003: Deploying ANYCAST queue jms.queue.painelReq on address jms.queue.painelReq
2026-10-23 10:17:45,124 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 64) AMQ221003: Deploying ANYCAST queue jms.queue.painelRet on address jms.queue.painelRet
2026-10-23 10:17:45,124 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 64) AMQ221003: Deploying ANYCAST queue jms.queue.siicoReq on address jms.queue.siicoReq
2026-10-23 10:17:45,124 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 64) AMQ221003: Deploying ANYCAST queue jms.queue.siicoRet on address jms.queue.siicoRet
2026-10-23 10:17:45,125 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 64) AMQ221003: Deploying ANYCAST queue jms.queue.painelWebReq on address jms.queue.painelWebReq
2026-10-23 10:17:45,125 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 64) AMQ221003: Deploying ANYCAST queue jms.queue.painelWebRet on address jms.queue.painelWebRet
2026-10-23 10:17:47,213 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 64) AMQ221020: Started NIO Acceptor at 0.0.0.0:5455 for protocols [CORE,HORNETQ]
2026-10-23 10:17:47,219 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 64) AMQ221020: Started NIO Acceptor at 0.0.0.0:5445 for protocols [CORE,HORNETQ]
2026-10-23 10:17:47,219 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 64) AMQ221007: Server is now live
2026-10-23 10:17:47,219 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 64) AMQ221001: Apache ActiveMQ Artemis Message Broker version 2.16.0.redhat-00047 [default, nodeID=21ed48a1-cee4-11f1-a3ee-0a5819001696] 
2026-10-23 10:17:48,125 WARN  [org.apache.activemq.artemis.jms.server] (ServerService Thread Pool -- 74) AMQ122005: Invalid "host" value "0.0.0.0" detected for "netty" connector. Switching to "sicow-penhor-okd-des-61-ml9pq". If this new address is incorrect please manually configure the connector to use the proper one.
2026-10-23 10:17:48,211 INFO  [org.wildfly.extension.messaging-activemq] (ServerService Thread Pool -- 74) WFLYMSGAMQ0002: Bound messaging object to jndi name RemoteConnectionFactory
2026-10-23 10:17:48,211 INFO  [org.wildfly.extension.messaging-activemq] (ServerService Thread Pool -- 74) WFLYMSGAMQ0002: Bound messaging object to jndi name java:jboss/exported/jms/RemoteConnectionFactory
2026-10-23 10:17:48,215 INFO  [org.wildfly.extension.messaging-activemq] (ServerService Thread Pool -- 72) WFLYMSGAMQ0002: Bound messaging object to jndi name java:/ConnectionFactory
2026-10-23 10:17:48,409 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-2) WFLYJCA0007: Registered connection factory java:/JmsXA
2026-10-23 10:17:48,647 INFO  [org.apache.activemq.artemis.ra] (MSC service thread 1-2) AMQ151007: Resource adaptor started
2026-10-23 10:17:48,707 INFO  [org.jboss.as.connector.services.resourceadapters.ResourceAdapterActivatorService$ResourceAdapterActivator] (MSC service thread 1-2) IJ020002: Deployed: file://RaActivatorhornetq-ra
2026-10-23 10:17:48,930 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-2) WFLYJCA0002: Bound Jakarta Connectors ConnectionFactory [java:/JmsXA]
2026-10-23 10:17:49,136 INFO  [org.jboss.as.jpa] (MSC service thread 1-1) WFLYJPA0002: Read persistence.xml for SicowPenhorPersistUnit
2026-10-23 10:17:50,416 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 68) ISPN000128: Infinispan version: Infinispan 'Corona Extra' 11.0.17.Final-redhat-00001
2026-10-23 10:17:50,722 INFO  [org.infinispan.CONFIG] (MSC service thread 1-2) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
2026-10-23 10:17:50,724 INFO  [org.infinispan.CONFIG] (MSC service thread 1-2) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
2026-10-23 10:17:51,117 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 68) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
2026-10-23 10:17:51,217 INFO  [org.jipijapa] (MSC service thread 1-1) JIPIORMV53020253: Second level cache enabled for sicow-penhor-okd.war#SicowPenhorPersistUnit
2026-10-23 10:17:51,516 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 67) WFLYJPA0010: Starting Persistence Unit (phase 1 of 2) Service 'sicow-penhor-okd.war#SicowPenhorPersistUnit'
2026-10-23 10:17:51,630 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 67) HHH000204: Processing PersistenceUnitInfo [
	name: SicowPenhorPersistUnit
	...]
2026-10-23 10:17:51,818 INFO  [org.jboss.weld.deployer] (MSC service thread 1-2) WFLYWELD0003: Processing weld deployment sicow-penhor-okd.war
2026-10-23 10:17:52,011 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 68) WFLYCLINF0002: Started http-remoting-connector cache from ejb container
2026-10-23 10:17:52,029 INFO  [org.hibernate.Version] (ServerService Thread Pool -- 67) HHH000412: Hibernate Core {5.3.29.Final-redhat-00001}
2026-10-23 10:17:52,031 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 67) HHH000206: hibernate.properties not found
2026-10-23 10:17:52,121 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-2) HV000001: Hibernate Validator 6.0.23.Final-redhat-00001
2026-10-23 10:17:52,538 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ServicosWebServicePenhor' in deployment unit 'deployment "sicow-penhor-okd.war"' are as follows:

	java:global/sicow-penhor-okd/ServicosWebServicePenhor!br.gov.caixa.pr.sicow.sicowpenhor.service.ws.InterfaceServicosWebService
	java:app/sicow-penhor-okd/ServicosWebServicePenhor!br.gov.caixa.pr.sicow.sicowpenhor.service.ws.InterfaceServicosWebService
	java:module/ServicosWebServicePenhor!br.gov.caixa.pr.sicow.sicowpenhor.service.ws.InterfaceServicosWebService
	java:global/sicow-penhor-okd/ServicosWebServicePenhor
	java:app/sicow-penhor-okd/ServicosWebServicePenhor
	java:module/ServicosWebServicePenhor

2026-10-23 10:17:52,538 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'SicowPenhorAuditDAO' in deployment unit 'deployment "sicow-penhor-okd.war"' are as follows:

	java:global/sicow-penhor-okd/SicowPenhorAuditDAO!br.gov.caixa.pr.sicow.sicowpenhor.dao.SicowPenhorAuditDAO
	java:app/sicow-penhor-okd/SicowPenhorAuditDAO!br.gov.caixa.pr.sicow.sicowpenhor.dao.SicowPenhorAuditDAO
	java:module/SicowPenhorAuditDAO!br.gov.caixa.pr.sicow.sicowpenhor.dao.SicowPenhorAuditDAO
	java:global/sicow-penhor-okd/SicowPenhorAuditDAO
	java:app/sicow-penhor-okd/SicowPenhorAuditDAO
	java:module/SicowPenhorAuditDAO

2026-10-23 10:17:52,539 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'SistemaPenhorWSDAO' in deployment unit 'deployment "sicow-penhor-okd.war"' are as follows:

	java:global/sicow-penhor-okd/SistemaPenhorWSDAO!br.gov.caixa.pr.sicow.sicowpenhor.dao.SistemaPenhorWSDAO
	java:app/sicow-penhor-okd/SistemaPenhorWSDAO!br.gov.caixa.pr.sicow.sicowpenhor.dao.SistemaPenhorWSDAO
	java:module/SistemaPenhorWSDAO!br.gov.caixa.pr.sicow.sicowpenhor.dao.SistemaPenhorWSDAO
	java:global/sicow-penhor-okd/SistemaPenhorWSDAO
	java:app/sicow-penhor-okd/SistemaPenhorWSDAO
	java:module/SistemaPenhorWSDAO

2026-10-23 10:17:52,539 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ContratoGeajuDAO' in deployment unit 'deployment "sicow-penhor-okd.war"' are as follows:

	java:global/sicow-penhor-okd/ContratoGeajuDAO!br.gov.caixa.pr.sicow.sicowpenhor.dao.ContratoGeajuDAO
	java:app/sicow-penhor-okd/ContratoGeajuDAO!br.gov.caixa.pr.sicow.sicowpenhor.dao.ContratoGeajuDAO
	java:module/ContratoGeajuDAO!br.gov.caixa.pr.sicow.sicowpenhor.dao.ContratoGeajuDAO
	java:global/sicow-penhor-okd/ContratoGeajuDAO
	java:app/sicow-penhor-okd/ContratoGeajuDAO
	java:module/ContratoGeajuDAO

2026-10-23 10:17:52,539 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'SicowPenhorAuditInterceptor' in deployment unit 'deployment "sicow-penhor-okd.war"' are as follows:

	java:global/sicow-penhor-okd/SicowPenhorAuditInterceptor!br.gov.caixa.pr.sicow.penhor.audit.SicowPenhorAuditInterceptor
	java:app/sicow-penhor-okd/SicowPenhorAuditInterceptor!br.gov.caixa.pr.sicow.penhor.audit.SicowPenhorAuditInterceptor
	java:module/SicowPenhorAuditInterceptor!br.gov.caixa.pr.sicow.penhor.audit.SicowPenhorAuditInterceptor
	java:global/sicow-penhor-okd/SicowPenhorAuditInterceptor
	java:app/sicow-penhor-okd/SicowPenhorAuditInterceptor
	java:module/SicowPenhorAuditInterceptor

2026-10-23 10:17:52,539 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'BloqueioDao' in deployment unit 'deployment "sicow-penhor-okd.war"' are as follows:

	java:global/sicow-penhor-okd/BloqueioDao!br.gov.caixa.pr.sicow.sicowpenhor.dao.BloqueioDao
	java:app/sicow-penhor-okd/BloqueioDao!br.gov.caixa.pr.sicow.sicowpenhor.dao.BloqueioDao
	java:module/BloqueioDao!br.gov.caixa.pr.sicow.sicowpenhor.dao.BloqueioDao
	java:global/sicow-penhor-okd/BloqueioDao
	java:app/sicow-penhor-okd/BloqueioDao
	java:module/BloqueioDao

2026-10-23 10:17:52,539 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ContratoGeajuWS' in deployment unit 'deployment "sicow-penhor-okd.war"' are as follows:


2026-10-23 10:17:52,539 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'SiisoPenhorService' in deployment unit 'deployment "sicow-penhor-okd.war"' are as follows:

	java:global/sicow-penhor-okd/SiisoPenhorService!br.gov.caixa.pr.siiso.service.SiisoPenhorService
	java:app/sicow-penhor-okd/SiisoPenhorService!br.gov.caixa.pr.siiso.service.SiisoPenhorService
	java:module/SiisoPenhorService!br.gov.caixa.pr.siiso.service.SiisoPenhorService
	java:global/sicow-penhor-okd/SiisoPenhorService
	java:app/sicow-penhor-okd/SiisoPenhorService
	java:module/SiisoPenhorService

2026-10-23 10:17:52,539 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PessoaPenhorDao' in deployment unit 'deployment "sicow-penhor-okd.war"' are as follows:

	java:global/sicow-penhor-okd/PessoaPenhorDao!br.gov.caixa.pr.sicow.sicowpenhor.dao.PessoaPenhorDao
	java:app/sicow-penhor-okd/PessoaPenhorDao!br.gov.caixa.pr.sicow.sicowpenhor.dao.PessoaPenhorDao
	java:module/PessoaPenhorDao!br.gov.caixa.pr.sicow.sicowpenhor.dao.PessoaPenhorDao
	java:global/sicow-penhor-okd/PessoaPenhorDao
	java:app/sicow-penhor-okd/PessoaPenhorDao
	java:module/PessoaPenhorDao

2026-10-23 10:17:52,539 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TipoPessoaPenhorDao' in deployment unit 'deployment "sicow-penhor-okd.war"' are as follows:

	java:global/sicow-penhor-okd/TipoPessoaPenhorDao!br.gov.caixa.pr.sicow.sicowpenhor.dao.TipoPessoaPenhorDao
	java:app/sicow-penhor-okd/TipoPessoaPenhorDao!br.gov.caixa.pr.sicow.sicowpenhor.dao.TipoPessoaPenhorDao
	java:module/TipoPessoaPenhorDao!br.gov.caixa.pr.sicow.sicowpenhor.dao.TipoPessoaPenhorDao
	java:global/sicow-penhor-okd/TipoPessoaPenhorDao
	java:app/sicow-penhor-okd/TipoPessoaPenhorDao
	java:module/TipoPessoaPenhorDao

2026-10-23 10:17:52,724 INFO  [org.hibernate.annotations.common.Version] (ServerService Thread Pool -- 67) HCANN000001: Hibernate Commons Annotations {5.0.5.Final-redhat-00002}
2026-10-23 10:17:53,215 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV53020253: Second level cache enabled for sicow-penhor-okd.war#SicowPenhorPersistUnit
2026-10-23 10:17:53,644 INFO  [org.jboss.weld.Version] (MSC service thread 1-2) WELD-000900: 3.1.6 (redhat)
2026-10-23 10:17:53,755 INFO  [org.jboss.ws.cxf.metadata] (MSC service thread 1-2) JBWS024061: Adding service endpoint metadata: id=ContratoGeajuWS
 address=http://25.0.22.150:8080/sicowpenhor/penhorWS/contratoWS
 implementor=br.gov.caixa.pr.sicow.sicowpenhor.ws.ContratoGeajuWS
 serviceName={http://ws.sicowpenhor.sicow.pr.caixa.gov.br/}ContratoWS
 portName={http://ws.sicowpenhor.sicow.pr.caixa.gov.br/}PenhorWSPort
 annotationWsdlLocation=null
 wsdlLocationOverride=null
 mtomEnabled=false
2026-10-23 10:17:54,741 INFO  [org.apache.cxf.wsdl.service.factory.ReflectionServiceFactoryBean] (MSC service thread 1-2) Creating Service {http://ws.sicowpenhor.sicow.pr.caixa.gov.br/}ContratoWS from class br.gov.caixa.pr.sicow.sicowpenhor.ws.ContratoGeajuWS
2026-10-23 10:17:55,551 INFO  [org.apache.cxf.endpoint.ServerImpl] (MSC service thread 1-2) Setting the server's publish address to be http://25.0.22.150:8080/sicowpenhor/penhorWS/contratoWS
2026-10-23 10:17:55,657 INFO  [org.jboss.ws.cxf.deployment] (MSC service thread 1-2) JBWS024074: WSDL published to: file:/opt/jboss-eap-7.4/standalone/data/wsdl/sicow-penhor-okd.war/ContratoWS.wsdl
2026-10-23 10:17:55,814 INFO  [org.jboss.as.webservices] (MSC service thread 1-1) WFLYWS0003: Starting service jboss.ws.endpoint."sicow-penhor-okd.war".ContratoGeajuWS
2026-10-23 10:17:56,048 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 67) WFLYJPA0010: Starting Persistence Unit (phase 2 of 2) Service 'sicow-penhor-okd.war#SicowPenhorPersistUnit'
2026-10-23 10:17:56,076 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (ServerService Thread Pool -- 67) IJ000604: Throwable while attempting to get a new connection: null: javax.resource.ResourceException: IJ031084: Unable to create connection
	at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
	at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
	at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
	at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1328)
	at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:505)
	at org.jboss.jca.core.connectionmanager.pool.AbstractPool.getSimpleConnection(AbstractPool.java:640)
	at org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:605)
	at org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
	at org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
	at org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
	at org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:150)
	at org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
	at org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess.obtainConnection(JdbcEnvironmentInitiator.java:180)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:68)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:35)
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:94)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:263)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:237)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:214)
	at org.hibernate.id.factory.internal.DefaultIdentifierGeneratorFactory.injectServices(DefaultIdentifierGeneratorFactory.java:152)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.injectDependencies(AbstractServiceRegistryImpl.java:286)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:243)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:214)
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:179)
	at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:119)
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1215)
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1246)
	at org.jboss.as.jpa.hibernate5.TwoPhaseBootstrapImpl.build(TwoPhaseBootstrapImpl.java:44)
	at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:170)
	at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:128)
	at java.security.AccessController.doPrivileged(Native Method)
	at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:664)
	at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1.run(PersistenceUnitServiceImpl.java:213)
	at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
	at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
	at java.lang.Thread.run(Thread.java:750)
	at org.jboss.threads.JBossThread.run(JBossThread.java:513)
Caused by: org.postgresql.util.PSQLException: FATAL: password authentication failed for user "scowdb01"
	at org.postgresql.core.v3.ConnectionFactoryImpl.doAuthentication(ConnectionFactoryImpl.java:525)
	at org.postgresql.core.v3.ConnectionFactoryImpl.tryConnect(ConnectionFactoryImpl.java:146)
	at org.postgresql.core.v3.ConnectionFactoryImpl.openConnectionImpl(ConnectionFactoryImpl.java:197)
	at org.postgresql.core.ConnectionFactory.openConnection(ConnectionFactory.java:49)
	at org.postgresql.jdbc.PgConnection.<init>(PgConnection.java:217)
	at org.postgresql.Driver.makeConnection(Driver.java:458)
	at org.postgresql.Driver.connect(Driver.java:260)
	at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
	... 39 more

2026-10-23 10:17:56,078 WARN  [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator] (ServerService Thread Pool -- 67) HHH000342: Could not obtain connection to query metadata : javax.resource.ResourceException: IJ000453: Unable to get managed connection for java:/jboss/datasources/sicow-ds
2026-10-23 10:17:56,109 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 67) HHH000400: Using dialect: org.hibernate.dialect.PostgreSQLDialect
2026-10-23 10:17:56,122 INFO  [org.hibernate.engine.jdbc.env.internal.LobCreatorBuilderImpl] (ServerService Thread Pool -- 67) HHH000422: Disabling contextual LOB creation as connection was null
2026-10-23 10:17:56,126 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 67) HHH000270: Type registration [java.util.UUID] overrides previous : org.hibernate.type.UUIDBinaryType@1152506e
2026-10-23 10:17:56,134 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 67) Envers integration enabled? : true
2026-10-23 10:17:56,449 WARN  [org.hibernate.orm.deprecation] (ServerService Thread Pool -- 67) HHH90000021: Encountered deprecated setting [hibernate.ejb.interceptor], use [hibernate.session_factory.interceptor] instead
2026-10-23 10:17:56,608 WARN  [org.infinispan.hibernate.cache.v53.InfinispanRegionFactory] (ServerService Thread Pool -- 67) HHH025030: Transactional caches are not supported. The configuration option will be ignored; please unset.
2026-10-23 10:17:56,609 WARN  [org.infinispan.hibernate.cache.v53.InfinispanRegionFactory] (ServerService Thread Pool -- 67) HHH025030: Transactional caches are not supported. The configuration option will be ignored; please unset.
2026-10-23 10:17:56,610 WARN  [org.infinispan.hibernate.cache.v53.InfinispanRegionFactory] (ServerService Thread Pool -- 67) HHH025030: Transactional caches are not supported. The configuration option will be ignored; please unset.
2026-10-23 10:17:56,610 WARN  [org.infinispan.hibernate.cache.v53.InfinispanRegionFactory] (ServerService Thread Pool -- 67) HHH025030: Transactional caches are not supported. The configuration option will be ignored; please unset.
2026-10-23 10:17:57,349 WARN  [org.jboss.weld.Bootstrap] (MSC service thread 1-2) WELD-000146: BeforeBeanDiscovery.addAnnotatedType(AnnotatedType<?>) used for class com.sun.faces.flow.FlowDiscoveryCDIHelper is deprecated from CDI 1.1!
2026-10-23 10:17:59,238 INFO  [javax.enterprise.resource.webcontainer.jsf.config] (ServerService Thread Pool -- 81) Initializing Mojarra 2.3.14.SP06 for context '/sicowpenhor'
2026-10-23 10:18:01,737 INFO  [org.primefaces.webapp.PostConstructApplicationEventListener] (ServerService Thread Pool -- 81) Running on PrimeFaces 3.5
2026-10-23 10:18:01,850 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 81) WFLYUT0021: Registered web context: '/sicowpenhor' for server 'default-server'
2026-10-23 10:18:01,920 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 38) WFLYSRV0010: Deployed "sicow-penhor-okd.war" (runtime-name : "sicow-penhor-okd.war")
2026-10-23 10:18:01,920 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 38) WFLYSRV0010: Deployed "applicationinsights-agent-3.7.1.jar" (runtime-name : "applicationinsights-agent-3.7.1.jar")
2026-10-23 10:18:02,029 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
2026-10-23 10:18:02,032 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) started in 38807ms - Started 848 of 1009 services (369 services are lazy, passive or on-demand)
2026-10-23 10:18:02,033 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://0.0.0.0:9990/management
2026-10-23 10:18:02,034 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: Admin console listening on http://0.0.0.0:9990
2026-10-23 10:19:05,522 INFO  [stdout] (reactor-http-epoll-1) 2026-10-23 10:19:05.522-03:00 WARN  c.a.m.o.a.i.p.TelemetryPipeline - Sending telemetry to the ingestion service: Received response code 402 (daily quota exceeded and throttled over extended time) (future warnings will be aggregated and logged once every 5 minutes)
2026-10-23 10:20:37,524 WARN  [org.jboss.as.domain.management.security] (default I/O-2) WFLYDM0113: Generated self signed certificate at /opt/jboss/standalone/configuration/application.keystore. Please note that self signed certificates are not secure, and should only be used for testing purposes. Do not use this self signed certificate in production.
SHA-1 fingerprint of the generated key is 1f:5b:60:3f:2e:18:57:2e:f7:3d:e6:bc:43:3e:53:15:39:93:cf:a6
SHA-256 fingerprint of the generated key is 48:1b:78:21:f3:74:49:69:c9:3a:ac:1e:b7:95:72:fc:b7:c6:5f:f3:e4:19:6d:bf:34:8f:e4:ff:61:3d:d9:ac
2026-10-23 10:20:43,743 INFO  [br.gov.caixa.pr.sicow.portal.login.phaseListener.SicowLoginHttpsPhaseListener] (default task-1) false
2026-10-23 10:20:43,842 INFO  [br.gov.caixa.pr.sicow.portal.login.phaseListener.SicowLoginHttpsPhaseListener] (default task-1) false
2026-10-23 10:20:44,041 SEVERE [javax.enterprise.resource.webcontainer.jsf.application] (default task-1) Error Rendering View[/login.xhtml]: javax.faces.FacesException: javax.el.ELException: /login.xhtml @12,54 onload="#{sicowLoginBean.logoutPortal()}": br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
	at javax.faces.component.UIComponentBase$AttributesMap.get(UIComponentBase.java:2007)
	at com.sun.faces.renderkit.RenderKitUtils.renderPassThruAttributesOptimized(RenderKitUtils.java:725)
	at com.sun.faces.renderkit.RenderKitUtils.renderPassThruAttributes(RenderKitUtils.java:374)
	at com.sun.faces.renderkit.RenderKitUtils.renderPassThruAttributes(RenderKitUtils.java:337)
	at com.sun.faces.renderkit.html_basic.BodyRenderer.encodeBegin(BodyRenderer.java:62)
	at javax.faces.component.UIComponentBase.encodeBegin(UIComponentBase.java:540)
	at javax.faces.component.UIComponent.encodeAll(UIComponent.java:1644)
	at javax.faces.component.UIComponent.encodeAll(UIComponent.java:1650)
	at com.sun.faces.application.view.FaceletViewHandlingStrategy.renderView(FaceletViewHandlingStrategy.java:468)
	at com.sun.faces.application.view.MultiViewHandler.renderView(MultiViewHandler.java:170)
	at javax.faces.application.ViewHandlerWrapper.renderView(ViewHandlerWrapper.java:132)
	at javax.faces.application.ViewHandlerWrapper.renderView(ViewHandlerWrapper.java:132)
	at com.sun.faces.lifecycle.RenderResponsePhase.execute(RenderResponsePhase.java:102)
	at com.sun.faces.lifecycle.Phase.doPhase(Phase.java:76)
	at com.sun.faces.lifecycle.LifecycleImpl.render(LifecycleImpl.java:199)
	at javax.faces.webapp.FacesServlet.executeLifecyle(FacesServlet.java:708)
	at javax.faces.webapp.FacesServlet.service(FacesServlet.java:451)
	at io.undertow.servlet.handlers.ServletHandler.handleRequest(ServletHandler.java:74)
	at io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:81)
	at io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
	at io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68)
	at io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:257)
	at io.undertow.servlet.handlers.ServletInitialHandler.dispatchToPath(ServletInitialHandler.java:182)
	at io.undertow.servlet.spec.RequestDispatcherImpl.forwardImpl(RequestDispatcherImpl.java:188)
	at io.undertow.servlet.spec.RequestDispatcherImpl.forwardImplSetup(RequestDispatcherImpl.java:136)
	at io.undertow.servlet.spec.RequestDispatcherImpl.forward(RequestDispatcherImpl.java:99)
	at io.undertow.servlet.handlers.security.ServletFormAuthenticationMechanism.servePage(ServletFormAuthenticationMechanism.java:170)
	at io.undertow.security.impl.FormAuthenticationMechanism.sendChallenge(FormAuthenticationMechanism.java:205)
	at io.undertow.security.impl.SecurityContextImpl$ChallengeSender.transition(SecurityContextImpl.java:301)
	at io.undertow.security.impl.SecurityContextImpl$ChallengeSender.transition(SecurityContextImpl.java:319)
	at io.undertow.security.impl.SecurityContextImpl$ChallengeSender.access$300(SecurityContextImpl.java:284)
	at io.undertow.security.impl.SecurityContextImpl.sendChallenges(SecurityContextImpl.java:130)
	at io.undertow.security.impl.SecurityContextImpl.authTransition(SecurityContextImpl.java:102)
	at io.undertow.security.impl.SecurityContextImpl.authTransition(SecurityContextImpl.java:107)
	at io.undertow.security.impl.SecurityContextImpl.authenticate(SecurityContextImpl.java:92)
	at io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:55)
	at io.undertow.server.handlers.DisableCacheHandler.handleRequest(DisableCacheHandler.java:33)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.security.handlers.AuthenticationConstraintHandler.handleRequest(AuthenticationConstraintHandler.java:53)
	at io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
	at io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
	at io.undertow.servlet.handlers.security.ServletSecurityConstraintHandler.handleRequest(ServletSecurityConstraintHandler.java:60)
	at io.undertow.security.handlers.AuthenticationMechanismsHandler.handleRequest(AuthenticationMechanismsHandler.java:60)
	at io.undertow.servlet.handlers.security.CachedAuthenticatedSessionHandler.handleRequest(CachedAuthenticatedSessionHandler.java:77)
	at io.undertow.security.handlers.NotificationReceiverHandler.handleRequest(NotificationReceiverHandler.java:50)
	at io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at org.wildfly.extension.undertow.deployment.GlobalRequestControllerHandler.handleRequest(GlobalRequestControllerHandler.java:68)
	at io.undertow.servlet.handlers.SendErrorPageHandler.handleRequest(SendErrorPageHandler.java:52)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:275)
	at io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:79)
	at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:134)
	at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:131)
	at io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
	at io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
	at org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
	at io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:255)
	at io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:79)
	at io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:100)
	at io.undertow.server.Connectors.executeRootHandler(Connectors.java:393)
	at io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852)
	at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
	at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
	at org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
	at java.lang.Thread.run(Thread.java:750)
Caused by: javax.el.ELException: /login.xhtml @12,54 onload="#{sicowLoginBean.logoutPortal()}": br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
	at com.sun.faces.facelets.el.TagValueExpression.getValue(TagValueExpression.java:77)
	at javax.faces.component.ComponentStateHelper.eval(ComponentStateHelper.java:170)
	at javax.faces.component.ComponentStateHelper.eval(ComponentStateHelper.java:157)
	at javax.faces.component.html.HtmlBody.getOnload(HtmlBody.java:235)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at javax.faces.component.UIComponentBase$AttributesMap.get(UIComponentBase.java:2000)
	... 79 more
Caused by: javax.el.ELException: br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
	at javax.el.ELUtil.invokeMethod(ELUtil.java:251)
	at javax.el.BeanELResolver.invoke(BeanELResolver.java:338)
	at javax.el.CompositeELResolver.invoke(CompositeELResolver.java:198)
	at com.sun.el.parser.AstValue.getValue(AstValue.java:110)
	at com.sun.el.parser.AstValue.getValue(AstValue.java:177)
	at com.sun.el.ValueExpressionImpl.getValue(ValueExpressionImpl.java:183)
	at org.jboss.weld.module.web.el.WeldValueExpression.getValue(WeldValueExpression.java:50)
	at org.jboss.weld.module.web.el.WeldValueExpression.getValue(WeldValueExpression.java:50)
	at com.sun.faces.facelets.el.TagValueExpression.getValue(TagValueExpression.java:73)
	... 87 more
Caused by: br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
	at br.gov.caixa.pr.sicow.portal.util.ParameterUtil.getParamValue(ParameterUtil.java:34)
	at br.gov.caixa.pr.sicow.portal.util.ParameterUtil.getUrlPortal(ParameterUtil.java:102)
	at br.gov.caixa.pr.sicow.portal.login.mbean.SicowLoginBean.logoutPortal(SicowLoginBean.java:74)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at javax.el.ELUtil.invokeMethod(ELUtil.java:245)
	... 95 more

2026-10-23 10:20:44,046 ERROR [io.undertow.request] (default task-1) UT005023: Exception handling request to /sicowpenhor/login.cef: java.lang.RuntimeException: javax.servlet.ServletException: Parametro sicowportalURL veio sem valor
	at io.undertow.servlet.handlers.security.ServletFormAuthenticationMechanism.servePage(ServletFormAuthenticationMechanism.java:172)
	at io.undertow.security.impl.FormAuthenticationMechanism.sendChallenge(FormAuthenticationMechanism.java:205)
	at io.undertow.security.impl.SecurityContextImpl$ChallengeSender.transition(SecurityContextImpl.java:301)
	at io.undertow.security.impl.SecurityContextImpl$ChallengeSender.transition(SecurityContextImpl.java:319)
	at io.undertow.security.impl.SecurityContextImpl$ChallengeSender.access$300(SecurityContextImpl.java:284)
	at io.undertow.security.impl.SecurityContextImpl.sendChallenges(SecurityContextImpl.java:130)
	at io.undertow.security.impl.SecurityContextImpl.authTransition(SecurityContextImpl.java:102)
	at io.undertow.security.impl.SecurityContextImpl.authTransition(SecurityContextImpl.java:107)
	at io.undertow.security.impl.SecurityContextImpl.authenticate(SecurityContextImpl.java:92)
	at io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:55)
	at io.undertow.server.handlers.DisableCacheHandler.handleRequest(DisableCacheHandler.java:33)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.security.handlers.AuthenticationConstraintHandler.handleRequest(AuthenticationConstraintHandler.java:53)
	at io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
	at io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
	at io.undertow.servlet.handlers.security.ServletSecurityConstraintHandler.handleRequest(ServletSecurityConstraintHandler.java:60)
	at io.undertow.security.handlers.AuthenticationMechanismsHandler.handleRequest(AuthenticationMechanismsHandler.java:60)
	at io.undertow.servlet.handlers.security.CachedAuthenticatedSessionHandler.handleRequest(CachedAuthenticatedSessionHandler.java:77)
	at io.undertow.security.handlers.NotificationReceiverHandler.handleRequest(NotificationReceiverHandler.java:50)
	at io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at org.wildfly.extension.undertow.deployment.GlobalRequestControllerHandler.handleRequest(GlobalRequestControllerHandler.java:68)
	at io.undertow.servlet.handlers.SendErrorPageHandler.handleRequest(SendErrorPageHandler.java:52)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:275)
	at io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:79)
	at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:134)
	at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:131)
	at io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
	at io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
	at org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
	at io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:255)
	at io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:79)
	at io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:100)
	at io.undertow.server.Connectors.executeRootHandler(Connectors.java:393)
	at io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852)
	at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
	at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
	at org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
	at java.lang.Thread.run(Thread.java:750)
Caused by: javax.servlet.ServletException: Parametro sicowportalURL veio sem valor
	at javax.faces.webapp.FacesServlet.executeLifecyle(FacesServlet.java:725)
	at javax.faces.webapp.FacesServlet.service(FacesServlet.java:451)
	at io.undertow.servlet.handlers.ServletHandler.handleRequest(ServletHandler.java:74)
	at io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:81)
	at io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
	at io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68)
	at io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:257)
	at io.undertow.servlet.handlers.ServletInitialHandler.dispatchToPath(ServletInitialHandler.java:182)
	at io.undertow.servlet.spec.RequestDispatcherImpl.forwardImpl(RequestDispatcherImpl.java:188)
	at io.undertow.servlet.spec.RequestDispatcherImpl.forwardImplSetup(RequestDispatcherImpl.java:136)
	at io.undertow.servlet.spec.RequestDispatcherImpl.forward(RequestDispatcherImpl.java:99)
	at io.undertow.servlet.handlers.security.ServletFormAuthenticationMechanism.servePage(ServletFormAuthenticationMechanism.java:170)
	... 48 more
Caused by: br.gov.caixa.pr.sicow.portal.exception.SicowPortalException: Parametro sicowportalURL veio sem valor
	at br.gov.caixa.pr.sicow.portal.util.ParameterUtil.getParamValue(ParameterUtil.java:34)
	at br.gov.caixa.pr.sicow.portal.util.ParameterUtil.getUrlPortal(ParameterUtil.java:102)
	at br.gov.caixa.pr.sicow.portal.login.mbean.SicowLoginBean.logoutPortal(SicowLoginBean.java:74)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at javax.el.ELUtil.invokeMethod(ELUtil.java:245)
	at javax.el.BeanELResolver.invoke(BeanELResolver.java:338)
	at javax.el.CompositeELResolver.invoke(CompositeELResolver.java:198)
	at com.sun.el.parser.AstValue.getValue(AstValue.java:110)
	at com.sun.el.parser.AstValue.getValue(AstValue.java:177)
	at com.sun.el.ValueExpressionImpl.getValue(ValueExpressionImpl.java:183)
	at org.jboss.weld.module.web.el.WeldValueExpression.getValue(WeldValueExpression.java:50)
	at org.jboss.weld.module.web.el.WeldValueExpression.getValue(WeldValueExpression.java:50)
	at com.sun.faces.facelets.el.TagValueExpression.getValue(TagValueExpression.java:73)
	at javax.faces.component.ComponentStateHelper.eval(ComponentStateHelper.java:170)
	at javax.faces.component.ComponentStateHelper.eval(ComponentStateHelper.java:157)
	at javax.faces.component.html.HtmlBody.getOnload(HtmlBody.java:235)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at javax.faces.component.UIComponentBase$AttributesMap.get(UIComponentBase.java:2000)
	at com.sun.faces.renderkit.RenderKitUtils.renderPassThruAttributesOptimized(RenderKitUtils.java:725)
	at com.sun.faces.renderkit.RenderKitUtils.renderPassThruAttributes(RenderKitUtils.java:374)
	at com.sun.faces.renderkit.RenderKitUtils.renderPassThruAttributes(RenderKitUtils.java:337)
	at com.sun.faces.renderkit.html_basic.BodyRenderer.encodeBegin(BodyRenderer.java:62)
	at javax.faces.component.UIComponentBase.encodeBegin(UIComponentBase.java:540)
	at javax.faces.component.UIComponent.encodeAll(UIComponent.java:1644)
	at javax.faces.component.UIComponent.encodeAll(UIComponent.java:1650)
	at com.sun.faces.application.view.FaceletViewHandlingStrategy.renderView(FaceletViewHandlingStrategy.java:468)
	at com.sun.faces.application.view.MultiViewHandler.renderView(MultiViewHandler.java:170)
	at javax.faces.application.ViewHandlerWrapper.renderView(ViewHandlerWrapper.java:132)
	at javax.faces.application.ViewHandlerWrapper.renderView(ViewHandlerWrapper.java:132)
	at com.sun.faces.lifecycle.RenderResponsePhase.execute(RenderResponsePhase.java:102)
	at com.sun.faces.lifecycle.Phase.doPhase(Phase.java:76)
	at com.sun.faces.lifecycle.LifecycleImpl.render(LifecycleImpl.java:199)
	at javax.faces.webapp.FacesServlet.executeLifecyle(FacesServlet.java:708)
	... 64 more

2026-10-23 10:20:44,049 INFO  [br.gov.caixa.pr.sicow.portal.login.phaseListener.SicowLoginHttpsPhaseListener] (default task-1) false
2026-10-23 10:20:44,109 INFO  [br.gov.caixa.pr.sicow.portal.login.phaseListener.SicowLoginHttpsPhaseListener] (default task-1) false
2026-10-23 10:20:44,413 INFO  [br.gov.caixa.pr.sicow.portal.login.filter.SicowIECompatibleFixFilter] (default task-2) #### init null
2026-10-23 10:21:10,181 INFO  [stdout] (reactor-http-epoll-1) 2026-10-23 10:21:10.181-03:00 WARN  c.a.m.o.a.i.p.TelemetryPipeline - Sending telemetry to the ingestion service: Received response code 402 (daily quota exceeded and throttled over extended time) (future warnings will be aggregated and logged once every 5 minutes)
