-sh-4.2$ grep -B 5 -A 40 "16:33:25,365" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.SQLCODE=N4
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.CODIGOEXECUTAVEL=X30
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.CODIGOACESSO=N1
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.CODABRANGENCIA=X2
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.ICAVISO=X1
2026-08-12 16:33:25,365 ERROR [org.jboss.as.ejb3.invocation] (default task-1) WFLYEJB0034: A invocação de Jakarta Enterprise Beans falhou no componente ValidadorAcessoServiceBean para o método public boolean br.gov.caixa.sicmu.seguranca.service.ValidadorAcessoServiceBean.validaAcesso(br.gov.caixa.sicmu.seguranca.retorno.UsuarioSGR,java.lang.String) throws br.gov.caixa.sicmu.exceptions.SicmuException: javax.ejb.EJBException: WFLYEJB0442: Erro inesperado
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInNoTx(CMTTxInterceptor.java:234)
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.notSupported(CMTTxInterceptor.java:373)
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:149)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:72)
        at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.security.SecurityContextInterceptor.processInvocation(SecurityContextInterceptor.java:100)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
        at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633)
        at org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
        at org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
        at org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
        at br.gov.caixa.sicmu.seguranca.service.ValidadorAcessoServiceBean$$$view17.validaAcesso(Unknown Source)
        at br.gov.caixa.sicmu.operacaohabitacional.bean.ConsultaOperacaoHabitacionalBean.init(ConsultaOperacaoHabitacionalBean.java:132)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at org.jboss.weld.injection.producer.DefaultLifecycleCallbackInvoker.invokeMethods(DefaultLifecycleCallbackInvoker.java:83)
        at org.jboss.weld.injection.producer.DefaultLifecycleCallbackInvoker.postConstruct(DefaultLifecycleCallbackInvoker.java:66)
-sh-4.2$



