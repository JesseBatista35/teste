Prezados,

Analisamos o log da etapa "Run Code Analisis" (build 828381). A falha ocorre porque o scanner está configurado com sonar.testExecutionReportPaths=reports/sonarqubeTestReport.xml, mas o arquivo não existe no workspace (FileNotFoundException). O arquivo coverage/lcov.info também não foi encontrado, o que indica que a etapa de testes unitários não gerou os relatórios antes da análise.

Solicitamos que a equipe de desenvolvimento verifique: (1) se a etapa de testes (Jest) está sendo executada e concluída com sucesso antes do Sonar nessa pipeline; (2) se o jest-sonar-reporter está configurado com outputDirectory: "reports" e outputName: "sonarqubeTestReport.xml", e se o lcov está habilitado em coverageReporters.

Além disso, o agente utilizou Node.js 12.22.12, e o plugin JavaScript/TypeScript do SonarQube exige 14.17 ou superior. Por isso a análise de TypeScript não executou regras. Recomendamos definir a versão do Node (16 ou superior) na pipeline antes dos testes e do Sonar.
