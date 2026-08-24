
[root@caddeapllx2484 p585600]# grep -n "non-blocking-thread\|GlobalTransaction\|InfinispanLock\|DefaultLockManager" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/console-stdout.log | sed -n '132909,133997p'
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# grep -n "non-blocking-thread" /tmp/dump_recente.txt
165:"non-blocking-thread--p11-t4" #174 daemon prio=5 os_prio=0 tid=0x00005613c9df9000 nid=0x27a7 waiting on condition [0x00002afa020e8000]
207:"non-blocking-thread--p11-t3" #170 daemon prio=5 os_prio=0 tid=0x00005613c9501800 nid=0x27a3 waiting on condition [0x00002afa018e4000]
221:"non-blocking-thread--p11-t2" #169 daemon prio=5 os_prio=0 tid=0x00005613c84f7800 nid=0x27a1 waiting on condition [0x00002afa011e3000]
362:"non-blocking-thread--p11-t1" #153 daemon prio=5 os_prio=0 tid=0x00005613c457f800 nid=0x2790 waiting on condition [0x00002af9ff8d4000]
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# sed -n '128439,133997p' /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/console-stdout.log > /tmp/todos_ultimos_dumps.txt
[root@caddeapllx2484 p585600]# grep -n "non-blocking-thread" /tmp/todos_ultimos_dumps.txt | head -20
220:"non-blocking-thread--p11-t4" #174 daemon prio=5 os_prio=0 tid=0x00005613c9df9000 nid=0x27a7 waiting on condition [0x00002afa020e8000]
262:"non-blocking-thread--p11-t3" #170 daemon prio=5 os_prio=0 tid=0x00005613c9501800 nid=0x27a3 waiting on condition [0x00002afa018e4000]
276:"non-blocking-thread--p11-t2" #169 daemon prio=5 os_prio=0 tid=0x00005613c84f7800 nid=0x27a1 waiting on condition [0x00002afa011e3000]
417:"non-blocking-thread--p11-t1" #153 daemon prio=5 os_prio=0 tid=0x00005613c457f800 nid=0x2790 waiting on condition [0x00002af9ff8d4000]
1365:"non-blocking-thread--p11-t4" #174 daemon prio=5 os_prio=0 tid=0x00005613c9df9000 nid=0x27a7 waiting on condition [0x00002afa020e8000]
1407:"non-blocking-thread--p11-t3" #170 daemon prio=5 os_prio=0 tid=0x00005613c9501800 nid=0x27a3 waiting on condition [0x00002afa018e4000]
1421:"non-blocking-thread--p11-t2" #169 daemon prio=5 os_prio=0 tid=0x00005613c84f7800 nid=0x27a1 waiting on condition [0x00002afa011e3000]
1562:"non-blocking-thread--p11-t1" #153 daemon prio=5 os_prio=0 tid=0x00005613c457f800 nid=0x2790 waiting on condition [0x00002af9ff8d4000]
2455:"non-blocking-thread--p11-t4" #174 daemon prio=5 os_prio=0 tid=0x00005613c9df9000 nid=0x27a7 waiting on condition [0x00002afa020e8000]
2497:"non-blocking-thread--p11-t3" #170 daemon prio=5 os_prio=0 tid=0x00005613c9501800 nid=0x27a3 waiting on condition [0x00002afa018e4000]
2511:"non-blocking-thread--p11-t2" #169 daemon prio=5 os_prio=0 tid=0x00005613c84f7800 nid=0x27a1 waiting on condition [0x00002afa011e3000]
2652:"non-blocking-thread--p11-t1" #153 daemon prio=5 os_prio=0 tid=0x00005613c457f800 nid=0x2790 waiting on condition [0x00002af9ff8d4000]
3545:"non-blocking-thread--p11-t4" #174 daemon prio=5 os_prio=0 tid=0x00005613c9df9000 nid=0x27a7 waiting on condition [0x00002afa020e8000]
3587:"non-blocking-thread--p11-t3" #170 daemon prio=5 os_prio=0 tid=0x00005613c9501800 nid=0x27a3 waiting on condition [0x00002afa018e4000]
3601:"non-blocking-thread--p11-t2" #169 daemon prio=5 os_prio=0 tid=0x00005613c84f7800 nid=0x27a1 waiting on condition [0x00002afa011e3000]
3742:"non-blocking-thread--p11-t1" #153 daemon prio=5 os_prio=0 tid=0x00005613c457f800 nid=0x2790 waiting on condition [0x00002af9ff8d4000]
4635:"non-blocking-thread--p11-t4" #174 daemon prio=5 os_prio=0 tid=0x00005613c9df9000 nid=0x27a7 waiting on condition [0x00002afa020e8000]
4677:"non-blocking-thread--p11-t3" #170 daemon prio=5 os_prio=0 tid=0x00005613c9501800 nid=0x27a3 waiting on condition [0x00002afa018e4000]
4691:"non-blocking-thread--p11-t2" #169 daemon prio=5 os_prio=0 tid=0x00005613c84f7800 nid=0x27a1 waiting on condition [0x00002afa011e3000]
4832:"non-blocking-thread--p11-t1" #153 daemon prio=5 os_prio=0 tid=0x00005613c457f800 nid=0x2790 waiting on condition [0x00002af9ff8d4000]
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
