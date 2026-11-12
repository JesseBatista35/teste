
[root@caddeapllx2557 p585600]#
[root@caddeapllx2557 p585600]#
[root@caddeapllx2557 p585600]#
[root@caddeapllx2557 p585600]# bash /tmp/custom-log4j.sh
[root@caddeapllx2557 p585600]#
[root@caddeapllx2557 p585600]#
[root@caddeapllx2557 p585600]# ls -la /log_jboss/config-log4j/
total 4
drwxr-xr-x 2 jboss jboss  33 nov 12 16:55 .
drwxr-xr-x 4 jboss jboss  48 nov 12 16:55 ..
-rw-r--r-- 1 jboss jboss 869 nov 12 16:55 sigsj_ws_boleto.xml
[root@caddeapllx2557 p585600]#
[root@caddeapllx2557 p585600]#
[root@caddeapllx2557 p585600]# cd /opt/jboss-eap/standalone/deployments/
[root@caddeapllx2557 deployments]# touch boletoService-ear.ear.dodeploy
[root@caddeapllx2557 deployments]#
[root@caddeapllx2557 deployments]#
[root@caddeapllx2557 deployments]# chown jboss:jboss boletoService-ear.ear.dodeploy
chown: não foi possível acessar 'boletoService-ear.ear.dodeploy': Arquivo ou diretório inexistente
[root@caddeapllx2557 deployments]#
[root@caddeapllx2557 deployments]#
[root@caddeapllx2557 deployments]#
[root@caddeapllx2557 deployments]#
