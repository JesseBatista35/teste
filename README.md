ps aux | grep jboss-eap | grep -i standalone


cat /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml | grep -A 3 "java:jboss/datasources/simpg"


ls -la /opt/jboss-eap/standalone/deployments/ | grep postgresql


