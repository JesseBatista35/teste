
[p585600@caddeapllx2865 ~]$
[p585600@caddeapllx2865 ~]$
[p585600@caddeapllx2865 ~]$
[p585600@caddeapllx2865 ~]$ grep -E 'WFLYUT0021|WFLYSRV0010|ERROR' /logs/jboss/jboss-eap/standalone/sigsj-internet/server.log | tail -20
2026-11-06 15:29:50,302 ERROR [stderr] (ServerService Thread Pool -- 97)        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
2026-11-06 15:29:50,302 ERROR [stderr] (ServerService Thread Pool -- 97)        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
2026-11-06 15:29:50,302 ERROR [stderr] (ServerService Thread Pool -- 97)        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
2026-11-06 15:29:50,302 ERROR [stderr] (ServerService Thread Pool -- 97)        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
2026-11-06 15:29:50,302 ERROR [stderr] (ServerService Thread Pool -- 97)        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
2026-11-06 15:29:50,302 ERROR [stderr] (ServerService Thread Pool -- 97)        at io.undertow.servlet.core.DeploymentManagerImpl.start(DeploymentManagerImpl.java:605)
2026-11-06 15:29:50,302 ERROR [stderr] (ServerService Thread Pool -- 97)        at org.wildfly.extension.undertow.deployment.UndertowDeploymentService.startContext(UndertowDeploymentService.java:97)
2026-11-06 15:29:50,302 ERROR [stderr] (ServerService Thread Pool -- 97)        at org.wildfly.extension.undertow.deployment.UndertowDeploymentService$1.run(UndertowDeploymentService.java:78)
2026-11-06 15:29:50,302 ERROR [stderr] (ServerService Thread Pool -- 97)        at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
2026-11-06 15:29:50,302 ERROR [stderr] (ServerService Thread Pool -- 97)        at java.util.concurrent.FutureTask.run(FutureTask.java:266)
2026-11-06 15:29:50,302 ERROR [stderr] (ServerService Thread Pool -- 97)        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
2026-11-06 15:29:50,302 ERROR [stderr] (ServerService Thread Pool -- 97)        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
2026-11-06 15:29:50,302 ERROR [stderr] (ServerService Thread Pool -- 97)        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
2026-11-06 15:29:50,302 ERROR [stderr] (ServerService Thread Pool -- 97)        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
2026-11-06 15:29:50,302 ERROR [stderr] (ServerService Thread Pool -- 97)        at java.lang.Thread.run(Thread.java:750)
2026-11-06 15:29:50,302 ERROR [stderr] (ServerService Thread Pool -- 97)        at org.jboss.threads.JBossThread.run(JBossThread.java:513)
2026-11-06 15:29:50,313 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 97) WFLYUT0021: Contexto web registrado: '/sigsj_internet' para servidor 'default-server'
2026-11-06 15:29:50,438 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0010: "ojdbc8.jar" foi implantado (runtime-name: "ojdbc8.jar")
2026-11-06 15:29:50,438 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0010: "sirotcon-ejb.jar" foi implantado (runtime-name: "sirotcon-ejb.jar")
2026-11-06 15:29:50,438 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0010: "sigsj_internet-ear.ear" foi implantado (runtime-name: "sigsj_internet-ear.ear")
[p585600@caddeapllx2865 ~]$
[p585600@caddeapllx2865 ~]$
[p585600@caddeapllx2865 ~]$
[p585600@caddeapllx2865 ~]$ curl -s -o /dev/null -w '%{http_code}\n' http://localhost/<contexto-do-internet>/
-sh: contexto-do-internet: Arquivo ou diretório inexistente
[p585600@caddeapllx2865 ~]$
