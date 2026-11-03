grep -E "WFLYSRV0016|WFLYSRV0010|WFLYSRV0013" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -i "sifec-2" | tail -5


/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.97.59:9990


