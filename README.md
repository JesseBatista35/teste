
[root@caddeapllx2695 data]#
[root@caddeapllx2695 data]# su - ctmagelx -c "ag_diag_comm"
This procedure runs for up to 120 seconds. Please wait...

Date: 28-set-2026    Time: 16:03:50

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
 Server Host Name                      : sspdeaprlx0028
 Authorized Servers Host Names         : sspdeaprlx0028
 Server-Agent Comm. Protocol           : TCP
 Server-to-Agent Port Number           : 18008
 Agent-to-Server Port Number           : 18007
 Server-Agent Connection mode          : Transient (by Java)
  Agent router internal ports          :  AR-AG=7036, AR-AT=28011, AR-UT=12849
 System ping to Server Platform        : Succeeded
 Agent ping to Control-M/Server        : Succeeded

 Agent processes status:
 -----------------------------------------------
 Java Services                         : Running (["ar","tracker","housekeeping","ssh-courier","ag-mngr"]  on port 10559)
 Uploader Service                      : Not Running ()
 Agent Listener                        : Running as root (1195205)
 Agent Tracker                         : Running as root (1195286)
 Agent Tracker-Worker                  : Running as root (1195329) - ATW000

 DNS Translation of Server sspdeaprlx0028
 -----------------------------------------------
 Server Host Address #1                : 10.116.84.154
--- End of Report ---
[root@caddeapllx2695 data]#
