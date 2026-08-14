cd /opt/jboss-eap/modules/system/layers/base/br/gov/caixa/sisgr/main/

cat module.xml

tail -100 /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log

grep -A 5 "NoClassDefFoundError" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | tail -30

tail -f /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log
