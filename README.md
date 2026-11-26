Dois testes rápidos para deixar o chamado completo

1. O pod sai se rodar no próprio nó ns57r? Isso separa o túnel VXLAN do fluxo local do nó.

bash
IMG=default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.1

oc run teste-ns57r -n sispx-des --rm -i --restart=Never --image=$IMG \
  --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}},"spec":{"nodeName":"pixnprd4-x44wk-worker-0-ns57r"}}' \
  --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),10);print("OK")'

2. Fluxos OVS do sispx-des comparados com os do sigel (VNID em hex e em decimal):

bash
/usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- chroot /host \
  ovs-ofctl -O OpenFlow13 dump-flows br0 table=100 2>&1 | grep -E '0x5e5f49|0x7eed1b|6184777|8318235'
Encaminhamento ao time do cluster pixnprd4

Evidências para o chamado:

Namespace sispx-des (VNID 6184777, EgressIP 10.116.223.11 no nó pixnprd4-x44wk-worker-0-ns57r) sem saída para nenhum destino desde ~24/11.
O sigel-tqs (EgressIP 10.116.223.22) sai pelo mesmo nó normalmente.
O tcpdump no ens192 do ns57r mostra o handshake do .22 completo e nenhum pacote do .11.
Não há EgressNetworkPolicy nem NetworkPolicy de egress no namespace. O IP está no ens192 e o SNAT no iptables está correto.
Pedido: revisar os fluxos OVS da tabela 100 do VNID 6184777 no ns57r. O contorno provável é reiniciar o pod sdn-xfcxc do nó, ou mover o EgressIP .11 para outro nó.

Você tem permissão de oc debug node, então provavelmente também consegue reiniciar o SDN ou mexer no hostsubnet. Mesmo assim, não faça isso por conta própria. É um cluster compartilhado (pix), e reiniciar o sdn-xfcxc afeta todos os EgressIPs desse nó: sigel-tqs, silce, simpi e sispi-hmp. Essa ação é do time do cluster, ou precisa do aval deles.
