# No servidor 10.116.181.172, abrir a porta:
sudo firewall-cmd --add-port=443/tcp --permanent
sudo firewall-cmd --reload

# Ou se usar iptables:
sudo iptables -A INPUT -p tcp --dport 443 -j ACCEPT
sudo iptables-save
