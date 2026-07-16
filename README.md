cd /opt/jboss/bin   # ajusta pro path real
./jboss-cli.sh --file=/tmp/src/jboss-custom.cli
cat /opt/jboss/standalone/log/server.log | tail -100


-sh-4.2$
-sh-4.2$ cd /opt/jboss/bin
-sh: cd: /opt/jboss/bin: Arquivo ou diretório não encontrado
-sh-4.2$ ./jboss-cli.sh --file=/tmp/src/jboss-custom.cli
-sh: ./jboss-cli.sh: Arquivo ou diretório não encontrado
-sh-4.2$ cat /opt/jboss/standalone/log/server.log | tail -100
cat: /opt/jboss/standalone/log/server.log: Arquivo ou diretório não encontrado
-sh-4.2$ less server.log
        jboss.server.data.dir = /opt/jboss-eap/standalone/data
        jboss.server.deploy.dir = /opt/jboss-eap/standalone/data/content
        jboss.server.log.dir = /opt/jboss-eap/standalone/log
        jboss.server.name = caddeapllx1950
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
2025-11-04 14:39:42,225 DEBUG [org.jboss.as.config] (MSC service thread 2-1) Argumentos da VM: -Djboss.modules.system.pkgs=com.sun.java.swing -Dcom.ibm.jsse2.overrideDefaultTLS=true -Dlogging.configuration=file:/opt/jboss-eap/bin/jboss-cli-logging.properties
2025-11-04 14:39:42,292 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 2) WFLYCTL0033: A extensão 'security' é obsoleta e talvez não seja suportada em versões futuras
2025-11-04 14:39:42,311 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/core-service=management/management-interface=http-interface', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
2025-11-04 14:39:42,320 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/subsystem=undertow/server=default-server/https-listener=https', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
2025-11-04 14:39:42,336 WARN  [org.wildfly.extension.elytron] (MSC service thread 2-1) WFLYELY00023: O arquivo '/opt/jboss-eap/standalone/configuration/application.keystore' da KeyStore não existe. Usado em branco.
2025-11-04 14:39:42,337 WARN  [org.wildfly.extension.elytron] (MSC service thread 2-1) WFLYELY01084: KeyStore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado; ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2025-11-04 14:39:42,351 INFO  [org.jboss.as.patching] (MSC service thread 2-2) WFLYPAT0050: A ID de patch cumulativo de JBoss EAP é jboss-eap-7.4.8.CP, os patches únicos incluem: none
2025-11-04 14:39:42,351 WARN  [org.jboss.as.domain.management.security] (MSC service thread 2-2) WFLYDM0111: Keystore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado. Ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2025-11-04 14:39:42,366 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Retomando servidor
2025-11-04 14:39:42,366 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.8.GA (WildFly Core 15.0.19.Final-redhat-00001) iniciado em 145ms - Iniciado(s) 60 de serviços 83 (os serviços 32 estão lentos, passivos ou sob demanda)
2025-11-04 14:39:42,383 ERROR [org.jboss.as.controller.management-operation] (pool-7-thread-1) WFLYCTL0013: Falha na operação ("list-resource-loader-paths") - endereço ([("core-service" => "module-loading")]) - falha na descrição: "org.postgresql"
2025-11-04 14:39:42,391 INFO  [org.jboss.as] (MSC service thread 2-2) WFLYSRV0050: JBoss EAP 7.4.8.GA (WildFly Core 15.0.19.Final-redhat-00001) interrompido em 4ms
(END)
