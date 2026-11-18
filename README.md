Liste o pod atual (o nome pode ter mudado desde 05/11) e troque na linha seguinte:

bash
oc get pods -n sipgc-des | grep informacoes
oc exec -it <pod-informacoes-des> -n sipgc-des -- bash -c "timeout 5 bash -c '</dev/tcp/des.sigoc.caixa/443' && echo ABERTA || echo SEM CONEXAO"

Se abrir, a regra funcionou e o problema é outro. Se continuar SEM CONEXAO, siga para o passo 2.

2. Descobrir o IP real de saída

Pelo cofre: pergunte ao Lucas qual IP está liberado no BeyondTrust para o client de DES. Em TQS foi 10.116.222.238, o IP que o cofre viu na chamada do pod, então em DES deve valer o mesmo critério.
Pelo nó: veja onde o pod roda.
bash
oc get pod <pod-informacoes-des> -n sipgc-des -o jsonpath='{.spec.nodeName} {.status.hostIP}{"\n"}'

Se o namespace não tiver egress IP próprio, o pod sai com o IP do nó. Se tiver, sai com o egress IP. Por isso a confirmação do Lucas é a mais confiável.

3. Corrigir a regra
