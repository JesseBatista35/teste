Everton, obrigado pelo retorno. O abend AWBM da N1W1 no CICQTWB3 às 11:10:13 é diferente do ASRA de antes, e indica que agora a requisição chega à transação do web service, mas o CICS Web não consegue tratá-la.

O CEMT I WEBS(lancamentoV4) continua sem Uri($...). Peço:

O texto completo da mensagem do abend (programa e código de saída), e o dump correspondente;
O log do DFHLS2WS (.../d01spipe/wslog/lancamentoV4.log), para ver se o URIMAP foi gerado;
CEMT PERFORM PIPE(D01SPIPE) SCAN em cada CICS de TQS, e a conferência do Uri no CEMT I WEBS(lancamentoV4);
Se o AWBM persistir, a definição da N1W1 (DFHPIDSH como primeiro programa) e da transação no TOR e nos AORs.
