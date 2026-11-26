Seguem os comandos, na ordem.

1. Contexto e estado do pod
bash
oc project sispx-des
oc get pods | grep pix-gestao
oc describe pod <pod-em-Init> | sed -n '/Init Containers/,/Containers:/p'
oc logs <pod-em-Init> -c secrets-agent-sidecar --tail=30
2. Istio: injeção e o que entra no init
bash
oc get ns sispx-des --show-labels
oc get pod <pod-em-Init> -o jsonpath='{.metadata.annotations}' | tr ',' '\n' | grep -i -E 'istio|traffic'
oc get pod <pod-em-Init> -o jsonpath='{range .spec.initContainers[*]}{.name}{"\n"}{end}'

Olhe se tem istio-init / istio-validation antes do secrets-agent-sidecar. Se tiver, o tráfego do init está passando pelo iptables do Istio.

3. ServiceEntry e política de saída da mesh
bash
oc get serviceentry -n sispx-des
oc get serviceentry -A | grep -i -E 'sicsn|beyond|caixa'
oc get sidecar -n sispx-des -o yaml | grep -i -A5 outboundTrafficPolicy
oc get cm -A | grep -i istio | grep -v ca-root     # localizar o configmap do control plane
oc get smcp -A                                    # se for OpenShift Service Mesh
oc get smcp -n <ns-do-smcp> <nome> -o yaml | grep -i -A3 outboundTrafficPolicy

Se aparecer REGISTRY_ONLY e não existir ServiceEntry para sicsn.caixa, achamos a causa.

4. Teste real, sem sidecar (o mais importante)
bash
oc run teste-cofre -n sispx-des --rm -it --restart=Never \
  --image=registry.access.redhat.com/ubi8/ubi-minimal \
  --overrides='{"metadata":{"annotations":{"sidecar.istio.io/inject":"false"}}}' \
  -- bash -c 'getent hosts sicsn.caixa; timeout 10 bash -c "</dev/tcp/sicsn.caixa/443" && echo PORTA_ABERTA || echo SEM_CONEXAO; curl -kv --connect-timeout 10 https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/connect/token 2>&1 | tail -20'

Se não conseguir puxar a ubi, troque pela imagem do próprio app (oc get dc sispx-pix-gestao-des -o jsonpath='{..image}').

Para confirmar que o teste da porta 23 era o Envoy, rode no mesmo pod:

bash
timeout 5 bash -c "</dev/tcp/sicsn.caixa/23" && echo ABRIU_23 || echo FECHOU_23

Sem o sidecar, a porta 23 deve fechar.

5. EgressIP do namespace
bash
oc get netnamespace sispx-des -o yaml 2>/dev/null | grep -A3 egressIPs   # SDN
oc get egressip 2>/dev/null | grep -i sispx                              # OVN

Confirme que aparece 10.116.223.11.

Como interpretar
Resultado do passo 4	Conclusão
SEM_CONEXAO / timeout	Firewall. Pedir a regra 10.116.223.11 → 10.221.142.2:443; a solicitação atual está com o nome errado ("sicns")
Conecta e o curl recebe resposta HTTP (400/405 etc.)	A rede está ok e o problema é o Istio. Criar ServiceEntry para sicsn.caixa:443 ou excluir o IP do init com a annotation traffic.sidecar.istio.io/excludeOutboundIPRanges: 10.221.142.2/32
Conecta, mas o TLS cai	Lado do cofre/balanceador. Acionar a Segurança, como no caso do SIIFX

Me manda a saída dos passos 3 e 4 que eu fecho o diagnóstico.
