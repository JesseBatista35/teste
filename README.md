sudo sed -i 's/virtuallHost/VirtualHost/g' /opt/httpd/conf.d/vhost.conf



sudo /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -t
