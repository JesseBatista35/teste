cd /tmp/checkver_$$
rm -rf ear_extracted
unzip -o /opt/jboss-eap/standalone/deployments/sisme-ear.ear -d ear_extracted | grep -E "\.war|\.jar" | grep -iE "sisme-web|sisme-api|sisme-ejb"



ls -la /opt/jboss-eap/standalone/deployments/sisme-ear.ear*


