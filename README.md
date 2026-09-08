jesse [ ~ ]$ az network private-dns record-set list -g rg-sipdd-des -z aks-sipdd-des.privatelink.brazilsouth.azmk8s.io --query "[].{name:name}" -o table
Name
--------------------------
@
dns-aks-sipdd-des-ebg0b8an
jesse [ ~ ]$ az aks show -g rg-sipdd-des -n aks-sipdd-des --query "privateFqdn" -o tsv
The behavior of this command has been altered by the following extension: aks-preview
dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io
jesse [ ~ ]$ az aks show -g rg-sipdd-des -n aks-sipdd-des --query "privateFqdn" -o tsv
The behavior of this command has been altered by the following extension: aks-preview
dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io
jesse [ ~ ]$ 
