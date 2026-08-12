ls -la /opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties


tail -f /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log

grep -i "jconnector\|JConnectorConfigException\|JConnectorException" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep -iv "WFLYSRV0018"


