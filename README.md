
[p585600@caddeapllx2577 log]$ tail -100 /opt/jboss-eap/standalone/log/server.log
2026-07-08 14:10:57,395 INFO  [org.jboss.modules] (CLI command executor) JBoss Modules version 1.12.3.Final-redhat-00001
2026-07-08 14:10:57,439 INFO  [org.jboss.msc] (CLI command executor) JBoss MSC version 1.4.13.Final-redhat-00001
2026-07-08 14:10:57,445 INFO  [org.jboss.threads] (CLI command executor) JBoss Threads version 2.4.0.Final-redhat-00001
2026-07-08 14:10:57,558 INFO  [org.jboss.as] (MSC service thread 1-1) WFLYSRV0049: Inicializando JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001)
2026-07-08 14:10:57,559 DEBUG [org.jboss.as.config] (MSC service thread 1-1) Propriedades de sistema configurado:
        awt.toolkit = sun.awt.X11.XToolkit
        com.ibm.jsse2.overrideDefaultTLS = true
        file.encoding = UTF-8
        file.encoding.pkg = sun.io
        file.separator = /
        java.awt.graphicsenv = sun.awt.X11GraphicsEnvironment
        java.awt.printerjob = sun.print.PSPrinterJob
        java.class.path = /opt/jboss-eap/jboss-modules.jar
        java.class.version = 52.0
        java.endorsed.dirs = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/endorsed
        java.ext.dirs = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/ext:/usr/java/packages/lib/ext
        java.home = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre
        java.io.tmpdir = /tmp
        java.library.path = /usr/java/packages/lib/amd64:/usr/lib64:/lib64:/lib:/usr/lib
        java.runtime.name = OpenJDK Runtime Environment
        java.runtime.version = 1.8.0_472-b08
        java.specification.maintenance.version = 6
        java.specification.name = Java Platform API Specification
        java.specification.vendor = Oracle Corporation
        java.specification.version = 1.8
        java.util.logging.manager = org.jboss.logmanager.LogManager
        java.vendor = Red Hat, Inc.
        java.vendor.url = https://www.redhat.com/
        java.vendor.url.bug = https://access.redhat.com/support/cases/
        java.version = 1.8.0_472
        java.vm.info = mixed mode
        java.vm.name = OpenJDK 64-Bit Server VM
        java.vm.specification.name = Java Virtual Machine Specification
        java.vm.specification.vendor = Oracle Corporation
        java.vm.specification.version = 1.8
        java.vm.vendor = Red Hat, Inc.
        java.vm.version = 25.472-b08
        jboss.home.dir = /opt/jboss-eap
        jboss.host.name = caddeapllx2577
        jboss.modules.dir = /opt/jboss-eap/modules
        jboss.modules.system.pkgs = com.sun.java.swing
        jboss.node.name = caddeapllx2577
        jboss.qualified.host.name = caddeapllx2577.agil.nprd.caixa.gov.br
        jboss.server.base.dir = /opt/jboss-eap/standalone
        jboss.server.config.dir = /opt/jboss-eap/standalone/configuration
        jboss.server.content.dir = /opt/jboss-eap/standalone/data/content
        jboss.server.data.dir = /opt/jboss-eap/standalone/data
        jboss.server.deploy.dir = /opt/jboss-eap/standalone/data/content
        jboss.server.log.dir = /opt/jboss-eap/standalone/log
        jboss.server.name = caddeapllx2577
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
        os.version = 5.14.0-362.8.1.el9_3.x86_64
        path.separator = :
        sun.arch.data.model = 64
        sun.boot.class.path = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/resources.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/rt.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/jsse.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/jce.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/charsets.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/jfr.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/classes
        sun.boot.library.path = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/amd64
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
2026-07-08 14:10:57,559 DEBUG [org.jboss.as.config] (MSC service thread 1-1) Argumentos da VM: -Djboss.modules.system.pkgs=com.sun.java.swing -Dcom.ibm.jsse2.overrideDefaultTLS=true -Dlogging.configuration=file:/opt/jboss-eap/bin/jboss-cli-logging.properties
2026-07-08 14:10:58,199 INFO  [org.wildfly.security] (ServerService Thread Pool -- 13) ELY00001: WildFly Elytron version 1.15.23.Final-redhat-00001
2026-07-08 14:10:58,439 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 8) WFLYCTL0033: A extensão 'security' é obsoleta e talvez não seja suportada em versões futuras
2026-07-08 14:10:58,664 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/core-service=management/management-interface=http-interface', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
2026-07-08 14:10:58,787 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/subsystem=undertow/server=default-server/https-listener=https', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
2026-07-08 14:10:58,869 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY00023: O arquivo '/opt/jboss-eap/standalone/configuration/application.keystore' da KeyStore não existe. Usado em branco.
2026-07-08 14:10:58,875 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY01084: KeyStore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado; ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2026-07-08 14:10:58,908 INFO  [org.jboss.as.patching] (MSC service thread 1-1) WFLYPAT0050: A ID de patch cumulativo de JBoss EAP é jboss-eap-7.4.18.CP, os patches únicos incluem: none
2026-07-08 14:10:58,983 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-2) WFLYDM0111: Keystore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado. Ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2026-07-08 14:10:59,070 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Retomando servidor
2026-07-08 14:10:59,071 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado em 1672ms - Iniciado(s) 62 de serviços 85 (os serviços 32 estão lentos, passivos ou sob demanda)
2026-07-08 14:10:59,186 INFO  [org.jboss.as] (MSC service thread 1-3) WFLYSRV0050: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) interrompido em 5ms
[p585600@caddeapllx2577 log]$ systemctl list-units --type=service | grep -i jboss ps -ef | grep java
grep: jboss: Arquivo ou diretório inexistente
grep: ps: Arquivo ou diretório inexistente
[p585600@caddeapllx2577 log]$
[p585600@caddeapllx2577 log]$
[p585600@caddeapllx2577 log]$ apachectl configtest
-sh: apachectl: comando não encontrado
[p585600@caddeapllx2577 log]$ httpd -t
-sh: httpd: comando não encontrado
[p585600@caddeapllx2577 log]$ ss -tlnp | grep 8443
LISTEN 0      10000        0.0.0.0:8443       0.0.0.0:*
[p585600@caddeapllx2577 log]$


