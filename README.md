
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# tail -30 /logs/jboss/jboss-eap/standalone/siarg-interno/server.log
        at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:257)
        at io.undertow.servlet.handlers.ServletInitialHandler.dispatchToPath(ServletInitialHandler.java:182)
        at io.undertow.servlet.spec.RequestDispatcherImpl.error(RequestDispatcherImpl.java:414)
        at io.undertow.servlet.spec.RequestDispatcherImpl.error(RequestDispatcherImpl.java:372)
        at io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:314)
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
        at io.undertow.server.Connectors.executeRootHandler(Connectors.java:393) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282) [xnio-api-3.8.16.Final-redhat-00001.jar:3.8.16.Final-redhat-00001]
        at java.lang.Thread.run(Thread.java:750) [rt.jar:1.8.0_472]

[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# find / -iname "*.war" 2>/dev/null | grep -v "\.tmp\|backup"
/opt/jboss-eap/standalone/deployments/siarg.war
/opt/jboss-eap/standalone/tmp/siarg.war
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# cat /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml | grep -A3 -i "deployment-scanner"
        <extension module="org.jboss.as.deployment-scanner"/>
        <extension module="org.jboss.as.ee"/>
        <extension module="org.jboss.as.ejb3"/>
        <extension module="org.jboss.as.jaxrs"/>
--
        <subsystem xmlns="urn:jboss:domain:deployment-scanner:2.0">
            <deployment-scanner path="deployments" relative-to="jboss.server.base.dir" scan-interval="5000" runtime-failure-causes-rollback="${jboss.deployment.scanner.rollback.on.failure:false}"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:discovery:1.0"/>
        <subsystem xmlns="urn:jboss:domain:distributable-web:2.0" default-session-management="default" default-single-sign-on-management="default">
[root@caddeapllx2577 p585600]#
