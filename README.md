ls -la /opt/jboss-eap/standalone/deployments/


md5sum /opt/jboss-eap/standalone/deployments/siarg.war

unzip -p /opt/jboss-eap/standalone/deployments/siarg.war WEB-INF/web.xml | grep -A3 "java.lang.Throwable"

tail -100 /logs/jboss/jboss-eap/standalone/siarg-interno/server.log

curl -k -v https://siarg-interno.esteiras.des.caixa/siarg/login

tail -80 /logs/jboss/jboss-eap/standalone/siarg-interno/server.log

