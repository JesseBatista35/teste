exit
ssh p585600@10.116.97.79
sudo grep -nE -A25 "ERROR|Caused by" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -viE "SECRET|PASSWORD|SENHA|API_KEY|TOKEN|CLIENT_ID|Set-Cookie|Cookie=" > /tmp/migracaosifec-jboss-erros.log
wc -l /tmp/migracaosifec-jboss-erros.log
exit


scp p585600@10.116.78.12:/tmp/migracaosifec-*.log ~/
scp p585600@10.116.97.79:/tmp/migracaosifec-jboss-erros.log ~/
tar czf ~/logs_migracaosifec_03-11.tar.gz ~/migracaosifec-*.log
ls -lh ~/logs_migracaosifec_03-11.tar.gz
