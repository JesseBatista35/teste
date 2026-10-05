Oi Pedro, tudo bem? Analisei o erro do Sonar no SIFGD-pagamentos-frontend (branch feat-frontend).

*Causa:* a esteira de Angular segue o padrão *Jest*. Ela espera o relatório de testes em `reports/sonar-report.xml` e a cobertura em `coverage/lcov.info`. O projeto está com Karma, que não gera esses arquivos, então o scanner falha.

Obs.: a esteira roda com `-Dproject.settings=NONE`, então o `sonar-project.properties` do repo é ignorado e pode ser removido.

*Ajuste: migrar os testes de Karma para Jest*

1. Trocar as dependências:
```
npm uninstall karma karma-chrome-launcher karma-coverage karma-jasmine karma-jasmine-html-reporter jasmine-core @types/jasmine
npm i -D jest@29 jest-preset-angular@14 @types/jest jest-sonar-reporter
```

2. Apagar o `karma.conf.js` e remover o bloco `"test"` do `angular.json`.

3. Criar `setup-jest.ts` na raiz:
```
import { setupZoneTestEnv } from 'jest-preset-angular/setup-env/zone';
setupZoneTestEnv();
```

4. Criar `jest.config.js` na raiz:
```
module.exports = {
  preset: 'jest-preset-angular',
  setupFilesAfterEnv: ['<rootDir>/setup-jest.ts'],
  testPathIgnorePatterns: ['/node_modules/', '/dist/'],
  collectCoverage: true,
  coverageDirectory: 'coverage',
  coverageReporters: ['lcov', 'text-summary'],
  testResultsProcessor: 'jest-sonar-reporter'
};
```

5. No `package.json`:
```
"scripts": { ..., "test": "jest" },
"jestSonar": {
  "reportPath": "reports",
  "reportFile": "sonar-report.xml"
}
```

6. No `tsconfig.spec.json`, trocar `"types": ["jasmine"]` por `"types": ["jest"]`.

7. Nos `.spec.ts`, trocar a sintaxe do Jasmine pela do Jest onde houver: `spyOn` vira `jest.spyOn`, `jasmine.createSpyObj` vira objeto com `jest.fn()`, `and.returnValue` vira `mockReturnValue`.

Antes de subir, rodem `npm test` localmente e confiram se foram gerados `reports/sonar-report.xml` e `coverage/lcov.info`.

Assim que subirem, me avisa que rodo a pipeline de novo.
