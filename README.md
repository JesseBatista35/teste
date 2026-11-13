Edson, Rodrigo, analisamos o 401 do ccr-api (/credito-consignado/v8/contratos/simular).

Causa: o token usado no teste (canal cli-web-pnc) é emitido pelo realm intranet (login.des.caixa), mas o ccr-api.war está configurado para aceitar apenas tokens do realm internet (logindes.caixa.gov.br). O servidor não encontra a chave do token (kid MFeJ65..., que pertence ao realm intranet) e recusa a requisição. Log: AdapterTokenVerifier – Didn't find publicKey for kid.

Não é diferença de ambiente: a configuração do ccr-api no JBoss 7.4 é idêntica à do 6.4 (realm internet, client cli-ser-fec_api, bearer-only). No ambiente local funciona porque lá não há validação de token.

Caminhos possíveis:

Usar nos testes um token emitido pelo realm internet (logindes.caixa.gov.br), que é o configurado para o ccr-api; ou
Se o ccr-api precisar aceitar o canal cli-web-pnc (intranet), isso é uma mudança de configuração em relação ao 6.4 e precisa ser definida por vocês, porque pode afetar os consumidores do realm internet.

Vocês conseguem confirmar se o mesmo teste funciona no 6.4 com esse token?
