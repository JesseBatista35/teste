kubectl get pods -n sigaq-api-gestao-documental


kubectl exec -n sigaq-api-gestao-documental <nome-do-pod> -- getent hosts sigda-api-quarkus-des.apps.nprd.caixa


kubectl exec -n sigaq-api-gestao-documental <nome-do-pod> -- curl -v --max-time 10 https://sigda-api-quarkus-des.apps.nprd.caixa:443/


kubectl exec -n sigaq-api-gestao-documental <nome-do-pod> -- nc -zv -w 5 10.116.180.64 443


Solicitando um Cloud Shell.Succeeded. 
Connecting terminal...

Welcome to Azure Cloud Shell

Type "az" to use Azure CLI
Type "help" to learn about Cloud Shell

Your Cloud Shell session will be ephemeral so no files or system changes will persist beyond your current session.
jesse [ ~ ]$ kubectl get pods -n sigaq-api-gestao-documnetal
E0909 13:51:18.150396     866 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E0909 13:51:18.154893     866 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E0909 13:51:18.160333     866 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E0909 13:51:18.164909     866 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
E0909 13:51:18.167884     866 memcache.go:381] "Couldn't get current server API group list" err="the server has asked for the client to provide credentials"
error: You must be logged in to the server (the server has asked for the client to provide credentials)
jesse [ ~ ]$ 
jesse [ ~ ]$ 
jesse [ ~ ]$ 


a secao de ontem finalizou acho que temos que entra no boz novamente


