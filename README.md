for n in 02 03 04 05; do
  dir=/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl${n}
  f=$dir/siavl${n}.conf
  cd "$dir"
  cp "$f" "backup/siavl${n}.conf.$(date +%Y%m%d).WO0000081522583-v2"
  mv "${f}.NOVO" "$f"
  echo "=== configtest ${f} ==="
done

/opt/apache/jbcs-httpd24-2.4/httpd/sbin/apachectl configtest


grep -n -B 2 -A 2 "REQUEST_METHOD} =OPTIONS" siavl02/siavl02.conf
