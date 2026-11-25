
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]# LOG=/logs/jboss/jboss-eap/standalone/sigec-portabilidade-batch/server.log
[root@caddeapllx2884 p585600]# N=$(grep -n "WFLYSRV0049" $LOG | tail -1 | cut -d: -f1)
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]# M=$(grep -n "WFLYSRV0026" $LOG | tail -1 | cut -d: -f1)
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]# sed -n "${N},${M}p" $LOG > /tmp/batch-boot.log
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]# cp /opt/jboss-eap/standalone/deployments/gec-ear.ear.failed /tmp/batch-gec-ear.failed.txt
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]# chmod 644 /tmp/batch-*
[root@caddeapllx2884 p585600]# ls -l /tmp/batch-*
-rw-r--r-- 1 root root 2306898 nov 25 17:24 /tmp/batch-boot-17h12.log
-rw-r--r-- 1 root root  383549 nov 25 17:27 /tmp/batch-boot.log
-rw-r--r-- 1 root root    6733 nov 25 17:27 /tmp/batch-gec-ear.failed.txt
[root@caddeapllx2884 p585600]#



caralho cade o log eu quero o log para mandar pra ele.. e me ajuda com a menssegme pora falar qual ewrro que ta dano
