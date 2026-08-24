O que você deseja?*:	Suporte ao ambiente de aplicação Multiplataformas
***Atenção***:	Essa opção deve ser utilizada para obter suporte para ambientes e produtos que não são relacionados às Esteiras DevOps.
.:	Ex: Aplicações Jboss legado, Aplicações Windows legado, Jenkins departamental, Git Lab Departamental, Nexus Departamental, Sonar Departamental.
Qual o ambiente*:	DES
Qual é o site?*:	Negocial-Brasília
Qual o nome do sistema?*:	SIAOI
Selecione a sua Comunidade*:	Habitação
Formas de contato*:	C095197 - 61 98407-7037
Descrição da necessidade*:	Informo que os JBOSS de desenvolvimento do SIAOI ainda estão fora.
Solicitamos analise e disponibilização dos links:

https://siaoi.des.caixa/csd1/#/login
https://siaoi.des.caixa/csd2/#/login
https://siaoi.des.caixa/csd6/#/login


-sh-4.2$
-sh-4.2$
-sh-4.2$ ps -ef | grep jboss
root     113957      1  0 Jul22 ?        00:00:00 /bin/sh ./jboss-eap6-CSD1.sh start
root     113962 113957  0 Jul22 ?        00:00:00 runuser -s /bin/bash root -c ulimit -S -c 0 >/dev/null 2>&1 ; LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/var/run/jboss-as/standaloneCSD1.pid /home/siaoi/scripts/standalone.sh -c standalone.xml
root     113963 113962  0 Jul22 ?        00:00:00 bash -c ulimit -S -c 0 >/dev/null 2>&1 ; LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/var/run/jboss-as/standaloneCSD1.pid /home/siaoi/scripts/standalone.sh -c standalone.xml
root     113965 113964  0 Jul22 ?        00:00:00 /bin/sh /home/siaoi/jboss-eap-6.4/bin/standalone.sh -Djboss.node.name=CSD1 -Djboss.server.base.dir=/home/siaoi/jboss-eap-6.4/CSD1 -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.socket.binding.port-offset=150
root     114066 113965  0 Jul22 ?        00:56:48 java -D[Standalone] -server -XX:+UseCompressedOops -verbose:gc -Xloggc:/home/siaoi/jboss-eap-6.4/CSD1/log/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1303m -Xmx1303m -XX:MaxPermSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -Dorg.jboss.boot.log.file=/home/siaoi/jboss-eap-6.4/CSD1/log/server.log -Dlogging.configuration=file:/home/siaoi/jboss-eap-6.4/CSD1/configuration/logging.properties -jar /home/siaoi/jboss-eap-6.4/jboss-modules.jar -mp /home/siaoi/jboss-eap-6.4/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.standalone -Djboss.home.dir=/home/siaoi/jboss-eap-6.4 -Djboss.server.base.dir=/home/siaoi/jboss-eap-6.4/CSD1 -Djboss.node.name=CSD1 -Djboss.server.base.dir=/home/siaoi/jboss-eap-6.4/CSD1 -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.socket.binding.port-offset=150
p585600  130087 130038  0 15:33 pts/0    00:00:00 grep --color=auto jboss
-sh-4.2$
-sh-4.2$
-sh-4.2$ ps -ef | grep java
root     114066 113965  0 Jul22 ?        00:56:48 java -D[Standalone] -server -XX:+UseCompressedOops -verbose:gc -Xloggc:/home/siaoi/jboss-eap-6.4/CSD1/log/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1303m -Xmx1303m -XX:MaxPermSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -Dorg.jboss.boot.log.file=/home/siaoi/jboss-eap-6.4/CSD1/log/server.log -Dlogging.configuration=file:/home/siaoi/jboss-eap-6.4/CSD1/configuration/logging.properties -jar /home/siaoi/jboss-eap-6.4/jboss-modules.jar -mp /home/siaoi/jboss-eap-6.4/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.standalone -Djboss.home.dir=/home/siaoi/jboss-eap-6.4 -Djboss.server.base.dir=/home/siaoi/jboss-eap-6.4/CSD1 -Djboss.node.name=CSD1 -Djboss.server.base.dir=/home/siaoi/jboss-eap-6.4/CSD1 -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.socket.binding.port-offset=150
p585600  130096 130038  0 15:33 pts/0    00:00:00 grep --color=auto java
-sh-4.2$ ps -ef | grep siaoi
root     113962 113957  0 Jul22 ?        00:00:00 runuser -s /bin/bash root -c ulimit -S -c 0 >/dev/null 2>&1 ; LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/var/run/jboss-as/standaloneCSD1.pid /home/siaoi/scripts/standalone.sh -c standalone.xml
root     113963 113962  0 Jul22 ?        00:00:00 bash -c ulimit -S -c 0 >/dev/null 2>&1 ; LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/var/run/jboss-as/standaloneCSD1.pid /home/siaoi/scripts/standalone.sh -c standalone.xml
root     113964 113963  0 Jul22 ?        00:00:00 /bin/sh /home/siaoi/scripts/standalone.sh -c standalone.xml
root     113965 113964  0 Jul22 ?        00:00:00 /bin/sh /home/siaoi/jboss-eap-6.4/bin/standalone.sh -Djboss.node.name=CSD1 -Djboss.server.base.dir=/home/siaoi/jboss-eap-6.4/CSD1 -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.socket.binding.port-offset=150
root     114066 113965  0 Jul22 ?        00:56:48 java -D[Standalone] -server -XX:+UseCompressedOops -verbose:gc -Xloggc:/home/siaoi/jboss-eap-6.4/CSD1/log/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1303m -Xmx1303m -XX:MaxPermSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -Dorg.jboss.boot.log.file=/home/siaoi/jboss-eap-6.4/CSD1/log/server.log -Dlogging.configuration=file:/home/siaoi/jboss-eap-6.4/CSD1/configuration/logging.properties -jar /home/siaoi/jboss-eap-6.4/jboss-modules.jar -mp /home/siaoi/jboss-eap-6.4/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.standalone -Djboss.home.dir=/home/siaoi/jboss-eap-6.4 -Djboss.server.base.dir=/home/siaoi/jboss-eap-6.4/CSD1 -Djboss.node.name=CSD1 -Djboss.server.base.dir=/home/siaoi/jboss-eap-6.4/CSD1 -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.socket.binding.port-offset=150
p585600  130125 130038  0 15:34 pts/0    00:00:00 grep --color=auto siaoi
-sh-4.2$

