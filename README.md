1. Ver os logs de erro:
bashsudo tail -300 /opt/jboss-eap/standalone/log/server.log | grep -E "ERROR|FAILED|Exception|Caused by" | tail -50
2. Ver os marcadores de falha dos deployments:
bashls /opt/jboss-eap/standalone/deployments/*.failed 2>/dev/null
3. Ver o conteúdo do marcador de falha:
bashcat /opt/jboss-eap/standalone/deployments/SICMU-ear.ear.failed
4. Checar o serviço:
bashsudo systemctl list-units | grep -iE "jboss|wildfly|eap"
