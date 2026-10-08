
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -n openshift-sdn sdn-4g965 -c sdn -- ovs-ofctl -O OpenFlow13 dump-flows br0 table=100 | head -20
OFPST_FLOW reply (OF1.3) (xid=0x6):
 cookie=0x0, duration=38361322.847s, table=100, n_packets=3705064156, n_bytes=851935705522, priority=0 actions=goto_table:101
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ NID=$(oc get netnamespace sisam-tqs -o jsonpath='{.netid}'); printf '%x\n' $NID
eda259
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -n openshift-sdn sdn-4g965 -c sdn -- ovs-ofctl -O OpenFlow13 dump-flows br0 table=100 | grep -i "0x$(printf '%x' $NID)"
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs -n openshift-sdn sdn-4g965 -c sdn > /tmp/sdn-081.log
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -i -E "egress|0xbd3b46|12401478|10.116.221.46|10.116.208.104" /tmp/sdn-081.log | tail -30
-sh-4.2$
-sh-4.2$
-sh-4.2$
