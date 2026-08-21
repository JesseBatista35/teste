grep -i -E "sincad|b3|keystore|cert|senha|password" /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/sinac-siarq.properties

keytool -list -v -storetype PKCS12 -keystore /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12 -storepass changeit 2>&1 | grep -A2 "Valid from\|Owner\|Alias"

keytool -list -v -storetype PKCS12 -keystore /opt/keystore/s-4570-5_CERT.p12 -storepass changeit 2>&1 | grep -A2 "Valid from\|Owner\|Alias"
ls -la /opt/keystore/

file /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/siran/keystore
