Solução:
Delete a rota que está conflitando:
bashoc delete route integra.iniciadora.caixa.gov.br
Depois teste novamente:
bashcurl -v -X POST https://integra.iniciadora.caixa.gov.br/inic-pagto/nucleo/v1/jornada \
  -H "Content-Type: application/json" \
  -d '{"valor": "25.00"}' -k
Dessa vez deve retornar 401 Unauthorized (como fez na outra rota), não 405! 🎉
Manda aí o resultado! 👊
