Pessoal, conseguimos uma evidência que acredito que explica o problema!

Vocês passaram o retorno do CICQAWB1 mostrando os TCPIPSERVICEs ativos:

JOBNAME    Status   IPAddr    Port    
CICQAWB1   LISTEN   0.0.0.0   3024
CICQAWB1   LISTEN   0.0.0.0   35003

Só que a aplicação em TQS está configurada para chamar o CICS Web na porta 2587 (cicsweb.tqs.caixa:2587) — e essa porta não aparece entre as que estão em LISTEN no CICQAWB1. Ou seja, mesmo com o URIMAP definido corretamente, a conexão nunca vai encontrar um listener ativo nessa porta.

Poderiam confirmar:

Qual das duas portas (3024 ou 35003) é a porta HTTPS correta para acesso externo via CICS Web nesse ambiente?
Se realmente deveria ser uma dessas e não 2587?

Se confirmado, do nosso lado ajustamos a variável CICSWEB_ROOT_ENDPOINT_HTTPS na pipeline do TQS para apontar para a porta correta.
