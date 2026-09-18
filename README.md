grep -i modcluster /logs/jboss-eap/hc/servers/sicem_node1_lx0005/server.log | tail -n 40

curl -s http://10.116.84.136:6666/mod_cluster-manager | grep -i sicem
curl -s http://10.116.84.137:6666/mod_cluster-manager | grep -i sicem

