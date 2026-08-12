grep -A 150 "16:33:25,365" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep -i "Caused by" | head -20

grep -A 200 "16:33:25,365" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | tail -100
