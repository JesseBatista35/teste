/usr/gnu/bin/grep -n -i -B2 -A2 "cobranca" /opt/SUNWweb/https-as8-dsv08/config/server.xml
# com o path do webapp:
/usr/gnu/bin/grep -rn -i -E "10\.116\.89\.101|9008|timeout" <path_do_webapp>/WEB-INF | head -30

getent hosts 10.116.89.101
for i in 1 2 3 4 5 6 7 8 9 10; do
  curl -sk -o /dev/null -w "%{http_code} conn=%{time_connect}s total=%{time_total}s\n" --max-time 60 http://10.116.89.101:9008/
done



ssh 10.116.89.101
netstat -aun -P tcp | grep "\.9008 " | grep LISTEN     # quem é o dono da 9008
ps -ef | grep <PID>                                    # instância (AS8? outro webservd?)

egrep -n "11:5[0-6]" <logs>/errors <logs>/server.log 2>/dev/null | head -50
/usr/gnu/bin/grep -rn "1793283639786" <logs>/ 2>/dev/null
