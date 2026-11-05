
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -it sipgc-api-informacoes-tqs-90-zczmd -n sipgc-tqs -- getent hosts hom.sigoc.caixa
10.123.20.225   rs0000sr625.corp.caixa.gov.br hom.sigoc.caixa
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -it sipgc-api-informacoes-tqs-90-zczmd -n sipgc-tqs -- bash -c "timeout 5 bash -c '</dev/tcp/hom.sigoc.caixa/443' && echo ABERTA || echo SEM CONEXAO"oc exec -it sipgc-api-informacoes-tqs-90-zczmd -n sipgc-tqs -- getent hosts hom.sigoc.caixa
SEM CONEXAOoc
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -it sipgc-api-informacoes-tqs-90-zczmd -n sipgc-tqs -- bash -c "timeout 5 bash -c '</dev/tcp/hom.sigoc.caixa/443' && echo ABERTA || echo SEM CONEXAO"
SEM CONEXAO
-sh-4.2$
