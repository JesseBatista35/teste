for n in 02 03 04 05; do
  dir=/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl${n}
  f=$dir/siavl${n}.conf
  cd "$dir"
  cp "$f" "backup/siavl${n}.conf.$(date +%Y%m%d).WO-CORS-unset-v1"
  \mv -f "${f}.NOVO" "$f"
done

/opt/apache/jbcs-httpd24-2.4/httpd/sbin/apachectl configtest


/opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl02-httpd.conf -k graceful
/opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl03-httpd.conf -k graceful
/opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl04-httpd.conf -k graceful
/opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl05-httpd.conf -k graceful



ps aux | grep -E "siavl02-httpd|siavl03-httpd|siavl04-httpd|siavl05-httpd" | grep -v inter


curl -ik -X GET "https://agenciadigital4.des.caixa:8025/siavl-web/rs/sec/galeriaImagem/buscaArquivoPorIdMsg/9756" -H "Origin: https://plataforma-des.caixa" | grep -i "access-control-allow-origin"
