cp siavl.conf backup/siavl.conf.$(date +%Y%m%d).WO-CORS-fixo-v1
mv siavl.conf.NOVO siavl.conf
/opt/apache/jbcs-httpd24-2.4/httpd/sbin/apachectl configtest


/opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl-httpd.conf -k graceful

curl -ik -X OPTIONS https://agenciadigital.des.caixa:8002/siavl-web/index.html -H "Origin: https://exemplo.com" | grep -i "access-control"
