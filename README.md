p585600@srjtqapllx0056 ~]$ grep -m1 -A25 "indisponibilidade" $F | cut -c1-300; echo "-----"; grep -i "caused by" $F | cut -c1-200 | sort | uniq -c | sort -rn | head -15
14:39:11,146 ERROR [br.gov.caixa.sigaf.service.InadimplenciaService] (default task-23), Erro ao atualizar os valores do contrato 454764.: br.gov.caixa.sigaf.exception.SigafException: Não foi possível consultar os dados da APFAP327 devido a uma indisponibilidade temporária.
Por favor, tente novamente mais tarde.
        at br.gov.caixa.sigaf.dao.db2.InadimplenciaDAO.getAP327(InadimplenciaDAO.java:249) [sigaf-ejb.jar:]
        at br.gov.caixa.sigaf.service.InadimplenciaService.atualizarValoresInadimplencias(InadimplenciaService.java:135) [sigaf-ejb.jar:]
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) [rt.jar:1.8.0_121]
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) [rt.jar:1.8.0_121]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) [rt.jar:1.8.0_121]
        at java.lang.reflect.Method.invoke(Method.java:498) [rt.jar:1.8.0_121]
        at org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
        at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:437)
        at org.jboss.as.weld.ejb.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:82) [wildfly-weld-7.0.0.GA-redhat-2.jar:7.0.0.GA-redhat-2]
        at org.jboss.as.weld.ejb.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:93) [wildfly-weld-7.0.0.GA-redhat-2.jar:7.0.0.GA-redhat-2]
        at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
        at org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:43) [wildfly-ejb3-7.0.0.GA-redhat-2.jar:7.0.0.GA-redhat-2]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
        at org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47) [wildfly-jpa-7.0.0.GA-redhat-2.jar:7.0.0.GA-redhat-2]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
        at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:437)
        at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:64) [weld-core-impl-2.3.3.Final-redhat-1.jar:2.3.3.Final-redhat-1]
        at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:83) [wildfly-weld-7.0.0.GA-redhat-2.jar:7.0.0.GA-redhat-2]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
        at org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45) [wildfly-ee-7.0.0.GA-redhat-2.jar:7.0.0.GA-redhat-2]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:340)
        at org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:21)
-----
  11793 Caused by: java.sql.SQLException: IO error: java.io.EOFException
   2273 Caused by: javax.resource.ResourceException: IJ031084: Unable to create connection
   2273 Caused by: javax.resource.ResourceException: IJ000453: Unable to get managed connection for java:/idmsapf
   2273 Caused by: java.sql.SQLException: javax.resource.ResourceException: IJ000453: Unable to get managed connection for java:/idmsapf
    393 Caused by: java.sql.SQLException: IO error: java.net.SocketException: Connection reset
    257 Caused by: br.gov.caixa.sigaf.exception.SigafException: APFAP004 - OPERACAO INEXISTENTE NO APFRB115
[p585600@srjtqapllx0056 ~]$
