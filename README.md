[p585600@crjtqapllx036 ~]$ ps -ef | grep jboss
p585600  126836 121194  0 11:00 pts/1    00:00:00 grep --color=auto jboss
[p585600@crjtqapllx036 ~]$ sudo su
[root@crjtqapllx036 p585600]# su - spssodr1
Last login: Sat Sep 12 01:53:00 -03 2026 on pts/1
[spssodr1@crjtqapllx036 ~]$ cd /opt/open/sso/7.3.0/bin
[spssodr1@crjtqapllx036 bin]$ nohup ./standalone.sh -c standalone.xml > /tmp/jboss_start3.log 2>&1 &
[1] 127323
[spssodr1@crjtqapllx036 bin]$ tail -f /tmp/jboss_start3.log
  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/open/sso/7.3.0

  JAVA: /opt/open/java/jdk1.8.0_121/bin/java

  JAVA_OPTS:  -server -verbose:gc -Xloggc:/opt/open/sso/7.3.0/standalone/log/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms32768m -Xmx32768m -XX:MetaspaceSize=1024m -XX:MaxMetaspaceSize=1024m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -DhttpRecaptchaProxyHost="proxydes.caixa" -DhttpRecaptchaProxyPort="80" -DhttpRecaptchaProxyScheme=http -Dhttps.proxyHost="proxydes.caixa" -Dhttps.proxyPort="80" -Dhttp.nonProxyHosts="*.caixa|*.caixa.gov.br|localhost" -Dhttp.proxyHost="proxydes.caixa" -Dhttp.proxyPort="80" -Dftp.proxyHost="proxydes.caixa" -Dftp.proxyPort="80" -javaagent:/infra_app/config/appinsights/applicationinsights-agent-3.3.1.jar

=========================================================================

Failed to invoke setter setFileName with value /infra_app/logs/siset/server-siset_crjdeapllx003_inter_8080.log
.java.lang.reflect.InvocationTargetException
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at org.jboss.logmanager.config.AbstractPropertyConfiguration$1.applyPostCreate(AbstractPropertyConfiguration.java:217)
        at org.jboss.logmanager.config.AbstractPropertyConfiguration$1.applyPostCreate(AbstractPropertyConfiguration.java:197)
        at org.jboss.logmanager.config.LogContextConfigurationImpl.doApplyPostCreate(LogContextConfigurationImpl.java:313)
        at org.jboss.logmanager.config.LogContextConfigurationImpl.doPrepare(LogContextConfigurationImpl.java:345)
        at org.jboss.logmanager.config.LogContextConfigurationImpl.prepare(LogContextConfigurationImpl.java:289)
        at org.jboss.logmanager.config.LogContextConfigurationImpl.commit(LogContextConfigurationImpl.java:298)
        at org.jboss.logmanager.PropertyConfigurator.configure(PropertyConfigurator.java:546)
        at org.jboss.logmanager.PropertyConfigurator.configure(PropertyConfigurator.java:97)
        at org.jboss.logmanager.LogManager.readConfiguration(LogManager.java:170)
        at org.jboss.logmanager.LogManager.readConfiguration(LogManager.java:132)
        at java.util.logging.LogManager$3.run(LogManager.java:399)
        at java.util.logging.LogManager$3.run(LogManager.java:396)
        at java.security.AccessController.doPrivileged(Native Method)
        at java.util.logging.LogManager.readPrimordialConfiguration(LogManager.java:396)
        at java.util.logging.LogManager.access$800(LogManager.java:145)
        at java.util.logging.LogManager$2.run(LogManager.java:345)
        at java.security.AccessController.doPrivileged(Native Method)
        at java.util.logging.LogManager.ensureLogManagerInitialized(LogManager.java:338)
        at java.util.logging.LogManager.getLogManager(LogManager.java:378)
        at org.jboss.modules.Main.main(Main.java:523)
Caused by: java.io.FileNotFoundException: /infra_app/logs/siset/server-siset_crjdeapllx003_inter_8080.log (Permission denied)
        at java.io.FileOutputStream.open0(Native Method)
        at java.io.FileOutputStream.open(FileOutputStream.java:270)
        at java.io.FileOutputStream.<init>(FileOutputStream.java:213)
        at org.jboss.logmanager.handlers.FileHandler.setFile(FileHandler.java:151)
        at org.jboss.logmanager.handlers.PeriodicRotatingFileHandler.setFile(PeriodicRotatingFileHandler.java:104)
        at org.jboss.logmanager.handlers.FileHandler.setFileName(FileHandler.java:189)
        ... 24 more
11:02:02,317 INFO  [org.jboss.modules] (main) JBoss Modules version 1.8.8.Final-redhat-00001
11:02:02,546 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.5.Final-redhat-00001
11:02:02,570 INFO  [org.jboss.threads] (main) JBoss Threads version 2.3.2.Final-redhat-1
11:02:02,734 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: Red Hat Single Sign-On 7.3.3.GA (WildFly Core 6.0.15.Final-redhat-00001) starting
11:02:03,137 WARN  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0456: System property http.nonProxyHosts=*.caixa|*.caixa.gov.br|localhost already set. It's being overridden by new value *.caixa|*.caixa.gov.br|localhost|fnlogeventos-des.azurewebsites.net
11:02:03,455 INFO  [org.wildfly.security] (ServerService Thread Pool -- 21) ELY00001: WildFly Elytron version 1.6.3.Final-redhat-00001
11:02:03,857 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=native-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
11:02:03,859 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
11:02:03,884 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 26) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
11:02:03,908 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: Re-attempting failed deployment OTPCaixaCond.jar
11:02:03,910 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: Re-attempting failed deployment directgrantpassword-jar-with-dependencies.jar
11:02:03,910 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: Re-attempting failed deployment eventExternal-jar-with-dependencies.jar
11:02:03,911 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: Re-attempting failed deployment BrowserPassword-jar-with-dependencies.jar
11:02:03,911 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: Re-attempting failed deployment loginCaixa-jar-with-dependencies.jar
11:02:03,911 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: Re-attempting failed deployment servico.war
11:02:03,911 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: Re-attempting failed deployment user-storage-jpa-siper-jar-with-dependencies.jar
11:02:03,912 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: Re-attempting failed deployment validaLogin-jar-with-dependencies.jar
11:02:03,912 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: Re-attempting failed deployment siset-user-session-provider.jar
11:02:03,912 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: Re-attempting failed deployment resource-provider-jar-with-dependencies.jar
11:02:04,810 INFO  [org.jboss.security] (Controller Boot Thread) PBOX00361: Default Security Vault Implementation Initialized and Ready
11:02:04,826 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
11:02:04,830 INFO  [org.xnio] (MSC service thread 1-8) XNIO version 3.6.6.Final-redhat-00001
11:02:04,837 INFO  [org.xnio.nio] (MSC service thread 1-8) XNIO NIO Implementation Version 3.6.6.Final-redhat-00001
11:02:04,881 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 36) WFLYCLINF0001: Activating Infinispan subsystem.
11:02:04,887 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 45) WFLYNAM0001: Activating Naming Subsystem
11:02:04,892 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 37) WFLYIO001: Worker 'default' has auto-configured to 32 core threads with 256 task threads based on your 16 available processors
11:02:04,889 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 51) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
11:02:04,897 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 49) WFLYSEC0002: Activating Security Subsystem
11:02:04,898 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-6) WFLYMAIL0002: Unbound mail session [java:jboss/mail/Default]
11:02:04,912 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 38) WFLYRS0016: RESTEasy version 3.6.1.SP6-redhat-00001
11:02:04,927 INFO  [org.jboss.as.security] (MSC service thread 1-7) WFLYSEC0001: Current PicketBox version=5.0.3.Final-redhat-3
11:02:04,928 INFO  [org.jboss.as.connector] (MSC service thread 1-4) WFLYJCA0009: Starting JCA Subsystem (WildFly/IronJacamar 1.4.16.Final-redhat-00001)
11:02:04,962 INFO  [org.jboss.remoting] (MSC service thread 1-5) JBoss Remoting version 5.0.12.Final-redhat-00001
11:02:04,969 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0003: Undertow 2.0.22.Final-redhat-00001 starting
11:02:04,980 INFO  [org.jboss.as.naming] (MSC service thread 1-4) WFLYNAM0003: Starting Naming Service
11:02:04,981 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-4) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
11:02:05,131 INFO  [org.jboss.as.ejb3] (MSC service thread 1-6) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 64 (per class), which is derived from the number of CPUs on this host.
11:02:05,131 INFO  [org.jboss.as.ejb3] (MSC service thread 1-8) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 256 (per class), which is derived from thread worker pool sizing.
11:02:05,165 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 52) WFLYUT0014: Creating file handler for path '/opt/open/sso/7.3.0/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
11:02:05,196 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 52) WFLYUT0014: Creating file handler for path '/opt/open/sso/7.3.0/suporte' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
11:02:05,199 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 31) WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.driver.OracleDriver (version 11.2)
11:02:05,203 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-7) WFLYJCA0018: Started Driver service with driver-name = oracle
11:02:05,207 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0012: Started server default-server.
11:02:05,209 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0018: Host default-host starting
11:02:05,226 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 31) WFLYJCA0004: Deploying JDBC-compliant driver class org.h2.Driver (version 1.4)
11:02:05,227 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-7) WFLYJCA0018: Started Driver service with driver-name = h2
11:02:05,268 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-4) WFLYJCA0010: Unbound data source [java:jboss/datasources/ExampleDS]
11:02:05,270 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-8) WFLYJCA0010: Unbound data source [java:jboss/datasources/oraset]
11:02:05,278 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0006: Undertow HTTP listener default listening on 10.116.26.227:8080
11:02:05,281 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-8) WFLYJCA0010: Unbound data source [java:jboss/datasources/KeycloakDS]
11:02:05,289 INFO  [org.jboss.as.ejb3] (MSC service thread 1-8) WFLYEJB0493: EJB subsystem suspension complete
11:02:05,333 INFO  [org.jboss.as.patching] (MSC service thread 1-6) WFLYPAT0050: Red Hat Single Sign-On cumulative patch ID is: rh-sso-7.3.3.CP, one-off patches include: none
11:02:05,347 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-5) WFLYDM0111: Keystore /opt/open/sso/7.3.0/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self signed certificate for host localhost
Failed to invoke setter setFileName with value /infra_app/logs/siset/server-crjtqapllx036.log
.java.lang.reflect.InvocationTargetException
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at org.jboss.logmanager.config.AbstractPropertyConfiguration$1.applyPostCreate(AbstractPropertyConfiguration.java:217)
        at org.jboss.logmanager.config.AbstractPropertyConfiguration$1.applyPostCreate(AbstractPropertyConfiguration.java:197)
        at org.jboss.logmanager.config.LogContextConfigurationImpl.doApplyPostCreate(LogContextConfigurationImpl.java:313)
        at org.jboss.logmanager.config.LogContextConfigurationImpl.doPrepare(LogContextConfigurationImpl.java:345)
        at org.jboss.logmanager.config.LogContextConfigurationImpl.prepare(LogContextConfigurationImpl.java:289)
        at org.jboss.as.logging.logmanager.ConfigurationPersistence.prepare(ConfigurationPersistence.java:299)
        at org.jboss.as.logging.LoggingOperations$CommitOperationStepHandler.execute(LoggingOperations.java:106)
        at org.jboss.as.controller.AbstractOperationContext.executeStep(AbstractOperationContext.java:999)
        at org.jboss.as.controller.AbstractOperationContext.processStages(AbstractOperationContext.java:743)
        at org.jboss.as.controller.AbstractOperationContext.executeOperation(AbstractOperationContext.java:467)
        at org.jboss.as.controller.OperationContextImpl.executeOperation(OperationContextImpl.java:1411)
        at org.jboss.as.controller.ModelControllerImpl.boot(ModelControllerImpl.java:521)
        at org.jboss.as.controller.AbstractControllerService.boot(AbstractControllerService.java:470)
        at org.jboss.as.controller.AbstractControllerService.boot(AbstractControllerService.java:432)
        at org.jboss.as.server.ServerService.boot(ServerService.java:427)
        at org.jboss.as.server.ServerService.boot(ServerService.java:386)
        at org.jboss.as.controller.AbstractControllerService$1.run(AbstractControllerService.java:372)
        at java.lang.Thread.run(Thread.java:745)
Caused by: java.io.FileNotFoundException: /infra_app/logs/siset/server-crjtqapllx036.log (Permission denied)
        at java.io.FileOutputStream.open0(Native Method)
        at java.io.FileOutputStream.open(FileOutputStream.java:270)
        at java.io.FileOutputStream.<init>(FileOutputStream.java:213)
        at org.jboss.logmanager.handlers.FileHandler.setFile(FileHandler.java:151)
        at org.jboss.logmanager.handlers.PeriodicRotatingFileHandler.setFile(PeriodicRotatingFileHandler.java:104)
        at org.jboss.logmanager.handlers.FileHandler.setFileName(FileHandler.java:189)
        ... 22 more
11:02:05,359 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-8) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/open/sso/7.3.0/standalone/deployments
11:02:05,368 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0027: Starting deployment of "OTPCaixaCond.jar" (runtime-name: "OTPCaixaCond.jar")
11:02:05,368 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0027: Starting deployment of "loginCaixa-jar-with-dependencies.jar" (runtime-name: "loginCaixa-jar-with-dependencies.jar")
11:02:05,368 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Starting deployment of "BrowserPassword-jar-with-dependencies.jar" (runtime-name: "BrowserPassword-jar-with-dependencies.jar")
11:02:05,368 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0027: Starting deployment of "user-storage-jpa-siper-jar-with-dependencies.jar" (runtime-name: "user-storage-jpa-siper-jar-with-dependencies.jar")
11:02:05,370 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0027: Starting deployment of "directgrantpassword-jar-with-dependencies.jar" (runtime-name: "directgrantpassword-jar-with-dependencies.jar")
11:02:05,370 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0027: Starting deployment of "siset-user-session-provider.jar" (runtime-name: "siset-user-session-provider.jar")
11:02:05,370 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0027: Starting deployment of "eventExternal-jar-with-dependencies.jar" (runtime-name: "eventExternal-jar-with-dependencies.jar")
11:02:05,370 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0027: Starting deployment of "resource-provider-jar-with-dependencies.jar" (runtime-name: "resource-provider-jar-with-dependencies.jar")
11:02:05,370 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Starting deployment of "servico.war" (runtime-name: "servico.war")
11:02:05,370 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0027: Starting deployment of "validaLogin-jar-with-dependencies.jar" (runtime-name: "validaLogin-jar-with-dependencies.jar")
11:02:05,371 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0027: Starting deployment of "keycloak-server.war" (runtime-name: "keycloak-server.war")
11:02:05,384 INFO  [org.jboss.as.remoting] (MSC service thread 1-2) WFLYRMT0001: Listening on 10.116.26.227:9999
11:02:05,928 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (JCA PoolFiller) IJ000610: Unable to fill pool: java:jboss/datasources/KeycloakDS: javax.resource.ResourceException: IJ031084: Unable to create connection
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

11:02:06,695 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class org/apache/log4j/spi/TriggeringEventEvaluator.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,695 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class org/apache/log4j/spi/LoggingEvent.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,696 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class org/apache/log4j/spi/RootCategory.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,696 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class org/apache/log4j/spi/ThrowableRendererSupport.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,696 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class org/apache/log4j/spi/RendererSupport.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,696 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class org/apache/log4j/spi/NullWriter.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,697 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class org/apache/log4j/spi/RepositorySelector.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,697 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class org/apache/log4j/spi/NOPLoggerRepository.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,697 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class org/apache/log4j/spi/NOPLogger.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,698 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class org/apache/log4j/spi/ThrowableRenderer.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,698 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class org/apache/log4j/spi/VectorWriter.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,699 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class org/apache/log4j/spi/OptionHandler.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,699 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class org/apache/log4j/spi/RootLogger.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,699 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class org/apache/log4j/spi/ThrowableInformation.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,702 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class org/apache/log4j/varia/LevelMatchFilter.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,702 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class org/apache/log4j/varia/HUPNode.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,702 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class org/apache/log4j/varia/HUP.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,704 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class org/apache/log4j/varia/LevelRangeFilter.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,704 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class org/apache/log4j/varia/Roller.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,704 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class org/apache/log4j/varia/NullAppender.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,705 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class org/apache/log4j/varia/DenyAllFilter.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,706 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class org/apache/log4j/varia/FallbackErrorHandler.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,706 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class org/apache/log4j/varia/ReloadingPropertyConfigurator.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,706 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0003: Could not index class org/apache/log4j/varia/ExternallyRolledFileAppender.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,735 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0006: Undertow HTTPS listener https listening on 10.116.26.227:8443
11:02:06,742 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-4) WFLYJCA0001: Bound data source [java:jboss/datasources/oraset]
11:02:06,742 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-4) WFLYJCA0001: Bound data source [java:jboss/datasources/ExampleDS]
11:02:06,742 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-4) WFLYJCA0001: Bound data source [java:jboss/datasources/KeycloakDS]
11:02:06,758 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0003: Could not index class org/apache/log4j/spi/TriggeringEventEvaluator.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,759 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0003: Could not index class org/apache/log4j/spi/LoggingEvent.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,759 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0003: Could not index class org/apache/log4j/spi/RootCategory.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,759 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0003: Could not index class org/apache/log4j/spi/ThrowableRendererSupport.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,759 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0003: Could not index class org/apache/log4j/spi/RendererSupport.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,760 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0003: Could not index class org/apache/log4j/spi/NullWriter.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,760 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0003: Could not index class org/apache/log4j/spi/RepositorySelector.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,760 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0003: Could not index class org/apache/log4j/spi/NOPLoggerRepository.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,760 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0003: Could not index class org/apache/log4j/spi/NOPLogger.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,761 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0003: Could not index class org/apache/log4j/spi/ThrowableRenderer.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,761 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0003: Could not index class org/apache/log4j/spi/VectorWriter.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,761 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0003: Could not index class org/apache/log4j/spi/OptionHandler.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,761 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0003: Could not index class org/apache/log4j/spi/RootLogger.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,762 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0003: Could not index class org/apache/log4j/spi/ThrowableInformation.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,766 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0003: Could not index class org/apache/log4j/varia/LevelMatchFilter.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,767 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0003: Could not index class org/apache/log4j/varia/HUPNode.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,768 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0003: Could not index class org/apache/log4j/varia/HUP.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,768 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0003: Could not index class org/apache/log4j/varia/LevelRangeFilter.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,768 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0003: Could not index class org/apache/log4j/varia/Roller.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,768 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0003: Could not index class org/apache/log4j/varia/NullAppender.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,768 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0003: Could not index class org/apache/log4j/varia/DenyAllFilter.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,769 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0003: Could not index class org/apache/log4j/varia/FallbackErrorHandler.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,769 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0003: Could not index class org/apache/log4j/varia/ReloadingPropertyConfigurator.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:06,769 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0003: Could not index class org/apache/log4j/varia/ExternallyRolledFileAppender.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

11:02:07,230 INFO  [org.jboss.as.jpa] (MSC service thread 1-4) WFLYJPA0002: Read persistence.xml for user-storage-jpa-siper
11:02:07,264 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-6) WFLYSRV0018: Deployment "deployment.OTPCaixaCond.jar" is using a private module ("org.keycloak.keycloak-services") which may be changed or removed in future versions without notice.
11:02:07,267 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-8) WFLYSRV0018: Deployment "deployment.siset-user-session-provider.jar" is using a private module ("org.keycloak.keycloak-server-spi-private") which may be changed or removed in future versions without notice.
11:02:07,268 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-8) WFLYSRV0018: Deployment "deployment.siset-user-session-provider.jar" is using a private module ("org.keycloak.keycloak-services") which may be changed or removed in future versions without notice.
11:02:07,269 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-8) WFLYSRV0018: Deployment "deployment.siset-user-session-provider.jar" is using a private module ("org.keycloak.keycloak-model-infinispan") which may be changed or removed in future versions without notice.
11:02:07,272 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-8) WFLYSRV0018: Deployment "deployment.siset-user-session-provider.jar" is using a private module ("org.keycloak.keycloak-model-jpa") which may be changed or removed in future versions without notice.
11:02:07,273 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-8) WFLYSRV0018: Deployment "deployment.siset-user-session-provider.jar" is using a private module ("org.infinispan") which may be changed or removed in future versions without notice.
11:02:07,273 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-8) WFLYSRV0018: Deployment "deployment.siset-user-session-provider.jar" is using a private module ("org.infinispan.commons") which may be changed or removed in future versions without notice.
11:02:07,273 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-4) WFLYSRV0018: Deployment "deployment.eventExternal-jar-with-dependencies.jar" is using a private module ("org.keycloak.keycloak-services") which may be changed or removed in future versions without notice.
11:02:07,283 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-6) WFLYSRV0018: Deployment "deployment.BrowserPassword-jar-with-dependencies.jar" is using a private module ("org.keycloak.keycloak-services") which may be changed or removed in future versions without notice.
11:02:07,283 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-8) Deploying Keycloak provider: OTPCaixaCond.jar
11:02:07,284 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-6) Deploying Keycloak provider: siset-user-session-provider.jar
11:02:07,283 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-4) Deploying Keycloak provider: eventExternal-jar-with-dependencies.jar
11:02:07,316 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-3) Deploying Keycloak provider: BrowserPassword-jar-with-dependencies.jar
11:02:07,338 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-5) WFLYSRV0018: Deployment "deployment.directgrantpassword-jar-with-dependencies.jar" is using a private module ("org.keycloak.keycloak-services") which may be changed or removed in future versions without notice.
11:02:07,359 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-6) Deploying Keycloak provider: directgrantpassword-jar-with-dependencies.jar
11:02:07,375 WARN  [org.jboss.weld.deployer] (MSC service thread 1-4) WFLYWELD0013: Deployment eventExternal-jar-with-dependencies.jar contains CDI annotations but no bean archive was found (no beans.xml or class with bean defining annotations was present).
11:02:07,376 WARN  [org.jboss.weld.deployer] (MSC service thread 1-7) WFLYWELD0013: Deployment BrowserPassword-jar-with-dependencies.jar contains CDI annotations but no bean archive was found (no beans.xml or class with bean defining annotations was present).
11:02:07,392 WARN  [org.jboss.weld.deployer] (MSC service thread 1-5) WFLYWELD0013: Deployment directgrantpassword-jar-with-dependencies.jar contains CDI annotations but no bean archive was found (no beans.xml or class with bean defining annotations was present).
11:02:07,445 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-8) WFLYSRV0018: Deployment "deployment.validaLogin-jar-with-dependencies.jar" is using a private module ("org.keycloak.keycloak-services") which may be changed or removed in future versions without notice.
11:02:07,446 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-8) Deploying Keycloak provider: validaLogin-jar-with-dependencies.jar
11:02:07,449 WARN  [org.jboss.weld.deployer] (MSC service thread 1-8) WFLYWELD0013: Deployment validaLogin-jar-with-dependencies.jar contains CDI annotations but no bean archive was found (no beans.xml or class with bean defining annotations was present).
11:02:07,452 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-5) Deploying Keycloak provider: user-storage-jpa-siper-jar-with-dependencies.jar
11:02:07,455 INFO  [org.jboss.weld.deployer] (MSC service thread 1-5) WFLYWELD0003: Processing weld deployment user-storage-jpa-siper-jar-with-dependencies.jar
11:02:07,455 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-3) WFLYSRV0018: Deployment "deployment.loginCaixa-jar-with-dependencies.jar" is using a private module ("org.keycloak.keycloak-services") which may be changed or removed in future versions without notice.
11:02:07,456 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-3) Deploying Keycloak provider: loginCaixa-jar-with-dependencies.jar
11:02:07,457 WARN  [org.jboss.weld.deployer] (MSC service thread 1-3) WFLYWELD0013: Deployment loginCaixa-jar-with-dependencies.jar contains CDI annotations but no bean archive was found (no beans.xml or class with bean defining annotations was present).
11:02:07,471 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-7) WFLYSRV0018: Deployment "deployment.keycloak-server.war" is using a private module ("org.kie") which may be changed or removed in future versions without notice.
11:02:07,561 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-5) HV000001: Hibernate Validator 6.0.16.Final-redhat-00001
11:02:07,627 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-7) WFLYSRV0018: Deployment "deployment.resource-provider-jar-with-dependencies.jar" is using a private module ("org.keycloak.keycloak-services") which may be changed or removed in future versions without notice.
11:02:07,631 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-3) Deploying Keycloak provider: resource-provider-jar-with-dependencies.jar
11:02:07,633 WARN  [org.jboss.weld.deployer] (MSC service thread 1-2) WFLYWELD0013: Deployment resource-provider-jar-with-dependencies.jar contains CDI annotations but no bean archive was found (no beans.xml or class with bean defining annotations was present).
11:02:07,738 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: JNDI bindings for session bean named 'SiperUserStorageProvider' in deployment unit 'deployment "user-storage-jpa-siper-jar-with-dependencies.jar"' are as follows:

        java:global/user-storage-jpa-siper-jar-with-dependencies/SiperUserStorageProvider!br.gov.caixa.keycloak.SiperUserStorageProvider
        java:app/user-storage-jpa-siper-jar-with-dependencies/SiperUserStorageProvider!br.gov.caixa.keycloak.SiperUserStorageProvider
        java:module/SiperUserStorageProvider!br.gov.caixa.keycloak.SiperUserStorageProvider
        ejb:/user-storage-jpa-siper-jar-with-dependencies/SiperUserStorageProvider!br.gov.caixa.keycloak.SiperUserStorageProvider?stateful
        java:global/user-storage-jpa-siper-jar-with-dependencies/SiperUserStorageProvider
        java:app/user-storage-jpa-siper-jar-with-dependencies/SiperUserStorageProvider
        java:module/SiperUserStorageProvider

11:02:07,821 INFO  [org.infinispan.factories.GlobalComponentRegistry] (MSC service thread 1-6) ISPN000128: Infinispan version: Infinispan 'Estrella Galicia' 9.3.6.Final-redhat-00001
11:02:07,873 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 62) WFLYJPA0010: Starting Persistence Unit (phase 1 of 2) Service 'user-storage-jpa-siper-jar-with-dependencies.jar#user-storage-jpa-siper'
11:02:07,909 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 62) HHH000204: Processing PersistenceUnitInfo [
        name: user-storage-jpa-siper
        ...]
11:02:07,977 INFO  [org.jboss.weld.Version] (MSC service thread 1-5) WELD-000900: 3.0.6 (redhat)
11:02:08,084 INFO  [org.hibernate.Version] (ServerService Thread Pool -- 62) HHH000412: Hibernate Core {5.3.10.Final-redhat-00001}
11:02:08,086 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 62) HHH000206: hibernate.properties not found
11:02:08,086 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry jaxb-core.jar in /content/servico.war/WEB-INF/lib/jaxb-impl-2.3.0.jar  does not point to a valid jar for a Class-Path reference.
11:02:08,087 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0059: Class Path entry jaxb-api.jar in /content/servico.war/WEB-INF/lib/jaxb-core-2.3.0.jar  does not point to a valid jar for a Class-Path reference.
11:02:08,126 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 56) WFLYCLINF0002: Started realms cache from keycloak container
11:02:08,130 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 61) WFLYCLINF0002: Started actionTokens cache from keycloak container
11:02:08,130 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 59) WFLYCLINF0002: Started offlineSessions cache from keycloak container
11:02:08,131 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 63) WFLYCLINF0002: Started sessions cache from keycloak container
11:02:08,135 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 60) WFLYCLINF0002: Started offlineClientSessions cache from keycloak container
11:02:08,139 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 55) WFLYCLINF0002: Started loginFailures cache from keycloak container
11:02:08,139 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 64) WFLYCLINF0002: Started authenticationSessions cache from keycloak container
11:02:08,139 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 57) WFLYCLINF0002: Started clientSessions cache from keycloak container
11:02:08,139 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 66) WFLYCLINF0002: Started work cache from keycloak container
11:02:08,140 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0002: Started keys cache from keycloak container
11:02:08,139 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 54) WFLYCLINF0002: Started users cache from keycloak container
11:02:08,139 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 58) WFLYCLINF0002: Started authorization cache from keycloak container
11:02:08,143 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 67) WFLYCLINF0002: Started client-mappings cache from ejb container
11:02:08,239 INFO  [org.jboss.as.jpa] (MSC service thread 1-8) WFLYJPA0002: Read persistence.xml for servico-dispositivo
11:02:08,307 INFO  [org.hibernate.annotations.common.Version] (ServerService Thread Pool -- 62) HCANN000001: Hibernate Commons Annotations {5.0.4.Final-redhat-00001}
11:02:08,389 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 54) WFLYJPA0010: Starting Persistence Unit (phase 1 of 2) Service 'servico.war#servico-dispositivo'
11:02:08,389 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 54) HHH000204: Processing PersistenceUnitInfo [
        name: servico-dispositivo
        ...]
11:02:08,462 INFO  [org.jboss.keycloak] (MSC service thread 1-8) Keycloak subsystem override for deployment servico.war
11:02:08,463 INFO  [org.jboss.weld.deployer] (MSC service thread 1-8) WFLYWELD0003: Processing weld deployment servico.war
11:02:08,496 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-8) WFLYEJB0473: JNDI bindings for session bean named 'Provider' in deployment unit 'deployment "servico.war"' are as follows:

        java:global/servico/Provider!br.gov.caixa.servico.negocio.Provider
        java:app/servico/Provider!br.gov.caixa.servico.negocio.Provider
        java:module/Provider!br.gov.caixa.servico.negocio.Provider
        ejb:/servico/Provider!br.gov.caixa.servico.negocio.Provider
        java:global/servico/Provider
        java:app/servico/Provider
        java:module/Provider

11:02:08,496 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-8) WFLYEJB0473: JNDI bindings for session bean named 'CodigoValidadorRepository' in deployment unit 'deployment "servico.war"' are as follows:

        java:global/servico/CodigoValidadorRepository!br.gov.caixa.validacao.codigo.repositorio.CodigoValidadorRepository
        java:app/servico/CodigoValidadorRepository!br.gov.caixa.validacao.codigo.repositorio.CodigoValidadorRepository
        java:module/CodigoValidadorRepository!br.gov.caixa.validacao.codigo.repositorio.CodigoValidadorRepository
        ejb:/servico/CodigoValidadorRepository!br.gov.caixa.validacao.codigo.repositorio.CodigoValidadorRepository
        java:global/servico/CodigoValidadorRepository
        java:app/servico/CodigoValidadorRepository
        java:module/CodigoValidadorRepository

11:02:08,496 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-8) WFLYEJB0473: JNDI bindings for session bean named 'FingerPrintRepository' in deployment unit 'deployment "servico.war"' are as follows:

        java:global/servico/FingerPrintRepository!br.gov.caixa.fingerprint.repositorio.FingerPrintRepository
        java:app/servico/FingerPrintRepository!br.gov.caixa.fingerprint.repositorio.FingerPrintRepository
        java:module/FingerPrintRepository!br.gov.caixa.fingerprint.repositorio.FingerPrintRepository
        ejb:/servico/FingerPrintRepository!br.gov.caixa.fingerprint.repositorio.FingerPrintRepository
        java:global/servico/FingerPrintRepository
        java:app/servico/FingerPrintRepository
        java:module/FingerPrintRepository

11:02:08,497 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-8) WFLYEJB0473: JNDI bindings for session bean named 'CodigoValidadorLogRepository' in deployment unit 'deployment "servico.war"' are as follows:

        java:global/servico/CodigoValidadorLogRepository!br.gov.caixa.validacao.codigo.repositorio.CodigoValidadorLogRepository
        java:app/servico/CodigoValidadorLogRepository!br.gov.caixa.validacao.codigo.repositorio.CodigoValidadorLogRepository
        java:module/CodigoValidadorLogRepository!br.gov.caixa.validacao.codigo.repositorio.CodigoValidadorLogRepository
        ejb:/servico/CodigoValidadorLogRepository!br.gov.caixa.validacao.codigo.repositorio.CodigoValidadorLogRepository
        java:global/servico/CodigoValidadorLogRepository
        java:app/servico/CodigoValidadorLogRepository
        java:module/CodigoValidadorLogRepository

11:02:08,497 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-8) WFLYEJB0473: JNDI bindings for session bean named 'CodigoUniProxRepository' in deployment unit 'deployment "servico.war"' are as follows:

        java:global/servico/CodigoUniProxRepository!br.gov.caixa.validacao.codigo.repositorio.CodigoUniProxRepository
        java:app/servico/CodigoUniProxRepository!br.gov.caixa.validacao.codigo.repositorio.CodigoUniProxRepository
        java:module/CodigoUniProxRepository!br.gov.caixa.validacao.codigo.repositorio.CodigoUniProxRepository
        ejb:/servico/CodigoUniProxRepository!br.gov.caixa.validacao.codigo.repositorio.CodigoUniProxRepository
        java:global/servico/CodigoUniProxRepository
        java:app/servico/CodigoUniProxRepository
        java:module/CodigoUniProxRepository

11:02:08,594 WARN  [org.jboss.as.jaxrs] (MSC service thread 1-6) WFLYRS0018: Explicit usage of Jackson annotation in a JAX-RS deployment; the system will disable JSON-B processing for the current deployment. Consider setting the 'resteasy.preferJacksonOverJsonB' property to 'false' to restore JSON-B.
11:02:08,624 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 54) WFLYJPA0010: Starting Persistence Unit (phase 2 of 2) Service 'servico.war#servico-dispositivo'
11:02:08,732 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 54) HHH000400: Using dialect: org.hibernate.dialect.OracleDialect
11:02:08,737 WARN  [org.hibernate.dialect.Oracle9Dialect] (ServerService Thread Pool -- 54) HHH000063: The Oracle9Dialect dialect has been deprecated; use either Oracle9iDialect or Oracle10gDialect instead
11:02:08,738 WARN  [org.hibernate.dialect.OracleDialect] (ServerService Thread Pool -- 54) HHH000064: The OracleDialect dialect has been deprecated; use Oracle8iDialect instead
11:02:08,764 INFO  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0001: Loading config from standalone.xml or domain.xml
11:02:08,889 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 54) Envers integration enabled? : true
11:02:09,130 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: evento-todos (br.gov.caixa.keycloak.events.todos.EventExternalFactory) is implementing the internal SPI eventsListener. This SPI is internal and may change without notice
11:02:09,130 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: evento-execute-action (br.gov.caixa.keycloak.events.executeactions.EventExternalExecuteActionsFactory) is implementing the internal SPI eventsListener. This SPI is internal and may change without notice
11:02:09,131 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: evento-execute-action-error (br.gov.caixa.keycloak.events.executeactionserror.EventExternalExecuteActionsErrorFactory) is implementing the internal SPI eventsListener. This SPI is internal and may change without notice
11:02:09,131 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: evento-login (br.gov.caixa.keycloak.events.login.EventExternalLoginFactory) is implementing the internal SPI eventsListener. This SPI is internal and may change without notice
11:02:09,131 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: evento-login-error (br.gov.caixa.keycloak.events.loginerror.EventExternalLoginErrorFactory) is implementing the internal SPI eventsListener. This SPI is internal and may change without notice
11:02:09,131 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: evento-register (br.gov.caixa.keycloak.events.register.EventExternalRegisterFactory) is implementing the internal SPI eventsListener. This SPI is internal and may change without notice
11:02:09,131 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: evento-register-error (br.gov.caixa.keycloak.events.registerError.EventExternalRegisterErrorFactory) is implementing the internal SPI eventsListener. This SPI is internal and may change without notice
11:02:09,131 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: evento-send-reset-password (br.gov.caixa.keycloak.events.sendresetpassword.EventExternalSendResetPasswordFactory) is implementing the internal SPI eventsListener. This SPI is internal and may change without notice
11:02:09,131 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: evento-send-reset-password-error (br.gov.caixa.keycloak.events.sendresetpassworderror.EventExternalSendResetPasswordErrorFactory) is implementing the internal SPI eventsListener. This SPI is internal and may change without notice
11:02:09,131 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: evento-update-password (br.gov.caixa.keycloak.events.updatepassword.EventExternalUpdatePasswordFactory) is implementing the internal SPI eventsListener. This SPI is internal and may change without notice
11:02:09,131 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: evento-update-password-error (br.gov.caixa.keycloak.events.updatepassworderror.EventExternalUpdatePasswordErrorFactory) is implementing the internal SPI eventsListener. This SPI is internal and may change without notice
11:02:09,150 INFO  [br.gov.caixa.keycloak.OTPFormAuthenticatorCaixaFactory] (ServerService Thread Pool -- 67) INIT OTPFormAuthenticatorCaixa - v2.0
11:02:09,150 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: auth-conditional-otp-form-caixa (br.gov.caixa.keycloak.OTPFormAuthenticatorCaixaFactory) is implementing the internal SPI authenticator. This SPI is internal and may change without notice
11:02:09,156 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: siset-user-session (br.gov.caixa.siset.internet.spi.session.SisetUserSessionProviderFactory) is implementing the internal SPI userSessions. This SPI is internal and may change without notice
11:02:09,158 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: siset-user-session (br.gov.caixa.siset.internet.spi.session.SisetUserSessionPersisterProviderFactory) is implementing the internal SPI userSessionPersister. This SPI is internal and may change without notice
11:02:09,172 INFO  [br.gov.caixa.authenticator.BrowserPasswordSiperFactory] (ServerService Thread Pool -- 67) Registrando Factory do SiperBrowser Password SIPER
11:02:09,172 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: browser-validate-password-caixa (br.gov.caixa.authenticator.BrowserPasswordSiperFactory) is implementing the internal SPI authenticator. This SPI is internal and may change without notice
11:02:09,184 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: direct-grant-validate-password-caixa (br.gov.caixa.authenticator.DirectGrantPasswordSiper) is implementing the internal SPI authenticator. This SPI is internal and may change without notice
11:02:09,198 INFO  [br.gov.caixa.keycloak.authenticator.CaixaValidaLoginAuthenticatorFactory] (ServerService Thread Pool -- 67) Registrando Factory do Vincula Login
11:02:09,198 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: valida-login-authenticator (br.gov.caixa.keycloak.authenticator.CaixaValidaLoginAuthenticatorFactory) is implementing the internal SPI authenticator. This SPI is internal and may change without notice
11:02:09,219 INFO  [br.gov.caixa.keycloak.authenticators.browser.LoginCaixaFormAuthenticatorFactory] (ServerService Thread Pool -- 67) INIT LoginCaixaFormAuthenticator - v1.0
11:02:09,219 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: auth-conditional-login-caixa (br.gov.caixa.keycloak.authenticators.browser.LoginCaixaFormAuthenticatorFactory) is implementing the internal SPI authenticator. This SPI is internal and may change without notice
11:02:09,220 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: auth-x509-client-username-form-caixa (br.gov.caixa.keycloak.authenticators.x509.X509ClientCertificateCaixaAuthenticatorFactory) is implementing the internal SPI authenticator. This SPI is internal and may change without notice
11:02:09,225 WARN  [org.keycloak.services] (ServerService Thread Pool -- 67) KC-SERVICES0047: resource_provider (br.gov.caixa.keycloak.rest.ResourceProviderFactory) is implementing the internal SPI realm-restapi-extension. This SPI is internal and may change without notice
11:02:09,271 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 67) WFLYCLINF0002: Started realmRevisions cache from keycloak container
11:02:09,274 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 67) WFLYCLINF0002: Started userRevisions cache from keycloak container
11:02:09,281 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 67) WFLYCLINF0002: Started authorizationRevisions cache from keycloak container
11:02:09,282 INFO  [org.keycloak.connections.infinispan.DefaultInfinispanConnectionProviderFactory] (ServerService Thread Pool -- 67) Node name: crjtqapllx036, Site name: null
11:02:09,759 INFO  [org.hibernate.hql.internal.QueryTranslatorFactoryInitiator] (ServerService Thread Pool -- 54) HHH000397: Using ASTQueryTranslatorFactory
11:02:10,155 INFO  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 1) WELD-001125: Illegal bean type class org.jboss.resteasy.plugins.providers.AbstractEntityProvider<javax.xml.bind.JAXBElement<?>> ignored on [EnhancedAnnotatedTypeImpl] public @Produces @Provider @ApplicationScoped @Consumes class org.jboss.resteasy.plugins.providers.jaxb.JAXBElementProvider
11:02:10,156 INFO  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 1) WELD-001125: Illegal bean type interface javax.ws.rs.ext.MessageBodyReader<javax.xml.bind.JAXBElement<?>> ignored on [EnhancedAnnotatedTypeImpl] public @Produces @Provider @ApplicationScoped @Consumes class org.jboss.resteasy.plugins.providers.jaxb.JAXBElementProvider
11:02:10,157 INFO  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 1) WELD-001125: Illegal bean type org.jboss.resteasy.plugins.providers.jaxb.AbstractJAXBProvider<javax.xml.bind.JAXBElement<?>> ignored on [EnhancedAnnotatedTypeImpl] public @Produces @Provider @ApplicationScoped @Consumes class org.jboss.resteasy.plugins.providers.jaxb.JAXBElementProvider
11:02:10,157 INFO  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 1) WELD-001125: Illegal bean type interface javax.ws.rs.ext.MessageBodyWriter<javax.xml.bind.JAXBElement<?>> ignored on [EnhancedAnnotatedTypeImpl] public @Produces @Provider @ApplicationScoped @Consumes class org.jboss.resteasy.plugins.providers.jaxb.JAXBElementProvider
11:02:10,181 INFO  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 14) WELD-001125: Illegal bean type javax.ws.rs.ext.MessageBodyReader<java.util.List<?>> ignored on [EnhancedAnnotatedTypeImpl] public @Provider @ApplicationScoped @Consumes class org.jboss.resteasy.plugins.providers.multipart.ListMultipartReader
11:02:10,181 INFO  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 10) WELD-001125: Illegal bean type javax.ws.rs.ext.MessageBodyReader<java.util.Map<?, ?>> ignored on [EnhancedAnnotatedTypeImpl] public @Provider @ApplicationScoped @Consumes class org.jboss.resteasy.plugins.providers.multipart.MapMultipartFormDataReader
11:02:10,202 WARN  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 7) WELD-000167: Class org.jboss.resteasy.core.AsynchronousDispatcher is annotated with @RequestScoped but it does not declare an appropriate constructor therefore is not registered as a bean!
11:02:10,202 WARN  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 12) WELD-000167: Class org.jboss.resteasy.plugins.providers.DocumentProvider is annotated with @ApplicationScoped but it does not declare an appropriate constructor therefore is not registered as a bean!
11:02:10,236 WARN  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 11) WELD-000167: Class org.keycloak.services.resources.WelcomeResource is annotated with @RequestScoped but it does not declare an appropriate constructor therefore is not registered as a bean!
11:02:10,236 WARN  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 5) WELD-000167: Class org.keycloak.services.util.ObjectMapperResolver is annotated with @ApplicationScoped but it does not declare an appropriate constructor therefore is not registered as a bean!
11:02:10,338 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 62) WFLYJPA0010: Starting Persistence Unit (phase 2 of 2) Service 'user-storage-jpa-siper-jar-with-dependencies.jar#user-storage-jpa-siper'
11:02:10,493 WARN  [org.jboss.as.weld] (ServerService Thread Pool -- 64) WFLYWELD0052: Using deployment classloader to load proxy classes for module org.jboss.resteasy.resteasy-jaxrs. Package-private access will not work. To fix this the module should declare dependencies on [org.jboss.weld.core, org.jboss.weld.spi]
11:02:10,503 WARN  [org.jboss.as.weld] (ServerService Thread Pool -- 64) WFLYWELD0052: Using deployment classloader to load proxy classes for module org.jboss.resteasy.resteasy-multipart-provider. Package-private access will not work. To fix this the module should declare dependencies on [org.jboss.weld.core, org.jboss.weld.spi]
11:02:10,514 WARN  [org.jboss.as.weld] (ServerService Thread Pool -- 64) WFLYWELD0052: Using deployment classloader to load proxy classes for module org.jboss.resteasy.resteasy-jaxb-provider. Package-private access will not work. To fix this the module should declare dependencies on [org.jboss.weld.core, org.jboss.weld.spi]
11:02:10,644 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (ServerService Thread Pool -- 67) IJ000604: Throwable while attempting to get a new connection: null: javax.resource.ResourceException: IJ031084: Unable to create connection
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

11:02:10,652 INFO  [org.reflections.Reflections] (ServerService Thread Pool -- 64) Reflections took 22 ms to scan 1 urls, producing 135 keys and 237 values
11:02:10,657 INFO  [org.jboss.as.server] (Thread-16) WFLYSRV0220: Server shutdown has been requested via an OS signal
11:02:10,663 ERROR [org.jboss.msc.service.fail] (ServerService Thread Pool -- 67) MSC000001: Failed to start service jboss.deployment.unit."keycloak-server.war".undertow-deployment: org.jboss.msc.service.StartException in service jboss.deployment.unit."keycloak-server.war".undertow-deployment: java.lang.RuntimeException: RESTEASY003325: Failed to construct public org.keycloak.services.resources.KeycloakApplication(javax.servlet.ServletContext,org.jboss.resteasy.core.Dispatcher)
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

11:02:10,705 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-7) WFLYMAIL0002: Unbound mail session [java:jboss/mail/Default]
11:02:10,705 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0008: Undertow HTTPS listener https suspending
11:02:10,707 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0007: Undertow HTTPS listener https stopped, was bound to 10.116.26.227:8443
11:02:10,718 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-2) Undeploying Keycloak provider: eventExternal-jar-with-dependencies.jar
11:02:10,718 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-6) Undeploying Keycloak provider: validaLogin-jar-with-dependencies.jar
11:02:10,719 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-5) Undeploying Keycloak provider: OTPCaixaCond.jar
11:02:10,718 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-1) Undeploying Keycloak provider: directgrantpassword-jar-with-dependencies.jar
11:02:10,719 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-8) Undeploying Keycloak provider: BrowserPassword-jar-with-dependencies.jar
11:02:10,720 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-7) Undeploying Keycloak provider: siset-user-session-provider.jar
11:02:10,721 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-5) Undeploying Keycloak provider: loginCaixa-jar-with-dependencies.jar
11:02:10,721 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-3) Undeploying Keycloak provider: resource-provider-jar-with-dependencies.jar
11:02:10,722 ERROR [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0043: Deployment unit processor org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor@7d15ee7f unexpectedly threw an exception during undeploy phase POST_MODULE of deployment "loginCaixa-jar-with-dependencies.jar": java.lang.NullPointerException
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

11:02:10,722 ERROR [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0043: Deployment unit processor org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor@7d15ee7f unexpectedly threw an exception during undeploy phase POST_MODULE of deployment "BrowserPassword-jar-with-dependencies.jar": java.lang.NullPointerException
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

11:02:10,722 ERROR [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0043: Deployment unit processor org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor@7d15ee7f unexpectedly threw an exception during undeploy phase POST_MODULE of deployment "directgrantpassword-jar-with-dependencies.jar": java.lang.NullPointerException
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

11:02:10,726 ERROR [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0043: Deployment unit processor org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor@7d15ee7f unexpectedly threw an exception during undeploy phase POST_MODULE of deployment "eventExternal-jar-with-dependencies.jar": java.lang.NullPointerException
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

11:02:10,729 ERROR [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0043: Deployment unit processor org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor@7d15ee7f unexpectedly threw an exception during undeploy phase POST_MODULE of deployment "validaLogin-jar-with-dependencies.jar": java.lang.NullPointerException
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

11:02:10,737 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 55) WFLYCLINF0003: Stopped authenticationSessions cache from keycloak container
11:02:10,739 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 56) WFLYCLINF0003: Stopped actionTokens cache from keycloak container
11:02:10,742 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0028: Stopped deployment keycloak-server.war (runtime-name: keycloak-server.war) in 70ms
11:02:10,743 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0028: Stopped deployment OTPCaixaCond.jar (runtime-name: OTPCaixaCond.jar) in 72ms
11:02:10,745 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0028: Stopped deployment siset-user-session-provider.jar (runtime-name: siset-user-session-provider.jar) in 73ms
11:02:10,745 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0028: Stopped deployment BrowserPassword-jar-with-dependencies.jar (runtime-name: BrowserPassword-jar-with-dependencies.jar) in 73ms
11:02:10,746 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0028: Stopped deployment eventExternal-jar-with-dependencies.jar (runtime-name: eventExternal-jar-with-dependencies.jar) in 75ms
11:02:10,747 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0028: Stopped deployment directgrantpassword-jar-with-dependencies.jar (runtime-name: directgrantpassword-jar-with-dependencies.jar) in 75ms
11:02:10,748 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 67) WFLYCLINF0003: Stopped offlineSessions cache from keycloak container
11:02:10,749 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0028: Stopped deployment loginCaixa-jar-with-dependencies.jar (runtime-name: loginCaixa-jar-with-dependencies.jar) in 77ms
11:02:10,749 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 57) WFLYCLINF0003: Stopped offlineClientSessions cache from keycloak container
11:02:10,749 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 66) WFLYCLINF0003: Stopped loginFailures cache from keycloak container
11:02:10,749 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 63) WFLYCLINF0003: Stopped sessions cache from keycloak container
11:02:10,750 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 65) WFLYCLINF0003: Stopped clientSessions cache from keycloak container
11:02:10,750 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0028: Stopped deployment validaLogin-jar-with-dependencies.jar (runtime-name: validaLogin-jar-with-dependencies.jar) in 78ms
11:02:10,750 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 59) WFLYCLINF0003: Stopped work cache from keycloak container
11:02:10,751 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 61) WFLYCLINF0003: Stopped realms cache from keycloak container
11:02:10,751 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 60) WFLYCLINF0003: Stopped authorization cache from keycloak container
11:02:10,753 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 54) WFLYCLINF0003: Stopped keys cache from keycloak container
11:02:10,754 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 58) WFLYCLINF0003: Stopped users cache from keycloak container
11:02:10,759 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0028: Stopped deployment resource-provider-jar-with-dependencies.jar (runtime-name: resource-provider-jar-with-dependencies.jar) in 87ms
11:02:10,762 INFO  [org.jboss.as.clustering.infinispan] (MSC service thread 1-7) WFLYCLINF0003: Stopped authorizationRevisions cache from keycloak container
11:02:10,764 INFO  [org.jboss.as.clustering.infinispan] (MSC service thread 1-7) WFLYCLINF0003: Stopped realmRevisions cache from keycloak container
11:02:10,765 INFO  [org.jboss.as.clustering.infinispan] (MSC service thread 1-7) WFLYCLINF0003: Stopped userRevisions cache from keycloak container
11:02:10,871 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 64) RESTEASY002225: Deploying javax.ws.rs.core.Application: class br.gov.caixa.servico.comum.Aplicacao
11:02:10,872 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 64) RESTEASY002205: Adding provider class io.swagger.jaxrs.listing.SwaggerSerializers from Application class br.gov.caixa.servico.comum.Aplicacao
11:02:10,872 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 64) RESTEASY002200: Adding class resource io.swagger.jaxrs.listing.ApiListingResource from Application class br.gov.caixa.servico.comum.Aplicacao
11:02:10,872 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 64) RESTEASY002200: Adding class resource br.gov.caixa.servico.servlet.Servico from Application class br.gov.caixa.servico.comum.Aplicacao
11:02:10,911 INFO  [org.jboss.resteasy.plugins.validation.i18n] (ServerService Thread Pool -- 64) RESTEASY008550: Unable to find CDI supporting ValidatorFactory. Using default ValidatorFactory
11:02:10,982 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 64) WFLYUT0021: Registered web context: '/servico' for server 'default-server'
11:02:10,985 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 64) WFLYUT0022: Unregistered web context: '/servico' from server 'default-server'
11:02:10,991 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0019: Host default-host stopping
11:02:10,998 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-7) WFLYUT0008: Undertow HTTP listener default suspending
11:02:10,999 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-7) WFLYUT0007: Undertow HTTP listener default stopped, was bound to 10.116.26.227:8080
11:02:10,999 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-7) WFLYUT0004: Undertow 2.0.22.Final-redhat-00001 stopping
11:02:11,003 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 59) WFLYCLINF0003: Stopped client-mappings cache from ejb container
11:02:11,011 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0010: Unbound data source [java:jboss/datasources/ExampleDS]
11:02:11,015 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-5) WFLYJCA0019: Stopped Driver service with driver-name = h2
11:02:11,016 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 59) WFLYJPA0011: Stopping Persistence Unit (phase 2 of 2) Service 'servico.war#servico-dispositivo'
11:02:11,020 INFO  [org.hibernate.orm.beans] (ServerService Thread Pool -- 59) HHH10005004: Stopping BeanContainer : org.hibernate.resource.beans.container.internal.CdiBeanContainerExtendedAccessImpl@9a5e075
11:02:11,025 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 59) WFLYJPA0011: Stopping Persistence Unit (phase 1 of 2) Service 'servico.war#servico-dispositivo'
11:02:11,025 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-3) WFLYJCA0010: Unbound data source [java:jboss/datasources/oraset]
11:02:11,062 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0028: Stopped deployment servico.war (runtime-name: servico.war) in 391ms
11:02:12,651 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (ServerService Thread Pool -- 62) IJ000604: Throwable while attempting to get a new connection: null: javax.resource.ResourceException: IJ031084: Unable to create connection
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
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:904)
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:935)
        at org.jboss.as.jpa.hibernate5.TwoPhaseBootstrapImpl.build(TwoPhaseBootstrapImpl.java:44)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:167)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:125)
        at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:650)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1.run(PersistenceUnitServiceImpl.java:209)
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
        ... 38 more

11:02:12,652 WARN  [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator] (ServerService Thread Pool -- 62) HHH000342: Could not obtain connection to query metadata : javax.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/datasources/KeycloakDS
11:02:12,658 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 62) HHH000400: Using dialect: org.hibernate.dialect.Oracle12cDialect
11:02:12,660 INFO  [org.hibernate.engine.jdbc.env.internal.LobCreatorBuilderImpl] (ServerService Thread Pool -- 62) HHH000422: Disabling contextual LOB creation as connection was null
11:02:12,661 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 62) HHH000270: Type registration [byte[]] overrides previous : org.hibernate.type.BinaryType@3655e780
11:02:12,661 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 62) HHH000270: Type registration [[B] overrides previous : org.hibernate.type.BinaryType@3655e780
11:02:12,661 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 62) HHH000270: Type registration [Byte[]] overrides previous : org.hibernate.type.WrapperBinaryType@786c6f53
11:02:12,662 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 62) HHH000270: Type registration [[Ljava.lang.Byte;] overrides previous : org.hibernate.type.WrapperBinaryType@786c6f53
11:02:12,662 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 62) Envers integration enabled? : true
11:02:15,736 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (ServerService Thread Pool -- 62) IJ000604: Throwable while attempting to get a new connection: null: javax.resource.ResourceException: IJ031084: Unable to create connection
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
        at org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
        at org.hibernate.internal.SessionFactoryImpl$1.obtainConnection(SessionFactoryImpl.java:460)
        at org.hibernate.hql.spi.id.IdTableHelper.executeIdTableCreationStatements(IdTableHelper.java:67)
        at org.hibernate.hql.spi.id.global.GlobalTemporaryTableBulkIdStrategy.finishPreparation(GlobalTemporaryTableBulkIdStrategy.java:125)
        at org.hibernate.hql.spi.id.global.GlobalTemporaryTableBulkIdStrategy.finishPreparation(GlobalTemporaryTableBulkIdStrategy.java:42)
        at org.hibernate.hql.spi.id.AbstractMultiTableBulkIdStrategyImpl.prepare(AbstractMultiTableBulkIdStrategyImpl.java:88)
        at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:303)
        at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:467)
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:939)
        at org.jboss.as.jpa.hibernate5.TwoPhaseBootstrapImpl.build(TwoPhaseBootstrapImpl.java:44)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:167)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:125)
        at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:650)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1.run(PersistenceUnitServiceImpl.java:209)
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
        ... 31 more

11:02:15,737 ERROR [org.hibernate.hql.spi.id.IdTableHelper] (ServerService Thread Pool -- 62) Unable obtain JDBC Connection: java.sql.SQLException: javax.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/datasources/KeycloakDS
        at org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:159)
        at org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
        at org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
        at org.hibernate.internal.SessionFactoryImpl$1.obtainConnection(SessionFactoryImpl.java:460)
        at org.hibernate.hql.spi.id.IdTableHelper.executeIdTableCreationStatements(IdTableHelper.java:67)
        at org.hibernate.hql.spi.id.global.GlobalTemporaryTableBulkIdStrategy.finishPreparation(GlobalTemporaryTableBulkIdStrategy.java:125)
        at org.hibernate.hql.spi.id.global.GlobalTemporaryTableBulkIdStrategy.finishPreparation(GlobalTemporaryTableBulkIdStrategy.java:42)
        at org.hibernate.hql.spi.id.AbstractMultiTableBulkIdStrategyImpl.prepare(AbstractMultiTableBulkIdStrategyImpl.java:88)
        at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:303)
        at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:467)
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:939)
        at org.jboss.as.jpa.hibernate5.TwoPhaseBootstrapImpl.build(TwoPhaseBootstrapImpl.java:44)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:167)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:125)
        at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:650)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1.run(PersistenceUnitServiceImpl.java:209)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1378)
        at java.lang.Thread.run(Thread.java:745)
        at org.jboss.threads.JBossThread.run(JBossThread.java:485)
Caused by: javax.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/datasources/KeycloakDS
        at org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:690)
        at org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
        at org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
        at org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:151)
        ... 21 more
Caused by: javax.resource.ResourceException: IJ031084: Unable to create connection
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:345)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:352)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
        at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1325)
        at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:499)
        at org.jboss.jca.core.connectionmanager.pool.AbstractPool.getSimpleConnection(AbstractPool.java:632)
        at org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:604)
        at org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
        ... 24 more
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
        ... 31 more

11:02:15,748 INFO  [org.hibernate.orm.beans] (ServerService Thread Pool -- 62) HHH10005004: Stopping BeanContainer : org.hibernate.resource.beans.container.internal.CdiBeanContainerExtendedAccessImpl@34f4ddae
11:02:15,749 ERROR [org.jboss.msc.service.fail] (ServerService Thread Pool -- 62) MSC000001: Failed to start service jboss.persistenceunit."user-storage-jpa-siper-jar-with-dependencies.jar#user-storage-jpa-siper": org.jboss.msc.service.StartException in service jboss.persistenceunit."user-storage-jpa-siper-jar-with-dependencies.jar#user-storage-jpa-siper": javax.persistence.PersistenceException: [PersistenceUnit: user-storage-jpa-siper] Unable to build Hibernate SessionFactory
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:195)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:125)
        at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:650)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1.run(PersistenceUnitServiceImpl.java:209)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1378)
        at java.lang.Thread.run(Thread.java:745)
        at org.jboss.threads.JBossThread.run(JBossThread.java:485)
Caused by: javax.persistence.PersistenceException: [PersistenceUnit: user-storage-jpa-siper] Unable to build Hibernate SessionFactory
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.persistenceException(EntityManagerFactoryBuilderImpl.java:1016)
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:942)
        at org.jboss.as.jpa.hibernate5.TwoPhaseBootstrapImpl.build(TwoPhaseBootstrapImpl.java:44)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:167)
        ... 9 more
Caused by: org.hibernate.engine.jndi.JndiException: unable to find transaction manager
        at org.hibernate.engine.transaction.jta.platform.internal.JBossAppServerJtaPlatform.locateTransactionManager(JBossAppServerJtaPlatform.java:45)
        at org.hibernate.engine.transaction.jta.platform.internal.AbstractJtaPlatform.retrieveTransactionManager(AbstractJtaPlatform.java:87)
        at org.hibernate.resource.transaction.backend.jta.internal.DdlTransactionIsolatorJtaImpl.<init>(DdlTransactionIsolatorJtaImpl.java:42)
        at org.hibernate.resource.transaction.backend.jta.internal.JtaTransactionCoordinatorBuilderImpl.buildDdlTransactionIsolator(JtaTransactionCoordinatorBuilderImpl.java:46)
        at org.hibernate.tool.schema.internal.HibernateSchemaManagementTool.getDdlTransactionIsolator(HibernateSchemaManagementTool.java:175)
        at org.hibernate.tool.schema.internal.AbstractSchemaMigrator.doMigration(AbstractSchemaMigrator.java:94)
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.performDatabaseAction(SchemaManagementToolCoordinator.java:183)
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.process(SchemaManagementToolCoordinator.java:72)
        at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:310)
        at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:467)
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:939)
        ... 11 more
Caused by: org.hibernate.engine.jndi.JndiException: Unable to lookup JNDI name [java:jboss/TransactionManager]
        at org.hibernate.engine.jndi.internal.JndiServiceImpl.locate(JndiServiceImpl.java:100)
        at org.hibernate.engine.transaction.jta.platform.internal.JBossAppServerJtaPlatform.locateTransactionManager(JBossAppServerJtaPlatform.java:38)
        ... 21 more
Caused by: javax.naming.NameNotFoundException: TransactionManager -- service jboss.naming.context.java.jboss.TransactionManager
        at org.jboss.as.naming.ServiceBasedNamingStore.lookup(ServiceBasedNamingStore.java:106)
        at org.jboss.as.naming.NamingContext.lookup(NamingContext.java:207)
        at org.jboss.as.naming.NamingContext.lookup(NamingContext.java:184)
        at org.jboss.as.naming.InitialContext$DefaultInitialContext.lookup(InitialContext.java:239)
        at org.jboss.as.naming.NamingContext.lookup(NamingContext.java:184)
        at javax.naming.InitialContext.lookup(InitialContext.java:421)
        at javax.naming.InitialContext.lookup(InitialContext.java:421)
        at org.hibernate.engine.jndi.internal.JndiServiceImpl.locate(JndiServiceImpl.java:97)
        ... 22 more

11:02:15,750 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 62) WFLYJPA0011: Stopping Persistence Unit (phase 1 of 2) Service 'user-storage-jpa-siper-jar-with-dependencies.jar#user-storage-jpa-siper'
11:02:15,751 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0010: Unbound data source [java:jboss/datasources/KeycloakDS]
11:02:15,751 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-5) WFLYJCA0019: Stopped Driver service with driver-name = oracle
11:02:15,756 INFO  [org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor] (MSC service thread 1-8) Undeploying Keycloak provider: user-storage-jpa-siper-jar-with-dependencies.jar
11:02:15,757 INFO  [br.gov.caixa.keycloak.SiperUserStorageProviderFactory] (MSC service thread 1-8) <<<<<< Fechando SIPER factory
11:02:15,761 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0028: Stopped deployment user-storage-jpa-siper-jar-with-dependencies.jar (runtime-name: user-storage-jpa-siper-jar-with-dependencies.jar) in 5089ms
Failed to invoke setter setFileName with value /infra_app/logs/siset/server-siset_crjdeapllx003_inter_8080.log
.java.lang.reflect.InvocationTargetException
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at org.jboss.logmanager.config.AbstractPropertyConfiguration$1.rollback(AbstractPropertyConfiguration.java:244)
        at org.jboss.logmanager.config.LogContextConfigurationImpl.doForget(LogContextConfigurationImpl.java:355)
        at org.jboss.logmanager.config.LogContextConfigurationImpl.forget(LogContextConfigurationImpl.java:319)
        at org.jboss.as.logging.logmanager.ConfigurationPersistence.forget(ConfigurationPersistence.java:341)
        at org.jboss.as.logging.logmanager.ConfigurationPersistence.rollback(ConfigurationPersistence.java:349)
        at org.jboss.as.logging.LoggingOperations$CommitOperationStepHandler$1.handleResult(LoggingOperations.java:122)
        at org.jboss.as.controller.AbstractOperationContext$Step.invokeResultHandler(AbstractOperationContext.java:1533)
        at org.jboss.as.controller.AbstractOperationContext$Step.handleResult(AbstractOperationContext.java:1515)
        at org.jboss.as.controller.AbstractOperationContext$Step.finalizeInternal(AbstractOperationContext.java:1472)
        at org.jboss.as.controller.AbstractOperationContext$Step.finalizeStep(AbstractOperationContext.java:1455)
        at org.jboss.as.controller.AbstractOperationContext$Step.access$400(AbstractOperationContext.java:1319)
        at org.jboss.as.controller.AbstractOperationContext.executeResultHandlerPhase(AbstractOperationContext.java:876)
        at org.jboss.as.controller.AbstractOperationContext.processStages(AbstractOperationContext.java:756)
        at org.jboss.as.controller.AbstractOperationContext.executeOperation(AbstractOperationContext.java:467)
        at org.jboss.as.controller.OperationContextImpl.executeOperation(OperationContextImpl.java:1411)
        at org.jboss.as.controller.ModelControllerImpl.boot(ModelControllerImpl.java:521)
        at org.jboss.as.controller.AbstractControllerService.boot(AbstractControllerService.java:470)
        at org.jboss.as.controller.AbstractControllerService.boot(AbstractControllerService.java:432)
        at org.jboss.as.server.ServerService.boot(ServerService.java:427)
        at org.jboss.as.server.ServerService.boot(ServerService.java:386)
        at org.jboss.as.controller.AbstractControllerService$1.run(AbstractControllerService.java:372)
        at java.lang.Thread.run(Thread.java:745)
Caused by: java.io.FileNotFoundException: /infra_app/logs/siset/server-siset_crjdeapllx003_inter_8080.log (Permission denied)
        at java.io.FileOutputStream.open0(Native Method)
        at java.io.FileOutputStream.open(FileOutputStream.java:270)
        at java.io.FileOutputStream.<init>(FileOutputStream.java:213)
        at org.jboss.logmanager.handlers.FileHandler.setFile(FileHandler.java:151)
        at org.jboss.logmanager.handlers.PeriodicRotatingFileHandler.setFile(PeriodicRotatingFileHandler.java:104)
        at org.jboss.logmanager.handlers.FileHandler.setFileName(FileHandler.java:189)
        ... 26 more
11:02:15,766 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "resource-provider-jar-with-dependencies.jar" was rolled back with no failure message
11:02:15,766 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "siset-user-session-provider.jar" was rolled back with no failure message
11:02:15,766 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "validaLogin-jar-with-dependencies.jar" was rolled back with no failure message
11:02:15,766 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "user-storage-jpa-siper-jar-with-dependencies.jar" was rolled back with no failure message
11:02:15,767 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "servico.war" was rolled back with no failure message
11:02:15,767 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "loginCaixa-jar-with-dependencies.jar" was rolled back with no failure message
11:02:15,767 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "BrowserPassword-jar-with-dependencies.jar" was rolled back with no failure message
11:02:15,767 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "eventExternal-jar-with-dependencies.jar" was rolled back with no failure message
11:02:15,767 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "directgrantpassword-jar-with-dependencies.jar" was rolled back with no failure message
11:02:15,767 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "OTPCaixaCond.jar" was rolled back with no failure message
11:02:15,766 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0022: Deploy of deployment "keycloak-server.war" was rolled back with no failure message
11:02:15,772 INFO  [org.jboss.as] (MSC service thread 1-7) WFLYSRV0050: Red Hat Single Sign-On 7.3.3.GA (WildFly Core 6.0.15.Final-redhat-00001) stopped in 5095ms
