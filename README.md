
[root@caddeapllx1441 p585600]# ls -la /etc/init.d/ | grep -i jboss
[root@caddeapllx1441 p585600]#
[root@caddeapllx1441 p585600]#
[root@caddeapllx1441 p585600]#
[root@caddeapllx1441 p585600]# find /opt/jboss-eap -maxdepth 2 -iname "start" -o -iname "stop"
[root@caddeapllx1441 p585600]# systemctl list-units --all | grep -i jboss
  jboss-eap-standalone.service                                                                                   loaded    active   running   JBoss EAP Systemctl - STANDALONE
[root@caddeapllx1441 p585600]#
