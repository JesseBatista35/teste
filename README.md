[root@caddeapllx2695 p585600]# /opt/ctmage/ctm/scripts/start-ag -u ctmagelx -p ALL
Warning: coredumpsize limit required more than 8192 found 0. Please contact your System Administrator.

Starting the agent as 'root' user

Skipping Java validation due to missing files: check_java_ready.sh and/or supported_java.dat
Waiting for pid file of process agj to be created...
Control-M/Agent Agent Java Process started. pid: 1171230

Control-M/Agent Listener started. pid: 1171405

Control-M/Agent Tracker started. pid: 1171471


Control-M/Agent started successfully.
[root@caddeapllx2695 p585600]# ss -lntp | grep 7016
LISTEN 0      300          0.0.0.0:7016       0.0.0.0:*    users:(("java",pid=1171230,fd=233))                                                                                                   
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# su - ctmagelx -c "ag_diag_comm"
This procedure runs for up to 120 seconds. Please wait...

Date: 28-set-2026    Time: 12:59:09

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
  Agent router internal ports          :  AR-AG=7036, AR-AT=24931, AR-UT=30441
 System ping to Server Platform        : Succeeded

