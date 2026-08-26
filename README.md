mkdir -p /tmp/verificacao_sicmu2
cd /tmp/verificacao_sicmu2
cp /opt/jboss-eap/standalone/deployments/SICMU-ear.ear .
unzip -p SICMU-ear.ear SICMU-web.war > SICMU-web.war


ls -la SICMU-web.war

unzip -p SICMU-web.war WEB-INF/web.xml | grep -i "distributable"


