-sh-4.1$ ls -la /logs/jboss-eap/hc/servers/siouv_node1_lx0002/
total 33412
drwxrwxr-x 2 jboss jboss     4096 Jul 13 13:30 .
drwxrwxr-x 5 jboss jboss     4096 May  6 16:38 ..
-rw-rw-r-- 1 jboss jboss  2680166 Jul 13 14:38 server.log
-rw-rw-r-- 1 jboss jboss 10494832 Jul 13 13:15 server.log.1
-rw-rw-r-- 1 jboss jboss 10509647 Jul 13 07:30 server.log.2
-rw-rw-r-- 1 jboss jboss 10507317 Jul 13 01:45 server.log.3
-rw-rw-r-- 1 jboss jboss        0 May  6 16:38 siouv.log
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ tail -50 /logs/jboss-eap/hc/servers/siouv_node1_lx0002/server.log ] grep -iE "exception|error|refused|timeout|unable to connect" /logs/jboss-eap/hc/servers/siouv_node1_lx0002/server.log | tail -30
tail: option used in invalid context -- 5
-sh-4.1$
-sh-4.1$
-sh-4.1$ tail -50 /logs/jboss-eap/hc/servers/siouv_node1_lx0002/server.log
        at org.jboss.as.weld.ejb.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:86) [jboss-as-weld-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.jboss.as.weld.ejb.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:97) [jboss-as-weld-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63) [jboss-as-ee-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.3.Final-redhat-1.jar:1.1.3.Final-redhat-1]
        at org.jboss.invocation.WeavedInterceptor.processInvocation(WeavedInterceptor.java:53) [jboss-invocation-1.1.3.Final-redhat-1.jar:1.1.3.Final-redhat-1]
        at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63) [jboss-as-ee-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.3.Final-redhat-1.jar:1.1.3.Final-redhat-1]
        at org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:43) [jboss-as-ejb3-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.3.Final-redhat-1.jar:1.1.3.Final-redhat-1]
        at org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47) [jboss-as-jpa-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.3.Final-redhat-1.jar:1.1.3.Final-redhat-1]
        at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:73) [jboss-as-weld-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.3.Final-redhat-1.jar:1.1.3.Final-redhat-1]
        at org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:21) [jboss-invocation-1.1.3.Final-redhat-1.jar:1.1.3.Final-redhat-1]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.3.Final-redhat-1.jar:1.1.3.Final-redhat-1]
        at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:61) [jboss-invocation-1.1.3.Final-redhat-1.jar:1.1.3.Final-redhat-1]
        at org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:53) [jboss-as-ee-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.3.Final-redhat-1.jar:1.1.3.Final-redhat-1]
        at org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51) [jboss-as-ejb3-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.3.Final-redhat-1.jar:1.1.3.Final-redhat-1]
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInCallerTx(CMTTxInterceptor.java:258) [jboss-as-ejb3-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:333) [jboss-as-ejb3-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:243) [jboss-as-ejb3-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.3.Final-redhat-1.jar:1.1.3.Final-redhat-1]
        at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41) [jboss-as-ejb3-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.3.Final-redhat-1.jar:1.1.3.Final-redhat-1]
        at org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:43) [jboss-as-ejb3-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.3.Final-redhat-1.jar:1.1.3.Final-redhat-1]
        at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [jboss-as-ejb3-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.3.Final-redhat-1.jar:1.1.3.Final-redhat-1]
        at org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64) [jboss-as-ejb3-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.3.Final-redhat-1.jar:1.1.3.Final-redhat-1]
        at org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:59) [jboss-as-ejb3-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.3.Final-redhat-1.jar:1.1.3.Final-redhat-1]
        at org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50) [jboss-as-ee-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.3.Final-redhat-1.jar:1.1.3.Final-redhat-1]
        at org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:55) [jboss-as-ejb3-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.3.Final-redhat-1.jar:1.1.3.Final-redhat-1]
        at org.jboss.as.ee.component.TCCLInterceptor.processInvocation(TCCLInterceptor.java:45) [jboss-as-ee-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.3.Final-redhat-1.jar:1.1.3.Final-redhat-1]
        at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:61) [jboss-invocation-1.1.3.Final-redhat-1.jar:1.1.3.Final-redhat-1]
        at org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:189) [jboss-as-ee-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:185) [jboss-as-ee-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:288) [jboss-invocation-1.1.3.Final-redhat-1.jar:1.1.3.Final-redhat-1]
        at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:61) [jboss-invocation-1.1.3.Final-redhat-1.jar:1.1.3.Final-redhat-1]
        at org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:73) [jboss-as-ee-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at br.gov.caixa.siouv.repository.RepositoryService$$$view44.find(Unknown Source) [siouv-ejb-5.20.03.03.jar:]
        at br.gov.caixa.siouv.service.TextoAberturaServiceCore.doFiltrar(TextoAberturaServiceCore.java:43) [siouv-ejb-5.20.03.03.jar:]
        ... 111 more

-sh-4.1$ grep -iE "exception|error|refused|timeout|unable to connect" /logs/jboss-eap/hc/servers/siouv_node1_lx0002/server.log | tail -30
Caused by: javax.resource.ResourceException: Could not create connection
Caused by: java.sql.SQLException: Listener refused the connection with the following error:
Caused by: oracle.net.ns.NetException: Listener refused the connection with the following error:
2026-07-13 14:30:00,076ERROR(EJB default - 4)JBAS014122: Error during retrying timeout for timer: [id=cfe4d0e1-502d-4d40-8c83-3fac6d61cc51 timedObjectId=siouv-5.20.03.03-b240.siouv-ejb-5.20.03.03.RDRTask auto-timer?:true persistent?:true timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@4f9d8ee initialExpiration=null intervalDuration(in milli sec)=0 nextExpiration=Mon Jul 13 14:45:00 BRT 2026 timerState=RETRY_TIMEOUT info=null]: javax.ejb.EJBTransactionRolledbackException: javax.ejb.EJBTransactionRolledbackException: Could not open connection
        at org.jboss.as.ejb3.timerservice.TimedObjectInvokerImpl.callTimeout(TimedObjectInvokerImpl.java:101) [jboss-as-ejb3-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.jboss.as.ejb3.timerservice.task.CalendarTimerTask.callTimeout(CalendarTimerTask.java:61) [jboss-as-ejb3-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.jboss.as.ejb3.timerservice.task.TimerTask.retryTimeout(TimerTask.java:221) [jboss-as-ejb3-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
Caused by: br.gov.caixa.core.exception.BaseException: javax.ejb.EJBTransactionRolledbackException: Could not open connection
Caused by: javax.ejb.EJBTransactionRolledbackException: Could not open connection
Caused by: org.hibernate.exception.GenericJDBCException: Could not open connection
        at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:54) [hibernate-core-4.2.27.Final-redhat-1.jar:4.2.27.Final-redhat-1]
        at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:124) [hibernate-core-4.2.27.Final-redhat-1.jar:4.2.27.Final-redhat-1]
        at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:109) [hibernate-core-4.2.27.Final-redhat-1.jar:4.2.27.Final-redhat-1]
Caused by: java.sql.SQLException: javax.resource.ResourceException: IJ000453: Unable to get managed connection for java:/jdbc/OracleSiouvDS
Caused by: javax.resource.ResourceException: IJ000453: Unable to get managed connection for java:/jdbc/OracleSiouvDS
Caused by: javax.resource.ResourceException: IJ000658: Unexpected throwable while trying to create a connection: null
Caused by: javax.resource.ResourceException: Could not create connection
Caused by: java.sql.SQLException: Listener refused the connection with the following error:
Caused by: oracle.net.ns.NetException: Listener refused the connection with the following error:
2026-07-13 14:38:52,788WARN (ajp-/10.116.88.30:13409-2)IJ000604: Throwable while attempting to get a new connection: null: javax.resource.ResourceException: Could not create connection
        at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:97)
Caused by: java.sql.SQLException: Listener refused the connection with the following error:
Caused by: oracle.net.ns.NetException: Listener refused the connection with the following error:
2026-07-13 14:38:52,793WARN (ajp-/10.116.88.30:13409-2)SQL Error: 0, SQLState: null
2026-07-13 14:38:52,793ERROR(ajp-/10.116.88.30:13409-2)javax.resource.ResourceException: IJ000453: Unable to get managed connection for java:/jdbc/OracleSiouvDS
2026-07-13 14:38:52,802ERROR(ajp-/10.116.88.30:13409-2)JBAS014134: EJB Invocation failed on component TextoAberturaServiceCore for method public abstract java.util.List br.gov.caixa.core.service.BaseService.doFiltrar(br.gov.caixa.core.model.Model) throws br.gov.caixa.core.exception.BaseException: javax.ejb.EJBException: br.gov.caixa.core.exception.BaseException: br.gov.caixa.core.exception.RepositoryException: Erro ao realizar a listagem com o servico OUV.OUVSPA12_FILTRAR_055 verifique as anotacoes de conexoes . Erro Original : Could not open connection
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.handleExceptionInOurTx(CMTTxInterceptor.java:191) [jboss-as-ejb3-7.5.24.Final-redhat-00001.jar:7.5.24.Final-redhat-00001]
        at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:97)
Caused by: br.gov.caixa.core.exception.BaseException: br.gov.caixa.core.exception.RepositoryException: Erro ao realizar a listagem com o servico OUV.OUVSPA12_FILTRAR_055 verifique as anotacoes de conexoes . Erro Original : Could not open connection
Caused by: br.gov.caixa.core.exception.RepositoryException: Erro ao realizar a listagem com o servico OUV.OUVSPA12_FILTRAR_055 verifique as anotacoes de conexoes . Erro Original : Could not open connection
-sh-4.1$ ls -la /logs/jboss-eap/hc/servers/siouv_node1_lx0002/siouv.log
-rw-rw-r-- 1 jboss jboss 0 May  6 16:38 /logs/jboss-eap/hc/servers/siouv_node1_lx0002/siouv.log
-sh-4.1$ tail -100 /logs/jboss-eap/hc/servers/siouv_node1_lx0002/siouv.log | grep -iE "oracle|jdbc|connect|orad01ng|timeout"
-sh-4.1$
