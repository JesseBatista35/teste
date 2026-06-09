-sh-4.2$ sudo rm -f /opt/jboss/jboss-eap/hc/deployments/SIOSP.ear.deployed
[sudo] senha para p585600:
-sh-4.2$ sudo rm -f /opt/jboss/jboss-eap/hc/deployments/siosp-1.0.0.59-1.0.0.59-b370.ear
-sh-4.2$ ls -la /opt/jboss/jboss-eap/hc/deployments.d/
ls: não é possível acessar /opt/jboss/jboss-eap/hc/deployments.d/: Arquivo ou diretório não encontrado
-sh-4.2$ find /opt/jboss -name "*siosp*.ear" -o -name "*SIOSP*.ear"
find: ‘/opt/jboss/jboss-eap/domain/tmp/auth’: Permissão negada
find: ‘/opt/jboss/jboss-eap/standalone/tmp/auth’: Permissão negada
find: ‘/opt/jboss/jboss-eap/hc/tmp/auth’: Permissão negada
-sh-4.2$ sudo su
[root@sbrdeapllx099 p585600]# find /opt/jboss -name "*siosp*.ear" -o -name "*SIOSP*.ear"
[root@sbrdeapllx099 p585600]# systemctl restart jboss-eap-hc
Failed to restart jboss-eap-hc.service: Unit not found.
[root@sbrdeapllx099 p585600]#

