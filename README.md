Nota de encerramento — Análise de comunicação SIECM ↔ SIGAQ (OKD4/AKS)

Realizada análise dos logs da aplicação api-middleware (SIECM) no ambiente OKD4/NPRD referente à comunicação com o SIGAQ (aks-sipdd-des / api.sigaq.des.caixa — IP 10.245.153.7).

Resultado: o log da aplicação analisado (período 21/08 a 26/08) não registra nenhuma tentativa de chamada, requisição ou resposta envolvendo o endpoint/IP do SIGAQ, seja com sucesso ou falha. Não há elementos no log que evidenciem indisponibilidade de comunicação entre as duas aplicações a partir do lado do SIECM.

Foram identificadas, no entanto, três ocorrências não relacionadas ao SIGAQ:

Falha de resolução DNS para o Oracle (cnpexdadvm01-scan4.extra.caixa.gov.br — ORA-17868), recorrente desde 23/08, mantendo o health check da aplicação em DOWN.
Erro de autorização no FileNet (FNRCE0051E — principal c892014 não localizado no domain), relativo a mapeamento de identidade OIDC no Content Engine.
HTTP 404 em duas ocorrências pontuais (25/08), aparentando chamada a rota inexistente.

Encaminhamento sugerido: para confirmar de fato a comunicabilidade com o SIGAQ, recomenda-se teste ativo de conectividade (curl/telnet) direto do pod até o endpoint/IP informado, e validação da regra de firewall entre a rede do OKD4 (10.116.180.64) e o AKS (10.245.153.7), já que o log disponível não permite conclusão sobre esse ponto específico.
