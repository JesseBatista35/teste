
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# cat /etc/rc.d/init.d/jboss-eap6-CSD2.sh | grep -i "JBOSS_HOME\|standaloneCSD2\|bin/standalone"
if [ -z "$JBOSS_HOME" ]; then
  JBOSS_HOME=/home/jboss-eap-6.4
export JBOSS_HOME
  JBOSS_PIDFILE=/var/run/jboss-as/standaloneCSD2.pid
  JBOSS_CONFIG=standaloneCSD2.xml
JBOSS_SCRIPT=$JBOSS_HOME/bin/standaloneCSD2.sh
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# cat /etc/rc.d/init.d/jboss-eap6-CSD6.sh | grep -i "JBOSS_HOME\|standaloneCSD6\|bin/standalone"
if [ -z "$JBOSS_HOME" ]; then
  JBOSS_HOME=/home/jboss-eap-6.4
export JBOSS_HOME
  JBOSS_PIDFILE=/var/run/jboss-as/standaloneCSD6.pid
  JBOSS_CONFIG=standaloneCSD6.xml
JBOSS_SCRIPT=$JBOSS_HOME/bin/standaloneCSD6.sh
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# ls -la /etc/rc.d/init.d/ | grep -i CSD1
-rwxrwxrwx   1 root root   4328 Aug 23  2023 jboss-eap6-CSD1.sh
-rw-r--r--   1 root root  16384 Jan 30  2024 .jboss-eap6-CSD1.sh.swp
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# find / -iname "*jboss-eap6-CSD1*" 2>/dev/null
/run/systemd/generator.late/jboss-eap6-CSD1.service
/run/systemd/generator.late/runlevel5.target.wants/jboss-eap6-CSD1.service
/run/systemd/generator.late/runlevel4.target.wants/jboss-eap6-CSD1.service
/run/systemd/generator.late/runlevel3.target.wants/jboss-eap6-CSD1.service
/run/systemd/generator.late/runlevel2.target.wants/jboss-eap6-CSD1.service
/sys/fs/cgroup/blkio/system.slice/jboss-eap6-CSD1.service
/sys/fs/cgroup/memory/system.slice/jboss-eap6-CSD1.service
/sys/fs/cgroup/devices/system.slice/jboss-eap6-CSD1.service
/sys/fs/cgroup/cpu,cpuacct/system.slice/jboss-eap6-CSD1.service
/sys/fs/cgroup/pids/system.slice/jboss-eap6-CSD1.service
/sys/fs/cgroup/systemd/system.slice/jboss-eap6-CSD1.service
/etc/rc.d/init.d/jboss-eap6-CSD1.sh
/etc/rc.d/init.d/.jboss-eap6-CSD1.sh.swp
/etc/rc.d/rc2.d/S80jboss-eap6-CSD1.sh
/etc/rc.d/rc3.d/S80jboss-eap6-CSD1.sh
/etc/rc.d/rc4.d/S80jboss-eap6-CSD1.sh
/etc/rc.d/rc5.d/S80jboss-eap6-CSD1.sh
[root@caddeapllx698 p585600]#
