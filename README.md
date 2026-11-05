oc exec -it sipgc-api-informacoes-tqs-90-zczmd -n sipgc-tqs -- bash -c "timeout 5 bash -c '</dev/tcp/des.sigoc.caixa/443' && echo ABERTA || echo SEM CONEXAO"
