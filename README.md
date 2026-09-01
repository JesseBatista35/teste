cp siavl.conf backup/siavl.conf.$(date +%Y%m%d).WO-CORS-unset-v1
\mv -f siavl.conf.NOVO siavl.conf
/opt/apache/jbcs-httpd24-2.4/httpd/sbin/apachectl configtest


/opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl-httpd.conf -k graceful


curl -ik -X GET "https://agenciadigital4.des.caixa:8025/siavl-web/rs/sec/galeriaImagem/buscaArquivoPorIdMsg/9756" -H "Origin: https://plataforma-des.caixa" | grep -i "access-control-allow-origin"
