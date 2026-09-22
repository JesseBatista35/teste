/opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect --controller=srjtqapllx0021:9990


/host=srjtqapllx0021/server-config=srjtqapllx0021_sifug_inter_8080/system-property=javax.net.debug:remove

/host=srjtqapllx0021/server-config=srjtqapllx0021_sifug_inter_8080:restart
exit

ps -ef | grep sifug_inter_8080 | grep -v grep | grep -o "javax.net.debug=ssl"

