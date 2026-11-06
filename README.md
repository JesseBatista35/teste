boa tarde tudo bem??
Sera que vc consegue me ajudar com uma questão de esteira...
 
 
Estou tomando toco de quality gate (siavo-ms-spa)
 
ai pelo que consegui investigar 
A esteira do SIAVO-ms-spa não está importando no SonarQube a cobertura gerada pelos testes Jest. O log indica que o sensor de cobertura JavaScript/TypeScript foi ignorado por ausência da configuração do relatório LCOV.
Ajuste solicitado:
Executar npm test antes do Sonar;
Garantir a geração do arquivo coverage/lcov.info;
Configurar no scanner:sonar.javascript.lcov.reportPaths=coverage/lcov.info;
Validar no log que o LCOV foi importado corretamente.
Após o ajuste, deve ser realizada uma nova execução da esteira para confirmar que a cobertura está sendo considerada pelo SonarQube.
 
como eu peço esse ajuste na esteira?? qual req deve ser aberta?
 
nao sei se exatamente isso


cara acho que isso nao e qauqi na esteira e teste que voce com odevetem que faz me ajdua ai a responder ess mauloco no teams
