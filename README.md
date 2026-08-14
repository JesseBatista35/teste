exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|10.0.0.0/8 -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
[38;5;145m2026-08-14 09:35:17,606[39m[38;5;188m [39m[38;5;137mWARN [39m[38;5;188m [[39m[38;5;69mio.qua.config[39m[38;5;188m] ([39m[38;5;71mmain[39m[38;5;188m) [39m[38;5;151m[39mUnrecognized configuration key "[38;5;188mquarkus.rest-client.logging.level[39m" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:35:17,607[39m[38;5;188m [39m[38;5;137mWARN [39m[38;5;188m [[39m[38;5;69mio.qua.config[39m[38;5;188m] ([39m[38;5;71mmain[39m[38;5;188m) [39m[38;5;151m[39mUnrecognized configuration key "[38;5;188mquarkus.rest-client."sso.keycloak".insecure[39m" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:35:19,189[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mio.quarkus[39m[38;5;188m] ([39m[38;5;71mmain[39m[38;5;188m) [39m[38;5;151m[39m[38;5;188msifpp-ms 0.0.0.1[39m [38;5;188mon JVM[39m (powered by Quarkus [38;5;188m3.15.3.redhat-00002[39m) started in [38;5;188m2.132[39ms. [38;5;188mListening on: http://0.0.0.0:8080[39m[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:35:19,189[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mio.quarkus[39m[38;5;188m] ([39m[38;5;71mmain[39m[38;5;188m) [39m[38;5;151m[39mProfile[38;5;188m[39m [38;5;188mprod[39m activated. [38;5;188m[39m[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:35:19,189[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mio.quarkus[39m[38;5;188m] ([39m[38;5;71mmain[39m[38;5;188m) [39m[38;5;151m[39mInstalled features: [[38;5;188magroal, cache, cdi, hibernate-orm, hibernate-validator, jdbc-mssql, narayana-jta, oidc, oidc-client, rest, rest-client, rest-client-jackson, rest-client-oidc-filter, rest-jackson, security, smallrye-context-propagation, smallrye-fault-tolerance, smallrye-health, smallrye-metrics, smallrye-openapi, swagger-ui, vertx[39m][39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:42:45,016[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mio.qua.ver.htt.run.QuarkusErrorHandler[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m[39mHTTP Request to [38;5;188m/boletos/incluir[39m failed, error id: [38;5;188m82736d06-5d95-4d27-a354-71b4f9152d5c-1[39m[39m[38;5;203m: java.lang.RuntimeException: Error injecting gov.caixa.microfpp.services.IncluirBoletoService gov.caixa.microfpp.resources.BoletoResource.boletoService
	at gov.caixa.microfpp.resources.BoletoResource_Bean.doCreate(Unknown Source)
	at gov.caixa.microfpp.resources.BoletoResource_Bean.create(Unknown Source)
	at gov.caixa.microfpp.resources.BoletoResource_Bean.create(Unknown Source)
	at io.quarkus.arc.impl.AbstractSharedContext.createInstanceHandle(AbstractSharedContext.java:119)
	at io.quarkus.arc.impl.AbstractSharedContext$1.get(AbstractSharedContext.java:38)
	at io.quarkus.arc.impl.AbstractSharedContext$1.get(AbstractSharedContext.java:35)
	at io.quarkus.arc.impl.LazyValue.get(LazyValue.java:32)
	at io.quarkus.arc.impl.ComputingCache.computeIfAbsent(ComputingCache.java:69)
	at io.quarkus.arc.impl.ComputingCacheContextInstances.computeIfAbsent(ComputingCacheContextInstances.java:19)
	at io.quarkus.arc.impl.AbstractSharedContext.get(AbstractSharedContext.java:35)
	at gov.caixa.microfpp.resources.BoletoResource_Bean.get(Unknown Source)
	at gov.caixa.microfpp.resources.BoletoResource_Bean.get(Unknown Source)
	at io.quarkus.arc.impl.ArcContainerImpl.beanInstanceHandle(ArcContainerImpl.java:559)
	at io.quarkus.arc.impl.ArcContainerImpl.beanInstanceHandle(ArcContainerImpl.java:539)
	at io.quarkus.arc.impl.ArcContainerImpl.beanInstanceHandle(ArcContainerImpl.java:572)
	at io.quarkus.arc.impl.ArcContainerImpl$3.get(ArcContainerImpl.java:331)
	at io.quarkus.arc.impl.ArcContainerImpl$3.get(ArcContainerImpl.java:328)
	at io.quarkus.arc.runtime.BeanContainerImpl$1.create(BeanContainerImpl.java:58)
	at io.quarkus.resteasy.reactive.common.runtime.ArcBeanFactory.createInstance(ArcBeanFactory.java:27)
	at org.jboss.resteasy.reactive.server.handlers.InstanceHandler.handle(InstanceHandler.java:26)
	at io.quarkus.resteasy.reactive.server.runtime.QuarkusResteasyReactiveRequestContext.invokeHandler(QuarkusResteasyReactiveRequestContext.java:139)
	at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.run(AbstractResteasyReactiveContext.java:147)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:635)
	at org.jboss.threads.EnhancedQueueExecutor$Task.doRunWith(EnhancedQueueExecutor.java:2516)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2495)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1521)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:11)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:11)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: java.lang.RuntimeException: Error injecting gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService gov.caixa.microfpp.services.IncluirBoletoService.boletoApiRetryService
	at gov.caixa.microfpp.services.IncluirBoletoService_Bean.doCreate(Unknown Source)
	at gov.caixa.microfpp.services.IncluirBoletoService_Bean.create(Unknown Source)
	at gov.caixa.microfpp.services.IncluirBoletoService_Bean.create(Unknown Source)
	at io.quarkus.arc.impl.AbstractSharedContext.createInstanceHandle(AbstractSharedContext.java:119)
	at io.quarkus.arc.impl.AbstractSharedContext$1.get(AbstractSharedContext.java:38)
	at io.quarkus.arc.impl.AbstractSharedContext$1.get(AbstractSharedContext.java:35)
	at io.quarkus.arc.impl.LazyValue.get(LazyValue.java:32)
	at io.quarkus.arc.impl.ComputingCache.computeIfAbsent(ComputingCache.java:69)
	at io.quarkus.arc.impl.ComputingCacheContextInstances.computeIfAbsent(ComputingCacheContextInstances.java:19)
	at io.quarkus.arc.impl.AbstractSharedContext.get(AbstractSharedContext.java:35)
	at gov.caixa.microfpp.services.IncluirBoletoService_Bean.get(Unknown Source)
	at gov.caixa.microfpp.services.IncluirBoletoService_Bean.get(Unknown Source)
	... 30 more
Caused by: java.lang.RuntimeException: Error injecting gov.caixa.microfpp.infra.client.IncluirBoletoApiClient gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService.boletoApiClient
	at gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService_Bean.doCreate(Unknown Source)
	at gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService_Bean.create(Unknown Source)
	at gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService_Bean.create(Unknown Source)
	at io.quarkus.arc.impl.AbstractSharedContext.createInstanceHandle(AbstractSharedContext.java:119)
	at io.quarkus.arc.impl.AbstractSharedContext$1.get(AbstractSharedContext.java:38)
	at io.quarkus.arc.impl.AbstractSharedContext$1.get(AbstractSharedContext.java:35)
	at io.quarkus.arc.impl.LazyValue.get(LazyValue.java:32)
	at io.quarkus.arc.impl.ComputingCache.computeIfAbsent(ComputingCache.java:69)
	at io.quarkus.arc.impl.ComputingCacheContextInstances.computeIfAbsent(ComputingCacheContextInstances.java:19)
	at io.quarkus.arc.impl.AbstractSharedContext.get(AbstractSharedContext.java:35)
	at gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService_Bean.get(Unknown Source)
	at gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService_Bean.get(Unknown Source)
	... 42 more
Caused by: java.lang.IllegalArgumentException: Unable to determine the proper baseUrl/baseUri. Consider registering using @RegisterRestClient(baseUri="someuri"), @RegisterRestClient(configKey="orkey"), or by adding 'quarkus.rest-client.boleto.api.url' or 'quarkus.rest-client.boleto.api.uri' to your Quarkus configuration
	at io.quarkus.rest.client.reactive.runtime.RestClientCDIDelegateBuilder.configureBaseUrl(RestClientCDIDelegateBuilder.java:416)
	at io.quarkus.rest.client.reactive.runtime.RestClientCDIDelegateBuilder.configureBuilder(RestClientCDIDelegateBuilder.java:73)
	at io.quarkus.rest.client.reactive.runtime.RestClientCDIDelegateBuilder.build(RestClientCDIDelegateBuilder.java:68)
	at io.quarkus.rest.client.reactive.runtime.RestClientCDIDelegateBuilder.createDelegate(RestClientCDIDelegateBuilder.java:50)
	at io.quarkus.rest.client.reactive.runtime.RestClientReactiveCDIWrapperBase.delegate(RestClientReactiveCDIWrapperBase.java:76)
	at io.quarkus.rest.client.reactive.runtime.RestClientReactiveCDIWrapperBase.<init>(RestClientReactiveCDIWrapperBase.java:30)
	at gov.caixa.microfpp.infra.client.IncluirBoletoApiClient$$CDIWrapper.<init>(Unknown Source)
	at gov.caixa.microfpp.infra.client.IncluirBoletoApiClient$$CDIWrapper_ClientProxy.<init>(Unknown Source)
	at gov.caixa.microfpp.infra.client.IncluirBoletoApiClient$$CDIWrapper_Bean.proxy(Unknown Source)
	at gov.caixa.microfpp.infra.client.IncluirBoletoApiClient$$CDIWrapper_Bean.get(Unknown Source)
	at gov.caixa.microfpp.infra.client.IncluirBoletoApiClient$$CDIWrapper_Bean.get(Unknown Source)
	... 54 more
[39m[38;5;227m
[39m
