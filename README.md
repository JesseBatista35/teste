
[root@sbrdeapllx105 p585600]#
[root@sbrdeapllx105 p585600]#
[root@sbrdeapllx105 p585600]# ps -ef | grep -i "java -D" | for i in `awk '{print $2}'`; do kill -9 $i;done
bash: kill: (11461) - Processo inexistente
[root@sbrdeapllx105 p585600]# ps -ef | grep jboss
root      11535  11222  0 16:29 pts/2    00:00:00 grep --color=auto jboss
[root@sbrdeapllx105 p585600]# ps -ef | grep java
root      11571  11222  0 16:29 pts/2    00:00:00 grep --color=auto java
[root@sbrdeapllx105 p585600]#
