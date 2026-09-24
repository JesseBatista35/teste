exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/api-trilha.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-24 12:31:26.800-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.7.10 started successfully (PID 8, JVM running for 5.659 s)
2026-09-24 12:31:26.883-03:00 INFO  c.m.applicationinsights.agent - Java version: 17.0.7, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-17-openjdk-17.0.7.0.7-3.el8.x86_64
2026-09-24 12:31:29.807-03:00 WARN  c.m.a.a.i.t.AppIdSupplier$GetAppIdTask - Retrieving appId: exception sending request to https://brazilsoutheast-0.in.applicationinsights.azure.com/api/profiles/b0142390-50c9-495e-85b4-7b2ade8fc1cf/appId (future warnings will be aggregated and logged once every 5 minutes)
reactor.core.Exceptions$ReactiveException: javax.net.ssl.SSLException: failure when writing TLS control frames
	at reactor.core.Exceptions.propagate(Exceptions.java:410)
	at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:102)
	at reactor.core.publisher.Mono.block(Mono.java:1779)
	at com.microsoft.applicationinsights.agent.internal.telemetry.AppIdSupplier$GetAppIdTask.run(AppIdSupplier.java:121)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Unknown Source)
	at java.base/java.util.concurrent.FutureTask.run(Unknown Source)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(Unknown Source)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.base/java.lang.Thread.run(Thread.java:833)
	Suppressed: java.lang.Exception: #block terminated with an error
		at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:104)
		... 8 common frames omitted
Caused by: javax.net.ssl.SSLException: failure when writing TLS control frames
	at io.netty.handler.ssl.SslHandler.setHandshakeFailureTransportFailure(SslHandler.java:2042)
	at io.netty.handler.ssl.SslHandler.lambda$wrapNonAppData$1(SslHandler.java:1008)
	at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:604)
	at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:571)
	at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:506)
	at io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:650)
	at io.netty.util.concurrent.DefaultPromise.setFailure0(DefaultPromise.java:643)
	at io.netty.util.concurrent.DefaultPromise.tryFailure(DefaultPromise.java:132)
	at io.netty.channel.PendingWriteQueue.safeFail(PendingWriteQueue.java:298)
	at io.netty.channel.PendingWriteQueue.removeAndFailAll(PendingWriteQueue.java:196)
	at io.netty.handler.proxy.ProxyHandler.failPendingWrites(ProxyHandler.java:433)
	at io.netty.handler.proxy.ProxyHandler.failPendingWritesAndClose(ProxyHandler.java:350)
	at io.netty.handler.proxy.ProxyHandler.setConnectFailure(ProxyHandler.java:345)
	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:265)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:355)
	at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:434)
	at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:361)
	at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:325)
	at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:249)
	at io.netty.handler.proxy.HttpProxyHandler$HttpClientCodecWrapper.channelRead(HttpProxyHandler.java:304)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1429)
	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:918)
	at io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe.epollInReady(AbstractEpollStreamChannel.java:804)
	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe.epollRdHupReady(AbstractEpollChannel.java:524)
	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe.handle(AbstractEpollChannel.java:494)
	at io.netty.channel.epoll.EpollIoHandler$DefaultEpollIoRegistration.handle(EpollIoHandler.java:349)
	at io.netty.channel.epoll.EpollIoHandler.processReady(EpollIoHandler.java:548)
	at io.netty.channel.epoll.EpollIoHandler.run(EpollIoHandler.java:491)
	at io.netty.channel.SingleThreadIoEventLoop.runIo(SingleThreadIoEventLoop.java:225)
	at io.netty.channel.SingleThreadIoEventLoop.run(SingleThreadIoEventLoop.java:196)
	at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:1204)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 common frames omitted
Caused by: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.65:80 => brazilsoutheast-0.in.applicationinsights.azure.com/<unresolved>:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
	at io.netty.handler.proxy.HttpProxyHandler.handleResponse(HttpProxyHandler.java:232)
	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:256)
	... 21 common frames omitted
2026-09-24 12:31:30.198-03:00 WARN  i.o.j.s.i.a.i.c.i.SelectorConfig - The otel.instrumentation.logback-appender.experimental.capture-mdc-attributes setting and the equivalent declarative configuration property are deprecated and may be removed in the next minor release. Use otel.instrumentation.logback-appender.experimental.mdc-attributes.included or equivalent declarative configuration instead.

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.7.7)

2026-09-24 12:31:30,814 INFO  br.gov.caixa.sicbp.apitrilha.RunApplication : Starting RunApplication v0.0.0.26 using Java 17.0.7 on sicbp-trilha-api-des-58-88xfr with PID 8 (/deployments/api-trilha.jar started by 1001 in /deployments)
2026-09-24 12:31:30,887 INFO  br.gov.caixa.sicbp.apitrilha.RunApplication : The following 1 profile is active: "development"
2026-09-24 12:31:34,599 INFO  org.springframework.data.repository.config.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-09-24 12:31:34,796 INFO  org.springframework.data.repository.config.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 189 ms. Found 2 JPA repository interfaces.
2026-09-24 12:31:35,301 INFO  org.springframework.cloud.context.scope.GenericScope : BeanFactory id=dc4b8c9f-3d25-3a8d-b6e8-17c006ca5e29
2026-09-24 12:31:36,790 INFO  org.springframework.boot.web.embedded.tomcat.TomcatWebServer : Tomcat initialized with port(s): 8080 (http)
2026-09-24 12:31:36,817 INFO  org.apache.catalina.core.StandardService : Starting service [Tomcat]
2026-09-24 12:31:36,817 INFO  org.apache.catalina.core.StandardEngine : Starting Servlet engine: [Apache Tomcat/9.0.70]
2026-09-24 12:31:36,985 INFO  org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/] : Initializing Spring embedded WebApplicationContext
2026-09-24 12:31:36,986 INFO  org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 5904 ms
2026-09-24 12:31:38,097 INFO  io.micrometer.core.instrument.push.PushMeterRegistry : publishing metrics for AzureMonitorMeterRegistry every 1m
2026-09-24 12:31:39,992 INFO  com.zaxxer.hikari.HikariDataSource : hikari-dev-pool-api-trilha - Starting...
2026-09-24 12:31:41,190 INFO  com.zaxxer.hikari.HikariDataSource : hikari-dev-pool-api-trilha - Start completed.
2026-09-24 12:31:41.381-03:00 WARN  i.o.j.s.i.a.i.c.i.SelectorConfig - The otel.instrumentation.log4j-appender.experimental.capture-map-message-attributes setting and the equivalent declarative configuration property are deprecated and may be removed in the next minor release. Use otel.instrumentation.log4j-appender.experimental.map-message-attributes.included or equivalent declarative configuration instead.
2026-09-24 12:31:41.382-03:00 WARN  i.o.j.s.i.a.i.c.i.SelectorConfig - The otel.instrumentation.log4j-appender.experimental.capture-mdc-attributes setting and the equivalent declarative configuration property are deprecated and may be removed in the next minor release. Use otel.instrumentation.log4j-appender.experimental.mdc-attributes.included or equivalent declarative configuration instead.
2026-09-24 12:31:41,393 INFO  org.hibernate.jpa.internal.util.LogHelper : HHH000204: Processing PersistenceUnitInfo [name: default]
2026-09-24 12:31:41,583 INFO  org.hibernate.Version : HHH000412: Hibernate ORM core version 5.6.14.Final
2026-09-24 12:31:41,926 INFO  org.hibernate.annotations.common.Version : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2026-09-24 12:31:42,221 INFO  org.hibernate.dialect.Dialect : HHH000400: Using dialect: org.hibernate.dialect.Oracle12cDialect
2026-09-24 12:31:44,013 INFO  org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2026-09-24 12:31:44,022 INFO  org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-09-24 12:31:48,135 INFO  org.springframework.boot.actuate.endpoint.web.EndpointLinksResolver : Exposing 1 endpoint(s) beneath base path '/actuator'
2026-09-24 12:31:48,192 INFO  org.springframework.security.web.DefaultSecurityFilterChain : Will secure any request with [org.springframework.security.web.session.DisableEncodeUrlFilter@3f908a10, org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter@153c69bc, org.springframework.security.web.context.SecurityContextPersistenceFilter@4d73d3d1, org.springframework.security.web.header.HeaderWriterFilter@5fcff272, org.springframework.web.filter.CorsFilter@73cfafd8, org.springframework.security.web.authentication.logout.LogoutFilter@57859e2c, br.gov.caixa.sicbp.infracomponentes.request.filter.ApiSecurityFilter@515b9d4a, org.springframework.security.web.savedrequest.RequestCacheAwareFilter@56b66cc6, org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter@6f076c53, org.springframework.security.web.authentication.AnonymousAuthenticationFilter@4b517357, org.springframework.security.web.session.SessionManagementFilter@818a514, org.springframework.security.web.access.ExceptionTranslationFilter@35d62807, org.springframework.security.web.access.intercept.FilterSecurityInterceptor@6c38f4de]
2026-09-24 12:31:48,914 INFO  org.springframework.boot.web.embedded.tomcat.TomcatWebServer : Tomcat started on port(s): 8080 (http) with context path ''
2026-09-24 12:31:48,917 INFO  br.gov.caixa.sicbp.infracomponentes.spring.listeners.SpringDefaultContextListener : SpringContextListener: Iniciando no ambiente -> [development]
2026-09-24 12:31:48,982 INFO  br.gov.caixa.sicbp.apitrilha.RunApplication : Started RunApplication in 20.79 seconds (JVM running for 27.842)
2026-09-24 12:31:54.127-03:00 WARN  c.a.m.o.a.i.p.TelemetryPipeline - Sending telemetry to the ingestion service (retry from disk): failure when writing TLS control frames (https://brazilsoutheast-0.in.applicationinsights.azure.com/v2.1/track) (will be retried again) (future warnings will be aggregated and logged once every 5 minutes)
javax.net.ssl.SSLException: failure when writing TLS control frames
	at io.netty.handler.ssl.SslHandler.setHandshakeFailureTransportFailure(SslHandler.java:2042)
	at io.netty.handler.ssl.SslHandler.lambda$wrapNonAppData$1(SslHandler.java:1008)
	at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:604)
	at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:571)
	at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:506)
	at io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:650)
	at io.netty.util.concurrent.DefaultPromise.setFailure0(DefaultPromise.java:643)
	at io.netty.util.concurrent.DefaultPromise.tryFailure(DefaultPromise.java:132)
	at io.netty.channel.PendingWriteQueue.safeFail(PendingWriteQueue.java:298)
	at io.netty.channel.PendingWriteQueue.removeAndFailAll(PendingWriteQueue.java:196)
	at io.netty.handler.proxy.ProxyHandler.failPendingWrites(ProxyHandler.java:433)
	at io.netty.handler.proxy.ProxyHandler.failPendingWritesAndClose(ProxyHandler.java:350)
	at io.netty.handler.proxy.ProxyHandler.setConnectFailure(ProxyHandler.java:345)
	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:265)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:355)
	at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:434)
	at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:361)
	at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:325)
	at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:249)
	at io.netty.handler.proxy.HttpProxyHandler$HttpClientCodecWrapper.channelRead(HttpProxyHandler.java:304)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1429)
	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:918)
	at io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe.epollInReady(AbstractEpollStreamChannel.java:804)
	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe.epollRdHupReady(AbstractEpollChannel.java:524)
	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe.handle(AbstractEpollChannel.java:494)
	at io.netty.channel.epoll.EpollIoHandler$DefaultEpollIoRegistration.handle(EpollIoHandler.java:349)
	at io.netty.channel.epoll.EpollIoHandler.processReady(EpollIoHandler.java:548)
	at io.netty.channel.epoll.EpollIoHandler.run(EpollIoHandler.java:491)
	at io.netty.channel.SingleThreadIoEventLoop.runIo(SingleThreadIoEventLoop.java:225)
	at io.netty.channel.SingleThreadIoEventLoop.run(SingleThreadIoEventLoop.java:196)
	at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:1204)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.65:80 => brazilsoutheast-0.in.applicationinsights.azure.com/<unresolved>:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
	at io.netty.handler.proxy.HttpProxyHandler.handleResponse(HttpProxyHandler.java:232)
	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:256)
	... 21 common frames omitted
2026-09-24 12:32:24.024-03:00 WARN  c.a.m.o.a.i.p.TelemetryPipeline - Sending telemetry to the ingestion service (retry from disk): failure when writing TLS control frames (https://brazilsoutheast-0.in.applicationinsights.azure.com/v2.1/track) (will be retried again) (future warnings will be aggregated and logged once every 5 minutes)
javax.net.ssl.SSLException: failure when writing TLS control frames
	at io.netty.handler.ssl.SslHandler.setHandshakeFailureTransportFailure(SslHandler.java:2042)
	at io.netty.handler.ssl.SslHandler.lambda$wrapNonAppData$1(SslHandler.java:1008)
	at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:604)
	at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:571)
	at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:506)
	at io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:650)
	at io.netty.util.concurrent.DefaultPromise.setFailure0(DefaultPromise.java:643)
	at io.netty.util.concurrent.DefaultPromise.tryFailure(DefaultPromise.java:132)
	at io.netty.channel.PendingWriteQueue.safeFail(PendingWriteQueue.java:298)
	at io.netty.channel.PendingWriteQueue.removeAndFailAll(PendingWriteQueue.java:196)
	at io.netty.handler.proxy.ProxyHandler.failPendingWrites(ProxyHandler.java:433)
	at io.netty.handler.proxy.ProxyHandler.failPendingWritesAndClose(ProxyHandler.java:350)
	at io.netty.handler.proxy.ProxyHandler.setConnectFailure(ProxyHandler.java:345)
	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:265)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:355)
	at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:434)
	at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:361)
	at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:325)
	at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:249)
	at io.netty.handler.proxy.HttpProxyHandler$HttpClientCodecWrapper.channelRead(HttpProxyHandler.java:304)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1429)
	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:918)
	at io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe.epollInReady(AbstractEpollStreamChannel.java:804)
	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe.handle(AbstractEpollChannel.java:487)
	at io.netty.channel.epoll.EpollIoHandler$DefaultEpollIoRegistration.handle(EpollIoHandler.java:349)
	at io.netty.channel.epoll.EpollIoHandler.processReady(EpollIoHandler.java:548)
	at io.netty.channel.epoll.EpollIoHandler.run(EpollIoHandler.java:491)
	at io.netty.channel.SingleThreadIoEventLoop.runIo(SingleThreadIoEventLoop.java:225)
	at io.netty.channel.SingleThreadIoEventLoop.run(SingleThreadIoEventLoop.java:196)
	at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:1204)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.65:80 => brazilsoutheast-0.in.applicationinsights.azure.com/<unresolved>:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
	at io.netty.handler.proxy.HttpProxyHandler.handleResponse(HttpProxyHandler.java:232)
	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:256)
	... 20 common frames omitted
2026-09-24 12:32:25,502 INFO  org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/] : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-09-24 12:32:25,503 INFO  org.springframework.web.servlet.DispatcherServlet : Initializing Servlet 'dispatcherServlet'
2026-09-24 12:32:25,504 INFO  org.springframework.web.servlet.DispatcherServlet : Completed initialization in 1 ms
2026-09-24 12:36:29.810-03:00 WARN  c.m.a.a.i.t.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following operation has failed 9 times (out of 9): Retrieving appId:
 * exception sending request to https://brazilsoutheast-0.in.applicationinsights.azure.com/api/profiles/b0142390-50c9-495e-85b4-7b2ade8fc1cf/appId (9 times)
2026-09-24 12:36:54.128-03:00 WARN  c.a.m.o.a.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 9 times (out of 9): Sending telemetry to the ingestion service (retry from disk):
 * failure when writing TLS control frames (https://brazilsoutheast-0.in.applicationinsights.azure.com/v2.1/track) (will be retried again) (9 times)
2026-09-24 12:37:24.025-03:00 WARN  c.a.m.o.a.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 9 times (out of 9): Sending telemetry to the ingestion service (retry from disk):
 * failure when writing TLS control frames (https://brazilsoutheast-0.in.applicationinsights.azure.com/v2.1/track) (will be retried again) (9 times)
2026-09-24 12:38:27,612 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Localizando a Chave pública de API no contexto da aplicação.
2026-09-24 12:38:27,612 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Chave de API não localizada no contexto da aplicação. Pesquisando na nuvem.
2026-09-24 12:38:27,819 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Setando a chave pública de API no escopo de aplicação...
2026-09-24 12:38:27,819 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Chave pública de API salva no escopo de aplicação...
2026-09-24 12:38:27,819 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Chave de API recuperada e retornada.
2026-09-24 12:38:27,819 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Verificando o kid do token e do json de chave pública.
2026-09-24 12:38:27,819 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Tipo de chave RSA.
Hibernate: select rota0_.nu_sequencial_rota as nu_sequencial_rota1_1_, rota0_.de_rota as de_rota2_1_, rota0_.de_endereco_rota as de_endereco_rota3_1_, rota0_.no_rota as no_rota4_1_ from cbp.cbptb015_rota_menu_dinamico rota0_ where rota0_.no_rota=?
Hibernate: select cbp.cbpsq012_nu_trilha_auditoria.nextval from dual
Hibernate: insert into cbp.cbptb012_trilha_auditoria (ts_execucao_acao_usuario, de_envio_transacao_trilha, de_retorno_transacao_trilha, de_transacao, ic_identificacao_cliente, de_instancia_servidor, co_ip_terminal_usuario, nu_nsu_transacao, nu_canal_cmcco_convenio, nu_conta_cliente, nu_convenio, nu_dv_convenio, nu_identificacao_cliente, nu_natural_conta_cliente, nu_produto_conta_cliente, nu_unidade_conta_cliente, nu_unidade_sprna_regional, nu_unidade_vncco_convenio, co_retorno_transacao, nu_sequencial_rota, ic_status_retorno_transacao, qt_tempo_retorno_transacao, nu_cpf_usuario, vr_transacao, co_versao_sistema, nu_trilha_auditoria) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
2026-09-24 12:38:28,687 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Localizando a Chave pública de API no contexto da aplicação.
2026-09-24 12:38:28,687 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Chave de API recuperada e retornada.
2026-09-24 12:38:28,687 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Verificando o kid do token e do json de chave pública.
2026-09-24 12:38:28,687 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Tipo de chave RSA.
Hibernate: select rota0_.nu_sequencial_rota as nu_sequencial_rota1_1_, rota0_.de_rota as de_rota2_1_, rota0_.de_endereco_rota as de_endereco_rota3_1_, rota0_.no_rota as no_rota4_1_ from cbp.cbptb015_rota_menu_dinamico rota0_ where rota0_.no_rota=?
Hibernate: select cbp.cbpsq012_nu_trilha_auditoria.nextval from dual
Hibernate: insert into cbp.cbptb012_trilha_auditoria (ts_execucao_acao_usuario, de_envio_transacao_trilha, de_retorno_transacao_trilha, de_transacao, ic_identificacao_cliente, de_instancia_servidor, co_ip_terminal_usuario, nu_nsu_transacao, nu_canal_cmcco_convenio, nu_conta_cliente, nu_convenio, nu_dv_convenio, nu_identificacao_cliente, nu_natural_conta_cliente, nu_produto_conta_cliente, nu_unidade_conta_cliente, nu_unidade_sprna_regional, nu_unidade_vncco_convenio, co_retorno_transacao, nu_sequencial_rota, ic_status_retorno_transacao, qt_tempo_retorno_transacao, nu_cpf_usuario, vr_transacao, co_versao_sistema, nu_trilha_auditoria) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
2026-09-24 12:38:28,718 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Localizando a Chave pública de API no contexto da aplicação.
2026-09-24 12:38:28,718 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Chave de API recuperada e retornada.
2026-09-24 12:38:28,719 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Verificando o kid do token e do json de chave pública.
2026-09-24 12:38:28,719 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Tipo de chave RSA.
Hibernate: select rota0_.nu_sequencial_rota as nu_sequencial_rota1_1_, rota0_.de_rota as de_rota2_1_, rota0_.de_endereco_rota as de_endereco_rota3_1_, rota0_.no_rota as no_rota4_1_ from cbp.cbptb015_rota_menu_dinamico rota0_ where rota0_.no_rota=?
Hibernate: select cbp.cbpsq012_nu_trilha_auditoria.nextval from dual
Hibernate: insert into cbp.cbptb012_trilha_auditoria (ts_execucao_acao_usuario, de_envio_transacao_trilha, de_retorno_transacao_trilha, de_transacao, ic_identificacao_cliente, de_instancia_servidor, co_ip_terminal_usuario, nu_nsu_transacao, nu_canal_cmcco_convenio, nu_conta_cliente, nu_convenio, nu_dv_convenio, nu_identificacao_cliente, nu_natural_conta_cliente, nu_produto_conta_cliente, nu_unidade_conta_cliente, nu_unidade_sprna_regional, nu_unidade_vncco_convenio, co_retorno_transacao, nu_sequencial_rota, ic_status_retorno_transacao, qt_tempo_retorno_transacao, nu_cpf_usuario, vr_transacao, co_versao_sistema, nu_trilha_auditoria) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
2026-09-24 12:38:29,074 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Localizando a Chave pública de API no contexto da aplicação.
2026-09-24 12:38:29,074 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Chave de API recuperada e retornada.
2026-09-24 12:38:29,074 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Verificando o kid do token e do json de chave pública.
2026-09-24 12:38:29,074 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Tipo de chave RSA.
Hibernate: select rota0_.nu_sequencial_rota as nu_sequencial_rota1_1_, rota0_.de_rota as de_rota2_1_, rota0_.de_endereco_rota as de_endereco_rota3_1_, rota0_.no_rota as no_rota4_1_ from cbp.cbptb015_rota_menu_dinamico rota0_ where rota0_.no_rota=?
Hibernate: select cbp.cbpsq012_nu_trilha_auditoria.nextval from dual
Hibernate: insert into cbp.cbptb012_trilha_auditoria (ts_execucao_acao_usuario, de_envio_transacao_trilha, de_retorno_transacao_trilha, de_transacao, ic_identificacao_cliente, de_instancia_servidor, co_ip_terminal_usuario, nu_nsu_transacao, nu_canal_cmcco_convenio, nu_conta_cliente, nu_convenio, nu_dv_convenio, nu_identificacao_cliente, nu_natural_conta_cliente, nu_produto_conta_cliente, nu_unidade_conta_cliente, nu_unidade_sprna_regional, nu_unidade_vncco_convenio, co_retorno_transacao, nu_sequencial_rota, ic_status_retorno_transacao, qt_tempo_retorno_transacao, nu_cpf_usuario, vr_transacao, co_versao_sistema, nu_trilha_auditoria) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
2026-09-24 12:38:29,121 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Localizando a Chave pública de API no contexto da aplicação.
2026-09-24 12:38:29,121 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Chave de API recuperada e retornada.
2026-09-24 12:38:29,121 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Verificando o kid do token e do json de chave pública.
2026-09-24 12:38:29,121 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Tipo de chave RSA.
Hibernate: select rota0_.nu_sequencial_rota as nu_sequencial_rota1_1_, rota0_.de_rota as de_rota2_1_, rota0_.de_endereco_rota as de_endereco_rota3_1_, rota0_.no_rota as no_rota4_1_ from cbp.cbptb015_rota_menu_dinamico rota0_ where rota0_.no_rota=?
Hibernate: select cbp.cbpsq012_nu_trilha_auditoria.nextval from dual
Hibernate: insert into cbp.cbptb012_trilha_auditoria (ts_execucao_acao_usuario, de_envio_transacao_trilha, de_retorno_transacao_trilha, de_transacao, ic_identificacao_cliente, de_instancia_servidor, co_ip_terminal_usuario, nu_nsu_transacao, nu_canal_cmcco_convenio, nu_conta_cliente, nu_convenio, nu_dv_convenio, nu_identificacao_cliente, nu_natural_conta_cliente, nu_produto_conta_cliente, nu_unidade_conta_cliente, nu_unidade_sprna_regional, nu_unidade_vncco_convenio, co_retorno_transacao, nu_sequencial_rota, ic_status_retorno_transacao, qt_tempo_retorno_transacao, nu_cpf_usuario, vr_transacao, co_versao_sistema, nu_trilha_auditoria) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
2026-09-24 12:38:29,185 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Localizando a Chave pública de API no contexto da aplicação.
2026-09-24 12:38:29,185 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Chave de API recuperada e retornada.
2026-09-24 12:38:29,185 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Verificando o kid do token e do json de chave pública.
2026-09-24 12:38:29,185 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Tipo de chave RSA.
Hibernate: select rota0_.nu_sequencial_rota as nu_sequencial_rota1_1_, rota0_.de_rota as de_rota2_1_, rota0_.de_endereco_rota as de_endereco_rota3_1_, rota0_.no_rota as no_rota4_1_ from cbp.cbptb015_rota_menu_dinamico rota0_ where rota0_.no_rota=?
Hibernate: select cbp.cbpsq012_nu_trilha_auditoria.nextval from dual
2026-09-24 12:38:29,196 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Localizando a Chave pública de API no contexto da aplicação.
2026-09-24 12:38:29,196 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Chave de API recuperada e retornada.
2026-09-24 12:38:29,196 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Verificando o kid do token e do json de chave pública.
2026-09-24 12:38:29,196 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Tipo de chave RSA.
Hibernate: insert into cbp.cbptb012_trilha_auditoria (ts_execucao_acao_usuario, de_envio_transacao_trilha, de_retorno_transacao_trilha, de_transacao, ic_identificacao_cliente, de_instancia_servidor, co_ip_terminal_usuario, nu_nsu_transacao, nu_canal_cmcco_convenio, nu_conta_cliente, nu_convenio, nu_dv_convenio, nu_identificacao_cliente, nu_natural_conta_cliente, nu_produto_conta_cliente, nu_unidade_conta_cliente, nu_unidade_sprna_regional, nu_unidade_vncco_convenio, co_retorno_transacao, nu_sequencial_rota, ic_status_retorno_transacao, qt_tempo_retorno_transacao, nu_cpf_usuario, vr_transacao, co_versao_sistema, nu_trilha_auditoria) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
Hibernate: select rota0_.nu_sequencial_rota as nu_sequencial_rota1_1_, rota0_.de_rota as de_rota2_1_, rota0_.de_endereco_rota as de_endereco_rota3_1_, rota0_.no_rota as no_rota4_1_ from cbp.cbptb015_rota_menu_dinamico rota0_ where rota0_.no_rota=?
Hibernate: select cbp.cbpsq012_nu_trilha_auditoria.nextval from dual
Hibernate: insert into cbp.cbptb012_trilha_auditoria (ts_execucao_acao_usuario, de_envio_transacao_trilha, de_retorno_transacao_trilha, de_transacao, ic_identificacao_cliente, de_instancia_servidor, co_ip_terminal_usuario, nu_nsu_transacao, nu_canal_cmcco_convenio, nu_conta_cliente, nu_convenio, nu_dv_convenio, nu_identificacao_cliente, nu_natural_conta_cliente, nu_produto_conta_cliente, nu_unidade_conta_cliente, nu_unidade_sprna_regional, nu_unidade_vncco_convenio, co_retorno_transacao, nu_sequencial_rota, ic_status_retorno_transacao, qt_tempo_retorno_transacao, nu_cpf_usuario, vr_transacao, co_versao_sistema, nu_trilha_auditoria) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
2026-09-24 12:38:29,292 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Localizando a Chave pública de API no contexto da aplicação.
2026-09-24 12:38:29,292 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Chave de API recuperada e retornada.
2026-09-24 12:38:29,292 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Verificando o kid do token e do json de chave pública.
2026-09-24 12:38:29,292 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Tipo de chave RSA.
Hibernate: select rota0_.nu_sequencial_rota as nu_sequencial_rota1_1_, rota0_.de_rota as de_rota2_1_, rota0_.de_endereco_rota as de_endereco_rota3_1_, rota0_.no_rota as no_rota4_1_ from cbp.cbptb015_rota_menu_dinamico rota0_ where rota0_.no_rota=?
Hibernate: select cbp.cbpsq012_nu_trilha_auditoria.nextval from dual
Hibernate: insert into cbp.cbptb012_trilha_auditoria (ts_execucao_acao_usuario, de_envio_transacao_trilha, de_retorno_transacao_trilha, de_transacao, ic_identificacao_cliente, de_instancia_servidor, co_ip_terminal_usuario, nu_nsu_transacao, nu_canal_cmcco_convenio, nu_conta_cliente, nu_convenio, nu_dv_convenio, nu_identificacao_cliente, nu_natural_conta_cliente, nu_produto_conta_cliente, nu_unidade_conta_cliente, nu_unidade_sprna_regional, nu_unidade_vncco_convenio, co_retorno_transacao, nu_sequencial_rota, ic_status_retorno_transacao, qt_tempo_retorno_transacao, nu_cpf_usuario, vr_transacao, co_versao_sistema, nu_trilha_auditoria) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
2026-09-24 12:38:29,531 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Localizando a Chave pública de API no contexto da aplicação.
2026-09-24 12:38:29,532 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Chave de API recuperada e retornada.
2026-09-24 12:38:29,532 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Verificando o kid do token e do json de chave pública.
2026-09-24 12:38:29,532 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Tipo de chave RSA.
Hibernate: select rota0_.nu_sequencial_rota as nu_sequencial_rota1_1_, rota0_.de_rota as de_rota2_1_, rota0_.de_endereco_rota as de_endereco_rota3_1_, rota0_.no_rota as no_rota4_1_ from cbp.cbptb015_rota_menu_dinamico rota0_ where rota0_.no_rota=?
Hibernate: select cbp.cbpsq012_nu_trilha_auditoria.nextval from dual
Hibernate: insert into cbp.cbptb012_trilha_auditoria (ts_execucao_acao_usuario, de_envio_transacao_trilha, de_retorno_transacao_trilha, de_transacao, ic_identificacao_cliente, de_instancia_servidor, co_ip_terminal_usuario, nu_nsu_transacao, nu_canal_cmcco_convenio, nu_conta_cliente, nu_convenio, nu_dv_convenio, nu_identificacao_cliente, nu_natural_conta_cliente, nu_produto_conta_cliente, nu_unidade_conta_cliente, nu_unidade_sprna_regional, nu_unidade_vncco_convenio, co_retorno_transacao, nu_sequencial_rota, ic_status_retorno_transacao, qt_tempo_retorno_transacao, nu_cpf_usuario, vr_transacao, co_versao_sistema, nu_trilha_auditoria) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
2026-09-24 12:38:29,558 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Localizando a Chave pública de API no contexto da aplicação.
2026-09-24 12:38:29,558 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Chave de API recuperada e retornada.
2026-09-24 12:38:29,558 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Verificando o kid do token e do json de chave pública.
2026-09-24 12:38:29,559 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Tipo de chave RSA.
2026-09-24 12:38:29,562 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Localizando a Chave pública de API no contexto da aplicação.
2026-09-24 12:38:29,563 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Chave de API recuperada e retornada.
2026-09-24 12:38:29,563 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Verificando o kid do token e do json de chave pública.
2026-09-24 12:38:29,563 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Tipo de chave RSA.
Hibernate: select rota0_.nu_sequencial_rota as nu_sequencial_rota1_1_, rota0_.de_rota as de_rota2_1_, rota0_.de_endereco_rota as de_endereco_rota3_1_, rota0_.no_rota as no_rota4_1_ from cbp.cbptb015_rota_menu_dinamico rota0_ where rota0_.no_rota=?
Hibernate: select cbp.cbpsq012_nu_trilha_auditoria.nextval from dual
Hibernate: select rota0_.nu_sequencial_rota as nu_sequencial_rota1_1_, rota0_.de_rota as de_rota2_1_, rota0_.de_endereco_rota as de_endereco_rota3_1_, rota0_.no_rota as no_rota4_1_ from cbp.cbptb015_rota_menu_dinamico rota0_ where rota0_.no_rota=?
Hibernate: insert into cbp.cbptb012_trilha_auditoria (ts_execucao_acao_usuario, de_envio_transacao_trilha, de_retorno_transacao_trilha, de_transacao, ic_identificacao_cliente, de_instancia_servidor, co_ip_terminal_usuario, nu_nsu_transacao, nu_canal_cmcco_convenio, nu_conta_cliente, nu_convenio, nu_dv_convenio, nu_identificacao_cliente, nu_natural_conta_cliente, nu_produto_conta_cliente, nu_unidade_conta_cliente, nu_unidade_sprna_regional, nu_unidade_vncco_convenio, co_retorno_transacao, nu_sequencial_rota, ic_status_retorno_transacao, qt_tempo_retorno_transacao, nu_cpf_usuario, vr_transacao, co_versao_sistema, nu_trilha_auditoria) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
Hibernate: select cbp.cbpsq012_nu_trilha_auditoria.nextval from dual
Hibernate: insert into cbp.cbptb012_trilha_auditoria (ts_execucao_acao_usuario, de_envio_transacao_trilha, de_retorno_transacao_trilha, de_transacao, ic_identificacao_cliente, de_instancia_servidor, co_ip_terminal_usuario, nu_nsu_transacao, nu_canal_cmcco_convenio, nu_conta_cliente, nu_convenio, nu_dv_convenio, nu_identificacao_cliente, nu_natural_conta_cliente, nu_produto_conta_cliente, nu_unidade_conta_cliente, nu_unidade_sprna_regional, nu_unidade_vncco_convenio, co_retorno_transacao, nu_sequencial_rota, ic_status_retorno_transacao, qt_tempo_retorno_transacao, nu_cpf_usuario, vr_transacao, co_versao_sistema, nu_trilha_auditoria) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
2026-09-24 12:38:29,702 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Localizando a Chave pública de API no contexto da aplicação.
2026-09-24 12:38:29,702 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Chave de API recuperada e retornada.
2026-09-24 12:38:29,702 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Verificando o kid do token e do json de chave pública.
2026-09-24 12:38:29,702 INFO  br.gov.caixa.sicbp.infracomponentes.token.service.ChavePublicaService : Tipo de chave RSA.
Hibernate: select rota0_.nu_sequencial_rota as nu_sequencial_rota1_1_, rota0_.de_rota as de_rota2_1_, rota0_.de_endereco_rota as de_endereco_rota3_1_, rota0_.no_rota as no_rota4_1_ from cbp.cbptb015_rota_menu_dinamico rota0_ where rota0_.no_rota=?
Hibernate: select cbp.cbpsq012_nu_trilha_auditoria.nextval from dual
Hibernate: insert into cbp.cbptb012_trilha_auditoria (ts_execucao_acao_usuario, de_envio_transacao_trilha, de_retorno_transacao_trilha, de_transacao, ic_identificacao_cliente, de_instancia_servidor, co_ip_terminal_usuario, nu_nsu_transacao, nu_canal_cmcco_convenio, nu_conta_cliente, nu_convenio, nu_dv_convenio, nu_identificacao_cliente, nu_natural_conta_cliente, nu_produto_conta_cliente, nu_unidade_conta_cliente, nu_unidade_sprna_regional, nu_unidade_vncco_convenio, co_retorno_transacao, nu_sequencial_rota, ic_status_retorno_transacao, qt_tempo_retorno_transacao, nu_cpf_usuario, vr_transacao, co_versao_sistema, nu_trilha_auditoria) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
