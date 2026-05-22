Criando diretorio '/opt/jboss/standalone/configuration/.secrets'...
Configuracao do vault realizada
Arquivo secrets.properties encontrado, carregando propriedades...
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/java/latest/bin/java

  JAVA_OPTS:  -verbose:gc -Xloggc:"/opt/jboss/standalone/log/gc.log" -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djavax.net.ssl.trustStore=cacerts-sicrf-des.jks -Djavax.net.ssl.trustStorePassword=changeit -Djavax.net.ssl.trustStoreType=jks -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.0.7.Final-redhat-1.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Djava.net.useSystemProxies=false -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=localhost\|127.0.0.1\|*.caixa\|*.caixa.gov.br\|*.sicfd-des.svc\|*.sicfd-tqs.svc

=========================================================================

[0m18:47:47,897 INFO  [org.jboss.modules] (main) JBoss Modules version 1.6.7.Final-redhat-00001
[0m[33m18:47:48,407 WARN  [org.jboss.as.server] (main) WFLYSRV0266: Server home is set to '/opt/jboss/standalone', but server real home is '/opt/jboss-eap-7.1/standalone' - unpredictable results may occur.
[0m[0m18:47:48,418 INFO  [org.jboss.msc] (main) JBoss MSC version 1.2.7.SP1-redhat-1
[0m[0m18:47:48,535 INFO  [org.jboss.as] (MSC service thread 1-8) WFLYSRV0049: JBoss EAP 7.1.6.GA (WildFly Core 3.0.21.Final-redhat-00001) starting
[0m[0m18:47:48,603 INFO  [org.jboss.vfs] (MSC service thread 1-3) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
[0m[0m18:47:51,413 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m18:47:51,981 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 21) WFLYDR0001: Content added at location /opt/jboss-eap-7.1/standalone/data/content/f0/c0404a3c4a55d463124d634898f0febff04caf/content
[0m[31m18:47:52,193 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("add") failed - address: ([("core-service" => "vault")]): org.jboss.as.server.services.security.VaultReaderException: WFLYSRV0076: Error initializing vault --  org.jboss.security.vault.SecurityVaultException: java.lang.RuntimeException: PBOX00140: Unable to get keystore (/opt/jboss/standalone/configuration/jboss.keystore)
	at org.jboss.as.server.services.security.RuntimeVaultReader.createVault(RuntimeVaultReader.java:93) [wildfly-server-3.0.21.Final-redhat-00001.jar:3.0.21.Final-redhat-00001]
	at org.jboss.as.server.services.security.VaultAddHandler.performRuntime(VaultAddHandler.java:84) [wildfly-server-3.0.21.Final-redhat-00001.jar:3.0.21.Final-redhat-00001]
	at org.jboss.as.controller.AbstractAddStepHandler.performRuntime(AbstractAddStepHandler.java:337) [wildfly-controller-3.0.21.Final-redhat-00001.jar:3.0.21.Final-redhat-00001]
	at org.jboss.as.controller.AbstractAddStepHandler$1.execute(AbstractAddStepHandler.java:151) [wildfly-controller-3.0.21.Final-redhat-00001.jar:3.0.21.Final-redhat-00001]
	at org.jboss.as.controller.AbstractOperationContext.executeStep(AbstractOperationContext.java:982) [wildfly-controller-3.0.21.Final-redhat-00001.jar:3.0.21.Final-redhat-00001]
	at org.jboss.as.controller.AbstractOperationContext.processStages(AbstractOperationContext.java:726) [wildfly-controller-3.0.21.Final-redhat-00001.jar:3.0.21.Final-redhat-00001]
	at org.jboss.as.controller.AbstractOperationContext.executeOperation(AbstractOperationContext.java:450) [wildfly-controller-3.0.21.Final-redhat-00001.jar:3.0.21.Final-redhat-00001]
	at org.jboss.as.controller.OperationContextImpl.executeOperation(OperationContextImpl.java:1402) [wildfly-controller-3.0.21.Final-redhat-00001.jar:3.0.21.Final-redhat-00001]
	at org.jboss.as.controller.ModelControllerImpl.boot(ModelControllerImpl.java:516) [wildfly-controller-3.0.21.Final-redhat-00001.jar:3.0.21.Final-redhat-00001]
	at org.jboss.as.controller.AbstractControllerService.boot(AbstractControllerService.java:468) [wildfly-controller-3.0.21.Final-redhat-00001.jar:3.0.21.Final-redhat-00001]
	at org.jboss.as.controller.AbstractControllerService.boot(AbstractControllerService.java:430) [wildfly-controller-3.0.21.Final-redhat-00001.jar:3.0.21.Final-redhat-00001]
	at org.jboss.as.server.ServerService.boot(ServerService.java:437) [wildfly-server-3.0.21.Final-redhat-00001.jar:3.0.21.Final-redhat-00001]
	at org.jboss.as.server.ServerService.boot(ServerService.java:396) [wildfly-server-3.0.21.Final-redhat-00001.jar:3.0.21.Final-redhat-00001]
	at org.jboss.as.controller.AbstractControllerService$1.run(AbstractControllerService.java:370) [wildfly-controller-3.0.21.Final-redhat-00001.jar:3.0.21.Final-redhat-00001]
	at java.lang.Thread.run(Thread.java:748) [rt.jar:1.8.0_301]
Caused by: org.jboss.security.vault.SecurityVaultException: java.lang.RuntimeException: PBOX00140: Unable to get keystore (/opt/jboss/standalone/configuration/jboss.keystore)
	at org.picketbox.plugins.vault.PicketBoxSecurityVault.init(PicketBoxSecurityVault.java:210) [picketbox-5.0.3.Final-redhat-3.jar:5.0.3.Final-redhat-3]
	at org.jboss.as.server.services.security.RuntimeVaultReader.createVault(RuntimeVaultReader.java:91) [wildfly-server-3.0.21.Final-redhat-00001.jar:3.0.21.Final-redhat-00001]
	... 14 more
Caused by: java.lang.RuntimeException: PBOX00140: Unable to get keystore (/opt/jboss/standalone/configuration/jboss.keystore)
	at org.picketbox.plugins.vault.PicketBoxSecurityVault.getKeyStore(PicketBoxSecurityVault.java:691) [picketbox-5.0.3.Final-redhat-3.jar:5.0.3.Final-redhat-3]
	at org.picketbox.plugins.vault.PicketBoxSecurityVault.init(PicketBoxSecurityVault.java:205) [picketbox-5.0.3.Final-redhat-3.jar:5.0.3.Final-redhat-3]
	... 15 more
Caused by: java.io.FileNotFoundException: /opt/jboss/standalone/configuration/jboss.keystore (No such file or directory)
	at java.io.FileInputStream.open0(Native Method) [rt.jar:1.8.0_301]
	at java.io.FileInputStream.open(FileInputStream.java:195) [rt.jar:1.8.0_301]
	at java.io.FileInputStream.<init>(FileInputStream.java:138) [rt.jar:1.8.0_301]
	at org.picketbox.util.KeyStoreUtil.getKeyStore(KeyStoreUtil.java:150) [picketbox-5.0.3.Final-redhat-3.jar:5.0.3.Final-redhat-3]
	at org.picketbox.plugins.vault.PicketBoxSecurityVault.getKeyStore(PicketBoxSecurityVault.java:688) [picketbox-5.0.3.Final-redhat-3.jar:5.0.3.Final-redhat-3]
	... 16 more

[0m[31m18:47:52,278 FATAL [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0056: Server boot has failed in an unrecoverable manner; exiting. See previous messages for details.
[0m[0m18:47:52,291 INFO  [org.jboss.as] (MSC service thread 1-5) WFLYSRV0050: JBoss EAP 7.1.6.GA (WildFly Core 3.0.21.Final-redhat-00001) stopped in 8ms
[0m
