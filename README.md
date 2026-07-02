[p585600@caddeapllx2577 ~]$ grep -i "siarg" /logs/jboss/jboss-eap/standalone/siarg-interno/server.log | tail -50
14:09:05,539 ERROR [io.undertow.request] (default task-11) UT005023: Exception handling request to /siarg/login: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
14:09:05,576 ERROR [io.undertow.servlet.request] (default task-11) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/500.xhtml for original exception: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton. Generating error page resulted in a 404.
14:09:05,586 ERROR [io.undertow.request] (default task-11) UT005071: Undertow request failed HttpServerExchange{ GET /siarg/WEB-INF/errorpages/500.xhtml}: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
14:09:10,334 ERROR [io.undertow.request] (default task-11) UT005023: Exception handling request to /siarg/WEB-INF/errorpages/404.xhtml: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
14:09:10,376 ERROR [io.undertow.servlet.request] (default task-11) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/404.xhtml for original exception: null. Generating error page resulted in a 500.: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
14:09:10,377 WARN  [org.jboss.weld.Servlet] (default task-11) WELD-000717: Unable to deactivate context org.jboss.weld.module.web.context.http.LazyHttpConversationContextImpl@6a687a7b when destroying request HttpServletRequestImpl [ GET /siarg/WEB-INF/errorpages/404.xhtml ]
14:09:12,621 ERROR [io.undertow.request] (default task-11) UT005023: Exception handling request to /siarg/WEB-INF/errorpages/404.xhtml: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
14:09:12,622 ERROR [io.undertow.servlet.request] (default task-11) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/404.xhtml for original exception: null. Generating error page resulted in a 500.: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
14:09:12,623 WARN  [org.jboss.weld.Servlet] (default task-11) WELD-000717: Unable to deactivate context org.jboss.weld.module.web.context.http.LazyHttpConversationContextImpl@6a687a7b when destroying request HttpServletRequestImpl [ GET /siarg/WEB-INF/errorpages/404.xhtml ]
14:11:19,374 ERROR [io.undertow.request] (default task-11) UT005023: Exception handling request to /siarg/WEB-INF/errorpages/404.xhtml: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
14:11:19,375 ERROR [io.undertow.servlet.request] (default task-11) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/404.xhtml for original exception: null. Generating error page resulted in a 500.: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
14:11:19,377 WARN  [org.jboss.weld.Servlet] (default task-11) WELD-000717: Unable to deactivate context org.jboss.weld.module.web.context.http.LazyHttpConversationContextImpl@6a687a7b when destroying request HttpServletRequestImpl [ GET /siarg/WEB-INF/errorpages/404.xhtml ]
14:26:55,711 ERROR [io.undertow.request] (default task-11) UT005023: Exception handling request to /siarg/WEB-INF/errorpages/404.xhtml: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
14:26:55,712 ERROR [io.undertow.servlet.request] (default task-11) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/404.xhtml for original exception: null. Generating error page resulted in a 500.: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
14:26:55,714 WARN  [org.jboss.weld.Servlet] (default task-11) WELD-000717: Unable to deactivate context org.jboss.weld.module.web.context.http.LazyHttpConversationContextImpl@6a687a7b when destroying request HttpServletRequestImpl [ GET /siarg/WEB-INF/errorpages/404.xhtml ]
14:35:05,807 ERROR [io.undertow.request] (default task-11) UT005023: Exception handling request to /siarg/WEB-INF/errorpages/404.xhtml: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
14:35:05,808 ERROR [io.undertow.servlet.request] (default task-11) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/404.xhtml for original exception: null. Generating error page resulted in a 500.: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
14:35:05,809 WARN  [org.jboss.weld.Servlet] (default task-11) WELD-000717: Unable to deactivate context org.jboss.weld.module.web.context.http.LazyHttpConversationContextImpl@6a687a7b when destroying request HttpServletRequestImpl [ GET /siarg/WEB-INF/errorpages/404.xhtml ]
15:26:26,020 ERROR [io.undertow.request] (default task-11) UT005023: Exception handling request to /siarg/WEB-INF/errorpages/404.xhtml: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
15:26:26,021 ERROR [io.undertow.servlet.request] (default task-11) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/404.xhtml for original exception: null. Generating error page resulted in a 500.: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
15:26:26,022 WARN  [org.jboss.weld.Servlet] (default task-11) WELD-000717: Unable to deactivate context org.jboss.weld.module.web.context.http.LazyHttpConversationContextImpl@6a687a7b when destroying request HttpServletRequestImpl [ GET /siarg/WEB-INF/errorpages/404.xhtml ]
20:01:20,166 ERROR [io.undertow.request] (default task-11) UT005023: Exception handling request to /siarg/WEB-INF/errorpages/404.xhtml: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
20:01:20,167 ERROR [io.undertow.servlet.request] (default task-11) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/404.xhtml for original exception: null. Generating error page resulted in a 500.: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
20:01:20,168 WARN  [org.jboss.weld.Servlet] (default task-11) WELD-000717: Unable to deactivate context org.jboss.weld.module.web.context.http.LazyHttpConversationContextImpl@6a687a7b when destroying request HttpServletRequestImpl [ GET /siarg/WEB-INF/errorpages/404.xhtml ]
20:25:14,465 ERROR [io.undertow.request] (default task-11) UT005023: Exception handling request to /siarg/index: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
20:25:14,475 ERROR [io.undertow.servlet.request] (default task-11) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/500.xhtml for original exception: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton. Generating error page resulted in a 404.
20:25:14,476 WARN  [org.jboss.weld.Servlet] (default task-11) WELD-000717: Unable to deactivate context org.jboss.weld.module.web.context.http.LazyHttpConversationContextImpl@6a687a7b when destroying request HttpServletRequestImpl [ GET /siarg/WEB-INF/errorpages/500.xhtml ]
20:25:14,476 ERROR [io.undertow.request] (default task-11) UT005071: Undertow request failed HttpServerExchange{ GET /siarg/WEB-INF/errorpages/500.xhtml}: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
20:25:21,180 ERROR [io.undertow.request] (default task-11) UT005023: Exception handling request to /siarg/WEB-INF/errorpages/404.xhtml: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
20:25:21,181 ERROR [io.undertow.servlet.request] (default task-11) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/404.xhtml for original exception: null. Generating error page resulted in a 500.: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
20:25:21,182 WARN  [org.jboss.weld.Servlet] (default task-11) WELD-000717: Unable to deactivate context org.jboss.weld.module.web.context.http.LazyHttpConversationContextImpl@6a687a7b when destroying request HttpServletRequestImpl [ GET /siarg/WEB-INF/errorpages/404.xhtml ]
20:30:18,108 ERROR [io.undertow.request] (default task-11) UT005023: Exception handling request to /siarg/WEB-INF/errorpages/404.xhtml: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
20:30:18,110 ERROR [io.undertow.servlet.request] (default task-11) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/404.xhtml for original exception: null. Generating error page resulted in a 500.: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
20:30:18,111 WARN  [org.jboss.weld.Servlet] (default task-11) WELD-000717: Unable to deactivate context org.jboss.weld.module.web.context.http.LazyHttpConversationContextImpl@6a687a7b when destroying request HttpServletRequestImpl [ GET /siarg/WEB-INF/errorpages/404.xhtml ]
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$ tail -200 /logs/jboss/jboss-eap/standalone/siarg-interno/server.log
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282) [xnio-api-3.8.16.Final-redhat-00001.jar:3.8.16.Final-redhat-00001]
        at java.lang.Thread.run(Thread.java:750) [rt.jar:1.8.0_472]

20:25:21,180 ERROR [io.undertow.request] (default task-11) UT005023: Exception handling request to /siarg/WEB-INF/errorpages/404.xhtml: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
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

20:25:21,181 ERROR [io.undertow.servlet.request] (default task-11) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/404.xhtml for original exception: null. Generating error page resulted in a 500.: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
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

20:25:21,182 WARN  [org.jboss.weld.Servlet] (default task-11) WELD-000717: Unable to deactivate context org.jboss.weld.module.web.context.http.LazyHttpConversationContextImpl@6a687a7b when destroying request HttpServletRequestImpl [ GET /siarg/WEB-INF/errorpages/404.xhtml ]
20:30:18,108 ERROR [io.undertow.request] (default task-11) UT005023: Exception handling request to /siarg/WEB-INF/errorpages/404.xhtml: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
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

20:30:18,110 ERROR [io.undertow.servlet.request] (default task-11) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/404.xhtml for original exception: null. Generating error page resulted in a 500.: java.lang.NoClassDefFoundError: Could not initialize class org.omnifaces.config.WebXmlSingleton
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

20:30:18,111 WARN  [org.jboss.weld.Servlet] (default task-11) WELD-000717: Unable to deactivate context org.jboss.weld.module.web.context.http.LazyHttpConversationContextImpl@6a687a7b when destroying request HttpServletRequestImpl [ GET /siarg/WEB-INF/errorpages/404.xhtml ]
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$ grep -n -i "ERROR|Exception|Caused by" /logs/jboss/jboss-eap/standalone/siarg-interno/server.log | tail -40
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$ netstat -tlnp | grep java ss -tlnp | grep java
grep: opção inválida -- “t”
Uso: grep [OPÇÃO]... PADRÕES [ARQUIVO]...
Experimente "grep --help" para mais informações.
(Nem todos os processos puderam ser identificados, informações sobre processos
 de outrem não serão mostrados, você deve ser root para vê-los todos.)
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$ find / -iname "httpd" -path "log" 2>/dev/null
[p585600@caddeapllx2577 ~]$ tail -100 <caminho_encontrado>/error_log
-sh: caminho_encontrado: Arquivo ou diretório inexistente
[p585600@caddeapllx2577 ~]$
