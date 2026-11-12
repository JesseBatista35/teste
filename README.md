
-sh: ,: comando não encontrado
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$ sudo grep -nE "ERROR|Caused by" /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log | tail -30
[sudo] senha para p585600:
grep: /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log: arquivo binário coincide com o padrão
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$ sudo tail -n 5000 /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log > /tmp/siemp-server-log.txt && sudo chmod 644 /tmp/siemp-server-log.txt && ls -lh /tmp/siemp-server-log.txt
-rw-r--r-- 1 p585600 usucef 679K nov 12 15:25 /tmp/siemp-server-log.txt
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$




me das os comandos veio
