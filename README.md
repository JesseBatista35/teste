ssh p585600@10.116.97.79
sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE --line-buffered "ERROR|Exception|Caused by"


ssh p585600@10.116.78.12
sudo tail -f /logs/apache2/SIFEC-INTRANET/sifec1.des.caixa-access.log

