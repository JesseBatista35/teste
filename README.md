echo "==MODULOS CARREGADOS==" && \
/opt/jbcs-httpd24-2.4/httpd/sbin/apachectl -M 2>/dev/null && \
echo "==CONF.D==" && \
ls -la /opt/jbcs-httpd24-2.4/httpd/conf.d/
