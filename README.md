 ls -la /opt/jboss-eap/standalone/deployments/
md5sum /opt/jboss-eap/standalone/deployments/siarg.war


curl -k -v https://siarg-interno.esteiras.des.caixa/siarg/login
tail -f /logs/jboss/jboss-eap/standalone/siarg-interno/server.log
