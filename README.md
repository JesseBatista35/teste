cat /opt/jboss-eap/standalone/configuration/standalone.xml | grep -A 10 -B 5 "postgresql"


tail -100 /opt/jboss-eap/standalone/log/server.log | grep -i "postgresql\|deployment\|error"


