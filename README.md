
[root@caddeapllx2484 verificacao_sicmu2]# kill -15 9952
[root@caddeapllx2484 verificacao_sicmu2]# ps -ef | grep 9952
root      2148     1  0 Ago24 ?        00:00:03 bash -c tail -F /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | while read line; do if echo "$line" | grep -q "ISPN000299"; then echo "Erro detectado em $(date), gerando thread dump..." >> /tmp/dump_monitor.log; kill -3 9952; fi; done
root      6808  5354  0 09:27 pts/1    00:00:00 grep --color=auto 9952
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
