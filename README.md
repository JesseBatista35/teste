
[root@caddeapllx2695 p585600]# systemctl status controlm_agent.service --no-pager | head -15
● controlm_agent.service - Control-M Agent
     Loaded: loaded (/etc/systemd/system/controlm_agent.service; enabled; preset: disabled)
     Active: active (exited) since Mon 2026-09-28 12:56:25 -03; 51s ago
    Process: 1170264 ExecStart=/opt/ctmage/ctm/scripts/rc.agent_user start (code=exited, status=0/SUCCESS)
        CPU: 3ms

set 28 12:56:25 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1]: Starting Control-M Agent...
set 28 12:56:25 caddeapllx2695.agil.nprd.caixa.gov.br rc.agent_user[1170264]: Control-M/Agent (account ctmagelx) status is set to 'STOPPED'. Control-M/Agent will not start.
set 28 12:56:25 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1]: Started Control-M Agent.
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# ps -ef | grep -E "p_ctmag|p_ctmat" | grep -v grep
[root@caddeapllx2695 p585600]# ss -lntp | grep 7016
[root@caddeapllx2695 p585600]# su - ctmagelx -c "ag_diag_comm"
This procedure runs for up to 120 seconds. Please wait...

Date: 28-set-2026    Time: 12:57:34

Control-M/Agent Communication Diagnostic Report
-----------------------------------------------

 Agent User Name                       : ctmagelx
 Agent Directory                       : /opt/ctmage/ctm
 Agent Platform Architecture           : Linux 5.14.0-362.8.1.el9_3.x86_64 #1 SMP PREEMPT_DYNAMIC Tue Oct 3 11:12:36 EDT 2023 x86_64
 Agent Version                         : 9.0.21.200
 Agent Host Name                       : caddeapllx2695.agil.nprd.caixa.gov.br
 Logical Agent Name                    : caddeapllx2695.agil.nprd.caixa.gov.br
 Server-Agent Protocol Version         : 12
 Listen to Network Interface           : *ANY
 Server Host Name                      : crjdeaprlx038
 Authorized Servers Host Names         : crjdeaprlx038|crjdeaprlx039
 Server-Agent Comm. Protocol           : TCP
 Server-to-Agent Port Number           : 7016
 Agent-to-Server Port Number           : 7015
 Server-Agent Connection mode          : Transient (by Java)
  Agent router internal ports          :  AR-AG=7036, AR-AT=16559, AR-UT=34091
 System ping to Server Platform        : Succeeded

