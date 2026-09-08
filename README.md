tail -100 /logs/httpd/siarg-interno.caixa-error.log


cat /opt/httpd/conf/httpd.conf | grep -i -E "include|listen"
find /opt/httpd/conf -iname "*vhost*"

