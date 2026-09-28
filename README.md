
 If so, use utility CTMAGCFG to increase 'Timeout for Agent utilities'.

 Agent ping to Control-M/Server        : Failed

 Agent processes status:
 -----------------------------------------------
 Java Services                         : Running (["ar","tracker","housekeeping","ssh-courier","ag-mngr"]  on port 10571)
 Uploader Service                      : Not Running ()
 Agent Listener                        : Running as root (1171405)
 Agent Tracker                         : Running as root (1171471)
 Agent Tracker-Worker                  : Running as root (1171558) - ATW000

 DNS Translation of Server crjdeaprlx038
 -----------------------------------------------
 Server Host Address #1                : 10.116.99.99
--- End of Report ---
[root@caddeapllx2695 p585600]# su -ctmagelx
bash: linha 1: tmagelx: comando não encontrado
[root@caddeapllx2695 p585600]# su - ctmagelx
Último login: seg set 28 12:59:09 -03 2026 em pts/1
[ctmagelx@caddeapllx2695 ~]$
[ctmagelx@caddeapllx2695 ~]$
[ctmagelx@caddeapllx2695 ~]$ whoami; echo $CONTROLM
ctmagelx
/opt/ctmage/ctm
[ctmagelx@caddeapllx2695 ~]$
[ctmagelx@caddeapllx2695 ~]$
[ctmagelx@caddeapllx2695 ~]$
[ctmagelx@caddeapllx2695 ~]$ whoami; echo $CONTROLM
ctmagelx
/opt/ctmage/ctm
[ctmagelx@caddeapllx2695 ~]$
[ctmagelx@caddeapllx2695 ~]$
[ctmagelx@caddeapllx2695 ~]$ grep -E "AGENT_TO_SERVER_PORT|SERVER_TO_AGENT_PORT|CTMSHOST|CTMPERMHOSTS" $CONTROLM/data/CONFIG.dat
CTMSHOST                            sspdeaprlx0028
CTMPERMHOSTS                        crjdeaprlx038|crjdeaprlx039|sspdeaprlx0028
[ctmagelx@caddeapllx2695 ~]$
[ctmagelx@caddeapllx2695 ~]$
[ctmagelx@caddeapllx2695 ~]$
[ctmagelx@caddeapllx2695 ~]$ for ip in 10.116.99.99 10.116.99.100; do for p in 7005 7006 7015 7016 7105 7115; do timeout 3 bash -c "</dev/tcp/$ip/$p" 2>/dev/null && echo "$ip:$p ABERTA"; done; done
10.116.99.99:7005 ABERTA
10.116.99.99:7006 ABERTA


^C
[ctmagelx@caddeapllx2695 ~]$ ag_ping


