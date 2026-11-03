sudo grep "03/Nov/2026" /logs/apache2/SIFEC-INTRANET/sifec1.des.caixa-access.log > /tmp/migracaosifec-access.log
sudo tail -500 /logs/apache2/SIFEC-INTRANET/sifec1.des.caixa-error.log > /tmp/migracaosifec-error.log
wc -l /tmp/migracaosifec-*.log

sudo grep -nE -A25 "ERROR|Caused by" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -viE "SECRET|PASSWORD|SENHA|API_KEY|TOKEN|CLIENT_ID|Set-Cookie|Cookie=" > /tmp/migracaosifec-jboss-erros.log
