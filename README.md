[root@cbrdeapllx473 p981778]# sed -n '14980,15070p' \
/opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log.2026-11-16
11:42:10,640 INFO  [stdout] (default task-80)     from
11:42:10,640 INFO  [stdout] (default task-80)         CCR.CCRTB013_CONTRATO contratoto0_ cross
11:42:10,640 INFO  [stdout] (default task-80)     join
11:42:10,640 INFO  [stdout] (default task-80)         CCR.CCRTB235_BENEFICIO_INSS beneficioi1_ cross
11:42:10,640 INFO  [stdout] (default task-80)     join
11:42:10,640 INFO  [stdout] (default task-80)         CCR.CCRTB084_DETALHE_CONTRATO detalhecon2_
11:42:10,640 INFO  [stdout] (default task-80)     where
11:42:10,640 INFO  [stdout] (default task-80)         contratoto0_.NU_BENEFICIO_INSS=beneficioi1_.NU_BENEFICIO_INSS_LISTA(+)
11:42:10,640 INFO  [stdout] (default task-80)         and contratoto0_.NU_CONTRATO=detalhecon2_.NU_CONTRATO(+)
11:42:10,640 INFO  [stdout] (default task-80)         and (
11:42:10,640 INFO  [stdout] (default task-80)             contratoto0_.NU_PRODUTO in (
11:42:10,640 INFO  [stdout] (default task-80)                 ? , ?
11:42:10,641 INFO  [stdout] (default task-80)             )
11:42:10,641 INFO  [stdout] (default task-80)         )
11:42:10,641 INFO  [stdout] (default task-80)         and contratoto0_.NU_CONTRATO=?
11:42:10,709 WARN  [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (default task-80) SQL Error: 25156, SQLState: 99999
11:42:10,709 ERROR [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (default task-80) ORA-25156: a junção externa de estilo antigo (+) não pode ser usada com junções ANSI

11:42:10,782 ERROR [org.jboss.as.ejb3.invocation] (default task-80) WFLYEJB0034: A invocação de Jakarta Enterprise Beans falhou no componente ContratoAPXBean para o método public br.gov.caixa.ccr.dominio.Contrato br.gov.caixa.ccr.negocio.ContratoAPXBean.consultarContratoPorId(java.lang.Long,java.lang.String) throws java.lang.Exception: javax.ejb.EJBException: javax.persistence.PersistenceException: org.hibernate.exception.GenericJDBCException: could not extract ResultSet
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:268) [wildfly-ejb3-7.4.23.GA-redhat-00002.jar:7.4.23.GA-redhat-00002]
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:390) [wildfly-ejb3-7.4.23.GA-redhat-00002.jar:7.4.23.GA-redhat-00002]
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:160) [wildfly-ejb3-7.4.23.GA-redhat-00002.jar:7.4.23.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:72) [weld-ejb-3.1.11.Final-redhat-00001.jar:3.1.11.Final-redhat-00001]
        at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41) [wildfly-ejb3-7.4.23.GA-redhat-00002.jar:7.4.23.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47) [wildfly-ejb3-7.4.23.GA-redhat-00002.jar:7.4.23.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.security.SecurityContextInterceptor.processInvocation(SecurityContextInterceptor.java:100) [wildfly-ejb3-7.4.23.GA-redhat-00002.jar:7.4.23.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.4.23.GA-redhat-00002.jar:7.4.23.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64) [wildfly-ejb3-7.4.23.GA-redhat-00002.jar:7.4.23.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67) [wildfly-ejb3-7.4.23.GA-redhat-00002.jar:7.4.23.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
        at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633) [wildfly-elytron-security-manager-1.15.26.Final-redhat-00001.jar:1.15.26.Final-redhat-00001]
        at org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
        at org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:49) [wildfly-ejb3-7.4.23.GA-redhat-00002.jar:7.4.23.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
        at br.gov.caixa.ccr.negocio.ContratoAPXBean$$$view195.consultarContratoPorId(Unknown Source) [ccr-ejb.jar:]
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) [rt.jar:1.8.0_482]
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) [rt.jar:1.8.0_482]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) [rt.jar:1.8.0_482]
        at java.lang.reflect.Method.invoke(Method.java:498) [rt.jar:1.8.0_482]
        at org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:410) [weld-core-impl-3.1.11.Final-redhat-00001.jar:3.1.11.Final-redhat-00001]
        at org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:134) [weld-ejb-3.1.11.Final-redhat-00001.jar:3.1.11.Final-redhat-00001]
        at org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:56) [weld-core-impl-3.1.11.Final-redhat-00001.jar:3.1.11.Final-redhat-00001]
        at org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:68) [weld-ejb-3.1.11.Final-redhat-00001.jar:3.1.11.Final-redhat-00001]
        at org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:106) [weld-core-impl-3.1.11.Final-redhat-00001.jar:3.1.11.Final-redhat-00001]
        at br.gov.caixa.ccr.negocio.ContratoAPXBean$Proxy$_$$_Weld$EnterpriseProxy$.consultarContratoPorId(Unknown Source) [ccr-ejb.jar:]
        at br.gov.caixa.ccr.rest.ContratacaoRest.consultaListaAutorizacao(ContratacaoRest.java:449)
        at br.gov.caixa.ccr.rest.ContratacaoRest$Proxy$_$$_WeldClientProxy.consultaListaAutorizacao(Unknown Source)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) [rt.jar:1.8.0_482]
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) [rt.jar:1.8.0_482]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) [rt.jar:1.8.0_482]
        at java.lang.reflect.Method.invoke(Method.java:498) [rt.jar:1.8.0_482]
        at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:138) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:546) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:435) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$0(ResourceMethodInvoker.java:396) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.interception.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:358) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:398) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:365) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:338) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:440) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:229) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:135) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.interception.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:358) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:138) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:215) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.plugins.server.servlet.ServletContainerDispatcher.service(ServletContainerDispatcher.java:245) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:61) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:56) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at javax.servlet.http.HttpServlet.service(HttpServlet.java:590) [jboss-servlet-api_4.0_spec-2.0.0.Final-redhat-00001.jar:2.0.0.Final-redhat-00001]
        at io.undertow.servlet.handlers.ServletHandler.handleRequest(ServletHandler.java:74)
[root@cbrdeapllx473 p981778]# sed -n '15400,15490p' \
/opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log.2026-11-16
11:46:24,077 INFO  [stdout] (default task-80)     join
11:46:24,077 INFO  [stdout] (default task-80)         CCR.CCRTB084_DETALHE_CONTRATO detalhecon2_
11:46:24,077 INFO  [stdout] (default task-80)     where
11:46:24,077 INFO  [stdout] (default task-80)         contratoto0_.NU_BENEFICIO_INSS=beneficioi1_.NU_BENEFICIO_INSS_LISTA(+)
11:46:24,077 INFO  [stdout] (default task-80)         and contratoto0_.NU_CONTRATO=detalhecon2_.NU_CONTRATO(+)
11:46:24,077 INFO  [stdout] (default task-80)         and (
11:46:24,077 INFO  [stdout] (default task-80)             contratoto0_.NU_PRODUTO in (
11:46:24,077 INFO  [stdout] (default task-80)                 ? , ?
11:46:24,077 INFO  [stdout] (default task-80)             )
11:46:24,077 INFO  [stdout] (default task-80)         )
11:46:24,077 INFO  [stdout] (default task-80)         and contratoto0_.NU_CONTRATO=?
11:46:24,083 WARN  [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (default task-80) SQL Error: 25156, SQLState: 99999
11:46:24,083 ERROR [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (default task-80) ORA-25156: a junção externa de estilo antigo (+) não pode ser usada com junções ANSI

11:46:24,086 ERROR [org.jboss.as.ejb3.invocation] (default task-80) WFLYEJB0034: A invocação de Jakarta Enterprise Beans falhou no componente ContratoAPXBean para o método public br.gov.caixa.ccr.dominio.Contrato br.gov.caixa.ccr.negocio.ContratoAPXBean.consultarContratoPorId(java.lang.Long,java.lang.String) throws java.lang.Exception: javax.ejb.EJBException: javax.persistence.PersistenceException: org.hibernate.exception.GenericJDBCException: could not extract ResultSet
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:268) [wildfly-ejb3-7.4.23.GA-redhat-00002.jar:7.4.23.GA-redhat-00002]
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:390) [wildfly-ejb3-7.4.23.GA-redhat-00002.jar:7.4.23.GA-redhat-00002]
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:160) [wildfly-ejb3-7.4.23.GA-redhat-00002.jar:7.4.23.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.weld.module.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:72) [weld-ejb-3.1.11.Final-redhat-00001.jar:3.1.11.Final-redhat-00001]
        at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41) [wildfly-ejb3-7.4.23.GA-redhat-00002.jar:7.4.23.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47) [wildfly-ejb3-7.4.23.GA-redhat-00002.jar:7.4.23.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.security.SecurityContextInterceptor.processInvocation(SecurityContextInterceptor.java:100) [wildfly-ejb3-7.4.23.GA-redhat-00002.jar:7.4.23.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.4.23.GA-redhat-00002.jar:7.4.23.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64) [wildfly-ejb3-7.4.23.GA-redhat-00002.jar:7.4.23.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67) [wildfly-ejb3-7.4.23.GA-redhat-00002.jar:7.4.23.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee.component.NamespaceContextInterceptor.processInvocation(NamespaceContextInterceptor.java:50)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
        at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:633) [wildfly-elytron-security-manager-1.15.26.Final-redhat-00001.jar:1.15.26.Final-redhat-00001]
        at org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
        at org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:191)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.security.IdentityInterceptor.processInvocation(IdentityInterceptor.java:49) [wildfly-ejb3-7.4.23.GA-redhat-00002.jar:7.4.23.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
        at br.gov.caixa.ccr.negocio.ContratoAPXBean$$$view195.consultarContratoPorId(Unknown Source) [ccr-ejb.jar:]
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) [rt.jar:1.8.0_482]
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) [rt.jar:1.8.0_482]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) [rt.jar:1.8.0_482]
        at java.lang.reflect.Method.invoke(Method.java:498) [rt.jar:1.8.0_482]
        at org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:410) [weld-core-impl-3.1.11.Final-redhat-00001.jar:3.1.11.Final-redhat-00001]
        at org.jboss.weld.module.ejb.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:134) [weld-ejb-3.1.11.Final-redhat-00001.jar:3.1.11.Final-redhat-00001]
        at org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:56) [weld-core-impl-3.1.11.Final-redhat-00001.jar:3.1.11.Final-redhat-00001]
        at org.jboss.weld.module.ejb.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:68) [weld-ejb-3.1.11.Final-redhat-00001.jar:3.1.11.Final-redhat-00001]
        at org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:106) [weld-core-impl-3.1.11.Final-redhat-00001.jar:3.1.11.Final-redhat-00001]
        at br.gov.caixa.ccr.negocio.ContratoAPXBean$Proxy$_$$_Weld$EnterpriseProxy$.consultarContratoPorId(Unknown Source) [ccr-ejb.jar:]
        at br.gov.caixa.ccr.rest.ContratacaoRest.consultaListaAutorizacao(ContratacaoRest.java:449)
        at br.gov.caixa.ccr.rest.ContratacaoRest$Proxy$_$$_WeldClientProxy.consultaListaAutorizacao(Unknown Source)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) [rt.jar:1.8.0_482]
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) [rt.jar:1.8.0_482]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) [rt.jar:1.8.0_482]
        at java.lang.reflect.Method.invoke(Method.java:498) [rt.jar:1.8.0_482]
        at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:138) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:546) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:435) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$0(ResourceMethodInvoker.java:396) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.interception.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:358) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:398) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:365) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:338) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:440) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:229) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:135) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.interception.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:358) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:138) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:215) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.plugins.server.servlet.ServletContainerDispatcher.service(ServletContainerDispatcher.java:245) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:61) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:56) [resteasy-jaxrs-3.15.10.Final-redhat-00001.jar:3.15.10.Final-redhat-00001]
        at javax.servlet.http.HttpServlet.service(HttpServlet.java:590) [jboss-servlet-api_4.0_spec-2.0.0.Final-redhat-00001.jar:2.0.0.Final-redhat-00001]
        at io.undertow.servlet.handlers.ServletHandler.handleRequest(ServletHandler.java:74)
        at io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:129)
        at br.gov.caixa.ccr.filter.CCRWebFilter.doFilter(CCRWebFilter.java:31)
        at io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:67)
        at io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)





 e esse erro de banco aqui tbm nao seira motivo para  o 401
