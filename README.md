bashoc create route edge integra.iniciadora \
  --service=siinp-nucleo-tqs \
  --hostname=integra.iniciadora.caixa.gov.br \
  --path=/ \
  -n siinp-tqs
Depois teste:
bashcurl -v -X POST https://integra.iniciadora.caixa.gov.br/inic-pagto/nucleo/v1/jornada \
  -H "Content-Type: application/json" \
  -d '{"valor": "25.00"}' -k
Dessa vez deve retornar 401 Unauthorized (que é correto - precisa de autenticação), não 405! 🎉
Manda aí o resultado! 👊
