grep -A 1 "br.gov.caixa.psc.connector.util.Config" /opt/jboss-eap/standalone/configuration/standalone.xml

<property name="br.gov.caixa.psc.connector.util.Config" value="/opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties" />

ls -la /opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties

tail -f /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log

grep -i "jconnector" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | tail -30

curl -Ik https://servicossociais.des.corerj.caixa/LoginIntranetAction.do

