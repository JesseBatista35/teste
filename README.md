[p585600@srjdeapllx130 ~]$ tail -n 300 /opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_acessoseguro_intra_5500/log/server.log
2024-03-04 16:10:09,124 INFO  [org.jboss.modules] (main) JBoss Modules version 1.5.1.Final-redhat-1
2024-03-04 16:10:09,390 INFO  [org.jboss.msc] (main) JBoss MSC version 1.2.6.Final-redhat-1
2024-03-04 16:10:09,497 INFO  [org.jboss.as] (MSC service thread 1-6) WFLYSRV0049: JBoss EAP 7.0.0.GA (WildFly Core 2.1.2.Final-redhat-1) starting
2024-03-04 16:10:09,499 DEBUG [org.jboss.as.config] (MSC service thread 1-6) Configured system properties:
        [Server:srjdeapllx130_acessoseguro_intra_5500] =
        awt.toolkit = sun.awt.X11.XToolkit
        br.gov.caixa.acessoseguro.internet.url = https://acessoseguro.sso.tqs.intra.corerj.caixa
        br.gov.caixa.psc.connector.util.Config = /infra_app/config/sisgr/sisgr_jconnector.properties
        br.gov.caixa.siset.inter.url = https://logindes.caixa.gov.br
        br.gov.caixa.siset.role.enabled = true
        br.gov.caixa.siset.service.token.endpoint = /auth/realms/intranet/protocol/openid-connect/token
        br.gov.caixa.siset.service.unsetrole.endpoint = /servico/rest/unsetrole
        br.gov.caixa.siset.service.url = https://login.des.caixa
        br.gov.caixa.sisgr.acessoseguro.enableRecaptcha = false
        br.gov.caixa.sisgr.auditoria.redirect_uri = https://acessoseguro.sso.des.intra.corerj.caixa/auditoria/
        br.gov.caixa.sisgr.auditoria.tokenSecret = bc47dd0c-43cd-4d79-b3e0-079e3c5e95ac
        br.gov.caixa.sisgr.cadastrosenha.enableRecaptcha = false
        br.gov.caixa.sisgr.console.redirect.uri = https://acessoseguro.sso.des.intra.corerj.caixa/console-web
        br.gov.caixa.sisgr.console.tokenSecret = 79fd22a5-e739-4105-aa9a-5aec0d98170c
        br.gov.caixa.sisgr.db.alias = SGR
        br.gov.caixa.sisgr.gerenciadorcarga.redirect_uri = https://acessoseguro.sso.des.intra.corerj.caixa/gerenciadorcarga/
        br.gov.caixa.sisgr.gerenciadorcarga.tokenSecret = 546cbb4f-0040-4667-853b-730ac0ba5724
        br.gov.caixa.sisgr.inter.secret = 8c026412-1362-4aa4-b080-fe347cea5b69
        br.gov.caixa.sisgr.manutencaousuinterno.base_url = https://acessoseguro.sso.des.intra.corerj.caixa/intranet
        br.gov.caixa.sisgr.manutencaousuinterno.redirect_uri = https://acessoseguro.sso.des.intra.corerj.caixa/matrizacesso/
        br.gov.caixa.sisgr.matrizacesso.datasource = java:jboss/db2sgr
        br.gov.caixa.sisgr.matrizacesso.email.manutusu = false
        br.gov.caixa.sisgr.matrizacesso.normativo = http://sismn.caixa/sistema/asp/ConsultaPesquisa/pdf_comum.asp?id=NOR016039
        br.gov.caixa.sisgr.matrizacesso.redirectUri = https://acessoseguro.sso.des.intra.corerj.caixa/matrizacesso
        br.gov.caixa.sisgr.matrizacesso.schema = SGR
        br.gov.caixa.sisgr.matrizacesso.siset.internet.domain = https://logindes.caixa.gov.br/
        br.gov.caixa.sisgr.matrizacesso.siset.internet.id = cli-ser-sgr-batch
        br.gov.caixa.sisgr.matrizacesso.siset.internet.secret = 8c026412-1362-4aa4-b080-fe347cea5b69
        br.gov.caixa.sisgr.matrizacesso.siset.role.enabled = true
        br.gov.caixa.sisgr.matrizacesso.tokenSecret = 25a2ceca-adcb-4373-96c9-172d5b309d7e
        br.gov.caixa.sisgr.monitoramentousuexterno.base_url = https://acessoseguro.sso.des.intra.corerj.caixa/intranet
        br.gov.caixa.sisgr.monitoramentousuexterno.redirect_uri = https://acessoseguro.sso.des.intra.corerj.caixa/sisgr_monitoramento_usuario-sso
        br.gov.caixa.sisgr.monitoramentousuexterno.schema = SGR
        br.gov.caixa.sisgr.monitoramentousuexterno.tokenSecret = d45e2cb3-00f1-434f-aa51-79b9e61b82a9
        br.gov.caixa.sisgr.portal.enableRecaptcha = false
        br.gov.caixa.sisgr.portal.fgts.service.apikey = l73d1bf456826646088771218eb6db91f4
        br.gov.caixa.sisgr.portal.fgts.service.url = https://api.des.caixa:8443/fgts/trabalhador/v1/
        br.gov.caixa.sisgr.portal.service.token.sso.url = https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/token
        br.gov.caixa.sisgr.properties = /infra_app/config/sisgr/sisgr.properties
        br.gov.caixa.sisgr.template = portal
        br.gov.caixa.sisgr.token.client.ivKey = C01X@.08.RCL$OS2
        br.gov.caixa.sisgr.token.client.key = Ct0k5n@%$9781XA~
        br.gov.caixa.sisgr.token.client.url = https://acessoseguro.sso.des.intra.corerj.caixa/
        caminho.arquivo.temp = /var/tmp
        ejb-ip = 10.116.94.88
        ejb-porta = :7401
        ejb-protocolo = remote://
        file.encoding = UTF-8
        file.encoding.pkg = sun.io
        file.separator = /
        java.awt.graphicsenv = sun.awt.X11GraphicsEnvironment
        java.awt.headless = true
        java.awt.printerjob = sun.print.PSPrinterJob
        java.class.path = /opt/open/jboss/7.0.0/jboss-modules.jar
        java.class.version = 52.0
        java.endorsed.dirs = /opt/open/java/jdk1.8.0_121/jre/lib/endorsed
        java.ext.dirs = /opt/open/java/jdk1.8.0_121/jre/lib/ext:/usr/java/packages/lib/ext
        java.home = /opt/open/java/jdk1.8.0_121/jre
        java.io.tmpdir = /tmp
        java.library.path = /usr/java/packages/lib/amd64:/usr/lib64:/lib64:/lib:/usr/lib
        java.net.preferIPv4Stack = true
        java.runtime.name = Java(TM) SE Runtime Environment
        java.runtime.version = 1.8.0_121-b13
        java.specification.name = Java Platform API Specification
        java.specification.vendor = Oracle Corporation
        java.specification.version = 1.8
        java.util.logging.manager = org.jboss.logmanager.LogManager
        java.vendor = Oracle Corporation
        java.vendor.url = http://java.oracle.com/
        java.vendor.url.bug = http://bugreport.sun.com/bugreport/
        java.version = 1.8.0_121
        java.vm.info = mixed mode
        java.vm.name = Java HotSpot(TM) 64-Bit Server VM
        java.vm.specification.name = Java Virtual Machine Specification
        java.vm.specification.vendor = Oracle Corporation
        java.vm.specification.version = 1.8
        java.vm.vendor = Oracle Corporation
        java.vm.version = 25.121-b13
        javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
        javax.net.ssl.trustStore = /infra_app/config/certificados/cacerts
        javax.net.ssl.trustStorePassword = <redacted>
        javax.net.ssl.trustStoreType = jks
        javax.xml.datatype.DatatypeFactory = __redirected.__DatatypeFactory
        javax.xml.parsers.DocumentBuilderFactory = __redirected.__DocumentBuilderFactory
        javax.xml.parsers.SAXParserFactory = __redirected.__SAXParserFactory
        javax.xml.stream.XMLEventFactory = __redirected.__XMLEventFactory
        javax.xml.stream.XMLInputFactory = __redirected.__XMLInputFactory
        javax.xml.stream.XMLOutputFactory = __redirected.__XMLOutputFactory
        javax.xml.transform.TransformerFactory = __redirected.__TransformerFactory
        javax.xml.validation.SchemaFactory:http://www.w3.org/2001/XMLSchema = __redirected.__SchemaFactory
        javax.xml.xpath.XPathFactory:http://java.sun.com/jaxp/xpath/dom = __redirected.__XPathFactory
        jboss.as.management.blocking.timeout = 1800
        jboss.bind.address = srjdeapllx130
        jboss.bind.address.management = srjdeapllx130
        jboss.domain.base.dir = /opt/open/jboss/7.0.0/domain
        jboss.domain.config.dir = /opt/open/jboss/7.0.0/domain/configuration
        jboss.home.dir = /opt/open/jboss/7.0.0
        jboss.host.name = srjdeapllx130
        jboss.management.http.port = 9990
        jboss.management.native.port = 9999
        jboss.modules.dir = /opt/open/jboss/7.0.0/modules
        jboss.modules.system.pkgs = org.jboss.byteman
        jboss.node.name = srjdeapllx130:srjdeapllx130_acessoseguro_intra_5500
        jboss.qualified.host.name = srjdeapllx130
        jboss.server.base.dir = /opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_acessoseguro_intra_5500
        jboss.server.config.dir = /opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_acessoseguro_intra_5500/configuration
        jboss.server.data.dir = /opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_acessoseguro_intra_5500/data
        jboss.server.deploy.dir = /opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_acessoseguro_intra_5500/data/content
        jboss.server.log.dir = /opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_acessoseguro_intra_5500/log
        jboss.server.name = srjdeapllx130_acessoseguro_intra_5500
        jboss.server.persist.config = true
        jboss.server.temp.dir = /opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_acessoseguro_intra_5500/tmp
        line.separator =

        logging.configuration = file:/opt/open/jboss/7.0.0/domain/configuration/default-server-logging.properties
        module.path = /opt/open/jboss/7.0.0/modules
        mq.broker.usr = JDIRSGRD
        mq.channel = SYSTEM.ADMIN.SVRCONN
        mq.name = RJD2
        mq.port = 1415
        mq.server = 10.216.80.110
        org.jboss.boot.log.file = /opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_acessoseguro_intra_5500/log/server.log
        org.jboss.resolver.warning = true
        org.xml.sax.driver = __redirected.__XMLReaderFactory
        os.arch = amd64
        os.name = Linux
        os.version = 3.10.0-862.11.6.el7.x86_64
        path.separator = :
        sisgr.grp.usr = SGRCERTD
        sun.arch.data.model = 64
        sun.boot.class.path = /opt/open/java/jdk1.8.0_121/jre/lib/resources.jar:/opt/open/java/jdk1.8.0_121/jre/lib/rt.jar:/opt/open/java/jdk1.8.0_121/jre/lib/sunrsasign.jar:/opt/open/java/jdk1.8.0_121/jre/lib/jsse.jar:/opt/open/java/jdk1.8.0_121/jre/lib/jce.jar:/opt/open/java/jdk1.8.0_121/jre/lib/charsets.jar:/opt/open/java/jdk1.8.0_121/jre/lib/jfr.jar:/opt/open/java/jdk1.8.0_121/jre/classes
        sun.boot.library.path = /opt/open/java/jdk1.8.0_121/jre/lib/amd64
        sun.cpu.endian = little
        sun.cpu.isalist =
        sun.io.unicode.encoding = UnicodeLittle
        sun.java.command = /opt/open/jboss/7.0.0/jboss-modules.jar -mp /opt/open/jboss/7.0.0/modules org.jboss.as.server
        sun.java.launcher = SUN_STANDARD
        sun.jnu.encoding = UTF-8
        sun.management.compiler = HotSpot 64-Bit Tiered Compilers
        sun.os.patch.level = unknown
        user.country = US
        user.dir = /opt/open/jboss/7.0.0
        user.home = /export/home/spjbodr2
        user.language = en
        user.name = spjbodr2
        user.timezone = America/Sao_Paulo
2024-03-04 16:10:09,500 DEBUG [org.jboss.as.config] (MSC service thread 1-6) VM Arguments: -D[Server:srjdeapllx130_acessoseguro_intra_5500] -Xms2048m -Xmx2048m -XX:+UseG1GC -Dbr.gov.caixa.acessoseguro.internet.url=https://acessoseguro.sso.tqs.intra.corerj.caixa -Dbr.gov.caixa.psc.connector.util.Config=/infra_app/config/sisgr/sisgr_jconnector.properties -Dbr.gov.caixa.siset.inter.url=https://logindes.caixa.gov.br -Dbr.gov.caixa.siset.role.enabled=true -Dbr.gov.caixa.siset.service.token.endpoint=/auth/realms/intranet/protocol/openid-connect/token -Dbr.gov.caixa.siset.service.unsetrole.endpoint=/servico/rest/unsetrole -Dbr.gov.caixa.siset.service.url=https://login.des.caixa -Dbr.gov.caixa.sisgr.acessoseguro.enableRecaptcha=false -Dbr.gov.caixa.sisgr.auditoria.redirect_uri=https://acessoseguro.sso.des.intra.corerj.caixa/auditoria/ -Dbr.gov.caixa.sisgr.auditoria.tokenSecret=bc47dd0c-43cd-4d79-b3e0-079e3c5e95ac -Dbr.gov.caixa.sisgr.cadastrosenha.enableRecaptcha=false -Dbr.gov.caixa.sisgr.console.redirect.uri=https://acessoseguro.sso.des.intra.corerj.caixa/console-web -Dbr.gov.caixa.sisgr.console.tokenSecret=79fd22a5-e739-4105-aa9a-5aec0d98170c -Dbr.gov.caixa.sisgr.db.alias=SGR -Dbr.gov.caixa.sisgr.gerenciadorcarga.redirect_uri=https://acessoseguro.sso.des.intra.corerj.caixa/gerenciadorcarga/ -Dbr.gov.caixa.sisgr.gerenciadorcarga.tokenSecret=546cbb4f-0040-4667-853b-730ac0ba5724 -Dbr.gov.caixa.sisgr.inter.secret=8c026412-1362-4aa4-b080-fe347cea5b69 -Dbr.gov.caixa.sisgr.manutencaousuinterno.base_url=https://acessoseguro.sso.des.intra.corerj.caixa/intranet -Dbr.gov.caixa.sisgr.manutencaousuinterno.redirect_uri=https://acessoseguro.sso.des.intra.corerj.caixa/matrizacesso/ -Dbr.gov.caixa.sisgr.matrizacesso.datasource=java:jboss/db2sgr -Dbr.gov.caixa.sisgr.matrizacesso.email.manutusu=false -Dbr.gov.caixa.sisgr.matrizacesso.normativo=http://sismn.caixa/sistema/asp/ConsultaPesquisa/pdf_comum.asp?id=NOR016039 -Dbr.gov.caixa.sisgr.matrizacesso.redirectUri=https://acessoseguro.sso.des.intra.corerj.caixa/matrizacesso -Dbr.gov.caixa.sisgr.matrizacesso.schema=SGR -Dbr.gov.caixa.sisgr.matrizacesso.siset.internet.domain=https://logindes.caixa.gov.br/ -Dbr.gov.caixa.sisgr.matrizacesso.siset.internet.id=cli-ser-sgr-batch -Dbr.gov.caixa.sisgr.matrizacesso.siset.internet.secret=8c026412-1362-4aa4-b080-fe347cea5b69 -Dbr.gov.caixa.sisgr.matrizacesso.siset.role.enabled=true -Dbr.gov.caixa.sisgr.matrizacesso.tokenSecret=25a2ceca-adcb-4373-96c9-172d5b309d7e -Dbr.gov.caixa.sisgr.monitoramentousuexterno.base_url=https://acessoseguro.sso.des.intra.corerj.caixa/intranet -Dbr.gov.caixa.sisgr.monitoramentousuexterno.redirect_uri=https://acessoseguro.sso.des.intra.corerj.caixa/sisgr_monitoramento_usuario-sso -Dbr.gov.caixa.sisgr.monitoramentousuexterno.schema=SGR -Dbr.gov.caixa.sisgr.monitoramentousuexterno.tokenSecret=d45e2cb3-00f1-434f-aa51-79b9e61b82a9 -Dbr.gov.caixa.sisgr.portal.enableRecaptcha=false -Dbr.gov.caixa.sisgr.portal.fgts.service.apikey=l73d1bf456826646088771218eb6db91f4 -Dbr.gov.caixa.sisgr.portal.fgts.service.url=https://api.des.caixa:8443/fgts/trabalhador/v1/ -Dbr.gov.caixa.sisgr.portal.service.token.sso.url=https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/token -Dbr.gov.caixa.sisgr.properties=/infra_app/config/sisgr/sisgr.properties -Dbr.gov.caixa.sisgr.template=portal -Dbr.gov.caixa.sisgr.token.client.ivKey=C01X@.08.RCL$OS2 -Dbr.gov.caixa.sisgr.token.client.key=Ct0k5n@%$9781XA~ -Dbr.gov.caixa.sisgr.token.client.url=https://acessoseguro.sso.des.intra.corerj.caixa/ -Dcaminho.arquivo.temp=/var/tmp -Dejb-ip=10.116.94.88 -Dejb-porta=:7401 -Dejb-protocolo=remote:// -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djavax.net.ssl.trustStore=/infra_app/config/certificados/cacerts -Djavax.net.ssl.trustStorePassword=changeit -Djavax.net.ssl.trustStoreType=jks -Djboss.as.management.blocking.timeout=1800 -Djboss.bind.address=srjdeapllx130 -Djboss.bind.address.management=srjdeapllx130 -Djboss.home.dir=/opt/open/jboss/7.0.0 -Djboss.management.http.port=9990 -Djboss.management.native.port=9999 -Djboss.modules.system.pkgs=org.jboss.byteman -Dmq.broker.usr=JDIRSGRD -Dmq.channel=SYSTEM.ADMIN.SVRCONN -Dmq.name=RJD2 -Dmq.port=1415 -Dmq.server=10.216.80.110 -Dsisgr.grp.usr=SGRCERTD -Djboss.server.log.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_acessoseguro_intra_5500/log -Djboss.server.temp.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_acessoseguro_intra_5500/tmp -Djboss.server.data.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_acessoseguro_intra_5500/data -Dorg.jboss.boot.log.file=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_acessoseguro_intra_5500/log/server.log -Dlogging.configuration=file:/opt/open/jboss/7.0.0/domain/configuration/default-server-logging.properties
2024-03-04 16:10:09,571 INFO  [org.xnio] (MSC service thread 1-8) XNIO version 3.3.6.Final-redhat-1
2024-03-04 16:10:09,578 INFO  [org.xnio.nio] (MSC service thread 1-8) XNIO NIO Implementation Version 3.3.6.Final-redhat-1
2024-03-04 16:10:09,601 INFO  [org.jboss.remoting] (MSC service thread 1-8) JBoss Remoting version 4.0.18.Final-redhat-1
[p585600@srjdeapllx130 ~]$
[p585600@srjdeapllx130 ~]$
[p585600@srjdeapllx130 ~]$ tail -n 300 /opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_webservice_intra_5502/log/server.log
2024-03-04 16:10:11,102 INFO  [org.jboss.modules] (main) JBoss Modules version 1.5.1.Final-redhat-1
2024-03-04 16:10:11,479 INFO  [org.jboss.msc] (main) JBoss MSC version 1.2.6.Final-redhat-1
2024-03-04 16:10:11,582 INFO  [org.jboss.as] (MSC service thread 1-7) WFLYSRV0049: JBoss EAP 7.0.0.GA (WildFly Core 2.1.2.Final-redhat-1) starting
2024-03-04 16:10:11,587 DEBUG [org.jboss.as.config] (MSC service thread 1-7) Configured system properties:
        [Server:srjdeapllx130_webservice_intra_5502] =
        awt.toolkit = sun.awt.X11.XToolkit
        br.gov.caixa.acessoseguro.internet.url = https://acessoseguro.sso.tqs.intra.corerj.caixa
        br.gov.caixa.psc.connector.util.Config = /infra_app/config/sisgr/sisgr_jconnector.properties
        br.gov.caixa.siset.inter.url = https://logindes.caixa.gov.br
        br.gov.caixa.siset.role.enabled = true
        br.gov.caixa.siset.service.token.endpoint = /auth/realms/intranet/protocol/openid-connect/token
        br.gov.caixa.siset.service.unsetrole.endpoint = /servico/rest/unsetrole
        br.gov.caixa.siset.service.url = https://login.des.caixa
        br.gov.caixa.sisgr.acessoseguro.enableRecaptcha = false
        br.gov.caixa.sisgr.auditoria.redirect_uri = https://acessoseguro.sso.des.intra.corerj.caixa/auditoria/
        br.gov.caixa.sisgr.auditoria.tokenSecret = bc47dd0c-43cd-4d79-b3e0-079e3c5e95ac
        br.gov.caixa.sisgr.cadastrosenha.enableRecaptcha = false
        br.gov.caixa.sisgr.console.redirect.uri = https://acessoseguro.sso.des.intra.corerj.caixa/console-web
        br.gov.caixa.sisgr.console.tokenSecret = 79fd22a5-e739-4105-aa9a-5aec0d98170c
        br.gov.caixa.sisgr.db.alias = SGR
        br.gov.caixa.sisgr.gerenciadorcarga.redirect_uri = https://acessoseguro.sso.des.intra.corerj.caixa/gerenciadorcarga/
        br.gov.caixa.sisgr.gerenciadorcarga.tokenSecret = 546cbb4f-0040-4667-853b-730ac0ba5724
        br.gov.caixa.sisgr.inter.secret = 8c026412-1362-4aa4-b080-fe347cea5b69
        br.gov.caixa.sisgr.manutencaousuinterno.base_url = https://acessoseguro.sso.des.intra.corerj.caixa/intranet
        br.gov.caixa.sisgr.manutencaousuinterno.redirect_uri = https://acessoseguro.sso.des.intra.corerj.caixa/matrizacesso/
        br.gov.caixa.sisgr.matrizacesso.datasource = java:jboss/db2sgr
        br.gov.caixa.sisgr.matrizacesso.email.manutusu = false
        br.gov.caixa.sisgr.matrizacesso.normativo = http://sismn.caixa/sistema/asp/ConsultaPesquisa/pdf_comum.asp?id=NOR016039
        br.gov.caixa.sisgr.matrizacesso.redirectUri = https://acessoseguro.sso.des.intra.corerj.caixa/matrizacesso
        br.gov.caixa.sisgr.matrizacesso.schema = SGR
        br.gov.caixa.sisgr.matrizacesso.siset.internet.domain = https://logindes.caixa.gov.br/
        br.gov.caixa.sisgr.matrizacesso.siset.internet.id = cli-ser-sgr-batch
        br.gov.caixa.sisgr.matrizacesso.siset.internet.secret = 8c026412-1362-4aa4-b080-fe347cea5b69
        br.gov.caixa.sisgr.matrizacesso.siset.role.enabled = true
        br.gov.caixa.sisgr.matrizacesso.tokenSecret = 25a2ceca-adcb-4373-96c9-172d5b309d7e
        br.gov.caixa.sisgr.monitoramentousuexterno.base_url = https://acessoseguro.sso.des.intra.corerj.caixa/intranet
        br.gov.caixa.sisgr.monitoramentousuexterno.redirect_uri = https://acessoseguro.sso.des.intra.corerj.caixa/sisgr_monitoramento_usuario-sso
        br.gov.caixa.sisgr.monitoramentousuexterno.schema = SGR
        br.gov.caixa.sisgr.monitoramentousuexterno.tokenSecret = d45e2cb3-00f1-434f-aa51-79b9e61b82a9
        br.gov.caixa.sisgr.portal.enableRecaptcha = false
        br.gov.caixa.sisgr.portal.fgts.service.apikey = l73d1bf456826646088771218eb6db91f4
        br.gov.caixa.sisgr.portal.fgts.service.url = https://api.des.caixa:8443/fgts/trabalhador/v1/
        br.gov.caixa.sisgr.portal.service.token.sso.url = https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/token
        br.gov.caixa.sisgr.properties = /infra_app/config/sisgr/sisgr.properties
        br.gov.caixa.sisgr.template = portal
        br.gov.caixa.sisgr.token.client.ivKey = C01X@.08.RCL$OS2
        br.gov.caixa.sisgr.token.client.key = Ct0k5n@%$9781XA~
        br.gov.caixa.sisgr.token.client.url = https://acessoseguro.sso.des.intra.corerj.caixa/
        caminho.arquivo.temp = /var/tmp
        ejb-ip = 10.116.94.88
        ejb-porta = :7401
        ejb-protocolo = remote://
        file.encoding = UTF-8
        file.encoding.pkg = sun.io
        file.separator = /
        java.awt.graphicsenv = sun.awt.X11GraphicsEnvironment
        java.awt.headless = true
        java.awt.printerjob = sun.print.PSPrinterJob
        java.class.path = /opt/open/jboss/7.0.0/jboss-modules.jar
        java.class.version = 52.0
        java.endorsed.dirs = /opt/open/java/jdk1.8.0_121/jre/lib/endorsed
        java.ext.dirs = /opt/open/java/jdk1.8.0_121/jre/lib/ext:/usr/java/packages/lib/ext
        java.home = /opt/open/java/jdk1.8.0_121/jre
        java.io.tmpdir = /tmp
        java.library.path = /usr/java/packages/lib/amd64:/usr/lib64:/lib64:/lib:/usr/lib
        java.net.preferIPv4Stack = true
        java.runtime.name = Java(TM) SE Runtime Environment
        java.runtime.version = 1.8.0_121-b13
        java.specification.name = Java Platform API Specification
        java.specification.vendor = Oracle Corporation
        java.specification.version = 1.8
        java.util.logging.manager = org.jboss.logmanager.LogManager
        java.vendor = Oracle Corporation
        java.vendor.url = http://java.oracle.com/
        java.vendor.url.bug = http://bugreport.sun.com/bugreport/
        java.version = 1.8.0_121
        java.vm.info = mixed mode
        java.vm.name = Java HotSpot(TM) 64-Bit Server VM
        java.vm.specification.name = Java Virtual Machine Specification
        java.vm.specification.vendor = Oracle Corporation
        java.vm.specification.version = 1.8
        java.vm.vendor = Oracle Corporation
        java.vm.version = 25.121-b13
        javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
        javax.net.ssl.trustStore = /infra_app/config/certificados/cacerts
        javax.net.ssl.trustStorePassword = <redacted>
        javax.net.ssl.trustStoreType = jks
        javax.xml.datatype.DatatypeFactory = __redirected.__DatatypeFactory
        javax.xml.parsers.DocumentBuilderFactory = __redirected.__DocumentBuilderFactory
        javax.xml.parsers.SAXParserFactory = __redirected.__SAXParserFactory
        javax.xml.stream.XMLEventFactory = __redirected.__XMLEventFactory
        javax.xml.stream.XMLInputFactory = __redirected.__XMLInputFactory
        javax.xml.stream.XMLOutputFactory = __redirected.__XMLOutputFactory
        javax.xml.transform.TransformerFactory = __redirected.__TransformerFactory
        javax.xml.validation.SchemaFactory:http://www.w3.org/2001/XMLSchema = __redirected.__SchemaFactory
        javax.xml.xpath.XPathFactory:http://java.sun.com/jaxp/xpath/dom = __redirected.__XPathFactory
        jboss.as.management.blocking.timeout = 1800
        jboss.bind.address = srjdeapllx130
        jboss.bind.address.management = srjdeapllx130
        jboss.domain.base.dir = /opt/open/jboss/7.0.0/domain
        jboss.domain.config.dir = /opt/open/jboss/7.0.0/domain/configuration
        jboss.home.dir = /opt/open/jboss/7.0.0
        jboss.host.name = srjdeapllx130
        jboss.management.http.port = 9990
        jboss.management.native.port = 9999
        jboss.modules.dir = /opt/open/jboss/7.0.0/modules
        jboss.modules.system.pkgs = org.jboss.byteman
        jboss.node.name = srjdeapllx130:srjdeapllx130_webservice_intra_5502
        jboss.qualified.host.name = srjdeapllx130
        jboss.server.base.dir = /opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_webservice_intra_5502
        jboss.server.config.dir = /opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_webservice_intra_5502/configuration
        jboss.server.data.dir = /opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_webservice_intra_5502/data
        jboss.server.deploy.dir = /opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_webservice_intra_5502/data/content
        jboss.server.log.dir = /opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_webservice_intra_5502/log
        jboss.server.name = srjdeapllx130_webservice_intra_5502
        jboss.server.persist.config = true
        jboss.server.temp.dir = /opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_webservice_intra_5502/tmp
        line.separator =

        logging.configuration = file:/opt/open/jboss/7.0.0/domain/configuration/default-server-logging.properties
        module.path = /opt/open/jboss/7.0.0/modules
        mq.broker.usr = JDIRSGRD
        mq.channel = SYSTEM.ADMIN.SVRCONN
        mq.name = RJD2
        mq.port = 1415
        mq.server = 10.216.80.110
        org.jboss.boot.log.file = /opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_webservice_intra_5502/log/server.log
        org.jboss.resolver.warning = true
        org.xml.sax.driver = __redirected.__XMLReaderFactory
        os.arch = amd64
        os.name = Linux
        os.version = 3.10.0-862.11.6.el7.x86_64
        path.separator = :
        sisgr.grp.usr = SGRCERTD
        sun.arch.data.model = 64
        sun.boot.class.path = /opt/open/java/jdk1.8.0_121/jre/lib/resources.jar:/opt/open/java/jdk1.8.0_121/jre/lib/rt.jar:/opt/open/java/jdk1.8.0_121/jre/lib/sunrsasign.jar:/opt/open/java/jdk1.8.0_121/jre/lib/jsse.jar:/opt/open/java/jdk1.8.0_121/jre/lib/jce.jar:/opt/open/java/jdk1.8.0_121/jre/lib/charsets.jar:/opt/open/java/jdk1.8.0_121/jre/lib/jfr.jar:/opt/open/java/jdk1.8.0_121/jre/classes
        sun.boot.library.path = /opt/open/java/jdk1.8.0_121/jre/lib/amd64
        sun.cpu.endian = little
        sun.cpu.isalist =
        sun.io.unicode.encoding = UnicodeLittle
        sun.java.command = /opt/open/jboss/7.0.0/jboss-modules.jar -mp /opt/open/jboss/7.0.0/modules org.jboss.as.server
        sun.java.launcher = SUN_STANDARD
        sun.jnu.encoding = UTF-8
        sun.management.compiler = HotSpot 64-Bit Tiered Compilers
        sun.os.patch.level = unknown
        user.country = US
        user.dir = /opt/open/jboss/7.0.0
        user.home = /export/home/spjbodr2
        user.language = en
        user.name = spjbodr2
        user.timezone = America/Sao_Paulo
2024-03-04 16:10:11,588 DEBUG [org.jboss.as.config] (MSC service thread 1-7) VM Arguments: -D[Server:srjdeapllx130_webservice_intra_5502] -Xms2048m -Xmx2048m -XX:+UseG1GC -Dbr.gov.caixa.acessoseguro.internet.url=https://acessoseguro.sso.tqs.intra.corerj.caixa -Dbr.gov.caixa.psc.connector.util.Config=/infra_app/config/sisgr/sisgr_jconnector.properties -Dbr.gov.caixa.siset.inter.url=https://logindes.caixa.gov.br -Dbr.gov.caixa.siset.role.enabled=true -Dbr.gov.caixa.siset.service.token.endpoint=/auth/realms/intranet/protocol/openid-connect/token -Dbr.gov.caixa.siset.service.unsetrole.endpoint=/servico/rest/unsetrole -Dbr.gov.caixa.siset.service.url=https://login.des.caixa -Dbr.gov.caixa.sisgr.acessoseguro.enableRecaptcha=false -Dbr.gov.caixa.sisgr.auditoria.redirect_uri=https://acessoseguro.sso.des.intra.corerj.caixa/auditoria/ -Dbr.gov.caixa.sisgr.auditoria.tokenSecret=bc47dd0c-43cd-4d79-b3e0-079e3c5e95ac -Dbr.gov.caixa.sisgr.cadastrosenha.enableRecaptcha=false -Dbr.gov.caixa.sisgr.console.redirect.uri=https://acessoseguro.sso.des.intra.corerj.caixa/console-web -Dbr.gov.caixa.sisgr.console.tokenSecret=79fd22a5-e739-4105-aa9a-5aec0d98170c -Dbr.gov.caixa.sisgr.db.alias=SGR -Dbr.gov.caixa.sisgr.gerenciadorcarga.redirect_uri=https://acessoseguro.sso.des.intra.corerj.caixa/gerenciadorcarga/ -Dbr.gov.caixa.sisgr.gerenciadorcarga.tokenSecret=546cbb4f-0040-4667-853b-730ac0ba5724 -Dbr.gov.caixa.sisgr.inter.secret=8c026412-1362-4aa4-b080-fe347cea5b69 -Dbr.gov.caixa.sisgr.manutencaousuinterno.base_url=https://acessoseguro.sso.des.intra.corerj.caixa/intranet -Dbr.gov.caixa.sisgr.manutencaousuinterno.redirect_uri=https://acessoseguro.sso.des.intra.corerj.caixa/matrizacesso/ -Dbr.gov.caixa.sisgr.matrizacesso.datasource=java:jboss/db2sgr -Dbr.gov.caixa.sisgr.matrizacesso.email.manutusu=false -Dbr.gov.caixa.sisgr.matrizacesso.normativo=http://sismn.caixa/sistema/asp/ConsultaPesquisa/pdf_comum.asp?id=NOR016039 -Dbr.gov.caixa.sisgr.matrizacesso.redirectUri=https://acessoseguro.sso.des.intra.corerj.caixa/matrizacesso -Dbr.gov.caixa.sisgr.matrizacesso.schema=SGR -Dbr.gov.caixa.sisgr.matrizacesso.siset.internet.domain=https://logindes.caixa.gov.br/ -Dbr.gov.caixa.sisgr.matrizacesso.siset.internet.id=cli-ser-sgr-batch -Dbr.gov.caixa.sisgr.matrizacesso.siset.internet.secret=8c026412-1362-4aa4-b080-fe347cea5b69 -Dbr.gov.caixa.sisgr.matrizacesso.siset.role.enabled=true -Dbr.gov.caixa.sisgr.matrizacesso.tokenSecret=25a2ceca-adcb-4373-96c9-172d5b309d7e -Dbr.gov.caixa.sisgr.monitoramentousuexterno.base_url=https://acessoseguro.sso.des.intra.corerj.caixa/intranet -Dbr.gov.caixa.sisgr.monitoramentousuexterno.redirect_uri=https://acessoseguro.sso.des.intra.corerj.caixa/sisgr_monitoramento_usuario-sso -Dbr.gov.caixa.sisgr.monitoramentousuexterno.schema=SGR -Dbr.gov.caixa.sisgr.monitoramentousuexterno.tokenSecret=d45e2cb3-00f1-434f-aa51-79b9e61b82a9 -Dbr.gov.caixa.sisgr.portal.enableRecaptcha=false -Dbr.gov.caixa.sisgr.portal.fgts.service.apikey=l73d1bf456826646088771218eb6db91f4 -Dbr.gov.caixa.sisgr.portal.fgts.service.url=https://api.des.caixa:8443/fgts/trabalhador/v1/ -Dbr.gov.caixa.sisgr.portal.service.token.sso.url=https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/token -Dbr.gov.caixa.sisgr.properties=/infra_app/config/sisgr/sisgr.properties -Dbr.gov.caixa.sisgr.template=portal -Dbr.gov.caixa.sisgr.token.client.ivKey=C01X@.08.RCL$OS2 -Dbr.gov.caixa.sisgr.token.client.key=Ct0k5n@%$9781XA~ -Dbr.gov.caixa.sisgr.token.client.url=https://acessoseguro.sso.des.intra.corerj.caixa/ -Dcaminho.arquivo.temp=/var/tmp -Dejb-ip=10.116.94.88 -Dejb-porta=:7401 -Dejb-protocolo=remote:// -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djavax.net.ssl.trustStore=/infra_app/config/certificados/cacerts -Djavax.net.ssl.trustStorePassword=changeit -Djavax.net.ssl.trustStoreType=jks -Djboss.as.management.blocking.timeout=1800 -Djboss.bind.address=srjdeapllx130 -Djboss.bind.address.management=srjdeapllx130 -Djboss.home.dir=/opt/open/jboss/7.0.0 -Djboss.management.http.port=9990 -Djboss.management.native.port=9999 -Djboss.modules.system.pkgs=org.jboss.byteman -Dmq.broker.usr=JDIRSGRD -Dmq.channel=SYSTEM.ADMIN.SVRCONN -Dmq.name=RJD2 -Dmq.port=1415 -Dmq.server=10.216.80.110 -Dsisgr.grp.usr=SGRCERTD -Djboss.server.log.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_webservice_intra_5502/log -Djboss.server.temp.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_webservice_intra_5502/tmp -Djboss.server.data.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_webservice_intra_5502/data -Dorg.jboss.boot.log.file=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_webservice_intra_5502/log/server.log -Dlogging.configuration=file:/opt/open/jboss/7.0.0/domain/configuration/default-server-logging.properties
2024-03-04 16:10:11,689 INFO  [org.xnio] (MSC service thread 1-7) XNIO version 3.3.6.Final-redhat-1
2024-03-04 16:10:11,695 INFO  [org.xnio.nio] (MSC service thread 1-7) XNIO NIO Implementation Version 3.3.6.Final-redhat-1
2024-03-04 16:10:11,721 INFO  [org.jboss.remoting] (MSC service thread 1-7) JBoss Remoting version 4.0.18.Final-redhat-1
[p585600@srjdeapllx130 ~]$
[p585600@srjdeapllx130 ~]$
[p585600@srjdeapllx130 ~]$
[p585600@srjdeapllx130 ~]$
[p585600@srjdeapllx130 ~]$
[p585600@srjdeapllx130 ~]$ grep -i -A5 -B5 "siset" /opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_acessoseguro_intra_5500/log/server.log | tail -n 100
2024-03-04 16:10:09,499 DEBUG [org.jboss.as.config] (MSC service thread 1-6) Configured system properties:
        [Server:srjdeapllx130_acessoseguro_intra_5500] =
        awt.toolkit = sun.awt.X11.XToolkit
        br.gov.caixa.acessoseguro.internet.url = https://acessoseguro.sso.tqs.intra.corerj.caixa
        br.gov.caixa.psc.connector.util.Config = /infra_app/config/sisgr/sisgr_jconnector.properties
        br.gov.caixa.siset.inter.url = https://logindes.caixa.gov.br
        br.gov.caixa.siset.role.enabled = true
        br.gov.caixa.siset.service.token.endpoint = /auth/realms/intranet/protocol/openid-connect/token
        br.gov.caixa.siset.service.unsetrole.endpoint = /servico/rest/unsetrole
        br.gov.caixa.siset.service.url = https://login.des.caixa
        br.gov.caixa.sisgr.acessoseguro.enableRecaptcha = false
        br.gov.caixa.sisgr.auditoria.redirect_uri = https://acessoseguro.sso.des.intra.corerj.caixa/auditoria/
        br.gov.caixa.sisgr.auditoria.tokenSecret = bc47dd0c-43cd-4d79-b3e0-079e3c5e95ac
        br.gov.caixa.sisgr.cadastrosenha.enableRecaptcha = false
        br.gov.caixa.sisgr.console.redirect.uri = https://acessoseguro.sso.des.intra.corerj.caixa/console-web
--
        br.gov.caixa.sisgr.matrizacesso.datasource = java:jboss/db2sgr
        br.gov.caixa.sisgr.matrizacesso.email.manutusu = false
        br.gov.caixa.sisgr.matrizacesso.normativo = http://sismn.caixa/sistema/asp/ConsultaPesquisa/pdf_comum.asp?id=NOR016039
        br.gov.caixa.sisgr.matrizacesso.redirectUri = https://acessoseguro.sso.des.intra.corerj.caixa/matrizacesso
        br.gov.caixa.sisgr.matrizacesso.schema = SGR
        br.gov.caixa.sisgr.matrizacesso.siset.internet.domain = https://logindes.caixa.gov.br/
        br.gov.caixa.sisgr.matrizacesso.siset.internet.id = cli-ser-sgr-batch
        br.gov.caixa.sisgr.matrizacesso.siset.internet.secret = 8c026412-1362-4aa4-b080-fe347cea5b69
        br.gov.caixa.sisgr.matrizacesso.siset.role.enabled = true
        br.gov.caixa.sisgr.matrizacesso.tokenSecret = 25a2ceca-adcb-4373-96c9-172d5b309d7e
        br.gov.caixa.sisgr.monitoramentousuexterno.base_url = https://acessoseguro.sso.des.intra.corerj.caixa/intranet
        br.gov.caixa.sisgr.monitoramentousuexterno.redirect_uri = https://acessoseguro.sso.des.intra.corerj.caixa/sisgr_monitoramento_usuario-sso
        br.gov.caixa.sisgr.monitoramentousuexterno.schema = SGR
        br.gov.caixa.sisgr.monitoramentousuexterno.tokenSecret = d45e2cb3-00f1-434f-aa51-79b9e61b82a9
--
        user.dir = /opt/open/jboss/7.0.0
        user.home = /export/home/spjbodr2
        user.language = en
        user.name = spjbodr2
        user.timezone = America/Sao_Paulo
2024-03-04 16:10:09,500 DEBUG [org.jboss.as.config] (MSC service thread 1-6) VM Arguments: -D[Server:srjdeapllx130_acessoseguro_intra_5500] -Xms2048m -Xmx2048m -XX:+UseG1GC -Dbr.gov.caixa.acessoseguro.internet.url=https://acessoseguro.sso.tqs.intra.corerj.caixa -Dbr.gov.caixa.psc.connector.util.Config=/infra_app/config/sisgr/sisgr_jconnector.properties -Dbr.gov.caixa.siset.inter.url=https://logindes.caixa.gov.br -Dbr.gov.caixa.siset.role.enabled=true -Dbr.gov.caixa.siset.service.token.endpoint=/auth/realms/intranet/protocol/openid-connect/token -Dbr.gov.caixa.siset.service.unsetrole.endpoint=/servico/rest/unsetrole -Dbr.gov.caixa.siset.service.url=https://login.des.caixa -Dbr.gov.caixa.sisgr.acessoseguro.enableRecaptcha=false -Dbr.gov.caixa.sisgr.auditoria.redirect_uri=https://acessoseguro.sso.des.intra.corerj.caixa/auditoria/ -Dbr.gov.caixa.sisgr.auditoria.tokenSecret=bc47dd0c-43cd-4d79-b3e0-079e3c5e95ac -Dbr.gov.caixa.sisgr.cadastrosenha.enableRecaptcha=false -Dbr.gov.caixa.sisgr.console.redirect.uri=https://acessoseguro.sso.des.intra.corerj.caixa/console-web -Dbr.gov.caixa.sisgr.console.tokenSecret=79fd22a5-e739-4105-aa9a-5aec0d98170c -Dbr.gov.caixa.sisgr.db.alias=SGR -Dbr.gov.caixa.sisgr.gerenciadorcarga.redirect_uri=https://acessoseguro.sso.des.intra.corerj.caixa/gerenciadorcarga/ -Dbr.gov.caixa.sisgr.gerenciadorcarga.tokenSecret=546cbb4f-0040-4667-853b-730ac0ba5724 -Dbr.gov.caixa.sisgr.inter.secret=8c026412-1362-4aa4-b080-fe347cea5b69 -Dbr.gov.caixa.sisgr.manutencaousuinterno.base_url=https://acessoseguro.sso.des.intra.corerj.caixa/intranet -Dbr.gov.caixa.sisgr.manutencaousuinterno.redirect_uri=https://acessoseguro.sso.des.intra.corerj.caixa/matrizacesso/ -Dbr.gov.caixa.sisgr.matrizacesso.datasource=java:jboss/db2sgr -Dbr.gov.caixa.sisgr.matrizacesso.email.manutusu=false -Dbr.gov.caixa.sisgr.matrizacesso.normativo=http://sismn.caixa/sistema/asp/ConsultaPesquisa/pdf_comum.asp?id=NOR016039 -Dbr.gov.caixa.sisgr.matrizacesso.redirectUri=https://acessoseguro.sso.des.intra.corerj.caixa/matrizacesso -Dbr.gov.caixa.sisgr.matrizacesso.schema=SGR -Dbr.gov.caixa.sisgr.matrizacesso.siset.internet.domain=https://logindes.caixa.gov.br/ -Dbr.gov.caixa.sisgr.matrizacesso.siset.internet.id=cli-ser-sgr-batch -Dbr.gov.caixa.sisgr.matrizacesso.siset.internet.secret=8c026412-1362-4aa4-b080-fe347cea5b69 -Dbr.gov.caixa.sisgr.matrizacesso.siset.role.enabled=true -Dbr.gov.caixa.sisgr.matrizacesso.tokenSecret=25a2ceca-adcb-4373-96c9-172d5b309d7e -Dbr.gov.caixa.sisgr.monitoramentousuexterno.base_url=https://acessoseguro.sso.des.intra.corerj.caixa/intranet -Dbr.gov.caixa.sisgr.monitoramentousuexterno.redirect_uri=https://acessoseguro.sso.des.intra.corerj.caixa/sisgr_monitoramento_usuario-sso -Dbr.gov.caixa.sisgr.monitoramentousuexterno.schema=SGR -Dbr.gov.caixa.sisgr.monitoramentousuexterno.tokenSecret=d45e2cb3-00f1-434f-aa51-79b9e61b82a9 -Dbr.gov.caixa.sisgr.portal.enableRecaptcha=false -Dbr.gov.caixa.sisgr.portal.fgts.service.apikey=l73d1bf456826646088771218eb6db91f4 -Dbr.gov.caixa.sisgr.portal.fgts.service.url=https://api.des.caixa:8443/fgts/trabalhador/v1/ -Dbr.gov.caixa.sisgr.portal.service.token.sso.url=https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/token -Dbr.gov.caixa.sisgr.properties=/infra_app/config/sisgr/sisgr.properties -Dbr.gov.caixa.sisgr.template=portal -Dbr.gov.caixa.sisgr.token.client.ivKey=C01X@.08.RCL$OS2 -Dbr.gov.caixa.sisgr.token.client.key=Ct0k5n@%$9781XA~ -Dbr.gov.caixa.sisgr.token.client.url=https://acessoseguro.sso.des.intra.corerj.caixa/ -Dcaminho.arquivo.temp=/var/tmp -Dejb-ip=10.116.94.88 -Dejb-porta=:7401 -Dejb-protocolo=remote:// -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djavax.net.ssl.trustStore=/infra_app/config/certificados/cacerts -Djavax.net.ssl.trustStorePassword=changeit -Djavax.net.ssl.trustStoreType=jks -Djboss.as.management.blocking.timeout=1800 -Djboss.bind.address=srjdeapllx130 -Djboss.bind.address.management=srjdeapllx130 -Djboss.home.dir=/opt/open/jboss/7.0.0 -Djboss.management.http.port=9990 -Djboss.management.native.port=9999 -Djboss.modules.system.pkgs=org.jboss.byteman -Dmq.broker.usr=JDIRSGRD -Dmq.channel=SYSTEM.ADMIN.SVRCONN -Dmq.name=RJD2 -Dmq.port=1415 -Dmq.server=10.216.80.110 -Dsisgr.grp.usr=SGRCERTD -Djboss.server.log.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_acessoseguro_intra_5500/log -Djboss.server.temp.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_acessoseguro_intra_5500/tmp -Djboss.server.data.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_acessoseguro_intra_5500/data -Dorg.jboss.boot.log.file=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_acessoseguro_intra_5500/log/server.log -Dlogging.configuration=file:/opt/open/jboss/7.0.0/domain/configuration/default-server-logging.properties
2024-03-04 16:10:09,571 INFO  [org.xnio] (MSC service thread 1-8) XNIO version 3.3.6.Final-redhat-1
2024-03-04 16:10:09,578 INFO  [org.xnio.nio] (MSC service thread 1-8) XNIO NIO Implementation Version 3.3.6.Final-redhat-1
2024-03-04 16:10:09,601 INFO  [org.jboss.remoting] (MSC service thread 1-8) JBoss Remoting version 4.0.18.Final-redhat-1
[p585600@srjdeapllx130 ~]$
[p585600@srjdeapllx130 ~]$
[p585600@srjdeapllx130 ~]$
[p585600@srjdeapllx130 ~]$ curl -vk --max-time 10 https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
* About to connect() to login.des.caixa port 443 (#0)
*   Trying 10.116.81.74...
* Connected to login.des.caixa (10.116.81.74) port 443 (#0)
* Initializing NSS with certpath: sql:/etc/pki/nssdb
* skipping SSL peer certificate verification
* SSL connection using TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256
* Server certificate:
*       subject: CN=login.des.caixa,O=Caixa Economica Federal,C=BR
*       start date: Jun 04 16:14:16 2024 GMT
*       expire date: Jun 04 16:24:16 2029 GMT
*       common name: login.des.caixa
*       issuer: CN=AC Icptestes Sub,O=Caixa Economica Federal,C=BR
> GET /auth/realms/intranet/protocol/openid-connect/token HTTP/1.1
> User-Agent: curl/7.29.0
> Host: login.des.caixa
> Accept: */*
>
< HTTP/1.1 405 Method Not Allowed
< Date: Mon, 27 Jul 2026 17:23:21 GMT
< Server: Apache/2.4.46 (Unix) OpenSSL/1.0.1e-fips
< Content-Length: 0
< Request-Context: appId=f94af886-cd60-4c6e-b856-7185f640fe46
< Strict-Transport-Security: max-age=15768000
<
* Connection #0 to host login.des.caixa left intact
[p585600@srjdeapllx130 ~]$
