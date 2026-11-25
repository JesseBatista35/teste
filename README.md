
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$ sudo systemctl status jboss-eap-stadalone --no-pager -l

Presumimos que você recebeu as instruções de sempre do administrador
de sistema local. Basicamente, resume-se a estas três coisas:

    #1) Respeite a privacidade dos outros.
    #2) Pense antes de digitar.
    #3) Com grandes poderes vêm grandes responsabilidades.

[sudo] senha para p585600:
Unit jboss-eap-stadalone.service could not be found.
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$ sudo journalctl -u jboss-eap-standalone --no-pager -n 80
nov 25 11:59:46 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: Starting JBoss EAP Systemctl - STANDALONE...
nov 25 11:59:46 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[23637]: /opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh: linha 4: /etc/init.d/functions: Arquivo ou diretório inexistente
nov 25 11:59:46 caddeapllx2871.agil.nprd.caixa.gov.br runuser[23639]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 25 11:59:46 caddeapllx2871.agil.nprd.caixa.gov.br runuser[23639]: pam_unix(runuser:session): session closed for user jboss
nov 25 11:59:46 caddeapllx2871.agil.nprd.caixa.gov.br runuser[23643]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 25 11:59:46 caddeapllx2871.agil.nprd.caixa.gov.br runuser[23643]: pam_unix(runuser:session): session closed for user jboss
nov 25 11:59:46 caddeapllx2871.agil.nprd.caixa.gov.br runuser[23647]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 25 11:59:52 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[23637]: Starting JBoss EAP:
nov 25 11:59:52 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[23976]: /opt/jboss-eap/bin/common_start.sh: linha 58: success: comando não encontrado
nov 25 11:59:52 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: Started JBoss EAP Systemctl - STANDALONE.
nov 25 11:59:54 caddeapllx2871.agil.nprd.caixa.gov.br runuser[23647]: pam_unix(runuser:session): session closed for user jboss
nov 25 11:59:54 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Main process exited, code=exited, status=1/FAILURE
nov 25 11:59:54 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Failed with result 'exit-code'.
nov 25 11:59:54 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Consumed 7.936s CPU time.
nov 25 12:00:05 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: Starting JBoss EAP Systemctl - STANDALONE...
nov 25 12:00:05 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[24708]: /opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh: linha 4: /etc/init.d/functions: Arquivo ou diretório inexistente
nov 25 12:00:05 caddeapllx2871.agil.nprd.caixa.gov.br runuser[24710]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 25 12:00:05 caddeapllx2871.agil.nprd.caixa.gov.br runuser[24710]: pam_unix(runuser:session): session closed for user jboss
nov 25 12:00:05 caddeapllx2871.agil.nprd.caixa.gov.br runuser[24714]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 25 12:00:05 caddeapllx2871.agil.nprd.caixa.gov.br runuser[24714]: pam_unix(runuser:session): session closed for user jboss
nov 25 12:00:05 caddeapllx2871.agil.nprd.caixa.gov.br runuser[24718]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 25 12:00:11 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[24708]: Starting JBoss EAP:
nov 25 12:00:11 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[25060]: /opt/jboss-eap/bin/common_start.sh: linha 58: success: comando não encontrado
nov 25 12:00:11 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: Started JBoss EAP Systemctl - STANDALONE.
nov 25 12:00:15 caddeapllx2871.agil.nprd.caixa.gov.br runuser[24718]: pam_unix(runuser:session): session closed for user jboss
nov 25 12:00:15 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Main process exited, code=exited, status=1/FAILURE
nov 25 12:00:15 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Failed with result 'exit-code'.
nov 25 12:00:15 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Consumed 17.053s CPU time.
nov 25 12:03:36 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: Starting JBoss EAP Systemctl - STANDALONE...
nov 25 12:03:36 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[25299]: /opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh: linha 4: /etc/init.d/functions: Arquivo ou diretório inexistente
nov 25 12:03:36 caddeapllx2871.agil.nprd.caixa.gov.br runuser[25301]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 25 12:03:36 caddeapllx2871.agil.nprd.caixa.gov.br runuser[25301]: pam_unix(runuser:session): session closed for user jboss
nov 25 12:03:36 caddeapllx2871.agil.nprd.caixa.gov.br runuser[25305]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 25 12:03:36 caddeapllx2871.agil.nprd.caixa.gov.br runuser[25305]: pam_unix(runuser:session): session closed for user jboss
nov 25 12:03:36 caddeapllx2871.agil.nprd.caixa.gov.br runuser[25309]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 25 12:03:43 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[25299]: Starting JBoss EAP:
nov 25 12:03:43 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[25642]: /opt/jboss-eap/bin/common_start.sh: linha 58: success: comando não encontrado
nov 25 12:03:43 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: Started JBoss EAP Systemctl - STANDALONE.
nov 25 12:03:48 caddeapllx2871.agil.nprd.caixa.gov.br runuser[25309]: pam_unix(runuser:session): session closed for user jboss
nov 25 12:03:48 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Main process exited, code=exited, status=1/FAILURE
nov 25 12:03:48 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Failed with result 'exit-code'.
nov 25 12:03:48 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Consumed 17.787s CPU time.
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$ ls -lt /opt/jboss-eap/standalone/log/ | head
total 60
-rw-r--r-- 1 jboss jboss 58894 nov 25 12:03 server.log
-rwxrwxr-x 1 jboss jboss     0 set 30  2024 server.log.2024-09-30
-rwxrwxr-x 1 jboss jboss     0 set 30  2024 gc.log.0.current
-rwxrwxr-x 1 jboss jboss     0 set 30  2024 backupgc.log.current
-rwxrwxr-x 1 jboss jboss     0 set 30  2024 audit.log
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$ tail -150 /opt/jboss-eap/standalone/log/server.log
        java.util.logging.manager = org.jboss.logmanager.LogManager
        java.vendor = Red Hat, Inc.
        java.vendor.url = https://www.redhat.com/
        java.vendor.url.bug = https://access.redhat.com/support/cases/
        java.vendor.version = (Red_Hat-17.0.13.0.11-1)
        java.version = 17.0.13
        java.version.date = 2024-10-15
        java.vm.compressedOopsMode = 32-bit
        java.vm.info = mixed mode, sharing
        java.vm.name = OpenJDK 64-Bit Server VM
        java.vm.specification.name = Java Virtual Machine Specification
        java.vm.specification.vendor = Oracle Corporation
        java.vm.specification.version = 17
        java.vm.vendor = Red Hat, Inc.
        java.vm.version = 17.0.13+11-LTS
        javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
        jboss.bind.address = 0.0.0.0
        jboss.bind.address.management = 0.0.0.0
        jboss.home.dir = /opt/jboss-eap
        jboss.host.name = caddeapllx2871
        jboss.modules.dir = /opt/jboss-eap/modules
        jboss.modules.system.pkgs = org.jboss.byteman
        jboss.node.name = caddeapllx2871
        jboss.qualified.host.name = caddeapllx2871.agil.nprd.caixa.gov.br
        jboss.server.base.dir = /opt/jboss-eap/standalone
        jboss.server.config.dir = /opt/jboss-eap/standalone/configuration
        jboss.server.data.dir = /opt/jboss-eap/standalone/data
        jboss.server.deploy.dir = /opt/jboss-eap/standalone/data/content
        jboss.server.log.dir = /logs/jboss/jboss-eap/standalone/sigec-portabilidade-online
        jboss.server.name = caddeapllx2871
        jboss.server.persist.config = true
        jboss.server.temp.dir = /opt/jboss-eap/standalone/tmp
        jdk.debug = release
        jdk.serialFilter = maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
        line.separator =

        logging.configuration = file:/opt/jboss-eap/standalone/configuration/logging.properties
        module.path = /opt/jboss-eap/modules
        native.encoding = UTF-8
        org.jboss.boot.log.file = /logs/jboss/jboss-eap/standalone/sigec-portabilidade-online/server.log
        org.jboss.resolver.warning = true
        os.arch = amd64
        os.name = Linux
        os.version = 5.14.0-362.8.1.el9_3.x86_64
        path.separator = :
        sun.arch.data.model = 64
        sun.boot.library.path = /usr/lib/jvm/java-17-openjdk-17.0.13.0.11-4.el9.x86_64/lib
        sun.cpu.endian = little
        sun.io.unicode.encoding = UnicodeLittle
        sun.java.command = /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigec-portabilidade-online -c standalone-full-ha.xml
        sun.java.launcher = SUN_STANDARD
        sun.jnu.encoding = UTF-8
        sun.management.compiler = HotSpot 64-Bit Tiered Compilers
        user.country = BR
        user.dir = /
        user.home = /home/jboss
        user.language = pt
        user.name = jboss
        user.timezone = America/Sao_Paulo
2026-11-25 12:03:37,778 DEBUG [org.jboss.as.config] (MSC service thread 1-1) Argumentos da VM: -D[Standalone] -Xlog:gc*:file=/logs/jboss/jboss-eap/standalone/sigec-portabilidade-online/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -XX:+UseG1GC -XX:+ExplicitGCInvokesConcurrent -XX:MaxGCPauseMillis=500 -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sigec-portabilidade-online/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties
2026-11-25 12:03:38,380 INFO  [org.wildfly.security] (ServerService Thread Pool -- 3) ELY00001: WildFly Elytron version 1.15.23.Final-redhat-00001
2026-11-25 12:03:38,613 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 5) WFLYCTL0033: A extensão 'security' é obsoleta e talvez não seja suportada em versões futuras
2026-11-25 12:03:38,869 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/core-service=management/management-interface=http-interface', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
2026-11-25 12:03:38,906 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: A nova tentativa implantação de gec-ear.ear falhou
2026-11-25 12:03:39,043 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 40) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/subsystem=undertow/server=default-server/https-listener=https', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
2026-11-25 12:03:39,258 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
    ("core-service" => "management"),
    ("security-realm" => "ManagementRealm")
]) - falha na descrição: "WFLYDM0145: O recurso 'security-realm' não tem suporte desde o Java 14"
2026-11-25 12:03:39,259 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
    ("core-service" => "management"),
    ("security-realm" => "ApplicationRealm")
]) - falha na descrição: "WFLYDM0145: O recurso 'security-realm' não tem suporte desde o Java 14"
2026-11-25 12:03:39,263 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Criando serviço de gerenciamento http usando o socket-binding (management-http)
2026-11-25 12:03:39,270 INFO  [org.xnio] (MSC service thread 1-2) XNIO version 3.8.16.Final-redhat-00001
2026-11-25 12:03:39,275 INFO  [org.xnio.nio] (MSC service thread 1-2) XNIO NIO Implementation Version 3.8.16.Final-redhat-00001
2026-11-25 12:03:39,318 INFO  [org.jboss.remoting] (MSC service thread 1-1) JBoss Remoting version 5.0.29.Final-redhat-00001
2026-11-25 12:03:39,336 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 47) WFLYJCA0004: Implantação do driver compatível-JDBC class org.h2.Driver (versão 1.4)
2026-11-25 12:03:39,377 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 55) WFLYHEALTH0001: Ativando o Subsistema Básico de integridade
2026-11-25 12:03:39,390 INFO  [org.wildfly.iiop.openjdk] (ServerService Thread Pool -- 56) WFLYIIOP0001: Ativação de subsistema IIOP
2026-11-25 12:03:39,395 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 57) WFLYCLINF0001: Ativação do subsistema Infinispan.
2026-11-25 12:03:39,425 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 58) WFLYIO001: O operador 'default' configurou automaticamente para as threads de E/S 4 com o máximo de 32 threads de tarefas com base em seus 2 processadores disponíveis.
2026-11-25 12:03:39,424 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 59) WFLYRS0016: RESTEasy versão 3.15.9.Final-redhat-00001
2026-11-25 12:03:39,447 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY00023: O arquivo '/opt/jboss-eap/standalone/configuration/application.keystore' da KeyStore não existe. Usado em branco.
2026-11-25 12:03:39,450 INFO  [org.jboss.as.connector] (MSC service thread 1-4) WFLYJCA0009: Inicialização do Subsistema Jakarta Connectors (WildFly/IronJacamar 1.5.17.Final-redhat-00001)
2026-11-25 12:03:39,457 INFO  [org.jboss.as.clustering.jgroups] (ServerService Thread Pool -- 62) WFLYCLJG0001: Ativação do subsistema JGroups. Versão do JGroups 4.2.23
2026-11-25 12:03:39,478 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0481: O pool estrito slsb-strict-max-pool está utilizando um tamanho de instância máximo de 32 (por classe) que é derivado do tamanho de pool do thead de trabalho.
2026-11-25 12:03:39,478 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = h2
2026-11-25 12:03:39,481 INFO  [org.jboss.as.ejb3] (MSC service thread 1-4) WFLYEJB0482: O pool estrito mdb-strict-max-pool está utilizando um tamanho de instância máximo de 8 (por classe) que é derivado do número de CPUs neste host.
2026-11-25 12:03:39,481 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-4) WFLYELY01084: KeyStore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado; ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2026-11-25 12:03:39,485 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 65) WFLYJSF0007: Ativadas as seguintes implantações do Jakarta Server Faces: [main]
2026-11-25 12:03:39,523 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 69) WFLYMETRICS0001: Ativando o subsistema de métricas de base
2026-11-25 12:03:39,546 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 71) WFLYNAM0001: Ativação do Subsistema de Nomeação
2026-11-25 12:03:39,603 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 78) WFLYCTL0013: Falha na operação ("add") - endereço ([("subsystem" => "security")]) - falha na descrição: "WFLYSEC0106: O recurso 'security' não tem suporte desde o Java 14"
2026-11-25 12:03:39,616 INFO  [org.jboss.as.naming] (MSC service thread 1-3) WFLYNAM0003: Iniciando o Serviço de Nomeação
2026-11-25 12:03:39,616 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-3) WFLYMAIL0001: Sessão de e-mail associada [java:jboss/mail/Default]
2026-11-25 12:03:39,623 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 81) WFLYTX0013: O atributo node-identifier em /subsystem=transactions está definido com o valor padrão. Isso é perigoso para ambientes executando vários servidores. Certifique-se de que o valor do atributo é exclusivo.
2026-11-25 12:03:39,637 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 83) WFLYWS0002: Ativação da Extensão WebServices
2026-11-25 12:03:39,799 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0003: Iniciando Undertow 2.2.33.SP1-redhat-00001
2026-11-25 12:03:39,820 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 82) WFLYUT0014: Criando identificador de arquivo para caminho de acesso '/opt/jboss-eap/welcome-content' com as opções [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
2026-11-25 12:03:39,840 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0012: Servidor default-server foi iniciado.
2026-11-25 12:03:39,885 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0006: UndertowHTTP ouvinte default escutando em [0:0:0:0:0:0:0:0]:8080
2026-11-25 12:03:39,886 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0006: UndertowAJP ouvinte ajp escutando em [0:0:0:0:0:0:0:0]:8009
2026-11-25 12:03:39,887 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) Queuing requests.
2026-11-25 12:03:39,887 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0018: Iniciando host default-host
2026-11-25 12:03:39,889 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 75) MODCLUSTER000001: Initializing mod_cluster version 1.4.5.Final-redhat-00001
2026-11-25 12:03:39,894 ERROR [org.jboss.modcluster] (ServerService Thread Pool -- 75) MODCLUSTER000034: Failed to start advertise listener: java.net.SocketException: No network interface with address 0.0.0.0
        at java.base/sun.nio.ch.DatagramSocketAdaptor.setInterface(DatagramSocketAdaptor.java:565)
        at java.base/java.net.MulticastSocket.setInterface(MulticastSocket.java:405)
        at org.jboss.mod_cluster.core@1.4.5.Final-redhat-00001//org.jboss.modcluster.advertise.impl.AdvertiseListenerImpl.init(AdvertiseListenerImpl.java:151)
        at org.jboss.mod_cluster.core@1.4.5.Final-redhat-00001//org.jboss.modcluster.advertise.impl.AdvertiseListenerImpl.start(AdvertiseListenerImpl.java:161)
        at org.jboss.mod_cluster.core@1.4.5.Final-redhat-00001//org.jboss.modcluster.ModClusterService.init(ModClusterService.java:166)
        at org.wildfly.mod_cluster.undertow@7.4.18.GA-redhat-00001//org.wildfly.mod_cluster.undertow.UndertowEventHandlerAdapterService.start(UndertowEventHandlerAdapterService.java:85)
        at org.wildfly.clustering.service@7.4.18.GA-redhat-00001//org.wildfly.clustering.service.AsyncServiceConfigurator$AsyncService.lambda$start$0(AsyncServiceConfigurator.java:117)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at java.base/java.lang.Thread.run(Thread.java:840)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)

2026-11-25 12:03:39,984 INFO  [org.wildfly.iiop.openjdk] (MSC service thread 1-2) WFLYIIOP0009: Serviço CORBA ORB iniciado
2026-11-25 12:03:39,990 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0493: Suspensão completa do subsistema de Jakarta Enterprise Beans
2026-11-25 12:03:40,028 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-3) WFLYJCA0001: Fonte de dados vinculada[java:jboss/datasources/ExampleDS]
2026-11-25 12:03:40,148 INFO  [org.jboss.as.patching] (MSC service thread 1-4) WFLYPAT0050: A ID de patch cumulativo de JBoss EAP é jboss-eap-7.4.18.CP, os patches únicos incluem: none
2026-11-25 12:03:47,881 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: gec-ejb.jar) em 1ms
2026-11-25 12:03:47,892 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: gec-api.war) em 13ms
2026-11-25 12:03:47,962 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: gec-web.war) em 83ms
2026-11-25 12:03:47,973 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0028: Implantação interrompida gec-ear.ear (runtime-name: gec-ear.ear) em 94ms
2026-11-25 12:03:47,975 INFO  [org.infinispan.manager.DefaultCacheManager] (ServerService Thread Pool -- 75) Stopping cache manager null on caddeapllx2871
2026-11-25 12:03:47,975 INFO  [org.infinispan.manager.DefaultCacheManager] (ServerService Thread Pool -- 87) Stopping cache manager null on caddeapllx2871
2026-11-25 12:03:47,975 INFO  [org.infinispan.manager.DefaultCacheManager] (ServerService Thread Pool -- 86) Stopping cache manager null on caddeapllx2871
2026-11-25 12:03:47,976 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 75) ISPN000080: Disconnecting JGroups channel ejb
2026-11-25 12:03:47,975 INFO  [org.infinispan.manager.DefaultCacheManager] (ServerService Thread Pool -- 85) Stopping cache manager null on caddeapllx2871
2026-11-25 12:03:47,977 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 85) ISPN000080: Disconnecting JGroups channel ejb
2026-11-25 12:03:47,978 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 87) ISPN000080: Disconnecting JGroups channel ejb
2026-11-25 12:03:47,978 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 86) ISPN000080: Disconnecting JGroups channel ejb
2026-11-25 12:03:47,999 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 48) WFLYSRV0021: O procedimento da implantação "gec-ear.ear" foi revertido com mensagem de falha: undefined
2026-11-25 12:03:48,000 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) WFLYJCA0010: Fonte de dados sem limite [java:jboss/datasources/ExampleDS]
2026-11-25 12:03:48,003 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0008: Undertow HTTP ouvinte default está suspendendo
2026-11-25 12:03:48,004 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0008: Undertow AJP ouvinte ajp está suspendendo
2026-11-25 12:03:48,005 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0007: Undertow AJP ouvinte ajp interrompido, estava vinculado a [0:0:0:0:0:0:0:0]:8009
2026-11-25 12:03:48,006 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0007: Undertow HTTP ouvinte default interrompido, estava vinculado a [0:0:0:0:0:0:0:0]:8080
2026-11-25 12:03:48,010 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-4) WFLYMAIL0002: Sessão de e-mail não associada [java:jboss/mail/Default]
2026-11-25 12:03:48,011 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0019: Interrompendo host default-host
2026-11-25 12:03:48,012 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 83) MODCLUSTER000002: Initiating mod_cluster shutdown
2026-11-25 12:03:48,015 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0019: Serviço de driver interrompido com nome-do-driver = h2
2026-11-25 12:03:48,015 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0004: Interrompendo Undertow 2.2.33.SP1-redhat-00001
2026-11-25 12:03:48,038 FATAL [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0056: A inicialização do servidor falhou numa maneira irrecuperável: encerrando. Consulte mensagens anteriores para maiores detalhes.
2026-11-25 12:03:48,052 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0050: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) interrompido em 9ms
[p585600@caddeapllx2871 ~]$ grep -n -E "ERROR|FATAL|WFLYCTL0013|WFLYSRV0026|WFLYSRV0025|BindException|Address already|Could not|Caused by" /opt/jboss-eap/standalone/log/server.log | tail -40
85:2026-11-25 11:59:49,878 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
89:2026-11-25 11:59:49,879 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
111:2026-11-25 11:59:50,118 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 77) WFLYCTL0013: Falha na operação ("add") - endereço ([("subsystem" => "security")]) - falha na descrição: "WFLYSEC0106: O recurso 'security' não tem suporte desde o Java 14"
127:2026-11-25 11:59:50,567 ERROR [org.jboss.modcluster] (ServerService Thread Pool -- 84) MODCLUSTER000034: Failed to start advertise listener: java.net.SocketException: No network interface with address 0.0.0.0
163:2026-11-25 11:59:54,603 FATAL [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0056: A inicialização do servidor falhou numa maneira irrecuperável: encerrando. Consulte mensagens anteriores para maiores detalhes.
250:2026-11-25 12:00:08,022 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
254:2026-11-25 12:00:08,023 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
280:2026-11-25 12:00:08,362 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 77) WFLYCTL0013: Falha na operação ("add") - endereço ([("subsystem" => "security")]) - falha na descrição: "WFLYSEC0106: O recurso 'security' não tem suporte desde o Java 14"
291:2026-11-25 12:00:08,679 ERROR [org.jboss.modcluster] (ServerService Thread Pool -- 81) MODCLUSTER000034: Failed to start advertise listener: java.net.SocketException: No network interface with address 0.0.0.0
323:2026-11-25 12:00:15,036 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 48) WFLYSRV0021: O procedimento da implantação "gec-ear.ear" foi revertido com mensagem de falha: undefined
334:2026-11-25 12:00:15,074 FATAL [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0056: A inicialização do servidor falhou numa maneira irrecuperável: encerrando. Consulte mensagens anteriores para maiores detalhes.
421:2026-11-25 12:03:39,258 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
425:2026-11-25 12:03:39,259 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
449:2026-11-25 12:03:39,603 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 78) WFLYCTL0013: Falha na operação ("add") - endereço ([("subsystem" => "security")]) - falha na descrição: "WFLYSEC0106: O recurso 'security' não tem suporte desde o Java 14"
462:2026-11-25 12:03:39,894 ERROR [org.jboss.modcluster] (ServerService Thread Pool -- 75) MODCLUSTER000034: Failed to start advertise listener: java.net.SocketException: No network interface with address 0.0.0.0
493:2026-11-25 12:03:47,999 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 48) WFLYSRV0021: O procedimento da implantação "gec-ear.ear" foi revertido com mensagem de falha: undefined
504:2026-11-25 12:03:48,038 FATAL [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0056: A inicialização do servidor falhou numa maneira irrecuperável: encerrando. Consulte mensagens anteriores para maiores detalhes.
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$ ls -l /opt/jboss-eap/standalone/configuration/*.xml
-rwxrwxr-x 1 jboss jboss 37803 jun 12  2023 /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
-rwxrwxr-x 1 jboss jboss 33377 jun 12  2023 /opt/jboss-eap/standalone/configuration/standalone-full.xml
-rwxrwxr-x 1 jboss jboss 34165 jun 12  2023 /opt/jboss-eap/standalone/configuration/standalone-ha.xml
-rwxrwxr-x 1 jboss jboss  7014 jun 23  2021 /opt/jboss-eap/standalone/configuration/standalone-load-balancer.xml
-rwxrwxr-x 1 jboss jboss 29987 jun 12  2023 /opt/jboss-eap/standalone/configuration/standalone.xml
[p585600@caddeapllx2871 ~]$
