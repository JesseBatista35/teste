Everton, obrigado pela confirmação. Testei de novo às 11:25 e o retorno foi o mesmo 500, coerente com o lancamentoV4 sem URIMAP.

O CEMT I WEBS(lancamentoV4) mostra o serviço instalado (Pip D01SPIPE, Pro D01POSOL), mas sem Uri($...), diferente do lancamento (Uri($803020)). Sem URIMAP, o CICS Web não associa o path /sid01/lancamentoV4 ao pipeline, e o erro é barrado antes do programa.

Peço à Karen e ao Mainframe:

Conferir o log do DFHLS2WS (.../d01spipe/wslog/lancamentoV4.log) para ver se o URIMAP foi gerado;
Executar CEMT PERFORM PIPE(D01SPIPE) SCAN em cada CICS de TQS e conferir se o Uri aparece no CEMT I WEBS(lancamentoV4);
Se não aparecer, reexecutar o DFHLS2WS conferindo os parâmetros URI=/sid01/lancamentoV4 e TRANSACTION=N1W1.

Do meu lado, o pod está estável e apontado para 32587. Assim que o Uri aparecer, o Pedro dispara o débito e eu acompanho o log.
