[root@caddeapllx1945 bin]# tail -100 /logs/jboss/server.log
        java.vm.specification.vendor = Oracle Corporation
        java.vm.specification.version = 1.8
        java.vm.vendor = Red Hat, Inc.
        java.vm.version = 25.402-b06
        javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
        javax.net.ssl.trustStore = /opt/jboss-eap/standalone/configuration/caixa-truststore-azurepush-2024-acteste.jks
        javax.net.ssl.trustStorePassword = <redacted>
        jboss.home.dir = /opt/jboss-eap
        jboss.host.name = caddeapllx1945
        jboss.modules.dir = /opt/jboss-eap/modules
        jboss.modules.policy-permissions = true
        jboss.modules.system.pkgs = org.jboss.byteman,org.jboss.logmanager
        jboss.node.name = caddeapllx1945
        jboss.qualified.host.name = caddeapllx1945.agil.nprd.caixa.gov.br
        jboss.server.base.dir = /opt/jboss-eap/standalone
        jboss.server.config.dir = /opt/jboss-eap/standalone/configuration
        jboss.server.data.dir = /opt/jboss-eap/standalone/data
        jboss.server.deploy.dir = /opt/jboss-eap/standalone/data/content
        jboss.server.log.dir = /opt/jboss-eap/standalone/log
        jboss.server.name = caddeapllx1945
        jboss.server.persist.config = true
        jboss.server.temp.dir = /opt/jboss-eap/standalone/tmp
        jdk.serialFilter = maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
        line.separator =

        logging.configuration = file:/opt/jboss-eap/standalone/configuration/logging.properties
        module.path = /opt/jboss-eap/modules
        org.jboss.boot.log.file = /opt/jboss-eap/standalone/log/server.log
        org.jboss.resolver.warning = true
        os.arch = amd64
        os.name = Linux
        os.version = 5.14.0-362.8.1.el9_3.x86_64
        path.separator = :
        sun.arch.data.model = 64
        sun.boot.class.path = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.402.b06-2.el9.x86_64/jre/lib/resources.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.402.b06-2.el9.x86_64/jre/lib/rt.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.402.b06-2.el9.x86_64/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.402.b06-2.el9.x86_64/jre/lib/jsse.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.402.b06-2.el9.x86_64/jre/lib/jce.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.402.b06-2.el9.x86_64/jre/lib/charsets.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.402.b06-2.el9.x86_64/jre/lib/jfr.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.402.b06-2.el9.x86_64/jre/classes:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar
        sun.boot.library.path = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.402.b06-2.el9.x86_64/jre/lib/amd64
        sun.cpu.endian = little
        sun.cpu.isalist =
        sun.io.unicode.encoding = UnicodeLittle
        sun.java.command = /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -c standalone-full-ha.xml
        sun.java.launcher = SUN_STANDARD
        sun.jnu.encoding = UTF-8
        sun.management.compiler = HotSpot 64-Bit Tiered Compilers
        sun.os.patch.level = unknown
        sun.util.logging.disableCallerCheck = true
        user.country = BR
        user.dir = /opt/jboss-eap/bin
        user.home = /root
        user.language = pt
        user.name = root
        user.timezone = America/Sao_Paulo
2026-06-16 14:44:02,867 DEBUG [org.jboss.as.config] (MSC service thread 1-2) Argumentos da VM: -D[Standalone] -verbose:gc -Xloggc:/opt/jboss-eap/standalone/log/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-azurepush-2024-acteste.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dorg.jboss.boot.log.file=/opt/jboss-eap/standalone/log/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties
2026-06-16 14:44:03,448 INFO  [org.wildfly.security] (ServerService Thread Pool -- 32) ELY00001: WildFly Elytron version 1.15.21.Final-redhat-00001
2026-06-16 14:44:03,692 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 34) WFLYCTL0033: A extensão 'security' é obsoleta e talvez não seja suportada em versões futuras
2026-06-16 14:44:03,901 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/core-service=management/management-interface=http-interface', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
2026-06-16 14:44:03,942 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 6) WFLYCTL0028: O atributo 'shared' no recurso, no endereço '/subsystem=jgroups/stack=tcpping/transport=TCP', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
2026-06-16 14:44:03,944 WARN  [org.jboss.as.clustering.jgroups] (ServerService Thread Pool -- 6) WFLYCLJG0030: O protocolo MERGE2 é obsoleto e será atualizado automaticamente para MERGE3
2026-06-16 14:44:03,952 WARN  [org.jboss.as.clustering.jgroups] (ServerService Thread Pool -- 6) WFLYCLJG0030: O protocolo pbcast.NAKACK é obsoleto e será atualizado automaticamente para pbcast.NAKACK2
2026-06-16 14:44:03,953 WARN  [org.jboss.as.clustering.jgroups] (ServerService Thread Pool -- 6) WFLYCLJG0030: O protocolo UNICAST2 é obsoleto e será atualizado automaticamente para UNICAST3
2026-06-16 14:44:03,962 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: A nova tentativa implantação de wmq.jmsra.rar falhou
2026-06-16 14:44:03,963 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: A nova tentativa implantação de applicationinsights-agent.jar falhou
2026-06-16 14:44:03,963 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: A nova tentativa implantação de simpg.war falhou
2026-06-16 14:44:03,963 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 5) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/subsystem=undertow/server=default-server/https-listener=https', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
2026-06-16 14:44:04,540 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([("core-service" => "vault")]): org.jboss.as.server.services.security.VaultReaderException: WFLYSRV0076: Erro ao inicializar o cofre -- org.jboss.security.vault.SecurityVaultException: java.lang.RuntimeException: PBOX00140: Unable to get keystore (/opt/jboss-eap/standalone/configuration/vault-des/vaultcaixa.keystore)
        at org.jboss.as.server.services.security.VaultReaderImpl.createVault(RuntimeVaultReader.java:159)
        at org.jboss.as.server.services.security.RuntimeVaultReader.createVault(RuntimeVaultReader.java:100)
        at org.jboss.as.server.services.security.VaultAddHandler.performRuntime(VaultAddHandler.java:96)
        at org.jboss.as.controller.AbstractAddStepHandler.performRuntime(AbstractAddStepHandler.java:343)
        at org.jboss.as.controller.AbstractAddStepHandler$1.execute(AbstractAddStepHandler.java:164)
        at org.jboss.as.controller.AbstractOperationContext.executeStep(AbstractOperationContext.java:1063)
        at org.jboss.as.controller.AbstractOperationContext.processStages(AbstractOperationContext.java:784)
        at org.jboss.as.controller.AbstractOperationContext.executeOperation(AbstractOperationContext.java:470)
        at org.jboss.as.controller.OperationContextImpl.executeOperation(OperationContextImpl.java:1430)
        at org.jboss.as.controller.ModelControllerImpl.boot(ModelControllerImpl.java:559)
        at org.jboss.as.controller.AbstractControllerService.boot(AbstractControllerService.java:546)
        at org.jboss.as.controller.AbstractControllerService.boot(AbstractControllerService.java:508)
        at org.jboss.as.server.ServerService.boot(ServerService.java:462)
        at org.jboss.as.server.ServerService.boot(ServerService.java:415)
        at org.jboss.as.controller.AbstractControllerService$1.run(AbstractControllerService.java:447)
        at java.lang.Thread.run(Thread.java:750)
Caused by: org.jboss.security.vault.SecurityVaultException: java.lang.RuntimeException: PBOX00140: Unable to get keystore (/opt/jboss-eap/standalone/configuration/vault-des/vaultcaixa.keystore)
        at org.picketbox.plugins.vault.PicketBoxSecurityVault.init(PicketBoxSecurityVault.java:210)
        at org.jboss.as.server.services.security.VaultReaderImpl.createVault(RuntimeVaultReader.java:157)
        ... 15 more
Caused by: java.lang.RuntimeException: PBOX00140: Unable to get keystore (/opt/jboss-eap/standalone/configuration/vault-des/vaultcaixa.keystore)
        at org.picketbox.plugins.vault.PicketBoxSecurityVault.getKeyStore(PicketBoxSecurityVault.java:691)
        at org.picketbox.plugins.vault.PicketBoxSecurityVault.init(PicketBoxSecurityVault.java:205)
        ... 16 more
Caused by: java.io.IOException: Keystore was tampered with, or password was incorrect
        at com.sun.crypto.provider.JceKeyStore.engineLoad(JceKeyStore.java:881)
        at java.security.KeyStore.load(KeyStore.java:1445)
        at org.picketbox.util.KeyStoreUtil.getKeyStore(KeyStoreUtil.java:201)
        at org.picketbox.util.KeyStoreUtil.getKeyStore(KeyStoreUtil.java:151)
        at org.picketbox.plugins.vault.PicketBoxSecurityVault.getKeyStore(PicketBoxSecurityVault.java:688)
        ... 17 more
Caused by: java.security.UnrecoverableKeyException: Password verification failed
        ... 22 more

2026-06-16 14:44:04,553 FATAL [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0056: A inicialização do servidor falhou numa maneira irrecuperável: encerrando. Consulte mensagens anteriores para maiores detalhes.
2026-06-16 14:44:04,564 INFO  [org.jboss.as] (MSC service thread 1-3) WFLYSRV0050: JBoss EAP 7.4.15.GA (WildFly Core 15.0.33.Final-redhat-00001) interrompido em 6ms
[root@caddeapllx1945 bin]# ./standalone.sh -c standalone-full-ha.xml 2>&1 |head -100
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss-eap

  JAVA: java

  JAVA_OPTS:  -verbose:gc -Xloggc:"/opt/jboss-eap/standalone/log/gc.log" -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter="maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000" -Xms1024m -Xmx2048m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-azurepush-2024-acteste.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager

=========================================================================

[root@caddeapllx1945 bin]#
