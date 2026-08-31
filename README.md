09:37:54,157 ERROR [io.undertow.request] (default task-69) UT005023: Exception handling request to /sidis-api/api/fato-irregular/paginado-juizo: org.jboss.resteasy.spi.UnhandledException: javax.ejb.EJBException: br.gov.caixa.arquitetura.javaee.core.comum.exception.SIDISBusinessException: Erro na comunicação com o SIICO. Acione o suporte tecnológico.
	at org.jboss.resteasy.core.ExceptionHandler.handleApplicationException(ExceptionHandler.java:78)
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:222)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:179)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:422)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:213)
	at org.jboss.resteasy.plugins.server.servlet.ServletContainerDispatcher.service(ServletContainerDispatcher.java:228)
	at org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:56)
	at org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:51)
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:790)
	at io.undertow.servlet.handlers.ServletHandler.handleRequest(ServletHandler.java:85)
	at io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:129)
	at br.gov.caixa.arquitetura.javaee.api.comum.web.BaseFilter.doFilter(BaseFilter.java:40)
	at io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:61)
	at io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
	at br.gov.caixa.arquitetura.javaee.api.comum.web.BaseFilter.doFilter(BaseFilter.java:40)
	at io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:61)
	at io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
	at io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:84)
	at io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
	at io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
	at org.wildfly.extension.undertow.security.SecurityContextAssociationHandler.handleRequest(SecurityContextAssociationHandler.java:78)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at org.keycloak.adapters.undertow.UndertowAuthenticatedActionsHandler.handleRequest(UndertowAuthenticatedActionsHandler.java:66)
	at io.undertow.servlet.handlers.security.SSLInformationAssociationHandler.handleRequest(SSLInformationAssociationHandler.java:131)
	at io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:57)
	at io.undertow.server.handlers.DisableCacheHandler.handleRequest(DisableCacheHandler.java:33)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.security.handlers.AuthenticationConstraintHandler.handleRequest(AuthenticationConstraintHandler.java:53)
	at io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
	at io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
	at io.undertow.servlet.handlers.security.ServletSecurityConstraintHandler.handleRequest(ServletSecurityConstraintHandler.java:59)
	at io.undertow.security.handlers.AuthenticationMechanismsHandler.handleRequest(AuthenticationMechanismsHandler.java:60)
	at io.undertow.servlet.handlers.security.CachedAuthenticatedSessionHandler.handleRequest(CachedAuthenticatedSessionHandler.java:77)
	at io.undertow.security.handlers.NotificationReceiverHandler.handleRequest(NotificationReceiverHandler.java:50)
	at io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at org.wildfly.extension.undertow.deployment.GlobalRequestControllerHandler.handleRequest(GlobalRequestControllerHandler.java:68)
	at org.keycloak.adapters.undertow.ServletPreAuthActionsHandler.handleRequest(ServletPreAuthActionsHandler.java:69)
	at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
	at io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:292)
	at io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:81)
	at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:138)
	at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:135)
	at io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
	at io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
	at org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1508)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1508)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1508)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1508)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1508)
	at io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:272)
	at io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:81)
	at io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:104)
	at io.undertow.server.Connectors.executeRootHandler(Connectors.java:326)
	at io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:812)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
Caused by: javax.ejb.EJBException: br.gov.caixa.arquitetura.javaee.core.comum.exception.SIDISBusinessException: Erro na comunicação com o SIICO. Acione o suporte tecnológico.
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.handleExceptionInOurTx(CMTTxInterceptor.java:188)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:277)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.required(CMTTxInterceptor.java:332)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:240)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:64)
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
	at org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:54)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ContextClassLoaderInterceptor.processInvocation(ContextClassLoaderInterceptor.java:60)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext.run(InterceptorContext.java:438)
	at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:609)
	at org.jboss.invocation.AccessCheckingInterceptor.processInvocation(AccessCheckingInterceptor.java:57)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee.component.ViewService$View.invoke(ViewService.java:198)
	at org.jboss.as.ee.component.ViewDescription$1.processInvocation(ViewDescription.java:185)
	at org.jboss.as.ee.component.ProxyInvocationHandler.invoke(ProxyInvocationHandler.java:81)
	at br.gov.caixa.bsb.sidis.core.admissibilidade.FatoIrregularAS$$$view38.consultarPaginadoJuizo(Unknown Source)
	at sun.reflect.GeneratedMethodAccessor110.invoke(Unknown Source)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.weld.util.reflection.Reflections.invokeAndUnwrap(Reflections.java:433)
	at org.jboss.weld.bean.proxy.EnterpriseBeanProxyMethodHandler.invoke(EnterpriseBeanProxyMethodHandler.java:127)
	at org.jboss.weld.bean.proxy.EnterpriseTargetBeanInstance.invoke(EnterpriseTargetBeanInstance.java:56)
	at org.jboss.weld.bean.proxy.InjectionPointPropagatingEnterpriseTargetBeanInstance.invoke(InjectionPointPropagatingEnterpriseTargetBeanInstance.java:67)
	at org.jboss.weld.bean.proxy.ProxyMethodHandler.invoke(ProxyMethodHandler.java:100)
	at br.gov.caixa.bsb.sidis.core.admissibilidade.FatoIrregularAS$Proxy$_$$_Weld$EnterpriseProxy$.consultarPaginadoJuizo(Unknown Source)
	at br.gov.caixa.bsb.sidis.api.admissibilidade.FatoIrregularController.consultarTodosJuizo(FatoIrregularController.java:247)
	at br.gov.caixa.bsb.sidis.api.admissibilidade.FatoIrregularController$Proxy$_$$_WeldSubclass.consultarTodosJuizo$$super(Unknown Source)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.weld.interceptor.proxy.TerminalAroundInvokeInvocationContext.proceedInternal(TerminalAroundInvokeInvocationContext.java:49)
	at org.jboss.weld.interceptor.proxy.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:77)
	at org.hibernate.validator.internal.cdi.interceptor.ValidationInterceptor.validateMethodInvocation(ValidationInterceptor.java:79)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.weld.interceptor.reader.SimpleInterceptorInvocation$SimpleMethodInvocation.invoke(SimpleInterceptorInvocation.java:73)
	at org.jboss.weld.interceptor.proxy.InterceptorMethodHandler.executeAroundInvoke(InterceptorMethodHandler.java:84)
	at org.jboss.weld.interceptor.proxy.InterceptorMethodHandler.executeInterception(InterceptorMethodHandler.java:72)
	at org.jboss.weld.interceptor.proxy.InterceptorMethodHandler.invoke(InterceptorMethodHandler.java:56)
	at org.jboss.weld.bean.proxy.CombinedInterceptorAndDecoratorStackMethodHandler.invoke(CombinedInterceptorAndDecoratorStackMethodHandler.java:79)
	at org.jboss.weld.bean.proxy.CombinedInterceptorAndDecoratorStackMethodHandler.invoke(CombinedInterceptorAndDecoratorStackMethodHandler.java:68)
	at br.gov.caixa.bsb.sidis.api.admissibilidade.FatoIrregularController$Proxy$_$$_WeldSubclass.consultarTodosJuizo(Unknown Source)
	at br.gov.caixa.bsb.sidis.api.admissibilidade.FatoIrregularController$Proxy$_$$_WeldClientProxy.consultarTodosJuizo(Unknown Source)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:140)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:295)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:249)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:236)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:406)
	... 57 more
Caused by: br.gov.caixa.arquitetura.javaee.core.comum.exception.SIDISBusinessException: Erro na comunicação com o SIICO. Acione o suporte tecnológico.
	at br.gov.caixa.bsb.sidis.core.integracao.unidade.UnidadeSiicoIntegracaoAS.consultarPorCodigo(UnidadeSiicoIntegracaoAS.java:141)
	at br.gov.caixa.bsb.sidis.core.admissibilidade.FatoIrregularAS.lambda$1(FatoIrregularAS.java:269)
	at java.util.ArrayList.forEach(ArrayList.java:1257)
	at br.gov.caixa.bsb.sidis.core.admissibilidade.FatoIrregularAS.consultarPaginadoJuizo(FatoIrregularAS.java:267)
	at sun.reflect.GeneratedMethodAccessor110.invoke(Unknown Source)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:90)
	at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:101)
	at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:43)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
	at org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51)
	at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
	at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInOurTx(CMTTxInterceptor.java:275)
	... 130 more


    Solicitamos verificar o motivo da indisponibilidade das API SIICO DES

https://api.des.caixa:8443/informacoes-corporativas-privadas/
https://api.des.caixa:8443/informacoes-corporativas-publicas/


<img width="1911" height="971" alt="image" src="https://github.com/user-attachments/assets/c763c50b-23b4-4603-8bde-2504fee11114" />


Address:  10.222.149.10

*** dfaddssd001.corp.caixa.gov.br não encontrou api.des.caixa:8443/informacoes-corporativas-publicas: Non-existent domain

C:\Users\p585600>nslookup api.des.caixa:8443/
Servidor:  dfaddssd001.corp.caixa.gov.br
Address:  10.222.149.10

*** dfaddssd001.corp.caixa.gov.br não encontrou api.des.caixa:8443/: Non-existent domain

C:\Users\p585600>nslookup api.des.caixa:8443
Servidor:  dfaddssd001.corp.caixa.gov.br
Address:  10.222.149.10

*** dfaddssd001.corp.caixa.gov.br não encontrou api.des.caixa:8443: Non-existent domain

C:\Users\p585600>nslookup api.des.caixa
Servidor:  dfaddssd001.corp.caixa.gov.br
Address:  10.222.149.10

Nome:    api.des.caixa
Address:  10.116.80.221


Last login: Mon Aug 31 10:35:13 2026 from 10.211.12.37
[p585600@cadsvitrlx100 ~]$ ssh 10.116.80.221
ssh: connect to host 10.116.80.221 port 22: Connection refused
[p585600@cadsvitrlx100 ~]$







