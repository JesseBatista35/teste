
-sh-4.1$
-sh-4.1$ ps -ef | grep sicem
jboss     3358  3286  1 Aug13 ?        00:12:58 /usr/lib/jvm/jdk-1.8.0_451-oracle-x64/jre/bin/java -D[Server:sicem_node1_lx0005] -XX:PermSize=1024m -XX:MaxPermSize=1024m -Xms4096m -Xmx4096m -Duser.language=pt -Duser.country=BR -Djboss.modules.system.pkgs -Djboss.domain.master.address=10.116.88.20 -Dsicem.configuracao.ldap.url=ldap://10.116.92.130:489 -Djboss.bind.address.unsecure=10.116.88.24 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djava.net.preferIPv4Stack=true -Dsicem.configuracao.ldap.security.domain=sicem_security_domain -Djboss.bind.address=10.116.88.24 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.policy-permissions=true -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -Dsicem.configuracao.ldap.grupo.sistema=SICEM -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Dhttps.protocols=TLSv1.2,TLSv1.3 -Djava.awt.headless=true -Djboss.bind.address.management=10.116.88.24 -Djboss.server.log.dir=/logs/jboss-eap/hc/servers/sicem_node1_lx0005 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/sicem_node1_lx0005 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/sicem_node1_lx0005 -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/data/servers/sicem_node1_lx0005/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.server
p585600  32226 26923  0 15:12 pts/1    00:00:00 grep sicem
-sh-4.1$ sudo su
[sudo] password for p585600:
-sh-4.1$ sudo kill
[sudo] password for p585600:
-sh-4.1$ sudo kill -9 3358
[sudo] password for p585600:
-sh-4.1$
-sh-4.1$
-sh-4.1$ ps -ef | grep sicem
p585600  32241 26923  0 15:13 pts/1    00:00:00 grep sicem
-sh-4.1$
-sh-4.1$
-sh-4.1$ ps -ef | grep sicem
jboss    32290  3286 99 15:17 ?        00:00:19 /usr/lib/jvm/jdk-1.8.0_451-oracle-x64/jre/bin/java -D[Server:sicem_node1_lx0005] -XX:PermSize=1024m -XX:MaxPermSize=1024m -Xms4096m -Xmx4096m -Duser.language=pt -Duser.country=BR -Djboss.modules.system.pkgs -Djboss.domain.master.address=10.116.88.20 -Dsicem.configuracao.ldap.url=ldap://10.116.92.130:489 -Djboss.bind.address.unsecure=10.116.88.24 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djava.net.preferIPv4Stack=true -Dsicem.configuracao.ldap.security.domain=sicem_security_domain -Djboss.bind.address=10.116.88.24 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.policy-permissions=true -Djdk.tls.disabledAlgorithms=SSLv3,TLSv1,TLSv1.1,RC4,DES,3DES,MD5withRSA,DHkeySize -Dsicem.configuracao.ldap.grupo.sistema=SICEM -Djboss.domain.log.dir=/logs/jboss-eap/hc/ -Dhttps.protocols=TLSv1.2,TLSv1.3 -Djava.awt.headless=true -Djboss.bind.address.management=10.116.88.24 -Djboss.server.log.dir=/logs/jboss-eap/hc/servers/sicem_node1_lx0005 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/sicem_node1_lx0005 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/sicem_node1_lx0005 -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/data/servers/sicem_node1_lx0005/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.server
p585600  32443 26923  0 15:17 pts/1    00:00:00 grep sicem
-sh-4.1$
-sh-4.1$
-sh-4.1$ cd /logs/jboss-eap/hc/servers/sicem_node1_lx0005
-sh-4.1$ ls -lth
total 267M
-rw-rw-r-- 1 jboss jboss  14M Aug 14 15:18 server.log
-rw-rw-r-- 1 jboss jboss  12M Aug 13 22:35 server.log.2026-08-13
-rw-rw-r-- 1 jboss jboss  13M Aug 12 22:35 server.log.2026-08-12
-rw-rw-r-- 1 jboss jboss  12M Aug 11 22:35 server.log.2026-08-11
-rw-rw-r-- 1 jboss jboss  11M Aug 10 22:35 server.log.2026-08-10
-rw-rw-r-- 1 jboss jboss  12M Aug  9 20:00 server.log.2026-08-09
-rw-rw-r-- 1 jboss jboss  82K Aug  8 20:00 server.log.2026-08-08
-rw-rw-r-- 1 jboss jboss  11M Aug  7 22:35 server.log.2026-08-07
-rw-rw-r-- 1 jboss jboss  11M Aug  6 23:02 server.log.2026-08-06
-rw-rw-r-- 1 jboss jboss  11M Aug  5 22:35 server.log.2026-08-05
-rw-rw-r-- 1 jboss jboss  11M Aug  4 23:02 server.log.2026-08-04
-rw-rw-r-- 1 jboss jboss  11M Aug  3 22:35 server.log.2026-08-03
-rw-rw-r-- 1 jboss jboss  12M Aug  2 20:00 server.log.2026-08-02
-rw-rw-r-- 1 jboss jboss  82K Aug  1 20:00 server.log.2026-08-01
-rw-rw-r-- 1 jboss jboss  11M Jul 31 22:35 server.log.2026-07-31
-rw-rw-r-- 1 jboss jboss  11M Jul 30 22:35 server.log.2026-07-30
-rw-rw-r-- 1 jboss jboss  11M Jul 29 22:35 server.log.2026-07-29
-rw-rw-r-- 1 jboss jboss  11M Jul 28 22:35 server.log.2026-07-28
-rw-rw-r-- 1 jboss jboss  11M Jul 27 22:35 server.log.2026-07-27
-rw-rw-r-- 1 jboss jboss  12M Jul 26 20:00 server.log.2026-07-26
-rw-rw-r-- 1 jboss jboss  90K Jul 25 20:00 server.log.2026-07-25
-rw-rw-r-- 1 jboss jboss  11M Jul 24 23:02 server.log.2026-07-24
-rw-rw-r-- 1 jboss jboss  11M Jul 23 23:02 server.log.2026-07-23
-rw-rw-r-- 1 jboss jboss  12M Jul 22 23:02 server.log.2026-07-22
-rw-rw-r-- 1 jboss jboss  12M Jul 21 23:02 server.log.2026-07-21
-rw-rw-r-- 1 jboss jboss  12M Jul 20 22:35 server.log.2026-07-20
-rw-rw-r-- 1 jboss jboss  12M Jul 19 20:00 server.log.2026-07-19
-rw-rw-r-- 1 jboss jboss  86K Jul 18 20:00 server.log.2026-07-18
-rw-rw-r-- 1 jboss jboss 176K Jul 17 23:02 server.log.2026-07-17
-sh-4.1$ tail -100f server.log
15:17:56,136 INFO  [stdout] (ServerService Thread Pool -- 68)   at br.gov.caixa.sicem.action.ApplicationWatch.contextInitialized(ApplicationWatch.java:60)
15:17:56,136 INFO  [stdout] (ServerService Thread Pool -- 68)   at org.apache.catalina.core.StandardContext.contextListenerStart(StandardContext.java:3339)
15:17:56,136 INFO  [stdout] (ServerService Thread Pool -- 68)   at org.apache.catalina.core.StandardContext.start(StandardContext.java:3780)
15:17:56,136 INFO  [stdout] (ServerService Thread Pool -- 68)   at org.jboss.as.web.deployment.WebDeploymentService.doStart(WebDeploymentService.java:163)
15:17:56,136 INFO  [stdout] (ServerService Thread Pool -- 68)   at org.jboss.as.web.deployment.WebDeploymentService.access$000(WebDeploymentService.java:61)
15:17:56,137 INFO  [stdout] (ServerService Thread Pool -- 68)   at org.jboss.as.web.deployment.WebDeploymentService$1.run(WebDeploymentService.java:96)
15:17:56,137 INFO  [stdout] (ServerService Thread Pool -- 68)   at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
15:17:56,137 INFO  [stdout] (ServerService Thread Pool -- 68)   at java.util.concurrent.FutureTask.run(FutureTask.java:266)
15:17:56,137 INFO  [stdout] (ServerService Thread Pool -- 68)   at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
15:17:56,137 INFO  [stdout] (ServerService Thread Pool -- 68)   at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
15:17:56,137 INFO  [stdout] (ServerService Thread Pool -- 68)   at java.lang.Thread.run(Thread.java:750)
15:17:56,137 INFO  [stdout] (ServerService Thread Pool -- 68)   at org.jboss.threads.JBossThread.run(JBossThread.java:122)
15:17:56,137 INFO  [stdout] (ServerService Thread Pool -- 68)
15:17:56,146 ERROR [stderr] (ServerService Thread Pool -- 68) ScriptEngineManager providers.next(): javax.script.ScriptEngineFactory: Provider com.sun.script.javascript.RhinoScriptEngineFactory not found
15:17:56,683 INFO  [org.quartz.simpl.SimpleThreadPool] (ServerService Thread Pool -- 68) Job execution threads will use class loader of thread: ServerService Thread Pool -- 68
15:17:56,693 INFO  [org.quartz.core.SchedulerSignalerImpl] (ServerService Thread Pool -- 68) Initialized Scheduler Signaller of type: class org.quartz.core.SchedulerSignalerImpl
15:17:56,694 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 68) Quartz Scheduler v.1.8.5 created.
15:17:56,695 INFO  [org.quartz.simpl.RAMJobStore] (ServerService Thread Pool -- 68) RAMJobStore initialized.
15:17:56,695 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 68) Scheduler meta-data: Quartz Scheduler (v1.8.5) 'DefaultQuartzScheduler' with instanceId 'NON_CLUSTERED'
  Scheduler class: 'org.quartz.core.QuartzScheduler' - running locally.
  NOT STARTED.
  Currently in standby mode.
  Number of jobs executed: 0
  Using thread pool 'org.quartz.simpl.SimpleThreadPool' - with 10 threads.
  Using job-store 'org.quartz.simpl.RAMJobStore' - which does not support persistence. and is not clustered.

15:17:56,695 INFO  [org.quartz.impl.StdSchedulerFactory] (ServerService Thread Pool -- 68) Quartz scheduler 'DefaultQuartzScheduler' initialized from default resource file in Quartz package: 'quartz.properties'
15:17:56,696 INFO  [org.quartz.impl.StdSchedulerFactory] (ServerService Thread Pool -- 68) Quartz scheduler version: 1.8.5
15:17:56,703 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 68) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
15:17:56,704 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 68) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
15:17:56,705 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 68) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
15:17:56,706 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 68) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
15:17:56,708 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 68) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
15:17:56,709 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 68) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
15:17:56,710 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 68) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
15:17:56,710 INFO  [br.gov.caixa.sicem.action.ApplicationWatch] (ServerService Thread Pool -- 68) INICIANDO PROCEDIMENTO DE TRATAR ARQUIVOS NÃO PROCESSADOS
15:17:56,713 INFO  [br.gov.caixa.sicem.action.ApplicationWatch] (ServerService Thread Pool -- 68) NÃO EXISTE ARQUIVO SEM PROCESSAMENTO
15:17:56,714 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 68) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
15:17:56,716 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 68) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
15:17:56,792 INFO  [com.opensymphony.xwork2.config.providers.XmlConfigurationProvider] (ServerService Thread Pool -- 68) Parsing configuration file [struts-default.xml]
15:17:56,818 INFO  [com.opensymphony.xwork2.config.providers.XmlConfigurationProvider] (ServerService Thread Pool -- 68) Parsing configuration file [struts-plugin.xml]
15:17:56,833 INFO  [com.opensymphony.xwork2.config.providers.XmlConfigurationProvider] (ServerService Thread Pool -- 68) Parsing configuration file [struts.xml]
15:17:56,835 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (spring) for (com.opensymphony.xwork2.ObjectFactory)
15:17:56,836 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.factory.ActionFactory)
15:17:56,836 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.factory.ResultFactory)
15:17:56,836 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.factory.ConverterFactory)
15:17:56,836 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.factory.InterceptorFactory)
15:17:56,836 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.factory.ValidatorFactory)
15:17:56,836 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.factory.UnknownHandlerFactory)
15:17:56,836 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.FileManagerFactory)
15:17:56,836 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.impl.XWorkConverter)
15:17:56,836 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.impl.CollectionConverter)
15:17:56,836 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.impl.ArrayConverter)
15:17:56,836 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.impl.DateConverter)
15:17:56,837 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.impl.NumberConverter)
15:17:56,837 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.impl.StringConverter)
15:17:56,837 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.ConversionPropertiesProcessor)
15:17:56,837 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.ConversionFileProcessor)
15:17:56,837 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.ConversionAnnotationProcessor)
15:17:56,837 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.TypeConverterCreator)
15:17:56,837 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.TypeConverterHolder)
15:17:56,837 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.TextProvider)
15:17:56,837 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.LocaleProvider)
15:17:56,837 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.ActionProxyFactory)
15:17:56,837 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.ObjectTypeDeterminer)
15:17:56,838 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (org.apache.struts2.dispatcher.mapper.ActionMapper)
15:17:56,838 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (jakarta) for (org.apache.struts2.dispatcher.multipart.MultiPartRequest)
15:17:56,838 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (org.apache.struts2.views.freemarker.FreemarkerManager)
15:17:56,838 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (org.apache.struts2.views.velocity.VelocityManager)
15:17:56,838 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (org.apache.struts2.components.UrlRenderer)
15:17:56,838 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.validator.ActionValidatorManager)
15:17:56,838 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.util.ValueStackFactory)
15:17:56,838 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.util.reflection.ReflectionProvider)
15:17:56,838 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.util.reflection.ReflectionContextFactory)
15:17:56,838 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.util.PatternMatcher)
15:17:56,838 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (org.apache.struts2.util.ContentTypeMatcher)
15:17:56,838 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (org.apache.struts2.dispatcher.StaticContentLoader)
15:17:56,839 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.UnknownHandlerManager)
15:17:56,839 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (org.apache.struts2.views.util.UrlHelper)
15:17:56,839 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.util.TextParser)
15:17:56,839 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (org.apache.struts2.dispatcher.DispatcherErrorHandler)
15:17:56,839 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.security.ExcludedPatternsChecker)
15:17:56,839 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 68) Choosing bean (struts) for (com.opensymphony.xwork2.security.AcceptedPatternsChecker)
15:17:56,841 INFO  [org.apache.struts2.config.DefaultBeanSelectionProvider] (ServerService Thread Pool -- 68) Loading global messages from [applicationResources]
15:17:56,846 INFO  [org.apache.struts2.spring.StrutsSpringObjectFactory] (ServerService Thread Pool -- 68) Initializing Struts-Spring integration...
15:17:56,847 INFO  [com.opensymphony.xwork2.spring.SpringObjectFactory] (ServerService Thread Pool -- 68) Setting autowire strategy to name
15:17:56,847 INFO  [org.apache.struts2.spring.StrutsSpringObjectFactory] (ServerService Thread Pool -- 68) ... initialized Struts-Spring integration successfully
15:17:57,053 INFO  [org.jboss.as.server] (Controller Boot Thread) JBAS015859: Implantado "SICEM" (runtime-name: "SicemWEB_6.1.0.11.31.war")
15:17:57,053 INFO  [org.jboss.as.server] (Controller Boot Thread) JBAS015859: Implantado "postgresql-9.1-901-1.jdbc4.jar" (runtime-name: "postgresql-9.1-901-1.jdbc4.jar")
15:17:57,053 INFO  [org.jboss.as.server] (Controller Boot Thread) JBAS015859: Implantado "wmq.jmsra.rar" (runtime-name: "wmq.jmsra.rar")
15:17:57,056 INFO  [org.jboss.as] (Controller Boot Thread) JBAS015874: JBoss EAP 6.4.24.GA (AS 7.5.24.Final-redhat-00001) iniciado em 8135ms - Iniciado 687 de serviços 788 (os serviços 131 são lazy, passivos ou em demanda)
15:18:42,862 INFO  [stdout] (ajp-/10.116.88.24:12809-4) 15:18:42.861 [ajp-/10.116.88.24:12809-4] INFO  sicemLogger - Iniciando a funcionalidade de login
15:18:42,977 INFO  [stdout] (ajp-/10.116.88.24:12809-4) 15:18:42.976 [ajp-/10.116.88.24:12809-4] INFO  sicemLogger - Iniciando a autenticação do usuário c899203 para o login
15:18:43,026 INFO  [stdout] (ajp-/10.116.88.24:12809-4) 15:18:43.026 [ajp-/10.116.88.24:12809-4] INFO  sicemLogger - Retorno do LDAP para a conulta do usuário: UsuarioLdap{cn='Usuario de teste SICEM', sobrenome='SICEM', coCargo='ESC', coUnidade='5384', description='ESPECIALISTA', dtNascimento='Mon Jan 01 00:00:00 BRST 1990', cidade='OSASCO', email='c899203@caixa.mail', celular='null', noCargo='ESCRITURARIO', noEmpresa='CAIXA Economica Federal', noFuncao='ESPECIALISTA', noUnidade='null', noUsuario='Usuario de teste SICEM', nuCnpj='360305032650', nuCpf='null', nuFuncao='279', nuTpUnidade='null', nuUnidadeSub='5058', nomeLotacao='null', postalCode='06030003', siglaUnidade='REROP', estadoLotacao='SP', ruaLotacao='AV. MARTIN LUTHER KING, 762', telefoneLotacao='(11) 3685-6500', cargo='ESPECIALISTA', nuMatricula='c899203', listaGruposLdap=[null]', givenName='Usuario de teste SICEM'}
15:18:43,033 INFO  [org.springframework.ldap.core.support.AbstractContextSource] (ajp-/10.116.88.24:12809-4) Property 'userDn' not set - anonymous context will be used for read-write operations
15:18:43,048 INFO  [stdout] (ajp-/10.116.88.24:12809-4) 15:18:43.048 [ajp-/10.116.88.24:12809-4] INFO  sicemLogger - Retorno do LDAP para a consulta dos perfis do usuário: GruposLdap{objectClass='groupOfUniqueNames', uniqueMember='uid=c899203,ou=People,o=caixa', cn='CEMGES'}
15:18:43,054 INFO  [stdout] (ajp-/10.116.88.24:12809-4) 15:18:43.053 [ajp-/10.116.88.24:12809-4] INFO  sicemLogger - Conexão com LDAP estabelecida com sucesso para o usuário: c899203
15:18:43,054 INFO  [stdout] (ajp-/10.116.88.24:12809-4) 15:18:43.054 [ajp-/10.116.88.24:12809-4] INFO  sicemLogger - Finalizando a autenticação do usuário para o login
15:18:43,061 INFO  [stdout] (ajp-/10.116.88.24:12809-4) 15:18:43.061 [ajp-/10.116.88.24:12809-4] INFO  sicemLogger - UPDATE usuario SET usua_datahoralogin = '2026-08-14 15:18:43.058',lsis_usua_login='c899203',lsis_func_id=16 WHERE usua_login='c899203'
15:18:43,062 INFO  [stdout] (ajp-/10.116.88.24:12809-4) 15:18:43.062 [ajp-/10.116.88.24:12809-4] INFO  sicemLogger - Finalizando a funcionalidade de login





-sh-4.2$ exit
logout
Connection to 10.116.94.212 closed.
[p585600@cadsvitrlx100 ~]$ ssh 10.116.88.20
The authenticity of host '10.116.88.20 (10.116.88.20)' can't be established.
RSA key fingerprint is SHA256:kW3+up6ZqR6TzRpM6HJqeaxubKmfk9tEF23IalktbPs.
This host key is known by the following other names/addresses:
    ~/.ssh/known_hosts:7: 10.116.94.203
    ~/.ssh/known_hosts:15: 10.116.88.25
    ~/.ssh/known_hosts:84: 10.116.88.30
    ~/.ssh/known_hosts:115: 10.116.88.24
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '10.116.88.20' (RSA) to the list of known hosts.
***********************************************************************
(1) - Este e um computador privado de propriedade da Caixa Economica
Federal. Usuarios autorizados e nao autorizados nao possuem direitos de
divulgar as informacoes contidas aqui.
(2) - Ao fazer uso do sistema, o usuario esta ciente que pode estar
sendo monitorado, interceptado e auditado pelo departamento competente
da Caixa Economica Federal.
(3) - O uso nao autorizado ou improprio deste sistema pode resultar em
um processo disciplinar administrativo e/ou punicao atraves de acoes
civis ou criminais. Ao continuar o uso deste sistema, indica que voce
esta ciente e concordando com os termos e condicoes acima descritos.

Pressione <Control+D> IMEDIATAMENTE se voce nao concorda com as
condicoes deste aviso
***********************************************************************
p585600@10.116.88.20's password:
Last login: Tue Jul 14 11:00:36 2026 from 10.116.88.30
-sh-4.1$
-sh-4.1$
-sh-4.1$ sudo su
[sudo] password for p585600:
[root@sbrdeapllx0001 p585600]#
[root@sbrdeapllx0001 p585600]#
[root@sbrdeapllx0001 p585600]#
[root@sbrdeapllx0001 p585600]#
[root@sbrdeapllx0001 p585600]#
[root@sbrdeapllx0001 p585600]#
[root@sbrdeapllx0001 p585600]#
[root@sbrdeapllx0001 p585600]# /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --user='admin' --password='jboss!123' --controller=10.116.88.20:9999
[domain@10.116.88.20:9999 /] /host=
DC_DES_LX0001                 corporativo_sbrdeapllx0010    credito_cbrdeapllx242         financeiro_sbrdeapllx0006     habitacao_sbrdeapllx0005      risco_sbrdeapllx093
azure_teste_dr_sbrdeapllx067  corporativo_sbrdeapllx0011    credito_sbrdeapllx0009        habitacao_sbrdeapllx0004      negocial_sbrdeapllx0003
[domain@10.116.88.20:9999 /] /host=habitacao_sbrdeapllx0005/server
server         server-config
[domain@10.116.88.20:9999 /] /host=habitacao_sbrdeapllx0005/server-config=si
siaef_node1_lx0091               sicve-anexo_node1_lx0011         sicve-internet_node1_lx0011      sicve_node1_lx0011
sicem_node1_lx0005               sicve-api_node1_lx0005           sicve-msw-intranet_node1_lx0011
[domain@10.116.88.20:9999 /] /host=habitacao_sbrdeapllx0005/server-config=sicem_node1_lx0005:start
{
    "outcome" => "success",
    "result" => "STARTING"
}
[domain@10.116.88.20:9999 /]


<img width="1904" height="994" alt="image" src="https://github.com/user-attachments/assets/af1a74bf-64bf-4051-b1f1-de1278ef9c04" />


fizemos pela console joamos o arquivo la assinamos ,e depois fiz op deploy grava esse processo pra mim, pra quando precsar novamente



