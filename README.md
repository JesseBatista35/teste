oc exec -n openshift-sdn sdn-4g965 -c sdn -- ovs-ofctl -O OpenFlow13 dump-flows br0 table=100 | grep -E "0xbd3b46|10.116.208.104"

oc exec -n openshift-sdn sdn-4g965 -c sdn -- chroot /host ovs-ofctl -O OpenFlow13 dump-flows br0 table=100 | grep -E "0xbd3b46|10.116.208.104"

oc get pods -n openshift-sdn -o wide | grep ceadecldlx077
