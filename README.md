
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]# grep "Heap:" /logs/jboss/jboss-eap/standalone/sigpd-backend/gc.log.*.current | tail -3 | grep -o "\->[0-9,]*M("
->372,5M(
->372,5M(
->373,0M(
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]# grep -c "Full GC" /logs/jboss/jboss-eap/standalone/sigpd-backend/gc.log.*.current
0
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
