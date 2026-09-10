
-sh-4.2$ oc get pods -n openshift-ingress | grep debug-tcpdump
debug-tcpdump-007                 1/1       Running   0          29m
debug-tcpdump-008                 1/1       Running   0          26m
debug-tcpdump-009                 1/1       Running   0          32m
debug-tcpdump-010                 1/1       Running   0          25m
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh -n openshift-ingress debug-tcpdump-007
~ # tcpdump -r /tmp/sigda-test2-007.pcap -n 'net 10.245.153.0/24' | head -50
reading from file /tmp/sigda-test2-007.pcap, link-type LINUX_SLL2 (Linux cooked v2), snapshot length 262144
Warning: interface names might be incorrect
~ #
