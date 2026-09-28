Rodrigo, obrigado pelo retorno. Confirmei no log do pod que o 500 "CICS Web Interface error" chegou às 11:04:57 e às 11:05:50, mas entendi que a requisição não chegou ao D01POSOL do lado de vocês. Isso indica que o erro é barrado na camada web, antes do programa.

O CEMT que você colou mostra o ponto central: o lancamento tem Uri($803020), e o lancamentoV4 (Pip D01SPIPE, Pro D01POSOL) está sem URIMAP associado. Pelo tutorial (item 6), o DFHLS2WS gera o URIMAP na instalação do web service. O D01UMTQS foi criado manualmente e não faz esse vínculo com o pipeline.

Peço a verificação de:

CEMT I URIMAP(D01UMTQS): USAGE, PIPELINE, WEBSERVICE, PROGRAM e TRANSACTION;
Por que o lancamentoV4 está instalado sem URIMAP. Se o gerado pelo DFHLS2WS não foi instalado, ou se o manual assumiu o mesmo path;
Se necessário, remover ou desabilitar o URIMAP manual e executar CEMT PERFORM PIPE(D01SPIPE) SCAN em cada região, para o URIMAP do web service ser reinstalado;
Definição da N1W1: DFHPIDSH como primeiro programa nos AORs e routable/dynamic no TOR.

Do meu lado, o pod está estável (memória ajustada e porta 32587). Fico com o log aberto para o próximo teste.
 
