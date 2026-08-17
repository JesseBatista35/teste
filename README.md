
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -it sipgc-api-seguranca-des-126-m8p6l -n sipgc-des -- bash -c "timeout 5 bash -c '</dev/tcp/10.116.92.247/1433' && echo 'PORTA ABERTA' || echo 'SEM CONEXAO'"
PORTA ABERTA
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -it sipgc-api-seguranca-des-126-m8p6l -n sipgc-des -- sqlcmd -S 10.116.92.247,1433 -U SPGCDR01 -P 'Btm693Lx23M7' -Q "SELECT 1"
ERRO[0000] exec failed: unable to start container process: exec: "sqlcmd": executable file not found in $PATH
command terminated with exit code 255
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$


