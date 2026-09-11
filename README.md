exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/SIABM-autenticacao-24horas.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-11 14:26:17.833-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.7.5 started successfully (PID 8, JVM running for 4.997 s)
2026-09-11 14:26:17.840-03:00 INFO  c.m.applicationinsights.agent - Java version: 17.0.7, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-17-openjdk-17.0.7.0.7-3.el8.x86_64
2026-09-11 14:26:20.343-03:00 WARN  c.m.a.a.i.t.AppIdSupplier$GetAppIdTask - Retrieving appId: exception sending request to https://brazilsoutheast-0.in.applicationinsights.azure.com/api/profiles/63baa68e-6551-4fb0-99db-52f8d1efd964/appId (future warnings will be aggregated and logged once every 5 minutes)
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
	at io.netty.handler.ssl.SslHandler.setHandshakeFailureTransportFailure(SslHandler.java:2075)
	at io.netty.handler.ssl.SslHandler.access$700(SslHandler.java:170)
	at io.netty.handler.ssl.SslHandler$2.operationComplete(SslHandler.java:1016)
	at io.netty.handler.ssl.SslHandler$2.operationComplete(SslHandler.java:1011)
	at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:603)
	at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:570)
	at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:505)
	at io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:649)
	at io.netty.util.concurrent.DefaultPromise.setFailure0(DefaultPromise.java:642)
	at io.netty.util.concurrent.DefaultPromise.tryFailure(DefaultPromise.java:131)
	at io.netty.channel.PendingWriteQueue.safeFail(PendingWriteQueue.java:298)
	at io.netty.channel.PendingWriteQueue.removeAndFailAll(PendingWriteQueue.java:196)
	at io.netty.handler.proxy.ProxyHandler.failPendingWrites(ProxyHandler.java:437)
	at io.netty.handler.proxy.ProxyHandler.failPendingWritesAndClose(ProxyHandler.java:354)
	at io.netty.handler.proxy.ProxyHandler.setConnectFailure(ProxyHandler.java:349)
	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:269)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:354)
	at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:434)
	at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:346)
	at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:318)
	at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:249)
	at io.netty.handler.proxy.HttpProxyHandler$HttpClientCodecWrapper.channelRead(HttpProxyHandler.java:284)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:356)
	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1429)
	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:918)
	at io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe.epollInReady(AbstractEpollStreamChannel.java:793)
	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe.epollRdHupReady(AbstractEpollChannel.java:519)
	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe.handle(AbstractEpollChannel.java:489)
	at io.netty.channel.epoll.EpollIoHandler$DefaultEpollIoRegistration.handle(EpollIoHandler.java:307)
	at io.netty.channel.epoll.EpollIoHandler.processReady(EpollIoHandler.java:489)
	at io.netty.channel.epoll.EpollIoHandler.run(EpollIoHandler.java:444)
	at io.netty.channel.SingleThreadIoEventLoop.runIo(SingleThreadIoEventLoop.java:207)
	at io.netty.channel.SingleThreadIoEventLoop.run(SingleThreadIoEventLoop.java:178)
	at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:1073)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 common frames omitted
Caused by: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.65:80 => brazilsoutheast-0.in.applicationinsights.azure.com/191.237.224.177:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
	at io.netty.handler.proxy.HttpProxyHandler.handleResponse(HttpProxyHandler.java:212)
	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:260)
	... 21 common frames omitted
2026-09-11 14:26:21.025-03:00 WARN  c.a.m.o.a.i.q.QuickPulsePingSender - Pinging live metrics endpoint: failure when writing TLS control frames (future warnings will be aggregated and logged once every 5 minutes)
javax.net.ssl.SSLException: failure when writing TLS control frames
	at io.netty.handler.ssl.SslHandler.setHandshakeFailureTransportFailure(SslHandler.java:2075)
	at io.netty.handler.ssl.SslHandler.access$700(SslHandler.java:170)
	at io.netty.handler.ssl.SslHandler$2.operationComplete(SslHandler.java:1016)
	at io.netty.handler.ssl.SslHandler$2.operationComplete(SslHandler.java:1011)
	at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:603)
	at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:570)
	at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:505)
	at io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:649)
	at io.netty.util.concurrent.DefaultPromise.setFailure0(DefaultPromise.java:642)
	at io.netty.util.concurrent.DefaultPromise.tryFailure(DefaultPromise.java:131)
	at io.netty.channel.PendingWriteQueue.safeFail(PendingWriteQueue.java:298)
	at io.netty.channel.PendingWriteQueue.removeAndFailAll(PendingWriteQueue.java:196)
	at io.netty.handler.proxy.ProxyHandler.failPendingWrites(ProxyHandler.java:437)
	at io.netty.handler.proxy.ProxyHandler.failPendingWritesAndClose(ProxyHandler.java:354)
	at io.netty.handler.proxy.ProxyHandler.setConnectFailure(ProxyHandler.java:349)
	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:269)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:354)
	at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:434)
	at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:346)
	at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:318)
	at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:249)
	at io.netty.handler.proxy.HttpProxyHandler$HttpClientCodecWrapper.channelRead(HttpProxyHandler.java:284)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:356)
	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1429)
	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:918)
	at io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe.epollInReady(AbstractEpollStreamChannel.java:793)
	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe.epollRdHupReady(AbstractEpollChannel.java:519)
	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe.handle(AbstractEpollChannel.java:489)
	at io.netty.channel.epoll.EpollIoHandler$DefaultEpollIoRegistration.handle(EpollIoHandler.java:307)
	at io.netty.channel.epoll.EpollIoHandler.processReady(EpollIoHandler.java:489)
	at io.netty.channel.epoll.EpollIoHandler.run(EpollIoHandler.java:444)
	at io.netty.channel.SingleThreadIoEventLoop.runIo(SingleThreadIoEventLoop.java:207)
	at io.netty.channel.SingleThreadIoEventLoop.run(SingleThreadIoEventLoop.java:178)
	at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:1073)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.65:80 => brazilsoutheast.livediagnostics.monitor.azure.com/20.206.0.196:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
	at io.netty.handler.proxy.HttpProxyHandler.handleResponse(HttpProxyHandler.java:212)
	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:260)
	... 21 common frames omitted
{"version":"1.1","short_message":"Starting SiabmAutenticacao24horasApplication v1.0.1.0 using Java 17.0.7 with PID 8 (/deployments/SIABM-autenticacao-24horas.jar started by 1001 in /deployments)","timestamp":1789147581.116,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"br.gov.caixa.SiabmAutenticacao24horasApplication"}
{"version":"1.1","short_message":"No active profile set, falling back to 1 default profile: \"default\"","timestamp":1789147581.144,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"br.gov.caixa.SiabmAutenticacao24horasApplication"}
{"version":"1.1","short_message":"Bootstrapping Spring Data JPA repositories in DEFAULT mode.","timestamp":1789147584.543,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"org.springframework.data.repository.config.RepositoryConfigurationDelegate"}
{"version":"1.1","short_message":"Finished Spring Data repository scanning in 196 ms. Found 19 JPA repository interfaces.","timestamp":1789147584.751,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"org.springframework.data.repository.config.RepositoryConfigurationDelegate"}
{"version":"1.1","short_message":"Tomcat initialized with port 8080 (http)","timestamp":1789147586.445,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"org.springframework.boot.web.embedded.tomcat.TomcatWebServer"}
{"version":"1.1","short_message":"Starting service [Tomcat]","timestamp":1789147586.522,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"org.apache.catalina.core.StandardService"}
{"version":"1.1","short_message":"Starting Servlet engine: [Apache Tomcat/10.1.55]","timestamp":1789147586.523,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"org.apache.catalina.core.StandardEngine"}
{"version":"1.1","short_message":"Initializing Spring embedded WebApplicationContext","timestamp":1789147586.633,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/siabm-autenticacao-24horas]"}
{"version":"1.1","short_message":"Root WebApplicationContext: initialization completed in 5314 ms","timestamp":1789147586.635,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext"}
{"version":"1.1","short_message":"publishing metrics for AzureMonitorMeterRegistry every 1m","timestamp":1789147586.831,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"io.micrometer.core.instrument.push.PushMeterRegistry"}
{"version":"1.1","short_message":"HHH000204: Processing PersistenceUnitInfo [name: default]","timestamp":1789147588.553,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"org.hibernate.jpa.internal.util.LogHelper"}
{"version":"1.1","short_message":"HHH000412: Hibernate ORM core version 6.6.53.Final","timestamp":1789147588.724,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"org.hibernate.Version"}
{"version":"1.1","short_message":"HHH000026: Second-level cache disabled","timestamp":1789147588.817,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"org.hibernate.cache.internal.RegionFactoryInitiator"}
{"version":"1.1","short_message":"No LoadTimeWeaver setup: ignoring JPA class transformer","timestamp":1789147589.446,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo"}
{"version":"1.1","short_message":"HikariPool-1 - Starting...","timestamp":1789147589.539,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"com.zaxxer.hikari.HikariDataSource"}
{"version":"1.1","short_message":"HikariPool-1 - Added connection oracle.jdbc.driver.T4CConnection@747b8f5c","timestamp":1789147590.967,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"com.zaxxer.hikari.pool.HikariPool"}
{"version":"1.1","short_message":"HikariPool-1 - Start completed.","timestamp":1789147590.970,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"com.zaxxer.hikari.HikariDataSource"}
{"version":"1.1","short_message":"HHH90000025: OracleDialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)","timestamp":1789147591.656,"level":4,"_level_name":"WARN","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"org.hibernate.orm.deprecation"}
{"version":"1.1","short_message":"HHH10001005: Database info:\n\tDatabase JDBC URL [Connecting through datasource 'HikariDataSource (HikariPool-1)']\n\tDatabase driver: undefined/unknown\n\tDatabase version: 19.22\n\tAutocommit mode: undefined/unknown\n\tIsolation level: undefined/unknown\n\tMinimum pool size: undefined/unknown\n\tMaximum pool size: undefined/unknown","timestamp":1789147591.947,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"org.hibernate.orm.connections.pooling"}
{"version":"1.1","short_message":"HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)","timestamp":1789147595.427,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator"}
{"version":"1.1","short_message":"Initialized JPA EntityManagerFactory for persistence unit 'default'","timestamp":1789147595.430,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean"}
{"version":"1.1","short_message":"Hibernate is in classpath; If applicable, HQL parser will be used.","timestamp":1789147596.620,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"org.springframework.data.jpa.repository.query.QueryEnhancerFactory"}
{"version":"1.1","short_message":"spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning","timestamp":1789147598.922,"level":4,"_level_name":"WARN","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration$JpaWebConfiguration"}
{"version":"1.1","short_message":"Exposing 1 endpoint beneath base path '/actuator'","timestamp":1789147599.530,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"org.springframework.boot.actuate.endpoint.web.EndpointLinksResolver"}
{"version":"1.1","short_message":"The cache 'mensagemSistema' is not recording statistics. No meters except 'cache.size' will be registered. Call 'Caffeine#recordStats()' prior to building the cache for metrics to be recorded.","timestamp":1789147600.648,"level":4,"_level_name":"WARN","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"io.micrometer.core.instrument.binder.cache.CaffeineCacheMetrics"}
{"version":"1.1","short_message":"Tomcat started on port 8080 (http) with context path '/siabm-autenticacao-24horas'","timestamp":1789147601.136,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"org.springframework.boot.web.embedded.tomcat.TomcatWebServer"}
{"version":"1.1","short_message":"Started SiabmAutenticacao24horasApplication in 21.934 seconds (process running for 28.317)","timestamp":1789147601.151,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"br.gov.caixa.SiabmAutenticacao24horasApplication"}
2026-09-11 14:26:45.778-03:00 WARN  c.a.m.o.a.i.p.TelemetryPipeline - Sending telemetry to the ingestion service (retry from disk): failure when writing TLS control frames (https://brazilsoutheast-0.in.applicationinsights.azure.com/v2.1/track) (will be retried again) (future warnings will be aggregated and logged once every 5 minutes)
javax.net.ssl.SSLException: failure when writing TLS control frames
	at io.netty.handler.ssl.SslHandler.setHandshakeFailureTransportFailure(SslHandler.java:2075)
	at io.netty.handler.ssl.SslHandler.access$700(SslHandler.java:170)
	at io.netty.handler.ssl.SslHandler$2.operationComplete(SslHandler.java:1016)
	at io.netty.handler.ssl.SslHandler$2.operationComplete(SslHandler.java:1011)
	at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:603)
	at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:570)
	at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:505)
	at io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:649)
	at io.netty.util.concurrent.DefaultPromise.setFailure0(DefaultPromise.java:642)
	at io.netty.util.concurrent.DefaultPromise.tryFailure(DefaultPromise.java:131)
	at io.netty.channel.PendingWriteQueue.safeFail(PendingWriteQueue.java:298)
	at io.netty.channel.PendingWriteQueue.removeAndFailAll(PendingWriteQueue.java:196)
	at io.netty.handler.proxy.ProxyHandler.failPendingWrites(ProxyHandler.java:437)
	at io.netty.handler.proxy.ProxyHandler.failPendingWritesAndClose(ProxyHandler.java:354)
	at io.netty.handler.proxy.ProxyHandler.setConnectFailure(ProxyHandler.java:349)
	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:269)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:354)
	at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:434)
	at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:346)
	at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:318)
	at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:249)
	at io.netty.handler.proxy.HttpProxyHandler$HttpClientCodecWrapper.channelRead(HttpProxyHandler.java:284)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:356)
	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1429)
	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:918)
	at io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe.epollInReady(AbstractEpollStreamChannel.java:793)
	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe.handle(AbstractEpollChannel.java:482)
	at io.netty.channel.epoll.EpollIoHandler$DefaultEpollIoRegistration.handle(EpollIoHandler.java:307)
	at io.netty.channel.epoll.EpollIoHandler.processReady(EpollIoHandler.java:489)
	at io.netty.channel.epoll.EpollIoHandler.run(EpollIoHandler.java:444)
	at io.netty.channel.SingleThreadIoEventLoop.runIo(SingleThreadIoEventLoop.java:207)
	at io.netty.channel.SingleThreadIoEventLoop.run(SingleThreadIoEventLoop.java:178)
	at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:1073)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.65:80 => brazilsoutheast-0.in.applicationinsights.azure.com/191.237.224.177:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
	at io.netty.handler.proxy.HttpProxyHandler.handleResponse(HttpProxyHandler.java:212)
	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:260)
	... 20 common frames omitted
{"version":"1.1","short_message":"Initializing Spring DispatcherServlet 'dispatcherServlet'","timestamp":1789147634.051,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"http-nio-0.0.0.0-8080-exec-1","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/siabm-autenticacao-24horas]","_trace_id":"175ffdc57b7ff1bbfbadee291686a182","_trace_flags":"01","_span_id":"4cc211d89f8d6a23"}
{"version":"1.1","short_message":"Initializing Servlet 'dispatcherServlet'","timestamp":1789147634.051,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"http-nio-0.0.0.0-8080-exec-1","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"org.springframework.web.servlet.DispatcherServlet","_trace_id":"175ffdc57b7ff1bbfbadee291686a182","_trace_flags":"01","_span_id":"4cc211d89f8d6a23"}
{"version":"1.1","short_message":"Completed initialization in 1 ms","timestamp":1789147634.053,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"http-nio-0.0.0.0-8080-exec-1","host":"SIABM-autenticacao-24horas","_service_version":"1.0.1.0","_log_logger":"org.springframework.web.servlet.DispatcherServlet","_trace_id":"175ffdc57b7ff1bbfbadee291686a182","_trace_flags":"01","_span_id":"4cc211d89f8d6a23"}
