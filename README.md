grep -H "Registered web context: '/fec-web'" \
  /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log \
  /opt/jboss/jboss-eap/hc/servers/sifec-intranet2_node1_llx473/log/server.log | tail -2
