/opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl04-httpd.conf -k start
ps aux | grep "siavl04-httpd" | grep -v inter
