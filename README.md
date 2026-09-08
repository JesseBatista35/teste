
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# ls -l /proc/709283/cmdline | tr '\0' ' '; echo
tr '\0' ' ' < /proc/709283/cmdline; echo
-r--r--r-- 1 jboss jboss 0 set  5 10:14 /proc/709283/cmdline

java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/siarg-interno/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms4096m -Xmx4096m -XX:MetaspaceSize=512M -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/siarg-interno/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siarg-interno -c standalone-full-ha.xml
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# ls -l /proc/709283/fd | grep -i log
l-wx------ 1 jboss jboss 64 set  8 09:52 1 -> /logs/jboss/jboss-eap/standalone/siarg-interno/console-stdout.log
lr-x------ 1 jboss jboss 64 set  8 09:52 105 -> /opt/jboss-eap/modules/system/layers/base/org/jboss/logging/main/jboss-logging-3.4.1.Final-redhat-00001.jar
lr-x------ 1 jboss jboss 64 set  8 09:52 277 -> /opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.18.CP/org/jboss/as/logging/main/wildfly-logging-15.0.37.Final-redhat-00001.jar
lr-x------ 1 jboss jboss 64 set  8 09:52 278 -> /opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.18.CP/org/jboss/log4j/logmanager/main/log4j-jboss-logmanager-1.3.1.Final-redhat-00002.jar
l-wx------ 1 jboss jboss 64 set  8 09:52 3 -> /logs/jboss/jboss-eap/standalone/siarg-interno/gc.log.0.current
lr-x------ 1 jboss jboss 64 set  8 09:52 368 -> /opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.18.CP/org/wildfly/event/logger/main/wildfly-event-logger-15.0.37.Final-redhat-00001.jar
lr-x------ 1 jboss jboss 64 set  8 09:52 379 -> /opt/jboss-eap/modules/system/layers/base/org/jboss/logging/commons/logging/main/commons-logging-jboss-logging-1.0.0.Final-redhat-1.jar
lr-x------ 1 jboss jboss 64 set  8 09:52 380 -> /opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.18.CP/org/apache/logging/log4j/api/main/log4j-api-2.17.1.redhat-00002.jar
lr-x------ 1 jboss jboss 64 set  8 09:52 381 -> /opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.18.CP/org/jboss/logmanager/log4j2/main/log4j2-jboss-logmanager-1.1.2.Final-redhat-00002.jar
lr-x------ 1 jboss jboss 64 set  8 09:52 383 -> /opt/jboss-eap/modules/system/layers/base/org/jboss/logging/jul-to-slf4j-stub/main/jul-to-slf4j-stub-1.0.1.Final-redhat-3.jar
lr-x------ 1 jboss jboss 64 set  8 09:52 385 -> /opt/jboss-eap/modules/system/layers/base/org/slf4j/impl/main/slf4j-jboss-logmanager-1.1.0.Final-redhat-00001.jar
l-wx------ 1 jboss jboss 64 set  8 09:52 429 -> /logs/jboss/jboss-eap/standalone/siarg-interno/audit.log
lr-x------ 1 jboss jboss 64 set  8 09:52 487 -> /opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.18.CP/org/apache/cxf/main/cxf-rt-features-logging-3.5.8.redhat-00001.jar
lr-x------ 1 jboss jboss 64 set  8 09:52 569 -> /opt/jboss-eap/standalone/tmp/vfs/temp-to-be-deleted-6bccf2d3453128f2/tempe88556ec84ac2b59/content-b0bfd7c964c20f17/WEB-INF/lib/commons-logging-1.1.1.jar (deleted)
lr-x------ 1 jboss jboss 64 set  8 09:52 591 -> /opt/jboss-eap/standalone/tmp/vfs/temp-to-be-deleted-6bccf2d3453128f2/tempe88556ec84ac2b59/content-b0bfd7c964c20f17/WEB-INF/lib/log4j-1.2.15.jar (deleted)
lr-x------ 1 jboss jboss 64 set  8 09:52 7 -> /opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar
l-wx------ 1 jboss jboss 64 set  8 09:52 91 -> /logs/jboss/jboss-eap/standalone/siarg-interno/server.log
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
