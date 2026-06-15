

Boa tarde pessoal,
Problema identificado e resolvido.
O erro 405 Not Allowed que estava ocorrendo era causado por duas rotas conflitando no mesmo hostname. A rota integra.iniciadora.caixa.gov.br estava apontando para siinp-nucleo-web-tqs (aplicação web) enquanto integra.iniciadora apontava para siinp-nucleo-tqs (API). Quando tentava acessar via Postman, o OpenShift encaminhava para a aplicação web, não para a API, causando o erro 405.
Ações executadas:

Deletei a rota conflitante (integra.iniciadora.caixa.gov.br)
Recriei a rota correta (integra.iniciadora) apontando para siinp-nucleo-tqs

Status atual: API respondendo com sucesso. O erro 401 Unauthorized é esperado, indica que precisa de autenticação.
Solicito que vocês validem no Postman:
POST https://siinp-nucleo-tqs.apps.nprd.caixa/inic-pagto/nucleo/v1/jornada

Content-Type: application/json

Authorization: Bearer {seu_token_aqui}
Ou também pode usar: https://integra.iniciadora.caixa.gov.br/inic-pagto/nucleo/v1/jornada
Por favor, confirmem o resultado do teste.
Abraços.




o front né? apontava pro nucleo-web. 
 
isso
 
por isso que eu falei pra manter o /api no back e retirar na anotação
 
porque vamos precisar da rota pro front também
 
