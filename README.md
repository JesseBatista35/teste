oc delete route integra.iniciadora -n siinp-tqs

oc create route edge integra.iniciadora \
  --service=siinp-nucleo-web-tqs \
  --hostname=integra.iniciadora.caixa.gov.br \
  --path=/api \
  -n siinp-tqs

oc annotate route integra.iniciadora \
  haproxy.router.openshift.io/rewrite-target=/ \
  -n siinp-tqs --overwrite
