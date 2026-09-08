Solicitando um Cloud Shell.Succeeded. 
Connecting terminal...

Welcome to Azure Cloud Shell

Type "az" to use Azure CLI
Type "help" to learn about Cloud Shell

Your Cloud Shell session will be ephemeral so no files or system changes will persist beyond your current session.
jesse [ ~ ]$ az account set --subscription ac793a00-3e83-4465-b8b0-0fb44a91b916
jesse [ ~ ]$ 
jesse [ ~ ]$ 
jesse [ ~ ]$ 
jesse [ ~ ]$ az account show --output table
EnvironmentName    HomeTenantId                          IsDefault    Name                             State    TenantId
-----------------  ------------------------------------  -----------  -------------------------------  -------  ------------------------------------
AzureCloud         ab9bba98-684a-43fb-add8-9c2bebede229  True         BOX - Gestão Arquivística - DES  Enabled  ab9bba98-684a-43fb-add8-9c2bebede229
jesse [ ~ ]$ az group show --name rg-sipdd-des
{
  "id": "/subscriptions/ac793a00-3e83-4465-b8b0-0fb44a91b916/resourceGroups/rg-sipdd-des",
  "location": "brazilsouth",
  "managedBy": null,
  "name": "rg-sipdd-des",
  "properties": {
    "provisioningState": "Succeeded"
  },
  "tags": {
    "Ambiente": "des",
    "EquipeInfra": "COE",
    "EquipeSolucao": "BOX",
    "Provimento": "Terraform",
    "Solucao": "sipdd",
    "Workload": "sipdd"
  },
  "type": "Microsoft.Resources/resourceGroups"
}
jesse [ ~ ]$ 
