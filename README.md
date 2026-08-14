exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|10.0.0.0/8 -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
[38;5;145m2026-08-14 09:54:20,592[39m[38;5;188m [39m[38;5;137mWARN [39m[38;5;188m [[39m[38;5;69mio.qua.config[39m[38;5;188m] ([39m[38;5;71mmain[39m[38;5;188m) [39m[38;5;151m[39mUnrecognized configuration key "[38;5;188mquarkus.rest-client.logging.level[39m" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:54:20,651[39m[38;5;188m [39m[38;5;137mWARN [39m[38;5;188m [[39m[38;5;69mio.qua.config[39m[38;5;188m] ([39m[38;5;71mmain[39m[38;5;188m) [39m[38;5;151m[39mUnrecognized configuration key "[38;5;188mquarkus.rest-client."sso.keycloak".insecure[39m" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:54:22,253[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mio.quarkus[39m[38;5;188m] ([39m[38;5;71mmain[39m[38;5;188m) [39m[38;5;151m[39m[38;5;188msifpp-ms 0.0.0.1[39m [38;5;188mon JVM[39m (powered by Quarkus [38;5;188m3.15.3.redhat-00002[39m) started in [38;5;188m2.291[39ms. [38;5;188mListening on: http://0.0.0.0:8080[39m[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:54:22,254[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mio.quarkus[39m[38;5;188m] ([39m[38;5;71mmain[39m[38;5;188m) [39m[38;5;151m[39mProfile[38;5;188m[39m [38;5;188mprod[39m activated. [38;5;188m[39m[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:54:22,254[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mio.quarkus[39m[38;5;188m] ([39m[38;5;71mmain[39m[38;5;188m) [39m[38;5;151m[39mInstalled features: [[38;5;188magroal, cache, cdi, hibernate-orm, hibernate-validator, jdbc-mssql, narayana-jta, oidc, oidc-client, rest, rest-client, rest-client-jackson, rest-client-oidc-filter, rest-jackson, security, smallrye-context-propagation, smallrye-fault-tolerance, smallrye-health, smallrye-metrics, smallrye-openapi, swagger-ui, vertx[39m][39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:24,807[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:24,807[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPOST /boletos/incluir - Iniciando inclus?o de boleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:24,807[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:24,808[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 1/2: Solicitando token ao SSO (Keycloak)...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:24,808[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando obten??o de token SSO ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:24,862[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOTokenRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mSolicitando novo token ao Keycloak...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:25,617[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.TokenCacheService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mToken armazenado em cache - expira??o em: 2026-08-14T09:56:25.616980222[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:25,617[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Token obtido com sucesso do Keycloak[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:25,617[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? PASSO 1/2 CONCLU?DO[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:25,617[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 2/2: Chamando API de inclus?o de boleto...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:25,618[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mNumero Documento: 1416[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:25,618[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mValor: 3333.33[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:25,618[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mData Vencimento: 2026-08-30[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:25,618[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando chamada para gera??o de boleto (RestClient) ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:25,618[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Gerando Boleto ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:25,618[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mEndpoint: POST /cobranca/boletos/v1/incluiBoleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:25,618[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mHeaders: Authorization=[presente], apikey=[injetado automaticamente], Content-Type=[application/json][39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:25,619[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Numero Documento: 1416[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:25,619[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Valor: 3333.33[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:26,502[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.ret.IncluirBoletoApiRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mErro HTTP ao consumir API de boleto - Status: 400[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:26,502[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.ret.IncluirBoletoApiRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mResponse: {"codRetorno":2,"numCodBarras":"","numLinhaDigTvl":"","nossoNumGerado":14100000000210420,"urlBoleto":"","qrCode":"00020101021226910014br.gov.bcb.pix2569pix-qrcode-h.caixa.gov.br/api/v2/cobv/CO011000002730141000000002104205204000053039865802BR592558 486 338CAIO E GUSTAVO 6009PARINTINS62070503***6304ED00","urlQrcode":"","codErro":904,"msgSistema":"SISTEMA INDISPONIVEL - ERRO NO INSERT DA TABELA GCBTB044"}[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:26,503[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Falha em integracao no fluxo /boletos/incluir[39m[38;5;203m: gov.caixa.microfpp.infra.exceptions.ExternalServiceException: Falha ao consumir a API de boleto. Status HTTP upstream: 400. Detalhe: {"codRetorno":2,"numCodBarras":"","numLinhaDigTvl":"","nossoNumGerado":14100000000210420,"urlBoleto":"","qrCode":"00020101021226910014br.gov.bcb.pix2569pix-qrcode-h.caixa.gov.br/api/v2/cobv/CO011000002730141000000002104205204000053039865802BR592558 486 338CAIO E GUSTAVO 6009PARINTINS62070503***6304ED00","urlQrcode":"","codErro":904,"msgSistema":"SISTEMA INDISPONIVEL - ERRO NO INSERT DA TABELA GCBTB044"}
	at gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService.incluiBoleto(IncluirBoletoApiRetryService.java:52)
	at gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService_Subclass.incluiBoleto$$superforward(Unknown Source)
	at gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.lambda$syncFlow$3(FaultToleranceInterceptor.java:267)
	at io.smallrye.faulttolerance.core.InvocationContext.call(InvocationContext.java:19)
	at io.smallrye.faulttolerance.core.Invocation.apply(Invocation.java:29)
	at io.smallrye.faulttolerance.core.retry.Retry.doApply(Retry.java:104)
	at io.smallrye.faulttolerance.core.retry.Retry.apply(Retry.java:50)
	at io.smallrye.faulttolerance.core.metrics.MetricsCollector.doApply(MetricsCollector.java:100)
	at io.smallrye.faulttolerance.core.metrics.MetricsCollector.apply(MetricsCollector.java:90)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.syncFlow(FaultToleranceInterceptor.java:269)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.intercept(FaultToleranceInterceptor.java:196)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService_Subclass.incluiBoleto(Unknown Source)
	at gov.caixa.microfpp.services.IncluirBoletoService.gerarBoleto(IncluirBoletoService.java:44)
	at gov.caixa.microfpp.resources.BoletoResource.incluirBoleto(BoletoResource.java:83)
	at gov.caixa.microfpp.resources.BoletoResource$quarkusrestinvoker$incluirBoleto_5cf0d3aa79c9177bb54cfa4c4d19fe0ad109aa03.invoke(Unknown Source)
	at org.jboss.resteasy.reactive.server.handlers.InvocationHandler.handle(InvocationHandler.java:29)
	at io.quarkus.resteasy.reactive.server.runtime.QuarkusResteasyReactiveRequestContext.invokeHandler(QuarkusResteasyReactiveRequestContext.java:141)
	at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.run(AbstractResteasyReactiveContext.java:147)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:635)
	at org.jboss.threads.EnhancedQueueExecutor$Task.doRunWith(EnhancedQueueExecutor.java:2516)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2495)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1521)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:11)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:11)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.jboss.resteasy.reactive.ClientWebApplicationException: Received: ', status code 400' when invoking REST Client method: 'gov.caixa.microfpp.infra.client.IncluirBoletoApiClient#incluiBoleto'
	at org.jboss.resteasy.reactive.client.impl.RestClientRequestContext.unwrapException(RestClientRequestContext.java:205)
	at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.handleException(AbstractResteasyReactiveContext.java:329)
	at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.run(AbstractResteasyReactiveContext.java:175)
	at org.jboss.resteasy.reactive.client.impl.RestClientRequestContext$1.lambda$execute$0(RestClientRequestContext.java:324)
	at io.vertx.core.impl.ContextInternal.dispatch(ContextInternal.java:270)
	at io.vertx.core.impl.ContextInternal.dispatch(ContextInternal.java:252)
	at io.vertx.core.impl.ContextInternal.lambda$runOnContext$0(ContextInternal.java:50)
	at io.netty.util.concurrent.AbstractEventExecutor.runTask(AbstractEventExecutor.java:173)
	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:166)
	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:472)
	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:566)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	... 2 more
Caused by: jakarta.ws.rs.WebApplicationException: , status code 400
	at gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService.incluiBoleto(IncluirBoletoApiRetryService.java:31)
	at gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService_Subclass.incluiBoleto$$superforward(Unknown Source)
	at gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.lambda$syncFlow$3(FaultToleranceInterceptor.java:267)
	at io.smallrye.faulttolerance.core.InvocationContext.call(InvocationContext.java:19)
	at io.smallrye.faulttolerance.core.Invocation.apply(Invocation.java:29)
	at io.smallrye.faulttolerance.core.retry.Retry.doApply(Retry.java:104)
	at io.smallrye.faulttolerance.core.retry.Retry.apply(Retry.java:50)
	at io.smallrye.faulttolerance.core.metrics.MetricsCollector.doApply(MetricsCollector.java:100)
	at io.smallrye.faulttolerance.core.metrics.MetricsCollector.apply(MetricsCollector.java:90)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.syncFlow(FaultToleranceInterceptor.java:269)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.intercept(FaultToleranceInterceptor.java:196)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService_Subclass.incluiBoleto(Unknown Source)
	at gov.caixa.microfpp.services.IncluirBoletoService.gerarBoleto(IncluirBoletoService.java:44)
	at gov.caixa.microfpp.resources.BoletoResource.incluirBoleto(BoletoResource.java:83)
	at gov.caixa.microfpp.resources.BoletoResource$quarkusrestinvoker$incluirBoleto_5cf0d3aa79c9177bb54cfa4c4d19fe0ad109aa03.invoke(Unknown Source)
	at org.jboss.resteasy.reactive.server.handlers.InvocationHandler.handle(InvocationHandler.java:29)
	at io.quarkus.resteasy.reactive.server.runtime.QuarkusResteasyReactiveRequestContext.invokeHandler(QuarkusResteasyReactiveRequestContext.java:141)
	at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.run(AbstractResteasyReactiveContext.java:147)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:635)
	at org.jboss.threads.EnhancedQueueExecutor$Task.doRunWith(EnhancedQueueExecutor.java:2516)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2495)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1521)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:11)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:11)
	... 2 more
[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:30,609[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:30,609[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPOST /boletos/incluir - Iniciando inclus?o de boleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:30,609[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:30,609[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 1/2: Solicitando token ao SSO (Keycloak)...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:30,610[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando obten??o de token SSO ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:30,610[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.TokenCacheService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mToken expirado no cache[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:30,610[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOTokenRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mSolicitando novo token ao Keycloak...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:30,645[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.TokenCacheService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mToken armazenado em cache - expira??o em: 2026-08-14T09:56:30.645018429[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:30,645[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Token obtido com sucesso do Keycloak[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:30,645[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? PASSO 1/2 CONCLU?DO[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:30,645[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 2/2: Chamando API de inclus?o de boleto...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:30,645[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mNumero Documento: 1416[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:30,646[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mValor: 3333.33[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:30,646[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mData Vencimento: 2026-08-30[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:30,646[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando chamada para gera??o de boleto (RestClient) ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:30,646[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Gerando Boleto ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:30,646[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mEndpoint: POST /cobranca/boletos/v1/incluiBoleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:30,646[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mHeaders: Authorization=[presente], apikey=[injetado automaticamente], Content-Type=[application/json][39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:30,646[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Numero Documento: 1416[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:30,646[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Valor: 3333.33[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:31,103[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.ret.IncluirBoletoApiRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mErro HTTP ao consumir API de boleto - Status: 400[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:31,103[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.ret.IncluirBoletoApiRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mResponse: {"codRetorno":2,"numCodBarras":"","numLinhaDigTvl":"","nossoNumGerado":14100000000206645,"urlBoleto":"","qrCode":"00020101021226910014br.gov.bcb.pix2569pix-qrcode-h.caixa.gov.br/api/v2/cobv/CO011000002730141000000002066455204000053039865802BR592558 486 338CAIO E GUSTAVO 6009PARINTINS62070503***6304BB66","urlQrcode":"","codErro":904,"msgSistema":"SISTEMA INDISPONIVEL - ERRO NO INSERT DA TABELA GCBTB044"}[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 09:56:31,104[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Falha em integracao no fluxo /boletos/incluir[39m[38;5;203m: gov.caixa.microfpp.infra.exceptions.ExternalServiceException: Falha ao consumir a API de boleto. Status HTTP upstream: 400. Detalhe: {"codRetorno":2,"numCodBarras":"","numLinhaDigTvl":"","nossoNumGerado":14100000000206645,"urlBoleto":"","qrCode":"00020101021226910014br.gov.bcb.pix2569pix-qrcode-h.caixa.gov.br/api/v2/cobv/CO011000002730141000000002066455204000053039865802BR592558 486 338CAIO E GUSTAVO 6009PARINTINS62070503***6304BB66","urlQrcode":"","codErro":904,"msgSistema":"SISTEMA INDISPONIVEL - ERRO NO INSERT DA TABELA GCBTB044"}
	at gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService.incluiBoleto(IncluirBoletoApiRetryService.java:52)
	at gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService_Subclass.incluiBoleto$$superforward(Unknown Source)
	at gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.lambda$syncFlow$3(FaultToleranceInterceptor.java:267)
	at io.smallrye.faulttolerance.core.InvocationContext.call(InvocationContext.java:19)
	at io.smallrye.faulttolerance.core.Invocation.apply(Invocation.java:29)
	at io.smallrye.faulttolerance.core.retry.Retry.doApply(Retry.java:104)
	at io.smallrye.faulttolerance.core.retry.Retry.apply(Retry.java:50)
	at io.smallrye.faulttolerance.core.metrics.MetricsCollector.doApply(MetricsCollector.java:100)
	at io.smallrye.faulttolerance.core.metrics.MetricsCollector.apply(MetricsCollector.java:90)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.syncFlow(FaultToleranceInterceptor.java:269)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.intercept(FaultToleranceInterceptor.java:196)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService_Subclass.incluiBoleto(Unknown Source)
	at gov.caixa.microfpp.services.IncluirBoletoService.gerarBoleto(IncluirBoletoService.java:44)
	at gov.caixa.microfpp.resources.BoletoResource.incluirBoleto(BoletoResource.java:83)
	at gov.caixa.microfpp.resources.BoletoResource$quarkusrestinvoker$incluirBoleto_5cf0d3aa79c9177bb54cfa4c4d19fe0ad109aa03.invoke(Unknown Source)
	at org.jboss.resteasy.reactive.server.handlers.InvocationHandler.handle(InvocationHandler.java:29)
	at io.quarkus.resteasy.reactive.server.runtime.QuarkusResteasyReactiveRequestContext.invokeHandler(QuarkusResteasyReactiveRequestContext.java:141)
	at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.run(AbstractResteasyReactiveContext.java:147)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:635)
	at org.jboss.threads.EnhancedQueueExecutor$Task.doRunWith(EnhancedQueueExecutor.java:2516)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2495)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1521)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:11)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:11)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.jboss.resteasy.reactive.ClientWebApplicationException: Received: ', status code 400' when invoking REST Client method: 'gov.caixa.microfpp.infra.client.IncluirBoletoApiClient#incluiBoleto'
	at org.jboss.resteasy.reactive.client.impl.RestClientRequestContext.unwrapException(RestClientRequestContext.java:205)
	at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.handleException(AbstractResteasyReactiveContext.java:329)
	at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.run(AbstractResteasyReactiveContext.java:175)
	at org.jboss.resteasy.reactive.client.impl.RestClientRequestContext$1.lambda$execute$0(RestClientRequestContext.java:324)
	at io.vertx.core.impl.ContextInternal.dispatch(ContextInternal.java:270)
	at io.vertx.core.impl.ContextInternal.dispatch(ContextInternal.java:252)
	at io.vertx.core.impl.ContextInternal.lambda$runOnContext$0(ContextInternal.java:50)
	at io.netty.util.concurrent.AbstractEventExecutor.runTask(AbstractEventExecutor.java:173)
	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:166)
	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:472)
	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:566)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	... 2 more
Caused by: jakarta.ws.rs.WebApplicationException: , status code 400
	at gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService.incluiBoleto(IncluirBoletoApiRetryService.java:31)
	at gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService_Subclass.incluiBoleto$$superforward(Unknown Source)
	at gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.lambda$syncFlow$3(FaultToleranceInterceptor.java:267)
	at io.smallrye.faulttolerance.core.InvocationContext.call(InvocationContext.java:19)
	at io.smallrye.faulttolerance.core.Invocation.apply(Invocation.java:29)
	at io.smallrye.faulttolerance.core.retry.Retry.doApply(Retry.java:104)
	at io.smallrye.faulttolerance.core.retry.Retry.apply(Retry.java:50)
	at io.smallrye.faulttolerance.core.metrics.MetricsCollector.doApply(MetricsCollector.java:100)
	at io.smallrye.faulttolerance.core.metrics.MetricsCollector.apply(MetricsCollector.java:90)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.syncFlow(FaultToleranceInterceptor.java:269)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.intercept(FaultToleranceInterceptor.java:196)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at gov.caixa.microfpp.services.apiService.retry.IncluirBoletoApiRetryService_Subclass.incluiBoleto(Unknown Source)
	at gov.caixa.microfpp.services.IncluirBoletoService.gerarBoleto(IncluirBoletoService.java:44)
	at gov.caixa.microfpp.resources.BoletoResource.incluirBoleto(BoletoResource.java:83)
	at gov.caixa.microfpp.resources.BoletoResource$quarkusrestinvoker$incluirBoleto_5cf0d3aa79c9177bb54cfa4c4d19fe0ad109aa03.invoke(Unknown Source)
	at org.jboss.resteasy.reactive.server.handlers.InvocationHandler.handle(InvocationHandler.java:29)
	at io.quarkus.resteasy.reactive.server.runtime.QuarkusResteasyReactiveRequestContext.invokeHandler(QuarkusResteasyReactiveRequestContext.java:141)
	at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.run(AbstractResteasyReactiveContext.java:147)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:635)
	at org.jboss.threads.EnhancedQueueExecutor$Task.doRunWith(EnhancedQueueExecutor.java:2516)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2495)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1521)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:11)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:11)
	... 2 more
[39m[38;5;227m
[39m
