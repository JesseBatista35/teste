unzip -l /opt/jboss-eap/modules/system/layers/base/br/gov/caixa/psc/jconnector/main/jconnector-2.10.jar | grep -i properties

cat /opt/jboss-eap/modules/system/layers/base/br/gov/caixa/psc/jconnector/main/module.xml

grep -i "jconnector" -A 3 -B 3 /opt/jboss-eap/standalone/configuration/standalone.xml

find /opt/jboss-eap/standalone/deployments -iname "*jconnector*" 2>/dev/null

