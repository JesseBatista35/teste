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






p585600@10.116.97.59's password:
Last login: Fri Nov  6 11:07:08 2026 from 10.122.150.31
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$ attachment save --operation=/deployment=framework-2.0.1-des.jar:read-content --file=/tmp/framework-2.0.1-des.jar
-sh: attachment: command not found
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$ /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=localhost:9999
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] attachment save --operation=/deployment=framework-2.0.1-des.jar:read-content --file=/tmp/framework-2.0.1-des.jar
File saved to /tmp/framework-2.0.1-des.jar

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] exit
[p585600@cbrdeapllx471 ~]$ ls -l /tmp/framework-2.0.1-des.jar
-rw-r--r-- 1 p585600 usucef 63619 Nov  9 09:36 /tmp/framework-2.0.1-des.jar
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$ unzip -l /tmp/framework-2.0.1-des.jar | tail -3
     2656  05-09-2014 12:03   META-INF/maven/br.gov.caixa/framework/pom.xml
---------                     -------
   119226                     79 files
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$ sudo chmod 644 /tmp/framework-2.0.1-des.jar

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$ scp /tmp/framework-2.0.1-des.jar p585600@caddeapllx2864:/tmp/
ssh: Could not resolve hostname caddeapllx2864: Name or service not known
Connection closed
[p585600@cbrdeapllx471 ~]$ scp /tmp/framework-2.0.1-des.jar p585600@10.116.202.54:/tmp/



mais acho que dar pra jogar ele para o bastian o 100 e dpdois pegar la


oejferson disse que a coreção e maudar isso no stadaolne


<extension module="org.jboss.as.modcluster"/>
 
<socket-binding name="ajp" port="${jboss.ajp.port:8009}"/>
 
<socket-binding
    name="modcluster"
    multicast-address="${jboss.modcluster.multicast.address:224.0.1.105}"
    multicast-port="23364"/>



 connec
