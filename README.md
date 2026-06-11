[root@caddeapllx2540 p585600]# tail -100 /logs/jboss/server.log
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
        javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
        jboss.home.dir = /opt/jboss-eap
        jboss.host.name = caddeapllx2540
        jboss.modules.dir = /opt/jboss-eap/modules
        jboss.modules.system.pkgs = org.jboss.byteman
        jboss.node.name = caddeapllx2540
        jboss.qualified.host.name = caddeapllx2540.agil.nprd.caixa.gov.br
        jboss.server.base.dir = /opt/jboss-eap/standalone
        jboss.server.config.dir = /opt/jboss-eap/standalone/configuration
        jboss.server.data.dir = /opt/jboss-eap/standalone/data
        jboss.server.deploy.dir = /opt/jboss-eap/standalone/data/content
        jboss.server.log.dir = /opt/jboss-eap/standalone/log
        jboss.server.name = caddeapllx2540
        jboss.server.persist.config = true
        jboss.server.temp.dir = /opt/jboss-eap/standalone/tmp
        line.separator =

        logging.configuration = file:/opt/jboss-eap/standalone/configuration/logging.properties
        module.path = /opt/jboss-eap/modules
        org.jboss.boot.log.file = /opt/jboss-eap/standalone/log/server.log
        org.jboss.resolver.warning = true
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
        sun.java.command = /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone
        sun.java.launcher = SUN_STANDARD
        sun.jnu.encoding = UTF-8
        sun.management.compiler = HotSpot 64-Bit Tiered Compilers
        sun.os.patch.level = unknown
        user.country = BR
        user.dir = /home/p981778
        user.home = /root
        user.language = pt
        user.name = root
        user.timezone = America/Sao_Paulo
2026-06-11 12:44:38,379 DEBUG [org.jboss.as.config] (MSC service thread 1-1) Argumentos da VM: -D[Standalone] -verbose:gc -Xloggc:/opt/jboss-eap/standalone/log/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1303m -Xmx1303m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Dorg.jboss.boot.log.file=/opt/jboss-eap/standalone/log/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties
2026-06-11 12:44:39,402 INFO  [org.wildfly.security] (ServerService Thread Pool -- 8) ELY00001: WildFly Elytron version 1.15.14.Final-redhat-00001
2026-06-11 12:44:39,645 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 22) WFLYCTL0033: A extensão 'security' é obsoleta e talvez não seja suportada em versões futuras
2026-06-11 12:44:40,003 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/core-service=management/management-interface=http-interface', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
2026-06-11 12:44:40,078 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 34) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/subsystem=undertow/server=default-server/https-listener=https', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
2026-06-11 12:44:40,209 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 22) WFLYDR0001: Conteúdo adicionado no local /opt/jboss-eap/standalone/data/content/e7/7d3635d02c26697526437c59a55f5b9a9a21ee/content
2026-06-11 12:44:40,222 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 22) WFLYDR0001: Conteúdo adicionado no local /opt/jboss-eap/standalone/data/content/30/032bef21835df3920fb4cf201c381b9460da24/content
2026-06-11 12:44:40,389 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 22) WFLYDR0001: Conteúdo adicionado no local /opt/jboss-eap/standalone/data/content/8a/ab08c15c4efdd0a3fb71b69ab52e64dabbf1ab/content
2026-06-11 12:44:40,400 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Criando serviço de gerenciamento http usando o socket-binding (management-http)
2026-06-11 12:44:40,432 INFO  [org.xnio] (MSC service thread 1-1) XNIO version 3.8.7.SP1-redhat-00001
2026-06-11 12:44:40,436 INFO  [org.xnio.nio] (MSC service thread 1-1) XNIO NIO Implementation Version 3.8.7.SP1-redhat-00001
2026-06-11 12:44:40,512 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 68) WFLYTX0013: O atributo node-identifier em /subsystem=transactions está definido com o valor padrão. Isso é perigoso para ambientes executando vários servidores. Certifique-se de que o valor do atributo é exclusivo.
2026-06-11 12:44:40,526 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 50) WFLYCLINF0001: Ativação do subsistema Infinispan.
2026-06-11 12:44:40,532 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 59) WFLYMETRICS0001: Ativando o subsistema de métricas de base
2026-06-11 12:44:40,536 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 60) WFLYNAM0001: Ativação do Subsistema de Nomeação
2026-06-11 12:44:40,510 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 70) WFLYWS0002: Ativação da Extensão WebServices
2026-06-11 12:44:40,554 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 49) WFLYHEALTH0001: Ativando o Subsistema Básico de integridade
2026-06-11 12:44:40,559 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 57) WFLYJSF0007: Ativadas as seguintes implantações do Jakarta Server Faces: [main]
2026-06-11 12:44:40,563 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 66) WFLYSEC0002: Ativação do Subsistema de Segurança
2026-06-11 12:44:40,607 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 51) WFLYIO001: O operador 'default' configurou automaticamente para as threads de E/S 4 com o máximo de 32 threads de tarefas com base em seus 2 processadores disponíveis.
2026-06-11 12:44:40,650 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 52) WFLYRS0016: RESTEasy versão 3.15.4.Final-redhat-00001
2026-06-11 12:44:40,674 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0003: Iniciando Undertow 2.2.20.SP1-redhat-00001
2026-06-11 12:44:40,691 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 41) WFLYJCA0004: Implantação do driver compatível-JDBC class org.h2.Driver (versão 1.4)
2026-06-11 12:44:40,718 INFO  [org.jboss.as.security] (MSC service thread 1-1) WFLYSEC0001: Versão =5.0.3.Final-redhat-00009 PicketBox atual
2026-06-11 12:44:40,774 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 69) WFLYUT0014: Criando identificador de arquivo para caminho de acesso '/opt/jboss-eap/welcome-content' com as opções [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
2026-06-11 12:44:40,814 INFO  [org.jboss.remoting] (MSC service thread 1-4) JBoss Remoting version 5.0.26.SP1-redhat-00001
2026-06-11 12:44:40,851 INFO  [org.jboss.as.connector] (MSC service thread 1-2) WFLYJCA0009: Inicialização do Subsistema Jakarta Connectors (WildFly/IronJacamar 1.5.3.SP2-redhat-00001)
2026-06-11 12:44:40,850 INFO  [org.jboss.as.naming] (MSC service thread 1-4) WFLYNAM0003: Iniciando o Serviço de Nomeação
2026-06-11 12:44:40,941 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = h2
2026-06-11 12:44:40,940 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-4) WFLYMAIL0001: Sessão de e-mail associada [java:jboss/mail/Default]
2026-06-11 12:44:41,070 INFO  [org.jboss.as.ejb3] (MSC service thread 1-4) WFLYEJB0481: O pool estrito slsb-strict-max-pool está utilizando um tamanho de instância máximo de 32 (por classe) que é derivado do tamanho de pool do thead de trabalho.
2026-06-11 12:44:41,070 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0482: O pool estrito mdb-strict-max-pool está utilizando um tamanho de instância máximo de 8 (por classe) que é derivado do número de CPUs neste host.
2026-06-11 12:44:41,144 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-3) WFLYELY00023: O arquivo '/opt/jboss-eap/standalone/configuration/application.keystore' da KeyStore não existe. Usado em branco.
2026-06-11 12:44:41,165 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0012: Servidor default-server foi iniciado.
2026-06-11 12:44:41,200 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) Queuing requests.
2026-06-11 12:44:41,201 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0018: Iniciando host default-host
2026-06-11 12:44:41,245 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY01084: KeyStore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado; ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2026-06-11 12:44:41,474 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0493: Suspensão completa do subsistema de Jakarta Enterprise Beans
2026-06-11 12:44:41,478 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: UndertowHTTP ouvinte default escutando em 127.0.0.1:8080
2026-06-11 12:44:41,633 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0001: Fonte de dados vinculada[java:jboss/datasources/ExampleDS]
2026-06-11 12:44:41,798 INFO  [org.jboss.as.patching] (MSC service thread 1-4) WFLYPAT0050: A ID de patch cumulativo de JBoss EAP é jboss-eap-7.4.8.CP, os patches únicos incluem: none
2026-06-11 12:44:41,809 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-1) WFLYDM0111: Keystore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado. Ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2026-06-11 12:44:41,822 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0027: Iniciando a implantação do "wmq.jmsra.rar" (runtime-name: "wmq.jmsra.rar")
2026-06-11 12:44:41,823 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0027: Iniciando a implantação do "framework.jar" (runtime-name: "framework.jar")
2026-06-11 12:44:41,824 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0027: Iniciando a implantação do "applicationinsights-agent.jar" (runtime-name: "applicationinsights-agent.jar")
[root@caddeapllx2540 p585600]#
