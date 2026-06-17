Prezados,
Foi realizada investigação conforme solicitado sobre a porta 443 do servidor 10.116.181.172 para APT-BANCARIO.TQS.
DIAGNÓSTICO
Durante a investigação, foi identificado conflito de IPs na infraestrutura. O problema foi resolvido e uma nova VM foi provisionada para APT-BANCARIO.TQS.
SITUAÇÃO ATUAL
Infraestrutura:

VM criada: caddeapllx2598.agil.nprd.caixa.gov.br
IP alocado: 10.116.201.157
Status: OK

Aplicação:

JBoss EAP: NÃO INICIADO
Status: FALHA NA RELEASE DE DEPLOY
Necessário: Investigar e corrigir deploy de APT-BANCARIO

PRÓXIMOS PASSOS
A infraestrutura está pronta. A aplicação APT-BANCARIO precisa ser corrigida na release de deploy antes que a porta 443 possa ser validada.
