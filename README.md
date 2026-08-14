exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|10.0.0.0/8 -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
[38;5;145m2026-08-14 10:14:06,204[39m[38;5;188m [39m[38;5;137mWARN [39m[38;5;188m [[39m[38;5;69mio.qua.config[39m[38;5;188m] ([39m[38;5;71mmain[39m[38;5;188m) [39m[38;5;151m[39mUnrecognized configuration key "[38;5;188mquarkus.rest-client.logging.level[39m" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:14:06,205[39m[38;5;188m [39m[38;5;137mWARN [39m[38;5;188m [[39m[38;5;69mio.qua.config[39m[38;5;188m] ([39m[38;5;71mmain[39m[38;5;188m) [39m[38;5;151m[39mUnrecognized configuration key "[38;5;188mquarkus.rest-client."sso.keycloak".insecure[39m" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:14:07,907[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mio.quarkus[39m[38;5;188m] ([39m[38;5;71mmain[39m[38;5;188m) [39m[38;5;151m[39m[38;5;188msifpp-ms 0.0.0.1[39m [38;5;188mon JVM[39m (powered by Quarkus [38;5;188m3.15.3.redhat-00002[39m) started in [38;5;188m2.462[39ms. [38;5;188mListening on: http://0.0.0.0:8080[39m[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:14:07,907[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mio.quarkus[39m[38;5;188m] ([39m[38;5;71mmain[39m[38;5;188m) [39m[38;5;151m[39mProfile[38;5;188m[39m [38;5;188mprod[39m activated. [38;5;188m[39m[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:14:07,907[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mio.quarkus[39m[38;5;188m] ([39m[38;5;71mmain[39m[38;5;188m) [39m[38;5;151m[39mInstalled features: [[38;5;188magroal, cache, cdi, hibernate-orm, hibernate-validator, jdbc-mssql, narayana-jta, oidc, oidc-client, rest, rest-client, rest-client-jackson, rest-client-oidc-filter, rest-jackson, security, smallrye-context-propagation, smallrye-fault-tolerance, smallrye-health, smallrye-metrics, smallrye-openapi, swagger-ui, vertx[39m][39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:15:43,207[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:15:43,207[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPOST /boletos/incluir - Iniciando inclus?o de boleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:15:43,207[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:15:43,207[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 1/2: Solicitando token ao SSO (Keycloak)...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:15:43,208[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando obten??o de token SSO ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:15:43,219[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOTokenRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mSolicitando novo token ao Keycloak...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:15:43,952[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.TokenCacheService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mToken armazenado em cache - expira??o em: 2026-08-14T10:15:43.952196737[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:15:43,952[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Token obtido com sucesso do Keycloak[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:15:43,952[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? PASSO 1/2 CONCLU?DO[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:15:43,953[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 2/2: Chamando API de inclus?o de boleto...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:15:43,953[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mNumero Documento: 1416[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:15:43,953[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mValor: 3333.33[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:15:43,953[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mData Vencimento: 2026-08-30[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:15:43,953[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando chamada para gera??o de boleto (RestClient) ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:15:43,953[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Gerando Boleto ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:15:43,953[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mEndpoint: POST /cobranca/boletos/v1/incluiBoleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:15:43,954[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mHeaders: Authorization=[presente], apikey=[injetado automaticamente], Content-Type=[application/json][39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:15:43,954[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Numero Documento: 1416[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:15:43,954[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Valor: 3333.33[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:15:44,603[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.ret.IncluirBoletoApiRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mErro HTTP ao consumir API de boleto - Status: 400[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:15:44,603[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.ret.IncluirBoletoApiRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mResponse: {"codRetorno":2,"numCodBarras":"","numLinhaDigTvl":"","nossoNumGerado":14100000000206658,"urlBoleto":"","qrCode":"00020101021226910014br.gov.bcb.pix2569pix-qrcode-h.caixa.gov.br/api/v2/cobv/CO011000002730141000000002066585204000053039865802BR592558 486 338CAIO E GUSTAVO 6009PARINTINS62070503***6304D7BD","urlQrcode":"","codErro":904,"msgSistema":"SISTEMA INDISPONIVEL - ERRO NO INSERT DA TABELA GCBTB044"}[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:15:44,609[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Falha em integracao no fluxo /boletos/incluir[39m[38;5;203m: gov.caixa.microfpp.infra.exceptions.ExternalServiceException: Falha ao consumir a API de boleto. Status HTTP upstream: 400. Detalhe: {"codRetorno":2,"numCodBarras":"","numLinhaDigTvl":"","nossoNumGerado":14100000000206658,"urlBoleto":"","qrCode":"00020101021226910014br.gov.bcb.pix2569pix-qrcode-h.caixa.gov.br/api/v2/cobv/CO011000002730141000000002066585204000053039865802BR592558 486 338CAIO E GUSTAVO 6009PARINTINS62070503***6304D7BD","urlQrcode":"","codErro":904,"msgSistema":"SISTEMA INDISPONIVEL - ERRO NO INSERT DA TABELA GCBTB044"}
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
[39m[38;5;145m2026-08-14 10:16:16,733[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:16,734[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPOST /boletos/incluir - Iniciando inclus?o de boleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:16,734[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:16,734[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 1/2: Solicitando token ao SSO (Keycloak)...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:16,734[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando obten??o de token SSO ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:16,734[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.TokenCacheService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mToken expirado no cache[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:16,734[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOTokenRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mSolicitando novo token ao Keycloak...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:16,784[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.TokenCacheService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mToken armazenado em cache - expira??o em: 2026-08-14T10:16:16.784902573[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:16,785[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Token obtido com sucesso do Keycloak[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:16,785[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? PASSO 1/2 CONCLU?DO[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:16,785[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 2/2: Chamando API de inclus?o de boleto...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:16,785[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mNumero Documento: 66237[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:16,785[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mValor: 929.5[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:16,786[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mData Vencimento: 2026-08-14[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:16,786[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando chamada para gera??o de boleto (RestClient) ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:16,786[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Gerando Boleto ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:16,786[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mEndpoint: POST /cobranca/boletos/v1/incluiBoleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:16,786[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mHeaders: Authorization=[presente], apikey=[injetado automaticamente], Content-Type=[application/json][39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:16,786[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Numero Documento: 66237[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:16,786[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Valor: 929.5[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:16,993[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.ret.IncluirBoletoApiRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mErro HTTP ao consumir API de boleto - Status: 400[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:16,993[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.ret.IncluirBoletoApiRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mResponse: {"codRetorno":2,"numCodBarras":"","numLinhaDigTvl":"","nossoNumGerado":14100000000210436,"urlBoleto":"","qrCode":"00020101021226910014br.gov.bcb.pix2569pix-qrcode-h.caixa.gov.br/api/v2/cobv/CO011000002730141000000002104365204000053039865802BR592558 486 338CAIO E GUSTAVO 6009PARINTINS62070503***63044ECB","urlQrcode":"","codErro":904,"msgSistema":"SISTEMA INDISPONIVEL - ERRO NO INSERT DA TABELA GCBTB044"}[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:16,994[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Falha em integracao no fluxo /boletos/incluir[39m[38;5;203m: gov.caixa.microfpp.infra.exceptions.ExternalServiceException: Falha ao consumir a API de boleto. Status HTTP upstream: 400. Detalhe: {"codRetorno":2,"numCodBarras":"","numLinhaDigTvl":"","nossoNumGerado":14100000000210436,"urlBoleto":"","qrCode":"00020101021226910014br.gov.bcb.pix2569pix-qrcode-h.caixa.gov.br/api/v2/cobv/CO011000002730141000000002104365204000053039865802BR592558 486 338CAIO E GUSTAVO 6009PARINTINS62070503***63044ECB","urlQrcode":"","codErro":904,"msgSistema":"SISTEMA INDISPONIVEL - ERRO NO INSERT DA TABELA GCBTB044"}
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
[39m[38;5;145m2026-08-14 10:16:17,067[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:17,067[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPOST /boletos/incluir - Iniciando inclus?o de boleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:17,067[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:17,067[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 1/2: Solicitando token ao SSO (Keycloak)...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:17,067[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando obten??o de token SSO ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:17,068[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.TokenCacheService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mToken expirado no cache[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:17,068[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOTokenRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mSolicitando novo token ao Keycloak...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:17,105[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.TokenCacheService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mToken armazenado em cache - expira??o em: 2026-08-14T10:16:17.105343527[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:17,105[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Token obtido com sucesso do Keycloak[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:17,105[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? PASSO 1/2 CONCLU?DO[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:17,105[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 2/2: Chamando API de inclus?o de boleto...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:17,106[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mNumero Documento: 66237[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:17,106[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mValor: 929.5[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:17,106[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mData Vencimento: 2026-08-14[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:17,106[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando chamada para gera??o de boleto (RestClient) ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:17,106[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Gerando Boleto ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:17,106[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mEndpoint: POST /cobranca/boletos/v1/incluiBoleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:17,106[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mHeaders: Authorization=[presente], apikey=[injetado automaticamente], Content-Type=[application/json][39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:17,106[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Numero Documento: 66237[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:17,106[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Valor: 929.5[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:17,489[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.ret.IncluirBoletoApiRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mErro HTTP ao consumir API de boleto - Status: 400[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:17,489[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.ret.IncluirBoletoApiRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mResponse: {"codRetorno":2,"numCodBarras":"","numLinhaDigTvl":"","nossoNumGerado":14100000000206659,"urlBoleto":"","qrCode":"00020101021226910014br.gov.bcb.pix2569pix-qrcode-h.caixa.gov.br/api/v2/cobv/CO011000002730141000000002066595204000053039865802BR592558 486 338CAIO E GUSTAVO 6009PARINTINS62070503***63040D88","urlQrcode":"","codErro":904,"msgSistema":"SISTEMA INDISPONIVEL - ERRO NO INSERT DA TABELA GCBTB044"}[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:16:17,490[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Falha em integracao no fluxo /boletos/incluir[39m[38;5;203m: gov.caixa.microfpp.infra.exceptions.ExternalServiceException: Falha ao consumir a API de boleto. Status HTTP upstream: 400. Detalhe: {"codRetorno":2,"numCodBarras":"","numLinhaDigTvl":"","nossoNumGerado":14100000000206659,"urlBoleto":"","qrCode":"00020101021226910014br.gov.bcb.pix2569pix-qrcode-h.caixa.gov.br/api/v2/cobv/CO011000002730141000000002066595204000053039865802BR592558 486 338CAIO E GUSTAVO 6009PARINTINS62070503***63040D88","urlQrcode":"","codErro":904,"msgSistema":"SISTEMA INDISPONIVEL - ERRO NO INSERT DA TABELA GCBTB044"}
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
[39m[38;5;145m2026-08-14 10:24:47,125[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:24:47,125[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPOST /boletos/incluir - Iniciando inclus?o de boleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:24:47,125[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:24:47,125[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 1/2: Solicitando token ao SSO (Keycloak)...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:24:47,125[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando obten??o de token SSO ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:24:47,125[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.TokenCacheService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mToken expirado no cache[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:24:47,126[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOTokenRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mSolicitando novo token ao Keycloak...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:24:47,170[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.TokenCacheService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mToken armazenado em cache - expira??o em: 2026-08-14T10:24:47.170718057[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:24:47,171[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Token obtido com sucesso do Keycloak[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:24:47,171[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? PASSO 1/2 CONCLU?DO[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:24:47,171[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 2/2: Chamando API de inclus?o de boleto...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:24:47,171[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mNumero Documento: 1416[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:24:47,171[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mValor: 3333.33[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:24:47,171[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mData Vencimento: 2026-08-30[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:24:47,171[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando chamada para gera??o de boleto (RestClient) ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:24:47,171[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Gerando Boleto ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:24:47,171[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mEndpoint: POST /cobranca/boletos/v1/incluiBoleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:24:47,171[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mHeaders: Authorization=[presente], apikey=[injetado automaticamente], Content-Type=[application/json][39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:24:47,171[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Numero Documento: 1416[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:24:47,171[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Valor: 3333.33[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:24:47,366[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.ret.IncluirBoletoApiRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mErro HTTP ao consumir API de boleto - Status: 400[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:24:47,366[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.ret.IncluirBoletoApiRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mResponse: {"codRetorno":2,"numCodBarras":"","numLinhaDigTvl":"","nossoNumGerado":14100000000206662,"urlBoleto":"","qrCode":"00020101021226910014br.gov.bcb.pix2569pix-qrcode-h.caixa.gov.br/api/v2/cobv/CO011000002730141000000002066625204000053039865802BR592558 486 338CAIO E GUSTAVO 6009PARINTINS62070503***630423C1","urlQrcode":"","codErro":904,"msgSistema":"SISTEMA INDISPONIVEL - ERRO NO INSERT DA TABELA GCBTB044"}[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:24:47,366[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Falha em integracao no fluxo /boletos/incluir[39m[38;5;203m: gov.caixa.microfpp.infra.exceptions.ExternalServiceException: Falha ao consumir a API de boleto. Status HTTP upstream: 400. Detalhe: {"codRetorno":2,"numCodBarras":"","numLinhaDigTvl":"","nossoNumGerado":14100000000206662,"urlBoleto":"","qrCode":"00020101021226910014br.gov.bcb.pix2569pix-qrcode-h.caixa.gov.br/api/v2/cobv/CO011000002730141000000002066625204000053039865802BR592558 486 338CAIO E GUSTAVO 6009PARINTINS62070503***630423C1","urlQrcode":"","codErro":904,"msgSistema":"SISTEMA INDISPONIVEL - ERRO NO INSERT DA TABELA GCBTB044"}
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
[39m[38;5;145m2026-08-14 10:31:35,353[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:31:35,354[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPOST /boletos/incluir - Iniciando inclus?o de boleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:31:35,354[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:31:35,354[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 1/2: Solicitando token ao SSO (Keycloak)...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:31:35,354[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando obten??o de token SSO ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:31:35,354[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.TokenCacheService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mToken expirado no cache[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:31:35,354[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOTokenRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mSolicitando novo token ao Keycloak...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:31:35,400[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.TokenCacheService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mToken armazenado em cache - expira??o em: 2026-08-14T10:31:35.400863386[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:31:35,401[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Token obtido com sucesso do Keycloak[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:31:35,401[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? PASSO 1/2 CONCLU?DO[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:31:35,401[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 2/2: Chamando API de inclus?o de boleto...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:31:35,401[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mNumero Documento: 1416[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:31:35,401[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mValor: 3333.33[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:31:35,401[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mData Vencimento: 2026-08-30[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:31:35,401[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando chamada para gera??o de boleto (RestClient) ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:31:35,401[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Gerando Boleto ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:31:35,401[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mEndpoint: POST /cobranca/boletos/v1/incluiBoleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:31:35,402[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mHeaders: Authorization=[presente], apikey=[injetado automaticamente], Content-Type=[application/json][39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:31:35,402[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Numero Documento: 1416[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:31:35,402[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Valor: 3333.33[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:31:35,964[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.ret.IncluirBoletoApiRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mErro HTTP ao consumir API de boleto - Status: 400[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:31:35,964[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.ret.IncluirBoletoApiRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mResponse: {"codRetorno":2,"numCodBarras":"","numLinhaDigTvl":"","nossoNumGerado":14100000000210445,"urlBoleto":"","qrCode":"00020101021226910014br.gov.bcb.pix2569pix-qrcode-h.caixa.gov.br/api/v2/cobv/CO011000002730141000000002104455204000053039865802BR592558 486 338CAIO E GUSTAVO 6009PARINTINS62070503***6304BD11","urlQrcode":"","codErro":904,"msgSistema":"SISTEMA INDISPONIVEL - ERRO NO INSERT DA TABELA GCBTB044"}[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:31:35,965[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Falha em integracao no fluxo /boletos/incluir[39m[38;5;203m: gov.caixa.microfpp.infra.exceptions.ExternalServiceException: Falha ao consumir a API de boleto. Status HTTP upstream: 400. Detalhe: {"codRetorno":2,"numCodBarras":"","numLinhaDigTvl":"","nossoNumGerado":14100000000210445,"urlBoleto":"","qrCode":"00020101021226910014br.gov.bcb.pix2569pix-qrcode-h.caixa.gov.br/api/v2/cobv/CO011000002730141000000002104455204000053039865802BR592558 486 338CAIO E GUSTAVO 6009PARINTINS62070503***6304BD11","urlQrcode":"","codErro":904,"msgSistema":"SISTEMA INDISPONIVEL - ERRO NO INSERT DA TABELA GCBTB044"}
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
[39m[38;5;145m2026-08-14 10:41:11,885[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:11,885[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPOST /boletos/incluir - Iniciando inclus?o de boleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:11,885[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:11,885[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 1/2: Solicitando token ao SSO (Keycloak)...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:11,885[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando obten??o de token SSO ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:11,885[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.TokenCacheService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mToken expirado no cache[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:11,885[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOTokenRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mSolicitando novo token ao Keycloak...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:11,936[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.TokenCacheService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mToken armazenado em cache - expira??o em: 2026-08-14T10:41:11.936384567[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:11,936[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Token obtido com sucesso do Keycloak[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:11,936[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? PASSO 1/2 CONCLU?DO[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:11,936[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 2/2: Chamando API de inclus?o de boleto...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:11,937[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mNumero Documento: 1416[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:11,937[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mValor: 3333.33[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:11,937[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mData Vencimento: 2026-08-30[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:11,937[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando chamada para gera??o de boleto (RestClient) ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:11,937[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Gerando Boleto ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:11,937[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mEndpoint: POST /cobranca/boletos/v1/incluiBoleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:11,937[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mHeaders: Authorization=[presente], apikey=[injetado automaticamente], Content-Type=[application/json][39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:11,937[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Numero Documento: 1416[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:11,937[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Valor: 3333.33[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:12,142[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Boleto gerado com sucesso[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:12,142[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mNumero Boleto: 14100000000210451[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:12,142[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mCodigo Barras: 10491155400003333330002739100100040002104515[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:12,142[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? PASSO 2/2 CONCLU?DO[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:12,143[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mhttps://10.116.82.66:8010/ecobranca/SIGCB/imprimir/0000273/14100000000210451[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:12,204[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:12,204[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Erro ao processar /boletos/incluir[39m[38;5;203m: java.io.IOException: Tunnel failed, got: 502
	at java.net.http/jdk.internal.net.http.HttpClientImpl.send(HttpClientImpl.java:964)
	at java.net.http/jdk.internal.net.http.HttpClientFacade.send(HttpClientFacade.java:133)
	at gov.caixa.microfpp.resources.BoletoResource.converteURLComoBase64(BoletoResource.java:153)
	at gov.caixa.microfpp.resources.BoletoResource.incluirBoleto(BoletoResource.java:95)
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
Caused by: java.io.IOException: Tunnel failed, got: 502
	at java.net.http/jdk.internal.net.http.PlainTunnelingConnection.lambda$connectAsync$2(PlainTunnelingConnection.java:96)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1150)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.postFire(CompletableFuture.java:614)
	at java.base/java.util.concurrent.CompletableFuture$UniApply.tryFire(CompletableFuture.java:653)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at java.net.http/jdk.internal.net.http.HttpClientImpl$DelegatingExecutor.execute(HttpClientImpl.java:177)
	at java.base/java.util.concurrent.CompletableFuture$UniCompletion.claim(CompletableFuture.java:572)
	at java.base/java.util.concurrent.CompletableFuture$UniApply.tryFire(CompletableFuture.java:642)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
	at java.net.http/jdk.internal.net.http.Http1Response$HeadersReader.handle(Http1Response.java:610)
	at java.net.http/jdk.internal.net.http.Http1Response$HeadersReader.handle(Http1Response.java:536)
	at java.net.http/jdk.internal.net.http.Http1Response$Receiver.accept(Http1Response.java:527)
	at java.net.http/jdk.internal.net.http.Http1Response$HeadersReader.tryAsyncReceive(Http1Response.java:583)
	at java.net.http/jdk.internal.net.http.Http1AsyncReceiver.flush(Http1AsyncReceiver.java:233)
	at java.net.http/jdk.internal.net.http.common.SequentialScheduler$LockingRestartableTask.run(SequentialScheduler.java:182)
	at java.net.http/jdk.internal.net.http.common.SequentialScheduler$CompleteRestartableTask.run(SequentialScheduler.java:149)
	at java.net.http/jdk.internal.net.http.common.SequentialScheduler$SchedulableTask.run(SequentialScheduler.java:207)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	... 1 more
[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:12,205[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:32,979[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:32,979[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPOST /boletos/incluir - Iniciando inclus?o de boleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:32,979[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:32,979[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 1/2: Solicitando token ao SSO (Keycloak)...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:32,980[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando obten??o de token SSO ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:32,980[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.TokenCacheService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mToken expirado no cache[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:32,980[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOTokenRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mSolicitando novo token ao Keycloak...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:33,028[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.TokenCacheService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mToken armazenado em cache - expira??o em: 2026-08-14T10:41:33.028899902[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:33,029[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Token obtido com sucesso do Keycloak[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:33,029[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? PASSO 1/2 CONCLU?DO[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:33,029[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 2/2: Chamando API de inclus?o de boleto...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:33,029[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mNumero Documento: 1416[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:33,029[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mValor: 3333.33[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:33,029[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mData Vencimento: 2026-08-30[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:33,029[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando chamada para gera??o de boleto (RestClient) ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:33,029[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Gerando Boleto ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:33,029[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mEndpoint: POST /cobranca/boletos/v1/incluiBoleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:33,029[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mHeaders: Authorization=[presente], apikey=[injetado automaticamente], Content-Type=[application/json][39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:33,029[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Numero Documento: 1416[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:33,029[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Valor: 3333.33[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:33,322[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Boleto gerado com sucesso[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:33,322[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mNumero Boleto: 14100000000206667[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:33,323[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mCodigo Barras: 10491155400003333330002739100100040002066672[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:33,323[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? PASSO 2/2 CONCLU?DO[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:33,323[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mhttps://10.116.82.66:8010/ecobranca/SIGCB/imprimir/0000273/14100000000206667[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:33,330[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:33,330[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Erro ao processar /boletos/incluir[39m[38;5;203m: java.io.IOException: Tunnel failed, got: 502
	at java.net.http/jdk.internal.net.http.HttpClientImpl.send(HttpClientImpl.java:964)
	at java.net.http/jdk.internal.net.http.HttpClientFacade.send(HttpClientFacade.java:133)
	at gov.caixa.microfpp.resources.BoletoResource.converteURLComoBase64(BoletoResource.java:153)
	at gov.caixa.microfpp.resources.BoletoResource.incluirBoleto(BoletoResource.java:95)
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
Caused by: java.io.IOException: Tunnel failed, got: 502
	at java.net.http/jdk.internal.net.http.PlainTunnelingConnection.lambda$connectAsync$2(PlainTunnelingConnection.java:96)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1150)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.postFire(CompletableFuture.java:614)
	at java.base/java.util.concurrent.CompletableFuture$UniApply.tryFire(CompletableFuture.java:653)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at java.net.http/jdk.internal.net.http.HttpClientImpl$DelegatingExecutor.execute(HttpClientImpl.java:177)
	at java.base/java.util.concurrent.CompletableFuture$UniCompletion.claim(CompletableFuture.java:572)
	at java.base/java.util.concurrent.CompletableFuture$UniApply.tryFire(CompletableFuture.java:642)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
	at java.net.http/jdk.internal.net.http.Http1Response$HeadersReader.handle(Http1Response.java:610)
	at java.net.http/jdk.internal.net.http.Http1Response$HeadersReader.handle(Http1Response.java:536)
	at java.net.http/jdk.internal.net.http.Http1Response$Receiver.accept(Http1Response.java:527)
	at java.net.http/jdk.internal.net.http.Http1Response$HeadersReader.tryAsyncReceive(Http1Response.java:583)
	at java.net.http/jdk.internal.net.http.Http1AsyncReceiver.flush(Http1AsyncReceiver.java:233)
	at java.net.http/jdk.internal.net.http.common.SequentialScheduler$LockingRestartableTask.run(SequentialScheduler.java:182)
	at java.net.http/jdk.internal.net.http.common.SequentialScheduler$CompleteRestartableTask.run(SequentialScheduler.java:149)
	at java.net.http/jdk.internal.net.http.common.SequentialScheduler$SchedulableTask.run(SequentialScheduler.java:207)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	... 1 more
[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:33,330[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,623[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,623[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPOST /boletos/incluir - Iniciando inclus?o de boleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,623[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,623[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 1/2: Solicitando token ao SSO (Keycloak)...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,623[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando obten??o de token SSO ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,623[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.TokenCacheService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mToken expirado no cache[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,623[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOTokenRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mSolicitando novo token ao Keycloak...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,663[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.TokenCacheService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mToken armazenado em cache - expira??o em: 2026-08-14T10:41:34.663265953[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,663[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Token obtido com sucesso do Keycloak[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,663[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? PASSO 1/2 CONCLU?DO[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,663[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 2/2: Chamando API de inclus?o de boleto...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,663[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mNumero Documento: 1416[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,663[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mValor: 3333.33[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,663[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mData Vencimento: 2026-08-30[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,663[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando chamada para gera??o de boleto (RestClient) ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,664[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Gerando Boleto ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,664[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mEndpoint: POST /cobranca/boletos/v1/incluiBoleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,664[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mHeaders: Authorization=[presente], apikey=[injetado automaticamente], Content-Type=[application/json][39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,664[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Numero Documento: 1416[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,664[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Valor: 3333.33[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,913[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Boleto gerado com sucesso[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,913[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mNumero Boleto: 14100000000206668[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,913[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mCodigo Barras: 10491155400003333330002739100100040002066680[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,913[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? PASSO 2/2 CONCLU?DO[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,913[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mhttps://10.116.82.66:8010/ecobranca/SIGCB/imprimir/0000273/14100000000206668[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,920[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,920[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Erro ao processar /boletos/incluir[39m[38;5;203m: java.io.IOException: Tunnel failed, got: 502
	at java.net.http/jdk.internal.net.http.HttpClientImpl.send(HttpClientImpl.java:964)
	at java.net.http/jdk.internal.net.http.HttpClientFacade.send(HttpClientFacade.java:133)
	at gov.caixa.microfpp.resources.BoletoResource.converteURLComoBase64(BoletoResource.java:153)
	at gov.caixa.microfpp.resources.BoletoResource.incluirBoleto(BoletoResource.java:95)
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
Caused by: java.io.IOException: Tunnel failed, got: 502
	at java.net.http/jdk.internal.net.http.PlainTunnelingConnection.lambda$connectAsync$2(PlainTunnelingConnection.java:96)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1150)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.postFire(CompletableFuture.java:614)
	at java.base/java.util.concurrent.CompletableFuture$UniApply.tryFire(CompletableFuture.java:653)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at java.net.http/jdk.internal.net.http.HttpClientImpl$DelegatingExecutor.execute(HttpClientImpl.java:177)
	at java.base/java.util.concurrent.CompletableFuture$UniCompletion.claim(CompletableFuture.java:572)
	at java.base/java.util.concurrent.CompletableFuture$UniApply.tryFire(CompletableFuture.java:642)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
	at java.net.http/jdk.internal.net.http.Http1Response$HeadersReader.handle(Http1Response.java:610)
	at java.net.http/jdk.internal.net.http.Http1Response$HeadersReader.handle(Http1Response.java:536)
	at java.net.http/jdk.internal.net.http.Http1Response$Receiver.accept(Http1Response.java:527)
	at java.net.http/jdk.internal.net.http.Http1Response$HeadersReader.tryAsyncReceive(Http1Response.java:583)
	at java.net.http/jdk.internal.net.http.Http1AsyncReceiver.flush(Http1AsyncReceiver.java:233)
	at java.net.http/jdk.internal.net.http.common.SequentialScheduler$LockingRestartableTask.run(SequentialScheduler.java:182)
	at java.net.http/jdk.internal.net.http.common.SequentialScheduler$CompleteRestartableTask.run(SequentialScheduler.java:149)
	at java.net.http/jdk.internal.net.http.common.SequentialScheduler$SchedulableTask.run(SequentialScheduler.java:207)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	... 1 more
[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:34,920[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:49,585[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:49,585[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPOST /boletos/incluir - Iniciando inclus?o de boleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:49,585[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:49,585[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 1/2: Solicitando token ao SSO (Keycloak)...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:49,585[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando obten??o de token SSO ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:49,586[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.TokenCacheService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mToken expirado no cache[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:49,586[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOTokenRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mSolicitando novo token ao Keycloak...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:49,632[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.TokenCacheService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mToken armazenado em cache - expira??o em: 2026-08-14T10:41:49.632077849[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:49,632[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Token obtido com sucesso do Keycloak[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:49,632[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? PASSO 1/2 CONCLU?DO[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:49,632[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 2/2: Chamando API de inclus?o de boleto...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:49,632[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mNumero Documento: 66237[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:49,632[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mValor: 929.5[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:49,632[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mData Vencimento: 2026-08-14[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:49,632[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando chamada para gera??o de boleto (RestClient) ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:49,632[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Gerando Boleto ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:49,632[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mEndpoint: POST /cobranca/boletos/v1/incluiBoleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:49,632[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mHeaders: Authorization=[presente], apikey=[injetado automaticamente], Content-Type=[application/json][39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:49,632[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Numero Documento: 66237[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:49,632[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Valor: 929.5[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,001[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Boleto gerado com sucesso[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,001[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mNumero Boleto: 14100000000206669[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,001[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mCodigo Barras: 10498153800000929500002739100100040002066699[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,001[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? PASSO 2/2 CONCLU?DO[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,001[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mhttps://10.116.82.66:8010/ecobranca/SIGCB/imprimir/0000273/14100000000206669[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,011[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,011[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Erro ao processar /boletos/incluir[39m[38;5;203m: java.io.IOException: Tunnel failed, got: 502
	at java.net.http/jdk.internal.net.http.HttpClientImpl.send(HttpClientImpl.java:964)
	at java.net.http/jdk.internal.net.http.HttpClientFacade.send(HttpClientFacade.java:133)
	at gov.caixa.microfpp.resources.BoletoResource.converteURLComoBase64(BoletoResource.java:153)
	at gov.caixa.microfpp.resources.BoletoResource.incluirBoleto(BoletoResource.java:95)
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
Caused by: java.io.IOException: Tunnel failed, got: 502
	at java.net.http/jdk.internal.net.http.PlainTunnelingConnection.lambda$connectAsync$2(PlainTunnelingConnection.java:96)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1150)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.postFire(CompletableFuture.java:614)
	at java.base/java.util.concurrent.CompletableFuture$UniApply.tryFire(CompletableFuture.java:653)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at java.net.http/jdk.internal.net.http.HttpClientImpl$DelegatingExecutor.execute(HttpClientImpl.java:177)
	at java.base/java.util.concurrent.CompletableFuture$UniCompletion.claim(CompletableFuture.java:572)
	at java.base/java.util.concurrent.CompletableFuture$UniApply.tryFire(CompletableFuture.java:642)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
	at java.net.http/jdk.internal.net.http.Http1Response$HeadersReader.handle(Http1Response.java:610)
	at java.net.http/jdk.internal.net.http.Http1Response$HeadersReader.handle(Http1Response.java:536)
	at java.net.http/jdk.internal.net.http.Http1Response$Receiver.accept(Http1Response.java:527)
	at java.net.http/jdk.internal.net.http.Http1Response$HeadersReader.tryAsyncReceive(Http1Response.java:583)
	at java.net.http/jdk.internal.net.http.Http1AsyncReceiver.flush(Http1AsyncReceiver.java:233)
	at java.net.http/jdk.internal.net.http.common.SequentialScheduler$LockingRestartableTask.run(SequentialScheduler.java:182)
	at java.net.http/jdk.internal.net.http.common.SequentialScheduler$CompleteRestartableTask.run(SequentialScheduler.java:149)
	at java.net.http/jdk.internal.net.http.common.SequentialScheduler$SchedulableTask.run(SequentialScheduler.java:207)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	... 1 more
[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,011[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,095[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,095[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPOST /boletos/incluir - Iniciando inclus?o de boleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,095[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,095[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 1/2: Solicitando token ao SSO (Keycloak)...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,095[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando obten??o de token SSO ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,095[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.TokenCacheService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mToken expirado no cache[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,095[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOTokenRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mSolicitando novo token ao Keycloak...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,133[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.TokenCacheService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mToken armazenado em cache - expira??o em: 2026-08-14T10:41:50.133805094[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,134[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Token obtido com sucesso do Keycloak[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,134[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? PASSO 1/2 CONCLU?DO[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,134[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 2/2: Chamando API de inclus?o de boleto...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,134[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mNumero Documento: 66237[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,134[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mValor: 929.5[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,134[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mData Vencimento: 2026-08-14[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,134[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando chamada para gera??o de boleto (RestClient) ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,134[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Gerando Boleto ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,134[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mEndpoint: POST /cobranca/boletos/v1/incluiBoleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,134[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mHeaders: Authorization=[presente], apikey=[injetado automaticamente], Content-Type=[application/json][39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,134[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Numero Documento: 66237[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,134[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Valor: 929.5[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,287[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Boleto gerado com sucesso[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,288[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mNumero Boleto: 14100000000206670[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,288[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mCodigo Barras: 10491153800000929500002739100100040002066702[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,288[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? PASSO 2/2 CONCLU?DO[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,288[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mhttps://10.116.82.66:8010/ecobranca/SIGCB/imprimir/0000273/14100000000206670[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,295[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,295[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Erro ao processar /boletos/incluir[39m[38;5;203m: java.io.IOException: Tunnel failed, got: 502
	at java.net.http/jdk.internal.net.http.HttpClientImpl.send(HttpClientImpl.java:964)
	at java.net.http/jdk.internal.net.http.HttpClientFacade.send(HttpClientFacade.java:133)
	at gov.caixa.microfpp.resources.BoletoResource.converteURLComoBase64(BoletoResource.java:153)
	at gov.caixa.microfpp.resources.BoletoResource.incluirBoleto(BoletoResource.java:95)
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
Caused by: java.io.IOException: Tunnel failed, got: 502
	at java.net.http/jdk.internal.net.http.PlainTunnelingConnection.lambda$connectAsync$2(PlainTunnelingConnection.java:96)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1150)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.postFire(CompletableFuture.java:614)
	at java.base/java.util.concurrent.CompletableFuture$UniApply.tryFire(CompletableFuture.java:653)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at java.net.http/jdk.internal.net.http.HttpClientImpl$DelegatingExecutor.execute(HttpClientImpl.java:177)
	at java.base/java.util.concurrent.CompletableFuture$UniCompletion.claim(CompletableFuture.java:572)
	at java.base/java.util.concurrent.CompletableFuture$UniApply.tryFire(CompletableFuture.java:642)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
	at java.net.http/jdk.internal.net.http.Http1Response$HeadersReader.handle(Http1Response.java:610)
	at java.net.http/jdk.internal.net.http.Http1Response$HeadersReader.handle(Http1Response.java:536)
	at java.net.http/jdk.internal.net.http.Http1Response$Receiver.accept(Http1Response.java:527)
	at java.net.http/jdk.internal.net.http.Http1Response$HeadersReader.tryAsyncReceive(Http1Response.java:583)
	at java.net.http/jdk.internal.net.http.Http1AsyncReceiver.flush(Http1AsyncReceiver.java:233)
	at java.net.http/jdk.internal.net.http.common.SequentialScheduler$LockingRestartableTask.run(SequentialScheduler.java:182)
	at java.net.http/jdk.internal.net.http.common.SequentialScheduler$CompleteRestartableTask.run(SequentialScheduler.java:149)
	at java.net.http/jdk.internal.net.http.common.SequentialScheduler$SchedulableTask.run(SequentialScheduler.java:207)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	... 1 more
[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:41:50,295[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:23,639[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:23,639[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPOST /boletos/incluir - Iniciando inclus?o de boleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:23,639[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:23,639[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 1/2: Solicitando token ao SSO (Keycloak)...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:23,639[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando obten??o de token SSO ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:23,639[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.TokenCacheService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mToken expirado no cache[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:23,639[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOTokenRetryService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mSolicitando novo token ao Keycloak...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:23,692[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.TokenCacheService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mToken armazenado em cache - expira??o em: 2026-08-14T10:47:23.692250573[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:23,692[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.api.SSOService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Token obtido com sucesso do Keycloak[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:23,692[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? PASSO 1/2 CONCLU?DO[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:23,692[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mPASSO 2/2: Chamando API de inclus?o de boleto...[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:23,692[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mNumero Documento: 1416[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:23,692[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mValor: 3333.33[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:23,692[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mData Vencimento: 2026-08-30[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:23,692[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Iniciando chamada para gera??o de boleto (RestClient) ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:23,692[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m=== Gerando Boleto ===[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:23,692[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mEndpoint: POST /cobranca/boletos/v1/incluiBoleto[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:23,692[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mHeaders: Authorization=[presente], apikey=[injetado automaticamente], Content-Type=[application/json][39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:23,692[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Numero Documento: 1416[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:23,692[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mRequest body - Valor: 3333.33[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:24,027[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Boleto gerado com sucesso[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:24,028[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mNumero Boleto: 14100000000210457[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:24,028[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.ser.IncluirBoletoService[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mCodigo Barras: 10496155400003333330002739100100040002104574[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:24,028[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? PASSO 2/2 CONCLU?DO[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:24,028[39m[38;5;188m [39m[38;5;107mINFO [39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151mhttps://10.116.82.66:8010/ecobranca/SIGCB/imprimir/0000273/14100000000210457[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:24,037[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:24,037[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m? Erro ao processar /boletos/incluir[39m[38;5;203m: java.io.IOException: Tunnel failed, got: 502
	at java.net.http/jdk.internal.net.http.HttpClientImpl.send(HttpClientImpl.java:964)
	at java.net.http/jdk.internal.net.http.HttpClientFacade.send(HttpClientFacade.java:133)
	at gov.caixa.microfpp.resources.BoletoResource.converteURLComoBase64(BoletoResource.java:153)
	at gov.caixa.microfpp.resources.BoletoResource.incluirBoleto(BoletoResource.java:95)
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
Caused by: java.io.IOException: Tunnel failed, got: 502
	at java.net.http/jdk.internal.net.http.PlainTunnelingConnection.lambda$connectAsync$2(PlainTunnelingConnection.java:96)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1150)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.postFire(CompletableFuture.java:614)
	at java.base/java.util.concurrent.CompletableFuture$UniApply.tryFire(CompletableFuture.java:653)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at java.net.http/jdk.internal.net.http.HttpClientImpl$DelegatingExecutor.execute(HttpClientImpl.java:177)
	at java.base/java.util.concurrent.CompletableFuture$UniCompletion.claim(CompletableFuture.java:572)
	at java.base/java.util.concurrent.CompletableFuture$UniApply.tryFire(CompletableFuture.java:642)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
	at java.net.http/jdk.internal.net.http.Http1Response$HeadersReader.handle(Http1Response.java:610)
	at java.net.http/jdk.internal.net.http.Http1Response$HeadersReader.handle(Http1Response.java:536)
	at java.net.http/jdk.internal.net.http.Http1Response$Receiver.accept(Http1Response.java:527)
	at java.net.http/jdk.internal.net.http.Http1Response$HeadersReader.tryAsyncReceive(Http1Response.java:583)
	at java.net.http/jdk.internal.net.http.Http1AsyncReceiver.flush(Http1AsyncReceiver.java:233)
	at java.net.http/jdk.internal.net.http.common.SequentialScheduler$LockingRestartableTask.run(SequentialScheduler.java:182)
	at java.net.http/jdk.internal.net.http.common.SequentialScheduler$CompleteRestartableTask.run(SequentialScheduler.java:149)
	at java.net.http/jdk.internal.net.http.common.SequentialScheduler$SchedulableTask.run(SequentialScheduler.java:207)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	... 1 more
[39m[38;5;227m
[39m[38;5;145m2026-08-14 10:47:24,038[39m[38;5;188m [39m[38;5;203mERROR[39m[38;5;188m [[39m[38;5;69mgov.cai.mic.res.BoletoResource[39m[38;5;188m] ([39m[38;5;71mexecutor-thread-1[39m[38;5;188m) [39m[38;5;151m========================================[39m[38;5;203m[39m[38;5;227m
[39m
