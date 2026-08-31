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
' siavl.conf > siavl.conf.NOVO

diff siavl.conf siavl.conf.NOVO


cp siavl.conf backup/siavl.conf.$(date +%Y%m%d).WO0000081522583-v2
mv siavl.conf.NOVO siavl.conf
/opt/apache/jbcs-httpd24-2.4/httpd/sbin/apachectl configtest
