oc rsh -n openshift-ingress debug-tcpdump-007
tshark -r /tmp/sigda-test3-007.pcap -Y 'tls.handshake.extensions_server_name contains "sigda"' -T fields -e frame.time -e ip.src -e ip.dst -e tcp.srcport -e tcp.dstport

tshark -r /tmp/sigda-test3-007.pcap -Y "ip.addr==<IP_ORIGEM> && tcp.port==<PORTA_ORIGEM>" -T fields -e frame.time -e ip.src -e ip.dst -e tcp.flags -e tcp.len
