# Rotas e tipo de terminação TLS
oc get routes
oc get routes -o yaml | grep -B2 -A8 "tls:"

# Services e portas
oc get svc -o wide

# DeploymentConfigs (é DC, pelo padrão "-25-deploy")
oc get dc

# Por que o frontend não sobe
oc describe pod sipar-inter-frontend-des-28-ks9fm | tail -20
oc logs sipar-inter-frontend-des-31-deploy
