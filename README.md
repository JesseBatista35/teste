# Deletar o DeploymentConfig errado que foi criado
oc delete deploymentconfig simtx-transacoes-lote-des2 -n simtx-des2

# Deletar o namespace que foi criado errado
oc delete project simtx-des2

# Deletar o arquivo local
rm dc-des2.yaml



# Voltar para simtx-des
oc project simtx-des

# Exportar o DC atual
oc get deploymentconfig simtx-transacoes-lote-des -n simtx-des -o yaml > dc-des2.yaml

# Editar SÓ os nomes dos resources (mantendo namespace: simtx-des)
sed -i 's/name: simtx-transacoes-lote-des$/name: simtx-transacoes-lote-des2/g' dc-des2.yaml
# NÃO altera namespace, mantém simtx-des

# Copiar os secrets com novo nome dentro de simtx-des
oc get secret simtx-transacoes-lote-des -n simtx-des -o yaml | \
  sed 's/name: simtx-transacoes-lote-des/name: simtx-transacoes-lote-des2/g' | \
  oc apply -f -

# Aplicar
oc apply -f dc-des2.yaml

# Verificar
oc get deploymentconfig -n simtx-des | grep transacoes-lote
