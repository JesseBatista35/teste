ssh p585600@10.116.97.79
sudo grep -nE "workflow-credito|WFLYSRV0010|WFLYSRV0021|QuerySyntax|FECMail|jaas-sifec|Registered web context: '/workflow" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -20
