Estou configurando o Application Insights na aplicação SICBP-trilha-api (v0.0.0.26, Spring Boot 2.7.7, Java 17), no ambiente de Desenvolvimento (LDAI-Canais-Proprios-Interno), conforme a documentação da Caixa (https://devops.caixa/projetos/Caixa/_wiki/wikis/Caixa.wiki/2937/CONFIGURA%C3%87%C3%83O-do-Application-Insights-no-Spring-Boot). A aplicação está conectada e enviando dados normalmente - as métricas aparecem na aba Live Metrics - porém não consigo visualizar dados nas abas Performance e Application Map, impossibilitando análise de performance e rastreamento de dependências.

Configurações Implementadas:
Foi adicionada a dependência Maven com.microsoft.azure:applicationinsights-runtime-attach:3.7.10 no pom.xml e inicializado o agente chamando ApplicationInsights.attach() na classe RunApplication.java antes do SpringApplication.run(). 
As variáveis de ambiente foram configuradas no DevOps conforme orientado: 
APPLICATIONINSIGHTS_CONNECTION_STRING (com InstrumentationKey válida), APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL=INFO, 
APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE=100, 
APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL=INFO,
APPLICATIONINSIGHTS_PROXY=http://proxydes.caixa:80 



Comportamento:
Live Metrics funciona e exibe métricas em tempo real (https://portal.azure.com/#@caixa.onmicrosoft.com/resource/subscriptions/323f3ed7-7b41-42f2-b116-0a8b58d3e597/resourceGroups/LOGDIGITAL-TROUBLESHOOT-DES/providers/microsoft.insights/components/LDAI-Canais-Proprios-Interno/quickPulse). 
Aba Performance vazia - sem dados de requisições ou dependências (https://portal.azure.com/#@caixa.onmicrosoft.com/resource/subscriptions/323f3ed7-7b41-42f2-b116-0a8b58d3e597/resourceGroups/LOGDIGITAL-TROUBLESHOOT-DES/providers/microsoft.insights/components/LDAI-Canais-Proprios-Interno/performance). 
Application Map não exibe a instância da aplicação (https://portal.azure.com/#@caixa.onmicrosoft.com/resource/subscriptions/323f3ed7-7b41-42f2-b116-0a8b58d3e597/resourceGroups/LOGDIGITAL-TROUBLESHOOT-DES/providers/microsoft.insights/components/LDAI-Canais-Proprios-Interno/applicationMap).
 
Gostaria de suporte para entender se faltou algo na configuração do Application Insghts.
