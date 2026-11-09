1. No 471, dentro do jboss-cli:

attachment save --operation=/deployment=framework-2.0.1-des.jar:read-content --file=/tmp/framework-2.0.1-des.jar

Depois, saia do CLI (exit) e confira no bash:

ls -l /tmp/framework-2.0.1-des.jar
unzip -l /tmp/framework-2.0.1-des.jar | tail -3
sudo chmod 644 /tmp/framework-2.0.1-des.jar

2. Copie do 471 para o 2864:

scp /tmp/framework-2.0.1-des.jar p585600@caddeapllx2864:/tmp/

Se o scp for bloqueado entre os dois servidores, me avise. Aí pegamos o jar pelo link do Nexus que o Denilson passar.

3. No 2864, primeiro limpe o tail parado (kill %1) e depois:

sudo cp /tmp/framework-2.0.1-des.jar /opt/jboss-eap/standalone/deployments/framework.jar
sudo chown jboss:jboss /opt/jboss-eap/standalone/deployments/framework.jar
sudo rm -f /opt/jboss-eap/standalone/deployments/siemp-ear.ear.failed
sudo touch /opt/jboss-eap/standalone/deployments/siemp-ear.ear.dodeploy
sudo tail -f /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log | grep -E "WFLYSRV0010|WFLYCTL0013|ERROR"

O esperado é WFLYSRV0010 ... "framework.jar" e depois WFLYSRV0010 ... "siemp-ear.ear".

Esse ajuste manual é só para validar. Na próxima execução da esteira ele pode ser sobrescrito. A correção definitiva continua sendo incluir o framework.jar no siemp-java-web-config.

ip da 471
