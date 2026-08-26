grep -i "NoClassDefFoundError\|ClassNotFoundException" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | tail -20

grep -c "ModuleNotFoundException" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log
