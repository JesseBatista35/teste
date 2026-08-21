cat /opt/jboss/jboss-4.2.3.GA-jdk6/bin/run.conf 2>/dev/null | grep -i -E "keystore|truststore|ssl"
ps -ef | grep sinac01 | grep -o -E "javax\.net\.ssl\.[a-zA-Z]*=[^ ]*"

find / -iname "*.jks" -o -iname "*.p12" -o -iname "*.pfx" -o -iname "*keystore*" -o -iname "*truststore*" 2>/dev/null | grep -v "^/opt/jboss/jdk"

keytool -list -v -keystore /caminho/do/arquivo -storepass changeit 2>&1 | grep -A2 "Valid from\|Owner"

find /opt/jboss/jboss-4.2.3.GA-jdk6 -iname "*.xml" -o -iname "*.properties" | xargs grep -l -i "sincad\|b3" 2>/dev/null
