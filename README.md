sudo sed -i 's/^VirtualHost \*:443>$/<VirtualHost *:443>/' /opt/httpd/conf.d/vhost.conf


sudo /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -t
