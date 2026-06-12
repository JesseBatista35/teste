# VERIFICAR se a quota foi aumentada
oc describe resourcequota quota-resources -n sicia-tqs

# DELETAR os RCs antigos que estão quebrados
oc delete rc -n sicia-tqs sicia-frontend-tqs-10 sicia-frontend-tqs-11 --ignore-not-found

# RODAR o deployment novamente
oc rollout latest dc/sicia-frontend-tqs -n sicia-tqs

# MONITORAR (Ctrl+C para sair)
oc get pods -n sicia-tqs -w
