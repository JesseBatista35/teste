for n in 02 03 04 05; do
  dir=/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl${n}
  f=$dir/siavl${n}.conf
  cd "$dir"
  awk '
  { lines[NR] = $0 }
  /<Location \/siavl-web>/ && !locstart { locstart = NR }
  /<\/Location>/ && locstart && !locend { locend = NR }
  /RewriteCond %\{REQUEST_METHOD\} =OPTIONS/ && !optline { optline = NR }
  END {
    loc = ""
    for (i = locstart; i <= locend; i++) loc = loc lines[i] "\n"
    blankafter = (lines[locend+1] == "")
    for (i = 1; i <= NR; i++) {
      if (i >= locstart && i <= locend) continue
      if (blankafter && i == locend+1) continue
      if (i == optline) printf "%s", loc
      print lines[i]
    }
  }
  ' "$f" > "${f}.NOVO"
  echo "=== diff $f ==="
  diff "$f" "${f}.NOVO"
done
