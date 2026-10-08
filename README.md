POD=$(oc get pods -n openshift-sdn -o wide | grep ceadecldlx066 | awk '{print $1}'); oc exec -n openshift-sdn $POD -c sdn -- ovs-ofctl -O OpenFlow13 dump-flows br0 table=100
