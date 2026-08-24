
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# ps -ef | grep -i CSD2
root       9628   1074  0 16:12 pts/0    00:00:00 grep --color=auto -i CSD2
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# cat /var/run/jboss-as/standaloneCSD2.pid 2>/dev/null
[root@caddeapllx698 p585600]# tail -80 /var/log/jboss-as/consoleCSD2.log
bash: /home/siaoi/jboss-eap-6.4/bin/standaloneCSD2.sh: No such file or directory
[root@caddeapllx698 p585600]#                              [FAILED]
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# tail -80 /home/jboss-eap-6.4/CSD2/log/server.log 2>/dev/null
[root@caddeapllx698 p585600]# grep "JBAS015874" /var/log/jboss-as/consoleCSD2.log
[root@caddeapllx698 p585600]#
