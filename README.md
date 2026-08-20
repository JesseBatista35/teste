grep -n -B5 "WFLYSRV0022" /logs/jboss/jboss-eap/standalone/siatd-intranet-vm/server.log | head -100

grep -n -E "Caused by|Exception|OutOfMemory|ERROR" /logs/jboss/jboss-eap/standalone/siatd-intranet-vm/server.log | head -50

