p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$ sudo grep "03/Nov/2026" /logs/apache2/SIFEC-INTRANET/sifec1.des.caixa-access.log > /tmp/migracaosifec-access.log
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$ sudo tail -500 /logs/apache2/SIFEC-INTRANET/sifec1.des.caixa-error.log > /tmp/migracaosifec-error.log
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$ wc -l /tmp/migracaosifec-*.log
  1013 /tmp/migracaosifec-access.log
     7 /tmp/migracaosifec-error.log
  1020 total
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$ sudo grep -nE -A25 "ERROR|Caused by" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -viE "SECRET|PASSWORD|SENHA|API_KEY|TOKEN|CLIENT_ID|Set-Cookie|Cookie=" > /tmp/migracaosifec-jboss-erros.log
grep: /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log: No such file or directory
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
