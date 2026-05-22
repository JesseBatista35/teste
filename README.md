cat /opt/jbcs-httpd24-2.4/httpd/conf.d/mod_cluster.conf 2>/dev/null || \
find /opt/jbcs-httpd24-2.4/httpd/conf.d/ -name "*cluster*" -o -name "*modcluster*" -o -name "*mod_cluster*" 2>/dev/null && \
echo "==TODOS CONF.D==" && \
ls /opt/jbcs-httpd24-2.4/httpd/conf.d/
