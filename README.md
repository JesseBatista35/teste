
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc project sid01-tqs
Now using project "sid01-tqs" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs -f sid01-lancamentos-financeiros-okd4-tqs-49-85nqz -n sid01-tqs
Error from server (NotFound): pods "sid01-lancamentos-financeiros-okd4-tqs-49-85nqz" not found
-sh-4.2$ oc logs sid01-lancamentos-financeiros-okd4-tqs-49-85nqz -n sid01-tqs --previous
Error from server (NotFound): pods "sid01-lancamentos-financeiros-okd4-tqs-49-85nqz" not found
-sh-4.2$ oc describe pod sid01-lancamentos-financeiros-okd4-tqs-49-85nqz -n sid01-tqs
Error from server (NotFound): pods "sid01-lancamentos-financeiros-okd4-tqs-49-85nqz" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                                                   READY     STATUS      RESTARTS          AGE
sid01-api-lnf-tqs-4-sd5kr                              1/1       Running     233 (7h11m ago)   16d
sid01-lancamentos-financeiros-okd4-tqs-49-deploy       0/1       Completed   0                 6h13m
sid01-lancamentos-financeiros-okd4-tqs-50-deploy       0/1       Completed   0                 3h27m
sid01-lancamentos-financeiros-okd4-tqs-50-n6crg        1/1       Running     9 (5m49s ago)     3h27m
sid01-simulador-tqs-201-deploy                         0/1       Completed   0                 100d
sid01-simulador-tqs-202-deploy                         0/1       Completed   0                 93d
sid01-simulador-tqs-202-kc4pr                          1/1       Running     0                 93d
sid01-situacao-lancamentos-financeiros-tqs-17-2z2vp    1/1       Running     0                 14d
sid01-situacao-lancamentos-financeiros-tqs-17-deploy   0/1       Completed   0                 14d
sid01-zosconnproxy-tqs-1-752dk                         2/2       Running     0                 112d
sid01-zosconnproxy-tqs-1-deploy                        0/1       Completed   0                 112d
sid01-zosconnproxy-tqs-1-mxwh9                         2/2       Running     0                 21d
-sh-4.2$
