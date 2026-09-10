exit
oc rsh -n openshift-ingress debug-tcpdump-008
tcpdump -r /tmp/sigda-test2-008.pcap -n 'net 10.245.153.0/24' | head -50


exit
oc rsh -n openshift-ingress debug-tcpdump-009
tcpdump -r /tmp/sigda-test2-009.pcap -n 'net 10.245.153.0/24' | head -50


exit
oc rsh -n openshift-ingress debug-tcpdump-010
tcpdump -r /tmp/sigda-test2-010.pcap -n 'net 10.245.153.0/24' | head -50
