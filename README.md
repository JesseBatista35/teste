Using openshift launcher.
2026-07-17 18:11:15 Launching WildFly Server
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

[0m15:11:16,435 INFO  [org.jboss.modules] (main) JBoss Modules version 2.1.6.Final-redhat-00001
[0m[0m15:11:17,210 INFO  [org.jboss.msc] (main) JBoss MSC version 1.5.5.Final-redhat-00001
[0m[0m15:11:17,214 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
[0m[0m15:11:17,332 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) starting
[0m[32m15:11:17,333 DEBUG [org.jboss.as.config] (MSC service thread 1-2) Configured system properties:
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
	jboss.bind.address = 25.0.20.3
	jboss.bind.address.management = 0.0.0.0
	jboss.bind.address.private = 25.0.20.3
	jboss.home.dir = /opt/server
	jboss.host.name = sihdg-jboss8-des-32-2gshs
	jboss.messaging.cluster.password = <redacted>
	jboss.messaging.host = 25.0.20.3
	jboss.modules.system.pkgs = jdk.nashorn.api,com.sun.crypto.provider
	jboss.node.name = sihdg-jboss8-des-32-2gshs
	jboss.qualified.host.name = sihdg-jboss8-des-32-2gshs
	jboss.server.base.dir = /opt/server/standalone
	jboss.server.config.dir = /opt/server/standalone/configuration
	jboss.server.data.dir = /opt/server/standalone/data
	jboss.server.log.dir = /opt/server/standalone/log
	jboss.server.name = sihdg-jboss8-des-32-2gshs
	jboss.server.persist.config = true
	jboss.server.temp.dir = /opt/server/standalone/tmp
	jboss.tx.node.id = hdg-jboss8-des-32-2gshs
	jdk.debug = release
	jdk.serialFilter = maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
	line.separator = 

	logging.configuration = file:/opt/server/standalone/configuration/logging.properties
	module.path = /opt/server/modules
	native.encoding = ANSI_X3.4-1968
	org.jboss.boot.log.file = /opt/server/standalone/log/server.log
	org.jboss.resolver.warning = true
	org.wildfly.internal.cli.boot.hook.marker.dir = /tmp/cli-boot-reload-marker-1784311875
	org.wildfly.internal.cli.boot.hook.script = /tmp/cli-script-1784311875.cli
	org.wildfly.internal.cli.boot.hook.script.error.file = /tmp/cli-script-error-1784311875.cli
	org.wildfly.internal.cli.boot.hook.script.output.file = /tmp/cli-script-output-1784311875.cli
	org.wildfly.internal.cli.boot.hook.script.properties = /tmp/cli-script-property-1784311875.cli
	org.wildfly.internal.cli.boot.hook.script.warn.file = /tmp/cli-warning-1784311875.log
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
	sun.java.command = /opt/server/jboss-modules.jar -mp /opt/server/modules org.jboss.as.standalone -Djboss.home.dir=/opt/server -Djboss.server.base.dir=/opt/server/standalone -c standalone.xml -Djboss.messaging.host=25.0.20.3 -Djboss.messaging.cluster.password=<redacted> --start-mode=admin-only -Dorg.wildfly.internal.cli.boot.hook.script=/tmp/cli-script-1784311875.cli -Dorg.wildfly.internal.cli.boot.hook.marker.dir=/tmp/cli-boot-reload-marker-1784311875 -Dorg.wildfly.internal.cli.boot.hook.script.properties=/tmp/cli-script-property-1784311875.cli -Dorg.wildfly.internal.cli.boot.hook.script.error.file=/tmp/cli-script-error-1784311875.cli -Dorg.wildfly.internal.cli.boot.hook.script.warn.file=/tmp/cli-warning-1784311875.log -Dorg.wildfly.internal.cli.boot.hook.script.output.file=/tmp/cli-script-output-1784311875.cli -Djboss.node.name=sihdg-jboss8-des-32-2gshs -Djboss.tx.node.id=hdg-jboss8-des-32-2gshs -bprivate 25.0.20.3 -b 25.0.20.3 -bmanagement 0.0.0.0 -Dwildfly.statistics-enabled=true
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
[0m[32m15:11:17,334 DEBUG [org.jboss.as.config] (MSC service thread 1-2) VM Arguments: -D[Standalone] -Xlog:gc*:file=/opt/server/standalone/log/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-exports=jdk.naming.dns/com.sun.jndi.dns=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/opt/server/standalone/log/server.log -Dlogging.configuration=file:/opt/server/standalone/configuration/logging.properties 
[0m[0m15:11:18,412 INFO  [org.jboss.as.controller] (Controller Boot Thread) OPVDX003: No schemas available from /opt/server/docs/schema - disabling validation error pretty printing
[0m[31m15:11:18,412 ERROR [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0055: Caught exception during boot: org.jboss.as.controller.persistence.ConfigurationPersistenceException: WFLYCTL0085: Failed to parse configuration
	at org.jboss.as.controller@21.0.20.Final-redhat-00001//org.jboss.as.controller.persistence.XmlConfigurationPersister.load(XmlConfigurationPersister.java:139)
	at org.jboss.as.server@21.0.20.Final-redhat-00001//org.jboss.as.server.ServerService.boot(ServerService.java:398)
	at org.jboss.as.controller@21.0.20.Final-redhat-00001//org.jboss.as.controller.AbstractControllerService$1.run(AbstractControllerService.java:370)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: javax.xml.stream.XMLStreamException: WFLYCTL0083: Failed to load module org.jboss.as.ejb3
	at org.jboss.as.controller@21.0.20.Final-redhat-00001//org.jboss.as.controller.parsing.DeferredExtensionContext.load(DeferredExtensionContext.java:95)
	at org.jboss.as.server@21.0.20.Final-redhat-00001//org.jboss.as.server.parsing.StandaloneXml_18.readServerElement(StandaloneXml_18.java:235)
	at org.jboss.as.server@21.0.20.Final-redhat-00001//org.jboss.as.server.parsing.StandaloneXml_18.readElement(StandaloneXml_18.java:139)
	at org.jboss.as.server@21.0.20.Final-redhat-00001//org.jboss.as.server.parsing.StandaloneXml.readElement(StandaloneXml.java:132)
	at org.jboss.as.server@21.0.20.Final-redhat-00001//org.jboss.as.server.parsing.StandaloneXml.readElement(StandaloneXml.java:52)
	at org.jboss.staxmapper@1.4.0.Final-redhat-00001//org.jboss.staxmapper.XMLMapperImpl.processNested(XMLMapperImpl.java:122)
	at org.jboss.staxmapper@1.4.0.Final-redhat-00001//org.jboss.staxmapper.XMLMapperImpl.parseDocument(XMLMapperImpl.java:76)
	at org.jboss.as.controller@21.0.20.Final-redhat-00001//org.jboss.as.controller.persistence.XmlConfigurationPersister.load(XmlConfigurationPersister.java:128)
	... 3 more
Caused by: java.util.concurrent.ExecutionException: javax.xml.stream.XMLStreamException: WFLYCTL0083: Failed to load module
	at java.base/java.util.concurrent.FutureTask.report(FutureTask.java:122)
	at java.base/java.util.concurrent.FutureTask.get(FutureTask.java:191)
	at org.jboss.as.controller@21.0.20.Final-redhat-00001//org.jboss.as.controller.parsing.DeferredExtensionContext.load(DeferredExtensionContext.java:90)
	... 10 more
Caused by: javax.xml.stream.XMLStreamException: WFLYCTL0083: Failed to load module
	at org.jboss.as.controller@21.0.20.Final-redhat-00001//org.jboss.as.controller.parsing.DeferredExtensionContext.loadModule(DeferredExtensionContext.java:123)
	at org.jboss.as.controller@21.0.20.Final-redhat-00001//org.jboss.as.controller.parsing.DeferredExtensionContext$1.call(DeferredExtensionContext.java:74)
	at org.jboss.as.controller@21.0.20.Final-redhat-00001//org.jboss.as.controller.parsing.DeferredExtensionContext$1.call(DeferredExtensionContext.java:71)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1348)
	at java.base/java.lang.Thread.run(Thread.java:1583)
	at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)
Caused by: org.jboss.modules.ModuleNotFoundException: org.jboss.as.ejb3
	at org.jboss.modules.ModuleLoader.loadModule(ModuleLoader.java:301)
	at org.jboss.modules.ModuleLoader.loadModule(ModuleLoader.java:287)
	at org.jboss.as.controller@21.0.20.Final-redhat-00001//org.jboss.as.controller.parsing.DeferredExtensionContext.loadModule(DeferredExtensionContext.java:106)
	... 9 more

[0m[31m15:11:18,413 FATAL [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0056: Server boot has failed in an unrecoverable manner; exiting. See previous messages for details. - Server configuration file in use: standalone.xml
[0m[0m15:11:18,515 INFO  [org.wildfly.security] (ServerService Thread Pool -- 19) ELY00001: WildFly Elytron version 2.2.14.Final-redhat-00001
[0m[0m15:11:18,524 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0050: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) stopped in 107ms
[0m
