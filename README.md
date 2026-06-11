
[root@caddeapllx2540 p585600]#
[root@caddeapllx2540 p585600]# systemctl status jboss-eap-standalone
● jboss-eap-standalone.service - JBoss EAP Systemctl - STANDALONE
   Loaded: loaded (/etc/systemd/system/jboss-eap-standalone.service; enabled; vendor preset: disabled)
   Active: failed (Result: exit-code) since Qui 2026-06-11 17:27:20 -03; 8min ago
  Process: 23066 ExecStop=/opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh stop (code=exited, status=0/SUCCESS)
  Process: 27745 ExecStart=/opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh start (code=exited, status=0/SUCCESS)
 Main PID: 27760 (code=exited, status=1/FAILURE)

Jun 11 17:27:12 caddeapllx2540.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[27745]: at org.jboss.logmanager.handlers.FileHandler.setFileName(FileHandler.java:189)
Jun 11 17:27:12 caddeapllx2540.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[27745]: at org.jboss.logmanager.handlers.FileHandler.<init>(FileHandler.java:119)
Jun 11 17:27:12 caddeapllx2540.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[27745]: at org.jboss.logmanager.handlers.PeriodicRotatingFileHandler.<init>(PeriodicRotatingFi...ava:77)
Jun 11 17:27:12 caddeapllx2540.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[27745]: ... 33 more
Jun 11 17:27:18 caddeapllx2540.agil.nprd.caixa.gov.br systemd[1]: Started JBoss EAP Systemctl - STANDALONE.
Jun 11 17:27:18 caddeapllx2540.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[27745]: [  OK  ]
Jun 11 17:27:20 caddeapllx2540.agil.nprd.caixa.gov.br runuser[27760]: pam_unix(runuser:session): session closed for user jboss
Jun 11 17:27:20 caddeapllx2540.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: main process exited, code=exited, status=1/FAILURE
Jun 11 17:27:20 caddeapllx2540.agil.nprd.caixa.gov.br systemd[1]: Unit jboss-eap-standalone.service entered failed state.
Jun 11 17:27:20 caddeapllx2540.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service failed.
Hint: Some lines were ellipsized, use -l to show in full.
[root@caddeapllx2540 p585600]#
[root@caddeapllx2540 p585600]#
[root@caddeapllx2540 p585600]#
[root@caddeapllx2540 p585600]# ps aux Z grep jboss | grep jaca
error: process ID list syntax error

Usage:
 ps [options]

 Try 'ps --help <simple|list|output|threads|misc|all>'
  or 'ps --help <s|l|o|t|m|a>'
 for additional help text.

For more details see ps(1).
[root@caddeapllx2540 p585600]# ps aux Z grep jboss | grep java
error: process ID list syntax error

Usage:
 ps [options]

 Try 'ps --help <simple|list|output|threads|misc|all>'
  or 'ps --help <s|l|o|t|m|a>'
 for additional help text.

For more details see ps(1).
[root@caddeapllx2540 p585600]# ps aux | grep jboss | grep java
root     21999  0.2 23.6 3171384 919324 ?      Sl   12:44   0:51 java -D[Standalone] -server -verbose:gc -Xloggc:/opt/jboss-eap/standalone/log/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1303m -Xmx1303m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Dorg.jboss.boot.log.file=/opt/jboss-eap/standalone/log/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone
[root@caddeapllx2540 p585600]# sudo kill -9 21999
[root@caddeapllx2540 p585600]# sudo systemctl start jboss-eap-standalone
[root@caddeapllx2540 p585600]# sleep 15 && sudo systemctl status jboss-eap-standalone
● jboss-eap-standalone.service - JBoss EAP Systemctl - STANDALONE
   Loaded: loaded (/etc/systemd/system/jboss-eap-standalone.service; enabled; vendor preset: disabled)
   Active: active (running) since Qui 2026-06-11 17:37:04 -03; 25s ago
  Process: 23066 ExecStop=/opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh stop (code=exited, status=0/SUCCESS)
  Process: 28604 ExecStart=/opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh start (code=exited, status=0/SUCCESS)
 Main PID: 28619 (runuser)
    Tasks: 219
   Memory: 1.3G
   CGroup: /system.slice/jboss-eap-standalone.service
           ├─28619 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh             ...
           ├─28622 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jb...
           └─28758 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFi...

Jun 11 17:36:58 caddeapllx2540.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[28604]: at java.io.FileOutputStream.open(FileOutputStream.java:270)
Jun 11 17:36:58 caddeapllx2540.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[28604]: at java.io.FileOutputStream.<init>(FileOutputStream.java:213)
Jun 11 17:36:58 caddeapllx2540.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[28604]: at org.jboss.logmanager.handlers.FileHandler.setFile(FileHandler.java:151)
Jun 11 17:36:58 caddeapllx2540.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[28604]: at org.jboss.logmanager.handlers.PeriodicRotatingFileHandler.setFile(PeriodicRotatingF...va:109)
Jun 11 17:36:58 caddeapllx2540.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[28604]: at org.jboss.logmanager.handlers.FileHandler.setFileName(FileHandler.java:189)
Jun 11 17:36:58 caddeapllx2540.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[28604]: at org.jboss.logmanager.handlers.FileHandler.<init>(FileHandler.java:119)
Jun 11 17:36:58 caddeapllx2540.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[28604]: at org.jboss.logmanager.handlers.PeriodicRotatingFileHandler.<init>(PeriodicRotatingFi...ava:77)
Jun 11 17:36:58 caddeapllx2540.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[28604]: ... 33 more
Jun 11 17:37:04 caddeapllx2540.agil.nprd.caixa.gov.br systemd[1]: Started JBoss EAP Systemctl - STANDALONE.
Jun 11 17:37:04 caddeapllx2540.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[28604]: [  OK  ]
Hint: Some lines were ellipsized, use -l to show in full.
[root@caddeapllx2540 p585600]#
