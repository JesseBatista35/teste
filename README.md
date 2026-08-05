find / -name "standalone.xml" 2>/dev/null
grep -i "truststore\|keystore" /opt/jboss*/standalone/configuration/standalone.xml
