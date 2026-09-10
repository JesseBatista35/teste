oc debug node/ceadecldlx007.nprd.caixa -- chroot /host tcpdump -i any -w /tmp/sigda-test-007.pcap 'port 443 and host 10.116.180.64'

oc debug node/ceadecldlx008.nprd.caixa -- chroot /host tcpdump -i any -w /tmp/sigda-test-008.pcap 'port 443 and host 10.116.180.64'

oc debug node/ceadecldlx009.nprd.caixa -- chroot /host tcpdump -i any -w /tmp/sigda-test-009.pcap 'port 443 and host 10.116.180.64'

oc debug node/ceadecldlx010.nprd.caixa -- chroot /host tcpdump -i any -w /tmp/sigda-test-010.pcap 'port 443 and host 10.116.180.64'


for node in 007 008 009 010; do
  oc debug node/ceadecldlx0${node}.nprd.caixa -- cat /host/tmp/sigda-test-${node}.pcap > ./sigda-test-${node}.pcap
done
