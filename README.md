cat /opt/httpd/conf.d/vhost.conf


grep -B5 -A30 -i siarg /opt/httpd/conf/httpd.conf


tail -50 /logs/httpd/error_log

find /opt/httpd/modsecurity.d -iname "*log*"
