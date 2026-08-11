<img width="1263" height="984" alt="image" src="https://github.com/user-attachments/assets/2beb264c-cc0e-4386-8d80-9db5e12cef54" />





p585600@10.116.200.228's password:
Creating home directory for p585600.
-sh-4.2$
-sh-4.2$
-sh-4.2$ ps -ef | grep jboss
root     17365     1  0 Ago10 ?        00:00:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0                -bmanagement 0.0.0.0                -Djboss.server.base.dir=/opt/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update -c standalone-full-ha.xml
jboss    17368 17365  0 Ago10 ?        00:00:00 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update -c standalone-full-ha.xml
jboss    17504 17368  0 Ago10 ?        00:05:04 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update -c standalone-full-ha.xml
p585600  18685 18637  0 10:01 pts/0    00:00:00 grep --color=auto jboss
-sh-4.2$


me ajuda a responder ele e pegar o log e enviar



