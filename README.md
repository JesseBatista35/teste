pfiles 28337 2>/dev/null | /usr/gnu/bin/grep -i "server.log"
# alternativa:
ls -l /proc/28337/path/ | grep -i log
pargs -l 28337

LOG=<path>/server.log
/usr/gnu/bin/grep -n -E "29/10|2026-10-29|Oct 29" $LOG | /usr/gnu/bin/grep -E "T?11:5[0-6]" | head -40
/usr/gnu/bin/grep -n -i -E "1793283639786|SocketTimeout|Read timed out" $LOG | tail -20

netstat -aun -P tcp | grep " 28337 " | egrep -v "LISTEN|\.9008 " | awk '{print $2, $NF}' | sort | uniq -c

prstat -p 28337 -L 1 1 | head -20     # threads

