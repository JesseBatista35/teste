grep -n "security-domain\|keycloak" /opt/jboss-eap/standalone/deployments/siamc-ear.ear -A2

grep -n "subsystem xmlns=\"urn:jboss:domain:security" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
grep -n "subsystem xmlns=\"urn:jboss:domain:keycloak" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml

