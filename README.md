
[spssodr1@crjtqapllx036 bin]$ ps -ef | grep 111393
spssodr1 111955 111147  0 10:26 pts/1    00:00:00 grep --color=auto 111393
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$ cat /tmp/jboss_start.log
nohup: ignoring input
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/open/sso/7.3.0

  JAVA: /opt/open/java/jdk1.8.0_121/bin/java

  JAVA_OPTS:  -server -verbose:gc -Xloggc:/opt/open/sso/7.3.0/standalone/log/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms32768m -Xmx32768m -XX:MetaspaceSize=1024m -XX:MaxMetaspaceSize=1024m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -DhttpRecaptchaProxyHost="proxydes.caixa" -DhttpRecaptchaProxyPort="80" -DhttpRecaptchaProxyScheme=http -Dhttps.proxyHost="proxydes.caixa" -Dhttps.proxyPort="80" -Dhttp.nonProxyHosts="*.caixa|*.caixa.gov.br|localhost" -Dhttp.proxyHost="proxydes.caixa" -Dhttp.proxyPort="80" -Dftp.proxyHost="proxydes.caixa" -Dftp.proxyPort="80" -javaagent:/infra_app/config/appinsights/applicationinsights-agent-3.3.1.jar

=========================================================================

10:24:23,441 INFO  [org.jboss.modules] (main) JBoss Modules version 1.8.8.Final-redhat-00001
10:24:23,864 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.5.Final-redhat-00001
10:24:23,898 INFO  [org.jboss.threads] (main) JBoss Threads version 2.3.2.Final-redhat-1
10:24:24,060 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: Red Hat Single Sign-On 7.3.3.GA (WildFly Core 6.0.15.Final-redhat-00001) starting
10:24:24,498 WARN  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0456: System property http.nonProxyHosts=*.caixa|*.caixa.gov.br|localhost already set. It's being overridden by new value *.caixa|*.caixa.gov.br|localhost|fnlogeventos-des.azurewebsites.net
10:24:24,858 INFO  [org.wildfly.security] (ServerService Thread Pool -- 21) ELY00001: WildFly Elytron version 1.6.3.Final-redhat-00001
10:24:25,290 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=native-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
10:24:25,291 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
10:24:25,313 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 26) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
10:24:26,370 INFO  [org.jboss.security] (Controller Boot Thread) PBOX00361: Default Security Vault Implementation Initialized and Ready
10:24:26,385 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
10:24:26,390 INFO  [org.xnio] (MSC service thread 1-2) XNIO version 3.6.6.Final-redhat-00001
10:24:26,396 INFO  [org.xnio.nio] (MSC service thread 1-2) XNIO NIO Implementation Version 3.6.6.Final-redhat-00001
10:24:26,410 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-4) MSC000001: Failed to start service org.wildfly.network.interface.management: org.jboss.msc.service.StartException in service org.wildfly.network.interface.management: WFLYSRV0082: failed to resolve interface management
        at org.jboss.as.server.services.net.NetworkInterfaceService.start(NetworkInterfaceService.java:96)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1378)
        at java.lang.Thread.run(Thread.java:745)

10:24:26,410 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-1) MSC000001: Failed to start service org.wildfly.network.interface.public: org.jboss.msc.service.StartException in service org.wildfly.network.interface.public: WFLYSRV0082: failed to resolve interface public
        at org.jboss.as.server.services.net.NetworkInterfaceService.start(NetworkInterfaceService.java:96)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1738)
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1700)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1558)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1985)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1487)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1378)
        at java.lang.Thread.run(Thread.java:745)

10:24:26,427 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 51) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
10:24:26,432 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 45) WFLYNAM0001: Activating Naming Subsystem
10:24:26,434 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 36) WFLYCLINF0001: Activating Infinispan subsystem.
10:24:26,437 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 37) WFLYIO001: Worker 'default' has auto-configured to 32 core threads with 256 task threads based on your 16 available processors
10:24:26,441 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 49) WFLYSEC0002: Activating Security Subsystem
10:24:26,452 INFO  [org.jboss.as.security] (MSC service thread 1-7) WFLYSEC0001: Current PicketBox version=5.0.3.Final-redhat-3
10:24:26,460 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-6) WFLYMAIL0002: Unbound mail session [java:jboss/mail/Default]
10:24:26,477 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 38) WFLYRS0016: RESTEasy version 3.6.1.SP6-redhat-00001
10:24:26,490 INFO  [org.jboss.as.connector] (MSC service thread 1-6) WFLYJCA0009: Starting JCA Subsystem (WildFly/IronJacamar 1.4.16.Final-redhat-00001)
10:24:26,537 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-6) WFLYUT0003: Undertow 2.0.22.Final-redhat-00001 starting
10:24:26,555 INFO  [org.jboss.as.naming] (MSC service thread 1-3) WFLYNAM0003: Starting Naming Service
10:24:26,556 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-3) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
10:24:26,567 INFO  [org.jboss.remoting] (MSC service thread 1-2) JBoss Remoting version 5.0.12.Final-redhat-00001
10:24:26,683 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 64 (per class), which is derived from the number of CPUs on this host.
10:24:26,683 INFO  [org.jboss.as.ejb3] (MSC service thread 1-5) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 256 (per class), which is derived from thread worker pool sizing.
10:24:26,711 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 31) WFLYJCA0004: Deploying JDBC-compliant driver class oracle.jdbc.driver.OracleDriver (version 11.2)
10:24:26,714 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-4) WFLYJCA0018: Started Driver service with driver-name = oracle
10:24:26,730 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 52) WFLYUT0014: Creating file handler for path '/opt/open/sso/7.3.0/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
10:24:26,735 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 31) WFLYJCA0004: Deploying JDBC-compliant driver class org.h2.Driver (version 1.4)
10:24:26,736 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-1) WFLYJCA0018: Started Driver service with driver-name = h2
10:24:26,743 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) WFLYUT0012: Started server default-server.
10:24:26,748 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0018: Host default-host starting
10:24:26,751 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 52) WFLYUT0014: Creating file handler for path '/opt/open/sso/7.3.0/suporte' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
10:24:26,764 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-4) WFLYJCA0010: Unbound data source [java:jboss/datasources/oraset]
10:24:26,764 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0010: Unbound data source [java:jboss/datasources/ExampleDS]
10:24:26,778 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-3) WFLYJCA0010: Unbound data source [java:jboss/datasources/KeycloakDS]
10:24:26,876 INFO  [org.jboss.as.patching] (MSC service thread 1-7) WFLYPAT0050: Red Hat Single Sign-On cumulative patch ID is: rh-sso-7.3.3.CP, one-off patches include: none
10:24:26,888 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-4) WFLYDM0111: Keystore /opt/open/sso/7.3.0/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self signed certificate for host localhost
10:24:26,912 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0027: Starting deployment of "OTPCaixaCond.jar" (runtime-name: "OTPCaixaCond.jar")
10:24:26,912 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0027: Starting deployment of "resource-provider-jar-with-dependencies.jar" (runtime-name: "resource-provider-jar-with-dependencies.jar")
10:24:26,912 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0027: Starting deployment of "directgrantpassword-jar-with-dependencies.jar" (runtime-name: "directgrantpassword-jar-with-dependencies.jar")
10:24:26,912 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0027: Starting deployment of "user-storage-jpa-siper-jar-with-dependencies.jar" (runtime-name: "user-storage-jpa-siper-jar-with-dependencies.jar")
10:24:26,912 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0027: Starting deployment of "keycloak-server.war" (runtime-name: "keycloak-server.war")
10:24:26,912 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0027: Starting deployment of "eventExternal-jar-with-dependencies.jar" (runtime-name: "eventExternal-jar-with-dependencies.jar")
10:24:26,912 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Starting deployment of "siset-user-session-provider.jar" (runtime-name: "siset-user-session-provider.jar")
10:24:26,915 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0027: Starting deployment of "validaLogin-jar-with-dependencies.jar" (runtime-name: "validaLogin-jar-with-dependencies.jar")
10:24:26,915 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Starting deployment of "BrowserPassword-jar-with-dependencies.jar" (runtime-name: "BrowserPassword-jar-with-dependencies.jar")
10:24:26,915 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0027: Starting deployment of "loginCaixa-jar-with-dependencies.jar" (runtime-name: "loginCaixa-jar-with-dependencies.jar")
10:24:26,915 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0027: Starting deployment of "servico.war" (runtime-name: "servico.war")
10:24:26,917 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-3) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/open/sso/7.3.0/standalone/deployments
10:24:28,223 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/TriggeringEventEvaluator.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,224 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/LoggingEvent.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,224 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/RootCategory.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,225 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/ThrowableRendererSupport.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,225 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/RendererSupport.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,227 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/NullWriter.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,227 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/RepositorySelector.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,227 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/NOPLoggerRepository.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,228 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/NOPLogger.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,228 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/ThrowableRenderer.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,228 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/VectorWriter.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,229 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/OptionHandler.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,229 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/RootLogger.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,230 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/spi/ThrowableInformation.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,234 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/TriggeringEventEvaluator.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,235 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/LoggingEvent.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,235 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/RootCategory.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,236 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/ThrowableRendererSupport.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,236 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/varia/LevelMatchFilter.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,236 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/RendererSupport.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,237 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/varia/HUPNode.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,237 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/NullWriter.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,237 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/varia/HUP.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,242 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/RepositorySelector.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,242 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/varia/LevelRangeFilter.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,243 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/NOPLoggerRepository.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,243 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/varia/Roller.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,243 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/NOPLogger.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,243 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/varia/NullAppender.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,244 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/ThrowableRenderer.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,244 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/varia/DenyAllFilter.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,244 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/VectorWriter.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,244 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/varia/FallbackErrorHandler.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,244 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/varia/ReloadingPropertyConfigurator.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,244 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/OptionHandler.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,244 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0003: Could not index class org/apache/log4j/varia/ExternallyRolledFileAppender.class at /content/directgrantpassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,245 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/RootLogger.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,245 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/spi/ThrowableInformation.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,251 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/varia/LevelMatchFilter.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,251 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/varia/HUPNode.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,252 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/varia/HUP.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,253 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/varia/LevelRangeFilter.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,253 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/varia/Roller.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,253 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/varia/NullAppender.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,253 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/varia/DenyAllFilter.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,253 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/varia/FallbackErrorHandler.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,254 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/varia/ReloadingPropertyConfigurator.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,254 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0003: Could not index class org/apache/log4j/varia/ExternallyRolledFileAppender.class at /content/BrowserPassword-jar-with-dependencies.jar: java.io.EOFException
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

10:24:28,829 INFO  [org.jboss.as.jpa] (MSC service thread 1-3) WFLYJPA0002: Read persistence.xml for user-storage-jpa-siper
10:24:29,412 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jaxb-core.jar in /content/servico.war/WEB-INF/lib/jaxb-impl-2.3.0.jar  does not point to a valid jar for a Class-Path reference.
10:24:29,413 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0059: Class Path entry jaxb-api.jar in /content/servico.war/WEB-INF/lib/jaxb-core-2.3.0.jar  does not point to a valid jar for a Class-Path reference.
10:24:29,524 INFO  [org.jboss.as.jpa] (MSC service thread 1-5) WFLYJPA0002: Read persistence.xml for servico-dispositivo
10:24:29,530 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("add") failed - address: ([("interface" => "management")]) - failure description: {"WFLYCTL0080: Failed services" => {"org.wildfly.network.interface.management" => "WFLYSRV0082: failed to resolve interface management"}}
10:24:29,530 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("add") failed - address: ([("interface" => "public")]) - failure description: {"WFLYCTL0080: Failed services" => {"org.wildfly.network.interface.public" => "WFLYSRV0082: failed to resolve interface public"}}
10:24:29,554 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0028: Stopped deployment user-storage-jpa-siper-jar-with-dependencies.jar (runtime-name: user-storage-jpa-siper-jar-with-dependencies.jar) in 16ms
10:24:29,554 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0028: Stopped deployment eventExternal-jar-with-dependencies.jar (runtime-name: eventExternal-jar-with-dependencies.jar) in 15ms
10:24:29,554 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0028: Stopped deployment keycloak-server.war (runtime-name: keycloak-server.war) in 12ms
10:24:29,554 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0028: Stopped deployment OTPCaixaCond.jar (runtime-name: OTPCaixaCond.jar) in 15ms
10:24:29,554 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0028: Stopped deployment directgrantpassword-jar-with-dependencies.jar (runtime-name: directgrantpassword-jar-with-dependencies.jar) in 13ms
10:24:29,554 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0028: Stopped deployment loginCaixa-jar-with-dependencies.jar (runtime-name: loginCaixa-jar-with-dependencies.jar) in 13ms
10:24:29,554 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0028: Stopped deployment siset-user-session-provider.jar (runtime-name: siset-user-session-provider.jar) in 12ms
10:24:29,555 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0028: Stopped deployment resource-provider-jar-with-dependencies.jar (runtime-name: resource-provider-jar-with-dependencies.jar) in 13ms
10:24:29,556 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0028: Stopped deployment validaLogin-jar-with-dependencies.jar (runtime-name: validaLogin-jar-with-dependencies.jar) in 17ms
10:24:29,561 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0028: Stopped deployment BrowserPassword-jar-with-dependencies.jar (runtime-name: BrowserPassword-jar-with-dependencies.jar) in 19ms
10:24:29,585 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0028: Stopped deployment servico.war (runtime-name: servico.war) in 44ms
10:24:29,600 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-7) WFLYMAIL0002: Unbound mail session [java:jboss/mail/Default]
10:24:29,600 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-8) WFLYJCA0019: Stopped Driver service with driver-name = oracle
10:24:29,598 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0021: Deploy of deployment "keycloak-server.war" was rolled back with the following failure message: undefined
10:24:29,600 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-5) WFLYJCA0019: Stopped Driver service with driver-name = h2
10:24:29,596 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0021: Deploy of deployment "BrowserPassword-jar-with-dependencies.jar" was rolled back with the following failure message: undefined
10:24:29,604 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0019: Host default-host stopping
10:24:29,604 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0021: Deploy of deployment "servico.war" was rolled back with the following failure message: undefined
10:24:29,605 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0021: Deploy of deployment "OTPCaixaCond.jar" was rolled back with the following failure message: undefined
10:24:29,605 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0021: Deploy of deployment "validaLogin-jar-with-dependencies.jar" was rolled back with the following failure message: undefined
10:24:29,606 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0021: Deploy of deployment "resource-provider-jar-with-dependencies.jar" was rolled back with the following failure message: undefined
10:24:29,606 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0004: Undertow 2.0.22.Final-redhat-00001 stopping
10:24:29,606 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0021: Deploy of deployment "siset-user-session-provider.jar" was rolled back with the following failure message: undefined
10:24:29,606 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0021: Deploy of deployment "loginCaixa-jar-with-dependencies.jar" was rolled back with the following failure message: undefined
10:24:29,606 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0021: Deploy of deployment "directgrantpassword-jar-with-dependencies.jar" was rolled back with the following failure message: undefined
10:24:29,606 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0021: Deploy of deployment "user-storage-jpa-siper-jar-with-dependencies.jar" was rolled back with the following failure message: undefined
10:24:29,606 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0021: Deploy of deployment "eventExternal-jar-with-dependencies.jar" was rolled back with the following failure message: undefined
10:24:29,636 FATAL [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0056: Server boot has failed in an unrecoverable manner; exiting. See previous messages for details.
10:24:29,655 INFO  [org.jboss.as] (MSC service thread 1-8) WFLYSRV0050: Red Hat Single Sign-On 7.3.3.GA (WildFly Core 6.0.15.Final-redhat-00001) stopped in 8ms
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$ ls -la /infra_app/logs/siset/ | grep -i crjtqapllx036
-rw-r--r--  1 spssodr1 singlesignon          0 Sep 10 10:24 crjtqapllx036.log
-rw-r--r--  1 spssodr1 singlesignon      80191 Sep 10 10:24 server-crjtqapllx036.log
[spssodr1@crjtqapllx036 bin]$
