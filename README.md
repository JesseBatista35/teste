
-rwxrw-rw- 1 jboss jboss 35776620 nov  6 15:53 siemp-ear.ear
-rw-r--r-- 1 jboss jboss     1053 nov  6 16:05 siemp-ear.ear.failed
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$ sudo cp /tmp/framework-2.0.1-des.jar /opt/jboss-eap/standalone/deployments/framework.jar
sudo chown jboss:jboss /opt/jboss-eap/standalone/deployments/framework.jar
sudo rm -f /opt/jboss-eap/standalone/deployments/siemp-ear.ear.failed
sudo touch /opt/jboss-eap/standalone/deployments/siemp-ear.ear.dodeploy
sudo tail -f /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log | grep -E "WFLYSRV0010|WFLYCTL0013|ERROR"
[sudo] senha para p585600:
cp: não foi possível obter estado de '/tmp/framework-2.0.1-des.jar': Arquivo ou diretório inexistente
chown: não foi possível acessar '/opt/jboss-eap/standalone/deployments/framework.jar': Arquivo ou diretório inexistente
2026-11-06 16:05:47,186 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado (com erros) em 6274ms - Iniciado(s) 363 de serviços 611 (6 serviços falharam ou tinham dependências ausentes, os serviços 361 estão lentos, passivos ou sob demanda)
^Z
[1]+  Parado(SIGTSTP)         sudo tail -f /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log | grep --color=auto -E "WFLYSRV0010|WFLYCTL0013|ERROR"
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$ sudo chown jboss:jboss /opt/jboss-eap/standalone/deployments/framework.jar
chown: não foi possível acessar '/opt/jboss-eap/standalone/deployments/framework.jar': Arquivo ou diretório inexistente
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$ sudo rm -f /opt/jboss-eap/standalone/deployments/siemp-ear.ear.failed
[p585600@caddeapllx2864 ~]$ sudo touch /opt/jboss-eap/standalone/deployments/siemp-ear.ear.dodeploy
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$ sudo tail -f /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log | grep -E "WFLYSRV0010|WFLYCTL0013|ERROR"


