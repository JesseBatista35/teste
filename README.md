

Using project "sihdg-hmp".
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sipdm-des
NAME                                 READY     STATUS      RESTARTS   AGE
sipdm-api-estudante-des-265-deploy   0/1       Completed   0          19d
sipdm-api-estudante-des-266-deploy   0/1       Completed   0          3d17h
sipdm-api-estudante-des-266-qlttf    1/1       Running     0          3d17h
sipdm-backend-des-61-deploy          0/1       Completed   0          117d
sipdm-backend-des-62-deploy          0/1       Completed   0          117d
sipdm-backend-des-62-mr8pz           0/1       Running     0          117d
sipdm-frontend-des-21-deploy         0/1       Completed   0          124d
sipdm-frontend-des-22-deploy         0/1       Completed   0          117d
sipdm-frontend-des-22-j7ql7          2/2       Running     0          117d
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh -n sipdm-des sipdm-api-estudante-des-266-qlttf
sh-4.4$
sh-4.4$
sh-4.4$ timeout 5 bash -c '</dev/tcp/10.116.100.127/1433' && echo OK || echo FALHOU
FALHOU
sh-4.4$
sh-4.4$
sh-4.4$ oc logs -n sipdm-des sipdm-api-estudante-des-266-qlttf  --since=10m | grep -iE "SQLServerException|Acquisition timeout|GlobalExceptionHandler|ERROR" | tail -30
sh: oc: command not found
sh-4.4$
sh-4.4$
sh-4.4$ oc get hostsubnet | grep 10.116.221.183
sh: oc: command not found
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$
