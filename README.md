O grep não achou nada porque o formato da coluna é diferente do que eu supus. E o <ns> era para você trocar pelo nome de um namespace (o shell leu como redirecionamento). Segue tudo pronto:

bash
# 1. listar quem usa os IPs do nó ns57r
oc get netnamespace | grep -E '10\.116\.223\.(9|13|18|20|22)([^0-9]|$)'

Depois pegue o primeiro namespace que aparecer e teste direto:

bash
NS=$(oc get netnamespace | grep -E '10\.116\.223\.(9|13|18|20|22)([^0-9]|$)' | awk 'NR==1{print $1}')
echo "Testando a partir de: $NS"

oc run teste-ns57r -n $NS --rm -it --restart=Never --image=$IMG \
  --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
  --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),8);print("OK")'

Se a primeira lista vier vazia de novo, rode oc get netnamespace | grep 10.116.223 e me manda a saída, que eu ajusto.

Para conferir o SDN do nó:

bash
oc get pods -n openshift-sdn -o wide | grep ns57r

Se der Forbidden no openshift-sdn ou no oc run no outro namespace, é falta de permissão. Aí o caminho é escalar direto ao time do cluster com o que já temos.

Como o Claude está se saindo nesta sessão?
