
-sh-4.2$ tail -100 /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log
        at org.wildfly.clustering.web.infinispan.session.InfinispanSessionMetaDataFactory.getValue(InfinispanSessionMetaDataFactory.java:103)
        at org.wildfly.clustering.web.infinispan.session.InfinispanSessionMetaDataFactory.findValue(InfinispanSessionMetaDataFactory.java:93)
        at org.wildfly.clustering.web.infinispan.session.InfinispanSessionMetaDataFactory.findValue(InfinispanSessionMetaDataFactory.java:54)
        at org.wildfly.clustering.web.cache.session.CompositeSessionFactory.findValue(CompositeSessionFactory.java:63)
        at org.wildfly.clustering.web.cache.session.CompositeSessionFactory.findValue(CompositeSessionFactory.java:40)
        at org.wildfly.clustering.web.infinispan.session.InfinispanSessionManager.findSession(InfinispanSessionManager.java:160)
        at org.wildfly.clustering.web.cache.session.ConcurrentSessionManager$2.apply(ConcurrentSessionManager.java:66)
        at org.wildfly.clustering.web.cache.session.ConcurrentSessionManager$2.apply(ConcurrentSessionManager.java:63)
        at org.wildfly.clustering.ee.cache.SimpleManager.apply(SimpleManager.java:52)
        at org.wildfly.clustering.web.cache.session.ConcurrentSessionManager.findSession(ConcurrentSessionManager.java:71)
        at org.wildfly.clustering.web.undertow.session.DistributableSessionManager.getSession(DistributableSessionManager.java:229)
        at io.undertow.servlet.spec.ServletContextImpl.getSession(ServletContextImpl.java:903)
        at io.undertow.servlet.spec.ServletContextImpl.getSession(ServletContextImpl.java:993)
        at io.undertow.servlet.spec.ServletContextImpl.updateSessionAccessTime(ServletContextImpl.java:997)
        at io.undertow.servlet.spec.HttpServletResponseImpl.responseDone(HttpServletResponseImpl.java:595)
        at io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:334)
        at io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:79)
        at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:134)
        at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:131)
        at io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
        at io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
        at org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:255)
        at io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:79)
        at io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:100)
        at io.undertow.server.Connectors.executeRootHandler(Connectors.java:387)
        at io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
        at java.lang.Thread.run(Thread.java:748)
Caused by: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=360, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
        at org.infinispan.util.concurrent.locks.impl.DefaultLockManager$KeyAwareExtendedLockPromise.get(DefaultLockManager.java:292)
        at org.infinispan.util.concurrent.locks.impl.DefaultLockManager$KeyAwareExtendedLockPromise.get(DefaultLockManager.java:222)
        at org.infinispan.util.concurrent.locks.impl.InfinispanLock$LockPlaceHolder.checkState(InfinispanLock.java:440)
        at org.infinispan.util.concurrent.locks.impl.InfinispanLock$LockPlaceHolder.lambda$toInvocationStage$3(InfinispanLock.java:416)
        at java.util.concurrent.CompletableFuture.uniApply(CompletableFuture.java:616)
        at java.util.concurrent.CompletableFuture$UniApply.tryFire(CompletableFuture.java:591)
        at java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:456)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
        at org.jboss.as.clustering.context.ContextReferenceExecutor.execute(ContextReferenceExecutor.java:49)
        at org.jboss.as.clustering.context.ContextualExecutor$1.run(ContextualExecutor.java:70)
        ... 1 more
        Suppressed: org.infinispan.commons.util.logging.TraceException
                at org.infinispan.interceptors.impl.SimpleAsyncInvocationStage.get(SimpleAsyncInvocationStage.java:39)
                at org.infinispan.interceptors.impl.AsyncInterceptorChainImpl.invoke(AsyncInterceptorChainImpl.java:246)
                at org.infinispan.cache.impl.InvocationHelper.doInvoke(InvocationHelper.java:298)
                at org.infinispan.cache.impl.InvocationHelper.invoke(InvocationHelper.java:102)
                at org.infinispan.cache.impl.CacheImpl.get(CacheImpl.java:541)
                at org.infinispan.cache.impl.DecoratedCache.get(DecoratedCache.java:522)
                at org.infinispan.cache.impl.AbstractDelegatingCache.get(AbstractDelegatingCache.java:439)
                at org.infinispan.cache.impl.EncoderCache.get(EncoderCache.java:696)
                at org.infinispan.cache.impl.AbstractDelegatingCache.get(AbstractDelegatingCache.java:439)
                at org.wildfly.clustering.web.infinispan.session.InfinispanSessionMetaDataFactory.getValue(InfinispanSessionMetaDataFactory.java:103)
                at org.wildfly.clustering.web.infinispan.session.InfinispanSessionMetaDataFactory.findValue(InfinispanSessionMetaDataFactory.java:93)
                at org.wildfly.clustering.web.infinispan.session.InfinispanSessionMetaDataFactory.findValue(InfinispanSessionMetaDataFactory.java:54)
                at org.wildfly.clustering.web.cache.session.CompositeSessionFactory.findValue(CompositeSessionFactory.java:63)
                at org.wildfly.clustering.web.cache.session.CompositeSessionFactory.findValue(CompositeSessionFactory.java:40)
                at org.wildfly.clustering.web.infinispan.session.InfinispanSessionManager.findSession(InfinispanSessionManager.java:160)
                at org.wildfly.clustering.web.cache.session.ConcurrentSessionManager$2.apply(ConcurrentSessionManager.java:66)
                at org.wildfly.clustering.web.cache.session.ConcurrentSessionManager$2.apply(ConcurrentSessionManager.java:63)
                at org.wildfly.clustering.ee.cache.SimpleManager.apply(SimpleManager.java:52)
                at org.wildfly.clustering.web.cache.session.ConcurrentSessionManager.findSession(ConcurrentSessionManager.java:71)
                at org.wildfly.clustering.web.undertow.session.DistributableSessionManager.getSession(DistributableSessionManager.java:229)
                at io.undertow.servlet.spec.ServletContextImpl.getSession(ServletContextImpl.java:903)
                at io.undertow.servlet.spec.ServletContextImpl.getSession(ServletContextImpl.java:993)
                at io.undertow.servlet.spec.ServletContextImpl.updateSessionAccessTime(ServletContextImpl.java:997)
                at io.undertow.servlet.spec.HttpServletResponseImpl.responseDone(HttpServletResponseImpl.java:595)
                at io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:334)
                at io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:79)
                at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:134)
                at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:131)
                at io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
                at io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
                at org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
                at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
                at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
                at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
                at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
                at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
                at io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:255)
                at io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:79)
                at io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:100)
                at io.undertow.server.Connectors.executeRootHandler(Connectors.java:387)
                at io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852)
                at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
                at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
                at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
                at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
                at org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
                ... 1 more

-sh-4.2$ grep -i "error\|exception\|timeout" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | tail -30
        at javax.faces.context.FacesContext.getExceptionHandler(FacesContext.java:280)
        at javax.faces.event.ExceptionQueuedEventContext.getListenersForEventClass(ExceptionQueuedEventContext.java:248)
2026-08-19 12:20:51,201 ERROR [org.infinispan.interceptors.impl.InvocationContextInterceptor] (non-blocking-thread--p11-t4) ISPN000136: Error executing command GetKeyValueCommand on Cache 'SICMU-ear.ear.SICMU-web.war', writing keys []: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=354, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
2026-08-19 12:20:51,202 ERROR [io.undertow.servlet.request] (default task-16) UT015005: Error invoking method requestDestroyed on listener class com.sun.faces.config.ConfigureListener: java.lang.UnsupportedOperationException
        at javax.faces.context.FacesContext.getExceptionHandler(FacesContext.java:280)
        at javax.faces.event.ExceptionQueuedEventContext.getListenersForEventClass(ExceptionQueuedEventContext.java:248)
2026-08-19 12:21:06,178 ERROR [org.infinispan.interceptors.impl.InvocationContextInterceptor] (non-blocking-thread--p11-t4) ISPN000136: Error executing command GetKeyValueCommand on Cache 'SICMU-ear.ear.SICMU-web.war', writing keys []: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=355, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
2026-08-19 12:21:06,179 ERROR [io.undertow.request] (default task-15) UT005071: Undertow request failed HttpServerExchange{ GET /sicmu/principal/erro.jsf}: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=355, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
Caused by: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=355, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
        Suppressed: org.infinispan.commons.util.logging.TraceException
2026-08-19 12:21:06,179 ERROR [org.infinispan.interceptors.impl.InvocationContextInterceptor] (non-blocking-thread--p11-t1) ISPN000136: Error executing command GetKeyValueCommand on Cache 'SICMU-ear.ear.SICMU-web.war', writing keys []: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=356, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
2026-08-19 12:21:06,180 ERROR [io.undertow.request] (default task-14) UT005071: Undertow request failed HttpServerExchange{ GET /sicmu/principal/erro.jsf}: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=356, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
Caused by: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=356, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
        Suppressed: org.infinispan.commons.util.logging.TraceException
2026-08-19 12:21:06,183 ERROR [org.infinispan.interceptors.impl.InvocationContextInterceptor] (non-blocking-thread--p11-t2) ISPN000136: Error executing command GetKeyValueCommand on Cache 'SICMU-ear.ear.SICMU-web.war', writing keys []: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=357, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
2026-08-19 12:21:06,183 ERROR [io.undertow.request] (default task-19) UT005071: Undertow request failed HttpServerExchange{ GET /sicmu/principal/erro.jsf}: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=357, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
Caused by: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=357, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
        Suppressed: org.infinispan.commons.util.logging.TraceException
2026-08-19 12:21:06,184 ERROR [org.infinispan.interceptors.impl.InvocationContextInterceptor] (non-blocking-thread--p11-t3) ISPN000136: Error executing command GetKeyValueCommand on Cache 'SICMU-ear.ear.SICMU-web.war', writing keys []: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=358, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
2026-08-19 12:21:06,184 ERROR [io.undertow.request] (default task-18) UT005071: Undertow request failed HttpServerExchange{ GET /sicmu/principal/erro.jsf}: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=358, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
Caused by: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=358, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
        Suppressed: org.infinispan.commons.util.logging.TraceException
2026-08-19 12:21:06,200 ERROR [org.infinispan.interceptors.impl.InvocationContextInterceptor] (non-blocking-thread--p11-t4) ISPN000136: Error executing command GetKeyValueCommand on Cache 'SICMU-ear.ear.SICMU-web.war', writing keys []: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=359, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
2026-08-19 12:21:06,201 ERROR [io.undertow.request] (default task-17) UT005071: Undertow request failed HttpServerExchange{ GET /sicmu/principal/erro.jsf}: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=359, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
Caused by: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=359, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
        Suppressed: org.infinispan.commons.util.logging.TraceException
2026-08-19 12:21:06,202 ERROR [org.infinispan.interceptors.impl.InvocationContextInterceptor] (non-blocking-thread--p11-t1) ISPN000136: Error executing command GetKeyValueCommand on Cache 'SICMU-ear.ear.SICMU-web.war', writing keys []: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=360, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
2026-08-19 12:21:06,202 ERROR [io.undertow.request] (default task-16) UT005071: Undertow request failed HttpServerExchange{ GET /sicmu/principal/erro.jsf}: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=360, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
Caused by: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=360, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
        Suppressed: org.infinispan.commons.util.logging.TraceException
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -n "ERROR\|SEVERE" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | tail -10
17868:2026-08-19 12:21:06,179 ERROR [org.infinispan.interceptors.impl.InvocationContextInterceptor] (non-blocking-thread--p11-t1) ISPN000136: Error executing command GetKeyValueCommand on Cache 'SICMU-ear.ear.SICMU-web.war', writing keys []: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=356, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
17882:2026-08-19 12:21:06,180 ERROR [io.undertow.request] (default task-14) UT005071: Undertow request failed HttpServerExchange{ GET /sicmu/principal/erro.jsf}: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=356, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
17991:2026-08-19 12:21:06,183 ERROR [org.infinispan.interceptors.impl.InvocationContextInterceptor] (non-blocking-thread--p11-t2) ISPN000136: Error executing command GetKeyValueCommand on Cache 'SICMU-ear.ear.SICMU-web.war', writing keys []: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=357, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
18005:2026-08-19 12:21:06,183 ERROR [io.undertow.request] (default task-19) UT005071: Undertow request failed HttpServerExchange{ GET /sicmu/principal/erro.jsf}: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=357, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
18114:2026-08-19 12:21:06,184 ERROR [org.infinispan.interceptors.impl.InvocationContextInterceptor] (non-blocking-thread--p11-t3) ISPN000136: Error executing command GetKeyValueCommand on Cache 'SICMU-ear.ear.SICMU-web.war', writing keys []: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=358, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
18128:2026-08-19 12:21:06,184 ERROR [io.undertow.request] (default task-18) UT005071: Undertow request failed HttpServerExchange{ GET /sicmu/principal/erro.jsf}: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=358, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
18237:2026-08-19 12:21:06,200 ERROR [org.infinispan.interceptors.impl.InvocationContextInterceptor] (non-blocking-thread--p11-t4) ISPN000136: Error executing command GetKeyValueCommand on Cache 'SICMU-ear.ear.SICMU-web.war', writing keys []: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=359, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
18251:2026-08-19 12:21:06,201 ERROR [io.undertow.request] (default task-17) UT005071: Undertow request failed HttpServerExchange{ GET /sicmu/principal/erro.jsf}: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=359, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
18360:2026-08-19 12:21:06,202 ERROR [org.infinispan.interceptors.impl.InvocationContextInterceptor] (non-blocking-thread--p11-t1) ISPN000136: Error executing command GetKeyValueCommand on Cache 'SICMU-ear.ear.SICMU-web.war', writing keys []: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=360, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
18374:2026-08-19 12:21:06,202 ERROR [io.undertow.request] (default task-16) UT005071: Undertow request failed HttpServerExchange{ GET /sicmu/principal/erro.jsf}: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(__-QGACMJD4-vDA1ME0GQw3F2nEpz4odMGRjlnqR) and requestor GlobalTransaction{id=360, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=239, addr=local, remote=false, xid=null, internalId=-1}
-sh-4.2$
