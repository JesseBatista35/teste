
tail -n 300 /opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_acessoseguro_intra_5500/log/server.log

tail -n 300 /opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_webservice_intra_5502/log/server.log

grep -i -A5 -B5 "siset" /opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_acessoseguro_intra_5500/log/server.log | tail -n 100

curl -vk --max-time 10 https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
