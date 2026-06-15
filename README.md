# Rota para frontend (já existe, mas vamos recrear)
oc delete route integra.iniciadora -n siinp-tqs

oc create route edge integra.iniciadora \
  --service=siinp-nucleo-web-tqs \
  --hostname=integra.iniciadora.caixa.gov.br \
  --path=/ \
  -n siinp-tqs

# Rota para API
oc create route edge integra.iniciadora-api \
  --service=siinp-nucleo-tqs \
  --hostname=integra.iniciadora.caixa.gov.br \
  --path=/api \
  -n siinp-tqs

oc annotate route integra.iniciadora-api \
  haproxy.router.openshift.io/rewrite-target=/ \
  -n siinp-tqs --overwrite
 
