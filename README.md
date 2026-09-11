oc cp openshift-ingress/debug-tcpdump-007:/tmp/sigda-test3-007.pcap ./sigda-test3-007.pcap
oc cp openshift-ingress/debug-tcpdump-008:/tmp/sigda-test3-008.pcap ./sigda-test3-008.pcap
oc cp openshift-ingress/debug-tcpdump-009:/tmp/sigda-test3-009.pcap ./sigda-test3-009.pcap
oc cp openshift-ingress/debug-tcpdump-010:/tmp/sigda-test3-010.pcap ./sigda-test3-010.pcap

ls -la sigda-test3-*.pcap

oc rsh -n openshift-ingress debug-tcpdump-007
tcpdump -r /tmp/sigda-test3-007.pcap -n | head -50
exit
