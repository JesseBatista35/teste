Nota de fechamento:

Verificado o log da aplicação sigsj-super-app-des no ambiente DES (namespace sigsj-des). O pod sigsj-super-app-des-7-6x4qr subiu corretamente, com Quarkus 3.27.4 iniciado em 8.401s e os endpoints de health check respondendo normalmente (GET /q/health/live e /q/health/ready retornando 200). O rollout foi concluído com sucesso.

Durante a inicialização foi identificado que o Application Insights Java Agent 3.7.1 falhou ao iniciar, apresentando o erro No connection string provided. Essa falha não impacta a disponibilidade da aplicação, pois o agent é carregado via javaagent e sua falha não interrompe o bootstrap da JVM nem da aplicação Quarkus. O impacto se limita à ausência de telemetria (traces e métricas) enviada ao Azure Monitor para esse componente.
