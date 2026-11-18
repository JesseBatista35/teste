$
-sh-4.2$
-sh-4.2$
-sh-4.2$ POD=$(oc get pods -n sipgc-des --no-headers | grep informacoes | grep Running | awk '{print $1}' | head -1); echo "Pod: $POD"; oc exec -it $POD -n sipgc-des -- bash -c "timeout 5 bash -c '</dev/tcp/des.sigoc.caixa/443' && echo ABERTA || echo SEM CONEXAO"
Pod: sipgc-api-informacoes-des-37-s9497
SEM CONEXAO
-sh-4.2$
