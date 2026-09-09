kubectl get pods -n sigaq-api-gestao-documental


kubectl exec -n sigaq-api-gestao-documental <nome-do-pod> -- getent hosts sigda-api-quarkus-des.apps.nprd.caixa


kubectl exec -n sigaq-api-gestao-documental <nome-do-pod> -- curl -v --max-time 10 https://sigda-api-quarkus-des.apps.nprd.caixa:443/


kubectl exec -n sigaq-api-gestao-documental <nome-do-pod> -- nc -zv -w 5 10.116.180.64 443


jesse [ ~ ]$ 
jesse [ ~ ]$ az login
Cloud Shell is automatically authenticated under the initial account signed-in with. Run 'az login' only if you need to use a different account
To sign in, use a web browser to open the page https://login.microsoft.com/device and enter the code F4LE98HCL to authenticate.
^Cjesse [ ~ ]$ az aks get-credentials --resource-group rg-sipdd-des --name aks-sipdd-des --overwrite-existing
(ResourceGroupNotFound) Resource group 'rg-sipdd-des' could not be found.
Code: ResourceGroupNotFound
Message: Resource group 'rg-sipdd-des' could not be found.
jesse [ ~ ]$
