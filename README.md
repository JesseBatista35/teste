[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]# head -60 /opt/open/jboss/7.0.0/scripts/jboss-admin
#!/usr/bin/env bash
#####
#  autor: Madson Coelho (c080028)
#  data: 2014-07-10
#  nome: jboss-admin
#  desc: manipulacao do jboss domain
#  chkconfig: 2345 20 05
#  description: jboss domain
#####

# cores
RED='\e[0;31m'
NC='\e[0m'


# jboss home
JBOSS_HOME="/opt/open/jboss/7.0.0"

# jboss log
JBOSS_LOG=$JBOSS_HOME/domain/log/host-controller.log

# owner do jboss
JBOSS_USER=$(ls -l $JBOSS_HOME/domain/configuration/domain.xml | awk {'print $3'})

# usuario executando o script
CURRENT_USER=$(id -u -n)

# verificando usuario de servico
if ! [[ $CURRENT_USER == "root" ]]
then
  echo -e "${RED}Favor executar este script como sudo${NC}."
  echo "[ sudo -E -u $0 $COMMAND ]"
  exit 1
fi

# arquivo host.xml
HOST_XML="host.xml"

# arquivo domain.xml
DOMAIN_XML="domain.xml"

# nome do host, capturado automaticamente do arquivo host.xml
HOST=$(grep "domain:4.1" $JBOSS_HOME/domain/configuration/host.xml | awk '{ print $2}' | awk -F"=" '{ print $2 }' | tr -d '"')

# se o nome do host for HOSTDEFAULT, altere para o nome do servidor, obtido via variavel $(hostname)
if [ "$HOST" == "HOSTDEFAULT" ]
then
  sed "s/HOSTDEFAULT/$(hostname)/g" $JBOSS_HOME/domain/configuration/$HOST_XML > /var/tmp/host.xml
  cp /var/tmp/host.xml $JBOSS_HOME/domain/configuration/$HOST_XML
  rm /var/tmp/host.xml
  HOST=$(grep "domain:4.1" $JBOSS_HOME/domain/configuration/host.xml | awk '{ print $2}' | awk -F"=" '{ print $2 }' | tr -d '"')
fi

# porta utilizada pela cli
NATIVE_PORT=9999

# ip de bind da console web
HTTP_PORT=9990

# IP de bind do domain, correspondente ao nome da maquina.
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]# grep -nE 'start\)|stop\)|status\)|USER|domain.sh|standalone.sh' /opt/open/jboss/7.0.0/scripts/jboss-admin
23:JBOSS_USER=$(ls -l $JBOSS_HOME/domain/configuration/domain.xml | awk {'print $3'})
26:CURRENT_USER=$(id -u -n)
29:if ! [[ $CURRENT_USER == "root" ]]
69:# localizaco do domain.sh
70:JBOSS_DOMAIN=$JBOSS_HOME/bin/domain.sh
83:    su - $JBOSS_USER -c \
122:    su - $JBOSS_USER -c \
139:      PROCESSOS=$(ps -ef | grep -v grep | egrep "$PID|domain.sh" | wc -l)
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]# service jboss status
=====> O JBoss nao esta em execucao
[root@srjdeapllx158 p585600]# service jboss start
=====> Iniciando srjdeapllx158...
[root@srjdeapllx158 p585600]# ps -ef | grep [j]ava
spjbodr2  14201  14089  1 16:38 ?        00:00:00 /opt/open/java/jdk1.8.0_121//bin/java -D[Process Controller] -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=1024m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,com.sun.crypto.provider,com.wily,com.singularity -Djava.awt.headless=true -Dorg.jboss.boot.log.file=/opt/open/jboss/7.0.0/domain/log/process-controller.log -Dlogging.configuration=file:/opt/open/jboss/7.0.0/domain/configuration/logging.properties -jar /opt/open/jboss/7.0.0/jboss-modules.jar -mp /opt/open/jboss/7.0.0/modules org.jboss.as.process-controller -jboss-home /opt/open/jboss/7.0.0 -jvm /opt/open/java/jdk1.8.0_121//bin/java -mp /opt/open/jboss/7.0.0/modules -- -Dorg.jboss.boot.log.file=/opt/open/jboss/7.0.0/domain/log/host-controller.log -Dlogging.configuration=file:/opt/open/jboss/7.0.0/domain/configuration/logging.properties -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=1024m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,com.sun.crypto.provider,com.wily,com.singularity -Djava.awt.headless=true -- -default-jvm /opt/open/java/jdk1.8.0_121//bin/java -Djboss.bind.address=srjdeapllx158 -Djboss.bind.address.management=srjdeapllx158 -Djboss.management.http.port=9990 -Djboss.management.native.port=9999 -b=srjdeapllx158 -host-config=host.xml --domain-config=domain.xml
spjbodr2  14219  14201 19 16:38 ?        00:00:08 /opt/open/java/jdk1.8.0_121//bin/java -D[Host Controller] -Dorg.jboss.boot.log.file=/opt/open/jboss/7.0.0/domain/log/host-controller.log -Dlogging.configuration=file:/opt/open/jboss/7.0.0/domain/configuration/logging.properties -server -Xms64m -Xmx512m -XX:MaxMetaspaceSize=1024m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,com.sun.crypto.provider,com.wily,com.singularity -Djava.awt.headless=true -jar /opt/open/jboss/7.0.0/jboss-modules.jar -mp /opt/open/jboss/7.0.0/modules org.jboss.as.host-controller -mp /opt/open/jboss/7.0.0/modules --pc-address 127.0.0.1 --pc-port 35683 -default-jvm /opt/open/java/jdk1.8.0_121//bin/java -Djboss.bind.address=srjdeapllx158 -Djboss.bind.address.management=srjdeapllx158 -Djboss.management.http.port=9990 -Djboss.management.native.port=9999 -b=srjdeapllx158 -host-config=host.xml --domain-config=domain.xml -Djboss.home.dir=/opt/open/jboss/7.0.0
spjbodr2  14322  14201 57 16:38 ?        00:00:22 /opt/open/java/jdk1.8.0_121/bin/java -D[Server:srjdeapllx158_sicrf_intra_8080] -Xms1024m -Xmx1024m -Dbr.gov.caixa.psc.connector.util.Config=/infra_app/config/sicrf/sicrf_jconnector.properties -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djboss.bind.address=srjdeapllx158 -Djboss.bind.address.management=srjdeapllx158 -Djboss.home.dir=/opt/open/jboss/7.0.0 -Djboss.management.http.port=9990 -Djboss.management.native.port=9999 -Djboss.modules.system.pkgs=org.jboss.byteman,com.sun.crypto.provider,com.wily,com.singularity -Djboss.server.log.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sicrf_intra_8080/log -Djboss.server.temp.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sicrf_intra_8080/tmp -Djboss.server.data.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sicrf_intra_8080/data -Dlogging.configuration=file:/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sicrf_intra_8080/data/logging.properties -jar /opt/open/jboss/7.0.0/jboss-modules.jar -mp /opt/open/jboss/7.0.0/modules org.jboss.as.server
spjbodr2  14374  14201 62 16:38 ?        00:00:23 /opt/open/java/jdk1.8.0_121/bin/java -D[Server:srjdeapllx158_sifpp_intra_8081] -Xms2048m -Xmx2048m -XX:+UseG1GC -DAUTHENTICATION_SERVER_URL=https://acessoseguro.sso.des.intra.corerj.caixa/api/auth/token -DCLIENT_ID=sifpp-intra -DCLIENT_SECRET=3d56da36-ae05-41f8-831f-893fbb849bf2 -DENDPOINT_MICRO=https://sifpp-micro-des.apps.nprd.caixa -DRESOURCE_SERVER_URL=https://acessoseguro.sso.des.intra.corerj.caixa/api/ -DSICPU_APLICATIVO=817 -DSICPU_APP=3058459957320e715a8f1ae6a5005e9db5c25fa9 -DSICPU_PASSWORD=bd2547c2db5e7faf9bee5babe76b8d0e9e2a0dca -DSICPU_USER=SIFPP -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djboss.bind.address=srjdeapllx158 -Djboss.bind.address.management=srjdeapllx158 -Djboss.home.dir=/opt/open/jboss/7.0.0 -Djboss.management.http.port=9990 -Djboss.management.native.port=9999 -Djboss.modules.system.pkgs=org.jboss.byteman,com.sun.crypto.provider,com.wily,com.singularity -Dsicpu.local=https://central.mobilidade.des.intra.corerj.caixa/sicpu/ -Dsigdb.recebe=/infra_app/config/sifpp/sigdb/ -Dsigdb.transmite=/usr/local/sigdb/TRANSMITE -Dsimma.local=https://des.analytics.mobilidade.caixa.gov.br/analytics/ -Dsisit.local=https://des.central.mobilidade.caixa.gov.br/sisit/ -Djboss.server.log.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081/log -Djboss.server.temp.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081/tmp -Djboss.server.data.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081/data -Dlogging.configuration=file:/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081/data/logging.properties -jar /opt/open/jboss/7.0.0/jboss-modules.jar -mp /opt/open/jboss/7.0.0/modules org.jboss.as.server
spjbodr2  14505  14201 80 16:38 ?        00:00:29 /opt/open/java/jdk1.8.0_121/bin/java -D[Server:srjdeapllx158_sisem_intra_8082] -Xms1024m -Xmx1024m -javaagent:/infra_app/config/appinsights/applicationinsights-agent-3.1.1.jar -Dapplicationinsights.configuration.file=srjdeapllx158_sisem_intra_8082.json -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djboss.bind.address=srjdeapllx158 -Djboss.bind.address.management=srjdeapllx158 -Djboss.home.dir=/opt/open/jboss/7.0.0 -Djboss.management.http.port=9990 -Djboss.management.native.port=9999 -Djboss.modules.system.pkgs=org.jboss.byteman,com.sun.crypto.provider,com.wily,com.singularity -Djboss.server.log.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sisem_intra_8082/log -Djboss.server.temp.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sisem_intra_8082/tmp -Djboss.server.data.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sisem_intra_8082/data -Dlogging.configuration=file:/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sisem_intra_8082/data/logging.properties -jar /opt/open/jboss/7.0.0/jboss-modules.jar -mp /opt/open/jboss/7.0.0/modules org.jboss.as.server
spjbodr2  14802  14201 68 16:38 ?        00:00:14 /opt/open/java/jdk1.8.0_121/bin/java -D[Server:srjdeapllx158_suoco_intra_8083] -Xms1024m -Xmx1024m -XX:+UseG1GC -Dbr.gov.caixa.psc.connector.util.Config=/infra_app/config/suoco/suoco_jconnector.properties -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djboss.bind.address=srjdeapllx158 -Djboss.bind.address.management=srjdeapllx158 -Djboss.home.dir=/opt/open/jboss/7.0.0 -Djboss.management.http.port=9990 -Djboss.management.native.port=9999 -Djboss.modules.system.pkgs=org.jboss.byteman,com.sun.crypto.provider,com.wily,com.singularity -Djboss.server.log.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_suoco_intra_8083/log -Djboss.server.temp.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_suoco_intra_8083/tmp -Djboss.server.data.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_suoco_intra_8083/data -Dlogging.configuration=file:/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_suoco_intra_8083/data/logging.properties -jar /opt/open/jboss/7.0.0/jboss-modules.jar -mp /opt/open/jboss/7.0.0/modules org.jboss.as.server
spjbodr2  14909  14201 79 16:39 ?        00:00:16 /opt/open/java/jdk1.8.0_121/bin/java -D[Server:srjdeapllx158_siopf_intra_8085] -Xms1024m -Xmx1024m -Dbr.gov.caixa.psc.connector.util.Config=/infra_app/config/siopf/siopf_jconnector.properties -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djboss.bind.address=srjdeapllx158 -Djboss.bind.address.management=srjdeapllx158 -Djboss.home.dir=/opt/open/jboss/7.0.0 -Djboss.management.http.port=9990 -Djboss.management.native.port=9999 -Djboss.modules.system.pkgs=org.jboss.byteman,com.sun.crypto.provider,com.wily,com.singularity -Djboss.server.log.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_siopf_intra_8085/log -Djboss.server.temp.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_siopf_intra_8085/tmp -Djboss.server.data.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_siopf_intra_8085/data -Dlogging.configuration=file:/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_siopf_intra_8085/data/logging.properties -jar /opt/open/jboss/7.0.0/jboss-modules.jar -mp /opt/open/jboss/7.0.0/modules org.jboss.as.server
spjbodr2  15008  14201 49 16:39 ?        00:00:08 /opt/open/java/jdk1.8.0_121/bin/java -D[Server:srjdeapllx158_sicnl_intra_8087] -Xms1024m -Xmx1024m -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djboss.as.management.blocking.timeout=1800 -Djboss.bind.address=srjdeapllx158 -Djboss.bind.address.management=srjdeapllx158 -Djboss.home.dir=/opt/open/jboss/7.0.0 -Djboss.management.http.port=9990 -Djboss.management.native.port=9999 -Djboss.modules.system.pkgs=org.jboss.byteman,com.sun.crypto.provider,com.wily,com.singularity -Dsicpu.local=https://des.central.mobilidade.caixa.gov.br/sicpu -Dsimma.local=https://des.analytics.mobilidade.caixa.gov.br/analytics -Dsisit.local=https://des.central.mobilidade.caixa.gov.br/sisit -Dwebdav.properties=/infra_app/config/sicnl/sicnl_webdav.properties -Djboss.server.log.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sicnl_intra_8087/log -Djboss.server.temp.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sicnl_intra_8087/tmp -Djboss.server.data.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sicnl_intra_8087/data -Dlogging.configuration=file:/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sicnl_intra_8087/data/logging.properties -jar /opt/open/jboss/7.0.0/jboss-modules.jar -mp /opt/open/jboss/7.0.0/modules org.jboss.as.server
spjbodr2  15145  14201 99 16:39 ?        00:00:15 /opt/open/java/jdk1.8.0_121/bin/java -D[Server:srjdeapllx158_sisde_intra_8088] -Xms1024m -Xmx1024m -javaagent:/infra_app/config/appinsights/applicationinsights-agent-3.1.1.jar -DLOGIN_SISET=https://login.des.caixa -DSDE_DSDE0002=500,510,510010,510020,510025,510030,510050,510060,510070,510080,510090,510090010,510090020,510100,510110,510110010,510110020,520,520010,520010010,520010020,520010030,520020,520030,520040,520050,520060,520070,520070010,520070020,520070030,520070040,520070050,520070060,520070070,520070080,520070090,520080,530,530010,530010010,530010020,530020,530020010,530020020,530020030,530020040,530030,530030010,530030020,530040,530040010,530040020,530050,530050010,530050020,530060,530070,540,530080,530080010 -DSDE_DSDE0004=500,510,510010,510020,510025,510030,510050,510060,510070,510080,510090,510090010,510090020,510100,510110,510110010,510110020,520,520010,520010010,520010020,520010030,520020,520030,520040,520050,520060,520070,520070010,520070020,520070030,520070040,520070050,520070060,520070070,520070080,520070090,520080,530,530010,530010010,530010020,530020,530020010,530020020,530020030,530020040,530030,530030010,530030020,530040,530040010,530040020,530050,530050010,530050020,530060,530070,540,530080,530080010 -DSDE_DSDE0008=510,510010,510020,510030,510070,510100,520,520010,520010010,520010020,520020,520030,520040,520050,520060,520070,520070010,520070020,520070030,520070050,520070060,520070070,540 -DSDE_DSDE0017=510,510010,510020,510030,510110,510110010,510110,510110010 -DSDE_DSDE0037=510,510010,510020,510030,510070,510080,510100,510110,510110010,520,520010,520010010,520010020,520020,520030,520050,520060,520070,520070010,520070020,520070030,520070050,520070060,520070070,540 -DSDE_DSDE0047=510,510010,510020,520050,540 -DSDE_DSDE0077=510,510010,510020,510030,510070,510080,520030,520050,520070030,520070050,520070070,540 -DSDE_DSDE0087=510,510010,510020,510030,510070,510080,520030,520050,520070030,520070050,520070070,540 -DSDE_DSDE0097=510,510010,510020,510030,510070,510080,510100,520,520010,520010010,520010020,520020,520030,520040,520050,520060,520070,520070010,520070020,520070030,520070050,520070060,520070070,530070,540 -DSDE_DSDE00G4=510,510010,510020,510030,510050,510060,510070,510080,510090,510090010,510090020,510100,510110,510110010,510110020,520,520010,520010010,520010020,520010030,520020,520030,520040,520050,520060,520070,520070010,520070020,520070030,520070040,520070050,520070060,520070070,530,530010,530010010,530010020,530020,530020010,530020020,530020030,530020040,530030,530030010,530030020,530040,530040010,530040020,530050,530050010,530050020,530060,530070,540 -DSDE_DSDE0107=510,510010,540 -DSDE_DSDE0117=510,510010,510020,510030,510070,510100,510110,510110010,520,520010,520010010,520020,520030,520040,520060,520070,520070010,520070020,520070030,520070050,520070060,540 -DSDE_HSDE0002=500,510,510010,510020,510025,510030,510050,510060,510070,510080,510090,510090010,510090020,510100,510110,510110010,510110020,520,520010,520010010,520010020,520010030,520020,520030,520040,520050,520060,520070,520070010,520070020,520070030,520070040,520070050,520070060,520070070,520070080,520070090,520080,530,530010,530010010,530010020,530020,530020010,530020020,530020030,530020040,530030,530030010,530030020,530040,530040010,530040020,530050,530050010,530050020,530060,530070,540 -DSDE_HSDE0004=500,510,510010,510020,510025,510030,510050,510060,510070,510080,510090,510090010,510090020,510100,510110,510110010,510110020,520,520010,520010010,520010020,520010030,520020,520030,520040,520050,520060,520070,520070010,520070020,520070030,520070040,520070050,520070060,520070070,520070080,520070090,520080,530,530010,530010010,530010020,530020,530020010,530020020,530020030,530020040,530030,530030010,530030020,530040,530040010,530040020,530050,530050010,530050020,530060,530070,540 -DSDE_HSDE0008=510,510010,510020,510030,510070,510100,520,520010,520010010,520010020,520020,520030,520040,520050,520060,520070,520070010,520070020,520070030,520070050,520070060,520070070,540 -DSDE_HSDE0017=510,510010,510020,510030,510110,510110010,510110,510110010 -DSDE_HSDE0037=510,510010,510020,510030,510070,510080,510100,510110,510110010,520,520010,520010010,520010020,520020,520030,520050,520060,520070,520070010,520070020,520070030,520070050,520070060,520070070,540 -DSDE_HSDE0047=510,510010,510020,520050,540 -DSDE_HSDE0077=510,510010,510020,510030,510070,510080,520030,520050,520070030,520070050,520070070,540 -DSDE_HSDE0087=510,510010,510020,510030,510070,510080,520030,520050,520070030,520070050,520070070,540 -DSDE_HSDE0097=510,510010,510020,510030,510070,510080,510100,520,520010,520010010,520010020,520020,520030,520040,520050,520060,520070,520070010,520070020,520070030,520070050,520070060,520070070,530070,540 -DSDE_HSDE00G4=510,510010,510020,510030,510050,510060,510070,510080,510090,510090010,510090020,510100,510110,510110010,510110020,520,520010,520010010,520010020,520010030,520020,520030,520040,520050,520060,520070,520070010,520070020,520070030,520070040,520070050,520070060,520070070,530,530010,530010010,530010020,530020,530020010,530020020,530020030,530020040,530030,530030010,530030020,530040,530040010,530040020,530050,530050010,530050020,530060,530070,540 -DSDE_HSDE0107=510,510010,540 -DSDE_HSDE0117=510,510010,510020,510030,510070,510100,510110,510110010,520,520010,520010010,520020,520030,520040,520060,520070,520070010,520070020,520070030,520070050,520070060,540 -DSDE_HSDE0127=510,510010 -Dapplicationinsights.configuration.file=srjdeapllx158_sisde_intra_8088.json -Dbr.gov.caixa.psc.connector.util.Config=/infra_app/config/sisde/sisde_jconnector.properties -Dbr.gov.caixa.sisgr.api.REST=https://webservice.acessoseguro.des.corerj.caixa/sisgrauth-web -Dcxf.tls-client.disableCNCheck=false -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djavax.net.ssl.trustStore=/infra_app/config/sisde/cacerts -Djavax.net.ssl.trustStorePassword=changeit -Djavax.net.ssl.trustStoreType=jks -Djboss.as.management.blocking.timeout=1800 -Djboss.bind.address=srjdeapllx158 -Djboss.bind.address.management=srjdeapllx158 -Djboss.home.dir=/opt/open/jboss/7.0.0 -Djboss.management.http.port=9990 -Djboss.management.native.port=9999 -Djboss.modules.system.pkgs=org.jboss.byteman,com.sun.crypto.provider,com.wily,com.singularity -Dsicpu.central.mobilidade.email.endpoint=https://des.central.mobilidade.caixa.gov.br/sicpu/ws/email/sendimmediate/01.00 -Dsicpu.central.mobilidade.email.key=eca857c01d8ae3dbf134f82307662e1c6bc1bb51 -Dsicpu.central.mobilidade.email.password=eed5026f81454d176b307855b0300d1a61deff61 -Dsicpu.central.mobilidade.email.user=SSDERD01 -Dsisde_ftp.properties=/infra_app/config/sisde/sisde_ftp.properties -Dsisgr_autenticacao.properties=/infra_app/config/sisde/sisde_sisgr.properties -Djboss.server.log.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sisde_intra_8088/log -Djboss.server.temp.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sisde_intra_8088/tmp -Djboss.server.data.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sisde_intra_8088/data -Dlogging.configuration=file:/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sisde_intra_8088/data/logging.properties -jar /opt/open/jboss/7.0.0/jboss-modules.jar -mp /opt/open/jboss/7.0.0/modules org.jboss.as.server
spjbodr2  15458  14201  0 16:39 ?        00:00:00 /opt/open/java/jdk1.8.0_121/bin/java -D[Server:srjdeapllx158_siurb-ao_intra_8089] -Xms1024m -Xmx1024m -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djboss.as.management.blocking.timeout=1800 -Djboss.bind.address=srjdeapllx158 -Djboss.bind.address.management=srjdeapllx158 -Djboss.home.dir=/opt/open/jboss/7.0.0 -Djboss.management.http.port=9990 -Djboss.management.native.port=9999 -Djboss.modules.system.pkgs=org.jboss.byteman,com.sun.crypto.provider,com.wily,com.singularity -Djboss.server.log.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_siurb-ao_intra_8089/log -Djboss.server.temp.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_siurb-ao_intra_8089/tmp -Djboss.server.data.dir=/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_siurb-ao_intra_8089/data -Dlogging.configuration=file:/opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_siurb-ao_intra_8089/data/logging.properties -jar /opt/open/jboss/7.0.0/jboss-modules.jar -mp /opt/open/jboss/7.0.0/modules org.jboss.as.server
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]#

[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]# ss -lntp | grep 9999
LISTEN     0      50     10.116.95.7:9999                     *:*                   users:(("java",pid=14219,fd=95))
[root@srjdeapllx158 p585600]# ls -lt /opt/open/jboss/7.0.0/*/log/ 2>/dev/null | head
/opt/open/jboss/7.0.0/domain/log/:
total 24
-rw-r--r-- 1 spjbodr2 jboss 15528 Nov 27 16:39 host-controller.log
-rw-r--r-- 1 spjbodr2 jboss  1828 Nov 27 16:39 process-controller.log
-rw-r--r-- 1 spjbodr2 jboss     6 Nov 27 16:38 domain.pid

/opt/open/jboss/7.0.0/standalone/log/:
total 40
-rw-r--r-- 1 spjbodr2 jboss  1599 Apr  4  2022 gc.log.0.current
-rw-r--r-- 1 spjbodr2 jboss 36735 Apr  4  2022 server.log
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]# chkconfig --list jboss

Note: This output shows SysV services only and does not include native
      systemd services. SysV configuration data might be overridden by native
      systemd configuration.

      If you want to list systemd services use 'systemctl list-unit-files'.
      To see services enabled on particular target use
      'systemctl list-dependencies [target]'.

jboss           0:off   1:off   2:on    3:on    4:on    5:on    6:off
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]#
[root@srjdeapllx158 p585600]#
