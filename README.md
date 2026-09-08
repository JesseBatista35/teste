root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]# sed -n '1080,1245p' /logs/jboss/jboss-eap/standalone/siarg-interno/server.log
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) [rt.jar:1.8.0_472]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) [rt.jar:1.8.0_472]
        at java.lang.reflect.Method.invoke(Method.java:498) [rt.jar:1.8.0_472]
        at org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52) [wildfly-ee-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422) [jboss-invocation-1.6.3.Final-redhat-00001.jar:1.6.3.Final-redhat-00001]
        at org.jboss.invocation.WeavedInterceptor.processInvocation(WeavedInterceptor.java:50) [jboss-invocation-1.6.3.Final-redhat-00001.jar:1.6.3.Final-redhat-00001]
        at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:61) [wildfly-ee-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422) [jboss-invocation-1.6.3.Final-redhat-00001.jar:1.6.3.Final-redhat-00001]
        at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509) [jboss-invocation-1.6.3.Final-redhat-00001.jar:1.6.3.Final-redhat-00001]
        at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79) [wildfly-weld-common-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89) [wildfly-weld-common-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:104) [wildfly-weld-common-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:61) [wildfly-ee-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422) [jboss-invocation-1.6.3.Final-redhat-00001.jar:1.6.3.Final-redhat-00001]
        at org.jboss.invocation.WeavedInterceptor.processInvocation(WeavedInterceptor.java:50) [jboss-invocation-1.6.3.Final-redhat-00001.jar:1.6.3.Final-redhat-00001]
        at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:61) [wildfly-ee-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422) [jboss-invocation-1.6.3.Final-redhat-00001.jar:1.6.3.Final-redhat-00001]
        at org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:43) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422) [jboss-invocation-1.6.3.Final-redhat-00001.jar:1.6.3.Final-redhat-00001]
        at org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45) [wildfly-ee-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422) [jboss-invocation-1.6.3.Final-redhat-00001.jar:1.6.3.Final-redhat-00001]
        at org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40) [jboss-invocation-1.6.3.Final-redhat-00001.jar:1.6.3.Final-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422) [jboss-invocation-1.6.3.Final-redhat-00001.jar:1.6.3.Final-redhat-00001]
        at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53) [jboss-invocation-1.6.3.Final-redhat-00001.jar:1.6.3.Final-redhat-00001]
        at org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52) [wildfly-ee-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422) [jboss-invocation-1.6.3.Final-redhat-00001.jar:1.6.3.Final-redhat-00001]
        at org.jboss.as.ejb3.component.singleton.SingletonComponentInstanceAssociationInterceptor.processInvocation(SingletonComponentInstanceAssociationInterceptor.java:53) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422) [jboss-invocation-1.6.3.Final-redhat-00001.jar:1.6.3.Final-redhat-00001]
        at org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:54) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422) [jboss-invocation-1.6.3.Final-redhat-00001.jar:1.6.3.Final-redhat-00001]
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        ... 39 more
Caused by: java.lang.NullPointerException

06:00:00,659 ERROR [org.jboss.as.ejb3.invocation] (EJB default - 1) WFLYEJB0034: A invocação de Jakarta Enterprise Beans falhou no componente JobUsuariosAcessoUnidadeService para o método public void br.gov.caixa.gitecsa.siarg.schedule.JobUsuariosAcessoUnidadeService.doWork(): java.lang.IllegalStateException: WFLYEE0042: Falha ao construir a instância do componente
        at org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:170)
        at org.jboss.as.ee.component.BasicComponent.constructComponentInstance(BasicComponent.java:141)
        at org.jboss.as.ee.component.BasicComponent.createInstance(BasicComponent.java:88)
        at org.jboss.as.ejb3.component.stateless.StatelessSessionComponent$1.create(StatelessSessionComponent.java:64) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.as.ejb3.component.stateless.StatelessSessionComponent$1.create(StatelessSessionComponent.java:61) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.as.ejb3.pool.AbstractPool.create(AbstractPool.java:56) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.as.ejb3.pool.strictmax.StrictMaxPool.get(StrictMaxPool.java:124) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:47) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:54) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:72) [weld-ejb-3.1.10.Final-redhat-00001.jar:3.1.10.Final-redhat-00001]
        at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.security.SecurityContextInterceptor.processInvocation(SecurityContextInterceptor.java:100) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
        at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633) [wildfly-elytron-security-manager-1.15.23.Final-redhat-00001.jar:1.15.23.Final-redhat-00001]
        at org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
        at org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:49) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
        at br.gov.caixa.gitecsa.siarg.schedule.JobUsuariosAcessoUnidadeService$$$view46.doWork(Unknown Source) [classes:]
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) [rt.jar:1.8.0_472]
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) [rt.jar:1.8.0_472]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) [rt.jar:1.8.0_472]
        at java.lang.reflect.Method.invoke(Method.java:498) [rt.jar:1.8.0_472]
        at org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:410) [weld-core-impl-3.1.10.Final-redhat-00001.jar:3.1.10.Final-redhat-00001]
        at org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:134) [weld-ejb-3.1.10.Final-redhat-00001.jar:3.1.10.Final-redhat-00001]
        at org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:56) [weld-core-impl-3.1.10.Final-redhat-00001.jar:3.1.10.Final-redhat-00001]
        at org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:68) [weld-ejb-3.1.10.Final-redhat-00001.jar:3.1.10.Final-redhat-00001]
        at org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:106) [weld-core-impl-3.1.10.Final-redhat-00001.jar:3.1.10.Final-redhat-00001]
        at br.gov.caixa.gitecsa.siarg.schedule.JobUsuariosAcessoUnidadeService$Proxy$_$$_Weld$EnterpriseProxy$.doWork(Unknown Source) [classes:]
        at br.gov.caixa.gitecsa.siarg.schedule.JobUsuariosAcessoUnidadeListener.ejbTimeout(JobUsuariosAcessoUnidadeListener.java:43) [classes:]
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) [rt.jar:1.8.0_472]
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) [rt.jar:1.8.0_472]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) [rt.jar:1.8.0_472]
        at java.lang.reflect.Method.invoke(Method.java:498) [rt.jar:1.8.0_472]
        at org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.WeavedInterceptor.processInvocation(WeavedInterceptor.java:50)
        at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:61)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
        at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
        at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:104)
        at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:61)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.WeavedInterceptor.processInvocation(WeavedInterceptor.java:50)
        at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:61)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:43) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45) [wildfly-ee-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.singleton.SingletonComponentInstanceAssociationInterceptor.processInvocation(SingletonComponentInstanceAssociationInterceptor.java:53) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:54) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:254) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:390) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:160) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:81) [weld-ejb-3.1.10.Final-redhat-00001.jar:3.1.10.Final-redhat-00001]
        at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.security.SecurityContextInterceptor.processInvocation(SecurityContextInterceptor.java:100) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.as.ejb3.component.singleton.ContainerManagedConcurrencyInterceptor.processInvocation(ContainerManagedConcurrencyInterceptor.java:106) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
        at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633) [wildfly-elytron-security-manager-1.15.23.Final-redhat-00001.jar:1.15.23.Final-redhat-00001]
        at org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ejb3.timerservice.TimedObjectInvokerImpl.callTimeout(TimedObjectInvokerImpl.java:99) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.as.ejb3.timerservice.TimedObjectInvokerImpl.callTimeout(TimedObjectInvokerImpl.java:109) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.as.ejb3.timerservice.CalendarTimerTask.invokeBeanMethod(CalendarTimerTask.java:66) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.as.ejb3.timerservice.CalendarTimerTask.callTimeout(CalendarTimerTask.java:53) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.as.ejb3.timerservice.TimerTask.run(TimerTask.java:186) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.as.ejb3.timerservice.TimerServiceImpl$Task$1.run(TimerServiceImpl.java:1357) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.wildfly.extension.requestcontroller.ControlPointTask.run(ControlPointTask.java:46)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at java.lang.Thread.run(Thread.java:750) [rt.jar:1.8.0_472]
        at org.jboss.threads.JBossThread.run(JBossThread.java:513)
Caused by: java.lang.NullPointerException

06:00:00,757 ERROR [org.jboss.as.ejb3.timer] (EJB default - 1) WFLYEJB0020: Erro ao invocar o tempo limite para o temporizador: [id=16508c8e-5ce6-46fd-8072-3dd6e10b99a4 timedObjectId=siarg.siarg.JobUsuariosAcessoUnidadeListener auto-timer?:false persistent?:false timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@6073cb40 previousRun=Mon Sep 07 06:00:00 BRT 2026 initialExpiration=null intervalDuration(in milli sec)=0 nextExpiration=Wed Sep 09 06:00:00 BRT 2026 timerState=IN_TIMEOUT info=null] ScheduleExpression [second=0;minute=0;hour=6;dayOfMonth=*;month=*;dayOfWeek=Mon, Tue, Wed, Thu, Fri;year=*;timezoneID=null;start=null;end=null]: javax.ejb.EJBException: java.lang.IllegalStateException: WFLYEE0042: Falha ao construir a instância do componente
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:268) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:390) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:160) [wildfly-ejb3-7.4.18.GA-redhat-00001.jar:7.4.18.GA-redhat-00001]
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
