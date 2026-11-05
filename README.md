getent hosts sipgc-api-informacoes-tqs.apps.nprd.caixa

oc exec -it sipgc-api-informacoes-des-37-s9497 -n sipgc-des -- bash -c "timeout 5 bash -c '</dev/tcp/des.sigoc.caixa/443' && echo ABERTA || echo SEM CONEXAO"
