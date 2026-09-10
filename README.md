oc cp openshift-ingress/debug-tcpdump-009:/tmp/sigda-test-009.pcap ./sigda-test-009.pcap
oc cp openshift-ingress/debug-tcpdump-007:/tmp/sigda-test-007.pcap ./sigda-test-007.pcap
oc cp openshift-ingress/debug-tcpdump-008:/tmp/sigda-test-008.pcap ./sigda-test-008.pcap
oc cp openshift-ingress/debug-tcpdump-010:/tmp/sigda-test-010.pcap ./sigda-test-010.pcap



oc delete pod debug-tcpdump-009 debug-tcpdump-007 debug-tcpdump-008 debug-tcpdump-010 -n openshift-ingress




-sh-4.2$ ls -la si
sigda-test-009.pcap       sihdg-jboss8-des-dc.yaml
-sh-4.2$ ls -la sigda-test-009.pcap
-rw-r--r-- 1 p585600 usucef 24 Set 10 11:45 sigda-test-009.pcap
-sh-4.2$
