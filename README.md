O log real está em outro lugar, já sabemos disso. Vamos direto verificar o estado atual:
bashtail -50 /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep -E "ERROR|FAILED|Exception|Caused by|WFLY"
bashps aux | grep jboss | grep java | grep -o "log.dir=[^ ]*"
E ver se o TCPPING foi corrigido de fato no arquivo que está na máquina:
bashgrep -A 5 "TCPPING" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
