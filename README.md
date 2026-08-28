Nota de fechamento:

Prezados,

Em análise à falha de execução da Pipeline do SIBEM-doacao-frontend-intranet (buildId 808381), foi identificado que o grupo de variáveis compartilhado "SONAR VARIABLES - ESTEIRA" (SONAR_PROPERTIES) possuía apenas parâmetros de cobertura Java/JaCoCo/JUnit, sem o parâmetro de importação do relatório LCOV gerado pelo Jest (sonar.javascript.lcov.reportPaths=coverage/lcov.info).

Com isso, a cobertura de testes JavaScript gerada pelo Jest não estava sendo importada pelo SonarQube, resultando em reprovação no Quality Gate (TE102 - Não atendimento aos critérios de qualidade).

Após o ajuste do parâmetro de referência do relatório LCOV, nova execução da pipeline foi realizada com sucesso, apresentando Quality Gate status: OK.

Pipeline normalizada e demanda concluída.
