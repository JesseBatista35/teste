# Verificar status do DeploymentConfig
oc describe deploymentconfig simtx-transacoes-lote-des2 -n simtx-des

# Ver os eventos
oc describe deploymentconfig simtx-transacoes-lote-des2 -n simtx-des | tail -50

# Verificar logs se houver algum pod tentando subir
oc get pods -n simtx-des | grep des2

# Se tiver pod, ver logs
oc logs <pod-name> -n simtx-des

# Se não tiver, pode ser que precisa triggar o deploy
oc rollout latest simtx-transacoes-lote-des2 -n simtx-des
