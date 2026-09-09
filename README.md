026-09-09T19:27:52.9786405Z ##[section]Starting: Verificando Status do Deployment
2026-09-09T19:27:52.9789781Z ==============================================================================
2026-09-09T19:27:52.9789859Z Task         : Bash
2026-09-09T19:27:52.9789903Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-09T19:27:52.9790006Z Version      : 3.227.0
2026-09-09T19:27:52.9790049Z Author       : Microsoft Corporation
2026-09-09T19:27:52.9790100Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-09T19:27:52.9790192Z ==============================================================================
2026-09-09T19:27:53.1341771Z Generating script.
2026-09-09T19:27:53.1345630Z ========================== Starting Command Output ===========================
2026-09-09T19:27:53.1352758Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/cce9cace-1335-46d2-a589-d1139940fb1e.sh
2026-09-09T19:27:53.2224988Z Waiting for rollout to finish: 0 out of 3 new replicas have been updated...
2026-09-09T19:27:55.8210843Z Waiting for rollout to finish: 0 out of 3 new replicas have been updated...
2026-09-09T19:34:00.4931408Z ##[error]The task has timed out.
2026-09-09T19:34:00.4933098Z ##[section]Finishing: Verificando Status do Deployment



2026-09-09T19:34:00.4959573Z ##[section]Starting: Logs da Aplicação
2026-09-09T19:34:00.4963884Z ==============================================================================
2026-09-09T19:34:00.4963967Z Task         : Bash
2026-09-09T19:34:00.4964011Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-09T19:34:00.4964117Z Version      : 3.227.0
2026-09-09T19:34:00.4964160Z Author       : Microsoft Corporation
2026-09-09T19:34:00.4964210Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-09T19:34:00.4964308Z ==============================================================================
2026-09-09T19:34:00.6646589Z Generating script.
2026-09-09T19:34:00.6657636Z ========================== Starting Command Output ===========================
2026-09-09T19:34:00.6665153Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/bc953d0c-00da-462b-9418-6c7af2df2b0c.sh
2026-09-09T19:34:00.6719975Z + shopt -s expand_aliases
2026-09-09T19:34:00.6720201Z + [[ -n okd4_nprd ]]
2026-09-09T19:34:00.6720420Z + [[ okd4_nprd =~ ocp ]]
2026-09-09T19:34:00.6720671Z + [[ -n okd4_nprd ]]
2026-09-09T19:34:00.6720812Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-09-09T19:34:00.6720993Z + app=sisgf-backend-des
2026-09-09T19:34:00.6721127Z + oc version
2026-09-09T19:34:00.7479862Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-09-09T19:34:00.7480835Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-09-09T19:34:00.7481730Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-09-09T19:34:00.7516118Z ++ oc get pod -l name=sisgf-backend-des -n sisgf-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-09T19:34:00.7516903Z ++ tac
2026-09-09T19:34:00.7517572Z ++ grep -v '^$'
2026-09-09T19:34:00.7518189Z ++ head -n1
2026-09-09T19:34:00.8584932Z + last_pod=sisgf-backend-des-370-gpc5z
2026-09-09T19:34:00.8586230Z + echo 'Logs do POD: sisgf-backend-des-370-gpc5z'
2026-09-09T19:34:00.8586497Z + oc logs sisgf-backend-des-370-gpc5z -c sisgf-backend-des -n sisgf-des
2026-09-09T19:34:00.8587018Z Logs do POD: sisgf-backend-des-370-gpc5z
2026-09-09T19:34:00.9524517Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|*.applicationinsights.azure.com|*.livediagnostics.monitor.azure.com -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-09-09T19:34:00.9525739Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-09T19:34:00.9526298Z 2026-09-09 15:05:05.599-03:00 INFO  c.m.applicationinsights.agent - ApplicationInsights Java Agent 3.3.1 started successfully (PID 8)
2026-09-09T19:34:00.9527169Z 2026-09-09 15:05:05.601-03:00 INFO  c.m.applicationinsights.agent - Java version: 17.0.7, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-17-openjdk-17.0.7.0.7-3.el8.x86_64
2026-09-09T19:34:00.9527800Z __  ____  __  _____   ___  __ ____  ______ 
2026-09-09T19:34:00.9528095Z  --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
2026-09-09T19:34:00.9528316Z  -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
2026-09-09T19:34:00.9528599Z --\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-09-09T19:34:00.9529096Z 2026-09-09 15:05:13,502 INFO  [io.micrometer.core.instrument.push.PushMeterRegistry] (main) Publishing metrics for AzureMonitorMeterRegistry every 1m
2026-09-09T19:34:00.9529931Z 2026-09-09 15:05:17.308-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - Unable to retrieve appId: exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (future warnings will be aggregated and logged once every 5 minutes)
2026-09-09T19:34:00.9530704Z reactor.core.Exceptions$ReactiveException: io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443
2026-09-09T19:34:00.9531676Z 	at reactor.core.Exceptions.propagate(Exceptions.java:392)
2026-09-09T19:34:00.9532021Z 	at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:97)
2026-09-09T19:34:00.9532354Z 	at reactor.core.publisher.Mono.block(Mono.java:1707)
2026-09-09T19:34:00.9532664Z 	at com.microsoft.applicationinsights.agent.internal.init.AppIdSupplier$GetAppIdTask.run(AppIdSupplier.java:139)
2026-09-09T19:34:00.9533043Z 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
2026-09-09T19:34:00.9533404Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-09-09T19:34:00.9533786Z 	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
2026-09-09T19:34:00.9534179Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-09-09T19:34:00.9534546Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-09-09T19:34:00.9534818Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-09-09T19:34:00.9535142Z 	Suppressed: java.lang.Exception: #block terminated with an error
2026-09-09T19:34:00.9535470Z 		at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:99)
2026-09-09T19:34:00.9535761Z 		... 8 common frames omitted
2026-09-09T19:34:00.9536265Z Caused by: io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443
2026-09-09T19:34:00.9536685Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$2.run(AbstractEpollChannel.java:613)
2026-09-09T19:34:00.9537004Z 	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
2026-09-09T19:34:00.9537461Z 	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:170)
2026-09-09T19:34:00.9538077Z 	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
2026-09-09T19:34:00.9538465Z 	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:469)
2026-09-09T19:34:00.9538831Z 	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:394)
2026-09-09T19:34:00.9539175Z 	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
2026-09-09T19:34:00.9539480Z 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
2026-09-09T19:34:00.9539874Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-09-09T19:34:00.9540236Z 	... 1 common frames omitted
2026-09-09T19:34:00.9540937Z 2026-09-09 15:05:17.896-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - Pinging live metrics endpoint: io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (future warnings will be aggregated and logged once every 5 minutes)
2026-09-09T19:34:00.9541402Z reactor.core.Exceptions$ReactiveException: io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443
2026-09-09T19:34:00.9541640Z 	at reactor.core.Exceptions.propagate(Exceptions.java:392)
2026-09-09T19:34:00.9541848Z 	at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:97)
2026-09-09T19:34:00.9542053Z 	at reactor.core.publisher.Mono.block(Mono.java:1707)
2026-09-09T19:34:00.9542244Z 	at com.azure.monitor.opentelemetry.exporter.implementation.quickpulse.QuickPulsePingSender.ping(QuickPulsePingSender.java:124)
2026-09-09T19:34:00.9542515Z 	at com.azure.monitor.opentelemetry.exporter.implementation.quickpulse.QuickPulseCoordinator.ping(QuickPulseCoordinator.java:110)
2026-09-09T19:34:00.9542784Z 	at com.azure.monitor.opentelemetry.exporter.implementation.quickpulse.QuickPulseCoordinator.run(QuickPulseCoordinator.java:67)
2026-09-09T19:34:00.9543113Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-09-09T19:34:00.9543287Z 	Suppressed: java.lang.Exception: #block terminated with an error
2026-09-09T19:34:00.9543506Z 		at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:99)
2026-09-09T19:34:00.9543656Z 		... 5 common frames omitted
2026-09-09T19:34:00.9543979Z Caused by: io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443
2026-09-09T19:34:00.9544194Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$2.run(AbstractEpollChannel.java:613)
2026-09-09T19:34:00.9544416Z 	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
2026-09-09T19:34:00.9544635Z 	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:170)
2026-09-09T19:34:00.9544857Z 	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
2026-09-09T19:34:00.9545091Z 	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:469)
2026-09-09T19:34:00.9545313Z 	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:394)
2026-09-09T19:34:00.9545492Z 	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
2026-09-09T19:34:00.9545727Z 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
2026-09-09T19:34:00.9545944Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-09-09T19:34:00.9546125Z 	... 1 common frames omitted
2026-09-09T19:34:00.9546626Z 2026-09-09 15:05:22.986-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service: connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (future warnings will be aggregated and logged once every 5 minutes)
2026-09-09T19:34:00.9547086Z io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443
2026-09-09T19:34:00.9547468Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$2.run(AbstractEpollChannel.java:613)
2026-09-09T19:34:00.9547665Z 	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
2026-09-09T19:34:00.9547876Z 	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:170)
2026-09-09T19:34:00.9548092Z 	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
2026-09-09T19:34:00.9548322Z 	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:469)
2026-09-09T19:34:00.9548541Z 	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:391)
2026-09-09T19:34:00.9548752Z 	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
2026-09-09T19:34:00.9548988Z 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
2026-09-09T19:34:00.9549165Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-09-09T19:34:00.9549384Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-09-09T19:34:00.9549899Z 2026-09-09 15:05:42.830-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service (retry from disk): connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (future warnings will be aggregated and logged once every 5 minutes)
2026-09-09T19:34:00.9550338Z io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443
2026-09-09T19:34:00.9550579Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$2.run(AbstractEpollChannel.java:613)
2026-09-09T19:34:00.9550838Z 	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
2026-09-09T19:34:00.9551041Z 	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:170)
2026-09-09T19:34:00.9551223Z 	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
2026-09-09T19:34:00.9551470Z 	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:469)
2026-09-09T19:34:00.9551684Z 	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:394)
2026-09-09T19:34:00.9551919Z 	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
2026-09-09T19:34:00.9552134Z 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
2026-09-09T19:34:00.9552344Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-09-09T19:34:00.9552510Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-09-09T19:34:00.9552998Z 2026-09-09 15:06:17.807-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service: connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (future warnings will be aggregated and logged once every 5 minutes)
2026-09-09T19:34:00.9553496Z io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443
2026-09-09T19:34:00.9553746Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$2.run(AbstractEpollChannel.java:613)
2026-09-09T19:34:00.9553972Z 	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
2026-09-09T19:34:00.9554201Z 	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:170)
2026-09-09T19:34:00.9554417Z 	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
2026-09-09T19:34:00.9554642Z 	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:469)
2026-09-09T19:34:00.9554867Z 	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:391)
2026-09-09T19:34:00.9555095Z 	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
2026-09-09T19:34:00.9555312Z 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
2026-09-09T19:34:00.9555543Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-09-09T19:34:00.9555763Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-09-09T19:34:00.9556266Z 2026-09-09 15:06:42.713-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service (retry from disk): connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (future warnings will be aggregated and logged once every 5 minutes)
2026-09-09T19:34:00.9556697Z io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443
2026-09-09T19:34:00.9556906Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$2.run(AbstractEpollChannel.java:613)
2026-09-09T19:34:00.9557121Z 	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
2026-09-09T19:34:00.9557391Z 	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:170)
2026-09-09T19:34:00.9557612Z 	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
2026-09-09T19:34:00.9557841Z 	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:469)
2026-09-09T19:34:00.9558064Z 	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:394)
2026-09-09T19:34:00.9558238Z 	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
2026-09-09T19:34:00.9558479Z 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
2026-09-09T19:34:00.9558731Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-09-09T19:34:00.9558929Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-09-09T19:34:00.9559260Z 2026-09-09 15:10:17.310-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 8 times: Unable to retrieve appId:
2026-09-09T19:34:00.9559639Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (8 times)
2026-09-09T19:34:00.9560031Z 2026-09-09 15:10:17.896-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 19 times (out of 19): Pinging live metrics endpoint:
2026-09-09T19:34:00.9560302Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (19 times)
2026-09-09T19:34:00.9560908Z 2026-09-09 15:10:22.987-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 1): Sending telemetry to the ingestion service:
2026-09-09T19:34:00.9561299Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:34:00.9561710Z 2026-09-09 15:10:42.830-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9562102Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:34:00.9562494Z 2026-09-09 15:11:17.808-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 9 times (out of 9): Sending telemetry to the ingestion service:
2026-09-09T19:34:00.9562912Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (9 times)
2026-09-09T19:34:00.9563320Z 2026-09-09 15:11:42.714-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9563726Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:34:00.9564092Z 2026-09-09 15:15:17.311-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:34:00.9564455Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:34:00.9564795Z 2026-09-09 15:15:17.897-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:34:00.9565098Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:34:00.9565523Z 2026-09-09 15:15:42.831-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9565907Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:34:00.9566299Z 2026-09-09 15:16:17.808-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:34:00.9566724Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (10 times)
2026-09-09T19:34:00.9567142Z 2026-09-09 15:16:42.715-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9567658Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:34:00.9568023Z 2026-09-09 15:20:17.312-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 5 times: Unable to retrieve appId:
2026-09-09T19:34:00.9568385Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (5 times)
2026-09-09T19:34:00.9568756Z 2026-09-09 15:20:17.898-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 22 times (out of 22): Pinging live metrics endpoint:
2026-09-09T19:34:00.9569023Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:34:00.9569281Z  * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (2 times)
2026-09-09T19:34:00.9569658Z 2026-09-09 15:20:42.832-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9570076Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (5 times)
2026-09-09T19:34:00.9570467Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (3 times)
2026-09-09T19:34:00.9570865Z 2026-09-09 15:21:17.809-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 11 times (out of 11): Sending telemetry to the ingestion service:
2026-09-09T19:34:00.9571242Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (9 times)
2026-09-09T19:34:00.9571602Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:34:00.9572007Z 2026-09-09 15:21:42.716-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9572401Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:34:00.9572759Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:34:00.9573088Z 2026-09-09 15:25:17.313-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:34:00.9573444Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:34:00.9573839Z 2026-09-09 15:25:17.898-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:34:00.9574173Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:34:00.9574599Z 2026-09-09 15:25:42.832-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9574984Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (6 times)
2026-09-09T19:34:00.9575358Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:34:00.9575744Z 2026-09-09 15:26:17.810-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:34:00.9576114Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:34:00.9576474Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (3 times)
2026-09-09T19:34:00.9576828Z 2026-09-09 15:26:42.716-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9577223Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (5 times)
2026-09-09T19:34:00.9577691Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:34:00.9578050Z 2026-09-09 15:30:17.313-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:34:00.9578548Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:34:00.9578921Z 2026-09-09 15:30:17.899-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:34:00.9579190Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:34:00.9579626Z 2026-09-09 15:30:42.833-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9580007Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:34:00.9580393Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:34:00.9580828Z 2026-09-09 15:31:17.811-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:34:00.9581224Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:34:00.9581626Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:34:00.9582017Z 2026-09-09 15:31:42.717-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9582392Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (5 times)
2026-09-09T19:34:00.9582750Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (3 times)
2026-09-09T19:34:00.9583114Z 2026-09-09 15:35:17.314-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:34:00.9583445Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:34:00.9583839Z 2026-09-09 15:35:17.900-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:34:00.9584149Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:34:00.9584580Z 2026-09-09 15:35:42.833-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9584991Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:34:00.9585376Z 2026-09-09 15:36:17.811-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 11 times (out of 11): Sending telemetry to the ingestion service:
2026-09-09T19:34:00.9585753Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (11 times)
2026-09-09T19:34:00.9586148Z 2026-09-09 15:36:42.717-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9586521Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:34:00.9586918Z 2026-09-09 15:40:17.315-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 5 times: Unable to retrieve appId:
2026-09-09T19:34:00.9587401Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (5 times)
2026-09-09T19:34:00.9587753Z 2026-09-09 15:40:17.900-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 19 times (out of 19): Pinging live metrics endpoint:
2026-09-09T19:34:00.9588048Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (19 times)
2026-09-09T19:34:00.9588471Z 2026-09-09 15:40:42.834-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9588891Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:34:00.9589276Z 2026-09-09 15:41:17.812-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:34:00.9589651Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (10 times)
2026-09-09T19:34:00.9590053Z 2026-09-09 15:41:42.718-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9590449Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:34:00.9590815Z 2026-09-09 15:45:17.315-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:34:00.9591167Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:34:00.9591535Z 2026-09-09 15:45:17.901-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:34:00.9591797Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:34:00.9592215Z 2026-09-09 15:45:42.835-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9592621Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:34:00.9593015Z 2026-09-09 15:46:17.812-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:34:00.9593385Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:34:00.9593761Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:34:00.9594154Z 2026-09-09 15:46:42.719-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9594528Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (5 times)
2026-09-09T19:34:00.9594883Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:34:00.9595243Z 2026-09-09 15:50:17.316-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:34:00.9595597Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:34:00.9595934Z 2026-09-09 15:50:17.902-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:34:00.9596268Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:34:00.9596694Z 2026-09-09 15:50:42.835-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9597086Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:34:00.9597570Z 2026-09-09 15:51:17.813-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 11 times (out of 11): Sending telemetry to the ingestion service:
2026-09-09T19:34:00.9597955Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (11 times)
2026-09-09T19:34:00.9598350Z 2026-09-09 15:51:42.719-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9598727Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:34:00.9599097Z 2026-09-09 15:55:17.317-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 5 times: Unable to retrieve appId:
2026-09-09T19:34:00.9599452Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (5 times)
2026-09-09T19:34:00.9599855Z 2026-09-09 15:55:17.902-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:34:00.9600113Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:34:00.9600558Z 2026-09-09 15:55:42.836-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9600935Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (6 times)
2026-09-09T19:34:00.9601295Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:34:00.9601683Z 2026-09-09 15:56:17.814-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:34:00.9602065Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (6 times)
2026-09-09T19:34:00.9602424Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:34:00.9602718Z  * null (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:34:00.9603082Z 2026-09-09 15:56:42.720-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9603506Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (5 times)
2026-09-09T19:34:00.9603832Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:34:00.9604157Z  * null (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:34:00.9604487Z 2026-09-09 16:00:17.317-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:34:00.9604863Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:34:00.9605425Z 2026-09-09 16:00:17.903-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 22 times (out of 22): Pinging live metrics endpoint:
2026-09-09T19:34:00.9605736Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:34:00.9605997Z  * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (2 times)
2026-09-09T19:34:00.9606364Z 2026-09-09 16:00:42.837-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9606770Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:34:00.9607096Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:34:00.9607606Z 2026-09-09 16:01:17.814-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:34:00.9607990Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:34:00.9608347Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:34:00.9608732Z 2026-09-09 16:01:42.721-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9609105Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (5 times)
2026-09-09T19:34:00.9609463Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:34:00.9609824Z 2026-09-09 16:05:17.318-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:34:00.9610206Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:34:00.9610585Z 2026-09-09 16:05:17.904-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:34:00.9610886Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:34:00.9611317Z 2026-09-09 16:05:42.837-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9611703Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:34:00.9612088Z 2026-09-09 16:06:17.815-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 11 times (out of 11): Sending telemetry to the ingestion service:
2026-09-09T19:34:00.9612463Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (11 times)
2026-09-09T19:34:00.9612867Z 2026-09-09 16:06:42.721-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9613288Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (6 times)
2026-09-09T19:34:00.9613701Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:34:00.9614064Z 2026-09-09 16:10:17.318-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:34:00.9614424Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:34:00.9614825Z 2026-09-09 16:10:17.904-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:34:00.9615128Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:34:00.9615513Z 2026-09-09 16:10:42.838-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9615894Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (6 times)
2026-09-09T19:34:00.9616258Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:34:00.9616666Z 2026-09-09 16:11:17.815-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:34:00.9617055Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:34:00.9617477Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:34:00.9617872Z 2026-09-09 16:11:42.722-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9618251Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:34:00.9618647Z 2026-09-09 16:15:17.319-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 5 times: Unable to retrieve appId:
2026-09-09T19:34:00.9619006Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (5 times)
2026-09-09T19:34:00.9619344Z 2026-09-09 16:15:17.905-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:34:00.9619654Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:34:00.9620079Z 2026-09-09 16:15:42.838-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9620484Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:34:00.9620869Z 2026-09-09 16:16:17.816-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:34:00.9621242Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (10 times)
2026-09-09T19:34:00.9621632Z 2026-09-09 16:16:42.722-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9622039Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:34:00.9622470Z 2026-09-09 16:20:17.320-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:34:00.9622944Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:34:00.9623317Z 2026-09-09 16:20:17.905-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 21 times (out of 21): Pinging live metrics endpoint:
2026-09-09T19:34:00.9623623Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (19 times)
2026-09-09T19:34:00.9623908Z  * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (2 times)
2026-09-09T19:34:00.9624278Z 2026-09-09 16:20:42.839-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9624657Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:34:00.9625045Z 2026-09-09 16:21:17.817-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 11 times (out of 11): Sending telemetry to the ingestion service:
2026-09-09T19:34:00.9625418Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (11 times)
2026-09-09T19:34:00.9625828Z 2026-09-09 16:21:42.723-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9626236Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (6 times)
2026-09-09T19:34:00.9626593Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:34:00.9626968Z 2026-09-09 16:25:17.320-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:34:00.9627397Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:34:00.9627744Z 2026-09-09 16:25:17.906-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:34:00.9628040Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:34:00.9628460Z 2026-09-09 16:25:42.839-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9628844Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:34:00.9629227Z 2026-09-09 16:26:17.817-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:34:00.9629641Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (10 times)
2026-09-09T19:34:00.9630030Z 2026-09-09 16:26:42.724-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9630425Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:34:00.9630787Z 2026-09-09 16:30:17.321-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 5 times: Unable to retrieve appId:
2026-09-09T19:34:00.9631141Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (5 times)
2026-09-09T19:34:00.9631521Z 2026-09-09 16:30:17.906-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:34:00.9631783Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:34:00.9632200Z 2026-09-09 16:30:42.840-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9632576Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (5 times)
2026-09-09T19:34:00.9632937Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (3 times)
2026-09-09T19:34:00.9633353Z 2026-09-09 16:31:17.818-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:34:00.9633739Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (6 times)
2026-09-09T19:34:00.9634097Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (4 times)
2026-09-09T19:34:00.9634500Z 2026-09-09 16:31:42.724-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:34:00.9634877Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (4 times)
2026-09-09T19:34:00.9635248Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (3 times)
2026-09-09T19:34:00.9646546Z ##[section]Finishing: Logs da Aplicação
