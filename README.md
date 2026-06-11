sistemas estão configurados para ter o modelo correto com SSL:
bashfind /opt/httpd/conf.d/old -name "ssl.conf.disabled" | xargs grep -A 30 "VirtualHost.*443" | head -50
bash# Ver se tem outro vhost.conf de outro sistema na máquina como referência
find /opt/httpd -name "vhost*" 2>/dev/null



find /opt/httpd/conf -name "*.crt" -o -name "*.pem" -o -name "*.key" 2>/dev/null
