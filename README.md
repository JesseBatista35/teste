Solicitamos a verificação da indisponibilidade na instância Java Batch do SIGEC Portabilidade em DES.

ambiente de DES, não está sendo atualizado quando estamos solicitando deploy via esteira (Gid).

Há uma mensagem dizendo que o canal foi "stopped".

Instância:

SIGEC PORTABILIDADE - DES (batch)
SIGEC-PORTABILIDADE-BATCH-DEPLOY-DES
Link: https://sigec.des.caixa/gec-web/por/



Pressione <Control+D> IMEDIATAMENTE se voce nao concorda com as
condicoes deste aviso
***********************************************************************
p585600@10.116.94.210's password:
Last login: Fri Sep 25 10:46:07 2026 from 10.122.150.31
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ hostname -f
sbrdeapllx103.extra.caixa.gov.br
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ps -ef | grep sigec
p585600   35940  35872  0 14:00 pts/1    00:00:00 grep --color=auto sigec
-sh-4.2$ ps -ef | grep jboss
root       9333      1  0 Set09 ?        00:00:00 su - jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss/jboss-eap/hc/tmp/jboss-hc-des.pid /opt/jboss/jboss-eap/bin/domain.sh --host-config=host-slave.xml  -b 10.116.94.210 -bmanagement 10.116.94.210 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.server.log.dir=/logs/jboss-eap/servers -c domain.xml
jboss     13807   9333  0 Set09 ?        00:00:00 /bin/sh /opt/jboss/jboss-eap/bin/domain.sh --host-config=host-slave.xml -b 10.116.94.210 -bmanagement 10.116.94.210 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.server.log.dir=/logs/jboss-eap/servers -c domain.xml
jboss     14164  13807  0 Set09 ?        00:32:27 java -D[Process Controller] -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/process-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.process-controller -jboss-home /opt/jboss/jboss-eap -jvm java -mp /opt/jboss/jboss-eap/modules -- -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/host-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -- -default-jvm java --host-config=host-slave.xml -b 10.116.94.210 -bmanagement 10.116.94.210 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.server.log.dir=/logs/jboss-eap/servers -c domain.xml
jboss     14214  14164  0 Set09 ?        00:35:41 java -D[Host Controller] -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/host-controller.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/logging.properties -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.host-controller -mp /opt/jboss/jboss-eap/modules --pc-address 127.0.0.1 --pc-port 41770 -default-jvm java --host-config=host-slave.xml -b 10.116.94.210 -bmanagement 10.116.94.210 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.server.log.dir=/logs/jboss-eap/servers -c domain.xml -Djboss.home.dir=/opt/jboss/jboss-eap
jboss     14373  14164  0 Set09 ?        06:25:45 /usr/java/jdk1.8.0_91/jre/bin/java -D[Server:sigfi_fgc_node1_lx103] -Xms1024m -Xmx1024m -Duser.language=pt -Duser.country=BR -Djava.awt.headless=true -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttps.protocols=TLSv1.2 -Dhttp.proxy.bypass.enabled=true -Dhttp.nonProxyHosts=*.caixa|*.des.caixa|*.intra.caixa.gov.br|*.extracaixa|*.siapenet.gov.br|*.caixa.gov.br|apim-parceiros-sandbox.azure-api.net|api.des.caixa| -Dhttp.proxySet=true -DSIGFI-SEC_TEMPO_MAX_IDLE=60 -DSIGFI-SEC_TEMPO_VIDA_TOKEN=5 -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djboss.bind.address=10.116.94.210 -Djboss.bind.address.management=10.116.94.210 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.system.pkgs=org.jboss.byteman -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/servers/sigfi_fgc_node1_lx103/log -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/servers/sigfi_fgc_node1_lx103/tmp -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/servers/sigfi_fgc_node1_lx103/data -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/servers/sigfi_fgc_node1_lx103/log/server.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/default-server-logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.server
jboss     14469  14164  0 Set09 ?        02:12:31 /usr/java/jdk1.8.0_91/jre/bin/java -D[Server:sigfi_ecr_node1_lx103] -Xms1024m -Xmx1024m -DLDAP_PASSWD_BIND= -DLDAP_PORT=1489 -DLDAP_SERVER=ldap://ldapclusterdes.extra.caixa.gov.br -DLDAP_USER_BIND= -DPATH_ARQUIVOS=upload/des/sigfi/ -Dgfi.ejb.mq.channel=BRD1.SVRCONN -Dgfi.ejb.mq.hostName=10.192.228.145 -Dgfi.ejb.mq.password=undefined -Dgfi.ejb.mq.port=1414 -Dgfi.ejb.mq.queueManager=BRD1 -Dgfi.ejb.mq.transportType=CLIENT -Dgfi.ejb.mq.userName=SECRDB01 -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djboss.bind.address=10.116.94.210 -Djboss.bind.address.management=10.116.94.210 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.system.pkgs=org.jboss.byteman -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/servers/sigfi_ecr_node1_lx103/log -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/servers/sigfi_ecr_node1_lx103/tmp -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/servers/sigfi_ecr_node1_lx103/data -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/servers/sigfi_ecr_node1_lx103/log/server.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/default-server-logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.server
jboss     14601  14164  0 Set09 ?        02:04:51 /usr/java/jdk1.8.0_91/jre/bin/java -D[Server:sigfi_node1_lx103] -Xms2048m -Xmx2048m -DSIGFI_PASSWORD=IFG001 -DSIGFI_USUARIO=SGFIDB01 -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djboss.bind.address=10.116.94.210 -Djboss.bind.address.management=10.116.94.210 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.system.pkgs=org.jboss.byteman -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/servers/sigfi_node1_lx103/log -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/servers/sigfi_node1_lx103/tmp -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/servers/sigfi_node1_lx103/data -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/servers/sigfi_node1_lx103/log/server.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/default-server-logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.server
p585600   35947  35872  0 14:00 pts/1    00:00:00 grep --color=auto jboss
-sh-4.2$
-sh-4.2$
-sh-4.2$ ^C
-sh-4.2$ cat opt/jboss/jboss-eap/hc/servers/sigfi_ecr_node1_lx103/log/server.log
cat: opt/jboss/jboss-eap/hc/servers/sigfi_ecr_node1_lx103/log/server.log: Arquivo ou diretório não encontrado
-sh-4.2$ ls opt/jboss/jboss-eap/hc/servers/sigfi_ecr_node1_lx103/log/server.log
ls: não é possível acessar opt/jboss/jboss-eap/hc/servers/sigfi_ecr_node1_lx103/log/server.log: Arquivo ou diretório não encontrado
-sh-4.2$
