
                at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
                at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
                at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
                at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1348)
                at org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
                ... 1 more

-sh-4.2$ nc -zv -w5 10.216.80.110 7000
-sh: nc: comando não encontrado
-sh-4.2$ telnet 10.216.80.110 7000
Trying 10.216.80.110...



