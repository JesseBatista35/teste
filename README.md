for n in 02 03 04 05; do
  dir=/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl${n}
  f=$dir/siavl${n}.conf
  cd "$dir"

  awk 'NR==45 {
    print "    <Location /siavl-web>"
    print "        Header always set Access-Control-Allow-Origin \"*\""
    print "        Header always set Access-Control-Allow-Methods \"GET, POST, PUT, DELETE, OPTIONS\""
    print "        Header always set Access-Control-Allow-Headers \"Accept, Content-Type, Authorization, Origin, X-Requested-With\""
    print "    </Location>"
    next
  }
  NR>=46 && NR<=52 { next }
  { print }
  ' "$f" > "${f}.NOVO"

  echo "=== diff $f ==="
  diff "$f" "${f}.NOVO"
done




for n in 02 03 04 05; do
  dir=/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl${n}
  f=$dir/siavl${n}.conf
  cd "$dir"
  cp "$f" "backup/siavl${n}.conf.$(date +%Y%m%d).WO-CORS-fixo-v1"
  \mv -f "${f}.NOVO" "$f"
done

/opt/apache/jbcs-httpd24-2.4/httpd/sbin/apachectl configtest



/opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl02-httpd.conf -k graceful
/opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl03-httpd.conf -k graceful
/opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl04-httpd.conf -k graceful
/opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl05-httpd.conf -k graceful
