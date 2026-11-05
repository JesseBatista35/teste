/profile=full-ha-sifec-intranet/subsystem=datasources/data-source=*:read-attribute(name=connection-url)
/profile=full-ha-sifec-intranet/subsystem=datasources/xa-data-source=*:read-attribute(name=driver-name)


sudo sed -n '5480,5568p' /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "URI=|task-3"

sudo sed -n '5400,5568p' /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "URI=|task-3"
