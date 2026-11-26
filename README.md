Próximo passo: o tcpdump, que é a prova final (~5 min)

O comando anterior falhou porque usava chroot /host, e o tcpdump não existe no host. Sem o chroot ele roda na imagem do debug.

Terminal 1:

bash
/usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- \
  timeout 90 tcpdump -nni ens192 'host 10.221.142.2 and port 443'

Terminal 2, assim que aparecer "listening on ens192":

bash
IMG=$(oc get pod sispx-pix-gestao-des-391-ld6h8 -n sispx-des -o jsonpath='{.spec.initContainers[?(@.name=="secrets-agent-sidecar")].image}')

for NS in sispx-des sigel-tqs; do
  oc run teste-$NS -n $NS --rm -it --restart=Never --image=$IMG \
    --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
    --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),10);print("OK")'
done

Se der tempo, rode também os fluxos do OVS com a mark correta:

bash
/usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- chroot /host \
  ovs-ofctl -O OpenFlow13 dump-flows br0 table=100 | grep -E '0x15e5f48|0x117e6d1a'
Depois do tcpdump
O tcpdump mostra	Ação
SYN do .11 saindo, sem resposta; o .22 com SYN e SYN-ACK	Abrir para Redes/Segurança: tráfego de origem 10.116.223.11 descartado na rede (ACL, IPS ou ARP no gateway). Anexar a captura.
SYN do .11 não aparece, ou sai com outra origem	Abrir para o time do cluster pixnprd4: fluxo OVS/SDN do VNID do sispx-des quebrado no nó ns57r. Sugerir reiniciar o sdn-xfcxc ou reatribuir o EgressIP.

Para não ficar parado esperando: as evidências que já temos são suficientes para acionar Redes e o time do cluster ao mesmo tempo, com a tabela acima. O tcpdump decide qual dos dois resolve.
