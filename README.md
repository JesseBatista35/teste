
-sh-4.2$ oc rsh -n openshift-ingress debug-tcpdump-009
~ #
~ #
~ # tcpdump -i any -w /tmp/sigda-test-009.pcap 'port 443 and host 10.116.180.64'
tcpdump: WARNING: any: That device doesn't support promiscuous mode
(Promiscuous mode not supported on the "any" device)
tcpdump: listening on any, link-type LINUX_SLL2 (Linux cooked v2), snapshot length 262144 bytes

