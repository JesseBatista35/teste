
-sh-4.2$ cd /tmp/checkver_$$
-sh-4.2$ rm -rf ear_extracted
-sh-4.2$
-sh-4.2$
-sh-4.2$ unzip -o /opt/jboss-eap/standalone/deployments/sisme-ear.ear -d ear_extracted | grep -E "\.war|\.jar" | grep -iE "sisme-web|sisme-api|sisme-ejb"
  inflating: ear_extracted/sisme-web-2.93.2.0.war
  inflating: ear_extracted/lib/sisme-api-2.93.2.0.jar
  inflating: ear_extracted/sisme-ejb-2.93.2.0.jar
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -la /opt/jboss-eap/standalone/deployments/sisme-ear.ear*
-rwxrw-rw- 1 jboss jboss 83159033 Jul  2 19:46 /opt/jboss-eap/standalone/deployments/sisme-ear.ear
-rw-r--r-- 1 jboss jboss       13 Jul  2 19:46 /opt/jboss-eap/standalone/deployments/sisme-ear.ear.deployed
-sh-4.2$

