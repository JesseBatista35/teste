jesse [ ~ ]$ az network private-dns link vnet list -g rg-sipdd-des -z aks-sipdd-des.privatelink.brazilsouth.azmk8s.io -o table
LinkName                               ResourceGroup    RegistrationEnabled    VirtualNetwork                                                                                                                                           LinkState    ProvisioningState
-------------------------------------  ---------------  ---------------------  -------------------------------------------------------------------------------------------------------------------------------------------------------  -----------  -------------------
dns-aks-sipdd-des-ebg0b8an             rg-sipdd-des     False                  /subscriptions/ac793a00-3e83-4465-b8b0-0fb44a91b916/resourceGroups/rg-vnet-gestaoarq-des/providers/Microsoft.Network/virtualNetworks/VNET-GESTAOARQ-DES  Completed    Succeeded
vnetlink-privatednszone-aks-sipdd-des  rg-sipdd-des     False                  /subscriptions/7dbbb221-d545-4162-9a16-6c4cb75ed4d9/resourceGroups/RG-INFRA-SERVICES/providers/Microsoft.Network/virtualNetworks/VNET-INFRA-SERVICES     Completed    Succeeded
jesse [ ~ ]$ 
jesse [ ~ ]$ 
jesse [ ~ ]$ 
jesse [ ~ ]$ 
jesse [ ~ ]$ nslookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io <IP-do-resolver-interno>
bash: syntax error near unexpected token `newline'
jesse [ ~ ]$ 
jesse [ ~ ]$ 
jesse [ ~ ]$ 
