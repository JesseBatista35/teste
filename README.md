az network private-dns record-set list -g rg-sipdd-des -z aks-sipdd-des.privatelink.brazilsouth.azmk8s.io --query "[].{name:name}" -o table


az aks show -g rg-sipdd-des -n aks-sipdd-des --query "privateFqdn" -o tsv



az aks show -g rg-sipdd-des -n aks-sipdd-des --query "privateFqdn" -o tsv
