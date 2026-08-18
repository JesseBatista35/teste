Bom dia! Tudo bem?

Estou analisando o erro que você reportou na execução do FusionX (task 9f440f12-e94d-47c5-bfb1-8f8bdf69a47a). Verifiquei que o GitHub Status está 100% operacional no momento, então o erro não parece ser instabilidade externa dessa vez.

Reparei no formulário que o campo "Nome do módulo - SEM SIGLA OU TIPO" foi preenchido como "teste-fusionx". Poderia me confirmar rapidinho:

1. Qual Sigla do Sistema você selecionou no formulário?
2. Qual Tipo de Repositório escolheu?
3. O nome "teste-fusionx" no campo de módulo foi preenchido assim mesmo, sem sigla/tipo na frente?

Pergunto porque já vimos um caso parecido onde o nome final do repositório montado pelo FusionX (sigla + tipo + módulo) ficou diferente do que o pipeline esperava na hora de criar o Pull Request, causando esse mesmo erro de "Not Found".

Com essas infos consigo confirmar se é problema de composição de nome e já encaminhar certo pro time responsável.

Fico no aguardo!
