Favor realizar a  instalação do jboss 7.4(modo domain controller) nos servidores linux 10.116.97.116 e 10.116.97.117 com a versão 7.4, onde a .116 contem o DC/HC e a .117 contem o HC. Configurar com o java jdk1.8.0_371. A instalação deve conter as instancias para 4 domínios des, tqs, pre e rel.

Em resumo:
Servidor .116: JBOSS 7.4 -> JDK 1.8.0_371 -> DC+HC (des,tqs,pre e rel)
Servidor .117: JBOSS 7.4 -> JDK 1.8.0_371 -> HC (des,tqs,pre e rel)


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081869857
Criado em	 14/10/2026 15:07:24
Criado por	 P695115
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,

Boa tarde.

Informamos que o ambiente foi instalado conforme solicitado.

Evidencias segue abaixo;

SERVIDOR CONFIGURADO PARA SER O DC/HC


[root@cbrdeapllx483 init.d]# netstat -antl | grep 999
tcp        0      0 10.116.97.116:9999      0.0.0.0:*               LISTEN
tcp        0      0 127.0.0.1:9999          0.0.0.0:*               LISTEN
tcp        0      0 127.0.0.1:48456         127.0.0.1:9999          ESTABLISHED
tcp        0      0 10.116.97.116:9999      10.116.97.116:58286     ESTABLISHED
tcp        0      0 10.116.97.116:9999      10.116.97.117:46102     ESTABLISHED
tcp        0      0 127.0.0.1:48450         127.0.0.1:9999          ESTABLISHED
tcp        0      0 10.116.97.116:58286     10.116.97.116:9999      ESTABLISHED
tcp        0      0 127.0.0.1:9999          127.0.0.1:48456         ESTABLISHED
tcp        0      0 127.0.0.1:9999          127.0.0.1:48450         ESTABLISHED
[root@cbrdeapllx483 init.d]#


[root@cbrdeapllx483 init.d]# ps auxww | grep -i jboss
root     2350127  0.0  0.0  43624  6888 ?        S    14:35   0:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss/jboss-eap/dc/tmp/jboss-dc-des.pid /opt/jboss/jboss-eap/bin/domain.sh --host-config=host-master.xml  -b 10.116.97.116 -bmanagement 10.116.97.116 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/dc -Djboss.server.log.dir=/opt/jboss/jboss-eap/dc/log/servers -c domain.xml
jboss    2350130  0.0  0.0   7268  3672 ?        Ss   14:35   0:00 /bin/sh /opt/jboss/jboss-eap/bin/domain.sh --host-config=host-master.xml -b 10.116.97.116 -bmanagement 10.116.97.116 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/dc -Djboss.server.log.dir=/opt/jboss/jboss-eap/dc/log/servers -c domain.xml
jboss    2350320  0.0  0.1 2038560 142040 ?      Sl   14:35   0:01 java -D[Process Controller] -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/dc/log/process-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/dc/configuration/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.process-controller -jboss-home /opt/jboss/jboss-eap -jvm java -mp /opt/jboss/jboss-eap/modules -- -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/dc/log/host-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/dc/configuration/logging.properties -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -- -default-jvm java --host-config=host-master.xml -b 10.116.97.116 -bmanagement 10.116.97.116 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/dc -Djboss.server.log.dir=/opt/jboss/jboss-eap/dc/log/servers -c domain.xml
jboss    2350360  0.7  0.4 2273164 544916 ?      Sl   14:35   0:13 java -D[Host Controller] -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/dc/log/host-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/dc/configuration/logging.properties -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.host-controller -mp /opt/jboss/jboss-eap/modules --pc-address 127.0.0.1 --pc-port 37043 -default-jvm java --host-config=host-master.xml -b 10.116.97.116 -bmanagement 10.116.97.116 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/dc -Djboss.server.log.dir=/opt/jboss/jboss-eap/dc/log/servers -c domain.xml -Djboss.home.dir=/opt/jboss/jboss-eap
root     2373302  0.0  0.0  43624  6892 ?        S    14:52   0:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss/jboss-eap/hc/tmp/jboss-hc-des.pid /opt/jboss/jboss-eap/bin/domain.sh --host-config=host-slave.xml -b 127.0.0.1 -bmanagement 127.0.0.1 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.97.116 -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/log/jboss-eap/servers -c domain.xml
jboss    2373305  0.0  0.0   7268  3684 ?        Ss   14:52   0:00 /bin/sh /opt/jboss/jboss-eap/bin/domain.sh --host-config=host-slave.xml -b 127.0.0.1 -bmanagement 127.0.0.1 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.97.116 -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/log/jboss-eap/servers -c domain.xml
jboss    2373498  0.1  0.1 2047668 146576 ?      Sl   14:52   0:01 java -D[Process Controller] -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/process-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.process-controller -jboss-home /opt/jboss/jboss-eap -jvm java -mp /opt/jboss/jboss-eap/modules -- -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/host-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -- -default-jvm java --host-config=host-slave.xml -b 127.0.0.1 -bmanagement 127.0.0.1 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.97.116 -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/log/jboss-eap/servers -c domain.xml
jboss    2373538  1.1  0.3 2214348 473320 ?      Sl   14:52   0:08 java -D[Host Controller] -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/host-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.host-controller -mp /opt/jboss/jboss-eap/modules --pc-address 127.0.0.1 --pc-port 44527 -default-jvm java --host-config=host-slave.xml -b 127.0.0.1 -bmanagement 127.0.0.1 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.97.116 -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/log/jboss-eap/servers -c domain.xml -Djboss.home.dir=/opt/jboss/jboss-eap
jboss    2373619  1.5  0.4 2893028 627040 ?      Sl   14:52   0:11 /usr/lib/jvm/jdk-1.8-oracle-x64/jre/bin/java -D[Server:server-one] -D[pcid:531982751] -Xms1000m -Xmx1000m -server -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=256m -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djboss.bind.address=127.0.0.1 -Djboss.bind.address.management=127.0.0.1 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.97.116 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.system.pkgs=org.jboss.byteman -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/servers/server-one/log -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/servers/server-one/tmp -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/servers/server-one/data -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/servers/server-one/data/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.server
jboss    2373723  2.1  0.5 3073716 715448 ?      Sl   14:52   0:15 /usr/lib/jvm/jdk-1.8-oracle-x64/jre/bin/java -D[Server:server-two] -D[pcid:934337990] -Xms1000m -Xmx1000m -server -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=256m -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djboss.bind.address=127.0.0.1 -Djboss.bind.address.management=127.0.0.1 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.97.116 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.system.pkgs=org.jboss.byteman -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/servers/server-two/log -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/servers/server-two/tmp -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/servers/server-two/data -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/servers/server-two/data/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.server
root     2374672  0.0  0.0   6412  2720 pts/2    S+   15:04   0:00 grep --color=auto -i jboss
[root@cbrdeapllx483 init.d]#



SERVIDOR CONFIGURADO PARA SER O HC;

[root@cbrdeapllx485 configuration]# ps auxww | grep -i jboss
root     2303663  0.0  0.0  43624  6892 ?        S    14:48   0:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss/jboss-eap/hc/tmp/jboss-hc-des.pid /opt/jboss/jboss-eap/bin/domain.sh --host-config=host-slave.xml -b 10.116.97.117 -bmanagement 10.116.97.117 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.97.116 -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/log/jboss-eap/servers -c domain.xml
jboss    2303666  0.0  0.0   7268  3632 ?        Ss   14:48   0:00 /bin/sh /opt/jboss/jboss-eap/bin/domain.sh --host-config=host-slave.xml -b 10.116.97.117 -bmanagement 10.116.97.117 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.97.116 -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/log/jboss-eap/servers -c domain.xml
jboss    2303859 10.8  0.0 2046872 78220 ?       Sl   14:48   0:00 java -D[Process Controller] -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/process-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.process-controller -jboss-home /opt/jboss/jboss-eap -jvm java -mp /opt/jboss/jboss-eap/modules -- -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/host-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -- -default-jvm java --host-config=host-slave.xml -b 10.116.97.117 -bmanagement 10.116.97.117 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.97.116 -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/log/jboss-eap/servers -c domain.xml
jboss    2303899 97.8  0.3 2230724 413804 ?      Sl   14:48   0:07 java -D[Host Controller] -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/host-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.host-controller -mp /opt/jboss/jboss-eap/modules --pc-address 127.0.0.1 --pc-port 41425 -default-jvm java --host-config=host-slave.xml -b 10.116.97.117 -bmanagement 10.116.97.117 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.97.116 -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/log/jboss-eap/servers -c domain.xml -Djboss.home.dir=/opt/jboss/jboss-eap
jboss    2303979  157  0.4 2922712 628912 ?      Sl   14:48   0:09 /usr/lib/jvm/jdk-1.8-oracle-x64/jre/bin/java -D[Server:server-one] -D[pcid:1468007219] -Xms1000m -Xmx1000m -server -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=256m -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djboss.bind.address=10.116.97.117 -Djboss.bind.address.management=10.116.97.117 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.97.116 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.system.pkgs=org.jboss.byteman -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/servers/server-one/log -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/servers/server-one/tmp -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/servers/server-one/data -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/servers/server-one/data/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.server
jboss    2304082  162  0.4 2891908 618460 ?      Sl   14:48   0:08 /usr/lib/jvm/jdk-1.8-oracle-x64/jre/bin/java -D[Server:server-two] -D[pcid:481502194] -Xms1000m -Xmx1000m -server -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=256m -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djboss.bind.address=10.116.97.117 -Djboss.bind.address.management=10.116.97.117 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.97.116 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.system.pkgs=org.jboss.byteman -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/servers/server-two/log -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/servers/server-two/tmp -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/servers/server-two/data -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/servers/server-two/data/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.server




As informações para acesso a console favor entrar em contato via teams;

Atenciosamente,
P695115 - Marcos Cavaco
CTIS / CESTI / ESTEIRAS – Aplicação e Apresentação
ID da Ordem de Trabalho	 WO0000081869857
Criado em	 08/10/2026 23:56:07
Criado por	 P666004
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À
Equipe APL


Favor verificar.


Atenciosamente
Humberto Arakaki
Preposto - Suporte Multiplataforma - CTIS
CESTI111  / P666004
ID da Ordem de Trabalho	 WO0000081869857
Criado em	 08/10/2026 23:52:46
Criado por	 P609410
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Sem atuação da equipe de SO.

Att,
Multiplataforma Suporte SO
ID da Ordem de Trabalho	 WO0000081869857
Criado em	 08/10/2026 15:44:47
Criado por	 P779123
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que não esteja na iminência de tornar-se incidente. Previsto atendimento em até 24 horas.[CENTRAL-SID]
OBS: Saneamento realizado considerando a nota anterior da equipe técnica que informa atendimento em até 24 horas
ID da Ordem de Trabalho	 WO0000081869857
Criado em	 08/10/2026 15:34:49
Criado por	 P564449
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 A/C Time de SO,

Poderiam por gentileza verificar o que se pede?

Qualquer dúvida estou à disposição.

At.te,
Kallebe M. Vieira
Analista CTIS / CESTI
Esteira DEVOPS DES TQS
ID da Ordem de Trabalho	 WO0000081869857
Criado em	 08/10/2026 15:18:30
Criado por	 P507043
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),



Informamos que sua solicitação foi recebida.  



Nosso SLA para atendimento é de até 24h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.



Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.



Novas informações e atualizações serão registradas diretamente nesta WO.



Atte.



Esteira Devops DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081869857
Criado em	 08/10/2026 15:03:55
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Segunda-feira, 19/10/2026 09:48:25





a maquina 116 vai trabalar com HC E DC E A 117 VAI SER SOMENTE HC

O X DA QUESTÃO É: eu precios conseguiro os ips para cada ambiente de desenvolvimento podemos pedir por aqui 

esse ip





<img width="786" height="660" alt="image" src="https://github.com/user-attachments/assets/5e88dcf5-be4b-4295-9011-871dcd1cc16d" />



posiu tem que cira um serviço pra cada um certo?
