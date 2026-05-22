echo "==MOD_JK CONF==" && \
cat /opt/jbcs-httpd24-2.4/httpd/conf.d/mod_jk.conf.sample && \
echo "==WORKERS==" && \
cat /opt/jbcs-httpd24-2.4/httpd/conf.d/workers.properties.sample && \
echo "==ARQUIVOS ATIVOS JK==" && \
find /opt/jbcs-httpd24-2.4/httpd/ -name "workers.properties" -o -name "uriworkermap.properties" 2>/dev/null && \
echo "==MODULOS CARREGADOS==" && \
/opt/jbcs-httpd24-2.4/httpd/sbin/apachectl -M 2>/dev/null | grep -i "jk\|cluster\|proxy"
