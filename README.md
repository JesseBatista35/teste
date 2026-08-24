
/usr/bin/which: no screen in (/sbin:/bin:/usr/sbin:/usr/bin)
[root@caddeapllx2484 p585600]# nohup bash -c 'tail -F /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | while read line; do if echo "$line" | grep -q "ISPN000299"; then echo "Erro detectado em $(date), gerando thread dump..." >> /tmp/dump_monitor.log; kill -3 9952; fi; done' > /tmp/dump_monitor_output.log 2>&1 &
[1] 2146
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# ps -ef | grep "tail -F"
root      2146 28078  0 14:13 pts/1    00:00:00 bash -c tail -F /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | while read line; do if echo "$line" | grep -q "ISPN000299"; then echo "Erro detectado em $(date), gerando thread dump..." >> /tmp/dump_monitor.log; kill -3 9952; fi; done
root      2147  2146  0 14:13 pts/1    00:00:00 tail -F /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log
root      2148  2146  0 14:13 pts/1    00:00:00 bash -c tail -F /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | while read line; do if echo "$line" | grep -q "ISPN000299"; then echo "Erro detectado em $(date), gerando thread dump..." >> /tmp/dump_monitor.log; kill -3 9952; fi; done
root      2177 28078  0 14:14 pts/1    00:00:00 grep --color=auto tail -F
[root@caddeapllx2484 p585600]#
