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
[p585600@sspdeapllx0041 ~]$
[p585600@sspdeapllx0041 ~]$
[p585600@sspdeapllx0041 ~]$
[p585600@sspdeapllx0041 ~]$ grep -n "sipdi\|javaagent\|jvm-options\|<jvm" /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml
103:    <jvms>
104:        <jvm name="default">
106:            <jvm-options>
110:            </jvm-options>
116:            <jvm name="default" debug-enabled="false" env-classpath-ignored="false">
162:        <server name="sipdi-lx0041" group="sipdi" auto-start="true">
163:            <jvm name="default" debug-enabled="false" env-classpath-ignored="false">
165:                    <variable name="APPLICATIONINSIGHTS_ROLE_INSTANCE" value="${env.HOSTNAME}_sipdi-lx0041"/>
[p585600@sspdeapllx0041 ~]$
