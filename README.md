cd /tmp
cp /opt/jboss-eap/modules/system/layers/base/br/gov/caixa/psc/jconnector/main/jconnector-2.10.jar .
unzip -o jconnector-2.10.jar -d jconnector_extraido
find jconnector_extraido -name "*.class" | xargs -I{} sh -c 'strings {} | grep -i "jconnector.properties"' 2>/dev/null




grep -i "jconnector" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log



grep -i "jconnector" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep -i "error\|exception\|not found\|filenotfound"
