@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# sed -n '14,$p' /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/console-stdout.log > /tmp/dump_completo.txt
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# wc -l /tmp/dump_completo.txt
1032 /tmp/dump_completo.txt
[root@caddeapllx2484 p585600]# grep -n "^\"default task\|BLOCKED\|jcicsdirect\|Infinispan\|SessionCreation\|GlobalTransaction" /tmp/dump_completo.txt
33:"default task-50" #13832 prio=5 os_prio=0 tid=0x00005613c548b800 nid=0x65a9 waiting on condition [0x00002afa00ee2000]
42:"default task-39" #13819 prio=5 os_prio=0 tid=0x00005613c9d7c800 nid=0x6565 waiting on condition [0x00002af9f1a63000]
[root@caddeapllx2484 p585600]#
