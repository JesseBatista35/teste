# 1. Aplicar o DeploymentConfig
oc apply -f dc-des2.yaml

# 2. Copiar o secret original para criar o novo com nome des2
oc get secret simtx-transacoes-lote-des -n simtx-des -o yaml | \
  sed 's/name: simtx-transacoes-lote-des/name: simtx-transacoes-lote-des2/g' | \
  oc create -f -

# 3. Copiar o secret bt-client-secret também
oc get secret bt-client-secret-simtx-transacoes-lote-des -n simtx-des -o yaml | \
  sed 's/name: bt-client-secret-simtx-transacoes-lote-des/name: bt-client-secret-simtx-transacoes-lote-des2/g' | \
  oc create -f -

# 4. Copiar o configmap
oc get configmap simtx-transacoes-lote-des-script-bt-check -n simtx-des -o yaml | \
  sed 's/name: simtx-transacoes-lote-des-script-bt-check/name: simtx-transacoes-lote-des2-script-bt-check/g' | \
  oc create -f -

# 5. Verificar se tudo foi criado
echo "=== DEPLOYMENTCONFIGS ==="
oc get deploymentconfig -n simtx-des | grep transacoes-lote

echo -e "\n=== SECRETS ==="
oc get secret -n simtx-des | grep simtx-transacoes-lote

echo -e "\n=== CONFIGMAPS ==="
oc get configmap -n simtx-des | grep simtx-transacoes-lote

# 6. Verificar status dos pods
echo -e "\n=== PODS ==="
oc get pods -n simtx-des | grep transacoes-lote
