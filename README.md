echo "==TESTE CONFIG APACHE==" && \
/opt/jbcs-httpd24-2.4/httpd/sbin/apachectl configtest && \
echo "==RECARREGANDO APACHE==" && \
/opt/jbcs-httpd24-2.4/httpd/sbin/apachectl graceful && \
echo "==STATUS==" && \
/opt/jbcs-httpd24-2.4/httpd/sbin/apachectl status | head -20


sudo /opt/jbcs-httpd24-2.4/httpd/sbin/apachectl graceful
