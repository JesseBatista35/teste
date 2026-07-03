unzip -l /opt/jboss-eap/standalone/deployments/siarg.war | grep -iE "login\.xhtml|index\.xhtml|home\.xhtml"



jar tf /opt/jboss-eap/standalone/deployments/siarg.war | grep -iE "login\.xhtml|index\.xhtml|home\.xhtml"

jar tf /opt/jboss-eap/standalone/deployments/siarg.war | grep -v "WEB-INF/classes\|WEB-INF/lib" | head -50
