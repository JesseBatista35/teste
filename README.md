
[root@caddeapllx1945 bin]#
cd /opt/jboss-eap/bin
[root@caddeapllx1945 bin]#
[root@caddeapllx1945 bin]#
[root@caddeapllx1945 bin]# nohup ./standalone.sh -c standalone-full-ha.xml > /opt/jboss-eap/standalone/log/startup.log 2>&1 &
[1] 22574
[root@caddeapllx1945 bin]# tail -100 /opt/jboss-eap/standalone/log/startup.log
nohup: ignorando entrada
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss-eap

  JAVA: java

  JAVA_OPTS:  -verbose:gc -Xloggc:"/opt/jboss-eap/standalone/log/gc.log" -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter="maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000" -Xms1024m -Xmx2048m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-azurepush-2024-acteste.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager

=========================================================================

[1]+  Fim da execução com status 1      nohup ./standalone.sh -c standalone-full-ha.xml > /opt/jboss-eap/standalone/log/startup.log 2>&1
[root@caddeapllx1945 bin]#

