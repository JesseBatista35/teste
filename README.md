2026-11-09T13:46:40.7836080Z ##[section]Starting: Atualizando Variáveis de Ambiente
2026-11-09T13:46:40.7839411Z ==============================================================================
2026-11-09T13:46:40.7839577Z Task         : Bash
2026-11-09T13:46:40.7839625Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-09T13:46:40.7839698Z Version      : 3.227.0
2026-11-09T13:46:40.7839744Z Author       : Microsoft Corporation
2026-11-09T13:46:40.7839798Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-09T13:46:40.7840004Z ==============================================================================
2026-11-09T13:46:40.9179039Z Generating script.
2026-11-09T13:46:40.9191336Z ========================== Starting Command Output ===========================
2026-11-09T13:46:40.9198843Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/b101c29f-5db6-43e6-a4ac-f56118aab517.sh
2026-11-09T13:46:40.9253027Z Nova APP: false
2026-11-09T13:46:41.1188822Z error: one or more resources must be specified as <resource> <name> or <resource>/<name>
2026-11-09T13:46:41.1189407Z See 'oc set env -h' for help and examples
2026-11-09T13:46:41.1252676Z ##[error]Bash exited with code '1'.
2026-11-09T13:46:41.1266826Z ##[section]Finishing: Atualizando Variáveis de Ambiente



2026-11-09T13:46:41.1559873Z ##[section]Starting: Logs da Aplicação
2026-11-09T13:46:41.1562950Z ==============================================================================
2026-11-09T13:46:41.1563034Z Task         : Bash
2026-11-09T13:46:41.1563080Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-09T13:46:41.1563152Z Version      : 3.227.0
2026-11-09T13:46:41.1563199Z Author       : Microsoft Corporation
2026-11-09T13:46:41.1563253Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-09T13:46:41.1563335Z ==============================================================================
2026-11-09T13:46:41.2987520Z Generating script.
2026-11-09T13:46:41.2998258Z ========================== Starting Command Output ===========================
2026-11-09T13:46:41.3009671Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/7c5a2ae1-a595-47d2-a1b4-d4dba1080f42.sh
2026-11-09T13:46:41.3065532Z + shopt -s expand_aliases
2026-11-09T13:46:41.3065719Z + [[ -n okd4_nprd ]]
2026-11-09T13:46:41.3065897Z + [[ okd4_nprd =~ ocp ]]
2026-11-09T13:46:41.3066027Z + [[ -n okd4_nprd ]]
2026-11-09T13:46:41.3066140Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-11-09T13:46:41.3066378Z + app=sismn-gecci-tqs
2026-11-09T13:46:41.3066487Z + oc version
2026-11-09T13:46:41.3711134Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-11-09T13:46:41.3711407Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-11-09T13:46:41.3711609Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-11-09T13:46:41.3748218Z ++ oc get pod -l name=sismn-gecci-tqs -n sismn-tqs -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-11-09T13:46:41.3748397Z ++ tac
2026-11-09T13:46:41.3748535Z ++ grep -v '^$'
2026-11-09T13:46:41.3748648Z ++ head -n1
2026-11-09T13:46:41.4501033Z + last_pod=sismn-gecci-tqs-28-glhxs
2026-11-09T13:46:41.4501282Z + echo 'Logs do POD: sismn-gecci-tqs-28-glhxs'
2026-11-09T13:46:41.4501602Z + oc logs sismn-gecci-tqs-28-glhxs -c sismn-gecci-tqs -n sismn-tqs
2026-11-09T13:46:41.4501811Z Logs do POD: sismn-gecci-tqs-28-glhxs
2026-11-09T13:46:41.5385633Z 2026-11-09 04:32:44,654 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5386125Z 2026-11-09 04:32:44,654 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5386536Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5386724Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5386954Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5387133Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5387404Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5387713Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5387928Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5388137Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5388532Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5388840Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5389058Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5389259Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5389808Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5390361Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5390533Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5390635Z 
2026-11-09T13:46:41.5391303Z 2026-11-09 04:32:44,654 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5391787Z 2026-11-09 04:32:54,652 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5392188Z 2026-11-09 04:32:54,652 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5392403Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5392822Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5393065Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5393220Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5393472Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5393730Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5393884Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5394144Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5394408Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5394680Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5394864Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5395054Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5395263Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5395460Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5396013Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5396093Z 
2026-11-09T13:46:41.5396728Z 2026-11-09 04:32:54,652 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5397298Z 2026-11-09 04:33:00,435 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5397737Z 2026-11-09 04:33:00,435 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5397941Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5398093Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5398241Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5398394Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5398541Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5398673Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5398872Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5399046Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5399241Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5399581Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5399778Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5399976Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5400174Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5400371Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5400544Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5400611Z 
2026-11-09T13:46:41.5401071Z 2026-11-09 04:33:00,436 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5401515Z 2026-11-09 04:33:04,652 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5401860Z 2026-11-09 04:33:04,652 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5402065Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5402223Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5402366Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5402523Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5402667Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5402801Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5402950Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5403115Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5403308Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5403502Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5403686Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5403871Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5404066Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5404261Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5404455Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5404524Z 
2026-11-09T13:46:41.5404979Z 2026-11-09 04:33:04,653 INFO  [io.sma.health] (executor-thread-11) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5405388Z 2026-11-09 04:33:05,230 DEBUG [org.qua.cor.QuartzSchedulerThread] (QuarkusQuartzScheduler_QuartzSchedulerThread) batch acquisition of 0 triggers
2026-11-09T13:46:41.5405725Z 2026-11-09 04:33:14,652 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5406129Z 2026-11-09 04:33:14,652 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5406405Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5406558Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5406702Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5406849Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5406988Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5407132Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5407277Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5407494Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5407693Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5407888Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5408065Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5408249Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5408455Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5408653Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5408822Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5408886Z 
2026-11-09T13:46:41.5409344Z 2026-11-09 04:33:14,652 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5409864Z 2026-11-09 04:33:24,654 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5410224Z 2026-11-09 04:33:24,654 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5410432Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5410592Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5410738Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5410894Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5411045Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5411181Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5411321Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5411490Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5411682Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5411928Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5412127Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5412314Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5412522Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5412828Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5413136Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5413199Z 
2026-11-09T13:46:41.5413652Z 2026-11-09 04:33:24,654 INFO  [io.sma.health] (executor-thread-11) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5414181Z 2026-11-09 04:33:28,705 DEBUG [org.qua.cor.QuartzSchedulerThread] (QuarkusQuartzScheduler_QuartzSchedulerThread) batch acquisition of 0 triggers
2026-11-09T13:46:41.5414527Z 2026-11-09 04:33:34,652 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5414880Z 2026-11-09 04:33:34,652 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5415084Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5415239Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5415391Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5415537Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5415678Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5415820Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5416016Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5416220Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5416411Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5416633Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5416819Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5417002Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5417241Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5417499Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5417668Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5417827Z 
2026-11-09T13:46:41.5418302Z 2026-11-09 04:33:34,653 INFO  [io.sma.health] (executor-thread-11) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5418735Z 2026-11-09 04:33:44,652 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5419093Z 2026-11-09 04:33:44,652 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5419295Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5419555Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5419715Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5419870Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5420011Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5420157Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5420351Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5420523Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5420721Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5420950Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5421206Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5421395Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5421600Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5421853Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5422107Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5422205Z 
2026-11-09T13:46:41.5422861Z 2026-11-09 04:33:44,652 INFO  [io.sma.health] (executor-thread-11) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5423370Z 2026-11-09 04:33:54,652 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5423769Z 2026-11-09 04:33:54,652 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5423970Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5424124Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5424274Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5424519Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5424745Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5424966Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5425192Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5425401Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5425589Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5425779Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5425953Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5426132Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5426376Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5426581Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5426756Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5426824Z 
2026-11-09T13:46:41.5427274Z 2026-11-09 04:33:54,652 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5427730Z 2026-11-09 04:33:56,491 DEBUG [org.qua.cor.QuartzSchedulerThread] (QuarkusQuartzScheduler_QuartzSchedulerThread) batch acquisition of 0 triggers
2026-11-09T13:46:41.5428097Z 2026-11-09 04:34:04,655 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5428509Z 2026-11-09 04:34:04,655 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5428778Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5428971Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5429147Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5429307Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5429570Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5429719Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5429863Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5430036Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5430263Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5430511Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5430701Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5430882Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5431082Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5431278Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5431447Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5431516Z 
2026-11-09T13:46:41.5432008Z 2026-11-09 04:34:04,655 INFO  [io.sma.health] (executor-thread-11) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5432511Z 2026-11-09 04:34:14,652 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5432870Z 2026-11-09 04:34:14,652 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5433089Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5433259Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5433409Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5433556Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5433766Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5433905Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5434078Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5434246Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5434435Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5434623Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5434802Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5434987Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5435178Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5435462Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5435639Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5435709Z 
2026-11-09T13:46:41.5436459Z 2026-11-09 04:34:14,652 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5436936Z 2026-11-09 04:34:17,435 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5437341Z 2026-11-09 04:34:17,435 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5437565Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5437721Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5437869Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5438019Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5438165Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5438310Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5438443Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5438610Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5438799Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5439024Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5439211Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5439558Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5439821Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5440059Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5440260Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5440335Z 
2026-11-09T13:46:41.5440825Z 2026-11-09 04:34:17,436 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5441307Z 2026-11-09 04:34:22,962 DEBUG [org.qua.cor.QuartzSchedulerThread] (QuarkusQuartzScheduler_QuartzSchedulerThread) batch acquisition of 0 triggers
2026-11-09T13:46:41.5441643Z 2026-11-09 04:34:24,687 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5442002Z 2026-11-09 04:34:24,687 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5442212Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5442553Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5442702Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5442855Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5443009Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5443201Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5443334Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5443502Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5443733Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5443923Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5444147Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5444405Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5444674Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5444911Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5445119Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5445205Z 
2026-11-09T13:46:41.5445680Z 2026-11-09 04:34:24,688 INFO  [io.sma.health] (executor-thread-11) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5446116Z 2026-11-09 04:34:34,652 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5446461Z 2026-11-09 04:34:34,652 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5446666Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5446816Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5446964Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5447107Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5447254Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5447400Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5447598Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5447834Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5448021Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5448209Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5448390Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5448578Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5448780Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5448968Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5449142Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5449214Z 
2026-11-09T13:46:41.5449804Z 2026-11-09 04:34:34,652 INFO  [io.sma.health] (executor-thread-11) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5450334Z 2026-11-09 04:34:44,657 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5450925Z 2026-11-09 04:34:44,657 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5451133Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5451339Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5451486Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5451638Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5451817Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5451969Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5452103Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5452323Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5452559Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5452773Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5452952Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5453145Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5453409Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5453707Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5453953Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5454025Z 
2026-11-09T13:46:41.5454512Z 2026-11-09 04:34:44,657 INFO  [io.sma.health] (executor-thread-11) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5455124Z 2026-11-09 04:34:52,242 DEBUG [org.qua.cor.QuartzSchedulerThread] (QuarkusQuartzScheduler_QuartzSchedulerThread) batch acquisition of 0 triggers
2026-11-09T13:46:41.5455631Z 2026-11-09 04:34:54,652 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5456248Z 2026-11-09 04:34:54,652 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5456565Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5456730Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5456874Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5457026Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5457175Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5457306Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5457500Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5457668Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5457857Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5458044Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5458223Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5458408Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5458599Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5461292Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5461476Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5461547Z 
2026-11-09T13:46:41.5462121Z 2026-11-09 04:34:54,652 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5462562Z 2026-11-09 04:35:04,689 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5462957Z 2026-11-09 04:35:04,689 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5463195Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5463350Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5463501Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5463646Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5463796Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5463942Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5464077Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5464241Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5464431Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5464631Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5464816Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5465006Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5465208Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5465399Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5465575Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5465646Z 
2026-11-09T13:46:41.5466089Z 2026-11-09 04:35:04,689 INFO  [io.sma.health] (executor-thread-11) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5466537Z 2026-11-09 04:35:14,652 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5466899Z 2026-11-09 04:35:14,653 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5467115Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5467269Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5467413Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5467558Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5467714Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5467854Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5468039Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5468210Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5468404Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5468627Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5468811Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5468999Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5469195Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5469382Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5469689Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5469766Z 
2026-11-09T13:46:41.5470296Z 2026-11-09 04:35:14,653 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5470741Z 2026-11-09 04:35:17,744 DEBUG [org.qua.cor.QuartzSchedulerThread] (QuarkusQuartzScheduler_QuartzSchedulerThread) batch acquisition of 0 triggers
2026-11-09T13:46:41.5471070Z 2026-11-09 04:35:24,659 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5471426Z 2026-11-09 04:35:24,659 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5471627Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5471792Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5471941Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5472096Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5472314Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5472497Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5472671Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5472876Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5473129Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5473393Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5473582Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5473866Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5474171Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5474449Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5474692Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5474790Z 
2026-11-09T13:46:41.5475364Z 2026-11-09 04:35:24,659 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5475805Z 2026-11-09 04:35:34,685 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5476320Z 2026-11-09 04:35:34,685 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5476590Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5476761Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5476906Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5477056Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5477206Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5477402Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5477541Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5477711Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5477902Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5478093Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5478270Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5478462Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5478663Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5478853Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5479052Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5479125Z 
2026-11-09T13:46:41.5479728Z 2026-11-09 04:35:34,685 INFO  [io.sma.health] (executor-thread-11) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5480268Z 2026-11-09 04:35:39,436 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5480689Z 2026-11-09 04:35:39,436 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5480891Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5481044Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5481218Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5481400Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5481561Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5481709Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5481887Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5482061Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5482263Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5482453Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5482672Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5482862Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5483066Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5483255Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5483473Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5483547Z 
2026-11-09T13:46:41.5483996Z 2026-11-09 04:35:39,436 INFO  [io.sma.health] (executor-thread-11) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5484487Z 2026-11-09 04:35:44,652 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5484936Z 2026-11-09 04:35:44,652 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5485194Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5485430Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5485597Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5485754Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5485912Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5486058Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5486250Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5486495Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5486793Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5487086Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5487360Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5487591Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5487846Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5488040Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5488213Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5488282Z 
2026-11-09T13:46:41.5488726Z 2026-11-09 04:35:44,652 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5489190Z 2026-11-09 04:35:46,823 DEBUG [org.qua.cor.QuartzSchedulerThread] (QuarkusQuartzScheduler_QuartzSchedulerThread) batch acquisition of 0 triggers
2026-11-09T13:46:41.5489604Z 2026-11-09 04:35:54,652 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5489969Z 2026-11-09 04:35:54,652 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5490251Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5490412Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5490558Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5490734Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5490893Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5491067Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5491250Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5491417Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5491609Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5491843Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5492018Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5492214Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5492413Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5492604Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5492830Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5492909Z 
2026-11-09T13:46:41.5493359Z 2026-11-09 04:35:54,652 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5493958Z 2026-11-09 04:36:04,654 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5494314Z 2026-11-09 04:36:04,654 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5494516Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5494701Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5494884Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5495036Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5495185Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5495332Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5495466Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5495632Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5495819Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5496008Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5496186Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5496377Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5496655Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5496846Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5497019Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5497104Z 
2026-11-09T13:46:41.5497769Z 2026-11-09 04:36:04,654 INFO  [io.sma.health] (executor-thread-11) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5498435Z 2026-11-09 04:36:13,585 DEBUG [org.qua.cor.QuartzSchedulerThread] (QuarkusQuartzScheduler_QuartzSchedulerThread) batch acquisition of 0 triggers
2026-11-09T13:46:41.5498793Z 2026-11-09 04:36:14,651 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5499204Z 2026-11-09 04:36:14,651 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5499509Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5499676Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5499832Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5500023Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5500252Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5500472Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5500692Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5500947Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5501153Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5501363Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5501599Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5501843Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5502076Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5502269Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5502439Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5502556Z 
2026-11-09T13:46:41.5503022Z 2026-11-09 04:36:14,652 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5503546Z 2026-11-09 04:36:24,689 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5503902Z 2026-11-09 04:36:24,689 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5504110Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5504293Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5504442Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5504633Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5504869Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5505101Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5505319Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5505492Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5505686Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5505922Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5506156Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5506350Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5506600Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5506899Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5507109Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5507217Z 
2026-11-09T13:46:41.5507803Z 2026-11-09 04:36:24,689 INFO  [io.sma.health] (executor-thread-11) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5508600Z 2026-11-09 04:36:34,651 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5508997Z 2026-11-09 04:36:34,652 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5509213Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5509367Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5509665Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5509818Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5509972Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5510190Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5510368Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5510567Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5510779Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5510966Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5511183Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5511404Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5511618Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5511932Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5512195Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5512299Z 
2026-11-09T13:46:41.5512999Z 2026-11-09 04:36:34,652 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5513473Z 2026-11-09 04:36:39,742 DEBUG [org.qua.cor.QuartzSchedulerThread] (QuarkusQuartzScheduler_QuartzSchedulerThread) batch acquisition of 0 triggers
2026-11-09T13:46:41.5513822Z 2026-11-09 04:36:40,460 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5514238Z 2026-11-09 04:36:40,460 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5514442Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5514597Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5514735Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5514915Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5515067Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5515290Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5515429Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5515596Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5515853Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5516036Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5516223Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5516411Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5516705Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5516914Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5517114Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5517182Z 
2026-11-09T13:46:41.5517692Z 2026-11-09 04:36:40,460 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5518274Z 2026-11-09 04:36:44,662 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5518634Z 2026-11-09 04:36:44,662 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5518840Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5519022Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5519159Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5519309Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5519571Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5519730Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5519875Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5520080Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5520359Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5520542Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5520744Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5520940Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5521148Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5521350Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5521525Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5521588Z 
2026-11-09T13:46:41.5522139Z 2026-11-09 04:36:44,662 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5522610Z 2026-11-09 04:36:54,652 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5523013Z 2026-11-09 04:36:54,652 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5523218Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5523447Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5523655Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5523801Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5523951Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5524098Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5524248Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5524470Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5524752Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5524947Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5525128Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5525328Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5525557Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5525760Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5525931Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5525996Z 
2026-11-09T13:46:41.5526472Z 2026-11-09 04:36:54,652 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5527022Z 2026-11-09 04:37:04,111 DEBUG [org.qua.cor.QuartzSchedulerThread] (QuarkusQuartzScheduler_QuartzSchedulerThread) batch acquisition of 0 triggers
2026-11-09T13:46:41.5527466Z 2026-11-09 04:37:04,652 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5527830Z 2026-11-09 04:37:04,652 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5528039Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5528226Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5528375Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5528530Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5528682Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5528821Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5528963Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5529129Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5529327Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5529644Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5529891Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5530143Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5530568Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5530895Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5531130Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5531196Z 
2026-11-09T13:46:41.5531689Z 2026-11-09 04:37:04,652 INFO  [io.sma.health] (executor-thread-11) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5532232Z 2026-11-09 04:37:14,654 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5532631Z 2026-11-09 04:37:14,654 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5532888Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5533043Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5533245Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5533401Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5533549Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5533694Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5533835Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5534032Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5534278Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5534465Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5534682Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5534879Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5535084Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5535307Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5535515Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5535585Z 
2026-11-09T13:46:41.5536121Z 2026-11-09 04:37:14,654 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5536784Z 2026-11-09 04:37:24,685 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5537223Z 2026-11-09 04:37:24,686 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5537533Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5537687Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5537824Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5538001Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5538154Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5538301Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5538545Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5538753Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5538953Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5539167Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5539351Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5539699Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5539951Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5540187Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5540385Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5540450Z 
2026-11-09T13:46:41.5540909Z 2026-11-09 04:37:24,686 INFO  [io.sma.health] (executor-thread-11) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5541341Z 2026-11-09 04:37:28,075 DEBUG [org.qua.cor.QuartzSchedulerThread] (QuarkusQuartzScheduler_QuartzSchedulerThread) batch acquisition of 0 triggers
2026-11-09T13:46:41.5541717Z 2026-11-09 04:37:34,667 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5542069Z 2026-11-09 04:37:34,667 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5542317Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5542476Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5542615Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5542762Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5542916Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5543060Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5543203Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5543412Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5543595Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5543791Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5543976Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5544212Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5544539Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5544759Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5544934Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5545005Z 
2026-11-09T13:46:41.5545577Z 2026-11-09 04:37:34,667 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5546074Z 2026-11-09 04:37:44,652 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5546557Z 2026-11-09 04:37:44,652 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5546826Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5547009Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5547199Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5547388Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5547550Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5547688Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5547904Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5548075Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5548301Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5548481Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5548657Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5548846Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5549050Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5549245Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5549534Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5549611Z 
2026-11-09T13:46:41.5550131Z 2026-11-09 04:37:44,652 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5550601Z 2026-11-09 04:37:54,654 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5550964Z 2026-11-09 04:37:54,654 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5551198Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5551354Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5551492Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5551678Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5551835Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5551976Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5552116Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5552280Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5552499Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5552682Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5552863Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5553100Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5553305Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5553507Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5553729Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5553792Z 
2026-11-09T13:46:41.5554236Z 2026-11-09 04:37:54,654 INFO  [io.sma.health] (executor-thread-11) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5554722Z 2026-11-09 04:37:55,406 DEBUG [org.qua.cor.QuartzSchedulerThread] (QuarkusQuartzScheduler_QuartzSchedulerThread) batch acquisition of 0 triggers
2026-11-09T13:46:41.5555102Z 2026-11-09 04:37:58,438 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5555458Z 2026-11-09 04:37:58,438 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5555711Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5555975Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5556210Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5556404Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5556558Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5556750Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5556898Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5557071Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5557255Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5557517Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5557708Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5557898Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5558101Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5558299Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5558507Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5558571Z 
2026-11-09T13:46:41.5559079Z 2026-11-09 04:37:58,438 INFO  [io.sma.health] (executor-thread-11) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5559819Z 2026-11-09 04:38:04,657 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5560233Z 2026-11-09 04:38:04,657 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5560506Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5560657Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5560796Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5560949Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5561139Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5561285Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5561524Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5561720Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5561909Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5562137Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5562358Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5562698Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5562930Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5563222Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5563434Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5563503Z 
2026-11-09T13:46:41.5563966Z 2026-11-09 04:38:04,658 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5564466Z 2026-11-09 04:38:14,679 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5564887Z 2026-11-09 04:38:14,680 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5565140Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5565356Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5565572Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5565759Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5565908Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5566050Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5566191Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5566364Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5566545Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5566741Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5566928Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5567116Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5567371Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5567644Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5567817Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5567896Z 
2026-11-09T13:46:41.5569689Z 2026-11-09 04:38:14,680 INFO  [io.sma.health] (executor-thread-11) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5570229Z 2026-11-09 04:38:23,551 DEBUG [org.qua.cor.QuartzSchedulerThread] (QuarkusQuartzScheduler_QuartzSchedulerThread) batch acquisition of 0 triggers
2026-11-09T13:46:41.5570572Z 2026-11-09 04:38:24,652 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5571030Z 2026-11-09 04:38:24,652 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5571277Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5571435Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5571573Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5571720Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
2026-11-09T13:46:41.5571880Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5572019Z 	at com.sybase.jdbc4.jdbc.SybConnection.<init>(Unknown Source)
2026-11-09T13:46:41.5572161Z 	at com.sybase.jdbc4.jdbc.SybDriver.connect(Unknown Source)
2026-11-09T13:46:41.5572365Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:210)
2026-11-09T13:46:41.5572554Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:513)
2026-11-09T13:46:41.5572788Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:494)
2026-11-09T13:46:41.5573034Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-11-09T13:46:41.5573222Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-11-09T13:46:41.5573427Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-11-09T13:46:41.5573624Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-11-09T13:46:41.5573794Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-11-09T13:46:41.5573859Z 
2026-11-09T13:46:41.5574497Z 2026-11-09 04:38:24,652 INFO  [io.sma.health] (executor-thread-12) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"default":"Unable to execute the validation check for the default DataSource: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s)."}}]}
2026-11-09T13:46:41.5575026Z 2026-11-09 04:38:34,654 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5575455Z 2026-11-09 04:38:34,654 DEBUG [io.agr.pool] (agroal-11) Cause: : java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
2026-11-09T13:46:41.5575663Z 	at com.sybase.jdbc4.jdbc.SybConnection.getAllExceptions(Unknown Source)
2026-11-09T13:46:41.5575819Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleSQLE(Unknown Source)
2026-11-09T13:46:41.5575976Z 	at com.sybase.jdbc4.jdbc.SybConnection.a(Unknown Source)
2026-11-09T13:46:41.5576179Z 	at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(Unknown Source)
