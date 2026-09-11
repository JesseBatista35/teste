oc rsh -n openshift-ingress debug-tcpdump-007
tshark -r /tmp/sigda-test3-007.pcap -Y "ip.addr==10.116.4.151 && tcp.port==54735" -T fields -e frame.time -e ip.src -e ip.dst -e tcp.flags -e tcp.len -e tcp.seq -e tcp.ack
