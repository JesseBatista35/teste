# 1. Verificar o ConfigMap do nginx
kubectl get configmap -n sicia-tqs nginx-conf-d-sicia-frontend -o yaml

# 2. Forçar rollback para a versão anterior (que está funcionando)
kubectl rollout undo -n sicia-tqs dc/sicia-frontend-tqs

# 3. Se precisar fazer debug, aumentar timeout temporariamente
kubectl patch dc sicia-frontend-tqs -n sicia-tqs -p \
  '{"spec":{"strategy":{"rollingParams":{"timeoutSeconds":1800}}}}'

# 4. Ver histórico de deployments
kubectl rollout history -n sicia-tqs dc/sicia-frontend-tqs
