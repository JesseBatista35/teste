
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ unzip -l /tmp/bkp_sirotcon/sirotcon-ejb.jar | grep -i "br/gov/caixa/log"
unzip:  cannot find or open /tmp/bkp_sirotcon/sirotcon-ejb.jar, /tmp/bkp_sirotcon/sirotcon-ejb.jar.zip or /tmp/bkp_sirotcon/sirotcon-ejb.jar.ZIP.
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ mkdir -p /tmp/bkp_sirotcon && mv /opt/jboss-eap/standalone/deployments/sirotcon-ejb.jar* /tmp/bkp_sirotcon/
mv: não foi possível remover '/opt/jboss-eap/standalone/deployments/sirotcon-ejb.jar': Permissão negada
mv: não foi possível remover '/opt/jboss-eap/standalone/deployments/sirotcon-ejb.jar.deployed': Permissão negada
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ sudo su
[sudo] senha para p585600:
[root@caddeapllx955 p585600]# ^C
[root@caddeapllx955 p585600]# mkdir -p /tmp/bkp_sirotcon && mv /opt/jboss-eap/standalone/deployments/sirotcon-ejb.jar* /tmp/bkp_sirotcon/
mv: sobrescrever '/tmp/bkp_sirotcon/sirotcon-ejb.jar'? yes
mv: sobrescrever '/tmp/bkp_sirotcon/sirotcon-ejb.jar.deployed'? yes
mv: não foi possível abrir '/opt/jboss-eap/standalone/deployments/sirotcon-ejb.jar.deployed' para leitura: Arquivo ou diretório inexistente
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
