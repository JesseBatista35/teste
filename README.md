Solicito verificar erro na pipeline do SIJUR-middleware-backend-v2.

https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-pipeline-progress&releaseId=532811


2026-09-25T11:12:44.9906243Z ##[section]Starting: Verificando Status do Deployment
2026-09-25T11:12:44.9909299Z ==============================================================================
2026-09-25T11:12:44.9909384Z Task         : Bash
2026-09-25T11:12:44.9909425Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-25T11:12:44.9909482Z Version      : 3.227.0
2026-09-25T11:12:44.9909530Z Author       : Microsoft Corporation
2026-09-25T11:12:44.9909577Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-25T11:12:44.9909735Z ==============================================================================
2026-09-25T11:12:45.9015258Z Generating script.
2026-09-25T11:12:45.9034561Z ========================== Starting Command Output ===========================
2026-09-25T11:12:45.9049369Z [command]/bin/bash /opt/ads-agent/_work/_temp/84359742-be8b-44d1-9f69-6a3df07350bc.sh
2026-09-25T11:12:46.1309979Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-09-25T11:18:52.4995461Z ##[error]The task has timed out.
2026-09-25T11:18:52.4996485Z ##[section]Finishing: Verificando Status do Deployment


2026-09-25T11:18:52.5015622Z ##[section]Starting: Logs da Aplicação
2026-09-25T11:18:52.5019389Z ==============================================================================
2026-09-25T11:18:52.5019480Z Task         : Bash
2026-09-25T11:18:52.5019519Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-25T11:18:52.5019578Z Version      : 3.227.0
2026-09-25T11:18:52.5019643Z Author       : Microsoft Corporation
2026-09-25T11:18:52.5019691Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-25T11:18:52.5019757Z ==============================================================================
2026-09-25T11:18:53.5378187Z Generating script.
2026-09-25T11:18:53.5388546Z ========================== Starting Command Output ===========================
2026-09-25T11:18:53.5395863Z [command]/bin/bash /opt/ads-agent/_work/_temp/9fa41a95-9bdc-4503-944e-a97acc48a1ea.sh
2026-09-25T11:18:53.5449902Z + shopt -s expand_aliases
2026-09-25T11:18:53.5450068Z + [[ -n okd4_nprd ]]
2026-09-25T11:18:53.5450427Z + [[ okd4_nprd =~ ocp ]]
2026-09-25T11:18:53.5450555Z + [[ -n okd4_nprd ]]
2026-09-25T11:18:53.5450663Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-09-25T11:18:53.5450823Z + app=sijur-middleware-backend-v2-des
2026-09-25T11:18:53.5450929Z + oc version
2026-09-25T11:18:53.6886064Z oc v3.11.0+0cbc58b
2026-09-25T11:18:53.6886796Z kubernetes v1.11.0+d4cacc0
2026-09-25T11:18:53.6887139Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-09-25T11:18:53.6996563Z 
2026-09-25T11:18:53.6997075Z Server https://api.nprd.caixa:6443
2026-09-25T11:18:53.6997338Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-09-25T11:18:53.7033149Z ++ oc get pod -l name=sijur-middleware-backend-v2-des -n sijur-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-25T11:18:53.7039925Z ++ tac
2026-09-25T11:18:53.7042623Z ++ head -n1
2026-09-25T11:18:53.7042879Z ++ grep -v '^$'
2026-09-25T11:18:53.9735862Z + last_pod=sijur-middleware-backend-v2-des-34-shvkx
2026-09-25T11:18:53.9736204Z + echo 'Logs do POD: sijur-middleware-backend-v2-des-34-shvkx'
2026-09-25T11:18:53.9736472Z + oc logs sijur-middleware-backend-v2-des-34-shvkx -c sijur-middleware-backend-v2-des -n sijur-des
2026-09-25T11:18:53.9736804Z Logs do POD: sijur-middleware-backend-v2-des-34-shvkx
2026-09-25T11:18:54.3123093Z exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Djavax.net.ssl.trustStore=/deployments/sijur-des-okd4-keystore-202608.jks -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sijur-middleware-backend-v2 -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sijur-middleware-backend-v2 -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/SIJUR-middleware-backend-v2.jar
2026-09-25T11:18:54.3124005Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-25T11:18:54.3124917Z WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.
2026-09-25T11:18:54.3125181Z Failed to start agent
2026-09-25T11:18:54.3125309Z java.lang.reflect.InvocationTargetException
2026-09-25T11:18:54.3125493Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:118)
2026-09-25T11:18:54.3126436Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-25T11:18:54.3126641Z 	at co.elastic.apm.agent.premain.AgentMain.loadAndInitializeAgent(AgentMain.java:155)
2026-09-25T11:18:54.3126808Z 	at co.elastic.apm.agent.premain.AgentMain.init(AgentMain.java:100)
2026-09-25T11:18:54.3126973Z 	at co.elastic.apm.agent.premain.AgentMain.premain(AgentMain.java:56)
2026-09-25T11:18:54.3127200Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-25T11:18:54.3127387Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-25T11:18:54.3127712Z 	at java.instrument/sun.instrument.InstrumentationImpl.loadClassAndStartAgent(InstrumentationImpl.java:560)
2026-09-25T11:18:54.3127913Z 	at java.instrument/sun.instrument.InstrumentationImpl.loadClassAndCallPremain(InstrumentationImpl.java:572)
2026-09-25T11:18:54.3128164Z Caused by: java.lang.RuntimeException: java.lang.UnsupportedOperationException: Could not access Unsafe class: sun.misc.Unsafe.defineClass(java.lang.String,[B,int,int,java.lang.ClassLoader,java.security.ProtectionDomain)
2026-09-25T11:18:54.3128397Z 	at co.elastic.apm.agent.bci.IndyBootstrap.getIndyBootstrapMethod(IndyBootstrap.java:221)
2026-09-25T11:18:54.3128580Z 	at co.elastic.apm.agent.bci.ElasticApmAgent.getTransformer(ElasticApmAgent.java:436)
2026-09-25T11:18:54.3128759Z 	at co.elastic.apm.agent.bci.ElasticApmAgent.applyAdvice(ElasticApmAgent.java:398)
2026-09-25T11:18:54.3128931Z 	at co.elastic.apm.agent.bci.ElasticApmAgent.initAgentBuilder(ElasticApmAgent.java:321)
2026-09-25T11:18:54.3129315Z 	at co.elastic.apm.agent.bci.ElasticApmAgent.initInstrumentation(ElasticApmAgent.java:267)
2026-09-25T11:18:54.3129513Z 	at co.elastic.apm.agent.bci.ElasticApmAgent.initInstrumentation(ElasticApmAgent.java:171)
2026-09-25T11:18:54.3129690Z 	at co.elastic.apm.agent.bci.ElasticApmAgent.initialize(ElasticApmAgent.java:157)
2026-09-25T11:18:54.3129881Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-25T11:18:54.3130017Z 	... 8 more
2026-09-25T11:18:54.3130197Z Caused by: java.lang.UnsupportedOperationException: Could not access Unsafe class: sun.misc.Unsafe.defineClass(java.lang.String,[B,int,int,java.lang.ClassLoader,java.security.ProtectionDomain)
2026-09-25T11:18:54.3130455Z 	at co.elastic.apm.agent.shaded.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Unavailable.initialize(ClassInjector.java:2133)
2026-09-25T11:18:54.3130689Z 	at co.elastic.apm.agent.shaded.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe.injectRaw(ClassInjector.java:1865)
2026-09-25T11:18:54.3130891Z 	at co.elastic.apm.agent.bci.IndyBootstrap.initIndyBootstrap(IndyBootstrap.java:234)
2026-09-25T11:18:54.3131062Z 	at co.elastic.apm.agent.bci.IndyBootstrap.getIndyBootstrapMethod(IndyBootstrap.java:215)
2026-09-25T11:18:54.3131195Z 	... 15 more
2026-09-25T11:18:54.3131550Z 08:17:08,776 |-ERROR in ch.qos.logback.core.rolling.RollingFileAppender[FILE] - Failed to create parent directories for [/sijur/logs/SIJUR-middleware-backend-v2.log]
2026-09-25T11:18:54.3132026Z 08:17:08,778 |-ERROR in ch.qos.logback.core.rolling.RollingFileAppender[FILE] - openFile(/sijur/logs/SIJUR-middleware-backend-v2.log,true) call failed. java.io.FileNotFoundException: /sijur/logs/SIJUR-middleware-backend-v2.log (No such file or directory)
2026-09-25T11:18:54.3132390Z 	at java.io.FileNotFoundException: /sijur/logs/SIJUR-middleware-backend-v2.log (No such file or directory)
2026-09-25T11:18:54.3132548Z 	at 	at java.base/java.io.FileOutputStream.open0(Native Method)
2026-09-25T11:18:54.3132693Z 	at 	at java.base/java.io.FileOutputStream.open(FileOutputStream.java:289)
2026-09-25T11:18:54.3132863Z 	at 	at java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:230)
2026-09-25T11:18:54.3133061Z 	at 	at ch.qos.logback.core.recovery.ResilientFileOutputStream.<init>(ResilientFileOutputStream.java:26)
2026-09-25T11:18:54.3133307Z 	at 	at ch.qos.logback.core.FileAppender.openFile(FileAppender.java:165)
2026-09-25T11:18:54.3133471Z 	at 	at ch.qos.logback.core.FileAppender.start(FileAppender.java:120)
2026-09-25T11:18:54.3133637Z 	at 	at ch.qos.logback.core.rolling.RollingFileAppender.start(RollingFileAppender.java:104)
2026-09-25T11:18:54.3133833Z 	at 	at org.springframework.boot.logging.logback.LogbackConfigurator.start(LogbackConfigurator.java:111)
2026-09-25T11:18:54.3134038Z 	at 	at org.springframework.boot.logging.logback.LogbackConfigurator.appender(LogbackConfigurator.java:74)
2026-09-25T11:18:54.3134255Z 	at 	at org.springframework.boot.logging.logback.DefaultLogbackConfiguration.fileAppender(DefaultLogbackConfiguration.java:147)
2026-09-25T11:18:54.3134538Z 	at 	at org.springframework.boot.logging.logback.DefaultLogbackConfiguration.apply(DefaultLogbackConfiguration.java:88)
2026-09-25T11:18:54.3134747Z 	at 	at org.springframework.boot.logging.logback.LogbackLoggingSystem.lambda$loadDefaults$1(LogbackLoggingSystem.java:241)
2026-09-25T11:18:54.3134968Z 	at 	at org.springframework.boot.logging.logback.LogbackLoggingSystem.withLoggingSuppressed(LogbackLoggingSystem.java:481)
2026-09-25T11:18:54.3135179Z 	at 	at org.springframework.boot.logging.logback.LogbackLoggingSystem.loadDefaults(LogbackLoggingSystem.java:230)
2026-09-25T11:18:54.3135391Z 	at 	at org.springframework.boot.logging.AbstractLoggingSystem.initializeWithConventions(AbstractLoggingSystem.java:84)
2026-09-25T11:18:54.3135598Z 	at 	at org.springframework.boot.logging.AbstractLoggingSystem.initialize(AbstractLoggingSystem.java:61)
2026-09-25T11:18:54.3135785Z 	at 	at org.springframework.boot.logging.logback.LogbackLoggingSystem.initialize(LogbackLoggingSystem.java:195)
2026-09-25T11:18:54.3136002Z 	at 	at org.springframework.boot.context.logging.LoggingApplicationListener.initializeSystem(LoggingApplicationListener.java:332)
2026-09-25T11:18:54.3136223Z 	at 	at org.springframework.boot.context.logging.LoggingApplicationListener.initialize(LoggingApplicationListener.java:298)
2026-09-25T11:18:54.3136459Z 	at 	at org.springframework.boot.context.logging.LoggingApplicationListener.onApplicationEnvironmentPreparedEvent(LoggingApplicationListener.java:246)
2026-09-25T11:18:54.3136694Z 	at 	at org.springframework.boot.context.logging.LoggingApplicationListener.onApplicationEvent(LoggingApplicationListener.java:223)
2026-09-25T11:18:54.3136926Z 	at 	at org.springframework.context.event.SimpleApplicationEventMulticaster.doInvokeListener(SimpleApplicationEventMulticaster.java:185)
2026-09-25T11:18:54.3137155Z 	at 	at org.springframework.context.event.SimpleApplicationEventMulticaster.invokeListener(SimpleApplicationEventMulticaster.java:178)
2026-09-25T11:18:54.3137389Z 	at 	at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:156)
2026-09-25T11:18:54.3140175Z 	at 	at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:138)
2026-09-25T11:18:54.3140428Z 	at 	at org.springframework.boot.context.event.EventPublishingRunListener.multicastInitialEvent(EventPublishingRunListener.java:136)
2026-09-25T11:18:54.3140735Z 	at 	at org.springframework.boot.context.event.EventPublishingRunListener.environmentPrepared(EventPublishingRunListener.java:81)
2026-09-25T11:18:54.3140961Z 	at 	at org.springframework.boot.SpringApplicationRunListeners.lambda$environmentPrepared$2(SpringApplicationRunListeners.java:64)
2026-09-25T11:18:54.3141149Z 	at 	at java.base/java.lang.Iterable.forEach(Iterable.java:75)
2026-09-25T11:18:54.3141323Z 	at 	at org.springframework.boot.SpringApplicationRunListeners.doWithListeners(SpringApplicationRunListeners.java:118)
2026-09-25T11:18:54.3141541Z 	at 	at org.springframework.boot.SpringApplicationRunListeners.doWithListeners(SpringApplicationRunListeners.java:112)
2026-09-25T11:18:54.3141866Z 	at 	at org.springframework.boot.SpringApplicationRunListeners.environmentPrepared(SpringApplicationRunListeners.java:63)
2026-09-25T11:18:54.3142258Z 	at 	at org.springframework.boot.SpringApplication.prepareEnvironment(SpringApplication.java:353)
2026-09-25T11:18:54.3142529Z 	at 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:313)
2026-09-25T11:18:54.3142770Z 	at 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1361)
2026-09-25T11:18:54.3142947Z 	at 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1350)
2026-09-25T11:18:54.3143137Z 	at 	at br.gov.caixa.sijur.SijurMiddlewareBackendV2Application.main(SijurMiddlewareBackendV2Application.java:60)
2026-09-25T11:18:54.3143346Z 	at 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
2026-09-25T11:18:54.3143597Z 	at 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
2026-09-25T11:18:54.3143755Z 	at 	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:106)
2026-09-25T11:18:54.3144017Z 	at 	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64)
2026-09-25T11:18:54.3144200Z 	at 	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40)
2026-09-25T11:18:54.3144281Z 
2026-09-25T11:18:54.3144431Z   .   ____          _            __ _ _
2026-09-25T11:18:54.3144608Z  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
2026-09-25T11:18:54.3144755Z ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
2026-09-25T11:18:54.3144851Z  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
2026-09-25T11:18:54.3144992Z   '  |____| .__|_| |_|_| |_\__, | / / / /
2026-09-25T11:18:54.3145140Z  =========|_|==============|___/=/_/_/_/
2026-09-25T11:18:54.3145187Z 
2026-09-25T11:18:54.3145329Z  :: Spring Boot ::               (v3.5.16)
2026-09-25T11:18:54.3145381Z 
2026-09-25T11:18:54.3145757Z 2026-09-25T08:17:08.978-03:00  INFO 8 --- [SIJUR-componentes] [           main] .c.s.SijurMiddlewareBackendV2Application : Starting SijurMiddlewareBackendV2Application v2.0.0 using Java 21.0.1 with PID 8 (/deployments/SIJUR-middleware-backend-v2.jar started by 185 in /deployments)
2026-09-25T11:18:54.3146159Z 08:17:08,979 |-WARN in ch.qos.logback.core.rolling.RollingFileAppender[FILE] - Attempted to append to non started appender [FILE].
2026-09-25T11:18:54.3146496Z 2026-09-25T08:17:08.980-03:00  INFO 8 --- [SIJUR-componentes] [           main] .c.s.SijurMiddlewareBackendV2Application : No active profile set, falling back to 1 default profile: "default"
2026-09-25T11:18:54.3146838Z 08:17:08,980 |-WARN in ch.qos.logback.core.rolling.RollingFileAppender[FILE] - Attempted to append to non started appender [FILE].
2026-09-25T11:18:54.3147205Z 2026-09-25T08:17:11.265-03:00  INFO 8 --- [SIJUR-componentes] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Multiple Spring Data modules found, entering strict repository configuration mode
2026-09-25T11:18:54.3147563Z 2026-09-25T08:17:11.266-03:00  INFO 8 --- [SIJUR-componentes] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-09-25T11:18:54.3147937Z 2026-09-25T08:17:11.367-03:00  INFO 8 --- [SIJUR-componentes] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 89 ms. Found 1 JPA repository interface.
2026-09-25T11:18:54.3148317Z 2026-09-25T08:17:12.379-03:00  INFO 8 --- [SIJUR-componentes] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Multiple Spring Data modules found, entering strict repository configuration mode
2026-09-25T11:18:54.3148680Z 2026-09-25T08:17:12.380-03:00  INFO 8 --- [SIJUR-componentes] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data LDAP repositories in DEFAULT mode.
2026-09-25T11:18:54.3149538Z 2026-09-25T08:17:12.393-03:00  INFO 8 --- [SIJUR-componentes] [           main] .RepositoryConfigurationExtensionSupport : Spring Data LDAP - Could not safely identify store assignment for repository candidate interface br.com.sijur.componentes.persistence.jpa.LogRepository; If you want this repository to be a LDAP repository, consider annotating your entities with one of these annotations: org.springframework.ldap.odm.annotations.Entry (preferred), or consider extending one of the following types with your repository: org.springframework.data.ldap.repository.LdapRepository
2026-09-25T11:18:54.3150184Z 2026-09-25T08:17:12.395-03:00  INFO 8 --- [SIJUR-componentes] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 13 ms. Found 0 LDAP repository interfaces.
2026-09-25T11:18:54.3150549Z 2026-09-25T08:17:12.871-03:00  INFO 8 --- [SIJUR-componentes] [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=1bfa7d34-697c-3e78-b73b-0f2fbabd23bd
2026-09-25T11:18:54.3150950Z 2026-09-25T08:17:13.881-03:00  INFO 8 --- [SIJUR-componentes] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-09-25T11:18:54.3151272Z 2026-09-25T08:17:13.894-03:00  INFO 8 --- [SIJUR-componentes] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-09-25T11:18:54.3151611Z 2026-09-25T08:17:13.894-03:00  INFO 8 --- [SIJUR-componentes] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.55]
2026-09-25T11:18:54.3151955Z 2026-09-25T08:17:14.062-03:00  INFO 8 --- [SIJUR-componentes] [           main] c.c.C.[.[.[/SIJUR-middleware-backend-v2] : Initializing Spring embedded WebApplicationContext
2026-09-25T11:18:54.3152301Z 2026-09-25T08:17:14.063-03:00  INFO 8 --- [SIJUR-componentes] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 4972 ms
2026-09-25T11:18:54.3152661Z 2026-09-25T08:17:15.266-03:00  INFO 8 --- [SIJUR-componentes] [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2026-09-25T11:18:54.3152991Z 2026-09-25T08:17:15.377-03:00  INFO 8 --- [SIJUR-componentes] [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.6.53.Final
2026-09-25T11:18:54.3153310Z 2026-09-25T08:17:15.463-03:00  INFO 8 --- [SIJUR-componentes] [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2026-09-25T11:18:54.3153670Z 2026-09-25T08:17:15.961-03:00  INFO 8 --- [SIJUR-componentes] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-09-25T11:18:54.3153993Z 2026-09-25T08:17:15.993-03:00  INFO 8 --- [SIJUR-componentes] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-09-25T11:18:54.3154422Z 2026-09-25T08:17:16.676-03:00  INFO 8 --- [SIJUR-componentes] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection ConnectionID:1 ClientConnectionId: 07cd53e1-8e7f-45d4-8c61-f9725252058e
2026-09-25T11:18:54.3154906Z 2026-09-25T08:17:16.678-03:00  INFO 8 --- [SIJUR-componentes] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2026-09-25T11:18:54.3155231Z 2026-09-25T08:17:16.796-03:00  INFO 8 --- [SIJUR-componentes] [           main] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
2026-09-25T11:18:54.3155482Z 	Database JDBC URL [Connecting through datasource 'HikariDataSource (HikariPool-1)']
2026-09-25T11:18:54.3155626Z 	Database driver: undefined/unknown
2026-09-25T11:18:54.3155725Z 	Database version: 16.0
2026-09-25T11:18:54.3155837Z 	Autocommit mode: undefined/unknown
2026-09-25T11:18:54.3155946Z 	Isolation level: undefined/unknown
2026-09-25T11:18:54.3156059Z 	Minimum pool size: undefined/unknown
2026-09-25T11:18:54.3156161Z 	Maximum pool size: undefined/unknown
2026-09-25T11:18:54.3156516Z 2026-09-25T08:17:17.693-03:00  INFO 8 --- [SIJUR-componentes] [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-09-25T11:18:54.3156911Z 2026-09-25T08:17:17.755-03:00  INFO 8 --- [SIJUR-componentes] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-09-25T11:18:54.3157419Z 2026-09-25T08:17:18.468-03:00  INFO 8 --- [SIJUR-componentes] [           main] o.s.l.c.support.AbstractContextSource    : Property 'userDn' not set - anonymous context will be used for read-only operations
2026-09-25T11:18:54.3157905Z 2026-09-25T08:17:18.770-03:00  WARN 8 --- [SIJUR-componentes] [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-09-25T11:18:54.3158376Z 2026-09-25T08:17:19.783-03:00  INFO 8 --- [SIJUR-componentes] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 8 endpoints beneath base path '/actuator'
2026-09-25T11:18:54.3159065Z 2026-09-25T08:17:20.171-03:00  WARN 8 --- [SIJUR-componentes] [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'logRepository' defined in br.com.sijur.componentes.persistence.jpa.LogRepository defined in @EnableJpaRepositories declared on SijurMiddlewareBackendV2Application: Not a managed type: class br.com.sijur.componentes.model.Log
2026-09-25T11:18:54.3159659Z 2026-09-25T08:17:20.173-03:00  INFO 8 --- [SIJUR-componentes] [           main] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2026-09-25T11:18:54.3160000Z 2026-09-25T08:17:20.177-03:00  INFO 8 --- [SIJUR-componentes] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2026-09-25T11:18:54.3160310Z 2026-09-25T08:17:20.180-03:00  INFO 8 --- [SIJUR-componentes] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
2026-09-25T11:18:54.3160627Z 2026-09-25T08:17:20.182-03:00  INFO 8 --- [SIJUR-componentes] [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2026-09-25T11:18:54.3160905Z 2026-09-25T08:17:20.261-03:00  INFO 8 --- [SIJUR-componentes] [           main] .s.b.a.l.ConditionEvaluationReportLogger : 
2026-09-25T11:18:54.3160987Z 
2026-09-25T11:18:54.3199002Z Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2026-09-25T11:18:54.3200588Z 2026-09-25T08:17:20.281-03:00 ERROR 8 --- [SIJUR-componentes] [           main] o.s.boot.SpringApplication               : Application run failed
2026-09-25T11:18:54.3200692Z 
2026-09-25T11:18:54.3201118Z org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'logRepository' defined in br.com.sijur.componentes.persistence.jpa.LogRepository defined in @EnableJpaRepositories declared on SijurMiddlewareBackendV2Application: Not a managed type: class br.com.sijur.componentes.model.Log
2026-09-25T11:18:54.3201623Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1824) ~[spring-beans-6.2.19.jar!/:6.2.19]
2026-09-25T11:18:54.3202026Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:607) ~[spring-beans-6.2.19.jar!/:6.2.19]
2026-09-25T11:18:54.3202428Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:529) ~[spring-beans-6.2.19.jar!/:6.2.19]
2026-09-25T11:18:54.3202806Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:339) ~[spring-beans-6.2.19.jar!/:6.2.19]
2026-09-25T11:18:54.3203173Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:373) ~[spring-beans-6.2.19.jar!/:6.2.19]
2026-09-25T11:18:54.3203745Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:337) ~[spring-beans-6.2.19.jar!/:6.2.19]
2026-09-25T11:18:54.3204090Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-6.2.19.jar!/:6.2.19]
2026-09-25T11:18:54.3204461Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.instantiateSingleton(DefaultListableBeanFactory.java:1229) ~[spring-beans-6.2.19.jar!/:6.2.19]
2026-09-25T11:18:54.3204852Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingleton(DefaultListableBeanFactory.java:1201) ~[spring-beans-6.2.19.jar!/:6.2.19]
2026-09-25T11:18:54.3205324Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:1130) ~[spring-beans-6.2.19.jar!/:6.2.19]
2026-09-25T11:18:54.3205715Z 	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:991) ~[spring-context-6.2.19.jar!/:6.2.19]
2026-09-25T11:18:54.3206081Z 	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:628) ~[spring-context-6.2.19.jar!/:6.2.19]
2026-09-25T11:18:54.3206446Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.5.16.jar!/:3.5.16]
2026-09-25T11:18:54.3206772Z 	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:752) ~[spring-boot-3.5.16.jar!/:3.5.16]
2026-09-25T11:18:54.3207142Z 	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:439) ~[spring-boot-3.5.16.jar!/:3.5.16]
2026-09-25T11:18:54.3207440Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:318) ~[spring-boot-3.5.16.jar!/:3.5.16]
2026-09-25T11:18:54.3207730Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1361) ~[spring-boot-3.5.16.jar!/:3.5.16]
2026-09-25T11:18:54.3208018Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1350) ~[spring-boot-3.5.16.jar!/:3.5.16]
2026-09-25T11:18:54.3208218Z 	at br.gov.caixa.sijur.SijurMiddlewareBackendV2Application.main(SijurMiddlewareBackendV2Application.java:60) ~[!/:2.0.0]
2026-09-25T11:18:54.3208441Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
2026-09-25T11:18:54.3208625Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
2026-09-25T11:18:54.3208908Z 	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:106) ~[SIJUR-middleware-backend-v2.jar:2.0.0]
2026-09-25T11:18:54.3209277Z 	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64) ~[SIJUR-middleware-backend-v2.jar:2.0.0]
2026-09-25T11:18:54.3209614Z 	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40) ~[SIJUR-middleware-backend-v2.jar:2.0.0]
2026-09-25T11:18:54.3209868Z Caused by: java.lang.IllegalArgumentException: Not a managed type: class br.com.sijur.componentes.model.Log
2026-09-25T11:18:54.3210203Z 	at org.hibernate.metamodel.model.domain.internal.JpaMetamodelImpl.managedType(JpaMetamodelImpl.java:223) ~[hibernate-core-6.6.53.Final.jar!/:6.6.53.Final]
2026-09-25T11:18:54.3210577Z 	at org.hibernate.metamodel.model.domain.internal.MappingMetamodelImpl.managedType(MappingMetamodelImpl.java:470) ~[hibernate-core-6.6.53.Final.jar!/:6.6.53.Final]
2026-09-25T11:18:54.3210944Z 	at org.hibernate.metamodel.model.domain.internal.MappingMetamodelImpl.managedType(MappingMetamodelImpl.java:100) ~[hibernate-core-6.6.53.Final.jar!/:6.6.53.Final]
2026-09-25T11:18:54.3211319Z 	at org.springframework.data.jpa.repository.support.JpaMetamodelEntityInformation.<init>(JpaMetamodelEntityInformation.java:82) ~[spring-data-jpa-3.5.13.jar!/:3.5.13]
2026-09-25T11:18:54.3211701Z 	at org.springframework.data.jpa.repository.support.JpaEntityInformationSupport.getEntityInformation(JpaEntityInformationSupport.java:69) ~[spring-data-jpa-3.5.13.jar!/:3.5.13]
2026-09-25T11:18:54.3212144Z 	at org.springframework.data.jpa.repository.support.JpaRepositoryFactory.getEntityInformation(JpaRepositoryFactory.java:251) ~[spring-data-jpa-3.5.13.jar!/:3.5.13]
2026-09-25T11:18:54.3212520Z 	at org.springframework.data.jpa.repository.support.JpaRepositoryFactory.getTargetRepository(JpaRepositoryFactory.java:215) ~[spring-data-jpa-3.5.13.jar!/:3.5.13]
2026-09-25T11:18:54.3212890Z 	at org.springframework.data.jpa.repository.support.JpaRepositoryFactory.getTargetRepository(JpaRepositoryFactory.java:198) ~[spring-data-jpa-3.5.13.jar!/:3.5.13]
2026-09-25T11:18:54.3213308Z 	at org.springframework.data.jpa.repository.support.JpaRepositoryFactory.getTargetRepository(JpaRepositoryFactory.java:1) ~[spring-data-jpa-3.5.13.jar!/:3.5.13]
2026-09-25T11:18:54.3213673Z 	at org.springframework.data.repository.core.support.RepositoryFactorySupport.getRepository(RepositoryFactorySupport.java:380) ~[spring-data-commons-3.5.13.jar!/:3.5.13]
2026-09-25T11:18:54.3214077Z 	at org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport.lambda$afterPropertiesSet$4(RepositoryFactoryBeanSupport.java:355) ~[spring-data-commons-3.5.13.jar!/:3.5.13]
2026-09-25T11:18:54.3214398Z 	at org.springframework.data.util.Lazy.getNullable(Lazy.java:135) ~[spring-data-commons-3.5.13.jar!/:3.5.13]
2026-09-25T11:18:54.3214672Z 	at org.springframework.data.util.Lazy.get(Lazy.java:113) ~[spring-data-commons-3.5.13.jar!/:3.5.13]
2026-09-25T11:18:54.3215027Z 	at org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport.afterPropertiesSet(RepositoryFactoryBeanSupport.java:361) ~[spring-data-commons-3.5.13.jar!/:3.5.13]
2026-09-25T11:18:54.3215464Z 	at org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean.afterPropertiesSet(JpaRepositoryFactoryBean.java:132) ~[spring-data-jpa-3.5.13.jar!/:3.5.13]
2026-09-25T11:18:54.3215869Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1871) ~[spring-beans-6.2.19.jar!/:6.2.19]
2026-09-25T11:18:54.3216276Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1820) ~[spring-beans-6.2.19.jar!/:6.2.19]
2026-09-25T11:18:54.3216457Z 	... 23 common frames omitted
2026-09-25T11:18:54.3216509Z 
2026-09-25T11:18:54.3231821Z ##[section]Finishing: Logs da Aplicação
