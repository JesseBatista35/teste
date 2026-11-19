
-sh-4.2$ date; POD=$(oc get pods -n sipgc-des --no-headers | grep informacoes | grep Running | awk '{print $1}' | head -1); oc exec -it $POD -n sipgc-des -- bash -c "timeout 5 bash -c '</dev/tcp/des.sigoc.caixa/443' && echo ABERTA || echo SEM CONEXAO"; oc get pod $POD -n sipgc-des -o wide
Qui Nov 19 09:26:59 -03 2026
SEM CONEXAO
NAME                                 READY     STATUS    RESTARTS   AGE       IP            NODE                       NOMINATED NODE   READINESS GATES
sipgc-api-informacoes-des-37-s9497   1/1       Running   0          14d       25.0.18.207   ceadecldlx040.nprd.caixa   <none>           <none>
-sh-4.2$

