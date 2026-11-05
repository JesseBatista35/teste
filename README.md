# 1. DNS resolve?
oc exec -it sipgc-api-seguranca-des-142-k6762 -n sipgc-des -- getent hosts des.sigoc.caixa

# 2. Porta 443 abre?
oc exec -it sipgc-api-seguranca-des-142-k6762 -n sipgc-des -- bash -c "timeout 5 bash -c '</dev/tcp/des.sigoc.caixa/443' && echo ABERTA || echo SEM CONEXAO"

oc exec -it sipgc-api-seguranca-des-142-k6762 -n sipgc-des -- bash -c "timeout 5 bash -c '</dev/tcp/des.sigoc.caixa/443' && echo ABERTA || echo SEM CONEXAO"

