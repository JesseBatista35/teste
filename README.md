
-sh-4.2$
-sh-4.2$ oc rsh -n openshift-ingress debug-tcpdump-007
~ # tcpdump -r /tmp/sigda-test2-007.pcap -n 'net 10.245.153.0/24' | head -50
reading from file /tmp/sigda-test2-007.pcap, link-type LINUX_SLL2 (Linux cooked v2), snapshot length 262144
Warning: interface names might be incorrect
~ # exit
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh -n openshift-ingress debug-tcpdump-008
~ #
~ #
~ # tcpdump -r /tmp/sigda-test2-008.pcap -n 'net 10.245.153.0/24' | head -50
reading from file /tmp/sigda-test2-008.pcap, link-type LINUX_SLL2 (Linux cooked v2), snapshot length 262144
Warning: interface names might be incorrect
~ # exit
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh -n openshift-ingress debug-tcpdump-009
~ # tcpdump -r /tmp/sigda-test2-009.pcap -n 'net 10.245.153.0/24' | head -50
reading from file /tmp/sigda-test2-009.pcap, link-type LINUX_SLL2 (Linux cooked v2), snapshot length 262144
Warning: interface names might be incorrect
~ #
~ #
~ #
~ # exit
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh -n openshift-ingress debug-tcpdump-010
~ # tcpdump -r /tmp/sigda-test2-010.pcap -n 'net 10.245.153.0/24' | head -50
reading from file /tmp/sigda-test2-010.pcap, link-type LINUX_SLL2 (Linux cooked v2), snapshot length 262144
Warning: interface names might be incorrect
~ # exit
-sh-4.2$
