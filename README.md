ps -ef | grep "Server:srjdeapllx158_sifpp_intra_8081" | grep -v grep | grep -o "DENDPOINT_MICRO=[^ ]*"

tail -50 /opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081/log/server.log

