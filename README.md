tcpdump -r sigda-test2-007.pcap -n 'host 10.245.153.18' | head -50
tcpdump -r sigda-test2-008.pcap -n 'host 10.245.153.18' | head -50
tcpdump -r sigda-test2-009.pcap -n 'host 10.245.153.18' | head -50
tcpdump -r sigda-test2-010.pcap -n 'host 10.245.153.18' | head -50


tcpdump -r sigda-test2-007.pcap -n 'net 10.245.153.0/24' | head -50
tcpdump -r sigda-test2-008.pcap -n 'net 10.245.153.0/24' | head -50
tcpdump -r sigda-test2-009.pcap -n 'net 10.245.153.0/24' | head -50
tcpdump -r sigda-test2-010.pcap -n 'net 10.245.153.0/24' | head -50




-sh-4.2$
-sh-4.2$ tcpdump -r sigda-test2-007.pcap -n 'host 10.245.153.18' | head -50
reading from file sigda-test2-007.pcap, link-type 276
tcpdump: unknown data link type 276
-sh-4.2$
-sh-4.2$
-sh-4.2$ tcpdump -r sigda-test2-007.pcap -n 'net 10.245.153.0/24' | head -50
reading from file sigda-test2-007.pcap, link-type 276
tcpdump: unknown data link type 276
-sh-4.2$
-sh-4.2$
-sh-4.2$
