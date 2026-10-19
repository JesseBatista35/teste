grep "Heap:" /logs/jboss/jboss-eap/standalone/sigpd-backend/gc.log.*.current | tail -3 | grep -o "\->[0-9,]*M(" 
grep -c "Full GC" /logs/jboss/jboss-eap/standalone/sigpd-backend/gc.log.*.current
