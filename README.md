jesse [ ~ ]$ 
jesse [ ~ ]$ az network vnet show -g RG-INFRA-SERVICES -n VNET-INFRA-SERVICES --subscription 7dbbb221-d545-4162-9a16-6c4cb75ed4d9 --query "dhcpOptions.dnsServers" -o tsv
10.244.37.197
10.244.37.198
jesse [ ~ ]$ 
jesse [ ~ ]$ 
jesse [ ~ ]$ 
jesse [ ~ ]$ nslookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io 10.244.37.198
;; communications error to 10.244.37.198#53: timed out
;; communications error to 10.244.37.198#53: timed out
;; communications error to 10.244.37.198#53: timed out
;; no servers could be reached

jesse [ ~ ]$ nslookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io 10.244.37.197
;; communications error to 10.244.37.197#53: timed out
;; communications error to 10.244.37.197#53: timed out
;; communications error to 10.244.37.197#53: timed out
;; no servers could be reached

jesse [ ~ ]$ 
