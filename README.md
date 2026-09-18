não temos visibilidade de quais transações internas o programa D01POSOL aciona durante o processamento — isso é interno ao COBOL/CICS do lado de vocês.

O que sabemos é que a aplicação chama diretamente a transação N1W1 (confirmado no WSDL/log: D01POSOL_N1W1.wsdl), usando o usuário de serviço SNSGSQ01.

Se N1Q5 for uma transação interna disparada pelo N1W1 durante o processamento do débito, isso pode muito bem explicar o erro 500 que estamos recebendo. Fica a critério de vocês confirmarem isso com quem conhece o programa.

Pode sim fazer o CEDX para verificar — nós disparamos uma nova chamada assim que vocês avisarem que estão prontos para acompanhar.
