Identificado problema de "Integracao CicsWeb" na API do SID01-lancamentos-financeiros-OKD4

Apresentando o seguinte erro no log do OKD:

2026-09-08 14:05:24,734 ERROR [br.gov.cai.sid.res.lan.cre.CreditoResource] (executor-thread-0) METODO: creditar DETALHE: javax.xml.ws.soap.SOAPFaultException: Resource https://cicsweb.tqs.caixa:2587/sid01/lancamentoV4 not found

2026-09-08 14:22:46,936 ERROR [br.gov.cai.sid.res.lan.cre.CreditoResource] (executor-thread-1) METODO: creditar DETALHE: javax.xml.ws.soap.SOAPFaultException: Resource https://cicsweb.tqs.caixa:2587/sid01/lancamentoV4 not found




Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081610673
Criado em	 09/09/2026 13:51:34
Criado por	 P768728
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),

Informamos que sua solicitação foi recebida.

Nosso SLA para atendimento é de até 24h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.

Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.

Novas informações e atualizações serão registradas diretamente nesta WO.

Atte.

Esteira Devops DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081610673
Criado em	 09/09/2026 12:55:18
Criado por	 P992631
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Por gentileza, direcionar a Multi para verificação da configuração.


Att,
Eq.Sup.Mainframe
CTIS
ID da Ordem de Trabalho	 WO0000081610673
Criado em	 09/09/2026 12:51:12
Criado por	 P781026
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Realizei as verificações no CICS e não encontrei nenhuma anormalidade na transação. A princípio, o problema pode estar relacionado a algum item pendente ou configuração da baixa plataforma.

Como referência, o programa enviado por você foi executado mais de 2.000 vezes apenas hoje, o que indica que a execução está ocorrendo normalmente do ponto de vista do CICS.
Favor encaminhar para analise da equipe de multiplataformas.
ID da Ordem de Trabalho	 WO0000081610673
Criado em	 08/09/2026 17:44:34
Criado por	 P781026
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Para realização do atendimento no CICS, solicito a transação e o usuário de serviço.
ID da Ordem de Trabalho	 WO0000081610673
Criado em	 08/09/2026 17:35:19
Criado por	 P642161
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial com viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que esteja na iminência de tornar-se incidente. Previsto atendimento em até 8 horas.[CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081610673
Criado em	 08/09/2026 14:54:40
Criado por	 P726510
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a)

Acusamos o recebimento desta WO.

Informamos que sua solicitação entrou em fila de atendimento e será atendida o mais breve possível.

Qualquer dúvida, estamos à disposição.

Marcos Silva
P726510 Preposto
CTIS/CETAD/SUPORTE PLATAFORMA ALTA - NPRD
ID da Ordem de Trabalho	 WO0000081610673
Criado em	 08/09/2026 14:39:10
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Quarta-feira, 09/09/2026 16:31:27

log do pod:

P
sid01-lancamentos-financeiros-okd4-des-130-q6hbv
Running


exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.4.13.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|10.0.0.0/8 -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-08-04 20:36:24.762-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.4.13 started successfully (PID 8, JVM running for 4.577 s)
2026-08-04 20:36:24.766-03:00 INFO  c.m.applicationinsights.agent - Java version: 11.0.11, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-11-openjdk-11.0.11.0.9-2.el8_4.x86_64
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-08-04 20:36:28,695 INFO  [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (main) 
[issuers declarados na aplicacao]
https://login2des.caixa.gov.br/auth/realms/internet
https://logindes.caixa.gov.br/auth/realms/internet
https://login.des.caixa/auth/realms/intranet

2026-08-04 20:36:29,962 INFO  [io.qua.sma.ope.run.OpenApiRecorder] (main) CORS filtering is disabled and cross-origin resource sharing is allowed without restriction, which is not recommended in production. Please configure the CORS filter through 'quarkus.http.cors.*' properties. For more information, see Quarkus HTTP CORS documentation
2026-08-04 20:36:30,569 INFO  [io.quarkus] (main) sid01-lancamentos-financeiros 1.5.0.2 on JVM (powered by Quarkus 2.13.8.Final) started in 5.690s. Listening on: http://0.0.0.0:8080
2026-08-04 20:36:30,569 INFO  [io.quarkus] (main) Profile prod activated. 
2026-08-04 20:36:30,569 INFO  [io.quarkus] (main) Installed features: [cdi, hibernate-validator, logging-gelf, resteasy, resteasy-jsonb, smallrye-context-propagation, smallrye-health, smallrye-metrics, smallrye-openapi, swagger-ui, vertx]
2026-08-04 20:36:31.670-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service: Received response code 400 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (future warnings will be aggregated and logged once every 5 minutes)
2026-08-04 20:37:27.024-03:00 ERROR c.azure.core.http.policy.RetryPolicy - {"az.sdk.message":"Retry attempts have been exhausted.","exception":"http, none, proxydes.caixa/10.252.32.63:80 => /169.254.169.254:80, status: 502 Proxy Error ( The specified Secure Sockets Layer (SSL) port is not allowed. Forefront TMG is not configured to allow SSL requests from this port. Most Web browsers use port 443 for SSL requests.  )","tryCount":3}
2026-08-05 05:51:41,196 INFO  [org.apa.cxf.wsd.ser.fac.ReflectionServiceFactoryBean] (executor-thread-116) Creating Service {http://caixa.gov.br/sid01/lancamentoV4}D01POSOLService from WSDL: jar:file:/deployments/app/sid01-lancamentos-financeiros-1.5.0.2.jar!/wsdl/D01POSOL_N1W1.wsdl
2026-08-05 05:51:42,178 INFO  [org.apa.cxf.wsd.ser.fac.ReflectionServiceFactoryBean] (executor-thread-116) Creating Service {http://caixa.gov.br/sid01/lancamentoV4}D01POSOLService from WSDL: jar:file:/deployments/app/sid01-lancamentos-financeiros-1.5.0.2.jar!/wsdl/D01POSOL_N1W1.wsdl
2026-08-05 15:27:41.392-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - Pinging live metrics endpoint: null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (future warnings will be aggregated and logged once every 5 minutes)
java.nio.channels.UnresolvedAddressException: null
	at io.netty.channel.epoll.AbstractEpollChannel.checkResolvable(AbstractEpollChannel.java:337)
	at io.netty.channel.epoll.AbstractEpollChannel.doConnect(AbstractEpollChannel.java:744)
	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe.connect(AbstractEpollChannel.java:600)
	at io.netty.channel.DefaultChannelPipeline$HeadContext.connect(DefaultChannelPipeline.java:1342)
	at io.netty.channel.AbstractChannelHandlerContext.invokeConnect(AbstractChannelHandlerContext.java:653)
	at io.netty.channel.AbstractChannelHandlerContext.connect(AbstractChannelHandlerContext.java:632)
	at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.connect(CombinedChannelDuplexHandler.java:495)
	at io.netty.channel.ChannelOutboundHandlerAdapter.connect(ChannelOutboundHandlerAdapter.java:51)
	at io.netty.channel.CombinedChannelDuplexHandler.connect(CombinedChannelDuplexHandler.java:296)
	at io.netty.handler.proxy.HttpProxyHandler$HttpClientCodecWrapper.connect(HttpProxyHandler.java:299)
	at io.netty.channel.AbstractChannelHandlerContext.invokeConnect(AbstractChannelHandlerContext.java:657)
	at io.netty.channel.AbstractChannelHandlerContext.connect(AbstractChannelHandlerContext.java:632)
	at io.netty.handler.proxy.ProxyHandler.connect(ProxyHandler.java:178)
	at io.netty.channel.AbstractChannelHandlerContext.invokeConnect(AbstractChannelHandlerContext.java:655)
	at io.netty.channel.AbstractChannelHandlerContext.connect(AbstractChannelHandlerContext.java:632)
	at io.netty.handler.ssl.SslHandler.connect(SslHandler.java:715)
	at io.netty.channel.AbstractChannelHandlerContext.invokeConnect(AbstractChannelHandlerContext.java:657)
	at io.netty.channel.AbstractChannelHandlerContext.connect(AbstractChannelHandlerContext.java:632)
	at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.connect(CombinedChannelDuplexHandler.java:495)
	at io.netty.channel.ChannelOutboundHandlerAdapter.connect(ChannelOutboundHandlerAdapter.java:51)
	at io.netty.channel.CombinedChannelDuplexHandler.connect(CombinedChannelDuplexHandler.java:296)
	at io.netty.channel.AbstractChannelHandlerContext.invokeConnect(AbstractChannelHandlerContext.java:655)
	at io.netty.channel.AbstractChannelHandlerContext.connect(AbstractChannelHandlerContext.java:632)
	at io.netty.channel.AbstractChannelHandlerContext.connect(AbstractChannelHandlerContext.java:616)
	at io.netty.channel.AbstractChannelHandlerContext.connect(AbstractChannelHandlerContext.java:545)
	at io.netty.channel.DefaultChannelPipeline.connect(DefaultChannelPipeline.java:942)
	at io.netty.channel.AbstractChannel.connect(AbstractChannel.java:229)
	at reactor.netty.transport.TransportConnector.lambda$doConnect$8(TransportConnector.java:240)
	at io.netty.util.concurrent.AbstractEventExecutor.runTask(AbstractEventExecutor.java:174)
	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:167)
	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:470)
	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:403)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
	Suppressed: java.lang.Exception: #block terminated with an error
		at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:99)
		at reactor.core.publisher.Mono.block(Mono.java:1710)
		at com.azure.monitor.opentelemetry.exporter.implementation.quickpulse.QuickPulsePingSender.ping(QuickPulsePingSender.java:101)
		at com.azure.monitor.opentelemetry.exporter.implementation.quickpulse.QuickPulseCoordinator.ping(QuickPulseCoordinator.java:99)
		at com.azure.monitor.opentelemetry.exporter.implementation.quickpulse.QuickPulseCoordinator.run(QuickPulseCoordinator.java:52)
		... 1 common frames omitted
2026-08-05 15:32:41.395-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 13547): Pinging live metrics endpoint:
 * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-08-07 05:52:41.461-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 58): Pinging live metrics endpoint:
 * reactor.netty.http.client.PrematureCloseException: Connection prematurely closed BEFORE response (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-08-07 06:08:42.939-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service: Connection prematurely closed BEFORE response (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (future warnings will be aggregated and logged once every 5 minutes)
reactor.netty.http.client.PrematureCloseException: Connection prematurely closed BEFORE response
2026-08-08 00:22:41.499-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 4 times (out of 59): Pinging live metrics endpoint:
 * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (4 times)
2026-08-09 01:56:31.847-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 14): Sending telemetry to the ingestion service:
 * null (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-08-09 01:57:41.542-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 2 times (out of 60): Pinging live metrics endpoint:
 * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (2 times)
2026-08-09 10:31:31.861-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 17): Sending telemetry to the ingestion service:
 * null (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-08-09 10:32:41.559-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 2 times (out of 60): Pinging live metrics endpoint:
 * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (2 times)
2026-08-09 17:32:41.570-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 4 times (out of 59): Pinging live metrics endpoint:
 * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (4 times)
2026-08-10 09:06:31.893-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 8): Sending telemetry to the ingestion service:
 * null (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-08-10 09:07:41.594-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 4 times (out of 59): Pinging live metrics endpoint:
 * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (4 times)
2026-08-10 09:08:43.058-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 2 times (out of 10): Sending telemetry to the ingestion service:
 * null (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-08-10 10:39:32,261 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-2255) HTTP Request to /v1/debito failed, error id: 0a3ad981-12ad-4cc1-8fb8-cfeeae35030c-1: org.jboss.resteasy.spi.UnhandledException: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:368)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:218)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:258)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.internalParse(MediaTypeHeaderDelegate.java:96)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.parse(MediaTypeHeaderDelegate.java:69)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:33)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:19)
	at javax.ws.rs.core.MediaType.valueOf(MediaType.java:172)
	at org.jboss.resteasy.specimpl.ResteasyHttpHeaders.getMediaType(ResteasyHttpHeaders.java:151)
	at org.jboss.resteasy.core.registry.RootNode.match(RootNode.java:65)
	at org.jboss.resteasy.core.registry.RootClassNode.match(RootClassNode.java:47)
	at org.jboss.resteasy.core.ResourceMethodRegistry.getResourceInvoker(ResourceMethodRegistry.java:480)
	at org.jboss.resteasy.core.SynchronousDispatcher.getInvoker(SynchronousDispatcher.java:332)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:253)
	... 14 more

2026-08-10 10:41:31.896-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 14): Sending telemetry to the ingestion service:
 * Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (1 times)
2026-08-10 11:17:44,674 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-2266) HTTP Request to /v1/debito failed, error id: 0a3ad981-12ad-4cc1-8fb8-cfeeae35030c-2: org.jboss.resteasy.spi.UnhandledException: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:368)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:218)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:258)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.internalParse(MediaTypeHeaderDelegate.java:96)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.parse(MediaTypeHeaderDelegate.java:69)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:33)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:19)
	at javax.ws.rs.core.MediaType.valueOf(MediaType.java:172)
	at org.jboss.resteasy.specimpl.ResteasyHttpHeaders.getMediaType(ResteasyHttpHeaders.java:151)
	at org.jboss.resteasy.core.registry.RootNode.match(RootNode.java:65)
	at org.jboss.resteasy.core.registry.RootClassNode.match(RootClassNode.java:47)
	at org.jboss.resteasy.core.ResourceMethodRegistry.getResourceInvoker(ResourceMethodRegistry.java:480)
	at org.jboss.resteasy.core.SynchronousDispatcher.getInvoker(SynchronousDispatcher.java:332)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:253)
	... 14 more

2026-08-10 11:21:31.897-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 12): Sending telemetry to the ingestion service:
 * Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (1 times)
2026-08-10 17:28:21,761 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-2397) com.auth0.jwt.exceptions.TokenExpiredException: The Token has expired on 2026-08-10T20:28:21Z.
2026-08-10 17:28:21,762 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-2397) com.auth0.jwt.exceptions.TokenExpiredException: Token expirado.
2026-08-10 17:31:31.907-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 13): Sending telemetry to the ingestion service:
 * Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (1 times)
2026-08-12 20:59:15,461 ERROR [br.gov.cai.sid.res.lan.cre.CreditoResource] (executor-thread-3261) METODO: creditar DETALHE: javax.xml.ws.soap.SOAPFaultException: Internal Server Error 
2026-08-12 20:59:22,494 ERROR [br.gov.cai.sid.res.lan.cre.CreditoResource] (executor-thread-3258) METODO: creditar DETALHE: javax.xml.ws.soap.SOAPFaultException: Internal Server Error 
2026-08-12 22:52:04,884 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-3293) com.auth0.jwt.exceptions.IncorrectClaimException: The Token can't be used before 2026-08-13T01:52:05Z.
2026-08-12 22:52:04,885 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-3293) com.auth0.jwt.exceptions.JWTVerificationException: Token inv?lido.
2026-08-14 10:20:54,049 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-3792) com.auth0.jwt.exceptions.TokenExpiredException: The Token has expired on 2026-08-14T13:20:54Z.
2026-08-14 10:20:54,050 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-3792) com.auth0.jwt.exceptions.TokenExpiredException: Token expirado.
2026-08-14 14:22:52,554 SEVERE [org.ecl.yas.int.Unmarshaller] (executor-thread-3846) Invalid token=NUMBER at (line no=2, column no=26, offset=27). Expected tokens are: [COMMA]
2026-08-14 15:20:58,499 WARN  [org.apa.cxf.pha.PhaseInterceptorChain] (executor-thread-3867) Interceptor for {http://caixa.gov.br/sid01/lancamentoV4}D01POSOLService#{http://caixa.gov.br/sid01/lancamentoV4}lancamentoV4 has thrown exception, unwinding now: org.apache.cxf.interceptor.Fault: Could not receive Message.
	at org.apache.cxf.interceptor.MessageSenderInterceptor$MessageSenderEndingInterceptor.handleMessage(MessageSenderInterceptor.java:65)
	at org.apache.cxf.phase.PhaseInterceptorChain.doIntercept(PhaseInterceptorChain.java:307)
	at org.apache.cxf.endpoint.ClientImpl.doInvoke(ClientImpl.java:528)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:439)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:354)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:312)
	at org.apache.cxf.frontend.ClientProxy.invokeSync(ClientProxy.java:96)
	at org.apache.cxf.jaxws.JaxWsClientProxy.invoke(JaxWsClientProxy.java:140)
	at com.sun.proxy.$Proxy147.lancamentoV4(Unknown Source)
	at br.gov.caixa.sid01.service.LancamentoService.debitar(LancamentoService.java:188)
	at br.gov.caixa.sid01.service.LancamentoService_ClientProxy.debitar(Unknown Source)
	at br.gov.caixa.sid01.service.ServiceRequestFacade.debitar(ServiceRequestFacade.java:95)
	at br.gov.caixa.sid01.resource.lancamento.debito.DebitoResource.debitar(DebitoResource.java:226)
	at br.gov.caixa.sid01.resource.lancamento.debito.DebitoResource_Subclass.debitar$$superforward1(Unknown Source)
	at br.gov.caixa.sid01.resource.lancamento.debito.DebitoResource_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:54)
	at io.quarkus.hibernate.validator.runtime.interceptor.AbstractMethodValidationInterceptor.validateMethodInvocation(AbstractMethodValidationInterceptor.java:71)
	at io.quarkus.hibernate.validator.runtime.jaxrs.JaxrsEndPointValidationInterceptor.validateMethodInvocation(JaxrsEndPointValidationInterceptor.java:35)
	at io.quarkus.hibernate.validator.runtime.jaxrs.JaxrsEndPointValidationInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.CountedInterceptor.countedCallable(CountedInterceptor.java:85)
	at io.smallrye.metrics.interceptors.CountedInterceptor.countedMethod(CountedInterceptor.java:61)
	at io.smallrye.metrics.interceptors.CountedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor.timedCallable(SimplyTimedInterceptor.java:91)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor.simplyTimedMethod(SimplyTimedInterceptor.java:65)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.TimedInterceptor.timedCallable(TimedInterceptor.java:92)
	at io.smallrye.metrics.interceptors.TimedInterceptor.timedMethod(TimedInterceptor.java:65)
	at io.smallrye.metrics.interceptors.TimedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor.concurrentCallable(ConcurrentGaugeInterceptor.java:91)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor.countedMethod(ConcurrentGaugeInterceptor.java:62)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:41)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:33)
	at br.gov.caixa.sid01.resource.lancamento.debito.DebitoResource_Subclass.debitar(Unknown Source)
	at br.gov.caixa.sid01.resource.lancamento.debito.DebitoResource_ClientProxy.debitar(Unknown Source)
	at jdk.internal.reflect.GeneratedMethodAccessor199.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:170)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:130)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:660)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:524)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:474)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:476)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:434)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:408)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:69)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:492)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:261)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.net.SocketTimeoutException: SocketTimeoutException invoking https://cicsweb.des.caixa:32587/sid01/lancamentoV4: 60,000 milliseconds timeout on connection http-outgoing-1063 [ACTIVE]
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
	at org.apache.cxf.transport.http.HTTPConduit$WrappedOutputStream.mapException(HTTPConduit.java:1418)
	at org.apache.cxf.transport.http.HTTPConduit$WrappedOutputStream.close(HTTPConduit.java:1402)
	at org.apache.cxf.transport.http.asyncclient.AsyncHTTPConduit$AsyncWrappedOutputStream.close(AsyncHTTPConduit.java:428)
	at org.apache.cxf.transport.AbstractConduit.close(AbstractConduit.java:56)
	at org.apache.cxf.transport.http.HTTPConduit.close(HTTPConduit.java:689)
	at org.apache.cxf.interceptor.MessageSenderInterceptor$MessageSenderEndingInterceptor.handleMessage(MessageSenderInterceptor.java:63)
	... 72 more
Caused by: java.net.SocketTimeoutException: 60,000 milliseconds timeout on connection http-outgoing-1063 [ACTIVE]
	at org.apache.http.nio.protocol.HttpAsyncRequestExecutor.timeout(HttpAsyncRequestExecutor.java:387)
	at org.apache.http.impl.nio.client.InternalIODispatch.onTimeout(InternalIODispatch.java:98)
	at org.apache.http.impl.nio.client.InternalIODispatch.onTimeout(InternalIODispatch.java:40)
	at org.apache.http.impl.nio.reactor.AbstractIODispatch.timeout(AbstractIODispatch.java:175)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.sessionTimedOut(BaseIOReactor.java:261)
	at org.apache.http.impl.nio.reactor.AbstractIOReactor.timeoutCheck(AbstractIOReactor.java:506)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.validate(BaseIOReactor.java:211)
	at org.apache.http.impl.nio.reactor.AbstractIOReactor.execute(AbstractIOReactor.java:280)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.execute(BaseIOReactor.java:104)
	at org.apache.http.impl.nio.reactor.AbstractMultiworkerIOReactor$Worker.run(AbstractMultiworkerIOReactor.java:591)
	... 1 more

2026-08-14 15:20:58,500 ERROR [br.gov.cai.sid.res.lan.deb.DebitoResource] (executor-thread-3867) METODO: debitar DETALHE: javax.xml.ws.WebServiceException: Could not receive Message. 
2026-08-15 07:32:41.806-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 2 times (out of 60): Pinging live metrics endpoint:
 * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (2 times)
2026-08-17 11:25:59,057 ERROR [br.gov.cai.sid.res.lan.est.EstornoDebitoResource] (executor-thread-4869) METODO: estornar-debito DETALHE: javax.xml.ws.soap.SOAPFaultException: Conversion from SOAP failed 
2026-08-17 21:27:41.926-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 2 times (out of 60): Pinging live metrics endpoint:
 * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (2 times)
2026-08-19 00:13:07.794-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service (retry from disk): connection timed out: proxydes.caixa/10.252.32.65:80 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (future warnings will be aggregated and logged once every 5 minutes)
io.netty.channel.ConnectTimeoutException: connection timed out: proxydes.caixa/10.252.32.65:80
	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$2.run(AbstractEpollChannel.java:613)
	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:153)
	at io.netty.util.concurrent.AbstractEventExecutor.runTask(AbstractEventExecutor.java:174)
	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:167)
	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:470)
	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:406)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
2026-08-19 00:13:37.853-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service (retry from disk): connection timed out: proxydes.caixa/10.252.32.65:80 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (future warnings will be aggregated and logged once every 5 minutes)
io.netty.channel.ConnectTimeoutException: connection timed out: proxydes.caixa/10.252.32.65:80
	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$2.run(AbstractEpollChannel.java:613)
	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:153)
	at io.netty.util.concurrent.AbstractEventExecutor.runTask(AbstractEventExecutor.java:174)
	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:167)
	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:470)
	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:403)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
2026-08-19 00:13:43.439-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 4 times (out of 10): Sending telemetry to the ingestion service:
 * connection timed out: proxydes.caixa/10.252.32.65:80 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (4 times)
2026-08-19 00:16:32.353-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 12): Sending telemetry to the ingestion service:
 * connection timed out: proxydes.caixa/10.252.32.65:80 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (9 times)
 * Channel response timed out after 60000 milliseconds. (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-08-19 00:17:41.978-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 4 times (out of 17): Pinging live metrics endpoint:
 * io.netty.channel.ConnectTimeoutException: connection timed out: proxydes.caixa/10.252.32.65:80 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (3 times)
 * java.util.concurrent.TimeoutException: Channel response timed out after 60000 milliseconds. (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-08-19 00:18:07.795-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 4 times (out of 11): Sending telemetry to the ingestion service (retry from disk):
 * connection timed out: proxydes.caixa/10.252.32.65:80 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (4 times)
2026-08-19 00:18:37.854-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 3 times (out of 11): Sending telemetry to the ingestion service (retry from disk):
 * connection timed out: proxydes.caixa/10.252.32.65:80 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (3 times)
2026-08-19 00:18:43.440-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 4 times (out of 10): Sending telemetry to the ingestion service:
 * connection timed out: proxydes.caixa/10.252.32.65:80 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (4 times)
2026-08-19 15:34:05,780 SEVERE [org.ecl.yas.int.Unmarshaller] (executor-thread-5609) Invalid token=NUMBER at (line no=2, column no=26, offset=27). Expected tokens are: [COMMA]
2026-08-19 16:42:58,162 SEVERE [org.ecl.yas.int.Unmarshaller] (executor-thread-5623) Invalid token=NUMBER at (line no=2, column no=26, offset=27). Expected tokens are: [COMMA]
2026-08-19 16:49:50,535 SEVERE [org.ecl.yas.int.Unmarshaller] (executor-thread-5624) Invalid token=NUMBER at (line no=2, column no=26, offset=28). Expected tokens are: [COMMA]
2026-08-19 16:51:32.393-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 12): Sending telemetry to the ingestion service:
 * Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (1 times)
2026-08-19 17:01:36,933 SEVERE [org.ecl.yas.int.Unmarshaller] (executor-thread-5628) Invalid token=NUMBER at (line no=2, column no=26, offset=27). Expected tokens are: [COMMA]
2026-08-19 17:06:32.394-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 19): Sending telemetry to the ingestion service:
 * Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (1 times)
2026-08-19 17:24:16,296 SEVERE [org.ecl.yas.int.Unmarshaller] (executor-thread-5634) Invalid token=NUMBER at (line no=2, column no=26, offset=27). Expected tokens are: [COMMA]
2026-08-19 17:26:32.395-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 12): Sending telemetry to the ingestion service:
 * Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (1 times)
2026-08-20 15:47:06,057 SEVERE [org.ecl.yas.int.Unmarshaller] (executor-thread-5953) Unable to deserialize property 'valorSolicitado' because of: Error deserialize JSON value into type: class java.math.BigDecimal.
2026-08-20 15:51:32.433-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 18): Sending telemetry to the ingestion service:
 * Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (1 times)
2026-08-22 20:22:42.151-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 4 times (out of 60): Pinging live metrics endpoint:
 * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (4 times)
2026-08-24 09:44:00,223 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-7298) com.auth0.jwt.exceptions.TokenExpiredException: The Token has expired on 2026-08-24T12:43:53Z.
2026-08-24 09:44:00,223 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-7298) com.auth0.jwt.exceptions.TokenExpiredException: Token expirado.
2026-08-24 10:37:07,533 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-7306) HTTP Request to /v1/debito failed, error id: 0a3ad981-12ad-4cc1-8fb8-cfeeae35030c-3: org.jboss.resteasy.spi.UnhandledException: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:368)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:218)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:258)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.internalParse(MediaTypeHeaderDelegate.java:96)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.parse(MediaTypeHeaderDelegate.java:69)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:33)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:19)
	at javax.ws.rs.core.MediaType.valueOf(MediaType.java:172)
	at org.jboss.resteasy.specimpl.ResteasyHttpHeaders.getMediaType(ResteasyHttpHeaders.java:151)
	at org.jboss.resteasy.core.registry.RootNode.match(RootNode.java:65)
	at org.jboss.resteasy.core.registry.RootClassNode.match(RootClassNode.java:47)
	at org.jboss.resteasy.core.ResourceMethodRegistry.getResourceInvoker(ResourceMethodRegistry.java:480)
	at org.jboss.resteasy.core.SynchronousDispatcher.getInvoker(SynchronousDispatcher.java:332)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:253)
	... 14 more

2026-08-24 10:49:31,054 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-7307) HTTP Request to /v1/debito failed, error id: 0a3ad981-12ad-4cc1-8fb8-cfeeae35030c-4: org.jboss.resteasy.spi.UnhandledException: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:368)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:218)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:258)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.internalParse(MediaTypeHeaderDelegate.java:96)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.parse(MediaTypeHeaderDelegate.java:69)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:33)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:19)
	at javax.ws.rs.core.MediaType.valueOf(MediaType.java:172)
	at org.jboss.resteasy.specimpl.ResteasyHttpHeaders.getMediaType(ResteasyHttpHeaders.java:151)
	at org.jboss.resteasy.core.registry.RootNode.match(RootNode.java:65)
	at org.jboss.resteasy.core.registry.RootClassNode.match(RootClassNode.java:47)
	at org.jboss.resteasy.core.ResourceMethodRegistry.getResourceInvoker(ResourceMethodRegistry.java:480)
	at org.jboss.resteasy.core.SynchronousDispatcher.getInvoker(SynchronousDispatcher.java:332)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:253)
	... 14 more

2026-08-24 10:51:32.619-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 10): Sending telemetry to the ingestion service:
 * Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (1 times)
2026-08-24 11:41:36,671 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-7322) HTTP Request to /v1/debito failed, error id: 0a3ad981-12ad-4cc1-8fb8-cfeeae35030c-5: org.jboss.resteasy.spi.UnhandledException: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:368)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:218)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:258)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.internalParse(MediaTypeHeaderDelegate.java:96)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.parse(MediaTypeHeaderDelegate.java:69)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:33)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:19)
	at javax.ws.rs.core.MediaType.valueOf(MediaType.java:172)
	at org.jboss.resteasy.specimpl.ResteasyHttpHeaders.getMediaType(ResteasyHttpHeaders.java:151)
	at org.jboss.resteasy.core.registry.RootNode.match(RootNode.java:65)
	at org.jboss.resteasy.core.registry.RootClassNode.match(RootClassNode.java:47)
	at org.jboss.resteasy.core.ResourceMethodRegistry.getResourceInvoker(ResourceMethodRegistry.java:480)
	at org.jboss.resteasy.core.SynchronousDispatcher.getInvoker(SynchronousDispatcher.java:332)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:253)
	... 14 more

2026-08-24 11:47:03,661 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-7322) HTTP Request to /v1/debito failed, error id: 0a3ad981-12ad-4cc1-8fb8-cfeeae35030c-6: org.jboss.resteasy.spi.UnhandledException: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:368)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:218)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:258)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.internalParse(MediaTypeHeaderDelegate.java:96)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.parse(MediaTypeHeaderDelegate.java:69)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:33)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:19)
	at javax.ws.rs.core.MediaType.valueOf(MediaType.java:172)
	at org.jboss.resteasy.specimpl.ResteasyHttpHeaders.getMediaType(ResteasyHttpHeaders.java:151)
	at org.jboss.resteasy.core.registry.RootNode.match(RootNode.java:65)
	at org.jboss.resteasy.core.registry.RootClassNode.match(RootClassNode.java:47)
	at org.jboss.resteasy.core.ResourceMethodRegistry.getResourceInvoker(ResourceMethodRegistry.java:480)
	at org.jboss.resteasy.core.SynchronousDispatcher.getInvoker(SynchronousDispatcher.java:332)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:253)
	... 14 more

2026-08-24 14:07:42.235-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 2 times (out of 60): Pinging live metrics endpoint:
 * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (2 times)
2026-08-24 14:08:38.112-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 2): Sending telemetry to the ingestion service (retry from disk):
 * null (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-08-24 14:11:32.624-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 9): Sending telemetry to the ingestion service:
 * null (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-08-24 23:57:42.251-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 2 times (out of 59): Pinging live metrics endpoint:
 * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (2 times)
2026-08-24 23:58:38.129-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 2): Sending telemetry to the ingestion service (retry from disk):
 * null (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-08-25 00:01:32.643-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 10): Sending telemetry to the ingestion service:
 * null (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-08-25 08:46:32.659-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 12): Sending telemetry to the ingestion service:
 * null (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-08-25 08:47:42.275-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 2 times (out of 60): Pinging live metrics endpoint:
 * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (2 times)
2026-08-25 17:42:42.297-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 2 times (out of 59): Pinging live metrics endpoint:
 * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (2 times)
2026-08-27 13:46:32.770-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 2 times (out of 12): Sending telemetry to the ingestion service:
 * null (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-08-27 13:47:42.393-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 4 times (out of 60): Pinging live metrics endpoint:
 * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (4 times)
2026-08-27 13:48:38.244-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 3): Sending telemetry to the ingestion service (retry from disk):
 * null (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-08-27 14:28:36,651 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-8525) com.auth0.jwt.exceptions.SignatureVerificationException: The Token's Signature resulted invalid when verified using the Algorithm: SHA256withRSA
2026-08-27 14:28:36,651 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-8525) com.auth0.jwt.exceptions.JWTVerificationException: Token inv?lido.
2026-08-27 21:17:42.408-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 2 times (out of 60): Pinging live metrics endpoint:
 * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (2 times)
2026-08-28 03:21:32.799-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 18): Sending telemetry to the ingestion service:
 * null (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-08-28 03:22:42.418-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 2 times (out of 59): Pinging live metrics endpoint:
 * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (2 times)
2026-08-28 16:31:32.823-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 20): Sending telemetry to the ingestion service:
 * Connection prematurely closed BEFORE response (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-08-28 16:36:20,755 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-8909) HTTP Request to /v1/debito failed, error id: 0a3ad981-12ad-4cc1-8fb8-cfeeae35030c-7: org.jboss.resteasy.spi.UnhandledException: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:368)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:218)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:258)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.internalParse(MediaTypeHeaderDelegate.java:96)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.parse(MediaTypeHeaderDelegate.java:69)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:33)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:19)
	at javax.ws.rs.core.MediaType.valueOf(MediaType.java:172)
	at org.jboss.resteasy.specimpl.ResteasyHttpHeaders.getMediaType(ResteasyHttpHeaders.java:151)
	at org.jboss.resteasy.core.registry.RootNode.match(RootNode.java:65)
	at org.jboss.resteasy.core.registry.RootClassNode.match(RootClassNode.java:47)
	at org.jboss.resteasy.core.ResourceMethodRegistry.getResourceInvoker(ResourceMethodRegistry.java:480)
	at org.jboss.resteasy.core.SynchronousDispatcher.getInvoker(SynchronousDispatcher.java:332)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:253)
	... 14 more

2026-08-28 17:10:25,162 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-8915) HTTP Request to /v1/debito failed, error id: 0a3ad981-12ad-4cc1-8fb8-cfeeae35030c-8: org.jboss.resteasy.spi.UnhandledException: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:368)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:218)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:258)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.internalParse(MediaTypeHeaderDelegate.java:96)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.parse(MediaTypeHeaderDelegate.java:69)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:33)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:19)
	at javax.ws.rs.core.MediaType.valueOf(MediaType.java:172)
	at org.jboss.resteasy.specimpl.ResteasyHttpHeaders.getMediaType(ResteasyHttpHeaders.java:151)
	at org.jboss.resteasy.core.registry.RootNode.match(RootNode.java:65)
	at org.jboss.resteasy.core.registry.RootClassNode.match(RootClassNode.java:47)
	at org.jboss.resteasy.core.ResourceMethodRegistry.getResourceInvoker(ResourceMethodRegistry.java:480)
	at org.jboss.resteasy.core.SynchronousDispatcher.getInvoker(SynchronousDispatcher.java:332)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:253)
	... 14 more

2026-08-28 17:11:32.824-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 14): Sending telemetry to the ingestion service:
 * Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (1 times)
2026-08-28 17:25:37,583 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-8920) HTTP Request to /v1/debito failed, error id: 0a3ad981-12ad-4cc1-8fb8-cfeeae35030c-9: org.jboss.resteasy.spi.UnhandledException: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:368)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:218)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:258)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.internalParse(MediaTypeHeaderDelegate.java:96)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.parse(MediaTypeHeaderDelegate.java:69)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:33)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:19)
	at javax.ws.rs.core.MediaType.valueOf(MediaType.java:172)
	at org.jboss.resteasy.specimpl.ResteasyHttpHeaders.getMediaType(ResteasyHttpHeaders.java:151)
	at org.jboss.resteasy.core.registry.RootNode.match(RootNode.java:65)
	at org.jboss.resteasy.core.registry.RootClassNode.match(RootClassNode.java:47)
	at org.jboss.resteasy.core.ResourceMethodRegistry.getResourceInvoker(ResourceMethodRegistry.java:480)
	at org.jboss.resteasy.core.SynchronousDispatcher.getInvoker(SynchronousDispatcher.java:332)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:253)
	... 14 more

2026-08-31 04:22:42.545-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 58): Pinging live metrics endpoint:
 * io.netty.channel.ConnectTimeoutException: connection timed out: proxydes.caixa/10.252.32.63:80 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-08-31 09:29:15,988 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-9767) HTTP Request to /v1/debito failed, error id: 0a3ad981-12ad-4cc1-8fb8-cfeeae35030c-10: org.jboss.resteasy.spi.UnhandledException: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:368)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:218)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:258)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.internalParse(MediaTypeHeaderDelegate.java:96)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.parse(MediaTypeHeaderDelegate.java:69)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:33)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:19)
	at javax.ws.rs.core.MediaType.valueOf(MediaType.java:172)
	at org.jboss.resteasy.specimpl.ResteasyHttpHeaders.getMediaType(ResteasyHttpHeaders.java:151)
	at org.jboss.resteasy.core.registry.RootNode.match(RootNode.java:65)
	at org.jboss.resteasy.core.registry.RootClassNode.match(RootClassNode.java:47)
	at org.jboss.resteasy.core.ResourceMethodRegistry.getResourceInvoker(ResourceMethodRegistry.java:480)
	at org.jboss.resteasy.core.SynchronousDispatcher.getInvoker(SynchronousDispatcher.java:332)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:253)
	... 14 more

2026-08-31 09:31:32.950-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 14): Sending telemetry to the ingestion service:
 * Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (1 times)
2026-08-31 10:04:05,084 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-9777) HTTP Request to /v1/debito failed, error id: 0a3ad981-12ad-4cc1-8fb8-cfeeae35030c-11: org.jboss.resteasy.spi.UnhandledException: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:368)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:218)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:258)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.internalParse(MediaTypeHeaderDelegate.java:96)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.parse(MediaTypeHeaderDelegate.java:69)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:33)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:19)
	at javax.ws.rs.core.MediaType.valueOf(MediaType.java:172)
	at org.jboss.resteasy.specimpl.ResteasyHttpHeaders.getMediaType(ResteasyHttpHeaders.java:151)
	at org.jboss.resteasy.core.registry.RootNode.match(RootNode.java:65)
	at org.jboss.resteasy.core.registry.RootClassNode.match(RootClassNode.java:47)
	at org.jboss.resteasy.core.ResourceMethodRegistry.getResourceInvoker(ResourceMethodRegistry.java:480)
	at org.jboss.resteasy.core.SynchronousDispatcher.getInvoker(SynchronousDispatcher.java:332)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:253)
	... 14 more

2026-08-31 10:19:32,104 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-9773) com.auth0.jwt.exceptions.SignatureVerificationException: The Token's Signature resulted invalid when verified using the Algorithm: SHA256withRSA
2026-08-31 10:19:32,104 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-9773) com.auth0.jwt.exceptions.JWTVerificationException: Token inv?lido.
2026-08-31 10:19:33,315 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-9773) com.auth0.jwt.exceptions.SignatureVerificationException: The Token's Signature resulted invalid when verified using the Algorithm: SHA256withRSA
2026-08-31 10:19:33,315 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-9773) com.auth0.jwt.exceptions.JWTVerificationException: Token inv?lido.
2026-08-31 10:21:32.952-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 18): Sending telemetry to the ingestion service:
 * Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (1 times)
2026-08-31 11:02:23,698 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-9785) HTTP Request to /v1/debito failed, error id: 0a3ad981-12ad-4cc1-8fb8-cfeeae35030c-12: org.jboss.resteasy.spi.UnhandledException: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:368)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:218)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:258)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.internalParse(MediaTypeHeaderDelegate.java:96)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.parse(MediaTypeHeaderDelegate.java:69)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:33)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:19)
	at javax.ws.rs.core.MediaType.valueOf(MediaType.java:172)
	at org.jboss.resteasy.specimpl.ResteasyHttpHeaders.getMediaType(ResteasyHttpHeaders.java:151)
	at org.jboss.resteasy.core.registry.RootNode.match(RootNode.java:65)
	at org.jboss.resteasy.core.registry.RootClassNode.match(RootClassNode.java:47)
	at org.jboss.resteasy.core.ResourceMethodRegistry.getResourceInvoker(ResourceMethodRegistry.java:480)
	at org.jboss.resteasy.core.SynchronousDispatcher.getInvoker(SynchronousDispatcher.java:332)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:253)
	... 14 more

2026-08-31 11:06:32.953-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 35): Sending telemetry to the ingestion service:
 * Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (1 times)
2026-08-31 15:05:41,110 SEVERE [org.ecl.yas.int.Unmarshaller] (executor-thread-9850) Unable to deserialize property 'nuDescricaoLancto' because of: Error deserialize JSON value into type: class java.lang.Long.
2026-08-31 15:21:27,381 SEVERE [org.ecl.yas.int.Unmarshaller] (executor-thread-9851) Unable to deserialize property 'nuDescricaoLancto' because of: Error deserialize JSON value into type: class java.lang.Long.
2026-09-01 09:13:14,094 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-10086) HTTP Request to /v1/debito failed, error id: 0a3ad981-12ad-4cc1-8fb8-cfeeae35030c-13: org.jboss.resteasy.spi.UnhandledException: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:368)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:218)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:258)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.lang.IllegalArgumentException: RESTEASY003340: Failure parsing MediaType string: 
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.internalParse(MediaTypeHeaderDelegate.java:96)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.parse(MediaTypeHeaderDelegate.java:69)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:33)
	at org.jboss.resteasy.plugins.delegates.MediaTypeHeaderDelegate.fromString(MediaTypeHeaderDelegate.java:19)
	at javax.ws.rs.core.MediaType.valueOf(MediaType.java:172)
	at org.jboss.resteasy.specimpl.ResteasyHttpHeaders.getMediaType(ResteasyHttpHeaders.java:151)
	at org.jboss.resteasy.core.registry.RootNode.match(RootNode.java:65)
	at org.jboss.resteasy.core.registry.RootClassNode.match(RootClassNode.java:47)
	at org.jboss.resteasy.core.ResourceMethodRegistry.getResourceInvoker(ResourceMethodRegistry.java:480)
	at org.jboss.resteasy.core.SynchronousDispatcher.getInvoker(SynchronousDispatcher.java:332)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:253)
	... 14 more

2026-09-01 13:18:44.130-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 5): Sending telemetry to the ingestion service:
 * Received response code 206 (Internal server error) (1 times)
2026-09-01 14:08:17,277 ERROR [br.gov.cai.sid.res.lan.deb.DebitoResource] (executor-thread-10153) METODO: debitar DETALHE: java.lang.NullPointerException 
2026-09-01 14:09:55,769 ERROR [br.gov.cai.sid.res.lan.deb.DebitoResource] (executor-thread-10153) METODO: debitar DETALHE: java.lang.NullPointerException 
2026-09-01 14:36:28,369 ERROR [br.gov.cai.sid.res.lan.deb.DebitoResource] (executor-thread-10158) METODO: debitar DETALHE: java.lang.NullPointerException 
2026-09-01 14:43:52,209 ERROR [br.gov.cai.sid.res.lan.deb.DebitoResource] (executor-thread-10161) METODO: debitar DETALHE: java.lang.NullPointerException 
2026-09-01 14:47:42.600-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 56): Pinging live metrics endpoint:
 * reactor.netty.http.client.PrematureCloseException: Connection prematurely closed BEFORE response (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-09-01 14:52:42.603-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 58): Pinging live metrics endpoint:
 * io.netty.handler.proxy.ProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => brazilsouth.livediagnostics.monitor.azure.com:443, timeout (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-09-01 14:59:44,163 ERROR [br.gov.cai.sid.res.lan.deb.DebitoResource] (executor-thread-10163) METODO: debitar DETALHE: java.lang.NullPointerException 
2026-09-02 10:42:39,345 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-10442) com.auth0.jwt.exceptions.SignatureVerificationException: The Token's Signature resulted invalid when verified using the Algorithm: SHA256withRSA
2026-09-02 10:42:39,346 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-10442) com.auth0.jwt.exceptions.JWTVerificationException: Token inv?lido.
2026-09-02 11:54:35,359 SEVERE [org.ecl.yas.int.Unmarshaller] (executor-thread-10445) Unable to deserialize property 'nuDocumento' because of: Error deserialize JSON value into type: class java.lang.Integer.
2026-09-02 11:56:33.031-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 9): Sending telemetry to the ingestion service:
 * Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (1 times)
2026-09-02 12:06:01,097 SEVERE [org.ecl.yas.int.Unmarshaller] (executor-thread-10457) Unable to deserialize property 'nuDocumento' because of: Error deserialize JSON value into type: class java.lang.Integer.
2026-09-02 14:04:52,386 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-10489) com.auth0.jwt.exceptions.SignatureVerificationException: The Token's Signature resulted invalid when verified using the Algorithm: SHA256withRSA
2026-09-02 14:04:52,387 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-10489) com.auth0.jwt.exceptions.JWTVerificationException: Token inv?lido.
2026-09-02 17:49:45,641 ERROR [br.gov.cai.sid.res.lan.cre.CreditoResource] (executor-thread-10557) METODO: creditar DETALHE: java.lang.NullPointerException 
2026-09-02 17:59:09,313 ERROR [br.gov.cai.sid.res.lan.cre.CreditoResource] (executor-thread-10559) METODO: creditar DETALHE: java.lang.NullPointerException 
2026-09-02 18:01:33.045-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 15): Sending telemetry to the ingestion service:
 * Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (1 times)
2026-09-02 18:05:32,162 ERROR [br.gov.cai.sid.res.lan.cre.CreditoResource] (executor-thread-10559) METODO: creditar DETALHE: java.lang.NullPointerException 
2026-09-02 18:07:12,717 ERROR [br.gov.cai.sid.res.lan.cre.CreditoResource] (executor-thread-10558) METODO: creditar DETALHE: java.lang.NullPointerException 
2026-09-03 11:41:33.081-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 9): Sending telemetry to the ingestion service:
 * Connection prematurely closed BEFORE response (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-03 11:42:42.671-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 4 times (out of 41): Pinging live metrics endpoint:
 * io.netty.handler.proxy.ProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => brazilsouth.livediagnostics.monitor.azure.com:443, timeout (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (3 times)
 * reactor.netty.http.client.PrematureCloseException: Connection prematurely closed BEFORE response (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-09-03 11:43:08.458-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 2 times (out of 2): Sending telemetry to the ingestion service (retry from disk):
 * http, none, proxydes.caixa/10.252.32.63:80 => brazilsouth-1.in.applicationinsights.azure.com:443, timeout (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-03 11:43:38.557-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 3 times (out of 3): Sending telemetry to the ingestion service (retry from disk):
 * http, none, proxydes.caixa/10.252.32.63:80 => brazilsouth-1.in.applicationinsights.azure.com:443, timeout (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (3 times)
2026-09-03 11:43:44.220-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 2 times (out of 4): Sending telemetry to the ingestion service:
 * http, none, proxydes.caixa/10.252.32.63:80 => brazilsouth-1.in.applicationinsights.azure.com:443, timeout (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-03 11:46:33.082-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 14): Sending telemetry to the ingestion service:
 * http, none, proxydes.caixa/10.252.32.63:80 => brazilsouth-1.in.applicationinsights.azure.com:443, timeout (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (10 times)
2026-09-03 11:47:42.671-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 2 times (out of 22): Pinging live metrics endpoint:
 * io.netty.handler.proxy.ProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => brazilsouth.livediagnostics.monitor.azure.com:443, timeout (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (2 times)
2026-09-03 11:48:08.459-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 3 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
 * http, none, proxydes.caixa/10.252.32.63:80 => brazilsouth-1.in.applicationinsights.azure.com:443, timeout (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (3 times)
2026-09-03 11:48:38.557-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 2 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
 * http, none, proxydes.caixa/10.252.32.63:80 => brazilsouth-1.in.applicationinsights.azure.com:443, timeout (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-03 11:48:44.221-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 2 times (out of 6): Sending telemetry to the ingestion service:
 * http, none, proxydes.caixa/10.252.32.63:80 => brazilsouth-1.in.applicationinsights.azure.com:443, timeout (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-03 12:42:42.673-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 58): Pinging live metrics endpoint:
 * reactor.netty.http.client.PrematureCloseException: Connection prematurely closed BEFORE response (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-09-03 14:50:39,658 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-10841) com.auth0.jwt.exceptions.SignatureVerificationException: The Token's Signature resulted invalid when verified using the Algorithm: SHA256withRSA
2026-09-03 14:50:39,659 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-10841) com.auth0.jwt.exceptions.JWTVerificationException: Token inv?lido.
2026-09-03 14:51:54,929 SEVERE [org.ecl.yas.int.Unmarshaller] (executor-thread-10841) Invalid token=NUMBER at (line no=16, column no=26, offset=301). Expected tokens are: [COMMA]
2026-09-03 14:52:24,210 SEVERE [org.ecl.yas.int.Unmarshaller] (executor-thread-10841) Invalid token=NUMBER at (line no=16, column no=26, offset=301). Expected tokens are: [COMMA]
2026-09-03 15:03:01,657 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-10841) com.auth0.jwt.exceptions.SignatureVerificationException: The Token's Signature resulted invalid when verified using the Algorithm: SHA256withRSA
2026-09-03 15:03:01,658 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-10841) com.auth0.jwt.exceptions.JWTVerificationException: Token inv?lido.
2026-09-03 15:08:26,379 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-10842) com.auth0.jwt.exceptions.TokenExpiredException: The Token has expired on 2026-09-03T18:03:14Z.
2026-09-03 15:08:26,379 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-10842) com.auth0.jwt.exceptions.TokenExpiredException: Token expirado.
2026-09-03 15:19:38,938 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-10842) com.auth0.jwt.exceptions.TokenExpiredException: The Token has expired on 2026-09-03T18:13:30Z.
2026-09-03 15:19:38,938 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-10842) com.auth0.jwt.exceptions.TokenExpiredException: Token expirado.
2026-09-03 16:35:24,397 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-10857) com.auth0.jwt.exceptions.SignatureVerificationException: The Token's Signature resulted invalid when verified using the Algorithm: SHA256withRSA
2026-09-03 16:35:24,397 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-10857) com.auth0.jwt.exceptions.JWTVerificationException: Token inv?lido.
2026-09-03 16:35:26,504 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-10857) com.auth0.jwt.exceptions.SignatureVerificationException: The Token's Signature resulted invalid when verified using the Algorithm: SHA256withRSA
2026-09-03 16:35:26,504 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-10857) com.auth0.jwt.exceptions.JWTVerificationException: Token inv?lido.
2026-09-03 16:35:34,203 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-10857) com.auth0.jwt.exceptions.SignatureVerificationException: The Token's Signature resulted invalid when verified using the Algorithm: SHA256withRSA
2026-09-03 16:35:34,203 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-10857) com.auth0.jwt.exceptions.JWTVerificationException: Token inv?lido.
2026-09-03 16:35:36,771 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-10857) com.auth0.jwt.exceptions.SignatureVerificationException: The Token's Signature resulted invalid when verified using the Algorithm: SHA256withRSA
2026-09-03 16:35:36,772 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-10857) com.auth0.jwt.exceptions.JWTVerificationException: Token inv?lido.
2026-09-03 16:36:33.090-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 16): Sending telemetry to the ingestion service:
 * Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (1 times)
2026-09-03 16:38:25,588 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-10858) com.auth0.jwt.exceptions.SignatureVerificationException: The Token's Signature resulted invalid when verified using the Algorithm: SHA256withRSA
2026-09-03 16:38:25,588 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-10858) com.auth0.jwt.exceptions.JWTVerificationException: Token inv?lido.
2026-09-03 16:41:33.090-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 10): Sending telemetry to the ingestion service:
 * Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (1 times)
2026-09-04 11:07:42.714-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 2 times (out of 59): Pinging live metrics endpoint:
 * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (2 times)
2026-09-04 11:08:38.595-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 1): Sending telemetry to the ingestion service (retry from disk):
 * null (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-04 11:11:33.130-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 9): Sending telemetry to the ingestion service:
 * null (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-04 11:12:42.715-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 6 times (out of 59): Pinging live metrics endpoint:
 * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (6 times)
2026-09-04 16:14:34,842 SEVERE [org.ecl.yas.int.Unmarshaller] (executor-thread-11165) null
2026-09-04 16:16:40,118 SEVERE [org.ecl.yas.int.Unmarshaller] (executor-thread-11166) null
2026-09-04 16:17:19,101 SEVERE [org.ecl.yas.int.Unmarshaller] (executor-thread-11164) null
2026-09-04 16:21:33.138-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 16): Sending telemetry to the ingestion service:
 * Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (1 times)
2026-09-04 17:36:04,063 SEVERE [org.ecl.yas.int.Unmarshaller] (executor-thread-11181) null
2026-09-04 17:45:37,346 SEVERE [org.ecl.yas.int.Unmarshaller] (executor-thread-11184) null
2026-09-04 17:45:58,040 SEVERE [org.ecl.yas.int.Unmarshaller] (executor-thread-11181) null
2026-09-04 17:46:33.141-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 15): Sending telemetry to the ingestion service:
 * Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (1 times)
2026-09-04 17:50:27,402 SEVERE [org.ecl.yas.int.Unmarshaller] (executor-thread-11185) null
2026-09-06 21:07:42.809-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 2 times (out of 60): Pinging live metrics endpoint:
 * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (2 times)
2026-09-07 19:01:03,093 WARN  [org.apa.cxf.pha.PhaseInterceptorChain] (executor-thread-12175) Interceptor for {http://caixa.gov.br/sid01/lancamentoV4}D01POSOLService#{http://caixa.gov.br/sid01/lancamentoV4}lancamentoV4 has thrown exception, unwinding now: org.apache.cxf.interceptor.Fault: Could not receive Message.
	at org.apache.cxf.interceptor.MessageSenderInterceptor$MessageSenderEndingInterceptor.handleMessage(MessageSenderInterceptor.java:65)
	at org.apache.cxf.phase.PhaseInterceptorChain.doIntercept(PhaseInterceptorChain.java:307)
	at org.apache.cxf.endpoint.ClientImpl.doInvoke(ClientImpl.java:528)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:439)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:354)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:312)
	at org.apache.cxf.frontend.ClientProxy.invokeSync(ClientProxy.java:96)
	at org.apache.cxf.jaxws.JaxWsClientProxy.invoke(JaxWsClientProxy.java:140)
	at com.sun.proxy.$Proxy147.lancamentoV4(Unknown Source)
	at br.gov.caixa.sid01.service.LancamentoService.desfazerDebito(LancamentoService.java:343)
	at br.gov.caixa.sid01.service.LancamentoService_ClientProxy.desfazerDebito(Unknown Source)
	at br.gov.caixa.sid01.service.ServiceRequestFacade.desfazerDebito(ServiceRequestFacade.java:136)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource.desfazerDebito(DesfazimentoDebitoResource.java:228)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_Subclass.desfazerDebito$$superforward1(Unknown Source)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:54)
	at io.quarkus.hibernate.validator.runtime.interceptor.AbstractMethodValidationInterceptor.validateMethodInvocation(AbstractMethodValidationInterceptor.java:71)
	at io.quarkus.hibernate.validator.runtime.jaxrs.JaxrsEndPointValidationInterceptor.validateMethodInvocation(JaxrsEndPointValidationInterceptor.java:35)
	at io.quarkus.hibernate.validator.runtime.jaxrs.JaxrsEndPointValidationInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.CountedInterceptor.countedCallable(CountedInterceptor.java:85)
	at io.smallrye.metrics.interceptors.CountedInterceptor.countedMethod(CountedInterceptor.java:61)
	at io.smallrye.metrics.interceptors.CountedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor.timedCallable(SimplyTimedInterceptor.java:91)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor.simplyTimedMethod(SimplyTimedInterceptor.java:65)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.TimedInterceptor.timedCallable(TimedInterceptor.java:92)
	at io.smallrye.metrics.interceptors.TimedInterceptor.timedMethod(TimedInterceptor.java:65)
	at io.smallrye.metrics.interceptors.TimedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor.concurrentCallable(ConcurrentGaugeInterceptor.java:91)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor.countedMethod(ConcurrentGaugeInterceptor.java:62)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:41)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:33)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_Subclass.desfazerDebito(Unknown Source)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_ClientProxy.desfazerDebito(Unknown Source)
	at jdk.internal.reflect.GeneratedMethodAccessor244.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:170)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:130)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:660)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:524)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:474)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:476)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:434)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:408)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:69)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:492)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:261)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.net.SocketTimeoutException: SocketTimeoutException invoking https://cicsweb.des.caixa:32587/sid01/lancamentoV4: 60,000 milliseconds timeout on connection http-outgoing-2288 [ACTIVE]
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
	at org.apache.cxf.transport.http.HTTPConduit$WrappedOutputStream.mapException(HTTPConduit.java:1418)
	at org.apache.cxf.transport.http.HTTPConduit$WrappedOutputStream.close(HTTPConduit.java:1402)
	at org.apache.cxf.transport.http.asyncclient.AsyncHTTPConduit$AsyncWrappedOutputStream.close(AsyncHTTPConduit.java:428)
	at org.apache.cxf.transport.AbstractConduit.close(AbstractConduit.java:56)
	at org.apache.cxf.transport.http.HTTPConduit.close(HTTPConduit.java:689)
	at org.apache.cxf.interceptor.MessageSenderInterceptor$MessageSenderEndingInterceptor.handleMessage(MessageSenderInterceptor.java:63)
	... 72 more
Caused by: java.net.SocketTimeoutException: 60,000 milliseconds timeout on connection http-outgoing-2288 [ACTIVE]
	at org.apache.http.nio.protocol.HttpAsyncRequestExecutor.timeout(HttpAsyncRequestExecutor.java:387)
	at org.apache.http.impl.nio.client.InternalIODispatch.onTimeout(InternalIODispatch.java:98)
	at org.apache.http.impl.nio.client.InternalIODispatch.onTimeout(InternalIODispatch.java:40)
	at org.apache.http.impl.nio.reactor.AbstractIODispatch.timeout(AbstractIODispatch.java:175)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.sessionTimedOut(BaseIOReactor.java:261)
	at org.apache.http.impl.nio.reactor.AbstractIOReactor.timeoutCheck(AbstractIOReactor.java:506)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.validate(BaseIOReactor.java:211)
	at org.apache.http.impl.nio.reactor.AbstractIOReactor.execute(AbstractIOReactor.java:280)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.execute(BaseIOReactor.java:104)
	at org.apache.http.impl.nio.reactor.AbstractMultiworkerIOReactor$Worker.run(AbstractMultiworkerIOReactor.java:591)
	... 1 more

2026-09-07 19:01:03,094 ERROR [br.gov.cai.sid.res.lan.des.DesfazimentoDebitoResource] (executor-thread-12175) METODO: desfazer-debito DETALHE: javax.xml.ws.WebServiceException: Could not receive Message. 
2026-09-07 19:06:32,666 WARN  [org.apa.cxf.pha.PhaseInterceptorChain] (executor-thread-12183) Interceptor for {http://caixa.gov.br/sid01/lancamentoV4}D01POSOLService#{http://caixa.gov.br/sid01/lancamentoV4}lancamentoV4 has thrown exception, unwinding now: org.apache.cxf.interceptor.Fault: Could not receive Message.
	at org.apache.cxf.interceptor.MessageSenderInterceptor$MessageSenderEndingInterceptor.handleMessage(MessageSenderInterceptor.java:65)
	at org.apache.cxf.phase.PhaseInterceptorChain.doIntercept(PhaseInterceptorChain.java:307)
	at org.apache.cxf.endpoint.ClientImpl.doInvoke(ClientImpl.java:528)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:439)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:354)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:312)
	at org.apache.cxf.frontend.ClientProxy.invokeSync(ClientProxy.java:96)
	at org.apache.cxf.jaxws.JaxWsClientProxy.invoke(JaxWsClientProxy.java:140)
	at com.sun.proxy.$Proxy147.lancamentoV4(Unknown Source)
	at br.gov.caixa.sid01.service.LancamentoService.desfazerDebito(LancamentoService.java:343)
	at br.gov.caixa.sid01.service.LancamentoService_ClientProxy.desfazerDebito(Unknown Source)
	at br.gov.caixa.sid01.service.ServiceRequestFacade.desfazerDebito(ServiceRequestFacade.java:136)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource.desfazerDebito(DesfazimentoDebitoResource.java:228)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_Subclass.desfazerDebito$$superforward1(Unknown Source)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:54)
	at io.quarkus.hibernate.validator.runtime.interceptor.AbstractMethodValidationInterceptor.validateMethodInvocation(AbstractMethodValidationInterceptor.java:71)
	at io.quarkus.hibernate.validator.runtime.jaxrs.JaxrsEndPointValidationInterceptor.validateMethodInvocation(JaxrsEndPointValidationInterceptor.java:35)
	at io.quarkus.hibernate.validator.runtime.jaxrs.JaxrsEndPointValidationInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.CountedInterceptor.countedCallable(CountedInterceptor.java:85)
	at io.smallrye.metrics.interceptors.CountedInterceptor.countedMethod(CountedInterceptor.java:61)
	at io.smallrye.metrics.interceptors.CountedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor.timedCallable(SimplyTimedInterceptor.java:91)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor.simplyTimedMethod(SimplyTimedInterceptor.java:65)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.TimedInterceptor.timedCallable(TimedInterceptor.java:92)
	at io.smallrye.metrics.interceptors.TimedInterceptor.timedMethod(TimedInterceptor.java:65)
	at io.smallrye.metrics.interceptors.TimedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor.concurrentCallable(ConcurrentGaugeInterceptor.java:91)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor.countedMethod(ConcurrentGaugeInterceptor.java:62)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:41)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:33)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_Subclass.desfazerDebito(Unknown Source)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_ClientProxy.desfazerDebito(Unknown Source)
	at jdk.internal.reflect.GeneratedMethodAccessor244.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:170)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:130)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:660)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:524)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:474)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:476)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:434)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:408)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:69)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:492)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:261)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.net.SocketTimeoutException: SocketTimeoutException invoking https://cicsweb.des.caixa:32587/sid01/lancamentoV4: 60,000 milliseconds timeout on connection http-outgoing-2298 [ACTIVE]
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
	at org.apache.cxf.transport.http.HTTPConduit$WrappedOutputStream.mapException(HTTPConduit.java:1418)
	at org.apache.cxf.transport.http.HTTPConduit$WrappedOutputStream.close(HTTPConduit.java:1402)
	at org.apache.cxf.transport.http.asyncclient.AsyncHTTPConduit$AsyncWrappedOutputStream.close(AsyncHTTPConduit.java:428)
	at org.apache.cxf.transport.AbstractConduit.close(AbstractConduit.java:56)
	at org.apache.cxf.transport.http.HTTPConduit.close(HTTPConduit.java:689)
	at org.apache.cxf.interceptor.MessageSenderInterceptor$MessageSenderEndingInterceptor.handleMessage(MessageSenderInterceptor.java:63)
	... 72 more
Caused by: java.net.SocketTimeoutException: 60,000 milliseconds timeout on connection http-outgoing-2298 [ACTIVE]
	at org.apache.http.nio.protocol.HttpAsyncRequestExecutor.timeout(HttpAsyncRequestExecutor.java:387)
	at org.apache.http.impl.nio.client.InternalIODispatch.onTimeout(InternalIODispatch.java:98)
	at org.apache.http.impl.nio.client.InternalIODispatch.onTimeout(InternalIODispatch.java:40)
	at org.apache.http.impl.nio.reactor.AbstractIODispatch.timeout(AbstractIODispatch.java:175)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.sessionTimedOut(BaseIOReactor.java:261)
	at org.apache.http.impl.nio.reactor.AbstractIOReactor.timeoutCheck(AbstractIOReactor.java:506)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.validate(BaseIOReactor.java:211)
	at org.apache.http.impl.nio.reactor.AbstractIOReactor.execute(AbstractIOReactor.java:280)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.execute(BaseIOReactor.java:104)
	at org.apache.http.impl.nio.reactor.AbstractMultiworkerIOReactor$Worker.run(AbstractMultiworkerIOReactor.java:591)
	... 1 more

2026-09-07 19:06:32,666 ERROR [br.gov.cai.sid.res.lan.des.DesfazimentoDebitoResource] (executor-thread-12183) METODO: desfazer-debito DETALHE: javax.xml.ws.WebServiceException: Could not receive Message. 
2026-09-07 19:12:12,129 WARN  [org.apa.cxf.pha.PhaseInterceptorChain] (executor-thread-12192) Interceptor for {http://caixa.gov.br/sid01/lancamentoV4}D01POSOLService#{http://caixa.gov.br/sid01/lancamentoV4}lancamentoV4 has thrown exception, unwinding now: org.apache.cxf.interceptor.Fault: Could not receive Message.
	at org.apache.cxf.interceptor.MessageSenderInterceptor$MessageSenderEndingInterceptor.handleMessage(MessageSenderInterceptor.java:65)
	at org.apache.cxf.phase.PhaseInterceptorChain.doIntercept(PhaseInterceptorChain.java:307)
	at org.apache.cxf.endpoint.ClientImpl.doInvoke(ClientImpl.java:528)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:439)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:354)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:312)
	at org.apache.cxf.frontend.ClientProxy.invokeSync(ClientProxy.java:96)
	at org.apache.cxf.jaxws.JaxWsClientProxy.invoke(JaxWsClientProxy.java:140)
	at com.sun.proxy.$Proxy147.lancamentoV4(Unknown Source)
	at br.gov.caixa.sid01.service.LancamentoService.desfazerDebito(LancamentoService.java:343)
	at br.gov.caixa.sid01.service.LancamentoService_ClientProxy.desfazerDebito(Unknown Source)
	at br.gov.caixa.sid01.service.ServiceRequestFacade.desfazerDebito(ServiceRequestFacade.java:136)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource.desfazerDebito(DesfazimentoDebitoResource.java:228)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_Subclass.desfazerDebito$$superforward1(Unknown Source)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:54)
	at io.quarkus.hibernate.validator.runtime.interceptor.AbstractMethodValidationInterceptor.validateMethodInvocation(AbstractMethodValidationInterceptor.java:71)
	at io.quarkus.hibernate.validator.runtime.jaxrs.JaxrsEndPointValidationInterceptor.validateMethodInvocation(JaxrsEndPointValidationInterceptor.java:35)
	at io.quarkus.hibernate.validator.runtime.jaxrs.JaxrsEndPointValidationInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.CountedInterceptor.countedCallable(CountedInterceptor.java:85)
	at io.smallrye.metrics.interceptors.CountedInterceptor.countedMethod(CountedInterceptor.java:61)
	at io.smallrye.metrics.interceptors.CountedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor.timedCallable(SimplyTimedInterceptor.java:91)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor.simplyTimedMethod(SimplyTimedInterceptor.java:65)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.TimedInterceptor.timedCallable(TimedInterceptor.java:92)
	at io.smallrye.metrics.interceptors.TimedInterceptor.timedMethod(TimedInterceptor.java:65)
	at io.smallrye.metrics.interceptors.TimedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor.concurrentCallable(ConcurrentGaugeInterceptor.java:91)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor.countedMethod(ConcurrentGaugeInterceptor.java:62)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:41)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:33)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_Subclass.desfazerDebito(Unknown Source)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_ClientProxy.desfazerDebito(Unknown Source)
	at jdk.internal.reflect.GeneratedMethodAccessor244.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:170)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:130)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:660)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:524)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:474)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:476)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:434)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:408)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:69)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:492)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:261)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.net.SocketTimeoutException: SocketTimeoutException invoking https://cicsweb.des.caixa:32587/sid01/lancamentoV4: 60,000 milliseconds timeout on connection http-outgoing-2308 [ACTIVE]
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
	at org.apache.cxf.transport.http.HTTPConduit$WrappedOutputStream.mapException(HTTPConduit.java:1418)
	at org.apache.cxf.transport.http.HTTPConduit$WrappedOutputStream.close(HTTPConduit.java:1402)
	at org.apache.cxf.transport.http.asyncclient.AsyncHTTPConduit$AsyncWrappedOutputStream.close(AsyncHTTPConduit.java:428)
	at org.apache.cxf.transport.AbstractConduit.close(AbstractConduit.java:56)
	at org.apache.cxf.transport.http.HTTPConduit.close(HTTPConduit.java:689)
	at org.apache.cxf.interceptor.MessageSenderInterceptor$MessageSenderEndingInterceptor.handleMessage(MessageSenderInterceptor.java:63)
	... 72 more
Caused by: java.net.SocketTimeoutException: 60,000 milliseconds timeout on connection http-outgoing-2308 [ACTIVE]
	at org.apache.http.nio.protocol.HttpAsyncRequestExecutor.timeout(HttpAsyncRequestExecutor.java:387)
	at org.apache.http.impl.nio.client.InternalIODispatch.onTimeout(InternalIODispatch.java:98)
	at org.apache.http.impl.nio.client.InternalIODispatch.onTimeout(InternalIODispatch.java:40)
	at org.apache.http.impl.nio.reactor.AbstractIODispatch.timeout(AbstractIODispatch.java:175)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.sessionTimedOut(BaseIOReactor.java:261)
	at org.apache.http.impl.nio.reactor.AbstractIOReactor.timeoutCheck(AbstractIOReactor.java:506)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.validate(BaseIOReactor.java:211)
	at org.apache.http.impl.nio.reactor.AbstractIOReactor.execute(AbstractIOReactor.java:280)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.execute(BaseIOReactor.java:104)
	at org.apache.http.impl.nio.reactor.AbstractMultiworkerIOReactor$Worker.run(AbstractMultiworkerIOReactor.java:591)
	... 1 more

2026-09-07 19:12:12,129 ERROR [br.gov.cai.sid.res.lan.des.DesfazimentoDebitoResource] (executor-thread-12192) METODO: desfazer-debito DETALHE: javax.xml.ws.WebServiceException: Could not receive Message. 
2026-09-07 19:16:33.339-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 28): Sending telemetry to the ingestion service:
 * Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (1 times)
2026-09-07 19:21:17,945 WARN  [org.apa.cxf.pha.PhaseInterceptorChain] (executor-thread-12191) Interceptor for {http://caixa.gov.br/sid01/lancamentoV4}D01POSOLService#{http://caixa.gov.br/sid01/lancamentoV4}lancamentoV4 has thrown exception, unwinding now: org.apache.cxf.interceptor.Fault: Could not receive Message.
	at org.apache.cxf.interceptor.MessageSenderInterceptor$MessageSenderEndingInterceptor.handleMessage(MessageSenderInterceptor.java:65)
	at org.apache.cxf.phase.PhaseInterceptorChain.doIntercept(PhaseInterceptorChain.java:307)
	at org.apache.cxf.endpoint.ClientImpl.doInvoke(ClientImpl.java:528)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:439)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:354)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:312)
	at org.apache.cxf.frontend.ClientProxy.invokeSync(ClientProxy.java:96)
	at org.apache.cxf.jaxws.JaxWsClientProxy.invoke(JaxWsClientProxy.java:140)
	at com.sun.proxy.$Proxy147.lancamentoV4(Unknown Source)
	at br.gov.caixa.sid01.service.LancamentoService.desfazerDebito(LancamentoService.java:343)
	at br.gov.caixa.sid01.service.LancamentoService_ClientProxy.desfazerDebito(Unknown Source)
	at br.gov.caixa.sid01.service.ServiceRequestFacade.desfazerDebito(ServiceRequestFacade.java:136)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource.desfazerDebito(DesfazimentoDebitoResource.java:228)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_Subclass.desfazerDebito$$superforward1(Unknown Source)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:54)
	at io.quarkus.hibernate.validator.runtime.interceptor.AbstractMethodValidationInterceptor.validateMethodInvocation(AbstractMethodValidationInterceptor.java:71)
	at io.quarkus.hibernate.validator.runtime.jaxrs.JaxrsEndPointValidationInterceptor.validateMethodInvocation(JaxrsEndPointValidationInterceptor.java:35)
	at io.quarkus.hibernate.validator.runtime.jaxrs.JaxrsEndPointValidationInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.CountedInterceptor.countedCallable(CountedInterceptor.java:85)
	at io.smallrye.metrics.interceptors.CountedInterceptor.countedMethod(CountedInterceptor.java:61)
	at io.smallrye.metrics.interceptors.CountedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor.timedCallable(SimplyTimedInterceptor.java:91)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor.simplyTimedMethod(SimplyTimedInterceptor.java:65)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.TimedInterceptor.timedCallable(TimedInterceptor.java:92)
	at io.smallrye.metrics.interceptors.TimedInterceptor.timedMethod(TimedInterceptor.java:65)
	at io.smallrye.metrics.interceptors.TimedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor.concurrentCallable(ConcurrentGaugeInterceptor.java:91)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor.countedMethod(ConcurrentGaugeInterceptor.java:62)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:41)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:33)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_Subclass.desfazerDebito(Unknown Source)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_ClientProxy.desfazerDebito(Unknown Source)
	at jdk.internal.reflect.GeneratedMethodAccessor244.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:170)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:130)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:660)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:524)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:474)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:476)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:434)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:408)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:69)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:492)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:261)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.net.SocketTimeoutException: SocketTimeoutException invoking https://cicsweb.des.caixa:32587/sid01/lancamentoV4: 60,000 milliseconds timeout on connection http-outgoing-2309 [ACTIVE]
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
	at org.apache.cxf.transport.http.HTTPConduit$WrappedOutputStream.mapException(HTTPConduit.java:1418)
	at org.apache.cxf.transport.http.HTTPConduit$WrappedOutputStream.close(HTTPConduit.java:1402)
	at org.apache.cxf.transport.http.asyncclient.AsyncHTTPConduit$AsyncWrappedOutputStream.close(AsyncHTTPConduit.java:428)
	at org.apache.cxf.transport.AbstractConduit.close(AbstractConduit.java:56)
	at org.apache.cxf.transport.http.HTTPConduit.close(HTTPConduit.java:689)
	at org.apache.cxf.interceptor.MessageSenderInterceptor$MessageSenderEndingInterceptor.handleMessage(MessageSenderInterceptor.java:63)
	... 72 more
Caused by: java.net.SocketTimeoutException: 60,000 milliseconds timeout on connection http-outgoing-2309 [ACTIVE]
	at org.apache.http.nio.protocol.HttpAsyncRequestExecutor.timeout(HttpAsyncRequestExecutor.java:387)
	at org.apache.http.impl.nio.client.InternalIODispatch.onTimeout(InternalIODispatch.java:98)
	at org.apache.http.impl.nio.client.InternalIODispatch.onTimeout(InternalIODispatch.java:40)
	at org.apache.http.impl.nio.reactor.AbstractIODispatch.timeout(AbstractIODispatch.java:175)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.sessionTimedOut(BaseIOReactor.java:261)
	at org.apache.http.impl.nio.reactor.AbstractIOReactor.timeoutCheck(AbstractIOReactor.java:506)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.validate(BaseIOReactor.java:211)
	at org.apache.http.impl.nio.reactor.AbstractIOReactor.execute(AbstractIOReactor.java:280)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.execute(BaseIOReactor.java:104)
	at org.apache.http.impl.nio.reactor.AbstractMultiworkerIOReactor$Worker.run(AbstractMultiworkerIOReactor.java:591)
	... 1 more

2026-09-07 19:21:17,945 ERROR [br.gov.cai.sid.res.lan.des.DesfazimentoDebitoResource] (executor-thread-12191) METODO: desfazer-debito DETALHE: javax.xml.ws.WebServiceException: Could not receive Message. 
2026-09-07 19:21:33.340-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 19): Sending telemetry to the ingestion service:
 * Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (1 times)
2026-09-07 19:26:48,677 WARN  [org.apa.cxf.pha.PhaseInterceptorChain] (executor-thread-12197) Interceptor for {http://caixa.gov.br/sid01/lancamentoV4}D01POSOLService#{http://caixa.gov.br/sid01/lancamentoV4}lancamentoV4 has thrown exception, unwinding now: org.apache.cxf.interceptor.Fault: Could not receive Message.
	at org.apache.cxf.interceptor.MessageSenderInterceptor$MessageSenderEndingInterceptor.handleMessage(MessageSenderInterceptor.java:65)
	at org.apache.cxf.phase.PhaseInterceptorChain.doIntercept(PhaseInterceptorChain.java:307)
	at org.apache.cxf.endpoint.ClientImpl.doInvoke(ClientImpl.java:528)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:439)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:354)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:312)
	at org.apache.cxf.frontend.ClientProxy.invokeSync(ClientProxy.java:96)
	at org.apache.cxf.jaxws.JaxWsClientProxy.invoke(JaxWsClientProxy.java:140)
	at com.sun.proxy.$Proxy147.lancamentoV4(Unknown Source)
	at br.gov.caixa.sid01.service.LancamentoService.desfazerDebito(LancamentoService.java:343)
	at br.gov.caixa.sid01.service.LancamentoService_ClientProxy.desfazerDebito(Unknown Source)
	at br.gov.caixa.sid01.service.ServiceRequestFacade.desfazerDebito(ServiceRequestFacade.java:136)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource.desfazerDebito(DesfazimentoDebitoResource.java:228)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_Subclass.desfazerDebito$$superforward1(Unknown Source)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:54)
	at io.quarkus.hibernate.validator.runtime.interceptor.AbstractMethodValidationInterceptor.validateMethodInvocation(AbstractMethodValidationInterceptor.java:71)
	at io.quarkus.hibernate.validator.runtime.jaxrs.JaxrsEndPointValidationInterceptor.validateMethodInvocation(JaxrsEndPointValidationInterceptor.java:35)
	at io.quarkus.hibernate.validator.runtime.jaxrs.JaxrsEndPointValidationInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.CountedInterceptor.countedCallable(CountedInterceptor.java:85)
	at io.smallrye.metrics.interceptors.CountedInterceptor.countedMethod(CountedInterceptor.java:61)
	at io.smallrye.metrics.interceptors.CountedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor.timedCallable(SimplyTimedInterceptor.java:91)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor.simplyTimedMethod(SimplyTimedInterceptor.java:65)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.TimedInterceptor.timedCallable(TimedInterceptor.java:92)
	at io.smallrye.metrics.interceptors.TimedInterceptor.timedMethod(TimedInterceptor.java:65)
	at io.smallrye.metrics.interceptors.TimedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor.concurrentCallable(ConcurrentGaugeInterceptor.java:91)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor.countedMethod(ConcurrentGaugeInterceptor.java:62)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:41)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:33)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_Subclass.desfazerDebito(Unknown Source)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_ClientProxy.desfazerDebito(Unknown Source)
	at jdk.internal.reflect.GeneratedMethodAccessor244.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:170)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:130)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:660)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:524)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:474)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:476)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:434)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:408)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:69)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:492)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:261)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.net.SocketTimeoutException: SocketTimeoutException invoking https://cicsweb.des.caixa:32587/sid01/lancamentoV4: 60,000 milliseconds timeout on connection http-outgoing-2319 [ACTIVE]
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
	at org.apache.cxf.transport.http.HTTPConduit$WrappedOutputStream.mapException(HTTPConduit.java:1418)
	at org.apache.cxf.transport.http.HTTPConduit$WrappedOutputStream.close(HTTPConduit.java:1402)
	at org.apache.cxf.transport.http.asyncclient.AsyncHTTPConduit$AsyncWrappedOutputStream.close(AsyncHTTPConduit.java:428)
	at org.apache.cxf.transport.AbstractConduit.close(AbstractConduit.java:56)
	at org.apache.cxf.transport.http.HTTPConduit.close(HTTPConduit.java:689)
	at org.apache.cxf.interceptor.MessageSenderInterceptor$MessageSenderEndingInterceptor.handleMessage(MessageSenderInterceptor.java:63)
	... 72 more
Caused by: java.net.SocketTimeoutException: 60,000 milliseconds timeout on connection http-outgoing-2319 [ACTIVE]
	at org.apache.http.nio.protocol.HttpAsyncRequestExecutor.timeout(HttpAsyncRequestExecutor.java:387)
	at org.apache.http.impl.nio.client.InternalIODispatch.onTimeout(InternalIODispatch.java:98)
	at org.apache.http.impl.nio.client.InternalIODispatch.onTimeout(InternalIODispatch.java:40)
	at org.apache.http.impl.nio.reactor.AbstractIODispatch.timeout(AbstractIODispatch.java:175)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.sessionTimedOut(BaseIOReactor.java:261)
	at org.apache.http.impl.nio.reactor.AbstractIOReactor.timeoutCheck(AbstractIOReactor.java:506)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.validate(BaseIOReactor.java:211)
	at org.apache.http.impl.nio.reactor.AbstractIOReactor.execute(AbstractIOReactor.java:280)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.execute(BaseIOReactor.java:104)
	at org.apache.http.impl.nio.reactor.AbstractMultiworkerIOReactor$Worker.run(AbstractMultiworkerIOReactor.java:591)
	... 1 more

2026-09-07 19:26:48,678 ERROR [br.gov.cai.sid.res.lan.des.DesfazimentoDebitoResource] (executor-thread-12197) METODO: desfazer-debito DETALHE: javax.xml.ws.WebServiceException: Could not receive Message. 
2026-09-07 19:31:33.340-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 18): Sending telemetry to the ingestion service:
 * Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (1 times)
2026-09-07 19:32:29,299 WARN  [org.apa.cxf.pha.PhaseInterceptorChain] (executor-thread-12201) Interceptor for {http://caixa.gov.br/sid01/lancamentoV4}D01POSOLService#{http://caixa.gov.br/sid01/lancamentoV4}lancamentoV4 has thrown exception, unwinding now: org.apache.cxf.interceptor.Fault: Could not receive Message.
	at org.apache.cxf.interceptor.MessageSenderInterceptor$MessageSenderEndingInterceptor.handleMessage(MessageSenderInterceptor.java:65)
	at org.apache.cxf.phase.PhaseInterceptorChain.doIntercept(PhaseInterceptorChain.java:307)
	at org.apache.cxf.endpoint.ClientImpl.doInvoke(ClientImpl.java:528)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:439)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:354)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:312)
	at org.apache.cxf.frontend.ClientProxy.invokeSync(ClientProxy.java:96)
	at org.apache.cxf.jaxws.JaxWsClientProxy.invoke(JaxWsClientProxy.java:140)
	at com.sun.proxy.$Proxy147.lancamentoV4(Unknown Source)
	at br.gov.caixa.sid01.service.LancamentoService.desfazerDebito(LancamentoService.java:343)
	at br.gov.caixa.sid01.service.LancamentoService_ClientProxy.desfazerDebito(Unknown Source)
	at br.gov.caixa.sid01.service.ServiceRequestFacade.desfazerDebito(ServiceRequestFacade.java:136)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource.desfazerDebito(DesfazimentoDebitoResource.java:228)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_Subclass.desfazerDebito$$superforward1(Unknown Source)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:54)
	at io.quarkus.hibernate.validator.runtime.interceptor.AbstractMethodValidationInterceptor.validateMethodInvocation(AbstractMethodValidationInterceptor.java:71)
	at io.quarkus.hibernate.validator.runtime.jaxrs.JaxrsEndPointValidationInterceptor.validateMethodInvocation(JaxrsEndPointValidationInterceptor.java:35)
	at io.quarkus.hibernate.validator.runtime.jaxrs.JaxrsEndPointValidationInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.CountedInterceptor.countedCallable(CountedInterceptor.java:85)
	at io.smallrye.metrics.interceptors.CountedInterceptor.countedMethod(CountedInterceptor.java:61)
	at io.smallrye.metrics.interceptors.CountedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor.timedCallable(SimplyTimedInterceptor.java:91)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor.simplyTimedMethod(SimplyTimedInterceptor.java:65)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.TimedInterceptor.timedCallable(TimedInterceptor.java:92)
	at io.smallrye.metrics.interceptors.TimedInterceptor.timedMethod(TimedInterceptor.java:65)
	at io.smallrye.metrics.interceptors.TimedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor.concurrentCallable(ConcurrentGaugeInterceptor.java:91)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor.countedMethod(ConcurrentGaugeInterceptor.java:62)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:41)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:33)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_Subclass.desfazerDebito(Unknown Source)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_ClientProxy.desfazerDebito(Unknown Source)
	at jdk.internal.reflect.GeneratedMethodAccessor244.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:170)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:130)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:660)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:524)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:474)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:476)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:434)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:408)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:69)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:492)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:261)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.net.SocketTimeoutException: SocketTimeoutException invoking https://cicsweb.des.caixa:32587/sid01/lancamentoV4: 60,000 milliseconds timeout on connection http-outgoing-2329 [ACTIVE]
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
	at org.apache.cxf.transport.http.HTTPConduit$WrappedOutputStream.mapException(HTTPConduit.java:1418)
	at org.apache.cxf.transport.http.HTTPConduit$WrappedOutputStream.close(HTTPConduit.java:1402)
	at org.apache.cxf.transport.http.asyncclient.AsyncHTTPConduit$AsyncWrappedOutputStream.close(AsyncHTTPConduit.java:428)
	at org.apache.cxf.transport.AbstractConduit.close(AbstractConduit.java:56)
	at org.apache.cxf.transport.http.HTTPConduit.close(HTTPConduit.java:689)
	at org.apache.cxf.interceptor.MessageSenderInterceptor$MessageSenderEndingInterceptor.handleMessage(MessageSenderInterceptor.java:63)
	... 72 more
Caused by: java.net.SocketTimeoutException: 60,000 milliseconds timeout on connection http-outgoing-2329 [ACTIVE]
	at org.apache.http.nio.protocol.HttpAsyncRequestExecutor.timeout(HttpAsyncRequestExecutor.java:387)
	at org.apache.http.impl.nio.client.InternalIODispatch.onTimeout(InternalIODispatch.java:98)
	at org.apache.http.impl.nio.client.InternalIODispatch.onTimeout(InternalIODispatch.java:40)
	at org.apache.http.impl.nio.reactor.AbstractIODispatch.timeout(AbstractIODispatch.java:175)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.sessionTimedOut(BaseIOReactor.java:261)
	at org.apache.http.impl.nio.reactor.AbstractIOReactor.timeoutCheck(AbstractIOReactor.java:506)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.validate(BaseIOReactor.java:211)
	at org.apache.http.impl.nio.reactor.AbstractIOReactor.execute(AbstractIOReactor.java:280)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.execute(BaseIOReactor.java:104)
	at org.apache.http.impl.nio.reactor.AbstractMultiworkerIOReactor$Worker.run(AbstractMultiworkerIOReactor.java:591)
	... 1 more

2026-09-07 19:32:29,300 ERROR [br.gov.cai.sid.res.lan.des.DesfazimentoDebitoResource] (executor-thread-12201) METODO: desfazer-debito DETALHE: javax.xml.ws.WebServiceException: Could not receive Message. 
2026-09-07 19:36:33.341-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 17): Sending telemetry to the ingestion service:
 * Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (1 times)
2026-09-07 19:38:05,595 WARN  [org.apa.cxf.pha.PhaseInterceptorChain] (executor-thread-12208) Interceptor for {http://caixa.gov.br/sid01/lancamentoV4}D01POSOLService#{http://caixa.gov.br/sid01/lancamentoV4}lancamentoV4 has thrown exception, unwinding now: org.apache.cxf.interceptor.Fault: Could not receive Message.
	at org.apache.cxf.interceptor.MessageSenderInterceptor$MessageSenderEndingInterceptor.handleMessage(MessageSenderInterceptor.java:65)
	at org.apache.cxf.phase.PhaseInterceptorChain.doIntercept(PhaseInterceptorChain.java:307)
	at org.apache.cxf.endpoint.ClientImpl.doInvoke(ClientImpl.java:528)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:439)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:354)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:312)
	at org.apache.cxf.frontend.ClientProxy.invokeSync(ClientProxy.java:96)
	at org.apache.cxf.jaxws.JaxWsClientProxy.invoke(JaxWsClientProxy.java:140)
	at com.sun.proxy.$Proxy147.lancamentoV4(Unknown Source)
	at br.gov.caixa.sid01.service.LancamentoService.desfazerDebito(LancamentoService.java:343)
	at br.gov.caixa.sid01.service.LancamentoService_ClientProxy.desfazerDebito(Unknown Source)
	at br.gov.caixa.sid01.service.ServiceRequestFacade.desfazerDebito(ServiceRequestFacade.java:136)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource.desfazerDebito(DesfazimentoDebitoResource.java:228)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_Subclass.desfazerDebito$$superforward1(Unknown Source)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:54)
	at io.quarkus.hibernate.validator.runtime.interceptor.AbstractMethodValidationInterceptor.validateMethodInvocation(AbstractMethodValidationInterceptor.java:71)
	at io.quarkus.hibernate.validator.runtime.jaxrs.JaxrsEndPointValidationInterceptor.validateMethodInvocation(JaxrsEndPointValidationInterceptor.java:35)
	at io.quarkus.hibernate.validator.runtime.jaxrs.JaxrsEndPointValidationInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.CountedInterceptor.countedCallable(CountedInterceptor.java:85)
	at io.smallrye.metrics.interceptors.CountedInterceptor.countedMethod(CountedInterceptor.java:61)
	at io.smallrye.metrics.interceptors.CountedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor.timedCallable(SimplyTimedInterceptor.java:91)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor.simplyTimedMethod(SimplyTimedInterceptor.java:65)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.TimedInterceptor.timedCallable(TimedInterceptor.java:92)
	at io.smallrye.metrics.interceptors.TimedInterceptor.timedMethod(TimedInterceptor.java:65)
	at io.smallrye.metrics.interceptors.TimedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor.concurrentCallable(ConcurrentGaugeInterceptor.java:91)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor.countedMethod(ConcurrentGaugeInterceptor.java:62)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:41)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:33)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_Subclass.desfazerDebito(Unknown Source)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_ClientProxy.desfazerDebito(Unknown Source)
	at jdk.internal.reflect.GeneratedMethodAccessor244.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:170)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:130)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:660)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:524)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:474)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:476)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:434)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:408)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:69)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:492)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:261)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.net.SocketTimeoutException: SocketTimeoutException invoking https://cicsweb.des.caixa:32587/sid01/lancamentoV4: 60,000 milliseconds timeout on connection http-outgoing-2338 [ACTIVE]
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
	at org.apache.cxf.transport.http.HTTPConduit$WrappedOutputStream.mapException(HTTPConduit.java:1418)
	at org.apache.cxf.transport.http.HTTPConduit$WrappedOutputStream.close(HTTPConduit.java:1402)
	at org.apache.cxf.transport.http.asyncclient.AsyncHTTPConduit$AsyncWrappedOutputStream.close(AsyncHTTPConduit.java:428)
	at org.apache.cxf.transport.AbstractConduit.close(AbstractConduit.java:56)
	at org.apache.cxf.transport.http.HTTPConduit.close(HTTPConduit.java:689)
	at org.apache.cxf.interceptor.MessageSenderInterceptor$MessageSenderEndingInterceptor.handleMessage(MessageSenderInterceptor.java:63)
	... 72 more
Caused by: java.net.SocketTimeoutException: 60,000 milliseconds timeout on connection http-outgoing-2338 [ACTIVE]
	at org.apache.http.nio.protocol.HttpAsyncRequestExecutor.timeout(HttpAsyncRequestExecutor.java:387)
	at org.apache.http.impl.nio.client.InternalIODispatch.onTimeout(InternalIODispatch.java:98)
	at org.apache.http.impl.nio.client.InternalIODispatch.onTimeout(InternalIODispatch.java:40)
	at org.apache.http.impl.nio.reactor.AbstractIODispatch.timeout(AbstractIODispatch.java:175)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.sessionTimedOut(BaseIOReactor.java:261)
	at org.apache.http.impl.nio.reactor.AbstractIOReactor.timeoutCheck(AbstractIOReactor.java:506)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.validate(BaseIOReactor.java:211)
	at org.apache.http.impl.nio.reactor.AbstractIOReactor.execute(AbstractIOReactor.java:280)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.execute(BaseIOReactor.java:104)
	at org.apache.http.impl.nio.reactor.AbstractMultiworkerIOReactor$Worker.run(AbstractMultiworkerIOReactor.java:591)
	... 1 more

2026-09-07 19:38:05,595 ERROR [br.gov.cai.sid.res.lan.des.DesfazimentoDebitoResource] (executor-thread-12208) METODO: desfazer-debito DETALHE: javax.xml.ws.WebServiceException: Could not receive Message. 
2026-09-07 19:43:35,037 WARN  [org.apa.cxf.pha.PhaseInterceptorChain] (executor-thread-12214) Interceptor for {http://caixa.gov.br/sid01/lancamentoV4}D01POSOLService#{http://caixa.gov.br/sid01/lancamentoV4}lancamentoV4 has thrown exception, unwinding now: org.apache.cxf.interceptor.Fault: Could not receive Message.
	at org.apache.cxf.interceptor.MessageSenderInterceptor$MessageSenderEndingInterceptor.handleMessage(MessageSenderInterceptor.java:65)
	at org.apache.cxf.phase.PhaseInterceptorChain.doIntercept(PhaseInterceptorChain.java:307)
	at org.apache.cxf.endpoint.ClientImpl.doInvoke(ClientImpl.java:528)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:439)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:354)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:312)
	at org.apache.cxf.frontend.ClientProxy.invokeSync(ClientProxy.java:96)
	at org.apache.cxf.jaxws.JaxWsClientProxy.invoke(JaxWsClientProxy.java:140)
	at com.sun.proxy.$Proxy147.lancamentoV4(Unknown Source)
	at br.gov.caixa.sid01.service.LancamentoService.desfazerDebito(LancamentoService.java:343)
	at br.gov.caixa.sid01.service.LancamentoService_ClientProxy.desfazerDebito(Unknown Source)
	at br.gov.caixa.sid01.service.ServiceRequestFacade.desfazerDebito(ServiceRequestFacade.java:136)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource.desfazerDebito(DesfazimentoDebitoResource.java:228)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_Subclass.desfazerDebito$$superforward1(Unknown Source)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:54)
	at io.quarkus.hibernate.validator.runtime.interceptor.AbstractMethodValidationInterceptor.validateMethodInvocation(AbstractMethodValidationInterceptor.java:71)
	at io.quarkus.hibernate.validator.runtime.jaxrs.JaxrsEndPointValidationInterceptor.validateMethodInvocation(JaxrsEndPointValidationInterceptor.java:35)
	at io.quarkus.hibernate.validator.runtime.jaxrs.JaxrsEndPointValidationInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.CountedInterceptor.countedCallable(CountedInterceptor.java:85)
	at io.smallrye.metrics.interceptors.CountedInterceptor.countedMethod(CountedInterceptor.java:61)
	at io.smallrye.metrics.interceptors.CountedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor.timedCallable(SimplyTimedInterceptor.java:91)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor.simplyTimedMethod(SimplyTimedInterceptor.java:65)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.TimedInterceptor.timedCallable(TimedInterceptor.java:92)
	at io.smallrye.metrics.interceptors.TimedInterceptor.timedMethod(TimedInterceptor.java:65)
	at io.smallrye.metrics.interceptors.TimedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor.concurrentCallable(ConcurrentGaugeInterceptor.java:91)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor.countedMethod(ConcurrentGaugeInterceptor.java:62)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:41)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:33)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_Subclass.desfazerDebito(Unknown Source)
	at br.gov.caixa.sid01.resource.lancamento.desfazimento.DesfazimentoDebitoResource_ClientProxy.desfazerDebito(Unknown Source)
	at jdk.internal.reflect.GeneratedMethodAccessor244.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:170)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:130)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:660)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:524)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:474)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:476)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:434)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:408)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:69)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:492)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:261)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.net.SocketTimeoutException: SocketTimeoutException invoking https://cicsweb.des.caixa:32587/sid01/lancamentoV4: 60,000 milliseconds timeout on connection http-outgoing-2348 [ACTIVE]
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
	at org.apache.cxf.transport.http.HTTPConduit$WrappedOutputStream.mapException(HTTPConduit.java:1418)
	at org.apache.cxf.transport.http.HTTPConduit$WrappedOutputStream.close(HTTPConduit.java:1402)
	at org.apache.cxf.transport.http.asyncclient.AsyncHTTPConduit$AsyncWrappedOutputStream.close(AsyncHTTPConduit.java:428)
	at org.apache.cxf.transport.AbstractConduit.close(AbstractConduit.java:56)
	at org.apache.cxf.transport.http.HTTPConduit.close(HTTPConduit.java:689)
	at org.apache.cxf.interceptor.MessageSenderInterceptor$MessageSenderEndingInterceptor.handleMessage(MessageSenderInterceptor.java:63)
	... 72 more
Caused by: java.net.SocketTimeoutException: 60,000 milliseconds timeout on connection http-outgoing-2348 [ACTIVE]
	at org.apache.http.nio.protocol.HttpAsyncRequestExecutor.timeout(HttpAsyncRequestExecutor.java:387)
	at org.apache.http.impl.nio.client.InternalIODispatch.onTimeout(InternalIODispatch.java:98)
	at org.apache.http.impl.nio.client.InternalIODispatch.onTimeout(InternalIODispatch.java:40)
	at org.apache.http.impl.nio.reactor.AbstractIODispatch.timeout(AbstractIODispatch.java:175)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.sessionTimedOut(BaseIOReactor.java:261)
	at org.apache.http.impl.nio.reactor.AbstractIOReactor.timeoutCheck(AbstractIOReactor.java:506)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.validate(BaseIOReactor.java:211)
	at org.apache.http.impl.nio.reactor.AbstractIOReactor.execute(AbstractIOReactor.java:280)
	at org.apache.http.impl.nio.reactor.BaseIOReactor.execute(BaseIOReactor.java:104)
	at org.apache.http.impl.nio.reactor.AbstractMultiworkerIOReactor$Worker.run(AbstractMultiworkerIOReactor.java:591)
	... 1 more

2026-09-07 19:43:35,038 ERROR [br.gov.cai.sid.res.lan.des.DesfazimentoDebitoResource] (executor-thread-12214) METODO: desfazer-debito DETALHE: javax.xml.ws.WebServiceException: Could not receive Message. 
2026-09-08 14:09:10,394 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-12481) com.auth0.jwt.exceptions.SignatureVerificationException: The Token's Signature resulted invalid when verified using the Algorithm: SHA256withRSA
2026-09-08 14:09:10,395 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-12481) com.auth0.jwt.exceptions.JWTVerificationException: Token inv?lido.
2026-09-08 14:19:02,962 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-12481) com.auth0.jwt.exceptions.TokenExpiredException: The Token has expired on 2026-09-08T17:14:18Z.
2026-09-08 14:19:02,962 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-12481) com.auth0.jwt.exceptions.TokenExpiredException: Token expirado.
2026-09-08 14:19:15,242 SEVERE [org.ecl.yas.int.Unmarshaller] (executor-thread-12481) Unexpected char 9 at (line no=45, column no=11, offset=918)
2026-09-08 14:48:36,214 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-12487) com.auth0.jwt.exceptions.SignatureVerificationException: The Token's Signature resulted invalid when verified using the Algorithm: SHA256withRSA
2026-09-08 14:48:36,214 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-12487) com.auth0.jwt.exceptions.JWTVerificationException: Token inv?lido.
2026-09-08 14:56:48,822 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-12489) com.auth0.jwt.exceptions.TokenExpiredException: The Token has expired on 2026-09-08T17:53:43Z.
2026-09-08 14:56:48,823 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-12489) com.auth0.jwt.exceptions.TokenExpiredException: Token expirado.
2026-09-08 14:57:29,256 SEVERE [org.ecl.yas.int.Unmarshaller] (executor-thread-12489) Invalid token=CURLYCLOSE at (line no=18, column no=3, offset=342). Expected tokens are: [CURLYOPEN, SQUAREOPEN, STRING, NUMBER, TRUE, FALSE, NULL]
2026-09-08 14:57:36,458 SEVERE [org.ecl.yas.int.Unmarshaller] (executor-thread-12489) Invalid token=CURLYCLOSE at (line no=17, column no=3, offset=322). Expected tokens are: [STRING]
2026-09-08 15:01:33.371-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 2 times (out of 7): Sending telemetry to the ingestion service:
 * Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (2 times)
2026-09-08 15:07:21,838 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-12491) com.auth0.jwt.exceptions.TokenExpiredException: The Token has expired on 2026-09-08T18:01:51Z.
2026-09-08 15:07:21,839 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-12491) com.auth0.jwt.exceptions.TokenExpiredException: Token expirado.
2026-09-08 15:11:33.372-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 13): Sending telemetry to the ingestion service:
 * Received response code 206 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (1 times)
2026-09-09 11:35:10,178 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-12808) com.auth0.jwt.exceptions.SignatureVerificationException: The Token's Signature resulted invalid when verified using the Algorithm: SHA256withRSA
2026-09-09 11:35:10,179 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-12808) com.auth0.jwt.exceptions.JWTVerificationException: Token inv?lido.
2026-09-09 11:35:15,636 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-12808) com.auth0.jwt.exceptions.SignatureVerificationException: The Token's Signature resulted invalid when verified using the Algorithm: SHA256withRSA
2026-09-09 11:35:15,636 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-12808) com.auth0.jwt.exceptions.JWTVerificationException: Token inv?lido.
2026-09-09 12:29:02,486 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (executor-thread-12823) com.auth0.jwt.exceptions.SignatureVerificationException: The Token's Signature resulted invalid when verified using the Algorithm: SHA256withRSA
2026-09-09 12:29:02,487 ERROR [br.gov.cai.sid.uti.sec.SSOHandlerFilter] (executor-thread-12823) com.auth0.jwt.exceptions.JWTVerificationException: Token inv?lido.




