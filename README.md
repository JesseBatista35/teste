wc -l /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
grep -c 'security-realm' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
grep -c 'urn:jboss:domain:keycloak' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
ls -l /opt/jboss-eap/standalone/configuration/ /opt/jboss-eap/standalone/deployments/
