[jboss7@sspdeapllx0040 p585600]$ grep -n -A 15 'server-group name="sisag"' /opt/jboss/jboss-eap-7.0/domain/configuration/domain.xml
7461:        <server-group name="sisag" profile="sisag" management-subsystem-endpoint="false">
7462-            <jvm name="sisag">
7463-                <heap size="256m" max-size="256m"/>
7464-                <jvm-options>
7465-                    <option value="-javaagent:/opt/azure/config/appinsights/applicationinsights-agent.jar"/>
7466-                    <option value="-Dapplicationinsights.configuration.file=/opt/azure/config/appinsights/applicationinsights.json"/>
7467-                    <option value="-Djava.net.useSystemProxies=false"/>
7468-                    <option value="-Dhttp.proxyHost=proxydes.caixa"/>
7469-                    <option value="-Dhttp.proxyPort=80"/>
7470-                    <option value="-Dhttps.proxyHost=proxydes.caixa"/>
7471-                    <option value="-Dhttps.proxyPort=80"/>
7472-                    <option value="-Dhttp.nonProxyHosts=localhost|127.0.0.1|*.caixa|*.caixa.gov.br"/>
7473-                </jvm-options>
7474-            </jvm>
7475-            <socket-binding-group ref="cef-full-ha-sockets" port-offset="0"/>
7476-            <deployments>
[jboss7@sspdeapllx0040 p585600]$
