

Suporte ao ambiente de aplicação Multiplataformas
***Atenção***:	Essa opção deve ser utilizada para obter suporte para ambientes e produtos que não são relacionados às Esteiras DevOps.
.:	Ex: Aplicações Jboss legado, Aplicações Windows legado, Jenkins departamental, Git Lab Departamental, Nexus Departamental, Sonar Departamental.
Qual o ambiente*:	TQS
Qual é o site?*:	Negocial-Brasília
Qual o nome do sistema?*:	SISMH
Selecione a sua Comunidade*:	Habitação
Formas de contato*:	TEAMS
Descrição da necessidade*:	Precisamos do restart do ambiente de TQS COM URGENCIA nao estamos conseguindo publicar uma versao. Servidor : scttqapllx0032.df.caixa


[p585600@cadsvitrlx100 ~]$ ssh scttqapllx0032.df.caixa
^C
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$
}[p585600@cadsvitrlx100 ~]$ ssh 10.116.18.146
p585600@10.116.18.146's password:
Connection closed by 10.116.18.146 port 22
[p585600@cadsvitrlx100 ~]$ ssh 10.116.18.146
p585600@10.116.18.146's password:
Last login: Wed Aug 19 15:51:32 2026 from 10.122.150.31
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$
[p585600@scttqapllx0032 ~]$ ps -ef | grep jboss
root       8467      1  0 Aug26 ?        00:00:00 su - jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
jboss      8470   8467  0 Aug26 ?        00:00:00 /bin/sh /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
jboss      8523   8470  0 Aug26 ?        00:34:04 /usr/lib/jvm/java-1.7.0-openjdk-1.7.0.261.x86_64/jre/bin/java -D[Standalone] -server -XX:+UseCompressedOops -Xms1303m -Xmx1303m -XX:MaxPermSize=256m -Djava.net.preferIPv4Stack=true -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.server.default.config=standalone.xml -Dorg.jboss.boot.log.file=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/boot.log -Dlogging.configuration=file:/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/logging.properties -jar /usr/local/EAP-6.0.1/jboss-eap-6.0/jboss-modules.jar -mp /usr/local/EAP-6.0.1/jboss-eap-6.0/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.standalone -Djboss.home.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0 -Djboss.server.base.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
p585600  128592 128566  0 15:28 pts/2    00:00:00 grep jboss
[p585600@scttqapllx0032 ~]$ ps -ef | grep sismh
p585600  128596 128566  0 15:28 pts/2    00:00:00 grep sismh
[p585600@scttqapllx0032 ~]$ hostname -f
scttqapllx0032.df.caixa
[p585600@scttqapllx0032 ~]$
