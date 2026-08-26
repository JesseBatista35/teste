
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]# unzip -p SICMU-web.war WEB-INF/web.xml | grep -i "distributable"
        <distributable />
[root@caddeapllx2484 verificacao_sicmu2]# systemctl status jboss-eap-standalone.service
● jboss-eap-standalone.service - JBoss EAP Systemctl - STANDALONE
   Loaded: loaded (/etc/systemd/system/jboss-eap-standalone.service; enabled; vendor preset: disabled)
   Active: failed (Result: exit-code) since Ter 2026-08-25 17:23:34 -03; 16h ago
  Process: 13879 ExecStart=/opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh start (code=exited, status=1/FAILURE)
 Main PID: 22347 (code=exited, status=0/SUCCESS)

Ago 25 17:23:34 caddeapllx2484.agil.nprd.caixa.gov.br systemd[1]: Starting JBoss EAP Systemctl - STANDALONE...
Ago 25 17:23:34 caddeapllx2484.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[13879]: Starting JBoss EAP: JBoss EAP is already running[FALHOU]
Ago 25 17:23:34 caddeapllx2484.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: control process exited, code=exited status=1
Ago 25 17:23:34 caddeapllx2484.agil.nprd.caixa.gov.br systemd[1]: Failed to start JBoss EAP Systemctl - STANDALONE.
Ago 25 17:23:34 caddeapllx2484.agil.nprd.caixa.gov.br systemd[1]: Unit jboss-eap-standalone.service entered failed state.
Ago 25 17:23:34 caddeapllx2484.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service failed.
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#



[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]# ps -ef | grep java
root      6487  5354  0 09:26 pts/1    00:00:00 grep --color=auto java
jboss     9952  9816  0 Ago14 ?        01:08:50 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update -c standalone-full-ha.xml
[root@caddeapllx2484 verificacao_sicmu2]#
