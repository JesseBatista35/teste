
[p585600@caddeapllx2557 ~]$ sudo su-
[sudo] senha para p585600:
sudo: su-: comando não encontrado
[p585600@caddeapllx2557 ~]$
[p585600@caddeapllx2557 ~]$
[p585600@caddeapllx2557 ~]$
[p585600@caddeapllx2557 ~]$
[p585600@caddeapllx2557 ~]$ sudo su
[root@caddeapllx2557 p585600]#
[root@caddeapllx2557 p585600]#
[root@caddeapllx2557 p585600]# ls -la /opt/jboss-eap/standalone/deployments/
total 13804
drwxrwxr-x 2 jboss jboss      126 nov  3 13:27 .
drwxrwxr-x 8 jboss jboss       91 set 30  2024 ..
-rwxrw-rw- 1 jboss jboss 14111747 nov  3 13:27 boletoService-ear.ear
-rw-r--r-- 1 jboss jboss       21 nov  3 13:27 boletoService-ear.ear.deployed
-rwxrwxr-x 1 jboss jboss     8888 jun 23  2021 README.txt
-rw-r--r-- 1 jboss jboss       16 out 22 15:01 sirotcon-ejb.jar.undeployed
[root@caddeapllx2557 p585600]# ls -la /opt/jboss-eap/standalone/deployments/ | grep -i sirot
-rw-r--r-- 1 jboss jboss       16 out 22 15:01 sirotcon-ejb.jar.undeployed
[root@caddeapllx2557 p585600]#
[root@caddeapllx2557 p585600]#
[root@caddeapllx2557 p585600]# \rm -f /opt/jboss-eap/standalone/deployments/sirotcon-ejb.jar.undeployed
[root@caddeapllx2557 p585600]# ls -la /opt/jboss-eap/standalone/deployments/ | grep -E '\.(failed|undeployed)$'
[root@caddeapllx2557 p585600]# grep -E 'WFLYSRV0010|WFLYUT0021|WFLYSRV0026|ERROR' /logs/jboss/jboss-eap/standalone/sigsj-boleto/server.log | tail -20
2026-11-03 13:27:14,885 ERROR [stderr] (ServerService Thread Pool -- 77)        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
2026-11-03 13:27:14,885 ERROR [stderr] (ServerService Thread Pool -- 77)        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
2026-11-03 13:27:14,885 ERROR [stderr] (ServerService Thread Pool -- 77)        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
2026-11-03 13:27:14,885 ERROR [stderr] (ServerService Thread Pool -- 77)        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
2026-11-03 13:27:14,886 ERROR [stderr] (ServerService Thread Pool -- 77)        at io.undertow.servlet.core.DeploymentManagerImpl.start(DeploymentManagerImpl.java:605)
2026-11-03 13:27:14,886 ERROR [stderr] (ServerService Thread Pool -- 77)        at org.wildfly.extension.undertow.deployment.UndertowDeploymentService.startContext(UndertowDeploymentService.java:97)
2026-11-03 13:27:14,886 ERROR [stderr] (ServerService Thread Pool -- 77)        at org.wildfly.extension.undertow.deployment.UndertowDeploymentService$1.run(UndertowDeploymentService.java:78)
2026-11-03 13:27:14,886 ERROR [stderr] (ServerService Thread Pool -- 77)        at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
2026-11-03 13:27:14,887 ERROR [stderr] (ServerService Thread Pool -- 77)        at java.util.concurrent.FutureTask.run(FutureTask.java:266)
2026-11-03 13:27:14,887 ERROR [stderr] (ServerService Thread Pool -- 77)        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
2026-11-03 13:27:14,887 ERROR [stderr] (ServerService Thread Pool -- 77)        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
2026-11-03 13:27:14,889 ERROR [stderr] (ServerService Thread Pool -- 77)        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
2026-11-03 13:27:14,889 ERROR [stderr] (ServerService Thread Pool -- 77)        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
2026-11-03 13:27:14,889 ERROR [stderr] (ServerService Thread Pool -- 77)        at java.lang.Thread.run(Thread.java:750)
2026-11-03 13:27:14,889 ERROR [stderr] (ServerService Thread Pool -- 77)        at org.jboss.threads.JBossThread.run(JBossThread.java:513)
2026-11-03 13:27:15,392 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 77) WFLYUT0021: Contexto web registrado: '/boletoService' para servidor 'default-server'
2026-11-03 13:27:15,614 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0010: "boletoService-ear.ear" foi implantado (runtime-name: "boletoService-ear.ear")
2026-11-03 13:27:20,156 ERROR [org.jboss.modcluster] (UndertowEventHandlerAdapterService - 1) MODCLUSTER000043: Failed to send INFO command to localhost/127.0.0.1:6666: Conexão recusada (Connection refused)
2026-11-03 22:14:41,691 ERROR [org.jboss.modcluster] (UndertowEventHandlerAdapterService - 1) MODCLUSTER000040: Failed to parse response header from localhost/127.0.0.1:6666 for INFO command: java.lang.NumberFormatException: For input string: "/"
2026-11-03 22:14:41,696 ERROR [org.jboss.modcluster] (UndertowEventHandlerAdapterService - 1) MODCLUSTER000042: Error null sending INFO command to localhost/127.0.0.1:6666, configuration will be reset: null
[root@caddeapllx2557 p585600]#
