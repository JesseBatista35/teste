Teste para separar as duas causas
bash
# namespaces que saem pelos outros IPs do mesmo nó (ns57r)
oc get netnamespace | grep -E '10\.116\.223\.(9|13|18|20|22)\]'

# testar saída a partir de um deles (troque <ns>)
oc run teste-ns57r -n <ns> --rm -it --restart=Never --image=$IMG \
  --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
  --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),8);print("OK")'

# pod do SDN no nó e erros de egress
oc get pods -n openshift-sdn -o wide | grep ns57r
oc logs -n openshift-sdn <sdn-pod-do-ns57r> -c sdn --tail=200 | grep -i -E 'egress|10.116.223.11|arp'

Para descartar duplicidade de IP, rode a partir de uma VM Linux na mesma rede 10.116.208.0/20:

bash
arping -D -I <iface> -c 3 10.116.223.11    # resposta = alguém mais tem o IP
arping -I <iface> -c 3 10.116.223.11        # ver o MAC que responde

Se o MAC que responder não for o do worker-0-ns57r (10.116.222.69), é duplicidade.

Encaminhamento
Resultado	Para quem
Outros namespaces no ns57r também falham	Time do cluster pixnprd4: problema de egress no nó pixnprd4-x44wk-worker-0-ns57r. A saída rápida é reiniciar o pod sdn do nó ou mover os EgressIPs para outro nó
Só o .11 falha / arping mostra outro MAC	Redes/INFRA: IP 10.116.223.11 duplicado. Identificar e remover quem está usando

Se você não tiver acesso ao namespace openshift-sdn, já dá para escalar ao time do cluster com estas evidências:

o sispi-des (EgressIP .5, nó gp64t) sai normalmente;
o sispx-des (EgressIP .11, nó ns57r) não alcança nenhum destino.
Como o Claude está se saindo nesta sess
