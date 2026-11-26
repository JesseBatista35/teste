Últimas verificações

1. O .11 está em outro lugar dentro do cluster?

bash
oc get netnamespace | grep -E '10\.116\.223\.11([^0-9]|$)'
oc get hostsubnet -o yaml | grep -n '10.116.223.11'
oc logs -n openshift-sdn sdn-xfcxc -c sdn --since=72h | grep -i -E '10\.116\.223\.11|egress' | tail -30

O esperado é aparecer só o sispx-des e só o ns57r.

2. Duplicidade na rede. Rode a partir de uma VM na rede 10.116.208.0/20, ou peça para Redes:

bash
arping -D -I <iface> -c 3 10.116.223.11
arping -I <iface> -c 3 10.116.223.11

O MAC que responder tem que ser o do nó ns57r. Para obter esse MAC:

bash
oc debug node/pixnprd4-x44wk-worker-0-ns57r -- chroot /host ip -br link   # se tiver permissão
Encaminhamento para Redes/INFRA
O EgressIP 10.116.223.11 (namespace sispx-des, hospedado no nó pixnprd4-x44wk-worker-0-ns57r / 10.116.222.69) está sem saída para qualquer destino desde ~24/11.
Outro EgressIP do mesmo nó (.22, sigel-tqs) sai normalmente, então o nó e o SDN estão ok.
Pedido: verificar duplicidade de IP ou ARP/MAC do 10.116.223.11 na rede 10.116.208.0/20 (tabela ARP do gateway/switch) e se há alguma ACL específica para esse IP.

Se Redes demorar, o time do cluster pode trocar o EgressIP do sispx-des como contorno. Isso tem um custo: todas as regras de firewall do SPX (banco, MQ, cofre, APIs) estão liberadas para o .11 e teriam que ser refeitas para o IP novo. Por isso o melhor caminho é achar quem está usando o .11.
