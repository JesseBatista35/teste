
[root@caddeapllx698 p585600]# grep -i "JBOSS_USER" /etc/jboss-as/jboss-as.conf
JBOSS_USER=root
[root@caddeapllx698 p585600]# echo $JBOSS_USER

[root@caddeapllx698 p585600]# cat /home/siaoi/.bash_profile 2>/dev/null | grep -i JBOSS
[root@caddeapllx698 p585600]# cat /home/siaoi/.bashrc 2>/dev/null | grep -i JBOSS
[root@caddeapllx698 p585600]# cat /etc/profile.d/*.sh 2>/dev/null | grep -i JBOSS
[root@caddeapllx698 p585600]#
