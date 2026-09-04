
Qual o tipo de serviço?*:	Ajustar ambiente ou parametrização de software
Informar o Ambiente:*:	DES
Nome do serviço ou sistema:*:	Sistema: SICVR
Janela de atendimento:*:	03/09/2026 18:52:00
Prazo final da janela de atendimento:*:	03/09/2026 12:00:00
Haverá previsão de indisponibilidade durante a execução do serviço:*:	Não
Contato do responsável pela validação do ambiente após alteração:*:	Entrar em contato via teams com: C159783
Descrição da solicitação:*:	Solicito apoio para verificar se o namespace onde roda o pod tem regra de firewall liberada para sta-h.bcb.gov.br, sta.bcb.gov.br e www9.bcb.gov.br?

As URLS acima são do BACEN, e são necessárias liberação para transmissão de informações conforme resoluções normativas do Banco Central.

OKD4: https://console-openshift-console.apps.nprd.caixa/k8s/ns/sicvr-des/deploymentconfigs/sicvr-api-integracoes-des

É necessário configuração de proxy? Se sim, qual utilizar para DES e PRD?
Informar formas de contato:*:	Caso haja dúvidas, entrar em contato via teams com: C159783



exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/sicvr-api-integracoes.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-09-03 18:39:00,443 WARN  [org.hibernate.orm.jdbc] (JPA Startup Thread) HHH100123: Low default JDBC fetch size: 10 (consider setting 'hibernate.jdbc.fetch_size')
2026-09-03 18:39:02,057 INFO  [io.quarkus] (main) sicvr-api-integracoes 1.0.0-SNAPSHOT on JVM (powered by Quarkus 3.36.2) started in 5.793s. Listening on: http://0.0.0.0:8080
2026-09-03 18:39:02,057 INFO  [io.quarkus] (main) Profile prod activated. 
2026-09-03 18:39:02,057 INFO  [io.quarkus] (main) Installed features: [agroal, cdi, hibernate-orm, hibernate-orm-panache, jdbc-h2, jdbc-oracle, narayana-jta, oidc, rest, rest-client, rest-client-jackson, rest-jackson, security, smallrye-context-propagation, smallrye-health, vertx]
2026-09-03 18:41:15,080 ERROR [br.gov.caixa.sicvr.application.service.BaixarCadoc9810Service] (executor-thread-9) Falha no download do CADOC 9810 (execucao 24): br.gov.caixa.sicvr.domain.exception.TransmissaoStaException: Rotina CVR_BAIXAR_CADOC_9810 ja esta em execucao (bloqueio ativo desde 2026-09-03T18:40:38).
	at br.gov.caixa.sicvr.infrastructure.persistence.adapter.LockRotinaStaPortAdapter.obterLock(LockRotinaStaPortAdapter.java:43)
	at br.gov.caixa.sicvr.infrastructure.persistence.adapter.LockRotinaStaPortAdapter_Subclass.obterLock$$superforward(Unknown Source)
	at br.gov.caixa.sicvr.infrastructure.persistence.adapter.LockRotinaStaPortAdapter_Subclass$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:166)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:137)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:37)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:81)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:31)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sicvr.infrastructure.persistence.adapter.LockRotinaStaPortAdapter_Subclass.obterLock(Unknown Source)
	at br.gov.caixa.sicvr.infrastructure.persistence.adapter.LockRotinaStaPortAdapter_ClientProxy.obterLock(Unknown Source)
	at br.gov.caixa.sicvr.application.service.BaixarCadoc9810Service.baixar(BaixarCadoc9810Service.java:99)
	at br.gov.caixa.sicvr.application.service.BaixarCadoc9810Service_ClientProxy.baixar(Unknown Source)
	at br.gov.caixa.sicvr.api.resource.Cadoc9810Resource.baixar(Cadoc9810Resource.java:31)
	at br.gov.caixa.sicvr.api.resource.Cadoc9810Resource$quarkusrestinvoker$baixar_201130a38b06aeb8b5e63a8b5347f92edb952024.invoke(Unknown Source)
	at org.jboss.resteasy.reactive.server.handlers.InvocationHandler.handle(InvocationHandler.java:29)
	at io.quarkus.resteasy.reactive.server.runtime.QuarkusResteasyReactiveRequestContext.invokeHandler(QuarkusResteasyReactiveRequestContext.java:190)
	at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.run(AbstractResteasyReactiveContext.java:147)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$15.runWith(VertxCoreRecorder.java:695)
	at org.jboss.threads.EnhancedQueueExecutor$Task.doRunWith(EnhancedQueueExecutor.java:2651)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2630)
	at org.jboss.threads.EnhancedQueueExecutor.runThreadBody(EnhancedQueueExecutor.java:1622)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1589)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:11)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:11)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)

2026-09-03 18:41:40,233 ERROR [br.gov.caixa.sicvr.application.service.BaixarCadoc9810Service] (executor-thread-10) Falha no download do CADOC 9810 (execucao 23): br.gov.caixa.sicvr.domain.exception.FalhaIntegracaoStaException: Erro de comunicacao com o STA BACEN.
	at br.gov.caixa.sicvr.infrastructure.bacen.client.StaBacenHttpClient.enviar(StaBacenHttpClient.java:264)
	at br.gov.caixa.sicvr.infrastructure.bacen.client.StaBacenHttpClient.consultarArquivosDisponiveis(StaBacenHttpClient.java:172)
	at br.gov.caixa.sicvr.infrastructure.bacen.client.StaBacenHttpClient_ClientProxy.consultarArquivosDisponiveis(Unknown Source)
	at br.gov.caixa.sicvr.infrastructure.bacen.adapter.StaBacenPortAdapter.consultarArquivosDisponiveis(StaBacenPortAdapter.java:104)
	at br.gov.caixa.sicvr.infrastructure.bacen.adapter.StaBacenPortAdapter_ClientProxy.consultarArquivosDisponiveis(Unknown Source)
	at br.gov.caixa.sicvr.application.service.BaixarCadoc9810Service.baixar(BaixarCadoc9810Service.java:121)
	at br.gov.caixa.sicvr.application.service.BaixarCadoc9810Service_ClientProxy.baixar(Unknown Source)
	at br.gov.caixa.sicvr.api.resource.Cadoc9810Resource.baixar(Cadoc9810Resource.java:31)
	at br.gov.caixa.sicvr.api.resource.Cadoc9810Resource$quarkusrestinvoker$baixar_201130a38b06aeb8b5e63a8b5347f92edb952024.invoke(Unknown Source)
	at org.jboss.resteasy.reactive.server.handlers.InvocationHandler.handle(InvocationHandler.java:29)
	at io.quarkus.resteasy.reactive.server.runtime.QuarkusResteasyReactiveRequestContext.invokeHandler(QuarkusResteasyReactiveRequestContext.java:190)
	at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.run(AbstractResteasyReactiveContext.java:147)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$15.runWith(VertxCoreRecorder.java:695)
	at org.jboss.threads.EnhancedQueueExecutor$Task.doRunWith(EnhancedQueueExecutor.java:2651)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2630)
	at org.jboss.threads.EnhancedQueueExecutor.runThreadBody(EnhancedQueueExecutor.java:1622)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1589)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:11)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:11)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: java.net.http.HttpConnectTimeoutException: HTTP connect timed out
	at java.net.http/jdk.internal.net.http.HttpClientImpl.send(HttpClientImpl.java:945)
	at java.net.http/jdk.internal.net.http.HttpClientFacade.send(HttpClientFacade.java:133)
	at br.gov.caixa.sicvr.infrastructure.bacen.client.StaBacenHttpClient.enviar(StaBacenHttpClient.java:259)
	... 20 more
Caused by: java.net.http.HttpConnectTimeoutException: HTTP connect timed out
	at java.net.http/jdk.internal.net.http.ResponseTimerEvent.handle(ResponseTimerEvent.java:68)
	at java.net.http/jdk.internal.net.http.HttpClientImpl.purgeTimeoutsAndReturnNextDeadline(HttpClientImpl.java:1778)
	at java.net.http/jdk.internal.net.http.HttpClientImpl$SelectorManager.run(HttpClientImpl.java:1376)
Caused by: java.net.ConnectException: HTTP connect timed out
	at java.net.http/jdk.internal.net.http.ResponseTimerEvent.handle(ResponseTimerEvent.java:69)
	... 2 more

2026-09-03 18:42:43,503 ERROR [br.gov.caixa.sicvr.application.service.BaixarCadoc9810Service] (executor-thread-10) Falha no download do CADOC 9810 (execucao 25): br.gov.caixa.sicvr.domain.exception.FalhaIntegracaoStaException: Erro de comunicacao com o STA BACEN.
	at br.gov.caixa.sicvr.infrastructure.bacen.client.StaBacenHttpClient.enviar(StaBacenHttpClient.java:264)
	at br.gov.caixa.sicvr.infrastructure.bacen.client.StaBacenHttpClient.consultarArquivosDisponiveis(StaBacenHttpClient.java:172)
	at br.gov.caixa.sicvr.infrastructure.bacen.client.StaBacenHttpClient_ClientProxy.consultarArquivosDisponiveis(Unknown Source)
	at br.gov.caixa.sicvr.infrastructure.bacen.adapter.StaBacenPortAdapter.consultarArquivosDisponiveis(StaBacenPortAdapter.java:104)
	at br.gov.caixa.sicvr.infrastructure.bacen.adapter.StaBacenPortAdapter_ClientProxy.consultarArquivosDisponiveis(Unknown Source)
	at br.gov.caixa.sicvr.application.service.BaixarCadoc9810Service.baixar(BaixarCadoc9810Service.java:121)
	at br.gov.caixa.sicvr.application.service.BaixarCadoc9810Service_ClientProxy.baixar(Unknown Source)
	at br.gov.caixa.sicvr.api.resource.Cadoc9810Resource.baixar(Cadoc9810Resource.java:31)
	at br.gov.caixa.sicvr.api.resource.Cadoc9810Resource$quarkusrestinvoker$baixar_201130a38b06aeb8b5e63a8b5347f92edb952024.invoke(Unknown Source)
	at org.jboss.resteasy.reactive.server.handlers.InvocationHandler.handle(InvocationHandler.java:29)
	at io.quarkus.resteasy.reactive.server.runtime.QuarkusResteasyReactiveRequestContext.invokeHandler(QuarkusResteasyReactiveRequestContext.java:190)
	at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.run(AbstractResteasyReactiveContext.java:147)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$15.runWith(VertxCoreRecorder.java:695)
	at org.jboss.threads.EnhancedQueueExecutor$Task.doRunWith(EnhancedQueueExecutor.java:2651)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2630)
	at org.jboss.threads.EnhancedQueueExecutor.runThreadBody(EnhancedQueueExecutor.java:1622)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1589)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:11)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:11)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: java.net.http.HttpConnectTimeoutException: HTTP connect timed out
	at java.net.http/jdk.internal.net.http.HttpClientImpl.send(HttpClientImpl.java:945)
	at java.net.http/jdk.internal.net.http.HttpClientFacade.send(HttpClientFacade.java:133)
	at br.gov.caixa.sicvr.infrastructure.bacen.client.StaBacenHttpClient.enviar(StaBacenHttpClient.java:259)
	... 20 more
Caused by: java.net.http.HttpConnectTimeoutException: HTTP connect timed out
	at java.net.http/jdk.internal.net.http.ResponseTimerEvent.handle(ResponseTimerEvent.java:68)
	at java.net.http/jdk.internal.net.http.HttpClientImpl.purgeTimeoutsAndReturnNextDeadline(HttpClientImpl.java:1778)
	at java.net.http/jdk.internal.net.http.HttpClientImpl$SelectorManager.run(HttpClientImpl.java:1376)
Caused by: java.net.ConnectException: HTTP connect timed out
	at java.net.http/jdk.internal.net.http.ResponseTimerEvent.handle(ResponseTimerEvent.java:69)
	... 2 more

2026-09-03 18:43:50,937 ERROR [br.gov.caixa.sicvr.application.service.BaixarCadoc9810Service] (executor-thread-10) Falha no download do CADOC 9810 (execucao 26): br.gov.caixa.sicvr.domain.exception.FalhaIntegracaoStaException: Erro de comunicacao com o STA BACEN.
	at br.gov.caixa.sicvr.infrastructure.bacen.client.StaBacenHttpClient.enviar(StaBacenHttpClient.java:264)
	at br.gov.caixa.sicvr.infrastructure.bacen.client.StaBacenHttpClient.consultarArquivosDisponiveis(StaBacenHttpClient.java:172)
	at br.gov.caixa.sicvr.infrastructure.bacen.client.StaBacenHttpClient_ClientProxy.consultarArquivosDisponiveis(Unknown Source)
	at br.gov.caixa.sicvr.infrastructure.bacen.adapter.StaBacenPortAdapter.consultarArquivosDisponiveis(StaBacenPortAdapter.java:104)
	at br.gov.caixa.sicvr.infrastructure.bacen.adapter.StaBacenPortAdapter_ClientProxy.consultarArquivosDisponiveis(Unknown Source)
	at br.gov.caixa.sicvr.application.service.BaixarCadoc9810Service.baixar(BaixarCadoc9810Service.java:121)
	at br.gov.caixa.sicvr.application.service.BaixarCadoc9810Service_ClientProxy.baixar(Unknown Source)
	at br.gov.caixa.sicvr.api.resource.Cadoc9810Resource.baixar(Cadoc9810Resource.java:31)
	at br.gov.caixa.sicvr.api.resource.Cadoc9810Resource$quarkusrestinvoker$baixar_201130a38b06aeb8b5e63a8b5347f92edb952024.invoke(Unknown Source)
	at org.jboss.resteasy.reactive.server.handlers.InvocationHandler.handle(InvocationHandler.java:29)
	at io.quarkus.resteasy.reactive.server.runtime.QuarkusResteasyReactiveRequestContext.invokeHandler(QuarkusResteasyReactiveRequestContext.java:190)
	at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.run(AbstractResteasyReactiveContext.java:147)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$15.runWith(VertxCoreRecorder.java:695)
	at org.jboss.threads.EnhancedQueueExecutor$Task.doRunWith(EnhancedQueueExecutor.java:2651)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2630)
	at org.jboss.threads.EnhancedQueueExecutor.runThreadBody(EnhancedQueueExecutor.java:1622)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1589)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:11)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:11)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: java.net.http.HttpConnectTimeoutException: HTTP connect timed out
	at java.net.http/jdk.internal.net.http.HttpClientImpl.send(HttpClientImpl.java:945)
	at java.net.http/jdk.internal.net.http.HttpClientFacade.send(HttpClientFacade.java:133)
	at br.gov.caixa.sicvr.infrastructure.bacen.client.StaBacenHttpClient.enviar(StaBacenHttpClient.java:259)
	... 20 more
Caused by: java.net.http.HttpConnectTimeoutException: HTTP connect timed out
	at java.net.http/jdk.internal.net.http.ResponseTimerEvent.handle(ResponseTimerEvent.java:68)
	at java.net.http/jdk.internal.net.http.HttpClientImpl.purgeTimeoutsAndReturnNextDeadline(HttpClientImpl.java:1778)
	at java.net.http/jdk.internal.net.http.HttpClientImpl$SelectorManager.run(HttpClientImpl.java:1376)
Caused by: java.net.ConnectException: HTTP connect timed out
	at java.net.http/jdk.internal.net.http.ResponseTimerEvent.handle(ResponseTimerEvent.java:69)
	... 2 more

2026-09-03 18:45:09,281 ERROR [br.gov.caixa.sicvr.application.service.TransmitirArquivoStaService] (executor-thread-10) Falha ao transmitir arquivo exportado 30537 ao STA BACEN: br.gov.caixa.sicvr.domain.exception.FalhaIntegracaoStaException: Erro de comunicacao com o STA BACEN.
	at br.gov.caixa.sicvr.infrastructure.bacen.client.StaBacenHttpClient.enviar(StaBacenHttpClient.java:264)
	at br.gov.caixa.sicvr.infrastructure.bacen.client.StaBacenHttpClient.requisitarProtocolo(StaBacenHttpClient.java:82)
	at br.gov.caixa.sicvr.infrastructure.bacen.client.StaBacenHttpClient_ClientProxy.requisitarProtocolo(Unknown Source)
	at br.gov.caixa.sicvr.infrastructure.bacen.adapter.StaBacenPortAdapter.transmitirArquivo(StaBacenPortAdapter.java:55)
	at br.gov.caixa.sicvr.infrastructure.bacen.adapter.StaBacenPortAdapter_ClientProxy.transmitirArquivo(Unknown Source)
	at br.gov.caixa.sicvr.application.service.TransmitirArquivoStaService.transmitirArquivo(TransmitirArquivoStaService.java:160)
	at br.gov.caixa.sicvr.application.service.TransmitirArquivoStaService.processarArquivos(TransmitirArquivoStaService.java:126)
	at br.gov.caixa.sicvr.application.service.TransmitirArquivoStaService.transmitir(TransmitirArquivoStaService.java:79)
	at br.gov.caixa.sicvr.application.service.TransmitirArquivoStaService_ClientProxy.transmitir(Unknown Source)
	at br.gov.caixa.sicvr.api.resource.StaResource.transmitir(StaResource.java:149)
	at br.gov.caixa.sicvr.api.resource.StaResource.transmitir9800(StaResource.java:49)
	at br.gov.caixa.sicvr.api.resource.StaResource$quarkusrestinvoker$transmitir9800_94aefc8a1b99815e314bda0258255012a6940d5d.invoke(Unknown Source)
	at org.jboss.resteasy.reactive.server.handlers.InvocationHandler.handle(InvocationHandler.java:29)
	at io.quarkus.resteasy.reactive.server.runtime.QuarkusResteasyReactiveRequestContext.invokeHandler(QuarkusResteasyReactiveRequestContext.java:190)
	at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.run(AbstractResteasyReactiveContext.java:147)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$15.runWith(VertxCoreRecorder.java:695)
	at org.jboss.threads.EnhancedQueueExecutor$Task.doRunWith(EnhancedQueueExecutor.java:2651)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2630)
	at org.jboss.threads.EnhancedQueueExecutor.runThreadBody(EnhancedQueueExecutor.java:1622)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1589)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:11)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:11)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: java.net.http.HttpConnectTimeoutException: HTTP connect timed out
	at java.net.http/jdk.internal.net.http.HttpClientImpl.send(HttpClientImpl.java:945)
	at java.net.http/jdk.internal.net.http.HttpClientFacade.send(HttpClientFacade.java:133)
	at br.gov.caixa.sicvr.infrastructure.bacen.client.StaBacenHttpClient.enviar(StaBacenHttpClient.java:259)
	... 23 more
Caused by: java.net.http.HttpConnectTimeoutException: HTTP connect timed out
	at java.net.http/jdk.internal.net.http.ResponseTimerEvent.handle(ResponseTimerEvent.java:68)
	at java.net.http/jdk.internal.net.http.HttpClientImpl.purgeTimeoutsAndReturnNextDeadline(HttpClientImpl.java:1778)
	at java.net.http/jdk.internal.net.http.HttpClientImpl$SelectorManager.run(HttpClientImpl.java:1376)
Caused by: java.net.ConnectException: HTTP connect timed out
	at java.net.http/jdk.internal.net.http.ResponseTimerEvent.handle(ResponseTimerEvent.java:69)
	... 2 more

2026-09-03 18:46:50,909 ERROR [br.gov.caixa.sicvr.application.service.TransmitirArquivoStaService] (executor-thread-10) Falha ao transmitir arquivo exportado 30537 ao STA BACEN: br.gov.caixa.sicvr.domain.exception.FalhaIntegracaoStaException: Erro de comunicacao com o STA BACEN.
	at br.gov.caixa.sicvr.infrastructure.bacen.client.StaBacenHttpClient.enviar(StaBacenHttpClient.java:264)
	at br.gov.caixa.sicvr.infrastructure.bacen.client.StaBacenHttpClient.requisitarProtocolo(StaBacenHttpClient.java:82)
	at br.gov.caixa.sicvr.infrastructure.bacen.client.StaBacenHttpClient_ClientProxy.requisitarProtocolo(Unknown Source)
	at br.gov.caixa.sicvr.infrastructure.bacen.adapter.StaBacenPortAdapter.transmitirArquivo(StaBacenPortAdapter.java:55)
	at br.gov.caixa.sicvr.infrastructure.bacen.adapter.StaBacenPortAdapter_ClientProxy.transmitirArquivo(Unknown Source)
	at br.gov.caixa.sicvr.application.service.TransmitirArquivoStaService.transmitirArquivo(TransmitirArquivoStaService.java:160)
	at br.gov.caixa.sicvr.application.service.TransmitirArquivoStaService.processarArquivos(TransmitirArquivoStaService.java:126)
	at br.gov.caixa.sicvr.application.service.TransmitirArquivoStaService.transmitir(TransmitirArquivoStaService.java:79)
	at br.gov.caixa.sicvr.application.service.TransmitirArquivoStaService_ClientProxy.transmitir(Unknown Source)
	at br.gov.caixa.sicvr.api.resource.StaResource.transmitir(StaResource.java:149)
	at br.gov.caixa.sicvr.api.resource.StaResource.transmitir9800(StaResource.java:49)
	at br.gov.caixa.sicvr.api.resource.StaResource$quarkusrestinvoker$transmitir9800_94aefc8a1b99815e314bda0258255012a6940d5d.invoke(Unknown Source)
	at org.jboss.resteasy.reactive.server.handlers.InvocationHandler.handle(InvocationHandler.java:29)
	at io.quarkus.resteasy.reactive.server.runtime.QuarkusResteasyReactiveRequestContext.invokeHandler(QuarkusResteasyReactiveRequestContext.java:190)
	at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.run(AbstractResteasyReactiveContext.java:147)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$15.runWith(VertxCoreRecorder.java:695)
	at org.jboss.threads.EnhancedQueueExecutor$Task.doRunWith(EnhancedQueueExecutor.java:2651)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2630)
	at org.jboss.threads.EnhancedQueueExecutor.runThreadBody(EnhancedQueueExecutor.java:1622)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1589)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:11)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:11)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: java.net.http.HttpConnectTimeoutException: HTTP connect timed out
	at java.net.http/jdk.internal.net.http.HttpClientImpl.send(HttpClientImpl.java:945)
	at java.net.http/jdk.internal.net.http.HttpClientFacade.send(HttpClientFacade.java:133)
	at br.gov.caixa.sicvr.infrastructure.bacen.client.StaBacenHttpClient.enviar(StaBacenHttpClient.java:259)
	... 23 more
Caused by: java.net.http.HttpConnectTimeoutException: HTTP connect timed out
	at java.net.http/jdk.internal.net.http.ResponseTimerEvent.handle(ResponseTimerEvent.java:68)
	at java.net.http/jdk.internal.net.http.HttpClientImpl.purgeTimeoutsAndReturnNextDeadline(HttpClientImpl.java:1778)
	at java.net.http/jdk.internal.net.http.HttpClientImpl$SelectorManager.run(HttpClientImpl.java:1376)
Caused by: java.net.ConnectException: HTTP connect timed out
	at java.net.http/jdk.internal.net.http.ResponseTimerEvent.handle(ResponseTimerEvent.java:69)
	... 2 more

2026-09-03 18:47:20,532 ERROR [br.gov.caixa.sicvr.application.service.ConsultarRetornoArquivosStaService] (executor-thread-9) Falha ao consultar lote de protocolos no STA BACEN: br.gov.caixa.sicvr.domain.exception.FalhaIntegracaoStaException: Erro de comunicacao com o STA BACEN.
	at br.gov.caixa.sicvr.infrastructure.bacen.client.StaBacenHttpClient.enviar(StaBacenHttpClient.java:264)
	at br.gov.caixa.sicvr.infrastructure.bacen.client.StaBacenHttpClient.consultarProtocolos(StaBacenHttpClient.java:138)
	at br.gov.caixa.sicvr.infrastructure.bacen.client.StaBacenHttpClient_ClientProxy.consultarProtocolos(Unknown Source)
	at br.gov.caixa.sicvr.infrastructure.bacen.adapter.StaBacenPortAdapter.consultarSituacaoProtocolos(StaBacenPortAdapter.java:74)
	at br.gov.caixa.sicvr.infrastructure.bacen.adapter.StaBacenPortAdapter_ClientProxy.consultarSituacaoProtocolos(Unknown Source)
	at br.gov.caixa.sicvr.application.service.ConsultarRetornoArquivosStaService.consultarLote(ConsultarRetornoArquivosStaService.java:185)
	at br.gov.caixa.sicvr.application.service.ConsultarRetornoArquivosStaService.processarLotes(ConsultarRetornoArquivosStaService.java:170)
	at br.gov.caixa.sicvr.application.service.ConsultarRetornoArquivosStaService.executarConsulta(ConsultarRetornoArquivosStaService.java:137)
	at br.gov.caixa.sicvr.application.service.ConsultarRetornoArquivosStaService.consultarRetorno(ConsultarRetornoArquivosStaService.java:90)
	at br.gov.caixa.sicvr.application.service.ConsultarRetornoArquivosStaService_ClientProxy.consultarRetorno(Unknown Source)
	at br.gov.caixa.sicvr.api.resource.StaResource.consultarRetorno(StaResource.java:166)
	at br.gov.caixa.sicvr.api.resource.StaResource.consultarRetorno9800(StaResource.java:83)
	at br.gov.caixa.sicvr.api.resource.StaResource$quarkusrestinvoker$consultarRetorno9800_07ad9d7b7f4d7ce3b943788d4a41b92671f76d92.invoke(Unknown Source)
	at org.jboss.resteasy.reactive.server.handlers.InvocationHandler.handle(InvocationHandler.java:29)
	at io.quarkus.resteasy.reactive.server.runtime.QuarkusResteasyReactiveRequestContext.invokeHandler(QuarkusResteasyReactiveRequestContext.java:190)
	at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.run(AbstractResteasyReactiveContext.java:147)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$15.runWith(VertxCoreRecorder.java:695)
	at org.jboss.threads.EnhancedQueueExecutor$Task.doRunWith(EnhancedQueueExecutor.java:2651)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2630)
	at org.jboss.threads.EnhancedQueueExecutor.runThreadBody(EnhancedQueueExecutor.java:1622)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1589)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:11)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:11)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: java.net.http.HttpConnectTimeoutException: HTTP connect timed out
	at java.net.http/jdk.internal.net.http.HttpClientImpl.send(HttpClientImpl.java:945)
	at java.net.http/jdk.internal.net.http.HttpClientFacade.send(HttpClientFacade.java:133)
	at br.gov.caixa.sicvr.infrastructure.bacen.client.StaBacenHttpClient.enviar(StaBacenHttpClient.java:259)
	... 24 more
Caused by: java.net.http.HttpConnectTimeoutException: HTTP connect timed out
	at java.net.http/jdk.internal.net.http.ResponseTimerEvent.handle(ResponseTimerEvent.java:68)
	at java.net.http/jdk.internal.net.http.HttpClientImpl.purgeTimeoutsAndReturnNextDeadline(HttpClientImpl.java:1778)
	at java.net.http/jdk.internal.net.http.HttpClientImpl$SelectorManager.run(HttpClientImpl.java:1376)
Caused by: java.net.ConnectException: HTTP connect timed out
	at java.net.http/jdk.internal.net.http.ResponseTimerEvent.handle(ResponseTimerEvent.java:69)
	... 2 more


OKD


Jesse Mouta Pereira Batista

Administrator
Home
Operators
Workloads
Networking
Services
Routes
Ingresses
NetworkPolicies
Storage
PersistentVolumes
PersistentVolumeClaims
StorageClasses
VolumeSnapshots
VolumeSnapshotClasses
VolumeSnapshotContents
Builds
BuildConfigs
Builds
ImageStreams
Observe
Compute
User Management
Administration

Project: sicvr-des
Routes
Route details
Route
RT
sicvr-api-integracoes-des
Accepted

Actions
Details
Metrics
YAML
Route details
sicvr-api-integracoes-des
Namespace
NS
sicvr-des
app
=
sicvr-api-integracoes-des
application
=
sicvr-api-integracoes-des
template
=
quarkus-caixa-release
Service
S
sicvr-api-integracoes-des
web
15 de jun. de 2026, 11:00
No owner
Location
https://sicvr-api-integracoes-des.apps.nprd.caixa Copy to clipboard
Status
Accepted
sicvr-api-integracoes-des.apps.nprd.caixa
-
router-default.apps.nprd.caixa
TLS settings
edge
Redirect
-
Key
-
-
Router: default
sicvr-api-integracoes-des.apps.nprd.caixa
None
router-default.apps.nprd.caixa
Conditions
TypeStatusUpdatedReasonMessage
AdmittedTrue
15 de jun. de 2026, 11:00
--
