p585600@sspdeapllx0041 ~]$ grep -rn "server-group name.*sisag|server-group name.*sipdi" /opt/jboss/jboss-eap-7.0/domain/configuration/domain.xml /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml
[p585600@sspdeapllx0041 ~]$
[p585600@sspdeapllx0041 ~]$
[p585600@sspdeapllx0041 ~]$ find /opt/jboss/jboss-eap-7.0/domain/configuration -name "*.xml" -readable 2>/dev/null
/opt/jboss/jboss-eap-7.0/domain/configuration/host.xml
/opt/jboss/jboss-eap-7.0/domain/configuration/host-master.xml
/opt/jboss/jboss-eap-7.0/domain/configuration/host_xml_history/host.boot.xml
/opt/jboss/jboss-eap-7.0/domain/configuration/host_xml_history/host.initial.xml
/opt/jboss/jboss-eap-7.0/domain/configuration/host_xml_history/host.last.xml
/opt/jboss/jboss-eap-7.0/domain/configuration/domain.xml
/opt/jboss/jboss-eap-7.0/domain/configuration/host-slave.xml
[p585600@sspdeapllx0041 ~]$
[p585600@sspdeapllx0041 ~]$
[p585600@sspdeapllx0041 ~]$
[p585600@sspdeapllx0041 ~]$ find /opt/azure/config/appinsights/ -type f 2>/dev/null
/opt/azure/config/appinsights/applicationinsights.json.20210828
/opt/azure/config/appinsights/applicationinsights-agent-3.1.1.jar
/opt/azure/config/appinsights/applicationinsights-agent-3.3.1.jar
/opt/azure/config/appinsights/applicationinsights.json
/opt/azure/config/appinsights/applicationinsights.json.20221221
[p585600@sspdeapllx0041 ~]$
