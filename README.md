jesse [ ~ ]$ 
jesse [ ~ ]$ az aks get-credentials --resource-group rg-sipdd-des --name aks-sipdd-des --overwrite-existing
Merged "aks-sipdd-des" as current context in /home/jesse/.kube/config
Converted kubeconfig to use Azure CLI authentication.
jesse [ ~ ]$ kubectl get pods -n sigaq-api-gestao-documental
E0909 18:04:27.649246     856 memcache.go:265] "Unhandled Error" err="couldn't get current server API group list: Get \"https://dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io:443/api?timeout=32s\": dial tcp: lookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io on 168.63.129.16:53: no such host"
E0909 18:04:27.667931     856 memcache.go:265] "Unhandled Error" err="couldn't get current server API group list: Get \"https://dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io:443/api?timeout=32s\": dial tcp: lookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io on 168.63.129.16:53: no such host"
E0909 18:04:27.678063     856 memcache.go:265] "Unhandled Error" err="couldn't get current server API group list: Get \"https://dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io:443/api?timeout=32s\": dial tcp: lookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io on 168.63.129.16:53: no such host"
E0909 18:04:27.698490     856 memcache.go:265] "Unhandled Error" err="couldn't get current server API group list: Get \"https://dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io:443/api?timeout=32s\": dial tcp: lookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io on 168.63.129.16:53: no such host"
E0909 18:04:27.712955     856 memcache.go:265] "Unhandled Error" err="couldn't get current server API group list: Get \"https://dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io:443/api?timeout=32s\": dial tcp: lookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io on 168.63.129.16:53: no such host"
Unable to connect to the server: dial tcp: lookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io on 168.63.129.16:53: no such host
jesse [ ~ ]$ 
