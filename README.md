Aqui está a nota, direta para colar na sala/Temas:

Atualização técnica — REQ000145554756 (demanda já encerrada, acompanhamento em sala)

Testes de conectividade realizados diretamente do pod da aplicação (siecm-middleware-des-215-5ndll, namespace siecm-des) confirmam:

DNS resolve corretamente: sigaq.des.caixa → 10.245.153.7
Porta 443 está aberta e acessível
Handshake TLS completo, retorno HTTP/2 200 OK

Conclusão: não há mais problema de rede, firewall ou DNS entre o OKD4 e o SIGAQ.

Porém, identificamos que a URL chamada (https://sigaq.des.caixa/conteudo/v1/dossies?cpfCnpj=...) está retornando o HTML do front-end Angular do SIGAQ (index.html/SPA fallback), e não o JSON esperado da API de dossiês. Ou seja, o path /conteudo/v1/dossies não corresponde a um endpoint de API real — está caindo no roteamento padrão da aplicação web.

Necessário: que o time responsável pelo SIGAQ confirme o path/host correto do endpoint de consulta de dossiês (API), pois o atual está apontando para a rota do front-end, não da API.
