
[root@caddeapllx2484 verificacao_sicmu2]# kill 2148
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]# systemctl reset-failed jboss-eap-standalone.service
[root@caddeapllx2484 verificacao_sicmu2]# systemctl start jboss-eap-standalone.service
[root@caddeapllx2484 verificacao_sicmu2]# systemctl status jboss-eap-standalone.service
● jboss-eap-standalone.service - JBoss EAP Systemctl - STANDALONE
   Loaded: loaded (/etc/systemd/system/jboss-eap-standalone.service; enabled; vendor preset: disabled)
   Active: active (running) since Qua 2026-08-26 09:30:01 -03; 1min 50s ago
  Process: 7183 ExecStart=/opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh start (code=exited, status=0/SUCCESS)
 Main PID: 7198 (runuser)
    Tasks: 97
   Memory: 1.3G
   CGroup: /system.slice/jboss-eap-standalone.service
           ├─7198 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b...
           ├─7201 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-e...
           └─7338 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRot...

Ago 26 09:29:54 caddeapllx2484.agil.nprd.caixa.gov.br systemd[1]: Starting JBoss EAP Systemctl - STANDALONE...
Ago 26 09:29:54 caddeapllx2484.agil.nprd.caixa.gov.br runuser[7188]: pam_unix(runuser:session): session opened for user jboss by (uid=0)
Ago 26 09:29:54 caddeapllx2484.agil.nprd.caixa.gov.br runuser[7188]: pam_unix(runuser:session): session closed for user jboss
Ago 26 09:29:54 caddeapllx2484.agil.nprd.caixa.gov.br runuser[7193]: pam_unix(runuser:session): session opened for user jboss by (uid=0)
Ago 26 09:29:54 caddeapllx2484.agil.nprd.caixa.gov.br runuser[7198]: pam_unix(runuser:session): session opened for user jboss by (uid=0)
Ago 26 09:30:01 caddeapllx2484.agil.nprd.caixa.gov.br systemd[1]: Started JBoss EAP Systemctl - STANDALONE.
Ago 26 09:30:01 caddeapllx2484.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[7183]: Starting JBoss EAP: [  OK  ]
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]# ps -ef | grep java | grep -v grep
jboss     7338  7201 20 09:29 ?        00:00:31 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update -c standalone-full-ha.xml
[root@caddeapllx2484 verificacao_sicmu2]#
