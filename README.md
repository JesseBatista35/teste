/opt/jboss/bin/standalone.conf: line 37: =org.jboss.byteman: command not found
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/lib/jvm/java-11-openjdk-11.0.19.0.7-1.el7_9.x86_64/bin/java

  JAVA_OPTS:  -Xlog:gc*:file="/opt/jboss/standalone/log/gc.log":time,uptimemillis:filecount=5,filesize=3M -Xms512m -Xmx1024m -XX:MetaspaceSize=128m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs= -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -Xbootclasspath/a:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar:/opt/jboss/modules/system/layers/base/org/jboss/log4j/logmanager/main/log4j-jboss-logmanager-1.2.0.Final-redhat-00001.jar:/opt/jboss/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dsun.util.logging.disableCallerCheck=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Djava.net.useSystemProxies=false -Dhttp.proxyHost=80 -Dhttp.proxyPort=proxy.des.caixa -Dhttps.proxyHost=80 -Dhttps.proxyPort=proxy.des.caixa -Dhttp.nonProxyHosts=localhost\|127.0.0.1\|*.caixa  --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED

=========================================================================

Jun 29, 2026 2:52:35 PM java.lang.System$LoggerFinder lambda$accessProvider$0
WARNING: Failed to instantiate LoggerFinder provider; Using default.
[0m14:52:35,966 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.0.Final-redhat-00001
[0m[0m14:52:36,565 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.12.Final-redhat-00001
[0m[0m14:52:36,571 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
[0m[0m14:52:36,768 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) starting
[0m[0m14:52:36,888 INFO  [org.jboss.vfs] (MSC service thread 1-1) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
[0mWARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.wildfly.extension.elytron.SSLDefinitions (jar:file:/opt/jboss/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.11.CP/org/wildfly/extension/elytron/main/wildfly-elytron-integration-15.0.26.Final-redhat-00001.jar!/) to method com.sun.net.ssl.internal.ssl.Provider.isFIPS()
WARNING: Please consider reporting this to the maintainers of org.wildfly.extension.elytron.SSLDefinitions
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
[0m14:52:38,768 INFO  [org.wildfly.security] (ServerService Thread Pool -- 32) ELY00001: WildFly Elytron version 1.15.16.Final-redhat-00001
[0m[0m14:52:39,265 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 35) WFLYCTL0033: Extension 'security' is deprecated and may not be supported in future versions
[0m[0m14:52:40,177 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m14:52:40,276 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 37) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m14:52:40,364 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 2) WFLYCTL0028: Attribute 'shared' in the resource at address '/subsystem=jgroups/stack=tcpping/transport=TCP' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[33m14:52:40,366 WARN  [org.jboss.as.clustering.jgroups] (ServerService Thread Pool -- 2) WFLYCLJG0030: Protocol MERGE2 is obsolete and will be auto-updated to MERGE3
[0m[33m14:52:40,368 WARN  [org.jboss.as.clustering.jgroups] (ServerService Thread Pool -- 2) WFLYCLJG0030: Protocol pbcast.NAKACK is obsolete and will be auto-updated to pbcast.NAKACK2
[0m[33m14:52:40,368 WARN  [org.jboss.as.clustering.jgroups] (ServerService Thread Pool -- 2) WFLYCLJG0030: Protocol UNICAST2 is obsolete and will be auto-updated to UNICAST3
[0m[0m14:52:40,985 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 35) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/96/ce2c946534d5142623ff2ef438fa1277ea3404/content
[0m[31m14:52:41,064 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("add") failed - address: ([("core-service" => "vault")]): org.jboss.as.server.services.security.VaultReaderException: WFLYSRV0076: Error initializing vault --  org.jboss.security.vault.SecurityVaultException: java.lang.RuntimeException: PBOX00140: Unable to get keystore (/opt/jboss/standalone/configuration/vault-des/vaultcaixa.keystore)
	at org.jboss.as.server@15.0.26.Final-redhat-00001//org.jboss.as.server.services.security.VaultReaderImpl.createVault(RuntimeVaultReader.java:159)
	at org.jboss.as.server@15.0.26.Final-redhat-00001//org.jboss.as.server.services.security.RuntimeVaultReader.createVault(RuntimeVaultReader.java:100)
	at org.jboss.as.server@15.0.26.Final-redhat-00001//org.jboss.as.server.services.security.VaultAddHandler.performRuntime(VaultAddHandler.java:96)
	at org.jboss.as.controller@15.0.26.Final-redhat-00001//org.jboss.as.controller.AbstractAddStepHandler.performRuntime(AbstractAddStepHandler.java:343)
	at org.jboss.as.controller@15.0.26.Final-redhat-00001//org.jboss.as.controller.AbstractAddStepHandler$1.execute(AbstractAddStepHandler.java:164)
	at org.jboss.as.controller@15.0.26.Final-redhat-00001//org.jboss.as.controller.AbstractOperationContext.executeStep(AbstractOperationContext.java:1047)
	at org.jboss.as.controller@15.0.26.Final-redhat-00001//org.jboss.as.controller.AbstractOperationContext.processStages(AbstractOperationContext.java:779)
	at org.jboss.as.controller@15.0.26.Final-redhat-00001//org.jboss.as.controller.AbstractOperationContext.executeOperation(AbstractOperationContext.java:468)
	at org.jboss.as.controller@15.0.26.Final-redhat-00001//org.jboss.as.controller.OperationContextImpl.executeOperation(OperationContextImpl.java:1431)
	at org.jboss.as.controller@15.0.26.Final-redhat-00001//org.jboss.as.controller.ModelControllerImpl.boot(ModelControllerImpl.java:559)
	at org.jboss.as.controller@15.0.26.Final-redhat-00001//org.jboss.as.controller.AbstractControllerService.boot(AbstractControllerService.java:546)
	at org.jboss.as.controller@15.0.26.Final-redhat-00001//org.jboss.as.controller.AbstractControllerService.boot(AbstractControllerService.java:508)
	at org.jboss.as.server@15.0.26.Final-redhat-00001//org.jboss.as.server.ServerService.boot(ServerService.java:464)
	at org.jboss.as.server@15.0.26.Final-redhat-00001//org.jboss.as.server.ServerService.boot(ServerService.java:417)
	at org.jboss.as.controller@15.0.26.Final-redhat-00001//org.jboss.as.controller.AbstractControllerService$1.run(AbstractControllerService.java:447)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.jboss.security.vault.SecurityVaultException: java.lang.RuntimeException: PBOX00140: Unable to get keystore (/opt/jboss/standalone/configuration/vault-des/vaultcaixa.keystore)
	at org.picketbox//org.picketbox.plugins.vault.PicketBoxSecurityVault.init(PicketBoxSecurityVault.java:210)
	at org.jboss.as.server@15.0.26.Final-redhat-00001//org.jboss.as.server.services.security.VaultReaderImpl.createVault(RuntimeVaultReader.java:157)
	... 15 more
Caused by: java.lang.RuntimeException: PBOX00140: Unable to get keystore (/opt/jboss/standalone/configuration/vault-des/vaultcaixa.keystore)
	at org.picketbox//org.picketbox.plugins.vault.PicketBoxSecurityVault.getKeyStore(PicketBoxSecurityVault.java:691)
	at org.picketbox//org.picketbox.plugins.vault.PicketBoxSecurityVault.init(PicketBoxSecurityVault.java:205)
	... 16 more
Caused by: java.io.FileNotFoundException: /opt/jboss/standalone/configuration/vault-des/vaultcaixa.keystore (No such file or directory)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
	at org.picketbox//org.picketbox.util.KeyStoreUtil.getKeyStore(KeyStoreUtil.java:150)
	at org.picketbox//org.picketbox.plugins.vault.PicketBoxSecurityVault.getKeyStore(PicketBoxSecurityVault.java:688)
	... 17 more

[0m[31m14:52:41,080 FATAL [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0056: Server boot has failed in an unrecoverable manner; exiting. See previous messages for details.
[0m[0m14:52:41,157 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0050: JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) stopped in 73ms
[0m
