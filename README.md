grep -B 5 -A 30 "SICMU-ear" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep -A 30 "ERROR\|SEVERE" | tail -60

grep -i "error\|exception\|failed" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | tail -30
