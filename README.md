ps aux | grep "siavl-httpd" | grep -v inter | grep -v siavl0

/opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl-httpd.conf -k start
