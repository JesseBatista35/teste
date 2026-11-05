oc exec -it sipgc-api-informacoes-tqs-90-zczmd -n sipgc-tqs -- getent hosts hom.sigoc.caixa
oc exec -it sipgc-api-informacoes-tqs-90-zczmd -n sipgc-tqs -- bash -c "timeout 5 bash -c '</dev/tcp/hom.sigoc.caixa/443' && echo ABERTA || echo SEM CONEXAO"oc exec -it sipgc-api-informacoes-tqs-90-zczmd -n sipgc-tqs -- getent hosts hom.sigoc.caixa
oc exec -it sipgc-api-informacoes-tqs-90-zczmd -n sipgc-tqs -- bash -c "timeout 5 bash -c '</dev/tcp/hom.sigoc.caixa/443' && echo ABERTA || echo SEM CONEXAO"
