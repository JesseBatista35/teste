grep -A 40 "2026-08-24 10:5[5-7]" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep -i -B5 -A 40 "ERROR\|Exception"


tail -100 /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log

grep -c "ERROR" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log
