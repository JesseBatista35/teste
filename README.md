 failed login: Mon Sep 14 10:08:37 -03 2026 from 10.122.150.31 on ssh:notty
There was 1 failed login attempt since the last successful login.
Last login: Fri Sep 11 15:07:11 2026 from 10.122.150.31
[p585600@crjtqapllx036 ~]$ ps -ef | grep jboss
p585600  121428 121194  0 10:08 pts/1    00:00:00 grep --color=auto jboss
[p585600@crjtqapllx036 ~]$ sudo su
[root@crjtqapllx036 p585600]# cd /opt/open/sso/7.3.0/bin/
[root@crjtqapllx036 bin]# nohup ./standalone.sh -c standalone.xml > /tmp/jboss_start2.log 2>&1 &
[1] 121803
[root@crjtqapllx036 bin]# tail -f /tmp/jboss_start2.log
  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/open/sso/7.3.0

  JAVA: /opt/open/java/jdk1.8.0_121/bin/java

  JAVA_OPTS:  -server -verbose:gc -Xloggc:/opt/open/sso/7.3.0/standalone/log/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms32768m -Xmx32768m -XX:MetaspaceSize=1024m -XX:MaxMetaspaceSize=1024m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -DhttpRecaptchaProxyHost="proxydes.caixa" -DhttpRecaptchaProxyPort="80" -DhttpRecaptchaProxyScheme=http -Dhttps.proxyHost="proxydes.caixa" -Dhttps.proxyPort="80" -Dhttp.nonProxyHosts="*.caixa|*.caixa.gov.br|localhost" -Dhttp.proxyHost="proxydes.caixa" -Dhttp.proxyPort="80" -Dftp.proxyHost="proxydes.caixa" -Dftp.proxyPort="80" -javaagent:/infra_app/config/appinsights/applicationinsights-agent-3.3.1.jar

=========================================================================

10:10:48,799 INFO  [org.jboss.modules] (main) JBoss Modules version 1.8.8.Final-redhat-00001
10:10:49,045 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.5.Final-redhat-00001
10:10:49,073 INFO  [org.jboss.threads] (main) JBoss Threads version 2.3.2.Final-redhat-1
10:10:49,241 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: Red Hat Single Sign-On 7.3.3.GA (WildFly Core 6.0.15.Final-redhat-00001) starting
10:10:49,647 WARN  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0456: System property http.nonProxyHosts=*.caixa|*.caixa.gov.br|localhost already set. It's being overridden by new value *.caixa|*.caixa.gov.br|localhost|fnlogeventos-des.azurewebsites.net
10:10:49,979 INFO  [org.wildfly.security] (ServerService Thread Pool -- 21) ELY00001: WildFly Elytron version 1.6.3.Final-redhat-00001
10:10:50,431 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=native-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
10:10:50,433 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
10:10:50,449 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 26) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
10:10:50,487 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: Re-attempting failed deployment OTPCaixaCond.jar
10:10:50,492 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: Re-attempting failed deployment directgrantpassword-jar-with-dependencies.jar
10:10:50,494 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: Re-attempting failed deployment eventExternal-jar-with-dependencies.jar
10:10:50,495 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: Re-attempting failed deployment BrowserPassword-jar-with-dependencies.jar
10:10:50,495 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: Re-attempting failed deployment loginCaixa-jar-with-dependencies.jar
10:10:50,495 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: Re-attempting failed deployment servico.war
10:10:50,496 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: Re-attempting failed deployment user-storage-jpa-siper-jar-with-dependencies.jar
10:10:50,497 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: Re-attempting failed deployment validaLogin-jar-with-dependencies.jar
10:10:50,497 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: Re-attempting failed deployment siset-user-session-provider.jar
10:10:50,497 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: Re-attempting failed deployment resource-provider-jar-with-dependencies.jar
10:10:51,391 INFO  [org.jboss.security] (Controller Boot Thread) PBOX00361: Default Security Vault Implementation Initialized and Ready
10:10:51,407 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
10:10:51,411 INFO  [org.xnio] (MSC service thread 1-3) XNIO version 3.6.6.Final-redhat-00001
10:10:51,417 INFO  [org.xnio.nio] (MSC service thread 1-3) XNIO NIO Implementation Version 3.6.6.Final-redhat-00001
10:10:51,446 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 36) WFLYCLINF0001: Activating Infinispan subsystem.
10:10:51,454 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 37) WFLYIO001: Worker 'default' has auto-configured to 32 core threads with 256 task threads based on your 16 available processors
10:10:51,462 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 38) WFLYRS0016: RESTEasy version 3.6.1.SP6-redhat-00001
10:10:51,466 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 49) WFLYSEC0002: Activating Security Subsystem
10:10:51,468 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 45) WFLYNAM0001: Activating Naming Subsystem
10:10:51,471 INFO  [org.jboss.as.security] (MSC service thread 1-1) WFLYSEC0001: Current PicketBox version=5.0.3.Final-redhat-3
10:10:51,464 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 51) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
10:10:51,500 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-3) WFLYMAIL0002: Unbound mail session [java:jboss/mail/Default]
10:10:51,510 INFO  [org.jboss.as.connector] (MSC service thread 1-2) WFLYJCA0009: Starting JCA Subsystem (WildFly/IronJacamar 1.4.16.Final-redhat-00001)
10:10:51,526 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) WFLYUT0003: Undertow 2.0.22.Final-redhat-00001 starting
10:10:51,557 INFO  [org.jboss.as.naming] (MSC service thread 1-3) WFLYNAM0003: Starting Naming Service
10:10:51,558 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-3) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
10:10:51,568 INFO  [org.jboss.remoting] (MSC service thread 1-8) JBoss Remoting version 5.0.12.Final-redhat-00001
10:10:51,670 INFO  [org.jboss.as.ejb3] (MSC service thread 1-8) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 256 (per class), which is derived from thread worker pool sizing.
10:10:51,670 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 64 (per class), which is derived from the number of CPUs on this host.
10:10:51,743 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 52) WFLYUT0014: Creating file handler for path '/opt/open/sso/7.3.0/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
10:10:51,762 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 52) WFLYUT0014: Creating file handler for path '/opt/open/sso/7.3.0/suporte' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
10:10:51,778 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) WFLYUT0012: Started server default-server.
10:10:51,783 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-8) WFLYUT0018: Host default-host starting
10:10:51,793 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 31) WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.driver.OracleDriver (version 11.2)
10:10:51,797 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-4) WFLYJCA0018: Started Driver service with driver-name = oracle
10:10:51,805 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 31) WFLYJCA0004: Deploying JDBC-compliant driver class org.h2.Driver (version 1.4)
10:10:51,806 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-4) WFLYJCA0018: Started Driver service with driver-name = h2
10:10:51,837 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-3) WFLYJCA0010: Unbound data source [java:jboss/datasources/oraset]
10:10:51,837 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-5) WFLYJCA0010: Unbound data source [java:jboss/datasources/ExampleDS]
10:10:51,844 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: Undertow HTTP listener default listening on 10.116.26.227:8080
10:10:51,850 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-4) WFLYJCA0010: Unbound data source [java:jboss/datasources/KeycloakDS]
10:10:51,854 INFO  [org.jboss.as.ejb3] (MSC service thread 1-3) WFLYEJB0493: EJB subsystem suspension complete
10:10:51,929 INFO  [org.jboss.as.patching] (MSC service thread 1-5) WFLYPAT0050: Red Hat Single Sign-On cumulative patch ID is: rh-sso-7.3.3.CP, one-off patches include: none
10:10:51,937 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-2) WFLYDM0111: Keystore /opt/open/sso/7.3.0/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self signed certificate for host localhost
10:10:51,939 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) WFLYJCA0001: Bound data source [java:jboss/datasources/oraset]
10:10:51,940 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) WFLYJCA0001: Bound data source [java:jboss/datasources/ExampleDS]
10:10:51,951 INFO  [org.jboss.as.remoting] (MSC service thread 1-3) WFLYRMT0001: Listening on 10.116.26.227:9999
10:10:51,952 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-8) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/open/sso/7.3.0/standalone/deployments
10:10:51,961 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0027: Starting deployment of "OTPCaixaCond.jar" (runtime-name: "OTPCaixaCond.jar")
10:10:51,960 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Starting deployment of "eventExternal-jar-with-dependencies.jar" (runtime-name: "eventExternal-jar-with-dependencies.jar")
10:10:51,960 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0027: Starting deployment of "resource-provider-jar-with-dependencies.jar" (runtime-name: "resource-provider-jar-with-dependencies.jar")
10:10:51,960 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0027: Starting deployment of "directgrantpassword-jar-with-dependencies.jar" (runtime-name: "directgrantpassword-jar-with-dependencies.jar")
10:10:51,963 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0027: Starting deployment of "BrowserPassword-jar-with-dependencies.jar" (runtime-name: "BrowserPassword-jar-with-dependencies.jar")
10:10:51,963 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0027: Starting deployment of "validaLogin-jar-with-dependencies.jar" (runtime-name: "validaLogin-jar-with-dependencies.jar")
10:10:51,963 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0027: Starting deployment of "siset-user-session-provider.jar" (runtime-name: "siset-user-session-provider.jar")
10:10:51,964 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0027: Starting deployment of "keycloak-server.war" (runtime-name: "keycloak-server.war")
10:10:51,964 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0027: Starting deployment of "servico.war" (runtime-name: "servico.war")
10:10:51,963 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0027: Starting deployment of "user-storage-jpa-siper-jar-with-dependencies.jar" (runtime-name: "user-storage-jpa-siper-jar-with-dependencies.jar")
10:10:51,966 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0027: Starting deployment of "loginCaixa-jar-with-dependencies.jar" (runtime-name: "loginCaixa-jar-with-dependencies.jar")
10:10:52,087 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0006: Undertow HTTPS listener https listening on 10.116.26.227:8443
10:10:52,451 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (JCA PoolFiller) IJ000610: Unable to fill pool: java:jboss/datasources/KeycloakDS: javax.resource.ResourceException: IJ031084: Unable to create connection
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:345)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:352)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
        at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1325)
        at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.fillTo(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1138)
        at org.jboss.jca.core.connectionmanager.pool.mcp.PoolFiller.run(PoolFiller.java:97)
        at java.lang.Thread.run(Thread.java:745)
Caused by: java.sql.SQLException: ORA-01017: invalid username/password; logon denied

        at oracle.jdbc.driver.T4CTTIoer.processError(T4CTTIoer.java:440)
        at oracle.jdbc.driver.T4CTTIoer.processError(T4CTTIoer.java:389)
        at oracle.jdbc.driver.T4CTTIoer.processError(T4CTTIoer.java:382)
        at oracle.jdbc.driver.T4CTTIfun.processError(T4CTTIfun.java:573)
        at oracle.jdbc.driver.T4CTTIoauthenticate.processError(T4CTTIoauthenticate.java:431)
        at oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:445)
        at oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:191)
        at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:366)
        at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:752)
        at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:366)
        at oracle.jdbc.driver.PhysicalConnection.<init>(PhysicalConnection.java:536)
        at oracle.jdbc.driver.T4CConnection.<init>(T4CConnection.java:228)
        at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:32)
        at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:521)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:321)
        ... 6 more

10:10:53,491 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/TriggeringEventEvaluator.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,491 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/LoggingEvent.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,493 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/RootCategory.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,494 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/ThrowableRendererSupport.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,494 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/RendererSupport.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,495 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/NullWriter.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,497 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/RepositorySelector.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,497 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/NOPLoggerRepository.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,497 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/NOPLogger.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,497 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/ThrowableRenderer.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,498 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/VectorWriter.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,498 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/OptionHandler.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,498 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/RootLogger.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,498 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/ThrowableInformation.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,501 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/varia/LevelMatchFilter.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,502 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/varia/HUPNode.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,502 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/varia/HUP.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,502 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/varia/LevelRangeFilter.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,502 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/varia/Roller.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,504 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/varia/NullAppender.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,506 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/varia/DenyAllFilter.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,506 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/varia/FallbackErrorHandler.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,506 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/varia/ReloadingPropertyConfigurator.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,506 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/varia/ExternallyRolledFileAppender.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,511 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/TriggeringEventEvaluator.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,511 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/LoggingEvent.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,511 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/RootCategory.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,512 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/ThrowableRendererSupport.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,512 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/RendererSupport.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,512 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/NullWriter.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,513 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/RepositorySelector.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,513 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/NOPLoggerRepository.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,514 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/NOPLogger.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,514 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/ThrowableRenderer.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,517 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/VectorWriter.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,518 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/OptionHandler.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,518 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/RootLogger.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,518 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/ThrowableInformation.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,521 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/varia/LevelMatchFilter.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,521 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/varia/HUPNode.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,522 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/varia/HUP.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,523 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/varia/LevelRangeFilter.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,523 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/varia/Roller.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,523 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/varia/NullAppender.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,523 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/varia/DenyAllFilter.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,524 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/varia/FallbackErrorHandler.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,524 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/varia/ReloadingPropertyConfigurator.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,524 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/varia/ExternallyRolledFileAppender.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
        at java.io.DataInputStream.readFully(DataInputStream.java:197)
        at java.io.DataInputStream.readFully(DataInputStream.java:169)
        at org.jboss.jandex.Indexer.verifyMagic(Indexer.java:1156)
        at org.jboss.jandex.Indexer.index(Indexer.java:1447)
        at org.jboss.as.server.deployment.annotation.ResourceRootIndexer.indexResourceRoot(ResourceRootIndexer.java:99)
        at org.jboss.as.server.deployment.annotation.AnnotationIndexProcessor.deploy(AnnotationIndexProcessor.java:51)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.start(DeploymentUnitPhaseService.java:144)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:53,685 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-3) WFLYJCA0001: Bound data source [java:jboss/datasources/KeycloakDS]
10:10:53,883 INFO  [org.jboss.as.jpa] (MSC service thread 1-3) WFLYJPA0002: Read persistence.xml for user-storage-jpa-siper
10:10:53,913 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-4) WFLYSRV0018: Deployment "deployment.OTPCaixaCond.jar" is using a private module ("org.keycloak.keycloak-services") which may be changed or removed in future versions without notice.
10:10:53,919 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-6) WFLYSRV0018: Deployment "deployment.eventExternal-jar-with-dependencies.jar" is using a private module ("org.keycloak.keycloak-services") which may be changed or removed in future versions without notice.
10:10:53,920 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-4) Deploying Keycloak provider: OTPCaixaCond.jar
10:10:53,935 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-5) WFLYSRV0018: Deployment "deployment.loginCaixa-jar-with-dependencies.jar" is using a private module ("org.keycloak.keycloak-services") which may be changed or removed in future versions without notice.
10:10:53,939 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-6) WFLYSRV0018: Deployment "deployment.siset-user-session-provider.jar" is using a private module ("org.keycloak.keycloak-server-spi-private") which may be changed or removed in future versions without notice.
10:10:53,943 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-6) WFLYSRV0018: Deployment "deployment.siset-user-session-provider.jar" is using a private module ("org.keycloak.keycloak-services") which may be changed or removed in future versions without notice.
10:10:53,947 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-1) WFLYSRV0018: Deployment "deployment.BrowserPassword-jar-with-dependencies.jar" is using a private module ("org.keycloak.keycloak-services") which may be changed or removed in future versions without notice.
10:10:53,944 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-6) WFLYSRV0018: Deployment "deployment.siset-user-session-provider.jar" is using a private module ("org.keycloak.keycloak-model-infinispan") which may be changed or removed in future versions without notice.
10:10:53,947 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-1) Deploying Keycloak provider: eventExternal-jar-with-dependencies.jar
10:10:53,952 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-6) WFLYSRV0018: Deployment "deployment.siset-user-session-provider.jar" is using a private module ("org.keycloak.keycloak-model-jpa") which may be changed or removed in future versions without notice.
10:10:53,953 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-6) WFLYSRV0018: Deployment "deployment.siset-user-session-provider.jar" is using a private module ("org.infinispan") which may be changed or removed in future versions without notice.
10:10:53,953 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-6) WFLYSRV0018: Deployment "deployment.siset-user-session-provider.jar" is using a private module ("org.infinispan.commons") which may be changed or removed in future versions without notice.
10:10:53,953 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-6) Deploying Keycloak provider: loginCaixa-jar-with-dependencies.jar
10:10:53,961 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-3) WFLYSRV0018: Deployment "deployment.directgrantpassword-jar-with-dependencies.jar" is using a private module ("org.keycloak.keycloak-services") which may be changed or removed in future versions without notice.
10:10:53,961 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-6) Deploying Keycloak provider: BrowserPassword-jar-with-dependencies.jar
10:10:53,961 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-3) Deploying Keycloak provider: siset-user-session-provider.jar
10:10:53,968 WARN  [org.jboss.weld.deployer] (MSC service thread 1-6) WFLYWELD0013: Deployment eventExternal-jar-with-dependencies.jar contains CDI annotations but no bean archive was found (no beans.xml or class with bean defining annotations was present).
10:10:53,968 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-2) WFLYSRV0018: Deployment "deployment.validaLogin-jar-with-dependencies.jar" is using a private module ("org.keycloak.keycloak-services") which may be changed or removed in future versions without notice.
10:10:53,969 WARN  [org.jboss.weld.deployer] (MSC service thread 1-2) WFLYWELD0013: Deployment loginCaixa-jar-with-dependencies.jar contains CDI annotations but no bean archive was found (no beans.xml or class with bean defining annotations was present).
10:10:53,976 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-3) Deploying Keycloak provider: directgrantpassword-jar-with-dependencies.jar
10:10:53,978 WARN  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0013: Deployment BrowserPassword-jar-with-dependencies.jar contains CDI annotations but no bean archive was found (no beans.xml or class with bean defining annotations was present).
10:10:53,979 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-1) Deploying Keycloak provider: validaLogin-jar-with-dependencies.jar
10:10:53,997 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-5) WFLYSRV0018: Deployment "deployment.keycloak-server.war" is using a private module ("org.kie") which may be changed or removed in future versions without notice.
10:10:54,029 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-6) Deploying Keycloak provider: user-storage-jpa-siper-jar-with-dependencies.jar
10:10:54,033 WARN  [org.jboss.weld.deployer] (MSC service thread 1-5) WFLYWELD0013: Deployment directgrantpassword-jar-with-dependencies.jar contains CDI annotations but no bean archive was found (no beans.xml or class with bean defining annotations was present).
10:10:54,034 WARN  [org.jboss.weld.deployer] (MSC service thread 1-3) WFLYWELD0013: Deployment validaLogin-jar-with-dependencies.jar contains CDI annotations but no bean archive was found (no beans.xml or class with bean defining annotations was present).
10:10:54,038 INFO  [org.jboss.weld.deployer] (MSC service thread 1-6) WFLYWELD0003: Processing weld deployment user-storage-jpa-siper-jar-with-dependencies.jar
10:10:54,052 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-3) WFLYSRV0018: Deployment "deployment.resource-provider-jar-with-dependencies.jar" is using a private module ("org.keycloak.keycloak-services") which may be changed or removed in future versions without notice.
10:10:54,058 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-2) Deploying Keycloak provider: resource-provider-jar-with-dependencies.jar
10:10:54,061 WARN  [org.jboss.weld.deployer] (MSC service thread 1-8) WFLYWELD0013: Deployment resource-provider-jar-with-dependencies.jar contains CDI annotations but no bean archive was found (no beans.xml or class with bean defining annotations was present).
10:10:54,164 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-6) HV000001: Hibernate Validator 6.0.16.Final-redhat-00001
10:10:54,323 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: JNDI bindings for session bean named 'SiperUserStorageProvider' in deployment unit 'deployment "user-storage-jpa-siper-jar-with-dependencies.jar"' are as follows:

        java:global/user-storage-jpa-siper-jar-with-dependencies/SiperUserStorageProvider!br.gov.caixa.keycloak.SiperUserStorageProvider
        java:app/user-storage-jpa-siper-jar-with-dependencies/SiperUserStorageProvider!br.gov.caixa.keycloak.SiperUserStorageProvider
        java:module/SiperUserStorageProvider!br.gov.caixa.keycloak.SiperUserStorageProvider
        ejb:/user-storage-jpa-siper-jar-with-dependencies/SiperUserStorageProvider!br.gov.caixa.keycloak.SiperUserStorageProvider?stateful
        java:global/user-storage-jpa-siper-jar-with-dependencies/SiperUserStorageProvider
        java:app/user-storage-jpa-siper-jar-with-dependencies/SiperUserStorageProvider
        java:module/SiperUserStorageProvider

10:10:54,402 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry jaxb-core.jar in /content/servico.war/WEB-INF/lib/jaxb-impl-2.3.0.jar  does not point to a valid jar for a Class-Path reference.
10:10:54,403 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: Class Path entry jaxb-api.jar in /content/servico.war/WEB-INF/lib/jaxb-core-2.3.0.jar  does not point to a valid jar for a Class-Path reference.
10:10:54,418 INFO  [org.infinispan.factories.GlobalComponentRegistry] (MSC service thread 1-4) ISPN000128: Infinispan version: Infinispan 'Estrella Galicia' 9.3.6.Final-redhat-00001
10:10:54,460 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 65) WFLYJPA0010: Starting Persistence Unit (phase 1 of 2) Service 'user-storage-jpa-siper-jar-with-dependencies.jar#user-storage-jpa-siper'
10:10:54,498 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 65) HHH000204: Processing PersistenceUnitInfo [
        name: user-storage-jpa-siper
        ...]
10:10:54,557 INFO  [org.jboss.as.jpa] (MSC service thread 1-1) WFLYJPA0002: Read persistence.xml for servico-dispositivo
10:10:54,600 INFO  [org.jboss.weld.Version] (MSC service thread 1-2) WELD-000900: 3.0.6 (redhat)
10:10:54,736 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 68) WFLYJPA0010: Starting Persistence Unit (phase 1 of 2) Service 'servico.war#servico-dispositivo'
10:10:54,736 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 68) HHH000204: Processing PersistenceUnitInfo [
        name: servico-dispositivo
        ...]
10:10:54,747 INFO  [org.hibernate.Version] (ServerService Thread Pool -- 65) HHH000412: Hibernate Core {5.3.10.Final-redhat-00001}
10:10:54,751 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 65) HHH000206: hibernate.properties not found
10:10:54,790 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 66) WFLYCLINF0002: Started realms cache from keycloak container
10:10:54,791 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 63) WFLYCLINF0002: Started authenticationSessions cache from keycloak container
10:10:54,791 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 57) WFLYCLINF0002: Started keys cache from keycloak container
10:10:54,791 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 56) WFLYCLINF0002: Started clientSessions cache from keycloak container
10:10:54,791 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 54) WFLYCLINF0002: Started sessions cache from keycloak container
10:10:54,791 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 61) WFLYCLINF0002: Started offlineSessions cache from keycloak container
10:10:54,791 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 58) WFLYCLINF0002: Started actionTokens cache from keycloak container
10:10:54,793 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 60) WFLYCLINF0002: Started work cache from keycloak container
10:10:54,793 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 67) WFLYCLINF0002: Started client-mappings cache from ejb container
10:10:54,796 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 62) WFLYCLINF0002: Started authorization cache from keycloak container
10:10:54,796 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 64) WFLYCLINF0002: Started loginFailures cache from keycloak container
10:10:54,796 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 59) WFLYCLINF0002: Started users cache from keycloak container
10:10:54,797 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 55) WFLYCLINF0002: Started offlineClientSessions cache from keycloak container
10:10:54,851 INFO  [org.jboss.keycloak] (MSC service thread 1-2) Keycloak subsystem override for deployment servico.war
10:10:54,852 INFO  [org.jboss.weld.deployer] (MSC service thread 1-2) WFLYWELD0003: Processing weld deployment servico.war
10:10:54,901 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'Provider' in deployment unit 'deployment "servico.war"' are as follows:

        java:global/servico/Provider!br.gov.caixa.servico.negocio.Provider
        java:app/servico/Provider!br.gov.caixa.servico.negocio.Provider
        java:module/Provider!br.gov.caixa.servico.negocio.Provider
        ejb:/servico/Provider!br.gov.caixa.servico.negocio.Provider
        java:global/servico/Provider
        java:app/servico/Provider
        java:module/Provider

10:10:54,903 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'CodigoValidadorRepository' in deployment unit 'deployment "servico.war"' are as follows:

        java:global/servico/CodigoValidadorRepository!br.gov.caixa.validacao.codigo.repositorio.CodigoValidadorRepository
        java:app/servico/CodigoValidadorRepository!br.gov.caixa.validacao.codigo.repositorio.CodigoValidadorRepository
        java:module/CodigoValidadorRepository!br.gov.caixa.validacao.codigo.repositorio.CodigoValidadorRepository
        ejb:/servico/CodigoValidadorRepository!br.gov.caixa.validacao.codigo.repositorio.CodigoValidadorRepository
        java:global/servico/CodigoValidadorRepository
        java:app/servico/CodigoValidadorRepository
        java:module/CodigoValidadorRepository

10:10:54,903 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'FingerPrintRepository' in deployment unit 'deployment "servico.war"' are as follows:

        java:global/servico/FingerPrintRepository!br.gov.caixa.fingerprint.repositorio.FingerPrintRepository
        java:app/servico/FingerPrintRepository!br.gov.caixa.fingerprint.repositorio.FingerPrintRepository
        java:module/FingerPrintRepository!br.gov.caixa.fingerprint.repositorio.FingerPrintRepository
        ejb:/servico/FingerPrintRepository!br.gov.caixa.fingerprint.repositorio.FingerPrintRepository
        java:global/servico/FingerPrintRepository
        java:app/servico/FingerPrintRepository
        java:module/FingerPrintRepository

10:10:54,903 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'CodigoValidadorLogRepository' in deployment unit 'deployment "servico.war"' are as follows:

        java:global/servico/CodigoValidadorLogRepository!br.gov.caixa.validacao.codigo.repositorio.CodigoValidadorLogRepository
        java:app/servico/CodigoValidadorLogRepository!br.gov.caixa.validacao.codigo.repositorio.CodigoValidadorLogRepository
        java:module/CodigoValidadorLogRepository!br.gov.caixa.validacao.codigo.repositorio.CodigoValidadorLogRepository
        ejb:/servico/CodigoValidadorLogRepository!br.gov.caixa.validacao.codigo.repositorio.CodigoValidadorLogRepository
        java:global/servico/CodigoValidadorLogRepository
        java:app/servico/CodigoValidadorLogRepository
        java:module/CodigoValidadorLogRepository

10:10:54,904 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'CodigoUniProxRepository' in deployment unit 'deployment "servico.war"' are as follows:

        java:global/servico/CodigoUniProxRepository!br.gov.caixa.validacao.codigo.repositorio.CodigoUniProxRepository
        java:app/servico/CodigoUniProxRepository!br.gov.caixa.validacao.codigo.repositorio.CodigoUniProxRepository
        java:module/CodigoUniProxRepository!br.gov.caixa.validacao.codigo.repositorio.CodigoUniProxRepository
        ejb:/servico/CodigoUniProxRepository!br.gov.caixa.validacao.codigo.repositorio.CodigoUniProxRepository
        java:global/servico/CodigoUniProxRepository
        java:app/servico/CodigoUniProxRepository
        java:module/CodigoUniProxRepository

10:10:54,981 INFO  [org.hibernate.annotations.common.Version] (ServerService Thread Pool -- 68) HCANN000001: Hibernate Commons Annotations {5.0.4.Final-redhat-00001}
10:10:54,998 WARN  [org.jboss.as.jaxrs] (MSC service thread 1-2) WFLYRS0018: Explicit usage of Jackson annotation in a JAX-RS deployment; the system will disable JSON-B processing for the current deployment. Consider setting the 'resteasy.preferJacksonOverJsonB' property to 'false' to restore JSON-B.
10:10:55,200 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 68) WFLYJPA0010: Starting Persistence Unit (phase 2 of 2) Service 'servico.war#servico-dispositivo'
10:10:55,304 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 68) HHH000400: Using dialect: org.hibernate.dialect.OracleDialect
10:10:55,309 WARN  [org.hibernate.dialect.Oracle9Dialect] (ServerService Thread Pool -- 68) HHH000063: The Oracle9Dialect dialect has been deprecated; use either Oracle9iDialect or Oracle10gDialect instead
10:10:55,310 WARN  [org.hibernate.dialect.OracleDialect] (ServerService Thread Pool -- 68) HHH000064: The OracleDialect dialect has been deprecated; use Oracle8iDialect instead
10:10:55,376 INFO  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0001: Loading config from standalone.xml or domain.xml
10:10:55,488 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 68) Envers integration enabled? : true
10:10:55,732 INFO  [br.gov.caixa.keycloak.OTPFormAuthenticatorCaixaFactory] (ServerService Thread Pool -- 67) INIT OTPFormAuthenticatorCaixa - v2.0
10:10:55,733 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: auth-conditional-otp-form-caixa (br.gov.caixa.keycloak.OTPFormAuthenticatorCaixaFactory) is implementing the internal SPI authenticator. This SPI is internal and may change without notice
10:10:55,742 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: evento-todos (br.gov.caixa.keycloak.events.todos.EventExternalFactory) is implementing the internal SPI eventsListener. This SPI is internal and may change without notice
10:10:55,743 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: evento-execute-action (br.gov.caixa.keycloak.events.executeactions.EventExternalExecuteActionsFactory) is implementing the internal SPI eventsListener. This SPI is internal and may change without notice
10:10:55,743 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: evento-execute-action-error (br.gov.caixa.keycloak.events.executeactionserror.EventExternalExecuteActionsErrorFactory) is implementing the internal SPI eventsListener. This SPI is internal and may change without notice
10:10:55,743 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: evento-login (br.gov.caixa.keycloak.events.login.EventExternalLoginFactory) is implementing the internal SPI eventsListener. This SPI is internal and may change without notice
10:10:55,743 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: evento-login-error (br.gov.caixa.keycloak.events.loginerror.EventExternalLoginErrorFactory) is implementing the internal SPI eventsListener. This SPI is internal and may change without notice
10:10:55,743 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: evento-register (br.gov.caixa.keycloak.events.register.EventExternalRegisterFactory) is implementing the internal SPI eventsListener. This SPI is internal and may change without notice
10:10:55,743 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: evento-register-error (br.gov.caixa.keycloak.events.registerError.EventExternalRegisterErrorFactory) is implementing the internal SPI eventsListener. This SPI is internal and may change without notice
10:10:55,743 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: evento-send-reset-password (br.gov.caixa.keycloak.events.sendresetpassword.EventExternalSendResetPasswordFactory) is implementing the internal SPI eventsListener. This SPI is internal and may change without notice
10:10:55,743 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: evento-send-reset-password-error (br.gov.caixa.keycloak.events.sendresetpassworderror.EventExternalSendResetPasswordErrorFactory) is implementing the internal SPI eventsListener. This SPI is internal and may change without notice
10:10:55,743 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: evento-update-password (br.gov.caixa.keycloak.events.updatepassword.EventExternalUpdatePasswordFactory) is implementing the internal SPI eventsListener. This SPI is internal and may change without notice
10:10:55,743 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: evento-update-password-error (br.gov.caixa.keycloak.events.updatepassworderror.EventExternalUpdatePasswordErrorFactory) is implementing the internal SPI eventsListener. This SPI is internal and may change without notice
10:10:55,760 INFO  [br.gov.caixa.keycloak.authenticators.browser.LoginCaixaFormAuthenticatorFactory] (ServerService Thread Pool -- 67) INIT LoginCaixaFormAuthenticator - v1.0
10:10:55,760 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: auth-conditional-login-caixa (br.gov.caixa.keycloak.authenticators.browser.LoginCaixaFormAuthenticatorFactory) is implementing the internal SPI authenticator. This SPI is internal and may change without notice
10:10:55,761 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: auth-x509-client-username-form-caixa (br.gov.caixa.keycloak.authenticators.x509.X509ClientCertificateCaixaAuthenticatorFactory) is implementing the internal SPI authenticator. This SPI is internal and may change without notice
10:10:55,774 INFO  [br.gov.caixa.authenticator.BrowserPasswordSiperFactory] (ServerService Thread Pool -- 67) Registrando Factory do SiperBrowser Password SIPER
10:10:55,774 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: browser-validate-password-caixa (br.gov.caixa.authenticator.BrowserPasswordSiperFactory) is implementing the internal SPI authenticator. This SPI is internal and may change without notice
10:10:55,785 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: siset-user-session (br.gov.caixa.siset.internet.spi.session.SisetUserSessionProviderFactory) is implementing the internal SPI userSessions. This SPI is internal and may change without notice
10:10:55,787 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: siset-user-session (br.gov.caixa.siset.internet.spi.session.SisetUserSessionPersisterProviderFactory) is implementing the internal SPI userSessionPersister. This SPI is internal and may change without notice
10:10:55,794 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: direct-grant-validate-password-caixa (br.gov.caixa.authenticator.DirectGrantPasswordSiper) is implementing the internal SPI authenticator. This SPI is internal and may change without notice
10:10:55,807 INFO  [br.gov.caixa.keycloak.authenticator.CaixaValidaLoginAuthenticatorFactory] (ServerService Thread Pool -- 67) Registrando Factory do Vincula Login
10:10:55,807 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: valida-login-authenticator (br.gov.caixa.keycloak.authenticator.CaixaValidaLoginAuthenticatorFactory) is implementing the internal SPI authenticator. This SPI is internal and may change without notice
10:10:55,831 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: resource_provider (br.gov.caixa.keycloak.rest.ResourceProviderFactory) is implementing the internal SPI realm-restapi-extension. This SPI is internal and may change without notice
10:10:55,860 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 67) WFLYCLINF0002: Started realmRevisions cache from keycloak container
10:10:55,863 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 67) WFLYCLINF0002: Started userRevisions cache from keycloak container
10:10:55,871 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 67) WFLYCLINF0002: Started authorizationRevisions cache from keycloak container
10:10:55,873 INFO  [org.keycloak.connections.infinispan.DefaultInfinispanConnectionProviderFactory] (ServerService Thread Pool -- 67) Node name: crjtqapllx036, Site name: null
10:10:56,244 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (ServerService Thread Pool -- 67) IJ000604: Throwable while attempting to get a new connection: null: javax.resource.ResourceException: IJ031084: Unable to create connection
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:345)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:352)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
        at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1325)
        at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:499)
        at org.jboss.jca.core.connectionmanager.pool.AbstractPool.getSimpleConnection(AbstractPool.java:632)
        at org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:604)
        at org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
        at org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
        at org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
        at org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:151)
        at org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
        at org.keycloak.connections.jpa.DefaultJpaConnectionProviderFactory.getConnection(DefaultJpaConnectionProviderFactory.java:366)
        at org.keycloak.connections.jpa.updater.liquibase.lock.LiquibaseDBLockProvider.lazyInit(LiquibaseDBLockProvider.java:65)
        at org.keycloak.connections.jpa.updater.liquibase.lock.LiquibaseDBLockProvider.lambda$waitForLock$2(LiquibaseDBLockProvider.java:96)
        at org.keycloak.models.utils.KeycloakModelUtils.suspendJtaTransaction(KeycloakModelUtils.java:682)
        at org.keycloak.connections.jpa.updater.liquibase.lock.LiquibaseDBLockProvider.waitForLock(LiquibaseDBLockProvider.java:94)
        at org.keycloak.services.resources.KeycloakApplication$1.run(KeycloakApplication.java:148)
        at org.keycloak.models.utils.KeycloakModelUtils.runJobInTransaction(KeycloakModelUtils.java:227)
        at org.keycloak.services.resources.KeycloakApplication.<init>(KeycloakApplication.java:141)
        at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
        at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
        at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
        at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
        at org.jboss.resteasy.core.ConstructorInjectorImpl.construct(ConstructorInjectorImpl.java:154)
        at org.jboss.resteasy.spi.ResteasyProviderFactory.createProviderInstance(ResteasyProviderFactory.java:2757)
        at org.jboss.resteasy.spi.ResteasyDeployment.createApplication(ResteasyDeployment.java:363)
        at org.jboss.resteasy.spi.ResteasyDeployment.startInternal(ResteasyDeployment.java:276)
        at org.jboss.resteasy.spi.ResteasyDeployment.start(ResteasyDeployment.java:88)
        at org.jboss.resteasy.plugins.server.servlet.ServletContainerDispatcher.init(ServletContainerDispatcher.java:119)
        at org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.init(HttpServletDispatcher.java:36)
        at io.undertow.servlet.core.LifecyleInterceptorInvocation.proceed(LifecyleInterceptorInvocation.java:117)
        at org.wildfly.extension.undertow.security.RunAsLifecycleInterceptor.init(RunAsLifecycleInterceptor.java:78)
        at io.undertow.servlet.core.LifecyleInterceptorInvocation.proceed(LifecyleInterceptorInvocation.java:103)
        at io.undertow.servlet.core.ManagedServlet$DefaultInstanceStrategy.start(ManagedServlet.java:303)
        at io.undertow.servlet.core.ManagedServlet.createServlet(ManagedServlet.java:143)
        at io.undertow.servlet.core.DeploymentManagerImpl$2.call(DeploymentManagerImpl.java:583)
        at io.undertow.servlet.core.DeploymentManagerImpl$2.call(DeploymentManagerImpl.java:554)
        at io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:42)
        at io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
        at org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1504)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1504)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1504)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1504)
        at io.undertow.servlet.core.DeploymentManagerImpl.start(DeploymentManagerImpl.java:596)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentService.startContext(UndertowDeploymentService.java:97)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentService$1.run(UndertowDeploymentService.java:78)
        at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
        at java.util.concurrent.FutureTask.run(FutureTask.java:266)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1378)
        at java.lang.Thread.run(Thread.java:745)
        at org.jboss.threads.JBossThread.run(JBossThread.java:485)
Caused by: java.sql.SQLException: ORA-01017: invalid username/password; logon denied

        at oracle.jdbc.driver.T4CTTIoer.processError(T4CTTIoer.java:440)
        at oracle.jdbc.driver.T4CTTIoer.processError(T4CTTIoer.java:389)
        at oracle.jdbc.driver.T4CTTIoer.processError(T4CTTIoer.java:382)
        at oracle.jdbc.driver.T4CTTIfun.processError(T4CTTIfun.java:573)
        at oracle.jdbc.driver.T4CTTIoauthenticate.processError(T4CTTIoauthenticate.java:431)
        at oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:445)
        at oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:191)
        at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:366)
        at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:752)
        at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:366)
        at oracle.jdbc.driver.PhysicalConnection.<init>(PhysicalConnection.java:536)
        at oracle.jdbc.driver.T4CConnection.<init>(T4CConnection.java:228)
        at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:32)
        at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:521)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:321)
        ... 55 more

10:10:56,254 INFO  [org.jboss.as.server] (Thread-16) WFLYSRV0220: Server shutdown has been requested via an OS signal
10:10:56,260 ERROR [org.jboss.msc.service.fail] (ServerService Thread Pool -- 67) MSC000001: Failed to start service jboss.deployment.unit."keycloak-server.war".undertow-deployment: org.jboss.msc.service.StartException in service jboss.deployment.unit."keycloak-server.war".undertow-deployment: java.lang.RuntimeException: RESTEASY003325: Failed to construct public org.keycloak.services.resources.KeycloakApplication(javax.servlet.ServletContext,org.jboss.resteasy.core.Dispatcher)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentService$1.run(UndertowDeploymentService.java:81)
        at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
        at java.util.concurrent.FutureTask.run(FutureTask.java:266)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1378)
        at java.lang.Thread.run(Thread.java:745)
        at org.jboss.threads.JBossThread.run(JBossThread.java:485)
Caused by: java.lang.RuntimeException: RESTEASY003325: Failed to construct public org.keycloak.services.resources.KeycloakApplication(javax.servlet.ServletContext,org.jboss.resteasy.core.Dispatcher)
        at org.jboss.resteasy.core.ConstructorInjectorImpl.construct(ConstructorInjectorImpl.java:166)
        at org.jboss.resteasy.spi.ResteasyProviderFactory.createProviderInstance(ResteasyProviderFactory.java:2757)
        at org.jboss.resteasy.spi.ResteasyDeployment.createApplication(ResteasyDeployment.java:363)
        at org.jboss.resteasy.spi.ResteasyDeployment.startInternal(ResteasyDeployment.java:276)
        at org.jboss.resteasy.spi.ResteasyDeployment.start(ResteasyDeployment.java:88)
        at org.jboss.resteasy.plugins.server.servlet.ServletContainerDispatcher.init(ServletContainerDispatcher.java:119)
        at org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.init(HttpServletDispatcher.java:36)
        at io.undertow.servlet.core.LifecyleInterceptorInvocation.proceed(LifecyleInterceptorInvocation.java:117)
        at org.wildfly.extension.undertow.security.RunAsLifecycleInterceptor.init(RunAsLifecycleInterceptor.java:78)
        at io.undertow.servlet.core.LifecyleInterceptorInvocation.proceed(LifecyleInterceptorInvocation.java:103)
        at io.undertow.servlet.core.ManagedServlet$DefaultInstanceStrategy.start(ManagedServlet.java:303)
        at io.undertow.servlet.core.ManagedServlet.createServlet(ManagedServlet.java:143)
        at io.undertow.servlet.core.DeploymentManagerImpl$2.call(DeploymentManagerImpl.java:583)
        at io.undertow.servlet.core.DeploymentManagerImpl$2.call(DeploymentManagerImpl.java:554)
        at io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:42)
        at io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
        at org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1504)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1504)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1504)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1504)
        at io.undertow.servlet.core.DeploymentManagerImpl.start(DeploymentManagerImpl.java:596)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentService.startContext(UndertowDeploymentService.java:97)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentService$1.run(UndertowDeploymentService.java:78)
        ... 8 more
Caused by: java.lang.RuntimeException: Failed to connect to database
        at org.keycloak.connections.jpa.DefaultJpaConnectionProviderFactory.getConnection(DefaultJpaConnectionProviderFactory.java:372)
        at org.keycloak.connections.jpa.updater.liquibase.lock.LiquibaseDBLockProvider.lazyInit(LiquibaseDBLockProvider.java:65)
        at org.keycloak.connections.jpa.updater.liquibase.lock.LiquibaseDBLockProvider.lambda$waitForLock$2(LiquibaseDBLockProvider.java:96)
        at org.keycloak.models.utils.KeycloakModelUtils.suspendJtaTransaction(KeycloakModelUtils.java:682)
        at org.keycloak.connections.jpa.updater.liquibase.lock.LiquibaseDBLockProvider.waitForLock(LiquibaseDBLockProvider.java:94)
        at org.keycloak.services.resources.KeycloakApplication$1.run(KeycloakApplication.java:148)
        at org.keycloak.models.utils.KeycloakModelUtils.runJobInTransaction(KeycloakModelUtils.java:227)
        at org.keycloak.services.resources.KeycloakApplication.<init>(KeycloakApplication.java:141)
        at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
        at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
        at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
        at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
        at org.jboss.resteasy.core.ConstructorInjectorImpl.construct(ConstructorInjectorImpl.java:154)
        ... 31 more
Caused by: java.sql.SQLException: javax.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/datasources/KeycloakDS
        at org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:159)
        at org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
        at org.keycloak.connections.jpa.DefaultJpaConnectionProviderFactory.getConnection(DefaultJpaConnectionProviderFactory.java:366)
        ... 43 more
Caused by: javax.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/datasources/KeycloakDS
        at org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:690)
        at org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
        at org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
        at org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:151)
        ... 45 more
Caused by: javax.resource.ResourceException: IJ031084: Unable to create connection
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:345)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:352)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
        at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1325)
        at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:499)
        at org.jboss.jca.core.connectionmanager.pool.AbstractPool.getSimpleConnection(AbstractPool.java:632)
        at org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:604)
        at org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
        ... 48 more
Caused by: java.sql.SQLException: ORA-01017: invalid username/password; logon denied

        at oracle.jdbc.driver.T4CTTIoer.processError(T4CTTIoer.java:440)
        at oracle.jdbc.driver.T4CTTIoer.processError(T4CTTIoer.java:389)
        at oracle.jdbc.driver.T4CTTIoer.processError(T4CTTIoer.java:382)
        at oracle.jdbc.driver.T4CTTIfun.processError(T4CTTIfun.java:573)
        at oracle.jdbc.driver.T4CTTIoauthenticate.processError(T4CTTIoauthenticate.java:431)
        at oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:445)
        at oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:191)
        at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:366)
        at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:752)
        at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:366)
        at oracle.jdbc.driver.PhysicalConnection.<init>(PhysicalConnection.java:536)
        at oracle.jdbc.driver.T4CConnection.<init>(T4CConnection.java:228)
        at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:32)
        at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:521)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:321)
        ... 55 more

10:10:56,300 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-7) WFLYUT0008: Undertow HTTPS listener https suspending
10:10:56,301 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-7) WFLYUT0007: Undertow HTTPS listener https stopped, was bound to 10.116.26.227:8443
10:10:56,301 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-4) WFLYMAIL0002: Unbound mail session [java:jboss/mail/Default]
10:10:56,304 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-8) WFLYUT0019: Host default-host stopping
10:10:56,313 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-5) WFLYJCA0010: Unbound data source [java:jboss/datasources/ExampleDS]
10:10:56,323 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-1) Undeploying Keycloak provider: OTPCaixaCond.jar
10:10:56,323 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-2) Undeploying Keycloak provider: siset-user-session-provider.jar
10:10:56,323 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-3) Undeploying Keycloak provider: resource-provider-jar-with-dependencies.jar
10:10:56,324 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-5) Undeploying Keycloak provider: BrowserPassword-jar-with-dependencies.jar
10:10:56,324 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-7) Undeploying Keycloak provider: eventExternal-jar-with-dependencies.jar
10:10:56,325 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-4) Undeploying Keycloak provider: directgrantpassword-jar-with-dependencies.jar
10:10:56,325 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-8) Undeploying Keycloak provider: validaLogin-jar-with-dependencies.jar
10:10:56,328 ERROR [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0043: Deployment unit processor org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor@167a0efe unexpectedly threw an exception during undeploy phase POST_MODULE of deployment "eventExternal-jar-with-dependencies.jar": java.lang.NullPointerException
        at org.keycloak.services.managers.DefaultBruteForceProtectorFactory.close(DefaultBruteForceProtectorFactory.java:50)
        at org.keycloak.services.DefaultKeycloakSessionFactory.undeploy(DefaultKeycloakSessionFactory.java:161)
        at org.keycloak.provider.ProviderManagerRegistry.undeploy(ProviderManagerRegistry.java:51)
        at org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor.undeploy(KeycloakProviderDeploymentProcessor.java:69)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.safeUndeploy(DeploymentUnitPhaseService.java:211)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.stop(DeploymentUnitPhaseService.java:204)
        at org.jboss.msc.service.ServiceControllerImpl$StopTask.stopService(ServiceControllerImpl.java:1794)
        at org.jboss.msc.service.ServiceControllerImpl$StopTask.execute(ServiceControllerImpl.java:1763)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:56,328 ERROR [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0043: Deployment unit processor org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor@167a0efe unexpectedly threw an exception during undeploy phase POST_MODULE of deployment "BrowserPassword-jar-with-dependencies.jar": java.lang.NullPointerException
        at org.keycloak.services.managers.DefaultBruteForceProtectorFactory.close(DefaultBruteForceProtectorFactory.java:50)
        at org.keycloak.services.DefaultKeycloakSessionFactory.undeploy(DefaultKeycloakSessionFactory.java:161)
        at org.keycloak.provider.ProviderManagerRegistry.undeploy(ProviderManagerRegistry.java:51)
        at org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor.undeploy(KeycloakProviderDeploymentProcessor.java:69)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.safeUndeploy(DeploymentUnitPhaseService.java:211)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.stop(DeploymentUnitPhaseService.java:204)
        at org.jboss.msc.service.ServiceControllerImpl$StopTask.stopService(ServiceControllerImpl.java:1794)
        at org.jboss.msc.service.ServiceControllerImpl$StopTask.execute(ServiceControllerImpl.java:1763)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:56,330 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-5) WFLYJCA0019: Stopped Driver service with driver-name = h2
10:10:56,330 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-1) Undeploying Keycloak provider: loginCaixa-jar-with-dependencies.jar
10:10:56,331 ERROR [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0043: Deployment unit processor org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor@167a0efe unexpectedly threw an exception during undeploy phase POST_MODULE of deployment "directgrantpassword-jar-with-dependencies.jar": java.lang.NullPointerException
        at org.keycloak.services.managers.DefaultBruteForceProtectorFactory.close(DefaultBruteForceProtectorFactory.java:50)
        at org.keycloak.services.DefaultKeycloakSessionFactory.undeploy(DefaultKeycloakSessionFactory.java:161)
        at org.keycloak.provider.ProviderManagerRegistry.undeploy(ProviderManagerRegistry.java:51)
        at org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor.undeploy(KeycloakProviderDeploymentProcessor.java:69)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.safeUndeploy(DeploymentUnitPhaseService.java:211)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.stop(DeploymentUnitPhaseService.java:204)
        at org.jboss.msc.service.ServiceControllerImpl$StopTask.stopService(ServiceControllerImpl.java:1794)
        at org.jboss.msc.service.ServiceControllerImpl$StopTask.execute(ServiceControllerImpl.java:1763)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:56,331 ERROR [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0043: Deployment unit processor org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor@167a0efe unexpectedly threw an exception during undeploy phase POST_MODULE of deployment "validaLogin-jar-with-dependencies.jar": java.lang.NullPointerException
        at org.keycloak.services.managers.DefaultBruteForceProtectorFactory.close(DefaultBruteForceProtectorFactory.java:50)
        at org.keycloak.services.DefaultKeycloakSessionFactory.undeploy(DefaultKeycloakSessionFactory.java:161)
        at org.keycloak.provider.ProviderManagerRegistry.undeploy(ProviderManagerRegistry.java:51)
        at org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor.undeploy(KeycloakProviderDeploymentProcessor.java:69)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.safeUndeploy(DeploymentUnitPhaseService.java:211)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.stop(DeploymentUnitPhaseService.java:204)
        at org.jboss.msc.service.ServiceControllerImpl$StopTask.stopService(ServiceControllerImpl.java:1794)
        at org.jboss.msc.service.ServiceControllerImpl$StopTask.execute(ServiceControllerImpl.java:1763)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:56,336 ERROR [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0043: Deployment unit processor org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor@167a0efe unexpectedly threw an exception during undeploy phase POST_MODULE of deployment "loginCaixa-jar-with-dependencies.jar": java.lang.NullPointerException
        at org.keycloak.services.managers.DefaultBruteForceProtectorFactory.close(DefaultBruteForceProtectorFactory.java:50)
        at org.keycloak.services.DefaultKeycloakSessionFactory.undeploy(DefaultKeycloakSessionFactory.java:161)
        at org.keycloak.provider.ProviderManagerRegistry.undeploy(ProviderManagerRegistry.java:51)
        at org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor.undeploy(KeycloakProviderDeploymentProcessor.java:69)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.safeUndeploy(DeploymentUnitPhaseService.java:211)
        at org.jboss.as.server.deployment.DeploymentUnitPhaseService.stop(DeploymentUnitPhaseService.java:204)
        at org.jboss.msc.service.ServiceControllerImpl$StopTask.stopService(ServiceControllerImpl.java:1794)
        at org.jboss.msc.service.ServiceControllerImpl$StopTask.execute(ServiceControllerImpl.java:1763)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1364)
        at java.lang.Thread.run(Thread.java:745)

10:10:56,347 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 59) WFLYCLINF0003: Stopped work cache from keycloak container
10:10:56,347 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 56) WFLYCLINF0003: Stopped clientSessions cache from keycloak container
10:10:56,348 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 57) WFLYCLINF0003: Stopped offlineSessions cache from keycloak container
10:10:56,348 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 61) WFLYCLINF0003: Stopped offlineClientSessions cache from keycloak container
10:10:56,348 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 63) WFLYCLINF0003: Stopped loginFailures cache from keycloak container
10:10:56,349 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 58) WFLYCLINF0003: Stopped authenticationSessions cache from keycloak container
10:10:56,348 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 62) WFLYCLINF0003: Stopped actionTokens cache from keycloak container
10:10:56,350 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 60) WFLYCLINF0003: Stopped users cache from keycloak container
10:10:56,350 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 66) WFLYCLINF0003: Stopped realms cache from keycloak container
10:10:56,350 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0028: Stopped deployment keycloak-server.war (runtime-name: keycloak-server.war) in 80ms
10:10:56,351 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0028: Stopped deployment directgrantpassword-jar-with-dependencies.jar (runtime-name: directgrantpassword-jar-with-dependencies.jar) in 81ms
10:10:56,351 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 55) WFLYCLINF0003: Stopped authorization cache from keycloak container
10:10:56,351 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 64) WFLYCLINF0003: Stopped sessions cache from keycloak container
10:10:56,351 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0028: Stopped deployment OTPCaixaCond.jar (runtime-name: OTPCaixaCond.jar) in 82ms
10:10:56,351 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 69) WFLYCLINF0003: Stopped keys cache from keycloak container
10:10:56,353 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0028: Stopped deployment siset-user-session-provider.jar (runtime-name: siset-user-session-provider.jar) in 84ms
10:10:56,354 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0028: Stopped deployment BrowserPassword-jar-with-dependencies.jar (runtime-name: BrowserPassword-jar-with-dependencies.jar) in 79ms
10:10:56,357 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0028: Stopped deployment loginCaixa-jar-with-dependencies.jar (runtime-name: loginCaixa-jar-with-dependencies.jar) in 90ms
10:10:56,357 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0028: Stopped deployment eventExternal-jar-with-dependencies.jar (runtime-name: eventExternal-jar-with-dependencies.jar) in 89ms
10:10:56,365 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-3) Undeploying Keycloak provider: user-storage-jpa-siper-jar-with-dependencies.jar
10:10:56,365 INFO  [org.jboss.as.clustering.infinispan] (MSC service thread 1-7) WFLYCLINF0003: Stopped authorizationRevisions cache from keycloak container
10:10:56,365 INFO  [br.gov.caixa.keycloak.SiperUserStorageProviderFactory] (MSC service thread 1-3) <<<<<< Fechando SIPER factory
10:10:56,368 INFO  [org.jboss.as.clustering.infinispan] (MSC service thread 1-7) WFLYCLINF0003: Stopped realmRevisions cache from keycloak container
10:10:56,370 INFO  [org.jboss.as.clustering.infinispan] (MSC service thread 1-7) WFLYCLINF0003: Stopped userRevisions cache from keycloak container
10:10:56,372 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0008: Undertow HTTP listener default suspending
10:10:56,372 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0028: Stopped deployment validaLogin-jar-with-dependencies.jar (runtime-name: validaLogin-jar-with-dependencies.jar) in 101ms
10:10:56,373 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0007: Undertow HTTP listener default stopped, was bound to 10.116.26.227:8080
10:10:56,377 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0004: Undertow 2.0.22.Final-redhat-00001 stopping
10:10:56,378 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0028: Stopped deployment resource-provider-jar-with-dependencies.jar (runtime-name: resource-provider-jar-with-dependencies.jar) in 106ms
10:10:56,381 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 67) WFLYCLINF0003: Stopped client-mappings cache from ejb container
10:10:56,463 INFO  [org.hibernate.hql.internal.QueryTranslatorFactoryInitiator] (ServerService Thread Pool -- 68) HHH000397: Using ASTQueryTranslatorFactory
10:10:56,614 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 68) WFLYJPA0011: Stopping Persistence Unit (phase 2 of 2) Service 'servico.war#servico-dispositivo'
10:10:56,615 INFO  [org.hibernate.orm.beans] (ServerService Thread Pool -- 68) HHH10005004: Stopping BeanContainer : org.hibernate.resource.beans.container.internal.CdiBeanContainerExtendedAccessImpl@3034aee4
10:10:56,616 INFO  [org.hibernate.service.internal.AbstractServiceRegistryImpl] (ServerService Thread Pool -- 68) HHH000369: Error stopping service [class org.hibernate.resource.beans.internal.ManagedBeanRegistryImpl] : java.lang.NullPointerException
10:10:56,624 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 68) WFLYJPA0011: Stopping Persistence Unit (phase 1 of 2) Service 'servico.war#servico-dispositivo'
10:10:56,625 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-7) WFLYJCA0010: Unbound data source [java:jboss/datasources/oraset]
10:10:56,656 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0028: Stopped deployment servico.war (runtime-name: servico.war) in 390ms
10:10:57,028 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 65) WFLYJPA0011: Stopping Persistence Unit (phase 1 of 2) Service 'user-storage-jpa-siper-jar-with-dependencies.jar#user-storage-jpa-siper'
10:10:57,030 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-5) WFLYJCA0010: Unbound data source [java:jboss/datasources/KeycloakDS]
10:10:57,030 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-7) WFLYJCA0019: Stopped Driver service with driver-name = oracle
10:10:57,034 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0028: Stopped deployment user-storage-jpa-siper-jar-with-dependencies.jar (runtime-name: user-storage-jpa-siper-jar-with-dependencies.jar) in 765ms
10:10:57,039 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "resource-provider-jar-with-dependencies.jar" was rolled back with no failure message
10:10:57,040 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "siset-user-session-provider.jar" was rolled back with no failure message
10:10:57,040 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "validaLogin-jar-with-dependencies.jar" was rolled back with no failure message
10:10:57,040 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "user-storage-jpa-siper-jar-with-dependencies.jar" was rolled back with no failure message
10:10:57,040 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "servico.war" was rolled back with no failure message
10:10:57,040 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "loginCaixa-jar-with-dependencies.jar" was rolled back with no failure message
10:10:57,040 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "BrowserPassword-jar-with-dependencies.jar" was rolled back with no failure message
10:10:57,040 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "eventExternal-jar-with-dependencies.jar" was rolled back with no failure message
10:10:57,040 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "directgrantpassword-jar-with-dependencies.jar" was rolled back with no failure message
10:10:57,040 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "OTPCaixaCond.jar" was rolled back with no failure message
10:10:57,041 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0022: Deploy of deployment "keycloak-server.war" was rolled back with no failure message
10:10:57,046 INFO  [org.jboss.as] (MSC service thread 1-7) WFLYSRV0050: Red Hat Single Sign-On 7.3.3.GA (WildFly Core 6.0.15.Final-redhat-00001) stopped in 771ms

