exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.5.1.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-15 13:26:35.809-03:00 WARN  c.a.c.h.netty.implementation.Utility - The following Netty dependencies have versions that do not match the versions specified in the azure-core-http-netty pom.xml file. This may result in unexpected behavior. If your application runs without issue this message can be ignored, otherwise please update the Netty dependencies to match the versions specified in the pom.xml file. Versions found in runtime: 'io.netty:netty-common' version not found (expected: 4.1.101.Final),'io.netty:netty-handler' version not found (expected: 4.1.101.Final),'io.netty:netty-handler-proxy' version not found (expected: 4.1.101.Final),'io.netty:netty-buffer' version not found (expected: 4.1.101.Final),'io.netty:netty-codec' version not found (expected: 4.1.101.Final),'io.netty:netty-codec-http' version not found (expected: 4.1.101.Final),'io.netty:netty-codec-http2' version not found (expected: 4.1.101.Final)
2026-07-15 13:26:38.413-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.5.1 started successfully (PID 3, JVM running for 4.218 s)
2026-07-15 13:26:38.414-03:00 INFO  c.m.applicationinsights.agent - Java version: 17.0.7, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-17-openjdk-17.0.7.0.7-3.el8.x86_64
2026-07-15 13:26:43.898-03:00 WARN  c.m.a.a.i.p.PerformanceMonitoringService - INITIALISING JFR PROFILING SUBSYSTEM THIS FEATURE IS IN BETA
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-07-15 13:26:42,619 WARN  [io.qua.agr.run.AgroalConnectionConfigurer] (main) Agroal does not support detecting if a connection is still usable after an exception for database kind: db2
2026-07-15 13:26:56,494 INFO  [io.quarkus] (main) sispl-consulta-aposta-api 3.5.0.1 on JVM (powered by Quarkus 2.7.6.Final) started in 17.998s. Listening on: http://0.0.0.0:8080
2026-07-15 13:26:56,495 INFO  [io.quarkus] (main) Profile prod activated. 
2026-07-15 13:26:56,495 INFO  [io.quarkus] (main) Installed features: [agroal, cache, cdi, hibernate-orm, hibernate-orm-panache, hibernate-orm-rest-data-panache, hibernate-validator, loterias-api-exceptions, loterias-api-security, narayana-jta, oidc, rest-client, rest-client-jackson, resteasy, resteasy-jackson, security, smallrye-context-propagation, smallrye-health, smallrye-metrics, smallrye-openapi, swagger-ui, vertx]
2026-07-16 14:21:06,134 INFO  [io.sma.health] (executor-thread-0) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"validation check failed for the default DataSource"}}]}
2026-07-16 14:21:06,139 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': Closing connection in incorrect state VALIDATION
2026-07-16 14:21:16,120 INFO  [io.sma.health] (executor-thread-0) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"validation check failed for the default DataSource"}}]}
2026-07-16 14:21:16,125 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': Closing connection in incorrect state VALIDATION
2026-07-16 14:21:26,119 INFO  [io.sma.health] (executor-thread-0) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"validation check failed for the default DataSource"}}]}
2026-07-16 14:21:26,129 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': Closing connection in incorrect state VALIDATION
2026-07-16 14:21:36,122 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': Closing connection in incorrect state VALIDATION
2026-07-16 14:21:36,122 INFO  [io.sma.health] (executor-thread-0) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"validation check failed for the default DataSource"}}]}
2026-07-16 14:21:42,825 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': Closing connection in incorrect state VALIDATION
2026-07-16 16:01:58.533-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service: recvAddress(..) failed: Connection reset by peer (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (telemetry will be stored to disk and retried) (future warnings will be aggregated and logged once every 5 minutes)
io.netty.channel.unix.Errors$NativeIoException: recvAddress(..) failed: Connection reset by peer
2026-07-16 16:06:58.535-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 3305): Sending telemetry to the ingestion service:
 * recvAddress(..) failed: Connection reset by peer (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (telemetry will be stored to disk and retried) (1 times)
2026-07-16 16:09:04,185 WARN  [br.gov.cai.lot.api.sec.CustomTenantResolver] (vert.x-eventloop-thread-0) ***** [SECURITY] :: Authorization-Header nao encontrado *****
2026-07-17 06:20:25.008-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - Pinging live metrics endpoint: io.netty.channel.unix.Errors$NativeIoException: recvAddress(..) failed: Connection reset by peer (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (future warnings will be aggregated and logged once every 5 minutes)
reactor.core.Exceptions$ReactiveException: io.netty.channel.unix.Errors$NativeIoException: recvAddress(..) failed: Connection reset by peer
	at reactor.core.Exceptions.propagate(Exceptions.java:408)
	at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:101)
	at reactor.core.publisher.Mono.block(Mono.java:1712)
	at com.azure.monitor.opentelemetry.exporter.implementation.quickpulse.QuickPulsePingSender.ping(QuickPulsePingSender.java:102)
	at com.azure.monitor.opentelemetry.exporter.implementation.quickpulse.QuickPulseCoordinator.ping(QuickPulseCoordinator.java:100)
	at com.azure.monitor.opentelemetry.exporter.implementation.quickpulse.QuickPulseCoordinator.run(QuickPulseCoordinator.java:53)
	at java.base/java.lang.Thread.run(Thread.java:833)
	Suppressed: java.lang.Exception: #block terminated with an error
		at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:103)
		... 5 common frames omitted
Caused by: io.netty.channel.unix.Errors$NativeIoException: recvAddress(..) failed: Connection reset by peer
2026-07-17 11:15:56.034-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service: Connection prematurely closed BEFORE response (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (telemetry will be stored to disk and retried) (future warnings will be aggregated and logged once every 5 minutes)
reactor.netty.http.client.PrematureCloseException: Connection prematurely closed BEFORE response
2026-07-18 05:40:25.042-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 59): Pinging live metrics endpoint:
 * reactor.netty.http.client.PrematureCloseException: Connection prematurely closed BEFORE response (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-07-19 16:25:25.090-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 60): Pinging live metrics endpoint:
 * reactor.netty.http.client.PrematureCloseException: Connection prematurely closed BEFORE response (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-07-19 17:35:25.092-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 56): Pinging live metrics endpoint:
 * io.netty.channel.unix.Errors$NativeIoException: recvAddress(..) failed: Connection reset by peer (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-07-19 17:45:25.092-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 60): Pinging live metrics endpoint:
 * reactor.netty.http.client.PrematureCloseException: Connection prematurely closed BEFORE response (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-07-20 11:30:25.115-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 55): Pinging live metrics endpoint:
 * io.netty.channel.unix.Errors$NativeIoException: recvAddress(..) failed: Connection reset by peer (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-07-20 11:31:58.658-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 2 times (out of 10): Sending telemetry to the ingestion service:
 * recvAddress(..) failed: Connection reset by peer (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (telemetry will be stored to disk and retried) (2 times)
2026-07-20 14:15:56.128-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 6): Sending telemetry to the ingestion service:
 * Connection prematurely closed BEFORE response (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (telemetry will be stored to disk and retried) (1 times)
2026-07-21 00:05:25.131-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 56): Pinging live metrics endpoint:
 * io.netty.channel.unix.Errors$NativeIoException: recvAddress(..) failed: Connection reset by peer (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-07-21 09:15:25.144-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 59): Pinging live metrics endpoint:
 * reactor.netty.http.client.PrematureCloseException: Connection prematurely closed BEFORE response (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-07-21 12:10:25.148-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 53): Pinging live metrics endpoint:
 * io.netty.channel.unix.Errors$NativeIoException: recvAddress(..) failed: Connection reset by peer (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-07-21 17:46:03.418-03:00 ERROR c.m.a.a.i.p.ProfilingInitializer - Error pulling service profiler settings
javax.net.ssl.SSLException: failure when writing TLS control frames
	at io.netty.handler.ssl.SslHandler.setHandshakeFailureTransportFailure(SslHandler.java:1999)
	at io.netty.handler.ssl.SslHandler.access$600(SslHandler.java:171)
	at io.netty.handler.ssl.SslHandler$2.operationComplete(SslHandler.java:982)
	at io.netty.handler.ssl.SslHandler$2.operationComplete(SslHandler.java:977)
	at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:590)
	at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:557)
	at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:492)
	at io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:636)
	at io.netty.util.concurrent.DefaultPromise.setFailure0(DefaultPromise.java:629)
	at io.netty.util.concurrent.DefaultPromise.tryFailure(DefaultPromise.java:118)
	at io.netty.channel.PendingWriteQueue.safeFail(PendingWriteQueue.java:298)
	at io.netty.channel.PendingWriteQueue.removeAndFailAll(PendingWriteQueue.java:196)
	at io.netty.handler.proxy.ProxyHandler.failPendingWrites(ProxyHandler.java:437)
	at io.netty.handler.proxy.ProxyHandler.failPendingWritesAndClose(ProxyHandler.java:354)
	at io.netty.handler.proxy.ProxyHandler.setConnectFailure(ProxyHandler.java:349)
	at io.netty.handler.proxy.ProxyHandler.access$100(ProxyHandler.java:41)
	at io.netty.handler.proxy.ProxyHandler$2.run(ProxyHandler.java:201)
	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:153)
	at io.netty.util.concurrent.AbstractEventExecutor.runTask(AbstractEventExecutor.java:173)
	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:166)
	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:470)
	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:416)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: io.netty.handler.proxy.ProxyConnectException: http, none, proxydes.caixa/10.252.32.65:80 => agent.azureserviceprofiler.net/<unresolved>:443, timeout
	... 11 common frames omitted
2026-07-21 17:47:03.417-03:00 ERROR c.m.a.a.i.p.ProfilingInitializer - Error pulling service profiler settings
javax.net.ssl.SSLException: failure when writing TLS control frames
	at io.netty.handler.ssl.SslHandler.setHandshakeFailureTransportFailure(SslHandler.java:1999)
	at io.netty.handler.ssl.SslHandler.access$600(SslHandler.java:171)
	at io.netty.handler.ssl.SslHandler$2.operationComplete(SslHandler.java:982)
	at io.netty.handler.ssl.SslHandler$2.operationComplete(SslHandler.java:977)
	at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:590)
	at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:557)
	at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:492)
	at io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:636)
	at io.netty.util.concurrent.DefaultPromise.setFailure0(DefaultPromise.java:629)
	at io.netty.util.concurrent.DefaultPromise.tryFailure(DefaultPromise.java:118)
	at io.netty.channel.PendingWriteQueue.safeFail(PendingWriteQueue.java:298)
	at io.netty.channel.PendingWriteQueue.removeAndFailAll(PendingWriteQueue.java:196)
	at io.netty.handler.proxy.ProxyHandler.failPendingWrites(ProxyHandler.java:437)
	at io.netty.handler.proxy.ProxyHandler.failPendingWritesAndClose(ProxyHandler.java:354)
	at io.netty.handler.proxy.ProxyHandler.setConnectFailure(ProxyHandler.java:349)
	at io.netty.handler.proxy.ProxyHandler.access$100(ProxyHandler.java:41)
	at io.netty.handler.proxy.ProxyHandler$2.run(ProxyHandler.java:201)
	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:153)
	at io.netty.util.concurrent.AbstractEventExecutor.runTask(AbstractEventExecutor.java:173)
	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:166)
	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:470)
	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:416)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: io.netty.handler.proxy.ProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => agent.azureserviceprofiler.net/<unresolved>:443, timeout
	... 11 common frames omitted
2026-07-22 15:53:53,846 WARN  [br.gov.cai.lot.api.sec.CustomTenantResolver] (vert.x-eventloop-thread-0) ***** [SECURITY] :: Authorization-Header nao encontrado *****
2026-07-22 17:00:25.189-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 56): Pinging live metrics endpoint:
 * io.netty.channel.unix.Errors$NativeIoException: recvAddress(..) failed: Connection reset by peer (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-07-23 02:55:25.202-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 56): Pinging live metrics endpoint:
 * io.netty.channel.unix.Errors$NativeIoException: recvAddress(..) failed: Connection reset by peer (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-07-25 06:10:25.278-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 56): Pinging live metrics endpoint:
 * io.netty.channel.unix.Errors$NativeIoException: recvAddress(..) failed: Connection reset by peer (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-07-26 01:40:25.303-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 60): Pinging live metrics endpoint:
 * io.netty.channel.unix.Errors$NativeIoException: recvAddress(..) failed: Connection reset by peer (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-07-26 19:45:25.327-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 58): Pinging live metrics endpoint:
 * reactor.netty.http.client.PrematureCloseException: Connection prematurely closed BEFORE response (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-07-26 22:55:25.332-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 56): Pinging live metrics endpoint:
 * io.netty.channel.unix.Errors$NativeIoException: recvAddress(..) failed: Connection reset by peer (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-07-26 22:55:56.324-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 6): Sending telemetry to the ingestion service:
 * connection timed out after 10000 ms: proxydes.caixa/10.252.32.63:80 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (telemetry will be stored to disk and retried) (1 times)
2026-07-27 14:51:58.883-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 10): Sending telemetry to the ingestion service:
 * Connection prematurely closed BEFORE response (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (telemetry will be stored to disk and retried) (1 times)
2026-07-27 14:55:25.355-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 53): Pinging live metrics endpoint:
 * reactor.netty.http.client.PrematureCloseException: Connection prematurely closed BEFORE response (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-07-27 19:45:25.362-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 60): Pinging live metrics endpoint:
 * reactor.netty.http.client.PrematureCloseException: Connection prematurely closed BEFORE response (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-07-27 21:45:25.366-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 56): Pinging live metrics endpoint:
 * io.netty.channel.unix.Errors$NativeIoException: recvAddress(..) failed: Connection reset by peer (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-07-27 23:50:25.369-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 58): Pinging live metrics endpoint:
 * reactor.netty.http.client.PrematureCloseException: Connection prematurely closed BEFORE response (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
2026-07-27 23:50:56.356-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 10): Sending telemetry to the ingestion service:
 * recvAddress(..) failed: Connection reset by peer (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (telemetry will be stored to disk and retried) (1 times)
2026-07-28 09:15:25.383-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 1 times (out of 60): Pinging live metrics endpoint:
 * io.netty.channel.unix.Errors$NativeIoException: recvAddress(..) failed: Connection reset by peer (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (1 times)
