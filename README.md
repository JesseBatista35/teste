exit
ssh p585600@10.116.97.79
sudo grep -nE -A25 "ERROR|Caused by" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -viE "SECRET|PASSWORD|SENHA|API_KEY|TOKEN|CLIENT_ID|Set-Cookie|Cookie=" > /tmp/migracaosifec-jboss-erros.log
wc -l /tmp/migracaosifec-jboss-erros.log
exit


