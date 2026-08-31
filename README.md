Pessoal, bom dia/tarde.

Confirmado: o SIICO voltou a funcionar normalmente após o deploy de hoje. Testamos novamente o endpoint https://api.des.caixa:8443/informacoes-corporativas-publicas/v3/unidades?sigla-unidade=GE e o retorno já está OK (sem mais 500). O circuit breaker do SILIC (InfoCorpPrivadasClient) também parou de abrir.

Com isso, considero essa demanda do SIICO encerrada. Obrigado a todos pelo apoio no diagnóstico e pela agilidade no deploy.

Importante reforçar: o erro ORA-12514 no banco do SILIC (orad02ng, host cnpexdadvm01-scan4.extra.caixa.gov.br:1521) é uma questão à parte, não relacionada ao SIICO nem resolvida por esse deploy — já confirmamos que ele persiste mesmo em subidas novas da aplicação. Esse ponto segue em chamado separado com o time de banco e continua em aberto.

Qualquer coisa tô por aqui. Obrigado!
