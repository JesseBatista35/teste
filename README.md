for n in 02 03 04 05; do
  echo "=== siavl${n}.conf ==="
  grep -n -A 8 "<Location /siavl-web>" /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl${n}/siavl${n}.conf
done
