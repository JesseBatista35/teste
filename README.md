[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$ grep -E "^(CTMSHOST|CTMPERMHOSTS|ATCMNDATA|AGCMNDATA)" /opt/ctmage/ctm/data/CONFIG.dat
CTMSHOST                            cxextrlx038
CTMPERMHOSTS                        cxextrlx038
ATCMNDATA                           7015
AGCMNDATA                           7016
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$ getent hosts cxextrlx038
10.192.224.54   cxextrlx038
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$ firewall-cmd --state && firewall-cmd --list-all
not running
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$ iptables -S | grep -E "7016|REJECT|DROP"
iptables v1.8.8 (nf_tables): Could not fetch rule set generation id: Permission denied (you must be root)

[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$ sudo su
[sudo] senha para p585600:
[root@caddeapllx2501 p585600]# iptables -S | grep -E "7016|REJECT|DROP"
[root@caddeapllx2501 p585600]#
[root@caddeapllx2501 p585600]#
[root@caddeapllx2501 p585600]# tail -50 /opt/ctmage/ctm/dailylog/daily_ctmag_20261116.log
tail: não foi possível abrir '/opt/ctmage/ctm/dailylog/daily_ctmag_20261116.log' para leitura: Arquivo ou diretório inexistente
[root@caddeapllx2501 p585600]#
[root@caddeapllx2501 p585600]#
[root@caddeapllx2501 p585600]#
[root@caddeapllx2501 p585600]# grep -iE "reject|denied|permit|authoriz" /opt/ctmage/ctm/dailylog/daily_ctmag_2026111*.log | tail -20
[root@caddeapllx2501 p585600]#
[root@caddeapllx2501 p585600]#
[root@caddeapllx2501 p585600]#
[root@caddeapllx2501 p585600]# tcpdump -nn -i any tcp port 7016
bash: tcpdump: comando não encontrado
[root@caddeapllx2501 p585600]#
