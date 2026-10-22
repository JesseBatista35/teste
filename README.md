cd /opt/apache/2.2/etc/conf.d/
ls -l | grep -iE "sigsj|workers"

# Para onde cada vhost do SIGSJ encaminha
grep -iE "Listen|VirtualHost|ServerName|JkMount|ProxyPass|BalancerMember" sigsj_*.conf

# Hosts/portas dos workers do SIGSJ
grep -iE "sigsj" workers.properties
grep -iE "sigsj" workers.properties | grep -oE "worker\.[^.]+" | sort -u | while read w; do grep -E "^$w\.(host|port|balance_workers)" workers.properties; done

# Logs do internet legado (nome real dos arquivos)
ls -lt /log_apache/2.2/sigsj_internet/ | head -5
