configurado mas bloqueando o acesso. Vamos ver:
bashfind /opt/httpd -name "*.conf" | xargs grep -l "sicmu-intranet-update" 2>/dev/null
bashcat /opt/httpd/conf/httpd.conf | grep -i "include\|vhost\|sicmu"
bashls /opt/httpd/conf.d/
