oc exec -n openshift-sdn sdn-rprgw -c sdn -- nc -s 10.116.221.46 -zv -w 5 10.116.29.201 31153
oc exec -n openshift-sdn sdn-rprgw -c sdn -- nc -s 10.116.222.5 -zv -w 5 10.116.29.201 31153

oc get netnamespace sihdg-tqs -o jsonpath='{.netid}{"\n"}'
oc get pods -n openshift-sdn -o wide | grep ceadecldlx081
oc exec -n openshift-sdn <pod-sdn-do-081> -c openvswitch -- ovs-ofctl -O OpenFlow13 dump-flows br0 table=100 | grep -E "12401478|10.116.208.104"

oc exec -n openshift-sdn sdn-rprgw -c sdn -- iptables -t nat -S OPENSHIFT-MASQUERADE | grep -E "10.116.221.46|10.116.222.5"

