oc rsh -n openshift-ingress debug-tcpdump-009
tcpdump -i any -w /tmp/sigda-test3-009.pcap 'net 10.116.4.144/28'
