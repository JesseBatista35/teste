/opt/jboss-eap/standalone/deployments/siarg.war


unzip -p /opt/jboss-eap/standalone/deployments/siarg.war WEB-INF/web.xml

jar xf /opt/jboss-eap/standalone/deployments/siarg.war WEB-INF/web.xml -C /tmp/
cat /tmp/WEB-INF/web.xml


cd /tmp && cp /opt/jboss-eap/standalone/deployments/siarg.war . && unzip -o siarg.war -d siarg-extracted WEB-INF/web.xml WEB-INF/faces-config.xml 2>/dev/null
cat /tmp/siarg-extracted/WEB-INF/web.xml
