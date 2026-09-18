
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc patch dc sid01-lancamentos-financeiros-okd4-tqs -n sid01-tqs --type=json -p='[{"op": "replace", "path": "/spec/template/spec/containers/0/resources/limits/memory", "value": "2Gi"}]'
deploymentconfig.apps.openshift.io/sid01-lancamentos-financeiros-okd4-tqs patched
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sid01-tqs
NAME                                                   READY     STATUS      RESTARTS          AGE
sid01-api-lnf-tqs-4-sd5kr                              1/1       Running     233 (7h22m ago)   16d
sid01-lancamentos-financeiros-okd4-tqs-49-deploy       0/1       Completed   0                 6h24m
sid01-lancamentos-financeiros-okd4-tqs-50-deploy       0/1       Completed   0                 3h37m
sid01-lancamentos-financeiros-okd4-tqs-50-n6crg        1/1       Running     10 (3m43s ago)    3h37m
sid01-simulador-tqs-201-deploy                         0/1       Completed   0                 100d
sid01-simulador-tqs-202-deploy                         0/1       Completed   0                 93d
sid01-simulador-tqs-202-kc4pr                          1/1       Running     0                 93d
sid01-situacao-lancamentos-financeiros-tqs-17-2z2vp    1/1       Running     0                 14d
sid01-situacao-lancamentos-financeiros-tqs-17-deploy   0/1       Completed   0                 14d
sid01-zosconnproxy-tqs-1-752dk                         2/2       Running     0                 112d
sid01-zosconnproxy-tqs-1-deploy                        0/1       Completed   0                 112d
sid01-zosconnproxy-tqs-1-mxwh9                         2/2       Running     0                 21d
-sh-4.2$
