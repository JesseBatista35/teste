
[root@caddeapllx2484 verificacao_sicmu2]# kill -15 9952
[root@caddeapllx2484 verificacao_sicmu2]# ps -ef | grep 9952
root      2148     1  0 Ago24 ?        00:00:03 bash -c tail -F /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | while read line; do if echo "$line" | grep -q "ISPN000299"; then echo "Erro detectado em $(date), gerando thread dump..." >> /tmp/dump_monitor.log; kill -3 9952; fi; done
root      6808  5354  0 09:27 pts/1    00:00:00 grep --color=auto 9952
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
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
