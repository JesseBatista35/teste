oc exec -it sipgc-api-seguranca-des-126-m8p6l -n sipgc-des -- bash -c "timeout 5 bash -c '</dev/tcp/10.116.92.247/1433' && echo 'PORTA ABERTA' || echo 'SEM CONEXAO'"

oc exec -it sipgc-api-seguranca-des-126-m8p6l -n sipgc-des -- sqlcmd -S 10.116.92.247,1433 -U SPGCDR01 -P 'Btm693Lx23M7' -Q "SELECT 1"

