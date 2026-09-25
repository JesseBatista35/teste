Prezados, bom dia.

Confirmamos que o agente do Application Insights (3.7.1) está ativo no pod atual (sigsj-alvara-des-669-bsj5j) e enviando telemetria normalmente ao LDAI-DEPOSITOS-JUDICIAS (requests e dependências).

Porém não há registros do evento alvara_ac_snapshot em nenhuma tabela nas últimas 24 horas, nem mesmo dos eventos de snapshot vazio, que deveriam ser emitidos a cada 5 minutos (o log mostra 0/0 custom events emitidos em todos os ciclos).

A classe OpenTelemetryAlvaraAcEventPublisher enviada continua obtendo o logger via OpenTelemetryLogProvider.getLogger(). Existem hoje três instâncias de OpenTelemetry na aplicação, e só uma delas envia ao Application Insights:

Origem do logger	Destino
SdkLoggerProvider próprio (OpenTelemetryLogProvider)	Somente coletor da CEMOT
@Inject OpenTelemetry (bean do Quarkus)	Descartado (NoopLogRecordExporter, pois quarkus.otel.logs.enabled não está habilitado)
GlobalOpenTelemetry.get() (fornecido pelo agente)	Application Insights

Portanto, o logger deve ser obtido obrigatoriamente assim:

java
Logger logger = GlobalOpenTelemetry.get().getLogsBridge().get("sigsj-alvara");

Se os eventos também forem necessários no painel da CEMOT, é preciso emitir pelos dois loggers: o global e o do OpenTelemetryLogProvider.

Caso, após o ajuste, os eventos apareçam na tabela traces em vez de customEvents, a alternativa é usar a API do próprio Application Insights (com.microsoft.azure:applicationinsights-core:3.7.1):

java
new TelemetryClient().trackEvent("alvara_ac_snapshot", propriedades, null);

Para validar após o deploy (o esperado é um evento com snapshot_empty=true a cada 5 minutos):

kusto
customEvents
| where timestamp > ago(1h)
| where name == "alvara_ac_snapshot"

Fico à disposição.
