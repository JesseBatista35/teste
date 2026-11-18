Correção

Não mexa no grupo, porque ele é compartilhado com todas as builds. Crie uma variável de pipeline SONAR_PROPERTIES na aba Variables do SICLG-v2-frontend. No pipeline Classic, a variável de pipeline sobrepõe a do grupo (é o mesmo esquema que você usou no SINCH):

-Dproject.settings=NONE -Dsonar.branch.name=$(sonar_branch) -Dsonar.javascript.lcov.reportPaths=coverage/lcov.info -Dsonar.exclusions=**/node_modules/**,dist/**,coverage/**,.s2i/**,*.config.js,*.config.spec.js,setup-jest.ts,**/*.spec.ts,**/*.spec.js -Dsonar.coverage.exclusions=src/main.ts,src/environments/**,**/*.module.ts,**/*.routes.ts -X
