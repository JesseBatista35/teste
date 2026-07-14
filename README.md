tail -200 /logs/jboss-eap/hc/servers/siouv_node1_lx0002/server.log | grep -iE "refused|exception|error|oracle"


grep -n "Listener refused" /logs/jboss-eap/hc/servers/siouv_node1_lx0002/server.log | tail -5

nc -zv oracle-nprd-1000.caixa 1521
