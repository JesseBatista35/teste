[root@caddeapllx2484 sicmu-intranet-update]# tail -900f server.log
2026-06-11 08:34:50,025 ERROR [org.jboss.modcluster] (UndertowEventHandlerAdapterService - 1) MODCLUSTER000040: Failed to parse response header from /127.0.0.1:6666 for INFO command: java.lang.NumberFormatException: For input string: "/"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:569)
        at java.lang.Integer.parseInt(Integer.java:615)
        at org.jboss.modcluster.mcmp.impl.DefaultMCMPHandler.sendRequest(DefaultMCMPHandler.java:585)
        at org.jboss.modcluster.mcmp.impl.DefaultMCMPHandler.status(DefaultMCMPHandler.java:336)
        at org.jboss.modcluster.mcmp.impl.DefaultMCMPHandler.status(DefaultMCMPHandler.java:315)
        at org.jboss.modcluster.ModClusterService.status(ModClusterService.java:414)
        at org.wildfly.mod_cluster.undertow.UndertowEventHandlerAdapterService.run(UndertowEventHandlerAdapterService.java:180)
        at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
        at java.util.concurrent.FutureTask.runAndReset(FutureTask.java:308)
        at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.access$301(ScheduledThreadPoolExecutor.java:180)
        at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:294)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
        at org.jboss.as.clustering.context.ContextReferenceExecutor.execute(ContextReferenceExecutor.java:49)
        at org.jboss.as.clustering.context.ContextualExecutor$1.run(ContextualExecutor.java:70)
        at java.lang.Thread.run(Thread.java:748)
        at org.jboss.threads.JBossThread.run(JBossThread.java:513)

2026-06-11 08:34:50,026 ERROR [org.jboss.modcluster] (UndertowEventHandlerAdapterService - 1) MODCLUSTER000042: Error null sending INFO command to /127.0.0.1:6666, configuration will be reset: null
2026-06-11 11:08:08,334 INFO  [org.jboss.modules] (CLI command executor) JBoss Modules version 1.12.0.Final-redhat-00001
2026-06-11 11:08:08,375 INFO  [org.jboss.msc] (CLI command executor) JBoss MSC version 1.4.12.Final-redhat-00001
2026-06-11 11:08:08,381 INFO  [org.jboss.threads] (CLI command executor) JBoss Threads version 2.4.0.Final-redhat-00001
2026-06-11 11:08:08,498 INFO  [org.jboss.as] (MSC service thread 1-1) WFLYSRV0049: Inicializando JBoss EAP 7.4.8.GA (WildFly Core 15.0.19.Final-redhat-00001)
2026-06-11 11:08:08,499 DEBUG [org.jboss.as.config] (MSC service thread 1-1) Propriedades de sistema configurado:
        awt.toolkit = sun.awt.X11.XToolkit
        com.ibm.jsse2.overrideDefaultTLS = true
        file.encoding = UTF-8
        file.encoding.pkg = sun.io
        file.separator = /
        java.awt.graphicsenv = sun.awt.X11GraphicsEnvironment
        java.awt.headless = true
        java.awt.printerjob = sun.print.PSPrinterJob
        java.class.path = /opt/jboss-eap/jboss-modules.jar
        java.class.version = 52.0
        java.endorsed.dirs = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-1.el7.x86_64/jre/lib/endorsed
        java.ext.dirs = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-1.el7.x86_64/jre/lib/ext:/usr/java/packages/lib/ext
        java.home = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-1.el7.x86_64/jre
        java.io.tmpdir = /tmp
        java.library.path = /usr/java/packages/lib/amd64:/usr/lib64:/lib64:/lib:/usr/lib
        java.runtime.name = OpenJDK Runtime Environment
        java.runtime.version = 1.8.0_262-b10
        java.specification.name = Java Platform API Specification
        java.specification.vendor = Oracle Corporation
        java.specification.version = 1.8
        java.util.logging.manager = org.jboss.logmanager.LogManager
        java.vendor = Oracle Corporation
        java.vendor.url = http://java.oracle.com/
        java.vendor.url.bug = http://bugreport.sun.com/bugreport/
        java.version = 1.8.0_262
        java.vm.info = mixed mode
        java.vm.name = OpenJDK 64-Bit Server VM
        java.vm.specification.name = Java Virtual Machine Specification
        java.vm.specification.vendor = Oracle Corporation
        java.vm.specification.version = 1.8
        java.vm.vendor = Oracle Corporation
        java.vm.version = 25.262-b10
        jboss.home.dir = /opt/jboss-eap
        jboss.host.name = caddeapllx2484
        jboss.modules.dir = /opt/jboss-eap/modules
        jboss.modules.system.pkgs = com.sun.java.swing
        jboss.node.name = caddeapllx2484
        jboss.qualified.host.name = caddeapllx2484.agil.nprd.caixa.gov.br
        jboss.server.base.dir = /opt/jboss-eap/standalone
        jboss.server.config.dir = /opt/jboss-eap/standalone/configuration
        jboss.server.content.dir = /opt/jboss-eap/standalone/data/content
        jboss.server.data.dir = /opt/jboss-eap/standalone/data
        jboss.server.deploy.dir = /opt/jboss-eap/standalone/data/content
        jboss.server.log.dir = /opt/jboss-eap/standalone/log
        jboss.server.name = caddeapllx2484
        jboss.server.persist.config = true
        jboss.server.temp.dir = /opt/jboss-eap/standalone/tmp
        line.separator =

        logging.configuration = file:/opt/jboss-eap/bin/jboss-cli-logging.properties
        module.path = /opt/jboss-eap/modules
        org.jboss.boot.log.file = /opt/jboss-eap/standalone/log/server.log
        org.jboss.resolver.warning = true
        org.wildfly.logging.embedded = false
        os.arch = amd64
        os.name = Linux
        os.version = 3.10.0-1160.el7.x86_64
        path.separator = :
        sun.arch.data.model = 64
        sun.boot.class.path = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-1.el7.x86_64/jre/lib/resources.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-1.el7.x86_64/jre/lib/rt.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-1.el7.x86_64/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-1.el7.x86_64/jre/lib/jsse.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-1.el7.x86_64/jre/lib/jce.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-1.el7.x86_64/jre/lib/charsets.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-1.el7.x86_64/jre/lib/jfr.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-1.el7.x86_64/jre/classes
        sun.boot.library.path = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-1.el7.x86_64/jre/lib/amd64
        sun.cpu.endian = little
        sun.cpu.isalist =
        sun.io.unicode.encoding = UnicodeLittle
        sun.java.command = /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.cli --file=/tmp/src/jboss-custom.cli
        sun.java.launcher = SUN_STANDARD
        sun.jnu.encoding = UTF-8
        sun.management.compiler = HotSpot 64-Bit Tiered Compilers
        sun.os.patch.level = unknown
        user.country = BR
        user.dir = /opt/jboss-eap/bin
        user.home = /root
        user.language = pt
        user.name = root
        user.timezone = America/Sao_Paulo
2026-06-11 11:08:08,499 DEBUG [org.jboss.as.config] (MSC service thread 1-1) Argumentos da VM: -Djboss.modules.system.pkgs=com.sun.java.swing -Dcom.ibm.jsse2.overrideDefaultTLS=true -Dlogging.configuration=file:/opt/jboss-eap/bin/jboss-cli-logging.properties
2026-06-11 11:08:09,262 INFO  [org.wildfly.security] (ServerService Thread Pool -- 25) ELY00001: WildFly Elytron version 1.15.14.Final-redhat-00001
2026-06-11 11:08:09,466 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 7) WFLYCTL0033: A extensão 'security' é obsoleta e talvez não seja suportada em versões futuras
2026-06-11 11:08:09,721 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/core-service=management/management-interface=http-interface', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
2026-06-11 11:08:09,824 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/subsystem=undertow/server=default-server/https-listener=https', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
2026-06-11 11:08:09,924 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY00023: O arquivo '/opt/jboss-eap/standalone/configuration/application.keystore' da KeyStore não existe. Usado em branco.
2026-06-11 11:08:09,933 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY01084: KeyStore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado; ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2026-06-11 11:08:09,953 INFO  [org.jboss.as.patching] (MSC service thread 1-1) WFLYPAT0050: A ID de patch cumulativo de JBoss EAP é jboss-eap-7.4.8.CP, os patches únicos incluem: none
2026-06-11 11:08:09,984 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-4) WFLYDM0111: Keystore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado. Ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2026-06-11 11:08:10,084 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Retomando servidor
2026-06-11 11:08:10,088 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.8.GA (WildFly Core 15.0.19.Final-redhat-00001) iniciado em 1748ms - Iniciado(s) 60 de serviços 83 (os serviços 32 estão lentos, passivos ou sob demanda)
2026-06-11 11:08:10,128 INFO  [org.jboss.as] (MSC service thread 1-4) WFLYSRV0050: JBoss EAP 7.4.8.GA (WildFly Core 15.0.19.Final-redhat-00001) interrompido em 8ms
2026-06-11 14:28:16,944 INFO  [org.jboss.modules] (CLI command executor) JBoss Modules version 1.12.0.Final-redhat-00001
2026-06-11 14:28:17,001 INFO  [org.jboss.msc] (CLI command executor) JBoss MSC version 1.4.12.Final-redhat-00001
2026-06-11 14:28:17,008 INFO  [org.jboss.threads] (CLI command executor) JBoss Threads version 2.4.0.Final-redhat-00001
2026-06-11 14:28:17,131 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: Inicializando JBoss EAP 7.4.8.GA (WildFly Core 15.0.19.Final-redhat-00001)
2026-06-11 14:28:17,132 DEBUG [org.jboss.as.config] (MSC service thread 1-2) Propriedades de sistema configurado:
        awt.toolkit = sun.awt.X11.XToolkit
        com.ibm.jsse2.overrideDefaultTLS = true
        file.encoding = UTF-8
        file.encoding.pkg = sun.io
        file.separator = /
        java.awt.graphicsenv = sun.awt.X11GraphicsEnvironment
        java.awt.headless = true
        java.awt.printerjob = sun.print.PSPrinterJob
        java.class.path = /opt/jboss-eap/jboss-modules.jar
        java.class.version = 52.0
        java.endorsed.dirs = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-1.el7.x86_64/jre/lib/endorsed
        java.ext.dirs = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-1.el7.x86_64/jre/lib/ext:/usr/java/packages/lib/ext
        java.home = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-1.el7.x86_64/jre
        java.io.tmpdir = /tmp
        java.library.path = /usr/java/packages/lib/amd64:/usr/lib64:/lib64:/lib:/usr/lib
        java.runtime.name = OpenJDK Runtime Environment
        java.runtime.version = 1.8.0_262-b10
        java.specification.name = Java Platform API Specification
        java.specification.vendor = Oracle Corporation
        java.specification.version = 1.8
        java.util.logging.manager = org.jboss.logmanager.LogManager
        java.vendor = Oracle Corporation
        java.vendor.url = http://java.oracle.com/
        java.vendor.url.bug = http://bugreport.sun.com/bugreport/
        java.version = 1.8.0_262
        java.vm.info = mixed mode
        java.vm.name = OpenJDK 64-Bit Server VM
        java.vm.specification.name = Java Virtual Machine Specification
        java.vm.specification.vendor = Oracle Corporation
        java.vm.specification.version = 1.8
        java.vm.vendor = Oracle Corporation
        java.vm.version = 25.262-b10
        jboss.home.dir = /opt/jboss-eap
        jboss.host.name = caddeapllx2484
        jboss.modules.dir = /opt/jboss-eap/modules
        jboss.modules.system.pkgs = com.sun.java.swing
        jboss.node.name = caddeapllx2484
        jboss.qualified.host.name = caddeapllx2484.agil.nprd.caixa.gov.br
        jboss.server.base.dir = /opt/jboss-eap/standalone
        jboss.server.config.dir = /opt/jboss-eap/standalone/configuration
        jboss.server.content.dir = /opt/jboss-eap/standalone/data/content
        jboss.server.data.dir = /opt/jboss-eap/standalone/data
        jboss.server.deploy.dir = /opt/jboss-eap/standalone/data/content
        jboss.server.log.dir = /opt/jboss-eap/standalone/log
        jboss.server.name = caddeapllx2484
        jboss.server.persist.config = true
        jboss.server.temp.dir = /opt/jboss-eap/standalone/tmp
        line.separator =

        logging.configuration = file:/opt/jboss-eap/bin/jboss-cli-logging.properties
        module.path = /opt/jboss-eap/modules
        org.jboss.boot.log.file = /opt/jboss-eap/standalone/log/server.log
        org.jboss.resolver.warning = true
        org.wildfly.logging.embedded = false
        os.arch = amd64
        os.name = Linux
        os.version = 3.10.0-1160.el7.x86_64
        path.separator = :
        sun.arch.data.model = 64
        sun.boot.class.path = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-1.el7.x86_64/jre/lib/resources.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-1.el7.x86_64/jre/lib/rt.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-1.el7.x86_64/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-1.el7.x86_64/jre/lib/jsse.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-1.el7.x86_64/jre/lib/jce.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-1.el7.x86_64/jre/lib/charsets.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-1.el7.x86_64/jre/lib/jfr.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-1.el7.x86_64/jre/classes
        sun.boot.library.path = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.262.b10-1.el7.x86_64/jre/lib/amd64
        sun.cpu.endian = little
        sun.cpu.isalist =
        sun.io.unicode.encoding = UnicodeLittle
        sun.java.command = /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.cli --file=/tmp/src/jboss-custom.cli
        sun.java.launcher = SUN_STANDARD
        sun.jnu.encoding = UTF-8
        sun.management.compiler = HotSpot 64-Bit Tiered Compilers
        sun.os.patch.level = unknown
        user.country = BR
        user.dir = /opt/jboss-eap/bin
        user.home = /root
        user.language = pt
        user.name = root
        user.timezone = America/Sao_Paulo
2026-06-11 14:28:17,132 DEBUG [org.jboss.as.config] (MSC service thread 1-2) Argumentos da VM: -Djboss.modules.system.pkgs=com.sun.java.swing -Dcom.ibm.jsse2.overrideDefaultTLS=true -Dlogging.configuration=file:/opt/jboss-eap/bin/jboss-cli-logging.properties
2026-06-11 14:28:17,894 INFO  [org.wildfly.security] (ServerService Thread Pool -- 28) ELY00001: WildFly Elytron version 1.15.14.Final-redhat-00001
2026-06-11 14:28:18,098 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 23) WFLYCTL0033: A extensão 'security' é obsoleta e talvez não seja suportada em versões futuras
2026-06-11 14:28:18,363 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/core-service=management/management-interface=http-interface', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
2026-06-11 14:28:18,437 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/subsystem=undertow/server=default-server/https-listener=https', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
2026-06-11 14:28:18,530 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-3) WFLYELY00023: O arquivo '/opt/jboss-eap/standalone/configuration/application.keystore' da KeyStore não existe. Usado em branco.
2026-06-11 14:28:18,534 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-4) WFLYELY01084: KeyStore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado; ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2026-06-11 14:28:18,548 INFO  [org.jboss.as.patching] (MSC service thread 1-2) WFLYPAT0050: A ID de patch cumulativo de JBoss EAP é jboss-eap-7.4.8.CP, os patches únicos incluem: none
2026-06-11 14:28:18,582 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-1) WFLYDM0111: Keystore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado. Ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2026-06-11 14:28:18,683 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Retomando servidor
2026-06-11 14:28:18,684 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.8.GA (WildFly Core 15.0.19.Final-redhat-00001) iniciado em 1730ms - Iniciado(s) 60 de serviços 83 (os serviços 32 estão lentos, passivos ou sob demanda)
2026-06-11 14:28:18,744 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0050: JBoss EAP 7.4.8.GA (WildFly Core 15.0.19.Final-redhat-00001) interrompido em 20ms
