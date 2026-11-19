
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$ md5sum /tmp/libSenhasSIIBC.so
9f4b9758ac4f4c75cd9e7cf6826eed38  /tmp/libSenhasSIIBC.so
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$ sudo su -
[sudo] senha para p585600:
Último login: qui nov 19 09:51:06 -03 2026 em pts/1
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]# mkdir -p /apl/sigsj/lib
[root@caddeapllx2854 ~]# \mv -f /tmp/libSenhasSIIBC.so /apl/sigsj/lib/
[root@caddeapllx2854 ~]# chown -R jboss:jboss /apl/sigsj/lib
[root@caddeapllx2854 ~]# chmod 755 /apl/sigsj/lib /apl/sigsj/lib/libSenhasSIIBC.so
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]# ls -la /apl/sigsj/lib/
total 20
drwxr-xr-x 2 jboss jboss    31 nov 19 11:09 .
drwxr-xr-x 3 root  root     17 nov 19 11:09 ..
-rwxr-xr-x 1 jboss jboss 19315 nov 19 11:07 libSenhasSIIBC.so
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]# ldd /apl/sigsj/lib/libSenhasSIIBC.so
        linux-vdso.so.1 (0x00007ffd99cb2000)
        libc.so.6 => /lib64/libc.so.6 (0x00001522e0e00000)
        /lib64/ld-linux-x86-64.so.2 (0x00001522e15b5000)
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]# ls -la /opt/jboss-eap/bin/standalone.conf
-rwxrwxr-x 1 jboss jboss 4033 out 22 12:00 /opt/jboss-eap/bin/standalone.conf
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]# grep -n "library.path\|JAVA_OPTS" /opt/jboss-eap/bin/standalone.conf | tail -20
44:#PRESERVE_JAVA_OPTS=true
49:if [ "x$JAVA_OPTS" = "x" ]; then
50:   JAVA_OPTS="-Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true"
51:   JAVA_OPTS="$JAVA_OPTS -Djboss.modules.system.pkgs=$JBOSS_MODULES_SYSTEM_PKGS -Djava.awt.headless=true"
52:   JAVA_OPTS="$JAVA_OPTS -Djavax.net.ssl.trustStore=$JBOSS_HOME/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit"
53:   JAVA_OPTS="$JAVA_OPTS -Djboss.modules.policy-permissions=true"
54:   JAVA_OPTS="$JAVA_OPTS -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500"
55:   JAVA_OPTS="$JAVA_OPTS -Xbootclasspath/a:${JBOSS_HOME}/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar"
56:   JAVA_OPTS="$JAVA_OPTS -Xbootclasspath/a:${JBOSS_HOME}/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar"
57:   #JAVA_OPTS="$JAVA_OPTS -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager"
58:   JAVA_OPTS="$JAVA_OPTS -Dsun.util.logging.disableCallerCheck=true"
59:   JAVA_OPTS="$JAVA_OPTS -Djava.util.logging.manager=org.jboss.logmanager.LogManager"
60:   JAVA_OPTS="$JAVA_OPTS -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml"
61:   JAVA_OPTS="$JAVA_OPTS -javaagent:/opt/apm_agent/elastic-apm-agent-1.15.0.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm-1.15.0.properties -Delastic.apm.service_name=sigsj-internet -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sigsj-internet-des-esteiras"
63:   echo "JAVA_OPTS already set in environment; overriding default settings with values: $JAVA_OPTS"
67:#JAVA_OPTS="$JAVA_OPTS -agentlib:jdwp=transport=dt_socket,address=8787,server=y,suspend=n"
70:#JAVA_OPTS="$JAVA_OPTS -agentlib:jdwp=transport=dt_shmem,server=y,suspend=n,address=jboss"
73:#JAVA_OPTS="$JAVA_OPTS -Djboss.modules.lockless=false"
76:#JAVA_OPTS="$JAVA_OPTS -Djboss.modules.metrics=true"
83:#JAVA_OPTS="$JAVA_OPTS -Djava.nio.channels.spi.SelectorProvider=sun.nio.ch.PollSelectorProvider"
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]# systemctl list-units --type=service | grep -i jboss
  jboss-eap-standalone.service       loaded active running JBoss EAP Systemctl - STANDALONE
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
