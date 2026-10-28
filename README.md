
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ ps -ef | grep jboss
root     1305915       1  0 16:05 ?        00:00:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0                -bmanagement 0.0.0.0                -Djboss.server.base.dir=/opt/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigsj-intranet -c standalone-full-ha.xml
jboss    1305918 1305915  0 16:05 ?        00:00:00 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigsj-intranet -c standalone-full-ha.xml
jboss    1306084 1305918 10 16:05 ?        00:00:29 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sigsj-intranet/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigsj-intranet -c standalone-full-ha.xml
p585600  1312175 1311379  0 16:10 pts/0    00:00:00 grep --color=auto jboss
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$



FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).

