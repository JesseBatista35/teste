**Build SIFAP-front-v2 - Atualização de Status**

A build estava quebrando na etapa "Build Application". Fizemos alguns ajustes e ela passou com sucesso nessa etapa.

Agora estamos enfrentando uma falha na etapa "Run Code Analysis" (SonarQube). O erro ocorre porque falta o arquivo `reports/sonar-report.xml` que é referenciado na configuração.

Estamos analisando a causa raiz e preparando uma solução. Em breve teremos mais informações.
