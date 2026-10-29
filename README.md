Pessoal, atualização do SIGSJ-intranet (DES):

✅ O JBoss na caddeapllx955 está subindo sem erros e a aplicação responde normalmente: um teste direto no servidor com o host sigsj-intranet.esteiras.des.caixa retornou HTTP 200 em /sigsj_intranet/.

O que impede o acesso pela URL é o DNS: hoje sigsj-intranet.esteiras.des.caixa resolve para 10.116.180.22, que é o VIP do OKD, e não para o servidor da aplicação (10.116.194.179). Por isso a requisição nem chega no JBoss.

@Evandro, para a reunião da tarde: precisamos definir se o caminho é um registro DNS apontando sigsj-intranet.esteiras.des.caixa para a 10.116.194.179 ou um VIP exclusivo para o SIGSJ (necessário se o acesso for por HTTPS, já que o Apache da VM atende em HTTP/80). O boleto e o internet vão precisar da mesma definição.
