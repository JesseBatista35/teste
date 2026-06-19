# Atualizar labels que ainda têm des
sed -i 's/app: simtx-transacoes-lote-des$/app: simtx-transacoes-lote-des2/g' dc-des2.yaml
sed -i 's/application: simtx-transacoes-lote-des$/application: simtx-transacoes-lote-des2/g' dc-des2.yaml

# Atualizar selector
sed -i 's/name: simtx-transacoes-lote-des$/name: simtx-transacoes-lote-des2/g' dc-des2.yaml

# Atualizar referências a secrets e configmaps
sed -i 's/simtx-transacoes-lote-des-script-bt-check/simtx-transacoes-lote-des2-script-bt-check/g' dc-des2.yaml
sed -i 's/bt-client-secret-simtx-transacoes-lote-des/bt-client-secret-simtx-transacoes-lote-des2/g' dc-des2.yaml
sed -i 's/secretName: simtx-transacoes-lote-des$/secretName: simtx-transacoes-lote-des2/g' dc-des2.yaml

# Verificar que ficou certo
echo "=== NAMESPACE ==="
grep "namespace:" dc-des2.yaml | head -1

echo -e "\n=== LABELS E SELECTORS ==="
grep -E "app:|application:|name: simtx" dc-des2.yaml | head -10

# Agora aplicar
oc apply -f dc-des2.yaml
