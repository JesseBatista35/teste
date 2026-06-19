-sh-4.2$ oc apply -f dc-des2.yaml
deploymentconfig.apps.openshift.io/simtx-transacoes-lote-des2 created
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get secret simtx-transacoes-lote-des -n simtx-des -o yaml | \
>   sed 's/name: simtx-transacoes-lote-des/name: simtx-transacoes-lote-des2/g' | \
>   oc create -f -
secret/simtx-transacoes-lote-des2 created
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get secret bt-client-secret-simtx-transacoes-lote-des -n simtx-des -o yaml | \
>   sed 's/name: bt-client-secret-simtx-transacoes-lote-des/name: bt-client-secret-simtx-transacoes-lote-des2/g' | \
>   oc create -f -
secret/bt-client-secret-simtx-transacoes-lote-des2 created
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get configmap simtx-transacoes-lote-des-script-bt-check -n simtx-des -o yaml | \
>   sed 's/name: simtx-transacoes-lote-des-script-bt-check/name: simtx-transacoes-lote-des2-script-bt-check/g' | \
>   oc create -f -
configmap/simtx-transacoes-lote-des2-script-bt-check created
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ echo "=== DEPLOYMENTCONFIGS ==="
=== DEPLOYMENTCONFIGS ===
-sh-4.2$ oc get deploymentconfig -n simtx-des | grep transacoes-lote
simtx-transacoes-lote-batch-des                     136        1         1
simtx-transacoes-lote-des                           801        1         1
simtx-transacoes-lote-des2                          0          1         0
simtx-transacoes-lote-processamento-des             114        1         1
simtx-transacoes-lote-worker-des                    8          1         0
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get secret -n simtx-des | grep simtx-transacoes-lote
bt-client-secret-simtx-transacoes-lote-des                        Opaque                                2         238d
bt-client-secret-simtx-transacoes-lote-des2                       Opaque                                2         19s
bt-client-secret-simtx-transacoes-lote-processamento-des          Opaque                                2         245d
bt-client-secret-simtx-transacoes-lote-worker-des                 Opaque                                2         3d
simtx-transacoes-lote-batch-des                                   Opaque                                8         23d
simtx-transacoes-lote-des                                         Opaque                                8         10m
simtx-transacoes-lote-des2                                        Opaque                                8         26s
simtx-transacoes-lote-processamento-des                           Opaque                                8         3d
simtx-transacoes-lote-worker-des                                  Opaque                                5         45h
-sh-4.2$
-sh-4.2$ oc get configmap -n simtx-des | grep simtx-transacoes-lote
simtx-transacoes-lote-des-script-bt-check                 1         238d
simtx-transacoes-lote-des2-script-bt-check                1         20s
simtx-transacoes-lote-processamento-des-script-bt-check   1         245d
simtx-transacoes-lote-worker-des-script-bt-check          1         3d
-sh-4.2$
-sh-4.2$
-sh-4.2$ echo -e "\n=== PODS ==="

=== PODS ===
-sh-4.2$ oc get pods -n simtx-des | grep transacoes-lote
simtx-transacoes-lote-batch-des-135-deploy           0/1       Completed   0               43d
simtx-transacoes-lote-batch-des-136-9pqph            1/1       Running     2 (6d19h ago)   17d
simtx-transacoes-lote-batch-des-136-deploy           0/1       Completed   0               23d
simtx-transacoes-lote-des-800-deploy                 0/1       Completed   0               28m
simtx-transacoes-lote-des-801-78rnh                  1/1       Running     0               9m52s
simtx-transacoes-lote-des-801-deploy                 0/1       Completed   0               9m56s
simtx-transacoes-lote-processamento-des-113-deploy   0/1       Completed   0               3d
simtx-transacoes-lote-processamento-des-114-7chzh    1/1       Running     1 (6h56m ago)   3d
simtx-transacoes-lote-processamento-des-114-deploy   0/1       Completed   0               3d
-sh-4.2$
-sh-4.2$
