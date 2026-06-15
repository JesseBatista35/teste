oc delete route integra.iniciadora -n siinp-tqs

oc create route edge integra.iniciadora \
  --service=siinp-nucleo-web-tqs \
  --hostname=integra.iniciadora.caixa.gov.br \
  -n siinp-tqs

oc annotate route integra.iniciadora \
  haproxy.router.openshift.io/rewrite-target=/api \
  -n siinp-tqs --overwrite
