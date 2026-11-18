Correção do seu lado (igual ao SINCH)

a) NG_GOAL da task Angular-Build:

ng build --configuration production --aot && npx jest --coverage

Também serve npm test -- --coverage, se o script test chamar o jest.

b) SONAR_PROPERTIES (ou um sonar-project.properties no repo):

properties
sonar.sources=src
sonar.tests=src
sonar.test.inclusions=**/*.spec.ts,**/*.spec.js
sonar.exclusions=**/node_modules/**,**/*.spec.ts,**/*.spec.js
sonar.coverage.exclusions=**/*.spec.ts,**/*.spec.js,src/main.ts,src/environments/**,**/*.module.ts,**/*.routes.ts
sonar.javascript.lcov.reportPaths=coverage/lcov.info

Com sonar.sources=src, o jest.config.js, o setup-jest.ts e o jest.config.spec.js saem da análise. O jest.config.spec.js pode até ser apagado pelo dev.

c) Validação depois de rodar a build:

No log do scanner deve aparecer Analysing [.../coverage/lcov.info] sem warning de “Could not resolve file paths”. Os 2 warnings da última análise provavelmente são isso, vale abrir.
Em Measures > Coverage, os arquivos de src/ devem aparecer com linhas a cobrir.
O jest.config*.js não deve aparecer mais.
Para o dev

A cobertura dos arquivos de config era ajuste de esteira, e vocês fazem isso. O que sobra para ele é:

Corrigir as 10 issues críticas (Issues > filtro Severity: Critical, branch master).
Garantir ≥ 80% de cobertura no código novo de src/. Assim que o lcov entrar, o número real aparece, e pode ser que fique abaixo de 80%.

Assim o Hugo não fica como quem “empurrou de volta”: ele estava certo sobre os bugs, e a parte da cobertura dos configs vocês assumem. Quando a build passar, se quiser, eu redijo o texto da W.O.
