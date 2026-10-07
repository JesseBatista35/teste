
Sistema: 
Segmento: Bancário/São Paulo
Produto: Outros
Ambiente: Multiplataforma
Comunidade: Canais Próprios Clientes
Unidade Demandante: 5088-CESOA
Telefone para contato: 11999999999
Caixa postal da unidade demandante: cesoa140
Tipo de Serviço: 
Banco de Dados: 
Instância: 
Solicitação baseada na matriz: 
Tipo das Tabelas: 
Tabelas a serem importadas: 

Descrições adicionais: Favor checar:

1) se os comandos "mail" ou "mailx" estão ativos nos servidores cspibapllx017 e dt7261ux372.

2) se as configurações para envio de e-mail estão feitas nos referidos servidores.


p585600@10.118.74.50's password:
Creating home directory for p585600.
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$
[p585600@cspibapllx017 ~]$ ps -ef | jboss
-bash: jboss: command not found
[p585600@cspibapllx017 ~]$ ps -ef | grep jboss
jboss6    8900 19895  0 Sep20 ?        00:40:17 /opt/jboss/jdk/bin/java -D[Server:sinbc-portalbanking-lx017] -XX:PermSize=512m -XX:MaxPermSize=512m -Xms2048m -Xmx2048m -XX:-UseSplitVerifier -Dcom.ibm.msg.client.commonservices.log.status=OFF -Djboss.modcluster.proxyList=cadibintlx074:6666,cadibintlx075:6666 -Dfile.encoding=iso-8859-1 -Djboss.modules.policy-permissions=true -Djava.awt.headless=true -Djboss.modules.system.pkgs=org.jboss.byteman,com.sun.crypto.provider,com.wily -Djboss.home.dir=/opt/jboss/jboss-eap-6.4 -Dorg.apache.coyote.http11.Http11Protocol.MAX_HEADER_SIZE=16384 -Djava.net.preferIPv4Stack=true -Dcom.wily.introscope.agentProfile=/opt/apm/wily/core/config/IntroscopeAgent-siibc.profile -Djboss.server.log.dir=/opt/jboss/jboss-eap-6.4/domain/servers/sinbc-portalbanking-lx017/log -Djboss.server.temp.dir=/opt/jboss/jboss-eap-6.4/domain/servers/sinbc-portalbanking-lx017/tmp -Djboss.server.data.dir=/opt/jboss/jboss-eap-6.4/domain/servers/sinbc-portalbanking-lx017/data -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap-6.4/domain/servers/sinbc-portalbanking-lx017/log/server.log -Dlogging.configuration=file:/opt/jboss/jboss-eap-6.4/domain/configuration/default-server-logging.properties -jar /opt/jboss/jboss-eap-6.4/jboss-modules.jar -mp /opt/jboss/jboss-eap-6.4/modules:/opt/jboss/jboss-eap-6.4/modules-caixa -jaxpmodule javax.xml.jaxp-provider org.jboss.as.server
p585600  13420 12970  0 09:15 pts/0    00:00:00 grep jboss
root     19570     1  0 Jul08 ?        00:00:00 su - jboss6 -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss/jboss-eap-6.4/domain/log/jboss-as-domain.pid /opt/jboss/jboss-eap-6.4/bin/domain.sh --domain-config=domain.xml --host-config=host.xml
jboss6   19575 19570  0 Jul08 ?        00:00:00 /bin/sh /opt/jboss/jboss-eap-6.4/bin/domain.sh --domain-config=domain.xml --host-config=host.xml
jboss6   19895 19575  0 Jul08 ?        00:44:59 /opt/jboss/jdk/bin/java -D[Process Controller] -server -Xms1024m -Xmx1024m -XX:MaxPermSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,com.sun.crypto.provider,com.wily -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap-6.4/domain/log/process-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap-6.4/domain/configuration/logging.properties -jar /opt/jboss/jboss-eap-6.4/jboss-modules.jar -mp /opt/jboss/jboss-eap-6.4/modules:/opt/jboss/jboss-eap-6.4/modules-caixa org.jboss.as.process-controller -jboss-home /opt/jboss/jboss-eap-6.4 -jvm /opt/jboss/jdk/bin/java -mp /opt/jboss/jboss-eap-6.4/modules:/opt/jboss/jboss-eap-6.4/modules-caixa -- -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap-6.4/domain/log/host-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap-6.4/domain/configuration/logging.properties -server -Xms1024m -Xmx1024m -XX:MaxPermSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,com.sun.crypto.provider,com.wily -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -- -default-jvm /opt/jboss/jdk/bin/java --domain-config=domain.xml --host-config=host.xml
jboss6   19913 19895  0 Jul08 ?        00:56:31 /opt/jboss/jdk/bin/java -D[Host Controller] -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap-6.4/domain/log/host-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap-6.4/domain/configuration/logging.properties -server -Xms1024m -Xmx1024m -XX:MaxPermSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,com.sun.crypto.provider,com.wily -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -jar /opt/jboss/jboss-eap-6.4/jboss-modules.jar -mp /opt/jboss/jboss-eap-6.4/modules:/opt/jboss/jboss-eap-6.4/modules-caixa -jaxpmodule javax.xml.jaxp-provider org.jboss.as.host-controller -mp /opt/jboss/jboss-eap-6.4/modules:/opt/jboss/jboss-eap-6.4/modules-caixa --pc-address 127.0.0.1 --pc-port 45253 -default-jvm /opt/jboss/jdk/bin/java --domain-config=domain.xml --host-config=host.xml -Djboss.home.dir=/opt/jboss/jboss-eap-6.4
jboss6   20010 19895  0 Jul08 ?        00:53:21 /opt/jboss/jdk/bin/java -D[Server:simcv01-lx017] -XX:PermSize=256m -XX:MaxPermSize=256m -Xms2048m -Xmx2048m -XX:-UseSplitVerifier -Djboss.modcluster.proxyList=cadibintlx074:6667,cadibintlx075:6667 -Djboss.balancer.group=simcv -Dapache.url.name=simcv2.caixa -Djboss.modules.policy-permissions=true -Djava.awt.headless=true -Djboss.modules.system.pkgs=org.jboss.byteman,com.sun.crypto.provider,com.wily -Djava.net.preferIPv4Stack=true -Dcom.wily.introscope.agentProfile=/opt/apm/wily/core/config/IntroscopeAgent-simcv.profile -Dorg.apache.coyote.http11.Http11Protocol.MAX_HEADER_SIZE=16384 -Djboss.home.dir=/opt/jboss/jboss-eap-6.4 -Djboss.balancer.name=simcvbalancer -Djboss.server.log.dir=/opt/jboss/jboss-eap-6.4/domain/servers/simcv01-lx017/log -Djboss.server.temp.dir=/opt/jboss/jboss-eap-6.4/domain/servers/simcv01-lx017/tmp -Djboss.server.data.dir=/opt/jboss/jboss-eap-6.4/domain/servers/simcv01-lx017/data -Dlogging.configuration=file:/opt/jboss/jboss-eap-6.4/domain/servers/simcv01-lx017/data/logging.properties -jar /opt/jboss/jboss-eap-6.4/jboss-modules.jar -mp /opt/jboss/jboss-eap-6.4/modules:/opt/jboss/jboss-eap-6.4/modules-caixa -jaxpmodule javax.xml.jaxp-provider org.jboss.as.server
[p585600@cspibapllx017 ~]$
