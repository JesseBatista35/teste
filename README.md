# 1. VER TODOS OS PODS DO BACKEND
oc get pods -n sicia-tqs | grep backend

# 2. VER A QUOTA ATUAL
oc describe resourcequota quota-resources -n sicia-tqs

# 3. VER DETALHES DO DEPLOYMENT CONFIG DO BACKEND
oc describe dc sicia-backend-tqs -n sicia-tqs

# 4. VER OS EVENTOS RECENTES
oc get events -n sicia-tqs -o wide | grep backend
