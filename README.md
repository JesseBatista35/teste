Using openshift launcher.
2026-07-17 18:00:19 Launching WildFly Server
INFO Access log is disabled, ignoring configuration.
INFO Clustering feature is not enabled, no jgroups subsystem present in server configuration.
INFO Server started in admin mode, CLI script executed during server boot.
INFO Running jboss-eap-8/eap81-openjdk21-builder-openshift-rhel9 image, version 1.0.0.GA
JAVA_OPTS already set in environment; overriding default settings with values:  -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider 
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/server

  JAVA: /usr/lib/jvm/java-21/bin/java

  JAVA_OPTS:  -Xlog:gc*:file="/opt/server/standalone/log/gc.log":time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter="maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000"  -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider   --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-exports=jdk.naming.dns/com.sun.jndi.dns=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED

=========================================================================

[0m15:00:20,576 INFO  [org.jboss.modules] (main) JBoss Modules version 2.1.6.Final-redhat-00001
[0m[0m15:00:21,273 INFO  [org.jboss.msc] (main) JBoss MSC version 1.5.5.Final-redhat-00001
[0m[0m15:00:21,277 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
[0m[0m15:00:21,392 INFO  [org.jboss.as] (MSC service thread 1-1) WFLYSRV0049: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) starting
[0m[32m15:00:21,393 DEBUG [org.jboss.as.config] (MSC service thread 1-1) Configured system properties:
	[Standalone] = 
	file.encoding = UTF-8
	file.separator = /
	java.class.path = /opt/server/jboss-modules.jar
	java.class.version = 65.0
	java.home = /usr/lib/jvm/java-21-openjdk-21.0.11.0.10-2.el9.x86_64
	java.io.tmpdir = /tmp
	java.library.path = /usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib
	java.net.preferIPv4Stack = true
	java.runtime.name = OpenJDK Runtime Environment
	java.runtime.version = 21.0.11+10-LTS
	java.security.egd = file:/dev/./urandom
	java.specification.name = Java Platform API Specification
	java.specification.vendor = Oracle Corporation
	java.specification.version = 21
	java.util.logging.manager = org.jboss.logmanager.LogManager
	java.vendor = Red Hat, Inc.
	java.vendor.url = https://www.redhat.com/
	java.vendor.url.bug = https://access.redhat.com/support/cases/
	java.vendor.version = (Red_Hat-21.0.11.0.10-1)
	java.version = 21.0.11
	java.version.date = 2026-04-21
	java.vm.compressedOopsMode = 32-bit
	java.vm.info = mixed mode, sharing
	java.vm.name = OpenJDK 64-Bit Server VM
	java.vm.specification.name = Java Virtual Machine Specification
	java.vm.specification.vendor = Oracle Corporation
	java.vm.specification.version = 21
	java.vm.vendor = Red Hat, Inc.
	java.vm.version = 21.0.11+10-LTS
	javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
	jboss.bind.address = 25.3.43.202
	jboss.bind.address.management = 0.0.0.0
	jboss.bind.address.private = 25.3.43.202
	jboss.home.dir = /opt/server
	jboss.host.name = sihdg-jboss8-des-31-k9l8q
	jboss.messaging.cluster.password = <redacted>
	jboss.messaging.host = 25.3.43.202
	jboss.modules.system.pkgs = jdk.nashorn.api,com.sun.crypto.provider
	jboss.node.name = sihdg-jboss8-des-31-k9l8q
	jboss.qualified.host.name = sihdg-jboss8-des-31-k9l8q
	jboss.server.base.dir = /opt/server/standalone
	jboss.server.config.dir = /opt/server/standalone/configuration
	jboss.server.data.dir = /opt/server/standalone/data
	jboss.server.log.dir = /opt/server/standalone/log
	jboss.server.name = sihdg-jboss8-des-31-k9l8q
	jboss.server.persist.config = true
	jboss.server.temp.dir = /opt/server/standalone/tmp
	jboss.tx.node.id = hdg-jboss8-des-31-k9l8q
	jdk.debug = release
	jdk.serialFilter = maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
	line.separator = 

	logging.configuration = file:/opt/server/standalone/configuration/logging.properties
	module.path = /opt/server/modules
	native.encoding = ANSI_X3.4-1968
	org.jboss.boot.log.file = /opt/server/standalone/log/server.log
	org.jboss.resolver.warning = true
	org.wildfly.internal.cli.boot.hook.marker.dir = /tmp/cli-boot-reload-marker-1784311219
	org.wildfly.internal.cli.boot.hook.script = /tmp/cli-script-1784311219.cli
	org.wildfly.internal.cli.boot.hook.script.error.file = /tmp/cli-script-error-1784311219.cli
	org.wildfly.internal.cli.boot.hook.script.output.file = /tmp/cli-script-output-1784311219.cli
	org.wildfly.internal.cli.boot.hook.script.properties = /tmp/cli-script-property-1784311219.cli
	org.wildfly.internal.cli.boot.hook.script.warn.file = /tmp/cli-warning-1784311219.log
	os.arch = amd64
	os.name = Linux
	os.version = 6.1.18-200.fc37.x86_64
	path.separator = :
	stderr.encoding = ANSI_X3.4-1968
	stdout.encoding = ANSI_X3.4-1968
	sun.arch.data.model = 64
	sun.boot.library.path = /usr/lib/jvm/java-21-openjdk-21.0.11.0.10-2.el9.x86_64/lib
	sun.cpu.endian = little
	sun.io.unicode.encoding = UnicodeLittle
	sun.java.command = /opt/server/jboss-modules.jar -mp /opt/server/modules org.jboss.as.standalone -Djboss.home.dir=/opt/server -Djboss.server.base.dir=/opt/server/standalone -c standalone.xml -Djboss.messaging.host=25.3.43.202 -Djboss.messaging.cluster.password=<redacted> --start-mode=admin-only -Dorg.wildfly.internal.cli.boot.hook.script=/tmp/cli-script-1784311219.cli -Dorg.wildfly.internal.cli.boot.hook.marker.dir=/tmp/cli-boot-reload-marker-1784311219 -Dorg.wildfly.internal.cli.boot.hook.script.properties=/tmp/cli-script-property-1784311219.cli -Dorg.wildfly.internal.cli.boot.hook.script.error.file=/tmp/cli-script-error-1784311219.cli -Dorg.wildfly.internal.cli.boot.hook.script.warn.file=/tmp/cli-warning-1784311219.log -Dorg.wildfly.internal.cli.boot.hook.script.output.file=/tmp/cli-script-output-1784311219.cli -Djboss.node.name=sihdg-jboss8-des-31-k9l8q -Djboss.tx.node.id=hdg-jboss8-des-31-k9l8q -bprivate 25.3.43.202 -b 25.3.43.202 -bmanagement 0.0.0.0 -Dwildfly.statistics-enabled=true
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
[0m[32m15:00:21,394 DEBUG [org.jboss.as.config] (MSC service thread 1-1) VM Arguments: -D[Standalone] -Xlog:gc*:file=/opt/server/standalone/log/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-exports=jdk.naming.dns/com.sun.jndi.dns=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/opt/server/standalone/log/server.log -Dlogging.configuration=file:/opt/server/standalone/configuration/logging.properties 
[0m[0m15:00:22,489 INFO  [org.wildfly.security] (ServerService Thread Pool -- 15) ELY00001: WildFly Elytron version 2.2.14.Final-redhat-00001
[0m[0m15:00:23,466 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
[0m[0m15:00:23,475 INFO  [org.xnio] (MSC service thread 1-2) XNIO version 3.8.16.Final-redhat-00001
[0m[0m15:00:23,479 INFO  [org.xnio.nio] (MSC service thread 1-2) XNIO NIO Implementation Version 3.8.16.Final-redhat-00001
[0m[0m15:00:23,574 INFO  [org.jboss.remoting] (MSC service thread 1-2) JBoss Remoting version 5.0.31.Final-redhat-00001
[0m[33m15:00:23,575 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY00023: KeyStore file '/opt/server/standalone/configuration/application.keystore' does not exist. Used blank.
[0m[33m15:00:23,579 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY01084: KeyStore /opt/server/standalone/configuration/application.keystore not found, it will be auto-generated on first use with a self-signed certificate for host localhost
[0m[0m15:00:23,896 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
[0m[0m15:00:23,957 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://0.0.0.0:9990/management
[0m[0m15:00:23,957 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0054: Admin console is not enabled
[0m[0m15:00:23,957 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) started in 3787ms - Started 72 of 84 services (26 services are lazy, passive or on-demand) - Server configuration file in use: standalone.xml
[0m[0m15:00:23,958 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0472: Checking for presence of marker file indicating that the server has been restarted following execution of the additional commands from the CLI script
[0m[0m15:00:23,958 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0474: No marker file found indicating that the server has been restarted following execution of the additional commands from the CLI script
[0m[0m15:00:23,958 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0466: Initialised the additional boot CLI script functionality. The CLI commands will be read from /tmp/cli-script-1784311219.cli. The server will be rebooted to normal mode after these have been executed
[0m[0m15:00:23,967 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0467: Running the additional commands from the CLI script /tmp/cli-script-1784311219.cli against the server which is running in admin-only mode
[0m[0m15:00:23,968 INFO  [org.jboss.as.cli] (Controller Boot Thread) WFLYCLI0001: Processing CLI script /tmp/cli-script-1784311219.cli
[0m[0m15:00:24,361 INFO  [org.jboss.as.cli] (Controller Boot Thread) WFLYCLI0005: Done processing CLI script /tmp/cli-script-1784311219.cli
[0m[0m15:00:24,361 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0468: Completed running the commands from the CLI script
[0m[0m15:00:24,362 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0470: Reloading the server to normal mode after execution of the additional commands from the CLI script. This will clear the properties triggering the additional boot cli script functionality if they were set (org.wildfly.internal.cli.boot.hook.script, org.wildfly.internal.cli.boot.hook.reload.skip, org.wildfly.internal.cli.boot.hook.marker.dir), and delete the marker file indicating the server was restarted
[0m[0m15:00:24,373 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0050: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) stopped in 9ms
[0m[0m15:00:24,374 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) starting
[0m[32m15:00:24,374 DEBUG [org.jboss.as.config] (MSC service thread 1-2) Configured system properties:
	[Standalone] = 
	file.encoding = UTF-8
	file.separator = /
	java.class.path = /opt/server/jboss-modules.jar
	java.class.version = 65.0
	java.home = /usr/lib/jvm/java-21-openjdk-21.0.11.0.10-2.el9.x86_64
	java.io.tmpdir = /tmp
	java.library.path = /usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib
	java.net.preferIPv4Stack = true
	java.runtime.name = OpenJDK Runtime Environment
	java.runtime.version = 21.0.11+10-LTS
	java.security.egd = file:/dev/./urandom
	java.specification.name = Java Platform API Specification
	java.specification.vendor = Oracle Corporation
	java.specification.version = 21
	java.util.logging.manager = org.jboss.logmanager.LogManager
	java.vendor = Red Hat, Inc.
	java.vendor.url = https://www.redhat.com/
	java.vendor.url.bug = https://access.redhat.com/support/cases/
	java.vendor.version = (Red_Hat-21.0.11.0.10-1)
	java.version = 21.0.11
	java.version.date = 2026-04-21
	java.vm.compressedOopsMode = 32-bit
	java.vm.info = mixed mode, sharing
	java.vm.name = OpenJDK 64-Bit Server VM
	java.vm.specification.name = Java Virtual Machine Specification
	java.vm.specification.vendor = Oracle Corporation
	java.vm.specification.version = 21
	java.vm.vendor = Red Hat, Inc.
	java.vm.version = 21.0.11+10-LTS
	javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
	jboss.bind.address = 25.3.43.202
	jboss.bind.address.management = 0.0.0.0
	jboss.bind.address.private = 25.3.43.202
	jboss.home.dir = /opt/server
	jboss.host.name = sihdg-jboss8-des-31-k9l8q
	jboss.messaging.cluster.password = <redacted>
	jboss.messaging.host = 25.3.43.202
	jboss.modules.system.pkgs = jdk.nashorn.api,com.sun.crypto.provider
	jboss.node.name = sihdg-jboss8-des-31-k9l8q
	jboss.qualified.host.name = sihdg-jboss8-des-31-k9l8q
	jboss.server.base.dir = /opt/server/standalone
	jboss.server.config.dir = /opt/server/standalone/configuration
	jboss.server.data.dir = /opt/server/standalone/data
	jboss.server.log.dir = /opt/server/standalone/log
	jboss.server.name = sihdg-jboss8-des-31-k9l8q
	jboss.server.persist.config = true
	jboss.server.temp.dir = /opt/server/standalone/tmp
	jboss.tx.node.id = hdg-jboss8-des-31-k9l8q
	jdk.debug = release
	jdk.serialFilter = maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
	line.separator = 

	logging.configuration = file:/opt/server/standalone/configuration/logging.properties
	module.path = /opt/server/modules
	native.encoding = ANSI_X3.4-1968
	org.jboss.boot.log.file = /opt/server/standalone/log/server.log
	org.jboss.resolver.warning = true
	org.wildfly.internal.cli.boot.hook.script.error.file = /tmp/cli-script-error-1784311219.cli
	org.wildfly.internal.cli.boot.hook.script.output.file = /tmp/cli-script-output-1784311219.cli
	org.wildfly.internal.cli.boot.hook.script.properties = /tmp/cli-script-property-1784311219.cli
	org.wildfly.internal.cli.boot.hook.script.warn.file = /tmp/cli-warning-1784311219.log
	os.arch = amd64
	os.name = Linux
	os.version = 6.1.18-200.fc37.x86_64
	path.separator = :
	stderr.encoding = ANSI_X3.4-1968
	stdout.encoding = ANSI_X3.4-1968
	sun.arch.data.model = 64
	sun.boot.library.path = /usr/lib/jvm/java-21-openjdk-21.0.11.0.10-2.el9.x86_64/lib
	sun.cpu.endian = little
	sun.io.unicode.encoding = UnicodeLittle
	sun.java.command = /opt/server/jboss-modules.jar -mp /opt/server/modules org.jboss.as.standalone -Djboss.home.dir=/opt/server -Djboss.server.base.dir=/opt/server/standalone -c standalone.xml -Djboss.messaging.host=25.3.43.202 -Djboss.messaging.cluster.password=<redacted> --start-mode=admin-only -Dorg.wildfly.internal.cli.boot.hook.script=/tmp/cli-script-1784311219.cli -Dorg.wildfly.internal.cli.boot.hook.marker.dir=/tmp/cli-boot-reload-marker-1784311219 -Dorg.wildfly.internal.cli.boot.hook.script.properties=/tmp/cli-script-property-1784311219.cli -Dorg.wildfly.internal.cli.boot.hook.script.error.file=/tmp/cli-script-error-1784311219.cli -Dorg.wildfly.internal.cli.boot.hook.script.warn.file=/tmp/cli-warning-1784311219.log -Dorg.wildfly.internal.cli.boot.hook.script.output.file=/tmp/cli-script-output-1784311219.cli -Djboss.node.name=sihdg-jboss8-des-31-k9l8q -Djboss.tx.node.id=hdg-jboss8-des-31-k9l8q -bprivate 25.3.43.202 -b 25.3.43.202 -bmanagement 0.0.0.0 -Dwildfly.statistics-enabled=true
	sun.java.launcher = SUN_STANDARD
	sun.jnu.encoding = ANSI_X3.4-1968
	sun.management.compiler = HotSpot 64-Bit Tiered Compilers
	sun.nio.ch.bugLevel = 
	user.country = US
	user.dir = /home/jboss
	user.home = /home/jboss
	user.language = en
	user.name = jboss
	user.timezone = America/Sao_Paulo
	wildfly.statistics-enabled = true
[0m[32m15:00:24,374 DEBUG [org.jboss.as.config] (MSC service thread 1-2) VM Arguments: -D[Standalone] -Xlog:gc*:file=/opt/server/standalone/log/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-exports=jdk.naming.dns/com.sun.jndi.dns=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/opt/server/standalone/log/server.log -Dlogging.configuration=file:/opt/server/standalone/configuration/logging.properties 
[0m[0m15:00:24,887 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 14) WFLYDR0001: Content added at location /opt/server/standalone/data/content/2c/b67efd63225616bb5cdbdc1e04cfe2cf35d8b7/content
[0m[0m15:00:24,899 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
[0m[0m15:00:24,955 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 32) WFLYRS0016: RESTEasy version 6.2.15.Final-redhat-00002
[0m[0m15:00:24,956 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 30) WFLYCLINF0001: Activating Infinispan subsystem.
[0m[0m15:00:24,956 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 36) WFLYNAM0001: Activating Naming Subsystem
[0m[0m15:00:24,956 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 29) WFLYHEALTH0001: Activating Base Health Subsystem
[0m[0m15:00:24,957 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 31) WFLYIO001: Worker 'default' has auto-configured to 2 IO threads with 16 max task threads based on your 1 available processors
[0m[0m15:00:24,964 INFO  [org.jboss.as.connector] (MSC service thread 1-1) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 3.0.14.Final-redhat-00001)
[0m[0m15:00:25,070 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 40) WFLYUT0112: The value 'require-host-http11' attribute in the '/subsystem=undertow/server=default-server/http-listener=default' resource is 'false', which will be ignored. The server now always enforces the RFC 9112 requirement that HTTP/1.1 request messages include a Host header.
[0m[0m15:00:25,073 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Starting deployment of "sihdg-3.13.0.4.ear" (runtime-name: "sihdg-3.13.0.4.ear")
[0m[0m15:00:25,170 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0003: Undertow 2.3.23.SP3-redhat-00001 starting
[0m[0m15:00:25,259 INFO  [org.jboss.as.naming] (MSC service thread 1-1) WFLYNAM0003: Starting Naming Service
[0m[33m15:00:25,260 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY00023: KeyStore file '/opt/server/standalone/configuration/application.keystore' does not exist. Used blank.
[0m[33m15:00:25,264 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY01084: KeyStore /opt/server/standalone/configuration/application.keystore not found, it will be auto-generated on first use with a self-signed certificate for host localhost
[0m[0m15:00:25,269 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0012: Started server default-server.
[0m[0m15:00:25,270 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) Queuing requests.
[0m[0m15:00:25,271 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0018: Host default-host starting
[0m[0m15:00:25,272 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: Undertow HTTP listener default listening on 0.0.0.0:8080
[0m[0m15:00:25,460 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-1) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/server/standalone/deployments
[0m[0m15:00:26,060 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0207: Starting subdeployment (runtime-name: "sihdg-api.war")
[0m[33m15:00:31,269 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0001: /content/sihdg-3.13.0.4.ear/sihdg-api.war/WEB-INF/jboss-deployment-structure.xml in subdeployment ignored. jboss-deployment-structure.xml is only parsed for top level deployments.
[0m[0m15:00:31,882 INFO  [org.jboss.as.jpa] (MSC service thread 1-2) WFLYJPA0002: Read persistence.xml for sihdgDS
[0m[0m15:00:32,264 INFO  [org.jipijapa] (MSC service thread 1-1) JIPIORMV6020260: Second level cache enabled for sihdg-3.13.0.4.ear/sihdg-api.war#sihdgDS
[0m[0m15:00:32,370 INFO  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0003: Processing weld deployment sihdg-3.13.0.4.ear
[0m[0m15:00:32,675 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-1) HV000001: Hibernate Validator 8.0.2.Final-redhat-00001
[0m[0m15:00:32,976 INFO  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0003: Processing weld deployment sihdg-api.war
[0m[0m15:00:33,273 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 42) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.marshalling.jboss.JBossMarshaller'
[0m[0m15:00:33,282 INFO  [org.jboss.weld.Version] (MSC service thread 1-1) WELD-000900: 5.1.6 (redhat)
[0m[0m15:00:33,462 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV6020260: Second level cache enabled for sihdg-3.13.0.4.ear/sihdg-api.war#sihdgDS
[0m[33m15:00:33,555 WARN  [org.jboss.as.jaxrs] (MSC service thread 1-2) WFLYRS0018: Explicit usage of Jackson annotation in a Jakarta RESTful Web Services deployment; the system will disable Jakarta JSON Binding processing for the current deployment. Consider setting the 'resteasy.preferJacksonOverJsonB' property to 'false' to restore Jakarta JSON Binding.
[0m[31m15:00:33,992 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("deploy") failed - address: ([("deployment" => "sihdg-3.13.0.4.ear")]) - failure description: {
    "WFLYCTL0412: Required services that are not installed:" => [
        "jboss.naming.context.java.module.\"sihdg-3.13.0.4\".sihdg-api.TimerService",
        "jboss.naming.context.java.jboss.jdbc.sihdgDS"
    ],
    "WFLYCTL0180: Services with missing/unavailable dependencies" => [
        "jboss.naming.context.java.module.\"sihdg-3.13.0.4\".sihdg-api.env.\"br.gov.caixa.arquitetura.javaee.core.comum.servico.ControleCacheTask\".timerService is missing [jboss.naming.context.java.module.\"sihdg-3.13.0.4\".sihdg-api.TimerService]",
        "jboss.persistenceunit.\"sihdg-3.13.0.4.ear/sihdg-api.war#sihdgDS\".__FIRST_PHASE__ is missing [jboss.naming.context.java.jboss.jdbc.sihdgDS]",
        "jboss.persistenceunit.\"sihdg-3.13.0.4.ear/sihdg-api.war#sihdgDS\" is missing [jboss.naming.context.java.jboss.jdbc.sihdgDS]"
    ]
}
[0m[0m15:00:33,999 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 26) WFLYSRV0010: Deployed "sihdg-3.13.0.4.ear" (runtime-name : "sihdg-3.13.0.4.ear")
[0m[0m15:00:34,055 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0183: Service status report
WFLYCTL0184:    New missing/unsatisfied dependencies:
      service jboss.naming.context.java.jboss.jdbc.sihdgDS (missing) dependents: [service jboss.persistenceunit."sihdg-3.13.0.4.ear/sihdg-api.war#sihdgDS".__FIRST_PHASE__, service jboss.persistenceunit."sihdg-3.13.0.4.ear/sihdg-api.war#sihdgDS"] 
      service jboss.naming.context.java.module."sihdg-3.13.0.4".sihdg-api.TimerService (missing) dependents: [service jboss.naming.context.java.module."sihdg-3.13.0.4".sihdg-api.env."br.gov.caixa.arquitetura.javaee.core.comum.servico.ControleCacheTask".timerService] 
WFLYCTL0448: 30 additional services are down due to their dependencies being missing or failed
[0m[0m15:00:34,078 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
[0m[0m15:00:34,079 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://0.0.0.0:9990/management
[0m[0m15:00:34,079 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0054: Admin console is not enabled
[0m[31m15:00:34,079 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) started (with errors) in 9703ms - Started 303 of 416 services (35 services failed or missing dependencies, 149 services are lazy, passive or on-demand) - Server configuration file in use: standalone.xml
[0m





