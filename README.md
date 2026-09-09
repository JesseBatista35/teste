kubectl get pods -n sigaq-api-gestao-documental


kubectl exec -n sigaq-api-gestao-documental <nome-do-pod> -- getent hosts sigda-api-quarkus-des.apps.nprd.caixa


kubectl exec -n sigaq-api-gestao-documental <nome-do-pod> -- curl -v --max-time 10 https://sigda-api-quarkus-des.apps.nprd.caixa:443/


kubectl exec -n sigaq-api-gestao-documental <nome-do-pod> -- nc -zv -w 5 10.116.180.64 443



az login
az aks get-credentials --resource-group rg-sipdd-des --name aks-sipdd-des --overwrite-existing
