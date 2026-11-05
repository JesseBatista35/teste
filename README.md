sudo grep -n "ERRORCODE=4223" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -5

sudo sed -n '<linha-80>,<linha>p' /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "URI=|task-3"

