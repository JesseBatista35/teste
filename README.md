
[root@srjdeapllx158 configuration]#
[root@srjdeapllx158 configuration]# ls -la /opt/open/j
java/     java.tar  jboss/
[root@srjdeapllx158 configuration]# ls -la /opt/open/jboss/7.0.0/do
docs/   domain/
[root@srjdeapllx158 configuration]# ls -la /opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081/log/
total 20
drwxr-xr-x 2 spjbodr2 jboss 4096 Mar 21  2023 .
drwxr-xr-x 5 spjbodr2 jboss 4096 Mar 21  2023 ..
-rw-r--r-- 1 spjbodr2 jboss 8434 Mar 21  2023 server.log
[root@srjdeapllx158 configuration]#
[root@srjdeapllx158 configuration]#
[root@srjdeapllx158 configuration]#
[root@srjdeapllx158 configuration]#
[root@srjdeapllx158 configuration]#
[root@srjdeapllx158 configuration]#
[root@srjdeapllx158 configuration]#
[root@srjdeapllx158 configuration]#
[root@srjdeapllx158 configuration]#
[root@srjdeapllx158 configuration]# grep "$(date +%Y-%m-%d)" /opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081/log/server.log | grep -iE "ERROR|WFLYSRV0025|deployed"
[root@srjdeapllx158 configuration]#
[root@srjdeapllx158 configuration]#
[root@srjdeapllx158 configuration]#
