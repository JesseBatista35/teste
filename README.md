tail -f /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep --line-buffered -E "ISPN000299|ERROR|SEVERE" > /tmp/teste_final.log &

cat /tmp/teste_final.log

