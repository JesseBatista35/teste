tail -f /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log

grep "16:33" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log

grep -B 2 -A 10 "16:3[0-9]" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep -i "error\|exception\|caused by"
