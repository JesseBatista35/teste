grep -B2 -A2 "server-group\|server name=" /opt/jboss/jboss-eap/hc/configuration/host-slave.xml


tail -100 /logs/jboss-eap/hc/servers/siouv_node1_lx0002/server.log | grep -i "oracle\|orad01ng\|connect\|refused\|timeout"


