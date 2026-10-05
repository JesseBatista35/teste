Analisei o erro do Sonar no SIFGD-pagamentos-frontend (branch feat-frontend).

*O que derruba a build:* a esteira de Angular espera o relatório de testes em `reports/sonar-report.xml` e a cobertura em `coverage/lcov.info`, que é o padrão Jest. O projeto de vocês usa Karma, que não gera esses arquivos, então o scanner falha ao procurar o relatório.

Obs.: a esteira roda com `-Dproject.settings=NONE`, então o `sonar-project.properties` do repositório é ignorado. Os ajustes precisam ser no karma/package.json.

*Ajustes no repositório (mantendo Karma):*

1. Instalar o reporter:
`npm i -D karma-sonarqube-unit-reporter`

2. No `karma.conf.js`:
```
plugins: [ ...os existentes..., require('karma-sonarqube-unit-reporter') ],
reporters: ['progress', 'sonarqubeUnit'],
sonarQubeUnitReporter: {
  sonarQubeVersion: 'LATEST',
  outputFile: 'reports/sonar-report.xml',
  overrideTestDescription: true,
  testPaths: ['./src'],
  testFilePattern: '.spec.ts',
  useBrowserName: false
},
coverageReporter: {
  dir: require('path').join(__dirname, './coverage'),
  subdir: '.',
  reporters: [{ type: 'lcovonly' }, { type: 'text-summary' }]
},
```

3. No `package.json`, o script de teste precisa rodar uma vez só, com cobertura e browser headless:
`"test": "ng test --watch=false --code-coverage --browsers=ChromeHeadless"`

4. Criar um `tsconfig.sonar.json` na raiz:
```
{
  "extends": "./tsconfig.json",
  "compilerOptions": { "moduleResolution": "node" }
}
```
O Angular 19 usa `moduleResolution: bundler`, que o nosso SonarQube (9.9) não reconhece. Sem esse arquivo, o Sonar pula todos os .ts e a análise fica vazia. Do meu lado, eu configuro a pipeline para usar esse tsconfig.

*Alternativa:* migrar os testes para Jest com `jest-sonar-reporter`, que é o padrão que a esteira já espera.
