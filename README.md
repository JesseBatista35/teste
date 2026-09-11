
~ # exit
-sh-4.2$ oc cp openshift-ingress/debug-tcpdump-007:/tmp/sigda-test3-007.pcap ./sigda-test3-007.pcap
tar: removing leading '/' from member names
error: write sigda-test3-007.pcap: no space left on device
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ^C
-sh-4.2$ ls -la sigda-test3-*.pcap
-rw-r--r-- 1 p585600 usucef 163840000 Set 11 15:34 sigda-test3-007.pcap
-rw-r--r-- 1 p585600 usucef 163587262 Set 11 15:33 sigda-test3-008.pcap
-rw-r--r-- 1 p585600 usucef 171540868 Set 11 15:33 sigda-test3-009.pcap
-rw-r--r-- 1 p585600 usucef 167034759 Set 11 15:33 sigda-test3-010.pcap
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh -n openshift-ingress debug-tcpdump-007
~ # tcpdump -r /tmp/sigda-test3-007.pcap -n | head -50
reading from file /tmp/sigda-test3-007.pcap, link-type LINUX_SLL2 (Linux cooked v2), snapshot length 262144
Warning: interface names might be incorrect
18:28:03.644750 ens34 In  IP 10.116.4.149.14214 > 10.116.208.26.443: Flags [P.], seq 3259815887:3259816530, ack 2189714648, win 511, length 643
18:28:03.647115 ens34 Out IP 10.116.208.26.443 > 10.116.4.149.14214: Flags [P.], seq 1:507, ack 643, win 501, length 506
18:28:03.676234 ens34 In  IP 10.116.4.149.14214 > 10.116.208.26.443: Flags [P.], seq 643:3570, ack 507, win 509, length 2927
18:28:03.676234 ens34 In  IP 10.116.4.149.14214 > 10.116.208.26.443: Flags [P.], seq 3570:3594, ack 507, win 509, length 24
18:28:03.676259 ens34 Out IP 10.116.208.26.443 > 10.116.4.149.14214: Flags [.], ack 3594, win 501, length 0
18:28:03.682815 ens34 Out IP 10.116.208.26.443 > 10.116.4.150.11171: Flags [F.], seq 2490865404:2490865428, ack 1086523450, win 501, length 24
18:28:03.724726 ens34 In  IP 10.116.4.150.11171 > 10.116.208.26.443: Flags [.], ack 25, win 251, length 0
18:28:03.853309 ens34 In  IP 10.116.4.153.45546 > 10.116.208.26.443: Flags [P.], seq 1185841191:1185843869, ack 710040045, win 512, length 2678
18:28:03.853328 ens34 Out IP 10.116.208.26.443 > 10.116.4.153.45546: Flags [.], ack 2678, win 496, length 0
18:28:03.862703 ens34 Out IP 10.116.208.26.443 > 10.116.4.153.45546: Flags [P.], seq 1:356, ack 2678, win 501, length 355
18:28:03.863238 ens34 In  IP 10.116.4.153.45546 > 10.116.208.26.443: Flags [FP.], seq 2678:2709, ack 356, win 511, length 31
18:28:03.863238 ens34 In  IP 10.116.4.146.3280 > 10.116.208.26.443: Flags [S], seq 298447265, win 8190, options [mss 1460,nop,wscale 8,nop,nop,sackOK], length 0
18:28:03.863343 ens34 Out IP 10.116.208.26.443 > 10.116.4.146.3280: Flags [S.], seq 2745252353, ack 298447266, win 64240, options [mss 1460,nop,nop,sackOK,nop,wscale 7], length 0
18:28:03.863498 ens34 Out IP 10.116.208.26.443 > 10.116.4.153.45546: Flags [F.], seq 356:387, ack 2710, win 501, length 31
18:28:03.863733 ens34 In  IP 10.116.4.153.45546 > 10.116.208.26.443: Flags [.], ack 388, win 511, length 0
18:28:03.863733 ens34 In  IP 10.116.4.146.3280 > 10.116.208.26.443: Flags [P.], seq 1:217, ack 1, win 512, length 216
18:28:03.863750 ens34 Out IP 10.116.208.26.443 > 10.116.4.146.3280: Flags [.], ack 217, win 501, length 0
18:28:03.864008 ens34 Out IP 10.116.208.26.443 > 10.116.4.146.3280: Flags [P.], seq 1:131, ack 217, win 501, length 130
18:28:03.864243 ens34 In  IP 10.116.4.146.3280 > 10.116.208.26.443: Flags [P.], seq 217:268, ack 131, win 512, length 51
18:28:03.905039 ens34 Out IP 10.116.208.26.443 > 10.116.4.146.3280: Flags [.], ack 268, win 501, length 0
18:28:04.130269 ens34 In  IP 10.116.4.157.24911 > 10.116.208.26.443: Flags [P.], seq 3383832936:3383837296, ack 1686055665, win 328, length 4360
18:28:04.130269 ens34 In  IP 10.116.4.157.24911 > 10.116.208.26.443: Flags [P.], seq 4360:5649, ack 1, win 328, length 1289
18:28:04.130301 ens34 Out IP 10.116.208.26.443 > 10.116.4.157.24911: Flags [.], ack 5649, win 501, length 0
18:28:04.133723 ens34 In  IP 10.116.4.158.32237 > 10.116.208.26.443: Flags [P.], seq 1549678054:1549678110, ack 448401753, win 1028, length 56
18:28:04.134502 ens34 Out IP 10.116.208.26.443 > 10.116.4.158.32237: Flags [P.], seq 1:58, ack 56, win 10032, length 57
18:28:04.143029 ens34 Out IP 10.116.208.26.443 > 10.116.4.157.24911: Flags [P.], seq 1:1391, ack 5649, win 501, length 1390
18:28:04.143061 ens34 Out IP 10.116.208.26.443 > 10.116.4.157.24911: Flags [P.], seq 1391:1418, ack 5649, win 501, length 27
18:28:04.144306 ens34 In  IP 10.116.4.157.24911 > 10.116.208.26.443: Flags [.], ack 1331, win 336, length 0
18:28:04.144306 ens34 In  IP 10.116.4.157.24911 > 10.116.208.26.443: Flags [.], ack 1391, win 336, length 0
18:28:04.144306 ens34 In  IP 10.116.4.157.24911 > 10.116.208.26.443: Flags [.], ack 1418, win 336, length 0
18:28:04.149010 ens34 Out IP 10.116.208.26.443 > 10.116.4.146.2383: Flags [P.], seq 1634410358:1634411219, ack 690747211, win 501, length 861
18:28:04.223264 ens34 Out IP 10.116.208.26.443 > 10.116.4.158.28323: Flags [P.], seq 3270645557:3270645581, ack 2447419561, win 501, length 24
18:28:04.229729 ens34 In  IP 10.116.4.158.32237 > 10.116.208.26.443: Flags [.], ack 58, win 1028, length 0
18:28:04.232231 ens34 In  IP 10.116.4.158.28323 > 10.116.208.26.443: Flags [P.], seq 1:29, ack 24, win 513, length 28
18:28:04.232240 ens34 Out IP 10.116.208.26.443 > 10.116.4.158.28323: Flags [.], ack 29, win 501, length 0
18:28:04.246937 ens34 Out IP 10.116.208.26.443 > 10.116.4.149.14214: Flags [P.], seq 507:7157, ack 3594, win 501, length 6650
18:28:04.246946 ens34 Out IP 10.116.208.26.443 > 10.116.4.149.14214: Flags [P.], seq 7157:13807, ack 3594, win 501, length 6650
18:28:04.256218 ens34 In  IP 10.116.4.146.2383 > 10.116.208.26.443: Flags [.], ack 861, win 514, length 0
18:28:04.280885 ens34 Out IP 10.116.208.26.443 > 10.116.4.151.52264: Flags [P.], seq 2894828912:2894828936, ack 1592667613, win 501, length 24
18:28:04.284715 ens34 In  IP 10.116.4.151.52264 > 10.116.208.26.443: Flags [P.], seq 1:29, ack 24, win 512, length 28
18:28:04.284724 ens34 Out IP 10.116.208.26.443 > 10.116.4.151.52264: Flags [.], ack 29, win 501, length 0
18:28:04.287732 ens34 In  IP 10.116.4.150.6544 > 10.116.208.26.443: Flags [P.], seq 1748194720:1748194760, ack 828298293, win 308, length 40
18:28:04.287732 ens34 In  IP 10.116.4.150.6544 > 10.116.208.26.443: Flags [F.], seq 40, ack 1, win 308, length 0
18:28:04.287827 ens34 Out IP 10.116.208.26.443 > 10.116.4.150.6544: Flags [P.], seq 1:25, ack 41, win 501, length 24
18:28:04.287913 ens34 Out IP 10.116.208.26.443 > 10.116.4.150.6544: Flags [F.], seq 25, ack 41, win 501, length 0
18:28:04.288734 ens34 In  IP 10.116.4.150.6544 > 10.116.208.26.443: Flags [R], seq 1748194761, win 9700, length 0
18:28:04.298233 ens34 In  IP 10.116.4.149.14214 > 10.116.208.26.443: Flags [.], ack 13807, win 514, length 0
18:28:04.298259 ens34 Out IP 10.116.208.26.443 > 10.116.4.149.14214: Flags [P.], seq 13807:27107, ack 3594, win 501, length 13300
18:28:04.298272 ens34 Out IP 10.116.208.26.443 > 10.116.4.149.14214: Flags [P.], seq 27107:40407, ack 3594, win 501, length 13300
18:28:04.302725 ens34 In  IP 10.116.4.151.63158 > 10.116.208.26.443: Flags [.], ack 2319190768, win 510, length 0
tcpdump: Unable to write output: Broken pipe
~ # exit
-sh-4.2$



$
-sh-4.2$
-sh-4.2$ oc rsh -n openshift-ingress debug-tcpdump-008
~ # tcpdump -r /tmp/sigda-test3-008.pcap -n | head -50
reading from file /tmp/sigda-test3-008.pcap, link-type LINUX_SLL2 (Linux cooked v2), snapshot length 262144
Warning: interface names might be incorrect
18:28:18.657277 ens32 In  IP 10.116.4.146.59843 > 10.116.208.27.443: Flags [.], ack 744679383, win 259, length 0
18:28:18.693568 ens32 In  IP 10.116.4.148.48664 > 10.116.208.27.443: Flags [.], ack 3724080303, win 514, length 0
18:28:18.693568 ens32 In  IP 10.116.4.148.48664 > 10.116.208.27.443: Flags [.], ack 1331, win 514, length 0
18:28:18.693568 ens32 In  IP 10.116.4.148.48664 > 10.116.208.27.443: Flags [.], ack 4574, win 514, length 0
18:28:18.700273 ens32 In  IP 10.116.4.148.48664 > 10.116.208.27.443: Flags [F.], seq 0, ack 4574, win 514, length 0
18:28:18.700284 ens32 Out IP 10.116.208.27.443 > 10.116.4.148.48664: Flags [.], ack 1, win 501, length 0
18:28:18.722557 ens32 Out IP 10.116.208.27.443 > 10.116.4.157.18258: Flags [P.], seq 772536523:772536547, ack 882761666, win 501, length 24
18:28:18.757274 ens32 In  IP 10.116.4.145.22652 > 10.116.208.27.443: Flags [S], seq 1310100605, win 8190, options [mss 1330,nop,wscale 8,nop,nop,sackOK], length 0
18:28:18.757380 ens32 Out IP 10.116.208.27.443 > 10.116.4.145.22652: Flags [S.], seq 1821704195, ack 1310100606, win 64240, options [mss 1460,nop,nop,sackOK,nop,wscale 7], length 0
18:28:18.758172 ens32 In  IP 10.116.4.145.22652 > 10.116.208.27.443: Flags [.], seq 1:1331, ack 1, win 514, length 1330
18:28:18.758201 ens32 Out IP 10.116.208.27.443 > 10.116.4.145.22652: Flags [.], ack 1331, win 501, length 0
18:28:18.759280 ens32 In  IP 10.116.4.157.18258 > 10.116.208.27.443: Flags [P.], seq 1:29, ack 24, win 511, length 28
18:28:18.759295 ens32 Out IP 10.116.208.27.443 > 10.116.4.157.18258: Flags [.], ack 29, win 501, length 0
18:28:18.762271 ens32 In  IP 10.116.4.145.22652 > 10.116.208.27.443: Flags [P.], seq 1331:2146, ack 1, win 514, length 815
18:28:18.762285 ens32 Out IP 10.116.208.27.443 > 10.116.4.145.22652: Flags [.], ack 2146, win 501, length 0
18:28:18.763908 ens32 Out IP 10.116.208.27.443 > 10.116.4.145.22652: Flags [P.], seq 1:3669, ack 2146, win 501, length 3668
18:28:18.768271 ens32 Out IP 10.116.208.27.443 > 10.116.4.145.22652: Flags [P.], seq 2661:3669, ack 2146, win 501, length 1008
18:28:18.785566 ens32 In  IP 10.116.4.145.22652 > 10.116.208.27.443: Flags [.], ack 3669, win 514, length 0
18:28:18.785566 ens32 In  IP 10.116.4.145.22652 > 10.116.208.27.443: Flags [P.], seq 2146:2210, ack 3669, win 514, length 64
18:28:18.785567 ens32 In  IP 10.116.4.145.22652 > 10.116.208.27.443: Flags [P.], seq 2210:2832, ack 3669, win 514, length 622
18:28:18.785616 ens32 Out IP 10.116.208.27.443 > 10.116.4.145.22652: Flags [.], ack 2832, win 501, length 0
18:28:18.787022 ens32 Out IP 10.116.208.27.443 > 10.116.4.145.22652: Flags [P.], seq 3669:4243, ack 2832, win 501, length 574
18:28:18.789133 ens32 Out IP 10.116.208.27.443 > 10.116.4.145.22652: Flags [P.], seq 4243:4683, ack 2832, win 501, length 440
18:28:18.792276 ens32 In  IP 10.116.4.145.22652 > 10.116.208.27.443: Flags [.], ack 3669, win 514, options [nop,nop,sack 1 {2661:3669}], length 0
18:28:18.794268 ens32 Out IP 10.116.208.27.443 > 10.116.4.145.22652: Flags [P.], seq 4243:4683, ack 2832, win 501, length 440
18:28:18.804556 ens32 In  IP 10.116.4.145.22652 > 10.116.208.27.443: Flags [.], ack 4683, win 510, length 0
18:28:18.812678 ens32 In  IP 10.116.4.145.22652 > 10.116.208.27.443: Flags [.], seq 2832:4162, ack 4683, win 510, length 1330
18:28:18.813284 ens32 In  IP 10.116.4.145.22652 > 10.116.208.27.443: Flags [.], seq 4162:5492, ack 4683, win 510, length 1330
18:28:18.813302 ens32 Out IP 10.116.208.27.443 > 10.116.4.145.22652: Flags [.], ack 5492, win 501, length 0
18:28:18.813566 ens32 In  IP 10.116.4.145.22652 > 10.116.208.27.443: Flags [P.], seq 5492:6940, ack 4683, win 510, length 1448
18:28:18.813566 ens32 In  IP 10.116.4.145.22652 > 10.116.208.27.443: Flags [.], ack 4683, win 510, options [nop,nop,sack 1 {4243:4683}], length 0
18:28:18.813586 ens32 Out IP 10.116.208.27.443 > 10.116.4.145.22652: Flags [.], ack 6940, win 501, length 0
18:28:18.821734 ens32 Out IP 10.116.208.27.443 > 10.116.4.145.22652: Flags [P.], seq 4683:6185, ack 6940, win 501, length 1502
18:28:18.826267 ens32 Out IP 10.116.208.27.443 > 10.116.4.145.22652: Flags [P.], seq 6013:6185, ack 6940, win 501, length 172
18:28:18.837991 ens32 In  IP 10.116.4.145.22652 > 10.116.208.27.443: Flags [.], ack 6185, win 514, length 0
18:28:18.844059 ens32 In  IP 10.116.4.145.22652 > 10.116.208.27.443: Flags [.], ack 6185, win 514, options [nop,nop,sack 1 {6013:6185}], length 0
18:28:18.845725 ens32 In  IP 10.116.4.151.61427 > 10.116.208.27.443: Flags [S], seq 3750018377, win 8190, options [mss 1330,nop,wscale 8,nop,nop,sackOK], length 0
18:28:18.845826 ens32 Out IP 10.116.208.27.443 > 10.116.4.151.61427: Flags [S.], seq 2964210848, ack 3750018378, win 64240, options [mss 1460,nop,nop,sackOK,nop,wscale 7], length 0
18:28:18.846202 ens32 In  IP 10.116.4.151.61427 > 10.116.208.27.443: Flags [P.], seq 1:2115, ack 1, win 1028, length 2114
18:28:18.846216 ens32 Out IP 10.116.208.27.443 > 10.116.4.151.61427: Flags [.], ack 2115, win 496, length 0
18:28:18.847518 ens32 Out IP 10.116.208.27.443 > 10.116.4.151.61427: Flags [P.], seq 1:3669, ack 2115, win 501, length 3668
18:28:18.852267 ens32 Out IP 10.116.208.27.443 > 10.116.4.151.61427: Flags [P.], seq 2661:3669, ack 2115, win 501, length 1008
18:28:18.869018 ens32 Out IP 10.116.208.27.443 > 10.116.4.151.1817: Flags [P.], seq 47233690:47233714, ack 4024130676, win 501, length 24
18:28:18.869034 ens32 Out IP 10.116.208.27.443 > 10.116.4.151.1817: Flags [F.], seq 24, ack 1, win 501, length 0
18:28:18.893986 ens32 In  IP 10.116.4.153.3953 > 10.116.208.27.443: Flags [P.], seq 3818467058:3818468012, ack 4002756740, win 514, length 954
18:28:18.897355 ens32 Out IP 10.116.208.27.443 > 10.116.4.153.3953: Flags [P.], seq 1:415, ack 954, win 501, length 414
18:28:18.897368 ens32 Out IP 10.116.208.27.443 > 10.116.4.153.3953: Flags [F.], seq 415, ack 954, win 501, length 0
18:28:18.900270 ens32 In  IP 10.116.4.151.1817 > 10.116.208.27.443: Flags [.], ack 25, win 519, length 0
18:28:18.924284 ens32 Out IP 10.116.208.27.443 > 10.116.4.153.3953: Flags [F.], seq 415, ack 954, win 501, length 0
18:28:18.935748 ens32 In  IP 10.116.4.153.3953 > 10.116.208.27.443: Flags [.], ack 416, win 512, length 0
tcpdump: Unable to write output: Broken pipe
~ # exit
-sh-4.2$



~ # exit
-sh-4.2$ oc cp openshift-ingress/debug-tcpdump-009:/tmp/sigda-test3-009.pcap ./sigda-test3-009.pcap
tar: removing leading '/' from member names
-sh-4.2$ oc rsh -n openshift-ingress debug-tcpdump-009
~ # tcpdump -r /tmp/sigda-test3-009.pcap -n | head -50
reading from file /tmp/sigda-test3-009.pcap, link-type LINUX_SLL2 (Linux cooked v2), snapshot length 262144
Warning: interface names might be incorrect
18:28:31.330247 ens32 In  IP 10.116.4.152.31491 > 10.116.208.28.443: Flags [P.], seq 2349340996:2349341660, ack 2212854926, win 514, length 664
18:28:31.331655 ens32 Out IP 10.116.208.28.443 > 10.116.4.152.31491: Flags [P.], seq 1:720, ack 664, win 501, length 719
18:28:31.373342 ens32 In  IP 10.116.4.155.46937 > 10.116.208.28.443: Flags [P.], seq 1511499635:1511502010, ack 2975542503, win 512, length 2375
18:28:31.373368 ens32 Out IP 10.116.208.28.443 > 10.116.4.155.46937: Flags [.], ack 2375, win 496, length 0
18:28:31.390530 ens32 Out IP 10.116.208.28.443 > 10.116.4.155.46937: Flags [P.], seq 1:178, ack 2375, win 501, length 177
18:28:31.390746 ens32 In  IP 10.116.4.155.46937 > 10.116.208.28.443: Flags [FP.], seq 2375:2406, ack 178, win 512, length 31
18:28:31.390763 ens32 In  IP 10.116.4.155.4719 > 10.116.208.28.443: Flags [S], seq 2503710483, win 8190, options [mss 1460,nop,wscale 8,nop,nop,sackOK], length 0
18:28:31.390862 ens32 Out IP 10.116.208.28.443 > 10.116.4.155.4719: Flags [S.], seq 4266132353, ack 2503710484, win 64240, options [mss 1460,nop,nop,sackOK,nop,wscale 7], length 0
18:28:31.390897 ens32 Out IP 10.116.208.28.443 > 10.116.4.155.46937: Flags [F.], seq 178:209, ack 2407, win 501, length 31
18:28:31.391240 ens32 In  IP 10.116.4.155.46937 > 10.116.208.28.443: Flags [.], ack 210, win 512, length 0
18:28:31.391256 ens32 In  IP 10.116.4.155.4719 > 10.116.208.28.443: Flags [P.], seq 1:217, ack 1, win 512, length 216
18:28:31.391267 ens32 Out IP 10.116.208.28.443 > 10.116.4.155.4719: Flags [.], ack 217, win 501, length 0
18:28:31.391641 ens32 Out IP 10.116.208.28.443 > 10.116.4.155.4719: Flags [P.], seq 1:131, ack 217, win 501, length 130
18:28:31.391754 ens32 In  IP 10.116.4.155.4719 > 10.116.208.28.443: Flags [P.], seq 217:268, ack 131, win 512, length 51
18:28:31.394733 ens32 In  IP 10.116.4.152.31491 > 10.116.208.28.443: Flags [.], ack 720, win 511, length 0
18:28:31.402142 ens32 Out IP 10.116.208.28.443 > 10.116.4.148.6291: Flags [F.], seq 3762434653, ack 2551285845, win 501, length 0
18:28:31.403746 ens32 In  IP 10.116.4.146.45701 > 10.116.208.28.443: Flags [P.], seq 1517769605:1517770582, ack 2178736222, win 512, length 977
18:28:31.412354 ens32 Out IP 10.116.208.28.443 > 10.116.4.146.45701: Flags [P.], seq 1:3143, ack 977, win 501, length 3142
18:28:31.423744 ens32 In  IP 10.116.4.148.6291 > 10.116.208.28.443: Flags [.], ack 1, win 0, length 0
18:28:31.432139 ens32 Out IP 10.116.208.28.443 > 10.116.4.155.4719: Flags [.], ack 268, win 501, length 0
18:28:31.476244 ens32 In  IP 10.116.4.146.45701 > 10.116.208.28.443: Flags [.], ack 2661, win 514, length 0
18:28:31.519745 ens32 In  IP 10.116.4.146.45701 > 10.116.208.28.443: Flags [.], ack 3143, win 512, length 0
18:28:31.593755 ens32 In  IP 10.116.4.158.27849 > 10.116.208.28.443: Flags [P.], seq 1084071328:1084072103, ack 2496912826, win 514, length 775
18:28:31.595780 ens32 Out IP 10.116.208.28.443 > 10.116.4.158.27849: Flags [P.], seq 1:517, ack 775, win 501, length 516
18:28:31.599245 ens32 In  IP 10.116.4.157.54588 > 10.116.208.28.443: Flags [P.], seq 966983904:966984482, ack 2036290007, win 256, length 578
18:28:31.600817 ens32 In  IP 10.116.4.155.4719 > 10.116.208.28.443: Flags [P.], seq 268:2643, ack 131, win 512, length 2375
18:28:31.600847 ens32 Out IP 10.116.208.28.443 > 10.116.4.155.4719: Flags [.], ack 2643, win 496, length 0
18:28:31.602373 ens32 Out IP 10.116.208.28.443 > 10.116.4.157.54588: Flags [P.], seq 1:1094, ack 578, win 501, length 1093
18:28:31.617747 ens32 In  IP 10.116.4.158.27849 > 10.116.208.28.443: Flags [.], seq 775:2105, ack 517, win 512, length 1330
18:28:31.618242 ens32 In  IP 10.116.4.158.27849 > 10.116.208.28.443: Flags [.], seq 2105:3435, ack 517, win 512, length 1330
18:28:31.618256 ens32 Out IP 10.116.208.28.443 > 10.116.4.158.27849: Flags [.], ack 3435, win 501, length 0
18:28:31.618658 ens32 Out IP 10.116.208.28.443 > 10.116.4.155.4719: Flags [P.], seq 131:308, ack 2643, win 501, length 177
18:28:31.618750 ens32 In  IP 10.116.4.155.4719 > 10.116.208.28.443: Flags [FP.], seq 2643:2674, ack 308, win 512, length 31
18:28:31.618792 ens32 In  IP 10.116.4.145.13076 > 10.116.208.28.443: Flags [S], seq 2894663963, win 8190, options [mss 1460,nop,wscale 8,nop,nop,sackOK], length 0
18:28:31.618792 ens32 In  IP 10.116.4.158.27849 > 10.116.208.28.443: Flags [P.], seq 3435:6682, ack 517, win 512, length 3247
18:28:31.618910 ens32 Out IP 10.116.208.28.443 > 10.116.4.155.4719: Flags [F.], seq 308:339, ack 2675, win 501, length 31
18:28:31.618960 ens32 Out IP 10.116.208.28.443 > 10.116.4.145.13076: Flags [S.], seq 1657350396, ack 2894663964, win 64240, options [mss 1460,nop,nop,sackOK,nop,wscale 7], length 0
18:28:31.618989 ens32 Out IP 10.116.208.28.443 > 10.116.4.158.27849: Flags [.], ack 6682, win 501, length 0
18:28:31.619253 ens32 In  IP 10.116.4.155.4719 > 10.116.208.28.443: Flags [.], ack 340, win 512, length 0
18:28:31.619253 ens32 In  IP 10.116.4.145.13076 > 10.116.208.28.443: Flags [P.], seq 1:217, ack 1, win 512, length 216
18:28:31.619285 ens32 Out IP 10.116.208.28.443 > 10.116.4.145.13076: Flags [.], ack 217, win 501, length 0
18:28:31.619626 ens32 Out IP 10.116.208.28.443 > 10.116.4.145.13076: Flags [P.], seq 1:131, ack 217, win 501, length 130
18:28:31.619762 ens32 In  IP 10.116.4.145.13076 > 10.116.208.28.443: Flags [P.], seq 217:268, ack 131, win 512, length 51
18:28:31.660138 ens32 Out IP 10.116.208.28.443 > 10.116.4.145.13076: Flags [.], ack 268, win 501, length 0
18:28:31.678810 ens32 In  IP 10.116.4.157.54588 > 10.116.208.28.443: Flags [.], ack 1094, win 259, length 0
18:28:31.710107 ens32 Out IP 10.116.208.28.443 > 10.116.4.158.27849: Flags [P.], seq 517:1251, ack 6682, win 501, length 734
18:28:31.720406 ens32 Out IP 10.116.208.28.443 > 10.116.4.157.58214: Flags [P.], seq 3294734101:3294734125, ack 2246714344, win 501, length 24
18:28:31.731745 ens32 In  IP 10.116.4.157.58214 > 10.116.208.28.443: Flags [P.], seq 1:29, ack 24, win 510, length 28
18:28:31.731745 ens32 In  IP 10.116.4.158.27849 > 10.116.208.28.443: Flags [.], seq 6682:8012, ack 1251, win 509, length 1330
18:28:31.731771 ens32 Out IP 10.116.208.28.443 > 10.116.4.157.58214: Flags [.], ack 29, win 501, length 0
tcpdump: Unable to write output: Broken pipe
~ # exit
-sh-4.2$


~ # exit
-sh-4.2$ oc cp openshift-ingress/debug-tcpdump-010:/tmp/sigda-test3-010.pcap ./sigda-test3-010.pcap
tar: removing leading '/' from member names
-sh-4.2$ oc rsh -n openshift-ingress debug-tcpdump-010
~ # tcpdump -r /tmp/sigda-test3-010.pcap -n | head -50
reading from file /tmp/sigda-test3-010.pcap, link-type LINUX_SLL2 (Linux cooked v2), snapshot length 262144
Warning: interface names might be incorrect
18:28:42.391535 ens192 In  IP 10.116.4.157.51009 > 10.116.208.29.443: Flags [P.], seq 2057804184:2057804855, ack 1069663997, win 510, length 671
18:28:42.391599 ens192 Out IP 10.116.208.29.443 > 10.116.4.158.27498: Flags [F.], seq 214719052, ack 1433758780, win 501, length 0
18:28:42.391676 ens192 Out IP 10.116.208.29.443 > 10.116.4.153.31608: Flags [P.], seq 2198386463:2198393113, ack 3729788117, win 501, length 6650
18:28:42.391686 ens192 Out IP 10.116.208.29.443 > 10.116.4.153.31608: Flags [P.], seq 6650:6988, ack 1, win 501, length 338
18:28:42.391707 ens192 Out IP 10.116.208.29.443 > 10.116.4.153.31608: Flags [P.], seq 6988:10531, ack 1, win 501, length 3543
18:28:42.392498 ens192 In  IP 10.116.4.158.27498 > 10.116.208.29.443: Flags [.], ack 1, win 510, length 0
18:28:42.393793 ens192 Out IP 10.116.208.29.443 > 10.116.4.157.51009: Flags [P.], seq 543:1277, ack 671, win 501, length 734
18:28:42.396543 ens192 Out IP 10.116.208.29.443 > 10.116.4.153.31608: Flags [P.], seq 9648:10531, ack 1, win 501, length 883
18:28:42.396554 ens192 Out IP 10.116.208.29.443 > 10.116.4.152.2584: Flags [P.], seq 3713604390:3713607076, ack 1412616186, win 501, length 2686
18:28:42.396995 ens192 In  IP 10.116.4.153.31608 > 10.116.208.29.443: Flags [.], ack 2660, win 1028, length 0
18:28:42.397490 ens192 In  IP 10.116.4.153.31608 > 10.116.208.29.443: Flags [.], ack 10531, win 1028, length 0
18:28:42.400549 ens192 In  IP 10.116.4.157.64520 > 10.116.208.29.80: Flags [S], seq 3113401129, win 8190, options [mss 1460,nop,wscale 8,nop,nop,sackOK], length 0
18:28:42.400665 ens192 Out IP 10.116.208.29.80 > 10.116.4.157.64520: Flags [S.], seq 2686881053, ack 3113401130, win 64240, options [mss 1460,nop,nop,sackOK,nop,wscale 7], length 0
18:28:42.401013 ens192 In  IP 10.116.4.157.64520 > 10.116.208.29.80: Flags [P.], seq 1:971, ack 1, win 512, length 970: HTTP: GET /comercial/fa-solid-900.woff2 HTTP/1.1
18:28:42.404878 ens192 Out IP 10.116.208.29.80 > 10.116.4.157.64520: Flags [P.], seq 1:1977, ack 971, win 501, length 1976: HTTP: HTTP/1.1 404 Not Found
18:28:42.405276 ens192 In  IP 10.116.4.157.64520 > 10.116.208.29.80: Flags [F.], seq 971, ack 1977, win 505, length 0
18:28:42.405367 ens192 Out IP 10.116.208.29.80 > 10.116.4.157.64520: Flags [F.], seq 1977, ack 972, win 501, length 0
18:28:42.405494 ens192 In  IP 10.116.4.157.64520 > 10.116.208.29.80: Flags [.], ack 1978, win 505, length 0
18:28:42.408501 ens192 In  IP 10.116.4.153.31608 > 10.116.208.29.443: Flags [.], ack 10531, win 1028, options [nop,nop,sack 1 {9648:10531}], length 0
18:28:42.415998 ens192 In  IP 10.116.4.158.27498 > 10.116.208.29.443: Flags [.], ack 1, win 510, length 0
18:28:42.416515 ens192 In  IP 10.116.4.152.2584 > 10.116.208.29.443: Flags [.], ack 4294960306, win 514, length 0
18:28:42.416515 ens192 In  IP 10.116.4.152.2584 > 10.116.208.29.443: Flags [.], ack 0, win 514, length 0
18:28:42.417544 ens192 In  IP 10.116.4.158.26610 > 10.116.208.29.443: Flags [S], seq 2441088239, win 8190, options [mss 1330,nop,wscale 8,nop,nop,sackOK], length 0
18:28:42.417671 ens192 Out IP 10.116.208.29.443 > 10.116.4.158.26610: Flags [S.], seq 3026546923, ack 2441088240, win 64240, options [mss 1460,nop,nop,sackOK,nop,wscale 7], length 0
18:28:42.418020 ens192 In  IP 10.116.4.158.26610 > 10.116.208.29.443: Flags [P.], seq 1:2084, ack 1, win 1028, length 2083
18:28:42.418033 ens192 Out IP 10.116.208.29.443 > 10.116.4.158.26610: Flags [.], ack 2084, win 496, length 0
18:28:42.419787 ens192 Out IP 10.116.208.29.443 > 10.116.4.158.26610: Flags [P.], seq 1:3669, ack 2084, win 501, length 3668
18:28:42.423536 ens192 Out IP 10.116.208.29.443 > 10.116.4.158.26610: Flags [P.], seq 2661:3669, ack 2084, win 501, length 1008
18:28:42.424019 ens192 In  IP 10.116.4.152.2584 > 10.116.208.29.443: Flags [.], ack 2660, win 514, length 0
18:28:42.424019 ens192 In  IP 10.116.4.152.2584 > 10.116.208.29.443: Flags [.], ack 2686, win 514, length 0
18:28:42.425072 ens192 In  IP 10.116.4.147.5194 > 10.116.208.29.80: Flags [S], seq 304118708, win 8190, options [mss 1460,nop,wscale 8,nop,nop,sackOK], length 0
18:28:42.425072 ens192 In  IP 10.116.4.146.11862 > 10.116.208.29.80: Flags [S], seq 3009380611, win 8190, options [mss 1460,nop,wscale 8,nop,nop,sackOK], length 0
18:28:42.425355 ens192 Out IP 10.116.208.29.80 > 10.116.4.147.5194: Flags [S.], seq 1869355436, ack 304118709, win 64240, options [mss 1460,nop,nop,sackOK,nop,wscale 7], length 0
18:28:42.425371 ens192 Out IP 10.116.208.29.80 > 10.116.4.146.11862: Flags [S.], seq 2919101970, ack 3009380612, win 64240, options [mss 1460,nop,nop,sackOK,nop,wscale 7], length 0
18:28:42.425517 ens192 In  IP 10.116.4.147.5194 > 10.116.208.29.80: Flags [P.], seq 1:974, ack 1, win 512, length 973: HTTP: GET /comercial/CAIXAStd-Regular.woff HTTP/1.1
18:28:42.425517 ens192 In  IP 10.116.4.146.11862 > 10.116.208.29.80: Flags [P.], seq 1:975, ack 1, win 512, length 974: HTTP: GET /comercial/CAIXAStd-SemiBold.woff HTTP/1.1
18:28:42.426068 ens192 In  IP 10.116.4.153.46247 > 10.116.208.29.443: Flags [P.], seq 3368564700:3368567373, ack 856331466, win 512, length 2673
18:28:42.426094 ens192 Out IP 10.116.208.29.443 > 10.116.4.153.46247: Flags [.], ack 2673, win 496, length 0
18:28:42.428789 ens192 Out IP 10.116.208.29.80 > 10.116.4.147.5194: Flags [P.], seq 1:1977, ack 974, win 501, length 1976: HTTP: HTTP/1.1 404 Not Found
18:28:42.428808 ens192 Out IP 10.116.208.29.80 > 10.116.4.146.11862: Flags [P.], seq 1:1977, ack 975, win 501, length 1976: HTTP: HTTP/1.1 404 Not Found
18:28:42.429011 ens192 In  IP 10.116.4.147.5194 > 10.116.208.29.80: Flags [F.], seq 974, ack 1977, win 505, length 0
18:28:42.429011 ens192 In  IP 10.116.4.146.11862 > 10.116.208.29.80: Flags [F.], seq 975, ack 1977, win 505, length 0
18:28:42.429040 ens192 Out IP 10.116.208.29.80 > 10.116.4.147.5194: Flags [F.], seq 1977, ack 975, win 501, length 0
18:28:42.429068 ens192 Out IP 10.116.208.29.80 > 10.116.4.146.11862: Flags [F.], seq 1977, ack 976, win 501, length 0
18:28:42.429494 ens192 In  IP 10.116.4.147.5194 > 10.116.208.29.80: Flags [.], ack 1978, win 505, length 0
18:28:42.429494 ens192 In  IP 10.116.4.146.11862 > 10.116.208.29.80: Flags [.], ack 1978, win 505, length 0
18:28:42.431951 ens192 Out IP 10.116.208.29.443 > 10.116.4.153.46247: Flags [P.], seq 1:331, ack 2673, win 501, length 330
18:28:42.431996 ens192 Out IP 10.116.208.29.443 > 10.116.4.153.46247: Flags [F.], seq 331, ack 2673, win 501, length 0
18:28:42.432512 ens192 In  IP 10.116.4.148.7745 > 10.116.208.29.443: Flags [S], seq 2938426703, win 8190, options [mss 1460,nop,wscale 8,nop,nop,sackOK], length 0
18:28:42.432512 ens192 In  IP 10.116.4.153.46247 > 10.116.208.29.443: Flags [FP.], seq 2673:2704, ack 331, win 511, length 31
tcpdump: Unable to write output: Broken pipe
~ # exit
-sh-4.2$



<img width="1034" height="459" alt="image" src="https://github.com/user-attachments/assets/7444eb5c-bcbe-4c99-b736-1146fc75ae48" />



