
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# tail -150 /logs/jboss/jboss-eap/standalone/siarg-interno/server.log
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
        at java.lang.Thread.run(Thread.java:750) [rt.jar:1.8.0_472]

09:59:09,597 ERROR [io.undertow.servlet.request] (default task-28) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/404.xhtml for original exception: null. Generating error page resulted in a 500.: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
        at org.omnifaces.config.WebXml.instance(WebXml.java:131) [omnifaces-3.14.jar:3.14]
        at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.findErrorPageLocation(FullAjaxExceptionHandler.java:483) [omnifaces-3.14.jar:3.14]
        at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handleAjaxException(FullAjaxExceptionHandler.java:411) [omnifaces-3.14.jar:3.14]
        at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handle(FullAjaxExceptionHandler.java:383) [omnifaces-3.14.jar:3.14]
        at com.sun.faces.lifecycle.Phase.doPhase(Phase.java:94) [jsf-impl-2.3.14.SP09-redhat-00001.jar:2.3.14.SP09-redhat-00001]
        at com.sun.faces.lifecycle.RestoreViewPhase.doPhase(RestoreViewPhase.java:110) [jsf-impl-2.3.14.SP09-redhat-00001.jar:2.3.14.SP09-redhat-00001]
        at com.sun.faces.lifecycle.LifecycleImpl.execute(LifecycleImpl.java:177) [jsf-impl-2.3.14.SP09-redhat-00001.jar:2.3.14.SP09-redhat-00001]
        at javax.faces.webapp.FacesServlet.executeLifecyle(FacesServlet.java:707) [jboss-jsf-api_2.3_spec-3.0.0.SP08-redhat-00001.jar:3.0.0.SP08-redhat-00001]
        at javax.faces.webapp.FacesServlet.service(FacesServlet.java:451) [jboss-jsf-api_2.3_spec-3.0.0.SP08-redhat-00001.jar:3.0.0.SP08-redhat-00001]
        at io.undertow.servlet.handlers.ServletHandler.handleRequest(ServletHandler.java:74) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:81) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:257) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler.dispatchToPath(ServletInitialHandler.java:182) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.spec.RequestDispatcherImpl.error(RequestDispatcherImpl.java:414) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.spec.RequestDispatcherImpl.error(RequestDispatcherImpl.java:364) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.spec.HttpServletResponseImpl.doErrorDispatch(HttpServletResponseImpl.java:177) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:282) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:79) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:134) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:131) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:255) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:79) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:100) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.server.Connectors.executeRootHandler(Connectors.java:393) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
        at java.lang.Thread.run(Thread.java:750) [rt.jar:1.8.0_472]

09:59:09,601 WARN  [org.jboss.weld.Servlet] (default task-28) WELD-000717: Unable to deactivate context org.jboss.weld.module.web.context.http.LazyHttpConversationContextImpl@53dbbb07 when destroying request HttpServletRequestImpl [ GET /siarg/WEB-INF/errorpages/404.xhtml ]
10:13:33,813 ERROR [io.undertow.request] (default task-28) UT005023: Exception handling request to /siarg/WEB-INF/errorpages/404.xhtml: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
        at org.omnifaces.config.WebXml.instance(WebXml.java:131) [omnifaces-3.14.jar:3.14]
        at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.findErrorPageLocation(FullAjaxExceptionHandler.java:483) [omnifaces-3.14.jar:3.14]
        at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handleAjaxException(FullAjaxExceptionHandler.java:411) [omnifaces-3.14.jar:3.14]
        at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handle(FullAjaxExceptionHandler.java:383) [omnifaces-3.14.jar:3.14]
        at com.sun.faces.lifecycle.Phase.doPhase(Phase.java:94) [jsf-impl-2.3.14.SP09-redhat-00001.jar:2.3.14.SP09-redhat-00001]
        at com.sun.faces.lifecycle.RestoreViewPhase.doPhase(RestoreViewPhase.java:110) [jsf-impl-2.3.14.SP09-redhat-00001.jar:2.3.14.SP09-redhat-00001]
        at com.sun.faces.lifecycle.LifecycleImpl.execute(LifecycleImpl.java:177) [jsf-impl-2.3.14.SP09-redhat-00001.jar:2.3.14.SP09-redhat-00001]
        at javax.faces.webapp.FacesServlet.executeLifecyle(FacesServlet.java:707) [jboss-jsf-api_2.3_spec-3.0.0.SP08-redhat-00001.jar:3.0.0.SP08-redhat-00001]
        at javax.faces.webapp.FacesServlet.service(FacesServlet.java:451) [jboss-jsf-api_2.3_spec-3.0.0.SP08-redhat-00001.jar:3.0.0.SP08-redhat-00001]
        at io.undertow.servlet.handlers.ServletHandler.handleRequest(ServletHandler.java:74) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:81) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:257) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler.dispatchToPath(ServletInitialHandler.java:182) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.spec.RequestDispatcherImpl.error(RequestDispatcherImpl.java:414) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.spec.RequestDispatcherImpl.error(RequestDispatcherImpl.java:364) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.spec.HttpServletResponseImpl.doErrorDispatch(HttpServletResponseImpl.java:177) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:282) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:79) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:134) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:131) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:255) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:79) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:100) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.server.Connectors.executeRootHandler(Connectors.java:393) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
        at java.lang.Thread.run(Thread.java:750) [rt.jar:1.8.0_472]

10:13:33,815 ERROR [io.undertow.servlet.request] (default task-28) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/404.xhtml for original exception: null. Generating error page resulted in a 500.: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
        at org.omnifaces.config.WebXml.instance(WebXml.java:131) [omnifaces-3.14.jar:3.14]
        at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.findErrorPageLocation(FullAjaxExceptionHandler.java:483) [omnifaces-3.14.jar:3.14]
        at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handleAjaxException(FullAjaxExceptionHandler.java:411) [omnifaces-3.14.jar:3.14]
        at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handle(FullAjaxExceptionHandler.java:383) [omnifaces-3.14.jar:3.14]
        at com.sun.faces.lifecycle.Phase.doPhase(Phase.java:94) [jsf-impl-2.3.14.SP09-redhat-00001.jar:2.3.14.SP09-redhat-00001]
        at com.sun.faces.lifecycle.RestoreViewPhase.doPhase(RestoreViewPhase.java:110) [jsf-impl-2.3.14.SP09-redhat-00001.jar:2.3.14.SP09-redhat-00001]
        at com.sun.faces.lifecycle.LifecycleImpl.execute(LifecycleImpl.java:177) [jsf-impl-2.3.14.SP09-redhat-00001.jar:2.3.14.SP09-redhat-00001]
        at javax.faces.webapp.FacesServlet.executeLifecyle(FacesServlet.java:707) [jboss-jsf-api_2.3_spec-3.0.0.SP08-redhat-00001.jar:3.0.0.SP08-redhat-00001]
        at javax.faces.webapp.FacesServlet.service(FacesServlet.java:451) [jboss-jsf-api_2.3_spec-3.0.0.SP08-redhat-00001.jar:3.0.0.SP08-redhat-00001]
        at io.undertow.servlet.handlers.ServletHandler.handleRequest(ServletHandler.java:74) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:81) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:257) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler.dispatchToPath(ServletInitialHandler.java:182) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.spec.RequestDispatcherImpl.error(RequestDispatcherImpl.java:414) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.spec.RequestDispatcherImpl.error(RequestDispatcherImpl.java:364) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.spec.HttpServletResponseImpl.doErrorDispatch(HttpServletResponseImpl.java:177) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:282) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:79) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:134) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:131) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:255) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:79) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:100) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.server.Connectors.executeRootHandler(Connectors.java:393) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
        at java.lang.Thread.run(Thread.java:750) [rt.jar:1.8.0_472]

10:13:33,817 WARN  [org.jboss.weld.Servlet] (default task-28) WELD-000717: Unable to deactivate context org.jboss.weld.module.web.context.http.LazyHttpConversationContextImpl@53dbbb07 when destroying request HttpServletRequestImpl [ GET /siarg/WEB-INF/errorpages/404.xhtml ]
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# curl -v http://10.116.201.44:443/siarg/login
*   Trying 10.116.201.44:443...
* Connected to 10.116.201.44 (10.116.201.44) port 443 (#0)
> GET /siarg/login HTTP/1.1
> Host: 10.116.201.44:443
> User-Agent: curl/7.76.1
> Accept: */*
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 500 Internal Server Error
< Date: Tue, 08 Sep 2026 13:18:02 GMT
< Server: Apache/2.4.57 (Red Hat)
< Strict-Transport-Security: max-age=63072000; includeSubDomains; preload
< X-Frame-Options: DENY
< X-Content-Type-Options: nosniff
< Content-Length: 86
< Content-Type: text/html; charset=UTF-8
< Connection: close
<
* Closing connection 0
<html><head><title>Error</title></head><body>500 - Internal Server Error</body></html>[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# tail -50 /logs/jboss/jboss-eap/standalone/siarg-interno/server.log

10:18:02,982 ERROR [io.undertow.servlet.request] (default task-28) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/404.xhtml for original exception: null. Generating error page resulted in a 500.: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
        at org.omnifaces.config.WebXml.instance(WebXml.java:131) [omnifaces-3.14.jar:3.14]
        at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.findErrorPageLocation(FullAjaxExceptionHandler.java:483) [omnifaces-3.14.jar:3.14]
        at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handleAjaxException(FullAjaxExceptionHandler.java:411) [omnifaces-3.14.jar:3.14]
        at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handle(FullAjaxExceptionHandler.java:383) [omnifaces-3.14.jar:3.14]
        at com.sun.faces.lifecycle.Phase.doPhase(Phase.java:94) [jsf-impl-2.3.14.SP09-redhat-00001.jar:2.3.14.SP09-redhat-00001]
        at com.sun.faces.lifecycle.RestoreViewPhase.doPhase(RestoreViewPhase.java:110) [jsf-impl-2.3.14.SP09-redhat-00001.jar:2.3.14.SP09-redhat-00001]
        at com.sun.faces.lifecycle.LifecycleImpl.execute(LifecycleImpl.java:177) [jsf-impl-2.3.14.SP09-redhat-00001.jar:2.3.14.SP09-redhat-00001]
        at javax.faces.webapp.FacesServlet.executeLifecyle(FacesServlet.java:707) [jboss-jsf-api_2.3_spec-3.0.0.SP08-redhat-00001.jar:3.0.0.SP08-redhat-00001]
        at javax.faces.webapp.FacesServlet.service(FacesServlet.java:451) [jboss-jsf-api_2.3_spec-3.0.0.SP08-redhat-00001.jar:3.0.0.SP08-redhat-00001]
        at io.undertow.servlet.handlers.ServletHandler.handleRequest(ServletHandler.java:74) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:81) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:257) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler.dispatchToPath(ServletInitialHandler.java:182) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.spec.RequestDispatcherImpl.error(RequestDispatcherImpl.java:414) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.spec.RequestDispatcherImpl.error(RequestDispatcherImpl.java:364) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.spec.HttpServletResponseImpl.doErrorDispatch(HttpServletResponseImpl.java:177) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:282) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:79) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:134) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:131) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:255) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:79) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:100) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.server.Connectors.executeRootHandler(Connectors.java:393) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
        at java.lang.Thread.run(Thread.java:750) [rt.jar:1.8.0_472]

10:18:02,984 WARN  [org.jboss.weld.Servlet] (default task-28) WELD-000717: Unable to deactivate context org.jboss.weld.module.web.context.http.LazyHttpConversationContextImpl@53dbbb07 when destroying request HttpServletRequestImpl [ GET /siarg/WEB-INF/errorpages/404.xhtml ]
[root@caddeapllx2577 p585600]#
