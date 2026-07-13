ps -ef | grep jboss
ls -la /opt/jboss*/standalone/configuration/standalone.xml 2>/dev/null
grep -i "datasource" -A 20 /opt/jboss*/standalone/configuration/standalone.xml | grep -i "connection-url\|jndi-name"
