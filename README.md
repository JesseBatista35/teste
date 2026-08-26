cd /tmp/verificacao_sicmu2
cp -f /opt/jboss-eap/standalone/deployments/SICMU-ear.ear .
unzip -o -p SICMU-ear.ear META-INF/jboss-deployment-structure.xml | grep "psc.connector\|psc.jconnector"


unzip -o -p SICMU-ear.ear SICMU-web.war > SICMU-web.war
unzip -p SICMU-web.war WEB-INF/web.xml | grep -i "distributable"


grep -c "ModuleNotFoundException" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log

grep -i "NoClassDefFoundError\|ClassNotFoundException" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep -i "jconnector\|sisgr" | tail -10

tail -f /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep --line-buffered "ISPN000299\|ERROR\|SEVERE"
