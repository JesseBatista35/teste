grep -i "truststore\|keystore" /opt/jboss/jboss-eap/standalone/configuration/standalone.xml

**grep -i "JAVA_HOME" /opt/jboss/jboss-eap/bin/standalone.conf
# ou
ps -ef | grep java | grep -i jboss**

find / -name "cacerts" 2>/dev/null
