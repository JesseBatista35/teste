LOG=/logs/jboss/jboss-eap/standalone/simkt-backend-vm

# Data/hora do war em uso
ls -l --time-style=full-iso /opt/jboss-eap/standalone/deployments/

# Boot/deploy da tarde de 08/out
zgrep -E "WFLYSRV0010|WFLYSRV0013|WFLYSRV0016|WFLYSRV0025|WFLYSRV0050|WFLYSRV0049" $LOG/server.log.2026-10-08.gz

# O PermissionFilter existia antes? (se der 0, o filtro é novo)
zgrep -c "PermissionFilter" $LOG/server.log.2026-10-07.gz
zgrep -c "PermissionFilter" $LOG/server.log.2026-10-08.gz

# Primeiro erro registrado
zgrep -m1 "ErrorPageFilter" $LOG/server.log.2026-10-09.gz | cut -c1-200
