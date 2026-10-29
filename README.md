LOG=/opt/SUNWas8/nodeagents/naux0100/dsv08/logs/server.log
/usr/gnu/bin/grep -n -E "2026-10-29T11:(5[0-6])" $LOG | head -40
/usr/gnu/bin/grep -n -i -E "1793283639786|SocketTimeout|Read timed out" $LOG | tail -20

sed -n 'N,N+40p' $LOG

ls -ltr /log_ias/ | tail -30
ls -ltr /log_ias/*cob* /log_ias/*sigcb* 2>/dev/null
/usr/gnu/bin/grep -rln "1793283639786" /log_ias/ 2>/dev/null

cd /opt/SUNWas8/nodeagents/naux0100/dsv08/applications/j2ee-apps/cobranca
/usr/gnu/bin/grep -rn -i -E "timeout|url|host|porta|endpoint|jndi" --include="*.properties" --include="*.xml" . | /usr/gnu/bin/grep -v -i "dtd" | head -40

netstat -aun -P tcp | grep " 28337 " | egrep -v "LISTEN|\.9008 " | awk '{print $2, $(NF)}' | sort | uniq -c
