
[jboss7@sspdeapllx0041 jboss-eap-7.0]$ ./jboss.sh sisag-lx0041 stop
Executando stop da instancia. (sisag-lx0041).
{
    "outcome" => "success",
    "result" => "STOPPING"
}
[jboss7@sspdeapllx0041 jboss-eap-7.0]$ ./jboss.sh sisag-lx0041 start
Removendo pasta tmp da instancia sisag-lx0041.
Removendo pasta data da instancia sisag-lx0041.
Executando start da instancia. (sisag-lx0041).
{
    "outcome" => "success",
    "result" => "STARTING"
}
[jboss7@sspdeapllx0041 jboss-eap-7.0]$ ps -ef | grep sisag-lx0041 | grep -v grep
jboss7   26547 11831 99 13:57 ?        00:00:21 /opt/jboss/jdk/bin/java -D[Server:sisag-lx0041] -Xms256m -Xmx256m -Dbr.com.bry.debug=assinador ws all -Dinstancias.list=nodelx0041[7606],nodelx0076[7606] -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djboss.as.management.blocking.timeout=600 -Djboss.home.dir=/opt/jboss/jboss-eap-7.0 -Djboss.modules.system.pkgs=org.jboss.byteman,com.sun.crypto.provider,com.wily,com.wily* -Djboss.server.log.dir=/opt/jboss/jboss-eap-7.0/domain/servers/sisag-lx0041/log -Djboss.server.temp.dir=/opt/jboss/jboss-eap-7.0/domain/servers/sisag-lx0041/tmp -Djboss.server.data.dir=/opt/jboss/jboss-eap-7.0/domain/servers/sisag-lx0041/data -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap-7.0/domain/servers/sisag-lx0041/log/server.log -Dlogging.configuration=file:/opt/jboss/jboss-eap-7.0/domain/configuration/default-server-logging.properties -jar /opt/jboss/jboss-eap-7.0/jboss-modules.jar -mp /opt/jboss/jboss-eap-7.0/modules:/opt/jboss/jboss-eap-7.0/modules-caixa org.jboss.as.server
[jboss7@sspdeapllx0041 jboss-eap-7.0]$
