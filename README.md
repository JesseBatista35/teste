[jboss7@sspdeapllx0041 jboss-eap-7.0]$ grep -n -A 10 'name="sisag-lx0041"' /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml
147:        <server name="sisag-lx0041" group="sisag" auto-start="true">
148-            <jvm name="default" debug-enabled="false" env-classpath-ignored="false">
149-                <jvm-options>
150-                    <option value="-javaagent:/opt/azure/config/appinsights/applicationinsights-agent.jar"/>
151-                    <option value="-Dapplicationinsights.configuration.file=/opt/azure/config/appinsights/applicationinsights.json"/>
152-                    <option value="-Djava.net.useSystemProxies=false"/>
153-                    <option value="-Dhttp.proxyHost=proxydes.caixa"/>
154-                    <option value="-Dhttp.proxyPort=80"/>
155-                    <option value="-Dhttps.proxyHost=proxydes.caixa"/>
156-                    <option value="-Dhttps.proxyPort=80"/>
157-                    <option value="-Dhttp.nonProxyHosts=localhost|127.0.0.1|*.caixa|*.caixa.gov.br"/>
[jboss7@sspdeapllx0041 jboss-eap-7.0]$
