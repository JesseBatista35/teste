oc patch dc sipcs-digital-pay-provisionamento-visa-des -n sipcs-des --type=json -p='[
  {"op":"replace","path":"/spec/template/spec/containers/0/livenessProbe/httpGet/path","value":"/q/health/live"},
  {"op":"replace","path":"/spec/template/spec/containers/0/readinessProbe/httpGet/path","value":"/q/health/ready"},
  {"op":"replace","path":"/spec/template/spec/containers/0/livenessProbe/initialDelaySeconds","value":15},
  {"op":"replace","path":"/spec/template/spec/containers/0/livenessProbe/failureThreshold","value":3}
]'


oc rollout status dc/sipcs-digital-pay-provisionamento-visa-des -n sipcs-des
