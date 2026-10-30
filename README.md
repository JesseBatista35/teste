[root@caddeapllx2695 p585600]# ps -ef | grep p_ctmag | grep -v grep
root     2315053       1  0 out28 ?        00:00:02 /opt/ctmage/ctm/exe/p_ctmag
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# grep -E "CTMSHOST|CTMPERMHOSTS" /opt/ctmage/ctm/data/CONFIG.dat
CTMSHOST                            sspdeaprlx0028
CTMPERMHOSTS                        sspdeaprlx0028
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# cat /etc/hosts
127.0.0.1   localhost localhost.localdomain localhost4 localhost4.localdomain4
::1         localhost localhost.localdomain localhost6 localhost6.localdomain6

10.116.201.173  caddeapllx2695.agil.nprd.caixa.gov.br caddeapllx2695

# BEGIN ANSIBLE MANAGED BLOCK
10.116.84.154   sspdeaprlx0028
# END ANSIBLE MANAGED BLOCK
[root@caddeapllx2695 p585600]# su - ctmagelx -c "ag_diag_comm" | grep -iE "server host|port|ping"
Control-M/Agent Communication Diagnostic Report
 Server Host Name                      : sspdeaprlx0028
 Server-to-Agent Port Number           : 18008
 Agent-to-Server Port Number           : 18007
 Unix Ping to Server Platform          : Succeeded
 Agent Ping to Control-M/Server        : Succeeded
 Java services                         :["housekeeping","ssh-courier"] on port 18157
[root@caddeapllx2695 p585600]#
