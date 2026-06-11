tem configuração do SSL:
bashls /opt/httpd/conf.d/old/
bashgrep -r "VirtualHost.*443\|ssl\|SSL" /opt/httpd/conf.d/ | head -20
bashgrep -r "443\|ssl\|SSL" /opt/httpd/conf/httpd.conf | grep -v "^#" | head -20
bashfind /opt/httpd -name "ssl*" -o -name "*ssl*" 2>/dev/null | head -10
