Pessoal, bom dia!

Conseguimos avançar na investigação com a informação das portas que o Everton levantou com o time de Redes. Analisando os dados:

A porta que a aplicação usa (2587) pertence à região CICQTWB3, e está ativa/ouvindo lá.
Porém, o URIMAP para /sid01/lancamentoV4 foi criado na região CICQAWB1, que é uma região diferente.

Ou seja, a requisição está chegando corretamente na porta 2587 (região CICQTWB3), mas essa região não tem o URIMAP cadastrado — por isso o retorno "Resource not found". A porta 3024 que testamos antes pertence a outra região (CICQAWB1/CICQTWB1), por isso deu problema de conexão/crash — não é a porta usada pela aplicação.

Já revertemos a variável CICSWEB_ROOT_ENDPOINT_HTTPS de volta para 2587 e subimos novo deploy em TQS.

Poderiam, por gentileza, criar (ou replicar) o URIMAP para /sid01/lancamentoV4 na região CICQTWB3, que é a região correta associada à porta 2587?

Ficamos no aguardo para novo teste assim que confirmado.

Quer que eu ajuste algo antes de enviar?

Escreva uma mensagem…
