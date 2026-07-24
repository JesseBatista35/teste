oc patch dc sipcs-digital-pay-provisionamento-visa-des -n sipcs-des --type=json -p='[
  {"op":"replace","path":"/spec/template/spec/containers/0/livenessProbe/initialDelaySeconds","value":300},
  {"op":"replace","path":"/spec/template/spec/containers/0/livenessProbe/failureThreshold","value":30}
]'


oc rollout status dc/sipcs-digital-pay-provisionamento-visa-des -n sipcs-des

oc get pods -n sipcs-des -l name=sipcs-digital-pay-provisionamento-visa-des

oc exec -n sipcs-des <NOME_DO_POD> -- curl -s -o /dev/null -w "path sem /q/: %{http_code}\n" http://localhost:8080/cartoes/cartao-credito/digital-pay/provisionamento/visa/health/live

oc exec -n sipcs-des <NOME_DO_POD> -- curl -s -o /dev/null -w "path com /q/: %{http_code}\n" http://localhost:8080/cartoes/cartao-credito/digital-pay/provisionamento/visa/q/health/live
