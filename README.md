LOCAL: 
ESTEIRA do repositório SICBP-menudinamico-backend (DES) 

Link:  https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=533739&environmentId=2479605

Erro na execução da esteira ao fazer deploy conforme print em anexo.


2026-10-02T13:53:44.4402619Z ##[section]Starting: Verificando Status do Deployment
2026-10-02T13:53:44.4405846Z ==============================================================================
2026-10-02T13:53:44.4405936Z Task         : Bash
2026-10-02T13:53:44.4405979Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-02T13:53:44.4406042Z Version      : 3.227.0
2026-10-02T13:53:44.4406100Z Author       : Microsoft Corporation
2026-10-02T13:53:44.4406153Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-02T13:53:44.4406224Z ==============================================================================
2026-10-02T13:53:45.4170930Z Generating script.
2026-10-02T13:53:45.4181017Z ========================== Starting Command Output ===========================
2026-10-02T13:53:45.4191109Z [command]/bin/bash /opt/ads-agent/_work/_temp/b213cec8-45f7-4ff4-827f-12e0a4d0f516.sh
2026-10-02T13:53:45.6460790Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-10-02T13:59:51.9486689Z ##[error]The task has timed out.
2026-10-02T13:59:51.9487631Z ##[section]Finishing: Verificando Status do Deployment


2026-10-02T13:59:51.9511420Z ##[section]Starting: Logs da Aplicação
2026-10-02T13:59:51.9514892Z ==============================================================================
2026-10-02T13:59:51.9514982Z Task         : Bash
2026-10-02T13:59:51.9515026Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-02T13:59:51.9515144Z Version      : 3.227.0
2026-10-02T13:59:51.9515194Z Author       : Microsoft Corporation
2026-10-02T13:59:51.9515248Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-02T13:59:51.9515331Z ==============================================================================
2026-10-02T13:59:52.8303328Z Generating script.
2026-10-02T13:59:52.8313896Z ========================== Starting Command Output ===========================
2026-10-02T13:59:52.8321110Z [command]/bin/bash /opt/ads-agent/_work/_temp/24b06ea4-92af-4d77-819d-c18fb52355fe.sh
2026-10-02T13:59:52.8369508Z + shopt -s expand_aliases
2026-10-02T13:59:52.8370726Z + [[ -n okd4_nprd ]]
2026-10-02T13:59:52.8370908Z + [[ okd4_nprd =~ ocp ]]
2026-10-02T13:59:52.8375581Z + [[ -n okd4_nprd ]]
2026-10-02T13:59:52.8377603Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-10-02T13:59:52.8379679Z + app=sicbp-menudinamico-backend-des
2026-10-02T13:59:52.8381627Z + oc version
2026-10-02T13:59:52.9804804Z oc v3.11.0+0cbc58b
2026-10-02T13:59:52.9805305Z kubernetes v1.11.0+d4cacc0
2026-10-02T13:59:52.9806113Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-10-02T13:59:52.9886950Z 
2026-10-02T13:59:52.9909921Z Server https://api.nprd.caixa:6443
2026-10-02T13:59:52.9910228Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-10-02T13:59:52.9929943Z ++ oc get pod -l name=sicbp-menudinamico-backend-des -n sicbp-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-10-02T13:59:52.9930491Z ++ tac
2026-10-02T13:59:52.9931384Z ++ grep -v '^$'
2026-10-02T13:59:52.9942152Z ++ head -n1
2026-10-02T13:59:54.1941194Z + last_pod=sicbp-menudinamico-backend-des-153-vclvb
2026-10-02T13:59:54.1941681Z + echo 'Logs do POD: sicbp-menudinamico-backend-des-153-vclvb'
2026-10-02T13:59:54.1943583Z + oc logs sicbp-menudinamico-backend-des-153-vclvb -c sicbp-menudinamico-backend-des -n sicbp-des
2026-10-02T13:59:54.1944106Z Logs do POD: sicbp-menudinamico-backend-des-153-vclvb
2026-10-02T13:59:54.5201925Z exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sicbp-menudinamico-backend -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sicbp-menudinamico-backend -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/menudinamico.jar
2026-10-02T13:59:54.5202628Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-10-02T13:59:54.5202843Z WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.
2026-10-02T13:59:54.5203137Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-10-02T13:59:54.5203483Z 2026-10-02 10:58:49.407-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.4.13 started successfully (PID 8, JVM running for 6.893 s)
2026-10-02T13:59:54.5203857Z 2026-10-02 10:58:49.411-03:00 INFO  c.m.applicationinsights.agent - Java version: 17.0.7, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-17-openjdk-17.0.7.0.7-3.el8.x86_64
2026-10-02T13:59:54.5204311Z 2026-10-02 10:58:52.106-03:00 WARN  c.m.a.a.i.p.PerformanceMonitoringService - INITIALISING JFR PROFILING SUBSYSTEM THIS FEATURE IS IN BETA
2026-10-02T13:59:54.5204806Z 
2026-10-02T13:59:54.5204918Z   .   ____          _            __ _ _
2026-10-02T13:59:54.5205075Z  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
2026-10-02T13:59:54.5205332Z ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
2026-10-02T13:59:54.5205449Z  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
2026-10-02T13:59:54.5205606Z   '  |____| .__|_| |_|_| |_\__, | / / / /
2026-10-02T13:59:54.5205733Z  =========|_|==============|___/=/_/_/_/
2026-10-02T13:59:54.5205856Z  :: Spring Boot ::                (v2.7.7)
2026-10-02T13:59:54.5205907Z 
2026-10-02T13:59:54.5207251Z 2026-10-02 10:58:59,617 ERROR org.springframework.boot.web.embedded.tomcat.TomcatStarter : Error starting Tomcat context. Exception: org.springframework.beans.factory.UnsatisfiedDependencyException. Message: Error creating bean with name 'sanitizationFilterConfig' defined in URL [jar:file:/deployments/menudinamico.jar!/BOOT-INF/lib/SICBP-infra-componentes-2.16.0.1.jar!/br/gov/caixa/sicbp/infracomponentes/sanitizacao/config/SanitizationFilterConfig.class]: Unsatisfied dependency expressed through constructor parameter 0; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'sanitizationFilter' defined in URL [jar:file:/deployments/menudinamico.jar!/BOOT-INF/lib/SICBP-infra-componentes-2.16.0.1.jar!/br/gov/caixa/sicbp/infracomponentes/sanitizacao/filter/SanitizationFilter.class]: Unsatisfied dependency expressed through constructor parameter 1; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'trilhaAuditoriaService': Injection of autowired dependencies failed; nested exception is java.lang.IllegalArgumentException: Could not resolve placeholder 'API_TRILHA_URL' in value "${API_TRILHA_URL}"
2026-10-02T13:59:54.5208195Z 2026-10-02 10:59:00,201 ERROR org.springframework.boot.SpringApplication : Application run failed
2026-10-02T13:59:54.5208431Z org.springframework.context.ApplicationContextException: Unable to start web server; nested exception is org.springframework.boot.web.server.WebServerException: Unable to start embedded Tomcat
2026-10-02T13:59:54.5208710Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.onRefresh(ServletWebServerApplicationContext.java:165)
2026-10-02T13:59:54.5209236Z 	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:577)
2026-10-02T13:59:54.5209494Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:147)
2026-10-02T13:59:54.5209711Z 	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:731)
2026-10-02T13:59:54.5209903Z 	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:408)
2026-10-02T13:59:54.5210093Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:307)
2026-10-02T13:59:54.5210278Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1303)
2026-10-02T13:59:54.5210458Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1292)
2026-10-02T13:59:54.5210644Z 	at br.gov.caixa.sicbp.menudinamico.RunApplication.main(RunApplication.java:24)
2026-10-02T13:59:54.5210826Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-02T13:59:54.5215115Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-10-02T13:59:54.5215407Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-02T13:59:54.5215612Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-10-02T13:59:54.5215800Z 	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:49)
2026-10-02T13:59:54.5215989Z 	at org.springframework.boot.loader.Launcher.launch(Launcher.java:108)
2026-10-02T13:59:54.5216174Z 	at org.springframework.boot.loader.Launcher.launch(Launcher.java:58)
2026-10-02T13:59:54.5216554Z 	at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65)
2026-10-02T13:59:54.5216740Z Caused by: org.springframework.boot.web.server.WebServerException: Unable to start embedded Tomcat
2026-10-02T13:59:54.5217015Z 	at org.springframework.boot.web.embedded.tomcat.TomcatWebServer.initialize(TomcatWebServer.java:142)
2026-10-02T13:59:54.5231420Z 	at org.springframework.boot.web.embedded.tomcat.TomcatWebServer.<init>(TomcatWebServer.java:104)
2026-10-02T13:59:54.5231690Z 	at org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory.getTomcatWebServer(TomcatServletWebServerFactory.java:479)
2026-10-02T13:59:54.5231954Z 	at org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory.getWebServer(TomcatServletWebServerFactory.java:211)
2026-10-02T13:59:54.5232217Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.createWebServer(ServletWebServerApplicationContext.java:184)
2026-10-02T13:59:54.5232585Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.onRefresh(ServletWebServerApplicationContext.java:162)
2026-10-02T13:59:54.5232769Z 	... 16 common frames omitted
2026-10-02T13:59:54.5234426Z Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'sanitizationFilterConfig' defined in URL [jar:file:/deployments/menudinamico.jar!/BOOT-INF/lib/SICBP-infra-componentes-2.16.0.1.jar!/br/gov/caixa/sicbp/infracomponentes/sanitizacao/config/SanitizationFilterConfig.class]: Unsatisfied dependency expressed through constructor parameter 0; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'sanitizationFilter' defined in URL [jar:file:/deployments/menudinamico.jar!/BOOT-INF/lib/SICBP-infra-componentes-2.16.0.1.jar!/br/gov/caixa/sicbp/infracomponentes/sanitizacao/filter/SanitizationFilter.class]: Unsatisfied dependency expressed through constructor parameter 1; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'trilhaAuditoriaService': Injection of autowired dependencies failed; nested exception is java.lang.IllegalArgumentException: Could not resolve placeholder 'API_TRILHA_URL' in value "${API_TRILHA_URL}"
2026-10-02T13:59:54.5235638Z 	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:800)
2026-10-02T13:59:54.5236024Z 	at org.springframework.beans.factory.support.ConstructorResolver.autowireConstructor(ConstructorResolver.java:229)
2026-10-02T13:59:54.5236480Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.autowireConstructor(AbstractAutowireCapableBeanFactory.java:1372)
2026-10-02T13:59:54.5236938Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1222)
2026-10-02T13:59:54.5237435Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582)
2026-10-02T13:59:54.5237911Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
2026-10-02T13:59:54.5238363Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
2026-10-02T13:59:54.5238727Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
2026-10-02T13:59:54.5239057Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
2026-10-02T13:59:54.5239531Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
2026-10-02T13:59:54.5239879Z 	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:410)
2026-10-02T13:59:54.5240473Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1352)
2026-10-02T13:59:54.5240871Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1195)
2026-10-02T13:59:54.5241342Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582)
2026-10-02T13:59:54.5241687Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
2026-10-02T13:59:54.5241936Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
2026-10-02T13:59:54.5242175Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
2026-10-02T13:59:54.5242410Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
2026-10-02T13:59:54.5242629Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:213)
2026-10-02T13:59:54.5242931Z 	at org.springframework.boot.web.servlet.ServletContextInitializerBeans.getOrderedBeansOfType(ServletContextInitializerBeans.java:212)
2026-10-02T13:59:54.5243290Z 	at org.springframework.boot.web.servlet.ServletContextInitializerBeans.getOrderedBeansOfType(ServletContextInitializerBeans.java:203)
2026-10-02T13:59:54.5243679Z 	at org.springframework.boot.web.servlet.ServletContextInitializerBeans.addServletContextInitializerBeans(ServletContextInitializerBeans.java:97)
2026-10-02T13:59:54.5244023Z 	at org.springframework.boot.web.servlet.ServletContextInitializerBeans.<init>(ServletContextInitializerBeans.java:86)
2026-10-02T13:59:54.5244423Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.getServletContextInitializerBeans(ServletWebServerApplicationContext.java:262)
2026-10-02T13:59:54.5244827Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.selfInitialize(ServletWebServerApplicationContext.java:236)
2026-10-02T13:59:54.5245183Z 	at org.springframework.boot.web.embedded.tomcat.TomcatStarter.onStartup(TomcatStarter.java:53)
2026-10-02T13:59:54.5245450Z 	at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:5211)
2026-10-02T13:59:54.5245643Z 	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
2026-10-02T13:59:54.5245823Z 	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1393)
2026-10-02T13:59:54.5246019Z 	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1383)
2026-10-02T13:59:54.5246197Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-10-02T13:59:54.5246387Z 	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75)
2026-10-02T13:59:54.5246599Z 	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:145)
2026-10-02T13:59:54.5246794Z 	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:916)
2026-10-02T13:59:54.5246985Z 	at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:835)
2026-10-02T13:59:54.5247166Z 	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
2026-10-02T13:59:54.5247352Z 	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1393)
2026-10-02T13:59:54.5247543Z 	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1383)
2026-10-02T13:59:54.5247720Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-10-02T13:59:54.5247907Z 	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75)
2026-10-02T13:59:54.5248113Z 	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:145)
2026-10-02T13:59:54.5248427Z 	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:916)
2026-10-02T13:59:54.5248620Z 	at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:265)
2026-10-02T13:59:54.5248874Z 	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
2026-10-02T13:59:54.5249064Z 	at org.apache.catalina.core.StandardService.startInternal(StandardService.java:430)
2026-10-02T13:59:54.5249368Z 	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
2026-10-02T13:59:54.5249614Z 	at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:930)
2026-10-02T13:59:54.5249890Z 	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
2026-10-02T13:59:54.5250179Z 	at org.apache.catalina.startup.Tomcat.start(Tomcat.java:486)
2026-10-02T13:59:54.5250463Z 	at org.springframework.boot.web.embedded.tomcat.TomcatWebServer.initialize(TomcatWebServer.java:123)
2026-10-02T13:59:54.5250769Z 	... 21 common frames omitted
2026-10-02T13:59:54.5251995Z Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'sanitizationFilter' defined in URL [jar:file:/deployments/menudinamico.jar!/BOOT-INF/lib/SICBP-infra-componentes-2.16.0.1.jar!/br/gov/caixa/sicbp/infracomponentes/sanitizacao/filter/SanitizationFilter.class]: Unsatisfied dependency expressed through constructor parameter 1; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'trilhaAuditoriaService': Injection of autowired dependencies failed; nested exception is java.lang.IllegalArgumentException: Could not resolve placeholder 'API_TRILHA_URL' in value "${API_TRILHA_URL}"
2026-10-02T13:59:54.5252857Z 	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:800)
2026-10-02T13:59:54.5253203Z 	at org.springframework.beans.factory.support.ConstructorResolver.autowireConstructor(ConstructorResolver.java:229)
2026-10-02T13:59:54.5253462Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.autowireConstructor(AbstractAutowireCapableBeanFactory.java:1372)
2026-10-02T13:59:54.5253730Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1222)
2026-10-02T13:59:54.5253991Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582)
2026-10-02T13:59:54.5254247Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
2026-10-02T13:59:54.5254485Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
2026-10-02T13:59:54.5254816Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
2026-10-02T13:59:54.5255189Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
2026-10-02T13:59:54.5255525Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
2026-10-02T13:59:54.5255870Z 	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276)
2026-10-02T13:59:54.5256109Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1391)
2026-10-02T13:59:54.5256352Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311)
2026-10-02T13:59:54.5256586Z 	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:887)
2026-10-02T13:59:54.5256812Z 	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791)
2026-10-02T13:59:54.5256977Z 	... 70 common frames omitted
2026-10-02T13:59:54.5257526Z Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'trilhaAuditoriaService': Injection of autowired dependencies failed; nested exception is java.lang.IllegalArgumentException: Could not resolve placeholder 'API_TRILHA_URL' in value "${API_TRILHA_URL}"
2026-10-02T13:59:54.5257907Z 	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessProperties(AutowiredAnnotationBeanPostProcessor.java:405)
2026-10-02T13:59:54.5258176Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1431)
2026-10-02T13:59:54.5258435Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:619)
2026-10-02T13:59:54.5258708Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
2026-10-02T13:59:54.5261198Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
2026-10-02T13:59:54.5261648Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
2026-10-02T13:59:54.5262177Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
2026-10-02T13:59:54.5262758Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
2026-10-02T13:59:54.5263146Z 	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276)
2026-10-02T13:59:54.5263409Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1391)
2026-10-02T13:59:54.5263671Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311)
2026-10-02T13:59:54.5263940Z 	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:887)
2026-10-02T13:59:54.5264184Z 	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791)
2026-10-02T13:59:54.5264356Z 	... 84 common frames omitted
2026-10-02T13:59:54.5264665Z Caused by: java.lang.IllegalArgumentException: Could not resolve placeholder 'API_TRILHA_URL' in value "${API_TRILHA_URL}"
2026-10-02T13:59:54.5264886Z 	at org.springframework.util.PropertyPlaceholderHelper.parseStringValue(PropertyPlaceholderHelper.java:180)
2026-10-02T13:59:54.5265114Z 	at org.springframework.util.PropertyPlaceholderHelper.replacePlaceholders(PropertyPlaceholderHelper.java:126)
2026-10-02T13:59:54.5265334Z 	at org.springframework.core.env.AbstractPropertyResolver.doResolvePlaceholders(AbstractPropertyResolver.java:239)
2026-10-02T13:59:54.5267986Z 	at org.springframework.core.env.AbstractPropertyResolver.resolveRequiredPlaceholders(AbstractPropertyResolver.java:210)
2026-10-02T13:59:54.5268320Z 	at org.springframework.core.env.AbstractPropertyResolver.resolveNestedPlaceholders(AbstractPropertyResolver.java:230)
2026-10-02T13:59:54.5268603Z 	at org.springframework.boot.context.properties.source.ConfigurationPropertySourcesPropertyResolver.getProperty(ConfigurationPropertySourcesPropertyResolver.java:79)
2026-10-02T13:59:54.5268918Z 	at org.springframework.boot.context.properties.source.ConfigurationPropertySourcesPropertyResolver.getProperty(ConfigurationPropertySourcesPropertyResolver.java:60)
2026-10-02T13:59:54.5269250Z 	at org.springframework.core.env.AbstractEnvironment.getProperty(AbstractEnvironment.java:594)
2026-10-02T13:59:54.5269491Z 	at org.springframework.context.support.PropertySourcesPlaceholderConfigurer$1.getProperty(PropertySourcesPlaceholderConfigurer.java:153)
2026-10-02T13:59:54.5269748Z 	at org.springframework.context.support.PropertySourcesPlaceholderConfigurer$1.getProperty(PropertySourcesPlaceholderConfigurer.java:149)
2026-10-02T13:59:54.5270093Z 	at org.springframework.core.env.PropertySourcesPropertyResolver.getProperty(PropertySourcesPropertyResolver.java:85)
2026-10-02T13:59:54.5270336Z 	at org.springframework.core.env.PropertySourcesPropertyResolver.getPropertyAsRawString(PropertySourcesPropertyResolver.java:74)
2026-10-02T13:59:54.5270643Z 	at org.springframework.util.PropertyPlaceholderHelper.parseStringValue(PropertyPlaceholderHelper.java:159)
2026-10-02T13:59:54.5270873Z 	at org.springframework.util.PropertyPlaceholderHelper.replacePlaceholders(PropertyPlaceholderHelper.java:126)
2026-10-02T13:59:54.5271098Z 	at org.springframework.core.env.AbstractPropertyResolver.doResolvePlaceholders(AbstractPropertyResolver.java:239)
2026-10-02T13:59:54.5271331Z 	at org.springframework.core.env.AbstractPropertyResolver.resolveRequiredPlaceholders(AbstractPropertyResolver.java:210)
2026-10-02T13:59:54.5271576Z 	at org.springframework.context.support.PropertySourcesPlaceholderConfigurer.lambda$processProperties$0(PropertySourcesPlaceholderConfigurer.java:191)
2026-10-02T13:59:54.5271831Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.resolveEmbeddedValue(AbstractBeanFactory.java:936)
2026-10-02T13:59:54.5272074Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1332)
2026-10-02T13:59:54.5272324Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311)
2026-10-02T13:59:54.5272639Z 	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredMethodElement.resolveMethodArguments(AutowiredAnnotationBeanPostProcessor.java:760)
2026-10-02T13:59:54.5272935Z 	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredMethodElement.inject(AutowiredAnnotationBeanPostProcessor.java:720)
2026-10-02T13:59:54.5275264Z 	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:119)
2026-10-02T13:59:54.5275547Z 	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessProperties(AutowiredAnnotationBeanPostProcessor.java:399)
2026-10-02T13:59:54.5275754Z 	... 96 common frames omitted
2026-10-02T13:59:54.5302881Z ##[section]Finishing: Logs da Aplicação
