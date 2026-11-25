
[p585600@caddeapllx2884 ~]$ sudo su
[sudo] senha para p585600:
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]# systemctl list-units --type=service --all | grep -iE 'jboss|eap|wildfly'
● httpd-eap.service                      loaded    failed   failed  The Apache HTTP Server
  jboss-eap-standalone.service           loaded    active   running JBoss EAP Systemctl - STANDALONE
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#



