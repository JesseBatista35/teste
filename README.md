[p585600@scttqapllx0032 ~]$ ps -ef | grep java
jboss    125771 125739  3 15:47 ?        00:01:22 /usr/lib/jvm/java-1.7.0-openjdk-1.7.0.261.x86_64/jre/bin/java -D[Standalone] -server -XX:+UseCompressedOops -Xms1303m -Xmx1303m -XX:MaxPermSize=256m -Djava.net.preferIPv4Stack=true -Dorg.jboss.resolver.warning=true -Dsun.rmi.dgc.client.gcInterval=3600000 -Dsun.rmi.dgc.server.gcInterval=3600000 -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.server.default.config=standalone.xml -Dorg.jboss.boot.log.file=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/boot.log -Dlogging.configuration=file:/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/logging.properties -jar /usr/local/EAP-6.0.1/jboss-eap-6.0/jboss-modules.jar -mp /usr/local/EAP-6.0.1/jboss-eap-6.0/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.standalone -Djboss.home.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0 -Djboss.server.base.dir=/usr/local/EAP-6.0.1/jboss-eap-6.0/standalone -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1
p585600  126829 126262  0 16:22 pts/2    00:00:00 grep java
[p585600@scttqapllx0032 ~]$ tail -100 /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/server.log
        at org.jboss.as.ee.component.TCCLInterceptor.processInvocation(TCCLInterceptor.java:45) [jboss-as-ee-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:61) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.as.ejb3.timerservice.TimedObjectInvokerImpl.callTimeout(TimedObjectInvokerImpl.java:102) [jboss-as-ejb3-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.as.ejb3.timerservice.task.CalendarTimerTask.callTimeout(CalendarTimerTask.java:60) [jboss-as-ejb3-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.as.ejb3.timerservice.task.TimerTask.run(TimerTask.java:132) [jboss-as-ejb3-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:473) [rt.jar:1.7.0_261]
        at java.util.concurrent.FutureTask.run(FutureTask.java:262) [rt.jar:1.7.0_261]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1152) [rt.jar:1.7.0_261]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:622) [rt.jar:1.7.0_261]
        at java.lang.Thread.run(Thread.java:748) [rt.jar:1.7.0_261]
        at org.jboss.threads.JBossThread.run(JBossThread.java:122) [jboss-threads-2.0.0.GA-redhat-2.jar:2.0.0.GA-redhat-2]
Caused by: com.unisys.br.amsfw.exception.AmsfwException: URL inválida para integração ao SIACI de Demandas e Contratos neste ambiente.
        at br.gov.cef.sismh.service.siaci.IntegracaoSiaciService.iniciarIntegracaoSiaci(IntegracaoSiaciService.java:180)
        at br.gov.cef.sismh.service.siaci.IntegracaoSiaciService.integracaoSiaciUnificada(IntegracaoSiaciService.java:168)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) [rt.jar:1.7.0_261]
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57) [rt.jar:1.7.0_261]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) [rt.jar:1.7.0_261]
        at java.lang.reflect.Method.invoke(Method.java:607) [rt.jar:1.7.0_261]
        at org.jboss.as.ee.component.ManagedReferenceMethodInterceptorFactory$ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptorFactory.java:72) [jboss-as-ee-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.invocation.WeavedInterceptor.processInvocation(WeavedInterceptor.java:53) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:34) [jboss-as-ee-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:43) [jboss-as-ejb3-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:21) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:61) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:53) [jboss-as-ee-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51) [jboss-as-ejb3-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:226) [jboss-as-ejb3-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        ... 23 more

16:15:00,055 INFO  [org.jboss.as.ejb3] (EJB default - 3) JBAS014121: Timer: [id=65191e55-b43e-4962-aef1-58da75c45862 timedObjectId=sismh.sismh-ejb-2.63.35.5.IntegracaoSiaciService auto-timer?:true persistent?:false timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@4bee99d7 initialExpiration=Wed Aug 19 00:00:00 BRT 2026 intervalDuration(in milli sec)=0 nextExpiration=Wed Aug 19 16:30:00 BRT 2026 timerState=IN_TIMEOUT será tentado novamente
16:15:00,057 INFO  [org.jboss.as.ejb3] (EJB default - 3) JBAS014123: O intervalo de nova tentativo para o timer: [id=65191e55-b43e-4962-aef1-58da75c45862 timedObjectId=sismh.sismh-ejb-2.63.35.5.IntegracaoSiaciService auto-timer?:true persistent?:false timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@4bee99d7 initialExpiration=Wed Aug 19 00:00:00 BRT 2026 intervalDuration(in milli sec)=0 nextExpiration=Wed Aug 19 16:30:00 BRT 2026 timerState=IN_TIMEOUT
16:15:00,060 INFO  [br.gov.cef.sismh.service.siaci.IntegracaoSiaciService] (EJB default - 3) Iniciando integracaoSiaciUnificada
16:15:00,060 INFO  [br.gov.cef.sismh.service.siaci.IntegracaoSiaciService] (EJB default - 3) tentando obter lock para execucao do job INTEGRACAO_SIACI.
16:15:00,063 INFO  [br.gov.cef.sismh.service.siaci.IntegracaoSiaciService] (EJB default - 3) resultado obtencao lock para execucao do job INTEGRACAO_SIACI: true
16:15:00,065 INFO  [br.gov.cef.sismh.service.siaci.IntegracaoSiaciService] (EJB default - 3) liberando lock do job INTEGRACAO_SIACI.
16:15:00,067 INFO  [br.gov.cef.sismh.service.siaci.IntegracaoSiaciService] (EJB default - 3) resultado liberacao lock do job INTEGRACAO_SIACI: true
16:15:00,067 INFO  [br.gov.cef.sismh.service.siaci.IntegracaoSiaciService] (EJB default - 3) Finalizado integracaoSiaciUnificada
16:15:00,068 ERROR [org.jboss.as.ejb3] (EJB default - 3) JBAS014122: Error na nova tentativa se intervalo para o timer: [id=65191e55-b43e-4962-aef1-58da75c45862 timedObjectId=sismh.sismh-ejb-2.63.35.5.IntegracaoSiaciService auto-timer?:true persistent?:false timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@4bee99d7 initialExpiration=Wed Aug 19 00:00:00 BRT 2026 intervalDuration(in milli sec)=0 nextExpiration=Wed Aug 19 16:30:00 BRT 2026 timerState=RETRY_TIMEOUT: javax.ejb.EJBException: com.unisys.br.amsfw.exception.AmsfwException: URL inválida para integração ao SIACI de Demandas e Contratos neste ambiente.
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.handleExceptionInOurTx(CMTTxInterceptor.java:164) [jboss-as-ejb3-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.as.ejb3.tx.TimerCMTTxInterceptor.handleExceptionInOurTx(TimerCMTTxInterceptor.java:53) [jboss-as-ejb3-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:228) [jboss-as-ejb3-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:302) [jboss-as-ejb3-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:188) [jboss-as-ejb3-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41) [jboss-as-ejb3-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:42) [jboss-as-ejb3-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50) [jboss-as-ee-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:43) [jboss-as-ejb3-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.as.ee.component.TCCLInterceptor.processInvocation(TCCLInterceptor.java:45) [jboss-as-ee-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:61) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.as.ejb3.timerservice.TimedObjectInvokerImpl.callTimeout(TimedObjectInvokerImpl.java:102) [jboss-as-ejb3-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.as.ejb3.timerservice.task.CalendarTimerTask.callTimeout(CalendarTimerTask.java:60) [jboss-as-ejb3-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.as.ejb3.timerservice.task.TimerTask.retryTimeout(TimerTask.java:184) [jboss-as-ejb3-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.as.ejb3.timerservice.task.TimerTask.run(TimerTask.java:140) [jboss-as-ejb3-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:473) [rt.jar:1.7.0_261]
        at java.util.concurrent.FutureTask.run(FutureTask.java:262) [rt.jar:1.7.0_261]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1152) [rt.jar:1.7.0_261]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:622) [rt.jar:1.7.0_261]
        at java.lang.Thread.run(Thread.java:748) [rt.jar:1.7.0_261]
        at org.jboss.threads.JBossThread.run(JBossThread.java:122) [jboss-threads-2.0.0.GA-redhat-2.jar:2.0.0.GA-redhat-2]
Caused by: com.unisys.br.amsfw.exception.AmsfwException: URL inválida para integração ao SIACI de Demandas e Contratos neste ambiente.
        at br.gov.cef.sismh.service.siaci.IntegracaoSiaciService.iniciarIntegracaoSiaci(IntegracaoSiaciService.java:180)
        at br.gov.cef.sismh.service.siaci.IntegracaoSiaciService.integracaoSiaciUnificada(IntegracaoSiaciService.java:168)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) [rt.jar:1.7.0_261]
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57) [rt.jar:1.7.0_261]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) [rt.jar:1.7.0_261]
        at java.lang.reflect.Method.invoke(Method.java:607) [rt.jar:1.7.0_261]
        at org.jboss.as.ee.component.ManagedReferenceMethodInterceptorFactory$ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptorFactory.java:72) [jboss-as-ee-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.invocation.WeavedInterceptor.processInvocation(WeavedInterceptor.java:53) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:34) [jboss-as-ee-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:43) [jboss-as-ejb3-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:21) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:61) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:53) [jboss-as-ee-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51) [jboss-as-ejb3-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.1.Final-redhat-2.jar:1.1.1.Final-redhat-2]
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:226) [jboss-as-ejb3-7.1.3.Final-redhat-4.jar:7.1.3.Final-redhat-4]
        ... 24 more

[p585600@scttqapllx0032 ~]$


O SISTEMA SISMH TQS ESTA FORA DO AR scttqapllx0032.df.caixa scttqapllx0032.df.caixa
