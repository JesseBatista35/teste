
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# grep -i JBOSS /root/.bash_profile 2>/dev/null
[root@caddeapllx698 p585600]# grep -i JBOSS /root/.bashrc 2>/dev/null
alias logJbossCsd4='tail -f /home/jboss-eap-6.4/standaloneCSD4/log/server.log'
alias logJbossCsd2='tail -f /home/jboss-eap-6.4/standaloneCSD2/log/server.log'
alias logJbossCsdA='tail -f /home/jboss-eap-6.4/standaloneCSDA/log/server.log'
[root@caddeapllx698 p585600]# grep -i JBOSS /etc/profile 2>/dev/null
[root@caddeapllx698 p585600]# grep -rn "JBOSS_HOME" /etc/profile.d/ 2>/dev/null
[root@caddeapllx698 p585600]# grep -rn "JBOSS_HOME=/home/siaoi" / --include="*.conf" --include="*.sh" --include=".bash*" 2>/dev/null | grep -v jboss-eap-6.4/bin
/home/siaoi/scripts/jboss-eap6.sh:28:  JBOSS_HOME=/home/siaoi/jboss-eap-6.4
/etc/rc.d/init.d/jboss-eap6-CSD1.sh:28:  JBOSS_HOME=/home/siaoi/jboss-eap-6.4
/etc/rc.d/init.d/jboss-eap6-teste-CSD2.sh:28:  JBOSS_HOME=/home/siaoi/jboss-eap-6.4
/etc/jboss-as/jboss-as.conf:6:JBOSS_HOME=/home/siaoi/jboss-eap-6.4
[root@caddeapllx698 p585600]#
