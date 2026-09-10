oc rsh -n openshift-ingress debug-tcpdump-009


tcpdump -i any -w /tmp/sigda-test-009.pcap 'port 443 and host 10.116.180.64'
