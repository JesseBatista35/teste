-sh-4.1$ ls -laR /logs/jboss-eap/hc/ | head -60
/logs/jboss-eap/hc/:
total 140
drwxr-xr-x 3 jboss jboss   4096 Nov 23  2016 .
drwxr-xr-x 3 jboss jboss   4096 Jul 15  2016 ..
-rw-r--r-- 1 jboss jboss 114922 Sep 18 10:47 console-stdout.log
-rw-rw-r-- 1 jboss jboss   5038 Sep 18 10:47 host-controller.log
-rw-rw-r-- 1 jboss jboss   1421 Sep 18 10:47 process-controller.log
drwxrwxr-x 9 jboss jboss   4096 Sep 18 10:47 servers

/logs/jboss-eap/hc/servers:
total 36
drwxrwxr-x 9 jboss jboss 4096 Sep 18 10:47 .
drwxr-xr-x 3 jboss jboss 4096 Nov 23  2016 ..
drwxrwxr-x 2 jboss jboss 4096 Sep 18 10:47 siaef_node1_lx0091
drwxrwxr-x 2 jboss jboss 4096 Sep 18 10:47 sicem_node1_lx0005
drwxrwxr-x 2 jboss jboss 4096 Sep 18 10:48 sicve-anexo_node1_lx0011
drwxrwxr-x 2 jboss jboss 4096 Sep 18 10:47 sicve-api_node1_lx0005
drwxrwxr-x 2 jboss jboss 4096 Sep 18 10:47 sicve-internet_node1_lx0011
drwxrwxr-x 2 jboss jboss 4096 Sep 18 10:47 sicve-msw-intranet_node1_lx0011
drwxrwxr-x 2 jboss jboss 4096 Sep 18 10:47 sicve_node1_lx0011

/logs/jboss-eap/hc/servers/siaef_node1_lx0091:
total 24
drwxrwxr-x 2 jboss jboss  4096 Sep 18 10:47 .
drwxrwxr-x 9 jboss jboss  4096 Sep 18 10:47 ..
-rw-rw-r-- 1 jboss jboss     0 Sep 18 10:47 cicsdirect.log
-rw-rw-r-- 1 jboss jboss 13418 Sep 18 10:47 server.log
-rw-rw-r-- 1 jboss jboss     0 Sep 18 10:47 siaef.log

/logs/jboss-eap/hc/servers/sicem_node1_lx0005:
total 92
drwxrwxr-x 2 jboss jboss  4096 Sep 18 10:47 .
drwxrwxr-x 9 jboss jboss  4096 Sep 18 10:47 ..
-rw-rw-r-- 1 jboss jboss 85613 Sep 18 10:47 server.log

/logs/jboss-eap/hc/servers/sicve-anexo_node1_lx0011:
total 16996
drwxrwxr-x 2 jboss jboss     4096 Sep 18 10:48 .
drwxrwxr-x 9 jboss jboss     4096 Sep 18 10:47 ..
-rw-rw-r-- 1 jboss jboss  6709739 Sep 18 10:48 server.log
-rw-rw-r-- 1 jboss jboss 10486040 Sep 18 10:48 server.log.1
-rw-rw-r-- 1 jboss jboss   190582 Sep 18 10:48 SICVE.log

/logs/jboss-eap/hc/servers/sicve-api_node1_lx0005:
total 360
drwxrwxr-x 2 jboss jboss   4096 Sep 18 10:47 .
drwxrwxr-x 9 jboss jboss   4096 Sep 18 10:47 ..
-rw-rw-r-- 1 jboss jboss 184279 Sep 18 10:48 server.log
-rw-rw-r-- 1 jboss jboss 174455 Sep 18 10:48 SICVE.log

/logs/jboss-eap/hc/servers/sicve-internet_node1_lx0011:
total 28
drwxrwxr-x 2 jboss jboss  4096 Sep 18 10:47 .
drwxrwxr-x 9 jboss jboss  4096 Sep 18 10:47 ..
-rw-rw-r-- 1 jboss jboss 17343 Sep 18 10:47 server.log
-rw-rw-r-- 1 jboss jboss     0 Sep 18 10:47 SICVE.log

/logs/jboss-eap/hc/servers/sicve-msw-intranet_node1_lx0011:
total 5944
drwxrwxr-x 2 jboss jboss    4096 Sep 18 10:47 .
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ ls -laR /opt/jboss_logs/jboss-eap-6.3/hc_sbrdeapllx0005/ | head -60
/opt/jboss_logs/jboss-eap-6.3/hc_sbrdeapllx0005/:
total 12
drwxr-xr-x 2 root root 4096 Nov 24  2025 .
drwxr-xr-x 3 root root 4096 Nov 24  2025 ..
-rw-r--r-- 1 root root  435 Feb 10  2026 console-stdout.log
-sh-4.1$ tail -n 200 /logs/jboss-eap/hc/console-stdout.log
[Server:sicem_node1_lx0005]   Tool 'field' => org.apache.velocity.tools.generic.FieldTool
[Server:sicem_node1_lx0005]   Tool 'math' => org.apache.velocity.tools.generic.MathTool
[Server:sicem_node1_lx0005]   Tool 'number' => org.apache.velocity.tools.generic.NumberTool
[Server:sicem_node1_lx0005]   Tool 'sorter' => org.apache.velocity.tools.generic.SortTool
[Server:sicem_node1_lx0005]   Tool 'text' => org.apache.velocity.tools.generic.ResourceTool
[Server:sicem_node1_lx0005]   Tool 'xml' => org.apache.velocity.tools.generic.XmlTool
[Server:sicem_node1_lx0005]
[Server:sicem_node1_lx0005]  Toolbox 'request' with 1 properties [scope -auto-> request; ] and 10 tools:
[Server:sicem_node1_lx0005]   Tool 'context' => org.apache.velocity.tools.view.ViewContextTool
[Server:sicem_node1_lx0005]   Tool 'cookies' => org.apache.velocity.tools.view.CookieTool
[Server:sicem_node1_lx0005]   Tool 'import' => org.apache.velocity.tools.view.ImportTool
[Server:sicem_node1_lx0005]   Tool 'include' => org.apache.velocity.tools.view.IncludeTool
[Server:sicem_node1_lx0005]   Tool 'link' => org.apache.velocity.tools.struts.StrutsLinkTool
[Server:sicem_node1_lx0005]   Tool 'loop' => org.apache.velocity.tools.generic.LoopTool
[Server:sicem_node1_lx0005]   Tool 'pager' => org.apache.velocity.tools.view.PagerTool
[Server:sicem_node1_lx0005]   Tool 'params' => org.apache.velocity.tools.view.ParameterTool
[Server:sicem_node1_lx0005]   Tool 'render' => org.apache.velocity.tools.generic.RenderTool
[Server:sicem_node1_lx0005]   Tool 'tiles' => org.apache.tiles.velocity.template.VelocityStyleTilesTool with 1 properties [key -auto-> tiles; ]
[Server:sicem_node1_lx0005]
[Server:sicem_node1_lx0005]  Toolbox 'session' with 2 properties [createSession -auto-> false; scope -auto-> session; ] and 1 tools:
[Server:sicem_node1_lx0005]   Tool 'browser' => org.apache.velocity.tools.view.BrowserTool
[Server:sicem_node1_lx0005]
[Server:sicem_node1_lx0005]  Data 'GENERIC_TOOLS_AVAILABLE' -boolean-> true
[Server:sicem_node1_lx0005]  Data 'STRUTS_TOOLS_AVAILABLE' -boolean-> true
[Server:sicem_node1_lx0005]  Data 'TOOLS_VERSION' -number-> 2.0
[Server:sicem_node1_lx0005]  Data 'VIEW_TOOLS_AVAILABLE' -boolean-> true
[Server:sicem_node1_lx0005]
[Server:sicem_node1_lx0005]  Source 0: org.apache.velocity.tools.config.FactoryConfiguration(VelocityView.configure(config,factory))
[Server:sicem_node1_lx0005]  Source 1: org.apache.velocity.tools.config.XmlFactoryConfiguration(ConfigurationUtils.getDefaultTools())
[Server:sicem_node1_lx0005]  Source 2:     .read(vfs:/content/SicemWEB_6.1.0.12.01.war/WEB-INF/lib/velocity-tools-2.0.jar/org/apache/velocity/tools/generic/tools.xml)
[Server:sicem_node1_lx0005]  Source 3:     .read(vfs:/content/SicemWEB_6.1.0.12.01.war/WEB-INF/lib/velocity-tools-2.0.jar/org/apache/velocity/tools/view/tools.xml)
[Server:sicem_node1_lx0005]  Source 4:     .read(vfs:/content/SicemWEB_6.1.0.12.01.war/WEB-INF/lib/velocity-tools-2.0.jar/org/apache/velocity/tools/struts/tools.xml)
[Server:sicem_node1_lx0005]  Source 5: org.apache.velocity.tools.config.FactoryConfiguration(ConfigurationUtils.getAutoLoaded(false))
[Server:sicem_node1_lx0005]  Source 6: org.apache.velocity.tools.config.XmlFactoryConfiguration(ConfigurationUtils.read(vfs:/content/SicemWEB_6.1.0.12.01.war/WEB-INF/lib/tiles-velocity-3.0.5.jar/tools.xml))
[Server:sicem_node1_lx0005]
[Server:sicem_node1_lx0005] 10:47:24,688 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 76)  Velocity  [debug] Default Content-Type is: text/html
[Server:sicem_node1_lx0005] 10:47:24,715 INFO  [org.apache.tiles.access.TilesAccess] (ServerService Thread Pool -- 76) Publishing TilesContext for context: org.apache.tiles.request.servlet.wildcard.WildcardServletApplicationContext
[Host Controller] 10:47:24,718 INFO  [org.jboss.as.domain.controller.mgmt] (Remoting "sbrdeapllx0005.desenvolvimento.extracaixa:MANAGEMENT" task-11) JBAS010920: Server [Server:sicve-msw-intranet_node1_lx0011] registered using connection [Channel ID 3b8c551e (inbound) of Remoting connection 30d94b86 to /10.116.88.24:38288]
[Server:sicem_node1_lx0005] 10:47:24,736 INFO  [org.apache.commons.vfs.impl.DefaultFileReplicator] (ServerService Thread Pool -- 76) Using "/tmp/vfs_cache" as temporary files store.
[Host Controller] 10:47:24,893 INFO  [org.jboss.as.host.controller] (Controller Boot Thread) JBAS010922: Starting server sicve-anexo_node1_lx0011
[Host Controller] 10:47:24,926 INFO  [org.jboss.as.host.controller] (server-registration-threads - 1) JBAS010919: Registering server sicve-msw-intranet_node1_lx0011
10:47:24,977 INFO  [org.jboss.as.process.Server:sicve-anexo_node1_lx0011.status] (ProcessController-threads - 3) JBAS012017: Starting process 'Server:sicve-anexo_node1_lx0011'
[Server:sicem_node1_lx0005] 10:47:24,983 ERROR [stderr] (ServerService Thread Pool -- 76) ScriptEngineManager providers.next(): javax.script.ScriptEngineFactory: Provider com.sun.script.javascript.RhinoScriptEngineFactory not found
[Server:sicem_node1_lx0005] 10:47:25,066 INFO  [stdout] (ServerService Thread Pool -- 76) 2026-09-18 10:47:25,057 ServerService Thread Pool -- 76 ERROR Unable to access file:/content/SicemWEB_6.1.0.12.01.war/WEB-INF/classes/log4j2-linux.xml java.io.FileNotFoundException: /content/SicemWEB_6.1.0.12.01.war/WEB-INF/classes/log4j2-linux.xml (No such file or directory)
[Server:sicem_node1_lx0005] 10:47:25,067 INFO  [stdout] (ServerService Thread Pool -- 76)       at java.io.FileInputStream.open0(Native Method)
[Server:sicem_node1_lx0005] 10:47:25,067 INFO  [stdout] (ServerService Thread Pool -- 76)       at java.io.FileInputStream.open(FileInputStream.java:195)
[Server:sicem_node1_lx0005] 10:47:25,067 INFO  [stdout] (ServerService Thread Pool -- 76)       at java.io.FileInputStream.<init>(FileInputStream.java:138)
[Server:sicem_node1_lx0005] 10:47:25,071 INFO  [stdout] (ServerService Thread Pool -- 76)       at java.io.FileInputStream.<init>(FileInputStream.java:93)
[Server:sicem_node1_lx0005] 10:47:25,071 INFO  [stdout] (ServerService Thread Pool -- 76)       at sun.net.www.protocol.file.FileURLConnection.connect(FileURLConnection.java:90)
[Server:sicem_node1_lx0005] 10:47:25,071 INFO  [stdout] (ServerService Thread Pool -- 76)       at sun.net.www.protocol.file.FileURLConnection.getInputStream(FileURLConnection.java:188)
[Server:sicem_node1_lx0005] 10:47:25,071 INFO  [stdout] (ServerService Thread Pool -- 76)       at java.net.URL.openStream(URL.java:1092)
[Server:sicem_node1_lx0005] 10:47:25,072 INFO  [stdout] (ServerService Thread Pool -- 76)       at org.apache.logging.log4j.core.config.ConfigurationFactory.getInputFromUri(ConfigurationFactory.java:307)
[Server:sicem_node1_lx0005] 10:47:25,072 INFO  [stdout] (ServerService Thread Pool -- 76)       at org.apache.logging.log4j.core.config.ConfigurationFactory.getConfiguration(ConfigurationFactory.java:242)
[Server:sicem_node1_lx0005] 10:47:25,072 INFO  [stdout] (ServerService Thread Pool -- 76)       at org.apache.logging.log4j.core.config.ConfigurationFactory$Factory.getConfiguration(ConfigurationFactory.java:443)
[Server:sicem_node1_lx0005] 10:47:25,072 INFO  [stdout] (ServerService Thread Pool -- 76)       at org.apache.logging.log4j.core.config.ConfigurationFactory.getConfiguration(ConfigurationFactory.java:265)
[Server:sicem_node1_lx0005] 10:47:25,073 INFO  [stdout] (ServerService Thread Pool -- 76)       at org.apache.logging.log4j.core.LoggerContext.reconfigure(LoggerContext.java:613)
[Server:sicem_node1_lx0005] 10:47:25,073 INFO  [stdout] (ServerService Thread Pool -- 76)       at org.apache.logging.log4j.core.LoggerContext.setConfigLocation(LoggerContext.java:603)
[Server:sicem_node1_lx0005] 10:47:25,073 INFO  [stdout] (ServerService Thread Pool -- 76)       at br.gov.caixa.sicem.util.Log.<init>(Log.java:25)
[Server:sicem_node1_lx0005] 10:47:25,073 INFO  [stdout] (ServerService Thread Pool -- 76)       at br.gov.caixa.sicem.util.Log.getInstance(Log.java:57)
[Server:sicem_node1_lx0005] 10:47:25,073 INFO  [stdout] (ServerService Thread Pool -- 76)       at br.gov.caixa.sicem.dao.AbstractDao.<init>(AbstractDao.java:32)
[Server:sicem_node1_lx0005] 10:47:25,073 INFO  [stdout] (ServerService Thread Pool -- 76)       at br.gov.caixa.sicem.dao.ConfiguracaoDao.<init>(ConfiguracaoDao.java:21)
[Server:sicem_node1_lx0005] 10:47:25,073 INFO  [stdout] (ServerService Thread Pool -- 76)       at br.gov.caixa.sicem.action.ApplicationWatch.reiniciaServicoRecepcao(ApplicationWatch.java:76)
[Server:sicem_node1_lx0005] 10:47:25,073 INFO  [stdout] (ServerService Thread Pool -- 76)       at br.gov.caixa.sicem.action.ApplicationWatch.reiniciarServicos(ApplicationWatch.java:161)
[Server:sicem_node1_lx0005] 10:47:25,073 INFO  [stdout] (ServerService Thread Pool -- 76)       at br.gov.caixa.sicem.action.ApplicationWatch.contextInitialized(ApplicationWatch.java:60)
[Server:sicem_node1_lx0005] 10:47:25,073 INFO  [stdout] (ServerService Thread Pool -- 76)       at org.apache.catalina.core.StandardContext.contextListenerStart(StandardContext.java:3339)
[Server:sicem_node1_lx0005] 10:47:25,073 INFO  [stdout] (ServerService Thread Pool -- 76)       at org.apache.catalina.core.StandardContext.start(StandardContext.java:3780)
[Server:sicem_node1_lx0005] 10:47:25,073 INFO  [stdout] (ServerService Thread Pool -- 76)       at org.jboss.as.web.deployment.WebDeploymentService.doStart(WebDeploymentService.java:163)
[Server:sicem_node1_lx0005] 10:47:25,073 INFO  [stdout] (ServerService Thread Pool -- 76)       at org.jboss.as.web.deployment.WebDeploymentService.access$000(WebDeploymentService.java:61)
[Server:sicem_node1_lx0005] 10:47:25,074 INFO  [stdout] (ServerService Thread Pool -- 76)       at org.jboss.as.web.deployment.WebDeploymentService$1.run(WebDeploymentService.java:96)
[Server:sicem_node1_lx0005] 10:47:25,074 INFO  [stdout] (ServerService Thread Pool -- 76)       at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
[Server:sicem_node1_lx0005] 10:47:25,074 INFO  [stdout] (ServerService Thread Pool -- 76)       at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[Server:sicem_node1_lx0005] 10:47:25,074 INFO  [stdout] (ServerService Thread Pool -- 76)       at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
[Server:sicem_node1_lx0005] 10:47:25,074 INFO  [stdout] (ServerService Thread Pool -- 76)       at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
[Server:sicem_node1_lx0005] 10:47:25,074 INFO  [stdout] (ServerService Thread Pool -- 76)       at java.lang.Thread.run(Thread.java:750)
[Server:sicem_node1_lx0005] 10:47:25,074 INFO  [stdout] (ServerService Thread Pool -- 76)       at org.jboss.threads.JBossThread.run(JBossThread.java:122)
[Server:sicem_node1_lx0005] 10:47:25,074 INFO  [stdout] (ServerService Thread Pool -- 76)
[Server:sicem_node1_lx0005] 10:47:25,076 INFO  [stdout] (ServerService Thread Pool -- 76) 2026-09-18 10:47:25,075 ServerService Thread Pool -- 76 ERROR Unable to access file:/content/SicemWEB_6.1.0.12.01.war/WEB-INF/classes/log4j2-linux.xml java.io.FileNotFoundException: /content/SicemWEB_6.1.0.12.01.war/WEB-INF/classes/log4j2-linux.xml (No such file or directory)
[Server:sicem_node1_lx0005] 10:47:25,076 INFO  [stdout] (ServerService Thread Pool -- 76)       at java.io.FileInputStream.open0(Native Method)
[Server:sicem_node1_lx0005] 10:47:25,076 INFO  [stdout] (ServerService Thread Pool -- 76)       at java.io.FileInputStream.open(FileInputStream.java:195)
[Server:sicem_node1_lx0005] 10:47:25,076 INFO  [stdout] (ServerService Thread Pool -- 76)       at java.io.FileInputStream.<init>(FileInputStream.java:138)
[Server:sicem_node1_lx0005] 10:47:25,076 INFO  [stdout] (ServerService Thread Pool -- 76)       at java.io.FileInputStream.<init>(FileInputStream.java:93)
[Server:sicem_node1_lx0005] 10:47:25,076 INFO  [stdout] (ServerService Thread Pool -- 76)       at sun.net.www.protocol.file.FileURLConnection.connect(FileURLConnection.java:90)
[Server:sicem_node1_lx0005] 10:47:25,076 INFO  [stdout] (ServerService Thread Pool -- 76)       at sun.net.www.protocol.file.FileURLConnection.getInputStream(FileURLConnection.java:188)
[Server:sicem_node1_lx0005] 10:47:25,077 INFO  [stdout] (ServerService Thread Pool -- 76)       at java.net.URL.openStream(URL.java:1092)
[Server:sicem_node1_lx0005] 10:47:25,077 INFO  [stdout] (ServerService Thread Pool -- 76)       at org.apache.logging.log4j.core.config.ConfigurationFactory.getInputFromUri(ConfigurationFactory.java:307)
[Server:sicem_node1_lx0005] 10:47:25,077 INFO  [stdout] (ServerService Thread Pool -- 76)       at org.apache.logging.log4j.core.config.ConfigurationFactory.getConfiguration(ConfigurationFactory.java:242)
[Server:sicem_node1_lx0005] 10:47:25,077 INFO  [stdout] (ServerService Thread Pool -- 76)       at org.apache.logging.log4j.core.config.ConfigurationFactory$Factory.getConfiguration(ConfigurationFactory.java:443)
[Server:sicem_node1_lx0005] 10:47:25,077 INFO  [stdout] (ServerService Thread Pool -- 76)       at org.apache.logging.log4j.core.config.ConfigurationFactory.getConfiguration(ConfigurationFactory.java:265)
[Server:sicem_node1_lx0005] 10:47:25,077 INFO  [stdout] (ServerService Thread Pool -- 76)       at org.apache.logging.log4j.core.LoggerContext.reconfigure(LoggerContext.java:613)
[Server:sicem_node1_lx0005] 10:47:25,078 INFO  [stdout] (ServerService Thread Pool -- 76)       at org.apache.logging.log4j.core.LoggerContext.setConfigLocation(LoggerContext.java:603)
[Server:sicem_node1_lx0005] 10:47:25,078 INFO  [stdout] (ServerService Thread Pool -- 76)       at br.gov.caixa.sicem.util.Log.<init>(Log.java:25)
[Server:sicem_node1_lx0005] 10:47:25,079 INFO  [stdout] (ServerService Thread Pool -- 76)       at br.gov.caixa.sicem.util.Log.getInstance(Log.java:57)
[Server:sicem_node1_lx0005] 10:47:25,079 INFO  [stdout] (ServerService Thread Pool -- 76)       at br.gov.caixa.sicem.dao.AbstractDao.<init>(AbstractDao.java:32)
[Server:sicem_node1_lx0005] 10:47:25,081 INFO  [stdout] (ServerService Thread Pool -- 76)       at br.gov.caixa.sicem.dao.ConfiguracaoDao.<init>(ConfiguracaoDao.java:21)
[Server:sicem_node1_lx0005] 10:47:25,082 INFO  [stdout] (ServerService Thread Pool -- 76)       at br.gov.caixa.sicem.action.ApplicationWatch.reiniciaServicoRecepcao(ApplicationWatch.java:76)
[Server:sicem_node1_lx0005] 10:47:25,082 INFO  [stdout] (ServerService Thread Pool -- 76)       at br.gov.caixa.sicem.action.ApplicationWatch.reiniciarServicos(ApplicationWatch.java:161)
[Server:sicem_node1_lx0005] 10:47:25,082 INFO  [stdout] (ServerService Thread Pool -- 76)       at br.gov.caixa.sicem.action.ApplicationWatch.contextInitialized(ApplicationWatch.java:60)
[Server:sicem_node1_lx0005] 10:47:25,082 INFO  [stdout] (ServerService Thread Pool -- 76)       at org.apache.catalina.core.StandardContext.contextListenerStart(StandardContext.java:3339)
[Server:sicem_node1_lx0005] 10:47:25,082 INFO  [stdout] (ServerService Thread Pool -- 76)       at org.apache.catalina.core.StandardContext.start(StandardContext.java:3780)
[Server:sicem_node1_lx0005] 10:47:25,082 INFO  [stdout] (ServerService Thread Pool -- 76)       at org.jboss.as.web.deployment.WebDeploymentService.doStart(WebDeploymentService.java:163)
[Server:sicem_node1_lx0005] 10:47:25,082 INFO  [stdout] (ServerService Thread Pool -- 76)       at org.jboss.as.web.deployment.WebDeploymentService.access$000(WebDeploymentService.java:61)
[Server:sicem_node1_lx0005] 10:47:25,082 INFO  [stdout] (ServerService Thread Pool -- 76)       at org.jboss.as.web.deployment.WebDeploymentService$1.run(WebDeploymentService.java:96)
[Server:sicem_node1_lx0005] 10:47:25,082 INFO  [stdout] (ServerService Thread Pool -- 76)       at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
[Server:sicem_node1_lx0005] 10:47:25,082 INFO  [stdout] (ServerService Thread Pool -- 76)       at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[Server:sicem_node1_lx0005] 10:47:25,082 INFO  [stdout] (ServerService Thread Pool -- 76)       at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
[Server:sicem_node1_lx0005] 10:47:25,083 INFO  [stdout] (ServerService Thread Pool -- 76)       at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
[Server:sicem_node1_lx0005] 10:47:25,083 INFO  [stdout] (ServerService Thread Pool -- 76)       at java.lang.Thread.run(Thread.java:750)
[Server:sicem_node1_lx0005] 10:47:25,083 INFO  [stdout] (ServerService Thread Pool -- 76)       at org.jboss.threads.JBossThread.run(JBossThread.java:122)
[Server:sicem_node1_lx0005] 10:47:25,083 INFO  [stdout] (ServerService Thread Pool -- 76)
[Server:sicem_node1_lx0005] 10:47:25,101 ERROR [stderr] (ServerService Thread Pool -- 76) ScriptEngineManager providers.next(): javax.script.ScriptEngineFactory: Provider com.sun.script.javascript.RhinoScriptEngineFactory not found
[Server:sicve-msw-intranet_node1_lx0011] 10:47:25,472 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 23) JBAS014627: Attribute 'path' in the resource at address '/subsystem=transactions' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[Server:sicve-msw-intranet_node1_lx0011] 10:47:25,472 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 23) JBAS014627: Attribute 'relative-to' in the resource at address '/subsystem=transactions' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[Server:sicve-anexo_node1_lx0011] 10:47:25,657 INFO  [org.jboss.modules] (main) JBoss Modules version 1.3.11.Final-redhat-1
[Server:sicve-anexo_node1_lx0011] 10:47:25,976 INFO  [org.jboss.msc] (main) JBoss MSC version 1.1.7.SP1-redhat-1
[Server:sicem_node1_lx0005] 10:47:26,058 INFO  [org.quartz.simpl.SimpleThreadPool] (ServerService Thread Pool -- 76) Job execution threads will use class loader of thread: ServerService Thread Pool -- 76
[Server:sicve-anexo_node1_lx0011] 10:47:26,113 INFO  [org.jboss.as] (MSC service thread 1-8) JBAS015899: Iniciando JBoss EAP 6.4.24.GA (AS 7.5.24.Final-redhat-00001)
[Server:sicem_node1_lx0005] 10:47:26,168 INFO  [org.quartz.core.SchedulerSignalerImpl] (ServerService Thread Pool -- 76) Initialized Scheduler Signaller of type: class org.quartz.core.SchedulerSignalerImpl
[Server:sicem_node1_lx0005] 10:47:26,168 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 76) Quartz Scheduler v.1.8.5 created.
[Server:sicem_node1_lx0005] 10:47:26,179 INFO  [org.quartz.simpl.RAMJobStore] (ServerService Thread Pool -- 76) RAMJobStore initialized.
[Server:sicem_node1_lx0005] 10:47:26,179 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 76) Scheduler meta-data: Quartz Scheduler (v1.8.5) 'DefaultQuartzScheduler' with instanceId 'NON_CLUSTERED'
[Server:sicem_node1_lx0005]   Scheduler class: 'org.quartz.core.QuartzScheduler' - running locally.
[Server:sicem_node1_lx0005]   NOT STARTED.
[Server:sicem_node1_lx0005]   Currently in standby mode.
[Server:sicem_node1_lx0005]   Number of jobs executed: 0
[Server:sicem_node1_lx0005]   Using thread pool 'org.quartz.simpl.SimpleThreadPool' - with 10 threads.
[Server:sicem_node1_lx0005]   Using job-store 'org.quartz.simpl.RAMJobStore' - which does not support persistence. and is not clustered.
[Server:sicem_node1_lx0005]
[Server:sicem_node1_lx0005] 10:47:26,179 INFO  [org.quartz.impl.StdSchedulerFactory] (ServerService Thread Pool -- 76) Quartz scheduler 'DefaultQuartzScheduler' initialized from default resource file in Quartz package: 'quartz.properties'
[Server:sicem_node1_lx0005] 10:47:26,179 INFO  [org.quartz.impl.StdSchedulerFactory] (ServerService Thread Pool -- 76) Quartz scheduler version: 1.8.5
[Server:sicem_node1_lx0005] 10:47:26,187 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 76) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
[Server:sicem_node1_lx0005] 10:47:26,188 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 76) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
[Server:sicem_node1_lx0005] 10:47:26,189 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 76) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
[Server:sicem_node1_lx0005] 10:47:26,190 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 76) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
[Server:sicem_node1_lx0005] 10:47:26,196 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 76) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
[Server:sicem_node1_lx0005] 10:47:26,197 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 76) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
[Server:sicem_node1_lx0005] 10:47:26,210 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 76) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
[Server:sicem_node1_lx0005] 10:47:26,211 INFO  [br.gov.caixa.sicem.action.ApplicationWatch] (ServerService Thread Pool -- 76) INICIANDO PROCEDIMENTO DE TRATAR ARQUIVOS NÃO PROCESSADOS
[Server:sicem_node1_lx0005] 10:47:26,215 INFO  [br.gov.caixa.sicem.action.ApplicationWatch] (ServerService Thread Pool -- 76) NÃO EXISTE ARQUIVO SEM PROCESSAMENTO
[Server:sicem_node1_lx0005] 10:47:26,226 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 76) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
[Server:sicem_node1_lx0005] 10:47:26,227 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 76) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
[Server:sicve-anexo_node1_lx0011] 10:47:26,228 INFO  [org.xnio] (MSC service thread 1-1) XNIO Version 3.0.17.GA-redhat-1
[Server:sicve-anexo_node1_lx0011] 10:47:26,234 INFO  [org.xnio.nio] (MSC service thread 1-1) XNIO NIO Implementation Version 3.0.17.GA-redhat-1
[Server:sicve-anexo_node1_lx0011] 10:47:26,242 INFO  [org.jboss.remoting] (MSC service thread 1-1) JBoss Remoting version 3.3.12.Final-redhat-2
[Server:sicem_node1_lx0005] 10:47:26,584 INFO  [com.opensymphony.xwork2.config.providers.XmlConfigurationProvider] (ServerService Thread Pool -- 76) Parsing configuration file [struts-default.xml]
[Server:sicem_node1_lx0005] 10:47:26,627 INFO  [com.opensymphony.xwork2.config.providers.XmlConfigurationProvider] (ServerService Thread Pool -- 76) Parsing configuration file [struts-plugin.xml]
[Server:sicem_node1_lx0005] 10:47:26,660 INFO  [com.opensymphony.xwork2.config.providers.XmlConfigurationProvider] (ServerService Thread Pool -- 76) Parsing configuration file [struts.xml]
[Server:sicem_node1_lx0005] 10:47:26,683 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (spring) for (com.opensymphony.xwork2.ObjectFactory)
[Server:sicem_node1_lx0005] 10:47:26,683 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.factory.ActionFactory)
[Server:sicem_node1_lx0005] 10:47:26,683 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.factory.ResultFactory)
[Server:sicem_node1_lx0005] 10:47:26,683 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.factory.ConverterFactory)
[Server:sicem_node1_lx0005] 10:47:26,683 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.factory.InterceptorFactory)
[Server:sicem_node1_lx0005] 10:47:26,683 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.factory.ValidatorFactory)
[Server:sicem_node1_lx0005] 10:47:26,683 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.factory.UnknownHandlerFactory)
[Server:sicem_node1_lx0005] 10:47:26,683 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.FileManagerFactory)
[Server:sicem_node1_lx0005] 10:47:26,684 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.impl.XWorkConverter)
[Server:sicem_node1_lx0005] 10:47:26,684 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.impl.CollectionConverter)
[Server:sicem_node1_lx0005] 10:47:26,684 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.impl.ArrayConverter)
[Server:sicem_node1_lx0005] 10:47:26,685 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.impl.DateConverter)
[Server:sicem_node1_lx0005] 10:47:26,685 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.impl.NumberConverter)
[Server:sicem_node1_lx0005] 10:47:26,685 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.impl.StringConverter)
[Server:sicem_node1_lx0005] 10:47:26,686 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.ConversionPropertiesProcessor)
[Server:sicem_node1_lx0005] 10:47:26,686 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.ConversionFileProcessor)
[Server:sicem_node1_lx0005] 10:47:26,686 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.ConversionAnnotationProcessor)
[Server:sicem_node1_lx0005] 10:47:26,688 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.TypeConverterCreator)
[Server:sicem_node1_lx0005] 10:47:26,688 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.TypeConverterHolder)
[Server:sicem_node1_lx0005] 10:47:26,688 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.TextProvider)
[Server:sicem_node1_lx0005] 10:47:26,688 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.LocaleProvider)
[Server:sicem_node1_lx0005] 10:47:26,688 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.ActionProxyFactory)
[Server:sicem_node1_lx0005] 10:47:26,688 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.ObjectTypeDeterminer)
[Server:sicem_node1_lx0005] 10:47:26,689 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (org.apache.struts2.dispatcher.mapper.ActionMapper)
[Server:sicem_node1_lx0005] 10:47:26,690 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (jakarta) for (org.apache.struts2.dispatcher.multipart.MultiPartRequest)
[Server:sicem_node1_lx0005] 10:47:26,690 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (org.apache.struts2.views.freemarker.FreemarkerManager)
[Server:sicem_node1_lx0005] 10:47:26,690 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (org.apache.struts2.views.velocity.VelocityManager)
[Server:sicem_node1_lx0005] 10:47:26,691 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (org.apache.struts2.components.UrlRenderer)
[Server:sicem_node1_lx0005] 10:47:26,691 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.validator.ActionValidatorManager)
[Server:sicem_node1_lx0005] 10:47:26,691 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.util.ValueStackFactory)
[Server:sicem_node1_lx0005] 10:47:26,691 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.util.reflection.ReflectionProvider)
[Server:sicem_node1_lx0005] 10:47:26,691 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.util.reflection.ReflectionContextFactory)
[Server:sicem_node1_lx0005] 10:47:26,692 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.util.PatternMatcher)
[Server:sicem_node1_lx0005] 10:47:26,693 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (org.apache.struts2.util.ContentTypeMatcher)
[Server:sicem_node1_lx0005] 10:47:26,696 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (org.apache.struts2.dispatcher.StaticContentLoader)
[Server:sicem_node1_lx0005] 10:47:26,701 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.UnknownHandlerManager)
[Server:sicem_node1_lx0005] 10:47:26,701 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (org.apache.struts2.views.util.UrlHelper)
[Server:sicem_node1_lx0005] 10:47:26,701 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.util.TextParser)
[Server:sicem_node1_lx0005] 10:47:26,701 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (org.apache.struts2.dispatcher.DispatcherErrorHandler)
[Server:sicem_node1_lx0005] 10:47:26,702 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.security.ExcludedPatternsChecker)
[Server:sicem_node1_lx0005] 10:47:26,702 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 76) Choosing bean (struts) for (com.opensymphony.xwork2.security.AcceptedPatternsChecker)
[Server:sicem_node1_lx0005] 10:47:26,703 INFO  [org.apache.struts2.config.DefaultBeanSelectionProvider] (ServerService Thread Pool -- 76) Loading global messages from [applicationResources]
[Server:sicem_node1_lx0005] 10:47:26,721 INFO  [org.apache.struts2.spring.StrutsSpringObjectFactory] (ServerService Thread Pool -- 76) Initializing Struts-Spring integration...
[Server:sicem_node1_lx0005] 10:47:26,727 INFO  [com.opensymphony.xwork2.spring.SpringObjectFactory] (ServerService Thread Pool -- 76) Setting autowire strategy to name
[Server:sicem_node1_lx0005] 10:47:26,727 INFO  [org.apache.struts2.spring.StrutsSpringObjectFactory] (ServerService Thread Pool -- 76) ... initialized Struts-Spring integration successfully
[Host Controller] 10:47:27,334 INFO  [org.jboss.as.domain.controller.mgmt] (Remoting "sbrdeapllx0005.desenvolvimento.extracaixa:MANAGEMENT" task-2) JBAS010920: Server [Server:sicve-anexo_node1_lx0011] registered using connection [Channel ID 75e9b4bc (inbound) of Remoting connection 41806c54 to /10.116.88.24:55024]
[Host Controller] 10:47:27,548 INFO  [org.jboss.as.host.controller] (server-registration-threads - 1) JBAS010919: Registering server sicve-anexo_node1_lx0011
[Host Controller] 10:47:27,649 INFO  [org.jboss.as] (Controller Boot Thread) JBAS015874: JBoss EAP 6.4.24.GA (AS 7.5.24.Final-redhat-00001) (Host Controller) started in 22184ms - Started 39 of 41 services (12 services are lazy, passive or on-demand)
[Server:sicem_node1_lx0005] 10:47:27,714 INFO  [org.jboss.as.server] (Controller Boot Thread) JBAS015859: Implantado "SICEM" (runtime-name: "SicemWEB_6.1.0.12.01.war")
[Server:sicem_node1_lx0005] 10:47:27,722 INFO  [org.jboss.as.server] (Controller Boot Thread) JBAS015859: Implantado "postgresql-9.1-901-1.jdbc4.jar" (runtime-name: "postgresql-9.1-901-1.jdbc4.jar")
[Server:sicem_node1_lx0005] 10:47:27,722 INFO  [org.jboss.as.server] (Controller Boot Thread) JBAS015859: Implantado "wmq.jmsra.rar" (runtime-name: "wmq.jmsra.rar")
[Server:sicem_node1_lx0005] 10:47:27,727 INFO  [org.jboss.as] (Controller Boot Thread) JBAS015874: JBoss EAP 6.4.24.GA (AS 7.5.24.Final-redhat-00001) iniciado em 14208ms - Iniciado 687 de serviços 788 (os serviços 131 são lazy, passivos ou em demanda)
[Server:sicve-anexo_node1_lx0011] 10:47:28,252 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 5) JBAS014627: Attribute 'path' in the resource at address '/subsystem=transactions' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[Server:sicve-anexo_node1_lx0011] 10:47:28,252 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 5) JBAS014627: Attribute 'relative-to' in the resource at address '/subsystem=transactions' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
-sh-4.1$
