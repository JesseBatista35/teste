/opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect --controller=srjtqapllx0021:9990


/host=srjtqapllx0021/server-config=srjtqapllx0021_sifug_inter_8080/system-property=javax.net.debug:add(value=ssl)

/host=srjtqapllx0021/server-config=srjtqapllx0021_sifug_inter_8080:restart

exit
tail -f /opt/open/jboss/7.0.0/domain/servers/srjtqapllx0021_sifug_inter_8080/log/server.log | grep -i "alias\|handshake\|certificate\|dataprev\|keystore"

