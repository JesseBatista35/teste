oc cp openshift-ingress/debug-tcpdump-009:/tmp/sigda-test-009.pcap ./sigda-test-009.pcap
oc cp openshift-ingress/debug-tcpdump-007:/tmp/sigda-test-007.pcap ./sigda-test-007.pcap
oc cp openshift-ingress/debug-tcpdump-008:/tmp/sigda-test-008.pcap ./sigda-test-008.pcap
oc cp openshift-ingress/debug-tcpdump-010:/tmp/sigda-test-010.pcap ./sigda-test-010.pcap



oc delete pod debug-tcpdump-009 debug-tcpdump-007 debug-tcpdump-008 debug-tcpdump-010 -n openshift-ingress



ls -la sigda-test-009.pcap
