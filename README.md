/server-group=sifec-intranet:reload-servers(blocking=true)

sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE --line-buffered "WFLYSRV0025|WFLYSRV0010|ERROR"

sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE --line-buffered "WFLYSRV0025|WFLYSRV0010|ERROR"

/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)
