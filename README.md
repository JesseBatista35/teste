
1 seconds - 1189644 is still alive
2 seconds - 1189644 is still alive
3 seconds - 1189644 is still alive
4 seconds - 1189644 is still alive
2026-09-28 13:43:10 Listener process stopped
Killing Control-M/Agent Tracker pid:1189710
2026-09-28 13:43:11 Tracker process stopped
Killing Control-M/Agent Java Process pid:1189478
1 seconds - 1189478 is still alive
2 seconds - 1189478 is still alive
2026-09-28 13:43:14 Java Process process stopped
Control-M/Agent Remote Host is not running
[root@caddeapllx2695 p585600]# cp -p /opt/ctmage/ctm/data/CONFIG.dat /opt/ctmage/ctm/data/CONFIG.dat.bkp.$(date +%Y%m%d%H%M)
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# cd /opt/ctmage/ctm/data
[root@caddeapllx2695 data]# sed -i -E 's/^(CTMSHOST\s+).*/\1sspdeaprlx0028/'      CONFIG.dat
sed -i -E 's/^(CTMPERMHOSTS\s+).*/\1sspdeaprlx0028/'  CONFIG.dat
sed -i -E 's/^(ATCMNDATA\s+).*/\118007/'               CONFIG.dat
sed -i -E 's/^(AGCMNDATA\s+).*/\118008/'               CONFIG.dat
[root@caddeapllx2695 data]#
[root@caddeapllx2695 data]#
[root@caddeapllx2695 data]#
[root@caddeapllx2695 data]# grep -E "CTMSHOST|CTMPERMHOSTS|AGCMNDATA|ATCMNDATA|LOGICAL_AGENT_NAME" CONFIG.dat
CTMSHOST                            sspdeaprlx0028
CTMPERMHOSTS                        sspdeaprlx0028
LOGICAL_AGENT_NAME                  caddeapllx2695.agil.nprd.caixa.gov.br
ATCMNDATA                           18007
AGCMNDATA                           18008
[root@caddeapllx2695 data]#
[root@caddeapllx2695 data]#
[root@caddeapllx2695 data]# sed -i -E 's/^(LOGICAL_AGENT_NAME\s+).*/\1caddeapllx2695/' CONFIG.dat
[root@caddeapllx2695 data]#
[root@caddeapllx2695 data]#
[root@caddeapllx2695 data]# /opt/ctmage/ctm/scripts/start-ag -u ctmagelx -p ALL
Warning: coredumpsize limit required more than 8192 found 0. Please contact your System Administrator.

Starting the agent as 'root' user

Skipping Java validation due to missing files: check_java_ready.sh and/or supported_java.dat
Waiting for pid file of process agj to be created...
Control-M/Agent Agent Java Process started. pid: 1191563

Control-M/Agent Listener started. pid: 1191749

Control-M/Agent Tracker started. pid: 1191816


Control-M/Agent started successfully.
[root@caddeapllx2695 data]# ss -lntp | grep 18008
LISTEN 0      300          0.0.0.0:18008      0.0.0.0:*    users:(("java",pid=1191563,fd=233))                                                                                                   
[root@caddeapllx2695 data]#
[root@caddeapllx2695 data]#
[root@caddeapllx2695 data]# su - ctmagelx -c "ag_diag_comm"
This procedure runs for up to 120 seconds. Please wait...

Date: 28-set-2026    Time: 13:44:16

Control-M/Agent Communication Diagnostic Report
-----------------------------------------------

 Agent User Name                       : ctmagelx
 Agent Directory                       : /opt/ctmage/ctm
 Agent Platform Architecture           : Linux 5.14.0-362.8.1.el9_3.x86_64 #1 SMP PREEMPT_DYNAMIC Tue Oct 3 11:12:36 EDT 2023 x86_64
 Agent Version                         : 9.0.21.200
 Agent Host Name                       : caddeapllx2695.agil.nprd.caixa.gov.br
 Logical Agent Name                    : caddeapllx2695
 Server-Agent Protocol Version         : 12
 Listen to Network Interface           : *ANY
 Server Host Name                      : sspdeaprlx0028
 Authorized Servers Host Names         : sspdeaprlx0028
 Server-Agent Comm. Protocol           : TCP
 Server-to-Agent Port Number           : 18008
 Agent-to-Server Port Number           : 18007
 Server-Agent Connection mode          : Transient (by Java)
  Agent router internal ports          :  AR-AG=7036, AR-AT=30625, AR-UT=19327
 System ping to Server Platform        : Succeeded
 Agent ping to Control-M/Server        : Succeeded

 Agent processes status:
 -----------------------------------------------
 Java Services                         : Running (["ar","tracker","housekeeping","ssh-courier","ag-mngr"]  on port 30143)
 Uploader Service                      : Not Running ()
 Agent Listener                        : Running as root (1191749)
 Agent Tracker                         : Running as root (1191816)
 Agent Tracker-Worker                  : Running as root (1191859) - ATW000

 DNS Translation of Server sspdeaprlx0028
 -----------------------------------------------
 Server Host Address #1                : 10.116.84.154
--- End of Report ---
[root@caddeapllx2695 data]#
