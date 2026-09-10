tcpdump -r sigda-test2-007.pcap -n 'host 10.245.153.18' | head -50
tcpdump -r sigda-test2-008.pcap -n 'host 10.245.153.18' | head -50
tcpdump -r sigda-test2-009.pcap -n 'host 10.245.153.18' | head -50
tcpdump -r sigda-test2-010.pcap -n 'host 10.245.153.18' | head -50


tcpdump -r sigda-test2-007.pcap -n 'net 10.245.153.0/24' | head -50
tcpdump -r sigda-test2-008.pcap -n 'net 10.245.153.0/24' | head -50
tcpdump -r sigda-test2-009.pcap -n 'net 10.245.153.0/24' | head -50
tcpdump -r sigda-test2-010.pcap -n 'net 10.245.153.0/24' | head -50



oc get pods -n openshift-ingress | grep debug-tcpdump

oc rsh -n openshift-ingress debug-tcpdump-007
tcpdump -r /tmp/sigda-test2-007.pcap -n 'net 10.245.153.0/24' | head -50
