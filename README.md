[p585600@caddeapllx2577 ~]$ md5sum /opt/ads-agent/_work/r14466/a/binario/siarg-2.0.0.5.war md5sum /opt/jboss-eap/standalone/deployments/siarg.war
md5sum: /opt/ads-agent/_work/r14466/a/binario/siarg-2.0.0.5.war: Arquivo ou diretório inexistente
md5sum: md5sum: Arquivo ou diretório inexistente
6a1f80f57e7735828d99261d0422dd1d  /opt/jboss-eap/standalone/deployments/siarg.war
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$ sudo -u jboss cp /opt/ads-agent/_work/r14466/a/binario/siarg-2.0.0.5.war /opt/jboss-eap/standalone/deployments/siarg.war

Presumimos que você recebeu as instruções de sempre do administrador
de sistema local. Basicamente, resume-se a estas três coisas:

    #1) Respeite a privacidade dos outros.
    #2) Pense antes de digitar.
    #3) Com grandes poderes vêm grandes responsabilidades.

[sudo] senha para p585600:
Sinto muito, tente novamente.
[sudo] senha para p585600:
Sinto muito, usuário p585600 não tem permissão para executar "/bin/cp /opt/ads-agent/_work/r14466/a/binario/siarg-2.0.0.5.war /opt/jboss-eap/standalone/deployments/siarg.war" como jboss em caddeapllx2577.agil.nprd.caixa.gov.br.
[p585600@caddeapllx2577 ~]$ tail -f /logs/jboss/jboss-eap/standalone/siarg-interno/server.log
        at io.undertow.server.Connectors.executeRootHandler(Connectors.java:393) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852) [undertow-core-2.2.33.SP1-redhat-00001.jar:2.2.33.SP1-redhat-00001]
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
        at java.lang.Thread.run(Thread.java:750) [rt.jar:1.8.0_472]

20:30:18,111 WARN  [org.jboss.weld.Servlet] (default task-11) WELD-000717: Unable to deactivate context org.jboss.weld.module.web.context.http.LazyHttpConversationContextImpl@6a687a7b when destroying request HttpServletRequestImpl [ GET /siarg/WEB-INF/errorpages/404.xhtml ]

