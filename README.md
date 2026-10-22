
Last login: Thu Oct 22 14:33:40 2026 from 10.211.12.44
[p585600@cadsvitrlx100 ~]$ ssh 10.116.201.25
p585600@10.116.201.25's password:
Last login: Wed Oct 21 16:05:52 2026 from 10.122.150.31
[p585600@caddeapllx2557 ~]$ mkdir -p /tmp/bkp_sirotcon && mv /opt/jboss-eap/standalone/deployments/sirotcon-ejb.jar* /tmp/bkp_sirotcon/
mv: não foi possível remover '/opt/jboss-eap/standalone/deployments/sirotcon-ejb.jar': Permissão negada
mv: não foi possível remover '/opt/jboss-eap/standalone/deployments/sirotcon-ejb.jar.deployed': Permissão negada
[p585600@caddeapllx2557 ~]$ sudo su
[sudo] senha para p585600:
[root@caddeapllx2557 p585600]# mkdir -p /tmp/bkp_sirotcon && mv /opt/jboss-eap/standalone/deployments/sirotcon-ejb.jar* /tmp/bkp_sirotcon/
mv: sobrescrever '/tmp/bkp_sirotcon/sirotcon-ejb.jar'? yes
mv: sobrescrever '/tmp/bkp_sirotcon/sirotcon-ejb.jar.deployed'? yes
[root@caddeapllx2557 p585600]#
[root@caddeapllx2557 p585600]#
[root@caddeapllx2557 p585600]#








