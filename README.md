sh-4.2$ oc project simtx-des
Now using project "simtx-des" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get deploymentconfig simtx-transacoes-lote-des -n simtx-des -o yaml > dc-des2.yaml
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sed -i 's/simtx-transacoes-lote-des/simtx-transacoes-lote-des2/g' dc-des2.yaml
-sh-4.2$
-sh-4.2$
-sh-4.2$ sed -i 's/namespace: simtx-des/namespace: simtx-des2/g' dc-des2.yaml
-sh-4.2$
-sh-4.2$ sed -i 's/namespace: simtx-des/namespace: simtx-des2/g' dc-des2.yaml
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc apply -f dc-des2.yaml
Error from server (NotFound): error when creating "dc-des2.yaml": namespaces "simtx-des22" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
