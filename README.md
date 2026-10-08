kubectl get azurekeyvaultsecret -n aks-istio-ingress akvs-siagf-api-jornadas
kubectl describe azurekeyvaultsecret -n aks-istio-ingress akvs-siagf-api-jornadas

kubectl get deploy,rs,pod,svc,cm -n siagf-api-jornadas
kubectl get virtualservice,gateway -n siagf-api-jornadas
kubectl describe pod -n siagf-api-jornadas -l app.kubernetes.io/name=siagf-api-jornadas
