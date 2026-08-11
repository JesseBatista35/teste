tail -n 1000 /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log > /tmp/server_reduzido.log


grep -E "ERROR|WARN|Exception" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log > /tmp/server_erros.log

