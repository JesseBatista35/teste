[p585600@caddeapllx2577 ~]$ ls -la /opt/jboss-eap/standalone/deployments/
total 48924
drwxrwxr-x 2 jboss jboss      173 jul  2 21:04 .
drwxrwxr-x 8 jboss jboss       91 set 30  2024 ..
-rw-r--r-- 1 jboss jboss  1209660 jul  2 21:03 mssql-jdbc.jar
-rw-r--r-- 1 jboss jboss       14 jul  2 21:03 mssql-jdbc.jar.deployed
-rw-r--r-- 1 jboss jboss  1006732 jul  2 21:03 postgresql.jar
-rw-r--r-- 1 jboss jboss       14 jul  2 21:03 postgresql.jar.deployed
-rwxrwxr-x 1 jboss jboss     8888 jun 23  2021 README.txt
-rwxrw-rw- 1 jboss jboss 47852811 jul  2 21:04 siarg.war
-rw-r--r-- 1 jboss jboss        9 jul  2 21:04 siarg.war.deployed
[p585600@caddeapllx2577 ~]$ md5sum /opt/jboss-eap/standalone/deployments/siarg.war
6a1f80f57e7735828d99261d0422dd1d  /opt/jboss-eap/standalone/deployments/siarg.war
[p585600@caddeapllx2577 ~]$ tail -100 /logs/jboss/jboss-eap/standalone/siarg-interno/server.log
21:36:02,208 WARN  [org.jboss.weld.Servlet] (default task-1) WELD-000717: Unable to deactivate context org.jboss.weld.module.web.context.http.LazyHttpConversationContextImpl@2f692b53 when destroying request HttpServletRequestImpl [ GET /siarg/WEB-INF/errorpages/404.xhtml ]
21:36:20,179 ERROR [io.undertow.request] (default task-1) UT005023: Exception handling request to /siarg/WEB-INF/errorpages/404.xhtml: java.lang.RuntimeException: java.lang.IllegalArgumentException: Either HTTP 500 or java.lang.Throwable error page is required in web.xml or web-fragment.xml. Neither was found.
        at io.undertow.servlet.spec.RequestDispatcherImpl.error(RequestDispatcherImpl.java:418) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
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
Caused by: java.lang.IllegalArgumentException: Either HTTP 500 or java.lang.Throwable error page is required in web.xml or web-fragment.xml. Neither was found.
        at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handleAjaxException(FullAjaxExceptionHandler.java:414) [omnifaces-3.14.jar:3.14]
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
        ... 25 more

21:36:20,183 ERROR [io.undertow.servlet.request] (default task-1) UT015012: Failed to generate error page /siarg/WEB-INF/errorpages/404.xhtml for original exception: null. Generating error page resulted in a 500.: java.lang.RuntimeException: java.lang.IllegalArgumentException: Either HTTP 500 or java.lang.Throwable error page is required in web.xml or web-fragment.xml. Neither was found.
        at io.undertow.servlet.spec.RequestDispatcherImpl.error(RequestDispatcherImpl.java:418) [undertow-servlet-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
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
Caused by: java.lang.IllegalArgumentException: Either HTTP 500 or java.lang.Throwable error page is required in web.xml or web-fragment.xml. Neither was found.
        at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handleAjaxException(FullAjaxExceptionHandler.java:414) [omnifaces-3.14.jar:3.14]
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
        ... 25 more

21:36:20,185 WARN  [org.jboss.weld.Servlet] (default task-1) WELD-000717: Unable to deactivate context org.jboss.weld.module.web.context.http.LazyHttpConversationContextImpl@2f692b53 when destroying request HttpServletRequestImpl [ GET /siarg/WEB-INF/errorpages/404.xhtml ]
[p585600@caddeapllx2577 ~]$

