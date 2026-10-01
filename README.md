www.redhat.com/
        java.vendor.url.bug = https://access.redhat.com/support/cases/
        java.vendor.version = (Red_Hat-21.0.10.0.7-1)
        java.version = 21.0.10
        java.version.date = 2026-01-20
        java.vm.compressedOopsMode = 32-bit
        java.vm.info = mixed mode, sharing
        java.vm.name = OpenJDK 64-Bit Server VM
        java.vm.specification.name = Java Virtual Machine Specification
        java.vm.specification.vendor = Oracle Corporation
        java.vm.specification.version = 21
        java.vm.vendor = Red Hat, Inc.
        java.vm.version = 21.0.10+7-LTS
        javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
        javax.net.ssl.trustStore = /opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks
        jboss.bind.address = 25.0.3.230
        jboss.bind.address.management = 0.0.0.0
        jboss.bind.address.private = 25.0.3.230
        jboss.home.dir = /opt/server
        jboss.host.name = sihdg-jboss8-tqs-25-8k2nr
        jboss.messaging.cluster.password = <redacted>
        jboss.messaging.host = 25.0.3.230
        jboss.modules.system.pkgs = jdk.nashorn.api,com.sun.crypto.provider
        jboss.node.name = sihdg-jboss8-tqs-25-8k2nr
        jboss.qualified.host.name = sihdg-jboss8-tqs-25-8k2nr
        jboss.server.base.dir = /opt/server/standalone
        jboss.server.config.dir = /opt/server/standalone/configuration
        jboss.server.data.dir = /opt/server/standalone/data
        jboss.server.log.dir = /opt/server/standalone/log
        jboss.server.name = sihdg-jboss8-tqs-25-8k2nr
        jboss.server.persist.config = true
        jboss.server.temp.dir = /opt/server/standalone/tmp
        jboss.tx.node.id = hdg-jboss8-tqs-25-8k2nr
        jdk.debug = release
        jdk.serialFilter = maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
        line.separator =

        logging.configuration = file:/opt/server/standalone/configuration/logging.properties
        module.path = /opt/server/modules
        native.encoding = ANSI_X3.4-1968
        org.jboss.boot.log.file = /opt/server/standalone/log/server.log
        org.jboss.resolver.warning = true
        org.wildfly.internal.cli.boot.hook.marker.dir = /tmp/cli-boot-reload-marker-1790867799
        org.wildfly.internal.cli.boot.hook.script = /tmp/cli-script-1790867798.cli
        org.wildfly.internal.cli.boot.hook.script.error.file = /tmp/cli-script-error-1790867798.cli
        org.wildfly.internal.cli.boot.hook.script.output.file = /tmp/cli-script-output-1790867798.cli
        org.wildfly.internal.cli.boot.hook.script.properties = /tmp/cli-script-property-1790867798.cli
        org.wildfly.internal.cli.boot.hook.script.warn.file = /tmp/cli-warning-1790867798.log
        os.arch = amd64
        os.name = Linux
        os.version = 6.1.18-200.fc37.x86_64
        path.separator = :
        stderr.encoding = ANSI_X3.4-1968
        stdout.encoding = ANSI_X3.4-1968
        sun.arch.data.model = 64
        sun.boot.library.path = /usr/lib/jvm/java-21-openjdk-21.0.10.0.7-1.el9.x86_64/lib
        sun.cpu.endian = little
        sun.io.unicode.encoding = UnicodeLittle
        sun.java.command = /opt/server/jboss-modules.jar -mp /opt/server/modules org.jboss.as.standalone -Djboss.home.dir=/opt/server -Djboss.server.base.dir=/opt/server/standalone -c standalone.xml -Djboss.messaging.host=25.0.3.230 -Djboss.messaging.cluster.password=<redacted> --start-mode=admin-only -Dorg.wildfly.internal.cli.boot.hook.script=/tmp/cli-script-1790867798.cli -Dorg.wildfly.internal.cli.boot.hook.marker.dir=/tmp/cli-boot-reload-marker-1790867799 -Dorg.wildfly.internal.cli.boot.hook.script.properties=/tmp/cli-script-property-1790867798.cli -Dorg.wildfly.internal.cli.boot.hook.script.error.file=/tmp/cli-script-error-1790867798.cli -Dorg.wildfly.internal.cli.boot.hook.script.warn.file=/tmp/cli-warning-1790867798.log -Dorg.wildfly.internal.cli.boot.hook.script.output.file=/tmp/cli-script-output-1790867798.cli -Djboss.node.name=sihdg-jboss8-tqs-25-8k2nr -Djboss.tx.node.id=hdg-jboss8-tqs-25-8k2nr -bprivate 25.0.3.230 -b 25.0.3.230 -bmanagement 0.0.0.0 -Dwildfly.statistics-enabled=true
        sun.java.launcher = SUN_STANDARD
        sun.jnu.encoding = ANSI_X3.4-1968
        sun.management.compiler = HotSpot 64-Bit Tiered Compilers
        user.country = US
        user.dir = /home/jboss
        user.home = /home/jboss
        user.language = en
        user.name = jboss
        user.timezone = America/Sao_Paulo
        wildfly.statistics-enabled = true
12:16:48,929 DEBUG [org.jboss.as.config] (MSC service thread 1-2) VM Arguments: -D[Standalone] -Xlog:gc*:file=/opt/server/standalone/log/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider -Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djava.security.properties=/opt/server/bin/java.security.override --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-exports=jdk.naming.dns/com.sun.jndi.dns=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/opt/server/standalone/log/server.log -Dlogging.configuration=file:/opt/server/standalone/configuration/logging.properties
12:16:50,554 INFO  [org.wildfly.security] (ServerService Thread Pool -- 16) ELY00001: WildFly Elytron version 2.2.14.Final-redhat-00001
12:16:52,208 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
12:16:52,925 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY00023: KeyStore file '/opt/server/standalone/configuration/application.keystore' does not exist. Used blank.
12:16:52,927 INFO  [org.xnio] (MSC service thread 1-2) XNIO version 3.8.16.Final-redhat-00001
12:16:52,932 INFO  [org.xnio.nio] (MSC service thread 1-2) XNIO NIO Implementation Version 3.8.16.Final-redhat-00001
12:16:52,964 INFO  [org.jboss.remoting] (MSC service thread 1-2) JBoss Remoting version 5.0.31.Final-redhat-00001
12:16:53,336 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY01084: KeyStore /opt/server/standalone/configuration/application.keystore not found, it will be auto-generated on first use with a self-signed certificate for host localhost
12:16:53,557 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
12:16:53,559 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://0.0.0.0:9990/management
12:16:53,559 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0054: Admin console is not enabled
12:16:53,559 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) started in 13868ms - Started 72 of 84 services (26 services are lazy, passive or on-demand) - Server configuration file in use: standalone.xml
12:16:53,560 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0472: Checking for presence of marker file indicating that the server has been restarted following execution of the additional commands from the CLI script
12:16:53,560 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0474: No marker file found indicating that the server has been restarted following execution of the additional commands from the CLI script
12:16:53,560 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0466: Initialised the additional boot CLI script functionality. The CLI commands will be read from /tmp/cli-script-1790867798.cli. The server will be rebooted to normal mode after these have been executed
12:16:53,566 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0467: Running the additional commands from the CLI script /tmp/cli-script-1790867798.cli against the server which is running in admin-only mode
12:16:53,567 INFO  [org.jboss.as.cli] (Controller Boot Thread) WFLYCLI0001: Processing CLI script /tmp/cli-script-1790867798.cli
12:16:54,062 INFO  [org.jboss.as.cli] (Controller Boot Thread) WFLYCLI0005: Done processing CLI script /tmp/cli-script-1790867798.cli
12:16:54,063 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0468: Completed running the commands from the CLI script
12:16:54,063 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0470: Reloading the server to normal mode after execution of the additional commands from the CLI script. This will clear the properties triggering the additional boot cli script functionality if they were set (org.wildfly.internal.cli.boot.hook.script, org.wildfly.internal.cli.boot.hook.reload.skip, org.wildfly.internal.cli.boot.hook.marker.dir), and delete the marker file indicating the server was restarted
12:16:54,080 INFO  [org.jboss.as] (MSC service thread 1-1) WFLYSRV0050: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) stopped in 15ms
12:16:54,257 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) starting
12:16:54,258 DEBUG [org.jboss.as.config] (MSC service thread 1-2) Configured system properties:
        [Standalone] =
        br.gov.caixa.sisgr.auth.url = https://webservice.acessoseguro.des.corerj.caixa/sisgrauth-web/
        file.encoding = UTF-8
        file.separator = /
        java.class.path = /opt/server/jboss-modules.jar
        java.class.version = 65.0
        java.home = /usr/lib/jvm/java-21-openjdk-21.0.10.0.7-1.el9.x86_64
        java.io.tmpdir = /tmp
        java.library.path = /usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib
        java.net.preferIPv4Stack = true
        java.runtime.name = OpenJDK Runtime Environment
        java.runtime.version = 21.0.10+7-LTS
        java.security.egd = file:/dev/./urandom
        java.security.properties = /opt/server/bin/java.security.override
        java.specification.name = Java Platform API Specification
        java.specification.vendor = Oracle Corporation
        java.specification.version = 21
        java.util.logging.manager = org.jboss.logmanager.LogManager
        java.vendor = Red Hat, Inc.
        java.vendor.url = https://www.redhat.com/
        java.vendor.url.bug = https://access.redhat.com/support/cases/
        java.vendor.version = (Red_Hat-21.0.10.0.7-1)
        java.version = 21.0.10
        java.version.date = 2026-01-20
        java.vm.compressedOopsMode = 32-bit
        java.vm.info = mixed mode, sharing
        java.vm.name = OpenJDK 64-Bit Server VM
        java.vm.specification.name = Java Virtual Machine Specification
        java.vm.specification.vendor = Oracle Corporation
        java.vm.specification.version = 21
        java.vm.vendor = Red Hat, Inc.
        java.vm.version = 21.0.10+7-LTS
        javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
        javax.net.ssl.trustStore = /opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks
        jboss.bind.address = 25.0.3.230
        jboss.bind.address.management = 0.0.0.0
        jboss.bind.address.private = 25.0.3.230
        jboss.home.dir = /opt/server
        jboss.host.name = sihdg-jboss8-tqs-25-8k2nr
        jboss.messaging.cluster.password = <redacted>
        jboss.messaging.host = 25.0.3.230
        jboss.modules.system.pkgs = jdk.nashorn.api,com.sun.crypto.provider
        jboss.node.name = sihdg-jboss8-tqs-25-8k2nr
        jboss.qualified.host.name = sihdg-jboss8-tqs-25-8k2nr
        jboss.server.base.dir = /opt/server/standalone
        jboss.server.config.dir = /opt/server/standalone/configuration
        jboss.server.data.dir = /opt/server/standalone/data
        jboss.server.log.dir = /opt/server/standalone/log
        jboss.server.name = sihdg-jboss8-tqs-25-8k2nr
        jboss.server.persist.config = true
        jboss.server.temp.dir = /opt/server/standalone/tmp
        jboss.tx.node.id = hdg-jboss8-tqs-25-8k2nr
        jdk.debug = release
        jdk.serialFilter = maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
        line.separator =

        logging.configuration = file:/opt/server/standalone/configuration/logging.properties
        module.path = /opt/server/modules
        native.encoding = ANSI_X3.4-1968
        org.jboss.boot.log.file = /opt/server/standalone/log/server.log
        org.jboss.resolver.warning = true
        org.wildfly.internal.cli.boot.hook.script.error.file = /tmp/cli-script-error-1790867798.cli
        org.wildfly.internal.cli.boot.hook.script.output.file = /tmp/cli-script-output-1790867798.cli
        org.wildfly.internal.cli.boot.hook.script.properties = /tmp/cli-script-property-1790867798.cli
        org.wildfly.internal.cli.boot.hook.script.warn.file = /tmp/cli-warning-1790867798.log
        os.arch = amd64
        os.name = Linux
        os.version = 6.1.18-200.fc37.x86_64
        path.separator = :
        siaud.INT_URL_API_MANAGER = http://des.web.corerj.caixa:8642/
        siaud.int.siico.api.key = l75b3690bee55a4994a4efb88fe248b4d9
        siaud.int.url.api.manager = http://api.des.caixa:8080/
        siaud.int.url.legado = https://des.web.corerj.caixa:8605/siaud/
        stderr.encoding = ANSI_X3.4-1968
        stdout.encoding = ANSI_X3.4-1968
        sun.arch.data.model = 64
        sun.boot.library.path = /usr/lib/jvm/java-21-openjdk-21.0.10.0.7-1.el9.x86_64/lib
        sun.cpu.endian = little
        sun.io.unicode.encoding = UnicodeLittle
        sun.java.command = /opt/server/jboss-modules.jar -mp /opt/server/modules org.jboss.as.standalone -Djboss.home.dir=/opt/server -Djboss.server.base.dir=/opt/server/standalone -c standalone.xml -Djboss.messaging.host=25.0.3.230 -Djboss.messaging.cluster.password=<redacted> --start-mode=admin-only -Dorg.wildfly.internal.cli.boot.hook.script=/tmp/cli-script-1790867798.cli -Dorg.wildfly.internal.cli.boot.hook.marker.dir=/tmp/cli-boot-reload-marker-1790867799 -Dorg.wildfly.internal.cli.boot.hook.script.properties=/tmp/cli-script-property-1790867798.cli -Dorg.wildfly.internal.cli.boot.hook.script.error.file=/tmp/cli-script-error-1790867798.cli -Dorg.wildfly.internal.cli.boot.hook.script.warn.file=/tmp/cli-warning-1790867798.log -Dorg.wildfly.internal.cli.boot.hook.script.output.file=/tmp/cli-script-output-1790867798.cli -Djboss.node.name=sihdg-jboss8-tqs-25-8k2nr -Djboss.tx.node.id=hdg-jboss8-tqs-25-8k2nr -bprivate 25.0.3.230 -b 25.0.3.230 -bmanagement 0.0.0.0 -Dwildfly.statistics-enabled=true
        sun.java.launcher = SUN_STANDARD
        sun.jnu.encoding = ANSI_X3.4-1968
        sun.management.compiler = HotSpot 64-Bit Tiered Compilers
        sun.nio.ch.bugLevel =
        url_key_cloack = https://login.des.caixa/auth
        url_key_cloack_realm = intranet
        url_siaud_acompanhamento = http://localhost:8888/siaud/siaud-acompanhamento-service
        url_siaud_acompanhamentoweb = http://localhost:8888/siaud/acompanhamento
        url_siaud_execucao = http://localhost:8898/siaud
        url_siaud_planejamento = http://localhost:8898/siaud
        url_siico = http://des.web.corerj.caixa:8642/siicorjapi/v1/
        url_sisgr = https://webservice.acessoseguro.sso.des.intra.corerj.caixa/sisgrauth-web/v1/
        user.country = US
        user.dir = /home/jboss
        user.home = /home/jboss
        user.language = en
        user.name = jboss
        user.timezone = America/Sao_Paulo
        wildfly.statistics-enabled = true
12:16:54,258 DEBUG [org.jboss.as.config] (MSC service thread 1-2) VM Arguments: -D[Standalone] -Xlog:gc*:file=/opt/server/standalone/log/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider -Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djava.security.properties=/opt/server/bin/java.security.override --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-exports=jdk.naming.dns/com.sun.jndi.dns=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/opt/server/standalone/log/server.log -Dlogging.configuration=file:/opt/server/standalone/configuration/logging.properties
12:16:55,227 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 3) WFLYDR0001: Content added at location /opt/server/standalone/data/content/3e/8a0ccd5f2075dde65d82301fd94a1b7505d0bc/content
12:16:55,242 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
12:16:55,263 INFO  [org.wildfly.extension.elytron.oidc._private] (ServerService Thread Pool -- 32) WFLYOIDC0001: Activating WildFly Elytron OIDC Subsystem
12:16:55,264 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 34) WFLYCLINF0001: Activating Infinispan subsystem.
12:16:55,264 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 36) WFLYRS0016: RESTEasy version 6.2.15.Final-redhat-00002
12:16:55,265 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 33) WFLYHEALTH0001: Activating Base Health Subsystem
12:16:55,265 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 35) WFLYIO001: Worker 'default' has auto-configured to 2 IO threads with 16 max task threads based on your 1 available processors
12:16:55,266 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 40) WFLYNAM0001: Activating Naming Subsystem
12:16:55,453 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 44) WFLYUT0112: The value 'require-host-http11' attribute in the '/subsystem=undertow/server=default-server/http-listener=default' resource is 'false', which will be ignored. The server now always enforces the RFC 9112 requirement that HTTP/1.1 request messages include a Host header.
12:16:55,458 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Starting deployment of "sihdg-3.17.0.0.ear" (runtime-name: "sihdg-3.17.0.0.ear")
12:16:55,818 INFO  [org.jboss.as.connector] (MSC service thread 1-2) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 3.0.14.Final-redhat-00001)
12:16:55,820 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0003: Undertow 2.3.23.SP3-redhat-00001 starting
12:16:55,853 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY00023: KeyStore file '/opt/server/standalone/configuration/application.keystore' does not exist. Used blank.
12:16:58,069 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 16 (per class), which is derived from thread worker pool sizing.
12:16:58,069 INFO  [org.jboss.as.naming] (MSC service thread 1-2) WFLYNAM0003: Starting Naming Service
12:16:58,158 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY01084: KeyStore /opt/server/standalone/configuration/application.keystore not found, it will be auto-generated on first use with a self-signed certificate for host localhost
12:16:58,158 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 27) WFLYJCA0004: Deploying JDBC-compliant driver class com.microsoft.sqlserver.jdbc.SQLServerDriver (version 12.6)
12:16:58,163 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Started Driver service with driver-name = sqlserver
12:16:58,164 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0012: Started server default-server.
12:16:58,262 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: Undertow HTTP listener default listening on 0.0.0.0:8080
12:16:58,263 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) Queuing requests.
12:16:58,263 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0018: Host default-host starting
12:16:58,364 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-2) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/server/standalone/deployments
12:16:58,564 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0493: Jakarta Enterprise Beans subsystem suspension complete
12:16:58,668 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) WFLYJCA0001: Bound data source [java:jboss/jdbc/sihdgDS]
12:16:59,111 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0207: Starting subdeployment (runtime-name: "sihdg-api.war")
12:17:05,190 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0001: /content/sihdg-3.17.0.0.ear/sihdg-api.war/WEB-INF/jboss-deployment-structure.xml in subdeployment ignored. jboss-deployment-structure.xml is only parsed for top level deployments.
12:17:12,655 INFO  [org.jboss.as.jpa] (MSC service thread 1-2) WFLYJPA0002: Read persistence.xml for sihdgDS
12:17:12,658 INFO  [org.wildfly.extension.elytron.oidc._private] (MSC service thread 1-2) WFLYOIDC0002: Elytron OIDC Client subsystem override for deployment 'sihdg-api.war'
12:17:13,072 INFO  [org.jipijapa] (MSC service thread 1-1) JIPIORMV6020260: Second level cache enabled for sihdg-3.17.0.0.ear/sihdg-api.war#sihdgDS
12:17:13,181 INFO  [org.jboss.weld.deployer] (MSC service thread 1-2) WFLYWELD0003: Processing weld deployment sihdg-3.17.0.0.ear
12:17:13,490 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-2) HV000001: Hibernate Validator 8.0.2.Final-redhat-00001
12:17:14,172 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 47) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.marshalling.jboss.JBossMarshaller'
12:17:14,279 INFO  [org.jboss.weld.deployer] (MSC service thread 1-2) WFLYWELD0003: Processing weld deployment sihdg-api.war
12:17:14,452 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'GestaoCargaFcAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/GestaoCargaFcAS!br.gov.caixa.bsb.sihdg.core.service.GestaoCargaFcAS
        java:app/sihdg-api/GestaoCargaFcAS!br.gov.caixa.bsb.sihdg.core.service.GestaoCargaFcAS
        java:module/GestaoCargaFcAS!br.gov.caixa.bsb.sihdg.core.service.GestaoCargaFcAS
        java:global/sihdg-3.17.0.0/sihdg-api/GestaoCargaFcAS
        java:app/sihdg-api/GestaoCargaFcAS
        java:module/GestaoCargaFcAS

12:17:14,453 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoItemDerivativoFcAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/MovimentacaoItemDerivativoFcAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoItemDerivativoFcAS
        java:app/sihdg-api/MovimentacaoItemDerivativoFcAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoItemDerivativoFcAS
        java:module/MovimentacaoItemDerivativoFcAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoItemDerivativoFcAS
        java:global/sihdg-3.17.0.0/sihdg-api/MovimentacaoItemDerivativoFcAS
        java:app/sihdg-api/MovimentacaoItemDerivativoFcAS
        java:module/MovimentacaoItemDerivativoFcAS

12:17:14,453 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'CtcfAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/CtcfAS!br.gov.caixa.bsb.sihdg.core.service.CtcfAS
        java:app/sihdg-api/CtcfAS!br.gov.caixa.bsb.sihdg.core.service.CtcfAS
        java:module/CtcfAS!br.gov.caixa.bsb.sihdg.core.service.CtcfAS
        java:global/sihdg-3.17.0.0/sihdg-api/CtcfAS
        java:app/sihdg-api/CtcfAS
        java:module/CtcfAS

12:17:14,453 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'RelatorioAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/RelatorioAS!br.gov.caixa.bsb.sihdg.core.service.RelatorioAS
        java:app/sihdg-api/RelatorioAS!br.gov.caixa.bsb.sihdg.core.service.RelatorioAS
        java:module/RelatorioAS!br.gov.caixa.bsb.sihdg.core.service.RelatorioAS
        java:global/sihdg-3.17.0.0/sihdg-api/RelatorioAS
        java:app/sihdg-api/RelatorioAS
        java:module/RelatorioAS

12:17:14,453 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoTransacaoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/MovimentacaoTransacaoAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoTransacaoAS
        java:app/sihdg-api/MovimentacaoTransacaoAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoTransacaoAS
        java:module/MovimentacaoTransacaoAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoTransacaoAS
        java:global/sihdg-3.17.0.0/sihdg-api/MovimentacaoTransacaoAS
        java:app/sihdg-api/MovimentacaoTransacaoAS
        java:module/MovimentacaoTransacaoAS

12:17:14,453 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'SafraFcAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/SafraFcAS!br.gov.caixa.bsb.sihdg.core.service.SafraFcAS
        java:app/sihdg-api/SafraFcAS!br.gov.caixa.bsb.sihdg.core.service.SafraFcAS
        java:module/SafraFcAS!br.gov.caixa.bsb.sihdg.core.service.SafraFcAS
        java:global/sihdg-3.17.0.0/sihdg-api/SafraFcAS
        java:app/sihdg-api/SafraFcAS
        java:module/SafraFcAS

12:17:14,453 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'DerivativoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/DerivativoAS!br.gov.caixa.bsb.sihdg.core.service.DerivativoAS
        java:app/sihdg-api/DerivativoAS!br.gov.caixa.bsb.sihdg.core.service.DerivativoAS
        java:module/DerivativoAS!br.gov.caixa.bsb.sihdg.core.service.DerivativoAS
        java:global/sihdg-3.17.0.0/sihdg-api/DerivativoAS
        java:app/sihdg-api/DerivativoAS
        java:module/DerivativoAS

12:17:14,453 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoTransacaoFcAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/MovimentacaoTransacaoFcAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoTransacaoFcAS
        java:app/sihdg-api/MovimentacaoTransacaoFcAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoTransacaoFcAS
        java:module/MovimentacaoTransacaoFcAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoTransacaoFcAS
        java:global/sihdg-3.17.0.0/sihdg-api/MovimentacaoTransacaoFcAS
        java:app/sihdg-api/MovimentacaoTransacaoFcAS
        java:module/MovimentacaoTransacaoFcAS

12:17:14,453 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'LogImportacaoSiapcAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/LogImportacaoSiapcAS!br.gov.caixa.bsb.sihdg.core.service.LogImportacaoSiapcAS
        java:app/sihdg-api/LogImportacaoSiapcAS!br.gov.caixa.bsb.sihdg.core.service.LogImportacaoSiapcAS
        java:module/LogImportacaoSiapcAS!br.gov.caixa.bsb.sihdg.core.service.LogImportacaoSiapcAS
        java:global/sihdg-3.17.0.0/sihdg-api/LogImportacaoSiapcAS
        java:app/sihdg-api/LogImportacaoSiapcAS
        java:module/LogImportacaoSiapcAS

12:17:14,453 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PerfilAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/PerfilAS!br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS
        java:app/sihdg-api/PerfilAS!br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS
        java:module/PerfilAS!br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS
        java:global/sihdg-3.17.0.0/sihdg-api/PerfilAS
        java:app/sihdg-api/PerfilAS
        java:module/PerfilAS

12:17:14,453 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ItemDerivativoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/ItemDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoAS
        java:app/sihdg-api/ItemDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoAS
        java:module/ItemDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoAS
        java:global/sihdg-3.17.0.0/sihdg-api/ItemDerivativoAS
        java:app/sihdg-api/ItemDerivativoAS
        java:module/ItemDerivativoAS

12:17:14,453 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TabelasAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/TabelasAS!br.gov.caixa.bsb.sihdg.core.service.TabelasAS
        java:app/sihdg-api/TabelasAS!br.gov.caixa.bsb.sihdg.core.service.TabelasAS
        java:module/TabelasAS!br.gov.caixa.bsb.sihdg.core.service.TabelasAS
        java:global/sihdg-3.17.0.0/sihdg-api/TabelasAS
        java:app/sihdg-api/TabelasAS
        java:module/TabelasAS

12:17:14,454 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'SafraAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/SafraAS!br.gov.caixa.bsb.sihdg.core.service.SafraAS
        java:app/sihdg-api/SafraAS!br.gov.caixa.bsb.sihdg.core.service.SafraAS
        java:module/SafraAS!br.gov.caixa.bsb.sihdg.core.service.SafraAS
        java:global/sihdg-3.17.0.0/sihdg-api/SafraAS
        java:app/sihdg-api/SafraAS
        java:module/SafraAS

12:17:14,454 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ContratoDesignadoPrograma1AS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/ContratoDesignadoPrograma1AS!br.gov.caixa.bsb.sihdg.core.service.ContratoDesignadoPrograma1AS
        java:app/sihdg-api/ContratoDesignadoPrograma1AS!br.gov.caixa.bsb.sihdg.core.service.ContratoDesignadoPrograma1AS
        java:module/ContratoDesignadoPrograma1AS!br.gov.caixa.bsb.sihdg.core.service.ContratoDesignadoPrograma1AS
        java:global/sihdg-3.17.0.0/sihdg-api/ContratoDesignadoPrograma1AS
        java:app/sihdg-api/ContratoDesignadoPrograma1AS
        java:module/ContratoDesignadoPrograma1AS

12:17:14,454 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ParametroEventoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/ParametroEventoAS!br.gov.caixa.bsb.sihdg.core.service.ParametroEventoAS
        java:app/sihdg-api/ParametroEventoAS!br.gov.caixa.bsb.sihdg.core.service.ParametroEventoAS
        java:module/ParametroEventoAS!br.gov.caixa.bsb.sihdg.core.service.ParametroEventoAS
        java:global/sihdg-3.17.0.0/sihdg-api/ParametroEventoAS
        java:app/sihdg-api/ParametroEventoAS
        java:module/ParametroEventoAS

12:17:14,454 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'HistoricoCargaAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/HistoricoCargaAS!br.gov.caixa.bsb.sihdg.core.service.HistoricoCargaAS
        java:app/sihdg-api/HistoricoCargaAS!br.gov.caixa.bsb.sihdg.core.service.HistoricoCargaAS
        java:module/HistoricoCargaAS!br.gov.caixa.bsb.sihdg.core.service.HistoricoCargaAS
        java:global/sihdg-3.17.0.0/sihdg-api/HistoricoCargaAS
        java:app/sihdg-api/HistoricoCargaAS
        java:module/HistoricoCargaAS

12:17:14,454 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ProgramaAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/ProgramaAS!br.gov.caixa.bsb.sihdg.core.service.ProgramaAS
        java:app/sihdg-api/ProgramaAS!br.gov.caixa.bsb.sihdg.core.service.ProgramaAS
        java:module/ProgramaAS!br.gov.caixa.bsb.sihdg.core.service.ProgramaAS
        java:global/sihdg-3.17.0.0/sihdg-api/ProgramaAS
        java:app/sihdg-api/ProgramaAS
        java:module/ProgramaAS

12:17:14,454 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'CtcfHabitacaoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/CtcfHabitacaoAS!br.gov.caixa.bsb.sihdg.core.service.CtcfHabitacaoAS
        java:app/sihdg-api/CtcfHabitacaoAS!br.gov.caixa.bsb.sihdg.core.service.CtcfHabitacaoAS
        java:module/CtcfHabitacaoAS!br.gov.caixa.bsb.sihdg.core.service.CtcfHabitacaoAS
        java:global/sihdg-3.17.0.0/sihdg-api/CtcfHabitacaoAS
        java:app/sihdg-api/CtcfHabitacaoAS
        java:module/CtcfHabitacaoAS

12:17:14,454 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'VencimentoItemDerivativoTask' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/VencimentoItemDerivativoTask!br.gov.caixa.bsb.sihdg.core.service.jobs.VencimentoItemDerivativoTask
        java:app/sihdg-api/VencimentoItemDerivativoTask!br.gov.caixa.bsb.sihdg.core.service.jobs.VencimentoItemDerivativoTask
        java:module/VencimentoItemDerivativoTask!br.gov.caixa.bsb.sihdg.core.service.jobs.VencimentoItemDerivativoTask
        java:global/sihdg-3.17.0.0/sihdg-api/VencimentoItemDerivativoTask
        java:app/sihdg-api/VencimentoItemDerivativoTask
        java:module/VencimentoItemDerivativoTask

12:17:14,454 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ProcessarStatusDerivativoTask' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/ProcessarStatusDerivativoTask!br.gov.caixa.bsb.sihdg.core.service.jobs.ProcessarStatusDerivativoTask
        java:app/sihdg-api/ProcessarStatusDerivativoTask!br.gov.caixa.bsb.sihdg.core.service.jobs.ProcessarStatusDerivativoTask
        java:module/ProcessarStatusDerivativoTask!br.gov.caixa.bsb.sihdg.core.service.jobs.ProcessarStatusDerivativoTask
        java:global/sihdg-3.17.0.0/sihdg-api/ProcessarStatusDerivativoTask
        java:app/sihdg-api/ProcessarStatusDerivativoTask
        java:module/ProcessarStatusDerivativoTask

12:17:14,454 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'RegistroEfetividadeAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/RegistroEfetividadeAS!br.gov.caixa.bsb.sihdg.core.service.RegistroEfetividadeAS
        java:app/sihdg-api/RegistroEfetividadeAS!br.gov.caixa.bsb.sihdg.core.service.RegistroEfetividadeAS
        java:module/RegistroEfetividadeAS!br.gov.caixa.bsb.sihdg.core.service.RegistroEfetividadeAS
        java:global/sihdg-3.17.0.0/sihdg-api/RegistroEfetividadeAS
        java:app/sihdg-api/RegistroEfetividadeAS
        java:module/RegistroEfetividadeAS

12:17:14,454 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'RegistroContabilidadeAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/RegistroContabilidadeAS!br.gov.caixa.bsb.sihdg.core.service.RegistroContabilidadeAS
        java:app/sihdg-api/RegistroContabilidadeAS!br.gov.caixa.bsb.sihdg.core.service.RegistroContabilidadeAS
        java:module/RegistroContabilidadeAS!br.gov.caixa.bsb.sihdg.core.service.RegistroContabilidadeAS
        java:global/sihdg-3.17.0.0/sihdg-api/RegistroContabilidadeAS
        java:app/sihdg-api/RegistroContabilidadeAS
        java:module/RegistroContabilidadeAS

12:17:14,454 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'HistoricoContratoPrograma1AS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/HistoricoContratoPrograma1AS!br.gov.caixa.bsb.sihdg.core.service.HistoricoContratoPrograma1AS
        java:app/sihdg-api/HistoricoContratoPrograma1AS!br.gov.caixa.bsb.sihdg.core.service.HistoricoContratoPrograma1AS
        java:module/HistoricoContratoPrograma1AS!br.gov.caixa.bsb.sihdg.core.service.HistoricoContratoPrograma1AS
        java:global/sihdg-3.17.0.0/sihdg-api/HistoricoContratoPrograma1AS
        java:app/sihdg-api/HistoricoContratoPrograma1AS
        java:module/HistoricoContratoPrograma1AS

12:17:14,455 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'HistoricoCargaFcAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/HistoricoCargaFcAS!br.gov.caixa.bsb.sihdg.core.service.HistoricoCargaFcAS
        java:app/sihdg-api/HistoricoCargaFcAS!br.gov.caixa.bsb.sihdg.core.service.HistoricoCargaFcAS
        java:module/HistoricoCargaFcAS!br.gov.caixa.bsb.sihdg.core.service.HistoricoCargaFcAS
        java:global/sihdg-3.17.0.0/sihdg-api/HistoricoCargaFcAS
        java:app/sihdg-api/HistoricoCargaFcAS
        java:module/HistoricoCargaFcAS

12:17:14,455 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'AtualizacaoCurvaAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/AtualizacaoCurvaAS!br.gov.caixa.bsb.sihdg.core.service.AtualizacaoCurvaAS
        java:app/sihdg-api/AtualizacaoCurvaAS!br.gov.caixa.bsb.sihdg.core.service.AtualizacaoCurvaAS
        java:module/AtualizacaoCurvaAS!br.gov.caixa.bsb.sihdg.core.service.AtualizacaoCurvaAS
        java:global/sihdg-3.17.0.0/sihdg-api/AtualizacaoCurvaAS
        java:app/sihdg-api/AtualizacaoCurvaAS
        java:module/AtualizacaoCurvaAS

12:17:14,455 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'PerfilRecursoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/PerfilRecursoAS!br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS
        java:app/sihdg-api/PerfilRecursoAS!br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS
        java:module/PerfilRecursoAS!br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS
        java:global/sihdg-3.17.0.0/sihdg-api/PerfilRecursoAS
        java:app/sihdg-api/PerfilRecursoAS
        java:module/PerfilRecursoAS

12:17:14,455 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ParametroChoqueAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/ParametroChoqueAS!br.gov.caixa.bsb.sihdg.core.service.ParametroChoqueAS
        java:app/sihdg-api/ParametroChoqueAS!br.gov.caixa.bsb.sihdg.core.service.ParametroChoqueAS
        java:module/ParametroChoqueAS!br.gov.caixa.bsb.sihdg.core.service.ParametroChoqueAS
        java:global/sihdg-3.17.0.0/sihdg-api/ParametroChoqueAS
        java:app/sihdg-api/ParametroChoqueAS
        java:module/ParametroChoqueAS

12:17:14,455 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'SolicitacaoHabilitacaoDerivativoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/SolicitacaoHabilitacaoDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.SolicitacaoHabilitacaoDerivativoAS
        java:app/sihdg-api/SolicitacaoHabilitacaoDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.SolicitacaoHabilitacaoDerivativoAS
        java:module/SolicitacaoHabilitacaoDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.SolicitacaoHabilitacaoDerivativoAS
        java:global/sihdg-3.17.0.0/sihdg-api/SolicitacaoHabilitacaoDerivativoAS
        java:app/sihdg-api/SolicitacaoHabilitacaoDerivativoAS
        java:module/SolicitacaoHabilitacaoDerivativoAS

12:17:14,455 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'AtualizadorCacheAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/AtualizadorCacheAS!br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS
        java:app/sihdg-api/AtualizadorCacheAS!br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS
        java:module/AtualizadorCacheAS!br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS
        java:global/sihdg-3.17.0.0/sihdg-api/AtualizadorCacheAS
        java:app/sihdg-api/AtualizadorCacheAS
        java:module/AtualizadorCacheAS

12:17:14,455 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ExecucaoAtualizacaoDaCurvaAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/ExecucaoAtualizacaoDaCurvaAS!br.gov.caixa.bsb.sihdg.core.service.ExecucaoAtualizacaoDaCurvaAS
        java:app/sihdg-api/ExecucaoAtualizacaoDaCurvaAS!br.gov.caixa.bsb.sihdg.core.service.ExecucaoAtualizacaoDaCurvaAS
        java:module/ExecucaoAtualizacaoDaCurvaAS!br.gov.caixa.bsb.sihdg.core.service.ExecucaoAtualizacaoDaCurvaAS
        java:global/sihdg-3.17.0.0/sihdg-api/ExecucaoAtualizacaoDaCurvaAS
        java:app/sihdg-api/ExecucaoAtualizacaoDaCurvaAS
        java:module/ExecucaoAtualizacaoDaCurvaAS

12:17:14,455 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ArquivoSinafAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/ArquivoSinafAS!br.gov.caixa.bsb.sihdg.core.service.ArquivoSinafAS
        java:app/sihdg-api/ArquivoSinafAS!br.gov.caixa.bsb.sihdg.core.service.ArquivoSinafAS
        java:module/ArquivoSinafAS!br.gov.caixa.bsb.sihdg.core.service.ArquivoSinafAS
        java:global/sihdg-3.17.0.0/sihdg-api/ArquivoSinafAS
        java:app/sihdg-api/ArquivoSinafAS
        java:module/ArquivoSinafAS

12:17:14,455 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TaxaCdiAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/TaxaCdiAS!br.gov.caixa.bsb.sihdg.core.service.TaxaCdiAS
        java:app/sihdg-api/TaxaCdiAS!br.gov.caixa.bsb.sihdg.core.service.TaxaCdiAS
        java:module/TaxaCdiAS!br.gov.caixa.bsb.sihdg.core.service.TaxaCdiAS
        java:global/sihdg-3.17.0.0/sihdg-api/TaxaCdiAS
        java:app/sihdg-api/TaxaCdiAS
        java:module/TaxaCdiAS

12:17:14,455 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'SecurityConfig' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/SecurityConfig!br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig
        java:app/sihdg-api/SecurityConfig!br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig
        java:module/SecurityConfig!br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig
        java:global/sihdg-3.17.0.0/sihdg-api/SecurityConfig
        java:app/sihdg-api/SecurityConfig
        java:module/SecurityConfig

12:17:14,455 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'TrilhaAuditoriaAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/TrilhaAuditoriaAS!br.gov.caixa.bsb.sihdg.core.service.TrilhaAuditoriaAS
        java:app/sihdg-api/TrilhaAuditoriaAS!br.gov.caixa.bsb.sihdg.core.service.TrilhaAuditoriaAS
        java:module/TrilhaAuditoriaAS!br.gov.caixa.bsb.sihdg.core.service.TrilhaAuditoriaAS
        java:global/sihdg-3.17.0.0/sihdg-api/TrilhaAuditoriaAS
        java:app/sihdg-api/TrilhaAuditoriaAS
        java:module/TrilhaAuditoriaAS

12:17:14,455 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ProspectivaSolicitacaoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/ProspectivaSolicitacaoAS!br.gov.caixa.bsb.sihdg.core.service.ProspectivaSolicitacaoAS
        java:app/sihdg-api/ProspectivaSolicitacaoAS!br.gov.caixa.bsb.sihdg.core.service.ProspectivaSolicitacaoAS
        java:module/ProspectivaSolicitacaoAS!br.gov.caixa.bsb.sihdg.core.service.ProspectivaSolicitacaoAS
        java:global/sihdg-3.17.0.0/sihdg-api/ProspectivaSolicitacaoAS
        java:app/sihdg-api/ProspectivaSolicitacaoAS
        java:module/ProspectivaSolicitacaoAS

12:17:14,455 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'AtualizacaoCurvaTask' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/AtualizacaoCurvaTask!br.gov.caixa.bsb.sihdg.core.service.jobs.AtualizacaoCurvaTask
        java:app/sihdg-api/AtualizacaoCurvaTask!br.gov.caixa.bsb.sihdg.core.service.jobs.AtualizacaoCurvaTask
        java:module/AtualizacaoCurvaTask!br.gov.caixa.bsb.sihdg.core.service.jobs.AtualizacaoCurvaTask
        java:global/sihdg-3.17.0.0/sihdg-api/AtualizacaoCurvaTask
        java:app/sihdg-api/AtualizacaoCurvaTask
        java:module/AtualizacaoCurvaTask

12:17:14,455 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'CurvaAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/CurvaAS!br.gov.caixa.bsb.sihdg.core.service.CurvaAS
        java:app/sihdg-api/CurvaAS!br.gov.caixa.bsb.sihdg.core.service.CurvaAS
        java:module/CurvaAS!br.gov.caixa.bsb.sihdg.core.service.CurvaAS
        java:global/sihdg-3.17.0.0/sihdg-api/CurvaAS
        java:app/sihdg-api/CurvaAS
        java:module/CurvaAS

12:17:14,456 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'CacheConfig' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/CacheConfig!br.gov.caixa.arquitetura.javaee.core.comum.config.cache.CacheConfig
        java:app/sihdg-api/CacheConfig!br.gov.caixa.arquitetura.javaee.core.comum.config.cache.CacheConfig
        java:module/CacheConfig!br.gov.caixa.arquitetura.javaee.core.comum.config.cache.CacheConfig
        java:global/sihdg-3.17.0.0/sihdg-api/CacheConfig
        java:app/sihdg-api/CacheConfig
        java:module/CacheConfig

12:17:14,456 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'FluxoAlmSafraAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/FluxoAlmSafraAS!br.gov.caixa.bsb.sihdg.core.service.FluxoAlmSafraAS
        java:app/sihdg-api/FluxoAlmSafraAS!br.gov.caixa.bsb.sihdg.core.service.FluxoAlmSafraAS
        java:module/FluxoAlmSafraAS!br.gov.caixa.bsb.sihdg.core.service.FluxoAlmSafraAS
        java:global/sihdg-3.17.0.0/sihdg-api/FluxoAlmSafraAS
        java:app/sihdg-api/FluxoAlmSafraAS
        java:module/FluxoAlmSafraAS

12:17:14,456 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ContratoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/ContratoAS!br.gov.caixa.bsb.sihdg.core.service.ContratoAS
        java:app/sihdg-api/ContratoAS!br.gov.caixa.bsb.sihdg.core.service.ContratoAS
        java:module/ContratoAS!br.gov.caixa.bsb.sihdg.core.service.ContratoAS
        java:global/sihdg-3.17.0.0/sihdg-api/ContratoAS
        java:app/sihdg-api/ContratoAS
        java:module/ContratoAS

12:17:14,456 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'MovimentacaoItemDerivativoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/MovimentacaoItemDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoItemDerivativoAS
        java:app/sihdg-api/MovimentacaoItemDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoItemDerivativoAS
        java:module/MovimentacaoItemDerivativoAS!br.gov.caixa.bsb.sihdg.core.service.MovimentacaoItemDerivativoAS
        java:global/sihdg-3.17.0.0/sihdg-api/MovimentacaoItemDerivativoAS
        java:app/sihdg-api/MovimentacaoItemDerivativoAS
        java:module/MovimentacaoItemDerivativoAS

12:17:14,456 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'OrdemCompraAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/OrdemCompraAS!br.gov.caixa.bsb.sihdg.core.service.OrdemCompraAS
        java:app/sihdg-api/OrdemCompraAS!br.gov.caixa.bsb.sihdg.core.service.OrdemCompraAS
        java:module/OrdemCompraAS!br.gov.caixa.bsb.sihdg.core.service.OrdemCompraAS
        java:global/sihdg-3.17.0.0/sihdg-api/OrdemCompraAS
        java:app/sihdg-api/OrdemCompraAS
        java:module/OrdemCompraAS

12:17:14,456 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ProgramaFluxoCaixaAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/ProgramaFluxoCaixaAS!br.gov.caixa.bsb.sihdg.core.service.ProgramaFluxoCaixaAS
        java:app/sihdg-api/ProgramaFluxoCaixaAS!br.gov.caixa.bsb.sihdg.core.service.ProgramaFluxoCaixaAS
        java:module/ProgramaFluxoCaixaAS!br.gov.caixa.bsb.sihdg.core.service.ProgramaFluxoCaixaAS
        java:global/sihdg-3.17.0.0/sihdg-api/ProgramaFluxoCaixaAS
        java:app/sihdg-api/ProgramaFluxoCaixaAS
        java:module/ProgramaFluxoCaixaAS

12:17:14,456 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ItemDerivativoGerencialAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/ItemDerivativoGerencialAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoGerencialAS
        java:app/sihdg-api/ItemDerivativoGerencialAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoGerencialAS
        java:module/ItemDerivativoGerencialAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoGerencialAS
        java:global/sihdg-3.17.0.0/sihdg-api/ItemDerivativoGerencialAS
        java:app/sihdg-api/ItemDerivativoGerencialAS
        java:module/ItemDerivativoGerencialAS

12:17:14,456 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'GestaoCargaAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/GestaoCargaAS!br.gov.caixa.bsb.sihdg.core.service.GestaoCargaAS
        java:app/sihdg-api/GestaoCargaAS!br.gov.caixa.bsb.sihdg.core.service.GestaoCargaAS
        java:module/GestaoCargaAS!br.gov.caixa.bsb.sihdg.core.service.GestaoCargaAS
        java:global/sihdg-3.17.0.0/sihdg-api/GestaoCargaAS
        java:app/sihdg-api/GestaoCargaAS
        java:module/GestaoCargaAS

12:17:14,456 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ProdutoEventoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/ProdutoEventoAS!br.gov.caixa.bsb.sihdg.core.service.ProdutoEventoAS
        java:app/sihdg-api/ProdutoEventoAS!br.gov.caixa.bsb.sihdg.core.service.ProdutoEventoAS
        java:module/ProdutoEventoAS!br.gov.caixa.bsb.sihdg.core.service.ProdutoEventoAS
        java:global/sihdg-3.17.0.0/sihdg-api/ProdutoEventoAS
        java:app/sihdg-api/ProdutoEventoAS
        java:module/ProdutoEventoAS

12:17:14,456 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ItemDerivativoGerencialFcAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/ItemDerivativoGerencialFcAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoGerencialFcAS
        java:app/sihdg-api/ItemDerivativoGerencialFcAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoGerencialFcAS
        java:module/ItemDerivativoGerencialFcAS!br.gov.caixa.bsb.sihdg.core.service.ItemDerivativoGerencialFcAS
        java:global/sihdg-3.17.0.0/sihdg-api/ItemDerivativoGerencialFcAS
        java:app/sihdg-api/ItemDerivativoGerencialFcAS
        java:module/ItemDerivativoGerencialFcAS

12:17:14,456 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'RecursoAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/RecursoAS!br.gov.caixa.arquitetura.javaee.core.seguranca.RecursoAS
        java:app/sihdg-api/RecursoAS!br.gov.caixa.arquitetura.javaee.core.seguranca.RecursoAS
        java:module/RecursoAS!br.gov.caixa.arquitetura.javaee.core.seguranca.RecursoAS
        java:global/sihdg-3.17.0.0/sihdg-api/RecursoAS
        java:app/sihdg-api/RecursoAS
        java:module/RecursoAS

12:17:14,457 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ContratoTemporarioAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/ContratoTemporarioAS!br.gov.caixa.bsb.sihdg.core.service.ContratoTemporarioAS
        java:app/sihdg-api/ContratoTemporarioAS!br.gov.caixa.bsb.sihdg.core.service.ContratoTemporarioAS
        java:module/ContratoTemporarioAS!br.gov.caixa.bsb.sihdg.core.service.ContratoTemporarioAS
        java:global/sihdg-3.17.0.0/sihdg-api/ContratoTemporarioAS
        java:app/sihdg-api/ContratoTemporarioAS
        java:module/ContratoTemporarioAS

12:17:14,457 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'AtualizacaoCurvaFcAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/AtualizacaoCurvaFcAS!br.gov.caixa.bsb.sihdg.core.service.AtualizacaoCurvaFcAS
        java:app/sihdg-api/AtualizacaoCurvaFcAS!br.gov.caixa.bsb.sihdg.core.service.AtualizacaoCurvaFcAS
        java:module/AtualizacaoCurvaFcAS!br.gov.caixa.bsb.sihdg.core.service.AtualizacaoCurvaFcAS
        java:global/sihdg-3.17.0.0/sihdg-api/AtualizacaoCurvaFcAS
        java:app/sihdg-api/AtualizacaoCurvaFcAS
        java:module/AtualizacaoCurvaFcAS

12:17:14,457 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'GestaoEfetividadeAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/GestaoEfetividadeAS!br.gov.caixa.bsb.sihdg.core.service.GestaoEfetividadeAS
        java:app/sihdg-api/GestaoEfetividadeAS!br.gov.caixa.bsb.sihdg.core.service.GestaoEfetividadeAS
        java:module/GestaoEfetividadeAS!br.gov.caixa.bsb.sihdg.core.service.GestaoEfetividadeAS
        java:global/sihdg-3.17.0.0/sihdg-api/GestaoEfetividadeAS
        java:app/sihdg-api/GestaoEfetividadeAS
        java:module/GestaoEfetividadeAS

12:17:14,457 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ControleCacheTask' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/ControleCacheTask!br.gov.caixa.arquitetura.javaee.core.comum.servico.ControleCacheTask
        java:app/sihdg-api/ControleCacheTask!br.gov.caixa.arquitetura.javaee.core.comum.servico.ControleCacheTask
        java:module/ControleCacheTask!br.gov.caixa.arquitetura.javaee.core.comum.servico.ControleCacheTask
        java:global/sihdg-3.17.0.0/sihdg-api/ControleCacheTask
        java:app/sihdg-api/ControleCacheTask
        java:module/ControleCacheTask

12:17:14,457 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ControleCacheAS' in deployment unit 'subdeployment "sihdg-api.war" of deployment "sihdg-3.17.0.0.ear"' are as follows:

        java:global/sihdg-3.17.0.0/sihdg-api/ControleCacheAS!br.gov.caixa.arquitetura.javaee.core.util.ControleCacheAS
        java:app/sihdg-api/ControleCacheAS!br.gov.caixa.arquitetura.javaee.core.util.ControleCacheAS
        java:module/ControleCacheAS!br.gov.caixa.arquitetura.javaee.core.util.ControleCacheAS
        java:global/sihdg-3.17.0.0/sihdg-api/ControleCacheAS
        java:app/sihdg-api/ControleCacheAS
        java:module/ControleCacheAS

12:17:14,682 INFO  [org.jboss.weld.Version] (MSC service thread 1-1) WELD-000900: 5.1.6 (redhat)
12:17:15,278 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 47) WFLYJPA0010: Starting Persistence Unit (phase 1 of 2) Service 'sihdg-3.17.0.0.ear/sihdg-api.war#sihdgDS'
12:17:15,371 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 47) HHH000204: Processing PersistenceUnitInfo [name: sihdgDS]
12:17:15,465 WARN  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.bsb.sihdg.core.service.RegistroContabilidadeAS should not have a final or static method (toSingleton)
12:17:15,560 INFO  [org.hibernate.Version] (ServerService Thread Pool -- 47) HHH000412: Hibernate ORM core version 6.2.49.Final-redhat-00001
12:17:15,566 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 47) HHH000406: Using bytecode reflection optimizer
12:17:15,680 WARN  [org.hibernate.orm.deprecation] (ServerService Thread Pool -- 47) HHH90000025: SQLServer2012Dialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
12:17:15,681 WARN  [org.hibernate.orm.deprecation] (ServerService Thread Pool -- 47) HHH90000026: SQLServer2012Dialect has been deprecated; use org.hibernate.dialect.SQLServerDialect instead
12:17:15,954 INFO  [org.jipijapa] (MSC service thread 1-1) JIPIORMV6020260: Second level cache enabled for sihdg-3.17.0.0.ear/sihdg-api.war#sihdgDS
12:17:15,968 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 47) Envers integration enabled? : true
12:17:16,155 WARN  [org.jboss.as.jaxrs] (MSC service thread 1-1) WFLYRS0018: Explicit usage of Jackson annotation in a Jakarta RESTful Web Services deployment; the system will disable Jakarta JSON Binding processing for the current deployment. Consider setting the 'resteasy.preferJacksonOverJsonB' property to 'false' to restore Jakarta JSON Binding.
12:17:16,489 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 47) WFLYJPA0010: Starting Persistence Unit (phase 2 of 2) Service 'sihdg-3.17.0.0.ear/sihdg-api.war#sihdgDS'
12:17:18,880 INFO  [org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator] (ServerService Thread Pool -- 47) HHH000490: Using JTA platform [org.hibernate.engine.transaction.jta.platform.internal.JBossAppServerJtaPlatform]
12:17:26,361 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.config.cache.CacheConfig] (ServerService Thread Pool -- 50) Atualizando o cache inicial ...
12:17:26,557 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.seguranca.ContextoSegurancaHelper] (ServerService Thread Pool -- 51) SEGURANCA - Operacao durante inicializacao permitida sem contexto. Operacao: Perfil.createQuery
12:17:26,573 WARNING [com.hazelcast.instance.HazelcastInstanceFactory] (ServerService Thread Pool -- 50) Hazelcast is starting in a Java modular environment (Java 9 and newer) but without proper access to required Java packages. Use additional Java arguments to provide Hazelcast access to Java internal API. The internal API access is used to get the best performance results. Arguments to be used:
 --add-modules java.se --add-exports java.base/jdk.internal.ref=ALL-UNNAMED --add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.base/java.nio=ALL-UNNAMED --add-opens java.base/sun.nio.ch=ALL-UNNAMED --add-opens java.management/sun.management=ALL-UNNAMED --add-opens jdk.management/com.sun.management.internal=ALL-UNNAMED
12:17:26,671 INFO  [com.hazelcast.instance.AddressPicker] (ServerService Thread Pool -- 50) [LOCAL] [dev] [3.12.12] Prefer IPv4 stack is true, prefer IPv6 addresses is false
12:17:26,674 INFO  [com.hazelcast.instance.AddressPicker] (ServerService Thread Pool -- 50) [LOCAL] [dev] [3.12.12] Picked [25.0.3.230]:5701, using socket ServerSocket[addr=/0.0.0.0,localport=5701], bind any local is true
12:17:26,683 INFO  [com.hazelcast.system] (ServerService Thread Pool -- 50) [25.0.3.230]:5701 [dev] [3.12.12] Hazelcast 3.12.12 (20210209 - 35096ec) starting at [25.0.3.230]:5701
12:17:26,683 INFO  [com.hazelcast.system] (ServerService Thread Pool -- 50) [25.0.3.230]:5701 [dev] [3.12.12] Copyright (c) 2008-2020, Hazelcast, Inc. All Rights Reserved.
12:17:26,970 INFO  [com.hazelcast.spi.impl.operationservice.impl.BackpressureRegulator] (ServerService Thread Pool -- 50) [25.0.3.230]:5701 [dev] [3.12.12] Backpressure is disabled
12:17:27,357 INFO  [stdout] (ServerService Thread Pool -- 51) Hibernate:
12:17:27,357 INFO  [stdout] (ServerService Thread Pool -- 51)     select
12:17:27,357 INFO  [stdout] (ServerService Thread Pool -- 51)         p1_0.CO_PERFIL_ID,
12:17:27,357 INFO  [stdout] (ServerService Thread Pool -- 51)         p1_0.TS_ATLZO_PERFIL,
12:17:27,357 INFO  [stdout] (ServerService Thread Pool -- 51)         p1_0.DE_PERFIL_ACESSO,
12:17:27,357 INFO  [stdout] (ServerService Thread Pool -- 51)         p1_0.NO_PERFIL_ACESSO,
12:17:27,357 INFO  [stdout] (ServerService Thread Pool -- 51)         p1_0.CO_TRMNL_ATLZO_PERFIL,
12:17:27,357 INFO  [stdout] (ServerService Thread Pool -- 51)         p1_0.CO_USUARIO_ATLZO_PERFIL
12:17:27,357 INFO  [stdout] (ServerService Thread Pool -- 51)     from
12:17:27,357 INFO  [stdout] (ServerService Thread Pool -- 51)         dbo.HDGTB011_PERFIL_ACESSO p1_0
12:17:27,357 INFO  [stdout] (ServerService Thread Pool -- 51)     where
12:17:27,357 INFO  [stdout] (ServerService Thread Pool -- 51)         p1_0.NO_PERFIL_ACESSO=?
12:17:28,166 INFO  [com.hazelcast.spi.impl.operationexecutor.impl.OperationExecutorImpl] (ServerService Thread Pool -- 50) [25.0.3.230]:5701 [dev] [3.12.12] Starting 2 partition threads and 3 generic threads (1 dedicated for priority tasks)
12:17:28,168 INFO  [com.hazelcast.internal.diagnostics.Diagnostics] (ServerService Thread Pool -- 50) [25.0.3.230]:5701 [dev] [3.12.12] Diagnostics disabled. To enable add -Dhazelcast.diagnostics.enabled=true to the JVM arguments.
12:17:28,171 INFO  [com.hazelcast.core.LifecycleService] (ServerService Thread Pool -- 50) [25.0.3.230]:5701 [dev] [3.12.12] [25.0.3.230]:5701 is STARTING
12:17:28,255 WARNING [com.hazelcast.instance.Node] (ServerService Thread Pool -- 50) [25.0.3.230]:5701 [dev] [3.12.12] No join method is enabled! Starting standalone.
12:17:28,267 INFO  [com.hazelcast.core.LifecycleService] (ServerService Thread Pool -- 50) [25.0.3.230]:5701 [dev] [3.12.12] [25.0.3.230]:5701 is STARTED
12:17:28,269 INFO  [br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS] (ServerService Thread Pool -- 50) Atualizando o cache de 'PERFIL_RECURSO'
12:17:28,272 INFO  [com.hazelcast.internal.diagnostics.HealthMonitor] (hz._hzInstance_1_dev.HealthMonitor) [25.0.3.230]:5701 [dev] [3.12.12] processors=1, physical.memory.total=2.0G, physical.memory.free=1.2G, swap.space.total=0, swap.space.free=0, heap.memory.used=203.1M, heap.memory.free=11.4M, heap.memory.total=214.5M, heap.memory.max=1.4G, heap.memory.used/total=94.63%, heap.memory.used/max=13.92%, minor.gc.count=0, minor.gc.time=0ms, major.gc.count=0, major.gc.time=0ms, load.process=0.00%, load.system=0.00%, load.systemAverage=4.45, thread.count=132, thread.peakCount=132, cluster.timeDiff=0, event.q.size=0, executor.q.async.size=0, executor.q.client.size=0, executor.q.client.query.size=0, executor.q.client.blocking.size=0, executor.q.query.size=0, executor.q.scheduled.size=0, executor.q.io.size=0, executor.q.system.size=0, executor.q.operations.size=0, executor.q.priorityOperation.size=0, operations.completed.count=1, executor.q.mapLoad.size=0, executor.q.mapLoadAllKeys.size=0, executor.q.cluster.size=0, executor.q.response.size=0, operations.running.count=0, operations.pending.invocations.percentage=0.00%, operations.pending.invocations.count=0, proxy.count=0, clientEndpoint.count=0, connection.active.count=0, client.connection.count=0, connection.count=0
12:17:28,274 INFO  [br.gov.caixa.arquitetura.javaee.core.comum.seguranca.ContextoSegurancaHelper] (ServerService Thread Pool -- 50) SEGURANCA - Operacao durante inicializacao permitida sem contexto. Operacao: PerfilRecurso.createQuery
12:17:28,359 INFO  [stdout] (ServerService Thread Pool -- 50) Hibernate:
12:17:28,359 INFO  [stdout] (ServerService Thread Pool -- 50)     select
12:17:28,359 INFO  [stdout] (ServerService Thread Pool -- 50)         distinct p2_0.NO_PERFIL_ACESSO
12:17:28,360 INFO  [stdout] (ServerService Thread Pool -- 50)     from
12:17:28,360 INFO  [stdout] (ServerService Thread Pool -- 50)         dbo.HDGTB013_PERMISSAO_PERFIL p1_0
12:17:28,360 INFO  [stdout] (ServerService Thread Pool -- 50)     join
12:17:28,360 INFO  [stdout] (ServerService Thread Pool -- 50)         dbo.HDGTB011_PERFIL_ACESSO p2_0
12:17:28,360 INFO  [stdout] (ServerService Thread Pool -- 50)             on p2_0.CO_PERFIL_ID=p1_0.CO_PERFIL_ID
12:17:28,456 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (ServerService Thread Pool -- 51) IJ000604: Throwable while attempting to get a new connection: null: jakarta.resource.ResourceException: IJ031084: Unable to create connection
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1381)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:534)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getTransactionNewConnection(AbstractPool.java:770)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:666)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
        at org.jboss.as.connector@8.0.13.GA-redhat-00002//org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.internal.NonContextualJdbcConnectionAccess.obtainConnection(NonContextualJdbcConnectionAccess.java:38)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:113)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:227)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:164)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:107)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:300)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:241)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.getSingleResult(AbstractSelectionQuery.java:473)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRepository.consultarPorNome(PerfilRepository.java:31)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRepository$Proxy$_$$_WeldClientProxy.consultarPorNome(Unknown Source)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS.gravar(PerfilAS.java:132)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:392)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:160)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS$$$view10.gravar(Unknown Source)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS$Proxy$_$$_Weld$EnterpriseProxy$.gravar(Unknown Source)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig.onStartup(SecurityConfig.java:71)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:126)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:112)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:87)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:111)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:416)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:68)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.StartupCountDownInterceptor.processInvocation(StartupCountDownInterceptor.java:25)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:168)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:141)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:127)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:141)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
        at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
        at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at java.base/java.lang.Thread.run(Thread.java:1583)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)
Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: "encrypt" property is set to "true" and "trustServerCertificate" property is set to "false" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target. ClientConnectionId:ffb78d18-4ca0-4824-9396-bdf3d280f8d6
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.terminate(SQLServerConnection.java:4290)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1965)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:3816)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:3372)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:3197)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:1971)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:1263)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
        ... 170 more
Caused by: javax.net.ssl.SSLHandshakeException: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
        at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130)
        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:383)
        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:326)
        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363)
        at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393)
        at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:477)
        at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:448)
        at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:206)
        at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:172)
        at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1506)
        at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1421)
        at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:455)
        at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:426)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1854)
        ... 176 more
Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
        at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:388)
        at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:271)
        at java.base/sun.security.validator.Validator.validate(Validator.java:256)
        at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:241)
        at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:113)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.HostNameOverrideX509TrustManager.checkServerTrusted(SQLServerTrustManager.java:88)
        at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkServerTrusted(SSLContextImpl.java:1430)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:631)
        ... 188 more
Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
        at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:148)
        at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:129)
        at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
        at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:383)
        ... 195 more

12:17:28,457 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (ServerService Thread Pool -- 50) IJ000604: Throwable while attempting to get a new connection: null: jakarta.resource.ResourceException: IJ031084: Unable to create connection
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1381)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:534)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getTransactionNewConnection(AbstractPool.java:770)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:666)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
        at org.jboss.as.connector@8.0.13.GA-redhat-00002//org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.internal.NonContextualJdbcConnectionAccess.obtainConnection(NonContextualJdbcConnectionAccess.java:38)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:113)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:227)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:164)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:107)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:300)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:241)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.Query.getResultList(Query.java:119)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRecursoRepository.consultarTodosPerfisRelacionados(PerfilRecursoRepository.java:35)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRecursoRepository$Proxy$_$$_WeldClientProxy.consultarTodosPerfisRelacionados(Unknown Source)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS.consultarTodosPerfisRelacionados(PerfilRecursoAS.java:132)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.supports(CMTTxInterceptor.java:448)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:164)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS$$$view26.consultarTodosPerfisRelacionados(Unknown Source)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS$Proxy$_$$_Weld$EnterpriseProxy$.consultarTodosPerfisRelacionados(Unknown Source)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarPerfilRecursoCache(AtualizadorCacheAS.java:128)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarCache(AtualizadorCacheAS.java:80)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.supports(CMTTxInterceptor.java:448)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:164)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS$$$view29.verificarEAtualizarCache(Unknown Source)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS$Proxy$_$$_Weld$EnterpriseProxy$.verificarEAtualizarCache(Unknown Source)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.comum.config.cache.CacheConfig.onStartup(CacheConfig.java:37)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:126)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:112)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:87)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:111)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:416)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:68)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.StartupCountDownInterceptor.processInvocation(StartupCountDownInterceptor.java:25)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:168)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:141)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:127)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:141)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
        at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
        at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at java.base/java.lang.Thread.run(Thread.java:1583)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)
Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: "encrypt" property is set to "true" and "trustServerCertificate" property is set to "false" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target. ClientConnectionId:ff7f0cb1-d4b1-4e03-be9c-9562d3b4cbb3
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.terminate(SQLServerConnection.java:4290)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1965)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:3816)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:3372)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:3197)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:1971)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:1263)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
        ... 248 more
Caused by: javax.net.ssl.SSLHandshakeException: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
        at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130)
        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:383)
        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:326)
        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363)
        at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393)
        at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:477)
        at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:448)
        at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:206)
        at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:172)
        at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1506)
        at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1421)
        at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:455)
        at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:426)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1854)
        ... 254 more
Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
        at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:388)
        at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:271)
        at java.base/sun.security.validator.Validator.validate(Validator.java:256)
        at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:241)
        at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:113)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.HostNameOverrideX509TrustManager.checkServerTrusted(SQLServerTrustManager.java:88)
        at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkServerTrusted(SSLContextImpl.java:1430)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:631)
        ... 266 more
Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
        at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:148)
        at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:129)
        at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
        at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:383)
        ... 273 more

12:17:28,458 WARN  [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (ServerService Thread Pool -- 50) SQL Error: 0, SQLState: null
12:17:28,458 WARN  [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (ServerService Thread Pool -- 51) SQL Error: 0, SQLState: null
12:17:28,459 ERROR [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (ServerService Thread Pool -- 50) jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
12:17:28,459 ERROR [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (ServerService Thread Pool -- 51) jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
12:17:28,467 ERROR [org.jboss.as.ejb3.invocation] (ServerService Thread Pool -- 51) WFLYEJB0034: Jakarta Enterprise Beans Invocation failed on component PerfilAS for method public void br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS.gravar(br.gov.caixa.arquitetura.javaee.core.comum.dto.PerfilDTO): jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:219)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:392)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:160)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS$$$view10.gravar(Unknown Source)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS$Proxy$_$$_Weld$EnterpriseProxy$.gravar(Unknown Source)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig.onStartup(SecurityConfig.java:71)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:126)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:112)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:87)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:111)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:416)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:68)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.StartupCountDownInterceptor.processInvocation(StartupCountDownInterceptor.java:25)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:168)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:141)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:127)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:141)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
        at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
        at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at java.base/java.lang.Thread.run(Thread.java:1583)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)
Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:61)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:227)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:164)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:107)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:300)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:241)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.getSingleResult(AbstractSelectionQuery.java:473)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRepository.consultarPorNome(PerfilRepository.java:31)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRepository$Proxy$_$$_WeldClientProxy.consultarPorNome(Unknown Source)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS.gravar(PerfilAS.java:132)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
        ... 103 more
Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:160)
        at org.jboss.as.connector@8.0.13.GA-redhat-00002//org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.internal.NonContextualJdbcConnectionAccess.obtainConnection(NonContextualJdbcConnectionAccess.java:38)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:113)
        ... 156 more
Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:690)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
        ... 160 more
Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1381)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:534)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getTransactionNewConnection(AbstractPool.java:770)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:666)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
        ... 163 more
Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: "encrypt" property is set to "true" and "trustServerCertificate" property is set to "false" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target. ClientConnectionId:ffb78d18-4ca0-4824-9396-bdf3d280f8d6
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.terminate(SQLServerConnection.java:4290)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1965)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:3816)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:3372)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:3197)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:1971)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:1263)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
        ... 170 more
Caused by: javax.net.ssl.SSLHandshakeException: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
        at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130)
        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:383)
        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:326)
        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363)
        at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393)
        at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:477)
        at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:448)
        at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:206)
        at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:172)
        at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1506)
        at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1421)
        at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:455)
        at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:426)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1854)
        ... 176 more
Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
        at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:388)
        at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:271)
        at java.base/sun.security.validator.Validator.validate(Validator.java:256)
        at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:241)
        at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:113)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.HostNameOverrideX509TrustManager.checkServerTrusted(SQLServerTrustManager.java:88)
        at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkServerTrusted(SSLContextImpl.java:1430)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:631)
        ... 188 more
Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
        at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:148)
        at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:129)
        at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
        at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:383)
        ... 195 more

12:17:28,467 ERROR [org.jboss.as.ejb3.invocation] (ServerService Thread Pool -- 50) WFLYEJB0034: Jakarta Enterprise Beans Invocation failed on component PerfilRecursoAS for method public java.util.List br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS.consultarTodosPerfisRelacionados(): jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:219)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.supports(CMTTxInterceptor.java:448)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:164)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS$$$view26.consultarTodosPerfisRelacionados(Unknown Source)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS$Proxy$_$$_Weld$EnterpriseProxy$.consultarTodosPerfisRelacionados(Unknown Source)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarPerfilRecursoCache(AtualizadorCacheAS.java:128)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarCache(AtualizadorCacheAS.java:80)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.supports(CMTTxInterceptor.java:448)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:164)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS$$$view29.verificarEAtualizarCache(Unknown Source)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS$Proxy$_$$_Weld$EnterpriseProxy$.verificarEAtualizarCache(Unknown Source)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.comum.config.cache.CacheConfig.onStartup(CacheConfig.java:37)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:126)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:112)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:87)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:111)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:416)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:68)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.StartupCountDownInterceptor.processInvocation(StartupCountDownInterceptor.java:25)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:168)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:141)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:127)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:141)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
        at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
        at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at java.base/java.lang.Thread.run(Thread.java:1583)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)
Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:61)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:227)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:164)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:107)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:300)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:241)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.Query.getResultList(Query.java:119)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRecursoRepository.consultarTodosPerfisRelacionados(PerfilRecursoRepository.java:35)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRecursoRepository$Proxy$_$$_WeldClientProxy.consultarTodosPerfisRelacionados(Unknown Source)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS.consultarTodosPerfisRelacionados(PerfilRecursoAS.java:132)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
        ... 181 more
Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:160)
        at org.jboss.as.connector@8.0.13.GA-redhat-00002//org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.internal.NonContextualJdbcConnectionAccess.obtainConnection(NonContextualJdbcConnectionAccess.java:38)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:113)
        ... 234 more
Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:690)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
        ... 238 more
Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1381)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:534)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getTransactionNewConnection(AbstractPool.java:770)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:666)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
        ... 241 more
Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: "encrypt" property is set to "true" and "trustServerCertificate" property is set to "false" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target. ClientConnectionId:ff7f0cb1-d4b1-4e03-be9c-9562d3b4cbb3
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.terminate(SQLServerConnection.java:4290)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1965)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:3816)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:3372)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:3197)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:1971)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:1263)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
        ... 248 more
Caused by: javax.net.ssl.SSLHandshakeException: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
        at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130)
        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:383)
        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:326)
        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363)
        at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393)
        at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:477)
        at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:448)
        at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:206)
        at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:172)
        at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1506)
        at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1421)
        at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:455)
        at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:426)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1854)
        ... 254 more
Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
        at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:388)
        at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:271)
        at java.base/sun.security.validator.Validator.validate(Validator.java:256)
        at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:241)
        at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:113)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.HostNameOverrideX509TrustManager.checkServerTrusted(SQLServerTrustManager.java:88)
        at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkServerTrusted(SSLContextImpl.java:1430)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:631)
        ... 266 more
Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
        at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:148)
        at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:129)
        at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
        at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:383)
        ... 273 more

12:17:28,469 ERROR [org.jboss.as.ejb3.invocation] (ServerService Thread Pool -- 50) WFLYEJB0034: Jakarta Enterprise Beans Invocation failed on component AtualizadorCacheAS for method public void br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarCache(boolean): jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:219)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.supports(CMTTxInterceptor.java:448)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:164)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS$$$view26.consultarTodosPerfisRelacionados(Unknown Source)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS$Proxy$_$$_Weld$EnterpriseProxy$.consultarTodosPerfisRelacionados(Unknown Source)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarPerfilRecursoCache(AtualizadorCacheAS.java:128)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarCache(AtualizadorCacheAS.java:80)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.supports(CMTTxInterceptor.java:448)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:164)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS$$$view29.verificarEAtualizarCache(Unknown Source)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS$Proxy$_$$_Weld$EnterpriseProxy$.verificarEAtualizarCache(Unknown Source)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.comum.config.cache.CacheConfig.onStartup(CacheConfig.java:37)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:126)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:112)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:87)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:111)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:416)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:68)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.StartupCountDownInterceptor.processInvocation(StartupCountDownInterceptor.java:25)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:168)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:141)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:127)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:141)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
        at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
        at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at java.base/java.lang.Thread.run(Thread.java:1583)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)
Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:61)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:227)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:164)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:107)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:300)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:241)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.Query.getResultList(Query.java:119)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRecursoRepository.consultarTodosPerfisRelacionados(PerfilRecursoRepository.java:35)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRecursoRepository$Proxy$_$$_WeldClientProxy.consultarTodosPerfisRelacionados(Unknown Source)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS.consultarTodosPerfisRelacionados(PerfilRecursoAS.java:132)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
        ... 181 more
Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:160)
        at org.jboss.as.connector@8.0.13.GA-redhat-00002//org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.internal.NonContextualJdbcConnectionAccess.obtainConnection(NonContextualJdbcConnectionAccess.java:38)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:113)
        ... 234 more
Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:690)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
        ... 238 more
Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1381)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:534)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getTransactionNewConnection(AbstractPool.java:770)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:666)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
        ... 241 more
Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: "encrypt" property is set to "true" and "trustServerCertificate" property is set to "false" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target. ClientConnectionId:ff7f0cb1-d4b1-4e03-be9c-9562d3b4cbb3
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.terminate(SQLServerConnection.java:4290)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1965)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:3816)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:3372)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:3197)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:1971)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:1263)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
        ... 248 more
Caused by: javax.net.ssl.SSLHandshakeException: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
        at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130)
        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:383)
        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:326)
        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363)
        at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393)
        at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:477)
        at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:448)
        at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:206)
        at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:172)
        at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1506)
        at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1421)
        at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:455)
        at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:426)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1854)
        ... 254 more
Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
        at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:388)
        at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:271)
        at java.base/sun.security.validator.Validator.validate(Validator.java:256)
        at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:241)
        at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:113)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.HostNameOverrideX509TrustManager.checkServerTrusted(SQLServerTrustManager.java:88)
        at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkServerTrusted(SSLContextImpl.java:1430)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:631)
        ... 266 more
Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
        at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:148)
        at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:129)
        at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
        at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:383)
        ... 273 more

12:17:28,470 ERROR [org.jboss.msc.service.fail] (ServerService Thread Pool -- 51) MSC000001: Failed to start service jboss.deployment.subunit."sihdg-3.17.0.0.ear"."sihdg-api.war".component.SecurityConfig.START: org.jboss.msc.service.StartException in service jboss.deployment.subunit."sihdg-3.17.0.0.ear"."sihdg-api.war".component.SecurityConfig.START: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:57)
        at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
        at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at java.base/java.lang.Thread.run(Thread.java:1583)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)
Caused by: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:170)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:141)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:127)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:141)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
        ... 8 more
Caused by: jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:219)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:392)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:160)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS$$$view10.gravar(Unknown Source)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS$Proxy$_$$_Weld$EnterpriseProxy$.gravar(Unknown Source)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.comum.config.seguranca.SecurityConfig.onStartup(SecurityConfig.java:71)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:126)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:112)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:87)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:111)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:416)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:68)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.StartupCountDownInterceptor.processInvocation(StartupCountDownInterceptor.java:25)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:168)
        ... 13 more
Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:61)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:227)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:164)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:107)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:300)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:241)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.getSingleResult(AbstractSelectionQuery.java:473)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRepository.consultarPorNome(PerfilRepository.java:31)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRepository$Proxy$_$$_WeldClientProxy.consultarPorNome(Unknown Source)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS.gravar(PerfilAS.java:132)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
        ... 103 more
Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:160)
        at org.jboss.as.connector@8.0.13.GA-redhat-00002//org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.internal.NonContextualJdbcConnectionAccess.obtainConnection(NonContextualJdbcConnectionAccess.java:38)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:113)
        ... 156 more
Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:690)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
        ... 160 more
Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1381)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:534)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getTransactionNewConnection(AbstractPool.java:770)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:666)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
        ... 163 more
Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: "encrypt" property is set to "true" and "trustServerCertificate" property is set to "false" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target. ClientConnectionId:ffb78d18-4ca0-4824-9396-bdf3d280f8d6
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.terminate(SQLServerConnection.java:4290)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1965)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:3816)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:3372)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:3197)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:1971)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:1263)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
        ... 170 more
Caused by: javax.net.ssl.SSLHandshakeException: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
        at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130)
        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:383)
        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:326)
        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363)
        at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393)
        at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:477)
        at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:448)
        at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:206)
        at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:172)
        at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1506)
        at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1421)
        at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:455)
        at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:426)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1854)
        ... 176 more
Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
        at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:388)
        at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:271)
        at java.base/sun.security.validator.Validator.validate(Validator.java:256)
        at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:241)
        at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:113)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.HostNameOverrideX509TrustManager.checkServerTrusted(SQLServerTrustManager.java:88)
        at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkServerTrusted(SSLContextImpl.java:1430)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:631)
        ... 188 more
Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
        at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:148)
        at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:129)
        at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
        at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:383)
        ... 195 more

12:17:28,470 ERROR [org.jboss.msc.service.fail] (ServerService Thread Pool -- 50) MSC000001: Failed to start service jboss.deployment.subunit."sihdg-3.17.0.0.ear"."sihdg-api.war".component.CacheConfig.START: org.jboss.msc.service.StartException in service jboss.deployment.subunit."sihdg-3.17.0.0.ear"."sihdg-api.war".component.CacheConfig.START: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:57)
        at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
        at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at java.base/java.lang.Thread.run(Thread.java:1583)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)
Caused by: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:170)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:141)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.getComponentInstance(SingletonComponent.java:127)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.SingletonComponent.start(SingletonComponent.java:141)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ComponentStartService$1.run(ComponentStartService.java:54)
        ... 8 more
Caused by: jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:219)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.supports(CMTTxInterceptor.java:448)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:164)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS$$$view26.consultarTodosPerfisRelacionados(Unknown Source)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS$Proxy$_$$_Weld$EnterpriseProxy$.consultarTodosPerfisRelacionados(Unknown Source)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarPerfilRecursoCache(AtualizadorCacheAS.java:128)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarCache(AtualizadorCacheAS.java:80)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.supports(CMTTxInterceptor.java:448)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:164)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:78)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityOutflowInterceptor.processInvocation(IdentityOutflowInterceptor.java:73)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.SecurityDomainInterceptor.processInvocation(SecurityDomainInterceptor.java:44)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.lambda$processInvocation$0(IdentityInterceptor.java:47)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.SecurityIdentity.runAsFunctionEx(SecurityIdentity.java:421)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsFunctionEx(Scoped.java:161)
        at org.wildfly.security.elytron-base@2.2.14.Final-redhat-00001//org.wildfly.security.auth.server.Scoped.runAsSupplierEx(Scoped.java:229)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS$$$view29.verificarEAtualizarCache(Unknown Source)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:412)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:133)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:54)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:69)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:109)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS$Proxy$_$$_Weld$EnterpriseProxy$.verificarEAtualizarCache(Unknown Source)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.comum.config.cache.CacheConfig.onStartup(CacheConfig.java:37)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceLifecycleMethodInterceptor.processInvocation(ManagedReferenceLifecycleMethodInterceptor.java:96)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doLifecycleInterception(Jsr299BindingsInterceptor.java:126)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:112)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.weld.core@5.1.6.Final-redhat-00001//org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:87)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionInterceptor.processInvocation(WeldInjectionInterceptor.java:53)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.AroundConstructInterceptorFactory$1.processInvocation(AroundConstructInterceptorFactory.java:28)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInterceptorInjectionInterceptor.processInvocation(WeldInterceptorInjectionInterceptor.java:56)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsCreateInterceptor.processInvocation(Jsr299BindingsCreateInterceptor.java:111)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.requiresNew(CMTTxInterceptor.java:416)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.LifecycleCMTTxInterceptor.processInvocation(LifecycleCMTTxInterceptor.java:68)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.weld@8.0.13.GA-redhat-00002//org.jboss.as.weld.injection.WeldInjectionContextInterceptor.processInvocation(WeldInjectionContextInterceptor.java:43)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.singleton.StartupCountDownInterceptor.processInvocation(StartupCountDownInterceptor.java:25)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:168)
        ... 13 more
Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:61)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:227)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:164)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:107)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:300)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:241)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.query.Query.getResultList(Query.java:119)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRecursoRepository.consultarTodosPerfisRelacionados(PerfilRecursoRepository.java:35)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee7.core.comum.persistencia.dao.seguranca.PerfilRecursoRepository$Proxy$_$$_WeldClientProxy.consultarTodosPerfisRelacionados(Unknown Source)
        at deployment.sihdg-3.17.0.0.ear.sihdg-api.war//br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS.consultarTodosPerfisRelacionados(PerfilRecursoAS.java:132)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
        at org.jboss.as.weld.common@8.0.13.GA-redhat-00002//org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:49)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.jpa@8.0.13.GA-redhat-00002//org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee@8.0.13.GA-redhat-00002//org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:56)
        at org.jboss.invocation@2.0.1.Final-redhat-00001//org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3@8.0.13.GA-redhat-00002//org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:201)
        ... 181 more
Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:160)
        at org.jboss.as.connector@8.0.13.GA-redhat-00002//org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.internal.NonContextualJdbcConnectionAccess.obtainConnection(NonContextualJdbcConnectionAccess.java:38)
        at org.hibernate@6.2.49.Final-redhat-00001//org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:113)
        ... 234 more
Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:690)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
        ... 238 more
Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1381)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:534)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getTransactionNewConnection(AbstractPool.java:770)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:666)
        at org.jboss.ironjacamar.impl@3.0.14.Final-redhat-00001//org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
        ... 241 more
Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: "encrypt" property is set to "true" and "trustServerCertificate" property is set to "false" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target. ClientConnectionId:ff7f0cb1-d4b1-4e03-be9c-9562d3b4cbb3
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.terminate(SQLServerConnection.java:4290)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1965)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:3816)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:3372)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:3197)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:1971)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:1263)
        at org.jboss.ironjacamar.jdbcadapters@3.0.14.Final-redhat-00001//org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
        ... 248 more
Caused by: javax.net.ssl.SSLHandshakeException: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
        at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130)
        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:383)
        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:326)
        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363)
        at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393)
        at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:477)
        at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:448)
        at java.base/sun.security.ssl.TransportContext.dispatch(TransportContext.java:206)
        at java.base/sun.security.ssl.SSLTransport.decode(SSLTransport.java:172)
        at java.base/sun.security.ssl.SSLSocketImpl.decode(SSLSocketImpl.java:1506)
        at java.base/sun.security.ssl.SSLSocketImpl.readHandshakeRecord(SSLSocketImpl.java:1421)
        at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:455)
        at java.base/sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:426)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.TDSChannel.enableSSL(IOBuffer.java:1854)
        ... 254 more
Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
        at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:388)
        at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:271)
        at java.base/sun.security.validator.Validator.validate(Validator.java:256)
        at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:241)
        at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:113)
        at com.microsoft.sqlserver.jdbc//com.microsoft.sqlserver.jdbc.HostNameOverrideX509TrustManager.checkServerTrusted(SQLServerTrustManager.java:88)
        at java.base/sun.security.ssl.AbstractTrustManagerWrapper.checkServerTrusted(SSLContextImpl.java:1430)
        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:631)
        ... 266 more
Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
        at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:148)
        at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:129)
        at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
        at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:383)
        ... 273 more

12:17:28,474 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("deploy") failed - address: ([("deployment" => "sihdg-3.17.0.0.ear")]) - failure description: {"WFLYCTL0080: Failed services" => {
    "jboss.deployment.subunit.\"sihdg-3.17.0.0.ear\".\"sihdg-api.war\".component.SecurityConfig.START" => "java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
    Caused by: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
    Caused by: jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
    Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
    Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
    Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
    Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
    Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: \"encrypt\" property is set to \"true\" and \"trustServerCertificate\" property is set to \"false\" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target. ClientConnectionId:ffb78d18-4ca0-4824-9396-bdf3d280f8d6
    Caused by: javax.net.ssl.SSLHandshakeException: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
    Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
    Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target",
    "jboss.deployment.subunit.\"sihdg-3.17.0.0.ear\".\"sihdg-api.war\".component.CacheConfig.START" => "java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
    Caused by: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
    Caused by: jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
    Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
    Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
    Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
    Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
    Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: \"encrypt\" property is set to \"true\" and \"trustServerCertificate\" property is set to \"false\" but the driver could not establish a secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: Error: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target. ClientConnectionId:ff7f0cb1-d4b1-4e03-be9c-9562d3b4cbb3
    Caused by: javax.net.ssl.SSLHandshakeException: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
    Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
    Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target"
}}
12:17:28,478 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 28) WFLYSRV0010: Deployed "sihdg-3.17.0.0.ear" (runtime-name : "sihdg-3.17.0.0.ear")
12:17:28,558 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0183: Service status report
WFLYCTL0186:   Services which failed to start:      service jboss.deployment.subunit."sihdg-3.17.0.0.ear"."sihdg-api.war".component.SecurityConfig.START: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
      service jboss.deployment.subunit."sihdg-3.17.0.0.ear"."sihdg-api.war".component.CacheConfig.START: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
WFLYCTL0448: 2 additional services are down due to their dependencies being missing or failed
12:17:28,579 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
12:17:28,581 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://0.0.0.0:9990/management
12:17:28,581 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0054: Admin console is not enabled
12:17:28,583 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) started (with errors) in 34322ms - Started 1176 of 1265 services (7 services failed or missing dependencies, 162 services are lazy, passive or on-demand) - Server configuration file in use: standalone.xml
^C
-sh-4.2$ timeout 5 bash -c '</dev/tcp/<host>/<porta>' && echo PORTA_OK || echo FALHOU
bash: -c: line 0: erro de sintaxe próximo do `token' não esperado `newline'
bash: -c: line 0: `</dev/tcp/<host>/<porta>'
FALHOU
-sh-4.2$ oc logs sihdg-jboss8-tqs-25-8k2nr -c sihdg-jboss8-tqs -n sihdg-tqs --previous | tail -100
Error from server (BadRequest): previous terminated container "sihdg-jboss8-tqs" in pod "sihdg-jboss8-tqs-25-8k2nr" not found
-sh-4.2$ oc describe pod sihdg-jboss8-tqs-25-8k2nr -n sihdg-tqs | sed -n '/Last State/,/Ready/p;/Events/,$p'

