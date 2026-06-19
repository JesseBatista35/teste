# 1. Deletar DeploymentConfig DES2
oc delete deploymentconfig simtx-transacoes-lote-des2 -n simtx-des

# 2. Deletar Secrets DES2
oc delete secret simtx-transacoes-lote-des2 -n simtx-des
oc delete secret bt-client-secret-simtx-transacoes-lote-des2 -n simtx-des

# 3. Deletar ConfigMap DES2
oc delete configmap simtx-transacoes-lote-des2-script-bt-check -n simtx-des

# 4. Deletar arquivo local
rm dc-des2.yaml

# 5. Verificar se limpou
echo "=== Verificando... ==="
oc get deploymentconfig -n simtx-des | grep transacoes-lote
oc get secret -n simtx-des | grep transacoes-lote-des2
