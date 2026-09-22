ls -la /opt/open/jboss/7.0.0/domain/servers/srjtqapllx0021_sifug_inter_8080/log/

tail -f /opt/open/jboss/7.0.0/domain/servers/srjtqapllx0021_sifug_inter_8080/log/server.log | grep -i "handshake\|certificate\|alert\|dataprev\|exception\|keystore"

ls -la /opt/open/jboss/7.0.0/domain/servers/srjtqapllx0021_sifug_inter_8080/log/*.log

grep -A 30 -i "*** ClientHello\|handshake" /opt/open/jboss/7.0.0/domain/servers/srjtqapllx0021_sifug_inter_8080/log/server.log | tail -100
