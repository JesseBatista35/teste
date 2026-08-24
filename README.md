grep -n "non-blocking-thread\|GlobalTransaction\|InfinispanLock\|DefaultLockManager" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/console-stdout.log | sed -n '132909,133997p'



grep -n "non-blocking-thread" /tmp/dump_recente.txt

sed -n '128439,133997p' /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/console-stdout.log > /tmp/todos_ultimos_dumps.txt
grep -n "non-blocking-thread" /tmp/todos_ultimos_dumps.txt | head -20
