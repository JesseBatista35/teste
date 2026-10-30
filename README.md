
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$ grep -E "CTMSHOST|CTMPERMHOSTS|AGENT_TO_SERVER_PORT|SERVER_TO_AGENT_PORT" ~/ctm/data/CONFIG.dat
CTMSHOST                            crjdeaprlx038
CTMPERMHOSTS                        crjdeaprlx038|crjdeaprlx039
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$ etent hosts crjdeaprlx038 crjdeaprlx039
etent: Command not found.
[ctmagelx@caddeapllx2501 ~]$ getent hosts crjdeaprlx038 crjdeaprlx039
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$ grep -i crjdeaprlx /etc/hosts
#10.116.99.99   crjdeaprlx038
#10.116.99.100   crjdeaprlx039
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$ ag_diag_comm | grep -iE "server host|port|ping"
Control-M/Agent Communication Diagnostic Report
 Server Host Name               : crjdeaprlx038
 Server-to-Agent Port Number    : 7016
 Agent-to-Server Port Number    : 7015
 Unix Ping to Server Platform   : Failed
 Agent Ping to Control-M/Server : Failed
[ctmagelx@caddeapllx2501 ~]$
