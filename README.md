
-sh-4.2$
-sh-4.2$ oc logs sigsj-alvara-des-669-bsj5j -n sigsj-des | grep -Ei 'Application Insights Java Agent|set calls are ignored'
2026-09-24 16:17:52.164-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.7.1 started successfully (PID 8, JVM running for 6.056 s)
2026-09-24 16:18:06.363-03:00 WARN  i.o.api.GlobalOpenTelemetry - You are currently using the OpenTelemetry Instrumentation Java Agent; all GlobalOpenTelemetry.set calls are ignored - the agent provides the global OpenTelemetry object used by your application.
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec sigsj-alvara-des-669-bsj5j -n sigsj-des -- env | grep JAVA_OPTIONS_APPEND
JAVA_OPTIONS_APPEND=-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd-sigsj-20260707.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.1.jar -Dotel.exporter.otlp.endpoint=https://otel-collector-nprd.cemot.cloud.caixa
-sh-4.2$
