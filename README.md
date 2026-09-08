az aks command invoke --resource-group rg-sipdd-des --name aks-sipdd-des --command "kubectl get pods -n sigaq-api-gestao-documental"

az extension add --name aks-preview --upgrade

az aks command invoke --resource-group rg-sipdd-des --name aks-sipdd-des --command "kubectl get pods -n sigaq-api-gestao-documental" --output json


az aks get-credentials --resource-group rg-sipdd-des --name aks-sipdd-des --overwrite-existing
kubectl get pods -n sigaq-api-gestao-documental

