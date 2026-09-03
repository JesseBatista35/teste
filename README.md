Pablo, bom ponto.

Pela minha experiência em outras esteiras aqui, o TQS costuma usar o mesmo proxy do DES (proxydes.caixa:80), sem um proxy próprio separado — mas não tenho isso confirmado formalmente pelo CETEL pra esse caso específico, e o DeploymentConfig do TQS ainda não tem nenhuma variável de proxy configurada hoje.

Sugiro o seguinte caminho: já aplico o mesmo bloco de variáveis (HTTP_PROXY/HTTPS_PROXY/NO_PROXY) no sipgc-api-agrupamento-tqs usando o proxydes.caixa:80, igual fizemos no DES, e testamos. Se funcionar, replicamos direto nos outros TQS sem precisar de chamado novo. Se der erro de conectividade, aí sim confirma que TQS precisa de um proxy próprio e abrimos o chamado ao CETEL perguntando o endereço correto.

Assim não perdemos tempo esperando resposta de chamado se a config já for igual, mas também não arriscamos declarar pro CETEL/documentação que "TQS usa proxydes" sem validar.
 
