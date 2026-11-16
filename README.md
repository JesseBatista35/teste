1. Por que o backend internet não sobe

Descubra o nome do container de inicialização:

oc get pod -n siepr-des siepr-backend-des-244-t982x -o jsonpath='{.spec.initContainers[*].name}'; echo

Depois veja o log dele:

oc logs -n siepr-des siepr-backend-des-244-t982x -c $(oc get pod -n siepr-des siepr-backend-des-244-t982x -o jsonpath='{.spec.initContainers[0].name}') --tail=50

E os eventos do pod:

oc describe pod -n siepr-des siepr-backend-des-244-t982x | tail -25
2. Para qual backend o SIBEC3 está chamando

No navegador, clique em hora → aba Cabeçalhos e me mande a URL da solicitação. Só essa linha já basta.

O que cada URL indica:

siepr-backend-des...: a chamada passa por um caminho que responde mesmo com o pod quebrado (por exemplo, um gateway). O conserto principal é subir o backend internet.
siepr-backend-intranet-des...: o SIBEC3 está apontando para o backend da intranet, que exige certificação. Pode ser configuração errada do frontend, e ele deveria usar o backend internet.

O passo 1 é prioridade: um pod em CrashLoop há 2 dias provavelmente é a causa principal.

Como o Claude está se saindo nesta sessão?
