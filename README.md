O pod atual é o sispx-pix-gestao-des-414-nmjc9. Outro ponto: o pod antigo 391-ld6h8 está 1/2 Running há 2 dias, ou seja, um dos containers nunca ficou pronto. Esse é o pod do log com ORA-17002, então vale olhar também.

Rode isto:

bash
P=sispx-pix-gestao-des-414-nmjc9

# init containers e ordem (procurar istio-init / istio-validation)
oc get pod $P -o jsonpath='{range .spec.initContainers[*]}{.name}{"\n"}{end}'

# annotations do Istio
oc get pod $P -o jsonpath='{.metadata.annotations}' | tr ',' '\n' | grep -i -E 'istio|traffic'

# erro atual do init
oc logs $P -c secrets-agent-sidecar --tail=15

# ServiceEntry no namespace e no cluster
oc get serviceentry -n sispx-des
oc get serviceentry -A | grep -i -E 'sicsn|beyond'

# qual container do 391 não está pronto
oc get pod sispx-pix-gestao-des-391-ld6h8 -o jsonpath='{range .status.containerStatuses[*]}{.name}{" ready="}{.ready}{"\n"}{end}'

Depois, o teste sem sidecar, que é o que decide entre firewall e Istio:

bash
oc run teste-cofre -n sispx-des --rm -it --restart=Never \
  --image=$(oc get pod $P -o jsonpath='{.spec.initContainers[?(@.name=="secrets-agent-sidecar")].image}') \
  --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
  --command -- sh -c 'python3 -c "import socket;s=socket.create_connection((\"sicsn.caixa\",443),10);print(\"PORTA_443_ABERTA\")" ; python3 -c "import socket;s=socket.create_connection((\"sicsn.caixa\",23),5);print(\"PORTA_23_ABERTA\")"'

Esse comando usa a própria imagem do secrets-agent-sidecar, que tem Python e não depende de curl. O resultado esperado:

443 dá timeout: é firewall/EgressIP.
443 abre e a 23 dá timeout: a rede está ok, e o problema está no Istio (o teste de ontem pela porta 23 respondeu porque era o Envoy).

Me manda as saídas.
