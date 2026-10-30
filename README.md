[sudo] senha para p585600:
,Último login: qui out 15 12:33:00 -03 2026
[ctmagelx@caddeapllx2501 ~]$ ,
,: Command not found.
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$ ps -ef | grep -E "p_ctm|ctmag" | grep -v grep
root     1523362       1  0 out15 ?        00:00:14 /opt/ctmage/ctm/exe/p_ctmag
root     1523423       1  0 out15 ?        00:00:23 /opt/ctmage/ctm/exe/p_ctmat
root     1523425 1523423  0 out15 ?        00:00:05 /opt/ctmage/ctm/exe/p_ctmatw -ATW_NAME ATW000
root     1638471 1638425  0 15:00 pts/0    00:00:00 sudo su - ctmagelx
root     1638472 1638471  0 15:00 pts/0    00:00:00 su - ctmagelx
ctmagelx 1638473 1638472  0 15:00 pts/0    00:00:00 -csh
ctmagelx 1638501 1638473  0 15:00 pts/0    00:00:00 ps -ef
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$ grep -E "CTMSHOST|CTMPERMHOSTS|AGENT_TO_SERVER_PORT|SERVER_TO_AGENT_PORT" ~/ctm/data/CONFIG.dat
CTMSHOST                            crjdeaprlx038
CTMPERMHOSTS                        crjdeaprlx038|crjdeaprlx039
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$
[ctmagelx@caddeapllx2501 ~]$ ag_diag_comm

2026-10-30 15:00:29

This procedure runs for about 30 seconds. Please wait

Control-M/Agent Communication Diagnostic Report
-----------------------------------------------

 Agent User Name                : ctmagelx
 Agent Directory                : /opt/ctmage/ctm
 Agent Platform Architecture    : Linux
 Agent Version                  : 9.0.19.200
 Agent Host Name                : caddeapllx2501.agil.nprd.caixa.gov.br
 Logical Agent Name             : caddeapllx2501.agil.nprd.caixa.gov.br
 Listen to Network Interface    : *ANY
 Server Host Name               : crjdeaprlx038
 Authorized Servers Host Names  : crjdeaprlx038 crjdeaprlx039
 Server-to-Agent Port Number    : 7016
 Agent-to-Server Port Number    : 7015
 Server-Agent Protocol Version  : 12 12
 Server-Agent Comm. Protocol    : TCP
 Server-Agent Connection mode   : Transient
 Unix Ping to Server Platform   : Failed
 Agent Ping to Control-M/Server : Failed

 Agent processes status
 ======================
 Agent Listener                 : Running as root (1523362)
 Agent Tracker                  : Running as root (1523423)
 Agent Tracker-Worker           : Running as root (1523425)

[ctmagelx@caddeapllx2501 ~]$
