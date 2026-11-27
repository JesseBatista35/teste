Carine, Ricardo, boa tarde.

Analisei a SIFAP Centralizadora (backend) para a REQ000147212537. No DES, o pod está saudável no momento: sem reinícios, sem erros, sem threads travadas e com o banco respondendo. Mesmo assim, encontrei alguns pontos que podem explicar a instabilidade intermitente:

1. Chamadas externas sem timeout (código)
Na busca de farmácias, o backend consulta a Receita e o Siico para cada registro da página, aguardando com await().indefinitely() (SiicoPessoaService). Se o API Gateway ficar lento, as requisições ficam presas e a aplicação trava, tanto em DES quanto em TQS, já que os dois consomem o mesmo gateway. Recomendo configurar timeout nos rest clients do Siico e da Receita, trocar por await().atMost(...) e avaliar cache. O client do Ministério já tem timeout.

2. Log em DEBUG em DES e TQS
QUARKUS_LOG_LEVEL=DEBUG gera um volume alto de log e está expondo apikey, Bearer token e URLs SAS do blob. Se não estiverem usando para depuração, sugiro passar para INFO. Posso fazer o ajuste na esteira, só me confirmem.

3. Diferença entre DES e TQS
O TQS não tem a variável MINISTERIO_FARMACIA_CONNECT_TIMEOUT_MS, que no DES está com 5000. Posso incluir para alinhar os dois.

Para confirmar a causa, preciso de uma evidência da falha: data e hora, ambiente, tela/funcionalidade e, se possível, um print da aba Network (F12) com a requisição que falhou. Se me chamarem no momento em que acontecer, consigo capturar o estado da aplicação na hora.
