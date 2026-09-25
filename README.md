ean, o rollback foi concluído. A variável JAVA_OPTIONS_APPEND voltou ao valor original e a aplicação em DES já está rodando sem o agente do Application Insights. A telemetria volta a seguir somente pelo coletor da CEMOT (LDAI-DEPOSITOS-JUDICIAS), como estava antes.





Contexto: na REQ000146187679, a aplicação não registrava customEvents (alvara_ac_snapshot) no Application Insights. Na análise, identificamos que a variável _ENV.JAVA_OPTIONS_APPEND definida na release (escopo EC DES) sobrescrevia a do grupo SIGSJ-comum-des e não incluía o -javaagent do Application Insights. A variável foi ajustada para incluir o agente (3.7.1).

Impacto observado: com o agente ativo, a telemetria passou a ser enviada também para o LDAI-Fomento-Depositos-Judiciais, por meio da connection string já existente no grupo SIGSJ-insights-des. Além disso, o agente conflita com a extensão OpenTelemetry do Quarkus e prejudicou os traces enviados ao coletor da CEMOT (LDAI-DEPOSITOS-JUDICIAS), que é a base do painel negocial. Não houve troca de instrumentation key nem de LDAI na esteira.

Ação executada:

A variável de pipeline _ENV.JAVA_OPTIONS_APPEND (escopo EC DES) da release SIGSJ-alvara voltou ao valor original: -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd-sigsj-20260707.jks -Dotel.exporter.otlp.endpoint=https://otel-collector-nprd.cemot.cloud.caixa
Nova release implantada em DES.

Validação:

No pod em execução, a variável JAVA_OPTIONS_APPEND está sem o -javaagent.
O processo Java (PID 1) foi iniciado sem o agente do Application Insights.
A telemetria voltou a seguir somente pelo coletor da CEMOT, como antes da alteração.
Solicitada ao demandante a validação dos traces no painel da CEMOT.

Observações e recomendações:

Os customEvents seguem pendentes de ajuste na aplicação. A classe OpenTelemetryLogProvider usa um SdkLoggerProvider próprio, que exporta apenas para o coletor da CEMOT. A definição do destino (coletor da CEMOT encaminhando ao Application Insights, ou agente com LDAI-Fomento) deve ser alinhada entre o time do SIGSJ e a CEMOT.
O uso do agente do Application Insights em módulos SIGSJ-Quarkus que já usam quarkus-opentelemetry não é recomendado sem avaliação prévia, por causa do conflito entre os dois.
Recomendamos marcar como secret as credenciais hoje em texto aberto nos grupos SIGSJ-comum-des e SIGSJ-ALVARA-DES (secrets do OIDC, API keys e token FWC).

Status: atendido.
