Chamado referente à falha na execução da análise de código (SonarQube) do pipeline SIMIL-precificacao-internet-frontend, componente SIMIL-precificacao-internet-frontend, ambiente TQS.

Diagnóstico: identificado que a variável SONAR_PROPERTIES estava definida em duplicidade, simultaneamente em Pipeline Variables e no Variable Group SONAR_VARIABLES - ESTEIRA vinculado ao pipeline. Essa duplicidade fazia com que o Azure DevOps concatenasse os dois valores na montagem do comando sonar-scanner, gerando parâmetros repetidos e colados sem separador, o que corrompia a leitura das propriedades pelo scanner e resultava em falha na execução da etapa Run Code Analisis.

Ação realizada: removida a definição duplicada da variável SONAR_PROPERTIES em Pipeline Variables, mantendo somente a referência ao Variable Group SONAR_VARIABLES - ESTEIRA. Ajustado também o conteúdo da propriedade, removendo o parâmetro sonar.testExecutionReportPaths, que apontava para um arquivo de relatório de testes não gerado na pipeline (reports/sonar-report.xml).

Resultado: pipeline executado com sucesso após o ajuste, etapa de análise de código concluída sem erros.

Encerrado sem necessidade de acionamento de outras equipes, tratativa realizada integralmente pela Esteira DevOps.
