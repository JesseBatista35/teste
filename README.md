2026-09-09T19:18:07.3387761Z ##[section]Starting: Verificando Status do Deployment
2026-09-09T19:18:07.3392496Z ==============================================================================
2026-09-09T19:18:07.3392654Z Task         : Bash
2026-09-09T19:18:07.3392722Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-09T19:18:07.3392832Z Version      : 3.227.0
2026-09-09T19:18:07.3392906Z Author       : Microsoft Corporation
2026-09-09T19:18:07.3392989Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-09T19:18:07.3393117Z ==============================================================================
2026-09-09T19:18:07.4691070Z Generating script.
2026-09-09T19:18:07.4702043Z ========================== Starting Command Output ===========================
2026-09-09T19:18:07.4709020Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/a1a821d1-9930-47d0-a732-9300b68e3bd1.sh
2026-09-09T19:18:07.5793927Z Waiting for rollout to finish: 0 out of 3 new replicas have been updated...
2026-09-09T19:18:10.1731322Z Waiting for rollout to finish: 0 out of 3 new replicas have been updated...
2026-09-09T19:24:14.8504097Z ##[error]The task has timed out.
2026-09-09T19:24:14.8505109Z ##[section]Finishing: Verificando Status do Deployment


2026-09-09T19:24:14.8526320Z ##[section]Starting: Logs da Aplicação
2026-09-09T19:24:14.8529695Z ==============================================================================
2026-09-09T19:24:14.8529774Z Task         : Bash
2026-09-09T19:24:14.8529816Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-09T19:24:14.8529886Z Version      : 3.227.0
2026-09-09T19:24:14.8529930Z Author       : Microsoft Corporation
2026-09-09T19:24:14.8529981Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-09T19:24:14.8530060Z ==============================================================================
2026-09-09T19:24:14.9869558Z Generating script.
2026-09-09T19:24:14.9880155Z ========================== Starting Command Output ===========================
2026-09-09T19:24:14.9887152Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/988f9c9a-2fd1-4eb4-88ba-13441b185037.sh
2026-09-09T19:24:14.9944802Z + shopt -s expand_aliases
2026-09-09T19:24:14.9944962Z + [[ -n okd4_nprd ]]
2026-09-09T19:24:14.9945121Z + [[ okd4_nprd =~ ocp ]]
2026-09-09T19:24:14.9945249Z + [[ -n okd4_nprd ]]
2026-09-09T19:24:14.9947922Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-09-09T19:24:14.9948252Z + app=sisgf-backend-des
2026-09-09T19:24:14.9948353Z + oc version
2026-09-09T19:24:15.0583416Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-09-09T19:24:15.0583715Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-09-09T19:24:15.0583915Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-09-09T19:24:15.0608163Z ++ oc get pod -l name=sisgf-backend-des -n sisgf-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-09T19:24:15.0608809Z ++ tac
2026-09-09T19:24:15.0610296Z ++ grep -v '^$'
2026-09-09T19:24:15.0610713Z ++ head -n1
2026-09-09T19:24:15.1459173Z + last_pod=sisgf-backend-des-370-gpc5z
2026-09-09T19:24:15.1459646Z + echo 'Logs do POD: sisgf-backend-des-370-gpc5z'
2026-09-09T19:24:15.1460352Z + oc logs sisgf-backend-des-370-gpc5z -c sisgf-backend-des -n sisgf-des
2026-09-09T19:24:15.1461066Z Logs do POD: sisgf-backend-des-370-gpc5z
2026-09-09T19:24:15.2274430Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|*.applicationinsights.azure.com|*.livediagnostics.monitor.azure.com -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-09-09T19:24:15.2275442Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-09T19:24:15.2275976Z 2026-09-09 15:05:05.599-03:00 INFO  c.m.applicationinsights.agent - ApplicationInsights Java Agent 3.3.1 started successfully (PID 8)
2026-09-09T19:24:15.2276570Z 2026-09-09 15:05:05.601-03:00 INFO  c.m.applicationinsights.agent - Java version: 17.0.7, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-17-openjdk-17.0.7.0.7-3.el8.x86_64
2026-09-09T19:24:15.2276887Z __  ____  __  _____   ___  __ ____  ______ 
2026-09-09T19:24:15.2277157Z  --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
2026-09-09T19:24:15.2277493Z  -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
2026-09-09T19:24:15.2277737Z --\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-09-09T19:24:15.2278171Z 2026-09-09 15:05:13,502 INFO  [io.micrometer.core.instrument.push.PushMeterRegistry] (main) Publishing metrics for AzureMonitorMeterRegistry every 1m
2026-09-09T19:24:15.2278988Z 2026-09-09 15:05:17.308-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - Unable to retrieve appId: exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (future warnings will be aggregated and logged once every 5 minutes)
2026-09-09T19:24:15.2279722Z reactor.core.Exceptions$ReactiveException: io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443
2026-09-09T19:24:15.2280823Z 	at reactor.core.Exceptions.propagate(Exceptions.java:392)
2026-09-09T19:24:15.2281138Z 	at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:97)
2026-09-09T19:24:15.2281456Z 	at reactor.core.publisher.Mono.block(Mono.java:1707)
2026-09-09T19:24:15.2281771Z 	at com.microsoft.applicationinsights.agent.internal.init.AppIdSupplier$GetAppIdTask.run(AppIdSupplier.java:139)
2026-09-09T19:24:15.2282130Z 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
2026-09-09T19:24:15.2282438Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-09-09T19:24:15.2282797Z 	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
2026-09-09T19:24:15.2283169Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-09-09T19:24:15.2283507Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-09-09T19:24:15.2283781Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-09-09T19:24:15.2284046Z 	Suppressed: java.lang.Exception: #block terminated with an error
2026-09-09T19:24:15.2284349Z 		at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:99)
2026-09-09T19:24:15.2284617Z 		... 8 common frames omitted
2026-09-09T19:24:15.2285071Z Caused by: io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443
2026-09-09T19:24:15.2285460Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$2.run(AbstractEpollChannel.java:613)
2026-09-09T19:24:15.2285802Z 	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
2026-09-09T19:24:15.2286324Z 	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:170)
2026-09-09T19:24:15.2286656Z 	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
2026-09-09T19:24:15.2287039Z 	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:469)
2026-09-09T19:24:15.2287482Z 	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:394)
2026-09-09T19:24:15.2287814Z 	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
2026-09-09T19:24:15.2288143Z 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
2026-09-09T19:24:15.2288450Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-09-09T19:24:15.2288701Z 	... 1 common frames omitted
2026-09-09T19:24:15.2289498Z 2026-09-09 15:05:17.896-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - Pinging live metrics endpoint: io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (future warnings will be aggregated and logged once every 5 minutes)
2026-09-09T19:24:15.2290144Z reactor.core.Exceptions$ReactiveException: io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443
2026-09-09T19:24:15.2290491Z 	at reactor.core.Exceptions.propagate(Exceptions.java:392)
2026-09-09T19:24:15.2290794Z 	at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:97)
2026-09-09T19:24:15.2291086Z 	at reactor.core.publisher.Mono.block(Mono.java:1707)
2026-09-09T19:24:15.2291408Z 	at com.azure.monitor.opentelemetry.exporter.implementation.quickpulse.QuickPulsePingSender.ping(QuickPulsePingSender.java:124)
2026-09-09T19:24:15.2291820Z 	at com.azure.monitor.opentelemetry.exporter.implementation.quickpulse.QuickPulseCoordinator.ping(QuickPulseCoordinator.java:110)
2026-09-09T19:24:15.2292233Z 	at com.azure.monitor.opentelemetry.exporter.implementation.quickpulse.QuickPulseCoordinator.run(QuickPulseCoordinator.java:67)
2026-09-09T19:24:15.2292699Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-09-09T19:24:15.2292925Z 	Suppressed: java.lang.Exception: #block terminated with an error
2026-09-09T19:24:15.2293244Z 		at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:99)
2026-09-09T19:24:15.2293508Z 		... 5 common frames omitted
2026-09-09T19:24:15.2293780Z Caused by: io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443
2026-09-09T19:24:15.2294161Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$2.run(AbstractEpollChannel.java:613)
2026-09-09T19:24:15.2294504Z 	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
2026-09-09T19:24:15.2294804Z 	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:170)
2026-09-09T19:24:15.2295132Z 	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
2026-09-09T19:24:15.2295512Z 	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:469)
2026-09-09T19:24:15.2295850Z 	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:394)
2026-09-09T19:24:15.2296180Z 	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
2026-09-09T19:24:15.2296469Z 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
2026-09-09T19:24:15.2296786Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-09-09T19:24:15.2297041Z 	... 1 common frames omitted
2026-09-09T19:24:15.2297945Z 2026-09-09 15:05:22.986-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service: connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (future warnings will be aggregated and logged once every 5 minutes)
2026-09-09T19:24:15.2298761Z io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443
2026-09-09T19:24:15.2299113Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$2.run(AbstractEpollChannel.java:613)
2026-09-09T19:24:15.2299420Z 	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
2026-09-09T19:24:15.2299722Z 	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:170)
2026-09-09T19:24:15.2300048Z 	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
2026-09-09T19:24:15.2300485Z 	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:469)
2026-09-09T19:24:15.2300813Z 	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:391)
2026-09-09T19:24:15.2301131Z 	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
2026-09-09T19:24:15.2301454Z 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
2026-09-09T19:24:15.2301912Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-09-09T19:24:15.2302198Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-09-09T19:24:15.2302987Z 2026-09-09 15:05:42.830-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service (retry from disk): connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (future warnings will be aggregated and logged once every 5 minutes)
2026-09-09T19:24:15.2303665Z io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443
2026-09-09T19:24:15.2304037Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$2.run(AbstractEpollChannel.java:613)
2026-09-09T19:24:15.2304492Z 	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
2026-09-09T19:24:15.2304920Z 	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:170)
2026-09-09T19:24:15.2305316Z 	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
2026-09-09T19:24:15.2307019Z 	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:469)
2026-09-09T19:24:15.2307483Z 	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:394)
2026-09-09T19:24:15.2307801Z 	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
2026-09-09T19:24:15.2308118Z 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
2026-09-09T19:24:15.2308436Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-09-09T19:24:15.2308732Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-09-09T19:24:15.2309524Z 2026-09-09 15:06:17.807-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service: connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (future warnings will be aggregated and logged once every 5 minutes)
2026-09-09T19:24:15.2310199Z io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443
2026-09-09T19:24:15.2310561Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$2.run(AbstractEpollChannel.java:613)
2026-09-09T19:24:15.2310869Z 	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
2026-09-09T19:24:15.2311185Z 	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:170)
2026-09-09T19:24:15.2311501Z 	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
2026-09-09T19:24:15.2311962Z 	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:469)
2026-09-09T19:24:15.2312276Z 	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:391)
2026-09-09T19:24:15.2312576Z 	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
2026-09-09T19:24:15.2312882Z 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
2026-09-09T19:24:15.2313185Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-09-09T19:24:15.2313464Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-09-09T19:24:15.2314231Z 2026-09-09 15:06:42.713-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service (retry from disk): connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (future warnings will be aggregated and logged once every 5 minutes)
2026-09-09T19:24:15.2314892Z io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443
2026-09-09T19:24:15.2315254Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$2.run(AbstractEpollChannel.java:613)
2026-09-09T19:24:15.2315568Z 	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
2026-09-09T19:24:15.2315859Z 	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:170)
2026-09-09T19:24:15.2316172Z 	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
2026-09-09T19:24:15.2316525Z 	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:469)
2026-09-09T19:24:15.2316847Z 	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:394)
2026-09-09T19:24:15.2317152Z 	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
2026-09-09T19:24:15.2317581Z 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
2026-09-09T19:24:15.2318019Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-09-09T19:24:15.2318291Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-09-09T19:24:15.2318787Z 2026-09-09 15:10:17.310-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 8 times: Unable to retrieve appId:
2026-09-09T19:24:15.2319342Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (8 times)
2026-09-09T19:24:15.2319926Z 2026-09-09 15:10:17.896-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 19 times (out of 19): Pinging live metrics endpoint:
2026-09-09T19:24:15.2320423Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (19 times)
2026-09-09T19:24:15.2321070Z 2026-09-09 15:10:22.987-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 1): Sending telemetry to the ingestion service:
2026-09-09T19:24:15.2321652Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:24:15.2322296Z 2026-09-09 15:10:42.830-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2322914Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:24:15.2323601Z 2026-09-09 15:11:17.808-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 9 times (out of 9): Sending telemetry to the ingestion service:
2026-09-09T19:24:15.2324209Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (9 times)
2026-09-09T19:24:15.2324840Z 2026-09-09 15:11:42.714-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2325475Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:24:15.2326043Z 2026-09-09 15:15:17.311-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:24:15.2326604Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:24:15.2327187Z 2026-09-09 15:15:17.897-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:24:15.2327779Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:24:15.2328444Z 2026-09-09 15:15:42.831-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2329051Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:24:15.2329648Z 2026-09-09 15:16:17.808-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:24:15.2330484Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (10 times)
2026-09-09T19:24:15.2331140Z 2026-09-09 15:16:42.715-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2331730Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:24:15.2332299Z 2026-09-09 15:20:17.312-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 5 times: Unable to retrieve appId:
2026-09-09T19:24:15.2332877Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (5 times)
2026-09-09T19:24:15.2333450Z 2026-09-09 15:20:17.898-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 22 times (out of 22): Pinging live metrics endpoint:
2026-09-09T19:24:15.2333933Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:24:15.2334448Z  * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (2 times)
2026-09-09T19:24:15.2335102Z 2026-09-09 15:20:42.832-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2335837Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (5 times)
2026-09-09T19:24:15.2336402Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (3 times)
2026-09-09T19:24:15.2337020Z 2026-09-09 15:21:17.809-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 11 times (out of 11): Sending telemetry to the ingestion service:
2026-09-09T19:24:15.2337711Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (9 times)
2026-09-09T19:24:15.2338233Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:24:15.2338865Z 2026-09-09 15:21:42.716-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2339460Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:24:15.2340019Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:24:15.2340619Z 2026-09-09 15:25:17.313-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:24:15.2341226Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:24:15.2341773Z 2026-09-09 15:25:17.898-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:24:15.2342380Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:24:15.2343052Z 2026-09-09 15:25:42.832-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2343661Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (6 times)
2026-09-09T19:24:15.2344207Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:24:15.2344802Z 2026-09-09 15:26:17.810-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:24:15.2345379Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:24:15.2345943Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (3 times)
2026-09-09T19:24:15.2346561Z 2026-09-09 15:26:42.716-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2347225Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (5 times)
2026-09-09T19:24:15.2347896Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:24:15.2348471Z 2026-09-09 15:30:17.313-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:24:15.2349018Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:24:15.2349557Z 2026-09-09 15:30:17.899-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:24:15.2350043Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:24:15.2350717Z 2026-09-09 15:30:42.833-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2351296Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:24:15.2351849Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:24:15.2352436Z 2026-09-09 15:31:17.811-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:24:15.2353021Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:24:15.2353686Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:24:15.2354282Z 2026-09-09 15:31:42.717-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2354869Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (5 times)
2026-09-09T19:24:15.2355396Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (3 times)
2026-09-09T19:24:15.2355955Z 2026-09-09 15:35:17.314-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:24:15.2356510Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:24:15.2357075Z 2026-09-09 15:35:17.900-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:24:15.2357639Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:24:15.2358323Z 2026-09-09 15:35:42.833-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2358999Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:24:15.2359576Z 2026-09-09 15:36:17.811-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 11 times (out of 11): Sending telemetry to the ingestion service:
2026-09-09T19:24:15.2360210Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (11 times)
2026-09-09T19:24:15.2360854Z 2026-09-09 15:36:42.717-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2361436Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:24:15.2361984Z 2026-09-09 15:40:17.315-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 5 times: Unable to retrieve appId:
2026-09-09T19:24:15.2362519Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (5 times)
2026-09-09T19:24:15.2363076Z 2026-09-09 15:40:17.900-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 19 times (out of 19): Pinging live metrics endpoint:
2026-09-09T19:24:15.2363546Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (19 times)
2026-09-09T19:24:15.2364196Z 2026-09-09 15:40:42.834-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2364884Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:24:15.2365483Z 2026-09-09 15:41:17.812-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:24:15.2366084Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (10 times)
2026-09-09T19:24:15.2366699Z 2026-09-09 15:41:42.718-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2367389Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:24:15.2367972Z 2026-09-09 15:45:17.315-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:24:15.2368530Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:24:15.2369101Z 2026-09-09 15:45:17.901-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:24:15.2369587Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:24:15.2370350Z 2026-09-09 15:45:42.835-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2370947Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:24:15.2371543Z 2026-09-09 15:46:17.812-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:24:15.2372159Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:24:15.2372736Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:24:15.2373371Z 2026-09-09 15:46:42.719-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2373966Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (5 times)
2026-09-09T19:24:15.2374538Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:24:15.2375135Z 2026-09-09 15:50:17.316-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:24:15.2375697Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:24:15.2376262Z 2026-09-09 15:50:17.902-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:24:15.2376881Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:24:15.2377635Z 2026-09-09 15:50:42.835-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2378388Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:24:15.2379013Z 2026-09-09 15:51:17.813-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 11 times (out of 11): Sending telemetry to the ingestion service:
2026-09-09T19:24:15.2379623Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (11 times)
2026-09-09T19:24:15.2380232Z 2026-09-09 15:51:42.719-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2380758Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:24:15.2381124Z 2026-09-09 15:55:17.317-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 5 times: Unable to retrieve appId:
2026-09-09T19:24:15.2381452Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (5 times)
2026-09-09T19:24:15.2381906Z 2026-09-09 15:55:17.902-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:24:15.2382187Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:24:15.2382592Z 2026-09-09 15:55:42.836-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2382942Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (6 times)
2026-09-09T19:24:15.2383281Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:24:15.2383643Z 2026-09-09 15:56:17.814-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:24:15.2383995Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (6 times)
2026-09-09T19:24:15.2384332Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:24:15.2384594Z  * null (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:24:15.2384921Z 2026-09-09 15:56:42.720-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2385337Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (5 times)
2026-09-09T19:24:15.2385668Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:24:15.2385926Z  * null (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:24:15.2386228Z 2026-09-09 16:00:17.317-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:24:15.2386561Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:24:15.2386907Z 2026-09-09 16:00:17.903-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 22 times (out of 22): Pinging live metrics endpoint:
2026-09-09T19:24:15.2387181Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:24:15.2387920Z  * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (2 times)
2026-09-09T19:24:15.2388314Z 2026-09-09 16:00:42.837-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2388966Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:24:15.2389600Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:24:15.2390358Z 2026-09-09 16:01:17.814-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:24:15.2390976Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:24:15.2391562Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:24:15.2392154Z 2026-09-09 16:01:42.721-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2392751Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (5 times)
2026-09-09T19:24:15.2393328Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:24:15.2393894Z 2026-09-09 16:05:17.318-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:24:15.2394433Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:24:15.2394989Z 2026-09-09 16:05:17.904-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:24:15.2395450Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:24:15.2396245Z 2026-09-09 16:05:42.837-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2396856Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:24:15.2397549Z 2026-09-09 16:06:17.815-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 11 times (out of 11): Sending telemetry to the ingestion service:
2026-09-09T19:24:15.2398142Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (11 times)
2026-09-09T19:24:15.2398861Z 2026-09-09 16:06:42.721-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2399439Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (6 times)
2026-09-09T19:24:15.2399978Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:24:15.2400531Z 2026-09-09 16:10:17.318-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:24:15.2401059Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:24:15.2401714Z 2026-09-09 16:10:17.904-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:24:15.2402184Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:24:15.2402848Z 2026-09-09 16:10:42.838-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2403446Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (6 times)
2026-09-09T19:24:15.2404011Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:24:15.2404610Z 2026-09-09 16:11:17.815-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:24:15.2405190Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:24:15.2405825Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:24:15.2406464Z 2026-09-09 16:11:42.722-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2407057Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:24:15.2407875Z 2026-09-09 16:15:17.319-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 5 times: Unable to retrieve appId:
2026-09-09T19:24:15.2408539Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (5 times)
2026-09-09T19:24:15.2409119Z 2026-09-09 16:15:17.905-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:24:15.2409508Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:24:15.2410208Z 2026-09-09 16:15:42.838-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2410827Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:24:15.2411438Z 2026-09-09 16:16:17.816-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:24:15.2412025Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (10 times)
2026-09-09T19:24:15.2412646Z 2026-09-09 16:16:42.722-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2413335Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:24:15.2413915Z 2026-09-09 16:20:17.320-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:24:15.2414456Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:24:15.2415033Z 2026-09-09 16:20:17.905-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 21 times (out of 21): Pinging live metrics endpoint:
2026-09-09T19:24:15.2415499Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (19 times)
2026-09-09T19:24:15.2415902Z  * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (2 times)
2026-09-09T19:24:15.2416497Z 2026-09-09 16:20:42.839-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2417111Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:24:15.2417885Z 2026-09-09 16:21:17.817-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 11 times (out of 11): Sending telemetry to the ingestion service:
2026-09-09T19:24:15.2418484Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (11 times)
2026-09-09T19:24:15.2419119Z 2026-09-09 16:21:42.723-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:24:15.2419848Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (6 times)
2026-09-09T19:24:15.2420558Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:24:15.2424093Z ##[section]Finishing: Logs da Aplicação
