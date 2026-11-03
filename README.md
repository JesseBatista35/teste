sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE --line-buffered "sifec-2|Deployed|ERROR|Registered web context"

grep -nE "ERROR|Registered web context|WFLYSRV0010|WFLYSRV0016" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | awk -F: '$1>0' | tail -20
