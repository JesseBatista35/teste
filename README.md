-sh-4.2$ oc get istag sihdg-jboss8:3.12.0.7 -n build-images-ads -o yaml
Error from server (NotFound): imagestreamtags.image.openshift.io "sihdg-jboss8" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get builds -n build-images-ads | grep sihdg-jboss8 oc logs build/ -n build-images-ads | grep -i "Cloning|commit|branch"
grep: oc: Arquivo ou diretório não encontrado
grep: logs: Arquivo ou diretório não encontrado
grep: build/: Arquivo ou diretório não encontrado
grep: build-images-ads: Arquivo ou diretório não encontrado
No resources found.
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get bc sihdg-jboss8 -n build-images-ads -o yaml
Error from server (NotFound): buildconfigs.build.openshift.io "sihdg-jboss8" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc image extract image-registry.openshift-image-registry.svc:5000/build-images-ads/sihdg-jboss8@ --path /opt/server/standalone/configuration/standalone.xml:/tmp/verificacao -n build-images-ads cat /tmp/verificacao/standalone.xml | grep -A2 connection-url
error: invalid argument: stat /tmp/verificacao: no such file or directory
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs sihdg-jboss8-des-19-6r65j -n sihdg-des --previous | tail -100
        jboss.server.temp.dir = /opt/server/standalone/tmp
        jboss.tx.node.id = hdg-jboss8-des-19-6r65j
        jdk.debug = release
        jdk.serialFilter = maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
        line.separator =

        logging.configuration = file:/opt/server/standalone/configuration/logging.properties
        module.path = /opt/server/modules
        native.encoding = ANSI_X3.4-1968
        org.jboss.boot.log.file = /opt/server/standalone/log/server.log
        org.jboss.resolver.warning = true
        org.wildfly.internal.cli.boot.hook.script.error.file = /tmp/cli-script-error-1784308849.cli
        org.wildfly.internal.cli.boot.hook.script.output.file = /tmp/cli-script-output-1784308849.cli
        org.wildfly.internal.cli.boot.hook.script.properties = /tmp/cli-script-property-1784308849.cli
        org.wildfly.internal.cli.boot.hook.script.warn.file = /tmp/cli-warning-1784308849.log
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
        sun.java.command = /opt/server/jboss-modules.jar -mp /opt/server/modules org.jboss.as.standalone -Djboss.home.dir=/opt/server -Djboss.server.base.dir=/opt/server/standalone -c standalone.xml -Djboss.messaging.host=25.1.22.58 -Djboss.messaging.cluster.password=<redacted> --start-mode=admin-only -Dorg.wildfly.internal.cli.boot.hook.script=/tmp/cli-script-1784308849.cli -Dorg.wildfly.internal.cli.boot.hook.marker.dir=/tmp/cli-boot-reload-marker-1784308849 -Dorg.wildfly.internal.cli.boot.hook.script.properties=/tmp/cli-script-property-1784308849.cli -Dorg.wildfly.internal.cli.boot.hook.script.error.file=/tmp/cli-script-error-1784308849.cli -Dorg.wildfly.internal.cli.boot.hook.script.warn.file=/tmp/cli-warning-1784308849.log -Dorg.wildfly.internal.cli.boot.hook.script.output.file=/tmp/cli-script-output-1784308849.cli -Djboss.node.name=sihdg-jboss8-des-19-6r65j -Djboss.tx.node.id=hdg-jboss8-des-19-6r65j -bprivate 25.1.22.58 -b 25.1.22.58 -bmanagement 0.0.0.0 -Dwildfly.statistics-enabled=true
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
14:20:54,895 DEBUG [org.jboss.as.config] (MSC service thread 1-1) VM Arguments: -D[Standalone] -Xlog:gc*:file=/opt/server/standalone/log/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MetaspaceSize=96m -XX:+ExitOnOutOfMemoryError -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=jdk.nashorn.api,com.sun.crypto.provider --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-exports=jdk.naming.dns/com.sun.jndi.dns=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/opt/server/standalone/log/server.log -Dlogging.configuration=file:/opt/server/standalone/configuration/logging.properties
14:20:55,421 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 12) WFLYDR0001: Content added at location /opt/server/standalone/data/content/20/f9290d09f0cc18b1c626afd112ff5d72a6130e/content
14:20:55,434 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
14:20:55,487 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 32) WFLYRS0016: RESTEasy version 6.2.15.Final-redhat-00002
14:20:55,487 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 30) WFLYCLINF0001: Activating Infinispan subsystem.
14:20:55,493 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 29) WFLYHEALTH0001: Activating Base Health Subsystem
14:20:55,495 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 36) WFLYNAM0001: Activating Naming Subsystem
14:20:55,569 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 31) WFLYIO001: Worker 'default' has auto-configured to 2 IO threads with 16 max task threads based on your 1 available processors
14:20:55,570 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY00023: KeyStore file '/opt/server/standalone/configuration/application.keystore' does not exist. Used blank.
14:20:55,570 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY01084: KeyStore /opt/server/standalone/configuration/application.keystore not found, it will be auto-generated on first use with a self-signed certificate for host localhost
14:20:55,673 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Starting deployment of "sihdg-3.9.0.0.ear" (runtime-name: "sihdg-3.9.0.0.ear")
14:20:55,679 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 40) WFLYUT0112: The value 'require-host-http11' attribute in the '/subsystem=undertow/server=default-server/http-listener=default' resource is 'false', which will be ignored. The server now always enforces the RFC 9112 requirement that HTTP/1.1 request messages include a Host header.
14:20:55,682 INFO  [org.jboss.as.connector] (MSC service thread 1-2) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 3.0.14.Final-redhat-00001)
14:20:55,787 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0003: Undertow 2.3.23.SP3-redhat-00001 starting
14:20:55,871 INFO  [org.jboss.as.naming] (MSC service thread 1-2) WFLYNAM0003: Starting Naming Service
14:20:55,878 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0012: Started server default-server.
14:20:55,882 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) Queuing requests.
14:20:55,883 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0018: Host default-host starting
14:20:55,889 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0006: Undertow HTTP listener default listening on 0.0.0.0:8080
14:20:55,983 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-1) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/server/standalone/deployments
14:20:56,795 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0207: Starting subdeployment (runtime-name: "sihdg-api.war")
14:21:02,216 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0001: /content/sihdg-3.9.0.0.ear/sihdg-api.war/WEB-INF/jboss-deployment-structure.xml in subdeployment ignored. jboss-deployment-structure.xml is only parsed for top level deployments.
14:21:02,808 INFO  [org.jboss.as.jpa] (MSC service thread 1-1) WFLYJPA0002: Read persistence.xml for sihdgDS
14:21:03,203 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV6020260: Second level cache enabled for sihdg-3.9.0.0.ear/sihdg-api.war#sihdgDS
14:21:03,370 INFO  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0003: Processing weld deployment sihdg-3.9.0.0.ear
14:21:03,785 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-1) HV000001: Hibernate Validator 8.0.2.Final-redhat-00001
14:21:04,101 INFO  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0003: Processing weld deployment sihdg-api.war
14:21:04,302 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 42) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.marshalling.jboss.JBossMarshaller'
14:21:04,492 INFO  [org.jboss.weld.Version] (MSC service thread 1-2) WELD-000900: 5.1.6 (redhat)
14:21:04,679 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV6020260: Second level cache enabled for sihdg-3.9.0.0.ear/sihdg-api.war#sihdgDS
14:21:04,694 WARN  [org.jboss.as.jaxrs] (MSC service thread 1-2) WFLYRS0018: Explicit usage of Jackson annotation in a Jakarta RESTful Web Services deployment; the system will disable Jakarta JSON Binding processing for the current deployment. Consider setting the 'resteasy.preferJacksonOverJsonB' property to 'false' to restore Jakarta JSON Binding.
14:21:05,179 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("deploy") failed - address: ([("deployment" => "sihdg-3.9.0.0.ear")]) - failure description: {
    "WFLYCTL0412: Required services that are not installed:" => [
        "jboss.naming.context.java.module.\"sihdg-3.9.0.0\".sihdg-api.TimerService",
        "jboss.naming.context.java.jboss.jdbc.sihdgDS"
    ],
    "WFLYCTL0180: Services with missing/unavailable dependencies" => [
        "jboss.naming.context.java.module.\"sihdg-3.9.0.0\".sihdg-api.env.\"br.gov.caixa.arquitetura.javaee.core.comum.servico.ControleCacheTask\".timerService is missing [jboss.naming.context.java.module.\"sihdg-3.9.0.0\".sihdg-api.TimerService]",
        "jboss.persistenceunit.\"sihdg-3.9.0.0.ear/sihdg-api.war#sihdgDS\" is missing [jboss.naming.context.java.jboss.jdbc.sihdgDS]",
        "jboss.persistenceunit.\"sihdg-3.9.0.0.ear/sihdg-api.war#sihdgDS\".__FIRST_PHASE__ is missing [jboss.naming.context.java.jboss.jdbc.sihdgDS]"
    ]
}
14:21:05,184 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 26) WFLYSRV0010: Deployed "sihdg-3.9.0.0.ear" (runtime-name : "sihdg-3.9.0.0.ear")
14:21:05,191 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0183: Service status report
WFLYCTL0184:    New missing/unsatisfied dependencies:
      service jboss.naming.context.java.jboss.jdbc.sihdgDS (missing) dependents: [service jboss.persistenceunit."sihdg-3.9.0.0.ear/sihdg-api.war#sihdgDS", service jboss.persistenceunit."sihdg-3.9.0.0.ear/sihdg-api.war#sihdgDS".__FIRST_PHASE__]
      service jboss.naming.context.java.module."sihdg-3.9.0.0".sihdg-api.TimerService (missing) dependents: [service jboss.naming.context.java.module."sihdg-3.9.0.0".sihdg-api.env."br.gov.caixa.arquitetura.javaee.core.comum.servico.ControleCacheTask".timerService]
WFLYCTL0448: 30 additional services are down due to their dependencies being missing or failed
14:21:05,204 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
14:21:05,270 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://0.0.0.0:9990/management
14:21:05,270 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0054: Admin console is not enabled
14:21:05,270 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) started (with errors) in 10309ms - Started 303 of 416 services (35 services failed or missing dependencies, 149 services are lazy, passive or on-demand) - Server configuration file in use: standalone.xml
ERROR *** WildFly wrapper process (1) received TERM signal ***
14:22:13,103 INFO  [org.jboss.as.server] (management-handler-thread - 1) WFLYSRV0211: Suspending server with 60000 ms timeout.
14:22:13,105 INFO  [org.jboss.as.server] (Management Triggered Shutdown) WFLYSRV0241: Shutting down in response to management operation 'shutdown'
14:22:13,171 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0019: Host default-host stopping
14:22:13,171 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0008: Undertow HTTP listener default suspending
14:22:13,172 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0007: Undertow HTTP listener default stopped, was bound to 0.0.0.0:8080
14:22:13,177 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0004: Undertow 2.3.23.SP3-redhat-00001 stopping
14:22:13,284 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0208: Stopped subdeployment (runtime-name: sihdg-api.war) in 176ms
14:22:13,288 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0028: Stopped deployment sihdg-3.9.0.0.ear (runtime-name: sihdg-3.9.0.0.ear) in 180ms
14:22:13,290 INFO  [org.jboss.as] (MSC service thread 1-1) WFLYSRV0050: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) stopped in 182ms
-sh-4.2$ oc logs sihdg-jboss8-des-19-6r65j -n sihdg-des --previous | tail -100

