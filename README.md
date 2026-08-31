Pessoal, bom dia/tarde.

Rodamos um novo deploy hoje. Preciso que alguém confirme se o erro 500 do SIICO foi resolvido ou se ainda persiste. Ninguém testou ainda por aqui.

Se possível, testem novamente:
- https://api.des.caixa:8443/informacoes-corporativas-publicas/v3/unidades?sigla-unidade=GE
- E qualquer fluxo que dependa de informacoes-corporativas-privadas também, se tiverem acesso

Me retornem com o resultado (se voltou 200 ou continua 500) assim que puderem testar.

Paralelamente, reforçando: o erro ORA-12514 no banco do SILIC (orad02ng) continua ocorrendo, inclusive logo na subida da aplicação após o novo deploy de hoje às 14:40 — ou seja, não foi resolvido pelo deploy e não tem relação com ele. Isso confirma que é um problema do lado do servidor Oracle (listener sem o service_name registrado), não da aplicação. Já está em chamado separado com o time de banco, mas segue impactando múltiplos endpoints (fornecedores, notificações, contratos, planos de aquisição) de forma intermitente ao longo do dia.

Qualquer dúvida tô por aqui. Obrigado!
