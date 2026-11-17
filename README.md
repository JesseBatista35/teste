
[p585600@caddeapllx2871 ~]$ ps -ef | grep java
p585600   134341  134137  0 11:04 pts/1    00:00:00 grep --color=auto java
[p585600@caddeapllx2871 ~]$ systemctl status jboss* --no-pager
× jboss-eap-standalone.service - JBoss EAP Systemctl - STANDALONE
     Loaded: loaded (/etc/systemd/system/jboss-eap-standalone.service; enabled; preset: disabled)
     Active: failed (Result: exit-code) since Tue 2026-11-17 11:10:04 -03; 5min ago
   Duration: 5.795s
    Process: 143912 ExecStart=/opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh start (code=exited, status=0/SUCCESS)
   Main PID: 143922 (code=exited, status=1/FAILURE)
        CPU: 20.615s
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$ journalctl -u <nome-do-serviço> --no-pager | tail -100
-sh: nome-do-serviço: Arquivo ou diretório inexistente
[p585600@caddeapllx2871 ~]$



