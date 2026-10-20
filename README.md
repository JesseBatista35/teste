
[p585600@caddeapllx2557 ~]$
[p585600@caddeapllx2557 ~]$
[p585600@caddeapllx2557 ~]$
[p585600@caddeapllx2557 ~]$
[p585600@caddeapllx2557 ~]$ grep -nE "ERROR|WFLYCTL0013|WFLYCTL0412|Caused by" /opt/jboss-eap/standalone/log/server.log | tail -60
11:     co.elastic.apm.agent.shaded.slf4j.simpleLogger.log.co.elastic.apm = ERROR
106:2026-10-20 09:40:26,795 ERROR [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0362: As funcionalidades exigidas pelo recurso '/subsystem=modcluster/proxy=default' não estão disponíveis:
121:    co.elastic.apm.agent.shaded.slf4j.simpleLogger.log.co.elastic.apm = ERROR
[p585600@caddeapllx2557 ~]$
[p585600@caddeapllx2557 ~]$
[p585600@caddeapllx2557 ~]$
[p585600@caddeapllx2557 ~]$






[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ cat /opt/jboss-eap/version.txt
Red Hat JBoss Enterprise Application Platform - Version 7.4.18.GA
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ sudo systemctl status jboss* --no-pager -l | head -30
sudo journalctl -u 'jboss*' --since "11:20" --no-pager | tail -40
sudo tail -80 /opt/jboss-eap/standalone/log/server.log
grep -nE "Xms|Xmx|Metaspace|#\{" /opt/jboss-eap/bin/standalone.conf

Presumimos que você recebeu as instruções de sempre do administrador
de sistema local. Basicamente, resume-se a estas três coisas:

    #1) Respeite a privacidade dos outros.
    #2) Pense antes de digitar.
    #3) Com grandes poderes vêm grandes responsabilidades.

[sudo] senha para p585600:
out 20 11:26:04 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[26437]: Stopping JBoss EAP:
out 20 11:26:04 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[26439]: /opt/jboss-eap/bin/common_start.sh: linha 85: success: comando não encontrado
out 20 11:26:04 caddeapllx955.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Deactivated successfully.
out 20 11:26:04 caddeapllx955.agil.nprd.caixa.gov.br systemd[1]: Started JBoss EAP Systemctl - STANDALONE.
out 20 11:26:16 caddeapllx955.agil.nprd.caixa.gov.br systemd[1]: Starting JBoss EAP Systemctl - STANDALONE...
out 20 11:26:16 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[27151]: /opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh: linha 4: /etc/init.d/functions: Arquivo ou diretório inexistente
out 20 11:26:16 caddeapllx955.agil.nprd.caixa.gov.br runuser[27153]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
out 20 11:26:16 caddeapllx955.agil.nprd.caixa.gov.br runuser[27153]: pam_unix(runuser:session): session closed for user jboss
out 20 11:26:16 caddeapllx955.agil.nprd.caixa.gov.br runuser[27157]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
out 20 11:26:16 caddeapllx955.agil.nprd.caixa.gov.br runuser[27157]: pam_unix(runuser:session): session closed for user jboss
out 20 11:26:16 caddeapllx955.agil.nprd.caixa.gov.br runuser[27161]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
out 20 11:26:16 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[27151]: Starting JBoss EAP:
out 20 11:26:16 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[27362]: Invalid maximum heap size: -Xmx
out 20 11:26:16 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[27362]: Error: Could not create the Java Virtual Machine.
out 20 11:26:16 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[27362]: Error: A fatal exception has occurred. Program will exit.
out 20 11:26:16 caddeapllx955.agil.nprd.caixa.gov.br runuser[27161]: pam_unix(runuser:session): session closed for user jboss
out 20 11:26:22 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[27390]: /opt/jboss-eap/bin/common_start.sh: linha 58: success: comando não encontrado
out 20 11:26:22 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[27391]: /opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh: linha 4: /etc/init.d/functions: Arquivo ou diretório inexistente
out 20 11:26:22 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[27391]: Stopping JBoss EAP:
out 20 11:26:22 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[27393]: /opt/jboss-eap/bin/common_start.sh: linha 85: success: comando não encontrado
out 20 11:26:22 caddeapllx955.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Deactivated successfully.
out 20 11:26:22 caddeapllx955.agil.nprd.caixa.gov.br systemd[1]: Started JBoss EAP Systemctl - STANDALONE.
out 20 11:29:47 caddeapllx955.agil.nprd.caixa.gov.br systemd[1]: Starting JBoss EAP Systemctl - STANDALONE...
out 20 11:29:47 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[27828]: /opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh: linha 4: /etc/init.d/functions: Arquivo ou diretório inexistente
out 20 11:29:47 caddeapllx955.agil.nprd.caixa.gov.br runuser[27830]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
out 20 11:29:47 caddeapllx955.agil.nprd.caixa.gov.br runuser[27830]: pam_unix(runuser:session): session closed for user jboss
out 20 11:29:47 caddeapllx955.agil.nprd.caixa.gov.br runuser[27834]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
out 20 11:29:47 caddeapllx955.agil.nprd.caixa.gov.br runuser[27834]: pam_unix(runuser:session): session closed for user jboss
out 20 11:29:47 caddeapllx955.agil.nprd.caixa.gov.br runuser[27838]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
out 20 11:29:47 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[27828]: Starting JBoss EAP:
out 20 11:29:47 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[28039]: Invalid maximum heap size: -Xmx
out 20 11:29:47 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[28039]: Error: Could not create the Java Virtual Machine.
out 20 11:29:47 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[28039]: Error: A fatal exception has occurred. Program will exit.
out 20 11:29:47 caddeapllx955.agil.nprd.caixa.gov.br runuser[27838]: pam_unix(runuser:session): session closed for user jboss
out 20 11:29:53 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[28053]: /opt/jboss-eap/bin/common_start.sh: linha 58: success: comando não encontrado
out 20 11:29:53 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[28054]: /opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh: linha 4: /etc/init.d/functions: Arquivo ou diretório inexistente
out 20 11:29:53 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[28054]: Stopping JBoss EAP:
out 20 11:29:53 caddeapllx955.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[28056]: /opt/jboss-eap/bin/common_start.sh: linha 85: success: comando não encontrado
out 20 11:29:53 caddeapllx955.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Deactivated successfully.
out 20 11:29:53 caddeapllx955.agil.nprd.caixa.gov.br systemd[1]: Started JBoss EAP Systemctl - STANDALONE.
50:   JAVA_OPTS="-Xms1024m -Xmx 2048m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true"
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
