oc get builds -n build-images-ads | grep sispi-backend
oc describe build/sispi-backend-<n> -n build-images-ads
oc logs build/sispi-backend-<n> -n build-images-ads
No describe, repare se o build sequer chegou a iniciar (fase New/Pending) ou se morreu no upload. Pelo log do pipeline, ele nem instanciou o build — o instantiatebinary foi cortado antes. Então provavelmente não existe nem um objeto Build criado para essas tentativas, o que reforça que o problema é a camada de rede/LB antes do API server, não o builder.
3. Medir o tamanho do payload
O upload incluía sispi-backend.ear + jboss-modules + jboss-deployments. No agente do Azure DevOps:
du -sh /opt/ads-agent/_work/10311/a
du -sh /opt/ads-agent/_work/10311/a/sispi-backend.ear
Se isso for grande (centenas de MB), o POST estoura os 60s e bate no timeout. Esse número é o que vai sustentar o pedido de ajuste no LB.
4. Verificar o balanceador da API (o ponto central)
O unexpected EOF na porta 6443 é o LB/HAProxy do control plane fechando a conexão, não o router de aplicações. Nos nós que fazem o balanceamento da API (geralmente HAProxy externo em cluster self-managed/OKD):
sudo grep -A20 -iE '6443|api' /etc/haproxy/haproxy.cfg
Procure por:
timeout client   ...
timeout server   ...
timeout tunnel   ...
Se timeout client/server estiver em 60s (ou 1m), achamos o culpado. O instantiatebinary é um POST de streaming longo, e idealmente os timeouts para o frontend/backend da API precisam ser bem mais altos (a recomendação de OpenShift para o LB da API costuma ser na casa de minutos — algo como timeout tunnel 1h / timeout server 4m ou mais, dependendo do tamanho dos uploads).
5. Reproduzir o corte de forma controlada
Para confirmar que o corte é por tempo e não por tamanho/erro, dá pra cronometrar uma conexão "ociosa-longa" contra a API:
time curl -sk -o /dev/null -w '%{http_code}\n' \
  https://api.produtos4.caixa:6443/healthz
E, se tiver acesso, observar pelo lado do HAProxy (/var/log/haproxy.log) o código de término da sessão (sH, cD, sD etc.) na hora de um novo oc start-build. Um sD/cD com --/-- perto dos 60s fecha o diagnóstico.
Me passa duas coisas que aceleram bastante: o tamanho do .ear/diretório e o que aparece no grep dos timeouts do haproxy.cfg. Com isso eu te ajudo a decidir entre ajustar o timeout do LB ou enxugar o upload — e a redigir o pedido de mudança, se for o caso.

