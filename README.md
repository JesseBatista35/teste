# Copiar o YAML atual para des2
oc get deploymentconfig simtx-transacoes-lote-des -n simtx-des -o yaml > dc-des2.yaml

# Editar o arquivo e fazer os seguintes replacements:
sed -i 's/simtx-transacoes-lote-des/simtx-transacoes-lote-des2/g' dc-des2.yaml
sed -i 's/namespace: simtx-des/namespace: simtx-des2/g' dc-des2.yaml

# Aplicar
oc apply -f dc-des2.yaml
