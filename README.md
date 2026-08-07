Prezados,

Durante a execução da pipeline de build do sistema siaef-web, foram identificadas falhas recorrentes na etapa de instalação de dependências (npm install), decorrentes de pacotes transitivos de browserslist (electron-to-chromium, node-releases) não disponíveis no repositório Nexus interno na versão solicitada.

Análise do package.json do projeto identificou que essas dependências não são fixadas diretamente pelo projeto, sendo puxadas de forma transitiva pelo @angular-devkit/build-angular (~0.803.29). O repositório não possui package-lock.json versionado, o que impede a fixação determinística da árvore de dependências transitivas e faz com que o npm tente resolver, a cada execução, as versões mais recentes publicadas — nem sempre disponíveis no cache do Nexus interno.

Como medida paliativa, foram aplicados pins manuais de versão diretamente na pipeline para viabilizar os builds. Essa abordagem não é sustentável, pois novas atualizações de dependências transitivas continuam gerando o mesmo tipo de falha a cada execução.

Solicitamos ao time de desenvolvimento responsável pelo repositório:

Gerar e versionar o package-lock.json do projeto, fixando toda a árvore de dependências;
Avaliar a fixação explícita (via overrides, se aplicável à versão de npm em uso) das dependências browserslist, electron-to-chromium e node-releases em versões já validadas e disponíveis no Nexus interno.

Ficamos à disposição para apoiar com os logs de erro e o histórico de ajustes já realizados na esteira, caso necessário.

Atenciosamente,
Jessé Batista
CTIS/CESTI — Esteira DevOps DES TQS NPRD
