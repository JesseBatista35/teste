jesse [ ~ ]$ az aks command invoke \
  --resource-group rg-sipdd-des \
  --name aks-sipdd-des \
  --command "kubectl get pods -n sigaq-api-gestao-documental"
Operation returned an invalid status 'OK'
jesse [ ~ ]$ az aks command invoke --resource-group rg-sipdd-des --name aks-sipdd-des --command "kubectl get pods -n sigaq-api-gestao-documental"
Operation returned an invalid status 'OK'
jesse [ ~ ]$ 
jesse [ ~ ]$ 
jesse [ ~ ]$ 
jesse [ ~ ]$ az extension add --name aks-preview --upgrade
No stable version of 'aks-preview' to install. Preview versions allowed.
The installed extension 'aks-preview' is in preview.
jesse [ ~ ]$ az aks command invoke --resource-group rg-sipdd-des --name aks-sipdd-des --command "kubectl get pods -n sigaq-api-gestao-documental"
Operation returned an invalid status 'OK'
jesse [ ~ ]$ az aks command invoke --resource-group rg-sipdd-des --name aks-sipdd-des --command "kubectl get pods -n sigaq-api-gestao-documental" --output json
Operation returned an invalid status 'OK'
jesse [ ~ ]$ az aks get-credentials --resource-group rg-sipdd-des --name aks-sipdd-des --overwrite-existing
kubectl get pods -n sigaq-api-gestao-documental
The behavior of this command has been altered by the following extension: aks-preview
Merged "aks-sipdd-des" as current context in /home/jesse/.kube/config
Converted kubeconfig to use Azure CLI authentication.
E0908 17:31:31.929494   16268 memcache.go:381] "Couldn't get current server API group list" err="Get \"https://dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io:443/api?timeout=32s\": dial tcp: lookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io on 168.63.129.16:53: no such host"
E0908 17:31:31.937721   16268 memcache.go:381] "Couldn't get current server API group list" err="Get \"https://dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io:443/api?timeout=32s\": dial tcp: lookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io on 168.63.129.16:53: no such host"
E0908 17:31:31.945203   16268 memcache.go:381] "Couldn't get current server API group list" err="Get \"https://dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io:443/api?timeout=32s\": dial tcp: lookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io on 168.63.129.16:53: no such host"
E0908 17:31:31.952190   16268 memcache.go:381] "Couldn't get current server API group list" err="Get \"https://dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io:443/api?timeout=32s\": dial tcp: lookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io on 168.63.129.16:53: no such host"
E0908 17:31:31.959668   16268 memcache.go:381] "Couldn't get current server API group list" err="Get \"https://dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io:443/api?timeout=32s\": dial tcp: lookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io on 168.63.129.16:53: no such host"
Unable to connect to the server: dial tcp: lookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io on 168.63.129.16:53: no such host
jesse [ ~ ]$ 
