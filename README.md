   "-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd-sigsj-20260707.jks -Dotel.exporter.otlp.endpoint=https://otel-collector-nprd.cemot.cloud.caixa"

      oc exec <novo-pod> -n sigsj-des -- env | grep JAVA_OPTIONS_APPEND
   oc logs <novo-pod> -n sigsj-des | grep -i 'Application Insights Java Agent'  
   
   # não deve aparecer nada


   Não houve troca de LDAI nem de instrumentation key na esteira. A aplicação tem hoje dois caminhos de telemetria independentes, cada um indo para um recurso diferente:

Quarkus (OpenTelemetry) → coletor da CEMOT → LDAI-DEPOSITOS-JUDICIAS. No mapa aparece como "sigsj-alvara-des", em minúsculo. É sobre esse caminho que o painel da CEMOT foi montado.
Agente do Application Insights → LDAI-Fomento-Depositos-Judiciais. No mapa aparece como "SIGSJ-ALVARA-DES", em maiúsculo. Usa a connection string do grupo SIGSJ-insights-des.

A connection string do LDAI-Fomento já estava configurada na esteira há tempo, mas o agente não estava sendo carregado, porque a variável JAVA_OPTIONS_APPEND da release não incluía o -javaagent. Quando incluímos o agente para atender a demanda dos customEvents, o segundo caminho passou a funcionar e os dados começaram a aparecer no LDAI-Fomento.

Além disso, o agente do Application Insights conflita com a extensão OpenTelemetry do Quarkus. Ele assume o contexto de trace e instrumenta os mesmos pontos, o que prejudica os traces que a aplicação envia para o coletor da CEMOT. Por isso eles pararam de aparecer no LDAI-DEPOSITOS-JUDICIAS.

Sobre os customEvents: verificamos nos dois recursos e não há registros de alvara_ac_snapshot. Isso é esperado enquanto a aplicação usar o SdkLoggerProvider próprio (classe OpenTelemetryLogProvider), que exporta apenas para o coletor da CEMOT.

Rollback: já estou fazendo o desfazimento conforme a REQ. A variável JAVA_OPTIONS_APPEND volta ao valor original, sem o agente, e em seguida faço o deploy em DES. Com isso, a telemetria volta a seguir somente pelo coletor da CEMOT, como estava antes. Assim que o deploy terminar, te aviso para validar no painel.

Próximos passos sugeridos: o ideal é alinhar com a CEMOT um destino único. As opções são:

Manter só o coletor da CEMOT, sem agente. A CEMOT configura no coletor o encaminhamento de logs/eventos para o Application Insights, e os customEvents seguem pelo OpenTelemetry do Quarkus, sem conflito.
Usar o agente com o LDAI-Fomento. A aplicação passa a emitir os eventos via GlobalOpenTelemetry e a CEMOT monta o painel sobre o LDAI-Fomento. Nesse caso, é preciso tratar o conflito entre o agente e o Quarkus.

Fico à disposição para uma conversa em conjunto com a CEMOT quando for possível.
