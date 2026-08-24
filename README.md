
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# ^C
[root@caddeapllx698 p585600]# ps -ef | grep -i CSD2
root       3879   1074  0 16:00 pts/0    00:00:00 grep --color=auto -i CSD2
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# cat /var/run/jboss-as/standaloneCSD2.pid 2>/dev/null
[root@caddeapllx698 p585600]# tail -80 /home/jboss-eap-6.4/CSD2/log/server.log
tail: cannot open ‘/home/jboss-eap-6.4/CSD2/log/server.log’ for reading: No such file or directory
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# /etc/rc.d/init.d/jboss-eap6-CSD6.sh start
Reloading systemd:                                         [  OK  ]
Starting jboss-eap6-CSD6.sh (via systemctl):  Failed to start jboss-eap6-CSD6.sh.service: Unit not found.
                                                           [FAILED]
[root@caddeapllx698 p585600]# ps -ef | grep -i CSD6/etc/rc.d/init.d/jboss-eap6-CSD6.sh start
grep: start: No such file or directory
[root@caddeapllx698 p585600]# ps -ef | grep -i CSD6
root       4146   1074  0 16:01 pts/0    00:00:00 grep --color=auto -i CSD6
[root@caddeapllx698 p585600]#
