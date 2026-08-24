screen -S dump_monitor



tail -F /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | while read line; do
  if echo "$line" | grep -q "ISPN000299"; then
    echo "Erro detectado em $(date), gerando thread dump..."
    kill -3 9952
  fi
done
