sudo /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -k restart



curl -vk https://sicmu-intranet-update.esteiras.des.caixa/sicmu 2>&1 | head -20
