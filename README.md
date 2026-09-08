az network private-dns zone list -g rg-sipdd-des
az network private-dns record-set list -g rg-sipdd-des -z privatelink.brazilsouth.azmk8s.io --query "[].{name:name}"


nslookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io 168.63.129.16

