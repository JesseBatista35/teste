# 1. Deletar o secret que foi criado errado
oc delete secret simtx-transacoes-lote-des2 -n simtx-des

# 2. Deletar o arquivo corrompido
rm dc-des2.yaml

# 3. Deletar o DC des2 se foi criado
oc delete deploymentconfig simtx-transacoes-lote-des2 -n simtx-des --ignore-not-found=true





# Exportar e salvar
oc get deploymentconfig simtx-transacoes-lote-des -n simtx-des -o yaml > dc-des2.yaml

# IMPORTANTE: Verificar o arquivo antes de editar
cat dc-des2.yaml | head -20

# Editar SÓ o nome, mantendo o namespace
sed -i 's/  name: simtx-transacoes-lote-des$/  name: simtx-transacoes-lote-des2/g' dc-des2.yaml
sed -i 's/    name: simtx-transacoes-lote-des$/    name: simtx-transacoes-lote-des2/g' dc-des2.yaml
sed -i 's/      name: simtx-transacoes-lote-des$/      name: simtx-transacoes-lote-des2/g' dc-des2.yaml

# Verificar o arquivo editado
grep "namespace:" dc-des2.yaml | head -3
grep "name:" dc-des2.yaml | head -10

# Se tiver namespace: simtx-des2, desfazer
sed -i 's/namespace: simtx-des2/namespace: simtx-des/g' dc-des2.yaml

# Aplicar
oc apply -f dc-des2.yaml

# Verificar
oc get deploymentconfig -n simtx-des




