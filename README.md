# 1. LISTA TODOS OS PODS AGORA
oc get pods -n sicia-tqs

# 2. VER OS ÚLTIMOS EVENTOS (erros de criação)
oc get events -n sicia-tqs -o wide

# 3. DESCREVER O DEPLOYMENTCONFIG COMPLETO
oc describe dc sicia-frontend-tqs -n sicia-tqs

# 4. VER QUAL POD ESTÁ RESPONDENDO (provavelmente o antigo)
oc get pods -n sicia-tqs -o jsonpath='{.items[*].metadata.name}'

