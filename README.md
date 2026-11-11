[root@caddeapllx2501 ~]# grep -E "CTMSHOST|CTMPERMHOSTS" /opt/ctmage/ctm/data/CONFIG.dat
CTMSHOST                            crjdeaprlx038
CTMPERMHOSTS                        crjdeaprlx038|crjdeaprlx039
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]# grep -iE "cxextrlx038|crjdeaprlx" /etc/hosts
#10.116.99.99   crjdeaprlx038
#10.116.99.100   crjdeaprlx039
10.192.224.54   cxextrlx038
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]# systemctl status controlm_agent.service --no-pager | head -5
● controlm_agent.service - Control-M Agent
     Loaded: loaded (/etc/systemd/system/controlm_agent.service; enabled; preset: disabled)
     Active: active (running) since Wed 2026-11-11 15:46:56 -03; 1h 17min ago
    Process: 2188004 ExecStart=/opt/ctmage/ctm/scripts/rc.agent_user start (code=exited, status=0/SUCCESS)
      Tasks: 3 (limit: 23083)
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]# systemctl status controlm_agent.service --no-pager | head -5
● controlm_agent.service - Control-M Agent
     Loaded: loaded (/etc/systemd/system/controlm_agent.service; enabled; preset: disabled)
     Active: active (running) since Wed 2026-11-11 15:46:56 -03; 1h 17min ago
    Process: 2188004 ExecStart=/opt/ctmage/ctm/scripts/rc.agent_user start (code=exited, status=0/SUCCESS)
      Tasks: 3 (limit: 23083)
[root@caddeapllx2501 ~]# export CONTROLM=/opt/ctmage/ctm LD_LIBRARY_PATH=/opt/ctmage/ctm/exe PATH=/opt/ctmage/ctm/scripts:/opt/ctmage/ctm/exe:$PATH
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]#
[root@caddeapllx2501 ~]# ag_ping

