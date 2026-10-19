
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]# L=/logs/jboss/jboss-eap/standalone/sigpd-backend
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]# grep -c "TrilhaAuditoria é NULL" $L/server.log
983
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]# grep -o "idsVencidos=\[[0-9]*\]" $L/server.log | sort | uniq -c
    379 idsVencidos=[1365]
    724 idsVencidos=[1451]
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]# grep -c "TrilhaAuditoria é NULL" $L/server.log.2026-10-17.1
1417
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]#
[root@caddeapllx929 ~]# grep "Heap:" $L/gc.log.*.current | tail -3
   [Eden: 511,0M(511,0M)->0,0B(519,0M) Survivors: 33,0M->29,0M Heap: 886,0M(1024,0M)->370,5M(1024,0M)]
   [Eden: 519,0M(519,0M)->0,0B(515,0M) Survivors: 29,0M->31,0M Heap: 889,5M(1024,0M)->372,5M(1024,0M)]
   [Eden: 515,0M(515,0M)->0,0B(515,0M) Survivors: 31,0M->31,0M Heap: 887,5M(1024,0M)->372,5M(1024,0M)]
[root@caddeapllx929 ~]#
