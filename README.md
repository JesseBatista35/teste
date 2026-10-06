
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# su - ctmagelx -c "ag_diag_comm"

2026-10-06 16:27:08

This procedure runs up to 120 seconds. Please wait...

Control-M/Agent Communication Diagnostic Report
-----------------------------------------------

 Agent User Name                       : ctmagelx
 Agent Directory                       : /opt/ctmage/ctm
 Agent Platform Architecture           : Linux
 Agent Version                         : 9.0.21.306
 Agent Host Name                       : caddeapllx2695.agil.nprd.caixa.gov.br
 Logical Agent Name                    : caddeapllx2695.agil.nprd.caixa.gov.br
 Listen to Network Interface           : *ANY
 Server Host Name                      : sspdeaprlx0028
 Authorized Servers Host Names         : sspdeaprlx0028
 Server-Agent Protocol Version         : 12
 Server-Agent Comm. Protocol           : TCP
 Server-to-Agent Port Number           : 18008
 Agent-to-Server Port Number           : 18007
 Server-Agent Connection mode          : Transient
 Unix Ping to Server Platform          : Succeeded
 Agent Ping to Control-M/Server        : Succeeded

 Agent processes status
 ======================
 Java services                         :["housekeeping","ssh-courier"] on port 16839
 Agent Listener                        :Running as root (91029)
 Agent Tracker                         :Running as root (91094)
 Agent Tracker-Worker                  :Running as root (91137)

[root@caddeapllx2695 tmp]# ss -lntp | grep 18008
LISTEN 0      128          0.0.0.0:18008      0.0.0.0:*    users:(("p_ctmag",pid=91029,fd=4))
[root@caddeapllx2695 tmp]#
