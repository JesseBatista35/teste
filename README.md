[jboss7@sspdeapllx0041 jboss-eap-7.0]$ python - << 'PYEOF'
> content = open("/opt/jboss/jboss-eap-7.0/domain/configuration/host.xml", "r").read()
> old = '            <jvm name="default" debug-enabled="false" env-classpath-ignored="false">\n                <environment-variables>\n                    <variable name="APPLICATIONINSIGHTS_ROLE_INSTANCE" value="${env.HOSTNAME}_sisag-lx0041"/>\n                </environment-variables>\n            </jvm>'
> new = '            <jvm name="default" debug-enabled="false" env-classpath-ignored="false">\n                <jvm-options>\n                    <option value="-javaagent:/opt/azure/config/appinsights/applicationinsights-agent.jar"/>\n                    <option value="-Dapplicationinsights.configuration.file=/opt/azure/config/appinsights/applicationinsights.json"/>\n                    <option value="-Djava.net.useSystemProxies=false"/>\n                    <option value="-Dhttp.proxyHost=proxydes.caixa"/>\n                    <option value="-Dhttp.proxyPort=80"/>\n                    <option value="-Dhttps.proxyHost=proxydes.caixa"/>\n                    <option value="-Dhttps.proxyPort=80"/>\n                    <option value="-Dhttp.nonProxyHosts=localhost|127.0.0.1|*.caixa|*.caixa.gov.br"/>\n                </jvm-options>\n                <environment-variables>\n                    <variable name="APPLICATIONINSIGHTS_ROLE_INSTANCE" value="${env.HOSTNAME}_sisag-lx0041"/>\n                </environment-variables>\n            </jvm>'
> if old in content:
>     print("ENCONTRADO - aplicando alteracao...")
>     content = content.replace(old, new)
>     open("/opt/jboss/jboss-eap-7.0/domain/configuration/host.xml", "w").write(content)
>     print("CONCLUIDO com sucesso")
> else:
>     print("ATENCAO: trecho nao encontrado - nenhuma alteracao feita")
> PYEOF
ENCONTRADO - aplicando alteracao...
CONCLUIDO com sucesso
[jboss7@sspdeapllx0041 jboss-eap-7.0]$
[jboss7@sspdeapllx0041 jboss-eap-7.0]$
[jboss7@sspdeapllx0041 jboss-eap-7.0]$
[jboss7@sspdeapllx0041 jboss-eap-7.0]$
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
[jboss7@sspdeapllx0041 jboss-eap-7.0]$ ps -ef |grep sisag-lx0041 | grep -v grep
jboss7    7706 11831 99 12:16 ?        00:00:24 /opt/jboss/jdk/bin/java -D[Server:sisag-lx0041] -Xms256m -Xmx256m -Dbr.com.bry.debug=assinador ws all -Dinstancias.list=nodelx0041[7606],nodelx0076[7606] -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djboss.as.management.blocking.timeout=600 -Djboss.home.dir=/opt/jboss/jboss-eap-7.0 -Djboss.modules.system.pkgs=org.jboss.byteman,com.sun.crypto.provider,com.wily,com.wily* -Djboss.server.log.dir=/opt/jboss/jboss-eap-7.0/domain/servers/sisag-lx0041/log -Djboss.server.temp.dir=/opt/jboss/jboss-eap-7.0/domain/servers/sisag-lx0041/tmp -Djboss.server.data.dir=/opt/jboss/jboss-eap-7.0/domain/servers/sisag-lx0041/data -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap-7.0/domain/servers/sisag-lx0041/log/server.log -Dlogging.configuration=file:/opt/jboss/jboss-eap-7.0/domain/configuration/default-server-logging.properties -jar /opt/jboss/jboss-eap-7.0/jboss-modules.jar -mp /opt/jboss/jboss-eap-7.0/modules:/opt/jboss/jboss-eap-7.0/modules-caixa org.jboss.as.server
[jboss7@sspdeapllx0041 jboss-eap-7.0]$

