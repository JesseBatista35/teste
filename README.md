ls -la /opt/apache/jbcs-httpd24-2.4/httpd/logs/ | grep siavl04
tail -50 /opt/apache/jbcs-httpd24-2.4/httpd/logs/error_log 2>/dev/null
grep -i siavl04 /var/log/messages 2>/dev/null | tail -20


/opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl04-httpd.conf -k start
