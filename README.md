cp /opt/jboss/jboss-eap-7.0/domain/configuration/domain.xml /opt/jboss/jboss-eap-7.0/domain/configuration/domain.xml.bkp_$(date +%Y%m%d)


python - << 'PYEOF'
content = open("/opt/jboss/jboss-eap-7.0/domain/configuration/domain.xml", "r").read()
old = '        <server-group name="sisag" profile="sisag" management-subsystem-endpoint="false">\n            <jvm name="sisag">\n                <heap size="256m" max-size="256m"/>\n            </jvm>'
new = '        <server-group name="sisag" profile="sisag" management-subsystem-endpoint="false">\n            <jvm name="sisag">\n                <heap size="256m" max-size="256m"/>\n                <jvm-options>\n                    <option value="-javaagent:/opt/azure/config/appinsights/applicationinsights-agent.jar"/>\n                    <option value="-Dapplicationinsights.configuration.file=/opt/azure/config/appinsights/applicationinsights.json"/>\n                    <option value="-Djava.net.useSystemProxies=false"/>\n                    <option value="-Dhttp.proxyHost=proxydes.caixa"/>\n                    <option value="-Dhttp.proxyPort=80"/>\n                    <option value="-Dhttps.proxyHost=proxydes.caixa"/>\n                    <option value="-Dhttps.proxyPort=80"/>\n                    <option value="-Dhttp.nonProxyHosts=localhost|127.0.0.1|*.caixa|*.caixa.gov.br"/>\n                </jvm-options>\n            </jvm>'
if old in content:
    print("ENCONTRADO - aplicando alteracao...")
    content = content.replace(old, new)
    open("/opt/jboss/jboss-eap-7.0/domain/configuration/domain.xml", "w").write(content)
    print("CONCLUIDO com sucesso")
else:
    print("ATENCAO: trecho nao encontrado - nenhuma alteracao feita")
PYEOF
