sudo grep -nE "ERROR|Exception" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -viE "sifec-ccr-pj|SECRET|PASSWORD|SENHA|API_KEY|TOKEN" | tail -30


sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE --line-buffered "ERROR|Exception|Caused by|status=5"

sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE --line-buffered "ERROR|Exception|Caused by|status=5"

sudo tail -f /opt/httpd/logs/error_log /opt/httpd/logs/access_log
