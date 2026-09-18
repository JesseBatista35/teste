
-sh-4.2$ oc get pods -n sid01-tqs
NAME                                                   READY     STATUS        RESTARTS          AGE
sid01-api-lnf-tqs-4-sd5kr                              1/1       Running       233 (7h25m ago)   16d
sid01-lancamentos-financeiros-okd4-tqs-50-deploy       0/1       Completed     0                 3h41m
sid01-lancamentos-financeiros-okd4-tqs-50-n6crg        1/1       Terminating   10 (7m3s ago)     3h41m
sid01-lancamentos-financeiros-okd4-tqs-51-deploy       0/1       Completed     0                 86s
sid01-lancamentos-financeiros-okd4-tqs-51-lz9pd        1/1       Running       0                 83s
sid01-simulador-tqs-201-deploy                         0/1       Completed     0                 100d
sid01-simulador-tqs-202-deploy                         0/1       Completed     0                 93d
sid01-simulador-tqs-202-kc4pr                          1/1       Running       0                 93d
sid01-situacao-lancamentos-financeiros-tqs-17-2z2vp    1/1       Running       0                 14d
sid01-situacao-lancamentos-financeiros-tqs-17-deploy   0/1       Completed     0                 14d
sid01-zosconnproxy-tqs-1-752dk                         2/2       Running       0                 112d
sid01-zosconnproxy-tqs-1-deploy                        0/1       Completed     0                 112d
sid01-zosconnproxy-tqs-1-mxwh9                         2/2       Running       0                 21d
-sh-4.2$ oc adm top pod sid01-lancamentos-financeiros-okd4-tqs-51-lz9pd -n sid01-tqs
NAME                                              CPU(cores)   MEMORY(bytes)
sid01-lancamentos-financeiros-okd4-tqs-51-lz9pd   59m          783Mi
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
