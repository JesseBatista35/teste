for n in 02 03 04 05; do
  dir=/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl${n}
  f=$dir/siavl${n}.conf
  cd "$dir"

  awk 'NR==45 {
    print "    <Location /siavl-web>"
    print "        Header unset Access-Control-Allow-Origin"
    print "        Header unset Access-Control-Allow-Methods"
    print "        Header unset Access-Control-Allow-Headers"
    print ""
    print "        Header always unset Access-Control-Allow-Origin"
    print "        Header always unset Access-Control-Allow-Methods"
    print "        Header always unset Access-Control-Allow-Headers"
    print ""
    print "        Header always set Access-Control-Allow-Origin \"*\""
    print "        Header always set Access-Control-Allow-Methods \"GET, POST, PUT, DELETE, OPTIONS\""
    print "        Header always set Access-Control-Allow-Headers \"Accept, Content-Type, Authorization, Origin, X-Requested-With\""
    print "    </Location>"
    next
  }
  NR>=46 && NR<=49 { next }
  { print }
  ' "$f" > "${f}.NOVO"

  echo "=== diff $f ==="
  diff "$f" "${f}.NOVO"
done
