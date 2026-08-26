grep -B 3 "ModuleNotFoundException" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep "^2026" | tail -5


tail -f /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep --line-buffered -E "ISPN000299|ERROR|SEVERE"
