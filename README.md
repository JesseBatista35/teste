ps -ef | grep "Server:srjdeapllx158_sifpp_intra_8081" | grep -v grep

/opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect controller=srjdeapllx158:9990

tail -100 /opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081/log/server.log
