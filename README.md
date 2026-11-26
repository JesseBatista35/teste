Janela A — captura no nó (roda primeiro)
bash
oc whoami --show-server
/usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- \
  timeout 120 tcpdump -nni ens192 'host 10.221.142.2 and port 443'

Espere aparecer a linha listening on ens192. A captura fica aberta por 2 minutos.

Janela B — gera o tráfego (logo depois do "listening")
bash
oc whoami --show-server
IMG=default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.1

for NS in sispx-des sigel-tqs; do
  echo "=== $NS ==="
  oc run teste-cofre -n $NS --rm -it --restart=Never --image=$IMG \
    --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
    --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),10);print("OK")'
done

Depois que a Janela A terminar, me manda a saída das duas janelas.

Se a Janela A der "tcpdump: not found"

Rode isto no lugar, também na Janela A:

bash
/usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r \
  --image=registry.redhat.io/rhel8/support-tools -- \
  timeout 120 tcpdump -nni ens192 'host 10.221.142.2 and port 443'
O que vamos procurar na saída
Linhas 10.116.223.22.xxxxx > 10.221.142.2.443: Flags [S] seguidas de Flags [S.] voltando: o caminho do sigel funcionando, que é a referência.
Linhas 10.116.223.11.xxxxx > 10.221.142.2.443: Flags [S] repetindo sem [S.] de volta: o problema é da rede, e o caso vai para Redes com essa captura.
Nenhuma linha com o .11: o problema é do SDN do nó, e o caso vai para o time do cluster pixnprd4.
