
[root@caddeapllx2695 p585600]# grep -E "CTMSHOST|CTMPERMHOSTS|AGCMNDATA|ATCMNDATA|LOGICAL_AGENT_NAME" /opt/ctmage/ctm/data/CONFIG.dat
CTMSHOST                            crjdeaprlx038|sspdeaprlx0028
CTMPERMHOSTS                        crjdeaprlx038|crjdeaprlx039|sspdeaprlx0028
LOGICAL_AGENT_NAME                  caddeapllx2695.agil.nprd.caixa.gov.br
ATCMNDATA                           7015
AGCMNDATA                           7016
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# ps -ef | grep -E "p_ctmag|p_ctmat" | grep -v grep
root     1189644       1  0 13:38 ?        00:00:00 /opt/ctmage/ctm/exe/p_ctmag
root     1189647 1189644  0 13:38 ?        00:00:00 /opt/ctmage/ctm/exe/p_ctmag
root     1189650 1189644  0 13:38 ?        00:00:00 /opt/ctmage/ctm/exe/p_ctmag
root     1189710       1  0 13:38 ?        00:00:00 /opt/ctmage/ctm/exe/p_ctmat
root     1189784 1189710  0 13:38 ?        00:00:00 /opt/ctmage/ctm/exe/p_ctmatw -ATW_NAME ATW000
root     1189840 1189644  0 13:39 ?        00:00:00 /opt/ctmage/ctm/exe/p_ctmag
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# ss -lntp | grep -E "18008|7016"
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# cat /etc/hosts
127.0.0.1   localhost localhost.localdomain localhost4 localhost4.localdomain4
::1         localhost localhost.localdomain localhost6 localhost6.localdomain6

10.116.201.173  caddeapllx2695.agil.nprd.caixa.gov.br caddeapllx2695
# BEGIN ANSIBLE MANAGED BLOCK
#10.116.99.99   crjdeaprlx038
#10.116.99.100   crjdeaprlx039
# END ANSIBLE MANAGED BLOCK

10.116.84.154 sspdeaprlx0028
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# ls -lrt /producao /producao/configuration
/producao:
total 8
drwxr-xr-x 2 ctmagelx controlm    6 jun 25 16:16 carga
drwxr-xr-x 2 ctmagelx controlm    6 jun 25 16:16 suporte
-rwxr-xr-x 1 ctmagelx controlm    0 jun 25 16:16 sample.sh
-rwxr-xr-x 1 ctmagelx controlm  723 set 26 11:28 env_config.sh
-rwxr-xr-x 1 ctmagelx controlm 3507 set 26 11:28 executa-job.sh
drwxr-xr-x 3 ctmagelx controlm   34 set 26 11:28 configuration

/producao/configuration:
total 4
drwxr-xr-x 2 ctmagelx controlm 25 jun 25 16:16 des
-rwxr-xr-x 1 ctmagelx controlm 61 set 26 11:28 custom.sh
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# su - ctmagelx -c "ag_diag_comm"
This procedure runs for up to 120 seconds. Please wait...

Date: 28-set-2026    Time: 13:40:24

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
 Server Host Name                      : crjdeaprlx038|sspdeaprlx0028
 Authorized Servers Host Names         : crjdeaprlx038|crjdeaprlx039|sspdeaprlx0028
 Server-Agent Comm. Protocol           : TCP
 Server-to-Agent Port Number           : 7016
 Agent-to-Server Port Number           : 7015
 Server-Agent Connection mode          : Transient (by Java)
  Agent router internal ports          :  AR-AG=7036, AR-AT=30381, AR-UT=28621
ping: crjdeaprlx038: Nome ou serviço desconhecido
 System ping to Server Platform        : Failed

