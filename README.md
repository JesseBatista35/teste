1. O EgressIP está atribuído a algum nó?
Se o IP não estiver hospedado em nenhum nó, o tráfego é descartado e o resultado é exatamente esse timeout.

bash
oc get egressip -o wide 2>/dev/null | grep -i -E 'NAME|sispx|10.116.223.11'
oc get egressip -o yaml 2>/dev/null | grep -B5 -A10 '10.116.223.11'      # ver status.items[].node
oc get hostsubnet 2>/dev/null | grep -E 'NAME|10.116.223.11'              # caso o cluster seja SDN
oc get netnamespace sispx-des -o yaml 2>/dev/null | grep -A2 egressIPs

2. O problema é só do sispx ou de todo mundo?
Rode o mesmo teste a partir de outro namespace do pixnprd4 que use BeyondTrust e esteja funcionando (por exemplo, o sispi-des):

bash
IMG=$(oc get pod sispx-pix-gestao-des-414-nmjc9 -n sispx-des -o jsonpath='{.spec.initContainers[?(@.name=="secrets-agent-sidecar")].image}')

oc run teste-cofre2 -n sispi-des --rm -it --restart=Never --image=$IMG \
  --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
  --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),10);print("443_OK")'

3. Teste até o IP direto, sem DNS:

bash
oc run teste-cofre3 -n sispx-des --rm -it --restart=Never --image=$IMG \
  --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
  --command -- python3 -c 'import socket;print(socket.gethostbyname("sicsn.caixa"));socket.create_connection(("10.221.142.2",443),10);print("443_OK")'
Como ler o resultado
Cenário	Encaminhamento
EgressIP sem nó atribuído	Time de cluster (OCP pixnprd4) precisa reatribuir o EgressIP
sispi-des conecta e sispx-des não	Falta regra de firewall para 10.116.223.11 → 10.221.142.2:443. Na solicitação atual o destino está como "sicns": é preciso corrigir para sicsn.caixa
Nenhum namespace conecta	Problema no cofre ou no balanceador do sicsn.caixa (como no caso do SIIFX). Acionar a Segurança/time do BeyondTrust
Como o Claude está se saindo nesta sessão?
