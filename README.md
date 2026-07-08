grep -na 'security-domain\|keycloak' /opt/jboss-eap/standalone/deployments/siamc-ear.ear


mkdir -p /tmp/ear_check
cd /tmp/ear_check
unzip -o /opt/jboss-eap/standalone/deployments/siamc-ear.ear -d ear_extracted
unzip -o ear_extracted/siamc-web-3.0.0-SNAPSHOT.war -d war_extracted
grep -rn 'security-domain\|keycloak' war_extracted/WEB-INF/
ls war_extracted/WEB-INF/ | grep -i keycloak
cat war_extracted/WEB-INF/keycloak.json 2>/dev/null
cat war_extracted/WEB-INF/jboss-web.xml 2>/dev/null

**grep -n 'subsystem xmlns=.urn:jboss:domain:security' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml**

grep -n 'subsystem xmlns=.urn:jboss:domain:keycloak' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml


grep -n 'subsystem xmlns=.urn:jboss:domain:elytron' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
