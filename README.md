Prezados, boa tarde.

Segue a análise:

1. Agente do Application Insights (corrigido pela esteira). A variável _ENV.JAVA_OPTIONS_APPEND definida na release do SIGSJ-alvara (escopo EC DES) sobrescrevia a do grupo de variáveis e não incluía o -javaagent. Por isso o agente não era carregado. A variável foi corrigida e o agente 3.7.1 está ativo desde as 15:26 de hoje. No LDAI-DEPOSITOS-JUDICIAS já constam requests e dependências do sigsj-alvara-des (154 requests e 2.618 dependências nas últimas 3 horas).

2. Custom events alvara_ac_snapshot (ajuste na aplicação). Os eventos não estão sendo descartados pelo Application Insights: eles nunca são enviados para lá. A classe OpenTelemetryLogProvider cria um SdkLoggerProvider próprio, que exporta apenas para o coletor da CEMOT (otel-collector-nprd.cemot.cloud.caixa/sistemas-judiciais/v1/logs). Esse pipeline não passa pelo agente, então o atributo microsoft.custom_event.name não é interpretado e nada chega à tabela customEvents, o que confirmamos por consulta.

Para que os eventos cheguem ao Application Insights, basta obter o logger pelo agente, mantendo o atributo microsoft.custom_event.name:

java
Logger logger = GlobalOpenTelemetry.get().getLogsBridge().get("sigsj-alvara");

Se os eventos também forem necessários no painel da CEMOT, a emissão deve ser feita pelos dois caminhos: pelo logger do agente e pelo provider atual.

Observação: a tabela traces não recebe os logs da aplicação. Se for desejado ver os logs no Application Insights, isso deve ser avaliado junto com o ajuste acima.

Recomendação de segurança: marcar como secret as credenciais hoje em texto aberto nos grupos SIGSJ-comum-des e SIGSJ-ALVARA-DES (secrets do OIDC, API keys e token FWC).
