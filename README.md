tail -30 /logs/jboss/jboss-eap/standalone/siarg-interno/server.log



find / -iname "*.war" 2>/dev/null | grep -v "\.tmp\|backup"
cat /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml | grep -A3 -i "deployment-scanner"
