
[p585600@sspdeapllx0040 ~]$ cp /opt/jboss/jboss-eap-7.0/domain/configuration/domain.xml /opt/jboss/jboss-eap-7.0/domain/configuration/domain.xml.bkp_$(date +%Y%m%d)
cp: cannot create regular file `/opt/jboss/jboss-eap-7.0/domain/configuration/domain.xml.bkp_20260527': Permission denied
[p585600@sspdeapllx0040 ~]$ sudo su jboss7

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

Senha SUDO:
[jboss7@sspdeapllx0040 p585600]$ cp /opt/jboss/jboss-eap-7.0/domain/configuration/domain.xml /opt/jboss/jboss-eap-7.0/domain/configuration/domain.xml.bkp_$(date +%Y%m%d)
[jboss7@sspdeapllx0040 p585600]$ python - << 'PYEOF'
> content = open("/opt/jboss/jboss-eap-7.0/domain/configuration/domain.xml", "r").read()
> old = '        <server-group name="sisag" profile="sisag" management-subsystem-endpoint="false">\n            <jvm name="sisag">\n                <heap size="256m" max-size="256m"/>\n            </jvm>'
> new = '        <server-group name="sisag" profile="sisag" management-subsystem-endpoint="false">\n            <jvm name="sisag">\n                <heap size="256m" max-size="256m"/>\n                <jvm-options>\n                    <option value="-javaagent:/opt/azure/config/appinsights/applicationinsights-agent.jar"/>\n                    <option value="-Dapplicationinsights.configuration.file=/opt/azure/config/appinsights/applicationinsights.json"/>\n                    <option value="-Djava.net.useSystemProxies=false"/>\n                    <option value="-Dhttp.proxyHost=proxydes.caixa"/>\n                    <option value="-Dhttp.proxyPort=80"/>\n                    <option value="-Dhttps.proxyHost=proxydes.caixa"/>\n                    <option value="-Dhttps.proxyPort=80"/>\n                    <option value="-Dhttp.nonProxyHosts=localhost|127.0.0.1|*.caixa|*.caixa.gov.br"/>\n                </jvm-options>\n            </jvm>'
> if old in content:
>     print("ENCONTRADO - aplicando alteracao...")
>     content = content.replace(old, new)
>     open("/opt/jboss/jboss-eap-7.0/domain/configuration/domain.xml", "w").write(content)
>     print("CONCLUIDO com sucesso")
> else:
>     print("ATENCAO: trecho nao encontrado - nenhuma alteracao feita")
> PYEOF
ENCONTRADO - aplicando alteracao...
CONCLUIDO com sucesso
[jboss7@sspdeapllx0040 p585600]$
