Prezados,

Informamos que a alteração solicitada no CronJob agendamento-sisou, no namespace sisou-des (ambiente DES), foi realizada com sucesso.

O campo comando do container foi atualizado conforme especificado na solicitação, contemplando a obtenção de token via Keycloak (client credentials), validações das variáveis de ambiente necessárias (KEYCLOAK_AUTH_SERVER_URL, KEYCLOAK_CREDENTIAL_SECRET e HTTP_SERVICE_API_SAC), e chamada ao endpoint sac/cronjob/indecx/pesquisa-satisfacao com tratamento de erros em cada etapa.

A alteração foi aplicada via patch no cluster OKD, com backup do manifesto original realizado previamente à mudança. A configuração atual do CronJob foi validada por meio do comando oc get cronjob, confirmando que o comando e os argumentos refletem exatamente o script solicitado.

Dessa forma, consideramos concluído o item solicitado nesta W.O.
