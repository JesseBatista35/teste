az network vnet show -g RG-INFRA-SERVICES -n VNET-INFRA-SERVICES --subscription 7dbbb221-d545-4162-9a16-6c4cb75ed4d9 --query "dhcpOptions.dnsServers" -o tsv


nslookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io 10.x.x.x

