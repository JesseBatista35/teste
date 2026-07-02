ls -la /opt/jboss-eap/standalone/deployments/SICMU-ear.ear
stat /opt/jboss-eap/standalone/deployments/SICMU-ear.ear

cd /tmp
cp /opt/jboss-eap/standalone/deployments/SICMU-ear.ear .
unzip -l SICMU-ear.ear | grep -i "SICMU-web"

unzip -p SICMU-ear.ear SICMU-web.war > SICMU-web.war
unzip -l SICMU-web.war | grep -i "vendor.js"
