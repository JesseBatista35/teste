
Senha SUDO:
[jboss7@sspdeapllx0041 p585600]$ cd /opt/jboss/jboss-eap-7.0
[jboss7@sspdeapllx0041 jboss-eap-7.0]$ ps -ef | grep sisag-lx0041 | grep -v
Usage: grep [OPTION]... PATTERN [FILE]...
Try 'grep --help' for more information.
[jboss7@sspdeapllx0041 jboss-eap-7.0]$ ps -ef | grep sisag-lx0041 | grep -v grep
jboss7    3717  1022 44 14:21 ?        00:01:04 /opt/jboss/jdk/bin/java -D[Server:sisag-lx0041] -Xms256m -Xmx256m -server -XX:MetaspaceSize=1024m -XX:MaxMetaspaceSize=1024m -javaagent:/opt/azure/config/appinsights/applicationinsights-agent.jar -Dapplicationinsights.configuration.file=/opt/azure/config/appinsights/applicationinsights.json -Djava.net.useSystemProxies=false -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=localhost|127.0.0.1|*.caixa|*.caixa.gov.br -Dbr.com.bry.debug=assinador ws all -Dinstancias.list=nodelx0041[7606],nodelx0076[7606] -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djboss.as.management.blocking.timeout=600 -Djboss.home.dir=/opt/jboss/jboss-eap-7.0 -Djboss.modules.system.pkgs=org.jboss.byteman,com.sun.crypto.provider,com.wily,com.wily* -Djboss.server.log.dir=/opt/jboss/jboss-eap-7.0/domain/servers/sisag-lx0041/log -Djboss.server.temp.dir=/opt/jboss/jboss-eap-7.0/domain/servers/sisag-lx0041/tmp -Djboss.server.data.dir=/opt/jboss/jboss-eap-7.0/domain/servers/sisag-lx0041/data -Dlogging.configuration=file:/opt/jboss/jboss-eap-7.0/domain/servers/sisag-lx0041/data/logging.properties -jar /opt/jboss/jboss-eap-7.0/jboss-modules.jar -mp /opt/jboss/jboss-eap-7.0/modules:/opt/jboss/jboss-eap-7.0/modules-caixa org.jboss.as.server
[jboss7@sspdeapllx0041 jboss-eap-7.0]$
