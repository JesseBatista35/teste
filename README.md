
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ getent hosts sipgc-api-informacoes-tqs.apps.nprd.caixa
10.116.180.64   sipgc-api-informacoes-tqs.apps.nprd.caixa
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -it sipgc-api-informacoes-des-37-s9497 -n sipgc-des -- bash -c "timeout 5 bash -c '</dev/tcp/des.sigoc.caixa/443' && echo ABERTA || echo SEM CONEXAO"
SEM CONEXAO
-sh-4.2$
