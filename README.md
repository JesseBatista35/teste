"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd-sigsj-20260707.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.1.jar -Dotel.exporter.otlp.endpoint=https://otel-collector-nprd.cemot.cloud.caixa"

oc logs <novo-pod> -n sigsj-des | grep -i 'ApplicationInsights Java Agent'
# esperado: "ApplicationInsights Java Agent 3.7.1 started successfully"
