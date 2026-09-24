exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sicbp-trilha-api -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sicbp-trilha-api -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/api-trilha.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-24 12:20:42.913-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.7.10 started successfully (PID 8, JVM running for 8.874 s)
2026-09-24 12:20:42.918-03:00 INFO  c.m.applicationinsights.agent - Java version: 17.0.7, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-17-openjdk-17.0.7.0.7-3.el8.x86_64
2026-09-24 12:20:45.527-03:00 WARN  c.m.a.a.i.t.AppIdSupplier$GetAppIdTask - Retrieving appId: exception sending request to https://brazilsoutheast-0.in.applicationinsights.azure.com/api/profiles/b0142390-50c9-495e-85b4-7b2ade8fc1cf/appId (future warnings will be aggregated and logged once every 5 minutes)
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
Caused by: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => brazilsoutheast-0.in.applicationinsights.azure.com/<unresolved>:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
	at io.netty.handler.proxy.HttpProxyHandler.handleResponse(HttpProxyHandler.java:232)
	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:256)
	... 21 common frames omitted
2026-09-24 12:20:45.812-03:00 WARN  i.o.j.s.i.a.i.c.i.SelectorConfig - The otel.instrumentation.logback-appender.experimental.capture-mdc-attributes setting and the equivalent declarative configuration property are deprecated and may be removed in the next minor release. Use otel.instrumentation.logback-appender.experimental.mdc-attributes.included or equivalent declarative configuration instead.

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.7.7)

2026-09-24 12:20:46,430 INFO  br.gov.caixa.sicbp.apitrilha.RunApplication : Starting RunApplication v0.0.0.26 using Java 17.0.7 on sicbp-trilha-api-des-57-kzpwr with PID 8 (/deployments/api-trilha.jar started by 1001 in /deployments)
2026-09-24 12:20:46,445 INFO  br.gov.caixa.sicbp.apitrilha.RunApplication : The following 1 profile is active: "development"
2026-09-24 12:20:50,134 INFO  org.springframework.data.repository.config.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-09-24 12:20:50,246 INFO  org.springframework.data.repository.config.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 102 ms. Found 2 JPA repository interfaces.
2026-09-24 12:20:51,007 INFO  org.springframework.cloud.context.scope.GenericScope : BeanFactory id=dc4b8c9f-3d25-3a8d-b6e8-17c006ca5e29
2026-09-24 12:20:52,633 INFO  org.springframework.boot.web.embedded.tomcat.TomcatWebServer : Tomcat initialized with port(s): 8080 (http)
2026-09-24 12:20:52,714 INFO  org.apache.catalina.core.StandardService : Starting service [Tomcat]
2026-09-24 12:20:52,714 INFO  org.apache.catalina.core.StandardEngine : Starting Servlet engine: [Apache Tomcat/9.0.70]
2026-09-24 12:20:52,828 INFO  org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/] : Initializing Spring embedded WebApplicationContext
2026-09-24 12:20:52,829 INFO  org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 6201 ms
2026-09-24 12:20:54,113 INFO  io.micrometer.core.instrument.push.PushMeterRegistry : publishing metrics for AzureMonitorMeterRegistry every 1m
2026-09-24 12:20:56,316 INFO  com.zaxxer.hikari.HikariDataSource : hikari-dev-pool-api-trilha - Starting...
2026-09-24 12:20:57,740 INFO  com.zaxxer.hikari.HikariDataSource : hikari-dev-pool-api-trilha - Start completed.
2026-09-24 12:20:58.026-03:00 WARN  i.o.j.s.i.a.i.c.i.SelectorConfig - The otel.instrumentation.log4j-appender.experimental.capture-map-message-attributes setting and the equivalent declarative configuration property are deprecated and may be removed in the next minor release. Use otel.instrumentation.log4j-appender.experimental.map-message-attributes.included or equivalent declarative configuration instead.
2026-09-24 12:20:58.027-03:00 WARN  i.o.j.s.i.a.i.c.i.SelectorConfig - The otel.instrumentation.log4j-appender.experimental.capture-mdc-attributes setting and the equivalent declarative configuration property are deprecated and may be removed in the next minor release. Use otel.instrumentation.log4j-appender.experimental.mdc-attributes.included or equivalent declarative configuration instead.
2026-09-24 12:20:58,039 INFO  org.hibernate.jpa.internal.util.LogHelper : HHH000204: Processing PersistenceUnitInfo [name: default]
2026-09-24 12:20:58,236 INFO  org.hibernate.Version : HHH000412: Hibernate ORM core version 5.6.14.Final
2026-09-24 12:20:58,748 INFO  org.hibernate.annotations.common.Version : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2026-09-24 12:20:59,125 INFO  org.hibernate.dialect.Dialect : HHH000400: Using dialect: org.hibernate.dialect.Oracle12cDialect
2026-09-24 12:21:01,537 INFO  org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2026-09-24 12:21:01,550 INFO  org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-09-24 12:21:06,032 INFO  org.springframework.boot.actuate.endpoint.web.EndpointLinksResolver : Exposing 1 endpoint(s) beneath base path '/actuator'
2026-09-24 12:21:06,044 INFO  org.springframework.security.web.DefaultSecurityFilterChain : Will secure any request with [org.springframework.security.web.session.DisableEncodeUrlFilter@2af781f3, org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter@106a6a1b, org.springframework.security.web.context.SecurityContextPersistenceFilter@299003eb, org.springframework.security.web.header.HeaderWriterFilter@5c658163, org.springframework.web.filter.CorsFilter@4b7272d6, org.springframework.security.web.authentication.logout.LogoutFilter@78e3bebd, br.gov.caixa.sicbp.infracomponentes.request.filter.ApiSecurityFilter@40d10264, org.springframework.security.web.savedrequest.RequestCacheAwareFilter@59d99269, org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter@48332a63, org.springframework.security.web.authentication.AnonymousAuthenticationFilter@21845b36, org.springframework.security.web.session.SessionManagementFilter@7625bfbd, org.springframework.security.web.access.ExceptionTranslationFilter@5572be5a, org.springframework.security.web.access.intercept.FilterSecurityInterceptor@5b8e2ea7]
2026-09-24 12:21:06,446 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-24 12:21:07,013 INFO  org.springframework.boot.web.embedded.tomcat.TomcatWebServer : Tomcat started on port(s): 8080 (http) with context path ''
2026-09-24 12:21:07,016 INFO  br.gov.caixa.sicbp.infracomponentes.spring.listeners.SpringDefaultContextListener : SpringContextListener: Iniciando no ambiente -> [development]
2026-09-24 12:21:07,025 INFO  br.gov.caixa.sicbp.apitrilha.RunApplication : Started RunApplication in 23.297 seconds (JVM running for 32.988)
2026-09-24 12:21:09.458-03:00 WARN  c.a.m.o.a.i.p.TelemetryPipeline - Sending telemetry to the ingestion service (retry from disk): failure when writing TLS control frames (https://brazilsoutheast-0.in.applicationinsights.azure.com/v2.1/track) (will be retried again) (future warnings will be aggregated and logged once every 5 minutes)
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
Caused by: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => brazilsoutheast-0.in.applicationinsights.azure.com/<unresolved>:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
	at io.netty.handler.proxy.HttpProxyHandler.handleResponse(HttpProxyHandler.java:232)
	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:256)
	... 20 common frames omitted
2026-09-24 12:21:09.734-03:00 WARN  c.a.m.o.a.i.p.TelemetryPipeline - Sending telemetry to the ingestion service (retry from disk): failure when writing TLS control frames (https://brazilsoutheast-0.in.applicationinsights.azure.com/v2.1/track) (will be retried again) (future warnings will be aggregated and logged once every 5 minutes)
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
Caused by: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => brazilsoutheast-0.in.applicationinsights.azure.com/<unresolved>:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
	at io.netty.handler.proxy.HttpProxyHandler.handleResponse(HttpProxyHandler.java:232)
	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:256)
	... 21 common frames omitted
2026-09-24 12:21:21,225 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-24 12:21:21,225 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-24 12:21:35,651 INFO  org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/] : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-09-24 12:21:35,651 INFO  org.springframework.web.servlet.DispatcherServlet : Initializing Servlet 'dispatcherServlet'
2026-09-24 12:21:35,653 INFO  org.springframework.web.servlet.DispatcherServlet : Completed initialization in 2 ms
2026-09-24 12:21:36,250 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-24 12:21:36,307 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-24 12:21:52,389 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-24 12:21:52,390 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-24 12:22:11,659 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-24 12:22:11,660 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-24 12:22:34,835 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-24 12:22:34,836 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-24 12:23:04,997 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-24 12:23:04,997 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-24 12:23:45,023 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-24 12:23:45,023 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-24 12:24:37,685 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-24 12:24:37,685 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
