oc rsh sipcs-digital-pay-provisionamento-visa-des-16-m66cr \
  curl -s -o /dev/null -w "%{http_code}\n" http://localhost:8080/cartoes/cartao-credito/digital-pay/provisionamento/visa/q/health/live


  oc logs sipcs-digital-pay-provisionamento-visa-des-10-4h6r5 -n sipcs-des --previous


  
