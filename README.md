Pablo, bom ponto.

Pela minha experiência em outras esteiras aqui, o TQS costuma usar o mesmo proxy do DES (proxydes.caixa:80), sem um proxy próprio separado — mas não tenho isso confirmado formalmente pelo CETEL pra esse caso específico.

Hoje o Variable Group SIPGC-API-AGRUPAMENTO-TQS no Azure DevOps ainda não tem as variáveis _ENV.HTTP_PROXY, _ENV.HTTPS_PROXY e _ENV.NO_PROXY configuradas — só temos DB_SCHEMA, BD_SERVER, DB_DATABASE, DB_USER_001 e DB_PASSWORD_001.

Sugiro o seguinte caminho:

Vocês configuram essas 3 variáveis no Variable Group do TQS, usando proxydes.caixa:80 (mesmo valor do DES)
A gente aplica e testa no sipgc-api-agrupamento-tqs
Se funcionar, replicamos direto nos outros serviços TQS sem precisar de chamado novo
Se der erro de conectividade, aí sim confirma que TQS precisa de um proxy próprio, e abrimos chamado ao CETEL perguntando o endereço correto

Assim não perdemos tempo esperando resposta de chamado se a config já for igual, mas também não arriscamos declarar pro CETEL/documentação que "TQS usa proxydes" sem validar antes.
