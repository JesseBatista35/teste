grep -n -B 2 -A 2 "REQUEST_METHOD} =OPTIONS" /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl02/siavl02.conf

/opt/apache/jbcs-httpd24-2.4/httpd/sbin/apachectl configtest

for n in 02 03 04 05; do
  echo "=== siavl${n}.conf ==="
  grep -n -B 2 -A 2 "REQUEST_METHOD} =OPTIONS" /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl${n}/siavl${n}.conf
done

