Fala, Matheus, tudo bem?

Ajustei a pipeline do SIDSC-storybook-v20. O build do Storybook agora passa, mas a etapa de testes ainda quebra e o Quality Gate do Sonar reprova por falta de cobertura. Isso precisa de um ajuste no repositório.

O motivo: a branch do v20 está com os testes em Karma + Jasmine ("test": "ng test sdsc"). O Karma precisa de Chrome, e os agentes da esteira não têm navegador instalado. A build falha com "No binary for ChromeHeadless browser". O v19 funciona porque usa Jest, que roda sem navegador.

O que precisa ser feito na branch do v20 (seguindo o modelo do v19):

1. Dependências: remover karma, karma-chrome-launcher, karma-coverage, karma-jasmine, karma-jasmine-html-reporter, jasmine-core e @types/jasmine. Adicionar jest, jest-preset-angular (versão 15.x, que é a compatível com Angular 20), @types/jest e jest-sonar-reporter.
2. Configuração: trazer do v19 o jest.config.ts, setup-jest.ts, jest-global-mocks.ts e tsconfig.spec.json, ajustando os caminhos de projects/sidsc-components para projects/sdsc.
3. Script no package.json: "test": "jest --coverage".
4. Specs: converter o que usa API do Jasmine para Jest. Por exemplo, jasmine.createSpyObj vira jest.fn(), e spyOn(...).and.returnValue(...) vira jest.spyOn(...).mockReturnValue(...).
5. Sonar: garantir que o lcov seja gerado (coverage/lcov.info) e que o sonar.javascript.lcov.reportPaths aponte para ele, igual ao v19.

Do lado da esteira já está tudo pronto. O NG_GOAL do v20 ficou igual ao do v19:
ng run sdsc:build-storybook --output-dir=dist && npm test

Assim que você subir esses ajustes, é só rodar a pipeline de novo. Se o Quality Gate ainda reprovar com cobertura abaixo do mínimo, aí é questão de escrever mais testes.

Qualquer dúvida, me chama.
