cd /tmp/checkver_$$
pwd
ls -la


which unzip
unzip -o /opt/jboss-eap/standalone/deployments/sisme-ear.ear -d ear_extracted

which jar
jar tf /opt/jboss-eap/standalone/deployments/sisme-ear.ear | head -20

mkdir ear_extracted && cd ear_extracted
jar xf /opt/jboss-eap/standalone/deployments/sisme-ear.ear
ls -la
