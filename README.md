p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ mkdir -p /tmp/bkp_sirotcon && mv /opt/jboss-eap/standalone/deployments/sirotcon-ejb.jar* /tmp/bkp_sirotcon/
mv: substituir '/tmp/bkp_sirotcon/sirotcon-ejb.jar', desobedecendo o modo 0644 (rw-r--r--)?
mv: não foi possível remover '/opt/jboss-eap/standalone/deployments/sirotcon-ejb.jar.deployed': Permissão negada
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$
[p585600@caddeapllx955 ~]$ sudo su
[sudo] senha para p585600:
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]# mkdir -p /tmp/bkp_sirotcon && mv /opt/jboss-eap/standalone/deployments/sirotcon-ejb.jar* /tmp/bkp_sirotcon/
mv: sobrescrever '/tmp/bkp_sirotcon/sirotcon-ejb.jar'? yes
mv: sobrescrever '/tmp/bkp_sirotcon/sirotcon-ejb.jar.deployed'? yes
mv: não foi possível abrir '/opt/jboss-eap/standalone/deployments/sirotcon-ejb.jar.deployed' para leitura: Arquivo ou diretório inexistente
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#  cd /opt/jboss-eap/standalone/deployments
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]# rm -f sigsj_intranet-ear.ear.failed
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]#  touch sigsj_intranet-ear.ear.dodeploy
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]# sleep 40; ls -l
total 50664
-rwxrwxr-x 1 jboss jboss     8888 jun 23  2021 README.txt
-rwxrw-rw- 1 jboss jboss 51856831 out 28 16:00 sigsj_intranet-ear.ear
-rw-r--r-- 1 jboss jboss       22 out 28 16:00 sigsj_intranet-ear.ear.deployed
-rw-r--r-- 1 jboss jboss       16 out 28 16:14 sirotcon-ejb.jar.undeployed
[root@caddeapllx955 deployments]# grep -nE "WFLYEE0047|WFLYEJB0473|java:global/sigsj_intranet-ear" /logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log | tail -5
1307:   java:global/sigsj_intranet-ear/sirotcon-ejb-2.3.0.1-farm/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon
1312:   java:global/sigsj_intranet-ear/sirotcon-ejb-2.3.0.1-farm/SIROTConBean
1362:2026-10-28 16:15:18,787 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SIROTConBean' na unidade de implementação 'subdeployment "sirotcon-ejb-2.3.0.1-farm.jar" of deployment "sigsj_intranet-ear.ear"' são como segue:
1364:   java:global/sigsj_intranet-ear/sirotcon-ejb-2.3.0.1-farm/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon
1369:   java:global/sigsj_intranet-ear/sirotcon-ejb-2.3.0.1-farm/SIROTConBean
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]#
