2026-09-09T19:43:10.5543092Z ##[section]Starting: Verificando Status do Deployment
2026-09-09T19:43:10.5546153Z ==============================================================================
2026-09-09T19:43:10.5546270Z Task         : Bash
2026-09-09T19:43:10.5546350Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-09T19:43:10.5546434Z Version      : 3.227.0
2026-09-09T19:43:10.5546511Z Author       : Microsoft Corporation
2026-09-09T19:43:10.5546581Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-09T19:43:10.5546654Z ==============================================================================
2026-09-09T19:43:10.7063248Z Generating script.
2026-09-09T19:43:10.7074220Z ========================== Starting Command Output ===========================
2026-09-09T19:43:10.7081065Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/7dbe0337-e9b5-4a5b-b849-ed090c2dd967.sh
2026-09-09T19:43:10.7966195Z Waiting for rollout to finish: 0 out of 3 new replicas have been updated...
2026-09-09T19:43:12.8498129Z Waiting for rollout to finish: 0 out of 3 new replicas have been updated...
2026-09-09T19:49:18.0662038Z ##[error]The task has timed out.
2026-09-09T19:49:18.0663491Z ##[section]Finishing: Verificando Status do Deployment



2026-09-09T19:49:18.0694279Z ##[section]Starting: Logs da Aplicação
2026-09-09T19:49:18.0698770Z ==============================================================================
2026-09-09T19:49:18.0698938Z Task         : Bash
2026-09-09T19:49:18.0699000Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-09T19:49:18.0699125Z Version      : 3.227.0
2026-09-09T19:49:18.0699195Z Author       : Microsoft Corporation
2026-09-09T19:49:18.0699273Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-09T19:49:18.0699379Z ==============================================================================
2026-09-09T19:49:18.2230699Z Generating script.
2026-09-09T19:49:18.2242392Z ========================== Starting Command Output ===========================
2026-09-09T19:49:18.2249791Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/ccaec2b7-144a-4c1e-ae23-5b3c4081daad.sh
2026-09-09T19:49:18.2309666Z + shopt -s expand_aliases
2026-09-09T19:49:18.2309887Z + [[ -n okd4_nprd ]]
2026-09-09T19:49:18.2310032Z + [[ okd4_nprd =~ ocp ]]
2026-09-09T19:49:18.2310166Z + [[ -n okd4_nprd ]]
2026-09-09T19:49:18.2310275Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-09-09T19:49:18.2310423Z + app=sisgf-backend-des
2026-09-09T19:49:18.2310644Z + oc version
2026-09-09T19:49:18.3005540Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-09-09T19:49:18.3005861Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-09-09T19:49:18.3006052Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-09-09T19:49:18.3036081Z ++ oc get pod -l name=sisgf-backend-des -n sisgf-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-09T19:49:18.3036809Z ++ tac
2026-09-09T19:49:18.3037392Z ++ grep -v '^$'
2026-09-09T19:49:18.3037896Z ++ head -n1
2026-09-09T19:49:18.3944985Z + last_pod=sisgf-backend-des-370-gpc5z
2026-09-09T19:49:18.3945289Z + echo 'Logs do POD: sisgf-backend-des-370-gpc5z'
2026-09-09T19:49:18.3946074Z + oc logs sisgf-backend-des-370-gpc5z -c sisgf-backend-des -n sisgf-des
2026-09-09T19:49:18.3946653Z Logs do POD: sisgf-backend-des-370-gpc5z
2026-09-09T19:49:18.4785326Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|*.applicationinsights.azure.com|*.livediagnostics.monitor.azure.com -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-09-09T19:49:18.4786145Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-09T19:49:18.4786449Z 2026-09-09 15:05:05.599-03:00 INFO  c.m.applicationinsights.agent - ApplicationInsights Java Agent 3.3.1 started successfully (PID 8)
2026-09-09T19:49:18.4786798Z 2026-09-09 15:05:05.601-03:00 INFO  c.m.applicationinsights.agent - Java version: 17.0.7, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-17-openjdk-17.0.7.0.7-3.el8.x86_64
2026-09-09T19:49:18.4787016Z __  ____  __  _____   ___  __ ____  ______ 
2026-09-09T19:49:18.4787179Z  --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
2026-09-09T19:49:18.4787331Z  -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
2026-09-09T19:49:18.4787476Z --\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-09-09T19:49:18.4787744Z 2026-09-09 15:05:13,502 INFO  [io.micrometer.core.instrument.push.PushMeterRegistry] (main) Publishing metrics for AzureMonitorMeterRegistry every 1m
2026-09-09T19:49:18.4788225Z 2026-09-09 15:05:17.308-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - Unable to retrieve appId: exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (future warnings will be aggregated and logged once every 5 minutes)
2026-09-09T19:49:18.4788662Z reactor.core.Exceptions$ReactiveException: io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443
2026-09-09T19:49:18.4789281Z 	at reactor.core.Exceptions.propagate(Exceptions.java:392)
2026-09-09T19:49:18.4789467Z 	at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:97)
2026-09-09T19:49:18.4789644Z 	at reactor.core.publisher.Mono.block(Mono.java:1707)
2026-09-09T19:49:18.4789829Z 	at com.microsoft.applicationinsights.agent.internal.init.AppIdSupplier$GetAppIdTask.run(AppIdSupplier.java:139)
2026-09-09T19:49:18.4790033Z 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
2026-09-09T19:49:18.4790214Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-09-09T19:49:18.4790421Z 	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
2026-09-09T19:49:18.4790777Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
2026-09-09T19:49:18.4790978Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-09-09T19:49:18.4791139Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-09-09T19:49:18.4791288Z 	Suppressed: java.lang.Exception: #block terminated with an error
2026-09-09T19:49:18.4791467Z 		at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:99)
2026-09-09T19:49:18.4791623Z 		... 8 common frames omitted
2026-09-09T19:49:18.4791937Z Caused by: io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443
2026-09-09T19:49:18.4792235Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$2.run(AbstractEpollChannel.java:613)
2026-09-09T19:49:18.4792431Z 	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
2026-09-09T19:49:18.4792724Z 	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:170)
2026-09-09T19:49:18.4793140Z 	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
2026-09-09T19:49:18.4793479Z 	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:469)
2026-09-09T19:49:18.4793793Z 	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:394)
2026-09-09T19:49:18.4794015Z 	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
2026-09-09T19:49:18.4794209Z 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
2026-09-09T19:49:18.4794399Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-09-09T19:49:18.4794556Z 	... 1 common frames omitted
2026-09-09T19:49:18.4795095Z 2026-09-09 15:05:17.896-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - Pinging live metrics endpoint: io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (future warnings will be aggregated and logged once every 5 minutes)
2026-09-09T19:49:18.4795451Z reactor.core.Exceptions$ReactiveException: io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443
2026-09-09T19:49:18.4795661Z 	at reactor.core.Exceptions.propagate(Exceptions.java:392)
2026-09-09T19:49:18.4795844Z 	at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:97)
2026-09-09T19:49:18.4796011Z 	at reactor.core.publisher.Mono.block(Mono.java:1707)
2026-09-09T19:49:18.4796206Z 	at com.azure.monitor.opentelemetry.exporter.implementation.quickpulse.QuickPulsePingSender.ping(QuickPulsePingSender.java:124)
2026-09-09T19:49:18.4796445Z 	at com.azure.monitor.opentelemetry.exporter.implementation.quickpulse.QuickPulseCoordinator.ping(QuickPulseCoordinator.java:110)
2026-09-09T19:49:18.4796687Z 	at com.azure.monitor.opentelemetry.exporter.implementation.quickpulse.QuickPulseCoordinator.run(QuickPulseCoordinator.java:67)
2026-09-09T19:49:18.4796962Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-09-09T19:49:18.4797100Z 	Suppressed: java.lang.Exception: #block terminated with an error
2026-09-09T19:49:18.4797270Z 		at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:99)
2026-09-09T19:49:18.4797420Z 		... 5 common frames omitted
2026-09-09T19:49:18.4797590Z Caused by: io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443
2026-09-09T19:49:18.4797810Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$2.run(AbstractEpollChannel.java:613)
2026-09-09T19:49:18.4798000Z 	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
2026-09-09T19:49:18.4798175Z 	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:170)
2026-09-09T19:49:18.4798369Z 	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
2026-09-09T19:49:18.4798576Z 	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:469)
2026-09-09T19:49:18.4798764Z 	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:394)
2026-09-09T19:49:18.4798950Z 	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
2026-09-09T19:49:18.4799301Z 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
2026-09-09T19:49:18.4799497Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-09-09T19:49:18.4799649Z 	... 1 common frames omitted
2026-09-09T19:49:18.4800108Z 2026-09-09 15:05:22.986-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service: connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (future warnings will be aggregated and logged once every 5 minutes)
2026-09-09T19:49:18.4800675Z io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443
2026-09-09T19:49:18.4800900Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$2.run(AbstractEpollChannel.java:613)
2026-09-09T19:49:18.4801093Z 	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
2026-09-09T19:49:18.4801265Z 	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:170)
2026-09-09T19:49:18.4801457Z 	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
2026-09-09T19:49:18.4801663Z 	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:469)
2026-09-09T19:49:18.4801849Z 	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:391)
2026-09-09T19:49:18.4802032Z 	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
2026-09-09T19:49:18.4802216Z 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
2026-09-09T19:49:18.4802405Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-09-09T19:49:18.4802593Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-09-09T19:49:18.4803137Z 2026-09-09 15:05:42.830-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service (retry from disk): connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (future warnings will be aggregated and logged once every 5 minutes)
2026-09-09T19:49:18.4803541Z io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443
2026-09-09T19:49:18.4803752Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$2.run(AbstractEpollChannel.java:613)
2026-09-09T19:49:18.4803991Z 	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
2026-09-09T19:49:18.4804167Z 	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:170)
2026-09-09T19:49:18.4804353Z 	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
2026-09-09T19:49:18.4804552Z 	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:469)
2026-09-09T19:49:18.4804739Z 	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:394)
2026-09-09T19:49:18.4804921Z 	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
2026-09-09T19:49:18.4805103Z 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
2026-09-09T19:49:18.4805289Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-09-09T19:49:18.4805456Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-09-09T19:49:18.4805924Z 2026-09-09 15:06:17.807-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service: connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (future warnings will be aggregated and logged once every 5 minutes)
2026-09-09T19:49:18.4806321Z io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443
2026-09-09T19:49:18.4806538Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$2.run(AbstractEpollChannel.java:613)
2026-09-09T19:49:18.4806722Z 	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
2026-09-09T19:49:18.4806901Z 	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:170)
2026-09-09T19:49:18.4807091Z 	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
2026-09-09T19:49:18.4807293Z 	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:469)
2026-09-09T19:49:18.4807524Z 	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:391)
2026-09-09T19:49:18.4807708Z 	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
2026-09-09T19:49:18.4807892Z 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
2026-09-09T19:49:18.4808079Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-09-09T19:49:18.4808246Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-09-09T19:49:18.4808721Z 2026-09-09 15:06:42.713-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service (retry from disk): connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (future warnings will be aggregated and logged once every 5 minutes)
2026-09-09T19:49:18.4809126Z io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443
2026-09-09T19:49:18.4809340Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$2.run(AbstractEpollChannel.java:613)
2026-09-09T19:49:18.4809525Z 	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
2026-09-09T19:49:18.4809701Z 	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:170)
2026-09-09T19:49:18.4809889Z 	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
2026-09-09T19:49:18.4810090Z 	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:469)
2026-09-09T19:49:18.4810279Z 	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:394)
2026-09-09T19:49:18.4810520Z 	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
2026-09-09T19:49:18.4810713Z 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
2026-09-09T19:49:18.4810937Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-09-09T19:49:18.4811109Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-09-09T19:49:18.4811418Z 2026-09-09 15:10:17.310-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 8 times: Unable to retrieve appId:
2026-09-09T19:49:18.4811758Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (8 times)
2026-09-09T19:49:18.4812109Z 2026-09-09 15:10:17.896-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 19 times (out of 19): Pinging live metrics endpoint:
2026-09-09T19:49:18.4812391Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (19 times)
2026-09-09T19:49:18.4812910Z 2026-09-09 15:10:22.987-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 1 times (out of 1): Sending telemetry to the ingestion service:
2026-09-09T19:49:18.4813266Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:49:18.4813654Z 2026-09-09 15:10:42.830-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4814013Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:49:18.4814371Z 2026-09-09 15:11:17.808-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 9 times (out of 9): Sending telemetry to the ingestion service:
2026-09-09T19:49:18.4814758Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (9 times)
2026-09-09T19:49:18.4815122Z 2026-09-09 15:11:42.714-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4815614Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:49:18.4815963Z 2026-09-09 15:15:17.311-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:49:18.4816301Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:49:18.4816646Z 2026-09-09 15:15:17.897-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:49:18.4816924Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:49:18.4817334Z 2026-09-09 15:15:42.831-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4817694Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:49:18.4818058Z 2026-09-09 15:16:17.808-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:49:18.4818452Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (10 times)
2026-09-09T19:49:18.4818824Z 2026-09-09 15:16:42.715-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4819172Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:49:18.4819506Z 2026-09-09 15:20:17.312-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 5 times: Unable to retrieve appId:
2026-09-09T19:49:18.4819834Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (5 times)
2026-09-09T19:49:18.4820176Z 2026-09-09 15:20:17.898-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 22 times (out of 22): Pinging live metrics endpoint:
2026-09-09T19:49:18.4820505Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:49:18.4820750Z  * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (2 times)
2026-09-09T19:49:18.4821094Z 2026-09-09 15:20:42.832-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4821478Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (5 times)
2026-09-09T19:49:18.4821817Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (3 times)
2026-09-09T19:49:18.4822174Z 2026-09-09 15:21:17.809-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 11 times (out of 11): Sending telemetry to the ingestion service:
2026-09-09T19:49:18.4822513Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (9 times)
2026-09-09T19:49:18.4822850Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:49:18.4823215Z 2026-09-09 15:21:42.716-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4823564Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:49:18.4823893Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:49:18.4824227Z 2026-09-09 15:25:17.313-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:49:18.4824563Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:49:18.4824910Z 2026-09-09 15:25:17.898-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:49:18.4825214Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:49:18.4825613Z 2026-09-09 15:25:42.832-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4825969Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (6 times)
2026-09-09T19:49:18.4826305Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:49:18.4826661Z 2026-09-09 15:26:17.810-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:49:18.4827006Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:49:18.4827333Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (3 times)
2026-09-09T19:49:18.4827696Z 2026-09-09 15:26:42.716-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4828042Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (5 times)
2026-09-09T19:49:18.4828396Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:49:18.4828729Z 2026-09-09 15:30:17.313-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:49:18.4829064Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:49:18.4829407Z 2026-09-09 15:30:17.899-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:49:18.4829679Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:49:18.4830153Z 2026-09-09 15:30:42.833-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4830603Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:49:18.4830955Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:49:18.4831310Z 2026-09-09 15:31:17.811-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:49:18.4831649Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:49:18.4832019Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:49:18.4832385Z 2026-09-09 15:31:42.717-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4832731Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (5 times)
2026-09-09T19:49:18.4833060Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (3 times)
2026-09-09T19:49:18.4833429Z 2026-09-09 15:35:17.314-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:49:18.4833946Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:49:18.4834290Z 2026-09-09 15:35:17.900-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:49:18.4834556Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:49:18.4834947Z 2026-09-09 15:35:42.833-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4835336Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:49:18.4835693Z 2026-09-09 15:36:17.811-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 11 times (out of 11): Sending telemetry to the ingestion service:
2026-09-09T19:49:18.4836042Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (11 times)
2026-09-09T19:49:18.4836407Z 2026-09-09 15:36:42.717-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4836749Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:49:18.4837083Z 2026-09-09 15:40:17.315-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 5 times: Unable to retrieve appId:
2026-09-09T19:49:18.4837417Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (5 times)
2026-09-09T19:49:18.4837755Z 2026-09-09 15:40:17.900-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 19 times (out of 19): Pinging live metrics endpoint:
2026-09-09T19:49:18.4838030Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (19 times)
2026-09-09T19:49:18.4838426Z 2026-09-09 15:40:42.834-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4838803Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:49:18.4839295Z 2026-09-09 15:41:17.812-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:49:18.4839801Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (10 times)
2026-09-09T19:49:18.4840174Z 2026-09-09 15:41:42.718-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4840572Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:49:18.4840925Z 2026-09-09 15:45:17.315-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:49:18.4841263Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:49:18.4841701Z 2026-09-09 15:45:17.901-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:49:18.4841977Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:49:18.4842443Z 2026-09-09 15:45:42.835-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4843095Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:49:18.4843894Z 2026-09-09 15:46:17.812-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:49:18.4844508Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:49:18.4845036Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:49:18.4845622Z 2026-09-09 15:46:42.719-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4846382Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (5 times)
2026-09-09T19:49:18.4846952Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:49:18.4847516Z 2026-09-09 15:50:17.316-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:49:18.4848108Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:49:18.4848717Z 2026-09-09 15:50:17.902-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:49:18.4849350Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:49:18.4850062Z 2026-09-09 15:50:42.835-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4850810Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:49:18.4851250Z 2026-09-09 15:51:17.813-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 11 times (out of 11): Sending telemetry to the ingestion service:
2026-09-09T19:49:18.4851614Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (11 times)
2026-09-09T19:49:18.4851990Z 2026-09-09 15:51:42.719-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4852343Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:49:18.4852684Z 2026-09-09 15:55:17.317-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 5 times: Unable to retrieve appId:
2026-09-09T19:49:18.4853019Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (5 times)
2026-09-09T19:49:18.4853442Z 2026-09-09 15:55:17.902-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:49:18.4853716Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:49:18.4854172Z 2026-09-09 15:55:42.836-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4854539Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (6 times)
2026-09-09T19:49:18.4854873Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:49:18.4855237Z 2026-09-09 15:56:17.814-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:49:18.4855582Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (6 times)
2026-09-09T19:49:18.4855913Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:49:18.4856177Z  * null (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:49:18.4856513Z 2026-09-09 15:56:42.720-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4856946Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (5 times)
2026-09-09T19:49:18.4857269Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:49:18.4857616Z  * null (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:49:18.4857914Z 2026-09-09 16:00:17.317-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:49:18.4858351Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:49:18.4858753Z 2026-09-09 16:00:17.903-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 22 times (out of 22): Pinging live metrics endpoint:
2026-09-09T19:49:18.4859039Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:49:18.4859269Z  * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (2 times)
2026-09-09T19:49:18.4859612Z 2026-09-09 16:00:42.837-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4859966Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:49:18.4860303Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:49:18.4860780Z 2026-09-09 16:01:17.814-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:49:18.4861129Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:49:18.4861459Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:49:18.4861822Z 2026-09-09 16:01:42.721-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4862170Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (5 times)
2026-09-09T19:49:18.4862505Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:49:18.4862840Z 2026-09-09 16:05:17.318-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:49:18.4863172Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:49:18.4863506Z 2026-09-09 16:05:17.904-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:49:18.4863784Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:49:18.4864230Z 2026-09-09 16:05:42.837-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4864581Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:49:18.4864934Z 2026-09-09 16:06:17.815-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 11 times (out of 11): Sending telemetry to the ingestion service:
2026-09-09T19:49:18.4865281Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (11 times)
2026-09-09T19:49:18.4865654Z 2026-09-09 16:06:42.721-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4866002Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (6 times)
2026-09-09T19:49:18.4866333Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:49:18.4866662Z 2026-09-09 16:10:17.318-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:49:18.4866998Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:49:18.4867370Z 2026-09-09 16:10:17.904-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:49:18.4867647Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:49:18.4868040Z 2026-09-09 16:10:42.838-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4868385Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (6 times)
2026-09-09T19:49:18.4868718Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:49:18.4869075Z 2026-09-09 16:11:17.815-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:49:18.4869417Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:49:18.4869738Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (2 times)
2026-09-09T19:49:18.4870101Z 2026-09-09 16:11:42.722-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4870497Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:49:18.4870881Z 2026-09-09 16:15:17.319-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 5 times: Unable to retrieve appId:
2026-09-09T19:49:18.4871216Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (5 times)
2026-09-09T19:49:18.4871559Z 2026-09-09 16:15:17.905-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:49:18.4871831Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:49:18.4872224Z 2026-09-09 16:15:42.838-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4872573Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:49:18.4872927Z 2026-09-09 16:16:17.816-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:49:18.4873275Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (10 times)
2026-09-09T19:49:18.4873644Z 2026-09-09 16:16:42.722-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4874019Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:49:18.4874355Z 2026-09-09 16:20:17.320-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:49:18.4874684Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:49:18.4875022Z 2026-09-09 16:20:17.905-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 21 times (out of 21): Pinging live metrics endpoint:
2026-09-09T19:49:18.4875293Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (19 times)
2026-09-09T19:49:18.4875516Z  * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (2 times)
2026-09-09T19:49:18.4875858Z 2026-09-09 16:20:42.839-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4876205Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:49:18.4876686Z 2026-09-09 16:21:17.817-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 11 times (out of 11): Sending telemetry to the ingestion service:
2026-09-09T19:49:18.4877213Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (11 times)
2026-09-09T19:49:18.4877693Z 2026-09-09 16:21:42.723-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4880216Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (6 times)
2026-09-09T19:49:18.4880772Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:49:18.4881177Z 2026-09-09 16:25:17.320-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:49:18.4881515Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:49:18.4881859Z 2026-09-09 16:25:17.906-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:49:18.4882234Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:49:18.4882764Z 2026-09-09 16:25:42.839-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4883156Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:49:18.4883620Z 2026-09-09 16:26:17.817-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:49:18.4884225Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (10 times)
2026-09-09T19:49:18.4884705Z 2026-09-09 16:26:42.724-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4885054Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:49:18.4885391Z 2026-09-09 16:30:17.321-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 5 times: Unable to retrieve appId:
2026-09-09T19:49:18.4885724Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (5 times)
2026-09-09T19:49:18.4886072Z 2026-09-09 16:30:17.906-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:49:18.4886347Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:49:18.4886743Z 2026-09-09 16:30:42.840-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4887089Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (5 times)
2026-09-09T19:49:18.4887423Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (3 times)
2026-09-09T19:49:18.4887837Z 2026-09-09 16:31:17.818-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:49:18.4888174Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (6 times)
2026-09-09T19:49:18.4888503Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (4 times)
2026-09-09T19:49:18.4888863Z 2026-09-09 16:31:42.724-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4889210Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (4 times)
2026-09-09T19:49:18.4889540Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (3 times)
2026-09-09T19:49:18.4889874Z 2026-09-09 16:35:17.321-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:49:18.4890298Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:49:18.4890726Z 2026-09-09 16:35:17.907-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 22 times (out of 22): Pinging live metrics endpoint:
2026-09-09T19:49:18.4890996Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (18 times)
2026-09-09T19:49:18.4891267Z  * null (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (4 times)
2026-09-09T19:49:18.4891612Z 2026-09-09 16:35:42.840-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4892112Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:49:18.4892597Z 2026-09-09 16:36:17.818-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 11 times (out of 11): Sending telemetry to the ingestion service:
2026-09-09T19:49:18.4893060Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (11 times)
2026-09-09T19:49:18.4893516Z 2026-09-09 16:36:42.725-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4894012Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:49:18.4894531Z 2026-09-09 16:40:17.322-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:49:18.4895023Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:49:18.4895555Z 2026-09-09 16:40:17.908-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:49:18.4895899Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:49:18.4896303Z 2026-09-09 16:40:42.841-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4896785Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:49:18.4897263Z 2026-09-09 16:41:17.819-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:49:18.4897620Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (10 times)
2026-09-09T19:49:18.4897988Z 2026-09-09 16:41:42.725-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4898329Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.67:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (6 times)
2026-09-09T19:49:18.4898662Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (1 times)
2026-09-09T19:49:18.4899001Z 2026-09-09 16:45:17.323-03:00 WARN  c.m.a.a.i.i.AppIdSupplier$GetAppIdTask - In the last 5 minutes, the following warning has occurred 4 times: Unable to retrieve appId:
2026-09-09T19:49:18.4899367Z  * exception sending request to https://brazilsouth-1.in.applicationinsights.azure.com/api/profiles/99ee6c02-0bc8-4c2e-8109-b744a54e07ae/appId (4 times)
2026-09-09T19:49:18.4899714Z 2026-09-09 16:45:17.908-03:00 WARN  c.a.m.o.e.i.q.QuickPulsePingSender - In the last 5 minutes, the following operation has failed 20 times (out of 20): Pinging live metrics endpoint:
2026-09-09T19:49:18.4899987Z  * io.netty.channel.ConnectTimeoutException: connection timed out: brazilsouth.livediagnostics.monitor.azure.com/191.234.137.40:443 (https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc) (20 times)
2026-09-09T19:49:18.4900579Z 2026-09-09 16:45:42.842-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 7 times (out of 7): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4901073Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (7 times)
2026-09-09T19:49:18.4901500Z 2026-09-09 16:46:17.820-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 10 times (out of 10): Sending telemetry to the ingestion service:
2026-09-09T19:49:18.4901933Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (10 times)
2026-09-09T19:49:18.4902518Z 2026-09-09 16:46:42.726-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 8 times (out of 8): Sending telemetry to the ingestion service (retry from disk):
2026-09-09T19:49:18.4902898Z  * connection timed out: brazilsouth-1.in.applicationinsights.azure.com/20.206.183.66:443 (https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track) (8 times)
2026-09-09T19:49:18.4918490Z ##[section]Finishing: Logs da Aplicação
