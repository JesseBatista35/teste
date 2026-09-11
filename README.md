oc rsh -n openshift-ingress debug-tcpdump-010
tshark -r /tmp/sigda-test3-010.pcap -Y 'tls.handshake.extensions_server_name contains "sigda"' -T fields -e frame.time -e ip.src -e ip.dst -e tcp.srcport -e tcp.dstport

tshark -r /tmp/sigda-test3-007.pcap -Y "ip.addr==<IP_ORIGEM> && tcp.port==<PORTA_ORIGEM>" -T fields -e frame.time -e ip.src -e ip.dst -e tcp.flags -e tcp.len




-sh-4.2$ oc rsh -n openshift-ingress debug-tcpdump-007
~ # tshark -r /tmp/sigda-test3-007.pcap -Y 'tls.handshake.extensions_server_name contains "sigda"' -T fields -e frame.time -e ip.src -e ip.dst -e tcp.srcport -e tcp.dstport
2026-09-11T18:30:13.518279000+0000      10.116.4.151    10.116.208.26   54735   443
~ #



-sh-4.2$ oc rsh -n openshift-ingress debug-tcpdump-008
~ # tshark -r /tmp/sigda-test3-008.pcap -Y 'tls.handshake.extensions_server_name contains "sigda"' -T fields -e frame.time -e ip.src -e ip.dst -e tcp.srcport -e tcp.dstport
~ #



-sh-4.2$ oc rsh -n openshift-ingress debug-tcpdump-009
~ # tshark -r /tmp/sigda-test3-009.pcap -Y 'tls.handshake.extensions_server_name contains "sigda"' -T fields -e frame.time -e ip.src -e ip.dst -e tcp.srcport -e tcp.dstport
~ #


tcpdump: Unable to write output: Broken pipe
~ # exit
-sh-4.2$ oc rsh -n openshift-ingress debug-tcpdump-010
~ # tshark -r /tmp/sigda-test3-010.pcap -Y 'tls.handshake.extensions_server_name contains "sigda"' -T fields -e frame.time -e ip.src -e ip.dst -e tcp.srcport -e tcp.dstport
~ #
