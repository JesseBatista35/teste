Pessoal, boa tarde!

Como ainda não tivemos confirmação de qual porta é a HTTPS correta, testamos por nossa conta: alteramos a variável CICSWEB_ROOT_ENDPOINT_HTTPS na pipeline de TQS de 2587 para 3024 e subimos a aplicação novamente.

No log após a subida, não identificamos mais o erro SOAPFaultException: Resource not found.

Poderiam, por gentileza, fazer um teste do lado de vocês (executar a transação N1W1 no CICQAWB1) para confirmar se a chamada está chegando corretamente agora na porta 3024? Assim conseguimos validar se essa é de fato a porta correta antes de considerar o ajuste definitivo.

Fico no ag
