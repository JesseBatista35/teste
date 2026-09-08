az aks command invoke \
  --resource-group rg-sipdd-des \
  --name aks-sipdd-des \
  --command "kubectl get pods -n sigaq-api-gestao-documental"
