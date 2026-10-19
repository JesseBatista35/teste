Prezados,

Analisamos a falha na etapa "Run Code Analisis" (SonarQube) da pipeline do SIPNC-conta1288judi-microfront, branch feature/STSK00002828.

A análise de código e a leitura da cobertura (coverage/lcov.info) foram concluídas normalmente. A falha ocorre na importação do relatório de execução de testes:

  java.io.FileNotFoundException: reports/sonarqubeTestReport.xml (Arquivo ou diretório inexistente)

A esteira espera o relatório de testes em reports/sonarqubeTestReport.xml (parâmetro sonar.testExecutionReportPaths). A configuração atual do projeto não gera esse arquivo:

1. O jest.config.js usa testResultsProcessor: 'jest-sonar-reporter', mas o pacote jest-sonar-reporter não está declarado no package.json.

2. Sem configuração específica, o jest-sonar-reporter grava o relatório em ./test-report.xml, e não em reports/sonarqubeTestReport.xml.

3. O arquivo sonar-project.properties não é considerado pela esteira, que executa o scanner com project.settings=NONE. Por isso, o valor sonar.testExecutionReportPaths=test-report.xml definido nele não tem efeito.

Ajustes necessários no repositório da aplicação:

a) Incluir a dependência:
   npm i -D jest-sonar-reporter

b) Incluir no package.json, no nível raiz:
   "jestSonar": {
     "reportPath": "reports",
     "reportFile": "sonarqubeTestReport.xml",
     "indent": 2
   }

c) Validar localmente com "npm run test" e confirmar que o arquivo reports/sonarqubeTestReport.xml é gerado.

d) Commitar o package.json e o package-lock.json atualizados e executar novamente a pipeline.

Sugestão adicional, sem impacto na falha atual: o package.json contém entradas duplicadas em devDependencies (@babel/core, ts-jest e babel-preset-jest). Recomendamos a limpeza.

Devolvemos a demanda ao time de desenvolvimento para os ajustes. Após a correção, havendo nova falha na esteira, favor reabrir com o log da execução.

Atenciosamente,
Jessé Batista – CESTI / Esteiras DevOps DES/TQS
