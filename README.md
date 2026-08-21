grep "$(date +%Y-%m-%d)" /opt/open/jboss/7.0.0/domain/servers/srjdeapllx158_sifpp_intra_8081/log/server.log | grep -iE "ERROR|WFLYSRV0025|deployed"
