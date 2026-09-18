Segue um texto pronto pra você copiar e enviar (ajusta saudação/protocolo conforme o canal — email, Teams, ou dentro de uma REQ):

Assunto: Solicitação de verificação de pool da VIP 10.116.80.21 (sicem-legado.des.caixa) — erro 403 intermitente

Prezados,

Estamos com um erro 403 Forbidden intermitente no acesso a https://sicem-legado.des.caixa/sicem/Principal.jsp e demais recursos da aplicação SICEM (DES). O erro não é constante: numa mesma carga de página, parte dos recursos (CSS, JS, imagens, e às vezes o próprio Principal.jsp) carrega normalmente e outra parte retorna Forbidden, variando a cada tentativa.

Investigação já realizada:

O domínio sicem-legado.des.caixa resolve para a VIP 10.116.80.21 (VIP_desenvolvimento.extracaixa, SD343668).

Descartamos problema nos servidores Apache que administramos (10.116.84.136 e 10.116.84.137, ambos Apache 2.2/httpd.worker): conectividade testada via telnet/nc na porta 6666 com sucesso, status do mod_cluster OK para o node sicem_node1_lx0005 nos dois, e nenhum registro de bloqueio ("client denied") nos logs desses hosts para o sicem-legado.

Descartamos também sessão/cookie do navegador (o erro persiste mesmo limpando cookies) e divergência de configuração entre os dois Apaches (config idêntica, sem regra de Directory/Location para /sicem).

Analisando as respostas 403 diretamente pelo DevTools do navegador, identificamos que todas elas retornam o header Server: Apache/2.4.37 (Red Hat) — uma versão de Apache diferente e mais nova do que os dois servidores que administramos (Apache 2.2). Isso indica que existe pelo menos mais um servidor real no pool dessa VIP, não mapeado por nós, que não está servindo corretamente o contexto /sicem — provavelmente sem o vhost do sicem-legado configurado, respondendo com Forbidden genérico para qualquer requisição que caia nele.

Solicitação:

Poderiam verificar os membros reais (pool members) configurados na VIP 10.116.80.21 e identificar qual deles está respondendo com Apache/2.4.37? Esse servidor precisa ter o vhost do sicem-legado corrigido/configurado, ou ser removido do pool até a correção, para eliminar a intermitência.
