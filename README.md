[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# mkdir -p /var/run/jboss-as /var/log/jboss-as
[root@caddeapllx698 p585600]# cat /dev/null > /var/log/jboss-as/consoleCSD2.log
[root@caddeapllx698 p585600]# LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/var/run/jboss-as/standaloneCSD2.pid \
>   /home/jboss-eap-6.4/bin/standaloneCSD2.sh -c standaloneCSD2.xml \
>   > /var/log/jboss-as/consoleCSD2.log 2>&1 &
[1] 4690
[1]+  Exit 126                LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/var/run/jboss-as/standaloneCSD2.pid /home/jboss-eap-6.4/bin/standaloneCSD2.sh -c standaloneCSD2.xml > /var/log/jboss-as/consoleCSD2.log 2>&1
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# sleep 15
[root@caddeapllx698 p585600]# tail -50 /var/log/jboss-as/consoleCSD2.log
bash: /home/jboss-eap-6.4/bin/standaloneCSD2.sh: Permission denied
[root@caddeapllx698 p585600]# ps -ef | grep -i CSD2# CSD2
grep: CSD2: No such file or directory
[root@caddeapllx698 p585600]# mkdir -p /var/run/jboss-as /var/log/jboss-as
[root@caddeapllx698 p585600]# cat /dev/null > /var/log/jboss-as/consoleCSD2.log
[root@caddeapllx698 p585600]# LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/var/run/jboss-as/standaloneCSD2.pid \
>   /home/jboss-eap-6.4/bin/standaloneCSD2.sh -c standaloneCSD2.xml \
>   > /var/log/jboss-as/consoleCSD2.log 2>&1 &
[1] 4930
[1]+  Exit 126                LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/var/run/jboss-as/standaloneCSD2.pid /home/jboss-eap-6.4/bin/standaloneCSD2.sh -c standaloneCSD2.xml > /var/log/jboss-as/consoleCSD2.log 2>&1
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# tail -50 /var/log/jboss-as/consoleCSD2.log
bash: /home/jboss-eap-6.4/bin/standaloneCSD2.sh: Permission denied
[root@caddeapllx698 p585600]# ps -ef | grep -i CSD2
root       5014   1074  0 16:04 pts/0    00:00:00 grep --color=auto -i CSD2
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
