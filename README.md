oc run sqlcmd-test --rm -it --restart=Never --image=mcr.microsoft.com/mssql-tools -n sipgc-des -- /opt/mssql-tools/bin/sqlcmd -S 10.116.92.247,1433 -U SPGCDR01 -P 'Btm693Lx23M7' -Q "SELECT 1"



