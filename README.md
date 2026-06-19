1. Reconstruir o arquivo corretamente:
bash# Deletar o arquivo errado
rm dc-des2.yaml

# Exportar novamente
oc get deploymentconfig simtx-transacoes-lote-des -n simtx-des -o yaml > dc-des2.yaml

# Fazer APENAS UMA substituição por linha
sed -i 's/name: simtx-transacoes-lote-des/name: simtx-transacoes-lote-des2/g' dc-des2.yaml
sed -i 's/namespace: simtx-des$/namespace: simtx-des2/g' dc-des2.yaml
2. Criar o namespace DES2 primeiro:
bashoc new-project simtx-des2
3. Depois aplicar o DeploymentConfig:
bashoc apply -f dc-des2.yaml
4. Copiar os Secrets necessários:
bash# Copiar todos os secrets do DES para DES2
oc get secrets -n simtx-des | grep simtx-transacoes-lote-des | awk '{print $1}' | while read secret; do
  NEW_SECRET=$(echo $secret | sed 's/simtx-transacoes-lote-des/simtx-transacoes-lote-des2/g')
  oc get secret $secret -n simtx-des -o yaml | \
    sed "s/name: $secret/name: $NEW_SECRET/g" | \
    sed 's/namespace: simtx-des/namespace: simtx-des2/g' | \
    oc apply -f -
done
5. Copiar ConfigMaps também:
bashoc get configmaps -n simtx-des | grep simtx-transacoes-lote-des | awk '{print $1}' | while read cm; do
  NEW_CM=$(echo $cm | sed 's/simtx-transacoes-lote-des/simtx-transacoes-lote-des2/g')
  oc get configmap $cm -n simtx-des -o yaml | \
    sed "s/name: $cm/name: $NEW_CM/g" | \
    sed 's/namespace: simtx-des/namespace: simtx-des2/g' | \
    oc apply -f -
done
6. Verificar se criou corretamente:
bashoc get deploymentconfig -n simtx-des2
oc describe dc simtx-transacoes-lote-des2 -n simtx-des2
Tenta rodar esses comandos agora! 👍
