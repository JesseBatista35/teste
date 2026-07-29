oc patch deployment sispl-processamento-sumarizacao-des -n sispl-des --type='json' -p='[
  {"op":"replace","path":"/spec/template/spec/containers/0/livenessProbe/timeoutSeconds","value":5},
  {"op":"replace","path":"/spec/template/spec/containers/0/readinessProbe/timeoutSeconds","value":5}
]'

oc rollout status deployment/sispl-processamento-sumarizacao-des -n sispl-des

oc exec -it sispl-processamento-sumarizacao-des-574688844-rkvrn -n sispl-des -- cat /opt/jboss/bin/livenessProbe.sh
