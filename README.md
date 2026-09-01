/opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl-httpd.conf -k start
ps aux | grep "siavl-httpd" | grep -v inter | grep -v siavl0


curl -ik -X GET "https://agenciadigital.des.caixa:8002/siavl-web/rs/sec/galeriaImagem/buscaArquivoPorIdMsg/9756" -H "Origin: https://plataforma-des.caixa" | grep -i "access-control-allow-origin"


ps aux | grep httpd | grep "\-k start" | awk '{print $NF, $(NF-6)}' | sort -u
