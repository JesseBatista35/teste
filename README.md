cp /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml.bkp_$(date +%Y%m%d_%H%M%S)
}
sed -i 's|<server name="sisag-lx0041" group="sisag" auto-start="true">\n            <socket-bindings|<server name="sisag-lx0041" group="sisag" auto-start="true">\n            <jvm name="default" debug-enabled="false" env-classpath-ignored="false">\n                <environment-variables>\n                    <variable name="APPLICATIONINSIGHTS_ROLE_INSTANCE" value="${env.HOSTNAME}_sisag-lx0041"/>\n                </environment-variables>\n            </jvm>\n            <socket-bindings|' /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml


ls -la /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml
