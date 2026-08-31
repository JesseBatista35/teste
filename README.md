type mv
alias | grep -i mv
lsattr siavl.conf
which incrontab 2>/dev/null && incrontab -l 2>/dev/null
ps aux | grep -i inotify


awk 'NR==56 {
  print "    <Location /siavl-web>"
  print "        Header always set Access-Control-Allow-Origin \"*\""
  print "        Header always set Access-Control-Allow-Methods \"GET, POST, PUT, DELETE, OPTIONS\""
  print "        Header always set Access-Control-Allow-Headers \"Accept, Content-Type, Authorization, Origin, X-Requested-With\""
  print "    </Location>"
  next
}
NR>=57 && NR<=63 { next }
{ print }
' siavl.conf > siavl.conf.NOVO

mv -v siavl.conf.NOVO siavl.conf
stat siavl.conf
grep -n -A 5 "<Location /siavl-web>" siavl.conf
