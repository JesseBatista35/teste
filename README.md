2026-09-23T13:25:36.0874233Z ##[section]Starting: Logs da Aplicação
2026-09-23T13:25:36.0877287Z ==============================================================================
2026-09-23T13:25:36.0877363Z Task         : Bash
2026-09-23T13:25:36.0877414Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-23T13:25:36.0877471Z Version      : 3.227.0
2026-09-23T13:25:36.0877511Z Author       : Microsoft Corporation
2026-09-23T13:25:36.0877556Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-23T13:25:36.0877682Z ==============================================================================
2026-09-23T13:25:37.0527919Z Generating script.
2026-09-23T13:25:37.0538233Z ========================== Starting Command Output ===========================
2026-09-23T13:25:37.0547112Z [command]/bin/bash /opt/ads-agent/_work/_temp/be33a80d-f6ba-47dc-a847-853e36f881d0.sh
2026-09-23T13:25:37.0589921Z + shopt -s expand_aliases
2026-09-23T13:25:37.0598935Z + [[ -n okd4_nprd ]]
2026-09-23T13:25:37.0599140Z + [[ okd4_nprd =~ ocp ]]
2026-09-23T13:25:37.0599262Z + [[ -n okd4_nprd ]]
2026-09-23T13:25:37.0599365Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-09-23T13:25:37.0600993Z + app=sipnc-manutseletjudicialpj-backend-tqs
2026-09-23T13:25:37.0602451Z + oc version
2026-09-23T13:25:37.1498727Z Client Version: 4.20.0-202605260442.p2.g02b0b2d.assembly.stream.el9-02b0b2d
2026-09-23T13:25:37.1498975Z Kustomize Version: v5.6.0
2026-09-23T13:25:37.1499143Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-09-23T13:25:37.1499340Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-09-23T13:25:37.1526169Z ++ oc get pod -l name=sipnc-manutseletjudicialpj-backend-tqs -n sipnc-tqs -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-23T13:25:37.1530651Z ++ tac
2026-09-23T13:25:37.1531141Z ++ grep -v '^$'
2026-09-23T13:25:37.1531409Z ++ head -n1
2026-09-23T13:25:37.2657568Z + last_pod=sipnc-manutseletjudicialpj-backend-tqs-1-9t47v
2026-09-23T13:25:37.2659480Z + echo 'Logs do POD: sipnc-manutseletjudicialpj-backend-tqs-1-9t47v'
2026-09-23T13:25:37.2659919Z + oc logs sipnc-manutseletjudicialpj-backend-tqs-1-9t47v -c sipnc-manutseletjudicialpj-backend-tqs -n sipnc-tqs
2026-09-23T13:25:37.2660284Z Logs do POD: sipnc-manutseletjudicialpj-backend-tqs-1-9t47v
2026-09-23T13:25:37.3637624Z exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-azure2024.jks -Xms512m -Xmx512m -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sipnc-manutseletjudicialpj-backend -Delastic.apm.environment=tqs -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sipnc-manutseletjudicialpj-backend -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/SIPNC-manutseletjudicialpj-backend.jar
2026-09-23T13:25:37.3638838Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-23T13:25:37.3639035Z WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.
2026-09-23T13:25:37.3639303Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-23T13:25:37.3639552Z 2026-09-23 10:24:04.247-03:00 ERROR c.m.applicationinsights.agent - 
2026-09-23T13:25:37.3639674Z *************************
2026-09-23T13:25:37.3639800Z Application Insights Java Agent 3.4.13 startup failed (PID 8)
2026-09-23T13:25:37.3639919Z *************************
2026-09-23T13:25:37.3639960Z 
2026-09-23T13:25:37.3640048Z Description:
2026-09-23T13:25:37.3640146Z No connection string provided
2026-09-23T13:25:37.3643570Z 
2026-09-23T13:25:37.3643879Z Action:
2026-09-23T13:25:37.3643989Z Please provide connection string.
2026-09-23T13:25:37.3644040Z 
2026-09-23T13:25:37.3644783Z 
2026-09-23T13:25:37.3645119Z   .   ____          _            __ _ _
2026-09-23T13:25:37.3645656Z  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
2026-09-23T13:25:37.3645881Z ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
2026-09-23T13:25:37.3646037Z  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
2026-09-23T13:25:37.3646276Z   '  |____| .__|_| |_|_| |_\__, | / / / /
2026-09-23T13:25:37.3646451Z  =========|_|==============|___/=/_/_/_/
2026-09-23T13:25:37.3646644Z  :: Spring Boot ::                (v2.7.7)
2026-09-23T13:25:37.3646722Z 
2026-09-23T13:25:37.3647299Z 2026-09-23 10:24:06.852  INFO 8 --- [           main] b.g.c.s.m.RunApplication                 : Starting RunApplication v1.4.0.2 using Java 17.0.7 on sipnc-manutseletjudicialpj-backend-tqs-1-9t47v with PID 8 (/deployments/SIPNC-manutseletjudicialpj-backend.jar started by 1001 in /deployments)
2026-09-23T13:25:37.3647924Z 2026-09-23 10:24:06.858  INFO 8 --- [           main] b.g.c.s.m.RunApplication                 : The following 1 profile is active: "${SPRING_PROFILES_ACTIVE}"
2026-09-23T13:25:37.3648500Z 2026-09-23 10:24:10.333  INFO 8 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=3f730b72-9878-3e61-a1ef-ac9948a0c252
2026-09-23T13:25:37.3648940Z 2026-09-23 10:24:11.837  INFO 8 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2026-09-23T13:25:37.3649460Z 2026-09-23 10:24:11.846  INFO 8 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-09-23T13:25:37.3649905Z 2026-09-23 10:24:11.846  INFO 8 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.70]
2026-09-23T13:25:37.3650354Z 2026-09-23 10:24:12.035  INFO 8 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-09-23T13:25:37.3650822Z 2026-09-23 10:24:12.035  INFO 8 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 5013 ms
2026-09-23T13:25:37.3651701Z 2026-09-23 10:24:12.653 ERROR 8 --- [           main] o.s.b.web.embedded.tomcat.TomcatStarter  : Error starting Tomcat context. Exception: org.springframework.beans.factory.BeanCreationException. Message: Error creating bean with name 'apiSecurityFilter': Injection of autowired dependencies failed; nested exception is java.lang.IllegalArgumentException: Could not resolve placeholder 'SPRING_PROFILES_ACTIVE' in value "${SPRING_PROFILES_ACTIVE}"
2026-09-23T13:25:37.3652347Z 2026-09-23 10:24:12.735  INFO 8 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2026-09-23T13:25:37.3653134Z 2026-09-23 10:24:12.746  WARN 8 --- [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.context.ApplicationContextException: Unable to start web server; nested exception is org.springframework.boot.web.server.WebServerException: Unable to start embedded Tomcat
2026-09-23T13:25:37.3653691Z 2026-09-23 10:24:12.814  INFO 8 --- [           main] ConditionEvaluationReportLoggingListener : 
2026-09-23T13:25:37.3653819Z 
2026-09-23T13:25:37.3654130Z Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2026-09-23T13:25:37.3654523Z 2026-09-23 10:24:12.837 ERROR 8 --- [           main] o.s.boot.SpringApplication               : Application run failed
2026-09-23T13:25:37.3654644Z 
2026-09-23T13:25:37.3654918Z org.springframework.context.ApplicationContextException: Unable to start web server; nested exception is org.springframework.boot.web.server.WebServerException: Unable to start embedded Tomcat
2026-09-23T13:25:37.3655494Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.onRefresh(ServletWebServerApplicationContext.java:165) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-23T13:25:37.3655946Z 	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:577) ~[spring-context-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3656360Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:147) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-23T13:25:37.3656678Z 	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:731) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-23T13:25:37.3656976Z 	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:408) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-23T13:25:37.3657263Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:307) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-23T13:25:37.3657535Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1303) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-23T13:25:37.3657803Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1292) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-23T13:25:37.3658065Z 	at br.gov.caixa.sipnc.manutseletjudicialpj.RunApplication.main(RunApplication.java:29) ~[classes!/:1.4.0.2]
2026-09-23T13:25:37.3658277Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
2026-09-23T13:25:37.3658469Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
2026-09-23T13:25:37.3658667Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
2026-09-23T13:25:37.3658858Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
2026-09-23T13:25:37.3659158Z 	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:49) ~[SIPNC-manutseletjudicialpj-backend.jar:1.4.0.2]
2026-09-23T13:25:37.3659475Z 	at org.springframework.boot.loader.Launcher.launch(Launcher.java:108) ~[SIPNC-manutseletjudicialpj-backend.jar:1.4.0.2]
2026-09-23T13:25:37.3659772Z 	at org.springframework.boot.loader.Launcher.launch(Launcher.java:58) ~[SIPNC-manutseletjudicialpj-backend.jar:1.4.0.2]
2026-09-23T13:25:37.3660085Z 	at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65) ~[SIPNC-manutseletjudicialpj-backend.jar:1.4.0.2]
2026-09-23T13:25:37.3660278Z Caused by: org.springframework.boot.web.server.WebServerException: Unable to start embedded Tomcat
2026-09-23T13:25:37.3660571Z 	at org.springframework.boot.web.embedded.tomcat.TomcatWebServer.initialize(TomcatWebServer.java:142) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-23T13:25:37.3660892Z 	at org.springframework.boot.web.embedded.tomcat.TomcatWebServer.<init>(TomcatWebServer.java:104) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-23T13:25:37.3661289Z 	at org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory.getTomcatWebServer(TomcatServletWebServerFactory.java:479) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-23T13:25:37.3661667Z 	at org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory.getWebServer(TomcatServletWebServerFactory.java:211) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-23T13:25:37.3662063Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.createWebServer(ServletWebServerApplicationContext.java:184) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-23T13:25:37.3662447Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.onRefresh(ServletWebServerApplicationContext.java:162) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-23T13:25:37.3662629Z 	... 16 common frames omitted
2026-09-23T13:25:37.3663042Z Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'apiSecurityFilter': Injection of autowired dependencies failed; nested exception is java.lang.IllegalArgumentException: Could not resolve placeholder 'SPRING_PROFILES_ACTIVE' in value "${SPRING_PROFILES_ACTIVE}"
2026-09-23T13:25:37.3663498Z 	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessProperties(AutowiredAnnotationBeanPostProcessor.java:405) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3663949Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1431) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3664345Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:619) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3664741Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3665103Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3665470Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3665818Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3666343Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:213) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3666865Z 	at org.springframework.boot.web.servlet.ServletContextInitializerBeans.getOrderedBeansOfType(ServletContextInitializerBeans.java:212) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-23T13:25:37.3667235Z 	at org.springframework.boot.web.servlet.ServletContextInitializerBeans.addAsRegistrationBean(ServletContextInitializerBeans.java:175) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-23T13:25:37.3667611Z 	at org.springframework.boot.web.servlet.ServletContextInitializerBeans.addAsRegistrationBean(ServletContextInitializerBeans.java:170) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-23T13:25:37.3667980Z 	at org.springframework.boot.web.servlet.ServletContextInitializerBeans.addAdaptableBeans(ServletContextInitializerBeans.java:155) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-23T13:25:37.3668408Z 	at org.springframework.boot.web.servlet.ServletContextInitializerBeans.<init>(ServletContextInitializerBeans.java:87) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-23T13:25:37.3668820Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.getServletContextInitializerBeans(ServletWebServerApplicationContext.java:262) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-23T13:25:37.3669223Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.selfInitialize(ServletWebServerApplicationContext.java:236) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-23T13:25:37.3669602Z 	at org.springframework.boot.web.embedded.tomcat.TomcatStarter.onStartup(TomcatStarter.java:53) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-23T13:25:37.3669972Z 	at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:5211) ~[tomcat-embed-core-9.0.70.jar!/:na]
2026-09-23T13:25:37.3670277Z 	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183) ~[tomcat-embed-core-9.0.70.jar!/:na]
2026-09-23T13:25:37.3670569Z 	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1393) ~[tomcat-embed-core-9.0.70.jar!/:na]
2026-09-23T13:25:37.3670875Z 	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1383) ~[tomcat-embed-core-9.0.70.jar!/:na]
2026-09-23T13:25:37.3671070Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264) ~[na:na]
2026-09-23T13:25:37.3671367Z 	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75) ~[tomcat-embed-core-9.0.70.jar!/:na]
2026-09-23T13:25:37.3671584Z 	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:145) ~[na:na]
2026-09-23T13:25:37.3671866Z 	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:916) ~[tomcat-embed-core-9.0.70.jar!/:na]
2026-09-23T13:25:37.3672189Z 	at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:835) ~[tomcat-embed-core-9.0.70.jar!/:na]
2026-09-23T13:25:37.3672509Z 	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183) ~[tomcat-embed-core-9.0.70.jar!/:na]
2026-09-23T13:25:37.3672845Z 	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1393) ~[tomcat-embed-core-9.0.70.jar!/:na]
2026-09-23T13:25:37.3673139Z 	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1383) ~[tomcat-embed-core-9.0.70.jar!/:na]
2026-09-23T13:25:37.3673324Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264) ~[na:na]
2026-09-23T13:25:37.3673618Z 	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75) ~[tomcat-embed-core-9.0.70.jar!/:na]
2026-09-23T13:25:37.3673833Z 	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:145) ~[na:na]
2026-09-23T13:25:37.3674144Z 	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:916) ~[tomcat-embed-core-9.0.70.jar!/:na]
2026-09-23T13:25:37.3674440Z 	at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:265) ~[tomcat-embed-core-9.0.70.jar!/:na]
2026-09-23T13:25:37.3674715Z 	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183) ~[tomcat-embed-core-9.0.70.jar!/:na]
2026-09-23T13:25:37.3675005Z 	at org.apache.catalina.core.StandardService.startInternal(StandardService.java:430) ~[tomcat-embed-core-9.0.70.jar!/:na]
2026-09-23T13:25:37.3675287Z 	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183) ~[tomcat-embed-core-9.0.70.jar!/:na]
2026-09-23T13:25:37.3675604Z 	at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:930) ~[tomcat-embed-core-9.0.70.jar!/:na]
2026-09-23T13:25:37.3675971Z 	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183) ~[tomcat-embed-core-9.0.70.jar!/:na]
2026-09-23T13:25:37.3676238Z 	at org.apache.catalina.startup.Tomcat.start(Tomcat.java:486) ~[tomcat-embed-core-9.0.70.jar!/:na]
2026-09-23T13:25:37.3676551Z 	at org.springframework.boot.web.embedded.tomcat.TomcatWebServer.initialize(TomcatWebServer.java:123) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-23T13:25:37.3676712Z 	... 21 common frames omitted
2026-09-23T13:25:37.3676952Z Caused by: java.lang.IllegalArgumentException: Could not resolve placeholder 'SPRING_PROFILES_ACTIVE' in value "${SPRING_PROFILES_ACTIVE}"
2026-09-23T13:25:37.3677271Z 	at org.springframework.util.PropertyPlaceholderHelper.parseStringValue(PropertyPlaceholderHelper.java:180) ~[spring-core-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3677650Z 	at org.springframework.util.PropertyPlaceholderHelper.replacePlaceholders(PropertyPlaceholderHelper.java:126) ~[spring-core-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3678055Z 	at org.springframework.core.env.AbstractPropertyResolver.doResolvePlaceholders(AbstractPropertyResolver.java:239) ~[spring-core-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3678432Z 	at org.springframework.core.env.AbstractPropertyResolver.resolveRequiredPlaceholders(AbstractPropertyResolver.java:210) ~[spring-core-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3678780Z 	at org.springframework.core.env.AbstractPropertyResolver.resolveNestedPlaceholders(AbstractPropertyResolver.java:230) ~[spring-core-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3679188Z 	at org.springframework.boot.context.properties.source.ConfigurationPropertySourcesPropertyResolver.getProperty(ConfigurationPropertySourcesPropertyResolver.java:79) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-23T13:25:37.3679620Z 	at org.springframework.boot.context.properties.source.ConfigurationPropertySourcesPropertyResolver.getProperty(ConfigurationPropertySourcesPropertyResolver.java:60) ~[spring-boot-2.7.7.jar!/:2.7.7]
2026-09-23T13:25:37.3679974Z 	at org.springframework.core.env.AbstractEnvironment.getProperty(AbstractEnvironment.java:594) ~[spring-core-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3680338Z 	at org.springframework.context.support.PropertySourcesPlaceholderConfigurer$1.getProperty(PropertySourcesPlaceholderConfigurer.java:153) ~[spring-context-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3680751Z 	at org.springframework.context.support.PropertySourcesPlaceholderConfigurer$1.getProperty(PropertySourcesPlaceholderConfigurer.java:149) ~[spring-context-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3681113Z 	at org.springframework.core.env.PropertySourcesPropertyResolver.getProperty(PropertySourcesPropertyResolver.java:85) ~[spring-core-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3681474Z 	at org.springframework.core.env.PropertySourcesPropertyResolver.getPropertyAsRawString(PropertySourcesPropertyResolver.java:74) ~[spring-core-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3681821Z 	at org.springframework.util.PropertyPlaceholderHelper.parseStringValue(PropertyPlaceholderHelper.java:159) ~[spring-core-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3682159Z 	at org.springframework.util.PropertyPlaceholderHelper.replacePlaceholders(PropertyPlaceholderHelper.java:126) ~[spring-core-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3682494Z 	at org.springframework.core.env.AbstractPropertyResolver.doResolvePlaceholders(AbstractPropertyResolver.java:239) ~[spring-core-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3682844Z 	at org.springframework.core.env.AbstractPropertyResolver.resolveRequiredPlaceholders(AbstractPropertyResolver.java:210) ~[spring-core-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3683261Z 	at org.springframework.context.support.PropertySourcesPlaceholderConfigurer.lambda$processProperties$0(PropertySourcesPlaceholderConfigurer.java:191) ~[spring-context-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3683636Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.resolveEmbeddedValue(AbstractBeanFactory.java:936) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3684014Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1332) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3684390Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3684822Z 	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.resolveFieldValue(AutowiredAnnotationBeanPostProcessor.java:657) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3685256Z 	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:640) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3685642Z 	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:119) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3686023Z 	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessProperties(AutowiredAnnotationBeanPostProcessor.java:399) ~[spring-beans-5.3.24.jar!/:5.3.24]
2026-09-23T13:25:37.3686214Z 	... 60 common frames omitted
2026-09-23T13:25:37.3686258Z 
2026-09-23T13:25:37.3717354Z ##[section]Finishing: Logs da Aplicação
