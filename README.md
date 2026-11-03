sudo grep -n "migracaosifec" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -20


ssh p585600@10.116.78.12
sudo grep -rn -i "migracaosifec" /opt/httpd/conf /opt/httpd/conf.d 2>/dev/null

sudo grep -nE "ServerName|ErrorLog|CustomLog|ProxyPass|BalancerMember" <arquivo-que-apareceu>

sudo tail -f <caminho-do-CustomLog>
