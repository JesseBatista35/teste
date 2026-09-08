jesse [ ~ ]$ az aks get-credentials --resource-group rg-sipdd-des --name aks-sipdd-des --overwrite-existing
The behavior of this command has been altered by the following extension: aks-preview
Merged "aks-sipdd-des" as current context in /home/jesse/.kube/config
Converted kubeconfig to use Azure CLI authentication.
jesse [ ~ ]$ kubectl get pods -n sigaq-api-gestao-documental
E0908 17:34:03.987529   16357 memcache.go:381] "Couldn't get current server API group list" err="Get \"https://dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io:443/api?timeout=32s\": dial tcp: lookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io on 168.63.129.16:53: no such host"
E0908 17:34:03.995509   16357 memcache.go:381] "Couldn't get current server API group list" err="Get \"https://dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io:443/api?timeout=32s\": dial tcp: lookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io on 168.63.129.16:53: no such host"
E0908 17:34:04.022602   16357 memcache.go:381] "Couldn't get current server API group list" err="Get \"https://dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io:443/api?timeout=32s\": dial tcp: lookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io on 168.63.129.16:53: no such host"
E0908 17:34:04.029007   16357 memcache.go:381] "Couldn't get current server API group list" err="Get \"https://dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io:443/api?timeout=32s\": dial tcp: lookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io on 168.63.129.16:53: no such host"
E0908 17:34:04.035220   16357 memcache.go:381] "Couldn't get current server API group list" err="Get \"https://dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io:443/api?timeout=32s\": dial tcp: lookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io on 168.63.129.16:53: no such host"
Unable to connect to the server: dial tcp: lookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io on 168.63.129.16:53: no such host
jesse [ ~ ]$ 


e se alteranar para powershell?
