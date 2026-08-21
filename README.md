ls -la /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12

md5sum /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12 /opt/keystore/s-4570-5_CERT.p12

grep -r -i "00360305000104\|keystore\|s-4570" /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/ 2>/dev/null
