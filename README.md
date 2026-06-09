✅ AGORA VAMOS REINICIAR:
Execute como root:
bashsu - jboss -c "cd /opt/jboss/jboss-eap && nohup ./bin/domain.sh --host-config=host-slave.xml -b 10.116.94.206 -bmanagement 10.116.94.206 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.server.log.dir=/logs/jboss-eap/servers -c domain.xml > /tmp/jboss-restart.log 2>&1 &"
Espere 30-40 segundos (é importante!)
Depois execute:
bashps aux | grep java | grep -v grep
Se houver processos Java, execute:
bashtail -100 /opt/jboss/jboss-eap/hc/log/servers/siosp_node1_lx099/server.log
Procure por "Server started" ou "Servidor iniciado" ✅

Execute o comando de reinício agora!
