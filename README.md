st login: Fri Aug 14 14:27:09 2026 from 10.211.14.54
[p585600@cadsvitrlx100 ~]$ ssh 10.116.200.228
p585600@10.116.200.228's password:
Last login: Wed Aug 12 16:49:29 2026 from 10.122.150.31
-sh-4.2$
-sh-4.2$
-sh-4.2$ cd /opt/jboss-eap/modules/system/layers/base/br/gov/caixa/sisgr/main/
-sh-4.2$
-sh-4.2$
-sh-4.2$ cat module.xml
<?xml version='1.0' encoding='UTF-8'?>

<module xmlns="urn:jboss:module:1.1" name="br.gov.caixa.sisgr">

    <properties>
        <property name="jboss.api" value="private"/>
    </properties>

    <resources>
        <resource-root path="sisgr-1.2.jar"/>
    </resources>

    <dependencies>
        <module name="javax.faces.api"/>
        <module name="org.apache.log4j"/>
        <module name="javax.api"/>
    </dependencies>
</module>-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ tail -100 /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at org.jboss.weld.injection.producer.DefaultLifecycleCallbackInvoker.invokeMethods(DefaultLifecycleCallbackInvoker.java:83)
        ... 127 more
Caused by: javax.ejb.EJBException: WFLYEJB0442: Erro inesperado
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
        at br.gov.caixa.sicmu.operacaohabitacional.bean.IdentificarOperacaoHabitacionalBean.init(IdentificarOperacaoHabitacionalBean.java:67)
        ... 132 more
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
        at br.gov.caixa.sgr.publico.portal.comunicacao.factory.autorizacao.AutorizacaoFactory.getConexao(AutorizacaoFactory.java:41)
        at br.gov.caixa.sgr.publico.portal.comunicacao.factory.autorizacao.AutorizacaoFactory.getConexao(AutorizacaoFactory.java:1)
        at br.gov.caixa.sgr.publico.portal.comunicacao.formatacao.ConfigurarParametros.paramtrosAcesso(ConfigurarParametros.java:35)
        at br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle.executar(Controle.java:122)
        at br.gov.caixa.sgr.publico.portal.comunicacao.programas.AbstractParamPadrao.iniciarParametros(AbstractParamPadrao.java:130)
        at br.gov.caixa.sgr.publico.portal.comunicacao.programas.SgrSbuso.consultar(SgrSbuso.java:128)
        at br.gov.caixa.sgr.publico.facade.impl.SISGRImpl.buscaAutorizacao(SISGRImpl.java:105)
        at br.gov.caixa.sicmu.seguranca.service.ValidadorAcessoServiceBean.validaAcesso(ValidadorAcessoServiceBean.java:53)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
        at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
        at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:102)
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
        at org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:54)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInNoTx(CMTTxInterceptor.java:232)
        ... 165 more
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @2002fc1d (finder: local module finder @69453e37 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
        at org.jboss.modules.ModuleClassLoader.findClass(ModuleClassLoader.java:255)
        at org.jboss.modules.ConcurrentClassLoader.performLoadClassUnchecked(ConcurrentClassLoader.java:410)
        at org.jboss.modules.ConcurrentClassLoader.performLoadClass(ConcurrentClassLoader.java:398)
        at org.jboss.modules.ConcurrentClassLoader.loadClass(ConcurrentClassLoader.java:116)
        ... 201 more

2026-08-14 15:22:59,322 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-1) usuario filtro: F664854
2026-08-14 15:22:59,349 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-1) usuario filtro: F664854
2026-08-14 15:22:59,356 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-2) usuario filtro: F664854
2026-08-14 15:22:59,364 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-3) usuario filtro: F664854
2026-08-14 15:22:59,395 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-3) usuario filtro: F664854
2026-08-14 15:22:59,413 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-3) usuario filtro: F664854
2026-08-14 15:22:59,533 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-3) usuario filtro: F664854
2026-08-14 15:22:59,563 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-3) usuario filtro: F664854
2026-08-14 15:22:59,610 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-2) usuario filtro: F664854
2026-08-14 15:22:59,611 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-3) usuario filtro: F664854
2026-08-14 15:22:59,657 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-3) usuario filtro: F664854
2026-08-14 15:22:59,805 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-3) usuario filtro: F664854
2026-08-14 15:22:59,808 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-2) usuario filtro: F664854
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -A 5 "NoClassDefFoundError" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | tail -30
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
        at br.gov.caixa.sgr.publico.portal.comunicacao.factory.autorizacao.AutorizacaoFactory.getConexao(AutorizacaoFactory.java:41)
        at br.gov.caixa.sgr.publico.portal.comunicacao.factory.autorizacao.AutorizacaoFactory.getConexao(AutorizacaoFactory.java:1)
        at br.gov.caixa.sgr.publico.portal.comunicacao.formatacao.ConfigurarParametros.paramtrosAcesso(ConfigurarParametros.java:35)
        at br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle.executar(Controle.java:122)
        at br.gov.caixa.sgr.publico.portal.comunicacao.programas.AbstractParamPadrao.iniciarParametros(AbstractParamPadrao.java:130)
--
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
        at br.gov.caixa.sgr.publico.portal.comunicacao.factory.autorizacao.AutorizacaoFactory.getConexao(AutorizacaoFactory.java:41)
        at br.gov.caixa.sgr.publico.portal.comunicacao.factory.autorizacao.AutorizacaoFactory.getConexao(AutorizacaoFactory.java:1)
        at br.gov.caixa.sgr.publico.portal.comunicacao.formatacao.ConfigurarParametros.paramtrosAcesso(ConfigurarParametros.java:35)
        at br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle.executar(Controle.java:122)
        at br.gov.caixa.sgr.publico.portal.comunicacao.programas.AbstractParamPadrao.iniciarParametros(AbstractParamPadrao.java:130)
--
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
        at br.gov.caixa.sgr.publico.portal.comunicacao.factory.autorizacao.AutorizacaoFactory.getConexao(AutorizacaoFactory.java:41)
        at br.gov.caixa.sgr.publico.portal.comunicacao.factory.autorizacao.AutorizacaoFactory.getConexao(AutorizacaoFactory.java:1)
        at br.gov.caixa.sgr.publico.portal.comunicacao.formatacao.ConfigurarParametros.paramtrosAcesso(ConfigurarParametros.java:35)
        at br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle.executar(Controle.java:122)
        at br.gov.caixa.sgr.publico.portal.comunicacao.programas.AbstractParamPadrao.iniciarParametros(AbstractParamPadrao.java:130)
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ tail -f /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log
2026-08-14 15:22:59,364 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-3) usuario filtro: F664854
2026-08-14 15:22:59,395 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-3) usuario filtro: F664854
2026-08-14 15:22:59,413 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-3) usuario filtro: F664854
2026-08-14 15:22:59,533 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-3) usuario filtro: F664854
2026-08-14 15:22:59,563 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-3) usuario filtro: F664854
2026-08-14 15:22:59,610 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-2) usuario filtro: F664854
2026-08-14 15:22:59,611 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-3) usuario filtro: F664854
2026-08-14 15:22:59,657 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-3) usuario filtro: F664854
2026-08-14 15:22:59,805 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-3) usuario filtro: F664854
2026-08-14 15:22:59,808 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-2) usuario filtro: F664854

