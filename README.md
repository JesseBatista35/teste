oc get pod -n openshift-sdn sdn-4g965 -o jsonpath='{.spec.containers[*].name}{"\n"}'
oc exec -n openshift-sdn sdn-4g965 -c openvswitch -- ovs-ofctl -O OpenFlow13 dump-flows br0 table=100 | grep -E "12401478|0xbd3b46|10.116.208.104"


oc rsh -c sihdg-jboss8-tqs sihdg-jboss8-tqs-28-q6ngx
for i in 1 2 3; do date '+%H:%M:%S %Z'; timeout 5 bash -c '</dev/tcp/10.116.29.201/31153'; echo "201 rc=$?"; done
