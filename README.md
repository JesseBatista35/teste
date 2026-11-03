ssh p585600@10.116.97.79
sudo grep -H "Registered web context: '/fec-web'" /opt/jboss/jboss-eap/hc/servers/*/log/server.log | tail -2


sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -viE "SECRET|PASSWORD|SENHA|API_KEY|TOKEN"

