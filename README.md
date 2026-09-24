exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd-sigsj-20260707.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.1.jar -Dotel.exporter.otlp.endpoint=https://otel-collector-nprd.cemot.cloud.caixa -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|apim-parceiros-sandbox.azure-api.net -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-24 15:26:36.237-03:00 WARN  i.o.s.a.ResourceConfiguration - Found reference to io.opentelemetry.sdk.autoconfigure.internal.EnvironmentResourceProvider in otel.java.enabled.resource.providers. Please update to io.opentelemetry.sdk.autoconfigure.EnvironmentResourceProvider. Support for the old provider name will be removed after 1.49.0.
2026-09-24 15:26:39.026-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.7.1 started successfully (PID 8, JVM running for 5.804 s)
2026-09-24 15:26:39.028-03:00 INFO  c.m.applicationinsights.agent - Java version: 17.0.7, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-17-openjdk-17.0.7.0.7-3.el8.x86_64
2026-09-24 15:26:51.722-03:00 WARN  i.o.api.GlobalOpenTelemetry - You are currently using the OpenTelemetry Instrumentation Java Agent; all GlobalOpenTelemetry.set calls are ignored - the agent provides the global OpenTelemetry object used by your application.
java.lang.Throwable: null
	at io.opentelemetry.api.GlobalOpenTelemetry.set(GlobalOpenTelemetry.java:105)
	at io.opentelemetry.sdk.autoconfigure.AutoConfiguredOpenTelemetrySdkBuilder.maybeSetAsGlobal(AutoConfiguredOpenTelemetrySdkBuilder.java:589)
	at io.opentelemetry.sdk.autoconfigure.AutoConfiguredOpenTelemetrySdkBuilder.build(AutoConfiguredOpenTelemetrySdkBuilder.java:506)
	at io.quarkus.opentelemetry.runtime.OpenTelemetryRecorder$1.apply(OpenTelemetryRecorder.java:81)
	at io.quarkus.opentelemetry.runtime.OpenTelemetryRecorder$1.apply(OpenTelemetryRecorder.java:54)
	at io.opentelemetry.api.OpenTelemetry_Le6zQbzkojAYO_OiKIQWJf4lGa4_Synthetic_Bean.createSynthetic(Unknown Source)
	at io.opentelemetry.api.OpenTelemetry_Le6zQbzkojAYO_OiKIQWJf4lGa4_Synthetic_Bean.doCreate(Unknown Source)
	at io.opentelemetry.api.OpenTelemetry_Le6zQbzkojAYO_OiKIQWJf4lGa4_Synthetic_Bean.create(Unknown Source)
	at io.opentelemetry.api.OpenTelemetry_Le6zQbzkojAYO_OiKIQWJf4lGa4_Synthetic_Bean.create(Unknown Source)
	at io.quarkus.arc.impl.AbstractSharedContext.createInstanceHandle(AbstractSharedContext.java:119)
	at io.quarkus.arc.impl.AbstractSharedContext$1.get(AbstractSharedContext.java:38)
	at io.quarkus.arc.impl.AbstractSharedContext$1.get(AbstractSharedContext.java:35)
	at io.quarkus.arc.impl.LazyValue.get(LazyValue.java:32)
	at io.quarkus.arc.impl.ComputingCache.computeIfAbsent(ComputingCache.java:69)
	at io.quarkus.arc.impl.ComputingCacheContextInstances.computeIfAbsent(ComputingCacheContextInstances.java:19)
	at io.quarkus.arc.impl.AbstractSharedContext.get(AbstractSharedContext.java:35)
	at io.opentelemetry.api.OpenTelemetry_Le6zQbzkojAYO_OiKIQWJf4lGa4_Synthetic_Bean.get(Unknown Source)
	at io.opentelemetry.api.OpenTelemetry_Le6zQbzkojAYO_OiKIQWJf4lGa4_Synthetic_Bean.get(Unknown Source)
	at io.quarkus.arc.impl.InstanceImpl.getBeanInstance(InstanceImpl.java:325)
	at io.quarkus.arc.impl.InstanceImpl.getInternal(InstanceImpl.java:309)
	at io.quarkus.arc.impl.InstanceImpl.get(InstanceImpl.java:190)
	at io.quarkus.arc.runtime.BeanContainerImpl.beanInstance(BeanContainerImpl.java:26)
	at io.quarkus.opentelemetry.runtime.tracing.intrumentation.InstrumentationRecorder.setupVertxTracer(InstrumentationRecorder.java:58)
	at io.quarkus.deployment.steps.OpenTelemetryProcessor$setupVertx126580776.deploy_0(Unknown Source)
	at io.quarkus.deployment.steps.OpenTelemetryProcessor$setupVertx126580776.deploy(Unknown Source)
	at io.quarkus.runner.ApplicationImpl.doStart(Unknown Source)
	at io.quarkus.runtime.Application.start(Application.java:101)
	at io.quarkus.runtime.ApplicationLifecycleManager.run(ApplicationLifecycleManager.java:119)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:71)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:44)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:124)
	at io.quarkus.runner.GeneratedMain.main(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.doRun(QuarkusEntryPoint.java:62)
	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.main(QuarkusEntryPoint.java:33)
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
15:29:53 INFO  [id=3225445] NSU gerado: 3225445
15:29:53 INFO  [id=3225445] Buscando o tribunal: 02566224000190
15:29:54 INFO  [id=3225445] 
CLI > SER [POST] http://sigsj-alvara-des.apps.nprd.caixa/deposito-judicial/levantamento/v2/alvara/transacao

15:29:54 INFO  [id=3225445]  ######## FILTRO AUTH ############ 
15:29:54 INFO  [id=3225445] 
SER > CLI [POST] http://sigsj-alvara-des.apps.nprd.caixa/deposito-judicial/levantamento/v2/alvara/transacao : 200
{
  [36m"codigoTransacao"[0m: [32m"f91cfa86-7623-4d3c-86ea-621abc9345bb"[0m,
  [36m"criadoEm"[0m: [32m"2026-09-24T15: [33m29[0m: [33m54.109472217[0m"[0m
}
