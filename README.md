Terminal 1, captura no nó (60s):

bash
/usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- chroot /host \
  timeout 60 tcpdump -nni ens192 'host 10.221.142.2 and port 443'

Terminal 2, logo em seguida, gere o tráfego a partir do sispx-des:

bash
IMG=$(oc get pod sispx-pix-gestao-des-414-nmjc9 -n sispx-des -o jsonpath='{.spec.initContainers[?(@.name=="secrets-agent-sidecar")].image}')
oc run teste-tcpdump -n sispx-des --rm -it --restart=Never --image=$IMG \
  --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
  --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),10);print("OK")'

Também vale olhar as regras de SNAT e de OVS do .11 comparadas com as do .22 (VNID do sispx-des = 6184777 = 0x5e5f49; sigel-tqs = 8318235 = 0x7eed1b):

bash
/usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- chroot /host sh -c '
iptables -t nat -S | grep -E "10.116.223.(11|22)";
ovs-ofctl -O OpenFlow13 dump-flows br0 table=100 | grep -E "0x5e5f49|0x7eed1b"'
Como ler o tcpdump
O que aparece	Conclusão	Para quem
10.116.223.11 > 10.221.142.2.443: Flags [S] repetindo, sem resposta	O nó envia certo e a rede descarta ou não devolve	Redes/Segurança: bloqueio ou ACL na origem 10.116.223.11 (vale para todos os destinos)
SYN sai com a origem 10.116.222.69 ou outra, em vez do .11	SNAT errado no nó	Time do cluster
Nenhum pacote aparece	Fluxo OVS/iptables do VNID do sispx-des quebrado	Time do cluster (reiniciar o sdn-xfcxc)
