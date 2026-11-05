# 1. Host do SIGOC TQS que a API de Informações usa
oc exec -it <pod-sipgc-api-informacoes-tqs> -n sipgc-tqs -- env | grep -i sigoc

# 2. Com o host acima, DNS e porta 443 em TQS
oc exec -it <pod-sipgc-api-informacoes-tqs> -n sipgc-tqs -- getent hosts <host-sigoc-tqs>
oc exec -it <pod-sipgc-api-informacoes-tqs> -n sipgc-tqs -- bash -c "timeout 5 bash -c '</dev/tcp/<host-sigoc-tqs>/443' && echo ABERTA || echo SEM CONEXAO"

# 3. Egress IP (se você tiver permissão)
oc get egressip
