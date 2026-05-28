
[INFO] 
[INFO] --- quarkus-maven-plugin:3.13.0:build (default) @ sisgf-backend ---
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.oidc-client.token-path" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.datasource."siico".jdbc.xa-datasource-class" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.oidc.token.auto-refresh-interval" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.hibernate-orm.transaction.coordinator-strategy" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.datasource.xa" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.oidc-client.client-id" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.hibernate-orm.transaction.jta-data-source" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.config.source.file.system.enabled" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.transaction-manager.recovery-interval" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.transaction-manager.default-timeout" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.http.encoding.default-charset" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.hibernate-orm."siico".log.bind-parameters" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.oidc-client.credentials.secret" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.datasource."siico".xa" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.oidc-client.auth-server-url" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.http.encoding.force" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.datasource.jdbc.xa-datasource-class" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
[WARNING] [io.quarkus.hibernate.orm.deployment.HibernateOrmProcessor] Could not find a suitable persistence unit for model classes:
	- io.quarkus.hibernate.orm.panache.PanacheEntity
	- io.quarkus.hibernate.orm.panache.PanacheEntityBase
[WARNING] [io.quarkus.hibernate.orm.deployment.HibernateOrmProcessor] Could not find any entities affected to the persistence unit 'siico'.
[WARNING] [io.quarkus.arc.processor.BeanArchives] Failed to index javax.annotation.Nonnull: Class does not exist in ClassLoader QuarkusClassLoader:Deployment Class Loader: PROD for sisgf-backend-11.01.01.01@44e38882
[WARNING] [org.jboss.resteasy.reactive.common.processor.EndpointIndexer] Using a body parameter with jakarta.ws.rs.GET is strongly discouraged. Offending method is 'br.gov.caixa.sisgf.api.controllers.feriado.FeriadoController#org.springframework.http.ResponseEntity<java.lang.Object> diaUtilCorrido(br.gov.caixa.sisgf.api.dtos.FiltroDTO filtroDTO)'
[WARNING] [org.jboss.resteasy.reactive.common.processor.EndpointIndexer] Using a body parameter with jakarta.ws.rs.GET is strongly discouraged. Offending method is 'br.gov.caixa.sisgf.api.controllers.feriado.FeriadoController#org.springframework.http.ResponseEntity<java.lang.Object> diaUtilEspecifico(br.gov.caixa.sisgf.api.dtos.FiltroDTO filtroDTO)'
[WARNING] [org.jboss.resteasy.reactive.common.processor.EndpointIndexer] Using a body parameter with jakarta.ws.rs.GET is strongly discouraged. Offending method is 'br.gov.caixa.sisgf.api.controllers.feriado.FeriadoController#org.springframework.http.ResponseEntity<java.lang.Object> diasUteisCorridos(br.gov.caixa.sisgf.api.dtos.FiltroDTO filtroDTO)'
[WARNING] [org.jboss.resteasy.reactive.common.processor.EndpointIndexer] Using a body parameter with jakarta.ws.rs.GET is strongly discouraged. Offending method is 'br.gov.caixa.sisgf.api.controllers.feriado.FeriadoController#org.springframework.http.ResponseEntity<java.lang.Object> diasUteisEspecificos(br.gov.caixa.sisgf.api.dtos.FiltroDTO filtroDTO)'
[WARNING] [org.jboss.resteasy.reactive.common.processor.EndpointIndexer] Using a body parameter with jakarta.ws.rs.GET is strongly discouraged. Offending method is 'br.gov.caixa.sisgf.api.controllers.feriado.FeriadoController#org.springframework.http.ResponseEntity<java.lang.Object> ultimoDiaUtil(br.gov.caixa.sisgf.api.dtos.FiltroDTO filtroDTO)'
[INFO] [io.quarkus.deployment.QuarkusAugmentor] Quarkus augmentation completed in 4946ms
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  28.684 s
[INFO] Finished at: 2026-05-28T14:45:15-03:00
[INFO] ------------------------------------------------------------------------
Finishing: Maven



mesmo erro:


exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-05-28 14:01:04.560-03:00 INFO  c.m.applicationinsights.agent - ApplicationInsights Java Agent 3.3.1 started successfully (PID 8)
2026-05-28 14:01:04.562-03:00 INFO  c.m.applicationinsights.agent - Java version: 17.0.7, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-17-openjdk-17.0.7.0.7-3.el8.x86_64
2026-05-28 14:01:06.358-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - Unable to retrieve appId: exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (future warnings will be aggregated and logged once every 5 minutes)
reactor.core.Exceptions$ReactiveException: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => brazilsouth-1.in.applicationinsights.azure.com/<unresolved>:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
	at reactor.core.Exceptions.propagate(Exceptions.java:392)
	at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:97)
	at reactor.core.publisher.Mono.block(Mono.java:1707)
	at com.microsoft.applicationinsights.agent.internal.init.AppIdSupplier$GetAppIdTask.run(AppIdSupplier.java:139)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)
	Suppressed: java.lang.Exception: #block terminated with an error
		at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:99)
		... 8 common frames omitted
Caused by: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => brazilsouth-1.in.applicationinsights.azure.com/<unresolved>:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
	at io.netty.handler.proxy.HttpProxyHandler.handleResponse(HttpProxyHandler.java:200)
	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:257)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
	at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:436)
	at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:327)
	at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:299)
	at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
	at io.netty.handler.proxy.HttpProxyHandler$HttpClientCodecWrapper.channelRead(HttpProxyHandler.java:272)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
	at io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe.epollInReady(AbstractEpollStreamChannel.java:800)
	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe.epollRdHupReady(AbstractEpollChannel.java:480)
	at io.netty.channel.epoll.EpollEventLoop.processReady(EpollEventLoop.java:494)
	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:385)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 common frames omitted
2026-05-28 14:01:07.057-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - Pinging live metrics endpoint: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => brazilsouth.livediagnostics.monitor.azure.com/<unresolved>:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  ) (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (future warnings will be aggregated and logged once every 5 minutes)
reactor.core.Exceptions$ReactiveException: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => brazilsouth.livediagnostics.monitor.azure.com/<unresolved>:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
	at reactor.core.Exceptions.propagate(Exceptions.java:392)
	at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:97)
	at reactor.core.publisher.Mono.block(Mono.java:1707)
	at com.azure.monitor.opentelemetry.exporter.implementation.quickpulse.QuickPulsePingSender.ping(QuickPulsePingSender.java:124)
	at com.azure.monitor.opentelemetry.exporter.implementation.quickpulse.QuickPulseCoordinator.ping(QuickPulseCoordinator.java:110)
	at com.azure.monitor.opentelemetry.exporter.implementation.quickpulse.QuickPulseCoordinator.run(QuickPulseCoordinator.java:67)
	at java.base/java.lang.Thread.run(Thread.java:833)
	Suppressed: java.lang.Exception: #block terminated with an error
		at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:99)
		... 5 common frames omitted
Caused by: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => brazilsouth.livediagnostics.monitor.azure.com/<unresolved>:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
	at io.netty.handler.proxy.HttpProxyHandler.handleResponse(HttpProxyHandler.java:200)
	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:257)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
	at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:436)
	at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:327)
	at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:299)
	at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
	at io.netty.handler.proxy.HttpProxyHandler$HttpClientCodecWrapper.channelRead(HttpProxyHandler.java:272)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
	at io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe.epollInReady(AbstractEpollStreamChannel.java:800)
	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe.epollRdHupReady(AbstractEpollChannel.java:480)
	at io.netty.channel.epoll.EpollEventLoop.processReady(EpollEventLoop.java:494)
	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:385)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 common frames omitted
2026-05-28 14:01:07.161-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service: http, none, proxydes.caixa/10.252.32.63:80 => brazilsouth-1.in.applicationinsights.azure.com/<unresolved>:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  ) (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (future warnings will be aggregated and logged once every 5 minutes)
io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => brazilsouth-1.in.applicationinsights.azure.com/<unresolved>:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
	at io.netty.handler.proxy.HttpProxyHandler.handleResponse(HttpProxyHandler.java:200)
	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:257)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
	at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:436)
	at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:327)
	at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:299)
	at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
	at io.netty.handler.proxy.HttpProxyHandler$HttpClientCodecWrapper.channelRead(HttpProxyHandler.java:272)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
	at io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe.epollInReady(AbstractEpollStreamChannel.java:800)
	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe.epollRdHupReady(AbstractEpollChannel.java:480)
	at io.netty.channel.epoll.EpollEventLoop.processReady(EpollEventLoop.java:494)
	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:385)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-05-28 14:01:14,373 INFO  [com.arj.ats.jbossatx] (main) ARJUNA032014: Stopping transaction recovery manager
Failed to load config value of type class java.lang.String for: api.key


