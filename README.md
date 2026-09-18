Pessoal, boa notícia parcial!

Resolvemos o problema de memória (aumentamos o limite do pod), e agora a aplicação não está mais reiniciando. A requisição está chegando corretamente até o CICS agora — passamos da etapa de rede/URIMAP.

Porém, apareceu um novo retorno, direto do CICS:

CICS Web Interface error
500 Internal Server Error

Ou seja, agora o erro está dentro do processamento da transação N1W1 no CICS, não mais na comunicação/roteamento. Everton, seria possível verificar nos logs internos do CICS (CEDF/CEMT ou logs da transação) o que está causando esse 500 Internal Server Error especificamente na chamada de débito que fizemos agora (por volta de 16:41)?
