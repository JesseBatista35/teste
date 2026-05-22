echo "==URIWORKERMAP ATIVO==" && \
find /opt/jbcs-httpd24-2.4/httpd/ -name "uriworkermap*" 2>/dev/null && \
echo "==WORKERS ATIVO==" && \
find /opt/jbcs-httpd24-2.4/httpd/ -name "workers*" 2>/dev/null && \
echo "==CONF.D COMPLETO==" && \
ls -la /opt/jbcs-httpd24-2.4/httpd/conf.d/ && \
echo "==MODULOS ATIVOS==" && \
/opt/jbcs-httpd24-2.4/httpd/sbin/apachectl -M 2>/dev/null | grep -i "jk\|proxy\|cluster"
