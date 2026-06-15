oc delete route integra.iniciadora -n siinp-tqs
Depois recrie:
bashoc create route edge integra.iniciadora \
  --service=siinp-nucleo-tqs \
  --hostname=integra.iniciadora.caixa.gov.br \
  --path=/ \
  -n siinp-tqs
