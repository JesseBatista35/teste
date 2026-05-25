grep -rn "server-group name.*sisag\|server-group name.*sipdi" /opt/jboss/jboss-eap-7.0/domain/configuration/domain.xml /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml

find /opt/jboss/jboss-eap-7.0/domain/configuration -name "*.xml" -readable 2>/dev/null

find /opt/azure/config/appinsights/ -type f 2>/dev/null
