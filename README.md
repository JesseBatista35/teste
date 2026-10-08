oc exec -n openshift-sdn sdn-4g965 -c sdn -- ovs-ofctl -O OpenFlow13 dump-flows br0 table=100 | wc -l
oc exec -n openshift-sdn sdn-4g965 -c sdn -- ovs-ofctl -O OpenFlow13 dump-flows br0 table=100 | head -20

NID=$(oc get netnamespace sisam-tqs -o jsonpath='{.netid}'); printf '%x\n' $NID
oc exec -n openshift-sdn sdn-4g965 -c sdn -- ovs-ofctl -O OpenFlow13 dump-flows br0 table=100 | grep -i "0x$(printf '%x' $NID)"


oc logs -n openshift-sdn sdn-4g965 -c sdn > /tmp/sdn-081.log
grep -i -E "egress|0xbd3b46|12401478|10.116.221.46|10.116.208.104" /tmp/sdn-081.log | tail -30
