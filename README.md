grep -B3 "Listener refused" /logs/jboss-eap/hc/servers/siouv_node1_lx0002/server.log | grep -E "^2026-07-13 1[45]:" | tail -10

grep -n "Listener refused" /logs/jboss-eap/hc/servers/siouv_node1_lx0002/server.log | tail -5

/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.88.30:9990 --command="reload"
