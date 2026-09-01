Pessoal, atualização sobre o 504 do SIPGC:

A solicitação de regra de firewall que tínhamos aberto foi cancelada, pois o sistema não permite regra direta de firewall partindo de ambiente Não Produção (DES) para Internet (regra de negócio ID 43365) — esse tipo de acesso precisa obrigatoriamente passar pelo PROXYDES.

Então abri uma nova solicitação, agora do tipo Proxy, liberando o domínio login.microsoftonline.com (necessário para a validação de token Azure AD do sipgc-api-agrupamento-des).

Protocolo: REQ000145689716
Aguardando aprovação do gestor. Assim que for liberada, revalidamos a chamada do front → API.


Atualização do diagnóstico: o erro 504 é causado pela ausência de acesso do ambiente OKD DES a login.microsoftonline.com, necessário para a validação de token Azure AD da aplicação SIPGC (sipgc-api-agrupamento-des).

A solicitação de regra de firewall aberta inicialmente foi cancelada, pois o sistema não autoriza regra direta de firewall de ambiente Não Produção (DES) para Internet (bloqueio pela regra de negócio ID 43365) — esse tipo de fluxo precisa ser feito via PROXYDES.

Em substituição, foi aberta solicitação de liberação de proxy: REQ000145689716 (ARNOTE 150370).

Favor acompanhar essa nova REQ para aprovação e aplicação da liberação. Este chamado pode ser encerrado/vinculado à REQ000145689716 como acompanhamento.
