root@caddeapllx2484 verificacao_sicmu2]#
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
