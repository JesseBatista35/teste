cat /opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_acessoseguro_intra_5500/data/logging.properties

find /infra_app -iname "*.log" -newer /opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_acessoseguro_intra_5500/log/server.log 2>/dev/null

find / -iname "*sisgr*.log" -mtime -7 2>/dev/null
