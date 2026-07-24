oc get pods -n sipcs-des -l name=sipcs-digital-pay-provisionamento-visa-des -o wide


oc logs <NOME_DO_POD_ATUAL> -n sipcs-des --tail=50


oc exec -n sipcs-des <NOME_DO_POD_ATUAL> -- curl -s -o /dev/null -w "%{http_code}\n" http://localhost:8080/cartoes/cartao-credito/digital-pay/provisionamento/visa/q/health/live

  
