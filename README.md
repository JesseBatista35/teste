
[p585600@caddeapllx955 ~]$ ps -ef | grep [j]ava | cut -c1-300
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ sudo ss -ltnp | grep -E ":9990|:8080|:8443"
[sudo] senha para p585600:
Sinto muito, tente novamente.
[sudo] senha para p585600:
Sinto muito, tente novamente.
[sudo] senha para p585600:
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ ls -lt --time-style=long-iso /opt/jboss-eap/standalone/log/
total 24
-rw-r--r-- 1 jboss jboss 20948 2026-10-20 14:10 server.log
-rwxrwxr-x 1 jboss jboss     0 2024-09-30 22:25 server.log.2024-09-30
-rwxrwxr-x 1 jboss jboss     0 2024-09-30 22:25 gc.log.0.current
-rwxrwxr-x 1 jboss jboss     0 2024-09-30 22:25 backupgc.log.current
-rwxrwxr-x 1 jboss jboss     0 2024-09-30 22:16 audit.log
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ sudo tail -60 /opt/jboss-eap/standalone/log/console.log
tail: não foi possível abrir '/opt/jboss-eap/standalone/log/console.log' para leitura: Arquivo ou diretório inexistente
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ sudo tail -80 /opt/jboss-eap/standalone/log/server.log
        javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
        javax.net.ssl.trustStore = /opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks
        javax.net.ssl.trustStorePassword = <redacted>
        jboss.bind.address = 0.0.0.0
        jboss.bind.address.management = 0.0.0.0
        jboss.home.dir = /opt/jboss-eap
        jboss.host.name = caddeapllx955
        jboss.modules.dir = /opt/jboss-eap/modules
        jboss.modules.policy-permissions = true
        jboss.modules.system.pkgs = org.jboss.byteman,org.jboss.logmanager,co.elastic.apm.agent
        jboss.node.name = caddeapllx955
        jboss.qualified.host.name = caddeapllx955.agil.nprd.caixa.gov.br
        jboss.server.base.dir = /opt/jboss-eap/standalone
        jboss.server.config.dir = /opt/jboss-eap/standalone/configuration
        jboss.server.data.dir = /opt/jboss-eap/standalone/data
        jboss.server.deploy.dir = /opt/jboss-eap/standalone/data/content
        jboss.server.log.dir = /logs/jboss/jboss-eap/standalone/sigsj-intranet
        jboss.server.name = caddeapllx955
        jboss.server.persist.config = true
        jboss.server.temp.dir = /opt/jboss-eap/standalone/tmp
        jdk.serialFilter = maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
        line.separator =

        logging.configuration = file:/opt/jboss-eap/standalone/configuration/logging.properties
        module.path = /opt/jboss-eap/modules
        org.jboss.boot.log.file = /logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log
        org.jboss.resolver.warning = true
        org.osgi.framework.bootdelegation = co.elastic.apm.agent.*
        os.arch = amd64
        os.name = Linux
        os.version = 5.14.0-362.8.1.el9_3.x86_64
        path.separator = :
        sun.arch.data.model = 64
        sun.boot.class.path = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/resources.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/rt.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/jsse.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/jce.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/charsets.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/jfr.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/classes:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar
        sun.boot.library.path = /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.472.b08-1.el9.x86_64/jre/lib/amd64
        sun.cpu.endian = little
        sun.cpu.isalist =
        sun.io.unicode.encoding = UnicodeLittle
        sun.java.command = /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigsj-intranet -c standalone-full-ha.xml
        sun.java.launcher = SUN_STANDARD
        sun.jnu.encoding = UTF-8
        sun.management.compiler = HotSpot 64-Bit Tiered Compilers
        sun.os.patch.level = unknown
        sun.util.logging.disableCallerCheck = true
        user.country = BR
        user.dir = /
        user.home = /home/jboss
        user.language = pt
        user.name = jboss
        user.timezone = America/Sao_Paulo
2026-10-20 14:10:21,553 DEBUG [org.jboss.as.config] (MSC service thread 1-3) Argumentos da VM: -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sigsj-intranet/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent-1.15.0.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm-1.15.0.properties -Delastic.apm.service_name=sigsj-intranet -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=https://sigsj-frontend-des.apps.nprd.caixa/ -Delastic.apm.global_labels=deployment=sigsj-intranet-des-esteiras -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties
2026-10-20 14:10:22,204 INFO  [org.wildfly.security] (ServerService Thread Pool -- 10) ELY00001: WildFly Elytron version 1.15.23.Final-redhat-00001
2026-10-20 14:10:22,636 ERROR [org.jboss.as.controller] (Controller Boot Thread)

OPVDX001: erro de validação em standalone-full-ha.xml --------------------------
|
|  452: </subsystem>
|  453: <subsystem xmlns="urn:wildfly:metrics:1.0" security-enabled="false" exposed-subsystems="*" prefix="${wildfly.metrics.prefix:jboss}"/>
|  454: <subsystem xmlns="urn:jboss:domain:modcluster:5.0">
|       ^^^^ Unexpected element '{urn:jboss:domain:modcluster:5.0}subsystem'
|
|  455:     <proxy name="default" advertise-socket="modcluster" listener="ajp">
|  456:         <dynamic-load-provider>
|  457:             <load-metric type="cpu"/>
|
| A mensagem de erro primário subjacente foi:
| > ParseError at [row,col]:[454,9]
| > Message: Unexpected element
| >   '{urn:jboss:domain:modcluster:5.0}subsystem'
|
|-------------------------------------------------------------------------------

2026-10-20 14:10:22,636 ERROR [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0055: Foi vista uma exceção durante a inicialização: org.jboss.as.controller.persistence.ConfigurationPersistenceException: WFLYCTL0085: Falha ao pesquisar a configuração
        at org.jboss.as.controller.persistence.XmlConfigurationPersister.load(XmlConfigurationPersister.java:145)
        at org.jboss.as.server.ServerService.boot(ServerService.java:406)
        at org.jboss.as.controller.AbstractControllerService$1.run(AbstractControllerService.java:447)
        at java.lang.Thread.run(Thread.java:750)

2026-10-20 14:10:22,637 FATAL [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0056: A inicialização do servidor falhou numa maneira irrecuperável: encerrando. Consulte mensagens anteriores para maiores detalhes.
2026-10-20 14:10:22,652 INFO  [org.jboss.as] (MSC service thread 1-3) WFLYSRV0050: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) interrompido em 5ms
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ cat /opt/jboss-eap/bin/init.d/jboss-eap.conf 2>/dev/null || cat /etc/default/jboss-eap.conf 2>/dev/null
# General configuration for the init.d scripts,
# not necessarily for JBoss EAP itself.
# default location: /etc/default/jboss-eap

## Location of JDK
# JAVA_HOME="/usr/lib/jvm/default-java"

## Location of JBoss EAP
# JBOSS_HOME="/opt/jboss-eap"

## The username who should own the process.
# JBOSS_USER=jboss-eap

## The mode JBoss EAP should start, standalone or domain
# JBOSS_MODE=standalone

## Configuration for standalone mode
# JBOSS_CONFIG=standalone.xml

## Configuration for domain mode
# JBOSS_DOMAIN_CONFIG=domain.xml
# JBOSS_HOST_CONFIG=host-master.xml

## The amount of time to wait for startup
# STARTUP_WAIT=60

## The amount of time to wait for shutdown
# SHUTDOWN_WAIT=60

## Location to keep the console log
# JBOSS_CONSOLE_LOG="/var/log/jboss-eap/console.log"

## Additionals args to include in startup
# JBOSS_OPTS="--admin-only -b 127.0.0.1"
[p585600@caddeapllx955 ~]$
