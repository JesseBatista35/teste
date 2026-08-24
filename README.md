[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# kill 2146
[root@caddeapllx2484 p585600]# grep -n "Full thread dump" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/console-stdout.log | tail -5grep -n "Full thread dump" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/console-stdout.log | tail -5
tail: opção usada em um contexto inválido -- 5
[1]+  Terminado               nohup bash -c 'tail -F /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | while read line; do if echo "$line" | grep -q "ISPN000299"; then echo "Erro detectado em $(date), gerando thread dump..." >> /tmp/dump_monitor.log; kill -3 9952; fi; done' > /tmp/dump_monitor_output.log 2>&1
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# wc -l /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/console-stdout.log
133997 /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/console-stdout.log
[root@caddeapllx2484 p585600]#
