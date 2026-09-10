
-sh-4.2$
-sh-4.2$ oc get pod debug-tcpdump-007 -n openshift-ingress
NAME                READY     STATUS              RESTARTS   AGE
debug-tcpdump-007   0/1       ContainerCreating   0          6s
-sh-4.2$ oc get pod debug-tcpdump-007 -n openshift-ingress
NAME                READY     STATUS              RESTARTS   AGE
debug-tcpdump-007   0/1       ContainerCreating   0          9s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod debug-tcpdump-007 -n openshift-ingress
NAME                READY     STATUS              RESTARTS   AGE
debug-tcpdump-007   0/1       ContainerCreating   0          15s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod debug-tcpdump-007 -n openshift-ingress
NAME                READY     STATUS    RESTARTS   AGE
debug-tcpdump-007   1/1       Running   0          21s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh -n openshift-ingress debug-tcpdump-007
~ # tcpdump -i any -w /tmp/sigda-test-007.pcap 'port 443 and host 10.116.180.64'
tcpdump: WARNING: any: That device doesn't support promiscuous mode
(Promiscuous mode not supported on the "any" device)
tcpdump: listening on any, link-type LINUX_SLL2 (Linux cooked v2), snapshot length 262144 bytes


