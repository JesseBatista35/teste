Solicitando um Cloud Shell.Succeeded. 
Connecting terminal...

Welcome to Azure Cloud Shell

Type "az" to use Azure CLI
Type "help" to learn about Cloud Shell

Your Cloud Shell session will be ephemeral so no files or system changes will persist beyond your current session.
jesse [ ~ ]$ az aks command invoke \
  --resource-group rg-sipdd-des \
  --name aks-sipdd-des \
  --command "kubectl get pods -n sigaq-api-gestao-documental"
(ResourceGroupNotFound) Resource group 'rg-sipdd-des' could not be found.
Code: ResourceGroupNotFound
Message: Resource group 'rg-sipdd-des' could not be found.
jesse [ ~ ]$ 
jesse [ ~ ]$ 
jesse [ ~ ]$ az aks command invoke \
  --resource-group rg-sipdd-des \
  --name aks-sipdd-des \
  --command "kubectl get pods -n sigaq-api-gestao-documental"^C
jesse [ ~ ]$ 
jesse [ ~ ]$ 
jesse [ ~ ]$ 
