
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]# ps -ef | grep java
jboss    22963 22827  1 13:58 ?        00:00:46 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update -c standalone-full-ha.xml
root     25938 25509  0 14:38 pts/0    00:00:00 grep --color=auto java
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]# systemctl cat jboss-eap 2>/dev/null
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]# systemctl list-units --type=service | grep -i jboss
jboss-eap-standalone.service       loaded active running JBoss EAP Systemctl - STANDALONE
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]# grep -c "system-properties" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
2
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
