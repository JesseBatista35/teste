oc get dc sipcs-digital-pay-provisionamento-visa-des -n sipcs-des -o yaml | grep -A15 "livenessProbe\|readinessProbe"

oc rsh sipcs-digital-pay-provisionamento-visa-des-14-sx9jc \
  curl -s -o /dev/null -w "%{http_code}\n" http://localhost:8080/cartoes/cartao-credito/digital-pay/provisionamento/visa/q/health/live

  
