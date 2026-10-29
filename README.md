/usr/gnu/bin/grep -n -B10 -A30 "1793283639786" /log_ias/sirot2/sirot2-dsv08.log
/usr/gnu/bin/grep -n -B5 -A20 "1793283639786" /log_ias/ceflib/ceflib-dsv08.log

cat /opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca/cobrancaJar_jar/cefsirot2con.properties

ps -ef | grep -i sirot | grep -v grep
netstat -aun -P tcp | grep -i sirot
ls -ltr /log_ias/connector/ | tail

/usr/gnu/bin/grep -n -i -E "timeout|timed out|30000" /log_ias/sirot2/sirot2-dsv08.log | tail -30
