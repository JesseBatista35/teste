
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# ls -la /home/jboss-eap-6.4/bin/standaloneCSD1.sh 2>/dev/null
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# ls -la /home/jboss-eap-6.4/bin/standaloneCSD6.sh
ls: cannot access /home/jboss-eap-6.4/bin/standaloneCSD6.sh: No such file or directory
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# chmod 755 /home/jboss-eap-6.4/bin/standaloneCSD2.sh
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# ls -la /home/jboss-eap-6.4/bin/standaloneCSD2.sh
-rwxr-xr-x 1 root root 3878 Jan 31  2024 /home/jboss-eap-6.4/bin/standaloneCSD2.sh
[root@caddeapllx698 p585600]# chmod 755 /home/jboss-eap-6.4/bin/standaloneCSD6.sh
chmod: cannot access ‘/home/jboss-eap-6.4/bin/standaloneCSD6.sh’: No such file or directory
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# mkdir -p /var/run/jboss-as /var/log/jboss-as
[root@caddeapllx698 p585600]# cat /dev/null > /var/log/jboss-as/consoleCSD2.log
[root@caddeapllx698 p585600]# LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/var/run/jboss-as/standaloneCSD2.pid \
>   /home/jboss-eap-6.4/bin/standaloneCSD2.sh -c standaloneCSD2.xml \
>   > /var/log/jboss-as/consoleCSD2.log 2>&1 &
[1] 8987
[root@caddeapllx698 p585600]#
[1]+  Exit 1                  LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/var/run/jboss-as/standaloneCSD2.pid /home/jboss-eap-6.4/bin/standaloneCSD2.sh -c standaloneCSD2.xml > /var/log/jboss-as/consoleCSD2.log 2>&1
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# sleep 15
[root@caddeapllx698 p585600]# tail -50 /var/log/jboss-as/consoleCSD2.log
Usage: /home/jboss-eap-6.4/bin/standaloneCSD2.sh {start|stop|status|restart|reload}
[root@caddeapllx698 p585600]# ps -ef | grep -i CSD2
root       9127   1074  0 16:09 pts/0    00:00:00 grep --color=auto -i CSD2
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
