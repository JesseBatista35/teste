1. Campo NG_GOAL. Apague o que está lá e cole:

npx jest --ci --coverage --coverageReporters=lcov --coverageReporters=text-summary && ng build --configuration production --build-optimizer --aot --output-path=dist

2. Campo SONAR_PROPERTIES. Apague o $(SONAR_PROPERTIES) e cole:

-Dproject.settings=NONE -Dsonar.branch.name=$(sonar_branch) -Dsonar.javascript.lcov.reportPaths=coverage/lcov.info -Dsonar.exclusions=**/node_modules/**,dist/**,coverage/**,tools/**,**/*.spec.ts -Dsonar.tests=src -Dsonar.test.inclusions=**/*.spec.ts -Dsonar.coverage.exclusions=**/*.spec.ts,src/main.ts,src/environments/** -X

3. Clique em Save & queue e rode na develop.

Com isso a esteira passa a rodar os testes, gera a cobertura e manda para o Sonar. Se der erro, me cola o log da etapa que falhou.
