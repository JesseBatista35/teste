Realizar  regularização do SIAPO-calculo-funcao-micro de TQS pois está com erro na configuração dos init pods do agent-sidecar e secrets-check com as seguintes mensagens:
https://console-openshift-console.apps.nprd.caixa/k8s/ns/siapo-tqs/pods

ERRO no agent-sidecar:
2026-08-24 13:38:02,048 INFO Getting secrets just once, POLLING_WAIT_BETWEEN_REQUESTS_MINUTES was not configured
2026-08-24 13:38:02,048 INFO (070542e4-9fc1-11f1-abc6-0a581901200f) APP VERSION: 2.1.0
2026-08-24 13:38:02,048 INFO (070542e4-9fc1-11f1-abc6-0a581901200f) Starting Execution...070542e4-9fc1-11f1-abc6-0a581901200f
2026-08-24 13:38:02,048 INFO (070542e4-9fc1-11f1-abc6-0a581901200f) You are using: <,> as List delimiter
2026-08-24 13:38:02,048 WARNING (070542e4-9fc1-11f1-abc6-0a581901200f) InsecureRequestWarning: Unverified HTTPS request is being made to host https://sicsn.caixa/BeyondTrust/api/public/v3'. Adding certificate verification isstrongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
2026-08-24 13:38:02,048 INFO (070542e4-9fc1-11f1-abc6-0a581901200f) Certificate was not configured
Traceback (most recent call last):
File "/usr/src/app/get_secrets_from_secret_safe.py", line 75, in main
authentication_obj = controller.get_auth_object(
session=session, logger=logger
)
File "/usr/src/app/sidecar_agent_project/controller.py", line 90, in get_auth_object
authentication_obj = authentication.Authentication(**config)
File "/usr/local/lib/python3.13/site-packages/secrets_safe_library/authentication.py", line 61, in __init__
self.validate_input("client_id", client_id)
~~~~~~~~~~~~~~~~~~~^^^^^^^^^^^^^^^^^^^^^^^^
File "/usr/local/lib/python3.13/site-packages/secrets_safe_library/authentication.py", line 246, in validate_input
raise exceptions.OptionsError(f"{parameter_name} parameter is missing")
secrets_safe_library.exceptions.OptionsError: client_id parameter is missing
2026-08-24 13:38:02,051 ERROR (070542e4-9fc1-11f1-abc6-0a581901200f) There was an error in the execution: client_id parameter is missing


ERRO no secrets-check
Script nao serah executado, pois nenhuma das seguintes variaveis de ambiente estah definida: 'SECRETS_LIST' , 'MANAGED_ACCOUNTS_LIST'.


ERRO na release:
2026-08-27T14:27:25.8548364Z One or more configuration errors have prevented the application from starting. The errors are:
2026-08-27T14:27:25.8548605Z   - SRCFG00011: Could not expand value SAPOTR01_MSSQL in property quarkus.datasource.password
2026-08-27T14:27:25.8548859Z   - SRCFG00011: Could not expand value CLISERAPO_SSO_INTRA in property quarkus.oidc.credentials.secret


Em caso de dúvidas, contatar f900626
Agradeço desde já.



2026-08-27T14:21:16.4371752Z ##[section]Starting: Verificando Status do Deployment
2026-08-27T14:21:16.4375183Z ==============================================================================
2026-08-27T14:21:16.4375273Z Task         : Bash
2026-08-27T14:21:16.4375322Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-27T14:21:16.4375397Z Version      : 3.227.0
2026-08-27T14:21:16.4375447Z Author       : Microsoft Corporation
2026-08-27T14:21:16.4375503Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-27T14:21:16.4375581Z ==============================================================================
2026-08-27T14:21:17.4382870Z Generating script.
2026-08-27T14:21:17.4393364Z ========================== Starting Command Output ===========================
2026-08-27T14:21:17.4400662Z [command]/bin/bash /opt/ads-agent/_work/_temp/4ccf896a-af47-4009-8fbd-8c464ca7efe4.sh
2026-08-27T14:21:17.6719514Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-08-27T14:27:23.9475707Z ##[error]The task has timed out.
2026-08-27T14:27:23.9477020Z ##[section]Finishing: Verificando Status do Deployment


2026-08-27T14:27:23.9496338Z ##[section]Starting: Logs da Aplicação
2026-08-27T14:27:23.9499421Z ==============================================================================
2026-08-27T14:27:23.9499506Z Task         : Bash
2026-08-27T14:27:23.9499564Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-27T14:27:23.9499631Z Version      : 3.227.0
2026-08-27T14:27:23.9499678Z Author       : Microsoft Corporation
2026-08-27T14:27:23.9499744Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-27T14:27:23.9499819Z ==============================================================================
2026-08-27T14:27:25.0120764Z Generating script.
2026-08-27T14:27:25.0131858Z ========================== Starting Command Output ===========================
2026-08-27T14:27:25.0138899Z [command]/bin/bash /opt/ads-agent/_work/_temp/6ef5cf3f-6c9a-468d-a234-567acf249677.sh
2026-08-27T14:27:25.0189395Z + shopt -s expand_aliases
2026-08-27T14:27:25.0191031Z + [[ -n okd4_nprd ]]
2026-08-27T14:27:25.0191216Z + [[ okd4_nprd =~ ocp ]]
2026-08-27T14:27:25.0191372Z + [[ -n okd4_nprd ]]
2026-08-27T14:27:25.0191475Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-08-27T14:27:25.0191642Z + app=siapo-calculo-funcao-micro-tqs
2026-08-27T14:27:25.0191756Z + oc version
2026-08-27T14:27:25.1795183Z oc v3.11.0+0cbc58b
2026-08-27T14:27:25.1795462Z kubernetes v1.11.0+d4cacc0
2026-08-27T14:27:25.1795900Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-08-27T14:27:25.1893885Z 
2026-08-27T14:27:25.1894629Z Server https://api.nprd.caixa:6443
2026-08-27T14:27:25.1895086Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-08-27T14:27:25.1934901Z ++ oc get pod -l name=siapo-calculo-funcao-micro-tqs -n siapo-tqs -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-08-27T14:27:25.1935274Z ++ tac
2026-08-27T14:27:25.1935487Z ++ grep -v '^$'
2026-08-27T14:27:25.1940672Z ++ head -n1
2026-08-27T14:27:25.4998481Z + last_pod=siapo-calculo-funcao-micro-tqs-52-v47qj
2026-08-27T14:27:25.4998776Z + echo 'Logs do POD: siapo-calculo-funcao-micro-tqs-52-v47qj'
2026-08-27T14:27:25.4999024Z + oc logs siapo-calculo-funcao-micro-tqs-52-v47qj -c siapo-calculo-funcao-micro-tqs -n siapo-tqs
2026-08-27T14:27:25.4999237Z Logs do POD: siapo-calculo-funcao-micro-tqs-52-v47qj
2026-08-27T14:27:25.8515961Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -XX:InitialRAMPercentage=25 -XX:MaxRAMPercentage=85 -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/tmp -XX:+ExitOnOutOfMemoryError -Dfile.encoding=utf-8 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-08-27T14:27:25.8516791Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-08-27T14:27:25.8517134Z 2026-08-27 11:25:23.823-03:00 INFO  c.m.applicationinsights.agent - ApplicationInsights Java Agent 3.3.1 started successfully (PID 8)
2026-08-27T14:27:25.8517491Z 2026-08-27 11:25:23.825-03:00 INFO  c.m.applicationinsights.agent - Java version: 17.0.7, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-17-openjdk-17.0.7.0.7-3.el8.x86_64
2026-08-27T14:27:25.8517970Z 2026-08-27 11:25:25.333-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - Unable to retrieve appId: exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/f6b9b060-c8fc-4702-a924-a3632ca25bb1/appId (future warnings will be aggregated and logged once every 5 minutes)
2026-08-27T14:27:25.8519043Z reactor.core.Exceptions$ReactiveException: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => brazilsouth-1.in.applicationinsights.azure.com/<unresolved>:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
2026-08-27T14:27:25.8519390Z 	at reactor.core.Exceptions.propagate(Exceptions.java:392)
2026-08-27T14:27:25.8519588Z 	at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:97)
2026-08-27T14:27:25.8519763Z 	at reactor.core.publisher.Mono.block(Mono.java:1707)
2026-08-27T14:27:25.8519960Z 	at com.microsoft.applicationinsights.agent.internal.init.AppIdSupplier$GetAppIdTask.run(AppIdSupplier.java:139)
2026-08-27T14:27:25.8520171Z 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
2026-08-27T14:27:25.8520362Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-08-27T14:27:25.8520706Z 	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
2026-08-27T14:27:25.8521757Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-08-27T14:27:25.8522061Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-08-27T14:27:25.8522239Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-08-27T14:27:25.8522380Z 	Suppressed: java.lang.Exception: #block terminated with an error
2026-08-27T14:27:25.8522576Z 		at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:99)
2026-08-27T14:27:25.8522735Z 		... 8 common frames omitted
2026-08-27T14:27:25.8523208Z Caused by: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => brazilsouth-1.in.applicationinsights.azure.com/<unresolved>:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
2026-08-27T14:27:25.8523503Z 	at io.netty.handler.proxy.HttpProxyHandler.handleResponse(HttpProxyHandler.java:200)
2026-08-27T14:27:25.8523692Z 	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:257)
2026-08-27T14:27:25.8523905Z 	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
2026-08-27T14:27:25.8524131Z 	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
2026-08-27T14:27:25.8524348Z 	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
2026-08-27T14:27:25.8524589Z 	at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:436)
2026-08-27T14:27:25.8524830Z 	at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:327)
2026-08-27T14:27:25.8525036Z 	at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:299)
2026-08-27T14:27:25.8525244Z 	at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
2026-08-27T14:27:25.8525459Z 	at io.netty.handler.proxy.HttpProxyHandler$HttpClientCodecWrapper.channelRead(HttpProxyHandler.java:272)
2026-08-27T14:27:25.8525685Z 	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
2026-08-27T14:27:25.8525906Z 	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
2026-08-27T14:27:25.8526123Z 	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
2026-08-27T14:27:25.8526327Z 	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
2026-08-27T14:27:25.8526594Z 	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
2026-08-27T14:27:25.8526935Z 	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
2026-08-27T14:27:25.8527141Z 	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
2026-08-27T14:27:25.8527362Z 	at io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe.epollInReady(AbstractEpollStreamChannel.java:800)
2026-08-27T14:27:25.8527701Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe.epollRdHupReady(AbstractEpollChannel.java:480)
2026-08-27T14:27:25.8527914Z 	at io.netty.channel.epoll.EpollEventLoop.processReady(EpollEventLoop.java:494)
2026-08-27T14:27:25.8528092Z 	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:385)
2026-08-27T14:27:25.8528350Z 	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
2026-08-27T14:27:25.8528566Z 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
2026-08-27T14:27:25.8528753Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-08-27T14:27:25.8528909Z 	... 1 common frames omitted
2026-08-27T14:27:25.8529571Z 2026-08-27 11:25:26.725-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - Pinging live metrics endpoint: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => brazilsouth.livediagnostics.monitor.azure.com/<unresolved>:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  ) (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (future warnings will be aggregated and logged once every 5 minutes)
2026-08-27T14:27:25.8530050Z reactor.core.Exceptions$ReactiveException: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => brazilsouth.livediagnostics.monitor.azure.com/<unresolved>:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
2026-08-27T14:27:25.8530386Z 	at reactor.core.Exceptions.propagate(Exceptions.java:392)
2026-08-27T14:27:25.8530655Z 	at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:97)
2026-08-27T14:27:25.8530845Z 	at reactor.core.publisher.Mono.block(Mono.java:1707)
2026-08-27T14:27:25.8531048Z 	at com.azure.monitor.opentelemetry.exporter.implementation.quickpulse.QuickPulsePingSender.ping(QuickPulsePingSender.java:124)
2026-08-27T14:27:25.8531288Z 	at com.azure.monitor.opentelemetry.exporter.implementation.quickpulse.QuickPulseCoordinator.ping(QuickPulseCoordinator.java:110)
2026-08-27T14:27:25.8531528Z 	at com.azure.monitor.opentelemetry.exporter.implementation.quickpulse.QuickPulseCoordinator.run(QuickPulseCoordinator.java:67)
2026-08-27T14:27:25.8531722Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-08-27T14:27:25.8531924Z 	Suppressed: java.lang.Exception: #block terminated with an error
2026-08-27T14:27:25.8532118Z 		at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:99)
2026-08-27T14:27:25.8532293Z 		... 5 common frames omitted
2026-08-27T14:27:25.8532530Z Caused by: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => brazilsouth.livediagnostics.monitor.azure.com/<unresolved>:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
2026-08-27T14:27:25.8532803Z 	at io.netty.handler.proxy.HttpProxyHandler.handleResponse(HttpProxyHandler.java:200)
2026-08-27T14:27:25.8532989Z 	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:257)
2026-08-27T14:27:25.8533190Z 	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
2026-08-27T14:27:25.8533401Z 	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
2026-08-27T14:27:25.8533670Z 	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
2026-08-27T14:27:25.8533913Z 	at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:436)
2026-08-27T14:27:25.8534147Z 	at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:327)
2026-08-27T14:27:25.8534377Z 	at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:299)
2026-08-27T14:27:25.8534582Z 	at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
2026-08-27T14:27:25.8534799Z 	at io.netty.handler.proxy.HttpProxyHandler$HttpClientCodecWrapper.channelRead(HttpProxyHandler.java:272)
2026-08-27T14:27:25.8535014Z 	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
2026-08-27T14:27:25.8535223Z 	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
2026-08-27T14:27:25.8535434Z 	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
2026-08-27T14:27:25.8535647Z 	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
2026-08-27T14:27:25.8535861Z 	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
2026-08-27T14:27:25.8536075Z 	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
2026-08-27T14:27:25.8536282Z 	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
2026-08-27T14:27:25.8536554Z 	at io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe.epollInReady(AbstractEpollStreamChannel.java:800)
2026-08-27T14:27:25.8536791Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$1.run(AbstractEpollChannel.java:425)
2026-08-27T14:27:25.8536996Z 	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
2026-08-27T14:27:25.8537204Z 	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:469)
2026-08-27T14:27:25.8537400Z 	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:391)
2026-08-27T14:27:25.8537592Z 	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
2026-08-27T14:27:25.8537787Z 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
2026-08-27T14:27:25.8537978Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-08-27T14:27:25.8538136Z 	... 1 common frames omitted
2026-08-27T14:27:25.8538720Z 2026-08-27 11:25:26.732-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service: http, none, proxydes.caixa/10.252.32.63:80 => brazilsouth-1.in.applicationinsights.azure.com/<unresolved>:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  ) (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (future warnings will be aggregated and logged once every 5 minutes)
2026-08-27T14:27:25.8539331Z io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => brazilsouth-1.in.applicationinsights.azure.com/<unresolved>:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
2026-08-27T14:27:25.8539603Z 	at io.netty.handler.proxy.HttpProxyHandler.handleResponse(HttpProxyHandler.java:200)
2026-08-27T14:27:25.8539782Z 	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:257)
2026-08-27T14:27:25.8539978Z 	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
2026-08-27T14:27:25.8540193Z 	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
2026-08-27T14:27:25.8540448Z 	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
2026-08-27T14:27:25.8540794Z 	at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:436)
2026-08-27T14:27:25.8541030Z 	at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:327)
2026-08-27T14:27:25.8541259Z 	at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:299)
2026-08-27T14:27:25.8541467Z 	at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
2026-08-27T14:27:25.8541668Z 	at io.netty.handler.proxy.HttpProxyHandler$HttpClientCodecWrapper.channelRead(HttpProxyHandler.java:272)
2026-08-27T14:27:25.8541960Z 	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
2026-08-27T14:27:25.8542259Z 	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
2026-08-27T14:27:25.8542475Z 	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
2026-08-27T14:27:25.8542689Z 	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
2026-08-27T14:27:25.8542896Z 	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
2026-08-27T14:27:25.8543109Z 	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
2026-08-27T14:27:25.8543315Z 	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
2026-08-27T14:27:25.8543522Z 	at io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe.epollInReady(AbstractEpollStreamChannel.java:800)
2026-08-27T14:27:25.8543742Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$1.run(AbstractEpollChannel.java:425)
2026-08-27T14:27:25.8543957Z 	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
2026-08-27T14:27:25.8544164Z 	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:469)
2026-08-27T14:27:25.8544409Z 	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:391)
2026-08-27T14:27:25.8544601Z 	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
2026-08-27T14:27:25.8544840Z 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
2026-08-27T14:27:25.8545050Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-08-27T14:27:25.8545219Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-08-27T14:27:25.8545510Z LogManager error of type WRITE_FAILURE: The delayed handler's queue was overrun and log record(s) were lost. Did you forget to configure logging?
2026-08-27T14:27:25.8545692Z Aug 27, 2026 11:25:24 AM io.quarkus.config
2026-08-27T14:27:25.8545881Z WARN: Unrecognized configuration key "%s" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-27T14:27:25.8546066Z Aug 27, 2026 11:25:24 AM io.quarkus.config
2026-08-27T14:27:25.8546258Z WARN: Unrecognized configuration key "%s" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-27T14:27:25.8546458Z Aug 27, 2026 11:25:26 AM org.hibernate.validator.internal.util.Version
2026-08-27T14:27:25.8546600Z INFO: HV000001: Hibernate Validator %s
2026-08-27T14:27:25.8546721Z Aug 27, 2026 11:25:26 AM org.hibernate.Version
2026-08-27T14:27:25.8546854Z INFO: HHH000412: Hibernate ORM core version %s
2026-08-27T14:27:25.8546998Z Aug 27, 2026 11:25:26 AM org.hibernate.annotations.common.Version
2026-08-27T14:27:25.8547165Z INFO: HCANN000001: Hibernate Commons Annotations {%1$s}
2026-08-27T14:27:25.8547372Z Aug 27, 2026 11:25:27 AM org.hibernate.dialect.Dialect
2026-08-27T14:27:25.8547504Z INFO: HHH000400: Using dialect: %s
2026-08-27T14:27:25.8547629Z Aug 27, 2026 11:25:28 AM org.jboss.resteasy.resteasy_jaxrs.i18n
2026-08-27T14:27:25.8547813Z INFO: RESTEASY002225: Deploying javax.ws.rs.core.Application: class br.gov.caixa.siapo.rs.funcaocalculo.resource.SiapoApplication
2026-08-27T14:27:25.8548012Z Aug 27, 2026 11:25:28 AM org.hibernate.resource.beans.container.spi.AbstractCdiBeanContainer stop
2026-08-27T14:27:25.8548213Z INFO: HHH10005004: Stopping BeanContainer : %s
2026-08-27T14:27:25.8548364Z One or more configuration errors have prevented the application from starting. The errors are:
2026-08-27T14:27:25.8548605Z   - SRCFG00011: Could not expand value SAPOTR01_MSSQL in property quarkus.datasource.password
2026-08-27T14:27:25.8548859Z   - SRCFG00011: Could not expand value CLISERAPO_SSO_INTRA in property quarkus.oidc.credentials.secret
2026-08-27T14:27:25.8548943Z 
2026-08-27T14:27:25.8611973Z ##[section]Finishing: Logs da Aplicação

LOG: 
siapo-calculo-funcao-micro-tqs-53-j9p7j


Ssecrets-check


Script nao serah executado, pois nenhuma das seguintes variaveis de ambiente estah definida: 'SECRETS_LIST' , 'MANAGED_ACCOUNTS_LIST'.


secrets-agent-sidecar

026-08-27 17:33:50,506 INFO (7765c6f2-a23d-11f1-81ae-0a581902143a) APP VERSION: 2.1.0
2026-08-27 17:33:50,506 INFO (7765c6f2-a23d-11f1-81ae-0a581902143a) Starting Execution...7765c6f2-a23d-11f1-81ae-0a581902143a
2026-08-27 17:33:50,506 INFO (7765c6f2-a23d-11f1-81ae-0a581902143a) You are using: <,> as List delimiter
2026-08-27 17:33:50,506 WARNING (7765c6f2-a23d-11f1-81ae-0a581902143a) InsecureRequestWarning: Unverified HTTPS request is being made to host https://sicsn.caixa/BeyondTrust/api/public/v3'. Adding certificate verification isstrongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
2026-08-27 17:33:50,506 INFO (7765c6f2-a23d-11f1-81ae-0a581902143a) Certificate was not configured
Traceback (most recent call last):
File "/usr/src/app/get_secrets_from_secret_safe.py", line 75, in main
authentication_obj = controller.get_auth_object(
session=session, logger=logger
)
File "/usr/src/app/sidecar_agent_project/controller.py", line 90, in get_auth_object
authentication_obj = authentication.Authentication(**config)
File "/usr/local/lib/python3.13/site-packages/secrets_safe_library/authentication.py", line 61, in __init__
self.validate_input("client_id", client_id)
~~~~~~~~~~~~~~~~~~~^^^^^^^^^^^^^^^^^^^^^^^^
File "/usr/local/lib/python3.13/site-packages/secrets_safe_library/authentication.py", line 246, in validate_input
raise exceptions.OptionsError(f"{parameter_name} parameter is missing")
secrets_safe_library.exceptions.OptionsError: client_id parameter is missing
2026-08-27 17:33:50,514 ERROR (7765c6f2-a23d-11f1-81ae-0a581902143a) There was an error in the execution: client_id parameter is missing



Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIAPO-calculo-funcao-micro
/
SIAPO-calculo-funcao-micro-1.3.6.3(3)
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings
SIAPO-calculo-funcao-micro

SIAPO-calculo-funcao-micro-1.3.6.3(3)


EC TQS

Succeeded


Pipeline

Tasks

Variables

Logs

Tests
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
EGRESS_IP_OKD (81)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SIAPO-CALCULO-FUNCAO-MICRO-DES (24)
Grupo de variáveis de SIAPO-CALCULO-FUNCAO-MICRO-DES
Scopes: EC DES
SIAPO-calculo-funcao-micro-BT-VAULT-DES (3)
WO0000078528161
Scopes: EC DES
BT_CLIENT_ID
a369e148-153a-45b3-b886-fe72ed3643be
BT_CLIENT_SECRET
********
BT_SECRETS_LIST
SIAPO_DES/SAPODR01_MSSQL,SIAPO_DES/CLISERAPO_SSO_INTRA
SIAPO-CALCULO-FUNCAO-MICRO-TQS (23)
Grupo de variáveis de SIAPO-CALCULO-FUNCAO-MICRO-TQS
Scopes: EC TQS
SIAPO-CALCULO-FUNCAO-MICRO-HMP (1)
Grupo de variáveis de SIAPO-CALCULO-FUNCAO-MICRO-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SIAPO-CALCULO-FUNCAO-MICRO-PRD (24)
Grupo de variáveis de SIAPO-CALCULO-FUNCAO-MICRO-PRD
Scopes: EC PRD
DATASOURCE_PASS
********
JKS_PASS
changeit
SECRET_SSO
********
_ENV.AMBIENTE
PRD
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=3d21c00f-2240-4b8f-b034-6f29611c9538;IngestionEndpoint=https://southcentralus-3.in.applicationinsights.azure.com/;LiveEndpoint=https://southcentralus.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_ROLE_NAM
SIAPO-CALCULO-PRD
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.CLIENT_ID
cli-web-apo
_ENV.HEALTH_ROOT
/q/health
_ENV.HEALTH_URL
https://siapo-calculo-funcao-micro-prd.apps.apl4.caixa/api/importacao
_ENV.HTTPS_PROXY
proxyprd.caixa:80
_ENV.JAVA_OPTIONS_APPEND
"-Dfile.encoding=utf-8 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-siapo-prd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar"
_ENV.NO_PROXY
.caixa,.caixa.gov.br
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:sqlserver://10.120.85.188:1433;databaseName=APODB001"
_ENV.QUARKUS_DATASOURCE_USERNAME
SAPORP01
_ENV.QUARKUS_LOG_LEVEL
INFO
_ENV.QUARKUS_OIDC_AUTH_SERVER_URL
https://login.prd.caixa/auth/realms/intranet
_ENV.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
/usr/src/app/secrets_files/SIAPO_PRD/
_ENV.SQL_USER
SAPORP01
_SECRET.QUARKUS_DATASOURCE_PASSWORD
#{DATASOURCE_PASS}#
_SECRET.QUARKUS_HTTP_SSL_CERTIFICATE_KEY-STORE-PASSWORD
#{JKS_PASS}#
_SECRET.QUARKUS_OIDC_CREDENTIALS_SECRET
#{SECRET_SSO}#
Row 6

Collapsed

Expanded

Expanded

Collapsed

Expanded

Collapsed

1 pipelines found

Row 2

Row 2

Showing filters 1 through 2

Row 4

Showing filters 1 through 2




na ote a vaivel do bt-vault de tqs

masi dia 24 roud como sucesso

<img width="1885" height="920" alt="image" src="https://github.com/user-attachments/assets/e3a6caef-b182-4ca5-9cc7-519b9b870cfe" />



adicinei a libary novamente:

SIAPO-calculo-funcao-micro-BT-VAULT-TQS (3)


ela nao foi removida por inguem no tem isso no historioc por algum motivo o prorpo devops caixa removel a varaivel
