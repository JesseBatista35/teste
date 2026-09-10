Nó 009:

bash
oc rsh -n openshift-ingress debug-tcpdump-009
tcpdump -i any -w /tmp/sigda-test2-009.pcap 'port 443'

Nó 007:

bash
oc rsh -n openshift-ingress debug-tcpdump-007
tcpdump -i any -w /tmp/sigda-test2-007.pcap 'port 443'

Nó 008:

bash
oc rsh -n openshift-ingress debug-tcpdump-008
tcpdump -i any -w /tmp/sigda-test2-008.pcap 'port 443'

Nó 010:

bash
oc rsh -n openshift-ingress debug-tcpdump-010
tcpdump -i any -w /tmp/sigda-test2-010.pcap 'port 443'

Deixa os 4 rodando, avisa o Mateus pra disparar de novo, e quando ele confirmar, Ctrl+C em cada um.

Depois, pra copiar (fora do oc rsh, uma aba nova):

bash
oc cp openshift-ingress/debug-tcpdump-009:/tmp/sigda-test2-009.pcap ./sigda-test2-009.pcap
oc cp openshift-ingress/debug-tcpdump-007:/tmp/sigda-test2-007.pcap ./sigda-test2-007.pcap
oc cp openshift-ingress/debug-tcpdump-008:/tmp/sigda-test2-008.pcap ./sigda-test2-008.pcap
oc cp openshift-ingress/debug-tcpdump-010:/tmp/sigda-test2-010.pcap ./sigda-test2-010.pcap

E confirma o tamanho de todos:

bash
ls -la sigda-test2-*.pcap

Avisa quando o Mateus confirmar o novo horário do teste.
