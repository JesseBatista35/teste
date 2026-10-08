
-sh-4.2$
-sh-4.2$
-sh-4.2$ POD=$(oc get pods -n openshift-sdn -o wide | grep ceadecldlx066 | awk '{print $1}'); oc exec -n openshift-sdn $POD -c sdn -- ovs-ofctl -O OpenFlow13 dump-flows br0 table=100
OFPST_FLOW reply (OF1.3) (xid=0x6):
 cookie=0x0, duration=8839034.430s, table=100, n_packets=568310208, n_bytes=142529910334, priority=0 actions=goto_table:101
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
