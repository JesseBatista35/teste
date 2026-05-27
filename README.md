sudo -u jboss7 python - << 'PYEOF'
content = open("/opt/jboss/jboss-eap-7.0/domain/configuration/host.xml", "r").read()
old = '            <jvm name="default" debug-enabled="false" env-classpath-ignored="false">\n                <environment-variables>\n                    <variable name="APPLICATIONINSIGHTS_ROLE_INSTANCE" value="${env.HOSTNAME}_sisag-lx0041"/>\n                </environment-variables>\n            </jvm>'
new = '            <jvm name="default" debug-enabled="false" env-classpath-ignored="false">\n                <jvm-options>\n                    <option value="-javaagent:/opt/azure/config/appinsights/applicationinsights-agent.jar"/>\n                    <option value="-Dapplicationinsights.configuration.file=/opt/azure/config/appinsights/applicationinsights.json"/>\n                    <option value="-Djava.net.useSystemProxies=false"/>\n                    <option value="-Dhttp.proxyHost=proxydes.caixa"/>\n                    <option value="-Dhttp.proxyPort=80"/>\n                    <option value="-Dhttps.proxyHost=proxydes.caixa"/>\n                    <option value="-Dhttps.proxyPort=80"/>\n                    <option value="-Dhttp.nonProxyHosts=localhost|127.0.0.1|*.caixa|*.caixa.gov.br"/>\n                </jvm-options>\n                <environment-variables>\n                    <variable name="APPLICATIONINSIGHTS_ROLE_INSTANCE" value="${env.HOSTNAME}_sisag-lx0041"/>\n                </environment-variables>\n            </jvm>'
if old in content:
    print("ENCONTRADO - aplicando alteracao...")
    content = content.replace(old, new)
    open("/opt/jboss/jboss-eap-7.0/domain/configuration/host.xml", "w").write(content)
    print("CONCLUIDO com sucesso")
else:
    print("ATENCAO: trecho nao encontrado - nenhuma alteracao feita")
PYEOF
