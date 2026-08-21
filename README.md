[root@srjdeapllx158 configuration]# ps -ef | grep "Server:srjdeapllx158_sifpp_intra_8081" | grep -v grep | grep -o "DENDPOINT_MICRO=[^ ]*"
DENDPOINT_MICRO=https://sifpp-micro-des.apps.nprd.caixa
[root@srjdeapllx158 configuration]#
[root@srjdeapllx158 configuration]#
[root@srjdeapllx158 configuration]# tail -50 /opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081/log/server.log
        jboss.modules.dir = /opt/open/jboss/7.0.0/modules
        jboss.modules.system.pkgs = org.jboss.byteman
        jboss.node.name = srjdeapllx158:srjdeapllx158_sifpp_intra_8081
        jboss.qualified.host.name = srjdeapllx158
        jboss.server.base.dir = /opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081
        jboss.server.config.dir = /opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081/configuration
        jboss.server.data.dir = /opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081/data
        jboss.server.deploy.dir = /opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081/data/content
        jboss.server.log.dir = /opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081/log
        jboss.server.name = srjdeapllx158_sifpp_intra_8081
        jboss.server.persist.config = true
        jboss.server.temp.dir = /opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081/tmp
        line.separator =

        logging.configuration = file:/opt/open/jboss/7.0.0/domain/configuration/default-server-logging.properties
        module.path = /opt/open/jboss/7.0.0/modules
        org.jboss.boot.log.file = /opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081/log/server.log
        org.jboss.resolver.warning = true
        org.xml.sax.driver = __redirected.__XMLReaderFactory
        os.arch = amd64
        os.name = Linux
        os.version = 3.10.0-862.11.6.el7.x86_64
        path.separator = :
        sicpu.local = https://central.mobilidade.des.intra.corerj.caixa/sicpu/
        sigdb.recebe = /infra_app/config/sifpp/sigdb/
        sigdb.transmite = /usr/local/sigdb/TRANSMITE
        simma.local = https://des.analytics.mobilidade.caixa.gov.br/analytics/
        sisit.local = https://des.central.mobilidade.caixa.gov.br/sisit/
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
2023-03-21 19:00:19,040 DEBUG [org.jboss.as.config] (MSC service thread 1-7) VM Arguments: -D[Server:srjdeapllx158_sifpp_intra_8081] -Xms2048m -Xmx2048m -XX:+UseG1GC -DAUTHENTICATION_SERVER_URL=https://acessoseguro.sso.des.intra.corerj.caixa/api/auth/token -DCLIENT_ID=sifpp-intra -DCLIENT_SECRET=3d56da36-ae05-41f8-831f-893fbb849bf2 -DRESOURCE_SERVER_URL=https://acessoseguro.sso.des.intra.corerj.caixa/api/ -DSICPU_APLICATIVO=817 -DSICPU_APP=3058459957320e715a8f1ae6a5005e9db5c25fa9 -DSICPU_PASSWORD=bd2547c2db5e7faf9bee5babe76b8d0e9e2a0dca -DSICPU_USER=SIFPP -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djboss.bind.address=srjdeapllx158 -Djboss.bind.address.management=srjdeapllx158 -Djboss.home.dir=/opt/open/jboss/7.0.0 -Djboss.management.http.port=9990 -Djboss.management.native.port=9999 -Djboss.modules.system.pkgs=org.jboss.byteman -Dsicpu.local=https://central.mobilidade.des.intra.corerj.caixa/sicpu/ -Dsigdb.recebe=/infra_app/config/sifpp/sigdb/ -Dsigdb.transmite=/usr/local/sigdb/TRANSMITE -Dsimma.local=https://des.analytics.mobilidade.caixa.gov.br/analytics/ -Dsisit.local=https://des.central.mobilidade.caixa.gov.br/sisit/ -Djboss.server.log.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081/log -Djboss.server.temp.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081/tmp -Djboss.server.data.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081/data -Dorg.jboss.boot.log.file=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081/log/server.log -Dlogging.configuration=file:/opt/open/jboss/7.0.0/domain/configuration/default-server-logging.properties
2023-03-21 19:00:19,234 INFO  [org.xnio] (MSC service thread 1-7) XNIO version 3.3.6.Final-redhat-1
2023-03-21 19:00:19,246 INFO  [org.xnio.nio] (MSC service thread 1-7) XNIO NIO Implementation Version 3.3.6.Final-redhat-1
2023-03-21 19:00:19,320 INFO  [org.jboss.remoting] (MSC service thread 1-7) JBoss Remoting version 4.0.18.Final-redhat-1
2023-03-21 19:00:21,902 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 30) WFLYCTL0028: Attribute 'default-stack' in the resource at address '/subsystem=jgroups' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[root@srjdeapllx158 configuration]#
