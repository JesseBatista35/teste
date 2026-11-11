p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$ sudo grep -E "CTMSHOST|CTMPERMHOSTS|ATCMNDATA|AGCMNDATA" /opt/ctmage/ctm/data/CONFIG.dat
[sudo] senha para p585600:
CTMSHOST                            crjdeaprlx038
CTMPERMHOSTS                        crjdeaprlx038|crjdeaprlx039
ATCMNDATA                           7015
AGCMNDATA                           7016
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$ sudo ss -lntp | grep 7016
LISTEN 0      128          0.0.0.0:7016       0.0.0.0:*    users:(("p_ctmag",pid=1751485,fd=4))
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$ ls /opt/ctmage/ctm/scripts | grep -E "ag_ping|ag_diag_comm|shut-ag|start-ag"
ag_diag_comm
shut-ag
start-ag
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$ sudo cp /opt/ctmage/ctm/data/CONFIG.dat /opt/ctmage/ctm/data/CONFIG.dat.bkp_20261111
sudo sed -i -E 's/^(CTMSHOST[[:space:]]+).*/\1cxextrlx038/; s/^(CTMPERMHOSTS[[:space:]]+).*/\1cxextrlx038/' /opt/ctmage/ctm/data/CONFIG.dat
sudo grep -E "CTMSHOST|CTMPERMHOSTS" /opt/ctmage/ctm/data/CONFIG.dat
sudo /opt/ctmage/ctm/scripts/shut-ag -u root -p ALL
sudo /opt/ctmage/ctm/scripts/start-ag -u root -p ALL
CTMSHOST                            cxextrlx038
CTMPERMHOSTS                        cxextrlx038
*** CONTROLM environment variable is not defined . ***

*** CONTROLM environment variable is not defined . ***

[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$ sudo su -
Último login: qua nov 11 15:34:36 -03 2026 em pts/1
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]# /opt/ctmage/ctm/scripts/ag_ping
-bash: /opt/ctmage/ctm/scripts/ag_ping: Arquivo ou diretório inexistente
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]# /opt/ctmage/ctm/scripts/ag_diag_comm

2026-11-11 15:34:57

This procedure runs for about 30 seconds. Please wait
/opt/ctmage/ctm/scripts/ag_diag_comm: line 6: /scripts/sharch: No such file or directory
*** Failed to get machine type. ***

[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
