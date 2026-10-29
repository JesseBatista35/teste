cd /opt/SUNWweb/https-as8-dsv08/config
egrep -n -i "passthrough|servers=|timeout|cobranca|NameTrans|ppath" obj.conf
egrep -n -i "port|8008|servername" server.xml magnus.conf 2>/dev/null

cd /opt/SUNWweb/https-as8-dsv08/logs
ls -ltr | tail
egrep -i "timed out|timeout|passthrough|error" errors | tail -50
grep -i "cobranca" access | tail -30

time curl -v --max-time 90 http://<host_as8>:<porta>/
