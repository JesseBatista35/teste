Passo 1 — Confirmar o cluster e ver o que mudou
bash
oc whoami --show-server
oc get nodes | grep worker
oc get hostsubnet | grep -E 'NAME|10.116.223.11'
oc get pods -n sispx-des | grep pix-gestao | grep -v deploy

O que olhar:

O server tem que ser api.pixnprd4.caixa:6443.
O hostsubnet mostra em qual nó o .11 está agora.
Na lista de pods, veja se o pod da app já está 2/2 Running.
Passo 2 — Testar se o sispx-des já sai para a rede

Esse bloco pega a imagem sozinho, de qualquer pod do sispx-des:

bash
IMG=$(oc get pods -n sispx-des -o jsonpath='{range .items[*]}{.spec.initContainers[?(@.name=="secrets-agent-sidecar")].image}{"\n"}{end}' | grep -v '^$' | head -1)
echo "IMAGEM: $IMG"

oc run teste-cofre -n sispx-des --rm -it --restart=Never --image=$IMG \
  --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
  --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),10);print("OK")'

Se IMAGEM: vier vazio, me avise e eu passo outro jeito.

Passo 3 — Depende do resultado do passo 2

Se deu OK: o problema foi corrigido pela troca do nó. Faça um redeploy pela release (ou oc rollout latest dc/sispx-pix-gestao-des -n sispx-des) e acompanhe com:

bash
oc get pods -n sispx-des -w | grep pix-gestao

Se deu timeout: troque NOVO_NO pelo nome do nó que o passo 1 mostrou para o .11 e rode o tcpdump nesse nó.

Terminal 1:

bash
/usr/local/bin/oc-v4.13 debug node/NOVO_NO -- timeout 90 tcpdump -nni ens192 'host 10.221.142.2 and port 443'

Terminal 2 (abra outra sessão na mesma máquina), assim que aparecer "listening":

bash
oc run teste-cofre -n sispx-des --rm -it --restart=Never --image=$IMG \
  --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
  --command -- python3 -c 'import socket;socket.create_connection(("sicsn.caixa",443),10);print("OK")'

O $IMG precisa ser definido também nesse segundo terminal: repita a linha IMG=... do passo 2.

Me manda a saída do passo 1 e do passo 2 que eu digo qual caminho seguir.
