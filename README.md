sudo /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -k restart
echo "Restart executado: $?"


ps aux | grep httpd | grep -v grep
