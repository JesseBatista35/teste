# onde está o webapp /cobranca
grep -n -i -B2 -A2 "cobranca" /opt/SUNWweb/https-as8-dsv08/config/server.xml

# conexões de saída da JVM da dsv08 (o PID 2637 é o dono da 8008)
netstat -aun -P tcp | grep " 2637 " | egrep -v "LISTEN|\.8008 "

# o que a aplicação logou nos momentos das falhas (fora o ruído de SSL)
egrep -n "11:5[0-6]|11:4[5-9]" /opt/SUNWweb/https-as8-dsv08/logs/errors | grep -v CERTIFICATE_UNKNOWN
grep -n "1793283639786" /opt/SUNWweb/https-as8-dsv08/logs/errors

