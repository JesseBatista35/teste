
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# ls -la /home/jboss-eap-6.4/bin/standaloneCSD2.sh
-rw-r--r-- 1 root root 3878 Jan 31  2024 /home/jboss-eap-6.4/bin/standaloneCSD2.sh
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# mount | grep "$(df /home/jboss-eap-6.4/bin/standaloneCSD2.sh | tail -1 | awk '{print $1}')"
/dev/mapper/VG_PRINCIPAL-LV_HOME on /home type xfs (rw,relatime,attr2,inode64,noquota)
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# df -h /home/jboss-eap-6.4/bin/standaloneCSD2.sh
Filesystem                        Size  Used Avail Use% Mounted on
/dev/mapper/VG_PRINCIPAL-LV_HOME  104G   54G   51G  52% /home
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# getenforce
Disabled
[root@caddeapllx698 p585600]# ls -Z /home/jboss-eap-6.4/bin/standaloneCSD2.sh
-rw-r--r-- root root ?                                /home/jboss-eap-6.4/bin/standaloneCSD2.sh
[root@caddeapllx698 p585600]#
