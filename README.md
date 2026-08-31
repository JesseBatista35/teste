/opt/apache/jbcs-httpd24-2.4/httpd/sbin/apachectl configtest


grep -n -A 5 "<Location /siavl-web>" /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl/siavl.conf


/opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl-httpd.conf -S 2>&1 | grep -i 8002

ps aux | grep "siavl-httpd" | grep -v inter
