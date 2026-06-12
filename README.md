✅ SOLUÇÃO RÁPIDA
Opção 1: Aumentar a Quota do Namespace (Recomendado)
bash# Ver a quota atual
oc describe resourcequota -n sicia-tqs

# Aumentar a quota de CPU para 10 cores
oc patch resourcequota -n sicia-tqs -p \
  '{"spec":{"hard":{"limits.cpu":"10"}}}'  --type merge

# Verificar depois
oc describe resourcequota -n sicia-tqs
Opção 2: Reduzir CPU dos Pods (Temporário)
Editar o DeploymentConfig:
bashoc set resources dc sicia-frontend-tqs -n sicia-tqs \
  --limits=cpu=250m,memory=512Mi \
  --requests=cpu=250m,memory=512Mi
Opção 3: Deletar Pods Antigos não Usados
bash# Ver todos os pods que estão quebrando
oc get pods -n sicia-tqs | grep deploy

# Limpar manualmente
oc delete pods -n sicia-tqs sicia-frontend-tqs-10-deploy
oc delete pods -n sicia-tqs sicia-frontend-tqs-11-deploy

🧹 Limpeza Recomendada
Você tem vários ReplicationControllers antigos criando pods:
bash# Ver todos os RCs
oc get rc -n sicia-tqs

# Deletar os RCs antigos (versão 10, 11 que estão falhando)
oc delete rc -n sicia-tqs sicia-frontend-tqs-10
oc delete rc -n sicia-tqs sicia-frontend-tqs-11
Depois de aumentar a quota, rode:
bashoc rollout latest dc/sicia-frontend-tqs -n sicia-tqs
Qual opção você quer fazer primeiro? 👆
