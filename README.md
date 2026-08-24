nohup bash -c 'tail -F /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | while read line; do if echo "$line" | grep -q "ISPN000299"; then echo "Erro detectado em $(date), gerando thread dump..." >> /tmp/dump_monitor.log; kill -3 9952; fi; done' > /tmp/dump_monitor_output.log 2>&1 &

ps -ef | grep "tail -F"
