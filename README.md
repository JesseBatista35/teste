
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -it sipgc-api-seguranca-des-142-k6762 -n sipgc-des -- getent hosts des.sigoc.caixa
10.116.26.110   des.sigoc.caixa
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -it sipgc-api-seguranca-des-142-k6762 -n sipgc-des -- bash -c "timeout 5 bash -c '</dev/tcp/des.sigoc.caixa/443' && echo ABERTA || echo SEM CONEXAO"
SEM CONEXAO
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -it sipgc-api-seguranca-des-142-k6762 -n sipgc-des -- bash -c "timeout 5 bash -c '</dev/tcp/des.sigoc.caixa/443' && echo ABERTA || echo SEM CONEXAO"
SEM CONEXAO
-sh-4.2$
