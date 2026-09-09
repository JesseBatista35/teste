jesse [ ~ ]$ az account set --subscription ac793a00-3e83-4465-b8b0-0fb44a91b916
jesse [ ~ ]$ 
jesse [ ~ ]$ 
jesse [ ~ ]$ az aks get-credentials --resource-group rg-sipdd-des --name aks-sipdd-des --overwrite-existing
Merged "aks-sipdd-des" as current context in /home/jesse/.kube/config
Converted kubeconfig to use Azure CLI authentication.
jesse [ ~ ]$ 
jesse [ ~ ]$ 
jesse [ ~ ]$ kubectl get pods -n sigaq-api-gestao-documental
E0909 13:55:15.424731    1077 memcache.go:381] "Couldn't get current server API group list" err="Get \"https://dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io:443/api?timeout=32s\": dial tcp: lookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io on 168.63.129.16:53: no such host"
E0909 13:55:15.433943    1077 memcache.go:381] "Couldn't get current server API group list" err="Get \"https://dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io:443/api?timeout=32s\": dial tcp: lookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io on 168.63.129.16:53: no such host"
E0909 13:55:15.441531    1077 memcache.go:381] "Couldn't get current server API group list" err="Get \"https://dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io:443/api?timeout=32s\": dial tcp: lookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io on 168.63.129.16:53: no such host"
E0909 13:55:15.451697    1077 memcache.go:381] "Couldn't get current server API group list" err="Get \"https://dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io:443/api?timeout=32s\": dial tcp: lookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io on 168.63.129.16:53: no such host"
E0909 13:55:15.458528    1077 memcache.go:381] "Couldn't get current server API group list" err="Get \"https://dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io:443/api?timeout=32s\": dial tcp: lookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io on 168.63.129.16:53: no such host"
Unable to connect to the server: dial tcp: lookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io on 168.63.129.16:53: no such host
jesse [ ~ ]$ 
jesse [ ~ ]$ 
jesse [ ~ ]$
