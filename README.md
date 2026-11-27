
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]# ls -l /opt/jboss-eap/standalone/configuration/sicmu_jconnector* /opt/jboss/jboss-eap 2>&1
ls: não é possível acessar /opt/jboss/jboss-eap: Arquivo ou diretório não encontrado
-rwxr-xr-x 1 jboss jboss 5049 Set  4 11:44 /opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]# grep -rnE '#\{[A-Za-z_]+\}|__[A-Z_]+__' /opt/jboss-eap/standalone/configuration/ 2>/dev/null | head
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]# grep -rn 'CMU_INTRA_URL' /opt/jboss-eap/standalone/configuration/ 2>/dev/null
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
