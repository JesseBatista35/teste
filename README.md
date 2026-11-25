
p585600@10.116.202.61's password:
Permission denied, please try again.
p585600@10.116.202.61's password:
Last failed login: Wed Nov 25 12:13:52 -03 2026 from 10.122.150.31 on ssh:notty
There was 1 failed login attempt since the last successful login.
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$ systemctl list-units --type=service | grep -i -E "jboss|eap|sigec"
● httpd-eap.service                  loaded failed failed  The Apache HTTP Server
● jboss-eap-standalone.service       loaded failed failed  JBoss EAP Systemctl - STANDALONE
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$ ss -ltnp | grep -E "9990|8080|8443"
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$ ls -ld /opt/*sigec* /opt/jboss* 2>/dev/null
drwxrwxr-x 14 jboss jboss 296 jan 28  2025  /opt/jboss-eap
[p585600@caddeapllx2871 ~]$
