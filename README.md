Carine, Ricardo, analisei o backend da Centralizadora em DES (pod, logs, threads, banco) e no momento está tudo saudável: sem reinícios, sem erros e sem travamentos.

Para seguir com a REQ000147212537 preciso de uma evidência da falha. Pode ser:

Data e hora exatas em que ocorreu (e em qual ambiente: DES, TQS ou HMP)
Qual tela/funcionalidade e o que aparece (mensagem de erro, tela travada, lentidão de X segundos)
Print da aba Network do navegador (F12) mostrando a requisição que falhou: URL, status e tempo

Se conseguirem me chamar no momento em que acontecer, consigo capturar o estado da aplicação na hora.

Também deixo um ponto para o time de desenvolvimento: a busca de farmácias faz chamadas externas (Receita e Siico via API Gateway) sem timeout configurado (await().indefinitely() no SiicoPessoaService). Se o gateway ficar lento, a aplicação pode travar. Recomendo configurar timeout e cache nessas chamadas e baixar os logs de DEBUG para INFO, porque hoje o log está expondo apikey e token.
