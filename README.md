mesma coisa, 


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


pipiline varaibles esta assim:



AMBIENTE
des
AMBIENTE
tqs
AMBIENTE
hmp
AMBIENTE
prd
AMBIENTE_BUILD
build-images-ads
CGC_UNIDADE_DES
7390
CGC_UNIDADE_OPS
7259
fortify_disable
false
PASSWORD_TRUSTSTORE
changeit
SISTEMAAMBIENTE
des
SISTEMAAMBIENTE
tqs
SISTEMAAMBIENTE
hmp
SISTEMAAMBIENTE
prd
SISTEMANOME
SISGF-backend
SITE
okd4_nprd
SITE
okd4_prd
TemplateRelease_OKD
openshift/quarkus-caixa-release
UNIDADE
BR



Agent job
Started: 28/05/2026, 13:59:41
Pool:
Release-Linux-OKD4
·
Agent: azp-ads-agent-release-5cd876f98-rjttk
4m 2s

Initialize job
·
succeeded
<1s

Pre-job: Download secure file
·
succeeded
<1s

Download Artifacts
·
succeeded
1 warning
<1s

Exportando as variáveis do arquivo Trust Store
·
succeeded
<1s

Recuperando nome do repositório
·
succeeded

1s

Convertendo Minúsculo e Definindo nome do Projeto/Repositório
·
succeeded
<1s

Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs
·
succeeded
<1s

Cria Streams Graylog
·
succeeded
2s

Recupera VEC
·
succeeded
1s

VEC - Aferição
·
succeeded
1 warning
<1s

Login OpenShift
·
succeeded
<1s

Exportando Variáveis de Ambiente "_ENV."
·
succeeded
<1s

Criando novo Projeto
·
succeeded
<1s

Adicionando ISTIO_INJECTION
·
skipped


Criando nova APP
·
succeeded
<1s

Atualizando Variáveis de Ambiente
·
succeeded
5s

Criando Rota Customizada
·
succeeded
<1s

Aplicando Service Mesh
·
skipped


Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-beyondtrust-check
·
succeeded
<1s

Create BT Secret
·
succeeded
<1s

Create BT Shared Volume
·
succeeded
<1s

Create BT Sidecar
·
succeeded
<1s

Create Secret Check Script
·
succeeded
<1s

Create Secret Check
·
succeeded
<1s

Create BT App Mount Volume
·
succeeded
<1s

Exporta Variáveis de Ambiente "_SECRET."
·
succeeded
<1s

Alterando valores placeholder no exec_secret.sh
·
succeeded
4 warnings
<1s

Criando Secrets
·
succeeded
<1s

Vinculando Secrets
·
succeeded
<1s

Adicionando Multiplas Secrets
·
succeeded
<1s

Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
·
succeeded
20s

Concedendo Acesso OKD
·
succeeded
<1s

Verificando IP de Saída
·
succeeded
<1s

Configurando IP de Saída
·
succeeded
<1s

Cadastrando no Portal IIF
·
succeeded
<1s

Verificando Status do Deployment
3m 20s
Waiting for console output from an agent...

Logs da Aplicação
·
pending

Resumo da Release
·
pending

Coletando dados da imagem
·
pending

Atualizando versão no PortalIF
·
pending

Realizando Logout OKD
·
pending


como podemos ver se relamente ele ta trazendo as atualizaçoes feitas no pom?


