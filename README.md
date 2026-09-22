# 1. Achar o PID atual do processo do SIFUG
ps -ef | grep sifug_inter_8080 | grep -v grep

# 2. Ver pra onde o stdout (fd 1) desse processo está apontando
ls -la /proc/<PID>/fd/1


tail -100 /opt/open/jboss/7.0.0/domain/log/host-controller.log | grep -i "ssl\|handshake\|dataprev"

head -20 /opt/open/jboss/7.0.0/domain/servers/srjtqapllx0021_sifug_inter_8080/log/server.log
tail -20 /opt/open/jboss/7.0.0/domain/servers/srjtqapllx0021_sifug_inter_8080/log/server.log
