find /opt/jboss-eap/standalone/deployments -iname "jboss-web.xml" 2>/dev/null
unzip -p /opt/jboss-eap/standalone/deployments/siamc-ear.ear siamc-web-3.0.0-SNAPSHOT.war | \
  jar tf /dev/stdin 2>/dev/null | grep -i jboss-web


  mkdir -p /tmp/siamc-check && cd /tmp/siamc-check
unzip -o /opt/jboss-eap/standalone/deployments/siamc-ear.ear -d ear_extract
unzip -o ear_extract/siamc-web-3.0.0-SNAPSHOT.war -d war_extract WEB-INF/jboss-web.xml WEB-INF/web.xml
cat war_extract/WEB-INF/jboss-web.xml

